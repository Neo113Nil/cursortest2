package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent {

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("photo_viewer_common_info_event_type")
    private final PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PhotoViewerCommonInfoEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoViewerCommonInfoEventType[] $VALUES;

        @pmi0("add_to_saved")
        public static final PhotoViewerCommonInfoEventType ADD_TO_SAVED;

        @pmi0("attach_good")
        public static final PhotoViewerCommonInfoEventType ATTACH_GOOD;

        @pmi0("attach_service")
        public static final PhotoViewerCommonInfoEventType ATTACH_SERVICE;

        @pmi0("claim")
        public static final PhotoViewerCommonInfoEventType CLAIM;

        @pmi0("click_to_dots")
        public static final PhotoViewerCommonInfoEventType CLICK_TO_DOTS;

        @pmi0("download")
        public static final PhotoViewerCommonInfoEventType DOWNLOAD;

        @pmi0("edit")
        public static final PhotoViewerCommonInfoEventType EDIT;

        @pmi0("open_comments")
        public static final PhotoViewerCommonInfoEventType OPEN_COMMENTS;

        @pmi0("set_profile_photo")
        public static final PhotoViewerCommonInfoEventType SET_PROFILE_PHOTO;

        static {
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType = new PhotoViewerCommonInfoEventType("CLICK_TO_DOTS", 0);
            CLICK_TO_DOTS = photoViewerCommonInfoEventType;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType2 = new PhotoViewerCommonInfoEventType("EDIT", 1);
            EDIT = photoViewerCommonInfoEventType2;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType3 = new PhotoViewerCommonInfoEventType("ATTACH_GOOD", 2);
            ATTACH_GOOD = photoViewerCommonInfoEventType3;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType4 = new PhotoViewerCommonInfoEventType("ATTACH_SERVICE", 3);
            ATTACH_SERVICE = photoViewerCommonInfoEventType4;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType5 = new PhotoViewerCommonInfoEventType("SET_PROFILE_PHOTO", 4);
            SET_PROFILE_PHOTO = photoViewerCommonInfoEventType5;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType6 = new PhotoViewerCommonInfoEventType("DOWNLOAD", 5);
            DOWNLOAD = photoViewerCommonInfoEventType6;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType7 = new PhotoViewerCommonInfoEventType("ADD_TO_SAVED", 6);
            ADD_TO_SAVED = photoViewerCommonInfoEventType7;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType8 = new PhotoViewerCommonInfoEventType("CLAIM", 7);
            CLAIM = photoViewerCommonInfoEventType8;
            PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType9 = new PhotoViewerCommonInfoEventType("OPEN_COMMENTS", 8);
            OPEN_COMMENTS = photoViewerCommonInfoEventType9;
            PhotoViewerCommonInfoEventType[] photoViewerCommonInfoEventTypeArr = {photoViewerCommonInfoEventType, photoViewerCommonInfoEventType2, photoViewerCommonInfoEventType3, photoViewerCommonInfoEventType4, photoViewerCommonInfoEventType5, photoViewerCommonInfoEventType6, photoViewerCommonInfoEventType7, photoViewerCommonInfoEventType8, photoViewerCommonInfoEventType9};
            $VALUES = photoViewerCommonInfoEventTypeArr;
            $ENTRIES = new asp(photoViewerCommonInfoEventTypeArr);
        }

        private PhotoViewerCommonInfoEventType(String str, int i) {
        }

        public static PhotoViewerCommonInfoEventType valueOf(String str) {
            return (PhotoViewerCommonInfoEventType) Enum.valueOf(PhotoViewerCommonInfoEventType.class, str);
        }

        public static PhotoViewerCommonInfoEventType[] values() {
            return (PhotoViewerCommonInfoEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent(PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.photoViewerCommonInfoEventType = photoViewerCommonInfoEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent = (MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent) obj;
        return this.photoViewerCommonInfoEventType == mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.photoViewerCommonInfoEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + (this.photoViewerCommonInfoEventType.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoViewerCommonInfoEvent(photoViewerCommonInfoEventType=" + this.photoViewerCommonInfoEventType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
