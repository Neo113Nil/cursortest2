package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent {

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("photo_tags_detailed_event_type")
    private final PhotoTagsDetailedEventType photoTagsDetailedEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PhotoTagsDetailedEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoTagsDetailedEventType[] $VALUES;

        @pmi0("open")
        public static final PhotoTagsDetailedEventType OPEN;

        static {
            PhotoTagsDetailedEventType photoTagsDetailedEventType = new PhotoTagsDetailedEventType("OPEN", 0);
            OPEN = photoTagsDetailedEventType;
            PhotoTagsDetailedEventType[] photoTagsDetailedEventTypeArr = {photoTagsDetailedEventType};
            $VALUES = photoTagsDetailedEventTypeArr;
            $ENTRIES = new asp(photoTagsDetailedEventTypeArr);
        }

        private PhotoTagsDetailedEventType(String str, int i) {
        }

        public static PhotoTagsDetailedEventType valueOf(String str) {
            return (PhotoTagsDetailedEventType) Enum.valueOf(PhotoTagsDetailedEventType.class, str);
        }

        public static PhotoTagsDetailedEventType[] values() {
            return (PhotoTagsDetailedEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent(PhotoTagsDetailedEventType photoTagsDetailedEventType, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.photoTagsDetailedEventType = photoTagsDetailedEventType;
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent = (MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent) obj;
        return this.photoTagsDetailedEventType == mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent.photoTagsDetailedEventType && this.contentType == mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent.contentType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + ((this.contentType.hashCode() + (this.photoTagsDetailedEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PhotoTagsDetailedEvent(photoTagsDetailedEventType=" + this.photoTagsDetailedEventType + ", contentType=" + this.contentType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
