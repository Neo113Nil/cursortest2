package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g {
    public int a;
    public int b;
    public int c;
    public final long d;

    public g(int i, int i2, int i3, long j) {
        this.d = j;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new g(optInt2, optInt, optInt3, optLong);
    }

    public final JSONObject a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.a);
        if (z2) {
            jSONObject.put("com", this.c);
        }
        jSONObject.put("cli", this.b);
        return jSONObject;
    }
}
