package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioMusicAwardsDto;
import com.vk.api.generated.base.dto.BaseAPlusMarkDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseObjectDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.channels.dto.ChannelsChannelTypeDto;
import com.vk.api.generated.groups.dto.GroupsActionButtonDto;
import com.vk.api.generated.groups.dto.GroupsAddressesInfoDto;
import com.vk.api.generated.groups.dto.GroupsAdsEasyPromoteDto;
import com.vk.api.generated.groups.dto.GroupsAdsPostsInfoDto;
import com.vk.api.generated.groups.dto.GroupsAppButtonDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import com.vk.api.generated.groups.dto.GroupsChannelBlockDto;
import com.vk.api.generated.groups.dto.GroupsChannelInfoDto;
import com.vk.api.generated.groups.dto.GroupsChatsStatusDto;
import com.vk.api.generated.groups.dto.GroupsContactsItemDto;
import com.vk.api.generated.groups.dto.GroupsContentSectionsDataDto;
import com.vk.api.generated.groups.dto.GroupsCountersGroupDto;
import com.vk.api.generated.groups.dto.GroupsDonutCommunityManagementDto;
import com.vk.api.generated.groups.dto.GroupsEventOrganizerDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupBanInfoDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutBlockDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutPaymentInfoDto;
import com.vk.api.generated.groups.dto.GroupsGroupExtendedMarketSectionsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeLimitsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeMarkDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMembersPreviewDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullSectionDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullShowSuggestionsDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupLikeItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupNameHistoryDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.groups.dto.GroupsGroupVkTicketDto;
import com.vk.api.generated.groups.dto.GroupsLinksItemDto;
import com.vk.api.generated.groups.dto.GroupsLiveCoversDto;
import com.vk.api.generated.groups.dto.GroupsLoginConfirmationStatusDto;
import com.vk.api.generated.groups.dto.GroupsMarketInfoDto;
import com.vk.api.generated.groups.dto.GroupsMarketServicesInfoDto;
import com.vk.api.generated.groups.dto.GroupsMarketShopConditionsStateDto;
import com.vk.api.generated.groups.dto.GroupsMenuDto;
import com.vk.api.generated.groups.dto.GroupsMicrolandingDto;
import com.vk.api.generated.groups.dto.GroupsOnlineStatusDto;
import com.vk.api.generated.groups.dto.GroupsPhotoSizeDto;
import com.vk.api.generated.groups.dto.GroupsPrimaryBlockSettingsDto;
import com.vk.api.generated.groups.dto.GroupsRecommendedTipsWidgetDto;
import com.vk.api.generated.groups.dto.GroupsSimpleButtonDto;
import com.vk.api.generated.groups.dto.GroupsStrikesInfoDto;
import com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto;
import com.vk.api.generated.groups.dto.GroupsTabSettingsDto;
import com.vk.api.generated.groups.dto.GroupsTariffsDto;
import com.vk.api.generated.groups.dto.GroupsVideoChannelDataDto;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.api.generated.groups.dto.GroupsVkAdminStatusDto;
import com.vk.api.generated.groups.dto.GroupsWarningNotificationDto;
import com.vk.api.generated.groups.dto.GroupsWorkGroupInfoDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingDto;
import com.vk.api.generated.market.dto.MarketCommunityServiceRatingDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRepeatRecordDto;
import com.vk.api.generated.video.dto.VideoLiveInfoDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SearchGroupExtendedDto.kt */
/* loaded from: classes15.dex */
public final class SearchGroupExtendedDto implements Parcelable {
    public static final Parcelable.Creator<SearchGroupExtendedDto> CREATOR = new a();

    @pmi0("a_plus_mark")
    private final BaseAPlusMarkDto aPlusMark;

    @pmi0("action_button")
    private final GroupsActionButtonDto actionButton;

    @pmi0("activity")
    private final String activity;

    @pmi0("addresses")
    private final GroupsAddressesInfoDto addresses;

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("ads_easy_promote")
    private final GroupsAdsEasyPromoteDto adsEasyPromote;

    @pmi0("ads_easy_promote_allowed")
    private final Boolean adsEasyPromoteAllowed;

    @pmi0("ads_easy_promote_reasons_not_allowed")
    private final Object adsEasyPromoteReasonsNotAllowed;

    @pmi0("ads_market_autopromote_allowed")
    private final Boolean adsMarketAutopromoteAllowed;

    @pmi0("ads_market_autopromote_reasons_not_allowed")
    private final Object adsMarketAutopromoteReasonsNotAllowed;

    @pmi0("ads_market_easy_promote")
    private final Object adsMarketEasyPromote;

    @pmi0("ads_market_services_autopromote_allowed")
    private final Boolean adsMarketServicesAutopromoteAllowed;

    @pmi0("ads_market_services_autopromote_reasons_not_allowed")
    private final Object adsMarketServicesAutopromoteReasonsNotAllowed;

    @pmi0("ads_market_services_easy_promote")
    private final Object adsMarketServicesEasyPromote;

    @pmi0("ads_posting_restricted_today")
    private final Integer adsPostingRestrictedToday;

    @pmi0("ads_posts_info")
    private final GroupsAdsPostsInfoDto adsPostsInfo;

    @pmi0("age_limits")
    private final GroupsGroupFullAgeLimitsDto ageLimits;

    @pmi0("age_mark")
    private final GroupsGroupFullAgeMarkDto ageMark;

    @pmi0("app_button")
    private final GroupsAppButtonDto appButton;

    @pmi0("app_buttons")
    private final List<GroupsAppButtonDto> appButtons;

    @pmi0("audio_artist_id")
    private final String audioArtistId;

    @pmi0("audio_curator_id")
    private final Integer audioCuratorId;

    @pmi0("author_id")
    private final Integer authorId;

    @pmi0("ban_info")
    private final GroupsGroupBanInfoDto banInfo;

    @pmi0("banner_ads_main_client")
    private final GroupsBannerDto bannerAdsMainClient;

    @pmi0("banner_ads_main_mvk")
    private final GroupsBannerDto bannerAdsMainMvk;

    @pmi0("banner_ads_setting_miniapp")
    private final GroupsBannerDto bannerAdsSettingMiniapp;

    @pmi0("business_community_tooltips")
    private final Boolean businessCommunityTooltips;

    @pmi0("business_rating")
    private final Float businessRating;

    @pmi0("buttons")
    private final List<BaseOwnerButtonDto> buttons;

    @pmi0("can_call_to_community")
    private final Boolean canCallToCommunity;

    @pmi0("can_create_event")
    private final Boolean canCreateEvent;

    @pmi0("can_create_topic")
    private final BaseBoolIntDto canCreateTopic;

    @pmi0("can_edit_screen_name")
    private final Boolean canEditScreenName;

    @pmi0("can_manage")
    private final Boolean canManage;

    @pmi0("can_message")
    private final BaseBoolIntDto canMessage;

    @pmi0("can_post")
    private final BaseBoolIntDto canPost;

    @pmi0("can_post_donut")
    private final Integer canPostDonut;

    @pmi0("can_report")
    private final BaseBoolIntDto canReport;

    @pmi0("can_see_all_posts")
    private final BaseBoolIntDto canSeeAllPosts;

    @pmi0("can_see_invite_links")
    private final Boolean canSeeInviteLinks;

    @pmi0("can_see_members")
    private final Boolean canSeeMembers;

    @pmi0("can_send_notify")
    private final BaseBoolIntDto canSendNotify;

    @pmi0("can_subscribe_podcasts")
    private final Boolean canSubscribePodcasts;

    @pmi0("can_subscribe_posts")
    private final Boolean canSubscribePosts;

    @pmi0("can_subscribe_stories")
    private final Boolean canSubscribeStories;

    @pmi0("can_suggest")
    private final BaseBoolIntDto canSuggest;

    @pmi0("can_upload_clip")
    private final BaseBoolIntDto canUploadClip;

    @pmi0("can_upload_doc")
    private final BaseBoolIntDto canUploadDoc;

    @pmi0("can_upload_story")
    private final BaseBoolIntDto canUploadStory;

    @pmi0("can_upload_video")
    private final BaseBoolIntDto canUploadVideo;

    @pmi0("can_upload_video_thumb")
    private final BaseBoolIntDto canUploadVideoThumb;

    @pmi0("can_view_post_reach_stats")
    private final Boolean canViewPostReachStats;

    @pmi0("can_view_stats")
    private final Boolean canViewStats;

    @pmi0("category")
    private final Integer category;

    @pmi0("category0")
    private final Integer category0;

    @pmi0("category1")
    private final Integer category1;

    @pmi0("category1_name")
    private final String category1Name;

    @pmi0("category2")
    private final Integer category2;

    @pmi0("category_v2")
    private final Integer categoryV2;

    @pmi0("channel_block")
    private final GroupsChannelBlockDto channelBlock;

    @pmi0("channel_button")
    private final GroupsSimpleButtonDto channelButton;

    @pmi0("channel_info")
    private final GroupsChannelInfoDto channelInfo;

    @pmi0("channel_type")
    private final ChannelsChannelTypeDto channelType;

    @pmi0("chats_status")
    private final GroupsChatsStatusDto chatsStatus;

    @pmi0("city")
    private final BaseObjectDto city;

    @pmi0("classifieds_antibaraholka_design_version")
    private final Integer classifiedsAntibaraholkaDesignVersion;

    @pmi0("clips_count")
    private final Integer clipsCount;

    @pmi0("co_ownership_enabled")
    private final Boolean coOwnershipEnabled;

    @pmi0("community_channel_id")
    private final Integer communityChannelId;

    @pmi0("contacts")
    private final List<GroupsContactsItemDto> contacts;

    @pmi0("content_sections_data")
    private final GroupsContentSectionsDataDto contentSectionsData;

    @pmi0("counters")
    private final GroupsCountersGroupDto counters;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("cover")
    private final BaseOwnerCoverDto cover;

    @pmi0("create_date")
    private final Integer createDate;

    @pmi0("crop_photo")
    private final BaseCropPhotoDto cropPhoto;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("deactivated_message")
    private final String deactivatedMessage;

    @pmi0("deactivated_type")
    private final DeactivatedTypeDto deactivatedType;

    @pmi0("description")
    private final String description;

    @pmi0("disallow_manage_reason")
    private final DisallowManageReasonDto disallowManageReason;

    @pmi0("disallow_manage_reason_message")
    private final String disallowManageReasonMessage;

    @pmi0("donut")
    private final GroupsGroupDonutDto donut;

    @pmi0("donut_block")
    private final GroupsGroupDonutBlockDto donutBlock;

    @pmi0("donut_community_management")
    private final GroupsDonutCommunityManagementDto donutCommunityManagement;

    @pmi0("donut_payment_info")
    private final GroupsGroupDonutPaymentInfoDto donutPaymentInfo;

    @pmi0("enabled_features")
    private final List<String> enabledFeatures;

    @pmi0("est_date")
    private final String estDate;

    @pmi0("event_organizer")
    private final GroupsEventOrganizerDto eventOrganizer;

    @pmi0("extended_market")
    private final GroupsGroupExtendedMarketSectionsDto extendedMarket;

    @pmi0("finish_date")
    private final Integer finishDate;

    @pmi0("fixed_post")
    private final Integer fixedPost;

    @pmi0("friends")
    private final GroupsGroupFriendsDto friends;

    @pmi0("group_channel")
    private final Object groupChannel;

    @pmi0("had_torch")
    private final Boolean hadTorch;

    @pmi0("has_group_channel")
    private final Boolean hasGroupChannel;

    @pmi0("has_live_cover")
    private final Boolean hasLiveCover;

    @pmi0("has_market_app")
    private final Boolean hasMarketApp;

    @pmi0("has_photo")
    private final BaseBoolIntDto hasPhoto;

    @pmi0("has_stories")
    private final Boolean hasStories;

    @pmi0("has_suggestions")
    private final BaseBoolIntDto hasSuggestions;

    @pmi0("has_unseen_stories")
    private final Boolean hasUnseenStories;

    @pmi0("id")
    private final UserId id;

    @pmi0("inn")
    private final String inn;

    @pmi0("installed_apps_count")
    private final Integer installedAppsCount;

    @pmi0("invited_by")
    private final Integer invitedBy;

    @pmi0("is_admin")
    private final BaseBoolIntDto isAdmin;

    @pmi0("is_adult")
    private final BaseBoolIntDto isAdult;

    @pmi0("is_advertiser")
    private final BaseBoolIntDto isAdvertiser;

    @pmi0("is_aue")
    private final Boolean isAue;

    @pmi0("is_binding_to_yclients_service_enabled")
    private final Boolean isBindingToYclientsServiceEnabled;

    @pmi0("is_business")
    private final String isBusiness;

    @pmi0("is_business_category")
    private final Boolean isBusinessCategory;

    @pmi0("is_cached")
    private final Boolean isCached;

    @pmi0("is_closed")
    private final GroupsGroupIsClosedDto isClosed;

    @pmi0("is_confirmed_business")
    private final Boolean isConfirmedBusiness;

    @pmi0("is_educational")
    private final Boolean isEducational;

    @pmi0("is_favorite")
    private final BaseBoolIntDto isFavorite;

    @pmi0("is_golden_marked_business")
    private final Boolean isGoldenMarkedBusiness;

    @pmi0("is_government_organization")
    private final Boolean isGovernmentOrganization;

    @pmi0("is_group_displayed")
    private final Boolean isGroupDisplayed;

    @pmi0("is_hidden_from_feed")
    private final BaseBoolIntDto isHiddenFromFeed;

    @pmi0("is_manual_marked_business")
    private final Boolean isManualMarkedBusiness;

    @pmi0("is_market_cart_enabled")
    private final Boolean isMarketCartEnabled;

    @pmi0("is_market_enabled")
    private final Boolean isMarketEnabled;

    @pmi0("is_market_market_link_attachment_enabled")
    private final Boolean isMarketMarketLinkAttachmentEnabled;

    @pmi0("is_market_message_to_bc_attachment_enabled")
    private final Boolean isMarketMessageToBcAttachmentEnabled;

    @pmi0("is_market_online_booking_action_button_enabled")
    private final Boolean isMarketOnlineBookingActionButtonEnabled;

    @pmi0("is_market_online_booking_setting_enabled")
    private final Boolean isMarketOnlineBookingSettingEnabled;

    @pmi0("is_media_wall_enabled")
    private final Boolean isMediaWallEnabled;

    @pmi0("is_member")
    private final BaseBoolIntDto isMember;

    @pmi0("is_messages_blocked")
    private final BaseBoolIntDto isMessagesBlocked;

    @pmi0("is_monetization_available")
    private final Boolean isMonetizationAvailable;

    @pmi0("is_nft_photo")
    private final Boolean isNftPhoto;

    @pmi0("is_set_tab_order")
    private final Boolean isSetTabOrder;

    @pmi0("is_show_business_onboarding")
    private final Boolean isShowBusinessOnboarding;

    @pmi0("is_site_displayed")
    private final Boolean isSiteDisplayed;

    @pmi0("is_subscribed")
    private final BaseBoolIntDto isSubscribed;

    @pmi0("is_subscribed_podcasts")
    private final Boolean isSubscribedPodcasts;

    @pmi0("is_subscribed_stories")
    private final Boolean isSubscribedStories;

    @pmi0("is_tags_available")
    private final Boolean isTagsAvailable;

    @pmi0("is_video_live_notifications_blocked")
    private final BaseBoolIntDto isVideoLiveNotificationsBlocked;

    @pmi0("is_video_subscription_hidden")
    private final Boolean isVideoSubscriptionHidden;

    @pmi0("is_widget_messages_enabled")
    private final Boolean isWidgetMessagesEnabled;

    @pmi0("is_work_group")
    private final Boolean isWorkGroup;

    @pmi0("is_yclients_tooltip_active")
    private final Boolean isYclientsTooltipActive;

    @pmi0("is_youla_posting_to_wall_allowed")
    private final Boolean isYoulaPostingToWallAllowed;

    @pmi0("kpp")
    private final String kpp;

    @pmi0("leave_mode")
    private final LeaveModeDto leaveMode;

    @pmi0("like")
    private final GroupsGroupLikeItemDto like;

    @pmi0("links")
    private final List<GroupsLinksItemDto> links;

    @pmi0("live_covers")
    private final GroupsLiveCoversDto liveCovers;

    @pmi0("login_confirmation_status")
    private final GroupsLoginConfirmationStatusDto loginConfirmationStatus;

    @pmi0("main_album_id")
    private final Integer mainAlbumId;

    @pmi0("main_section")
    private final GroupsGroupFullSectionDto mainSection;

    @pmi0("market")
    private final GroupsMarketInfoDto market;

    @pmi0("market_services")
    private final GroupsMarketServicesInfoDto marketServices;

    @pmi0("market_shop_conditions_state")
    private final GroupsMarketShopConditionsStateDto marketShopConditionsState;

    @pmi0("member_status")
    private final GroupsGroupFullMemberStatusDto memberStatus;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("members_count_text")
    private final String membersCountText;

    @pmi0("members_preview")
    private final GroupsGroupFullMembersPreviewDto membersPreview;

    @pmi0("menu")
    private final GroupsMenuDto menu;

    @pmi0("messages")
    private final Boolean messages;

    @pmi0("microlanding")
    private final GroupsMicrolandingDto microlanding;

    @pmi0("msg_notifications_allowed")
    private final BaseBoolIntDto msgNotificationsAllowed;

    @pmi0("msg_push_allowed")
    private final BaseBoolIntDto msgPushAllowed;

    @pmi0("music_awards")
    private final AudioMusicAwardsDto musicAwards;

    @pmi0("name")
    private final String name;

    @pmi0("name_history")
    private final GroupsGroupNameHistoryDto nameHistory;

    @pmi0("ogrn")
    private final String ogrn;

    @pmi0("online_status")
    private final GroupsOnlineStatusDto onlineStatus;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_200_orig")
    private final String photo200Orig;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_400_orig")
    private final String photo400Orig;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_avg_color")
    private final String photoAvgColor;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("photo_max_orig")
    private final String photoMaxOrig;

    @pmi0("photo_max_size")
    private final GroupsPhotoSizeDto photoMaxSize;

    @pmi0("primary_block")
    private final GroupsPrimaryBlockSettingsDto primaryBlock;

    @pmi0("prohibited_content_adult_mark")
    private final Boolean prohibitedContentAdultMark;

    @pmi0("public_category")
    private final Integer publicCategory;

    @pmi0("public_date_label")
    private final String publicDateLabel;

    @pmi0("public_subcategory")
    private final Integer publicSubcategory;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final MarketCommunityRatingDto rating;

    @pmi0("recommended_tips_widget")
    private final GroupsRecommendedTipsWidgetDto recommendedTipsWidget;

    @pmi0(TtmlNode.TAG_REGION)
    private final String region;

    @pmi0("reposts_disabled")
    private final Boolean repostsDisabled;

    @pmi0("requests_count")
    private final Integer requestsCount;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("service_rating")
    private final MarketCommunityServiceRatingDto serviceRating;

    @pmi0("settings_tooltips_active")
    private final Boolean settingsTooltipsActive;

    @pmi0("show_suggestions")
    private final GroupsGroupFullShowSuggestionsDto showSuggestions;

    @pmi0("site")
    private final String site;

    @pmi0("start_date")
    private final Integer startDate;

    @pmi0("status")
    private final String status;

    @pmi0("status_audio")
    private final AudioAudioDto statusAudio;

    @pmi0("stories_archive_count")
    private final Integer storiesArchiveCount;

    @pmi0("strikes_info")
    private final GroupsStrikesInfoDto strikesInfo;

    @pmi0("strikes_restrictions")
    private final GroupsStrikesRestrictionsDto strikesRestrictions;

    @pmi0("subject")
    private final String subject;

    @pmi0("subject_id")
    private final Integer subjectId;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    @pmi0("suggested_category_name")
    private final String suggestedCategoryName;

    @pmi0("tabs")
    private final List<GroupsTabSettingsDto> tabs;

    @pmi0("targ_artist_id")
    private final String targArtistId;

    @pmi0("tariffs")
    private final GroupsTariffsDto tariffs;

    @pmi0("thematic")
    private final String thematic;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("trust_mark")
    private final TrustMarkDto trustMark;

    @pmi0("type")
    private final GroupsGroupTypeDto type;

    @pmi0("unread_count")
    private final Integer unreadCount;

    @pmi0("url")
    private final String url;

    @pmi0("using_vkpay_market_app")
    private final Boolean usingVkpayMarketApp;

    @pmi0("verification_end_time")
    private final Integer verificationEndTime;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    @pmi0("video_channel_data")
    private final GroupsVideoChannelDataDto videoChannelData;

    @pmi0("video_cover")
    private final BaseOwnerCoverDto videoCover;

    @pmi0("video_live")
    private final VideoLiveInfoDto videoLive;

    @pmi0("video_live_count")
    private final Integer videoLiveCount;

    @pmi0("video_live_level")
    private final Integer videoLiveLevel;

    @pmi0("video_lives_data")
    private final GroupsVideoLivesDataDto videoLivesData;

    @pmi0("video_lives_streaming_banned")
    private final Boolean videoLivesStreamingBanned;

    @pmi0("video_notifications_status")
    private final VideoNotificationsStatusDto videoNotificationsStatus;

    @pmi0("videos_count")
    private final Integer videosCount;

    @pmi0("vk_admin_status")
    private final GroupsVkAdminStatusDto vkAdminStatus;

    @pmi0("vk_ticket")
    private final GroupsGroupVkTicketDto vkTicket;

    @pmi0("vkpay_can_transfer")
    private final Boolean vkpayCanTransfer;

    @pmi0("vkpay_receiver_id")
    private final Integer vkpayReceiverId;

    @pmi0("wall")
    private final WallDto wall;

    @pmi0("warning_notification")
    private final GroupsWarningNotificationDto warningNotification;

    @pmi0("wiki_page")
    private final String wikiPage;

    @pmi0("work_group_info")
    private final GroupsWorkGroupInfoDto workGroupInfo;

    @pmi0("yclients_repeat_records")
    private final List<ServiceBookingRepeatRecordDto> yclientsRepeatRecords;

    @pmi0("youla_posting_method")
    private final YoulaPostingMethodDto youlaPostingMethod;

    @pmi0("youla_status")
    private final YoulaStatusDto youlaStatus;

    @pmi0("youla_use_wallpost_redirect")
    private final Boolean youlaUseWallpostRedirect;

