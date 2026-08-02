package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4425z3 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final E3 c;

    public C4425z3(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.b = jSONObject.has("maxImpressions") ? Integer.valueOf(jSONObject.getInt("maxImpressions")) : null;
        this.c = jSONObject.has("unit") ? E3.c.a(jSONObject.optString("unit")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final E3 c() {
        return this.c;
    }
}
