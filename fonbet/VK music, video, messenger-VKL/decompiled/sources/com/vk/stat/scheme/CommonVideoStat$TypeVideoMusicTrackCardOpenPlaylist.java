package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist implements SchemeStat$TypeClick.b {

    @pmi0("audio_item")
    private final CommonStat$TypeCommonEventItem audioItem;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("music_track_card_open_playlist")
        public static final EventType MUSIC_TRACK_CARD_OPEN_PLAYLIST;

        static {
            EventType eventType = new EventType("MUSIC_TRACK_CARD_OPEN_PLAYLIST", 0);
            MUSIC_TRACK_CARD_OPEN_PLAYLIST = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist(EventType eventType, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventType = eventType;
        this.audioItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist)) {
            return false;
        }
        CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist = (CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist) obj;
        return this.eventType == commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist.eventType && epx.f(this.audioItem, commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist.audioItem);
    }

    public final int hashCode() {
        return this.audioItem.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoMusicTrackCardOpenPlaylist(eventType=" + this.eventType + ", audioItem=" + this.audioItem + ')';
    }
}
