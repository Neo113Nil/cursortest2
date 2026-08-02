package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoTopshelfClick implements SchemeStat$TypeClick.b {

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

        @pmi0("video_catalog_for_kids_kid_profile_create")
        public static final EventSubtype VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_CREATE;

        @pmi0("video_catalog_for_kids_kid_profile_go")
        public static final EventSubtype VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_GO;

        static {
            EventSubtype eventSubtype = new EventSubtype("VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_CREATE", 0);
            VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_CREATE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_GO", 1);
            VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_GO = eventSubtype2;
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

        @pmi0("top_shelf_click")
        public static final EventType TOP_SHELF_CLICK;

        static {
            EventType eventType = new EventType("TOP_SHELF_CLICK", 0);
            TOP_SHELF_CLICK = eventType;
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

    public MobileOfficialAppsVideoStat$TypeVideoTopshelfClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoTopshelfClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoTopshelfClick mobileOfficialAppsVideoStat$TypeVideoTopshelfClick = (MobileOfficialAppsVideoStat$TypeVideoTopshelfClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoTopshelfClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoTopshelfClick.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoTopshelfClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
