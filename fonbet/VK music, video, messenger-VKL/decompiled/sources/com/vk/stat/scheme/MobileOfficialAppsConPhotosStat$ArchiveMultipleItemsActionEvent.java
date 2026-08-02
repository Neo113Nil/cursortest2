package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent {

    @pmi0("archive_multiple_items_action_event_type")
    private final ArchiveMultipleItemsActionEventType archiveMultipleItemsActionEventType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class ArchiveMultipleItemsActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ArchiveMultipleItemsActionEventType[] $VALUES;

        @pmi0("click_to_return_from_archive")
        public static final ArchiveMultipleItemsActionEventType CLICK_TO_RETURN_FROM_ARCHIVE;

        @pmi0("delete")
        public static final ArchiveMultipleItemsActionEventType DELETE;

        @pmi0("download")
        public static final ArchiveMultipleItemsActionEventType DOWNLOAD;

        static {
            ArchiveMultipleItemsActionEventType archiveMultipleItemsActionEventType = new ArchiveMultipleItemsActionEventType("DOWNLOAD", 0);
            DOWNLOAD = archiveMultipleItemsActionEventType;
            ArchiveMultipleItemsActionEventType archiveMultipleItemsActionEventType2 = new ArchiveMultipleItemsActionEventType("DELETE", 1);
            DELETE = archiveMultipleItemsActionEventType2;
            ArchiveMultipleItemsActionEventType archiveMultipleItemsActionEventType3 = new ArchiveMultipleItemsActionEventType("CLICK_TO_RETURN_FROM_ARCHIVE", 2);
            CLICK_TO_RETURN_FROM_ARCHIVE = archiveMultipleItemsActionEventType3;
            ArchiveMultipleItemsActionEventType[] archiveMultipleItemsActionEventTypeArr = {archiveMultipleItemsActionEventType, archiveMultipleItemsActionEventType2, archiveMultipleItemsActionEventType3};
            $VALUES = archiveMultipleItemsActionEventTypeArr;
            $ENTRIES = new asp(archiveMultipleItemsActionEventTypeArr);
        }

        private ArchiveMultipleItemsActionEventType(String str, int i) {
        }

        public static ArchiveMultipleItemsActionEventType valueOf(String str) {
            return (ArchiveMultipleItemsActionEventType) Enum.valueOf(ArchiveMultipleItemsActionEventType.class, str);
        }

        public static ArchiveMultipleItemsActionEventType[] values() {
            return (ArchiveMultipleItemsActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent(ArchiveMultipleItemsActionEventType archiveMultipleItemsActionEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.archiveMultipleItemsActionEventType = archiveMultipleItemsActionEventType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent = (MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent) obj;
        return this.archiveMultipleItemsActionEventType == mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.archiveMultipleItemsActionEventType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + (this.archiveMultipleItemsActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "ArchiveMultipleItemsActionEvent(archiveMultipleItemsActionEventType=" + this.archiveMultipleItemsActionEventType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
