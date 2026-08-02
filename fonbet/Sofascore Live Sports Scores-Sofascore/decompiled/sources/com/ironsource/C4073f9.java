package com.ironsource;

import com.ironsource.environment.ContextProvider;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4073f9 {

    @NotNull
    public static final C4073f9 a = new C4073f9();

    private C4073f9() {
    }

    @NotNull
    public static final JSONObject a() {
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        String jSONObject = new C4055e9().a().toString();
        jSONObject.getClass();
        Ve.c(jSONObject);
        JSONObject put = new JSONObject().put("data", I9.e(C4123i5.b().c(), jSONObject));
        put.getClass();
        return put;
    }
}
