package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.e9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2400e9 {
    public static final C2400e9 a = new C2400e9();

    private C2400e9() {
    }

    @JvmStatic
    public static final JSONObject a() {
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        String jSONObject = new C2382d9().a().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "InitProvider().getInitData().toString()");
        Xe.c(jSONObject);
        JSONObject encodedJsonInitResponse = IronSourceNetworkBridge.jsonObjectInit().put("data", I9.e(C2503k5.b().c(), jSONObject));
        Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
