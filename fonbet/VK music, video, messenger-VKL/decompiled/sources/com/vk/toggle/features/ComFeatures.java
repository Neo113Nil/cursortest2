package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComFeatures.kt */
/* loaded from: classes11.dex */
public final class ComFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ComFeatures[] $VALUES;
    public static final ComFeatures COM_ADDRESSES_IN_DETAILS_MODAL;
    public static final ComFeatures COM_ADVERT_BANNER;
    public static final ComFeatures COM_CODEGEN_GET_RECOM_GROUPS;
    public static final ComFeatures COM_CODEGEN_GROUPS_ADDRESSES;
    public static final ComFeatures COM_CODEGEN_GROUPS_BAN_USER;
    public static final ComFeatures COM_CODEGEN_GROUPS_JOIN;
    public static final ComFeatures COM_CODEGEN_GROUPS_SUGGESTIONS;
    public static final ComFeatures COM_COMMUNITY_ADDRESSES_FIX;
    public static final ComFeatures COM_CONTENT_FOR_TAB_OPTIMIZE;
    public static final ComFeatures COM_DEFAULT_AUTHOR;
    public static final ComFeatures COM_DISABLE_SUBSCRIBE_DIALOG;
    public static final ComFeatures COM_DONUT_PRICE_DISCOUNT;
    public static final ComFeatures COM_DONUT_VISIBILITY;
    public static final ComFeatures COM_EASY_PROMOTE;
    public static final ComFeatures COM_FOLLOWERS_ONLINE_TAB;
    public static final ComFeatures COM_GET_FULL_PROFILE_NEW_NEW_LEGACY_API;
    public static final ComFeatures COM_GROUPS_GETBYID_CODEGEN;
    public static final ComFeatures COM_GROUPS_SEARCH_FILTERS;
    public static final ComFeatures COM_JOIN_FULL_SOURCE;
    public static final ComFeatures COM_LEGO_BUTTONS_REDESIGN;
    public static final ComFeatures COM_MAIN_CARDS_ACTION;
    public static final ComFeatures COM_MAIN_TAB;
    public static final ComFeatures COM_MIGRATE_GROUPS_GET_EXTENDED;
    public static final ComFeatures COM_MIGRATE_GROUPS_GET_MEMBERS;
    public static final ComFeatures COM_NEW_MENU;
    public static final ComFeatures COM_NEW_POSTING_PRIVACY_UX;
    public static final ComFeatures COM_NON_PROFIT_ORGANIZATION;
    public static final ComFeatures COM_PB_GOODS_ALBUMS;
    public static final ComFeatures COM_POSTING_AUTHOR_SELECTION;
    public static final ComFeatures COM_POST_REACTION_DONUT;
    public static final ComFeatures COM_POST_STATISTICS;
    public static final ComFeatures COM_PROFILE_DONUT_TAB;
    public static final ComFeatures COM_PROFILE_DONUT_VIDEO;
    public static final ComFeatures COM_PROFILE_FROM_CLIPS_SWIPE;
    public static final ComFeatures COM_PROFILE_POSTING_REDESIGN;
    public static final ComFeatures COM_PROFILE_SUBSCRIBE;
    public static final ComFeatures COM_REMOVE_USER_STATS_IN_NOTIFY_SCREEN;
    public static final ComFeatures COM_SECTIONS_REDESIGN;
    public static final ComFeatures COM_SERVICES_CTA_BUTTON_ALL_SERVICES;
    public static final ComFeatures COM_SERVICES_SHOWCASE_LIST;
    public static final ComFeatures COM_SERVICES_SHOWCASE_SETTINGS;
    public static final ComFeatures COM_SETTINGS_WITHOUT_SUBSCRIBE;
    public static final ComFeatures COM_TRUST_MARKS_AB;
    public static final ComFeatures COM_VIDEO_ON_MAIN_TAB;
    public static final ComFeatures COM_VIDEO_ON_USER_MAIN_TAB;
    public static final ComFeatures COM_VIDEO_TAB_REDESIGN;
    private final String key;

    static {
        ComFeatures comFeatures = new ComFeatures("COM_DONUT_VISIBILITY", 0, "com_don_visibility");
        COM_DONUT_VISIBILITY = comFeatures;
        ComFeatures comFeatures2 = new ComFeatures("COM_PROFILE_FROM_CLIPS_SWIPE", 1, "com_profile_from_clips_swipe");
        COM_PROFILE_FROM_CLIPS_SWIPE = comFeatures2;
        ComFeatures comFeatures3 = new ComFeatures("COM_PROFILE_SUBSCRIBE", 2, "com_profile_subscribe");
        COM_PROFILE_SUBSCRIBE = comFeatures3;
        ComFeatures comFeatures4 = new ComFeatures("COM_SETTINGS_WITHOUT_SUBSCRIBE", 3, "com_settings_without_subscribe");
        COM_SETTINGS_WITHOUT_SUBSCRIBE = comFeatures4;
        ComFeatures comFeatures5 = new ComFeatures("COM_DISABLE_SUBSCRIBE_DIALOG", 4, "com_disable_subscribe_dialog");
        COM_DISABLE_SUBSCRIBE_DIALOG = comFeatures5;
        ComFeatures comFeatures6 = new ComFeatures("COM_SERVICES_CTA_BUTTON_ALL_SERVICES", 5, "com_services_cta_button_list");
        COM_SERVICES_CTA_BUTTON_ALL_SERVICES = comFeatures6;
        ComFeatures comFeatures7 = new ComFeatures("COM_POSTING_AUTHOR_SELECTION", 6, "com_posting_author_selection");
        COM_POSTING_AUTHOR_SELECTION = comFeatures7;
        ComFeatures comFeatures8 = new ComFeatures("COM_MAIN_TAB", 7, "com_main_tab");
        COM_MAIN_TAB = comFeatures8;
        ComFeatures comFeatures9 = new ComFeatures("COM_POST_STATISTICS", 8, "com_post_statistics");
        COM_POST_STATISTICS = comFeatures9;
        ComFeatures comFeatures10 = new ComFeatures("COM_EASY_PROMOTE", 9, "com_easy_promote");
        COM_EASY_PROMOTE = comFeatures10;
        ComFeatures comFeatures11 = new ComFeatures("COM_VIDEO_ON_MAIN_TAB", 10, "com_video_on_main_tab");
        COM_VIDEO_ON_MAIN_TAB = comFeatures11;
        ComFeatures comFeatures12 = new ComFeatures("COM_VIDEO_ON_USER_MAIN_TAB", 11, "com_video_on_user_main_tab");
        COM_VIDEO_ON_USER_MAIN_TAB = comFeatures12;
        ComFeatures comFeatures13 = new ComFeatures("COM_ADDRESSES_IN_DETAILS_MODAL", 12, "com_addresses_in_details_modal");
        COM_ADDRESSES_IN_DETAILS_MODAL = comFeatures13;
        ComFeatures comFeatures14 = new ComFeatures("COM_PB_GOODS_ALBUMS", 13, "com_pb_goods_albums");
        COM_PB_GOODS_ALBUMS = comFeatures14;
        ComFeatures comFeatures15 = new ComFeatures("COM_PROFILE_POSTING_REDESIGN", 14, "com_profile_posting_redesign");
        COM_PROFILE_POSTING_REDESIGN = comFeatures15;
        ComFeatures comFeatures16 = new ComFeatures("COM_DEFAULT_AUTHOR", 15, "com_default_author");
        COM_DEFAULT_AUTHOR = comFeatures16;
        ComFeatures comFeatures17 = new ComFeatures("COM_MAIN_CARDS_ACTION", 16, "com_main_cards_action");
        COM_MAIN_CARDS_ACTION = comFeatures17;
        ComFeatures comFeatures18 = new ComFeatures("COM_DONUT_PRICE_DISCOUNT", 17, "com_donut_price_discount");
        COM_DONUT_PRICE_DISCOUNT = comFeatures18;
        ComFeatures comFeatures19 = new ComFeatures("COM_POST_REACTION_DONUT", 18, "com_post_reaction_donut");
        COM_POST_REACTION_DONUT = comFeatures19;
        ComFeatures comFeatures20 = new ComFeatures("COM_PROFILE_DONUT_VIDEO", 19, "com_profile_donut_video");
        COM_PROFILE_DONUT_VIDEO = comFeatures20;
        ComFeatures comFeatures21 = new ComFeatures("COM_SECTIONS_REDESIGN", 20, "com_sections_redesign");
        COM_SECTIONS_REDESIGN = comFeatures21;
        ComFeatures comFeatures22 = new ComFeatures("COM_NON_PROFIT_ORGANIZATION", 21, "com_non_profit_org");
        COM_NON_PROFIT_ORGANIZATION = comFeatures22;
        ComFeatures comFeatures23 = new ComFeatures("COM_REMOVE_USER_STATS_IN_NOTIFY_SCREEN", 22, "com_user_stats_in_notify");
        COM_REMOVE_USER_STATS_IN_NOTIFY_SCREEN = comFeatures23;
        ComFeatures comFeatures24 = new ComFeatures("COM_SERVICES_SHOWCASE_SETTINGS", 23, "com_services_showcase_settings");
        COM_SERVICES_SHOWCASE_SETTINGS = comFeatures24;
        ComFeatures comFeatures25 = new ComFeatures("COM_SERVICES_SHOWCASE_LIST", 24, "com_services_showcase_list");
        COM_SERVICES_SHOWCASE_LIST = comFeatures25;
        ComFeatures comFeatures26 = new ComFeatures("COM_TRUST_MARKS_AB", 25, "com_trust_marks_ab");
        COM_TRUST_MARKS_AB = comFeatures26;
        ComFeatures comFeatures27 = new ComFeatures("COM_NEW_MENU", 26, "com_new_menu");
        COM_NEW_MENU = comFeatures27;
        ComFeatures comFeatures28 = new ComFeatures("COM_VIDEO_TAB_REDESIGN", 27, "com_video_tab_redesign");
        COM_VIDEO_TAB_REDESIGN = comFeatures28;
        ComFeatures comFeatures29 = new ComFeatures("COM_NEW_POSTING_PRIVACY_UX", 28, "com_new_posting_privacy_ux");
        COM_NEW_POSTING_PRIVACY_UX = comFeatures29;
        ComFeatures comFeatures30 = new ComFeatures("COM_GROUPS_GETBYID_CODEGEN", 29, "com_groups_getbyid_codegen");
        COM_GROUPS_GETBYID_CODEGEN = comFeatures30;
        ComFeatures comFeatures31 = new ComFeatures("COM_MIGRATE_GROUPS_GET_MEMBERS", 30, "com_migrate_groups_get_members");
        COM_MIGRATE_GROUPS_GET_MEMBERS = comFeatures31;
        ComFeatures comFeatures32 = new ComFeatures("COM_CODEGEN_GROUPS_SUGGESTIONS", 31, "com_codegen_groups_suggest");
        COM_CODEGEN_GROUPS_SUGGESTIONS = comFeatures32;
        ComFeatures comFeatures33 = new ComFeatures("COM_CODEGEN_GET_RECOM_GROUPS", 32, "com_codegen_get_recom_groups");
        COM_CODEGEN_GET_RECOM_GROUPS = comFeatures33;
        ComFeatures comFeatures34 = new ComFeatures("COM_CODEGEN_GROUPS_BAN_USER", 33, "com_codegen_groups_ban_user");
        COM_CODEGEN_GROUPS_BAN_USER = comFeatures34;
        ComFeatures comFeatures35 = new ComFeatures("COM_MIGRATE_GROUPS_GET_EXTENDED", 34, "com_migrate_groups_extended");
        COM_MIGRATE_GROUPS_GET_EXTENDED = comFeatures35;
        ComFeatures comFeatures36 = new ComFeatures("COM_CODEGEN_GROUPS_JOIN", 35, "com_codegen_groups_join");
        COM_CODEGEN_GROUPS_JOIN = comFeatures36;
        ComFeatures comFeatures37 = new ComFeatures("COM_CONTENT_FOR_TAB_OPTIMIZE", 36, "com_content_for_tab_optimize");
        COM_CONTENT_FOR_TAB_OPTIMIZE = comFeatures37;
        ComFeatures comFeatures38 = new ComFeatures("COM_ADVERT_BANNER", 37, "com_advert_banner");
        COM_ADVERT_BANNER = comFeatures38;
        ComFeatures comFeatures39 = new ComFeatures("COM_CODEGEN_GROUPS_ADDRESSES", 38, "com_codegen_groups_addresses");
        COM_CODEGEN_GROUPS_ADDRESSES = comFeatures39;
        ComFeatures comFeatures40 = new ComFeatures("COM_PROFILE_DONUT_TAB", 39, "com_profile_donut_tab");
        COM_PROFILE_DONUT_TAB = comFeatures40;
        ComFeatures comFeatures41 = new ComFeatures("COM_JOIN_FULL_SOURCE", 40, "com_join_full_source");
        COM_JOIN_FULL_SOURCE = comFeatures41;
        ComFeatures comFeatures42 = new ComFeatures("COM_GROUPS_SEARCH_FILTERS", 41, "com_groups_search_filters");
        COM_GROUPS_SEARCH_FILTERS = comFeatures42;
        ComFeatures comFeatures43 = new ComFeatures("COM_COMMUNITY_ADDRESSES_FIX", 42, "com_community_addresses_fix");
        COM_COMMUNITY_ADDRESSES_FIX = comFeatures43;
        ComFeatures comFeatures44 = new ComFeatures("COM_FOLLOWERS_ONLINE_TAB", 43, "com_followers_online_tab");
        COM_FOLLOWERS_ONLINE_TAB = comFeatures44;
        ComFeatures comFeatures45 = new ComFeatures("COM_GET_FULL_PROFILE_NEW_NEW_LEGACY_API", 44, "com_getfullprofile_legacy");
        COM_GET_FULL_PROFILE_NEW_NEW_LEGACY_API = comFeatures45;
        ComFeatures comFeatures46 = new ComFeatures("COM_LEGO_BUTTONS_REDESIGN", 45, "com_lego_buttons_redesign");
        COM_LEGO_BUTTONS_REDESIGN = comFeatures46;
        ComFeatures[] comFeaturesArr = {comFeatures, comFeatures2, comFeatures3, comFeatures4, comFeatures5, comFeatures6, comFeatures7, comFeatures8, comFeatures9, comFeatures10, comFeatures11, comFeatures12, comFeatures13, comFeatures14, comFeatures15, comFeatures16, comFeatures17, comFeatures18, comFeatures19, comFeatures20, comFeatures21, comFeatures22, comFeatures23, comFeatures24, comFeatures25, comFeatures26, comFeatures27, comFeatures28, comFeatures29, comFeatures30, comFeatures31, comFeatures32, comFeatures33, comFeatures34, comFeatures35, comFeatures36, comFeatures37, comFeatures38, comFeatures39, comFeatures40, comFeatures41, comFeatures42, comFeatures43, comFeatures44, comFeatures45, comFeatures46};
        $VALUES = comFeaturesArr;
        $ENTRIES = new asp(comFeaturesArr);
    }

    public ComFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<ComFeatures> i() {
        return $ENTRIES;
    }

    public static ComFeatures valueOf(String str) {
        return (ComFeatures) Enum.valueOf(ComFeatures.class, str);
    }

    public static ComFeatures[] values() {
        return (ComFeatures[]) $VALUES.clone();
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
