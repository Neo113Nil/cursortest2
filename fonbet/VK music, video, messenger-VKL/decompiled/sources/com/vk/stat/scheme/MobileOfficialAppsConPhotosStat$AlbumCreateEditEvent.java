package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent {

    @pmi0("album_create_event")
    private final MobileOfficialAppsConPhotosStat$AlbumCreateEvent albumCreateEvent;

    @pmi0("album_edit_event")
    private final MobileOfficialAppsConPhotosStat$AlbumEditEvent albumEditEvent;

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    public MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$AlbumCreateEvent mobileOfficialAppsConPhotosStat$AlbumCreateEvent, MobileOfficialAppsConPhotosStat$AlbumEditEvent mobileOfficialAppsConPhotosStat$AlbumEditEvent) {
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.albumCreateEvent = mobileOfficialAppsConPhotosStat$AlbumCreateEvent;
        this.albumEditEvent = mobileOfficialAppsConPhotosStat$AlbumEditEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent = (MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent) obj;
        return this.contentType == mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent.contentType && epx.f(this.albumCreateEvent, mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent.albumCreateEvent) && epx.f(this.albumEditEvent, mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent.albumEditEvent);
    }

    public final int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$AlbumCreateEvent mobileOfficialAppsConPhotosStat$AlbumCreateEvent = this.albumCreateEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$AlbumCreateEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumCreateEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumEditEvent mobileOfficialAppsConPhotosStat$AlbumEditEvent = this.albumEditEvent;
        return hashCode2 + (mobileOfficialAppsConPhotosStat$AlbumEditEvent != null ? mobileOfficialAppsConPhotosStat$AlbumEditEvent.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumCreateEditEvent(contentType=" + this.contentType + ", albumCreateEvent=" + this.albumCreateEvent + ", albumEditEvent=" + this.albumEditEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$AlbumCreateEvent mobileOfficialAppsConPhotosStat$AlbumCreateEvent, MobileOfficialAppsConPhotosStat$AlbumEditEvent mobileOfficialAppsConPhotosStat$AlbumEditEvent, int i, zcl zclVar) {
        this(mobileOfficialAppsConPhotosStat$ContentType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumCreateEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumEditEvent);
    }
}
