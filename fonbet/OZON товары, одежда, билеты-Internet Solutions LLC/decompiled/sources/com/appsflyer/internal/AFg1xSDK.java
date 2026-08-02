package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFg1xSDK {

    @NonNull
    public final AFd1kSDK AFInAppEventType;
    Map<String, Object> AFKeystoreWrapper;
    public volatile String registerClient;
    public volatile String unregisterClient;

    @NonNull
    public final AFg1zSDK valueOf;
    public long values;
    public boolean AFInAppEventParameterName = false;
    public volatile boolean AFLogger = false;

    public AFg1xSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull AFg1zSDK aFg1zSDK) {
        this.AFInAppEventType = aFd1kSDK;
        this.valueOf = aFg1zSDK;
    }

    final void AFInAppEventParameterName() {
        this.AFKeystoreWrapper.put("ttr", Long.valueOf(System.currentTimeMillis() - this.values));
        this.AFKeystoreWrapper.put("lvl_timestamp", Long.valueOf(this.values));
    }

    public final Map<String, Object> AFInAppEventType(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFInAppEventType.valueOf};
                Map<Integer, Object> map2 = AFc1iSDK.afErrorLog;
                Object obj = map2.get(544149616);
                if (obj == null) {
                    obj = ((Class) AFc1iSDK.AFInAppEventParameterName((ViewConfiguration.getPressedStateDuration() >> 16) + 36, (char) (55716 - (ViewConfiguration.getTapTimeout() >> 16)), Color.green(0) + 124)).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(544149616, obj);
                }
                return (Map) ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", e11);
            return new HashMap();
        }
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFLogger;
    }

    public final boolean valueOf() {
        return this.AFInAppEventParameterName && !AFInAppEventType();
    }

    public final String values(AFd1tSDK aFd1tSDK) {
        String str;
        boolean z11 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFKeystoreWrapper = aFd1tSDK.AFKeystoreWrapper("imeiCached", (String) null);
        if (z11 && AFc1rSDK.AFInAppEventType(this.unregisterClient)) {
            Context context = this.AFInAppEventType.valueOf;
            if (context != null && AFKeystoreWrapper(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e11) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFKeystoreWrapper));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e11.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e11);
                } catch (Exception e12) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFKeystoreWrapper));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e12.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e12);
                }
                if (str == null) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFKeystoreWrapper));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    str = AFKeystoreWrapper;
                }
            }
            str = null;
        } else {
            if (this.unregisterClient != null) {
                str = this.unregisterClient;
            }
            str = null;
        }
        if (AFc1rSDK.AFInAppEventType(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFd1tSDK.valueOf("imeiCached", str);
        return str;
    }

    private static boolean AFKeystoreWrapper(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1tSDK.valueOf();
        return !AFb1tSDK.valueOf(context);
    }

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.AFKeystoreWrapper;
        return (map == null || map.isEmpty()) ? false : true;
    }

    @NonNull
    public final Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        if (AFInAppEventType()) {
            hashMap.put("lvl", this.AFKeystoreWrapper);
            return hashMap;
        }
        if (this.AFInAppEventParameterName) {
            this.AFKeystoreWrapper = new HashMap();
            AFInAppEventParameterName();
            this.AFKeystoreWrapper.put("error", "pending LVL response");
            hashMap.put("lvl", this.AFKeystoreWrapper);
        }
        return hashMap;
    }
}
