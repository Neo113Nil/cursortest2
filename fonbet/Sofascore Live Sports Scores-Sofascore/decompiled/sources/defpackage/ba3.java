package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ba3 {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ba3(int i, String str, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static ba3 a(ba3 ba3Var, boolean z) {
        return new ba3(ba3Var.a, ba3Var.b, z, ba3Var.d, ba3Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba3)) {
            return false;
        }
        ba3 ba3Var = (ba3) obj;
        return this.a == ba3Var.a && this.b.equals(ba3Var.b) && this.c == ba3Var.c && this.d == ba3Var.d && this.e == ba3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "UniqueTournamentUiModel(id=", ", translatedName=", this.b, ", isPinned=");
        vxd.t(", isActive=", ", showLogo=", t, this.c, this.d);
        return wt3.p(t, this.e, ")");
    }
}
