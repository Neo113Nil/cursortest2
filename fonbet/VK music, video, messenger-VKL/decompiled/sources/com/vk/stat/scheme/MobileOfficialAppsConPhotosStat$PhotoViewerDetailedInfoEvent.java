package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent {

    @pmi0("photo_viewer_detailed_info_event_type")
    private final PhotoViewerDetailedInfoEventType photoViewerDetailedInfoEventType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PhotoViewerDetailedInfoEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoViewerDetailedInfoEventType[] $VALUES;

        @pmi0("copy_link")
        public static final PhotoViewerDetailedInfoEventType COPY_LINK;

        @pmi0("delete")
        public static final PhotoViewerDetailedInfoEventType DELETE;

        @pmi0("go_to_album")
        public static final PhotoViewerDetailedInfoEventType GO_TO_ALBUM;

        static {
            PhotoViewerDetailedInfoEventType photoViewerDetailedInfoEventType = new PhotoViewerDetailedInfoEventType("GO_TO_ALBUM", 0);
            GO_TO_ALBUM = photoViewerDetailedInfoEventType;
            PhotoViewerDetailedInfoEventType photoViewerDetailedInfoEventType2 = new PhotoViewerDetailedInfoEventType("COPY_LINK", 1);
            COPY_LINK = photoViewerDetailedInfoEventType2;
            PhotoViewerDetailedInfoEventType photoViewerDetailedInfoEventType3 = new PhotoViewerDetailedInfoEventType("DELETE", 2);
            DELETE = photoViewerDetailedInfoEventType3;
            PhotoViewerDetailedInfoEventType[] photoViewerDetailedInfoEventTypeArr = {photoViewerDetailedInfoEventType, photoViewerDetailedInfoEventType2, photoViewerDetailedInfoEventType3};
            $VALUES = photoViewerDetailedInfoEventTypeArr;
            $ENTRIES = new asp(photoViewerDetailedInfoEventTypeArr);
        }

        private PhotoViewerDetailedInfoEventType(String str, int i) {
        }

        public static PhotoViewerDetailedInfoEventType valueOf(String str) {
            return (PhotoViewerDetailedInfoEventType) Enum.valueOf(PhotoViewerDetailedInfoEventType.class, str);
        }

        public static PhotoViewerDetailedInfoEventType[] values() {
            return (PhotoViewerDetailedInfoEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent(PhotoViewerDetailedInfoEventType photoViewerDetailedInfoEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.photoViewerDetailedInfoEventType = photoViewerDetailedInfoEventType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent = (MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent) obj;
        return this.photoViewerDetailedInfoEventType == mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.photoViewerDetailedInfoEventType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + (this.photoViewerDetailedInfoEventType.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoViewerDetailedInfoEvent(photoViewerDetailedInfoEventType=" + this.photoViewerDetailedInfoEventType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
