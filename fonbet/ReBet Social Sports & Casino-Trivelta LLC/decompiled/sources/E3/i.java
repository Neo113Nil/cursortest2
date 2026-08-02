package E3;

import x0.C6774c;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f2998a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2999b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(Object obj, Object obj2) {
        this.f2998a = obj;
        this.f2999b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6774c)) {
            return false;
        }
        C6774c c6774c = (C6774c) obj;
        return a(c6774c.f67817a, this.f2998a) && a(c6774c.f67818b, this.f2999b);
    }

    public int hashCode() {
        Object obj = this.f2998a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2999b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2998a + " " + this.f2999b + "}";
    }
}
