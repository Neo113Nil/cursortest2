package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeCastEventItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_id")
    private final String videoId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("error")
        public static final EventType ERROR;

        @pmi0("session_end")
        public static final EventType SESSION_END;

        @pmi0("session_start")
        public static final EventType SESSION_START;

        @pmi0("video_finish")
        public static final EventType VIDEO_FINISH;

        @pmi0("video_pause")
        public static final EventType VIDEO_PAUSE;

        @pmi0("video_play")
        public static final EventType VIDEO_PLAY;

        static {
            EventType eventType = new EventType("SESSION_START", 0);
            SESSION_START = eventType;
            EventType eventType2 = new EventType("VIDEO_PLAY", 1);
            VIDEO_PLAY = eventType2;
            EventType eventType3 = new EventType("VIDEO_PAUSE", 2);
            VIDEO_PAUSE = eventType3;
            EventType eventType4 = new EventType("VIDEO_FINISH", 3);
            VIDEO_FINISH = eventType4;
            EventType eventType5 = new EventType("SESSION_END", 4);
            SESSION_END = eventType5;
            EventType eventType6 = new EventType("ERROR", 5);
            ERROR = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeCastEventItem(EventType eventType, String str) {
        this.eventType = eventType;
        this.videoId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeCastEventItem)) {
            return false;
        }
        SchemeStat$TypeCastEventItem schemeStat$TypeCastEventItem = (SchemeStat$TypeCastEventItem) obj;
        return this.eventType == schemeStat$TypeCastEventItem.eventType && epx.f(this.videoId, schemeStat$TypeCastEventItem.videoId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.videoId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCastEventItem(eventType=");
        sb.append(this.eventType);
        sb.append(", videoId=");
        return ho8.a(sb, this.videoId, ')');
    }

    public /* synthetic */ SchemeStat$TypeCastEventItem(EventType eventType, String str, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str);
    }
}
