package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D<T extends AdShowListener> implements z {
    public static final int g = 8;
    public final /* synthetic */ z a;
    public final T b;
    public final InterfaceC2811f c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;
    public final AdFormatType e;
    public final MetricsRecorder f;

    public D(T adShowListener, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, Function0<C2803k> provideBUrlData, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> getCreativeType) {
        Intrinsics.checkNotNullParameter(adShowListener, "adShowListener");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(getCreativeType, "getCreativeType");
        this.a = B.a(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adFormatType, metricsRecorder, null, getCreativeType, 608, null);
        this.b = adShowListener;
        this.c = appLifecycleTrackerService;
        this.d = customUserEventBuilderService;
        this.e = adFormatType;
        this.f = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.internal.s internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.a.a(internalError);
    }

    public final T b() {
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
}
