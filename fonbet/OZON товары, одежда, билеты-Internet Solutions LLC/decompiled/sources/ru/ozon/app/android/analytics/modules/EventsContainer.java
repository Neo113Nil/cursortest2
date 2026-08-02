package ru.ozon.app.android.analytics.modules;

import Rg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.datalayer.data.tracker.TrinityOzonTrackerEvent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/analytics/modules/EventsContainer;", "", "LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "screen", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "ozonTrackerEvent", "Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "trinityOzonTrackerEvent", "<init>", "(LRg/a;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;)V", "copy", "(LRg/a;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;)Lru/ozon/app/android/analytics/modules/EventsContainer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LRg/a;", "getScreen", "()LRg/a;", "setScreen", "(LRg/a;)V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "getOzonTrackerEvent", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "getTrinityOzonTrackerEvent", "()Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EventsContainer {
    private final AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent;
    private a screen;
    private final TrinityOzonTrackerEvent trinityOzonTrackerEvent;

    public EventsContainer() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EventsContainer copy$default(EventsContainer eventsContainer, a aVar, AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent, TrinityOzonTrackerEvent trinityOzonTrackerEvent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = eventsContainer.screen;
        }
        if ((i11 & 2) != 0) {
            ozonTrackerEvent = eventsContainer.ozonTrackerEvent;
        }
        if ((i11 & 4) != 0) {
            trinityOzonTrackerEvent = eventsContainer.trinityOzonTrackerEvent;
        }
        return eventsContainer.copy(aVar, ozonTrackerEvent, trinityOzonTrackerEvent);
    }

    @NotNull
    public final EventsContainer copy(a screen, AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent, TrinityOzonTrackerEvent trinityOzonTrackerEvent) {
        return new EventsContainer(screen, ozonTrackerEvent, trinityOzonTrackerEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsContainer)) {
            return false;
        }
        EventsContainer eventsContainer = (EventsContainer) other;
        return Intrinsics.d(this.screen, eventsContainer.screen) && Intrinsics.d(this.ozonTrackerEvent, eventsContainer.ozonTrackerEvent) && Intrinsics.d(this.trinityOzonTrackerEvent, eventsContainer.trinityOzonTrackerEvent);
    }

    public final AnalyticsDataLayer.OzonTrackerEvent getOzonTrackerEvent() {
        return this.ozonTrackerEvent;
    }

    public final a getScreen() {
        return this.screen;
    }

    public final TrinityOzonTrackerEvent getTrinityOzonTrackerEvent() {
        return this.trinityOzonTrackerEvent;
    }

    public int hashCode() {
        a aVar = this.screen;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent = this.ozonTrackerEvent;
        int hashCode2 = (hashCode + (ozonTrackerEvent == null ? 0 : ozonTrackerEvent.hashCode())) * 31;
        TrinityOzonTrackerEvent trinityOzonTrackerEvent = this.trinityOzonTrackerEvent;
        return hashCode2 + (trinityOzonTrackerEvent != null ? trinityOzonTrackerEvent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EventsContainer(screen=" + this.screen + ", ozonTrackerEvent=" + this.ozonTrackerEvent + ", trinityOzonTrackerEvent=" + this.trinityOzonTrackerEvent + ")";
    }

    public EventsContainer(a aVar, AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent, TrinityOzonTrackerEvent trinityOzonTrackerEvent) {
        this.screen = aVar;
        this.ozonTrackerEvent = ozonTrackerEvent;
        this.trinityOzonTrackerEvent = trinityOzonTrackerEvent;
    }

    public /* synthetic */ EventsContainer(a aVar, AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent, TrinityOzonTrackerEvent trinityOzonTrackerEvent, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : ozonTrackerEvent, (i11 & 4) != 0 ? null : trinityOzonTrackerEvent);
    }
}
