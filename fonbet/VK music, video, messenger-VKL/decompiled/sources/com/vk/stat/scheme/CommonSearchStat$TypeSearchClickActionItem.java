package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchClickActionItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonSearchStat$TypeSearchClickActionItem[] $VALUES;

    @pmi0("add_friend")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_FRIEND;

    @pmi0("add_friends")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_FRIENDS;

    @pmi0("add_friend_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_FRIEND_OUT;

    @pmi0("add_one_more_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_ONE_MORE_OUT;

    @pmi0("add_sleep_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_SLEEP_OUT;

    @pmi0("add_to_cart_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_CART_OUT;

    @pmi0("add_to_me")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_ME;

    @pmi0("add_to_me_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_ME_OUT;

    @pmi0("add_to_playlist")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_PLAYLIST;

    @pmi0("add_to_playlist_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_PLAYLIST_OUT;

    @pmi0("add_to_story")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_STORY;

    @pmi0("add_to_story_out")
    public static final CommonSearchStat$TypeSearchClickActionItem ADD_TO_STORY_OUT;

    @pmi0("broadcast")
    public static final CommonSearchStat$TypeSearchClickActionItem BROADCAST;

    @pmi0("broadcast_out")
    public static final CommonSearchStat$TypeSearchClickActionItem BROADCAST_OUT;

    @pmi0("buy_out")
    public static final CommonSearchStat$TypeSearchClickActionItem BUY_OUT;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final CommonSearchStat$TypeSearchClickActionItem CALL;

    @pmi0("call_out")
    public static final CommonSearchStat$TypeSearchClickActionItem CALL_OUT;

    @pmi0("close_filter")
    public static final CommonSearchStat$TypeSearchClickActionItem CLOSE_FILTER;

    @pmi0("copy_link")
    public static final CommonSearchStat$TypeSearchClickActionItem COPY_LINK;

    @pmi0("copy_link_out")
    public static final CommonSearchStat$TypeSearchClickActionItem COPY_LINK_OUT;

    @pmi0("copy_message_out")
    public static final CommonSearchStat$TypeSearchClickActionItem COPY_MESSAGE_OUT;

    @pmi0("delete_message_out")
    public static final CommonSearchStat$TypeSearchClickActionItem DELETE_MESSAGE_OUT;

    @pmi0("dislike")
    public static final CommonSearchStat$TypeSearchClickActionItem DISLIKE;

    @pmi0("dislike_out")
    public static final CommonSearchStat$TypeSearchClickActionItem DISLIKE_OUT;

    @pmi0("download")
    public static final CommonSearchStat$TypeSearchClickActionItem DOWNLOAD;

    @pmi0("download_out")
    public static final CommonSearchStat$TypeSearchClickActionItem DOWNLOAD_OUT;

    @pmi0("edit_message_out")
    public static final CommonSearchStat$TypeSearchClickActionItem EDIT_MESSAGE_OUT;

    @pmi0("extend_episodes")
    public static final CommonSearchStat$TypeSearchClickActionItem EXTEND_EPISODES;

    @pmi0("fave")
    public static final CommonSearchStat$TypeSearchClickActionItem FAVE;

    @pmi0("fave_out")
    public static final CommonSearchStat$TypeSearchClickActionItem FAVE_OUT;

    @pmi0("invite_out")
    public static final CommonSearchStat$TypeSearchClickActionItem INVITE_OUT;

    @pmi0("join_group")
    public static final CommonSearchStat$TypeSearchClickActionItem JOIN_GROUP;

    @pmi0("join_group_out")
    public static final CommonSearchStat$TypeSearchClickActionItem JOIN_GROUP_OUT;

    @pmi0("leave_group")
    public static final CommonSearchStat$TypeSearchClickActionItem LEAVE_GROUP;

    @pmi0("leave_group_out")
    public static final CommonSearchStat$TypeSearchClickActionItem LEAVE_GROUP_OUT;

    @pmi0("like")
    public static final CommonSearchStat$TypeSearchClickActionItem LIKE;

    @pmi0("like_out")
    public static final CommonSearchStat$TypeSearchClickActionItem LIKE_OUT;

    @pmi0("listen_next")
    public static final CommonSearchStat$TypeSearchClickActionItem LISTEN_NEXT;

    @pmi0("listen_next_out")
    public static final CommonSearchStat$TypeSearchClickActionItem LISTEN_NEXT_OUT;

    @pmi0("make_clip_out")
    public static final CommonSearchStat$TypeSearchClickActionItem MAKE_CLIP_OUT;

    @pmi0("make_duet_out")
    public static final CommonSearchStat$TypeSearchClickActionItem MAKE_DUET_OUT;

    @pmi0("mix_all_out")
    public static final CommonSearchStat$TypeSearchClickActionItem MIX_ALL_OUT;

    @pmi0("money")
    public static final CommonSearchStat$TypeSearchClickActionItem MONEY;

    @pmi0("money_out")
    public static final CommonSearchStat$TypeSearchClickActionItem MONEY_OUT;

    @pmi0("notify")
    public static final CommonSearchStat$TypeSearchClickActionItem NOTIFY;

    @pmi0("notify_out")
    public static final CommonSearchStat$TypeSearchClickActionItem NOTIFY_OUT;

    @pmi0("not_interested")
    public static final CommonSearchStat$TypeSearchClickActionItem NOT_INTERESTED;

    @pmi0("not_interested_out")
    public static final CommonSearchStat$TypeSearchClickActionItem NOT_INTERESTED_OUT;

    @pmi0("open_album")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_ALBUM;

    @pmi0("open_album_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_ALBUM_OUT;

    @pmi0("open_app")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_APP;

    @pmi0("open_cart_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_CART_OUT;

    @pmi0("open_chat_profile_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_CHAT_PROFILE_OUT;

    @pmi0("open_comments_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_COMMENTS_OUT;

    @pmi0("open_episodes")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_EPISODES;

    @pmi0("open_fave_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_FAVE_OUT;

    @pmi0("open_filter")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_FILTER;

    @pmi0("open_filters")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_FILTERS;

    @pmi0("open_friends_list")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_FRIENDS_LIST;

    @pmi0("open_longread_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_LONGREAD_OUT;

    @pmi0("open_market")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_MARKET;

    @pmi0("open_market_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_MARKET_OUT;

    @pmi0("open_message_search_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_MESSAGE_SEARCH_OUT;

    @pmi0("open_owner")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_OWNER;

    @pmi0("open_owner_out")
    public static final CommonSearchStat$TypeSearchClickActionItem OPEN_OWNER_OUT;

    @pmi0("pause")
    public static final CommonSearchStat$TypeSearchClickActionItem PAUSE;

    @pmi0("pause_all_out")
    public static final CommonSearchStat$TypeSearchClickActionItem PAUSE_ALL_OUT;

    @pmi0("pause_out")
    public static final CommonSearchStat$TypeSearchClickActionItem PAUSE_OUT;

    @pmi0("play")
    public static final CommonSearchStat$TypeSearchClickActionItem PLAY;

    @pmi0("play_all")
    public static final CommonSearchStat$TypeSearchClickActionItem PLAY_ALL;

    @pmi0("play_all_out")
    public static final CommonSearchStat$TypeSearchClickActionItem PLAY_ALL_OUT;

    @pmi0("play_out")
    public static final CommonSearchStat$TypeSearchClickActionItem PLAY_OUT;

    @pmi0("remove_dislike")
    public static final CommonSearchStat$TypeSearchClickActionItem REMOVE_DISLIKE;

    @pmi0("remove_friend")
    public static final CommonSearchStat$TypeSearchClickActionItem REMOVE_FRIEND;

    @pmi0("remove_friend_out")
    public static final CommonSearchStat$TypeSearchClickActionItem REMOVE_FRIEND_OUT;

    @pmi0("remove_from_me")
    public static final CommonSearchStat$TypeSearchClickActionItem REMOVE_FROM_ME;

    @pmi0("remove_from_me_out")
    public static final CommonSearchStat$TypeSearchClickActionItem REMOVE_FROM_ME_OUT;

    @pmi0("remove_recent")
    public static final CommonSearchStat$TypeSearchClickActionItem REMOVE_RECENT;

    @pmi0("reply_out")
    public static final CommonSearchStat$TypeSearchClickActionItem REPLY_OUT;

    @pmi0("reset_filters")
    public static final CommonSearchStat$TypeSearchClickActionItem RESET_FILTERS;

    @pmi0("select_catalog_tab")
    public static final CommonSearchStat$TypeSearchClickActionItem SELECT_CATALOG_TAB;

    @pmi0("send_gift")
    public static final CommonSearchStat$TypeSearchClickActionItem SEND_GIFT;

    @pmi0("send_message")
    public static final CommonSearchStat$TypeSearchClickActionItem SEND_MESSAGE;

    @pmi0("send_message_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SEND_MESSAGE_OUT;

    @pmi0("set_reaction_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SET_REACTION_OUT;

    @pmi0("share")
    public static final CommonSearchStat$TypeSearchClickActionItem SHARE;

    @pmi0("share_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHARE_OUT;

    @pmi0("show_all_clips_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_CLIPS_OUT;

    @pmi0("show_all_longreads_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_LONGREADS_OUT;

    @pmi0("show_all_music_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_MUSIC_OUT;

    @pmi0("show_all_nft_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_NFT_OUT;

    @pmi0("show_all_photos_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_PHOTOS_OUT;

    @pmi0("show_all_plots_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_PLOTS_OUT;

    @pmi0("show_all_videos_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_ALL_VIDEOS_OUT;

    @pmi0("show_same")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_SAME;

    @pmi0("show_same_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_SAME_OUT;

    @pmi0("show_snippet")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_SNIPPET;

    @pmi0("show_stories")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_STORIES;

    @pmi0("show_stories_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SHOW_STORIES_OUT;

    @pmi0("start")
    public static final CommonSearchStat$TypeSearchClickActionItem START;

    @pmi0("subscribe")
    public static final CommonSearchStat$TypeSearchClickActionItem SUBSCRIBE;

    @pmi0("subscribe_out")
    public static final CommonSearchStat$TypeSearchClickActionItem SUBSCRIBE_OUT;

    @pmi0("tap")
    public static final CommonSearchStat$TypeSearchClickActionItem TAP;

    @pmi0("tap_show_all")
    public static final CommonSearchStat$TypeSearchClickActionItem TAP_SHOW_ALL;

    @pmi0("unfave")
    public static final CommonSearchStat$TypeSearchClickActionItem UNFAVE;

    @pmi0("unfave_out")
    public static final CommonSearchStat$TypeSearchClickActionItem UNFAVE_OUT;

    @pmi0("unlike")
    public static final CommonSearchStat$TypeSearchClickActionItem UNLIKE;

    @pmi0("unlike_out")
    public static final CommonSearchStat$TypeSearchClickActionItem UNLIKE_OUT;

    @pmi0("unnotify")
    public static final CommonSearchStat$TypeSearchClickActionItem UNNOTIFY;

    @pmi0("unnotify_out")
    public static final CommonSearchStat$TypeSearchClickActionItem UNNOTIFY_OUT;

    @pmi0("unsubscribe")
    public static final CommonSearchStat$TypeSearchClickActionItem UNSUBSCRIBE;

    @pmi0("unsubscribe_out")
    public static final CommonSearchStat$TypeSearchClickActionItem UNSUBSCRIBE_OUT;

    @pmi0("video_playlist_collapse")
    public static final CommonSearchStat$TypeSearchClickActionItem VIDEO_PLAYLIST_COLLAPSE;

    @pmi0("video_playlist_expand")
    public static final CommonSearchStat$TypeSearchClickActionItem VIDEO_PLAYLIST_EXPAND;

    @pmi0("write_msg")
    public static final CommonSearchStat$TypeSearchClickActionItem WRITE_MSG;

    @pmi0("write_msg_out")
    public static final CommonSearchStat$TypeSearchClickActionItem WRITE_MSG_OUT;

    static {
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem = new CommonSearchStat$TypeSearchClickActionItem("ADD_FRIEND", 0);
        ADD_FRIEND = commonSearchStat$TypeSearchClickActionItem;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem2 = new CommonSearchStat$TypeSearchClickActionItem("ADD_FRIEND_OUT", 1);
        ADD_FRIEND_OUT = commonSearchStat$TypeSearchClickActionItem2;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem3 = new CommonSearchStat$TypeSearchClickActionItem("ADD_FRIENDS", 2);
        ADD_FRIENDS = commonSearchStat$TypeSearchClickActionItem3;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem4 = new CommonSearchStat$TypeSearchClickActionItem("ADD_ONE_MORE_OUT", 3);
        ADD_ONE_MORE_OUT = commonSearchStat$TypeSearchClickActionItem4;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem5 = new CommonSearchStat$TypeSearchClickActionItem("ADD_SLEEP_OUT", 4);
        ADD_SLEEP_OUT = commonSearchStat$TypeSearchClickActionItem5;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem6 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_CART_OUT", 5);
        ADD_TO_CART_OUT = commonSearchStat$TypeSearchClickActionItem6;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem7 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_ME", 6);
        ADD_TO_ME = commonSearchStat$TypeSearchClickActionItem7;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem8 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_ME_OUT", 7);
        ADD_TO_ME_OUT = commonSearchStat$TypeSearchClickActionItem8;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem9 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_PLAYLIST", 8);
        ADD_TO_PLAYLIST = commonSearchStat$TypeSearchClickActionItem9;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem10 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_PLAYLIST_OUT", 9);
        ADD_TO_PLAYLIST_OUT = commonSearchStat$TypeSearchClickActionItem10;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem11 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_STORY", 10);
        ADD_TO_STORY = commonSearchStat$TypeSearchClickActionItem11;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem12 = new CommonSearchStat$TypeSearchClickActionItem("ADD_TO_STORY_OUT", 11);
        ADD_TO_STORY_OUT = commonSearchStat$TypeSearchClickActionItem12;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem13 = new CommonSearchStat$TypeSearchClickActionItem("BROADCAST", 12);
        BROADCAST = commonSearchStat$TypeSearchClickActionItem13;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem14 = new CommonSearchStat$TypeSearchClickActionItem("BROADCAST_OUT", 13);
        BROADCAST_OUT = commonSearchStat$TypeSearchClickActionItem14;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem15 = new CommonSearchStat$TypeSearchClickActionItem("BUY_OUT", 14);
        BUY_OUT = commonSearchStat$TypeSearchClickActionItem15;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem16 = new CommonSearchStat$TypeSearchClickActionItem("CALL", 15);
        CALL = commonSearchStat$TypeSearchClickActionItem16;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem17 = new CommonSearchStat$TypeSearchClickActionItem("CALL_OUT", 16);
        CALL_OUT = commonSearchStat$TypeSearchClickActionItem17;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem18 = new CommonSearchStat$TypeSearchClickActionItem("COPY_LINK", 17);
        COPY_LINK = commonSearchStat$TypeSearchClickActionItem18;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem19 = new CommonSearchStat$TypeSearchClickActionItem("COPY_LINK_OUT", 18);
        COPY_LINK_OUT = commonSearchStat$TypeSearchClickActionItem19;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem20 = new CommonSearchStat$TypeSearchClickActionItem("COPY_MESSAGE_OUT", 19);
        COPY_MESSAGE_OUT = commonSearchStat$TypeSearchClickActionItem20;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem21 = new CommonSearchStat$TypeSearchClickActionItem("DELETE_MESSAGE_OUT", 20);
        DELETE_MESSAGE_OUT = commonSearchStat$TypeSearchClickActionItem21;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem22 = new CommonSearchStat$TypeSearchClickActionItem("DISLIKE", 21);
        DISLIKE = commonSearchStat$TypeSearchClickActionItem22;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem23 = new CommonSearchStat$TypeSearchClickActionItem("DISLIKE_OUT", 22);
        DISLIKE_OUT = commonSearchStat$TypeSearchClickActionItem23;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem24 = new CommonSearchStat$TypeSearchClickActionItem("DOWNLOAD", 23);
        DOWNLOAD = commonSearchStat$TypeSearchClickActionItem24;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem25 = new CommonSearchStat$TypeSearchClickActionItem("DOWNLOAD_OUT", 24);
        DOWNLOAD_OUT = commonSearchStat$TypeSearchClickActionItem25;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem26 = new CommonSearchStat$TypeSearchClickActionItem("EDIT_MESSAGE_OUT", 25);
        EDIT_MESSAGE_OUT = commonSearchStat$TypeSearchClickActionItem26;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem27 = new CommonSearchStat$TypeSearchClickActionItem("FAVE", 26);
        FAVE = commonSearchStat$TypeSearchClickActionItem27;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem28 = new CommonSearchStat$TypeSearchClickActionItem("FAVE_OUT", 27);
        FAVE_OUT = commonSearchStat$TypeSearchClickActionItem28;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem29 = new CommonSearchStat$TypeSearchClickActionItem("INVITE_OUT", 28);
        INVITE_OUT = commonSearchStat$TypeSearchClickActionItem29;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem30 = new CommonSearchStat$TypeSearchClickActionItem("JOIN_GROUP", 29);
        JOIN_GROUP = commonSearchStat$TypeSearchClickActionItem30;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem31 = new CommonSearchStat$TypeSearchClickActionItem("JOIN_GROUP_OUT", 30);
        JOIN_GROUP_OUT = commonSearchStat$TypeSearchClickActionItem31;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem32 = new CommonSearchStat$TypeSearchClickActionItem("LEAVE_GROUP", 31);
        LEAVE_GROUP = commonSearchStat$TypeSearchClickActionItem32;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem33 = new CommonSearchStat$TypeSearchClickActionItem("LEAVE_GROUP_OUT", 32);
        LEAVE_GROUP_OUT = commonSearchStat$TypeSearchClickActionItem33;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem34 = new CommonSearchStat$TypeSearchClickActionItem("LIKE", 33);
        LIKE = commonSearchStat$TypeSearchClickActionItem34;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem35 = new CommonSearchStat$TypeSearchClickActionItem("LIKE_OUT", 34);
        LIKE_OUT = commonSearchStat$TypeSearchClickActionItem35;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem36 = new CommonSearchStat$TypeSearchClickActionItem("LISTEN_NEXT", 35);
        LISTEN_NEXT = commonSearchStat$TypeSearchClickActionItem36;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem37 = new CommonSearchStat$TypeSearchClickActionItem("LISTEN_NEXT_OUT", 36);
        LISTEN_NEXT_OUT = commonSearchStat$TypeSearchClickActionItem37;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem38 = new CommonSearchStat$TypeSearchClickActionItem("MAKE_CLIP_OUT", 37);
        MAKE_CLIP_OUT = commonSearchStat$TypeSearchClickActionItem38;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem39 = new CommonSearchStat$TypeSearchClickActionItem("MAKE_DUET_OUT", 38);
        MAKE_DUET_OUT = commonSearchStat$TypeSearchClickActionItem39;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem40 = new CommonSearchStat$TypeSearchClickActionItem("MIX_ALL_OUT", 39);
        MIX_ALL_OUT = commonSearchStat$TypeSearchClickActionItem40;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem41 = new CommonSearchStat$TypeSearchClickActionItem("MONEY", 40);
        MONEY = commonSearchStat$TypeSearchClickActionItem41;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem42 = new CommonSearchStat$TypeSearchClickActionItem("MONEY_OUT", 41);
        MONEY_OUT = commonSearchStat$TypeSearchClickActionItem42;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem43 = new CommonSearchStat$TypeSearchClickActionItem("NOT_INTERESTED", 42);
        NOT_INTERESTED = commonSearchStat$TypeSearchClickActionItem43;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem44 = new CommonSearchStat$TypeSearchClickActionItem("NOT_INTERESTED_OUT", 43);
        NOT_INTERESTED_OUT = commonSearchStat$TypeSearchClickActionItem44;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem45 = new CommonSearchStat$TypeSearchClickActionItem("NOTIFY", 44);
        NOTIFY = commonSearchStat$TypeSearchClickActionItem45;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem46 = new CommonSearchStat$TypeSearchClickActionItem("NOTIFY_OUT", 45);
        NOTIFY_OUT = commonSearchStat$TypeSearchClickActionItem46;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem47 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_ALBUM", 46);
        OPEN_ALBUM = commonSearchStat$TypeSearchClickActionItem47;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem48 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_ALBUM_OUT", 47);
        OPEN_ALBUM_OUT = commonSearchStat$TypeSearchClickActionItem48;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem49 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_APP", 48);
        OPEN_APP = commonSearchStat$TypeSearchClickActionItem49;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem50 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_CART_OUT", 49);
        OPEN_CART_OUT = commonSearchStat$TypeSearchClickActionItem50;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem51 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_CHAT_PROFILE_OUT", 50);
        OPEN_CHAT_PROFILE_OUT = commonSearchStat$TypeSearchClickActionItem51;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem52 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_FAVE_OUT", 51);
        OPEN_FAVE_OUT = commonSearchStat$TypeSearchClickActionItem52;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem53 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_FILTER", 52);
        OPEN_FILTER = commonSearchStat$TypeSearchClickActionItem53;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem54 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_FILTERS", 53);
        OPEN_FILTERS = commonSearchStat$TypeSearchClickActionItem54;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem55 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_FRIENDS_LIST", 54);
        OPEN_FRIENDS_LIST = commonSearchStat$TypeSearchClickActionItem55;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem56 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_LONGREAD_OUT", 55);
        OPEN_LONGREAD_OUT = commonSearchStat$TypeSearchClickActionItem56;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem57 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_MARKET", 56);
        OPEN_MARKET = commonSearchStat$TypeSearchClickActionItem57;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem58 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_MARKET_OUT", 57);
        OPEN_MARKET_OUT = commonSearchStat$TypeSearchClickActionItem58;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem59 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_MESSAGE_SEARCH_OUT", 58);
        OPEN_MESSAGE_SEARCH_OUT = commonSearchStat$TypeSearchClickActionItem59;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem60 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_OWNER", 59);
        OPEN_OWNER = commonSearchStat$TypeSearchClickActionItem60;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem61 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_OWNER_OUT", 60);
        OPEN_OWNER_OUT = commonSearchStat$TypeSearchClickActionItem61;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem62 = new CommonSearchStat$TypeSearchClickActionItem("PAUSE", 61);
        PAUSE = commonSearchStat$TypeSearchClickActionItem62;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem63 = new CommonSearchStat$TypeSearchClickActionItem("PAUSE_ALL_OUT", 62);
        PAUSE_ALL_OUT = commonSearchStat$TypeSearchClickActionItem63;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem64 = new CommonSearchStat$TypeSearchClickActionItem("PAUSE_OUT", 63);
        PAUSE_OUT = commonSearchStat$TypeSearchClickActionItem64;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem65 = new CommonSearchStat$TypeSearchClickActionItem("PLAY", 64);
        PLAY = commonSearchStat$TypeSearchClickActionItem65;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem66 = new CommonSearchStat$TypeSearchClickActionItem("PLAY_ALL", 65);
        PLAY_ALL = commonSearchStat$TypeSearchClickActionItem66;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem67 = new CommonSearchStat$TypeSearchClickActionItem("PLAY_ALL_OUT", 66);
        PLAY_ALL_OUT = commonSearchStat$TypeSearchClickActionItem67;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem68 = new CommonSearchStat$TypeSearchClickActionItem("PLAY_OUT", 67);
        PLAY_OUT = commonSearchStat$TypeSearchClickActionItem68;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem69 = new CommonSearchStat$TypeSearchClickActionItem("REMOVE_DISLIKE", 68);
        REMOVE_DISLIKE = commonSearchStat$TypeSearchClickActionItem69;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem70 = new CommonSearchStat$TypeSearchClickActionItem("REMOVE_FRIEND", 69);
        REMOVE_FRIEND = commonSearchStat$TypeSearchClickActionItem70;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem71 = new CommonSearchStat$TypeSearchClickActionItem("REMOVE_FRIEND_OUT", 70);
        REMOVE_FRIEND_OUT = commonSearchStat$TypeSearchClickActionItem71;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem72 = new CommonSearchStat$TypeSearchClickActionItem("REMOVE_FROM_ME", 71);
        REMOVE_FROM_ME = commonSearchStat$TypeSearchClickActionItem72;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem73 = new CommonSearchStat$TypeSearchClickActionItem("REMOVE_FROM_ME_OUT", 72);
        REMOVE_FROM_ME_OUT = commonSearchStat$TypeSearchClickActionItem73;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem74 = new CommonSearchStat$TypeSearchClickActionItem("REMOVE_RECENT", 73);
        REMOVE_RECENT = commonSearchStat$TypeSearchClickActionItem74;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem75 = new CommonSearchStat$TypeSearchClickActionItem("RESET_FILTERS", 74);
        RESET_FILTERS = commonSearchStat$TypeSearchClickActionItem75;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem76 = new CommonSearchStat$TypeSearchClickActionItem("REPLY_OUT", 75);
        REPLY_OUT = commonSearchStat$TypeSearchClickActionItem76;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem77 = new CommonSearchStat$TypeSearchClickActionItem("SEND_GIFT", 76);
        SEND_GIFT = commonSearchStat$TypeSearchClickActionItem77;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem78 = new CommonSearchStat$TypeSearchClickActionItem("SEND_MESSAGE", 77);
        SEND_MESSAGE = commonSearchStat$TypeSearchClickActionItem78;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem79 = new CommonSearchStat$TypeSearchClickActionItem("SEND_MESSAGE_OUT", 78);
        SEND_MESSAGE_OUT = commonSearchStat$TypeSearchClickActionItem79;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem80 = new CommonSearchStat$TypeSearchClickActionItem("SET_REACTION_OUT", 79);
        SET_REACTION_OUT = commonSearchStat$TypeSearchClickActionItem80;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem81 = new CommonSearchStat$TypeSearchClickActionItem("SHARE", 80);
        SHARE = commonSearchStat$TypeSearchClickActionItem81;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem82 = new CommonSearchStat$TypeSearchClickActionItem("SHARE_OUT", 81);
        SHARE_OUT = commonSearchStat$TypeSearchClickActionItem82;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem83 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_CLIPS_OUT", 82);
        SHOW_ALL_CLIPS_OUT = commonSearchStat$TypeSearchClickActionItem83;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem84 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_LONGREADS_OUT", 83);
        SHOW_ALL_LONGREADS_OUT = commonSearchStat$TypeSearchClickActionItem84;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem85 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_MUSIC_OUT", 84);
        SHOW_ALL_MUSIC_OUT = commonSearchStat$TypeSearchClickActionItem85;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem86 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_NFT_OUT", 85);
        SHOW_ALL_NFT_OUT = commonSearchStat$TypeSearchClickActionItem86;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem87 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_PHOTOS_OUT", 86);
        SHOW_ALL_PHOTOS_OUT = commonSearchStat$TypeSearchClickActionItem87;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem88 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_PLOTS_OUT", 87);
        SHOW_ALL_PLOTS_OUT = commonSearchStat$TypeSearchClickActionItem88;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem89 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_ALL_VIDEOS_OUT", 88);
        SHOW_ALL_VIDEOS_OUT = commonSearchStat$TypeSearchClickActionItem89;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem90 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_SAME", 89);
        SHOW_SAME = commonSearchStat$TypeSearchClickActionItem90;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem91 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_SAME_OUT", 90);
        SHOW_SAME_OUT = commonSearchStat$TypeSearchClickActionItem91;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem92 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_SNIPPET", 91);
        SHOW_SNIPPET = commonSearchStat$TypeSearchClickActionItem92;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem93 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_STORIES", 92);
        SHOW_STORIES = commonSearchStat$TypeSearchClickActionItem93;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem94 = new CommonSearchStat$TypeSearchClickActionItem("SHOW_STORIES_OUT", 93);
        SHOW_STORIES_OUT = commonSearchStat$TypeSearchClickActionItem94;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem95 = new CommonSearchStat$TypeSearchClickActionItem("START", 94);
        START = commonSearchStat$TypeSearchClickActionItem95;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem96 = new CommonSearchStat$TypeSearchClickActionItem("SUBSCRIBE", 95);
        SUBSCRIBE = commonSearchStat$TypeSearchClickActionItem96;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem97 = new CommonSearchStat$TypeSearchClickActionItem("SUBSCRIBE_OUT", 96);
        SUBSCRIBE_OUT = commonSearchStat$TypeSearchClickActionItem97;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem98 = new CommonSearchStat$TypeSearchClickActionItem("TAP", 97);
        TAP = commonSearchStat$TypeSearchClickActionItem98;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem99 = new CommonSearchStat$TypeSearchClickActionItem("TAP_SHOW_ALL", 98);
        TAP_SHOW_ALL = commonSearchStat$TypeSearchClickActionItem99;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem100 = new CommonSearchStat$TypeSearchClickActionItem("UNFAVE", 99);
        UNFAVE = commonSearchStat$TypeSearchClickActionItem100;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem101 = new CommonSearchStat$TypeSearchClickActionItem("UNFAVE_OUT", 100);
        UNFAVE_OUT = commonSearchStat$TypeSearchClickActionItem101;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem102 = new CommonSearchStat$TypeSearchClickActionItem("UNLIKE", 101);
        UNLIKE = commonSearchStat$TypeSearchClickActionItem102;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem103 = new CommonSearchStat$TypeSearchClickActionItem("UNLIKE_OUT", 102);
        UNLIKE_OUT = commonSearchStat$TypeSearchClickActionItem103;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem104 = new CommonSearchStat$TypeSearchClickActionItem("UNNOTIFY", 103);
        UNNOTIFY = commonSearchStat$TypeSearchClickActionItem104;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem105 = new CommonSearchStat$TypeSearchClickActionItem("UNNOTIFY_OUT", 104);
        UNNOTIFY_OUT = commonSearchStat$TypeSearchClickActionItem105;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem106 = new CommonSearchStat$TypeSearchClickActionItem("UNSUBSCRIBE", 105);
        UNSUBSCRIBE = commonSearchStat$TypeSearchClickActionItem106;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem107 = new CommonSearchStat$TypeSearchClickActionItem("UNSUBSCRIBE_OUT", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
        UNSUBSCRIBE_OUT = commonSearchStat$TypeSearchClickActionItem107;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem108 = new CommonSearchStat$TypeSearchClickActionItem("VIDEO_PLAYLIST_EXPAND", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
        VIDEO_PLAYLIST_EXPAND = commonSearchStat$TypeSearchClickActionItem108;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem109 = new CommonSearchStat$TypeSearchClickActionItem("VIDEO_PLAYLIST_COLLAPSE", 108);
        VIDEO_PLAYLIST_COLLAPSE = commonSearchStat$TypeSearchClickActionItem109;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem110 = new CommonSearchStat$TypeSearchClickActionItem("WRITE_MSG", 109);
        WRITE_MSG = commonSearchStat$TypeSearchClickActionItem110;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem111 = new CommonSearchStat$TypeSearchClickActionItem("WRITE_MSG_OUT", 110);
        WRITE_MSG_OUT = commonSearchStat$TypeSearchClickActionItem111;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem112 = new CommonSearchStat$TypeSearchClickActionItem("SELECT_CATALOG_TAB", 111);
        SELECT_CATALOG_TAB = commonSearchStat$TypeSearchClickActionItem112;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem113 = new CommonSearchStat$TypeSearchClickActionItem("CLOSE_FILTER", 112);
        CLOSE_FILTER = commonSearchStat$TypeSearchClickActionItem113;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem114 = new CommonSearchStat$TypeSearchClickActionItem("EXTEND_EPISODES", 113);
        EXTEND_EPISODES = commonSearchStat$TypeSearchClickActionItem114;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem115 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_EPISODES", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        OPEN_EPISODES = commonSearchStat$TypeSearchClickActionItem115;
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem116 = new CommonSearchStat$TypeSearchClickActionItem("OPEN_COMMENTS_OUT", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
        OPEN_COMMENTS_OUT = commonSearchStat$TypeSearchClickActionItem116;
        CommonSearchStat$TypeSearchClickActionItem[] commonSearchStat$TypeSearchClickActionItemArr = {commonSearchStat$TypeSearchClickActionItem, commonSearchStat$TypeSearchClickActionItem2, commonSearchStat$TypeSearchClickActionItem3, commonSearchStat$TypeSearchClickActionItem4, commonSearchStat$TypeSearchClickActionItem5, commonSearchStat$TypeSearchClickActionItem6, commonSearchStat$TypeSearchClickActionItem7, commonSearchStat$TypeSearchClickActionItem8, commonSearchStat$TypeSearchClickActionItem9, commonSearchStat$TypeSearchClickActionItem10, commonSearchStat$TypeSearchClickActionItem11, commonSearchStat$TypeSearchClickActionItem12, commonSearchStat$TypeSearchClickActionItem13, commonSearchStat$TypeSearchClickActionItem14, commonSearchStat$TypeSearchClickActionItem15, commonSearchStat$TypeSearchClickActionItem16, commonSearchStat$TypeSearchClickActionItem17, commonSearchStat$TypeSearchClickActionItem18, commonSearchStat$TypeSearchClickActionItem19, commonSearchStat$TypeSearchClickActionItem20, commonSearchStat$TypeSearchClickActionItem21, commonSearchStat$TypeSearchClickActionItem22, commonSearchStat$TypeSearchClickActionItem23, commonSearchStat$TypeSearchClickActionItem24, commonSearchStat$TypeSearchClickActionItem25, commonSearchStat$TypeSearchClickActionItem26, commonSearchStat$TypeSearchClickActionItem27, commonSearchStat$TypeSearchClickActionItem28, commonSearchStat$TypeSearchClickActionItem29, commonSearchStat$TypeSearchClickActionItem30, commonSearchStat$TypeSearchClickActionItem31, commonSearchStat$TypeSearchClickActionItem32, commonSearchStat$TypeSearchClickActionItem33, commonSearchStat$TypeSearchClickActionItem34, commonSearchStat$TypeSearchClickActionItem35, commonSearchStat$TypeSearchClickActionItem36, commonSearchStat$TypeSearchClickActionItem37, commonSearchStat$TypeSearchClickActionItem38, commonSearchStat$TypeSearchClickActionItem39, commonSearchStat$TypeSearchClickActionItem40, commonSearchStat$TypeSearchClickActionItem41, commonSearchStat$TypeSearchClickActionItem42, commonSearchStat$TypeSearchClickActionItem43, commonSearchStat$TypeSearchClickActionItem44, commonSearchStat$TypeSearchClickActionItem45, commonSearchStat$TypeSearchClickActionItem46, commonSearchStat$TypeSearchClickActionItem47, commonSearchStat$TypeSearchClickActionItem48, commonSearchStat$TypeSearchClickActionItem49, commonSearchStat$TypeSearchClickActionItem50, commonSearchStat$TypeSearchClickActionItem51, commonSearchStat$TypeSearchClickActionItem52, commonSearchStat$TypeSearchClickActionItem53, commonSearchStat$TypeSearchClickActionItem54, commonSearchStat$TypeSearchClickActionItem55, commonSearchStat$TypeSearchClickActionItem56, commonSearchStat$TypeSearchClickActionItem57, commonSearchStat$TypeSearchClickActionItem58, commonSearchStat$TypeSearchClickActionItem59, commonSearchStat$TypeSearchClickActionItem60, commonSearchStat$TypeSearchClickActionItem61, commonSearchStat$TypeSearchClickActionItem62, commonSearchStat$TypeSearchClickActionItem63, commonSearchStat$TypeSearchClickActionItem64, commonSearchStat$TypeSearchClickActionItem65, commonSearchStat$TypeSearchClickActionItem66, commonSearchStat$TypeSearchClickActionItem67, commonSearchStat$TypeSearchClickActionItem68, commonSearchStat$TypeSearchClickActionItem69, commonSearchStat$TypeSearchClickActionItem70, commonSearchStat$TypeSearchClickActionItem71, commonSearchStat$TypeSearchClickActionItem72, commonSearchStat$TypeSearchClickActionItem73, commonSearchStat$TypeSearchClickActionItem74, commonSearchStat$TypeSearchClickActionItem75, commonSearchStat$TypeSearchClickActionItem76, commonSearchStat$TypeSearchClickActionItem77, commonSearchStat$TypeSearchClickActionItem78, commonSearchStat$TypeSearchClickActionItem79, commonSearchStat$TypeSearchClickActionItem80, commonSearchStat$TypeSearchClickActionItem81, commonSearchStat$TypeSearchClickActionItem82, commonSearchStat$TypeSearchClickActionItem83, commonSearchStat$TypeSearchClickActionItem84, commonSearchStat$TypeSearchClickActionItem85, commonSearchStat$TypeSearchClickActionItem86, commonSearchStat$TypeSearchClickActionItem87, commonSearchStat$TypeSearchClickActionItem88, commonSearchStat$TypeSearchClickActionItem89, commonSearchStat$TypeSearchClickActionItem90, commonSearchStat$TypeSearchClickActionItem91, commonSearchStat$TypeSearchClickActionItem92, commonSearchStat$TypeSearchClickActionItem93, commonSearchStat$TypeSearchClickActionItem94, commonSearchStat$TypeSearchClickActionItem95, commonSearchStat$TypeSearchClickActionItem96, commonSearchStat$TypeSearchClickActionItem97, commonSearchStat$TypeSearchClickActionItem98, commonSearchStat$TypeSearchClickActionItem99, commonSearchStat$TypeSearchClickActionItem100, commonSearchStat$TypeSearchClickActionItem101, commonSearchStat$TypeSearchClickActionItem102, commonSearchStat$TypeSearchClickActionItem103, commonSearchStat$TypeSearchClickActionItem104, commonSearchStat$TypeSearchClickActionItem105, commonSearchStat$TypeSearchClickActionItem106, commonSearchStat$TypeSearchClickActionItem107, commonSearchStat$TypeSearchClickActionItem108, commonSearchStat$TypeSearchClickActionItem109, commonSearchStat$TypeSearchClickActionItem110, commonSearchStat$TypeSearchClickActionItem111, commonSearchStat$TypeSearchClickActionItem112, commonSearchStat$TypeSearchClickActionItem113, commonSearchStat$TypeSearchClickActionItem114, commonSearchStat$TypeSearchClickActionItem115, commonSearchStat$TypeSearchClickActionItem116};
        $VALUES = commonSearchStat$TypeSearchClickActionItemArr;
        $ENTRIES = new asp(commonSearchStat$TypeSearchClickActionItemArr);
    }

    private CommonSearchStat$TypeSearchClickActionItem(String str, int i) {
    }

    public static CommonSearchStat$TypeSearchClickActionItem valueOf(String str) {
        return (CommonSearchStat$TypeSearchClickActionItem) Enum.valueOf(CommonSearchStat$TypeSearchClickActionItem.class, str);
    }

    public static CommonSearchStat$TypeSearchClickActionItem[] values() {
        return (CommonSearchStat$TypeSearchClickActionItem[]) $VALUES.clone();
    }
}
