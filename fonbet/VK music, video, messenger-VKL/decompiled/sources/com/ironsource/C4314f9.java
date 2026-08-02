package com.ironsource;

import com.ironsource.environment.ContextProvider;
import org.json.JSONObject;

/* renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4314f9 {
    public static final C4314f9 a = new C4314f9();

    private C4314f9() {
    }

    public static final JSONObject a() {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        String jSONObject = new C4296e9().a().toString();
        Xe.c(jSONObject);
        return new JSONObject().put("data", J9.e(C4399k5.b().c(), jSONObject));
    }
}
