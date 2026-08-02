package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumDetailsEvent {

    @pmi0("album_details_album_action_event")
    private final MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent albumDetailsAlbumActionEvent;

    @pmi0("album_details_detailed_action_event")
    private final MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent albumDetailsDetailedActionEvent;

    @pmi0("album_details_multiple_photos_action_event")
    private final MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent albumDetailsMultiplePhotosActionEvent;

    @pmi0("album_details_single_photo_action_event")
    private final MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent albumDetailsSinglePhotoActionEvent;

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    public MobileOfficialAppsConPhotosStat$AlbumDetailsEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent) {
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.albumDetailsAlbumActionEvent = mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent;
        this.albumDetailsSinglePhotoActionEvent = mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent;
        this.albumDetailsMultiplePhotosActionEvent = mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent;
        this.albumDetailsDetailedActionEvent = mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumDetailsEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumDetailsEvent mobileOfficialAppsConPhotosStat$AlbumDetailsEvent = (MobileOfficialAppsConPhotosStat$AlbumDetailsEvent) obj;
        return this.contentType == mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.contentType && epx.f(this.albumDetailsAlbumActionEvent, mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.albumDetailsAlbumActionEvent) && epx.f(this.albumDetailsSinglePhotoActionEvent, mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.albumDetailsSinglePhotoActionEvent) && epx.f(this.albumDetailsMultiplePhotosActionEvent, mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.albumDetailsMultiplePhotosActionEvent) && epx.f(this.albumDetailsDetailedActionEvent, mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.albumDetailsDetailedActionEvent);
    }

    public final int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent = this.albumDetailsAlbumActionEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent = this.albumDetailsSinglePhotoActionEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent = this.albumDetailsMultiplePhotosActionEvent;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent = this.albumDetailsDetailedActionEvent;
        return hashCode4 + (mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent != null ? mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumDetailsEvent(contentType=" + this.contentType + ", albumDetailsAlbumActionEvent=" + this.albumDetailsAlbumActionEvent + ", albumDetailsSinglePhotoActionEvent=" + this.albumDetailsSinglePhotoActionEvent + ", albumDetailsMultiplePhotosActionEvent=" + this.albumDetailsMultiplePhotosActionEvent + ", albumDetailsDetailedActionEvent=" + this.albumDetailsDetailedActionEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$AlbumDetailsEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent, int i, zcl zclVar) {
        this(mobileOfficialAppsConPhotosStat$ContentType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent, (i & 16) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent);
    }
}
