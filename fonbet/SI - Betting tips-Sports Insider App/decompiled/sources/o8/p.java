package o8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f21137a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f21138b;

    public p(Class cls, Class cls2) {
        this.f21137a = cls;
        this.f21138b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f21138b.equals(pVar.f21138b)) {
            return this.f21137a.equals(pVar.f21137a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21137a.hashCode() + (this.f21138b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f21138b;
        Class cls2 = this.f21137a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
