package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final ObjectValue objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("settings")
        public static final EventSubtype SETTINGS;

        @pmi0("settings_kid_button")
        public static final EventSubtype SETTINGS_KID_BUTTON;

        static {
            EventSubtype eventSubtype = new EventSubtype("SETTINGS", 0);
            SETTINGS = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SETTINGS_KID_BUTTON", 1);
            SETTINGS_KID_BUTTON = eventSubtype2;
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

        @pmi0("click_banner")
        public static final EventType CLICK_BANNER;

        @pmi0("hide_banner")
        public static final EventType HIDE_BANNER;

        @pmi0("kid_profile_create_start")
        public static final EventType KID_PROFILE_CREATE_START;

        static {
            EventType eventType = new EventType("CLICK_BANNER", 0);
            CLICK_BANNER = eventType;
            EventType eventType2 = new EventType("HIDE_BANNER", 1);
            HIDE_BANNER = eventType2;
            EventType eventType3 = new EventType("KID_PROFILE_CREATE_START", 2);
            KID_PROFILE_CREATE_START = eventType3;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ObjectValue {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectValue[] $VALUES;

        @pmi0("for_kids_video_for_you")
        public static final ObjectValue FOR_KIDS_VIDEO_FOR_YOU;

        @pmi0("kid_profile_for_kids")
        public static final ObjectValue KID_PROFILE_FOR_KIDS;

        @pmi0("kid_profile_settings")
        public static final ObjectValue KID_PROFILE_SETTINGS;

        static {
            ObjectValue objectValue = new ObjectValue("KID_PROFILE_SETTINGS", 0);
            KID_PROFILE_SETTINGS = objectValue;
            ObjectValue objectValue2 = new ObjectValue("FOR_KIDS_VIDEO_FOR_YOU", 1);
            FOR_KIDS_VIDEO_FOR_YOU = objectValue2;
            ObjectValue objectValue3 = new ObjectValue("KID_PROFILE_FOR_KIDS", 2);
            KID_PROFILE_FOR_KIDS = objectValue3;
            ObjectValue[] objectValueArr = {objectValue, objectValue2, objectValue3};
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

    public MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks(EventType eventType, EventSubtype eventSubtype, ObjectValue objectValue) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.objectValue = objectValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks = (MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.eventSubtype && this.objectValue == mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.objectValue;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        ObjectValue objectValue = this.objectValue;
        return hashCode2 + (objectValue != null ? objectValue.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoChildProfileClicks(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", objectValue=" + this.objectValue + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks(EventType eventType, EventSubtype eventSubtype, ObjectValue objectValue, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype, (i & 4) != 0 ? null : objectValue);
    }
}
