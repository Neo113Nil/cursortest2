package defpackage;

import com.sofascore.model.mvvm.model.StatusKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wn1 {
    public static final joa v;
    public static final joa w;
    public static final joa x;
    public static final joa y;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final boolean n;
    public final boolean o;
    public final long p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final Integer u;

    static {
        ym1 ym1Var = new ym1(27);
        ysa ysaVar = ysa.c;
        v = ypa.a(ysaVar, ym1Var);
        w = ypa.a(ysaVar, new ym1(28));
        x = ypa.a(ysaVar, new ym1(29));
        y = ypa.a(ysaVar, new vn1(0));
    }

    public wn1(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, long j, String str7, String str8, String str9, String str10, Integer num5) {
        me4.p(str, str4, str7);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = num;
        this.k = num2;
        this.l = num3;
        this.m = num4;
        this.n = z;
        this.o = z2;
        this.p = j;
        this.q = str7;
        this.r = str8;
        this.s = str9;
        this.t = str10;
        this.u = num5;
    }

    public static wn1 a(wn1 wn1Var, int i) {
        int i2 = wn1Var.b;
        int i3 = wn1Var.c;
        String str = wn1Var.d;
        String str2 = wn1Var.e;
        String str3 = wn1Var.f;
        String str4 = wn1Var.g;
        String str5 = wn1Var.h;
        String str6 = wn1Var.i;
        Integer num = wn1Var.j;
        Integer num2 = wn1Var.k;
        Integer num3 = wn1Var.l;
        Integer num4 = wn1Var.m;
        boolean z = wn1Var.n;
        boolean z2 = wn1Var.o;
        long j = wn1Var.p;
        String str7 = wn1Var.q;
        String str8 = wn1Var.r;
        String str9 = wn1Var.s;
        String str10 = wn1Var.t;
        Integer num5 = wn1Var.u;
        wn1Var.getClass();
        str.getClass();
        str4.getClass();
        str7.getClass();
        return new wn1(i, i2, i3, str, str2, str3, str4, str5, str6, num, num2, num3, num4, z, z2, j, str7, str8, str9, str10, num5);
    }

    public final boolean b() {
        return Intrinsics.c(this.q, StatusKt.STATUS_FINISHED);
    }

    public final boolean c() {
        return Intrinsics.c(this.q, StatusKt.STATUS_IN_PROGRESS);
    }

    public final boolean d() {
        return Intrinsics.c(this.q, StatusKt.STATUS_NOT_STARTED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn1)) {
            return false;
        }
        wn1 wn1Var = (wn1) obj;
        return this.a == wn1Var.a && this.b == wn1Var.b && this.c == wn1Var.c && Intrinsics.c(this.d, wn1Var.d) && Intrinsics.c(this.e, wn1Var.e) && Intrinsics.c(this.f, wn1Var.f) && Intrinsics.c(this.g, wn1Var.g) && Intrinsics.c(this.h, wn1Var.h) && Intrinsics.c(this.i, wn1Var.i) && Intrinsics.c(this.j, wn1Var.j) && Intrinsics.c(this.k, wn1Var.k) && Intrinsics.c(this.l, wn1Var.l) && Intrinsics.c(this.m, wn1Var.m) && this.n == wn1Var.n && this.o == wn1Var.o && this.p == wn1Var.p && Intrinsics.c(this.q, wn1Var.q) && this.r.equals(wn1Var.r) && Intrinsics.c(this.s, wn1Var.s) && Intrinsics.c(this.t, wn1Var.t) && Intrinsics.c(this.u, wn1Var.u);
    }

    public final int hashCode() {
        int c = dmi.c(wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        String str = this.e;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int c2 = dmi.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        int hashCode2 = (c2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.j;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.l;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.m;
        int c3 = dmi.c(dmi.c(ljg.c(dmi.e(dmi.e((hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        String str5 = this.s;
        int hashCode7 = (c3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.t;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.u;
        return hashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BasicEventData(id=", ", firstTeamId=", ", secondTeamId=");
        vxd.p(this.c, ", firstTeamName=", this.d, ", firstTeamShortName=", s);
        bf3.v(s, this.e, ", firstTeamNameCode=", this.f, ", secondTeamName=");
        bf3.v(s, this.g, ", secondTeamShortName=", this.h, ", secondTeamNameCode=");
        me4.o(this.j, this.i, ", firstTeamScore=", ", secondTeamScore=", s);
        vxd.r(this.k, this.l, ", firstTeamPenalties=", ", secondTeamPenalties=", s);
        s.append(this.m);
        s.append(", firstTeamDisabled=");
        s.append(this.n);
        s.append(", secondTeamDisabled=");
        s.append(this.o);
        s.append(", startTimestamp=");
        s.append(this.p);
        bf3.v(s, ", statusType=", this.q, ", statusDescription=", this.r);
        bf3.v(s, ", penaltiesDescription=", this.s, ", timeMinutes=", this.t);
        s.append(", winnerCode=");
        s.append(this.u);
        s.append(")");
        return s.toString();
    }
}
