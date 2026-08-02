package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g79 {
    public final t02 a;
    public final f79 b;
    public final ue8 c;

    public g79(t02 t02Var, f79 f79Var, ue8 ue8Var) {
        this.a = t02Var;
        this.b = f79Var;
        this.c = ue8Var;
        if (t02Var.b() == 0 && t02Var.a() == 0) {
            a70.p("Bounds must be non zero");
            throw null;
        }
        if (t02Var.a == 0 || t02Var.b == 0) {
            return;
        }
        a70.p("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (g79.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            g79 g79Var = (g79) obj;
            return this.a.equals(g79Var.a) && this.b == g79Var.b && this.c == g79Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return g79.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
