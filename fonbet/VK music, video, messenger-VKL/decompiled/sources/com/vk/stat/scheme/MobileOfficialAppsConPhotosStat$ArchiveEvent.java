package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$ArchiveEvent {

    @pmi0("archive_detailed_action_event")
    private final MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent archiveDetailedActionEvent;

    @pmi0("archive_multiple_items_action_event")
    private final MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent archiveMultipleItemsActionEvent;

    @pmi0("archive_single_item_action_event")
    private final MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent archiveSingleItemActionEvent;

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    public MobileOfficialAppsConPhotosStat$ArchiveEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent, MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent, MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent) {
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.archiveSingleItemActionEvent = mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent;
        this.archiveMultipleItemsActionEvent = mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent;
        this.archiveDetailedActionEvent = mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$ArchiveEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$ArchiveEvent mobileOfficialAppsConPhotosStat$ArchiveEvent = (MobileOfficialAppsConPhotosStat$ArchiveEvent) obj;
        return this.contentType == mobileOfficialAppsConPhotosStat$ArchiveEvent.contentType && epx.f(this.archiveSingleItemActionEvent, mobileOfficialAppsConPhotosStat$ArchiveEvent.archiveSingleItemActionEvent) && epx.f(this.archiveMultipleItemsActionEvent, mobileOfficialAppsConPhotosStat$ArchiveEvent.archiveMultipleItemsActionEvent) && epx.f(this.archiveDetailedActionEvent, mobileOfficialAppsConPhotosStat$ArchiveEvent.archiveDetailedActionEvent);
    }

    public final int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent = this.archiveSingleItemActionEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent = this.archiveMultipleItemsActionEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent = this.archiveDetailedActionEvent;
        return hashCode3 + (mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent != null ? mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent.hashCode() : 0);
    }

    public final String toString() {
        return "ArchiveEvent(contentType=" + this.contentType + ", archiveSingleItemActionEvent=" + this.archiveSingleItemActionEvent + ", archiveMultipleItemsActionEvent=" + this.archiveMultipleItemsActionEvent + ", archiveDetailedActionEvent=" + this.archiveDetailedActionEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$ArchiveEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent, MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent, MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent, int i, zcl zclVar) {
        this(mobileOfficialAppsConPhotosStat$ContentType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent);
    }
}
