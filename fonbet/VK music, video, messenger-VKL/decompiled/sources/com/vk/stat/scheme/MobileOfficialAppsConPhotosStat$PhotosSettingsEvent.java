package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotosSettingsEvent {

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("photos_settings_event_type")
    private final PhotosSettingsEventType photosSettingsEventType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PhotosSettingsEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotosSettingsEventType[] $VALUES;

        @pmi0("album_off")
        public static final PhotosSettingsEventType ALBUM_OFF;

        @pmi0("album_on")
        public static final PhotosSettingsEventType ALBUM_ON;

        @pmi0("go_to_album")
        public static final PhotosSettingsEventType GO_TO_ALBUM;

        static {
            PhotosSettingsEventType photosSettingsEventType = new PhotosSettingsEventType("ALBUM_ON", 0);
            ALBUM_ON = photosSettingsEventType;
            PhotosSettingsEventType photosSettingsEventType2 = new PhotosSettingsEventType("ALBUM_OFF", 1);
            ALBUM_OFF = photosSettingsEventType2;
            PhotosSettingsEventType photosSettingsEventType3 = new PhotosSettingsEventType("GO_TO_ALBUM", 2);
            GO_TO_ALBUM = photosSettingsEventType3;
            PhotosSettingsEventType[] photosSettingsEventTypeArr = {photosSettingsEventType, photosSettingsEventType2, photosSettingsEventType3};
            $VALUES = photosSettingsEventTypeArr;
            $ENTRIES = new asp(photosSettingsEventTypeArr);
        }

        private PhotosSettingsEventType(String str, int i) {
        }

        public static PhotosSettingsEventType valueOf(String str) {
            return (PhotosSettingsEventType) Enum.valueOf(PhotosSettingsEventType.class, str);
        }

        public static PhotosSettingsEventType[] values() {
            return (PhotosSettingsEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PhotosSettingsEvent(PhotosSettingsEventType photosSettingsEventType, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.photosSettingsEventType = photosSettingsEventType;
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PhotosSettingsEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PhotosSettingsEvent mobileOfficialAppsConPhotosStat$PhotosSettingsEvent = (MobileOfficialAppsConPhotosStat$PhotosSettingsEvent) obj;
        return this.photosSettingsEventType == mobileOfficialAppsConPhotosStat$PhotosSettingsEvent.photosSettingsEventType && this.contentType == mobileOfficialAppsConPhotosStat$PhotosSettingsEvent.contentType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$PhotosSettingsEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + ((this.contentType.hashCode() + (this.photosSettingsEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PhotosSettingsEvent(photosSettingsEventType=" + this.photosSettingsEventType + ", contentType=" + this.contentType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
