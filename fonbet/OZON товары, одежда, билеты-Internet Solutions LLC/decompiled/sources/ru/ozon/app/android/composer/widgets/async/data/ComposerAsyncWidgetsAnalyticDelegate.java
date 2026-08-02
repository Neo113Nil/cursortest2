package ru.ozon.app.android.composer.widgets.async.data;

import O00.a;
import Qj0.B;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.C3899t;
import Qj0.C3900u;
import Qj0.F;
import Qj0.L;
import Qj0.U;
import Qj0.x0;
import Sg.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetsAnalyticDelegate;", "", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;)V", "LQj0/U;", "", "putPageInfo", "(LQj0/U;)V", "", "uuid", "LO00/a$a;", "metrics", "", "Lru/ozon/tracker/performance/MetricType;", "", "additionalMetrics", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "getEnrichedMetrics", "(Ljava/lang/String;LO00/a$a;Ljava/util/Map;)Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LSg/a;", "composer-async-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerAsyncWidgetsAnalyticDelegate {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    public ComposerAsyncWidgetsAnalyticDelegate(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.analyticsScreenStorage = analyticsScreenStorage;
        analyticsScreenStorage.c();
    }

    private final void putPageInfo(U u11) {
        Rg.a a11 = this.analyticsScreenStorage.a();
        if (a11 == null) {
            return;
        }
        F f7 = new F(a11.g());
        int i11 = U.f23535i;
        u11.n(f7, true);
        String c11 = a11.c();
        if (c11 != null) {
            u11.n(new C3885e(c11), true);
        }
        String f11 = a11.f();
        if (f11 != null) {
            u11.n(new C3884d(f11), true);
        }
        String d11 = a11.d();
        if (d11 != null) {
            u11.n(new C3899t(d11), true);
        }
        String e11 = a11.e();
        if (e11 != null) {
            u11.n(new C3900u(e11), true);
        }
        String l11 = a11.l();
        if (l11 != null) {
            u11.n(new x0(l11), true);
        }
    }

    @NotNull
    public final MetricsResponse.Metrics getEnrichedMetrics(@NotNull String uuid, @NotNull a.C0390a metrics, Map<MetricType, Long> additionalMetrics) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        U removeTrace = this.performanceTrackerDelegate.removeTrace(uuid);
        if (removeTrace == null) {
            return new MetricsResponse.Metrics(uuid, removeTrace);
        }
        Rg.a a11 = this.analyticsScreenStorage.a();
        String i11 = a11 != null ? a11.i() : null;
        if (i11 == null) {
            i11 = "";
        }
        L l11 = new L(i11);
        int i12 = U.f23535i;
        removeTrace.n(l11, true);
        putPageInfo(removeTrace);
        U.p(removeTrace, MetricType.DECODING_TIME_START, metrics.b(), false, 4);
        U.p(removeTrace, MetricType.DECODING_TIME_END, metrics.a(), false, 4);
        if (additionalMetrics != null) {
            for (Map.Entry<MetricType, Long> entry : additionalMetrics.entrySet()) {
                U.p(removeTrace, entry.getKey(), entry.getValue().longValue(), false, 4);
            }
        }
        removeTrace.n(new B(ObjectTypes.ASYNC_WIDGET), true);
        return new MetricsResponse.Metrics(uuid, removeTrace);
    }
}
