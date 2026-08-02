package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a37 {
    public final boolean a;
    public final gv9 b;
    public final gv9 c;
    public final eo7 d;
    public final fo1 e;
    public final boolean f;
    public final boolean g;

    public a37(boolean z, gv9 gv9Var, gv9 gv9Var2, eo7 eo7Var, fo1 fo1Var, boolean z2, boolean z3) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = z;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = eo7Var;
        this.e = fo1Var;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a37)) {
            return false;
        }
        a37 a37Var = (a37) obj;
        return this.a == a37Var.a && Intrinsics.c(this.b, a37Var.b) && Intrinsics.c(this.c, a37Var.c) && Intrinsics.c(this.d, a37Var.d) && Intrinsics.c(this.e, a37Var.e) && this.f == a37Var.f && this.g == a37Var.g;
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        eo7 eo7Var = this.d;
        int hashCode = (d + (eo7Var == null ? 0 : eo7Var.hashCode())) * 31;
        fo1 fo1Var = this.e;
        return Boolean.hashCode(this.g) + dmi.e((hashCode + (fo1Var != null ? fo1Var.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyLeaderboardState(isLoading=");
        sb.append(this.a);
        sb.append(", rounds=");
        sb.append(this.b);
        sb.append(", userLeaderboards=");
        sb.append(this.c);
        sb.append(", currentUserLeaderboard=");
        sb.append(this.d);
        sb.append(", selectedRound=");
        sb.append(this.e);
        sb.append(", isLeagueAdmin=");
        sb.append(this.f);
        sb.append(", isHeadToHead=");
        return wt3.p(sb, this.g, ")");
    }
}
