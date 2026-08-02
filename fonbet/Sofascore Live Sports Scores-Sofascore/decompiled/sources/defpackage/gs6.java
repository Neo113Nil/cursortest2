package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gs6 {
    public final boolean a;
    public final do7 b;
    public final gv9 c;
    public final gv9 d;
    public final int e;
    public final int f;

    public gs6(boolean z, do7 do7Var, gv9 gv9Var, gv9 gv9Var2, int i, int i2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = z;
        this.b = do7Var;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = i;
        this.f = i2;
    }

    public static gs6 a(gs6 gs6Var, gv9 gv9Var, gv9 gv9Var2, int i, int i2, int i3) {
        boolean z = gs6Var.a;
        do7 do7Var = gs6Var.b;
        if ((i3 & 8) != 0) {
            gv9Var2 = gs6Var.d;
        }
        gv9 gv9Var3 = gv9Var2;
        if ((i3 & 16) != 0) {
            i = gs6Var.e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = gs6Var.f;
        }
        gs6Var.getClass();
        gv9Var.getClass();
        gv9Var3.getClass();
        return new gs6(z, do7Var, gv9Var, gv9Var3, i4, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs6)) {
            return false;
        }
        gs6 gs6Var = (gs6) obj;
        return this.a == gs6Var.a && Intrinsics.c(this.b, gs6Var.b) && Intrinsics.c(this.c, gs6Var.c) && Intrinsics.c(this.d, gs6Var.d) && this.e == gs6Var.e && this.f == gs6Var.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        do7 do7Var = this.b;
        return Integer.hashCode(this.f) + wv8.a(this.e, ljg.d(ljg.d((hashCode + (do7Var == null ? 0 : do7Var.hashCode())) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyCompetitionLeaguesState(isLoading=");
        sb.append(this.a);
        sb.append(", userCompetition=");
        sb.append(this.b);
        sb.append(", privateLeagues=");
        vxd.u(sb, this.c, ", publicLeagues=", this.d, ", privateLeaguesCreated=");
        return me4.i(sb, this.e, ", randomLeaguesJoined=", this.f, ")");
    }
}
