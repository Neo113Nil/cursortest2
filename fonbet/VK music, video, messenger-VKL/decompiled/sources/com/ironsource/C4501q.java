package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4501q {
    private final Boolean a;

    public C4501q(JSONObject jSONObject) {
        this.a = jSONObject.has(r.a) ? Boolean.valueOf(jSONObject.optBoolean(r.a)) : null;
    }

    public final Boolean a() {
        return this.a;
    }
}
