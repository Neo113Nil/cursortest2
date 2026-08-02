package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("sort_latest")
        public static final Event SORT_LATEST;

        @pmi0("sort_oldest")
        public static final Event SORT_OLDEST;

        @pmi0("sort_popular")
        public static final Event SORT_POPULAR;

        static {
            Event event = new Event("SORT_POPULAR", 0);
            SORT_POPULAR = event;
            Event event2 = new Event("SORT_OLDEST", 1);
            SORT_OLDEST = event2;
            Event event3 = new Event("SORT_LATEST", 2);
            SORT_LATEST = event3;
            Event[] eventArr = {event, event2, event3};
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

    public MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick(Event event) {
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick) && this.event == ((MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick) obj).event;
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeVideoCommentsSortTabClick(event=" + this.event + ')';
    }
}
