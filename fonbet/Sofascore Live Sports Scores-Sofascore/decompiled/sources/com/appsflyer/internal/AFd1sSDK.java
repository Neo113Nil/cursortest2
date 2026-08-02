package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1sSDK implements AFd1jSDK<Map<String, Object>> {
    public static Map<String, Object> AFLogger(String str) throws JSONException {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
            }
            hashMap.remove("is_cache");
            return hashMap;
        } catch (JSONException e) {
            AFLogger.INSTANCE.e(LogTag.GCD, "Error while parsing GCD response", e, false, false);
            return i.l("string_response", str);
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final /* synthetic */ Map<String, Object> registerClient(String str) throws JSONException {
        return AFLogger(str);
    }
}
