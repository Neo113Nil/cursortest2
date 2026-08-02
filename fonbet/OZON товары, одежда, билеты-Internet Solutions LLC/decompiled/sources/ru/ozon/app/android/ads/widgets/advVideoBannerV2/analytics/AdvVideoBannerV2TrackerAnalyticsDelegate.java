package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import Xc.a;
import Xc.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0006\u0010\r\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate;", "", "<init>", "()V", "trackedOneTimeEventsMap", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "", "trackOneTimeEvent", "", "eventType", "action", "Lkotlin/Function0;", "resetData", "EventType", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2TrackerAnalyticsDelegate {

    @NotNull
    private final Map<EventType, Boolean> trackedOneTimeEventsMap;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "EXTERNAL_CONTAINER_CLICK", "INTERNAL_CONTAINER_CLICK", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType EXTERNAL_CONTAINER_CLICK = new EventType("EXTERNAL_CONTAINER_CLICK", 0);
        public static final EventType INTERNAL_CONTAINER_CLICK = new EventType("INTERNAL_CONTAINER_CLICK", 1);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EXTERNAL_CONTAINER_CLICK, INTERNAL_CONTAINER_CLICK};
        }

        static {
            EventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EventType(String str, int i11) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public AdvVideoBannerV2TrackerAnalyticsDelegate() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EventType eventType : EventType.values()) {
            linkedHashMap.put(eventType, Boolean.FALSE);
        }
        this.trackedOneTimeEventsMap = linkedHashMap;
    }

    public final void resetData() {
        for (EventType eventType : EventType.values()) {
            this.trackedOneTimeEventsMap.put(eventType, Boolean.FALSE);
        }
    }

    public final void trackOneTimeEvent(@NotNull EventType eventType, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean bool = this.trackedOneTimeEventsMap.get(eventType);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.d(bool, bool2)) {
            return;
        }
        action.invoke();
        this.trackedOneTimeEventsMap.put(eventType, bool2);
    }
}
