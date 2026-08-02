package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFc1eSDK implements AFc1gSDK {
    private final AFd1pSDK getMonetizationNetwork;

    public AFc1eSDK(AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.getMonetizationNetwork = aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1gSDK
    public final Map<String, Object> getMediationNetwork() {
        if (this.getMonetizationNetwork.getMonetizationNetwork("deeplink_data")) {
            try {
                String AFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData("deeplink_data", (String) null);
                return AFAdRevenueData == null ? MapsKt.emptyMap() : AFj1gSDK.getMonetizationNetwork(new JSONObject(AFAdRevenueData));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }

    @Override // com.appsflyer.internal.AFc1gSDK
    public final void AFAdRevenueData() {
        this.getMonetizationNetwork.getMediationNetwork("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1gSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork.getMonetizationNetwork("deeplink_data", new JSONObject(map).toString());
    }
}
