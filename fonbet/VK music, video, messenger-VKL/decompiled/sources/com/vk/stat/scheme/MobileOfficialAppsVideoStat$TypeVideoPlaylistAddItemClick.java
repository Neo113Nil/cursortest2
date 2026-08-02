package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick implements SchemeStat$TypeClick.b {

    @pmi0("album_id")
    private final int albumId;

    @pmi0("event_params")
    private final EventParams eventParams;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("owner_id")
    private final long ownerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventParams {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventParams[] $VALUES;

        @pmi0("channel")
        public static final EventParams CHANNEL;

        @pmi0("empty_playlist")
        public static final EventParams EMPTY_PLAYLIST;

        @pmi0("playlist")
        public static final EventParams PLAYLIST;

        static {
            EventParams eventParams = new EventParams("PLAYLIST", 0);
            PLAYLIST = eventParams;
            EventParams eventParams2 = new EventParams("CHANNEL", 1);
            CHANNEL = eventParams2;
            EventParams eventParams3 = new EventParams("EMPTY_PLAYLIST", 2);
            EMPTY_PLAYLIST = eventParams3;
            EventParams[] eventParamsArr = {eventParams, eventParams2, eventParams3};
            $VALUES = eventParamsArr;
            $ENTRIES = new asp(eventParamsArr);
        }

        private EventParams(String str, int i) {
        }

        public static EventParams valueOf(String str) {
            return (EventParams) Enum.valueOf(EventParams.class, str);
        }

        public static EventParams[] values() {
            return (EventParams[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_video")
        public static final EventType ADD_VIDEO;

        @pmi0("exit_add_video")
        public static final EventType EXIT_ADD_VIDEO;

        static {
            EventType eventType = new EventType("ADD_VIDEO", 0);
            ADD_VIDEO = eventType;
            EventType eventType2 = new EventType("EXIT_ADD_VIDEO", 1);
            EXIT_ADD_VIDEO = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick(EventType eventType, int i, long j, EventParams eventParams) {
        this.eventType = eventType;
        this.albumId = i;
        this.ownerId = j;
        this.eventParams = eventParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick = (MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick.eventType && this.albumId == mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick.albumId && this.ownerId == mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick.ownerId && this.eventParams == mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick.eventParams;
    }

    public final int hashCode() {
        return this.eventParams.hashCode() + bh10.a(shy.a(this.albumId, this.eventType.hashCode() * 31, 31), 31, this.ownerId);
    }

    public final String toString() {
        return "TypeVideoPlaylistAddItemClick(eventType=" + this.eventType + ", albumId=" + this.albumId + ", ownerId=" + this.ownerId + ", eventParams=" + this.eventParams + ')';
    }
}
