package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$TypeStoryViewItem implements SchemeStat$TypeAction.b {

    @pmi0("advice_type")
    private final MobileOfficialAppsStoriesStat$StoryAdviceType adviceType;

    @pmi0("battery")
    private final Integer battery;

    @pmi0("birthday_wish_user_id")
    private final Long birthdayWishUserId;

    @pmi0("brightness")
    private final Integer brightness;

    @pmi0("clickable_stickers")
    private final List<MobileOfficialAppsStoriesStat$ClickableStickerInfo> clickableStickers;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("is_congratulate_button_available")
    private final Integer isCongratulateButtonAvailable;

    @pmi0("is_grouped")
    private final String isGrouped;

    @pmi0("is_my_favorite_track_available")
    private final Integer isMyFavoriteTrackAvailable;

    @pmi0("is_one_time")
    private final Integer isOneTime;

    @pmi0("is_pinned")
    private final String isPinned;

    @pmi0("is_reply_to_story")
    private final Integer isReplyToStory;

    @pmi0("is_story_teaser")
    private final Integer isStoryTeaser;

    @pmi0("loading_duration")
    private final Long loadingDuration;

    @pmi0("narrative_id")
    private final Integer narrativeId;

    @pmi0("nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen navScreen;

    @pmi0("question_author_id")
    private final Long questionAuthorId;

    @pmi0("question_id")
    private final Integer questionId;

    @pmi0("reaction_name")
    private final String reactionName;

    @pmi0("reply_to_story_id")
    private final Integer replyToStoryId;

    @pmi0("reply_to_story_owner_id")
    private final Long replyToStoryOwnerId;

    @pmi0("signal_info")
    private final SchemeStat$NetworkSignalInfo signalInfo;

    @pmi0("stories_author_after")
    private final Integer storiesAuthorAfter;

    @pmi0("stories_author_before")
    private final Integer storiesAuthorBefore;

    @pmi0("story_id")
    private final Integer storyId;

    @pmi0("story_index")
    private final Integer storyIndex;

    @pmi0("story_owner_id")
    private final Long storyOwnerId;

    @pmi0("story_teaser_type")
    private final StoryTeaserType storyTeaserType;

    @pmi0("story_teaser_value")
    private final List<String> storyTeaserValue;

    @pmi0("story_type")
    private final StoryType storyType;

    @pmi0("time")
    private final String time;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("user2_id")
    private final Long user2Id;

    @pmi0("user_id")
    private final Long userId;

    @pmi0("view_entry_point")
    private final MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint;

    @pmi0("view_event_timeline_position")
    private final Long viewEventTimelinePosition;

    @pmi0("volume")
    private final Integer volume;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_to_firends")
        public static final EventType ADD_TO_FIRENDS;

        @pmi0("advices_disabled")
        public static final EventType ADVICES_DISABLED;

        @pmi0("advices_enabled")
        public static final EventType ADVICES_ENABLED;

        @pmi0("ad_click_on_cta")
        public static final EventType AD_CLICK_ON_CTA;

        @pmi0("ad_click_on_header")
        public static final EventType AD_CLICK_ON_HEADER;

        @pmi0("ad_html5_game_loaded_successfully")
        public static final EventType AD_HTML5_GAME_LOADED_SUCCESSFULLY;

        @pmi0("ad_link_copy")
        public static final EventType AD_LINK_COPY;

        @pmi0("ad_show")
        public static final EventType AD_SHOW;

        @pmi0("ad_start_game")
        public static final EventType AD_START_GAME;

        @pmi0("birthday_disabled")
        public static final EventType BIRTHDAY_DISABLED;

        @pmi0("birthday_enabled")
        public static final EventType BIRTHDAY_ENABLED;

        @pmi0("cancel_notify_stories")
        public static final EventType CANCEL_NOTIFY_STORIES;

        @pmi0("cancel_unnotify_stories")
        public static final EventType CANCEL_UNNOTIFY_STORIES;

        @pmi0("change_privacy_from_dots")
        public static final EventType CHANGE_PRIVACY_FROM_DOTS;

        @pmi0("claim")
        public static final EventType CLAIM;

        @pmi0("click_go_to_message")
        public static final EventType CLICK_GO_TO_MESSAGE;

        @pmi0("click_on_badge")
        public static final EventType CLICK_ON_BADGE;

        @pmi0("click_on_clickable_sticker")
        public static final EventType CLICK_ON_CLICKABLE_STICKER;

        @pmi0("click_on_privacy")
        public static final EventType CLICK_ON_PRIVACY;

        @pmi0("click_to_app")
        public static final EventType CLICK_TO_APP;

        @pmi0("click_to_congratulate")
        public static final EventType CLICK_TO_CONGRATULATE;

        @pmi0("click_to_edit")
        public static final EventType CLICK_TO_EDIT;

        @pmi0("click_to_hide_stories")
        public static final EventType CLICK_TO_HIDE_STORIES;

        @pmi0("click_to_hide_teaser")
        public static final EventType CLICK_TO_HIDE_TEASER;

        @pmi0("click_to_like")
        public static final EventType CLICK_TO_LIKE;

        @pmi0("click_to_mask")
        public static final EventType CLICK_TO_MASK;

        @pmi0("click_to_meta_ad")
        public static final EventType CLICK_TO_META_AD;

        @pmi0("click_to_meta_avatar")
        public static final EventType CLICK_TO_META_AVATAR;

        @pmi0("click_to_meta_clip")
        public static final EventType CLICK_TO_META_CLIP;

        @pmi0("click_to_meta_friends")
        public static final EventType CLICK_TO_META_FRIENDS;

        @pmi0("click_to_meta_generated")
        public static final EventType CLICK_TO_META_GENERATED;

        @pmi0("click_to_meta_mask")
        public static final EventType CLICK_TO_META_MASK;

        @pmi0("click_to_meta_memories")
        public static final EventType CLICK_TO_META_MEMORIES;

        @pmi0("click_to_meta_moment")
        public static final EventType CLICK_TO_META_MOMENT;

        @pmi0("click_to_meta_music")
        public static final EventType CLICK_TO_META_MUSIC;

        @pmi0("click_to_meta_privacy")
        public static final EventType CLICK_TO_META_PRIVACY;

        @pmi0("click_to_meta_questions")
        public static final EventType CLICK_TO_META_QUESTIONS;

        @pmi0("click_to_meta_repost")
        public static final EventType CLICK_TO_META_REPOST;

        @pmi0("click_to_music")
        public static final EventType CLICK_TO_MUSIC;

        @pmi0("click_to_my_favorite_track")
        public static final EventType CLICK_TO_MY_FAVORITE_TRACK;

        @pmi0("click_to_publish")
        public static final EventType CLICK_TO_PUBLISH;

        @pmi0("click_to_reactions_menu")
        public static final EventType CLICK_TO_REACTIONS_MENU;

        @pmi0("click_to_share")
        public static final EventType CLICK_TO_SHARE;

        @pmi0("click_to_share_longtap")
        public static final EventType CLICK_TO_SHARE_LONGTAP;

        @pmi0("click_to_show_results")
        public static final EventType CLICK_TO_SHOW_RESULTS;

        @pmi0("click_to_tooltip")
        public static final EventType CLICK_TO_TOOLTIP;

        @pmi0("click_to_unhide_stories")
        public static final EventType CLICK_TO_UNHIDE_STORIES;

        @pmi0("click_to_unlike")
        public static final EventType CLICK_TO_UNLIKE;

        @pmi0("close_app")
        public static final EventType CLOSE_APP;

        @pmi0("close_auto_by_time")
        public static final EventType CLOSE_AUTO_BY_TIME;

        @pmi0("close_back_button")
        public static final EventType CLOSE_BACK_BUTTON;

        @pmi0("close_swipe_down")
        public static final EventType CLOSE_SWIPE_DOWN;

        @pmi0("close_swipe_right_or_left")
        public static final EventType CLOSE_SWIPE_RIGHT_OR_LEFT;

        @pmi0("close_tap")
        public static final EventType CLOSE_TAP;

        @pmi0("comment_audio_send")
        public static final EventType COMMENT_AUDIO_SEND;

        @pmi0("comment_audio_start")
        public static final EventType COMMENT_AUDIO_START;

        @pmi0("comment_send")
        public static final EventType COMMENT_SEND;

        @pmi0("comment_tap")
        public static final EventType COMMENT_TAP;

        @pmi0("copy_erid")
        public static final EventType COPY_ERID;

        @pmi0("copy_link")
        public static final EventType COPY_LINK;

        @pmi0("delete")
        public static final EventType DELETE;

        @pmi0("delete_from_archive")
        public static final EventType DELETE_FROM_ARCHIVE;

        @pmi0("delete_narrative")
        public static final EventType DELETE_NARRATIVE;

        @pmi0("discover_disabled")
        public static final EventType DISCOVER_DISABLED;

        @pmi0("discover_enabled")
        public static final EventType DISCOVER_ENABLED;

        @pmi0("discover_feed_view")
        public static final EventType DISCOVER_FEED_VIEW;

        @pmi0("go_to_author")
        public static final EventType GO_TO_AUTHOR;

        @pmi0("go_to_author_button")
        public static final EventType GO_TO_AUTHOR_BUTTON;

        @pmi0("go_to_closed_profile")
        public static final EventType GO_TO_CLOSED_PROFILE;

        @pmi0("go_to_next_author")
        public static final EventType GO_TO_NEXT_AUTHOR;

        @pmi0("go_to_next_story_auto_by_time")
        public static final EventType GO_TO_NEXT_STORY_AUTO_BY_TIME;

        @pmi0("go_to_next_story_tap")
        public static final EventType GO_TO_NEXT_STORY_TAP;

        @pmi0("go_to_previous_author")
        public static final EventType GO_TO_PREVIOUS_AUTHOR;

        @pmi0("go_to_previous_story")
        public static final EventType GO_TO_PREVIOUS_STORY;

        @pmi0("go_to_settings")
        public static final EventType GO_TO_SETTINGS;

        @pmi0("go_to_story_click")
        public static final EventType GO_TO_STORY_CLICK;

        @pmi0("group_feed_view")
        public static final EventType GROUP_FEED_VIEW;

        @pmi0("hide_advice")
        public static final EventType HIDE_ADVICE;

        @pmi0("hide_from_stories")
        public static final EventType HIDE_FROM_STORIES;

        @pmi0("hide_privacy_block")
        public static final EventType HIDE_PRIVACY_BLOCK;

        @pmi0("link_click")
        public static final EventType LINK_CLICK;

        @pmi0("link_swipe")
        public static final EventType LINK_SWIPE;

        @pmi0("mark_not_interested")
        public static final EventType MARK_NOT_INTERESTED;

        @pmi0("music_added")
        public static final EventType MUSIC_ADDED;

        @pmi0("notify_stories")
        public static final EventType NOTIFY_STORIES;

        @pmi0("not_interested_advice")
        public static final EventType NOT_INTERESTED_ADVICE;

        @pmi0("open_advanced_statistic")
        public static final EventType OPEN_ADVANCED_STATISTIC;

        @pmi0("open_advertiser_information")
        public static final EventType OPEN_ADVERTISER_INFORMATION;

        @pmi0("open_empty_feedback")
        public static final EventType OPEN_EMPTY_FEEDBACK;

        @pmi0("open_feedback")
        public static final EventType OPEN_FEEDBACK;

        @pmi0("open_parent_story")
        public static final EventType OPEN_PARENT_STORY;

        @pmi0("open_profile")
        public static final EventType OPEN_PROFILE;

        @pmi0("open_recommendation_rules")
        public static final EventType OPEN_RECOMMENDATION_RULES;

        @pmi0("open_replies")
        public static final EventType OPEN_REPLIES;

        @pmi0("open_replies_list")
        public static final EventType OPEN_REPLIES_LIST;

        @pmi0("open_stickers_statistic")
        public static final EventType OPEN_STICKERS_STATISTIC;

        @pmi0("open_story_editor")
        public static final EventType OPEN_STORY_EDITOR;

        @pmi0("open_viewer")
        public static final EventType OPEN_VIEWER;

        @pmi0("open_views_statistic")
        public static final EventType OPEN_VIEWS_STATISTIC;

        @pmi0("pause_long_tap")
        public static final EventType PAUSE_LONG_TAP;

        @pmi0("pin")
        public static final EventType PIN;

        @pmi0("pin_to_end")
        public static final EventType PIN_TO_END;

        @pmi0("place_go_to_club")
        public static final EventType PLACE_GO_TO_CLUB;

        @pmi0("place_open_map")
        public static final EventType PLACE_OPEN_MAP;

        @pmi0("preview_view")
        public static final EventType PREVIEW_VIEW;

        @pmi0("privacy_modal_click_to_create_story")
        public static final EventType PRIVACY_MODAL_CLICK_TO_CREATE_STORY;

        @pmi0("question_ban_anonymous_author")
        public static final EventType QUESTION_BAN_ANONYMOUS_AUTHOR;

        @pmi0("question_ban_author")
        public static final EventType QUESTION_BAN_AUTHOR;

        @pmi0("question_delete")
        public static final EventType QUESTION_DELETE;

        @pmi0("question_go_to_author")
        public static final EventType QUESTION_GO_TO_AUTHOR;

        @pmi0("question_reply")
        public static final EventType QUESTION_REPLY;

        @pmi0("question_reply_anonymous")
        public static final EventType QUESTION_REPLY_ANONYMOUS;

        @pmi0("question_reply_public")
        public static final EventType QUESTION_REPLY_PUBLIC;

        @pmi0("question_send_message")
        public static final EventType QUESTION_SEND_MESSAGE;

        @pmi0("question_share")
        public static final EventType QUESTION_SHARE;

        @pmi0("question_show_all")
        public static final EventType QUESTION_SHOW_ALL;

        @pmi0("question_unban_anonymous_author")
        public static final EventType QUESTION_UNBAN_ANONYMOUS_AUTHOR;

        @pmi0("question_unban_author")
        public static final EventType QUESTION_UNBAN_AUTHOR;

        @pmi0("reaction_remove")
        public static final EventType REACTION_REMOVE;

        @pmi0("reaction_send")
        public static final EventType REACTION_SEND;

        @pmi0("reply")
        public static final EventType REPLY;

        @pmi0("reply_cancel")
        public static final EventType REPLY_CANCEL;

        @pmi0("resume_release")
        public static final EventType RESUME_RELEASE;

        @pmi0("set_group_view")
        public static final EventType SET_GROUP_VIEW;

        @pmi0("set_pin")
        public static final EventType SET_PIN;

        @pmi0("set_unpin")
        public static final EventType SET_UNPIN;

        @pmi0("share_outside")
        public static final EventType SHARE_OUTSIDE;

        @pmi0("share_to_message")
        public static final EventType SHARE_TO_MESSAGE;

        @pmi0("share_to_message_longtap")
        public static final EventType SHARE_TO_MESSAGE_LONGTAP;

        @pmi0("share_to_story")
        public static final EventType SHARE_TO_STORY;

        @pmi0("sharing_from_empty_feedback")
        public static final EventType SHARING_FROM_EMPTY_FEEDBACK;

        @pmi0("show_all")
        public static final EventType SHOW_ALL;

        @pmi0("show_stories_posting_recommendation")
        public static final EventType SHOW_STORIES_POSTING_RECOMMENDATION;

        @pmi0("sticker_keyboard_send")
        public static final EventType STICKER_KEYBOARD_SEND;

        @pmi0("sticker_reaction_send")
        public static final EventType STICKER_REACTION_SEND;

        @pmi0("sticker_suggestion_send")
        public static final EventType STICKER_SUGGESTION_SEND;

        @pmi0("story_3d_touch_hide")
        public static final EventType STORY_3D_TOUCH_HIDE;

        @pmi0("story_3d_touch_open")
        public static final EventType STORY_3D_TOUCH_OPEN;

        @pmi0("story_3d_touch_open_profile")
        public static final EventType STORY_3D_TOUCH_OPEN_PROFILE;

        @pmi0("swipe_block")
        public static final EventType SWIPE_BLOCK;

        @pmi0("switch_stories_carousel")
        public static final EventType SWITCH_STORIES_CAROUSEL;

        @pmi0("unnotify_stories")
        public static final EventType UNNOTIFY_STORIES;

        @pmi0("unpin")
        public static final EventType UNPIN;

        @pmi0("view_advice_story")
        public static final EventType VIEW_ADVICE_STORY;

        @pmi0("view_story")
        public static final EventType VIEW_STORY;

        static {
            EventType eventType = new EventType("SWIPE_BLOCK", 0);
            SWIPE_BLOCK = eventType;
            EventType eventType2 = new EventType("SHOW_ALL", 1);
            SHOW_ALL = eventType2;
            EventType eventType3 = new EventType("OPEN_VIEWER", 2);
            OPEN_VIEWER = eventType3;
            EventType eventType4 = new EventType("CLICK_TO_TOOLTIP", 3);
            CLICK_TO_TOOLTIP = eventType4;
            EventType eventType5 = new EventType("VIEW_STORY", 4);
            VIEW_STORY = eventType5;
            EventType eventType6 = new EventType("CLICK_TO_MASK", 5);
            CLICK_TO_MASK = eventType6;
            EventType eventType7 = new EventType("GO_TO_NEXT_STORY_TAP", 6);
            GO_TO_NEXT_STORY_TAP = eventType7;
            EventType eventType8 = new EventType("GO_TO_STORY_CLICK", 7);
            GO_TO_STORY_CLICK = eventType8;
            EventType eventType9 = new EventType("GO_TO_NEXT_STORY_AUTO_BY_TIME", 8);
            GO_TO_NEXT_STORY_AUTO_BY_TIME = eventType9;
            EventType eventType10 = new EventType("GO_TO_PREVIOUS_STORY", 9);
            GO_TO_PREVIOUS_STORY = eventType10;
            EventType eventType11 = new EventType("GO_TO_NEXT_AUTHOR", 10);
            GO_TO_NEXT_AUTHOR = eventType11;
            EventType eventType12 = new EventType("GO_TO_PREVIOUS_AUTHOR", 11);
            GO_TO_PREVIOUS_AUTHOR = eventType12;
            EventType eventType13 = new EventType("OPEN_REPLIES_LIST", 12);
            OPEN_REPLIES_LIST = eventType13;
            EventType eventType14 = new EventType("OPEN_REPLIES", 13);
            OPEN_REPLIES = eventType14;
            EventType eventType15 = new EventType("OPEN_PARENT_STORY", 14);
            OPEN_PARENT_STORY = eventType15;
            EventType eventType16 = new EventType("CLOSE_TAP", 15);
            CLOSE_TAP = eventType16;
            EventType eventType17 = new EventType("CLOSE_SWIPE_DOWN", 16);
            CLOSE_SWIPE_DOWN = eventType17;
            EventType eventType18 = new EventType("CLOSE_SWIPE_RIGHT_OR_LEFT", 17);
            CLOSE_SWIPE_RIGHT_OR_LEFT = eventType18;
            EventType eventType19 = new EventType("CLOSE_AUTO_BY_TIME", 18);
            CLOSE_AUTO_BY_TIME = eventType19;
            EventType eventType20 = new EventType("CLOSE_BACK_BUTTON", 19);
            CLOSE_BACK_BUTTON = eventType20;
            EventType eventType21 = new EventType("PAUSE_LONG_TAP", 20);
            PAUSE_LONG_TAP = eventType21;
            EventType eventType22 = new EventType("RESUME_RELEASE", 21);
            RESUME_RELEASE = eventType22;
            EventType eventType23 = new EventType("COMMENT_TAP", 22);
            COMMENT_TAP = eventType23;
            EventType eventType24 = new EventType("COMMENT_SEND", 23);
            COMMENT_SEND = eventType24;
            EventType eventType25 = new EventType("COMMENT_AUDIO_SEND", 24);
            COMMENT_AUDIO_SEND = eventType25;
            EventType eventType26 = new EventType("COMMENT_AUDIO_START", 25);
            COMMENT_AUDIO_START = eventType26;
            EventType eventType27 = new EventType("SHARE_TO_MESSAGE", 26);
            SHARE_TO_MESSAGE = eventType27;
            EventType eventType28 = new EventType("COPY_LINK", 27);
            COPY_LINK = eventType28;
            EventType eventType29 = new EventType("SHARE_OUTSIDE", 28);
            SHARE_OUTSIDE = eventType29;
            EventType eventType30 = new EventType("GO_TO_AUTHOR", 29);
            GO_TO_AUTHOR = eventType30;
            EventType eventType31 = new EventType("REPLY", 30);
            REPLY = eventType31;
            EventType eventType32 = new EventType("REPLY_CANCEL", 31);
            REPLY_CANCEL = eventType32;
            EventType eventType33 = new EventType("CLAIM", 32);
            CLAIM = eventType33;
            EventType eventType34 = new EventType("HIDE_FROM_STORIES", 33);
            HIDE_FROM_STORIES = eventType34;
            EventType eventType35 = new EventType("CLICK_ON_CLICKABLE_STICKER", 34);
            CLICK_ON_CLICKABLE_STICKER = eventType35;
            EventType eventType36 = new EventType("QUESTION_REPLY_PUBLIC", 35);
            QUESTION_REPLY_PUBLIC = eventType36;
            EventType eventType37 = new EventType("QUESTION_REPLY", 36);
            QUESTION_REPLY = eventType37;
            EventType eventType38 = new EventType("QUESTION_REPLY_ANONYMOUS", 37);
            QUESTION_REPLY_ANONYMOUS = eventType38;
            EventType eventType39 = new EventType("PLACE_GO_TO_CLUB", 38);
            PLACE_GO_TO_CLUB = eventType39;
            EventType eventType40 = new EventType("PLACE_OPEN_MAP", 39);
            PLACE_OPEN_MAP = eventType40;
            EventType eventType41 = new EventType("STICKER_REACTION_SEND", 40);
            STICKER_REACTION_SEND = eventType41;
            EventType eventType42 = new EventType("STICKER_KEYBOARD_SEND", 41);
            STICKER_KEYBOARD_SEND = eventType42;
            EventType eventType43 = new EventType("STICKER_SUGGESTION_SEND", 42);
            STICKER_SUGGESTION_SEND = eventType43;
            EventType eventType44 = new EventType("LINK_CLICK", 43);
            LINK_CLICK = eventType44;
            EventType eventType45 = new EventType("LINK_SWIPE", 44);
            LINK_SWIPE = eventType45;
            EventType eventType46 = new EventType("DELETE", 45);
            DELETE = eventType46;
            EventType eventType47 = new EventType("CLICK_TO_LIKE", 46);
            CLICK_TO_LIKE = eventType47;
            EventType eventType48 = new EventType("CLICK_TO_UNLIKE", 47);
            CLICK_TO_UNLIKE = eventType48;
            EventType eventType49 = new EventType("CLOSE_APP", 48);
            CLOSE_APP = eventType49;
            EventType eventType50 = new EventType("CLICK_TO_APP", 49);
            CLICK_TO_APP = eventType50;
            EventType eventType51 = new EventType("DELETE_NARRATIVE", 50);
            DELETE_NARRATIVE = eventType51;
            EventType eventType52 = new EventType("MUSIC_ADDED", 51);
            MUSIC_ADDED = eventType52;
            EventType eventType53 = new EventType("CLICK_TO_MUSIC", 52);
            CLICK_TO_MUSIC = eventType53;
            EventType eventType54 = new EventType("OPEN_FEEDBACK", 53);
            OPEN_FEEDBACK = eventType54;
            EventType eventType55 = new EventType("OPEN_ADVANCED_STATISTIC", 54);
            OPEN_ADVANCED_STATISTIC = eventType55;
            EventType eventType56 = new EventType("OPEN_VIEWS_STATISTIC", 55);
            OPEN_VIEWS_STATISTIC = eventType56;
            EventType eventType57 = new EventType("OPEN_STICKERS_STATISTIC", 56);
            OPEN_STICKERS_STATISTIC = eventType57;
            EventType eventType58 = new EventType("CHANGE_PRIVACY_FROM_DOTS", 57);
            CHANGE_PRIVACY_FROM_DOTS = eventType58;
            EventType eventType59 = new EventType("CLICK_ON_PRIVACY", 58);
            CLICK_ON_PRIVACY = eventType59;
            EventType eventType60 = new EventType("SWITCH_STORIES_CAROUSEL", 59);
            SWITCH_STORIES_CAROUSEL = eventType60;
            EventType eventType61 = new EventType("CLICK_TO_SHOW_RESULTS", 60);
            CLICK_TO_SHOW_RESULTS = eventType61;
            EventType eventType62 = new EventType("CLICK_GO_TO_MESSAGE", 61);
            CLICK_GO_TO_MESSAGE = eventType62;
            EventType eventType63 = new EventType("CLICK_TO_HIDE_STORIES", 62);
            CLICK_TO_HIDE_STORIES = eventType63;
            EventType eventType64 = new EventType("CLICK_TO_UNHIDE_STORIES", 63);
            CLICK_TO_UNHIDE_STORIES = eventType64;
            EventType eventType65 = new EventType("GO_TO_SETTINGS", 64);
            GO_TO_SETTINGS = eventType65;
            EventType eventType66 = new EventType("GO_TO_CLOSED_PROFILE", 65);
            GO_TO_CLOSED_PROFILE = eventType66;
            EventType eventType67 = new EventType("OPEN_EMPTY_FEEDBACK", 66);
            OPEN_EMPTY_FEEDBACK = eventType67;
            EventType eventType68 = new EventType("SHARING_FROM_EMPTY_FEEDBACK", 67);
            SHARING_FROM_EMPTY_FEEDBACK = eventType68;
            EventType eventType69 = new EventType("HIDE_PRIVACY_BLOCK", 68);
            HIDE_PRIVACY_BLOCK = eventType69;
            EventType eventType70 = new EventType("MARK_NOT_INTERESTED", 69);
            MARK_NOT_INTERESTED = eventType70;
            EventType eventType71 = new EventType("CLICK_TO_PUBLISH", 70);
            CLICK_TO_PUBLISH = eventType71;
            EventType eventType72 = new EventType("STORY_3D_TOUCH_OPEN", 71);
            STORY_3D_TOUCH_OPEN = eventType72;
            EventType eventType73 = new EventType("STORY_3D_TOUCH_OPEN_PROFILE", 72);
            STORY_3D_TOUCH_OPEN_PROFILE = eventType73;
            EventType eventType74 = new EventType("STORY_3D_TOUCH_HIDE", 73);
            STORY_3D_TOUCH_HIDE = eventType74;
            EventType eventType75 = new EventType("QUESTION_SHOW_ALL", 74);
            QUESTION_SHOW_ALL = eventType75;
            EventType eventType76 = new EventType("QUESTION_SHARE", 75);
            QUESTION_SHARE = eventType76;
            EventType eventType77 = new EventType("QUESTION_SEND_MESSAGE", 76);
            QUESTION_SEND_MESSAGE = eventType77;
            EventType eventType78 = new EventType("QUESTION_GO_TO_AUTHOR", 77);
            QUESTION_GO_TO_AUTHOR = eventType78;
            EventType eventType79 = new EventType("QUESTION_UNBAN_ANONYMOUS_AUTHOR", 78);
            QUESTION_UNBAN_ANONYMOUS_AUTHOR = eventType79;
            EventType eventType80 = new EventType("QUESTION_UNBAN_AUTHOR", 79);
            QUESTION_UNBAN_AUTHOR = eventType80;
            EventType eventType81 = new EventType("QUESTION_BAN_AUTHOR", 80);
            QUESTION_BAN_AUTHOR = eventType81;
            EventType eventType82 = new EventType("QUESTION_BAN_ANONYMOUS_AUTHOR", 81);
            QUESTION_BAN_ANONYMOUS_AUTHOR = eventType82;
            EventType eventType83 = new EventType("QUESTION_DELETE", 82);
            QUESTION_DELETE = eventType83;
            EventType eventType84 = new EventType("SET_GROUP_VIEW", 83);
            SET_GROUP_VIEW = eventType84;
            EventType eventType85 = new EventType("PIN_TO_END", 84);
            PIN_TO_END = eventType85;
            EventType eventType86 = new EventType("SET_PIN", 85);
            SET_PIN = eventType86;
            EventType eventType87 = new EventType("SET_UNPIN", 86);
            SET_UNPIN = eventType87;
            EventType eventType88 = new EventType("PIN", 87);
            PIN = eventType88;
            EventType eventType89 = new EventType("UNPIN", 88);
            UNPIN = eventType89;
            EventType eventType90 = new EventType("GROUP_FEED_VIEW", 89);
            GROUP_FEED_VIEW = eventType90;
            EventType eventType91 = new EventType("DELETE_FROM_ARCHIVE", 90);
            DELETE_FROM_ARCHIVE = eventType91;
            EventType eventType92 = new EventType("OPEN_STORY_EDITOR", 91);
            OPEN_STORY_EDITOR = eventType92;
            EventType eventType93 = new EventType("DISCOVER_FEED_VIEW", 92);
            DISCOVER_FEED_VIEW = eventType93;
            EventType eventType94 = new EventType("ADD_TO_FIRENDS", 93);
            ADD_TO_FIRENDS = eventType94;
            EventType eventType95 = new EventType("DISCOVER_ENABLED", 94);
            DISCOVER_ENABLED = eventType95;
            EventType eventType96 = new EventType("DISCOVER_DISABLED", 95);
            DISCOVER_DISABLED = eventType96;
            EventType eventType97 = new EventType("BIRTHDAY_ENABLED", 96);
            BIRTHDAY_ENABLED = eventType97;
            EventType eventType98 = new EventType("BIRTHDAY_DISABLED", 97);
            BIRTHDAY_DISABLED = eventType98;
            EventType eventType99 = new EventType("ADVICES_ENABLED", 98);
            ADVICES_ENABLED = eventType99;
            EventType eventType100 = new EventType("ADVICES_DISABLED", 99);
            ADVICES_DISABLED = eventType100;
            EventType eventType101 = new EventType("NOT_INTERESTED_ADVICE", 100);
            NOT_INTERESTED_ADVICE = eventType101;
            EventType eventType102 = new EventType("HIDE_ADVICE", 101);
            HIDE_ADVICE = eventType102;
            EventType eventType103 = new EventType("VIEW_ADVICE_STORY", 102);
            VIEW_ADVICE_STORY = eventType103;
            EventType eventType104 = new EventType("NOTIFY_STORIES", 103);
            NOTIFY_STORIES = eventType104;
            EventType eventType105 = new EventType("UNNOTIFY_STORIES", 104);
            UNNOTIFY_STORIES = eventType105;
            EventType eventType106 = new EventType("CANCEL_NOTIFY_STORIES", 105);
            CANCEL_NOTIFY_STORIES = eventType106;
            EventType eventType107 = new EventType("CANCEL_UNNOTIFY_STORIES", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            CANCEL_UNNOTIFY_STORIES = eventType107;
            EventType eventType108 = new EventType("REACTION_SEND", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            REACTION_SEND = eventType108;
            EventType eventType109 = new EventType("REACTION_REMOVE", 108);
            REACTION_REMOVE = eventType109;
            EventType eventType110 = new EventType("OPEN_ADVERTISER_INFORMATION", 109);
            OPEN_ADVERTISER_INFORMATION = eventType110;
            EventType eventType111 = new EventType("COPY_ERID", 110);
            COPY_ERID = eventType111;
            EventType eventType112 = new EventType("OPEN_RECOMMENDATION_RULES", 111);
            OPEN_RECOMMENDATION_RULES = eventType112;
            EventType eventType113 = new EventType("AD_LINK_COPY", 112);
            AD_LINK_COPY = eventType113;
            EventType eventType114 = new EventType("CLICK_ON_BADGE", 113);
            CLICK_ON_BADGE = eventType114;
            EventType eventType115 = new EventType("PRIVACY_MODAL_CLICK_TO_CREATE_STORY", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            PRIVACY_MODAL_CLICK_TO_CREATE_STORY = eventType115;
            EventType eventType116 = new EventType("SHARE_TO_STORY", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            SHARE_TO_STORY = eventType116;
            EventType eventType117 = new EventType("SHARE_TO_MESSAGE_LONGTAP", 116);
            SHARE_TO_MESSAGE_LONGTAP = eventType117;
            EventType eventType118 = new EventType("CLICK_TO_SHARE", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            CLICK_TO_SHARE = eventType118;
            EventType eventType119 = new EventType("CLICK_TO_SHARE_LONGTAP", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            CLICK_TO_SHARE_LONGTAP = eventType119;
            EventType eventType120 = new EventType("CLICK_TO_META_MOMENT", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            CLICK_TO_META_MOMENT = eventType120;
            EventType eventType121 = new EventType("CLICK_TO_META_CLIP", 120);
            CLICK_TO_META_CLIP = eventType121;
            EventType eventType122 = new EventType("CLICK_TO_META_MASK", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            CLICK_TO_META_MASK = eventType122;
            EventType eventType123 = new EventType("CLICK_TO_META_PRIVACY", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            CLICK_TO_META_PRIVACY = eventType123;
            EventType eventType124 = new EventType("CLICK_TO_META_MUSIC", 123);
            CLICK_TO_META_MUSIC = eventType124;
            EventType eventType125 = new EventType("CLICK_TO_META_AD", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            CLICK_TO_META_AD = eventType125;
            EventType eventType126 = new EventType("CLICK_TO_META_REPOST", 125);
            CLICK_TO_META_REPOST = eventType126;
            EventType eventType127 = new EventType("CLICK_TO_META_QUESTIONS", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            CLICK_TO_META_QUESTIONS = eventType127;
            EventType eventType128 = new EventType("CLICK_TO_META_FRIENDS", 127);
            CLICK_TO_META_FRIENDS = eventType128;
            EventType eventType129 = new EventType("CLICK_TO_META_GENERATED", 128);
            CLICK_TO_META_GENERATED = eventType129;
            EventType eventType130 = new EventType("PREVIEW_VIEW", 129);
            PREVIEW_VIEW = eventType130;
            EventType eventType131 = new EventType("CLICK_TO_META_AVATAR", 130);
            CLICK_TO_META_AVATAR = eventType131;
            EventType eventType132 = new EventType("CLICK_TO_META_MEMORIES", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            CLICK_TO_META_MEMORIES = eventType132;
            EventType eventType133 = new EventType("AD_SHOW", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            AD_SHOW = eventType133;
            EventType eventType134 = new EventType("AD_START_GAME", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            AD_START_GAME = eventType134;
            EventType eventType135 = new EventType("AD_CLICK_ON_HEADER", 134);
            AD_CLICK_ON_HEADER = eventType135;
            EventType eventType136 = new EventType("AD_CLICK_ON_CTA", 135);
            AD_CLICK_ON_CTA = eventType136;
            EventType eventType137 = new EventType("AD_HTML5_GAME_LOADED_SUCCESSFULLY", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            AD_HTML5_GAME_LOADED_SUCCESSFULLY = eventType137;
            EventType eventType138 = new EventType("CLICK_TO_REACTIONS_MENU", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            CLICK_TO_REACTIONS_MENU = eventType138;
            EventType eventType139 = new EventType("GO_TO_AUTHOR_BUTTON", 138);
            GO_TO_AUTHOR_BUTTON = eventType139;
            EventType eventType140 = new EventType("CLICK_TO_EDIT", 139);
            CLICK_TO_EDIT = eventType140;
            EventType eventType141 = new EventType("CLICK_TO_HIDE_TEASER", VersionConstants.PRODUCT_MAJOR_VERSION);
            CLICK_TO_HIDE_TEASER = eventType141;
            EventType eventType142 = new EventType("SHOW_STORIES_POSTING_RECOMMENDATION", 141);
            SHOW_STORIES_POSTING_RECOMMENDATION = eventType142;
            EventType eventType143 = new EventType("CLICK_TO_CONGRATULATE", 142);
            CLICK_TO_CONGRATULATE = eventType143;
            EventType eventType144 = new EventType("OPEN_PROFILE", 143);
            OPEN_PROFILE = eventType144;
            EventType eventType145 = new EventType("CLICK_TO_MY_FAVORITE_TRACK", 144);
            CLICK_TO_MY_FAVORITE_TRACK = eventType145;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50, eventType51, eventType52, eventType53, eventType54, eventType55, eventType56, eventType57, eventType58, eventType59, eventType60, eventType61, eventType62, eventType63, eventType64, eventType65, eventType66, eventType67, eventType68, eventType69, eventType70, eventType71, eventType72, eventType73, eventType74, eventType75, eventType76, eventType77, eventType78, eventType79, eventType80, eventType81, eventType82, eventType83, eventType84, eventType85, eventType86, eventType87, eventType88, eventType89, eventType90, eventType91, eventType92, eventType93, eventType94, eventType95, eventType96, eventType97, eventType98, eventType99, eventType100, eventType101, eventType102, eventType103, eventType104, eventType105, eventType106, eventType107, eventType108, eventType109, eventType110, eventType111, eventType112, eventType113, eventType114, eventType115, eventType116, eventType117, eventType118, eventType119, eventType120, eventType121, eventType122, eventType123, eventType124, eventType125, eventType126, eventType127, eventType128, eventType129, eventType130, eventType131, eventType132, eventType133, eventType134, eventType135, eventType136, eventType137, eventType138, eventType139, eventType140, eventType141, eventType142, eventType143, eventType144, eventType145};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class StoryTeaserType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoryTeaserType[] $VALUES;

        @pmi0("birthday")
        public static final StoryTeaserType BIRTHDAY;

        @pmi0("gallery")
        public static final StoryTeaserType GALLERY;

        @pmi0("music")
        public static final StoryTeaserType MUSIC;

        static {
            StoryTeaserType storyTeaserType = new StoryTeaserType("GALLERY", 0);
            GALLERY = storyTeaserType;
            StoryTeaserType storyTeaserType2 = new StoryTeaserType("MUSIC", 1);
            MUSIC = storyTeaserType2;
            StoryTeaserType storyTeaserType3 = new StoryTeaserType("BIRTHDAY", 2);
            BIRTHDAY = storyTeaserType3;
            StoryTeaserType[] storyTeaserTypeArr = {storyTeaserType, storyTeaserType2, storyTeaserType3};
            $VALUES = storyTeaserTypeArr;
            $ENTRIES = new asp(storyTeaserTypeArr);
        }

        private StoryTeaserType(String str, int i) {
        }

        public static StoryTeaserType valueOf(String str) {
            return (StoryTeaserType) Enum.valueOf(StoryTeaserType.class, str);
        }

        public static StoryTeaserType[] values() {
            return (StoryTeaserType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class StoryType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoryType[] $VALUES;

        @pmi0("advice")
        public static final StoryType ADVICE;

        @pmi0("birthday_invite")
        public static final StoryType BIRTHDAY_INVITE;

        @pmi0("group_feed")
        public static final StoryType GROUP_FEED;

        @pmi0("live_active")
        public static final StoryType LIVE_ACTIVE;

        @pmi0("live_finished")
        public static final StoryType LIVE_FINISHED;

        @pmi0("photo")
        public static final StoryType PHOTO;

        @pmi0("upload_screen")
        public static final StoryType UPLOAD_SCREEN;

        @pmi0("video")
        public static final StoryType VIDEO;

        static {
            StoryType storyType = new StoryType("PHOTO", 0);
            PHOTO = storyType;
            StoryType storyType2 = new StoryType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = storyType2;
            StoryType storyType3 = new StoryType("LIVE_ACTIVE", 2);
            LIVE_ACTIVE = storyType3;
            StoryType storyType4 = new StoryType("LIVE_FINISHED", 3);
            LIVE_FINISHED = storyType4;
            StoryType storyType5 = new StoryType("GROUP_FEED", 4);
            GROUP_FEED = storyType5;
            StoryType storyType6 = new StoryType("ADVICE", 5);
            ADVICE = storyType6;
            StoryType storyType7 = new StoryType("BIRTHDAY_INVITE", 6);
            BIRTHDAY_INVITE = storyType7;
            StoryType storyType8 = new StoryType("UPLOAD_SCREEN", 7);
            UPLOAD_SCREEN = storyType8;
            StoryType[] storyTypeArr = {storyType, storyType2, storyType3, storyType4, storyType5, storyType6, storyType7, storyType8};
            $VALUES = storyTypeArr;
            $ENTRIES = new asp(storyTypeArr);
        }

        private StoryType(String str, int i) {
        }

        public static StoryType valueOf(String str) {
            return (StoryType) Enum.valueOf(StoryType.class, str);
        }

        public static StoryType[] values() {
            return (StoryType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsStoriesStat$TypeStoryViewItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$TypeStoryViewItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$TypeStoryViewItem mobileOfficialAppsStoriesStat$TypeStoryViewItem = (MobileOfficialAppsStoriesStat$TypeStoryViewItem) obj;
        return epx.f(this.userId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.userId) && this.eventType == mobileOfficialAppsStoriesStat$TypeStoryViewItem.eventType && this.navScreen == mobileOfficialAppsStoriesStat$TypeStoryViewItem.navScreen && epx.f(this.storyId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.storyId) && epx.f(this.storyOwnerId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.storyOwnerId) && this.adviceType == mobileOfficialAppsStoriesStat$TypeStoryViewItem.adviceType && this.storyType == mobileOfficialAppsStoriesStat$TypeStoryViewItem.storyType && epx.f(this.birthdayWishUserId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.birthdayWishUserId) && epx.f(this.isReplyToStory, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isReplyToStory) && epx.f(this.isOneTime, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isOneTime) && epx.f(this.replyToStoryId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.replyToStoryId) && epx.f(this.replyToStoryOwnerId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.replyToStoryOwnerId) && epx.f(this.reactionName, mobileOfficialAppsStoriesStat$TypeStoryViewItem.reactionName) && epx.f(this.questionAuthorId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.questionAuthorId) && epx.f(this.questionId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.questionId) && epx.f(this.isGrouped, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isGrouped) && epx.f(this.isPinned, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isPinned) && this.viewEntryPoint == mobileOfficialAppsStoriesStat$TypeStoryViewItem.viewEntryPoint && epx.f(this.volume, mobileOfficialAppsStoriesStat$TypeStoryViewItem.volume) && epx.f(this.storiesAuthorBefore, mobileOfficialAppsStoriesStat$TypeStoryViewItem.storiesAuthorBefore) && epx.f(this.storiesAuthorAfter, mobileOfficialAppsStoriesStat$TypeStoryViewItem.storiesAuthorAfter) && epx.f(this.viewEventTimelinePosition, mobileOfficialAppsStoriesStat$TypeStoryViewItem.viewEventTimelinePosition) && epx.f(this.narrativeId, mobileOfficialAppsStoriesStat$TypeStoryViewItem.narrativeId) && epx.f(this.trackCode, mobileOfficialAppsStoriesStat$TypeStoryViewItem.trackCode) && epx.f(this.clickableStickers, mobileOfficialAppsStoriesStat$TypeStoryViewItem.clickableStickers) && epx.f(this.brightness, mobileOfficialAppsStoriesStat$TypeStoryViewItem.brightness) && epx.f(this.battery, mobileOfficialAppsStoriesStat$TypeStoryViewItem.battery) && epx.f(this.signalInfo, mobileOfficialAppsStoriesStat$TypeStoryViewItem.signalInfo) && epx.f(this.time, mobileOfficialAppsStoriesStat$TypeStoryViewItem.time) && epx.f(this.loadingDuration, mobileOfficialAppsStoriesStat$TypeStoryViewItem.loadingDuration) && epx.f(this.storyIndex, mobileOfficialAppsStoriesStat$TypeStoryViewItem.storyIndex) && epx.f(this.isStoryTeaser, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isStoryTeaser) && this.storyTeaserType == mobileOfficialAppsStoriesStat$TypeStoryViewItem.storyTeaserType && epx.f(this.storyTeaserValue, mobileOfficialAppsStoriesStat$TypeStoryViewItem.storyTeaserValue) && epx.f(this.isCongratulateButtonAvailable, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isCongratulateButtonAvailable) && epx.f(this.isMyFavoriteTrackAvailable, mobileOfficialAppsStoriesStat$TypeStoryViewItem.isMyFavoriteTrackAvailable) && epx.f(this.user2Id, mobileOfficialAppsStoriesStat$TypeStoryViewItem.user2Id);
    }

    public final int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.navScreen;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        Integer num = this.storyId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.storyOwnerId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType = this.adviceType;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsStoriesStat$StoryAdviceType == null ? 0 : mobileOfficialAppsStoriesStat$StoryAdviceType.hashCode())) * 31;
        StoryType storyType = this.storyType;
        int hashCode7 = (hashCode6 + (storyType == null ? 0 : storyType.hashCode())) * 31;
        Long l3 = this.birthdayWishUserId;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.isReplyToStory;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.isOneTime;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.replyToStoryId;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l4 = this.replyToStoryOwnerId;
        int hashCode12 = (hashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.reactionName;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Long l5 = this.questionAuthorId;
        int hashCode14 = (hashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num5 = this.questionId;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.isGrouped;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isPinned;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = this.viewEntryPoint;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsConStoriesStat$ViewEntryPoint == null ? 0 : mobileOfficialAppsConStoriesStat$ViewEntryPoint.hashCode())) * 31;
        Integer num6 = this.volume;
        int hashCode19 = (hashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.storiesAuthorBefore;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.storiesAuthorAfter;
        int hashCode21 = (hashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Long l6 = this.viewEventTimelinePosition;
        int hashCode22 = (hashCode21 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num9 = this.narrativeId;
        int hashCode23 = (hashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode24 = (hashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<MobileOfficialAppsStoriesStat$ClickableStickerInfo> list = this.clickableStickers;
        int hashCode25 = (hashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num10 = this.brightness;
        int hashCode26 = (hashCode25 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.battery;
        int hashCode27 = (hashCode26 + (num11 == null ? 0 : num11.hashCode())) * 31;
        SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo = this.signalInfo;
        int hashCode28 = (hashCode27 + (schemeStat$NetworkSignalInfo == null ? 0 : schemeStat$NetworkSignalInfo.hashCode())) * 31;
        String str5 = this.time;
        int hashCode29 = (hashCode28 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l7 = this.loadingDuration;
        int hashCode30 = (hashCode29 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num12 = this.storyIndex;
        int hashCode31 = (hashCode30 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.isStoryTeaser;
        int hashCode32 = (hashCode31 + (num13 == null ? 0 : num13.hashCode())) * 31;
        StoryTeaserType storyTeaserType = this.storyTeaserType;
        int hashCode33 = (hashCode32 + (storyTeaserType == null ? 0 : storyTeaserType.hashCode())) * 31;
        List<String> list2 = this.storyTeaserValue;
        int hashCode34 = (hashCode33 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num14 = this.isCongratulateButtonAvailable;
        int hashCode35 = (hashCode34 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.isMyFavoriteTrackAvailable;
        int hashCode36 = (hashCode35 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Long l8 = this.user2Id;
        return hashCode36 + (l8 != null ? l8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeStoryViewItem(userId=");
        sb.append(this.userId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", navScreen=");
        sb.append(this.navScreen);
        sb.append(", storyId=");
        sb.append(this.storyId);
        sb.append(", storyOwnerId=");
        sb.append(this.storyOwnerId);
        sb.append(", adviceType=");
        sb.append(this.adviceType);
        sb.append(", storyType=");
        sb.append(this.storyType);
        sb.append(", birthdayWishUserId=");
        sb.append(this.birthdayWishUserId);
        sb.append(", isReplyToStory=");
        sb.append(this.isReplyToStory);
        sb.append(", isOneTime=");
        sb.append(this.isOneTime);
        sb.append(", replyToStoryId=");
        sb.append(this.replyToStoryId);
        sb.append(", replyToStoryOwnerId=");
        sb.append(this.replyToStoryOwnerId);
        sb.append(", reactionName=");
        sb.append(this.reactionName);
        sb.append(", questionAuthorId=");
        sb.append(this.questionAuthorId);
        sb.append(", questionId=");
        sb.append(this.questionId);
        sb.append(", isGrouped=");
        sb.append(this.isGrouped);
        sb.append(", isPinned=");
        sb.append(this.isPinned);
        sb.append(", viewEntryPoint=");
        sb.append(this.viewEntryPoint);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", storiesAuthorBefore=");
        sb.append(this.storiesAuthorBefore);
        sb.append(", storiesAuthorAfter=");
        sb.append(this.storiesAuthorAfter);
        sb.append(", viewEventTimelinePosition=");
        sb.append(this.viewEventTimelinePosition);
        sb.append(", narrativeId=");
        sb.append(this.narrativeId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", clickableStickers=");
        sb.append(this.clickableStickers);
        sb.append(", brightness=");
        sb.append(this.brightness);
        sb.append(", battery=");
        sb.append(this.battery);
        sb.append(", signalInfo=");
        sb.append(this.signalInfo);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", loadingDuration=");
        sb.append(this.loadingDuration);
        sb.append(", storyIndex=");
        sb.append(this.storyIndex);
        sb.append(", isStoryTeaser=");
        sb.append(this.isStoryTeaser);
        sb.append(", storyTeaserType=");
        sb.append(this.storyTeaserType);
        sb.append(", storyTeaserValue=");
        sb.append(this.storyTeaserValue);
        sb.append(", isCongratulateButtonAvailable=");
        sb.append(this.isCongratulateButtonAvailable);
        sb.append(", isMyFavoriteTrackAvailable=");
        sb.append(this.isMyFavoriteTrackAvailable);
        sb.append(", user2Id=");
        return iq.b(sb, this.user2Id, ')');
    }

    public MobileOfficialAppsStoriesStat$TypeStoryViewItem(Long l, EventType eventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, Long l2, MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType, StoryType storyType, Long l3, Integer num2, Integer num3, Integer num4, Long l4, String str, Long l5, Integer num5, String str2, String str3, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, Integer num6, Integer num7, Integer num8, Long l6, Integer num9, String str4, List<MobileOfficialAppsStoriesStat$ClickableStickerInfo> list, Integer num10, Integer num11, SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo, String str5, Long l7, Integer num12, Integer num13, StoryTeaserType storyTeaserType, List<String> list2, Integer num14, Integer num15, Long l8) {
        this.userId = l;
        this.eventType = eventType;
        this.navScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.storyId = num;
        this.storyOwnerId = l2;
        this.adviceType = mobileOfficialAppsStoriesStat$StoryAdviceType;
        this.storyType = storyType;
        this.birthdayWishUserId = l3;
        this.isReplyToStory = num2;
        this.isOneTime = num3;
        this.replyToStoryId = num4;
        this.replyToStoryOwnerId = l4;
        this.reactionName = str;
        this.questionAuthorId = l5;
        this.questionId = num5;
        this.isGrouped = str2;
        this.isPinned = str3;
        this.viewEntryPoint = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.volume = num6;
        this.storiesAuthorBefore = num7;
        this.storiesAuthorAfter = num8;
        this.viewEventTimelinePosition = l6;
        this.narrativeId = num9;
        this.trackCode = str4;
        this.clickableStickers = list;
        this.brightness = num10;
        this.battery = num11;
        this.signalInfo = schemeStat$NetworkSignalInfo;
        this.time = str5;
        this.loadingDuration = l7;
        this.storyIndex = num12;
        this.isStoryTeaser = num13;
        this.storyTeaserType = storyTeaserType;
        this.storyTeaserValue = list2;
        this.isCongratulateButtonAvailable = num14;
        this.isMyFavoriteTrackAvailable = num15;
        this.user2Id = l8;
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$TypeStoryViewItem(Long l, EventType eventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, Long l2, MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType, StoryType storyType, Long l3, Integer num2, Integer num3, Integer num4, Long l4, String str, Long l5, Integer num5, String str2, String str3, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, Integer num6, Integer num7, Integer num8, Long l6, Integer num9, String str4, List list, Integer num10, Integer num11, SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo, String str5, Long l7, Integer num12, Integer num13, StoryTeaserType storyTeaserType, List list2, Integer num14, Integer num15, Long l8, int i, int i2, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : mobileOfficialAppsStoriesStat$StoryAdviceType, (i & 64) != 0 ? null : storyType, (i & 128) != 0 ? null : l3, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : l4, (i & 4096) != 0 ? null : str, (i & 8192) != 0 ? null : l5, (i & 16384) != 0 ? null : num5, (i & 32768) != 0 ? null : str2, (i & 65536) != 0 ? null : str3, (i & 131072) != 0 ? null : mobileOfficialAppsConStoriesStat$ViewEntryPoint, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num6, (i & 524288) != 0 ? null : num7, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num8, (i & 2097152) != 0 ? null : l6, (i & 4194304) != 0 ? null : num9, (i & 8388608) != 0 ? null : str4, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list, (i & 33554432) != 0 ? null : num10, (i & 67108864) != 0 ? null : num11, (i & 134217728) != 0 ? null : schemeStat$NetworkSignalInfo, (i & 268435456) != 0 ? null : str5, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : l7, (i & 1073741824) != 0 ? null : num12, (i & Integer.MIN_VALUE) != 0 ? null : num13, (i2 & 1) != 0 ? null : storyTeaserType, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : num14, (i2 & 8) != 0 ? null : num15, (i2 & 16) != 0 ? null : l8);
    }
}
