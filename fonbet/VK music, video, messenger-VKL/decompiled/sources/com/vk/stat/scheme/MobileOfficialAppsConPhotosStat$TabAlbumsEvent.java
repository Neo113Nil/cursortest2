package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabAlbumsEvent {

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("tab_albums_navigation_event")
    private final MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent tabAlbumsNavigationEvent;

    @pmi0("tab_albums_single_item_action_event")
    private final MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent tabAlbumsSingleItemActionEvent;

    public MobileOfficialAppsConPhotosStat$TabAlbumsEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent, MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent) {
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.tabAlbumsNavigationEvent = mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent;
        this.tabAlbumsSingleItemActionEvent = mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabAlbumsEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabAlbumsEvent mobileOfficialAppsConPhotosStat$TabAlbumsEvent = (MobileOfficialAppsConPhotosStat$TabAlbumsEvent) obj;
        return this.contentType == mobileOfficialAppsConPhotosStat$TabAlbumsEvent.contentType && epx.f(this.tabAlbumsNavigationEvent, mobileOfficialAppsConPhotosStat$TabAlbumsEvent.tabAlbumsNavigationEvent) && epx.f(this.tabAlbumsSingleItemActionEvent, mobileOfficialAppsConPhotosStat$TabAlbumsEvent.tabAlbumsSingleItemActionEvent);
    }

    public final int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent = this.tabAlbumsNavigationEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent = this.tabAlbumsSingleItemActionEvent;
        return hashCode2 + (mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent != null ? mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TabAlbumsEvent(contentType=" + this.contentType + ", tabAlbumsNavigationEvent=" + this.tabAlbumsNavigationEvent + ", tabAlbumsSingleItemActionEvent=" + this.tabAlbumsSingleItemActionEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$TabAlbumsEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent, MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent, int i, zcl zclVar) {
        this(mobileOfficialAppsConPhotosStat$ContentType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent);
    }
}
