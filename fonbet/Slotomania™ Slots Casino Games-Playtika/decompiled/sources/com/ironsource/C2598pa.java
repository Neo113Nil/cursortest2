package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2598pa implements Te<JSONObject> {
    private final Te<String> a;

    public C2598pa(Te<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a = serverResponse;
    }

    @Override // com.ironsource.Te
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return IronSourceNetworkBridge.jsonObjectInit(this.a.a());
    }
}
