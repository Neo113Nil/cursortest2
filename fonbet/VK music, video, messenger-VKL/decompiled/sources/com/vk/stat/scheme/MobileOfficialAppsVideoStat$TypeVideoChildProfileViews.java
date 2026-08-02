package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoChildProfileViews implements SchemeStat$TypeView.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final ObjectValue objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("show_banner")
        public static final EventType SHOW_BANNER;

        static {
            EventType eventType = new EventType("SHOW_BANNER", 0);
            SHOW_BANNER = eventType;
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

    public MobileOfficialAppsVideoStat$TypeVideoChildProfileViews(EventType eventType, ObjectValue objectValue) {
        this.eventType = eventType;
        this.objectValue = objectValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoChildProfileViews)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoChildProfileViews mobileOfficialAppsVideoStat$TypeVideoChildProfileViews = (MobileOfficialAppsVideoStat$TypeVideoChildProfileViews) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoChildProfileViews.eventType && this.objectValue == mobileOfficialAppsVideoStat$TypeVideoChildProfileViews.objectValue;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        ObjectValue objectValue = this.objectValue;
        return hashCode + (objectValue == null ? 0 : objectValue.hashCode());
    }

    public final String toString() {
        return "TypeVideoChildProfileViews(eventType=" + this.eventType + ", objectValue=" + this.objectValue + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoChildProfileViews(EventType eventType, ObjectValue objectValue, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : objectValue);
    }
}
