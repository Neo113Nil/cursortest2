package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sxa {
    public final int a;
    public final gv9 b;
    public final gv9 c;
    public final rxa d;
    public final boolean e;
    public final ec9 f;

    static {
        ypa.a(ysa.c, new ila(12));
    }

    public sxa(int i, gv9 gv9Var, gv9 gv9Var2, rxa rxaVar, ec9 ec9Var, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? rlh.b : gv9Var, gv9Var2, (i2 & 8) != 0 ? null : rxaVar, false, (i2 & 32) != 0 ? null : ec9Var);
    }

    public static sxa a(sxa sxaVar, gv9 gv9Var, gv9 gv9Var2, rxa rxaVar, boolean z, ec9 ec9Var, int i) {
        gv9 gv9Var3 = gv9Var;
        int i2 = sxaVar.a;
        if ((i & 2) != 0) {
            gv9Var3 = sxaVar.b;
        }
        if ((i & 4) != 0) {
            gv9Var2 = sxaVar.c;
        }
        if ((i & 8) != 0) {
            rxaVar = sxaVar.d;
        }
        if ((i & 16) != 0) {
            z = sxaVar.e;
        }
        if ((i & 32) != 0) {
            ec9Var = sxaVar.f;
        }
        ec9 ec9Var2 = ec9Var;
        sxaVar.getClass();
        gv9Var3.getClass();
        gv9Var2.getClass();
        boolean z2 = z;
        rxa rxaVar2 = rxaVar;
        return new sxa(i2, gv9Var3, gv9Var2, rxaVar2, z2, ec9Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxa)) {
            return false;
        }
        sxa sxaVar = (sxa) obj;
        return this.a == sxaVar.a && Intrinsics.c(this.b, sxaVar.b) && Intrinsics.c(this.c, sxaVar.c) && Intrinsics.c(this.d, sxaVar.d) && this.e == sxaVar.e && Intrinsics.c(this.f, sxaVar.f);
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        rxa rxaVar = this.d;
        int e = dmi.e((d + (rxaVar == null ? 0 : rxaVar.hashCode())) * 31, 31, this.e);
        ec9 ec9Var = this.f;
        return e + (ec9Var != null ? ec9Var.hashCode() : 0);
    }

    public final String toString() {
        return "LeagueHistoricalDataModel(uniqueTournamentId=" + this.a + ", seasons=" + this.b + ", teamPlayerStats=" + this.c + ", selectedSeason=" + this.d + ", isLoading=" + this.e + ", finalGame=" + this.f + ")";
    }

    public sxa(int i, gv9 gv9Var, gv9 gv9Var2, rxa rxaVar, boolean z, ec9 ec9Var) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = rxaVar;
        this.e = z;
        this.f = ec9Var;
    }
}
