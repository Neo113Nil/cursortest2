package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_type")
    private final MobileOfficialAppsVideoStat$VideoTypeItem videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("author_open")
        public static final EventType AUTHOR_OPEN;

        @pmi0("change_author")
        public static final EventType CHANGE_AUTHOR;

        @pmi0("exit_description")
        public static final EventType EXIT_DESCRIPTION;

        @pmi0("exit_description_no_save")
        public static final EventType EXIT_DESCRIPTION_NO_SAVE;

        @pmi0("open_description")
        public static final EventType OPEN_DESCRIPTION;

        @pmi0("reset_postponed_time")
        public static final EventType RESET_POSTPONED_TIME;

        @pmi0("save_description")
        public static final EventType SAVE_DESCRIPTION;

        static {
            EventType eventType = new EventType("OPEN_DESCRIPTION", 0);
            OPEN_DESCRIPTION = eventType;
            EventType eventType2 = new EventType("SAVE_DESCRIPTION", 1);
            SAVE_DESCRIPTION = eventType2;
            EventType eventType3 = new EventType("EXIT_DESCRIPTION", 2);
            EXIT_DESCRIPTION = eventType3;
            EventType eventType4 = new EventType("EXIT_DESCRIPTION_NO_SAVE", 3);
            EXIT_DESCRIPTION_NO_SAVE = eventType4;
            EventType eventType5 = new EventType("RESET_POSTPONED_TIME", 4);
            RESET_POSTPONED_TIME = eventType5;
            EventType eventType6 = new EventType("AUTHOR_OPEN", 5);
            AUTHOR_OPEN = eventType6;
            EventType eventType7 = new EventType("CHANGE_AUTHOR", 6);
            CHANGE_AUTHOR = eventType7;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7};
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

    public MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick(EventType eventType, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem) {
        this.eventType = eventType;
        this.videoType = mobileOfficialAppsVideoStat$VideoTypeItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick = (MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.eventType && this.videoType == mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.videoType;
    }

    public final int hashCode() {
        return this.videoType.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoUploadOptionClick(eventType=" + this.eventType + ", videoType=" + this.videoType + ')';
    }
}
