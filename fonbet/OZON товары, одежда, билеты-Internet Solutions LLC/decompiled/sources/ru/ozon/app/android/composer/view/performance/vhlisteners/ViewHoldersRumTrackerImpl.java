package ru.ozon.app.android.composer.view.performance.vhlisteners;

import H00.d;
import Qj0.AbstractC3880a;
import Qj0.B;
import Qj0.InterfaceC3892l;
import Qj0.U;
import Sg.a;
import T00.m;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.tracker.AnalyticsExtKt;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0017\u001a\u00020\u0016*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00110\u0011*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ%\u0010\u001f\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u001d\u0010&\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010$J\u000f\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001106j\b\u0012\u0004\u0012\u00020\u0011`78\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTrackerImpl;", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "tracker", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LRZ/a;", "composerAnalytics", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "widgetLayoutTimeMetricsStorage", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;LRZ/a;Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;)V", "", "isAffectPageTotalTime", "()Z", "LQj0/U;", "", "uuid", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "holder", "", "logPerformance", "(LQj0/U;Ljava/lang/String;Lru/ozon/composer/ui/widget/k;)V", "traceId", "(Lru/ozon/composer/ui/widget/k;)Ljava/lang/String;", "kotlin.jvm.PlatformType", ImagesContract.URL, "", "timeNanosStart", "onCreateViewHolder", "(Lru/ozon/composer/ui/widget/k;J)V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "onBindStart", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;)V", "onBindEnd", "onLayoutStart", "(Lru/ozon/composer/ui/widget/k;)V", "onLayoutEnd", "clearUnfinishedWidgetLayoutEvents", "()V", "key", "addPageTraceKey", "(Ljava/lang/String;)V", "removePageTraceKey", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LSg/a;", "LRZ/a;", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "", "traces", "Ljava/util/Set;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "pageTraceKeys", "Ljava/util/HashSet;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewHoldersRumTrackerImpl implements ViewHoldersRumTracker {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final RZ.a composerAnalytics;

    @NotNull
    private final HashSet<String> pageTraceKeys;

    @NotNull
    private final Set<String> traces;

    @NotNull
    private final PerformanceTrackerDelegate tracker;

    @NotNull
    private final WidgetLayoutTimeMetricsStorage widgetLayoutTimeMetricsStorage;

    public ViewHoldersRumTrackerImpl(@NotNull PerformanceTrackerDelegate tracker, @NotNull a analyticsScreenStorage, @NotNull RZ.a composerAnalytics, @NotNull WidgetLayoutTimeMetricsStorage widgetLayoutTimeMetricsStorage) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
        Intrinsics.checkNotNullParameter(widgetLayoutTimeMetricsStorage, "widgetLayoutTimeMetricsStorage");
        this.tracker = tracker;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.composerAnalytics = composerAnalytics;
        this.widgetLayoutTimeMetricsStorage = widgetLayoutTimeMetricsStorage;
        this.traces = new LinkedHashSet();
        this.pageTraceKeys = new HashSet<>();
    }

    private final boolean isAffectPageTotalTime() {
        return !this.pageTraceKeys.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPerformance(U u11, String str, k<c> kVar) {
        d c11;
        m c12;
        if (H00.d.b()) {
            HashMap a11 = H00.d.a();
            Object obj = a11.get(str);
            if (obj == null) {
                obj = new d.a(str);
                a11.put(str, obj);
            }
            d.a aVar = (d.a) obj;
            aVar.a("WIDGET_UI", "type");
            String name = kVar.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
            c boundData = kVar.getBoundData();
            String str2 = null;
            String l11 = boundData != null ? Long.valueOf(boundData.getId()).toString() : null;
            if (l11 == null) {
                l11 = "";
            }
            aVar.a(l11, "id");
            l viewItem = kVar.getViewItem();
            if (viewItem != null && (c11 = viewItem.c()) != null && (c12 = c11.c()) != null) {
                str2 = c12.c();
            }
            aVar.a(str2 != null ? str2 : "", "stateId");
            aVar.a(Integer.valueOf(kVar.getAdapterPosition()), "position");
            Iterator it = u11.j().iterator();
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            while (it.hasNext()) {
                Metric metric = (Metric) it.next();
                InterfaceC3892l type = metric.getType();
                Iterator it2 = it;
                if (type == MetricType.CREATION_TIME_START) {
                    j12 = metric.getValue();
                } else if (type == MetricType.CREATION_TIME_END) {
                    j11 = metric.getValue();
                } else if (type == MetricType.BIND_TIME_START) {
                    j14 = metric.getValue();
                } else if (type == MetricType.BIND_TIME_END) {
                    j13 = metric.getValue();
                } else if (type == MetricType.LAYOUT_TIME_START) {
                    j16 = metric.getValue();
                } else if (type == MetricType.LAYOUT_TIME_END) {
                    j15 = metric.getValue();
                }
                it = it2;
            }
            b.Companion companion = b.INSTANCE;
            EnumC10311b enumC10311b = EnumC10311b.NANOSECONDS;
            long h11 = kotlin.time.c.h(j11 - j12, enumC10311b);
            EnumC10311b enumC10311b2 = EnumC10311b.MILLISECONDS;
            aVar.b("create", Double.valueOf(b.m(h11, enumC10311b2)));
            aVar.b("bind", Double.valueOf(b.m(kotlin.time.c.h(j13 - j14, enumC10311b), enumC10311b2)));
            aVar.b("layout", Double.valueOf(b.m(kotlin.time.c.h(j15 - j16, enumC10311b), enumC10311b2)));
            aVar.c("ComposerPerf");
        }
    }

    private final String traceId(k<?> kVar) {
        return String.valueOf(kVar.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String url(k<c> kVar) {
        return kVar.getClass().getSimpleName();
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTracker
    public void addPageTraceKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.tracker.hasTrace(key)) {
            AbstractC3880a d11 = this.tracker.beginTrace(key).d(B.class);
            if (!(d11 instanceof B)) {
                d11 = null;
            }
            B b11 = (B) d11;
            if ((b11 != null ? b11.a() : null) != ObjectTypes.PAGE) {
                return;
            }
            this.pageTraceKeys.add(key);
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void clearUnfinishedWidgetLayoutEvents() {
        Set<String> set = this.traces;
        PerformanceTrackerDelegate performanceTrackerDelegate = this.tracker;
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            performanceTrackerDelegate.endTrace((String) it.next(), kotlin.collections.U.c());
        }
        this.traces.clear();
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onBindEnd(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics) && isAffectPageTotalTime()) {
            String traceId = traceId(holder);
            this.traces.add(traceId);
            this.tracker.beginTrace(traceId, new ViewHoldersRumTrackerImpl$onBindEnd$$inlined$onTrace$1(traceId));
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onBindStart(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        l20.d c11 = viewItem.c();
        m c12 = c11.c();
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics) && isAffectPageTotalTime()) {
            String traceId = traceId(holder);
            this.traces.add(traceId);
            this.tracker.beginTrace(traceId, new ViewHoldersRumTrackerImpl$onBindStart$$inlined$onTrace$1(traceId, this, holder, c12, c11));
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onCreateViewHolder(@NotNull k<c> holder, long timeNanosStart) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics) && isAffectPageTotalTime()) {
            String traceId = traceId(holder);
            this.traces.add(traceId);
            this.tracker.beginTrace(traceId, new ViewHoldersRumTrackerImpl$onCreateViewHolder$$inlined$onTrace$1(traceId, timeNanosStart));
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onLayoutEnd(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics) && isAffectPageTotalTime()) {
            String traceId = traceId(holder);
            this.traces.add(traceId);
            this.tracker.beginTrace(traceId, new ViewHoldersRumTrackerImpl$onLayoutEnd$$inlined$onTrace$1(traceId, holder, this));
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onLayoutStart(@NotNull k<c> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (AnalyticsExtKt.isPageTrackingEnabled(this.composerAnalytics) && isAffectPageTotalTime()) {
            String traceId = traceId(holder);
            this.traces.add(traceId);
            this.tracker.beginTrace(traceId, new ViewHoldersRumTrackerImpl$onLayoutStart$$inlined$onTrace$1(traceId));
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTracker
    public void removePageTraceKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.pageTraceKeys.remove(key);
    }
}
