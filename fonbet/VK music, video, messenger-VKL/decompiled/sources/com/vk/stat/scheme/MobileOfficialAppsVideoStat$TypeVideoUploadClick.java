package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadClick implements SchemeStat$TypeClick.b {

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

        @pmi0("author_channel_main")
        public static final EventSubtype AUTHOR_CHANNEL_MAIN;

        @pmi0("author_channel_tab_video")
        public static final EventSubtype AUTHOR_CHANNEL_TAB_VIDEO;

        @pmi0("from_community")
        public static final EventSubtype FROM_COMMUNITY;

        @pmi0("from_main")
        public static final EventSubtype FROM_MAIN;

        @pmi0("from_profile")
        public static final EventSubtype FROM_PROFILE;

        static {
            EventSubtype eventSubtype = new EventSubtype("FROM_MAIN", 0);
            FROM_MAIN = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("FROM_PROFILE", 1);
            FROM_PROFILE = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("FROM_COMMUNITY", 2);
            FROM_COMMUNITY = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("AUTHOR_CHANNEL_MAIN", 3);
            AUTHOR_CHANNEL_MAIN = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("AUTHOR_CHANNEL_TAB_VIDEO", 4);
            AUTHOR_CHANNEL_TAB_VIDEO = eventSubtype5;
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

        @pmi0("add_from_link")
        public static final EventType ADD_FROM_LINK;

        @pmi0("choose_file")
        public static final EventType CHOOSE_FILE;

        @pmi0("click_to_cancel_upload")
        public static final EventType CLICK_TO_CANCEL_UPLOAD;

        @pmi0("click_to_delete_upload")
        public static final EventType CLICK_TO_DELETE_UPLOAD;

        @pmi0("click_to_upload_video")
        public static final EventType CLICK_TO_UPLOAD_VIDEO;

        @pmi0("create_video")
        public static final EventType CREATE_VIDEO;

        @pmi0("ready_for_upload")
        public static final EventType READY_FOR_UPLOAD;

        @pmi0("think_about_upload")
        public static final EventType THINK_ABOUT_UPLOAD;

        @pmi0("try_upload_clip")
        public static final EventType TRY_UPLOAD_CLIP;

        @pmi0("try_upload_video")
        public static final EventType TRY_UPLOAD_VIDEO;

        static {
            EventType eventType = new EventType("THINK_ABOUT_UPLOAD", 0);
            THINK_ABOUT_UPLOAD = eventType;
            EventType eventType2 = new EventType("TRY_UPLOAD_VIDEO", 1);
            TRY_UPLOAD_VIDEO = eventType2;
            EventType eventType3 = new EventType("TRY_UPLOAD_CLIP", 2);
            TRY_UPLOAD_CLIP = eventType3;
            EventType eventType4 = new EventType("CHOOSE_FILE", 3);
            CHOOSE_FILE = eventType4;
            EventType eventType5 = new EventType("CREATE_VIDEO", 4);
            CREATE_VIDEO = eventType5;
            EventType eventType6 = new EventType("ADD_FROM_LINK", 5);
            ADD_FROM_LINK = eventType6;
            EventType eventType7 = new EventType("READY_FOR_UPLOAD", 6);
            READY_FOR_UPLOAD = eventType7;
            EventType eventType8 = new EventType("CLICK_TO_UPLOAD_VIDEO", 7);
            CLICK_TO_UPLOAD_VIDEO = eventType8;
            EventType eventType9 = new EventType("CLICK_TO_CANCEL_UPLOAD", 8);
            CLICK_TO_CANCEL_UPLOAD = eventType9;
            EventType eventType10 = new EventType("CLICK_TO_DELETE_UPLOAD", 9);
            CLICK_TO_DELETE_UPLOAD = eventType10;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10};
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

    public MobileOfficialAppsVideoStat$TypeVideoUploadClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadClick mobileOfficialAppsVideoStat$TypeVideoUploadClick = (MobileOfficialAppsVideoStat$TypeVideoUploadClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoUploadClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoUploadClick.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeVideoUploadClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoUploadClick(EventType eventType, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype);
    }
}
