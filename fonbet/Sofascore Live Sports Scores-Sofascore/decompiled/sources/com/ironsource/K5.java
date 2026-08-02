package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K5 {

    @Nullable
    private final JSONObject a;

    public K5(@Nullable JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Nullable
    public final Boolean a(@NotNull String str) {
        str.getClass();
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(str) : null;
        if (opt instanceof Boolean) {
            return (Boolean) opt;
        }
        return null;
    }

    @Nullable
    public final Integer b(@NotNull String str) {
        str.getClass();
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(str) : null;
        if (opt instanceof Integer) {
            return (Integer) opt;
        }
        return null;
    }

    @Nullable
    public final String c(@NotNull String str) {
        str.getClass();
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(str) : null;
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }
}
