package ru.ozon.app.android.geo.map.performance;

import Qj0.B;
import Qj0.C3882b;
import Qj0.C3885e;
import Qj0.C3901v;
import Qj0.Q;
import Qj0.U;
import Qj0.t0;
import java.util.NavigableSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;
import ru.ozon.app.android.analytics.eventstorage.ExpirableMetrics;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MapPerformanceAnalyticsSender$sendTrace$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ I $isCompleted;
    final /* synthetic */ long $mapEndTime;
    final /* synthetic */ NavigableSet<Metric> $metrics;
    final /* synthetic */ ExpirableMetrics $metricsData;
    final /* synthetic */ String $rootUrl;
    final /* synthetic */ MapPerformanceAnalyticsSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapPerformanceAnalyticsSender$sendTrace$1(MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender, String str, ExpirableMetrics expirableMetrics, NavigableSet<Metric> navigableSet, long j11, I i11) {
        super(1);
        this.this$0 = mapPerformanceAnalyticsSender;
        this.$rootUrl = str;
        this.$metricsData = expirableMetrics;
        this.$metrics = navigableSet;
        this.$mapEndTime = j11;
        this.$isCompleted = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        Long l11;
        String modifyUrl;
        Long l12;
        String modifyUrl2;
        C9067a c9067a;
        C3901v mapLoadingStep;
        Long l13;
        Q statusCode;
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender = this.this$0;
        String str = this.$rootUrl;
        l11 = mapPerformanceAnalyticsSender.initStartTime;
        modifyUrl = mapPerformanceAnalyticsSender.modifyUrl(str, l11 != null);
        C3885e c3885e = new C3885e(modifyUrl);
        int i11 = U.f23535i;
        beginTrace.n(c3885e, true);
        MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender2 = this.this$0;
        String str2 = this.$rootUrl;
        l12 = mapPerformanceAnalyticsSender2.initStartTime;
        modifyUrl2 = mapPerformanceAnalyticsSender2.modifyUrl(str2, l12 != null);
        beginTrace.n(new t0(modifyUrl2), true);
        c9067a = this.this$0.networkInfoProvider;
        beginTrace.n(new C3882b(C9067a.g(c9067a)), true);
        ExpirableMetrics expirableMetrics = this.$metricsData;
        if (expirableMetrics != null && (statusCode = expirableMetrics.getStatusCode()) != null) {
            beginTrace.n(statusCode, true);
        }
        beginTrace.n(new B(ObjectTypes.MAP), true);
        mapLoadingStep = this.this$0.getMapLoadingStep();
        beginTrace.n(mapLoadingStep, true);
        this.this$0.putRequestIdAttribute(beginTrace);
        NavigableSet<Metric> navigableSet = this.$metrics;
        if (navigableSet != null) {
            I i12 = this.$isCompleted;
            for (Metric metric : navigableSet) {
                if (metric.getType() == MetricType.TOTAL_TIME_START) {
                    i12.f71783a = true;
                }
                U.p(beginTrace, metric.getType(), metric.getValue(), false, 4);
            }
        }
        l13 = this.this$0.initStartTime;
        if (l13 != null) {
            I i13 = this.$isCompleted;
            MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender3 = this.this$0;
            U.p(beginTrace, MetricType.TOTAL_TIME_START, l13.longValue(), false, 4);
            i13.f71783a = true;
            mapPerformanceAnalyticsSender3.initStartTime = null;
        }
        U.p(beginTrace, MetricType.TOTAL_TIME_END, this.$mapEndTime, false, 4);
    }
}
