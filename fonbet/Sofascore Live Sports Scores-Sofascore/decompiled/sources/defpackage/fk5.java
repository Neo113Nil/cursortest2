package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fk5 {
    public final dk5 a;
    public final ek5 b;
    public final ek5 c;
    public final ek5 d;

    public fk5(dk5 dk5Var, ek5 ek5Var, ek5 ek5Var2, ek5 ek5Var3) {
        this.a = dk5Var;
        this.b = ek5Var;
        this.c = ek5Var2;
        this.d = ek5Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk5)) {
            return false;
        }
        fk5 fk5Var = (fk5) obj;
        return this.a.equals(fk5Var.a) && this.b.equals(fk5Var.b) && this.c.equals(fk5Var.c) && this.d.equals(fk5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return fk5.class.getSimpleName() + ":{animationBackground=" + this.a + ", openAnimation=" + this.b + ", closeAnimation=" + this.c + ", changeAnimation=" + this.d + " }";
    }
}
