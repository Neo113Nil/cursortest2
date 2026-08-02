package com.appsflyer.internal;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFe1cSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1cSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1cSDK;", "getRevenue", "Ljava/lang/String;", "getMediationNetwork", "getMonetizationNetwork", "AFAdRevenueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AFe1eSDK {
    public final AFe1cSDK getCurrencyIso4217Code;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public final String AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public final String getMediationNetwork;

    public AFe1eSDK(String str, String str2, AFe1cSDK aFe1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1cSDK, "");
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getCurrencyIso4217Code = aFe1cSDK;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFe1eSDK)) {
            return false;
        }
        AFe1eSDK aFe1eSDK = (AFe1eSDK) p0;
        return Intrinsics.areEqual(this.getMediationNetwork, aFe1eSDK.getMediationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFe1eSDK.AFAdRevenueData) && this.getCurrencyIso4217Code == aFe1eSDK.getCurrencyIso4217Code;
    }

    public final int hashCode() {
        int hashCode = this.getMediationNetwork.hashCode() * 31;
        String str = this.AFAdRevenueData;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.getCurrencyIso4217Code.hashCode();
    }

    public final String toString() {
        return "HostMeta(name=" + this.getMediationNetwork + ", prefix=" + this.AFAdRevenueData + ", method=" + this.getCurrencyIso4217Code + ")";
    }
}
