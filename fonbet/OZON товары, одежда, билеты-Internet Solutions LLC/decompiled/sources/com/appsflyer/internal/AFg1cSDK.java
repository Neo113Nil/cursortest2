package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1cSDK {
    public final Map<String, Object> AFInAppEventParameterName;
    public final AFd1tSDK AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public long f57459d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f57460e;

    /* renamed from: i, reason: collision with root package name */
    public long f57461i;
    public long registerClient;
    public final long[] unregisterClient;
    public long valueOf;
    public final Map<String, Object> values;

    /* renamed from: w, reason: collision with root package name */
    public long f57462w;

    public AFg1cSDK(AFd1tSDK aFd1tSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.values = concurrentHashMap3;
        this.valueOf = 0L;
        this.f57459d = 0L;
        this.AFLogger = new long[2];
        this.unregisterClient = new long[2];
        this.f57460e = new long[2];
        this.registerClient = 0L;
        this.f57462w = 0L;
        this.AFInAppEventType = aFd1tSDK;
        concurrentHashMap.putAll(values("first_launch"));
        concurrentHashMap2.putAll(values("ddl"));
        concurrentHashMap3.putAll(values("gcd"));
        this.f57461i = aFd1tSDK.AFKeystoreWrapper("prev_session_dur", 0L);
    }

    public final void AFKeystoreWrapper() {
        this.f57459d = System.currentTimeMillis();
        if (values()) {
            long j11 = this.valueOf;
            if (j11 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.AFInAppEventParameterName.put("init_to_fg", Long.valueOf(this.f57459d - j11));
            this.AFInAppEventType.valueOf("first_launch", new JSONObject(this.AFInAppEventParameterName).toString());
        }
    }

    public final void valueOf(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        this.registerClient = currentTimeMillis;
        if (i11 == 1) {
            long j11 = this.f57459d;
            if (j11 == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.AFInAppEventParameterName.put("from_fg", Long.valueOf(currentTimeMillis - j11));
            this.AFInAppEventType.valueOf("first_launch", new JSONObject(this.AFInAppEventParameterName).toString());
        }
    }

    public final void values(AFh1zSDK aFh1zSDK) {
        if (values()) {
            this.AFInAppEventParameterName.put("start_with", aFh1zSDK.toString());
            this.AFInAppEventType.valueOf("first_launch", new JSONObject(this.AFInAppEventParameterName).toString());
        }
    }

    private Map<String, Object> values(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String AFKeystoreWrapper = this.AFInAppEventType.AFKeystoreWrapper(str, (String) null);
        if (AFKeystoreWrapper != null) {
            try {
                return AFa1qSDK.values(new JSONObject(AFKeystoreWrapper));
            } catch (Exception e11) {
                AFLogger.afErrorLog("Error while parsing cached json data", e11, true);
            }
        }
        return map;
    }

    public final void valueOf(DeepLinkResult deepLinkResult, long j11) {
        this.AFKeystoreWrapper.put("status", deepLinkResult.getStatus().toString());
        this.AFKeystoreWrapper.put("timeout_value", Long.valueOf(j11));
        this.AFInAppEventType.valueOf("ddl", new JSONObject(this.AFKeystoreWrapper).toString());
    }

    public final void AFKeystoreWrapper(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f57462w;
        if (j11 != 0) {
            this.values.put("net", Long.valueOf(currentTimeMillis - j11));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.values.put("retries", Integer.valueOf(i11));
        this.AFInAppEventType.valueOf("gcd", new JSONObject(this.values).toString());
    }

    public final boolean values() {
        return this.AFInAppEventType.AFInAppEventParameterName("appsFlyerCount", 0) == 0;
    }
}
