package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent {

    @pmi0("album_details_album_action_event_type")
    private final AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType;

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumDetailsAlbumActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumDetailsAlbumActionEventType[] $VALUES;

        @pmi0("click_to_add_to_story")
        public static final AlbumDetailsAlbumActionEventType CLICK_TO_ADD_TO_STORY;

        @pmi0("click_to_create")
        public static final AlbumDetailsAlbumActionEventType CLICK_TO_CREATE;

        @pmi0("click_to_dots")
        public static final AlbumDetailsAlbumActionEventType CLICK_TO_DOTS;

        @pmi0("click_to_pick")
        public static final AlbumDetailsAlbumActionEventType CLICK_TO_PICK;

        @pmi0("click_to_share")
        public static final AlbumDetailsAlbumActionEventType CLICK_TO_SHARE;

        @pmi0("delete")
        public static final AlbumDetailsAlbumActionEventType DELETE;

        @pmi0("download")
        public static final AlbumDetailsAlbumActionEventType DOWNLOAD;

        @pmi0("edit")
        public static final AlbumDetailsAlbumActionEventType EDIT;

        @pmi0("sort_photo")
        public static final AlbumDetailsAlbumActionEventType SORT_PHOTO;

        static {
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType = new AlbumDetailsAlbumActionEventType("CLICK_TO_CREATE", 0);
            CLICK_TO_CREATE = albumDetailsAlbumActionEventType;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType2 = new AlbumDetailsAlbumActionEventType("CLICK_TO_DOTS", 1);
            CLICK_TO_DOTS = albumDetailsAlbumActionEventType2;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType3 = new AlbumDetailsAlbumActionEventType("EDIT", 2);
            EDIT = albumDetailsAlbumActionEventType3;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType4 = new AlbumDetailsAlbumActionEventType("CLICK_TO_SHARE", 3);
            CLICK_TO_SHARE = albumDetailsAlbumActionEventType4;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType5 = new AlbumDetailsAlbumActionEventType("SORT_PHOTO", 4);
            SORT_PHOTO = albumDetailsAlbumActionEventType5;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType6 = new AlbumDetailsAlbumActionEventType("DOWNLOAD", 5);
            DOWNLOAD = albumDetailsAlbumActionEventType6;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType7 = new AlbumDetailsAlbumActionEventType("DELETE", 6);
            DELETE = albumDetailsAlbumActionEventType7;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType8 = new AlbumDetailsAlbumActionEventType("CLICK_TO_PICK", 7);
            CLICK_TO_PICK = albumDetailsAlbumActionEventType8;
            AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType9 = new AlbumDetailsAlbumActionEventType("CLICK_TO_ADD_TO_STORY", 8);
            CLICK_TO_ADD_TO_STORY = albumDetailsAlbumActionEventType9;
            AlbumDetailsAlbumActionEventType[] albumDetailsAlbumActionEventTypeArr = {albumDetailsAlbumActionEventType, albumDetailsAlbumActionEventType2, albumDetailsAlbumActionEventType3, albumDetailsAlbumActionEventType4, albumDetailsAlbumActionEventType5, albumDetailsAlbumActionEventType6, albumDetailsAlbumActionEventType7, albumDetailsAlbumActionEventType8, albumDetailsAlbumActionEventType9};
            $VALUES = albumDetailsAlbumActionEventTypeArr;
            $ENTRIES = new asp(albumDetailsAlbumActionEventTypeArr);
        }

        private AlbumDetailsAlbumActionEventType(String str, int i) {
        }

        public static AlbumDetailsAlbumActionEventType valueOf(String str) {
            return (AlbumDetailsAlbumActionEventType) Enum.valueOf(AlbumDetailsAlbumActionEventType.class, str);
        }

        public static AlbumDetailsAlbumActionEventType[] values() {
            return (AlbumDetailsAlbumActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent(AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.albumDetailsAlbumActionEventType = albumDetailsAlbumActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent = (MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent) obj;
        return this.albumDetailsAlbumActionEventType == mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.albumDetailsAlbumActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.contentIdParam) && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.stringValueParam);
    }

    public final int hashCode() {
        int hashCode = (this.contentIdParam.hashCode() + (this.albumDetailsAlbumActionEventType.hashCode() * 31)) * 31;
        MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam = this.stringValueParam;
        return hashCode + (mobileOfficialAppsConPhotosStat$StringValueParam == null ? 0 : mobileOfficialAppsConPhotosStat$StringValueParam.hashCode());
    }

    public final String toString() {
        return "AlbumDetailsAlbumActionEvent(albumDetailsAlbumActionEventType=" + this.albumDetailsAlbumActionEventType + ", contentIdParam=" + this.contentIdParam + ", stringValueParam=" + this.stringValueParam + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent(AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam, int i, zcl zclVar) {
        this(albumDetailsAlbumActionEventType, mobileOfficialAppsConPhotosStat$ContentIdParam, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$StringValueParam);
    }
}
