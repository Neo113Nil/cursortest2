package ru.ozon.app.android.composer.view.performance;

import H00.d;
import Ih.b;
import Sg.a;
import T00.e;
import T00.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d20.AbstractC6065b;
import e20.C6283a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import l20.d;
import n10.InterfaceC8418b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.tracker.AnalyticsExtKt;
import ru.ozon.app.android.composer.tracker.WidgetDecodingTracker;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTracker;
import ru.ozon.composer.ui.widget.l;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u00020\u00162\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/composer/view/performance/ComposerScreenPerformanceController;", "Ln10/b;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;", "viewHoldersRumTracker", "LIh/b;", "pagePerformanceTracker", "Lru/ozon/app/android/composer/tracker/WidgetDecodingTracker;", "widgetDecodingTracker", "LSg/a;", "analyticsScreenStorage", "LRZ/a;", "composerAnalytics", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;LIh/b;Lru/ozon/app/android/composer/tracker/WidgetDecodingTracker;LSg/a;LRZ/a;)V", "", "uuid", "Ld20/b;", "holder", "Le20/a;", "metrics", "", "logPerformance", "(Ljava/lang/String;Ld20/b;Le20/a;)V", "", "metricsInfo", "onLayoutStart-A3btV1Q", "(Ljava/lang/String;)V", "onLayoutStart", "LS00/a;", "LT00/a;", "state", "onPageReady", "(LS00/a;LT00/a;)V", "Lru/ozon/composer/ui/widget/l;", "item", "onOverlayMetricsReady", "(Ld20/b;Lru/ozon/composer/ui/widget/l;Le20/a;)V", "onDestroy-A3btV1Q", "onDestroy", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;", "LIh/b;", "Lru/ozon/app/android/composer/tracker/WidgetDecodingTracker;", "LSg/a;", "LRZ/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerScreenPerformanceController implements InterfaceC8418b {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final RZ.a composerAnalytics;

    @NotNull
    private final b pagePerformanceTracker;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final ViewHoldersRumTracker viewHoldersRumTracker;

    @NotNull
    private final WidgetDecodingTracker widgetDecodingTracker;

    public ComposerScreenPerformanceController(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull ViewHoldersRumTracker viewHoldersRumTracker, @NotNull b pagePerformanceTracker, @NotNull WidgetDecodingTracker widgetDecodingTracker, @NotNull a analyticsScreenStorage, @NotNull RZ.a composerAnalytics) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(viewHoldersRumTracker, "viewHoldersRumTracker");
        Intrinsics.checkNotNullParameter(pagePerformanceTracker, "pagePerformanceTracker");
        Intrinsics.checkNotNullParameter(widgetDecodingTracker, "widgetDecodingTracker");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.viewHoldersRumTracker = viewHoldersRumTracker;
        this.pagePerformanceTracker = pagePerformanceTracker;
        this.widgetDecodingTracker = widgetDecodingTracker;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.composerAnalytics = composerAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [l20.c] */
    public final void logPerformance(String uuid, AbstractC6065b<?> holder, C6283a metrics) {
        d c11;
        T00.a b11;
        e h11;
        d c12;
        m c13;
        if (H00.d.b()) {
            HashMap a11 = H00.d.a();
            Object obj = a11.get(uuid);
            if (obj == null) {
                obj = new d.a(uuid);
                a11.put(uuid, obj);
            }
            d.a aVar = (d.a) obj;
            aVar.a("OVERLAY_WIDGET_UI", "type");
            String name = holder.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
            ?? boundData = holder.getBoundData();
            String str = null;
            String l11 = boundData != 0 ? Long.valueOf(boundData.getId()).toString() : null;
            if (l11 == null) {
                l11 = "";
            }
            aVar.a(l11, "id");
            l viewItem = holder.getViewItem();
            String c14 = (viewItem == null || (c12 = viewItem.c()) == null || (c13 = c12.c()) == null) ? null : c13.c();
            if (c14 == null) {
                c14 = "";
            }
            aVar.a(c14, "stateId");
            l viewItem2 = holder.getViewItem();
            if (viewItem2 != null && (c11 = viewItem2.c()) != null && (b11 = c11.b()) != null && (h11 = b11.h()) != null) {
                str = h11.e();
            }
            aVar.a(str != null ? str : "", "page");
            b.Companion companion = kotlin.time.b.INSTANCE;
            long b12 = metrics.b();
            EnumC10311b enumC10311b = EnumC10311b.NANOSECONDS;
            long h12 = c.h(b12, enumC10311b);
            EnumC10311b enumC10311b2 = EnumC10311b.MILLISECONDS;
            aVar.b("create", Double.valueOf(kotlin.time.b.m(h12, enumC10311b2)));
            aVar.b("bind", Double.valueOf(kotlin.time.b.m(c.h(metrics.a(), enumC10311b), enumC10311b2)));
            aVar.b("layout", Double.valueOf(kotlin.time.b.m(c.h(metrics.c(), enumC10311b), enumC10311b2)));
            aVar.c("ComposerPerf");
        }
    }

    @Override // n10.InterfaceC8418b
    /* renamed from: onDestroy-A3btV1Q */
    public void mo436onDestroyA3btV1Q(@NotNull String metricsInfo) {
        Intrinsics.checkNotNullParameter(metricsInfo, "metricsInfo");
        this.viewHoldersRumTracker.removePageTraceKey(metricsInfo);
    }

    @Override // n10.InterfaceC8418b
    /* renamed from: onLayoutStart-A3btV1Q */
    public void mo437onLayoutStartA3btV1Q(@NotNull String metricsInfo) {
        Intrinsics.checkNotNullParameter(metricsInfo, "metricsInfo");
        if (this.performanceTrackerDelegate.hasTrace(metricsInfo)) {
            this.pagePerformanceTracker.e(metricsInfo);
            this.viewHoldersRumTracker.addPageTraceKey(metricsInfo);
        }
    }

    @Override // n10.InterfaceC8418b
    public void onOverlayMetricsReady(@NotNull AbstractC6065b<?> holder, @NotNull l item, @NotNull C6283a metrics) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics)) {
            String valueOf = String.valueOf(holder.hashCode());
            this.performanceTrackerDelegate.runTrace(valueOf, new ComposerScreenPerformanceController$onOverlayMetricsReady$1(metrics, holder, this, item, valueOf));
        }
    }

    @Override // n10.InterfaceC8418b
    public void onPageReady(@NotNull S00.a metrics, @NotNull T00.a state) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(state, "state");
        this.pagePerformanceTracker.f(metrics.f());
        this.widgetDecodingTracker.sendTraces(state, metrics);
    }
}
