package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hr6 {
    public final do7 a;
    public final boolean b;
    public final ho7 c;
    public final mj7 d;
    public final mj7 e;
    public final sd7 f;
    public final gv9 g;
    public final gv9 h;
    public final gv9 i;
    public final gv9 j;
    public final gv9 k;
    public final gv9 l;
    public final Integer m;
    public final nl7 n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final j67 r;
    public final boolean s;
    public final boolean t;

    public hr6(do7 do7Var, boolean z, ho7 ho7Var, mj7 mj7Var, mj7 mj7Var2, sd7 sd7Var, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, gv9 gv9Var6, Integer num, nl7 nl7Var, boolean z2, boolean z3, boolean z4, j67 j67Var, boolean z5, boolean z6) {
        this.a = do7Var;
        this.b = z;
        this.c = ho7Var;
        this.d = mj7Var;
        this.e = mj7Var2;
        this.f = sd7Var;
        this.g = gv9Var;
        this.h = gv9Var2;
        this.i = gv9Var3;
        this.j = gv9Var4;
        this.k = gv9Var5;
        this.l = gv9Var6;
        this.m = num;
        this.n = nl7Var;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = j67Var;
        this.s = z5;
        this.t = z6;
    }

    public static hr6 a(hr6 hr6Var, do7 do7Var, ho7 ho7Var, mj7 mj7Var, mj7 mj7Var2, sd7 sd7Var, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, gv9 gv9Var6, Integer num, nl7 nl7Var, boolean z, boolean z2, j67 j67Var, boolean z3, boolean z4, int i) {
        do7 do7Var2 = (i & 1) != 0 ? hr6Var.a : do7Var;
        boolean z5 = (i & 2) != 0 ? hr6Var.b : false;
        ho7 ho7Var2 = (i & 4) != 0 ? hr6Var.c : ho7Var;
        mj7 mj7Var3 = (i & 8) != 0 ? hr6Var.d : mj7Var;
        mj7 mj7Var4 = (i & 16) != 0 ? hr6Var.e : mj7Var2;
        sd7 sd7Var2 = (i & 32) != 0 ? hr6Var.f : sd7Var;
        gv9 gv9Var7 = (i & 64) != 0 ? hr6Var.g : gv9Var;
        gv9 gv9Var8 = (i & 128) != 0 ? hr6Var.h : gv9Var2;
        gv9 gv9Var9 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? hr6Var.i : gv9Var3;
        gv9 gv9Var10 = (i & 512) != 0 ? hr6Var.j : gv9Var4;
        gv9 gv9Var11 = (i & 1024) != 0 ? hr6Var.k : gv9Var5;
        gv9 gv9Var12 = (i & a.o) != 0 ? hr6Var.l : gv9Var6;
        Integer num2 = (i & 4096) != 0 ? hr6Var.m : num;
        nl7 nl7Var2 = (i & 8192) != 0 ? hr6Var.n : nl7Var;
        boolean z6 = (i & 16384) != 0 ? hr6Var.o : false;
        boolean z7 = (32768 & i) != 0 ? hr6Var.p : z;
        boolean z8 = (65536 & i) != 0 ? hr6Var.q : z2;
        j67 j67Var2 = (131072 & i) != 0 ? hr6Var.r : j67Var;
        boolean z9 = (262144 & i) != 0 ? hr6Var.s : z3;
        boolean z10 = (i & 524288) != 0 ? hr6Var.t : z4;
        hr6Var.getClass();
        do7Var2.getClass();
        return new hr6(do7Var2, z5, ho7Var2, mj7Var3, mj7Var4, sd7Var2, gv9Var7, gv9Var8, gv9Var9, gv9Var10, gv9Var11, gv9Var12, num2, nl7Var2, z6, z7, z8, j67Var2, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr6)) {
            return false;
        }
        hr6 hr6Var = (hr6) obj;
        return this.a.equals(hr6Var.a) && this.b == hr6Var.b && Intrinsics.c(this.c, hr6Var.c) && Intrinsics.c(this.d, hr6Var.d) && Intrinsics.c(this.e, hr6Var.e) && this.f == hr6Var.f && Intrinsics.c(this.g, hr6Var.g) && Intrinsics.c(this.h, hr6Var.h) && Intrinsics.c(this.i, hr6Var.i) && Intrinsics.c(this.j, hr6Var.j) && Intrinsics.c(this.k, hr6Var.k) && Intrinsics.c(this.l, hr6Var.l) && Intrinsics.c(this.m, hr6Var.m) && Intrinsics.c(this.n, hr6Var.n) && this.o == hr6Var.o && this.p == hr6Var.p && this.q == hr6Var.q && Intrinsics.c(this.r, hr6Var.r) && this.s == hr6Var.s && this.t == hr6Var.t;
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 31, 31, this.b);
        ho7 ho7Var = this.c;
        int hashCode = (e + (ho7Var == null ? 0 : ho7Var.hashCode())) * 31;
        mj7 mj7Var = this.d;
        int hashCode2 = (hashCode + (mj7Var == null ? 0 : mj7Var.hashCode())) * 31;
        mj7 mj7Var2 = this.e;
        int hashCode3 = (hashCode2 + (mj7Var2 == null ? 0 : mj7Var2.hashCode())) * 31;
        sd7 sd7Var = this.f;
        int hashCode4 = (hashCode3 + (sd7Var == null ? 0 : sd7Var.hashCode())) * 31;
        gv9 gv9Var = this.g;
        int hashCode5 = (hashCode4 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.h;
        int hashCode6 = (hashCode5 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31;
        gv9 gv9Var3 = this.i;
        int hashCode7 = (hashCode6 + (gv9Var3 == null ? 0 : gv9Var3.hashCode())) * 31;
        gv9 gv9Var4 = this.j;
        int hashCode8 = (hashCode7 + (gv9Var4 == null ? 0 : gv9Var4.hashCode())) * 31;
        gv9 gv9Var5 = this.k;
        int hashCode9 = (hashCode8 + (gv9Var5 == null ? 0 : gv9Var5.hashCode())) * 31;
        gv9 gv9Var6 = this.l;
        int hashCode10 = (hashCode9 + (gv9Var6 == null ? 0 : gv9Var6.hashCode())) * 31;
        Integer num = this.m;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        nl7 nl7Var = this.n;
        int e2 = dmi.e(dmi.e(dmi.e((hashCode11 + (nl7Var == null ? 0 : nl7Var.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q);
        j67 j67Var = this.r;
        return Boolean.hashCode(this.t) + dmi.e((e2 + (j67Var != null ? j67Var.hashCode() : 0)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyCompetitionHomeState(userCompetition=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", pointsDisplayRound=");
        sb.append(this.c);
        sb.append(", deadlineDisplayRound=");
        sb.append(this.d);
        sb.append(", firstNotLockedRound=");
        sb.append(this.e);
        sb.append(", missingType=");
        sb.append(this.f);
        sb.append(", scoreTopPlayers=");
        vxd.u(sb, this.g, ", averageTopPlayers=", this.h, ", recentPriceChanges=");
        vxd.u(sb, this.i, ", newsArticles=", this.j, ", roundTopPlayers=");
        vxd.u(sb, this.k, ", fixturesByLeague=", this.l, ", playersLeftToPlay=");
        sb.append(this.m);
        sb.append(", teamOfTheRound=");
        sb.append(this.n);
        sb.append(", showLearnHowToPlayBubble=");
        vxd.t(", showOfficialPartnerSplash=", ", showBrandingSplash=", sb, this.o, this.p);
        sb.append(this.q);
        sb.append(", globalLeague=");
        sb.append(this.r);
        sb.append(", hasMultipleLeagues=");
        return w1l.i(", manualRefresh=", ")", sb, this.s, this.t);
    }
}
