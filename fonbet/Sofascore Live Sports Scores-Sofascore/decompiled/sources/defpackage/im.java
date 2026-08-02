package defpackage;

import com.sofascore.model.AnalystOfferRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class im {
    public final Double a;
    public final String b;
    public final Double c;
    public final cu d;
    public final Double e;
    public final String f;
    public final String g;
    public final AnalystOfferRemoteConfig h;

    public im(Double d, String str, Double d2, cu cuVar, Double d3, String str2, String str3, int i) {
        str3 = (i & 64) != 0 ? null : str3;
        yea yeaVar = j58.a;
        AnalystOfferRemoteConfig c = j58.c();
        this.a = d;
        this.b = str;
        this.c = d2;
        this.d = cuVar;
        this.e = d3;
        this.f = str2;
        this.g = str3;
        this.h = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return Intrinsics.c(this.a, imVar.a) && Intrinsics.c(this.b, imVar.b) && Intrinsics.c(this.c, imVar.c) && this.d == imVar.d && Intrinsics.c(this.e, imVar.e) && Intrinsics.c(this.f, imVar.f) && Intrinsics.c(this.g, imVar.g) && Intrinsics.c(this.h, imVar.h);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        cu cuVar = this.d;
        int hashCode4 = (hashCode3 + (cuVar == null ? 0 : cuVar.hashCode())) * 31;
        Double d3 = this.e;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AnalystOfferRemoteConfig analystOfferRemoteConfig = this.h;
        return hashCode7 + (analystOfferRemoteConfig != null ? analystOfferRemoteConfig.hashCode() : 0);
    }

    public final String toString() {
        return "AiInsightsPriceWrapper(regularMonthlyPrice=" + this.a + ", currencyCode=" + this.b + ", monthlyPrice=" + this.c + ", subscriptionOffer=" + this.d + ", featuredOfferPrice=" + this.e + ", featuredOfferToken=" + this.f + ", activeOfferToken=" + this.g + ", analystOfferRemoteConfig=" + this.h + ")";
    }
}
