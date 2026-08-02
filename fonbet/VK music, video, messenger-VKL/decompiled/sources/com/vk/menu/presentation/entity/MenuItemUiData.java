package com.vk.menu.presentation.entity;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuItemUiData.kt */
/* loaded from: classes3.dex */
public final class MenuItemUiData {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MenuItemUiData[] $VALUES;
    public static final MenuItemUiData ADD_ACCOUNT;
    public static final MenuItemUiData ADS_EASY_PROMOTE;
    public static final MenuItemUiData ARCHIVE;
    public static final MenuItemUiData AUDIOS;
    public static final MenuItemUiData BUGS;
    public static final MenuItemUiData CLIPS;
    public static final MenuItemUiData DEBUG;
    public static final MenuItemUiData DISCOVER;
    public static final MenuItemUiData DOCUMENTS;
    public static final MenuItemUiData EVENTS;
    public static final MenuItemUiData EXPERT_CARD;
    public static final MenuItemUiData FAVES;
    public static final MenuItemUiData FEED_LIKES;
    public static final MenuItemUiData FRIENDS;
    public static final MenuItemUiData GAMES;
    public static final MenuItemUiData GROUPS;
    public static final MenuItemUiData LIVES;
    public static final MenuItemUiData MARKET;
    public static final MenuItemUiData MEMORIES;
    public static final MenuItemUiData MORE;
    public static final MenuItemUiData ORDERS;
    public static final MenuItemUiData PAYMENTS;
    public static final MenuItemUiData PHOTOS;
    public static final MenuItemUiData PODCASTS;
    public static final MenuItemUiData PROFILE;
    public static final MenuItemUiData QR_SCANNER;
    public static final MenuItemUiData SEARCH;
    public static final MenuItemUiData SETTINGS;
    public static final MenuItemUiData STATS;
    public static final MenuItemUiData STICKERS;
    public static final MenuItemUiData STICKERS_STORE;
    public static final MenuItemUiData SUPPORT;
    public static final MenuItemUiData SWITCH_ACCOUNT;
    public static final MenuItemUiData VIDEOS;
    public static final MenuItemUiData VK_APPS;
    public static final MenuItemUiData VK_CALLS;
    public static final MenuItemUiData VK_PAY;
    public static final MenuItemUiData WISHLIST;
    private final int id;
    private final String stat;

