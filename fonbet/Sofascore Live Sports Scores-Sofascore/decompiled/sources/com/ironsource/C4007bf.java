package com.ironsource;

import com.ironsource.U3;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4007bf {

    @NotNull
    private EnumC4025cf a;

    public C4007bf(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = EnumC4025cf.b.a(jSONObject.optInt(U3.a.t, EnumC4025cf.CurrentlyLoadedAds.b()));
    }

    @NotNull
    public final EnumC4025cf a() {
        return this.a;
    }
}
