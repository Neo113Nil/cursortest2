package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent {

    @pmi0("archive_single_item_action_event_type")
    private final ArchiveSingleItemActionEventType archiveSingleItemActionEventType;

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class ArchiveSingleItemActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ArchiveSingleItemActionEventType[] $VALUES;

        @pmi0("click_to_pick")
        public static final ArchiveSingleItemActionEventType CLICK_TO_PICK;

        @pmi0("longtap")
        public static final ArchiveSingleItemActionEventType LONGTAP;

        @pmi0("open")
        public static final ArchiveSingleItemActionEventType OPEN;

        static {
            ArchiveSingleItemActionEventType archiveSingleItemActionEventType = new ArchiveSingleItemActionEventType("OPEN", 0);
            OPEN = archiveSingleItemActionEventType;
            ArchiveSingleItemActionEventType archiveSingleItemActionEventType2 = new ArchiveSingleItemActionEventType("LONGTAP", 1);
            LONGTAP = archiveSingleItemActionEventType2;
            ArchiveSingleItemActionEventType archiveSingleItemActionEventType3 = new ArchiveSingleItemActionEventType("CLICK_TO_PICK", 2);
            CLICK_TO_PICK = archiveSingleItemActionEventType3;
            ArchiveSingleItemActionEventType[] archiveSingleItemActionEventTypeArr = {archiveSingleItemActionEventType, archiveSingleItemActionEventType2, archiveSingleItemActionEventType3};
            $VALUES = archiveSingleItemActionEventTypeArr;
            $ENTRIES = new asp(archiveSingleItemActionEventTypeArr);
        }

        private ArchiveSingleItemActionEventType(String str, int i) {
        }

        public static ArchiveSingleItemActionEventType valueOf(String str) {
            return (ArchiveSingleItemActionEventType) Enum.valueOf(ArchiveSingleItemActionEventType.class, str);
        }

        public static ArchiveSingleItemActionEventType[] values() {
            return (ArchiveSingleItemActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent(ArchiveSingleItemActionEventType archiveSingleItemActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.archiveSingleItemActionEventType = archiveSingleItemActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent = (MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent) obj;
        return this.archiveSingleItemActionEventType == mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.archiveSingleItemActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + (this.archiveSingleItemActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "ArchiveSingleItemActionEvent(archiveSingleItemActionEventType=" + this.archiveSingleItemActionEventType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
