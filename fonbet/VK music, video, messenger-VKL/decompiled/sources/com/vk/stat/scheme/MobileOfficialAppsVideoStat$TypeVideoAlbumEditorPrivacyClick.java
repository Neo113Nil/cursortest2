package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick implements SchemeStat$TypeClick.b {

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

        @pmi0("admins")
        public static final EventSubtype ADMINS;

        @pmi0("all")
        public static final EventSubtype ALL;

        @pmi0("link")
        public static final EventSubtype LINK;

        @pmi0("subscribers")
        public static final EventSubtype SUBSCRIBERS;

        static {
            EventSubtype eventSubtype = new EventSubtype("ALL", 0);
            ALL = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SUBSCRIBERS", 1);
            SUBSCRIBERS = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("ADMINS", 2);
            ADMINS = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("LINK", 3);
            LINK = eventSubtype4;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4};
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

        @pmi0("change_create_privacy")
        public static final EventType CHANGE_CREATE_PRIVACY;

        @pmi0("change_edit_privacy")
        public static final EventType CHANGE_EDIT_PRIVACY;

        static {
            EventType eventType = new EventType("CHANGE_CREATE_PRIVACY", 0);
            CHANGE_CREATE_PRIVACY = eventType;
            EventType eventType2 = new EventType("CHANGE_EDIT_PRIVACY", 1);
            CHANGE_EDIT_PRIVACY = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick = (MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoAlbumEditorPrivacyClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
