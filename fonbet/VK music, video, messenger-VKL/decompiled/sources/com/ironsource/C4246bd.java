package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4246bd {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C4246bd(JSONObject jSONObject) {
        this.a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.b = jSONObject.has("numOfSeconds") ? Integer.valueOf(jSONObject.getInt("numOfSeconds")) : null;
        this.c = H3.Second;
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
