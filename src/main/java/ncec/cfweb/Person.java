
package ncec.cfweb;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

/**
 *
 * @author DantalioNxxi
 */
@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
    private Gender gender;

    @Transient
    EnumSet<Position> career;//under the question
    
//    HashMap<String, EnumSet<Position>> films;
//    Set<Movie> films;
    
//    ManyToMany
    @Transient
    private Set<Personage> personages;
    
//    by position or ManyToMany?
    @Transient
    private Set<Movie> movies;

    public Person() {
    }

    public Person(Gender gender, String firstname, String lastname, int age) {
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
//    public void setMovie(String name, EnumSet<Position> roles){
//        films.put(name, roles);
//        career.addAll(roles);
//    }
//    
//    public void addRole(Position role){
//        career.add(role);
//    }
    
    
}
