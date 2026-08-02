package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4260q {

    @Nullable
    private final Boolean a;

    public C4260q(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.has(r.a) ? Boolean.valueOf(jSONObject.optBoolean(r.a)) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }
}
