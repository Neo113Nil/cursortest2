package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFc1qSDK implements AFe1kSDK<AFc1oSDK> {
    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* synthetic */ AFc1oSDK AFAdRevenueData(String str) {
        JSONObject optJSONObject;
        String str2 = str;
        DeepLink deepLink = null;
        if (str2 != null && str2.length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("found", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
            if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
                deepLink = DeepLink.getMonetizationNetwork(optJSONObject);
                deepLink.AFAdRevenueData.put("is_deferred", true);
            }
            return new AFc1oSDK(optBoolean2, deepLink);
        }
        return new AFc1oSDK(false, null, 3, null);
    }
}
