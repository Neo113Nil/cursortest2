package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class N5 {
    private final JSONObject a;

    public N5(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final Boolean a(String str) {
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(str) : null;
        if (opt instanceof Boolean) {
            return (Boolean) opt;
        }
        return null;
    }

    public final Integer b(String str) {
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(str) : null;
        if (opt instanceof Integer) {
            return (Integer) opt;
        }
        return null;
    }

    public final String c(String str) {
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(str) : null;
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }
}
