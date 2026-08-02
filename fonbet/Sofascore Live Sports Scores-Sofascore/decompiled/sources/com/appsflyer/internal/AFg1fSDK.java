package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1fSDK {
    public final AFc1pSDK AFLogger;
    public long afWarnLog;
    public final AFc1hSDK d;
    public final Map<String, Object> registerClient = new ConcurrentHashMap();
    public final Map<String, Object> unregisterClient = new ConcurrentHashMap();
    public final Map<String, Object> AFKeystoreWrapper = new ConcurrentHashMap();
    public long e = 0;
    public long w = 0;
    public final long[] i = new long[2];
    public final long[] v = new long[2];
    public final long[] force = new long[2];
    public long afInfoLog = 0;
    public long afErrorLog = 0;

    public AFg1fSDK(AFc1pSDK aFc1pSDK, AFc1hSDK aFc1hSDK) {
        this.AFLogger = aFc1pSDK;
        this.d = aFc1hSDK;
    }

    public final Map<String, Object> AFLogger(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String d = this.AFLogger.d(str);
        if (d != null) {
            try {
                return AFg1nSDK.registerClient(new JSONObject(d));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Error while parsing cached JSON data for metrics", e);
            }
        }
        return map;
    }

    public final void d(AFg1hSDK aFg1hSDK) {
        if (this.d.AFKeystoreWrapper.d("appsFlyerCount", 0) == 0) {
            this.registerClient.put("api_name", aFg1hSDK.toString());
            this.AFLogger.d("first_launch", new JSONObject(this.registerClient).toString());
        }
    }

    public final void registerClient(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.afErrorLog;
        if (j != 0) {
            this.AFKeystoreWrapper.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: GCD start timestamp not recorded");
        }
        this.AFKeystoreWrapper.put("retries", Integer.valueOf(i));
        this.AFLogger.d("gcd", new JSONObject(this.AFKeystoreWrapper).toString());
    }

    public final void unregisterClient() {
        this.w = System.currentTimeMillis();
        if (this.d.AFKeystoreWrapper.d("appsFlyerCount", 0) == 0) {
            long j = this.e;
            if (j == 0) {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: initialization timestamp not recorded");
                return;
            }
            this.registerClient.put("init_to_fg", Long.valueOf(this.w - j));
            this.AFLogger.d("first_launch", new JSONObject(this.registerClient).toString());
        }
    }

    public final void unregisterClient(DeepLinkResult deepLinkResult, long j) {
        this.unregisterClient.put("status", deepLinkResult.getStatus().toString());
        this.unregisterClient.put("timeout_value", Long.valueOf(j));
    }
}
