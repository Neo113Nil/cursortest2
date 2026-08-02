package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o implements n {
    public final JSONObject a;

    public o(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        if (this.a.has(str)) {
            try {
                return this.a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        if (this.a.has(str)) {
            try {
                return Boolean.valueOf(this.a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        if (this.a.has(str)) {
            try {
                return Integer.valueOf(this.a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
