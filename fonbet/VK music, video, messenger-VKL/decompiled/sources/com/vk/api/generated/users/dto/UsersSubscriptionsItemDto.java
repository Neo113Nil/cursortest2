package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioMusicAwardsDto;
import com.vk.api.generated.base.dto.BaseAPlusMarkDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseObjectDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.calls.dto.CallsCustomNameForCallDto;
import com.vk.api.generated.channels.dto.ChannelsChannelTypeDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
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
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messagesEdu.dto.MessagesEduEducationalProfileDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRepeatRecordDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.video.dto.VideoLiveInfoDto;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.eok;
import xsna.epx;
import xsna.go9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersSubscriptionsItemDto.kt */
/* loaded from: classes15.dex */
public abstract class UsersSubscriptionsItemDto implements Parcelable {

    /* compiled from: UsersSubscriptionsItemDto.kt */
    public static final class Deserializer implements a9y<UsersSubscriptionsItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -309425751:
                        if (f.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                            return (UsersSubscriptionsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, UsersUserFullDto.class);
                        }
                        break;
                    case 3433103:
                        if (f.equals("page")) {
                            return (UsersSubscriptionsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GroupsGroupFullDto.class);
                        }
                        break;
                    case 96619420:
                        if (f.equals("email")) {
                            return (UsersSubscriptionsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, UsersUserFullDto.class);
                        }
                        break;
                    case 96891546:
                        if (f.equals(NotificationCompat.CATEGORY_EVENT)) {
                            return (UsersSubscriptionsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GroupsGroupFullDto.class);
                        }
                        break;
                    case 98629247:
                        if (f.equals("group")) {
                            return (UsersSubscriptionsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, GroupsGroupFullDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: UsersSubscriptionsItemDto.kt */
    public static final class GroupsGroupFullDto extends UsersSubscriptionsItemDto implements Parcelable {
        public static final Parcelable.Creator<GroupsGroupFullDto> CREATOR = new a();

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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class DeactivatedTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DeactivatedTypeDto[] $VALUES;

            @pmi0("banned")
            public static final DeactivatedTypeDto BANNED;
            public static final Parcelable.Creator<DeactivatedTypeDto> CREATOR;

            @pmi0("geo_blocked")
            public static final DeactivatedTypeDto GEO_BLOCKED;
            private final String value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class DisallowManageReasonDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DisallowManageReasonDto[] $VALUES;

            @pmi0("2")
            public static final DisallowManageReasonDto AWAITING_PERIOD;
            public static final Parcelable.Creator<DisallowManageReasonDto> CREATOR;

            @pmi0("1")
            public static final DisallowManageReasonDto NO_2FA;
            private final int value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class LeaveModeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ LeaveModeDto[] $VALUES;

            @pmi0("admin_leave_alert")
            public static final LeaveModeDto ADMIN_LEAVE_ALERT;

            @pmi0("admin_leave_options")
            public static final LeaveModeDto ADMIN_LEAVE_OPTIONS;
            public static final Parcelable.Creator<LeaveModeDto> CREATOR;
            private final String value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
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

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
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

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
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

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
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

            /* compiled from: UsersSubscriptionsItemDto.kt */
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
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

            /* compiled from: UsersSubscriptionsItemDto.kt */
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

        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class a implements Parcelable.Creator<GroupsGroupFullDto> {
            @Override // android.os.Parcelable.Creator
            public final GroupsGroupFullDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                AudioAudioDto audioAudioDto;
                BaseBoolIntDto baseBoolIntDto;
                ArrayList arrayList;
                UserId userId;
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
                Boolean valueOf17;
                Boolean valueOf18;
                Boolean valueOf19;
                BaseBoolIntDto baseBoolIntDto2;
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
                ArrayList arrayList4;
                UserId userId2;
                BaseAPlusMarkDto baseAPlusMarkDto;
                ArrayList arrayList5;
                ArrayList arrayList6;
                Integer num;
                Boolean valueOf45;
                Boolean valueOf46;
                Boolean valueOf47;
                Boolean valueOf48;
                GroupsAppButtonDto groupsAppButtonDto;
                ArrayList arrayList7;
                ArrayList arrayList8;
                GroupsChannelBlockDto groupsChannelBlockDto;
                Boolean valueOf49;
                BaseBoolIntDto baseBoolIntDto3;
                ArrayList arrayList9;
                ArrayList arrayList10;
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
                UserId userId3 = (UserId) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = (GroupsGroupFullMemberStatusDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseObjectDto baseObjectDto = (BaseObjectDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString3 = parcel.readString();
                Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf65 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf66 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsCountersGroupDto groupsCountersGroupDto = (GroupsCountersGroupDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseOwnerCoverDto baseOwnerCoverDto2 = (BaseOwnerCoverDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsVideoLivesDataDto groupsVideoLivesDataDto = (GroupsVideoLivesDataDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
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
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Boolean bool = valueOf;
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Boolean bool2 = valueOf3;
                String readString8 = parcel.readString();
                Integer valueOf67 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer num2 = valueOf67;
                String readString9 = parcel.readString();
                AudioAudioDto audioAudioDto2 = (AudioAudioDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf68 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    audioAudioDto = audioAudioDto2;
                    baseBoolIntDto = baseBoolIntDto8;
                    userId = userId3;
                    arrayList = null;
                } else {
                    audioAudioDto = audioAudioDto2;
                    int readInt = parcel.readInt();
                    baseBoolIntDto = baseBoolIntDto8;
                    arrayList = new ArrayList(readInt);
                    userId = userId3;
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(GroupsGroupFullDto.class, parcel, arrayList, i, 1);
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
                        i2 = bo.b(GroupsGroupFullDto.class, parcel, arrayList2, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                WallDto createFromParcel7 = parcel.readInt() == 0 ? null : WallDto.CREATOR.createFromParcel(parcel);
                UserId userId4 = userId;
                String readString10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                ArrayList arrayList11 = arrayList2;
                GroupsGroupFullSectionDto groupsGroupFullSectionDto = (GroupsGroupFullSectionDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = (GroupsPrimaryBlockSettingsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsOnlineStatusDto groupsOnlineStatusDto = (GroupsOnlineStatusDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf69 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = (GroupsGroupFullAgeLimitsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = (GroupsGroupFullAgeMarkDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupBanInfoDto groupsGroupBanInfoDto = (GroupsGroupBanInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsActionButtonDto groupsActionButtonDto = (GroupsActionButtonDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf70 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString11 = parcel.readString();
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
                Integer valueOf71 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Object readValue = parcel.readValue(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf72 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsAddressesInfoDto groupsAddressesInfoDto = (GroupsAddressesInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                GroupsLiveCoversDto groupsLiveCoversDto = (GroupsLiveCoversDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsVkAdminStatusDto groupsVkAdminStatusDto = (GroupsVkAdminStatusDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsMenuDto groupsMenuDto = (GroupsMenuDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsWarningNotificationDto groupsWarningNotificationDto = (GroupsWarningNotificationDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf73 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsGroupDonutDto groupsGroupDonutDto = (GroupsGroupDonutDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupVkTicketDto groupsGroupVkTicketDto = (GroupsGroupVkTicketDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = (GroupsGroupDonutBlockDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = (GroupsDonutCommunityManagementDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto = (GroupsGroupDonutPaymentInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf74 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsChatsStatusDto groupsChatsStatusDto = (GroupsChatsStatusDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Float valueOf75 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                String readString12 = parcel.readString();
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
                    baseBoolIntDto2 = baseBoolIntDto24;
                    createFromParcel = null;
                } else {
                    baseBoolIntDto2 = baseBoolIntDto24;
                    createFromParcel = TrustMarkDto.CREATOR.createFromParcel(parcel);
                }
                TrustMarkDto trustMarkDto = createFromParcel;
                GroupsMicrolandingDto groupsMicrolandingDto = (GroupsMicrolandingDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsTariffsDto groupsTariffsDto2 = (GroupsTariffsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf76 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                Integer num3 = valueOf68;
                ArrayList arrayList12 = arrayList3;
                Boolean bool3 = valueOf4;
                Integer num4 = valueOf72;
                Integer num5 = valueOf74;
                Boolean bool4 = valueOf16;
                Float f = valueOf75;
                Boolean bool5 = valueOf17;
                Boolean bool6 = valueOf18;
                Boolean bool7 = valueOf19;
                GroupsTariffsDto groupsTariffsDto3 = groupsTariffsDto;
                String readString13 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = (GroupsGroupFullShowSuggestionsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                Integer valueOf77 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = (GroupsAdsEasyPromoteDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf23 = null;
                } else {
                    valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf78 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf24 = null;
                } else {
                    valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Object readValue2 = parcel.readValue(GroupsGroupFullDto.class.getClassLoader());
                Object readValue3 = parcel.readValue(GroupsGroupFullDto.class.getClassLoader());
                Object readValue4 = parcel.readValue(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf25 = null;
                } else {
                    valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Object readValue5 = parcel.readValue(GroupsGroupFullDto.class.getClassLoader());
                Object readValue6 = parcel.readValue(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf26 = null;
                } else {
                    valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf79 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf80 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf81 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf82 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf83 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsGroupLikeItemDto groupsGroupLikeItemDto = (GroupsGroupLikeItemDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = (GroupsLoginConfirmationStatusDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf27 = null;
                } else {
                    valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf84 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf85 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf86 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf87 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                GroupsGroupFriendsDto groupsGroupFriendsDto2 = (GroupsGroupFriendsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                AudioAudioDto audioAudioDto3 = audioAudioDto;
                Integer num6 = valueOf69;
                Integer num7 = valueOf70;
                Boolean bool8 = valueOf5;
                Boolean bool9 = valueOf6;
                Integer num8 = valueOf71;
                Boolean bool10 = valueOf7;
                Boolean bool11 = valueOf8;
                Boolean bool12 = valueOf9;
                Boolean bool13 = valueOf10;
                Boolean bool14 = valueOf11;
                Boolean bool15 = valueOf12;
                Boolean bool16 = valueOf13;
                Boolean bool17 = valueOf14;
                Boolean bool18 = valueOf15;
                Integer num9 = valueOf73;
                BaseBoolIntDto baseBoolIntDto26 = baseBoolIntDto2;
                Integer num10 = valueOf76;
                Boolean bool19 = valueOf20;
                Boolean bool20 = valueOf23;
                Integer num11 = valueOf78;
                Boolean bool21 = valueOf24;
                String readString14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    groupsGroupFriendsDto = groupsGroupFriendsDto2;
                    createFromParcel3 = null;
                } else {
                    groupsGroupFriendsDto = groupsGroupFriendsDto2;
                    createFromParcel3 = DeactivatedTypeDto.CREATOR.createFromParcel(parcel);
                }
                DeactivatedTypeDto deactivatedTypeDto = createFromParcel3;
                Boolean bool22 = valueOf21;
                Boolean bool23 = valueOf22;
                Integer num12 = valueOf77;
                Boolean bool24 = valueOf25;
                Boolean bool25 = valueOf26;
                Integer num13 = valueOf79;
                Integer num14 = valueOf80;
                Integer num15 = valueOf81;
                Integer num16 = valueOf82;
                Integer num17 = valueOf83;
                Boolean bool26 = valueOf27;
                Integer num18 = valueOf84;
                Integer num19 = valueOf85;
                Integer num20 = valueOf86;
                Integer num21 = valueOf87;
                GroupsGroupFriendsDto groupsGroupFriendsDto3 = groupsGroupFriendsDto;
                String readString15 = parcel.readString();
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
                MarketCommunityRatingDto marketCommunityRatingDto = (MarketCommunityRatingDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = (GroupsGroupNameHistoryDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = (MarketCommunityServiceRatingDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = (GroupsRecommendedTipsWidgetDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Boolean bool27 = valueOf28;
                Boolean bool28 = valueOf29;
                Boolean bool29 = valueOf30;
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
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
                String readString18 = parcel.readString();
                GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = (GroupsAdsPostsInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                String readString19 = parcel.readString();
                GroupsBannerDto groupsBannerDto3 = (GroupsBannerDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsBannerDto groupsBannerDto4 = (GroupsBannerDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                GroupsBannerDto groupsBannerDto5 = (GroupsBannerDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                String readString20 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf41 = null;
                } else {
                    valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
                }
                GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = (GroupsWorkGroupInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Boolean bool30 = valueOf36;
                Boolean bool31 = valueOf37;
                Boolean bool32 = valueOf38;
                String readString21 = parcel.readString();
                GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = (GroupsGroupFullMembersPreviewDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsStrikesInfoDto groupsStrikesInfoDto = (GroupsStrikesInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto2 = (GroupsStrikesRestrictionsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                    arrayList4 = null;
                } else {
                    groupsStrikesRestrictionsDto = groupsStrikesRestrictionsDto2;
                    int readInt3 = parcel.readInt();
                    wallDto = createFromParcel7;
                    arrayList4 = new ArrayList(readInt3);
                    userId2 = userId4;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(GroupsGroupFullDto.class, parcel, arrayList4, i3, 1);
                        readInt3 = readInt3;
                    }
                }
                Integer valueOf88 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf89 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer num22 = valueOf88;
                GroupsSimpleButtonDto groupsSimpleButtonDto = (GroupsSimpleButtonDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseAPlusMarkDto baseAPlusMarkDto2 = (BaseAPlusMarkDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseAPlusMarkDto = baseAPlusMarkDto2;
                    arrayList5 = arrayList4;
                    num = valueOf89;
                    arrayList6 = null;
                } else {
                    baseAPlusMarkDto = baseAPlusMarkDto2;
                    int readInt4 = parcel.readInt();
                    arrayList5 = arrayList4;
                    arrayList6 = new ArrayList(readInt4);
                    num = valueOf89;
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = bo.b(GroupsGroupFullDto.class, parcel, arrayList6, i4, 1);
                        readInt4 = readInt4;
                    }
                }
                GroupsChannelInfoDto groupsChannelInfoDto = (GroupsChannelInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsChannelBlockDto groupsChannelBlockDto2 = (GroupsChannelBlockDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf45 = null;
                } else {
                    valueOf45 = Boolean.valueOf(parcel.readInt() != 0);
                }
                GroupsEventOrganizerDto groupsEventOrganizerDto = (GroupsEventOrganizerDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsVideoChannelDataDto groupsVideoChannelDataDto = (GroupsVideoChannelDataDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                GroupsContentSectionsDataDto groupsContentSectionsDataDto = (GroupsContentSectionsDataDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto3 = groupsStrikesRestrictionsDto;
                BaseAPlusMarkDto baseAPlusMarkDto3 = baseAPlusMarkDto;
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                GroupsGroupIsClosedDto groupsGroupIsClosedDto = (GroupsGroupIsClosedDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupTypeDto groupsGroupTypeDto = (GroupsGroupTypeDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = (GroupsGroupAdminLevelDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto29 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                Integer valueOf90 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf91 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto30 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                String readString24 = parcel.readString();
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
                GroupsPhotoSizeDto groupsPhotoSizeDto = (GroupsPhotoSizeDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsAppButtonDto groupsAppButtonDto2 = (GroupsAppButtonDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    groupsAppButtonDto = groupsAppButtonDto2;
                    arrayList7 = arrayList6;
                    groupsChannelBlockDto = groupsChannelBlockDto2;
                    arrayList8 = null;
                } else {
                    groupsAppButtonDto = groupsAppButtonDto2;
                    int readInt5 = parcel.readInt();
                    arrayList7 = arrayList6;
                    arrayList8 = new ArrayList(readInt5);
                    groupsChannelBlockDto = groupsChannelBlockDto2;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = bo.b(GroupsGroupFullDto.class, parcel, arrayList8, i5, 1);
                        readInt5 = readInt5;
                    }
                }
                BaseBoolIntDto baseBoolIntDto31 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                VideoLiveInfoDto videoLiveInfoDto2 = (VideoLiveInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf49 = null;
                } else {
                    valueOf49 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString36 = parcel.readString();
                Integer valueOf92 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto3 = baseBoolIntDto31;
                    arrayList9 = arrayList8;
                    videoLiveInfoDto = videoLiveInfoDto2;
                    arrayList10 = null;
                } else {
                    baseBoolIntDto3 = baseBoolIntDto31;
                    int readInt6 = parcel.readInt();
                    arrayList9 = arrayList8;
                    arrayList10 = new ArrayList(readInt6);
                    videoLiveInfoDto = videoLiveInfoDto2;
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = bo.b(GroupsGroupFullDto.class, parcel, arrayList10, i6, 1);
                        readInt6 = readInt6;
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
                GroupsMarketInfoDto groupsMarketInfoDto = (GroupsMarketInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = (GroupsMarketServicesInfoDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto = (GroupsGroupExtendedMarketSectionsDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
                GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto2 = (GroupsMarketShopConditionsStateDto) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
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
                YoulaStatusDto youlaStatusDto = createFromParcel6;
                if (parcel.readInt() == 0) {
                    valueOf60 = null;
                } else {
                    valueOf60 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString37 = parcel.readString();
                Integer valueOf93 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf61 = null;
                } else {
                    valueOf61 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new GroupsGroupFullDto(userId2, groupsGroupFullMemberStatusDto, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, baseBoolIntDto7, baseObjectDto, baseCountryDto, readString, readString2, valueOf62, readString3, valueOf63, audioMusicAwardsDto, valueOf64, valueOf65, valueOf66, groupsCountersGroupDto, baseOwnerCoverDto, baseOwnerCoverDto2, groupsVideoLivesDataDto, readString4, readString5, readString6, readString7, bool, valueOf2, baseBoolIntDto, baseBoolIntDto9, baseBoolIntDto10, bool2, baseBoolIntDto11, baseBoolIntDto12, baseBoolIntDto13, baseBoolIntDto14, baseBoolIntDto15, baseBoolIntDto16, readString8, num2, baseBoolIntDto17, baseCropPhotoDto, readString9, audioAudioDto3, num3, arrayList12, arrayList11, wallDto, readString10, bool3, groupsGroupFullSectionDto, groupsPrimaryBlockSettingsDto, baseBoolIntDto18, baseBoolIntDto19, baseBoolIntDto20, baseBoolIntDto21, groupsOnlineStatusDto, num6, groupsGroupFullAgeLimitsDto, groupsGroupFullAgeMarkDto, groupsGroupBanInfoDto, groupsActionButtonDto, num7, readString11, bool8, bool9, num8, bool10, readValue, num4, groupsAddressesInfoDto, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, groupsLiveCoversDto, groupsVkAdminStatusDto, groupsMenuDto, groupsWarningNotificationDto, num9, groupsGroupDonutDto, groupsGroupVkTicketDto, groupsGroupDonutBlockDto, groupsDonutCommunityManagementDto, groupsGroupDonutPaymentInfoDto, num5, bool4, baseBoolIntDto22, baseBoolIntDto23, groupsChatsStatusDto, baseBoolIntDto26, f, readString12, bool5, bool6, bool7, trustMarkDto, groupsMicrolandingDto, groupsTariffsDto3, num10, bool19, disallowManageReasonDto, readString13, baseBoolIntDto25, groupsGroupFullShowSuggestionsDto, bool22, bool23, num12, groupsAdsEasyPromoteDto, bool20, num11, bool21, readValue2, readValue3, readValue4, bool24, readValue5, readValue6, bool25, num13, num14, num15, num16, num17, groupsGroupLikeItemDto, groupsLoginConfirmationStatusDto, bool26, num18, num19, num20, num21, groupsGroupFriendsDto3, readString14, deactivatedTypeDto, readString15, bool27, bool28, bool29, marketCommunityRatingDto, groupsGroupNameHistoryDto, marketCommunityServiceRatingDto, groupsRecommendedTipsWidgetDto, readString16, readString17, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, readString18, groupsAdsPostsInfoDto, readString19, groupsBannerDto3, groupsBannerDto, bool30, leaveModeDto, groupsBannerDto2, bool31, bool32, videoNotificationsStatusDto, valueOf39, valueOf40, readString20, valueOf41, groupsWorkGroupInfoDto, readString21, groupsGroupFullMembersPreviewDto, groupsStrikesInfoDto, groupsStrikesRestrictionsDto3, valueOf42, createStringArrayList, valueOf43, valueOf44, arrayList5, num22, num, groupsSimpleButtonDto, baseAPlusMarkDto3, arrayList7, groupsChannelInfoDto, groupsChannelBlockDto, valueOf45, groupsEventOrganizerDto, groupsVideoChannelDataDto, valueOf46, valueOf47, valueOf48, groupsContentSectionsDataDto, readString22, readString23, groupsGroupIsClosedDto, groupsGroupTypeDto, channelsChannelTypeDto, baseBoolIntDto27, groupsGroupAdminLevelDto, baseBoolIntDto28, baseBoolIntDto29, valueOf90, valueOf91, baseBoolIntDto30, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, groupsPhotoSizeDto, groupsAppButtonDto, arrayList9, baseBoolIntDto3, videoLiveInfoDto, valueOf49, readString36, valueOf92, arrayList10, valueOf50, valueOf51, groupsMarketInfoDto, groupsMarketServicesInfoDto, valueOf52, valueOf53, valueOf54, groupsGroupExtendedMarketSectionsDto, groupsMarketShopConditionsStateDto, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, youlaStatusDto, valueOf60, readString37, valueOf93, valueOf61, parcel.readInt() == 0 ? null : YoulaPostingMethodDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final GroupsGroupFullDto[] newArray(int i) {
                return new GroupsGroupFullDto[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ GroupsGroupFullDto(UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str, String str2, Integer num, String str3, Integer num2, AudioMusicAwardsDto audioMusicAwardsDto, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseOwnerCoverDto baseOwnerCoverDto2, GroupsVideoLivesDataDto groupsVideoLivesDataDto, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool3, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str8, Integer num6, BaseBoolIntDto baseBoolIntDto14, BaseCropPhotoDto baseCropPhotoDto, String str9, AudioAudioDto audioAudioDto, Integer num7, List list, List list2, WallDto wallDto, String str10, Boolean bool4, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, GroupsActionButtonDto groupsActionButtonDto, Integer num9, String str11, Boolean bool5, Boolean bool6, Integer num10, Boolean bool7, Object obj, Integer num11, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, GroupsLiveCoversDto groupsLiveCoversDto, GroupsVkAdminStatusDto groupsVkAdminStatusDto, GroupsMenuDto groupsMenuDto, GroupsWarningNotificationDto groupsWarningNotificationDto, Integer num12, GroupsGroupDonutDto groupsGroupDonutDto, GroupsGroupVkTicketDto groupsGroupVkTicketDto, GroupsGroupDonutBlockDto groupsGroupDonutBlockDto, GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto, GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto, Integer num13, Boolean bool16, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, GroupsChatsStatusDto groupsChatsStatusDto, BaseBoolIntDto baseBoolIntDto21, Float f, String str12, Boolean bool17, Boolean bool18, Boolean bool19, TrustMarkDto trustMarkDto, GroupsMicrolandingDto groupsMicrolandingDto, GroupsTariffsDto groupsTariffsDto, Integer num14, Boolean bool20, DisallowManageReasonDto disallowManageReasonDto, String str13, BaseBoolIntDto baseBoolIntDto22, GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto, Boolean bool21, Boolean bool22, Integer num15, GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto, Boolean bool23, Integer num16, Boolean bool24, Object obj2, Object obj3, Object obj4, Boolean bool25, Object obj5, Object obj6, Boolean bool26, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, GroupsGroupLikeItemDto groupsGroupLikeItemDto, GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto, Boolean bool27, Integer num22, Integer num23, Integer num24, Integer num25, GroupsGroupFriendsDto groupsGroupFriendsDto, String str14, DeactivatedTypeDto deactivatedTypeDto, String str15, Boolean bool28, Boolean bool29, Boolean bool30, MarketCommunityRatingDto marketCommunityRatingDto, GroupsGroupNameHistoryDto groupsGroupNameHistoryDto, MarketCommunityServiceRatingDto marketCommunityServiceRatingDto, GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto, String str16, String str17, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str18, GroupsAdsPostsInfoDto groupsAdsPostsInfoDto, String str19, GroupsBannerDto groupsBannerDto, GroupsBannerDto groupsBannerDto2, Boolean bool36, LeaveModeDto leaveModeDto, GroupsBannerDto groupsBannerDto3, Boolean bool37, Boolean bool38, VideoNotificationsStatusDto videoNotificationsStatusDto, Boolean bool39, Boolean bool40, String str20, Boolean bool41, GroupsWorkGroupInfoDto groupsWorkGroupInfoDto, String str21, GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto, GroupsStrikesInfoDto groupsStrikesInfoDto, GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto, Boolean bool42, List list3, Boolean bool43, Boolean bool44, List list4, Integer num26, Integer num27, GroupsSimpleButtonDto groupsSimpleButtonDto, BaseAPlusMarkDto baseAPlusMarkDto, List list5, GroupsChannelInfoDto groupsChannelInfoDto, GroupsChannelBlockDto groupsChannelBlockDto, Boolean bool45, GroupsEventOrganizerDto groupsEventOrganizerDto, GroupsVideoChannelDataDto groupsVideoChannelDataDto, Boolean bool46, Boolean bool47, Boolean bool48, GroupsContentSectionsDataDto groupsContentSectionsDataDto, String str22, String str23, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto23, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, Integer num28, Integer num29, BaseBoolIntDto baseBoolIntDto26, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List list6, BaseBoolIntDto baseBoolIntDto27, VideoLiveInfoDto videoLiveInfoDto, Boolean bool49, String str36, Integer num30, List list7, Boolean bool50, Boolean bool51, GroupsMarketInfoDto groupsMarketInfoDto, GroupsMarketServicesInfoDto groupsMarketServicesInfoDto, Boolean bool52, Boolean bool53, Boolean bool54, GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto, GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, YoulaStatusDto youlaStatusDto, Boolean bool60, String str37, Integer num31, Boolean bool61, YoulaPostingMethodDto youlaPostingMethodDto, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zcl zclVar) {
            this(userId, r184, r10, r11, r12, r13, r14, r15, r9, r185, r186, r187, r188, r189, r8, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r190, r39, r40, r41, r42, r43, r44, r45, r191, r192, r193, r194, r195, r196, r197, r198, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r199, r200, r201, r202, r203, r204, r205, r206, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r207, r208, r209, r210, r211, r212, r213, r214, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r215, r216, r217, r218, r219, r220, r221, r222, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r4, r131, r132, r133, r134, r135, r136, r137, r223, r224, r225, r226, r227, r228, r229, r0, (i6 & 32768) != 0 ? null : bool44, (i6 & 65536) != 0 ? null : list4, (i6 & 131072) != 0 ? null : num26, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num27, (i6 & 524288) != 0 ? null : groupsSimpleButtonDto, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseAPlusMarkDto, (i6 & 2097152) != 0 ? null : list5, (i6 & 4194304) != 0 ? null : groupsChannelInfoDto, (i6 & 8388608) != 0 ? null : groupsChannelBlockDto, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool45, (i6 & 33554432) != 0 ? null : groupsEventOrganizerDto, (i6 & 67108864) != 0 ? null : groupsVideoChannelDataDto, (i6 & 134217728) != 0 ? null : bool46, (i6 & 268435456) != 0 ? null : bool47, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool48, (i6 & 1073741824) != 0 ? null : groupsContentSectionsDataDto, (i6 & Integer.MIN_VALUE) != 0 ? null : str22, (i7 & 1) != 0 ? null : str23, (i7 & 2) != 0 ? null : groupsGroupIsClosedDto, (i7 & 4) != 0 ? null : groupsGroupTypeDto, (i7 & 8) != 0 ? null : channelsChannelTypeDto, (i7 & 16) != 0 ? null : baseBoolIntDto23, (i7 & 32) != 0 ? null : groupsGroupAdminLevelDto, (i7 & 64) != 0 ? null : baseBoolIntDto24, (i7 & 128) != 0 ? null : baseBoolIntDto25, (i7 & 256) != 0 ? null : num28, (i7 & 512) != 0 ? null : num29, (i7 & 1024) != 0 ? null : baseBoolIntDto26, (i7 & 2048) != 0 ? null : str24, (i7 & 4096) != 0 ? null : str25, (i7 & 8192) != 0 ? null : str26, (i7 & 16384) != 0 ? null : str27, (i7 & 32768) != 0 ? null : str28, (i7 & 65536) != 0 ? null : str29, (i7 & 131072) != 0 ? null : str30, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str31, (i7 & 524288) != 0 ? null : str32, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str33, (i7 & 2097152) != 0 ? null : str34, (i7 & 4194304) != 0 ? null : str35, (i7 & 8388608) != 0 ? null : groupsPhotoSizeDto, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : groupsAppButtonDto, (i7 & 33554432) != 0 ? null : list6, (i7 & 67108864) != 0 ? null : baseBoolIntDto27, (i7 & 134217728) != 0 ? null : videoLiveInfoDto, (i7 & 268435456) != 0 ? null : bool49, (i7 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str36, (i7 & 1073741824) != 0 ? null : num30, (i7 & Integer.MIN_VALUE) != 0 ? null : list7, (i8 & 1) != 0 ? null : bool50, (i8 & 2) != 0 ? null : bool51, (i8 & 4) != 0 ? null : groupsMarketInfoDto, (i8 & 8) != 0 ? null : groupsMarketServicesInfoDto, (i8 & 16) != 0 ? null : bool52, (i8 & 32) != 0 ? null : bool53, (i8 & 64) != 0 ? null : bool54, (i8 & 128) != 0 ? null : groupsGroupExtendedMarketSectionsDto, (i8 & 256) != 0 ? null : groupsMarketShopConditionsStateDto, (i8 & 512) != 0 ? null : bool55, (i8 & 1024) != 0 ? null : bool56, (i8 & 2048) != 0 ? null : bool57, (i8 & 4096) != 0 ? null : bool58, (i8 & 8192) != 0 ? null : bool59, (i8 & 16384) != 0 ? null : youlaStatusDto, (i8 & 32768) != 0 ? null : bool60, (i8 & 65536) != 0 ? null : str37, (i8 & 131072) != 0 ? null : num31, (i8 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool61, (i8 & 524288) != 0 ? null : youlaPostingMethodDto);
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto2 = (i & 2) != 0 ? null : groupsGroupFullMemberStatusDto;
            BaseBoolIntDto baseBoolIntDto28 = (i & 4) != 0 ? null : baseBoolIntDto;
            BaseBoolIntDto baseBoolIntDto29 = (i & 8) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto30 = (i & 16) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto31 = (i & 32) != 0 ? null : baseBoolIntDto4;
            BaseObjectDto baseObjectDto2 = (i & 64) != 0 ? null : baseObjectDto;
            BaseCountryDto baseCountryDto2 = (i & 128) != 0 ? null : baseCountryDto;
            String str38 = (i & 256) != 0 ? null : str;
            GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto3 = groupsGroupFullMemberStatusDto2;
            String str39 = (i & 512) != 0 ? null : str2;
            Integer num32 = (i & 1024) != 0 ? null : num;
            String str40 = (i & 2048) != 0 ? null : str3;
            Integer num33 = (i & 4096) != 0 ? null : num2;
            AudioMusicAwardsDto audioMusicAwardsDto2 = (i & 8192) != 0 ? null : audioMusicAwardsDto;
            Integer num34 = (i & 16384) != 0 ? null : num3;
            Integer num35 = (i & 32768) != 0 ? null : num4;
            Integer num36 = (i & 65536) != 0 ? null : num5;
            GroupsCountersGroupDto groupsCountersGroupDto2 = (i & 131072) != 0 ? null : groupsCountersGroupDto;
            BaseOwnerCoverDto baseOwnerCoverDto3 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseOwnerCoverDto;
            BaseOwnerCoverDto baseOwnerCoverDto4 = (i & 524288) != 0 ? null : baseOwnerCoverDto2;
            GroupsVideoLivesDataDto groupsVideoLivesDataDto2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : groupsVideoLivesDataDto;
            String str41 = (i & 2097152) != 0 ? null : str4;
            String str42 = (i & 4194304) != 0 ? null : str5;
            String str43 = (i & 8388608) != 0 ? null : str6;
            String str44 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str7;
            Boolean bool62 = (i & 33554432) != 0 ? null : bool;
            Boolean bool63 = (i & 67108864) != 0 ? null : bool2;
            BaseBoolIntDto baseBoolIntDto32 = (i & 134217728) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto33 = (i & 268435456) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto34 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto7;
            Boolean bool64 = (i & 1073741824) != 0 ? null : bool3;
            BaseBoolIntDto baseBoolIntDto35 = (i & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto8;
            BaseBoolIntDto baseBoolIntDto36 = (i2 & 1) != 0 ? null : baseBoolIntDto9;
            BaseBoolIntDto baseBoolIntDto37 = (i2 & 2) != 0 ? null : baseBoolIntDto10;
            BaseBoolIntDto baseBoolIntDto38 = (i2 & 4) != 0 ? null : baseBoolIntDto11;
            BaseBoolIntDto baseBoolIntDto39 = (i2 & 8) != 0 ? null : baseBoolIntDto12;
            BaseBoolIntDto baseBoolIntDto40 = (i2 & 16) != 0 ? null : baseBoolIntDto13;
            String str45 = (i2 & 32) != 0 ? null : str8;
            Integer num37 = (i2 & 64) != 0 ? null : num6;
            BaseBoolIntDto baseBoolIntDto41 = baseBoolIntDto35;
            BaseBoolIntDto baseBoolIntDto42 = (i2 & 128) != 0 ? null : baseBoolIntDto14;
            BaseCropPhotoDto baseCropPhotoDto2 = (i2 & 256) != 0 ? null : baseCropPhotoDto;
            String str46 = (i2 & 512) != 0 ? null : str9;
            AudioAudioDto audioAudioDto2 = (i2 & 1024) != 0 ? null : audioAudioDto;
            Integer num38 = (i2 & 2048) != 0 ? null : num7;
            List list8 = (i2 & 4096) != 0 ? null : list;
            List list9 = (i2 & 8192) != 0 ? null : list2;
            WallDto wallDto2 = (i2 & 16384) != 0 ? null : wallDto;
            String str47 = (i2 & 32768) != 0 ? null : str10;
            Boolean bool65 = (i2 & 65536) != 0 ? null : bool4;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = (i2 & 131072) != 0 ? null : groupsGroupFullSectionDto;
            GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : groupsPrimaryBlockSettingsDto;
            BaseBoolIntDto baseBoolIntDto43 = (i2 & 524288) != 0 ? null : baseBoolIntDto15;
            BaseBoolIntDto baseBoolIntDto44 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto16;
            BaseBoolIntDto baseBoolIntDto45 = (i2 & 2097152) != 0 ? null : baseBoolIntDto17;
            BaseBoolIntDto baseBoolIntDto46 = (i2 & 4194304) != 0 ? null : baseBoolIntDto18;
            GroupsOnlineStatusDto groupsOnlineStatusDto2 = (i2 & 8388608) != 0 ? null : groupsOnlineStatusDto;
            Integer num39 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num8;
            GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto2 = (i2 & 33554432) != 0 ? null : groupsGroupFullAgeLimitsDto;
            GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto2 = (i2 & 67108864) != 0 ? null : groupsGroupFullAgeMarkDto;
            GroupsGroupBanInfoDto groupsGroupBanInfoDto2 = (i2 & 134217728) != 0 ? null : groupsGroupBanInfoDto;
            GroupsActionButtonDto groupsActionButtonDto2 = (i2 & 268435456) != 0 ? null : groupsActionButtonDto;
            Integer num40 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num9;
            String str48 = (i2 & 1073741824) != 0 ? null : str11;
            Boolean bool66 = (i2 & Integer.MIN_VALUE) != 0 ? null : bool5;
            Boolean bool67 = (i3 & 1) != 0 ? null : bool6;
            Integer num41 = (i3 & 2) != 0 ? null : num10;
            Boolean bool68 = (i3 & 4) != 0 ? null : bool7;
            Object obj7 = (i3 & 8) != 0 ? null : obj;
            Integer num42 = (i3 & 16) != 0 ? null : num11;
            GroupsAddressesInfoDto groupsAddressesInfoDto2 = (i3 & 32) != 0 ? null : groupsAddressesInfoDto;
            Boolean bool69 = (i3 & 64) != 0 ? null : bool8;
            WallDto wallDto3 = wallDto2;
            Boolean bool70 = (i3 & 128) != 0 ? null : bool9;
            Boolean bool71 = (i3 & 256) != 0 ? null : bool10;
            Boolean bool72 = (i3 & 512) != 0 ? null : bool11;
            Boolean bool73 = (i3 & 1024) != 0 ? null : bool12;
            Boolean bool74 = (i3 & 2048) != 0 ? null : bool13;
            Boolean bool75 = (i3 & 4096) != 0 ? null : bool14;
            Boolean bool76 = (i3 & 8192) != 0 ? null : bool15;
            GroupsLiveCoversDto groupsLiveCoversDto2 = (i3 & 16384) != 0 ? null : groupsLiveCoversDto;
            GroupsVkAdminStatusDto groupsVkAdminStatusDto2 = (i3 & 32768) != 0 ? null : groupsVkAdminStatusDto;
            GroupsMenuDto groupsMenuDto2 = (i3 & 65536) != 0 ? null : groupsMenuDto;
            GroupsWarningNotificationDto groupsWarningNotificationDto2 = (i3 & 131072) != 0 ? null : groupsWarningNotificationDto;
            Integer num43 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num12;
            GroupsGroupDonutDto groupsGroupDonutDto2 = (i3 & 524288) != 0 ? null : groupsGroupDonutDto;
            GroupsGroupVkTicketDto groupsGroupVkTicketDto2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : groupsGroupVkTicketDto;
            GroupsGroupDonutBlockDto groupsGroupDonutBlockDto2 = (i3 & 2097152) != 0 ? null : groupsGroupDonutBlockDto;
            GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto2 = (i3 & 4194304) != 0 ? null : groupsDonutCommunityManagementDto;
            GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto2 = (i3 & 8388608) != 0 ? null : groupsGroupDonutPaymentInfoDto;
            Integer num44 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num13;
            Boolean bool77 = (i3 & 33554432) != 0 ? null : bool16;
            BaseBoolIntDto baseBoolIntDto47 = (i3 & 67108864) != 0 ? null : baseBoolIntDto19;
            BaseBoolIntDto baseBoolIntDto48 = (i3 & 134217728) != 0 ? null : baseBoolIntDto20;
            GroupsChatsStatusDto groupsChatsStatusDto2 = (i3 & 268435456) != 0 ? null : groupsChatsStatusDto;
            BaseBoolIntDto baseBoolIntDto49 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto21;
            Float f2 = (i3 & 1073741824) != 0 ? null : f;
            String str49 = (i3 & Integer.MIN_VALUE) != 0 ? null : str12;
            Boolean bool78 = (i4 & 1) != 0 ? null : bool17;
            Boolean bool79 = (i4 & 2) != 0 ? null : bool18;
            Boolean bool80 = (i4 & 4) != 0 ? null : bool19;
            TrustMarkDto trustMarkDto2 = (i4 & 8) != 0 ? null : trustMarkDto;
            GroupsMicrolandingDto groupsMicrolandingDto2 = (i4 & 16) != 0 ? null : groupsMicrolandingDto;
            GroupsTariffsDto groupsTariffsDto2 = (i4 & 32) != 0 ? null : groupsTariffsDto;
            Integer num45 = (i4 & 64) != 0 ? null : num14;
            GroupsLiveCoversDto groupsLiveCoversDto3 = groupsLiveCoversDto2;
            Boolean bool81 = (i4 & 128) != 0 ? null : bool20;
            DisallowManageReasonDto disallowManageReasonDto2 = (i4 & 256) != 0 ? null : disallowManageReasonDto;
            String str50 = (i4 & 512) != 0 ? null : str13;
            BaseBoolIntDto baseBoolIntDto50 = (i4 & 1024) != 0 ? null : baseBoolIntDto22;
            GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto2 = (i4 & 2048) != 0 ? null : groupsGroupFullShowSuggestionsDto;
            Boolean bool82 = (i4 & 4096) != 0 ? null : bool21;
            Boolean bool83 = (i4 & 8192) != 0 ? null : bool22;
            Integer num46 = (i4 & 16384) != 0 ? null : num15;
            GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto2 = (i4 & 32768) != 0 ? null : groupsAdsEasyPromoteDto;
            Boolean bool84 = (i4 & 65536) != 0 ? null : bool23;
            Integer num47 = (i4 & 131072) != 0 ? null : num16;
            Boolean bool85 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool24;
            Object obj8 = (i4 & 524288) != 0 ? null : obj2;
            Object obj9 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : obj3;
            Object obj10 = (i4 & 2097152) != 0 ? null : obj4;
            Boolean bool86 = (i4 & 4194304) != 0 ? null : bool25;
            Object obj11 = (i4 & 8388608) != 0 ? null : obj5;
            Object obj12 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : obj6;
            Boolean bool87 = (i4 & 33554432) != 0 ? null : bool26;
            Integer num48 = (i4 & 67108864) != 0 ? null : num17;
            Integer num49 = (i4 & 134217728) != 0 ? null : num18;
            Integer num50 = (i4 & 268435456) != 0 ? null : num19;
            Integer num51 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num20;
            Integer num52 = (i4 & 1073741824) != 0 ? null : num21;
            GroupsGroupLikeItemDto groupsGroupLikeItemDto2 = (i4 & Integer.MIN_VALUE) != 0 ? null : groupsGroupLikeItemDto;
            GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto2 = (i5 & 1) != 0 ? null : groupsLoginConfirmationStatusDto;
            Boolean bool88 = (i5 & 2) != 0 ? null : bool27;
            Integer num53 = (i5 & 4) != 0 ? null : num22;
            Integer num54 = (i5 & 8) != 0 ? null : num23;
            Integer num55 = (i5 & 16) != 0 ? null : num24;
            Integer num56 = (i5 & 32) != 0 ? null : num25;
            GroupsGroupFriendsDto groupsGroupFriendsDto2 = (i5 & 64) != 0 ? null : groupsGroupFriendsDto;
            Integer num57 = num46;
            String str51 = (i5 & 128) != 0 ? null : str14;
            DeactivatedTypeDto deactivatedTypeDto2 = (i5 & 256) != 0 ? null : deactivatedTypeDto;
            String str52 = (i5 & 512) != 0 ? null : str15;
            Boolean bool89 = (i5 & 1024) != 0 ? null : bool28;
            Boolean bool90 = (i5 & 2048) != 0 ? null : bool29;
            Boolean bool91 = (i5 & 4096) != 0 ? null : bool30;
            MarketCommunityRatingDto marketCommunityRatingDto2 = (i5 & 8192) != 0 ? null : marketCommunityRatingDto;
            GroupsGroupNameHistoryDto groupsGroupNameHistoryDto2 = (i5 & 16384) != 0 ? null : groupsGroupNameHistoryDto;
            MarketCommunityServiceRatingDto marketCommunityServiceRatingDto2 = (i5 & 32768) != 0 ? null : marketCommunityServiceRatingDto;
            GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto2 = (i5 & 65536) != 0 ? null : groupsRecommendedTipsWidgetDto;
            String str53 = (i5 & 131072) != 0 ? null : str16;
            String str54 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str17;
            Boolean bool92 = (i5 & 524288) != 0 ? null : bool31;
            Boolean bool93 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool32;
            Boolean bool94 = (i5 & 2097152) != 0 ? null : bool33;
            Boolean bool95 = (i5 & 4194304) != 0 ? null : bool34;
            Boolean bool96 = (i5 & 8388608) != 0 ? null : bool35;
            String str55 = (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str18;
            GroupsAdsPostsInfoDto groupsAdsPostsInfoDto2 = (i5 & 33554432) != 0 ? null : groupsAdsPostsInfoDto;
            String str56 = (i5 & 67108864) != 0 ? null : str19;
            GroupsBannerDto groupsBannerDto4 = (i5 & 134217728) != 0 ? null : groupsBannerDto;
            GroupsBannerDto groupsBannerDto5 = (i5 & 268435456) != 0 ? null : groupsBannerDto2;
            Boolean bool97 = (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool36;
            LeaveModeDto leaveModeDto2 = (i5 & 1073741824) != 0 ? null : leaveModeDto;
            GroupsBannerDto groupsBannerDto6 = (i5 & Integer.MIN_VALUE) != 0 ? null : groupsBannerDto3;
            Boolean bool98 = (i6 & 1) != 0 ? null : bool37;
            Boolean bool99 = (i6 & 2) != 0 ? null : bool38;
            VideoNotificationsStatusDto videoNotificationsStatusDto2 = (i6 & 4) != 0 ? null : videoNotificationsStatusDto;
            Boolean bool100 = (i6 & 8) != 0 ? null : bool39;
            Boolean bool101 = (i6 & 16) != 0 ? null : bool40;
            String str57 = (i6 & 32) != 0 ? null : str20;
            Boolean bool102 = (i6 & 64) != 0 ? null : bool41;
            GroupsGroupNameHistoryDto groupsGroupNameHistoryDto3 = groupsGroupNameHistoryDto2;
            GroupsWorkGroupInfoDto groupsWorkGroupInfoDto2 = (i6 & 128) != 0 ? null : groupsWorkGroupInfoDto;
            String str58 = (i6 & 256) != 0 ? null : str21;
            GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto2 = (i6 & 512) != 0 ? null : groupsGroupFullMembersPreviewDto;
            GroupsStrikesInfoDto groupsStrikesInfoDto2 = (i6 & 1024) != 0 ? null : groupsStrikesInfoDto;
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto2 = (i6 & 2048) != 0 ? null : groupsStrikesRestrictionsDto;
            Boolean bool103 = (i6 & 4096) != 0 ? null : bool42;
            List list10 = (i6 & 8192) != 0 ? null : list3;
            Boolean bool104 = (i6 & 16384) != 0 ? null : bool43;
        }

        public final String B() {
            return this.status;
        }

        public final Boolean C() {
            return this.suggestSubscribe;
        }

        public final GroupsGroupTypeDto D() {
            return this.type;
        }

        public final BaseBoolIntDto F() {
            return this.verified;
        }

        public final GroupsGroupIsClosedDto G() {
            return this.isClosed;
        }

        public final BaseBoolIntDto K() {
            return this.isMember;
        }

        public final Boolean M() {
            return this.isNftPhoto;
        }

        public final String d() {
            return this.activity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.deactivated;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupsGroupFullDto)) {
                return false;
            }
            GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
            return epx.f(this.id, groupsGroupFullDto.id) && this.memberStatus == groupsGroupFullDto.memberStatus && this.isAdult == groupsGroupFullDto.isAdult && this.isHiddenFromFeed == groupsGroupFullDto.isHiddenFromFeed && this.isFavorite == groupsGroupFullDto.isFavorite && this.isSubscribed == groupsGroupFullDto.isSubscribed && epx.f(this.city, groupsGroupFullDto.city) && epx.f(this.country, groupsGroupFullDto.country) && epx.f(this.description, groupsGroupFullDto.description) && epx.f(this.wikiPage, groupsGroupFullDto.wikiPage) && epx.f(this.membersCount, groupsGroupFullDto.membersCount) && epx.f(this.membersCountText, groupsGroupFullDto.membersCountText) && epx.f(this.requestsCount, groupsGroupFullDto.requestsCount) && epx.f(this.musicAwards, groupsGroupFullDto.musicAwards) && epx.f(this.videoLiveLevel, groupsGroupFullDto.videoLiveLevel) && epx.f(this.videoLiveCount, groupsGroupFullDto.videoLiveCount) && epx.f(this.clipsCount, groupsGroupFullDto.clipsCount) && epx.f(this.counters, groupsGroupFullDto.counters) && epx.f(this.cover, groupsGroupFullDto.cover) && epx.f(this.videoCover, groupsGroupFullDto.videoCover) && epx.f(this.videoLivesData, groupsGroupFullDto.videoLivesData) && epx.f(this.photoAvgColor, groupsGroupFullDto.photoAvgColor) && epx.f(this.inn, groupsGroupFullDto.inn) && epx.f(this.ogrn, groupsGroupFullDto.ogrn) && epx.f(this.kpp, groupsGroupFullDto.kpp) && epx.f(this.hasLiveCover, groupsGroupFullDto.hasLiveCover) && epx.f(this.hasStories, groupsGroupFullDto.hasStories) && this.canPost == groupsGroupFullDto.canPost && this.canSuggest == groupsGroupFullDto.canSuggest && this.canUploadStory == groupsGroupFullDto.canUploadStory && epx.f(this.canCallToCommunity, groupsGroupFullDto.canCallToCommunity) && this.canUploadDoc == groupsGroupFullDto.canUploadDoc && this.canUploadVideo == groupsGroupFullDto.canUploadVideo && this.canUploadVideoThumb == groupsGroupFullDto.canUploadVideoThumb && this.canUploadClip == groupsGroupFullDto.canUploadClip && this.canSeeAllPosts == groupsGroupFullDto.canSeeAllPosts && this.canCreateTopic == groupsGroupFullDto.canCreateTopic && epx.f(this.activity, groupsGroupFullDto.activity) && epx.f(this.fixedPost, groupsGroupFullDto.fixedPost) && this.hasPhoto == groupsGroupFullDto.hasPhoto && epx.f(this.cropPhoto, groupsGroupFullDto.cropPhoto) && epx.f(this.status, groupsGroupFullDto.status) && epx.f(this.statusAudio, groupsGroupFullDto.statusAudio) && epx.f(this.mainAlbumId, groupsGroupFullDto.mainAlbumId) && epx.f(this.links, groupsGroupFullDto.links) && epx.f(this.contacts, groupsGroupFullDto.contacts) && this.wall == groupsGroupFullDto.wall && epx.f(this.site, groupsGroupFullDto.site) && epx.f(this.isSiteDisplayed, groupsGroupFullDto.isSiteDisplayed) && this.mainSection == groupsGroupFullDto.mainSection && epx.f(this.primaryBlock, groupsGroupFullDto.primaryBlock) && this.trending == groupsGroupFullDto.trending && this.canMessage == groupsGroupFullDto.canMessage && this.isMessagesBlocked == groupsGroupFullDto.isMessagesBlocked && this.canSendNotify == groupsGroupFullDto.canSendNotify && epx.f(this.onlineStatus, groupsGroupFullDto.onlineStatus) && epx.f(this.invitedBy, groupsGroupFullDto.invitedBy) && this.ageLimits == groupsGroupFullDto.ageLimits && this.ageMark == groupsGroupFullDto.ageMark && epx.f(this.banInfo, groupsGroupFullDto.banInfo) && epx.f(this.actionButton, groupsGroupFullDto.actionButton) && epx.f(this.authorId, groupsGroupFullDto.authorId) && epx.f(this.phone, groupsGroupFullDto.phone) && epx.f(this.isWidgetMessagesEnabled, groupsGroupFullDto.isWidgetMessagesEnabled) && epx.f(this.vkpayCanTransfer, groupsGroupFullDto.vkpayCanTransfer) && epx.f(this.vkpayReceiverId, groupsGroupFullDto.vkpayReceiverId) && epx.f(this.hasGroupChannel, groupsGroupFullDto.hasGroupChannel) && epx.f(this.groupChannel, groupsGroupFullDto.groupChannel) && epx.f(this.communityChannelId, groupsGroupFullDto.communityChannelId) && epx.f(this.addresses, groupsGroupFullDto.addresses) && epx.f(this.messages, groupsGroupFullDto.messages) && epx.f(this.isAue, groupsGroupFullDto.isAue) && epx.f(this.prohibitedContentAdultMark, groupsGroupFullDto.prohibitedContentAdultMark) && epx.f(this.isSubscribedPodcasts, groupsGroupFullDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, groupsGroupFullDto.canSubscribePodcasts) && epx.f(this.isSubscribedStories, groupsGroupFullDto.isSubscribedStories) && epx.f(this.canSubscribeStories, groupsGroupFullDto.canSubscribeStories) && epx.f(this.canSubscribePosts, groupsGroupFullDto.canSubscribePosts) && epx.f(this.liveCovers, groupsGroupFullDto.liveCovers) && epx.f(this.vkAdminStatus, groupsGroupFullDto.vkAdminStatus) && epx.f(this.menu, groupsGroupFullDto.menu) && epx.f(this.warningNotification, groupsGroupFullDto.warningNotification) && epx.f(this.createDate, groupsGroupFullDto.createDate) && epx.f(this.donut, groupsGroupFullDto.donut) && epx.f(this.vkTicket, groupsGroupFullDto.vkTicket) && epx.f(this.donutBlock, groupsGroupFullDto.donutBlock) && epx.f(this.donutCommunityManagement, groupsGroupFullDto.donutCommunityManagement) && epx.f(this.donutPaymentInfo, groupsGroupFullDto.donutPaymentInfo) && epx.f(this.canPostDonut, groupsGroupFullDto.canPostDonut) && epx.f(this.canSeeMembers, groupsGroupFullDto.canSeeMembers) && this.msgPushAllowed == groupsGroupFullDto.msgPushAllowed && this.msgNotificationsAllowed == groupsGroupFullDto.msgNotificationsAllowed && epx.f(this.chatsStatus, groupsGroupFullDto.chatsStatus) && this.canReport == groupsGroupFullDto.canReport && epx.f(this.businessRating, groupsGroupFullDto.businessRating) && epx.f(this.isBusiness, groupsGroupFullDto.isBusiness) && epx.f(this.isBusinessCategory, groupsGroupFullDto.isBusinessCategory) && epx.f(this.isConfirmedBusiness, groupsGroupFullDto.isConfirmedBusiness) && epx.f(this.isGoldenMarkedBusiness, groupsGroupFullDto.isGoldenMarkedBusiness) && this.trustMark == groupsGroupFullDto.trustMark && epx.f(this.microlanding, groupsGroupFullDto.microlanding) && epx.f(this.tariffs, groupsGroupFullDto.tariffs) && epx.f(this.verificationEndTime, groupsGroupFullDto.verificationEndTime) && epx.f(this.canManage, groupsGroupFullDto.canManage) && this.disallowManageReason == groupsGroupFullDto.disallowManageReason && epx.f(this.disallowManageReasonMessage, groupsGroupFullDto.disallowManageReasonMessage) && this.hasSuggestions == groupsGroupFullDto.hasSuggestions && this.showSuggestions == groupsGroupFullDto.showSuggestions && epx.f(this.canViewStats, groupsGroupFullDto.canViewStats) && epx.f(this.canViewPostReachStats, groupsGroupFullDto.canViewPostReachStats) && epx.f(this.storiesArchiveCount, groupsGroupFullDto.storiesArchiveCount) && epx.f(this.adsEasyPromote, groupsGroupFullDto.adsEasyPromote) && epx.f(this.adsEasyPromoteAllowed, groupsGroupFullDto.adsEasyPromoteAllowed) && epx.f(this.adsPostingRestrictedToday, groupsGroupFullDto.adsPostingRestrictedToday) && epx.f(this.adsMarketAutopromoteAllowed, groupsGroupFullDto.adsMarketAutopromoteAllowed) && epx.f(this.adsMarketEasyPromote, groupsGroupFullDto.adsMarketEasyPromote) && epx.f(this.adsMarketAutopromoteReasonsNotAllowed, groupsGroupFullDto.adsMarketAutopromoteReasonsNotAllowed) && epx.f(this.adsMarketServicesAutopromoteReasonsNotAllowed, groupsGroupFullDto.adsMarketServicesAutopromoteReasonsNotAllowed) && epx.f(this.adsMarketServicesAutopromoteAllowed, groupsGroupFullDto.adsMarketServicesAutopromoteAllowed) && epx.f(this.adsMarketServicesEasyPromote, groupsGroupFullDto.adsMarketServicesEasyPromote) && epx.f(this.adsEasyPromoteReasonsNotAllowed, groupsGroupFullDto.adsEasyPromoteReasonsNotAllowed) && epx.f(this.canSeeInviteLinks, groupsGroupFullDto.canSeeInviteLinks) && epx.f(this.categoryV2, groupsGroupFullDto.categoryV2) && epx.f(this.subjectId, groupsGroupFullDto.subjectId) && epx.f(this.publicCategory, groupsGroupFullDto.publicCategory) && epx.f(this.publicSubcategory, groupsGroupFullDto.publicSubcategory) && epx.f(this.installedAppsCount, groupsGroupFullDto.installedAppsCount) && epx.f(this.like, groupsGroupFullDto.like) && epx.f(this.loginConfirmationStatus, groupsGroupFullDto.loginConfirmationStatus) && epx.f(this.hasUnseenStories, groupsGroupFullDto.hasUnseenStories) && epx.f(this.category, groupsGroupFullDto.category) && epx.f(this.category0, groupsGroupFullDto.category0) && epx.f(this.category1, groupsGroupFullDto.category1) && epx.f(this.category2, groupsGroupFullDto.category2) && epx.f(this.friends, groupsGroupFullDto.friends) && epx.f(this.deactivatedMessage, groupsGroupFullDto.deactivatedMessage) && this.deactivatedType == groupsGroupFullDto.deactivatedType && epx.f(this.targArtistId, groupsGroupFullDto.targArtistId) && epx.f(this.isGovernmentOrganization, groupsGroupFullDto.isGovernmentOrganization) && epx.f(this.settingsTooltipsActive, groupsGroupFullDto.settingsTooltipsActive) && epx.f(this.isYclientsTooltipActive, groupsGroupFullDto.isYclientsTooltipActive) && epx.f(this.rating, groupsGroupFullDto.rating) && epx.f(this.nameHistory, groupsGroupFullDto.nameHistory) && epx.f(this.serviceRating, groupsGroupFullDto.serviceRating) && epx.f(this.recommendedTipsWidget, groupsGroupFullDto.recommendedTipsWidget) && epx.f(this.region, groupsGroupFullDto.region) && epx.f(this.subject, groupsGroupFullDto.subject) && epx.f(this.isSetTabOrder, groupsGroupFullDto.isSetTabOrder) && epx.f(this.isShowBusinessOnboarding, groupsGroupFullDto.isShowBusinessOnboarding) && epx.f(this.businessCommunityTooltips, groupsGroupFullDto.businessCommunityTooltips) && epx.f(this.repostsDisabled, groupsGroupFullDto.repostsDisabled) && epx.f(this.videoLivesStreamingBanned, groupsGroupFullDto.videoLivesStreamingBanned) && epx.f(this.category1Name, groupsGroupFullDto.category1Name) && epx.f(this.adsPostsInfo, groupsGroupFullDto.adsPostsInfo) && epx.f(this.thematic, groupsGroupFullDto.thematic) && epx.f(this.bannerAdsMainClient, groupsGroupFullDto.bannerAdsMainClient) && epx.f(this.bannerAdsSettingMiniapp, groupsGroupFullDto.bannerAdsSettingMiniapp) && epx.f(this.isManualMarkedBusiness, groupsGroupFullDto.isManualMarkedBusiness) && this.leaveMode == groupsGroupFullDto.leaveMode && epx.f(this.bannerAdsMainMvk, groupsGroupFullDto.bannerAdsMainMvk) && epx.f(this.isMediaWallEnabled, groupsGroupFullDto.isMediaWallEnabled) && epx.f(this.isMonetizationAvailable, groupsGroupFullDto.isMonetizationAvailable) && this.videoNotificationsStatus == groupsGroupFullDto.videoNotificationsStatus && epx.f(this.isVideoSubscriptionHidden, groupsGroupFullDto.isVideoSubscriptionHidden) && epx.f(this.suggestSubscribe, groupsGroupFullDto.suggestSubscribe) && epx.f(this.suggestedCategoryName, groupsGroupFullDto.suggestedCategoryName) && epx.f(this.isWorkGroup, groupsGroupFullDto.isWorkGroup) && epx.f(this.workGroupInfo, groupsGroupFullDto.workGroupInfo) && epx.f(this.url, groupsGroupFullDto.url) && epx.f(this.membersPreview, groupsGroupFullDto.membersPreview) && epx.f(this.strikesInfo, groupsGroupFullDto.strikesInfo) && epx.f(this.strikesRestrictions, groupsGroupFullDto.strikesRestrictions) && epx.f(this.coOwnershipEnabled, groupsGroupFullDto.coOwnershipEnabled) && epx.f(this.enabledFeatures, groupsGroupFullDto.enabledFeatures) && epx.f(this.canEditScreenName, groupsGroupFullDto.canEditScreenName) && epx.f(this.canCreateEvent, groupsGroupFullDto.canCreateEvent) && epx.f(this.tabs, groupsGroupFullDto.tabs) && epx.f(this.unreadCount, groupsGroupFullDto.unreadCount) && epx.f(this.videosCount, groupsGroupFullDto.videosCount) && epx.f(this.channelButton, groupsGroupFullDto.channelButton) && epx.f(this.aPlusMark, groupsGroupFullDto.aPlusMark) && epx.f(this.yclientsRepeatRecords, groupsGroupFullDto.yclientsRepeatRecords) && epx.f(this.channelInfo, groupsGroupFullDto.channelInfo) && epx.f(this.channelBlock, groupsGroupFullDto.channelBlock) && epx.f(this.isEducational, groupsGroupFullDto.isEducational) && epx.f(this.eventOrganizer, groupsGroupFullDto.eventOrganizer) && epx.f(this.videoChannelData, groupsGroupFullDto.videoChannelData) && epx.f(this.isTagsAvailable, groupsGroupFullDto.isTagsAvailable) && epx.f(this.isGroupDisplayed, groupsGroupFullDto.isGroupDisplayed) && epx.f(this.isMarketEnabled, groupsGroupFullDto.isMarketEnabled) && epx.f(this.contentSectionsData, groupsGroupFullDto.contentSectionsData) && epx.f(this.name, groupsGroupFullDto.name) && epx.f(this.screenName, groupsGroupFullDto.screenName) && this.isClosed == groupsGroupFullDto.isClosed && this.type == groupsGroupFullDto.type && this.channelType == groupsGroupFullDto.channelType && this.isAdmin == groupsGroupFullDto.isAdmin && this.adminLevel == groupsGroupFullDto.adminLevel && this.isMember == groupsGroupFullDto.isMember && this.isAdvertiser == groupsGroupFullDto.isAdvertiser && epx.f(this.startDate, groupsGroupFullDto.startDate) && epx.f(this.finishDate, groupsGroupFullDto.finishDate) && this.verified == groupsGroupFullDto.verified && epx.f(this.deactivated, groupsGroupFullDto.deactivated) && epx.f(this.photo50, groupsGroupFullDto.photo50) && epx.f(this.photo100, groupsGroupFullDto.photo100) && epx.f(this.photo200, groupsGroupFullDto.photo200) && epx.f(this.photo200Orig, groupsGroupFullDto.photo200Orig) && epx.f(this.photo400, groupsGroupFullDto.photo400) && epx.f(this.photo400Orig, groupsGroupFullDto.photo400Orig) && epx.f(this.photoMax, groupsGroupFullDto.photoMax) && epx.f(this.photoMaxOrig, groupsGroupFullDto.photoMaxOrig) && epx.f(this.photoBase, groupsGroupFullDto.photoBase) && epx.f(this.estDate, groupsGroupFullDto.estDate) && epx.f(this.publicDateLabel, groupsGroupFullDto.publicDateLabel) && epx.f(this.photoMaxSize, groupsGroupFullDto.photoMaxSize) && epx.f(this.appButton, groupsGroupFullDto.appButton) && epx.f(this.appButtons, groupsGroupFullDto.appButtons) && this.isVideoLiveNotificationsBlocked == groupsGroupFullDto.isVideoLiveNotificationsBlocked && epx.f(this.videoLive, groupsGroupFullDto.videoLive) && epx.f(this.hadTorch, groupsGroupFullDto.hadTorch) && epx.f(this.audioArtistId, groupsGroupFullDto.audioArtistId) && epx.f(this.audioCuratorId, groupsGroupFullDto.audioCuratorId) && epx.f(this.buttons, groupsGroupFullDto.buttons) && epx.f(this.isNftPhoto, groupsGroupFullDto.isNftPhoto) && epx.f(this.isCached, groupsGroupFullDto.isCached) && epx.f(this.market, groupsGroupFullDto.market) && epx.f(this.marketServices, groupsGroupFullDto.marketServices) && epx.f(this.hasMarketApp, groupsGroupFullDto.hasMarketApp) && epx.f(this.usingVkpayMarketApp, groupsGroupFullDto.usingVkpayMarketApp) && epx.f(this.isMarketCartEnabled, groupsGroupFullDto.isMarketCartEnabled) && epx.f(this.extendedMarket, groupsGroupFullDto.extendedMarket) && this.marketShopConditionsState == groupsGroupFullDto.marketShopConditionsState && epx.f(this.isMarketOnlineBookingSettingEnabled, groupsGroupFullDto.isMarketOnlineBookingSettingEnabled) && epx.f(this.isBindingToYclientsServiceEnabled, groupsGroupFullDto.isBindingToYclientsServiceEnabled) && epx.f(this.isMarketMarketLinkAttachmentEnabled, groupsGroupFullDto.isMarketMarketLinkAttachmentEnabled) && epx.f(this.isMarketMessageToBcAttachmentEnabled, groupsGroupFullDto.isMarketMessageToBcAttachmentEnabled) && epx.f(this.isMarketOnlineBookingActionButtonEnabled, groupsGroupFullDto.isMarketOnlineBookingActionButtonEnabled) && this.youlaStatus == groupsGroupFullDto.youlaStatus && epx.f(this.youlaUseWallpostRedirect, groupsGroupFullDto.youlaUseWallpostRedirect) && epx.f(this.youlaWallpostRedirectMiniappUrl, groupsGroupFullDto.youlaWallpostRedirectMiniappUrl) && epx.f(this.classifiedsAntibaraholkaDesignVersion, groupsGroupFullDto.classifiedsAntibaraholkaDesignVersion) && epx.f(this.isYoulaPostingToWallAllowed, groupsGroupFullDto.isYoulaPostingToWallAllowed) && this.youlaPostingMethod == groupsGroupFullDto.youlaPostingMethod;
        }

        public final UserId f() {
            return this.id;
        }

        public final LeaveModeDto g() {
            return this.leaveMode;
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
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

        public final GroupsGroupFullMemberStatusDto i() {
            return this.memberStatus;
        }

        public final String j() {
            return this.name;
        }

        public final String k() {
            return this.photo100;
        }

        public final String l() {
            return this.photo200;
        }

        public final String n() {
            return this.photo400;
        }

        public final String o() {
            return this.photo50;
        }

        public final String p() {
            return this.photoBase;
        }

        public final String toString() {
            return "GroupsGroupFullDto(id=" + this.id + ", memberStatus=" + this.memberStatus + ", isAdult=" + this.isAdult + ", isHiddenFromFeed=" + this.isHiddenFromFeed + ", isFavorite=" + this.isFavorite + ", isSubscribed=" + this.isSubscribed + ", city=" + this.city + ", country=" + this.country + ", description=" + this.description + ", wikiPage=" + this.wikiPage + ", membersCount=" + this.membersCount + ", membersCountText=" + this.membersCountText + ", requestsCount=" + this.requestsCount + ", musicAwards=" + this.musicAwards + ", videoLiveLevel=" + this.videoLiveLevel + ", videoLiveCount=" + this.videoLiveCount + ", clipsCount=" + this.clipsCount + ", counters=" + this.counters + ", cover=" + this.cover + ", videoCover=" + this.videoCover + ", videoLivesData=" + this.videoLivesData + ", photoAvgColor=" + this.photoAvgColor + ", inn=" + this.inn + ", ogrn=" + this.ogrn + ", kpp=" + this.kpp + ", hasLiveCover=" + this.hasLiveCover + ", hasStories=" + this.hasStories + ", canPost=" + this.canPost + ", canSuggest=" + this.canSuggest + ", canUploadStory=" + this.canUploadStory + ", canCallToCommunity=" + this.canCallToCommunity + ", canUploadDoc=" + this.canUploadDoc + ", canUploadVideo=" + this.canUploadVideo + ", canUploadVideoThumb=" + this.canUploadVideoThumb + ", canUploadClip=" + this.canUploadClip + ", canSeeAllPosts=" + this.canSeeAllPosts + ", canCreateTopic=" + this.canCreateTopic + ", activity=" + this.activity + ", fixedPost=" + this.fixedPost + ", hasPhoto=" + this.hasPhoto + ", cropPhoto=" + this.cropPhoto + ", status=" + this.status + ", statusAudio=" + this.statusAudio + ", mainAlbumId=" + this.mainAlbumId + ", links=" + this.links + ", contacts=" + this.contacts + ", wall=" + this.wall + ", site=" + this.site + ", isSiteDisplayed=" + this.isSiteDisplayed + ", mainSection=" + this.mainSection + ", primaryBlock=" + this.primaryBlock + ", trending=" + this.trending + ", canMessage=" + this.canMessage + ", isMessagesBlocked=" + this.isMessagesBlocked + ", canSendNotify=" + this.canSendNotify + ", onlineStatus=" + this.onlineStatus + ", invitedBy=" + this.invitedBy + ", ageLimits=" + this.ageLimits + ", ageMark=" + this.ageMark + ", banInfo=" + this.banInfo + ", actionButton=" + this.actionButton + ", authorId=" + this.authorId + ", phone=" + this.phone + ", isWidgetMessagesEnabled=" + this.isWidgetMessagesEnabled + ", vkpayCanTransfer=" + this.vkpayCanTransfer + ", vkpayReceiverId=" + this.vkpayReceiverId + ", hasGroupChannel=" + this.hasGroupChannel + ", groupChannel=" + this.groupChannel + ", communityChannelId=" + this.communityChannelId + ", addresses=" + this.addresses + ", messages=" + this.messages + ", isAue=" + this.isAue + ", prohibitedContentAdultMark=" + this.prohibitedContentAdultMark + ", isSubscribedPodcasts=" + this.isSubscribedPodcasts + ", canSubscribePodcasts=" + this.canSubscribePodcasts + ", isSubscribedStories=" + this.isSubscribedStories + ", canSubscribeStories=" + this.canSubscribeStories + ", canSubscribePosts=" + this.canSubscribePosts + ", liveCovers=" + this.liveCovers + ", vkAdminStatus=" + this.vkAdminStatus + ", menu=" + this.menu + ", warningNotification=" + this.warningNotification + ", createDate=" + this.createDate + ", donut=" + this.donut + ", vkTicket=" + this.vkTicket + ", donutBlock=" + this.donutBlock + ", donutCommunityManagement=" + this.donutCommunityManagement + ", donutPaymentInfo=" + this.donutPaymentInfo + ", canPostDonut=" + this.canPostDonut + ", canSeeMembers=" + this.canSeeMembers + ", msgPushAllowed=" + this.msgPushAllowed + ", msgNotificationsAllowed=" + this.msgNotificationsAllowed + ", chatsStatus=" + this.chatsStatus + ", canReport=" + this.canReport + ", businessRating=" + this.businessRating + ", isBusiness=" + this.isBusiness + ", isBusinessCategory=" + this.isBusinessCategory + ", isConfirmedBusiness=" + this.isConfirmedBusiness + ", isGoldenMarkedBusiness=" + this.isGoldenMarkedBusiness + ", trustMark=" + this.trustMark + ", microlanding=" + this.microlanding + ", tariffs=" + this.tariffs + ", verificationEndTime=" + this.verificationEndTime + ", canManage=" + this.canManage + ", disallowManageReason=" + this.disallowManageReason + ", disallowManageReasonMessage=" + this.disallowManageReasonMessage + ", hasSuggestions=" + this.hasSuggestions + ", showSuggestions=" + this.showSuggestions + ", canViewStats=" + this.canViewStats + ", canViewPostReachStats=" + this.canViewPostReachStats + ", storiesArchiveCount=" + this.storiesArchiveCount + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteAllowed=" + this.adsEasyPromoteAllowed + ", adsPostingRestrictedToday=" + this.adsPostingRestrictedToday + ", adsMarketAutopromoteAllowed=" + this.adsMarketAutopromoteAllowed + ", adsMarketEasyPromote=" + this.adsMarketEasyPromote + ", adsMarketAutopromoteReasonsNotAllowed=" + this.adsMarketAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteReasonsNotAllowed=" + this.adsMarketServicesAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteAllowed=" + this.adsMarketServicesAutopromoteAllowed + ", adsMarketServicesEasyPromote=" + this.adsMarketServicesEasyPromote + ", adsEasyPromoteReasonsNotAllowed=" + this.adsEasyPromoteReasonsNotAllowed + ", canSeeInviteLinks=" + this.canSeeInviteLinks + ", categoryV2=" + this.categoryV2 + ", subjectId=" + this.subjectId + ", publicCategory=" + this.publicCategory + ", publicSubcategory=" + this.publicSubcategory + ", installedAppsCount=" + this.installedAppsCount + ", like=" + this.like + ", loginConfirmationStatus=" + this.loginConfirmationStatus + ", hasUnseenStories=" + this.hasUnseenStories + ", category=" + this.category + ", category0=" + this.category0 + ", category1=" + this.category1 + ", category2=" + this.category2 + ", friends=" + this.friends + ", deactivatedMessage=" + this.deactivatedMessage + ", deactivatedType=" + this.deactivatedType + ", targArtistId=" + this.targArtistId + ", isGovernmentOrganization=" + this.isGovernmentOrganization + ", settingsTooltipsActive=" + this.settingsTooltipsActive + ", isYclientsTooltipActive=" + this.isYclientsTooltipActive + ", rating=" + this.rating + ", nameHistory=" + this.nameHistory + ", serviceRating=" + this.serviceRating + ", recommendedTipsWidget=" + this.recommendedTipsWidget + ", region=" + this.region + ", subject=" + this.subject + ", isSetTabOrder=" + this.isSetTabOrder + ", isShowBusinessOnboarding=" + this.isShowBusinessOnboarding + ", businessCommunityTooltips=" + this.businessCommunityTooltips + ", repostsDisabled=" + this.repostsDisabled + ", videoLivesStreamingBanned=" + this.videoLivesStreamingBanned + ", category1Name=" + this.category1Name + ", adsPostsInfo=" + this.adsPostsInfo + ", thematic=" + this.thematic + ", bannerAdsMainClient=" + this.bannerAdsMainClient + ", bannerAdsSettingMiniapp=" + this.bannerAdsSettingMiniapp + ", isManualMarkedBusiness=" + this.isManualMarkedBusiness + ", leaveMode=" + this.leaveMode + ", bannerAdsMainMvk=" + this.bannerAdsMainMvk + ", isMediaWallEnabled=" + this.isMediaWallEnabled + ", isMonetizationAvailable=" + this.isMonetizationAvailable + ", videoNotificationsStatus=" + this.videoNotificationsStatus + ", isVideoSubscriptionHidden=" + this.isVideoSubscriptionHidden + ", suggestSubscribe=" + this.suggestSubscribe + ", suggestedCategoryName=" + this.suggestedCategoryName + ", isWorkGroup=" + this.isWorkGroup + ", workGroupInfo=" + this.workGroupInfo + ", url=" + this.url + ", membersPreview=" + this.membersPreview + ", strikesInfo=" + this.strikesInfo + ", strikesRestrictions=" + this.strikesRestrictions + ", coOwnershipEnabled=" + this.coOwnershipEnabled + ", enabledFeatures=" + this.enabledFeatures + ", canEditScreenName=" + this.canEditScreenName + ", canCreateEvent=" + this.canCreateEvent + ", tabs=" + this.tabs + ", unreadCount=" + this.unreadCount + ", videosCount=" + this.videosCount + ", channelButton=" + this.channelButton + ", aPlusMark=" + this.aPlusMark + ", yclientsRepeatRecords=" + this.yclientsRepeatRecords + ", channelInfo=" + this.channelInfo + ", channelBlock=" + this.channelBlock + ", isEducational=" + this.isEducational + ", eventOrganizer=" + this.eventOrganizer + ", videoChannelData=" + this.videoChannelData + ", isTagsAvailable=" + this.isTagsAvailable + ", isGroupDisplayed=" + this.isGroupDisplayed + ", isMarketEnabled=" + this.isMarketEnabled + ", contentSectionsData=" + this.contentSectionsData + ", name=" + this.name + ", screenName=" + this.screenName + ", isClosed=" + this.isClosed + ", type=" + this.type + ", channelType=" + this.channelType + ", isAdmin=" + this.isAdmin + ", adminLevel=" + this.adminLevel + ", isMember=" + this.isMember + ", isAdvertiser=" + this.isAdvertiser + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate + ", verified=" + this.verified + ", deactivated=" + this.deactivated + ", photo50=" + this.photo50 + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", photo200Orig=" + this.photo200Orig + ", photo400=" + this.photo400 + ", photo400Orig=" + this.photo400Orig + ", photoMax=" + this.photoMax + ", photoMaxOrig=" + this.photoMaxOrig + ", photoBase=" + this.photoBase + ", estDate=" + this.estDate + ", publicDateLabel=" + this.publicDateLabel + ", photoMaxSize=" + this.photoMaxSize + ", appButton=" + this.appButton + ", appButtons=" + this.appButtons + ", isVideoLiveNotificationsBlocked=" + this.isVideoLiveNotificationsBlocked + ", videoLive=" + this.videoLive + ", hadTorch=" + this.hadTorch + ", audioArtistId=" + this.audioArtistId + ", audioCuratorId=" + this.audioCuratorId + ", buttons=" + this.buttons + ", isNftPhoto=" + this.isNftPhoto + ", isCached=" + this.isCached + ", market=" + this.market + ", marketServices=" + this.marketServices + ", hasMarketApp=" + this.hasMarketApp + ", usingVkpayMarketApp=" + this.usingVkpayMarketApp + ", isMarketCartEnabled=" + this.isMarketCartEnabled + ", extendedMarket=" + this.extendedMarket + ", marketShopConditionsState=" + this.marketShopConditionsState + ", isMarketOnlineBookingSettingEnabled=" + this.isMarketOnlineBookingSettingEnabled + ", isBindingToYclientsServiceEnabled=" + this.isBindingToYclientsServiceEnabled + ", isMarketMarketLinkAttachmentEnabled=" + this.isMarketMarketLinkAttachmentEnabled + ", isMarketMessageToBcAttachmentEnabled=" + this.isMarketMessageToBcAttachmentEnabled + ", isMarketOnlineBookingActionButtonEnabled=" + this.isMarketOnlineBookingActionButtonEnabled + ", youlaStatus=" + this.youlaStatus + ", youlaUseWallpostRedirect=" + this.youlaUseWallpostRedirect + ", youlaWallpostRedirectMiniappUrl=" + this.youlaWallpostRedirectMiniappUrl + ", classifiedsAntibaraholkaDesignVersion=" + this.classifiedsAntibaraholkaDesignVersion + ", isYoulaPostingToWallAllowed=" + this.isYoulaPostingToWallAllowed + ", youlaPostingMethod=" + this.youlaPostingMethod + ')';
        }

        public final String u() {
            return this.screenName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
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

        public GroupsGroupFullDto(UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str, String str2, Integer num, String str3, Integer num2, AudioMusicAwardsDto audioMusicAwardsDto, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseOwnerCoverDto baseOwnerCoverDto2, GroupsVideoLivesDataDto groupsVideoLivesDataDto, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool3, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str8, Integer num6, BaseBoolIntDto baseBoolIntDto14, BaseCropPhotoDto baseCropPhotoDto, String str9, AudioAudioDto audioAudioDto, Integer num7, List<GroupsLinksItemDto> list, List<GroupsContactsItemDto> list2, WallDto wallDto, String str10, Boolean bool4, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, GroupsActionButtonDto groupsActionButtonDto, Integer num9, String str11, Boolean bool5, Boolean bool6, Integer num10, Boolean bool7, Object obj, Integer num11, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, GroupsLiveCoversDto groupsLiveCoversDto, GroupsVkAdminStatusDto groupsVkAdminStatusDto, GroupsMenuDto groupsMenuDto, GroupsWarningNotificationDto groupsWarningNotificationDto, Integer num12, GroupsGroupDonutDto groupsGroupDonutDto, GroupsGroupVkTicketDto groupsGroupVkTicketDto, GroupsGroupDonutBlockDto groupsGroupDonutBlockDto, GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto, GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto, Integer num13, Boolean bool16, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, GroupsChatsStatusDto groupsChatsStatusDto, BaseBoolIntDto baseBoolIntDto21, Float f, String str12, Boolean bool17, Boolean bool18, Boolean bool19, TrustMarkDto trustMarkDto, GroupsMicrolandingDto groupsMicrolandingDto, GroupsTariffsDto groupsTariffsDto, Integer num14, Boolean bool20, DisallowManageReasonDto disallowManageReasonDto, String str13, BaseBoolIntDto baseBoolIntDto22, GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto, Boolean bool21, Boolean bool22, Integer num15, GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto, Boolean bool23, Integer num16, Boolean bool24, Object obj2, Object obj3, Object obj4, Boolean bool25, Object obj5, Object obj6, Boolean bool26, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, GroupsGroupLikeItemDto groupsGroupLikeItemDto, GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto, Boolean bool27, Integer num22, Integer num23, Integer num24, Integer num25, GroupsGroupFriendsDto groupsGroupFriendsDto, String str14, DeactivatedTypeDto deactivatedTypeDto, String str15, Boolean bool28, Boolean bool29, Boolean bool30, MarketCommunityRatingDto marketCommunityRatingDto, GroupsGroupNameHistoryDto groupsGroupNameHistoryDto, MarketCommunityServiceRatingDto marketCommunityServiceRatingDto, GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto, String str16, String str17, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str18, GroupsAdsPostsInfoDto groupsAdsPostsInfoDto, String str19, GroupsBannerDto groupsBannerDto, GroupsBannerDto groupsBannerDto2, Boolean bool36, LeaveModeDto leaveModeDto, GroupsBannerDto groupsBannerDto3, Boolean bool37, Boolean bool38, VideoNotificationsStatusDto videoNotificationsStatusDto, Boolean bool39, Boolean bool40, String str20, Boolean bool41, GroupsWorkGroupInfoDto groupsWorkGroupInfoDto, String str21, GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto, GroupsStrikesInfoDto groupsStrikesInfoDto, GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto, Boolean bool42, List<String> list3, Boolean bool43, Boolean bool44, List<GroupsTabSettingsDto> list4, Integer num26, Integer num27, GroupsSimpleButtonDto groupsSimpleButtonDto, BaseAPlusMarkDto baseAPlusMarkDto, List<ServiceBookingRepeatRecordDto> list5, GroupsChannelInfoDto groupsChannelInfoDto, GroupsChannelBlockDto groupsChannelBlockDto, Boolean bool45, GroupsEventOrganizerDto groupsEventOrganizerDto, GroupsVideoChannelDataDto groupsVideoChannelDataDto, Boolean bool46, Boolean bool47, Boolean bool48, GroupsContentSectionsDataDto groupsContentSectionsDataDto, String str22, String str23, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto23, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, Integer num28, Integer num29, BaseBoolIntDto baseBoolIntDto26, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List<GroupsAppButtonDto> list6, BaseBoolIntDto baseBoolIntDto27, VideoLiveInfoDto videoLiveInfoDto, Boolean bool49, String str36, Integer num30, List<BaseOwnerButtonDto> list7, Boolean bool50, Boolean bool51, GroupsMarketInfoDto groupsMarketInfoDto, GroupsMarketServicesInfoDto groupsMarketServicesInfoDto, Boolean bool52, Boolean bool53, Boolean bool54, GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto, GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, YoulaStatusDto youlaStatusDto, Boolean bool60, String str37, Integer num31, Boolean bool61, YoulaPostingMethodDto youlaPostingMethodDto) {
            super(null);
            this.id = userId;
            this.memberStatus = groupsGroupFullMemberStatusDto;
            this.isAdult = baseBoolIntDto;
            this.isHiddenFromFeed = baseBoolIntDto2;
            this.isFavorite = baseBoolIntDto3;
            this.isSubscribed = baseBoolIntDto4;
            this.city = baseObjectDto;
            this.country = baseCountryDto;
            this.description = str;
            this.wikiPage = str2;
            this.membersCount = num;
            this.membersCountText = str3;
            this.requestsCount = num2;
            this.musicAwards = audioMusicAwardsDto;
            this.videoLiveLevel = num3;
            this.videoLiveCount = num4;
            this.clipsCount = num5;
            this.counters = groupsCountersGroupDto;
            this.cover = baseOwnerCoverDto;
            this.videoCover = baseOwnerCoverDto2;
            this.videoLivesData = groupsVideoLivesDataDto;
            this.photoAvgColor = str4;
            this.inn = str5;
            this.ogrn = str6;
            this.kpp = str7;
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
            this.activity = str8;
            this.fixedPost = num6;
            this.hasPhoto = baseBoolIntDto14;
            this.cropPhoto = baseCropPhotoDto;
            this.status = str9;
            this.statusAudio = audioAudioDto;
            this.mainAlbumId = num7;
            this.links = list;
            this.contacts = list2;
            this.wall = wallDto;
            this.site = str10;
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
            this.phone = str11;
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
            this.isBusiness = str12;
            this.isBusinessCategory = bool17;
            this.isConfirmedBusiness = bool18;
            this.isGoldenMarkedBusiness = bool19;
            this.trustMark = trustMarkDto;
            this.microlanding = groupsMicrolandingDto;
            this.tariffs = groupsTariffsDto;
            this.verificationEndTime = num14;
            this.canManage = bool20;
            this.disallowManageReason = disallowManageReasonDto;
            this.disallowManageReasonMessage = str13;
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
            this.deactivatedMessage = str14;
            this.deactivatedType = deactivatedTypeDto;
            this.targArtistId = str15;
            this.isGovernmentOrganization = bool28;
            this.settingsTooltipsActive = bool29;
            this.isYclientsTooltipActive = bool30;
            this.rating = marketCommunityRatingDto;
            this.nameHistory = groupsGroupNameHistoryDto;
            this.serviceRating = marketCommunityServiceRatingDto;
            this.recommendedTipsWidget = groupsRecommendedTipsWidgetDto;
            this.region = str16;
            this.subject = str17;
            this.isSetTabOrder = bool31;
            this.isShowBusinessOnboarding = bool32;
            this.businessCommunityTooltips = bool33;
            this.repostsDisabled = bool34;
            this.videoLivesStreamingBanned = bool35;
            this.category1Name = str18;
            this.adsPostsInfo = groupsAdsPostsInfoDto;
            this.thematic = str19;
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
            this.suggestedCategoryName = str20;
            this.isWorkGroup = bool41;
            this.workGroupInfo = groupsWorkGroupInfoDto;
            this.url = str21;
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
            this.name = str22;
            this.screenName = str23;
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
            this.deactivated = str24;
            this.photo50 = str25;
            this.photo100 = str26;
            this.photo200 = str27;
            this.photo200Orig = str28;
            this.photo400 = str29;
            this.photo400Orig = str30;
            this.photoMax = str31;
            this.photoMaxOrig = str32;
            this.photoBase = str33;
            this.estDate = str34;
            this.publicDateLabel = str35;
            this.photoMaxSize = groupsPhotoSizeDto;
            this.appButton = groupsAppButtonDto;
            this.appButtons = list6;
            this.isVideoLiveNotificationsBlocked = baseBoolIntDto27;
            this.videoLive = videoLiveInfoDto;
            this.hadTorch = bool49;
            this.audioArtistId = str36;
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
            this.youlaWallpostRedirectMiniappUrl = str37;
            this.classifiedsAntibaraholkaDesignVersion = num31;
            this.isYoulaPostingToWallAllowed = bool61;
            this.youlaPostingMethod = youlaPostingMethodDto;
        }
    }

    /* compiled from: UsersSubscriptionsItemDto.kt */
    public static final class UsersUserFullDto extends UsersSubscriptionsItemDto implements Parcelable {
        public static final Parcelable.Creator<UsersUserFullDto> CREATOR = new a();

        @pmi0("a_plus_mark")
        private final BaseAPlusMarkDto aPlusMark;

        @pmi0("about")
        private final String about;

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("activities")
        private final String activities;

        @pmi0("activity")
        private final String activity;

        @pmi0("age_group")
        private final Integer ageGroup;

        @pmi0("age_mark")
        private final Integer ageMark;

        @pmi0("animated_avatar")
        private final BaseImageDto animatedAvatar;

        @pmi0("bdate")
        private final String bdate;

        @pmi0("bdate_visibility")
        private final BdateVisibilityDto bdateVisibility;

        @pmi0("blacklisted")
        private final BaseBoolIntDto blacklisted;

        @pmi0("blacklisted_by_me")
        private final BaseBoolIntDto blacklistedByMe;

        @pmi0("books")
        private final String books;

        @pmi0("buttons")
        private final List<BaseOwnerButtonDto> buttons;

        @pmi0("can_access_closed")
        private final Boolean canAccessClosed;

        @pmi0("can_ask_anonymous")
        private final Boolean canAskAnonymous;

        @pmi0("can_ask_question")
        private final Boolean canAskQuestion;

        @pmi0("can_ban")
        private final Boolean canBan;

        @pmi0("can_be_invited_group")
        private final Boolean canBeInvitedGroup;

        @pmi0("can_call")
        private final Boolean canCall;

        @pmi0("can_call_as_community")
        private final Boolean canCallAsCommunity;

        @pmi0("can_call_from_group")
        private final Boolean canCallFromGroup;

        @pmi0("can_invite_as_voicerooms_speaker")
        private final Boolean canInviteAsVoiceroomsSpeaker;

        @pmi0("can_invite_to_chats")
        private final Boolean canInviteToChats;

        @pmi0("can_not_call_reason")
        private final UsersCanNotCallReasonDto canNotCallReason;

        @pmi0("can_post")
        private final BaseBoolIntDto canPost;

        @pmi0("can_see_all_posts")
        private final BaseBoolIntDto canSeeAllPosts;

        @pmi0("can_see_audio")
        private final BaseBoolIntDto canSeeAudio;

        @pmi0("can_see_gifts")
        private final BaseBoolIntDto canSeeGifts;

        @pmi0("can_see_wishes")
        private final Boolean canSeeWishes;

        @pmi0("can_send_friend_request")
        private final BaseBoolIntDto canSendFriendRequest;

        @pmi0("can_subscribe_podcasts")
        private final Boolean canSubscribePodcasts;

        @pmi0("can_subscribe_posts")
        private final Boolean canSubscribePosts;

        @pmi0("can_subscribe_stories")
        private final Boolean canSubscribeStories;

        @pmi0("can_upload_doc")
        private final BaseBoolIntDto canUploadDoc;

        @pmi0("can_write_private_message")
        private final BaseBoolIntDto canWritePrivateMessage;

        @pmi0("career")
        private final List<UsersCareerDto> career;

        @pmi0("city")
        private final BaseCityDto city;

        @pmi0("clips_count")
        private final Integer clipsCount;

        @pmi0("co_ownership_enabled")
        private final Boolean coOwnershipEnabled;

        @pmi0("common_count")
        private final Integer commonCount;

        @pmi0("contact")
        private final MessagesContactDto contact;

        @pmi0("contact_id")
        private final Integer contactId;

        @pmi0("contact_name")
        private final String contactName;

        @pmi0("counters")
        private final UsersUserCountersDto counters;

        @pmi0("country")
        private final BaseCountryDto country;

        @pmi0("cover")
        private final BaseOwnerCoverDto cover;

        @pmi0("crop_photo")
        private final BaseCropPhotoDto cropPhoto;

        @pmi0("custom_names_for_calls")
        private final List<CallsCustomNameForCallDto> customNamesForCalls;

        @pmi0("deactivated")
        private final String deactivated;

        @pmi0("description")
        private final String description;

        @pmi0("descriptions")
        private final List<String> descriptions;

        @pmi0(X3.j.D)
        private final String domain;

        @pmi0("donut")
        private final UsersDonutDto donut;

        @pmi0("edu_details")
        private final List<String> eduDetails;

        @pmi0("education_form")
        private final String educationForm;

        @pmi0("education_status")
        private final String educationStatus;

        @pmi0("educational_profile")
        private final MessagesEduEducationalProfileDto educationalProfile;

        @pmi0("email")
        private final String email;

        @pmi0("emoji_status")
        private final UsersEmojiStatusDto emojiStatus;

        @pmi0("employee_mark")
        private final EmployeeMarkDto employeeMark;

        @pmi0("employee_working_state")
        private final UsersEmployeeWorkingStateDto employeeWorkingState;

        @pmi0("exports")
        private final UsersExportsDto exports;

        @pmi0("facebook")
        private final String facebook;

        @pmi0("facebook_name")
        private final String facebookName;

        @pmi0("faculty")
        private final Integer faculty;

        @pmi0("faculty_name")
        private final String facultyName;

        @pmi0("first_name")
        private final String firstName;

        @pmi0("first_name_abl")
        private final String firstNameAbl;

        @pmi0("first_name_acc")
        private final String firstNameAcc;

        @pmi0("first_name_dat")
        private final String firstNameDat;

        @pmi0("first_name_gen")
        private final String firstNameGen;

        @pmi0("first_name_ins")
        private final String firstNameIns;

        @pmi0("first_name_nom")
        private final String firstNameNom;

        @pmi0("followers_count")
        private final Integer followersCount;

        @pmi0("friend_status")
        private final FriendsFriendStatusStatusDto friendStatus;

        @pmi0("friendship_weeks")
        private final Integer friendshipWeeks;

        @pmi0("games")
        private final String games;

        @pmi0("gifts_tooltip")
        private final UsersGiftsTooltipDto giftsTooltip;

        @pmi0("graduation")
        private final Integer graduation;

        @pmi0("has_email")
        private final Boolean hasEmail;

        @pmi0("has_mobile")
        private final BaseBoolIntDto hasMobile;

        @pmi0("has_photo")
        private final BaseBoolIntDto hasPhoto;

        @pmi0("has_related_user_pin")
        private final Boolean hasRelatedUserPin;

        @pmi0("has_rights")
        private final Boolean hasRights;

        @pmi0("has_unseen_stories")
        private final Boolean hasUnseenStories;

        @pmi0("hash")
        private final String hash;

        @pmi0("hidden")
        private final Integer hidden;

        @pmi0("home_phone")
        private final String homePhone;

        @pmi0("home_town")
        private final String homeTown;

        @pmi0("id")
        private final UserId id;

        @pmi0("image_status")
        private final StatusImageStatusDto imageStatus;

        @pmi0("instagram")
        private final String instagram;

        @pmi0("interests")
        private final String interests;

        @pmi0("is_adult")
        private final BaseBoolIntDto isAdult;

        @pmi0("is_best_friend")
        private final Boolean isBestFriend;

        @pmi0("is_cached")
        private final Boolean isCached;

        @pmi0("is_closed")
        private final Boolean isClosed;

        @pmi0("is_dead")
        private final Boolean isDead;

        @pmi0("is_don")
        private final Boolean isDon;

        @pmi0("is_esia_linked")
        private final Boolean isEsiaLinked;

        @pmi0("is_esia_verified")
        private final Boolean isEsiaVerified;

        @pmi0("is_favorite")
        private final BaseBoolIntDto isFavorite;

        @pmi0("is_followers_mode_on")
        private final Boolean isFollowersModeOn;

        @pmi0("is_friend")
        private final BaseBoolIntDto isFriend;

        @pmi0("is_hidden_from_feed")
        private final BaseBoolIntDto isHiddenFromFeed;

        @pmi0("is_media_moder")
        private final Boolean isMediaModer;

        @pmi0("is_message_request")
        private final Boolean isMessageRequest;

        @pmi0("is_nft")
        private final Boolean isNft;

        @pmi0("is_personal_ads_easy_promote_enabled")
        private final Boolean isPersonalAdsEasyPromoteEnabled;

        @pmi0("is_photo_map_enabled")
        private final Boolean isPhotoMapEnabled;

        @pmi0("is_sber_linked")
        private final Boolean isSberLinked;

        @pmi0("is_sber_verified")
        private final Boolean isSberVerified;

        @pmi0("is_service")
        private final Boolean isService;

        @pmi0("is_service_account")
        private final Boolean isServiceAccount;

        @pmi0("is_student")
        private final Boolean isStudent;

        @pmi0("is_subscribed")
        private final BaseBoolIntDto isSubscribed;

        @pmi0("is_subscribed_podcasts")
        private final Boolean isSubscribedPodcasts;

        @pmi0("is_subscribed_stories")
        private final Boolean isSubscribedStories;

        @pmi0("is_teacher")
        private final Boolean isTeacher;

        @pmi0("is_tinkoff_linked")
        private final Boolean isTinkoffLinked;

        @pmi0("is_tinkoff_verified")
        private final Boolean isTinkoffVerified;

        @pmi0("is_verified")
        private final Boolean isVerified;

        @pmi0("is_video_live_notifications_blocked")
        private final BaseBoolIntDto isVideoLiveNotificationsBlocked;

        @pmi0("joined")
        private final Integer joined;

        @pmi0("language")
        private final String language;

        @pmi0("last_name")
        private final String lastName;

        @pmi0("last_name_abl")
        private final String lastNameAbl;

        @pmi0("last_name_acc")
        private final String lastNameAcc;

        @pmi0("last_name_dat")
        private final String lastNameDat;

        @pmi0("last_name_gen")
        private final String lastNameGen;

        @pmi0("last_name_ins")
        private final String lastNameIns;

        @pmi0("last_name_nom")
        private final String lastNameNom;

        @pmi0("last_seen")
        private final UsersLastSeenDto lastSeen;

        @pmi0("lists")
        private final List<Integer> lists;

        @pmi0("livejournal")
        private final String livejournal;

        @pmi0("maiden_name")
        private final String maidenName;

        @pmi0("military")
        private final List<UsersMilitaryDto> military;

        @pmi0("mobile_phone")
        private final String mobilePhone;

        @pmi0("movies")
        private final String movies;

        @pmi0("music")
        private final String music;

        @pmi0("music_awards")
        private final AudioMusicAwardsDto musicAwards;

        @pmi0("mutual")
        private final FriendsRequestsMutualDto mutual;

        @pmi0("need_big_msg_btn_in_profile")
        private final Boolean needBigMsgBtnInProfile;

        @pmi0("nickname")
        private final String nickname;

        @pmi0("no_index")
        private final NoIndexDto noIndex;

        @pmi0("oauth_linked")
        private final List<String> oauthLinked;

        @pmi0("oauth_verification")
        private final List<String> oauthVerification;

        @pmi0("occupation")
        private final UsersOccupationDto occupation;

        @pmi0(eok.ONLINE_EXTRAS_KEY)
        private final BaseBoolIntDto online;

        @pmi0("online_app")
        private final Integer onlineApp;

        @pmi0("online_info")
        private final UsersOnlineInfoDto onlineInfo;

        @pmi0("online_mobile")
        private final BaseBoolIntDto onlineMobile;

        @pmi0("owner_state")
        private final OwnerStateDto ownerState;

        @pmi0("personal")
        private final UsersPersonalDto personal;

        @pmi0("photo")
        private final String photo;

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

        @pmi0("photo_big")
        private final String photoBig;

        @pmi0("photo_id")
        private final String photoId;

        @pmi0("photo_max")
        private final String photoMax;

        @pmi0("photo_max_orig")
        private final String photoMaxOrig;

        @pmi0("photo_max_size")
        private final PhotosPhotoDto photoMaxSize;

        @pmi0("photo_medium")
        private final String photoMedium;

        @pmi0("photo_medium_rec")
        private final String photoMediumRec;

        @pmi0("photo_rec")
        private final String photoRec;

        @pmi0("profile_buttons")
        private final List<List<UsersProfileButtonDto>> profileButtons;

        @pmi0("profile_buttons_tablet")
        private final List<List<UsersProfileButtonDto>> profileButtonsTablet;

        @pmi0("profile_type")
        private final UsersUserProfileTypeDto profileType;

        @pmi0("promotion_allowance")
        private final UsersPromotionAllowanceDto promotionAllowance;

        @pmi0("quotes")
        private final String quotes;

        @pmi0("relation")
        private final UsersUserRelationDto relation;

        @pmi0("relation_partner")
        private final UsersUserMinDto relationPartner;

        @pmi0("relatives")
        private final List<UsersRelativeDto> relatives;

        @pmi0("rights_location")
        private final UsersRightsLocationDto rightsLocation;

        @pmi0("schools")
        private final List<UsersSchoolDto> schools;

        @pmi0("screen_name")
        private final String screenName;

        @pmi0("service_description")
        private final String serviceDescription;

        @pmi0("sex")
        private final BaseSexDto sex;

        @pmi0("site")
        private final String site;

        @pmi0("skype")
        private final String skype;

        @pmi0("social_button_type")
        private final SocialButtonTypeDto socialButtonType;

        @pmi0("status")
        private final String status;

        @pmi0("status_app")
        private final AppsAppMinDto statusApp;

        @pmi0("status_audio")
        private final AudioAudioDto statusAudio;

        @pmi0("stories_archive_count")
        private final Integer storiesArchiveCount;

        @pmi0("subscription_country")
        private final String subscriptionCountry;

        @pmi0("sys_username")
        private final String sysUsername;

        @pmi0(LoginRequest.CLIENT_NAME)
        private final BaseBoolIntDto test;

        @pmi0("third_party_buttons")
        private final List<UsersProfileButtonDto> thirdPartyButtons;

        @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
        private final Float timezone;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("trending")
        private final BaseBoolIntDto trending;

        @pmi0("tv")
        private final String tv;

        @pmi0("twitter")
        private final String twitter;

        @pmi0("type")
        private final UsersUserTypeDto type;

        @pmi0("universities")
        private final List<UsersUniversityDto> universities;

        @pmi0("university")
        private final Integer university;

        @pmi0("university_group_id")
        private final Integer universityGroupId;

        @pmi0("university_name")
        private final String universityName;

        @pmi0("verified")
        private final BaseBoolIntDto verified;

        @pmi0("video_live")
        private final VideoLiveInfoDto videoLive;

        @pmi0("video_live_count")
        private final Integer videoLiveCount;

        @pmi0("video_live_level")
        private final Integer videoLiveLevel;

        @pmi0("wall_comments")
        private final BaseBoolIntDto wallComments;

        @pmi0("wall_default")
        private final WallDefaultDto wallDefault;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class BdateVisibilityDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ BdateVisibilityDto[] $VALUES;
            public static final Parcelable.Creator<BdateVisibilityDto> CREATOR;

            @pmi0("2")
            public static final BdateVisibilityDto DAY_AND_MONTH_ONLY;

            @pmi0("0")
            public static final BdateVisibilityDto IS_HIDDEN;

            @pmi0("1")
            public static final BdateVisibilityDto IS_VISIBLE;
            private final int value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
            public static final class a implements Parcelable.Creator<BdateVisibilityDto> {
                @Override // android.os.Parcelable.Creator
                public final BdateVisibilityDto createFromParcel(Parcel parcel) {
                    return BdateVisibilityDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final BdateVisibilityDto[] newArray(int i) {
                    return new BdateVisibilityDto[i];
                }
            }

            static {
                BdateVisibilityDto bdateVisibilityDto = new BdateVisibilityDto("IS_HIDDEN", 0, 0);
                IS_HIDDEN = bdateVisibilityDto;
                BdateVisibilityDto bdateVisibilityDto2 = new BdateVisibilityDto("IS_VISIBLE", 1, 1);
                IS_VISIBLE = bdateVisibilityDto2;
                BdateVisibilityDto bdateVisibilityDto3 = new BdateVisibilityDto("DAY_AND_MONTH_ONLY", 2, 2);
                DAY_AND_MONTH_ONLY = bdateVisibilityDto3;
                BdateVisibilityDto[] bdateVisibilityDtoArr = {bdateVisibilityDto, bdateVisibilityDto2, bdateVisibilityDto3};
                $VALUES = bdateVisibilityDtoArr;
                $ENTRIES = new asp(bdateVisibilityDtoArr);
                CREATOR = new a();
            }

            private BdateVisibilityDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static BdateVisibilityDto valueOf(String str) {
                return (BdateVisibilityDto) Enum.valueOf(BdateVisibilityDto.class, str);
            }

            public static BdateVisibilityDto[] values() {
                return (BdateVisibilityDto[]) $VALUES.clone();
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class EmployeeMarkDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EmployeeMarkDto[] $VALUES;

            @pmi0("business_trip")
            public static final EmployeeMarkDto BUSINESS_TRIP;
            public static final Parcelable.Creator<EmployeeMarkDto> CREATOR;

            @pmi0("mrg_unit")
            public static final EmployeeMarkDto MRG_UNIT;

            @pmi0("normal")
            public static final EmployeeMarkDto NORMAL;

            @pmi0("outsourcer")
            public static final EmployeeMarkDto OUTSOURCER;

            @pmi0("vacation")
            public static final EmployeeMarkDto VACATION;
            private final String value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
            public static final class a implements Parcelable.Creator<EmployeeMarkDto> {
                @Override // android.os.Parcelable.Creator
                public final EmployeeMarkDto createFromParcel(Parcel parcel) {
                    return EmployeeMarkDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final EmployeeMarkDto[] newArray(int i) {
                    return new EmployeeMarkDto[i];
                }
            }

            static {
                EmployeeMarkDto employeeMarkDto = new EmployeeMarkDto("VACATION", 0, "vacation");
                VACATION = employeeMarkDto;
                EmployeeMarkDto employeeMarkDto2 = new EmployeeMarkDto("BUSINESS_TRIP", 1, "business_trip");
                BUSINESS_TRIP = employeeMarkDto2;
                EmployeeMarkDto employeeMarkDto3 = new EmployeeMarkDto("MRG_UNIT", 2, "mrg_unit");
                MRG_UNIT = employeeMarkDto3;
                EmployeeMarkDto employeeMarkDto4 = new EmployeeMarkDto("NORMAL", 3, "normal");
                NORMAL = employeeMarkDto4;
                EmployeeMarkDto employeeMarkDto5 = new EmployeeMarkDto("OUTSOURCER", 4, "outsourcer");
                OUTSOURCER = employeeMarkDto5;
                EmployeeMarkDto[] employeeMarkDtoArr = {employeeMarkDto, employeeMarkDto2, employeeMarkDto3, employeeMarkDto4, employeeMarkDto5};
                $VALUES = employeeMarkDtoArr;
                $ENTRIES = new asp(employeeMarkDtoArr);
                CREATOR = new a();
            }

            private EmployeeMarkDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static EmployeeMarkDto valueOf(String str) {
                return (EmployeeMarkDto) Enum.valueOf(EmployeeMarkDto.class, str);
            }

            public static EmployeeMarkDto[] values() {
                return (EmployeeMarkDto[]) $VALUES.clone();
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class NoIndexDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ NoIndexDto[] $VALUES;

            @pmi0("all")
            public static final NoIndexDto ALL;

            @pmi0("all_except_of_search_engines")
            public static final NoIndexDto ALL_EXCEPT_OF_SEARCH_ENGINES;
            public static final Parcelable.Creator<NoIndexDto> CREATOR;

            @pmi0("vk_users_only")
            public static final NoIndexDto VK_USERS_ONLY;
            private final String value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
            public static final class a implements Parcelable.Creator<NoIndexDto> {
                @Override // android.os.Parcelable.Creator
                public final NoIndexDto createFromParcel(Parcel parcel) {
                    return NoIndexDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NoIndexDto[] newArray(int i) {
                    return new NoIndexDto[i];
                }
            }

            static {
                NoIndexDto noIndexDto = new NoIndexDto("ALL", 0, "all");
                ALL = noIndexDto;
                NoIndexDto noIndexDto2 = new NoIndexDto("ALL_EXCEPT_OF_SEARCH_ENGINES", 1, "all_except_of_search_engines");
                ALL_EXCEPT_OF_SEARCH_ENGINES = noIndexDto2;
                NoIndexDto noIndexDto3 = new NoIndexDto("VK_USERS_ONLY", 2, "vk_users_only");
                VK_USERS_ONLY = noIndexDto3;
                NoIndexDto[] noIndexDtoArr = {noIndexDto, noIndexDto2, noIndexDto3};
                $VALUES = noIndexDtoArr;
                $ENTRIES = new asp(noIndexDtoArr);
                CREATOR = new a();
            }

            private NoIndexDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static NoIndexDto valueOf(String str) {
                return (NoIndexDto) Enum.valueOf(NoIndexDto.class, str);
            }

            public static NoIndexDto[] values() {
                return (NoIndexDto[]) $VALUES.clone();
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class SocialButtonTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

            @pmi0("add")
            public static final SocialButtonTypeDto ADD;
            public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

            @pmi0("follow")
            public static final SocialButtonTypeDto FOLLOW;
            private final String value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
            public static final class a implements Parcelable.Creator<SocialButtonTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final SocialButtonTypeDto createFromParcel(Parcel parcel) {
                    return SocialButtonTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SocialButtonTypeDto[] newArray(int i) {
                    return new SocialButtonTypeDto[i];
                }
            }

            static {
                SocialButtonTypeDto socialButtonTypeDto = new SocialButtonTypeDto("FOLLOW", 0, "follow");
                FOLLOW = socialButtonTypeDto;
                SocialButtonTypeDto socialButtonTypeDto2 = new SocialButtonTypeDto("ADD", 1, "add");
                ADD = socialButtonTypeDto2;
                SocialButtonTypeDto[] socialButtonTypeDtoArr = {socialButtonTypeDto, socialButtonTypeDto2};
                $VALUES = socialButtonTypeDtoArr;
                $ENTRIES = new asp(socialButtonTypeDtoArr);
                CREATOR = new a();
            }

            private SocialButtonTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static SocialButtonTypeDto valueOf(String str) {
                return (SocialButtonTypeDto) Enum.valueOf(SocialButtonTypeDto.class, str);
            }

            public static SocialButtonTypeDto[] values() {
                return (SocialButtonTypeDto[]) $VALUES.clone();
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
        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class WallDefaultDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ WallDefaultDto[] $VALUES;

            @pmi0("all")
            public static final WallDefaultDto ALL;
            public static final Parcelable.Creator<WallDefaultDto> CREATOR;

            @pmi0("owner")
            public static final WallDefaultDto OWNER;
            private final String value;

            /* compiled from: UsersSubscriptionsItemDto.kt */
            public static final class a implements Parcelable.Creator<WallDefaultDto> {
                @Override // android.os.Parcelable.Creator
                public final WallDefaultDto createFromParcel(Parcel parcel) {
                    return WallDefaultDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final WallDefaultDto[] newArray(int i) {
                    return new WallDefaultDto[i];
                }
            }

            static {
                WallDefaultDto wallDefaultDto = new WallDefaultDto("OWNER", 0, "owner");
                OWNER = wallDefaultDto;
                WallDefaultDto wallDefaultDto2 = new WallDefaultDto("ALL", 1, "all");
                ALL = wallDefaultDto2;
                WallDefaultDto[] wallDefaultDtoArr = {wallDefaultDto, wallDefaultDto2};
                $VALUES = wallDefaultDtoArr;
                $ENTRIES = new asp(wallDefaultDtoArr);
                CREATOR = new a();
            }

            private WallDefaultDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static WallDefaultDto valueOf(String str) {
                return (WallDefaultDto) Enum.valueOf(WallDefaultDto.class, str);
            }

            public static WallDefaultDto[] values() {
                return (WallDefaultDto[]) $VALUES.clone();
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

        /* compiled from: UsersSubscriptionsItemDto.kt */
        public static final class a implements Parcelable.Creator<UsersUserFullDto> {
            @Override // android.os.Parcelable.Creator
            public final UsersUserFullDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                Boolean valueOf6;
                PhotosPhotoDto photosPhotoDto;
                BaseBoolIntDto baseBoolIntDto;
                ArrayList arrayList;
                UserId userId;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Boolean valueOf7;
                UserId userId2;
                WallDefaultDto createFromParcel;
                Boolean valueOf8;
                Boolean valueOf9;
                Boolean valueOf10;
                Boolean valueOf11;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                Boolean valueOf12;
                UsersOccupationDto usersOccupationDto;
                ArrayList arrayList7;
                ArrayList arrayList8;
                BaseBoolIntDto baseBoolIntDto2;
                ArrayList arrayList9;
                ArrayList arrayList10;
                UsersPersonalDto usersPersonalDto;
                Integer num;
                ArrayList arrayList11;
                BaseBoolIntDto baseBoolIntDto3;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                ArrayList arrayList15;
                Boolean valueOf13;
                Boolean valueOf14;
                Boolean valueOf15;
                Boolean valueOf16;
                Boolean valueOf17;
                UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto;
                EmployeeMarkDto createFromParcel2;
                Boolean valueOf18;
                Boolean valueOf19;
                Boolean valueOf20;
                Boolean valueOf21;
                UsersGiftsTooltipDto usersGiftsTooltipDto;
                NoIndexDto createFromParcel3;
                Boolean valueOf22;
                MessagesContactDto messagesContactDto;
                Boolean bool;
                ArrayList arrayList16;
                ArrayList arrayList17;
                Integer valueOf23;
                Boolean bool2;
                Boolean valueOf24;
                Boolean valueOf25;
                Boolean valueOf26;
                Boolean valueOf27;
                BaseImageDto baseImageDto;
                ArrayList arrayList18;
                ArrayList arrayList19;
                UsersUserProfileTypeDto usersUserProfileTypeDto;
                Boolean valueOf28;
                Boolean valueOf29;
                Boolean valueOf30;
                Boolean valueOf31;
                Boolean valueOf32;
                Boolean valueOf33;
                Boolean valueOf34;
                Boolean valueOf35;
                Boolean valueOf36;
                Boolean valueOf37;
                Boolean valueOf38;
                Boolean valueOf39;
                Boolean valueOf40;
                Boolean valueOf41;
                Boolean valueOf42;
                Boolean valueOf43;
                Boolean valueOf44;
                Boolean valueOf45;
                UserId userId3 = (UserId) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                BdateVisibilityDto createFromParcel4 = parcel.readInt() == 0 ? null : BdateVisibilityDto.CREATOR.createFromParcel(parcel);
                BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Float valueOf46 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                OwnerStateDto ownerStateDto = (OwnerStateDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                String readString24 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Boolean bool3 = valueOf;
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersUserTypeDto usersUserTypeDto = (UsersUserTypeDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString30 = parcel.readString();
                Boolean bool4 = valueOf2;
                Boolean bool5 = valueOf3;
                Boolean bool6 = valueOf4;
                Boolean bool7 = valueOf5;
                String readString31 = parcel.readString();
                String readString32 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString33 = parcel.readString();
                Boolean bool8 = valueOf6;
                String readString34 = parcel.readString();
                String readString35 = parcel.readString();
                String readString36 = parcel.readString();
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                String readString39 = parcel.readString();
                PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    photosPhotoDto = photosPhotoDto2;
                    baseBoolIntDto = baseBoolIntDto7;
                    userId = userId3;
                    arrayList = null;
                } else {
                    photosPhotoDto = photosPhotoDto2;
                    int readInt = parcel.readInt();
                    baseBoolIntDto = baseBoolIntDto7;
                    arrayList = new ArrayList(readInt);
                    userId = userId3;
                    int i = 0;
                    while (i != readInt) {
                        int i2 = readInt;
                        int readInt2 = parcel.readInt();
                        int i3 = i;
                        ArrayList arrayList20 = new ArrayList(readInt2);
                        String str = readString;
                        int i4 = 0;
                        while (i4 != readInt2) {
                            i4 = bo.b(UsersUserFullDto.class, parcel, arrayList20, i4, 1);
                            readInt2 = readInt2;
                        }
                        arrayList.add(arrayList20);
                        i = i3 + 1;
                        readInt = i2;
                        readString = str;
                    }
                }
                String str2 = readString;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    int i5 = 0;
                    while (i5 != readInt3) {
                        int i6 = readInt3;
                        int readInt4 = parcel.readInt();
                        ArrayList arrayList21 = arrayList;
                        ArrayList arrayList22 = new ArrayList(readInt4);
                        int i7 = i5;
                        int i8 = 0;
                        while (i8 != readInt4) {
                            i8 = bo.b(UsersUserFullDto.class, parcel, arrayList22, i8, 1);
                            readInt4 = readInt4;
                        }
                        arrayList2.add(arrayList22);
                        i5 = i7 + 1;
                        readInt3 = i6;
                        arrayList = arrayList21;
                    }
                }
                ArrayList arrayList23 = arrayList;
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt5 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt5);
                    int i9 = 0;
                    while (i9 != readInt5) {
                        i9 = bo.b(UsersUserFullDto.class, parcel, arrayList3, i9, 1);
                        readInt5 = readInt5;
                    }
                }
                UserId userId4 = userId;
                String readString40 = parcel.readString();
                Integer valueOf47 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    userId2 = userId4;
                    createFromParcel = null;
                } else {
                    userId2 = userId4;
                    createFromParcel = WallDefaultDto.CREATOR.createFromParcel(parcel);
                }
                WallDefaultDto wallDefaultDto = createFromParcel;
                AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
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
                BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList4 = arrayList3;
                    arrayList6 = arrayList2;
                    arrayList5 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    arrayList4 = arrayList3;
                    arrayList5 = new ArrayList(readInt6);
                    arrayList6 = arrayList2;
                    int i10 = 0;
                    while (i10 != readInt6) {
                        i10 = bo.b(UsersUserFullDto.class, parcel, arrayList5, i10, 1);
                        readInt6 = readInt6;
                    }
                    baseBoolIntDto15 = baseBoolIntDto15;
                }
                String readString41 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto16 = baseBoolIntDto;
                ArrayList arrayList24 = arrayList4;
                String readString42 = parcel.readString();
                PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
                ArrayList arrayList25 = arrayList6;
                String readString43 = parcel.readString();
                String readString44 = parcel.readString();
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                String readString47 = parcel.readString();
                String readString48 = parcel.readString();
                String readString49 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto15;
                BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString50 = parcel.readString();
                Boolean bool9 = valueOf7;
                Boolean bool10 = valueOf8;
                Boolean bool11 = valueOf9;
                Boolean bool12 = valueOf10;
                Boolean bool13 = valueOf11;
                Boolean bool14 = valueOf12;
                String readString51 = parcel.readString();
                String readString52 = parcel.readString();
                AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                String readString53 = parcel.readString();
                String readString54 = parcel.readString();
                AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersExportsDto usersExportsDto = (UsersExportsDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Integer valueOf48 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf49 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf50 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UsersOccupationDto usersOccupationDto2 = (UsersOccupationDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    usersOccupationDto = usersOccupationDto2;
                    arrayList7 = arrayList5;
                    baseBoolIntDto2 = baseBoolIntDto17;
                    arrayList8 = null;
                } else {
                    usersOccupationDto = usersOccupationDto2;
                    int readInt7 = parcel.readInt();
                    arrayList7 = arrayList5;
                    arrayList8 = new ArrayList(readInt7);
                    baseBoolIntDto2 = baseBoolIntDto17;
                    int i11 = 0;
                    while (i11 != readInt7) {
                        i11 = bo.b(UsersUserFullDto.class, parcel, arrayList8, i11, 1);
                        readInt7 = readInt7;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList10 = arrayList8;
                    arrayList9 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList9 = new ArrayList(readInt8);
                    arrayList10 = arrayList8;
                    int i12 = 0;
                    while (i12 != readInt8) {
                        i12 = bo.b(UsersUserFullDto.class, parcel, arrayList9, i12, 1);
                        readInt8 = readInt8;
                    }
                }
                Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto24 = baseBoolIntDto2;
                String readString55 = parcel.readString();
                Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString56 = parcel.readString();
                Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString57 = parcel.readString();
                ArrayList arrayList26 = arrayList10;
                Integer num2 = valueOf54;
                Integer num3 = valueOf55;
                Integer num4 = valueOf56;
                String readString58 = parcel.readString();
                String readString59 = parcel.readString();
                ArrayList arrayList27 = arrayList9;
                UsersUserRelationDto usersUserRelationDto = (UsersUserRelationDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersPersonalDto usersPersonalDto2 = (UsersPersonalDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    usersPersonalDto = usersPersonalDto2;
                    num = valueOf53;
                    baseBoolIntDto3 = baseBoolIntDto24;
                    arrayList11 = null;
                } else {
                    usersPersonalDto = usersPersonalDto2;
                    int readInt9 = parcel.readInt();
                    num = valueOf53;
                    arrayList11 = new ArrayList(readInt9);
                    baseBoolIntDto3 = baseBoolIntDto24;
                    int i13 = 0;
                    while (i13 != readInt9) {
                        i13 = bo.b(UsersUserFullDto.class, parcel, arrayList11, i13, 1);
                        readInt9 = readInt9;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList13 = arrayList11;
                    arrayList12 = null;
                } else {
                    int readInt10 = parcel.readInt();
                    arrayList12 = new ArrayList(readInt10);
                    arrayList13 = arrayList11;
                    int i14 = 0;
                    while (i14 != readInt10) {
                        i14 = bo.b(UsersUserFullDto.class, parcel, arrayList12, i14, 1);
                        readInt10 = readInt10;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList15 = arrayList12;
                    arrayList14 = null;
                } else {
                    int readInt11 = parcel.readInt();
                    arrayList14 = new ArrayList(readInt11);
                    arrayList15 = arrayList12;
                    int i15 = 0;
                    while (i15 != readInt11) {
                        i15 = bo.b(UsersUserFullDto.class, parcel, arrayList14, i15, 1);
                        readInt11 = readInt11;
                    }
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
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString60 = parcel.readString();
                Boolean bool15 = valueOf13;
                UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (UsersEmployeeWorkingStateDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                    createFromParcel2 = null;
                } else {
                    usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                    createFromParcel2 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
                }
                EmployeeMarkDto employeeMarkDto = createFromParcel2;
                UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
                }
                UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersUserCountersDto usersUserCountersDto = (UsersUserCountersDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
                ArrayList arrayList28 = arrayList15;
                Boolean bool16 = valueOf15;
                Boolean bool17 = valueOf16;
                Boolean bool18 = valueOf17;
                UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
                String readString61 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
                }
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                boolean z = false;
                BaseBoolIntDto baseBoolIntDto26 = baseBoolIntDto3;
                Boolean bool19 = valueOf18;
                Boolean bool20 = valueOf19;
                String readString62 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf21 = null;
                } else {
                    valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
                }
                UsersGiftsTooltipDto usersGiftsTooltipDto2 = (UsersGiftsTooltipDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    usersGiftsTooltipDto = usersGiftsTooltipDto2;
                    createFromParcel3 = null;
                } else {
                    usersGiftsTooltipDto = usersGiftsTooltipDto2;
                    createFromParcel3 = NoIndexDto.CREATOR.createFromParcel(parcel);
                }
                NoIndexDto noIndexDto = createFromParcel3;
                Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                MessagesContactDto messagesContactDto2 = (MessagesContactDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf22 = null;
                } else {
                    valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    messagesContactDto = messagesContactDto2;
                    bool = valueOf14;
                    arrayList17 = arrayList14;
                    arrayList16 = null;
                } else {
                    messagesContactDto = messagesContactDto2;
                    int readInt12 = parcel.readInt();
                    bool = valueOf14;
                    arrayList16 = new ArrayList(readInt12);
                    arrayList17 = arrayList14;
                    int i16 = 0;
                    while (i16 != readInt12) {
                        i16 = pm0.b(parcel, arrayList16, i16, 1);
                        readInt12 = readInt12;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf23 = null;
                    bool2 = null;
                } else {
                    valueOf23 = Integer.valueOf(parcel.readInt());
                    bool2 = null;
                }
                Integer num5 = valueOf48;
                Integer num6 = valueOf49;
                Integer num7 = valueOf50;
                Integer num8 = valueOf51;
                Integer num9 = valueOf52;
                UsersOccupationDto usersOccupationDto3 = usersOccupationDto;
                ArrayList arrayList29 = arrayList13;
                Boolean bool21 = bool;
                String readString63 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf24 = bool2;
                } else {
                    valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf25 = bool2;
                } else {
                    valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
                }
                UsersUserProfileTypeDto usersUserProfileTypeDto2 = (UsersUserProfileTypeDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Integer num10 = valueOf23;
                UsersCanNotCallReasonDto usersCanNotCallReasonDto = (UsersCanNotCallReasonDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf26 = null;
                } else {
                    valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf27 = null;
                } else {
                    valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseImageDto = baseImageDto2;
                    arrayList18 = arrayList16;
                    usersUserProfileTypeDto = usersUserProfileTypeDto2;
                    arrayList19 = null;
                } else {
                    baseImageDto = baseImageDto2;
                    int readInt13 = parcel.readInt();
                    arrayList18 = arrayList16;
                    arrayList19 = new ArrayList(readInt13);
                    usersUserProfileTypeDto = usersUserProfileTypeDto2;
                    int i17 = 0;
                    while (i17 != readInt13) {
                        i17 = bo.b(UsersUserFullDto.class, parcel, arrayList19, i17, 1);
                        readInt13 = readInt13;
                    }
                }
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
                SocialButtonTypeDto createFromParcel5 = parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
                String readString64 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf35 = null;
                } else {
                    valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
                }
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                Boolean bool22 = valueOf35;
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    valueOf36 = null;
                } else {
                    valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf37 = null;
                } else {
                    valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
                }
                UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf38 = null;
                } else {
                    valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf39 = null;
                } else {
                    valueOf39 = Boolean.valueOf(parcel.readInt() != 0);
                }
                MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseAPlusMarkDto baseAPlusMarkDto = (BaseAPlusMarkDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf40 = null;
                } else {
                    valueOf40 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf41 = null;
                } else {
                    valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf42 = null;
                } else {
                    valueOf42 = Boolean.valueOf(parcel.readInt() != 0);
                }
                UsersDonutDto usersDonutDto = (UsersDonutDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Boolean bool23 = valueOf38;
                Integer num11 = valueOf60;
                Boolean bool24 = valueOf39;
                Boolean bool25 = valueOf40;
                Boolean bool26 = valueOf41;
                Boolean bool27 = valueOf42;
                String readString65 = parcel.readString();
                String readString66 = parcel.readString();
                String readString67 = parcel.readString();
                String readString68 = parcel.readString();
                UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto29 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto30 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
                Boolean bool28 = valueOf36;
                Integer num12 = valueOf58;
                Integer num13 = valueOf59;
                Boolean bool29 = valueOf37;
                Integer num14 = valueOf61;
                String readString69 = parcel.readString();
                String readString70 = parcel.readString();
                Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString71 = parcel.readString();
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
                    valueOf45 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    valueOf45 = Boolean.valueOf(z);
                }
                return new UsersUserFullDto(userId2, str2, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, createFromParcel4, baseCityDto, baseCountryDto, valueOf46, ownerStateDto, readString18, readString19, readString20, readString21, readString22, readString23, baseBoolIntDto4, baseOwnerCoverDto, readString24, baseBoolIntDto5, baseBoolIntDto6, bool3, baseBoolIntDto16, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, usersUserTypeDto, readString25, readString26, readString27, readString28, readString29, baseBoolIntDto11, baseBoolIntDto12, bool4, bool5, bool6, bool7, readString30, readString31, readString32, baseBoolIntDto13, videoLiveInfoDto, baseBoolIntDto14, bool8, readString33, readString34, readString35, readString36, readString37, readString38, readString39, photosPhotoDto3, arrayList23, arrayList25, arrayList24, readString40, valueOf47, bool9, wallDefaultDto, audioMusicAwardsDto, bool10, bool11, bool12, bool13, baseBoolIntDto18, arrayList7, readString41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, baseBoolIntDto26, baseBoolIntDto19, bool14, readString50, readString51, readString52, audioAudioDto, readString53, readString54, appsAppMinDto, usersLastSeenDto, usersExportsDto, baseCropPhotoDto, num5, num6, num7, num8, baseBoolIntDto20, baseBoolIntDto21, baseBoolIntDto22, baseBoolIntDto23, num9, usersOccupationDto3, arrayList26, arrayList27, num, readString55, num2, num3, readString56, num4, readString57, readString58, readString59, usersUserRelationDto, usersUserMinDto, usersPersonalDto3, arrayList29, arrayList28, arrayList17, bool15, bool21, bool16, bool17, bool18, readString60, usersEmployeeWorkingStateDto3, employeeMarkDto, usersRightsLocationDto, bool19, usersEmojiStatusDto, statusImageStatusDto, usersUserCountersDto, readString61, baseBoolIntDto25, bool20, createStringArrayList, readString62, valueOf20, valueOf21, usersGiftsTooltipDto, noIndexDto, valueOf57, messagesContactDto, valueOf22, createStringArrayList2, arrayList18, num10, readString63, valueOf24, valueOf25, usersUserProfileTypeDto, usersCanNotCallReasonDto, valueOf26, valueOf27, baseImageDto, arrayList19, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, createFromParcel5, readString64, bool22, createStringArrayList3, createStringArrayList4, bool28, num12, num13, bool29, usersPromotionAllowanceDto, bool23, num11, bool24, messagesEduEducationalProfileDto, baseAPlusMarkDto, bool25, bool26, bool27, usersDonutDto, baseSexDto, readString65, readString66, readString67, readString68, usersOnlineInfoDto, baseBoolIntDto27, baseBoolIntDto28, num14, baseBoolIntDto29, baseBoolIntDto30, friendsFriendStatusStatusDto, friendsRequestsMutualDto, readString69, readString70, valueOf62, readString71, valueOf43, valueOf44, valueOf45);
            }

            @Override // android.os.Parcelable.Creator
            public final UsersUserFullDto[] newArray(int i) {
                return new UsersUserFullDto[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ UsersUserFullDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str24, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str25, String str26, String str27, String str28, String str29, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str30, String str31, String str32, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool6, String str33, String str34, String str35, String str36, String str37, String str38, String str39, PhotosPhotoDto photosPhotoDto, List list, List list2, List list3, String str40, Integer num, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto12, List list4, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool12, String str50, String str51, String str52, AudioAudioDto audioAudioDto, String str53, String str54, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List list5, List list6, Integer num7, String str55, Integer num8, Integer num9, String str56, Integer num10, String str57, String str58, String str59, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list7, List list8, List list9, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str60, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str61, BaseBoolIntDto baseBoolIntDto19, Boolean bool19, List list10, String str62, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool22, List list11, List list12, Integer num12, String str63, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str64, Boolean bool34, List list14, List list15, Boolean bool35, Integer num13, Integer num14, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num15, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str65, String str66, String str67, String str68, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str69, String str70, Integer num17, String str71, Boolean bool42, Boolean bool43, Boolean bool44, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
            this(userId, r161, r9, r10, r11, r12, r13, r14, r15, r8, r162, r163, r164, r165, r7, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r166, r39, r40, r41, r42, r43, r44, r45, r167, r168, r169, r170, r171, r172, r173, r174, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r175, r176, r177, r178, r179, r180, r181, r182, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r183, r184, r185, r186, r187, r188, r189, r190, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r191, r192, r193, r194, r195, r196, r197, r0, (i5 & 32768) != 0 ? null : baseBoolIntDto19, (i5 & 65536) != 0 ? null : bool19, (i5 & 131072) != 0 ? null : list10, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str62, (i5 & 524288) != 0 ? null : bool20, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool21, (i5 & 2097152) != 0 ? null : usersGiftsTooltipDto, (i5 & 4194304) != 0 ? null : noIndexDto, (i5 & 8388608) != 0 ? null : num11, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : messagesContactDto, (i5 & 33554432) != 0 ? null : bool22, (i5 & 67108864) != 0 ? null : list11, (i5 & 134217728) != 0 ? null : list12, (i5 & 268435456) != 0 ? null : num12, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str63, (i5 & 1073741824) != 0 ? null : bool23, (i5 & Integer.MIN_VALUE) != 0 ? null : bool24, (i6 & 1) != 0 ? null : usersUserProfileTypeDto, (i6 & 2) != 0 ? null : usersCanNotCallReasonDto, (i6 & 4) != 0 ? null : bool25, (i6 & 8) != 0 ? null : bool26, (i6 & 16) != 0 ? null : baseImageDto, (i6 & 32) != 0 ? null : list13, (i6 & 64) != 0 ? null : bool27, (i6 & 128) != 0 ? null : bool28, (i6 & 256) != 0 ? null : bool29, (i6 & 512) != 0 ? null : bool30, (i6 & 1024) != 0 ? null : bool31, (i6 & 2048) != 0 ? null : bool32, (i6 & 4096) != 0 ? null : bool33, (i6 & 8192) != 0 ? null : socialButtonTypeDto, (i6 & 16384) != 0 ? null : str64, (i6 & 32768) != 0 ? null : bool34, (i6 & 65536) != 0 ? null : list14, (i6 & 131072) != 0 ? null : list15, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool35, (i6 & 524288) != 0 ? null : num13, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num14, (i6 & 2097152) != 0 ? null : bool36, (i6 & 4194304) != 0 ? null : usersPromotionAllowanceDto, (i6 & 8388608) != 0 ? null : bool37, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num15, (i6 & 33554432) != 0 ? null : bool38, (i6 & 67108864) != 0 ? null : messagesEduEducationalProfileDto, (i6 & 134217728) != 0 ? null : baseAPlusMarkDto, (i6 & 268435456) != 0 ? null : bool39, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool40, (i6 & 1073741824) != 0 ? null : bool41, (i6 & Integer.MIN_VALUE) != 0 ? null : usersDonutDto, (i7 & 1) != 0 ? null : baseSexDto, (i7 & 2) != 0 ? null : str65, (i7 & 4) != 0 ? null : str66, (i7 & 8) != 0 ? null : str67, (i7 & 16) != 0 ? null : str68, (i7 & 32) != 0 ? null : usersOnlineInfoDto, (i7 & 64) != 0 ? null : baseBoolIntDto20, (i7 & 128) != 0 ? null : baseBoolIntDto21, (i7 & 256) != 0 ? null : num16, (i7 & 512) != 0 ? null : baseBoolIntDto22, (i7 & 1024) != 0 ? null : baseBoolIntDto23, (i7 & 2048) != 0 ? null : friendsFriendStatusStatusDto, (i7 & 4096) != 0 ? null : friendsRequestsMutualDto, (i7 & 8192) != 0 ? null : str69, (i7 & 16384) != 0 ? null : str70, (i7 & 32768) != 0 ? null : num17, (i7 & 65536) != 0 ? null : str71, (i7 & 131072) != 0 ? null : bool42, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool43, (i7 & 524288) != 0 ? null : bool44);
            String str72 = (i & 2) != 0 ? null : str;
            String str73 = (i & 4) != 0 ? null : str2;
            String str74 = (i & 8) != 0 ? null : str3;
            String str75 = (i & 16) != 0 ? null : str4;
            String str76 = (i & 32) != 0 ? null : str5;
            String str77 = (i & 64) != 0 ? null : str6;
            String str78 = (i & 128) != 0 ? null : str7;
            String str79 = (i & 256) != 0 ? null : str8;
            String str80 = (i & 512) != 0 ? null : str9;
            String str81 = str72;
            String str82 = (i & 1024) != 0 ? null : str10;
            String str83 = (i & 2048) != 0 ? null : str11;
            String str84 = (i & 4096) != 0 ? null : str12;
            String str85 = (i & 8192) != 0 ? null : str13;
            String str86 = (i & 16384) != 0 ? null : str14;
            String str87 = (i & 32768) != 0 ? null : str15;
            String str88 = (i & 65536) != 0 ? null : str16;
            String str89 = (i & 131072) != 0 ? null : str17;
            BdateVisibilityDto bdateVisibilityDto2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bdateVisibilityDto;
            BaseCityDto baseCityDto2 = (i & 524288) != 0 ? null : baseCityDto;
            BaseCountryDto baseCountryDto2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseCountryDto;
            Float f2 = (i & 2097152) != 0 ? null : f;
            OwnerStateDto ownerStateDto2 = (i & 4194304) != 0 ? null : ownerStateDto;
            String str90 = (i & 8388608) != 0 ? null : str18;
            String str91 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str19;
            String str92 = (i & 33554432) != 0 ? null : str20;
            String str93 = (i & 67108864) != 0 ? null : str21;
            String str94 = (i & 134217728) != 0 ? null : str22;
            String str95 = (i & 268435456) != 0 ? null : str23;
            BaseBoolIntDto baseBoolIntDto24 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto;
            BaseOwnerCoverDto baseOwnerCoverDto2 = (i & 1073741824) != 0 ? null : baseOwnerCoverDto;
            String str96 = (i & Integer.MIN_VALUE) != 0 ? null : str24;
            BaseBoolIntDto baseBoolIntDto25 = (i2 & 1) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto26 = (i2 & 2) != 0 ? null : baseBoolIntDto3;
            Boolean bool45 = (i2 & 4) != 0 ? null : bool;
            BaseBoolIntDto baseBoolIntDto27 = (i2 & 8) != 0 ? null : baseBoolIntDto4;
            BaseBoolIntDto baseBoolIntDto28 = (i2 & 16) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto29 = (i2 & 32) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto30 = (i2 & 64) != 0 ? null : baseBoolIntDto7;
            String str97 = str96;
            UsersUserTypeDto usersUserTypeDto2 = (i2 & 128) != 0 ? null : usersUserTypeDto;
            String str98 = (i2 & 256) != 0 ? null : str25;
            String str99 = (i2 & 512) != 0 ? null : str26;
            String str100 = (i2 & 1024) != 0 ? null : str27;
            String str101 = (i2 & 2048) != 0 ? null : str28;
            String str102 = (i2 & 4096) != 0 ? null : str29;
            BaseBoolIntDto baseBoolIntDto31 = (i2 & 8192) != 0 ? null : baseBoolIntDto8;
            BaseBoolIntDto baseBoolIntDto32 = (i2 & 16384) != 0 ? null : baseBoolIntDto9;
            Boolean bool46 = (i2 & 32768) != 0 ? null : bool2;
            Boolean bool47 = (i2 & 65536) != 0 ? null : bool3;
            Boolean bool48 = (i2 & 131072) != 0 ? null : bool4;
            Boolean bool49 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool5;
            String str103 = (i2 & 524288) != 0 ? null : str30;
            String str104 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str31;
            String str105 = (i2 & 2097152) != 0 ? null : str32;
            BaseBoolIntDto baseBoolIntDto33 = (i2 & 4194304) != 0 ? null : baseBoolIntDto10;
            VideoLiveInfoDto videoLiveInfoDto2 = (i2 & 8388608) != 0 ? null : videoLiveInfoDto;
            BaseBoolIntDto baseBoolIntDto34 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto11;
            Boolean bool50 = (i2 & 33554432) != 0 ? null : bool6;
            String str106 = (i2 & 67108864) != 0 ? null : str33;
            String str107 = (i2 & 134217728) != 0 ? null : str34;
            String str108 = (i2 & 268435456) != 0 ? null : str35;
            String str109 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str36;
            String str110 = (i2 & 1073741824) != 0 ? null : str37;
            String str111 = (i2 & Integer.MIN_VALUE) != 0 ? null : str38;
            String str112 = (i3 & 1) != 0 ? null : str39;
            PhotosPhotoDto photosPhotoDto2 = (i3 & 2) != 0 ? null : photosPhotoDto;
            List list16 = (i3 & 4) != 0 ? null : list;
            List list17 = (i3 & 8) != 0 ? null : list2;
            List list18 = (i3 & 16) != 0 ? null : list3;
            String str113 = (i3 & 32) != 0 ? null : str40;
            Integer num18 = (i3 & 64) != 0 ? null : num;
            BaseBoolIntDto baseBoolIntDto35 = baseBoolIntDto32;
            Boolean bool51 = (i3 & 128) != 0 ? null : bool7;
            WallDefaultDto wallDefaultDto2 = (i3 & 256) != 0 ? null : wallDefaultDto;
            AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & 512) != 0 ? null : audioMusicAwardsDto;
            Boolean bool52 = (i3 & 1024) != 0 ? null : bool8;
            Boolean bool53 = (i3 & 2048) != 0 ? null : bool9;
            Boolean bool54 = (i3 & 4096) != 0 ? null : bool10;
            Boolean bool55 = (i3 & 8192) != 0 ? null : bool11;
            BaseBoolIntDto baseBoolIntDto36 = (i3 & 16384) != 0 ? null : baseBoolIntDto12;
            List list19 = (i3 & 32768) != 0 ? null : list4;
            String str114 = (i3 & 65536) != 0 ? null : str41;
            String str115 = (i3 & 131072) != 0 ? null : str42;
            String str116 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str43;
            String str117 = (i3 & 524288) != 0 ? null : str44;
            String str118 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str45;
            String str119 = (i3 & 2097152) != 0 ? null : str46;
            String str120 = (i3 & 4194304) != 0 ? null : str47;
            String str121 = (i3 & 8388608) != 0 ? null : str48;
            String str122 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str49;
            BaseBoolIntDto baseBoolIntDto37 = (i3 & 33554432) != 0 ? null : baseBoolIntDto13;
            BaseBoolIntDto baseBoolIntDto38 = (i3 & 67108864) != 0 ? null : baseBoolIntDto14;
            Boolean bool56 = (i3 & 134217728) != 0 ? null : bool12;
            String str123 = (i3 & 268435456) != 0 ? null : str50;
            String str124 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str51;
            String str125 = (i3 & 1073741824) != 0 ? null : str52;
            AudioAudioDto audioAudioDto2 = (i3 & Integer.MIN_VALUE) != 0 ? null : audioAudioDto;
            String str126 = (i4 & 1) != 0 ? null : str53;
            String str127 = (i4 & 2) != 0 ? null : str54;
            AppsAppMinDto appsAppMinDto2 = (i4 & 4) != 0 ? null : appsAppMinDto;
            UsersLastSeenDto usersLastSeenDto2 = (i4 & 8) != 0 ? null : usersLastSeenDto;
            UsersExportsDto usersExportsDto2 = (i4 & 16) != 0 ? null : usersExportsDto;
            BaseCropPhotoDto baseCropPhotoDto2 = (i4 & 32) != 0 ? null : baseCropPhotoDto;
            Integer num19 = (i4 & 64) != 0 ? null : num2;
            BaseBoolIntDto baseBoolIntDto39 = baseBoolIntDto36;
            Integer num20 = (i4 & 128) != 0 ? null : num3;
            Integer num21 = (i4 & 256) != 0 ? null : num4;
            Integer num22 = (i4 & 512) != 0 ? null : num5;
            BaseBoolIntDto baseBoolIntDto40 = (i4 & 1024) != 0 ? null : baseBoolIntDto15;
            BaseBoolIntDto baseBoolIntDto41 = (i4 & 2048) != 0 ? null : baseBoolIntDto16;
            BaseBoolIntDto baseBoolIntDto42 = (i4 & 4096) != 0 ? null : baseBoolIntDto17;
            BaseBoolIntDto baseBoolIntDto43 = (i4 & 8192) != 0 ? null : baseBoolIntDto18;
            Integer num23 = (i4 & 16384) != 0 ? null : num6;
            UsersOccupationDto usersOccupationDto2 = (i4 & 32768) != 0 ? null : usersOccupationDto;
            List list20 = (i4 & 65536) != 0 ? null : list5;
            List list21 = (i4 & 131072) != 0 ? null : list6;
            Integer num24 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num7;
            String str128 = (i4 & 524288) != 0 ? null : str55;
            Integer num25 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num8;
            Integer num26 = (i4 & 2097152) != 0 ? null : num9;
            String str129 = (i4 & 4194304) != 0 ? null : str56;
            Integer num27 = (i4 & 8388608) != 0 ? null : num10;
            String str130 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str57;
            String str131 = (i4 & 33554432) != 0 ? null : str58;
            String str132 = (i4 & 67108864) != 0 ? null : str59;
            UsersUserRelationDto usersUserRelationDto2 = (i4 & 134217728) != 0 ? null : usersUserRelationDto;
            UsersUserMinDto usersUserMinDto2 = (i4 & 268435456) != 0 ? null : usersUserMinDto;
            UsersPersonalDto usersPersonalDto2 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : usersPersonalDto;
            List list22 = (i4 & 1073741824) != 0 ? null : list7;
            List list23 = (i4 & Integer.MIN_VALUE) != 0 ? null : list8;
            List list24 = (i5 & 1) != 0 ? null : list9;
            Boolean bool57 = (i5 & 2) != 0 ? null : bool13;
            Boolean bool58 = (i5 & 4) != 0 ? null : bool14;
            Boolean bool59 = (i5 & 8) != 0 ? null : bool15;
            Boolean bool60 = (i5 & 16) != 0 ? null : bool16;
            Boolean bool61 = (i5 & 32) != 0 ? null : bool17;
            String str133 = (i5 & 64) != 0 ? null : str60;
            Integer num28 = num23;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (i5 & 128) != 0 ? null : usersEmployeeWorkingStateDto;
            EmployeeMarkDto employeeMarkDto2 = (i5 & 256) != 0 ? null : employeeMarkDto;
            UsersRightsLocationDto usersRightsLocationDto2 = (i5 & 512) != 0 ? null : usersRightsLocationDto;
            Boolean bool62 = (i5 & 1024) != 0 ? null : bool18;
            UsersEmojiStatusDto usersEmojiStatusDto2 = (i5 & 2048) != 0 ? null : usersEmojiStatusDto;
            StatusImageStatusDto statusImageStatusDto2 = (i5 & 4096) != 0 ? null : statusImageStatusDto;
            UsersUserCountersDto usersUserCountersDto2 = (i5 & 8192) != 0 ? null : usersUserCountersDto;
            String str134 = (i5 & 16384) != 0 ? null : str61;
        }

        public final BaseBoolIntDto B() {
            return this.trending;
        }

        public final BaseBoolIntDto C() {
            return this.verified;
        }

        public final Boolean D() {
            return this.isVerified;
        }

        public final String d() {
            return this.deactivated;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.firstName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UsersUserFullDto)) {
                return false;
            }
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
            return epx.f(this.id, usersUserFullDto.id) && epx.f(this.firstNameNom, usersUserFullDto.firstNameNom) && epx.f(this.firstNameGen, usersUserFullDto.firstNameGen) && epx.f(this.firstNameDat, usersUserFullDto.firstNameDat) && epx.f(this.firstNameAcc, usersUserFullDto.firstNameAcc) && epx.f(this.firstNameIns, usersUserFullDto.firstNameIns) && epx.f(this.firstNameAbl, usersUserFullDto.firstNameAbl) && epx.f(this.lastNameNom, usersUserFullDto.lastNameNom) && epx.f(this.lastNameGen, usersUserFullDto.lastNameGen) && epx.f(this.lastNameDat, usersUserFullDto.lastNameDat) && epx.f(this.lastNameAcc, usersUserFullDto.lastNameAcc) && epx.f(this.lastNameIns, usersUserFullDto.lastNameIns) && epx.f(this.lastNameAbl, usersUserFullDto.lastNameAbl) && epx.f(this.nickname, usersUserFullDto.nickname) && epx.f(this.maidenName, usersUserFullDto.maidenName) && epx.f(this.contactName, usersUserFullDto.contactName) && epx.f(this.domain, usersUserFullDto.domain) && epx.f(this.bdate, usersUserFullDto.bdate) && this.bdateVisibility == usersUserFullDto.bdateVisibility && epx.f(this.city, usersUserFullDto.city) && epx.f(this.country, usersUserFullDto.country) && epx.f(this.timezone, usersUserFullDto.timezone) && epx.f(this.ownerState, usersUserFullDto.ownerState) && epx.f(this.photo200, usersUserFullDto.photo200) && epx.f(this.photoMax, usersUserFullDto.photoMax) && epx.f(this.photo200Orig, usersUserFullDto.photo200Orig) && epx.f(this.photo400Orig, usersUserFullDto.photo400Orig) && epx.f(this.photoMaxOrig, usersUserFullDto.photoMaxOrig) && epx.f(this.photoId, usersUserFullDto.photoId) && this.hasPhoto == usersUserFullDto.hasPhoto && epx.f(this.cover, usersUserFullDto.cover) && epx.f(this.photoAvgColor, usersUserFullDto.photoAvgColor) && this.hasMobile == usersUserFullDto.hasMobile && this.isFriend == usersUserFullDto.isFriend && epx.f(this.isBestFriend, usersUserFullDto.isBestFriend) && this.wallComments == usersUserFullDto.wallComments && this.canPost == usersUserFullDto.canPost && this.canSeeAllPosts == usersUserFullDto.canSeeAllPosts && this.canSeeAudio == usersUserFullDto.canSeeAudio && this.type == usersUserFullDto.type && epx.f(this.email, usersUserFullDto.email) && epx.f(this.skype, usersUserFullDto.skype) && epx.f(this.facebook, usersUserFullDto.facebook) && epx.f(this.facebookName, usersUserFullDto.facebookName) && epx.f(this.twitter, usersUserFullDto.twitter) && this.isAdult == usersUserFullDto.isAdult && this.isSubscribed == usersUserFullDto.isSubscribed && epx.f(this.isSubscribedStories, usersUserFullDto.isSubscribedStories) && epx.f(this.canSubscribeStories, usersUserFullDto.canSubscribeStories) && epx.f(this.canAskQuestion, usersUserFullDto.canAskQuestion) && epx.f(this.canAskAnonymous, usersUserFullDto.canAskAnonymous) && epx.f(this.subscriptionCountry, usersUserFullDto.subscriptionCountry) && epx.f(this.livejournal, usersUserFullDto.livejournal) && epx.f(this.instagram, usersUserFullDto.instagram) && this.test == usersUserFullDto.test && epx.f(this.videoLive, usersUserFullDto.videoLive) && this.isVideoLiveNotificationsBlocked == usersUserFullDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, usersUserFullDto.isService) && epx.f(this.serviceDescription, usersUserFullDto.serviceDescription) && epx.f(this.photoRec, usersUserFullDto.photoRec) && epx.f(this.photoMedium, usersUserFullDto.photoMedium) && epx.f(this.photoMediumRec, usersUserFullDto.photoMediumRec) && epx.f(this.photo, usersUserFullDto.photo) && epx.f(this.photoBig, usersUserFullDto.photoBig) && epx.f(this.photo400, usersUserFullDto.photo400) && epx.f(this.photoMaxSize, usersUserFullDto.photoMaxSize) && epx.f(this.profileButtons, usersUserFullDto.profileButtons) && epx.f(this.profileButtonsTablet, usersUserFullDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, usersUserFullDto.thirdPartyButtons) && epx.f(this.language, usersUserFullDto.language) && epx.f(this.storiesArchiveCount, usersUserFullDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, usersUserFullDto.hasUnseenStories) && this.wallDefault == usersUserFullDto.wallDefault && epx.f(this.musicAwards, usersUserFullDto.musicAwards) && epx.f(this.canCall, usersUserFullDto.canCall) && epx.f(this.canCallFromGroup, usersUserFullDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, usersUserFullDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, usersUserFullDto.canSeeWishes) && this.canSeeGifts == usersUserFullDto.canSeeGifts && epx.f(this.buttons, usersUserFullDto.buttons) && epx.f(this.interests, usersUserFullDto.interests) && epx.f(this.books, usersUserFullDto.books) && epx.f(this.tv, usersUserFullDto.tv) && epx.f(this.quotes, usersUserFullDto.quotes) && epx.f(this.about, usersUserFullDto.about) && epx.f(this.games, usersUserFullDto.games) && epx.f(this.movies, usersUserFullDto.movies) && epx.f(this.activities, usersUserFullDto.activities) && epx.f(this.music, usersUserFullDto.music) && this.canWritePrivateMessage == usersUserFullDto.canWritePrivateMessage && this.canSendFriendRequest == usersUserFullDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, usersUserFullDto.canBeInvitedGroup) && epx.f(this.mobilePhone, usersUserFullDto.mobilePhone) && epx.f(this.homePhone, usersUserFullDto.homePhone) && epx.f(this.site, usersUserFullDto.site) && epx.f(this.statusAudio, usersUserFullDto.statusAudio) && epx.f(this.status, usersUserFullDto.status) && epx.f(this.activity, usersUserFullDto.activity) && epx.f(this.statusApp, usersUserFullDto.statusApp) && epx.f(this.lastSeen, usersUserFullDto.lastSeen) && epx.f(this.exports, usersUserFullDto.exports) && epx.f(this.cropPhoto, usersUserFullDto.cropPhoto) && epx.f(this.followersCount, usersUserFullDto.followersCount) && epx.f(this.videoLiveLevel, usersUserFullDto.videoLiveLevel) && epx.f(this.videoLiveCount, usersUserFullDto.videoLiveCount) && epx.f(this.clipsCount, usersUserFullDto.clipsCount) && this.blacklisted == usersUserFullDto.blacklisted && this.blacklistedByMe == usersUserFullDto.blacklistedByMe && this.isFavorite == usersUserFullDto.isFavorite && this.isHiddenFromFeed == usersUserFullDto.isHiddenFromFeed && epx.f(this.commonCount, usersUserFullDto.commonCount) && epx.f(this.occupation, usersUserFullDto.occupation) && epx.f(this.career, usersUserFullDto.career) && epx.f(this.military, usersUserFullDto.military) && epx.f(this.university, usersUserFullDto.university) && epx.f(this.universityName, usersUserFullDto.universityName) && epx.f(this.universityGroupId, usersUserFullDto.universityGroupId) && epx.f(this.faculty, usersUserFullDto.faculty) && epx.f(this.facultyName, usersUserFullDto.facultyName) && epx.f(this.graduation, usersUserFullDto.graduation) && epx.f(this.educationForm, usersUserFullDto.educationForm) && epx.f(this.educationStatus, usersUserFullDto.educationStatus) && epx.f(this.homeTown, usersUserFullDto.homeTown) && this.relation == usersUserFullDto.relation && epx.f(this.relationPartner, usersUserFullDto.relationPartner) && epx.f(this.personal, usersUserFullDto.personal) && epx.f(this.universities, usersUserFullDto.universities) && epx.f(this.schools, usersUserFullDto.schools) && epx.f(this.relatives, usersUserFullDto.relatives) && epx.f(this.isSubscribedPodcasts, usersUserFullDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, usersUserFullDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, usersUserFullDto.canSubscribePosts) && epx.f(this.isStudent, usersUserFullDto.isStudent) && epx.f(this.hasRights, usersUserFullDto.hasRights) && epx.f(this.sysUsername, usersUserFullDto.sysUsername) && epx.f(this.employeeWorkingState, usersUserFullDto.employeeWorkingState) && this.employeeMark == usersUserFullDto.employeeMark && epx.f(this.rightsLocation, usersUserFullDto.rightsLocation) && epx.f(this.canInviteToChats, usersUserFullDto.canInviteToChats) && epx.f(this.emojiStatus, usersUserFullDto.emojiStatus) && epx.f(this.imageStatus, usersUserFullDto.imageStatus) && epx.f(this.counters, usersUserFullDto.counters) && epx.f(this.accessKey, usersUserFullDto.accessKey) && this.canUploadDoc == usersUserFullDto.canUploadDoc && epx.f(this.canBan, usersUserFullDto.canBan) && epx.f(this.eduDetails, usersUserFullDto.eduDetails) && epx.f(this.hash, usersUserFullDto.hash) && epx.f(this.hasEmail, usersUserFullDto.hasEmail) && epx.f(this.isDead, usersUserFullDto.isDead) && epx.f(this.giftsTooltip, usersUserFullDto.giftsTooltip) && this.noIndex == usersUserFullDto.noIndex && epx.f(this.contactId, usersUserFullDto.contactId) && epx.f(this.contact, usersUserFullDto.contact) && epx.f(this.isMessageRequest, usersUserFullDto.isMessageRequest) && epx.f(this.descriptions, usersUserFullDto.descriptions) && epx.f(this.lists, usersUserFullDto.lists) && epx.f(this.friendshipWeeks, usersUserFullDto.friendshipWeeks) && epx.f(this.trackCode, usersUserFullDto.trackCode) && epx.f(this.isPersonalAdsEasyPromoteEnabled, usersUserFullDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.needBigMsgBtnInProfile, usersUserFullDto.needBigMsgBtnInProfile) && this.profileType == usersUserFullDto.profileType && this.canNotCallReason == usersUserFullDto.canNotCallReason && epx.f(this.canCallAsCommunity, usersUserFullDto.canCallAsCommunity) && epx.f(this.isNft, usersUserFullDto.isNft) && epx.f(this.animatedAvatar, usersUserFullDto.animatedAvatar) && epx.f(this.customNamesForCalls, usersUserFullDto.customNamesForCalls) && epx.f(this.isEsiaVerified, usersUserFullDto.isEsiaVerified) && epx.f(this.isEsiaLinked, usersUserFullDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, usersUserFullDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, usersUserFullDto.isTinkoffLinked) && epx.f(this.isSberVerified, usersUserFullDto.isSberVerified) && epx.f(this.isVerified, usersUserFullDto.isVerified) && epx.f(this.isFollowersModeOn, usersUserFullDto.isFollowersModeOn) && this.socialButtonType == usersUserFullDto.socialButtonType && epx.f(this.description, usersUserFullDto.description) && epx.f(this.isTeacher, usersUserFullDto.isTeacher) && epx.f(this.oauthLinked, usersUserFullDto.oauthLinked) && epx.f(this.oauthVerification, usersUserFullDto.oauthVerification) && epx.f(this.isSberLinked, usersUserFullDto.isSberLinked) && epx.f(this.ageMark, usersUserFullDto.ageMark) && epx.f(this.joined, usersUserFullDto.joined) && epx.f(this.isServiceAccount, usersUserFullDto.isServiceAccount) && epx.f(this.promotionAllowance, usersUserFullDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, usersUserFullDto.coOwnershipEnabled) && epx.f(this.ageGroup, usersUserFullDto.ageGroup) && epx.f(this.hasRelatedUserPin, usersUserFullDto.hasRelatedUserPin) && epx.f(this.educationalProfile, usersUserFullDto.educationalProfile) && epx.f(this.aPlusMark, usersUserFullDto.aPlusMark) && epx.f(this.isDon, usersUserFullDto.isDon) && epx.f(this.isMediaModer, usersUserFullDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, usersUserFullDto.isPhotoMapEnabled) && epx.f(this.donut, usersUserFullDto.donut) && this.sex == usersUserFullDto.sex && epx.f(this.screenName, usersUserFullDto.screenName) && epx.f(this.photo50, usersUserFullDto.photo50) && epx.f(this.photo100, usersUserFullDto.photo100) && epx.f(this.photoBase, usersUserFullDto.photoBase) && epx.f(this.onlineInfo, usersUserFullDto.onlineInfo) && this.online == usersUserFullDto.online && this.onlineMobile == usersUserFullDto.onlineMobile && epx.f(this.onlineApp, usersUserFullDto.onlineApp) && this.verified == usersUserFullDto.verified && this.trending == usersUserFullDto.trending && this.friendStatus == usersUserFullDto.friendStatus && epx.f(this.mutual, usersUserFullDto.mutual) && epx.f(this.deactivated, usersUserFullDto.deactivated) && epx.f(this.firstName, usersUserFullDto.firstName) && epx.f(this.hidden, usersUserFullDto.hidden) && epx.f(this.lastName, usersUserFullDto.lastName) && epx.f(this.canAccessClosed, usersUserFullDto.canAccessClosed) && epx.f(this.isClosed, usersUserFullDto.isClosed) && epx.f(this.isCached, usersUserFullDto.isCached);
        }

        public final FriendsFriendStatusStatusDto f() {
            return this.friendStatus;
        }

        public final UserId g() {
            return this.id;
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.firstNameNom;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstNameGen;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.firstNameDat;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.firstNameAcc;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.firstNameIns;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.firstNameAbl;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.lastNameNom;
            int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.lastNameGen;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.lastNameDat;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.lastNameAcc;
            int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.lastNameIns;
            int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.lastNameAbl;
            int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.nickname;
            int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.maidenName;
            int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.contactName;
            int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.domain;
            int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.bdate;
            int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
            BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
            int hashCode19 = (hashCode18 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
            BaseCityDto baseCityDto = this.city;
            int hashCode20 = (hashCode19 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
            BaseCountryDto baseCountryDto = this.country;
            int hashCode21 = (hashCode20 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
            Float f = this.timezone;
            int hashCode22 = (hashCode21 + (f == null ? 0 : f.hashCode())) * 31;
            OwnerStateDto ownerStateDto = this.ownerState;
            int hashCode23 = (hashCode22 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
            String str18 = this.photo200;
            int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.photoMax;
            int hashCode25 = (hashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.photo200Orig;
            int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.photo400Orig;
            int hashCode27 = (hashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.photoMaxOrig;
            int hashCode28 = (hashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.photoId;
            int hashCode29 = (hashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
            int hashCode30 = (hashCode29 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
            int hashCode31 = (hashCode30 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
            String str24 = this.photoAvgColor;
            int hashCode32 = (hashCode31 + (str24 == null ? 0 : str24.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
            int hashCode33 = (hashCode32 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
            int hashCode34 = (hashCode33 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            Boolean bool = this.isBestFriend;
            int hashCode35 = (hashCode34 + (bool == null ? 0 : bool.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
            int hashCode36 = (hashCode35 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.canPost;
            int hashCode37 = (hashCode36 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
            int hashCode38 = (hashCode37 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
            int hashCode39 = (hashCode38 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            UsersUserTypeDto usersUserTypeDto = this.type;
            int hashCode40 = (hashCode39 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
            String str25 = this.email;
            int hashCode41 = (hashCode40 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.skype;
            int hashCode42 = (hashCode41 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.facebook;
            int hashCode43 = (hashCode42 + (str27 == null ? 0 : str27.hashCode())) * 31;
            String str28 = this.facebookName;
            int hashCode44 = (hashCode43 + (str28 == null ? 0 : str28.hashCode())) * 31;
            String str29 = this.twitter;
            int hashCode45 = (hashCode44 + (str29 == null ? 0 : str29.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
            int hashCode46 = (hashCode45 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
            int hashCode47 = (hashCode46 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            Boolean bool2 = this.isSubscribedStories;
            int hashCode48 = (hashCode47 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.canSubscribeStories;
            int hashCode49 = (hashCode48 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.canAskQuestion;
            int hashCode50 = (hashCode49 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.canAskAnonymous;
            int hashCode51 = (hashCode50 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str30 = this.subscriptionCountry;
            int hashCode52 = (hashCode51 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.livejournal;
            int hashCode53 = (hashCode52 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.instagram;
            int hashCode54 = (hashCode53 + (str32 == null ? 0 : str32.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.test;
            int hashCode55 = (hashCode54 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
            int hashCode56 = (hashCode55 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
            int hashCode57 = (hashCode56 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
            Boolean bool6 = this.isService;
            int hashCode58 = (hashCode57 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str33 = this.serviceDescription;
            int hashCode59 = (hashCode58 + (str33 == null ? 0 : str33.hashCode())) * 31;
            String str34 = this.photoRec;
            int hashCode60 = (hashCode59 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.photoMedium;
            int hashCode61 = (hashCode60 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.photoMediumRec;
            int hashCode62 = (hashCode61 + (str36 == null ? 0 : str36.hashCode())) * 31;
            String str37 = this.photo;
            int hashCode63 = (hashCode62 + (str37 == null ? 0 : str37.hashCode())) * 31;
            String str38 = this.photoBig;
            int hashCode64 = (hashCode63 + (str38 == null ? 0 : str38.hashCode())) * 31;
            String str39 = this.photo400;
            int hashCode65 = (hashCode64 + (str39 == null ? 0 : str39.hashCode())) * 31;
            PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
            int hashCode66 = (hashCode65 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
            List<List<UsersProfileButtonDto>> list = this.profileButtons;
            int hashCode67 = (hashCode66 + (list == null ? 0 : list.hashCode())) * 31;
            List<List<UsersProfileButtonDto>> list2 = this.profileButtonsTablet;
            int hashCode68 = (hashCode67 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<UsersProfileButtonDto> list3 = this.thirdPartyButtons;
            int hashCode69 = (hashCode68 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str40 = this.language;
            int hashCode70 = (hashCode69 + (str40 == null ? 0 : str40.hashCode())) * 31;
            Integer num = this.storiesArchiveCount;
            int hashCode71 = (hashCode70 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool7 = this.hasUnseenStories;
            int hashCode72 = (hashCode71 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            WallDefaultDto wallDefaultDto = this.wallDefault;
            int hashCode73 = (hashCode72 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
            AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
            int hashCode74 = (hashCode73 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
            Boolean bool8 = this.canCall;
            int hashCode75 = (hashCode74 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.canCallFromGroup;
            int hashCode76 = (hashCode75 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.canInviteAsVoiceroomsSpeaker;
            int hashCode77 = (hashCode76 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.canSeeWishes;
            int hashCode78 = (hashCode77 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
            int hashCode79 = (hashCode78 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
            List<BaseOwnerButtonDto> list4 = this.buttons;
            int hashCode80 = (hashCode79 + (list4 == null ? 0 : list4.hashCode())) * 31;
            String str41 = this.interests;
            int hashCode81 = (hashCode80 + (str41 == null ? 0 : str41.hashCode())) * 31;
            String str42 = this.books;
            int hashCode82 = (hashCode81 + (str42 == null ? 0 : str42.hashCode())) * 31;
            String str43 = this.tv;
            int hashCode83 = (hashCode82 + (str43 == null ? 0 : str43.hashCode())) * 31;
            String str44 = this.quotes;
            int hashCode84 = (hashCode83 + (str44 == null ? 0 : str44.hashCode())) * 31;
            String str45 = this.about;
            int hashCode85 = (hashCode84 + (str45 == null ? 0 : str45.hashCode())) * 31;
            String str46 = this.games;
            int hashCode86 = (hashCode85 + (str46 == null ? 0 : str46.hashCode())) * 31;
            String str47 = this.movies;
            int hashCode87 = (hashCode86 + (str47 == null ? 0 : str47.hashCode())) * 31;
            String str48 = this.activities;
            int hashCode88 = (hashCode87 + (str48 == null ? 0 : str48.hashCode())) * 31;
            String str49 = this.music;
            int hashCode89 = (hashCode88 + (str49 == null ? 0 : str49.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
            int hashCode90 = (hashCode89 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
            int hashCode91 = (hashCode90 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
            Boolean bool12 = this.canBeInvitedGroup;
            int hashCode92 = (hashCode91 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            String str50 = this.mobilePhone;
            int hashCode93 = (hashCode92 + (str50 == null ? 0 : str50.hashCode())) * 31;
            String str51 = this.homePhone;
            int hashCode94 = (hashCode93 + (str51 == null ? 0 : str51.hashCode())) * 31;
            String str52 = this.site;
            int hashCode95 = (hashCode94 + (str52 == null ? 0 : str52.hashCode())) * 31;
            AudioAudioDto audioAudioDto = this.statusAudio;
            int hashCode96 = (hashCode95 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
            String str53 = this.status;
            int hashCode97 = (hashCode96 + (str53 == null ? 0 : str53.hashCode())) * 31;
            String str54 = this.activity;
            int hashCode98 = (hashCode97 + (str54 == null ? 0 : str54.hashCode())) * 31;
            AppsAppMinDto appsAppMinDto = this.statusApp;
            int hashCode99 = (hashCode98 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
            UsersLastSeenDto usersLastSeenDto = this.lastSeen;
            int hashCode100 = (hashCode99 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
            UsersExportsDto usersExportsDto = this.exports;
            int hashCode101 = (hashCode100 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
            BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
            int hashCode102 = (hashCode101 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
            Integer num2 = this.followersCount;
            int hashCode103 = (hashCode102 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.videoLiveLevel;
            int hashCode104 = (hashCode103 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.videoLiveCount;
            int hashCode105 = (hashCode104 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.clipsCount;
            int hashCode106 = (hashCode105 + (num5 == null ? 0 : num5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
            int hashCode107 = (hashCode106 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
            int hashCode108 = (hashCode107 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
            int hashCode109 = (hashCode108 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
            int hashCode110 = (hashCode109 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
            Integer num6 = this.commonCount;
            int hashCode111 = (hashCode110 + (num6 == null ? 0 : num6.hashCode())) * 31;
            UsersOccupationDto usersOccupationDto = this.occupation;
            int hashCode112 = (hashCode111 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
            List<UsersCareerDto> list5 = this.career;
            int hashCode113 = (hashCode112 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<UsersMilitaryDto> list6 = this.military;
            int hashCode114 = (hashCode113 + (list6 == null ? 0 : list6.hashCode())) * 31;
            Integer num7 = this.university;
            int hashCode115 = (hashCode114 + (num7 == null ? 0 : num7.hashCode())) * 31;
            String str55 = this.universityName;
            int hashCode116 = (hashCode115 + (str55 == null ? 0 : str55.hashCode())) * 31;
            Integer num8 = this.universityGroupId;
            int hashCode117 = (hashCode116 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.faculty;
            int hashCode118 = (hashCode117 + (num9 == null ? 0 : num9.hashCode())) * 31;
            String str56 = this.facultyName;
            int hashCode119 = (hashCode118 + (str56 == null ? 0 : str56.hashCode())) * 31;
            Integer num10 = this.graduation;
            int hashCode120 = (hashCode119 + (num10 == null ? 0 : num10.hashCode())) * 31;
            String str57 = this.educationForm;
            int hashCode121 = (hashCode120 + (str57 == null ? 0 : str57.hashCode())) * 31;
            String str58 = this.educationStatus;
            int hashCode122 = (hashCode121 + (str58 == null ? 0 : str58.hashCode())) * 31;
            String str59 = this.homeTown;
            int hashCode123 = (hashCode122 + (str59 == null ? 0 : str59.hashCode())) * 31;
            UsersUserRelationDto usersUserRelationDto = this.relation;
            int hashCode124 = (hashCode123 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
            UsersUserMinDto usersUserMinDto = this.relationPartner;
            int hashCode125 = (hashCode124 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
            UsersPersonalDto usersPersonalDto = this.personal;
            int hashCode126 = (hashCode125 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
            List<UsersUniversityDto> list7 = this.universities;
            int hashCode127 = (hashCode126 + (list7 == null ? 0 : list7.hashCode())) * 31;
            List<UsersSchoolDto> list8 = this.schools;
            int hashCode128 = (hashCode127 + (list8 == null ? 0 : list8.hashCode())) * 31;
            List<UsersRelativeDto> list9 = this.relatives;
            int hashCode129 = (hashCode128 + (list9 == null ? 0 : list9.hashCode())) * 31;
            Boolean bool13 = this.isSubscribedPodcasts;
            int hashCode130 = (hashCode129 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.canSubscribePodcasts;
            int hashCode131 = (hashCode130 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.canSubscribePosts;
            int hashCode132 = (hashCode131 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isStudent;
            int hashCode133 = (hashCode132 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.hasRights;
            int hashCode134 = (hashCode133 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            String str60 = this.sysUsername;
            int hashCode135 = (hashCode134 + (str60 == null ? 0 : str60.hashCode())) * 31;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
            int hashCode136 = (hashCode135 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
            EmployeeMarkDto employeeMarkDto = this.employeeMark;
            int hashCode137 = (hashCode136 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
            UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
            int hashCode138 = (hashCode137 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
            Boolean bool18 = this.canInviteToChats;
            int hashCode139 = (hashCode138 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
            int hashCode140 = (hashCode139 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
            StatusImageStatusDto statusImageStatusDto = this.imageStatus;
            int hashCode141 = (hashCode140 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
            UsersUserCountersDto usersUserCountersDto = this.counters;
            int hashCode142 = (hashCode141 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
            String str61 = this.accessKey;
            int hashCode143 = (hashCode142 + (str61 == null ? 0 : str61.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
            int hashCode144 = (hashCode143 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
            Boolean bool19 = this.canBan;
            int hashCode145 = (hashCode144 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            List<String> list10 = this.eduDetails;
            int hashCode146 = (hashCode145 + (list10 == null ? 0 : list10.hashCode())) * 31;
            String str62 = this.hash;
            int hashCode147 = (hashCode146 + (str62 == null ? 0 : str62.hashCode())) * 31;
            Boolean bool20 = this.hasEmail;
            int hashCode148 = (hashCode147 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.isDead;
            int hashCode149 = (hashCode148 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
            int hashCode150 = (hashCode149 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
            NoIndexDto noIndexDto = this.noIndex;
            int hashCode151 = (hashCode150 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
            Integer num11 = this.contactId;
            int hashCode152 = (hashCode151 + (num11 == null ? 0 : num11.hashCode())) * 31;
            MessagesContactDto messagesContactDto = this.contact;
            int hashCode153 = (hashCode152 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
            Boolean bool22 = this.isMessageRequest;
            int hashCode154 = (hashCode153 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            List<String> list11 = this.descriptions;
            int hashCode155 = (hashCode154 + (list11 == null ? 0 : list11.hashCode())) * 31;
            List<Integer> list12 = this.lists;
            int hashCode156 = (hashCode155 + (list12 == null ? 0 : list12.hashCode())) * 31;
            Integer num12 = this.friendshipWeeks;
            int hashCode157 = (hashCode156 + (num12 == null ? 0 : num12.hashCode())) * 31;
            String str63 = this.trackCode;
            int hashCode158 = (hashCode157 + (str63 == null ? 0 : str63.hashCode())) * 31;
            Boolean bool23 = this.isPersonalAdsEasyPromoteEnabled;
            int hashCode159 = (hashCode158 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
            Boolean bool24 = this.needBigMsgBtnInProfile;
            int hashCode160 = (hashCode159 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
            UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
            int hashCode161 = (hashCode160 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
            int hashCode162 = (hashCode161 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
            Boolean bool25 = this.canCallAsCommunity;
            int hashCode163 = (hashCode162 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
            Boolean bool26 = this.isNft;
            int hashCode164 = (hashCode163 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
            BaseImageDto baseImageDto = this.animatedAvatar;
            int hashCode165 = (hashCode164 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
            List<CallsCustomNameForCallDto> list13 = this.customNamesForCalls;
            int hashCode166 = (hashCode165 + (list13 == null ? 0 : list13.hashCode())) * 31;
            Boolean bool27 = this.isEsiaVerified;
            int hashCode167 = (hashCode166 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
            Boolean bool28 = this.isEsiaLinked;
            int hashCode168 = (hashCode167 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
            Boolean bool29 = this.isTinkoffVerified;
            int hashCode169 = (hashCode168 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
            Boolean bool30 = this.isTinkoffLinked;
            int hashCode170 = (hashCode169 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
            Boolean bool31 = this.isSberVerified;
            int hashCode171 = (hashCode170 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
            Boolean bool32 = this.isVerified;
            int hashCode172 = (hashCode171 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
            Boolean bool33 = this.isFollowersModeOn;
            int hashCode173 = (hashCode172 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
            SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
            int hashCode174 = (hashCode173 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
            String str64 = this.description;
            int hashCode175 = (hashCode174 + (str64 == null ? 0 : str64.hashCode())) * 31;
            Boolean bool34 = this.isTeacher;
            int hashCode176 = (hashCode175 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
            List<String> list14 = this.oauthLinked;
            int hashCode177 = (hashCode176 + (list14 == null ? 0 : list14.hashCode())) * 31;
            List<String> list15 = this.oauthVerification;
            int hashCode178 = (hashCode177 + (list15 == null ? 0 : list15.hashCode())) * 31;
            Boolean bool35 = this.isSberLinked;
            int hashCode179 = (hashCode178 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
            Integer num13 = this.ageMark;
            int hashCode180 = (hashCode179 + (num13 == null ? 0 : num13.hashCode())) * 31;
            Integer num14 = this.joined;
            int hashCode181 = (hashCode180 + (num14 == null ? 0 : num14.hashCode())) * 31;
            Boolean bool36 = this.isServiceAccount;
            int hashCode182 = (hashCode181 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
            UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
            int hashCode183 = (hashCode182 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
            Boolean bool37 = this.coOwnershipEnabled;
            int hashCode184 = (hashCode183 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
            Integer num15 = this.ageGroup;
            int hashCode185 = (hashCode184 + (num15 == null ? 0 : num15.hashCode())) * 31;
            Boolean bool38 = this.hasRelatedUserPin;
            int hashCode186 = (hashCode185 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
            int hashCode187 = (hashCode186 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
            BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
            int hashCode188 = (hashCode187 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
            Boolean bool39 = this.isDon;
            int hashCode189 = (hashCode188 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
            Boolean bool40 = this.isMediaModer;
            int hashCode190 = (hashCode189 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
            Boolean bool41 = this.isPhotoMapEnabled;
            int hashCode191 = (hashCode190 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
            UsersDonutDto usersDonutDto = this.donut;
            int hashCode192 = (hashCode191 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
            BaseSexDto baseSexDto = this.sex;
            int hashCode193 = (hashCode192 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
            String str65 = this.screenName;
            int hashCode194 = (hashCode193 + (str65 == null ? 0 : str65.hashCode())) * 31;
            String str66 = this.photo50;
            int hashCode195 = (hashCode194 + (str66 == null ? 0 : str66.hashCode())) * 31;
            String str67 = this.photo100;
            int hashCode196 = (hashCode195 + (str67 == null ? 0 : str67.hashCode())) * 31;
            String str68 = this.photoBase;
            int hashCode197 = (hashCode196 + (str68 == null ? 0 : str68.hashCode())) * 31;
            UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
            int hashCode198 = (hashCode197 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto20 = this.online;
            int hashCode199 = (hashCode198 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
            int hashCode200 = (hashCode199 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
            Integer num16 = this.onlineApp;
            int hashCode201 = (hashCode200 + (num16 == null ? 0 : num16.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto22 = this.verified;
            int hashCode202 = (hashCode201 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto23 = this.trending;
            int hashCode203 = (hashCode202 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
            int hashCode204 = (hashCode203 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
            FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
            int hashCode205 = (hashCode204 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
            String str69 = this.deactivated;
            int hashCode206 = (hashCode205 + (str69 == null ? 0 : str69.hashCode())) * 31;
            String str70 = this.firstName;
            int hashCode207 = (hashCode206 + (str70 == null ? 0 : str70.hashCode())) * 31;
            Integer num17 = this.hidden;
            int hashCode208 = (hashCode207 + (num17 == null ? 0 : num17.hashCode())) * 31;
            String str71 = this.lastName;
            int hashCode209 = (hashCode208 + (str71 == null ? 0 : str71.hashCode())) * 31;
            Boolean bool42 = this.canAccessClosed;
            int hashCode210 = (hashCode209 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
            Boolean bool43 = this.isClosed;
            int hashCode211 = (hashCode210 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
            Boolean bool44 = this.isCached;
            return hashCode211 + (bool44 != null ? bool44.hashCode() : 0);
        }

        public final String i() {
            return this.lastName;
        }

        public final FriendsRequestsMutualDto j() {
            return this.mutual;
        }

        public final UsersOnlineInfoDto k() {
            return this.onlineInfo;
        }

        public final String l() {
            return this.photo100;
        }

        public final String n() {
            return this.photo50;
        }

        public final String o() {
            return this.photoBase;
        }

        public final String p() {
            return this.screenName;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UsersUserFullDto(id=");
            sb.append(this.id);
            sb.append(", firstNameNom=");
            sb.append(this.firstNameNom);
            sb.append(", firstNameGen=");
            sb.append(this.firstNameGen);
            sb.append(", firstNameDat=");
            sb.append(this.firstNameDat);
            sb.append(", firstNameAcc=");
            sb.append(this.firstNameAcc);
            sb.append(", firstNameIns=");
            sb.append(this.firstNameIns);
            sb.append(", firstNameAbl=");
            sb.append(this.firstNameAbl);
            sb.append(", lastNameNom=");
            sb.append(this.lastNameNom);
            sb.append(", lastNameGen=");
            sb.append(this.lastNameGen);
            sb.append(", lastNameDat=");
            sb.append(this.lastNameDat);
            sb.append(", lastNameAcc=");
            sb.append(this.lastNameAcc);
            sb.append(", lastNameIns=");
            sb.append(this.lastNameIns);
            sb.append(", lastNameAbl=");
            sb.append(this.lastNameAbl);
            sb.append(", nickname=");
            sb.append(this.nickname);
            sb.append(", maidenName=");
            sb.append(this.maidenName);
            sb.append(", contactName=");
            sb.append(this.contactName);
            sb.append(", domain=");
            sb.append(this.domain);
            sb.append(", bdate=");
            sb.append(this.bdate);
            sb.append(", bdateVisibility=");
            sb.append(this.bdateVisibility);
            sb.append(", city=");
            sb.append(this.city);
            sb.append(", country=");
            sb.append(this.country);
            sb.append(", timezone=");
            sb.append(this.timezone);
            sb.append(", ownerState=");
            sb.append(this.ownerState);
            sb.append(", photo200=");
            sb.append(this.photo200);
            sb.append(", photoMax=");
            sb.append(this.photoMax);
            sb.append(", photo200Orig=");
            sb.append(this.photo200Orig);
            sb.append(", photo400Orig=");
            sb.append(this.photo400Orig);
            sb.append(", photoMaxOrig=");
            sb.append(this.photoMaxOrig);
            sb.append(", photoId=");
            sb.append(this.photoId);
            sb.append(", hasPhoto=");
            sb.append(this.hasPhoto);
            sb.append(", cover=");
            sb.append(this.cover);
            sb.append(", photoAvgColor=");
            sb.append(this.photoAvgColor);
            sb.append(", hasMobile=");
            sb.append(this.hasMobile);
            sb.append(", isFriend=");
            sb.append(this.isFriend);
            sb.append(", isBestFriend=");
            sb.append(this.isBestFriend);
            sb.append(", wallComments=");
            sb.append(this.wallComments);
            sb.append(", canPost=");
            sb.append(this.canPost);
            sb.append(", canSeeAllPosts=");
            sb.append(this.canSeeAllPosts);
            sb.append(", canSeeAudio=");
            sb.append(this.canSeeAudio);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", skype=");
            sb.append(this.skype);
            sb.append(", facebook=");
            sb.append(this.facebook);
            sb.append(", facebookName=");
            sb.append(this.facebookName);
            sb.append(", twitter=");
            sb.append(this.twitter);
            sb.append(", isAdult=");
            sb.append(this.isAdult);
            sb.append(", isSubscribed=");
            sb.append(this.isSubscribed);
            sb.append(", isSubscribedStories=");
            sb.append(this.isSubscribedStories);
            sb.append(", canSubscribeStories=");
            sb.append(this.canSubscribeStories);
            sb.append(", canAskQuestion=");
            sb.append(this.canAskQuestion);
            sb.append(", canAskAnonymous=");
            sb.append(this.canAskAnonymous);
            sb.append(", subscriptionCountry=");
            sb.append(this.subscriptionCountry);
            sb.append(", livejournal=");
            sb.append(this.livejournal);
            sb.append(", instagram=");
            sb.append(this.instagram);
            sb.append(", test=");
            sb.append(this.test);
            sb.append(", videoLive=");
            sb.append(this.videoLive);
            sb.append(", isVideoLiveNotificationsBlocked=");
            sb.append(this.isVideoLiveNotificationsBlocked);
            sb.append(", isService=");
            sb.append(this.isService);
            sb.append(", serviceDescription=");
            sb.append(this.serviceDescription);
            sb.append(", photoRec=");
            sb.append(this.photoRec);
            sb.append(", photoMedium=");
            sb.append(this.photoMedium);
            sb.append(", photoMediumRec=");
            sb.append(this.photoMediumRec);
            sb.append(", photo=");
            sb.append(this.photo);
            sb.append(", photoBig=");
            sb.append(this.photoBig);
            sb.append(", photo400=");
            sb.append(this.photo400);
            sb.append(", photoMaxSize=");
            sb.append(this.photoMaxSize);
            sb.append(", profileButtons=");
            sb.append(this.profileButtons);
            sb.append(", profileButtonsTablet=");
            sb.append(this.profileButtonsTablet);
            sb.append(", thirdPartyButtons=");
            sb.append(this.thirdPartyButtons);
            sb.append(", language=");
            sb.append(this.language);
            sb.append(", storiesArchiveCount=");
            sb.append(this.storiesArchiveCount);
            sb.append(", hasUnseenStories=");
            sb.append(this.hasUnseenStories);
            sb.append(", wallDefault=");
            sb.append(this.wallDefault);
            sb.append(", musicAwards=");
            sb.append(this.musicAwards);
            sb.append(", canCall=");
            sb.append(this.canCall);
            sb.append(", canCallFromGroup=");
            sb.append(this.canCallFromGroup);
            sb.append(", canInviteAsVoiceroomsSpeaker=");
            sb.append(this.canInviteAsVoiceroomsSpeaker);
            sb.append(", canSeeWishes=");
            sb.append(this.canSeeWishes);
            sb.append(", canSeeGifts=");
            sb.append(this.canSeeGifts);
            sb.append(", buttons=");
            sb.append(this.buttons);
            sb.append(", interests=");
            sb.append(this.interests);
            sb.append(", books=");
            sb.append(this.books);
            sb.append(", tv=");
            sb.append(this.tv);
            sb.append(", quotes=");
            sb.append(this.quotes);
            sb.append(", about=");
            sb.append(this.about);
            sb.append(", games=");
            sb.append(this.games);
            sb.append(", movies=");
            sb.append(this.movies);
            sb.append(", activities=");
            sb.append(this.activities);
            sb.append(", music=");
            sb.append(this.music);
            sb.append(", canWritePrivateMessage=");
            sb.append(this.canWritePrivateMessage);
            sb.append(", canSendFriendRequest=");
            sb.append(this.canSendFriendRequest);
            sb.append(", canBeInvitedGroup=");
            sb.append(this.canBeInvitedGroup);
            sb.append(", mobilePhone=");
            sb.append(this.mobilePhone);
            sb.append(", homePhone=");
            sb.append(this.homePhone);
            sb.append(", site=");
            sb.append(this.site);
            sb.append(", statusAudio=");
            sb.append(this.statusAudio);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", statusApp=");
            sb.append(this.statusApp);
            sb.append(", lastSeen=");
            sb.append(this.lastSeen);
            sb.append(", exports=");
            sb.append(this.exports);
            sb.append(", cropPhoto=");
            sb.append(this.cropPhoto);
            sb.append(", followersCount=");
            sb.append(this.followersCount);
            sb.append(", videoLiveLevel=");
            sb.append(this.videoLiveLevel);
            sb.append(", videoLiveCount=");
            sb.append(this.videoLiveCount);
            sb.append(", clipsCount=");
            sb.append(this.clipsCount);
            sb.append(", blacklisted=");
            sb.append(this.blacklisted);
            sb.append(", blacklistedByMe=");
            sb.append(this.blacklistedByMe);
            sb.append(", isFavorite=");
            sb.append(this.isFavorite);
            sb.append(", isHiddenFromFeed=");
            sb.append(this.isHiddenFromFeed);
            sb.append(", commonCount=");
            sb.append(this.commonCount);
            sb.append(", occupation=");
            sb.append(this.occupation);
            sb.append(", career=");
            sb.append(this.career);
            sb.append(", military=");
            sb.append(this.military);
            sb.append(", university=");
            sb.append(this.university);
            sb.append(", universityName=");
            sb.append(this.universityName);
            sb.append(", universityGroupId=");
            sb.append(this.universityGroupId);
            sb.append(", faculty=");
            sb.append(this.faculty);
            sb.append(", facultyName=");
            sb.append(this.facultyName);
            sb.append(", graduation=");
            sb.append(this.graduation);
            sb.append(", educationForm=");
            sb.append(this.educationForm);
            sb.append(", educationStatus=");
            sb.append(this.educationStatus);
            sb.append(", homeTown=");
            sb.append(this.homeTown);
            sb.append(", relation=");
            sb.append(this.relation);
            sb.append(", relationPartner=");
            sb.append(this.relationPartner);
            sb.append(", personal=");
            sb.append(this.personal);
            sb.append(", universities=");
            sb.append(this.universities);
            sb.append(", schools=");
            sb.append(this.schools);
            sb.append(", relatives=");
            sb.append(this.relatives);
            sb.append(", isSubscribedPodcasts=");
            sb.append(this.isSubscribedPodcasts);
            sb.append(", canSubscribePodcasts=");
            sb.append(this.canSubscribePodcasts);
            sb.append(", canSubscribePosts=");
            sb.append(this.canSubscribePosts);
            sb.append(", isStudent=");
            sb.append(this.isStudent);
            sb.append(", hasRights=");
            sb.append(this.hasRights);
            sb.append(", sysUsername=");
            sb.append(this.sysUsername);
            sb.append(", employeeWorkingState=");
            sb.append(this.employeeWorkingState);
            sb.append(", employeeMark=");
            sb.append(this.employeeMark);
            sb.append(", rightsLocation=");
            sb.append(this.rightsLocation);
            sb.append(", canInviteToChats=");
            sb.append(this.canInviteToChats);
            sb.append(", emojiStatus=");
            sb.append(this.emojiStatus);
            sb.append(", imageStatus=");
            sb.append(this.imageStatus);
            sb.append(", counters=");
            sb.append(this.counters);
            sb.append(", accessKey=");
            sb.append(this.accessKey);
            sb.append(", canUploadDoc=");
            sb.append(this.canUploadDoc);
            sb.append(", canBan=");
            sb.append(this.canBan);
            sb.append(", eduDetails=");
            sb.append(this.eduDetails);
            sb.append(", hash=");
            sb.append(this.hash);
            sb.append(", hasEmail=");
            sb.append(this.hasEmail);
            sb.append(", isDead=");
            sb.append(this.isDead);
            sb.append(", giftsTooltip=");
            sb.append(this.giftsTooltip);
            sb.append(", noIndex=");
            sb.append(this.noIndex);
            sb.append(", contactId=");
            sb.append(this.contactId);
            sb.append(", contact=");
            sb.append(this.contact);
            sb.append(", isMessageRequest=");
            sb.append(this.isMessageRequest);
            sb.append(", descriptions=");
            sb.append(this.descriptions);
            sb.append(", lists=");
            sb.append(this.lists);
            sb.append(", friendshipWeeks=");
            sb.append(this.friendshipWeeks);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", isPersonalAdsEasyPromoteEnabled=");
            sb.append(this.isPersonalAdsEasyPromoteEnabled);
            sb.append(", needBigMsgBtnInProfile=");
            sb.append(this.needBigMsgBtnInProfile);
            sb.append(", profileType=");
            sb.append(this.profileType);
            sb.append(", canNotCallReason=");
            sb.append(this.canNotCallReason);
            sb.append(", canCallAsCommunity=");
            sb.append(this.canCallAsCommunity);
            sb.append(", isNft=");
            sb.append(this.isNft);
            sb.append(", animatedAvatar=");
            sb.append(this.animatedAvatar);
            sb.append(", customNamesForCalls=");
            sb.append(this.customNamesForCalls);
            sb.append(", isEsiaVerified=");
            sb.append(this.isEsiaVerified);
            sb.append(", isEsiaLinked=");
            sb.append(this.isEsiaLinked);
            sb.append(", isTinkoffVerified=");
            sb.append(this.isTinkoffVerified);
            sb.append(", isTinkoffLinked=");
            sb.append(this.isTinkoffLinked);
            sb.append(", isSberVerified=");
            sb.append(this.isSberVerified);
            sb.append(", isVerified=");
            sb.append(this.isVerified);
            sb.append(", isFollowersModeOn=");
            sb.append(this.isFollowersModeOn);
            sb.append(", socialButtonType=");
            sb.append(this.socialButtonType);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", isTeacher=");
            sb.append(this.isTeacher);
            sb.append(", oauthLinked=");
            sb.append(this.oauthLinked);
            sb.append(", oauthVerification=");
            sb.append(this.oauthVerification);
            sb.append(", isSberLinked=");
            sb.append(this.isSberLinked);
            sb.append(", ageMark=");
            sb.append(this.ageMark);
            sb.append(", joined=");
            sb.append(this.joined);
            sb.append(", isServiceAccount=");
            sb.append(this.isServiceAccount);
            sb.append(", promotionAllowance=");
            sb.append(this.promotionAllowance);
            sb.append(", coOwnershipEnabled=");
            sb.append(this.coOwnershipEnabled);
            sb.append(", ageGroup=");
            sb.append(this.ageGroup);
            sb.append(", hasRelatedUserPin=");
            sb.append(this.hasRelatedUserPin);
            sb.append(", educationalProfile=");
            sb.append(this.educationalProfile);
            sb.append(", aPlusMark=");
            sb.append(this.aPlusMark);
            sb.append(", isDon=");
            sb.append(this.isDon);
            sb.append(", isMediaModer=");
            sb.append(this.isMediaModer);
            sb.append(", isPhotoMapEnabled=");
            sb.append(this.isPhotoMapEnabled);
            sb.append(", donut=");
            sb.append(this.donut);
            sb.append(", sex=");
            sb.append(this.sex);
            sb.append(", screenName=");
            sb.append(this.screenName);
            sb.append(", photo50=");
            sb.append(this.photo50);
            sb.append(", photo100=");
            sb.append(this.photo100);
            sb.append(", photoBase=");
            sb.append(this.photoBase);
            sb.append(", onlineInfo=");
            sb.append(this.onlineInfo);
            sb.append(", online=");
            sb.append(this.online);
            sb.append(", onlineMobile=");
            sb.append(this.onlineMobile);
            sb.append(", onlineApp=");
            sb.append(this.onlineApp);
            sb.append(", verified=");
            sb.append(this.verified);
            sb.append(", trending=");
            sb.append(this.trending);
            sb.append(", friendStatus=");
            sb.append(this.friendStatus);
            sb.append(", mutual=");
            sb.append(this.mutual);
            sb.append(", deactivated=");
            sb.append(this.deactivated);
            sb.append(", firstName=");
            sb.append(this.firstName);
            sb.append(", hidden=");
            sb.append(this.hidden);
            sb.append(", lastName=");
            sb.append(this.lastName);
            sb.append(", canAccessClosed=");
            sb.append(this.canAccessClosed);
            sb.append(", isClosed=");
            sb.append(this.isClosed);
            sb.append(", isCached=");
            return tn.a(sb, this.isCached, ')');
        }

        public final BaseSexDto u() {
            return this.sex;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.id, i);
            parcel.writeString(this.firstNameNom);
            parcel.writeString(this.firstNameGen);
            parcel.writeString(this.firstNameDat);
            parcel.writeString(this.firstNameAcc);
            parcel.writeString(this.firstNameIns);
            parcel.writeString(this.firstNameAbl);
            parcel.writeString(this.lastNameNom);
            parcel.writeString(this.lastNameGen);
            parcel.writeString(this.lastNameDat);
            parcel.writeString(this.lastNameAcc);
            parcel.writeString(this.lastNameIns);
            parcel.writeString(this.lastNameAbl);
            parcel.writeString(this.nickname);
            parcel.writeString(this.maidenName);
            parcel.writeString(this.contactName);
            parcel.writeString(this.domain);
            parcel.writeString(this.bdate);
            BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
            if (bdateVisibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bdateVisibilityDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.city, i);
            parcel.writeParcelable(this.country, i);
            Float f = this.timezone;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.ownerState, i);
            parcel.writeString(this.photo200);
            parcel.writeString(this.photoMax);
            parcel.writeString(this.photo200Orig);
            parcel.writeString(this.photo400Orig);
            parcel.writeString(this.photoMaxOrig);
            parcel.writeString(this.photoId);
            parcel.writeParcelable(this.hasPhoto, i);
            parcel.writeParcelable(this.cover, i);
            parcel.writeString(this.photoAvgColor);
            parcel.writeParcelable(this.hasMobile, i);
            parcel.writeParcelable(this.isFriend, i);
            Boolean bool = this.isBestFriend;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.wallComments, i);
            parcel.writeParcelable(this.canPost, i);
            parcel.writeParcelable(this.canSeeAllPosts, i);
            parcel.writeParcelable(this.canSeeAudio, i);
            parcel.writeParcelable(this.type, i);
            parcel.writeString(this.email);
            parcel.writeString(this.skype);
            parcel.writeString(this.facebook);
            parcel.writeString(this.facebookName);
            parcel.writeString(this.twitter);
            parcel.writeParcelable(this.isAdult, i);
            parcel.writeParcelable(this.isSubscribed, i);
            Boolean bool2 = this.isSubscribedStories;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            Boolean bool3 = this.canSubscribeStories;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            Boolean bool4 = this.canAskQuestion;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            Boolean bool5 = this.canAskAnonymous;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            parcel.writeString(this.subscriptionCountry);
            parcel.writeString(this.livejournal);
            parcel.writeString(this.instagram);
            parcel.writeParcelable(this.test, i);
            parcel.writeParcelable(this.videoLive, i);
            parcel.writeParcelable(this.isVideoLiveNotificationsBlocked, i);
            Boolean bool6 = this.isService;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            parcel.writeString(this.serviceDescription);
            parcel.writeString(this.photoRec);
            parcel.writeString(this.photoMedium);
            parcel.writeString(this.photoMediumRec);
            parcel.writeString(this.photo);
            parcel.writeString(this.photoBig);
            parcel.writeString(this.photo400);
            parcel.writeParcelable(this.photoMaxSize, i);
            List<List<UsersProfileButtonDto>> list = this.profileButtons;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list, 1);
                while (f2.hasNext()) {
                    Iterator a2 = ao.a(parcel, (List) f2.next());
                    while (a2.hasNext()) {
                        parcel.writeParcelable((Parcelable) a2.next(), i);
                    }
                }
            }
            List<List<UsersProfileButtonDto>> list2 = this.profileButtonsTablet;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list2, 1);
                while (f3.hasNext()) {
                    Iterator a3 = ao.a(parcel, (List) f3.next());
                    while (a3.hasNext()) {
                        parcel.writeParcelable((Parcelable) a3.next(), i);
                    }
                }
            }
            List<UsersProfileButtonDto> list3 = this.thirdPartyButtons;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list3, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            parcel.writeString(this.language);
            Integer num = this.storiesArchiveCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Boolean bool7 = this.hasUnseenStories;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool7);
            }
            WallDefaultDto wallDefaultDto = this.wallDefault;
            if (wallDefaultDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallDefaultDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.musicAwards, i);
            Boolean bool8 = this.canCall;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool8);
            }
            Boolean bool9 = this.canCallFromGroup;
            if (bool9 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool9);
            }
            Boolean bool10 = this.canInviteAsVoiceroomsSpeaker;
            if (bool10 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool10);
            }
            Boolean bool11 = this.canSeeWishes;
            if (bool11 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool11);
            }
            parcel.writeParcelable(this.canSeeGifts, i);
            List<BaseOwnerButtonDto> list4 = this.buttons;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list4, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            parcel.writeString(this.interests);
            parcel.writeString(this.books);
            parcel.writeString(this.tv);
            parcel.writeString(this.quotes);
            parcel.writeString(this.about);
            parcel.writeString(this.games);
            parcel.writeString(this.movies);
            parcel.writeString(this.activities);
            parcel.writeString(this.music);
            parcel.writeParcelable(this.canWritePrivateMessage, i);
            parcel.writeParcelable(this.canSendFriendRequest, i);
            Boolean bool12 = this.canBeInvitedGroup;
            if (bool12 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool12);
            }
            parcel.writeString(this.mobilePhone);
            parcel.writeString(this.homePhone);
            parcel.writeString(this.site);
            parcel.writeParcelable(this.statusAudio, i);
            parcel.writeString(this.status);
            parcel.writeString(this.activity);
            parcel.writeParcelable(this.statusApp, i);
            parcel.writeParcelable(this.lastSeen, i);
            parcel.writeParcelable(this.exports, i);
            parcel.writeParcelable(this.cropPhoto, i);
            Integer num2 = this.followersCount;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
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
            parcel.writeParcelable(this.blacklisted, i);
            parcel.writeParcelable(this.blacklistedByMe, i);
            parcel.writeParcelable(this.isFavorite, i);
            parcel.writeParcelable(this.isHiddenFromFeed, i);
            Integer num6 = this.commonCount;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            parcel.writeParcelable(this.occupation, i);
            List<UsersCareerDto> list5 = this.career;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list5, 1);
                while (f6.hasNext()) {
                    parcel.writeParcelable((Parcelable) f6.next(), i);
                }
            }
            List<UsersMilitaryDto> list6 = this.military;
            if (list6 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f7 = dn.f(parcel, list6, 1);
                while (f7.hasNext()) {
                    parcel.writeParcelable((Parcelable) f7.next(), i);
                }
            }
            Integer num7 = this.university;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            parcel.writeString(this.universityName);
            Integer num8 = this.universityGroupId;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            Integer num9 = this.faculty;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            parcel.writeString(this.facultyName);
            Integer num10 = this.graduation;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            parcel.writeString(this.educationForm);
            parcel.writeString(this.educationStatus);
            parcel.writeString(this.homeTown);
            parcel.writeParcelable(this.relation, i);
            parcel.writeParcelable(this.relationPartner, i);
            parcel.writeParcelable(this.personal, i);
            List<UsersUniversityDto> list7 = this.universities;
            if (list7 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f8 = dn.f(parcel, list7, 1);
                while (f8.hasNext()) {
                    parcel.writeParcelable((Parcelable) f8.next(), i);
                }
            }
            List<UsersSchoolDto> list8 = this.schools;
            if (list8 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f9 = dn.f(parcel, list8, 1);
                while (f9.hasNext()) {
                    parcel.writeParcelable((Parcelable) f9.next(), i);
                }
            }
            List<UsersRelativeDto> list9 = this.relatives;
            if (list9 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f10 = dn.f(parcel, list9, 1);
                while (f10.hasNext()) {
                    parcel.writeParcelable((Parcelable) f10.next(), i);
                }
            }
            Boolean bool13 = this.isSubscribedPodcasts;
            if (bool13 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool13);
            }
            Boolean bool14 = this.canSubscribePodcasts;
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
            Boolean bool16 = this.isStudent;
            if (bool16 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool16);
            }
            Boolean bool17 = this.hasRights;
            if (bool17 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool17);
            }
            parcel.writeString(this.sysUsername);
            parcel.writeParcelable(this.employeeWorkingState, i);
            EmployeeMarkDto employeeMarkDto = this.employeeMark;
            if (employeeMarkDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                employeeMarkDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.rightsLocation, i);
            Boolean bool18 = this.canInviteToChats;
            if (bool18 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool18);
            }
            parcel.writeParcelable(this.emojiStatus, i);
            parcel.writeParcelable(this.imageStatus, i);
            parcel.writeParcelable(this.counters, i);
            parcel.writeString(this.accessKey);
            parcel.writeParcelable(this.canUploadDoc, i);
            Boolean bool19 = this.canBan;
            if (bool19 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool19);
            }
            parcel.writeStringList(this.eduDetails);
            parcel.writeString(this.hash);
            Boolean bool20 = this.hasEmail;
            if (bool20 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool20);
            }
            Boolean bool21 = this.isDead;
            if (bool21 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool21);
            }
            parcel.writeParcelable(this.giftsTooltip, i);
            NoIndexDto noIndexDto = this.noIndex;
            if (noIndexDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                noIndexDto.writeToParcel(parcel, i);
            }
            Integer num11 = this.contactId;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            parcel.writeParcelable(this.contact, i);
            Boolean bool22 = this.isMessageRequest;
            if (bool22 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool22);
            }
            parcel.writeStringList(this.descriptions);
            List<Integer> list10 = this.lists;
            if (list10 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f11 = dn.f(parcel, list10, 1);
                while (f11.hasNext()) {
                    parcel.writeInt(((Number) f11.next()).intValue());
                }
            }
            Integer num12 = this.friendshipWeeks;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            parcel.writeString(this.trackCode);
            Boolean bool23 = this.isPersonalAdsEasyPromoteEnabled;
            if (bool23 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool23);
            }
            Boolean bool24 = this.needBigMsgBtnInProfile;
            if (bool24 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool24);
            }
            parcel.writeParcelable(this.profileType, i);
            parcel.writeParcelable(this.canNotCallReason, i);
            Boolean bool25 = this.canCallAsCommunity;
            if (bool25 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool25);
            }
            Boolean bool26 = this.isNft;
            if (bool26 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool26);
            }
            parcel.writeParcelable(this.animatedAvatar, i);
            List<CallsCustomNameForCallDto> list11 = this.customNamesForCalls;
            if (list11 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f12 = dn.f(parcel, list11, 1);
                while (f12.hasNext()) {
                    parcel.writeParcelable((Parcelable) f12.next(), i);
                }
            }
            Boolean bool27 = this.isEsiaVerified;
            if (bool27 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool27);
            }
            Boolean bool28 = this.isEsiaLinked;
            if (bool28 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool28);
            }
            Boolean bool29 = this.isTinkoffVerified;
            if (bool29 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool29);
            }
            Boolean bool30 = this.isTinkoffLinked;
            if (bool30 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool30);
            }
            Boolean bool31 = this.isSberVerified;
            if (bool31 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool31);
            }
            Boolean bool32 = this.isVerified;
            if (bool32 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool32);
            }
            Boolean bool33 = this.isFollowersModeOn;
            if (bool33 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool33);
            }
            SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
            if (socialButtonTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                socialButtonTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.description);
            Boolean bool34 = this.isTeacher;
            if (bool34 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool34);
            }
            parcel.writeStringList(this.oauthLinked);
            parcel.writeStringList(this.oauthVerification);
            Boolean bool35 = this.isSberLinked;
            if (bool35 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool35);
            }
            Integer num13 = this.ageMark;
            if (num13 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num13);
            }
            Integer num14 = this.joined;
            if (num14 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num14);
            }
            Boolean bool36 = this.isServiceAccount;
            if (bool36 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool36);
            }
            parcel.writeParcelable(this.promotionAllowance, i);
            Boolean bool37 = this.coOwnershipEnabled;
            if (bool37 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool37);
            }
            Integer num15 = this.ageGroup;
            if (num15 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num15);
            }
            Boolean bool38 = this.hasRelatedUserPin;
            if (bool38 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool38);
            }
            parcel.writeParcelable(this.educationalProfile, i);
            parcel.writeParcelable(this.aPlusMark, i);
            Boolean bool39 = this.isDon;
            if (bool39 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool39);
            }
            Boolean bool40 = this.isMediaModer;
            if (bool40 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool40);
            }
            Boolean bool41 = this.isPhotoMapEnabled;
            if (bool41 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool41);
            }
            parcel.writeParcelable(this.donut, i);
            parcel.writeParcelable(this.sex, i);
            parcel.writeString(this.screenName);
            parcel.writeString(this.photo50);
            parcel.writeString(this.photo100);
            parcel.writeString(this.photoBase);
            parcel.writeParcelable(this.onlineInfo, i);
            parcel.writeParcelable(this.online, i);
            parcel.writeParcelable(this.onlineMobile, i);
            Integer num16 = this.onlineApp;
            if (num16 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num16);
            }
            parcel.writeParcelable(this.verified, i);
            parcel.writeParcelable(this.trending, i);
            parcel.writeParcelable(this.friendStatus, i);
            parcel.writeParcelable(this.mutual, i);
            parcel.writeString(this.deactivated);
            parcel.writeString(this.firstName);
            Integer num17 = this.hidden;
            if (num17 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num17);
            }
            parcel.writeString(this.lastName);
            Boolean bool42 = this.canAccessClosed;
            if (bool42 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool42);
            }
            Boolean bool43 = this.isClosed;
            if (bool43 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool43);
            }
            Boolean bool44 = this.isCached;
            if (bool44 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool44);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UsersUserFullDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str24, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str25, String str26, String str27, String str28, String str29, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str30, String str31, String str32, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool6, String str33, String str34, String str35, String str36, String str37, String str38, String str39, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list, List<? extends List<UsersProfileButtonDto>> list2, List<UsersProfileButtonDto> list3, String str40, Integer num, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto12, List<BaseOwnerButtonDto> list4, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool12, String str50, String str51, String str52, AudioAudioDto audioAudioDto, String str53, String str54, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list5, List<UsersMilitaryDto> list6, Integer num7, String str55, Integer num8, Integer num9, String str56, Integer num10, String str57, String str58, String str59, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list7, List<UsersSchoolDto> list8, List<UsersRelativeDto> list9, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str60, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str61, BaseBoolIntDto baseBoolIntDto19, Boolean bool19, List<String> list10, String str62, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool22, List<String> list11, List<Integer> list12, Integer num12, String str63, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str64, Boolean bool34, List<String> list14, List<String> list15, Boolean bool35, Integer num13, Integer num14, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num15, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str65, String str66, String str67, String str68, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str69, String str70, Integer num17, String str71, Boolean bool42, Boolean bool43, Boolean bool44) {
            super(null);
            this.id = userId;
            this.firstNameNom = str;
            this.firstNameGen = str2;
            this.firstNameDat = str3;
            this.firstNameAcc = str4;
            this.firstNameIns = str5;
            this.firstNameAbl = str6;
            this.lastNameNom = str7;
            this.lastNameGen = str8;
            this.lastNameDat = str9;
            this.lastNameAcc = str10;
            this.lastNameIns = str11;
            this.lastNameAbl = str12;
            this.nickname = str13;
            this.maidenName = str14;
            this.contactName = str15;
            this.domain = str16;
            this.bdate = str17;
            this.bdateVisibility = bdateVisibilityDto;
            this.city = baseCityDto;
            this.country = baseCountryDto;
            this.timezone = f;
            this.ownerState = ownerStateDto;
            this.photo200 = str18;
            this.photoMax = str19;
            this.photo200Orig = str20;
            this.photo400Orig = str21;
            this.photoMaxOrig = str22;
            this.photoId = str23;
            this.hasPhoto = baseBoolIntDto;
            this.cover = baseOwnerCoverDto;
            this.photoAvgColor = str24;
            this.hasMobile = baseBoolIntDto2;
            this.isFriend = baseBoolIntDto3;
            this.isBestFriend = bool;
            this.wallComments = baseBoolIntDto4;
            this.canPost = baseBoolIntDto5;
            this.canSeeAllPosts = baseBoolIntDto6;
            this.canSeeAudio = baseBoolIntDto7;
            this.type = usersUserTypeDto;
            this.email = str25;
            this.skype = str26;
            this.facebook = str27;
            this.facebookName = str28;
            this.twitter = str29;
            this.isAdult = baseBoolIntDto8;
            this.isSubscribed = baseBoolIntDto9;
            this.isSubscribedStories = bool2;
            this.canSubscribeStories = bool3;
            this.canAskQuestion = bool4;
            this.canAskAnonymous = bool5;
            this.subscriptionCountry = str30;
            this.livejournal = str31;
            this.instagram = str32;
            this.test = baseBoolIntDto10;
            this.videoLive = videoLiveInfoDto;
            this.isVideoLiveNotificationsBlocked = baseBoolIntDto11;
            this.isService = bool6;
            this.serviceDescription = str33;
            this.photoRec = str34;
            this.photoMedium = str35;
            this.photoMediumRec = str36;
            this.photo = str37;
            this.photoBig = str38;
            this.photo400 = str39;
            this.photoMaxSize = photosPhotoDto;
            this.profileButtons = list;
            this.profileButtonsTablet = list2;
            this.thirdPartyButtons = list3;
            this.language = str40;
            this.storiesArchiveCount = num;
            this.hasUnseenStories = bool7;
            this.wallDefault = wallDefaultDto;
            this.musicAwards = audioMusicAwardsDto;
            this.canCall = bool8;
            this.canCallFromGroup = bool9;
            this.canInviteAsVoiceroomsSpeaker = bool10;
            this.canSeeWishes = bool11;
            this.canSeeGifts = baseBoolIntDto12;
            this.buttons = list4;
            this.interests = str41;
            this.books = str42;
            this.tv = str43;
            this.quotes = str44;
            this.about = str45;
            this.games = str46;
            this.movies = str47;
            this.activities = str48;
            this.music = str49;
            this.canWritePrivateMessage = baseBoolIntDto13;
            this.canSendFriendRequest = baseBoolIntDto14;
            this.canBeInvitedGroup = bool12;
            this.mobilePhone = str50;
            this.homePhone = str51;
            this.site = str52;
            this.statusAudio = audioAudioDto;
            this.status = str53;
            this.activity = str54;
            this.statusApp = appsAppMinDto;
            this.lastSeen = usersLastSeenDto;
            this.exports = usersExportsDto;
            this.cropPhoto = baseCropPhotoDto;
            this.followersCount = num2;
            this.videoLiveLevel = num3;
            this.videoLiveCount = num4;
            this.clipsCount = num5;
            this.blacklisted = baseBoolIntDto15;
            this.blacklistedByMe = baseBoolIntDto16;
            this.isFavorite = baseBoolIntDto17;
            this.isHiddenFromFeed = baseBoolIntDto18;
            this.commonCount = num6;
            this.occupation = usersOccupationDto;
            this.career = list5;
            this.military = list6;
            this.university = num7;
            this.universityName = str55;
            this.universityGroupId = num8;
            this.faculty = num9;
            this.facultyName = str56;
            this.graduation = num10;
            this.educationForm = str57;
            this.educationStatus = str58;
            this.homeTown = str59;
            this.relation = usersUserRelationDto;
            this.relationPartner = usersUserMinDto;
            this.personal = usersPersonalDto;
            this.universities = list7;
            this.schools = list8;
            this.relatives = list9;
            this.isSubscribedPodcasts = bool13;
            this.canSubscribePodcasts = bool14;
            this.canSubscribePosts = bool15;
            this.isStudent = bool16;
            this.hasRights = bool17;
            this.sysUsername = str60;
            this.employeeWorkingState = usersEmployeeWorkingStateDto;
            this.employeeMark = employeeMarkDto;
            this.rightsLocation = usersRightsLocationDto;
            this.canInviteToChats = bool18;
            this.emojiStatus = usersEmojiStatusDto;
            this.imageStatus = statusImageStatusDto;
            this.counters = usersUserCountersDto;
            this.accessKey = str61;
            this.canUploadDoc = baseBoolIntDto19;
            this.canBan = bool19;
            this.eduDetails = list10;
            this.hash = str62;
            this.hasEmail = bool20;
            this.isDead = bool21;
            this.giftsTooltip = usersGiftsTooltipDto;
            this.noIndex = noIndexDto;
            this.contactId = num11;
            this.contact = messagesContactDto;
            this.isMessageRequest = bool22;
            this.descriptions = list11;
            this.lists = list12;
            this.friendshipWeeks = num12;
            this.trackCode = str63;
            this.isPersonalAdsEasyPromoteEnabled = bool23;
            this.needBigMsgBtnInProfile = bool24;
            this.profileType = usersUserProfileTypeDto;
            this.canNotCallReason = usersCanNotCallReasonDto;
            this.canCallAsCommunity = bool25;
            this.isNft = bool26;
            this.animatedAvatar = baseImageDto;
            this.customNamesForCalls = list13;
            this.isEsiaVerified = bool27;
            this.isEsiaLinked = bool28;
            this.isTinkoffVerified = bool29;
            this.isTinkoffLinked = bool30;
            this.isSberVerified = bool31;
            this.isVerified = bool32;
            this.isFollowersModeOn = bool33;
            this.socialButtonType = socialButtonTypeDto;
            this.description = str64;
            this.isTeacher = bool34;
            this.oauthLinked = list14;
            this.oauthVerification = list15;
            this.isSberLinked = bool35;
            this.ageMark = num13;
            this.joined = num14;
            this.isServiceAccount = bool36;
            this.promotionAllowance = usersPromotionAllowanceDto;
            this.coOwnershipEnabled = bool37;
            this.ageGroup = num15;
            this.hasRelatedUserPin = bool38;
            this.educationalProfile = messagesEduEducationalProfileDto;
            this.aPlusMark = baseAPlusMarkDto;
            this.isDon = bool39;
            this.isMediaModer = bool40;
            this.isPhotoMapEnabled = bool41;
            this.donut = usersDonutDto;
            this.sex = baseSexDto;
            this.screenName = str65;
            this.photo50 = str66;
            this.photo100 = str67;
            this.photoBase = str68;
            this.onlineInfo = usersOnlineInfoDto;
            this.online = baseBoolIntDto20;
            this.onlineMobile = baseBoolIntDto21;
            this.onlineApp = num16;
            this.verified = baseBoolIntDto22;
            this.trending = baseBoolIntDto23;
            this.friendStatus = friendsFriendStatusStatusDto;
            this.mutual = friendsRequestsMutualDto;
            this.deactivated = str69;
            this.firstName = str70;
            this.hidden = num17;
            this.lastName = str71;
            this.canAccessClosed = bool42;
            this.isClosed = bool43;
            this.isCached = bool44;
        }
    }

    public /* synthetic */ UsersSubscriptionsItemDto(zcl zclVar) {
        this();
    }

    private UsersSubscriptionsItemDto() {
    }
}
