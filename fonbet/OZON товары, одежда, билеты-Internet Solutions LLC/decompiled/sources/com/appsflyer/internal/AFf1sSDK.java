package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class AFf1sSDK extends AFf1rSDK<String> {
    private final String afDebugLog;
    private final String afErrorLog;
    private final AFf1zSDK afInfoLog;
    private final PurchaseHandler.PurchaseValidationCallback afVerboseLog;

    /* renamed from: e, reason: collision with root package name */
    private final AFd1sSDK f57441e;
    private final AFd1tSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFg1qSDK f57442i;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    private final Map<String, Object> f57443v;

    /* renamed from: w, reason: collision with root package name */
    private final AFg1vSDK f57444w;

    public AFf1sSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1mSDK aFd1mSDK, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1mSDK, null);
        this.afInfoLog = aFf1zSDK;
        AFd1sSDK AFInAppEventType = aFd1mSDK.AFInAppEventType();
        this.f57441e = AFInAppEventType;
        AFd1tSDK values = aFd1mSDK.values();
        this.force = values;
        AFg1qSDK unregisterClient = aFd1mSDK.unregisterClient();
        this.f57442i = unregisterClient;
        AFg1vSDK onInstallConversionFailureNative = aFd1mSDK.onInstallConversionFailureNative();
        this.f57444w = onInstallConversionFailureNative;
        String str = map.containsKey("billing_library_version") ? (String) map.remove("billing_library_version") : null;
        this.afDebugLog = str;
        String str2 = map.containsKey("connector_version") ? (String) map.remove("connector_version") : null;
        this.afErrorLog = str2;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", AFInAppEventType.AFInAppEventParameterName.valueOf.getPackageName());
        hashMap.put("event_timestamp", Long.valueOf(unregisterClient.values()));
        String AFInAppEventType2 = AFd1sSDK.AFInAppEventType();
        if (AFInAppEventType2 != null) {
            hashMap.put("cuid", AFInAppEventType2);
        }
        Context context = AFInAppEventType.AFInAppEventParameterName.valueOf;
        hashMap.put("app_version_name", AFb1uSDK.AFKeystoreWrapper(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        String valueOf = AFInAppEventType.valueOf();
        if (!AFc1rSDK.AFInAppEventType(valueOf)) {
            hashMap2.put("advertising_id", valueOf);
        }
        AFa1bSDK valueOf2 = AFb1rSDK.valueOf(AFInAppEventType.AFInAppEventParameterName.valueOf.getContentResolver());
        String str3 = valueOf2 != null ? valueOf2.AFInAppEventParameterName : null;
        if (!AFc1rSDK.AFInAppEventType(str3)) {
            hashMap2.put("oaid", str3);
        }
        AFa1bSDK valueOf3 = AFb1rSDK.valueOf(AFInAppEventType.AFInAppEventParameterName.valueOf.getContentResolver());
        String str4 = valueOf3 != null ? valueOf3.AFInAppEventParameterName : null;
        if (!AFc1rSDK.AFInAppEventType(str4)) {
            hashMap2.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String values2 = ((AFf1rSDK) this).registerClient.values(values);
            if (!AFc1rSDK.AFInAppEventType(values2)) {
                hashMap2.put("imei", values2);
            }
        }
        hashMap2.put("appsflyer_id", AFb1kSDK.AFInAppEventType(AFInAppEventType.AFInAppEventParameterName, AFInAppEventType.AFKeystoreWrapper));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb2.toString());
        hashMap2.put("sdk_version", "6.13.1");
        if (!AFc1rSDK.AFInAppEventType(str2)) {
            hashMap2.put("sdk_connector_version", str2);
        }
        hashMap.put("device_data", hashMap2);
        if (!AFc1rSDK.AFInAppEventType(str)) {
            hashMap.put("billing_lib_version", str);
        }
        onInstallConversionFailureNative.AFInAppEventParameterName(hashMap, aFf1zSDK);
        this.f57443v = hashMap;
        this.afVerboseLog = purchaseValidationCallback;
    }

    protected final void AFInAppEventParameterName(String str) {
        String jSONObject = new JSONObject(this.f57443v).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(": preparing data: ");
        sb2.append(jSONObject);
        AFb1lSDK.values(sb2.toString());
        ((AFf1rSDK) this).unregisterClient.valueOf(str, jSONObject);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFKeystoreWrapper();
        Throwable e11 = e();
        if (e11 != null && (purchaseValidationCallback2 = this.afVerboseLog) != null) {
            purchaseValidationCallback2.onFailure(e11);
        }
        ResponseNetwork<String> responseNetwork = this.AFLogger;
        if (responseNetwork == null || (purchaseValidationCallback = this.afVerboseLog) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @NonNull
    protected final Map<String, Object> force() {
        return this.f57443v;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return true;
    }

    public final String w() {
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork = this.AFLogger;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.AFInAppEventParameterName();
        }
        return true;
    }
}
