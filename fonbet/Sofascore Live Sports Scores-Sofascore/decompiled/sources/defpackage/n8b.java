package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n8b {
    public final int a;
    public final String b;
    public final Integer c;
    public final String d;
    public final boolean e;
    public final Double f;
    public final Double g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final fk2 o;
    public final Integer p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final Double v;
    public final y9b w;

    public /* synthetic */ n8b(fk2 fk2Var, Integer num, y9b y9bVar) {
        this(12994, "S. Pletikosa", 2817, "10", true, Double.valueOf(9.8d), Double.valueOf(8.2d), false, "32 y", "21.1 km", "35.2M", "173 cm", "5 pts", "ES", fk2Var, num, true, 3, 2, 1, false, null, y9bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8b)) {
            return false;
        }
        n8b n8bVar = (n8b) obj;
        return this.a == n8bVar.a && Intrinsics.c(this.b, n8bVar.b) && Intrinsics.c(this.c, n8bVar.c) && Intrinsics.c(this.d, n8bVar.d) && this.e == n8bVar.e && Intrinsics.c(this.f, n8bVar.f) && Intrinsics.c(this.g, n8bVar.g) && this.h == n8bVar.h && Intrinsics.c(this.i, n8bVar.i) && Intrinsics.c(this.j, n8bVar.j) && Intrinsics.c(this.k, n8bVar.k) && Intrinsics.c(this.l, n8bVar.l) && Intrinsics.c(this.m, n8bVar.m) && Intrinsics.c(this.n, n8bVar.n) && Intrinsics.c(this.o, n8bVar.o) && Intrinsics.c(this.p, n8bVar.p) && this.q == n8bVar.q && this.r == n8bVar.r && this.s == n8bVar.s && this.t == n8bVar.t && this.u == n8bVar.u && Intrinsics.c(this.v, n8bVar.v) && Intrinsics.c(this.w, n8bVar.w);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int e = dmi.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Double d = this.f;
        int hashCode2 = (e + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int e2 = dmi.e((hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int hashCode3 = (e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.n;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        fk2 fk2Var = this.o;
        int hashCode9 = (hashCode8 + (fk2Var == null ? 0 : fk2Var.hashCode())) * 31;
        Integer num2 = this.p;
        int e3 = dmi.e(wv8.a(this.t, wv8.a(this.s, wv8.a(this.r, dmi.e((hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.q), 31), 31), 31), 31, this.u);
        Double d3 = this.v;
        int hashCode10 = (e3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        y9b y9bVar = this.w;
        return hashCode10 + (y9bVar != null ? y9bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "LineupFieldPlayerUIModel(id=", ", name=", this.b, ", teamId=");
        vxd.s(this.c, ", jerseyNumber=", this.d, ", showRating=", t);
        t.append(this.e);
        t.append(", eventRating=");
        t.append(this.f);
        t.append(", avgRating=");
        t.append(this.g);
        t.append(", isAvgRating=");
        t.append(this.h);
        t.append(", age=");
        bf3.v(t, this.i, ", kilometersCovered=", this.j, ", marketValue=");
        bf3.v(t, this.k, ", height=", this.l, ", fantasyPoints=");
        bf3.v(t, this.m, ", countryAlpha2=", this.n, ", cardData=");
        t.append(this.o);
        t.append(", substitutionIcon=");
        t.append(this.p);
        t.append(", isTopRated=");
        t.append(this.q);
        t.append(", goals=");
        t.append(this.r);
        t.append(", assists=");
        me4.q(t, this.s, ", ownGoals=", this.t, ", disabled=");
        t.append(this.u);
        t.append(", testRating=");
        t.append(this.v);
        t.append(", ratingBreakdowns=");
        t.append(this.w);
        t.append(")");
        return t.toString();
    }

    public n8b(int i, String str, Integer num, String str2, boolean z, Double d, Double d2, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, fk2 fk2Var, Integer num2, boolean z3, int i2, int i3, int i4, boolean z4, Double d3, y9b y9bVar) {
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = z;
        this.f = d;
        this.g = d2;
        this.h = z2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = fk2Var;
        this.p = num2;
        this.q = z3;
        this.r = i2;
        this.s = i3;
        this.t = i4;
        this.u = z4;
        this.v = d3;
        this.w = y9bVar;
    }
}
