package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumEditEvent {

    @pmi0("album_edit_event_type")
    private final AlbumEditEventType albumEditEventType;

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumEditEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumEditEventType[] $VALUES;

        @pmi0("delete")
        public static final AlbumEditEventType DELETE;

        @pmi0("edit")
        public static final AlbumEditEventType EDIT;

        static {
            AlbumEditEventType albumEditEventType = new AlbumEditEventType("EDIT", 0);
            EDIT = albumEditEventType;
            AlbumEditEventType albumEditEventType2 = new AlbumEditEventType("DELETE", 1);
            DELETE = albumEditEventType2;
            AlbumEditEventType[] albumEditEventTypeArr = {albumEditEventType, albumEditEventType2};
            $VALUES = albumEditEventTypeArr;
            $ENTRIES = new asp(albumEditEventTypeArr);
        }

        private AlbumEditEventType(String str, int i) {
        }

        public static AlbumEditEventType valueOf(String str) {
            return (AlbumEditEventType) Enum.valueOf(AlbumEditEventType.class, str);
        }

        public static AlbumEditEventType[] values() {
            return (AlbumEditEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumEditEvent(AlbumEditEventType albumEditEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.albumEditEventType = albumEditEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumEditEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumEditEvent mobileOfficialAppsConPhotosStat$AlbumEditEvent = (MobileOfficialAppsConPhotosStat$AlbumEditEvent) obj;
        return this.albumEditEventType == mobileOfficialAppsConPhotosStat$AlbumEditEvent.albumEditEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$AlbumEditEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + (this.albumEditEventType.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumEditEvent(albumEditEventType=" + this.albumEditEventType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
