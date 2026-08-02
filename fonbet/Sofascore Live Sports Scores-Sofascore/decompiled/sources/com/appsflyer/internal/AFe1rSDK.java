package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.tub;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class AFe1rSDK extends AFe1oSDK<String> {

    @NotNull
    private final AFc1hSDK AFLoggerLogLevel;

    @NotNull
    private final AFc1gSDK afDebugLog;

    @NotNull
    private final AFf1qSDK afInfoLog;

    @NotNull
    private final AFf1bSDK afWarnLog;

    @NotNull
    private final Map<String, Object> e;

    @NotNull
    private final AFe1zSDK i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1rSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFc1aSDK aFc1aSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1zSDK, aFe1zSDKArr, aFc1aSDK, null);
        aFe1zSDK.getClass();
        aFe1zSDKArr.getClass();
        aFc1aSDK.getClass();
        map.getClass();
        this.i = aFe1zSDK;
        this.e = map;
        AFc1hSDK AFKeystoreWrapper = aFc1aSDK.AFKeystoreWrapper();
        AFKeystoreWrapper.getClass();
        this.AFLoggerLogLevel = AFKeystoreWrapper;
        AFf1bSDK i = aFc1aSDK.i();
        i.getClass();
        this.afWarnLog = i;
        AFf1qSDK updateServerUninstallToken = aFc1aSDK.updateServerUninstallToken();
        updateServerUninstallToken.getClass();
        this.afInfoLog = updateServerUninstallToken;
        AFc1gSDK imeiData = aFc1aSDK.setImeiData();
        imeiData.getClass();
        this.afDebugLog = imeiData;
    }

    public void AFKeystoreWrapper(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        map.put(MBridgeConstans.APP_ID, this.AFLoggerLogLevel.registerClient.d.getPackageName());
        String str2 = this.AFLoggerLogLevel.unregisterClient.afDebugLog;
        if (str2 != null) {
            map.put("cuid", str2);
        }
        map.put("app_version_name", this.AFLoggerLogLevel.r_().versionName);
        if (i()) {
            map.put("event_timestamp", Long.valueOf(this.afWarnLog.unregisterClient()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Nullable
    public abstract AFd1qSDK<String> AFLogger(@NotNull Map<String, Object> map, @NotNull String str);

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AFd1qSDK<String> d(@NotNull String str) {
        AFd1lSDK aFd1lSDK;
        str.getClass();
        Map<String, Object> q = tub.q(this.e);
        String AFKeystoreWrapper = AFKeystoreWrapper(q);
        String d = d(q);
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(q);
        AFKeystoreWrapper(linkedHashMap, AFKeystoreWrapper);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String AFKeystoreWrapper2 = this.AFLoggerLogLevel.AFKeystoreWrapper();
        if (AFKeystoreWrapper2 != null && !StringsKt.R(AFKeystoreWrapper2)) {
            linkedHashMap2.put("advertising_id", AFKeystoreWrapper2);
        }
        AFb1kSDK d2 = AFb1jSDK.d(this.AFLoggerLogLevel.registerClient.d);
        String str2 = null;
        String str3 = d2 != null ? d2.registerClient : null;
        if (str3 != null && !StringsKt.R(str3)) {
            linkedHashMap2.put("oaid", str3);
        }
        AFb1kSDK h_ = AFb1jSDK.h_(this.AFLoggerLogLevel.registerClient.d.getContentResolver());
        String str4 = h_ != null ? h_.registerClient : null;
        if (str4 != null && !StringsKt.R(str4)) {
            linkedHashMap2.put("amazon_aid", str4);
        }
        AFc1gSDK aFc1gSDK = this.afDebugLog;
        if (aFc1gSDK.v) {
            linkedHashMap.put("deviceTrackingDisabled", "true");
        } else {
            String str5 = aFc1gSDK.force;
            if (str5 != null && !StringsKt.R(str5)) {
                linkedHashMap2.put("imei", str5);
            }
        }
        String unregisterClient = AFb1mSDK.unregisterClient(this.AFLoggerLogLevel.AFKeystoreWrapper);
        if (unregisterClient == null) {
            unregisterClient = "";
        }
        linkedHashMap2.put("appsflyer_id", unregisterClient);
        linkedHashMap2.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap2.put("sdk_version", "7.0.0");
        if (d != null && !StringsKt.R(d)) {
            linkedHashMap2.put("sdk_connector_version", d);
        }
        this.afWarnLog.AFKeystoreWrapper(linkedHashMap2, this.i);
        linkedHashMap.put("device_data", linkedHashMap2);
        this.afInfoLog.unregisterClient(linkedHashMap, this.i);
        AFd1qSDK<String> AFLogger = AFLogger(linkedHashMap, str);
        if (AFLogger != null && (aFd1lSDK = AFLogger.unregisterClient) != null) {
            str2 = aFd1lSDK.registerClient;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            AFg1kSDK.AFKeystoreWrapper(this + ": preparing data: ", jSONObject);
            AFd1ySDK aFd1ySDK = ((AFe1oSDK) this).v;
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            aFd1ySDK.unregisterClient(str2, jSONObject2);
        }
        return AFLogger;
    }

    public boolean i() {
        return false;
    }

    @Nullable
    public String AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        map.getClass();
        return null;
    }

    @Nullable
    public String d(@NotNull Map<String, Object> map) {
        map.getClass();
        return null;
    }
}
