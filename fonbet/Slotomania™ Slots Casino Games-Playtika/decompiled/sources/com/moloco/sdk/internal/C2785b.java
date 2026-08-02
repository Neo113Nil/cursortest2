package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.publisher.C2793a;
import com.moloco.sdk.internal.publisher.G;
import com.moloco.sdk.internal.publisher.I;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2785b implements InterfaceC2784a {
    public static final int e = 8;
    public final Init.SDKInitResponse a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final com.moloco.sdk.internal.services.s c;
    public final Lazy d;

    /* renamed from: com.moloco.sdk.internal.b$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context) {
            super(1, Intrinsics.Kotlin.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.b = rVar;
            this.c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C2785b.b(C2785b.this, this.b, this.c, p0);
        }
    }

    public C2785b(Init.SDKInitResponse initResponse, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.internal.services.s clickthroughService) {
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        this.a = initResponse;
        this.b = customUserEventBuilderService;
        this.c = clickthroughService;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C2785b.a(C2785b.this));
            }
        });
    }

    @Override // com.moloco.sdk.internal.InterfaceC2784a
    public Banner b(Context context, InterfaceC2811f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, A viewLifecycleOwnerSingleton, i bannerSize, MetricsRecorder metricsRecorder) {
        Banner a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? AdFormatType.BANNER : null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC2784a
    public Banner c(Context context, InterfaceC2811f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, A viewLifecycleOwnerSingleton, i bannerSize, MetricsRecorder metricsRecorder) {
        Banner a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? AdFormatType.BANNER : null);
        return a2;
    }

    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public static final boolean a(C2785b c2785b) {
        return c2785b.a.getVerifyBannerVisible();
    }

    @Override // com.moloco.sdk.internal.InterfaceC2784a
    public Banner a(Context context, InterfaceC2811f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, A viewLifecycleOwnerSingleton, i bannerSize, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, AdFormatType.MREC);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(C2785b c2785b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, rVar, context, c2785b.b, true, Boolean.FALSE, 0, 0, 0, false, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(false, false, false, false, null, null, null).a(rVar, null));
    }

    @Override // com.moloco.sdk.internal.InterfaceC2784a
    public NativeAd a(Context context, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.internal.services.n audioService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, A viewLifecycleOwnerSingleton, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, J timeProvider, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(audioService, "audioService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(adUnitId, new com.moloco.sdk.internal.publisher.nativead.c(context, adUnitId, new com.moloco.sdk.internal.publisher.p(com.moloco.sdk.internal.ortb.d.a(), com.moloco.sdk.internal.publisher.r.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), adCreateLoadTimeoutManager, metricsRecorder, timeProvider), new com.moloco.sdk.internal.publisher.nativead.a(context, viewVisibilityTracker, viewLifecycleOwnerSingleton, watermark, new a(externalLinkHandler, context)), appLifecycleTrackerService, this.b, externalLinkHandler, persistentHttpRequest, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.InterfaceC2784a
    public InterstitialAd a(Context context, InterfaceC2811f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, MetricsRecorder metricsRecorder) {
        InterstitialAd a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = G.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r22 & 64) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC2784a
    public RewardedInterstitialAd a(Context context, InterfaceC2811f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.config.a configService) {
        RewardedInterstitialAd a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(configService, "configService");
        a2 = I.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r24 & 64) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder, configService);
        return a2;
    }
}
