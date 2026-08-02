package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogBlockDataTypeDto.kt */
/* loaded from: classes.dex */
public final class CatalogBlockDataTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogBlockDataTypeDto[] $VALUES;

    @pmi0("abandoned_carts")
    public static final CatalogBlockDataTypeDto ABANDONED_CARTS;

    @pmi0("action")
    public static final CatalogBlockDataTypeDto ACTION;

    @pmi0("ai_assistants")
    public static final CatalogBlockDataTypeDto AI_ASSISTANTS;

    @pmi0("albums")
    public static final CatalogBlockDataTypeDto ALBUMS;

    @pmi0("artist")
    public static final CatalogBlockDataTypeDto ARTIST;

    @pmi0("artist_videos")
    public static final CatalogBlockDataTypeDto ARTIST_VIDEOS;

    @pmi0("audio_books")
    public static final CatalogBlockDataTypeDto AUDIO_BOOKS;

    @pmi0("audio_books_persons")
    public static final CatalogBlockDataTypeDto AUDIO_BOOKS_PERSONS;

    @pmi0("audio_content_cards")
    public static final CatalogBlockDataTypeDto AUDIO_CONTENT_CARDS;

    @pmi0("audio_followings_update_info")
    public static final CatalogBlockDataTypeDto AUDIO_FOLLOWINGS_UPDATE_INFO;

    @pmi0("audio_followings_update_item")
    public static final CatalogBlockDataTypeDto AUDIO_FOLLOWINGS_UPDATE_ITEM;

    @pmi0("audio_search_recents")
    public static final CatalogBlockDataTypeDto AUDIO_SEARCH_RECENTS;

    @pmi0("audio_search_suggestions")
    public static final CatalogBlockDataTypeDto AUDIO_SEARCH_SUGGESTIONS;

    @pmi0("audio_signal_common_info")
    public static final CatalogBlockDataTypeDto AUDIO_SIGNAL_COMMON_INFO;

    @pmi0("audio_stream_mixes")
    public static final CatalogBlockDataTypeDto AUDIO_STREAM_MIXES;

    @pmi0("banners")
    public static final CatalogBlockDataTypeDto BANNERS;

    @pmi0("base_links")
    public static final CatalogBlockDataTypeDto BASE_LINKS;

    @pmi0("catalog_ad_blocks")
    public static final CatalogBlockDataTypeDto CATALOG_AD_BLOCKS;

    @pmi0("catalog_banner")
    public static final CatalogBlockDataTypeDto CATALOG_BANNER;

    @pmi0("catalog_banners")
    public static final CatalogBlockDataTypeDto CATALOG_BANNERS;

    @pmi0("catalog_search_suggestion")
    public static final CatalogBlockDataTypeDto CATALOG_SEARCH_SUGGESTION;

    @pmi0("catalog_users")
    public static final CatalogBlockDataTypeDto CATALOG_USERS;

    @pmi0("catalog_videos")
    public static final CatalogBlockDataTypeDto CATALOG_VIDEOS;

    @pmi0("classifieds_category_tree")
    public static final CatalogBlockDataTypeDto CLASSIFIEDS_CATEGORY_TREE;

    @pmi0("classifieds_cities")
    public static final CatalogBlockDataTypeDto CLASSIFIEDS_CITIES;

    @pmi0("classifieds_info")
    public static final CatalogBlockDataTypeDto CLASSIFIEDS_INFO;

    @pmi0("clips")
    public static final CatalogBlockDataTypeDto CLIPS;

    @pmi0("clip_drafts")
    public static final CatalogBlockDataTypeDto CLIP_DRAFTS;

    @pmi0("community_channels")
    public static final CatalogBlockDataTypeDto COMMUNITY_CHANNELS;

    @pmi0("composite")
    public static final CatalogBlockDataTypeDto COMPOSITE;

    @pmi0("concerts")
    public static final CatalogBlockDataTypeDto CONCERTS;
    public static final Parcelable.Creator<CatalogBlockDataTypeDto> CREATOR;

    @pmi0("curator")
    public static final CatalogBlockDataTypeDto CURATOR;

    @pmi0("downloaded_videos")
    public static final CatalogBlockDataTypeDto DOWNLOADED_VIDEOS;

    @pmi0("empty")
    public static final CatalogBlockDataTypeDto EMPTY;

    @pmi0("extended_podcasts")
    public static final CatalogBlockDataTypeDto EXTENDED_PODCASTS;

    @pmi0("feedbacks")
    public static final CatalogBlockDataTypeDto FEEDBACKS;

    @pmi0("friend")
    public static final CatalogBlockDataTypeDto FRIEND;

    @pmi0("friends_liked_episodes")
    public static final CatalogBlockDataTypeDto FRIENDS_LIKED_EPISODES;

    @pmi0("games")
    public static final CatalogBlockDataTypeDto GAMES;

    @pmi0("groups")
    public static final CatalogBlockDataTypeDto GROUPS;

    @pmi0("groups_all_groups_or_recommendations")
    public static final CatalogBlockDataTypeDto GROUPS_ALL_GROUPS_OR_RECOMMENDATIONS;

    @pmi0("groups_banner_items")
    public static final CatalogBlockDataTypeDto GROUPS_BANNER_ITEMS;

    @pmi0("groups_category_items")
    public static final CatalogBlockDataTypeDto GROUPS_CATEGORY_ITEMS;

    @pmi0("groups_chats")
    public static final CatalogBlockDataTypeDto GROUPS_CHATS;

    @pmi0("groups_collection")
    public static final CatalogBlockDataTypeDto GROUPS_COLLECTION;

    @pmi0("groups_events")
    public static final CatalogBlockDataTypeDto GROUPS_EVENTS;

    @pmi0("groups_friends_likes")
    public static final CatalogBlockDataTypeDto GROUPS_FRIENDS_LIKES;

    @pmi0("groups_hidden")
    public static final CatalogBlockDataTypeDto GROUPS_HIDDEN;

    @pmi0("groups_info_items")
    public static final CatalogBlockDataTypeDto GROUPS_INFO_ITEMS;

    @pmi0("groups_invites")
    public static final CatalogBlockDataTypeDto GROUPS_INVITES;

    @pmi0("groups_items")
    public static final CatalogBlockDataTypeDto GROUPS_ITEMS;

    @pmi0("links")
    public static final CatalogBlockDataTypeDto LINKS;

    @pmi0("longreads")
    public static final CatalogBlockDataTypeDto LONGREADS;

    @pmi0("market_category_mappings")
    public static final CatalogBlockDataTypeDto MARKET_CATEGORY_MAPPINGS;

    @pmi0("market_info")
    public static final CatalogBlockDataTypeDto MARKET_INFO;

    @pmi0("market_items")
    public static final CatalogBlockDataTypeDto MARKET_ITEMS;

    @pmi0("market_orders")
    public static final CatalogBlockDataTypeDto MARKET_ORDERS;

    @pmi0("market_ratings_and_reviews")
    public static final CatalogBlockDataTypeDto MARKET_RATINGS_AND_REVIEWS;

    @pmi0("market_search_classifier_results")
    public static final CatalogBlockDataTypeDto MARKET_SEARCH_CLASSIFIER_RESULTS;

    @pmi0("market_search_query")
    public static final CatalogBlockDataTypeDto MARKET_SEARCH_QUERY;

    @pmi0("market_search_spell_checker")
    public static final CatalogBlockDataTypeDto MARKET_SEARCH_SPELL_CHECKER;

    @pmi0("market_subcategories_menu")
    public static final CatalogBlockDataTypeDto MARKET_SUBCATEGORIES_MENU;

    @pmi0("mini_apps")
    public static final CatalogBlockDataTypeDto MINI_APPS;

    @pmi0("mini_apps_content")
    public static final CatalogBlockDataTypeDto MINI_APPS_CONTENT;

    @pmi0("movies")
    public static final CatalogBlockDataTypeDto MOVIES;

    @pmi0("music_audios")
    public static final CatalogBlockDataTypeDto MUSIC_AUDIOS;

    @pmi0("music_owners")
    public static final CatalogBlockDataTypeDto MUSIC_OWNERS;

    @pmi0("music_playlists")
    public static final CatalogBlockDataTypeDto MUSIC_PLAYLISTS;

    @pmi0("music_recommended_playlists")
    public static final CatalogBlockDataTypeDto MUSIC_RECOMMENDED_PLAYLISTS;

    @pmi0("music_special")
    public static final CatalogBlockDataTypeDto MUSIC_SPECIAL;

    @pmi0("music_uxpoll_banner")
    public static final CatalogBlockDataTypeDto MUSIC_UXPOLL_BANNER;

    @pmi0("navigation_tabs")
    public static final CatalogBlockDataTypeDto NAVIGATION_TABS;

    @pmi0("newsfeed_items")
    public static final CatalogBlockDataTypeDto NEWSFEED_ITEMS;

    @pmi0("none")
    public static final CatalogBlockDataTypeDto NONE;

    @pmi0("owners")
    public static final CatalogBlockDataTypeDto OWNERS;

    @pmi0("placeholder")
    public static final CatalogBlockDataTypeDto PLACEHOLDER;

    @pmi0("podcasts")
    public static final CatalogBlockDataTypeDto PODCASTS;

    @pmi0("podcasts_slider_items")
    public static final CatalogBlockDataTypeDto PODCASTS_SLIDER_ITEMS;

    @pmi0("podcast_banners_slider")
    public static final CatalogBlockDataTypeDto PODCAST_BANNERS_SLIDER;

    @pmi0("podcast_episodes")
    public static final CatalogBlockDataTypeDto PODCAST_EPISODES;

    @pmi0("podcast_slider_items")
    public static final CatalogBlockDataTypeDto PODCAST_SLIDER_ITEMS;

    @pmi0("radiostations")
    public static final CatalogBlockDataTypeDto RADIOSTATIONS;

    @pmi0("recent_businesses")
    public static final CatalogBlockDataTypeDto RECENT_BUSINESSES;

    @pmi0("search_authors")
    public static final CatalogBlockDataTypeDto SEARCH_AUTHORS;

    @pmi0("search_entity_items")
    public static final CatalogBlockDataTypeDto SEARCH_ENTITY_ITEMS;

    @pmi0("search_filter")
    public static final CatalogBlockDataTypeDto SEARCH_FILTER;

    @pmi0("search_seo_page")
    public static final CatalogBlockDataTypeDto SEARCH_SEO_PAGE;

    @pmi0("search_spellchecker")
    public static final CatalogBlockDataTypeDto SEARCH_SPELLCHECKER;

    @pmi0("search_suggestions")
    public static final CatalogBlockDataTypeDto SEARCH_SUGGESTIONS;

    @pmi0("search_wall_items")
    public static final CatalogBlockDataTypeDto SEARCH_WALL_ITEMS;

    @pmi0("short_videos")
    public static final CatalogBlockDataTypeDto SHORT_VIDEOS;

    @pmi0("short_video_audios")
    public static final CatalogBlockDataTypeDto SHORT_VIDEO_AUDIOS;

    @pmi0("stickers")
    public static final CatalogBlockDataTypeDto STICKERS;

    @pmi0("stickers_banners")
    public static final CatalogBlockDataTypeDto STICKERS_BANNERS;

    @pmi0("stickers_info")
    public static final CatalogBlockDataTypeDto STICKERS_INFO;

    @pmi0("stickers_notification")
    public static final CatalogBlockDataTypeDto STICKERS_NOTIFICATION;

    @pmi0("stickers_packs")
    public static final CatalogBlockDataTypeDto STICKERS_PACKS;

    @pmi0("subsection_link")
    public static final CatalogBlockDataTypeDto SUBSECTION_LINK;

    @pmi0("texts")
    public static final CatalogBlockDataTypeDto TEXTS;

    @pmi0("topshelf_items")
    public static final CatalogBlockDataTypeDto TOPSHELF_ITEMS;

    @pmi0("tv_channels")
    public static final CatalogBlockDataTypeDto TV_CHANNELS;

    @pmi0("uploading_video_published")
    public static final CatalogBlockDataTypeDto UPLOADING_VIDEO_PUBLISHED;

    @pmi0("uploading_video_scheduled")
    public static final CatalogBlockDataTypeDto UPLOADING_VIDEO_SCHEDULED;

    @pmi0("videos")
    public static final CatalogBlockDataTypeDto VIDEOS;

    @pmi0("video_banners")
    public static final CatalogBlockDataTypeDto VIDEO_BANNERS;

    @pmi0("video_channels")
    public static final CatalogBlockDataTypeDto VIDEO_CHANNELS;

    @pmi0("video_music_stream_mixes")
    public static final CatalogBlockDataTypeDto VIDEO_MUSIC_STREAM_MIXES;

    @pmi0("video_showcase_galleries")
    public static final CatalogBlockDataTypeDto VIDEO_SHOWCASE_GALLERIES;

    @pmi0("video_showcase_menu_items")
    public static final CatalogBlockDataTypeDto VIDEO_SHOWCASE_MENU_ITEMS;

    @pmi0("video_showcase_vklive_categories_items")
    public static final CatalogBlockDataTypeDto VIDEO_SHOWCASE_VKLIVE_CATEGORIES_ITEMS;

    @pmi0("video_showcase_vklive_channels_items")
    public static final CatalogBlockDataTypeDto VIDEO_SHOWCASE_VKLIVE_CHANNELS_ITEMS;

    @pmi0("video_uploading_published")
    public static final CatalogBlockDataTypeDto VIDEO_UPLOADING_PUBLISHED;

    @pmi0("video_uploading_scheduled")
    public static final CatalogBlockDataTypeDto VIDEO_UPLOADING_SCHEDULED;
    private final String value;

    /* compiled from: CatalogBlockDataTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockDataTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockDataTypeDto createFromParcel(Parcel parcel) {
            return CatalogBlockDataTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockDataTypeDto[] newArray(int i) {
            return new CatalogBlockDataTypeDto[i];
        }
    }

    static {
        CatalogBlockDataTypeDto catalogBlockDataTypeDto = new CatalogBlockDataTypeDto("VIDEOS", 0, "videos");
        VIDEOS = catalogBlockDataTypeDto;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto2 = new CatalogBlockDataTypeDto("TV_CHANNELS", 1, "tv_channels");
        TV_CHANNELS = catalogBlockDataTypeDto2;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto3 = new CatalogBlockDataTypeDto("CATALOG_VIDEOS", 2, "catalog_videos");
        CATALOG_VIDEOS = catalogBlockDataTypeDto3;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto4 = new CatalogBlockDataTypeDto("ARTIST_VIDEOS", 3, "artist_videos");
        ARTIST_VIDEOS = catalogBlockDataTypeDto4;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto5 = new CatalogBlockDataTypeDto("ALBUMS", 4, "albums");
        ALBUMS = catalogBlockDataTypeDto5;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto6 = new CatalogBlockDataTypeDto("LINKS", 5, "links");
        LINKS = catalogBlockDataTypeDto6;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto7 = new CatalogBlockDataTypeDto("ACTION", 6, "action");
        ACTION = catalogBlockDataTypeDto7;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto8 = new CatalogBlockDataTypeDto("PLACEHOLDER", 7, "placeholder");
        PLACEHOLDER = catalogBlockDataTypeDto8;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto9 = new CatalogBlockDataTypeDto("MUSIC_UXPOLL_BANNER", 8, "music_uxpoll_banner");
        MUSIC_UXPOLL_BANNER = catalogBlockDataTypeDto9;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto10 = new CatalogBlockDataTypeDto("TEXTS", 9, "texts");
        TEXTS = catalogBlockDataTypeDto10;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto11 = new CatalogBlockDataTypeDto("SHORT_VIDEO_AUDIOS", 10, "short_video_audios");
        SHORT_VIDEO_AUDIOS = catalogBlockDataTypeDto11;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto12 = new CatalogBlockDataTypeDto("UPLOADING_VIDEO_PUBLISHED", 11, "uploading_video_published");
        UPLOADING_VIDEO_PUBLISHED = catalogBlockDataTypeDto12;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto13 = new CatalogBlockDataTypeDto("UPLOADING_VIDEO_SCHEDULED", 12, "uploading_video_scheduled");
        UPLOADING_VIDEO_SCHEDULED = catalogBlockDataTypeDto13;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto14 = new CatalogBlockDataTypeDto("COMPOSITE", 13, "composite");
        COMPOSITE = catalogBlockDataTypeDto14;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto15 = new CatalogBlockDataTypeDto("MUSIC_AUDIOS", 14, "music_audios");
        MUSIC_AUDIOS = catalogBlockDataTypeDto15;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto16 = new CatalogBlockDataTypeDto("MUSIC_PLAYLISTS", 15, "music_playlists");
        MUSIC_PLAYLISTS = catalogBlockDataTypeDto16;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto17 = new CatalogBlockDataTypeDto("MUSIC_RECOMMENDED_PLAYLISTS", 16, "music_recommended_playlists");
        MUSIC_RECOMMENDED_PLAYLISTS = catalogBlockDataTypeDto17;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto18 = new CatalogBlockDataTypeDto("MUSIC_SPECIAL", 17, "music_special");
        MUSIC_SPECIAL = catalogBlockDataTypeDto18;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto19 = new CatalogBlockDataTypeDto("MUSIC_OWNERS", 18, "music_owners");
        MUSIC_OWNERS = catalogBlockDataTypeDto19;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto20 = new CatalogBlockDataTypeDto("FRIEND", 19, "friend");
        FRIEND = catalogBlockDataTypeDto20;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto21 = new CatalogBlockDataTypeDto("ARTIST", 20, "artist");
        ARTIST = catalogBlockDataTypeDto21;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto22 = new CatalogBlockDataTypeDto("CURATOR", 21, "curator");
        CURATOR = catalogBlockDataTypeDto22;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto23 = new CatalogBlockDataTypeDto("CATALOG_USERS", 22, "catalog_users");
        CATALOG_USERS = catalogBlockDataTypeDto23;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto24 = new CatalogBlockDataTypeDto("NONE", 23, "none");
        NONE = catalogBlockDataTypeDto24;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto25 = new CatalogBlockDataTypeDto("SEARCH_SUGGESTIONS", 24, "search_suggestions");
        SEARCH_SUGGESTIONS = catalogBlockDataTypeDto25;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto26 = new CatalogBlockDataTypeDto("AUDIO_SEARCH_RECENTS", 25, "audio_search_recents");
        AUDIO_SEARCH_RECENTS = catalogBlockDataTypeDto26;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto27 = new CatalogBlockDataTypeDto("SEARCH_FILTER", 26, "search_filter");
        SEARCH_FILTER = catalogBlockDataTypeDto27;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto28 = new CatalogBlockDataTypeDto("SEARCH_SEO_PAGE", 27, "search_seo_page");
        SEARCH_SEO_PAGE = catalogBlockDataTypeDto28;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto29 = new CatalogBlockDataTypeDto("SEARCH_SPELLCHECKER", 28, "search_spellchecker");
        SEARCH_SPELLCHECKER = catalogBlockDataTypeDto29;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto30 = new CatalogBlockDataTypeDto("SEARCH_AUTHORS", 29, "search_authors");
        SEARCH_AUTHORS = catalogBlockDataTypeDto30;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto31 = new CatalogBlockDataTypeDto("GROUPS", 30, "groups");
        GROUPS = catalogBlockDataTypeDto31;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto32 = new CatalogBlockDataTypeDto("GROUPS_ITEMS", 31, "groups_items");
        GROUPS_ITEMS = catalogBlockDataTypeDto32;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto33 = new CatalogBlockDataTypeDto("GROUPS_INVITES", 32, "groups_invites");
        GROUPS_INVITES = catalogBlockDataTypeDto33;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto34 = new CatalogBlockDataTypeDto("GROUPS_CHATS", 33, "groups_chats");
        GROUPS_CHATS = catalogBlockDataTypeDto34;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto35 = new CatalogBlockDataTypeDto("COMMUNITY_CHANNELS", 34, "community_channels");
        COMMUNITY_CHANNELS = catalogBlockDataTypeDto35;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto36 = new CatalogBlockDataTypeDto("STICKERS_PACKS", 35, "stickers_packs");
        STICKERS_PACKS = catalogBlockDataTypeDto36;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto37 = new CatalogBlockDataTypeDto("STICKERS_BANNERS", 36, "stickers_banners");
        STICKERS_BANNERS = catalogBlockDataTypeDto37;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto38 = new CatalogBlockDataTypeDto("NEWSFEED_ITEMS", 37, "newsfeed_items");
        NEWSFEED_ITEMS = catalogBlockDataTypeDto38;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto39 = new CatalogBlockDataTypeDto("STICKERS_NOTIFICATION", 38, "stickers_notification");
        STICKERS_NOTIFICATION = catalogBlockDataTypeDto39;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto40 = new CatalogBlockDataTypeDto("STICKERS", 39, "stickers");
        STICKERS = catalogBlockDataTypeDto40;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto41 = new CatalogBlockDataTypeDto("STICKERS_INFO", 40, "stickers_info");
        STICKERS_INFO = catalogBlockDataTypeDto41;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto42 = new CatalogBlockDataTypeDto("AUDIO_FOLLOWINGS_UPDATE_INFO", 41, "audio_followings_update_info");
        AUDIO_FOLLOWINGS_UPDATE_INFO = catalogBlockDataTypeDto42;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto43 = new CatalogBlockDataTypeDto("BASE_LINKS", 42, "base_links");
        BASE_LINKS = catalogBlockDataTypeDto43;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto44 = new CatalogBlockDataTypeDto("CATALOG_BANNERS", 43, "catalog_banners");
        CATALOG_BANNERS = catalogBlockDataTypeDto44;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto45 = new CatalogBlockDataTypeDto("MARKET_ITEMS", 44, "market_items");
        MARKET_ITEMS = catalogBlockDataTypeDto45;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto46 = new CatalogBlockDataTypeDto("MARKET_ORDERS", 45, "market_orders");
        MARKET_ORDERS = catalogBlockDataTypeDto46;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto47 = new CatalogBlockDataTypeDto("MARKET_RATINGS_AND_REVIEWS", 46, "market_ratings_and_reviews");
        MARKET_RATINGS_AND_REVIEWS = catalogBlockDataTypeDto47;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto48 = new CatalogBlockDataTypeDto("ABANDONED_CARTS", 47, "abandoned_carts");
        ABANDONED_CARTS = catalogBlockDataTypeDto48;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto49 = new CatalogBlockDataTypeDto("GROUPS_INFO_ITEMS", 48, "groups_info_items");
        GROUPS_INFO_ITEMS = catalogBlockDataTypeDto49;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto50 = new CatalogBlockDataTypeDto("NAVIGATION_TABS", 49, "navigation_tabs");
        NAVIGATION_TABS = catalogBlockDataTypeDto50;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto51 = new CatalogBlockDataTypeDto("CLASSIFIEDS_INFO", 50, "classifieds_info");
        CLASSIFIEDS_INFO = catalogBlockDataTypeDto51;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto52 = new CatalogBlockDataTypeDto("CLASSIFIEDS_CITIES", 51, "classifieds_cities");
        CLASSIFIEDS_CITIES = catalogBlockDataTypeDto52;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto53 = new CatalogBlockDataTypeDto("CLASSIFIEDS_CATEGORY_TREE", 52, "classifieds_category_tree");
        CLASSIFIEDS_CATEGORY_TREE = catalogBlockDataTypeDto53;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto54 = new CatalogBlockDataTypeDto("MARKET_CATEGORY_MAPPINGS", 53, "market_category_mappings");
        MARKET_CATEGORY_MAPPINGS = catalogBlockDataTypeDto54;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto55 = new CatalogBlockDataTypeDto("MARKET_SEARCH_QUERY", 54, "market_search_query");
        MARKET_SEARCH_QUERY = catalogBlockDataTypeDto55;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto56 = new CatalogBlockDataTypeDto("MARKET_SEARCH_SPELL_CHECKER", 55, "market_search_spell_checker");
        MARKET_SEARCH_SPELL_CHECKER = catalogBlockDataTypeDto56;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto57 = new CatalogBlockDataTypeDto("MARKET_SEARCH_CLASSIFIER_RESULTS", 56, "market_search_classifier_results");
        MARKET_SEARCH_CLASSIFIER_RESULTS = catalogBlockDataTypeDto57;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto58 = new CatalogBlockDataTypeDto("MARKET_SUBCATEGORIES_MENU", 57, "market_subcategories_menu");
        MARKET_SUBCATEGORIES_MENU = catalogBlockDataTypeDto58;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto59 = new CatalogBlockDataTypeDto("MARKET_INFO", 58, "market_info");
        MARKET_INFO = catalogBlockDataTypeDto59;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto60 = new CatalogBlockDataTypeDto("GROUPS_FRIENDS_LIKES", 59, "groups_friends_likes");
        GROUPS_FRIENDS_LIKES = catalogBlockDataTypeDto60;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto61 = new CatalogBlockDataTypeDto("VIDEO_UPLOADING_PUBLISHED", 60, "video_uploading_published");
        VIDEO_UPLOADING_PUBLISHED = catalogBlockDataTypeDto61;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto62 = new CatalogBlockDataTypeDto("VIDEO_UPLOADING_SCHEDULED", 61, "video_uploading_scheduled");
        VIDEO_UPLOADING_SCHEDULED = catalogBlockDataTypeDto62;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto63 = new CatalogBlockDataTypeDto("LONGREADS", 62, "longreads");
        LONGREADS = catalogBlockDataTypeDto63;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto64 = new CatalogBlockDataTypeDto("PODCAST_SLIDER_ITEMS", 63, "podcast_slider_items");
        PODCAST_SLIDER_ITEMS = catalogBlockDataTypeDto64;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto65 = new CatalogBlockDataTypeDto("RECENT_BUSINESSES", 64, "recent_businesses");
        RECENT_BUSINESSES = catalogBlockDataTypeDto65;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto66 = new CatalogBlockDataTypeDto("CATALOG_BANNER", 65, "catalog_banner");
        CATALOG_BANNER = catalogBlockDataTypeDto66;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto67 = new CatalogBlockDataTypeDto("PODCAST_BANNERS_SLIDER", 66, "podcast_banners_slider");
        PODCAST_BANNERS_SLIDER = catalogBlockDataTypeDto67;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto68 = new CatalogBlockDataTypeDto("AUDIO_SEARCH_SUGGESTIONS", 67, "audio_search_suggestions");
        AUDIO_SEARCH_SUGGESTIONS = catalogBlockDataTypeDto68;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto69 = new CatalogBlockDataTypeDto("PODCAST_EPISODES", 68, "podcast_episodes");
        PODCAST_EPISODES = catalogBlockDataTypeDto69;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto70 = new CatalogBlockDataTypeDto("FRIENDS_LIKED_EPISODES", 69, "friends_liked_episodes");
        FRIENDS_LIKED_EPISODES = catalogBlockDataTypeDto70;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto71 = new CatalogBlockDataTypeDto("PODCASTS_SLIDER_ITEMS", 70, "podcasts_slider_items");
        PODCASTS_SLIDER_ITEMS = catalogBlockDataTypeDto71;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto72 = new CatalogBlockDataTypeDto("AUDIO_BOOKS", 71, "audio_books");
        AUDIO_BOOKS = catalogBlockDataTypeDto72;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto73 = new CatalogBlockDataTypeDto("AUDIO_BOOKS_PERSONS", 72, "audio_books_persons");
        AUDIO_BOOKS_PERSONS = catalogBlockDataTypeDto73;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto74 = new CatalogBlockDataTypeDto("CONCERTS", 73, "concerts");
        CONCERTS = catalogBlockDataTypeDto74;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto75 = new CatalogBlockDataTypeDto("MINI_APPS", 74, "mini_apps");
        MINI_APPS = catalogBlockDataTypeDto75;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto76 = new CatalogBlockDataTypeDto("MINI_APPS_CONTENT", 75, "mini_apps_content");
        MINI_APPS_CONTENT = catalogBlockDataTypeDto76;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto77 = new CatalogBlockDataTypeDto("GAMES", 76, "games");
        GAMES = catalogBlockDataTypeDto77;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto78 = new CatalogBlockDataTypeDto("CATALOG_SEARCH_SUGGESTION", 77, "catalog_search_suggestion");
        CATALOG_SEARCH_SUGGESTION = catalogBlockDataTypeDto78;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto79 = new CatalogBlockDataTypeDto("CLIP_DRAFTS", 78, "clip_drafts");
        CLIP_DRAFTS = catalogBlockDataTypeDto79;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto80 = new CatalogBlockDataTypeDto("CLIPS", 79, "clips");
        CLIPS = catalogBlockDataTypeDto80;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto81 = new CatalogBlockDataTypeDto("BANNERS", 80, "banners");
        BANNERS = catalogBlockDataTypeDto81;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto82 = new CatalogBlockDataTypeDto("GROUPS_COLLECTION", 81, "groups_collection");
        GROUPS_COLLECTION = catalogBlockDataTypeDto82;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto83 = new CatalogBlockDataTypeDto("GROUPS_ALL_GROUPS_OR_RECOMMENDATIONS", 82, "groups_all_groups_or_recommendations");
        GROUPS_ALL_GROUPS_OR_RECOMMENDATIONS = catalogBlockDataTypeDto83;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto84 = new CatalogBlockDataTypeDto("VIDEO_SHOWCASE_MENU_ITEMS", 83, "video_showcase_menu_items");
        VIDEO_SHOWCASE_MENU_ITEMS = catalogBlockDataTypeDto84;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto85 = new CatalogBlockDataTypeDto("GROUPS_EVENTS", 84, "groups_events");
        GROUPS_EVENTS = catalogBlockDataTypeDto85;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto86 = new CatalogBlockDataTypeDto("GROUPS_HIDDEN", 85, "groups_hidden");
        GROUPS_HIDDEN = catalogBlockDataTypeDto86;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto87 = new CatalogBlockDataTypeDto("PODCASTS", 86, "podcasts");
        PODCASTS = catalogBlockDataTypeDto87;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto88 = new CatalogBlockDataTypeDto("MOVIES", 87, "movies");
        MOVIES = catalogBlockDataTypeDto88;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto89 = new CatalogBlockDataTypeDto("EXTENDED_PODCASTS", 88, "extended_podcasts");
        EXTENDED_PODCASTS = catalogBlockDataTypeDto89;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto90 = new CatalogBlockDataTypeDto("EMPTY", 89, "empty");
        EMPTY = catalogBlockDataTypeDto90;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto91 = new CatalogBlockDataTypeDto("GROUPS_BANNER_ITEMS", 90, "groups_banner_items");
        GROUPS_BANNER_ITEMS = catalogBlockDataTypeDto91;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto92 = new CatalogBlockDataTypeDto("RADIOSTATIONS", 91, "radiostations");
        RADIOSTATIONS = catalogBlockDataTypeDto92;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto93 = new CatalogBlockDataTypeDto("AUDIO_FOLLOWINGS_UPDATE_ITEM", 92, "audio_followings_update_item");
        AUDIO_FOLLOWINGS_UPDATE_ITEM = catalogBlockDataTypeDto93;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto94 = new CatalogBlockDataTypeDto("AUDIO_SIGNAL_COMMON_INFO", 93, "audio_signal_common_info");
        AUDIO_SIGNAL_COMMON_INFO = catalogBlockDataTypeDto94;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto95 = new CatalogBlockDataTypeDto("GROUPS_CATEGORY_ITEMS", 94, "groups_category_items");
        GROUPS_CATEGORY_ITEMS = catalogBlockDataTypeDto95;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto96 = new CatalogBlockDataTypeDto("OWNERS", 95, "owners");
        OWNERS = catalogBlockDataTypeDto96;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto97 = new CatalogBlockDataTypeDto("SUBSECTION_LINK", 96, "subsection_link");
        SUBSECTION_LINK = catalogBlockDataTypeDto97;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto98 = new CatalogBlockDataTypeDto("SEARCH_ENTITY_ITEMS", 97, "search_entity_items");
        SEARCH_ENTITY_ITEMS = catalogBlockDataTypeDto98;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto99 = new CatalogBlockDataTypeDto("CATALOG_AD_BLOCKS", 98, "catalog_ad_blocks");
        CATALOG_AD_BLOCKS = catalogBlockDataTypeDto99;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto100 = new CatalogBlockDataTypeDto("SEARCH_WALL_ITEMS", 99, "search_wall_items");
        SEARCH_WALL_ITEMS = catalogBlockDataTypeDto100;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto101 = new CatalogBlockDataTypeDto("AUDIO_STREAM_MIXES", 100, "audio_stream_mixes");
        AUDIO_STREAM_MIXES = catalogBlockDataTypeDto101;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto102 = new CatalogBlockDataTypeDto("FEEDBACKS", 101, "feedbacks");
        FEEDBACKS = catalogBlockDataTypeDto102;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto103 = new CatalogBlockDataTypeDto("AUDIO_CONTENT_CARDS", 102, "audio_content_cards");
        AUDIO_CONTENT_CARDS = catalogBlockDataTypeDto103;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto104 = new CatalogBlockDataTypeDto("VIDEO_SHOWCASE_GALLERIES", 103, "video_showcase_galleries");
        VIDEO_SHOWCASE_GALLERIES = catalogBlockDataTypeDto104;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto105 = new CatalogBlockDataTypeDto("VIDEO_SHOWCASE_VKLIVE_CATEGORIES_ITEMS", 104, "video_showcase_vklive_categories_items");
        VIDEO_SHOWCASE_VKLIVE_CATEGORIES_ITEMS = catalogBlockDataTypeDto105;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto106 = new CatalogBlockDataTypeDto("VIDEO_SHOWCASE_VKLIVE_CHANNELS_ITEMS", 105, "video_showcase_vklive_channels_items");
        VIDEO_SHOWCASE_VKLIVE_CHANNELS_ITEMS = catalogBlockDataTypeDto106;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto107 = new CatalogBlockDataTypeDto("SHORT_VIDEOS", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "short_videos");
        SHORT_VIDEOS = catalogBlockDataTypeDto107;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto108 = new CatalogBlockDataTypeDto("TOPSHELF_ITEMS", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "topshelf_items");
        TOPSHELF_ITEMS = catalogBlockDataTypeDto108;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto109 = new CatalogBlockDataTypeDto("VIDEO_CHANNELS", 108, "video_channels");
        VIDEO_CHANNELS = catalogBlockDataTypeDto109;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto110 = new CatalogBlockDataTypeDto("DOWNLOADED_VIDEOS", 109, "downloaded_videos");
        DOWNLOADED_VIDEOS = catalogBlockDataTypeDto110;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto111 = new CatalogBlockDataTypeDto("VIDEO_MUSIC_STREAM_MIXES", 110, "video_music_stream_mixes");
        VIDEO_MUSIC_STREAM_MIXES = catalogBlockDataTypeDto111;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto112 = new CatalogBlockDataTypeDto("AI_ASSISTANTS", 111, "ai_assistants");
        AI_ASSISTANTS = catalogBlockDataTypeDto112;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto113 = new CatalogBlockDataTypeDto("VIDEO_BANNERS", 112, "video_banners");
        VIDEO_BANNERS = catalogBlockDataTypeDto113;
        CatalogBlockDataTypeDto[] catalogBlockDataTypeDtoArr = {catalogBlockDataTypeDto, catalogBlockDataTypeDto2, catalogBlockDataTypeDto3, catalogBlockDataTypeDto4, catalogBlockDataTypeDto5, catalogBlockDataTypeDto6, catalogBlockDataTypeDto7, catalogBlockDataTypeDto8, catalogBlockDataTypeDto9, catalogBlockDataTypeDto10, catalogBlockDataTypeDto11, catalogBlockDataTypeDto12, catalogBlockDataTypeDto13, catalogBlockDataTypeDto14, catalogBlockDataTypeDto15, catalogBlockDataTypeDto16, catalogBlockDataTypeDto17, catalogBlockDataTypeDto18, catalogBlockDataTypeDto19, catalogBlockDataTypeDto20, catalogBlockDataTypeDto21, catalogBlockDataTypeDto22, catalogBlockDataTypeDto23, catalogBlockDataTypeDto24, catalogBlockDataTypeDto25, catalogBlockDataTypeDto26, catalogBlockDataTypeDto27, catalogBlockDataTypeDto28, catalogBlockDataTypeDto29, catalogBlockDataTypeDto30, catalogBlockDataTypeDto31, catalogBlockDataTypeDto32, catalogBlockDataTypeDto33, catalogBlockDataTypeDto34, catalogBlockDataTypeDto35, catalogBlockDataTypeDto36, catalogBlockDataTypeDto37, catalogBlockDataTypeDto38, catalogBlockDataTypeDto39, catalogBlockDataTypeDto40, catalogBlockDataTypeDto41, catalogBlockDataTypeDto42, catalogBlockDataTypeDto43, catalogBlockDataTypeDto44, catalogBlockDataTypeDto45, catalogBlockDataTypeDto46, catalogBlockDataTypeDto47, catalogBlockDataTypeDto48, catalogBlockDataTypeDto49, catalogBlockDataTypeDto50, catalogBlockDataTypeDto51, catalogBlockDataTypeDto52, catalogBlockDataTypeDto53, catalogBlockDataTypeDto54, catalogBlockDataTypeDto55, catalogBlockDataTypeDto56, catalogBlockDataTypeDto57, catalogBlockDataTypeDto58, catalogBlockDataTypeDto59, catalogBlockDataTypeDto60, catalogBlockDataTypeDto61, catalogBlockDataTypeDto62, catalogBlockDataTypeDto63, catalogBlockDataTypeDto64, catalogBlockDataTypeDto65, catalogBlockDataTypeDto66, catalogBlockDataTypeDto67, catalogBlockDataTypeDto68, catalogBlockDataTypeDto69, catalogBlockDataTypeDto70, catalogBlockDataTypeDto71, catalogBlockDataTypeDto72, catalogBlockDataTypeDto73, catalogBlockDataTypeDto74, catalogBlockDataTypeDto75, catalogBlockDataTypeDto76, catalogBlockDataTypeDto77, catalogBlockDataTypeDto78, catalogBlockDataTypeDto79, catalogBlockDataTypeDto80, catalogBlockDataTypeDto81, catalogBlockDataTypeDto82, catalogBlockDataTypeDto83, catalogBlockDataTypeDto84, catalogBlockDataTypeDto85, catalogBlockDataTypeDto86, catalogBlockDataTypeDto87, catalogBlockDataTypeDto88, catalogBlockDataTypeDto89, catalogBlockDataTypeDto90, catalogBlockDataTypeDto91, catalogBlockDataTypeDto92, catalogBlockDataTypeDto93, catalogBlockDataTypeDto94, catalogBlockDataTypeDto95, catalogBlockDataTypeDto96, catalogBlockDataTypeDto97, catalogBlockDataTypeDto98, catalogBlockDataTypeDto99, catalogBlockDataTypeDto100, catalogBlockDataTypeDto101, catalogBlockDataTypeDto102, catalogBlockDataTypeDto103, catalogBlockDataTypeDto104, catalogBlockDataTypeDto105, catalogBlockDataTypeDto106, catalogBlockDataTypeDto107, catalogBlockDataTypeDto108, catalogBlockDataTypeDto109, catalogBlockDataTypeDto110, catalogBlockDataTypeDto111, catalogBlockDataTypeDto112, catalogBlockDataTypeDto113};
        $VALUES = catalogBlockDataTypeDtoArr;
        $ENTRIES = new asp(catalogBlockDataTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogBlockDataTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogBlockDataTypeDto valueOf(String str) {
        return (CatalogBlockDataTypeDto) Enum.valueOf(CatalogBlockDataTypeDto.class, str);
    }

    public static CatalogBlockDataTypeDto[] values() {
        return (CatalogBlockDataTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
