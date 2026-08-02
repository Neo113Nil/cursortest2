package com.vk.metrics.performance.scroll;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScrollScreenType.kt */
/* loaded from: classes.dex */
public final class ScrollScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScrollScreenType[] $VALUES;
    public static final ScrollScreenType CLIPS_EDITOR;
    public static final ScrollScreenType CLIPS_FEED;
    public static final ScrollScreenType DIALOG;
    public static final ScrollScreenType DIALOGS;
    public static final ScrollScreenType DISCOVER;
    public static final ScrollScreenType FEED;
    public static final ScrollScreenType FEED_VIDEO;
    public static final ScrollScreenType FRIENDS;
    public static final ScrollScreenType IM_ITEMS;
    public static final ScrollScreenType MARKETPLACE_MAIN;
    public static final ScrollScreenType MARKET_CART;
    public static final ScrollScreenType MARKET_ITEM;
    public static final ScrollScreenType MARKET_STOREFRONT;
    public static final ScrollScreenType NOTIFICATIONS;
    public static final ScrollScreenType SUPERAPP_FEED;
    public static final ScrollScreenType VIDEO_LIBRARY;
    public static final ScrollScreenType VK_VIDEO_CHANNEL;
    public static final ScrollScreenType VK_VIDEO_KIDS;
    public static final ScrollScreenType VK_VIDEO_MOVIES_AND_SERIALS;
    public static final ScrollScreenType VK_VIDEO_PLAYLIST;

    static {
        ScrollScreenType scrollScreenType = new ScrollScreenType("FEED", 0);
        FEED = scrollScreenType;
        ScrollScreenType scrollScreenType2 = new ScrollScreenType("SUPERAPP_FEED", 1);
        SUPERAPP_FEED = scrollScreenType2;
        ScrollScreenType scrollScreenType3 = new ScrollScreenType("DISCOVER", 2);
        DISCOVER = scrollScreenType3;
        ScrollScreenType scrollScreenType4 = new ScrollScreenType("DIALOGS", 3);
        DIALOGS = scrollScreenType4;
        ScrollScreenType scrollScreenType5 = new ScrollScreenType("DIALOG", 4);
        DIALOG = scrollScreenType5;
        ScrollScreenType scrollScreenType6 = new ScrollScreenType(Privacy.FRIENDS, 5);
        FRIENDS = scrollScreenType6;
        ScrollScreenType scrollScreenType7 = new ScrollScreenType("FEED_VIDEO", 6);
        FEED_VIDEO = scrollScreenType7;
        ScrollScreenType scrollScreenType8 = new ScrollScreenType("CLIPS_FEED", 7);
        CLIPS_FEED = scrollScreenType8;
        ScrollScreenType scrollScreenType9 = new ScrollScreenType("CLIPS_EDITOR", 8);
        CLIPS_EDITOR = scrollScreenType9;
        ScrollScreenType scrollScreenType10 = new ScrollScreenType("MARKET_STOREFRONT", 9);
        MARKET_STOREFRONT = scrollScreenType10;
        ScrollScreenType scrollScreenType11 = new ScrollScreenType("MARKET_ITEM", 10);
        MARKET_ITEM = scrollScreenType11;
        ScrollScreenType scrollScreenType12 = new ScrollScreenType("MARKETPLACE_MAIN", 11);
        MARKETPLACE_MAIN = scrollScreenType12;
        ScrollScreenType scrollScreenType13 = new ScrollScreenType("NOTIFICATIONS", 12);
        NOTIFICATIONS = scrollScreenType13;
        ScrollScreenType scrollScreenType14 = new ScrollScreenType("MARKET_CART", 13);
        MARKET_CART = scrollScreenType14;
        ScrollScreenType scrollScreenType15 = new ScrollScreenType("VIDEO_LIBRARY", 14);
        VIDEO_LIBRARY = scrollScreenType15;
        ScrollScreenType scrollScreenType16 = new ScrollScreenType("VK_VIDEO_MOVIES_AND_SERIALS", 15);
        VK_VIDEO_MOVIES_AND_SERIALS = scrollScreenType16;
        ScrollScreenType scrollScreenType17 = new ScrollScreenType("VK_VIDEO_KIDS", 16);
        VK_VIDEO_KIDS = scrollScreenType17;
        ScrollScreenType scrollScreenType18 = new ScrollScreenType("VK_VIDEO_CHANNEL", 17);
        VK_VIDEO_CHANNEL = scrollScreenType18;
        ScrollScreenType scrollScreenType19 = new ScrollScreenType("VK_VIDEO_PLAYLIST", 18);
        VK_VIDEO_PLAYLIST = scrollScreenType19;
        ScrollScreenType scrollScreenType20 = new ScrollScreenType("IM_ITEMS", 19);
        IM_ITEMS = scrollScreenType20;
        ScrollScreenType[] scrollScreenTypeArr = {scrollScreenType, scrollScreenType2, scrollScreenType3, scrollScreenType4, scrollScreenType5, scrollScreenType6, scrollScreenType7, scrollScreenType8, scrollScreenType9, scrollScreenType10, scrollScreenType11, scrollScreenType12, scrollScreenType13, scrollScreenType14, scrollScreenType15, scrollScreenType16, scrollScreenType17, scrollScreenType18, scrollScreenType19, scrollScreenType20};
        $VALUES = scrollScreenTypeArr;
        $ENTRIES = new asp(scrollScreenTypeArr);
    }

    public ScrollScreenType() {
        throw null;
    }

    public static zrp<ScrollScreenType> h() {
        return $ENTRIES;
    }

    public static ScrollScreenType valueOf(String str) {
        return (ScrollScreenType) Enum.valueOf(ScrollScreenType.class, str);
    }

    public static ScrollScreenType[] values() {
        return (ScrollScreenType[]) $VALUES.clone();
    }
}
