package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class x implements w {
    public static final int b = 8;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i a;

    public x(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.w
    public boolean a(String url, long j, s sVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f;
        Intrinsics.checkNotNullParameter(url, "url");
        if (sVar != null) {
            try {
                f = sVar.f();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            f = null;
        }
        Uri build = Uri.parse(a(url, j, f)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar = this.a;
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        iVar.a(uri);
        return true;
    }

    public final String a(String str, long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        String a;
        if (cVar != null && (a = com.moloco.sdk.internal.utils.b.a(str, cVar.a())) != null) {
            str = a;
        }
        return com.moloco.sdk.internal.utils.b.a(str, j);
    }
}
