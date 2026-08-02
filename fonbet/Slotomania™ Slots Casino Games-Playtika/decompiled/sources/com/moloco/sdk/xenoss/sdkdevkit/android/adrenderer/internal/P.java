package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.service_locator.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class P {
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l a(Context context, C2791e c2791e, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, InterfaceC2833m interfaceC2833m, int i, Object obj) {
        if ((i & 32) != 0) {
            dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = dVar;
        if ((i & 64) != 0) {
            interfaceC2833m = a.C0269a.a.a();
        }
        return a(context, c2791e, z, yVar, metricsRecorder, dVar2, interfaceC2833m);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(Context context, C2791e bid, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, InterfaceC2833m decLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        return new O(context, bid, loadVast, decLoader, z, watermark, metricsRecorder);
    }
}
