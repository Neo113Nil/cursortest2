package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.base.version_info.VersionConstants;
import org.chromium.net.NetError;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAction implements SchemeStat$EventProductMain.b {

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final SchemeStat$EventItem item;

    @pmi0("previous_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen previousScreen;

    @pmi0("type")
    private final Type type;

    @pmi0("type_add_item_to_cart")
    private final MobileOfficialAppsMarketStat$TypeAddItemToCart typeAddItemToCart;

    @pmi0("type_ads_banner")
    private final MobileOfficialAppsAdsStat$TypeAdsBanner typeAdsBanner;

    @pmi0("type_audio_auto_item")
    private final CommonAudioStat$TypeAudioAutoItem typeAudioAutoItem;

    @pmi0("type_audio_coachmark_item")
    private final CommonAudioStat$TypeAudioCoachmarkItem typeAudioCoachmarkItem;

    @pmi0("type_audio_dislike_item")
    private final CommonAudioStat$TypeAudioDislikeItem typeAudioDislikeItem;

    @pmi0("type_audio_download_item")
    private final CommonAudioStat$TypeAudioDownloadItem typeAudioDownloadItem;

    @pmi0("type_audio_listening_item")
    private final CommonAudioStat$TypeAudioListeningItem typeAudioListeningItem;

    @pmi0("type_audio_longtap_item")
    private final CommonAudioStat$TypeAudioLongtapItem typeAudioLongtapItem;

    @pmi0("type_audio_lyrics_item")
    private final CommonAudioStat$TypeAudioLyricsItem typeAudioLyricsItem;

    @pmi0("type_audio_mix_options_item")
    private final CommonAudioStat$TypeAudioMixOptionsItem typeAudioMixOptionsItem;

    @pmi0("type_audio_offline_item")
    private final SchemeStat$TypeAudioOfflineItem typeAudioOfflineItem;

    @pmi0("type_audio_onboarding_item")
    private final CommonAudioStat$TypeAudioOnboardingItem typeAudioOnboardingItem;

    @pmi0("type_audio_snippet_item")
    private final CommonAudioStat$TypeAudioSnippetItem typeAudioSnippetItem;

    @pmi0("type_audio_tap_close_coachmark_item")
    private final CommonAudioStat$TypeAudioTapCloseCoachmarkItem typeAudioTapCloseCoachmarkItem;

    @pmi0("type_audio_tap_equalizer_event_item")
    private final CommonAudioStat$TypeAudioTapEqualizerEventItem typeAudioTapEqualizerEventItem;

    @pmi0("type_audio_tap_event_item")
    private final CommonAudioStat$TypeAudioTapEventItem typeAudioTapEventItem;

    @pmi0("type_audio_tap_play_event_item")
    private final CommonAudioStat$TypeAudioTapPlayEventItem typeAudioTapPlayEventItem;

    @pmi0("type_audio_tap_popup_event_item")
    private final CommonAudioStat$TypeAudioTapPopupEventItem typeAudioTapPopupEventItem;

    @pmi0("type_audio_tap_search_event_item")
    private final CommonAudioStat$TypeAudioTapSearchEventItem typeAudioTapSearchEventItem;

    @pmi0("type_audio_tap_show_event_item")
    private final CommonAudioStat$TypeAudioTapShowEventItem typeAudioTapShowEventItem;

    @pmi0("type_audio_tap_status_event_item")
    private final CommonAudioStat$TypeAudioTapStatusEventItem typeAudioTapStatusEventItem;

    @pmi0("type_audio_tap_stop_event_item")
    private final CommonAudioStat$TypeAudioTapStopEventItem typeAudioTapStopEventItem;

    @pmi0("type_audio_tap_timer_event_item")
    private final CommonAudioStat$TypeAudioTapTimerEventItem typeAudioTapTimerEventItem;

    @pmi0("type_audio_tap_upd_collection_event_item")
    private final CommonAudioStat$TypeAudioTapUpdCollectionEventItem typeAudioTapUpdCollectionEventItem;

    @pmi0("type_audiobook_act_item")
    private final CommonAudioStat$TypeAudiobookActItem typeAudiobookActItem;

    @pmi0("type_bookmarks_action")
    private final CommonBookmarksStat$TypeBookmarksAction typeBookmarksAction;

    @pmi0("type_caller_id_event_item")
    private final SchemeStat$TypeCallerIdEventItem typeCallerIdEventItem;

    @pmi0("type_cast_event_item")
    private final SchemeStat$TypeCastEventItem typeCastEventItem;

    @pmi0("type_clip_camera_item")
    private final MobileOfficialAppsClipsStat$TypeClipCameraItem typeClipCameraItem;

    @pmi0("type_clip_comment_sharing_item")
    private final MobileOfficialAppsClipsStat$TypeClipCommentSharingItem typeClipCommentSharingItem;

    @pmi0("type_clip_comment_sort_item")
    private final MobileOfficialAppsClipsStat$TypeClipCommentSortItem typeClipCommentSortItem;

    @pmi0("type_clip_coowners_item")
    private final MobileOfficialAppsClipsStat$TypeClipCoownersItem typeClipCoownersItem;

    @pmi0("type_clip_edit_item")
    private final MobileOfficialAppsClipsStat$TypeClipEditItem typeClipEditItem;

    @pmi0("type_clip_editor_item")
    private final MobileOfficialAppsClipsStat$TypeClipEditorItem typeClipEditorItem;

    @pmi0("type_clip_music_catalog_item")
    private final MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem typeClipMusicCatalogItem;

    @pmi0("type_clip_popular_templates_block")
    private final MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock typeClipPopularTemplatesBlock;

    @pmi0("type_clip_publish_item")
    private final MobileOfficialAppsClipsStat$TypeClipPublishItem typeClipPublishItem;

    @pmi0("type_clip_scroll_after_bite")
    private final MobileOfficialAppsClipsStat$TypeClipScrollAfterBite typeClipScrollAfterBite;

    @pmi0("type_clip_template_item")
    private final MobileOfficialAppsClipsStat$TypeClipTemplateItem typeClipTemplateItem;

    @pmi0("type_clip_viewer_item")
    private final SchemeStat$TypeClipViewerItem typeClipViewerItem;

    @pmi0("type_clips_creation_screen_buttons_item")
    private final MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem typeClipsCreationScreenButtonsItem;

    @pmi0("type_clips_creation_screen_item")
    private final MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem typeClipsCreationScreenItem;

    @pmi0("type_clips_stat_ads_action")
    private final MobileOfficialAppsClipsStat$TypeClipsStatAdsAction typeClipsStatAdsAction;

    @pmi0("type_clips_trends_catalog_item")
    private final MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem typeClipsTrendsCatalogItem;

    @pmi0("type_community_onboarding_action")
    private final CommonCommunitiesStat$TypeCommunityOnboardingAction typeCommunityOnboardingAction;

    @pmi0("type_core_network_bad_connection_action")
    private final CommonCoreNetworkStat$NetworkBadConnectionAction typeCoreNetworkBadConnectionAction;

    @pmi0("type_creator_hide_undo_hide_click")
    private final MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick typeCreatorHideUndoHideClick;

    @pmi0("type_donut_goal")
    private final CommonCommunitiesStat$TypeDonutGoal typeDonutGoal;

    @pmi0("type_donut_privacy_setting_changed_item")
    private final CommonCommunitiesStat$TypeDonutPrivacySettingChanged typeDonutPrivacySettingChangedItem;

    @pmi0("type_easter_eggs_item")
    private final SchemeStat$TypeEasterEggsItem typeEasterEggsItem;

    @pmi0("type_external_device_action")
    private final MobileOfficialAppsVideoStat$TypeExternalDeviceAction typeExternalDeviceAction;

    @pmi0("type_feed_action_button_item")
    private final CommonFeedStat$TypeFeedActionButtonItem typeFeedActionButtonItem;

    @pmi0("type_feed_ads_insert")
    private final MobileOfficialAppsFeedStat$TypeFeedAdsInsert typeFeedAdsInsert;

    @pmi0("type_feed_async_block_error")
    private final MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError typeFeedAsyncBlockError;

    @pmi0("type_feed_block_mini_apps_item")
    private final CommonFeedStat$TypeFeedBlockMiniAppsItem typeFeedBlockMiniAppsItem;

    @pmi0("type_feed_block_recommended_playlists_item")
    private final CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem typeFeedBlockRecommendedPlaylistsItem;

    @pmi0("type_feed_duplicate_owner_post")
    private final MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost typeFeedDuplicateOwnerPost;

    @pmi0("type_feed_feed_refresh")
    private final MobileOfficialAppsFeedStat$TypeFeedFeedRefresh typeFeedFeedRefresh;

    @pmi0("type_feed_feed_scroll_to_top")
    private final MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop typeFeedFeedScrollToTop;

    @pmi0("type_feed_post_played_unit_of_audio")
    private final MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio typeFeedPostPlayedUnitOfAudio;

    @pmi0("type_feed_post_start_audio")
    private final MobileOfficialAppsFeedStat$TypeFeedPostStartAudio typeFeedPostStartAudio;

    @pmi0("type_feed_post_start_playlist")
    private final MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist typeFeedPostStartPlaylist;

    @pmi0("type_feed_sdk_ad_request")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest typeFeedSdkAdRequest;

    @pmi0("type_feed_show_fresh_news_button")
    private final MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton typeFeedShowFreshNewsButton;

    @pmi0("type_feed_show_more_shops_button")
    private final MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton typeFeedShowMoreShopsButton;

    @pmi0("type_feed_show_product_pin")
    private final MobileOfficialAppsFeedStat$TypeFeedShowProductPin typeFeedShowProductPin;

    @pmi0("type_feed_show_ticket_item_pin")
    private final MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin typeFeedShowTicketItemPin;

    @pmi0("type_feed_stop_pagination")
    private final MobileOfficialAppsFeedStat$TypeFeedStopPagination typeFeedStopPagination;

    @pmi0("type_feed_zoom_photo")
    private final MobileOfficialAppsFeedStat$TypeFeedZoomPhoto typeFeedZoomPhoto;

    @pmi0("type_health_connect_info_item")
    private final MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem typeHealthConnectInfoItem;

    @pmi0("type_health_permission_result_item")
    private final MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem typeHealthPermissionResultItem;

    @pmi0("type_health_sync_state_item")
    private final MobileOfficialAppsHealthStat$TypeHealthSyncStateItem typeHealthSyncStateItem;

    @pmi0("type_im_channel_join_action")
    private final MobileOfficialAppsImStat$TypeImChannelJoinAction typeImChannelJoinAction;

    @pmi0("type_im_conversations_banner_item")
    private final MobileOfficialAppsImStat$TypeImConversationsBannerItem typeImConversationsBannerItem;

    @pmi0("type_im_invitation_card_reject_action")
    private final MobileOfficialAppsImStat$TypeImInvitationCardRejectAction typeImInvitationCardRejectAction;

    @pmi0("type_live_actions")
    private final CommonVideoStat$TypeLiveActionsItem typeLiveActions;

    @pmi0("type_live_viewer_item")
    private final MobileOfficialAppsClipsStat$TypeLiveViewerItem typeLiveViewerItem;

    @pmi0("type_local_search_item")
    private final CommonSearchStat$TypeLocalSearchItem typeLocalSearchItem;

    @pmi0("type_market_item")
    private final SchemeStat$TypeMarketItem typeMarketItem;

    @pmi0("type_market_updated_delivery_block")
    private final CommonMarketStat$TypeMarketDeliveryBlockUpdatedItem typeMarketUpdatedDeliveryBlock;

    @pmi0("type_marketing_transition_item")
    private final SchemeStat$TypeMarketingTransitionItem typeMarketingTransitionItem;

    @pmi0("type_marusia_conversation_item")
    private final MobileOfficialAppsMarusiaStat$TypeConversationItem typeMarusiaConversationItem;

    @pmi0("type_marusia_reading_item")
    private final MobileOfficialAppsMarusiaStat$TypeReadingItem typeMarusiaReadingItem;

    @pmi0("type_marusia_settings_item")
    private final MobileOfficialAppsMarusiaStat$TypeSettingsItem typeMarusiaSettingsItem;

    @pmi0("type_messaging_action_item")
    private final SchemeStat$TypeMessagingActionItem typeMessagingActionItem;

    @pmi0("type_messaging_audio_message_item")
    private final SchemeStat$TypeMessagingAudioMessageItem typeMessagingAudioMessageItem;

    @pmi0("type_messaging_contact_recommendations_item")
    private final SchemeStat$TypeMessagingContactRecommendationsItem typeMessagingContactRecommendationsItem;

    @pmi0("type_mini_app_access_token_item")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem typeMiniAppAccessTokenItem;

    @pmi0("type_mini_app_custom_event_item")
    private final SchemeStat$TypeMiniAppCustomEventItem typeMiniAppCustomEventItem;

    @pmi0("type_mini_app_open_item")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem typeMiniAppOpenItem;

    @pmi0("type_mini_app_session_item")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem typeMiniAppSessionItem;

    @pmi0("type_mini_apps_ads_native")
    private final MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative typeMiniAppsAdsNative;

    @pmi0("type_mini_apps_ads_request")
    private final MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest typeMiniAppsAdsRequest;

    @pmi0("type_mini_apps_close_confirmation_alert_item")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem typeMiniAppsCloseConfirmationAlertItem;

    @pmi0("type_mini_apps_install_screen")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen typeMiniAppsInstallScreen;

    @pmi0("type_mini_apps_personal_discount")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount typeMiniAppsPersonalDiscount;

    @pmi0("type_motivation_item")
    private final MobileOfficialAppsClipsStat$TypeMotivationItem typeMotivationItem;

    @pmi0("type_move_youtube_subs_click_item")
    private final MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem typeMoveYoutubeSubsClickItem;

    @pmi0("type_mt_timespent_item")
    private final SchemeStat$TypeMtTimespentItem typeMtTimespentItem;

    @pmi0("type_music_subscription_item")
    private final CommonAudioStat$TypeMusicSubscriptionItem typeMusicSubscriptionItem;

    @pmi0("type_onboarding_usecases_item")
    private final SchemeStat$TypeOnboardingUsecasesItem typeOnboardingUsecasesItem;

    @pmi0("type_overlay_ad_close")
    private final CommonVideoAdsStat$TypeOverlayAdClose typeOverlayAdClose;

    @pmi0("type_overlay_ad_config_blocked")
    private final CommonVideoAdsStat$TypeOverlayAdConfigBlocked typeOverlayAdConfigBlocked;

    @pmi0("type_overlay_ad_impression")
    private final CommonVideoAdsStat$TypeOverlayAdImpression typeOverlayAdImpression;

    @pmi0("type_overlay_ad_menu_action")
    private final CommonVideoAdsStat$TypeOverlayAdMenuAction typeOverlayAdMenuAction;

    @pmi0("type_overlay_ad_request")
    private final CommonVideoAdsStat$TypeOverlayAdRequest typeOverlayAdRequest;

    @pmi0("type_overlay_ad_response")
    private final CommonVideoAdsStat$TypeOverlayAdResponse typeOverlayAdResponse;

    @pmi0("type_overlay_live_product_card_close")
    private final MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose typeOverlayLiveProductCardClose;

    @pmi0("type_owner_button_app_render_item")
    private final SchemeStat$TypeOwnerButtonAppRenderItem typeOwnerButtonAppRenderItem;

    @pmi0("type_permission_change")
    private final MobileOfficialAppsCorePermissionStat$TypePermissionChange typePermissionChange;

    @pmi0("type_pin_video_action")
    private final MobileOfficialAppsVideoStat$TypePinVideoAction typePinVideoAction;

    @pmi0("type_push_event_item")
    private final MobileOfficialAppsCorePushesStat$TypePushEventItem typePushEventItem;

    @pmi0("type_push_notifications_settings")
    private final MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings typePushNotificationsSettings;

    @pmi0("type_push_request_item")
    private final SchemeStat$TypePushRequestItem typePushRequestItem;

    @pmi0("type_radio_station_item")
    private final CommonAudioStat$TypeRadioStationItem typeRadioStationItem;

    @pmi0("type_recom_themes_item")
    private final CommonOnboardingRecomThemesStat$TypeRecomThemesItem typeRecomThemesItem;

    @pmi0("type_registration_item")
    private final SchemeStat$TypeRegistrationItem typeRegistrationItem;

    @pmi0("type_remove_item_from_cart_item")
    private final MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem typeRemoveItemFromCartItem;

    @pmi0("type_rewarded_ads_show_action_item")
    private final MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem typeRewardedAdsShowActionItem;

    @pmi0("type_sak_sessions_event_item")
    private final SchemeStat$TypeSakSessionsEventItem typeSakSessionsEventItem;

    @pmi0("type_screencast_code_action")
    private final MobileOfficialAppsVideoStat$TypeScreencastCodeAction typeScreencastCodeAction;

    @pmi0("type_search_item")
    private final CommonSearchStat$TypeSearchItem typeSearchItem;

    @pmi0("type_secure_lock_entrance_item")
    private final MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem typeSecureLockEntranceItem;

    @pmi0("type_select_creators_click_item")
    private final j0 typeSelectCreatorsClickItem;

    @pmi0("type_select_creators_screen_confirm_click")
    private final MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick typeSelectCreatorsScreenConfirmClick;

    @pmi0("type_shutdown_detection_action_item")
    private final MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem typeShutdownDetectionActionItem;

    @pmi0("type_similar_channels_block")
    private final CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock typeSimilarChannelsBlock;

    @pmi0("type_similar_channels_card_show")
    private final CommonVideoOtherChannelsStat$TypeSimilarChannelsCardShow typeSimilarChannelsCardShow;

    @pmi0("type_snowball_events")
    private final SchemeStat$TypeSnowballEvents typeSnowballEvents;

    @pmi0("type_sport_direct_link_opened")
    private final MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened typeSportDirectLinkOpened;

    @pmi0("type_story_feed_view_item")
    private final MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem typeStoryFeedViewItem;

    @pmi0("type_story_publish_item")
    private final MobileOfficialAppsStoriesStat$TypeStoryPublishItem typeStoryPublishItem;

    @pmi0("type_story_view_item")
    private final MobileOfficialAppsStoriesStat$TypeStoryViewItem typeStoryViewItem;

    @pmi0("type_superapp_birthday_present_item")
    private final SchemeStat$TypeSuperappBirthdayPresentItem typeSuperappBirthdayPresentItem;

    @pmi0("type_superapp_onboarding_action_item")
    private final MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem typeSuperappOnboardingActionItem;

    @pmi0("type_superapp_screen_item")
    private final SchemeStat$TypeSuperappScreenItem typeSuperappScreenItem;

    @pmi0("type_superapp_snow_item")
    private final SchemeStat$TypeSuperappSnowItem typeSuperappSnowItem;

    @pmi0("type_superapp_statlog_item")
    private final SchemeStat$TypeSuperappStatlogItem typeSuperappStatlogItem;

    @pmi0("type_system_widget_add_event_item")
    private final MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem typeSystemWidgetAddEventItem;

    @pmi0("type_system_widget_displayed_event_item")
    private final MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem typeSystemWidgetDisplayedEventItem;

    @pmi0("type_system_widget_refresh_event_item")
    private final MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem typeSystemWidgetRefreshEventItem;

    @pmi0("type_system_widget_remove_event_item")
    private final MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem typeSystemWidgetRemoveEventItem;

    @pmi0("type_tabbar_item")
    private final MobileOfficialAppsTabbarStat$TypeTabbarItem typeTabbarItem;

    @pmi0("type_topshelf_action")
    private final MobileOfficialAppsVideoStat$TypeTopshelfAction typeTopshelfAction;

    @pmi0("type_tv_kid_mode_item")
    private final MobileOfficialAppsVideoStat$TypeTvKidModeItem typeTvKidModeItem;

    @pmi0("type_tv_kid_mode_item_logout")
    private final MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout typeTvKidModeItemLogout;

    @pmi0("type_tv_kid_profile_item")
    private final MobileOfficialAppsVideoStat$TypeTvKidProfileItem typeTvKidProfileItem;

    @pmi0("type_ui_hint_item")
    private final CommonOnboardingStat$TypeUiHintItem typeUiHintItem;

    @pmi0("type_universal_banner")
    private final CommonVideoStat$TypeUniversalBanner typeUniversalBanner;

    @pmi0("type_universal_widget")
    private final SchemeStat$TypeUniversalWidget typeUniversalWidget;

    @pmi0("type_upload_exit_confirmation_dialog")
    private final MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog typeUploadExitConfirmationDialog;

    @pmi0("type_uxpolls_event")
    private final CommonUxpollsStat$TypeUxpollsEvent typeUxpollsEvent;

    @pmi0("type_video_ad_trial_action")
    private final MobileOfficialAppsVideoStat$TypeVideoAdTrialAction typeVideoAdTrialAction;

    @pmi0("type_video_apple_top_shelf_click")
    private final MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick typeVideoAppleTopShelfClick;

    @pmi0("type_video_attach_object_to_video")
    private final MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo typeVideoAttachObjectToVideo;

    @pmi0("type_video_child_profile_actions")
    private final MobileOfficialAppsVideoStat$TypeVideoChildProfileActions typeVideoChildProfileActions;

    @pmi0("type_video_create_channel_action")
    private final CommonVideoStat$TypeVideoCreateChannelAction typeVideoCreateChannelAction;

    @pmi0("type_video_discovery_tabs_action")
    private final MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction typeVideoDiscoveryTabsAction;

    @pmi0("type_video_download_skip_action")
    private final MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction typeVideoDownloadSkipAction;

    @pmi0("type_video_download_wait_for_user_action")
    private final MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction typeVideoDownloadWaitForUserAction;

    @pmi0("type_video_dynamic_tabs_onboarding_item")
    private final MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem typeVideoDynamicTabsOnboardingItem;

    @pmi0("type_video_in_app_review_initial_appearance_item")
    private final MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem typeVideoInAppReviewInitialAppearanceItem;

    @pmi0("type_video_kids_age_filter_reset")
    private final MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset typeVideoKidsAgeFilterReset;

    @pmi0("type_video_kids_age_filter_select")
    private final MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect typeVideoKidsAgeFilterSelect;

    @pmi0("type_video_kids_mode_changed_event")
    private final MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent typeVideoKidsModeChangedEvent;

    @pmi0("type_video_next_video_start_action")
    private final CommonVideoStat$TypeVideoNextVideoStartAction typeVideoNextVideoStartAction;

    @pmi0("type_video_open_author_cabinet")
    private final CommonVideoStat$TypeVideoOpenAuthorCabinet typeVideoOpenAuthorCabinet;

    @pmi0("type_video_open_similars_action")
    private final MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction typeVideoOpenSimilarsAction;

    @pmi0("type_video_player_action_item")
    private final CommonVideoStat$TypeVideoPlayerActionItem typeVideoPlayerActionItem;

    @pmi0("type_video_player_change_mode")
    private final MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode typeVideoPlayerChangeMode;

    @pmi0("type_video_push_settings_banner")
    private final CommonVideoStat$TypeVideoPushSettingsBanner typeVideoPushSettingsBanner;

    @pmi0("type_video_screen_lock_action")
    private final MobileOfficialAppsVideoStat$TypeVideoScreenLockAction typeVideoScreenLockAction;

    @pmi0("type_video_show_similars_button_action")
    private final MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction typeVideoShowSimilarsButtonAction;

    @pmi0("type_video_subtitles_action")
    private final MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction typeVideoSubtitlesAction;

    @pmi0("type_video_suggest_downloads_appearance_item")
    private final q0 typeVideoSuggestDownloadsAppearanceItem;

    @pmi0("type_video_to_clip_upload")
    private final MobileOfficialAppsVideoStat$TypeVideoToClipUpload typeVideoToClipUpload;

    @pmi0("type_video_upload_author_select")
    private final MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect typeVideoUploadAuthorSelect;

    @pmi0("type_video_upload_cover_action")
    private final MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction typeVideoUploadCoverAction;

    @pmi0("type_video_upload_cover_apply_photo")
    private final MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto typeVideoUploadCoverApplyPhoto;

    @pmi0("type_vk_bridge")
    private final SchemeStat$TypeVkBridge typeVkBridge;

    @pmi0("type_vk_connect_navigation_item")
    private final SchemeStat$TypeVkConnectNavigationItem typeVkConnectNavigationItem;

    @pmi0("type_vk_connect_questionnaire")
    private final SchemeStat$TypeVkConnectQuestionnaire typeVkConnectQuestionnaire;

    @pmi0("type_vk_pay_checkout_item")
    private final SchemeStat$TypeVkPayCheckoutItem typeVkPayCheckoutItem;

    @pmi0("type_vk_run_item")
    private final SchemeStat$TypeVkRunItem typeVkRunItem;

    @pmi0("type_vk_workout_item")
    private final SchemeStat$TypeVkWorkoutItem typeVkWorkoutItem;

    @pmi0("type_voip_call_item")
    private final MobileOfficialAppsCallsStat$TypeVoipCallItem typeVoipCallItem;

    @pmi0("type_voip_error_item")
    private final MobileOfficialAppsCallsStat$TypeVoipErrorItem typeVoipErrorItem;

    @pmi0("type_voip_import_contacts_action")
    private final MobileOfficialAppsCallsStat$TypeVoipImportContactsAction typeVoipImportContactsAction;

    @pmi0("type_voip_sync_contacts_modal_action")
    private final MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction typeVoipSyncContactsModalAction;

    @pmi0("type_wishlist_item")
    private final SchemeStat$TypeWishlistItem typeWishlistItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_add_item_to_cart")
        public static final Type TYPE_ADD_ITEM_TO_CART;

        @pmi0("type_ads_banner")
        public static final Type TYPE_ADS_BANNER;

        @pmi0("type_audiobook_act_item")
        public static final Type TYPE_AUDIOBOOK_ACT_ITEM;

        @pmi0("type_audio_auto_item")
        public static final Type TYPE_AUDIO_AUTO_ITEM;

        @pmi0("type_audio_coachmark_item")
        public static final Type TYPE_AUDIO_COACHMARK_ITEM;

        @pmi0("type_audio_dislike_item")
        public static final Type TYPE_AUDIO_DISLIKE_ITEM;

        @pmi0("type_audio_download_item")
        public static final Type TYPE_AUDIO_DOWNLOAD_ITEM;

        @pmi0("type_audio_listening_item")
        public static final Type TYPE_AUDIO_LISTENING_ITEM;

        @pmi0("type_audio_longtap_item")
        public static final Type TYPE_AUDIO_LONGTAP_ITEM;

        @pmi0("type_audio_lyrics_item")
        public static final Type TYPE_AUDIO_LYRICS_ITEM;

        @pmi0("type_audio_mix_options_item")
        public static final Type TYPE_AUDIO_MIX_OPTIONS_ITEM;

        @pmi0("type_audio_offline_item")
        public static final Type TYPE_AUDIO_OFFLINE_ITEM;

        @pmi0("type_audio_onboarding_item")
        public static final Type TYPE_AUDIO_ONBOARDING_ITEM;

        @pmi0("type_audio_snippet_item")
        public static final Type TYPE_AUDIO_SNIPPET_ITEM;

        @pmi0("type_audio_tap_close_coachmark_item")
        public static final Type TYPE_AUDIO_TAP_CLOSE_COACHMARK_ITEM;

        @pmi0("type_audio_tap_equalizer_event_item")
        public static final Type TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM;

        @pmi0("type_audio_tap_event_item")
        public static final Type TYPE_AUDIO_TAP_EVENT_ITEM;

        @pmi0("type_audio_tap_play_event_item")
        public static final Type TYPE_AUDIO_TAP_PLAY_EVENT_ITEM;

        @pmi0("type_audio_tap_popup_event_item")
        public static final Type TYPE_AUDIO_TAP_POPUP_EVENT_ITEM;

        @pmi0("type_audio_tap_search_event_item")
        public static final Type TYPE_AUDIO_TAP_SEARCH_EVENT_ITEM;

        @pmi0("type_audio_tap_show_event_item")
        public static final Type TYPE_AUDIO_TAP_SHOW_EVENT_ITEM;

        @pmi0("type_audio_tap_status_event_item")
        public static final Type TYPE_AUDIO_TAP_STATUS_EVENT_ITEM;

        @pmi0("type_audio_tap_stop_event_item")
        public static final Type TYPE_AUDIO_TAP_STOP_EVENT_ITEM;

        @pmi0("type_audio_tap_timer_event_item")
        public static final Type TYPE_AUDIO_TAP_TIMER_EVENT_ITEM;

        @pmi0("type_audio_tap_upd_collection_event_item")
        public static final Type TYPE_AUDIO_TAP_UPD_COLLECTION_EVENT_ITEM;

        @pmi0("type_bookmarks_action")
        public static final Type TYPE_BOOKMARKS_ACTION;

        @pmi0("type_caller_id_event_item")
        public static final Type TYPE_CALLER_ID_EVENT_ITEM;

        @pmi0("type_cast_event_item")
        public static final Type TYPE_CAST_EVENT_ITEM;

        @pmi0("type_clips_creation_screen_buttons_item")
        public static final Type TYPE_CLIPS_CREATION_SCREEN_BUTTONS_ITEM;

        @pmi0("type_clips_creation_screen_item")
        public static final Type TYPE_CLIPS_CREATION_SCREEN_ITEM;

        @pmi0("type_clips_stat_ads_action")
        public static final Type TYPE_CLIPS_STAT_ADS_ACTION;

        @pmi0("type_clips_trends_catalog_item")
        public static final Type TYPE_CLIPS_TRENDS_CATALOG_ITEM;

        @pmi0("type_clip_camera_item")
        public static final Type TYPE_CLIP_CAMERA_ITEM;

        @pmi0("type_clip_comment_sharing_item")
        public static final Type TYPE_CLIP_COMMENT_SHARING_ITEM;

        @pmi0("type_clip_comment_sort_item")
        public static final Type TYPE_CLIP_COMMENT_SORT_ITEM;

        @pmi0("type_clip_coowners_item")
        public static final Type TYPE_CLIP_COOWNERS_ITEM;

        @pmi0("type_clip_editor_item")
        public static final Type TYPE_CLIP_EDITOR_ITEM;

        @pmi0("type_clip_edit_item")
        public static final Type TYPE_CLIP_EDIT_ITEM;

        @pmi0("type_clip_music_catalog_item")
        public static final Type TYPE_CLIP_MUSIC_CATALOG_ITEM;

        @pmi0("type_clip_popular_templates_block")
        public static final Type TYPE_CLIP_POPULAR_TEMPLATES_BLOCK;

        @pmi0("type_clip_publish_item")
        public static final Type TYPE_CLIP_PUBLISH_ITEM;

        @pmi0("type_clip_scroll_after_bite")
        public static final Type TYPE_CLIP_SCROLL_AFTER_BITE;

        @pmi0("type_clip_template_item")
        public static final Type TYPE_CLIP_TEMPLATE_ITEM;

        @pmi0("type_clip_viewer_item")
        public static final Type TYPE_CLIP_VIEWER_ITEM;

        @pmi0("type_community_onboarding_action")
        public static final Type TYPE_COMMUNITY_ONBOARDING_ACTION;

        @pmi0("type_core_network_bad_connection_action")
        public static final Type TYPE_CORE_NETWORK_BAD_CONNECTION_ACTION;

        @pmi0("type_creator_hide_undo_hide_click")
        public static final Type TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK;

        @pmi0("type_donut_goal")
        public static final Type TYPE_DONUT_GOAL;

        @pmi0("type_donut_privacy_setting_changed_item")
        public static final Type TYPE_DONUT_PRIVACY_SETTING_CHANGED_ITEM;

        @pmi0("type_easter_eggs_item")
        public static final Type TYPE_EASTER_EGGS_ITEM;

        @pmi0("type_external_device_action")
        public static final Type TYPE_EXTERNAL_DEVICE_ACTION;

        @pmi0("type_feed_action_button_item")
        public static final Type TYPE_FEED_ACTION_BUTTON_ITEM;

        @pmi0("type_feed_ads_insert")
        public static final Type TYPE_FEED_ADS_INSERT;

        @pmi0("type_feed_async_block_error")
        public static final Type TYPE_FEED_ASYNC_BLOCK_ERROR;

        @pmi0("type_feed_block_mini_apps_item")
        public static final Type TYPE_FEED_BLOCK_MINI_APPS_ITEM;

        @pmi0("type_feed_block_recommended_playlists_item")
        public static final Type TYPE_FEED_BLOCK_RECOMMENDED_PLAYLISTS_ITEM;

        @pmi0("type_feed_duplicate_owner_post")
        public static final Type TYPE_FEED_DUPLICATE_OWNER_POST;

        @pmi0("type_feed_feed_refresh")
        public static final Type TYPE_FEED_FEED_REFRESH;

        @pmi0("type_feed_feed_scroll_to_top")
        public static final Type TYPE_FEED_FEED_SCROLL_TO_TOP;

        @pmi0("type_feed_post_played_unit_of_audio")
        public static final Type TYPE_FEED_POST_PLAYED_UNIT_OF_AUDIO;

        @pmi0("type_feed_post_start_audio")
        public static final Type TYPE_FEED_POST_START_AUDIO;

        @pmi0("type_feed_post_start_playlist")
        public static final Type TYPE_FEED_POST_START_PLAYLIST;

        @pmi0("type_feed_sdk_ad_request")
        public static final Type TYPE_FEED_SDK_AD_REQUEST;

        @pmi0("type_feed_show_fresh_news_button")
        public static final Type TYPE_FEED_SHOW_FRESH_NEWS_BUTTON;

        @pmi0("type_feed_show_more_shops_button")
        public static final Type TYPE_FEED_SHOW_MORE_SHOPS_BUTTON;

        @pmi0("type_feed_show_product_pin")
        public static final Type TYPE_FEED_SHOW_PRODUCT_PIN;

        @pmi0("type_feed_show_ticket_item_pin")
        public static final Type TYPE_FEED_SHOW_TICKET_ITEM_PIN;

        @pmi0("type_feed_stop_pagination")
        public static final Type TYPE_FEED_STOP_PAGINATION;

        @pmi0("type_feed_zoom_photo")
        public static final Type TYPE_FEED_ZOOM_PHOTO;

        @pmi0("type_health_connect_info_item")
        public static final Type TYPE_HEALTH_CONNECT_INFO_ITEM;

        @pmi0("type_health_permission_result_item")
        public static final Type TYPE_HEALTH_PERMISSION_RESULT_ITEM;

        @pmi0("type_health_sync_state_item")
        public static final Type TYPE_HEALTH_SYNC_STATE_ITEM;

        @pmi0("type_im_channel_join_action")
        public static final Type TYPE_IM_CHANNEL_JOIN_ACTION;

        @pmi0("type_im_conversations_banner_item")
        public static final Type TYPE_IM_CONVERSATIONS_BANNER_ITEM;

        @pmi0("type_im_invitation_card_reject_action")
        public static final Type TYPE_IM_INVITATION_CARD_REJECT_ACTION;

        @pmi0("type_live_actions")
        public static final Type TYPE_LIVE_ACTIONS;

        @pmi0("type_live_viewer_item")
        public static final Type TYPE_LIVE_VIEWER_ITEM;

        @pmi0("type_local_search_item")
        public static final Type TYPE_LOCAL_SEARCH_ITEM;

        @pmi0("type_marketing_transition_item")
        public static final Type TYPE_MARKETING_TRANSITION_ITEM;

        @pmi0("type_market_item")
        public static final Type TYPE_MARKET_ITEM;

        @pmi0("type_market_updated_delivery_block")
        public static final Type TYPE_MARKET_UPDATED_DELIVERY_BLOCK;

        @pmi0("type_marusia_conversation_item")
        public static final Type TYPE_MARUSIA_CONVERSATION_ITEM;

        @pmi0("type_marusia_reading_item")
        public static final Type TYPE_MARUSIA_READING_ITEM;

        @pmi0("type_marusia_settings_item")
        public static final Type TYPE_MARUSIA_SETTINGS_ITEM;

        @pmi0("type_messaging_action_item")
        public static final Type TYPE_MESSAGING_ACTION_ITEM;

        @pmi0("type_messaging_audio_message_item")
        public static final Type TYPE_MESSAGING_AUDIO_MESSAGE_ITEM;

        @pmi0("type_messaging_contact_recommendations_item")
        public static final Type TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM;

        @pmi0("type_mini_apps_ads_native")
        public static final Type TYPE_MINI_APPS_ADS_NATIVE;

        @pmi0("type_mini_apps_ads_request")
        public static final Type TYPE_MINI_APPS_ADS_REQUEST;

        @pmi0("type_mini_apps_close_confirmation_alert_item")
        public static final Type TYPE_MINI_APPS_CLOSE_CONFIRMATION_ALERT_ITEM;

        @pmi0("type_mini_apps_install_screen")
        public static final Type TYPE_MINI_APPS_INSTALL_SCREEN;

        @pmi0("type_mini_apps_personal_discount")
        public static final Type TYPE_MINI_APPS_PERSONAL_DISCOUNT;

        @pmi0("type_mini_app_access_token_item")
        public static final Type TYPE_MINI_APP_ACCESS_TOKEN_ITEM;

        @pmi0("type_mini_app_custom_event_item")
        public static final Type TYPE_MINI_APP_CUSTOM_EVENT_ITEM;

        @pmi0("type_mini_app_open_item")
        public static final Type TYPE_MINI_APP_OPEN_ITEM;

        @pmi0("type_mini_app_session_item")
        public static final Type TYPE_MINI_APP_SESSION_ITEM;

        @pmi0("type_motivation_item")
        public static final Type TYPE_MOTIVATION_ITEM;

        @pmi0("type_move_youtube_subs_click_item")
        public static final Type TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM;

        @pmi0("type_mt_timespent_item")
        public static final Type TYPE_MT_TIMESPENT_ITEM;

        @pmi0("type_music_subscription_item")
        public static final Type TYPE_MUSIC_SUBSCRIPTION_ITEM;

        @pmi0("type_onboarding_usecases_item")
        public static final Type TYPE_ONBOARDING_USECASES_ITEM;

        @pmi0("type_overlay_ad_close")
        public static final Type TYPE_OVERLAY_AD_CLOSE;

        @pmi0("type_overlay_ad_config_blocked")
        public static final Type TYPE_OVERLAY_AD_CONFIG_BLOCKED;

        @pmi0("type_overlay_ad_impression")
        public static final Type TYPE_OVERLAY_AD_IMPRESSION;

        @pmi0("type_overlay_ad_menu_action")
        public static final Type TYPE_OVERLAY_AD_MENU_ACTION;

        @pmi0("type_overlay_ad_request")
        public static final Type TYPE_OVERLAY_AD_REQUEST;

        @pmi0("type_overlay_ad_response")
        public static final Type TYPE_OVERLAY_AD_RESPONSE;

        @pmi0("type_overlay_live_product_card_close")
        public static final Type TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLOSE;

        @pmi0("type_owner_button_app_render_item")
        public static final Type TYPE_OWNER_BUTTON_APP_RENDER_ITEM;

        @pmi0("type_permission_change")
        public static final Type TYPE_PERMISSION_CHANGE;

        @pmi0("type_pin_video_action")
        public static final Type TYPE_PIN_VIDEO_ACTION;

        @pmi0("type_push_event_item")
        public static final Type TYPE_PUSH_EVENT_ITEM;

        @pmi0("type_push_notifications_settings")
        public static final Type TYPE_PUSH_NOTIFICATIONS_SETTINGS;

        @pmi0("type_push_request_item")
        public static final Type TYPE_PUSH_REQUEST_ITEM;

        @pmi0("type_radio_station_item")
        public static final Type TYPE_RADIO_STATION_ITEM;

        @pmi0("type_recom_themes_item")
        public static final Type TYPE_RECOM_THEMES_ITEM;

        @pmi0("type_registration_item")
        public static final Type TYPE_REGISTRATION_ITEM;

        @pmi0("type_remove_item_from_cart_item")
        public static final Type TYPE_REMOVE_ITEM_FROM_CART_ITEM;

        @pmi0("type_rewarded_ads_show_action_item")
        public static final Type TYPE_REWARDED_ADS_SHOW_ACTION_ITEM;

        @pmi0("type_sak_sessions_event_item")
        public static final Type TYPE_SAK_SESSIONS_EVENT_ITEM;

        @pmi0("type_screencast_code_action")
        public static final Type TYPE_SCREENCAST_CODE_ACTION;

        @pmi0("type_search_item")
        public static final Type TYPE_SEARCH_ITEM;

        @pmi0("type_secure_lock_entrance_item")
        public static final Type TYPE_SECURE_LOCK_ENTRANCE_ITEM;

        @pmi0("type_select_creators_click_item")
        public static final Type TYPE_SELECT_CREATORS_CLICK_ITEM;

        @pmi0("type_select_creators_screen_confirm_click")
        public static final Type TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK;

        @pmi0("type_shutdown_detection_action_item")
        public static final Type TYPE_SHUTDOWN_DETECTION_ACTION_ITEM;

        @pmi0("type_similar_channels_block")
        public static final Type TYPE_SIMILAR_CHANNELS_BLOCK;

        @pmi0("type_similar_channels_card_show")
        public static final Type TYPE_SIMILAR_CHANNELS_CARD_SHOW;

        @pmi0("type_snowball_events")
        public static final Type TYPE_SNOWBALL_EVENTS;

        @pmi0("type_sport_direct_link_opened")
        public static final Type TYPE_SPORT_DIRECT_LINK_OPENED;

        @pmi0("type_story_feed_view_item")
        public static final Type TYPE_STORY_FEED_VIEW_ITEM;

        @pmi0("type_story_publish_item")
        public static final Type TYPE_STORY_PUBLISH_ITEM;

        @pmi0("type_story_view_item")
        public static final Type TYPE_STORY_VIEW_ITEM;

        @pmi0("type_superapp_birthday_present_item")
        public static final Type TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM;

        @pmi0("type_superapp_onboarding_action_item")
        public static final Type TYPE_SUPERAPP_ONBOARDING_ACTION_ITEM;

        @pmi0("type_superapp_screen_item")
        public static final Type TYPE_SUPERAPP_SCREEN_ITEM;

        @pmi0("type_superapp_snow_item")
        public static final Type TYPE_SUPERAPP_SNOW_ITEM;

        @pmi0("type_superapp_statlog_item")
        public static final Type TYPE_SUPERAPP_STATLOG_ITEM;

        @pmi0("type_system_widget_add_event_item")
        public static final Type TYPE_SYSTEM_WIDGET_ADD_EVENT_ITEM;

        @pmi0("type_system_widget_displayed_event_item")
        public static final Type TYPE_SYSTEM_WIDGET_DISPLAYED_EVENT_ITEM;

        @pmi0("type_system_widget_refresh_event_item")
        public static final Type TYPE_SYSTEM_WIDGET_REFRESH_EVENT_ITEM;

        @pmi0("type_system_widget_remove_event_item")
        public static final Type TYPE_SYSTEM_WIDGET_REMOVE_EVENT_ITEM;

        @pmi0("type_tabbar_item")
        public static final Type TYPE_TABBAR_ITEM;

        @pmi0("type_topshelf_action")
        public static final Type TYPE_TOPSHELF_ACTION;

        @pmi0("type_tv_kid_mode_item")
        public static final Type TYPE_TV_KID_MODE_ITEM;

        @pmi0("type_tv_kid_mode_item_logout")
        public static final Type TYPE_TV_KID_MODE_ITEM_LOGOUT;

        @pmi0("type_tv_kid_profile_item")
        public static final Type TYPE_TV_KID_PROFILE_ITEM;

        @pmi0("type_ui_hint_item")
        public static final Type TYPE_UI_HINT_ITEM;

        @pmi0("type_universal_banner")
        public static final Type TYPE_UNIVERSAL_BANNER;

        @pmi0("type_universal_widget")
        public static final Type TYPE_UNIVERSAL_WIDGET;

        @pmi0("type_upload_exit_confirmation_dialog")
        public static final Type TYPE_UPLOAD_EXIT_CONFIRMATION_DIALOG;

        @pmi0("type_uxpolls_event")
        public static final Type TYPE_UXPOLLS_EVENT;

        @pmi0("type_video_ad_trial_action")
        public static final Type TYPE_VIDEO_AD_TRIAL_ACTION;

        @pmi0("type_video_apple_top_shelf_click")
        public static final Type TYPE_VIDEO_APPLE_TOP_SHELF_CLICK;

        @pmi0("type_video_attach_object_to_video")
        public static final Type TYPE_VIDEO_ATTACH_OBJECT_TO_VIDEO;

        @pmi0("type_video_child_profile_actions")
        public static final Type TYPE_VIDEO_CHILD_PROFILE_ACTIONS;

        @pmi0("type_video_create_channel_action")
        public static final Type TYPE_VIDEO_CREATE_CHANNEL_ACTION;

        @pmi0("type_video_discovery_tabs_action")
        public static final Type TYPE_VIDEO_DISCOVERY_TABS_ACTION;

        @pmi0("type_video_download_skip_action")
        public static final Type TYPE_VIDEO_DOWNLOAD_SKIP_ACTION;

        @pmi0("type_video_download_wait_for_user_action")
        public static final Type TYPE_VIDEO_DOWNLOAD_WAIT_FOR_USER_ACTION;

        @pmi0("type_video_dynamic_tabs_onboarding_item")
        public static final Type TYPE_VIDEO_DYNAMIC_TABS_ONBOARDING_ITEM;

        @pmi0("type_video_in_app_review_initial_appearance_item")
        public static final Type TYPE_VIDEO_IN_APP_REVIEW_INITIAL_APPEARANCE_ITEM;

        @pmi0("type_video_kids_age_filter_reset")
        public static final Type TYPE_VIDEO_KIDS_AGE_FILTER_RESET;

        @pmi0("type_video_kids_age_filter_select")
        public static final Type TYPE_VIDEO_KIDS_AGE_FILTER_SELECT;

        @pmi0("type_video_kids_mode_changed_event")
        public static final Type TYPE_VIDEO_KIDS_MODE_CHANGED_EVENT;

        @pmi0("type_video_next_video_start_action")
        public static final Type TYPE_VIDEO_NEXT_VIDEO_START_ACTION;

        @pmi0("type_video_open_author_cabinet")
        public static final Type TYPE_VIDEO_OPEN_AUTHOR_CABINET;

        @pmi0("type_video_open_similars_action")
        public static final Type TYPE_VIDEO_OPEN_SIMILARS_ACTION;

        @pmi0("type_video_player_action_item")
        public static final Type TYPE_VIDEO_PLAYER_ACTION_ITEM;

        @pmi0("type_video_player_change_mode")
        public static final Type TYPE_VIDEO_PLAYER_CHANGE_MODE;

        @pmi0("type_video_push_settings_banner")
        public static final Type TYPE_VIDEO_PUSH_SETTINGS_BANNER;

        @pmi0("type_video_screen_lock_action")
        public static final Type TYPE_VIDEO_SCREEN_LOCK_ACTION;

        @pmi0("type_video_show_similars_button_action")
        public static final Type TYPE_VIDEO_SHOW_SIMILARS_BUTTON_ACTION;

        @pmi0("type_video_subtitles_action")
        public static final Type TYPE_VIDEO_SUBTITLES_ACTION;

        @pmi0("type_video_suggest_downloads_appearance_item")
        public static final Type TYPE_VIDEO_SUGGEST_DOWNLOADS_APPEARANCE_ITEM;

        @pmi0("type_video_to_clip_upload")
        public static final Type TYPE_VIDEO_TO_CLIP_UPLOAD;

        @pmi0("type_video_upload_author_select")
        public static final Type TYPE_VIDEO_UPLOAD_AUTHOR_SELECT;

        @pmi0("type_video_upload_cover_action")
        public static final Type TYPE_VIDEO_UPLOAD_COVER_ACTION;

        @pmi0("type_video_upload_cover_apply_photo")
        public static final Type TYPE_VIDEO_UPLOAD_COVER_APPLY_PHOTO;

        @pmi0("type_vk_bridge")
        public static final Type TYPE_VK_BRIDGE;

        @pmi0("type_vk_connect_navigation_item")
        public static final Type TYPE_VK_CONNECT_NAVIGATION_ITEM;

        @pmi0("type_vk_connect_questionnaire")
        public static final Type TYPE_VK_CONNECT_QUESTIONNAIRE;

        @pmi0("type_vk_pay_checkout_item")
        public static final Type TYPE_VK_PAY_CHECKOUT_ITEM;

        @pmi0("type_vk_run_item")
        public static final Type TYPE_VK_RUN_ITEM;

        @pmi0("type_vk_workout_item")
        public static final Type TYPE_VK_WORKOUT_ITEM;

        @pmi0("type_voip_call_item")
        public static final Type TYPE_VOIP_CALL_ITEM;

        @pmi0("type_voip_error_item")
        public static final Type TYPE_VOIP_ERROR_ITEM;

        @pmi0("type_voip_import_contacts_action")
        public static final Type TYPE_VOIP_IMPORT_CONTACTS_ACTION;

        @pmi0("type_voip_sync_contacts_modal_action")
        public static final Type TYPE_VOIP_SYNC_CONTACTS_MODAL_ACTION;

        @pmi0("type_wishlist_item")
        public static final Type TYPE_WISHLIST_ITEM;

        static {
            Type type = new Type("TYPE_FEED_SHOW_PRODUCT_PIN", 0);
            TYPE_FEED_SHOW_PRODUCT_PIN = type;
            Type type2 = new Type("TYPE_FEED_SHOW_TICKET_ITEM_PIN", 1);
            TYPE_FEED_SHOW_TICKET_ITEM_PIN = type2;
            Type type3 = new Type("TYPE_REGISTRATION_ITEM", 2);
            TYPE_REGISTRATION_ITEM = type3;
            Type type4 = new Type("TYPE_VK_CONNECT_NAVIGATION_ITEM", 3);
            TYPE_VK_CONNECT_NAVIGATION_ITEM = type4;
            Type type5 = new Type("TYPE_WISHLIST_ITEM", 4);
            TYPE_WISHLIST_ITEM = type5;
            Type type6 = new Type("TYPE_STORY_PUBLISH_ITEM", 5);
            TYPE_STORY_PUBLISH_ITEM = type6;
            Type type7 = new Type("TYPE_MARKETING_TRANSITION_ITEM", 6);
            TYPE_MARKETING_TRANSITION_ITEM = type7;
            Type type8 = new Type("TYPE_VOIP_CALL_ITEM", 7);
            TYPE_VOIP_CALL_ITEM = type8;
            Type type9 = new Type("TYPE_VOIP_ERROR_ITEM", 8);
            TYPE_VOIP_ERROR_ITEM = type9;
            Type type10 = new Type("TYPE_VOIP_IMPORT_CONTACTS_ACTION", 9);
            TYPE_VOIP_IMPORT_CONTACTS_ACTION = type10;
            Type type11 = new Type("TYPE_VOIP_SYNC_CONTACTS_MODAL_ACTION", 10);
            TYPE_VOIP_SYNC_CONTACTS_MODAL_ACTION = type11;
            Type type12 = new Type("TYPE_UI_HINT_ITEM", 11);
            TYPE_UI_HINT_ITEM = type12;
            Type type13 = new Type("TYPE_VK_BRIDGE", 12);
            TYPE_VK_BRIDGE = type13;
            Type type14 = new Type("TYPE_UNIVERSAL_WIDGET", 13);
            TYPE_UNIVERSAL_WIDGET = type14;
            Type type15 = new Type("TYPE_MARKET_ITEM", 14);
            TYPE_MARKET_ITEM = type15;
            Type type16 = new Type("TYPE_ADD_ITEM_TO_CART", 15);
            TYPE_ADD_ITEM_TO_CART = type16;
            Type type17 = new Type("TYPE_REMOVE_ITEM_FROM_CART_ITEM", 16);
            TYPE_REMOVE_ITEM_FROM_CART_ITEM = type17;
            Type type18 = new Type("TYPE_VIDEO_OPEN_AUTHOR_CABINET", 17);
            TYPE_VIDEO_OPEN_AUTHOR_CABINET = type18;
            Type type19 = new Type("TYPE_MARKET_UPDATED_DELIVERY_BLOCK", 18);
            TYPE_MARKET_UPDATED_DELIVERY_BLOCK = type19;
            Type type20 = new Type("TYPE_PUSH_REQUEST_ITEM", 19);
            TYPE_PUSH_REQUEST_ITEM = type20;
            Type type21 = new Type("TYPE_VK_PAY_CHECKOUT_ITEM", 20);
            TYPE_VK_PAY_CHECKOUT_ITEM = type21;
            Type type22 = new Type("TYPE_SAK_SESSIONS_EVENT_ITEM", 21);
            TYPE_SAK_SESSIONS_EVENT_ITEM = type22;
            Type type23 = new Type("TYPE_EASTER_EGGS_ITEM", 22);
            TYPE_EASTER_EGGS_ITEM = type23;
            Type type24 = new Type("TYPE_VK_RUN_ITEM", 23);
            TYPE_VK_RUN_ITEM = type24;
            Type type25 = new Type("TYPE_VK_WORKOUT_ITEM", 24);
            TYPE_VK_WORKOUT_ITEM = type25;
            Type type26 = new Type("TYPE_HEALTH_SYNC_STATE_ITEM", 25);
            TYPE_HEALTH_SYNC_STATE_ITEM = type26;
            Type type27 = new Type("TYPE_HEALTH_PERMISSION_RESULT_ITEM", 26);
            TYPE_HEALTH_PERMISSION_RESULT_ITEM = type27;
            Type type28 = new Type("TYPE_HEALTH_CONNECT_INFO_ITEM", 27);
            TYPE_HEALTH_CONNECT_INFO_ITEM = type28;
            Type type29 = new Type("TYPE_SYSTEM_WIDGET_REFRESH_EVENT_ITEM", 28);
            TYPE_SYSTEM_WIDGET_REFRESH_EVENT_ITEM = type29;
            Type type30 = new Type("TYPE_SYSTEM_WIDGET_ADD_EVENT_ITEM", 29);
            TYPE_SYSTEM_WIDGET_ADD_EVENT_ITEM = type30;
            Type type31 = new Type("TYPE_SYSTEM_WIDGET_REMOVE_EVENT_ITEM", 30);
            TYPE_SYSTEM_WIDGET_REMOVE_EVENT_ITEM = type31;
            Type type32 = new Type("TYPE_SYSTEM_WIDGET_DISPLAYED_EVENT_ITEM", 31);
            TYPE_SYSTEM_WIDGET_DISPLAYED_EVENT_ITEM = type32;
            Type type33 = new Type("TYPE_PUSH_NOTIFICATIONS_SETTINGS", 32);
            TYPE_PUSH_NOTIFICATIONS_SETTINGS = type33;
            Type type34 = new Type("TYPE_AUDIO_LYRICS_ITEM", 33);
            TYPE_AUDIO_LYRICS_ITEM = type34;
            Type type35 = new Type("TYPE_AUDIO_OFFLINE_ITEM", 34);
            TYPE_AUDIO_OFFLINE_ITEM = type35;
            Type type36 = new Type("TYPE_AUDIO_MIX_OPTIONS_ITEM", 35);
            TYPE_AUDIO_MIX_OPTIONS_ITEM = type36;
            Type type37 = new Type("TYPE_CAST_EVENT_ITEM", 36);
            TYPE_CAST_EVENT_ITEM = type37;
            Type type38 = new Type("TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM", 37);
            TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM = type38;
            Type type39 = new Type("TYPE_MESSAGING_ACTION_ITEM", 38);
            TYPE_MESSAGING_ACTION_ITEM = type39;
            Type type40 = new Type("TYPE_MESSAGING_AUDIO_MESSAGE_ITEM", 39);
            TYPE_MESSAGING_AUDIO_MESSAGE_ITEM = type40;
            Type type41 = new Type("TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM", 40);
            TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM = type41;
            Type type42 = new Type("TYPE_MINI_APP_ACCESS_TOKEN_ITEM", 41);
            TYPE_MINI_APP_ACCESS_TOKEN_ITEM = type42;
            Type type43 = new Type("TYPE_MINI_APP_CUSTOM_EVENT_ITEM", 42);
            TYPE_MINI_APP_CUSTOM_EVENT_ITEM = type43;
            Type type44 = new Type("TYPE_MINI_APP_OPEN_ITEM", 43);
            TYPE_MINI_APP_OPEN_ITEM = type44;
            Type type45 = new Type("TYPE_MINI_APP_SESSION_ITEM", 44);
            TYPE_MINI_APP_SESSION_ITEM = type45;
            Type type46 = new Type("TYPE_MINI_APPS_INSTALL_SCREEN", 45);
            TYPE_MINI_APPS_INSTALL_SCREEN = type46;
            Type type47 = new Type("TYPE_MINI_APPS_PERSONAL_DISCOUNT", 46);
            TYPE_MINI_APPS_PERSONAL_DISCOUNT = type47;
            Type type48 = new Type("TYPE_MINI_APPS_CLOSE_CONFIRMATION_ALERT_ITEM", 47);
            TYPE_MINI_APPS_CLOSE_CONFIRMATION_ALERT_ITEM = type48;
            Type type49 = new Type("TYPE_FEED_BLOCK_MINI_APPS_ITEM", 48);
            TYPE_FEED_BLOCK_MINI_APPS_ITEM = type49;
            Type type50 = new Type("TYPE_STORY_FEED_VIEW_ITEM", 49);
            TYPE_STORY_FEED_VIEW_ITEM = type50;
            Type type51 = new Type("TYPE_STORY_VIEW_ITEM", 50);
            TYPE_STORY_VIEW_ITEM = type51;
            Type type52 = new Type("TYPE_MARUSIA_CONVERSATION_ITEM", 51);
            TYPE_MARUSIA_CONVERSATION_ITEM = type52;
            Type type53 = new Type("TYPE_MARUSIA_READING_ITEM", 52);
            TYPE_MARUSIA_READING_ITEM = type53;
            Type type54 = new Type("TYPE_MARUSIA_SETTINGS_ITEM", 53);
            TYPE_MARUSIA_SETTINGS_ITEM = type54;
            Type type55 = new Type("TYPE_VK_CONNECT_QUESTIONNAIRE", 54);
            TYPE_VK_CONNECT_QUESTIONNAIRE = type55;
            Type type56 = new Type("TYPE_SUPERAPP_SNOW_ITEM", 55);
            TYPE_SUPERAPP_SNOW_ITEM = type56;
            Type type57 = new Type("TYPE_CALLER_ID_EVENT_ITEM", 56);
            TYPE_CALLER_ID_EVENT_ITEM = type57;
            Type type58 = new Type("TYPE_SUPERAPP_STATLOG_ITEM", 57);
            TYPE_SUPERAPP_STATLOG_ITEM = type58;
            Type type59 = new Type("TYPE_OWNER_BUTTON_APP_RENDER_ITEM", 58);
            TYPE_OWNER_BUTTON_APP_RENDER_ITEM = type59;
            Type type60 = new Type("TYPE_SEARCH_ITEM", 59);
            TYPE_SEARCH_ITEM = type60;
            Type type61 = new Type("TYPE_SUPERAPP_SCREEN_ITEM", 60);
            TYPE_SUPERAPP_SCREEN_ITEM = type61;
            Type type62 = new Type("TYPE_SUPERAPP_ONBOARDING_ACTION_ITEM", 61);
            TYPE_SUPERAPP_ONBOARDING_ACTION_ITEM = type62;
            Type type63 = new Type("TYPE_CLIP_POPULAR_TEMPLATES_BLOCK", 62);
            TYPE_CLIP_POPULAR_TEMPLATES_BLOCK = type63;
            Type type64 = new Type("TYPE_CLIP_TEMPLATE_ITEM", 63);
            TYPE_CLIP_TEMPLATE_ITEM = type64;
            Type type65 = new Type("TYPE_CLIP_PUBLISH_ITEM", 64);
            TYPE_CLIP_PUBLISH_ITEM = type65;
            Type type66 = new Type("TYPE_CLIP_MUSIC_CATALOG_ITEM", 65);
            TYPE_CLIP_MUSIC_CATALOG_ITEM = type66;
            Type type67 = new Type("TYPE_CLIP_CAMERA_ITEM", 66);
            TYPE_CLIP_CAMERA_ITEM = type67;
            Type type68 = new Type("TYPE_CLIP_COOWNERS_ITEM", 67);
            TYPE_CLIP_COOWNERS_ITEM = type68;
            Type type69 = new Type("TYPE_CLIP_EDITOR_ITEM", 68);
            TYPE_CLIP_EDITOR_ITEM = type69;
            Type type70 = new Type("TYPE_CLIP_EDIT_ITEM", 69);
            TYPE_CLIP_EDIT_ITEM = type70;
            Type type71 = new Type("TYPE_CLIP_VIEWER_ITEM", 70);
            TYPE_CLIP_VIEWER_ITEM = type71;
            Type type72 = new Type("TYPE_CLIP_COMMENT_SHARING_ITEM", 71);
            TYPE_CLIP_COMMENT_SHARING_ITEM = type72;
            Type type73 = new Type("TYPE_CLIP_SCROLL_AFTER_BITE", 72);
            TYPE_CLIP_SCROLL_AFTER_BITE = type73;
            Type type74 = new Type("TYPE_CLIP_COMMENT_SORT_ITEM", 73);
            TYPE_CLIP_COMMENT_SORT_ITEM = type74;
            Type type75 = new Type("TYPE_CLIPS_TRENDS_CATALOG_ITEM", 74);
            TYPE_CLIPS_TRENDS_CATALOG_ITEM = type75;
            Type type76 = new Type("TYPE_LIVE_VIEWER_ITEM", 75);
            TYPE_LIVE_VIEWER_ITEM = type76;
            Type type77 = new Type("TYPE_ADS_BANNER", 76);
            TYPE_ADS_BANNER = type77;
            Type type78 = new Type("TYPE_MINI_APPS_ADS_REQUEST", 77);
            TYPE_MINI_APPS_ADS_REQUEST = type78;
            Type type79 = new Type("TYPE_MINI_APPS_ADS_NATIVE", 78);
            TYPE_MINI_APPS_ADS_NATIVE = type79;
            Type type80 = new Type("TYPE_REWARDED_ADS_SHOW_ACTION_ITEM", 79);
            TYPE_REWARDED_ADS_SHOW_ACTION_ITEM = type80;
            Type type81 = new Type("TYPE_COMMUNITY_ONBOARDING_ACTION", 80);
            TYPE_COMMUNITY_ONBOARDING_ACTION = type81;
            Type type82 = new Type("TYPE_VIDEO_PLAYER_ACTION_ITEM", 81);
            TYPE_VIDEO_PLAYER_ACTION_ITEM = type82;
            Type type83 = new Type("TYPE_FEED_ADS_INSERT", 82);
            TYPE_FEED_ADS_INSERT = type83;
            Type type84 = new Type("TYPE_FEED_SDK_AD_REQUEST", 83);
            TYPE_FEED_SDK_AD_REQUEST = type84;
            Type type85 = new Type("TYPE_FEED_ASYNC_BLOCK_ERROR", 84);
            TYPE_FEED_ASYNC_BLOCK_ERROR = type85;
            Type type86 = new Type("TYPE_FEED_ACTION_BUTTON_ITEM", 85);
            TYPE_FEED_ACTION_BUTTON_ITEM = type86;
            Type type87 = new Type("TYPE_FEED_DUPLICATE_OWNER_POST", 86);
            TYPE_FEED_DUPLICATE_OWNER_POST = type87;
            Type type88 = new Type("TYPE_PUSH_EVENT_ITEM", 87);
            TYPE_PUSH_EVENT_ITEM = type88;
            Type type89 = new Type("TYPE_RADIO_STATION_ITEM", 88);
            TYPE_RADIO_STATION_ITEM = type89;
            Type type90 = new Type("TYPE_LOCAL_SEARCH_ITEM", 89);
            TYPE_LOCAL_SEARCH_ITEM = type90;
            Type type91 = new Type("TYPE_AUDIO_LONGTAP_ITEM", 90);
            TYPE_AUDIO_LONGTAP_ITEM = type91;
            Type type92 = new Type("TYPE_VIDEO_IN_APP_REVIEW_INITIAL_APPEARANCE_ITEM", 91);
            TYPE_VIDEO_IN_APP_REVIEW_INITIAL_APPEARANCE_ITEM = type92;
            Type type93 = new Type("TYPE_BOOKMARKS_ACTION", 92);
            TYPE_BOOKMARKS_ACTION = type93;
            Type type94 = new Type("TYPE_AUDIO_SNIPPET_ITEM", 93);
            TYPE_AUDIO_SNIPPET_ITEM = type94;
            Type type95 = new Type("TYPE_MOTIVATION_ITEM", 94);
            TYPE_MOTIVATION_ITEM = type95;
            Type type96 = new Type("TYPE_CLIPS_CREATION_SCREEN_ITEM", 95);
            TYPE_CLIPS_CREATION_SCREEN_ITEM = type96;
            Type type97 = new Type("TYPE_CLIPS_CREATION_SCREEN_BUTTONS_ITEM", 96);
            TYPE_CLIPS_CREATION_SCREEN_BUTTONS_ITEM = type97;
            Type type98 = new Type("TYPE_AUDIO_LISTENING_ITEM", 97);
            TYPE_AUDIO_LISTENING_ITEM = type98;
            Type type99 = new Type("TYPE_AUDIOBOOK_ACT_ITEM", 98);
            TYPE_AUDIOBOOK_ACT_ITEM = type99;
            Type type100 = new Type("TYPE_AUDIO_TAP_PLAY_EVENT_ITEM", 99);
            TYPE_AUDIO_TAP_PLAY_EVENT_ITEM = type100;
            Type type101 = new Type("TYPE_AUDIO_TAP_SHOW_EVENT_ITEM", 100);
            TYPE_AUDIO_TAP_SHOW_EVENT_ITEM = type101;
            Type type102 = new Type("TYPE_AUDIO_TAP_STOP_EVENT_ITEM", 101);
            TYPE_AUDIO_TAP_STOP_EVENT_ITEM = type102;
            Type type103 = new Type("TYPE_AUDIO_TAP_TIMER_EVENT_ITEM", 102);
            TYPE_AUDIO_TAP_TIMER_EVENT_ITEM = type103;
            Type type104 = new Type("TYPE_AUDIO_TAP_STATUS_EVENT_ITEM", 103);
            TYPE_AUDIO_TAP_STATUS_EVENT_ITEM = type104;
            Type type105 = new Type("TYPE_AUDIO_TAP_SEARCH_EVENT_ITEM", 104);
            TYPE_AUDIO_TAP_SEARCH_EVENT_ITEM = type105;
            Type type106 = new Type("TYPE_AUDIO_TAP_UPD_COLLECTION_EVENT_ITEM", 105);
            TYPE_AUDIO_TAP_UPD_COLLECTION_EVENT_ITEM = type106;
            Type type107 = new Type("TYPE_AUDIO_TAP_EVENT_ITEM", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            TYPE_AUDIO_TAP_EVENT_ITEM = type107;
            Type type108 = new Type("TYPE_AUDIO_TAP_CLOSE_COACHMARK_ITEM", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            TYPE_AUDIO_TAP_CLOSE_COACHMARK_ITEM = type108;
            Type type109 = new Type("TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM", 108);
            TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM = type109;
            Type type110 = new Type("TYPE_AUDIO_TAP_POPUP_EVENT_ITEM", 109);
            TYPE_AUDIO_TAP_POPUP_EVENT_ITEM = type110;
            Type type111 = new Type("TYPE_IM_CONVERSATIONS_BANNER_ITEM", 110);
            TYPE_IM_CONVERSATIONS_BANNER_ITEM = type111;
            Type type112 = new Type("TYPE_IM_CHANNEL_JOIN_ACTION", 111);
            TYPE_IM_CHANNEL_JOIN_ACTION = type112;
            Type type113 = new Type("TYPE_MUSIC_SUBSCRIPTION_ITEM", 112);
            TYPE_MUSIC_SUBSCRIPTION_ITEM = type113;
            Type type114 = new Type("TYPE_VIDEO_SUGGEST_DOWNLOADS_APPEARANCE_ITEM", 113);
            TYPE_VIDEO_SUGGEST_DOWNLOADS_APPEARANCE_ITEM = type114;
            Type type115 = new Type("TYPE_RECOM_THEMES_ITEM", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            TYPE_RECOM_THEMES_ITEM = type115;
            Type type116 = new Type("TYPE_ONBOARDING_USECASES_ITEM", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            TYPE_ONBOARDING_USECASES_ITEM = type116;
            Type type117 = new Type("TYPE_TABBAR_ITEM", 116);
            TYPE_TABBAR_ITEM = type117;
            Type type118 = new Type("TYPE_FEED_BLOCK_RECOMMENDED_PLAYLISTS_ITEM", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            TYPE_FEED_BLOCK_RECOMMENDED_PLAYLISTS_ITEM = type118;
            Type type119 = new Type("TYPE_PERMISSION_CHANGE", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            TYPE_PERMISSION_CHANGE = type119;
            Type type120 = new Type("TYPE_SNOWBALL_EVENTS", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            TYPE_SNOWBALL_EVENTS = type120;
            Type type121 = new Type("TYPE_AUDIO_DISLIKE_ITEM", 120);
            TYPE_AUDIO_DISLIKE_ITEM = type121;
            Type type122 = new Type("TYPE_AUDIO_COACHMARK_ITEM", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            TYPE_AUDIO_COACHMARK_ITEM = type122;
            Type type123 = new Type("TYPE_MT_TIMESPENT_ITEM", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            TYPE_MT_TIMESPENT_ITEM = type123;
            Type type124 = new Type("TYPE_SECURE_LOCK_ENTRANCE_ITEM", 123);
            TYPE_SECURE_LOCK_ENTRANCE_ITEM = type124;
            Type type125 = new Type("TYPE_AUDIO_ONBOARDING_ITEM", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            TYPE_AUDIO_ONBOARDING_ITEM = type125;
            Type type126 = new Type("TYPE_AUDIO_AUTO_ITEM", 125);
            TYPE_AUDIO_AUTO_ITEM = type126;
            Type type127 = new Type("TYPE_AUDIO_DOWNLOAD_ITEM", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            TYPE_AUDIO_DOWNLOAD_ITEM = type127;
            Type type128 = new Type("TYPE_FEED_STOP_PAGINATION", 127);
            TYPE_FEED_STOP_PAGINATION = type128;
            Type type129 = new Type("TYPE_FEED_SHOW_FRESH_NEWS_BUTTON", 128);
            TYPE_FEED_SHOW_FRESH_NEWS_BUTTON = type129;
            Type type130 = new Type("TYPE_FEED_FEED_SCROLL_TO_TOP", 129);
            TYPE_FEED_FEED_SCROLL_TO_TOP = type130;
            Type type131 = new Type("TYPE_FEED_FEED_REFRESH", 130);
            TYPE_FEED_FEED_REFRESH = type131;
            Type type132 = new Type("TYPE_FEED_ZOOM_PHOTO", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            TYPE_FEED_ZOOM_PHOTO = type132;
            Type type133 = new Type("TYPE_DONUT_GOAL", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            TYPE_DONUT_GOAL = type133;
            Type type134 = new Type("TYPE_DONUT_PRIVACY_SETTING_CHANGED_ITEM", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            TYPE_DONUT_PRIVACY_SETTING_CHANGED_ITEM = type134;
            Type type135 = new Type("TYPE_VIDEO_KIDS_MODE_CHANGED_EVENT", 134);
            TYPE_VIDEO_KIDS_MODE_CHANGED_EVENT = type135;
            Type type136 = new Type("TYPE_IM_INVITATION_CARD_REJECT_ACTION", 135);
            TYPE_IM_INVITATION_CARD_REJECT_ACTION = type136;
            Type type137 = new Type("TYPE_TV_KID_MODE_ITEM", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            TYPE_TV_KID_MODE_ITEM = type137;
            Type type138 = new Type("TYPE_FEED_POST_START_AUDIO", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            TYPE_FEED_POST_START_AUDIO = type138;
            Type type139 = new Type("TYPE_FEED_POST_START_PLAYLIST", 138);
            TYPE_FEED_POST_START_PLAYLIST = type139;
            Type type140 = new Type("TYPE_UNIVERSAL_BANNER", 139);
            TYPE_UNIVERSAL_BANNER = type140;
            Type type141 = new Type("TYPE_VIDEO_PUSH_SETTINGS_BANNER", VersionConstants.PRODUCT_MAJOR_VERSION);
            TYPE_VIDEO_PUSH_SETTINGS_BANNER = type141;
            Type type142 = new Type("TYPE_UPLOAD_EXIT_CONFIRMATION_DIALOG", 141);
            TYPE_UPLOAD_EXIT_CONFIRMATION_DIALOG = type142;
            Type type143 = new Type("TYPE_VIDEO_DOWNLOAD_SKIP_ACTION", 142);
            TYPE_VIDEO_DOWNLOAD_SKIP_ACTION = type143;
            Type type144 = new Type("TYPE_VIDEO_DYNAMIC_TABS_ONBOARDING_ITEM", 143);
            TYPE_VIDEO_DYNAMIC_TABS_ONBOARDING_ITEM = type144;
            Type type145 = new Type("TYPE_EXTERNAL_DEVICE_ACTION", 144);
            TYPE_EXTERNAL_DEVICE_ACTION = type145;
            Type type146 = new Type("TYPE_SCREENCAST_CODE_ACTION", 145);
            TYPE_SCREENCAST_CODE_ACTION = type146;
            Type type147 = new Type("TYPE_VIDEO_DOWNLOAD_WAIT_FOR_USER_ACTION", 146);
            TYPE_VIDEO_DOWNLOAD_WAIT_FOR_USER_ACTION = type147;
            Type type148 = new Type("TYPE_VIDEO_TO_CLIP_UPLOAD", 147);
            TYPE_VIDEO_TO_CLIP_UPLOAD = type148;
            Type type149 = new Type("TYPE_TV_KID_MODE_ITEM_LOGOUT", 148);
            TYPE_TV_KID_MODE_ITEM_LOGOUT = type149;
            Type type150 = new Type("TYPE_VIDEO_UPLOAD_AUTHOR_SELECT", 149);
            TYPE_VIDEO_UPLOAD_AUTHOR_SELECT = type150;
            Type type151 = new Type("TYPE_VIDEO_KIDS_AGE_FILTER_SELECT", 150);
            TYPE_VIDEO_KIDS_AGE_FILTER_SELECT = type151;
            Type type152 = new Type("TYPE_VIDEO_KIDS_AGE_FILTER_RESET", 151);
            TYPE_VIDEO_KIDS_AGE_FILTER_RESET = type152;
            Type type153 = new Type("TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM", 152);
            TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM = type153;
            Type type154 = new Type("TYPE_SELECT_CREATORS_CLICK_ITEM", 153);
            TYPE_SELECT_CREATORS_CLICK_ITEM = type154;
            Type type155 = new Type("TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK", 154);
            TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK = type155;
            Type type156 = new Type("TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK", 155);
            TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK = type156;
            Type type157 = new Type("TYPE_FEED_POST_PLAYED_UNIT_OF_AUDIO", 156);
            TYPE_FEED_POST_PLAYED_UNIT_OF_AUDIO = type157;
            Type type158 = new Type("TYPE_VIDEO_NEXT_VIDEO_START_ACTION", 157);
            TYPE_VIDEO_NEXT_VIDEO_START_ACTION = type158;
            Type type159 = new Type("TYPE_VIDEO_UPLOAD_COVER_ACTION", 158);
            TYPE_VIDEO_UPLOAD_COVER_ACTION = type159;
            Type type160 = new Type("TYPE_VIDEO_UPLOAD_COVER_APPLY_PHOTO", 159);
            TYPE_VIDEO_UPLOAD_COVER_APPLY_PHOTO = type160;
            Type type161 = new Type("TYPE_VIDEO_CREATE_CHANNEL_ACTION", 160);
            TYPE_VIDEO_CREATE_CHANNEL_ACTION = type161;
            Type type162 = new Type("TYPE_VIDEO_ATTACH_OBJECT_TO_VIDEO", 161);
            TYPE_VIDEO_ATTACH_OBJECT_TO_VIDEO = type162;
            Type type163 = new Type("TYPE_UXPOLLS_EVENT", 162);
            TYPE_UXPOLLS_EVENT = type163;
            Type type164 = new Type("TYPE_TV_KID_PROFILE_ITEM", 163);
            TYPE_TV_KID_PROFILE_ITEM = type164;
            Type type165 = new Type("TYPE_VIDEO_CHILD_PROFILE_ACTIONS", 164);
            TYPE_VIDEO_CHILD_PROFILE_ACTIONS = type165;
            Type type166 = new Type("TYPE_LIVE_ACTIONS", 165);
            TYPE_LIVE_ACTIONS = type166;
            Type type167 = new Type("TYPE_VIDEO_PLAYER_CHANGE_MODE", 166);
            TYPE_VIDEO_PLAYER_CHANGE_MODE = type167;
            Type type168 = new Type("TYPE_TOPSHELF_ACTION", 167);
            TYPE_TOPSHELF_ACTION = type168;
            Type type169 = new Type("TYPE_VIDEO_APPLE_TOP_SHELF_CLICK", 168);
            TYPE_VIDEO_APPLE_TOP_SHELF_CLICK = type169;
            Type type170 = new Type("TYPE_CLIPS_STAT_ADS_ACTION", 169);
            TYPE_CLIPS_STAT_ADS_ACTION = type170;
            Type type171 = new Type("TYPE_VIDEO_SCREEN_LOCK_ACTION", 170);
            TYPE_VIDEO_SCREEN_LOCK_ACTION = type171;
            Type type172 = new Type("TYPE_VIDEO_DISCOVERY_TABS_ACTION", 171);
            TYPE_VIDEO_DISCOVERY_TABS_ACTION = type172;
            Type type173 = new Type("TYPE_VIDEO_SUBTITLES_ACTION", 172);
            TYPE_VIDEO_SUBTITLES_ACTION = type173;
            Type type174 = new Type("TYPE_VIDEO_SHOW_SIMILARS_BUTTON_ACTION", 173);
            TYPE_VIDEO_SHOW_SIMILARS_BUTTON_ACTION = type174;
            Type type175 = new Type("TYPE_VIDEO_OPEN_SIMILARS_ACTION", 174);
            TYPE_VIDEO_OPEN_SIMILARS_ACTION = type175;
            Type type176 = new Type("TYPE_SIMILAR_CHANNELS_BLOCK", 175);
            TYPE_SIMILAR_CHANNELS_BLOCK = type176;
            Type type177 = new Type("TYPE_SIMILAR_CHANNELS_CARD_SHOW", 176);
            TYPE_SIMILAR_CHANNELS_CARD_SHOW = type177;
            Type type178 = new Type("TYPE_VIDEO_AD_TRIAL_ACTION", 177);
            TYPE_VIDEO_AD_TRIAL_ACTION = type178;
            Type type179 = new Type("TYPE_OVERLAY_AD_REQUEST", 178);
            TYPE_OVERLAY_AD_REQUEST = type179;
            Type type180 = new Type("TYPE_OVERLAY_AD_RESPONSE", 179);
            TYPE_OVERLAY_AD_RESPONSE = type180;
            Type type181 = new Type("TYPE_OVERLAY_AD_CLOSE", 180);
            TYPE_OVERLAY_AD_CLOSE = type181;
            Type type182 = new Type("TYPE_OVERLAY_AD_MENU_ACTION", 181);
            TYPE_OVERLAY_AD_MENU_ACTION = type182;
            Type type183 = new Type("TYPE_OVERLAY_AD_CONFIG_BLOCKED", 182);
            TYPE_OVERLAY_AD_CONFIG_BLOCKED = type183;
            Type type184 = new Type("TYPE_OVERLAY_AD_IMPRESSION", 183);
            TYPE_OVERLAY_AD_IMPRESSION = type184;
            Type type185 = new Type("TYPE_SHUTDOWN_DETECTION_ACTION_ITEM", 184);
            TYPE_SHUTDOWN_DETECTION_ACTION_ITEM = type185;
            Type type186 = new Type("TYPE_PIN_VIDEO_ACTION", 185);
            TYPE_PIN_VIDEO_ACTION = type186;
            Type type187 = new Type("TYPE_SPORT_DIRECT_LINK_OPENED", 186);
            TYPE_SPORT_DIRECT_LINK_OPENED = type187;
            Type type188 = new Type("TYPE_CORE_NETWORK_BAD_CONNECTION_ACTION", 187);
            TYPE_CORE_NETWORK_BAD_CONNECTION_ACTION = type188;
            Type type189 = new Type("TYPE_FEED_SHOW_MORE_SHOPS_BUTTON", 188);
            TYPE_FEED_SHOW_MORE_SHOPS_BUTTON = type189;
            Type type190 = new Type("TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLOSE", PsExtractor.PRIVATE_STREAM_1);
            TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLOSE = type190;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54, type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74, type75, type76, type77, type78, type79, type80, type81, type82, type83, type84, type85, type86, type87, type88, type89, type90, type91, type92, type93, type94, type95, type96, type97, type98, type99, type100, type101, type102, type103, type104, type105, type106, type107, type108, type109, type110, type111, type112, type113, type114, type115, type116, type117, type118, type119, type120, type121, type122, type123, type124, type125, type126, type127, type128, type129, type130, type131, type132, type133, type134, type135, type136, type137, type138, type139, type140, type141, type142, type143, type144, type145, type146, type147, type148, type149, type150, type151, type152, type153, type154, type155, type156, type157, type158, type159, type160, type161, type162, type163, type164, type165, type166, type167, type168, type169, type170, type171, type172, type173, type174, type175, type176, type177, type178, type179, type180, type181, type182, type183, type184, type185, type186, type187, type188, type189, type190};
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
        public static SchemeStat$TypeAction a(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, b bVar) {
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowProductPin) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_SHOW_PRODUCT_PIN, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowProductPin) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388616, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_SHOW_TICKET_ITEM_PIN, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777224, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeRegistrationItem) {
                return new SchemeStat$TypeAction(Type.TYPE_REGISTRATION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, (SchemeStat$TypeRegistrationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -40, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeVkConnectNavigationItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VK_CONNECT_NAVIGATION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVkConnectNavigationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -257, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeWishlistItem) {
                return new SchemeStat$TypeAction(Type.TYPE_WISHLIST_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeWishlistItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2049, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsStoriesStat$TypeStoryPublishItem) {
                return new SchemeStat$TypeAction(Type.TYPE_STORY_PUBLISH_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsStoriesStat$TypeStoryPublishItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -4097, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketingTransitionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MARKETING_TRANSITION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketingTransitionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -8193, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipCallItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VOIP_CALL_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipCallItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -16385, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipErrorItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VOIP_ERROR_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipErrorItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -32769, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipImportContactsAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VOIP_IMPORT_CONTACTS_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipImportContactsAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -65537, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VOIP_SYNC_CONTACTS_MODAL_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -131073, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonOnboardingStat$TypeUiHintItem) {
                return new SchemeStat$TypeAction(Type.TYPE_UI_HINT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonOnboardingStat$TypeUiHintItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -262145, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeVkBridge) {
                return new SchemeStat$TypeAction(Type.TYPE_VK_BRIDGE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVkBridge) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -524289, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeUniversalWidget) {
                return new SchemeStat$TypeAction(Type.TYPE_UNIVERSAL_WIDGET, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeUniversalWidget) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1048577, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MARKET_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2097153, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeAddItemToCart) {
                return new SchemeStat$TypeAction(Type.TYPE_ADD_ITEM_TO_CART, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeAddItemToCart) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -4194305, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem) {
                return new SchemeStat$TypeAction(Type.TYPE_REMOVE_ITEM_FROM_CART_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -8388609, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoOpenAuthorCabinet) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_OPEN_AUTHOR_CABINET, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoOpenAuthorCabinet) bVar, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -16777217, 1, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketDeliveryBlockUpdatedItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MARKET_UPDATED_DELIVERY_BLOCK, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketDeliveryBlockUpdatedItem) bVar, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -33554433, 1, null);
            }
            if (bVar instanceof SchemeStat$TypePushRequestItem) {
                return new SchemeStat$TypeAction(Type.TYPE_PUSH_REQUEST_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypePushRequestItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -16777217, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeVkPayCheckoutItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VK_PAY_CHECKOUT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVkPayCheckoutItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -33554433, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeSakSessionsEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SAK_SESSIONS_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSakSessionsEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -67108865, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeEasterEggsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_EASTER_EGGS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeEasterEggsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -17, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeVkRunItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VK_RUN_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVkRunItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -33, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeVkWorkoutItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VK_WORKOUT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVkWorkoutItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -65, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsHealthStat$TypeHealthSyncStateItem) {
                return new SchemeStat$TypeAction(Type.TYPE_HEALTH_SYNC_STATE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsHealthStat$TypeHealthSyncStateItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -129, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem) {
                return new SchemeStat$TypeAction(Type.TYPE_HEALTH_PERMISSION_RESULT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -257, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem) {
                return new SchemeStat$TypeAction(Type.TYPE_HEALTH_CONNECT_INFO_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -513, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SYSTEM_WIDGET_REFRESH_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1025, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SYSTEM_WIDGET_ADD_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -4097, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SYSTEM_WIDGET_REMOVE_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -8193, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SYSTEM_WIDGET_DISPLAYED_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2049, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings) {
                return new SchemeStat$TypeAction(Type.TYPE_PUSH_NOTIFICATIONS_SETTINGS, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, (MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -24, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioLyricsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_LYRICS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioLyricsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -513, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeAudioOfflineItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_OFFLINE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeAudioOfflineItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1025, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioMixOptionsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_MIX_OPTIONS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, (CommonAudioStat$TypeAudioMixOptionsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -72, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeCastEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CAST_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeCastEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -16385, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMessagingContactRecommendationsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMessagingContactRecommendationsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -32769, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMessagingActionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MESSAGING_ACTION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMessagingActionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -65537, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMessagingAudioMessageItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MESSAGING_AUDIO_MESSAGE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMessagingAudioMessageItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -131073, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappBirthdayPresentItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappBirthdayPresentItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -262145, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APP_ACCESS_TOKEN_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -5, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppCustomEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APP_CUSTOM_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppCustomEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -524289, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APP_OPEN_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -3, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APP_SESSION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -9, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APPS_INSTALL_SCREEN, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -134217729, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APPS_PERSONAL_DISCOUNT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -268435457, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APPS_CLOSE_CONFIRMATION_ALERT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -536870913, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonFeedStat$TypeFeedBlockMiniAppsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_BLOCK_MINI_APPS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonFeedStat$TypeFeedBlockMiniAppsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1073741825, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem) {
                return new SchemeStat$TypeAction(Type.TYPE_STORY_FEED_VIEW_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, Integer.MAX_VALUE, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsStoriesStat$TypeStoryViewItem) {
                return new SchemeStat$TypeAction(Type.TYPE_STORY_VIEW_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsStoriesStat$TypeStoryViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeConversationItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MARUSIA_CONVERSATION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeConversationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1048577, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeReadingItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MARUSIA_READING_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeReadingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2097153, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeSettingsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MARUSIA_SETTINGS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeSettingsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -4194305, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeVkConnectQuestionnaire) {
                return new SchemeStat$TypeAction(Type.TYPE_VK_CONNECT_QUESTIONNAIRE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVkConnectQuestionnaire) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -8388609, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappSnowItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SUPERAPP_SNOW_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappSnowItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -16777217, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeCallerIdEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CALLER_ID_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeCallerIdEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -33554433, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappStatlogItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SUPERAPP_STATLOG_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappStatlogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -67108865, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeOwnerButtonAppRenderItem) {
                return new SchemeStat$TypeAction(Type.TYPE_OWNER_BUTTON_APP_RENDER_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeOwnerButtonAppRenderItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -134217729, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonSearchStat$TypeSearchItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SEARCH_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonSearchStat$TypeSearchItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -268435457, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappScreenItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SUPERAPP_SCREEN_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1073741825, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SUPERAPP_ONBOARDING_ACTION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, Integer.MAX_VALUE, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_POPULAR_TEMPLATES_BLOCK, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -2, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipTemplateItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_TEMPLATE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipTemplateItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -5, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipPublishItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_PUBLISH_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipPublishItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -9, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_MUSIC_CATALOG_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -17, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipCameraItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_CAMERA_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipCameraItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -33, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipCoownersItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_COOWNERS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipCoownersItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -65, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipEditorItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_EDITOR_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipEditorItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -129, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipEditItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_EDIT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipEditItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -257, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeClipViewerItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_VIEWER_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClipViewerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -513, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipCommentSharingItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_COMMENT_SHARING_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipCommentSharingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1025, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipScrollAfterBite) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_SCROLL_AFTER_BITE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipScrollAfterBite) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -2049, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipCommentSortItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIP_COMMENT_SORT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipCommentSortItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -4097, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIPS_TRENDS_CATALOG_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -3, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeLiveViewerItem) {
                return new SchemeStat$TypeAction(Type.TYPE_LIVE_VIEWER_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeLiveViewerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -16385, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsAdsStat$TypeAdsBanner) {
                return new SchemeStat$TypeAction(Type.TYPE_ADS_BANNER, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsAdsStat$TypeAdsBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -32769, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APPS_ADS_REQUEST, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -65537, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative) {
                return new SchemeStat$TypeAction(Type.TYPE_MINI_APPS_ADS_NATIVE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -131073, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_REWARDED_ADS_SHOW_ACTION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -262145, -1, -1, 1, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityOnboardingAction) {
                return new SchemeStat$TypeAction(Type.TYPE_COMMUNITY_ONBOARDING_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityOnboardingAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -524289, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoPlayerActionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_PLAYER_ACTION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoPlayerActionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1048577, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedAdsInsert) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_ADS_INSERT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedAdsInsert) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -2097153, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_SDK_AD_REQUEST, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -4194305, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_ASYNC_BLOCK_ERROR, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -8388609, -1, -1, 1, null);
            }
            if (bVar instanceof CommonFeedStat$TypeFeedActionButtonItem) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_ACTION_BUTTON_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonFeedStat$TypeFeedActionButtonItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -16777217, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_DUPLICATE_OWNER_POST, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -33554433, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCorePushesStat$TypePushEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_PUSH_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCorePushesStat$TypePushEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -67108865, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeRadioStationItem) {
                return new SchemeStat$TypeAction(Type.TYPE_RADIO_STATION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, (CommonAudioStat$TypeRadioStationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1032, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonSearchStat$TypeLocalSearchItem) {
                return new SchemeStat$TypeAction(Type.TYPE_LOCAL_SEARCH_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonSearchStat$TypeLocalSearchItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -536870913, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioLongtapItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_LONGTAP_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, (CommonAudioStat$TypeAudioLongtapItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -264, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_IN_APP_REVIEW_INITIAL_APPEARANCE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -134217729, -1, -1, 1, null);
            }
            if (bVar instanceof CommonBookmarksStat$TypeBookmarksAction) {
                return new SchemeStat$TypeAction(Type.TYPE_BOOKMARKS_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonBookmarksStat$TypeBookmarksAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -536870913, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioSnippetItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_SNIPPET_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, (CommonAudioStat$TypeAudioSnippetItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -520, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeMotivationItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MOTIVATION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeMotivationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1073741825, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIPS_CREATION_SCREEN_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, Integer.MAX_VALUE, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIPS_CREATION_SCREEN_BUTTONS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -2, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioListeningItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_LISTENING_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioListeningItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -3, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudiobookActItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIOBOOK_ACT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudiobookActItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -5, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapPlayEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_PLAY_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapPlayEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741832, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapShowEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_SHOW_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapShowEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483640, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapStopEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_STOP_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapStopEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapTimerEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_TIMER_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapTimerEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -3, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapStatusEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_STATUS_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapStatusEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -5, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapSearchEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_SEARCH_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapSearchEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -9, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapUpdCollectionEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_UPD_COLLECTION_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapUpdCollectionEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -17, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -33, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapCloseCoachmarkItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_CLOSE_COACHMARK_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapCloseCoachmarkItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435464, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapEqualizerEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapEqualizerEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -65, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapPopupEventItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_TAP_POPUP_EVENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapPopupEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -129, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImConversationsBannerItem) {
                return new SchemeStat$TypeAction(Type.TYPE_IM_CONVERSATIONS_BANNER_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImConversationsBannerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -9, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImChannelJoinAction) {
                return new SchemeStat$TypeAction(Type.TYPE_IM_CHANNEL_JOIN_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImChannelJoinAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -17, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeMusicSubscriptionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MUSIC_SUBSCRIPTION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeMusicSubscriptionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -33, -1, 1, null);
            }
            if (bVar instanceof q0) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_SUGGEST_DOWNLOADS_APPEARANCE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (q0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -65, -1, 1, null);
            }
            if (bVar instanceof CommonOnboardingRecomThemesStat$TypeRecomThemesItem) {
                return new SchemeStat$TypeAction(Type.TYPE_RECOM_THEMES_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonOnboardingRecomThemesStat$TypeRecomThemesItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -4097, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeOnboardingUsecasesItem) {
                return new SchemeStat$TypeAction(Type.TYPE_ONBOARDING_USECASES_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, (SchemeStat$TypeOnboardingUsecasesItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_PROXY_CERTIFICATE_INVALID, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsTabbarStat$TypeTabbarItem) {
                return new SchemeStat$TypeAction(Type.TYPE_TABBAR_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsTabbarStat$TypeTabbarItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -8193, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_BLOCK_RECOMMENDED_PLAYLISTS_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, (CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCorePermissionStat$TypePermissionChange) {
                return new SchemeStat$TypeAction(Type.TYPE_PERMISSION_CHANGE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCorePermissionStat$TypePermissionChange) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -16385, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeSnowballEvents) {
                return new SchemeStat$TypeAction(Type.TYPE_SNOWBALL_EVENTS, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSnowballEvents) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -32769, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioDislikeItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_DISLIKE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioDislikeItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194312, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioCoachmarkItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_COACHMARK_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioCoachmarkItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870920, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof SchemeStat$TypeMtTimespentItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MT_TIMESPENT_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMtTimespentItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -65537, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SECURE_LOCK_ENTRANCE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -131073, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioOnboardingItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_ONBOARDING_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioOnboardingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554440, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioAutoItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_AUTO_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioAutoItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108872, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioDownloadItem) {
                return new SchemeStat$TypeAction(Type.TYPE_AUDIO_DOWNLOAD_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioDownloadItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217736, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedStopPagination) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_STOP_PAGINATION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedStopPagination) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2056, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_SHOW_FRESH_NEWS_BUTTON, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262152, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_FEED_SCROLL_TO_TOP, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524296, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedFeedRefresh) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_FEED_REFRESH, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedFeedRefresh) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048584, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedZoomPhoto) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_ZOOM_PHOTO, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedZoomPhoto) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097160, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutGoal) {
                return new SchemeStat$TypeAction(Type.TYPE_DONUT_GOAL, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutGoal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -262145, -1, 1, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutPrivacySettingChanged) {
                return new SchemeStat$TypeAction(Type.TYPE_DONUT_PRIVACY_SETTING_CHANGED_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutPrivacySettingChanged) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -524289, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_KIDS_MODE_CHANGED_EVENT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -268435457, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImInvitationCardRejectAction) {
                return new SchemeStat$TypeAction(Type.TYPE_IM_INVITATION_CARD_REJECT_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImInvitationCardRejectAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1048577, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvKidModeItem) {
                return new SchemeStat$TypeAction(Type.TYPE_TV_KID_MODE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvKidModeItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -2097153, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostStartAudio) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_POST_START_AUDIO, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostStartAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -8388609, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_POST_START_PLAYLIST, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -16777217, -1, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeUniversalBanner) {
                return new SchemeStat$TypeAction(Type.TYPE_UNIVERSAL_BANNER, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeUniversalBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -33554433, -1, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoPushSettingsBanner) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_PUSH_SETTINGS_BANNER, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoPushSettingsBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -67108865, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog) {
                return new SchemeStat$TypeAction(Type.TYPE_UPLOAD_EXIT_CONFIRMATION_DIALOG, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -134217729, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_DOWNLOAD_SKIP_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -2049, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_DYNAMIC_TABS_ONBOARDING_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1025, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeExternalDeviceAction) {
                return new SchemeStat$TypeAction(Type.TYPE_EXTERNAL_DEVICE_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeExternalDeviceAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -129, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeScreencastCodeAction) {
                return new SchemeStat$TypeAction(Type.TYPE_SCREENCAST_CODE_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeScreencastCodeAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -257, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_DOWNLOAD_WAIT_FOR_USER_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -513, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoToClipUpload) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_TO_CLIP_UPLOAD, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoToClipUpload) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -268435457, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout) {
                return new SchemeStat$TypeAction(Type.TYPE_TV_KID_MODE_ITEM_LOGOUT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -4194305, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_UPLOAD_AUTHOR_SELECT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -536870913, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_KIDS_AGE_FILTER_SELECT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1073741825, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_KIDS_AGE_FILTER_RESET, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, Integer.MAX_VALUE, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem) {
                return new SchemeStat$TypeAction(Type.TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -2, 1, null);
            }
            if (bVar instanceof j0) {
                return new SchemeStat$TypeAction(Type.TYPE_SELECT_CREATORS_CLICK_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (j0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -3, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick) {
                return new SchemeStat$TypeAction(Type.TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -5, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick) {
                return new SchemeStat$TypeAction(Type.TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -9, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_POST_PLAYED_UNIT_OF_AUDIO, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -17, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoNextVideoStartAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_NEXT_VIDEO_START_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoNextVideoStartAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -33, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_UPLOAD_COVER_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -65, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_UPLOAD_COVER_APPLY_PHOTO, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -129, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoCreateChannelAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_CREATE_CHANNEL_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoCreateChannelAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -257, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_ATTACH_OBJECT_TO_VIDEO, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1025, 1, null);
            }
            if (bVar instanceof CommonUxpollsStat$TypeUxpollsEvent) {
                return new SchemeStat$TypeAction(Type.TYPE_UXPOLLS_EVENT, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonUxpollsStat$TypeUxpollsEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -513, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvKidProfileItem) {
                return new SchemeStat$TypeAction(Type.TYPE_TV_KID_PROFILE_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvKidProfileItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -2049, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoChildProfileActions) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_CHILD_PROFILE_ACTIONS, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoChildProfileActions) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -4097, 1, null);
            }
            if (bVar instanceof CommonVideoStat$TypeLiveActionsItem) {
                return new SchemeStat$TypeAction(Type.TYPE_LIVE_ACTIONS, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeLiveActionsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -8193, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_PLAYER_CHANGE_MODE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -16385, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTopshelfAction) {
                return new SchemeStat$TypeAction(Type.TYPE_TOPSHELF_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTopshelfAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -32769, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_APPLE_TOP_SHELF_CLICK, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -65537, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipsStatAdsAction) {
                return new SchemeStat$TypeAction(Type.TYPE_CLIPS_STAT_ADS_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipsStatAdsAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -8193, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoScreenLockAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_SCREEN_LOCK_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoScreenLockAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -131073, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_DISCOVERY_TABS_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -262145, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_SUBTITLES_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -524289, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_SHOW_SIMILARS_BUTTON_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1048577, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_OPEN_SIMILARS_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction) bVar, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -2097153, 1, null);
            }
            if (bVar instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock) {
                return new SchemeStat$TypeAction(Type.TYPE_SIMILAR_CHANNELS_BLOCK, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock) bVar, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -4194305, 1, null);
            }
            if (bVar instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsCardShow) {
                return new SchemeStat$TypeAction(Type.TYPE_SIMILAR_CHANNELS_CARD_SHOW, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoOtherChannelsStat$TypeSimilarChannelsCardShow) bVar, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -8388609, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdTrialAction) {
                return new SchemeStat$TypeAction(Type.TYPE_VIDEO_AD_TRIAL_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAdTrialAction) bVar, null, null, null, null, null, null, -8, -1, -1, -1, -1, -67108865, 1, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdRequest) {
                return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_AD_REQUEST, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdRequest) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4104, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdResponse) {
                return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_AD_RESPONSE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdResponse) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8200, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdClose) {
                return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_AD_CLOSE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdClose) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16392, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdMenuAction) {
                return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_AD_MENU_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdMenuAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32776, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdConfigBlocked) {
                return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_AD_CONFIG_BLOCKED, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdConfigBlocked) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65544, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdImpression) {
                return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_AD_IMPRESSION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdImpression) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131080, -1, -1, -1, -1, -1, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem) {
                return new SchemeStat$TypeAction(Type.TYPE_SHUTDOWN_DETECTION_ACTION_ITEM, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem) bVar, null, null, null, null, null, -8, -1, -1, -1, -1, -134217729, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypePinVideoAction) {
                return new SchemeStat$TypeAction(Type.TYPE_PIN_VIDEO_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypePinVideoAction) bVar, null, null, null, null, -8, -1, -1, -1, -1, -268435457, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened) {
                return new SchemeStat$TypeAction(Type.TYPE_SPORT_DIRECT_LINK_OPENED, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened) bVar, null, null, null, -8, -1, -1, -1, -1, -536870913, 1, null);
            }
            if (bVar instanceof CommonCoreNetworkStat$NetworkBadConnectionAction) {
                return new SchemeStat$TypeAction(Type.TYPE_CORE_NETWORK_BAD_CONNECTION_ACTION, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCoreNetworkStat$NetworkBadConnectionAction) bVar, null, null, -8, -1, -1, -1, -1, -1073741825, 1, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton) {
                return new SchemeStat$TypeAction(Type.TYPE_FEED_SHOW_MORE_SHOPS_BUTTON, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton) bVar, null, -8, -1, -1, -1, -1, Integer.MAX_VALUE, 1, null);
            }
            if (!(bVar instanceof MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose)) {
                throw new IllegalArgumentException("payload must be one of(TypeFeedShowProductPin, TypeFeedShowTicketItemPin, TypeRegistrationItem, TypeVkConnectNavigationItem, TypeWishlistItem, TypeStoryPublishItem, TypeMarketingTransitionItem, TypeVoipCallItem, TypeVoipErrorItem, TypeVoipImportContactsAction, TypeVoipSyncContactsModalAction, TypeUiHintItem, TypeVkBridge, TypeUniversalWidget, TypeMarketItem, TypeAddItemToCart, TypeRemoveItemFromCartItem, TypeVideoOpenAuthorCabinet, TypeMarketDeliveryBlockUpdatedItem, TypePushRequestItem, TypeVkPayCheckoutItem, TypeSakSessionsEventItem, TypeEasterEggsItem, TypeVkRunItem, TypeVkWorkoutItem, TypeHealthSyncStateItem, TypeHealthPermissionResultItem, TypeHealthConnectInfoItem, TypeSystemWidgetRefreshEventItem, TypeSystemWidgetAddEventItem, TypeSystemWidgetRemoveEventItem, TypeSystemWidgetDisplayedEventItem, TypePushNotificationsSettings, TypeAudioLyricsItem, TypeAudioOfflineItem, TypeAudioMixOptionsItem, TypeCastEventItem, TypeMessagingContactRecommendationsItem, TypeMessagingActionItem, TypeMessagingAudioMessageItem, TypeSuperappBirthdayPresentItem, TypeMiniAppAccessTokenItem, TypeMiniAppCustomEventItem, TypeMiniAppOpenItem, TypeMiniAppSessionItem, TypeMiniAppsInstallScreen, TypeMiniAppsPersonalDiscount, TypeMiniAppsCloseConfirmationAlertItem, TypeFeedBlockMiniAppsItem, TypeStoryFeedViewItem, TypeStoryViewItem, TypeConversationItem, TypeReadingItem, TypeSettingsItem, TypeVkConnectQuestionnaire, TypeSuperappSnowItem, TypeCallerIdEventItem, TypeSuperappStatlogItem, TypeOwnerButtonAppRenderItem, TypeSearchItem, TypeSuperappScreenItem, TypeSuperappOnboardingActionItem, TypeClipPopularTemplatesBlock, TypeClipTemplateItem, TypeClipPublishItem, TypeClipMusicCatalogItem, TypeClipCameraItem, TypeClipCoownersItem, TypeClipEditorItem, TypeClipEditItem, TypeClipViewerItem, TypeClipCommentSharingItem, TypeClipScrollAfterBite, TypeClipCommentSortItem, TypeClipsTrendsCatalogItem, TypeLiveViewerItem, TypeAdsBanner, TypeMiniAppsAdsRequest, TypeMiniAppsAdsNative, TypeRewardedAdsShowActionItem, TypeCommunityOnboardingAction, TypeVideoPlayerActionItem, TypeFeedAdsInsert, TypeFeedSdkAdRequest, TypeFeedAsyncBlockError, TypeFeedActionButtonItem, TypeFeedDuplicateOwnerPost, TypePushEventItem, TypeRadioStationItem, TypeLocalSearchItem, TypeAudioLongtapItem, TypeVideoInAppReviewInitialAppearanceItem, TypeBookmarksAction, TypeAudioSnippetItem, TypeMotivationItem, TypeClipsCreationScreenItem, TypeClipsCreationScreenButtonsItem, TypeAudioListeningItem, TypeAudiobookActItem, TypeAudioTapPlayEventItem, TypeAudioTapShowEventItem, TypeAudioTapStopEventItem, TypeAudioTapTimerEventItem, TypeAudioTapStatusEventItem, TypeAudioTapSearchEventItem, TypeAudioTapUpdCollectionEventItem, TypeAudioTapEventItem, TypeAudioTapCloseCoachmarkItem, TypeAudioTapEqualizerEventItem, TypeAudioTapPopupEventItem, TypeImConversationsBannerItem, TypeImChannelJoinAction, TypeMusicSubscriptionItem, TypeVideoSuggestDownloadsAppearanceItem, TypeRecomThemesItem, TypeOnboardingUsecasesItem, TypeTabbarItem, TypeFeedBlockRecommendedPlaylistsItem, TypePermissionChange, TypeSnowballEvents, TypeAudioDislikeItem, TypeAudioCoachmarkItem, TypeMtTimespentItem, TypeSecureLockEntranceItem, TypeAudioOnboardingItem, TypeAudioAutoItem, TypeAudioDownloadItem, TypeFeedStopPagination, TypeFeedShowFreshNewsButton, TypeFeedFeedScrollToTop, TypeFeedFeedRefresh, TypeFeedZoomPhoto, TypeDonutGoal, TypeDonutPrivacySettingChanged, TypeVideoKidsModeChangedEvent, TypeImInvitationCardRejectAction, TypeTvKidModeItem, TypeFeedPostStartAudio, TypeFeedPostStartPlaylist, TypeUniversalBanner, TypeVideoPushSettingsBanner, TypeUploadExitConfirmationDialog, TypeVideoDownloadSkipAction, TypeVideoDynamicTabsOnboardingItem, TypeExternalDeviceAction, TypeScreencastCodeAction, TypeVideoDownloadWaitForUserAction, TypeVideoToClipUpload, TypeTvKidModeItemLogout, TypeVideoUploadAuthorSelect, TypeVideoKidsAgeFilterSelect, TypeVideoKidsAgeFilterReset, TypeMoveYoutubeSubsClickItem, TypeSelectCreatorsClickItem, TypeSelectCreatorsScreenConfirmClick, TypeCreatorHideUndoHideClick, TypeFeedPostPlayedUnitOfAudio, TypeVideoNextVideoStartAction, TypeVideoUploadCoverAction, TypeVideoUploadCoverApplyPhoto, TypeVideoCreateChannelAction, TypeVideoAttachObjectToVideo, TypeUxpollsEvent, TypeTvKidProfileItem, TypeVideoChildProfileActions, TypeLiveActionsItem, TypeVideoPlayerChangeMode, TypeTopshelfAction, TypeVideoAppleTopShelfClick, TypeClipsStatAdsAction, TypeVideoScreenLockAction, TypeVideoDiscoveryTabsAction, TypeVideoSubtitlesAction, TypeVideoShowSimilarsButtonAction, TypeVideoOpenSimilarsAction, TypeSimilarChannelsBlock, TypeSimilarChannelsCardShow, TypeVideoAdTrialAction, TypeOverlayAdRequest, TypeOverlayAdResponse, TypeOverlayAdClose, TypeOverlayAdMenuAction, TypeOverlayAdConfigBlocked, TypeOverlayAdImpression, TypeShutdownDetectionActionItem, TypePinVideoAction, TypeSportDirectLinkOpened, NetworkBadConnectionAction, TypeFeedShowMoreShopsButton, TypeOverlayLiveProductCardClose)");
            }
            return new SchemeStat$TypeAction(Type.TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLOSE, schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose) bVar, -8, -1, -1, -1, -1, -1, 0, null);
        }

        public static /* synthetic */ SchemeStat$TypeAction b(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, b bVar, int i) {
            if ((i & 1) != 0) {
                schemeStat$EventItem = null;
            }
            if ((i & 2) != 0) {
                mobileOfficialAppsCoreNavStat$EventScreen = null;
            }
            return a(schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, bVar);
        }
    }

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public interface b {
    }

    private SchemeStat$TypeAction(Type type, SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem, MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings, SchemeStat$TypeRegistrationItem schemeStat$TypeRegistrationItem, CommonAudioStat$TypeAudioMixOptionsItem commonAudioStat$TypeAudioMixOptionsItem, SchemeStat$TypeOnboardingUsecasesItem schemeStat$TypeOnboardingUsecasesItem, CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem, CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem, CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem, MobileOfficialAppsFeedStat$TypeFeedStopPagination mobileOfficialAppsFeedStat$TypeFeedStopPagination, CommonVideoAdsStat$TypeOverlayAdRequest commonVideoAdsStat$TypeOverlayAdRequest, CommonVideoAdsStat$TypeOverlayAdResponse commonVideoAdsStat$TypeOverlayAdResponse, CommonVideoAdsStat$TypeOverlayAdClose commonVideoAdsStat$TypeOverlayAdClose, CommonVideoAdsStat$TypeOverlayAdMenuAction commonVideoAdsStat$TypeOverlayAdMenuAction, CommonVideoAdsStat$TypeOverlayAdConfigBlocked commonVideoAdsStat$TypeOverlayAdConfigBlocked, CommonVideoAdsStat$TypeOverlayAdImpression commonVideoAdsStat$TypeOverlayAdImpression, MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton, MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop, MobileOfficialAppsFeedStat$TypeFeedFeedRefresh mobileOfficialAppsFeedStat$TypeFeedFeedRefresh, MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto, CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem, MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin, MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin, CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem, CommonAudioStat$TypeAudioAutoItem commonAudioStat$TypeAudioAutoItem, CommonAudioStat$TypeAudioDownloadItem commonAudioStat$TypeAudioDownloadItem, CommonAudioStat$TypeAudioTapCloseCoachmarkItem commonAudioStat$TypeAudioTapCloseCoachmarkItem, CommonAudioStat$TypeAudioCoachmarkItem commonAudioStat$TypeAudioCoachmarkItem, CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem, CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem, CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem, CommonAudioStat$TypeAudioTapTimerEventItem commonAudioStat$TypeAudioTapTimerEventItem, CommonAudioStat$TypeAudioTapStatusEventItem commonAudioStat$TypeAudioTapStatusEventItem, CommonAudioStat$TypeAudioTapSearchEventItem commonAudioStat$TypeAudioTapSearchEventItem, CommonAudioStat$TypeAudioTapUpdCollectionEventItem commonAudioStat$TypeAudioTapUpdCollectionEventItem, CommonAudioStat$TypeAudioTapEventItem commonAudioStat$TypeAudioTapEventItem, CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem, CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem, SchemeStat$TypeVkConnectNavigationItem schemeStat$TypeVkConnectNavigationItem, CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem, SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem, SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem, MobileOfficialAppsStoriesStat$TypeStoryPublishItem mobileOfficialAppsStoriesStat$TypeStoryPublishItem, SchemeStat$TypeMarketingTransitionItem schemeStat$TypeMarketingTransitionItem, MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem, MobileOfficialAppsCallsStat$TypeVoipErrorItem mobileOfficialAppsCallsStat$TypeVoipErrorItem, MobileOfficialAppsCallsStat$TypeVoipImportContactsAction mobileOfficialAppsCallsStat$TypeVoipImportContactsAction, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction, CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem, SchemeStat$TypeVkBridge schemeStat$TypeVkBridge, SchemeStat$TypeUniversalWidget schemeStat$TypeUniversalWidget, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, MobileOfficialAppsMarketStat$TypeAddItemToCart mobileOfficialAppsMarketStat$TypeAddItemToCart, MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem, SchemeStat$TypePushRequestItem schemeStat$TypePushRequestItem, SchemeStat$TypeVkPayCheckoutItem schemeStat$TypeVkPayCheckoutItem, SchemeStat$TypeSakSessionsEventItem schemeStat$TypeSakSessionsEventItem, MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen, MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount, MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem, CommonFeedStat$TypeFeedBlockMiniAppsItem commonFeedStat$TypeFeedBlockMiniAppsItem, MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem, MobileOfficialAppsStoriesStat$TypeStoryViewItem mobileOfficialAppsStoriesStat$TypeStoryViewItem, MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem, MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem, MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem, SchemeStat$TypeEasterEggsItem schemeStat$TypeEasterEggsItem, SchemeStat$TypeVkRunItem schemeStat$TypeVkRunItem, SchemeStat$TypeVkWorkoutItem schemeStat$TypeVkWorkoutItem, MobileOfficialAppsHealthStat$TypeHealthSyncStateItem mobileOfficialAppsHealthStat$TypeHealthSyncStateItem, MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem, MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem, SchemeStat$TypeCastEventItem schemeStat$TypeCastEventItem, SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem, SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem, SchemeStat$TypeMessagingAudioMessageItem schemeStat$TypeMessagingAudioMessageItem, SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem, SchemeStat$TypeMiniAppCustomEventItem schemeStat$TypeMiniAppCustomEventItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem, MobileOfficialAppsMarusiaStat$TypeSettingsItem mobileOfficialAppsMarusiaStat$TypeSettingsItem, SchemeStat$TypeVkConnectQuestionnaire schemeStat$TypeVkConnectQuestionnaire, SchemeStat$TypeSuperappSnowItem schemeStat$TypeSuperappSnowItem, SchemeStat$TypeCallerIdEventItem schemeStat$TypeCallerIdEventItem, SchemeStat$TypeSuperappStatlogItem schemeStat$TypeSuperappStatlogItem, SchemeStat$TypeOwnerButtonAppRenderItem schemeStat$TypeOwnerButtonAppRenderItem, CommonSearchStat$TypeSearchItem commonSearchStat$TypeSearchItem, CommonSearchStat$TypeLocalSearchItem commonSearchStat$TypeLocalSearchItem, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem, MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock, MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem, MobileOfficialAppsClipsStat$TypeClipTemplateItem mobileOfficialAppsClipsStat$TypeClipTemplateItem, MobileOfficialAppsClipsStat$TypeClipPublishItem mobileOfficialAppsClipsStat$TypeClipPublishItem, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem, MobileOfficialAppsClipsStat$TypeClipCameraItem mobileOfficialAppsClipsStat$TypeClipCameraItem, MobileOfficialAppsClipsStat$TypeClipCoownersItem mobileOfficialAppsClipsStat$TypeClipCoownersItem, MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem, MobileOfficialAppsClipsStat$TypeClipEditItem mobileOfficialAppsClipsStat$TypeClipEditItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, MobileOfficialAppsClipsStat$TypeClipCommentSharingItem mobileOfficialAppsClipsStat$TypeClipCommentSharingItem, MobileOfficialAppsClipsStat$TypeClipScrollAfterBite mobileOfficialAppsClipsStat$TypeClipScrollAfterBite, MobileOfficialAppsClipsStat$TypeClipCommentSortItem mobileOfficialAppsClipsStat$TypeClipCommentSortItem, MobileOfficialAppsClipsStat$TypeClipsStatAdsAction mobileOfficialAppsClipsStat$TypeClipsStatAdsAction, MobileOfficialAppsClipsStat$TypeLiveViewerItem mobileOfficialAppsClipsStat$TypeLiveViewerItem, MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner, MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest, MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative, MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem, CommonCommunitiesStat$TypeCommunityOnboardingAction commonCommunitiesStat$TypeCommunityOnboardingAction, CommonVideoStat$TypeVideoPlayerActionItem commonVideoStat$TypeVideoPlayerActionItem, MobileOfficialAppsFeedStat$TypeFeedAdsInsert mobileOfficialAppsFeedStat$TypeFeedAdsInsert, MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest, MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError, CommonFeedStat$TypeFeedActionButtonItem commonFeedStat$TypeFeedActionButtonItem, MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost, MobileOfficialAppsCorePushesStat$TypePushEventItem mobileOfficialAppsCorePushesStat$TypePushEventItem, MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem, MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent, CommonBookmarksStat$TypeBookmarksAction commonBookmarksStat$TypeBookmarksAction, MobileOfficialAppsClipsStat$TypeMotivationItem mobileOfficialAppsClipsStat$TypeMotivationItem, MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem, MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem, CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem, CommonAudioStat$TypeAudiobookActItem commonAudioStat$TypeAudiobookActItem, MobileOfficialAppsImStat$TypeImConversationsBannerItem mobileOfficialAppsImStat$TypeImConversationsBannerItem, MobileOfficialAppsImStat$TypeImChannelJoinAction mobileOfficialAppsImStat$TypeImChannelJoinAction, CommonAudioStat$TypeMusicSubscriptionItem commonAudioStat$TypeMusicSubscriptionItem, q0 q0Var, MobileOfficialAppsVideoStat$TypeExternalDeviceAction mobileOfficialAppsVideoStat$TypeExternalDeviceAction, MobileOfficialAppsVideoStat$TypeScreencastCodeAction mobileOfficialAppsVideoStat$TypeScreencastCodeAction, MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction, MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem, MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction, CommonOnboardingRecomThemesStat$TypeRecomThemesItem commonOnboardingRecomThemesStat$TypeRecomThemesItem, MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem, MobileOfficialAppsCorePermissionStat$TypePermissionChange mobileOfficialAppsCorePermissionStat$TypePermissionChange, SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents, SchemeStat$TypeMtTimespentItem schemeStat$TypeMtTimespentItem, MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem, CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal, CommonCommunitiesStat$TypeDonutPrivacySettingChanged commonCommunitiesStat$TypeDonutPrivacySettingChanged, MobileOfficialAppsImStat$TypeImInvitationCardRejectAction mobileOfficialAppsImStat$TypeImInvitationCardRejectAction, MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem, MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout, MobileOfficialAppsFeedStat$TypeFeedPostStartAudio mobileOfficialAppsFeedStat$TypeFeedPostStartAudio, MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist, CommonVideoStat$TypeUniversalBanner commonVideoStat$TypeUniversalBanner, CommonVideoStat$TypeVideoPushSettingsBanner commonVideoStat$TypeVideoPushSettingsBanner, MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog, MobileOfficialAppsVideoStat$TypeVideoToClipUpload mobileOfficialAppsVideoStat$TypeVideoToClipUpload, MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect, MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect, MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem, j0 j0Var, MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick, MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick, MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio, CommonVideoStat$TypeVideoNextVideoStartAction commonVideoStat$TypeVideoNextVideoStartAction, MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction, MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto, CommonVideoStat$TypeVideoCreateChannelAction commonVideoStat$TypeVideoCreateChannelAction, CommonUxpollsStat$TypeUxpollsEvent commonUxpollsStat$TypeUxpollsEvent, MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo, MobileOfficialAppsVideoStat$TypeTvKidProfileItem mobileOfficialAppsVideoStat$TypeTvKidProfileItem, MobileOfficialAppsVideoStat$TypeVideoChildProfileActions mobileOfficialAppsVideoStat$TypeVideoChildProfileActions, CommonVideoStat$TypeLiveActionsItem commonVideoStat$TypeLiveActionsItem, MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode, MobileOfficialAppsVideoStat$TypeTopshelfAction mobileOfficialAppsVideoStat$TypeTopshelfAction, MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick, MobileOfficialAppsVideoStat$TypeVideoScreenLockAction mobileOfficialAppsVideoStat$TypeVideoScreenLockAction, MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction, MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction, MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction, MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction, CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock commonVideoOtherChannelsStat$TypeSimilarChannelsBlock, CommonVideoOtherChannelsStat$TypeSimilarChannelsCardShow commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow, CommonVideoStat$TypeVideoOpenAuthorCabinet commonVideoStat$TypeVideoOpenAuthorCabinet, CommonMarketStat$TypeMarketDeliveryBlockUpdatedItem commonMarketStat$TypeMarketDeliveryBlockUpdatedItem, MobileOfficialAppsVideoStat$TypeVideoAdTrialAction mobileOfficialAppsVideoStat$TypeVideoAdTrialAction, MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem, MobileOfficialAppsVideoStat$TypePinVideoAction mobileOfficialAppsVideoStat$TypePinVideoAction, MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened, CommonCoreNetworkStat$NetworkBadConnectionAction commonCoreNetworkStat$NetworkBadConnectionAction, MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose) {
        this.type = type;
        this.item = schemeStat$EventItem;
        this.previousScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.typeFeedBlockRecommendedPlaylistsItem = commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem;
        this.typePushNotificationsSettings = mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings;
        this.typeRegistrationItem = schemeStat$TypeRegistrationItem;
        this.typeAudioMixOptionsItem = commonAudioStat$TypeAudioMixOptionsItem;
        this.typeOnboardingUsecasesItem = schemeStat$TypeOnboardingUsecasesItem;
        this.typeAudioLongtapItem = commonAudioStat$TypeAudioLongtapItem;
        this.typeAudioSnippetItem = commonAudioStat$TypeAudioSnippetItem;
        this.typeRadioStationItem = commonAudioStat$TypeRadioStationItem;
        this.typeFeedStopPagination = mobileOfficialAppsFeedStat$TypeFeedStopPagination;
        this.typeOverlayAdRequest = commonVideoAdsStat$TypeOverlayAdRequest;
        this.typeOverlayAdResponse = commonVideoAdsStat$TypeOverlayAdResponse;
        this.typeOverlayAdClose = commonVideoAdsStat$TypeOverlayAdClose;
        this.typeOverlayAdMenuAction = commonVideoAdsStat$TypeOverlayAdMenuAction;
        this.typeOverlayAdConfigBlocked = commonVideoAdsStat$TypeOverlayAdConfigBlocked;
        this.typeOverlayAdImpression = commonVideoAdsStat$TypeOverlayAdImpression;
        this.typeFeedShowFreshNewsButton = mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton;
        this.typeFeedFeedScrollToTop = mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop;
        this.typeFeedFeedRefresh = mobileOfficialAppsFeedStat$TypeFeedFeedRefresh;
        this.typeFeedZoomPhoto = mobileOfficialAppsFeedStat$TypeFeedZoomPhoto;
        this.typeAudioDislikeItem = commonAudioStat$TypeAudioDislikeItem;
        this.typeFeedShowProductPin = mobileOfficialAppsFeedStat$TypeFeedShowProductPin;
        this.typeFeedShowTicketItemPin = mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin;
        this.typeAudioOnboardingItem = commonAudioStat$TypeAudioOnboardingItem;
        this.typeAudioAutoItem = commonAudioStat$TypeAudioAutoItem;
        this.typeAudioDownloadItem = commonAudioStat$TypeAudioDownloadItem;
        this.typeAudioTapCloseCoachmarkItem = commonAudioStat$TypeAudioTapCloseCoachmarkItem;
        this.typeAudioCoachmarkItem = commonAudioStat$TypeAudioCoachmarkItem;
        this.typeAudioTapPlayEventItem = commonAudioStat$TypeAudioTapPlayEventItem;
        this.typeAudioTapShowEventItem = commonAudioStat$TypeAudioTapShowEventItem;
        this.typeAudioTapStopEventItem = commonAudioStat$TypeAudioTapStopEventItem;
        this.typeAudioTapTimerEventItem = commonAudioStat$TypeAudioTapTimerEventItem;
        this.typeAudioTapStatusEventItem = commonAudioStat$TypeAudioTapStatusEventItem;
        this.typeAudioTapSearchEventItem = commonAudioStat$TypeAudioTapSearchEventItem;
        this.typeAudioTapUpdCollectionEventItem = commonAudioStat$TypeAudioTapUpdCollectionEventItem;
        this.typeAudioTapEventItem = commonAudioStat$TypeAudioTapEventItem;
        this.typeAudioTapEqualizerEventItem = commonAudioStat$TypeAudioTapEqualizerEventItem;
        this.typeAudioTapPopupEventItem = commonAudioStat$TypeAudioTapPopupEventItem;
        this.typeVkConnectNavigationItem = schemeStat$TypeVkConnectNavigationItem;
        this.typeAudioLyricsItem = commonAudioStat$TypeAudioLyricsItem;
        this.typeAudioOfflineItem = schemeStat$TypeAudioOfflineItem;
        this.typeWishlistItem = schemeStat$TypeWishlistItem;
        this.typeStoryPublishItem = mobileOfficialAppsStoriesStat$TypeStoryPublishItem;
        this.typeMarketingTransitionItem = schemeStat$TypeMarketingTransitionItem;
        this.typeVoipCallItem = mobileOfficialAppsCallsStat$TypeVoipCallItem;
        this.typeVoipErrorItem = mobileOfficialAppsCallsStat$TypeVoipErrorItem;
        this.typeVoipImportContactsAction = mobileOfficialAppsCallsStat$TypeVoipImportContactsAction;
        this.typeVoipSyncContactsModalAction = mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
        this.typeUiHintItem = commonOnboardingStat$TypeUiHintItem;
        this.typeVkBridge = schemeStat$TypeVkBridge;
        this.typeUniversalWidget = schemeStat$TypeUniversalWidget;
        this.typeMarketItem = schemeStat$TypeMarketItem;
        this.typeAddItemToCart = mobileOfficialAppsMarketStat$TypeAddItemToCart;
        this.typeRemoveItemFromCartItem = mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem;
        this.typePushRequestItem = schemeStat$TypePushRequestItem;
        this.typeVkPayCheckoutItem = schemeStat$TypeVkPayCheckoutItem;
        this.typeSakSessionsEventItem = schemeStat$TypeSakSessionsEventItem;
        this.typeMiniAppsInstallScreen = mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen;
        this.typeMiniAppsPersonalDiscount = mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount;
        this.typeMiniAppsCloseConfirmationAlertItem = mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem;
        this.typeFeedBlockMiniAppsItem = commonFeedStat$TypeFeedBlockMiniAppsItem;
        this.typeStoryFeedViewItem = mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem;
        this.typeStoryViewItem = mobileOfficialAppsStoriesStat$TypeStoryViewItem;
        this.typeMiniAppOpenItem = mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem;
        this.typeMiniAppAccessTokenItem = mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem;
        this.typeMiniAppSessionItem = mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem;
        this.typeEasterEggsItem = schemeStat$TypeEasterEggsItem;
        this.typeVkRunItem = schemeStat$TypeVkRunItem;
        this.typeVkWorkoutItem = schemeStat$TypeVkWorkoutItem;
        this.typeHealthSyncStateItem = mobileOfficialAppsHealthStat$TypeHealthSyncStateItem;
        this.typeHealthPermissionResultItem = mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem;
        this.typeHealthConnectInfoItem = mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem;
        this.typeSystemWidgetRefreshEventItem = mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem;
        this.typeSystemWidgetDisplayedEventItem = mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem;
        this.typeSystemWidgetAddEventItem = mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem;
        this.typeSystemWidgetRemoveEventItem = mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem;
        this.typeCastEventItem = schemeStat$TypeCastEventItem;
        this.typeMessagingContactRecommendationsItem = schemeStat$TypeMessagingContactRecommendationsItem;
        this.typeMessagingActionItem = schemeStat$TypeMessagingActionItem;
        this.typeMessagingAudioMessageItem = schemeStat$TypeMessagingAudioMessageItem;
        this.typeSuperappBirthdayPresentItem = schemeStat$TypeSuperappBirthdayPresentItem;
        this.typeMiniAppCustomEventItem = schemeStat$TypeMiniAppCustomEventItem;
        this.typeMarusiaConversationItem = mobileOfficialAppsMarusiaStat$TypeConversationItem;
        this.typeMarusiaReadingItem = mobileOfficialAppsMarusiaStat$TypeReadingItem;
        this.typeMarusiaSettingsItem = mobileOfficialAppsMarusiaStat$TypeSettingsItem;
        this.typeVkConnectQuestionnaire = schemeStat$TypeVkConnectQuestionnaire;
        this.typeSuperappSnowItem = schemeStat$TypeSuperappSnowItem;
        this.typeCallerIdEventItem = schemeStat$TypeCallerIdEventItem;
        this.typeSuperappStatlogItem = schemeStat$TypeSuperappStatlogItem;
        this.typeOwnerButtonAppRenderItem = schemeStat$TypeOwnerButtonAppRenderItem;
        this.typeSearchItem = commonSearchStat$TypeSearchItem;
        this.typeLocalSearchItem = commonSearchStat$TypeLocalSearchItem;
        this.typeSuperappScreenItem = schemeStat$TypeSuperappScreenItem;
        this.typeSuperappOnboardingActionItem = mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem;
        this.typeClipPopularTemplatesBlock = mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock;
        this.typeClipsTrendsCatalogItem = mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem;
        this.typeClipTemplateItem = mobileOfficialAppsClipsStat$TypeClipTemplateItem;
        this.typeClipPublishItem = mobileOfficialAppsClipsStat$TypeClipPublishItem;
        this.typeClipMusicCatalogItem = mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem;
        this.typeClipCameraItem = mobileOfficialAppsClipsStat$TypeClipCameraItem;
        this.typeClipCoownersItem = mobileOfficialAppsClipsStat$TypeClipCoownersItem;
        this.typeClipEditorItem = mobileOfficialAppsClipsStat$TypeClipEditorItem;
        this.typeClipEditItem = mobileOfficialAppsClipsStat$TypeClipEditItem;
        this.typeClipViewerItem = schemeStat$TypeClipViewerItem;
        this.typeClipCommentSharingItem = mobileOfficialAppsClipsStat$TypeClipCommentSharingItem;
        this.typeClipScrollAfterBite = mobileOfficialAppsClipsStat$TypeClipScrollAfterBite;
        this.typeClipCommentSortItem = mobileOfficialAppsClipsStat$TypeClipCommentSortItem;
        this.typeClipsStatAdsAction = mobileOfficialAppsClipsStat$TypeClipsStatAdsAction;
        this.typeLiveViewerItem = mobileOfficialAppsClipsStat$TypeLiveViewerItem;
        this.typeAdsBanner = mobileOfficialAppsAdsStat$TypeAdsBanner;
        this.typeMiniAppsAdsRequest = mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest;
        this.typeMiniAppsAdsNative = mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative;
        this.typeRewardedAdsShowActionItem = mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem;
        this.typeCommunityOnboardingAction = commonCommunitiesStat$TypeCommunityOnboardingAction;
        this.typeVideoPlayerActionItem = commonVideoStat$TypeVideoPlayerActionItem;
        this.typeFeedAdsInsert = mobileOfficialAppsFeedStat$TypeFeedAdsInsert;
        this.typeFeedSdkAdRequest = mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest;
        this.typeFeedAsyncBlockError = mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError;
        this.typeFeedActionButtonItem = commonFeedStat$TypeFeedActionButtonItem;
        this.typeFeedDuplicateOwnerPost = mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost;
        this.typePushEventItem = mobileOfficialAppsCorePushesStat$TypePushEventItem;
        this.typeVideoInAppReviewInitialAppearanceItem = mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem;
        this.typeVideoKidsModeChangedEvent = mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent;
        this.typeBookmarksAction = commonBookmarksStat$TypeBookmarksAction;
        this.typeMotivationItem = mobileOfficialAppsClipsStat$TypeMotivationItem;
        this.typeClipsCreationScreenItem = mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
        this.typeClipsCreationScreenButtonsItem = mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem;
        this.typeAudioListeningItem = commonAudioStat$TypeAudioListeningItem;
        this.typeAudiobookActItem = commonAudioStat$TypeAudiobookActItem;
        this.typeImConversationsBannerItem = mobileOfficialAppsImStat$TypeImConversationsBannerItem;
        this.typeImChannelJoinAction = mobileOfficialAppsImStat$TypeImChannelJoinAction;
        this.typeMusicSubscriptionItem = commonAudioStat$TypeMusicSubscriptionItem;
        this.typeVideoSuggestDownloadsAppearanceItem = q0Var;
        this.typeExternalDeviceAction = mobileOfficialAppsVideoStat$TypeExternalDeviceAction;
        this.typeScreencastCodeAction = mobileOfficialAppsVideoStat$TypeScreencastCodeAction;
        this.typeVideoDownloadWaitForUserAction = mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction;
        this.typeVideoDynamicTabsOnboardingItem = mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem;
        this.typeVideoDownloadSkipAction = mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction;
        this.typeRecomThemesItem = commonOnboardingRecomThemesStat$TypeRecomThemesItem;
        this.typeTabbarItem = mobileOfficialAppsTabbarStat$TypeTabbarItem;
        this.typePermissionChange = mobileOfficialAppsCorePermissionStat$TypePermissionChange;
        this.typeSnowballEvents = schemeStat$TypeSnowballEvents;
        this.typeMtTimespentItem = schemeStat$TypeMtTimespentItem;
        this.typeSecureLockEntranceItem = mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem;
        this.typeDonutGoal = commonCommunitiesStat$TypeDonutGoal;
        this.typeDonutPrivacySettingChangedItem = commonCommunitiesStat$TypeDonutPrivacySettingChanged;
        this.typeImInvitationCardRejectAction = mobileOfficialAppsImStat$TypeImInvitationCardRejectAction;
        this.typeTvKidModeItem = mobileOfficialAppsVideoStat$TypeTvKidModeItem;
        this.typeTvKidModeItemLogout = mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout;
        this.typeFeedPostStartAudio = mobileOfficialAppsFeedStat$TypeFeedPostStartAudio;
        this.typeFeedPostStartPlaylist = mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist;
        this.typeUniversalBanner = commonVideoStat$TypeUniversalBanner;
        this.typeVideoPushSettingsBanner = commonVideoStat$TypeVideoPushSettingsBanner;
        this.typeUploadExitConfirmationDialog = mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog;
        this.typeVideoToClipUpload = mobileOfficialAppsVideoStat$TypeVideoToClipUpload;
        this.typeVideoUploadAuthorSelect = mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect;
        this.typeVideoKidsAgeFilterSelect = mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect;
        this.typeVideoKidsAgeFilterReset = mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset;
        this.typeMoveYoutubeSubsClickItem = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem;
        this.typeSelectCreatorsClickItem = j0Var;
        this.typeSelectCreatorsScreenConfirmClick = mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick;
        this.typeCreatorHideUndoHideClick = mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
        this.typeFeedPostPlayedUnitOfAudio = mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio;
        this.typeVideoNextVideoStartAction = commonVideoStat$TypeVideoNextVideoStartAction;
        this.typeVideoUploadCoverAction = mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction;
        this.typeVideoUploadCoverApplyPhoto = mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto;
        this.typeVideoCreateChannelAction = commonVideoStat$TypeVideoCreateChannelAction;
        this.typeUxpollsEvent = commonUxpollsStat$TypeUxpollsEvent;
        this.typeVideoAttachObjectToVideo = mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo;
        this.typeTvKidProfileItem = mobileOfficialAppsVideoStat$TypeTvKidProfileItem;
        this.typeVideoChildProfileActions = mobileOfficialAppsVideoStat$TypeVideoChildProfileActions;
        this.typeLiveActions = commonVideoStat$TypeLiveActionsItem;
        this.typeVideoPlayerChangeMode = mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode;
        this.typeTopshelfAction = mobileOfficialAppsVideoStat$TypeTopshelfAction;
        this.typeVideoAppleTopShelfClick = mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick;
        this.typeVideoScreenLockAction = mobileOfficialAppsVideoStat$TypeVideoScreenLockAction;
        this.typeVideoDiscoveryTabsAction = mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction;
        this.typeVideoSubtitlesAction = mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction;
        this.typeVideoShowSimilarsButtonAction = mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction;
        this.typeVideoOpenSimilarsAction = mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction;
        this.typeSimilarChannelsBlock = commonVideoOtherChannelsStat$TypeSimilarChannelsBlock;
        this.typeSimilarChannelsCardShow = commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow;
        this.typeVideoOpenAuthorCabinet = commonVideoStat$TypeVideoOpenAuthorCabinet;
        this.typeMarketUpdatedDeliveryBlock = commonMarketStat$TypeMarketDeliveryBlockUpdatedItem;
        this.typeVideoAdTrialAction = mobileOfficialAppsVideoStat$TypeVideoAdTrialAction;
        this.typeShutdownDetectionActionItem = mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem;
        this.typePinVideoAction = mobileOfficialAppsVideoStat$TypePinVideoAction;
        this.typeSportDirectLinkOpened = mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened;
        this.typeCoreNetworkBadConnectionAction = commonCoreNetworkStat$NetworkBadConnectionAction;
        this.typeFeedShowMoreShopsButton = mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton;
        this.typeOverlayLiveProductCardClose = mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose;
    }

    public final CommonAudioStat$TypeAudioListeningItem a() {
        return this.typeAudioListeningItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAction)) {
            return false;
        }
        SchemeStat$TypeAction schemeStat$TypeAction = (SchemeStat$TypeAction) obj;
        return this.type == schemeStat$TypeAction.type && epx.f(this.item, schemeStat$TypeAction.item) && this.previousScreen == schemeStat$TypeAction.previousScreen && epx.f(this.typeFeedBlockRecommendedPlaylistsItem, schemeStat$TypeAction.typeFeedBlockRecommendedPlaylistsItem) && epx.f(this.typePushNotificationsSettings, schemeStat$TypeAction.typePushNotificationsSettings) && epx.f(this.typeRegistrationItem, schemeStat$TypeAction.typeRegistrationItem) && epx.f(this.typeAudioMixOptionsItem, schemeStat$TypeAction.typeAudioMixOptionsItem) && epx.f(this.typeOnboardingUsecasesItem, schemeStat$TypeAction.typeOnboardingUsecasesItem) && epx.f(this.typeAudioLongtapItem, schemeStat$TypeAction.typeAudioLongtapItem) && epx.f(this.typeAudioSnippetItem, schemeStat$TypeAction.typeAudioSnippetItem) && epx.f(this.typeRadioStationItem, schemeStat$TypeAction.typeRadioStationItem) && epx.f(this.typeFeedStopPagination, schemeStat$TypeAction.typeFeedStopPagination) && epx.f(this.typeOverlayAdRequest, schemeStat$TypeAction.typeOverlayAdRequest) && epx.f(this.typeOverlayAdResponse, schemeStat$TypeAction.typeOverlayAdResponse) && epx.f(this.typeOverlayAdClose, schemeStat$TypeAction.typeOverlayAdClose) && epx.f(this.typeOverlayAdMenuAction, schemeStat$TypeAction.typeOverlayAdMenuAction) && epx.f(this.typeOverlayAdConfigBlocked, schemeStat$TypeAction.typeOverlayAdConfigBlocked) && epx.f(this.typeOverlayAdImpression, schemeStat$TypeAction.typeOverlayAdImpression) && epx.f(this.typeFeedShowFreshNewsButton, schemeStat$TypeAction.typeFeedShowFreshNewsButton) && epx.f(this.typeFeedFeedScrollToTop, schemeStat$TypeAction.typeFeedFeedScrollToTop) && epx.f(this.typeFeedFeedRefresh, schemeStat$TypeAction.typeFeedFeedRefresh) && epx.f(this.typeFeedZoomPhoto, schemeStat$TypeAction.typeFeedZoomPhoto) && epx.f(this.typeAudioDislikeItem, schemeStat$TypeAction.typeAudioDislikeItem) && epx.f(this.typeFeedShowProductPin, schemeStat$TypeAction.typeFeedShowProductPin) && epx.f(this.typeFeedShowTicketItemPin, schemeStat$TypeAction.typeFeedShowTicketItemPin) && epx.f(this.typeAudioOnboardingItem, schemeStat$TypeAction.typeAudioOnboardingItem) && epx.f(this.typeAudioAutoItem, schemeStat$TypeAction.typeAudioAutoItem) && epx.f(this.typeAudioDownloadItem, schemeStat$TypeAction.typeAudioDownloadItem) && epx.f(this.typeAudioTapCloseCoachmarkItem, schemeStat$TypeAction.typeAudioTapCloseCoachmarkItem) && epx.f(this.typeAudioCoachmarkItem, schemeStat$TypeAction.typeAudioCoachmarkItem) && epx.f(this.typeAudioTapPlayEventItem, schemeStat$TypeAction.typeAudioTapPlayEventItem) && epx.f(this.typeAudioTapShowEventItem, schemeStat$TypeAction.typeAudioTapShowEventItem) && epx.f(this.typeAudioTapStopEventItem, schemeStat$TypeAction.typeAudioTapStopEventItem) && epx.f(this.typeAudioTapTimerEventItem, schemeStat$TypeAction.typeAudioTapTimerEventItem) && epx.f(this.typeAudioTapStatusEventItem, schemeStat$TypeAction.typeAudioTapStatusEventItem) && epx.f(this.typeAudioTapSearchEventItem, schemeStat$TypeAction.typeAudioTapSearchEventItem) && epx.f(this.typeAudioTapUpdCollectionEventItem, schemeStat$TypeAction.typeAudioTapUpdCollectionEventItem) && epx.f(this.typeAudioTapEventItem, schemeStat$TypeAction.typeAudioTapEventItem) && epx.f(this.typeAudioTapEqualizerEventItem, schemeStat$TypeAction.typeAudioTapEqualizerEventItem) && epx.f(this.typeAudioTapPopupEventItem, schemeStat$TypeAction.typeAudioTapPopupEventItem) && epx.f(this.typeVkConnectNavigationItem, schemeStat$TypeAction.typeVkConnectNavigationItem) && epx.f(this.typeAudioLyricsItem, schemeStat$TypeAction.typeAudioLyricsItem) && epx.f(this.typeAudioOfflineItem, schemeStat$TypeAction.typeAudioOfflineItem) && epx.f(this.typeWishlistItem, schemeStat$TypeAction.typeWishlistItem) && epx.f(this.typeStoryPublishItem, schemeStat$TypeAction.typeStoryPublishItem) && epx.f(this.typeMarketingTransitionItem, schemeStat$TypeAction.typeMarketingTransitionItem) && epx.f(this.typeVoipCallItem, schemeStat$TypeAction.typeVoipCallItem) && epx.f(this.typeVoipErrorItem, schemeStat$TypeAction.typeVoipErrorItem) && epx.f(this.typeVoipImportContactsAction, schemeStat$TypeAction.typeVoipImportContactsAction) && epx.f(this.typeVoipSyncContactsModalAction, schemeStat$TypeAction.typeVoipSyncContactsModalAction) && epx.f(this.typeUiHintItem, schemeStat$TypeAction.typeUiHintItem) && epx.f(this.typeVkBridge, schemeStat$TypeAction.typeVkBridge) && epx.f(this.typeUniversalWidget, schemeStat$TypeAction.typeUniversalWidget) && epx.f(this.typeMarketItem, schemeStat$TypeAction.typeMarketItem) && epx.f(this.typeAddItemToCart, schemeStat$TypeAction.typeAddItemToCart) && epx.f(this.typeRemoveItemFromCartItem, schemeStat$TypeAction.typeRemoveItemFromCartItem) && epx.f(this.typePushRequestItem, schemeStat$TypeAction.typePushRequestItem) && epx.f(this.typeVkPayCheckoutItem, schemeStat$TypeAction.typeVkPayCheckoutItem) && epx.f(this.typeSakSessionsEventItem, schemeStat$TypeAction.typeSakSessionsEventItem) && epx.f(this.typeMiniAppsInstallScreen, schemeStat$TypeAction.typeMiniAppsInstallScreen) && epx.f(this.typeMiniAppsPersonalDiscount, schemeStat$TypeAction.typeMiniAppsPersonalDiscount) && epx.f(this.typeMiniAppsCloseConfirmationAlertItem, schemeStat$TypeAction.typeMiniAppsCloseConfirmationAlertItem) && epx.f(this.typeFeedBlockMiniAppsItem, schemeStat$TypeAction.typeFeedBlockMiniAppsItem) && epx.f(this.typeStoryFeedViewItem, schemeStat$TypeAction.typeStoryFeedViewItem) && epx.f(this.typeStoryViewItem, schemeStat$TypeAction.typeStoryViewItem) && epx.f(this.typeMiniAppOpenItem, schemeStat$TypeAction.typeMiniAppOpenItem) && epx.f(this.typeMiniAppAccessTokenItem, schemeStat$TypeAction.typeMiniAppAccessTokenItem) && epx.f(this.typeMiniAppSessionItem, schemeStat$TypeAction.typeMiniAppSessionItem) && epx.f(this.typeEasterEggsItem, schemeStat$TypeAction.typeEasterEggsItem) && epx.f(this.typeVkRunItem, schemeStat$TypeAction.typeVkRunItem) && epx.f(this.typeVkWorkoutItem, schemeStat$TypeAction.typeVkWorkoutItem) && epx.f(this.typeHealthSyncStateItem, schemeStat$TypeAction.typeHealthSyncStateItem) && epx.f(this.typeHealthPermissionResultItem, schemeStat$TypeAction.typeHealthPermissionResultItem) && epx.f(this.typeHealthConnectInfoItem, schemeStat$TypeAction.typeHealthConnectInfoItem) && epx.f(this.typeSystemWidgetRefreshEventItem, schemeStat$TypeAction.typeSystemWidgetRefreshEventItem) && epx.f(this.typeSystemWidgetDisplayedEventItem, schemeStat$TypeAction.typeSystemWidgetDisplayedEventItem) && epx.f(this.typeSystemWidgetAddEventItem, schemeStat$TypeAction.typeSystemWidgetAddEventItem) && epx.f(this.typeSystemWidgetRemoveEventItem, schemeStat$TypeAction.typeSystemWidgetRemoveEventItem) && epx.f(this.typeCastEventItem, schemeStat$TypeAction.typeCastEventItem) && epx.f(this.typeMessagingContactRecommendationsItem, schemeStat$TypeAction.typeMessagingContactRecommendationsItem) && epx.f(this.typeMessagingActionItem, schemeStat$TypeAction.typeMessagingActionItem) && epx.f(this.typeMessagingAudioMessageItem, schemeStat$TypeAction.typeMessagingAudioMessageItem) && epx.f(this.typeSuperappBirthdayPresentItem, schemeStat$TypeAction.typeSuperappBirthdayPresentItem) && epx.f(this.typeMiniAppCustomEventItem, schemeStat$TypeAction.typeMiniAppCustomEventItem) && epx.f(this.typeMarusiaConversationItem, schemeStat$TypeAction.typeMarusiaConversationItem) && epx.f(this.typeMarusiaReadingItem, schemeStat$TypeAction.typeMarusiaReadingItem) && epx.f(this.typeMarusiaSettingsItem, schemeStat$TypeAction.typeMarusiaSettingsItem) && epx.f(this.typeVkConnectQuestionnaire, schemeStat$TypeAction.typeVkConnectQuestionnaire) && epx.f(this.typeSuperappSnowItem, schemeStat$TypeAction.typeSuperappSnowItem) && epx.f(this.typeCallerIdEventItem, schemeStat$TypeAction.typeCallerIdEventItem) && epx.f(this.typeSuperappStatlogItem, schemeStat$TypeAction.typeSuperappStatlogItem) && epx.f(this.typeOwnerButtonAppRenderItem, schemeStat$TypeAction.typeOwnerButtonAppRenderItem) && epx.f(this.typeSearchItem, schemeStat$TypeAction.typeSearchItem) && epx.f(this.typeLocalSearchItem, schemeStat$TypeAction.typeLocalSearchItem) && epx.f(this.typeSuperappScreenItem, schemeStat$TypeAction.typeSuperappScreenItem) && epx.f(this.typeSuperappOnboardingActionItem, schemeStat$TypeAction.typeSuperappOnboardingActionItem) && epx.f(this.typeClipPopularTemplatesBlock, schemeStat$TypeAction.typeClipPopularTemplatesBlock) && epx.f(this.typeClipsTrendsCatalogItem, schemeStat$TypeAction.typeClipsTrendsCatalogItem) && epx.f(this.typeClipTemplateItem, schemeStat$TypeAction.typeClipTemplateItem) && epx.f(this.typeClipPublishItem, schemeStat$TypeAction.typeClipPublishItem) && epx.f(this.typeClipMusicCatalogItem, schemeStat$TypeAction.typeClipMusicCatalogItem) && epx.f(this.typeClipCameraItem, schemeStat$TypeAction.typeClipCameraItem) && epx.f(this.typeClipCoownersItem, schemeStat$TypeAction.typeClipCoownersItem) && epx.f(this.typeClipEditorItem, schemeStat$TypeAction.typeClipEditorItem) && epx.f(this.typeClipEditItem, schemeStat$TypeAction.typeClipEditItem) && epx.f(this.typeClipViewerItem, schemeStat$TypeAction.typeClipViewerItem) && epx.f(this.typeClipCommentSharingItem, schemeStat$TypeAction.typeClipCommentSharingItem) && epx.f(this.typeClipScrollAfterBite, schemeStat$TypeAction.typeClipScrollAfterBite) && epx.f(this.typeClipCommentSortItem, schemeStat$TypeAction.typeClipCommentSortItem) && epx.f(this.typeClipsStatAdsAction, schemeStat$TypeAction.typeClipsStatAdsAction) && epx.f(this.typeLiveViewerItem, schemeStat$TypeAction.typeLiveViewerItem) && epx.f(this.typeAdsBanner, schemeStat$TypeAction.typeAdsBanner) && epx.f(this.typeMiniAppsAdsRequest, schemeStat$TypeAction.typeMiniAppsAdsRequest) && epx.f(this.typeMiniAppsAdsNative, schemeStat$TypeAction.typeMiniAppsAdsNative) && epx.f(this.typeRewardedAdsShowActionItem, schemeStat$TypeAction.typeRewardedAdsShowActionItem) && epx.f(this.typeCommunityOnboardingAction, schemeStat$TypeAction.typeCommunityOnboardingAction) && epx.f(this.typeVideoPlayerActionItem, schemeStat$TypeAction.typeVideoPlayerActionItem) && epx.f(this.typeFeedAdsInsert, schemeStat$TypeAction.typeFeedAdsInsert) && epx.f(this.typeFeedSdkAdRequest, schemeStat$TypeAction.typeFeedSdkAdRequest) && epx.f(this.typeFeedAsyncBlockError, schemeStat$TypeAction.typeFeedAsyncBlockError) && epx.f(this.typeFeedActionButtonItem, schemeStat$TypeAction.typeFeedActionButtonItem) && epx.f(this.typeFeedDuplicateOwnerPost, schemeStat$TypeAction.typeFeedDuplicateOwnerPost) && epx.f(this.typePushEventItem, schemeStat$TypeAction.typePushEventItem) && epx.f(this.typeVideoInAppReviewInitialAppearanceItem, schemeStat$TypeAction.typeVideoInAppReviewInitialAppearanceItem) && epx.f(this.typeVideoKidsModeChangedEvent, schemeStat$TypeAction.typeVideoKidsModeChangedEvent) && epx.f(this.typeBookmarksAction, schemeStat$TypeAction.typeBookmarksAction) && epx.f(this.typeMotivationItem, schemeStat$TypeAction.typeMotivationItem) && epx.f(this.typeClipsCreationScreenItem, schemeStat$TypeAction.typeClipsCreationScreenItem) && epx.f(this.typeClipsCreationScreenButtonsItem, schemeStat$TypeAction.typeClipsCreationScreenButtonsItem) && epx.f(this.typeAudioListeningItem, schemeStat$TypeAction.typeAudioListeningItem) && epx.f(this.typeAudiobookActItem, schemeStat$TypeAction.typeAudiobookActItem) && epx.f(this.typeImConversationsBannerItem, schemeStat$TypeAction.typeImConversationsBannerItem) && epx.f(this.typeImChannelJoinAction, schemeStat$TypeAction.typeImChannelJoinAction) && epx.f(this.typeMusicSubscriptionItem, schemeStat$TypeAction.typeMusicSubscriptionItem) && epx.f(this.typeVideoSuggestDownloadsAppearanceItem, schemeStat$TypeAction.typeVideoSuggestDownloadsAppearanceItem) && epx.f(this.typeExternalDeviceAction, schemeStat$TypeAction.typeExternalDeviceAction) && epx.f(this.typeScreencastCodeAction, schemeStat$TypeAction.typeScreencastCodeAction) && epx.f(this.typeVideoDownloadWaitForUserAction, schemeStat$TypeAction.typeVideoDownloadWaitForUserAction) && epx.f(this.typeVideoDynamicTabsOnboardingItem, schemeStat$TypeAction.typeVideoDynamicTabsOnboardingItem) && epx.f(this.typeVideoDownloadSkipAction, schemeStat$TypeAction.typeVideoDownloadSkipAction) && epx.f(this.typeRecomThemesItem, schemeStat$TypeAction.typeRecomThemesItem) && epx.f(this.typeTabbarItem, schemeStat$TypeAction.typeTabbarItem) && epx.f(this.typePermissionChange, schemeStat$TypeAction.typePermissionChange) && epx.f(this.typeSnowballEvents, schemeStat$TypeAction.typeSnowballEvents) && epx.f(this.typeMtTimespentItem, schemeStat$TypeAction.typeMtTimespentItem) && epx.f(this.typeSecureLockEntranceItem, schemeStat$TypeAction.typeSecureLockEntranceItem) && epx.f(this.typeDonutGoal, schemeStat$TypeAction.typeDonutGoal) && epx.f(this.typeDonutPrivacySettingChangedItem, schemeStat$TypeAction.typeDonutPrivacySettingChangedItem) && epx.f(this.typeImInvitationCardRejectAction, schemeStat$TypeAction.typeImInvitationCardRejectAction) && epx.f(this.typeTvKidModeItem, schemeStat$TypeAction.typeTvKidModeItem) && epx.f(this.typeTvKidModeItemLogout, schemeStat$TypeAction.typeTvKidModeItemLogout) && epx.f(this.typeFeedPostStartAudio, schemeStat$TypeAction.typeFeedPostStartAudio) && epx.f(this.typeFeedPostStartPlaylist, schemeStat$TypeAction.typeFeedPostStartPlaylist) && epx.f(this.typeUniversalBanner, schemeStat$TypeAction.typeUniversalBanner) && epx.f(this.typeVideoPushSettingsBanner, schemeStat$TypeAction.typeVideoPushSettingsBanner) && epx.f(this.typeUploadExitConfirmationDialog, schemeStat$TypeAction.typeUploadExitConfirmationDialog) && epx.f(this.typeVideoToClipUpload, schemeStat$TypeAction.typeVideoToClipUpload) && epx.f(this.typeVideoUploadAuthorSelect, schemeStat$TypeAction.typeVideoUploadAuthorSelect) && epx.f(this.typeVideoKidsAgeFilterSelect, schemeStat$TypeAction.typeVideoKidsAgeFilterSelect) && epx.f(this.typeVideoKidsAgeFilterReset, schemeStat$TypeAction.typeVideoKidsAgeFilterReset) && epx.f(this.typeMoveYoutubeSubsClickItem, schemeStat$TypeAction.typeMoveYoutubeSubsClickItem) && epx.f(this.typeSelectCreatorsClickItem, schemeStat$TypeAction.typeSelectCreatorsClickItem) && epx.f(this.typeSelectCreatorsScreenConfirmClick, schemeStat$TypeAction.typeSelectCreatorsScreenConfirmClick) && epx.f(this.typeCreatorHideUndoHideClick, schemeStat$TypeAction.typeCreatorHideUndoHideClick) && epx.f(this.typeFeedPostPlayedUnitOfAudio, schemeStat$TypeAction.typeFeedPostPlayedUnitOfAudio) && epx.f(this.typeVideoNextVideoStartAction, schemeStat$TypeAction.typeVideoNextVideoStartAction) && epx.f(this.typeVideoUploadCoverAction, schemeStat$TypeAction.typeVideoUploadCoverAction) && epx.f(this.typeVideoUploadCoverApplyPhoto, schemeStat$TypeAction.typeVideoUploadCoverApplyPhoto) && epx.f(this.typeVideoCreateChannelAction, schemeStat$TypeAction.typeVideoCreateChannelAction) && epx.f(this.typeUxpollsEvent, schemeStat$TypeAction.typeUxpollsEvent) && epx.f(this.typeVideoAttachObjectToVideo, schemeStat$TypeAction.typeVideoAttachObjectToVideo) && epx.f(this.typeTvKidProfileItem, schemeStat$TypeAction.typeTvKidProfileItem) && epx.f(this.typeVideoChildProfileActions, schemeStat$TypeAction.typeVideoChildProfileActions) && epx.f(this.typeLiveActions, schemeStat$TypeAction.typeLiveActions) && epx.f(this.typeVideoPlayerChangeMode, schemeStat$TypeAction.typeVideoPlayerChangeMode) && epx.f(this.typeTopshelfAction, schemeStat$TypeAction.typeTopshelfAction) && epx.f(this.typeVideoAppleTopShelfClick, schemeStat$TypeAction.typeVideoAppleTopShelfClick) && epx.f(this.typeVideoScreenLockAction, schemeStat$TypeAction.typeVideoScreenLockAction) && epx.f(this.typeVideoDiscoveryTabsAction, schemeStat$TypeAction.typeVideoDiscoveryTabsAction) && epx.f(this.typeVideoSubtitlesAction, schemeStat$TypeAction.typeVideoSubtitlesAction) && epx.f(this.typeVideoShowSimilarsButtonAction, schemeStat$TypeAction.typeVideoShowSimilarsButtonAction) && epx.f(this.typeVideoOpenSimilarsAction, schemeStat$TypeAction.typeVideoOpenSimilarsAction) && epx.f(this.typeSimilarChannelsBlock, schemeStat$TypeAction.typeSimilarChannelsBlock) && epx.f(this.typeSimilarChannelsCardShow, schemeStat$TypeAction.typeSimilarChannelsCardShow) && epx.f(this.typeVideoOpenAuthorCabinet, schemeStat$TypeAction.typeVideoOpenAuthorCabinet) && epx.f(this.typeMarketUpdatedDeliveryBlock, schemeStat$TypeAction.typeMarketUpdatedDeliveryBlock) && epx.f(this.typeVideoAdTrialAction, schemeStat$TypeAction.typeVideoAdTrialAction) && epx.f(this.typeShutdownDetectionActionItem, schemeStat$TypeAction.typeShutdownDetectionActionItem) && epx.f(this.typePinVideoAction, schemeStat$TypeAction.typePinVideoAction) && epx.f(this.typeSportDirectLinkOpened, schemeStat$TypeAction.typeSportDirectLinkOpened) && epx.f(this.typeCoreNetworkBadConnectionAction, schemeStat$TypeAction.typeCoreNetworkBadConnectionAction) && epx.f(this.typeFeedShowMoreShopsButton, schemeStat$TypeAction.typeFeedShowMoreShopsButton) && epx.f(this.typeOverlayLiveProductCardClose, schemeStat$TypeAction.typeOverlayLiveProductCardClose);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.item;
        int hashCode2 = (hashCode + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.previousScreen;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem = this.typeFeedBlockRecommendedPlaylistsItem;
        int hashCode4 = (hashCode3 + (commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem == null ? 0 : commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.hashCode())) * 31;
        MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings = this.typePushNotificationsSettings;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings == null ? 0 : mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings.hashCode())) * 31;
        SchemeStat$TypeRegistrationItem schemeStat$TypeRegistrationItem = this.typeRegistrationItem;
        int hashCode6 = (hashCode5 + (schemeStat$TypeRegistrationItem == null ? 0 : schemeStat$TypeRegistrationItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioMixOptionsItem commonAudioStat$TypeAudioMixOptionsItem = this.typeAudioMixOptionsItem;
        int hashCode7 = (hashCode6 + (commonAudioStat$TypeAudioMixOptionsItem == null ? 0 : commonAudioStat$TypeAudioMixOptionsItem.hashCode())) * 31;
        SchemeStat$TypeOnboardingUsecasesItem schemeStat$TypeOnboardingUsecasesItem = this.typeOnboardingUsecasesItem;
        int hashCode8 = (hashCode7 + (schemeStat$TypeOnboardingUsecasesItem == null ? 0 : schemeStat$TypeOnboardingUsecasesItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem = this.typeAudioLongtapItem;
        int hashCode9 = (hashCode8 + (commonAudioStat$TypeAudioLongtapItem == null ? 0 : commonAudioStat$TypeAudioLongtapItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem = this.typeAudioSnippetItem;
        int hashCode10 = (hashCode9 + (commonAudioStat$TypeAudioSnippetItem == null ? 0 : commonAudioStat$TypeAudioSnippetItem.hashCode())) * 31;
        CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem = this.typeRadioStationItem;
        int hashCode11 = (hashCode10 + (commonAudioStat$TypeRadioStationItem == null ? 0 : commonAudioStat$TypeRadioStationItem.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedStopPagination mobileOfficialAppsFeedStat$TypeFeedStopPagination = this.typeFeedStopPagination;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsFeedStat$TypeFeedStopPagination == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedStopPagination.hashCode())) * 31;
        CommonVideoAdsStat$TypeOverlayAdRequest commonVideoAdsStat$TypeOverlayAdRequest = this.typeOverlayAdRequest;
        int hashCode13 = (hashCode12 + (commonVideoAdsStat$TypeOverlayAdRequest == null ? 0 : commonVideoAdsStat$TypeOverlayAdRequest.hashCode())) * 31;
        CommonVideoAdsStat$TypeOverlayAdResponse commonVideoAdsStat$TypeOverlayAdResponse = this.typeOverlayAdResponse;
        int hashCode14 = (hashCode13 + (commonVideoAdsStat$TypeOverlayAdResponse == null ? 0 : commonVideoAdsStat$TypeOverlayAdResponse.hashCode())) * 31;
        CommonVideoAdsStat$TypeOverlayAdClose commonVideoAdsStat$TypeOverlayAdClose = this.typeOverlayAdClose;
        int hashCode15 = (hashCode14 + (commonVideoAdsStat$TypeOverlayAdClose == null ? 0 : commonVideoAdsStat$TypeOverlayAdClose.hashCode())) * 31;
        CommonVideoAdsStat$TypeOverlayAdMenuAction commonVideoAdsStat$TypeOverlayAdMenuAction = this.typeOverlayAdMenuAction;
        int hashCode16 = (hashCode15 + (commonVideoAdsStat$TypeOverlayAdMenuAction == null ? 0 : commonVideoAdsStat$TypeOverlayAdMenuAction.hashCode())) * 31;
        CommonVideoAdsStat$TypeOverlayAdConfigBlocked commonVideoAdsStat$TypeOverlayAdConfigBlocked = this.typeOverlayAdConfigBlocked;
        int hashCode17 = (hashCode16 + (commonVideoAdsStat$TypeOverlayAdConfigBlocked == null ? 0 : commonVideoAdsStat$TypeOverlayAdConfigBlocked.hashCode())) * 31;
        CommonVideoAdsStat$TypeOverlayAdImpression commonVideoAdsStat$TypeOverlayAdImpression = this.typeOverlayAdImpression;
        int hashCode18 = (hashCode17 + (commonVideoAdsStat$TypeOverlayAdImpression == null ? 0 : commonVideoAdsStat$TypeOverlayAdImpression.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton = this.typeFeedShowFreshNewsButton;
        int hashCode19 = (hashCode18 + (mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop = this.typeFeedFeedScrollToTop;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedFeedRefresh mobileOfficialAppsFeedStat$TypeFeedFeedRefresh = this.typeFeedFeedRefresh;
        int hashCode21 = (hashCode20 + (mobileOfficialAppsFeedStat$TypeFeedFeedRefresh == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto = this.typeFeedZoomPhoto;
        int hashCode22 = (hashCode21 + (mobileOfficialAppsFeedStat$TypeFeedZoomPhoto == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedZoomPhoto.hashCode())) * 31;
        CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem = this.typeAudioDislikeItem;
        int hashCode23 = (hashCode22 + (commonAudioStat$TypeAudioDislikeItem == null ? 0 : commonAudioStat$TypeAudioDislikeItem.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin = this.typeFeedShowProductPin;
        int hashCode24 = (hashCode23 + (mobileOfficialAppsFeedStat$TypeFeedShowProductPin == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowProductPin.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin = this.typeFeedShowTicketItemPin;
        int hashCode25 = (hashCode24 + (mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin.hashCode())) * 31;
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = this.typeAudioOnboardingItem;
        int hashCode26 = (hashCode25 + (commonAudioStat$TypeAudioOnboardingItem == null ? 0 : commonAudioStat$TypeAudioOnboardingItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioAutoItem commonAudioStat$TypeAudioAutoItem = this.typeAudioAutoItem;
        int hashCode27 = (hashCode26 + (commonAudioStat$TypeAudioAutoItem == null ? 0 : commonAudioStat$TypeAudioAutoItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioDownloadItem commonAudioStat$TypeAudioDownloadItem = this.typeAudioDownloadItem;
        int hashCode28 = (hashCode27 + (commonAudioStat$TypeAudioDownloadItem == null ? 0 : commonAudioStat$TypeAudioDownloadItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapCloseCoachmarkItem commonAudioStat$TypeAudioTapCloseCoachmarkItem = this.typeAudioTapCloseCoachmarkItem;
        int hashCode29 = (hashCode28 + (commonAudioStat$TypeAudioTapCloseCoachmarkItem == null ? 0 : commonAudioStat$TypeAudioTapCloseCoachmarkItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioCoachmarkItem commonAudioStat$TypeAudioCoachmarkItem = this.typeAudioCoachmarkItem;
        int hashCode30 = (hashCode29 + (commonAudioStat$TypeAudioCoachmarkItem == null ? 0 : commonAudioStat$TypeAudioCoachmarkItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem = this.typeAudioTapPlayEventItem;
        int hashCode31 = (hashCode30 + (commonAudioStat$TypeAudioTapPlayEventItem == null ? 0 : commonAudioStat$TypeAudioTapPlayEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem = this.typeAudioTapShowEventItem;
        int hashCode32 = (hashCode31 + (commonAudioStat$TypeAudioTapShowEventItem == null ? 0 : commonAudioStat$TypeAudioTapShowEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem = this.typeAudioTapStopEventItem;
        int hashCode33 = (hashCode32 + (commonAudioStat$TypeAudioTapStopEventItem == null ? 0 : commonAudioStat$TypeAudioTapStopEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapTimerEventItem commonAudioStat$TypeAudioTapTimerEventItem = this.typeAudioTapTimerEventItem;
        int hashCode34 = (hashCode33 + (commonAudioStat$TypeAudioTapTimerEventItem == null ? 0 : commonAudioStat$TypeAudioTapTimerEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapStatusEventItem commonAudioStat$TypeAudioTapStatusEventItem = this.typeAudioTapStatusEventItem;
        int hashCode35 = (hashCode34 + (commonAudioStat$TypeAudioTapStatusEventItem == null ? 0 : commonAudioStat$TypeAudioTapStatusEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapSearchEventItem commonAudioStat$TypeAudioTapSearchEventItem = this.typeAudioTapSearchEventItem;
        int hashCode36 = (hashCode35 + (commonAudioStat$TypeAudioTapSearchEventItem == null ? 0 : commonAudioStat$TypeAudioTapSearchEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapUpdCollectionEventItem commonAudioStat$TypeAudioTapUpdCollectionEventItem = this.typeAudioTapUpdCollectionEventItem;
        int hashCode37 = (hashCode36 + (commonAudioStat$TypeAudioTapUpdCollectionEventItem == null ? 0 : commonAudioStat$TypeAudioTapUpdCollectionEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapEventItem commonAudioStat$TypeAudioTapEventItem = this.typeAudioTapEventItem;
        int hashCode38 = (hashCode37 + (commonAudioStat$TypeAudioTapEventItem == null ? 0 : commonAudioStat$TypeAudioTapEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem = this.typeAudioTapEqualizerEventItem;
        int hashCode39 = (hashCode38 + (commonAudioStat$TypeAudioTapEqualizerEventItem == null ? 0 : commonAudioStat$TypeAudioTapEqualizerEventItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem = this.typeAudioTapPopupEventItem;
        int hashCode40 = (hashCode39 + (commonAudioStat$TypeAudioTapPopupEventItem == null ? 0 : commonAudioStat$TypeAudioTapPopupEventItem.hashCode())) * 31;
        SchemeStat$TypeVkConnectNavigationItem schemeStat$TypeVkConnectNavigationItem = this.typeVkConnectNavigationItem;
        int hashCode41 = (hashCode40 + (schemeStat$TypeVkConnectNavigationItem == null ? 0 : schemeStat$TypeVkConnectNavigationItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem = this.typeAudioLyricsItem;
        int hashCode42 = (hashCode41 + (commonAudioStat$TypeAudioLyricsItem == null ? 0 : commonAudioStat$TypeAudioLyricsItem.hashCode())) * 31;
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem = this.typeAudioOfflineItem;
        int hashCode43 = (hashCode42 + (schemeStat$TypeAudioOfflineItem == null ? 0 : schemeStat$TypeAudioOfflineItem.hashCode())) * 31;
        SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem = this.typeWishlistItem;
        int hashCode44 = (hashCode43 + (schemeStat$TypeWishlistItem == null ? 0 : schemeStat$TypeWishlistItem.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem mobileOfficialAppsStoriesStat$TypeStoryPublishItem = this.typeStoryPublishItem;
        int hashCode45 = (hashCode44 + (mobileOfficialAppsStoriesStat$TypeStoryPublishItem == null ? 0 : mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hashCode())) * 31;
        SchemeStat$TypeMarketingTransitionItem schemeStat$TypeMarketingTransitionItem = this.typeMarketingTransitionItem;
        int hashCode46 = (hashCode45 + (schemeStat$TypeMarketingTransitionItem == null ? 0 : schemeStat$TypeMarketingTransitionItem.hashCode())) * 31;
        MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem = this.typeVoipCallItem;
        int hashCode47 = (hashCode46 + (mobileOfficialAppsCallsStat$TypeVoipCallItem == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipCallItem.hashCode())) * 31;
        MobileOfficialAppsCallsStat$TypeVoipErrorItem mobileOfficialAppsCallsStat$TypeVoipErrorItem = this.typeVoipErrorItem;
        int hashCode48 = (hashCode47 + (mobileOfficialAppsCallsStat$TypeVoipErrorItem == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipErrorItem.hashCode())) * 31;
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction mobileOfficialAppsCallsStat$TypeVoipImportContactsAction = this.typeVoipImportContactsAction;
        int hashCode49 = (hashCode48 + (mobileOfficialAppsCallsStat$TypeVoipImportContactsAction == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipImportContactsAction.hashCode())) * 31;
        MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction = this.typeVoipSyncContactsModalAction;
        int hashCode50 = (hashCode49 + (mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.hashCode())) * 31;
        CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem = this.typeUiHintItem;
        int hashCode51 = (hashCode50 + (commonOnboardingStat$TypeUiHintItem == null ? 0 : commonOnboardingStat$TypeUiHintItem.hashCode())) * 31;
        SchemeStat$TypeVkBridge schemeStat$TypeVkBridge = this.typeVkBridge;
        int hashCode52 = (hashCode51 + (schemeStat$TypeVkBridge == null ? 0 : schemeStat$TypeVkBridge.hashCode())) * 31;
        SchemeStat$TypeUniversalWidget schemeStat$TypeUniversalWidget = this.typeUniversalWidget;
        int hashCode53 = (hashCode52 + (schemeStat$TypeUniversalWidget == null ? 0 : schemeStat$TypeUniversalWidget.hashCode())) * 31;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = this.typeMarketItem;
        int hashCode54 = (hashCode53 + (schemeStat$TypeMarketItem == null ? 0 : schemeStat$TypeMarketItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeAddItemToCart mobileOfficialAppsMarketStat$TypeAddItemToCart = this.typeAddItemToCart;
        int hashCode55 = (hashCode54 + (mobileOfficialAppsMarketStat$TypeAddItemToCart == null ? 0 : mobileOfficialAppsMarketStat$TypeAddItemToCart.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem = this.typeRemoveItemFromCartItem;
        int hashCode56 = (hashCode55 + (mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem == null ? 0 : mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem.hashCode())) * 31;
        SchemeStat$TypePushRequestItem schemeStat$TypePushRequestItem = this.typePushRequestItem;
        int hashCode57 = (hashCode56 + (schemeStat$TypePushRequestItem == null ? 0 : schemeStat$TypePushRequestItem.hashCode())) * 31;
        SchemeStat$TypeVkPayCheckoutItem schemeStat$TypeVkPayCheckoutItem = this.typeVkPayCheckoutItem;
        int hashCode58 = (hashCode57 + (schemeStat$TypeVkPayCheckoutItem == null ? 0 : schemeStat$TypeVkPayCheckoutItem.hashCode())) * 31;
        SchemeStat$TypeSakSessionsEventItem schemeStat$TypeSakSessionsEventItem = this.typeSakSessionsEventItem;
        int hashCode59 = (hashCode58 + (schemeStat$TypeSakSessionsEventItem == null ? 0 : schemeStat$TypeSakSessionsEventItem.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen = this.typeMiniAppsInstallScreen;
        int hashCode60 = (hashCode59 + (mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount = this.typeMiniAppsPersonalDiscount;
        int hashCode61 = (hashCode60 + (mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem = this.typeMiniAppsCloseConfirmationAlertItem;
        int hashCode62 = (hashCode61 + (mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.hashCode())) * 31;
        CommonFeedStat$TypeFeedBlockMiniAppsItem commonFeedStat$TypeFeedBlockMiniAppsItem = this.typeFeedBlockMiniAppsItem;
        int hashCode63 = (hashCode62 + (commonFeedStat$TypeFeedBlockMiniAppsItem == null ? 0 : commonFeedStat$TypeFeedBlockMiniAppsItem.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem = this.typeStoryFeedViewItem;
        int hashCode64 = (hashCode63 + (mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem == null ? 0 : mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem mobileOfficialAppsStoriesStat$TypeStoryViewItem = this.typeStoryViewItem;
        int hashCode65 = (hashCode64 + (mobileOfficialAppsStoriesStat$TypeStoryViewItem == null ? 0 : mobileOfficialAppsStoriesStat$TypeStoryViewItem.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem = this.typeMiniAppOpenItem;
        int hashCode66 = (hashCode65 + (mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem = this.typeMiniAppAccessTokenItem;
        int hashCode67 = (hashCode66 + (mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem = this.typeMiniAppSessionItem;
        int hashCode68 = (hashCode67 + (mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.hashCode())) * 31;
        SchemeStat$TypeEasterEggsItem schemeStat$TypeEasterEggsItem = this.typeEasterEggsItem;
        int hashCode69 = (hashCode68 + (schemeStat$TypeEasterEggsItem == null ? 0 : schemeStat$TypeEasterEggsItem.hashCode())) * 31;
        SchemeStat$TypeVkRunItem schemeStat$TypeVkRunItem = this.typeVkRunItem;
        int hashCode70 = (hashCode69 + (schemeStat$TypeVkRunItem == null ? 0 : schemeStat$TypeVkRunItem.hashCode())) * 31;
        SchemeStat$TypeVkWorkoutItem schemeStat$TypeVkWorkoutItem = this.typeVkWorkoutItem;
        int hashCode71 = (hashCode70 + (schemeStat$TypeVkWorkoutItem == null ? 0 : schemeStat$TypeVkWorkoutItem.hashCode())) * 31;
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem mobileOfficialAppsHealthStat$TypeHealthSyncStateItem = this.typeHealthSyncStateItem;
        int hashCode72 = (hashCode71 + (mobileOfficialAppsHealthStat$TypeHealthSyncStateItem == null ? 0 : mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.hashCode())) * 31;
        MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem = this.typeHealthPermissionResultItem;
        int hashCode73 = (hashCode72 + (mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem == null ? 0 : mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.hashCode())) * 31;
        MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem = this.typeHealthConnectInfoItem;
        int hashCode74 = (hashCode73 + (mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem == null ? 0 : mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.hashCode())) * 31;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem = this.typeSystemWidgetRefreshEventItem;
        int hashCode75 = (hashCode74 + (mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem == null ? 0 : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.hashCode())) * 31;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem = this.typeSystemWidgetDisplayedEventItem;
        int hashCode76 = (hashCode75 + (mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem == null ? 0 : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem.hashCode())) * 31;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem = this.typeSystemWidgetAddEventItem;
        int hashCode77 = (hashCode76 + (mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem == null ? 0 : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.hashCode())) * 31;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem = this.typeSystemWidgetRemoveEventItem;
        int hashCode78 = (hashCode77 + (mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem == null ? 0 : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.hashCode())) * 31;
        SchemeStat$TypeCastEventItem schemeStat$TypeCastEventItem = this.typeCastEventItem;
        int hashCode79 = (hashCode78 + (schemeStat$TypeCastEventItem == null ? 0 : schemeStat$TypeCastEventItem.hashCode())) * 31;
        SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem = this.typeMessagingContactRecommendationsItem;
        int hashCode80 = (hashCode79 + (schemeStat$TypeMessagingContactRecommendationsItem == null ? 0 : schemeStat$TypeMessagingContactRecommendationsItem.hashCode())) * 31;
        SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem = this.typeMessagingActionItem;
        int hashCode81 = (hashCode80 + (schemeStat$TypeMessagingActionItem == null ? 0 : schemeStat$TypeMessagingActionItem.hashCode())) * 31;
        SchemeStat$TypeMessagingAudioMessageItem schemeStat$TypeMessagingAudioMessageItem = this.typeMessagingAudioMessageItem;
        int hashCode82 = (hashCode81 + (schemeStat$TypeMessagingAudioMessageItem == null ? 0 : schemeStat$TypeMessagingAudioMessageItem.hashCode())) * 31;
        SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem = this.typeSuperappBirthdayPresentItem;
        int hashCode83 = (hashCode82 + (schemeStat$TypeSuperappBirthdayPresentItem == null ? 0 : schemeStat$TypeSuperappBirthdayPresentItem.hashCode())) * 31;
        SchemeStat$TypeMiniAppCustomEventItem schemeStat$TypeMiniAppCustomEventItem = this.typeMiniAppCustomEventItem;
        int hashCode84 = (hashCode83 + (schemeStat$TypeMiniAppCustomEventItem == null ? 0 : schemeStat$TypeMiniAppCustomEventItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem = this.typeMarusiaConversationItem;
        int hashCode85 = (hashCode84 + (mobileOfficialAppsMarusiaStat$TypeConversationItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeConversationItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem = this.typeMarusiaReadingItem;
        int hashCode86 = (hashCode85 + (mobileOfficialAppsMarusiaStat$TypeReadingItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeReadingItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeSettingsItem mobileOfficialAppsMarusiaStat$TypeSettingsItem = this.typeMarusiaSettingsItem;
        int hashCode87 = (hashCode86 + (mobileOfficialAppsMarusiaStat$TypeSettingsItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeSettingsItem.hashCode())) * 31;
        SchemeStat$TypeVkConnectQuestionnaire schemeStat$TypeVkConnectQuestionnaire = this.typeVkConnectQuestionnaire;
        int hashCode88 = (hashCode87 + (schemeStat$TypeVkConnectQuestionnaire == null ? 0 : schemeStat$TypeVkConnectQuestionnaire.hashCode())) * 31;
        SchemeStat$TypeSuperappSnowItem schemeStat$TypeSuperappSnowItem = this.typeSuperappSnowItem;
        int hashCode89 = (hashCode88 + (schemeStat$TypeSuperappSnowItem == null ? 0 : schemeStat$TypeSuperappSnowItem.hashCode())) * 31;
        SchemeStat$TypeCallerIdEventItem schemeStat$TypeCallerIdEventItem = this.typeCallerIdEventItem;
        int hashCode90 = (hashCode89 + (schemeStat$TypeCallerIdEventItem == null ? 0 : schemeStat$TypeCallerIdEventItem.hashCode())) * 31;
        SchemeStat$TypeSuperappStatlogItem schemeStat$TypeSuperappStatlogItem = this.typeSuperappStatlogItem;
        int hashCode91 = (hashCode90 + (schemeStat$TypeSuperappStatlogItem == null ? 0 : schemeStat$TypeSuperappStatlogItem.hashCode())) * 31;
        SchemeStat$TypeOwnerButtonAppRenderItem schemeStat$TypeOwnerButtonAppRenderItem = this.typeOwnerButtonAppRenderItem;
        int hashCode92 = (hashCode91 + (schemeStat$TypeOwnerButtonAppRenderItem == null ? 0 : schemeStat$TypeOwnerButtonAppRenderItem.hashCode())) * 31;
        CommonSearchStat$TypeSearchItem commonSearchStat$TypeSearchItem = this.typeSearchItem;
        int hashCode93 = (hashCode92 + (commonSearchStat$TypeSearchItem == null ? 0 : commonSearchStat$TypeSearchItem.hashCode())) * 31;
        CommonSearchStat$TypeLocalSearchItem commonSearchStat$TypeLocalSearchItem = this.typeLocalSearchItem;
        int hashCode94 = (hashCode93 + (commonSearchStat$TypeLocalSearchItem == null ? 0 : commonSearchStat$TypeLocalSearchItem.hashCode())) * 31;
        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = this.typeSuperappScreenItem;
        int hashCode95 = (hashCode94 + (schemeStat$TypeSuperappScreenItem == null ? 0 : schemeStat$TypeSuperappScreenItem.hashCode())) * 31;
        MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem = this.typeSuperappOnboardingActionItem;
        int hashCode96 = (hashCode95 + (mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem == null ? 0 : mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock = this.typeClipPopularTemplatesBlock;
        int hashCode97 = (hashCode96 + (mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock == null ? 0 : mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem = this.typeClipsTrendsCatalogItem;
        int hashCode98 = (hashCode97 + (mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipTemplateItem mobileOfficialAppsClipsStat$TypeClipTemplateItem = this.typeClipTemplateItem;
        int hashCode99 = (hashCode98 + (mobileOfficialAppsClipsStat$TypeClipTemplateItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipTemplateItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipPublishItem mobileOfficialAppsClipsStat$TypeClipPublishItem = this.typeClipPublishItem;
        int hashCode100 = (hashCode99 + (mobileOfficialAppsClipsStat$TypeClipPublishItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipPublishItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem = this.typeClipMusicCatalogItem;
        int hashCode101 = (hashCode100 + (mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipCameraItem mobileOfficialAppsClipsStat$TypeClipCameraItem = this.typeClipCameraItem;
        int hashCode102 = (hashCode101 + (mobileOfficialAppsClipsStat$TypeClipCameraItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipCameraItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipCoownersItem mobileOfficialAppsClipsStat$TypeClipCoownersItem = this.typeClipCoownersItem;
        int hashCode103 = (hashCode102 + (mobileOfficialAppsClipsStat$TypeClipCoownersItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipCoownersItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem = this.typeClipEditorItem;
        int hashCode104 = (hashCode103 + (mobileOfficialAppsClipsStat$TypeClipEditorItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipEditorItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipEditItem mobileOfficialAppsClipsStat$TypeClipEditItem = this.typeClipEditItem;
        int hashCode105 = (hashCode104 + (mobileOfficialAppsClipsStat$TypeClipEditItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipEditItem.hashCode())) * 31;
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = this.typeClipViewerItem;
        int hashCode106 = (hashCode105 + (schemeStat$TypeClipViewerItem == null ? 0 : schemeStat$TypeClipViewerItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipCommentSharingItem mobileOfficialAppsClipsStat$TypeClipCommentSharingItem = this.typeClipCommentSharingItem;
        int hashCode107 = (hashCode106 + (mobileOfficialAppsClipsStat$TypeClipCommentSharingItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipCommentSharingItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipScrollAfterBite mobileOfficialAppsClipsStat$TypeClipScrollAfterBite = this.typeClipScrollAfterBite;
        int hashCode108 = (hashCode107 + (mobileOfficialAppsClipsStat$TypeClipScrollAfterBite == null ? 0 : mobileOfficialAppsClipsStat$TypeClipScrollAfterBite.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipCommentSortItem mobileOfficialAppsClipsStat$TypeClipCommentSortItem = this.typeClipCommentSortItem;
        int hashCode109 = (hashCode108 + (mobileOfficialAppsClipsStat$TypeClipCommentSortItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipCommentSortItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsStatAdsAction mobileOfficialAppsClipsStat$TypeClipsStatAdsAction = this.typeClipsStatAdsAction;
        int hashCode110 = (hashCode109 + (mobileOfficialAppsClipsStat$TypeClipsStatAdsAction == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsStatAdsAction.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeLiveViewerItem mobileOfficialAppsClipsStat$TypeLiveViewerItem = this.typeLiveViewerItem;
        int hashCode111 = (hashCode110 + (mobileOfficialAppsClipsStat$TypeLiveViewerItem == null ? 0 : mobileOfficialAppsClipsStat$TypeLiveViewerItem.hashCode())) * 31;
        MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner = this.typeAdsBanner;
        int hashCode112 = (hashCode111 + (mobileOfficialAppsAdsStat$TypeAdsBanner == null ? 0 : mobileOfficialAppsAdsStat$TypeAdsBanner.hashCode())) * 31;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest = this.typeMiniAppsAdsRequest;
        int hashCode113 = (hashCode112 + (mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest == null ? 0 : mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.hashCode())) * 31;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative = this.typeMiniAppsAdsNative;
        int hashCode114 = (hashCode113 + (mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative == null ? 0 : mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.hashCode())) * 31;
        MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem = this.typeRewardedAdsShowActionItem;
        int hashCode115 = (hashCode114 + (mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem == null ? 0 : mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingAction commonCommunitiesStat$TypeCommunityOnboardingAction = this.typeCommunityOnboardingAction;
        int hashCode116 = (hashCode115 + (commonCommunitiesStat$TypeCommunityOnboardingAction == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingAction.hashCode())) * 31;
        CommonVideoStat$TypeVideoPlayerActionItem commonVideoStat$TypeVideoPlayerActionItem = this.typeVideoPlayerActionItem;
        int hashCode117 = (hashCode116 + (commonVideoStat$TypeVideoPlayerActionItem == null ? 0 : commonVideoStat$TypeVideoPlayerActionItem.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedAdsInsert mobileOfficialAppsFeedStat$TypeFeedAdsInsert = this.typeFeedAdsInsert;
        int hashCode118 = (hashCode117 + (mobileOfficialAppsFeedStat$TypeFeedAdsInsert == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedAdsInsert.hashCode())) * 31;
        MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest = this.typeFeedSdkAdRequest;
        int hashCode119 = (hashCode118 + (mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest == null ? 0 : mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError = this.typeFeedAsyncBlockError;
        int hashCode120 = (hashCode119 + (mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError.hashCode())) * 31;
        CommonFeedStat$TypeFeedActionButtonItem commonFeedStat$TypeFeedActionButtonItem = this.typeFeedActionButtonItem;
        int hashCode121 = (hashCode120 + (commonFeedStat$TypeFeedActionButtonItem == null ? 0 : commonFeedStat$TypeFeedActionButtonItem.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost = this.typeFeedDuplicateOwnerPost;
        int hashCode122 = (hashCode121 + (mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost.hashCode())) * 31;
        MobileOfficialAppsCorePushesStat$TypePushEventItem mobileOfficialAppsCorePushesStat$TypePushEventItem = this.typePushEventItem;
        int hashCode123 = (hashCode122 + (mobileOfficialAppsCorePushesStat$TypePushEventItem == null ? 0 : mobileOfficialAppsCorePushesStat$TypePushEventItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem = this.typeVideoInAppReviewInitialAppearanceItem;
        int hashCode124 = (hashCode123 + (mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent = this.typeVideoKidsModeChangedEvent;
        int hashCode125 = (hashCode124 + (mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent.hashCode())) * 31;
        CommonBookmarksStat$TypeBookmarksAction commonBookmarksStat$TypeBookmarksAction = this.typeBookmarksAction;
        int hashCode126 = (hashCode125 + (commonBookmarksStat$TypeBookmarksAction == null ? 0 : commonBookmarksStat$TypeBookmarksAction.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeMotivationItem mobileOfficialAppsClipsStat$TypeMotivationItem = this.typeMotivationItem;
        int hashCode127 = (hashCode126 + (mobileOfficialAppsClipsStat$TypeMotivationItem == null ? 0 : mobileOfficialAppsClipsStat$TypeMotivationItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem = this.typeClipsCreationScreenItem;
        int hashCode128 = (hashCode127 + (mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem = this.typeClipsCreationScreenButtonsItem;
        int hashCode129 = (hashCode128 + (mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem = this.typeAudioListeningItem;
        int hashCode130 = (hashCode129 + (commonAudioStat$TypeAudioListeningItem == null ? 0 : commonAudioStat$TypeAudioListeningItem.hashCode())) * 31;
        CommonAudioStat$TypeAudiobookActItem commonAudioStat$TypeAudiobookActItem = this.typeAudiobookActItem;
        int hashCode131 = (hashCode130 + (commonAudioStat$TypeAudiobookActItem == null ? 0 : commonAudioStat$TypeAudiobookActItem.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImConversationsBannerItem mobileOfficialAppsImStat$TypeImConversationsBannerItem = this.typeImConversationsBannerItem;
        int hashCode132 = (hashCode131 + (mobileOfficialAppsImStat$TypeImConversationsBannerItem == null ? 0 : mobileOfficialAppsImStat$TypeImConversationsBannerItem.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImChannelJoinAction mobileOfficialAppsImStat$TypeImChannelJoinAction = this.typeImChannelJoinAction;
        int hashCode133 = (hashCode132 + (mobileOfficialAppsImStat$TypeImChannelJoinAction == null ? 0 : mobileOfficialAppsImStat$TypeImChannelJoinAction.hashCode())) * 31;
        CommonAudioStat$TypeMusicSubscriptionItem commonAudioStat$TypeMusicSubscriptionItem = this.typeMusicSubscriptionItem;
        int hashCode134 = (hashCode133 + (commonAudioStat$TypeMusicSubscriptionItem == null ? 0 : commonAudioStat$TypeMusicSubscriptionItem.hashCode())) * 31;
        q0 q0Var = this.typeVideoSuggestDownloadsAppearanceItem;
        int hashCode135 = (hashCode134 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeExternalDeviceAction mobileOfficialAppsVideoStat$TypeExternalDeviceAction = this.typeExternalDeviceAction;
        int hashCode136 = (hashCode135 + (mobileOfficialAppsVideoStat$TypeExternalDeviceAction == null ? 0 : mobileOfficialAppsVideoStat$TypeExternalDeviceAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreencastCodeAction mobileOfficialAppsVideoStat$TypeScreencastCodeAction = this.typeScreencastCodeAction;
        int hashCode137 = (hashCode136 + (mobileOfficialAppsVideoStat$TypeScreencastCodeAction == null ? 0 : mobileOfficialAppsVideoStat$TypeScreencastCodeAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction = this.typeVideoDownloadWaitForUserAction;
        int hashCode138 = (hashCode137 + (mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem = this.typeVideoDynamicTabsOnboardingItem;
        int hashCode139 = (hashCode138 + (mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction = this.typeVideoDownloadSkipAction;
        int hashCode140 = (hashCode139 + (mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction.hashCode())) * 31;
        CommonOnboardingRecomThemesStat$TypeRecomThemesItem commonOnboardingRecomThemesStat$TypeRecomThemesItem = this.typeRecomThemesItem;
        int hashCode141 = (hashCode140 + (commonOnboardingRecomThemesStat$TypeRecomThemesItem == null ? 0 : commonOnboardingRecomThemesStat$TypeRecomThemesItem.hashCode())) * 31;
        MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem = this.typeTabbarItem;
        int hashCode142 = (hashCode141 + (mobileOfficialAppsTabbarStat$TypeTabbarItem == null ? 0 : mobileOfficialAppsTabbarStat$TypeTabbarItem.hashCode())) * 31;
        MobileOfficialAppsCorePermissionStat$TypePermissionChange mobileOfficialAppsCorePermissionStat$TypePermissionChange = this.typePermissionChange;
        int hashCode143 = (hashCode142 + (mobileOfficialAppsCorePermissionStat$TypePermissionChange == null ? 0 : mobileOfficialAppsCorePermissionStat$TypePermissionChange.hashCode())) * 31;
        SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents = this.typeSnowballEvents;
        int hashCode144 = (hashCode143 + (schemeStat$TypeSnowballEvents == null ? 0 : schemeStat$TypeSnowballEvents.hashCode())) * 31;
        SchemeStat$TypeMtTimespentItem schemeStat$TypeMtTimespentItem = this.typeMtTimespentItem;
        int hashCode145 = (hashCode144 + (schemeStat$TypeMtTimespentItem == null ? 0 : schemeStat$TypeMtTimespentItem.hashCode())) * 31;
        MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem = this.typeSecureLockEntranceItem;
        int hashCode146 = (hashCode145 + (mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem == null ? 0 : mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal = this.typeDonutGoal;
        int hashCode147 = (hashCode146 + (commonCommunitiesStat$TypeDonutGoal == null ? 0 : commonCommunitiesStat$TypeDonutGoal.hashCode())) * 31;
        CommonCommunitiesStat$TypeDonutPrivacySettingChanged commonCommunitiesStat$TypeDonutPrivacySettingChanged = this.typeDonutPrivacySettingChangedItem;
        int hashCode148 = (hashCode147 + (commonCommunitiesStat$TypeDonutPrivacySettingChanged == null ? 0 : commonCommunitiesStat$TypeDonutPrivacySettingChanged.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImInvitationCardRejectAction mobileOfficialAppsImStat$TypeImInvitationCardRejectAction = this.typeImInvitationCardRejectAction;
        int hashCode149 = (hashCode148 + (mobileOfficialAppsImStat$TypeImInvitationCardRejectAction == null ? 0 : mobileOfficialAppsImStat$TypeImInvitationCardRejectAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem = this.typeTvKidModeItem;
        int hashCode150 = (hashCode149 + (mobileOfficialAppsVideoStat$TypeTvKidModeItem == null ? 0 : mobileOfficialAppsVideoStat$TypeTvKidModeItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout = this.typeTvKidModeItemLogout;
        int hashCode151 = (hashCode150 + (mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout == null ? 0 : mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedPostStartAudio mobileOfficialAppsFeedStat$TypeFeedPostStartAudio = this.typeFeedPostStartAudio;
        int hashCode152 = (hashCode151 + (mobileOfficialAppsFeedStat$TypeFeedPostStartAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist = this.typeFeedPostStartPlaylist;
        int hashCode153 = (hashCode152 + (mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.hashCode())) * 31;
        CommonVideoStat$TypeUniversalBanner commonVideoStat$TypeUniversalBanner = this.typeUniversalBanner;
        int hashCode154 = (hashCode153 + (commonVideoStat$TypeUniversalBanner == null ? 0 : commonVideoStat$TypeUniversalBanner.hashCode())) * 31;
        CommonVideoStat$TypeVideoPushSettingsBanner commonVideoStat$TypeVideoPushSettingsBanner = this.typeVideoPushSettingsBanner;
        int hashCode155 = (hashCode154 + (commonVideoStat$TypeVideoPushSettingsBanner == null ? 0 : commonVideoStat$TypeVideoPushSettingsBanner.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog = this.typeUploadExitConfirmationDialog;
        int hashCode156 = (hashCode155 + (mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog == null ? 0 : mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoToClipUpload mobileOfficialAppsVideoStat$TypeVideoToClipUpload = this.typeVideoToClipUpload;
        int hashCode157 = (hashCode156 + (mobileOfficialAppsVideoStat$TypeVideoToClipUpload == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoToClipUpload.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect = this.typeVideoUploadAuthorSelect;
        int hashCode158 = (hashCode157 + (mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect = this.typeVideoKidsAgeFilterSelect;
        int hashCode159 = (hashCode158 + (mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset = this.typeVideoKidsAgeFilterReset;
        int hashCode160 = (hashCode159 + (mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem = this.typeMoveYoutubeSubsClickItem;
        int hashCode161 = (hashCode160 + (mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem == null ? 0 : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem.hashCode())) * 31;
        j0 j0Var = this.typeSelectCreatorsClickItem;
        int hashCode162 = (hashCode161 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick = this.typeSelectCreatorsScreenConfirmClick;
        int hashCode163 = (hashCode162 + (mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick == null ? 0 : mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick = this.typeCreatorHideUndoHideClick;
        int hashCode164 = (hashCode163 + (mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick == null ? 0 : mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio = this.typeFeedPostPlayedUnitOfAudio;
        int hashCode165 = (hashCode164 + (mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.hashCode())) * 31;
        CommonVideoStat$TypeVideoNextVideoStartAction commonVideoStat$TypeVideoNextVideoStartAction = this.typeVideoNextVideoStartAction;
        int hashCode166 = (hashCode165 + (commonVideoStat$TypeVideoNextVideoStartAction == null ? 0 : commonVideoStat$TypeVideoNextVideoStartAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction = this.typeVideoUploadCoverAction;
        int hashCode167 = (hashCode166 + (mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto = this.typeVideoUploadCoverApplyPhoto;
        int hashCode168 = (hashCode167 + (mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.hashCode())) * 31;
        CommonVideoStat$TypeVideoCreateChannelAction commonVideoStat$TypeVideoCreateChannelAction = this.typeVideoCreateChannelAction;
        int hashCode169 = (hashCode168 + (commonVideoStat$TypeVideoCreateChannelAction == null ? 0 : commonVideoStat$TypeVideoCreateChannelAction.hashCode())) * 31;
        CommonUxpollsStat$TypeUxpollsEvent commonUxpollsStat$TypeUxpollsEvent = this.typeUxpollsEvent;
        int hashCode170 = (hashCode169 + (commonUxpollsStat$TypeUxpollsEvent == null ? 0 : commonUxpollsStat$TypeUxpollsEvent.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo = this.typeVideoAttachObjectToVideo;
        int hashCode171 = (hashCode170 + (mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTvKidProfileItem mobileOfficialAppsVideoStat$TypeTvKidProfileItem = this.typeTvKidProfileItem;
        int hashCode172 = (hashCode171 + (mobileOfficialAppsVideoStat$TypeTvKidProfileItem == null ? 0 : mobileOfficialAppsVideoStat$TypeTvKidProfileItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoChildProfileActions mobileOfficialAppsVideoStat$TypeVideoChildProfileActions = this.typeVideoChildProfileActions;
        int hashCode173 = (hashCode172 + (mobileOfficialAppsVideoStat$TypeVideoChildProfileActions == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoChildProfileActions.hashCode())) * 31;
        CommonVideoStat$TypeLiveActionsItem commonVideoStat$TypeLiveActionsItem = this.typeLiveActions;
        int hashCode174 = (hashCode173 + (commonVideoStat$TypeLiveActionsItem == null ? 0 : commonVideoStat$TypeLiveActionsItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode = this.typeVideoPlayerChangeMode;
        int hashCode175 = (hashCode174 + (mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeTopshelfAction mobileOfficialAppsVideoStat$TypeTopshelfAction = this.typeTopshelfAction;
        int hashCode176 = (hashCode175 + (mobileOfficialAppsVideoStat$TypeTopshelfAction == null ? 0 : mobileOfficialAppsVideoStat$TypeTopshelfAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick = this.typeVideoAppleTopShelfClick;
        int hashCode177 = (hashCode176 + (mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoScreenLockAction mobileOfficialAppsVideoStat$TypeVideoScreenLockAction = this.typeVideoScreenLockAction;
        int hashCode178 = (hashCode177 + (mobileOfficialAppsVideoStat$TypeVideoScreenLockAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoScreenLockAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction = this.typeVideoDiscoveryTabsAction;
        int hashCode179 = (hashCode178 + (mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction = this.typeVideoSubtitlesAction;
        int hashCode180 = (hashCode179 + (mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction = this.typeVideoShowSimilarsButtonAction;
        int hashCode181 = (hashCode180 + (mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction = this.typeVideoOpenSimilarsAction;
        int hashCode182 = (hashCode181 + (mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction.hashCode())) * 31;
        CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock commonVideoOtherChannelsStat$TypeSimilarChannelsBlock = this.typeSimilarChannelsBlock;
        int hashCode183 = (hashCode182 + (commonVideoOtherChannelsStat$TypeSimilarChannelsBlock == null ? 0 : commonVideoOtherChannelsStat$TypeSimilarChannelsBlock.hashCode())) * 31;
        CommonVideoOtherChannelsStat$TypeSimilarChannelsCardShow commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow = this.typeSimilarChannelsCardShow;
        int hashCode184 = (hashCode183 + (commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow == null ? 0 : commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow.hashCode())) * 31;
        CommonVideoStat$TypeVideoOpenAuthorCabinet commonVideoStat$TypeVideoOpenAuthorCabinet = this.typeVideoOpenAuthorCabinet;
        int hashCode185 = (hashCode184 + (commonVideoStat$TypeVideoOpenAuthorCabinet == null ? 0 : commonVideoStat$TypeVideoOpenAuthorCabinet.hashCode())) * 31;
        CommonMarketStat$TypeMarketDeliveryBlockUpdatedItem commonMarketStat$TypeMarketDeliveryBlockUpdatedItem = this.typeMarketUpdatedDeliveryBlock;
        int hashCode186 = (hashCode185 + (commonMarketStat$TypeMarketDeliveryBlockUpdatedItem == null ? 0 : commonMarketStat$TypeMarketDeliveryBlockUpdatedItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialAction mobileOfficialAppsVideoStat$TypeVideoAdTrialAction = this.typeVideoAdTrialAction;
        int hashCode187 = (hashCode186 + (mobileOfficialAppsVideoStat$TypeVideoAdTrialAction == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdTrialAction.hashCode())) * 31;
        MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem = this.typeShutdownDetectionActionItem;
        int hashCode188 = (hashCode187 + (mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem == null ? 0 : mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypePinVideoAction mobileOfficialAppsVideoStat$TypePinVideoAction = this.typePinVideoAction;
        int hashCode189 = (hashCode188 + (mobileOfficialAppsVideoStat$TypePinVideoAction == null ? 0 : mobileOfficialAppsVideoStat$TypePinVideoAction.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened = this.typeSportDirectLinkOpened;
        int hashCode190 = (hashCode189 + (mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened == null ? 0 : mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened.hashCode())) * 31;
        CommonCoreNetworkStat$NetworkBadConnectionAction commonCoreNetworkStat$NetworkBadConnectionAction = this.typeCoreNetworkBadConnectionAction;
        int hashCode191 = (hashCode190 + (commonCoreNetworkStat$NetworkBadConnectionAction == null ? 0 : commonCoreNetworkStat$NetworkBadConnectionAction.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton = this.typeFeedShowMoreShopsButton;
        int hashCode192 = (hashCode191 + (mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose = this.typeOverlayLiveProductCardClose;
        return hashCode192 + (mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose != null ? mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAction(type=" + this.type + ", item=" + this.item + ", previousScreen=" + this.previousScreen + ", typeFeedBlockRecommendedPlaylistsItem=" + this.typeFeedBlockRecommendedPlaylistsItem + ", typePushNotificationsSettings=" + this.typePushNotificationsSettings + ", typeRegistrationItem=" + this.typeRegistrationItem + ", typeAudioMixOptionsItem=" + this.typeAudioMixOptionsItem + ", typeOnboardingUsecasesItem=" + this.typeOnboardingUsecasesItem + ", typeAudioLongtapItem=" + this.typeAudioLongtapItem + ", typeAudioSnippetItem=" + this.typeAudioSnippetItem + ", typeRadioStationItem=" + this.typeRadioStationItem + ", typeFeedStopPagination=" + this.typeFeedStopPagination + ", typeOverlayAdRequest=" + this.typeOverlayAdRequest + ", typeOverlayAdResponse=" + this.typeOverlayAdResponse + ", typeOverlayAdClose=" + this.typeOverlayAdClose + ", typeOverlayAdMenuAction=" + this.typeOverlayAdMenuAction + ", typeOverlayAdConfigBlocked=" + this.typeOverlayAdConfigBlocked + ", typeOverlayAdImpression=" + this.typeOverlayAdImpression + ", typeFeedShowFreshNewsButton=" + this.typeFeedShowFreshNewsButton + ", typeFeedFeedScrollToTop=" + this.typeFeedFeedScrollToTop + ", typeFeedFeedRefresh=" + this.typeFeedFeedRefresh + ", typeFeedZoomPhoto=" + this.typeFeedZoomPhoto + ", typeAudioDislikeItem=" + this.typeAudioDislikeItem + ", typeFeedShowProductPin=" + this.typeFeedShowProductPin + ", typeFeedShowTicketItemPin=" + this.typeFeedShowTicketItemPin + ", typeAudioOnboardingItem=" + this.typeAudioOnboardingItem + ", typeAudioAutoItem=" + this.typeAudioAutoItem + ", typeAudioDownloadItem=" + this.typeAudioDownloadItem + ", typeAudioTapCloseCoachmarkItem=" + this.typeAudioTapCloseCoachmarkItem + ", typeAudioCoachmarkItem=" + this.typeAudioCoachmarkItem + ", typeAudioTapPlayEventItem=" + this.typeAudioTapPlayEventItem + ", typeAudioTapShowEventItem=" + this.typeAudioTapShowEventItem + ", typeAudioTapStopEventItem=" + this.typeAudioTapStopEventItem + ", typeAudioTapTimerEventItem=" + this.typeAudioTapTimerEventItem + ", typeAudioTapStatusEventItem=" + this.typeAudioTapStatusEventItem + ", typeAudioTapSearchEventItem=" + this.typeAudioTapSearchEventItem + ", typeAudioTapUpdCollectionEventItem=" + this.typeAudioTapUpdCollectionEventItem + ", typeAudioTapEventItem=" + this.typeAudioTapEventItem + ", typeAudioTapEqualizerEventItem=" + this.typeAudioTapEqualizerEventItem + ", typeAudioTapPopupEventItem=" + this.typeAudioTapPopupEventItem + ", typeVkConnectNavigationItem=" + this.typeVkConnectNavigationItem + ", typeAudioLyricsItem=" + this.typeAudioLyricsItem + ", typeAudioOfflineItem=" + this.typeAudioOfflineItem + ", typeWishlistItem=" + this.typeWishlistItem + ", typeStoryPublishItem=" + this.typeStoryPublishItem + ", typeMarketingTransitionItem=" + this.typeMarketingTransitionItem + ", typeVoipCallItem=" + this.typeVoipCallItem + ", typeVoipErrorItem=" + this.typeVoipErrorItem + ", typeVoipImportContactsAction=" + this.typeVoipImportContactsAction + ", typeVoipSyncContactsModalAction=" + this.typeVoipSyncContactsModalAction + ", typeUiHintItem=" + this.typeUiHintItem + ", typeVkBridge=" + this.typeVkBridge + ", typeUniversalWidget=" + this.typeUniversalWidget + ", typeMarketItem=" + this.typeMarketItem + ", typeAddItemToCart=" + this.typeAddItemToCart + ", typeRemoveItemFromCartItem=" + this.typeRemoveItemFromCartItem + ", typePushRequestItem=" + this.typePushRequestItem + ", typeVkPayCheckoutItem=" + this.typeVkPayCheckoutItem + ", typeSakSessionsEventItem=" + this.typeSakSessionsEventItem + ", typeMiniAppsInstallScreen=" + this.typeMiniAppsInstallScreen + ", typeMiniAppsPersonalDiscount=" + this.typeMiniAppsPersonalDiscount + ", typeMiniAppsCloseConfirmationAlertItem=" + this.typeMiniAppsCloseConfirmationAlertItem + ", typeFeedBlockMiniAppsItem=" + this.typeFeedBlockMiniAppsItem + ", typeStoryFeedViewItem=" + this.typeStoryFeedViewItem + ", typeStoryViewItem=" + this.typeStoryViewItem + ", typeMiniAppOpenItem=" + this.typeMiniAppOpenItem + ", typeMiniAppAccessTokenItem=" + this.typeMiniAppAccessTokenItem + ", typeMiniAppSessionItem=" + this.typeMiniAppSessionItem + ", typeEasterEggsItem=" + this.typeEasterEggsItem + ", typeVkRunItem=" + this.typeVkRunItem + ", typeVkWorkoutItem=" + this.typeVkWorkoutItem + ", typeHealthSyncStateItem=" + this.typeHealthSyncStateItem + ", typeHealthPermissionResultItem=" + this.typeHealthPermissionResultItem + ", typeHealthConnectInfoItem=" + this.typeHealthConnectInfoItem + ", typeSystemWidgetRefreshEventItem=" + this.typeSystemWidgetRefreshEventItem + ", typeSystemWidgetDisplayedEventItem=" + this.typeSystemWidgetDisplayedEventItem + ", typeSystemWidgetAddEventItem=" + this.typeSystemWidgetAddEventItem + ", typeSystemWidgetRemoveEventItem=" + this.typeSystemWidgetRemoveEventItem + ", typeCastEventItem=" + this.typeCastEventItem + ", typeMessagingContactRecommendationsItem=" + this.typeMessagingContactRecommendationsItem + ", typeMessagingActionItem=" + this.typeMessagingActionItem + ", typeMessagingAudioMessageItem=" + this.typeMessagingAudioMessageItem + ", typeSuperappBirthdayPresentItem=" + this.typeSuperappBirthdayPresentItem + ", typeMiniAppCustomEventItem=" + this.typeMiniAppCustomEventItem + ", typeMarusiaConversationItem=" + this.typeMarusiaConversationItem + ", typeMarusiaReadingItem=" + this.typeMarusiaReadingItem + ", typeMarusiaSettingsItem=" + this.typeMarusiaSettingsItem + ", typeVkConnectQuestionnaire=" + this.typeVkConnectQuestionnaire + ", typeSuperappSnowItem=" + this.typeSuperappSnowItem + ", typeCallerIdEventItem=" + this.typeCallerIdEventItem + ", typeSuperappStatlogItem=" + this.typeSuperappStatlogItem + ", typeOwnerButtonAppRenderItem=" + this.typeOwnerButtonAppRenderItem + ", typeSearchItem=" + this.typeSearchItem + ", typeLocalSearchItem=" + this.typeLocalSearchItem + ", typeSuperappScreenItem=" + this.typeSuperappScreenItem + ", typeSuperappOnboardingActionItem=" + this.typeSuperappOnboardingActionItem + ", typeClipPopularTemplatesBlock=" + this.typeClipPopularTemplatesBlock + ", typeClipsTrendsCatalogItem=" + this.typeClipsTrendsCatalogItem + ", typeClipTemplateItem=" + this.typeClipTemplateItem + ", typeClipPublishItem=" + this.typeClipPublishItem + ", typeClipMusicCatalogItem=" + this.typeClipMusicCatalogItem + ", typeClipCameraItem=" + this.typeClipCameraItem + ", typeClipCoownersItem=" + this.typeClipCoownersItem + ", typeClipEditorItem=" + this.typeClipEditorItem + ", typeClipEditItem=" + this.typeClipEditItem + ", typeClipViewerItem=" + this.typeClipViewerItem + ", typeClipCommentSharingItem=" + this.typeClipCommentSharingItem + ", typeClipScrollAfterBite=" + this.typeClipScrollAfterBite + ", typeClipCommentSortItem=" + this.typeClipCommentSortItem + ", typeClipsStatAdsAction=" + this.typeClipsStatAdsAction + ", typeLiveViewerItem=" + this.typeLiveViewerItem + ", typeAdsBanner=" + this.typeAdsBanner + ", typeMiniAppsAdsRequest=" + this.typeMiniAppsAdsRequest + ", typeMiniAppsAdsNative=" + this.typeMiniAppsAdsNative + ", typeRewardedAdsShowActionItem=" + this.typeRewardedAdsShowActionItem + ", typeCommunityOnboardingAction=" + this.typeCommunityOnboardingAction + ", typeVideoPlayerActionItem=" + this.typeVideoPlayerActionItem + ", typeFeedAdsInsert=" + this.typeFeedAdsInsert + ", typeFeedSdkAdRequest=" + this.typeFeedSdkAdRequest + ", typeFeedAsyncBlockError=" + this.typeFeedAsyncBlockError + ", typeFeedActionButtonItem=" + this.typeFeedActionButtonItem + ", typeFeedDuplicateOwnerPost=" + this.typeFeedDuplicateOwnerPost + ", typePushEventItem=" + this.typePushEventItem + ", typeVideoInAppReviewInitialAppearanceItem=" + this.typeVideoInAppReviewInitialAppearanceItem + ", typeVideoKidsModeChangedEvent=" + this.typeVideoKidsModeChangedEvent + ", typeBookmarksAction=" + this.typeBookmarksAction + ", typeMotivationItem=" + this.typeMotivationItem + ", typeClipsCreationScreenItem=" + this.typeClipsCreationScreenItem + ", typeClipsCreationScreenButtonsItem=" + this.typeClipsCreationScreenButtonsItem + ", typeAudioListeningItem=" + this.typeAudioListeningItem + ", typeAudiobookActItem=" + this.typeAudiobookActItem + ", typeImConversationsBannerItem=" + this.typeImConversationsBannerItem + ", typeImChannelJoinAction=" + this.typeImChannelJoinAction + ", typeMusicSubscriptionItem=" + this.typeMusicSubscriptionItem + ", typeVideoSuggestDownloadsAppearanceItem=" + this.typeVideoSuggestDownloadsAppearanceItem + ", typeExternalDeviceAction=" + this.typeExternalDeviceAction + ", typeScreencastCodeAction=" + this.typeScreencastCodeAction + ", typeVideoDownloadWaitForUserAction=" + this.typeVideoDownloadWaitForUserAction + ", typeVideoDynamicTabsOnboardingItem=" + this.typeVideoDynamicTabsOnboardingItem + ", typeVideoDownloadSkipAction=" + this.typeVideoDownloadSkipAction + ", typeRecomThemesItem=" + this.typeRecomThemesItem + ", typeTabbarItem=" + this.typeTabbarItem + ", typePermissionChange=" + this.typePermissionChange + ", typeSnowballEvents=" + this.typeSnowballEvents + ", typeMtTimespentItem=" + this.typeMtTimespentItem + ", typeSecureLockEntranceItem=" + this.typeSecureLockEntranceItem + ", typeDonutGoal=" + this.typeDonutGoal + ", typeDonutPrivacySettingChangedItem=" + this.typeDonutPrivacySettingChangedItem + ", typeImInvitationCardRejectAction=" + this.typeImInvitationCardRejectAction + ", typeTvKidModeItem=" + this.typeTvKidModeItem + ", typeTvKidModeItemLogout=" + this.typeTvKidModeItemLogout + ", typeFeedPostStartAudio=" + this.typeFeedPostStartAudio + ", typeFeedPostStartPlaylist=" + this.typeFeedPostStartPlaylist + ", typeUniversalBanner=" + this.typeUniversalBanner + ", typeVideoPushSettingsBanner=" + this.typeVideoPushSettingsBanner + ", typeUploadExitConfirmationDialog=" + this.typeUploadExitConfirmationDialog + ", typeVideoToClipUpload=" + this.typeVideoToClipUpload + ", typeVideoUploadAuthorSelect=" + this.typeVideoUploadAuthorSelect + ", typeVideoKidsAgeFilterSelect=" + this.typeVideoKidsAgeFilterSelect + ", typeVideoKidsAgeFilterReset=" + this.typeVideoKidsAgeFilterReset + ", typeMoveYoutubeSubsClickItem=" + this.typeMoveYoutubeSubsClickItem + ", typeSelectCreatorsClickItem=" + this.typeSelectCreatorsClickItem + ", typeSelectCreatorsScreenConfirmClick=" + this.typeSelectCreatorsScreenConfirmClick + ", typeCreatorHideUndoHideClick=" + this.typeCreatorHideUndoHideClick + ", typeFeedPostPlayedUnitOfAudio=" + this.typeFeedPostPlayedUnitOfAudio + ", typeVideoNextVideoStartAction=" + this.typeVideoNextVideoStartAction + ", typeVideoUploadCoverAction=" + this.typeVideoUploadCoverAction + ", typeVideoUploadCoverApplyPhoto=" + this.typeVideoUploadCoverApplyPhoto + ", typeVideoCreateChannelAction=" + this.typeVideoCreateChannelAction + ", typeUxpollsEvent=" + this.typeUxpollsEvent + ", typeVideoAttachObjectToVideo=" + this.typeVideoAttachObjectToVideo + ", typeTvKidProfileItem=" + this.typeTvKidProfileItem + ", typeVideoChildProfileActions=" + this.typeVideoChildProfileActions + ", typeLiveActions=" + this.typeLiveActions + ", typeVideoPlayerChangeMode=" + this.typeVideoPlayerChangeMode + ", typeTopshelfAction=" + this.typeTopshelfAction + ", typeVideoAppleTopShelfClick=" + this.typeVideoAppleTopShelfClick + ", typeVideoScreenLockAction=" + this.typeVideoScreenLockAction + ", typeVideoDiscoveryTabsAction=" + this.typeVideoDiscoveryTabsAction + ", typeVideoSubtitlesAction=" + this.typeVideoSubtitlesAction + ", typeVideoShowSimilarsButtonAction=" + this.typeVideoShowSimilarsButtonAction + ", typeVideoOpenSimilarsAction=" + this.typeVideoOpenSimilarsAction + ", typeSimilarChannelsBlock=" + this.typeSimilarChannelsBlock + ", typeSimilarChannelsCardShow=" + this.typeSimilarChannelsCardShow + ", typeVideoOpenAuthorCabinet=" + this.typeVideoOpenAuthorCabinet + ", typeMarketUpdatedDeliveryBlock=" + this.typeMarketUpdatedDeliveryBlock + ", typeVideoAdTrialAction=" + this.typeVideoAdTrialAction + ", typeShutdownDetectionActionItem=" + this.typeShutdownDetectionActionItem + ", typePinVideoAction=" + this.typePinVideoAction + ", typeSportDirectLinkOpened=" + this.typeSportDirectLinkOpened + ", typeCoreNetworkBadConnectionAction=" + this.typeCoreNetworkBadConnectionAction + ", typeFeedShowMoreShopsButton=" + this.typeFeedShowMoreShopsButton + ", typeOverlayLiveProductCardClose=" + this.typeOverlayLiveProductCardClose + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SchemeStat$TypeAction(Type type, SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem, MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings, SchemeStat$TypeRegistrationItem schemeStat$TypeRegistrationItem, CommonAudioStat$TypeAudioMixOptionsItem commonAudioStat$TypeAudioMixOptionsItem, SchemeStat$TypeOnboardingUsecasesItem schemeStat$TypeOnboardingUsecasesItem, CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem, CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem, CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem, MobileOfficialAppsFeedStat$TypeFeedStopPagination mobileOfficialAppsFeedStat$TypeFeedStopPagination, CommonVideoAdsStat$TypeOverlayAdRequest commonVideoAdsStat$TypeOverlayAdRequest, CommonVideoAdsStat$TypeOverlayAdResponse commonVideoAdsStat$TypeOverlayAdResponse, CommonVideoAdsStat$TypeOverlayAdClose commonVideoAdsStat$TypeOverlayAdClose, CommonVideoAdsStat$TypeOverlayAdMenuAction commonVideoAdsStat$TypeOverlayAdMenuAction, CommonVideoAdsStat$TypeOverlayAdConfigBlocked commonVideoAdsStat$TypeOverlayAdConfigBlocked, CommonVideoAdsStat$TypeOverlayAdImpression commonVideoAdsStat$TypeOverlayAdImpression, MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton, MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop, MobileOfficialAppsFeedStat$TypeFeedFeedRefresh mobileOfficialAppsFeedStat$TypeFeedFeedRefresh, MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto, CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem, MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin, MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin, CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem, CommonAudioStat$TypeAudioAutoItem commonAudioStat$TypeAudioAutoItem, CommonAudioStat$TypeAudioDownloadItem commonAudioStat$TypeAudioDownloadItem, CommonAudioStat$TypeAudioTapCloseCoachmarkItem commonAudioStat$TypeAudioTapCloseCoachmarkItem, CommonAudioStat$TypeAudioCoachmarkItem commonAudioStat$TypeAudioCoachmarkItem, CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem, CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem, CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem, CommonAudioStat$TypeAudioTapTimerEventItem commonAudioStat$TypeAudioTapTimerEventItem, CommonAudioStat$TypeAudioTapStatusEventItem commonAudioStat$TypeAudioTapStatusEventItem, CommonAudioStat$TypeAudioTapSearchEventItem commonAudioStat$TypeAudioTapSearchEventItem, CommonAudioStat$TypeAudioTapUpdCollectionEventItem commonAudioStat$TypeAudioTapUpdCollectionEventItem, CommonAudioStat$TypeAudioTapEventItem commonAudioStat$TypeAudioTapEventItem, CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem, CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem, SchemeStat$TypeVkConnectNavigationItem schemeStat$TypeVkConnectNavigationItem, CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem, SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem, SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem, MobileOfficialAppsStoriesStat$TypeStoryPublishItem mobileOfficialAppsStoriesStat$TypeStoryPublishItem, SchemeStat$TypeMarketingTransitionItem schemeStat$TypeMarketingTransitionItem, MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem, MobileOfficialAppsCallsStat$TypeVoipErrorItem mobileOfficialAppsCallsStat$TypeVoipErrorItem, MobileOfficialAppsCallsStat$TypeVoipImportContactsAction mobileOfficialAppsCallsStat$TypeVoipImportContactsAction, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction, CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem, SchemeStat$TypeVkBridge schemeStat$TypeVkBridge, SchemeStat$TypeUniversalWidget schemeStat$TypeUniversalWidget, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, MobileOfficialAppsMarketStat$TypeAddItemToCart mobileOfficialAppsMarketStat$TypeAddItemToCart, MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem, SchemeStat$TypePushRequestItem schemeStat$TypePushRequestItem, SchemeStat$TypeVkPayCheckoutItem schemeStat$TypeVkPayCheckoutItem, SchemeStat$TypeSakSessionsEventItem schemeStat$TypeSakSessionsEventItem, MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen, MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount, MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem, CommonFeedStat$TypeFeedBlockMiniAppsItem commonFeedStat$TypeFeedBlockMiniAppsItem, MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem, MobileOfficialAppsStoriesStat$TypeStoryViewItem mobileOfficialAppsStoriesStat$TypeStoryViewItem, MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem, MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem, MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem, SchemeStat$TypeEasterEggsItem schemeStat$TypeEasterEggsItem, SchemeStat$TypeVkRunItem schemeStat$TypeVkRunItem, SchemeStat$TypeVkWorkoutItem schemeStat$TypeVkWorkoutItem, MobileOfficialAppsHealthStat$TypeHealthSyncStateItem mobileOfficialAppsHealthStat$TypeHealthSyncStateItem, MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem, MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem, MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem, SchemeStat$TypeCastEventItem schemeStat$TypeCastEventItem, SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem, SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem, SchemeStat$TypeMessagingAudioMessageItem schemeStat$TypeMessagingAudioMessageItem, SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem, SchemeStat$TypeMiniAppCustomEventItem schemeStat$TypeMiniAppCustomEventItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem, MobileOfficialAppsMarusiaStat$TypeSettingsItem mobileOfficialAppsMarusiaStat$TypeSettingsItem, SchemeStat$TypeVkConnectQuestionnaire schemeStat$TypeVkConnectQuestionnaire, SchemeStat$TypeSuperappSnowItem schemeStat$TypeSuperappSnowItem, SchemeStat$TypeCallerIdEventItem schemeStat$TypeCallerIdEventItem, SchemeStat$TypeSuperappStatlogItem schemeStat$TypeSuperappStatlogItem, SchemeStat$TypeOwnerButtonAppRenderItem schemeStat$TypeOwnerButtonAppRenderItem, CommonSearchStat$TypeSearchItem commonSearchStat$TypeSearchItem, CommonSearchStat$TypeLocalSearchItem commonSearchStat$TypeLocalSearchItem, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem, MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock, MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem, MobileOfficialAppsClipsStat$TypeClipTemplateItem mobileOfficialAppsClipsStat$TypeClipTemplateItem, MobileOfficialAppsClipsStat$TypeClipPublishItem mobileOfficialAppsClipsStat$TypeClipPublishItem, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem, MobileOfficialAppsClipsStat$TypeClipCameraItem mobileOfficialAppsClipsStat$TypeClipCameraItem, MobileOfficialAppsClipsStat$TypeClipCoownersItem mobileOfficialAppsClipsStat$TypeClipCoownersItem, MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem, MobileOfficialAppsClipsStat$TypeClipEditItem mobileOfficialAppsClipsStat$TypeClipEditItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, MobileOfficialAppsClipsStat$TypeClipCommentSharingItem mobileOfficialAppsClipsStat$TypeClipCommentSharingItem, MobileOfficialAppsClipsStat$TypeClipScrollAfterBite mobileOfficialAppsClipsStat$TypeClipScrollAfterBite, MobileOfficialAppsClipsStat$TypeClipCommentSortItem mobileOfficialAppsClipsStat$TypeClipCommentSortItem, MobileOfficialAppsClipsStat$TypeClipsStatAdsAction mobileOfficialAppsClipsStat$TypeClipsStatAdsAction, MobileOfficialAppsClipsStat$TypeLiveViewerItem mobileOfficialAppsClipsStat$TypeLiveViewerItem, MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner, MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest, MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative, MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem, CommonCommunitiesStat$TypeCommunityOnboardingAction commonCommunitiesStat$TypeCommunityOnboardingAction, CommonVideoStat$TypeVideoPlayerActionItem commonVideoStat$TypeVideoPlayerActionItem, MobileOfficialAppsFeedStat$TypeFeedAdsInsert mobileOfficialAppsFeedStat$TypeFeedAdsInsert, MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest, MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError, CommonFeedStat$TypeFeedActionButtonItem commonFeedStat$TypeFeedActionButtonItem, MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost, MobileOfficialAppsCorePushesStat$TypePushEventItem mobileOfficialAppsCorePushesStat$TypePushEventItem, MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem, MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent, CommonBookmarksStat$TypeBookmarksAction commonBookmarksStat$TypeBookmarksAction, MobileOfficialAppsClipsStat$TypeMotivationItem mobileOfficialAppsClipsStat$TypeMotivationItem, MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem, MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem, CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem, CommonAudioStat$TypeAudiobookActItem commonAudioStat$TypeAudiobookActItem, MobileOfficialAppsImStat$TypeImConversationsBannerItem mobileOfficialAppsImStat$TypeImConversationsBannerItem, MobileOfficialAppsImStat$TypeImChannelJoinAction mobileOfficialAppsImStat$TypeImChannelJoinAction, CommonAudioStat$TypeMusicSubscriptionItem commonAudioStat$TypeMusicSubscriptionItem, q0 q0Var, MobileOfficialAppsVideoStat$TypeExternalDeviceAction mobileOfficialAppsVideoStat$TypeExternalDeviceAction, MobileOfficialAppsVideoStat$TypeScreencastCodeAction mobileOfficialAppsVideoStat$TypeScreencastCodeAction, MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction, MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem, MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction, CommonOnboardingRecomThemesStat$TypeRecomThemesItem commonOnboardingRecomThemesStat$TypeRecomThemesItem, MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem, MobileOfficialAppsCorePermissionStat$TypePermissionChange mobileOfficialAppsCorePermissionStat$TypePermissionChange, SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents, SchemeStat$TypeMtTimespentItem schemeStat$TypeMtTimespentItem, MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem, CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal, CommonCommunitiesStat$TypeDonutPrivacySettingChanged commonCommunitiesStat$TypeDonutPrivacySettingChanged, MobileOfficialAppsImStat$TypeImInvitationCardRejectAction mobileOfficialAppsImStat$TypeImInvitationCardRejectAction, MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem, MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout, MobileOfficialAppsFeedStat$TypeFeedPostStartAudio mobileOfficialAppsFeedStat$TypeFeedPostStartAudio, MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist, CommonVideoStat$TypeUniversalBanner commonVideoStat$TypeUniversalBanner, CommonVideoStat$TypeVideoPushSettingsBanner commonVideoStat$TypeVideoPushSettingsBanner, MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog, MobileOfficialAppsVideoStat$TypeVideoToClipUpload mobileOfficialAppsVideoStat$TypeVideoToClipUpload, MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect, MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect, MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem, j0 j0Var, MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick, MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick, MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio, CommonVideoStat$TypeVideoNextVideoStartAction commonVideoStat$TypeVideoNextVideoStartAction, MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction, MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto, CommonVideoStat$TypeVideoCreateChannelAction commonVideoStat$TypeVideoCreateChannelAction, CommonUxpollsStat$TypeUxpollsEvent commonUxpollsStat$TypeUxpollsEvent, MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo, MobileOfficialAppsVideoStat$TypeTvKidProfileItem mobileOfficialAppsVideoStat$TypeTvKidProfileItem, MobileOfficialAppsVideoStat$TypeVideoChildProfileActions mobileOfficialAppsVideoStat$TypeVideoChildProfileActions, CommonVideoStat$TypeLiveActionsItem commonVideoStat$TypeLiveActionsItem, MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode, MobileOfficialAppsVideoStat$TypeTopshelfAction mobileOfficialAppsVideoStat$TypeTopshelfAction, MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick, MobileOfficialAppsVideoStat$TypeVideoScreenLockAction mobileOfficialAppsVideoStat$TypeVideoScreenLockAction, MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction, MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction, MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction, MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction, CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock commonVideoOtherChannelsStat$TypeSimilarChannelsBlock, CommonVideoOtherChannelsStat$TypeSimilarChannelsCardShow commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow, CommonVideoStat$TypeVideoOpenAuthorCabinet commonVideoStat$TypeVideoOpenAuthorCabinet, CommonMarketStat$TypeMarketDeliveryBlockUpdatedItem commonMarketStat$TypeMarketDeliveryBlockUpdatedItem, MobileOfficialAppsVideoStat$TypeVideoAdTrialAction mobileOfficialAppsVideoStat$TypeVideoAdTrialAction, MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem, MobileOfficialAppsVideoStat$TypePinVideoAction mobileOfficialAppsVideoStat$TypePinVideoAction, MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened, CommonCoreNetworkStat$NetworkBadConnectionAction commonCoreNetworkStat$NetworkBadConnectionAction, MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this(type, r150, r8, r9, r10, r11, r12, r13, r14, r15, r7, r151, r152, r153, r6, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r154, r39, r40, r41, r42, r43, r44, r45, r155, r156, r157, r158, r159, r160, r161, r162, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r163, r164, r165, r166, r167, r168, r169, r170, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r171, r172, r173, r174, r175, r176, r177, r0, (i4 & 32768) != 0 ? null : mobileOfficialAppsAdsStat$TypeAdsBanner, (i4 & 65536) != 0 ? null : mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest, (i4 & 131072) != 0 ? null : mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem, (i4 & 524288) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingAction, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : commonVideoStat$TypeVideoPlayerActionItem, (i4 & 2097152) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedAdsInsert, (i4 & 4194304) != 0 ? null : mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest, (i4 & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonFeedStat$TypeFeedActionButtonItem, (i4 & 33554432) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost, (i4 & 67108864) != 0 ? null : mobileOfficialAppsCorePushesStat$TypePushEventItem, (i4 & 134217728) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem, (i4 & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonBookmarksStat$TypeBookmarksAction, (i4 & 1073741824) != 0 ? null : mobileOfficialAppsClipsStat$TypeMotivationItem, (i4 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem, (i5 & 1) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem, (i5 & 2) != 0 ? null : commonAudioStat$TypeAudioListeningItem, (i5 & 4) != 0 ? null : commonAudioStat$TypeAudiobookActItem, (i5 & 8) != 0 ? null : mobileOfficialAppsImStat$TypeImConversationsBannerItem, (i5 & 16) != 0 ? null : mobileOfficialAppsImStat$TypeImChannelJoinAction, (i5 & 32) != 0 ? null : commonAudioStat$TypeMusicSubscriptionItem, (i5 & 64) != 0 ? null : q0Var, (i5 & 128) != 0 ? null : mobileOfficialAppsVideoStat$TypeExternalDeviceAction, (i5 & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreencastCodeAction, (i5 & 512) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction, (i5 & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem, (i5 & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction, (i5 & 4096) != 0 ? null : commonOnboardingRecomThemesStat$TypeRecomThemesItem, (i5 & 8192) != 0 ? null : mobileOfficialAppsTabbarStat$TypeTabbarItem, (i5 & 16384) != 0 ? null : mobileOfficialAppsCorePermissionStat$TypePermissionChange, (i5 & 32768) != 0 ? null : schemeStat$TypeSnowballEvents, (i5 & 65536) != 0 ? null : schemeStat$TypeMtTimespentItem, (i5 & 131072) != 0 ? null : mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonCommunitiesStat$TypeDonutGoal, (i5 & 524288) != 0 ? null : commonCommunitiesStat$TypeDonutPrivacySettingChanged, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsImStat$TypeImInvitationCardRejectAction, (i5 & 2097152) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvKidModeItem, (i5 & 4194304) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout, (i5 & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostStartAudio, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist, (i5 & 33554432) != 0 ? null : commonVideoStat$TypeUniversalBanner, (i5 & 67108864) != 0 ? null : commonVideoStat$TypeVideoPushSettingsBanner, (i5 & 134217728) != 0 ? null : mobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog, (i5 & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoToClipUpload, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect, (i5 & 1073741824) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect, (i5 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset, (i6 & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem, (i6 & 2) != 0 ? null : j0Var, (i6 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick, (i6 & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick, (i6 & 16) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio, (i6 & 32) != 0 ? null : commonVideoStat$TypeVideoNextVideoStartAction, (i6 & 64) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadCoverAction, (i6 & 128) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto, (i6 & 256) != 0 ? null : commonVideoStat$TypeVideoCreateChannelAction, (i6 & 512) != 0 ? null : commonUxpollsStat$TypeUxpollsEvent, (i6 & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo, (i6 & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvKidProfileItem, (i6 & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoChildProfileActions, (i6 & 8192) != 0 ? null : commonVideoStat$TypeLiveActionsItem, (i6 & 16384) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode, (i6 & 32768) != 0 ? null : mobileOfficialAppsVideoStat$TypeTopshelfAction, (i6 & 65536) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick, (i6 & 131072) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoScreenLockAction, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction, (i6 & 524288) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction, (i6 & 2097152) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction, (i6 & 4194304) != 0 ? null : commonVideoOtherChannelsStat$TypeSimilarChannelsBlock, (i6 & 8388608) != 0 ? null : commonVideoOtherChannelsStat$TypeSimilarChannelsCardShow, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonVideoStat$TypeVideoOpenAuthorCabinet, (i6 & 33554432) != 0 ? null : commonMarketStat$TypeMarketDeliveryBlockUpdatedItem, (i6 & 67108864) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdTrialAction, (i6 & 134217728) != 0 ? null : mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem, (i6 & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypePinVideoAction, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened, (i6 & 1073741824) != 0 ? null : commonCoreNetworkStat$NetworkBadConnectionAction, (i6 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton, (i7 & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose);
        SchemeStat$EventItem schemeStat$EventItem2 = (i & 2) != 0 ? null : schemeStat$EventItem;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = (i & 4) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen;
        CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem2 = (i & 8) != 0 ? null : commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem;
        MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings2 = (i & 16) != 0 ? null : mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings;
        SchemeStat$TypeRegistrationItem schemeStat$TypeRegistrationItem2 = (i & 32) != 0 ? null : schemeStat$TypeRegistrationItem;
        CommonAudioStat$TypeAudioMixOptionsItem commonAudioStat$TypeAudioMixOptionsItem2 = (i & 64) != 0 ? null : commonAudioStat$TypeAudioMixOptionsItem;
        SchemeStat$TypeOnboardingUsecasesItem schemeStat$TypeOnboardingUsecasesItem2 = (i & 128) != 0 ? null : schemeStat$TypeOnboardingUsecasesItem;
        CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem2 = (i & 256) != 0 ? null : commonAudioStat$TypeAudioLongtapItem;
        CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem2 = (i & 512) != 0 ? null : commonAudioStat$TypeAudioSnippetItem;
        CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem2 = (i & 1024) != 0 ? null : commonAudioStat$TypeRadioStationItem;
        SchemeStat$EventItem schemeStat$EventItem3 = schemeStat$EventItem2;
        MobileOfficialAppsFeedStat$TypeFeedStopPagination mobileOfficialAppsFeedStat$TypeFeedStopPagination2 = (i & 2048) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedStopPagination;
        CommonVideoAdsStat$TypeOverlayAdRequest commonVideoAdsStat$TypeOverlayAdRequest2 = (i & 4096) != 0 ? null : commonVideoAdsStat$TypeOverlayAdRequest;
        CommonVideoAdsStat$TypeOverlayAdResponse commonVideoAdsStat$TypeOverlayAdResponse2 = (i & 8192) != 0 ? null : commonVideoAdsStat$TypeOverlayAdResponse;
        CommonVideoAdsStat$TypeOverlayAdClose commonVideoAdsStat$TypeOverlayAdClose2 = (i & 16384) != 0 ? null : commonVideoAdsStat$TypeOverlayAdClose;
        CommonVideoAdsStat$TypeOverlayAdMenuAction commonVideoAdsStat$TypeOverlayAdMenuAction2 = (i & 32768) != 0 ? null : commonVideoAdsStat$TypeOverlayAdMenuAction;
        CommonVideoAdsStat$TypeOverlayAdConfigBlocked commonVideoAdsStat$TypeOverlayAdConfigBlocked2 = (i & 65536) != 0 ? null : commonVideoAdsStat$TypeOverlayAdConfigBlocked;
        CommonVideoAdsStat$TypeOverlayAdImpression commonVideoAdsStat$TypeOverlayAdImpression2 = (i & 131072) != 0 ? null : commonVideoAdsStat$TypeOverlayAdImpression;
        MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton;
        MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop2 = (i & 524288) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop;
        MobileOfficialAppsFeedStat$TypeFeedFeedRefresh mobileOfficialAppsFeedStat$TypeFeedFeedRefresh2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedFeedRefresh;
        MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto2 = (i & 2097152) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedZoomPhoto;
        CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem2 = (i & 4194304) != 0 ? null : commonAudioStat$TypeAudioDislikeItem;
        MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin2 = (i & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowProductPin;
        MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin;
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem2 = (i & 33554432) != 0 ? null : commonAudioStat$TypeAudioOnboardingItem;
        CommonAudioStat$TypeAudioAutoItem commonAudioStat$TypeAudioAutoItem2 = (i & 67108864) != 0 ? null : commonAudioStat$TypeAudioAutoItem;
        CommonAudioStat$TypeAudioDownloadItem commonAudioStat$TypeAudioDownloadItem2 = (i & 134217728) != 0 ? null : commonAudioStat$TypeAudioDownloadItem;
        CommonAudioStat$TypeAudioTapCloseCoachmarkItem commonAudioStat$TypeAudioTapCloseCoachmarkItem2 = (i & 268435456) != 0 ? null : commonAudioStat$TypeAudioTapCloseCoachmarkItem;
        CommonAudioStat$TypeAudioCoachmarkItem commonAudioStat$TypeAudioCoachmarkItem2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonAudioStat$TypeAudioCoachmarkItem;
        CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem2 = (i & 1073741824) != 0 ? null : commonAudioStat$TypeAudioTapPlayEventItem;
        CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem2 = (i & Integer.MIN_VALUE) != 0 ? null : commonAudioStat$TypeAudioTapShowEventItem;
        CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem2 = (i2 & 1) != 0 ? null : commonAudioStat$TypeAudioTapStopEventItem;
        CommonAudioStat$TypeAudioTapTimerEventItem commonAudioStat$TypeAudioTapTimerEventItem2 = (i2 & 2) != 0 ? null : commonAudioStat$TypeAudioTapTimerEventItem;
        CommonAudioStat$TypeAudioTapStatusEventItem commonAudioStat$TypeAudioTapStatusEventItem2 = (i2 & 4) != 0 ? null : commonAudioStat$TypeAudioTapStatusEventItem;
        CommonAudioStat$TypeAudioTapSearchEventItem commonAudioStat$TypeAudioTapSearchEventItem2 = (i2 & 8) != 0 ? null : commonAudioStat$TypeAudioTapSearchEventItem;
        CommonAudioStat$TypeAudioTapUpdCollectionEventItem commonAudioStat$TypeAudioTapUpdCollectionEventItem2 = (i2 & 16) != 0 ? null : commonAudioStat$TypeAudioTapUpdCollectionEventItem;
        CommonAudioStat$TypeAudioTapEventItem commonAudioStat$TypeAudioTapEventItem2 = (i2 & 32) != 0 ? null : commonAudioStat$TypeAudioTapEventItem;
        CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem2 = (i2 & 64) != 0 ? null : commonAudioStat$TypeAudioTapEqualizerEventItem;
        CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem3 = commonAudioStat$TypeAudioTapShowEventItem2;
        CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem2 = (i2 & 128) != 0 ? null : commonAudioStat$TypeAudioTapPopupEventItem;
        SchemeStat$TypeVkConnectNavigationItem schemeStat$TypeVkConnectNavigationItem2 = (i2 & 256) != 0 ? null : schemeStat$TypeVkConnectNavigationItem;
        CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem2 = (i2 & 512) != 0 ? null : commonAudioStat$TypeAudioLyricsItem;
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem2 = (i2 & 1024) != 0 ? null : schemeStat$TypeAudioOfflineItem;
        SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem2 = (i2 & 2048) != 0 ? null : schemeStat$TypeWishlistItem;
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem mobileOfficialAppsStoriesStat$TypeStoryPublishItem2 = (i2 & 4096) != 0 ? null : mobileOfficialAppsStoriesStat$TypeStoryPublishItem;
        SchemeStat$TypeMarketingTransitionItem schemeStat$TypeMarketingTransitionItem2 = (i2 & 8192) != 0 ? null : schemeStat$TypeMarketingTransitionItem;
        MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem2 = (i2 & 16384) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipCallItem;
        MobileOfficialAppsCallsStat$TypeVoipErrorItem mobileOfficialAppsCallsStat$TypeVoipErrorItem2 = (i2 & 32768) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipErrorItem;
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction mobileOfficialAppsCallsStat$TypeVoipImportContactsAction2 = (i2 & 65536) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipImportContactsAction;
        MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction2 = (i2 & 131072) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
        CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonOnboardingStat$TypeUiHintItem;
        SchemeStat$TypeVkBridge schemeStat$TypeVkBridge2 = (i2 & 524288) != 0 ? null : schemeStat$TypeVkBridge;
        SchemeStat$TypeUniversalWidget schemeStat$TypeUniversalWidget2 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : schemeStat$TypeUniversalWidget;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem2 = (i2 & 2097152) != 0 ? null : schemeStat$TypeMarketItem;
        MobileOfficialAppsMarketStat$TypeAddItemToCart mobileOfficialAppsMarketStat$TypeAddItemToCart2 = (i2 & 4194304) != 0 ? null : mobileOfficialAppsMarketStat$TypeAddItemToCart;
        MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem2 = (i2 & 8388608) != 0 ? null : mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem;
        SchemeStat$TypePushRequestItem schemeStat$TypePushRequestItem2 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : schemeStat$TypePushRequestItem;
        SchemeStat$TypeVkPayCheckoutItem schemeStat$TypeVkPayCheckoutItem2 = (i2 & 33554432) != 0 ? null : schemeStat$TypeVkPayCheckoutItem;
        SchemeStat$TypeSakSessionsEventItem schemeStat$TypeSakSessionsEventItem2 = (i2 & 67108864) != 0 ? null : schemeStat$TypeSakSessionsEventItem;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen2 = (i2 & 134217728) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount2 = (i2 & 268435456) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem2 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem;
        CommonFeedStat$TypeFeedBlockMiniAppsItem commonFeedStat$TypeFeedBlockMiniAppsItem2 = (i2 & 1073741824) != 0 ? null : commonFeedStat$TypeFeedBlockMiniAppsItem;
        MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem2 = (i2 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem mobileOfficialAppsStoriesStat$TypeStoryViewItem2 = (i3 & 1) != 0 ? null : mobileOfficialAppsStoriesStat$TypeStoryViewItem;
        MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem2 = (i3 & 2) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem;
        MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem2 = (i3 & 4) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem;
        MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem2 = (i3 & 8) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem;
        SchemeStat$TypeEasterEggsItem schemeStat$TypeEasterEggsItem2 = (i3 & 16) != 0 ? null : schemeStat$TypeEasterEggsItem;
        SchemeStat$TypeVkRunItem schemeStat$TypeVkRunItem2 = (i3 & 32) != 0 ? null : schemeStat$TypeVkRunItem;
        SchemeStat$TypeVkWorkoutItem schemeStat$TypeVkWorkoutItem2 = (i3 & 64) != 0 ? null : schemeStat$TypeVkWorkoutItem;
        MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem3 = mobileOfficialAppsCallsStat$TypeVoipCallItem2;
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem mobileOfficialAppsHealthStat$TypeHealthSyncStateItem2 = (i3 & 128) != 0 ? null : mobileOfficialAppsHealthStat$TypeHealthSyncStateItem;
        MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem2 = (i3 & 256) != 0 ? null : mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem;
        MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem2 = (i3 & 512) != 0 ? null : mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem2 = (i3 & 1024) != 0 ? null : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem2 = (i3 & 2048) != 0 ? null : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem2 = (i3 & 4096) != 0 ? null : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem2 = (i3 & 8192) != 0 ? null : mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem;
        SchemeStat$TypeCastEventItem schemeStat$TypeCastEventItem2 = (i3 & 16384) != 0 ? null : schemeStat$TypeCastEventItem;
        SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem2 = (i3 & 32768) != 0 ? null : schemeStat$TypeMessagingContactRecommendationsItem;
        SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem2 = (i3 & 65536) != 0 ? null : schemeStat$TypeMessagingActionItem;
        SchemeStat$TypeMessagingAudioMessageItem schemeStat$TypeMessagingAudioMessageItem2 = (i3 & 131072) != 0 ? null : schemeStat$TypeMessagingAudioMessageItem;
        SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem2 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : schemeStat$TypeSuperappBirthdayPresentItem;
        SchemeStat$TypeMiniAppCustomEventItem schemeStat$TypeMiniAppCustomEventItem2 = (i3 & 524288) != 0 ? null : schemeStat$TypeMiniAppCustomEventItem;
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeConversationItem;
        MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem2 = (i3 & 2097152) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeReadingItem;
        MobileOfficialAppsMarusiaStat$TypeSettingsItem mobileOfficialAppsMarusiaStat$TypeSettingsItem2 = (i3 & 4194304) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeSettingsItem;
        SchemeStat$TypeVkConnectQuestionnaire schemeStat$TypeVkConnectQuestionnaire2 = (i3 & 8388608) != 0 ? null : schemeStat$TypeVkConnectQuestionnaire;
        SchemeStat$TypeSuperappSnowItem schemeStat$TypeSuperappSnowItem2 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : schemeStat$TypeSuperappSnowItem;
        SchemeStat$TypeCallerIdEventItem schemeStat$TypeCallerIdEventItem2 = (i3 & 33554432) != 0 ? null : schemeStat$TypeCallerIdEventItem;
        SchemeStat$TypeSuperappStatlogItem schemeStat$TypeSuperappStatlogItem2 = (i3 & 67108864) != 0 ? null : schemeStat$TypeSuperappStatlogItem;
        SchemeStat$TypeOwnerButtonAppRenderItem schemeStat$TypeOwnerButtonAppRenderItem2 = (i3 & 134217728) != 0 ? null : schemeStat$TypeOwnerButtonAppRenderItem;
        CommonSearchStat$TypeSearchItem commonSearchStat$TypeSearchItem2 = (i3 & 268435456) != 0 ? null : commonSearchStat$TypeSearchItem;
        CommonSearchStat$TypeLocalSearchItem commonSearchStat$TypeLocalSearchItem2 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonSearchStat$TypeLocalSearchItem;
        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem2 = (i3 & 1073741824) != 0 ? null : schemeStat$TypeSuperappScreenItem;
        MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem2 = (i3 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem;
        MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock2 = (i4 & 1) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock;
        MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem2 = (i4 & 2) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem;
        MobileOfficialAppsClipsStat$TypeClipTemplateItem mobileOfficialAppsClipsStat$TypeClipTemplateItem2 = (i4 & 4) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipTemplateItem;
        MobileOfficialAppsClipsStat$TypeClipPublishItem mobileOfficialAppsClipsStat$TypeClipPublishItem2 = (i4 & 8) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipPublishItem;
        MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem2 = (i4 & 16) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem;
        MobileOfficialAppsClipsStat$TypeClipCameraItem mobileOfficialAppsClipsStat$TypeClipCameraItem2 = (i4 & 32) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipCameraItem;
        MobileOfficialAppsClipsStat$TypeClipCoownersItem mobileOfficialAppsClipsStat$TypeClipCoownersItem2 = (i4 & 64) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipCoownersItem;
        SchemeStat$TypeCastEventItem schemeStat$TypeCastEventItem3 = schemeStat$TypeCastEventItem2;
        MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem2 = (i4 & 128) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipEditorItem;
        MobileOfficialAppsClipsStat$TypeClipEditItem mobileOfficialAppsClipsStat$TypeClipEditItem2 = (i4 & 256) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipEditItem;
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem2 = (i4 & 512) != 0 ? null : schemeStat$TypeClipViewerItem;
        MobileOfficialAppsClipsStat$TypeClipCommentSharingItem mobileOfficialAppsClipsStat$TypeClipCommentSharingItem2 = (i4 & 1024) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipCommentSharingItem;
        MobileOfficialAppsClipsStat$TypeClipScrollAfterBite mobileOfficialAppsClipsStat$TypeClipScrollAfterBite2 = (i4 & 2048) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipScrollAfterBite;
        MobileOfficialAppsClipsStat$TypeClipCommentSortItem mobileOfficialAppsClipsStat$TypeClipCommentSortItem2 = (i4 & 4096) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipCommentSortItem;
        MobileOfficialAppsClipsStat$TypeClipsStatAdsAction mobileOfficialAppsClipsStat$TypeClipsStatAdsAction2 = (i4 & 8192) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsStatAdsAction;
        MobileOfficialAppsClipsStat$TypeLiveViewerItem mobileOfficialAppsClipsStat$TypeLiveViewerItem2 = (i4 & 16384) != 0 ? null : mobileOfficialAppsClipsStat$TypeLiveViewerItem;
    }
}
