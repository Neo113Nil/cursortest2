package ru.ozon.app.android.composer.tracker;

import H00.d;
import S00.b;
import S00.c;
import Sg.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/composer/tracker/WidgetDecodingTrackerImpl;", "Lru/ozon/app/android/composer/tracker/WidgetDecodingTracker;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LRZ/a;", "composerAnalytics", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;LRZ/a;)V", "", "LS00/b;", "times", "", "getDecodingTimeDelta", "(Ljava/util/List;)J", "LS00/c;", "decodingTimeDelta", "", "logPerformance", "(LS00/c;J)V", "LT00/a;", "state", "LS00/a;", "metrics", "sendTraces", "(LT00/a;LS00/a;)V", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LSg/a;", "LRZ/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetDecodingTrackerImpl implements WidgetDecodingTracker {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final RZ.a composerAnalytics;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    public WidgetDecodingTrackerImpl(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull a analyticsScreenStorage, @NotNull RZ.a composerAnalytics) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.composerAnalytics = composerAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getDecodingTimeDelta(List<b> times) {
        long j11 = 0;
        for (b bVar : times) {
            long b11 = bVar.b() - bVar.c();
            if (b11 < 0) {
                b11 = 0;
            }
            j11 += b11;
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPerformance(c cVar, long j11) {
        int i11 = d.f10454c;
        String c11 = cVar.c();
        if (d.b()) {
            HashMap a11 = d.a();
            Object obj = a11.get(c11);
            if (obj == null) {
                obj = new d.a(c11);
                a11.put(c11, obj);
            }
            d.a aVar = (d.a) obj;
            aVar.a("WIDGET_DECODING", "type");
            aVar.a(cVar.e(), AppMeasurementSdk.ConditionalUserProperty.NAME);
            aVar.a(cVar.b(), "stateId");
            b.Companion companion = kotlin.time.b.INSTANCE;
            aVar.a(Double.valueOf(kotlin.time.b.m(kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS), EnumC10311b.MILLISECONDS)), "duration");
            for (S00.b bVar : cVar.a()) {
                String lowerCase = bVar.a().name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                b.Companion companion2 = kotlin.time.b.INSTANCE;
                long b11 = bVar.b() - bVar.c();
                if (b11 < 0) {
                    b11 = 0;
                }
                aVar.b(lowerCase, Double.valueOf(kotlin.time.b.m(kotlin.time.c.h(b11, EnumC10311b.NANOSECONDS), EnumC10311b.MILLISECONDS)));
            }
            aVar.c("ComposerPerf");
        }
    }

    @Override // ru.ozon.app.android.composer.tracker.WidgetDecodingTracker
    public void sendTraces(@NotNull T00.a state, @NotNull S00.a metrics) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics)) {
            for (c cVar : metrics.d()) {
                this.performanceTrackerDelegate.runTrace(cVar.c(), new WidgetDecodingTrackerImpl$sendTraces$1$1(cVar, this, state));
            }
        }
    }
}
