package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeUniversalBanner implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_type")
    private final ObjectType objectType;

    @pmi0("object_value")
    private final ObjectValue objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_banner")
        public static final EventType CLICK_BANNER;

        @pmi0("hide_banner")
        public static final EventType HIDE_BANNER;

        @pmi0("show_banner")
        public static final EventType SHOW_BANNER;

        static {
            EventType eventType = new EventType("SHOW_BANNER", 0);
            SHOW_BANNER = eventType;
            EventType eventType2 = new EventType("HIDE_BANNER", 1);
            HIDE_BANNER = eventType2;
            EventType eventType3 = new EventType("CLICK_BANNER", 2);
            CLICK_BANNER = eventType3;
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
    /* compiled from: CommonVideoStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("universal_banner")
        public static final ObjectType UNIVERSAL_BANNER;

        static {
            ObjectType objectType = new ObjectType("UNIVERSAL_BANNER", 0);
            UNIVERSAL_BANNER = objectType;
            ObjectType[] objectTypeArr = {objectType};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class ObjectValue {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectValue[] $VALUES;

        @pmi0("authorization")
        public static final ObjectValue AUTHORIZATION;

        @pmi0("for_kids_profile")
        public static final ObjectValue FOR_KIDS_PROFILE;

        @pmi0("for_kids_video_for_you")
        public static final ObjectValue FOR_KIDS_VIDEO_FOR_YOU;

        @pmi0("kid_mode")
        public static final ObjectValue KID_MODE;

        @pmi0("kid_profile")
        public static final ObjectValue KID_PROFILE;

        @pmi0("kid_profile_for_kids")
        public static final ObjectValue KID_PROFILE_FOR_KIDS;

        @pmi0("kid_profile_video_for_you")
        public static final ObjectValue KID_PROFILE_VIDEO_FOR_YOU;

        @pmi0("musical_video_banner")
        public static final ObjectValue MUSICAL_VIDEO_BANNER;

        static {
            ObjectValue objectValue = new ObjectValue("AUTHORIZATION", 0);
            AUTHORIZATION = objectValue;
            ObjectValue objectValue2 = new ObjectValue("KID_MODE", 1);
            KID_MODE = objectValue2;
            ObjectValue objectValue3 = new ObjectValue("KID_PROFILE", 2);
            KID_PROFILE = objectValue3;
            ObjectValue objectValue4 = new ObjectValue("KID_PROFILE_VIDEO_FOR_YOU", 3);
            KID_PROFILE_VIDEO_FOR_YOU = objectValue4;
            ObjectValue objectValue5 = new ObjectValue("KID_PROFILE_FOR_KIDS", 4);
            KID_PROFILE_FOR_KIDS = objectValue5;
            ObjectValue objectValue6 = new ObjectValue("FOR_KIDS_PROFILE", 5);
            FOR_KIDS_PROFILE = objectValue6;
            ObjectValue objectValue7 = new ObjectValue("FOR_KIDS_VIDEO_FOR_YOU", 6);
            FOR_KIDS_VIDEO_FOR_YOU = objectValue7;
            ObjectValue objectValue8 = new ObjectValue("MUSICAL_VIDEO_BANNER", 7);
            MUSICAL_VIDEO_BANNER = objectValue8;
            ObjectValue[] objectValueArr = {objectValue, objectValue2, objectValue3, objectValue4, objectValue5, objectValue6, objectValue7, objectValue8};
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

    public CommonVideoStat$TypeUniversalBanner(EventType eventType, ObjectType objectType, ObjectValue objectValue) {
        this.eventType = eventType;
        this.objectType = objectType;
        this.objectValue = objectValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeUniversalBanner)) {
            return false;
        }
        CommonVideoStat$TypeUniversalBanner commonVideoStat$TypeUniversalBanner = (CommonVideoStat$TypeUniversalBanner) obj;
        return this.eventType == commonVideoStat$TypeUniversalBanner.eventType && this.objectType == commonVideoStat$TypeUniversalBanner.objectType && this.objectValue == commonVideoStat$TypeUniversalBanner.objectValue;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        ObjectType objectType = this.objectType;
        int hashCode2 = (hashCode + (objectType == null ? 0 : objectType.hashCode())) * 31;
        ObjectValue objectValue = this.objectValue;
        return hashCode2 + (objectValue != null ? objectValue.hashCode() : 0);
    }

    public final String toString() {
        return "TypeUniversalBanner(eventType=" + this.eventType + ", objectType=" + this.objectType + ", objectValue=" + this.objectValue + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeUniversalBanner(EventType eventType, ObjectType objectType, ObjectValue objectValue, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : objectType, (i & 4) != 0 ? null : objectValue);
    }
}
