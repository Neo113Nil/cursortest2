package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4423z1 {

    @NotNull
    private final Eb a;

    @NotNull
    private final G1 b;
    private final boolean c;

    @NotNull
    private final D1 d;

    @NotNull
    private final K1 e;

    @NotNull
    private final C4387x1 f;

    public C4423z1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject(B1.a);
        this.a = new Eb(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("events");
        this.b = new G1(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        this.c = jSONObject.optBoolean(B1.g, false);
        JSONObject optJSONObject3 = jSONObject.optJSONObject(B1.h);
        this.d = new D1(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("settings");
        this.e = new K1(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
        JSONObject optJSONObject5 = jSONObject.optJSONObject(B1.f);
        this.f = new C4387x1(optJSONObject5 == null ? new JSONObject() : optJSONObject5);
    }

    @NotNull
    public final C4387x1 a() {
        return this.f;
    }

    @NotNull
    public final D1 b() {
        return this.d;
    }

    @NotNull
    public final G1 c() {
        return this.b;
    }

    @NotNull
    public final K1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    @NotNull
    public final Eb f() {
        return this.a;
    }
}
