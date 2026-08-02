package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick implements SchemeStat$TypeClick.b {

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

        @pmi0(X3.i.Z)
        public static final EventSubtype MAIN;

        @pmi0("new_video")
        public static final EventSubtype NEW_VIDEO;

        static {
            EventSubtype eventSubtype = new EventSubtype("MAIN", 0);
            MAIN = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("CHANNEL", 1);
            CHANNEL = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("NEW_VIDEO", 2);
            NEW_VIDEO = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("EDIT_VIDEO", 3);
            EDIT_VIDEO = eventSubtype4;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4};
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

        @pmi0("create_cancel")
        public static final EventType CREATE_CANCEL;

        @pmi0("create_end")
        public static final EventType CREATE_END;

        @pmi0("create_start")
        public static final EventType CREATE_START;

        static {
            EventType eventType = new EventType("CREATE_START", 0);
            CREATE_START = eventType;
            EventType eventType2 = new EventType("CREATE_END", 1);
            CREATE_END = eventType2;
            EventType eventType3 = new EventType("CREATE_CANCEL", 2);
            CREATE_CANCEL = eventType3;
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

    public MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick = (MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoAlbumCreateClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
