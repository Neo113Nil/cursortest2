package ic;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Long f11075a;

    /* renamed from: b, reason: collision with root package name */
    public Long f11076b;

    /* renamed from: c, reason: collision with root package name */
    public String f11077c;

    /* renamed from: d, reason: collision with root package name */
    public String f11078d;

    /* renamed from: e, reason: collision with root package name */
    public String f11079e;

    /* renamed from: f, reason: collision with root package name */
    public String f11080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11081g;

    /* renamed from: h, reason: collision with root package name */
    public String f11082h;

    /* renamed from: i, reason: collision with root package name */
    public String f11083i;
    public int j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f11075a, bVar.f11075a) && Intrinsics.areEqual(this.f11076b, bVar.f11076b) && Intrinsics.areEqual(this.f11077c, bVar.f11077c) && Intrinsics.areEqual(this.f11078d, bVar.f11078d) && Intrinsics.areEqual(this.f11079e, bVar.f11079e) && Intrinsics.areEqual(this.f11080f, bVar.f11080f) && this.f11081g == bVar.f11081g && Intrinsics.areEqual(this.f11082h, bVar.f11082h) && Intrinsics.areEqual(this.f11083i, bVar.f11083i) && this.j == bVar.j;
    }

    public final int hashCode() {
        Long l6 = this.f11075a;
        int hashCode = (l6 == null ? 0 : l6.hashCode()) * 31;
        Long l10 = this.f11076b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f11077c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11078d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11079e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11080f;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.f11081g ? 1231 : 1237)) * 31;
        String str5 = this.f11082h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11083i;
        return ((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoTariff(priceAmountMicros=");
        sb2.append(this.f11075a);
        sb2.append(", introductoryPriceAmountMicros=");
        sb2.append(this.f11076b);
        sb2.append(", freeTrialPeriod=");
        sb2.append(this.f11077c);
        sb2.append(", subscriptionPeriod=");
        sb2.append(this.f11078d);
        sb2.append(", price=");
        sb2.append(this.f11079e);
        sb2.append(", introductoryPrice=");
        sb2.append(this.f11080f);
        sb2.append(", single=");
        sb2.append(this.f11081g);
        sb2.append(", introductoryPriceWithCode=");
        sb2.append(this.f11082h);
        sb2.append(", priceWithCode=");
        sb2.append(this.f11083i);
        sb2.append(", dayCountFreeTrialPeriod=");
        return d9.e.i(sb2, this.j, ')');
    }
}
