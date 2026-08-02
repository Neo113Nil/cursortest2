package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoMusicTrackAddSuccess implements SchemeStat$TypeView.b {

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

        @pmi0("first_time")
        public static final EventSubtype FIRST_TIME;

        static {
            EventSubtype eventSubtype = new EventSubtype("FIRST_TIME", 0);
            FIRST_TIME = eventSubtype;
            EventSubtype[] eventSubtypeArr = {eventSubtype};
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

        @pmi0("music_track_add_success")
        public static final EventType MUSIC_TRACK_ADD_SUCCESS;

        static {
            EventType eventType = new EventType("MUSIC_TRACK_ADD_SUCCESS", 0);
            MUSIC_TRACK_ADD_SUCCESS = eventType;
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

    public CommonVideoStat$TypeVideoMusicTrackAddSuccess(EventType eventType, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.audioItem = commonStat$TypeCommonEventItem;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoMusicTrackAddSuccess)) {
            return false;
        }
        CommonVideoStat$TypeVideoMusicTrackAddSuccess commonVideoStat$TypeVideoMusicTrackAddSuccess = (CommonVideoStat$TypeVideoMusicTrackAddSuccess) obj;
        return this.eventType == commonVideoStat$TypeVideoMusicTrackAddSuccess.eventType && epx.f(this.audioItem, commonVideoStat$TypeVideoMusicTrackAddSuccess.audioItem) && this.eventSubtype == commonVideoStat$TypeVideoMusicTrackAddSuccess.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = (this.audioItem.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeVideoMusicTrackAddSuccess(eventType=" + this.eventType + ", audioItem=" + this.audioItem + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoMusicTrackAddSuccess(EventType eventType, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, commonStat$TypeCommonEventItem, (i & 4) != 0 ? null : eventSubtype);
    }
}
