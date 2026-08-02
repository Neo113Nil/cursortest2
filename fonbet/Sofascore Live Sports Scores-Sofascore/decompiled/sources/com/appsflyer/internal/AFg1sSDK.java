package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1sSDK extends AFe1vSDK<Void> {

    @Nullable
    private final Throwable force;

    @Nullable
    private final AppsFlyerConversionListener i;
    private final AFc1pSDK registerClient;
    private final AFc1hSDK v;

    @Nullable
    private final AFd1iSDK<String> w;

    public AFg1sSDK(AFf1wSDK aFf1wSDK, AFc1pSDK aFc1pSDK, AFc1hSDK aFc1hSDK, @Nullable AppsFlyerConversionListener appsFlyerConversionListener) {
        super(AFd1aSDK.afErrorLog, new AFe1zSDK[]{AFd1aSDK.registerClient}, "GCD-CHECK");
        this.force = aFf1wSDK.force();
        this.w = ((AFe1oSDK) aFf1wSDK).w;
        this.registerClient = aFc1pSDK;
        this.v = aFc1hSDK;
        this.i = appsFlyerConversionListener;
    }

    @Nullable
    private Map<String, Object> i() {
        String d = this.registerClient.d("attributionId");
        if (d == null) {
            return null;
        }
        try {
            new AFd1sSDK();
            return AFd1sSDK.AFLogger(d);
        } catch (JSONException e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GCD;
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage() != null ? e.getMessage() : "JSON parsing error");
            aFLogger.e(logTag, sb.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    @NonNull
    public final AFd1bSDK unregisterClient() throws Exception {
        int d = this.v.AFKeystoreWrapper.d("appsFlyerCount", 0);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.GCD;
        aFLogger.d(logTag, "[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(d)));
        long AFKeystoreWrapper = this.registerClient.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", 0L);
        if (AFKeystoreWrapper != 0 && System.currentTimeMillis() - AFKeystoreWrapper > 5184000000L) {
            aFLogger.d(logTag, "[GCD-E02] Cached conversion data expired");
            this.registerClient.unregisterClient("sixtyDayConversionData", true);
            this.registerClient.d("attributionId", (String) null);
            this.registerClient.AFLogger("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> i = i();
        if (i != null) {
            try {
                if (!i.containsKey("is_first_launch")) {
                    i.put("is_first_launch", Boolean.FALSE);
                }
                AFg1tSDK.AFKeystoreWrapper(i, this.i);
            } catch (Exception e) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.GCD;
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage() != null ? e.getLocalizedMessage() : "unknown error");
                aFLogger2.e(logTag2, sb.toString(), e);
            }
            return AFd1bSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            AFLogger aFLogger3 = AFLogger.INSTANCE;
            LogTag logTag3 = LogTag.GCD;
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e2.getLocalizedMessage() != null ? e2.getLocalizedMessage() : "unknown error");
            aFLogger3.e(logTag3, sb2.toString(), e2);
        }
        if (this.force != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.force.getMessage());
            AFg1tSDK.registerClient(sb3.toString(), this.i);
            return AFd1bSDK.SUCCESS;
        }
        AFd1iSDK<String> aFd1iSDK = this.w;
        if (aFd1iSDK != null && !aFd1iSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.w.getStatusCode());
            AFg1tSDK.registerClient(sb4.toString(), this.i);
            return AFd1bSDK.SUCCESS;
        }
        return AFd1bSDK.FAILURE;
    }
}
