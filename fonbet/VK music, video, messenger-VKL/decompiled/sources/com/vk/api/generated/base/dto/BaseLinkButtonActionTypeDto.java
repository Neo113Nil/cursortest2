package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseLinkButtonActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseLinkButtonActionTypeDto[] $VALUES;

    @pmi0("add_friend")
    public static final BaseLinkButtonActionTypeDto ADD_FRIEND;

    @pmi0("add_friends")
    public static final BaseLinkButtonActionTypeDto ADD_FRIENDS;

    @pmi0("add_playlist")
    public static final BaseLinkButtonActionTypeDto ADD_PLAYLIST;

    @pmi0("add_videos")
    public static final BaseLinkButtonActionTypeDto ADD_VIDEOS;

    @pmi0("add_video_playlist")
    public static final BaseLinkButtonActionTypeDto ADD_VIDEO_PLAYLIST;

    @pmi0("audio_meta")
    public static final BaseLinkButtonActionTypeDto AUDIO_META;

    @pmi0("author_page")
    public static final BaseLinkButtonActionTypeDto AUTHOR_PAGE;

    @pmi0("become_author_howto")
    public static final BaseLinkButtonActionTypeDto BECOME_AUTHOR_HOWTO;

    @pmi0("block_filter")
    public static final BaseLinkButtonActionTypeDto BLOCK_FILTER;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final BaseLinkButtonActionTypeDto CALL;

    @pmi0("change_profile")
    public static final BaseLinkButtonActionTypeDto CHANGE_PROFILE;

    @pmi0("child_mode")
    public static final BaseLinkButtonActionTypeDto CHILD_MODE;

    @pmi0("clear_download_history")
    public static final BaseLinkButtonActionTypeDto CLEAR_DOWNLOAD_HISTORY;

    @pmi0("clear_recent_groups")
    public static final BaseLinkButtonActionTypeDto CLEAR_RECENT_GROUPS;

    @pmi0("clear_search_history")
    public static final BaseLinkButtonActionTypeDto CLEAR_SEARCH_HISTORY;

    @pmi0("clear_video_history")
    public static final BaseLinkButtonActionTypeDto CLEAR_VIDEO_HISTORY;

    @pmi0("close_banner")
    public static final BaseLinkButtonActionTypeDto CLOSE_BANNER;

    @pmi0("close_catalog_banner")
    public static final BaseLinkButtonActionTypeDto CLOSE_CATALOG_BANNER;

    @pmi0("close_notification")
    public static final BaseLinkButtonActionTypeDto CLOSE_NOTIFICATION;

    @pmi0("close_popup")
    public static final BaseLinkButtonActionTypeDto CLOSE_POPUP;

    @pmi0("close_web_app")
    public static final BaseLinkButtonActionTypeDto CLOSE_WEB_APP;

    @pmi0("create_album")
    public static final BaseLinkButtonActionTypeDto CREATE_ALBUM;

    @pmi0("create_group")
    public static final BaseLinkButtonActionTypeDto CREATE_GROUP;

    @pmi0("create_playlist")
    public static final BaseLinkButtonActionTypeDto CREATE_PLAYLIST;
    public static final Parcelable.Creator<BaseLinkButtonActionTypeDto> CREATOR;

    @pmi0("delete_video_item")
    public static final BaseLinkButtonActionTypeDto DELETE_VIDEO_ITEM;

    @pmi0("download_all")
    public static final BaseLinkButtonActionTypeDto DOWNLOAD_ALL;

    @pmi0("dropdown")
    public static final BaseLinkButtonActionTypeDto DROPDOWN;

    @pmi0("edit_artist")
    public static final BaseLinkButtonActionTypeDto EDIT_ARTIST;

    @pmi0("edit_curator")
    public static final BaseLinkButtonActionTypeDto EDIT_CURATOR;

    @pmi0("edit_items")
    public static final BaseLinkButtonActionTypeDto EDIT_ITEMS;

    @pmi0("edit_video_item")
    public static final BaseLinkButtonActionTypeDto EDIT_VIDEO_ITEM;

    @pmi0("enable_top_newsfeed")
    public static final BaseLinkButtonActionTypeDto ENABLE_TOP_NEWSFEED;

    @pmi0("enter_edit_mode")
    public static final BaseLinkButtonActionTypeDto ENTER_EDIT_MODE;

    @pmi0("expand_block_local")
    public static final BaseLinkButtonActionTypeDto EXPAND_BLOCK_LOCAL;

    @pmi0("follow")
    public static final BaseLinkButtonActionTypeDto FOLLOW;

    @pmi0("friends_call")
    public static final BaseLinkButtonActionTypeDto FRIENDS_CALL;

    @pmi0("friends_cleanup")
    public static final BaseLinkButtonActionTypeDto FRIENDS_CLEANUP;

    @pmi0("friends_label")
    public static final BaseLinkButtonActionTypeDto FRIENDS_LABEL;

    @pmi0("friends_lists")
    public static final BaseLinkButtonActionTypeDto FRIENDS_LISTS;

    @pmi0("friends_message")
    public static final BaseLinkButtonActionTypeDto FRIENDS_MESSAGE;

    @pmi0("friends_remove")
    public static final BaseLinkButtonActionTypeDto FRIENDS_REMOVE;

    @pmi0("friends_requests")
    public static final BaseLinkButtonActionTypeDto FRIENDS_REQUESTS;

    @pmi0("friends_send_gift")
    public static final BaseLinkButtonActionTypeDto FRIENDS_SEND_GIFT;

    @pmi0("friends_sort_modes")
    public static final BaseLinkButtonActionTypeDto FRIENDS_SORT_MODES;

    @pmi0("groups_advertisement")
    public static final BaseLinkButtonActionTypeDto GROUPS_ADVERTISEMENT;

    @pmi0("groups_my_groups_tabs")
    public static final BaseLinkButtonActionTypeDto GROUPS_MY_GROUPS_TABS;

    @pmi0("groups_non_active_groups_update")
    public static final BaseLinkButtonActionTypeDto GROUPS_NON_ACTIVE_GROUPS_UPDATE;

    @pmi0("group_admin_banner_cta")
    public static final BaseLinkButtonActionTypeDto GROUP_ADMIN_BANNER_CTA;

    @pmi0("help_hint")
    public static final BaseLinkButtonActionTypeDto HELP_HINT;

    @pmi0("hide_block")
    public static final BaseLinkButtonActionTypeDto HIDE_BLOCK;

    @pmi0("import_audio_library")
    public static final BaseLinkButtonActionTypeDto IMPORT_AUDIO_LIBRARY;

    @pmi0("import_contacts")
    public static final BaseLinkButtonActionTypeDto IMPORT_CONTACTS;

    @pmi0("join")
    public static final BaseLinkButtonActionTypeDto JOIN;

    @pmi0("join_group_and_open_url")
    public static final BaseLinkButtonActionTypeDto JOIN_GROUP_AND_OPEN_URL;

    @pmi0("live_categories")
    public static final BaseLinkButtonActionTypeDto LIVE_CATEGORIES;

    @pmi0("login")
    public static final BaseLinkButtonActionTypeDto LOGIN;

    @pmi0(ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL)
    public static final BaseLinkButtonActionTypeDto LOGOUT;

    @pmi0("market_abandoned_carts")
    public static final BaseLinkButtonActionTypeDto MARKET_ABANDONED_CARTS;

    @pmi0("market_clear_recent_queries")
    public static final BaseLinkButtonActionTypeDto MARKET_CLEAR_RECENT_QUERIES;

    @pmi0("market_delete")
    public static final BaseLinkButtonActionTypeDto MARKET_DELETE;

    @pmi0("market_delete_album")
    public static final BaseLinkButtonActionTypeDto MARKET_DELETE_ALBUM;

    @pmi0("market_delete_album_and_items")
    public static final BaseLinkButtonActionTypeDto MARKET_DELETE_ALBUM_AND_ITEMS;

    @pmi0("market_edit")
    public static final BaseLinkButtonActionTypeDto MARKET_EDIT;

    @pmi0("market_edit_album")
    public static final BaseLinkButtonActionTypeDto MARKET_EDIT_ALBUM;

    @pmi0("market_options")
    public static final BaseLinkButtonActionTypeDto MARKET_OPTIONS;

    @pmi0("market_write")
    public static final BaseLinkButtonActionTypeDto MARKET_WRITE;

    @pmi0("modal_page")
    public static final BaseLinkButtonActionTypeDto MODAL_PAGE;

    @pmi0("movie_categories")
    public static final BaseLinkButtonActionTypeDto MOVIE_CATEGORIES;

    @pmi0("music_follow_owner")
    public static final BaseLinkButtonActionTypeDto MUSIC_FOLLOW_OWNER;

    @pmi0("music_transfer")
    public static final BaseLinkButtonActionTypeDto MUSIC_TRANSFER;

    @pmi0("my_audios_section_options")
    public static final BaseLinkButtonActionTypeDto MY_AUDIOS_SECTION_OPTIONS;

    @pmi0("my_music_filter_save_as_playlist")
    public static final BaseLinkButtonActionTypeDto MY_MUSIC_FILTER_SAVE_AS_PLAYLIST;

    @pmi0("my_music_subsection_tabs")
    public static final BaseLinkButtonActionTypeDto MY_MUSIC_SUBSECTION_TABS;

    @pmi0("onboarding")
    public static final BaseLinkButtonActionTypeDto ONBOARDING;

    @pmi0("open_amp")
    public static final BaseLinkButtonActionTypeDto OPEN_AMP;

    @pmi0("open_birthday_modal")
    public static final BaseLinkButtonActionTypeDto OPEN_BIRTHDAY_MODAL;

    @pmi0("open_challenge")
    public static final BaseLinkButtonActionTypeDto OPEN_CHALLENGE;

    @pmi0("open_conversation")
    public static final BaseLinkButtonActionTypeDto OPEN_CONVERSATION;

    @pmi0("open_game")
    public static final BaseLinkButtonActionTypeDto OPEN_GAME;

    @pmi0("open_info_popup")
    public static final BaseLinkButtonActionTypeDto OPEN_INFO_POPUP;

    @pmi0("open_internal_vkui")
    public static final BaseLinkButtonActionTypeDto OPEN_INTERNAL_VKUI;

    @pmi0("open_menu")
    public static final BaseLinkButtonActionTypeDto OPEN_MENU;

    @pmi0("open_modal")
    public static final BaseLinkButtonActionTypeDto OPEN_MODAL;

    @pmi0("open_music_search")
    public static final BaseLinkButtonActionTypeDto OPEN_MUSIC_SEARCH;

    @pmi0("open_qoe_survey")
    public static final BaseLinkButtonActionTypeDto OPEN_QOE_SURVEY;

    @pmi0("open_qr_code_modal")
    public static final BaseLinkButtonActionTypeDto OPEN_QR_CODE_MODAL;

    @pmi0("open_screen")
    public static final BaseLinkButtonActionTypeDto OPEN_SCREEN;

    @pmi0("open_screen_large")
    public static final BaseLinkButtonActionTypeDto OPEN_SCREEN_LARGE;

    @pmi0("open_search_filters")
    public static final BaseLinkButtonActionTypeDto OPEN_SEARCH_FILTERS;

    @pmi0("open_search_tab")
    public static final BaseLinkButtonActionTypeDto OPEN_SEARCH_TAB;

    @pmi0("open_section")
    public static final BaseLinkButtonActionTypeDto OPEN_SECTION;

    @pmi0("open_section_slider_cell")
    public static final BaseLinkButtonActionTypeDto OPEN_SECTION_SLIDER_CELL;

    @pmi0("open_sidebar_section")
    public static final BaseLinkButtonActionTypeDto OPEN_SIDEBAR_SECTION;

    @pmi0("open_studio")
    public static final BaseLinkButtonActionTypeDto OPEN_STUDIO;

    @pmi0("open_url")
    public static final BaseLinkButtonActionTypeDto OPEN_URL;

    @pmi0("open_url_video_discover")
    public static final BaseLinkButtonActionTypeDto OPEN_URL_VIDEO_DISCOVER;

    @pmi0("open_video_modal")
    public static final BaseLinkButtonActionTypeDto OPEN_VIDEO_MODAL;

    @pmi0("open_video_page")
    public static final BaseLinkButtonActionTypeDto OPEN_VIDEO_PAGE;

    @pmi0("open_video_playlist_modal")
    public static final BaseLinkButtonActionTypeDto OPEN_VIDEO_PLAYLIST_MODAL;

    @pmi0("open_vkapp")
    public static final BaseLinkButtonActionTypeDto OPEN_VKAPP;

    @pmi0("owner_button")
    public static final BaseLinkButtonActionTypeDto OWNER_BUTTON;

    @pmi0("owner_groups")
    public static final BaseLinkButtonActionTypeDto OWNER_GROUPS;

    @pmi0("perform_action_with_url")
    public static final BaseLinkButtonActionTypeDto PERFORM_ACTION_WITH_URL;

    @pmi0("playlists_lists")
    public static final BaseLinkButtonActionTypeDto PLAYLISTS_LISTS;

    @pmi0("play_audio")
    public static final BaseLinkButtonActionTypeDto PLAY_AUDIO;

    @pmi0("play_audios_from_block")
    public static final BaseLinkButtonActionTypeDto PLAY_AUDIOS_FROM_BLOCK;

    @pmi0("play_shuffled_audios_from_block")
    public static final BaseLinkButtonActionTypeDto PLAY_SHUFFLED_AUDIOS_FROM_BLOCK;

    @pmi0("play_videos_from_block")
    public static final BaseLinkButtonActionTypeDto PLAY_VIDEOS_FROM_BLOCK;

    @pmi0("play_vk_mix")
    public static final BaseLinkButtonActionTypeDto PLAY_VK_MIX;

    @pmi0("podcasts_subsection_tabs")
    public static final BaseLinkButtonActionTypeDto PODCASTS_SUBSECTION_TABS;

    @pmi0("qr_camera")
    public static final BaseLinkButtonActionTypeDto QR_CAMERA;

    @pmi0("reorder_items")
    public static final BaseLinkButtonActionTypeDto REORDER_ITEMS;

    @pmi0("reset_search_filters")
    public static final BaseLinkButtonActionTypeDto RESET_SEARCH_FILTERS;

    @pmi0("run_handler")
    public static final BaseLinkButtonActionTypeDto RUN_HANDLER;

    @pmi0("save_as_playlist")
    public static final BaseLinkButtonActionTypeDto SAVE_AS_PLAYLIST;

    @pmi0("search")
    public static final BaseLinkButtonActionTypeDto SEARCH;

    @pmi0("search_clear")
    public static final BaseLinkButtonActionTypeDto SEARCH_CLEAR;

    @pmi0("search_mode")
    public static final BaseLinkButtonActionTypeDto SEARCH_MODE;

    @pmi0("search_show_all")
    public static final BaseLinkButtonActionTypeDto SEARCH_SHOW_ALL;

    @pmi0("search_show_more")
    public static final BaseLinkButtonActionTypeDto SEARCH_SHOW_MORE;

    @pmi0("section_filter")
    public static final BaseLinkButtonActionTypeDto SECTION_FILTER;

    @pmi0("section_subsection_tabs")
    public static final BaseLinkButtonActionTypeDto SECTION_SUBSECTION_TABS;

    @pmi0("select_sorting")
    public static final BaseLinkButtonActionTypeDto SELECT_SORTING;

    @pmi0("share")
    public static final BaseLinkButtonActionTypeDto SHARE;

    @pmi0("show_filters")
    public static final BaseLinkButtonActionTypeDto SHOW_FILTERS;

    @pmi0("show_snackbar")
    public static final BaseLinkButtonActionTypeDto SHOW_SNACKBAR;

    @pmi0("specials_perform_action")
    public static final BaseLinkButtonActionTypeDto SPECIALS_PERFORM_ACTION;

    @pmi0("start_live")
    public static final BaseLinkButtonActionTypeDto START_LIVE;

    @pmi0("subscribe")
    public static final BaseLinkButtonActionTypeDto SUBSCRIBE;

    @pmi0("subscribe_ads_acceptance")
    public static final BaseLinkButtonActionTypeDto SUBSCRIBE_ADS_ACCEPTANCE;

    @pmi0("switch_account")
    public static final BaseLinkButtonActionTypeDto SWITCH_ACCOUNT;

    @pmi0("switch_section")
    public static final BaseLinkButtonActionTypeDto SWITCH_SECTION;

    @pmi0("switch_video_subsection")
    public static final BaseLinkButtonActionTypeDto SWITCH_VIDEO_SUBSECTION;

    @pmi0("sync_contacts")
    public static final BaseLinkButtonActionTypeDto SYNC_CONTACTS;

    @pmi0("toggle")
    public static final BaseLinkButtonActionTypeDto TOGGLE;

    @pmi0("toggle_album_shuffle")
    public static final BaseLinkButtonActionTypeDto TOGGLE_ALBUM_SHUFFLE;

    @pmi0("toggle_album_subscription")
    public static final BaseLinkButtonActionTypeDto TOGGLE_ALBUM_SUBSCRIPTION;

    @pmi0("toggle_artist_subscription")
    public static final BaseLinkButtonActionTypeDto TOGGLE_ARTIST_SUBSCRIPTION;

    @pmi0("toggle_curator_subscription")
    public static final BaseLinkButtonActionTypeDto TOGGLE_CURATOR_SUBSCRIPTION;

    @pmi0("toggle_video_album_subscription")
    public static final BaseLinkButtonActionTypeDto TOGGLE_VIDEO_ALBUM_SUBSCRIPTION;

    @pmi0("unfollow_artist")
    public static final BaseLinkButtonActionTypeDto UNFOLLOW_ARTIST;

    @pmi0("unfollow_curator")
    public static final BaseLinkButtonActionTypeDto UNFOLLOW_CURATOR;

    @pmi0("unfollow_music_owner")
    public static final BaseLinkButtonActionTypeDto UNFOLLOW_MUSIC_OWNER;

    @pmi0("upload_audio")
    public static final BaseLinkButtonActionTypeDto UPLOAD_AUDIO;

    @pmi0("upload_clip")
    public static final BaseLinkButtonActionTypeDto UPLOAD_CLIP;

    @pmi0("upload_video")
    public static final BaseLinkButtonActionTypeDto UPLOAD_VIDEO;

    @pmi0("user_subscribe_and_open_url")
    public static final BaseLinkButtonActionTypeDto USER_SUBSCRIBE_AND_OPEN_URL;

    @pmi0("video_action")
    public static final BaseLinkButtonActionTypeDto VIDEO_ACTION;

    @pmi0("video_seasons_block_filter")
    public static final BaseLinkButtonActionTypeDto VIDEO_SEASONS_BLOCK_FILTER;

    @pmi0("video_subscriptions_block_filter")
    public static final BaseLinkButtonActionTypeDto VIDEO_SUBSCRIPTIONS_BLOCK_FILTER;
    private final String value;

    /* compiled from: BaseLinkButtonActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionTypeDto createFromParcel(Parcel parcel) {
            return BaseLinkButtonActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionTypeDto[] newArray(int i) {
            return new BaseLinkButtonActionTypeDto[i];
        }
    }

    static {
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto = new BaseLinkButtonActionTypeDto("OPEN_CONVERSATION", 0, "open_conversation");
        OPEN_CONVERSATION = baseLinkButtonActionTypeDto;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto2 = new BaseLinkButtonActionTypeDto("SHOW_SNACKBAR", 1, "show_snackbar");
        SHOW_SNACKBAR = baseLinkButtonActionTypeDto2;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto3 = new BaseLinkButtonActionTypeDto("OPEN_URL", 2, "open_url");
        OPEN_URL = baseLinkButtonActionTypeDto3;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto4 = new BaseLinkButtonActionTypeDto("OPEN_AMP", 3, "open_amp");
        OPEN_AMP = baseLinkButtonActionTypeDto4;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto5 = new BaseLinkButtonActionTypeDto("OPEN_QOE_SURVEY", 4, "open_qoe_survey");
        OPEN_QOE_SURVEY = baseLinkButtonActionTypeDto5;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto6 = new BaseLinkButtonActionTypeDto("JOIN_GROUP_AND_OPEN_URL", 5, "join_group_and_open_url");
        JOIN_GROUP_AND_OPEN_URL = baseLinkButtonActionTypeDto6;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto7 = new BaseLinkButtonActionTypeDto("USER_SUBSCRIBE_AND_OPEN_URL", 6, "user_subscribe_and_open_url");
        USER_SUBSCRIBE_AND_OPEN_URL = baseLinkButtonActionTypeDto7;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto8 = new BaseLinkButtonActionTypeDto("OPEN_SECTION", 7, "open_section");
        OPEN_SECTION = baseLinkButtonActionTypeDto8;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto9 = new BaseLinkButtonActionTypeDto("OPEN_SECTION_SLIDER_CELL", 8, "open_section_slider_cell");
        OPEN_SECTION_SLIDER_CELL = baseLinkButtonActionTypeDto9;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto10 = new BaseLinkButtonActionTypeDto("OPEN_SIDEBAR_SECTION", 9, "open_sidebar_section");
        OPEN_SIDEBAR_SECTION = baseLinkButtonActionTypeDto10;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto11 = new BaseLinkButtonActionTypeDto("FOLLOW", 10, "follow");
        FOLLOW = baseLinkButtonActionTypeDto11;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto12 = new BaseLinkButtonActionTypeDto("UPLOAD_CLIP", 11, "upload_clip");
        UPLOAD_CLIP = baseLinkButtonActionTypeDto12;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto13 = new BaseLinkButtonActionTypeDto("UPLOAD_VIDEO", 12, "upload_video");
        UPLOAD_VIDEO = baseLinkButtonActionTypeDto13;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto14 = new BaseLinkButtonActionTypeDto("CLOSE_BANNER", 13, "close_banner");
        CLOSE_BANNER = baseLinkButtonActionTypeDto14;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto15 = new BaseLinkButtonActionTypeDto("CREATE_PLAYLIST", 14, "create_playlist");
        CREATE_PLAYLIST = baseLinkButtonActionTypeDto15;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto16 = new BaseLinkButtonActionTypeDto("CREATE_ALBUM", 15, "create_album");
        CREATE_ALBUM = baseLinkButtonActionTypeDto16;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto17 = new BaseLinkButtonActionTypeDto("FRIENDS_LISTS", 16, "friends_lists");
        FRIENDS_LISTS = baseLinkButtonActionTypeDto17;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto18 = new BaseLinkButtonActionTypeDto("FRIENDS_SORT_MODES", 17, "friends_sort_modes");
        FRIENDS_SORT_MODES = baseLinkButtonActionTypeDto18;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto19 = new BaseLinkButtonActionTypeDto("ADD_FRIEND", 18, "add_friend");
        ADD_FRIEND = baseLinkButtonActionTypeDto19;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto20 = new BaseLinkButtonActionTypeDto("BLOCK_FILTER", 19, "block_filter");
        BLOCK_FILTER = baseLinkButtonActionTypeDto20;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto21 = new BaseLinkButtonActionTypeDto("SECTION_FILTER", 20, "section_filter");
        SECTION_FILTER = baseLinkButtonActionTypeDto21;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto22 = new BaseLinkButtonActionTypeDto("VIDEO_SEASONS_BLOCK_FILTER", 21, "video_seasons_block_filter");
        VIDEO_SEASONS_BLOCK_FILTER = baseLinkButtonActionTypeDto22;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto23 = new BaseLinkButtonActionTypeDto("QR_CAMERA", 22, "qr_camera");
        QR_CAMERA = baseLinkButtonActionTypeDto23;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto24 = new BaseLinkButtonActionTypeDto("FRIENDS_REQUESTS", 23, "friends_requests");
        FRIENDS_REQUESTS = baseLinkButtonActionTypeDto24;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto25 = new BaseLinkButtonActionTypeDto("OPEN_SCREEN", 24, "open_screen");
        OPEN_SCREEN = baseLinkButtonActionTypeDto25;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto26 = new BaseLinkButtonActionTypeDto("OPEN_SCREEN_LARGE", 25, "open_screen_large");
        OPEN_SCREEN_LARGE = baseLinkButtonActionTypeDto26;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto27 = new BaseLinkButtonActionTypeDto("FRIENDS_MESSAGE", 26, "friends_message");
        FRIENDS_MESSAGE = baseLinkButtonActionTypeDto27;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto28 = new BaseLinkButtonActionTypeDto("FRIENDS_REMOVE", 27, "friends_remove");
        FRIENDS_REMOVE = baseLinkButtonActionTypeDto28;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto29 = new BaseLinkButtonActionTypeDto("FRIENDS_CALL", 28, "friends_call");
        FRIENDS_CALL = baseLinkButtonActionTypeDto29;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto30 = new BaseLinkButtonActionTypeDto("FRIENDS_SEND_GIFT", 29, "friends_send_gift");
        FRIENDS_SEND_GIFT = baseLinkButtonActionTypeDto30;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto31 = new BaseLinkButtonActionTypeDto("FRIENDS_LABEL", 30, "friends_label");
        FRIENDS_LABEL = baseLinkButtonActionTypeDto31;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto32 = new BaseLinkButtonActionTypeDto("PLAY_AUDIOS_FROM_BLOCK", 31, "play_audios_from_block");
        PLAY_AUDIOS_FROM_BLOCK = baseLinkButtonActionTypeDto32;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto33 = new BaseLinkButtonActionTypeDto("PLAY_AUDIO", 32, "play_audio");
        PLAY_AUDIO = baseLinkButtonActionTypeDto33;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto34 = new BaseLinkButtonActionTypeDto("OPEN_CHALLENGE", 33, "open_challenge");
        OPEN_CHALLENGE = baseLinkButtonActionTypeDto34;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto35 = new BaseLinkButtonActionTypeDto("ADD_VIDEOS", 34, "add_videos");
        ADD_VIDEOS = baseLinkButtonActionTypeDto35;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto36 = new BaseLinkButtonActionTypeDto("PLAY_VIDEOS_FROM_BLOCK", 35, "play_videos_from_block");
        PLAY_VIDEOS_FROM_BLOCK = baseLinkButtonActionTypeDto36;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto37 = new BaseLinkButtonActionTypeDto("PLAY_SHUFFLED_AUDIOS_FROM_BLOCK", 36, "play_shuffled_audios_from_block");
        PLAY_SHUFFLED_AUDIOS_FROM_BLOCK = baseLinkButtonActionTypeDto37;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto38 = new BaseLinkButtonActionTypeDto("UNFOLLOW_ARTIST", 37, "unfollow_artist");
        UNFOLLOW_ARTIST = baseLinkButtonActionTypeDto38;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto39 = new BaseLinkButtonActionTypeDto("CREATE_GROUP", 38, "create_group");
        CREATE_GROUP = baseLinkButtonActionTypeDto39;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto40 = new BaseLinkButtonActionTypeDto("CLOSE_NOTIFICATION", 39, "close_notification");
        CLOSE_NOTIFICATION = baseLinkButtonActionTypeDto40;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto41 = new BaseLinkButtonActionTypeDto("SWITCH_SECTION", 40, "switch_section");
        SWITCH_SECTION = baseLinkButtonActionTypeDto41;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto42 = new BaseLinkButtonActionTypeDto("CLEAR_RECENT_GROUPS", 41, "clear_recent_groups");
        CLEAR_RECENT_GROUPS = baseLinkButtonActionTypeDto42;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto43 = new BaseLinkButtonActionTypeDto("CLOSE_CATALOG_BANNER", 42, "close_catalog_banner");
        CLOSE_CATALOG_BANNER = baseLinkButtonActionTypeDto43;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto44 = new BaseLinkButtonActionTypeDto("ENABLE_TOP_NEWSFEED", 43, "enable_top_newsfeed");
        ENABLE_TOP_NEWSFEED = baseLinkButtonActionTypeDto44;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto45 = new BaseLinkButtonActionTypeDto("GROUPS_ADVERTISEMENT", 44, "groups_advertisement");
        GROUPS_ADVERTISEMENT = baseLinkButtonActionTypeDto45;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto46 = new BaseLinkButtonActionTypeDto("OWNER_BUTTON", 45, "owner_button");
        OWNER_BUTTON = baseLinkButtonActionTypeDto46;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto47 = new BaseLinkButtonActionTypeDto("ENTER_EDIT_MODE", 46, "enter_edit_mode");
        ENTER_EDIT_MODE = baseLinkButtonActionTypeDto47;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto48 = new BaseLinkButtonActionTypeDto("PLAYLISTS_LISTS", 47, "playlists_lists");
        PLAYLISTS_LISTS = baseLinkButtonActionTypeDto48;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto49 = new BaseLinkButtonActionTypeDto("UNFOLLOW_CURATOR", 48, "unfollow_curator");
        UNFOLLOW_CURATOR = baseLinkButtonActionTypeDto49;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto50 = new BaseLinkButtonActionTypeDto("UNFOLLOW_MUSIC_OWNER", 49, "unfollow_music_owner");
        UNFOLLOW_MUSIC_OWNER = baseLinkButtonActionTypeDto50;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto51 = new BaseLinkButtonActionTypeDto("REORDER_ITEMS", 50, "reorder_items");
        REORDER_ITEMS = baseLinkButtonActionTypeDto51;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto52 = new BaseLinkButtonActionTypeDto("EDIT_ITEMS", 51, "edit_items");
        EDIT_ITEMS = baseLinkButtonActionTypeDto52;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto53 = new BaseLinkButtonActionTypeDto("SELECT_SORTING", 52, "select_sorting");
        SELECT_SORTING = baseLinkButtonActionTypeDto53;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto54 = new BaseLinkButtonActionTypeDto("MARKET_CLEAR_RECENT_QUERIES", 53, "market_clear_recent_queries");
        MARKET_CLEAR_RECENT_QUERIES = baseLinkButtonActionTypeDto54;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto55 = new BaseLinkButtonActionTypeDto("MARKET_ABANDONED_CARTS", 54, "market_abandoned_carts");
        MARKET_ABANDONED_CARTS = baseLinkButtonActionTypeDto55;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto56 = new BaseLinkButtonActionTypeDto("MARKET_WRITE", 55, "market_write");
        MARKET_WRITE = baseLinkButtonActionTypeDto56;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto57 = new BaseLinkButtonActionTypeDto("CALL", 56, NotificationCompat.CATEGORY_CALL);
        CALL = baseLinkButtonActionTypeDto57;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto58 = new BaseLinkButtonActionTypeDto("CLOSE_WEB_APP", 57, "close_web_app");
        CLOSE_WEB_APP = baseLinkButtonActionTypeDto58;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto59 = new BaseLinkButtonActionTypeDto("MODAL_PAGE", 58, "modal_page");
        MODAL_PAGE = baseLinkButtonActionTypeDto59;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto60 = new BaseLinkButtonActionTypeDto("LIVE_CATEGORIES", 59, "live_categories");
        LIVE_CATEGORIES = baseLinkButtonActionTypeDto60;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto61 = new BaseLinkButtonActionTypeDto("MOVIE_CATEGORIES", 60, "movie_categories");
        MOVIE_CATEGORIES = baseLinkButtonActionTypeDto61;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto62 = new BaseLinkButtonActionTypeDto("TOGGLE_VIDEO_ALBUM_SUBSCRIPTION", 61, "toggle_video_album_subscription");
        TOGGLE_VIDEO_ALBUM_SUBSCRIPTION = baseLinkButtonActionTypeDto62;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto63 = new BaseLinkButtonActionTypeDto("CLEAR_VIDEO_HISTORY", 62, "clear_video_history");
        CLEAR_VIDEO_HISTORY = baseLinkButtonActionTypeDto63;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto64 = new BaseLinkButtonActionTypeDto("MUSIC_TRANSFER", 63, "music_transfer");
        MUSIC_TRANSFER = baseLinkButtonActionTypeDto64;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto65 = new BaseLinkButtonActionTypeDto("ADD_PLAYLIST", 64, "add_playlist");
        ADD_PLAYLIST = baseLinkButtonActionTypeDto65;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto66 = new BaseLinkButtonActionTypeDto("HELP_HINT", 65, "help_hint");
        HELP_HINT = baseLinkButtonActionTypeDto66;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto67 = new BaseLinkButtonActionTypeDto("OPEN_VKAPP", 66, "open_vkapp");
        OPEN_VKAPP = baseLinkButtonActionTypeDto67;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto68 = new BaseLinkButtonActionTypeDto("OPEN_GAME", 67, "open_game");
        OPEN_GAME = baseLinkButtonActionTypeDto68;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto69 = new BaseLinkButtonActionTypeDto("OPEN_INTERNAL_VKUI", 68, "open_internal_vkui");
        OPEN_INTERNAL_VKUI = baseLinkButtonActionTypeDto69;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto70 = new BaseLinkButtonActionTypeDto("SPECIALS_PERFORM_ACTION", 69, "specials_perform_action");
        SPECIALS_PERFORM_ACTION = baseLinkButtonActionTypeDto70;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto71 = new BaseLinkButtonActionTypeDto("OPEN_BIRTHDAY_MODAL", 70, "open_birthday_modal");
        OPEN_BIRTHDAY_MODAL = baseLinkButtonActionTypeDto71;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto72 = new BaseLinkButtonActionTypeDto("SHARE", 71, "share");
        SHARE = baseLinkButtonActionTypeDto72;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto73 = new BaseLinkButtonActionTypeDto("PERFORM_ACTION_WITH_URL", 72, "perform_action_with_url");
        PERFORM_ACTION_WITH_URL = baseLinkButtonActionTypeDto73;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto74 = new BaseLinkButtonActionTypeDto("OPEN_SEARCH_TAB", 73, "open_search_tab");
        OPEN_SEARCH_TAB = baseLinkButtonActionTypeDto74;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto75 = new BaseLinkButtonActionTypeDto("OPEN_SEARCH_FILTERS", 74, "open_search_filters");
        OPEN_SEARCH_FILTERS = baseLinkButtonActionTypeDto75;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto76 = new BaseLinkButtonActionTypeDto("RESET_SEARCH_FILTERS", 75, "reset_search_filters");
        RESET_SEARCH_FILTERS = baseLinkButtonActionTypeDto76;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto77 = new BaseLinkButtonActionTypeDto("HIDE_BLOCK", 76, "hide_block");
        HIDE_BLOCK = baseLinkButtonActionTypeDto77;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto78 = new BaseLinkButtonActionTypeDto("MARKET_EDIT", 77, "market_edit");
        MARKET_EDIT = baseLinkButtonActionTypeDto78;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto79 = new BaseLinkButtonActionTypeDto("MARKET_OPTIONS", 78, "market_options");
        MARKET_OPTIONS = baseLinkButtonActionTypeDto79;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto80 = new BaseLinkButtonActionTypeDto("MARKET_EDIT_ALBUM", 79, "market_edit_album");
        MARKET_EDIT_ALBUM = baseLinkButtonActionTypeDto80;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto81 = new BaseLinkButtonActionTypeDto("MARKET_DELETE_ALBUM", 80, "market_delete_album");
        MARKET_DELETE_ALBUM = baseLinkButtonActionTypeDto81;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto82 = new BaseLinkButtonActionTypeDto("MARKET_DELETE_ALBUM_AND_ITEMS", 81, "market_delete_album_and_items");
        MARKET_DELETE_ALBUM_AND_ITEMS = baseLinkButtonActionTypeDto82;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto83 = new BaseLinkButtonActionTypeDto("MARKET_DELETE", 82, "market_delete");
        MARKET_DELETE = baseLinkButtonActionTypeDto83;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto84 = new BaseLinkButtonActionTypeDto("TOGGLE_CURATOR_SUBSCRIPTION", 83, "toggle_curator_subscription");
        TOGGLE_CURATOR_SUBSCRIPTION = baseLinkButtonActionTypeDto84;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto85 = new BaseLinkButtonActionTypeDto("TOGGLE_ARTIST_SUBSCRIPTION", 84, "toggle_artist_subscription");
        TOGGLE_ARTIST_SUBSCRIPTION = baseLinkButtonActionTypeDto85;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto86 = new BaseLinkButtonActionTypeDto("TOGGLE_ALBUM_SUBSCRIPTION", 85, "toggle_album_subscription");
        TOGGLE_ALBUM_SUBSCRIPTION = baseLinkButtonActionTypeDto86;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto87 = new BaseLinkButtonActionTypeDto("TOGGLE_ALBUM_SHUFFLE", 86, "toggle_album_shuffle");
        TOGGLE_ALBUM_SHUFFLE = baseLinkButtonActionTypeDto87;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto88 = new BaseLinkButtonActionTypeDto("SWITCH_ACCOUNT", 87, "switch_account");
        SWITCH_ACCOUNT = baseLinkButtonActionTypeDto88;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto89 = new BaseLinkButtonActionTypeDto("MUSIC_FOLLOW_OWNER", 88, "music_follow_owner");
        MUSIC_FOLLOW_OWNER = baseLinkButtonActionTypeDto89;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto90 = new BaseLinkButtonActionTypeDto("UPLOAD_AUDIO", 89, "upload_audio");
        UPLOAD_AUDIO = baseLinkButtonActionTypeDto90;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto91 = new BaseLinkButtonActionTypeDto("SUBSCRIBE_ADS_ACCEPTANCE", 90, "subscribe_ads_acceptance");
        SUBSCRIBE_ADS_ACCEPTANCE = baseLinkButtonActionTypeDto91;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto92 = new BaseLinkButtonActionTypeDto("SYNC_CONTACTS", 91, "sync_contacts");
        SYNC_CONTACTS = baseLinkButtonActionTypeDto92;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto93 = new BaseLinkButtonActionTypeDto("IMPORT_CONTACTS", 92, "import_contacts");
        IMPORT_CONTACTS = baseLinkButtonActionTypeDto93;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto94 = new BaseLinkButtonActionTypeDto("ADD_FRIENDS", 93, "add_friends");
        ADD_FRIENDS = baseLinkButtonActionTypeDto94;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto95 = new BaseLinkButtonActionTypeDto("FRIENDS_CLEANUP", 94, "friends_cleanup");
        FRIENDS_CLEANUP = baseLinkButtonActionTypeDto95;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto96 = new BaseLinkButtonActionTypeDto("CLOSE_POPUP", 95, "close_popup");
        CLOSE_POPUP = baseLinkButtonActionTypeDto96;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto97 = new BaseLinkButtonActionTypeDto("ONBOARDING", 96, "onboarding");
        ONBOARDING = baseLinkButtonActionTypeDto97;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto98 = new BaseLinkButtonActionTypeDto("GROUPS_MY_GROUPS_TABS", 97, "groups_my_groups_tabs");
        GROUPS_MY_GROUPS_TABS = baseLinkButtonActionTypeDto98;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto99 = new BaseLinkButtonActionTypeDto("LOGIN", 98, "login");
        LOGIN = baseLinkButtonActionTypeDto99;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto100 = new BaseLinkButtonActionTypeDto("LOGOUT", 99, ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL);
        LOGOUT = baseLinkButtonActionTypeDto100;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto101 = new BaseLinkButtonActionTypeDto("START_LIVE", 100, "start_live");
        START_LIVE = baseLinkButtonActionTypeDto101;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto102 = new BaseLinkButtonActionTypeDto("SAVE_AS_PLAYLIST", 101, "save_as_playlist");
        SAVE_AS_PLAYLIST = baseLinkButtonActionTypeDto102;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto103 = new BaseLinkButtonActionTypeDto("PODCASTS_SUBSECTION_TABS", 102, "podcasts_subsection_tabs");
        PODCASTS_SUBSECTION_TABS = baseLinkButtonActionTypeDto103;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto104 = new BaseLinkButtonActionTypeDto("MY_MUSIC_SUBSECTION_TABS", 103, "my_music_subsection_tabs");
        MY_MUSIC_SUBSECTION_TABS = baseLinkButtonActionTypeDto104;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto105 = new BaseLinkButtonActionTypeDto("MY_MUSIC_FILTER_SAVE_AS_PLAYLIST", 104, "my_music_filter_save_as_playlist");
        MY_MUSIC_FILTER_SAVE_AS_PLAYLIST = baseLinkButtonActionTypeDto105;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto106 = new BaseLinkButtonActionTypeDto("GROUPS_NON_ACTIVE_GROUPS_UPDATE", 105, "groups_non_active_groups_update");
        GROUPS_NON_ACTIVE_GROUPS_UPDATE = baseLinkButtonActionTypeDto106;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto107 = new BaseLinkButtonActionTypeDto("SEARCH_MODE", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "search_mode");
        SEARCH_MODE = baseLinkButtonActionTypeDto107;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto108 = new BaseLinkButtonActionTypeDto("SECTION_SUBSECTION_TABS", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "section_subsection_tabs");
        SECTION_SUBSECTION_TABS = baseLinkButtonActionTypeDto108;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto109 = new BaseLinkButtonActionTypeDto("SHOW_FILTERS", 108, "show_filters");
        SHOW_FILTERS = baseLinkButtonActionTypeDto109;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto110 = new BaseLinkButtonActionTypeDto("VIDEO_SUBSCRIPTIONS_BLOCK_FILTER", 109, "video_subscriptions_block_filter");
        VIDEO_SUBSCRIPTIONS_BLOCK_FILTER = baseLinkButtonActionTypeDto110;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto111 = new BaseLinkButtonActionTypeDto("SEARCH_SHOW_MORE", 110, "search_show_more");
        SEARCH_SHOW_MORE = baseLinkButtonActionTypeDto111;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto112 = new BaseLinkButtonActionTypeDto("SEARCH_SHOW_ALL", 111, "search_show_all");
        SEARCH_SHOW_ALL = baseLinkButtonActionTypeDto112;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto113 = new BaseLinkButtonActionTypeDto("GROUP_ADMIN_BANNER_CTA", 112, "group_admin_banner_cta");
        GROUP_ADMIN_BANNER_CTA = baseLinkButtonActionTypeDto113;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto114 = new BaseLinkButtonActionTypeDto("OPEN_URL_VIDEO_DISCOVER", 113, "open_url_video_discover");
        OPEN_URL_VIDEO_DISCOVER = baseLinkButtonActionTypeDto114;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto115 = new BaseLinkButtonActionTypeDto("EXPAND_BLOCK_LOCAL", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "expand_block_local");
        EXPAND_BLOCK_LOCAL = baseLinkButtonActionTypeDto115;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto116 = new BaseLinkButtonActionTypeDto("OPEN_VIDEO_PLAYLIST_MODAL", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "open_video_playlist_modal");
        OPEN_VIDEO_PLAYLIST_MODAL = baseLinkButtonActionTypeDto116;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto117 = new BaseLinkButtonActionTypeDto("OPEN_VIDEO_MODAL", 116, "open_video_modal");
        OPEN_VIDEO_MODAL = baseLinkButtonActionTypeDto117;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto118 = new BaseLinkButtonActionTypeDto("DELETE_VIDEO_ITEM", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "delete_video_item");
        DELETE_VIDEO_ITEM = baseLinkButtonActionTypeDto118;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto119 = new BaseLinkButtonActionTypeDto("EDIT_VIDEO_ITEM", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "edit_video_item");
        EDIT_VIDEO_ITEM = baseLinkButtonActionTypeDto119;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto120 = new BaseLinkButtonActionTypeDto("ADD_VIDEO_PLAYLIST", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "add_video_playlist");
        ADD_VIDEO_PLAYLIST = baseLinkButtonActionTypeDto120;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto121 = new BaseLinkButtonActionTypeDto("JOIN", 120, "join");
        JOIN = baseLinkButtonActionTypeDto121;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto122 = new BaseLinkButtonActionTypeDto("OPEN_MUSIC_SEARCH", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "open_music_search");
        OPEN_MUSIC_SEARCH = baseLinkButtonActionTypeDto122;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto123 = new BaseLinkButtonActionTypeDto("IMPORT_AUDIO_LIBRARY", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "import_audio_library");
        IMPORT_AUDIO_LIBRARY = baseLinkButtonActionTypeDto123;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto124 = new BaseLinkButtonActionTypeDto("MY_AUDIOS_SECTION_OPTIONS", 123, "my_audios_section_options");
        MY_AUDIOS_SECTION_OPTIONS = baseLinkButtonActionTypeDto124;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto125 = new BaseLinkButtonActionTypeDto("OPEN_MODAL", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "open_modal");
        OPEN_MODAL = baseLinkButtonActionTypeDto125;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto126 = new BaseLinkButtonActionTypeDto("DOWNLOAD_ALL", 125, "download_all");
        DOWNLOAD_ALL = baseLinkButtonActionTypeDto126;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto127 = new BaseLinkButtonActionTypeDto("CLEAR_DOWNLOAD_HISTORY", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "clear_download_history");
        CLEAR_DOWNLOAD_HISTORY = baseLinkButtonActionTypeDto127;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto128 = new BaseLinkButtonActionTypeDto("CLEAR_SEARCH_HISTORY", 127, "clear_search_history");
        CLEAR_SEARCH_HISTORY = baseLinkButtonActionTypeDto128;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto129 = new BaseLinkButtonActionTypeDto("OPEN_QR_CODE_MODAL", 128, "open_qr_code_modal");
        OPEN_QR_CODE_MODAL = baseLinkButtonActionTypeDto129;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto130 = new BaseLinkButtonActionTypeDto("OWNER_GROUPS", 129, "owner_groups");
        OWNER_GROUPS = baseLinkButtonActionTypeDto130;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto131 = new BaseLinkButtonActionTypeDto("BECOME_AUTHOR_HOWTO", 130, "become_author_howto");
        BECOME_AUTHOR_HOWTO = baseLinkButtonActionTypeDto131;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto132 = new BaseLinkButtonActionTypeDto("CHILD_MODE", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "child_mode");
        CHILD_MODE = baseLinkButtonActionTypeDto132;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto133 = new BaseLinkButtonActionTypeDto("CHANGE_PROFILE", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "change_profile");
        CHANGE_PROFILE = baseLinkButtonActionTypeDto133;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto134 = new BaseLinkButtonActionTypeDto("PLAY_VK_MIX", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "play_vk_mix");
        PLAY_VK_MIX = baseLinkButtonActionTypeDto134;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto135 = new BaseLinkButtonActionTypeDto("VIDEO_ACTION", 134, "video_action");
        VIDEO_ACTION = baseLinkButtonActionTypeDto135;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto136 = new BaseLinkButtonActionTypeDto("OPEN_MENU", 135, "open_menu");
        OPEN_MENU = baseLinkButtonActionTypeDto136;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto137 = new BaseLinkButtonActionTypeDto("OPEN_VIDEO_PAGE", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "open_video_page");
        OPEN_VIDEO_PAGE = baseLinkButtonActionTypeDto137;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto138 = new BaseLinkButtonActionTypeDto("OPEN_INFO_POPUP", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "open_info_popup");
        OPEN_INFO_POPUP = baseLinkButtonActionTypeDto138;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto139 = new BaseLinkButtonActionTypeDto("RUN_HANDLER", 138, "run_handler");
        RUN_HANDLER = baseLinkButtonActionTypeDto139;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto140 = new BaseLinkButtonActionTypeDto("AUTHOR_PAGE", 139, "author_page");
        AUTHOR_PAGE = baseLinkButtonActionTypeDto140;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto141 = new BaseLinkButtonActionTypeDto("SUBSCRIBE", VersionConstants.PRODUCT_MAJOR_VERSION, "subscribe");
        SUBSCRIBE = baseLinkButtonActionTypeDto141;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto142 = new BaseLinkButtonActionTypeDto("SEARCH", 141, "search");
        SEARCH = baseLinkButtonActionTypeDto142;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto143 = new BaseLinkButtonActionTypeDto("EDIT_ARTIST", 142, "edit_artist");
        EDIT_ARTIST = baseLinkButtonActionTypeDto143;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto144 = new BaseLinkButtonActionTypeDto("EDIT_CURATOR", 143, "edit_curator");
        EDIT_CURATOR = baseLinkButtonActionTypeDto144;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto145 = new BaseLinkButtonActionTypeDto("AUDIO_META", 144, "audio_meta");
        AUDIO_META = baseLinkButtonActionTypeDto145;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto146 = new BaseLinkButtonActionTypeDto("DROPDOWN", 145, "dropdown");
        DROPDOWN = baseLinkButtonActionTypeDto146;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto147 = new BaseLinkButtonActionTypeDto("SWITCH_VIDEO_SUBSECTION", 146, "switch_video_subsection");
        SWITCH_VIDEO_SUBSECTION = baseLinkButtonActionTypeDto147;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto148 = new BaseLinkButtonActionTypeDto("OPEN_STUDIO", 147, "open_studio");
        OPEN_STUDIO = baseLinkButtonActionTypeDto148;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto149 = new BaseLinkButtonActionTypeDto("SEARCH_CLEAR", 148, "search_clear");
        SEARCH_CLEAR = baseLinkButtonActionTypeDto149;
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto150 = new BaseLinkButtonActionTypeDto("TOGGLE", 149, "toggle");
        TOGGLE = baseLinkButtonActionTypeDto150;
        BaseLinkButtonActionTypeDto[] baseLinkButtonActionTypeDtoArr = {baseLinkButtonActionTypeDto, baseLinkButtonActionTypeDto2, baseLinkButtonActionTypeDto3, baseLinkButtonActionTypeDto4, baseLinkButtonActionTypeDto5, baseLinkButtonActionTypeDto6, baseLinkButtonActionTypeDto7, baseLinkButtonActionTypeDto8, baseLinkButtonActionTypeDto9, baseLinkButtonActionTypeDto10, baseLinkButtonActionTypeDto11, baseLinkButtonActionTypeDto12, baseLinkButtonActionTypeDto13, baseLinkButtonActionTypeDto14, baseLinkButtonActionTypeDto15, baseLinkButtonActionTypeDto16, baseLinkButtonActionTypeDto17, baseLinkButtonActionTypeDto18, baseLinkButtonActionTypeDto19, baseLinkButtonActionTypeDto20, baseLinkButtonActionTypeDto21, baseLinkButtonActionTypeDto22, baseLinkButtonActionTypeDto23, baseLinkButtonActionTypeDto24, baseLinkButtonActionTypeDto25, baseLinkButtonActionTypeDto26, baseLinkButtonActionTypeDto27, baseLinkButtonActionTypeDto28, baseLinkButtonActionTypeDto29, baseLinkButtonActionTypeDto30, baseLinkButtonActionTypeDto31, baseLinkButtonActionTypeDto32, baseLinkButtonActionTypeDto33, baseLinkButtonActionTypeDto34, baseLinkButtonActionTypeDto35, baseLinkButtonActionTypeDto36, baseLinkButtonActionTypeDto37, baseLinkButtonActionTypeDto38, baseLinkButtonActionTypeDto39, baseLinkButtonActionTypeDto40, baseLinkButtonActionTypeDto41, baseLinkButtonActionTypeDto42, baseLinkButtonActionTypeDto43, baseLinkButtonActionTypeDto44, baseLinkButtonActionTypeDto45, baseLinkButtonActionTypeDto46, baseLinkButtonActionTypeDto47, baseLinkButtonActionTypeDto48, baseLinkButtonActionTypeDto49, baseLinkButtonActionTypeDto50, baseLinkButtonActionTypeDto51, baseLinkButtonActionTypeDto52, baseLinkButtonActionTypeDto53, baseLinkButtonActionTypeDto54, baseLinkButtonActionTypeDto55, baseLinkButtonActionTypeDto56, baseLinkButtonActionTypeDto57, baseLinkButtonActionTypeDto58, baseLinkButtonActionTypeDto59, baseLinkButtonActionTypeDto60, baseLinkButtonActionTypeDto61, baseLinkButtonActionTypeDto62, baseLinkButtonActionTypeDto63, baseLinkButtonActionTypeDto64, baseLinkButtonActionTypeDto65, baseLinkButtonActionTypeDto66, baseLinkButtonActionTypeDto67, baseLinkButtonActionTypeDto68, baseLinkButtonActionTypeDto69, baseLinkButtonActionTypeDto70, baseLinkButtonActionTypeDto71, baseLinkButtonActionTypeDto72, baseLinkButtonActionTypeDto73, baseLinkButtonActionTypeDto74, baseLinkButtonActionTypeDto75, baseLinkButtonActionTypeDto76, baseLinkButtonActionTypeDto77, baseLinkButtonActionTypeDto78, baseLinkButtonActionTypeDto79, baseLinkButtonActionTypeDto80, baseLinkButtonActionTypeDto81, baseLinkButtonActionTypeDto82, baseLinkButtonActionTypeDto83, baseLinkButtonActionTypeDto84, baseLinkButtonActionTypeDto85, baseLinkButtonActionTypeDto86, baseLinkButtonActionTypeDto87, baseLinkButtonActionTypeDto88, baseLinkButtonActionTypeDto89, baseLinkButtonActionTypeDto90, baseLinkButtonActionTypeDto91, baseLinkButtonActionTypeDto92, baseLinkButtonActionTypeDto93, baseLinkButtonActionTypeDto94, baseLinkButtonActionTypeDto95, baseLinkButtonActionTypeDto96, baseLinkButtonActionTypeDto97, baseLinkButtonActionTypeDto98, baseLinkButtonActionTypeDto99, baseLinkButtonActionTypeDto100, baseLinkButtonActionTypeDto101, baseLinkButtonActionTypeDto102, baseLinkButtonActionTypeDto103, baseLinkButtonActionTypeDto104, baseLinkButtonActionTypeDto105, baseLinkButtonActionTypeDto106, baseLinkButtonActionTypeDto107, baseLinkButtonActionTypeDto108, baseLinkButtonActionTypeDto109, baseLinkButtonActionTypeDto110, baseLinkButtonActionTypeDto111, baseLinkButtonActionTypeDto112, baseLinkButtonActionTypeDto113, baseLinkButtonActionTypeDto114, baseLinkButtonActionTypeDto115, baseLinkButtonActionTypeDto116, baseLinkButtonActionTypeDto117, baseLinkButtonActionTypeDto118, baseLinkButtonActionTypeDto119, baseLinkButtonActionTypeDto120, baseLinkButtonActionTypeDto121, baseLinkButtonActionTypeDto122, baseLinkButtonActionTypeDto123, baseLinkButtonActionTypeDto124, baseLinkButtonActionTypeDto125, baseLinkButtonActionTypeDto126, baseLinkButtonActionTypeDto127, baseLinkButtonActionTypeDto128, baseLinkButtonActionTypeDto129, baseLinkButtonActionTypeDto130, baseLinkButtonActionTypeDto131, baseLinkButtonActionTypeDto132, baseLinkButtonActionTypeDto133, baseLinkButtonActionTypeDto134, baseLinkButtonActionTypeDto135, baseLinkButtonActionTypeDto136, baseLinkButtonActionTypeDto137, baseLinkButtonActionTypeDto138, baseLinkButtonActionTypeDto139, baseLinkButtonActionTypeDto140, baseLinkButtonActionTypeDto141, baseLinkButtonActionTypeDto142, baseLinkButtonActionTypeDto143, baseLinkButtonActionTypeDto144, baseLinkButtonActionTypeDto145, baseLinkButtonActionTypeDto146, baseLinkButtonActionTypeDto147, baseLinkButtonActionTypeDto148, baseLinkButtonActionTypeDto149, baseLinkButtonActionTypeDto150};
        $VALUES = baseLinkButtonActionTypeDtoArr;
        $ENTRIES = new asp(baseLinkButtonActionTypeDtoArr);
        CREATOR = new a();
    }

    private BaseLinkButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<BaseLinkButtonActionTypeDto> i() {
        return $ENTRIES;
    }

    public static BaseLinkButtonActionTypeDto valueOf(String str) {
        return (BaseLinkButtonActionTypeDto) Enum.valueOf(BaseLinkButtonActionTypeDto.class, str);
    }

    public static BaseLinkButtonActionTypeDto[] values() {
        return (BaseLinkButtonActionTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