    @pmi0("youla_wallpost_redirect_miniapp_url")
    private final String youlaWallpostRedirectMiniappUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class DeactivatedTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DeactivatedTypeDto[] $VALUES;

        @pmi0("banned")
        public static final DeactivatedTypeDto BANNED;
        public static final Parcelable.Creator<DeactivatedTypeDto> CREATOR;

        @pmi0("geo_blocked")
        public static final DeactivatedTypeDto GEO_BLOCKED;
        private final String value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<DeactivatedTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final DeactivatedTypeDto createFromParcel(Parcel parcel) {
                return DeactivatedTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeactivatedTypeDto[] newArray(int i) {
                return new DeactivatedTypeDto[i];
            }
        }

        static {
            DeactivatedTypeDto deactivatedTypeDto = new DeactivatedTypeDto("BANNED", 0, "banned");
            BANNED = deactivatedTypeDto;
            DeactivatedTypeDto deactivatedTypeDto2 = new DeactivatedTypeDto("GEO_BLOCKED", 1, "geo_blocked");
            GEO_BLOCKED = deactivatedTypeDto2;
            DeactivatedTypeDto[] deactivatedTypeDtoArr = {deactivatedTypeDto, deactivatedTypeDto2};
            $VALUES = deactivatedTypeDtoArr;
            $ENTRIES = new asp(deactivatedTypeDtoArr);
            CREATOR = new a();
        }

        private DeactivatedTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DeactivatedTypeDto valueOf(String str) {
            return (DeactivatedTypeDto) Enum.valueOf(DeactivatedTypeDto.class, str);
        }

