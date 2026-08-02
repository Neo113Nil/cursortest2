package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class AFg1nSDK extends AFe1tSDK<Void> {
    private final Throwable component1;
    private final AFd1cSDK<String> component3;
    private final AFc1sSDK component4;

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return 1000L;
    }

    public AFg1nSDK(AFf1rSDK aFf1rSDK, AFc1sSDK aFc1sSDK) {
        super(AFe1uSDK.GCDSDK, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, "GCD-CHECK");
        this.component1 = aFf1rSDK.component3();
        this.component3 = ((AFe1kSDK) aFf1rSDK).component2;
        this.component4 = aFc1sSDK;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component4.AFAdRevenueData("appsFlyerCount", 0))));
        long mediationNetwork = this.component4.getMediationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (mediationNetwork != 0 && System.currentTimeMillis() - mediationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component4.getCurrencyIso4217Code("sixtyDayConversionData", true);
            this.component4.getRevenue("attributionId", null);
            this.component4.AFAdRevenueData("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> component1 = component1();
        if (component1 != null) {
            try {
                if (!component1.containsKey("is_first_launch")) {
                    component1.put("is_first_launch", Boolean.FALSE);
                }
                AFg1pSDK.getMediationNetwork(component1);
            } catch (Exception e) {
                AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e.getLocalizedMessage()).toString(), e);
            }
            return AFe1rSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e2.getLocalizedMessage()).toString(), e2);
        }
        if (this.component1 != null) {
            AFg1pSDK.getMonetizationNetwork(new StringBuilder("Launch exception: ").append(this.component1.getMessage()).toString());
            return AFe1rSDK.SUCCESS;
        }
        AFd1cSDK<String> aFd1cSDK = this.component3;
        if (aFd1cSDK != null && !aFd1cSDK.isSuccessful()) {
            AFg1pSDK.getMonetizationNetwork(new StringBuilder("Launch status code: ").append(this.component3.getStatusCode()).toString());
            return AFe1rSDK.SUCCESS;
        }
        return AFe1rSDK.FAILURE;
    }

    private Map<String, Object> component1() {
        String AFAdRevenueData = this.component4.AFAdRevenueData("attributionId", (String) null);
        if (AFAdRevenueData == null) {
            return null;
        }
        try {
            new AFd1fSDK();
            return AFd1fSDK.getMonetizationNetwork(AFAdRevenueData);
        } catch (JSONException e) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Failed to parse GCD response: ").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
