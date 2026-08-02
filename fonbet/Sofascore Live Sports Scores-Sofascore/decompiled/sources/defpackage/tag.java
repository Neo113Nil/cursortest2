package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tag {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public tag(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tag)) {
            return false;
        }
        tag tagVar = (tag) obj;
        return Intrinsics.c(this.a, tagVar.a) && Intrinsics.c(this.b, tagVar.b) && Intrinsics.c(this.c, tagVar.c) && Intrinsics.c(this.d, tagVar.d) && Intrinsics.c(this.e, tagVar.e) && Intrinsics.c(this.f, tagVar.f) && Intrinsics.c(this.g, tagVar.g) && Intrinsics.c(this.h, tagVar.h) && Intrinsics.c(this.i, tagVar.i) && Intrinsics.c(this.j, tagVar.j) && Intrinsics.c(this.k, tagVar.k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("ProgrammaticInfo(advertiserId=", this.a, ", auctionId=", this.b, ", buyerId=");
        bf3.v(s, this.c, ", campaignId=", this.d, ", creativeId=");
        bf3.v(s, this.e, ", dealId=", this.f, ", dspId=");
        bf3.v(s, this.g, ", publisherId=", this.h, ", clearedPricePublisherCurrency=");
        bf3.v(s, this.i, ", publisherCurrencyCode=", this.j, ", externalDealId=");
        return mz1.o(s, this.k, ")");
    }
}
