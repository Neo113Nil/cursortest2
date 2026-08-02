package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.publisher.C2793a;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;

/* renamed from: com.moloco.sdk.internal.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC2784a {
    Banner a(Context context, InterfaceC2811f interfaceC2811f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, A a, i iVar, MetricsRecorder metricsRecorder);

    InterstitialAd a(Context context, InterfaceC2811f interfaceC2811f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, MetricsRecorder metricsRecorder);

    NativeAd a(Context context, InterfaceC2811f interfaceC2811f, com.moloco.sdk.internal.services.n nVar, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, A a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, J j, MetricsRecorder metricsRecorder);

    RewardedInterstitialAd a(Context context, InterfaceC2811f interfaceC2811f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.config.a aVar);

    Banner b(Context context, InterfaceC2811f interfaceC2811f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, A a, i iVar, MetricsRecorder metricsRecorder);

    Banner c(Context context, InterfaceC2811f interfaceC2811f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, A a, i iVar, MetricsRecorder metricsRecorder);
}
