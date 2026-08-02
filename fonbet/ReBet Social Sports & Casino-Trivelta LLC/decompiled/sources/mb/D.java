package mb;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Class f56424a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f56425b;

    public @interface a {
    }

    public D(Class cls, Class cls2) {
        this.f56424a = cls;
        this.f56425b = cls2;
    }

    public static D a(Class cls, Class cls2) {
        return new D(cls, cls2);
    }

    public static D b(Class cls) {
        return new D(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f56425b.equals(d10.f56425b)) {
            return this.f56424a.equals(d10.f56424a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f56425b.hashCode() * 31) + this.f56424a.hashCode();
    }

    public String toString() {
        if (this.f56424a == a.class) {
            return this.f56425b.getName();
        }
        return "@" + this.f56424a.getName() + " " + this.f56425b.getName();
    }
}
