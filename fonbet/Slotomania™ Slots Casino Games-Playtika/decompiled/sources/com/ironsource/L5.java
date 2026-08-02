package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class L5 {
    private final JSONObject a;

    public L5(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final Boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Boolean) {
            return (Boolean) opt;
        }
        return null;
    }

    public final Integer b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Integer) {
            return (Integer) opt;
        }
        return null;
    }

    public final String c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }
}
