package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick implements SchemeStat$TypeClick.b {

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

        @pmi0("music_track_card_similar_music_click")
        public static final EventType MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK;

        static {
            EventType eventType = new EventType("MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK", 0);
            MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK = eventType;
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

    public CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick(EventType eventType, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventType = eventType;
        this.audioItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick = (CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick) obj;
        return this.eventType == commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick.eventType && epx.f(this.audioItem, commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick.audioItem);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = this.audioItem;
        return hashCode + (commonStat$TypeCommonEventItem == null ? 0 : commonStat$TypeCommonEventItem.hashCode());
    }

    public final String toString() {
        return "TypeVideoMusicTrackCardSimilarMusicClick(eventType=" + this.eventType + ", audioItem=" + this.audioItem + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick(EventType eventType, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonStat$TypeCommonEventItem);
    }
}
