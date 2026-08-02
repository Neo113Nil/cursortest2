package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioPlayerUiClickItem implements SchemeStat$TypeClick.b {

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

        @pmi0("create_screenshot")
        public static final EventType CREATE_SCREENSHOT;

        @pmi0("longtap_change_queue_queue")
        public static final EventType LONGTAP_CHANGE_QUEUE_QUEUE;

        @pmi0("swipe_close_set")
        public static final EventType SWIPE_CLOSE_SET;

        @pmi0("swipe_goto_mini_player")
        public static final EventType SWIPE_GOTO_MINI_PLAYER;

        @pmi0("swipe_miniplayer")
        public static final EventType SWIPE_MINIPLAYER;

        @pmi0("swipe_next")
        public static final EventType SWIPE_NEXT;

        @pmi0("swipe_next_mini_player")
        public static final EventType SWIPE_NEXT_MINI_PLAYER;

        @pmi0("swipe_prev")
        public static final EventType SWIPE_PREV;

        @pmi0("swipe_prev_mini_player")
        public static final EventType SWIPE_PREV_MINI_PLAYER;

        @pmi0("swipe_queue")
        public static final EventType SWIPE_QUEUE;

        @pmi0("swipe_text")
        public static final EventType SWIPE_TEXT;

        @pmi0("tap_add_cache_chips")
        public static final EventType TAP_ADD_CACHE_CHIPS;

        @pmi0("tap_add_my_music")
        public static final EventType TAP_ADD_MY_MUSIC;

        @pmi0("tap_add_my_music_lock_screen")
        public static final EventType TAP_ADD_MY_MUSIC_LOCK_SCREEN;

        @pmi0("tap_add_my_music_mini_player")
        public static final EventType TAP_ADD_MY_MUSIC_MINI_PLAYER;

        @pmi0("tap_add_my_music_notice_block")
        public static final EventType TAP_ADD_MY_MUSIC_NOTICE_BLOCK;

        @pmi0("tap_add_my_music_queue")
        public static final EventType TAP_ADD_MY_MUSIC_QUEUE;

        @pmi0("tap_add_no_subscribe_chips")
        public static final EventType TAP_ADD_NO_SUBSCRIBE_CHIPS;

        @pmi0("tap_add_online_cache_chips")
        public static final EventType TAP_ADD_ONLINE_CACHE_CHIPS;

        @pmi0("tap_add_queue_to_playlist_queue")
        public static final EventType TAP_ADD_QUEUE_TO_PLAYLIST_QUEUE;

        @pmi0("tap_add_to_playlist")
        public static final EventType TAP_ADD_TO_PLAYLIST;

        @pmi0("tap_add_to_playlist_chips")
        public static final EventType TAP_ADD_TO_PLAYLIST_CHIPS;

        @pmi0("tap_broadcast_device")
        public static final EventType TAP_BROADCAST_DEVICE;

        @pmi0("tap_broadcast_device_set")
        public static final EventType TAP_BROADCAST_DEVICE_SET;

        @pmi0("tap_cancel_cache_chips")
        public static final EventType TAP_CANCEL_CACHE_CHIPS;

        @pmi0("tap_cancel_my_music_delete")
        public static final EventType TAP_CANCEL_MY_MUSIC_DELETE;

        @pmi0("tap_close_mini_player")
        public static final EventType TAP_CLOSE_MINI_PLAYER;

        @pmi0("tap_close_set")
        public static final EventType TAP_CLOSE_SET;

        @pmi0("tap_crossfade_off_set")
        public static final EventType TAP_CROSSFADE_OFF_SET;

        @pmi0("tap_crossfade_on_set")
        public static final EventType TAP_CROSSFADE_ON_SET;

        @pmi0("tap_delete_cache_chips")
        public static final EventType TAP_DELETE_CACHE_CHIPS;

        @pmi0("tap_delete_my_music")
        public static final EventType TAP_DELETE_MY_MUSIC;

        @pmi0("tap_delete_my_music_lock_screen")
        public static final EventType TAP_DELETE_MY_MUSIC_LOCK_SCREEN;

        @pmi0("tap_delete_my_music_mini_player")
        public static final EventType TAP_DELETE_MY_MUSIC_MINI_PLAYER;

        @pmi0("tap_delete_my_music_queue")
        public static final EventType TAP_DELETE_MY_MUSIC_QUEUE;

        @pmi0("tap_delete_track_queue")
        public static final EventType TAP_DELETE_TRACK_QUEUE;

        @pmi0("tap_disable_ads")
        public static final EventType TAP_DISABLE_ADS;

        @pmi0("tap_equalizer_custom_equalizer")
        public static final EventType TAP_EQUALIZER_CUSTOM_EQUALIZER;

        @pmi0("tap_equalizer_default_equalizer")
        public static final EventType TAP_EQUALIZER_DEFAULT_EQUALIZER;

        @pmi0("tap_equalizer_off_equalizer")
        public static final EventType TAP_EQUALIZER_OFF_EQUALIZER;

        @pmi0("tap_equalizer_on_equalizer")
        public static final EventType TAP_EQUALIZER_ON_EQUALIZER;

        @pmi0("tap_equalizer_other_equalizer")
        public static final EventType TAP_EQUALIZER_OTHER_EQUALIZER;

        @pmi0("tap_equalizer_set")
        public static final EventType TAP_EQUALIZER_SET;

        @pmi0("tap_goto")
        public static final EventType TAP_GOTO;

        @pmi0("tap_goto_artist")
        public static final EventType TAP_GOTO_ARTIST;

        @pmi0("tap_goto_artist_several")
        public static final EventType TAP_GOTO_ARTIST_SEVERAL;

        @pmi0("tap_goto_banner")
        public static final EventType TAP_GOTO_BANNER;

        @pmi0("tap_goto_button")
        public static final EventType TAP_GOTO_BUTTON;

        @pmi0("tap_goto_mini_player")
        public static final EventType TAP_GOTO_MINI_PLAYER;

        @pmi0("tap_goto_source_track")
        public static final EventType TAP_GOTO_SOURCE_TRACK;

        @pmi0("tap_hate_chips")
        public static final EventType TAP_HATE_CHIPS;

        @pmi0("tap_menu")
        public static final EventType TAP_MENU;

        @pmi0("tap_menu_mini_player")
        public static final EventType TAP_MENU_MINI_PLAYER;

        @pmi0("tap_miniplayer_back_button")
        public static final EventType TAP_MINIPLAYER_BACK_BUTTON;

        @pmi0("tap_miniplayer_down")
        public static final EventType TAP_MINIPLAYER_DOWN;

        @pmi0("tap_mix_track_chips")
        public static final EventType TAP_MIX_TRACK_CHIPS;

        @pmi0("tap_next")
        public static final EventType TAP_NEXT;

        @pmi0("tap_next_lock_screen")
        public static final EventType TAP_NEXT_LOCK_SCREEN;

        @pmi0("tap_next_mini_player")
        public static final EventType TAP_NEXT_MINI_PLAYER;

        @pmi0("tap_next_notice_block")
        public static final EventType TAP_NEXT_NOTICE_BLOCK;

        @pmi0("tap_next_queue")
        public static final EventType TAP_NEXT_QUEUE;

        @pmi0("tap_next_screen_widget")
        public static final EventType TAP_NEXT_SCREEN_WIDGET;

        @pmi0("tap_pause")
        public static final EventType TAP_PAUSE;

        @pmi0("tap_pause_lock_screen")
        public static final EventType TAP_PAUSE_LOCK_SCREEN;

        @pmi0("tap_pause_mini_player")
        public static final EventType TAP_PAUSE_MINI_PLAYER;

        @pmi0("tap_pause_notice_block")
        public static final EventType TAP_PAUSE_NOTICE_BLOCK;

        @pmi0("tap_pause_queue")
        public static final EventType TAP_PAUSE_QUEUE;

        @pmi0("tap_pause_screen_widget")
        public static final EventType TAP_PAUSE_SCREEN_WIDGET;

        @pmi0("tap_pause_track_queue")
        public static final EventType TAP_PAUSE_TRACK_QUEUE;

        @pmi0("tap_play")
        public static final EventType TAP_PLAY;

        @pmi0("tap_play_lock_screen")
        public static final EventType TAP_PLAY_LOCK_SCREEN;

        @pmi0("tap_play_mini_player")
        public static final EventType TAP_PLAY_MINI_PLAYER;

        @pmi0("tap_play_notice_block")
        public static final EventType TAP_PLAY_NOTICE_BLOCK;

        @pmi0("tap_play_queue")
        public static final EventType TAP_PLAY_QUEUE;

        @pmi0("tap_play_screen_widget")
        public static final EventType TAP_PLAY_SCREEN_WIDGET;

        @pmi0("tap_play_track_queue")
        public static final EventType TAP_PLAY_TRACK_QUEUE;

        @pmi0("tap_prev")
        public static final EventType TAP_PREV;

        @pmi0("tap_prev_lock_screen")
        public static final EventType TAP_PREV_LOCK_SCREEN;

        @pmi0("tap_prev_notice_block")
        public static final EventType TAP_PREV_NOTICE_BLOCK;

        @pmi0("tap_prev_screen_widget")
        public static final EventType TAP_PREV_SCREEN_WIDGET;

        @pmi0("tap_queue")
        public static final EventType TAP_QUEUE;

        @pmi0("tap_repeat_all")
        public static final EventType TAP_REPEAT_ALL;

        @pmi0("tap_repeat_all_screen_widget")
        public static final EventType TAP_REPEAT_ALL_SCREEN_WIDGET;

        @pmi0("tap_repeat_off")
        public static final EventType TAP_REPEAT_OFF;

        @pmi0("tap_repeat_off_screen_widget")
        public static final EventType TAP_REPEAT_OFF_SCREEN_WIDGET;

        @pmi0("tap_repeat_one")
        public static final EventType TAP_REPEAT_ONE;

        @pmi0("tap_repeat_one_screen_widget")
        public static final EventType TAP_REPEAT_ONE_SCREEN_WIDGET;

        @pmi0("tap_set_chips")
        public static final EventType TAP_SET_CHIPS;

        @pmi0("tap_set_vk_mix")
        public static final EventType TAP_SET_VK_MIX;

        @pmi0("tap_set_vk_mix_chips")
        public static final EventType TAP_SET_VK_MIX_CHIPS;

        @pmi0("tap_share_broadcast")
        public static final EventType TAP_SHARE_BROADCAST;

        @pmi0("tap_share_broadcast_off")
        public static final EventType TAP_SHARE_BROADCAST_OFF;

        @pmi0("tap_share_broadcast_on")
        public static final EventType TAP_SHARE_BROADCAST_ON;

        @pmi0("tap_share_copy_link")
        public static final EventType TAP_SHARE_COPY_LINK;

        @pmi0("tap_share_external")
        public static final EventType TAP_SHARE_EXTERNAL;

        @pmi0("tap_share_internal")
        public static final EventType TAP_SHARE_INTERNAL;

        @pmi0("tap_share_story")
        public static final EventType TAP_SHARE_STORY;

        @pmi0("tap_share_track")
        public static final EventType TAP_SHARE_TRACK;

        @pmi0("tap_shuffle_off")
        public static final EventType TAP_SHUFFLE_OFF;

        @pmi0("tap_shuffle_off_lock_screen")
        public static final EventType TAP_SHUFFLE_OFF_LOCK_SCREEN;

        @pmi0("tap_shuffle_off_notice_block")
        public static final EventType TAP_SHUFFLE_OFF_NOTICE_BLOCK;

        @pmi0("tap_shuffle_off_screen_widget")
        public static final EventType TAP_SHUFFLE_OFF_SCREEN_WIDGET;

        @pmi0("tap_shuffle_on")
        public static final EventType TAP_SHUFFLE_ON;

        @pmi0("tap_shuffle_on_lock_screen")
        public static final EventType TAP_SHUFFLE_ON_LOCK_SCREEN;

        @pmi0("tap_shuffle_on_notice_block")
        public static final EventType TAP_SHUFFLE_ON_NOTICE_BLOCK;

        @pmi0("tap_shuffle_on_screen_widget")
        public static final EventType TAP_SHUFFLE_ON_SCREEN_WIDGET;

        @pmi0("tap_sound_normalized_off_set")
        public static final EventType TAP_SOUND_NORMALIZED_OFF_SET;

        @pmi0("tap_sound_normalized_on_set")
        public static final EventType TAP_SOUND_NORMALIZED_ON_SET;

        @pmi0("tap_stop_close_lock_screen")
        public static final EventType TAP_STOP_CLOSE_LOCK_SCREEN;

        @pmi0("tap_stop_close_notice_block")
        public static final EventType TAP_STOP_CLOSE_NOTICE_BLOCK;

        @pmi0("tap_text")
        public static final EventType TAP_TEXT;

        @pmi0("tap_timeline")
        public static final EventType TAP_TIMELINE;

        @pmi0("tap_timeline_lock_screen")
        public static final EventType TAP_TIMELINE_LOCK_SCREEN;

        @pmi0("tap_timeline_notice_block")
        public static final EventType TAP_TIMELINE_NOTICE_BLOCK;

        @pmi0("tap_timer_confirm_set")
        public static final EventType TAP_TIMER_CONFIRM_SET;

        @pmi0("tap_timer_set")
        public static final EventType TAP_TIMER_SET;

        @pmi0("tap_unhate_cancel")
        public static final EventType TAP_UNHATE_CANCEL;

        @pmi0("tap_unhate_chips")
        public static final EventType TAP_UNHATE_CHIPS;

        @pmi0("tap_volume_set")
        public static final EventType TAP_VOLUME_SET;

        static {
            EventType eventType = new EventType("TAP_GOTO", 0);
            TAP_GOTO = eventType;
            EventType eventType2 = new EventType("TAP_GOTO_SOURCE_TRACK", 1);
            TAP_GOTO_SOURCE_TRACK = eventType2;
            EventType eventType3 = new EventType("TAP_GOTO_BUTTON", 2);
            TAP_GOTO_BUTTON = eventType3;
            EventType eventType4 = new EventType("TAP_GOTO_BANNER", 3);
            TAP_GOTO_BANNER = eventType4;
            EventType eventType5 = new EventType("TAP_GOTO_ARTIST", 4);
            TAP_GOTO_ARTIST = eventType5;
            EventType eventType6 = new EventType("TAP_GOTO_ARTIST_SEVERAL", 5);
            TAP_GOTO_ARTIST_SEVERAL = eventType6;
            EventType eventType7 = new EventType("TAP_GOTO_MINI_PLAYER", 6);
            TAP_GOTO_MINI_PLAYER = eventType7;
            EventType eventType8 = new EventType("TAP_MINIPLAYER_BACK_BUTTON", 7);
            TAP_MINIPLAYER_BACK_BUTTON = eventType8;
            EventType eventType9 = new EventType("TAP_MINIPLAYER_DOWN", 8);
            TAP_MINIPLAYER_DOWN = eventType9;
            EventType eventType10 = new EventType("TAP_BROADCAST_DEVICE", 9);
            TAP_BROADCAST_DEVICE = eventType10;
            EventType eventType11 = new EventType("TAP_SHARE_TRACK", 10);
            TAP_SHARE_TRACK = eventType11;
            EventType eventType12 = new EventType("TAP_TIMELINE", 11);
            TAP_TIMELINE = eventType12;
            EventType eventType13 = new EventType("TAP_TIMELINE_LOCK_SCREEN", 12);
            TAP_TIMELINE_LOCK_SCREEN = eventType13;
            EventType eventType14 = new EventType("TAP_TIMELINE_NOTICE_BLOCK", 13);
            TAP_TIMELINE_NOTICE_BLOCK = eventType14;
            EventType eventType15 = new EventType("TAP_PAUSE", 14);
            TAP_PAUSE = eventType15;
            EventType eventType16 = new EventType("TAP_PLAY", 15);
            TAP_PLAY = eventType16;
            EventType eventType17 = new EventType("TAP_PAUSE_LOCK_SCREEN", 16);
            TAP_PAUSE_LOCK_SCREEN = eventType17;
            EventType eventType18 = new EventType("TAP_PLAY_LOCK_SCREEN", 17);
            TAP_PLAY_LOCK_SCREEN = eventType18;
            EventType eventType19 = new EventType("TAP_PAUSE_SCREEN_WIDGET", 18);
            TAP_PAUSE_SCREEN_WIDGET = eventType19;
            EventType eventType20 = new EventType("TAP_PLAY_SCREEN_WIDGET", 19);
            TAP_PLAY_SCREEN_WIDGET = eventType20;
            EventType eventType21 = new EventType("TAP_PAUSE_NOTICE_BLOCK", 20);
            TAP_PAUSE_NOTICE_BLOCK = eventType21;
            EventType eventType22 = new EventType("TAP_PLAY_NOTICE_BLOCK", 21);
            TAP_PLAY_NOTICE_BLOCK = eventType22;
            EventType eventType23 = new EventType("TAP_SHUFFLE_ON", 22);
            TAP_SHUFFLE_ON = eventType23;
            EventType eventType24 = new EventType("TAP_SHUFFLE_OFF", 23);
            TAP_SHUFFLE_OFF = eventType24;
            EventType eventType25 = new EventType("TAP_SHUFFLE_ON_LOCK_SCREEN", 24);
            TAP_SHUFFLE_ON_LOCK_SCREEN = eventType25;
            EventType eventType26 = new EventType("TAP_SHUFFLE_OFF_LOCK_SCREEN", 25);
            TAP_SHUFFLE_OFF_LOCK_SCREEN = eventType26;
            EventType eventType27 = new EventType("TAP_SHUFFLE_ON_SCREEN_WIDGET", 26);
            TAP_SHUFFLE_ON_SCREEN_WIDGET = eventType27;
            EventType eventType28 = new EventType("TAP_SHUFFLE_OFF_SCREEN_WIDGET", 27);
            TAP_SHUFFLE_OFF_SCREEN_WIDGET = eventType28;
            EventType eventType29 = new EventType("TAP_SHUFFLE_ON_NOTICE_BLOCK", 28);
            TAP_SHUFFLE_ON_NOTICE_BLOCK = eventType29;
            EventType eventType30 = new EventType("TAP_SHUFFLE_OFF_NOTICE_BLOCK", 29);
            TAP_SHUFFLE_OFF_NOTICE_BLOCK = eventType30;
            EventType eventType31 = new EventType("TAP_ADD_MY_MUSIC", 30);
            TAP_ADD_MY_MUSIC = eventType31;
            EventType eventType32 = new EventType("TAP_ADD_MY_MUSIC_LOCK_SCREEN", 31);
            TAP_ADD_MY_MUSIC_LOCK_SCREEN = eventType32;
            EventType eventType33 = new EventType("TAP_ADD_MY_MUSIC_NOTICE_BLOCK", 32);
            TAP_ADD_MY_MUSIC_NOTICE_BLOCK = eventType33;
            EventType eventType34 = new EventType("TAP_DELETE_MY_MUSIC", 33);
            TAP_DELETE_MY_MUSIC = eventType34;
            EventType eventType35 = new EventType("TAP_DELETE_MY_MUSIC_LOCK_SCREEN", 34);
            TAP_DELETE_MY_MUSIC_LOCK_SCREEN = eventType35;
            EventType eventType36 = new EventType("TAP_MENU", 35);
            TAP_MENU = eventType36;
            EventType eventType37 = new EventType("TAP_REPEAT_ALL", 36);
            TAP_REPEAT_ALL = eventType37;
            EventType eventType38 = new EventType("TAP_REPEAT_ONE", 37);
            TAP_REPEAT_ONE = eventType38;
            EventType eventType39 = new EventType("TAP_REPEAT_OFF", 38);
            TAP_REPEAT_OFF = eventType39;
            EventType eventType40 = new EventType("TAP_REPEAT_ALL_SCREEN_WIDGET", 39);
            TAP_REPEAT_ALL_SCREEN_WIDGET = eventType40;
            EventType eventType41 = new EventType("TAP_REPEAT_ONE_SCREEN_WIDGET", 40);
            TAP_REPEAT_ONE_SCREEN_WIDGET = eventType41;
            EventType eventType42 = new EventType("TAP_REPEAT_OFF_SCREEN_WIDGET", 41);
            TAP_REPEAT_OFF_SCREEN_WIDGET = eventType42;
            EventType eventType43 = new EventType("TAP_TEXT", 42);
            TAP_TEXT = eventType43;
            EventType eventType44 = new EventType("TAP_QUEUE", 43);
            TAP_QUEUE = eventType44;
            EventType eventType45 = new EventType("TAP_PREV", 44);
            TAP_PREV = eventType45;
            EventType eventType46 = new EventType("TAP_NEXT", 45);
            TAP_NEXT = eventType46;
            EventType eventType47 = new EventType("TAP_PREV_LOCK_SCREEN", 46);
            TAP_PREV_LOCK_SCREEN = eventType47;
            EventType eventType48 = new EventType("TAP_NEXT_LOCK_SCREEN", 47);
            TAP_NEXT_LOCK_SCREEN = eventType48;
            EventType eventType49 = new EventType("TAP_PREV_SCREEN_WIDGET", 48);
            TAP_PREV_SCREEN_WIDGET = eventType49;
            EventType eventType50 = new EventType("TAP_NEXT_SCREEN_WIDGET", 49);
            TAP_NEXT_SCREEN_WIDGET = eventType50;
            EventType eventType51 = new EventType("TAP_PREV_NOTICE_BLOCK", 50);
            TAP_PREV_NOTICE_BLOCK = eventType51;
            EventType eventType52 = new EventType("TAP_NEXT_NOTICE_BLOCK", 51);
            TAP_NEXT_NOTICE_BLOCK = eventType52;
            EventType eventType53 = new EventType("TAP_PLAY_MINI_PLAYER", 52);
            TAP_PLAY_MINI_PLAYER = eventType53;
            EventType eventType54 = new EventType("TAP_PAUSE_MINI_PLAYER", 53);
            TAP_PAUSE_MINI_PLAYER = eventType54;
            EventType eventType55 = new EventType("TAP_NEXT_MINI_PLAYER", 54);
            TAP_NEXT_MINI_PLAYER = eventType55;
            EventType eventType56 = new EventType("TAP_DELETE_MY_MUSIC_MINI_PLAYER", 55);
            TAP_DELETE_MY_MUSIC_MINI_PLAYER = eventType56;
            EventType eventType57 = new EventType("TAP_ADD_MY_MUSIC_MINI_PLAYER", 56);
            TAP_ADD_MY_MUSIC_MINI_PLAYER = eventType57;
            EventType eventType58 = new EventType("TAP_CLOSE_MINI_PLAYER", 57);
            TAP_CLOSE_MINI_PLAYER = eventType58;
            EventType eventType59 = new EventType("TAP_STOP_CLOSE_LOCK_SCREEN", 58);
            TAP_STOP_CLOSE_LOCK_SCREEN = eventType59;
            EventType eventType60 = new EventType("TAP_STOP_CLOSE_NOTICE_BLOCK", 59);
            TAP_STOP_CLOSE_NOTICE_BLOCK = eventType60;
            EventType eventType61 = new EventType("TAP_MENU_MINI_PLAYER", 60);
            TAP_MENU_MINI_PLAYER = eventType61;
            EventType eventType62 = new EventType("TAP_SET_CHIPS", 61);
            TAP_SET_CHIPS = eventType62;
            EventType eventType63 = new EventType("TAP_MIX_TRACK_CHIPS", 62);
            TAP_MIX_TRACK_CHIPS = eventType63;
            EventType eventType64 = new EventType("TAP_ADD_TO_PLAYLIST_CHIPS", 63);
            TAP_ADD_TO_PLAYLIST_CHIPS = eventType64;
            EventType eventType65 = new EventType("TAP_HATE_CHIPS", 64);
            TAP_HATE_CHIPS = eventType65;
            EventType eventType66 = new EventType("TAP_UNHATE_CHIPS", 65);
            TAP_UNHATE_CHIPS = eventType66;
            EventType eventType67 = new EventType("TAP_UNHATE_CANCEL", 66);
            TAP_UNHATE_CANCEL = eventType67;
            EventType eventType68 = new EventType("TAP_ADD_NO_SUBSCRIBE_CHIPS", 67);
            TAP_ADD_NO_SUBSCRIBE_CHIPS = eventType68;
            EventType eventType69 = new EventType("TAP_ADD_ONLINE_CACHE_CHIPS", 68);
            TAP_ADD_ONLINE_CACHE_CHIPS = eventType69;
            EventType eventType70 = new EventType("TAP_ADD_CACHE_CHIPS", 69);
            TAP_ADD_CACHE_CHIPS = eventType70;
            EventType eventType71 = new EventType("TAP_DELETE_CACHE_CHIPS", 70);
            TAP_DELETE_CACHE_CHIPS = eventType71;
            EventType eventType72 = new EventType("TAP_SET_VK_MIX_CHIPS", 71);
            TAP_SET_VK_MIX_CHIPS = eventType72;
            EventType eventType73 = new EventType("TAP_SET_VK_MIX", 72);
            TAP_SET_VK_MIX = eventType73;
            EventType eventType74 = new EventType("TAP_ADD_MY_MUSIC_QUEUE", 73);
            TAP_ADD_MY_MUSIC_QUEUE = eventType74;
            EventType eventType75 = new EventType("TAP_DELETE_MY_MUSIC_QUEUE", 74);
            TAP_DELETE_MY_MUSIC_QUEUE = eventType75;
            EventType eventType76 = new EventType("TAP_NEXT_QUEUE", 75);
            TAP_NEXT_QUEUE = eventType76;
            EventType eventType77 = new EventType("TAP_PLAY_QUEUE", 76);
            TAP_PLAY_QUEUE = eventType77;
            EventType eventType78 = new EventType("TAP_PLAY_TRACK_QUEUE", 77);
            TAP_PLAY_TRACK_QUEUE = eventType78;
            EventType eventType79 = new EventType("TAP_PAUSE_QUEUE", 78);
            TAP_PAUSE_QUEUE = eventType79;
            EventType eventType80 = new EventType("TAP_PAUSE_TRACK_QUEUE", 79);
            TAP_PAUSE_TRACK_QUEUE = eventType80;
            EventType eventType81 = new EventType("TAP_ADD_QUEUE_TO_PLAYLIST_QUEUE", 80);
            TAP_ADD_QUEUE_TO_PLAYLIST_QUEUE = eventType81;
            EventType eventType82 = new EventType("TAP_ADD_TO_PLAYLIST", 81);
            TAP_ADD_TO_PLAYLIST = eventType82;
            EventType eventType83 = new EventType("TAP_DELETE_TRACK_QUEUE", 82);
            TAP_DELETE_TRACK_QUEUE = eventType83;
            EventType eventType84 = new EventType("TAP_DISABLE_ADS", 83);
            TAP_DISABLE_ADS = eventType84;
            EventType eventType85 = new EventType("TAP_CANCEL_CACHE_CHIPS", 84);
            TAP_CANCEL_CACHE_CHIPS = eventType85;
            EventType eventType86 = new EventType("TAP_CANCEL_MY_MUSIC_DELETE", 85);
            TAP_CANCEL_MY_MUSIC_DELETE = eventType86;
            EventType eventType87 = new EventType("TAP_CLOSE_SET", 86);
            TAP_CLOSE_SET = eventType87;
            EventType eventType88 = new EventType("TAP_BROADCAST_DEVICE_SET", 87);
            TAP_BROADCAST_DEVICE_SET = eventType88;
            EventType eventType89 = new EventType("TAP_TIMER_SET", 88);
            TAP_TIMER_SET = eventType89;
            EventType eventType90 = new EventType("TAP_TIMER_CONFIRM_SET", 89);
            TAP_TIMER_CONFIRM_SET = eventType90;
            EventType eventType91 = new EventType("TAP_EQUALIZER_SET", 90);
            TAP_EQUALIZER_SET = eventType91;
            EventType eventType92 = new EventType("TAP_EQUALIZER_ON_EQUALIZER", 91);
            TAP_EQUALIZER_ON_EQUALIZER = eventType92;
            EventType eventType93 = new EventType("TAP_EQUALIZER_OFF_EQUALIZER", 92);
            TAP_EQUALIZER_OFF_EQUALIZER = eventType93;
            EventType eventType94 = new EventType("TAP_EQUALIZER_DEFAULT_EQUALIZER", 93);
            TAP_EQUALIZER_DEFAULT_EQUALIZER = eventType94;
            EventType eventType95 = new EventType("TAP_EQUALIZER_CUSTOM_EQUALIZER", 94);
            TAP_EQUALIZER_CUSTOM_EQUALIZER = eventType95;
            EventType eventType96 = new EventType("TAP_EQUALIZER_OTHER_EQUALIZER", 95);
            TAP_EQUALIZER_OTHER_EQUALIZER = eventType96;
            EventType eventType97 = new EventType("TAP_SOUND_NORMALIZED_ON_SET", 96);
            TAP_SOUND_NORMALIZED_ON_SET = eventType97;
            EventType eventType98 = new EventType("TAP_SOUND_NORMALIZED_OFF_SET", 97);
            TAP_SOUND_NORMALIZED_OFF_SET = eventType98;
            EventType eventType99 = new EventType("TAP_CROSSFADE_ON_SET", 98);
            TAP_CROSSFADE_ON_SET = eventType99;
            EventType eventType100 = new EventType("TAP_CROSSFADE_OFF_SET", 99);
            TAP_CROSSFADE_OFF_SET = eventType100;
            EventType eventType101 = new EventType("TAP_VOLUME_SET", 100);
            TAP_VOLUME_SET = eventType101;
            EventType eventType102 = new EventType("TAP_SHARE_INTERNAL", 101);
            TAP_SHARE_INTERNAL = eventType102;
            EventType eventType103 = new EventType("TAP_SHARE_COPY_LINK", 102);
            TAP_SHARE_COPY_LINK = eventType103;
            EventType eventType104 = new EventType("TAP_SHARE_STORY", 103);
            TAP_SHARE_STORY = eventType104;
            EventType eventType105 = new EventType("TAP_SHARE_EXTERNAL", 104);
            TAP_SHARE_EXTERNAL = eventType105;
            EventType eventType106 = new EventType("TAP_SHARE_BROADCAST", 105);
            TAP_SHARE_BROADCAST = eventType106;
            EventType eventType107 = new EventType("TAP_SHARE_BROADCAST_ON", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            TAP_SHARE_BROADCAST_ON = eventType107;
            EventType eventType108 = new EventType("TAP_SHARE_BROADCAST_OFF", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            TAP_SHARE_BROADCAST_OFF = eventType108;
            EventType eventType109 = new EventType("LONGTAP_CHANGE_QUEUE_QUEUE", 108);
            LONGTAP_CHANGE_QUEUE_QUEUE = eventType109;
            EventType eventType110 = new EventType("SWIPE_MINIPLAYER", 109);
            SWIPE_MINIPLAYER = eventType110;
            EventType eventType111 = new EventType("SWIPE_GOTO_MINI_PLAYER", 110);
            SWIPE_GOTO_MINI_PLAYER = eventType111;
            EventType eventType112 = new EventType("SWIPE_TEXT", 111);
            SWIPE_TEXT = eventType112;
            EventType eventType113 = new EventType("SWIPE_QUEUE", 112);
            SWIPE_QUEUE = eventType113;
            EventType eventType114 = new EventType("SWIPE_PREV", 113);
            SWIPE_PREV = eventType114;
            EventType eventType115 = new EventType("SWIPE_NEXT", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            SWIPE_NEXT = eventType115;
            EventType eventType116 = new EventType("SWIPE_NEXT_MINI_PLAYER", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            SWIPE_NEXT_MINI_PLAYER = eventType116;
            EventType eventType117 = new EventType("SWIPE_PREV_MINI_PLAYER", 116);
            SWIPE_PREV_MINI_PLAYER = eventType117;
            EventType eventType118 = new EventType("SWIPE_CLOSE_SET", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            SWIPE_CLOSE_SET = eventType118;
            EventType eventType119 = new EventType("CREATE_SCREENSHOT", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            CREATE_SCREENSHOT = eventType119;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50, eventType51, eventType52, eventType53, eventType54, eventType55, eventType56, eventType57, eventType58, eventType59, eventType60, eventType61, eventType62, eventType63, eventType64, eventType65, eventType66, eventType67, eventType68, eventType69, eventType70, eventType71, eventType72, eventType73, eventType74, eventType75, eventType76, eventType77, eventType78, eventType79, eventType80, eventType81, eventType82, eventType83, eventType84, eventType85, eventType86, eventType87, eventType88, eventType89, eventType90, eventType91, eventType92, eventType93, eventType94, eventType95, eventType96, eventType97, eventType98, eventType99, eventType100, eventType101, eventType102, eventType103, eventType104, eventType105, eventType106, eventType107, eventType108, eventType109, eventType110, eventType111, eventType112, eventType113, eventType114, eventType115, eventType116, eventType117, eventType118, eventType119};
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

    public CommonAudioStat$TypeAudioPlayerUiClickItem(EventType eventType, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem) {
        this.eventType = eventType;
        this.event = commonAudioStat$TypeAudioDomainEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioPlayerUiClickItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioPlayerUiClickItem commonAudioStat$TypeAudioPlayerUiClickItem = (CommonAudioStat$TypeAudioPlayerUiClickItem) obj;
        return this.eventType == commonAudioStat$TypeAudioPlayerUiClickItem.eventType && epx.f(this.event, commonAudioStat$TypeAudioPlayerUiClickItem.event);
    }

    public final int hashCode() {
        return this.event.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioPlayerUiClickItem(eventType=" + this.eventType + ", event=" + this.event + ')';
    }
}
