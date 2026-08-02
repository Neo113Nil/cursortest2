package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cq9 {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final gv9 d;
    public final gv9 e;
    public final gv9 f;

    public cq9(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, gv9 gv9Var6) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = gv9Var4;
        this.e = gv9Var5;
        this.f = gv9Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq9)) {
            return false;
        }
        cq9 cq9Var = (cq9) obj;
        return Intrinsics.c(this.a, cq9Var.a) && Intrinsics.c(this.b, cq9Var.b) && Intrinsics.c(this.c, cq9Var.c) && Intrinsics.c(this.d, cq9Var.d) && Intrinsics.c(this.e, cq9Var.e) && Intrinsics.c(this.f, cq9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ljg.d(ljg.d(ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder l = wv8.l("IceHockeySquadDepthChart(forwards=", this.a, ", defenders=", this.b, ", firstPowerPlay=");
        vxd.u(l, this.c, ", secondPowerPlay=", this.d, ", goalies=");
        l.append(this.e);
        l.append(", injuriesAndSuspensions=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }
}