    static {
        MenuItemUiData menuItemUiData = new MenuItemUiData("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, R.id.menu_profile);
        PROFILE = menuItemUiData;
        MenuItemUiData menuItemUiData2 = new MenuItemUiData(Privacy.FRIENDS, 1, "friends", R.id.menu_friends);
        FRIENDS = menuItemUiData2;
        MenuItemUiData menuItemUiData3 = new MenuItemUiData("GROUPS", 2, "groups", R.id.menu_groups);
        GROUPS = menuItemUiData3;
        MenuItemUiData menuItemUiData4 = new MenuItemUiData("VK_CALLS", 3, "vk_calls", R.id.menu_calls);
        VK_CALLS = menuItemUiData4;
        MenuItemUiData menuItemUiData5 = new MenuItemUiData("CLIPS", 4, "clips", R.id.menu_clips);
        CLIPS = menuItemUiData5;
        MenuItemUiData menuItemUiData6 = new MenuItemUiData("AUDIOS", 5, "audios", R.id.menu_audios);
        AUDIOS = menuItemUiData6;
        MenuItemUiData menuItemUiData7 = new MenuItemUiData("PHOTOS", 6, "photos", R.id.menu_photos);
        PHOTOS = menuItemUiData7;
        MenuItemUiData menuItemUiData8 = new MenuItemUiData("VIDEOS", 7, "videos", R.id.menu_videos);
        VIDEOS = menuItemUiData8;
        MenuItemUiData menuItemUiData9 = new MenuItemUiData("LIVES", 8, "lives", R.id.menu_lives);
        LIVES = menuItemUiData9;
        MenuItemUiData menuItemUiData10 = new MenuItemUiData("GAMES", 9, "games", R.id.menu_games);
        GAMES = menuItemUiData10;
        MenuItemUiData menuItemUiData11 = new MenuItemUiData("FAVES", 10, "faves", R.id.menu_fave);
        FAVES = menuItemUiData11;
        MenuItemUiData menuItemUiData12 = new MenuItemUiData("DOCUMENTS", 11, "documents", R.id.menu_documents);
        DOCUMENTS = menuItemUiData12;
        MenuItemUiData menuItemUiData13 = new MenuItemUiData("PODCASTS", 12, "podcasts", R.id.menu_podcasts);
        PODCASTS = menuItemUiData13;
        MenuItemUiData menuItemUiData14 = new MenuItemUiData("PAYMENTS", 13, "payments", R.id.menu_payments);
        PAYMENTS = menuItemUiData14;
        MenuItemUiData menuItemUiData15 = new MenuItemUiData("SUPPORT", 14, "support", R.id.menu_support);
        SUPPORT = menuItemUiData15;
        MenuItemUiData menuItemUiData16 = new MenuItemUiData("FEED_LIKES", 15, "feed_likes", R.id.menu_feed_likes);
        FEED_LIKES = menuItemUiData16;
        MenuItemUiData menuItemUiData17 = new MenuItemUiData("VK_PAY", 16, "vk_pay", R.id.menu_vk_pay);
        VK_PAY = menuItemUiData17;
        MenuItemUiData menuItemUiData18 = new MenuItemUiData("MORE", 17, "more", R.id.menu_show_more);
        MORE = menuItemUiData18;
        MenuItemUiData menuItemUiData19 = new MenuItemUiData("EVENTS", 18, "events", R.id.menu_events);
        EVENTS = menuItemUiData19;
        MenuItemUiData menuItemUiData20 = new MenuItemUiData("BUGS", 19, "bugs", R.id.menu_bugs);
        BUGS = menuItemUiData20;
        MenuItemUiData menuItemUiData21 = new MenuItemUiData("ORDERS", 20, "market_orders", R.id.menu_market_orders);
        ORDERS = menuItemUiData21;
        MenuItemUiData menuItemUiData22 = new MenuItemUiData("STICKERS", 21, "stickers", R.id.menu_stickers);
        STICKERS = menuItemUiData22;
        MenuItemUiData menuItemUiData23 = new MenuItemUiData("STICKERS_STORE", 22, "stickers_store", 0);
        STICKERS_STORE = menuItemUiData23;
        MenuItemUiData menuItemUiData24 = new MenuItemUiData("DISCOVER", 23, "discover", R.id.menu_discover);
        DISCOVER = menuItemUiData24;
        MenuItemUiData menuItemUiData25 = new MenuItemUiData("VK_APPS", 24, "mini_apps", R.id.menu_vk_apps);
        VK_APPS = menuItemUiData25;
        MenuItemUiData menuItemUiData26 = new MenuItemUiData("ADS_EASY_PROMOTE", 25, "ads_easy_promote", R.id.menu_ads_easy_promote);
        ADS_EASY_PROMOTE = menuItemUiData26;
        MenuItemUiData menuItemUiData27 = new MenuItemUiData("MARKET", 26, "market", R.id.menu_market);
        MARKET = menuItemUiData27;
        MenuItemUiData menuItemUiData28 = new MenuItemUiData("SEARCH", 27, "search", R.id.menu_explore);
        SEARCH = menuItemUiData28;
        MenuItemUiData menuItemUiData29 = new MenuItemUiData("EXPERT_CARD", 28, "expert_card", R.id.menu_expert_card);
        EXPERT_CARD = menuItemUiData29;
        MenuItemUiData menuItemUiData30 = new MenuItemUiData("SETTINGS", 29, "settings", R.id.menu_settings);
        SETTINGS = menuItemUiData30;
        MenuItemUiData menuItemUiData31 = new MenuItemUiData("ARCHIVE", 30, "archive", R.id.menu_archive);
        ARCHIVE = menuItemUiData31;
        MenuItemUiData menuItemUiData32 = new MenuItemUiData("MEMORIES", 31, "memoris", R.id.menu_memories);
        MEMORIES = menuItemUiData32;
        MenuItemUiData menuItemUiData33 = new MenuItemUiData("WISHLIST", 32, "wishlist", R.id.menu_wishlist);
        WISHLIST = menuItemUiData33;
        MenuItemUiData menuItemUiData34 = new MenuItemUiData("STATS", 33, "statistics", R.id.menu_statistics);
        STATS = menuItemUiData34;
        MenuItemUiData menuItemUiData35 = new MenuItemUiData("DEBUG", 34, "debug", R.id.menu_debug);
        DEBUG = menuItemUiData35;
        MenuItemUiData menuItemUiData36 = new MenuItemUiData("ADD_ACCOUNT", 35, "add_account", R.id.menu_add_account);
        ADD_ACCOUNT = menuItemUiData36;
        MenuItemUiData menuItemUiData37 = new MenuItemUiData("SWITCH_ACCOUNT", 36, "switch_account", R.id.menu_switch_account);
        SWITCH_ACCOUNT = menuItemUiData37;
        MenuItemUiData menuItemUiData38 = new MenuItemUiData("QR_SCANNER", 37, "qr_scanner", R.id.menu_qr_scanner);
        QR_SCANNER = menuItemUiData38;
        MenuItemUiData[] menuItemUiDataArr = {menuItemUiData, menuItemUiData2, menuItemUiData3, menuItemUiData4, menuItemUiData5, menuItemUiData6, menuItemUiData7, menuItemUiData8, menuItemUiData9, menuItemUiData10, menuItemUiData11, menuItemUiData12, menuItemUiData13, menuItemUiData14, menuItemUiData15, menuItemUiData16, menuItemUiData17, menuItemUiData18, menuItemUiData19, menuItemUiData20, menuItemUiData21, menuItemUiData22, menuItemUiData23, menuItemUiData24, menuItemUiData25, menuItemUiData26, menuItemUiData27, menuItemUiData28, menuItemUiData29, menuItemUiData30, menuItemUiData31, menuItemUiData32, menuItemUiData33, menuItemUiData34, menuItemUiData35, menuItemUiData36, menuItemUiData37, menuItemUiData38};
        $VALUES = menuItemUiDataArr;
        $ENTRIES = new asp(menuItemUiDataArr);
    }

    public MenuItemUiData(String str, int i, String str2, int i2) {
        this.stat = str2;
        this.id = i2;
    }

    public static MenuItemUiData valueOf(String str) {
        return (MenuItemUiData) Enum.valueOf(MenuItemUiData.class, str);
    }

    public static MenuItemUiData[] values() {
        return (MenuItemUiData[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }

    public final String i() {
        return this.stat;
    }
}
