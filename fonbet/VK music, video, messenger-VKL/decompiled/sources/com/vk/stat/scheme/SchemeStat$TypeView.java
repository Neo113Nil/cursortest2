package com.vk.stat.scheme;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.net.NetError;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeView implements SchemeStat$EventProductMain.b {

    @pmi0("end_view")
    private final String endView;

    @pmi0("idfa_permission_screen_show")
    private final i0 idfaPermissionScreenShow;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final SchemeStat$EventItem item;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("start_view")
    private final String startView;

    @pmi0("type")
    private final Type type;

    @pmi0("type_ads_bottom_banner")
    private final MobileOfficialAppsVideoStat$TypeAdsBottomBanner typeAdsBottomBanner;

    @pmi0("type_aliexpress_view")
    private final SchemeStat$TypeAliexpressView typeAliexpressView;

    @pmi0("type_audio_artist_view_item")
    private final CommonAudioStat$TypeAudioArtistViewItem typeAudioArtistViewItem;

    @pmi0("type_audio_domain_event_item")
    private final CommonAudioStat$TypeAudioDomainEventItem typeAudioDomainEventItem;

    @pmi0("type_audio_longtap_item")
    private final CommonAudioStat$TypeAudioLongtapItem typeAudioLongtapItem;

    @pmi0("type_audio_modal")
    private final CommonAudioStat$TypeAudioModal typeAudioModal;

    @pmi0("type_audio_popup_item")
    private final CommonAudioStat$TypeAudioPopupItem typeAudioPopupItem;

    @pmi0("type_audio_restriction_popup")
    private final CommonAudioStat$TypeAudioRestrictionPopup typeAudioRestrictionPopup;

    @pmi0("type_badges_screen_item")
    private final CommonVasStat$TypeBadgesScreenItem typeBadgesScreenItem;

    @pmi0("type_banner_view")
    private final MobileOfficialAppsEcommStat$TypeBannerView typeBannerView;

    @pmi0("type_catalog_item_view")
    private final CommonCatalogStat$TypeCatalogItemView typeCatalogItemView;

    @pmi0("type_channel_item")
    private final SchemeStat$TypeChannelItem typeChannelItem;

    @pmi0("type_classifieds_view")
    private final SchemeStat$TypeClassifiedsView typeClassifiedsView;

    @pmi0("type_clips_deepfake_templates_view")
    private final MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView typeClipsDeepfakeTemplatesView;

    @pmi0("type_clips_go_to_attached_video_button_show")
    private final MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow typeClipsGoToAttachedVideoButtonShow;

    @pmi0("type_communities_ozon_invite_banner_adb_view")
    private final CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView typeCommunitiesOzonInviteBannerAdbView;

    @pmi0("type_communities_trust_marks_view")
    private final CommonCommunitiesStat$TypeCommunitiesTrustMarksView typeCommunitiesTrustMarksView;

    @pmi0("type_communities_view")
    private final CommonCommunitiesStat$TypeCommunitiesView typeCommunitiesView;

    @pmi0("type_community_onboarding_view")
    private final CommonCommunitiesStat$TypeCommunityOnboardingView typeCommunityOnboardingView;

    @pmi0("type_community_review_view")
    private final CommonCommunitiesStat$TypeCommunityReviewView typeCommunityReviewView;

    @pmi0("type_community_screen_load_error_view")
    private final CommonCommunitiesStat$TypeCommunityScreenLoadErrorView typeCommunityScreenLoadErrorView;

    @pmi0("type_community_screen_tab_load_error_view")
    private final CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView typeCommunityScreenTabLoadErrorView;

    @pmi0("type_community_sport_block_video_live_view")
    private final f0 typeCommunitySportBlockVideoLiveView;

    @pmi0("type_community_tab_item_view")
    private final CommonCommunitiesStat$TypeTabItemView typeCommunityTabItemView;

    @pmi0("type_donut_banner_view")
    private final CommonCommunitiesStat$TypeDonutBanner typeDonutBannerView;

    @pmi0("type_donut_goal_view")
    private final CommonCommunitiesStat$TypeDonutGoal typeDonutGoalView;

    @pmi0("type_donut_wall_block_view")
    private final MobileOfficialAppsFeedStat$TypeDonutWallBlockView typeDonutWallBlockView;

    @pmi0("type_dzen_block_article_view")
    private final MobileOfficialAppsFeedStat$TypeDzenBlockArticleView typeDzenBlockArticleView;

    @pmi0("type_dzen_story_item_view")
    private final MobileOfficialAppsFeedStat$TypeDzenStoryItemView typeDzenStoryItemView;

    @pmi0("type_dzen_story_view")
    private final MobileOfficialAppsFeedStat$TypeDzenStoryView typeDzenStoryView;

    @pmi0("type_ecomm_view")
    private final CommonEcommStat$TypeEcommViewItem typeEcommView;

    @pmi0("type_feed_carousel_onboarding_view")
    private final MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView typeFeedCarouselOnboardingView;

    @pmi0("type_feed_image_loading")
    private final MobileOfficialAppsFeedStat$TypeFeedImageLoading typeFeedImageLoading;

    @pmi0("type_feed_item")
    private final SchemeStat$TypeFeedItem typeFeedItem;

    @pmi0("type_feed_item_screen_view")
    private final MobileOfficialAppsFeedStat$TypeFeedItemScreenView typeFeedItemScreenView;

    @pmi0("type_feed_mrc_view_post_time")
    private final MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime typeFeedMrcViewPostTime;

    @pmi0("type_feed_sdk_ad_view")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkAdView typeFeedSdkAdView;

    @pmi0("type_feed_show_friends_likes_icon")
    private final MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon typeFeedShowFriendsLikesIcon;

    @pmi0("type_feed_show_friends_likes_text")
    private final MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText typeFeedShowFriendsLikesText;

    @pmi0("type_feed_show_icon_comment")
    private final MobileOfficialAppsFeedStat$TypeFeedShowIconComment typeFeedShowIconComment;

    @pmi0("type_feed_show_inline_comment")
    private final MobileOfficialAppsFeedStat$TypeFeedShowInlineComment typeFeedShowInlineComment;

    @pmi0("type_feed_show_inline_comment_input")
    private final b0 typeFeedShowInlineCommentInput;

    @pmi0("type_followers_mode_onboarding_entrypoint_view")
    private final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView typeFollowersModeOnboardingEntrypointView;

    @pmi0("type_friend_entrypoint_block_item")
    private final c0 typeFriendEntrypointBlockItem;

    @pmi0("type_game_app_view")
    private final MobileOfficialAppsMiniappsStat$TypeGameAppView typeGameAppView;

    @pmi0("type_game_catalog_item")
    private final SchemeStat$TypeGameCatalogItem typeGameCatalogItem;

    @pmi0("type_im_conversation_banner_view")
    private final MobileOfficialAppsImStat$TypeImConversationBannerView typeImConversationBannerView;

    @pmi0("type_im_max_transition_banner_item")
    private final MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem typeImMaxTransitionBannerItem;

    @pmi0("type_im_open_invitation_card_item")
    private final MobileOfficialAppsImStat$TypeImOpenInvitationCardItem typeImOpenInvitationCardItem;

    @pmi0("type_install_vkvideo_modal")
    private final MobileOfficialAppsVideoStat$TypeInstallVkvideoModal typeInstallVkvideoModal;

    @pmi0("type_ivas_item_views")
    private final CommonVasStat$TypeIvasItemViews typeIvasItemViews;

    @pmi0("type_legal_notice_view")
    private final SchemeStat$TypeLegalNoticeView typeLegalNoticeView;

    @pmi0("type_market_community_review_view")
    private final CommonMarketStat$TypeMarketCommunityReviewView typeMarketCommunityReviewView;

    @pmi0("type_market_item")
    private final SchemeStat$TypeMarketItem typeMarketItem;

    @pmi0("type_market_item_review_view")
    private final CommonMarketStat$TypeMarketItemReviewView typeMarketItemReviewView;

    @pmi0("type_market_marketplace_item")
    private final SchemeStat$TypeMarketMarketplaceItem typeMarketMarketplaceItem;

    @pmi0("type_market_view")
    private final MobileOfficialAppsMarketStat$TypeMarketView typeMarketView;

    @pmi0("type_marusia_conversation_item")
    private final MobileOfficialAppsMarusiaStat$TypeConversationItem typeMarusiaConversationItem;

    @pmi0("type_marusia_reading_item")
    private final MobileOfficialAppsMarusiaStat$TypeReadingItem typeMarusiaReadingItem;

    @pmi0("type_mini_app_item")
    private final SchemeStat$TypeMiniAppItem typeMiniAppItem;

    @pmi0("type_move_youtube_subs_onboarding_view")
    private final MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView typeMoveYoutubeSubsOnboardingView;

    @pmi0("type_notification_views")
    private final MobileOfficialAppsNotificationsStat$TypeNotificationViews typeNotificationViews;

    @pmi0("type_onboarding_event")
    private final CommonOnboardingStat$TypeOnboardingEvent typeOnboardingEvent;

    @pmi0("type_overlay_live_product_card_impression")
    private final MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression typeOverlayLiveProductCardImpression;

    @pmi0("type_page_show")
    private final CommonVideoStat$TypePageShow typePageShow;

    @pmi0("type_popup_review_show")
    private final u typePopupReviewShow;

    @pmi0("type_promo_view_item")
    private final MobileOfficialAppsPromoStat$TypePromoViewItem typePromoViewItem;

    @pmi0("type_rating_view")
    private final CommonMarketStat$TypeRatingView typeRatingView;

    @pmi0("type_sharing_button_animated_view")
    private final MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView typeSharingButtonAnimatedView;

    @pmi0("type_show_cast_connect_offer_modal")
    private final MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal typeShowCastConnectOfferModal;

    @pmi0("type_superapp_section_item")
    private final SchemeStat$TypeSuperappSectionItem typeSuperappSectionItem;

    @pmi0("type_superapp_vkvideo_banner")
    private final MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner typeSuperappVkvideoBanner;

    @pmi0("type_superapp_widget_item")
    private final SchemeStat$TypeSuperappWidgetItem typeSuperappWidgetItem;

    @pmi0("type_tv_kid_mode_onboarding_view")
    private final MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView typeTvKidModeOnboardingView;

    @pmi0("type_tv_kid_profile_onboarding_view")
    private final MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView typeTvKidProfileOnboardingView;

    @pmi0("type_tv_qr_modal_action")
    private final MobileOfficialAppsVideoStat$TypeTvQrModalAction typeTvQrModalAction;

    @pmi0("type_video_ad_show")
    private final MobileOfficialAppsVideoStat$TypeVideoAdShow typeVideoAdShow;

    @pmi0("type_video_ad_subscription_offer_show")
    private final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow typeVideoAdSubscriptionOfferShow;

    @pmi0("type_video_ad_trial_show")
    private final MobileOfficialAppsVideoStat$TypeVideoAdTrialShow typeVideoAdTrialShow;

    @pmi0("type_video_adult_mark_notification_view")
    private final CommonVideoStat$TypeVideoAdultMarkNotificationView typeVideoAdultMarkNotificationView;

    @pmi0("type_video_assistant_loader_show")
    private final CommonVideoStat$TypeVideoAssistantLoaderShow typeVideoAssistantLoaderShow;

    @pmi0("type_video_assistant_message_done_show")
    private final CommonVideoStat$TypeVideoAssistantMessageDoneShow typeVideoAssistantMessageDoneShow;

    @pmi0("type_video_assistant_show")
    private final CommonVideoStat$TypeVideoAssistantShow typeVideoAssistantShow;

    @pmi0("type_video_author_onboarding")
    private final MobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding typeVideoAuthorOnboarding;

    @pmi0("type_video_card_event")
    private final CommonVideoStat$TypeVideoCardEvent typeVideoCardEvent;

    @pmi0("type_video_catalog_warmup_view")
    private final MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView typeVideoCatalogWarmupView;

    @pmi0("type_video_child_profile_views")
    private final MobileOfficialAppsVideoStat$TypeVideoChildProfileViews typeVideoChildProfileViews;

    @pmi0("type_video_comments_view")
    private final CommonVideoStat$TypeVideoCommentsView typeVideoCommentsView;

    @pmi0("type_video_content_warning_modal_view")
    private final CommonVideoStat$TypeVideoContentWarningModalView typeVideoContentWarningModalView;

    @pmi0("type_video_group_live_block_card_show")
    private final MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow typeVideoGroupLiveBlockCardShow;

    @pmi0("type_video_info_about_drug_view")
    private final MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView typeVideoInfoAboutDrugView;

    @pmi0("type_video_music_track_add_log_in")
    private final CommonVideoStat$TypeVideoMusicTrackAddLogIn typeVideoMusicTrackAddLogIn;

    @pmi0("type_video_music_track_add_success")
    private final CommonVideoStat$TypeVideoMusicTrackAddSuccess typeVideoMusicTrackAddSuccess;

    @pmi0("type_video_offline_snackbar_view")
    private final MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent typeVideoOfflineSnackbarView;

    @pmi0("type_video_player_music_track_view")
    private final CommonVideoStat$TypeVideoPlayerMusicTrackView typeVideoPlayerMusicTrackView;

    @pmi0("type_voip_max_app_view")
    private final MobileOfficialAppsCallsStat$TypeVoipMaxAppView typeVoipMaxAppView;

    @pmi0("type_wall_comments_view")
    private final CommonWallStat$TypeWallCommentsView typeWallCommentsView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("idfa_permission_screen_show")
        public static final Type IDFA_PERMISSION_SCREEN_SHOW;

        @pmi0("type_ads_bottom_banner")
        public static final Type TYPE_ADS_BOTTOM_BANNER;

        @pmi0("type_aliexpress_view")
        public static final Type TYPE_ALIEXPRESS_VIEW;

        @pmi0("type_audio_artist_view_item")
        public static final Type TYPE_AUDIO_ARTIST_VIEW_ITEM;

        @pmi0("type_audio_domain_event_item")
        public static final Type TYPE_AUDIO_DOMAIN_EVENT_ITEM;

        @pmi0("type_audio_fullscreen_banner_event_item")
        public static final Type TYPE_AUDIO_FULLSCREEN_BANNER_EVENT_ITEM;

        @pmi0("type_audio_longtap_item")
        public static final Type TYPE_AUDIO_LONGTAP_ITEM;

        @pmi0("type_audio_modal")
        public static final Type TYPE_AUDIO_MODAL;

        @pmi0("type_audio_popup_item")
        public static final Type TYPE_AUDIO_POPUP_ITEM;

        @pmi0("type_audio_restriction_popup")
        public static final Type TYPE_AUDIO_RESTRICTION_POPUP;

        @pmi0("type_badges_screen_item")
        public static final Type TYPE_BADGES_SCREEN_ITEM;

        @pmi0("type_banner_view")
        public static final Type TYPE_BANNER_VIEW;

        @pmi0("type_catalog_banner_event_item")
        public static final Type TYPE_CATALOG_BANNER_EVENT_ITEM;

        @pmi0("type_catalog_item_view")
        public static final Type TYPE_CATALOG_ITEM_VIEW;

        @pmi0("type_catalog_special_project_item")
        public static final Type TYPE_CATALOG_SPECIAL_PROJECT_ITEM;

        @pmi0("type_channel_item")
        public static final Type TYPE_CHANNEL_ITEM;

        @pmi0("type_classifieds_view")
        public static final Type TYPE_CLASSIFIEDS_VIEW;

        @pmi0("type_clips_deepfake_templates_view")
        public static final Type TYPE_CLIPS_DEEPFAKE_TEMPLATES_VIEW;

        @pmi0("type_clips_go_to_attached_video_button_show")
        public static final Type TYPE_CLIPS_GO_TO_ATTACHED_VIDEO_BUTTON_SHOW;

        @pmi0("type_communities_ozon_invite_banner_adb_view")
        public static final Type TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_VIEW;

        @pmi0("type_communities_trust_marks_view")
        public static final Type TYPE_COMMUNITIES_TRUST_MARKS_VIEW;

        @pmi0("type_communities_view")
        public static final Type TYPE_COMMUNITIES_VIEW;

        @pmi0("type_community_onboarding_view")
        public static final Type TYPE_COMMUNITY_ONBOARDING_VIEW;

        @pmi0("type_community_review_view")
        public static final Type TYPE_COMMUNITY_REVIEW_VIEW;

        @pmi0("type_community_screen_load_error_view")
        public static final Type TYPE_COMMUNITY_SCREEN_LOAD_ERROR_VIEW;

        @pmi0("type_community_screen_tab_load_error_view")
        public static final Type TYPE_COMMUNITY_SCREEN_TAB_LOAD_ERROR_VIEW;

        @pmi0("type_community_sport_block_video_live_view")
        public static final Type TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_VIEW;

        @pmi0("type_community_tab_item_view")
        public static final Type TYPE_COMMUNITY_TAB_ITEM_VIEW;

        @pmi0("type_donut_banner_view")
        public static final Type TYPE_DONUT_BANNER_VIEW;

        @pmi0("type_donut_goal_view")
        public static final Type TYPE_DONUT_GOAL_VIEW;

        @pmi0("type_donut_wall_block_view")
        public static final Type TYPE_DONUT_WALL_BLOCK_VIEW;

        @pmi0("type_dzen_block_article_view")
        public static final Type TYPE_DZEN_BLOCK_ARTICLE_VIEW;

        @pmi0("type_dzen_story_item_view")
        public static final Type TYPE_DZEN_STORY_ITEM_VIEW;

        @pmi0("type_dzen_story_view")
        public static final Type TYPE_DZEN_STORY_VIEW;

        @pmi0("type_ecomm_view")
        public static final Type TYPE_ECOMM_VIEW;

        @pmi0("type_feed_carousel_onboarding_view")
        public static final Type TYPE_FEED_CAROUSEL_ONBOARDING_VIEW;

        @pmi0("type_feed_image_loading")
        public static final Type TYPE_FEED_IMAGE_LOADING;

        @pmi0("type_feed_item")
        public static final Type TYPE_FEED_ITEM;

        @pmi0("type_feed_item_screen_view")
        public static final Type TYPE_FEED_ITEM_SCREEN_VIEW;

        @pmi0("type_feed_mrc_view_post_time")
        public static final Type TYPE_FEED_MRC_VIEW_POST_TIME;

        @pmi0("type_feed_sdk_ad_view")
        public static final Type TYPE_FEED_SDK_AD_VIEW;

        @pmi0("type_feed_show_friends_likes_icon")
        public static final Type TYPE_FEED_SHOW_FRIENDS_LIKES_ICON;

        @pmi0("type_feed_show_friends_likes_text")
        public static final Type TYPE_FEED_SHOW_FRIENDS_LIKES_TEXT;

        @pmi0("type_feed_show_icon_comment")
        public static final Type TYPE_FEED_SHOW_ICON_COMMENT;

        @pmi0("type_feed_show_inline_comment")
        public static final Type TYPE_FEED_SHOW_INLINE_COMMENT;

        @pmi0("type_feed_show_inline_comment_input")
        public static final Type TYPE_FEED_SHOW_INLINE_COMMENT_INPUT;

        @pmi0("type_followers_mode_onboarding_entrypoint_view")
        public static final Type TYPE_FOLLOWERS_MODE_ONBOARDING_ENTRYPOINT_VIEW;

        @pmi0("type_friend_entrypoint_block_item")
        public static final Type TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM;

        @pmi0("type_game_app_view")
        public static final Type TYPE_GAME_APP_VIEW;

        @pmi0("type_game_catalog_item")
        public static final Type TYPE_GAME_CATALOG_ITEM;

        @pmi0("type_im_conversation_banner_view")
        public static final Type TYPE_IM_CONVERSATION_BANNER_VIEW;

        @pmi0("type_im_max_transition_banner_item")
        public static final Type TYPE_IM_MAX_TRANSITION_BANNER_ITEM;

        @pmi0("type_im_open_invitation_card_item")
        public static final Type TYPE_IM_OPEN_INVITATION_CARD_ITEM;

        @pmi0("type_install_vkvideo_modal")
        public static final Type TYPE_INSTALL_VKVIDEO_MODAL;

        @pmi0("type_install_vkvideo_modal_show")
        public static final Type TYPE_INSTALL_VKVIDEO_MODAL_SHOW;

        @pmi0("type_ivas_item_views")
        public static final Type TYPE_IVAS_ITEM_VIEWS;

        @pmi0("type_legal_notice_view")
        public static final Type TYPE_LEGAL_NOTICE_VIEW;

        @pmi0("type_market_community_review_view")
        public static final Type TYPE_MARKET_COMMUNITY_REVIEW_VIEW;

        @pmi0("type_market_item")
        public static final Type TYPE_MARKET_ITEM;

        @pmi0("type_market_item_review_view")
        public static final Type TYPE_MARKET_ITEM_REVIEW_VIEW;

        @pmi0("type_market_marketplace_item")
        public static final Type TYPE_MARKET_MARKETPLACE_ITEM;

        @pmi0("type_market_view")
        public static final Type TYPE_MARKET_VIEW;

        @pmi0("type_marusia_conversation_item")
        public static final Type TYPE_MARUSIA_CONVERSATION_ITEM;

        @pmi0("type_marusia_reading_item")
        public static final Type TYPE_MARUSIA_READING_ITEM;

        @pmi0("type_mini_app_item")
        public static final Type TYPE_MINI_APP_ITEM;

        @pmi0("type_move_youtube_subs_onboarding_view")
        public static final Type TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_VIEW;

        @pmi0("type_notification_views")
        public static final Type TYPE_NOTIFICATION_VIEWS;

        @pmi0("type_onboarding_event")
        public static final Type TYPE_ONBOARDING_EVENT;

        @pmi0("type_open_in_vkvideo_banner_show")
        public static final Type TYPE_OPEN_IN_VKVIDEO_BANNER_SHOW;

        @pmi0("type_open_in_vkvideo_bottom_banner_show")
        public static final Type TYPE_OPEN_IN_VKVIDEO_BOTTOM_BANNER_SHOW;

        @pmi0("type_overlay_live_product_card_impression")
        public static final Type TYPE_OVERLAY_LIVE_PRODUCT_CARD_IMPRESSION;

        @pmi0("type_overlay_live_product_view_item_media")
        public static final Type TYPE_OVERLAY_LIVE_PRODUCT_VIEW_ITEM_MEDIA;

        @pmi0("type_page_show")
        public static final Type TYPE_PAGE_SHOW;

        @pmi0("type_popup_review_show")
        public static final Type TYPE_POPUP_REVIEW_SHOW;

        @pmi0("type_promo_view_item")
        public static final Type TYPE_PROMO_VIEW_ITEM;

        @pmi0("type_rating_view")
        public static final Type TYPE_RATING_VIEW;

        @pmi0("type_sharing_button_animated_view")
        public static final Type TYPE_SHARING_BUTTON_ANIMATED_VIEW;

        @pmi0("type_show_cast_connect_offer_modal")
        public static final Type TYPE_SHOW_CAST_CONNECT_OFFER_MODAL;

        @pmi0("type_superapp_section_item")
        public static final Type TYPE_SUPERAPP_SECTION_ITEM;

        @pmi0("type_superapp_vkvideo_banner")
        public static final Type TYPE_SUPERAPP_VKVIDEO_BANNER;

        @pmi0("type_superapp_widget_item")
        public static final Type TYPE_SUPERAPP_WIDGET_ITEM;

        @pmi0("type_tv_kid_mode_onboarding_view")
        public static final Type TYPE_TV_KID_MODE_ONBOARDING_VIEW;

        @pmi0("type_tv_kid_profile_onboarding_view")
        public static final Type TYPE_TV_KID_PROFILE_ONBOARDING_VIEW;

        @pmi0("type_tv_qr_modal_action")
        public static final Type TYPE_TV_QR_MODAL_ACTION;

        @pmi0("type_video_adult_mark_notification_view")
        public static final Type TYPE_VIDEO_ADULT_MARK_NOTIFICATION_VIEW;

        @pmi0("type_video_ad_show")
        public static final Type TYPE_VIDEO_AD_SHOW;

        @pmi0("type_video_ad_subscription_offer_show")
        public static final Type TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_SHOW;

        @pmi0("type_video_ad_trial_show")
        public static final Type TYPE_VIDEO_AD_TRIAL_SHOW;

        @pmi0("type_video_assistant_loader_show")
        public static final Type TYPE_VIDEO_ASSISTANT_LOADER_SHOW;

        @pmi0("type_video_assistant_message_done_show")
        public static final Type TYPE_VIDEO_ASSISTANT_MESSAGE_DONE_SHOW;

        @pmi0("type_video_assistant_show")
        public static final Type TYPE_VIDEO_ASSISTANT_SHOW;

        @pmi0("type_video_author_onboarding")
        public static final Type TYPE_VIDEO_AUTHOR_ONBOARDING;

        @pmi0("type_video_card_event")
        public static final Type TYPE_VIDEO_CARD_EVENT;

        @pmi0("type_video_catalog_warmup_view")
        public static final Type TYPE_VIDEO_CATALOG_WARMUP_VIEW;

        @pmi0("type_video_child_profile_views")
        public static final Type TYPE_VIDEO_CHILD_PROFILE_VIEWS;

        @pmi0("type_video_comments_view")
        public static final Type TYPE_VIDEO_COMMENTS_VIEW;

        @pmi0("type_video_content_warning_modal_view")
        public static final Type TYPE_VIDEO_CONTENT_WARNING_MODAL_VIEW;

        @pmi0("type_video_group_live_block_card_show")
        public static final Type TYPE_VIDEO_GROUP_LIVE_BLOCK_CARD_SHOW;

        @pmi0("type_video_info_about_drug_view")
        public static final Type TYPE_VIDEO_INFO_ABOUT_DRUG_VIEW;

        @pmi0("type_video_music_track_add_log_in")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_ADD_LOG_IN;

        @pmi0("type_video_music_track_add_success")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_ADD_SUCCESS;

        @pmi0("type_video_offline_snackbar_view")
        public static final Type TYPE_VIDEO_OFFLINE_SNACKBAR_VIEW;

        @pmi0("type_video_player_music_track_view")
        public static final Type TYPE_VIDEO_PLAYER_MUSIC_TRACK_VIEW;

        @pmi0("type_voip_max_app_view")
        public static final Type TYPE_VOIP_MAX_APP_VIEW;

        @pmi0("type_wall_comments_view")
        public static final Type TYPE_WALL_COMMENTS_VIEW;

        static {
            Type type = new Type("TYPE_SUPERAPP_SECTION_ITEM", 0);
            TYPE_SUPERAPP_SECTION_ITEM = type;
            Type type2 = new Type("TYPE_SUPERAPP_WIDGET_ITEM", 1);
            TYPE_SUPERAPP_WIDGET_ITEM = type2;
            Type type3 = new Type("TYPE_CATALOG_BANNER_EVENT_ITEM", 2);
            TYPE_CATALOG_BANNER_EVENT_ITEM = type3;
            Type type4 = new Type("TYPE_MARKET_ITEM", 3);
            TYPE_MARKET_ITEM = type4;
            Type type5 = new Type("TYPE_MARKET_MARKETPLACE_ITEM", 4);
            TYPE_MARKET_MARKETPLACE_ITEM = type5;
            Type type6 = new Type("TYPE_CLASSIFIEDS_VIEW", 5);
            TYPE_CLASSIFIEDS_VIEW = type6;
            Type type7 = new Type("TYPE_AUDIO_FULLSCREEN_BANNER_EVENT_ITEM", 6);
            TYPE_AUDIO_FULLSCREEN_BANNER_EVENT_ITEM = type7;
            Type type8 = new Type("TYPE_ALIEXPRESS_VIEW", 7);
            TYPE_ALIEXPRESS_VIEW = type8;
            Type type9 = new Type("TYPE_MINI_APP_ITEM", 8);
            TYPE_MINI_APP_ITEM = type9;
            Type type10 = new Type("TYPE_VIDEO_CARD_EVENT", 9);
            TYPE_VIDEO_CARD_EVENT = type10;
            Type type11 = new Type("TYPE_MARUSIA_CONVERSATION_ITEM", 10);
            TYPE_MARUSIA_CONVERSATION_ITEM = type11;
            Type type12 = new Type("TYPE_MARUSIA_READING_ITEM", 11);
            TYPE_MARUSIA_READING_ITEM = type12;
            Type type13 = new Type("TYPE_VIDEO_PLAYER_MUSIC_TRACK_VIEW", 12);
            TYPE_VIDEO_PLAYER_MUSIC_TRACK_VIEW = type13;
            Type type14 = new Type("TYPE_FEED_ITEM", 13);
            TYPE_FEED_ITEM = type14;
            Type type15 = new Type("TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM", 14);
            TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM = type15;
            Type type16 = new Type("TYPE_GAME_CATALOG_ITEM", 15);
            TYPE_GAME_CATALOG_ITEM = type16;
            Type type17 = new Type("TYPE_MARKET_VIEW", 16);
            TYPE_MARKET_VIEW = type17;
            Type type18 = new Type("TYPE_IM_CONVERSATION_BANNER_VIEW", 17);
            TYPE_IM_CONVERSATION_BANNER_VIEW = type18;
            Type type19 = new Type("TYPE_RATING_VIEW", 18);
            TYPE_RATING_VIEW = type19;
            Type type20 = new Type("TYPE_POPUP_REVIEW_SHOW", 19);
            TYPE_POPUP_REVIEW_SHOW = type20;
            Type type21 = new Type("TYPE_CLIPS_DEEPFAKE_TEMPLATES_VIEW", 20);
            TYPE_CLIPS_DEEPFAKE_TEMPLATES_VIEW = type21;
            Type type22 = new Type("TYPE_DONUT_WALL_BLOCK_VIEW", 21);
            TYPE_DONUT_WALL_BLOCK_VIEW = type22;
            Type type23 = new Type("TYPE_BADGES_SCREEN_ITEM", 22);
            TYPE_BADGES_SCREEN_ITEM = type23;
            Type type24 = new Type("TYPE_DZEN_BLOCK_ARTICLE_VIEW", 23);
            TYPE_DZEN_BLOCK_ARTICLE_VIEW = type24;
            Type type25 = new Type("TYPE_DZEN_STORY_VIEW", 24);
            TYPE_DZEN_STORY_VIEW = type25;
            Type type26 = new Type("TYPE_GAME_APP_VIEW", 25);
            TYPE_GAME_APP_VIEW = type26;
            Type type27 = new Type("TYPE_DZEN_STORY_ITEM_VIEW", 26);
            TYPE_DZEN_STORY_ITEM_VIEW = type27;
            Type type28 = new Type("TYPE_COMMUNITY_ONBOARDING_VIEW", 27);
            TYPE_COMMUNITY_ONBOARDING_VIEW = type28;
            Type type29 = new Type("TYPE_FOLLOWERS_MODE_ONBOARDING_ENTRYPOINT_VIEW", 28);
            TYPE_FOLLOWERS_MODE_ONBOARDING_ENTRYPOINT_VIEW = type29;
            Type type30 = new Type("TYPE_CATALOG_ITEM_VIEW", 29);
            TYPE_CATALOG_ITEM_VIEW = type30;
            Type type31 = new Type("TYPE_FEED_MRC_VIEW_POST_TIME", 30);
            TYPE_FEED_MRC_VIEW_POST_TIME = type31;
            Type type32 = new Type("TYPE_FEED_ITEM_SCREEN_VIEW", 31);
            TYPE_FEED_ITEM_SCREEN_VIEW = type32;
            Type type33 = new Type("TYPE_AUDIO_DOMAIN_EVENT_ITEM", 32);
            TYPE_AUDIO_DOMAIN_EVENT_ITEM = type33;
            Type type34 = new Type("TYPE_FEED_CAROUSEL_ONBOARDING_VIEW", 33);
            TYPE_FEED_CAROUSEL_ONBOARDING_VIEW = type34;
            Type type35 = new Type("TYPE_MARKET_ITEM_REVIEW_VIEW", 34);
            TYPE_MARKET_ITEM_REVIEW_VIEW = type35;
            Type type36 = new Type("TYPE_COMMUNITY_REVIEW_VIEW", 35);
            TYPE_COMMUNITY_REVIEW_VIEW = type36;
            Type type37 = new Type("TYPE_CATALOG_SPECIAL_PROJECT_ITEM", 36);
            TYPE_CATALOG_SPECIAL_PROJECT_ITEM = type37;
            Type type38 = new Type("TYPE_AUDIO_POPUP_ITEM", 37);
            TYPE_AUDIO_POPUP_ITEM = type38;
            Type type39 = new Type("TYPE_BANNER_VIEW", 38);
            TYPE_BANNER_VIEW = type39;
            Type type40 = new Type("TYPE_AUDIO_LONGTAP_ITEM", 39);
            TYPE_AUDIO_LONGTAP_ITEM = type40;
            Type type41 = new Type("TYPE_ECOMM_VIEW", 40);
            TYPE_ECOMM_VIEW = type41;
            Type type42 = new Type("TYPE_MARKET_COMMUNITY_REVIEW_VIEW", 41);
            TYPE_MARKET_COMMUNITY_REVIEW_VIEW = type42;
            Type type43 = new Type("TYPE_IVAS_ITEM_VIEWS", 42);
            TYPE_IVAS_ITEM_VIEWS = type43;
            Type type44 = new Type("TYPE_LEGAL_NOTICE_VIEW", 43);
            TYPE_LEGAL_NOTICE_VIEW = type44;
            Type type45 = new Type("TYPE_COMMUNITY_TAB_ITEM_VIEW", 44);
            TYPE_COMMUNITY_TAB_ITEM_VIEW = type45;
            Type type46 = new Type("TYPE_DONUT_GOAL_VIEW", 45);
            TYPE_DONUT_GOAL_VIEW = type46;
            Type type47 = new Type("TYPE_DONUT_BANNER_VIEW", 46);
            TYPE_DONUT_BANNER_VIEW = type47;
            Type type48 = new Type("TYPE_SHARING_BUTTON_ANIMATED_VIEW", 47);
            TYPE_SHARING_BUTTON_ANIMATED_VIEW = type48;
            Type type49 = new Type("TYPE_AUDIO_ARTIST_VIEW_ITEM", 48);
            TYPE_AUDIO_ARTIST_VIEW_ITEM = type49;
            Type type50 = new Type("TYPE_PROMO_VIEW_ITEM", 49);
            TYPE_PROMO_VIEW_ITEM = type50;
            Type type51 = new Type("TYPE_IM_OPEN_INVITATION_CARD_ITEM", 50);
            TYPE_IM_OPEN_INVITATION_CARD_ITEM = type51;
            Type type52 = new Type("TYPE_IM_MAX_TRANSITION_BANNER_ITEM", 51);
            TYPE_IM_MAX_TRANSITION_BANNER_ITEM = type52;
            Type type53 = new Type("TYPE_ONBOARDING_EVENT", 52);
            TYPE_ONBOARDING_EVENT = type53;
            Type type54 = new Type("TYPE_NOTIFICATION_VIEWS", 53);
            TYPE_NOTIFICATION_VIEWS = type54;
            Type type55 = new Type("TYPE_TV_KID_MODE_ONBOARDING_VIEW", 54);
            TYPE_TV_KID_MODE_ONBOARDING_VIEW = type55;
            Type type56 = new Type("TYPE_TV_QR_MODAL_ACTION", 55);
            TYPE_TV_QR_MODAL_ACTION = type56;
            Type type57 = new Type("TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_VIEW", 56);
            TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_VIEW = type57;
            Type type58 = new Type("TYPE_FEED_SHOW_INLINE_COMMENT", 57);
            TYPE_FEED_SHOW_INLINE_COMMENT = type58;
            Type type59 = new Type("TYPE_FEED_SHOW_INLINE_COMMENT_INPUT", 58);
            TYPE_FEED_SHOW_INLINE_COMMENT_INPUT = type59;
            Type type60 = new Type("TYPE_FEED_SHOW_ICON_COMMENT", 59);
            TYPE_FEED_SHOW_ICON_COMMENT = type60;
            Type type61 = new Type("TYPE_FEED_SHOW_FRIENDS_LIKES_TEXT", 60);
            TYPE_FEED_SHOW_FRIENDS_LIKES_TEXT = type61;
            Type type62 = new Type("TYPE_FEED_SHOW_FRIENDS_LIKES_ICON", 61);
            TYPE_FEED_SHOW_FRIENDS_LIKES_ICON = type62;
            Type type63 = new Type("TYPE_TV_KID_PROFILE_ONBOARDING_VIEW", 62);
            TYPE_TV_KID_PROFILE_ONBOARDING_VIEW = type63;
            Type type64 = new Type("TYPE_VIDEO_CATALOG_WARMUP_VIEW", 63);
            TYPE_VIDEO_CATALOG_WARMUP_VIEW = type64;
            Type type65 = new Type("TYPE_VIDEO_CHILD_PROFILE_VIEWS", 64);
            TYPE_VIDEO_CHILD_PROFILE_VIEWS = type65;
            Type type66 = new Type("TYPE_FEED_IMAGE_LOADING", 65);
            TYPE_FEED_IMAGE_LOADING = type66;
            Type type67 = new Type("IDFA_PERMISSION_SCREEN_SHOW", 66);
            IDFA_PERMISSION_SCREEN_SHOW = type67;
            Type type68 = new Type("TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_VIEW", 67);
            TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_VIEW = type68;
            Type type69 = new Type("TYPE_VOIP_MAX_APP_VIEW", 68);
            TYPE_VOIP_MAX_APP_VIEW = type69;
            Type type70 = new Type("TYPE_SHOW_CAST_CONNECT_OFFER_MODAL", 69);
            TYPE_SHOW_CAST_CONNECT_OFFER_MODAL = type70;
            Type type71 = new Type("TYPE_VIDEO_CONTENT_WARNING_MODAL_VIEW", 70);
            TYPE_VIDEO_CONTENT_WARNING_MODAL_VIEW = type71;
            Type type72 = new Type("TYPE_VIDEO_ADULT_MARK_NOTIFICATION_VIEW", 71);
            TYPE_VIDEO_ADULT_MARK_NOTIFICATION_VIEW = type72;
            Type type73 = new Type("TYPE_VIDEO_MUSIC_TRACK_ADD_LOG_IN", 72);
            TYPE_VIDEO_MUSIC_TRACK_ADD_LOG_IN = type73;
            Type type74 = new Type("TYPE_VIDEO_MUSIC_TRACK_ADD_SUCCESS", 73);
            TYPE_VIDEO_MUSIC_TRACK_ADD_SUCCESS = type74;
            Type type75 = new Type("TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_VIEW", 74);
            TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_VIEW = type75;
            Type type76 = new Type("TYPE_FEED_SDK_AD_VIEW", 75);
            TYPE_FEED_SDK_AD_VIEW = type76;
            Type type77 = new Type("TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_SHOW", 76);
            TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_SHOW = type77;
            Type type78 = new Type("TYPE_VIDEO_AD_SHOW", 77);
            TYPE_VIDEO_AD_SHOW = type78;
            Type type79 = new Type("TYPE_VIDEO_AD_TRIAL_SHOW", 78);
            TYPE_VIDEO_AD_TRIAL_SHOW = type79;
            Type type80 = new Type("TYPE_VIDEO_INFO_ABOUT_DRUG_VIEW", 79);
            TYPE_VIDEO_INFO_ABOUT_DRUG_VIEW = type80;
            Type type81 = new Type("TYPE_CLIPS_GO_TO_ATTACHED_VIDEO_BUTTON_SHOW", 80);
            TYPE_CLIPS_GO_TO_ATTACHED_VIDEO_BUTTON_SHOW = type81;
            Type type82 = new Type("TYPE_CHANNEL_ITEM", 81);
            TYPE_CHANNEL_ITEM = type82;
            Type type83 = new Type("TYPE_ADS_BOTTOM_BANNER", 82);
            TYPE_ADS_BOTTOM_BANNER = type83;
            Type type84 = new Type("TYPE_VIDEO_GROUP_LIVE_BLOCK_CARD_SHOW", 83);
            TYPE_VIDEO_GROUP_LIVE_BLOCK_CARD_SHOW = type84;
            Type type85 = new Type("TYPE_COMMUNITY_SCREEN_LOAD_ERROR_VIEW", 84);
            TYPE_COMMUNITY_SCREEN_LOAD_ERROR_VIEW = type85;
            Type type86 = new Type("TYPE_COMMUNITY_SCREEN_TAB_LOAD_ERROR_VIEW", 85);
            TYPE_COMMUNITY_SCREEN_TAB_LOAD_ERROR_VIEW = type86;
            Type type87 = new Type("TYPE_PAGE_SHOW", 86);
            TYPE_PAGE_SHOW = type87;
            Type type88 = new Type("TYPE_VIDEO_OFFLINE_SNACKBAR_VIEW", 87);
            TYPE_VIDEO_OFFLINE_SNACKBAR_VIEW = type88;
            Type type89 = new Type("TYPE_COMMUNITIES_VIEW", 88);
            TYPE_COMMUNITIES_VIEW = type89;
            Type type90 = new Type("TYPE_COMMUNITIES_TRUST_MARKS_VIEW", 89);
            TYPE_COMMUNITIES_TRUST_MARKS_VIEW = type90;
            Type type91 = new Type("TYPE_VIDEO_COMMENTS_VIEW", 90);
            TYPE_VIDEO_COMMENTS_VIEW = type91;
            Type type92 = new Type("TYPE_WALL_COMMENTS_VIEW", 91);
            TYPE_WALL_COMMENTS_VIEW = type92;
            Type type93 = new Type("TYPE_AUDIO_RESTRICTION_POPUP", 92);
            TYPE_AUDIO_RESTRICTION_POPUP = type93;
            Type type94 = new Type("TYPE_SUPERAPP_VKVIDEO_BANNER", 93);
            TYPE_SUPERAPP_VKVIDEO_BANNER = type94;
            Type type95 = new Type("TYPE_VIDEO_AUTHOR_ONBOARDING", 94);
            TYPE_VIDEO_AUTHOR_ONBOARDING = type95;
            Type type96 = new Type("TYPE_INSTALL_VKVIDEO_MODAL", 95);
            TYPE_INSTALL_VKVIDEO_MODAL = type96;
            Type type97 = new Type("TYPE_OVERLAY_LIVE_PRODUCT_CARD_IMPRESSION", 96);
            TYPE_OVERLAY_LIVE_PRODUCT_CARD_IMPRESSION = type97;
            Type type98 = new Type("TYPE_OVERLAY_LIVE_PRODUCT_VIEW_ITEM_MEDIA", 97);
            TYPE_OVERLAY_LIVE_PRODUCT_VIEW_ITEM_MEDIA = type98;
            Type type99 = new Type("TYPE_VIDEO_ASSISTANT_SHOW", 98);
            TYPE_VIDEO_ASSISTANT_SHOW = type99;
            Type type100 = new Type("TYPE_OPEN_IN_VKVIDEO_BANNER_SHOW", 99);
            TYPE_OPEN_IN_VKVIDEO_BANNER_SHOW = type100;
            Type type101 = new Type("TYPE_OPEN_IN_VKVIDEO_BOTTOM_BANNER_SHOW", 100);
            TYPE_OPEN_IN_VKVIDEO_BOTTOM_BANNER_SHOW = type101;
            Type type102 = new Type("TYPE_INSTALL_VKVIDEO_MODAL_SHOW", 101);
            TYPE_INSTALL_VKVIDEO_MODAL_SHOW = type102;
            Type type103 = new Type("TYPE_AUDIO_MODAL", 102);
            TYPE_AUDIO_MODAL = type103;
            Type type104 = new Type("TYPE_VIDEO_ASSISTANT_LOADER_SHOW", 103);
            TYPE_VIDEO_ASSISTANT_LOADER_SHOW = type104;
            Type type105 = new Type("TYPE_VIDEO_ASSISTANT_MESSAGE_DONE_SHOW", 104);
            TYPE_VIDEO_ASSISTANT_MESSAGE_DONE_SHOW = type105;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54, type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74, type75, type76, type77, type78, type79, type80, type81, type82, type83, type84, type85, type86, type87, type88, type89, type90, type91, type92, type93, type94, type95, type96, type97, type98, type99, type100, type101, type102, type103, type104, type105};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class a {
        public static SchemeStat$TypeView a(SchemeStat$EventItem schemeStat$EventItem, String str, String str2, Integer num, b bVar) {
            if (bVar == null) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappSectionItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_SUPERAPP_SECTION_ITEM, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappSectionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16416, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappWidgetItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_SUPERAPP_WIDGET_ITEM, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappWidgetItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32800, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARKET_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524320, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketMarketplaceItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARKET_MARKETPLACE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketMarketplaceItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048608, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeClassifiedsView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_CLASSIFIEDS_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClassifiedsView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388640, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeAliexpressView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_ALIEXPRESS_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeAliexpressView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777248, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MINI_APP_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131104, -1, -1, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoCardEvent) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_CARD_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoCardEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262176, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeConversationItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARUSIA_CONVERSATION_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeConversationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554464, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeReadingItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARUSIA_READING_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeReadingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108896, -1, -1, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoPlayerMusicTrackView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_PLAYER_MUSIC_TRACK_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoPlayerMusicTrackView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -129, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeFeedItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeFeedItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217760, -1, -1, 127, null);
            }
            if (bVar instanceof c0) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (c0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435488, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeGameCatalogItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_GAME_CATALOG_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeGameCatalogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483616, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARKET_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -2, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImConversationBannerView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_IM_CONVERSATION_BANNER_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImConversationBannerView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -3, -1, 127, null);
            }
            if (bVar instanceof CommonMarketStat$TypeRatingView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_RATING_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeRatingView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -5, -1, 127, null);
            }
            if (bVar instanceof u) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_POPUP_REVIEW_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (u) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -17, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_CLIPS_DEEPFAKE_TEMPLATES_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -257, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDonutWallBlockView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_DONUT_WALL_BLOCK_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDonutWallBlockView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -513, -1, 127, null);
            }
            if (bVar instanceof CommonVasStat$TypeBadgesScreenItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_BADGES_SCREEN_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVasStat$TypeBadgesScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1025, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenBlockArticleView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_DZEN_BLOCK_ARTICLE_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDzenBlockArticleView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -2049, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenStoryView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_DZEN_STORY_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDzenStoryView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -4097, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeGameAppView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_GAME_APP_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeGameAppView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194336, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenStoryItemView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_DZEN_STORY_ITEM_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDzenStoryItemView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -8193, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityOnboardingView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITY_ONBOARDING_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityOnboardingView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -16385, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FOLLOWERS_MODE_ONBOARDING_ENTRYPOINT_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -32769, -1, 127, null);
            }
            if (bVar instanceof CommonCatalogStat$TypeCatalogItemView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_CATALOG_ITEM_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCatalogStat$TypeCatalogItemView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -65537, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_MRC_VIEW_POST_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -131073, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedItemScreenView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_ITEM_SCREEN_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedItemScreenView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870944, -1, -1, 127, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioDomainEventItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_AUDIO_DOMAIN_EVENT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioDomainEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -9, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_CAROUSEL_ONBOARDING_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741856, -1, -1, 127, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketItemReviewView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARKET_ITEM_REVIEW_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketItemReviewView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -262145, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityReviewView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITY_REVIEW_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityReviewView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -524289, -1, 127, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioPopupItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_AUDIO_POPUP_ITEM, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioPopupItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8224, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsEcommStat$TypeBannerView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_BANNER_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsEcommStat$TypeBannerView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1048577, -1, 127, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioLongtapItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_AUDIO_LONGTAP_ITEM, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioLongtapItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4128, -1, -1, 127, null);
            }
            if (bVar instanceof CommonEcommStat$TypeEcommViewItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_ECOMM_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonEcommStat$TypeEcommViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -2097153, -1, 127, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketCommunityReviewView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MARKET_COMMUNITY_REVIEW_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketCommunityReviewView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -4194305, -1, 127, null);
            }
            if (bVar instanceof CommonVasStat$TypeIvasItemViews) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_IVAS_ITEM_VIEWS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVasStat$TypeIvasItemViews) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -8388609, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeLegalNoticeView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_LEGAL_NOTICE_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeLegalNoticeView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -16777217, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeTabItemView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITY_TAB_ITEM_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeTabItemView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -33554433, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutGoal) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_DONUT_GOAL_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutGoal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -67108865, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutBanner) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_DONUT_BANNER_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -134217729, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_SHARING_BUTTON_ANIMATED_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -268435457, -1, 127, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioArtistViewItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_AUDIO_ARTIST_VIEW_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioArtistViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097184, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsPromoStat$TypePromoViewItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_PROMO_VIEW_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsPromoStat$TypePromoViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -536870913, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImOpenInvitationCardItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_IM_OPEN_INVITATION_CARD_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImOpenInvitationCardItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1073741825, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_IM_MAX_TRANSITION_BANNER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, Integer.MAX_VALUE, -1, 127, null);
            }
            if (bVar instanceof CommonOnboardingStat$TypeOnboardingEvent) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_ONBOARDING_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonOnboardingStat$TypeOnboardingEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -2, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsNotificationsStat$TypeNotificationViews) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_NOTIFICATION_VIEWS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsNotificationsStat$TypeNotificationViews) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -3, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_TV_KID_MODE_ONBOARDING_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -5, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvQrModalAction) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_TV_QR_MODAL_ACTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvQrModalAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -9, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -17, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowInlineComment) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_SHOW_INLINE_COMMENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowInlineComment) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -33, 127, null);
            }
            if (bVar instanceof b0) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_SHOW_INLINE_COMMENT_INPUT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (b0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -65, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowIconComment) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_SHOW_ICON_COMMENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowIconComment) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -129, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_SHOW_FRIENDS_LIKES_TEXT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -257, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_SHOW_FRIENDS_LIKES_ICON, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -513, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_TV_KID_PROFILE_ONBOARDING_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -1025, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_CATALOG_WARMUP_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -2049, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoChildProfileViews) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_CHILD_PROFILE_VIEWS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoChildProfileViews) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -4097, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedImageLoading) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_IMAGE_LOADING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedImageLoading) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -8193, 127, null);
            }
            if (bVar instanceof i0) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.IDFA_PERMISSION_SCREEN_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (i0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -16385, 127, null);
            }
            if (bVar instanceof f0) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (f0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -32769, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipMaxAppView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VOIP_MAX_APP_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipMaxAppView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -65537, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_SHOW_CAST_CONNECT_OFFER_MODAL, null, null, null, (MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -288, -1, -1, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoContentWarningModalView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_CONTENT_WARNING_MODAL_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoContentWarningModalView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -131073, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAdultMarkNotificationView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_ADULT_MARK_NOTIFICATION_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAdultMarkNotificationView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -262145, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMusicTrackAddLogIn) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_MUSIC_TRACK_ADD_LOG_IN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoMusicTrackAddLogIn) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -33, -1, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMusicTrackAddSuccess) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_MUSIC_TRACK_ADD_SUCCESS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoMusicTrackAddSuccess) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -65, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -524289, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_FEED_SDK_AD_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsAdsStat$TypeFeedSdkAdView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -1048577, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_SHOW, (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_AD_SHOW, null, (MobileOfficialAppsVideoStat$TypeVideoAdShow) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -96, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdTrialShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_AD_TRIAL_SHOW, null, null, (MobileOfficialAppsVideoStat$TypeVideoAdTrialShow) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_SOCKET_SET_RECEIVE_BUFFER_SIZE_ERROR, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_INFO_ABOUT_DRUG_VIEW, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -544, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_CLIPS_GO_TO_ATTACHED_VIDEO_BUTTON_SHOW, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2080, -1, -1, 127, null);
            }
            if (bVar instanceof SchemeStat$TypeChannelItem) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_CHANNEL_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeChannelItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -2097153, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeAdsBottomBanner) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_ADS_BOTTOM_BANNER, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeAdsBottomBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1056, -1, -1, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_GROUP_LIVE_BLOCK_CARD_SHOW, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65568, -1, -1, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityScreenLoadErrorView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITY_SCREEN_LOAD_ERROR_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityScreenLoadErrorView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -4194305, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITY_SCREEN_TAB_LOAD_ERROR_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -8388609, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypePageShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_PAGE_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypePageShow) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -16777217, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_OFFLINE_SNACKBAR_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent) bVar, null, null, null, null, null, null, null, null, null, null, -32, -1, -268435457, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITIES_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunitiesView) bVar, null, null, null, null, null, null, null, null, null, -32, -1, -536870913, 127, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesTrustMarksView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_COMMUNITIES_TRUST_MARKS_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunitiesTrustMarksView) bVar, null, null, null, null, null, null, null, null, -32, -1, -1073741825, 127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoCommentsView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_COMMENTS_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoCommentsView) bVar, null, null, null, null, null, null, null, -32, -1, Integer.MAX_VALUE, 127, null);
            }
            if (bVar instanceof CommonWallStat$TypeWallCommentsView) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_WALL_COMMENTS_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonWallStat$TypeWallCommentsView) bVar, null, null, null, null, null, null, -32, -1, -1, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioRestrictionPopup) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_AUDIO_RESTRICTION_POPUP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioRestrictionPopup) bVar, null, null, null, null, null, -32, -1, -1, 125, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_SUPERAPP_VKVIDEO_BANNER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -33554433, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_AUTHOR_ONBOARDING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding) bVar, null, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -67108865, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeInstallVkvideoModal) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_INSTALL_VKVIDEO_MODAL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeInstallVkvideoModal) bVar, null, null, null, null, null, null, null, null, null, null, null, -32, -1, -134217729, 127, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_OVERLAY_LIVE_PRODUCT_CARD_IMPRESSION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression) bVar, null, null, null, null, -32, -1, -1, 123, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_ASSISTANT_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantShow) bVar, null, null, null, -32, -1, -1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioModal) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_AUDIO_MODAL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioModal) bVar, null, null, -32, -1, -1, 111, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantLoaderShow) {
                return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_ASSISTANT_LOADER_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantLoaderShow) bVar, null, -32, -1, -1, 95, null);
            }
            if (!(bVar instanceof CommonVideoStat$TypeVideoAssistantMessageDoneShow)) {
                throw new IllegalArgumentException("payload must be one of(TypeSuperappSectionItem, TypeSuperappWidgetItem, TypeMarketItem, TypeMarketMarketplaceItem, TypeClassifiedsView, TypeAliexpressView, TypeMiniAppItem, TypeVideoCardEvent, TypeConversationItem, TypeReadingItem, TypeVideoPlayerMusicTrackView, TypeFeedItem, TypeFriendEntrypointBlockItem, TypeGameCatalogItem, TypeMarketView, TypeImConversationBannerView, TypeRatingView, TypePopupReviewShow, TypeClipsDeepfakeTemplatesView, TypeDonutWallBlockView, TypeBadgesScreenItem, TypeDzenBlockArticleView, TypeDzenStoryView, TypeGameAppView, TypeDzenStoryItemView, TypeCommunityOnboardingView, FollowersModeOnboardingEntrypointView, TypeCatalogItemView, TypeFeedMrcViewPostTime, TypeFeedItemScreenView, TypeAudioDomainEventItem, TypeFeedCarouselOnboardingView, TypeMarketItemReviewView, TypeCommunityReviewView, TypeAudioPopupItem, TypeBannerView, TypeAudioLongtapItem, TypeEcommViewItem, TypeMarketCommunityReviewView, TypeIvasItemViews, TypeLegalNoticeView, TypeTabItemView, TypeDonutGoal, TypeDonutBanner, TypeSharingButtonAnimatedView, TypeAudioArtistViewItem, TypePromoViewItem, TypeImOpenInvitationCardItem, TypeImMaxTransitionBannerItem, TypeOnboardingEvent, TypeNotificationViews, TypeTvKidModeOnboardingView, TypeTvQrModalAction, TypeMoveYoutubeSubsOnboardingView, TypeFeedShowInlineComment, TypeFeedShowInlineCommentInput, TypeFeedShowIconComment, TypeFeedShowFriendsLikesText, TypeFeedShowFriendsLikesIcon, TypeTvKidProfileOnboardingView, TypeVideoCatalogWarmupView, TypeVideoChildProfileViews, TypeFeedImageLoading, IdfaPermissionScreenShow, TypeSportBlockVideoLiveView, TypeVoipMaxAppView, TypeShowCastConnectOfferModal, TypeVideoContentWarningModalView, TypeVideoAdultMarkNotificationView, TypeVideoMusicTrackAddLogIn, TypeVideoMusicTrackAddSuccess, TypeCommunitiesOzonInviteBannerAdbView, TypeFeedSdkAdView, TypeVideoAdSubscriptionOfferShow, TypeVideoAdShow, TypeVideoAdTrialShow, TypeVideoInfoAboutDrugView, TypeClipsGoToAttachedVideoButtonShow, TypeChannelItem, TypeAdsBottomBanner, TypeVideoGroupLiveBlockCardShow, TypeCommunityScreenLoadErrorView, TypeCommunityScreenTabLoadErrorView, TypePageShow, TypeVideoOfflineSnackbarEvent, TypeCommunitiesView, TypeCommunitiesTrustMarksView, TypeVideoCommentsView, TypeWallCommentsView, TypeAudioRestrictionPopup, TypeSuperappVkvideoBanner, TypeVideoAuthorOnboarding, TypeInstallVkvideoModal, TypeOverlayLiveProductCardImpression, TypeVideoAssistantShow, TypeAudioModal, TypeVideoAssistantLoaderShow, TypeVideoAssistantMessageDoneShow)");
            }
            return new SchemeStat$TypeView(schemeStat$EventItem, str, str2, num, Type.TYPE_VIDEO_ASSISTANT_MESSAGE_DONE_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantMessageDoneShow) bVar, -32, -1, -1, 63, null);
        }

        public static /* synthetic */ SchemeStat$TypeView b(SchemeStat$EventItem schemeStat$EventItem, String str, String str2, Integer num, b bVar, int i) {
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                bVar = null;
            }
            return a(schemeStat$EventItem, str, str2, num, bVar);
        }
    }

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public interface b {
    }

    private SchemeStat$TypeView(SchemeStat$EventItem schemeStat$EventItem, String str, String str2, Integer num, Type type, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow, MobileOfficialAppsVideoStat$TypeVideoAdShow mobileOfficialAppsVideoStat$TypeVideoAdShow, MobileOfficialAppsVideoStat$TypeVideoAdTrialShow mobileOfficialAppsVideoStat$TypeVideoAdTrialShow, MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal, MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView, MobileOfficialAppsVideoStat$TypeAdsBottomBanner mobileOfficialAppsVideoStat$TypeAdsBottomBanner, MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow, CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem, CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem, SchemeStat$TypeSuperappSectionItem schemeStat$TypeSuperappSectionItem, SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem, MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem, MobileOfficialAppsMiniappsStat$TypeGameAppView mobileOfficialAppsMiniappsStat$TypeGameAppView, SchemeStat$TypeClassifiedsView schemeStat$TypeClassifiedsView, SchemeStat$TypeAliexpressView schemeStat$TypeAliexpressView, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem, SchemeStat$TypeFeedItem schemeStat$TypeFeedItem, c0 c0Var, MobileOfficialAppsFeedStat$TypeFeedItemScreenView mobileOfficialAppsFeedStat$TypeFeedItemScreenView, MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem, MobileOfficialAppsMarketStat$TypeMarketView mobileOfficialAppsMarketStat$TypeMarketView, MobileOfficialAppsImStat$TypeImConversationBannerView mobileOfficialAppsImStat$TypeImConversationBannerView, CommonMarketStat$TypeRatingView commonMarketStat$TypeRatingView, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, u uVar, CommonVideoStat$TypeVideoMusicTrackAddLogIn commonVideoStat$TypeVideoMusicTrackAddLogIn, CommonVideoStat$TypeVideoMusicTrackAddSuccess commonVideoStat$TypeVideoMusicTrackAddSuccess, CommonVideoStat$TypeVideoPlayerMusicTrackView commonVideoStat$TypeVideoPlayerMusicTrackView, MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView, MobileOfficialAppsFeedStat$TypeDonutWallBlockView mobileOfficialAppsFeedStat$TypeDonutWallBlockView, CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem, MobileOfficialAppsFeedStat$TypeDzenBlockArticleView mobileOfficialAppsFeedStat$TypeDzenBlockArticleView, MobileOfficialAppsFeedStat$TypeDzenStoryView mobileOfficialAppsFeedStat$TypeDzenStoryView, MobileOfficialAppsFeedStat$TypeDzenStoryItemView mobileOfficialAppsFeedStat$TypeDzenStoryItemView, CommonCommunitiesStat$TypeCommunityOnboardingView commonCommunitiesStat$TypeCommunityOnboardingView, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView, CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView, MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime, CommonMarketStat$TypeMarketItemReviewView commonMarketStat$TypeMarketItemReviewView, CommonCommunitiesStat$TypeCommunityReviewView commonCommunitiesStat$TypeCommunityReviewView, MobileOfficialAppsEcommStat$TypeBannerView mobileOfficialAppsEcommStat$TypeBannerView, CommonEcommStat$TypeEcommViewItem commonEcommStat$TypeEcommViewItem, CommonMarketStat$TypeMarketCommunityReviewView commonMarketStat$TypeMarketCommunityReviewView, CommonVasStat$TypeIvasItemViews commonVasStat$TypeIvasItemViews, SchemeStat$TypeLegalNoticeView schemeStat$TypeLegalNoticeView, CommonCommunitiesStat$TypeTabItemView commonCommunitiesStat$TypeTabItemView, CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal, CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner, MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView, MobileOfficialAppsPromoStat$TypePromoViewItem mobileOfficialAppsPromoStat$TypePromoViewItem, MobileOfficialAppsImStat$TypeImOpenInvitationCardItem mobileOfficialAppsImStat$TypeImOpenInvitationCardItem, MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem, CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent, MobileOfficialAppsNotificationsStat$TypeNotificationViews mobileOfficialAppsNotificationsStat$TypeNotificationViews, MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView, MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView, MobileOfficialAppsFeedStat$TypeFeedShowInlineComment mobileOfficialAppsFeedStat$TypeFeedShowInlineComment, b0 b0Var, MobileOfficialAppsFeedStat$TypeFeedShowIconComment mobileOfficialAppsFeedStat$TypeFeedShowIconComment, MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText, MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon, MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView, MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView, MobileOfficialAppsVideoStat$TypeVideoChildProfileViews mobileOfficialAppsVideoStat$TypeVideoChildProfileViews, MobileOfficialAppsFeedStat$TypeFeedImageLoading mobileOfficialAppsFeedStat$TypeFeedImageLoading, i0 i0Var, f0 f0Var, MobileOfficialAppsCallsStat$TypeVoipMaxAppView mobileOfficialAppsCallsStat$TypeVoipMaxAppView, CommonVideoStat$TypeVideoContentWarningModalView commonVideoStat$TypeVideoContentWarningModalView, CommonVideoStat$TypeVideoAdultMarkNotificationView commonVideoStat$TypeVideoAdultMarkNotificationView, CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView, MobileOfficialAppsAdsStat$TypeFeedSdkAdView mobileOfficialAppsAdsStat$TypeFeedSdkAdView, SchemeStat$TypeChannelItem schemeStat$TypeChannelItem, CommonCommunitiesStat$TypeCommunityScreenLoadErrorView commonCommunitiesStat$TypeCommunityScreenLoadErrorView, CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView, CommonVideoStat$TypePageShow commonVideoStat$TypePageShow, MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, MobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding, MobileOfficialAppsVideoStat$TypeInstallVkvideoModal mobileOfficialAppsVideoStat$TypeInstallVkvideoModal, MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent, CommonCommunitiesStat$TypeCommunitiesView commonCommunitiesStat$TypeCommunitiesView, CommonCommunitiesStat$TypeCommunitiesTrustMarksView commonCommunitiesStat$TypeCommunitiesTrustMarksView, CommonVideoStat$TypeVideoCommentsView commonVideoStat$TypeVideoCommentsView, CommonWallStat$TypeWallCommentsView commonWallStat$TypeWallCommentsView, CommonAudioStat$TypeAudioRestrictionPopup commonAudioStat$TypeAudioRestrictionPopup, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression, CommonVideoStat$TypeVideoAssistantShow commonVideoStat$TypeVideoAssistantShow, CommonAudioStat$TypeAudioModal commonAudioStat$TypeAudioModal, CommonVideoStat$TypeVideoAssistantLoaderShow commonVideoStat$TypeVideoAssistantLoaderShow, CommonVideoStat$TypeVideoAssistantMessageDoneShow commonVideoStat$TypeVideoAssistantMessageDoneShow) {
        this.item = schemeStat$EventItem;
        this.startView = str;
        this.endView = str2;
        this.position = num;
        this.type = type;
        this.typeVideoAdSubscriptionOfferShow = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow;
        this.typeVideoAdShow = mobileOfficialAppsVideoStat$TypeVideoAdShow;
        this.typeVideoAdTrialShow = mobileOfficialAppsVideoStat$TypeVideoAdTrialShow;
        this.typeShowCastConnectOfferModal = mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal;
        this.typeVideoInfoAboutDrugView = mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView;
        this.typeAdsBottomBanner = mobileOfficialAppsVideoStat$TypeAdsBottomBanner;
        this.typeClipsGoToAttachedVideoButtonShow = mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow;
        this.typeAudioLongtapItem = commonAudioStat$TypeAudioLongtapItem;
        this.typeAudioPopupItem = commonAudioStat$TypeAudioPopupItem;
        this.typeSuperappSectionItem = schemeStat$TypeSuperappSectionItem;
        this.typeSuperappWidgetItem = schemeStat$TypeSuperappWidgetItem;
        this.typeVideoGroupLiveBlockCardShow = mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow;
        this.typeMiniAppItem = schemeStat$TypeMiniAppItem;
        this.typeVideoCardEvent = commonVideoStat$TypeVideoCardEvent;
        this.typeMarketItem = schemeStat$TypeMarketItem;
        this.typeMarketMarketplaceItem = schemeStat$TypeMarketMarketplaceItem;
        this.typeAudioArtistViewItem = commonAudioStat$TypeAudioArtistViewItem;
        this.typeGameAppView = mobileOfficialAppsMiniappsStat$TypeGameAppView;
        this.typeClassifiedsView = schemeStat$TypeClassifiedsView;
        this.typeAliexpressView = schemeStat$TypeAliexpressView;
        this.typeMarusiaConversationItem = mobileOfficialAppsMarusiaStat$TypeConversationItem;
        this.typeMarusiaReadingItem = mobileOfficialAppsMarusiaStat$TypeReadingItem;
        this.typeFeedItem = schemeStat$TypeFeedItem;
        this.typeFriendEntrypointBlockItem = c0Var;
        this.typeFeedItemScreenView = mobileOfficialAppsFeedStat$TypeFeedItemScreenView;
        this.typeFeedCarouselOnboardingView = mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView;
        this.typeGameCatalogItem = schemeStat$TypeGameCatalogItem;
        this.typeMarketView = mobileOfficialAppsMarketStat$TypeMarketView;
        this.typeImConversationBannerView = mobileOfficialAppsImStat$TypeImConversationBannerView;
        this.typeRatingView = commonMarketStat$TypeRatingView;
        this.typeAudioDomainEventItem = commonAudioStat$TypeAudioDomainEventItem;
        this.typePopupReviewShow = uVar;
        this.typeVideoMusicTrackAddLogIn = commonVideoStat$TypeVideoMusicTrackAddLogIn;
        this.typeVideoMusicTrackAddSuccess = commonVideoStat$TypeVideoMusicTrackAddSuccess;
        this.typeVideoPlayerMusicTrackView = commonVideoStat$TypeVideoPlayerMusicTrackView;
        this.typeClipsDeepfakeTemplatesView = mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView;
        this.typeDonutWallBlockView = mobileOfficialAppsFeedStat$TypeDonutWallBlockView;
        this.typeBadgesScreenItem = commonVasStat$TypeBadgesScreenItem;
        this.typeDzenBlockArticleView = mobileOfficialAppsFeedStat$TypeDzenBlockArticleView;
        this.typeDzenStoryView = mobileOfficialAppsFeedStat$TypeDzenStoryView;
        this.typeDzenStoryItemView = mobileOfficialAppsFeedStat$TypeDzenStoryItemView;
        this.typeCommunityOnboardingView = commonCommunitiesStat$TypeCommunityOnboardingView;
        this.typeFollowersModeOnboardingEntrypointView = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView;
        this.typeCatalogItemView = commonCatalogStat$TypeCatalogItemView;
        this.typeFeedMrcViewPostTime = mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime;
        this.typeMarketItemReviewView = commonMarketStat$TypeMarketItemReviewView;
        this.typeCommunityReviewView = commonCommunitiesStat$TypeCommunityReviewView;
        this.typeBannerView = mobileOfficialAppsEcommStat$TypeBannerView;
        this.typeEcommView = commonEcommStat$TypeEcommViewItem;
        this.typeMarketCommunityReviewView = commonMarketStat$TypeMarketCommunityReviewView;
        this.typeIvasItemViews = commonVasStat$TypeIvasItemViews;
        this.typeLegalNoticeView = schemeStat$TypeLegalNoticeView;
        this.typeCommunityTabItemView = commonCommunitiesStat$TypeTabItemView;
        this.typeDonutGoalView = commonCommunitiesStat$TypeDonutGoal;
        this.typeDonutBannerView = commonCommunitiesStat$TypeDonutBanner;
        this.typeSharingButtonAnimatedView = mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView;
        this.typePromoViewItem = mobileOfficialAppsPromoStat$TypePromoViewItem;
        this.typeImOpenInvitationCardItem = mobileOfficialAppsImStat$TypeImOpenInvitationCardItem;
        this.typeImMaxTransitionBannerItem = mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem;
        this.typeOnboardingEvent = commonOnboardingStat$TypeOnboardingEvent;
        this.typeNotificationViews = mobileOfficialAppsNotificationsStat$TypeNotificationViews;
        this.typeTvKidModeOnboardingView = mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView;
        this.typeTvQrModalAction = mobileOfficialAppsVideoStat$TypeTvQrModalAction;
        this.typeMoveYoutubeSubsOnboardingView = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView;
        this.typeFeedShowInlineComment = mobileOfficialAppsFeedStat$TypeFeedShowInlineComment;
        this.typeFeedShowInlineCommentInput = b0Var;
        this.typeFeedShowIconComment = mobileOfficialAppsFeedStat$TypeFeedShowIconComment;
        this.typeFeedShowFriendsLikesText = mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText;
        this.typeFeedShowFriendsLikesIcon = mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon;
        this.typeTvKidProfileOnboardingView = mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView;
        this.typeVideoCatalogWarmupView = mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView;
        this.typeVideoChildProfileViews = mobileOfficialAppsVideoStat$TypeVideoChildProfileViews;
        this.typeFeedImageLoading = mobileOfficialAppsFeedStat$TypeFeedImageLoading;
        this.idfaPermissionScreenShow = i0Var;
        this.typeCommunitySportBlockVideoLiveView = f0Var;
        this.typeVoipMaxAppView = mobileOfficialAppsCallsStat$TypeVoipMaxAppView;
        this.typeVideoContentWarningModalView = commonVideoStat$TypeVideoContentWarningModalView;
        this.typeVideoAdultMarkNotificationView = commonVideoStat$TypeVideoAdultMarkNotificationView;
        this.typeCommunitiesOzonInviteBannerAdbView = commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView;
        this.typeFeedSdkAdView = mobileOfficialAppsAdsStat$TypeFeedSdkAdView;
        this.typeChannelItem = schemeStat$TypeChannelItem;
        this.typeCommunityScreenLoadErrorView = commonCommunitiesStat$TypeCommunityScreenLoadErrorView;
        this.typeCommunityScreenTabLoadErrorView = commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView;
        this.typePageShow = commonVideoStat$TypePageShow;
        this.typeSuperappVkvideoBanner = mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner;
        this.typeVideoAuthorOnboarding = mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding;
        this.typeInstallVkvideoModal = mobileOfficialAppsVideoStat$TypeInstallVkvideoModal;
        this.typeVideoOfflineSnackbarView = mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent;
        this.typeCommunitiesView = commonCommunitiesStat$TypeCommunitiesView;
        this.typeCommunitiesTrustMarksView = commonCommunitiesStat$TypeCommunitiesTrustMarksView;
        this.typeVideoCommentsView = commonVideoStat$TypeVideoCommentsView;
        this.typeWallCommentsView = commonWallStat$TypeWallCommentsView;
        this.typeAudioRestrictionPopup = commonAudioStat$TypeAudioRestrictionPopup;
        this.typeOverlayLiveProductCardImpression = mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression;
        this.typeVideoAssistantShow = commonVideoStat$TypeVideoAssistantShow;
        this.typeAudioModal = commonAudioStat$TypeAudioModal;
        this.typeVideoAssistantLoaderShow = commonVideoStat$TypeVideoAssistantLoaderShow;
        this.typeVideoAssistantMessageDoneShow = commonVideoStat$TypeVideoAssistantMessageDoneShow;
    }

    public static SchemeStat$TypeView a(SchemeStat$TypeView schemeStat$TypeView, Type type) {
        return new SchemeStat$TypeView(schemeStat$TypeView.item, schemeStat$TypeView.startView, schemeStat$TypeView.endView, schemeStat$TypeView.position, type, schemeStat$TypeView.typeVideoAdSubscriptionOfferShow, schemeStat$TypeView.typeVideoAdShow, schemeStat$TypeView.typeVideoAdTrialShow, schemeStat$TypeView.typeShowCastConnectOfferModal, schemeStat$TypeView.typeVideoInfoAboutDrugView, schemeStat$TypeView.typeAdsBottomBanner, schemeStat$TypeView.typeClipsGoToAttachedVideoButtonShow, schemeStat$TypeView.typeAudioLongtapItem, schemeStat$TypeView.typeAudioPopupItem, schemeStat$TypeView.typeSuperappSectionItem, schemeStat$TypeView.typeSuperappWidgetItem, schemeStat$TypeView.typeVideoGroupLiveBlockCardShow, schemeStat$TypeView.typeMiniAppItem, schemeStat$TypeView.typeVideoCardEvent, schemeStat$TypeView.typeMarketItem, schemeStat$TypeView.typeMarketMarketplaceItem, schemeStat$TypeView.typeAudioArtistViewItem, schemeStat$TypeView.typeGameAppView, schemeStat$TypeView.typeClassifiedsView, schemeStat$TypeView.typeAliexpressView, schemeStat$TypeView.typeMarusiaConversationItem, schemeStat$TypeView.typeMarusiaReadingItem, schemeStat$TypeView.typeFeedItem, schemeStat$TypeView.typeFriendEntrypointBlockItem, schemeStat$TypeView.typeFeedItemScreenView, schemeStat$TypeView.typeFeedCarouselOnboardingView, schemeStat$TypeView.typeGameCatalogItem, schemeStat$TypeView.typeMarketView, schemeStat$TypeView.typeImConversationBannerView, schemeStat$TypeView.typeRatingView, schemeStat$TypeView.typeAudioDomainEventItem, schemeStat$TypeView.typePopupReviewShow, schemeStat$TypeView.typeVideoMusicTrackAddLogIn, schemeStat$TypeView.typeVideoMusicTrackAddSuccess, schemeStat$TypeView.typeVideoPlayerMusicTrackView, schemeStat$TypeView.typeClipsDeepfakeTemplatesView, schemeStat$TypeView.typeDonutWallBlockView, schemeStat$TypeView.typeBadgesScreenItem, schemeStat$TypeView.typeDzenBlockArticleView, schemeStat$TypeView.typeDzenStoryView, schemeStat$TypeView.typeDzenStoryItemView, schemeStat$TypeView.typeCommunityOnboardingView, schemeStat$TypeView.typeFollowersModeOnboardingEntrypointView, schemeStat$TypeView.typeCatalogItemView, schemeStat$TypeView.typeFeedMrcViewPostTime, schemeStat$TypeView.typeMarketItemReviewView, schemeStat$TypeView.typeCommunityReviewView, schemeStat$TypeView.typeBannerView, schemeStat$TypeView.typeEcommView, schemeStat$TypeView.typeMarketCommunityReviewView, schemeStat$TypeView.typeIvasItemViews, schemeStat$TypeView.typeLegalNoticeView, schemeStat$TypeView.typeCommunityTabItemView, schemeStat$TypeView.typeDonutGoalView, schemeStat$TypeView.typeDonutBannerView, schemeStat$TypeView.typeSharingButtonAnimatedView, schemeStat$TypeView.typePromoViewItem, schemeStat$TypeView.typeImOpenInvitationCardItem, schemeStat$TypeView.typeImMaxTransitionBannerItem, schemeStat$TypeView.typeOnboardingEvent, schemeStat$TypeView.typeNotificationViews, schemeStat$TypeView.typeTvKidModeOnboardingView, schemeStat$TypeView.typeTvQrModalAction, schemeStat$TypeView.typeMoveYoutubeSubsOnboardingView, schemeStat$TypeView.typeFeedShowInlineComment, schemeStat$TypeView.typeFeedShowInlineCommentInput, schemeStat$TypeView.typeFeedShowIconComment, schemeStat$TypeView.typeFeedShowFriendsLikesText, schemeStat$TypeView.typeFeedShowFriendsLikesIcon, schemeStat$TypeView.typeTvKidProfileOnboardingView, schemeStat$TypeView.typeVideoCatalogWarmupView, schemeStat$TypeView.typeVideoChildProfileViews, schemeStat$TypeView.typeFeedImageLoading, schemeStat$TypeView.idfaPermissionScreenShow, schemeStat$TypeView.typeCommunitySportBlockVideoLiveView, schemeStat$TypeView.typeVoipMaxAppView, schemeStat$TypeView.typeVideoContentWarningModalView, schemeStat$TypeView.typeVideoAdultMarkNotificationView, schemeStat$TypeView.typeCommunitiesOzonInviteBannerAdbView, schemeStat$TypeView.typeFeedSdkAdView, schemeStat$TypeView.typeChannelItem, schemeStat$TypeView.typeCommunityScreenLoadErrorView, schemeStat$TypeView.typeCommunityScreenTabLoadErrorView, schemeStat$TypeView.typePageShow, schemeStat$TypeView.typeSuperappVkvideoBanner, schemeStat$TypeView.typeVideoAuthorOnboarding, schemeStat$TypeView.typeInstallVkvideoModal, schemeStat$TypeView.typeVideoOfflineSnackbarView, schemeStat$TypeView.typeCommunitiesView, schemeStat$TypeView.typeCommunitiesTrustMarksView, schemeStat$TypeView.typeVideoCommentsView, schemeStat$TypeView.typeWallCommentsView, schemeStat$TypeView.typeAudioRestrictionPopup, schemeStat$TypeView.typeOverlayLiveProductCardImpression, schemeStat$TypeView.typeVideoAssistantShow, schemeStat$TypeView.typeAudioModal, schemeStat$TypeView.typeVideoAssistantLoaderShow, schemeStat$TypeView.typeVideoAssistantMessageDoneShow);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeView)) {
            return false;
        }
        SchemeStat$TypeView schemeStat$TypeView = (SchemeStat$TypeView) obj;
        return epx.f(this.item, schemeStat$TypeView.item) && epx.f(this.startView, schemeStat$TypeView.startView) && epx.f(this.endView, schemeStat$TypeView.endView) && epx.f(this.position, schemeStat$TypeView.position) && this.type == schemeStat$TypeView.type && epx.f(this.typeVideoAdSubscriptionOfferShow, schemeStat$TypeView.typeVideoAdSubscriptionOfferShow) && epx.f(this.typeVideoAdShow, schemeStat$TypeView.typeVideoAdShow) && epx.f(this.typeVideoAdTrialShow, schemeStat$TypeView.typeVideoAdTrialShow) && epx.f(this.typeShowCastConnectOfferModal, schemeStat$TypeView.typeShowCastConnectOfferModal) && epx.f(this.typeVideoInfoAboutDrugView, schemeStat$TypeView.typeVideoInfoAboutDrugView) && epx.f(this.typeAdsBottomBanner, schemeStat$TypeView.typeAdsBottomBanner) && epx.f(this.typeClipsGoToAttachedVideoButtonShow, schemeStat$TypeView.typeClipsGoToAttachedVideoButtonShow) && epx.f(this.typeAudioLongtapItem, schemeStat$TypeView.typeAudioLongtapItem) && epx.f(this.typeAudioPopupItem, schemeStat$TypeView.typeAudioPopupItem) && epx.f(this.typeSuperappSectionItem, schemeStat$TypeView.typeSuperappSectionItem) && epx.f(this.typeSuperappWidgetItem, schemeStat$TypeView.typeSuperappWidgetItem) && epx.f(this.typeVideoGroupLiveBlockCardShow, schemeStat$TypeView.typeVideoGroupLiveBlockCardShow) && epx.f(this.typeMiniAppItem, schemeStat$TypeView.typeMiniAppItem) && epx.f(this.typeVideoCardEvent, schemeStat$TypeView.typeVideoCardEvent) && epx.f(this.typeMarketItem, schemeStat$TypeView.typeMarketItem) && epx.f(this.typeMarketMarketplaceItem, schemeStat$TypeView.typeMarketMarketplaceItem) && epx.f(this.typeAudioArtistViewItem, schemeStat$TypeView.typeAudioArtistViewItem) && epx.f(this.typeGameAppView, schemeStat$TypeView.typeGameAppView) && epx.f(this.typeClassifiedsView, schemeStat$TypeView.typeClassifiedsView) && epx.f(this.typeAliexpressView, schemeStat$TypeView.typeAliexpressView) && epx.f(this.typeMarusiaConversationItem, schemeStat$TypeView.typeMarusiaConversationItem) && epx.f(this.typeMarusiaReadingItem, schemeStat$TypeView.typeMarusiaReadingItem) && epx.f(this.typeFeedItem, schemeStat$TypeView.typeFeedItem) && epx.f(this.typeFriendEntrypointBlockItem, schemeStat$TypeView.typeFriendEntrypointBlockItem) && epx.f(this.typeFeedItemScreenView, schemeStat$TypeView.typeFeedItemScreenView) && epx.f(this.typeFeedCarouselOnboardingView, schemeStat$TypeView.typeFeedCarouselOnboardingView) && epx.f(this.typeGameCatalogItem, schemeStat$TypeView.typeGameCatalogItem) && epx.f(this.typeMarketView, schemeStat$TypeView.typeMarketView) && epx.f(this.typeImConversationBannerView, schemeStat$TypeView.typeImConversationBannerView) && epx.f(this.typeRatingView, schemeStat$TypeView.typeRatingView) && epx.f(this.typeAudioDomainEventItem, schemeStat$TypeView.typeAudioDomainEventItem) && epx.f(this.typePopupReviewShow, schemeStat$TypeView.typePopupReviewShow) && epx.f(this.typeVideoMusicTrackAddLogIn, schemeStat$TypeView.typeVideoMusicTrackAddLogIn) && epx.f(this.typeVideoMusicTrackAddSuccess, schemeStat$TypeView.typeVideoMusicTrackAddSuccess) && epx.f(this.typeVideoPlayerMusicTrackView, schemeStat$TypeView.typeVideoPlayerMusicTrackView) && epx.f(this.typeClipsDeepfakeTemplatesView, schemeStat$TypeView.typeClipsDeepfakeTemplatesView) && epx.f(this.typeDonutWallBlockView, schemeStat$TypeView.typeDonutWallBlockView) && epx.f(this.typeBadgesScreenItem, schemeStat$TypeView.typeBadgesScreenItem) && epx.f(this.typeDzenBlockArticleView, schemeStat$TypeView.typeDzenBlockArticleView) && epx.f(this.typeDzenStoryView, schemeStat$TypeView.typeDzenStoryView) && epx.f(this.typeDzenStoryItemView, schemeStat$TypeView.typeDzenStoryItemView) && epx.f(this.typeCommunityOnboardingView, schemeStat$TypeView.typeCommunityOnboardingView) && epx.f(this.typeFollowersModeOnboardingEntrypointView, schemeStat$TypeView.typeFollowersModeOnboardingEntrypointView) && epx.f(this.typeCatalogItemView, schemeStat$TypeView.typeCatalogItemView) && epx.f(this.typeFeedMrcViewPostTime, schemeStat$TypeView.typeFeedMrcViewPostTime) && epx.f(this.typeMarketItemReviewView, schemeStat$TypeView.typeMarketItemReviewView) && epx.f(this.typeCommunityReviewView, schemeStat$TypeView.typeCommunityReviewView) && epx.f(this.typeBannerView, schemeStat$TypeView.typeBannerView) && epx.f(this.typeEcommView, schemeStat$TypeView.typeEcommView) && epx.f(this.typeMarketCommunityReviewView, schemeStat$TypeView.typeMarketCommunityReviewView) && epx.f(this.typeIvasItemViews, schemeStat$TypeView.typeIvasItemViews) && epx.f(this.typeLegalNoticeView, schemeStat$TypeView.typeLegalNoticeView) && epx.f(this.typeCommunityTabItemView, schemeStat$TypeView.typeCommunityTabItemView) && epx.f(this.typeDonutGoalView, schemeStat$TypeView.typeDonutGoalView) && epx.f(this.typeDonutBannerView, schemeStat$TypeView.typeDonutBannerView) && epx.f(this.typeSharingButtonAnimatedView, schemeStat$TypeView.typeSharingButtonAnimatedView) && epx.f(this.typePromoViewItem, schemeStat$TypeView.typePromoViewItem) && epx.f(this.typeImOpenInvitationCardItem, schemeStat$TypeView.typeImOpenInvitationCardItem) && epx.f(this.typeImMaxTransitionBannerItem, schemeStat$TypeView.typeImMaxTransitionBannerItem) && epx.f(this.typeOnboardingEvent, schemeStat$TypeView.typeOnboardingEvent) && epx.f(this.typeNotificationViews, schemeStat$TypeView.typeNotificationViews) && epx.f(this.typeTvKidModeOnboardingView, schemeStat$TypeView.typeTvKidModeOnboardingView) && epx.f(this.typeTvQrModalAction, schemeStat$TypeView.typeTvQrModalAction) && epx.f(this.typeMoveYoutubeSubsOnboardingView, schemeStat$TypeView.typeMoveYoutubeSubsOnboardingView) && epx.f(this.typeFeedShowInlineComment, schemeStat$TypeView.typeFeedShowInlineComment) && epx.f(this.typeFeedShowInlineCommentInput, schemeStat$TypeView.typeFeedShowInlineCommentInput) && epx.f(this.typeFeedShowIconComment, schemeStat$TypeView.typeFeedShowIconComment) && epx.f(this.typeFeedShowFriendsLikesText, schemeStat$TypeView.typeFeedShowFriendsLikesText) && epx.f(this.typeFeedShowFriendsLikesIcon, schemeStat$TypeView.typeFeedShowFriendsLikesIcon) && epx.f(this.typeTvKidProfileOnboardingView, schemeStat$TypeView.typeTvKidProfileOnboardingView) && epx.f(this.typeVideoCatalogWarmupView, schemeStat$TypeView.typeVideoCatalogWarmupView) && epx.f(this.typeVideoChildProfileViews, schemeStat$TypeView.typeVideoChildProfileViews) && epx.f(this.typeFeedImageLoading, schemeStat$TypeView.typeFeedImageLoading) && epx.f(this.idfaPermissionScreenShow, schemeStat$TypeView.idfaPermissionScreenShow) && epx.f(this.typeCommunitySportBlockVideoLiveView, schemeStat$TypeView.typeCommunitySportBlockVideoLiveView) && epx.f(this.typeVoipMaxAppView, schemeStat$TypeView.typeVoipMaxAppView) && epx.f(this.typeVideoContentWarningModalView, schemeStat$TypeView.typeVideoContentWarningModalView) && epx.f(this.typeVideoAdultMarkNotificationView, schemeStat$TypeView.typeVideoAdultMarkNotificationView) && epx.f(this.typeCommunitiesOzonInviteBannerAdbView, schemeStat$TypeView.typeCommunitiesOzonInviteBannerAdbView) && epx.f(this.typeFeedSdkAdView, schemeStat$TypeView.typeFeedSdkAdView) && epx.f(this.typeChannelItem, schemeStat$TypeView.typeChannelItem) && epx.f(this.typeCommunityScreenLoadErrorView, schemeStat$TypeView.typeCommunityScreenLoadErrorView) && epx.f(this.typeCommunityScreenTabLoadErrorView, schemeStat$TypeView.typeCommunityScreenTabLoadErrorView) && epx.f(this.typePageShow, schemeStat$TypeView.typePageShow) && epx.f(this.typeSuperappVkvideoBanner, schemeStat$TypeView.typeSuperappVkvideoBanner) && epx.f(this.typeVideoAuthorOnboarding, schemeStat$TypeView.typeVideoAuthorOnboarding) && epx.f(this.typeInstallVkvideoModal, schemeStat$TypeView.typeInstallVkvideoModal) && epx.f(this.typeVideoOfflineSnackbarView, schemeStat$TypeView.typeVideoOfflineSnackbarView) && epx.f(this.typeCommunitiesView, schemeStat$TypeView.typeCommunitiesView) && epx.f(this.typeCommunitiesTrustMarksView, schemeStat$TypeView.typeCommunitiesTrustMarksView) && epx.f(this.typeVideoCommentsView, schemeStat$TypeView.typeVideoCommentsView) && epx.f(this.typeWallCommentsView, schemeStat$TypeView.typeWallCommentsView) && epx.f(this.typeAudioRestrictionPopup, schemeStat$TypeView.typeAudioRestrictionPopup) && epx.f(this.typeOverlayLiveProductCardImpression, schemeStat$TypeView.typeOverlayLiveProductCardImpression) && epx.f(this.typeVideoAssistantShow, schemeStat$TypeView.typeVideoAssistantShow) && epx.f(this.typeAudioModal, schemeStat$TypeView.typeAudioModal) && epx.f(this.typeVideoAssistantLoaderShow, schemeStat$TypeView.typeVideoAssistantLoaderShow) && epx.f(this.typeVideoAssistantMessageDoneShow, schemeStat$TypeView.typeVideoAssistantMessageDoneShow);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.item.hashCode() * 31, 31, this.startView), 31, this.endView);
        Integer num = this.position;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Type type = this.type;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow = this.typeVideoAdSubscriptionOfferShow;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAdShow mobileOfficialAppsVideoStat$TypeVideoAdShow = this.typeVideoAdShow;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsVideoStat$TypeVideoAdShow == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdShow.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialShow mobileOfficialAppsVideoStat$TypeVideoAdTrialShow = this.typeVideoAdTrialShow;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsVideoStat$TypeVideoAdTrialShow == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdTrialShow.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal = this.typeShowCastConnectOfferModal;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal == null ? 0 : mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView = this.typeVideoInfoAboutDrugView;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeAdsBottomBanner mobileOfficialAppsVideoStat$TypeAdsBottomBanner = this.typeAdsBottomBanner;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsVideoStat$TypeAdsBottomBanner == null ? 0 : mobileOfficialAppsVideoStat$TypeAdsBottomBanner.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow = this.typeClipsGoToAttachedVideoButtonShow;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow == null ? 0 : mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow.hashCode())) * 31;
        CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem = this.typeAudioLongtapItem;
        int hashCode10 = (hashCode9 + (commonAudioStat$TypeAudioLongtapItem == null ? 0 : commonAudioStat$TypeAudioLongtapItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem = this.typeAudioPopupItem;
        int hashCode11 = (hashCode10 + (commonAudioStat$TypeAudioPopupItem == null ? 0 : commonAudioStat$TypeAudioPopupItem.hashCode())) * 31;
        SchemeStat$TypeSuperappSectionItem schemeStat$TypeSuperappSectionItem = this.typeSuperappSectionItem;
        int hashCode12 = (hashCode11 + (schemeStat$TypeSuperappSectionItem == null ? 0 : schemeStat$TypeSuperappSectionItem.hashCode())) * 31;
        SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem = this.typeSuperappWidgetItem;
        int hashCode13 = (hashCode12 + (schemeStat$TypeSuperappWidgetItem == null ? 0 : schemeStat$TypeSuperappWidgetItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow = this.typeVideoGroupLiveBlockCardShow;
        int hashCode14 = (hashCode13 + (mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.hashCode())) * 31;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.typeMiniAppItem;
        int hashCode15 = (hashCode14 + (schemeStat$TypeMiniAppItem == null ? 0 : schemeStat$TypeMiniAppItem.hashCode())) * 31;
        CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = this.typeVideoCardEvent;
        int hashCode16 = (hashCode15 + (commonVideoStat$TypeVideoCardEvent == null ? 0 : commonVideoStat$TypeVideoCardEvent.hashCode())) * 31;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = this.typeMarketItem;
        int hashCode17 = (hashCode16 + (schemeStat$TypeMarketItem == null ? 0 : schemeStat$TypeMarketItem.hashCode())) * 31;
        SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = this.typeMarketMarketplaceItem;
        int hashCode18 = (hashCode17 + (schemeStat$TypeMarketMarketplaceItem == null ? 0 : schemeStat$TypeMarketMarketplaceItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem = this.typeAudioArtistViewItem;
        int hashCode19 = (hashCode18 + (commonAudioStat$TypeAudioArtistViewItem == null ? 0 : commonAudioStat$TypeAudioArtistViewItem.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeGameAppView mobileOfficialAppsMiniappsStat$TypeGameAppView = this.typeGameAppView;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsMiniappsStat$TypeGameAppView == null ? 0 : mobileOfficialAppsMiniappsStat$TypeGameAppView.hashCode())) * 31;
        SchemeStat$TypeClassifiedsView schemeStat$TypeClassifiedsView = this.typeClassifiedsView;
        int hashCode21 = (hashCode20 + (schemeStat$TypeClassifiedsView == null ? 0 : schemeStat$TypeClassifiedsView.hashCode())) * 31;
        SchemeStat$TypeAliexpressView schemeStat$TypeAliexpressView = this.typeAliexpressView;
        int hashCode22 = (hashCode21 + (schemeStat$TypeAliexpressView == null ? 0 : schemeStat$TypeAliexpressView.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem = this.typeMarusiaConversationItem;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsMarusiaStat$TypeConversationItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeConversationItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem = this.typeMarusiaReadingItem;
        int hashCode24 = (hashCode23 + (mobileOfficialAppsMarusiaStat$TypeReadingItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeReadingItem.hashCode())) * 31;
        SchemeStat$TypeFeedItem schemeStat$TypeFeedItem = this.typeFeedItem;
        int hashCode25 = (hashCode24 + (schemeStat$TypeFeedItem == null ? 0 : schemeStat$TypeFeedItem.hashCode())) * 31;
        c0 c0Var = this.typeFriendEntrypointBlockItem;
        int hashCode26 = (hashCode25 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedItemScreenView mobileOfficialAppsFeedStat$TypeFeedItemScreenView = this.typeFeedItemScreenView;
        int hashCode27 = (hashCode26 + (mobileOfficialAppsFeedStat$TypeFeedItemScreenView == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedItemScreenView.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView = this.typeFeedCarouselOnboardingView;
        int hashCode28 = (hashCode27 + (mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView.a.hashCode())) * 31;
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = this.typeGameCatalogItem;
        int hashCode29 = (hashCode28 + (schemeStat$TypeGameCatalogItem == null ? 0 : schemeStat$TypeGameCatalogItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketView mobileOfficialAppsMarketStat$TypeMarketView = this.typeMarketView;
        int hashCode30 = (hashCode29 + (mobileOfficialAppsMarketStat$TypeMarketView == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketView.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImConversationBannerView mobileOfficialAppsImStat$TypeImConversationBannerView = this.typeImConversationBannerView;
        int hashCode31 = (hashCode30 + (mobileOfficialAppsImStat$TypeImConversationBannerView == null ? 0 : mobileOfficialAppsImStat$TypeImConversationBannerView.hashCode())) * 31;
        CommonMarketStat$TypeRatingView commonMarketStat$TypeRatingView = this.typeRatingView;
        int hashCode32 = (hashCode31 + (commonMarketStat$TypeRatingView == null ? 0 : commonMarketStat$TypeRatingView.hashCode())) * 31;
        CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem = this.typeAudioDomainEventItem;
        int hashCode33 = (hashCode32 + (commonAudioStat$TypeAudioDomainEventItem == null ? 0 : commonAudioStat$TypeAudioDomainEventItem.hashCode())) * 31;
        u uVar = this.typePopupReviewShow;
        int hashCode34 = (hashCode33 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        CommonVideoStat$TypeVideoMusicTrackAddLogIn commonVideoStat$TypeVideoMusicTrackAddLogIn = this.typeVideoMusicTrackAddLogIn;
        int hashCode35 = (hashCode34 + (commonVideoStat$TypeVideoMusicTrackAddLogIn == null ? 0 : commonVideoStat$TypeVideoMusicTrackAddLogIn.hashCode())) * 31;
        CommonVideoStat$TypeVideoMusicTrackAddSuccess commonVideoStat$TypeVideoMusicTrackAddSuccess = this.typeVideoMusicTrackAddSuccess;
        int hashCode36 = (hashCode35 + (commonVideoStat$TypeVideoMusicTrackAddSuccess == null ? 0 : commonVideoStat$TypeVideoMusicTrackAddSuccess.hashCode())) * 31;
        CommonVideoStat$TypeVideoPlayerMusicTrackView commonVideoStat$TypeVideoPlayerMusicTrackView = this.typeVideoPlayerMusicTrackView;
        int hashCode37 = (hashCode36 + (commonVideoStat$TypeVideoPlayerMusicTrackView == null ? 0 : commonVideoStat$TypeVideoPlayerMusicTrackView.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView = this.typeClipsDeepfakeTemplatesView;
        int hashCode38 = (hashCode37 + (mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeDonutWallBlockView mobileOfficialAppsFeedStat$TypeDonutWallBlockView = this.typeDonutWallBlockView;
        int hashCode39 = (hashCode38 + (mobileOfficialAppsFeedStat$TypeDonutWallBlockView == null ? 0 : mobileOfficialAppsFeedStat$TypeDonutWallBlockView.hashCode())) * 31;
        CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem = this.typeBadgesScreenItem;
        int hashCode40 = (hashCode39 + (commonVasStat$TypeBadgesScreenItem == null ? 0 : commonVasStat$TypeBadgesScreenItem.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeDzenBlockArticleView mobileOfficialAppsFeedStat$TypeDzenBlockArticleView = this.typeDzenBlockArticleView;
        int hashCode41 = (hashCode40 + (mobileOfficialAppsFeedStat$TypeDzenBlockArticleView == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenBlockArticleView.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeDzenStoryView mobileOfficialAppsFeedStat$TypeDzenStoryView = this.typeDzenStoryView;
        int hashCode42 = (hashCode41 + (mobileOfficialAppsFeedStat$TypeDzenStoryView == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenStoryView.a.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeDzenStoryItemView mobileOfficialAppsFeedStat$TypeDzenStoryItemView = this.typeDzenStoryItemView;
        int hashCode43 = (hashCode42 + (mobileOfficialAppsFeedStat$TypeDzenStoryItemView == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenStoryItemView.a.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingView commonCommunitiesStat$TypeCommunityOnboardingView = this.typeCommunityOnboardingView;
        int hashCode44 = (hashCode43 + (commonCommunitiesStat$TypeCommunityOnboardingView == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingView.hashCode())) * 31;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView = this.typeFollowersModeOnboardingEntrypointView;
        int hashCode45 = (hashCode44 + (mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView == null ? 0 : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView.hashCode())) * 31;
        CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView = this.typeCatalogItemView;
        int hashCode46 = (hashCode45 + (commonCatalogStat$TypeCatalogItemView == null ? 0 : commonCatalogStat$TypeCatalogItemView.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime = this.typeFeedMrcViewPostTime;
        int hashCode47 = (hashCode46 + (mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime.hashCode())) * 31;
        CommonMarketStat$TypeMarketItemReviewView commonMarketStat$TypeMarketItemReviewView = this.typeMarketItemReviewView;
        int hashCode48 = (hashCode47 + (commonMarketStat$TypeMarketItemReviewView == null ? 0 : commonMarketStat$TypeMarketItemReviewView.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityReviewView commonCommunitiesStat$TypeCommunityReviewView = this.typeCommunityReviewView;
        int hashCode49 = (hashCode48 + (commonCommunitiesStat$TypeCommunityReviewView == null ? 0 : commonCommunitiesStat$TypeCommunityReviewView.hashCode())) * 31;
        MobileOfficialAppsEcommStat$TypeBannerView mobileOfficialAppsEcommStat$TypeBannerView = this.typeBannerView;
        int hashCode50 = (hashCode49 + (mobileOfficialAppsEcommStat$TypeBannerView == null ? 0 : mobileOfficialAppsEcommStat$TypeBannerView.hashCode())) * 31;
        CommonEcommStat$TypeEcommViewItem commonEcommStat$TypeEcommViewItem = this.typeEcommView;
        int hashCode51 = (hashCode50 + (commonEcommStat$TypeEcommViewItem == null ? 0 : commonEcommStat$TypeEcommViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketCommunityReviewView commonMarketStat$TypeMarketCommunityReviewView = this.typeMarketCommunityReviewView;
        int hashCode52 = (hashCode51 + (commonMarketStat$TypeMarketCommunityReviewView == null ? 0 : commonMarketStat$TypeMarketCommunityReviewView.hashCode())) * 31;
        CommonVasStat$TypeIvasItemViews commonVasStat$TypeIvasItemViews = this.typeIvasItemViews;
        int hashCode53 = (hashCode52 + (commonVasStat$TypeIvasItemViews == null ? 0 : commonVasStat$TypeIvasItemViews.hashCode())) * 31;
        SchemeStat$TypeLegalNoticeView schemeStat$TypeLegalNoticeView = this.typeLegalNoticeView;
        int hashCode54 = (hashCode53 + (schemeStat$TypeLegalNoticeView == null ? 0 : schemeStat$TypeLegalNoticeView.hashCode())) * 31;
        CommonCommunitiesStat$TypeTabItemView commonCommunitiesStat$TypeTabItemView = this.typeCommunityTabItemView;
        int hashCode55 = (hashCode54 + (commonCommunitiesStat$TypeTabItemView == null ? 0 : commonCommunitiesStat$TypeTabItemView.hashCode())) * 31;
        CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal = this.typeDonutGoalView;
        int hashCode56 = (hashCode55 + (commonCommunitiesStat$TypeDonutGoal == null ? 0 : commonCommunitiesStat$TypeDonutGoal.hashCode())) * 31;
        CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner = this.typeDonutBannerView;
        int hashCode57 = (hashCode56 + (commonCommunitiesStat$TypeDonutBanner == null ? 0 : commonCommunitiesStat$TypeDonutBanner.hashCode())) * 31;
        MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView = this.typeSharingButtonAnimatedView;
        int hashCode58 = (hashCode57 + (mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView == null ? 0 : mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView.hashCode())) * 31;
        MobileOfficialAppsPromoStat$TypePromoViewItem mobileOfficialAppsPromoStat$TypePromoViewItem = this.typePromoViewItem;
        int hashCode59 = (hashCode58 + (mobileOfficialAppsPromoStat$TypePromoViewItem == null ? 0 : mobileOfficialAppsPromoStat$TypePromoViewItem.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImOpenInvitationCardItem mobileOfficialAppsImStat$TypeImOpenInvitationCardItem = this.typeImOpenInvitationCardItem;
        int hashCode60 = (hashCode59 + (mobileOfficialAppsImStat$TypeImOpenInvitationCardItem == null ? 0 : mobileOfficialAppsImStat$TypeImOpenInvitationCardItem.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem = this.typeImMaxTransitionBannerItem;
        int hashCode61 = (hashCode60 + (mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem == null ? 0 : mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem.hashCode())) * 31;
        CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent = this.typeOnboardingEvent;
        int hashCode62 = (hashCode61 + (commonOnboardingStat$TypeOnboardingEvent == null ? 0 : commonOnboardingStat$TypeOnboardingEvent.hashCode())) * 31;
        MobileOfficialAppsNotificationsStat$TypeNotificationViews mobileOfficialAppsNotificationsStat$TypeNotificationViews = this.typeNotificationViews;
        int hashCode63 = (hashCode62 + (mobileOfficialAppsNotificationsStat$TypeNotificationViews == null ? 0 : mobileOfficialAppsNotificationsStat$TypeNotificationViews.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView = this.typeTvKidModeOnboardingView;
        int hashCode64 = (hashCode63 + (mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView == null ? 0 : mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction = this.typeTvQrModalAction;
        int hashCode65 = (hashCode64 + (mobileOfficialAppsVideoStat$TypeTvQrModalAction == null ? 0 : mobileOfficialAppsVideoStat$TypeTvQrModalAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView = this.typeMoveYoutubeSubsOnboardingView;
        int hashCode66 = (hashCode65 + (mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView == null ? 0 : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowInlineComment mobileOfficialAppsFeedStat$TypeFeedShowInlineComment = this.typeFeedShowInlineComment;
        int hashCode67 = (hashCode66 + (mobileOfficialAppsFeedStat$TypeFeedShowInlineComment == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowInlineComment.hashCode())) * 31;
        b0 b0Var = this.typeFeedShowInlineCommentInput;
        int hashCode68 = (hashCode67 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowIconComment mobileOfficialAppsFeedStat$TypeFeedShowIconComment = this.typeFeedShowIconComment;
        int hashCode69 = (hashCode68 + (mobileOfficialAppsFeedStat$TypeFeedShowIconComment == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowIconComment.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText = this.typeFeedShowFriendsLikesText;
        int hashCode70 = (hashCode69 + (mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon = this.typeFeedShowFriendsLikesIcon;
        int hashCode71 = (hashCode70 + (mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView = this.typeTvKidProfileOnboardingView;
        int hashCode72 = (hashCode71 + (mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView == null ? 0 : mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView = this.typeVideoCatalogWarmupView;
        int hashCode73 = (hashCode72 + (mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoChildProfileViews mobileOfficialAppsVideoStat$TypeVideoChildProfileViews = this.typeVideoChildProfileViews;
        int hashCode74 = (hashCode73 + (mobileOfficialAppsVideoStat$TypeVideoChildProfileViews == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoChildProfileViews.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedImageLoading mobileOfficialAppsFeedStat$TypeFeedImageLoading = this.typeFeedImageLoading;
        int hashCode75 = (hashCode74 + (mobileOfficialAppsFeedStat$TypeFeedImageLoading == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedImageLoading.hashCode())) * 31;
        i0 i0Var = this.idfaPermissionScreenShow;
        int hashCode76 = (hashCode75 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        f0 f0Var = this.typeCommunitySportBlockVideoLiveView;
        int hashCode77 = (hashCode76 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        MobileOfficialAppsCallsStat$TypeVoipMaxAppView mobileOfficialAppsCallsStat$TypeVoipMaxAppView = this.typeVoipMaxAppView;
        int hashCode78 = (hashCode77 + (mobileOfficialAppsCallsStat$TypeVoipMaxAppView == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipMaxAppView.hashCode())) * 31;
        CommonVideoStat$TypeVideoContentWarningModalView commonVideoStat$TypeVideoContentWarningModalView = this.typeVideoContentWarningModalView;
        int hashCode79 = (hashCode78 + (commonVideoStat$TypeVideoContentWarningModalView == null ? 0 : commonVideoStat$TypeVideoContentWarningModalView.hashCode())) * 31;
        CommonVideoStat$TypeVideoAdultMarkNotificationView commonVideoStat$TypeVideoAdultMarkNotificationView = this.typeVideoAdultMarkNotificationView;
        int hashCode80 = (hashCode79 + (commonVideoStat$TypeVideoAdultMarkNotificationView == null ? 0 : commonVideoStat$TypeVideoAdultMarkNotificationView.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView = this.typeCommunitiesOzonInviteBannerAdbView;
        int hashCode81 = (hashCode80 + (commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView == null ? 0 : commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView.hashCode())) * 31;
        MobileOfficialAppsAdsStat$TypeFeedSdkAdView mobileOfficialAppsAdsStat$TypeFeedSdkAdView = this.typeFeedSdkAdView;
        int hashCode82 = (hashCode81 + (mobileOfficialAppsAdsStat$TypeFeedSdkAdView == null ? 0 : mobileOfficialAppsAdsStat$TypeFeedSdkAdView.hashCode())) * 31;
        SchemeStat$TypeChannelItem schemeStat$TypeChannelItem = this.typeChannelItem;
        int hashCode83 = (hashCode82 + (schemeStat$TypeChannelItem == null ? 0 : schemeStat$TypeChannelItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityScreenLoadErrorView commonCommunitiesStat$TypeCommunityScreenLoadErrorView = this.typeCommunityScreenLoadErrorView;
        int hashCode84 = (hashCode83 + (commonCommunitiesStat$TypeCommunityScreenLoadErrorView == null ? 0 : commonCommunitiesStat$TypeCommunityScreenLoadErrorView.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView = this.typeCommunityScreenTabLoadErrorView;
        int hashCode85 = (hashCode84 + (commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView == null ? 0 : commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView.hashCode())) * 31;
        CommonVideoStat$TypePageShow commonVideoStat$TypePageShow = this.typePageShow;
        int hashCode86 = (hashCode85 + (commonVideoStat$TypePageShow == null ? 0 : commonVideoStat$TypePageShow.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = this.typeSuperappVkvideoBanner;
        int hashCode87 = (hashCode86 + (mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner == null ? 0 : mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding = this.typeVideoAuthorOnboarding;
        int hashCode88 = (hashCode87 + (mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeInstallVkvideoModal mobileOfficialAppsVideoStat$TypeInstallVkvideoModal = this.typeInstallVkvideoModal;
        int hashCode89 = (hashCode88 + (mobileOfficialAppsVideoStat$TypeInstallVkvideoModal == null ? 0 : mobileOfficialAppsVideoStat$TypeInstallVkvideoModal.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent = this.typeVideoOfflineSnackbarView;
        int hashCode90 = (hashCode89 + (mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesView commonCommunitiesStat$TypeCommunitiesView = this.typeCommunitiesView;
        int hashCode91 = (hashCode90 + (commonCommunitiesStat$TypeCommunitiesView == null ? 0 : commonCommunitiesStat$TypeCommunitiesView.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesTrustMarksView commonCommunitiesStat$TypeCommunitiesTrustMarksView = this.typeCommunitiesTrustMarksView;
        int hashCode92 = (hashCode91 + (commonCommunitiesStat$TypeCommunitiesTrustMarksView == null ? 0 : commonCommunitiesStat$TypeCommunitiesTrustMarksView.hashCode())) * 31;
        CommonVideoStat$TypeVideoCommentsView commonVideoStat$TypeVideoCommentsView = this.typeVideoCommentsView;
        int hashCode93 = (hashCode92 + (commonVideoStat$TypeVideoCommentsView == null ? 0 : commonVideoStat$TypeVideoCommentsView.hashCode())) * 31;
        CommonWallStat$TypeWallCommentsView commonWallStat$TypeWallCommentsView = this.typeWallCommentsView;
        int hashCode94 = (hashCode93 + (commonWallStat$TypeWallCommentsView == null ? 0 : commonWallStat$TypeWallCommentsView.hashCode())) * 31;
        CommonAudioStat$TypeAudioRestrictionPopup commonAudioStat$TypeAudioRestrictionPopup = this.typeAudioRestrictionPopup;
        int hashCode95 = (hashCode94 + (commonAudioStat$TypeAudioRestrictionPopup == null ? 0 : commonAudioStat$TypeAudioRestrictionPopup.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression = this.typeOverlayLiveProductCardImpression;
        int hashCode96 = (hashCode95 + (mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression == null ? 0 : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression.hashCode())) * 31;
        CommonVideoStat$TypeVideoAssistantShow commonVideoStat$TypeVideoAssistantShow = this.typeVideoAssistantShow;
        int hashCode97 = (hashCode96 + (commonVideoStat$TypeVideoAssistantShow == null ? 0 : commonVideoStat$TypeVideoAssistantShow.hashCode())) * 31;
        CommonAudioStat$TypeAudioModal commonAudioStat$TypeAudioModal = this.typeAudioModal;
        int hashCode98 = (hashCode97 + (commonAudioStat$TypeAudioModal == null ? 0 : commonAudioStat$TypeAudioModal.hashCode())) * 31;
        CommonVideoStat$TypeVideoAssistantLoaderShow commonVideoStat$TypeVideoAssistantLoaderShow = this.typeVideoAssistantLoaderShow;
        int hashCode99 = (hashCode98 + (commonVideoStat$TypeVideoAssistantLoaderShow == null ? 0 : commonVideoStat$TypeVideoAssistantLoaderShow.hashCode())) * 31;
        CommonVideoStat$TypeVideoAssistantMessageDoneShow commonVideoStat$TypeVideoAssistantMessageDoneShow = this.typeVideoAssistantMessageDoneShow;
        return hashCode99 + (commonVideoStat$TypeVideoAssistantMessageDoneShow != null ? commonVideoStat$TypeVideoAssistantMessageDoneShow.hashCode() : 0);
    }

    public final String toString() {
        return "TypeView(item=" + this.item + ", startView=" + this.startView + ", endView=" + this.endView + ", position=" + this.position + ", type=" + this.type + ", typeVideoAdSubscriptionOfferShow=" + this.typeVideoAdSubscriptionOfferShow + ", typeVideoAdShow=" + this.typeVideoAdShow + ", typeVideoAdTrialShow=" + this.typeVideoAdTrialShow + ", typeShowCastConnectOfferModal=" + this.typeShowCastConnectOfferModal + ", typeVideoInfoAboutDrugView=" + this.typeVideoInfoAboutDrugView + ", typeAdsBottomBanner=" + this.typeAdsBottomBanner + ", typeClipsGoToAttachedVideoButtonShow=" + this.typeClipsGoToAttachedVideoButtonShow + ", typeAudioLongtapItem=" + this.typeAudioLongtapItem + ", typeAudioPopupItem=" + this.typeAudioPopupItem + ", typeSuperappSectionItem=" + this.typeSuperappSectionItem + ", typeSuperappWidgetItem=" + this.typeSuperappWidgetItem + ", typeVideoGroupLiveBlockCardShow=" + this.typeVideoGroupLiveBlockCardShow + ", typeMiniAppItem=" + this.typeMiniAppItem + ", typeVideoCardEvent=" + this.typeVideoCardEvent + ", typeMarketItem=" + this.typeMarketItem + ", typeMarketMarketplaceItem=" + this.typeMarketMarketplaceItem + ", typeAudioArtistViewItem=" + this.typeAudioArtistViewItem + ", typeGameAppView=" + this.typeGameAppView + ", typeClassifiedsView=" + this.typeClassifiedsView + ", typeAliexpressView=" + this.typeAliexpressView + ", typeMarusiaConversationItem=" + this.typeMarusiaConversationItem + ", typeMarusiaReadingItem=" + this.typeMarusiaReadingItem + ", typeFeedItem=" + this.typeFeedItem + ", typeFriendEntrypointBlockItem=" + this.typeFriendEntrypointBlockItem + ", typeFeedItemScreenView=" + this.typeFeedItemScreenView + ", typeFeedCarouselOnboardingView=" + this.typeFeedCarouselOnboardingView + ", typeGameCatalogItem=" + this.typeGameCatalogItem + ", typeMarketView=" + this.typeMarketView + ", typeImConversationBannerView=" + this.typeImConversationBannerView + ", typeRatingView=" + this.typeRatingView + ", typeAudioDomainEventItem=" + this.typeAudioDomainEventItem + ", typePopupReviewShow=" + this.typePopupReviewShow + ", typeVideoMusicTrackAddLogIn=" + this.typeVideoMusicTrackAddLogIn + ", typeVideoMusicTrackAddSuccess=" + this.typeVideoMusicTrackAddSuccess + ", typeVideoPlayerMusicTrackView=" + this.typeVideoPlayerMusicTrackView + ", typeClipsDeepfakeTemplatesView=" + this.typeClipsDeepfakeTemplatesView + ", typeDonutWallBlockView=" + this.typeDonutWallBlockView + ", typeBadgesScreenItem=" + this.typeBadgesScreenItem + ", typeDzenBlockArticleView=" + this.typeDzenBlockArticleView + ", typeDzenStoryView=" + this.typeDzenStoryView + ", typeDzenStoryItemView=" + this.typeDzenStoryItemView + ", typeCommunityOnboardingView=" + this.typeCommunityOnboardingView + ", typeFollowersModeOnboardingEntrypointView=" + this.typeFollowersModeOnboardingEntrypointView + ", typeCatalogItemView=" + this.typeCatalogItemView + ", typeFeedMrcViewPostTime=" + this.typeFeedMrcViewPostTime + ", typeMarketItemReviewView=" + this.typeMarketItemReviewView + ", typeCommunityReviewView=" + this.typeCommunityReviewView + ", typeBannerView=" + this.typeBannerView + ", typeEcommView=" + this.typeEcommView + ", typeMarketCommunityReviewView=" + this.typeMarketCommunityReviewView + ", typeIvasItemViews=" + this.typeIvasItemViews + ", typeLegalNoticeView=" + this.typeLegalNoticeView + ", typeCommunityTabItemView=" + this.typeCommunityTabItemView + ", typeDonutGoalView=" + this.typeDonutGoalView + ", typeDonutBannerView=" + this.typeDonutBannerView + ", typeSharingButtonAnimatedView=" + this.typeSharingButtonAnimatedView + ", typePromoViewItem=" + this.typePromoViewItem + ", typeImOpenInvitationCardItem=" + this.typeImOpenInvitationCardItem + ", typeImMaxTransitionBannerItem=" + this.typeImMaxTransitionBannerItem + ", typeOnboardingEvent=" + this.typeOnboardingEvent + ", typeNotificationViews=" + this.typeNotificationViews + ", typeTvKidModeOnboardingView=" + this.typeTvKidModeOnboardingView + ", typeTvQrModalAction=" + this.typeTvQrModalAction + ", typeMoveYoutubeSubsOnboardingView=" + this.typeMoveYoutubeSubsOnboardingView + ", typeFeedShowInlineComment=" + this.typeFeedShowInlineComment + ", typeFeedShowInlineCommentInput=" + this.typeFeedShowInlineCommentInput + ", typeFeedShowIconComment=" + this.typeFeedShowIconComment + ", typeFeedShowFriendsLikesText=" + this.typeFeedShowFriendsLikesText + ", typeFeedShowFriendsLikesIcon=" + this.typeFeedShowFriendsLikesIcon + ", typeTvKidProfileOnboardingView=" + this.typeTvKidProfileOnboardingView + ", typeVideoCatalogWarmupView=" + this.typeVideoCatalogWarmupView + ", typeVideoChildProfileViews=" + this.typeVideoChildProfileViews + ", typeFeedImageLoading=" + this.typeFeedImageLoading + ", idfaPermissionScreenShow=" + this.idfaPermissionScreenShow + ", typeCommunitySportBlockVideoLiveView=" + this.typeCommunitySportBlockVideoLiveView + ", typeVoipMaxAppView=" + this.typeVoipMaxAppView + ", typeVideoContentWarningModalView=" + this.typeVideoContentWarningModalView + ", typeVideoAdultMarkNotificationView=" + this.typeVideoAdultMarkNotificationView + ", typeCommunitiesOzonInviteBannerAdbView=" + this.typeCommunitiesOzonInviteBannerAdbView + ", typeFeedSdkAdView=" + this.typeFeedSdkAdView + ", typeChannelItem=" + this.typeChannelItem + ", typeCommunityScreenLoadErrorView=" + this.typeCommunityScreenLoadErrorView + ", typeCommunityScreenTabLoadErrorView=" + this.typeCommunityScreenTabLoadErrorView + ", typePageShow=" + this.typePageShow + ", typeSuperappVkvideoBanner=" + this.typeSuperappVkvideoBanner + ", typeVideoAuthorOnboarding=" + this.typeVideoAuthorOnboarding + ", typeInstallVkvideoModal=" + this.typeInstallVkvideoModal + ", typeVideoOfflineSnackbarView=" + this.typeVideoOfflineSnackbarView + ", typeCommunitiesView=" + this.typeCommunitiesView + ", typeCommunitiesTrustMarksView=" + this.typeCommunitiesTrustMarksView + ", typeVideoCommentsView=" + this.typeVideoCommentsView + ", typeWallCommentsView=" + this.typeWallCommentsView + ", typeAudioRestrictionPopup=" + this.typeAudioRestrictionPopup + ", typeOverlayLiveProductCardImpression=" + this.typeOverlayLiveProductCardImpression + ", typeVideoAssistantShow=" + this.typeVideoAssistantShow + ", typeAudioModal=" + this.typeAudioModal + ", typeVideoAssistantLoaderShow=" + this.typeVideoAssistantLoaderShow + ", typeVideoAssistantMessageDoneShow=" + this.typeVideoAssistantMessageDoneShow + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SchemeStat$TypeView(SchemeStat$EventItem schemeStat$EventItem, String str, String str2, Integer num, Type type, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow, MobileOfficialAppsVideoStat$TypeVideoAdShow mobileOfficialAppsVideoStat$TypeVideoAdShow, MobileOfficialAppsVideoStat$TypeVideoAdTrialShow mobileOfficialAppsVideoStat$TypeVideoAdTrialShow, MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal, MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView, MobileOfficialAppsVideoStat$TypeAdsBottomBanner mobileOfficialAppsVideoStat$TypeAdsBottomBanner, MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow, CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem, CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem, SchemeStat$TypeSuperappSectionItem schemeStat$TypeSuperappSectionItem, SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem, MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem, MobileOfficialAppsMiniappsStat$TypeGameAppView mobileOfficialAppsMiniappsStat$TypeGameAppView, SchemeStat$TypeClassifiedsView schemeStat$TypeClassifiedsView, SchemeStat$TypeAliexpressView schemeStat$TypeAliexpressView, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem, SchemeStat$TypeFeedItem schemeStat$TypeFeedItem, c0 c0Var, MobileOfficialAppsFeedStat$TypeFeedItemScreenView mobileOfficialAppsFeedStat$TypeFeedItemScreenView, MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem, MobileOfficialAppsMarketStat$TypeMarketView mobileOfficialAppsMarketStat$TypeMarketView, MobileOfficialAppsImStat$TypeImConversationBannerView mobileOfficialAppsImStat$TypeImConversationBannerView, CommonMarketStat$TypeRatingView commonMarketStat$TypeRatingView, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, u uVar, CommonVideoStat$TypeVideoMusicTrackAddLogIn commonVideoStat$TypeVideoMusicTrackAddLogIn, CommonVideoStat$TypeVideoMusicTrackAddSuccess commonVideoStat$TypeVideoMusicTrackAddSuccess, CommonVideoStat$TypeVideoPlayerMusicTrackView commonVideoStat$TypeVideoPlayerMusicTrackView, MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView, MobileOfficialAppsFeedStat$TypeDonutWallBlockView mobileOfficialAppsFeedStat$TypeDonutWallBlockView, CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem, MobileOfficialAppsFeedStat$TypeDzenBlockArticleView mobileOfficialAppsFeedStat$TypeDzenBlockArticleView, MobileOfficialAppsFeedStat$TypeDzenStoryView mobileOfficialAppsFeedStat$TypeDzenStoryView, MobileOfficialAppsFeedStat$TypeDzenStoryItemView mobileOfficialAppsFeedStat$TypeDzenStoryItemView, CommonCommunitiesStat$TypeCommunityOnboardingView commonCommunitiesStat$TypeCommunityOnboardingView, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView, CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView, MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime, CommonMarketStat$TypeMarketItemReviewView commonMarketStat$TypeMarketItemReviewView, CommonCommunitiesStat$TypeCommunityReviewView commonCommunitiesStat$TypeCommunityReviewView, MobileOfficialAppsEcommStat$TypeBannerView mobileOfficialAppsEcommStat$TypeBannerView, CommonEcommStat$TypeEcommViewItem commonEcommStat$TypeEcommViewItem, CommonMarketStat$TypeMarketCommunityReviewView commonMarketStat$TypeMarketCommunityReviewView, CommonVasStat$TypeIvasItemViews commonVasStat$TypeIvasItemViews, SchemeStat$TypeLegalNoticeView schemeStat$TypeLegalNoticeView, CommonCommunitiesStat$TypeTabItemView commonCommunitiesStat$TypeTabItemView, CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal, CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner, MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView, MobileOfficialAppsPromoStat$TypePromoViewItem mobileOfficialAppsPromoStat$TypePromoViewItem, MobileOfficialAppsImStat$TypeImOpenInvitationCardItem mobileOfficialAppsImStat$TypeImOpenInvitationCardItem, MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem, CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent, MobileOfficialAppsNotificationsStat$TypeNotificationViews mobileOfficialAppsNotificationsStat$TypeNotificationViews, MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView, MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView, MobileOfficialAppsFeedStat$TypeFeedShowInlineComment mobileOfficialAppsFeedStat$TypeFeedShowInlineComment, b0 b0Var, MobileOfficialAppsFeedStat$TypeFeedShowIconComment mobileOfficialAppsFeedStat$TypeFeedShowIconComment, MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText, MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon, MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView, MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView, MobileOfficialAppsVideoStat$TypeVideoChildProfileViews mobileOfficialAppsVideoStat$TypeVideoChildProfileViews, MobileOfficialAppsFeedStat$TypeFeedImageLoading mobileOfficialAppsFeedStat$TypeFeedImageLoading, i0 i0Var, f0 f0Var, MobileOfficialAppsCallsStat$TypeVoipMaxAppView mobileOfficialAppsCallsStat$TypeVoipMaxAppView, CommonVideoStat$TypeVideoContentWarningModalView commonVideoStat$TypeVideoContentWarningModalView, CommonVideoStat$TypeVideoAdultMarkNotificationView commonVideoStat$TypeVideoAdultMarkNotificationView, CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView, MobileOfficialAppsAdsStat$TypeFeedSdkAdView mobileOfficialAppsAdsStat$TypeFeedSdkAdView, SchemeStat$TypeChannelItem schemeStat$TypeChannelItem, CommonCommunitiesStat$TypeCommunityScreenLoadErrorView commonCommunitiesStat$TypeCommunityScreenLoadErrorView, CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView, CommonVideoStat$TypePageShow commonVideoStat$TypePageShow, MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, MobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding, MobileOfficialAppsVideoStat$TypeInstallVkvideoModal mobileOfficialAppsVideoStat$TypeInstallVkvideoModal, MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent, CommonCommunitiesStat$TypeCommunitiesView commonCommunitiesStat$TypeCommunitiesView, CommonCommunitiesStat$TypeCommunitiesTrustMarksView commonCommunitiesStat$TypeCommunitiesTrustMarksView, CommonVideoStat$TypeVideoCommentsView commonVideoStat$TypeVideoCommentsView, CommonWallStat$TypeWallCommentsView commonWallStat$TypeWallCommentsView, CommonAudioStat$TypeAudioRestrictionPopup commonAudioStat$TypeAudioRestrictionPopup, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression, CommonVideoStat$TypeVideoAssistantShow commonVideoStat$TypeVideoAssistantShow, CommonAudioStat$TypeAudioModal commonAudioStat$TypeAudioModal, CommonVideoStat$TypeVideoAssistantLoaderShow commonVideoStat$TypeVideoAssistantLoaderShow, CommonVideoStat$TypeVideoAssistantMessageDoneShow commonVideoStat$TypeVideoAssistantMessageDoneShow, int i, int i2, int i3, int i4, zcl zclVar) {
        this(schemeStat$EventItem, str, str2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r0, (i2 & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketView, (i2 & 2) != 0 ? null : mobileOfficialAppsImStat$TypeImConversationBannerView, (i2 & 4) != 0 ? null : commonMarketStat$TypeRatingView, (i2 & 8) != 0 ? null : commonAudioStat$TypeAudioDomainEventItem, (i2 & 16) != 0 ? null : uVar, (i2 & 32) != 0 ? null : commonVideoStat$TypeVideoMusicTrackAddLogIn, (i2 & 64) != 0 ? null : commonVideoStat$TypeVideoMusicTrackAddSuccess, (i2 & 128) != 0 ? null : commonVideoStat$TypeVideoPlayerMusicTrackView, (i2 & 256) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView, (i2 & 512) != 0 ? null : mobileOfficialAppsFeedStat$TypeDonutWallBlockView, (i2 & 1024) != 0 ? null : commonVasStat$TypeBadgesScreenItem, (i2 & 2048) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenBlockArticleView, (i2 & 4096) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenStoryView, (i2 & 8192) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenStoryItemView, (i2 & 16384) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingView, (i2 & 32768) != 0 ? null : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView, (i2 & 65536) != 0 ? null : commonCatalogStat$TypeCatalogItemView, (i2 & 131072) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonMarketStat$TypeMarketItemReviewView, (i2 & 524288) != 0 ? null : commonCommunitiesStat$TypeCommunityReviewView, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsEcommStat$TypeBannerView, (i2 & 2097152) != 0 ? null : commonEcommStat$TypeEcommViewItem, (i2 & 4194304) != 0 ? null : commonMarketStat$TypeMarketCommunityReviewView, (i2 & 8388608) != 0 ? null : commonVasStat$TypeIvasItemViews, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : schemeStat$TypeLegalNoticeView, (i2 & 33554432) != 0 ? null : commonCommunitiesStat$TypeTabItemView, (i2 & 67108864) != 0 ? null : commonCommunitiesStat$TypeDonutGoal, (i2 & 134217728) != 0 ? null : commonCommunitiesStat$TypeDonutBanner, (i2 & 268435456) != 0 ? null : mobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsPromoStat$TypePromoViewItem, (i2 & 1073741824) != 0 ? null : mobileOfficialAppsImStat$TypeImOpenInvitationCardItem, (i2 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem, (i3 & 1) != 0 ? null : commonOnboardingStat$TypeOnboardingEvent, (i3 & 2) != 0 ? null : mobileOfficialAppsNotificationsStat$TypeNotificationViews, (i3 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView, (i3 & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvQrModalAction, (i3 & 16) != 0 ? null : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingView, (i3 & 32) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowInlineComment, (i3 & 64) != 0 ? null : b0Var, (i3 & 128) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowIconComment, (i3 & 256) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText, (i3 & 512) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon, (i3 & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView, (i3 & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupView, (i3 & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoChildProfileViews, (i3 & 8192) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedImageLoading, (i3 & 16384) != 0 ? null : i0Var, (i3 & 32768) != 0 ? null : f0Var, (i3 & 65536) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipMaxAppView, (i3 & 131072) != 0 ? null : commonVideoStat$TypeVideoContentWarningModalView, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonVideoStat$TypeVideoAdultMarkNotificationView, (i3 & 524288) != 0 ? null : commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsAdsStat$TypeFeedSdkAdView, (i3 & 2097152) != 0 ? null : schemeStat$TypeChannelItem, (i3 & 4194304) != 0 ? null : commonCommunitiesStat$TypeCommunityScreenLoadErrorView, (i3 & 8388608) != 0 ? null : commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonVideoStat$TypePageShow, (i3 & 33554432) != 0 ? null : mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, (i3 & 67108864) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAuthorOnboarding, (i3 & 134217728) != 0 ? null : mobileOfficialAppsVideoStat$TypeInstallVkvideoModal, (i3 & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonCommunitiesStat$TypeCommunitiesView, (i3 & 1073741824) != 0 ? null : commonCommunitiesStat$TypeCommunitiesTrustMarksView, (i3 & Integer.MIN_VALUE) != 0 ? null : commonVideoStat$TypeVideoCommentsView, (i4 & 1) != 0 ? null : commonWallStat$TypeWallCommentsView, (i4 & 2) != 0 ? null : commonAudioStat$TypeAudioRestrictionPopup, (i4 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression, (i4 & 8) != 0 ? null : commonVideoStat$TypeVideoAssistantShow, (i4 & 16) != 0 ? null : commonAudioStat$TypeAudioModal, (i4 & 32) != 0 ? null : commonVideoStat$TypeVideoAssistantLoaderShow, (i4 & 64) != 0 ? null : commonVideoStat$TypeVideoAssistantMessageDoneShow);
        Integer num2 = (i & 8) != 0 ? null : num;
        Type type2 = (i & 16) != 0 ? null : type;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow2 = (i & 32) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow;
        MobileOfficialAppsVideoStat$TypeVideoAdShow mobileOfficialAppsVideoStat$TypeVideoAdShow2 = (i & 64) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdShow;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialShow mobileOfficialAppsVideoStat$TypeVideoAdTrialShow2 = (i & 128) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdTrialShow;
        MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal2 = (i & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal;
        MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView2 = (i & 512) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView;
        MobileOfficialAppsVideoStat$TypeAdsBottomBanner mobileOfficialAppsVideoStat$TypeAdsBottomBanner2 = (i & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeAdsBottomBanner;
        MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow2 = (i & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow;
        CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem2 = (i & 4096) != 0 ? null : commonAudioStat$TypeAudioLongtapItem;
        CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem2 = (i & 8192) != 0 ? null : commonAudioStat$TypeAudioPopupItem;
        SchemeStat$TypeSuperappSectionItem schemeStat$TypeSuperappSectionItem2 = (i & 16384) != 0 ? null : schemeStat$TypeSuperappSectionItem;
        SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem2 = (i & 32768) != 0 ? null : schemeStat$TypeSuperappWidgetItem;
        MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow2 = (i & 65536) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem2 = (i & 131072) != 0 ? null : schemeStat$TypeMiniAppItem;
        CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonVideoStat$TypeVideoCardEvent;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem2 = (i & 524288) != 0 ? null : schemeStat$TypeMarketItem;
        SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : schemeStat$TypeMarketMarketplaceItem;
        CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem2 = (i & 2097152) != 0 ? null : commonAudioStat$TypeAudioArtistViewItem;
        MobileOfficialAppsMiniappsStat$TypeGameAppView mobileOfficialAppsMiniappsStat$TypeGameAppView2 = (i & 4194304) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeGameAppView;
        SchemeStat$TypeClassifiedsView schemeStat$TypeClassifiedsView2 = (i & 8388608) != 0 ? null : schemeStat$TypeClassifiedsView;
        SchemeStat$TypeAliexpressView schemeStat$TypeAliexpressView2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : schemeStat$TypeAliexpressView;
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem2 = (i & 33554432) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeConversationItem;
        MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem2 = (i & 67108864) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeReadingItem;
        SchemeStat$TypeFeedItem schemeStat$TypeFeedItem2 = (i & 134217728) != 0 ? null : schemeStat$TypeFeedItem;
        c0 c0Var2 = (i & 268435456) != 0 ? null : c0Var;
        MobileOfficialAppsFeedStat$TypeFeedItemScreenView mobileOfficialAppsFeedStat$TypeFeedItemScreenView2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedItemScreenView;
        MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView2 = (i & 1073741824) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingView;
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem2 = (i & Integer.MIN_VALUE) != 0 ? null : schemeStat$TypeGameCatalogItem;
    }
}
