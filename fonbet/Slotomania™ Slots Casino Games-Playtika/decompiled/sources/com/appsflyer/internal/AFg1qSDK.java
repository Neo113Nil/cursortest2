package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import io.sentry.protocol.Response;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AFg1qSDK extends AFe1kSDK<Map<String, Object>> {
    private static final List<String> component1 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFKeystoreWrapper;
    private final AFc1sSDK copy;
    private Map<String, Object> copydefault;
    private final AFc1kSDK equals;
    private final AFd1lSDK hashCode;
    private final AFh1uSDK toString;

    @Override // com.appsflyer.internal.AFe1kSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFg1qSDK(AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.GCDSDK, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, aFc1fSDK, "GCD-FETCH");
        this.hashCode = aFc1fSDK.getMediationNetwork();
        this.copy = aFc1fSDK.component1();
        this.toString = aFc1fSDK.component2();
        this.equals = aFc1fSDK.getRevenue();
        this.getRevenue.add(AFe1uSDK.CONVERSION);
        this.getRevenue.add(AFe1uSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.copydefault;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFg1pSDK.getMediationNetwork(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1pSDK.getMonetizationNetwork(str);
        } else {
            AFg1pSDK.getMonetizationNetwork("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final AFd1mSDK<Map<String, Object>> getMediationNetwork(String str) {
        String str2;
        String AFAdRevenueData = AFa1zSDK.AFAdRevenueData(this.copy, this.equals.component1());
        if (AFAdRevenueData != null && !AFAdRevenueData.trim().isEmpty()) {
            if (!component1.contains(AFAdRevenueData.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(AFAdRevenueData));
                AFd1lSDK aFd1lSDK = this.hashCode;
                AFd1mSDK<Map<String, Object>> aFd1mSDK = (AFd1mSDK) AFd1lSDK.AFAdRevenueData(new Object[]{aFd1lSDK, str2, str}, -957016153, 957016155, System.identityHashCode(aFd1lSDK));
                AFLogger.afInfoLog(new StringBuilder("[GCD-B01] URL: ").append(aFd1mSDK.getMediationNetwork.getCurrencyIso4217Code).toString());
                return aFd1mSDK;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFAdRevenueData));
        }
        str2 = "";
        AFd1lSDK aFd1lSDK2 = this.hashCode;
        AFd1mSDK<Map<String, Object>> aFd1mSDK2 = (AFd1mSDK) AFd1lSDK.AFAdRevenueData(new Object[]{aFd1lSDK2, str2, str}, -957016153, 957016155, System.identityHashCode(aFd1lSDK2));
        AFLogger.afInfoLog(new StringBuilder("[GCD-B01] URL: ").append(aFd1mSDK2.getMediationNetwork.getCurrencyIso4217Code).toString());
        return aFd1mSDK2;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        AFe1rSDK aFe1rSDK;
        AFe1rSDK aFe1rSDK2;
        if (((AFe1kSDK) this).component4.getMediationNetwork()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFKeystoreWrapper = "'isStopTracking' enabled";
            throw new AFe1oSDK();
        }
        AFe1rSDK aFe1rSDK3 = AFe1rSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.toString.copy = System.currentTimeMillis();
            try {
                try {
                    aFe1rSDK = super.AFAdRevenueData();
                    ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z = false;
                        }
                        if (!responseNetwork.isSuccessful() && statusCode != 404) {
                            if (!z2) {
                                if (!z) {
                                }
                            }
                            this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1rSDK2 = AFe1rSDK.FAILURE;
                            return aFe1rSDK2;
                        }
                        Map<String, Object> map = (Map) responseNetwork.getBody();
                        int statusCode2 = responseNetwork.getStatusCode();
                        Boolean bool = (Boolean) map.get("iscache");
                        if (statusCode2 == 404) {
                            map.remove("error_reason");
                            map.remove(Response.JsonKeys.STATUS_CODE);
                            map.put("af_status", "Organic");
                            map.put("af_message", "organic install");
                        }
                        if (bool != null && !bool.booleanValue()) {
                            this.copy.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                AFLogger.afDebugLog(new StringBuilder("[Invite] Detected App-Invite via channel: ").append(map.get(AFInAppEventParameterName.AF_CHANNEL)).toString());
                            } else {
                                AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                            }
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.copy.getRevenue("attributionId", new JSONObject(map).toString());
                        if (!this.copy.AFAdRevenueData("sixtyDayConversionData", false)) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.copydefault = map;
                        aFe1rSDK2 = AFe1rSDK.SUCCESS;
                        return aFe1rSDK2;
                    }
                } catch (AFe1nSDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFKeystoreWrapper = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    AFLogger.afErrorLog(new StringBuilder("[GCD] Error: ").append(e2.getMessage()).toString(), e2, false, false);
                    aFe1rSDK = AFe1rSDK.FAILURE;
                    if (z2) {
                        this.AFKeystoreWrapper = e2.getMessage();
                        throw e2;
                    }
                }
                aFe1rSDK3 = aFe1rSDK;
                i++;
            } finally {
                this.toString.getMediationNetwork(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1rSDK3;
    }
}
