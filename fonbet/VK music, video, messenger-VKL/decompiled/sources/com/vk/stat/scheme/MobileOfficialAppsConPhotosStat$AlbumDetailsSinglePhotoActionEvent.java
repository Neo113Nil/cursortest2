package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent {

    @pmi0("album_details_single_photo_action_event_type")
    private final AlbumDetailsSinglePhotoActionEventType albumDetailsSinglePhotoActionEventType;

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumDetailsSinglePhotoActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumDetailsSinglePhotoActionEventType[] $VALUES;

        @pmi0("click_to_pick")
        public static final AlbumDetailsSinglePhotoActionEventType CLICK_TO_PICK;

        @pmi0("open")
        public static final AlbumDetailsSinglePhotoActionEventType OPEN;

        static {
            AlbumDetailsSinglePhotoActionEventType albumDetailsSinglePhotoActionEventType = new AlbumDetailsSinglePhotoActionEventType("OPEN", 0);
            OPEN = albumDetailsSinglePhotoActionEventType;
            AlbumDetailsSinglePhotoActionEventType albumDetailsSinglePhotoActionEventType2 = new AlbumDetailsSinglePhotoActionEventType("CLICK_TO_PICK", 1);
            CLICK_TO_PICK = albumDetailsSinglePhotoActionEventType2;
            AlbumDetailsSinglePhotoActionEventType[] albumDetailsSinglePhotoActionEventTypeArr = {albumDetailsSinglePhotoActionEventType, albumDetailsSinglePhotoActionEventType2};
            $VALUES = albumDetailsSinglePhotoActionEventTypeArr;
            $ENTRIES = new asp(albumDetailsSinglePhotoActionEventTypeArr);
        }

        private AlbumDetailsSinglePhotoActionEventType(String str, int i) {
        }

        public static AlbumDetailsSinglePhotoActionEventType valueOf(String str) {
            return (AlbumDetailsSinglePhotoActionEventType) Enum.valueOf(AlbumDetailsSinglePhotoActionEventType.class, str);
        }

        public static AlbumDetailsSinglePhotoActionEventType[] values() {
            return (AlbumDetailsSinglePhotoActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent(AlbumDetailsSinglePhotoActionEventType albumDetailsSinglePhotoActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.albumDetailsSinglePhotoActionEventType = albumDetailsSinglePhotoActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent = (MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent) obj;
        return this.albumDetailsSinglePhotoActionEventType == mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent.albumDetailsSinglePhotoActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + (this.albumDetailsSinglePhotoActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumDetailsSinglePhotoActionEvent(albumDetailsSinglePhotoActionEventType=" + this.albumDetailsSinglePhotoActionEventType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
