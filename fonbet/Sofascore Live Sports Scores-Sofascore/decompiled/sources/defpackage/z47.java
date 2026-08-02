package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z47 {
    public final gv9 a;
    public final mj7 b;
    public final t77 c;
    public final gv9 d;
    public final boolean e;

    public z47(gv9 gv9Var, mj7 mj7Var, t77 t77Var, gv9 gv9Var2, boolean z) {
        gv9Var.getClass();
        mj7Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = mj7Var;
        this.c = t77Var;
        this.d = gv9Var2;
        this.e = z;
    }

    public static z47 a(z47 z47Var, mj7 mj7Var, t77 t77Var, gv9 gv9Var, boolean z, int i) {
        mj7 mj7Var2 = mj7Var;
        gv9 gv9Var2 = z47Var.a;
        if ((i & 2) != 0) {
            mj7Var2 = z47Var.b;
        }
        if ((i & 4) != 0) {
            t77Var = z47Var.c;
        }
        if ((i & 8) != 0) {
            gv9Var = z47Var.d;
        }
        gv9Var2.getClass();
        mj7Var2.getClass();
        gv9Var.getClass();
        gv9 gv9Var3 = gv9Var;
        return new z47(gv9Var2, mj7Var2, t77Var, gv9Var3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z47)) {
            return false;
        }
        z47 z47Var = (z47) obj;
        return Intrinsics.c(this.a, z47Var.a) && Intrinsics.c(this.b, z47Var.b) && Intrinsics.c(this.c, z47Var.c) && Intrinsics.c(this.d, z47Var.d) && this.e == z47Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        t77 t77Var = this.c;
        return Boolean.hashCode(this.e) + ljg.d((hashCode + (t77Var == null ? 0 : t77Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyLeagueMatchupsState(rounds=");
        sb.append(this.a);
        sb.append(", selectedRound=");
        sb.append(this.b);
        sb.append(", yourMatchup=");
        sb.append(this.c);
        sb.append(", leagueMatchups=");
        sb.append(this.d);
        sb.append(", loadingMatchups=");
        return wt3.p(sb, this.e, ")");
    }
}
