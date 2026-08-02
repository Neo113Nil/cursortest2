package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class C3 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C3(JSONObject jSONObject) {
        this.a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.b = jSONObject.has("maxImpressions") ? Integer.valueOf(jSONObject.getInt("maxImpressions")) : null;
        this.c = jSONObject.has("unit") ? H3.c.a(jSONObject.optString("unit")) : null;
    }

    public final Boolean a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final H3 c() {
        return this.c;
    }
}
