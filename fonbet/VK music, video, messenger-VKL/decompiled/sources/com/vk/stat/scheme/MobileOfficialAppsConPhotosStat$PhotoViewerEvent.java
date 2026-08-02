package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoViewerEvent {

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("photo_viewer_common_info_event")
    private final MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent photoViewerCommonInfoEvent;

    @pmi0("photo_viewer_detailed_info_event")
    private final MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent photoViewerDetailedInfoEvent;

    @pmi0("photo_viewer_entrypoint")
    private final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint photoViewerEntrypoint;

    @pmi0("photo_viewer_open_nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen photoViewerOpenNavScreen;

    public MobileOfficialAppsConPhotosStat$PhotoViewerEvent(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent, MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint) {
        this.photoViewerOpenNavScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.photoViewerCommonInfoEvent = mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent;
        this.photoViewerDetailedInfoEvent = mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent;
        this.photoViewerEntrypoint = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PhotoViewerEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PhotoViewerEvent mobileOfficialAppsConPhotosStat$PhotoViewerEvent = (MobileOfficialAppsConPhotosStat$PhotoViewerEvent) obj;
        return this.photoViewerOpenNavScreen == mobileOfficialAppsConPhotosStat$PhotoViewerEvent.photoViewerOpenNavScreen && this.contentType == mobileOfficialAppsConPhotosStat$PhotoViewerEvent.contentType && epx.f(this.photoViewerCommonInfoEvent, mobileOfficialAppsConPhotosStat$PhotoViewerEvent.photoViewerCommonInfoEvent) && epx.f(this.photoViewerDetailedInfoEvent, mobileOfficialAppsConPhotosStat$PhotoViewerEvent.photoViewerDetailedInfoEvent) && this.photoViewerEntrypoint == mobileOfficialAppsConPhotosStat$PhotoViewerEvent.photoViewerEntrypoint;
    }

    public final int hashCode() {
        int hashCode = (this.contentType.hashCode() + (this.photoViewerOpenNavScreen.hashCode() * 31)) * 31;
        MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent = this.photoViewerCommonInfoEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent = this.photoViewerDetailedInfoEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint = this.photoViewerEntrypoint;
        return hashCode3 + (mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint != null ? mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoViewerEvent(photoViewerOpenNavScreen=" + this.photoViewerOpenNavScreen + ", contentType=" + this.contentType + ", photoViewerCommonInfoEvent=" + this.photoViewerCommonInfoEvent + ", photoViewerDetailedInfoEvent=" + this.photoViewerDetailedInfoEvent + ", photoViewerEntrypoint=" + this.photoViewerEntrypoint + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$PhotoViewerEvent(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent, MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, int i, zcl zclVar) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConPhotosStat$ContentType, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent, (i & 16) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint);
    }
}
