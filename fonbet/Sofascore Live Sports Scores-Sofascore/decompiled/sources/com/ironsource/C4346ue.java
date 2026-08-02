package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4346ue {

    @NotNull
    private final Te a;

    @NotNull
    private final Ed b;

    @NotNull
    private final Id c;

    @NotNull
    private final L3 d;

    @NotNull
    private final K5 e;

    public C4346ue(@NotNull Te te) {
        te.getClass();
        this.a = te;
        JSONObject optJSONObject = te.j().optJSONObject(C4364ve.a);
        this.b = new Ed(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = te.j().optJSONObject(C4364ve.b);
        this.c = new Id(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = te.j().optJSONObject("configurations");
        this.d = new L3(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = te.j().optJSONObject(C4364ve.d);
        this.e = new K5(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    @NotNull
    public final L3 a() {
        return this.d;
    }

    @NotNull
    public final K5 b() {
        return this.e;
    }

    @NotNull
    public final Te c() {
        return this.a;
    }

    @NotNull
    public final Ed d() {
        return this.b;
    }

    @NotNull
    public final Id e() {
        return this.c;
    }
}
