package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AFa1jSDK implements AFa1lSDK {
    private final AFc1sSDK getMonetizationNetwork;

    public AFa1jSDK(AFc1sSDK aFc1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        this.getMonetizationNetwork = aFc1sSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        if (this.getMonetizationNetwork.getCurrencyIso4217Code("deeplink_data")) {
            try {
                String AFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData("deeplink_data", (String) null);
                return AFAdRevenueData == null ? MapsKt.emptyMap() : AFj1iSDK.getRevenue(new JSONObject(AFAdRevenueData));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void AFAdRevenueData() {
        this.getMonetizationNetwork.getMediationNetwork("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork.getRevenue("deeplink_data", new JSONObject(map).toString());
    }
}
