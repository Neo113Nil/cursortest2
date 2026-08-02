package com.appsflyer.internal;

import android.content.Context;
import com.applovin.sdk.AppLovinEventParameters;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFa1vSDK implements Runnable {
    private final String AFAdRevenueData;
    private final String component2;
    private final Map<String, String> component3;
    private final String component4;
    final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    final String getMonetizationNetwork;
    private final WeakReference<Context> getRevenue;

    AFa1vSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getRevenue = new WeakReference<>(context);
        this.AFAdRevenueData = str;
        this.component4 = str2;
        this.getCurrencyIso4217Code = str4;
        this.getMonetizationNetwork = str5;
        this.getMediationNetwork = str6;
        this.component3 = map;
        this.component2 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFAdRevenueData;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getRevenue.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.component4);
            hashMap.put("sig-data", this.getCurrencyIso4217Code);
            hashMap.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.component2);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.component3;
            String AFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().component1().AFAdRevenueData("referrer", "");
            AFh1eSDK aFh1eSDK = new AFh1eSDK();
            aFh1eSDK.areAllFieldsValid = AFAdRevenueData;
            AFh1eSDK aFh1eSDK2 = aFh1eSDK;
            AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
            Map<String, Object> monetizationNetwork2 = monetizationNetwork.getMonetizationNetwork(aFh1eSDK);
            monetizationNetwork2.put("price", this.getMonetizationNetwork);
            monetizationNetwork2.put("currency", this.getMediationNetwork);
            monetizationNetwork2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, hashMap2);
            if (obj != null) {
                monetizationNetwork2.put("extra_prms", obj);
            }
            monetizationNetwork2.putAll(monetizationNetwork.AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code());
            aFh1eSDK.getCurrencyIso4217Code(monetizationNetwork2);
            getCurrencyIso4217Code(context, aFh1eSDK);
            hashMap.put("dev_key", this.AFAdRevenueData);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1xSDK aFh1xSDK = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().getRevenue().getMediationNetwork.component2;
            AFb1lSDK aFb1lSDK = aFh1xSDK != null ? new AFb1lSDK(aFh1xSDK.getMonetizationNetwork, aFh1xSDK.component3) : null;
            String str2 = aFb1lSDK != null ? aFb1lSDK.getMonetizationNetwork : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1kSDK aFh1kSDK = (AFh1kSDK) new AFh1kSDK().getCurrencyIso4217Code(hashMap);
            final AFf1tSDK currencyIso4217Code = getCurrencyIso4217Code(context, aFh1kSDK);
            aFh1kSDK.AFAdRevenueData = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1vSDK.5
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFe1kSDK) currencyIso4217Code).component2.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1vSDK.getMediationNetwork(jSONObject.optBoolean("result"), AFa1vSDK.this.getCurrencyIso4217Code, AFa1vSDK.this.getMonetizationNetwork, AFa1vSDK.this.getMediationNetwork, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1vSDK.getMediationNetwork(false, AFa1vSDK.this.getCurrencyIso4217Code, AFa1vSDK.this.getMonetizationNetwork, AFa1vSDK.this.getMediationNetwork, e.getMessage());
                    }
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFe1kSDK) currencyIso4217Code).component2) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1vSDK.getMediationNetwork(false, AFa1vSDK.this.getCurrencyIso4217Code, AFa1vSDK.this.getMonetizationNetwork, AFa1vSDK.this.getMediationNetwork, str3);
                }
            };
        } catch (Throwable th) {
            if (AFa1zSDK.getMediationNetwork != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getMediationNetwork(false, this.getCurrencyIso4217Code, this.getMonetizationNetwork, this.getMediationNetwork, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFf1tSDK getCurrencyIso4217Code(Context context, AFh1jSDK aFh1jSDK) {
        AFa1zSDK.getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFc1fSDK AFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData();
        aFh1jSDK.getRevenue(AFAdRevenueData.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        AFf1tSDK aFf1tSDK = new AFf1tSDK(aFh1jSDK, AFAdRevenueData);
        AFe1sSDK equals = AFAdRevenueData.equals();
        equals.getRevenue.execute(equals.new AnonymousClass3(aFf1tSDK));
        return aFf1tSDK;
    }

    static void getMediationNetwork(boolean z, String str, String str2, String str3, String str4) {
        if (AFa1zSDK.getMediationNetwork != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(ServerSentEventKt.SPACE).append(str2).append(ServerSentEventKt.SPACE).append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1zSDK.getMediationNetwork.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1zSDK.getMediationNetwork;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
