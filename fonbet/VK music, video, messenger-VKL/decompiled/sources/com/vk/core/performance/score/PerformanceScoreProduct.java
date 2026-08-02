package com.vk.core.performance.score;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PerformanceScoreProduct.kt */
/* loaded from: classes17.dex */
public final class PerformanceScoreProduct {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PerformanceScoreProduct[] $VALUES;
    public static final PerformanceScoreProduct CLIPS;
    public static final PerformanceScoreProduct CLIPS_EDITOR;
    public static final PerformanceScoreProduct CLIPS_MEDIAPICKER_MEDIA;
    public static final PerformanceScoreProduct CLIPS_PUBLISH;
    public static final PerformanceScoreProduct COMMUNITIES_CATALOG;
    public static final PerformanceScoreProduct COMMUNITY_BIZ_CHECKLIST;
    public static final PerformanceScoreProduct COMMUNITY_REVIEWS;
    public static final PerformanceScoreProduct COMMUNITY_REVIEW_DETAIL;
    public static final PerformanceScoreProduct DISCOVER_MEDIA;
    public static final PerformanceScoreProduct FEED;
    public static final PerformanceScoreProduct FEED_POST;
    public static final PerformanceScoreProduct GAME;
    public static final PerformanceScoreProduct GAMES_CATALOG;
    public static final PerformanceScoreProduct GROUP;
    public static final PerformanceScoreProduct IM;
    public static final PerformanceScoreProduct IM_CHAT;
    public static final PerformanceScoreProduct IM_GROUP;
    public static final PerformanceScoreProduct IM_GROUP_CHAT;
    public static final PerformanceScoreProduct INVITE_FRIENDS_BIZ;
    public static final PerformanceScoreProduct MARKETPLACE_MAIN;
    public static final PerformanceScoreProduct MARKET_CARTS_LIST;
    public static final PerformanceScoreProduct MARKET_CHECKOUT;
    public static final PerformanceScoreProduct MARKET_ITEM;
    public static final PerformanceScoreProduct MARKET_ITEM_COMMENTS;
    public static final PerformanceScoreProduct MARKET_ITEM_REVIEW_CREATE;
    public static final PerformanceScoreProduct MARKET_ITEM_REVIEW_LIST;
    public static final PerformanceScoreProduct MARKET_ONLINE_BOOKING_CALENDAR;
    public static final PerformanceScoreProduct MARKET_ONLINE_BOOKING_MASTERS;
    public static final PerformanceScoreProduct MARKET_ONLINE_BOOKING_MENU;
    public static final PerformanceScoreProduct MARKET_ONLINE_BOOKING_SERVICES;
    public static final PerformanceScoreProduct MARKET_REVIEWS_SECTION;
    public static final PerformanceScoreProduct MARKET_STOREFRONT;
    public static final PerformanceScoreProduct MINIAPP;
    public static final PerformanceScoreProduct MINIAPP_INTERNAL;
    public static final PerformanceScoreProduct MUSIC_CATALOG;
    public static final PerformanceScoreProduct NOTIFICATIONS;
    public static final PerformanceScoreProduct PROFILE;
    public static final PerformanceScoreProduct SEARCH_VIDEO_SERVICE;
    public static final PerformanceScoreProduct SETTINGS_FILTER_NEWSFEED;
    public static final PerformanceScoreProduct STICKERS_CATALOG;
    public static final PerformanceScoreProduct STOREFRONT_ALBUMS;
    public static final PerformanceScoreProduct STORY_CAMERA;
    public static final PerformanceScoreProduct SUPERAPP;
    public static final PerformanceScoreProduct TV_AUTOR_PAGE;
    public static final PerformanceScoreProduct TV_MAIN;
    public static final PerformanceScoreProduct TV_PLAYER;
    public static final PerformanceScoreProduct TV_SEARCH_INPUT;
    public static final PerformanceScoreProduct VIDEO_CATALOG;
    public static final PerformanceScoreProduct VIDEO_CHANNEL;
    public static final PerformanceScoreProduct VIDEO_DISCOVERY;
    public static final PerformanceScoreProduct VIDEO_PLAYLIST;
    public static final PerformanceScoreProduct VIDEO_SUBSCRIPTIONS;
    public static final PerformanceScoreProduct VIDEO_USER_PROFILE;
    private final String productName;
    private final String screenName;

