package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("comments_to_fullscreen")
        public static final Event COMMENTS_TO_FULLSCREEN;

        @pmi0("open_comment_next_level")
        public static final Event OPEN_COMMENT_NEXT_LEVEL;

        static {
            Event event = new Event("OPEN_COMMENT_NEXT_LEVEL", 0);
            OPEN_COMMENT_NEXT_LEVEL = event;
            Event event2 = new Event("COMMENTS_TO_FULLSCREEN", 1);
            COMMENTS_TO_FULLSCREEN = event2;
            Event[] eventArr = {event, event2};
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

    public MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick(Event event) {
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick) && this.event == ((MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick) obj).event;
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeVideoScreenCommentClick(event=" + this.event + ')';
    }
}
