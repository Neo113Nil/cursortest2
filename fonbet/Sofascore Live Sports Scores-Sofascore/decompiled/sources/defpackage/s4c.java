package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s4c {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;

    public s4c(String str, double d, double d2, double d3, double d4, String str2, String str3, boolean z, boolean z2, String str4, String str5) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = str4;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4c)) {
            return false;
        }
        s4c s4cVar = (s4c) obj;
        return Intrinsics.c(this.a, s4cVar.a) && Double.compare(this.b, s4cVar.b) == 0 && Double.compare(this.c, s4cVar.c) == 0 && Double.compare(this.d, s4cVar.d) == 0 && Double.compare(this.e, s4cVar.e) == 0 && Intrinsics.c(this.f, s4cVar.f) && Intrinsics.c(this.g, s4cVar.g) && this.h == s4cVar.h && this.i == s4cVar.i && Intrinsics.c(this.j, s4cVar.j) && Intrinsics.c(this.k, s4cVar.k);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(dmi.c(dmi.c(dmi.b(dmi.b(dmi.b(dmi.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaEventStatisticsItem(name=");
        sb.append(this.a);
        sb.append(", homeValue=");
        sb.append(this.b);
        fn0.A(sb, ", homeValueTotal=", this.c, ", awayValue=");
        sb.append(this.d);
        fn0.A(sb, ", awayValueTotal=", this.e, ", firstHome=");
        bf3.v(sb, this.f, ", firstAway=", this.g, ", isNegativeStatistic=");
        vxd.t(", hasTeamValueType=", ", secondHome=", sb, this.h, this.i);
        return fc6.o(sb, this.j, ", secondAway=", this.k, ")");
    }
}