    static {
        PerformanceScoreProduct performanceScoreProduct = new PerformanceScoreProduct("PROFILE", 0, "core", "PROFILE");
        PROFILE = performanceScoreProduct;
        PerformanceScoreProduct performanceScoreProduct2 = new PerformanceScoreProduct("GROUP", 1, "community", "GROUP");
        GROUP = performanceScoreProduct2;
        PerformanceScoreProduct performanceScoreProduct3 = new PerformanceScoreProduct("MUSIC_CATALOG", 2, "music", "AUDIO_CATALOG");
        MUSIC_CATALOG = performanceScoreProduct3;
        PerformanceScoreProduct performanceScoreProduct4 = new PerformanceScoreProduct("STICKERS_CATALOG", 3, "stickers", "STICKERS_CATALOG_SEARCH");
        STICKERS_CATALOG = performanceScoreProduct4;
        PerformanceScoreProduct performanceScoreProduct5 = new PerformanceScoreProduct("IM", 4, "im", "IM");
        IM = performanceScoreProduct5;
        PerformanceScoreProduct performanceScoreProduct6 = new PerformanceScoreProduct("IM_GROUP", 5, "im", "IM_GROUP");
        IM_GROUP = performanceScoreProduct6;
        PerformanceScoreProduct performanceScoreProduct7 = new PerformanceScoreProduct("IM_CHAT", 6, "im", "IM_CHAT");
        IM_CHAT = performanceScoreProduct7;
        PerformanceScoreProduct performanceScoreProduct8 = new PerformanceScoreProduct("IM_GROUP_CHAT", 7, "im", "IM_GROUP_CHAT");
        IM_GROUP_CHAT = performanceScoreProduct8;
        PerformanceScoreProduct performanceScoreProduct9 = new PerformanceScoreProduct("CLIPS", 8, "clips", "CLIPS");
        CLIPS = performanceScoreProduct9;
        PerformanceScoreProduct performanceScoreProduct10 = new PerformanceScoreProduct("CLIPS_MEDIAPICKER_MEDIA", 9, "clips", "CLIPS_MEDIAPICKER_MEDIA");
        CLIPS_MEDIAPICKER_MEDIA = performanceScoreProduct10;
        PerformanceScoreProduct performanceScoreProduct11 = new PerformanceScoreProduct("CLIPS_EDITOR", 10, "clips", "CLIPS_EDITOR");
        CLIPS_EDITOR = performanceScoreProduct11;
        PerformanceScoreProduct performanceScoreProduct12 = new PerformanceScoreProduct("CLIPS_PUBLISH", 11, "clips", "CLIPS_PUBLISH");
        CLIPS_PUBLISH = performanceScoreProduct12;
        PerformanceScoreProduct performanceScoreProduct13 = new PerformanceScoreProduct("STORY_CAMERA", 12, "story", "STORY_CAMERA");
        STORY_CAMERA = performanceScoreProduct13;
        PerformanceScoreProduct performanceScoreProduct14 = new PerformanceScoreProduct("SUPERAPP", 13, "core", "SUPER_APP");
        SUPERAPP = performanceScoreProduct14;
        PerformanceScoreProduct performanceScoreProduct15 = new PerformanceScoreProduct("FEED", 14, "feed", "FEED");
        FEED = performanceScoreProduct15;
        PerformanceScoreProduct performanceScoreProduct16 = new PerformanceScoreProduct("DISCOVER_MEDIA", 15, "feed", "DISCOVER_MEDIA");
        DISCOVER_MEDIA = performanceScoreProduct16;
        PerformanceScoreProduct performanceScoreProduct17 = new PerformanceScoreProduct("VIDEO_CATALOG", 16, "video", "VIDEO_CATALOG");
        VIDEO_CATALOG = performanceScoreProduct17;
        PerformanceScoreProduct performanceScoreProduct18 = new PerformanceScoreProduct("VIDEO_SUBSCRIPTIONS", 17, "video", "VIDEO_SUBSCRIPTIONS");
        VIDEO_SUBSCRIPTIONS = performanceScoreProduct18;
        PerformanceScoreProduct performanceScoreProduct19 = new PerformanceScoreProduct("VIDEO_DISCOVERY", 18, "video", "VIDEO_DISCOVERY");
        VIDEO_DISCOVERY = performanceScoreProduct19;
        PerformanceScoreProduct performanceScoreProduct20 = new PerformanceScoreProduct("SEARCH_VIDEO_SERVICE", 19, "search", "SEARCH_VIDEO_SERVICE");
        SEARCH_VIDEO_SERVICE = performanceScoreProduct20;
        PerformanceScoreProduct performanceScoreProduct21 = new PerformanceScoreProduct("MINIAPP", 20, "super_app", "MINI_APP");
        MINIAPP = performanceScoreProduct21;
        PerformanceScoreProduct performanceScoreProduct22 = new PerformanceScoreProduct("GAME", 21, "super_app", "GAME");
        GAME = performanceScoreProduct22;
        PerformanceScoreProduct performanceScoreProduct23 = new PerformanceScoreProduct("GAMES_CATALOG", 22, "super_app", "GAMES_CATALOG");
        GAMES_CATALOG = performanceScoreProduct23;
        PerformanceScoreProduct performanceScoreProduct24 = new PerformanceScoreProduct("MINIAPP_INTERNAL", 23, "super_app", "MINI_APP_INTERNAL");
        MINIAPP_INTERNAL = performanceScoreProduct24;
        PerformanceScoreProduct performanceScoreProduct25 = new PerformanceScoreProduct("FEED_POST", 24, "feed", "FEED_POST");
        FEED_POST = performanceScoreProduct25;
        PerformanceScoreProduct performanceScoreProduct26 = new PerformanceScoreProduct("MARKET_STOREFRONT", 25, "ecomm", "MARKET");
        MARKET_STOREFRONT = performanceScoreProduct26;
        PerformanceScoreProduct performanceScoreProduct27 = new PerformanceScoreProduct("MARKET_ITEM", 26, "ecomm", "MARKET_ITEM");
        MARKET_ITEM = performanceScoreProduct27;
        PerformanceScoreProduct performanceScoreProduct28 = new PerformanceScoreProduct("MARKET_CARTS_LIST", 27, "ecomm", "MARKET_CARTS_LIST");
        MARKET_CARTS_LIST = performanceScoreProduct28;
        PerformanceScoreProduct performanceScoreProduct29 = new PerformanceScoreProduct("MARKET_CHECKOUT", 28, "ecomm", "MARKET_CHECKOUT");
        MARKET_CHECKOUT = performanceScoreProduct29;
        PerformanceScoreProduct performanceScoreProduct30 = new PerformanceScoreProduct("MARKET_ONLINE_BOOKING_MENU", 29, "ecomm", "ONLINE_BOOKING_MENU");
        MARKET_ONLINE_BOOKING_MENU = performanceScoreProduct30;
        PerformanceScoreProduct performanceScoreProduct31 = new PerformanceScoreProduct("MARKET_ONLINE_BOOKING_MASTERS", 30, "ecomm", "ONLINE_BOOKING_SPECIALISTS");
        MARKET_ONLINE_BOOKING_MASTERS = performanceScoreProduct31;
        PerformanceScoreProduct performanceScoreProduct32 = new PerformanceScoreProduct("MARKET_ONLINE_BOOKING_SERVICES", 31, "ecomm", "ONLINE_BOOKING_SERVICES_CATALOG");
        MARKET_ONLINE_BOOKING_SERVICES = performanceScoreProduct32;
        PerformanceScoreProduct performanceScoreProduct33 = new PerformanceScoreProduct("MARKET_ONLINE_BOOKING_CALENDAR", 32, "ecomm", "ONLINE_BOOKING_DATE_TIME");
        MARKET_ONLINE_BOOKING_CALENDAR = performanceScoreProduct33;
        PerformanceScoreProduct performanceScoreProduct34 = new PerformanceScoreProduct("SETTINGS_FILTER_NEWSFEED", 33, "feed", "SETTINGS_FILTER_NEWSFEED");
        SETTINGS_FILTER_NEWSFEED = performanceScoreProduct34;
        PerformanceScoreProduct performanceScoreProduct35 = new PerformanceScoreProduct("NOTIFICATIONS", 34, "notify", "NOTIFICATIONS");
        NOTIFICATIONS = performanceScoreProduct35;
        PerformanceScoreProduct performanceScoreProduct36 = new PerformanceScoreProduct("COMMUNITIES_CATALOG", 35, "search", "GROUPS_LIST");
        COMMUNITIES_CATALOG = performanceScoreProduct36;
        PerformanceScoreProduct performanceScoreProduct37 = new PerformanceScoreProduct("MARKETPLACE_MAIN", 36, "ecomm", "MARKETPLACE_MAIN");
        MARKETPLACE_MAIN = performanceScoreProduct37;
        PerformanceScoreProduct performanceScoreProduct38 = new PerformanceScoreProduct("COMMUNITY_BIZ_CHECKLIST", 37, "ecomm", "COMMUNITY_BIZ_CHECKLIST");
        COMMUNITY_BIZ_CHECKLIST = performanceScoreProduct38;
        PerformanceScoreProduct performanceScoreProduct39 = new PerformanceScoreProduct("COMMUNITY_REVIEWS", 38, "soccom", "REVIEW_LIST");
        COMMUNITY_REVIEWS = performanceScoreProduct39;
        PerformanceScoreProduct performanceScoreProduct40 = new PerformanceScoreProduct("MARKET_ITEM_REVIEW_LIST", 39, "smb", "MARKET_ITEM_REVIEW_LIST");
        MARKET_ITEM_REVIEW_LIST = performanceScoreProduct40;
        PerformanceScoreProduct performanceScoreProduct41 = new PerformanceScoreProduct("MARKET_ITEM_REVIEW_CREATE", 40, "smb", "MARKET_ITEM_REVIEW_CREATE");
        MARKET_ITEM_REVIEW_CREATE = performanceScoreProduct41;
        PerformanceScoreProduct performanceScoreProduct42 = new PerformanceScoreProduct("MARKET_REVIEWS_SECTION", 41, "soccom", "MARKET_REVIEWS_SECTION");
        MARKET_REVIEWS_SECTION = performanceScoreProduct42;
        PerformanceScoreProduct performanceScoreProduct43 = new PerformanceScoreProduct("MARKET_ITEM_COMMENTS", 42, "soccom", "MARKET_ITEM_COMMENTS");
        MARKET_ITEM_COMMENTS = performanceScoreProduct43;
        PerformanceScoreProduct performanceScoreProduct44 = new PerformanceScoreProduct("COMMUNITY_REVIEW_DETAIL", 43, "soccom", "COMMUNITY_REVIEW_DETAIL");
        COMMUNITY_REVIEW_DETAIL = performanceScoreProduct44;
        PerformanceScoreProduct performanceScoreProduct45 = new PerformanceScoreProduct("INVITE_FRIENDS_BIZ", 44, "soccom", "COMMUNITY_INVITE_FRIENDS_BIZ");
        INVITE_FRIENDS_BIZ = performanceScoreProduct45;
        PerformanceScoreProduct performanceScoreProduct46 = new PerformanceScoreProduct("TV_SEARCH_INPUT", 45, "video", "TV_NEW_SEARCH_INPUT");
        TV_SEARCH_INPUT = performanceScoreProduct46;
        PerformanceScoreProduct performanceScoreProduct47 = new PerformanceScoreProduct("STOREFRONT_ALBUMS", 46, "soccom", "MARKET_ALBUMS");
        STOREFRONT_ALBUMS = performanceScoreProduct47;
        PerformanceScoreProduct performanceScoreProduct48 = new PerformanceScoreProduct("TV_AUTOR_PAGE", 47, "video", "TV_AUTOR_PAGE");
        TV_AUTOR_PAGE = performanceScoreProduct48;
        PerformanceScoreProduct performanceScoreProduct49 = new PerformanceScoreProduct("VIDEO_USER_PROFILE", 48, "video", "PROFILE");
        VIDEO_USER_PROFILE = performanceScoreProduct49;
        PerformanceScoreProduct performanceScoreProduct50 = new PerformanceScoreProduct("VIDEO_CHANNEL", 49, "video", "VIDEO_PROFILE");
        VIDEO_CHANNEL = performanceScoreProduct50;
        PerformanceScoreProduct performanceScoreProduct51 = new PerformanceScoreProduct("VIDEO_PLAYLIST", 50, "video", "VIDEO_PLAYLIST");
        VIDEO_PLAYLIST = performanceScoreProduct51;
        PerformanceScoreProduct performanceScoreProduct52 = new PerformanceScoreProduct("TV_PLAYER", 51, "video", "TV_PLAYER");
        TV_PLAYER = performanceScoreProduct52;
        PerformanceScoreProduct performanceScoreProduct53 = new PerformanceScoreProduct("TV_MAIN", 52, "video", "TV_MENU");
        TV_MAIN = performanceScoreProduct53;
        PerformanceScoreProduct[] performanceScoreProductArr = {performanceScoreProduct, performanceScoreProduct2, performanceScoreProduct3, performanceScoreProduct4, performanceScoreProduct5, performanceScoreProduct6, performanceScoreProduct7, performanceScoreProduct8, performanceScoreProduct9, performanceScoreProduct10, performanceScoreProduct11, performanceScoreProduct12, performanceScoreProduct13, performanceScoreProduct14, performanceScoreProduct15, performanceScoreProduct16, performanceScoreProduct17, performanceScoreProduct18, performanceScoreProduct19, performanceScoreProduct20, performanceScoreProduct21, performanceScoreProduct22, performanceScoreProduct23, performanceScoreProduct24, performanceScoreProduct25, performanceScoreProduct26, performanceScoreProduct27, performanceScoreProduct28, performanceScoreProduct29, performanceScoreProduct30, performanceScoreProduct31, performanceScoreProduct32, performanceScoreProduct33, performanceScoreProduct34, performanceScoreProduct35, performanceScoreProduct36, performanceScoreProduct37, performanceScoreProduct38, performanceScoreProduct39, performanceScoreProduct40, performanceScoreProduct41, performanceScoreProduct42, performanceScoreProduct43, performanceScoreProduct44, performanceScoreProduct45, performanceScoreProduct46, performanceScoreProduct47, performanceScoreProduct48, performanceScoreProduct49, performanceScoreProduct50, performanceScoreProduct51, performanceScoreProduct52, performanceScoreProduct53};
        $VALUES = performanceScoreProductArr;
        $ENTRIES = new asp(performanceScoreProductArr);
    }

    public PerformanceScoreProduct(String str, int i, String str2, String str3) {
        this.productName = str2;
        this.screenName = str3;
    }

    public static PerformanceScoreProduct valueOf(String str) {
        return (PerformanceScoreProduct) Enum.valueOf(PerformanceScoreProduct.class, str);
    }

    public static PerformanceScoreProduct[] values() {
        return (PerformanceScoreProduct[]) $VALUES.clone();
    }

    public final String h() {
        return this.productName;
    }

    public final String i() {
        return this.screenName;
    }
}
