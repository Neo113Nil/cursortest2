package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFh1zSDK extends AFf1pSDK<Map<String, Object>> {
    private static final List<String> component3 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFh1sSDK copy;
    private final AFd1rSDK copydefault;
    private final AFe1qSDK equals;
    private final AFd1pSDK hashCode;
    private Map<String, Object> toString;
    private String values;

    @Override // com.appsflyer.internal.AFf1pSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFh1zSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1wSDK.GCDSDK, new AFf1wSDK[]{AFf1wSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.equals = aFd1kSDK.AFAdRevenueData();
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.copy = aFd1kSDK.component4();
        this.copydefault = aFd1kSDK.getCurrencyIso4217Code();
        this.AFAdRevenueData.add(AFf1wSDK.CONVERSION);
        this.AFAdRevenueData.add(AFf1wSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.toString;
        String str = this.values;
        if (map != null) {
            AFg1bSDK.getCurrencyIso4217Code(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1bSDK.getCurrencyIso4217Code(str);
        } else {
            AFg1bSDK.getCurrencyIso4217Code("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final AFe1rSDK<Map<String, Object>> getMonetizationNetwork(String str) {
        String str2;
        String str3 = (String) AFb1rSDK.getRevenue(new Object[]{this.hashCode, this.copydefault.areAllFieldsValid()}, 983289703, -983289699, (int) System.currentTimeMillis());
        if (str3 != null && !str3.trim().isEmpty()) {
            if (!component3.contains(str3.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(str3));
                AFe1rSDK<Map<String, Object>> revenue = this.equals.getRevenue(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(revenue.getRevenue.AFAdRevenueData);
                AFLogger.afInfoLog(sb.toString());
                return revenue;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", str3));
        }
        str2 = "";
        AFe1rSDK<Map<String, Object>> revenue2 = this.equals.getRevenue(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(revenue2.getRevenue.AFAdRevenueData);
        AFLogger.afInfoLog(sb2.toString());
        return revenue2;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() throws Exception {
        AFe1dSDK aFe1dSDK;
        AFe1dSDK aFe1dSDK2;
        if (((AFf1pSDK) this).component4.getRevenue()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.values = "'isStopTracking' enabled";
            throw new AFf1xSDK();
        }
        AFe1dSDK aFe1dSDK3 = AFe1dSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.copy.copy = System.currentTimeMillis();
            try {
                try {
                    aFe1dSDK = super.AFAdRevenueData();
                    ResponseNetwork responseNetwork = ((AFf1pSDK) this).areAllFieldsValid;
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
                            this.values = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1dSDK2 = AFe1dSDK.FAILURE;
                            return aFe1dSDK2;
                        }
                        Map<String, Object> map = (Map) responseNetwork.getBody();
                        int statusCode2 = responseNetwork.getStatusCode();
                        Boolean bool = (Boolean) map.get("iscache");
                        if (statusCode2 == 404) {
                            map.remove("error_reason");
                            map.remove("status_code");
                            map.put("af_status", "Organic");
                            map.put("af_message", "organic install");
                        }
                        if (bool != null && !bool.booleanValue()) {
                            this.hashCode.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                AFLogger.afDebugLog(sb.toString());
                            } else {
                                AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                            }
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.hashCode.getMonetizationNetwork("attributionId", new JSONObject(map).toString());
                        if (!this.hashCode.AFAdRevenueData("sixtyDayConversionData")) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.toString = map;
                        aFe1dSDK2 = AFe1dSDK.SUCCESS;
                        return aFe1dSDK2;
                    }
                } catch (AFe1aSDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.values = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2, false, false);
                    aFe1dSDK = AFe1dSDK.FAILURE;
                    if (z2) {
                        this.values = e2.getMessage();
                        throw e2;
                    }
                }
                aFe1dSDK3 = aFe1dSDK;
                i++;
            } finally {
                this.copy.getRevenue(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1dSDK3;
    }
}
