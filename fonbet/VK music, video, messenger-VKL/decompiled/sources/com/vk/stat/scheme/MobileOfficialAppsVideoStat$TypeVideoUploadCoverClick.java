package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("choose_cover")
        public static final EventType CHOOSE_COVER;

        @pmi0("choose_cover_edit")
        public static final EventType CHOOSE_COVER_EDIT;

        @pmi0("cover_ready")
        public static final EventType COVER_READY;

        @pmi0("cover_ready_edit")
        public static final EventType COVER_READY_EDIT;

        static {
            EventType eventType = new EventType("CHOOSE_COVER", 0);
            CHOOSE_COVER = eventType;
            EventType eventType2 = new EventType("CHOOSE_COVER_EDIT", 1);
            CHOOSE_COVER_EDIT = eventType2;
            EventType eventType3 = new EventType("COVER_READY", 2);
            COVER_READY = eventType3;
            EventType eventType4 = new EventType("COVER_READY_EDIT", 3);
            COVER_READY_EDIT = eventType4;
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

    public MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick) && this.eventType == ((MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeVideoUploadCoverClick(eventType=" + this.eventType + ')';
    }
}
