package x0;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6774c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f67817a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f67818b;

    public C6774c(Object obj, Object obj2) {
        this.f67817a = obj;
        this.f67818b = obj2;
    }

    public static C6774c a(Object obj, Object obj2) {
        return new C6774c(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6774c)) {
            return false;
        }
        C6774c c6774c = (C6774c) obj;
        return AbstractC6773b.a(c6774c.f67817a, this.f67817a) && AbstractC6773b.a(c6774c.f67818b, this.f67818b);
    }

    public int hashCode() {
        Object obj = this.f67817a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f67818b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f67817a + " " + this.f67818b + "}";
    }
}
