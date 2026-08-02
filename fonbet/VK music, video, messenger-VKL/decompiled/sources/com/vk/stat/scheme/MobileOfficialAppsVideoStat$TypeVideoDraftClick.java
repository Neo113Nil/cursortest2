package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDraftClick implements SchemeStat$TypeClick.b {

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

        @pmi0("draft")
        public static final EventSubtype DRAFT;

        @pmi0("from_upload")
        public static final EventSubtype FROM_UPLOAD;

        static {
            EventSubtype eventSubtype = new EventSubtype("DRAFT", 0);
            DRAFT = eventSubtype;
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

        @pmi0("click_to_publish_draft")
        public static final EventType CLICK_TO_PUBLISH_DRAFT;

        @pmi0("delete_draft")
        public static final EventType DELETE_DRAFT;

        @pmi0("delete_draft_confirm")
        public static final EventType DELETE_DRAFT_CONFIRM;

        @pmi0("draft_as_postponed")
        public static final EventType DRAFT_AS_POSTPONED;

        @pmi0("edit_draft")
        public static final EventType EDIT_DRAFT;

        @pmi0("exit_from_draft")
        public static final EventType EXIT_FROM_DRAFT;

        @pmi0("publish_draft")
        public static final EventType PUBLISH_DRAFT;

        @pmi0("save_draft")
        public static final EventType SAVE_DRAFT;

        @pmi0("try_to_exit_draft")
        public static final EventType TRY_TO_EXIT_DRAFT;

        static {
            EventType eventType = new EventType("EDIT_DRAFT", 0);
            EDIT_DRAFT = eventType;
            EventType eventType2 = new EventType("PUBLISH_DRAFT", 1);
            PUBLISH_DRAFT = eventType2;
            EventType eventType3 = new EventType("DRAFT_AS_POSTPONED", 2);
            DRAFT_AS_POSTPONED = eventType3;
            EventType eventType4 = new EventType("TRY_TO_EXIT_DRAFT", 3);
            TRY_TO_EXIT_DRAFT = eventType4;
            EventType eventType5 = new EventType("EXIT_FROM_DRAFT", 4);
            EXIT_FROM_DRAFT = eventType5;
            EventType eventType6 = new EventType("SAVE_DRAFT", 5);
            SAVE_DRAFT = eventType6;
            EventType eventType7 = new EventType("DELETE_DRAFT", 6);
            DELETE_DRAFT = eventType7;
            EventType eventType8 = new EventType("DELETE_DRAFT_CONFIRM", 7);
            DELETE_DRAFT_CONFIRM = eventType8;
            EventType eventType9 = new EventType("CLICK_TO_PUBLISH_DRAFT", 8);
            CLICK_TO_PUBLISH_DRAFT = eventType9;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9};
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

    public MobileOfficialAppsVideoStat$TypeVideoDraftClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoDraftClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoDraftClick mobileOfficialAppsVideoStat$TypeVideoDraftClick = (MobileOfficialAppsVideoStat$TypeVideoDraftClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoDraftClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoDraftClick.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoDraftClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
