package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("channel")
        public static final EventSubtype CHANNEL;

        @pmi0("edit_video")
        public static final EventSubtype EDIT_VIDEO;

        @pmi0("empty_playlist")
        public static final EventSubtype EMPTY_PLAYLIST;

        @pmi0("new_video")
        public static final EventSubtype NEW_VIDEO;

        @pmi0("playlist")
        public static final EventSubtype PLAYLIST;

        static {
            EventSubtype eventSubtype = new EventSubtype("PLAYLIST", 0);
            PLAYLIST = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("EMPTY_PLAYLIST", 1);
            EMPTY_PLAYLIST = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("CHANNEL", 2);
            CHANNEL = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("NEW_VIDEO", 3);
            NEW_VIDEO = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("EDIT_VIDEO", 4);
            EDIT_VIDEO = eventSubtype5;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5};
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
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_video_cancel")
        public static final EventType ADD_VIDEO_CANCEL;

        @pmi0("add_video_end")
        public static final EventType ADD_VIDEO_END;

        @pmi0("add_video_start")
        public static final EventType ADD_VIDEO_START;

        @pmi0("clear_search")
        public static final EventType CLEAR_SEARCH;

        @pmi0("search_video")
        public static final EventType SEARCH_VIDEO;

        static {
            EventType eventType = new EventType("ADD_VIDEO_START", 0);
            ADD_VIDEO_START = eventType;
            EventType eventType2 = new EventType("ADD_VIDEO_END", 1);
            ADD_VIDEO_END = eventType2;
            EventType eventType3 = new EventType("ADD_VIDEO_CANCEL", 2);
            ADD_VIDEO_CANCEL = eventType3;
            EventType eventType4 = new EventType("SEARCH_VIDEO", 3);
            SEARCH_VIDEO = eventType4;
            EventType eventType5 = new EventType("CLEAR_SEARCH", 4);
            CLEAR_SEARCH = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
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

    public MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick = (MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoAddToAlbumClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
