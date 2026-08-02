package ru.ozon.app.android.travel.utils.utils;

import Qj0.A0;
import Qj0.AbstractC3880a;
import Qj0.U;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "", "widgetName", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "metrics", "", "trackAsyncWidgetEndTime", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Ljava/lang/String;Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)V", "LQj0/U;", "trace", "uuid", "", "Lru/ozon/tracker/performance/MetricType;", "LQj0/a;", "attributes", "track", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LQj0/U;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsyncWidgetPerformanceTrackerKt {
    private static final void track(PerformanceTrackerDelegate performanceTrackerDelegate, U u11, String str, List<? extends MetricType> list, List<? extends AbstractC3880a> list2) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            U.p(u11, (MetricType) it.next(), 0L, false, 6);
        }
        for (AbstractC3880a abstractC3880a : list2) {
            int i11 = U.f23535i;
            u11.n(abstractC3880a, true);
        }
        performanceTrackerDelegate.beginTrace(u11);
        performanceTrackerDelegate.endTrace(str, kotlin.collections.U.c());
    }

    public static final void trackAsyncWidgetEndTime(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, String str, @NotNull MetricsResponse.Metrics metrics) {
        U trace;
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (str == null || (trace = metrics.getTrace()) == null) {
            return;
        }
        track(performanceTrackerDelegate, trace, metrics.getUuid(), C7714v.a0(MetricType.TOTAL_TIME_END), C7714v.a0(new A0(str)));
    }
}
