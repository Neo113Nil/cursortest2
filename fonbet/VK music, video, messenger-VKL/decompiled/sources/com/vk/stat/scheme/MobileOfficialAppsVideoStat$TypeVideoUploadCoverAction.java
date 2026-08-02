package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("error_choose_cover")
        public static final EventType ERROR_CHOOSE_COVER;

        @pmi0("error_choose_cover_edit")
        public static final EventType ERROR_CHOOSE_COVER_EDIT;

        static {
            EventType eventType = new EventType("ERROR_CHOOSE_COVER", 0);
            ERROR_CHOOSE_COVER = eventType;
            EventType eventType2 = new EventType("ERROR_CHOOSE_COVER_EDIT", 1);
            ERROR_CHOOSE_COVER_EDIT = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction) && this.eventType == ((MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeVideoUploadCoverAction(eventType=" + this.eventType + ')';
    }
}
