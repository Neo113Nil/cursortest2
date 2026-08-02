package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoMusicTrackDelete implements SchemeStat$TypeClick.b {

    @pmi0("audio_item")
    private final CommonStat$TypeCommonEventItem audioItem;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("card")
        public static final EventSubtype CARD;

        @pmi0("player")
        public static final EventSubtype PLAYER;

        static {
            EventSubtype eventSubtype = new EventSubtype("CARD", 0);
            CARD = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("PLAYER", 1);
            PLAYER = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("music_track_delete")
        public static final EventType MUSIC_TRACK_DELETE;

        static {
            EventType eventType = new EventType("MUSIC_TRACK_DELETE", 0);
            MUSIC_TRACK_DELETE = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public CommonVideoStat$TypeVideoMusicTrackDelete(EventType eventType, EventSubtype eventSubtype, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.audioItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoMusicTrackDelete)) {
            return false;
        }
        CommonVideoStat$TypeVideoMusicTrackDelete commonVideoStat$TypeVideoMusicTrackDelete = (CommonVideoStat$TypeVideoMusicTrackDelete) obj;
        return this.eventType == commonVideoStat$TypeVideoMusicTrackDelete.eventType && this.eventSubtype == commonVideoStat$TypeVideoMusicTrackDelete.eventSubtype && epx.f(this.audioItem, commonVideoStat$TypeVideoMusicTrackDelete.audioItem);
    }

    public final int hashCode() {
        return this.audioItem.hashCode() + ((this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeVideoMusicTrackDelete(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", audioItem=" + this.audioItem + ')';
    }
}
