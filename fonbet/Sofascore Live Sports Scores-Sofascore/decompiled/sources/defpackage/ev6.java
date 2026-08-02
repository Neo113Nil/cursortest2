package defpackage;

import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ev6 implements Serializable {
    public final boolean A;
    public final Integer B;
    public final String C;
    public final BrandingFantasyCompetition D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final long K;
    public final long L;
    public final int a;
    public final String b;
    public final int c;
    public final FantasyCompetitionType d;
    public final String e;
    public final int f;
    public final Integer g;
    public final String h;
    public final mj7 i;
    public final mj7 j;
    public final mj7 k;
    public final Integer l;
    public final Integer m;
    public final int n;
    public final long o;
    public final int p;
    public final Long q;
    public final int r;
    public final int s;
    public final long t;
    public final String u;
    public final float v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public ev6(int i, String str, int i2, FantasyCompetitionType fantasyCompetitionType, String str2, int i3, Integer num, String str3, mj7 mj7Var, mj7 mj7Var2, mj7 mj7Var3, Integer num2, Integer num3, int i4, long j, int i5, Long l, int i6, int i7, long j2, String str4, float f, boolean z, boolean z2, boolean z3, String str5, boolean z4, Integer num4, String str6, BrandingFantasyCompetition brandingFantasyCompetition, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, long j3, long j4) {
        str.getClass();
        fantasyCompetitionType.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = fantasyCompetitionType;
        this.e = str2;
        this.f = i3;
        this.g = num;
        this.h = str3;
        this.i = mj7Var;
        this.j = mj7Var2;
        this.k = mj7Var3;
        this.l = num2;
        this.m = num3;
        this.n = i4;
        this.o = j;
        this.p = i5;
        this.q = l;
        this.r = i6;
        this.s = i7;
        this.t = j2;
        this.u = str4;
        this.v = f;
        this.w = z;
        this.x = z2;
        this.y = z3;
        this.z = str5;
        this.A = z4;
        this.B = num4;
        this.C = str6;
        this.D = brandingFantasyCompetition;
        this.E = z5;
        this.F = z6;
        this.G = z7;
        this.H = z8;
        this.I = z9;
        this.J = z10;
        this.K = j3;
        this.L = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev6)) {
            return false;
        }
        ev6 ev6Var = (ev6) obj;
        return this.a == ev6Var.a && Intrinsics.c(this.b, ev6Var.b) && this.c == ev6Var.c && this.d == ev6Var.d && Intrinsics.c(this.e, ev6Var.e) && this.f == ev6Var.f && Intrinsics.c(this.g, ev6Var.g) && Intrinsics.c(this.h, ev6Var.h) && this.i.equals(ev6Var.i) && Intrinsics.c(this.j, ev6Var.j) && Intrinsics.c(this.k, ev6Var.k) && Intrinsics.c(this.l, ev6Var.l) && Intrinsics.c(this.m, ev6Var.m) && this.n == ev6Var.n && this.o == ev6Var.o && this.p == ev6Var.p && Intrinsics.c(this.q, ev6Var.q) && this.r == ev6Var.r && this.s == ev6Var.s && this.t == ev6Var.t && Intrinsics.c(this.u, ev6Var.u) && Float.compare(this.v, ev6Var.v) == 0 && this.w == ev6Var.w && this.x == ev6Var.x && this.y == ev6Var.y && Intrinsics.c(this.z, ev6Var.z) && this.A == ev6Var.A && Intrinsics.c(this.B, ev6Var.B) && Intrinsics.c(this.C, ev6Var.C) && Intrinsics.c(this.D, ev6Var.D) && this.E == ev6Var.E && this.F == ev6Var.F && this.G == ev6Var.G && this.H == ev6Var.H && this.I == ev6Var.I && this.J == ev6Var.J && this.K == ev6Var.K && this.L == ev6Var.L;
    }

    public final int hashCode() {
        int a = wv8.a(this.f, dmi.c((this.d.hashCode() + wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31, 31, this.e), 31);
        Integer num = this.g;
        int hashCode = (this.i.hashCode() + dmi.c((a + (num == null ? 0 : num.hashCode())) * 31, 31, this.h)) * 31;
        mj7 mj7Var = this.j;
        int hashCode2 = (hashCode + (mj7Var == null ? 0 : mj7Var.hashCode())) * 31;
        mj7 mj7Var2 = this.k;
        int hashCode3 = (hashCode2 + (mj7Var2 == null ? 0 : mj7Var2.hashCode())) * 31;
        Integer num2 = this.l;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.m;
        int a2 = wv8.a(this.p, ljg.c(wv8.a(this.n, (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31, 31), 31, this.o), 31);
        Long l = this.q;
        int e = dmi.e(dmi.e(dmi.e(fc6.a(this.v, dmi.c(ljg.c(wv8.a(this.s, wv8.a(this.r, (a2 + (l == null ? 0 : l.hashCode())) * 31, 31), 31), 31, this.t), 31, this.u), 31), 31, this.w), 31, this.x), 31, this.y);
        String str = this.z;
        int e2 = dmi.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.A);
        Integer num4 = this.B;
        int hashCode5 = (e2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.C;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BrandingFantasyCompetition brandingFantasyCompetition = this.D;
        return Long.hashCode(this.L) + ljg.c(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e((hashCode6 + (brandingFantasyCompetition != null ? brandingFantasyCompetition.hashCode() : 0)) * 31, 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyCompetitionUiModel(categoryId=", ", categoryName=", this.b, ", id=");
        t.append(this.c);
        t.append(", type=");
        t.append(this.d);
        t.append(", name=");
        w1l.q(this.f, this.e, ", color=", ", tournamentId=", t);
        vxd.s(this.g, ", sport=", this.h, ", currentRound=", t);
        t.append(this.i);
        t.append(", nextRound=");
        t.append(this.j);
        t.append(", previousRound=");
        t.append(this.k);
        t.append(", previousRoundId=");
        t.append(this.l);
        t.append(", nextRoundId=");
        t.append(this.m);
        t.append(", currentRoundId=");
        t.append(this.n);
        t.append(", currentRoundDeadline=");
        t.append(this.o);
        t.append(", currentMaxPlayerFromSameTeam=");
        t.append(this.p);
        t.append(", lastUpdatedTimestamp=");
        t.append(this.q);
        t.append(", currentRoundSequence=");
        t.append(this.r);
        wt3.u(this.s, ", totalRounds=", ", playerCount=", t);
        t.append(this.t);
        t.append(", rules=");
        t.append(this.u);
        t.append(", averageScore=");
        t.append(this.v);
        t.append(", isFinished=");
        t.append(this.w);
        fn0.y(", isAlpha=", ", isOfficialCompetition=", t, this.x, this.y);
        t.append(", officialPartnerName=");
        t.append(this.z);
        t.append(", assetsRestricted=");
        t.append(this.A);
        fn0.x(this.B, ", globalLeagueId=", ", seasonYear=", this.C, t);
        t.append(", branding=");
        t.append(this.D);
        t.append(", tripleCaptainAllowed=");
        t.append(this.E);
        fn0.y(", wildcardAllowed=", ", freeHitAllowed=", t, this.F, this.G);
        fn0.y(", tripleCaptainRenews=", ", freeHitRenews=", t, this.H, this.I);
        t.append(", wildcardRenews=");
        t.append(this.J);
        t.append(", startTimestamp=");
        t.append(this.K);
        return fn0.l(this.L, ", endTimestamp=", ")", t);
    }
}
