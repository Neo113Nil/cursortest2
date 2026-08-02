package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsFeatures.kt */
/* loaded from: classes11.dex */
public final class ClipsFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsFeatures[] $VALUES;
    public static final ClipsFeatures CLIPS_ADS_SDK_CAROUSEL;
    public static final ClipsFeatures CLIPS_ADS_SDK_LABEL;
    public static final ClipsFeatures CLIPS_ADS_SDK_PROMO;
    public static final ClipsFeatures CLIPS_ADS_SDK_STATIC_AD;
    public static final ClipsFeatures CLIPS_ADS_SDK_VIDEO;
    public static final ClipsFeatures CLIPS_ADS_SDK_VIDEO_OWNER;
    public static final ClipsFeatures CLIPS_AD_BANNER_COMPANION;
    public static final ClipsFeatures CLIPS_AD_BANNER_COMPANION_FOR_SELLERS;
    public static final ClipsFeatures CLIPS_ARGUMENTS_PREFETCH;
    public static final ClipsFeatures CLIPS_AUDIO_DECODER_OPTIMIZATION;
    public static final ClipsFeatures CLIPS_AUTO_SCROLL;
    public static final ClipsFeatures CLIPS_CACHE_LOCATION_CONFIG;
    public static final ClipsFeatures CLIPS_DEVICE_VOLUME;
    public static final ClipsFeatures CLIPS_DISABLE_GRID_BATCH;
    public static final ClipsFeatures CLIPS_DYNAMIC_CLIP_BUFFER;
    public static final ClipsFeatures CLIPS_ENABLE_TWO_WAY_PAGINATION;
    public static final ClipsFeatures CLIPS_FEED_ENGINE;
    public static final ClipsFeatures CLIPS_FRIENDS_ACTIVITIES;
    public static final ClipsFeatures CLIPS_FRIENDS_COMMENTS;
    public static final ClipsFeatures CLIPS_GET_RECOM;
    public static final ClipsFeatures CLIPS_HEADER_DISABLE_PLUS;
    public static final ClipsFeatures CLIPS_HIDE_COUNTERS;
    public static final ClipsFeatures CLIPS_MARKET_AD;
    public static final ClipsFeatures CLIPS_MARKET_AD_CHOICES;
    public static final ClipsFeatures CLIPS_MARKET_AD_HEADER_CLICKS;
    public static final ClipsFeatures CLIPS_NEWS_MONOTHEME;
    public static final ClipsFeatures CLIPS_NEW_DRAFT_SDK_ENABLED;
    public static final ClipsFeatures CLIPS_NEW_UPLOADER;
    public static final ClipsFeatures CLIPS_NEW_UPLOAD_RULES_DISCLAIMER;
    public static final ClipsFeatures CLIPS_PIPELINE_BITRATE_REWORK;
    public static final ClipsFeatures CLIPS_PRODUCT_ITEMS_SHOW_TIME;
    public static final ClipsFeatures CLIPS_RECOM_EVENTS;
    public static final ClipsFeatures CLIPS_TITLE_IN_RETENTION_BLOCK;
    public static final ClipsFeatures CLIPS_TOPBAR_SHOPS_TAB_ONBOARDING;
    public static final ClipsFeatures CLIPS_TOPBAR_TABS;
    public static final ClipsFeatures CLIPS_TOPBAR_TABS_BLOCKS;
    public static final ClipsFeatures CLIPS_TOPBAR_TABS_CONFIG;
    public static final ClipsFeatures CLIPS_TOPBAR_TABS_SCROLL;
    public static final ClipsFeatures CLIPS_TRENDS_FULLSCREEN;
    public static final ClipsFeatures CLIPS_TREND_ENGAGEMENT_GROWTH;
    public static final ClipsFeatures CLIPS_YANDEX_AD_PARAMS;
    public static final ClipsFeatures CLIP_CREATE_SESSION_DATA_COLLECTOR;
    public static final ClipsFeatures COAUTHORS_REDESIGN;
    public static final ClipsFeatures FEATURE_CLIPS_GRID_LIVE_AVATAR;
    public static final ClipsFeatures FEED_CACHE_TIMEOUT;
    public static final ClipsFeatures FEED_CHUNKS_INIT_SIZE;
    public static final ClipsFeatures FEED_CHUNKS_SETTINGS;
    public static final ClipsFeatures FEED_END_REWATCH_NEW_AD;
    public static final ClipsFeatures FEED_NATIVE_TRANSITION;
    public static final ClipsFeatures FEED_NATIVE_TRANSITION_LOW_PERF;
    public static final ClipsFeatures HIDE_FAB_IN_ADS;
    public static final ClipsFeatures IMMEDIATE_ACTION_HANDLER;
    public static final ClipsFeatures NEW_VIEWS_FORMAT;
    public static final ClipsFeatures NON_BLOCKING_PREFETCH;
    public static final ClipsFeatures VIDEO_BUGREPORT;
    public static final ClipsFeatures VP_UV_NEW_STAT;
    public static final ClipsFeatures VP_UV_OLD_STAT;
    private final String key;

    static {
        ClipsFeatures clipsFeatures = new ClipsFeatures("CLIP_CREATE_SESSION_DATA_COLLECTOR", 0, "clips_session_collect");
        CLIP_CREATE_SESSION_DATA_COLLECTOR = clipsFeatures;
        ClipsFeatures clipsFeatures2 = new ClipsFeatures("CLIPS_ENABLE_TWO_WAY_PAGINATION", 1, "clips_two_way_pagination");
        CLIPS_ENABLE_TWO_WAY_PAGINATION = clipsFeatures2;
        ClipsFeatures clipsFeatures3 = new ClipsFeatures("CLIPS_AUDIO_DECODER_OPTIMIZATION", 2, "clips_audio_decoder_optimize");
        CLIPS_AUDIO_DECODER_OPTIMIZATION = clipsFeatures3;
        ClipsFeatures clipsFeatures4 = new ClipsFeatures("CLIPS_PIPELINE_BITRATE_REWORK", 3, "clips_pipeline_bitrate_rework");
        CLIPS_PIPELINE_BITRATE_REWORK = clipsFeatures4;
        ClipsFeatures clipsFeatures5 = new ClipsFeatures("CLIPS_NEW_UPLOADER", 4, "clips_new_uploader");
        CLIPS_NEW_UPLOADER = clipsFeatures5;
        ClipsFeatures clipsFeatures6 = new ClipsFeatures("CLIPS_TRENDS_FULLSCREEN", 5, "clips_trends_fullscreen");
        CLIPS_TRENDS_FULLSCREEN = clipsFeatures6;
        ClipsFeatures clipsFeatures7 = new ClipsFeatures("CLIPS_NEW_DRAFT_SDK_ENABLED", 6, "clips_new_draft_sdk_enabled");
        CLIPS_NEW_DRAFT_SDK_ENABLED = clipsFeatures7;
        ClipsFeatures clipsFeatures8 = new ClipsFeatures("CLIPS_NEW_UPLOAD_RULES_DISCLAIMER", 7, "clips_new_upload_rules_disclaimer");
        CLIPS_NEW_UPLOAD_RULES_DISCLAIMER = clipsFeatures8;
        ClipsFeatures clipsFeatures9 = new ClipsFeatures("COAUTHORS_REDESIGN", 8, "clips_coauthors_redesign");
        COAUTHORS_REDESIGN = clipsFeatures9;
        ClipsFeatures clipsFeatures10 = new ClipsFeatures("VIDEO_BUGREPORT", 9, "clips_video_bugreport");
        VIDEO_BUGREPORT = clipsFeatures10;
        ClipsFeatures clipsFeatures11 = new ClipsFeatures("CLIPS_ARGUMENTS_PREFETCH", 10, "clips_arguments_prefetch");
        CLIPS_ARGUMENTS_PREFETCH = clipsFeatures11;
        ClipsFeatures clipsFeatures12 = new ClipsFeatures("CLIPS_DYNAMIC_CLIP_BUFFER", 11, "clips_dynamic_clip_buffer");
        CLIPS_DYNAMIC_CLIP_BUFFER = clipsFeatures12;
        ClipsFeatures clipsFeatures13 = new ClipsFeatures("IMMEDIATE_ACTION_HANDLER", 12, "clips_immediate_action_handler");
        IMMEDIATE_ACTION_HANDLER = clipsFeatures13;
        ClipsFeatures clipsFeatures14 = new ClipsFeatures("NON_BLOCKING_PREFETCH", 13, "clips_non_block_prefetch");
        NON_BLOCKING_PREFETCH = clipsFeatures14;
        ClipsFeatures clipsFeatures15 = new ClipsFeatures("NEW_VIEWS_FORMAT", 14, "clips_new_views_format");
        NEW_VIEWS_FORMAT = clipsFeatures15;
        ClipsFeatures clipsFeatures16 = new ClipsFeatures("FEATURE_CLIPS_GRID_LIVE_AVATAR", 15, "clips_grid_live_avatar");
        FEATURE_CLIPS_GRID_LIVE_AVATAR = clipsFeatures16;
        ClipsFeatures clipsFeatures17 = new ClipsFeatures("FEED_CACHE_TIMEOUT", 16, "clips_feed_cache_timeout");
        FEED_CACHE_TIMEOUT = clipsFeatures17;
        ClipsFeatures clipsFeatures18 = new ClipsFeatures("FEED_CHUNKS_SETTINGS", 17, "clips_top_chunks_settings");
        FEED_CHUNKS_SETTINGS = clipsFeatures18;
        ClipsFeatures clipsFeatures19 = new ClipsFeatures("FEED_CHUNKS_INIT_SIZE", 18, "clips_top_chunk_initial_size");
        FEED_CHUNKS_INIT_SIZE = clipsFeatures19;
        ClipsFeatures clipsFeatures20 = new ClipsFeatures("FEED_NATIVE_TRANSITION", 19, "clips_feed_native_transition");
        FEED_NATIVE_TRANSITION = clipsFeatures20;
        ClipsFeatures clipsFeatures21 = new ClipsFeatures("FEED_NATIVE_TRANSITION_LOW_PERF", 20, "clips_feed_transition_low_perf");
        FEED_NATIVE_TRANSITION_LOW_PERF = clipsFeatures21;
        ClipsFeatures clipsFeatures22 = new ClipsFeatures("CLIPS_HEADER_DISABLE_PLUS", 21, "clips_header_disable_plus");
        CLIPS_HEADER_DISABLE_PLUS = clipsFeatures22;
        ClipsFeatures clipsFeatures23 = new ClipsFeatures("CLIPS_HIDE_COUNTERS", 22, "clips_hide_counters");
        CLIPS_HIDE_COUNTERS = clipsFeatures23;
        ClipsFeatures clipsFeatures24 = new ClipsFeatures("CLIPS_GET_RECOM", 23, "clips_get_recom");
        CLIPS_GET_RECOM = clipsFeatures24;
        ClipsFeatures clipsFeatures25 = new ClipsFeatures("CLIPS_PRODUCT_ITEMS_SHOW_TIME", 24, "clips_product_items_show_time");
        CLIPS_PRODUCT_ITEMS_SHOW_TIME = clipsFeatures25;
        ClipsFeatures clipsFeatures26 = new ClipsFeatures("CLIPS_TITLE_IN_RETENTION_BLOCK", 25, "clips_title_in_retention");
        CLIPS_TITLE_IN_RETENTION_BLOCK = clipsFeatures26;
        ClipsFeatures clipsFeatures27 = new ClipsFeatures("CLIPS_YANDEX_AD_PARAMS", 26, "clips_yandex_ad_params");
        CLIPS_YANDEX_AD_PARAMS = clipsFeatures27;
        ClipsFeatures clipsFeatures28 = new ClipsFeatures("CLIPS_MARKET_AD", 27, "clips_market_ad");
        CLIPS_MARKET_AD = clipsFeatures28;
        ClipsFeatures clipsFeatures29 = new ClipsFeatures("CLIPS_MARKET_AD_CHOICES", 28, "clips_market_ad_choices");
        CLIPS_MARKET_AD_CHOICES = clipsFeatures29;
        ClipsFeatures clipsFeatures30 = new ClipsFeatures("CLIPS_AD_BANNER_COMPANION", 29, "clips_ad_banner_comp_common");
        CLIPS_AD_BANNER_COMPANION = clipsFeatures30;
        ClipsFeatures clipsFeatures31 = new ClipsFeatures("CLIPS_AD_BANNER_COMPANION_FOR_SELLERS", 30, "clips_ad_banner_companion");
        CLIPS_AD_BANNER_COMPANION_FOR_SELLERS = clipsFeatures31;
        ClipsFeatures clipsFeatures32 = new ClipsFeatures("CLIPS_FEED_ENGINE", 31, "clips_feed_engine");
        CLIPS_FEED_ENGINE = clipsFeatures32;
        ClipsFeatures clipsFeatures33 = new ClipsFeatures("CLIPS_FRIENDS_ACTIVITIES", 32, "clips_friends_activities");
        CLIPS_FRIENDS_ACTIVITIES = clipsFeatures33;
        ClipsFeatures clipsFeatures34 = new ClipsFeatures("CLIPS_FRIENDS_COMMENTS", 33, "clips_friends_comments");
        CLIPS_FRIENDS_COMMENTS = clipsFeatures34;
        ClipsFeatures clipsFeatures35 = new ClipsFeatures("CLIPS_TREND_ENGAGEMENT_GROWTH", 34, "clips_trend_engagement_growth");
        CLIPS_TREND_ENGAGEMENT_GROWTH = clipsFeatures35;
        ClipsFeatures clipsFeatures36 = new ClipsFeatures("CLIPS_RECOM_EVENTS", 35, "clips_recom_events");
        CLIPS_RECOM_EVENTS = clipsFeatures36;
        ClipsFeatures clipsFeatures37 = new ClipsFeatures("CLIPS_ADS_SDK_VIDEO", 36, "clips_ads_sdk_video");
        CLIPS_ADS_SDK_VIDEO = clipsFeatures37;
        ClipsFeatures clipsFeatures38 = new ClipsFeatures("CLIPS_ADS_SDK_STATIC_AD", 37, "clips_ads_sdk_static");
        CLIPS_ADS_SDK_STATIC_AD = clipsFeatures38;
        ClipsFeatures clipsFeatures39 = new ClipsFeatures("CLIPS_ADS_SDK_CAROUSEL", 38, "clips_ads_sdk_carousel");
        CLIPS_ADS_SDK_CAROUSEL = clipsFeatures39;
        ClipsFeatures clipsFeatures40 = new ClipsFeatures("CLIPS_ADS_SDK_PROMO", 39, "clips_ads_sdk_promo");
        CLIPS_ADS_SDK_PROMO = clipsFeatures40;
        ClipsFeatures clipsFeatures41 = new ClipsFeatures("CLIPS_ADS_SDK_VIDEO_OWNER", 40, "clips_ads_sdk_video_owner");
        CLIPS_ADS_SDK_VIDEO_OWNER = clipsFeatures41;
        ClipsFeatures clipsFeatures42 = new ClipsFeatures("FEED_END_REWATCH_NEW_AD", 41, "clips_feed_end_rewatch_new_ad");
        FEED_END_REWATCH_NEW_AD = clipsFeatures42;
        ClipsFeatures clipsFeatures43 = new ClipsFeatures("HIDE_FAB_IN_ADS", 42, "clips_hide_fab_in_ads");
        HIDE_FAB_IN_ADS = clipsFeatures43;
        ClipsFeatures clipsFeatures44 = new ClipsFeatures("CLIPS_TOPBAR_TABS", 43, "clips_topbar_tabs");
        CLIPS_TOPBAR_TABS = clipsFeatures44;
        ClipsFeatures clipsFeatures45 = new ClipsFeatures("CLIPS_ADS_SDK_LABEL", 44, "clips_ads_sdk_label");
        CLIPS_ADS_SDK_LABEL = clipsFeatures45;
        ClipsFeatures clipsFeatures46 = new ClipsFeatures("CLIPS_TOPBAR_TABS_SCROLL", 45, "clips_topbar_tabs_scroll");
        CLIPS_TOPBAR_TABS_SCROLL = clipsFeatures46;
        ClipsFeatures clipsFeatures47 = new ClipsFeatures("VP_UV_OLD_STAT", 46, "vp_uv_old_stat");
        VP_UV_OLD_STAT = clipsFeatures47;
        ClipsFeatures clipsFeatures48 = new ClipsFeatures("VP_UV_NEW_STAT", 47, "vp_uv_new_stat");
        VP_UV_NEW_STAT = clipsFeatures48;
        ClipsFeatures clipsFeatures49 = new ClipsFeatures("CLIPS_NEWS_MONOTHEME", 48, "clips_news_monotheme");
        CLIPS_NEWS_MONOTHEME = clipsFeatures49;
        ClipsFeatures clipsFeatures50 = new ClipsFeatures("CLIPS_TOPBAR_TABS_CONFIG", 49, "clips_topbar_tabs_config");
        CLIPS_TOPBAR_TABS_CONFIG = clipsFeatures50;
        ClipsFeatures clipsFeatures51 = new ClipsFeatures("CLIPS_CACHE_LOCATION_CONFIG", 50, "clips_cache_location_config");
        CLIPS_CACHE_LOCATION_CONFIG = clipsFeatures51;
        ClipsFeatures clipsFeatures52 = new ClipsFeatures("CLIPS_TOPBAR_TABS_BLOCKS", 51, "clips_topbar_tabs_blocks");
        CLIPS_TOPBAR_TABS_BLOCKS = clipsFeatures52;
        ClipsFeatures clipsFeatures53 = new ClipsFeatures("CLIPS_DISABLE_GRID_BATCH", 52, "clips_disable_grid_batch");
        CLIPS_DISABLE_GRID_BATCH = clipsFeatures53;
        ClipsFeatures clipsFeatures54 = new ClipsFeatures("CLIPS_TOPBAR_SHOPS_TAB_ONBOARDING", 53, "clips_shops_tab_onboarding");
        CLIPS_TOPBAR_SHOPS_TAB_ONBOARDING = clipsFeatures54;
        ClipsFeatures clipsFeatures55 = new ClipsFeatures("CLIPS_AUTO_SCROLL", 54, "clips_auto_scroll");
        CLIPS_AUTO_SCROLL = clipsFeatures55;
        ClipsFeatures clipsFeatures56 = new ClipsFeatures("CLIPS_MARKET_AD_HEADER_CLICKS", 55, "clips_market_ad_header_clicks");
        CLIPS_MARKET_AD_HEADER_CLICKS = clipsFeatures56;
        ClipsFeatures clipsFeatures57 = new ClipsFeatures("CLIPS_DEVICE_VOLUME", 56, "clips_device_volume");
        CLIPS_DEVICE_VOLUME = clipsFeatures57;
        ClipsFeatures[] clipsFeaturesArr = {clipsFeatures, clipsFeatures2, clipsFeatures3, clipsFeatures4, clipsFeatures5, clipsFeatures6, clipsFeatures7, clipsFeatures8, clipsFeatures9, clipsFeatures10, clipsFeatures11, clipsFeatures12, clipsFeatures13, clipsFeatures14, clipsFeatures15, clipsFeatures16, clipsFeatures17, clipsFeatures18, clipsFeatures19, clipsFeatures20, clipsFeatures21, clipsFeatures22, clipsFeatures23, clipsFeatures24, clipsFeatures25, clipsFeatures26, clipsFeatures27, clipsFeatures28, clipsFeatures29, clipsFeatures30, clipsFeatures31, clipsFeatures32, clipsFeatures33, clipsFeatures34, clipsFeatures35, clipsFeatures36, clipsFeatures37, clipsFeatures38, clipsFeatures39, clipsFeatures40, clipsFeatures41, clipsFeatures42, clipsFeatures43, clipsFeatures44, clipsFeatures45, clipsFeatures46, clipsFeatures47, clipsFeatures48, clipsFeatures49, clipsFeatures50, clipsFeatures51, clipsFeatures52, clipsFeatures53, clipsFeatures54, clipsFeatures55, clipsFeatures56, clipsFeatures57};
        $VALUES = clipsFeaturesArr;
        $ENTRIES = new asp(clipsFeaturesArr);
    }

    public ClipsFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<ClipsFeatures> i() {
        return $ENTRIES;
    }

    public static ClipsFeatures valueOf(String str) {
        return (ClipsFeatures) Enum.valueOf(ClipsFeatures.class, str);
    }

    public static ClipsFeatures[] values() {
        return (ClipsFeatures[]) $VALUES.clone();
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
