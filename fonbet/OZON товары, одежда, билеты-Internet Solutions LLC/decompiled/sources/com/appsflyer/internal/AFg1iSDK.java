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

/* loaded from: classes.dex */
public final class AFg1iSDK extends AFf1rSDK<Map<String, Object>> {

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f57468e = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String afErrorLog;
    private Map<String, Object> afInfoLog;
    private final AFd1sSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFd1tSDK f57469i;

    /* renamed from: v, reason: collision with root package name */
    private final AFg1cSDK f57470v;

    /* renamed from: w, reason: collision with root package name */
    private final AFe1wSDK f57471w;

    public AFg1iSDK(@NonNull AFd1mSDK aFd1mSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1mSDK, "GCD-FETCH");
        this.f57471w = aFd1mSDK.AFKeystoreWrapper();
        this.f57469i = aFd1mSDK.values();
        this.f57470v = aFd1mSDK.AFLogger();
        this.force = aFd1mSDK.AFInAppEventType();
        this.valueOf.add(AFf1zSDK.CONVERSION);
        this.valueOf.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        Map<String, Object> map = this.afInfoLog;
        String str = this.afErrorLog;
        if (map != null) {
            AFg1jSDK.AFInAppEventType(map);
        } else if (str == null || str.isEmpty()) {
            AFg1jSDK.AFInAppEventParameterName("Unknown error");
        } else {
            AFg1jSDK.AFInAppEventParameterName(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final boolean unregisterClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final AFe1uSDK<Map<String, Object>> valueOf(@NonNull String str) {
        String str2;
        String AFKeystoreWrapper = AFb1tSDK.AFKeystoreWrapper(this.f57469i, this.force.AFLogger());
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            if (!f57468e.contains(AFKeystoreWrapper.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(AFKeystoreWrapper);
                AFe1uSDK<Map<String, Object>> AFInAppEventType = this.f57471w.AFInAppEventType(str2, str);
                StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
                sb2.append(AFInAppEventType.AFKeystoreWrapper.valueOf);
                AFb1lSDK.values(sb2.toString());
                return AFInAppEventType;
            }
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + AFKeystoreWrapper + ". Using without channel postfix.");
        }
        str2 = "";
        AFe1uSDK<Map<String, Object>> AFInAppEventType2 = this.f57471w.AFInAppEventType(str2, str);
        StringBuilder sb22 = new StringBuilder("[GCD-B01] URL: ");
        sb22.append(AFInAppEventType2.AFKeystoreWrapper.valueOf);
        AFb1lSDK.values(sb22.toString());
        return AFInAppEventType2;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1dSDK values() throws Exception {
        AFe1dSDK aFe1dSDK;
        AFe1dSDK aFe1dSDK2;
        if (((AFf1rSDK) this).registerClient.AFKeystoreWrapper()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.afErrorLog = "'isStopTracking' enabled";
            throw new AFf1wSDK();
        }
        AFe1dSDK aFe1dSDK3 = AFe1dSDK.FAILURE;
        int i11 = 0;
        while (i11 <= 2) {
            boolean z11 = true;
            boolean z12 = i11 >= 2;
            this.f57470v.f57462w = System.currentTimeMillis();
            try {
                try {
                    aFe1dSDK = super.values();
                    ResponseNetwork responseNetwork = this.AFLogger;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z11 = false;
                        }
                        if (!responseNetwork.isSuccessful() && statusCode != 404) {
                            if (!z12) {
                                if (!z11) {
                                }
                            }
                            this.afErrorLog = "Error connection to server: ".concat(String.valueOf(statusCode));
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
                            this.f57469i.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
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
                        this.f57469i.valueOf("attributionId", new JSONObject(map).toString());
                        if (!this.f57469i.values("sixtyDayConversionData")) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.afInfoLog = map;
                        aFe1dSDK2 = AFe1dSDK.SUCCESS;
                        return aFe1dSDK2;
                    }
                } catch (AFe1aSDK e11) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.afErrorLog = "AppsFlyer dev key is missing";
                    throw e11;
                } catch (Exception e12) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e12.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e12, false, false);
                    aFe1dSDK = AFe1dSDK.FAILURE;
                    if (z12) {
                        this.afErrorLog = e12.getMessage();
                        throw e12;
                    }
                }
                aFe1dSDK3 = aFe1dSDK;
                i11++;
            } finally {
                this.f57470v.AFKeystoreWrapper(i11);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1dSDK3;
    }
}
