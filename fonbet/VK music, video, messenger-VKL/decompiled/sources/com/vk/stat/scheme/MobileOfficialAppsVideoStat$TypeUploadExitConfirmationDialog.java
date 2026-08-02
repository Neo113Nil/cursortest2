package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog implements SchemeStat$TypeAction.b {

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

        @pmi0("exit_from_edit")
        public static final EventType EXIT_FROM_EDIT;

        @pmi0("exit_from_upload")
        public static final EventType EXIT_FROM_UPLOAD;

        @pmi0("return_to_upload")
        public static final EventType RETURN_TO_UPLOAD;

        @pmi0("try_to_exit")
        public static final EventType TRY_TO_EXIT;

        static {
            EventType eventType = new EventType("TRY_TO_EXIT", 0);
            TRY_TO_EXIT = eventType;
            EventType eventType2 = new EventType("EXIT_FROM_UPLOAD", 1);
            EXIT_FROM_UPLOAD = eventType2;
            EventType eventType3 = new EventType("EXIT_FROM_EDIT", 2);
            EXIT_FROM_EDIT = eventType3;
            EventType eventType4 = new EventType("RETURN_TO_UPLOAD", 3);
            RETURN_TO_UPLOAD = eventType4;
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

    public MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog(EventType eventType, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem) {
        this.eventType = eventType;
        this.videoType = mobileOfficialAppsVideoStat$VideoTypeItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog = (MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.eventType && this.videoType == mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.videoType;
    }

    public final int hashCode() {
        return this.videoType.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeUploadExitConfirmationDialog(eventType=" + this.eventType + ", videoType=" + this.videoType + ')';
    }
}
