package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoPlayerMusicTrackView implements SchemeStat$TypeView.b {

    @pmi0("audio_item")
    private final CommonStat$TypeCommonEventItem audioItem;

    @pmi0("event_subtype")
    private final String eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("music_track_show")
        public static final EventType MUSIC_TRACK_SHOW;

        static {
            EventType eventType = new EventType("MUSIC_TRACK_SHOW", 0);
            MUSIC_TRACK_SHOW = eventType;
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

    public CommonVideoStat$TypeVideoPlayerMusicTrackView(EventType eventType, String str, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventType = eventType;
        this.eventSubtype = str;
        this.audioItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoPlayerMusicTrackView)) {
            return false;
        }
        CommonVideoStat$TypeVideoPlayerMusicTrackView commonVideoStat$TypeVideoPlayerMusicTrackView = (CommonVideoStat$TypeVideoPlayerMusicTrackView) obj;
        return this.eventType == commonVideoStat$TypeVideoPlayerMusicTrackView.eventType && epx.f(this.eventSubtype, commonVideoStat$TypeVideoPlayerMusicTrackView.eventSubtype) && epx.f(this.audioItem, commonVideoStat$TypeVideoPlayerMusicTrackView.audioItem);
    }

    public final int hashCode() {
        return this.audioItem.hashCode() + urd0.a(this.eventType.hashCode() * 31, 31, this.eventSubtype);
    }

    public final String toString() {
        return "TypeVideoPlayerMusicTrackView(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", audioItem=" + this.audioItem + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoPlayerMusicTrackView(EventType eventType, String str, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? "player" : str, commonStat$TypeCommonEventItem);
    }
}
