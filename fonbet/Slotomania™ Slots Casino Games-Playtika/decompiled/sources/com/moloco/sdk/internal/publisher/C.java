package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C implements z {
    public final /* synthetic */ z a;
    public final BannerAdShowListener b;

    public C(BannerAdShowListener bannerAdShowListener, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, Function0<C2803k> provideBUrlData, AdFormatType adType, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = B.a(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adType, metricsRecorder, null, function0, 608, null);
        this.b = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.internal.s internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.a.a(internalError);
    }

    public final BannerAdShowListener b() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(MolocoAd molocoAd, String str) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.a(molocoAd, str);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a() {
        this.a.a();
    }

    public /* synthetic */ C(BannerAdShowListener bannerAdShowListener, InterfaceC2811f interfaceC2811f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdShowListener, interfaceC2811f, aVar, function0, function02, adFormatType, metricsRecorder, (i & 128) != 0 ? null : function03);
    }
}
