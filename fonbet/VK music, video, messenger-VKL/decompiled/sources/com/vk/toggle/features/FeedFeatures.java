package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeedFeatures.kt */
/* loaded from: classes11.dex */
public final class FeedFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FeedFeatures[] $VALUES;
    public static final FeedFeatures ADS_DISABLE_HACK_PIXELS;
    public static final FeedFeatures ADS_SDK_CAROUSEL;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_BLS;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_CAROUSEL_MULTIPART_HOLDER;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_CLICK_ZONE_FIX;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_SINGLE_INA_MVI_CLICK;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_STATIC_MULTIPART_HOLDER;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_VIDEO;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_FORMATS_SUPPORT;
    public static final FeedFeatures ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_MULTIPART_HOLDER;
    public static final FeedFeatures ADS_SDK_NON_CACHE_POLICY;
    public static final FeedFeatures ADS_VIDEO_CLICK;
    public static final FeedFeatures ADS_VISIBILITY_RECT_FIX;
    public static final FeedFeatures API_GO_REQUEST;
    public static final FeedFeatures ASYNC_DIFF_UTIL;
    public static final FeedFeatures BREAKING_NEWS_API;
    public static final FeedFeatures BREAKING_NEWS_TREND_API;
    public static final FeedFeatures CLEAR_STACK_INACTIVE;
    public static final FeedFeatures COMPOSE_FOOTER;
    public static final FeedFeatures DEVICE_VOLUME;
    public static final FeedFeatures DISABLE_PLAYLIST_ANIM;
    public static final FeedFeatures DISCOVER_API;
    public static final FeedFeatures DISCOVER_NETWORK_ERROR_FIX;
    public static final FeedFeatures DISCOVER_OZON_CLIP;
    public static final FeedFeatures DS_AUDIO_ATTACH;
    public static final FeedFeatures DS_COAUTHOR_HEADER;
    public static final FeedFeatures DS_HEADER;
    public static final FeedFeatures DS_REPOST_HEADER;
    public static final FeedFeatures DZEN_API;
    public static final FeedFeatures DZEN_CAROUSEL;
    public static final FeedFeatures DZEN_CAROUSEL_MEDIASCOPE;
    public static final FeedFeatures DZEN_MIDDLE_AD;
    public static final FeedFeatures DZEN_TOP_AD;
    public static final FeedFeatures FEED_ADS_FORCE_OPEN_BROWSER;
    public static final FeedFeatures FEED_APPLOVIN_PRELOAD_CONFIG;
    public static final FeedFeatures FEED_CLIP_BANNER_AD_PRELOAD;
    public static final FeedFeatures FEED_CODEGEN_NEWSFEED;
    public static final FeedFeatures FEED_DS_ACTION_CELL_BUTTON;
    public static final FeedFeatures FEED_DS_HORIZONTAL_VIEW;
    public static final FeedFeatures FEED_DS_LIKES_FILLED_FOOTER;
    public static final FeedFeatures FEED_DS_MEDIA_PICKER;
    public static final FeedFeatures FEED_DS_OVERLAY_PRODUCT_DESIGN;
    public static final FeedFeatures FEED_DS_SNIPPET;
    public static final FeedFeatures FEED_DS_TOOLTIP;
    public static final FeedFeatures FEED_GET_CUSTOM_CHUNK;
    public static final FeedFeatures FEED_LINK_VK_PIXELS;
    public static final FeedFeatures FEED_NEW_CAROUSEL_PRODUCT_ITEM;
    public static final FeedFeatures FEED_OPEN_POST_LINK;
    public static final FeedFeatures FEED_PROMO_POST_VIDEO_AUTOPLAY_ADS_TAG;
    public static final FeedFeatures FEED_REMOVE_CUSTOM_REACTIONS;
    public static final FeedFeatures FEED_YANDEX_AD;
    public static final FeedFeatures FILE_CACHE;
    public static final FeedFeatures FILTER_ACTIVITIES;
    public static final FeedFeatures FRESH_NEWS_LOADER_FIX;
    public static final FeedFeatures FRESH_TIMER;
    public static final FeedFeatures FRIEND_COMMENTS_INLINE;
    public static final FeedFeatures FRIEND_COMMENTS_PHOTO;
    public static final FeedFeatures FRIEND_LIKES_INLINE;
    public static final FeedFeatures FRIEND_LIKES_PHOTO;
    public static final FeedFeatures MAIN_FEED_COMPOSE_TOP_BAR;
    public static final FeedFeatures MVI_DISCOVER;
    public static final FeedFeatures MVI_REACTIONS;
    public static final FeedFeatures MVI_USER;
    public static final FeedFeatures MY_TARGET_NATIVE_AD;
    public static final FeedFeatures OWNER_DUPLICATE;
    public static final FeedFeatures PARSE_LINKS;
    public static final FeedFeatures POSTING_PHOTO_EDITOR;
    public static final FeedFeatures REDESIGN_INTERNAL_LINK;
    public static final FeedFeatures REDESIGN_TEXT_CHIP;
    public static final FeedFeatures SHARED_VIEW_POOL;
    public static final FeedFeatures SIMILAR_NEWS_API;
    public static final FeedFeatures START_UP_DIRECT_CACHE;
    public static final FeedFeatures WALL_POST_ROLLBACK;
    public static final FeedFeatures WARMUP_GLYPHS;
    private final String key;

    static {
        FeedFeatures feedFeatures = new FeedFeatures("FILE_CACHE", 0, "feed_file_cache");
        FILE_CACHE = feedFeatures;
        FeedFeatures feedFeatures2 = new FeedFeatures("MVI_REACTIONS", 1, "feed_mvi_reactions");
        MVI_REACTIONS = feedFeatures2;
        FeedFeatures feedFeatures3 = new FeedFeatures("DISCOVER_API", 2, "feed_discover_api");
        DISCOVER_API = feedFeatures3;
        FeedFeatures feedFeatures4 = new FeedFeatures("API_GO_REQUEST", 3, "feed_api_go_request");
        API_GO_REQUEST = feedFeatures4;
        FeedFeatures feedFeatures5 = new FeedFeatures("COMPOSE_FOOTER", 4, "feed_compose_footer");
        COMPOSE_FOOTER = feedFeatures5;
        FeedFeatures feedFeatures6 = new FeedFeatures("BREAKING_NEWS_TREND_API", 5, "feed_breaking_news_trend_api");
        BREAKING_NEWS_TREND_API = feedFeatures6;
        FeedFeatures feedFeatures7 = new FeedFeatures("DZEN_API", 6, "feed_dzen_api");
        DZEN_API = feedFeatures7;
        FeedFeatures feedFeatures8 = new FeedFeatures("BREAKING_NEWS_API", 7, "feed_breaking_news_api");
        BREAKING_NEWS_API = feedFeatures8;
        FeedFeatures feedFeatures9 = new FeedFeatures("SIMILAR_NEWS_API", 8, "feed_similar_news_api");
        SIMILAR_NEWS_API = feedFeatures9;
        FeedFeatures feedFeatures10 = new FeedFeatures("MVI_DISCOVER", 9, "feed_mvi_discover");
        MVI_DISCOVER = feedFeatures10;
        FeedFeatures feedFeatures11 = new FeedFeatures("MVI_USER", 10, "feed_mvi_user");
        MVI_USER = feedFeatures11;
        FeedFeatures feedFeatures12 = new FeedFeatures("DISCOVER_NETWORK_ERROR_FIX", 11, "feed_discover_network_error");
        DISCOVER_NETWORK_ERROR_FIX = feedFeatures12;
        FeedFeatures feedFeatures13 = new FeedFeatures("WARMUP_GLYPHS", 12, "feed_warmup_glyphs");
        WARMUP_GLYPHS = feedFeatures13;
        FeedFeatures feedFeatures14 = new FeedFeatures("PARSE_LINKS", 13, "feed_parse_links");
        PARSE_LINKS = feedFeatures14;
        FeedFeatures feedFeatures15 = new FeedFeatures("ASYNC_DIFF_UTIL", 14, "feed_async_diff_util");
        ASYNC_DIFF_UTIL = feedFeatures15;
        FeedFeatures feedFeatures16 = new FeedFeatures("FRESH_NEWS_LOADER_FIX", 15, "feed_fresh_news_loader");
        FRESH_NEWS_LOADER_FIX = feedFeatures16;
        FeedFeatures feedFeatures17 = new FeedFeatures("SHARED_VIEW_POOL", 16, "feed_shared_viewpool");
        SHARED_VIEW_POOL = feedFeatures17;
        FeedFeatures feedFeatures18 = new FeedFeatures("START_UP_DIRECT_CACHE", 17, "feed_startup_direct");
        START_UP_DIRECT_CACHE = feedFeatures18;
        FeedFeatures feedFeatures19 = new FeedFeatures("MAIN_FEED_COMPOSE_TOP_BAR", 18, "feed_main_feed_compose_top_bar");
        MAIN_FEED_COMPOSE_TOP_BAR = feedFeatures19;
        FeedFeatures feedFeatures20 = new FeedFeatures("FRIEND_LIKES_INLINE", 19, "feed_friend_likes_inline");
        FRIEND_LIKES_INLINE = feedFeatures20;
        FeedFeatures feedFeatures21 = new FeedFeatures("FRIEND_COMMENTS_INLINE", 20, "feed_friend_comments_inline");
        FRIEND_COMMENTS_INLINE = feedFeatures21;
        FeedFeatures feedFeatures22 = new FeedFeatures("FILTER_ACTIVITIES", 21, "feed_filter_activities");
        FILTER_ACTIVITIES = feedFeatures22;
        FeedFeatures feedFeatures23 = new FeedFeatures("DZEN_CAROUSEL", 22, "feed_dzen_carousel");
        DZEN_CAROUSEL = feedFeatures23;
        FeedFeatures feedFeatures24 = new FeedFeatures("DZEN_TOP_AD", 23, "feed_dzen_top_ad");
        DZEN_TOP_AD = feedFeatures24;
        FeedFeatures feedFeatures25 = new FeedFeatures("DZEN_MIDDLE_AD", 24, "feed_dzen_middle_ad");
        DZEN_MIDDLE_AD = feedFeatures25;
        FeedFeatures feedFeatures26 = new FeedFeatures("DZEN_CAROUSEL_MEDIASCOPE", 25, "feed_dzen_carousel_mediascope");
        DZEN_CAROUSEL_MEDIASCOPE = feedFeatures26;
        FeedFeatures feedFeatures27 = new FeedFeatures("FRESH_TIMER", 26, "feed_fresh_timer");
        FRESH_TIMER = feedFeatures27;
        FeedFeatures feedFeatures28 = new FeedFeatures("POSTING_PHOTO_EDITOR", 27, "feed_posting_photo_editor");
        POSTING_PHOTO_EDITOR = feedFeatures28;
        FeedFeatures feedFeatures29 = new FeedFeatures("CLEAR_STACK_INACTIVE", 28, "feed_clear_stack_inactive");
        CLEAR_STACK_INACTIVE = feedFeatures29;
        FeedFeatures feedFeatures30 = new FeedFeatures("DISCOVER_OZON_CLIP", 29, "feed_discover_ozon_clip");
        DISCOVER_OZON_CLIP = feedFeatures30;
        FeedFeatures feedFeatures31 = new FeedFeatures("OWNER_DUPLICATE", 30, "feed_owner_duplicate");
        OWNER_DUPLICATE = feedFeatures31;
        FeedFeatures feedFeatures32 = new FeedFeatures("FRIEND_LIKES_PHOTO", 31, "feed_friend_likes_photo");
        FRIEND_LIKES_PHOTO = feedFeatures32;
        FeedFeatures feedFeatures33 = new FeedFeatures("DISABLE_PLAYLIST_ANIM", 32, "feed_disable_playlist_anim");
        DISABLE_PLAYLIST_ANIM = feedFeatures33;
        FeedFeatures feedFeatures34 = new FeedFeatures("FRIEND_COMMENTS_PHOTO", 33, "feed_friend_comments_photo");
        FRIEND_COMMENTS_PHOTO = feedFeatures34;
        FeedFeatures feedFeatures35 = new FeedFeatures("DEVICE_VOLUME", 34, "feed_device_volume");
        DEVICE_VOLUME = feedFeatures35;
        FeedFeatures feedFeatures36 = new FeedFeatures("FEED_OPEN_POST_LINK", 35, "feed_open_post_link");
        FEED_OPEN_POST_LINK = feedFeatures36;
        FeedFeatures feedFeatures37 = new FeedFeatures("WALL_POST_ROLLBACK", 36, "feed_wall_post_rollback");
        WALL_POST_ROLLBACK = feedFeatures37;
        FeedFeatures feedFeatures38 = new FeedFeatures("REDESIGN_INTERNAL_LINK", 37, "feed_redesign_internal_link");
        REDESIGN_INTERNAL_LINK = feedFeatures38;
        FeedFeatures feedFeatures39 = new FeedFeatures("REDESIGN_TEXT_CHIP", 38, "feed_redesign_text_chip");
        REDESIGN_TEXT_CHIP = feedFeatures39;
        FeedFeatures feedFeatures40 = new FeedFeatures("DS_AUDIO_ATTACH", 39, "feed_ds_audio_attach");
        DS_AUDIO_ATTACH = feedFeatures40;
        FeedFeatures feedFeatures41 = new FeedFeatures("DS_HEADER", 40, "feed_ds_header");
        DS_HEADER = feedFeatures41;
        FeedFeatures feedFeatures42 = new FeedFeatures("DS_COAUTHOR_HEADER", 41, "feed_ds_coauthor_header");
        DS_COAUTHOR_HEADER = feedFeatures42;
        FeedFeatures feedFeatures43 = new FeedFeatures("DS_REPOST_HEADER", 42, "feed_ds_repost_header");
        DS_REPOST_HEADER = feedFeatures43;
        FeedFeatures feedFeatures44 = new FeedFeatures("MY_TARGET_NATIVE_AD", 43, "feed_my_target_native_ad");
        MY_TARGET_NATIVE_AD = feedFeatures44;
        FeedFeatures feedFeatures45 = new FeedFeatures("ADS_SDK_NON_CACHE_POLICY", 44, "feed_ads_sdk_none_cache_policy");
        ADS_SDK_NON_CACHE_POLICY = feedFeatures45;
        FeedFeatures feedFeatures46 = new FeedFeatures("ADS_SDK_CAROUSEL", 45, "feed_ads_sdk_andr_carousel");
        ADS_SDK_CAROUSEL = feedFeatures46;
        FeedFeatures feedFeatures47 = new FeedFeatures("FEED_GET_CUSTOM_CHUNK", 46, "feed_get_custom_chunk");
        FEED_GET_CUSTOM_CHUNK = feedFeatures47;
        FeedFeatures feedFeatures48 = new FeedFeatures("FEED_PROMO_POST_VIDEO_AUTOPLAY_ADS_TAG", 47, "feed_promo_post_video_autoplay");
        FEED_PROMO_POST_VIDEO_AUTOPLAY_ADS_TAG = feedFeatures48;
        FeedFeatures feedFeatures49 = new FeedFeatures("FEED_ADS_FORCE_OPEN_BROWSER", 48, "feed_ads_force_open_browser");
        FEED_ADS_FORCE_OPEN_BROWSER = feedFeatures49;
        FeedFeatures feedFeatures50 = new FeedFeatures("FEED_APPLOVIN_PRELOAD_CONFIG", 49, "feed_applovin_preload_config");
        FEED_APPLOVIN_PRELOAD_CONFIG = feedFeatures50;
        FeedFeatures feedFeatures51 = new FeedFeatures("FEED_YANDEX_AD", 50, "feed_yandex_ad");
        FEED_YANDEX_AD = feedFeatures51;
        FeedFeatures feedFeatures52 = new FeedFeatures("FEED_LINK_VK_PIXELS", 51, "feed_link_vk_pixels");
        FEED_LINK_VK_PIXELS = feedFeatures52;
        FeedFeatures feedFeatures53 = new FeedFeatures("FEED_DS_LIKES_FILLED_FOOTER", 52, "feed_ds_likes_filled_footer");
        FEED_DS_LIKES_FILLED_FOOTER = feedFeatures53;
        FeedFeatures feedFeatures54 = new FeedFeatures("FEED_NEW_CAROUSEL_PRODUCT_ITEM", 53, "feed_new_carousel_product_item");
        FEED_NEW_CAROUSEL_PRODUCT_ITEM = feedFeatures54;
        FeedFeatures feedFeatures55 = new FeedFeatures("FEED_DS_ACTION_CELL_BUTTON", 54, "feed_ds_action_cell_button");
        FEED_DS_ACTION_CELL_BUTTON = feedFeatures55;
        FeedFeatures feedFeatures56 = new FeedFeatures("FEED_DS_OVERLAY_PRODUCT_DESIGN", 55, "feed_ds_overlay_product_design");
        FEED_DS_OVERLAY_PRODUCT_DESIGN = feedFeatures56;
        FeedFeatures feedFeatures57 = new FeedFeatures("FEED_DS_TOOLTIP", 56, "feed_ds_tooltip");
        FEED_DS_TOOLTIP = feedFeatures57;
        FeedFeatures feedFeatures58 = new FeedFeatures("FEED_DS_HORIZONTAL_VIEW", 57, "feed_ds_horizontal_view");
        FEED_DS_HORIZONTAL_VIEW = feedFeatures58;
        FeedFeatures feedFeatures59 = new FeedFeatures("FEED_DS_SNIPPET", 58, "feed_ds_snippet");
        FEED_DS_SNIPPET = feedFeatures59;
        FeedFeatures feedFeatures60 = new FeedFeatures("FEED_DS_MEDIA_PICKER", 59, "feed_ds_mediapicker");
        FEED_DS_MEDIA_PICKER = feedFeatures60;
        FeedFeatures feedFeatures61 = new FeedFeatures("FEED_CODEGEN_NEWSFEED", 60, "feed_codegen_newsfeed");
        FEED_CODEGEN_NEWSFEED = feedFeatures61;
        FeedFeatures feedFeatures62 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_VIDEO", 61, "feed_ads_sdk_andr_video");
        ADS_SDK_INTERNAL_NATIVE_AD_VIDEO = feedFeatures62;
        FeedFeatures feedFeatures63 = new FeedFeatures("ADS_VISIBILITY_RECT_FIX", 62, "feed_ads_visibility_rect_fix");
        ADS_VISIBILITY_RECT_FIX = feedFeatures63;
        FeedFeatures feedFeatures64 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_STATIC_MULTIPART_HOLDER", 63, "feed_ads_ina_static_multipart");
        ADS_SDK_INTERNAL_NATIVE_AD_STATIC_MULTIPART_HOLDER = feedFeatures64;
        FeedFeatures feedFeatures65 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_MULTIPART_HOLDER", 64, "feed_ads_ina_video_multipart");
        ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_MULTIPART_HOLDER = feedFeatures65;
        FeedFeatures feedFeatures66 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_SINGLE_INA_MVI_CLICK", 65, "feed_ads_singe_ina_mvi_click");
        ADS_SDK_INTERNAL_NATIVE_AD_SINGLE_INA_MVI_CLICK = feedFeatures66;
        FeedFeatures feedFeatures67 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_CLICK_ZONE_FIX", 66, "feed_ads_ina_click_zone_fix");
        ADS_SDK_INTERNAL_NATIVE_AD_CLICK_ZONE_FIX = feedFeatures67;
        FeedFeatures feedFeatures68 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_CAROUSEL_MULTIPART_HOLDER", 67, "feed_ads_ina_cards_multipart");
        ADS_SDK_INTERNAL_NATIVE_AD_CAROUSEL_MULTIPART_HOLDER = feedFeatures68;
        FeedFeatures feedFeatures69 = new FeedFeatures("ADS_DISABLE_HACK_PIXELS", 68, "feed_ads_disable_hack_pixels");
        ADS_DISABLE_HACK_PIXELS = feedFeatures69;
        FeedFeatures feedFeatures70 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_FORMATS_SUPPORT", 69, "feed_ads_ina_video_formats");
        ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_FORMATS_SUPPORT = feedFeatures70;
        FeedFeatures feedFeatures71 = new FeedFeatures("ADS_SDK_INTERNAL_NATIVE_AD_BLS", 70, "feed_ads_ina_bls");
        ADS_SDK_INTERNAL_NATIVE_AD_BLS = feedFeatures71;
        FeedFeatures feedFeatures72 = new FeedFeatures("ADS_VIDEO_CLICK", 71, "feed_ads_video_click");
        ADS_VIDEO_CLICK = feedFeatures72;
        FeedFeatures feedFeatures73 = new FeedFeatures("FEED_CLIP_BANNER_AD_PRELOAD", 72, "feed_clip_banner_ad_preload");
        FEED_CLIP_BANNER_AD_PRELOAD = feedFeatures73;
        FeedFeatures feedFeatures74 = new FeedFeatures("FEED_REMOVE_CUSTOM_REACTIONS", 73, "feed_remove_custom_reactions");
        FEED_REMOVE_CUSTOM_REACTIONS = feedFeatures74;
        FeedFeatures[] feedFeaturesArr = {feedFeatures, feedFeatures2, feedFeatures3, feedFeatures4, feedFeatures5, feedFeatures6, feedFeatures7, feedFeatures8, feedFeatures9, feedFeatures10, feedFeatures11, feedFeatures12, feedFeatures13, feedFeatures14, feedFeatures15, feedFeatures16, feedFeatures17, feedFeatures18, feedFeatures19, feedFeatures20, feedFeatures21, feedFeatures22, feedFeatures23, feedFeatures24, feedFeatures25, feedFeatures26, feedFeatures27, feedFeatures28, feedFeatures29, feedFeatures30, feedFeatures31, feedFeatures32, feedFeatures33, feedFeatures34, feedFeatures35, feedFeatures36, feedFeatures37, feedFeatures38, feedFeatures39, feedFeatures40, feedFeatures41, feedFeatures42, feedFeatures43, feedFeatures44, feedFeatures45, feedFeatures46, feedFeatures47, feedFeatures48, feedFeatures49, feedFeatures50, feedFeatures51, feedFeatures52, feedFeatures53, feedFeatures54, feedFeatures55, feedFeatures56, feedFeatures57, feedFeatures58, feedFeatures59, feedFeatures60, feedFeatures61, feedFeatures62, feedFeatures63, feedFeatures64, feedFeatures65, feedFeatures66, feedFeatures67, feedFeatures68, feedFeatures69, feedFeatures70, feedFeatures71, feedFeatures72, feedFeatures73, feedFeatures74};
        $VALUES = feedFeaturesArr;
        $ENTRIES = new asp(feedFeaturesArr);
    }

    public FeedFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<FeedFeatures> i() {
        return $ENTRIES;
    }

    public static FeedFeatures valueOf(String str) {
        return (FeedFeatures) Enum.valueOf(FeedFeatures.class, str);
    }

    public static FeedFeatures[] values() {
        return (FeedFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
