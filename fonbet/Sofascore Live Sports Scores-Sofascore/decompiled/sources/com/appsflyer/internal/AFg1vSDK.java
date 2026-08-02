package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1vSDK extends AFe1oSDK<Map<String, Object>> {
    private static final List<String> i = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFg1fSDK AFLoggerLogLevel;

    @Nullable
    private Map<String, Object> afDebugLog;
    private final AFc1hSDK afErrorLog;

    @Nullable
    private final AppsFlyerConversionListener afInfoLog;
    private final AFc1pSDK afWarnLog;
    private final AFd1tSDK e;

    @Nullable
    private String getEntries;

    public AFg1vSDK(@NonNull AFc1aSDK aFc1aSDK) {
        super(AFd1aSDK.afErrorLog, new AFe1zSDK[]{AFd1aSDK.registerClient}, aFc1aSDK, "GCD-FETCH");
        this.e = aFc1aSDK.d();
        this.afWarnLog = aFc1aSDK.registerClient();
        this.AFLoggerLogLevel = aFc1aSDK.force();
        this.afErrorLog = aFc1aSDK.AFKeystoreWrapper();
        this.afInfoLog = aFc1aSDK.setOutOfStore();
        this.AFLogger.add(AFd1aSDK.unregisterClient);
        this.AFLogger.add(AFd1aSDK.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        super.AFLogger();
        Map<String, Object> map = this.afDebugLog;
        String str = this.getEntries;
        if (map != null) {
            AFg1tSDK.AFKeystoreWrapper(map, this.afInfoLog);
        } else if (str == null || str.isEmpty()) {
            AFg1tSDK.registerClient("Unknown error", this.afInfoLog);
        } else {
            AFg1tSDK.registerClient(str, this.afInfoLog);
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final AFd1qSDK<Map<String, Object>> d(@NonNull String str) {
        AFc1pSDK aFc1pSDK = this.afWarnLog;
        String AFLogger = this.afErrorLog.AFLogger("CHANNEL");
        String str2 = "";
        if (AFLogger != null && AFLogger.equals("")) {
            AFLogger = null;
        }
        String d = AFa1zSDK.d(aFc1pSDK, AFLogger);
        if (d != null && !d.trim().isEmpty()) {
            if (i.contains(d.toLowerCase(Locale.ROOT))) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GCD;
                Locale locale = Locale.US;
                aFLogger.w(logTag, "[GCD] AF detected using redundant Google-Play channel for attribution - " + d + ". Using without channel postfix.");
            } else {
                str2 = "-".concat(d);
            }
        }
        AFd1tSDK aFd1tSDK = this.e;
        AFd1qSDK<Map<String, Object>> aFd1qSDK = (AFd1qSDK) AFd1tSDK.registerClient(new Object[]{aFd1tSDK, str2, str}, 886078342, -886078341, System.identityHashCode(aFd1tSDK));
        AFLogger aFLogger2 = AFLogger.INSTANCE;
        LogTag logTag2 = LogTag.GCD;
        StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
        sb.append(aFd1qSDK.unregisterClient.registerClient);
        aFLogger2.i(logTag2, sb.toString());
        return aFd1qSDK;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    @NonNull
    public final AFd1bSDK unregisterClient() throws Exception {
        AFd1bSDK aFd1bSDK;
        if (this.force.AFLogger()) {
            AFLogger.INSTANCE.d(LogTag.GCD, "[GCD-E03] 'isStopTracking' enabled");
            this.getEntries = "'isStopTracking' enabled";
            throw new AFe1qSDK();
        }
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.FAILURE;
        int i2 = 0;
        while (i2 <= 2) {
            boolean z = true;
            boolean z2 = i2 >= 2;
            this.AFLoggerLogLevel.afErrorLog = System.currentTimeMillis();
            try {
                try {
                    try {
                        AFd1bSDK unregisterClient = super.unregisterClient();
                        ResponseNetwork responseNetwork = ((AFe1oSDK) this).w;
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
                                this.getEntries = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFd1bSDK = AFd1bSDK.FAILURE;
                                return aFd1bSDK;
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
                                this.afWarnLog.AFLogger("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    AFLogger aFLogger = AFLogger.INSTANCE;
                                    LogTag logTag = LogTag.GCD;
                                    StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    aFLogger.d(logTag, sb.toString());
                                } else {
                                    AFLogger.INSTANCE.d(LogTag.GCD, String.format(Locale.US, "[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.afWarnLog.d("attributionId", new JSONObject(map).toString());
                            if (!this.afWarnLog.registerClient("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afDebugLog = map;
                            aFd1bSDK = AFd1bSDK.SUCCESS;
                            return aFd1bSDK;
                        }
                        aFd1bSDK2 = unregisterClient;
                    } catch (Exception e) {
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        LogTag logTag2 = LogTag.GCD;
                        StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                        sb2.append(e.getMessage() != null ? e.getMessage() : "unknown error during GCD fetch");
                        aFLogger2.e(logTag2, sb2.toString(), e, true, false, false);
                        aFd1bSDK2 = AFd1bSDK.FAILURE;
                        if (z2) {
                            this.getEntries = e.getMessage();
                            throw e;
                        }
                        this.AFLoggerLogLevel.registerClient(i2);
                        aFLogger2.d(logTag2, "[GCD-A03] Server retrieving attempt finished");
                    }
                    i2++;
                } catch (AFe1uSDK e2) {
                    AFLogger.INSTANCE.d(LogTag.GCD, "[GCD-E05] AppsFlyer dev key is missing");
                    this.getEntries = "AppsFlyer dev key is missing";
                    throw e2;
                }
            } finally {
                this.AFLoggerLogLevel.registerClient(i2);
                AFLogger.INSTANCE.d(LogTag.GCD, "[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFd1bSDK2;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }
}
