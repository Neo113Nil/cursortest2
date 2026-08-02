package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFb1ySDK implements Runnable {
    final String AFAdRevenueData;
    private final AFd1rSDK areAllFieldsValid;
    private final String component1;
    private final Map<String, String> component2;
    private final String component4;
    private final WeakReference<Context> getCurrencyIso4217Code;
    private final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    AFb1ySDK(Context context, String str, AFd1rSDK aFd1rSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getCurrencyIso4217Code = new WeakReference<>(context);
        this.getMediationNetwork = str;
        this.component1 = str2;
        this.getMonetizationNetwork = str4;
        this.getRevenue = str5;
        this.AFAdRevenueData = str6;
        this.component2 = map;
        this.component4 = str3;
        this.areAllFieldsValid = aFd1rSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getCurrencyIso4217Code.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.component1);
            hashMap.put("sig-data", this.getMonetizationNetwork);
            hashMap.put("signature", this.component4);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.component2;
            String AFAdRevenueData = AFb1rSDK.getRevenue().getCurrencyIso4217Code().getMediationNetwork().AFAdRevenueData("referrer", "");
            AFi1zSDK aFi1zSDK = new AFi1zSDK();
            aFi1zSDK.areAllFieldsValid = AFAdRevenueData;
            AFi1zSDK aFi1zSDK2 = aFi1zSDK;
            AFb1rSDK revenue = AFb1rSDK.getRevenue();
            Map<String, Object> currencyIso4217Code = revenue.getCurrencyIso4217Code(aFi1zSDK);
            currencyIso4217Code.put(FirebaseAnalytics.Param.PRICE, this.getRevenue);
            currencyIso4217Code.put("currency", this.AFAdRevenueData);
            currencyIso4217Code.put("receipt_data", hashMap2);
            if (obj != null) {
                currencyIso4217Code.put("extra_prms", obj);
            }
            currencyIso4217Code.putAll(revenue.getCurrencyIso4217Code().AFInAppEventType().getCurrencyIso4217Code());
            aFi1zSDK.getRevenue((Map<String, ?>) currencyIso4217Code);
            aFi1zSDK.getMonetizationNetwork(new AFj1iSDK(this.areAllFieldsValid).AFAdRevenueData(aFi1zSDK));
            getMonetizationNetwork(context, aFi1zSDK);
            hashMap.put("dev_key", this.getMediationNetwork);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1pSDK aFh1pSDK = AFb1rSDK.getRevenue().getCurrencyIso4217Code().getCurrencyIso4217Code().AFAdRevenueData.areAllFieldsValid;
            AFb1tSDK aFb1tSDK = aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.getMediationNetwork, aFh1pSDK.component1) : null;
            String str2 = aFb1tSDK != null ? aFb1tSDK.getMediationNetwork : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1iSDK aFh1iSDK = (AFh1iSDK) new AFh1iSDK().getRevenue(hashMap);
            aFh1iSDK.getMonetizationNetwork(new AFj1iSDK(this.areAllFieldsValid).AFAdRevenueData(aFh1iSDK));
            final AFf1gSDK monetizationNetwork = getMonetizationNetwork(context, aFh1iSDK);
            aFh1iSDK.getMediationNetwork = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFb1ySDK.2
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1pSDK) monetizationNetwork).areAllFieldsValid.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFb1ySDK.getMonetizationNetwork(jSONObject.optBoolean("result"), AFb1ySDK.this.getMonetizationNetwork, AFb1ySDK.this.getRevenue, AFb1ySDK.this.AFAdRevenueData, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFb1ySDK.getMonetizationNetwork(false, AFb1ySDK.this.getMonetizationNetwork, AFb1ySDK.this.getRevenue, AFb1ySDK.this.AFAdRevenueData, e.getMessage());
                    }
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1pSDK) monetizationNetwork).areAllFieldsValid) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFb1ySDK.getMonetizationNetwork(false, AFb1ySDK.this.getMonetizationNetwork, AFb1ySDK.this.getRevenue, AFb1ySDK.this.AFAdRevenueData, str3);
                }
            };
        } catch (Throwable th) {
            if (AFb1rSDK.getMonetizationNetwork != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getMonetizationNetwork(false, this.getMonetizationNetwork, this.getRevenue, this.AFAdRevenueData, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFf1gSDK getMonetizationNetwork(Context context, AFh1hSDK aFh1hSDK) {
        AFb1rSDK.getRevenue().getRevenue(context);
        AFd1kSDK currencyIso4217Code = AFb1rSDK.getRevenue().getCurrencyIso4217Code();
        aFh1hSDK.getMediationNetwork(currencyIso4217Code.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        AFf1gSDK aFf1gSDK = new AFf1gSDK(aFh1hSDK, currencyIso4217Code);
        AFf1zSDK copydefault = currencyIso4217Code.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1gSDK));
        return aFf1gSDK;
    }

    static void getMonetizationNetwork(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1rSDK.getMonetizationNetwork != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1rSDK.getMonetizationNetwork.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1rSDK.getMonetizationNetwork;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
