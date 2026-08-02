package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2822c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class n {
    public static /* synthetic */ l a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, i iVar, C2791e c2791e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, y yVar, MetricsRecorder metricsRecorder, int i, Object obj) {
        if ((i & 4) != 0) {
            iVar = null;
        }
        return a(context, aVar, iVar, c2791e, rVar, yVar, metricsRecorder);
    }

    public static final l<g, h> a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, i iVar, C2791e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, y watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C2822c(context, customUserEventBuilderService, iVar, bid, externalLinkHandler, watermark, metricsRecorder);
    }

    public static /* synthetic */ l a(Context context, String str, com.moloco.sdk.internal.services.s sVar, y yVar, MetricsRecorder metricsRecorder, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = true;
        }
        return a(context, str, sVar, yVar, metricsRecorder, z);
    }

    public static final l<u, t> a(Context context, String adm, com.moloco.sdk.internal.services.s clickthroughService, y watermark, MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new J(context, adm, clickthroughService, watermark, a.h.a.f(), a.i.a.c(), metricsRecorder, z);
    }
}
