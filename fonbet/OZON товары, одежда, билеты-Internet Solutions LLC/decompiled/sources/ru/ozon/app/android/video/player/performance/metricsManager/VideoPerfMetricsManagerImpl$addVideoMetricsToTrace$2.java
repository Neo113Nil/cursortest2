package ru.ozon.app.android.video.player.performance.metricsManager;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.video.player.performance.MetricsVideoTraceEntity;
import ru.ozon.app.android.video.player.performance.PerformanceTrackerVideoTraceWrapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2", f = "VideoPerfMetricsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MetricsVideoTraceEntity $videoTraceEntity;
    int label;
    final /* synthetic */ VideoPerfMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2(VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl, MetricsVideoTraceEntity metricsVideoTraceEntity, d<? super VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2> dVar) {
        super(2, dVar);
        this.this$0 = videoPerfMetricsManagerImpl;
        this.$videoTraceEntity = metricsVideoTraceEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2(this.this$0, this.$videoTraceEntity, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PerformanceTrackerDelegate performanceTrackerDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        performanceTrackerDelegate = this.this$0.performanceTrackerDelegate;
        PerformanceTrackerVideoTraceWrapperKt.addMetricsToTrace(performanceTrackerDelegate, this.$videoTraceEntity);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
