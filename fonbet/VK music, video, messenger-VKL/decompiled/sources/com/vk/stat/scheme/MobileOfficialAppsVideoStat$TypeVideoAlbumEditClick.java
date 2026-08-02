package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick implements SchemeStat$TypeClick.b {

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

        @pmi0("playlist")
        public static final EventSubtype PLAYLIST;

        static {
            EventSubtype eventSubtype = new EventSubtype("CHANNEL", 0);
            CHANNEL = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("PLAYLIST", 1);
            PLAYLIST = eventSubtype2;
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
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("edit_cancel")
        public static final EventType EDIT_CANCEL;

        @pmi0("edit_end")
        public static final EventType EDIT_END;

        @pmi0("edit_start")
        public static final EventType EDIT_START;

        static {
            EventType eventType = new EventType("EDIT_START", 0);
            EDIT_START = eventType;
            EventType eventType2 = new EventType("EDIT_END", 1);
            EDIT_END = eventType2;
            EventType eventType3 = new EventType("EDIT_CANCEL", 2);
            EDIT_CANCEL = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick = (MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoAlbumEditClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
