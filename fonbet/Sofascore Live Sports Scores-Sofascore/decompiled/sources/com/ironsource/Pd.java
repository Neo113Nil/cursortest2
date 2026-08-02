package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pd {

    @Nullable
    private final String a;

    @Nullable
    private final Integer b;

    public Pd(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull String str2) {
        jSONObject.getClass();
        str.getClass();
        str2.getClass();
        this.a = jSONObject.has(str) ? jSONObject.getString(str) : null;
        this.b = jSONObject.has(str2) ? Integer.valueOf(jSONObject.getInt(str2)) : null;
    }

    @Nullable
    public final Integer a() {
        return this.b;
    }

    @Nullable
    public final String b() {
        return this.a;
    }
}
