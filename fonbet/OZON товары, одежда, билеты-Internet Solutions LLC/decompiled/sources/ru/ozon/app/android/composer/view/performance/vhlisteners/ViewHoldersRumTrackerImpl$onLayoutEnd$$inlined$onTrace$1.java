package ru.ozon.app.android.composer.view.performance.vhlisteners;

import Lm0.a;
import Qj0.U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.analytics.LayoutTimeMetrics;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
public final class ViewHoldersRumTrackerImpl$onLayoutEnd$$inlined$onTrace$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ k $holder$inlined;
    final /* synthetic */ String $traceId;
    final /* synthetic */ ViewHoldersRumTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHoldersRumTrackerImpl$onLayoutEnd$$inlined$onTrace$1(String str, k kVar, ViewHoldersRumTrackerImpl viewHoldersRumTrackerImpl) {
        super(1);
        this.$traceId = str;
        this.$holder$inlined = kVar;
        this.this$0 = viewHoldersRumTrackerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        WidgetLayoutTimeMetricsStorage widgetLayoutTimeMetricsStorage;
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        String str = this.$traceId;
        MetricType metricType = MetricType.LAYOUT_TIME_END;
        U.p(beginTrace, metricType, 0L, false, 2);
        if (this.$holder$inlined instanceof AsyncPageWidgetViewHolder) {
            Long i11 = beginTrace.i(MetricType.LAYOUT_TIME_START);
            Long i12 = beginTrace.i(metricType);
            if (i12 == null || i11 == null) {
                a.f17149a.d("null layout time value (start or end) of a AsyncPageWidgetViewHolder " + this.$holder$inlined, new Object[0]);
            } else {
                widgetLayoutTimeMetricsStorage = this.this$0.widgetLayoutTimeMetricsStorage;
                widgetLayoutTimeMetricsStorage.saveMetrics(str, new LayoutTimeMetrics(i11.longValue(), i12.longValue()));
            }
        }
        long nanoTime = System.nanoTime();
        beginTrace.o(MetricType.CREATION_TIME_START, nanoTime, false);
        beginTrace.o(MetricType.CREATION_TIME_END, nanoTime, false);
        this.this$0.logPerformance(beginTrace, str, this.$holder$inlined);
    }
}
