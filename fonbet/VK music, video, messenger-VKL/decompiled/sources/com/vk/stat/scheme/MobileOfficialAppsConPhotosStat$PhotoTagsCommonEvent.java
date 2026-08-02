package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent {

    @pmi0("photo_tags_common_event_type")
    private final PhotoTagsCommonEventType photoTagsCommonEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PhotoTagsCommonEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoTagsCommonEventType[] $VALUES;

        @pmi0("accept_all_tags")
        public static final PhotoTagsCommonEventType ACCEPT_ALL_TAGS;

        @pmi0("click_to_dots")
        public static final PhotoTagsCommonEventType CLICK_TO_DOTS;

        @pmi0("click_to_recognized_photos")
        public static final PhotoTagsCommonEventType CLICK_TO_RECOGNIZED_PHOTOS;

        @pmi0("decline_all_tags")
        public static final PhotoTagsCommonEventType DECLINE_ALL_TAGS;

        static {
            PhotoTagsCommonEventType photoTagsCommonEventType = new PhotoTagsCommonEventType("CLICK_TO_RECOGNIZED_PHOTOS", 0);
            CLICK_TO_RECOGNIZED_PHOTOS = photoTagsCommonEventType;
            PhotoTagsCommonEventType photoTagsCommonEventType2 = new PhotoTagsCommonEventType("CLICK_TO_DOTS", 1);
            CLICK_TO_DOTS = photoTagsCommonEventType2;
            PhotoTagsCommonEventType photoTagsCommonEventType3 = new PhotoTagsCommonEventType("DECLINE_ALL_TAGS", 2);
            DECLINE_ALL_TAGS = photoTagsCommonEventType3;
            PhotoTagsCommonEventType photoTagsCommonEventType4 = new PhotoTagsCommonEventType("ACCEPT_ALL_TAGS", 3);
            ACCEPT_ALL_TAGS = photoTagsCommonEventType4;
            PhotoTagsCommonEventType[] photoTagsCommonEventTypeArr = {photoTagsCommonEventType, photoTagsCommonEventType2, photoTagsCommonEventType3, photoTagsCommonEventType4};
            $VALUES = photoTagsCommonEventTypeArr;
            $ENTRIES = new asp(photoTagsCommonEventTypeArr);
        }

        private PhotoTagsCommonEventType(String str, int i) {
        }

        public static PhotoTagsCommonEventType valueOf(String str) {
            return (PhotoTagsCommonEventType) Enum.valueOf(PhotoTagsCommonEventType.class, str);
        }

        public static PhotoTagsCommonEventType[] values() {
            return (PhotoTagsCommonEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent(PhotoTagsCommonEventType photoTagsCommonEventType) {
        this.photoTagsCommonEventType = photoTagsCommonEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent) && this.photoTagsCommonEventType == ((MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent) obj).photoTagsCommonEventType;
    }

    public final int hashCode() {
        return this.photoTagsCommonEventType.hashCode();
    }

    public final String toString() {
        return "PhotoTagsCommonEvent(photoTagsCommonEventType=" + this.photoTagsCommonEventType + ')';
    }
}
