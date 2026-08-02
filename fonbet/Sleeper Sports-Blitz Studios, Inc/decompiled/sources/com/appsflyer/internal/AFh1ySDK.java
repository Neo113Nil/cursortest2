package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class AFh1ySDK extends AFe1bSDK<Void> {
    private final AFe1iSDK<String> component1;
    private final AFd1pSDK component3;
    private final Throwable component4;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFh1ySDK(AFf1fSDK aFf1fSDK, AFd1pSDK aFd1pSDK) {
        super(AFf1wSDK.GCDSDK, new AFf1wSDK[]{AFf1wSDK.RC_CDN}, "GCD-CHECK");
        this.component4 = aFf1fSDK.component4();
        this.component1 = ((AFf1pSDK) aFf1fSDK).areAllFieldsValid;
        this.component3 = aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component3.AFAdRevenueData("appsFlyerCount", 0))));
        long revenue = this.component3.getRevenue("appsflyerConversionDataCacheExpiration", 0L);
        if (revenue != 0 && System.currentTimeMillis() - revenue > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component3.getMediationNetwork("sixtyDayConversionData", true);
            this.component3.getMonetizationNetwork("attributionId", null);
            this.component3.AFAdRevenueData("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> component1 = component1();
        if (component1 != null) {
            try {
                if (!component1.containsKey("is_first_launch")) {
                    component1.put("is_first_launch", Boolean.FALSE);
                }
                AFg1bSDK.getCurrencyIso4217Code(component1);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e);
            }
            return AFe1dSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb2.toString(), e2);
        }
        if (this.component4 != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.component4.getMessage());
            AFg1bSDK.getCurrencyIso4217Code(sb3.toString());
            return AFe1dSDK.SUCCESS;
        }
        AFe1iSDK<String> aFe1iSDK = this.component1;
        if (aFe1iSDK != null && !aFe1iSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.component1.getStatusCode());
            AFg1bSDK.getCurrencyIso4217Code(sb4.toString());
            return AFe1dSDK.SUCCESS;
        }
        return AFe1dSDK.FAILURE;
    }

    private Map<String, Object> component1() {
        String AFAdRevenueData = this.component3.AFAdRevenueData("attributionId", (String) null);
        if (AFAdRevenueData == null) {
            return null;
        }
        try {
            new AFe1tSDK();
            return AFe1tSDK.getMediationNetwork(AFAdRevenueData);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }
}
