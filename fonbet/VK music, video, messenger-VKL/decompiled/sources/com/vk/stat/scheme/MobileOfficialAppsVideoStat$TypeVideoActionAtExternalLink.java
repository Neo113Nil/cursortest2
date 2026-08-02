package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_external_link")
        public static final EventType ADD_EXTERNAL_LINK;

        @pmi0("click_transfer_link")
        public static final EventType CLICK_TRANSFER_LINK;

        @pmi0("delete_external_link")
        public static final EventType DELETE_EXTERNAL_LINK;

        @pmi0("save_external_link")
        public static final EventType SAVE_EXTERNAL_LINK;

        static {
            EventType eventType = new EventType("ADD_EXTERNAL_LINK", 0);
            ADD_EXTERNAL_LINK = eventType;
            EventType eventType2 = new EventType("SAVE_EXTERNAL_LINK", 1);
            SAVE_EXTERNAL_LINK = eventType2;
            EventType eventType3 = new EventType("DELETE_EXTERNAL_LINK", 2);
            DELETE_EXTERNAL_LINK = eventType3;
            EventType eventType4 = new EventType("CLICK_TRANSFER_LINK", 3);
            CLICK_TRANSFER_LINK = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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

    public MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink) && this.eventType == ((MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeVideoActionAtExternalLink(eventType=" + this.eventType + ')';
    }
}
