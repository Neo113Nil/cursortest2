package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Qd {
    private final String a;
    private final Integer b;

    public Qd(JSONObject jSONObject, String str, String str2) {
        this.a = jSONObject.has(str) ? jSONObject.getString(str) : null;
        this.b = jSONObject.has(str2) ? Integer.valueOf(jSONObject.getInt(str2)) : null;
    }

    public final Integer a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
