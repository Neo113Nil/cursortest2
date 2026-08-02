package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent {

    @pmi0("album_details_detailed_action_event_type")
    private final AlbumDetailsDetailedActionEventType albumDetailsDetailedActionEventType;

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class AlbumDetailsDetailedActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumDetailsDetailedActionEventType[] $VALUES;

        @pmi0("longtap")
        public static final AlbumDetailsDetailedActionEventType LONGTAP;

        static {
            AlbumDetailsDetailedActionEventType albumDetailsDetailedActionEventType = new AlbumDetailsDetailedActionEventType("LONGTAP", 0);
            LONGTAP = albumDetailsDetailedActionEventType;
            AlbumDetailsDetailedActionEventType[] albumDetailsDetailedActionEventTypeArr = {albumDetailsDetailedActionEventType};
            $VALUES = albumDetailsDetailedActionEventTypeArr;
            $ENTRIES = new asp(albumDetailsDetailedActionEventTypeArr);
        }

        private AlbumDetailsDetailedActionEventType(String str, int i) {
        }

        public static AlbumDetailsDetailedActionEventType valueOf(String str) {
            return (AlbumDetailsDetailedActionEventType) Enum.valueOf(AlbumDetailsDetailedActionEventType.class, str);
        }

        public static AlbumDetailsDetailedActionEventType[] values() {
            return (AlbumDetailsDetailedActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent(AlbumDetailsDetailedActionEventType albumDetailsDetailedActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.albumDetailsDetailedActionEventType = albumDetailsDetailedActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent = (MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent) obj;
        return this.albumDetailsDetailedActionEventType == mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent.albumDetailsDetailedActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent.contentIdParam) && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + ((this.contentIdParam.hashCode() + (this.albumDetailsDetailedActionEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AlbumDetailsDetailedActionEvent(albumDetailsDetailedActionEventType=" + this.albumDetailsDetailedActionEventType + ", contentIdParam=" + this.contentIdParam + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
