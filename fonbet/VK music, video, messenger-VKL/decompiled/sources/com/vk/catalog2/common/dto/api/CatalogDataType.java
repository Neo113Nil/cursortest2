package com.vk.catalog2.common.dto.api;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogDataType.kt */
/* loaded from: classes16.dex */
public final class CatalogDataType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogDataType[] $VALUES;
    public static final a Companion;
    public static final CatalogDataType DATA_SYNTHETIC_CATALOG;
    public static final CatalogDataType DATA_SYNTHETIC_LOADING;
    public static final CatalogDataType DATA_SYNTHETIC_SECTION;
    public static final CatalogDataType DATA_SYNTHETIC_SHOW_ALL;
    public static final CatalogDataType DATA_TYPE_ACTION;
    public static final CatalogDataType DATA_TYPE_AD_BLOCKS;
    public static final CatalogDataType DATA_TYPE_AI_ASSISTANTS;
    public static final CatalogDataType DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS;
    public static final CatalogDataType DATA_TYPE_ARTIST;
    public static final CatalogDataType DATA_TYPE_ARTIST_VIDEOS;
    public static final CatalogDataType DATA_TYPE_AUDIOBOOKS;
    public static final CatalogDataType DATA_TYPE_AUDIOBOOKS_PERSONS;
    public static final CatalogDataType DATA_TYPE_AUDIO_CONTENT_CARDS;
    public static final CatalogDataType DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO;
    public static final CatalogDataType DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM;
    public static final CatalogDataType DATA_TYPE_AUDIO_SEARCH_RECENTS;
    public static final CatalogDataType DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO;
    public static final CatalogDataType DATA_TYPE_AUDIO_STREAM_MIXES;
    public static final CatalogDataType DATA_TYPE_CATALOG_AD_BLOCKS;
    public static final CatalogDataType DATA_TYPE_CATALOG_BANNERS;
    public static final CatalogDataType DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE;
    public static final CatalogDataType DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED;
    public static final CatalogDataType DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE;
    public static final CatalogDataType DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED;
    public static final CatalogDataType DATA_TYPE_CATALOG_CLASSIFIEDS_CITIES;
    public static final CatalogDataType DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS;
    public static final CatalogDataType DATA_TYPE_CATALOG_MARKET_ITEMS;
    public static final CatalogDataType DATA_TYPE_CATALOG_NAVIGATION_TABS;
    public static final CatalogDataType DATA_TYPE_CATALOG_USERS;
    public static final CatalogDataType DATA_TYPE_CHANNELS;
    public static final CatalogDataType DATA_TYPE_CLIP_DRAFTS;
    public static final CatalogDataType DATA_TYPE_CONCERTS;
    public static final CatalogDataType DATA_TYPE_CURATOR;
    public static final CatalogDataType DATA_TYPE_DND_ACTION;
    public static final CatalogDataType DATA_TYPE_EMPTY;
    public static final CatalogDataType DATA_TYPE_EXTENDED_PODCASTS;
    public static final CatalogDataType DATA_TYPE_FAVORITES;
    public static final CatalogDataType DATA_TYPE_FEEDBACKS;
    public static final CatalogDataType DATA_TYPE_FRIENDS_LIKES;
    public static final CatalogDataType DATA_TYPE_FRIENDS_LIKE_EPISODE;
    public static final CatalogDataType DATA_TYPE_GAMES;
    public static final CatalogDataType DATA_TYPE_GROUPS;
    public static final CatalogDataType DATA_TYPE_GROUPS_CATEGORY_ITEMS;
    public static final CatalogDataType DATA_TYPE_GROUPS_CHATS;
    public static final CatalogDataType DATA_TYPE_GROUPS_COLLECTION;
    public static final CatalogDataType DATA_TYPE_GROUPS_INVITES;
    public static final CatalogDataType DATA_TYPE_GROUPS_ITEMS;
    public static final CatalogDataType DATA_TYPE_GROUP_BANNERS;
    public static final CatalogDataType DATA_TYPE_LINKS;
    public static final CatalogDataType DATA_TYPE_LIVE_CATEGORY;
    public static final CatalogDataType DATA_TYPE_LONGREADS;
    public static final CatalogDataType DATA_TYPE_MARKET_INFO;
    public static final CatalogDataType DATA_TYPE_MINIAPPS;
    public static final CatalogDataType DATA_TYPE_MINI_APPS_CONTENT;
    public static final CatalogDataType DATA_TYPE_MOVIES;
    public static final CatalogDataType DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF;
    public static final CatalogDataType DATA_TYPE_MUSIC_OWNERS;
    public static final CatalogDataType DATA_TYPE_MUSIC_PLAYLISTS;
    public static final CatalogDataType DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS;
    public static final CatalogDataType DATA_TYPE_MUSIC_SEARCH_SUGGESTION;
    public static final CatalogDataType DATA_TYPE_MUSIC_SPECIAL;
    public static final CatalogDataType DATA_TYPE_MUSIC_TRACKS;
    public static final CatalogDataType DATA_TYPE_NONE;
    public static final CatalogDataType DATA_TYPE_OFFLINE_PODCASTS;

    @ozl
    public static final CatalogDataType DATA_TYPE_OWNERS;
    public static final CatalogDataType DATA_TYPE_PLACEHOLDER;
    public static final CatalogDataType DATA_TYPE_PODCASTS;
    public static final CatalogDataType DATA_TYPE_PODCAST_EPISODES;
    public static final CatalogDataType DATA_TYPE_PODCAST_SLIDER_ITEMS;
    public static final CatalogDataType DATA_TYPE_RADIO_STATIONS;
    public static final CatalogDataType DATA_TYPE_RECENT_BUSINESSES;
    public static final CatalogDataType DATA_TYPE_SEARCH_AUTHORS;
    public static final CatalogDataType DATA_TYPE_SEARCH_ENTITY_ITEMS;
    public static final CatalogDataType DATA_TYPE_SEARCH_FILTERS;
    public static final CatalogDataType DATA_TYPE_SEARCH_NEWSFEED;
    public static final CatalogDataType DATA_TYPE_SEARCH_SPELLCHECKER;
    public static final CatalogDataType DATA_TYPE_SEARCH_SUGGESTION;
    public static final CatalogDataType DATA_TYPE_SEARCH_WALL_ITEMS;
    public static final CatalogDataType DATA_TYPE_SHORT_VIDEO_AUDIOS;
    public static final CatalogDataType DATA_TYPE_SPORTS_MATCHES_CURRENT;
    public static final CatalogDataType DATA_TYPE_SPORTS_MATCHES_UPCOMING;
    public static final CatalogDataType DATA_TYPE_STICKERS;
    public static final CatalogDataType DATA_TYPE_STICKERS_BANNERS;
    public static final CatalogDataType DATA_TYPE_STICKERS_INFO;
    public static final CatalogDataType DATA_TYPE_STICKER_PACKS;
    public static final CatalogDataType DATA_TYPE_TEXTS;
    public static final CatalogDataType DATA_TYPE_VIDEO_ALBUMS;
    public static final CatalogDataType DATA_TYPE_VIDEO_CATALOG_VIDEOS;
    public static final CatalogDataType DATA_TYPE_VIDEO_TOPSHELF;
    public static final CatalogDataType DATA_TYPE_VIDEO_VIDEOS;
    public static final CatalogDataType DATA_TYPE_WALL;
    public static final CatalogDataType DELAYED_LOADING_VIDEOS;
    public static final CatalogDataType DRAFTS_LOADING_VIDEOS;
    public static final CatalogDataType PUBLISH_LOADING_VIDEOS;
    public static final CatalogDataType UNKNOWN;
    private final String id;

    /* compiled from: CatalogDataType.kt */
    public static final class a {
    }

    /* compiled from: CatalogDataType.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_CATALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CatalogDataType catalogDataType = new CatalogDataType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
        UNKNOWN = catalogDataType;
        CatalogDataType catalogDataType2 = new CatalogDataType("DATA_TYPE_LINKS", 1, "links");
        DATA_TYPE_LINKS = catalogDataType2;
        CatalogDataType catalogDataType3 = new CatalogDataType("DATA_TYPE_MINIAPPS", 2, "mini_apps");
        DATA_TYPE_MINIAPPS = catalogDataType3;
        CatalogDataType catalogDataType4 = new CatalogDataType("DATA_TYPE_ACTION", 3, "action");
        DATA_TYPE_ACTION = catalogDataType4;
        CatalogDataType catalogDataType5 = new CatalogDataType("DATA_TYPE_DND_ACTION", 4, "drag_and_drop_action");
        DATA_TYPE_DND_ACTION = catalogDataType5;
        CatalogDataType catalogDataType6 = new CatalogDataType("DATA_TYPE_MUSIC_SEARCH_SUGGESTION", 5, "search_suggestions");
        DATA_TYPE_MUSIC_SEARCH_SUGGESTION = catalogDataType6;
        CatalogDataType catalogDataType7 = new CatalogDataType("DATA_TYPE_SEARCH_SUGGESTION", 6, "catalog_search_suggestion");
        DATA_TYPE_SEARCH_SUGGESTION = catalogDataType7;
        CatalogDataType catalogDataType8 = new CatalogDataType("DATA_TYPE_VIDEO_ALBUMS", 7, "albums");
        DATA_TYPE_VIDEO_ALBUMS = catalogDataType8;
        CatalogDataType catalogDataType9 = new CatalogDataType("DATA_TYPE_VIDEO_VIDEOS", 8, "videos");
        DATA_TYPE_VIDEO_VIDEOS = catalogDataType9;
        CatalogDataType catalogDataType10 = new CatalogDataType("DATA_TYPE_VIDEO_CATALOG_VIDEOS", 9, "catalog_videos");
        DATA_TYPE_VIDEO_CATALOG_VIDEOS = catalogDataType10;
        CatalogDataType catalogDataType11 = new CatalogDataType("DATA_TYPE_VIDEO_TOPSHELF", 10, "topshelf_items");
        DATA_TYPE_VIDEO_TOPSHELF = catalogDataType11;
        CatalogDataType catalogDataType12 = new CatalogDataType("DATA_TYPE_AI_ASSISTANTS", 11, "ai_assistants");
        DATA_TYPE_AI_ASSISTANTS = catalogDataType12;
        CatalogDataType catalogDataType13 = new CatalogDataType("DATA_TYPE_NONE", 12, "none");
        DATA_TYPE_NONE = catalogDataType13;
        CatalogDataType catalogDataType14 = new CatalogDataType("DATA_TYPE_EMPTY", 13, "empty");
        DATA_TYPE_EMPTY = catalogDataType14;
        CatalogDataType catalogDataType15 = new CatalogDataType("DATA_TYPE_MUSIC_TRACKS", 14, "music_audios");
        DATA_TYPE_MUSIC_TRACKS = catalogDataType15;
        CatalogDataType catalogDataType16 = new CatalogDataType("DATA_TYPE_MUSIC_PLAYLISTS", 15, "music_playlists");
        DATA_TYPE_MUSIC_PLAYLISTS = catalogDataType16;
        CatalogDataType catalogDataType17 = new CatalogDataType("DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS", 16, "music_recommended_playlists");
        DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS = catalogDataType17;
        CatalogDataType catalogDataType18 = new CatalogDataType("DATA_TYPE_AUDIO_CONTENT_CARDS", 17, "audio_content_cards");
        DATA_TYPE_AUDIO_CONTENT_CARDS = catalogDataType18;
        CatalogDataType catalogDataType19 = new CatalogDataType("DATA_TYPE_GROUPS", 18, "groups");
        DATA_TYPE_GROUPS = catalogDataType19;
        CatalogDataType catalogDataType20 = new CatalogDataType("DATA_TYPE_GROUPS_INVITES", 19, "groups_invites");
        DATA_TYPE_GROUPS_INVITES = catalogDataType20;
        CatalogDataType catalogDataType21 = new CatalogDataType("DATA_TYPE_CATALOG_USERS", 20, "catalog_users");
        DATA_TYPE_CATALOG_USERS = catalogDataType21;
        CatalogDataType catalogDataType22 = new CatalogDataType("DATA_TYPE_ARTIST_VIDEOS", 21, "artist_videos");
        DATA_TYPE_ARTIST_VIDEOS = catalogDataType22;
        CatalogDataType catalogDataType23 = new CatalogDataType("DATA_TYPE_ARTIST", 22, "artist");
        DATA_TYPE_ARTIST = catalogDataType23;
        CatalogDataType catalogDataType24 = new CatalogDataType("DATA_TYPE_STICKERS_BANNERS", 23, "stickers_banners");
        DATA_TYPE_STICKERS_BANNERS = catalogDataType24;
        CatalogDataType catalogDataType25 = new CatalogDataType("DATA_TYPE_STICKERS_INFO", 24, "stickers_info");
        DATA_TYPE_STICKERS_INFO = catalogDataType25;
        CatalogDataType catalogDataType26 = new CatalogDataType("DATA_TYPE_STICKER_PACKS", 25, "stickers_packs");
        DATA_TYPE_STICKER_PACKS = catalogDataType26;
        CatalogDataType catalogDataType27 = new CatalogDataType("DATA_TYPE_STICKERS", 26, "stickers");
        DATA_TYPE_STICKERS = catalogDataType27;
        CatalogDataType catalogDataType28 = new CatalogDataType("DATA_TYPE_MUSIC_SPECIAL", 27, "music_special");
        DATA_TYPE_MUSIC_SPECIAL = catalogDataType28;
        CatalogDataType catalogDataType29 = new CatalogDataType("DATA_TYPE_GROUPS_CHATS", 28, "groups_chats");
        DATA_TYPE_GROUPS_CHATS = catalogDataType29;
        CatalogDataType catalogDataType30 = new CatalogDataType("DATA_TYPE_FRIENDS_LIKES", 29, "groups_friends_likes");
        DATA_TYPE_FRIENDS_LIKES = catalogDataType30;
        CatalogDataType catalogDataType31 = new CatalogDataType("DATA_TYPE_RECENT_BUSINESSES", 30, "recent_businesses");
        DATA_TYPE_RECENT_BUSINESSES = catalogDataType31;
        CatalogDataType catalogDataType32 = new CatalogDataType("DATA_TYPE_PODCASTS", 31, "podcasts");
        DATA_TYPE_PODCASTS = catalogDataType32;
        CatalogDataType catalogDataType33 = new CatalogDataType("DATA_TYPE_OFFLINE_PODCASTS", 32, "offline_podcasts");
        DATA_TYPE_OFFLINE_PODCASTS = catalogDataType33;
        CatalogDataType catalogDataType34 = new CatalogDataType("DATA_TYPE_PODCAST_EPISODES", 33, "podcast_episodes");
        DATA_TYPE_PODCAST_EPISODES = catalogDataType34;
        CatalogDataType catalogDataType35 = new CatalogDataType("DATA_TYPE_PODCAST_SLIDER_ITEMS", 34, "podcast_slider_items");
        DATA_TYPE_PODCAST_SLIDER_ITEMS = catalogDataType35;
        CatalogDataType catalogDataType36 = new CatalogDataType("DATA_TYPE_EXTENDED_PODCASTS", 35, "extended_podcasts");
        DATA_TYPE_EXTENDED_PODCASTS = catalogDataType36;
        CatalogDataType catalogDataType37 = new CatalogDataType("DATA_TYPE_FRIENDS_LIKE_EPISODE", 36, "friends_liked_episodes");
        DATA_TYPE_FRIENDS_LIKE_EPISODE = catalogDataType37;
        CatalogDataType catalogDataType38 = new CatalogDataType("DATA_TYPE_LONGREADS", 37, "longreads");
        DATA_TYPE_LONGREADS = catalogDataType38;
        CatalogDataType catalogDataType39 = new CatalogDataType("DATA_TYPE_GROUPS_ITEMS", 38, "groups_items");
        DATA_TYPE_GROUPS_ITEMS = catalogDataType39;
        CatalogDataType catalogDataType40 = new CatalogDataType("DATA_TYPE_GROUP_BANNERS", 39, "groups_banner_items");
        DATA_TYPE_GROUP_BANNERS = catalogDataType40;
        CatalogDataType catalogDataType41 = new CatalogDataType("DATA_TYPE_GROUPS_COLLECTION", 40, "groups_collection");
        DATA_TYPE_GROUPS_COLLECTION = catalogDataType41;
        CatalogDataType catalogDataType42 = new CatalogDataType("DATA_TYPE_GROUPS_CATEGORY_ITEMS", 41, "groups_category_items");
        DATA_TYPE_GROUPS_CATEGORY_ITEMS = catalogDataType42;
        CatalogDataType catalogDataType43 = new CatalogDataType("DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS", 42, "groups_all_groups_or_recommendations");
        DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS = catalogDataType43;
        CatalogDataType catalogDataType44 = new CatalogDataType("DATA_TYPE_FAVORITES", 43, "favorites");
        DATA_TYPE_FAVORITES = catalogDataType44;
        CatalogDataType catalogDataType45 = new CatalogDataType("DATA_TYPE_AUDIOBOOKS", 44, "audio_books");
        DATA_TYPE_AUDIOBOOKS = catalogDataType45;
        CatalogDataType catalogDataType46 = new CatalogDataType("DATA_TYPE_AUDIOBOOKS_PERSONS", 45, "audio_books_persons");
        DATA_TYPE_AUDIOBOOKS_PERSONS = catalogDataType46;
        CatalogDataType catalogDataType47 = new CatalogDataType("DATA_TYPE_CONCERTS", 46, "concerts");
        DATA_TYPE_CONCERTS = catalogDataType47;
        CatalogDataType catalogDataType48 = new CatalogDataType("DATA_TYPE_CURATOR", 47, "curator");
        DATA_TYPE_CURATOR = catalogDataType48;
        CatalogDataType catalogDataType49 = new CatalogDataType("DATA_TYPE_TEXTS", 48, "texts");
        DATA_TYPE_TEXTS = catalogDataType49;
        CatalogDataType catalogDataType50 = new CatalogDataType("DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS", 49, "groups_info_items");
        DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS = catalogDataType50;
        CatalogDataType catalogDataType51 = new CatalogDataType("DATA_TYPE_CATALOG_MARKET_ITEMS", 50, "market_items");
        DATA_TYPE_CATALOG_MARKET_ITEMS = catalogDataType51;
        CatalogDataType catalogDataType52 = new CatalogDataType("DATA_TYPE_CATALOG_NAVIGATION_TABS", 51, "navigation_tabs");
        DATA_TYPE_CATALOG_NAVIGATION_TABS = catalogDataType52;
        CatalogDataType catalogDataType53 = new CatalogDataType("DATA_TYPE_CATALOG_CLASSIFIEDS_CITIES", 52, "classifieds_cities");
        DATA_TYPE_CATALOG_CLASSIFIEDS_CITIES = catalogDataType53;
        CatalogDataType catalogDataType54 = new CatalogDataType("DATA_TYPE_MARKET_INFO", 53, "market_info");
        DATA_TYPE_MARKET_INFO = catalogDataType54;
        CatalogDataType catalogDataType55 = new CatalogDataType("DATA_TYPE_SHORT_VIDEO_AUDIOS", 54, "short_video_audios");
        DATA_TYPE_SHORT_VIDEO_AUDIOS = catalogDataType55;
        CatalogDataType catalogDataType56 = new CatalogDataType("DATA_SYNTHETIC_SECTION", 55, "__synthetic_section__");
        DATA_SYNTHETIC_SECTION = catalogDataType56;
        CatalogDataType catalogDataType57 = new CatalogDataType("DATA_SYNTHETIC_SHOW_ALL", 56, "__data_synthetic_show_all__");
        DATA_SYNTHETIC_SHOW_ALL = catalogDataType57;
        CatalogDataType catalogDataType58 = new CatalogDataType("DATA_SYNTHETIC_CATALOG", 57, "__synthetic_catalog__");
        DATA_SYNTHETIC_CATALOG = catalogDataType58;
        CatalogDataType catalogDataType59 = new CatalogDataType("DATA_SYNTHETIC_LOADING", 58, "__synthetic_loading__");
        DATA_SYNTHETIC_LOADING = catalogDataType59;
        CatalogDataType catalogDataType60 = new CatalogDataType("DATA_TYPE_PLACEHOLDER", 59, "placeholder");
        DATA_TYPE_PLACEHOLDER = catalogDataType60;
        CatalogDataType catalogDataType61 = new CatalogDataType("DATA_TYPE_CATALOG_BANNERS", 60, "catalog_banners");
        DATA_TYPE_CATALOG_BANNERS = catalogDataType61;
        CatalogDataType catalogDataType62 = new CatalogDataType("DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED", 61, "__synthetic_catalog_banners_small__");
        DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED = catalogDataType62;
        CatalogDataType catalogDataType63 = new CatalogDataType("DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE", 62, "__synthetic_catalog_banners_big__");
        DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE = catalogDataType63;
        CatalogDataType catalogDataType64 = new CatalogDataType("DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED", 63, "__synthetic_catalog_banners_background__");
        DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED = catalogDataType64;
        CatalogDataType catalogDataType65 = new CatalogDataType("DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE", 64, "__synthetic_catalog_banners_rounded_small_image__");
        DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE = catalogDataType65;
        CatalogDataType catalogDataType66 = new CatalogDataType("DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO", 65, "audio_followings_update_info");
        DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO = catalogDataType66;
        CatalogDataType catalogDataType67 = new CatalogDataType("DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM", 66, "audio_followings_update_item");
        DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM = catalogDataType67;
        CatalogDataType catalogDataType68 = new CatalogDataType("DATA_TYPE_MUSIC_OWNERS", 67, "music_owners");
        DATA_TYPE_MUSIC_OWNERS = catalogDataType68;
        CatalogDataType catalogDataType69 = new CatalogDataType("DATA_TYPE_AUDIO_STREAM_MIXES", 68, "audio_stream_mixes");
        DATA_TYPE_AUDIO_STREAM_MIXES = catalogDataType69;
        CatalogDataType catalogDataType70 = new CatalogDataType("DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO", 69, "audio_signal_common_info");
        DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO = catalogDataType70;
        CatalogDataType catalogDataType71 = new CatalogDataType("DATA_TYPE_RADIO_STATIONS", 70, "radiostations");
        DATA_TYPE_RADIO_STATIONS = catalogDataType71;
        CatalogDataType catalogDataType72 = new CatalogDataType("DATA_TYPE_OWNERS", 71, "owners");
        DATA_TYPE_OWNERS = catalogDataType72;
        CatalogDataType catalogDataType73 = new CatalogDataType("DATA_TYPE_SEARCH_AUTHORS", 72, "search_authors");
        DATA_TYPE_SEARCH_AUTHORS = catalogDataType73;
        CatalogDataType catalogDataType74 = new CatalogDataType("DATA_TYPE_SEARCH_SPELLCHECKER", 73, "search_spellchecker");
        DATA_TYPE_SEARCH_SPELLCHECKER = catalogDataType74;
        CatalogDataType catalogDataType75 = new CatalogDataType("DATA_TYPE_GAMES", 74, "games");
        DATA_TYPE_GAMES = catalogDataType75;
        CatalogDataType catalogDataType76 = new CatalogDataType("DATA_TYPE_SEARCH_NEWSFEED", 75, "newsfeed_items");
        DATA_TYPE_SEARCH_NEWSFEED = catalogDataType76;
        CatalogDataType catalogDataType77 = new CatalogDataType("DATA_TYPE_SEARCH_WALL_ITEMS", 76, "search_wall_items");
        DATA_TYPE_SEARCH_WALL_ITEMS = catalogDataType77;
        CatalogDataType catalogDataType78 = new CatalogDataType("DATA_TYPE_WALL", 77, "wall");
        DATA_TYPE_WALL = catalogDataType78;
        CatalogDataType catalogDataType79 = new CatalogDataType("DATA_TYPE_MINI_APPS_CONTENT", 78, "mini_apps_content");
        DATA_TYPE_MINI_APPS_CONTENT = catalogDataType79;
        CatalogDataType catalogDataType80 = new CatalogDataType("DATA_TYPE_SEARCH_ENTITY_ITEMS", 79, "search_entity_items");
        DATA_TYPE_SEARCH_ENTITY_ITEMS = catalogDataType80;
        CatalogDataType catalogDataType81 = new CatalogDataType("DATA_TYPE_FEEDBACKS", 80, "feedbacks");
        DATA_TYPE_FEEDBACKS = catalogDataType81;
        CatalogDataType catalogDataType82 = new CatalogDataType("DATA_TYPE_SEARCH_FILTERS", 81, "search_filter");
        DATA_TYPE_SEARCH_FILTERS = catalogDataType82;
        CatalogDataType catalogDataType83 = new CatalogDataType("DATA_TYPE_LIVE_CATEGORY", 82, "video_showcase_vklive_categories_items");
        DATA_TYPE_LIVE_CATEGORY = catalogDataType83;
        CatalogDataType catalogDataType84 = new CatalogDataType("PUBLISH_LOADING_VIDEOS", 83, "video_uploading_published");
        PUBLISH_LOADING_VIDEOS = catalogDataType84;
        CatalogDataType catalogDataType85 = new CatalogDataType("DELAYED_LOADING_VIDEOS", 84, "video_uploading_scheduled");
        DELAYED_LOADING_VIDEOS = catalogDataType85;
        CatalogDataType catalogDataType86 = new CatalogDataType("DRAFTS_LOADING_VIDEOS", 85, "uploading_video_scheduled");
        DRAFTS_LOADING_VIDEOS = catalogDataType86;
        CatalogDataType catalogDataType87 = new CatalogDataType("DATA_TYPE_CLIP_DRAFTS", 86, "clip_drafts");
        DATA_TYPE_CLIP_DRAFTS = catalogDataType87;
        CatalogDataType catalogDataType88 = new CatalogDataType("DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF", 87, "video_music_stream_mixes");
        DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF = catalogDataType88;
        CatalogDataType catalogDataType89 = new CatalogDataType("DATA_TYPE_AD_BLOCKS", 88, "ad_blocks");
        DATA_TYPE_AD_BLOCKS = catalogDataType89;
        CatalogDataType catalogDataType90 = new CatalogDataType("DATA_TYPE_CHANNELS", 89, "community_channels");
        DATA_TYPE_CHANNELS = catalogDataType90;
        CatalogDataType catalogDataType91 = new CatalogDataType("DATA_TYPE_CATALOG_AD_BLOCKS", 90, "catalog_ad_blocks");
        DATA_TYPE_CATALOG_AD_BLOCKS = catalogDataType91;
        CatalogDataType catalogDataType92 = new CatalogDataType("DATA_TYPE_SPORTS_MATCHES_UPCOMING", 91, "vk_sports_matches_upcoming");
        DATA_TYPE_SPORTS_MATCHES_UPCOMING = catalogDataType92;
        CatalogDataType catalogDataType93 = new CatalogDataType("DATA_TYPE_SPORTS_MATCHES_CURRENT", 92, "vk_sports_matches_current");
        DATA_TYPE_SPORTS_MATCHES_CURRENT = catalogDataType93;
        CatalogDataType catalogDataType94 = new CatalogDataType("DATA_TYPE_AUDIO_SEARCH_RECENTS", 93, "audio_search_recents");
        DATA_TYPE_AUDIO_SEARCH_RECENTS = catalogDataType94;
        CatalogDataType catalogDataType95 = new CatalogDataType("DATA_TYPE_MOVIES", 94, "movies");
        DATA_TYPE_MOVIES = catalogDataType95;
        CatalogDataType[] catalogDataTypeArr = {catalogDataType, catalogDataType2, catalogDataType3, catalogDataType4, catalogDataType5, catalogDataType6, catalogDataType7, catalogDataType8, catalogDataType9, catalogDataType10, catalogDataType11, catalogDataType12, catalogDataType13, catalogDataType14, catalogDataType15, catalogDataType16, catalogDataType17, catalogDataType18, catalogDataType19, catalogDataType20, catalogDataType21, catalogDataType22, catalogDataType23, catalogDataType24, catalogDataType25, catalogDataType26, catalogDataType27, catalogDataType28, catalogDataType29, catalogDataType30, catalogDataType31, catalogDataType32, catalogDataType33, catalogDataType34, catalogDataType35, catalogDataType36, catalogDataType37, catalogDataType38, catalogDataType39, catalogDataType40, catalogDataType41, catalogDataType42, catalogDataType43, catalogDataType44, catalogDataType45, catalogDataType46, catalogDataType47, catalogDataType48, catalogDataType49, catalogDataType50, catalogDataType51, catalogDataType52, catalogDataType53, catalogDataType54, catalogDataType55, catalogDataType56, catalogDataType57, catalogDataType58, catalogDataType59, catalogDataType60, catalogDataType61, catalogDataType62, catalogDataType63, catalogDataType64, catalogDataType65, catalogDataType66, catalogDataType67, catalogDataType68, catalogDataType69, catalogDataType70, catalogDataType71, catalogDataType72, catalogDataType73, catalogDataType74, catalogDataType75, catalogDataType76, catalogDataType77, catalogDataType78, catalogDataType79, catalogDataType80, catalogDataType81, catalogDataType82, catalogDataType83, catalogDataType84, catalogDataType85, catalogDataType86, catalogDataType87, catalogDataType88, catalogDataType89, catalogDataType90, catalogDataType91, catalogDataType92, catalogDataType93, catalogDataType94, catalogDataType95};
        $VALUES = catalogDataTypeArr;
        $ENTRIES = new asp(catalogDataTypeArr);
        Companion = new a();
    }

    public CatalogDataType(String str, int i, String str2) {
        this.id = str2;
    }

    public static zrp<CatalogDataType> h() {
        return $ENTRIES;
    }

    public static CatalogDataType valueOf(String str) {
        return (CatalogDataType) Enum.valueOf(CatalogDataType.class, str);
    }

    public static CatalogDataType[] values() {
        return (CatalogDataType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    public final boolean i() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        return i == 4 || i == 5;
    }
}
