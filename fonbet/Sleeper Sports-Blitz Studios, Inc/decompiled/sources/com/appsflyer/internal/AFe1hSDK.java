package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFe1hSDK implements AFe1kSDK<Map<String, String>> {
    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* synthetic */ Map<String, String> AFAdRevenueData(String str) throws JSONException {
        HashMap hashMap = new HashMap();
        if (!str.trim().isEmpty()) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }
}
