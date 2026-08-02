package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jjh {
    public static final jjh c;
    public final s02 a;
    public final s02 b;

    static {
        w25 w25Var = w25.j;
        c = new jjh(w25Var, w25Var);
    }

    public jjh(s02 s02Var, s02 s02Var2) {
        this.a = s02Var;
        this.b = s02Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjh)) {
            return false;
        }
        jjh jjhVar = (jjh) obj;
        return this.a.equals(jjhVar.a) && this.b.equals(jjhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
