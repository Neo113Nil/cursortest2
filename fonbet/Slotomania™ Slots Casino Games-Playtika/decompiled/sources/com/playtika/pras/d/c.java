package com.playtika.pras.d;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class c {
    public final JSONArray a;
    public int b;
    public final String c;

    public c(JSONArray jSONArray, String str) {
        this.a = jSONArray;
        this.c = str;
        a(0);
    }

    public final void a(int i) {
        this.b = i;
        int length = this.a.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                this.a.getJSONObject(i2).put("retry_attempt_number", i);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("events", this.a);
            jSONObject.put("attemptNumber", this.b);
            jSONObject.put("requestId", this.c);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
