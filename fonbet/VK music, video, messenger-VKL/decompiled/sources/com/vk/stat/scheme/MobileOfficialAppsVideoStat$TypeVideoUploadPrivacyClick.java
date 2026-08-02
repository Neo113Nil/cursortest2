package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final ObjectValue objectValue;

    @pmi0("video_type")
    private final MobileOfficialAppsVideoStat$VideoTypeItem videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("comments")
        public static final EventSubtype COMMENTS;

        @pmi0("views")
        public static final EventSubtype VIEWS;

        static {
            EventSubtype eventSubtype = new EventSubtype("VIEWS", 0);
            VIEWS = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("COMMENTS", 1);
            COMMENTS = eventSubtype2;
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

        @pmi0("open_privacy")
        public static final EventType OPEN_PRIVACY;

        @pmi0("save_privacy")
        public static final EventType SAVE_PRIVACY;

        static {
            EventType eventType = new EventType("OPEN_PRIVACY", 0);
            OPEN_PRIVACY = eventType;
            EventType eventType2 = new EventType("SAVE_PRIVACY", 1);
            SAVE_PRIVACY = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ObjectValue {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectValue[] $VALUES;

        @pmi0("admins_and_editors")
        public static final ObjectValue ADMINS_AND_EDITORS;

        @pmi0("all_users")
        public static final ObjectValue ALL_USERS;

        @pmi0("dons")
        public static final ObjectValue DONS;

        @pmi0("followers")
        public static final ObjectValue FOLLOWERS;

        @pmi0("has_link")
        public static final ObjectValue HAS_LINK;

        static {
            ObjectValue objectValue = new ObjectValue("ALL_USERS", 0);
            ALL_USERS = objectValue;
            ObjectValue objectValue2 = new ObjectValue("FOLLOWERS", 1);
            FOLLOWERS = objectValue2;
            ObjectValue objectValue3 = new ObjectValue("ADMINS_AND_EDITORS", 2);
            ADMINS_AND_EDITORS = objectValue3;
            ObjectValue objectValue4 = new ObjectValue("DONS", 3);
            DONS = objectValue4;
            ObjectValue objectValue5 = new ObjectValue("HAS_LINK", 4);
            HAS_LINK = objectValue5;
            ObjectValue[] objectValueArr = {objectValue, objectValue2, objectValue3, objectValue4, objectValue5};
            $VALUES = objectValueArr;
            $ENTRIES = new asp(objectValueArr);
        }

        private ObjectValue(String str, int i) {
        }

        public static ObjectValue valueOf(String str) {
            return (ObjectValue) Enum.valueOf(ObjectValue.class, str);
        }

        public static ObjectValue[] values() {
            return (ObjectValue[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick(EventType eventType, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem, EventSubtype eventSubtype, ObjectValue objectValue) {
        this.eventType = eventType;
        this.videoType = mobileOfficialAppsVideoStat$VideoTypeItem;
        this.eventSubtype = eventSubtype;
        this.objectValue = objectValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick = (MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.eventType && this.videoType == mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.videoType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.eventSubtype && this.objectValue == mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.objectValue;
    }

    public final int hashCode() {
        int hashCode = (this.eventSubtype.hashCode() + ((this.videoType.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31;
        ObjectValue objectValue = this.objectValue;
        return hashCode + (objectValue == null ? 0 : objectValue.hashCode());
    }

    public final String toString() {
        return "TypeVideoUploadPrivacyClick(eventType=" + this.eventType + ", videoType=" + this.videoType + ", eventSubtype=" + this.eventSubtype + ", objectValue=" + this.objectValue + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick(EventType eventType, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem, EventSubtype eventSubtype, ObjectValue objectValue, int i, zcl zclVar) {
        this(eventType, mobileOfficialAppsVideoStat$VideoTypeItem, eventSubtype, (i & 8) != 0 ? null : objectValue);
    }
}
