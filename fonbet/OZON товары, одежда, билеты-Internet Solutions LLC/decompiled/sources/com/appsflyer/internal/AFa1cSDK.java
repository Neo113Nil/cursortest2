package com.appsflyer.internal;

import N3.C3660k;
import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AFa1cSDK implements Runnable {
    final String AFInAppEventParameterName;
    final String AFInAppEventType;
    final String AFKeystoreWrapper;
    private final Map<String, String> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final String f57361d;

    /* renamed from: e, reason: collision with root package name */
    private final AFd1sSDK f57362e;
    private final String unregisterClient;
    private final String valueOf;
    private final WeakReference<Context> values;

    AFa1cSDK(Context context, String str, AFd1sSDK aFd1sSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.values = new WeakReference<>(context);
        this.valueOf = str;
        this.unregisterClient = str2;
        this.AFInAppEventParameterName = str4;
        this.AFInAppEventType = str5;
        this.AFKeystoreWrapper = str6;
        this.AFLogger = map;
        this.f57361d = str3;
        this.f57362e = aFd1sSDK;
    }

    static void AFInAppEventParameterName(boolean z11, String str, String str2, String str3, String str4) {
        if (AFb1tSDK.AFKeystoreWrapper != null) {
            StringBuilder d11 = C3660k.d("Validate callback parameters: ", str, " ", str2, " ");
            d11.append(str3);
            AFLogger.afDebugLog(d11.toString());
            if (z11) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1tSDK.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1tSDK.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static AFf1hSDK AFInAppEventType(Context context, @NonNull AFh1lSDK aFh1lSDK) {
        AFb1tSDK.valueOf().AFInAppEventParameterName(context);
        AFd1mSDK values = AFb1tSDK.valueOf().values();
        aFh1lSDK.AFInAppEventType(values.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0));
        AFf1hSDK aFf1hSDK = new AFf1hSDK(aFh1lSDK, values);
        AFe1fSDK afInfoLog = values.afInfoLog();
        afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFf1hSDK));
        return aFf1hSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.valueOf;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.values.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.unregisterClient);
            hashMap.put("sig-data", this.AFInAppEventParameterName);
            hashMap.put("signature", this.f57361d);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFLogger;
            String AFKeystoreWrapper = AFb1tSDK.valueOf().values().values().AFKeystoreWrapper("referrer", "");
            AFh1kSDK aFh1kSDK = new AFh1kSDK();
            aFh1kSDK.f57364d = AFKeystoreWrapper;
            AFb1tSDK valueOf = AFb1tSDK.valueOf();
            Map<String, Object> valueOf2 = valueOf.valueOf(aFh1kSDK);
            valueOf2.put("price", this.AFInAppEventType);
            valueOf2.put("currency", this.AFKeystoreWrapper);
            valueOf2.put("receipt_data", hashMap2);
            if (obj != null) {
                valueOf2.put("extra_prms", obj);
            }
            valueOf2.putAll(valueOf.values().force().values());
            aFh1kSDK.AFInAppEventParameterName((Map<String, ?>) valueOf2);
            aFh1kSDK.AFInAppEventParameterName(new AFi1eSDK(this.f57362e).values(aFh1kSDK));
            AFInAppEventType(context, aFh1kSDK);
            hashMap.put("dev_key", this.valueOf);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1xSDK aFh1xSDK = AFb1tSDK.valueOf().values().AFInAppEventType().valueOf.f57393e;
            AFa1bSDK aFa1bSDK = aFh1xSDK != null ? new AFa1bSDK(aFh1xSDK.AFInAppEventType, aFh1xSDK.unregisterClient) : null;
            String str2 = aFa1bSDK != null ? aFa1bSDK.AFInAppEventParameterName : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1jSDK aFh1jSDK = (AFh1jSDK) new AFh1jSDK().AFInAppEventParameterName(hashMap);
            aFh1jSDK.AFInAppEventParameterName(new AFi1eSDK(this.f57362e).values(aFh1jSDK));
            final AFf1hSDK AFInAppEventType = AFInAppEventType(context, aFh1jSDK);
            aFh1jSDK.AFInAppEventType = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1cSDK.1
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i11, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i11 == 50 && (responseNetwork = AFInAppEventType.AFLogger) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    AFa1cSDK.AFInAppEventParameterName(false, aFa1cSDK.AFInAppEventParameterName, aFa1cSDK.AFInAppEventType, aFa1cSDK.AFKeystoreWrapper, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) AFInAppEventType.AFLogger.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean optBoolean = jSONObject.optBoolean("result");
                        AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                        AFa1cSDK.AFInAppEventParameterName(optBoolean, aFa1cSDK.AFInAppEventParameterName, aFa1cSDK.AFInAppEventType, aFa1cSDK.AFKeystoreWrapper, jSONObject.toString());
                    } catch (Exception e11) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e11)), e11);
                        AFa1cSDK aFa1cSDK2 = AFa1cSDK.this;
                        AFa1cSDK.AFInAppEventParameterName(false, aFa1cSDK2.AFInAppEventParameterName, aFa1cSDK2.AFInAppEventType, aFa1cSDK2.AFKeystoreWrapper, e11.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFb1tSDK.AFKeystoreWrapper != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                AFInAppEventParameterName(false, this.AFInAppEventParameterName, this.AFInAppEventType, this.AFKeystoreWrapper, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }
}
