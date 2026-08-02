package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoTagsEvent {

    @pmi0("photo_tags_common_event")
    private final MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent photoTagsCommonEvent;

    @pmi0("photo_tags_detailed_event")
    private final MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent photoTagsDetailedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPhotosStat$PhotoTagsEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PhotoTagsEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PhotoTagsEvent mobileOfficialAppsConPhotosStat$PhotoTagsEvent = (MobileOfficialAppsConPhotosStat$PhotoTagsEvent) obj;
        return epx.f(this.photoTagsCommonEvent, mobileOfficialAppsConPhotosStat$PhotoTagsEvent.photoTagsCommonEvent) && epx.f(this.photoTagsDetailedEvent, mobileOfficialAppsConPhotosStat$PhotoTagsEvent.photoTagsDetailedEvent);
    }

    public final int hashCode() {
        MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent = this.photoTagsCommonEvent;
        int hashCode = (mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent.hashCode()) * 31;
        MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent = this.photoTagsDetailedEvent;
        return hashCode + (mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent != null ? mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoTagsEvent(photoTagsCommonEvent=" + this.photoTagsCommonEvent + ", photoTagsDetailedEvent=" + this.photoTagsDetailedEvent + ')';
    }

    public MobileOfficialAppsConPhotosStat$PhotoTagsEvent(MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent, MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent) {
        this.photoTagsCommonEvent = mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent;
        this.photoTagsDetailedEvent = mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent;
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$PhotoTagsEvent(MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent, MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent);
    }
}
