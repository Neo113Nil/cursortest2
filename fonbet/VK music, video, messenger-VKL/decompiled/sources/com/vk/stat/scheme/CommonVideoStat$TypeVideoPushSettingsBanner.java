package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoPushSettingsBanner implements SchemeStat$TypeAction.b {

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

        @pmi0("push_settings_banner")
        public static final ObjectType PUSH_SETTINGS_BANNER;

        static {
            ObjectType objectType = new ObjectType("PUSH_SETTINGS_BANNER", 0);
            PUSH_SETTINGS_BANNER = objectType;
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

        @pmi0("author_subscription_trigger")
        public static final ObjectValue AUTHOR_SUBSCRIPTION_TRIGGER;

        @pmi0("notifications_opening")
        public static final ObjectValue NOTIFICATIONS_OPENING;

        @pmi0("playlist_subscription_trigger")
        public static final ObjectValue PLAYLIST_SUBSCRIPTION_TRIGGER;

        @pmi0("posting_a_comment")
        public static final ObjectValue POSTING_A_COMMENT;

        static {
            ObjectValue objectValue = new ObjectValue("AUTHOR_SUBSCRIPTION_TRIGGER", 0);
            AUTHOR_SUBSCRIPTION_TRIGGER = objectValue;
            ObjectValue objectValue2 = new ObjectValue("PLAYLIST_SUBSCRIPTION_TRIGGER", 1);
            PLAYLIST_SUBSCRIPTION_TRIGGER = objectValue2;
            ObjectValue objectValue3 = new ObjectValue("NOTIFICATIONS_OPENING", 2);
            NOTIFICATIONS_OPENING = objectValue3;
            ObjectValue objectValue4 = new ObjectValue("POSTING_A_COMMENT", 3);
            POSTING_A_COMMENT = objectValue4;
            ObjectValue[] objectValueArr = {objectValue, objectValue2, objectValue3, objectValue4};
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

    public CommonVideoStat$TypeVideoPushSettingsBanner(EventType eventType, ObjectType objectType, ObjectValue objectValue) {
        this.eventType = eventType;
        this.objectType = objectType;
        this.objectValue = objectValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoPushSettingsBanner)) {
            return false;
        }
        CommonVideoStat$TypeVideoPushSettingsBanner commonVideoStat$TypeVideoPushSettingsBanner = (CommonVideoStat$TypeVideoPushSettingsBanner) obj;
        return this.eventType == commonVideoStat$TypeVideoPushSettingsBanner.eventType && this.objectType == commonVideoStat$TypeVideoPushSettingsBanner.objectType && this.objectValue == commonVideoStat$TypeVideoPushSettingsBanner.objectValue;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        ObjectType objectType = this.objectType;
        int hashCode2 = (hashCode + (objectType == null ? 0 : objectType.hashCode())) * 31;
        ObjectValue objectValue = this.objectValue;
        return hashCode2 + (objectValue != null ? objectValue.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoPushSettingsBanner(eventType=" + this.eventType + ", objectType=" + this.objectType + ", objectValue=" + this.objectValue + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoPushSettingsBanner(EventType eventType, ObjectType objectType, ObjectValue objectValue, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : objectType, (i & 4) != 0 ? null : objectValue);
    }
}
