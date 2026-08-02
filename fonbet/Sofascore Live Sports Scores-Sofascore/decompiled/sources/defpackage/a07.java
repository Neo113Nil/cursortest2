package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a07 {
    public final gv9 a;
    public final gv9 b;
    public final int c;
    public final int d;

    public a07(gv9 gv9Var, gv9 gv9Var2, int i, int i2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a07)) {
            return false;
        }
        a07 a07Var = (a07) obj;
        return Intrinsics.c(this.a, a07Var.a) && Intrinsics.c(this.b, a07Var.b) && this.c == a07Var.c && this.d == a07Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, ljg.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return me4.i(wv8.l("FantasyFormAndFixturesWrapper(form=", this.a, ", fixtures=", this.b, ", formWeightSum="), this.c, ", fixturesWeightSum=", this.d, ")");
    }
}
