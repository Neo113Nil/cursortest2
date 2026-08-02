package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeVideoProfileSwipeClickItem implements CommonCommunitiesStat$TypeCommunitiesClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("event_data")
    private final EventData eventData;

    @pmi0("video_id")
    private final long videoId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("open_community")
        public static final Event OPEN_COMMUNITY;

        static {
            Event event = new Event("OPEN_COMMUNITY", 0);
            OPEN_COMMUNITY = event;
            Event[] eventArr = {event};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventData {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventData[] $VALUES;

        @pmi0("by_click")
        public static final EventData BY_CLICK;

        @pmi0("by_swipe")
        public static final EventData BY_SWIPE;

        static {
            EventData eventData = new EventData("BY_SWIPE", 0);
            BY_SWIPE = eventData;
            EventData eventData2 = new EventData("BY_CLICK", 1);
            BY_CLICK = eventData2;
            EventData[] eventDataArr = {eventData, eventData2};
            $VALUES = eventDataArr;
            $ENTRIES = new asp(eventDataArr);
        }

        private EventData(String str, int i) {
        }

        public static EventData valueOf(String str) {
            return (EventData) Enum.valueOf(EventData.class, str);
        }

        public static EventData[] values() {
            return (EventData[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeVideoProfileSwipeClickItem(Event event, long j, EventData eventData) {
        this.event = event;
        this.videoId = j;
        this.eventData = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeVideoProfileSwipeClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeVideoProfileSwipeClickItem commonCommunitiesStat$TypeVideoProfileSwipeClickItem = (CommonCommunitiesStat$TypeVideoProfileSwipeClickItem) obj;
        return this.event == commonCommunitiesStat$TypeVideoProfileSwipeClickItem.event && this.videoId == commonCommunitiesStat$TypeVideoProfileSwipeClickItem.videoId && this.eventData == commonCommunitiesStat$TypeVideoProfileSwipeClickItem.eventData;
    }

    public final int hashCode() {
        return this.eventData.hashCode() + bh10.a(this.event.hashCode() * 31, 31, this.videoId);
    }

    public final String toString() {
        return "TypeVideoProfileSwipeClickItem(event=" + this.event + ", videoId=" + this.videoId + ", eventData=" + this.eventData + ')';
    }
}
