package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class g implements f {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i a;

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.f
    public void a(String burl) {
        Intrinsics.checkNotNullParameter(burl, "burl");
        try {
            Uri parse = Uri.parse(burl);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar = this.a;
            String uri = parse.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            iVar.a(uri);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e.toString(), null, false, 12, null);
        }
    }
}
