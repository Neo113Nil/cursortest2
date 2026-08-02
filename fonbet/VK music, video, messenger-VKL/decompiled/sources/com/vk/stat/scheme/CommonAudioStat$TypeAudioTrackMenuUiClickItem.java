package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTrackMenuUiClickItem implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("tap_add_cache_menu")
        public static final EventType TAP_ADD_CACHE_MENU;

        @pmi0("tap_add_my_music_menu")
        public static final EventType TAP_ADD_MY_MUSIC_MENU;

        @pmi0("tap_add_no_subscribe_menu")
        public static final EventType TAP_ADD_NO_SUBSCRIBE_MENU;

        @pmi0("tap_add_online_cache_menu")
        public static final EventType TAP_ADD_ONLINE_CACHE_MENU;

        @pmi0("tap_add_to_playlist_menu")
        public static final EventType TAP_ADD_TO_PLAYLIST_MENU;

        @pmi0("tap_add_to_queue_menu")
        public static final EventType TAP_ADD_TO_QUEUE_MENU;

        @pmi0("tap_delete_cache_menu")
        public static final EventType TAP_DELETE_CACHE_MENU;

        @pmi0("tap_delete_my_music_menu")
        public static final EventType TAP_DELETE_MY_MUSIC_MENU;

        @pmi0("tap_disable_ads_menu")
        public static final EventType TAP_DISABLE_ADS_MENU;

        @pmi0("tap_goto_album_menu")
        public static final EventType TAP_GOTO_ALBUM_MENU;

        @pmi0("tap_goto_artist_menu")
        public static final EventType TAP_GOTO_ARTIST_MENU;

        @pmi0("tap_hate_menu")
        public static final EventType TAP_HATE_MENU;

        @pmi0("tap_mix_track_menu")
        public static final EventType TAP_MIX_TRACK_MENU;

        @pmi0("tap_play_next_menu")
        public static final EventType TAP_PLAY_NEXT_MENU;

        @pmi0("tap_search_menu")
        public static final EventType TAP_SEARCH_MENU;

        @pmi0("tap_set_menu")
        public static final EventType TAP_SET_MENU;

        @pmi0("tap_share_track_menu")
        public static final EventType TAP_SHARE_TRACK_MENU;

        @pmi0("tap_unhate_menu")
        public static final EventType TAP_UNHATE_MENU;

        static {
            EventType eventType = new EventType("TAP_MIX_TRACK_MENU", 0);
            TAP_MIX_TRACK_MENU = eventType;
            EventType eventType2 = new EventType("TAP_DISABLE_ADS_MENU", 1);
            TAP_DISABLE_ADS_MENU = eventType2;
            EventType eventType3 = new EventType("TAP_ADD_MY_MUSIC_MENU", 2);
            TAP_ADD_MY_MUSIC_MENU = eventType3;
            EventType eventType4 = new EventType("TAP_ADD_TO_PLAYLIST_MENU", 3);
            TAP_ADD_TO_PLAYLIST_MENU = eventType4;
            EventType eventType5 = new EventType("TAP_ADD_NO_SUBSCRIBE_MENU", 4);
            TAP_ADD_NO_SUBSCRIBE_MENU = eventType5;
            EventType eventType6 = new EventType("TAP_ADD_CACHE_MENU", 5);
            TAP_ADD_CACHE_MENU = eventType6;
            EventType eventType7 = new EventType("TAP_ADD_ONLINE_CACHE_MENU", 6);
            TAP_ADD_ONLINE_CACHE_MENU = eventType7;
            EventType eventType8 = new EventType("TAP_DELETE_CACHE_MENU", 7);
            TAP_DELETE_CACHE_MENU = eventType8;
            EventType eventType9 = new EventType("TAP_HATE_MENU", 8);
            TAP_HATE_MENU = eventType9;
            EventType eventType10 = new EventType("TAP_UNHATE_MENU", 9);
            TAP_UNHATE_MENU = eventType10;
            EventType eventType11 = new EventType("TAP_SHARE_TRACK_MENU", 10);
            TAP_SHARE_TRACK_MENU = eventType11;
            EventType eventType12 = new EventType("TAP_PLAY_NEXT_MENU", 11);
            TAP_PLAY_NEXT_MENU = eventType12;
            EventType eventType13 = new EventType("TAP_ADD_TO_QUEUE_MENU", 12);
            TAP_ADD_TO_QUEUE_MENU = eventType13;
            EventType eventType14 = new EventType("TAP_GOTO_ARTIST_MENU", 13);
            TAP_GOTO_ARTIST_MENU = eventType14;
            EventType eventType15 = new EventType("TAP_GOTO_ALBUM_MENU", 14);
            TAP_GOTO_ALBUM_MENU = eventType15;
            EventType eventType16 = new EventType("TAP_SET_MENU", 15);
            TAP_SET_MENU = eventType16;
            EventType eventType17 = new EventType("TAP_DELETE_MY_MUSIC_MENU", 16);
            TAP_DELETE_MY_MUSIC_MENU = eventType17;
            EventType eventType18 = new EventType("TAP_SEARCH_MENU", 17);
            TAP_SEARCH_MENU = eventType18;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18};
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

    public CommonAudioStat$TypeAudioTrackMenuUiClickItem(EventType eventType, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem) {
        this.eventType = eventType;
        this.event = commonAudioStat$TypeAudioDomainEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTrackMenuUiClickItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTrackMenuUiClickItem commonAudioStat$TypeAudioTrackMenuUiClickItem = (CommonAudioStat$TypeAudioTrackMenuUiClickItem) obj;
        return this.eventType == commonAudioStat$TypeAudioTrackMenuUiClickItem.eventType && epx.f(this.event, commonAudioStat$TypeAudioTrackMenuUiClickItem.event);
    }

    public final int hashCode() {
        return this.event.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioTrackMenuUiClickItem(eventType=" + this.eventType + ", event=" + this.event + ')';
    }
}
