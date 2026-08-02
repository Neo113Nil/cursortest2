package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioUiClickItem implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("mix_options_id")
    private final MixOptionsId mixOptionsId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("play_fastplay")
        public static final EventType PLAY_FASTPLAY;

        @pmi0("play_fastplay_pause")
        public static final EventType PLAY_FASTPLAY_PAUSE;

        @pmi0("play_fastplay_playlist")
        public static final EventType PLAY_FASTPLAY_PLAYLIST;

        @pmi0("play_fastplay_vibe")
        public static final EventType PLAY_FASTPLAY_VIBE;

        @pmi0("play_start_audiobook")
        public static final EventType PLAY_START_AUDIOBOOK;

        @pmi0("play_start_podcast")
        public static final EventType PLAY_START_PODCAST;

        @pmi0("play_start_track")
        public static final EventType PLAY_START_TRACK;

        @pmi0("swipe_set")
        public static final EventType SWIPE_SET;

        @pmi0("tap_add")
        public static final EventType TAP_ADD;

        @pmi0("tap_add_my_music")
        public static final EventType TAP_ADD_MY_MUSIC;

        @pmi0("tap_add_playlist")
        public static final EventType TAP_ADD_PLAYLIST;

        @pmi0("tap_close_by_cross")
        public static final EventType TAP_CLOSE_BY_CROSS;

        @pmi0("tap_delete_my_music")
        public static final EventType TAP_DELETE_MY_MUSIC;

        @pmi0("tap_feed_updates")
        public static final EventType TAP_FEED_UPDATES;

        @pmi0("tap_filter")
        public static final EventType TAP_FILTER;

        @pmi0("tap_goto")
        public static final EventType TAP_GOTO;

        @pmi0("tap_goto_album_recent")
        public static final EventType TAP_GOTO_ALBUM_RECENT;

        @pmi0("tap_goto_all_tracks_tab")
        public static final EventType TAP_GOTO_ALL_TRACKS_TAB;

        @pmi0("tap_goto_artist")
        public static final EventType TAP_GOTO_ARTIST;

        @pmi0("tap_goto_audiobook")
        public static final EventType TAP_GOTO_AUDIOBOOK;

        @pmi0("tap_goto_books_and_shows")
        public static final EventType TAP_GOTO_BOOKS_AND_SHOWS;

        @pmi0("tap_goto_downloaded_tracks_tab")
        public static final EventType TAP_GOTO_DOWNLOADED_TRACKS_TAB;

        @pmi0("tap_goto_keyboard_search")
        public static final EventType TAP_GOTO_KEYBOARD_SEARCH;

        @pmi0("tap_goto_more_albums")
        public static final EventType TAP_GOTO_MORE_ALBUMS;

        @pmi0("tap_goto_more_artist_and_curator")
        public static final EventType TAP_GOTO_MORE_ARTIST_AND_CURATOR;

        @pmi0("tap_goto_more_audio_books")
        public static final EventType TAP_GOTO_MORE_AUDIO_BOOKS;

        @pmi0("tap_goto_more_downloaded")
        public static final EventType TAP_GOTO_MORE_DOWNLOADED;

        @pmi0("tap_goto_more_kids")
        public static final EventType TAP_GOTO_MORE_KIDS;

        @pmi0("tap_goto_more_playlist")
        public static final EventType TAP_GOTO_MORE_PLAYLIST;

        @pmi0("tap_goto_more_podcats")
        public static final EventType TAP_GOTO_MORE_PODCATS;

        @pmi0("tap_goto_more_radio")
        public static final EventType TAP_GOTO_MORE_RADIO;

        @pmi0("tap_goto_more_recent_tracks")
        public static final EventType TAP_GOTO_MORE_RECENT_TRACKS;

        @pmi0("tap_goto_offline_library")
        public static final EventType TAP_GOTO_OFFLINE_LIBRARY;

        @pmi0("tap_goto_playlist")
        public static final EventType TAP_GOTO_PLAYLIST;

        @pmi0("tap_goto_playlist_collection")
        public static final EventType TAP_GOTO_PLAYLIST_COLLECTION;

        @pmi0("tap_goto_playlist_recent")
        public static final EventType TAP_GOTO_PLAYLIST_RECENT;

        @pmi0("tap_goto_playlist_recent_tracks")
        public static final EventType TAP_GOTO_PLAYLIST_RECENT_TRACKS;

        @pmi0("tap_goto_podcast")
        public static final EventType TAP_GOTO_PODCAST;

        @pmi0("tap_goto_podcast_recent")
        public static final EventType TAP_GOTO_PODCAST_RECENT;

        @pmi0("tap_goto_popular_search_placeholder")
        public static final EventType TAP_GOTO_POPULAR_SEARCH_PLACEHOLDER;

        @pmi0("tap_goto_recent_search_placeholder")
        public static final EventType TAP_GOTO_RECENT_SEARCH_PLACEHOLDER;

        @pmi0("tap_goto_search_suggestion")
        public static final EventType TAP_GOTO_SEARCH_SUGGESTION;

        @pmi0("tap_goto_search_tab_albums")
        public static final EventType TAP_GOTO_SEARCH_TAB_ALBUMS;

        @pmi0("tap_goto_search_tab_artists")
        public static final EventType TAP_GOTO_SEARCH_TAB_ARTISTS;

        @pmi0("tap_goto_search_tab_audios")
        public static final EventType TAP_GOTO_SEARCH_TAB_AUDIOS;

        @pmi0("tap_goto_search_tab_playlists")
        public static final EventType TAP_GOTO_SEARCH_TAB_PLAYLISTS;

        @pmi0("tap_goto_set_recom_onboarding")
        public static final EventType TAP_GOTO_SET_RECOM_ONBOARDING;

        @pmi0("tap_goto_show_more")
        public static final EventType TAP_GOTO_SHOW_MORE;

        @pmi0("tap_goto_tab_bar")
        public static final EventType TAP_GOTO_TAB_BAR;

        @pmi0("tap_menu_open_audiobook")
        public static final EventType TAP_MENU_OPEN_AUDIOBOOK;

        @pmi0("tap_menu_open_playlist")
        public static final EventType TAP_MENU_OPEN_PLAYLIST;

        @pmi0("tap_menu_open_podcast")
        public static final EventType TAP_MENU_OPEN_PODCAST;

        @pmi0("tap_search")
        public static final EventType TAP_SEARCH;

        @pmi0("tap_search_by_voice")
        public static final EventType TAP_SEARCH_BY_VOICE;

        @pmi0("tap_set")
        public static final EventType TAP_SET;

        static {
            EventType eventType = new EventType("PLAY_FASTPLAY", 0);
            PLAY_FASTPLAY = eventType;
            EventType eventType2 = new EventType("PLAY_FASTPLAY_VIBE", 1);
            PLAY_FASTPLAY_VIBE = eventType2;
            EventType eventType3 = new EventType("PLAY_FASTPLAY_PLAYLIST", 2);
            PLAY_FASTPLAY_PLAYLIST = eventType3;
            EventType eventType4 = new EventType("PLAY_FASTPLAY_PAUSE", 3);
            PLAY_FASTPLAY_PAUSE = eventType4;
            EventType eventType5 = new EventType("PLAY_START_PODCAST", 4);
            PLAY_START_PODCAST = eventType5;
            EventType eventType6 = new EventType("PLAY_START_AUDIOBOOK", 5);
            PLAY_START_AUDIOBOOK = eventType6;
            EventType eventType7 = new EventType("PLAY_START_TRACK", 6);
            PLAY_START_TRACK = eventType7;
            EventType eventType8 = new EventType("TAP_SEARCH", 7);
            TAP_SEARCH = eventType8;
            EventType eventType9 = new EventType("TAP_SEARCH_BY_VOICE", 8);
            TAP_SEARCH_BY_VOICE = eventType9;
            EventType eventType10 = new EventType("TAP_FEED_UPDATES", 9);
            TAP_FEED_UPDATES = eventType10;
            EventType eventType11 = new EventType("TAP_SET", 10);
            TAP_SET = eventType11;
            EventType eventType12 = new EventType("SWIPE_SET", 11);
            SWIPE_SET = eventType12;
            EventType eventType13 = new EventType("TAP_ADD", 12);
            TAP_ADD = eventType13;
            EventType eventType14 = new EventType("TAP_MENU_OPEN_PODCAST", 13);
            TAP_MENU_OPEN_PODCAST = eventType14;
            EventType eventType15 = new EventType("TAP_MENU_OPEN_AUDIOBOOK", 14);
            TAP_MENU_OPEN_AUDIOBOOK = eventType15;
            EventType eventType16 = new EventType("TAP_MENU_OPEN_PLAYLIST", 15);
            TAP_MENU_OPEN_PLAYLIST = eventType16;
            EventType eventType17 = new EventType("TAP_GOTO", 16);
            TAP_GOTO = eventType17;
            EventType eventType18 = new EventType("TAP_GOTO_SHOW_MORE", 17);
            TAP_GOTO_SHOW_MORE = eventType18;
            EventType eventType19 = new EventType("TAP_GOTO_SET_RECOM_ONBOARDING", 18);
            TAP_GOTO_SET_RECOM_ONBOARDING = eventType19;
            EventType eventType20 = new EventType("TAP_GOTO_BOOKS_AND_SHOWS", 19);
            TAP_GOTO_BOOKS_AND_SHOWS = eventType20;
            EventType eventType21 = new EventType("TAP_GOTO_PLAYLIST", 20);
            TAP_GOTO_PLAYLIST = eventType21;
            EventType eventType22 = new EventType("TAP_GOTO_ARTIST", 21);
            TAP_GOTO_ARTIST = eventType22;
            EventType eventType23 = new EventType("TAP_GOTO_AUDIOBOOK", 22);
            TAP_GOTO_AUDIOBOOK = eventType23;
            EventType eventType24 = new EventType("TAP_GOTO_PODCAST", 23);
            TAP_GOTO_PODCAST = eventType24;
            EventType eventType25 = new EventType("TAP_GOTO_PLAYLIST_COLLECTION", 24);
            TAP_GOTO_PLAYLIST_COLLECTION = eventType25;
            EventType eventType26 = new EventType("TAP_GOTO_PLAYLIST_RECENT_TRACKS", 25);
            TAP_GOTO_PLAYLIST_RECENT_TRACKS = eventType26;
            EventType eventType27 = new EventType("TAP_GOTO_PLAYLIST_RECENT", 26);
            TAP_GOTO_PLAYLIST_RECENT = eventType27;
            EventType eventType28 = new EventType("TAP_GOTO_ALBUM_RECENT", 27);
            TAP_GOTO_ALBUM_RECENT = eventType28;
            EventType eventType29 = new EventType("TAP_GOTO_PODCAST_RECENT", 28);
            TAP_GOTO_PODCAST_RECENT = eventType29;
            EventType eventType30 = new EventType("TAP_CLOSE_BY_CROSS", 29);
            TAP_CLOSE_BY_CROSS = eventType30;
            EventType eventType31 = new EventType("TAP_GOTO_TAB_BAR", 30);
            TAP_GOTO_TAB_BAR = eventType31;
            EventType eventType32 = new EventType("TAP_GOTO_MORE_RECENT_TRACKS", 31);
            TAP_GOTO_MORE_RECENT_TRACKS = eventType32;
            EventType eventType33 = new EventType("TAP_GOTO_MORE_PLAYLIST", 32);
            TAP_GOTO_MORE_PLAYLIST = eventType33;
            EventType eventType34 = new EventType("TAP_GOTO_MORE_PODCATS", 33);
            TAP_GOTO_MORE_PODCATS = eventType34;
            EventType eventType35 = new EventType("TAP_GOTO_MORE_AUDIO_BOOKS", 34);
            TAP_GOTO_MORE_AUDIO_BOOKS = eventType35;
            EventType eventType36 = new EventType("TAP_GOTO_MORE_ALBUMS", 35);
            TAP_GOTO_MORE_ALBUMS = eventType36;
            EventType eventType37 = new EventType("TAP_GOTO_MORE_RADIO", 36);
            TAP_GOTO_MORE_RADIO = eventType37;
            EventType eventType38 = new EventType("TAP_GOTO_MORE_ARTIST_AND_CURATOR", 37);
            TAP_GOTO_MORE_ARTIST_AND_CURATOR = eventType38;
            EventType eventType39 = new EventType("TAP_GOTO_MORE_DOWNLOADED", 38);
            TAP_GOTO_MORE_DOWNLOADED = eventType39;
            EventType eventType40 = new EventType("TAP_GOTO_MORE_KIDS", 39);
            TAP_GOTO_MORE_KIDS = eventType40;
            EventType eventType41 = new EventType("TAP_GOTO_DOWNLOADED_TRACKS_TAB", 40);
            TAP_GOTO_DOWNLOADED_TRACKS_TAB = eventType41;
            EventType eventType42 = new EventType("TAP_GOTO_ALL_TRACKS_TAB", 41);
            TAP_GOTO_ALL_TRACKS_TAB = eventType42;
            EventType eventType43 = new EventType("TAP_GOTO_SEARCH_SUGGESTION", 42);
            TAP_GOTO_SEARCH_SUGGESTION = eventType43;
            EventType eventType44 = new EventType("TAP_GOTO_KEYBOARD_SEARCH", 43);
            TAP_GOTO_KEYBOARD_SEARCH = eventType44;
            EventType eventType45 = new EventType("TAP_GOTO_RECENT_SEARCH_PLACEHOLDER", 44);
            TAP_GOTO_RECENT_SEARCH_PLACEHOLDER = eventType45;
            EventType eventType46 = new EventType("TAP_GOTO_POPULAR_SEARCH_PLACEHOLDER", 45);
            TAP_GOTO_POPULAR_SEARCH_PLACEHOLDER = eventType46;
            EventType eventType47 = new EventType("TAP_GOTO_SEARCH_TAB_AUDIOS", 46);
            TAP_GOTO_SEARCH_TAB_AUDIOS = eventType47;
            EventType eventType48 = new EventType("TAP_GOTO_SEARCH_TAB_ALBUMS", 47);
            TAP_GOTO_SEARCH_TAB_ALBUMS = eventType48;
            EventType eventType49 = new EventType("TAP_GOTO_SEARCH_TAB_ARTISTS", 48);
            TAP_GOTO_SEARCH_TAB_ARTISTS = eventType49;
            EventType eventType50 = new EventType("TAP_GOTO_SEARCH_TAB_PLAYLISTS", 49);
            TAP_GOTO_SEARCH_TAB_PLAYLISTS = eventType50;
            EventType eventType51 = new EventType("TAP_GOTO_OFFLINE_LIBRARY", 50);
            TAP_GOTO_OFFLINE_LIBRARY = eventType51;
            EventType eventType52 = new EventType("TAP_FILTER", 51);
            TAP_FILTER = eventType52;
            EventType eventType53 = new EventType("TAP_ADD_PLAYLIST", 52);
            TAP_ADD_PLAYLIST = eventType53;
            EventType eventType54 = new EventType("TAP_ADD_MY_MUSIC", 53);
            TAP_ADD_MY_MUSIC = eventType54;
            EventType eventType55 = new EventType("TAP_DELETE_MY_MUSIC", 54);
            TAP_DELETE_MY_MUSIC = eventType55;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50, eventType51, eventType52, eventType53, eventType54, eventType55};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static zrp<EventType> h() {
            return $ENTRIES;
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
    /* compiled from: CommonAudioStat.kt */
    public static final class MixOptionsId {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MixOptionsId[] $VALUES;

        @pmi0("artist_mix")
        public static final MixOptionsId ARTIST_MIX;

        @pmi0("child_track_mix")
        public static final MixOptionsId CHILD_TRACK_MIX;

        @pmi0("common")
        public static final MixOptionsId COMMON;

        @pmi0("my_music")
        public static final MixOptionsId MY_MUSIC;

        @pmi0("track_mix")
        public static final MixOptionsId TRACK_MIX;

        static {
            MixOptionsId mixOptionsId = new MixOptionsId("COMMON", 0);
            COMMON = mixOptionsId;
            MixOptionsId mixOptionsId2 = new MixOptionsId("MY_MUSIC", 1);
            MY_MUSIC = mixOptionsId2;
            MixOptionsId mixOptionsId3 = new MixOptionsId("TRACK_MIX", 2);
            TRACK_MIX = mixOptionsId3;
            MixOptionsId mixOptionsId4 = new MixOptionsId("CHILD_TRACK_MIX", 3);
            CHILD_TRACK_MIX = mixOptionsId4;
            MixOptionsId mixOptionsId5 = new MixOptionsId("ARTIST_MIX", 4);
            ARTIST_MIX = mixOptionsId5;
            MixOptionsId[] mixOptionsIdArr = {mixOptionsId, mixOptionsId2, mixOptionsId3, mixOptionsId4, mixOptionsId5};
            $VALUES = mixOptionsIdArr;
            $ENTRIES = new asp(mixOptionsIdArr);
        }

        private MixOptionsId(String str, int i) {
        }

        public static MixOptionsId valueOf(String str) {
            return (MixOptionsId) Enum.valueOf(MixOptionsId.class, str);
        }

        public static MixOptionsId[] values() {
            return (MixOptionsId[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioUiClickItem(EventType eventType, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, MixOptionsId mixOptionsId) {
        this.eventType = eventType;
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.mixOptionsId = mixOptionsId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioUiClickItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioUiClickItem commonAudioStat$TypeAudioUiClickItem = (CommonAudioStat$TypeAudioUiClickItem) obj;
        return this.eventType == commonAudioStat$TypeAudioUiClickItem.eventType && epx.f(this.event, commonAudioStat$TypeAudioUiClickItem.event) && this.mixOptionsId == commonAudioStat$TypeAudioUiClickItem.mixOptionsId;
    }

    public final int hashCode() {
        int hashCode = (this.event.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        MixOptionsId mixOptionsId = this.mixOptionsId;
        return hashCode + (mixOptionsId == null ? 0 : mixOptionsId.hashCode());
    }

    public final String toString() {
        return "TypeAudioUiClickItem(eventType=" + this.eventType + ", event=" + this.event + ", mixOptionsId=" + this.mixOptionsId + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioUiClickItem(EventType eventType, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, MixOptionsId mixOptionsId, int i, zcl zclVar) {
        this(eventType, commonAudioStat$TypeAudioDomainEventItem, (i & 4) != 0 ? null : mixOptionsId);
    }
}
