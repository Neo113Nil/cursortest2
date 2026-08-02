package com.vk.newsfeed.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostActions.kt */
/* loaded from: classes4.dex */
public final class PostActions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostActions[] $VALUES;
    public static final PostActions ACTION_ADD_TO_ARCHIVE;
    public static final PostActions ACTION_ADD_TO_MAIN_TAB;
    public static final PostActions ACTION_ADD_TO_PLAYLIST;
    public static final PostActions ACTION_ADS_EASY_PROMOTE;
    public static final PostActions ACTION_BAN_POST_SOURCE;
    public static final PostActions ACTION_BAN_SOURCE;
    public static final PostActions ACTION_BAN_USER;
    public static final PostActions ACTION_CANCEL_HIDE_MY_TARGET_NATIVE_AD;
    public static final PostActions ACTION_COPY_ADS_URL;
    public static final PostActions ACTION_COPY_AD_MARKER;
    public static final PostActions ACTION_COPY_LINK;
    public static final PostActions ACTION_CUSTOMIZE_TAGS;
    public static final PostActions ACTION_DOUBT_CATEGORY;
    public static final PostActions ACTION_EDIT;
    public static final PostActions ACTION_EDIT_BEST_FRIENDS;
    public static final PostActions ACTION_EDIT_PLAYLIST;
    public static final PostActions ACTION_GOTO_SOURCE;
    public static final PostActions ACTION_HIDE_AD;
    public static final PostActions ACTION_HIDE_AD_HTML;
    public static final PostActions ACTION_HIDE_AD_MY_TARGET_NATIVE_AD;
    public static final PostActions ACTION_HIDE_AD_OPTIONAL_NATIVE_AD;
    public static final PostActions ACTION_HIDE_AD_PROMO_POST;
    public static final PostActions ACTION_IGNORE;
    public static final PostActions ACTION_LAZY_LOAD_RETRY;
    public static final PostActions ACTION_LIKE;
    public static final PostActions ACTION_MARKET_CTA_ADD_TO_CART;
    public static final PostActions ACTION_MARKET_CTA_CALL_TO_OWNER;
    public static final PostActions ACTION_MARKET_CTA_CHAT_WITH_OWNER;
    public static final PostActions ACTION_MARKET_CTA_LINK;
    public static final PostActions ACTION_MARKET_CTA_OPEN_CART;
    public static final PostActions ACTION_OPEN_DISCOVER_MEDIA;
    public static final PostActions ACTION_OPEN_NEWS_TAB;
    public static final PostActions ACTION_OPEN_ORIGINAL_POST;
    public static final PostActions ACTION_OPEN_PROFILE;
    public static final PostActions ACTION_OPEN_RECOMMENDATION_URL;
    public static final PostActions ACTION_POLL_EDIT;
    public static final PostActions ACTION_POLL_UNVOTE;
    public static final PostActions ACTION_PUBLISH_DRAFT;
    public static final PostActions ACTION_PUBLISH_FREE_COPY;
    public static final PostActions ACTION_PUBLISH_POSTPONED;
    public static final PostActions ACTION_PUBLISH_SUGGESTED_NOW;
    public static final PostActions ACTION_PUSH_SUBSCRIBE;
    public static final PostActions ACTION_PUSH_UNSUBSCRIBE;
    public static final PostActions ACTION_REMOVE;
    public static final PostActions ACTION_REMOVE_FROM_ARCHIVE;
    public static final PostActions ACTION_REMOVE_FROM_MAIN_TAB;
    public static final PostActions ACTION_REPORT;
    public static final PostActions ACTION_SEND_BADGE;
    public static final PostActions ACTION_SHARE;
    public static final PostActions ACTION_SHOW_ADVERTISER_INFO;
    public static final PostActions ACTION_SHOW_AD_DEBUG_INFO;
    public static final PostActions ACTION_SHOW_STATS;
    public static final PostActions ACTION_TOGGLE_COMMENTS;
    public static final PostActions ACTION_TOGGLE_FAVE;
    public static final PostActions ACTION_TOGGLE_PINNED;
    public static final PostActions ACTION_TOGGLE_PINNED_ON_MAIN_TAB;
    public static final PostActions ACTION_UNBAN_USER;
    public static final PostActions ACTION_UNIGNORE;
    public static final PostActions ACTION_UNSUBSCRIBE_FROM_COMMENTS;
    public static final PostActions ACTION_WRITE_OWNER;
    private final int legacyActionId;

    static {
        PostActions postActions = new PostActions("ACTION_GOTO_SOURCE", 0, 0);
        ACTION_GOTO_SOURCE = postActions;
        PostActions postActions2 = new PostActions("ACTION_COPY_LINK", 1, 1);
        ACTION_COPY_LINK = postActions2;
        PostActions postActions3 = new PostActions("ACTION_IGNORE", 2, 2);
        ACTION_IGNORE = postActions3;
        PostActions postActions4 = new PostActions("ACTION_PUSH_SUBSCRIBE", 3, 3);
        ACTION_PUSH_SUBSCRIBE = postActions4;
        PostActions postActions5 = new PostActions("ACTION_PUSH_UNSUBSCRIBE", 4, 4);
        ACTION_PUSH_UNSUBSCRIBE = postActions5;
        PostActions postActions6 = new PostActions("ACTION_BAN_SOURCE", 5, 5);
        ACTION_BAN_SOURCE = postActions6;
        PostActions postActions7 = new PostActions("ACTION_OPEN_ORIGINAL_POST", 6, 6);
        ACTION_OPEN_ORIGINAL_POST = postActions7;
        PostActions postActions8 = new PostActions("ACTION_EDIT", 7, 7);
        ACTION_EDIT = postActions8;
        PostActions postActions9 = new PostActions("ACTION_REMOVE", 8, 8);
        ACTION_REMOVE = postActions9;
        PostActions postActions10 = new PostActions("ACTION_REPORT", 9, 9);
        ACTION_REPORT = postActions10;
        PostActions postActions11 = new PostActions("ACTION_PUBLISH_POSTPONED", 10, 10);
        ACTION_PUBLISH_POSTPONED = postActions11;
        PostActions postActions12 = new PostActions("ACTION_UNSUBSCRIBE_FROM_COMMENTS", 11, 11);
        ACTION_UNSUBSCRIBE_FROM_COMMENTS = postActions12;
        PostActions postActions13 = new PostActions("ACTION_TOGGLE_PINNED", 12, 12);
        ACTION_TOGGLE_PINNED = postActions13;
        PostActions postActions14 = new PostActions("ACTION_SHOW_AD_DEBUG_INFO", 13, 13);
        ACTION_SHOW_AD_DEBUG_INFO = postActions14;
        PostActions postActions15 = new PostActions("ACTION_TOGGLE_COMMENTS", 14, 14);
        ACTION_TOGGLE_COMMENTS = postActions15;
        PostActions postActions16 = new PostActions("ACTION_TOGGLE_FAVE", 15, 15);
        ACTION_TOGGLE_FAVE = postActions16;
        PostActions postActions17 = new PostActions("ACTION_ADD_TO_ARCHIVE", 16, 17);
        ACTION_ADD_TO_ARCHIVE = postActions17;
        PostActions postActions18 = new PostActions("ACTION_REMOVE_FROM_ARCHIVE", 17, 18);
        ACTION_REMOVE_FROM_ARCHIVE = postActions18;
        PostActions postActions19 = new PostActions("ACTION_DOUBT_CATEGORY", 18, 23);
        ACTION_DOUBT_CATEGORY = postActions19;
        PostActions postActions20 = new PostActions("ACTION_PUBLISH_SUGGESTED_NOW", 19, 24);
        ACTION_PUBLISH_SUGGESTED_NOW = postActions20;
        PostActions postActions21 = new PostActions("ACTION_PUBLISH_FREE_COPY", 20, 25);
        ACTION_PUBLISH_FREE_COPY = postActions21;
        PostActions postActions22 = new PostActions("ACTION_EDIT_BEST_FRIENDS", 21, 26);
        ACTION_EDIT_BEST_FRIENDS = postActions22;
        PostActions postActions23 = new PostActions("ACTION_WRITE_OWNER", 22, 27);
        ACTION_WRITE_OWNER = postActions23;
        PostActions postActions24 = new PostActions("ACTION_SHOW_ADVERTISER_INFO", 23, 32);
        ACTION_SHOW_ADVERTISER_INFO = postActions24;
        PostActions postActions25 = new PostActions("ACTION_COPY_AD_MARKER", 24, 33);
        ACTION_COPY_AD_MARKER = postActions25;
        PostActions postActions26 = new PostActions("ACTION_UNIGNORE", 25, 35);
        ACTION_UNIGNORE = postActions26;
        PostActions postActions27 = new PostActions("ACTION_LIKE", 26, 36);
        ACTION_LIKE = postActions27;
        PostActions postActions28 = new PostActions("ACTION_OPEN_PROFILE", 27, 37);
        ACTION_OPEN_PROFILE = postActions28;
        PostActions postActions29 = new PostActions("ACTION_SHARE", 28, 38);
        ACTION_SHARE = postActions29;
        PostActions postActions30 = new PostActions("ACTION_OPEN_DISCOVER_MEDIA", 29, 39);
        ACTION_OPEN_DISCOVER_MEDIA = postActions30;
        PostActions postActions31 = new PostActions("ACTION_LAZY_LOAD_RETRY", 30, 40);
        ACTION_LAZY_LOAD_RETRY = postActions31;
        PostActions postActions32 = new PostActions("ACTION_SEND_BADGE", 31, 41);
        ACTION_SEND_BADGE = postActions32;
        PostActions postActions33 = new PostActions("ACTION_BAN_POST_SOURCE", 32, 42);
        ACTION_BAN_POST_SOURCE = postActions33;
        PostActions postActions34 = new PostActions("ACTION_HIDE_AD", 33, 43);
        ACTION_HIDE_AD = postActions34;
        PostActions postActions35 = new PostActions("ACTION_HIDE_AD_HTML", 34, 44);
        ACTION_HIDE_AD_HTML = postActions35;
        PostActions postActions36 = new PostActions("ACTION_HIDE_AD_PROMO_POST", 35, 45);
        ACTION_HIDE_AD_PROMO_POST = postActions36;
        PostActions postActions37 = new PostActions("ACTION_MARKET_CTA_ADD_TO_CART", 36, 46);
        ACTION_MARKET_CTA_ADD_TO_CART = postActions37;
        PostActions postActions38 = new PostActions("ACTION_MARKET_CTA_CHAT_WITH_OWNER", 37, 47);
        ACTION_MARKET_CTA_CHAT_WITH_OWNER = postActions38;
        PostActions postActions39 = new PostActions("ACTION_MARKET_CTA_LINK", 38, 48);
        ACTION_MARKET_CTA_LINK = postActions39;
        PostActions postActions40 = new PostActions("ACTION_MARKET_CTA_CALL_TO_OWNER", 39, 49);
        ACTION_MARKET_CTA_CALL_TO_OWNER = postActions40;
        PostActions postActions41 = new PostActions("ACTION_MARKET_CTA_OPEN_CART", 40, 50);
        ACTION_MARKET_CTA_OPEN_CART = postActions41;
        PostActions postActions42 = new PostActions("ACTION_SHOW_STATS", 41, 51);
        ACTION_SHOW_STATS = postActions42;
        PostActions postActions43 = new PostActions("ACTION_OPEN_NEWS_TAB", 42, 53);
        ACTION_OPEN_NEWS_TAB = postActions43;
        PostActions postActions44 = new PostActions("ACTION_OPEN_RECOMMENDATION_URL", 43, 54);
        ACTION_OPEN_RECOMMENDATION_URL = postActions44;
        PostActions postActions45 = new PostActions("ACTION_COPY_ADS_URL", 44, 55);
        ACTION_COPY_ADS_URL = postActions45;
        PostActions postActions46 = new PostActions("ACTION_POLL_EDIT", 45, 56);
        ACTION_POLL_EDIT = postActions46;
        PostActions postActions47 = new PostActions("ACTION_POLL_UNVOTE", 46, 57);
        ACTION_POLL_UNVOTE = postActions47;
        PostActions postActions48 = new PostActions("ACTION_HIDE_AD_MY_TARGET_NATIVE_AD", 47, 58);
        ACTION_HIDE_AD_MY_TARGET_NATIVE_AD = postActions48;
        PostActions postActions49 = new PostActions("ACTION_CUSTOMIZE_TAGS", 48, 60);
        ACTION_CUSTOMIZE_TAGS = postActions49;
        PostActions postActions50 = new PostActions("ACTION_HIDE_AD_OPTIONAL_NATIVE_AD", 49, 61);
        ACTION_HIDE_AD_OPTIONAL_NATIVE_AD = postActions50;
        PostActions postActions51 = new PostActions("ACTION_PUBLISH_DRAFT", 50, 62);
        ACTION_PUBLISH_DRAFT = postActions51;
        PostActions postActions52 = new PostActions("ACTION_CANCEL_HIDE_MY_TARGET_NATIVE_AD", 51, 70);
        ACTION_CANCEL_HIDE_MY_TARGET_NATIVE_AD = postActions52;
        PostActions postActions53 = new PostActions("ACTION_BAN_USER", 52, 71);
        ACTION_BAN_USER = postActions53;
        PostActions postActions54 = new PostActions("ACTION_UNBAN_USER", 53, 72);
        ACTION_UNBAN_USER = postActions54;
        PostActions postActions55 = new PostActions("ACTION_REMOVE_FROM_MAIN_TAB", 54, 73);
        ACTION_REMOVE_FROM_MAIN_TAB = postActions55;
        PostActions postActions56 = new PostActions("ACTION_ADD_TO_MAIN_TAB", 55, 74);
        ACTION_ADD_TO_MAIN_TAB = postActions56;
        PostActions postActions57 = new PostActions("ACTION_TOGGLE_PINNED_ON_MAIN_TAB", 56, 75);
        ACTION_TOGGLE_PINNED_ON_MAIN_TAB = postActions57;
        PostActions postActions58 = new PostActions("ACTION_ADS_EASY_PROMOTE", 57, 76);
        ACTION_ADS_EASY_PROMOTE = postActions58;
        PostActions postActions59 = new PostActions("ACTION_ADD_TO_PLAYLIST", 58, 77);
        ACTION_ADD_TO_PLAYLIST = postActions59;
        PostActions postActions60 = new PostActions("ACTION_EDIT_PLAYLIST", 59, 78);
        ACTION_EDIT_PLAYLIST = postActions60;
        PostActions[] postActionsArr = {postActions, postActions2, postActions3, postActions4, postActions5, postActions6, postActions7, postActions8, postActions9, postActions10, postActions11, postActions12, postActions13, postActions14, postActions15, postActions16, postActions17, postActions18, postActions19, postActions20, postActions21, postActions22, postActions23, postActions24, postActions25, postActions26, postActions27, postActions28, postActions29, postActions30, postActions31, postActions32, postActions33, postActions34, postActions35, postActions36, postActions37, postActions38, postActions39, postActions40, postActions41, postActions42, postActions43, postActions44, postActions45, postActions46, postActions47, postActions48, postActions49, postActions50, postActions51, postActions52, postActions53, postActions54, postActions55, postActions56, postActions57, postActions58, postActions59, postActions60};
        $VALUES = postActionsArr;
        $ENTRIES = new asp(postActionsArr);
    }

    public PostActions(String str, int i, int i2) {
        this.legacyActionId = i2;
    }

    public static PostActions valueOf(String str) {
        return (PostActions) Enum.valueOf(PostActions.class, str);
    }

    public static PostActions[] values() {
        return (PostActions[]) $VALUES.clone();
    }

    public final int h() {
        return this.legacyActionId;
    }
}
