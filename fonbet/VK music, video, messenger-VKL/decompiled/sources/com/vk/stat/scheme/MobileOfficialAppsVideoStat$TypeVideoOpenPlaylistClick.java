package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("parent_playlist_id")
    private final Integer parentPlaylistId;

    @pmi0("playlist_id")
    private final int playlistId;

    @pmi0("playlist_owner_id")
    private final long playlistOwnerId;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("video_playlist_type")
    private final VideoPlaylistType videoPlaylistType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("open")
        public static final EventType OPEN;

        @pmi0("open_by_tab_click")
        public static final EventType OPEN_BY_TAB_CLICK;

        @pmi0("play_all_playlist_button")
        public static final EventType PLAY_ALL_PLAYLIST_BUTTON;

        static {
            EventType eventType = new EventType("PLAY_ALL_PLAYLIST_BUTTON", 0);
            PLAY_ALL_PLAYLIST_BUTTON = eventType;
            EventType eventType2 = new EventType("OPEN", 1);
            OPEN = eventType2;
            EventType eventType3 = new EventType("OPEN_BY_TAB_CLICK", 2);
            OPEN_BY_TAB_CLICK = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    /* loaded from: classes11.dex */
    public static final class VideoPlaylistType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoPlaylistType[] $VALUES;
        public static final VideoPlaylistType SEASON;
        public static final VideoPlaylistType SERIAL;
        public static final VideoPlaylistType SIMPLE_PLAYLIST;
        private final int value;

        /* compiled from: MobileOfficialAppsVideoStat.kt */
        public static final class Serializer implements uay<VideoPlaylistType> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((VideoPlaylistType) obj).value));
            }
        }

        static {
            VideoPlaylistType videoPlaylistType = new VideoPlaylistType("SIMPLE_PLAYLIST", 0, 0);
            SIMPLE_PLAYLIST = videoPlaylistType;
            VideoPlaylistType videoPlaylistType2 = new VideoPlaylistType("SERIAL", 1, 1);
            SERIAL = videoPlaylistType2;
            VideoPlaylistType videoPlaylistType3 = new VideoPlaylistType("SEASON", 2, 2);
            SEASON = videoPlaylistType3;
            VideoPlaylistType[] videoPlaylistTypeArr = {videoPlaylistType, videoPlaylistType2, videoPlaylistType3};
            $VALUES = videoPlaylistTypeArr;
            $ENTRIES = new asp(videoPlaylistTypeArr);
        }

        public VideoPlaylistType(String str, int i, int i2) {
            this.value = i2;
        }

        public static VideoPlaylistType valueOf(String str) {
            return (VideoPlaylistType) Enum.valueOf(VideoPlaylistType.class, str);
        }

        public static VideoPlaylistType[] values() {
            return (VideoPlaylistType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, VideoPlaylistType videoPlaylistType, long j, Integer num) {
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.playlistId = i;
        this.videoPlaylistType = videoPlaylistType;
        this.playlistOwnerId = j;
        this.parentPlaylistId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick = (MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.screenMode && this.playlistId == mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.playlistId && this.videoPlaylistType == mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.videoPlaylistType && this.playlistOwnerId == mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.playlistOwnerId && epx.f(this.parentPlaylistId, mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.parentPlaylistId);
    }

    public final int hashCode() {
        int a = bh10.a((this.videoPlaylistType.hashCode() + shy.a(this.playlistId, (this.screenMode.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31)) * 31, 31, this.playlistOwnerId);
        Integer num = this.parentPlaylistId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoOpenPlaylistClick(eventType=");
        sb.append(this.eventType);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", videoPlaylistType=");
        sb.append(this.videoPlaylistType);
        sb.append(", playlistOwnerId=");
        sb.append(this.playlistOwnerId);
        sb.append(", parentPlaylistId=");
        return uqi.b(sb, this.parentPlaylistId, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, VideoPlaylistType videoPlaylistType, long j, Integer num, int i2, zcl zclVar) {
        this(eventType, mobileOfficialAppsVideoStat$TypeScreenMode, i, videoPlaylistType, j, (i2 & 32) != 0 ? null : num);
    }
}
