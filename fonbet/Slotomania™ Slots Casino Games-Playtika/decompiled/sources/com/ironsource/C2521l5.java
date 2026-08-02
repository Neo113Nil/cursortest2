package com.ironsource;

import com.ironsource.mediationsdk.d;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2521l5 implements Ib<String, d.a> {
    @Override // com.ironsource.Ib
    public d.a a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        d.a a = com.ironsource.mediationsdk.d.b().a(IronSourceNetworkBridge.jsonObjectInit(input));
        Intrinsics.checkNotNullExpressionValue(a, "getInstance().getAuction…sponse(JSONObject(input))");
        return a;
    }
}
