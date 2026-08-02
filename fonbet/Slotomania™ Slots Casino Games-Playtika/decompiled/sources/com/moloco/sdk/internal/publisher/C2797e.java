package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.services.L;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.moloco.sdk.internal.publisher.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2797e {
    public static final AdLoad a(CoroutineScope scope, Function1<? super Long, Duration> timeout, String adUnitId, Function1<? super C2791e, ? extends InterfaceC2819b> recreateXenossAdLoader, AdFormatType adFormatType, L webViewChecker, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C2796d(scope, timeout, adUnitId, recreateXenossAdLoader, com.moloco.sdk.internal.ortb.d.a(), r.a(), adFormatType, webViewChecker, metricsRecorder, function0);
    }
}
