package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent {

    @pmi0("album_details_multiple_photos_action_event_type")
    private final AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumDetailsMultiplePhotosActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumDetailsMultiplePhotosActionEventType[] $VALUES;

        @pmi0("archivate")
        public static final AlbumDetailsMultiplePhotosActionEventType ARCHIVATE;

        @pmi0("click_to_share")
        public static final AlbumDetailsMultiplePhotosActionEventType CLICK_TO_SHARE;

        @pmi0("delete")
        public static final AlbumDetailsMultiplePhotosActionEventType DELETE;

        @pmi0("download")
        public static final AlbumDetailsMultiplePhotosActionEventType DOWNLOAD;

        @pmi0("move_to_album")
        public static final AlbumDetailsMultiplePhotosActionEventType MOVE_TO_ALBUM;

        static {
            AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType = new AlbumDetailsMultiplePhotosActionEventType("DOWNLOAD", 0);
            DOWNLOAD = albumDetailsMultiplePhotosActionEventType;
            AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType2 = new AlbumDetailsMultiplePhotosActionEventType("DELETE", 1);
            DELETE = albumDetailsMultiplePhotosActionEventType2;
            AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType3 = new AlbumDetailsMultiplePhotosActionEventType("ARCHIVATE", 2);
            ARCHIVATE = albumDetailsMultiplePhotosActionEventType3;
            AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType4 = new AlbumDetailsMultiplePhotosActionEventType("CLICK_TO_SHARE", 3);
            CLICK_TO_SHARE = albumDetailsMultiplePhotosActionEventType4;
            AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType5 = new AlbumDetailsMultiplePhotosActionEventType("MOVE_TO_ALBUM", 4);
            MOVE_TO_ALBUM = albumDetailsMultiplePhotosActionEventType5;
            AlbumDetailsMultiplePhotosActionEventType[] albumDetailsMultiplePhotosActionEventTypeArr = {albumDetailsMultiplePhotosActionEventType, albumDetailsMultiplePhotosActionEventType2, albumDetailsMultiplePhotosActionEventType3, albumDetailsMultiplePhotosActionEventType4, albumDetailsMultiplePhotosActionEventType5};
            $VALUES = albumDetailsMultiplePhotosActionEventTypeArr;
            $ENTRIES = new asp(albumDetailsMultiplePhotosActionEventTypeArr);
        }

        private AlbumDetailsMultiplePhotosActionEventType(String str, int i) {
        }

        public static AlbumDetailsMultiplePhotosActionEventType valueOf(String str) {
            return (AlbumDetailsMultiplePhotosActionEventType) Enum.valueOf(AlbumDetailsMultiplePhotosActionEventType.class, str);
        }

        public static AlbumDetailsMultiplePhotosActionEventType[] values() {
            return (AlbumDetailsMultiplePhotosActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent(AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.albumDetailsMultiplePhotosActionEventType = albumDetailsMultiplePhotosActionEventType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent = (MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent) obj;
        return this.albumDetailsMultiplePhotosActionEventType == mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.albumDetailsMultiplePhotosActionEventType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + (this.albumDetailsMultiplePhotosActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumDetailsMultiplePhotosActionEvent(albumDetailsMultiplePhotosActionEventType=" + this.albumDetailsMultiplePhotosActionEventType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
