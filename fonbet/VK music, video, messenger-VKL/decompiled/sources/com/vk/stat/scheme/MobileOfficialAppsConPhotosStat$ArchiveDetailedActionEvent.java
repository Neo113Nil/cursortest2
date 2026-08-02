package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent {

    @pmi0("archive_detailed_action_event_type")
    private final ArchiveDetailedActionEventType archiveDetailedActionEventType;

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class ArchiveDetailedActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ArchiveDetailedActionEventType[] $VALUES;

        @pmi0("return_from_archive")
        public static final ArchiveDetailedActionEventType RETURN_FROM_ARCHIVE;

        static {
            ArchiveDetailedActionEventType archiveDetailedActionEventType = new ArchiveDetailedActionEventType("RETURN_FROM_ARCHIVE", 0);
            RETURN_FROM_ARCHIVE = archiveDetailedActionEventType;
            ArchiveDetailedActionEventType[] archiveDetailedActionEventTypeArr = {archiveDetailedActionEventType};
            $VALUES = archiveDetailedActionEventTypeArr;
            $ENTRIES = new asp(archiveDetailedActionEventTypeArr);
        }

        private ArchiveDetailedActionEventType(String str, int i) {
        }

        public static ArchiveDetailedActionEventType valueOf(String str) {
            return (ArchiveDetailedActionEventType) Enum.valueOf(ArchiveDetailedActionEventType.class, str);
        }

        public static ArchiveDetailedActionEventType[] values() {
            return (ArchiveDetailedActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent(ArchiveDetailedActionEventType archiveDetailedActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.archiveDetailedActionEventType = archiveDetailedActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent = (MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent) obj;
        return this.archiveDetailedActionEventType == mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent.archiveDetailedActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent.contentIdParam) && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + ((this.contentIdParam.hashCode() + (this.archiveDetailedActionEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ArchiveDetailedActionEvent(archiveDetailedActionEventType=" + this.archiveDetailedActionEventType + ", contentIdParam=" + this.contentIdParam + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