        public static DeactivatedTypeDto[] values() {
            return (DeactivatedTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class DisallowManageReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisallowManageReasonDto[] $VALUES;

        @pmi0("2")
        public static final DisallowManageReasonDto AWAITING_PERIOD;
        public static final Parcelable.Creator<DisallowManageReasonDto> CREATOR;

        @pmi0("1")
        public static final DisallowManageReasonDto NO_2FA;
        private final int value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<DisallowManageReasonDto> {
            @Override // android.os.Parcelable.Creator
            public final DisallowManageReasonDto createFromParcel(Parcel parcel) {
                return DisallowManageReasonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DisallowManageReasonDto[] newArray(int i) {
                return new DisallowManageReasonDto[i];
            }
        }

        static {
            DisallowManageReasonDto disallowManageReasonDto = new DisallowManageReasonDto("NO_2FA", 0, 1);
            NO_2FA = disallowManageReasonDto;
            DisallowManageReasonDto disallowManageReasonDto2 = new DisallowManageReasonDto("AWAITING_PERIOD", 1, 2);
            AWAITING_PERIOD = disallowManageReasonDto2;
            DisallowManageReasonDto[] disallowManageReasonDtoArr = {disallowManageReasonDto, disallowManageReasonDto2};
            $VALUES = disallowManageReasonDtoArr;
            $ENTRIES = new asp(disallowManageReasonDtoArr);
            CREATOR = new a();
        }

        private DisallowManageReasonDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static DisallowManageReasonDto valueOf(String str) {
            return (DisallowManageReasonDto) Enum.valueOf(DisallowManageReasonDto.class, str);
        }

        public static DisallowManageReasonDto[] values() {
            return (DisallowManageReasonDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class LeaveModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LeaveModeDto[] $VALUES;

        @pmi0("admin_leave_alert")
        public static final LeaveModeDto ADMIN_LEAVE_ALERT;

        @pmi0("admin_leave_options")
        public static final LeaveModeDto ADMIN_LEAVE_OPTIONS;
        public static final Parcelable.Creator<LeaveModeDto> CREATOR;
        private final String value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<LeaveModeDto> {
            @Override // android.os.Parcelable.Creator
            public final LeaveModeDto createFromParcel(Parcel parcel) {
                return LeaveModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LeaveModeDto[] newArray(int i) {
                return new LeaveModeDto[i];
            }
        }

        static {
            LeaveModeDto leaveModeDto = new LeaveModeDto("ADMIN_LEAVE_ALERT", 0, "admin_leave_alert");
            ADMIN_LEAVE_ALERT = leaveModeDto;
            LeaveModeDto leaveModeDto2 = new LeaveModeDto("ADMIN_LEAVE_OPTIONS", 1, "admin_leave_options");
            ADMIN_LEAVE_OPTIONS = leaveModeDto2;
            LeaveModeDto[] leaveModeDtoArr = {leaveModeDto, leaveModeDto2};
            $VALUES = leaveModeDtoArr;
            $ENTRIES = new asp(leaveModeDtoArr);
            CREATOR = new a();
        }

        private LeaveModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LeaveModeDto valueOf(String str) {
            return (LeaveModeDto) Enum.valueOf(LeaveModeDto.class, str);
        }

        public static LeaveModeDto[] values() {
            return (LeaveModeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class TrustMarkDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TrustMarkDto[] $VALUES;

        @pmi0("3")
        public static final TrustMarkDto CONFIRMED;
        public static final Parcelable.Creator<TrustMarkDto> CREATOR;

        @pmi0("4")
        public static final TrustMarkDto IS_NCO_ORGANIZATION;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TrustMarkDto NCO_ORGANIZATION_AND_OTHERS;

        @pmi0("0")
        public static final TrustMarkDto NOT_FOUND;

        @pmi0("2")
        public static final TrustMarkDto PREMIUM;

        @pmi0("1")
        public static final TrustMarkDto VERIFIED;
        private final int value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<TrustMarkDto> {
            @Override // android.os.Parcelable.Creator
            public final TrustMarkDto createFromParcel(Parcel parcel) {
                return TrustMarkDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrustMarkDto[] newArray(int i) {
                return new TrustMarkDto[i];
            }
        }

        static {
            TrustMarkDto trustMarkDto = new TrustMarkDto("NOT_FOUND", 0, 0);
            NOT_FOUND = trustMarkDto;
            TrustMarkDto trustMarkDto2 = new TrustMarkDto("VERIFIED", 1, 1);
            VERIFIED = trustMarkDto2;
            TrustMarkDto trustMarkDto3 = new TrustMarkDto("PREMIUM", 2, 2);
            PREMIUM = trustMarkDto3;
            TrustMarkDto trustMarkDto4 = new TrustMarkDto("CONFIRMED", 3, 3);
            CONFIRMED = trustMarkDto4;
            TrustMarkDto trustMarkDto5 = new TrustMarkDto("IS_NCO_ORGANIZATION", 4, 4);
            IS_NCO_ORGANIZATION = trustMarkDto5;
            TrustMarkDto trustMarkDto6 = new TrustMarkDto("NCO_ORGANIZATION_AND_OTHERS", 5, 5);
            NCO_ORGANIZATION_AND_OTHERS = trustMarkDto6;
            TrustMarkDto[] trustMarkDtoArr = {trustMarkDto, trustMarkDto2, trustMarkDto3, trustMarkDto4, trustMarkDto5, trustMarkDto6};
            $VALUES = trustMarkDtoArr;
            $ENTRIES = new asp(trustMarkDtoArr);
            CREATOR = new a();
        }

        private TrustMarkDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TrustMarkDto valueOf(String str) {
            return (TrustMarkDto) Enum.valueOf(TrustMarkDto.class, str);
        }

        public static TrustMarkDto[] values() {
            return (TrustMarkDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class VideoNotificationsStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoNotificationsStatusDto[] $VALUES;

        @pmi0("all")
        public static final VideoNotificationsStatusDto ALL;
        public static final Parcelable.Creator<VideoNotificationsStatusDto> CREATOR;

        @pmi0("none")
        public static final VideoNotificationsStatusDto NONE;

        @pmi0("preferred")
        public static final VideoNotificationsStatusDto PREFERRED;
        private final String value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<VideoNotificationsStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final VideoNotificationsStatusDto createFromParcel(Parcel parcel) {
                return VideoNotificationsStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoNotificationsStatusDto[] newArray(int i) {
                return new VideoNotificationsStatusDto[i];
            }
        }

        static {
            VideoNotificationsStatusDto videoNotificationsStatusDto = new VideoNotificationsStatusDto("NONE", 0, "none");
            NONE = videoNotificationsStatusDto;
            VideoNotificationsStatusDto videoNotificationsStatusDto2 = new VideoNotificationsStatusDto("ALL", 1, "all");
            ALL = videoNotificationsStatusDto2;
            VideoNotificationsStatusDto videoNotificationsStatusDto3 = new VideoNotificationsStatusDto("PREFERRED", 2, "preferred");
            PREFERRED = videoNotificationsStatusDto3;
            VideoNotificationsStatusDto[] videoNotificationsStatusDtoArr = {videoNotificationsStatusDto, videoNotificationsStatusDto2, videoNotificationsStatusDto3};
            $VALUES = videoNotificationsStatusDtoArr;
            $ENTRIES = new asp(videoNotificationsStatusDtoArr);
            CREATOR = new a();
        }

        private VideoNotificationsStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static VideoNotificationsStatusDto valueOf(String str) {
            return (VideoNotificationsStatusDto) Enum.valueOf(VideoNotificationsStatusDto.class, str);
        }

        public static VideoNotificationsStatusDto[] values() {
            return (VideoNotificationsStatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class WallDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDto[] $VALUES;
        public static final Parcelable.Creator<WallDto> CREATOR;

        @pmi0("0")
        public static final WallDto DISABLED;

        @pmi0("2")
        public static final WallDto LIMITED;

        @pmi0("1")
        public static final WallDto OPEN;

        @pmi0("3")
        public static final WallDto RESTRICTED;
        private final int value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<WallDto> {
            @Override // android.os.Parcelable.Creator
            public final WallDto createFromParcel(Parcel parcel) {
                return WallDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WallDto[] newArray(int i) {
                return new WallDto[i];
            }
        }

        static {
            WallDto wallDto = new WallDto("DISABLED", 0, 0);
            DISABLED = wallDto;
            WallDto wallDto2 = new WallDto("OPEN", 1, 1);
            OPEN = wallDto2;
            WallDto wallDto3 = new WallDto("LIMITED", 2, 2);
            LIMITED = wallDto3;
            WallDto wallDto4 = new WallDto("RESTRICTED", 3, 3);
            RESTRICTED = wallDto4;
            WallDto[] wallDtoArr = {wallDto, wallDto2, wallDto3, wallDto4};
            $VALUES = wallDtoArr;
            $ENTRIES = new asp(wallDtoArr);
            CREATOR = new a();
        }

        private WallDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static WallDto valueOf(String str) {
            return (WallDto) Enum.valueOf(WallDto.class, str);
        }

        public static WallDto[] values() {
            return (WallDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class YoulaPostingMethodDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ YoulaPostingMethodDto[] $VALUES;
        public static final Parcelable.Creator<YoulaPostingMethodDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final YoulaPostingMethodDto DEFAULT;

        @pmi0("form")
        public static final YoulaPostingMethodDto FORM;

        @pmi0("post")
        public static final YoulaPostingMethodDto POST;

        @pmi0("redirect_to_miniapp")
        public static final YoulaPostingMethodDto REDIRECT_TO_MINIAPP;
        private final String value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<YoulaPostingMethodDto> {
            @Override // android.os.Parcelable.Creator
            public final YoulaPostingMethodDto createFromParcel(Parcel parcel) {
                return YoulaPostingMethodDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final YoulaPostingMethodDto[] newArray(int i) {
                return new YoulaPostingMethodDto[i];
            }
        }

        static {
            YoulaPostingMethodDto youlaPostingMethodDto = new YoulaPostingMethodDto("POST", 0, "post");
            POST = youlaPostingMethodDto;
            YoulaPostingMethodDto youlaPostingMethodDto2 = new YoulaPostingMethodDto("FORM", 1, "form");
            FORM = youlaPostingMethodDto2;
            YoulaPostingMethodDto youlaPostingMethodDto3 = new YoulaPostingMethodDto("REDIRECT_TO_MINIAPP", 2, "redirect_to_miniapp");
            REDIRECT_TO_MINIAPP = youlaPostingMethodDto3;
            YoulaPostingMethodDto youlaPostingMethodDto4 = new YoulaPostingMethodDto("DEFAULT", 3, BuildConfig.FLAVOR);
            DEFAULT = youlaPostingMethodDto4;
            YoulaPostingMethodDto[] youlaPostingMethodDtoArr = {youlaPostingMethodDto, youlaPostingMethodDto2, youlaPostingMethodDto3, youlaPostingMethodDto4};
            $VALUES = youlaPostingMethodDtoArr;
            $ENTRIES = new asp(youlaPostingMethodDtoArr);
            CREATOR = new a();
        }

        private YoulaPostingMethodDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static YoulaPostingMethodDto valueOf(String str) {
            return (YoulaPostingMethodDto) Enum.valueOf(YoulaPostingMethodDto.class, str);
        }

        public static YoulaPostingMethodDto[] values() {
            return (YoulaPostingMethodDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class YoulaStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ YoulaStatusDto[] $VALUES;

        @pmi0("2")
        public static final YoulaStatusDto BASIC;
        public static final Parcelable.Creator<YoulaStatusDto> CREATOR;

        @pmi0("1")
        public static final YoulaStatusDto EXTENDED;

        @pmi0("0")
        public static final YoulaStatusDto OFF;
        private final int value;

        /* compiled from: SearchGroupExtendedDto.kt */
        public static final class a implements Parcelable.Creator<YoulaStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final YoulaStatusDto createFromParcel(Parcel parcel) {
                return YoulaStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final YoulaStatusDto[] newArray(int i) {
                return new YoulaStatusDto[i];
            }
        }

        static {
            YoulaStatusDto youlaStatusDto = new YoulaStatusDto("OFF", 0, 0);
            OFF = youlaStatusDto;
            YoulaStatusDto youlaStatusDto2 = new YoulaStatusDto("EXTENDED", 1, 1);
            EXTENDED = youlaStatusDto2;
            YoulaStatusDto youlaStatusDto3 = new YoulaStatusDto("BASIC", 2, 2);
            BASIC = youlaStatusDto3;
            YoulaStatusDto[] youlaStatusDtoArr = {youlaStatusDto, youlaStatusDto2, youlaStatusDto3};
            $VALUES = youlaStatusDtoArr;
            $ENTRIES = new asp(youlaStatusDtoArr);
            CREATOR = new a();
        }

        private YoulaStatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static YoulaStatusDto valueOf(String str) {
            return (YoulaStatusDto) Enum.valueOf(YoulaStatusDto.class, str);
        }

        public static YoulaStatusDto[] values() {
            return (YoulaStatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SearchGroupExtendedDto.kt */
    public static final class a implements Parcelable.Creator<SearchGroupExtendedDto> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r104v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r112v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r115v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r124v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r125v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r126v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r127v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r128v4, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r132v4, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r133v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r134v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r135v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r180v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r185v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r202v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r203v1, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r224v2, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r243v3, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        @Override // android.os.Parcelable.Creator
        public final SearchGroupExtendedDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            AudioAudioDto audioAudioDto;
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto;
            ArrayList arrayList;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Float valueOf17;
            Boolean bool;
            Boolean valueOf18;
            Boolean valueOf19;
            Boolean valueOf20;
            String str;
            Object createFromParcel;
            Boolean valueOf21;
            GroupsTariffsDto groupsTariffsDto;
            Object createFromParcel2;
            Boolean valueOf22;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            Boolean valueOf27;
            Boolean valueOf28;
            String str2;
            Object createFromParcel3;
            Boolean valueOf29;
            Boolean valueOf30;
            Boolean valueOf31;
            Boolean valueOf32;
            Boolean valueOf33;
            Boolean valueOf34;
            Boolean valueOf35;
            Boolean valueOf36;
            Boolean bool2;
            Boolean valueOf37;
            GroupsBannerDto groupsBannerDto;
            Object createFromParcel4;
            Boolean valueOf38;
            Boolean valueOf39;
            GroupsBannerDto groupsBannerDto2;
            Object createFromParcel5;
            Boolean valueOf40;
            Boolean valueOf41;
            Boolean bool3;
            Boolean valueOf42;
            Boolean valueOf43;
            Boolean valueOf44;
            Boolean valueOf45;
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto;
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto2;
            ?? arrayList4;
            BaseBoolIntDto baseBoolIntDto2;
            BaseAPlusMarkDto baseAPlusMarkDto;
            List list;
            ?? arrayList5;
            Object obj;
            Boolean valueOf46;
            Boolean valueOf47;
            Boolean valueOf48;
            Boolean valueOf49;
            GroupsAppButtonDto groupsAppButtonDto;
            List list2;
            ?? arrayList6;
            BaseBoolIntDto baseBoolIntDto3;
            Boolean valueOf50;
            Boolean bool4;
            BaseBoolIntDto baseBoolIntDto4;
            List list3;
            List arrayList7;
            VideoLiveInfoDto videoLiveInfoDto;
            Boolean valueOf51;
            Boolean valueOf52;
            Boolean valueOf53;
            Boolean valueOf54;
            Boolean valueOf55;
            Boolean valueOf56;
            Boolean valueOf57;
            Boolean valueOf58;
            Boolean valueOf59;
            Boolean valueOf60;
            GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto;
            Object createFromParcel6;
            Boolean valueOf61;
            Boolean valueOf62;
            YoulaStatusDto youlaStatusDto;
            Object createFromParcel7;
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto3 = (GroupsGroupFullMemberStatusDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseObjectDto baseObjectDto = (BaseObjectDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf65 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf66 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf67 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsCountersGroupDto groupsCountersGroupDto = (GroupsCountersGroupDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto2 = (BaseOwnerCoverDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsVideoLivesDataDto groupsVideoLivesDataDto = (GroupsVideoLivesDataDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer num = valueOf63;
            Integer num2 = valueOf64;
            Integer num3 = valueOf65;
            Integer num4 = valueOf67;
            String readString5 = parcel.readString();
            Integer num5 = valueOf66;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Boolean bool5 = valueOf;
            String readString9 = parcel.readString();
            Integer valueOf68 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            String readString10 = parcel.readString();
            AudioAudioDto audioAudioDto2 = (AudioAudioDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf69 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto2;
                groupsGroupFullMemberStatusDto = groupsGroupFullMemberStatusDto3;
                baseBoolIntDto = baseBoolIntDto5;
                arrayList = null;
            } else {
                audioAudioDto = audioAudioDto2;
                int readInt = parcel.readInt();
                groupsGroupFullMemberStatusDto = groupsGroupFullMemberStatusDto3;
                arrayList = new ArrayList(readInt);
                baseBoolIntDto = baseBoolIntDto5;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SearchGroupExtendedDto.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                arrayList3 = arrayList;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(SearchGroupExtendedDto.class, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                }
            }
            WallDto createFromParcel8 = parcel.readInt() == 0 ? null : WallDto.CREATOR.createFromParcel(parcel);
            Integer num6 = valueOf69;
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList arrayList8 = arrayList2;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto = (GroupsGroupFullSectionDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = (GroupsPrimaryBlockSettingsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsOnlineStatusDto groupsOnlineStatusDto = (GroupsOnlineStatusDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf70 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = (GroupsGroupFullAgeLimitsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = (GroupsGroupFullAgeMarkDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupBanInfoDto groupsGroupBanInfoDto = (GroupsGroupBanInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsActionButtonDto groupsActionButtonDto = (GroupsActionButtonDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf71 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num7 = valueOf68;
            AudioAudioDto audioAudioDto3 = audioAudioDto;
            Boolean bool6 = valueOf4;
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf72 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue = parcel.readValue(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf73 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsAddressesInfoDto groupsAddressesInfoDto = (GroupsAddressesInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsLiveCoversDto groupsLiveCoversDto = (GroupsLiveCoversDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsVkAdminStatusDto groupsVkAdminStatusDto = (GroupsVkAdminStatusDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsMenuDto groupsMenuDto = (GroupsMenuDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsWarningNotificationDto groupsWarningNotificationDto = (GroupsWarningNotificationDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf74 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupDonutDto groupsGroupDonutDto = (GroupsGroupDonutDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupVkTicketDto groupsGroupVkTicketDto = (GroupsGroupVkTicketDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = (GroupsGroupDonutBlockDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = (GroupsDonutCommunityManagementDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto = (GroupsGroupDonutPaymentInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Integer valueOf75 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsChatsStatusDto groupsChatsStatusDto = (GroupsChatsStatusDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf17 = null;
                bool = null;
            } else {
                valueOf17 = Float.valueOf(parcel.readFloat());
                bool = null;
            }
            Boolean bool7 = valueOf2;
            Boolean bool8 = valueOf3;
            ArrayList arrayList9 = arrayList3;
            Integer num8 = valueOf70;
            Boolean bool9 = valueOf9;
            Boolean bool10 = valueOf13;
            Boolean bool11 = valueOf16;
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto4 = groupsGroupFullMemberStatusDto;
            Boolean bool12 = valueOf6;
            Integer num9 = valueOf73;
            Boolean bool13 = valueOf10;
            Boolean bool14 = valueOf14;
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf18 = bool;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf19 = bool;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf20 = bool;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = bool;
            } else {
                str = readString;
                createFromParcel = TrustMarkDto.CREATOR.createFromParcel(parcel);
            }
            TrustMarkDto trustMarkDto = (TrustMarkDto) createFromParcel;
            GroupsMicrolandingDto groupsMicrolandingDto = (GroupsMicrolandingDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsTariffsDto groupsTariffsDto2 = (GroupsTariffsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Object valueOf76 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf21 = bool;
            } else {
                valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsTariffsDto = groupsTariffsDto2;
                createFromParcel2 = bool;
            } else {
                groupsTariffsDto = groupsTariffsDto2;
                createFromParcel2 = DisallowManageReasonDto.CREATOR.createFromParcel(parcel);
            }
            DisallowManageReasonDto disallowManageReasonDto = (DisallowManageReasonDto) createFromParcel2;
            BaseBoolIntDto baseBoolIntDto26 = baseBoolIntDto;
            Integer num10 = valueOf71;
            Integer num11 = valueOf72;
            Integer num12 = valueOf74;
            Boolean bool15 = valueOf18;
            String readString14 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = (GroupsGroupFullShowSuggestionsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf22 = bool;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf23 = bool;
            } else {
                valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object valueOf77 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = (GroupsAdsEasyPromoteDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf24 = bool;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object valueOf78 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf25 = bool;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue2 = parcel.readValue(SearchGroupExtendedDto.class.getClassLoader());
            Object readValue3 = parcel.readValue(SearchGroupExtendedDto.class.getClassLoader());
            Object readValue4 = parcel.readValue(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf26 = bool;
            } else {
                valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue5 = parcel.readValue(SearchGroupExtendedDto.class.getClassLoader());
            Object readValue6 = parcel.readValue(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf27 = bool;
            } else {
                valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object valueOf79 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf80 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf81 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf82 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf83 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            GroupsGroupLikeItemDto groupsGroupLikeItemDto = (GroupsGroupLikeItemDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = (GroupsLoginConfirmationStatusDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf28 = bool;
            } else {
                valueOf28 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object valueOf84 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf85 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf86 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object valueOf87 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            GroupsGroupFriendsDto groupsGroupFriendsDto = (GroupsGroupFriendsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Boolean bool16 = bool;
            ?? r112 = valueOf77;
            Boolean bool17 = valueOf25;
            Boolean bool18 = valueOf26;
            ?? r124 = valueOf79;
            ?? r128 = valueOf83;
            ?? r132 = valueOf84;
            String str3 = str;
            Boolean bool19 = valueOf21;
            ?? r133 = valueOf85;
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                str2 = str3;
                createFromParcel3 = bool16;
            } else {
                str2 = str3;
                createFromParcel3 = DeactivatedTypeDto.CREATOR.createFromParcel(parcel);
            }
            DeactivatedTypeDto deactivatedTypeDto = (DeactivatedTypeDto) createFromParcel3;
            Boolean bool20 = valueOf7;
            Boolean bool21 = valueOf8;
            Boolean bool22 = valueOf12;
            Integer num13 = valueOf75;
            Boolean bool23 = valueOf19;
            GroupsTariffsDto groupsTariffsDto3 = groupsTariffsDto;
            Boolean bool24 = valueOf22;
            Boolean bool25 = valueOf24;
            Boolean bool26 = valueOf27;
            ?? r127 = valueOf82;
            Boolean bool27 = valueOf28;
            ?? r135 = valueOf87;
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf29 = bool16;
            } else {
                valueOf29 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf30 = bool16;
            } else {
                valueOf30 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf31 = bool16;
            } else {
                valueOf31 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketCommunityRatingDto marketCommunityRatingDto = (MarketCommunityRatingDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = (GroupsGroupNameHistoryDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = (MarketCommunityServiceRatingDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = (GroupsRecommendedTipsWidgetDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Boolean bool28 = valueOf23;
            ?? r115 = valueOf78;
            ?? r125 = valueOf80;
            ?? r134 = valueOf86;
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf32 = bool16;
            } else {
                valueOf32 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf33 = bool16;
            } else {
                valueOf33 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf34 = bool16;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf35 = bool16;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf36 = bool16;
                bool2 = valueOf36;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
                bool2 = bool16;
            }
            Boolean bool29 = valueOf30;
            Boolean bool30 = valueOf33;
            String readString19 = parcel.readString();
            GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = (GroupsAdsPostsInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Boolean bool31 = valueOf35;
            String readString20 = parcel.readString();
            GroupsBannerDto groupsBannerDto3 = (GroupsBannerDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsBannerDto groupsBannerDto4 = (GroupsBannerDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf37 = bool2;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsBannerDto = groupsBannerDto4;
                createFromParcel4 = bool2;
            } else {
                groupsBannerDto = groupsBannerDto4;
                createFromParcel4 = LeaveModeDto.CREATOR.createFromParcel(parcel);
            }
            LeaveModeDto leaveModeDto = (LeaveModeDto) createFromParcel4;
            GroupsBannerDto groupsBannerDto5 = (GroupsBannerDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf38 = bool2;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf39 = bool2;
            } else {
                valueOf39 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsBannerDto2 = groupsBannerDto5;
                createFromParcel5 = bool2;
            } else {
                groupsBannerDto2 = groupsBannerDto5;
                createFromParcel5 = VideoNotificationsStatusDto.CREATOR.createFromParcel(parcel);
            }
            VideoNotificationsStatusDto videoNotificationsStatusDto = (VideoNotificationsStatusDto) createFromParcel5;
            if (parcel.readInt() == 0) {
                valueOf40 = bool2;
            } else {
                valueOf40 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf41 = bool2;
                bool3 = valueOf41;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
                bool3 = bool2;
            }
            GroupsBannerDto groupsBannerDto6 = groupsBannerDto;
            String str4 = str2;
            Boolean bool32 = valueOf31;
            Boolean bool33 = valueOf37;
            Boolean bool34 = valueOf39;
            String readString21 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf42 = bool3;
            } else {
                valueOf42 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = (GroupsWorkGroupInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Boolean bool35 = valueOf5;
            Boolean bool36 = valueOf11;
            Boolean bool37 = valueOf15;
            Float f = valueOf17;
            Boolean bool38 = valueOf20;
            ?? r104 = valueOf76;
            ?? r126 = valueOf81;
            Boolean bool39 = valueOf29;
            Boolean bool40 = valueOf32;
            Boolean bool41 = valueOf36;
            Boolean bool42 = valueOf38;
            Boolean bool43 = valueOf41;
            String readString22 = parcel.readString();
            GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = (GroupsGroupFullMembersPreviewDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsStrikesInfoDto groupsStrikesInfoDto = (GroupsStrikesInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto2 = (GroupsStrikesRestrictionsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf43 = bool3;
            } else {
                valueOf43 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool44 = valueOf40;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf44 = bool3;
            } else {
                valueOf44 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf45 = bool3;
            } else {
                valueOf45 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsStrikesRestrictionsDto = groupsStrikesRestrictionsDto2;
                groupsGroupFullMemberStatusDto2 = groupsGroupFullMemberStatusDto4;
                baseBoolIntDto2 = baseBoolIntDto26;
                arrayList4 = bool3;
            } else {
                groupsStrikesRestrictionsDto = groupsStrikesRestrictionsDto2;
                int readInt3 = parcel.readInt();
                groupsGroupFullMemberStatusDto2 = groupsGroupFullMemberStatusDto4;
                arrayList4 = new ArrayList(readInt3);
                baseBoolIntDto2 = baseBoolIntDto26;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(SearchGroupExtendedDto.class, parcel, arrayList4, i3, 1);
                    readInt3 = readInt3;
                }
            }
            Object valueOf88 = parcel.readInt() == 0 ? bool3 : Integer.valueOf(parcel.readInt());
            Object valueOf89 = parcel.readInt() == 0 ? bool3 : Integer.valueOf(parcel.readInt());
            ?? r185 = valueOf88;
            GroupsSimpleButtonDto groupsSimpleButtonDto = (GroupsSimpleButtonDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto2 = (BaseAPlusMarkDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseAPlusMarkDto = baseAPlusMarkDto2;
                list = arrayList4;
                obj = valueOf89;
                arrayList5 = bool3;
            } else {
                baseAPlusMarkDto = baseAPlusMarkDto2;
                int readInt4 = parcel.readInt();
                list = arrayList4;
                arrayList5 = new ArrayList(readInt4);
                obj = valueOf89;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(SearchGroupExtendedDto.class, parcel, arrayList5, i4, 1);
                    readInt4 = readInt4;
                }
            }
            GroupsChannelInfoDto groupsChannelInfoDto = (GroupsChannelInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsChannelBlockDto groupsChannelBlockDto = (GroupsChannelBlockDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf46 = bool3;
            } else {
                valueOf46 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsEventOrganizerDto groupsEventOrganizerDto = (GroupsEventOrganizerDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsVideoChannelDataDto groupsVideoChannelDataDto = (GroupsVideoChannelDataDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf47 = bool3;
            } else {
                valueOf47 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf48 = bool3;
            } else {
                valueOf48 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf49 = bool3;
            } else {
                valueOf49 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsContentSectionsDataDto groupsContentSectionsDataDto = (GroupsContentSectionsDataDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Boolean bool45 = bool3;
            Boolean bool46 = valueOf44;
            ?? r180 = obj;
            Boolean bool47 = valueOf47;
            String readString23 = parcel.readString();
            Boolean bool48 = valueOf34;
            GroupsBannerDto groupsBannerDto7 = groupsBannerDto2;
            Boolean bool49 = valueOf42;
            Boolean bool50 = valueOf45;
            Boolean bool51 = valueOf46;
            Boolean bool52 = valueOf48;
            String readString24 = parcel.readString();
            GroupsGroupIsClosedDto groupsGroupIsClosedDto = (GroupsGroupIsClosedDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupTypeDto groupsGroupTypeDto = (GroupsGroupTypeDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = (GroupsGroupAdminLevelDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto29 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto30 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            Object valueOf90 = parcel.readInt() == 0 ? bool45 : Integer.valueOf(parcel.readInt());
            Object valueOf91 = parcel.readInt() == 0 ? bool45 : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto31 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto32 = baseBoolIntDto2;
            Boolean bool53 = valueOf49;
            String readString25 = parcel.readString();
            ?? r202 = valueOf90;
            String readString26 = parcel.readString();
            ?? r203 = valueOf91;
            String readString27 = parcel.readString();
            Boolean bool54 = valueOf43;
            List list4 = list;
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            String readString34 = parcel.readString();
            String readString35 = parcel.readString();
            String readString36 = parcel.readString();
            GroupsPhotoSizeDto groupsPhotoSizeDto = (GroupsPhotoSizeDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsAppButtonDto groupsAppButtonDto2 = (GroupsAppButtonDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                groupsAppButtonDto = groupsAppButtonDto2;
                list2 = arrayList5;
                baseBoolIntDto3 = baseBoolIntDto32;
                arrayList6 = bool45;
            } else {
                groupsAppButtonDto = groupsAppButtonDto2;
                int readInt5 = parcel.readInt();
                list2 = arrayList5;
                arrayList6 = new ArrayList(readInt5);
                baseBoolIntDto3 = baseBoolIntDto32;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(SearchGroupExtendedDto.class, parcel, arrayList6, i5, 1);
                    readInt5 = readInt5;
                }
            }
            BaseBoolIntDto baseBoolIntDto33 = (BaseBoolIntDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto2 = (VideoLiveInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf50 = bool45;
                bool4 = valueOf50;
            } else {
                valueOf50 = Boolean.valueOf(parcel.readInt() != 0);
                bool4 = bool45;
            }
            GroupsAppButtonDto groupsAppButtonDto3 = groupsAppButtonDto;
            String readString37 = parcel.readString();
            Object valueOf92 = parcel.readInt() == 0 ? bool4 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto4 = baseBoolIntDto33;
                list3 = arrayList6;
                videoLiveInfoDto = videoLiveInfoDto2;
                arrayList7 = bool4;
            } else {
                baseBoolIntDto4 = baseBoolIntDto33;
                int readInt6 = parcel.readInt();
                list3 = arrayList6;
                arrayList7 = new ArrayList(readInt6);
                videoLiveInfoDto = videoLiveInfoDto2;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(SearchGroupExtendedDto.class, parcel, arrayList7, i6, 1);
                    readInt6 = readInt6;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf51 = bool4;
            } else {
                valueOf51 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf52 = bool4;
            } else {
                valueOf52 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsMarketInfoDto groupsMarketInfoDto = (GroupsMarketInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = (GroupsMarketServicesInfoDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf53 = bool4;
            } else {
                valueOf53 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf54 = bool4;
            } else {
                valueOf54 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf55 = bool4;
            } else {
                valueOf55 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto2 = (GroupsGroupExtendedMarketSectionsDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto = (GroupsMarketShopConditionsStateDto) parcel.readParcelable(SearchGroupExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf56 = bool4;
            } else {
                valueOf56 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf57 = bool4;
            } else {
                valueOf57 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf58 = bool4;
            } else {
                valueOf58 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf59 = bool4;
            } else {
                valueOf59 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf60 = bool4;
            } else {
                valueOf60 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsGroupExtendedMarketSectionsDto = groupsGroupExtendedMarketSectionsDto2;
                createFromParcel6 = bool4;
            } else {
                groupsGroupExtendedMarketSectionsDto = groupsGroupExtendedMarketSectionsDto2;
                createFromParcel6 = YoulaStatusDto.CREATOR.createFromParcel(parcel);
            }
            YoulaStatusDto youlaStatusDto2 = (YoulaStatusDto) createFromParcel6;
            if (parcel.readInt() == 0) {
                valueOf61 = bool4;
            } else {
                valueOf61 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool55 = valueOf55;
            Boolean bool56 = valueOf57;
            Boolean bool57 = valueOf60;
            String readString38 = parcel.readString();
            Object valueOf93 = parcel.readInt() == 0 ? bool4 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf62 = bool4;
            } else {
                valueOf62 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                createFromParcel7 = bool4;
                youlaStatusDto = youlaStatusDto2;
            } else {
                youlaStatusDto = youlaStatusDto2;
                createFromParcel7 = YoulaPostingMethodDto.CREATOR.createFromParcel(parcel);
            }
            return new SearchGroupExtendedDto(str4, userId, groupsGroupFullMemberStatusDto2, baseBoolIntDto3, baseBoolIntDto6, baseBoolIntDto7, baseBoolIntDto8, baseObjectDto, baseCountryDto, readString2, readString3, num, readString4, num2, audioMusicAwardsDto, num3, num5, num4, groupsCountersGroupDto, baseOwnerCoverDto, baseOwnerCoverDto2, groupsVideoLivesDataDto, readString5, readString6, readString7, readString8, bool5, bool7, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, bool8, baseBoolIntDto12, baseBoolIntDto13, baseBoolIntDto14, baseBoolIntDto15, baseBoolIntDto16, baseBoolIntDto17, readString9, num7, baseBoolIntDto18, baseCropPhotoDto, readString10, audioAudioDto3, num6, arrayList9, arrayList8, createFromParcel8, readString11, bool6, groupsGroupFullSectionDto, groupsPrimaryBlockSettingsDto, baseBoolIntDto19, baseBoolIntDto20, baseBoolIntDto21, baseBoolIntDto22, groupsOnlineStatusDto, num8, groupsGroupFullAgeLimitsDto, groupsGroupFullAgeMarkDto, groupsGroupBanInfoDto, groupsActionButtonDto, num10, readString12, bool35, bool12, num11, bool20, readValue, num9, groupsAddressesInfoDto, bool21, bool9, bool13, bool36, bool22, bool10, bool14, bool37, groupsLiveCoversDto, groupsVkAdminStatusDto, groupsMenuDto, groupsWarningNotificationDto, num12, groupsGroupDonutDto, groupsGroupVkTicketDto, groupsGroupDonutBlockDto, groupsDonutCommunityManagementDto, groupsGroupDonutPaymentInfoDto, num13, bool11, baseBoolIntDto23, baseBoolIntDto24, groupsChatsStatusDto, baseBoolIntDto25, f, readString13, bool15, bool23, bool38, trustMarkDto, groupsMicrolandingDto, groupsTariffsDto3, r104, bool19, disallowManageReasonDto, readString14, baseBoolIntDto27, groupsGroupFullShowSuggestionsDto, bool24, bool28, r112, groupsAdsEasyPromoteDto, bool25, r115, bool17, readValue2, readValue3, readValue4, bool18, readValue5, readValue6, bool26, r124, r125, r126, r127, r128, groupsGroupLikeItemDto, groupsLoginConfirmationStatusDto, bool27, r132, r133, r134, r135, groupsGroupFriendsDto, readString15, deactivatedTypeDto, readString16, bool39, bool29, bool32, marketCommunityRatingDto, groupsGroupNameHistoryDto, marketCommunityServiceRatingDto, groupsRecommendedTipsWidgetDto, readString17, readString18, bool40, bool30, bool48, bool31, bool41, readString19, groupsAdsPostsInfoDto, readString20, groupsBannerDto3, groupsBannerDto6, bool33, leaveModeDto, groupsBannerDto7, bool42, bool34, videoNotificationsStatusDto, bool44, bool43, readString21, bool49, groupsWorkGroupInfoDto, readString22, groupsGroupFullMembersPreviewDto, groupsStrikesInfoDto, groupsStrikesRestrictionsDto, bool54, createStringArrayList, bool46, bool50, list4, r185, r180, groupsSimpleButtonDto, baseAPlusMarkDto, list2, groupsChannelInfoDto, groupsChannelBlockDto, bool51, groupsEventOrganizerDto, groupsVideoChannelDataDto, bool47, bool52, bool53, groupsContentSectionsDataDto, readString23, readString24, groupsGroupIsClosedDto, groupsGroupTypeDto, channelsChannelTypeDto, baseBoolIntDto28, groupsGroupAdminLevelDto, baseBoolIntDto29, baseBoolIntDto30, r202, r203, baseBoolIntDto31, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, groupsPhotoSizeDto, groupsAppButtonDto3, list3, baseBoolIntDto4, videoLiveInfoDto, valueOf50, readString37, valueOf92, arrayList7, valueOf51, valueOf52, groupsMarketInfoDto, groupsMarketServicesInfoDto, valueOf53, valueOf54, bool55, groupsGroupExtendedMarketSectionsDto, groupsMarketShopConditionsStateDto, valueOf56, bool56, valueOf58, valueOf59, bool57, youlaStatusDto, valueOf61, readString38, valueOf93, valueOf62, (YoulaPostingMethodDto) createFromParcel7);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchGroupExtendedDto[] newArray(int i) {
            return new SearchGroupExtendedDto[i];
        }
    }

    public SearchGroupExtendedDto(String str, UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str2, String str3, Integer num, String str4, Integer num2, AudioMusicAwardsDto audioMusicAwardsDto, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseOwnerCoverDto baseOwnerCoverDto2, GroupsVideoLivesDataDto groupsVideoLivesDataDto, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool3, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str9, Integer num6, BaseBoolIntDto baseBoolIntDto14, BaseCropPhotoDto baseCropPhotoDto, String str10, AudioAudioDto audioAudioDto, Integer num7, List<GroupsLinksItemDto> list, List<GroupsContactsItemDto> list2, WallDto wallDto, String str11, Boolean bool4, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, GroupsActionButtonDto groupsActionButtonDto, Integer num9, String str12, Boolean bool5, Boolean bool6, Integer num10, Boolean bool7, Object obj, Integer num11, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, GroupsLiveCoversDto groupsLiveCoversDto, GroupsVkAdminStatusDto groupsVkAdminStatusDto, GroupsMenuDto groupsMenuDto, GroupsWarningNotificationDto groupsWarningNotificationDto, Integer num12, GroupsGroupDonutDto groupsGroupDonutDto, GroupsGroupVkTicketDto groupsGroupVkTicketDto, GroupsGroupDonutBlockDto groupsGroupDonutBlockDto, GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto, GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto, Integer num13, Boolean bool16, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, GroupsChatsStatusDto groupsChatsStatusDto, BaseBoolIntDto baseBoolIntDto21, Float f, String str13, Boolean bool17, Boolean bool18, Boolean bool19, TrustMarkDto trustMarkDto, GroupsMicrolandingDto groupsMicrolandingDto, GroupsTariffsDto groupsTariffsDto, Integer num14, Boolean bool20, DisallowManageReasonDto disallowManageReasonDto, String str14, BaseBoolIntDto baseBoolIntDto22, GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto, Boolean bool21, Boolean bool22, Integer num15, GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto, Boolean bool23, Integer num16, Boolean bool24, Object obj2, Object obj3, Object obj4, Boolean bool25, Object obj5, Object obj6, Boolean bool26, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, GroupsGroupLikeItemDto groupsGroupLikeItemDto, GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto, Boolean bool27, Integer num22, Integer num23, Integer num24, Integer num25, GroupsGroupFriendsDto groupsGroupFriendsDto, String str15, DeactivatedTypeDto deactivatedTypeDto, String str16, Boolean bool28, Boolean bool29, Boolean bool30, MarketCommunityRatingDto marketCommunityRatingDto, GroupsGroupNameHistoryDto groupsGroupNameHistoryDto, MarketCommunityServiceRatingDto marketCommunityServiceRatingDto, GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto, String str17, String str18, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str19, GroupsAdsPostsInfoDto groupsAdsPostsInfoDto, String str20, GroupsBannerDto groupsBannerDto, GroupsBannerDto groupsBannerDto2, Boolean bool36, LeaveModeDto leaveModeDto, GroupsBannerDto groupsBannerDto3, Boolean bool37, Boolean bool38, VideoNotificationsStatusDto videoNotificationsStatusDto, Boolean bool39, Boolean bool40, String str21, Boolean bool41, GroupsWorkGroupInfoDto groupsWorkGroupInfoDto, String str22, GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto, GroupsStrikesInfoDto groupsStrikesInfoDto, GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto, Boolean bool42, List<String> list3, Boolean bool43, Boolean bool44, List<GroupsTabSettingsDto> list4, Integer num26, Integer num27, GroupsSimpleButtonDto groupsSimpleButtonDto, BaseAPlusMarkDto baseAPlusMarkDto, List<ServiceBookingRepeatRecordDto> list5, GroupsChannelInfoDto groupsChannelInfoDto, GroupsChannelBlockDto groupsChannelBlockDto, Boolean bool45, GroupsEventOrganizerDto groupsEventOrganizerDto, GroupsVideoChannelDataDto groupsVideoChannelDataDto, Boolean bool46, Boolean bool47, Boolean bool48, GroupsContentSectionsDataDto groupsContentSectionsDataDto, String str23, String str24, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto23, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, Integer num28, Integer num29, BaseBoolIntDto baseBoolIntDto26, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List<GroupsAppButtonDto> list6, BaseBoolIntDto baseBoolIntDto27, VideoLiveInfoDto videoLiveInfoDto, Boolean bool49, String str37, Integer num30, List<BaseOwnerButtonDto> list7, Boolean bool50, Boolean bool51, GroupsMarketInfoDto groupsMarketInfoDto, GroupsMarketServicesInfoDto groupsMarketServicesInfoDto, Boolean bool52, Boolean bool53, Boolean bool54, GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto, GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, YoulaStatusDto youlaStatusDto, Boolean bool60, String str38, Integer num31, Boolean bool61, YoulaPostingMethodDto youlaPostingMethodDto) {
        this.trackCode = str;
        this.id = userId;
        this.memberStatus = groupsGroupFullMemberStatusDto;
        this.isAdult = baseBoolIntDto;
        this.isHiddenFromFeed = baseBoolIntDto2;
        this.isFavorite = baseBoolIntDto3;
        this.isSubscribed = baseBoolIntDto4;
        this.city = baseObjectDto;
        this.country = baseCountryDto;
        this.description = str2;
        this.wikiPage = str3;
        this.membersCount = num;
        this.membersCountText = str4;
        this.requestsCount = num2;
        this.musicAwards = audioMusicAwardsDto;
        this.videoLiveLevel = num3;
        this.videoLiveCount = num4;
        this.clipsCount = num5;
        this.counters = groupsCountersGroupDto;
        this.cover = baseOwnerCoverDto;
        this.videoCover = baseOwnerCoverDto2;
        this.videoLivesData = groupsVideoLivesDataDto;
        this.photoAvgColor = str5;
        this.inn = str6;
        this.ogrn = str7;
        this.kpp = str8;
        this.hasLiveCover = bool;
        this.hasStories = bool2;
        this.canPost = baseBoolIntDto5;
        this.canSuggest = baseBoolIntDto6;
        this.canUploadStory = baseBoolIntDto7;
        this.canCallToCommunity = bool3;
        this.canUploadDoc = baseBoolIntDto8;
        this.canUploadVideo = baseBoolIntDto9;
        this.canUploadVideoThumb = baseBoolIntDto10;
        this.canUploadClip = baseBoolIntDto11;
        this.canSeeAllPosts = baseBoolIntDto12;
        this.canCreateTopic = baseBoolIntDto13;
        this.activity = str9;
        this.fixedPost = num6;
        this.hasPhoto = baseBoolIntDto14;
        this.cropPhoto = baseCropPhotoDto;
        this.status = str10;
        this.statusAudio = audioAudioDto;
        this.mainAlbumId = num7;
        this.links = list;
        this.contacts = list2;
        this.wall = wallDto;
        this.site = str11;
        this.isSiteDisplayed = bool4;
        this.mainSection = groupsGroupFullSectionDto;
        this.primaryBlock = groupsPrimaryBlockSettingsDto;
        this.trending = baseBoolIntDto15;
        this.canMessage = baseBoolIntDto16;
        this.isMessagesBlocked = baseBoolIntDto17;
        this.canSendNotify = baseBoolIntDto18;
        this.onlineStatus = groupsOnlineStatusDto;
        this.invitedBy = num8;
        this.ageLimits = groupsGroupFullAgeLimitsDto;
        this.ageMark = groupsGroupFullAgeMarkDto;
        this.banInfo = groupsGroupBanInfoDto;
        this.actionButton = groupsActionButtonDto;
        this.authorId = num9;
        this.phone = str12;
        this.isWidgetMessagesEnabled = bool5;
        this.vkpayCanTransfer = bool6;
        this.vkpayReceiverId = num10;
        this.hasGroupChannel = bool7;
        this.groupChannel = obj;
        this.communityChannelId = num11;
        this.addresses = groupsAddressesInfoDto;
        this.messages = bool8;
        this.isAue = bool9;
        this.prohibitedContentAdultMark = bool10;
        this.isSubscribedPodcasts = bool11;
        this.canSubscribePodcasts = bool12;
        this.isSubscribedStories = bool13;
        this.canSubscribeStories = bool14;
        this.canSubscribePosts = bool15;
        this.liveCovers = groupsLiveCoversDto;
        this.vkAdminStatus = groupsVkAdminStatusDto;
        this.menu = groupsMenuDto;
        this.warningNotification = groupsWarningNotificationDto;
        this.createDate = num12;
        this.donut = groupsGroupDonutDto;
        this.vkTicket = groupsGroupVkTicketDto;
        this.donutBlock = groupsGroupDonutBlockDto;
        this.donutCommunityManagement = groupsDonutCommunityManagementDto;
        this.donutPaymentInfo = groupsGroupDonutPaymentInfoDto;
        this.canPostDonut = num13;
        this.canSeeMembers = bool16;
        this.msgPushAllowed = baseBoolIntDto19;
        this.msgNotificationsAllowed = baseBoolIntDto20;
        this.chatsStatus = groupsChatsStatusDto;
        this.canReport = baseBoolIntDto21;
        this.businessRating = f;
        this.isBusiness = str13;
        this.isBusinessCategory = bool17;
        this.isConfirmedBusiness = bool18;
        this.isGoldenMarkedBusiness = bool19;
        this.trustMark = trustMarkDto;
        this.microlanding = groupsMicrolandingDto;
        this.tariffs = groupsTariffsDto;
        this.verificationEndTime = num14;
        this.canManage = bool20;
        this.disallowManageReason = disallowManageReasonDto;
        this.disallowManageReasonMessage = str14;
        this.hasSuggestions = baseBoolIntDto22;
        this.showSuggestions = groupsGroupFullShowSuggestionsDto;
        this.canViewStats = bool21;
        this.canViewPostReachStats = bool22;
        this.storiesArchiveCount = num15;
        this.adsEasyPromote = groupsAdsEasyPromoteDto;
        this.adsEasyPromoteAllowed = bool23;
        this.adsPostingRestrictedToday = num16;
        this.adsMarketAutopromoteAllowed = bool24;
        this.adsMarketEasyPromote = obj2;
        this.adsMarketAutopromoteReasonsNotAllowed = obj3;
        this.adsMarketServicesAutopromoteReasonsNotAllowed = obj4;
        this.adsMarketServicesAutopromoteAllowed = bool25;
        this.adsMarketServicesEasyPromote = obj5;
        this.adsEasyPromoteReasonsNotAllowed = obj6;
        this.canSeeInviteLinks = bool26;
        this.categoryV2 = num17;
        this.subjectId = num18;
        this.publicCategory = num19;
        this.publicSubcategory = num20;
        this.installedAppsCount = num21;
        this.like = groupsGroupLikeItemDto;
        this.loginConfirmationStatus = groupsLoginConfirmationStatusDto;
        this.hasUnseenStories = bool27;
        this.category = num22;
        this.category0 = num23;
        this.category1 = num24;
        this.category2 = num25;
        this.friends = groupsGroupFriendsDto;
        this.deactivatedMessage = str15;
        this.deactivatedType = deactivatedTypeDto;
        this.targArtistId = str16;
        this.isGovernmentOrganization = bool28;
        this.settingsTooltipsActive = bool29;
        this.isYclientsTooltipActive = bool30;
        this.rating = marketCommunityRatingDto;
        this.nameHistory = groupsGroupNameHistoryDto;
        this.serviceRating = marketCommunityServiceRatingDto;
        this.recommendedTipsWidget = groupsRecommendedTipsWidgetDto;
        this.region = str17;
        this.subject = str18;
        this.isSetTabOrder = bool31;
        this.isShowBusinessOnboarding = bool32;
        this.businessCommunityTooltips = bool33;
        this.repostsDisabled = bool34;
        this.videoLivesStreamingBanned = bool35;
        this.category1Name = str19;
        this.adsPostsInfo = groupsAdsPostsInfoDto;
        this.thematic = str20;
        this.bannerAdsMainClient = groupsBannerDto;
        this.bannerAdsSettingMiniapp = groupsBannerDto2;
        this.isManualMarkedBusiness = bool36;
        this.leaveMode = leaveModeDto;
        this.bannerAdsMainMvk = groupsBannerDto3;
        this.isMediaWallEnabled = bool37;
        this.isMonetizationAvailable = bool38;
        this.videoNotificationsStatus = videoNotificationsStatusDto;
        this.isVideoSubscriptionHidden = bool39;
        this.suggestSubscribe = bool40;
        this.suggestedCategoryName = str21;
        this.isWorkGroup = bool41;
        this.workGroupInfo = groupsWorkGroupInfoDto;
        this.url = str22;
        this.membersPreview = groupsGroupFullMembersPreviewDto;
        this.strikesInfo = groupsStrikesInfoDto;
        this.strikesRestrictions = groupsStrikesRestrictionsDto;
        this.coOwnershipEnabled = bool42;
        this.enabledFeatures = list3;
        this.canEditScreenName = bool43;
        this.canCreateEvent = bool44;
        this.tabs = list4;
        this.unreadCount = num26;
        this.videosCount = num27;
        this.channelButton = groupsSimpleButtonDto;
        this.aPlusMark = baseAPlusMarkDto;
        this.yclientsRepeatRecords = list5;
        this.channelInfo = groupsChannelInfoDto;
        this.channelBlock = groupsChannelBlockDto;
        this.isEducational = bool45;
        this.eventOrganizer = groupsEventOrganizerDto;
        this.videoChannelData = groupsVideoChannelDataDto;
        this.isTagsAvailable = bool46;
        this.isGroupDisplayed = bool47;
        this.isMarketEnabled = bool48;
        this.contentSectionsData = groupsContentSectionsDataDto;
        this.name = str23;
        this.screenName = str24;
        this.isClosed = groupsGroupIsClosedDto;
        this.type = groupsGroupTypeDto;
        this.channelType = channelsChannelTypeDto;
        this.isAdmin = baseBoolIntDto23;
        this.adminLevel = groupsGroupAdminLevelDto;
        this.isMember = baseBoolIntDto24;
        this.isAdvertiser = baseBoolIntDto25;
        this.startDate = num28;
        this.finishDate = num29;
        this.verified = baseBoolIntDto26;
        this.deactivated = str25;
        this.photo50 = str26;
        this.photo100 = str27;
        this.photo200 = str28;
        this.photo200Orig = str29;
        this.photo400 = str30;
        this.photo400Orig = str31;
        this.photoMax = str32;
        this.photoMaxOrig = str33;
        this.photoBase = str34;
        this.estDate = str35;
        this.publicDateLabel = str36;
        this.photoMaxSize = groupsPhotoSizeDto;
        this.appButton = groupsAppButtonDto;
        this.appButtons = list6;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto27;
        this.videoLive = videoLiveInfoDto;
        this.hadTorch = bool49;
        this.audioArtistId = str37;
        this.audioCuratorId = num30;
        this.buttons = list7;
        this.isNftPhoto = bool50;
        this.isCached = bool51;
        this.market = groupsMarketInfoDto;
        this.marketServices = groupsMarketServicesInfoDto;
        this.hasMarketApp = bool52;
        this.usingVkpayMarketApp = bool53;
        this.isMarketCartEnabled = bool54;
        this.extendedMarket = groupsGroupExtendedMarketSectionsDto;
        this.marketShopConditionsState = groupsMarketShopConditionsStateDto;
        this.isMarketOnlineBookingSettingEnabled = bool55;
        this.isBindingToYclientsServiceEnabled = bool56;
        this.isMarketMarketLinkAttachmentEnabled = bool57;
        this.isMarketMessageToBcAttachmentEnabled = bool58;
        this.isMarketOnlineBookingActionButtonEnabled = bool59;
        this.youlaStatus = youlaStatusDto;
        this.youlaUseWallpostRedirect = bool60;
        this.youlaWallpostRedirectMiniappUrl = str38;
        this.classifiedsAntibaraholkaDesignVersion = num31;
        this.isYoulaPostingToWallAllowed = bool61;
        this.youlaPostingMethod = youlaPostingMethodDto;
    }

    public final GroupsGroupAdminLevelDto d() {
        return this.adminLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupFullAgeLimitsDto e() {
        return this.ageLimits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchGroupExtendedDto)) {
            return false;
        }
        SearchGroupExtendedDto searchGroupExtendedDto = (SearchGroupExtendedDto) obj;
        return epx.f(this.trackCode, searchGroupExtendedDto.trackCode) && epx.f(this.id, searchGroupExtendedDto.id) && this.memberStatus == searchGroupExtendedDto.memberStatus && this.isAdult == searchGroupExtendedDto.isAdult && this.isHiddenFromFeed == searchGroupExtendedDto.isHiddenFromFeed && this.isFavorite == searchGroupExtendedDto.isFavorite && this.isSubscribed == searchGroupExtendedDto.isSubscribed && epx.f(this.city, searchGroupExtendedDto.city) && epx.f(this.country, searchGroupExtendedDto.country) && epx.f(this.description, searchGroupExtendedDto.description) && epx.f(this.wikiPage, searchGroupExtendedDto.wikiPage) && epx.f(this.membersCount, searchGroupExtendedDto.membersCount) && epx.f(this.membersCountText, searchGroupExtendedDto.membersCountText) && epx.f(this.requestsCount, searchGroupExtendedDto.requestsCount) && epx.f(this.musicAwards, searchGroupExtendedDto.musicAwards) && epx.f(this.videoLiveLevel, searchGroupExtendedDto.videoLiveLevel) && epx.f(this.videoLiveCount, searchGroupExtendedDto.videoLiveCount) && epx.f(this.clipsCount, searchGroupExtendedDto.clipsCount) && epx.f(this.counters, searchGroupExtendedDto.counters) && epx.f(this.cover, searchGroupExtendedDto.cover) && epx.f(this.videoCover, searchGroupExtendedDto.videoCover) && epx.f(this.videoLivesData, searchGroupExtendedDto.videoLivesData) && epx.f(this.photoAvgColor, searchGroupExtendedDto.photoAvgColor) && epx.f(this.inn, searchGroupExtendedDto.inn) && epx.f(this.ogrn, searchGroupExtendedDto.ogrn) && epx.f(this.kpp, searchGroupExtendedDto.kpp) && epx.f(this.hasLiveCover, searchGroupExtendedDto.hasLiveCover) && epx.f(this.hasStories, searchGroupExtendedDto.hasStories) && this.canPost == searchGroupExtendedDto.canPost && this.canSuggest == searchGroupExtendedDto.canSuggest && this.canUploadStory == searchGroupExtendedDto.canUploadStory && epx.f(this.canCallToCommunity, searchGroupExtendedDto.canCallToCommunity) && this.canUploadDoc == searchGroupExtendedDto.canUploadDoc && this.canUploadVideo == searchGroupExtendedDto.canUploadVideo && this.canUploadVideoThumb == searchGroupExtendedDto.canUploadVideoThumb && this.canUploadClip == searchGroupExtendedDto.canUploadClip && this.canSeeAllPosts == searchGroupExtendedDto.canSeeAllPosts && this.canCreateTopic == searchGroupExtendedDto.canCreateTopic && epx.f(this.activity, searchGroupExtendedDto.activity) && epx.f(this.fixedPost, searchGroupExtendedDto.fixedPost) && this.hasPhoto == searchGroupExtendedDto.hasPhoto && epx.f(this.cropPhoto, searchGroupExtendedDto.cropPhoto) && epx.f(this.status, searchGroupExtendedDto.status) && epx.f(this.statusAudio, searchGroupExtendedDto.statusAudio) && epx.f(this.mainAlbumId, searchGroupExtendedDto.mainAlbumId) && epx.f(this.links, searchGroupExtendedDto.links) && epx.f(this.contacts, searchGroupExtendedDto.contacts) && this.wall == searchGroupExtendedDto.wall && epx.f(this.site, searchGroupExtendedDto.site) && epx.f(this.isSiteDisplayed, searchGroupExtendedDto.isSiteDisplayed) && this.mainSection == searchGroupExtendedDto.mainSection && epx.f(this.primaryBlock, searchGroupExtendedDto.primaryBlock) && this.trending == searchGroupExtendedDto.trending && this.canMessage == searchGroupExtendedDto.canMessage && this.isMessagesBlocked == searchGroupExtendedDto.isMessagesBlocked && this.canSendNotify == searchGroupExtendedDto.canSendNotify && epx.f(this.onlineStatus, searchGroupExtendedDto.onlineStatus) && epx.f(this.invitedBy, searchGroupExtendedDto.invitedBy) && this.ageLimits == searchGroupExtendedDto.ageLimits && this.ageMark == searchGroupExtendedDto.ageMark && epx.f(this.banInfo, searchGroupExtendedDto.banInfo) && epx.f(this.actionButton, searchGroupExtendedDto.actionButton) && epx.f(this.authorId, searchGroupExtendedDto.authorId) && epx.f(this.phone, searchGroupExtendedDto.phone) && epx.f(this.isWidgetMessagesEnabled, searchGroupExtendedDto.isWidgetMessagesEnabled) && epx.f(this.vkpayCanTransfer, searchGroupExtendedDto.vkpayCanTransfer) && epx.f(this.vkpayReceiverId, searchGroupExtendedDto.vkpayReceiverId) && epx.f(this.hasGroupChannel, searchGroupExtendedDto.hasGroupChannel) && epx.f(this.groupChannel, searchGroupExtendedDto.groupChannel) && epx.f(this.communityChannelId, searchGroupExtendedDto.communityChannelId) && epx.f(this.addresses, searchGroupExtendedDto.addresses) && epx.f(this.messages, searchGroupExtendedDto.messages) && epx.f(this.isAue, searchGroupExtendedDto.isAue) && epx.f(this.prohibitedContentAdultMark, searchGroupExtendedDto.prohibitedContentAdultMark) && epx.f(this.isSubscribedPodcasts, searchGroupExtendedDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, searchGroupExtendedDto.canSubscribePodcasts) && epx.f(this.isSubscribedStories, searchGroupExtendedDto.isSubscribedStories) && epx.f(this.canSubscribeStories, searchGroupExtendedDto.canSubscribeStories) && epx.f(this.canSubscribePosts, searchGroupExtendedDto.canSubscribePosts) && epx.f(this.liveCovers, searchGroupExtendedDto.liveCovers) && epx.f(this.vkAdminStatus, searchGroupExtendedDto.vkAdminStatus) && epx.f(this.menu, searchGroupExtendedDto.menu) && epx.f(this.warningNotification, searchGroupExtendedDto.warningNotification) && epx.f(this.createDate, searchGroupExtendedDto.createDate) && epx.f(this.donut, searchGroupExtendedDto.donut) && epx.f(this.vkTicket, searchGroupExtendedDto.vkTicket) && epx.f(this.donutBlock, searchGroupExtendedDto.donutBlock) && epx.f(this.donutCommunityManagement, searchGroupExtendedDto.donutCommunityManagement) && epx.f(this.donutPaymentInfo, searchGroupExtendedDto.donutPaymentInfo) && epx.f(this.canPostDonut, searchGroupExtendedDto.canPostDonut) && epx.f(this.canSeeMembers, searchGroupExtendedDto.canSeeMembers) && this.msgPushAllowed == searchGroupExtendedDto.msgPushAllowed && this.msgNotificationsAllowed == searchGroupExtendedDto.msgNotificationsAllowed && epx.f(this.chatsStatus, searchGroupExtendedDto.chatsStatus) && this.canReport == searchGroupExtendedDto.canReport && epx.f(this.businessRating, searchGroupExtendedDto.businessRating) && epx.f(this.isBusiness, searchGroupExtendedDto.isBusiness) && epx.f(this.isBusinessCategory, searchGroupExtendedDto.isBusinessCategory) && epx.f(this.isConfirmedBusiness, searchGroupExtendedDto.isConfirmedBusiness) && epx.f(this.isGoldenMarkedBusiness, searchGroupExtendedDto.isGoldenMarkedBusiness) && this.trustMark == searchGroupExtendedDto.trustMark && epx.f(this.microlanding, searchGroupExtendedDto.microlanding) && epx.f(this.tariffs, searchGroupExtendedDto.tariffs) && epx.f(this.verificationEndTime, searchGroupExtendedDto.verificationEndTime) && epx.f(this.canManage, searchGroupExtendedDto.canManage) && this.disallowManageReason == searchGroupExtendedDto.disallowManageReason && epx.f(this.disallowManageReasonMessage, searchGroupExtendedDto.disallowManageReasonMessage) && this.hasSuggestions == searchGroupExtendedDto.hasSuggestions && this.showSuggestions == searchGroupExtendedDto.showSuggestions && epx.f(this.canViewStats, searchGroupExtendedDto.canViewStats) && epx.f(this.canViewPostReachStats, searchGroupExtendedDto.canViewPostReachStats) && epx.f(this.storiesArchiveCount, searchGroupExtendedDto.storiesArchiveCount) && epx.f(this.adsEasyPromote, searchGroupExtendedDto.adsEasyPromote) && epx.f(this.adsEasyPromoteAllowed, searchGroupExtendedDto.adsEasyPromoteAllowed) && epx.f(this.adsPostingRestrictedToday, searchGroupExtendedDto.adsPostingRestrictedToday) && epx.f(this.adsMarketAutopromoteAllowed, searchGroupExtendedDto.adsMarketAutopromoteAllowed) && epx.f(this.adsMarketEasyPromote, searchGroupExtendedDto.adsMarketEasyPromote) && epx.f(this.adsMarketAutopromoteReasonsNotAllowed, searchGroupExtendedDto.adsMarketAutopromoteReasonsNotAllowed) && epx.f(this.adsMarketServicesAutopromoteReasonsNotAllowed, searchGroupExtendedDto.adsMarketServicesAutopromoteReasonsNotAllowed) && epx.f(this.adsMarketServicesAutopromoteAllowed, searchGroupExtendedDto.adsMarketServicesAutopromoteAllowed) && epx.f(this.adsMarketServicesEasyPromote, searchGroupExtendedDto.adsMarketServicesEasyPromote) && epx.f(this.adsEasyPromoteReasonsNotAllowed, searchGroupExtendedDto.adsEasyPromoteReasonsNotAllowed) && epx.f(this.canSeeInviteLinks, searchGroupExtendedDto.canSeeInviteLinks) && epx.f(this.categoryV2, searchGroupExtendedDto.categoryV2) && epx.f(this.subjectId, searchGroupExtendedDto.subjectId) && epx.f(this.publicCategory, searchGroupExtendedDto.publicCategory) && epx.f(this.publicSubcategory, searchGroupExtendedDto.publicSubcategory) && epx.f(this.installedAppsCount, searchGroupExtendedDto.installedAppsCount) && epx.f(this.like, searchGroupExtendedDto.like) && epx.f(this.loginConfirmationStatus, searchGroupExtendedDto.loginConfirmationStatus) && epx.f(this.hasUnseenStories, searchGroupExtendedDto.hasUnseenStories) && epx.f(this.category, searchGroupExtendedDto.category) && epx.f(this.category0, searchGroupExtendedDto.category0) && epx.f(this.category1, searchGroupExtendedDto.category1) && epx.f(this.category2, searchGroupExtendedDto.category2) && epx.f(this.friends, searchGroupExtendedDto.friends) && epx.f(this.deactivatedMessage, searchGroupExtendedDto.deactivatedMessage) && this.deactivatedType == searchGroupExtendedDto.deactivatedType && epx.f(this.targArtistId, searchGroupExtendedDto.targArtistId) && epx.f(this.isGovernmentOrganization, searchGroupExtendedDto.isGovernmentOrganization) && epx.f(this.settingsTooltipsActive, searchGroupExtendedDto.settingsTooltipsActive) && epx.f(this.isYclientsTooltipActive, searchGroupExtendedDto.isYclientsTooltipActive) && epx.f(this.rating, searchGroupExtendedDto.rating) && epx.f(this.nameHistory, searchGroupExtendedDto.nameHistory) && epx.f(this.serviceRating, searchGroupExtendedDto.serviceRating) && epx.f(this.recommendedTipsWidget, searchGroupExtendedDto.recommendedTipsWidget) && epx.f(this.region, searchGroupExtendedDto.region) && epx.f(this.subject, searchGroupExtendedDto.subject) && epx.f(this.isSetTabOrder, searchGroupExtendedDto.isSetTabOrder) && epx.f(this.isShowBusinessOnboarding, searchGroupExtendedDto.isShowBusinessOnboarding) && epx.f(this.businessCommunityTooltips, searchGroupExtendedDto.businessCommunityTooltips) && epx.f(this.repostsDisabled, searchGroupExtendedDto.repostsDisabled) && epx.f(this.videoLivesStreamingBanned, searchGroupExtendedDto.videoLivesStreamingBanned) && epx.f(this.category1Name, searchGroupExtendedDto.category1Name) && epx.f(this.adsPostsInfo, searchGroupExtendedDto.adsPostsInfo) && epx.f(this.thematic, searchGroupExtendedDto.thematic) && epx.f(this.bannerAdsMainClient, searchGroupExtendedDto.bannerAdsMainClient) && epx.f(this.bannerAdsSettingMiniapp, searchGroupExtendedDto.bannerAdsSettingMiniapp) && epx.f(this.isManualMarkedBusiness, searchGroupExtendedDto.isManualMarkedBusiness) && this.leaveMode == searchGroupExtendedDto.leaveMode && epx.f(this.bannerAdsMainMvk, searchGroupExtendedDto.bannerAdsMainMvk) && epx.f(this.isMediaWallEnabled, searchGroupExtendedDto.isMediaWallEnabled) && epx.f(this.isMonetizationAvailable, searchGroupExtendedDto.isMonetizationAvailable) && this.videoNotificationsStatus == searchGroupExtendedDto.videoNotificationsStatus && epx.f(this.isVideoSubscriptionHidden, searchGroupExtendedDto.isVideoSubscriptionHidden) && epx.f(this.suggestSubscribe, searchGroupExtendedDto.suggestSubscribe) && epx.f(this.suggestedCategoryName, searchGroupExtendedDto.suggestedCategoryName) && epx.f(this.isWorkGroup, searchGroupExtendedDto.isWorkGroup) && epx.f(this.workGroupInfo, searchGroupExtendedDto.workGroupInfo) && epx.f(this.url, searchGroupExtendedDto.url) && epx.f(this.membersPreview, searchGroupExtendedDto.membersPreview) && epx.f(this.strikesInfo, searchGroupExtendedDto.strikesInfo) && epx.f(this.strikesRestrictions, searchGroupExtendedDto.strikesRestrictions) && epx.f(this.coOwnershipEnabled, searchGroupExtendedDto.coOwnershipEnabled) && epx.f(this.enabledFeatures, searchGroupExtendedDto.enabledFeatures) && epx.f(this.canEditScreenName, searchGroupExtendedDto.canEditScreenName) && epx.f(this.canCreateEvent, searchGroupExtendedDto.canCreateEvent) && epx.f(this.tabs, searchGroupExtendedDto.tabs) && epx.f(this.unreadCount, searchGroupExtendedDto.unreadCount) && epx.f(this.videosCount, searchGroupExtendedDto.videosCount) && epx.f(this.channelButton, searchGroupExtendedDto.channelButton) && epx.f(this.aPlusMark, searchGroupExtendedDto.aPlusMark) && epx.f(this.yclientsRepeatRecords, searchGroupExtendedDto.yclientsRepeatRecords) && epx.f(this.channelInfo, searchGroupExtendedDto.channelInfo) && epx.f(this.channelBlock, searchGroupExtendedDto.channelBlock) && epx.f(this.isEducational, searchGroupExtendedDto.isEducational) && epx.f(this.eventOrganizer, searchGroupExtendedDto.eventOrganizer) && epx.f(this.videoChannelData, searchGroupExtendedDto.videoChannelData) && epx.f(this.isTagsAvailable, searchGroupExtendedDto.isTagsAvailable) && epx.f(this.isGroupDisplayed, searchGroupExtendedDto.isGroupDisplayed) && epx.f(this.isMarketEnabled, searchGroupExtendedDto.isMarketEnabled) && epx.f(this.contentSectionsData, searchGroupExtendedDto.contentSectionsData) && epx.f(this.name, searchGroupExtendedDto.name) && epx.f(this.screenName, searchGroupExtendedDto.screenName) && this.isClosed == searchGroupExtendedDto.isClosed && this.type == searchGroupExtendedDto.type && this.channelType == searchGroupExtendedDto.channelType && this.isAdmin == searchGroupExtendedDto.isAdmin && this.adminLevel == searchGroupExtendedDto.adminLevel && this.isMember == searchGroupExtendedDto.isMember && this.isAdvertiser == searchGroupExtendedDto.isAdvertiser && epx.f(this.startDate, searchGroupExtendedDto.startDate) && epx.f(this.finishDate, searchGroupExtendedDto.finishDate) && this.verified == searchGroupExtendedDto.verified && epx.f(this.deactivated, searchGroupExtendedDto.deactivated) && epx.f(this.photo50, searchGroupExtendedDto.photo50) && epx.f(this.photo100, searchGroupExtendedDto.photo100) && epx.f(this.photo200, searchGroupExtendedDto.photo200) && epx.f(this.photo200Orig, searchGroupExtendedDto.photo200Orig) && epx.f(this.photo400, searchGroupExtendedDto.photo400) && epx.f(this.photo400Orig, searchGroupExtendedDto.photo400Orig) && epx.f(this.photoMax, searchGroupExtendedDto.photoMax) && epx.f(this.photoMaxOrig, searchGroupExtendedDto.photoMaxOrig) && epx.f(this.photoBase, searchGroupExtendedDto.photoBase) && epx.f(this.estDate, searchGroupExtendedDto.estDate) && epx.f(this.publicDateLabel, searchGroupExtendedDto.publicDateLabel) && epx.f(this.photoMaxSize, searchGroupExtendedDto.photoMaxSize) && epx.f(this.appButton, searchGroupExtendedDto.appButton) && epx.f(this.appButtons, searchGroupExtendedDto.appButtons) && this.isVideoLiveNotificationsBlocked == searchGroupExtendedDto.isVideoLiveNotificationsBlocked && epx.f(this.videoLive, searchGroupExtendedDto.videoLive) && epx.f(this.hadTorch, searchGroupExtendedDto.hadTorch) && epx.f(this.audioArtistId, searchGroupExtendedDto.audioArtistId) && epx.f(this.audioCuratorId, searchGroupExtendedDto.audioCuratorId) && epx.f(this.buttons, searchGroupExtendedDto.buttons) && epx.f(this.isNftPhoto, searchGroupExtendedDto.isNftPhoto) && epx.f(this.isCached, searchGroupExtendedDto.isCached) && epx.f(this.market, searchGroupExtendedDto.market) && epx.f(this.marketServices, searchGroupExtendedDto.marketServices) && epx.f(this.hasMarketApp, searchGroupExtendedDto.hasMarketApp) && epx.f(this.usingVkpayMarketApp, searchGroupExtendedDto.usingVkpayMarketApp) && epx.f(this.isMarketCartEnabled, searchGroupExtendedDto.isMarketCartEnabled) && epx.f(this.extendedMarket, searchGroupExtendedDto.extendedMarket) && this.marketShopConditionsState == searchGroupExtendedDto.marketShopConditionsState && epx.f(this.isMarketOnlineBookingSettingEnabled, searchGroupExtendedDto.isMarketOnlineBookingSettingEnabled) && epx.f(this.isBindingToYclientsServiceEnabled, searchGroupExtendedDto.isBindingToYclientsServiceEnabled) && epx.f(this.isMarketMarketLinkAttachmentEnabled, searchGroupExtendedDto.isMarketMarketLinkAttachmentEnabled) && epx.f(this.isMarketMessageToBcAttachmentEnabled, searchGroupExtendedDto.isMarketMessageToBcAttachmentEnabled) && epx.f(this.isMarketOnlineBookingActionButtonEnabled, searchGroupExtendedDto.isMarketOnlineBookingActionButtonEnabled) && this.youlaStatus == searchGroupExtendedDto.youlaStatus && epx.f(this.youlaUseWallpostRedirect, searchGroupExtendedDto.youlaUseWallpostRedirect) && epx.f(this.youlaWallpostRedirectMiniappUrl, searchGroupExtendedDto.youlaWallpostRedirectMiniappUrl) && epx.f(this.classifiedsAntibaraholkaDesignVersion, searchGroupExtendedDto.classifiedsAntibaraholkaDesignVersion) && epx.f(this.isYoulaPostingToWallAllowed, searchGroupExtendedDto.isYoulaPostingToWallAllowed) && this.youlaPostingMethod == searchGroupExtendedDto.youlaPostingMethod;
    }

    public final Boolean f() {
        return this.coOwnershipEnabled;
    }

    public final String g() {
        return this.deactivated;
    }

    public final int hashCode() {
        int hashCode = (this.id.hashCode() + (this.trackCode.hashCode() * 31)) * 31;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        int hashCode2 = (hashCode + (groupsGroupFullMemberStatusDto == null ? 0 : groupsGroupFullMemberStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isAdult;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isHiddenFromFeed;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFavorite;
        int hashCode5 = (hashCode4 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.isSubscribed;
        int hashCode6 = (hashCode5 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseObjectDto baseObjectDto = this.city;
        int hashCode7 = (hashCode6 + (baseObjectDto == null ? 0 : baseObjectDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode8 = (hashCode7 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        String str = this.description;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wikiPage;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.membersCount;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.membersCountText;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.requestsCount;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode14 = (hashCode13 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        GroupsCountersGroupDto groupsCountersGroupDto = this.counters;
        int hashCode18 = (hashCode17 + (groupsCountersGroupDto == null ? 0 : groupsCountersGroupDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode19 = (hashCode18 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto2 = this.videoCover;
        int hashCode20 = (hashCode19 + (baseOwnerCoverDto2 == null ? 0 : baseOwnerCoverDto2.hashCode())) * 31;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto = this.videoLivesData;
        int hashCode21 = (hashCode20 + (groupsVideoLivesDataDto == null ? 0 : groupsVideoLivesDataDto.hashCode())) * 31;
        String str4 = this.photoAvgColor;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.inn;
        int hashCode23 = (hashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ogrn;
        int hashCode24 = (hashCode23 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kpp;
        int hashCode25 = (hashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.hasLiveCover;
        int hashCode26 = (hashCode25 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasStories;
        int hashCode27 = (hashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode28 = (hashCode27 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSuggest;
        int hashCode29 = (hashCode28 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canUploadStory;
        int hashCode30 = (hashCode29 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        Boolean bool3 = this.canCallToCommunity;
        int hashCode31 = (hashCode30 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canUploadDoc;
        int hashCode32 = (hashCode31 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.canUploadVideo;
        int hashCode33 = (hashCode32 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canUploadVideoThumb;
        int hashCode34 = (hashCode33 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.canUploadClip;
        int hashCode35 = (hashCode34 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeAllPosts;
        int hashCode36 = (hashCode35 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canCreateTopic;
        int hashCode37 = (hashCode36 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        String str8 = this.activity;
        int hashCode38 = (hashCode37 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num6 = this.fixedPost;
        int hashCode39 = (hashCode38 + (num6 == null ? 0 : num6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.hasPhoto;
        int hashCode40 = (hashCode39 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode41 = (hashCode40 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        String str9 = this.status;
        int hashCode42 = (hashCode41 + (str9 == null ? 0 : str9.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode43 = (hashCode42 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        Integer num7 = this.mainAlbumId;
        int hashCode44 = (hashCode43 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<GroupsLinksItemDto> list = this.links;
        int hashCode45 = (hashCode44 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsContactsItemDto> list2 = this.contacts;
        int hashCode46 = (hashCode45 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallDto wallDto = this.wall;
        int hashCode47 = (hashCode46 + (wallDto == null ? 0 : wallDto.hashCode())) * 31;
        String str10 = this.site;
        int hashCode48 = (hashCode47 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool4 = this.isSiteDisplayed;
        int hashCode49 = (hashCode48 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        int hashCode50 = (hashCode49 + (groupsGroupFullSectionDto == null ? 0 : groupsGroupFullSectionDto.hashCode())) * 31;
        GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = this.primaryBlock;
        int hashCode51 = (hashCode50 + (groupsPrimaryBlockSettingsDto == null ? 0 : groupsPrimaryBlockSettingsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.trending;
        int hashCode52 = (hashCode51 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.canMessage;
        int hashCode53 = (hashCode52 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isMessagesBlocked;
        int hashCode54 = (hashCode53 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.canSendNotify;
        int hashCode55 = (hashCode54 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        GroupsOnlineStatusDto groupsOnlineStatusDto = this.onlineStatus;
        int hashCode56 = (hashCode55 + (groupsOnlineStatusDto == null ? 0 : groupsOnlineStatusDto.hashCode())) * 31;
        Integer num8 = this.invitedBy;
        int hashCode57 = (hashCode56 + (num8 == null ? 0 : num8.hashCode())) * 31;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = this.ageLimits;
        int hashCode58 = (hashCode57 + (groupsGroupFullAgeLimitsDto == null ? 0 : groupsGroupFullAgeLimitsDto.hashCode())) * 31;
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = this.ageMark;
        int hashCode59 = (hashCode58 + (groupsGroupFullAgeMarkDto == null ? 0 : groupsGroupFullAgeMarkDto.hashCode())) * 31;
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = this.banInfo;
        int hashCode60 = (hashCode59 + (groupsGroupBanInfoDto == null ? 0 : groupsGroupBanInfoDto.hashCode())) * 31;
        GroupsActionButtonDto groupsActionButtonDto = this.actionButton;
        int hashCode61 = (hashCode60 + (groupsActionButtonDto == null ? 0 : groupsActionButtonDto.hashCode())) * 31;
        Integer num9 = this.authorId;
        int hashCode62 = (hashCode61 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str11 = this.phone;
        int hashCode63 = (hashCode62 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool5 = this.isWidgetMessagesEnabled;
        int hashCode64 = (hashCode63 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.vkpayCanTransfer;
        int hashCode65 = (hashCode64 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num10 = this.vkpayReceiverId;
        int hashCode66 = (hashCode65 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Boolean bool7 = this.hasGroupChannel;
        int hashCode67 = (hashCode66 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Object obj = this.groupChannel;
        int hashCode68 = (hashCode67 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num11 = this.communityChannelId;
        int hashCode69 = (hashCode68 + (num11 == null ? 0 : num11.hashCode())) * 31;
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        int hashCode70 = (hashCode69 + (groupsAddressesInfoDto == null ? 0 : groupsAddressesInfoDto.hashCode())) * 31;
        Boolean bool8 = this.messages;
        int hashCode71 = (hashCode70 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isAue;
        int hashCode72 = (hashCode71 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.prohibitedContentAdultMark;
        int hashCode73 = (hashCode72 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isSubscribedPodcasts;
        int hashCode74 = (hashCode73 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.canSubscribePodcasts;
        int hashCode75 = (hashCode74 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.isSubscribedStories;
        int hashCode76 = (hashCode75 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.canSubscribeStories;
        int hashCode77 = (hashCode76 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canSubscribePosts;
        int hashCode78 = (hashCode77 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        GroupsLiveCoversDto groupsLiveCoversDto = this.liveCovers;
        int hashCode79 = (hashCode78 + (groupsLiveCoversDto == null ? 0 : groupsLiveCoversDto.hashCode())) * 31;
        GroupsVkAdminStatusDto groupsVkAdminStatusDto = this.vkAdminStatus;
        int hashCode80 = (hashCode79 + (groupsVkAdminStatusDto == null ? 0 : groupsVkAdminStatusDto.hashCode())) * 31;
        GroupsMenuDto groupsMenuDto = this.menu;
        int hashCode81 = (hashCode80 + (groupsMenuDto == null ? 0 : groupsMenuDto.hashCode())) * 31;
        GroupsWarningNotificationDto groupsWarningNotificationDto = this.warningNotification;
        int hashCode82 = (hashCode81 + (groupsWarningNotificationDto == null ? 0 : groupsWarningNotificationDto.hashCode())) * 31;
        Integer num12 = this.createDate;
        int hashCode83 = (hashCode82 + (num12 == null ? 0 : num12.hashCode())) * 31;
        GroupsGroupDonutDto groupsGroupDonutDto = this.donut;
        int hashCode84 = (hashCode83 + (groupsGroupDonutDto == null ? 0 : groupsGroupDonutDto.hashCode())) * 31;
        GroupsGroupVkTicketDto groupsGroupVkTicketDto = this.vkTicket;
        int hashCode85 = (hashCode84 + (groupsGroupVkTicketDto == null ? 0 : groupsGroupVkTicketDto.hashCode())) * 31;
        GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = this.donutBlock;
        int hashCode86 = (hashCode85 + (groupsGroupDonutBlockDto == null ? 0 : groupsGroupDonutBlockDto.hashCode())) * 31;
        GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = this.donutCommunityManagement;
        int hashCode87 = (hashCode86 + (groupsDonutCommunityManagementDto == null ? 0 : groupsDonutCommunityManagementDto.hashCode())) * 31;
        GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto = this.donutPaymentInfo;
        int hashCode88 = (hashCode87 + (groupsGroupDonutPaymentInfoDto == null ? 0 : groupsGroupDonutPaymentInfoDto.hashCode())) * 31;
        Integer num13 = this.canPostDonut;
        int hashCode89 = (hashCode88 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Boolean bool16 = this.canSeeMembers;
        int hashCode90 = (hashCode89 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.msgPushAllowed;
        int hashCode91 = (hashCode90 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.msgNotificationsAllowed;
        int hashCode92 = (hashCode91 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        GroupsChatsStatusDto groupsChatsStatusDto = this.chatsStatus;
        int hashCode93 = (hashCode92 + (groupsChatsStatusDto == null ? 0 : groupsChatsStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.canReport;
        int hashCode94 = (hashCode93 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Float f = this.businessRating;
        int hashCode95 = (hashCode94 + (f == null ? 0 : f.hashCode())) * 31;
        String str12 = this.isBusiness;
        int hashCode96 = (hashCode95 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool17 = this.isBusinessCategory;
        int hashCode97 = (hashCode96 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isConfirmedBusiness;
        int hashCode98 = (hashCode97 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.isGoldenMarkedBusiness;
        int hashCode99 = (hashCode98 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        TrustMarkDto trustMarkDto = this.trustMark;
        int hashCode100 = (hashCode99 + (trustMarkDto == null ? 0 : trustMarkDto.hashCode())) * 31;
        GroupsMicrolandingDto groupsMicrolandingDto = this.microlanding;
        int hashCode101 = (hashCode100 + (groupsMicrolandingDto == null ? 0 : groupsMicrolandingDto.hashCode())) * 31;
        GroupsTariffsDto groupsTariffsDto = this.tariffs;
        int hashCode102 = (hashCode101 + (groupsTariffsDto == null ? 0 : groupsTariffsDto.hashCode())) * 31;
        Integer num14 = this.verificationEndTime;
        int hashCode103 = (hashCode102 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool20 = this.canManage;
        int hashCode104 = (hashCode103 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        DisallowManageReasonDto disallowManageReasonDto = this.disallowManageReason;
        int hashCode105 = (hashCode104 + (disallowManageReasonDto == null ? 0 : disallowManageReasonDto.hashCode())) * 31;
        String str13 = this.disallowManageReasonMessage;
        int hashCode106 = (hashCode105 + (str13 == null ? 0 : str13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.hasSuggestions;
        int hashCode107 = (hashCode106 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = this.showSuggestions;
        int hashCode108 = (hashCode107 + (groupsGroupFullShowSuggestionsDto == null ? 0 : groupsGroupFullShowSuggestionsDto.hashCode())) * 31;
        Boolean bool21 = this.canViewStats;
        int hashCode109 = (hashCode108 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.canViewPostReachStats;
        int hashCode110 = (hashCode109 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Integer num15 = this.storiesArchiveCount;
        int hashCode111 = (hashCode110 + (num15 == null ? 0 : num15.hashCode())) * 31;
        GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = this.adsEasyPromote;
        int hashCode112 = (hashCode111 + (groupsAdsEasyPromoteDto == null ? 0 : groupsAdsEasyPromoteDto.hashCode())) * 31;
        Boolean bool23 = this.adsEasyPromoteAllowed;
        int hashCode113 = (hashCode112 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Integer num16 = this.adsPostingRestrictedToday;
        int hashCode114 = (hashCode113 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Boolean bool24 = this.adsMarketAutopromoteAllowed;
        int hashCode115 = (hashCode114 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Object obj2 = this.adsMarketEasyPromote;
        int hashCode116 = (hashCode115 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.adsMarketAutopromoteReasonsNotAllowed;
        int hashCode117 = (hashCode116 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.adsMarketServicesAutopromoteReasonsNotAllowed;
        int hashCode118 = (hashCode117 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Boolean bool25 = this.adsMarketServicesAutopromoteAllowed;
        int hashCode119 = (hashCode118 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Object obj5 = this.adsMarketServicesEasyPromote;
        int hashCode120 = (hashCode119 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.adsEasyPromoteReasonsNotAllowed;
        int hashCode121 = (hashCode120 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Boolean bool26 = this.canSeeInviteLinks;
        int hashCode122 = (hashCode121 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Integer num17 = this.categoryV2;
        int hashCode123 = (hashCode122 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.subjectId;
        int hashCode124 = (hashCode123 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.publicCategory;
        int hashCode125 = (hashCode124 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.publicSubcategory;
        int hashCode126 = (hashCode125 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.installedAppsCount;
        int hashCode127 = (hashCode126 + (num21 == null ? 0 : num21.hashCode())) * 31;
        GroupsGroupLikeItemDto groupsGroupLikeItemDto = this.like;
        int hashCode128 = (hashCode127 + (groupsGroupLikeItemDto == null ? 0 : groupsGroupLikeItemDto.hashCode())) * 31;
        GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = this.loginConfirmationStatus;
        int hashCode129 = (hashCode128 + (groupsLoginConfirmationStatusDto == null ? 0 : groupsLoginConfirmationStatusDto.hashCode())) * 31;
        Boolean bool27 = this.hasUnseenStories;
        int hashCode130 = (hashCode129 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Integer num22 = this.category;
        int hashCode131 = (hashCode130 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.category0;
        int hashCode132 = (hashCode131 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.category1;
        int hashCode133 = (hashCode132 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.category2;
        int hashCode134 = (hashCode133 + (num25 == null ? 0 : num25.hashCode())) * 31;
        GroupsGroupFriendsDto groupsGroupFriendsDto = this.friends;
        int hashCode135 = (hashCode134 + (groupsGroupFriendsDto == null ? 0 : groupsGroupFriendsDto.hashCode())) * 31;
        String str14 = this.deactivatedMessage;
        int hashCode136 = (hashCode135 + (str14 == null ? 0 : str14.hashCode())) * 31;
        DeactivatedTypeDto deactivatedTypeDto = this.deactivatedType;
        int hashCode137 = (hashCode136 + (deactivatedTypeDto == null ? 0 : deactivatedTypeDto.hashCode())) * 31;
        String str15 = this.targArtistId;
        int hashCode138 = (hashCode137 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool28 = this.isGovernmentOrganization;
        int hashCode139 = (hashCode138 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.settingsTooltipsActive;
        int hashCode140 = (hashCode139 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isYclientsTooltipActive;
        int hashCode141 = (hashCode140 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        MarketCommunityRatingDto marketCommunityRatingDto = this.rating;
        int hashCode142 = (hashCode141 + (marketCommunityRatingDto == null ? 0 : marketCommunityRatingDto.hashCode())) * 31;
        GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = this.nameHistory;
        int hashCode143 = (hashCode142 + (groupsGroupNameHistoryDto == null ? 0 : groupsGroupNameHistoryDto.hashCode())) * 31;
        MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = this.serviceRating;
        int hashCode144 = (hashCode143 + (marketCommunityServiceRatingDto == null ? 0 : marketCommunityServiceRatingDto.hashCode())) * 31;
        GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = this.recommendedTipsWidget;
        int hashCode145 = (hashCode144 + (groupsRecommendedTipsWidgetDto == null ? 0 : groupsRecommendedTipsWidgetDto.hashCode())) * 31;
        String str16 = this.region;
        int hashCode146 = (hashCode145 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.subject;
        int hashCode147 = (hashCode146 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool31 = this.isSetTabOrder;
        int hashCode148 = (hashCode147 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isShowBusinessOnboarding;
        int hashCode149 = (hashCode148 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.businessCommunityTooltips;
        int hashCode150 = (hashCode149 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.repostsDisabled;
        int hashCode151 = (hashCode150 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.videoLivesStreamingBanned;
        int hashCode152 = (hashCode151 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        String str18 = this.category1Name;
        int hashCode153 = (hashCode152 + (str18 == null ? 0 : str18.hashCode())) * 31;
        GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = this.adsPostsInfo;
        int hashCode154 = (hashCode153 + (groupsAdsPostsInfoDto == null ? 0 : groupsAdsPostsInfoDto.hashCode())) * 31;
        String str19 = this.thematic;
        int hashCode155 = (hashCode154 + (str19 == null ? 0 : str19.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto = this.bannerAdsMainClient;
        int hashCode156 = (hashCode155 + (groupsBannerDto == null ? 0 : groupsBannerDto.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto2 = this.bannerAdsSettingMiniapp;
        int hashCode157 = (hashCode156 + (groupsBannerDto2 == null ? 0 : groupsBannerDto2.hashCode())) * 31;
        Boolean bool36 = this.isManualMarkedBusiness;
        int hashCode158 = (hashCode157 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        LeaveModeDto leaveModeDto = this.leaveMode;
        int hashCode159 = (hashCode158 + (leaveModeDto == null ? 0 : leaveModeDto.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto3 = this.bannerAdsMainMvk;
        int hashCode160 = (hashCode159 + (groupsBannerDto3 == null ? 0 : groupsBannerDto3.hashCode())) * 31;
        Boolean bool37 = this.isMediaWallEnabled;
        int hashCode161 = (hashCode160 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Boolean bool38 = this.isMonetizationAvailable;
        int hashCode162 = (hashCode161 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        VideoNotificationsStatusDto videoNotificationsStatusDto = this.videoNotificationsStatus;
        int hashCode163 = (hashCode162 + (videoNotificationsStatusDto == null ? 0 : videoNotificationsStatusDto.hashCode())) * 31;
        Boolean bool39 = this.isVideoSubscriptionHidden;
        int hashCode164 = (hashCode163 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.suggestSubscribe;
        int hashCode165 = (hashCode164 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        String str20 = this.suggestedCategoryName;
        int hashCode166 = (hashCode165 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool41 = this.isWorkGroup;
        int hashCode167 = (hashCode166 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = this.workGroupInfo;
        int hashCode168 = (hashCode167 + (groupsWorkGroupInfoDto == null ? 0 : groupsWorkGroupInfoDto.hashCode())) * 31;
        String str21 = this.url;
        int hashCode169 = (hashCode168 + (str21 == null ? 0 : str21.hashCode())) * 31;
        GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = this.membersPreview;
        int hashCode170 = (hashCode169 + (groupsGroupFullMembersPreviewDto == null ? 0 : groupsGroupFullMembersPreviewDto.hashCode())) * 31;
        GroupsStrikesInfoDto groupsStrikesInfoDto = this.strikesInfo;
        int hashCode171 = (hashCode170 + (groupsStrikesInfoDto == null ? 0 : groupsStrikesInfoDto.hashCode())) * 31;
        GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto = this.strikesRestrictions;
        int hashCode172 = (hashCode171 + (groupsStrikesRestrictionsDto == null ? 0 : groupsStrikesRestrictionsDto.hashCode())) * 31;
        Boolean bool42 = this.coOwnershipEnabled;
        int hashCode173 = (hashCode172 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        List<String> list3 = this.enabledFeatures;
        int hashCode174 = (hashCode173 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool43 = this.canEditScreenName;
        int hashCode175 = (hashCode174 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.canCreateEvent;
        int hashCode176 = (hashCode175 + (bool44 == null ? 0 : bool44.hashCode())) * 31;
        List<GroupsTabSettingsDto> list4 = this.tabs;
        int hashCode177 = (hashCode176 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num26 = this.unreadCount;
        int hashCode178 = (hashCode177 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.videosCount;
        int hashCode179 = (hashCode178 + (num27 == null ? 0 : num27.hashCode())) * 31;
        GroupsSimpleButtonDto groupsSimpleButtonDto = this.channelButton;
        int hashCode180 = (hashCode179 + (groupsSimpleButtonDto == null ? 0 : groupsSimpleButtonDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode181 = (hashCode180 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        List<ServiceBookingRepeatRecordDto> list5 = this.yclientsRepeatRecords;
        int hashCode182 = (hashCode181 + (list5 == null ? 0 : list5.hashCode())) * 31;
        GroupsChannelInfoDto groupsChannelInfoDto = this.channelInfo;
        int hashCode183 = (hashCode182 + (groupsChannelInfoDto == null ? 0 : groupsChannelInfoDto.hashCode())) * 31;
        GroupsChannelBlockDto groupsChannelBlockDto = this.channelBlock;
        int hashCode184 = (hashCode183 + (groupsChannelBlockDto == null ? 0 : groupsChannelBlockDto.hashCode())) * 31;
        Boolean bool45 = this.isEducational;
        int hashCode185 = (hashCode184 + (bool45 == null ? 0 : bool45.hashCode())) * 31;
        GroupsEventOrganizerDto groupsEventOrganizerDto = this.eventOrganizer;
        int hashCode186 = (hashCode185 + (groupsEventOrganizerDto == null ? 0 : groupsEventOrganizerDto.hashCode())) * 31;
        GroupsVideoChannelDataDto groupsVideoChannelDataDto = this.videoChannelData;
        int hashCode187 = (hashCode186 + (groupsVideoChannelDataDto == null ? 0 : groupsVideoChannelDataDto.hashCode())) * 31;
        Boolean bool46 = this.isTagsAvailable;
        int hashCode188 = (hashCode187 + (bool46 == null ? 0 : bool46.hashCode())) * 31;
        Boolean bool47 = this.isGroupDisplayed;
        int hashCode189 = (hashCode188 + (bool47 == null ? 0 : bool47.hashCode())) * 31;
        Boolean bool48 = this.isMarketEnabled;
        int hashCode190 = (hashCode189 + (bool48 == null ? 0 : bool48.hashCode())) * 31;
        GroupsContentSectionsDataDto groupsContentSectionsDataDto = this.contentSectionsData;
        int hashCode191 = (hashCode190 + (groupsContentSectionsDataDto == null ? 0 : groupsContentSectionsDataDto.hashCode())) * 31;
        String str22 = this.name;
        int hashCode192 = (hashCode191 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.screenName;
        int hashCode193 = (hashCode192 + (str23 == null ? 0 : str23.hashCode())) * 31;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        int hashCode194 = (hashCode193 + (groupsGroupIsClosedDto == null ? 0 : groupsGroupIsClosedDto.hashCode())) * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        int hashCode195 = (hashCode194 + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31;
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        int hashCode196 = (hashCode195 + (channelsChannelTypeDto == null ? 0 : channelsChannelTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.isAdmin;
        int hashCode197 = (hashCode196 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode198 = (hashCode197 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto24 = this.isMember;
        int hashCode199 = (hashCode198 + (baseBoolIntDto24 == null ? 0 : baseBoolIntDto24.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto25 = this.isAdvertiser;
        int hashCode200 = (hashCode199 + (baseBoolIntDto25 == null ? 0 : baseBoolIntDto25.hashCode())) * 31;
        Integer num28 = this.startDate;
        int hashCode201 = (hashCode200 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.finishDate;
        int hashCode202 = (hashCode201 + (num29 == null ? 0 : num29.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto26 = this.verified;
        int hashCode203 = (hashCode202 + (baseBoolIntDto26 == null ? 0 : baseBoolIntDto26.hashCode())) * 31;
        String str24 = this.deactivated;
        int hashCode204 = (hashCode203 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.photo50;
        int hashCode205 = (hashCode204 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.photo100;
        int hashCode206 = (hashCode205 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.photo200;
        int hashCode207 = (hashCode206 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.photo200Orig;
        int hashCode208 = (hashCode207 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.photo400;
        int hashCode209 = (hashCode208 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.photo400Orig;
        int hashCode210 = (hashCode209 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.photoMax;
        int hashCode211 = (hashCode210 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.photoMaxOrig;
        int hashCode212 = (hashCode211 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.photoBase;
        int hashCode213 = (hashCode212 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.estDate;
        int hashCode214 = (hashCode213 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.publicDateLabel;
        int hashCode215 = (hashCode214 + (str35 == null ? 0 : str35.hashCode())) * 31;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        int hashCode216 = (hashCode215 + (groupsPhotoSizeDto == null ? 0 : groupsPhotoSizeDto.hashCode())) * 31;
        GroupsAppButtonDto groupsAppButtonDto = this.appButton;
        int hashCode217 = (hashCode216 + (groupsAppButtonDto == null ? 0 : groupsAppButtonDto.hashCode())) * 31;
        List<GroupsAppButtonDto> list6 = this.appButtons;
        int hashCode218 = (hashCode217 + (list6 == null ? 0 : list6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto27 = this.isVideoLiveNotificationsBlocked;
        int hashCode219 = (hashCode218 + (baseBoolIntDto27 == null ? 0 : baseBoolIntDto27.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode220 = (hashCode219 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        Boolean bool49 = this.hadTorch;
        int hashCode221 = (hashCode220 + (bool49 == null ? 0 : bool49.hashCode())) * 31;
        String str36 = this.audioArtistId;
        int hashCode222 = (hashCode221 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Integer num30 = this.audioCuratorId;
        int hashCode223 = (hashCode222 + (num30 == null ? 0 : num30.hashCode())) * 31;
        List<BaseOwnerButtonDto> list7 = this.buttons;
        int hashCode224 = (hashCode223 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Boolean bool50 = this.isNftPhoto;
        int hashCode225 = (hashCode224 + (bool50 == null ? 0 : bool50.hashCode())) * 31;
        Boolean bool51 = this.isCached;
        int hashCode226 = (hashCode225 + (bool51 == null ? 0 : bool51.hashCode())) * 31;
        GroupsMarketInfoDto groupsMarketInfoDto = this.market;
        int hashCode227 = (hashCode226 + (groupsMarketInfoDto == null ? 0 : groupsMarketInfoDto.hashCode())) * 31;
        GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = this.marketServices;
        int hashCode228 = (hashCode227 + (groupsMarketServicesInfoDto == null ? 0 : groupsMarketServicesInfoDto.hashCode())) * 31;
        Boolean bool52 = this.hasMarketApp;
        int hashCode229 = (hashCode228 + (bool52 == null ? 0 : bool52.hashCode())) * 31;
        Boolean bool53 = this.usingVkpayMarketApp;
        int hashCode230 = (hashCode229 + (bool53 == null ? 0 : bool53.hashCode())) * 31;
        Boolean bool54 = this.isMarketCartEnabled;
        int hashCode231 = (hashCode230 + (bool54 == null ? 0 : bool54.hashCode())) * 31;
        GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto = this.extendedMarket;
        int hashCode232 = (hashCode231 + (groupsGroupExtendedMarketSectionsDto == null ? 0 : groupsGroupExtendedMarketSectionsDto.hashCode())) * 31;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto = this.marketShopConditionsState;
        int hashCode233 = (hashCode232 + (groupsMarketShopConditionsStateDto == null ? 0 : groupsMarketShopConditionsStateDto.hashCode())) * 31;
        Boolean bool55 = this.isMarketOnlineBookingSettingEnabled;
        int hashCode234 = (hashCode233 + (bool55 == null ? 0 : bool55.hashCode())) * 31;
        Boolean bool56 = this.isBindingToYclientsServiceEnabled;
        int hashCode235 = (hashCode234 + (bool56 == null ? 0 : bool56.hashCode())) * 31;
        Boolean bool57 = this.isMarketMarketLinkAttachmentEnabled;
        int hashCode236 = (hashCode235 + (bool57 == null ? 0 : bool57.hashCode())) * 31;
        Boolean bool58 = this.isMarketMessageToBcAttachmentEnabled;
        int hashCode237 = (hashCode236 + (bool58 == null ? 0 : bool58.hashCode())) * 31;
        Boolean bool59 = this.isMarketOnlineBookingActionButtonEnabled;
        int hashCode238 = (hashCode237 + (bool59 == null ? 0 : bool59.hashCode())) * 31;
        YoulaStatusDto youlaStatusDto = this.youlaStatus;
        int hashCode239 = (hashCode238 + (youlaStatusDto == null ? 0 : youlaStatusDto.hashCode())) * 31;
        Boolean bool60 = this.youlaUseWallpostRedirect;
        int hashCode240 = (hashCode239 + (bool60 == null ? 0 : bool60.hashCode())) * 31;
        String str37 = this.youlaWallpostRedirectMiniappUrl;
        int hashCode241 = (hashCode240 + (str37 == null ? 0 : str37.hashCode())) * 31;
        Integer num31 = this.classifiedsAntibaraholkaDesignVersion;
        int hashCode242 = (hashCode241 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Boolean bool61 = this.isYoulaPostingToWallAllowed;
        int hashCode243 = (hashCode242 + (bool61 == null ? 0 : bool61.hashCode())) * 31;
        YoulaPostingMethodDto youlaPostingMethodDto = this.youlaPostingMethod;
        return hashCode243 + (youlaPostingMethodDto != null ? youlaPostingMethodDto.hashCode() : 0);
    }

    public final UserId i() {
        return this.id;
    }

    public final String j() {
        return this.name;
    }

    public final String k() {
        return this.photoBase;
    }

    public final BaseBoolIntDto l() {
        return this.isAdmin;
    }

    public final String toString() {
        return "SearchGroupExtendedDto(trackCode=" + this.trackCode + ", id=" + this.id + ", memberStatus=" + this.memberStatus + ", isAdult=" + this.isAdult + ", isHiddenFromFeed=" + this.isHiddenFromFeed + ", isFavorite=" + this.isFavorite + ", isSubscribed=" + this.isSubscribed + ", city=" + this.city + ", country=" + this.country + ", description=" + this.description + ", wikiPage=" + this.wikiPage + ", membersCount=" + this.membersCount + ", membersCountText=" + this.membersCountText + ", requestsCount=" + this.requestsCount + ", musicAwards=" + this.musicAwards + ", videoLiveLevel=" + this.videoLiveLevel + ", videoLiveCount=" + this.videoLiveCount + ", clipsCount=" + this.clipsCount + ", counters=" + this.counters + ", cover=" + this.cover + ", videoCover=" + this.videoCover + ", videoLivesData=" + this.videoLivesData + ", photoAvgColor=" + this.photoAvgColor + ", inn=" + this.inn + ", ogrn=" + this.ogrn + ", kpp=" + this.kpp + ", hasLiveCover=" + this.hasLiveCover + ", hasStories=" + this.hasStories + ", canPost=" + this.canPost + ", canSuggest=" + this.canSuggest + ", canUploadStory=" + this.canUploadStory + ", canCallToCommunity=" + this.canCallToCommunity + ", canUploadDoc=" + this.canUploadDoc + ", canUploadVideo=" + this.canUploadVideo + ", canUploadVideoThumb=" + this.canUploadVideoThumb + ", canUploadClip=" + this.canUploadClip + ", canSeeAllPosts=" + this.canSeeAllPosts + ", canCreateTopic=" + this.canCreateTopic + ", activity=" + this.activity + ", fixedPost=" + this.fixedPost + ", hasPhoto=" + this.hasPhoto + ", cropPhoto=" + this.cropPhoto + ", status=" + this.status + ", statusAudio=" + this.statusAudio + ", mainAlbumId=" + this.mainAlbumId + ", links=" + this.links + ", contacts=" + this.contacts + ", wall=" + this.wall + ", site=" + this.site + ", isSiteDisplayed=" + this.isSiteDisplayed + ", mainSection=" + this.mainSection + ", primaryBlock=" + this.primaryBlock + ", trending=" + this.trending + ", canMessage=" + this.canMessage + ", isMessagesBlocked=" + this.isMessagesBlocked + ", canSendNotify=" + this.canSendNotify + ", onlineStatus=" + this.onlineStatus + ", invitedBy=" + this.invitedBy + ", ageLimits=" + this.ageLimits + ", ageMark=" + this.ageMark + ", banInfo=" + this.banInfo + ", actionButton=" + this.actionButton + ", authorId=" + this.authorId + ", phone=" + this.phone + ", isWidgetMessagesEnabled=" + this.isWidgetMessagesEnabled + ", vkpayCanTransfer=" + this.vkpayCanTransfer + ", vkpayReceiverId=" + this.vkpayReceiverId + ", hasGroupChannel=" + this.hasGroupChannel + ", groupChannel=" + this.groupChannel + ", communityChannelId=" + this.communityChannelId + ", addresses=" + this.addresses + ", messages=" + this.messages + ", isAue=" + this.isAue + ", prohibitedContentAdultMark=" + this.prohibitedContentAdultMark + ", isSubscribedPodcasts=" + this.isSubscribedPodcasts + ", canSubscribePodcasts=" + this.canSubscribePodcasts + ", isSubscribedStories=" + this.isSubscribedStories + ", canSubscribeStories=" + this.canSubscribeStories + ", canSubscribePosts=" + this.canSubscribePosts + ", liveCovers=" + this.liveCovers + ", vkAdminStatus=" + this.vkAdminStatus + ", menu=" + this.menu + ", warningNotification=" + this.warningNotification + ", createDate=" + this.createDate + ", donut=" + this.donut + ", vkTicket=" + this.vkTicket + ", donutBlock=" + this.donutBlock + ", donutCommunityManagement=" + this.donutCommunityManagement + ", donutPaymentInfo=" + this.donutPaymentInfo + ", canPostDonut=" + this.canPostDonut + ", canSeeMembers=" + this.canSeeMembers + ", msgPushAllowed=" + this.msgPushAllowed + ", msgNotificationsAllowed=" + this.msgNotificationsAllowed + ", chatsStatus=" + this.chatsStatus + ", canReport=" + this.canReport + ", businessRating=" + this.businessRating + ", isBusiness=" + this.isBusiness + ", isBusinessCategory=" + this.isBusinessCategory + ", isConfirmedBusiness=" + this.isConfirmedBusiness + ", isGoldenMarkedBusiness=" + this.isGoldenMarkedBusiness + ", trustMark=" + this.trustMark + ", microlanding=" + this.microlanding + ", tariffs=" + this.tariffs + ", verificationEndTime=" + this.verificationEndTime + ", canManage=" + this.canManage + ", disallowManageReason=" + this.disallowManageReason + ", disallowManageReasonMessage=" + this.disallowManageReasonMessage + ", hasSuggestions=" + this.hasSuggestions + ", showSuggestions=" + this.showSuggestions + ", canViewStats=" + this.canViewStats + ", canViewPostReachStats=" + this.canViewPostReachStats + ", storiesArchiveCount=" + this.storiesArchiveCount + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteAllowed=" + this.adsEasyPromoteAllowed + ", adsPostingRestrictedToday=" + this.adsPostingRestrictedToday + ", adsMarketAutopromoteAllowed=" + this.adsMarketAutopromoteAllowed + ", adsMarketEasyPromote=" + this.adsMarketEasyPromote + ", adsMarketAutopromoteReasonsNotAllowed=" + this.adsMarketAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteReasonsNotAllowed=" + this.adsMarketServicesAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteAllowed=" + this.adsMarketServicesAutopromoteAllowed + ", adsMarketServicesEasyPromote=" + this.adsMarketServicesEasyPromote + ", adsEasyPromoteReasonsNotAllowed=" + this.adsEasyPromoteReasonsNotAllowed + ", canSeeInviteLinks=" + this.canSeeInviteLinks + ", categoryV2=" + this.categoryV2 + ", subjectId=" + this.subjectId + ", publicCategory=" + this.publicCategory + ", publicSubcategory=" + this.publicSubcategory + ", installedAppsCount=" + this.installedAppsCount + ", like=" + this.like + ", loginConfirmationStatus=" + this.loginConfirmationStatus + ", hasUnseenStories=" + this.hasUnseenStories + ", category=" + this.category + ", category0=" + this.category0 + ", category1=" + this.category1 + ", category2=" + this.category2 + ", friends=" + this.friends + ", deactivatedMessage=" + this.deactivatedMessage + ", deactivatedType=" + this.deactivatedType + ", targArtistId=" + this.targArtistId + ", isGovernmentOrganization=" + this.isGovernmentOrganization + ", settingsTooltipsActive=" + this.settingsTooltipsActive + ", isYclientsTooltipActive=" + this.isYclientsTooltipActive + ", rating=" + this.rating + ", nameHistory=" + this.nameHistory + ", serviceRating=" + this.serviceRating + ", recommendedTipsWidget=" + this.recommendedTipsWidget + ", region=" + this.region + ", subject=" + this.subject + ", isSetTabOrder=" + this.isSetTabOrder + ", isShowBusinessOnboarding=" + this.isShowBusinessOnboarding + ", businessCommunityTooltips=" + this.businessCommunityTooltips + ", repostsDisabled=" + this.repostsDisabled + ", videoLivesStreamingBanned=" + this.videoLivesStreamingBanned + ", category1Name=" + this.category1Name + ", adsPostsInfo=" + this.adsPostsInfo + ", thematic=" + this.thematic + ", bannerAdsMainClient=" + this.bannerAdsMainClient + ", bannerAdsSettingMiniapp=" + this.bannerAdsSettingMiniapp + ", isManualMarkedBusiness=" + this.isManualMarkedBusiness + ", leaveMode=" + this.leaveMode + ", bannerAdsMainMvk=" + this.bannerAdsMainMvk + ", isMediaWallEnabled=" + this.isMediaWallEnabled + ", isMonetizationAvailable=" + this.isMonetizationAvailable + ", videoNotificationsStatus=" + this.videoNotificationsStatus + ", isVideoSubscriptionHidden=" + this.isVideoSubscriptionHidden + ", suggestSubscribe=" + this.suggestSubscribe + ", suggestedCategoryName=" + this.suggestedCategoryName + ", isWorkGroup=" + this.isWorkGroup + ", workGroupInfo=" + this.workGroupInfo + ", url=" + this.url + ", membersPreview=" + this.membersPreview + ", strikesInfo=" + this.strikesInfo + ", strikesRestrictions=" + this.strikesRestrictions + ", coOwnershipEnabled=" + this.coOwnershipEnabled + ", enabledFeatures=" + this.enabledFeatures + ", canEditScreenName=" + this.canEditScreenName + ", canCreateEvent=" + this.canCreateEvent + ", tabs=" + this.tabs + ", unreadCount=" + this.unreadCount + ", videosCount=" + this.videosCount + ", channelButton=" + this.channelButton + ", aPlusMark=" + this.aPlusMark + ", yclientsRepeatRecords=" + this.yclientsRepeatRecords + ", channelInfo=" + this.channelInfo + ", channelBlock=" + this.channelBlock + ", isEducational=" + this.isEducational + ", eventOrganizer=" + this.eventOrganizer + ", videoChannelData=" + this.videoChannelData + ", isTagsAvailable=" + this.isTagsAvailable + ", isGroupDisplayed=" + this.isGroupDisplayed + ", isMarketEnabled=" + this.isMarketEnabled + ", contentSectionsData=" + this.contentSectionsData + ", name=" + this.name + ", screenName=" + this.screenName + ", isClosed=" + this.isClosed + ", type=" + this.type + ", channelType=" + this.channelType + ", isAdmin=" + this.isAdmin + ", adminLevel=" + this.adminLevel + ", isMember=" + this.isMember + ", isAdvertiser=" + this.isAdvertiser + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate + ", verified=" + this.verified + ", deactivated=" + this.deactivated + ", photo50=" + this.photo50 + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", photo200Orig=" + this.photo200Orig + ", photo400=" + this.photo400 + ", photo400Orig=" + this.photo400Orig + ", photoMax=" + this.photoMax + ", photoMaxOrig=" + this.photoMaxOrig + ", photoBase=" + this.photoBase + ", estDate=" + this.estDate + ", publicDateLabel=" + this.publicDateLabel + ", photoMaxSize=" + this.photoMaxSize + ", appButton=" + this.appButton + ", appButtons=" + this.appButtons + ", isVideoLiveNotificationsBlocked=" + this.isVideoLiveNotificationsBlocked + ", videoLive=" + this.videoLive + ", hadTorch=" + this.hadTorch + ", audioArtistId=" + this.audioArtistId + ", audioCuratorId=" + this.audioCuratorId + ", buttons=" + this.buttons + ", isNftPhoto=" + this.isNftPhoto + ", isCached=" + this.isCached + ", market=" + this.market + ", marketServices=" + this.marketServices + ", hasMarketApp=" + this.hasMarketApp + ", usingVkpayMarketApp=" + this.usingVkpayMarketApp + ", isMarketCartEnabled=" + this.isMarketCartEnabled + ", extendedMarket=" + this.extendedMarket + ", marketShopConditionsState=" + this.marketShopConditionsState + ", isMarketOnlineBookingSettingEnabled=" + this.isMarketOnlineBookingSettingEnabled + ", isBindingToYclientsServiceEnabled=" + this.isBindingToYclientsServiceEnabled + ", isMarketMarketLinkAttachmentEnabled=" + this.isMarketMarketLinkAttachmentEnabled + ", isMarketMessageToBcAttachmentEnabled=" + this.isMarketMessageToBcAttachmentEnabled + ", isMarketOnlineBookingActionButtonEnabled=" + this.isMarketOnlineBookingActionButtonEnabled + ", youlaStatus=" + this.youlaStatus + ", youlaUseWallpostRedirect=" + this.youlaUseWallpostRedirect + ", youlaWallpostRedirectMiniappUrl=" + this.youlaWallpostRedirectMiniappUrl + ", classifiedsAntibaraholkaDesignVersion=" + this.classifiedsAntibaraholkaDesignVersion + ", isYoulaPostingToWallAllowed=" + this.isYoulaPostingToWallAllowed + ", youlaPostingMethod=" + this.youlaPostingMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.id, i);
        parcel.writeParcelable(this.memberStatus, i);
        parcel.writeParcelable(this.isAdult, i);
        parcel.writeParcelable(this.isHiddenFromFeed, i);
        parcel.writeParcelable(this.isFavorite, i);
        parcel.writeParcelable(this.isSubscribed, i);
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        parcel.writeString(this.description);
        parcel.writeString(this.wikiPage);
        Integer num = this.membersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.membersCountText);
        Integer num2 = this.requestsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.musicAwards, i);
        Integer num3 = this.videoLiveLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.videoLiveCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.clipsCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeParcelable(this.counters, i);
        parcel.writeParcelable(this.cover, i);
        parcel.writeParcelable(this.videoCover, i);
        parcel.writeParcelable(this.videoLivesData, i);
        parcel.writeString(this.photoAvgColor);
        parcel.writeString(this.inn);
        parcel.writeString(this.ogrn);
        parcel.writeString(this.kpp);
        Boolean bool = this.hasLiveCover;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasStories;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.canPost, i);
        parcel.writeParcelable(this.canSuggest, i);
        parcel.writeParcelable(this.canUploadStory, i);
        Boolean bool3 = this.canCallToCommunity;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.canUploadDoc, i);
        parcel.writeParcelable(this.canUploadVideo, i);
        parcel.writeParcelable(this.canUploadVideoThumb, i);
        parcel.writeParcelable(this.canUploadClip, i);
        parcel.writeParcelable(this.canSeeAllPosts, i);
        parcel.writeParcelable(this.canCreateTopic, i);
        parcel.writeString(this.activity);
        Integer num6 = this.fixedPost;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.hasPhoto, i);
        parcel.writeParcelable(this.cropPhoto, i);
        parcel.writeString(this.status);
        parcel.writeParcelable(this.statusAudio, i);
        Integer num7 = this.mainAlbumId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        List<GroupsLinksItemDto> list = this.links;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsContactsItemDto> list2 = this.contacts;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        WallDto wallDto = this.wall;
        if (wallDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.site);
        Boolean bool4 = this.isSiteDisplayed;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.mainSection, i);
        parcel.writeParcelable(this.primaryBlock, i);
        parcel.writeParcelable(this.trending, i);
        parcel.writeParcelable(this.canMessage, i);
        parcel.writeParcelable(this.isMessagesBlocked, i);
        parcel.writeParcelable(this.canSendNotify, i);
        parcel.writeParcelable(this.onlineStatus, i);
        Integer num8 = this.invitedBy;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeParcelable(this.ageLimits, i);
        parcel.writeParcelable(this.ageMark, i);
        parcel.writeParcelable(this.banInfo, i);
        parcel.writeParcelable(this.actionButton, i);
        Integer num9 = this.authorId;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeString(this.phone);
        Boolean bool5 = this.isWidgetMessagesEnabled;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.vkpayCanTransfer;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Integer num10 = this.vkpayReceiverId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Boolean bool7 = this.hasGroupChannel;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeValue(this.groupChannel);
        Integer num11 = this.communityChannelId;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        parcel.writeParcelable(this.addresses, i);
        Boolean bool8 = this.messages;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.isAue;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.prohibitedContentAdultMark;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.isSubscribedPodcasts;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.canSubscribePodcasts;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        Boolean bool13 = this.isSubscribedStories;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Boolean bool14 = this.canSubscribeStories;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.canSubscribePosts;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        parcel.writeParcelable(this.liveCovers, i);
        parcel.writeParcelable(this.vkAdminStatus, i);
        parcel.writeParcelable(this.menu, i);
        parcel.writeParcelable(this.warningNotification, i);
        Integer num12 = this.createDate;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeParcelable(this.donut, i);
        parcel.writeParcelable(this.vkTicket, i);
        parcel.writeParcelable(this.donutBlock, i);
        parcel.writeParcelable(this.donutCommunityManagement, i);
        parcel.writeParcelable(this.donutPaymentInfo, i);
        Integer num13 = this.canPostDonut;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        Boolean bool16 = this.canSeeMembers;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        parcel.writeParcelable(this.msgPushAllowed, i);
        parcel.writeParcelable(this.msgNotificationsAllowed, i);
        parcel.writeParcelable(this.chatsStatus, i);
        parcel.writeParcelable(this.canReport, i);
        Float f3 = this.businessRating;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        parcel.writeString(this.isBusiness);
        Boolean bool17 = this.isBusinessCategory;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.isConfirmedBusiness;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        Boolean bool19 = this.isGoldenMarkedBusiness;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        TrustMarkDto trustMarkDto = this.trustMark;
        if (trustMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trustMarkDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.microlanding, i);
        parcel.writeParcelable(this.tariffs, i);
        Integer num14 = this.verificationEndTime;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        Boolean bool20 = this.canManage;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        DisallowManageReasonDto disallowManageReasonDto = this.disallowManageReason;
        if (disallowManageReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            disallowManageReasonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.disallowManageReasonMessage);
        parcel.writeParcelable(this.hasSuggestions, i);
        parcel.writeParcelable(this.showSuggestions, i);
        Boolean bool21 = this.canViewStats;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        Boolean bool22 = this.canViewPostReachStats;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        Integer num15 = this.storiesArchiveCount;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        parcel.writeParcelable(this.adsEasyPromote, i);
        Boolean bool23 = this.adsEasyPromoteAllowed;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        Integer num16 = this.adsPostingRestrictedToday;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        Boolean bool24 = this.adsMarketAutopromoteAllowed;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool24);
        }
        parcel.writeValue(this.adsMarketEasyPromote);
        parcel.writeValue(this.adsMarketAutopromoteReasonsNotAllowed);
        parcel.writeValue(this.adsMarketServicesAutopromoteReasonsNotAllowed);
        Boolean bool25 = this.adsMarketServicesAutopromoteAllowed;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool25);
        }
        parcel.writeValue(this.adsMarketServicesEasyPromote);
        parcel.writeValue(this.adsEasyPromoteReasonsNotAllowed);
        Boolean bool26 = this.canSeeInviteLinks;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool26);
        }
        Integer num17 = this.categoryV2;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        Integer num18 = this.subjectId;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
        Integer num19 = this.publicCategory;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num19);
        }
        Integer num20 = this.publicSubcategory;
        if (num20 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num20);
        }
        Integer num21 = this.installedAppsCount;
        if (num21 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num21);
        }
        parcel.writeParcelable(this.like, i);
        parcel.writeParcelable(this.loginConfirmationStatus, i);
        Boolean bool27 = this.hasUnseenStories;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool27);
        }
        Integer num22 = this.category;
        if (num22 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num22);
        }
        Integer num23 = this.category0;
        if (num23 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num23);
        }
        Integer num24 = this.category1;
        if (num24 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num24);
        }
        Integer num25 = this.category2;
        if (num25 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num25);
        }
        parcel.writeParcelable(this.friends, i);
        parcel.writeString(this.deactivatedMessage);
        DeactivatedTypeDto deactivatedTypeDto = this.deactivatedType;
        if (deactivatedTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deactivatedTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.targArtistId);
        Boolean bool28 = this.isGovernmentOrganization;
        if (bool28 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool28);
        }
        Boolean bool29 = this.settingsTooltipsActive;
        if (bool29 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool29);
        }
        Boolean bool30 = this.isYclientsTooltipActive;
        if (bool30 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool30);
        }
        parcel.writeParcelable(this.rating, i);
        parcel.writeParcelable(this.nameHistory, i);
        parcel.writeParcelable(this.serviceRating, i);
        parcel.writeParcelable(this.recommendedTipsWidget, i);
        parcel.writeString(this.region);
        parcel.writeString(this.subject);
        Boolean bool31 = this.isSetTabOrder;
        if (bool31 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool31);
        }
        Boolean bool32 = this.isShowBusinessOnboarding;
        if (bool32 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool32);
        }
        Boolean bool33 = this.businessCommunityTooltips;
        if (bool33 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool33);
        }
        Boolean bool34 = this.repostsDisabled;
        if (bool34 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool34);
        }
        Boolean bool35 = this.videoLivesStreamingBanned;
        if (bool35 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool35);
        }
        parcel.writeString(this.category1Name);
        parcel.writeParcelable(this.adsPostsInfo, i);
        parcel.writeString(this.thematic);
        parcel.writeParcelable(this.bannerAdsMainClient, i);
        parcel.writeParcelable(this.bannerAdsSettingMiniapp, i);
        Boolean bool36 = this.isManualMarkedBusiness;
        if (bool36 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool36);
        }
        LeaveModeDto leaveModeDto = this.leaveMode;
        if (leaveModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leaveModeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.bannerAdsMainMvk, i);
        Boolean bool37 = this.isMediaWallEnabled;
        if (bool37 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool37);
        }
        Boolean bool38 = this.isMonetizationAvailable;
        if (bool38 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool38);
        }
        VideoNotificationsStatusDto videoNotificationsStatusDto = this.videoNotificationsStatus;
        if (videoNotificationsStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoNotificationsStatusDto.writeToParcel(parcel, i);
        }
        Boolean bool39 = this.isVideoSubscriptionHidden;
        if (bool39 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool39);
        }
        Boolean bool40 = this.suggestSubscribe;
        if (bool40 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool40);
        }
        parcel.writeString(this.suggestedCategoryName);
        Boolean bool41 = this.isWorkGroup;
        if (bool41 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool41);
        }
        parcel.writeParcelable(this.workGroupInfo, i);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.membersPreview, i);
        parcel.writeParcelable(this.strikesInfo, i);
        parcel.writeParcelable(this.strikesRestrictions, i);
        Boolean bool42 = this.coOwnershipEnabled;
        if (bool42 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool42);
        }
        parcel.writeStringList(this.enabledFeatures);
        Boolean bool43 = this.canEditScreenName;
        if (bool43 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool43);
        }
        Boolean bool44 = this.canCreateEvent;
        if (bool44 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool44);
        }
        List<GroupsTabSettingsDto> list3 = this.tabs;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        Integer num26 = this.unreadCount;
        if (num26 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num26);
        }
        Integer num27 = this.videosCount;
        if (num27 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num27);
        }
        parcel.writeParcelable(this.channelButton, i);
        parcel.writeParcelable(this.aPlusMark, i);
        List<ServiceBookingRepeatRecordDto> list4 = this.yclientsRepeatRecords;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        parcel.writeParcelable(this.channelInfo, i);
        parcel.writeParcelable(this.channelBlock, i);
        Boolean bool45 = this.isEducational;
        if (bool45 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool45);
        }
        parcel.writeParcelable(this.eventOrganizer, i);
        parcel.writeParcelable(this.videoChannelData, i);
        Boolean bool46 = this.isTagsAvailable;
        if (bool46 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool46);
        }
        Boolean bool47 = this.isGroupDisplayed;
        if (bool47 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool47);
        }
        Boolean bool48 = this.isMarketEnabled;
        if (bool48 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool48);
        }
        parcel.writeParcelable(this.contentSectionsData, i);
        parcel.writeString(this.name);
        parcel.writeString(this.screenName);
        parcel.writeParcelable(this.isClosed, i);
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.channelType, i);
        parcel.writeParcelable(this.isAdmin, i);
        parcel.writeParcelable(this.adminLevel, i);
        parcel.writeParcelable(this.isMember, i);
        parcel.writeParcelable(this.isAdvertiser, i);
        Integer num28 = this.startDate;
        if (num28 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num28);
        }
        Integer num29 = this.finishDate;
        if (num29 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num29);
        }
        parcel.writeParcelable(this.verified, i);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo200Orig);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photo400Orig);
        parcel.writeString(this.photoMax);
        parcel.writeString(this.photoMaxOrig);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.estDate);
        parcel.writeString(this.publicDateLabel);
        parcel.writeParcelable(this.photoMaxSize, i);
        parcel.writeParcelable(this.appButton, i);
        List<GroupsAppButtonDto> list5 = this.appButtons;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        parcel.writeParcelable(this.isVideoLiveNotificationsBlocked, i);
        parcel.writeParcelable(this.videoLive, i);
        Boolean bool49 = this.hadTorch;
        if (bool49 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool49);
        }
        parcel.writeString(this.audioArtistId);
        Integer num30 = this.audioCuratorId;
        if (num30 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num30);
        }
        List<BaseOwnerButtonDto> list6 = this.buttons;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        Boolean bool50 = this.isNftPhoto;
        if (bool50 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool50);
        }
        Boolean bool51 = this.isCached;
        if (bool51 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool51);
        }
        parcel.writeParcelable(this.market, i);
        parcel.writeParcelable(this.marketServices, i);
        Boolean bool52 = this.hasMarketApp;
        if (bool52 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool52);
        }
        Boolean bool53 = this.usingVkpayMarketApp;
        if (bool53 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool53);
        }
        Boolean bool54 = this.isMarketCartEnabled;
        if (bool54 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool54);
        }
        parcel.writeParcelable(this.extendedMarket, i);
        parcel.writeParcelable(this.marketShopConditionsState, i);
        Boolean bool55 = this.isMarketOnlineBookingSettingEnabled;
        if (bool55 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool55);
        }
        Boolean bool56 = this.isBindingToYclientsServiceEnabled;
        if (bool56 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool56);
        }
        Boolean bool57 = this.isMarketMarketLinkAttachmentEnabled;
        if (bool57 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool57);
        }
        Boolean bool58 = this.isMarketMessageToBcAttachmentEnabled;
        if (bool58 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool58);
        }
        Boolean bool59 = this.isMarketOnlineBookingActionButtonEnabled;
        if (bool59 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool59);
        }
        YoulaStatusDto youlaStatusDto = this.youlaStatus;
        if (youlaStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            youlaStatusDto.writeToParcel(parcel, i);
        }
        Boolean bool60 = this.youlaUseWallpostRedirect;
        if (bool60 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool60);
        }
        parcel.writeString(this.youlaWallpostRedirectMiniappUrl);
        Integer num31 = this.classifiedsAntibaraholkaDesignVersion;
        if (num31 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num31);
        }
        Boolean bool61 = this.isYoulaPostingToWallAllowed;
        if (bool61 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool61);
        }
        YoulaPostingMethodDto youlaPostingMethodDto = this.youlaPostingMethod;
        if (youlaPostingMethodDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            youlaPostingMethodDto.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SearchGroupExtendedDto(String str, UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str2, String str3, Integer num, String str4, Integer num2, AudioMusicAwardsDto audioMusicAwardsDto, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseOwnerCoverDto baseOwnerCoverDto2, GroupsVideoLivesDataDto groupsVideoLivesDataDto, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool3, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str9, Integer num6, BaseBoolIntDto baseBoolIntDto14, BaseCropPhotoDto baseCropPhotoDto, String str10, AudioAudioDto audioAudioDto, Integer num7, List list, List list2, WallDto wallDto, String str11, Boolean bool4, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, GroupsActionButtonDto groupsActionButtonDto, Integer num9, String str12, Boolean bool5, Boolean bool6, Integer num10, Boolean bool7, Object obj, Integer num11, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, GroupsLiveCoversDto groupsLiveCoversDto, GroupsVkAdminStatusDto groupsVkAdminStatusDto, GroupsMenuDto groupsMenuDto, GroupsWarningNotificationDto groupsWarningNotificationDto, Integer num12, GroupsGroupDonutDto groupsGroupDonutDto, GroupsGroupVkTicketDto groupsGroupVkTicketDto, GroupsGroupDonutBlockDto groupsGroupDonutBlockDto, GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto, GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto, Integer num13, Boolean bool16, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, GroupsChatsStatusDto groupsChatsStatusDto, BaseBoolIntDto baseBoolIntDto21, Float f, String str13, Boolean bool17, Boolean bool18, Boolean bool19, TrustMarkDto trustMarkDto, GroupsMicrolandingDto groupsMicrolandingDto, GroupsTariffsDto groupsTariffsDto, Integer num14, Boolean bool20, DisallowManageReasonDto disallowManageReasonDto, String str14, BaseBoolIntDto baseBoolIntDto22, GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto, Boolean bool21, Boolean bool22, Integer num15, GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto, Boolean bool23, Integer num16, Boolean bool24, Object obj2, Object obj3, Object obj4, Boolean bool25, Object obj5, Object obj6, Boolean bool26, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, GroupsGroupLikeItemDto groupsGroupLikeItemDto, GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto, Boolean bool27, Integer num22, Integer num23, Integer num24, Integer num25, GroupsGroupFriendsDto groupsGroupFriendsDto, String str15, DeactivatedTypeDto deactivatedTypeDto, String str16, Boolean bool28, Boolean bool29, Boolean bool30, MarketCommunityRatingDto marketCommunityRatingDto, GroupsGroupNameHistoryDto groupsGroupNameHistoryDto, MarketCommunityServiceRatingDto marketCommunityServiceRatingDto, GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto, String str17, String str18, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str19, GroupsAdsPostsInfoDto groupsAdsPostsInfoDto, String str20, GroupsBannerDto groupsBannerDto, GroupsBannerDto groupsBannerDto2, Boolean bool36, LeaveModeDto leaveModeDto, GroupsBannerDto groupsBannerDto3, Boolean bool37, Boolean bool38, VideoNotificationsStatusDto videoNotificationsStatusDto, Boolean bool39, Boolean bool40, String str21, Boolean bool41, GroupsWorkGroupInfoDto groupsWorkGroupInfoDto, String str22, GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto, GroupsStrikesInfoDto groupsStrikesInfoDto, GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto, Boolean bool42, List list3, Boolean bool43, Boolean bool44, List list4, Integer num26, Integer num27, GroupsSimpleButtonDto groupsSimpleButtonDto, BaseAPlusMarkDto baseAPlusMarkDto, List list5, GroupsChannelInfoDto groupsChannelInfoDto, GroupsChannelBlockDto groupsChannelBlockDto, Boolean bool45, GroupsEventOrganizerDto groupsEventOrganizerDto, GroupsVideoChannelDataDto groupsVideoChannelDataDto, Boolean bool46, Boolean bool47, Boolean bool48, GroupsContentSectionsDataDto groupsContentSectionsDataDto, String str23, String str24, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto23, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, Integer num28, Integer num29, BaseBoolIntDto baseBoolIntDto26, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List list6, BaseBoolIntDto baseBoolIntDto27, VideoLiveInfoDto videoLiveInfoDto, Boolean bool49, String str37, Integer num30, List list7, Boolean bool50, Boolean bool51, GroupsMarketInfoDto groupsMarketInfoDto, GroupsMarketServicesInfoDto groupsMarketServicesInfoDto, Boolean bool52, Boolean bool53, Boolean bool54, GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto, GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, YoulaStatusDto youlaStatusDto, Boolean bool60, String str38, Integer num31, Boolean bool61, YoulaPostingMethodDto youlaPostingMethodDto, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zcl zclVar) {
        this(str, userId, r186, r10, r11, r12, r13, r14, r15, r9, r187, r188, r189, r190, r8, r17, r19, r21, r23, r25, r27, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r191, r40, r41, r42, r43, r44, r45, r46, r192, r193, r194, r195, r196, r197, r198, r199, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r1, r63, r64, r65, r66, r67, r68, r69, r200, r201, r202, r203, r204, r205, r206, r207, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r2, r86, r87, r88, r89, r90, r91, r92, r208, r209, r210, r211, r212, r213, r214, r215, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r3, r109, r110, r111, r112, r113, r114, r115, r216, r217, r218, r219, r220, r221, r222, r223, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r4, r132, r133, r134, r135, r136, r137, r138, r224, r225, r226, r227, r228, r229, r230, r0, (i6 & 32768) != 0 ? null : bool43, (i6 & 65536) != 0 ? null : bool44, (i6 & 131072) != 0 ? null : list4, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num26, (i6 & 524288) != 0 ? null : num27, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : groupsSimpleButtonDto, (i6 & 2097152) != 0 ? null : baseAPlusMarkDto, (i6 & 4194304) != 0 ? null : list5, (i6 & 8388608) != 0 ? null : groupsChannelInfoDto, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : groupsChannelBlockDto, (i6 & 33554432) != 0 ? null : bool45, (i6 & 67108864) != 0 ? null : groupsEventOrganizerDto, (i6 & 134217728) != 0 ? null : groupsVideoChannelDataDto, (i6 & 268435456) != 0 ? null : bool46, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool47, (i6 & 1073741824) != 0 ? null : bool48, (i6 & Integer.MIN_VALUE) != 0 ? null : groupsContentSectionsDataDto, (i7 & 1) != 0 ? null : str23, (i7 & 2) != 0 ? null : str24, (i7 & 4) != 0 ? null : groupsGroupIsClosedDto, (i7 & 8) != 0 ? null : groupsGroupTypeDto, (i7 & 16) != 0 ? null : channelsChannelTypeDto, (i7 & 32) != 0 ? null : baseBoolIntDto23, (i7 & 64) != 0 ? null : groupsGroupAdminLevelDto, (i7 & 128) != 0 ? null : baseBoolIntDto24, (i7 & 256) != 0 ? null : baseBoolIntDto25, (i7 & 512) != 0 ? null : num28, (i7 & 1024) != 0 ? null : num29, (i7 & 2048) != 0 ? null : baseBoolIntDto26, (i7 & 4096) != 0 ? null : str25, (i7 & 8192) != 0 ? null : str26, (i7 & 16384) != 0 ? null : str27, (i7 & 32768) != 0 ? null : str28, (i7 & 65536) != 0 ? null : str29, (i7 & 131072) != 0 ? null : str30, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str31, (i7 & 524288) != 0 ? null : str32, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str33, (i7 & 2097152) != 0 ? null : str34, (i7 & 4194304) != 0 ? null : str35, (i7 & 8388608) != 0 ? null : str36, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : groupsPhotoSizeDto, (i7 & 33554432) != 0 ? null : groupsAppButtonDto, (i7 & 67108864) != 0 ? null : list6, (i7 & 134217728) != 0 ? null : baseBoolIntDto27, (i7 & 268435456) != 0 ? null : videoLiveInfoDto, (i7 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool49, (i7 & 1073741824) != 0 ? null : str37, (i7 & Integer.MIN_VALUE) != 0 ? null : num30, (i8 & 1) != 0 ? null : list7, (i8 & 2) != 0 ? null : bool50, (i8 & 4) != 0 ? null : bool51, (i8 & 8) != 0 ? null : groupsMarketInfoDto, (i8 & 16) != 0 ? null : groupsMarketServicesInfoDto, (i8 & 32) != 0 ? null : bool52, (i8 & 64) != 0 ? null : bool53, (i8 & 128) != 0 ? null : bool54, (i8 & 256) != 0 ? null : groupsGroupExtendedMarketSectionsDto, (i8 & 512) != 0 ? null : groupsMarketShopConditionsStateDto, (i8 & 1024) != 0 ? null : bool55, (i8 & 2048) != 0 ? null : bool56, (i8 & 4096) != 0 ? null : bool57, (i8 & 8192) != 0 ? null : bool58, (i8 & 16384) != 0 ? null : bool59, (i8 & 32768) != 0 ? null : youlaStatusDto, (i8 & 65536) != 0 ? null : bool60, (i8 & 131072) != 0 ? null : str38, (i8 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num31, (i8 & 524288) != 0 ? null : bool61, (i8 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : youlaPostingMethodDto);
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto2 = (i & 4) != 0 ? null : groupsGroupFullMemberStatusDto;
        BaseBoolIntDto baseBoolIntDto28 = (i & 8) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto29 = (i & 16) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto30 = (i & 32) != 0 ? null : baseBoolIntDto3;
        BaseBoolIntDto baseBoolIntDto31 = (i & 64) != 0 ? null : baseBoolIntDto4;
        BaseObjectDto baseObjectDto2 = (i & 128) != 0 ? null : baseObjectDto;
        BaseCountryDto baseCountryDto2 = (i & 256) != 0 ? null : baseCountryDto;
        String str39 = (i & 512) != 0 ? null : str2;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto3 = groupsGroupFullMemberStatusDto2;
        String str40 = (i & 1024) != 0 ? null : str3;
        Integer num32 = (i & 2048) != 0 ? null : num;
        String str41 = (i & 4096) != 0 ? null : str4;
        Integer num33 = (i & 8192) != 0 ? null : num2;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i & 16384) != 0 ? null : audioMusicAwardsDto;
        Integer num34 = (i & 32768) != 0 ? null : num3;
        Integer num35 = (i & 65536) != 0 ? null : num4;
        Integer num36 = (i & 131072) != 0 ? null : num5;
        GroupsCountersGroupDto groupsCountersGroupDto2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : groupsCountersGroupDto;
        BaseOwnerCoverDto baseOwnerCoverDto3 = (i & 524288) != 0 ? null : baseOwnerCoverDto;
        BaseOwnerCoverDto baseOwnerCoverDto4 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseOwnerCoverDto2;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto2 = (i & 2097152) != 0 ? null : groupsVideoLivesDataDto;
        String str42 = (i & 4194304) != 0 ? null : str5;
        String str43 = (i & 8388608) != 0 ? null : str6;
        String str44 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str7;
        String str45 = (i & 33554432) != 0 ? null : str8;
        Boolean bool62 = (i & 67108864) != 0 ? null : bool;
        Boolean bool63 = (i & 134217728) != 0 ? null : bool2;
        BaseBoolIntDto baseBoolIntDto32 = (i & 268435456) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto33 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto34 = (i & 1073741824) != 0 ? null : baseBoolIntDto7;
        Boolean bool64 = (i & Integer.MIN_VALUE) != 0 ? null : bool3;
        BaseBoolIntDto baseBoolIntDto35 = (i2 & 1) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto36 = (i2 & 2) != 0 ? null : baseBoolIntDto9;
        BaseBoolIntDto baseBoolIntDto37 = (i2 & 4) != 0 ? null : baseBoolIntDto10;
        BaseBoolIntDto baseBoolIntDto38 = (i2 & 8) != 0 ? null : baseBoolIntDto11;
        BaseBoolIntDto baseBoolIntDto39 = (i2 & 16) != 0 ? null : baseBoolIntDto12;
        BaseBoolIntDto baseBoolIntDto40 = (i2 & 32) != 0 ? null : baseBoolIntDto13;
        String str46 = (i2 & 64) != 0 ? null : str9;
        Boolean bool65 = bool64;
        Integer num37 = (i2 & 128) != 0 ? null : num6;
        BaseBoolIntDto baseBoolIntDto41 = (i2 & 256) != 0 ? null : baseBoolIntDto14;
        BaseCropPhotoDto baseCropPhotoDto2 = (i2 & 512) != 0 ? null : baseCropPhotoDto;
        String str47 = (i2 & 1024) != 0 ? null : str10;
        AudioAudioDto audioAudioDto2 = (i2 & 2048) != 0 ? null : audioAudioDto;
        Integer num38 = (i2 & 4096) != 0 ? null : num7;
        List list8 = (i2 & 8192) != 0 ? null : list;
        List list9 = (i2 & 16384) != 0 ? null : list2;
        WallDto wallDto2 = (i2 & 32768) != 0 ? null : wallDto;
        String str48 = (i2 & 65536) != 0 ? null : str11;
        Boolean bool66 = (i2 & 131072) != 0 ? null : bool4;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : groupsGroupFullSectionDto;
        GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto2 = (i2 & 524288) != 0 ? null : groupsPrimaryBlockSettingsDto;
        BaseBoolIntDto baseBoolIntDto42 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto43 = (i2 & 2097152) != 0 ? null : baseBoolIntDto16;
        BaseBoolIntDto baseBoolIntDto44 = (i2 & 4194304) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto45 = (i2 & 8388608) != 0 ? null : baseBoolIntDto18;
        GroupsOnlineStatusDto groupsOnlineStatusDto2 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : groupsOnlineStatusDto;
        Integer num39 = (i2 & 33554432) != 0 ? null : num8;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto2 = (i2 & 67108864) != 0 ? null : groupsGroupFullAgeLimitsDto;
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto2 = (i2 & 134217728) != 0 ? null : groupsGroupFullAgeMarkDto;
        GroupsGroupBanInfoDto groupsGroupBanInfoDto2 = (i2 & 268435456) != 0 ? null : groupsGroupBanInfoDto;
        GroupsActionButtonDto groupsActionButtonDto2 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : groupsActionButtonDto;
        Integer num40 = (i2 & 1073741824) != 0 ? null : num9;
        String str49 = (i2 & Integer.MIN_VALUE) != 0 ? null : str12;
        Boolean bool67 = (i3 & 1) != 0 ? null : bool5;
        Boolean bool68 = (i3 & 2) != 0 ? null : bool6;
        Integer num41 = (i3 & 4) != 0 ? null : num10;
        Boolean bool69 = (i3 & 8) != 0 ? null : bool7;
        Object obj7 = (i3 & 16) != 0 ? null : obj;
        Integer num42 = (i3 & 32) != 0 ? null : num11;
        GroupsAddressesInfoDto groupsAddressesInfoDto2 = (i3 & 64) != 0 ? null : groupsAddressesInfoDto;
        List list10 = list9;
        Boolean bool70 = (i3 & 128) != 0 ? null : bool8;
        Boolean bool71 = (i3 & 256) != 0 ? null : bool9;
        Boolean bool72 = (i3 & 512) != 0 ? null : bool10;
        Boolean bool73 = (i3 & 1024) != 0 ? null : bool11;
        Boolean bool74 = (i3 & 2048) != 0 ? null : bool12;
        Boolean bool75 = (i3 & 4096) != 0 ? null : bool13;
        Boolean bool76 = (i3 & 8192) != 0 ? null : bool14;
        Boolean bool77 = (i3 & 16384) != 0 ? null : bool15;
        GroupsLiveCoversDto groupsLiveCoversDto2 = (i3 & 32768) != 0 ? null : groupsLiveCoversDto;
        GroupsVkAdminStatusDto groupsVkAdminStatusDto2 = (i3 & 65536) != 0 ? null : groupsVkAdminStatusDto;
        GroupsMenuDto groupsMenuDto2 = (i3 & 131072) != 0 ? null : groupsMenuDto;
        GroupsWarningNotificationDto groupsWarningNotificationDto2 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : groupsWarningNotificationDto;
        Integer num43 = (i3 & 524288) != 0 ? null : num12;
        GroupsGroupDonutDto groupsGroupDonutDto2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : groupsGroupDonutDto;
        GroupsGroupVkTicketDto groupsGroupVkTicketDto2 = (i3 & 2097152) != 0 ? null : groupsGroupVkTicketDto;
        GroupsGroupDonutBlockDto groupsGroupDonutBlockDto2 = (i3 & 4194304) != 0 ? null : groupsGroupDonutBlockDto;
        GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto2 = (i3 & 8388608) != 0 ? null : groupsDonutCommunityManagementDto;
        GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto2 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : groupsGroupDonutPaymentInfoDto;
        Integer num44 = (i3 & 33554432) != 0 ? null : num13;
        Boolean bool78 = (i3 & 67108864) != 0 ? null : bool16;
        BaseBoolIntDto baseBoolIntDto46 = (i3 & 134217728) != 0 ? null : baseBoolIntDto19;
        BaseBoolIntDto baseBoolIntDto47 = (i3 & 268435456) != 0 ? null : baseBoolIntDto20;
        GroupsChatsStatusDto groupsChatsStatusDto2 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : groupsChatsStatusDto;
        BaseBoolIntDto baseBoolIntDto48 = (i3 & 1073741824) != 0 ? null : baseBoolIntDto21;
        Float f2 = (i3 & Integer.MIN_VALUE) != 0 ? null : f;
        String str50 = (i4 & 1) != 0 ? null : str13;
        Boolean bool79 = (i4 & 2) != 0 ? null : bool17;
        Boolean bool80 = (i4 & 4) != 0 ? null : bool18;
        Boolean bool81 = (i4 & 8) != 0 ? null : bool19;
        TrustMarkDto trustMarkDto2 = (i4 & 16) != 0 ? null : trustMarkDto;
        GroupsMicrolandingDto groupsMicrolandingDto2 = (i4 & 32) != 0 ? null : groupsMicrolandingDto;
        GroupsTariffsDto groupsTariffsDto2 = (i4 & 64) != 0 ? null : groupsTariffsDto;
        Boolean bool82 = bool77;
        Integer num45 = (i4 & 128) != 0 ? null : num14;
        Boolean bool83 = (i4 & 256) != 0 ? null : bool20;
        DisallowManageReasonDto disallowManageReasonDto2 = (i4 & 512) != 0 ? null : disallowManageReasonDto;
        String str51 = (i4 & 1024) != 0 ? null : str14;
        BaseBoolIntDto baseBoolIntDto49 = (i4 & 2048) != 0 ? null : baseBoolIntDto22;
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto2 = (i4 & 4096) != 0 ? null : groupsGroupFullShowSuggestionsDto;
        Boolean bool84 = (i4 & 8192) != 0 ? null : bool21;
        Boolean bool85 = (i4 & 16384) != 0 ? null : bool22;
        Integer num46 = (i4 & 32768) != 0 ? null : num15;
        GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto2 = (i4 & 65536) != 0 ? null : groupsAdsEasyPromoteDto;
        Boolean bool86 = (i4 & 131072) != 0 ? null : bool23;
        Integer num47 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num16;
        Boolean bool87 = (i4 & 524288) != 0 ? null : bool24;
        Object obj8 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : obj2;
        Object obj9 = (i4 & 2097152) != 0 ? null : obj3;
        Object obj10 = (i4 & 4194304) != 0 ? null : obj4;
        Boolean bool88 = (i4 & 8388608) != 0 ? null : bool25;
        Object obj11 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : obj5;
        Object obj12 = (i4 & 33554432) != 0 ? null : obj6;
        Boolean bool89 = (i4 & 67108864) != 0 ? null : bool26;
        Integer num48 = (i4 & 134217728) != 0 ? null : num17;
        Integer num49 = (i4 & 268435456) != 0 ? null : num18;
        Integer num50 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num19;
        Integer num51 = (i4 & 1073741824) != 0 ? null : num20;
        Integer num52 = (i4 & Integer.MIN_VALUE) != 0 ? null : num21;
        GroupsGroupLikeItemDto groupsGroupLikeItemDto2 = (i5 & 1) != 0 ? null : groupsGroupLikeItemDto;
        GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto2 = (i5 & 2) != 0 ? null : groupsLoginConfirmationStatusDto;
        Boolean bool90 = (i5 & 4) != 0 ? null : bool27;
        Integer num53 = (i5 & 8) != 0 ? null : num22;
        Integer num54 = (i5 & 16) != 0 ? null : num23;
        Integer num55 = (i5 & 32) != 0 ? null : num24;
        Integer num56 = (i5 & 64) != 0 ? null : num25;
        Boolean bool91 = bool85;
        GroupsGroupFriendsDto groupsGroupFriendsDto2 = (i5 & 128) != 0 ? null : groupsGroupFriendsDto;
        String str52 = (i5 & 256) != 0 ? null : str15;
        DeactivatedTypeDto deactivatedTypeDto2 = (i5 & 512) != 0 ? null : deactivatedTypeDto;
        String str53 = (i5 & 1024) != 0 ? null : str16;
        Boolean bool92 = (i5 & 2048) != 0 ? null : bool28;
        Boolean bool93 = (i5 & 4096) != 0 ? null : bool29;
        Boolean bool94 = (i5 & 8192) != 0 ? null : bool30;
        MarketCommunityRatingDto marketCommunityRatingDto2 = (i5 & 16384) != 0 ? null : marketCommunityRatingDto;
        GroupsGroupNameHistoryDto groupsGroupNameHistoryDto2 = (i5 & 32768) != 0 ? null : groupsGroupNameHistoryDto;
        MarketCommunityServiceRatingDto marketCommunityServiceRatingDto2 = (i5 & 65536) != 0 ? null : marketCommunityServiceRatingDto;
        GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto2 = (i5 & 131072) != 0 ? null : groupsRecommendedTipsWidgetDto;
        String str54 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str17;
        String str55 = (i5 & 524288) != 0 ? null : str18;
        Boolean bool95 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool31;
        Boolean bool96 = (i5 & 2097152) != 0 ? null : bool32;
        Boolean bool97 = (i5 & 4194304) != 0 ? null : bool33;
        Boolean bool98 = (i5 & 8388608) != 0 ? null : bool34;
        Boolean bool99 = (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool35;
        String str56 = (i5 & 33554432) != 0 ? null : str19;
        GroupsAdsPostsInfoDto groupsAdsPostsInfoDto2 = (i5 & 67108864) != 0 ? null : groupsAdsPostsInfoDto;
        String str57 = (i5 & 134217728) != 0 ? null : str20;
        GroupsBannerDto groupsBannerDto4 = (i5 & 268435456) != 0 ? null : groupsBannerDto;
        GroupsBannerDto groupsBannerDto5 = (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : groupsBannerDto2;
        Boolean bool100 = (i5 & 1073741824) != 0 ? null : bool36;
        LeaveModeDto leaveModeDto2 = (i5 & Integer.MIN_VALUE) != 0 ? null : leaveModeDto;
        GroupsBannerDto groupsBannerDto6 = (i6 & 1) != 0 ? null : groupsBannerDto3;
        Boolean bool101 = (i6 & 2) != 0 ? null : bool37;
        Boolean bool102 = (i6 & 4) != 0 ? null : bool38;
        VideoNotificationsStatusDto videoNotificationsStatusDto2 = (i6 & 8) != 0 ? null : videoNotificationsStatusDto;
        Boolean bool103 = (i6 & 16) != 0 ? null : bool39;
        Boolean bool104 = (i6 & 32) != 0 ? null : bool40;
        String str58 = (i6 & 64) != 0 ? null : str21;
        MarketCommunityRatingDto marketCommunityRatingDto3 = marketCommunityRatingDto2;
        Boolean bool105 = (i6 & 128) != 0 ? null : bool41;
        GroupsWorkGroupInfoDto groupsWorkGroupInfoDto2 = (i6 & 256) != 0 ? null : groupsWorkGroupInfoDto;
        String str59 = (i6 & 512) != 0 ? null : str22;
        GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto2 = (i6 & 1024) != 0 ? null : groupsGroupFullMembersPreviewDto;
        GroupsStrikesInfoDto groupsStrikesInfoDto2 = (i6 & 2048) != 0 ? null : groupsStrikesInfoDto;
        GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto2 = (i6 & 4096) != 0 ? null : groupsStrikesRestrictionsDto;
        Boolean bool106 = (i6 & 8192) != 0 ? null : bool42;
        List list11 = (i6 & 16384) != 0 ? null : list3;
    }
}
