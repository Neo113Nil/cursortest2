package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCommentClick implements SchemeStat$TypeClick.b {

    @pmi0("comment_id")
    private final String commentId;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("click_to_reply")
        public static final Event CLICK_TO_REPLY;

        @pmi0("content_owner_like_tap")
        public static final Event CONTENT_OWNER_LIKE_TAP;

        @pmi0("copy")
        public static final Event COPY;

        @pmi0("swipe_to_reply")
        public static final Event SWIPE_TO_REPLY;

        @pmi0("tap")
        public static final Event TAP;

        @pmi0("timecode_tap")
        public static final Event TIMECODE_TAP;

        static {
            Event event = new Event("CLICK_TO_REPLY", 0);
            CLICK_TO_REPLY = event;
            Event event2 = new Event("SWIPE_TO_REPLY", 1);
            SWIPE_TO_REPLY = event2;
            Event event3 = new Event("COPY", 2);
            COPY = event3;
            Event event4 = new Event("TIMECODE_TAP", 3);
            TIMECODE_TAP = event4;
            Event event5 = new Event("CONTENT_OWNER_LIKE_TAP", 4);
            CONTENT_OWNER_LIKE_TAP = event5;
            Event event6 = new Event("TAP", 5);
            TAP = event6;
            Event[] eventArr = {event, event2, event3, event4, event5, event6};
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

    public MobileOfficialAppsVideoStat$TypeVideoCommentClick(Event event, String str) {
        this.event = event;
        this.commentId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoCommentClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoCommentClick mobileOfficialAppsVideoStat$TypeVideoCommentClick = (MobileOfficialAppsVideoStat$TypeVideoCommentClick) obj;
        return this.event == mobileOfficialAppsVideoStat$TypeVideoCommentClick.event && epx.f(this.commentId, mobileOfficialAppsVideoStat$TypeVideoCommentClick.commentId);
    }

    public final int hashCode() {
        return this.commentId.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoCommentClick(event=");
        sb.append(this.event);
        sb.append(", commentId=");
        return ho8.a(sb, this.commentId, ')');
    }
}
