package com.ironsource;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class O6 {
    private static O6 a = new O6();

    public static HashMap<String, Object> a(ConcurrentHashMap<String, Object> concurrentHashMap) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                hashMap.put(entry.getKey(), a((JSONObject) entry.getValue()));
            } else if (entry.getValue() instanceof JSONArray) {
                hashMap.put(entry.getKey(), a((JSONArray) entry.getValue()));
            } else if (entry.getValue() instanceof Map) {
                hashMap.put(entry.getKey(), a((Map<String, Object>) entry.getValue()));
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, (List) opt));
                }
            }
        }
        return jSONObject;
    }

    public static O6 a() {
        return a;
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }

    public static JSONArray a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, map.get(str));
        }
        return hashMap;
    }
}
