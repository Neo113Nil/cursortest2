package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C2791e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC2840u {
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(Context context, C2791e c2791e, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, MetricsRecorder metricsRecorder);

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar);

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(Context context, CoroutineScope coroutineScope, C2791e c2791e, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, MutableStateFlow<Boolean> mutableStateFlow, boolean z, MetricsRecorder metricsRecorder);
}
