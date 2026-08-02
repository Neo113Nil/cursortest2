package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dxk {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Boolean n;
    public final Boolean o;

    public dxk(String str, String str2, String str3, long j, int i, int i2, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = bool;
        this.o = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxk)) {
            return false;
        }
        dxk dxkVar = (dxk) obj;
        return Intrinsics.c(this.a, dxkVar.a) && Intrinsics.c(this.b, dxkVar.b) && Intrinsics.c(this.c, dxkVar.c) && this.d == dxkVar.d && this.e == dxkVar.e && this.f == dxkVar.f && this.g == dxkVar.g && this.h == dxkVar.h && Intrinsics.c(this.i, dxkVar.i) && Intrinsics.c(this.j, dxkVar.j) && Intrinsics.c(this.k, dxkVar.k) && Intrinsics.c(this.l, dxkVar.l) && Intrinsics.c(this.m, dxkVar.m) && Intrinsics.c(this.n, dxkVar.n) && Intrinsics.c(this.o, dxkVar.o);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(wv8.a(this.f, wv8.a(this.e, ljg.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h);
        String str = this.i;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.n;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("VolleyballEventResultUiModel(status=", this.a, ", statusDescription=", this.b, ", sport=");
        i.n(this.d, this.c, ", startTimestamp=", s);
        me4.r(s, ", teamIdFirst=", this.e, ", teamIdSecond=", this.f);
        fn0.y(", teamEnabledFirst=", ", teamEnabledSecond=", s, this.g, this.h);
        bf3.v(s, ", setResultFirst=", this.i, ", setResultSecond=", this.j);
        bf3.v(s, ", currentPeriod=", this.k, ", pointResultFirst=", this.l);
        s.append(", pointResultSecond=");
        s.append(this.m);
        s.append(", firstTeamWon=");
        s.append(this.n);
        s.append(", firstTeamWonAggregate=");
        s.append(this.o);
        s.append(")");
        return s.toString();
    }
}
