package ha;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10452b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10453c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10454d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10455e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10456f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10457g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10458h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f10459i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f10460k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f10461l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f10462m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f10463n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f10464o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f10465p;
    public final Long q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f10466r;

    public d(String str, String str2, String str3, String str4, String str5, String str6, int i5, int i10, Integer num, int i11, Integer num2, Integer num3, Integer num4, Long l6, Long l10, Long l11, Long l12, Integer num5) {
        this.f10451a = str;
        this.f10452b = str2;
        this.f10453c = str3;
        this.f10454d = str4;
        this.f10455e = str5;
        this.f10456f = str6;
        this.f10457g = i5;
        this.f10458h = i10;
        this.f10459i = num;
        this.j = i11;
        this.f10460k = num2;
        this.f10461l = num3;
        this.f10462m = num4;
        this.f10463n = l6;
        this.f10464o = l10;
        this.f10465p = l11;
        this.q = l12;
        this.f10466r = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f10451a, dVar.f10451a) && Intrinsics.areEqual(this.f10452b, dVar.f10452b) && Intrinsics.areEqual(this.f10453c, dVar.f10453c) && Intrinsics.areEqual(this.f10454d, dVar.f10454d) && Intrinsics.areEqual(this.f10455e, dVar.f10455e) && Intrinsics.areEqual(this.f10456f, dVar.f10456f) && this.f10457g == dVar.f10457g && this.f10458h == dVar.f10458h && Intrinsics.areEqual(this.f10459i, dVar.f10459i) && this.j == dVar.j && Intrinsics.areEqual(this.f10460k, dVar.f10460k) && Intrinsics.areEqual(this.f10461l, dVar.f10461l) && Intrinsics.areEqual(this.f10462m, dVar.f10462m) && Intrinsics.areEqual(this.f10463n, dVar.f10463n) && Intrinsics.areEqual(this.f10464o, dVar.f10464o) && Intrinsics.areEqual(this.f10465p, dVar.f10465p) && Intrinsics.areEqual(this.q, dVar.q) && Intrinsics.areEqual(this.f10466r, dVar.f10466r);
    }

    public final int hashCode() {
        String str = this.f10451a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10452b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10453c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10454d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10455e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10456f;
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f10457g) * 31) + this.f10458h) * 31;
        Integer num = this.f10459i;
        int hashCode7 = (((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + this.j) * 31;
        Integer num2 = this.f10460k;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10461l;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10462m;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l6 = this.f10463n;
        int hashCode11 = (hashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l10 = this.f10464o;
        int hashCode12 = (hashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f10465p;
        int hashCode13 = (hashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.q;
        int hashCode14 = (hashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num5 = this.f10466r;
        return hashCode14 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "User(email=" + this.f10451a + ", locale=" + this.f10452b + ", name=" + this.f10453c + ", surname=" + this.f10454d + ", avatar=" + this.f10455e + ", token=" + this.f10456f + ", premiumBonuses=" + this.f10457g + ", expressBonuses=" + this.f10458h + ", forecastsOrder=" + this.f10459i + ", needPlatformAuth=" + this.j + ", alternativePayment=" + this.f10460k + ", cpb=" + this.f10461l + ", badSubs=" + this.f10462m + ", vip=" + this.f10463n + ", express=" + this.f10464o + ", premium=" + this.f10465p + ", live=" + this.q + ", modalDescEnable=" + this.f10466r + ')';
    }
}
