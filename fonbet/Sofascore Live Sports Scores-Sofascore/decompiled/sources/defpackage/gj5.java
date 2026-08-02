package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gj5 {
    public final int a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final Integer p;
    public final String q;
    public final Integer r;
    public final String s;
    public final String t;
    public final gv9 u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public gj5(int i, String str, String str2, Integer num, Integer num2, String str3, String str4, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, Integer num3, String str7, Integer num4, String str8, String str9, gv9 gv9Var, String str10, boolean z6, boolean z7, boolean z8, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        boolean z9 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z;
        boolean z10 = (i3 & 512) != 0 ? false : z2;
        boolean z11 = (i3 & 1024) != 0 ? false : z3;
        boolean z12 = (i3 & a.o) != 0 ? false : z4;
        boolean z13 = (i3 & 4096) != 0 ? false : z5;
        String str11 = (i3 & 8192) != 0 ? null : str5;
        String str12 = (i3 & 16384) != 0 ? null : str6;
        Integer num5 = (32768 & i3) != 0 ? null : num3;
        String str13 = (65536 & i3) != 0 ? null : str7;
        Integer num6 = (131072 & i3) != 0 ? null : num4;
        String str14 = (262144 & i3) != 0 ? null : str8;
        String str15 = (i3 & 524288) != 0 ? null : str9;
        gv9 gv9Var2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : gv9Var;
        String str16 = (i3 & 2097152) != 0 ? null : str10;
        boolean z14 = (i3 & 4194304) != 0 ? false : z6;
        boolean z15 = (i3 & 8388608) != 0 ? false : z7;
        boolean z16 = (i3 & 33554432) != 0 ? false : z8;
        this.a = i4;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = str3;
        this.g = str4;
        this.h = i2;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = str11;
        this.o = str12;
        this.p = num5;
        this.q = str13;
        this.r = num6;
        this.s = str14;
        this.t = str15;
        this.u = gv9Var2;
        this.v = str16;
        this.w = z14;
        this.x = z15;
        this.y = z16;
    }

    public final boolean a() {
        return !(this.d == null || this.e == null) || this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj5)) {
            return false;
        }
        gj5 gj5Var = (gj5) obj;
        return this.a == gj5Var.a && Intrinsics.c(this.b, gj5Var.b) && Intrinsics.c(this.c, gj5Var.c) && Intrinsics.c(this.d, gj5Var.d) && Intrinsics.c(this.e, gj5Var.e) && Intrinsics.c(this.f, gj5Var.f) && Intrinsics.c(this.g, gj5Var.g) && this.h == gj5Var.h && this.i == gj5Var.i && this.j == gj5Var.j && this.k == gj5Var.k && this.l == gj5Var.l && this.m == gj5Var.m && Intrinsics.c(this.n, gj5Var.n) && Intrinsics.c(this.o, gj5Var.o) && Intrinsics.c(this.p, gj5Var.p) && Intrinsics.c(this.q, gj5Var.q) && Intrinsics.c(this.r, gj5Var.r) && Intrinsics.c(this.s, gj5Var.s) && Intrinsics.c(this.t, gj5Var.t) && Intrinsics.c(this.u, gj5Var.u) && Intrinsics.c(this.v, gj5Var.v) && this.w == gj5Var.w && this.x == gj5Var.x && this.y == gj5Var.y;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int e = dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(wv8.a(this.h, (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str5 = this.n;
        int hashCode7 = (e + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.p;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.q;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.r;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.s;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.t;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        gv9 gv9Var = this.u;
        int hashCode14 = (hashCode13 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        String str10 = this.v;
        return Boolean.hashCode(this.y) + dmi.e(dmi.e(dmi.e((hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.w), 31, this.x), 31, false);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "EliminationBlock(order=", ", homeTeam=", this.b, ", awayTeam=");
        me4.o(this.d, this.c, ", homeTeamId=", ", awayTeamId=", t);
        vxd.s(this.e, ", homeScore=", this.f, ", awayScore=", t);
        w1l.q(this.h, this.g, ", winnerCode=", ", homeBye=", t);
        vxd.t(", awayBye=", ", hasPreviousBlock=", t, this.i, this.j);
        vxd.t(", finished=", ", inProgress=", t, this.k, this.l);
        t.append(this.m);
        t.append(", result=");
        t.append(this.n);
        t.append(", homeSeed=");
        me4.o(this.p, this.o, ", homeSeedColor=", ", awaySeed=", t);
        me4.o(this.r, this.q, ", awaySeedColor=", ", venueName=", t);
        bf3.v(t, this.s, ", venueCountry=", this.t, ", eventIds=");
        t.append(this.u);
        t.append(", startDate=");
        t.append(this.v);
        t.append(", isFinal=");
        vxd.t(", isThirdPlace=", ", automaticProgression=false, forceShow=", t, this.w, this.x);
        return wt3.p(t, this.y, ")");
    }
}
