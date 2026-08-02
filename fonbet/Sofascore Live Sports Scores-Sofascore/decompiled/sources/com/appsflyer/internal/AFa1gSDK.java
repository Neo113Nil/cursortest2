package com.appsflyer.internal;

import com.appsflyer.share.deeplink.DeepLink;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1gSDK implements AFd1jSDK<AFa1lSDK> {
    @Override // com.appsflyer.internal.AFd1jSDK
    public final /* synthetic */ AFa1lSDK registerClient(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str == null || str.length() == 0) {
            return new AFa1lSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("found", false);
        boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLink = DeepLink.parse(optJSONObject).setDeferred(true);
        }
        return new AFa1lSDK(optBoolean2, deepLink);
    }
}
