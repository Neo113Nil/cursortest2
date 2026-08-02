package ru.ozon.app.android.analytics.modules;

import Sc.InterfaceC3999a;
import Sg.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;

@InterfaceC3999a
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R4\u0010\u001f\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\u000e\u0010\u000e\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "analyticsDataLayer", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;LSg/a;)V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "getAnalyticsDataLayer$analytics_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "LSg/a;", "Lru/ozon/app/android/analytics/modules/EventsContainer;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "eventsContainer", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "getEventsContainer", "()Lru/ozon/app/android/analytics/modules/EventsContainer;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "getOzonTrackerEvent", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "setOzonTrackerEvent", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;)V", "ozonTrackerEvent", "LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "getScreen", "()LRg/a;", "setScreen", "(LRg/a;)V", "screen", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BackwardCompatibleAnalyticsDataLayer {

    @NotNull
    private final AnalyticsDataLayer analyticsDataLayer;

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private EventsContainer eventsContainer;

    public BackwardCompatibleAnalyticsDataLayer(@NotNull AnalyticsDataLayer analyticsDataLayer, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(analyticsDataLayer, "analyticsDataLayer");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.analyticsDataLayer = analyticsDataLayer;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.eventsContainer = new EventsContainer(analyticsScreenStorage.a(), null, null, 6, null);
    }

    @NotNull
    /* renamed from: getAnalyticsDataLayer$analytics_prodGoogleAllVendorsRelease, reason: from getter */
    public final AnalyticsDataLayer getAnalyticsDataLayer() {
        return this.analyticsDataLayer;
    }

    @NotNull
    public final EventsContainer getEventsContainer() {
        return this.eventsContainer;
    }

    public final void setOzonTrackerEvent(AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent) {
        this.eventsContainer = EventsContainer.copy$default(this.eventsContainer, null, ozonTrackerEvent, null, 5, null);
    }

    public final void setScreen(Rg.a aVar) {
        this.eventsContainer = EventsContainer.copy$default(this.eventsContainer, aVar, null, null, 6, null);
    }
}
