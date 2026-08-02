package ic;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11055b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11056c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11057d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11058e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11059f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11060g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11061h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11062i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11063k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11064l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11065m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11066n;

    /* renamed from: o, reason: collision with root package name */
    public final String f11067o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11068p;
    public final int q;

    public a(int i5, int i10, long j, long j6, long j10, String productName, String description, String str, String productId, String str2, String priceCurrencyCode, String price, String originalPrice, String str3, String str4, String str5, int i11) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f11054a = i5;
        this.f11055b = i10;
        this.f11056c = j;
        this.f11057d = j6;
        this.f11058e = j10;
        this.f11059f = productName;
        this.f11060g = description;
        this.f11061h = str;
        this.f11062i = productId;
        this.j = str2;
        this.f11063k = priceCurrencyCode;
        this.f11064l = price;
        this.f11065m = originalPrice;
        this.f11066n = str3;
        this.f11067o = str4;
        this.f11068p = str5;
        this.q = i11;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("productName", this.f11059f);
        jSONObject.put("description", this.f11060g);
        jSONObject.put("iconUrl", this.f11061h);
        jSONObject.put("productId", this.f11062i);
        jSONObject.put("type", this.f11054a);
        jSONObject.put("subscriptionPeriod", this.j);
        jSONObject.put("priceCurrencyCode", this.f11063k);
        jSONObject.put("price", this.f11064l);
        jSONObject.put("originalPrice", this.f11065m);
        jSONObject.put("introductoryPricePeriod", this.f11066n);
        jSONObject.put("introductoryPrice", this.f11067o);
        jSONObject.put("freeTrialPeriod", this.f11068p);
        jSONObject.put("priceAmountMicros", this.f11056c);
        jSONObject.put("originalPriceAmountMicros", this.f11057d);
        jSONObject.put("introductoryPriceAmountMicros", this.f11058e);
        jSONObject.put("introductoryPriceCycles", this.f11055b);
        jSONObject.put("offerUsedStatus", this.q);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11054a == aVar.f11054a && this.f11055b == aVar.f11055b && this.f11056c == aVar.f11056c && this.f11057d == aVar.f11057d && this.f11058e == aVar.f11058e && Intrinsics.areEqual(this.f11059f, aVar.f11059f) && Intrinsics.areEqual(this.f11060g, aVar.f11060g) && Intrinsics.areEqual(this.f11061h, aVar.f11061h) && Intrinsics.areEqual(this.f11062i, aVar.f11062i) && Intrinsics.areEqual(this.j, aVar.j) && Intrinsics.areEqual(this.f11063k, aVar.f11063k) && Intrinsics.areEqual(this.f11064l, aVar.f11064l) && Intrinsics.areEqual(this.f11065m, aVar.f11065m) && Intrinsics.areEqual(this.f11066n, aVar.f11066n) && Intrinsics.areEqual(this.f11067o, aVar.f11067o) && Intrinsics.areEqual(this.f11068p, aVar.f11068p) && this.q == aVar.q;
    }

    public final int hashCode() {
        int i5 = ((this.f11054a * 31) + this.f11055b) * 31;
        long j = this.f11056c;
        int i10 = (i5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.f11057d;
        int i11 = (i10 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f11058e;
        int j11 = r4.k.j(r4.k.j((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f11059f), 31, this.f11060g);
        String str = this.f11061h;
        int j12 = r4.k.j((j11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f11062i);
        String str2 = this.j;
        int j13 = r4.k.j(r4.k.j(r4.k.j((j12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f11063k), 31, this.f11064l), 31, this.f11065m);
        String str3 = this.f11066n;
        int hashCode = (j13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11067o;
        int hashCode2 = (hashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11068p;
        return ((hashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.q;
    }

    public final String toString() {
        return a();
    }
}
