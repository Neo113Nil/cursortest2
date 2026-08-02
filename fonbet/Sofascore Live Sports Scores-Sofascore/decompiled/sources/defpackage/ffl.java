package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ffl {
    public final int a;
    public final gv9 b;

    public ffl(int i, gv9 gv9Var) {
        this.a = i;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffl)) {
            return false;
        }
        ffl fflVar = (ffl) obj;
        return this.a == fflVar.a && this.b.equals(fflVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WorldCupKnockoutRound(type=" + this.a + ", matches=" + this.b + ")";
    }
}
