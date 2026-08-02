package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_type")
    private final String objectType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("from_upload")
        public static final EventSubtype FROM_UPLOAD;

        @pmi0("postponed")
        public static final EventSubtype POSTPONED;

        static {
            EventSubtype eventSubtype = new EventSubtype("POSTPONED", 0);
            POSTPONED = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("FROM_UPLOAD", 1);
            FROM_UPLOAD = eventSubtype2;
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

        @pmi0("change_postponed")
        public static final EventType CHANGE_POSTPONED;

        @pmi0("create_postponed")
        public static final EventType CREATE_POSTPONED;

        @pmi0("delete_postponed")
        public static final EventType DELETE_POSTPONED;

        @pmi0("delete_postponed_confirm")
        public static final EventType DELETE_POSTPONED_CONFIRM;

        @pmi0("edit_postponed")
        public static final EventType EDIT_POSTPONED;

        @pmi0("publish_postponed")
        public static final EventType PUBLISH_POSTPONED;

        @pmi0("reset_postponed_time")
        public static final EventType RESET_POSTPONED_TIME;

        @pmi0("save_postponed")
        public static final EventType SAVE_POSTPONED;

        static {
            EventType eventType = new EventType("CREATE_POSTPONED", 0);
            CREATE_POSTPONED = eventType;
            EventType eventType2 = new EventType("CHANGE_POSTPONED", 1);
            CHANGE_POSTPONED = eventType2;
            EventType eventType3 = new EventType("PUBLISH_POSTPONED", 2);
            PUBLISH_POSTPONED = eventType3;
            EventType eventType4 = new EventType("EDIT_POSTPONED", 3);
            EDIT_POSTPONED = eventType4;
            EventType eventType5 = new EventType("SAVE_POSTPONED", 4);
            SAVE_POSTPONED = eventType5;
            EventType eventType6 = new EventType("DELETE_POSTPONED", 5);
            DELETE_POSTPONED = eventType6;
            EventType eventType7 = new EventType("DELETE_POSTPONED_CONFIRM", 6);
            DELETE_POSTPONED_CONFIRM = eventType7;
            EventType eventType8 = new EventType("RESET_POSTPONED_TIME", 7);
            RESET_POSTPONED_TIME = eventType8;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8};
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

    public MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(EventType eventType, String str, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.objectType = str;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick = (MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.eventType && epx.f(this.objectType, mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.objectType) && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.eventSubtype;
    }

    public final int hashCode() {
        int a = urd0.a(this.eventType.hashCode() * 31, 31, this.objectType);
        EventSubtype eventSubtype = this.eventSubtype;
        return a + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeVideoPostponedPublicationClick(eventType=" + this.eventType + ", objectType=" + this.objectType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(EventType eventType, String str, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? "postponed" : str, (i & 4) != 0 ? null : eventSubtype);
    }
}
