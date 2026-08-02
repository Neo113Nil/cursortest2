package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3962ad {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @NotNull
    private final E3 c;

    public C3962ad(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.b = jSONObject.has("numOfSeconds") ? Integer.valueOf(jSONObject.getInt("numOfSeconds")) : null;
        this.c = E3.Second;
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @NotNull
    public final E3 c() {
        return this.c;
    }
}
