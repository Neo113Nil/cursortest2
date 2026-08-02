package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFg1pSDK extends AFe1fSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFKeystoreWrapper;
    private final AFh1xSDK copy;
    private final AFd1nSDK copydefault;
    private final AFc1oSDK equals;
    private Map<String, Object> hashCode;
    private final AFc1qSDK toString;

    public AFg1pSDK(@NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.copydefault = aFd1zSDK.getRevenue();
        this.toString = aFd1zSDK.component4();
        this.copy = aFd1zSDK.areAllFieldsValid();
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFe1pSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(@NonNull String str) {
        String str2;
        String AFAdRevenueData = AFa1ySDK.AFAdRevenueData(this.toString, this.equals.component3());
        if (AFAdRevenueData != null && !AFAdRevenueData.trim().isEmpty()) {
            if (!component2.contains(AFAdRevenueData.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(AFAdRevenueData);
                AFd1hSDK<Map<String, Object>> monetizationNetwork = this.copydefault.getMonetizationNetwork(str2, str);
                StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
                sb2.append(monetizationNetwork.getMonetizationNetwork.getMediationNetwork);
                AFLogger.afInfoLog(sb2.toString());
                return monetizationNetwork;
            }
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + AFAdRevenueData + ". Using without channel postfix.");
        }
        str2 = "";
        AFd1hSDK<Map<String, Object>> monetizationNetwork2 = this.copydefault.getMonetizationNetwork(str2, str);
        StringBuilder sb22 = new StringBuilder("[GCD-B01] URL: ");
        sb22.append(monetizationNetwork2.getMonetizationNetwork.getMediationNetwork);
        AFLogger.afInfoLog(sb22.toString());
        return monetizationNetwork2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.hashCode;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFg1oSDK.getCurrencyIso4217Code(map);
        } else if (str == null || str.isEmpty()) {
            AFg1oSDK.getRevenue("Unknown error");
        } else {
            AFg1oSDK.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[Catch: all -> 0x0069, Exception -> 0x006c, AFe1nSDK -> 0x006f, TryCatch #3 {AFe1nSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[Catch: all -> 0x0069, Exception -> 0x006c, AFe1nSDK -> 0x006f, TryCatch #3 {AFe1nSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[Catch: all -> 0x0069, Exception -> 0x006c, AFe1nSDK -> 0x006f, TryCatch #3 {AFe1nSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #2 }] */
    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1uSDK getRevenue() throws Exception {
        AFe1uSDK aFe1uSDK;
        boolean z5;
        Map<String, Object> map;
        int statusCode;
        Boolean bool;
        AFe1uSDK aFe1uSDK2;
        if (((AFe1fSDK) this).component1.getCurrencyIso4217Code()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFKeystoreWrapper = "'isStopTracking' enabled";
            throw new AFe1iSDK();
        }
        AFe1uSDK aFe1uSDK3 = AFe1uSDK.FAILURE;
        int i5 = 0;
        while (i5 <= 2) {
            boolean z7 = i5 >= 2;
            this.copy.toString = System.currentTimeMillis();
            try {
                try {
                    aFe1uSDK = super.getRevenue();
                    ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                    if (responseNetwork != null) {
                        int statusCode2 = responseNetwork.getStatusCode();
                        if (statusCode2 != 403 && statusCode2 < 500) {
                            z5 = false;
                            if (!responseNetwork.isSuccessful() && statusCode2 != 404) {
                                if (!z7) {
                                    if (!z5) {
                                    }
                                }
                                this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode2));
                                aFe1uSDK2 = AFe1uSDK.FAILURE;
                                return aFe1uSDK2;
                            }
                            map = (Map) responseNetwork.getBody();
                            statusCode = responseNetwork.getStatusCode();
                            bool = (Boolean) map.get("iscache");
                            if (statusCode == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.toString.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb2.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.toString.getRevenue("attributionId", new JSONObject(map).toString());
                            if (!this.toString.getMediationNetwork("sixtyDayConversionData", false)) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.hashCode = map;
                            aFe1uSDK2 = AFe1uSDK.SUCCESS;
                            return aFe1uSDK2;
                        }
                        z5 = true;
                        if (!responseNetwork.isSuccessful()) {
                            if (!z7) {
                            }
                            this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode2));
                            aFe1uSDK2 = AFe1uSDK.FAILURE;
                            return aFe1uSDK2;
                        }
                        map = (Map) responseNetwork.getBody();
                        statusCode = responseNetwork.getStatusCode();
                        bool = (Boolean) map.get("iscache");
                        if (statusCode == 404) {
                        }
                        if (bool != null) {
                            this.toString.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.toString.getRevenue("attributionId", new JSONObject(map).toString());
                        if (!this.toString.getMediationNetwork("sixtyDayConversionData", false)) {
                        }
                        this.hashCode = map;
                        aFe1uSDK2 = AFe1uSDK.SUCCESS;
                        return aFe1uSDK2;
                    }
                } catch (AFe1nSDK e7) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFKeystoreWrapper = "AppsFlyer dev key is missing";
                    throw e7;
                } catch (Exception e9) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e9.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e9, false, false);
                    aFe1uSDK = AFe1uSDK.FAILURE;
                    if (z7) {
                        this.AFKeystoreWrapper = e9.getMessage();
                        throw e9;
                    }
                }
                aFe1uSDK3 = aFe1uSDK;
                i5++;
            } finally {
                this.copy.getMonetizationNetwork(i5);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1uSDK3;
    }
}
