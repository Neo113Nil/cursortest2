package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AFa1mSDK implements AFd1dSDK<AFa1rSDK> {
    @Override // com.appsflyer.internal.AFd1dSDK
    public final /* synthetic */ AFa1rSDK AFAdRevenueData(String str) {
        JSONObject optJSONObject;
        String str2 = str;
        DeepLink deepLink = null;
        if (str2 != null && str2.length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("found", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
            if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
                deepLink = DeepLink.AFAdRevenueData(optJSONObject);
                deepLink.getMediationNetwork.put("is_deferred", true);
            }
            return new AFa1rSDK(optBoolean2, deepLink);
        }
        return new AFa1rSDK(false, null, 3, null);
    }
}
