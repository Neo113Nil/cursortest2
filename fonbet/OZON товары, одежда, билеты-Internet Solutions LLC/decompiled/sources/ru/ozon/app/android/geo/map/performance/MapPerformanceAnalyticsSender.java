package ru.ozon.app.android.geo.map.performance;

import E0.C2942q;
import Qj0.C3901v;
import Qj0.L;
import Qj0.U;
import Sg.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.NavigableSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.eventstorage.ExpirableMetrics;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.extensions.TraceApiKt;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.mapcommon.map.flags.SendMapsMetricsWithRequestIdFlag;
import ru.ozon.app.android.mapcommon.map.flags.SystemPermissionWindowTimeFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.tracker.performance.MapLoadingSteps;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 62\u00020\u0001:\u00016B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0015¢\u0006\u0004\b+\u0010&J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b,\u0010)J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010*\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00105R\u0018\u0010+\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "viewEventStorage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LSg/a;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lqj/a;Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;Lru/ozon/app/android/network/abtool/FeatureChecker;LSg/a;)V", "", "traceName", "rootUrl", "Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "metricsData", "", "mapEndTime", "", "sendTrace", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;J)V", "LQj0/U;", "putRequestIdAttribute", "(LQj0/U;)V", ImagesContract.URL, "", "isInit", "modifyUrl", "(Ljava/lang/String;Z)Ljava/lang/String;", "LQj0/v;", "getMapLoadingStep", "()LQj0/v;", "calculatePermissionTime", "()J", "endTraces", "()V", "uuid", "setInitStartTime", "(Ljava/lang/String;)V", "permissionViewStart", "permissionViewEnd", "saveTrace", "sendAnalytics", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lqj/a;", "Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LSg/a;", "initStartTime", "Ljava/lang/Long;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPerformanceAnalyticsSender {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final FeatureChecker featureChecker;
    private Long initStartTime;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;
    private Long permissionViewEnd;
    private Long permissionViewStart;

    @NotNull
    private final ViewEventStorage viewEventStorage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender$Companion;", "", "<init>", "()V", "QUERY_DELIMITER", "", "QUERY_FIELD_VALUE_DELIMITER", "QUERY_FIELD_NAME", "QUERY_FIELD_VALUE_INITIAL", "QUERY_FIELD_VALUE_UPDATE", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapPerformanceAnalyticsSender(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull C9067a networkInfoProvider, @NotNull ViewEventStorage viewEventStorage, @NotNull FeatureChecker featureChecker, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(viewEventStorage, "viewEventStorage");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.networkInfoProvider = networkInfoProvider;
        this.viewEventStorage = viewEventStorage;
        this.featureChecker = featureChecker;
        this.analyticsScreenStorage = analyticsScreenStorage;
    }

    private final long calculatePermissionTime() {
        Long l11 = this.permissionViewStart;
        Long l12 = this.permissionViewEnd;
        long longValue = l12 != null ? l12.longValue() : System.nanoTime();
        this.permissionViewStart = null;
        this.permissionViewEnd = null;
        if (l11 != null) {
            return longValue - l11.longValue();
        }
        return 0L;
    }

    private final void endTraces() {
        TraceApiKt.endDebugTrace("mapPinConfigure", 1);
        TraceApiKt.endDebugTrace("mapRequestHandle", 1);
        TraceApiKt.endDebugTrace("mapTotal", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3901v getMapLoadingStep() {
        return new C3901v(this.initStartTime != null ? MapLoadingSteps.INITIAL : MapLoadingSteps.UPDATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String modifyUrl(String url, boolean isInit) {
        StringBuilder sb2 = new StringBuilder(url);
        sb2.append("&mapLoadingStep=");
        return C2942q.c(sb2, isInit ? "INITIAL" : "UPDATE", "toString(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putRequestIdAttribute(U u11) {
        a d11;
        Rg.a a11;
        String i11;
        if (!this.featureChecker.isEnabled(SendMapsMetricsWithRequestIdFlag.INSTANCE) || (d11 = this.analyticsScreenStorage.d()) == null || (a11 = d11.a()) == null || (i11 = a11.i()) == null) {
            return;
        }
        L l11 = new L(i11);
        int i12 = U.f23535i;
        u11.n(l11, true);
    }

    private final void sendTrace(String traceName, String rootUrl, ExpirableMetrics metricsData, long mapEndTime) {
        NavigableSet<Metric> metrics = metricsData != null ? metricsData.getMetrics() : null;
        I i11 = new I();
        this.performanceTrackerDelegate.beginTrace(traceName, new MapPerformanceAnalyticsSender$sendTrace$1(this, rootUrl, metricsData, metrics, mapEndTime, i11));
        if (i11.f71783a) {
            this.performanceTrackerDelegate.endTrace(traceName, kotlin.collections.U.c());
        } else {
            this.performanceTrackerDelegate.removeTrace(traceName);
        }
    }

    public final void permissionViewEnd() {
        this.permissionViewEnd = Long.valueOf(System.nanoTime());
    }

    public final void permissionViewStart() {
        this.permissionViewStart = Long.valueOf(System.nanoTime());
    }

    public final void saveTrace(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.viewEventStorage.putKey(uuid);
    }

    public final void sendAnalytics(@NotNull String uuid, String rootUrl) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (rootUrl == null) {
            return;
        }
        endTraces();
        long nanoTime = this.featureChecker.isEnabled(SystemPermissionWindowTimeFlag.INSTANCE) ? System.nanoTime() - calculatePermissionTime() : System.nanoTime();
        ExpirableMetrics value = this.viewEventStorage.getValue(uuid);
        String b11 = Nk.a.b("map", uuid);
        this.viewEventStorage.removeEntry(uuid);
        sendTrace(b11, rootUrl, value, nanoTime);
    }

    public final void setInitStartTime(@NotNull String uuid) {
        Object obj;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ExpirableMetrics value = this.viewEventStorage.getValue(uuid);
        Long l11 = null;
        NavigableSet<Metric> metrics = value != null ? value.getMetrics() : null;
        if (metrics != null) {
            Iterator<T> it = metrics.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Metric) obj).getType() == MetricType.TOTAL_TIME_START) {
                        break;
                    }
                }
            }
            Metric metric = (Metric) obj;
            if (metric != null) {
                l11 = Long.valueOf(metric.getValue());
            }
        }
        this.initStartTime = l11;
    }
}
