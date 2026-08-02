package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeCallerIdEventItem implements SchemeStat$TypeAction.b {

    @pmi0("current_version")
    private final Integer currentVersion;

    @pmi0("error")
    private final String error;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("in_contacts")
    private final Boolean inContacts;

    @pmi0("new_version")
    private final Integer newVersion;

    @pmi0("phone")
    private final String phone;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("call_ended")
        public static final EventType CALL_ENDED;

        @pmi0("call_incoming")
        public static final EventType CALL_INCOMING;

        @pmi0("call_started")
        public static final EventType CALL_STARTED;

        @pmi0("database_was_updated_from_diff_files")
        public static final EventType DATABASE_WAS_UPDATED_FROM_DIFF_FILES;

        @pmi0("database_was_updated_from_file")
        public static final EventType DATABASE_WAS_UPDATED_FROM_FILE;

        @pmi0("download_diff_files")
        public static final EventType DOWNLOAD_DIFF_FILES;

        @pmi0("download_file")
        public static final EventType DOWNLOAD_FILE;

        @pmi0("file_is_actual")
        public static final EventType FILE_IS_ACTUAL;

        @pmi0("get_file_info")
        public static final EventType GET_FILE_INFO;

        @pmi0("get_phone_owner_info")
        public static final EventType GET_PHONE_OWNER_INFO;

        @pmi0("hide_overlay_view")
        public static final EventType HIDE_OVERLAY_VIEW;

        @pmi0("is_need_feedback")
        public static final EventType IS_NEED_FEEDBACK;

        @pmi0("phone_found_in_database")
        public static final EventType PHONE_FOUND_IN_DATABASE;

        @pmi0("post_feedback")
        public static final EventType POST_FEEDBACK;

        @pmi0("report_call")
        public static final EventType REPORT_CALL;

        @pmi0("set_sdk_disabled")
        public static final EventType SET_SDK_DISABLED;

        @pmi0("set_sdk_enabled")
        public static final EventType SET_SDK_ENABLED;

        @pmi0("show_overlay_view")
        public static final EventType SHOW_OVERLAY_VIEW;

        @pmi0("update_database_error")
        public static final EventType UPDATE_DATABASE_ERROR;

        @pmi0("update_database_from_diff_files")
        public static final EventType UPDATE_DATABASE_FROM_DIFF_FILES;

        @pmi0("update_database_from_file")
        public static final EventType UPDATE_DATABASE_FROM_FILE;

        @pmi0("user_cancelled_feedback")
        public static final EventType USER_CANCELLED_FEEDBACK;

        static {
            EventType eventType = new EventType("SET_SDK_ENABLED", 0);
            SET_SDK_ENABLED = eventType;
            EventType eventType2 = new EventType("SET_SDK_DISABLED", 1);
            SET_SDK_DISABLED = eventType2;
            EventType eventType3 = new EventType("CALL_INCOMING", 2);
            CALL_INCOMING = eventType3;
            EventType eventType4 = new EventType("CALL_STARTED", 3);
            CALL_STARTED = eventType4;
            EventType eventType5 = new EventType("CALL_ENDED", 4);
            CALL_ENDED = eventType5;
            EventType eventType6 = new EventType("PHONE_FOUND_IN_DATABASE", 5);
            PHONE_FOUND_IN_DATABASE = eventType6;
            EventType eventType7 = new EventType("GET_PHONE_OWNER_INFO", 6);
            GET_PHONE_OWNER_INFO = eventType7;
            EventType eventType8 = new EventType("IS_NEED_FEEDBACK", 7);
            IS_NEED_FEEDBACK = eventType8;
            EventType eventType9 = new EventType("POST_FEEDBACK", 8);
            POST_FEEDBACK = eventType9;
            EventType eventType10 = new EventType("REPORT_CALL", 9);
            REPORT_CALL = eventType10;
            EventType eventType11 = new EventType("GET_FILE_INFO", 10);
            GET_FILE_INFO = eventType11;
            EventType eventType12 = new EventType("FILE_IS_ACTUAL", 11);
            FILE_IS_ACTUAL = eventType12;
            EventType eventType13 = new EventType("DOWNLOAD_FILE", 12);
            DOWNLOAD_FILE = eventType13;
            EventType eventType14 = new EventType("DOWNLOAD_DIFF_FILES", 13);
            DOWNLOAD_DIFF_FILES = eventType14;
            EventType eventType15 = new EventType("UPDATE_DATABASE_FROM_FILE", 14);
            UPDATE_DATABASE_FROM_FILE = eventType15;
            EventType eventType16 = new EventType("UPDATE_DATABASE_FROM_DIFF_FILES", 15);
            UPDATE_DATABASE_FROM_DIFF_FILES = eventType16;
            EventType eventType17 = new EventType("DATABASE_WAS_UPDATED_FROM_FILE", 16);
            DATABASE_WAS_UPDATED_FROM_FILE = eventType17;
            EventType eventType18 = new EventType("DATABASE_WAS_UPDATED_FROM_DIFF_FILES", 17);
            DATABASE_WAS_UPDATED_FROM_DIFF_FILES = eventType18;
            EventType eventType19 = new EventType("SHOW_OVERLAY_VIEW", 18);
            SHOW_OVERLAY_VIEW = eventType19;
            EventType eventType20 = new EventType("HIDE_OVERLAY_VIEW", 19);
            HIDE_OVERLAY_VIEW = eventType20;
            EventType eventType21 = new EventType("UPDATE_DATABASE_ERROR", 20);
            UPDATE_DATABASE_ERROR = eventType21;
            EventType eventType22 = new EventType("USER_CANCELLED_FEEDBACK", 21);
            USER_CANCELLED_FEEDBACK = eventType22;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22};
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

    public SchemeStat$TypeCallerIdEventItem(EventType eventType, String str, Integer num, Integer num2, String str2, Boolean bool) {
        this.eventType = eventType;
        this.phone = str;
        this.currentVersion = num;
        this.newVersion = num2;
        this.error = str2;
        this.inContacts = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeCallerIdEventItem)) {
            return false;
        }
        SchemeStat$TypeCallerIdEventItem schemeStat$TypeCallerIdEventItem = (SchemeStat$TypeCallerIdEventItem) obj;
        return this.eventType == schemeStat$TypeCallerIdEventItem.eventType && epx.f(this.phone, schemeStat$TypeCallerIdEventItem.phone) && epx.f(this.currentVersion, schemeStat$TypeCallerIdEventItem.currentVersion) && epx.f(this.newVersion, schemeStat$TypeCallerIdEventItem.newVersion) && epx.f(this.error, schemeStat$TypeCallerIdEventItem.error) && epx.f(this.inContacts, schemeStat$TypeCallerIdEventItem.inContacts);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.phone;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.currentVersion;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.newVersion;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.error;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.inContacts;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCallerIdEventItem(eventType=");
        sb.append(this.eventType);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", currentVersion=");
        sb.append(this.currentVersion);
        sb.append(", newVersion=");
        sb.append(this.newVersion);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", inContacts=");
        return tn.a(sb, this.inContacts, ')');
    }

    public /* synthetic */ SchemeStat$TypeCallerIdEventItem(EventType eventType, String str, Integer num, Integer num2, String str2, Boolean bool, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool);
    }
}
