package com.vk.stat.scheme;

import com.android.billingclient.api.BillingClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClipViewerItem implements SchemeStat$TypeNavgo.b, SchemeStat$TypeAction.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeClick.b {

    @pmi0("action_button_item")
    private final SchemeStat$EventItem actionButtonItem;

    @pmi0("choose_trend_item")
    private final MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem chooseTrendItem;

    @pmi0("click_to_music_event_item")
    private final MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem clickToMusicEventItem;

    @pmi0("click_to_promo")
    private final MobileOfficialAppsClipsStat$ClipsPromoItem clickToPromo;

    @pmi0("click_to_view_analytics")
    private final MobileOfficialAppsClipsStat$ClipsAnalyticsItem clickToViewAnalytics;

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("clip_viewer_description_item")
    private final MobileOfficialAppsClipsStat$ClipViewerDescriptionItem clipViewerDescriptionItem;

    @pmi0("clips_apply_constructor")
    private final MobileOfficialAppsClipsStat$TypeClipsApplyConstructor clipsApplyConstructor;

    @pmi0("clips_extended_feedback_item")
    private final MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem clipsExtendedFeedbackItem;

    @pmi0("clips_more_menu_item")
    private final MobileOfficialAppsClipsStat$ClipsMoreMenuItem clipsMoreMenuItem;

    @pmi0("clips_open_constructor")
    private final MobileOfficialAppsClipsStat$TypeClipsOpenConstructor clipsOpenConstructor;

    @pmi0("clips_retention_block_event")
    private final MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem clipsRetentionBlockEvent;

    @pmi0("clips_subscription_item")
    private final MobileOfficialAppsClipsStat$ClipsSubscriptionItem clipsSubscriptionItem;

    @pmi0("clips_tab_red_dot_event_item")
    private final MobileOfficialAppsClipsStat$TypeClipsTabRedDot clipsTabRedDotEventItem;

    @pmi0("clips_tab_red_dot_visibility_changed_item")
    private final MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem clipsTabRedDotVisibilityChangedItem;

    @pmi0("download_item")
    private final MobileOfficialAppsClipsStat$TypeClipDownloadItem downloadItem;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("floating_button_item")
    private final MobileOfficialAppsClipsStat$TypeClipsFloatingButton floatingButtonItem;

    @pmi0("internal_nps_event_item")
    private final MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem internalNpsEventItem;

    @pmi0("internal_nps_item")
    private final MobileOfficialAppsClipsStat$TypeClipInternalNpsItem internalNpsItem;

    @pmi0("market_item")
    private final SchemeStat$EventItem marketItem;

    @pmi0("open_fullscreen_item")
    private final MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem openFullscreenItem;

    @pmi0("open_owner_from_subscription_snackbar_item")
    private final MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem openOwnerFromSubscriptionSnackbarItem;

    @pmi0("owner_info")
    private final MobileOfficialAppsClipsStat$OwnerInfo ownerInfo;

    @pmi0("saa_floating_button_item")
    private final MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton saaFloatingButtonItem;

    @pmi0("screen_type")
    private final ScreenType screenType;

    @pmi0("swiped_item")
    private final MobileOfficialAppsClipsStat$TypeClipsSwipedItem swipedItem;

    @pmi0("target_profile_item")
    private final SchemeStat$EventItem targetProfileItem;

    @pmi0("video_list_info")
    private final SchemeStat$VideoListInfo videoListInfo;

    @pmi0("volume_item")
    private final MobileOfficialAppsClipsStat$TypeVolumeItem volumeItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("audio_volume")
        public static final EventType AUDIO_VOLUME;

        @pmi0("back_from_monotopic_to_clips_feed_click")
        public static final EventType BACK_FROM_MONOTOPIC_TO_CLIPS_FEED_CLICK;

        @pmi0("choose_trend")
        public static final EventType CHOOSE_TREND;

        @pmi0("click_more")
        public static final EventType CLICK_MORE;

        @pmi0("click_tab_recommendations")
        public static final EventType CLICK_TAB_RECOMMENDATIONS;

        @pmi0("click_tab_shops")
        public static final EventType CLICK_TAB_SHOPS;

        @pmi0("click_tab_subscriptions")
        public static final EventType CLICK_TAB_SUBSCRIPTIONS;

        @pmi0("click_tab_trends")
        public static final EventType CLICK_TAB_TRENDS;

        @pmi0("click_to_action_button")
        public static final EventType CLICK_TO_ACTION_BUTTON;

        @pmi0("click_to_author")
        public static final EventType CLICK_TO_AUTHOR;

        @pmi0("click_to_compilation")
        public static final EventType CLICK_TO_COMPILATION;

        @pmi0("click_to_description")
        public static final EventType CLICK_TO_DESCRIPTION;

        @pmi0("click_to_expand_description")
        public static final EventType CLICK_TO_EXPAND_DESCRIPTION;

        @pmi0("click_to_hashtag")
        public static final EventType CLICK_TO_HASHTAG;

        @pmi0("click_to_make_duet_button")
        public static final EventType CLICK_TO_MAKE_DUET_BUTTON;

        @pmi0("click_to_market_item_snippet")
        public static final EventType CLICK_TO_MARKET_ITEM_SNIPPET;

        @pmi0("click_to_mask")
        public static final EventType CLICK_TO_MASK;

        @pmi0("click_to_music")
        public static final EventType CLICK_TO_MUSIC;

        @pmi0("click_to_playlist")
        public static final EventType CLICK_TO_PLAYLIST;

        @pmi0("click_to_promo")
        public static final EventType CLICK_TO_PROMO;

        @pmi0("click_to_saa_floating_button")
        public static final EventType CLICK_TO_SAA_FLOATING_BUTTON;

        @pmi0("click_to_share_profile_qr_code")
        public static final EventType CLICK_TO_SHARE_PROFILE_QR_CODE;

        @pmi0("click_to_shops_more_button")
        public static final EventType CLICK_TO_SHOPS_MORE_BUTTON;

        @pmi0("click_to_subscription_button")
        public static final EventType CLICK_TO_SUBSCRIPTION_BUTTON;

        @pmi0("click_to_trend_hashtag")
        public static final EventType CLICK_TO_TREND_HASHTAG;

        @pmi0("click_to_view_analytics")
        public static final EventType CLICK_TO_VIEW_ANALYTICS;

        @pmi0("clips_apply_constructor")
        public static final EventType CLIPS_APPLY_CONSTRUCTOR;

        @pmi0("clips_open_constructor")
        public static final EventType CLIPS_OPEN_CONSTRUCTOR;

        @pmi0("clips_red_button_click")
        public static final EventType CLIPS_RED_BUTTON_CLICK;

        @pmi0("clips_retention_block_event")
        public static final EventType CLIPS_RETENTION_BLOCK_EVENT;

        @pmi0("clips_tab_red_dot_event_item")
        public static final EventType CLIPS_TAB_RED_DOT_EVENT_ITEM;

        @pmi0("clips_tab_red_dot_visibility_changed")
        public static final EventType CLIPS_TAB_RED_DOT_VISIBILITY_CHANGED;

        @pmi0("download_state_change")
        public static final EventType DOWNLOAD_STATE_CHANGE;

        @pmi0("go_to_monotopic_button_click")
        public static final EventType GO_TO_MONOTOPIC_BUTTON_CLICK;

        @pmi0("go_to_monotopic_button_show")
        public static final EventType GO_TO_MONOTOPIC_BUTTON_SHOW;

        @pmi0("hide")
        public static final EventType HIDE;

        @pmi0("hide_clip_controls")
        public static final EventType HIDE_CLIP_CONTROLS;

        @pmi0("internal_nps_event")
        public static final EventType INTERNAL_NPS_EVENT;

        @pmi0("internal_nps_show")
        public static final EventType INTERNAL_NPS_SHOW;

        @pmi0("open_fullscreen")
        public static final EventType OPEN_FULLSCREEN;

        @pmi0("open_owner_from_subscription_snackbar")
        public static final EventType OPEN_OWNER_FROM_SUBSCRIPTION_SNACKBAR;

        @pmi0("saa_floating_button")
        public static final EventType SAA_FLOATING_BUTTON;

        @pmi0("show_clip_controls")
        public static final EventType SHOW_CLIP_CONTROLS;

        @pmi0("show_more_shops_button")
        public static final EventType SHOW_MORE_SHOPS_BUTTON;

        @pmi0("show_profile_from_qr_code")
        public static final EventType SHOW_PROFILE_FROM_QR_CODE;

        @pmi0("show_saa_floating_button")
        public static final EventType SHOW_SAA_FLOATING_BUTTON;

        @pmi0("show_shops_grid_block")
        public static final EventType SHOW_SHOPS_GRID_BLOCK;

        @pmi0("swipe_after_bait")
        public static final EventType SWIPE_AFTER_BAIT;

        @pmi0("unhide")
        public static final EventType UNHIDE;

        @pmi0("update_shops_grid_block")
        public static final EventType UPDATE_SHOPS_GRID_BLOCK;

        static {
            EventType eventType = new EventType("CLICK_TO_MAKE_DUET_BUTTON", 0);
            CLICK_TO_MAKE_DUET_BUTTON = eventType;
            EventType eventType2 = new EventType("CLICK_TO_SUBSCRIPTION_BUTTON", 1);
            CLICK_TO_SUBSCRIPTION_BUTTON = eventType2;
            EventType eventType3 = new EventType("CLICK_TO_ACTION_BUTTON", 2);
            CLICK_TO_ACTION_BUTTON = eventType3;
            EventType eventType4 = new EventType("CLICK_TO_SHOPS_MORE_BUTTON", 3);
            CLICK_TO_SHOPS_MORE_BUTTON = eventType4;
            EventType eventType5 = new EventType("UPDATE_SHOPS_GRID_BLOCK", 4);
            UPDATE_SHOPS_GRID_BLOCK = eventType5;
            EventType eventType6 = new EventType("CLICK_TO_AUTHOR", 5);
            CLICK_TO_AUTHOR = eventType6;
            EventType eventType7 = new EventType("CLICK_TO_HASHTAG", 6);
            CLICK_TO_HASHTAG = eventType7;
            EventType eventType8 = new EventType("CLICK_TO_MUSIC", 7);
            CLICK_TO_MUSIC = eventType8;
            EventType eventType9 = new EventType("CLICK_TO_MASK", 8);
            CLICK_TO_MASK = eventType9;
            EventType eventType10 = new EventType("CLICK_TO_COMPILATION", 9);
            CLICK_TO_COMPILATION = eventType10;
            EventType eventType11 = new EventType("CLICK_TO_PLAYLIST", 10);
            CLICK_TO_PLAYLIST = eventType11;
            EventType eventType12 = new EventType("CLICK_TO_MARKET_ITEM_SNIPPET", 11);
            CLICK_TO_MARKET_ITEM_SNIPPET = eventType12;
            EventType eventType13 = new EventType("CLICK_TO_SAA_FLOATING_BUTTON", 12);
            CLICK_TO_SAA_FLOATING_BUTTON = eventType13;
            EventType eventType14 = new EventType("CLICK_TO_SHARE_PROFILE_QR_CODE", 13);
            CLICK_TO_SHARE_PROFILE_QR_CODE = eventType14;
            EventType eventType15 = new EventType("CLICK_TO_EXPAND_DESCRIPTION", 14);
            CLICK_TO_EXPAND_DESCRIPTION = eventType15;
            EventType eventType16 = new EventType("CLICK_TO_DESCRIPTION", 15);
            CLICK_TO_DESCRIPTION = eventType16;
            EventType eventType17 = new EventType("CLICK_TAB_TRENDS", 16);
            CLICK_TAB_TRENDS = eventType17;
            EventType eventType18 = new EventType("CLICK_TAB_SHOPS", 17);
            CLICK_TAB_SHOPS = eventType18;
            EventType eventType19 = new EventType("CLICK_TAB_RECOMMENDATIONS", 18);
            CLICK_TAB_RECOMMENDATIONS = eventType19;
            EventType eventType20 = new EventType("CLICK_TAB_SUBSCRIPTIONS", 19);
            CLICK_TAB_SUBSCRIPTIONS = eventType20;
            EventType eventType21 = new EventType("DOWNLOAD_STATE_CHANGE", 20);
            DOWNLOAD_STATE_CHANGE = eventType21;
            EventType eventType22 = new EventType("SWIPE_AFTER_BAIT", 21);
            SWIPE_AFTER_BAIT = eventType22;
            EventType eventType23 = new EventType("CLIPS_OPEN_CONSTRUCTOR", 22);
            CLIPS_OPEN_CONSTRUCTOR = eventType23;
            EventType eventType24 = new EventType("CLIPS_APPLY_CONSTRUCTOR", 23);
            CLIPS_APPLY_CONSTRUCTOR = eventType24;
            EventType eventType25 = new EventType("SHOW_SAA_FLOATING_BUTTON", 24);
            SHOW_SAA_FLOATING_BUTTON = eventType25;
            EventType eventType26 = new EventType("SHOW_PROFILE_FROM_QR_CODE", 25);
            SHOW_PROFILE_FROM_QR_CODE = eventType26;
            EventType eventType27 = new EventType("SHOW_MORE_SHOPS_BUTTON", 26);
            SHOW_MORE_SHOPS_BUTTON = eventType27;
            EventType eventType28 = new EventType("SHOW_SHOPS_GRID_BLOCK", 27);
            SHOW_SHOPS_GRID_BLOCK = eventType28;
            EventType eventType29 = new EventType("SAA_FLOATING_BUTTON", 28);
            SAA_FLOATING_BUTTON = eventType29;
            EventType eventType30 = new EventType("INTERNAL_NPS_SHOW", 29);
            INTERNAL_NPS_SHOW = eventType30;
            EventType eventType31 = new EventType("INTERNAL_NPS_EVENT", 30);
            INTERNAL_NPS_EVENT = eventType31;
            EventType eventType32 = new EventType("CLIPS_RETENTION_BLOCK_EVENT", 31);
            CLIPS_RETENTION_BLOCK_EVENT = eventType32;
            EventType eventType33 = new EventType("CLIPS_TAB_RED_DOT_EVENT_ITEM", 32);
            CLIPS_TAB_RED_DOT_EVENT_ITEM = eventType33;
            EventType eventType34 = new EventType("CLIPS_TAB_RED_DOT_VISIBILITY_CHANGED", 33);
            CLIPS_TAB_RED_DOT_VISIBILITY_CHANGED = eventType34;
            EventType eventType35 = new EventType("CLIPS_RED_BUTTON_CLICK", 34);
            CLIPS_RED_BUTTON_CLICK = eventType35;
            EventType eventType36 = new EventType("OPEN_FULLSCREEN", 35);
            OPEN_FULLSCREEN = eventType36;
            EventType eventType37 = new EventType("OPEN_OWNER_FROM_SUBSCRIPTION_SNACKBAR", 36);
            OPEN_OWNER_FROM_SUBSCRIPTION_SNACKBAR = eventType37;
            EventType eventType38 = new EventType("CHOOSE_TREND", 37);
            CHOOSE_TREND = eventType38;
            EventType eventType39 = new EventType("HIDE", 38);
            HIDE = eventType39;
            EventType eventType40 = new EventType("UNHIDE", 39);
            UNHIDE = eventType40;
            EventType eventType41 = new EventType("CLICK_MORE", 40);
            CLICK_MORE = eventType41;
            EventType eventType42 = new EventType("CLICK_TO_PROMO", 41);
            CLICK_TO_PROMO = eventType42;
            EventType eventType43 = new EventType("CLICK_TO_VIEW_ANALYTICS", 42);
            CLICK_TO_VIEW_ANALYTICS = eventType43;
            EventType eventType44 = new EventType("CLICK_TO_TREND_HASHTAG", 43);
            CLICK_TO_TREND_HASHTAG = eventType44;
            EventType eventType45 = new EventType("SHOW_CLIP_CONTROLS", 44);
            SHOW_CLIP_CONTROLS = eventType45;
            EventType eventType46 = new EventType("HIDE_CLIP_CONTROLS", 45);
            HIDE_CLIP_CONTROLS = eventType46;
            EventType eventType47 = new EventType("AUDIO_VOLUME", 46);
            AUDIO_VOLUME = eventType47;
            EventType eventType48 = new EventType("GO_TO_MONOTOPIC_BUTTON_SHOW", 47);
            GO_TO_MONOTOPIC_BUTTON_SHOW = eventType48;
            EventType eventType49 = new EventType("GO_TO_MONOTOPIC_BUTTON_CLICK", 48);
            GO_TO_MONOTOPIC_BUTTON_CLICK = eventType49;
            EventType eventType50 = new EventType("BACK_FROM_MONOTOPIC_TO_CLIPS_FEED_CLICK", 49);
            BACK_FROM_MONOTOPIC_TO_CLIPS_FEED_CLICK = eventType50;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50};
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
    /* compiled from: SchemeStat.kt */
    public static final class ScreenType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;

        @pmi0("clips_monotopic")
        public static final ScreenType CLIPS_MONOTOPIC;

        @pmi0("clips_tab_trends")
        public static final ScreenType CLIPS_TAB_TRENDS;

        @pmi0("compilation")
        public static final ScreenType COMPILATION;

        @pmi0("favorites")
        public static final ScreenType FAVORITES;

        @pmi0("feed")
        public static final ScreenType FEED;

        @pmi0("hashtag")
        public static final ScreenType HASHTAG;

        @pmi0("interactive")
        public static final ScreenType INTERACTIVE;

        @pmi0("likes")
        public static final ScreenType LIKES;

        @pmi0("lives_profile")
        public static final ScreenType LIVES_PROFILE;

        @pmi0("lives_top")
        public static final ScreenType LIVES_TOP;

        @pmi0("mask")
        public static final ScreenType MASK;

        @pmi0("music")
        public static final ScreenType MUSIC;

        @pmi0("originals")
        public static final ScreenType ORIGINALS;

        @pmi0("place")
        public static final ScreenType PLACE;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final ScreenType PROFILE;

        @pmi0("shops_feed_clips")
        public static final ScreenType SHOPS_FEED_CLIPS;

        @pmi0("single_clip")
        public static final ScreenType SINGLE_CLIP;

        @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
        public static final ScreenType SUBSCRIPTIONS;

        @pmi0("top")
        public static final ScreenType TOP;

        @pmi0("trend")
        public static final ScreenType TREND;

        static {
            ScreenType screenType = new ScreenType("ORIGINALS", 0);
            ORIGINALS = screenType;
            ScreenType screenType2 = new ScreenType("TOP", 1);
            TOP = screenType2;
            ScreenType screenType3 = new ScreenType("HASHTAG", 2);
            HASHTAG = screenType3;
            ScreenType screenType4 = new ScreenType("TREND", 3);
            TREND = screenType4;
            ScreenType screenType5 = new ScreenType("SINGLE_CLIP", 4);
            SINGLE_CLIP = screenType5;
            ScreenType screenType6 = new ScreenType("MUSIC", 5);
            MUSIC = screenType6;
            ScreenType screenType7 = new ScreenType("MASK", 6);
            MASK = screenType7;
            ScreenType screenType8 = new ScreenType("COMPILATION", 7);
            COMPILATION = screenType8;
            ScreenType screenType9 = new ScreenType("PLACE", 8);
            PLACE = screenType9;
            ScreenType screenType10 = new ScreenType("PROFILE", 9);
            PROFILE = screenType10;
            ScreenType screenType11 = new ScreenType("SUBSCRIPTIONS", 10);
            SUBSCRIPTIONS = screenType11;
            ScreenType screenType12 = new ScreenType("INTERACTIVE", 11);
            INTERACTIVE = screenType12;
            ScreenType screenType13 = new ScreenType("LIKES", 12);
            LIKES = screenType13;
            ScreenType screenType14 = new ScreenType("LIVES_TOP", 13);
            LIVES_TOP = screenType14;
            ScreenType screenType15 = new ScreenType("LIVES_PROFILE", 14);
            LIVES_PROFILE = screenType15;
            ScreenType screenType16 = new ScreenType("FAVORITES", 15);
            FAVORITES = screenType16;
            ScreenType screenType17 = new ScreenType("FEED", 16);
            FEED = screenType17;
            ScreenType screenType18 = new ScreenType("SHOPS_FEED_CLIPS", 17);
            SHOPS_FEED_CLIPS = screenType18;
            ScreenType screenType19 = new ScreenType("CLIPS_TAB_TRENDS", 18);
            CLIPS_TAB_TRENDS = screenType19;
            ScreenType screenType20 = new ScreenType("CLIPS_MONOTOPIC", 19);
            CLIPS_MONOTOPIC = screenType20;
            ScreenType[] screenTypeArr = {screenType, screenType2, screenType3, screenType4, screenType5, screenType6, screenType7, screenType8, screenType9, screenType10, screenType11, screenType12, screenType13, screenType14, screenType15, screenType16, screenType17, screenType18, screenType19, screenType20};
            $VALUES = screenTypeArr;
            $ENTRIES = new asp(screenTypeArr);
        }

        private ScreenType(String str, int i) {
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClipViewerItem(ScreenType screenType, EventType eventType, SchemeStat$VideoListInfo schemeStat$VideoListInfo, MobileOfficialAppsClipsStat$TypeClipDownloadItem mobileOfficialAppsClipsStat$TypeClipDownloadItem, MobileOfficialAppsClipsStat$TypeClipsSwipedItem mobileOfficialAppsClipsStat$TypeClipsSwipedItem, MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem, MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem, MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem, MobileOfficialAppsClipsStat$TypeClipsOpenConstructor mobileOfficialAppsClipsStat$TypeClipsOpenConstructor, MobileOfficialAppsClipsStat$TypeClipsApplyConstructor mobileOfficialAppsClipsStat$TypeClipsApplyConstructor, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$EventItem schemeStat$EventItem2, SchemeStat$EventItem schemeStat$EventItem3, MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton, MobileOfficialAppsClipsStat$TypeClipsFloatingButton mobileOfficialAppsClipsStat$TypeClipsFloatingButton, MobileOfficialAppsClipsStat$TypeClipInternalNpsItem mobileOfficialAppsClipsStat$TypeClipInternalNpsItem, MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem, MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem, MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem, MobileOfficialAppsClipsStat$TypeClipsTabRedDot mobileOfficialAppsClipsStat$TypeClipsTabRedDot, MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem, MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem, MobileOfficialAppsClipsStat$ClipViewerDescriptionItem mobileOfficialAppsClipsStat$ClipViewerDescriptionItem, MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem, MobileOfficialAppsClipsStat$ClipsMoreMenuItem mobileOfficialAppsClipsStat$ClipsMoreMenuItem, MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem, MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, MobileOfficialAppsClipsStat$OwnerInfo mobileOfficialAppsClipsStat$OwnerInfo, MobileOfficialAppsClipsStat$TypeVolumeItem mobileOfficialAppsClipsStat$TypeVolumeItem) {
        this.screenType = screenType;
        this.eventType = eventType;
        this.videoListInfo = schemeStat$VideoListInfo;
        this.downloadItem = mobileOfficialAppsClipsStat$TypeClipDownloadItem;
        this.swipedItem = mobileOfficialAppsClipsStat$TypeClipsSwipedItem;
        this.openFullscreenItem = mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem;
        this.openOwnerFromSubscriptionSnackbarItem = mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem;
        this.chooseTrendItem = mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem;
        this.clipsOpenConstructor = mobileOfficialAppsClipsStat$TypeClipsOpenConstructor;
        this.clipsApplyConstructor = mobileOfficialAppsClipsStat$TypeClipsApplyConstructor;
        this.actionButtonItem = schemeStat$EventItem;
        this.targetProfileItem = schemeStat$EventItem2;
        this.marketItem = schemeStat$EventItem3;
        this.saaFloatingButtonItem = mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton;
        this.floatingButtonItem = mobileOfficialAppsClipsStat$TypeClipsFloatingButton;
        this.internalNpsItem = mobileOfficialAppsClipsStat$TypeClipInternalNpsItem;
        this.internalNpsEventItem = mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem;
        this.clickToMusicEventItem = mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem;
        this.clipsRetentionBlockEvent = mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem;
        this.clipsTabRedDotEventItem = mobileOfficialAppsClipsStat$TypeClipsTabRedDot;
        this.clipsTabRedDotVisibilityChangedItem = mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem;
        this.clipsExtendedFeedbackItem = mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
        this.clipViewerDescriptionItem = mobileOfficialAppsClipsStat$ClipViewerDescriptionItem;
        this.clipsSubscriptionItem = mobileOfficialAppsClipsStat$ClipsSubscriptionItem;
        this.clipsMoreMenuItem = mobileOfficialAppsClipsStat$ClipsMoreMenuItem;
        this.clickToPromo = mobileOfficialAppsClipsStat$ClipsPromoItem;
        this.clickToViewAnalytics = mobileOfficialAppsClipsStat$ClipsAnalyticsItem;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
        this.ownerInfo = mobileOfficialAppsClipsStat$OwnerInfo;
        this.volumeItem = mobileOfficialAppsClipsStat$TypeVolumeItem;
    }

    public final ScreenType a() {
        return this.screenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClipViewerItem)) {
            return false;
        }
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = (SchemeStat$TypeClipViewerItem) obj;
        return this.screenType == schemeStat$TypeClipViewerItem.screenType && this.eventType == schemeStat$TypeClipViewerItem.eventType && epx.f(this.videoListInfo, schemeStat$TypeClipViewerItem.videoListInfo) && epx.f(this.downloadItem, schemeStat$TypeClipViewerItem.downloadItem) && epx.f(this.swipedItem, schemeStat$TypeClipViewerItem.swipedItem) && epx.f(this.openFullscreenItem, schemeStat$TypeClipViewerItem.openFullscreenItem) && epx.f(this.openOwnerFromSubscriptionSnackbarItem, schemeStat$TypeClipViewerItem.openOwnerFromSubscriptionSnackbarItem) && epx.f(this.chooseTrendItem, schemeStat$TypeClipViewerItem.chooseTrendItem) && epx.f(this.clipsOpenConstructor, schemeStat$TypeClipViewerItem.clipsOpenConstructor) && epx.f(this.clipsApplyConstructor, schemeStat$TypeClipViewerItem.clipsApplyConstructor) && epx.f(this.actionButtonItem, schemeStat$TypeClipViewerItem.actionButtonItem) && epx.f(this.targetProfileItem, schemeStat$TypeClipViewerItem.targetProfileItem) && epx.f(this.marketItem, schemeStat$TypeClipViewerItem.marketItem) && epx.f(this.saaFloatingButtonItem, schemeStat$TypeClipViewerItem.saaFloatingButtonItem) && epx.f(this.floatingButtonItem, schemeStat$TypeClipViewerItem.floatingButtonItem) && epx.f(this.internalNpsItem, schemeStat$TypeClipViewerItem.internalNpsItem) && epx.f(this.internalNpsEventItem, schemeStat$TypeClipViewerItem.internalNpsEventItem) && epx.f(this.clickToMusicEventItem, schemeStat$TypeClipViewerItem.clickToMusicEventItem) && epx.f(this.clipsRetentionBlockEvent, schemeStat$TypeClipViewerItem.clipsRetentionBlockEvent) && epx.f(this.clipsTabRedDotEventItem, schemeStat$TypeClipViewerItem.clipsTabRedDotEventItem) && epx.f(this.clipsTabRedDotVisibilityChangedItem, schemeStat$TypeClipViewerItem.clipsTabRedDotVisibilityChangedItem) && epx.f(this.clipsExtendedFeedbackItem, schemeStat$TypeClipViewerItem.clipsExtendedFeedbackItem) && epx.f(this.clipViewerDescriptionItem, schemeStat$TypeClipViewerItem.clipViewerDescriptionItem) && epx.f(this.clipsSubscriptionItem, schemeStat$TypeClipViewerItem.clipsSubscriptionItem) && epx.f(this.clipsMoreMenuItem, schemeStat$TypeClipViewerItem.clipsMoreMenuItem) && epx.f(this.clickToPromo, schemeStat$TypeClipViewerItem.clickToPromo) && epx.f(this.clickToViewAnalytics, schemeStat$TypeClipViewerItem.clickToViewAnalytics) && epx.f(this.clipItem, schemeStat$TypeClipViewerItem.clipItem) && epx.f(this.ownerInfo, schemeStat$TypeClipViewerItem.ownerInfo) && epx.f(this.volumeItem, schemeStat$TypeClipViewerItem.volumeItem);
    }

    public final int hashCode() {
        int hashCode = this.screenType.hashCode() * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        SchemeStat$VideoListInfo schemeStat$VideoListInfo = this.videoListInfo;
        int hashCode3 = (hashCode2 + (schemeStat$VideoListInfo == null ? 0 : schemeStat$VideoListInfo.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipDownloadItem mobileOfficialAppsClipsStat$TypeClipDownloadItem = this.downloadItem;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsClipsStat$TypeClipDownloadItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipDownloadItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsSwipedItem mobileOfficialAppsClipsStat$TypeClipsSwipedItem = this.swipedItem;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsClipsStat$TypeClipsSwipedItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsSwipedItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem = this.openFullscreenItem;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem = this.openOwnerFromSubscriptionSnackbarItem;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem = this.chooseTrendItem;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsOpenConstructor mobileOfficialAppsClipsStat$TypeClipsOpenConstructor = this.clipsOpenConstructor;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsClipsStat$TypeClipsOpenConstructor == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsOpenConstructor.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsApplyConstructor mobileOfficialAppsClipsStat$TypeClipsApplyConstructor = this.clipsApplyConstructor;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsClipsStat$TypeClipsApplyConstructor == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsApplyConstructor.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.actionButtonItem;
        int hashCode11 = (hashCode10 + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem2 = this.targetProfileItem;
        int hashCode12 = (hashCode11 + (schemeStat$EventItem2 == null ? 0 : schemeStat$EventItem2.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem3 = this.marketItem;
        int hashCode13 = (hashCode12 + (schemeStat$EventItem3 == null ? 0 : schemeStat$EventItem3.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton = this.saaFloatingButtonItem;
        int hashCode14 = (hashCode13 + (mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsFloatingButton mobileOfficialAppsClipsStat$TypeClipsFloatingButton = this.floatingButtonItem;
        int hashCode15 = (hashCode14 + (mobileOfficialAppsClipsStat$TypeClipsFloatingButton == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsFloatingButton.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipInternalNpsItem mobileOfficialAppsClipsStat$TypeClipInternalNpsItem = this.internalNpsItem;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsClipsStat$TypeClipInternalNpsItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipInternalNpsItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem = this.internalNpsEventItem;
        int hashCode17 = (hashCode16 + (mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem = this.clickToMusicEventItem;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem = this.clipsRetentionBlockEvent;
        int hashCode19 = (hashCode18 + (mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsTabRedDot mobileOfficialAppsClipsStat$TypeClipsTabRedDot = this.clipsTabRedDotEventItem;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsClipsStat$TypeClipsTabRedDot == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsTabRedDot.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem = this.clipsTabRedDotVisibilityChangedItem;
        int hashCode21 = (hashCode20 + (mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem = this.clipsExtendedFeedbackItem;
        int hashCode22 = (hashCode21 + (mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipViewerDescriptionItem mobileOfficialAppsClipsStat$ClipViewerDescriptionItem = this.clipViewerDescriptionItem;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsClipsStat$ClipViewerDescriptionItem == null ? 0 : mobileOfficialAppsClipsStat$ClipViewerDescriptionItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem = this.clipsSubscriptionItem;
        int hashCode24 = (hashCode23 + (mobileOfficialAppsClipsStat$ClipsSubscriptionItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsSubscriptionItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsMoreMenuItem mobileOfficialAppsClipsStat$ClipsMoreMenuItem = this.clipsMoreMenuItem;
        int hashCode25 = (hashCode24 + (mobileOfficialAppsClipsStat$ClipsMoreMenuItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsMoreMenuItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem = this.clickToPromo;
        int hashCode26 = (hashCode25 + (mobileOfficialAppsClipsStat$ClipsPromoItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsPromoItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem = this.clickToViewAnalytics;
        int hashCode27 = (hashCode26 + (mobileOfficialAppsClipsStat$ClipsAnalyticsItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsAnalyticsItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        int hashCode28 = (hashCode27 + (mobileOfficialAppsClipsStat$TypeClipsClipItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$OwnerInfo mobileOfficialAppsClipsStat$OwnerInfo = this.ownerInfo;
        int hashCode29 = (hashCode28 + (mobileOfficialAppsClipsStat$OwnerInfo == null ? 0 : mobileOfficialAppsClipsStat$OwnerInfo.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeVolumeItem mobileOfficialAppsClipsStat$TypeVolumeItem = this.volumeItem;
        return hashCode29 + (mobileOfficialAppsClipsStat$TypeVolumeItem != null ? mobileOfficialAppsClipsStat$TypeVolumeItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipViewerItem(screenType=" + this.screenType + ", eventType=" + this.eventType + ", videoListInfo=" + this.videoListInfo + ", downloadItem=" + this.downloadItem + ", swipedItem=" + this.swipedItem + ", openFullscreenItem=" + this.openFullscreenItem + ", openOwnerFromSubscriptionSnackbarItem=" + this.openOwnerFromSubscriptionSnackbarItem + ", chooseTrendItem=" + this.chooseTrendItem + ", clipsOpenConstructor=" + this.clipsOpenConstructor + ", clipsApplyConstructor=" + this.clipsApplyConstructor + ", actionButtonItem=" + this.actionButtonItem + ", targetProfileItem=" + this.targetProfileItem + ", marketItem=" + this.marketItem + ", saaFloatingButtonItem=" + this.saaFloatingButtonItem + ", floatingButtonItem=" + this.floatingButtonItem + ", internalNpsItem=" + this.internalNpsItem + ", internalNpsEventItem=" + this.internalNpsEventItem + ", clickToMusicEventItem=" + this.clickToMusicEventItem + ", clipsRetentionBlockEvent=" + this.clipsRetentionBlockEvent + ", clipsTabRedDotEventItem=" + this.clipsTabRedDotEventItem + ", clipsTabRedDotVisibilityChangedItem=" + this.clipsTabRedDotVisibilityChangedItem + ", clipsExtendedFeedbackItem=" + this.clipsExtendedFeedbackItem + ", clipViewerDescriptionItem=" + this.clipViewerDescriptionItem + ", clipsSubscriptionItem=" + this.clipsSubscriptionItem + ", clipsMoreMenuItem=" + this.clipsMoreMenuItem + ", clickToPromo=" + this.clickToPromo + ", clickToViewAnalytics=" + this.clickToViewAnalytics + ", clipItem=" + this.clipItem + ", ownerInfo=" + this.ownerInfo + ", volumeItem=" + this.volumeItem + ')';
    }

    public /* synthetic */ SchemeStat$TypeClipViewerItem(ScreenType screenType, EventType eventType, SchemeStat$VideoListInfo schemeStat$VideoListInfo, MobileOfficialAppsClipsStat$TypeClipDownloadItem mobileOfficialAppsClipsStat$TypeClipDownloadItem, MobileOfficialAppsClipsStat$TypeClipsSwipedItem mobileOfficialAppsClipsStat$TypeClipsSwipedItem, MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem, MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem, MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem, MobileOfficialAppsClipsStat$TypeClipsOpenConstructor mobileOfficialAppsClipsStat$TypeClipsOpenConstructor, MobileOfficialAppsClipsStat$TypeClipsApplyConstructor mobileOfficialAppsClipsStat$TypeClipsApplyConstructor, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$EventItem schemeStat$EventItem2, SchemeStat$EventItem schemeStat$EventItem3, MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton, MobileOfficialAppsClipsStat$TypeClipsFloatingButton mobileOfficialAppsClipsStat$TypeClipsFloatingButton, MobileOfficialAppsClipsStat$TypeClipInternalNpsItem mobileOfficialAppsClipsStat$TypeClipInternalNpsItem, MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem, MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem, MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem, MobileOfficialAppsClipsStat$TypeClipsTabRedDot mobileOfficialAppsClipsStat$TypeClipsTabRedDot, MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem, MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem, MobileOfficialAppsClipsStat$ClipViewerDescriptionItem mobileOfficialAppsClipsStat$ClipViewerDescriptionItem, MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem, MobileOfficialAppsClipsStat$ClipsMoreMenuItem mobileOfficialAppsClipsStat$ClipsMoreMenuItem, MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem, MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, MobileOfficialAppsClipsStat$OwnerInfo mobileOfficialAppsClipsStat$OwnerInfo, MobileOfficialAppsClipsStat$TypeVolumeItem mobileOfficialAppsClipsStat$TypeVolumeItem, int i, zcl zclVar) {
        this(screenType, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : schemeStat$VideoListInfo, (i & 8) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipDownloadItem, (i & 16) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsSwipedItem, (i & 32) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem, (i & 64) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem, (i & 128) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem, (i & 256) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsOpenConstructor, (i & 512) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsApplyConstructor, (i & 1024) != 0 ? null : schemeStat$EventItem, (i & 2048) != 0 ? null : schemeStat$EventItem2, (i & 4096) != 0 ? null : schemeStat$EventItem3, (i & 8192) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton, (i & 16384) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsFloatingButton, (i & 32768) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipInternalNpsItem, (i & 65536) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem, (i & 131072) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem, (i & 524288) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsTabRedDot, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem, (i & 2097152) != 0 ? null : mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem, (i & 4194304) != 0 ? null : mobileOfficialAppsClipsStat$ClipViewerDescriptionItem, (i & 8388608) != 0 ? null : mobileOfficialAppsClipsStat$ClipsSubscriptionItem, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsClipsStat$ClipsMoreMenuItem, (i & 33554432) != 0 ? null : mobileOfficialAppsClipsStat$ClipsPromoItem, (i & 67108864) != 0 ? null : mobileOfficialAppsClipsStat$ClipsAnalyticsItem, (i & 134217728) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem, (i & 268435456) != 0 ? null : mobileOfficialAppsClipsStat$OwnerInfo, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsClipsStat$TypeVolumeItem);
    }
}
