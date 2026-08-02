package ru.ozon.app.android.video.player.performance.metricsManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerImpl", f = "VideoPerfMetricsManager.kt", l = {496, 139, 166, 182}, m = "handleMetricActionByUrlInternal")
/* loaded from: classes7.dex */
final class VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VideoPerfMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1(VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl, d<? super VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1> dVar) {
        super(dVar);
        this.this$0 = videoPerfMetricsManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleMetricActionByUrlInternal;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        handleMetricActionByUrlInternal = this.this$0.handleMetricActionByUrlInternal(null, null, this);
        return handleMetricActionByUrlInternal;
    }
}
