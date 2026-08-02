package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumCreateEvent {

    @pmi0("album_create_event_type")
    private final AlbumCreateEventType albumCreateEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumCreateEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumCreateEventType[] $VALUES;

        @pmi0("click_to_comment_privacy")
        public static final AlbumCreateEventType CLICK_TO_COMMENT_PRIVACY;

        @pmi0("click_to_view_privacy")
        public static final AlbumCreateEventType CLICK_TO_VIEW_PRIVACY;

        @pmi0("create_album")
        public static final AlbumCreateEventType CREATE_ALBUM;

        static {
            AlbumCreateEventType albumCreateEventType = new AlbumCreateEventType("CREATE_ALBUM", 0);
            CREATE_ALBUM = albumCreateEventType;
            AlbumCreateEventType albumCreateEventType2 = new AlbumCreateEventType("CLICK_TO_VIEW_PRIVACY", 1);
            CLICK_TO_VIEW_PRIVACY = albumCreateEventType2;
            AlbumCreateEventType albumCreateEventType3 = new AlbumCreateEventType("CLICK_TO_COMMENT_PRIVACY", 2);
            CLICK_TO_COMMENT_PRIVACY = albumCreateEventType3;
            AlbumCreateEventType[] albumCreateEventTypeArr = {albumCreateEventType, albumCreateEventType2, albumCreateEventType3};
            $VALUES = albumCreateEventTypeArr;
            $ENTRIES = new asp(albumCreateEventTypeArr);
        }

        private AlbumCreateEventType(String str, int i) {
        }

        public static AlbumCreateEventType valueOf(String str) {
            return (AlbumCreateEventType) Enum.valueOf(AlbumCreateEventType.class, str);
        }

        public static AlbumCreateEventType[] values() {
            return (AlbumCreateEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumCreateEvent(AlbumCreateEventType albumCreateEventType) {
        this.albumCreateEventType = albumCreateEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$AlbumCreateEvent) && this.albumCreateEventType == ((MobileOfficialAppsConPhotosStat$AlbumCreateEvent) obj).albumCreateEventType;
    }

    public final int hashCode() {
        return this.albumCreateEventType.hashCode();
    }

    public final String toString() {
        return "AlbumCreateEvent(albumCreateEventType=" + this.albumCreateEventType + ')';
    }
}
