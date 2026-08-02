package ru.ozon.app.android.composer.tracker;

import L00.j;
import N00.a;
import N00.b;
import Qj0.InterfaceC3892l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.flags.ComposerNewPerformanceMetricsEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/tracker/ComposerNetworkMetricsProvider;", "LN00/b;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "LQj0/l;", "", "Lru/ozon/tracker/performance/MetricType;", "type", "getMetric", "(Ljava/util/Map;Lru/ozon/tracker/performance/MetricType;)J", "", "uuid", "LL00/j;", "response", "LN00/a;", "provide", "(Ljava/lang/String;LL00/j;)LN00/a;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "", "newMetricsEnabled", "Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerNetworkMetricsProvider implements b {
    private final boolean newMetricsEnabled;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    public ComposerNetworkMetricsProvider(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.newMetricsEnabled = featureChecker.isEnabled(ComposerNewPerformanceMetricsEnabled.INSTANCE);
    }

    private final long getMetric(Map<InterfaceC3892l, Long> map, MetricType metricType) {
        return map.getOrDefault(metricType, 0L).longValue();
    }

    @Override // N00.b
    @NotNull
    public a provide(@NotNull String uuid, @NotNull j response) {
        a aVar;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!this.performanceTrackerDelegate.hasTrace(uuid)) {
            aVar = a.f18344z;
            return aVar;
        }
        TreeSet j11 = this.performanceTrackerDelegate.beginTrace(uuid).j();
        int h11 = U.h(C7714v.z(j11, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it = j11.iterator();
        while (it.hasNext()) {
            Metric metric = (Metric) it.next();
            Pair pair = new Pair(metric.getType(), Long.valueOf(metric.getValue()));
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new a(getMetric(linkedHashMap, MetricType.REQUEST_PREPARE_TIME_START), getMetric(linkedHashMap, MetricType.REQUEST_PREPARE_TIME_END), getMetric(linkedHashMap, MetricType.DNS_TIME_START), getMetric(linkedHashMap, MetricType.DNS_TIME_END), getMetric(linkedHashMap, MetricType.TCP_TIME_START), getMetric(linkedHashMap, MetricType.TCP_TIME_END), getMetric(linkedHashMap, MetricType.TLS_TIME_START), getMetric(linkedHashMap, MetricType.TLS_TIME_END), getMetric(linkedHashMap, MetricType.TIME_TO_FIRST_BYTE_START), getMetric(linkedHashMap, MetricType.TIME_TO_FIRST_BYTE_END), getMetric(linkedHashMap, MetricType.TIME_TO_LAST_BYTE_START), getMetric(linkedHashMap, MetricType.TIME_TO_LAST_BYTE_END), getMetric(linkedHashMap, MetricType.SERVER_TIME_START), getMetric(linkedHashMap, MetricType.SERVER_TIME_END), getMetric(linkedHashMap, MetricType.RESPONSE_TIME_START), getMetric(linkedHashMap, MetricType.RESPONSE_TIME_END), getMetric(linkedHashMap, MetricType.ENCODED_SIZE), getMetric(linkedHashMap, MetricType.DECODED_SIZE), getMetric(linkedHashMap, MetricType.TRANSFER_SIZE), this.newMetricsEnabled ? 0L : getMetric(linkedHashMap, MetricType.ADDITIONAL_REQUESTS_TIME_START), this.newMetricsEnabled ? 0L : getMetric(linkedHashMap, MetricType.ADDITIONAL_REQUESTS_TIME_END), getMetric(linkedHashMap, MetricType.NETWORK_LB_REDIRECT_TIME_START), getMetric(linkedHashMap, MetricType.NETWORK_LB_REDIRECT_TIME_END), getMetric(linkedHashMap, MetricType.NETWORK_ANTIBOT_TIME_START), getMetric(linkedHashMap, MetricType.NETWORK_ANTIBOT_TIME_END));
    }
}
