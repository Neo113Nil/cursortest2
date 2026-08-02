package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k9b {
    public final boolean a;
    public final Double b;
    public final Double c;
    public final boolean d;
    public final Double e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public k9b(boolean z, Double d, Double d2, boolean z2, Double d3, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = z;
        this.b = d;
        this.c = d2;
        this.d = z2;
        this.e = d3;
        this.f = num;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9b)) {
            return false;
        }
        k9b k9bVar = (k9b) obj;
        return this.a == k9bVar.a && Intrinsics.c(this.b, k9bVar.b) && Intrinsics.c(this.c, k9bVar.c) && this.d == k9bVar.d && Intrinsics.c(this.e, k9bVar.e) && Intrinsics.c(this.f, k9bVar.f) && Intrinsics.c(this.g, k9bVar.g) && Intrinsics.c(this.h, k9bVar.h) && Intrinsics.c(this.i, k9bVar.i) && Intrinsics.c(this.j, k9bVar.j) && Intrinsics.c(this.k, k9bVar.k) && Intrinsics.c(this.l, k9bVar.l);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int e = dmi.e((hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.d);
        Double d3 = this.e;
        int hashCode3 = (e + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineupsListPlayerChipData(showRating=");
        sb.append(this.a);
        sb.append(", eventRating=");
        sb.append(this.b);
        sb.append(", avgRating=");
        sb.append(this.c);
        sb.append(", isAvgRating=");
        sb.append(this.d);
        sb.append(", testRating=");
        mz1.x(this.e, this.f, ", teamId=", ", age=", sb);
        bf3.v(sb, this.g, ", kilometersCovered=", this.h, ", marketValue=");
        bf3.v(sb, this.i, ", height=", this.j, ", fantasyPoints=");
        return fc6.o(sb, this.k, ", countryAlpha2=", this.l, ")");
    }
}
