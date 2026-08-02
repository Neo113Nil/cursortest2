package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent {

    @pmi0("albums_settings_event_type")
    private final AlbumsSettingsEventType albumsSettingsEventType;

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumsSettingsEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumsSettingsEventType[] $VALUES;

        @pmi0("change_order")
        public static final AlbumsSettingsEventType CHANGE_ORDER;

        @pmi0("delete")
        public static final AlbumsSettingsEventType DELETE;

        static {
            AlbumsSettingsEventType albumsSettingsEventType = new AlbumsSettingsEventType("DELETE", 0);
            DELETE = albumsSettingsEventType;
            AlbumsSettingsEventType albumsSettingsEventType2 = new AlbumsSettingsEventType("CHANGE_ORDER", 1);
            CHANGE_ORDER = albumsSettingsEventType2;
            AlbumsSettingsEventType[] albumsSettingsEventTypeArr = {albumsSettingsEventType, albumsSettingsEventType2};
            $VALUES = albumsSettingsEventTypeArr;
            $ENTRIES = new asp(albumsSettingsEventTypeArr);
        }

        private AlbumsSettingsEventType(String str, int i) {
        }

        public static AlbumsSettingsEventType valueOf(String str) {
            return (AlbumsSettingsEventType) Enum.valueOf(AlbumsSettingsEventType.class, str);
        }

        public static AlbumsSettingsEventType[] values() {
            return (AlbumsSettingsEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent(AlbumsSettingsEventType albumsSettingsEventType, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.albumsSettingsEventType = albumsSettingsEventType;
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent = (MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent) obj;
        return this.albumsSettingsEventType == mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.albumsSettingsEventType && this.contentType == mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.contentType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + ((this.contentType.hashCode() + (this.albumsSettingsEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AlbumsSettingsEvent(albumsSettingsEventType=" + this.albumsSettingsEventType + ", contentType=" + this.contentType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
