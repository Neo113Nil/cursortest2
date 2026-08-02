package com.mbridge.msdk.foundation.controller;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    public static class C1248b {
        static b a = new b();
    }

    private b() {
        this.a = new HashMap<>();
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        HashMap<String, com.mbridge.msdk.foundation.cache.d> hashMap = this.a;
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.a = hashMap;
        }
        if (hashMap.containsKey(str)) {
            return this.a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.a.put(str, dVar);
        return dVar;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e;
        HashMap<String, com.mbridge.msdk.foundation.cache.d> hashMap = this.a;
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.a = hashMap;
        }
        if (hashMap.containsKey(str)) {
            return this.a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
            } catch (Exception e2) {
                jSONArray2 = jSONArray;
                e = e2;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("c_cb", 0);
                jSONObject.put("t_disc", 0.95d);
                jSONObject.put("u_disc", 0.95d);
                jSONObject.put("max_ecppv_diff", 0);
                jSONObject.put("max_cache_num", 20);
                jSONObject.put("max_usage_limit", 10);
                jSONObject.put("time_interval", 7200);
                jSONArray2.put(jSONObject);
            } catch (Exception e3) {
                e = e3;
                e.getMessage();
                jSONArray = jSONArray2;
                return a(str, jSONArray);
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    public static b a() {
        return C1248b.a;
    }
}
