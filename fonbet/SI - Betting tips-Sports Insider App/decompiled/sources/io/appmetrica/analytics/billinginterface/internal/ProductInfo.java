package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import d9.e;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    public final Period introductoryPricePeriod;

    @NonNull
    public final String priceCurrency;
    public final long priceMicros;

    @NonNull
    public final String purchaseOriginalJson;
    public final long purchaseTime;

    @NonNull
    public final String purchaseToken;
    public final int quantity;

    @NonNull
    public final String signature;

    @NonNull
    public final String sku;
    public final Period subscriptionPeriod;

    @NonNull
    public final ProductType type;

    public ProductInfo(@NonNull ProductType productType, @NonNull String str, int i5, long j, @NonNull String str2, long j6, Period period, int i10, Period period2, @NonNull String str3, @NonNull String str4, long j10, boolean z5, @NonNull String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i5;
        this.priceMicros = j;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j6;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i10;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j10;
        this.autoRenewing = z5;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int j = (k.j(this.type.hashCode() * 31, 31, this.sku) + this.quantity) * 31;
        long j6 = this.priceMicros;
        int j10 = k.j((j + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31, this.priceCurrency);
        long j11 = this.introductoryPriceMicros;
        int i5 = (j10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int hashCode = (((i5 + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        int j12 = k.j(k.j((hashCode + (period2 != null ? period2.hashCode() : 0)) * 31, 31, this.signature), 31, this.purchaseToken);
        long j13 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((j12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProductInfo{type=");
        sb2.append(this.type);
        sb2.append(", sku='");
        sb2.append(this.sku);
        sb2.append("', quantity=");
        sb2.append(this.quantity);
        sb2.append(", priceMicros=");
        sb2.append(this.priceMicros);
        sb2.append(", priceCurrency='");
        sb2.append(this.priceCurrency);
        sb2.append("', introductoryPriceMicros=");
        sb2.append(this.introductoryPriceMicros);
        sb2.append(", introductoryPricePeriod=");
        sb2.append(this.introductoryPricePeriod);
        sb2.append(", introductoryPriceCycles=");
        sb2.append(this.introductoryPriceCycles);
        sb2.append(", subscriptionPeriod=");
        sb2.append(this.subscriptionPeriod);
        sb2.append(", signature='");
        sb2.append(this.signature);
        sb2.append("', purchaseToken='");
        sb2.append(this.purchaseToken);
        sb2.append("', purchaseTime=");
        sb2.append(this.purchaseTime);
        sb2.append(", autoRenewing=");
        sb2.append(this.autoRenewing);
        sb2.append(", purchaseOriginalJson='");
        return e.l(sb2, this.purchaseOriginalJson, "'}");
    }
}
