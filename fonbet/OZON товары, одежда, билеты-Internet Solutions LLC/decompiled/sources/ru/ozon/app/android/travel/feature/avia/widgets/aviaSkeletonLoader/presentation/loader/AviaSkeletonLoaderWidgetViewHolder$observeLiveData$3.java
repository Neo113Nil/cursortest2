package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.travel.utils.utils.AsyncWidgetPerformanceTrackerKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "metrics", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3", f = "AviaSkeletonLoaderWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3 extends j implements Function2<MetricsResponse.Metrics, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaSkeletonLoaderWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3(AviaSkeletonLoaderWidgetViewHolder aviaSkeletonLoaderWidgetViewHolder, d<? super AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3> dVar) {
        super(2, dVar);
        this.this$0 = aviaSkeletonLoaderWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3 aviaSkeletonLoaderWidgetViewHolder$observeLiveData$3 = new AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3(this.this$0, dVar);
        aviaSkeletonLoaderWidgetViewHolder$observeLiveData$3.L$0 = obj;
        return aviaSkeletonLoaderWidgetViewHolder$observeLiveData$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PerformanceTrackerDelegate performanceTrackerDelegate;
        String widgetName;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        MetricsResponse.Metrics metrics = (MetricsResponse.Metrics) this.L$0;
        performanceTrackerDelegate = this.this$0.performanceTrackerDelegate;
        widgetName = this.this$0.getWidgetName();
        AsyncWidgetPerformanceTrackerKt.trackAsyncWidgetEndTime(performanceTrackerDelegate, widgetName, metrics);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MetricsResponse.Metrics metrics, d<? super Unit> dVar) {
        return ((AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3) create(metrics, dVar)).invokeSuspend(Unit.f71690a);
    }
}
