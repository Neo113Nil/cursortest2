package com.vk.toggle.features;

import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicFeatures.kt */
/* loaded from: classes11.dex */
public final class MusicFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicFeatures[] $VALUES;
    public static final MusicFeatures ARTIST_BIO;
    public static final MusicFeatures AUDIO_AD_CACHING;
    public static final MusicFeatures AUDIO_ARTIST_ALBUM_BANNER;
    public static final MusicFeatures AUDIO_ARTIST_CONCERTS;
    public static final MusicFeatures AUDIO_ARTIST_CONCERTS_CHIPS;
    public static final MusicFeatures AUDIO_ARTIST_CONCERTS_INFORMER;
    public static final MusicFeatures AUDIO_ARTIST_MERCH;
    public static final MusicFeatures AUDIO_AUTO_DOWNLOAD;
    public static final MusicFeatures AUDIO_BG_RESTRICTS_PAYWALL;
    public static final MusicFeatures AUDIO_BOOK_CHAPTER_DOWNLOAD;
    public static final MusicFeatures AUDIO_FACE_LIFTING_2_ITERATION;
    public static final MusicFeatures AUDIO_FIX_SEARCH_MUSIC_LAUNCH;
    public static final MusicFeatures AUDIO_FORCE_BUFFERING_STATE;
    public static final MusicFeatures AUDIO_GET_ALL_PLAYING_FORMATS;
    public static final MusicFeatures AUDIO_KEEP_SERVICE_IF_PAUSED;
    public static final MusicFeatures AUDIO_KIDS_MODE;
    public static final MusicFeatures AUDIO_KIDS_MODE_PLAYER_UI;
    public static final MusicFeatures AUDIO_LOUDNESS_NORMALIZATION;
    public static final MusicFeatures AUDIO_MULTI_REACTIONS;
    public static final MusicFeatures AUDIO_MY_TARGET_FORCE_AD;
    public static final MusicFeatures AUDIO_NEW_DOWNLOADED_FILTERS;
    public static final MusicFeatures AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX;
    public static final MusicFeatures AUDIO_NEW_KIDS_DOWNLOADED_SECTION;
    public static final MusicFeatures AUDIO_PAUSE_MUSIC_WITH_VPN;
    public static final MusicFeatures AUDIO_PLAYER_BUFFERING;
    public static final MusicFeatures AUDIO_PLAYER_PREFETCH_CONFIG;
    public static final MusicFeatures AUDIO_PLAYER_REDESIGN;
    public static final MusicFeatures AUDIO_PLAYER_VIDEO_BUFFERING;
    public static final MusicFeatures AUDIO_PODCAST_PAGINATION_FIX;
    public static final MusicFeatures AUDIO_QUICK_ACTIONS;
    public static final MusicFeatures AUDIO_RESTRICTION_ANALYTICS;
    public static final MusicFeatures AUDIO_REWORK_PLAYER_ADS;
    public static final MusicFeatures AUDIO_RUSTORE_SUBSCRIPTION;
    public static final MusicFeatures AUDIO_SERVICE_NO_DELAY_STOP;
    public static final MusicFeatures AUDIO_STORAGE_EVENT_REPO_ASYNC;
    public static final MusicFeatures AUDIO_SUBSCRIPTION_STORAGE;
    public static final MusicFeatures AUDIO_TRACKS_FILTERS;
    public static final MusicFeatures AUDIO_VIDEO_CARD_TRACK_NOTE;
    public static final MusicFeatures AUDIO_VIDEO_RELATED_TAB;
    public static final MusicFeatures AUDIO_VIDEO_RELATED_TRACKS;
    public static final MusicFeatures AUDIO_VIDEO_STATIC_WIDGET;
    public static final MusicFeatures AUDIO_VIDEO_TRACK_ADD;
    public static final MusicFeatures AUDIO_VKUI_SEARCH;
    public static final MusicFeatures AUDIO_VOLUME_STATS;
    public static final MusicFeatures AUTOGEN_GET_BLOCK_ITEMS;
    public static final MusicFeatures AUTOGEN_RESTRICTION_POPUP;
    public static final MusicFeatures AUTO_DOWNLOAD_GENERAL_SECTION_BANNER;
    public static final MusicFeatures CATALOG_GENERAL_SECTION_CACHE;
    public static final MusicFeatures CATALOG_MY_MUSIC_SECTION_CACHE;
    public static final MusicFeatures CATALOG_RELOAD_ON_INET;
    public static final MusicFeatures CATALOG_SINGLE_BANNER_FIX;
    public static final MusicFeatures COACHMARK_ANALYTICS;
    public static final a Companion;
    public static final MusicFeatures FG_SERVICE_TIMEOUT;
    public static final MusicFeatures INIT_AUTH_ASYNC;
    public static final MusicFeatures LATE_CATALOG_EVENTS_SUBS;
    public static final MusicFeatures NO_MEMORY_DOWNLOAD_FIX;
    public static final MusicFeatures OFFLINE_PENDING_UI;
    public static final MusicFeatures ONBOARDING_COACHMARK;
    public static final MusicFeatures ONBOARDING_MUSIC;
    public static final MusicFeatures PLAYER_REFACTORING;
    public static final MusicFeatures PODCAST_EPISODE_DOWNLOAD;
    public static final MusicFeatures SAVING_PLAYER_STATE;
    public static final MusicFeatures SUBSCRIPTION_NAV_SCREENS;
    public static final MusicFeatures VK_MIX_ANIMATION;
    private final String key;

    /* compiled from: MusicFeatures.kt */
    public static final class a {
        public static ArrayList a() {
            List l = e43.l(MusicFeatures.AUDIO_FACE_LIFTING_2_ITERATION, MusicFeatures.ARTIST_BIO, MusicFeatures.AUDIO_ARTIST_ALBUM_BANNER);
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            ArrayList arrayList = new ArrayList();
            Iterator it = l.iterator();
            while (it.hasNext()) {
                b.d i = bVar.i((b.a) it.next());
                if (i != null) {
                    arrayList.add(i);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: MusicFeatures.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicFeatures.values().length];
            try {
                iArr[MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicFeatures.PODCAST_EPISODE_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicFeatures.AUDIO_LOUDNESS_NORMALIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MusicFeatures musicFeatures = new MusicFeatures("AUTOGEN_RESTRICTION_POPUP", 0, "audio_autogen_restrict_popup");
        AUTOGEN_RESTRICTION_POPUP = musicFeatures;
        MusicFeatures musicFeatures2 = new MusicFeatures("PLAYER_REFACTORING", 1, "audio_player_refactoring");
        PLAYER_REFACTORING = musicFeatures2;
        MusicFeatures musicFeatures3 = new MusicFeatures("ONBOARDING_COACHMARK", 2, "audio_onboarding_coachmark");
        ONBOARDING_COACHMARK = musicFeatures3;
        MusicFeatures musicFeatures4 = new MusicFeatures("OFFLINE_PENDING_UI", 3, "audio_offline_pending_ui");
        OFFLINE_PENDING_UI = musicFeatures4;
        MusicFeatures musicFeatures5 = new MusicFeatures("NO_MEMORY_DOWNLOAD_FIX", 4, "audio_no_memory_download_fix");
        NO_MEMORY_DOWNLOAD_FIX = musicFeatures5;
        MusicFeatures musicFeatures6 = new MusicFeatures("ONBOARDING_MUSIC", 5, "audio_onboarding");
        ONBOARDING_MUSIC = musicFeatures6;
        MusicFeatures musicFeatures7 = new MusicFeatures("SUBSCRIPTION_NAV_SCREENS", 6, "audio_subscription_nav_screens");
        SUBSCRIPTION_NAV_SCREENS = musicFeatures7;
        MusicFeatures musicFeatures8 = new MusicFeatures("AUDIO_BOOK_CHAPTER_DOWNLOAD", 7, "audio_book_chapter_download");
        AUDIO_BOOK_CHAPTER_DOWNLOAD = musicFeatures8;
        MusicFeatures musicFeatures9 = new MusicFeatures("PODCAST_EPISODE_DOWNLOAD", 8, "audio_podcast_episode_download");
        PODCAST_EPISODE_DOWNLOAD = musicFeatures9;
        MusicFeatures musicFeatures10 = new MusicFeatures("COACHMARK_ANALYTICS", 9, "audio_coachmark_analytics");
        COACHMARK_ANALYTICS = musicFeatures10;
        MusicFeatures musicFeatures11 = new MusicFeatures("VK_MIX_ANIMATION", 10, "audio_vk_mix_animation");
        VK_MIX_ANIMATION = musicFeatures11;
        MusicFeatures musicFeatures12 = new MusicFeatures("CATALOG_SINGLE_BANNER_FIX", 11, "audio_single_banner_fix");
        CATALOG_SINGLE_BANNER_FIX = musicFeatures12;
        MusicFeatures musicFeatures13 = new MusicFeatures("AUDIO_SERVICE_NO_DELAY_STOP", 12, "audio_service_no_delay_stop");
        AUDIO_SERVICE_NO_DELAY_STOP = musicFeatures13;
        MusicFeatures musicFeatures14 = new MusicFeatures("AUDIO_FORCE_BUFFERING_STATE", 13, "audio_force_buffering_state");
        AUDIO_FORCE_BUFFERING_STATE = musicFeatures14;
        MusicFeatures musicFeatures15 = new MusicFeatures("AUDIO_PLAYER_BUFFERING", 14, "audio_player_buffering");
        AUDIO_PLAYER_BUFFERING = musicFeatures15;
        MusicFeatures musicFeatures16 = new MusicFeatures("AUDIO_PLAYER_VIDEO_BUFFERING", 15, "audio_player_video_buffering");
        AUDIO_PLAYER_VIDEO_BUFFERING = musicFeatures16;
        MusicFeatures musicFeatures17 = new MusicFeatures("AUDIO_PLAYER_PREFETCH_CONFIG", 16, "audio_player_prefetch_config");
        AUDIO_PLAYER_PREFETCH_CONFIG = musicFeatures17;
        MusicFeatures musicFeatures18 = new MusicFeatures("AUDIO_AUTO_DOWNLOAD", 17, "audio_autodownload");
        AUDIO_AUTO_DOWNLOAD = musicFeatures18;
        MusicFeatures musicFeatures19 = new MusicFeatures("AUTO_DOWNLOAD_GENERAL_SECTION_BANNER", 18, "audio_autodownload_banner");
        AUTO_DOWNLOAD_GENERAL_SECTION_BANNER = musicFeatures19;
        MusicFeatures musicFeatures20 = new MusicFeatures("AUDIO_KEEP_SERVICE_IF_PAUSED", 19, "audio_keep_service_if_paused");
        AUDIO_KEEP_SERVICE_IF_PAUSED = musicFeatures20;
        MusicFeatures musicFeatures21 = new MusicFeatures("AUDIO_BG_RESTRICTS_PAYWALL", 20, "audio_bg_restricts_paywall");
        AUDIO_BG_RESTRICTS_PAYWALL = musicFeatures21;
        MusicFeatures musicFeatures22 = new MusicFeatures("AUDIO_TRACKS_FILTERS", 21, "audio_mm_tracks_filters");
        AUDIO_TRACKS_FILTERS = musicFeatures22;
        MusicFeatures musicFeatures23 = new MusicFeatures("AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX", 22, "audio_nd_tracks_duplicate_fix");
        AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX = musicFeatures23;
        MusicFeatures musicFeatures24 = new MusicFeatures("AUDIO_NEW_DOWNLOADED_FILTERS", 23, "audio_new_downloaded_filters");
        AUDIO_NEW_DOWNLOADED_FILTERS = musicFeatures24;
        MusicFeatures musicFeatures25 = new MusicFeatures("AUDIO_NEW_KIDS_DOWNLOADED_SECTION", 24, "audio_new_kids_downloaded");
        AUDIO_NEW_KIDS_DOWNLOADED_SECTION = musicFeatures25;
        MusicFeatures musicFeatures26 = new MusicFeatures("AUDIO_VIDEO_CARD_TRACK_NOTE", 25, "audio_video_card_track_note");
        AUDIO_VIDEO_CARD_TRACK_NOTE = musicFeatures26;
        MusicFeatures musicFeatures27 = new MusicFeatures("AUDIO_VIDEO_TRACK_ADD", 26, "audio_video_track_add");
        AUDIO_VIDEO_TRACK_ADD = musicFeatures27;
        MusicFeatures musicFeatures28 = new MusicFeatures("AUDIO_VIDEO_RELATED_TRACKS", 27, "audio_video_related_tracks");
        AUDIO_VIDEO_RELATED_TRACKS = musicFeatures28;
        MusicFeatures musicFeatures29 = new MusicFeatures("AUDIO_VIDEO_RELATED_TAB", 28, "audio_video_related_tab");
        AUDIO_VIDEO_RELATED_TAB = musicFeatures29;
        MusicFeatures musicFeatures30 = new MusicFeatures("AUDIO_VIDEO_STATIC_WIDGET", 29, "audio_video_static_widget");
        AUDIO_VIDEO_STATIC_WIDGET = musicFeatures30;
        MusicFeatures musicFeatures31 = new MusicFeatures("SAVING_PLAYER_STATE", 30, "audio_saving_player_state");
        SAVING_PLAYER_STATE = musicFeatures31;
        MusicFeatures musicFeatures32 = new MusicFeatures("AUTOGEN_GET_BLOCK_ITEMS", 31, "audio_autogen_get_block_items");
        AUTOGEN_GET_BLOCK_ITEMS = musicFeatures32;
        MusicFeatures musicFeatures33 = new MusicFeatures("AUDIO_MULTI_REACTIONS", 32, "audio_multi_reactions");
        AUDIO_MULTI_REACTIONS = musicFeatures33;
        MusicFeatures musicFeatures34 = new MusicFeatures("AUDIO_KIDS_MODE_PLAYER_UI", 33, "audio_kids_mode_player_ui");
        AUDIO_KIDS_MODE_PLAYER_UI = musicFeatures34;
        MusicFeatures musicFeatures35 = new MusicFeatures("AUDIO_KIDS_MODE", 34, "audio_kids_mode");
        AUDIO_KIDS_MODE = musicFeatures35;
        MusicFeatures musicFeatures36 = new MusicFeatures("AUDIO_REWORK_PLAYER_ADS", 35, "audio_rework_player_ads");
        AUDIO_REWORK_PLAYER_ADS = musicFeatures36;
        MusicFeatures musicFeatures37 = new MusicFeatures("FG_SERVICE_TIMEOUT", 36, "audio_fg_service_timeout_fix");
        FG_SERVICE_TIMEOUT = musicFeatures37;
        MusicFeatures musicFeatures38 = new MusicFeatures("AUDIO_MY_TARGET_FORCE_AD", 37, "audio_my_target_force_ad");
        AUDIO_MY_TARGET_FORCE_AD = musicFeatures38;
        MusicFeatures musicFeatures39 = new MusicFeatures("AUDIO_ARTIST_CONCERTS", 38, "audio_artist_concerts");
        AUDIO_ARTIST_CONCERTS = musicFeatures39;
        MusicFeatures musicFeatures40 = new MusicFeatures("AUDIO_LOUDNESS_NORMALIZATION", 39, "audio_loudness_normalization");
        AUDIO_LOUDNESS_NORMALIZATION = musicFeatures40;
        MusicFeatures musicFeatures41 = new MusicFeatures("AUDIO_ARTIST_CONCERTS_INFORMER", 40, "audio_artist_concerts_informer");
        AUDIO_ARTIST_CONCERTS_INFORMER = musicFeatures41;
        MusicFeatures musicFeatures42 = new MusicFeatures("AUDIO_ARTIST_CONCERTS_CHIPS", 41, "audio_artist_concerts_chips");
        AUDIO_ARTIST_CONCERTS_CHIPS = musicFeatures42;
        MusicFeatures musicFeatures43 = new MusicFeatures("AUDIO_VOLUME_STATS", 42, "audio_volume_stats");
        AUDIO_VOLUME_STATS = musicFeatures43;
        MusicFeatures musicFeatures44 = new MusicFeatures("INIT_AUTH_ASYNC", 43, "audio_init_auth_async");
        INIT_AUTH_ASYNC = musicFeatures44;
        MusicFeatures musicFeatures45 = new MusicFeatures("LATE_CATALOG_EVENTS_SUBS", 44, "audio_late_catalog_events_subs");
        LATE_CATALOG_EVENTS_SUBS = musicFeatures45;
        MusicFeatures musicFeatures46 = new MusicFeatures("CATALOG_GENERAL_SECTION_CACHE", 45, "audio_general_section_cache");
        CATALOG_GENERAL_SECTION_CACHE = musicFeatures46;
        MusicFeatures musicFeatures47 = new MusicFeatures("CATALOG_MY_MUSIC_SECTION_CACHE", 46, "audio_my_music_section_cache");
        CATALOG_MY_MUSIC_SECTION_CACHE = musicFeatures47;
        MusicFeatures musicFeatures48 = new MusicFeatures("ARTIST_BIO", 47, "ctlg_artist_bio");
        ARTIST_BIO = musicFeatures48;
        MusicFeatures musicFeatures49 = new MusicFeatures("CATALOG_RELOAD_ON_INET", 48, "audio_catalog_reload_on_inet");
        CATALOG_RELOAD_ON_INET = musicFeatures49;
        MusicFeatures musicFeatures50 = new MusicFeatures("AUDIO_PAUSE_MUSIC_WITH_VPN", 49, "audio_pause_music_with_vpn");
        AUDIO_PAUSE_MUSIC_WITH_VPN = musicFeatures50;
        MusicFeatures musicFeatures51 = new MusicFeatures("AUDIO_RUSTORE_SUBSCRIPTION", 50, "audio_rustore_subscription");
        AUDIO_RUSTORE_SUBSCRIPTION = musicFeatures51;
        MusicFeatures musicFeatures52 = new MusicFeatures("AUDIO_STORAGE_EVENT_REPO_ASYNC", 51, "audio_storage_event_repo_async");
        AUDIO_STORAGE_EVENT_REPO_ASYNC = musicFeatures52;
        MusicFeatures musicFeatures53 = new MusicFeatures("AUDIO_FIX_SEARCH_MUSIC_LAUNCH", 52, "audio_fix_search_music_launch");
        AUDIO_FIX_SEARCH_MUSIC_LAUNCH = musicFeatures53;
        MusicFeatures musicFeatures54 = new MusicFeatures("AUDIO_VKUI_SEARCH", 53, "audio_vkui_search");
        AUDIO_VKUI_SEARCH = musicFeatures54;
        MusicFeatures musicFeatures55 = new MusicFeatures("AUDIO_FACE_LIFTING_2_ITERATION", 54, "ctlg_audio_facelifting_2_iter");
        AUDIO_FACE_LIFTING_2_ITERATION = musicFeatures55;
        MusicFeatures musicFeatures56 = new MusicFeatures("AUDIO_AD_CACHING", 55, "audio_ad_caching");
        AUDIO_AD_CACHING = musicFeatures56;
        MusicFeatures musicFeatures57 = new MusicFeatures("AUDIO_RESTRICTION_ANALYTICS", 56, "audio_restriction_analytics");
        AUDIO_RESTRICTION_ANALYTICS = musicFeatures57;
        MusicFeatures musicFeatures58 = new MusicFeatures("AUDIO_ARTIST_ALBUM_BANNER", 57, "audio_artist_album_banner");
        AUDIO_ARTIST_ALBUM_BANNER = musicFeatures58;
        MusicFeatures musicFeatures59 = new MusicFeatures("AUDIO_PODCAST_PAGINATION_FIX", 58, "audio_podcast_pagination_fix");
        AUDIO_PODCAST_PAGINATION_FIX = musicFeatures59;
        MusicFeatures musicFeatures60 = new MusicFeatures("AUDIO_GET_ALL_PLAYING_FORMATS", 59, "audio_get_all_playing_formats");
        AUDIO_GET_ALL_PLAYING_FORMATS = musicFeatures60;
        MusicFeatures musicFeatures61 = new MusicFeatures("AUDIO_SUBSCRIPTION_STORAGE", 60, "audio_subscription_storage");
        AUDIO_SUBSCRIPTION_STORAGE = musicFeatures61;
        MusicFeatures musicFeatures62 = new MusicFeatures("AUDIO_ARTIST_MERCH", 61, "audio_artist_merch_standalone");
        AUDIO_ARTIST_MERCH = musicFeatures62;
        MusicFeatures musicFeatures63 = new MusicFeatures("AUDIO_QUICK_ACTIONS", 62, "audio_quick_actions");
        AUDIO_QUICK_ACTIONS = musicFeatures63;
        MusicFeatures musicFeatures64 = new MusicFeatures("AUDIO_PLAYER_REDESIGN", 63, "audio_player_redesign");
        AUDIO_PLAYER_REDESIGN = musicFeatures64;
        MusicFeatures[] musicFeaturesArr = {musicFeatures, musicFeatures2, musicFeatures3, musicFeatures4, musicFeatures5, musicFeatures6, musicFeatures7, musicFeatures8, musicFeatures9, musicFeatures10, musicFeatures11, musicFeatures12, musicFeatures13, musicFeatures14, musicFeatures15, musicFeatures16, musicFeatures17, musicFeatures18, musicFeatures19, musicFeatures20, musicFeatures21, musicFeatures22, musicFeatures23, musicFeatures24, musicFeatures25, musicFeatures26, musicFeatures27, musicFeatures28, musicFeatures29, musicFeatures30, musicFeatures31, musicFeatures32, musicFeatures33, musicFeatures34, musicFeatures35, musicFeatures36, musicFeatures37, musicFeatures38, musicFeatures39, musicFeatures40, musicFeatures41, musicFeatures42, musicFeatures43, musicFeatures44, musicFeatures45, musicFeatures46, musicFeatures47, musicFeatures48, musicFeatures49, musicFeatures50, musicFeatures51, musicFeatures52, musicFeatures53, musicFeatures54, musicFeatures55, musicFeatures56, musicFeatures57, musicFeatures58, musicFeatures59, musicFeatures60, musicFeatures61, musicFeatures62, musicFeatures63, musicFeatures64};
        $VALUES = musicFeaturesArr;
        $ENTRIES = new asp(musicFeaturesArr);
        Companion = new a();
    }

    public MusicFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<MusicFeatures> i() {
        return $ENTRIES;
    }

    public static MusicFeatures valueOf(String str) {
        return (MusicFeatures) Enum.valueOf(MusicFeatures.class, str);
    }

    public static MusicFeatures[] values() {
        return (MusicFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        return (i == 1 || i == 2) ? com.vk.toggle.b.A.a(this) : i != 3 ? com.vk.toggle.b.A.a(this) : com.vk.toggle.b.A.a(this);
    }
}
