package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFc1uSDK {
    static JSONObject getMediationNetwork(String str) {
        JSONObject currencyIso4217Code = AFa1oSDK.getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            try {
                if (currencyIso4217Code.has("ol_id")) {
                    String optString = currencyIso4217Code.optString("ol_scheme", null);
                    String optString2 = currencyIso4217Code.optString("ol_domain", null);
                    String optString3 = currencyIso4217Code.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return currencyIso4217Code;
                    }
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb.toString(), th);
                AFb1rSDK.getRevenue().getCurrencyIso4217Code().equals().AFAdRevenueData();
                AFb1rSDK.getRevenue().getCurrencyIso4217Code().equals().getMonetizationNetwork();
            }
        }
        return currencyIso4217Code;
    }
}
