public class Person {
    
    public String name;
    public String gender;
    
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void speack() {
        System.out.println("私の名前は" + this.name + "です。");
    }
}
