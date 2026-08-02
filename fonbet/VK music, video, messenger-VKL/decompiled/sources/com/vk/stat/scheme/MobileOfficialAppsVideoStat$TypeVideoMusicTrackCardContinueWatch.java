package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch implements SchemeStat$TypeClick.b {

    @pmi0("audio_item")
    private final CommonStat$TypeCommonEventItem audioItem;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("music_track_card_continue_watch")
        public static final EventType MUSIC_TRACK_CARD_CONTINUE_WATCH;

        static {
            EventType eventType = new EventType("MUSIC_TRACK_CARD_CONTINUE_WATCH", 0);
            MUSIC_TRACK_CARD_CONTINUE_WATCH = eventType;
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

    public MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch(EventType eventType, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventType = eventType;
        this.audioItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch = (MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch.eventType && epx.f(this.audioItem, mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch.audioItem);
    }

    public final int hashCode() {
        return this.audioItem.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoMusicTrackCardContinueWatch(eventType=" + this.eventType + ", audioItem=" + this.audioItem + ')';
    }
}
