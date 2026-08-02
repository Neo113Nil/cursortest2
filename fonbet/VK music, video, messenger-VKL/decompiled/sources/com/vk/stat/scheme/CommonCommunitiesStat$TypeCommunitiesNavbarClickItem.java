package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesNavbarClickItem implements CommonCommunitiesStat$TypeCommunitiesClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("copy_link")
        public static final Event COPY_LINK;

        static {
            Event event = new Event("COPY_LINK", 0);
            COPY_LINK = event;
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

    public CommonCommunitiesStat$TypeCommunitiesNavbarClickItem(Event event) {
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeCommunitiesNavbarClickItem) && this.event == ((CommonCommunitiesStat$TypeCommunitiesNavbarClickItem) obj).event;
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeCommunitiesNavbarClickItem(event=" + this.event + ')';
    }
}
