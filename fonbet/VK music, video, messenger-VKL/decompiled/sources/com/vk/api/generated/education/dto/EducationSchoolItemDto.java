package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zrp;

/* compiled from: EducationSchoolItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationSchoolItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationSchoolItemDto> CREATOR = new a();

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

    @pmi0("grades")
    private final List<EducationGradeItemDto> grades;

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

    @pmi0("organization_type")
    private final EducationOrganizationTypeDto organizationType;

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

    @pmi0("user_role")
    private final Integer userRole;

    @pmi0("user_title")
    private final String userTitle;

    @pmi0("using_vkpay_market_app")
    private final Boolean usingVkpayMarketApp;

    @pmi0("vendor")
    private final EducationVendorItemDto vendor;

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
    /* compiled from: EducationSchoolItemDto.kt */
    public static final class DeactivatedTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DeactivatedTypeDto[] $VALUES;

        @pmi0("banned")
        public static final DeactivatedTypeDto BANNED;
        public static final Parcelable.Creator<DeactivatedTypeDto> CREATOR;

        @pmi0("geo_blocked")
        public static final DeactivatedTypeDto GEO_BLOCKED;
        private final String value;

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
    public static final class DisallowManageReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisallowManageReasonDto[] $VALUES;

        @pmi0("2")
        public static final DisallowManageReasonDto AWAITING_PERIOD;
        public static final Parcelable.Creator<DisallowManageReasonDto> CREATOR;

        @pmi0("1")
        public static final DisallowManageReasonDto NO_2FA;
        private final int value;

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
    public static final class LeaveModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LeaveModeDto[] $VALUES;

        @pmi0("admin_leave_alert")
        public static final LeaveModeDto ADMIN_LEAVE_ALERT;

        @pmi0("admin_leave_options")
        public static final LeaveModeDto ADMIN_LEAVE_OPTIONS;
        public static final Parcelable.Creator<LeaveModeDto> CREATOR;
        private final String value;

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
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

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
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

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
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

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
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

        /* compiled from: EducationSchoolItemDto.kt */
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
    /* compiled from: EducationSchoolItemDto.kt */
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

        /* compiled from: EducationSchoolItemDto.kt */
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

    /* compiled from: EducationSchoolItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationSchoolItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationSchoolItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer num;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            AudioAudioDto audioAudioDto;
            AudioMusicAwardsDto audioMusicAwardsDto;
            ArrayList arrayList2;
            UserId userId;
            ArrayList arrayList3;
            ArrayList arrayList4;
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
            Boolean valueOf17;
            Boolean valueOf18;
            Boolean valueOf19;
            BaseBoolIntDto baseBoolIntDto;
            TrustMarkDto createFromParcel;
            Boolean valueOf20;
            GroupsTariffsDto groupsTariffsDto;
            DisallowManageReasonDto createFromParcel2;
            Boolean valueOf21;
            Boolean valueOf22;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            Boolean valueOf27;
            GroupsGroupFriendsDto groupsGroupFriendsDto;
            DeactivatedTypeDto createFromParcel3;
            Boolean valueOf28;
            Boolean valueOf29;
            Boolean valueOf30;
            Boolean valueOf31;
            Boolean valueOf32;
            Boolean valueOf33;
            Boolean valueOf34;
            Boolean valueOf35;
            Boolean valueOf36;
            GroupsBannerDto groupsBannerDto;
            LeaveModeDto createFromParcel4;
            Boolean valueOf37;
            Boolean valueOf38;
            GroupsBannerDto groupsBannerDto2;
            VideoNotificationsStatusDto createFromParcel5;
            Boolean valueOf39;
            Boolean valueOf40;
            Boolean valueOf41;
            Boolean valueOf42;
            Boolean valueOf43;
            Boolean valueOf44;
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto;
            WallDto wallDto;
            ArrayList arrayList5;
            UserId userId2;
            BaseAPlusMarkDto baseAPlusMarkDto;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Integer num2;
            Boolean valueOf45;
            Boolean valueOf46;
            Boolean valueOf47;
            Boolean valueOf48;
            GroupsAppButtonDto groupsAppButtonDto;
            ArrayList arrayList8;
            ArrayList arrayList9;
            GroupsChannelBlockDto groupsChannelBlockDto;
            Boolean valueOf49;
            BaseBoolIntDto baseBoolIntDto2;
            ArrayList arrayList10;
            ArrayList arrayList11;
            VideoLiveInfoDto videoLiveInfoDto;
            Boolean valueOf50;
            Boolean valueOf51;
            Boolean valueOf52;
            Boolean valueOf53;
            Boolean valueOf54;
            Boolean valueOf55;
            Boolean valueOf56;
            Boolean valueOf57;
            Boolean valueOf58;
            Boolean valueOf59;
            GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto;
            YoulaStatusDto createFromParcel6;
            Boolean valueOf60;
            Boolean valueOf61;
            YoulaStatusDto youlaStatusDto;
            UserId userId3 = (UserId) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                num = null;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(EducationGradeItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                num = null;
            }
            String readString = parcel.readString();
            Integer valueOf62 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            EducationOrganizationTypeDto educationOrganizationTypeDto = (EducationOrganizationTypeDto) (parcel.readInt() == 0 ? num : EducationOrganizationTypeDto.CREATOR.createFromParcel(parcel));
            EducationVendorItemDto educationVendorItemDto = (EducationVendorItemDto) (parcel.readInt() == 0 ? num : EducationVendorItemDto.CREATOR.createFromParcel(parcel));
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = (GroupsGroupFullMemberStatusDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseObjectDto baseObjectDto = (BaseObjectDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            String readString2 = parcel.readString();
            boolean z = false;
            String readString3 = parcel.readString();
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AudioMusicAwardsDto audioMusicAwardsDto2 = (AudioMusicAwardsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf65 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf66 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf67 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsCountersGroupDto groupsCountersGroupDto = (GroupsCountersGroupDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto2 = (BaseOwnerCoverDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsVideoLivesDataDto groupsVideoLivesDataDto = (GroupsVideoLivesDataDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer num3 = valueOf65;
            Integer num4 = valueOf66;
            Integer num5 = valueOf67;
            String readString5 = parcel.readString();
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
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            ArrayList arrayList12 = arrayList;
            Integer num6 = valueOf62;
            Boolean bool = valueOf3;
            String readString9 = parcel.readString();
            Integer valueOf68 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer num7 = valueOf68;
            String readString10 = parcel.readString();
            AudioAudioDto audioAudioDto2 = (AudioAudioDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf69 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto2;
                audioMusicAwardsDto = audioMusicAwardsDto2;
                userId = userId3;
                arrayList2 = null;
            } else {
                audioAudioDto = audioAudioDto2;
                int readInt2 = parcel.readInt();
                audioMusicAwardsDto = audioMusicAwardsDto2;
                arrayList2 = new ArrayList(readInt2);
                userId = userId3;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(EducationSchoolItemDto.class, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList2;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                arrayList4 = arrayList2;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(EducationSchoolItemDto.class, parcel, arrayList3, i3, 1);
                    readInt3 = readInt3;
                }
            }
            WallDto createFromParcel7 = parcel.readInt() == 0 ? null : WallDto.CREATOR.createFromParcel(parcel);
            UserId userId4 = userId;
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList arrayList13 = arrayList3;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto = (GroupsGroupFullSectionDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = (GroupsPrimaryBlockSettingsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsOnlineStatusDto groupsOnlineStatusDto = (GroupsOnlineStatusDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf70 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = (GroupsGroupFullAgeLimitsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = (GroupsGroupFullAgeMarkDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupBanInfoDto groupsGroupBanInfoDto = (GroupsGroupBanInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsActionButtonDto groupsActionButtonDto = (GroupsActionButtonDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf71 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            Object readValue = parcel.readValue(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf73 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsAddressesInfoDto groupsAddressesInfoDto = (GroupsAddressesInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
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
            GroupsLiveCoversDto groupsLiveCoversDto = (GroupsLiveCoversDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsVkAdminStatusDto groupsVkAdminStatusDto = (GroupsVkAdminStatusDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsMenuDto groupsMenuDto = (GroupsMenuDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsWarningNotificationDto groupsWarningNotificationDto = (GroupsWarningNotificationDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf74 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupDonutDto groupsGroupDonutDto = (GroupsGroupDonutDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupVkTicketDto groupsGroupVkTicketDto = (GroupsGroupVkTicketDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = (GroupsGroupDonutBlockDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = (GroupsDonutCommunityManagementDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto = (GroupsGroupDonutPaymentInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf75 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsChatsStatusDto groupsChatsStatusDto = (GroupsChatsStatusDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Float valueOf76 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf17 = null;
            } else {
                valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto23;
                createFromParcel = null;
            } else {
                baseBoolIntDto = baseBoolIntDto23;
                createFromParcel = TrustMarkDto.CREATOR.createFromParcel(parcel);
            }
            TrustMarkDto trustMarkDto = createFromParcel;
            GroupsMicrolandingDto groupsMicrolandingDto = (GroupsMicrolandingDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsTariffsDto groupsTariffsDto2 = (GroupsTariffsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf77 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf20 = null;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsTariffsDto = groupsTariffsDto2;
                createFromParcel2 = null;
            } else {
                groupsTariffsDto = groupsTariffsDto2;
                createFromParcel2 = DisallowManageReasonDto.CREATOR.createFromParcel(parcel);
            }
            DisallowManageReasonDto disallowManageReasonDto = createFromParcel2;
            Boolean bool2 = valueOf;
            Boolean bool3 = valueOf2;
            Integer num8 = valueOf69;
            ArrayList arrayList14 = arrayList4;
            Boolean bool4 = valueOf4;
            Integer num9 = valueOf73;
            Integer num10 = valueOf75;
            Boolean bool5 = valueOf16;
            Float f = valueOf76;
            Boolean bool6 = valueOf17;
            Boolean bool7 = valueOf18;
            Boolean bool8 = valueOf19;
            GroupsTariffsDto groupsTariffsDto3 = groupsTariffsDto;
            String readString14 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = (GroupsGroupFullShowSuggestionsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf21 = null;
            } else {
                valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf78 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = (GroupsAdsEasyPromoteDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf23 = null;
            } else {
                valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf79 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf24 = null;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue2 = parcel.readValue(EducationSchoolItemDto.class.getClassLoader());
            Object readValue3 = parcel.readValue(EducationSchoolItemDto.class.getClassLoader());
            Object readValue4 = parcel.readValue(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue5 = parcel.readValue(EducationSchoolItemDto.class.getClassLoader());
            Object readValue6 = parcel.readValue(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf26 = null;
            } else {
                valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf80 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf81 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf82 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf83 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf84 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupLikeItemDto groupsGroupLikeItemDto = (GroupsGroupLikeItemDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = (GroupsLoginConfirmationStatusDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf27 = null;
            } else {
                valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf85 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf86 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf87 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf88 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupFriendsDto groupsGroupFriendsDto2 = (GroupsGroupFriendsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            AudioAudioDto audioAudioDto3 = audioAudioDto;
            Integer num11 = valueOf70;
            Integer num12 = valueOf71;
            Boolean bool9 = valueOf5;
            Boolean bool10 = valueOf6;
            Integer num13 = valueOf72;
            Boolean bool11 = valueOf7;
            Boolean bool12 = valueOf8;
            Boolean bool13 = valueOf9;
            Boolean bool14 = valueOf10;
            Boolean bool15 = valueOf11;
            Boolean bool16 = valueOf12;
            Boolean bool17 = valueOf13;
            Boolean bool18 = valueOf14;
            Boolean bool19 = valueOf15;
            Integer num14 = valueOf74;
            BaseBoolIntDto baseBoolIntDto25 = baseBoolIntDto;
            Integer num15 = valueOf77;
            Boolean bool20 = valueOf20;
            Boolean bool21 = valueOf23;
            Integer num16 = valueOf79;
            Boolean bool22 = valueOf24;
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                groupsGroupFriendsDto = groupsGroupFriendsDto2;
                createFromParcel3 = null;
            } else {
                groupsGroupFriendsDto = groupsGroupFriendsDto2;
                createFromParcel3 = DeactivatedTypeDto.CREATOR.createFromParcel(parcel);
            }
            DeactivatedTypeDto deactivatedTypeDto = createFromParcel3;
            Boolean bool23 = valueOf21;
            Boolean bool24 = valueOf22;
            Integer num17 = valueOf78;
            Boolean bool25 = valueOf25;
            Boolean bool26 = valueOf26;
            Integer num18 = valueOf80;
            Integer num19 = valueOf81;
            Integer num20 = valueOf82;
            Integer num21 = valueOf83;
            Integer num22 = valueOf84;
            Boolean bool27 = valueOf27;
            Integer num23 = valueOf85;
            Integer num24 = valueOf86;
            Integer num25 = valueOf87;
            Integer num26 = valueOf88;
            GroupsGroupFriendsDto groupsGroupFriendsDto3 = groupsGroupFriendsDto;
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf28 = null;
            } else {
                valueOf28 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf29 = null;
            } else {
                valueOf29 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf30 = null;
            } else {
                valueOf30 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketCommunityRatingDto marketCommunityRatingDto = (MarketCommunityRatingDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = (GroupsGroupNameHistoryDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = (MarketCommunityServiceRatingDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = (GroupsRecommendedTipsWidgetDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Boolean bool28 = valueOf28;
            Boolean bool29 = valueOf29;
            Boolean bool30 = valueOf30;
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf31 = null;
            } else {
                valueOf31 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf32 = null;
            } else {
                valueOf32 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf33 = null;
            } else {
                valueOf33 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf34 = null;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf35 = null;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString19 = parcel.readString();
            GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = (GroupsAdsPostsInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            String readString20 = parcel.readString();
            GroupsBannerDto groupsBannerDto3 = (GroupsBannerDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsBannerDto groupsBannerDto4 = (GroupsBannerDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsBannerDto = groupsBannerDto4;
                createFromParcel4 = null;
            } else {
                groupsBannerDto = groupsBannerDto4;
                createFromParcel4 = LeaveModeDto.CREATOR.createFromParcel(parcel);
            }
            LeaveModeDto leaveModeDto = createFromParcel4;
            GroupsBannerDto groupsBannerDto5 = (GroupsBannerDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf38 = null;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsBannerDto2 = groupsBannerDto5;
                createFromParcel5 = null;
            } else {
                groupsBannerDto2 = groupsBannerDto5;
                createFromParcel5 = VideoNotificationsStatusDto.CREATOR.createFromParcel(parcel);
            }
            VideoNotificationsStatusDto videoNotificationsStatusDto = createFromParcel5;
            if (parcel.readInt() == 0) {
                valueOf39 = null;
            } else {
                valueOf39 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf40 = null;
            } else {
                valueOf40 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString21 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf41 = null;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = (GroupsWorkGroupInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Boolean bool31 = valueOf36;
            Boolean bool32 = valueOf37;
            Boolean bool33 = valueOf38;
            String readString22 = parcel.readString();
            GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = (GroupsGroupFullMembersPreviewDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsStrikesInfoDto groupsStrikesInfoDto = (GroupsStrikesInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto2 = (GroupsStrikesRestrictionsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf42 = null;
            } else {
                valueOf42 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf43 = null;
            } else {
                valueOf43 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf44 = null;
            } else {
                valueOf44 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsStrikesRestrictionsDto = groupsStrikesRestrictionsDto2;
                wallDto = createFromParcel7;
                userId2 = userId4;
                arrayList5 = null;
            } else {
                groupsStrikesRestrictionsDto = groupsStrikesRestrictionsDto2;
                int readInt4 = parcel.readInt();
                wallDto = createFromParcel7;
                arrayList5 = new ArrayList(readInt4);
                userId2 = userId4;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(EducationSchoolItemDto.class, parcel, arrayList5, i4, 1);
                    readInt4 = readInt4;
                }
            }
            Integer valueOf89 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf90 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num27 = valueOf89;
            GroupsSimpleButtonDto groupsSimpleButtonDto = (GroupsSimpleButtonDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto2 = (BaseAPlusMarkDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseAPlusMarkDto = baseAPlusMarkDto2;
                arrayList6 = arrayList5;
                num2 = valueOf90;
                arrayList7 = null;
            } else {
                baseAPlusMarkDto = baseAPlusMarkDto2;
                int readInt5 = parcel.readInt();
                arrayList6 = arrayList5;
                arrayList7 = new ArrayList(readInt5);
                num2 = valueOf90;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(EducationSchoolItemDto.class, parcel, arrayList7, i5, 1);
                    readInt5 = readInt5;
                }
            }
            GroupsChannelInfoDto groupsChannelInfoDto = (GroupsChannelInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsChannelBlockDto groupsChannelBlockDto2 = (GroupsChannelBlockDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf45 = null;
            } else {
                valueOf45 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsEventOrganizerDto groupsEventOrganizerDto = (GroupsEventOrganizerDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsVideoChannelDataDto groupsVideoChannelDataDto = (GroupsVideoChannelDataDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf46 = null;
            } else {
                valueOf46 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf47 = null;
            } else {
                valueOf47 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf48 = null;
            } else {
                valueOf48 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsContentSectionsDataDto groupsContentSectionsDataDto = (GroupsContentSectionsDataDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto3 = groupsStrikesRestrictionsDto;
            BaseAPlusMarkDto baseAPlusMarkDto3 = baseAPlusMarkDto;
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            GroupsGroupIsClosedDto groupsGroupIsClosedDto = (GroupsGroupIsClosedDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupTypeDto groupsGroupTypeDto = (GroupsGroupTypeDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = (GroupsGroupAdminLevelDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            Integer valueOf91 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf92 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto29 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            String readString34 = parcel.readString();
            String readString35 = parcel.readString();
            YoulaPostingMethodDto youlaPostingMethodDto = null;
            String readString36 = parcel.readString();
            GroupsPhotoSizeDto groupsPhotoSizeDto = (GroupsPhotoSizeDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsAppButtonDto groupsAppButtonDto2 = (GroupsAppButtonDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                groupsAppButtonDto = groupsAppButtonDto2;
                arrayList8 = arrayList7;
                groupsChannelBlockDto = groupsChannelBlockDto2;
                arrayList9 = null;
            } else {
                groupsAppButtonDto = groupsAppButtonDto2;
                int readInt6 = parcel.readInt();
                arrayList8 = arrayList7;
                arrayList9 = new ArrayList(readInt6);
                groupsChannelBlockDto = groupsChannelBlockDto2;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(EducationSchoolItemDto.class, parcel, arrayList9, i6, 1);
                    readInt6 = readInt6;
                }
            }
            BaseBoolIntDto baseBoolIntDto30 = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto2 = (VideoLiveInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf49 = null;
            } else {
                valueOf49 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString37 = parcel.readString();
            Integer valueOf93 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto30;
                arrayList10 = arrayList9;
                videoLiveInfoDto = videoLiveInfoDto2;
                arrayList11 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto30;
                int readInt7 = parcel.readInt();
                arrayList10 = arrayList9;
                arrayList11 = new ArrayList(readInt7);
                videoLiveInfoDto = videoLiveInfoDto2;
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(EducationSchoolItemDto.class, parcel, arrayList11, i7, 1);
                    readInt7 = readInt7;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf50 = null;
            } else {
                valueOf50 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf51 = null;
            } else {
                valueOf51 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsMarketInfoDto groupsMarketInfoDto = (GroupsMarketInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = (GroupsMarketServicesInfoDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf52 = null;
            } else {
                valueOf52 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf53 = null;
            } else {
                valueOf53 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf54 = null;
            } else {
                valueOf54 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto = (GroupsGroupExtendedMarketSectionsDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto2 = (GroupsMarketShopConditionsStateDto) parcel.readParcelable(EducationSchoolItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf55 = null;
            } else {
                valueOf55 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf56 = null;
            } else {
                valueOf56 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf57 = null;
            } else {
                valueOf57 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf58 = null;
            } else {
                valueOf58 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf59 = null;
            } else {
                valueOf59 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsMarketShopConditionsStateDto = groupsMarketShopConditionsStateDto2;
                createFromParcel6 = null;
            } else {
                groupsMarketShopConditionsStateDto = groupsMarketShopConditionsStateDto2;
                createFromParcel6 = YoulaStatusDto.CREATOR.createFromParcel(parcel);
            }
            YoulaStatusDto youlaStatusDto2 = createFromParcel6;
            if (parcel.readInt() == 0) {
                valueOf60 = null;
            } else {
                valueOf60 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString38 = parcel.readString();
            Integer valueOf94 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf61 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf61 = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                youlaStatusDto = youlaStatusDto2;
            } else {
                youlaStatusDto = youlaStatusDto2;
                youlaPostingMethodDto = YoulaPostingMethodDto.CREATOR.createFromParcel(parcel);
            }
            return new EducationSchoolItemDto(userId2, arrayList12, readString, num6, educationOrganizationTypeDto, educationVendorItemDto, groupsGroupFullMemberStatusDto, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, baseObjectDto, baseCountryDto, readString2, readString3, valueOf63, readString4, valueOf64, audioMusicAwardsDto, num3, num4, num5, groupsCountersGroupDto, baseOwnerCoverDto, baseOwnerCoverDto2, groupsVideoLivesDataDto, readString5, readString6, readString7, readString8, bool2, bool3, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, bool, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, baseBoolIntDto13, baseBoolIntDto14, baseBoolIntDto15, readString9, num7, baseBoolIntDto16, baseCropPhotoDto, readString10, audioAudioDto3, num8, arrayList14, arrayList13, wallDto, readString11, bool4, groupsGroupFullSectionDto, groupsPrimaryBlockSettingsDto, baseBoolIntDto17, baseBoolIntDto18, baseBoolIntDto19, baseBoolIntDto20, groupsOnlineStatusDto, num11, groupsGroupFullAgeLimitsDto, groupsGroupFullAgeMarkDto, groupsGroupBanInfoDto, groupsActionButtonDto, num12, readString12, bool9, bool10, num13, bool11, readValue, num9, groupsAddressesInfoDto, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, groupsLiveCoversDto, groupsVkAdminStatusDto, groupsMenuDto, groupsWarningNotificationDto, num14, groupsGroupDonutDto, groupsGroupVkTicketDto, groupsGroupDonutBlockDto, groupsDonutCommunityManagementDto, groupsGroupDonutPaymentInfoDto, num10, bool5, baseBoolIntDto21, baseBoolIntDto22, groupsChatsStatusDto, baseBoolIntDto25, f, readString13, bool6, bool7, bool8, trustMarkDto, groupsMicrolandingDto, groupsTariffsDto3, num15, bool20, disallowManageReasonDto, readString14, baseBoolIntDto24, groupsGroupFullShowSuggestionsDto, bool23, bool24, num17, groupsAdsEasyPromoteDto, bool21, num16, bool22, readValue2, readValue3, readValue4, bool25, readValue5, readValue6, bool26, num18, num19, num20, num21, num22, groupsGroupLikeItemDto, groupsLoginConfirmationStatusDto, bool27, num23, num24, num25, num26, groupsGroupFriendsDto3, readString15, deactivatedTypeDto, readString16, bool28, bool29, bool30, marketCommunityRatingDto, groupsGroupNameHistoryDto, marketCommunityServiceRatingDto, groupsRecommendedTipsWidgetDto, readString17, readString18, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, readString19, groupsAdsPostsInfoDto, readString20, groupsBannerDto3, groupsBannerDto, bool31, leaveModeDto, groupsBannerDto2, bool32, bool33, videoNotificationsStatusDto, valueOf39, valueOf40, readString21, valueOf41, groupsWorkGroupInfoDto, readString22, groupsGroupFullMembersPreviewDto, groupsStrikesInfoDto, groupsStrikesRestrictionsDto3, valueOf42, createStringArrayList, valueOf43, valueOf44, arrayList6, num27, num2, groupsSimpleButtonDto, baseAPlusMarkDto3, arrayList8, groupsChannelInfoDto, groupsChannelBlockDto, valueOf45, groupsEventOrganizerDto, groupsVideoChannelDataDto, valueOf46, valueOf47, valueOf48, groupsContentSectionsDataDto, readString23, readString24, groupsGroupIsClosedDto, groupsGroupTypeDto, channelsChannelTypeDto, baseBoolIntDto26, groupsGroupAdminLevelDto, baseBoolIntDto27, baseBoolIntDto28, valueOf91, valueOf92, baseBoolIntDto29, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, groupsPhotoSizeDto, groupsAppButtonDto, arrayList10, baseBoolIntDto2, videoLiveInfoDto, valueOf49, readString37, valueOf93, arrayList11, valueOf50, valueOf51, groupsMarketInfoDto, groupsMarketServicesInfoDto, valueOf52, valueOf53, valueOf54, groupsGroupExtendedMarketSectionsDto, groupsMarketShopConditionsStateDto, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, youlaStatusDto, valueOf60, readString38, valueOf94, valueOf61, youlaPostingMethodDto);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationSchoolItemDto[] newArray(int i) {
            return new EducationSchoolItemDto[i];
        }
    }

    public EducationSchoolItemDto(UserId userId, List<EducationGradeItemDto> list, String str, Integer num, EducationOrganizationTypeDto educationOrganizationTypeDto, EducationVendorItemDto educationVendorItemDto, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str2, String str3, Integer num2, String str4, Integer num3, AudioMusicAwardsDto audioMusicAwardsDto, Integer num4, Integer num5, Integer num6, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseOwnerCoverDto baseOwnerCoverDto2, GroupsVideoLivesDataDto groupsVideoLivesDataDto, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool3, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str9, Integer num7, BaseBoolIntDto baseBoolIntDto14, BaseCropPhotoDto baseCropPhotoDto, String str10, AudioAudioDto audioAudioDto, Integer num8, List<GroupsLinksItemDto> list2, List<GroupsContactsItemDto> list3, WallDto wallDto, String str11, Boolean bool4, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num9, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, GroupsActionButtonDto groupsActionButtonDto, Integer num10, String str12, Boolean bool5, Boolean bool6, Integer num11, Boolean bool7, Object obj, Integer num12, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, GroupsLiveCoversDto groupsLiveCoversDto, GroupsVkAdminStatusDto groupsVkAdminStatusDto, GroupsMenuDto groupsMenuDto, GroupsWarningNotificationDto groupsWarningNotificationDto, Integer num13, GroupsGroupDonutDto groupsGroupDonutDto, GroupsGroupVkTicketDto groupsGroupVkTicketDto, GroupsGroupDonutBlockDto groupsGroupDonutBlockDto, GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto, GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto, Integer num14, Boolean bool16, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, GroupsChatsStatusDto groupsChatsStatusDto, BaseBoolIntDto baseBoolIntDto21, Float f, String str13, Boolean bool17, Boolean bool18, Boolean bool19, TrustMarkDto trustMarkDto, GroupsMicrolandingDto groupsMicrolandingDto, GroupsTariffsDto groupsTariffsDto, Integer num15, Boolean bool20, DisallowManageReasonDto disallowManageReasonDto, String str14, BaseBoolIntDto baseBoolIntDto22, GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto, Boolean bool21, Boolean bool22, Integer num16, GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto, Boolean bool23, Integer num17, Boolean bool24, Object obj2, Object obj3, Object obj4, Boolean bool25, Object obj5, Object obj6, Boolean bool26, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, GroupsGroupLikeItemDto groupsGroupLikeItemDto, GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto, Boolean bool27, Integer num23, Integer num24, Integer num25, Integer num26, GroupsGroupFriendsDto groupsGroupFriendsDto, String str15, DeactivatedTypeDto deactivatedTypeDto, String str16, Boolean bool28, Boolean bool29, Boolean bool30, MarketCommunityRatingDto marketCommunityRatingDto, GroupsGroupNameHistoryDto groupsGroupNameHistoryDto, MarketCommunityServiceRatingDto marketCommunityServiceRatingDto, GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto, String str17, String str18, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str19, GroupsAdsPostsInfoDto groupsAdsPostsInfoDto, String str20, GroupsBannerDto groupsBannerDto, GroupsBannerDto groupsBannerDto2, Boolean bool36, LeaveModeDto leaveModeDto, GroupsBannerDto groupsBannerDto3, Boolean bool37, Boolean bool38, VideoNotificationsStatusDto videoNotificationsStatusDto, Boolean bool39, Boolean bool40, String str21, Boolean bool41, GroupsWorkGroupInfoDto groupsWorkGroupInfoDto, String str22, GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto, GroupsStrikesInfoDto groupsStrikesInfoDto, GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto, Boolean bool42, List<String> list4, Boolean bool43, Boolean bool44, List<GroupsTabSettingsDto> list5, Integer num27, Integer num28, GroupsSimpleButtonDto groupsSimpleButtonDto, BaseAPlusMarkDto baseAPlusMarkDto, List<ServiceBookingRepeatRecordDto> list6, GroupsChannelInfoDto groupsChannelInfoDto, GroupsChannelBlockDto groupsChannelBlockDto, Boolean bool45, GroupsEventOrganizerDto groupsEventOrganizerDto, GroupsVideoChannelDataDto groupsVideoChannelDataDto, Boolean bool46, Boolean bool47, Boolean bool48, GroupsContentSectionsDataDto groupsContentSectionsDataDto, String str23, String str24, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto23, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, Integer num29, Integer num30, BaseBoolIntDto baseBoolIntDto26, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List<GroupsAppButtonDto> list7, BaseBoolIntDto baseBoolIntDto27, VideoLiveInfoDto videoLiveInfoDto, Boolean bool49, String str37, Integer num31, List<BaseOwnerButtonDto> list8, Boolean bool50, Boolean bool51, GroupsMarketInfoDto groupsMarketInfoDto, GroupsMarketServicesInfoDto groupsMarketServicesInfoDto, Boolean bool52, Boolean bool53, Boolean bool54, GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto, GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, YoulaStatusDto youlaStatusDto, Boolean bool60, String str38, Integer num32, Boolean bool61, YoulaPostingMethodDto youlaPostingMethodDto) {
        this.id = userId;
        this.grades = list;
        this.userTitle = str;
        this.userRole = num;
        this.organizationType = educationOrganizationTypeDto;
        this.vendor = educationVendorItemDto;
        this.memberStatus = groupsGroupFullMemberStatusDto;
        this.isAdult = baseBoolIntDto;
        this.isHiddenFromFeed = baseBoolIntDto2;
        this.isFavorite = baseBoolIntDto3;
        this.isSubscribed = baseBoolIntDto4;
        this.city = baseObjectDto;
        this.country = baseCountryDto;
        this.description = str2;
        this.wikiPage = str3;
        this.membersCount = num2;
        this.membersCountText = str4;
        this.requestsCount = num3;
        this.musicAwards = audioMusicAwardsDto;
        this.videoLiveLevel = num4;
        this.videoLiveCount = num5;
        this.clipsCount = num6;
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
        this.fixedPost = num7;
        this.hasPhoto = baseBoolIntDto14;
        this.cropPhoto = baseCropPhotoDto;
        this.status = str10;
        this.statusAudio = audioAudioDto;
        this.mainAlbumId = num8;
        this.links = list2;
        this.contacts = list3;
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
        this.invitedBy = num9;
        this.ageLimits = groupsGroupFullAgeLimitsDto;
        this.ageMark = groupsGroupFullAgeMarkDto;
        this.banInfo = groupsGroupBanInfoDto;
        this.actionButton = groupsActionButtonDto;
        this.authorId = num10;
        this.phone = str12;
        this.isWidgetMessagesEnabled = bool5;
        this.vkpayCanTransfer = bool6;
        this.vkpayReceiverId = num11;
        this.hasGroupChannel = bool7;
        this.groupChannel = obj;
        this.communityChannelId = num12;
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
        this.createDate = num13;
        this.donut = groupsGroupDonutDto;
        this.vkTicket = groupsGroupVkTicketDto;
        this.donutBlock = groupsGroupDonutBlockDto;
        this.donutCommunityManagement = groupsDonutCommunityManagementDto;
        this.donutPaymentInfo = groupsGroupDonutPaymentInfoDto;
        this.canPostDonut = num14;
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
        this.verificationEndTime = num15;
        this.canManage = bool20;
        this.disallowManageReason = disallowManageReasonDto;
        this.disallowManageReasonMessage = str14;
        this.hasSuggestions = baseBoolIntDto22;
        this.showSuggestions = groupsGroupFullShowSuggestionsDto;
        this.canViewStats = bool21;
        this.canViewPostReachStats = bool22;
        this.storiesArchiveCount = num16;
        this.adsEasyPromote = groupsAdsEasyPromoteDto;
        this.adsEasyPromoteAllowed = bool23;
        this.adsPostingRestrictedToday = num17;
        this.adsMarketAutopromoteAllowed = bool24;
        this.adsMarketEasyPromote = obj2;
        this.adsMarketAutopromoteReasonsNotAllowed = obj3;
        this.adsMarketServicesAutopromoteReasonsNotAllowed = obj4;
        this.adsMarketServicesAutopromoteAllowed = bool25;
        this.adsMarketServicesEasyPromote = obj5;
        this.adsEasyPromoteReasonsNotAllowed = obj6;
        this.canSeeInviteLinks = bool26;
        this.categoryV2 = num18;
        this.subjectId = num19;
        this.publicCategory = num20;
        this.publicSubcategory = num21;
        this.installedAppsCount = num22;
        this.like = groupsGroupLikeItemDto;
        this.loginConfirmationStatus = groupsLoginConfirmationStatusDto;
        this.hasUnseenStories = bool27;
        this.category = num23;
        this.category0 = num24;
        this.category1 = num25;
        this.category2 = num26;
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
        this.enabledFeatures = list4;
        this.canEditScreenName = bool43;
        this.canCreateEvent = bool44;
        this.tabs = list5;
        this.unreadCount = num27;
        this.videosCount = num28;
        this.channelButton = groupsSimpleButtonDto;
        this.aPlusMark = baseAPlusMarkDto;
        this.yclientsRepeatRecords = list6;
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
        this.startDate = num29;
        this.finishDate = num30;
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
        this.appButtons = list7;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto27;
        this.videoLive = videoLiveInfoDto;
        this.hadTorch = bool49;
        this.audioArtistId = str37;
        this.audioCuratorId = num31;
        this.buttons = list8;
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
        this.classifiedsAntibaraholkaDesignVersion = num32;
        this.isYoulaPostingToWallAllowed = bool61;
        this.youlaPostingMethod = youlaPostingMethodDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationSchoolItemDto)) {
            return false;
        }
        EducationSchoolItemDto educationSchoolItemDto = (EducationSchoolItemDto) obj;
        return epx.f(this.id, educationSchoolItemDto.id) && epx.f(this.grades, educationSchoolItemDto.grades) && epx.f(this.userTitle, educationSchoolItemDto.userTitle) && epx.f(this.userRole, educationSchoolItemDto.userRole) && epx.f(this.organizationType, educationSchoolItemDto.organizationType) && epx.f(this.vendor, educationSchoolItemDto.vendor) && this.memberStatus == educationSchoolItemDto.memberStatus && this.isAdult == educationSchoolItemDto.isAdult && this.isHiddenFromFeed == educationSchoolItemDto.isHiddenFromFeed && this.isFavorite == educationSchoolItemDto.isFavorite && this.isSubscribed == educationSchoolItemDto.isSubscribed && epx.f(this.city, educationSchoolItemDto.city) && epx.f(this.country, educationSchoolItemDto.country) && epx.f(this.description, educationSchoolItemDto.description) && epx.f(this.wikiPage, educationSchoolItemDto.wikiPage) && epx.f(this.membersCount, educationSchoolItemDto.membersCount) && epx.f(this.membersCountText, educationSchoolItemDto.membersCountText) && epx.f(this.requestsCount, educationSchoolItemDto.requestsCount) && epx.f(this.musicAwards, educationSchoolItemDto.musicAwards) && epx.f(this.videoLiveLevel, educationSchoolItemDto.videoLiveLevel) && epx.f(this.videoLiveCount, educationSchoolItemDto.videoLiveCount) && epx.f(this.clipsCount, educationSchoolItemDto.clipsCount) && epx.f(this.counters, educationSchoolItemDto.counters) && epx.f(this.cover, educationSchoolItemDto.cover) && epx.f(this.videoCover, educationSchoolItemDto.videoCover) && epx.f(this.videoLivesData, educationSchoolItemDto.videoLivesData) && epx.f(this.photoAvgColor, educationSchoolItemDto.photoAvgColor) && epx.f(this.inn, educationSchoolItemDto.inn) && epx.f(this.ogrn, educationSchoolItemDto.ogrn) && epx.f(this.kpp, educationSchoolItemDto.kpp) && epx.f(this.hasLiveCover, educationSchoolItemDto.hasLiveCover) && epx.f(this.hasStories, educationSchoolItemDto.hasStories) && this.canPost == educationSchoolItemDto.canPost && this.canSuggest == educationSchoolItemDto.canSuggest && this.canUploadStory == educationSchoolItemDto.canUploadStory && epx.f(this.canCallToCommunity, educationSchoolItemDto.canCallToCommunity) && this.canUploadDoc == educationSchoolItemDto.canUploadDoc && this.canUploadVideo == educationSchoolItemDto.canUploadVideo && this.canUploadVideoThumb == educationSchoolItemDto.canUploadVideoThumb && this.canUploadClip == educationSchoolItemDto.canUploadClip && this.canSeeAllPosts == educationSchoolItemDto.canSeeAllPosts && this.canCreateTopic == educationSchoolItemDto.canCreateTopic && epx.f(this.activity, educationSchoolItemDto.activity) && epx.f(this.fixedPost, educationSchoolItemDto.fixedPost) && this.hasPhoto == educationSchoolItemDto.hasPhoto && epx.f(this.cropPhoto, educationSchoolItemDto.cropPhoto) && epx.f(this.status, educationSchoolItemDto.status) && epx.f(this.statusAudio, educationSchoolItemDto.statusAudio) && epx.f(this.mainAlbumId, educationSchoolItemDto.mainAlbumId) && epx.f(this.links, educationSchoolItemDto.links) && epx.f(this.contacts, educationSchoolItemDto.contacts) && this.wall == educationSchoolItemDto.wall && epx.f(this.site, educationSchoolItemDto.site) && epx.f(this.isSiteDisplayed, educationSchoolItemDto.isSiteDisplayed) && this.mainSection == educationSchoolItemDto.mainSection && epx.f(this.primaryBlock, educationSchoolItemDto.primaryBlock) && this.trending == educationSchoolItemDto.trending && this.canMessage == educationSchoolItemDto.canMessage && this.isMessagesBlocked == educationSchoolItemDto.isMessagesBlocked && this.canSendNotify == educationSchoolItemDto.canSendNotify && epx.f(this.onlineStatus, educationSchoolItemDto.onlineStatus) && epx.f(this.invitedBy, educationSchoolItemDto.invitedBy) && this.ageLimits == educationSchoolItemDto.ageLimits && this.ageMark == educationSchoolItemDto.ageMark && epx.f(this.banInfo, educationSchoolItemDto.banInfo) && epx.f(this.actionButton, educationSchoolItemDto.actionButton) && epx.f(this.authorId, educationSchoolItemDto.authorId) && epx.f(this.phone, educationSchoolItemDto.phone) && epx.f(this.isWidgetMessagesEnabled, educationSchoolItemDto.isWidgetMessagesEnabled) && epx.f(this.vkpayCanTransfer, educationSchoolItemDto.vkpayCanTransfer) && epx.f(this.vkpayReceiverId, educationSchoolItemDto.vkpayReceiverId) && epx.f(this.hasGroupChannel, educationSchoolItemDto.hasGroupChannel) && epx.f(this.groupChannel, educationSchoolItemDto.groupChannel) && epx.f(this.communityChannelId, educationSchoolItemDto.communityChannelId) && epx.f(this.addresses, educationSchoolItemDto.addresses) && epx.f(this.messages, educationSchoolItemDto.messages) && epx.f(this.isAue, educationSchoolItemDto.isAue) && epx.f(this.prohibitedContentAdultMark, educationSchoolItemDto.prohibitedContentAdultMark) && epx.f(this.isSubscribedPodcasts, educationSchoolItemDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, educationSchoolItemDto.canSubscribePodcasts) && epx.f(this.isSubscribedStories, educationSchoolItemDto.isSubscribedStories) && epx.f(this.canSubscribeStories, educationSchoolItemDto.canSubscribeStories) && epx.f(this.canSubscribePosts, educationSchoolItemDto.canSubscribePosts) && epx.f(this.liveCovers, educationSchoolItemDto.liveCovers) && epx.f(this.vkAdminStatus, educationSchoolItemDto.vkAdminStatus) && epx.f(this.menu, educationSchoolItemDto.menu) && epx.f(this.warningNotification, educationSchoolItemDto.warningNotification) && epx.f(this.createDate, educationSchoolItemDto.createDate) && epx.f(this.donut, educationSchoolItemDto.donut) && epx.f(this.vkTicket, educationSchoolItemDto.vkTicket) && epx.f(this.donutBlock, educationSchoolItemDto.donutBlock) && epx.f(this.donutCommunityManagement, educationSchoolItemDto.donutCommunityManagement) && epx.f(this.donutPaymentInfo, educationSchoolItemDto.donutPaymentInfo) && epx.f(this.canPostDonut, educationSchoolItemDto.canPostDonut) && epx.f(this.canSeeMembers, educationSchoolItemDto.canSeeMembers) && this.msgPushAllowed == educationSchoolItemDto.msgPushAllowed && this.msgNotificationsAllowed == educationSchoolItemDto.msgNotificationsAllowed && epx.f(this.chatsStatus, educationSchoolItemDto.chatsStatus) && this.canReport == educationSchoolItemDto.canReport && epx.f(this.businessRating, educationSchoolItemDto.businessRating) && epx.f(this.isBusiness, educationSchoolItemDto.isBusiness) && epx.f(this.isBusinessCategory, educationSchoolItemDto.isBusinessCategory) && epx.f(this.isConfirmedBusiness, educationSchoolItemDto.isConfirmedBusiness) && epx.f(this.isGoldenMarkedBusiness, educationSchoolItemDto.isGoldenMarkedBusiness) && this.trustMark == educationSchoolItemDto.trustMark && epx.f(this.microlanding, educationSchoolItemDto.microlanding) && epx.f(this.tariffs, educationSchoolItemDto.tariffs) && epx.f(this.verificationEndTime, educationSchoolItemDto.verificationEndTime) && epx.f(this.canManage, educationSchoolItemDto.canManage) && this.disallowManageReason == educationSchoolItemDto.disallowManageReason && epx.f(this.disallowManageReasonMessage, educationSchoolItemDto.disallowManageReasonMessage) && this.hasSuggestions == educationSchoolItemDto.hasSuggestions && this.showSuggestions == educationSchoolItemDto.showSuggestions && epx.f(this.canViewStats, educationSchoolItemDto.canViewStats) && epx.f(this.canViewPostReachStats, educationSchoolItemDto.canViewPostReachStats) && epx.f(this.storiesArchiveCount, educationSchoolItemDto.storiesArchiveCount) && epx.f(this.adsEasyPromote, educationSchoolItemDto.adsEasyPromote) && epx.f(this.adsEasyPromoteAllowed, educationSchoolItemDto.adsEasyPromoteAllowed) && epx.f(this.adsPostingRestrictedToday, educationSchoolItemDto.adsPostingRestrictedToday) && epx.f(this.adsMarketAutopromoteAllowed, educationSchoolItemDto.adsMarketAutopromoteAllowed) && epx.f(this.adsMarketEasyPromote, educationSchoolItemDto.adsMarketEasyPromote) && epx.f(this.adsMarketAutopromoteReasonsNotAllowed, educationSchoolItemDto.adsMarketAutopromoteReasonsNotAllowed) && epx.f(this.adsMarketServicesAutopromoteReasonsNotAllowed, educationSchoolItemDto.adsMarketServicesAutopromoteReasonsNotAllowed) && epx.f(this.adsMarketServicesAutopromoteAllowed, educationSchoolItemDto.adsMarketServicesAutopromoteAllowed) && epx.f(this.adsMarketServicesEasyPromote, educationSchoolItemDto.adsMarketServicesEasyPromote) && epx.f(this.adsEasyPromoteReasonsNotAllowed, educationSchoolItemDto.adsEasyPromoteReasonsNotAllowed) && epx.f(this.canSeeInviteLinks, educationSchoolItemDto.canSeeInviteLinks) && epx.f(this.categoryV2, educationSchoolItemDto.categoryV2) && epx.f(this.subjectId, educationSchoolItemDto.subjectId) && epx.f(this.publicCategory, educationSchoolItemDto.publicCategory) && epx.f(this.publicSubcategory, educationSchoolItemDto.publicSubcategory) && epx.f(this.installedAppsCount, educationSchoolItemDto.installedAppsCount) && epx.f(this.like, educationSchoolItemDto.like) && epx.f(this.loginConfirmationStatus, educationSchoolItemDto.loginConfirmationStatus) && epx.f(this.hasUnseenStories, educationSchoolItemDto.hasUnseenStories) && epx.f(this.category, educationSchoolItemDto.category) && epx.f(this.category0, educationSchoolItemDto.category0) && epx.f(this.category1, educationSchoolItemDto.category1) && epx.f(this.category2, educationSchoolItemDto.category2) && epx.f(this.friends, educationSchoolItemDto.friends) && epx.f(this.deactivatedMessage, educationSchoolItemDto.deactivatedMessage) && this.deactivatedType == educationSchoolItemDto.deactivatedType && epx.f(this.targArtistId, educationSchoolItemDto.targArtistId) && epx.f(this.isGovernmentOrganization, educationSchoolItemDto.isGovernmentOrganization) && epx.f(this.settingsTooltipsActive, educationSchoolItemDto.settingsTooltipsActive) && epx.f(this.isYclientsTooltipActive, educationSchoolItemDto.isYclientsTooltipActive) && epx.f(this.rating, educationSchoolItemDto.rating) && epx.f(this.nameHistory, educationSchoolItemDto.nameHistory) && epx.f(this.serviceRating, educationSchoolItemDto.serviceRating) && epx.f(this.recommendedTipsWidget, educationSchoolItemDto.recommendedTipsWidget) && epx.f(this.region, educationSchoolItemDto.region) && epx.f(this.subject, educationSchoolItemDto.subject) && epx.f(this.isSetTabOrder, educationSchoolItemDto.isSetTabOrder) && epx.f(this.isShowBusinessOnboarding, educationSchoolItemDto.isShowBusinessOnboarding) && epx.f(this.businessCommunityTooltips, educationSchoolItemDto.businessCommunityTooltips) && epx.f(this.repostsDisabled, educationSchoolItemDto.repostsDisabled) && epx.f(this.videoLivesStreamingBanned, educationSchoolItemDto.videoLivesStreamingBanned) && epx.f(this.category1Name, educationSchoolItemDto.category1Name) && epx.f(this.adsPostsInfo, educationSchoolItemDto.adsPostsInfo) && epx.f(this.thematic, educationSchoolItemDto.thematic) && epx.f(this.bannerAdsMainClient, educationSchoolItemDto.bannerAdsMainClient) && epx.f(this.bannerAdsSettingMiniapp, educationSchoolItemDto.bannerAdsSettingMiniapp) && epx.f(this.isManualMarkedBusiness, educationSchoolItemDto.isManualMarkedBusiness) && this.leaveMode == educationSchoolItemDto.leaveMode && epx.f(this.bannerAdsMainMvk, educationSchoolItemDto.bannerAdsMainMvk) && epx.f(this.isMediaWallEnabled, educationSchoolItemDto.isMediaWallEnabled) && epx.f(this.isMonetizationAvailable, educationSchoolItemDto.isMonetizationAvailable) && this.videoNotificationsStatus == educationSchoolItemDto.videoNotificationsStatus && epx.f(this.isVideoSubscriptionHidden, educationSchoolItemDto.isVideoSubscriptionHidden) && epx.f(this.suggestSubscribe, educationSchoolItemDto.suggestSubscribe) && epx.f(this.suggestedCategoryName, educationSchoolItemDto.suggestedCategoryName) && epx.f(this.isWorkGroup, educationSchoolItemDto.isWorkGroup) && epx.f(this.workGroupInfo, educationSchoolItemDto.workGroupInfo) && epx.f(this.url, educationSchoolItemDto.url) && epx.f(this.membersPreview, educationSchoolItemDto.membersPreview) && epx.f(this.strikesInfo, educationSchoolItemDto.strikesInfo) && epx.f(this.strikesRestrictions, educationSchoolItemDto.strikesRestrictions) && epx.f(this.coOwnershipEnabled, educationSchoolItemDto.coOwnershipEnabled) && epx.f(this.enabledFeatures, educationSchoolItemDto.enabledFeatures) && epx.f(this.canEditScreenName, educationSchoolItemDto.canEditScreenName) && epx.f(this.canCreateEvent, educationSchoolItemDto.canCreateEvent) && epx.f(this.tabs, educationSchoolItemDto.tabs) && epx.f(this.unreadCount, educationSchoolItemDto.unreadCount) && epx.f(this.videosCount, educationSchoolItemDto.videosCount) && epx.f(this.channelButton, educationSchoolItemDto.channelButton) && epx.f(this.aPlusMark, educationSchoolItemDto.aPlusMark) && epx.f(this.yclientsRepeatRecords, educationSchoolItemDto.yclientsRepeatRecords) && epx.f(this.channelInfo, educationSchoolItemDto.channelInfo) && epx.f(this.channelBlock, educationSchoolItemDto.channelBlock) && epx.f(this.isEducational, educationSchoolItemDto.isEducational) && epx.f(this.eventOrganizer, educationSchoolItemDto.eventOrganizer) && epx.f(this.videoChannelData, educationSchoolItemDto.videoChannelData) && epx.f(this.isTagsAvailable, educationSchoolItemDto.isTagsAvailable) && epx.f(this.isGroupDisplayed, educationSchoolItemDto.isGroupDisplayed) && epx.f(this.isMarketEnabled, educationSchoolItemDto.isMarketEnabled) && epx.f(this.contentSectionsData, educationSchoolItemDto.contentSectionsData) && epx.f(this.name, educationSchoolItemDto.name) && epx.f(this.screenName, educationSchoolItemDto.screenName) && this.isClosed == educationSchoolItemDto.isClosed && this.type == educationSchoolItemDto.type && this.channelType == educationSchoolItemDto.channelType && this.isAdmin == educationSchoolItemDto.isAdmin && this.adminLevel == educationSchoolItemDto.adminLevel && this.isMember == educationSchoolItemDto.isMember && this.isAdvertiser == educationSchoolItemDto.isAdvertiser && epx.f(this.startDate, educationSchoolItemDto.startDate) && epx.f(this.finishDate, educationSchoolItemDto.finishDate) && this.verified == educationSchoolItemDto.verified && epx.f(this.deactivated, educationSchoolItemDto.deactivated) && epx.f(this.photo50, educationSchoolItemDto.photo50) && epx.f(this.photo100, educationSchoolItemDto.photo100) && epx.f(this.photo200, educationSchoolItemDto.photo200) && epx.f(this.photo200Orig, educationSchoolItemDto.photo200Orig) && epx.f(this.photo400, educationSchoolItemDto.photo400) && epx.f(this.photo400Orig, educationSchoolItemDto.photo400Orig) && epx.f(this.photoMax, educationSchoolItemDto.photoMax) && epx.f(this.photoMaxOrig, educationSchoolItemDto.photoMaxOrig) && epx.f(this.photoBase, educationSchoolItemDto.photoBase) && epx.f(this.estDate, educationSchoolItemDto.estDate) && epx.f(this.publicDateLabel, educationSchoolItemDto.publicDateLabel) && epx.f(this.photoMaxSize, educationSchoolItemDto.photoMaxSize) && epx.f(this.appButton, educationSchoolItemDto.appButton) && epx.f(this.appButtons, educationSchoolItemDto.appButtons) && this.isVideoLiveNotificationsBlocked == educationSchoolItemDto.isVideoLiveNotificationsBlocked && epx.f(this.videoLive, educationSchoolItemDto.videoLive) && epx.f(this.hadTorch, educationSchoolItemDto.hadTorch) && epx.f(this.audioArtistId, educationSchoolItemDto.audioArtistId) && epx.f(this.audioCuratorId, educationSchoolItemDto.audioCuratorId) && epx.f(this.buttons, educationSchoolItemDto.buttons) && epx.f(this.isNftPhoto, educationSchoolItemDto.isNftPhoto) && epx.f(this.isCached, educationSchoolItemDto.isCached) && epx.f(this.market, educationSchoolItemDto.market) && epx.f(this.marketServices, educationSchoolItemDto.marketServices) && epx.f(this.hasMarketApp, educationSchoolItemDto.hasMarketApp) && epx.f(this.usingVkpayMarketApp, educationSchoolItemDto.usingVkpayMarketApp) && epx.f(this.isMarketCartEnabled, educationSchoolItemDto.isMarketCartEnabled) && epx.f(this.extendedMarket, educationSchoolItemDto.extendedMarket) && this.marketShopConditionsState == educationSchoolItemDto.marketShopConditionsState && epx.f(this.isMarketOnlineBookingSettingEnabled, educationSchoolItemDto.isMarketOnlineBookingSettingEnabled) && epx.f(this.isBindingToYclientsServiceEnabled, educationSchoolItemDto.isBindingToYclientsServiceEnabled) && epx.f(this.isMarketMarketLinkAttachmentEnabled, educationSchoolItemDto.isMarketMarketLinkAttachmentEnabled) && epx.f(this.isMarketMessageToBcAttachmentEnabled, educationSchoolItemDto.isMarketMessageToBcAttachmentEnabled) && epx.f(this.isMarketOnlineBookingActionButtonEnabled, educationSchoolItemDto.isMarketOnlineBookingActionButtonEnabled) && this.youlaStatus == educationSchoolItemDto.youlaStatus && epx.f(this.youlaUseWallpostRedirect, educationSchoolItemDto.youlaUseWallpostRedirect) && epx.f(this.youlaWallpostRedirectMiniappUrl, educationSchoolItemDto.youlaWallpostRedirectMiniappUrl) && epx.f(this.classifiedsAntibaraholkaDesignVersion, educationSchoolItemDto.classifiedsAntibaraholkaDesignVersion) && epx.f(this.isYoulaPostingToWallAllowed, educationSchoolItemDto.isYoulaPostingToWallAllowed) && this.youlaPostingMethod == educationSchoolItemDto.youlaPostingMethod;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        List<EducationGradeItemDto> list = this.grades;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.userTitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.userRole;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        EducationOrganizationTypeDto educationOrganizationTypeDto = this.organizationType;
        int hashCode5 = (hashCode4 + (educationOrganizationTypeDto == null ? 0 : educationOrganizationTypeDto.hashCode())) * 31;
        EducationVendorItemDto educationVendorItemDto = this.vendor;
        int hashCode6 = (hashCode5 + (educationVendorItemDto == null ? 0 : educationVendorItemDto.hashCode())) * 31;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        int hashCode7 = (hashCode6 + (groupsGroupFullMemberStatusDto == null ? 0 : groupsGroupFullMemberStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isAdult;
        int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isHiddenFromFeed;
        int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFavorite;
        int hashCode10 = (hashCode9 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.isSubscribed;
        int hashCode11 = (hashCode10 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseObjectDto baseObjectDto = this.city;
        int hashCode12 = (hashCode11 + (baseObjectDto == null ? 0 : baseObjectDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode13 = (hashCode12 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        String str2 = this.description;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wikiPage;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.membersCountText;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.requestsCount;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode19 = (hashCode18 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Integer num4 = this.videoLiveLevel;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoLiveCount;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.clipsCount;
        int hashCode22 = (hashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        GroupsCountersGroupDto groupsCountersGroupDto = this.counters;
        int hashCode23 = (hashCode22 + (groupsCountersGroupDto == null ? 0 : groupsCountersGroupDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode24 = (hashCode23 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto2 = this.videoCover;
        int hashCode25 = (hashCode24 + (baseOwnerCoverDto2 == null ? 0 : baseOwnerCoverDto2.hashCode())) * 31;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto = this.videoLivesData;
        int hashCode26 = (hashCode25 + (groupsVideoLivesDataDto == null ? 0 : groupsVideoLivesDataDto.hashCode())) * 31;
        String str5 = this.photoAvgColor;
        int hashCode27 = (hashCode26 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.inn;
        int hashCode28 = (hashCode27 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ogrn;
        int hashCode29 = (hashCode28 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.kpp;
        int hashCode30 = (hashCode29 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.hasLiveCover;
        int hashCode31 = (hashCode30 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasStories;
        int hashCode32 = (hashCode31 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode33 = (hashCode32 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSuggest;
        int hashCode34 = (hashCode33 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canUploadStory;
        int hashCode35 = (hashCode34 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        Boolean bool3 = this.canCallToCommunity;
        int hashCode36 = (hashCode35 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canUploadDoc;
        int hashCode37 = (hashCode36 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.canUploadVideo;
        int hashCode38 = (hashCode37 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canUploadVideoThumb;
        int hashCode39 = (hashCode38 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.canUploadClip;
        int hashCode40 = (hashCode39 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeAllPosts;
        int hashCode41 = (hashCode40 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canCreateTopic;
        int hashCode42 = (hashCode41 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        String str9 = this.activity;
        int hashCode43 = (hashCode42 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num7 = this.fixedPost;
        int hashCode44 = (hashCode43 + (num7 == null ? 0 : num7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.hasPhoto;
        int hashCode45 = (hashCode44 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode46 = (hashCode45 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        String str10 = this.status;
        int hashCode47 = (hashCode46 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode48 = (hashCode47 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        Integer num8 = this.mainAlbumId;
        int hashCode49 = (hashCode48 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<GroupsLinksItemDto> list2 = this.links;
        int hashCode50 = (hashCode49 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsContactsItemDto> list3 = this.contacts;
        int hashCode51 = (hashCode50 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WallDto wallDto = this.wall;
        int hashCode52 = (hashCode51 + (wallDto == null ? 0 : wallDto.hashCode())) * 31;
        String str11 = this.site;
        int hashCode53 = (hashCode52 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool4 = this.isSiteDisplayed;
        int hashCode54 = (hashCode53 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        int hashCode55 = (hashCode54 + (groupsGroupFullSectionDto == null ? 0 : groupsGroupFullSectionDto.hashCode())) * 31;
        GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = this.primaryBlock;
        int hashCode56 = (hashCode55 + (groupsPrimaryBlockSettingsDto == null ? 0 : groupsPrimaryBlockSettingsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.trending;
        int hashCode57 = (hashCode56 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.canMessage;
        int hashCode58 = (hashCode57 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isMessagesBlocked;
        int hashCode59 = (hashCode58 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.canSendNotify;
        int hashCode60 = (hashCode59 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        GroupsOnlineStatusDto groupsOnlineStatusDto = this.onlineStatus;
        int hashCode61 = (hashCode60 + (groupsOnlineStatusDto == null ? 0 : groupsOnlineStatusDto.hashCode())) * 31;
        Integer num9 = this.invitedBy;
        int hashCode62 = (hashCode61 + (num9 == null ? 0 : num9.hashCode())) * 31;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = this.ageLimits;
        int hashCode63 = (hashCode62 + (groupsGroupFullAgeLimitsDto == null ? 0 : groupsGroupFullAgeLimitsDto.hashCode())) * 31;
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = this.ageMark;
        int hashCode64 = (hashCode63 + (groupsGroupFullAgeMarkDto == null ? 0 : groupsGroupFullAgeMarkDto.hashCode())) * 31;
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = this.banInfo;
        int hashCode65 = (hashCode64 + (groupsGroupBanInfoDto == null ? 0 : groupsGroupBanInfoDto.hashCode())) * 31;
        GroupsActionButtonDto groupsActionButtonDto = this.actionButton;
        int hashCode66 = (hashCode65 + (groupsActionButtonDto == null ? 0 : groupsActionButtonDto.hashCode())) * 31;
        Integer num10 = this.authorId;
        int hashCode67 = (hashCode66 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str12 = this.phone;
        int hashCode68 = (hashCode67 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool5 = this.isWidgetMessagesEnabled;
        int hashCode69 = (hashCode68 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.vkpayCanTransfer;
        int hashCode70 = (hashCode69 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num11 = this.vkpayReceiverId;
        int hashCode71 = (hashCode70 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool7 = this.hasGroupChannel;
        int hashCode72 = (hashCode71 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Object obj = this.groupChannel;
        int hashCode73 = (hashCode72 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num12 = this.communityChannelId;
        int hashCode74 = (hashCode73 + (num12 == null ? 0 : num12.hashCode())) * 31;
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        int hashCode75 = (hashCode74 + (groupsAddressesInfoDto == null ? 0 : groupsAddressesInfoDto.hashCode())) * 31;
        Boolean bool8 = this.messages;
        int hashCode76 = (hashCode75 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isAue;
        int hashCode77 = (hashCode76 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.prohibitedContentAdultMark;
        int hashCode78 = (hashCode77 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isSubscribedPodcasts;
        int hashCode79 = (hashCode78 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.canSubscribePodcasts;
        int hashCode80 = (hashCode79 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.isSubscribedStories;
        int hashCode81 = (hashCode80 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.canSubscribeStories;
        int hashCode82 = (hashCode81 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canSubscribePosts;
        int hashCode83 = (hashCode82 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        GroupsLiveCoversDto groupsLiveCoversDto = this.liveCovers;
        int hashCode84 = (hashCode83 + (groupsLiveCoversDto == null ? 0 : groupsLiveCoversDto.hashCode())) * 31;
        GroupsVkAdminStatusDto groupsVkAdminStatusDto = this.vkAdminStatus;
        int hashCode85 = (hashCode84 + (groupsVkAdminStatusDto == null ? 0 : groupsVkAdminStatusDto.hashCode())) * 31;
        GroupsMenuDto groupsMenuDto = this.menu;
        int hashCode86 = (hashCode85 + (groupsMenuDto == null ? 0 : groupsMenuDto.hashCode())) * 31;
        GroupsWarningNotificationDto groupsWarningNotificationDto = this.warningNotification;
        int hashCode87 = (hashCode86 + (groupsWarningNotificationDto == null ? 0 : groupsWarningNotificationDto.hashCode())) * 31;
        Integer num13 = this.createDate;
        int hashCode88 = (hashCode87 + (num13 == null ? 0 : num13.hashCode())) * 31;
        GroupsGroupDonutDto groupsGroupDonutDto = this.donut;
        int hashCode89 = (hashCode88 + (groupsGroupDonutDto == null ? 0 : groupsGroupDonutDto.hashCode())) * 31;
        GroupsGroupVkTicketDto groupsGroupVkTicketDto = this.vkTicket;
        int hashCode90 = (hashCode89 + (groupsGroupVkTicketDto == null ? 0 : groupsGroupVkTicketDto.hashCode())) * 31;
        GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = this.donutBlock;
        int hashCode91 = (hashCode90 + (groupsGroupDonutBlockDto == null ? 0 : groupsGroupDonutBlockDto.hashCode())) * 31;
        GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = this.donutCommunityManagement;
        int hashCode92 = (hashCode91 + (groupsDonutCommunityManagementDto == null ? 0 : groupsDonutCommunityManagementDto.hashCode())) * 31;
        GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto = this.donutPaymentInfo;
        int hashCode93 = (hashCode92 + (groupsGroupDonutPaymentInfoDto == null ? 0 : groupsGroupDonutPaymentInfoDto.hashCode())) * 31;
        Integer num14 = this.canPostDonut;
        int hashCode94 = (hashCode93 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool16 = this.canSeeMembers;
        int hashCode95 = (hashCode94 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.msgPushAllowed;
        int hashCode96 = (hashCode95 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.msgNotificationsAllowed;
        int hashCode97 = (hashCode96 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        GroupsChatsStatusDto groupsChatsStatusDto = this.chatsStatus;
        int hashCode98 = (hashCode97 + (groupsChatsStatusDto == null ? 0 : groupsChatsStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.canReport;
        int hashCode99 = (hashCode98 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Float f = this.businessRating;
        int hashCode100 = (hashCode99 + (f == null ? 0 : f.hashCode())) * 31;
        String str13 = this.isBusiness;
        int hashCode101 = (hashCode100 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool17 = this.isBusinessCategory;
        int hashCode102 = (hashCode101 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isConfirmedBusiness;
        int hashCode103 = (hashCode102 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.isGoldenMarkedBusiness;
        int hashCode104 = (hashCode103 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        TrustMarkDto trustMarkDto = this.trustMark;
        int hashCode105 = (hashCode104 + (trustMarkDto == null ? 0 : trustMarkDto.hashCode())) * 31;
        GroupsMicrolandingDto groupsMicrolandingDto = this.microlanding;
        int hashCode106 = (hashCode105 + (groupsMicrolandingDto == null ? 0 : groupsMicrolandingDto.hashCode())) * 31;
        GroupsTariffsDto groupsTariffsDto = this.tariffs;
        int hashCode107 = (hashCode106 + (groupsTariffsDto == null ? 0 : groupsTariffsDto.hashCode())) * 31;
        Integer num15 = this.verificationEndTime;
        int hashCode108 = (hashCode107 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool20 = this.canManage;
        int hashCode109 = (hashCode108 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        DisallowManageReasonDto disallowManageReasonDto = this.disallowManageReason;
        int hashCode110 = (hashCode109 + (disallowManageReasonDto == null ? 0 : disallowManageReasonDto.hashCode())) * 31;
        String str14 = this.disallowManageReasonMessage;
        int hashCode111 = (hashCode110 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.hasSuggestions;
        int hashCode112 = (hashCode111 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = this.showSuggestions;
        int hashCode113 = (hashCode112 + (groupsGroupFullShowSuggestionsDto == null ? 0 : groupsGroupFullShowSuggestionsDto.hashCode())) * 31;
        Boolean bool21 = this.canViewStats;
        int hashCode114 = (hashCode113 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.canViewPostReachStats;
        int hashCode115 = (hashCode114 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Integer num16 = this.storiesArchiveCount;
        int hashCode116 = (hashCode115 + (num16 == null ? 0 : num16.hashCode())) * 31;
        GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = this.adsEasyPromote;
        int hashCode117 = (hashCode116 + (groupsAdsEasyPromoteDto == null ? 0 : groupsAdsEasyPromoteDto.hashCode())) * 31;
        Boolean bool23 = this.adsEasyPromoteAllowed;
        int hashCode118 = (hashCode117 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Integer num17 = this.adsPostingRestrictedToday;
        int hashCode119 = (hashCode118 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Boolean bool24 = this.adsMarketAutopromoteAllowed;
        int hashCode120 = (hashCode119 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Object obj2 = this.adsMarketEasyPromote;
        int hashCode121 = (hashCode120 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.adsMarketAutopromoteReasonsNotAllowed;
        int hashCode122 = (hashCode121 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.adsMarketServicesAutopromoteReasonsNotAllowed;
        int hashCode123 = (hashCode122 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Boolean bool25 = this.adsMarketServicesAutopromoteAllowed;
        int hashCode124 = (hashCode123 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Object obj5 = this.adsMarketServicesEasyPromote;
        int hashCode125 = (hashCode124 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.adsEasyPromoteReasonsNotAllowed;
        int hashCode126 = (hashCode125 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Boolean bool26 = this.canSeeInviteLinks;
        int hashCode127 = (hashCode126 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Integer num18 = this.categoryV2;
        int hashCode128 = (hashCode127 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.subjectId;
        int hashCode129 = (hashCode128 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.publicCategory;
        int hashCode130 = (hashCode129 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.publicSubcategory;
        int hashCode131 = (hashCode130 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.installedAppsCount;
        int hashCode132 = (hashCode131 + (num22 == null ? 0 : num22.hashCode())) * 31;
        GroupsGroupLikeItemDto groupsGroupLikeItemDto = this.like;
        int hashCode133 = (hashCode132 + (groupsGroupLikeItemDto == null ? 0 : groupsGroupLikeItemDto.hashCode())) * 31;
        GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = this.loginConfirmationStatus;
        int hashCode134 = (hashCode133 + (groupsLoginConfirmationStatusDto == null ? 0 : groupsLoginConfirmationStatusDto.hashCode())) * 31;
        Boolean bool27 = this.hasUnseenStories;
        int hashCode135 = (hashCode134 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Integer num23 = this.category;
        int hashCode136 = (hashCode135 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.category0;
        int hashCode137 = (hashCode136 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.category1;
        int hashCode138 = (hashCode137 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.category2;
        int hashCode139 = (hashCode138 + (num26 == null ? 0 : num26.hashCode())) * 31;
        GroupsGroupFriendsDto groupsGroupFriendsDto = this.friends;
        int hashCode140 = (hashCode139 + (groupsGroupFriendsDto == null ? 0 : groupsGroupFriendsDto.hashCode())) * 31;
        String str15 = this.deactivatedMessage;
        int hashCode141 = (hashCode140 + (str15 == null ? 0 : str15.hashCode())) * 31;
        DeactivatedTypeDto deactivatedTypeDto = this.deactivatedType;
        int hashCode142 = (hashCode141 + (deactivatedTypeDto == null ? 0 : deactivatedTypeDto.hashCode())) * 31;
        String str16 = this.targArtistId;
        int hashCode143 = (hashCode142 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool28 = this.isGovernmentOrganization;
        int hashCode144 = (hashCode143 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.settingsTooltipsActive;
        int hashCode145 = (hashCode144 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isYclientsTooltipActive;
        int hashCode146 = (hashCode145 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        MarketCommunityRatingDto marketCommunityRatingDto = this.rating;
        int hashCode147 = (hashCode146 + (marketCommunityRatingDto == null ? 0 : marketCommunityRatingDto.hashCode())) * 31;
        GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = this.nameHistory;
        int hashCode148 = (hashCode147 + (groupsGroupNameHistoryDto == null ? 0 : groupsGroupNameHistoryDto.hashCode())) * 31;
        MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = this.serviceRating;
        int hashCode149 = (hashCode148 + (marketCommunityServiceRatingDto == null ? 0 : marketCommunityServiceRatingDto.hashCode())) * 31;
        GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = this.recommendedTipsWidget;
        int hashCode150 = (hashCode149 + (groupsRecommendedTipsWidgetDto == null ? 0 : groupsRecommendedTipsWidgetDto.hashCode())) * 31;
        String str17 = this.region;
        int hashCode151 = (hashCode150 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.subject;
        int hashCode152 = (hashCode151 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool31 = this.isSetTabOrder;
        int hashCode153 = (hashCode152 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isShowBusinessOnboarding;
        int hashCode154 = (hashCode153 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.businessCommunityTooltips;
        int hashCode155 = (hashCode154 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.repostsDisabled;
        int hashCode156 = (hashCode155 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.videoLivesStreamingBanned;
        int hashCode157 = (hashCode156 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        String str19 = this.category1Name;
        int hashCode158 = (hashCode157 + (str19 == null ? 0 : str19.hashCode())) * 31;
        GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = this.adsPostsInfo;
        int hashCode159 = (hashCode158 + (groupsAdsPostsInfoDto == null ? 0 : groupsAdsPostsInfoDto.hashCode())) * 31;
        String str20 = this.thematic;
        int hashCode160 = (hashCode159 + (str20 == null ? 0 : str20.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto = this.bannerAdsMainClient;
        int hashCode161 = (hashCode160 + (groupsBannerDto == null ? 0 : groupsBannerDto.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto2 = this.bannerAdsSettingMiniapp;
        int hashCode162 = (hashCode161 + (groupsBannerDto2 == null ? 0 : groupsBannerDto2.hashCode())) * 31;
        Boolean bool36 = this.isManualMarkedBusiness;
        int hashCode163 = (hashCode162 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        LeaveModeDto leaveModeDto = this.leaveMode;
        int hashCode164 = (hashCode163 + (leaveModeDto == null ? 0 : leaveModeDto.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto3 = this.bannerAdsMainMvk;
        int hashCode165 = (hashCode164 + (groupsBannerDto3 == null ? 0 : groupsBannerDto3.hashCode())) * 31;
        Boolean bool37 = this.isMediaWallEnabled;
        int hashCode166 = (hashCode165 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Boolean bool38 = this.isMonetizationAvailable;
        int hashCode167 = (hashCode166 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        VideoNotificationsStatusDto videoNotificationsStatusDto = this.videoNotificationsStatus;
        int hashCode168 = (hashCode167 + (videoNotificationsStatusDto == null ? 0 : videoNotificationsStatusDto.hashCode())) * 31;
        Boolean bool39 = this.isVideoSubscriptionHidden;
        int hashCode169 = (hashCode168 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.suggestSubscribe;
        int hashCode170 = (hashCode169 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        String str21 = this.suggestedCategoryName;
        int hashCode171 = (hashCode170 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Boolean bool41 = this.isWorkGroup;
        int hashCode172 = (hashCode171 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = this.workGroupInfo;
        int hashCode173 = (hashCode172 + (groupsWorkGroupInfoDto == null ? 0 : groupsWorkGroupInfoDto.hashCode())) * 31;
        String str22 = this.url;
        int hashCode174 = (hashCode173 + (str22 == null ? 0 : str22.hashCode())) * 31;
        GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = this.membersPreview;
        int hashCode175 = (hashCode174 + (groupsGroupFullMembersPreviewDto == null ? 0 : groupsGroupFullMembersPreviewDto.hashCode())) * 31;
        GroupsStrikesInfoDto groupsStrikesInfoDto = this.strikesInfo;
        int hashCode176 = (hashCode175 + (groupsStrikesInfoDto == null ? 0 : groupsStrikesInfoDto.hashCode())) * 31;
        GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto = this.strikesRestrictions;
        int hashCode177 = (hashCode176 + (groupsStrikesRestrictionsDto == null ? 0 : groupsStrikesRestrictionsDto.hashCode())) * 31;
        Boolean bool42 = this.coOwnershipEnabled;
        int hashCode178 = (hashCode177 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        List<String> list4 = this.enabledFeatures;
        int hashCode179 = (hashCode178 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool43 = this.canEditScreenName;
        int hashCode180 = (hashCode179 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.canCreateEvent;
        int hashCode181 = (hashCode180 + (bool44 == null ? 0 : bool44.hashCode())) * 31;
        List<GroupsTabSettingsDto> list5 = this.tabs;
        int hashCode182 = (hashCode181 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num27 = this.unreadCount;
        int hashCode183 = (hashCode182 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.videosCount;
        int hashCode184 = (hashCode183 + (num28 == null ? 0 : num28.hashCode())) * 31;
        GroupsSimpleButtonDto groupsSimpleButtonDto = this.channelButton;
        int hashCode185 = (hashCode184 + (groupsSimpleButtonDto == null ? 0 : groupsSimpleButtonDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode186 = (hashCode185 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        List<ServiceBookingRepeatRecordDto> list6 = this.yclientsRepeatRecords;
        int hashCode187 = (hashCode186 + (list6 == null ? 0 : list6.hashCode())) * 31;
        GroupsChannelInfoDto groupsChannelInfoDto = this.channelInfo;
        int hashCode188 = (hashCode187 + (groupsChannelInfoDto == null ? 0 : groupsChannelInfoDto.hashCode())) * 31;
        GroupsChannelBlockDto groupsChannelBlockDto = this.channelBlock;
        int hashCode189 = (hashCode188 + (groupsChannelBlockDto == null ? 0 : groupsChannelBlockDto.hashCode())) * 31;
        Boolean bool45 = this.isEducational;
        int hashCode190 = (hashCode189 + (bool45 == null ? 0 : bool45.hashCode())) * 31;
        GroupsEventOrganizerDto groupsEventOrganizerDto = this.eventOrganizer;
        int hashCode191 = (hashCode190 + (groupsEventOrganizerDto == null ? 0 : groupsEventOrganizerDto.hashCode())) * 31;
        GroupsVideoChannelDataDto groupsVideoChannelDataDto = this.videoChannelData;
        int hashCode192 = (hashCode191 + (groupsVideoChannelDataDto == null ? 0 : groupsVideoChannelDataDto.hashCode())) * 31;
        Boolean bool46 = this.isTagsAvailable;
        int hashCode193 = (hashCode192 + (bool46 == null ? 0 : bool46.hashCode())) * 31;
        Boolean bool47 = this.isGroupDisplayed;
        int hashCode194 = (hashCode193 + (bool47 == null ? 0 : bool47.hashCode())) * 31;
        Boolean bool48 = this.isMarketEnabled;
        int hashCode195 = (hashCode194 + (bool48 == null ? 0 : bool48.hashCode())) * 31;
        GroupsContentSectionsDataDto groupsContentSectionsDataDto = this.contentSectionsData;
        int hashCode196 = (hashCode195 + (groupsContentSectionsDataDto == null ? 0 : groupsContentSectionsDataDto.hashCode())) * 31;
        String str23 = this.name;
        int hashCode197 = (hashCode196 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.screenName;
        int hashCode198 = (hashCode197 + (str24 == null ? 0 : str24.hashCode())) * 31;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        int hashCode199 = (hashCode198 + (groupsGroupIsClosedDto == null ? 0 : groupsGroupIsClosedDto.hashCode())) * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        int hashCode200 = (hashCode199 + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31;
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        int hashCode201 = (hashCode200 + (channelsChannelTypeDto == null ? 0 : channelsChannelTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.isAdmin;
        int hashCode202 = (hashCode201 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode203 = (hashCode202 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto24 = this.isMember;
        int hashCode204 = (hashCode203 + (baseBoolIntDto24 == null ? 0 : baseBoolIntDto24.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto25 = this.isAdvertiser;
        int hashCode205 = (hashCode204 + (baseBoolIntDto25 == null ? 0 : baseBoolIntDto25.hashCode())) * 31;
        Integer num29 = this.startDate;
        int hashCode206 = (hashCode205 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.finishDate;
        int hashCode207 = (hashCode206 + (num30 == null ? 0 : num30.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto26 = this.verified;
        int hashCode208 = (hashCode207 + (baseBoolIntDto26 == null ? 0 : baseBoolIntDto26.hashCode())) * 31;
        String str25 = this.deactivated;
        int hashCode209 = (hashCode208 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.photo50;
        int hashCode210 = (hashCode209 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.photo100;
        int hashCode211 = (hashCode210 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.photo200;
        int hashCode212 = (hashCode211 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.photo200Orig;
        int hashCode213 = (hashCode212 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.photo400;
        int hashCode214 = (hashCode213 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.photo400Orig;
        int hashCode215 = (hashCode214 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.photoMax;
        int hashCode216 = (hashCode215 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.photoMaxOrig;
        int hashCode217 = (hashCode216 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.photoBase;
        int hashCode218 = (hashCode217 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.estDate;
        int hashCode219 = (hashCode218 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.publicDateLabel;
        int hashCode220 = (hashCode219 + (str36 == null ? 0 : str36.hashCode())) * 31;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        int hashCode221 = (hashCode220 + (groupsPhotoSizeDto == null ? 0 : groupsPhotoSizeDto.hashCode())) * 31;
        GroupsAppButtonDto groupsAppButtonDto = this.appButton;
        int hashCode222 = (hashCode221 + (groupsAppButtonDto == null ? 0 : groupsAppButtonDto.hashCode())) * 31;
        List<GroupsAppButtonDto> list7 = this.appButtons;
        int hashCode223 = (hashCode222 + (list7 == null ? 0 : list7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto27 = this.isVideoLiveNotificationsBlocked;
        int hashCode224 = (hashCode223 + (baseBoolIntDto27 == null ? 0 : baseBoolIntDto27.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode225 = (hashCode224 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        Boolean bool49 = this.hadTorch;
        int hashCode226 = (hashCode225 + (bool49 == null ? 0 : bool49.hashCode())) * 31;
        String str37 = this.audioArtistId;
        int hashCode227 = (hashCode226 + (str37 == null ? 0 : str37.hashCode())) * 31;
        Integer num31 = this.audioCuratorId;
        int hashCode228 = (hashCode227 + (num31 == null ? 0 : num31.hashCode())) * 31;
        List<BaseOwnerButtonDto> list8 = this.buttons;
        int hashCode229 = (hashCode228 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool50 = this.isNftPhoto;
        int hashCode230 = (hashCode229 + (bool50 == null ? 0 : bool50.hashCode())) * 31;
        Boolean bool51 = this.isCached;
        int hashCode231 = (hashCode230 + (bool51 == null ? 0 : bool51.hashCode())) * 31;
        GroupsMarketInfoDto groupsMarketInfoDto = this.market;
        int hashCode232 = (hashCode231 + (groupsMarketInfoDto == null ? 0 : groupsMarketInfoDto.hashCode())) * 31;
        GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = this.marketServices;
        int hashCode233 = (hashCode232 + (groupsMarketServicesInfoDto == null ? 0 : groupsMarketServicesInfoDto.hashCode())) * 31;
        Boolean bool52 = this.hasMarketApp;
        int hashCode234 = (hashCode233 + (bool52 == null ? 0 : bool52.hashCode())) * 31;
        Boolean bool53 = this.usingVkpayMarketApp;
        int hashCode235 = (hashCode234 + (bool53 == null ? 0 : bool53.hashCode())) * 31;
        Boolean bool54 = this.isMarketCartEnabled;
        int hashCode236 = (hashCode235 + (bool54 == null ? 0 : bool54.hashCode())) * 31;
        GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto = this.extendedMarket;
        int hashCode237 = (hashCode236 + (groupsGroupExtendedMarketSectionsDto == null ? 0 : groupsGroupExtendedMarketSectionsDto.hashCode())) * 31;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto = this.marketShopConditionsState;
        int hashCode238 = (hashCode237 + (groupsMarketShopConditionsStateDto == null ? 0 : groupsMarketShopConditionsStateDto.hashCode())) * 31;
        Boolean bool55 = this.isMarketOnlineBookingSettingEnabled;
        int hashCode239 = (hashCode238 + (bool55 == null ? 0 : bool55.hashCode())) * 31;
        Boolean bool56 = this.isBindingToYclientsServiceEnabled;
        int hashCode240 = (hashCode239 + (bool56 == null ? 0 : bool56.hashCode())) * 31;
        Boolean bool57 = this.isMarketMarketLinkAttachmentEnabled;
        int hashCode241 = (hashCode240 + (bool57 == null ? 0 : bool57.hashCode())) * 31;
        Boolean bool58 = this.isMarketMessageToBcAttachmentEnabled;
        int hashCode242 = (hashCode241 + (bool58 == null ? 0 : bool58.hashCode())) * 31;
        Boolean bool59 = this.isMarketOnlineBookingActionButtonEnabled;
        int hashCode243 = (hashCode242 + (bool59 == null ? 0 : bool59.hashCode())) * 31;
        YoulaStatusDto youlaStatusDto = this.youlaStatus;
        int hashCode244 = (hashCode243 + (youlaStatusDto == null ? 0 : youlaStatusDto.hashCode())) * 31;
        Boolean bool60 = this.youlaUseWallpostRedirect;
        int hashCode245 = (hashCode244 + (bool60 == null ? 0 : bool60.hashCode())) * 31;
        String str38 = this.youlaWallpostRedirectMiniappUrl;
        int hashCode246 = (hashCode245 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Integer num32 = this.classifiedsAntibaraholkaDesignVersion;
        int hashCode247 = (hashCode246 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Boolean bool61 = this.isYoulaPostingToWallAllowed;
        int hashCode248 = (hashCode247 + (bool61 == null ? 0 : bool61.hashCode())) * 31;
        YoulaPostingMethodDto youlaPostingMethodDto = this.youlaPostingMethod;
        return hashCode248 + (youlaPostingMethodDto != null ? youlaPostingMethodDto.hashCode() : 0);
    }

    public final String toString() {
        return "EducationSchoolItemDto(id=" + this.id + ", grades=" + this.grades + ", userTitle=" + this.userTitle + ", userRole=" + this.userRole + ", organizationType=" + this.organizationType + ", vendor=" + this.vendor + ", memberStatus=" + this.memberStatus + ", isAdult=" + this.isAdult + ", isHiddenFromFeed=" + this.isHiddenFromFeed + ", isFavorite=" + this.isFavorite + ", isSubscribed=" + this.isSubscribed + ", city=" + this.city + ", country=" + this.country + ", description=" + this.description + ", wikiPage=" + this.wikiPage + ", membersCount=" + this.membersCount + ", membersCountText=" + this.membersCountText + ", requestsCount=" + this.requestsCount + ", musicAwards=" + this.musicAwards + ", videoLiveLevel=" + this.videoLiveLevel + ", videoLiveCount=" + this.videoLiveCount + ", clipsCount=" + this.clipsCount + ", counters=" + this.counters + ", cover=" + this.cover + ", videoCover=" + this.videoCover + ", videoLivesData=" + this.videoLivesData + ", photoAvgColor=" + this.photoAvgColor + ", inn=" + this.inn + ", ogrn=" + this.ogrn + ", kpp=" + this.kpp + ", hasLiveCover=" + this.hasLiveCover + ", hasStories=" + this.hasStories + ", canPost=" + this.canPost + ", canSuggest=" + this.canSuggest + ", canUploadStory=" + this.canUploadStory + ", canCallToCommunity=" + this.canCallToCommunity + ", canUploadDoc=" + this.canUploadDoc + ", canUploadVideo=" + this.canUploadVideo + ", canUploadVideoThumb=" + this.canUploadVideoThumb + ", canUploadClip=" + this.canUploadClip + ", canSeeAllPosts=" + this.canSeeAllPosts + ", canCreateTopic=" + this.canCreateTopic + ", activity=" + this.activity + ", fixedPost=" + this.fixedPost + ", hasPhoto=" + this.hasPhoto + ", cropPhoto=" + this.cropPhoto + ", status=" + this.status + ", statusAudio=" + this.statusAudio + ", mainAlbumId=" + this.mainAlbumId + ", links=" + this.links + ", contacts=" + this.contacts + ", wall=" + this.wall + ", site=" + this.site + ", isSiteDisplayed=" + this.isSiteDisplayed + ", mainSection=" + this.mainSection + ", primaryBlock=" + this.primaryBlock + ", trending=" + this.trending + ", canMessage=" + this.canMessage + ", isMessagesBlocked=" + this.isMessagesBlocked + ", canSendNotify=" + this.canSendNotify + ", onlineStatus=" + this.onlineStatus + ", invitedBy=" + this.invitedBy + ", ageLimits=" + this.ageLimits + ", ageMark=" + this.ageMark + ", banInfo=" + this.banInfo + ", actionButton=" + this.actionButton + ", authorId=" + this.authorId + ", phone=" + this.phone + ", isWidgetMessagesEnabled=" + this.isWidgetMessagesEnabled + ", vkpayCanTransfer=" + this.vkpayCanTransfer + ", vkpayReceiverId=" + this.vkpayReceiverId + ", hasGroupChannel=" + this.hasGroupChannel + ", groupChannel=" + this.groupChannel + ", communityChannelId=" + this.communityChannelId + ", addresses=" + this.addresses + ", messages=" + this.messages + ", isAue=" + this.isAue + ", prohibitedContentAdultMark=" + this.prohibitedContentAdultMark + ", isSubscribedPodcasts=" + this.isSubscribedPodcasts + ", canSubscribePodcasts=" + this.canSubscribePodcasts + ", isSubscribedStories=" + this.isSubscribedStories + ", canSubscribeStories=" + this.canSubscribeStories + ", canSubscribePosts=" + this.canSubscribePosts + ", liveCovers=" + this.liveCovers + ", vkAdminStatus=" + this.vkAdminStatus + ", menu=" + this.menu + ", warningNotification=" + this.warningNotification + ", createDate=" + this.createDate + ", donut=" + this.donut + ", vkTicket=" + this.vkTicket + ", donutBlock=" + this.donutBlock + ", donutCommunityManagement=" + this.donutCommunityManagement + ", donutPaymentInfo=" + this.donutPaymentInfo + ", canPostDonut=" + this.canPostDonut + ", canSeeMembers=" + this.canSeeMembers + ", msgPushAllowed=" + this.msgPushAllowed + ", msgNotificationsAllowed=" + this.msgNotificationsAllowed + ", chatsStatus=" + this.chatsStatus + ", canReport=" + this.canReport + ", businessRating=" + this.businessRating + ", isBusiness=" + this.isBusiness + ", isBusinessCategory=" + this.isBusinessCategory + ", isConfirmedBusiness=" + this.isConfirmedBusiness + ", isGoldenMarkedBusiness=" + this.isGoldenMarkedBusiness + ", trustMark=" + this.trustMark + ", microlanding=" + this.microlanding + ", tariffs=" + this.tariffs + ", verificationEndTime=" + this.verificationEndTime + ", canManage=" + this.canManage + ", disallowManageReason=" + this.disallowManageReason + ", disallowManageReasonMessage=" + this.disallowManageReasonMessage + ", hasSuggestions=" + this.hasSuggestions + ", showSuggestions=" + this.showSuggestions + ", canViewStats=" + this.canViewStats + ", canViewPostReachStats=" + this.canViewPostReachStats + ", storiesArchiveCount=" + this.storiesArchiveCount + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteAllowed=" + this.adsEasyPromoteAllowed + ", adsPostingRestrictedToday=" + this.adsPostingRestrictedToday + ", adsMarketAutopromoteAllowed=" + this.adsMarketAutopromoteAllowed + ", adsMarketEasyPromote=" + this.adsMarketEasyPromote + ", adsMarketAutopromoteReasonsNotAllowed=" + this.adsMarketAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteReasonsNotAllowed=" + this.adsMarketServicesAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteAllowed=" + this.adsMarketServicesAutopromoteAllowed + ", adsMarketServicesEasyPromote=" + this.adsMarketServicesEasyPromote + ", adsEasyPromoteReasonsNotAllowed=" + this.adsEasyPromoteReasonsNotAllowed + ", canSeeInviteLinks=" + this.canSeeInviteLinks + ", categoryV2=" + this.categoryV2 + ", subjectId=" + this.subjectId + ", publicCategory=" + this.publicCategory + ", publicSubcategory=" + this.publicSubcategory + ", installedAppsCount=" + this.installedAppsCount + ", like=" + this.like + ", loginConfirmationStatus=" + this.loginConfirmationStatus + ", hasUnseenStories=" + this.hasUnseenStories + ", category=" + this.category + ", category0=" + this.category0 + ", category1=" + this.category1 + ", category2=" + this.category2 + ", friends=" + this.friends + ", deactivatedMessage=" + this.deactivatedMessage + ", deactivatedType=" + this.deactivatedType + ", targArtistId=" + this.targArtistId + ", isGovernmentOrganization=" + this.isGovernmentOrganization + ", settingsTooltipsActive=" + this.settingsTooltipsActive + ", isYclientsTooltipActive=" + this.isYclientsTooltipActive + ", rating=" + this.rating + ", nameHistory=" + this.nameHistory + ", serviceRating=" + this.serviceRating + ", recommendedTipsWidget=" + this.recommendedTipsWidget + ", region=" + this.region + ", subject=" + this.subject + ", isSetTabOrder=" + this.isSetTabOrder + ", isShowBusinessOnboarding=" + this.isShowBusinessOnboarding + ", businessCommunityTooltips=" + this.businessCommunityTooltips + ", repostsDisabled=" + this.repostsDisabled + ", videoLivesStreamingBanned=" + this.videoLivesStreamingBanned + ", category1Name=" + this.category1Name + ", adsPostsInfo=" + this.adsPostsInfo + ", thematic=" + this.thematic + ", bannerAdsMainClient=" + this.bannerAdsMainClient + ", bannerAdsSettingMiniapp=" + this.bannerAdsSettingMiniapp + ", isManualMarkedBusiness=" + this.isManualMarkedBusiness + ", leaveMode=" + this.leaveMode + ", bannerAdsMainMvk=" + this.bannerAdsMainMvk + ", isMediaWallEnabled=" + this.isMediaWallEnabled + ", isMonetizationAvailable=" + this.isMonetizationAvailable + ", videoNotificationsStatus=" + this.videoNotificationsStatus + ", isVideoSubscriptionHidden=" + this.isVideoSubscriptionHidden + ", suggestSubscribe=" + this.suggestSubscribe + ", suggestedCategoryName=" + this.suggestedCategoryName + ", isWorkGroup=" + this.isWorkGroup + ", workGroupInfo=" + this.workGroupInfo + ", url=" + this.url + ", membersPreview=" + this.membersPreview + ", strikesInfo=" + this.strikesInfo + ", strikesRestrictions=" + this.strikesRestrictions + ", coOwnershipEnabled=" + this.coOwnershipEnabled + ", enabledFeatures=" + this.enabledFeatures + ", canEditScreenName=" + this.canEditScreenName + ", canCreateEvent=" + this.canCreateEvent + ", tabs=" + this.tabs + ", unreadCount=" + this.unreadCount + ", videosCount=" + this.videosCount + ", channelButton=" + this.channelButton + ", aPlusMark=" + this.aPlusMark + ", yclientsRepeatRecords=" + this.yclientsRepeatRecords + ", channelInfo=" + this.channelInfo + ", channelBlock=" + this.channelBlock + ", isEducational=" + this.isEducational + ", eventOrganizer=" + this.eventOrganizer + ", videoChannelData=" + this.videoChannelData + ", isTagsAvailable=" + this.isTagsAvailable + ", isGroupDisplayed=" + this.isGroupDisplayed + ", isMarketEnabled=" + this.isMarketEnabled + ", contentSectionsData=" + this.contentSectionsData + ", name=" + this.name + ", screenName=" + this.screenName + ", isClosed=" + this.isClosed + ", type=" + this.type + ", channelType=" + this.channelType + ", isAdmin=" + this.isAdmin + ", adminLevel=" + this.adminLevel + ", isMember=" + this.isMember + ", isAdvertiser=" + this.isAdvertiser + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate + ", verified=" + this.verified + ", deactivated=" + this.deactivated + ", photo50=" + this.photo50 + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", photo200Orig=" + this.photo200Orig + ", photo400=" + this.photo400 + ", photo400Orig=" + this.photo400Orig + ", photoMax=" + this.photoMax + ", photoMaxOrig=" + this.photoMaxOrig + ", photoBase=" + this.photoBase + ", estDate=" + this.estDate + ", publicDateLabel=" + this.publicDateLabel + ", photoMaxSize=" + this.photoMaxSize + ", appButton=" + this.appButton + ", appButtons=" + this.appButtons + ", isVideoLiveNotificationsBlocked=" + this.isVideoLiveNotificationsBlocked + ", videoLive=" + this.videoLive + ", hadTorch=" + this.hadTorch + ", audioArtistId=" + this.audioArtistId + ", audioCuratorId=" + this.audioCuratorId + ", buttons=" + this.buttons + ", isNftPhoto=" + this.isNftPhoto + ", isCached=" + this.isCached + ", market=" + this.market + ", marketServices=" + this.marketServices + ", hasMarketApp=" + this.hasMarketApp + ", usingVkpayMarketApp=" + this.usingVkpayMarketApp + ", isMarketCartEnabled=" + this.isMarketCartEnabled + ", extendedMarket=" + this.extendedMarket + ", marketShopConditionsState=" + this.marketShopConditionsState + ", isMarketOnlineBookingSettingEnabled=" + this.isMarketOnlineBookingSettingEnabled + ", isBindingToYclientsServiceEnabled=" + this.isBindingToYclientsServiceEnabled + ", isMarketMarketLinkAttachmentEnabled=" + this.isMarketMarketLinkAttachmentEnabled + ", isMarketMessageToBcAttachmentEnabled=" + this.isMarketMessageToBcAttachmentEnabled + ", isMarketOnlineBookingActionButtonEnabled=" + this.isMarketOnlineBookingActionButtonEnabled + ", youlaStatus=" + this.youlaStatus + ", youlaUseWallpostRedirect=" + this.youlaUseWallpostRedirect + ", youlaWallpostRedirectMiniappUrl=" + this.youlaWallpostRedirectMiniappUrl + ", classifiedsAntibaraholkaDesignVersion=" + this.classifiedsAntibaraholkaDesignVersion + ", isYoulaPostingToWallAllowed=" + this.isYoulaPostingToWallAllowed + ", youlaPostingMethod=" + this.youlaPostingMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        List<EducationGradeItemDto> list = this.grades;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((EducationGradeItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.userTitle);
        Integer num = this.userRole;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        EducationOrganizationTypeDto educationOrganizationTypeDto = this.organizationType;
        if (educationOrganizationTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationOrganizationTypeDto.writeToParcel(parcel, i);
        }
        EducationVendorItemDto educationVendorItemDto = this.vendor;
        if (educationVendorItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationVendorItemDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.memberStatus, i);
        parcel.writeParcelable(this.isAdult, i);
        parcel.writeParcelable(this.isHiddenFromFeed, i);
        parcel.writeParcelable(this.isFavorite, i);
        parcel.writeParcelable(this.isSubscribed, i);
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        parcel.writeString(this.description);
        parcel.writeString(this.wikiPage);
        Integer num2 = this.membersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.membersCountText);
        Integer num3 = this.requestsCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.musicAwards, i);
        Integer num4 = this.videoLiveLevel;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.videoLiveCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.clipsCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
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
        Integer num7 = this.fixedPost;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeParcelable(this.hasPhoto, i);
        parcel.writeParcelable(this.cropPhoto, i);
        parcel.writeString(this.status);
        parcel.writeParcelable(this.statusAudio, i);
        Integer num8 = this.mainAlbumId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        List<GroupsLinksItemDto> list2 = this.links;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsContactsItemDto> list3 = this.contacts;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
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
        Integer num9 = this.invitedBy;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeParcelable(this.ageLimits, i);
        parcel.writeParcelable(this.ageMark, i);
        parcel.writeParcelable(this.banInfo, i);
        parcel.writeParcelable(this.actionButton, i);
        Integer num10 = this.authorId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
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
        Integer num11 = this.vkpayReceiverId;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        Boolean bool7 = this.hasGroupChannel;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeValue(this.groupChannel);
        Integer num12 = this.communityChannelId;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
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
        Integer num13 = this.createDate;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        parcel.writeParcelable(this.donut, i);
        parcel.writeParcelable(this.vkTicket, i);
        parcel.writeParcelable(this.donutBlock, i);
        parcel.writeParcelable(this.donutCommunityManagement, i);
        parcel.writeParcelable(this.donutPaymentInfo, i);
        Integer num14 = this.canPostDonut;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
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
        Float f4 = this.businessRating;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f4);
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
        Integer num15 = this.verificationEndTime;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
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
        Integer num16 = this.storiesArchiveCount;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        parcel.writeParcelable(this.adsEasyPromote, i);
        Boolean bool23 = this.adsEasyPromoteAllowed;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        Integer num17 = this.adsPostingRestrictedToday;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
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
        Integer num18 = this.categoryV2;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
        Integer num19 = this.subjectId;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num19);
        }
        Integer num20 = this.publicCategory;
        if (num20 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num20);
        }
        Integer num21 = this.publicSubcategory;
        if (num21 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num21);
        }
        Integer num22 = this.installedAppsCount;
        if (num22 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num22);
        }
        parcel.writeParcelable(this.like, i);
        parcel.writeParcelable(this.loginConfirmationStatus, i);
        Boolean bool27 = this.hasUnseenStories;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool27);
        }
        Integer num23 = this.category;
        if (num23 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num23);
        }
        Integer num24 = this.category0;
        if (num24 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num24);
        }
        Integer num25 = this.category1;
        if (num25 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num25);
        }
        Integer num26 = this.category2;
        if (num26 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num26);
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
        List<GroupsTabSettingsDto> list4 = this.tabs;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        Integer num27 = this.unreadCount;
        if (num27 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num27);
        }
        Integer num28 = this.videosCount;
        if (num28 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num28);
        }
        parcel.writeParcelable(this.channelButton, i);
        parcel.writeParcelable(this.aPlusMark, i);
        List<ServiceBookingRepeatRecordDto> list5 = this.yclientsRepeatRecords;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
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
        Integer num29 = this.startDate;
        if (num29 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num29);
        }
        Integer num30 = this.finishDate;
        if (num30 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num30);
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
        List<GroupsAppButtonDto> list6 = this.appButtons;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
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
        Integer num31 = this.audioCuratorId;
        if (num31 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num31);
        }
        List<BaseOwnerButtonDto> list7 = this.buttons;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
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
        Integer num32 = this.classifiedsAntibaraholkaDesignVersion;
        if (num32 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num32);
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
}
