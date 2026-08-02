package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B {
    public static /* synthetic */ z a(AdShowListener adShowListener, InterfaceC2811f interfaceC2811f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, com.moloco.sdk.internal.w wVar, com.moloco.sdk.internal.f fVar, AdFormatType adFormatType, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a aVar2, Function0 function03, int i, Object obj) {
        MetricsRecorder metricsRecorder2;
        com.moloco.sdk.internal.client_metrics_data.a aVar3;
        com.moloco.sdk.internal.w b = (i & 32) != 0 ? com.moloco.sdk.internal.y.b() : wVar;
        com.moloco.sdk.internal.f a = (i & 64) != 0 ? com.moloco.sdk.internal.h.a() : fVar;
        if ((i & 512) != 0) {
            metricsRecorder2 = metricsRecorder;
            aVar3 = new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder2);
        } else {
            metricsRecorder2 = metricsRecorder;
            aVar3 = aVar2;
        }
        return a(adShowListener, interfaceC2811f, aVar, function0, function02, b, a, adFormatType, metricsRecorder2, aVar3, (i & 1024) != 0 ? null : function03);
    }

    public static final z a(AdShowListener adShowListener, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, Function0<C2803k> provideBUrlData, com.moloco.sdk.internal.w sdkEventUrlTracker, com.moloco.sdk.internal.f bUrlTracker, AdFormatType adType, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        return new A(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, sdkEventUrlTracker, bUrlTracker, adType, metricsRecorder, acmClickDeduper, function0);
    }
}
