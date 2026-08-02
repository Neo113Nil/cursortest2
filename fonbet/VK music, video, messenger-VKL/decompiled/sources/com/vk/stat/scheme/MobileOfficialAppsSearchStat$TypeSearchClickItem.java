package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSearchStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSearchStat$TypeSearchClickItem implements SchemeStat$TypeClick.b {

    @pmi0("action")
    private final Action action;

    @pmi0("block_name")
    private final String blockName;

    @pmi0("block_position")
    private final Integer blockPosition;

    @pmi0("query_text")
    private final String queryText;

    @pmi0("ref_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen refScreen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSearchStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("add_friend")
        public static final Action ADD_FRIEND;

        @pmi0("add_friends")
        public static final Action ADD_FRIENDS;

        @pmi0("add_friend_out")
        public static final Action ADD_FRIEND_OUT;

        @pmi0("add_one_more_out")
        public static final Action ADD_ONE_MORE_OUT;

        @pmi0("add_sleep_out")
        public static final Action ADD_SLEEP_OUT;

        @pmi0("add_to_cart")
        public static final Action ADD_TO_CART;

        @pmi0("add_to_cart_out")
        public static final Action ADD_TO_CART_OUT;

        @pmi0("add_to_me")
        public static final Action ADD_TO_ME;

        @pmi0("add_to_me_out")
        public static final Action ADD_TO_ME_OUT;

        @pmi0("add_to_playlist")
        public static final Action ADD_TO_PLAYLIST;

        @pmi0("add_to_playlist_out")
        public static final Action ADD_TO_PLAYLIST_OUT;

        @pmi0("add_to_story")
        public static final Action ADD_TO_STORY;

        @pmi0("add_to_story_out")
        public static final Action ADD_TO_STORY_OUT;

        @pmi0("broadcast")
        public static final Action BROADCAST;

        @pmi0("broadcast_out")
        public static final Action BROADCAST_OUT;

        @pmi0("build_route_out")
        public static final Action BUILD_ROUTE_OUT;

        @pmi0("buy_out")
        public static final Action BUY_OUT;

        @pmi0(NotificationCompat.CATEGORY_CALL)
        public static final Action CALL;

        @pmi0("call_out")
        public static final Action CALL_OUT;

        @pmi0("click_review")
        public static final Action CLICK_REVIEW;

        @pmi0("close_filter")
        public static final Action CLOSE_FILTER;

        @pmi0("collapse_bottomsheet")
        public static final Action COLLAPSE_BOTTOMSHEET;

        @pmi0("copy_address")
        public static final Action COPY_ADDRESS;

        @pmi0("copy_link")
        public static final Action COPY_LINK;

        @pmi0("copy_link_out")
        public static final Action COPY_LINK_OUT;

        @pmi0("copy_message_out")
        public static final Action COPY_MESSAGE_OUT;

        @pmi0("delete_message_out")
        public static final Action DELETE_MESSAGE_OUT;

        @pmi0("dislike_out")
        public static final Action DISLIKE_OUT;

        @pmi0("download")
        public static final Action DOWNLOAD;

        @pmi0("download_out")
        public static final Action DOWNLOAD_OUT;

        @pmi0("edit_message_out")
        public static final Action EDIT_MESSAGE_OUT;

        @pmi0("extend_episodes")
        public static final Action EXTEND_EPISODES;

        @pmi0("fave")
        public static final Action FAVE;

        @pmi0("fave_out")
        public static final Action FAVE_OUT;

        @pmi0("invite_out")
        public static final Action INVITE_OUT;

        @pmi0("join_group")
        public static final Action JOIN_GROUP;

        @pmi0("join_group_out")
        public static final Action JOIN_GROUP_OUT;

        @pmi0("leave_group")
        public static final Action LEAVE_GROUP;

        @pmi0("leave_group_out")
        public static final Action LEAVE_GROUP_OUT;

        @pmi0("like")
        public static final Action LIKE;

        @pmi0("like_out")
        public static final Action LIKE_OUT;

        @pmi0("listen_next")
        public static final Action LISTEN_NEXT;

        @pmi0("listen_next_out")
        public static final Action LISTEN_NEXT_OUT;

        @pmi0("locate_me")
        public static final Action LOCATE_ME;

        @pmi0("long_tap")
        public static final Action LONG_TAP;

        @pmi0("make_clip_out")
        public static final Action MAKE_CLIP_OUT;

        @pmi0("make_duet_out")
        public static final Action MAKE_DUET_OUT;

        @pmi0("mix_all_out")
        public static final Action MIX_ALL_OUT;

        @pmi0("money")
        public static final Action MONEY;

        @pmi0("money_out")
        public static final Action MONEY_OUT;

        @pmi0("move_map")
        public static final Action MOVE_MAP;

        @pmi0("notify_out")
        public static final Action NOTIFY_OUT;

        @pmi0("not_interested")
        public static final Action NOT_INTERESTED;

        @pmi0("not_interested_out")
        public static final Action NOT_INTERESTED_OUT;

        @pmi0("open_album")
        public static final Action OPEN_ALBUM;

        @pmi0("open_album_out")
        public static final Action OPEN_ALBUM_OUT;

        @pmi0("open_app")
        public static final Action OPEN_APP;

        @pmi0("open_attached_music_out")
        public static final Action OPEN_ATTACHED_MUSIC_OUT;

        @pmi0("open_cart")
        public static final Action OPEN_CART;

        @pmi0("open_cart_out")
        public static final Action OPEN_CART_OUT;

        @pmi0("open_chat_profile_out")
        public static final Action OPEN_CHAT_PROFILE_OUT;

        @pmi0("open_comments_out")
        public static final Action OPEN_COMMENTS_OUT;

        @pmi0("open_episodes")
        public static final Action OPEN_EPISODES;

        @pmi0("open_fave_out")
        public static final Action OPEN_FAVE_OUT;

        @pmi0("open_filter")
        public static final Action OPEN_FILTER;

        @pmi0("open_filters")
        public static final Action OPEN_FILTERS;

        @pmi0("open_full_video_out")
        public static final Action OPEN_FULL_VIDEO_OUT;

        @pmi0("open_geo_settings")
        public static final Action OPEN_GEO_SETTINGS;

        @pmi0("open_geo_settings_out")
        public static final Action OPEN_GEO_SETTINGS_OUT;

        @pmi0("open_hashtag_out")
        public static final Action OPEN_HASHTAG_OUT;

        @pmi0("open_link")
        public static final Action OPEN_LINK;

        @pmi0("open_link_out")
        public static final Action OPEN_LINK_OUT;

        @pmi0("open_longread_out")
        public static final Action OPEN_LONGREAD_OUT;

        @pmi0("open_map")
        public static final Action OPEN_MAP;

        @pmi0("open_market_out")
        public static final Action OPEN_MARKET_OUT;

        @pmi0("open_message_search_out")
        public static final Action OPEN_MESSAGE_SEARCH_OUT;

        @pmi0("open_owner")
        public static final Action OPEN_OWNER;

        @pmi0("open_owner_out")
        public static final Action OPEN_OWNER_OUT;

        @pmi0("open_thematic_out")
        public static final Action OPEN_THEMATIC_OUT;

        @pmi0("pause")
        public static final Action PAUSE;

        @pmi0("pause_all_out")
        public static final Action PAUSE_ALL_OUT;

        @pmi0("pause_out")
        public static final Action PAUSE_OUT;

        @pmi0("pin_video")
        public static final Action PIN_VIDEO;

        @pmi0("play")
        public static final Action PLAY;

        @pmi0("play_all")
        public static final Action PLAY_ALL;

        @pmi0("play_all_out")
        public static final Action PLAY_ALL_OUT;

        @pmi0("play_out")
        public static final Action PLAY_OUT;

        @pmi0("provide_broad_geo")
        public static final Action PROVIDE_BROAD_GEO;

        @pmi0("provide_broad_geo_out")
        public static final Action PROVIDE_BROAD_GEO_OUT;

        @pmi0("provide_precise_geo")
        public static final Action PROVIDE_PRECISE_GEO;

        @pmi0("provide_precise_geo_out")
        public static final Action PROVIDE_PRECISE_GEO_OUT;

        @pmi0("reject_geo")
        public static final Action REJECT_GEO;

        @pmi0("reject_geo_out")
        public static final Action REJECT_GEO_OUT;

        @pmi0("remove_friend")
        public static final Action REMOVE_FRIEND;

        @pmi0("remove_friend_out")
        public static final Action REMOVE_FRIEND_OUT;

        @pmi0("remove_from_me")
        public static final Action REMOVE_FROM_ME;

        @pmi0("remove_from_me_out")
        public static final Action REMOVE_FROM_ME_OUT;

        @pmi0("remove_recent")
        public static final Action REMOVE_RECENT;

        @pmi0("remove_recent_out")
        public static final Action REMOVE_RECENT_OUT;

        @pmi0("remove_subscriber")
        public static final Action REMOVE_SUBSCRIBER;

        @pmi0("remove_subscriber_out")
        public static final Action REMOVE_SUBSCRIBER_OUT;

        @pmi0("reply_out")
        public static final Action REPLY_OUT;

        @pmi0("request_precise_user_geo")
        public static final Action REQUEST_PRECISE_USER_GEO;

        @pmi0("request_precise_user_geo_out")
        public static final Action REQUEST_PRECISE_USER_GEO_OUT;

        @pmi0("request_user_geo")
        public static final Action REQUEST_USER_GEO;

        @pmi0("request_user_geo_out")
        public static final Action REQUEST_USER_GEO_OUT;

        @pmi0("reset_filters")
        public static final Action RESET_FILTERS;

        @pmi0("select_catalog_tab")
        public static final Action SELECT_CATALOG_TAB;

        @pmi0("send_gift")
        public static final Action SEND_GIFT;

        @pmi0("send_gift_out")
        public static final Action SEND_GIFT_OUT;

        @pmi0("send_message")
        public static final Action SEND_MESSAGE;

        @pmi0("send_message_out")
        public static final Action SEND_MESSAGE_OUT;

        @pmi0("set_reaction_out")
        public static final Action SET_REACTION_OUT;

        @pmi0("share")
        public static final Action SHARE;

        @pmi0("share_out")
        public static final Action SHARE_OUT;

        @pmi0("show_all_clips_out")
        public static final Action SHOW_ALL_CLIPS_OUT;

        @pmi0("show_all_longreads_out")
        public static final Action SHOW_ALL_LONGREADS_OUT;

        @pmi0("show_all_music_out")
        public static final Action SHOW_ALL_MUSIC_OUT;

        @pmi0("show_all_nft_out")
        public static final Action SHOW_ALL_NFT_OUT;

        @pmi0("show_all_photos_out")
        public static final Action SHOW_ALL_PHOTOS_OUT;

        @pmi0("show_all_plots_out")
        public static final Action SHOW_ALL_PLOTS_OUT;

        @pmi0("show_all_videos_out")
        public static final Action SHOW_ALL_VIDEOS_OUT;

        @pmi0("show_full_bottomsheet")
        public static final Action SHOW_FULL_BOTTOMSHEET;

        @pmi0("show_half_bottomsheet")
        public static final Action SHOW_HALF_BOTTOMSHEET;

        @pmi0("show_same")
        public static final Action SHOW_SAME;

        @pmi0("show_same_out")
        public static final Action SHOW_SAME_OUT;

        @pmi0("show_same_serp")
        public static final Action SHOW_SAME_SERP;

        @pmi0("show_stories")
        public static final Action SHOW_STORIES;

        @pmi0("show_stories_out")
        public static final Action SHOW_STORIES_OUT;

        @pmi0("start")
        public static final Action START;

        @pmi0("subscribe")
        public static final Action SUBSCRIBE;

        @pmi0("subscribe_all")
        public static final Action SUBSCRIBE_ALL;

        @pmi0("subscribe_all_out")
        public static final Action SUBSCRIBE_ALL_OUT;

        @pmi0("subscribe_no_notify")
        public static final Action SUBSCRIBE_NO_NOTIFY;

        @pmi0("subscribe_no_notify_out")
        public static final Action SUBSCRIBE_NO_NOTIFY_OUT;

        @pmi0("subscribe_out")
        public static final Action SUBSCRIBE_OUT;

        @pmi0("subscribe_useful")
        public static final Action SUBSCRIBE_USEFUL;

        @pmi0("subscribe_useful_out")
        public static final Action SUBSCRIBE_USEFUL_OUT;

        @pmi0("tap")
        public static final Action TAP;

        @pmi0("tap_on_map")
        public static final Action TAP_ON_MAP;

        @pmi0("tap_show_all")
        public static final Action TAP_SHOW_ALL;

        @pmi0("unfave")
        public static final Action UNFAVE;

        @pmi0("unfave_out")
        public static final Action UNFAVE_OUT;

        @pmi0("unlike")
        public static final Action UNLIKE;

        @pmi0("unlike_out")
        public static final Action UNLIKE_OUT;

        @pmi0("unnotify_out")
        public static final Action UNNOTIFY_OUT;

        @pmi0("unpin_video")
        public static final Action UNPIN_VIDEO;

        @pmi0("unsubscribe")
        public static final Action UNSUBSCRIBE;

        @pmi0("unsubscribe_out")
        public static final Action UNSUBSCRIBE_OUT;

        @pmi0("video_playlist_collapse")
        public static final Action VIDEO_PLAYLIST_COLLAPSE;

        @pmi0("video_playlist_expand")
        public static final Action VIDEO_PLAYLIST_EXPAND;

        @pmi0("write_msg")
        public static final Action WRITE_MSG;

        @pmi0("write_msg_out")
        public static final Action WRITE_MSG_OUT;

        static {
            Action action = new Action("VIDEO_PLAYLIST_EXPAND", 0);
            VIDEO_PLAYLIST_EXPAND = action;
            Action action2 = new Action("VIDEO_PLAYLIST_COLLAPSE", 1);
            VIDEO_PLAYLIST_COLLAPSE = action2;
            Action action3 = new Action("START", 2);
            START = action3;
            Action action4 = new Action("PLAY", 3);
            PLAY = action4;
            Action action5 = new Action("WRITE_MSG", 4);
            WRITE_MSG = action5;
            Action action6 = new Action("WRITE_MSG_OUT", 5);
            WRITE_MSG_OUT = action6;
            Action action7 = new Action("ADD_FRIENDS", 6);
            ADD_FRIENDS = action7;
            Action action8 = new Action("OPEN_APP", 7);
            OPEN_APP = action8;
            Action action9 = new Action("TAP", 8);
            TAP = action9;
            Action action10 = new Action("REMOVE_FRIEND", 9);
            REMOVE_FRIEND = action10;
            Action action11 = new Action("REMOVE_FRIEND_OUT", 10);
            REMOVE_FRIEND_OUT = action11;
            Action action12 = new Action("REMOVE_SUBSCRIBER", 11);
            REMOVE_SUBSCRIBER = action12;
            Action action13 = new Action("REMOVE_SUBSCRIBER_OUT", 12);
            REMOVE_SUBSCRIBER_OUT = action13;
            Action action14 = new Action("ADD_FRIEND", 13);
            ADD_FRIEND = action14;
            Action action15 = new Action("ADD_FRIEND_OUT", 14);
            ADD_FRIEND_OUT = action15;
            Action action16 = new Action("JOIN_GROUP", 15);
            JOIN_GROUP = action16;
            Action action17 = new Action("JOIN_GROUP_OUT", 16);
            JOIN_GROUP_OUT = action17;
            Action action18 = new Action("LEAVE_GROUP", 17);
            LEAVE_GROUP = action18;
            Action action19 = new Action("LEAVE_GROUP_OUT", 18);
            LEAVE_GROUP_OUT = action19;
            Action action20 = new Action("SEND_MESSAGE", 19);
            SEND_MESSAGE = action20;
            Action action21 = new Action("SEND_MESSAGE_OUT", 20);
            SEND_MESSAGE_OUT = action21;
            Action action22 = new Action("FAVE", 21);
            FAVE = action22;
            Action action23 = new Action("FAVE_OUT", 22);
            FAVE_OUT = action23;
            Action action24 = new Action("UNFAVE", 23);
            UNFAVE = action24;
            Action action25 = new Action("UNFAVE_OUT", 24);
            UNFAVE_OUT = action25;
            Action action26 = new Action("MONEY", 25);
            MONEY = action26;
            Action action27 = new Action("MONEY_OUT", 26);
            MONEY_OUT = action27;
            Action action28 = new Action("CALL", 27);
            CALL = action28;
            Action action29 = new Action("CALL_OUT", 28);
            CALL_OUT = action29;
            Action action30 = new Action("SEND_GIFT", 29);
            SEND_GIFT = action30;
            Action action31 = new Action("SEND_GIFT_OUT", 30);
            SEND_GIFT_OUT = action31;
            Action action32 = new Action("SHOW_STORIES", 31);
            SHOW_STORIES = action32;
            Action action33 = new Action("SHOW_STORIES_OUT", 32);
            SHOW_STORIES_OUT = action33;
            Action action34 = new Action("SUBSCRIBE", 33);
            SUBSCRIBE = action34;
            Action action35 = new Action("SUBSCRIBE_OUT", 34);
            SUBSCRIBE_OUT = action35;
            Action action36 = new Action("UNSUBSCRIBE", 35);
            UNSUBSCRIBE = action36;
            Action action37 = new Action("UNSUBSCRIBE_OUT", 36);
            UNSUBSCRIBE_OUT = action37;
            Action action38 = new Action("PLAY_ALL", 37);
            PLAY_ALL = action38;
            Action action39 = new Action("PLAY_ALL_OUT", 38);
            PLAY_ALL_OUT = action39;
            Action action40 = new Action("OPEN_OWNER", 39);
            OPEN_OWNER = action40;
            Action action41 = new Action("OPEN_OWNER_OUT", 40);
            OPEN_OWNER_OUT = action41;
            Action action42 = new Action("COPY_LINK", 41);
            COPY_LINK = action42;
            Action action43 = new Action("COPY_LINK_OUT", 42);
            COPY_LINK_OUT = action43;
            Action action44 = new Action("SHARE", 43);
            SHARE = action44;
            Action action45 = new Action("SHARE_OUT", 44);
            SHARE_OUT = action45;
            Action action46 = new Action("LIKE", 45);
            LIKE = action46;
            Action action47 = new Action("LIKE_OUT", 46);
            LIKE_OUT = action47;
            Action action48 = new Action("UNLIKE", 47);
            UNLIKE = action48;
            Action action49 = new Action("UNLIKE_OUT", 48);
            UNLIKE_OUT = action49;
            Action action50 = new Action("DOWNLOAD", 49);
            DOWNLOAD = action50;
            Action action51 = new Action("DOWNLOAD_OUT", 50);
            DOWNLOAD_OUT = action51;
            Action action52 = new Action("ADD_TO_ME", 51);
            ADD_TO_ME = action52;
            Action action53 = new Action("ADD_TO_ME_OUT", 52);
            ADD_TO_ME_OUT = action53;
            Action action54 = new Action("REMOVE_FROM_ME", 53);
            REMOVE_FROM_ME = action54;
            Action action55 = new Action("REMOVE_FROM_ME_OUT", 54);
            REMOVE_FROM_ME_OUT = action55;
            Action action56 = new Action("REMOVE_RECENT", 55);
            REMOVE_RECENT = action56;
            Action action57 = new Action("REMOVE_RECENT_OUT", 56);
            REMOVE_RECENT_OUT = action57;
            Action action58 = new Action("OPEN_FILTER", 57);
            OPEN_FILTER = action58;
            Action action59 = new Action("OPEN_FILTERS", 58);
            OPEN_FILTERS = action59;
            Action action60 = new Action("NOTIFY_OUT", 59);
            NOTIFY_OUT = action60;
            Action action61 = new Action("UNNOTIFY_OUT", 60);
            UNNOTIFY_OUT = action61;
            Action action62 = new Action("DISLIKE_OUT", 61);
            DISLIKE_OUT = action62;
            Action action63 = new Action("MAKE_DUET_OUT", 62);
            MAKE_DUET_OUT = action63;
            Action action64 = new Action("MAKE_CLIP_OUT", 63);
            MAKE_CLIP_OUT = action64;
            Action action65 = new Action("TAP_SHOW_ALL", 64);
            TAP_SHOW_ALL = action65;
            Action action66 = new Action("MIX_ALL_OUT", 65);
            MIX_ALL_OUT = action66;
            Action action67 = new Action("PLAY_OUT", 66);
            PLAY_OUT = action67;
            Action action68 = new Action("PAUSE", 67);
            PAUSE = action68;
            Action action69 = new Action("PAUSE_OUT", 68);
            PAUSE_OUT = action69;
            Action action70 = new Action("SHOW_SAME", 69);
            SHOW_SAME = action70;
            Action action71 = new Action("SHOW_SAME_OUT", 70);
            SHOW_SAME_OUT = action71;
            Action action72 = new Action("LISTEN_NEXT", 71);
            LISTEN_NEXT = action72;
            Action action73 = new Action("LISTEN_NEXT_OUT", 72);
            LISTEN_NEXT_OUT = action73;
            Action action74 = new Action("ADD_TO_PLAYLIST", 73);
            ADD_TO_PLAYLIST = action74;
            Action action75 = new Action("ADD_TO_PLAYLIST_OUT", 74);
            ADD_TO_PLAYLIST_OUT = action75;
            Action action76 = new Action("PIN_VIDEO", 75);
            PIN_VIDEO = action76;
            Action action77 = new Action("UNPIN_VIDEO", 76);
            UNPIN_VIDEO = action77;
            Action action78 = new Action("OPEN_FULL_VIDEO_OUT", 77);
            OPEN_FULL_VIDEO_OUT = action78;
            Action action79 = new Action("ADD_SLEEP_OUT", 78);
            ADD_SLEEP_OUT = action79;
            Action action80 = new Action("PAUSE_ALL_OUT", 79);
            PAUSE_ALL_OUT = action80;
            Action action81 = new Action("ADD_TO_STORY", 80);
            ADD_TO_STORY = action81;
            Action action82 = new Action("ADD_TO_STORY_OUT", 81);
            ADD_TO_STORY_OUT = action82;
            Action action83 = new Action("NOT_INTERESTED", 82);
            NOT_INTERESTED = action83;
            Action action84 = new Action("NOT_INTERESTED_OUT", 83);
            NOT_INTERESTED_OUT = action84;
            Action action85 = new Action("BROADCAST", 84);
            BROADCAST = action85;
            Action action86 = new Action("BROADCAST_OUT", 85);
            BROADCAST_OUT = action86;
            Action action87 = new Action("OPEN_ALBUM", 86);
            OPEN_ALBUM = action87;
            Action action88 = new Action("OPEN_ALBUM_OUT", 87);
            OPEN_ALBUM_OUT = action88;
            Action action89 = new Action("SHOW_ALL_CLIPS_OUT", 88);
            SHOW_ALL_CLIPS_OUT = action89;
            Action action90 = new Action("SHOW_ALL_VIDEOS_OUT", 89);
            SHOW_ALL_VIDEOS_OUT = action90;
            Action action91 = new Action("SHOW_ALL_PLOTS_OUT", 90);
            SHOW_ALL_PLOTS_OUT = action91;
            Action action92 = new Action("SHOW_ALL_PHOTOS_OUT", 91);
            SHOW_ALL_PHOTOS_OUT = action92;
            Action action93 = new Action("SHOW_ALL_NFT_OUT", 92);
            SHOW_ALL_NFT_OUT = action93;
            Action action94 = new Action("SHOW_ALL_MUSIC_OUT", 93);
            SHOW_ALL_MUSIC_OUT = action94;
            Action action95 = new Action("SHOW_ALL_LONGREADS_OUT", 94);
            SHOW_ALL_LONGREADS_OUT = action95;
            Action action96 = new Action("OPEN_LONGREAD_OUT", 95);
            OPEN_LONGREAD_OUT = action96;
            Action action97 = new Action("OPEN_MARKET_OUT", 96);
            OPEN_MARKET_OUT = action97;
            Action action98 = new Action("OPEN_FAVE_OUT", 97);
            OPEN_FAVE_OUT = action98;
            Action action99 = new Action("OPEN_CART_OUT", 98);
            OPEN_CART_OUT = action99;
            Action action100 = new Action("ADD_TO_CART_OUT", 99);
            ADD_TO_CART_OUT = action100;
            Action action101 = new Action("ADD_ONE_MORE_OUT", 100);
            ADD_ONE_MORE_OUT = action101;
            Action action102 = new Action("BUY_OUT", 101);
            BUY_OUT = action102;
            Action action103 = new Action("INVITE_OUT", 102);
            INVITE_OUT = action103;
            Action action104 = new Action("OPEN_MESSAGE_SEARCH_OUT", 103);
            OPEN_MESSAGE_SEARCH_OUT = action104;
            Action action105 = new Action("OPEN_CHAT_PROFILE_OUT", 104);
            OPEN_CHAT_PROFILE_OUT = action105;
            Action action106 = new Action("DELETE_MESSAGE_OUT", 105);
            DELETE_MESSAGE_OUT = action106;
            Action action107 = new Action("REPLY_OUT", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            REPLY_OUT = action107;
            Action action108 = new Action("COPY_MESSAGE_OUT", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            COPY_MESSAGE_OUT = action108;
            Action action109 = new Action("EDIT_MESSAGE_OUT", 108);
            EDIT_MESSAGE_OUT = action109;
            Action action110 = new Action("SET_REACTION_OUT", 109);
            SET_REACTION_OUT = action110;
            Action action111 = new Action("OPEN_COMMENTS_OUT", 110);
            OPEN_COMMENTS_OUT = action111;
            Action action112 = new Action("OPEN_HASHTAG_OUT", 111);
            OPEN_HASHTAG_OUT = action112;
            Action action113 = new Action("OPEN_THEMATIC_OUT", 112);
            OPEN_THEMATIC_OUT = action113;
            Action action114 = new Action("OPEN_ATTACHED_MUSIC_OUT", 113);
            OPEN_ATTACHED_MUSIC_OUT = action114;
            Action action115 = new Action("OPEN_LINK_OUT", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            OPEN_LINK_OUT = action115;
            Action action116 = new Action("SHOW_SAME_SERP", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            SHOW_SAME_SERP = action116;
            Action action117 = new Action("LONG_TAP", 116);
            LONG_TAP = action117;
            Action action118 = new Action("SUBSCRIBE_ALL", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            SUBSCRIBE_ALL = action118;
            Action action119 = new Action("SUBSCRIBE_ALL_OUT", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            SUBSCRIBE_ALL_OUT = action119;
            Action action120 = new Action("SUBSCRIBE_USEFUL", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            SUBSCRIBE_USEFUL = action120;
            Action action121 = new Action("SUBSCRIBE_USEFUL_OUT", 120);
            SUBSCRIBE_USEFUL_OUT = action121;
            Action action122 = new Action("SUBSCRIBE_NO_NOTIFY", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            SUBSCRIBE_NO_NOTIFY = action122;
            Action action123 = new Action("SUBSCRIBE_NO_NOTIFY_OUT", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            SUBSCRIBE_NO_NOTIFY_OUT = action123;
            Action action124 = new Action("OPEN_CART", 123);
            OPEN_CART = action124;
            Action action125 = new Action("OPEN_LINK", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            OPEN_LINK = action125;
            Action action126 = new Action("ADD_TO_CART", 125);
            ADD_TO_CART = action126;
            Action action127 = new Action("REQUEST_USER_GEO", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            REQUEST_USER_GEO = action127;
            Action action128 = new Action("REQUEST_USER_GEO_OUT", 127);
            REQUEST_USER_GEO_OUT = action128;
            Action action129 = new Action("PROVIDE_PRECISE_GEO", 128);
            PROVIDE_PRECISE_GEO = action129;
            Action action130 = new Action("PROVIDE_PRECISE_GEO_OUT", 129);
            PROVIDE_PRECISE_GEO_OUT = action130;
            Action action131 = new Action("PROVIDE_BROAD_GEO", 130);
            PROVIDE_BROAD_GEO = action131;
            Action action132 = new Action("PROVIDE_BROAD_GEO_OUT", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            PROVIDE_BROAD_GEO_OUT = action132;
            Action action133 = new Action("REJECT_GEO", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            REJECT_GEO = action133;
            Action action134 = new Action("REJECT_GEO_OUT", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            REJECT_GEO_OUT = action134;
            Action action135 = new Action("RESET_FILTERS", 134);
            RESET_FILTERS = action135;
            Action action136 = new Action("TAP_ON_MAP", 135);
            TAP_ON_MAP = action136;
            Action action137 = new Action("LOCATE_ME", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            LOCATE_ME = action137;
            Action action138 = new Action("SHOW_FULL_BOTTOMSHEET", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            SHOW_FULL_BOTTOMSHEET = action138;
            Action action139 = new Action("SHOW_HALF_BOTTOMSHEET", 138);
            SHOW_HALF_BOTTOMSHEET = action139;
            Action action140 = new Action("COLLAPSE_BOTTOMSHEET", 139);
            COLLAPSE_BOTTOMSHEET = action140;
            Action action141 = new Action("BUILD_ROUTE_OUT", VersionConstants.PRODUCT_MAJOR_VERSION);
            BUILD_ROUTE_OUT = action141;
            Action action142 = new Action("REQUEST_PRECISE_USER_GEO", 141);
            REQUEST_PRECISE_USER_GEO = action142;
            Action action143 = new Action("REQUEST_PRECISE_USER_GEO_OUT", 142);
            REQUEST_PRECISE_USER_GEO_OUT = action143;
            Action action144 = new Action("OPEN_GEO_SETTINGS", 143);
            OPEN_GEO_SETTINGS = action144;
            Action action145 = new Action("OPEN_GEO_SETTINGS_OUT", 144);
            OPEN_GEO_SETTINGS_OUT = action145;
            Action action146 = new Action("OPEN_MAP", 145);
            OPEN_MAP = action146;
            Action action147 = new Action("MOVE_MAP", 146);
            MOVE_MAP = action147;
            Action action148 = new Action("COPY_ADDRESS", 147);
            COPY_ADDRESS = action148;
            Action action149 = new Action("CLICK_REVIEW", 148);
            CLICK_REVIEW = action149;
            Action action150 = new Action("CLOSE_FILTER", 149);
            CLOSE_FILTER = action150;
            Action action151 = new Action("SELECT_CATALOG_TAB", 150);
            SELECT_CATALOG_TAB = action151;
            Action action152 = new Action("EXTEND_EPISODES", 151);
            EXTEND_EPISODES = action152;
            Action action153 = new Action("OPEN_EPISODES", 152);
            OPEN_EPISODES = action153;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15, action16, action17, action18, action19, action20, action21, action22, action23, action24, action25, action26, action27, action28, action29, action30, action31, action32, action33, action34, action35, action36, action37, action38, action39, action40, action41, action42, action43, action44, action45, action46, action47, action48, action49, action50, action51, action52, action53, action54, action55, action56, action57, action58, action59, action60, action61, action62, action63, action64, action65, action66, action67, action68, action69, action70, action71, action72, action73, action74, action75, action76, action77, action78, action79, action80, action81, action82, action83, action84, action85, action86, action87, action88, action89, action90, action91, action92, action93, action94, action95, action96, action97, action98, action99, action100, action101, action102, action103, action104, action105, action106, action107, action108, action109, action110, action111, action112, action113, action114, action115, action116, action117, action118, action119, action120, action121, action122, action123, action124, action125, action126, action127, action128, action129, action130, action131, action132, action133, action134, action135, action136, action137, action138, action139, action140, action141, action142, action143, action144, action145, action146, action147, action148, action149, action150, action151, action152, action153};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSearchStat$TypeSearchClickItem(Action action, String str, Integer num, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.action = action;
        this.queryText = str;
        this.blockPosition = num;
        this.blockName = str2;
        this.refScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSearchStat$TypeSearchClickItem)) {
            return false;
        }
        MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem = (MobileOfficialAppsSearchStat$TypeSearchClickItem) obj;
        return this.action == mobileOfficialAppsSearchStat$TypeSearchClickItem.action && epx.f(this.queryText, mobileOfficialAppsSearchStat$TypeSearchClickItem.queryText) && epx.f(this.blockPosition, mobileOfficialAppsSearchStat$TypeSearchClickItem.blockPosition) && epx.f(this.blockName, mobileOfficialAppsSearchStat$TypeSearchClickItem.blockName) && this.refScreen == mobileOfficialAppsSearchStat$TypeSearchClickItem.refScreen;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.queryText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.blockPosition;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.blockName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.refScreen;
        return hashCode4 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSearchClickItem(action=" + this.action + ", queryText=" + this.queryText + ", blockPosition=" + this.blockPosition + ", blockName=" + this.blockName + ", refScreen=" + this.refScreen + ')';
    }

    public /* synthetic */ MobileOfficialAppsSearchStat$TypeSearchClickItem(Action action, String str, Integer num, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this(action, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
