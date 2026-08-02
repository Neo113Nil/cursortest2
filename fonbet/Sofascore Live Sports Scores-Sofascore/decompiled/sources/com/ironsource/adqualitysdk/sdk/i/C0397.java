package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ь, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0397 extends AbstractC0978 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1157 = StringFog.decrypt("PgY6\n", "W3JOiD+0+Ps=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1156 = StringFog.decrypt("01edrg==\n", "tiPp3c820v0=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1155 = StringFog.decrypt("3x4XHbVb\n", "q2x2dMEo0zw=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m231() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optString(f1157);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m232() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optJSONObject(f1155);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONArray m233() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optJSONArray(f1156);
    }
}
