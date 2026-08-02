package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vy4 implements oz4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public vy4(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy4)) {
            return false;
        }
        vy4 vy4Var = (vy4) obj;
        return this.a == vy4Var.a && this.b == vy4Var.b && this.c == vy4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(w1l.k("DeleteAppData(keepMccAndRegion=", this.a, ", keepExperiment=", this.b, ", keepDevOptions="), this.c, ")");
    }
}
