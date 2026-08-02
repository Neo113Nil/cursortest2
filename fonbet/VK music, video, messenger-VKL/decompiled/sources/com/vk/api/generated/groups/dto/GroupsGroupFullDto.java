package com.vk.api.generated.groups.dto;

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
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGroupFullDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullDto implements Parcelable {
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
    /* compiled from: GroupsGroupFullDto.kt */
    public static final class DeactivatedTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DeactivatedTypeDto[] $VALUES;

        @pmi0("banned")
        public static final DeactivatedTypeDto BANNED;
        public static final Parcelable.Creator<DeactivatedTypeDto> CREATOR;

        @pmi0("geo_blocked")
        public static final DeactivatedTypeDto GEO_BLOCKED;
        private final String value;

        /* compiled from: GroupsGroupFullDto.kt */
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupFullDto.kt */
    public static final class DisallowManageReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisallowManageReasonDto[] $VALUES;

        @pmi0("2")
        public static final DisallowManageReasonDto AWAITING_PERIOD;
        public static final Parcelable.Creator<DisallowManageReasonDto> CREATOR;

        @pmi0("1")
        public static final DisallowManageReasonDto NO_2FA;
        private final int value;

        /* compiled from: GroupsGroupFullDto.kt */
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
    /* compiled from: GroupsGroupFullDto.kt */
    public static final class LeaveModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LeaveModeDto[] $VALUES;

        @pmi0("admin_leave_alert")
        public static final LeaveModeDto ADMIN_LEAVE_ALERT;

        @pmi0("admin_leave_options")
        public static final LeaveModeDto ADMIN_LEAVE_OPTIONS;
        public static final Parcelable.Creator<LeaveModeDto> CREATOR;
        private final String value;

        /* compiled from: GroupsGroupFullDto.kt */
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
    /* compiled from: GroupsGroupFullDto.kt */
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

        /* compiled from: GroupsGroupFullDto.kt */
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

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupFullDto.kt */
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

        /* compiled from: GroupsGroupFullDto.kt */
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupFullDto.kt */
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

        /* compiled from: GroupsGroupFullDto.kt */
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

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupFullDto.kt */
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

        /* compiled from: GroupsGroupFullDto.kt */
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
    /* compiled from: GroupsGroupFullDto.kt */
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

        /* compiled from: GroupsGroupFullDto.kt */
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

    /* compiled from: GroupsGroupFullDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullDto> {
        public static GroupsGroupFullDto a(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Class cls;
            BaseBoolIntDto createFromParcel;
            BaseBoolIntDto baseBoolIntDto;
            BaseBoolIntDto createFromParcel2;
            Boolean valueOf3;
            BaseBoolIntDto baseBoolIntDto2;
            BaseBoolIntDto createFromParcel3;
            BaseBoolIntDto baseBoolIntDto3;
            BaseBoolIntDto createFromParcel4;
            BaseBoolIntDto baseBoolIntDto4;
            BaseBoolIntDto createFromParcel5;
            BaseBoolIntDto baseBoolIntDto5;
            BaseBoolIntDto createFromParcel6;
            BaseBoolIntDto baseBoolIntDto6;
            BaseBoolIntDto createFromParcel7;
            BaseBoolIntDto baseBoolIntDto7;
            BaseBoolIntDto createFromParcel8;
            BaseBoolIntDto baseBoolIntDto8;
            BaseBoolIntDto createFromParcel9;
            BaseBoolIntDto baseBoolIntDto9;
            BaseCropPhotoDto createFromParcel10;
            BaseCropPhotoDto baseCropPhotoDto;
            AudioAudioDto createFromParcel11;
            AudioAudioDto audioAudioDto;
            Boolean bool;
            ArrayList arrayList;
            BaseBoolIntDto baseBoolIntDto10;
            ArrayList arrayList2;
            Boolean valueOf4;
            WallDto wallDto;
            BaseBoolIntDto createFromParcel12;
            BaseBoolIntDto baseBoolIntDto11;
            BaseBoolIntDto createFromParcel13;
            BaseBoolIntDto baseBoolIntDto12;
            BaseBoolIntDto createFromParcel14;
            BaseBoolIntDto baseBoolIntDto13;
            BaseBoolIntDto createFromParcel15;
            BaseBoolIntDto baseBoolIntDto14;
            GroupsOnlineStatusDto createFromParcel16;
            GroupsOnlineStatusDto groupsOnlineStatusDto;
            GroupsGroupFullAgeLimitsDto createFromParcel17;
            GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto;
            GroupsGroupFullAgeMarkDto createFromParcel18;
            GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto;
            GroupsGroupBanInfoDto createFromParcel19;
            GroupsGroupBanInfoDto groupsGroupBanInfoDto;
            GroupsActionButtonDto createFromParcel20;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Object obj;
            GroupsAddressesInfoDto createFromParcel21;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            GroupsAddressesInfoDto groupsAddressesInfoDto;
            GroupsLiveCoversDto createFromParcel22;
            GroupsLiveCoversDto groupsLiveCoversDto;
            GroupsVkAdminStatusDto createFromParcel23;
            GroupsVkAdminStatusDto groupsVkAdminStatusDto;
            GroupsMenuDto createFromParcel24;
            GroupsMenuDto groupsMenuDto;
            GroupsWarningNotificationDto createFromParcel25;
            GroupsWarningNotificationDto groupsWarningNotificationDto;
            GroupsGroupDonutDto createFromParcel26;
            GroupsGroupDonutDto groupsGroupDonutDto;
            GroupsGroupVkTicketDto createFromParcel27;
            GroupsGroupVkTicketDto groupsGroupVkTicketDto;
            GroupsGroupDonutBlockDto createFromParcel28;
            GroupsGroupDonutBlockDto groupsGroupDonutBlockDto;
            GroupsDonutCommunityManagementDto createFromParcel29;
            GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto;
            GroupsGroupDonutPaymentInfoDto createFromParcel30;
            Boolean valueOf16;
            GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto;
            BaseBoolIntDto createFromParcel31;
            BaseBoolIntDto baseBoolIntDto15;
            BaseBoolIntDto createFromParcel32;
            BaseBoolIntDto baseBoolIntDto16;
            GroupsChatsStatusDto createFromParcel33;
            GroupsChatsStatusDto groupsChatsStatusDto;
            BaseBoolIntDto createFromParcel34;
            Boolean valueOf17;
            Boolean valueOf18;
            Boolean valueOf19;
            BaseBoolIntDto baseBoolIntDto17;
            TrustMarkDto createFromParcel35;
            TrustMarkDto trustMarkDto;
            GroupsMicrolandingDto createFromParcel36;
            GroupsMicrolandingDto groupsMicrolandingDto;
            GroupsTariffsDto createFromParcel37;
            Boolean valueOf20;
            GroupsTariffsDto groupsTariffsDto;
            DisallowManageReasonDto createFromParcel38;
            DisallowManageReasonDto disallowManageReasonDto;
            BaseBoolIntDto createFromParcel39;
            BaseBoolIntDto baseBoolIntDto18;
            GroupsGroupFullShowSuggestionsDto createFromParcel40;
            Boolean valueOf21;
            Boolean valueOf22;
            GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto;
            GroupsAdsEasyPromoteDto createFromParcel41;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            Object obj2;
            GroupsGroupLikeItemDto createFromParcel42;
            GroupsGroupLikeItemDto groupsGroupLikeItemDto;
            GroupsLoginConfirmationStatusDto createFromParcel43;
            Boolean valueOf27;
            GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto;
            GroupsGroupFriendsDto createFromParcel44;
            GroupsGroupFriendsDto groupsGroupFriendsDto;
            DeactivatedTypeDto createFromParcel45;
            Boolean valueOf28;
            Boolean valueOf29;
            Boolean valueOf30;
            DeactivatedTypeDto deactivatedTypeDto;
            MarketCommunityRatingDto createFromParcel46;
            MarketCommunityRatingDto marketCommunityRatingDto;
            GroupsGroupNameHistoryDto createFromParcel47;
            GroupsGroupNameHistoryDto groupsGroupNameHistoryDto;
            MarketCommunityServiceRatingDto createFromParcel48;
            MarketCommunityServiceRatingDto marketCommunityServiceRatingDto;
            GroupsRecommendedTipsWidgetDto createFromParcel49;
            Boolean valueOf31;
            Boolean valueOf32;
            Boolean valueOf33;
            Boolean valueOf34;
            Boolean valueOf35;
            GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto;
            GroupsAdsPostsInfoDto createFromParcel50;
            GroupsAdsPostsInfoDto groupsAdsPostsInfoDto;
            GroupsBannerDto createFromParcel51;
            GroupsBannerDto groupsBannerDto;
            GroupsBannerDto createFromParcel52;
            Boolean valueOf36;
            GroupsBannerDto groupsBannerDto2;
            LeaveModeDto createFromParcel53;
            LeaveModeDto leaveModeDto;
            GroupsBannerDto createFromParcel54;
            Boolean valueOf37;
            Boolean valueOf38;
            GroupsBannerDto groupsBannerDto3;
            VideoNotificationsStatusDto createFromParcel55;
            Boolean valueOf39;
            Boolean valueOf40;
            Boolean valueOf41;
            VideoNotificationsStatusDto videoNotificationsStatusDto;
            GroupsWorkGroupInfoDto createFromParcel56;
            GroupsWorkGroupInfoDto groupsWorkGroupInfoDto;
            GroupsGroupFullMembersPreviewDto createFromParcel57;
            GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto;
            GroupsStrikesInfoDto createFromParcel58;
            GroupsStrikesInfoDto groupsStrikesInfoDto;
            GroupsStrikesRestrictionsDto createFromParcel59;
            Boolean valueOf42;
            Boolean valueOf43;
            Boolean valueOf44;
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto;
            GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Integer num;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Integer num2;
            Boolean valueOf45;
            GroupsChannelInfoDto groupsChannelInfoDto;
            GroupsVideoChannelDataDto createFromParcel60;
            Boolean valueOf46;
            Boolean valueOf47;
            Boolean valueOf48;
            GroupsVideoChannelDataDto groupsVideoChannelDataDto;
            GroupsContentSectionsDataDto createFromParcel61;
            GroupsContentSectionsDataDto groupsContentSectionsDataDto;
            GroupsGroupIsClosedDto createFromParcel62;
            GroupsGroupIsClosedDto groupsGroupIsClosedDto;
            GroupsGroupTypeDto createFromParcel63;
            GroupsGroupTypeDto groupsGroupTypeDto;
            ChannelsChannelTypeDto createFromParcel64;
            ChannelsChannelTypeDto channelsChannelTypeDto;
            BaseBoolIntDto createFromParcel65;
            BaseBoolIntDto baseBoolIntDto19;
            GroupsGroupAdminLevelDto createFromParcel66;
            GroupsGroupAdminLevelDto groupsGroupAdminLevelDto;
            BaseBoolIntDto createFromParcel67;
            BaseBoolIntDto baseBoolIntDto20;
            BaseBoolIntDto createFromParcel68;
            BaseBoolIntDto baseBoolIntDto21;
            BaseBoolIntDto createFromParcel69;
            BaseBoolIntDto baseBoolIntDto22;
            GroupsPhotoSizeDto createFromParcel70;
            GroupsPhotoSizeDto groupsPhotoSizeDto;
            GroupsAppButtonDto createFromParcel71;
            GroupsAppButtonDto groupsAppButtonDto;
            ArrayList arrayList7;
            ArrayList arrayList8;
            GroupsChannelBlockDto groupsChannelBlockDto;
            Boolean valueOf49;
            BaseBoolIntDto baseBoolIntDto23;
            ArrayList arrayList9;
            ArrayList arrayList10;
            VideoLiveInfoDto videoLiveInfoDto;
            Boolean valueOf50;
            Boolean valueOf51;
            Boolean valueOf52;
            Boolean valueOf53;
            Boolean valueOf54;
            Boolean bool2;
            GroupsGroupExtendedMarketSectionsDto createFromParcel72;
            GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto;
            GroupsMarketShopConditionsStateDto createFromParcel73;
            Boolean valueOf55;
            Boolean valueOf56;
            Boolean valueOf57;
            Boolean valueOf58;
            Boolean valueOf59;
            GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto;
            YoulaStatusDto createFromParcel74;
            Boolean valueOf60;
            Boolean valueOf61;
            YoulaStatusDto youlaStatusDto;
            YoulaPostingMethodDto createFromParcel75;
            UserId userId = (UserId) parcel.readParcelable(GroupsGroupFullDto.class.getClassLoader());
            GroupsGroupFullMemberStatusDto createFromParcel76 = parcel.readInt() == 0 ? null : GroupsGroupFullMemberStatusDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel77 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel78 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel79 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel80 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseObjectDto createFromParcel81 = parcel.readInt() == 0 ? null : BaseObjectDto.CREATOR.createFromParcel(parcel);
            BaseCountryDto createFromParcel82 = parcel.readInt() == 0 ? null : BaseCountryDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AudioMusicAwardsDto createFromParcel83 = parcel.readInt() == 0 ? null : AudioMusicAwardsDto.CREATOR.createFromParcel(parcel);
            Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf65 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf66 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsCountersGroupDto createFromParcel84 = parcel.readInt() == 0 ? null : GroupsCountersGroupDto.CREATOR.createFromParcel(parcel);
            BaseOwnerCoverDto createFromParcel85 = parcel.readInt() == 0 ? null : BaseOwnerCoverDto.CREATOR.createFromParcel(parcel);
            BaseOwnerCoverDto createFromParcel86 = parcel.readInt() == 0 ? null : BaseOwnerCoverDto.CREATOR.createFromParcel(parcel);
            GroupsVideoLivesDataDto createFromParcel87 = parcel.readInt() == 0 ? null : GroupsVideoLivesDataDto.CREATOR.createFromParcel(parcel);
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
            BaseBoolIntDto createFromParcel88 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                cls = GroupsGroupFullDto.class;
                createFromParcel = null;
            } else {
                cls = GroupsGroupFullDto.class;
                createFromParcel = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto24 = createFromParcel;
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto24;
                createFromParcel2 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto24;
                createFromParcel2 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto25 = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto25;
                createFromParcel3 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto25;
                createFromParcel3 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto26 = createFromParcel3;
            if (parcel.readInt() == 0) {
                baseBoolIntDto3 = baseBoolIntDto26;
                createFromParcel4 = null;
            } else {
                baseBoolIntDto3 = baseBoolIntDto26;
                createFromParcel4 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto27 = createFromParcel4;
            if (parcel.readInt() == 0) {
                baseBoolIntDto4 = baseBoolIntDto27;
                createFromParcel5 = null;
            } else {
                baseBoolIntDto4 = baseBoolIntDto27;
                createFromParcel5 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto28 = createFromParcel5;
            if (parcel.readInt() == 0) {
                baseBoolIntDto5 = baseBoolIntDto28;
                createFromParcel6 = null;
            } else {
                baseBoolIntDto5 = baseBoolIntDto28;
                createFromParcel6 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto29 = createFromParcel6;
            if (parcel.readInt() == 0) {
                baseBoolIntDto6 = baseBoolIntDto29;
                createFromParcel7 = null;
            } else {
                baseBoolIntDto6 = baseBoolIntDto29;
                createFromParcel7 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto30 = createFromParcel7;
            if (parcel.readInt() == 0) {
                baseBoolIntDto7 = baseBoolIntDto30;
                createFromParcel8 = null;
            } else {
                baseBoolIntDto7 = baseBoolIntDto30;
                createFromParcel8 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto31 = createFromParcel8;
            BaseBoolIntDto baseBoolIntDto32 = baseBoolIntDto;
            Boolean bool3 = valueOf3;
            BaseBoolIntDto baseBoolIntDto33 = baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto34 = baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto35 = baseBoolIntDto7;
            String readString8 = parcel.readString();
            Integer valueOf67 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto8 = baseBoolIntDto31;
                createFromParcel9 = null;
            } else {
                baseBoolIntDto8 = baseBoolIntDto31;
                createFromParcel9 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto36 = createFromParcel9;
            if (parcel.readInt() == 0) {
                baseBoolIntDto9 = baseBoolIntDto36;
                createFromParcel10 = null;
            } else {
                baseBoolIntDto9 = baseBoolIntDto36;
                createFromParcel10 = BaseCropPhotoDto.CREATOR.createFromParcel(parcel);
            }
            BaseCropPhotoDto baseCropPhotoDto2 = createFromParcel10;
            Integer num3 = valueOf67;
            BaseBoolIntDto baseBoolIntDto37 = baseBoolIntDto9;
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseCropPhotoDto = baseCropPhotoDto2;
                createFromParcel11 = null;
            } else {
                baseCropPhotoDto = baseCropPhotoDto2;
                createFromParcel11 = AudioAudioDto.CREATOR.createFromParcel(parcel);
            }
            AudioAudioDto audioAudioDto2 = createFromParcel11;
            Integer valueOf68 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto2;
                bool = valueOf;
                baseBoolIntDto10 = createFromParcel88;
                arrayList = null;
            } else {
                audioAudioDto = audioAudioDto2;
                int readInt = parcel.readInt();
                bool = valueOf;
                arrayList = new ArrayList(readInt);
                baseBoolIntDto10 = createFromParcel88;
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsLinksItemDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                    userId = userId;
                }
            }
            UserId userId2 = userId;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(GroupsContactsItemDto.CREATOR, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                    arrayList = arrayList;
                }
            }
            ArrayList arrayList11 = arrayList;
            WallDto createFromParcel89 = parcel.readInt() == 0 ? null : WallDto.CREATOR.createFromParcel(parcel);
            Boolean bool4 = valueOf2;
            BaseBoolIntDto baseBoolIntDto38 = baseBoolIntDto10;
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsGroupFullSectionDto createFromParcel90 = parcel.readInt() == 0 ? null : GroupsGroupFullSectionDto.CREATOR.createFromParcel(parcel);
            GroupsPrimaryBlockSettingsDto createFromParcel91 = parcel.readInt() != 0 ? GroupsPrimaryBlockSettingsDto.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() == 0) {
                wallDto = createFromParcel89;
                createFromParcel12 = null;
            } else {
                wallDto = createFromParcel89;
                createFromParcel12 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto39 = createFromParcel12;
            if (parcel.readInt() == 0) {
                baseBoolIntDto11 = baseBoolIntDto39;
                createFromParcel13 = null;
            } else {
                baseBoolIntDto11 = baseBoolIntDto39;
                createFromParcel13 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto40 = createFromParcel13;
            if (parcel.readInt() == 0) {
                baseBoolIntDto12 = baseBoolIntDto40;
                createFromParcel14 = null;
            } else {
                baseBoolIntDto12 = baseBoolIntDto40;
                createFromParcel14 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto41 = createFromParcel14;
            if (parcel.readInt() == 0) {
                baseBoolIntDto13 = baseBoolIntDto41;
                createFromParcel15 = null;
            } else {
                baseBoolIntDto13 = baseBoolIntDto41;
                createFromParcel15 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto42 = createFromParcel15;
            if (parcel.readInt() == 0) {
                baseBoolIntDto14 = baseBoolIntDto42;
                createFromParcel16 = null;
            } else {
                baseBoolIntDto14 = baseBoolIntDto42;
                createFromParcel16 = GroupsOnlineStatusDto.CREATOR.createFromParcel(parcel);
            }
            GroupsOnlineStatusDto groupsOnlineStatusDto2 = createFromParcel16;
            Integer valueOf69 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                groupsOnlineStatusDto = groupsOnlineStatusDto2;
                createFromParcel17 = null;
            } else {
                groupsOnlineStatusDto = groupsOnlineStatusDto2;
                createFromParcel17 = GroupsGroupFullAgeLimitsDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto2 = createFromParcel17;
            if (parcel.readInt() == 0) {
                groupsGroupFullAgeLimitsDto = groupsGroupFullAgeLimitsDto2;
                createFromParcel18 = null;
            } else {
                groupsGroupFullAgeLimitsDto = groupsGroupFullAgeLimitsDto2;
                createFromParcel18 = GroupsGroupFullAgeMarkDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto2 = createFromParcel18;
            if (parcel.readInt() == 0) {
                groupsGroupFullAgeMarkDto = groupsGroupFullAgeMarkDto2;
                createFromParcel19 = null;
            } else {
                groupsGroupFullAgeMarkDto = groupsGroupFullAgeMarkDto2;
                createFromParcel19 = GroupsGroupBanInfoDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupBanInfoDto groupsGroupBanInfoDto2 = createFromParcel19;
            if (parcel.readInt() == 0) {
                groupsGroupBanInfoDto = groupsGroupBanInfoDto2;
                createFromParcel20 = null;
            } else {
                groupsGroupBanInfoDto = groupsGroupBanInfoDto2;
                createFromParcel20 = GroupsActionButtonDto.CREATOR.createFromParcel(parcel);
            }
            GroupsActionButtonDto groupsActionButtonDto = createFromParcel20;
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
            Object readValue = parcel.readValue(cls.getClassLoader());
            Integer valueOf72 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                obj = readValue;
                createFromParcel21 = null;
            } else {
                obj = readValue;
                createFromParcel21 = GroupsAddressesInfoDto.CREATOR.createFromParcel(parcel);
            }
            GroupsAddressesInfoDto groupsAddressesInfoDto2 = createFromParcel21;
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
            if (parcel.readInt() == 0) {
                groupsAddressesInfoDto = groupsAddressesInfoDto2;
                createFromParcel22 = null;
            } else {
                groupsAddressesInfoDto = groupsAddressesInfoDto2;
                createFromParcel22 = GroupsLiveCoversDto.CREATOR.createFromParcel(parcel);
            }
            GroupsLiveCoversDto groupsLiveCoversDto2 = createFromParcel22;
            if (parcel.readInt() == 0) {
                groupsLiveCoversDto = groupsLiveCoversDto2;
                createFromParcel23 = null;
            } else {
                groupsLiveCoversDto = groupsLiveCoversDto2;
                createFromParcel23 = GroupsVkAdminStatusDto.CREATOR.createFromParcel(parcel);
            }
            GroupsVkAdminStatusDto groupsVkAdminStatusDto2 = createFromParcel23;
            if (parcel.readInt() == 0) {
                groupsVkAdminStatusDto = groupsVkAdminStatusDto2;
                createFromParcel24 = null;
            } else {
                groupsVkAdminStatusDto = groupsVkAdminStatusDto2;
                createFromParcel24 = GroupsMenuDto.CREATOR.createFromParcel(parcel);
            }
            GroupsMenuDto groupsMenuDto2 = createFromParcel24;
            if (parcel.readInt() == 0) {
                groupsMenuDto = groupsMenuDto2;
                createFromParcel25 = null;
            } else {
                groupsMenuDto = groupsMenuDto2;
                createFromParcel25 = GroupsWarningNotificationDto.CREATOR.createFromParcel(parcel);
            }
            GroupsWarningNotificationDto groupsWarningNotificationDto2 = createFromParcel25;
            Integer valueOf73 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                groupsWarningNotificationDto = groupsWarningNotificationDto2;
                createFromParcel26 = null;
            } else {
                groupsWarningNotificationDto = groupsWarningNotificationDto2;
                createFromParcel26 = GroupsGroupDonutDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupDonutDto groupsGroupDonutDto2 = createFromParcel26;
            if (parcel.readInt() == 0) {
                groupsGroupDonutDto = groupsGroupDonutDto2;
                createFromParcel27 = null;
            } else {
                groupsGroupDonutDto = groupsGroupDonutDto2;
                createFromParcel27 = GroupsGroupVkTicketDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupVkTicketDto groupsGroupVkTicketDto2 = createFromParcel27;
            if (parcel.readInt() == 0) {
                groupsGroupVkTicketDto = groupsGroupVkTicketDto2;
                createFromParcel28 = null;
            } else {
                groupsGroupVkTicketDto = groupsGroupVkTicketDto2;
                createFromParcel28 = GroupsGroupDonutBlockDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupDonutBlockDto groupsGroupDonutBlockDto2 = createFromParcel28;
            if (parcel.readInt() == 0) {
                groupsGroupDonutBlockDto = groupsGroupDonutBlockDto2;
                createFromParcel29 = null;
            } else {
                groupsGroupDonutBlockDto = groupsGroupDonutBlockDto2;
                createFromParcel29 = GroupsDonutCommunityManagementDto.CREATOR.createFromParcel(parcel);
            }
            GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto2 = createFromParcel29;
            if (parcel.readInt() == 0) {
                groupsDonutCommunityManagementDto = groupsDonutCommunityManagementDto2;
                createFromParcel30 = null;
            } else {
                groupsDonutCommunityManagementDto = groupsDonutCommunityManagementDto2;
                createFromParcel30 = GroupsGroupDonutPaymentInfoDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto2 = createFromParcel30;
            Integer valueOf74 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsGroupDonutPaymentInfoDto = groupsGroupDonutPaymentInfoDto2;
                createFromParcel31 = null;
            } else {
                groupsGroupDonutPaymentInfoDto = groupsGroupDonutPaymentInfoDto2;
                createFromParcel31 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto43 = createFromParcel31;
            if (parcel.readInt() == 0) {
                baseBoolIntDto15 = baseBoolIntDto43;
                createFromParcel32 = null;
            } else {
                baseBoolIntDto15 = baseBoolIntDto43;
                createFromParcel32 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto44 = createFromParcel32;
            if (parcel.readInt() == 0) {
                baseBoolIntDto16 = baseBoolIntDto44;
                createFromParcel33 = null;
            } else {
                baseBoolIntDto16 = baseBoolIntDto44;
                createFromParcel33 = GroupsChatsStatusDto.CREATOR.createFromParcel(parcel);
            }
            GroupsChatsStatusDto groupsChatsStatusDto2 = createFromParcel33;
            if (parcel.readInt() == 0) {
                groupsChatsStatusDto = groupsChatsStatusDto2;
                createFromParcel34 = null;
            } else {
                groupsChatsStatusDto = groupsChatsStatusDto2;
                createFromParcel34 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto45 = createFromParcel34;
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
                baseBoolIntDto17 = baseBoolIntDto45;
                createFromParcel35 = null;
            } else {
                baseBoolIntDto17 = baseBoolIntDto45;
                createFromParcel35 = TrustMarkDto.CREATOR.createFromParcel(parcel);
            }
            TrustMarkDto trustMarkDto2 = createFromParcel35;
            if (parcel.readInt() == 0) {
                trustMarkDto = trustMarkDto2;
                createFromParcel36 = null;
            } else {
                trustMarkDto = trustMarkDto2;
                createFromParcel36 = GroupsMicrolandingDto.CREATOR.createFromParcel(parcel);
            }
            GroupsMicrolandingDto groupsMicrolandingDto2 = createFromParcel36;
            if (parcel.readInt() == 0) {
                groupsMicrolandingDto = groupsMicrolandingDto2;
                createFromParcel37 = null;
            } else {
                groupsMicrolandingDto = groupsMicrolandingDto2;
                createFromParcel37 = GroupsTariffsDto.CREATOR.createFromParcel(parcel);
            }
            GroupsTariffsDto groupsTariffsDto2 = createFromParcel37;
            Integer valueOf76 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf20 = null;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsTariffsDto = groupsTariffsDto2;
                createFromParcel38 = null;
            } else {
                groupsTariffsDto = groupsTariffsDto2;
                createFromParcel38 = DisallowManageReasonDto.CREATOR.createFromParcel(parcel);
            }
            DisallowManageReasonDto disallowManageReasonDto2 = createFromParcel38;
            BaseBoolIntDto baseBoolIntDto46 = baseBoolIntDto11;
            BaseBoolIntDto baseBoolIntDto47 = baseBoolIntDto13;
            GroupsOnlineStatusDto groupsOnlineStatusDto3 = groupsOnlineStatusDto;
            GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto3 = groupsGroupFullAgeMarkDto;
            Integer num4 = valueOf72;
            GroupsAddressesInfoDto groupsAddressesInfoDto3 = groupsAddressesInfoDto;
            GroupsVkAdminStatusDto groupsVkAdminStatusDto3 = groupsVkAdminStatusDto;
            GroupsWarningNotificationDto groupsWarningNotificationDto3 = groupsWarningNotificationDto;
            GroupsGroupVkTicketDto groupsGroupVkTicketDto3 = groupsGroupVkTicketDto;
            GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto3 = groupsDonutCommunityManagementDto;
            Integer num5 = valueOf74;
            Boolean bool5 = valueOf16;
            BaseBoolIntDto baseBoolIntDto48 = baseBoolIntDto15;
            GroupsChatsStatusDto groupsChatsStatusDto3 = groupsChatsStatusDto;
            Float f = valueOf75;
            Boolean bool6 = valueOf17;
            Boolean bool7 = valueOf18;
            Boolean bool8 = valueOf19;
            TrustMarkDto trustMarkDto3 = trustMarkDto;
            GroupsTariffsDto groupsTariffsDto3 = groupsTariffsDto;
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                disallowManageReasonDto = disallowManageReasonDto2;
                createFromParcel39 = null;
            } else {
                disallowManageReasonDto = disallowManageReasonDto2;
                createFromParcel39 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto49 = createFromParcel39;
            if (parcel.readInt() == 0) {
                baseBoolIntDto18 = baseBoolIntDto49;
                createFromParcel40 = null;
            } else {
                baseBoolIntDto18 = baseBoolIntDto49;
                createFromParcel40 = GroupsGroupFullShowSuggestionsDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto2 = createFromParcel40;
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
            if (parcel.readInt() == 0) {
                groupsGroupFullShowSuggestionsDto = groupsGroupFullShowSuggestionsDto2;
                createFromParcel41 = null;
            } else {
                groupsGroupFullShowSuggestionsDto = groupsGroupFullShowSuggestionsDto2;
                createFromParcel41 = GroupsAdsEasyPromoteDto.CREATOR.createFromParcel(parcel);
            }
            GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = createFromParcel41;
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
            Object readValue2 = parcel.readValue(cls.getClassLoader());
            Object readValue3 = parcel.readValue(cls.getClassLoader());
            Object readValue4 = parcel.readValue(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue5 = parcel.readValue(cls.getClassLoader());
            Object readValue6 = parcel.readValue(cls.getClassLoader());
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
            if (parcel.readInt() == 0) {
                obj2 = readValue6;
                createFromParcel42 = null;
            } else {
                obj2 = readValue6;
                createFromParcel42 = GroupsGroupLikeItemDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupLikeItemDto groupsGroupLikeItemDto2 = createFromParcel42;
            if (parcel.readInt() == 0) {
                groupsGroupLikeItemDto = groupsGroupLikeItemDto2;
                createFromParcel43 = null;
            } else {
                groupsGroupLikeItemDto = groupsGroupLikeItemDto2;
                createFromParcel43 = GroupsLoginConfirmationStatusDto.CREATOR.createFromParcel(parcel);
            }
            GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto2 = createFromParcel43;
            if (parcel.readInt() == 0) {
                valueOf27 = null;
            } else {
                valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf84 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf85 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf86 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf87 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                groupsLoginConfirmationStatusDto = groupsLoginConfirmationStatusDto2;
                createFromParcel44 = null;
            } else {
                groupsLoginConfirmationStatusDto = groupsLoginConfirmationStatusDto2;
                createFromParcel44 = GroupsGroupFriendsDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupFriendsDto groupsGroupFriendsDto2 = createFromParcel44;
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                groupsGroupFriendsDto = groupsGroupFriendsDto2;
                createFromParcel45 = null;
            } else {
                groupsGroupFriendsDto = groupsGroupFriendsDto2;
                createFromParcel45 = DeactivatedTypeDto.CREATOR.createFromParcel(parcel);
            }
            DeactivatedTypeDto deactivatedTypeDto2 = createFromParcel45;
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
            if (parcel.readInt() == 0) {
                deactivatedTypeDto = deactivatedTypeDto2;
                createFromParcel46 = null;
            } else {
                deactivatedTypeDto = deactivatedTypeDto2;
                createFromParcel46 = MarketCommunityRatingDto.CREATOR.createFromParcel(parcel);
            }
            MarketCommunityRatingDto marketCommunityRatingDto2 = createFromParcel46;
            if (parcel.readInt() == 0) {
                marketCommunityRatingDto = marketCommunityRatingDto2;
                createFromParcel47 = null;
            } else {
                marketCommunityRatingDto = marketCommunityRatingDto2;
                createFromParcel47 = GroupsGroupNameHistoryDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupNameHistoryDto groupsGroupNameHistoryDto2 = createFromParcel47;
            if (parcel.readInt() == 0) {
                groupsGroupNameHistoryDto = groupsGroupNameHistoryDto2;
                createFromParcel48 = null;
            } else {
                groupsGroupNameHistoryDto = groupsGroupNameHistoryDto2;
                createFromParcel48 = MarketCommunityServiceRatingDto.CREATOR.createFromParcel(parcel);
            }
            MarketCommunityServiceRatingDto marketCommunityServiceRatingDto2 = createFromParcel48;
            if (parcel.readInt() == 0) {
                marketCommunityServiceRatingDto = marketCommunityServiceRatingDto2;
                createFromParcel49 = null;
            } else {
                marketCommunityServiceRatingDto = marketCommunityServiceRatingDto2;
                createFromParcel49 = GroupsRecommendedTipsWidgetDto.CREATOR.createFromParcel(parcel);
            }
            GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto2 = createFromParcel49;
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
            if (parcel.readInt() == 0) {
                groupsRecommendedTipsWidgetDto = groupsRecommendedTipsWidgetDto2;
                createFromParcel50 = null;
            } else {
                groupsRecommendedTipsWidgetDto = groupsRecommendedTipsWidgetDto2;
                createFromParcel50 = GroupsAdsPostsInfoDto.CREATOR.createFromParcel(parcel);
            }
            GroupsAdsPostsInfoDto groupsAdsPostsInfoDto2 = createFromParcel50;
            String readString19 = parcel.readString();
            if (parcel.readInt() == 0) {
                groupsAdsPostsInfoDto = groupsAdsPostsInfoDto2;
                createFromParcel51 = null;
            } else {
                groupsAdsPostsInfoDto = groupsAdsPostsInfoDto2;
                createFromParcel51 = GroupsBannerDto.CREATOR.createFromParcel(parcel);
            }
            GroupsBannerDto groupsBannerDto4 = createFromParcel51;
            if (parcel.readInt() == 0) {
                groupsBannerDto = groupsBannerDto4;
                createFromParcel52 = null;
            } else {
                groupsBannerDto = groupsBannerDto4;
                createFromParcel52 = GroupsBannerDto.CREATOR.createFromParcel(parcel);
            }
            GroupsBannerDto groupsBannerDto5 = createFromParcel52;
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                groupsBannerDto2 = groupsBannerDto5;
                createFromParcel53 = null;
            } else {
                groupsBannerDto2 = groupsBannerDto5;
                createFromParcel53 = LeaveModeDto.CREATOR.createFromParcel(parcel);
            }
            LeaveModeDto leaveModeDto2 = createFromParcel53;
            if (parcel.readInt() == 0) {
                leaveModeDto = leaveModeDto2;
                createFromParcel54 = null;
            } else {
                leaveModeDto = leaveModeDto2;
                createFromParcel54 = GroupsBannerDto.CREATOR.createFromParcel(parcel);
            }
            GroupsBannerDto groupsBannerDto6 = createFromParcel54;
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
                groupsBannerDto3 = groupsBannerDto6;
                createFromParcel55 = null;
            } else {
                groupsBannerDto3 = groupsBannerDto6;
                createFromParcel55 = VideoNotificationsStatusDto.CREATOR.createFromParcel(parcel);
            }
            VideoNotificationsStatusDto videoNotificationsStatusDto2 = createFromParcel55;
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
            if (parcel.readInt() == 0) {
                videoNotificationsStatusDto = videoNotificationsStatusDto2;
                createFromParcel56 = null;
            } else {
                videoNotificationsStatusDto = videoNotificationsStatusDto2;
                createFromParcel56 = GroupsWorkGroupInfoDto.CREATOR.createFromParcel(parcel);
            }
            GroupsWorkGroupInfoDto groupsWorkGroupInfoDto2 = createFromParcel56;
            String readString21 = parcel.readString();
            if (parcel.readInt() == 0) {
                groupsWorkGroupInfoDto = groupsWorkGroupInfoDto2;
                createFromParcel57 = null;
            } else {
                groupsWorkGroupInfoDto = groupsWorkGroupInfoDto2;
                createFromParcel57 = GroupsGroupFullMembersPreviewDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto2 = createFromParcel57;
            if (parcel.readInt() == 0) {
                groupsGroupFullMembersPreviewDto = groupsGroupFullMembersPreviewDto2;
                createFromParcel58 = null;
            } else {
                groupsGroupFullMembersPreviewDto = groupsGroupFullMembersPreviewDto2;
                createFromParcel58 = GroupsStrikesInfoDto.CREATOR.createFromParcel(parcel);
            }
            GroupsStrikesInfoDto groupsStrikesInfoDto2 = createFromParcel58;
            if (parcel.readInt() == 0) {
                groupsStrikesInfoDto = groupsStrikesInfoDto2;
                createFromParcel59 = null;
            } else {
                groupsStrikesInfoDto = groupsStrikesInfoDto2;
                createFromParcel59 = GroupsStrikesRestrictionsDto.CREATOR.createFromParcel(parcel);
            }
            GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto2 = createFromParcel59;
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
                groupsPrimaryBlockSettingsDto = createFromParcel91;
                arrayList4 = arrayList2;
                arrayList3 = null;
            } else {
                groupsStrikesRestrictionsDto = groupsStrikesRestrictionsDto2;
                int readInt3 = parcel.readInt();
                groupsPrimaryBlockSettingsDto = createFromParcel91;
                arrayList3 = new ArrayList(readInt3);
                arrayList4 = arrayList2;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(GroupsTabSettingsDto.CREATOR, parcel, arrayList3, i3, 1);
                    readInt3 = readInt3;
                    createFromParcel90 = createFromParcel90;
                }
            }
            GroupsGroupFullSectionDto groupsGroupFullSectionDto = createFromParcel90;
            Integer valueOf88 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf89 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsSimpleButtonDto createFromParcel92 = parcel.readInt() == 0 ? null : GroupsSimpleButtonDto.CREATOR.createFromParcel(parcel);
            BaseAPlusMarkDto createFromParcel93 = parcel.readInt() == 0 ? null : BaseAPlusMarkDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num = valueOf88;
                arrayList5 = arrayList3;
                num2 = valueOf89;
                arrayList6 = null;
            } else {
                num = valueOf88;
                int readInt4 = parcel.readInt();
                arrayList5 = arrayList3;
                arrayList6 = new ArrayList(readInt4);
                num2 = valueOf89;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(ServiceBookingRepeatRecordDto.CREATOR, parcel, arrayList6, i4, 1);
                    readInt4 = readInt4;
                    createFromParcel93 = createFromParcel93;
                }
            }
            BaseAPlusMarkDto baseAPlusMarkDto = createFromParcel93;
            GroupsChannelInfoDto createFromParcel94 = parcel.readInt() == 0 ? null : GroupsChannelInfoDto.CREATOR.createFromParcel(parcel);
            GroupsChannelBlockDto createFromParcel95 = parcel.readInt() == 0 ? null : GroupsChannelBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf45 = null;
            } else {
                valueOf45 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsEventOrganizerDto createFromParcel96 = parcel.readInt() == 0 ? null : GroupsEventOrganizerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                groupsChannelInfoDto = createFromParcel94;
                createFromParcel60 = null;
            } else {
                groupsChannelInfoDto = createFromParcel94;
                createFromParcel60 = GroupsVideoChannelDataDto.CREATOR.createFromParcel(parcel);
            }
            GroupsVideoChannelDataDto groupsVideoChannelDataDto2 = createFromParcel60;
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
            if (parcel.readInt() == 0) {
                groupsVideoChannelDataDto = groupsVideoChannelDataDto2;
                createFromParcel61 = null;
            } else {
                groupsVideoChannelDataDto = groupsVideoChannelDataDto2;
                createFromParcel61 = GroupsContentSectionsDataDto.CREATOR.createFromParcel(parcel);
            }
            GroupsContentSectionsDataDto groupsContentSectionsDataDto2 = createFromParcel61;
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            if (parcel.readInt() == 0) {
                groupsContentSectionsDataDto = groupsContentSectionsDataDto2;
                createFromParcel62 = null;
            } else {
                groupsContentSectionsDataDto = groupsContentSectionsDataDto2;
                createFromParcel62 = GroupsGroupIsClosedDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupIsClosedDto groupsGroupIsClosedDto2 = createFromParcel62;
            if (parcel.readInt() == 0) {
                groupsGroupIsClosedDto = groupsGroupIsClosedDto2;
                createFromParcel63 = null;
            } else {
                groupsGroupIsClosedDto = groupsGroupIsClosedDto2;
                createFromParcel63 = GroupsGroupTypeDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupTypeDto groupsGroupTypeDto2 = createFromParcel63;
            if (parcel.readInt() == 0) {
                groupsGroupTypeDto = groupsGroupTypeDto2;
                createFromParcel64 = null;
            } else {
                groupsGroupTypeDto = groupsGroupTypeDto2;
                createFromParcel64 = ChannelsChannelTypeDto.CREATOR.createFromParcel(parcel);
            }
            ChannelsChannelTypeDto channelsChannelTypeDto2 = createFromParcel64;
            if (parcel.readInt() == 0) {
                channelsChannelTypeDto = channelsChannelTypeDto2;
                createFromParcel65 = null;
            } else {
                channelsChannelTypeDto = channelsChannelTypeDto2;
                createFromParcel65 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto50 = createFromParcel65;
            if (parcel.readInt() == 0) {
                baseBoolIntDto19 = baseBoolIntDto50;
                createFromParcel66 = null;
            } else {
                baseBoolIntDto19 = baseBoolIntDto50;
                createFromParcel66 = GroupsGroupAdminLevelDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupAdminLevelDto groupsGroupAdminLevelDto2 = createFromParcel66;
            if (parcel.readInt() == 0) {
                groupsGroupAdminLevelDto = groupsGroupAdminLevelDto2;
                createFromParcel67 = null;
            } else {
                groupsGroupAdminLevelDto = groupsGroupAdminLevelDto2;
                createFromParcel67 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto51 = createFromParcel67;
            if (parcel.readInt() == 0) {
                baseBoolIntDto20 = baseBoolIntDto51;
                createFromParcel68 = null;
            } else {
                baseBoolIntDto20 = baseBoolIntDto51;
                createFromParcel68 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto52 = createFromParcel68;
            Integer valueOf90 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf91 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto21 = baseBoolIntDto52;
                createFromParcel69 = null;
            } else {
                baseBoolIntDto21 = baseBoolIntDto52;
                createFromParcel69 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto53 = createFromParcel69;
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
            if (parcel.readInt() == 0) {
                baseBoolIntDto22 = baseBoolIntDto53;
                createFromParcel70 = null;
            } else {
                baseBoolIntDto22 = baseBoolIntDto53;
                createFromParcel70 = GroupsPhotoSizeDto.CREATOR.createFromParcel(parcel);
            }
            GroupsPhotoSizeDto groupsPhotoSizeDto2 = createFromParcel70;
            if (parcel.readInt() == 0) {
                groupsPhotoSizeDto = groupsPhotoSizeDto2;
                createFromParcel71 = null;
            } else {
                groupsPhotoSizeDto = groupsPhotoSizeDto2;
                createFromParcel71 = GroupsAppButtonDto.CREATOR.createFromParcel(parcel);
            }
            GroupsAppButtonDto groupsAppButtonDto2 = createFromParcel71;
            if (parcel.readInt() == 0) {
                groupsAppButtonDto = groupsAppButtonDto2;
                arrayList7 = arrayList6;
                groupsChannelBlockDto = createFromParcel95;
                arrayList8 = null;
            } else {
                groupsAppButtonDto = groupsAppButtonDto2;
                int readInt5 = parcel.readInt();
                arrayList7 = arrayList6;
                arrayList8 = new ArrayList(readInt5);
                groupsChannelBlockDto = createFromParcel95;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(GroupsAppButtonDto.CREATOR, parcel, arrayList8, i5, 1);
                    readInt5 = readInt5;
                    createFromParcel96 = createFromParcel96;
                }
            }
            GroupsEventOrganizerDto groupsEventOrganizerDto = createFromParcel96;
            BaseBoolIntDto createFromParcel97 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            VideoLiveInfoDto createFromParcel98 = parcel.readInt() == 0 ? null : VideoLiveInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf49 = null;
            } else {
                valueOf49 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsEventOrganizerDto groupsEventOrganizerDto2 = groupsEventOrganizerDto;
            String readString36 = parcel.readString();
            Integer valueOf92 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto23 = createFromParcel97;
                arrayList9 = arrayList8;
                videoLiveInfoDto = createFromParcel98;
                arrayList10 = null;
            } else {
                baseBoolIntDto23 = createFromParcel97;
                int readInt6 = parcel.readInt();
                arrayList9 = arrayList8;
                arrayList10 = new ArrayList(readInt6);
                videoLiveInfoDto = createFromParcel98;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = en.a(BaseOwnerButtonDto.CREATOR, parcel, arrayList10, i6, 1);
                    readInt6 = readInt6;
                    groupsEventOrganizerDto2 = groupsEventOrganizerDto2;
                }
            }
            GroupsEventOrganizerDto groupsEventOrganizerDto3 = groupsEventOrganizerDto2;
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
            GroupsMarketInfoDto createFromParcel99 = parcel.readInt() == 0 ? null : GroupsMarketInfoDto.CREATOR.createFromParcel(parcel);
            GroupsMarketServicesInfoDto createFromParcel100 = parcel.readInt() == 0 ? null : GroupsMarketServicesInfoDto.CREATOR.createFromParcel(parcel);
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
            if (parcel.readInt() == 0) {
                bool2 = valueOf50;
                createFromParcel72 = null;
            } else {
                bool2 = valueOf50;
                createFromParcel72 = GroupsGroupExtendedMarketSectionsDto.CREATOR.createFromParcel(parcel);
            }
            GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto2 = createFromParcel72;
            if (parcel.readInt() == 0) {
                groupsGroupExtendedMarketSectionsDto = groupsGroupExtendedMarketSectionsDto2;
                createFromParcel73 = null;
            } else {
                groupsGroupExtendedMarketSectionsDto = groupsGroupExtendedMarketSectionsDto2;
                createFromParcel73 = GroupsMarketShopConditionsStateDto.CREATOR.createFromParcel(parcel);
            }
            GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto2 = createFromParcel73;
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
                createFromParcel74 = null;
            } else {
                groupsMarketShopConditionsStateDto = groupsMarketShopConditionsStateDto2;
                createFromParcel74 = YoulaStatusDto.CREATOR.createFromParcel(parcel);
            }
            YoulaStatusDto youlaStatusDto2 = createFromParcel74;
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
            if (parcel.readInt() == 0) {
                youlaStatusDto = youlaStatusDto2;
                createFromParcel75 = null;
            } else {
                youlaStatusDto = youlaStatusDto2;
                createFromParcel75 = YoulaPostingMethodDto.CREATOR.createFromParcel(parcel);
            }
            return new GroupsGroupFullDto(userId2, createFromParcel76, createFromParcel77, createFromParcel78, createFromParcel79, createFromParcel80, createFromParcel81, createFromParcel82, readString, readString2, valueOf62, readString3, valueOf63, createFromParcel83, valueOf64, valueOf65, valueOf66, createFromParcel84, createFromParcel85, createFromParcel86, createFromParcel87, readString4, readString5, readString6, readString7, bool, bool4, baseBoolIntDto38, baseBoolIntDto32, baseBoolIntDto2, bool3, baseBoolIntDto33, baseBoolIntDto4, baseBoolIntDto34, baseBoolIntDto6, baseBoolIntDto35, baseBoolIntDto8, readString8, num3, baseBoolIntDto37, baseCropPhotoDto, readString9, audioAudioDto, valueOf68, arrayList11, arrayList4, wallDto, readString10, valueOf4, groupsGroupFullSectionDto, groupsPrimaryBlockSettingsDto, baseBoolIntDto46, baseBoolIntDto12, baseBoolIntDto47, baseBoolIntDto14, groupsOnlineStatusDto3, valueOf69, groupsGroupFullAgeLimitsDto, groupsGroupFullAgeMarkDto3, groupsGroupBanInfoDto, groupsActionButtonDto, valueOf70, readString11, valueOf5, valueOf6, valueOf71, valueOf7, obj, num4, groupsAddressesInfoDto3, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, groupsLiveCoversDto, groupsVkAdminStatusDto3, groupsMenuDto, groupsWarningNotificationDto3, valueOf73, groupsGroupDonutDto, groupsGroupVkTicketDto3, groupsGroupDonutBlockDto, groupsDonutCommunityManagementDto3, groupsGroupDonutPaymentInfoDto, num5, bool5, baseBoolIntDto48, baseBoolIntDto16, groupsChatsStatusDto3, baseBoolIntDto17, f, readString12, bool6, bool7, bool8, trustMarkDto3, groupsMicrolandingDto, groupsTariffsDto3, valueOf76, valueOf20, disallowManageReasonDto, readString13, baseBoolIntDto18, groupsGroupFullShowSuggestionsDto, valueOf21, valueOf22, valueOf77, groupsAdsEasyPromoteDto, valueOf23, valueOf78, valueOf24, readValue2, readValue3, readValue4, valueOf25, readValue5, obj2, valueOf26, valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, groupsGroupLikeItemDto, groupsLoginConfirmationStatusDto, valueOf27, valueOf84, valueOf85, valueOf86, valueOf87, groupsGroupFriendsDto, readString14, deactivatedTypeDto, readString15, valueOf28, valueOf29, valueOf30, marketCommunityRatingDto, groupsGroupNameHistoryDto, marketCommunityServiceRatingDto, groupsRecommendedTipsWidgetDto, readString16, readString17, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, readString18, groupsAdsPostsInfoDto, readString19, groupsBannerDto, groupsBannerDto2, valueOf36, leaveModeDto, groupsBannerDto3, valueOf37, valueOf38, videoNotificationsStatusDto, valueOf39, valueOf40, readString20, valueOf41, groupsWorkGroupInfoDto, readString21, groupsGroupFullMembersPreviewDto, groupsStrikesInfoDto, groupsStrikesRestrictionsDto, valueOf42, createStringArrayList, valueOf43, valueOf44, arrayList5, num, num2, createFromParcel92, baseAPlusMarkDto, arrayList7, groupsChannelInfoDto, groupsChannelBlockDto, valueOf45, groupsEventOrganizerDto3, groupsVideoChannelDataDto, valueOf46, valueOf47, valueOf48, groupsContentSectionsDataDto, readString22, readString23, groupsGroupIsClosedDto, groupsGroupTypeDto, channelsChannelTypeDto, baseBoolIntDto19, groupsGroupAdminLevelDto, baseBoolIntDto20, baseBoolIntDto21, valueOf90, valueOf91, baseBoolIntDto22, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, groupsPhotoSizeDto, groupsAppButtonDto, arrayList9, baseBoolIntDto23, videoLiveInfoDto, valueOf49, readString36, valueOf92, arrayList10, bool2, valueOf51, createFromParcel99, createFromParcel100, valueOf52, valueOf53, valueOf54, groupsGroupExtendedMarketSectionsDto, groupsMarketShopConditionsStateDto, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, youlaStatusDto, valueOf60, readString37, valueOf93, valueOf61, createFromParcel75);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GroupsGroupFullDto createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullDto[] newArray(int i) {
            return new GroupsGroupFullDto[i];
        }
    }

    public GroupsGroupFullDto(UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str, String str2, Integer num, String str3, Integer num2, AudioMusicAwardsDto audioMusicAwardsDto, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseOwnerCoverDto baseOwnerCoverDto2, GroupsVideoLivesDataDto groupsVideoLivesDataDto, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool3, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str8, Integer num6, BaseBoolIntDto baseBoolIntDto14, BaseCropPhotoDto baseCropPhotoDto, String str9, AudioAudioDto audioAudioDto, Integer num7, List<GroupsLinksItemDto> list, List<GroupsContactsItemDto> list2, WallDto wallDto, String str10, Boolean bool4, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, GroupsActionButtonDto groupsActionButtonDto, Integer num9, String str11, Boolean bool5, Boolean bool6, Integer num10, Boolean bool7, Object obj, Integer num11, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, GroupsLiveCoversDto groupsLiveCoversDto, GroupsVkAdminStatusDto groupsVkAdminStatusDto, GroupsMenuDto groupsMenuDto, GroupsWarningNotificationDto groupsWarningNotificationDto, Integer num12, GroupsGroupDonutDto groupsGroupDonutDto, GroupsGroupVkTicketDto groupsGroupVkTicketDto, GroupsGroupDonutBlockDto groupsGroupDonutBlockDto, GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto, GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto, Integer num13, Boolean bool16, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, GroupsChatsStatusDto groupsChatsStatusDto, BaseBoolIntDto baseBoolIntDto21, Float f, String str12, Boolean bool17, Boolean bool18, Boolean bool19, TrustMarkDto trustMarkDto, GroupsMicrolandingDto groupsMicrolandingDto, GroupsTariffsDto groupsTariffsDto, Integer num14, Boolean bool20, DisallowManageReasonDto disallowManageReasonDto, String str13, BaseBoolIntDto baseBoolIntDto22, GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto, Boolean bool21, Boolean bool22, Integer num15, GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto, Boolean bool23, Integer num16, Boolean bool24, Object obj2, Object obj3, Object obj4, Boolean bool25, Object obj5, Object obj6, Boolean bool26, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, GroupsGroupLikeItemDto groupsGroupLikeItemDto, GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto, Boolean bool27, Integer num22, Integer num23, Integer num24, Integer num25, GroupsGroupFriendsDto groupsGroupFriendsDto, String str14, DeactivatedTypeDto deactivatedTypeDto, String str15, Boolean bool28, Boolean bool29, Boolean bool30, MarketCommunityRatingDto marketCommunityRatingDto, GroupsGroupNameHistoryDto groupsGroupNameHistoryDto, MarketCommunityServiceRatingDto marketCommunityServiceRatingDto, GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto, String str16, String str17, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str18, GroupsAdsPostsInfoDto groupsAdsPostsInfoDto, String str19, GroupsBannerDto groupsBannerDto, GroupsBannerDto groupsBannerDto2, Boolean bool36, LeaveModeDto leaveModeDto, GroupsBannerDto groupsBannerDto3, Boolean bool37, Boolean bool38, VideoNotificationsStatusDto videoNotificationsStatusDto, Boolean bool39, Boolean bool40, String str20, Boolean bool41, GroupsWorkGroupInfoDto groupsWorkGroupInfoDto, String str21, GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto, GroupsStrikesInfoDto groupsStrikesInfoDto, GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto, Boolean bool42, List<String> list3, Boolean bool43, Boolean bool44, List<GroupsTabSettingsDto> list4, Integer num26, Integer num27, GroupsSimpleButtonDto groupsSimpleButtonDto, BaseAPlusMarkDto baseAPlusMarkDto, List<ServiceBookingRepeatRecordDto> list5, GroupsChannelInfoDto groupsChannelInfoDto, GroupsChannelBlockDto groupsChannelBlockDto, Boolean bool45, GroupsEventOrganizerDto groupsEventOrganizerDto, GroupsVideoChannelDataDto groupsVideoChannelDataDto, Boolean bool46, Boolean bool47, Boolean bool48, GroupsContentSectionsDataDto groupsContentSectionsDataDto, String str22, String str23, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto23, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, Integer num28, Integer num29, BaseBoolIntDto baseBoolIntDto26, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List<GroupsAppButtonDto> list6, BaseBoolIntDto baseBoolIntDto27, VideoLiveInfoDto videoLiveInfoDto, Boolean bool49, String str36, Integer num30, List<BaseOwnerButtonDto> list7, Boolean bool50, Boolean bool51, GroupsMarketInfoDto groupsMarketInfoDto, GroupsMarketServicesInfoDto groupsMarketServicesInfoDto, Boolean bool52, Boolean bool53, Boolean bool54, GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto, GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, YoulaStatusDto youlaStatusDto, Boolean bool60, String str37, Integer num31, Boolean bool61, YoulaPostingMethodDto youlaPostingMethodDto) {
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

    public static GroupsGroupFullDto a(GroupsGroupFullDto groupsGroupFullDto, UserId userId) {
        return new GroupsGroupFullDto(userId, groupsGroupFullDto.memberStatus, groupsGroupFullDto.isAdult, groupsGroupFullDto.isHiddenFromFeed, groupsGroupFullDto.isFavorite, groupsGroupFullDto.isSubscribed, groupsGroupFullDto.city, groupsGroupFullDto.country, groupsGroupFullDto.description, groupsGroupFullDto.wikiPage, groupsGroupFullDto.membersCount, groupsGroupFullDto.membersCountText, groupsGroupFullDto.requestsCount, groupsGroupFullDto.musicAwards, groupsGroupFullDto.videoLiveLevel, groupsGroupFullDto.videoLiveCount, groupsGroupFullDto.clipsCount, groupsGroupFullDto.counters, groupsGroupFullDto.cover, groupsGroupFullDto.videoCover, groupsGroupFullDto.videoLivesData, groupsGroupFullDto.photoAvgColor, groupsGroupFullDto.inn, groupsGroupFullDto.ogrn, groupsGroupFullDto.kpp, groupsGroupFullDto.hasLiveCover, groupsGroupFullDto.hasStories, groupsGroupFullDto.canPost, groupsGroupFullDto.canSuggest, groupsGroupFullDto.canUploadStory, groupsGroupFullDto.canCallToCommunity, groupsGroupFullDto.canUploadDoc, groupsGroupFullDto.canUploadVideo, groupsGroupFullDto.canUploadVideoThumb, groupsGroupFullDto.canUploadClip, groupsGroupFullDto.canSeeAllPosts, groupsGroupFullDto.canCreateTopic, groupsGroupFullDto.activity, groupsGroupFullDto.fixedPost, groupsGroupFullDto.hasPhoto, groupsGroupFullDto.cropPhoto, groupsGroupFullDto.status, groupsGroupFullDto.statusAudio, groupsGroupFullDto.mainAlbumId, groupsGroupFullDto.links, groupsGroupFullDto.contacts, groupsGroupFullDto.wall, groupsGroupFullDto.site, groupsGroupFullDto.isSiteDisplayed, groupsGroupFullDto.mainSection, groupsGroupFullDto.primaryBlock, groupsGroupFullDto.trending, groupsGroupFullDto.canMessage, groupsGroupFullDto.isMessagesBlocked, groupsGroupFullDto.canSendNotify, groupsGroupFullDto.onlineStatus, groupsGroupFullDto.invitedBy, groupsGroupFullDto.ageLimits, groupsGroupFullDto.ageMark, groupsGroupFullDto.banInfo, groupsGroupFullDto.actionButton, groupsGroupFullDto.authorId, groupsGroupFullDto.phone, groupsGroupFullDto.isWidgetMessagesEnabled, groupsGroupFullDto.vkpayCanTransfer, groupsGroupFullDto.vkpayReceiverId, groupsGroupFullDto.hasGroupChannel, groupsGroupFullDto.groupChannel, groupsGroupFullDto.communityChannelId, groupsGroupFullDto.addresses, groupsGroupFullDto.messages, groupsGroupFullDto.isAue, groupsGroupFullDto.prohibitedContentAdultMark, groupsGroupFullDto.isSubscribedPodcasts, groupsGroupFullDto.canSubscribePodcasts, groupsGroupFullDto.isSubscribedStories, groupsGroupFullDto.canSubscribeStories, groupsGroupFullDto.canSubscribePosts, groupsGroupFullDto.liveCovers, groupsGroupFullDto.vkAdminStatus, groupsGroupFullDto.menu, groupsGroupFullDto.warningNotification, groupsGroupFullDto.createDate, groupsGroupFullDto.donut, groupsGroupFullDto.vkTicket, groupsGroupFullDto.donutBlock, groupsGroupFullDto.donutCommunityManagement, groupsGroupFullDto.donutPaymentInfo, groupsGroupFullDto.canPostDonut, groupsGroupFullDto.canSeeMembers, groupsGroupFullDto.msgPushAllowed, groupsGroupFullDto.msgNotificationsAllowed, groupsGroupFullDto.chatsStatus, groupsGroupFullDto.canReport, groupsGroupFullDto.businessRating, groupsGroupFullDto.isBusiness, groupsGroupFullDto.isBusinessCategory, groupsGroupFullDto.isConfirmedBusiness, groupsGroupFullDto.isGoldenMarkedBusiness, groupsGroupFullDto.trustMark, groupsGroupFullDto.microlanding, groupsGroupFullDto.tariffs, groupsGroupFullDto.verificationEndTime, groupsGroupFullDto.canManage, groupsGroupFullDto.disallowManageReason, groupsGroupFullDto.disallowManageReasonMessage, groupsGroupFullDto.hasSuggestions, groupsGroupFullDto.showSuggestions, groupsGroupFullDto.canViewStats, groupsGroupFullDto.canViewPostReachStats, groupsGroupFullDto.storiesArchiveCount, groupsGroupFullDto.adsEasyPromote, groupsGroupFullDto.adsEasyPromoteAllowed, groupsGroupFullDto.adsPostingRestrictedToday, groupsGroupFullDto.adsMarketAutopromoteAllowed, groupsGroupFullDto.adsMarketEasyPromote, groupsGroupFullDto.adsMarketAutopromoteReasonsNotAllowed, groupsGroupFullDto.adsMarketServicesAutopromoteReasonsNotAllowed, groupsGroupFullDto.adsMarketServicesAutopromoteAllowed, groupsGroupFullDto.adsMarketServicesEasyPromote, groupsGroupFullDto.adsEasyPromoteReasonsNotAllowed, groupsGroupFullDto.canSeeInviteLinks, groupsGroupFullDto.categoryV2, groupsGroupFullDto.subjectId, groupsGroupFullDto.publicCategory, groupsGroupFullDto.publicSubcategory, groupsGroupFullDto.installedAppsCount, groupsGroupFullDto.like, groupsGroupFullDto.loginConfirmationStatus, groupsGroupFullDto.hasUnseenStories, groupsGroupFullDto.category, groupsGroupFullDto.category0, groupsGroupFullDto.category1, groupsGroupFullDto.category2, groupsGroupFullDto.friends, groupsGroupFullDto.deactivatedMessage, groupsGroupFullDto.deactivatedType, groupsGroupFullDto.targArtistId, groupsGroupFullDto.isGovernmentOrganization, groupsGroupFullDto.settingsTooltipsActive, groupsGroupFullDto.isYclientsTooltipActive, groupsGroupFullDto.rating, groupsGroupFullDto.nameHistory, groupsGroupFullDto.serviceRating, groupsGroupFullDto.recommendedTipsWidget, groupsGroupFullDto.region, groupsGroupFullDto.subject, groupsGroupFullDto.isSetTabOrder, groupsGroupFullDto.isShowBusinessOnboarding, groupsGroupFullDto.businessCommunityTooltips, groupsGroupFullDto.repostsDisabled, groupsGroupFullDto.videoLivesStreamingBanned, groupsGroupFullDto.category1Name, groupsGroupFullDto.adsPostsInfo, groupsGroupFullDto.thematic, groupsGroupFullDto.bannerAdsMainClient, groupsGroupFullDto.bannerAdsSettingMiniapp, groupsGroupFullDto.isManualMarkedBusiness, groupsGroupFullDto.leaveMode, groupsGroupFullDto.bannerAdsMainMvk, groupsGroupFullDto.isMediaWallEnabled, groupsGroupFullDto.isMonetizationAvailable, groupsGroupFullDto.videoNotificationsStatus, groupsGroupFullDto.isVideoSubscriptionHidden, groupsGroupFullDto.suggestSubscribe, groupsGroupFullDto.suggestedCategoryName, groupsGroupFullDto.isWorkGroup, groupsGroupFullDto.workGroupInfo, groupsGroupFullDto.url, groupsGroupFullDto.membersPreview, groupsGroupFullDto.strikesInfo, groupsGroupFullDto.strikesRestrictions, groupsGroupFullDto.coOwnershipEnabled, groupsGroupFullDto.enabledFeatures, groupsGroupFullDto.canEditScreenName, groupsGroupFullDto.canCreateEvent, groupsGroupFullDto.tabs, groupsGroupFullDto.unreadCount, groupsGroupFullDto.videosCount, groupsGroupFullDto.channelButton, groupsGroupFullDto.aPlusMark, groupsGroupFullDto.yclientsRepeatRecords, groupsGroupFullDto.channelInfo, groupsGroupFullDto.channelBlock, groupsGroupFullDto.isEducational, groupsGroupFullDto.eventOrganizer, groupsGroupFullDto.videoChannelData, groupsGroupFullDto.isTagsAvailable, groupsGroupFullDto.isGroupDisplayed, groupsGroupFullDto.isMarketEnabled, groupsGroupFullDto.contentSectionsData, groupsGroupFullDto.name, groupsGroupFullDto.screenName, groupsGroupFullDto.isClosed, groupsGroupFullDto.type, groupsGroupFullDto.channelType, groupsGroupFullDto.isAdmin, groupsGroupFullDto.adminLevel, groupsGroupFullDto.isMember, groupsGroupFullDto.isAdvertiser, groupsGroupFullDto.startDate, groupsGroupFullDto.finishDate, groupsGroupFullDto.verified, groupsGroupFullDto.deactivated, groupsGroupFullDto.photo50, groupsGroupFullDto.photo100, groupsGroupFullDto.photo200, groupsGroupFullDto.photo200Orig, groupsGroupFullDto.photo400, groupsGroupFullDto.photo400Orig, groupsGroupFullDto.photoMax, groupsGroupFullDto.photoMaxOrig, groupsGroupFullDto.photoBase, groupsGroupFullDto.estDate, groupsGroupFullDto.publicDateLabel, groupsGroupFullDto.photoMaxSize, groupsGroupFullDto.appButton, groupsGroupFullDto.appButtons, groupsGroupFullDto.isVideoLiveNotificationsBlocked, groupsGroupFullDto.videoLive, groupsGroupFullDto.hadTorch, groupsGroupFullDto.audioArtistId, groupsGroupFullDto.audioCuratorId, groupsGroupFullDto.buttons, groupsGroupFullDto.isNftPhoto, groupsGroupFullDto.isCached, groupsGroupFullDto.market, groupsGroupFullDto.marketServices, groupsGroupFullDto.hasMarketApp, groupsGroupFullDto.usingVkpayMarketApp, groupsGroupFullDto.isMarketCartEnabled, groupsGroupFullDto.extendedMarket, groupsGroupFullDto.marketShopConditionsState, groupsGroupFullDto.isMarketOnlineBookingSettingEnabled, groupsGroupFullDto.isBindingToYclientsServiceEnabled, groupsGroupFullDto.isMarketMarketLinkAttachmentEnabled, groupsGroupFullDto.isMarketMessageToBcAttachmentEnabled, groupsGroupFullDto.isMarketOnlineBookingActionButtonEnabled, groupsGroupFullDto.youlaStatus, groupsGroupFullDto.youlaUseWallpostRedirect, groupsGroupFullDto.youlaWallpostRedirectMiniappUrl, groupsGroupFullDto.classifiedsAntibaraholkaDesignVersion, groupsGroupFullDto.isYoulaPostingToWallAllowed, groupsGroupFullDto.youlaPostingMethod);
    }

    public final BaseBoolIntDto B() {
        return this.canUploadDoc;
    }

    public final String B1() {
        return this.photo100;
    }

    public final Boolean B2() {
        return this.suggestSubscribe;
    }

    public final Boolean B3() {
        return this.isMarketEnabled;
    }

    public final BaseBoolIntDto C() {
        return this.canUploadStory;
    }

    public final BaseBoolIntDto D() {
        return this.canUploadVideo;
    }

    public final GroupsGroupFriendsDto D0() {
        return this.friends;
    }

    public final String D1() {
        return this.photo200;
    }

    public final Boolean D3() {
        return this.isMarketMarketLinkAttachmentEnabled;
    }

    public final String E1() {
        return this.photo200Orig;
    }

    public final List<GroupsTabSettingsDto> E2() {
        return this.tabs;
    }

    public final Boolean E3() {
        return this.isMarketMessageToBcAttachmentEnabled;
    }

    public final String F() {
        return this.category1Name;
    }

    public final Boolean F0() {
        return this.hasGroupChannel;
    }

    public final Boolean F3() {
        return this.isMarketOnlineBookingActionButtonEnabled;
    }

    public final Integer G() {
        return this.clipsCount;
    }

    public final String G2() {
        return this.thematic;
    }

    public final Boolean G3() {
        return this.isMarketOnlineBookingSettingEnabled;
    }

    public final Boolean H0() {
        return this.hasLiveCover;
    }

    public final BaseBoolIntDto I2() {
        return this.trending;
    }

    public final BaseBoolIntDto I3() {
        return this.isMember;
    }

    public final TrustMarkDto J2() {
        return this.trustMark;
    }

    public final Boolean K() {
        return this.coOwnershipEnabled;
    }

    public final Boolean K0() {
        return this.hasMarketApp;
    }

    public final String L1() {
        return this.photo400;
    }

    public final GroupsGroupTypeDto L2() {
        return this.type;
    }

    public final GroupsCountersGroupDto M() {
        return this.counters;
    }

    public final Integer M2() {
        return this.unreadCount;
    }

    public final BaseBoolIntDto M3() {
        return this.isMessagesBlocked;
    }

    public final Boolean N0() {
        return this.hasUnseenStories;
    }

    public final String N1() {
        return this.photo400Orig;
    }

    public final Boolean N2() {
        return this.usingVkpayMarketApp;
    }

    public final Boolean N3() {
        return this.isNftPhoto;
    }

    public final BaseBoolIntDto O2() {
        return this.verified;
    }

    public final BaseBoolIntDto O3() {
        return this.isSubscribed;
    }

    public final UserId P0() {
        return this.id;
    }

    public final GroupsVideoChannelDataDto Q2() {
        return this.videoChannelData;
    }

    public final Boolean Q3() {
        return this.isSubscribedPodcasts;
    }

    public final BaseOwnerCoverDto R() {
        return this.cover;
    }

    public final String R1() {
        return this.photo50;
    }

    public final BaseOwnerCoverDto R2() {
        return this.videoCover;
    }

    public final BaseBoolIntDto R3() {
        return this.isVideoLiveNotificationsBlocked;
    }

    public final Integer S0() {
        return this.invitedBy;
    }

    public final Integer T() {
        return this.createDate;
    }

    public final GroupsVideoLivesDataDto T2() {
        return this.videoLivesData;
    }

    public final LeaveModeDto U0() {
        return this.leaveMode;
    }

    public final String U1() {
        return this.photoAvgColor;
    }

    public final GroupsGroupLikeItemDto V0() {
        return this.like;
    }

    public final String V1() {
        return this.photoBase;
    }

    public final Boolean V2() {
        return this.videoLivesStreamingBanned;
    }

    public final String W() {
        return this.deactivated;
    }

    public final String W1() {
        return this.photoMax;
    }

    public final VideoNotificationsStatusDto W2() {
        return this.videoNotificationsStatus;
    }

    public final String X1() {
        return this.photoMaxOrig;
    }

    public final String Z() {
        return this.deactivatedMessage;
    }

    public final DeactivatedTypeDto a0() {
        return this.deactivatedType;
    }

    public final GroupsMarketInfoDto b1() {
        return this.market;
    }

    public final GroupsActionButtonDto d() {
        return this.actionButton;
    }

    public final GroupsMarketShopConditionsStateDto d1() {
        return this.marketShopConditionsState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.activity;
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

    public final GroupsGroupAdminLevelDto f() {
        return this.adminLevel;
    }

    public final GroupsGroupVkTicketDto f3() {
        return this.vkTicket;
    }

    public final GroupsGroupFullAgeLimitsDto g() {
        return this.ageLimits;
    }

    public final Boolean g3() {
        return this.vkpayCanTransfer;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl() {
        return this.url;
    }

    public final WallDto h3() {
        return this.wall;
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

    public final GroupsGroupFullAgeMarkDto i() {
        return this.ageMark;
    }

    public final MarketCommunityRatingDto i2() {
        return this.rating;
    }

    public final GroupsWarningNotificationDto i3() {
        return this.warningNotification;
    }

    public final GroupsGroupBanInfoDto j() {
        return this.banInfo;
    }

    public final Boolean k() {
        return this.canManage;
    }

    public final BaseBoolIntDto l() {
        return this.canMessage;
    }

    public final GroupsGroupDonutDto l0() {
        return this.donut;
    }

    public final String l2() {
        return this.screenName;
    }

    public final GroupsGroupFullShowSuggestionsDto m2() {
        return this.showSuggestions;
    }

    public final Boolean m3() {
        return this.isVideoSubscriptionHidden;
    }

    public final BaseBoolIntDto n() {
        return this.canPost;
    }

    public final GroupsGroupFullMemberStatusDto n1() {
        return this.memberStatus;
    }

    public final Integer o() {
        return this.canPostDonut;
    }

    public final Integer o1() {
        return this.membersCount;
    }

    public final String o2() {
        return this.site;
    }

    public final BaseBoolIntDto o3() {
        return this.isAdmin;
    }

    public final Boolean p() {
        return this.canSubscribePodcasts;
    }

    public final Boolean p3() {
        return this.isBindingToYclientsServiceEnabled;
    }

    public final Integer q2() {
        return this.startDate;
    }

    public final String r2() {
        return this.status;
    }

    public final String r3() {
        return this.isBusiness;
    }

    public final String s1() {
        return this.membersCountText;
    }

    public final GroupsMenuDto t1() {
        return this.menu;
    }

    public final Boolean t3() {
        return this.isBusinessCategory;
    }

    public final String toString() {
        return "GroupsGroupFullDto(id=" + this.id + ", memberStatus=" + this.memberStatus + ", isAdult=" + this.isAdult + ", isHiddenFromFeed=" + this.isHiddenFromFeed + ", isFavorite=" + this.isFavorite + ", isSubscribed=" + this.isSubscribed + ", city=" + this.city + ", country=" + this.country + ", description=" + this.description + ", wikiPage=" + this.wikiPage + ", membersCount=" + this.membersCount + ", membersCountText=" + this.membersCountText + ", requestsCount=" + this.requestsCount + ", musicAwards=" + this.musicAwards + ", videoLiveLevel=" + this.videoLiveLevel + ", videoLiveCount=" + this.videoLiveCount + ", clipsCount=" + this.clipsCount + ", counters=" + this.counters + ", cover=" + this.cover + ", videoCover=" + this.videoCover + ", videoLivesData=" + this.videoLivesData + ", photoAvgColor=" + this.photoAvgColor + ", inn=" + this.inn + ", ogrn=" + this.ogrn + ", kpp=" + this.kpp + ", hasLiveCover=" + this.hasLiveCover + ", hasStories=" + this.hasStories + ", canPost=" + this.canPost + ", canSuggest=" + this.canSuggest + ", canUploadStory=" + this.canUploadStory + ", canCallToCommunity=" + this.canCallToCommunity + ", canUploadDoc=" + this.canUploadDoc + ", canUploadVideo=" + this.canUploadVideo + ", canUploadVideoThumb=" + this.canUploadVideoThumb + ", canUploadClip=" + this.canUploadClip + ", canSeeAllPosts=" + this.canSeeAllPosts + ", canCreateTopic=" + this.canCreateTopic + ", activity=" + this.activity + ", fixedPost=" + this.fixedPost + ", hasPhoto=" + this.hasPhoto + ", cropPhoto=" + this.cropPhoto + ", status=" + this.status + ", statusAudio=" + this.statusAudio + ", mainAlbumId=" + this.mainAlbumId + ", links=" + this.links + ", contacts=" + this.contacts + ", wall=" + this.wall + ", site=" + this.site + ", isSiteDisplayed=" + this.isSiteDisplayed + ", mainSection=" + this.mainSection + ", primaryBlock=" + this.primaryBlock + ", trending=" + this.trending + ", canMessage=" + this.canMessage + ", isMessagesBlocked=" + this.isMessagesBlocked + ", canSendNotify=" + this.canSendNotify + ", onlineStatus=" + this.onlineStatus + ", invitedBy=" + this.invitedBy + ", ageLimits=" + this.ageLimits + ", ageMark=" + this.ageMark + ", banInfo=" + this.banInfo + ", actionButton=" + this.actionButton + ", authorId=" + this.authorId + ", phone=" + this.phone + ", isWidgetMessagesEnabled=" + this.isWidgetMessagesEnabled + ", vkpayCanTransfer=" + this.vkpayCanTransfer + ", vkpayReceiverId=" + this.vkpayReceiverId + ", hasGroupChannel=" + this.hasGroupChannel + ", groupChannel=" + this.groupChannel + ", communityChannelId=" + this.communityChannelId + ", addresses=" + this.addresses + ", messages=" + this.messages + ", isAue=" + this.isAue + ", prohibitedContentAdultMark=" + this.prohibitedContentAdultMark + ", isSubscribedPodcasts=" + this.isSubscribedPodcasts + ", canSubscribePodcasts=" + this.canSubscribePodcasts + ", isSubscribedStories=" + this.isSubscribedStories + ", canSubscribeStories=" + this.canSubscribeStories + ", canSubscribePosts=" + this.canSubscribePosts + ", liveCovers=" + this.liveCovers + ", vkAdminStatus=" + this.vkAdminStatus + ", menu=" + this.menu + ", warningNotification=" + this.warningNotification + ", createDate=" + this.createDate + ", donut=" + this.donut + ", vkTicket=" + this.vkTicket + ", donutBlock=" + this.donutBlock + ", donutCommunityManagement=" + this.donutCommunityManagement + ", donutPaymentInfo=" + this.donutPaymentInfo + ", canPostDonut=" + this.canPostDonut + ", canSeeMembers=" + this.canSeeMembers + ", msgPushAllowed=" + this.msgPushAllowed + ", msgNotificationsAllowed=" + this.msgNotificationsAllowed + ", chatsStatus=" + this.chatsStatus + ", canReport=" + this.canReport + ", businessRating=" + this.businessRating + ", isBusiness=" + this.isBusiness + ", isBusinessCategory=" + this.isBusinessCategory + ", isConfirmedBusiness=" + this.isConfirmedBusiness + ", isGoldenMarkedBusiness=" + this.isGoldenMarkedBusiness + ", trustMark=" + this.trustMark + ", microlanding=" + this.microlanding + ", tariffs=" + this.tariffs + ", verificationEndTime=" + this.verificationEndTime + ", canManage=" + this.canManage + ", disallowManageReason=" + this.disallowManageReason + ", disallowManageReasonMessage=" + this.disallowManageReasonMessage + ", hasSuggestions=" + this.hasSuggestions + ", showSuggestions=" + this.showSuggestions + ", canViewStats=" + this.canViewStats + ", canViewPostReachStats=" + this.canViewPostReachStats + ", storiesArchiveCount=" + this.storiesArchiveCount + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteAllowed=" + this.adsEasyPromoteAllowed + ", adsPostingRestrictedToday=" + this.adsPostingRestrictedToday + ", adsMarketAutopromoteAllowed=" + this.adsMarketAutopromoteAllowed + ", adsMarketEasyPromote=" + this.adsMarketEasyPromote + ", adsMarketAutopromoteReasonsNotAllowed=" + this.adsMarketAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteReasonsNotAllowed=" + this.adsMarketServicesAutopromoteReasonsNotAllowed + ", adsMarketServicesAutopromoteAllowed=" + this.adsMarketServicesAutopromoteAllowed + ", adsMarketServicesEasyPromote=" + this.adsMarketServicesEasyPromote + ", adsEasyPromoteReasonsNotAllowed=" + this.adsEasyPromoteReasonsNotAllowed + ", canSeeInviteLinks=" + this.canSeeInviteLinks + ", categoryV2=" + this.categoryV2 + ", subjectId=" + this.subjectId + ", publicCategory=" + this.publicCategory + ", publicSubcategory=" + this.publicSubcategory + ", installedAppsCount=" + this.installedAppsCount + ", like=" + this.like + ", loginConfirmationStatus=" + this.loginConfirmationStatus + ", hasUnseenStories=" + this.hasUnseenStories + ", category=" + this.category + ", category0=" + this.category0 + ", category1=" + this.category1 + ", category2=" + this.category2 + ", friends=" + this.friends + ", deactivatedMessage=" + this.deactivatedMessage + ", deactivatedType=" + this.deactivatedType + ", targArtistId=" + this.targArtistId + ", isGovernmentOrganization=" + this.isGovernmentOrganization + ", settingsTooltipsActive=" + this.settingsTooltipsActive + ", isYclientsTooltipActive=" + this.isYclientsTooltipActive + ", rating=" + this.rating + ", nameHistory=" + this.nameHistory + ", serviceRating=" + this.serviceRating + ", recommendedTipsWidget=" + this.recommendedTipsWidget + ", region=" + this.region + ", subject=" + this.subject + ", isSetTabOrder=" + this.isSetTabOrder + ", isShowBusinessOnboarding=" + this.isShowBusinessOnboarding + ", businessCommunityTooltips=" + this.businessCommunityTooltips + ", repostsDisabled=" + this.repostsDisabled + ", videoLivesStreamingBanned=" + this.videoLivesStreamingBanned + ", category1Name=" + this.category1Name + ", adsPostsInfo=" + this.adsPostsInfo + ", thematic=" + this.thematic + ", bannerAdsMainClient=" + this.bannerAdsMainClient + ", bannerAdsSettingMiniapp=" + this.bannerAdsSettingMiniapp + ", isManualMarkedBusiness=" + this.isManualMarkedBusiness + ", leaveMode=" + this.leaveMode + ", bannerAdsMainMvk=" + this.bannerAdsMainMvk + ", isMediaWallEnabled=" + this.isMediaWallEnabled + ", isMonetizationAvailable=" + this.isMonetizationAvailable + ", videoNotificationsStatus=" + this.videoNotificationsStatus + ", isVideoSubscriptionHidden=" + this.isVideoSubscriptionHidden + ", suggestSubscribe=" + this.suggestSubscribe + ", suggestedCategoryName=" + this.suggestedCategoryName + ", isWorkGroup=" + this.isWorkGroup + ", workGroupInfo=" + this.workGroupInfo + ", url=" + this.url + ", membersPreview=" + this.membersPreview + ", strikesInfo=" + this.strikesInfo + ", strikesRestrictions=" + this.strikesRestrictions + ", coOwnershipEnabled=" + this.coOwnershipEnabled + ", enabledFeatures=" + this.enabledFeatures + ", canEditScreenName=" + this.canEditScreenName + ", canCreateEvent=" + this.canCreateEvent + ", tabs=" + this.tabs + ", unreadCount=" + this.unreadCount + ", videosCount=" + this.videosCount + ", channelButton=" + this.channelButton + ", aPlusMark=" + this.aPlusMark + ", yclientsRepeatRecords=" + this.yclientsRepeatRecords + ", channelInfo=" + this.channelInfo + ", channelBlock=" + this.channelBlock + ", isEducational=" + this.isEducational + ", eventOrganizer=" + this.eventOrganizer + ", videoChannelData=" + this.videoChannelData + ", isTagsAvailable=" + this.isTagsAvailable + ", isGroupDisplayed=" + this.isGroupDisplayed + ", isMarketEnabled=" + this.isMarketEnabled + ", contentSectionsData=" + this.contentSectionsData + ", name=" + this.name + ", screenName=" + this.screenName + ", isClosed=" + this.isClosed + ", type=" + this.type + ", channelType=" + this.channelType + ", isAdmin=" + this.isAdmin + ", adminLevel=" + this.adminLevel + ", isMember=" + this.isMember + ", isAdvertiser=" + this.isAdvertiser + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate + ", verified=" + this.verified + ", deactivated=" + this.deactivated + ", photo50=" + this.photo50 + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", photo200Orig=" + this.photo200Orig + ", photo400=" + this.photo400 + ", photo400Orig=" + this.photo400Orig + ", photoMax=" + this.photoMax + ", photoMaxOrig=" + this.photoMaxOrig + ", photoBase=" + this.photoBase + ", estDate=" + this.estDate + ", publicDateLabel=" + this.publicDateLabel + ", photoMaxSize=" + this.photoMaxSize + ", appButton=" + this.appButton + ", appButtons=" + this.appButtons + ", isVideoLiveNotificationsBlocked=" + this.isVideoLiveNotificationsBlocked + ", videoLive=" + this.videoLive + ", hadTorch=" + this.hadTorch + ", audioArtistId=" + this.audioArtistId + ", audioCuratorId=" + this.audioCuratorId + ", buttons=" + this.buttons + ", isNftPhoto=" + this.isNftPhoto + ", isCached=" + this.isCached + ", market=" + this.market + ", marketServices=" + this.marketServices + ", hasMarketApp=" + this.hasMarketApp + ", usingVkpayMarketApp=" + this.usingVkpayMarketApp + ", isMarketCartEnabled=" + this.isMarketCartEnabled + ", extendedMarket=" + this.extendedMarket + ", marketShopConditionsState=" + this.marketShopConditionsState + ", isMarketOnlineBookingSettingEnabled=" + this.isMarketOnlineBookingSettingEnabled + ", isBindingToYclientsServiceEnabled=" + this.isBindingToYclientsServiceEnabled + ", isMarketMarketLinkAttachmentEnabled=" + this.isMarketMarketLinkAttachmentEnabled + ", isMarketMessageToBcAttachmentEnabled=" + this.isMarketMessageToBcAttachmentEnabled + ", isMarketOnlineBookingActionButtonEnabled=" + this.isMarketOnlineBookingActionButtonEnabled + ", youlaStatus=" + this.youlaStatus + ", youlaUseWallpostRedirect=" + this.youlaUseWallpostRedirect + ", youlaWallpostRedirectMiniappUrl=" + this.youlaWallpostRedirectMiniappUrl + ", classifiedsAntibaraholkaDesignVersion=" + this.classifiedsAntibaraholkaDesignVersion + ", isYoulaPostingToWallAllowed=" + this.isYoulaPostingToWallAllowed + ", youlaPostingMethod=" + this.youlaPostingMethod + ')';
    }

    public final BaseBoolIntDto u() {
        return this.canUploadClip;
    }

    public final GroupsGroupIsClosedDto u3() {
        return this.isClosed;
    }

    public final GroupsGroupDonutBlockDto v0() {
        return this.donutBlock;
    }

    public final List<String> w0() {
        return this.enabledFeatures;
    }

    public final BaseBoolIntDto w3() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        if (groupsGroupFullMemberStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFullMemberStatusDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto = this.isAdult;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.isHiddenFromFeed;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto3 = this.isFavorite;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto4 = this.isSubscribed;
        if (baseBoolIntDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto4.writeToParcel(parcel, i);
        }
        BaseObjectDto baseObjectDto = this.city;
        if (baseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseObjectDto.writeToParcel(parcel, i);
        }
        BaseCountryDto baseCountryDto = this.country;
        if (baseCountryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCountryDto.writeToParcel(parcel, i);
        }
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
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        if (audioMusicAwardsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioMusicAwardsDto.writeToParcel(parcel, i);
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
        GroupsCountersGroupDto groupsCountersGroupDto = this.counters;
        if (groupsCountersGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCountersGroupDto.writeToParcel(parcel, i);
        }
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        if (baseOwnerCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseOwnerCoverDto.writeToParcel(parcel, i);
        }
        BaseOwnerCoverDto baseOwnerCoverDto2 = this.videoCover;
        if (baseOwnerCoverDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseOwnerCoverDto2.writeToParcel(parcel, i);
        }
        GroupsVideoLivesDataDto groupsVideoLivesDataDto = this.videoLivesData;
        if (groupsVideoLivesDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsVideoLivesDataDto.writeToParcel(parcel, i);
        }
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
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        if (baseBoolIntDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto5.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto6 = this.canSuggest;
        if (baseBoolIntDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto6.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto7 = this.canUploadStory;
        if (baseBoolIntDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto7.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.canCallToCommunity;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        BaseBoolIntDto baseBoolIntDto8 = this.canUploadDoc;
        if (baseBoolIntDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto8.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto9 = this.canUploadVideo;
        if (baseBoolIntDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto9.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto10 = this.canUploadVideoThumb;
        if (baseBoolIntDto10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto10.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto11 = this.canUploadClip;
        if (baseBoolIntDto11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto11.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeAllPosts;
        if (baseBoolIntDto12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto12.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto13 = this.canCreateTopic;
        if (baseBoolIntDto13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto13.writeToParcel(parcel, i);
        }
        parcel.writeString(this.activity);
        Integer num6 = this.fixedPost;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        BaseBoolIntDto baseBoolIntDto14 = this.hasPhoto;
        if (baseBoolIntDto14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto14.writeToParcel(parcel, i);
        }
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        if (baseCropPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCropPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.status);
        AudioAudioDto audioAudioDto = this.statusAudio;
        if (audioAudioDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioAudioDto.writeToParcel(parcel, i);
        }
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
                ((GroupsLinksItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsContactsItemDto> list2 = this.contacts;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((GroupsContactsItemDto) f2.next()).writeToParcel(parcel, i);
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
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        if (groupsGroupFullSectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFullSectionDto.writeToParcel(parcel, i);
        }
        GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = this.primaryBlock;
        if (groupsPrimaryBlockSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsPrimaryBlockSettingsDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto15 = this.trending;
        if (baseBoolIntDto15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto15.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto16 = this.canMessage;
        if (baseBoolIntDto16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto16.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto17 = this.isMessagesBlocked;
        if (baseBoolIntDto17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto17.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto18 = this.canSendNotify;
        if (baseBoolIntDto18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto18.writeToParcel(parcel, i);
        }
        GroupsOnlineStatusDto groupsOnlineStatusDto = this.onlineStatus;
        if (groupsOnlineStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsOnlineStatusDto.writeToParcel(parcel, i);
        }
        Integer num8 = this.invitedBy;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = this.ageLimits;
        if (groupsGroupFullAgeLimitsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFullAgeLimitsDto.writeToParcel(parcel, i);
        }
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = this.ageMark;
        if (groupsGroupFullAgeMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFullAgeMarkDto.writeToParcel(parcel, i);
        }
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = this.banInfo;
        if (groupsGroupBanInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupBanInfoDto.writeToParcel(parcel, i);
        }
        GroupsActionButtonDto groupsActionButtonDto = this.actionButton;
        if (groupsActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsActionButtonDto.writeToParcel(parcel, i);
        }
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
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        if (groupsAddressesInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressesInfoDto.writeToParcel(parcel, i);
        }
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
        GroupsLiveCoversDto groupsLiveCoversDto = this.liveCovers;
        if (groupsLiveCoversDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsLiveCoversDto.writeToParcel(parcel, i);
        }
        GroupsVkAdminStatusDto groupsVkAdminStatusDto = this.vkAdminStatus;
        if (groupsVkAdminStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsVkAdminStatusDto.writeToParcel(parcel, i);
        }
        GroupsMenuDto groupsMenuDto = this.menu;
        if (groupsMenuDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMenuDto.writeToParcel(parcel, i);
        }
        GroupsWarningNotificationDto groupsWarningNotificationDto = this.warningNotification;
        if (groupsWarningNotificationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsWarningNotificationDto.writeToParcel(parcel, i);
        }
        Integer num12 = this.createDate;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        GroupsGroupDonutDto groupsGroupDonutDto = this.donut;
        if (groupsGroupDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutDto.writeToParcel(parcel, i);
        }
        GroupsGroupVkTicketDto groupsGroupVkTicketDto = this.vkTicket;
        if (groupsGroupVkTicketDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupVkTicketDto.writeToParcel(parcel, i);
        }
        GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = this.donutBlock;
        if (groupsGroupDonutBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutBlockDto.writeToParcel(parcel, i);
        }
        GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = this.donutCommunityManagement;
        if (groupsDonutCommunityManagementDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsDonutCommunityManagementDto.writeToParcel(parcel, i);
        }
        GroupsGroupDonutPaymentInfoDto groupsGroupDonutPaymentInfoDto = this.donutPaymentInfo;
        if (groupsGroupDonutPaymentInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutPaymentInfoDto.writeToParcel(parcel, i);
        }
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
        BaseBoolIntDto baseBoolIntDto19 = this.msgPushAllowed;
        if (baseBoolIntDto19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto19.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto20 = this.msgNotificationsAllowed;
        if (baseBoolIntDto20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto20.writeToParcel(parcel, i);
        }
        GroupsChatsStatusDto groupsChatsStatusDto = this.chatsStatus;
        if (groupsChatsStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsChatsStatusDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto21 = this.canReport;
        if (baseBoolIntDto21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto21.writeToParcel(parcel, i);
        }
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
        GroupsMicrolandingDto groupsMicrolandingDto = this.microlanding;
        if (groupsMicrolandingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMicrolandingDto.writeToParcel(parcel, i);
        }
        GroupsTariffsDto groupsTariffsDto = this.tariffs;
        if (groupsTariffsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTariffsDto.writeToParcel(parcel, i);
        }
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
        BaseBoolIntDto baseBoolIntDto22 = this.hasSuggestions;
        if (baseBoolIntDto22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto22.writeToParcel(parcel, i);
        }
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = this.showSuggestions;
        if (groupsGroupFullShowSuggestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFullShowSuggestionsDto.writeToParcel(parcel, i);
        }
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
        GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = this.adsEasyPromote;
        if (groupsAdsEasyPromoteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAdsEasyPromoteDto.writeToParcel(parcel, i);
        }
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
        GroupsGroupLikeItemDto groupsGroupLikeItemDto = this.like;
        if (groupsGroupLikeItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupLikeItemDto.writeToParcel(parcel, i);
        }
        GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = this.loginConfirmationStatus;
        if (groupsLoginConfirmationStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsLoginConfirmationStatusDto.writeToParcel(parcel, i);
        }
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
        GroupsGroupFriendsDto groupsGroupFriendsDto = this.friends;
        if (groupsGroupFriendsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFriendsDto.writeToParcel(parcel, i);
        }
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
        MarketCommunityRatingDto marketCommunityRatingDto = this.rating;
        if (marketCommunityRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCommunityRatingDto.writeToParcel(parcel, i);
        }
        GroupsGroupNameHistoryDto groupsGroupNameHistoryDto = this.nameHistory;
        if (groupsGroupNameHistoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupNameHistoryDto.writeToParcel(parcel, i);
        }
        MarketCommunityServiceRatingDto marketCommunityServiceRatingDto = this.serviceRating;
        if (marketCommunityServiceRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCommunityServiceRatingDto.writeToParcel(parcel, i);
        }
        GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = this.recommendedTipsWidget;
        if (groupsRecommendedTipsWidgetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsRecommendedTipsWidgetDto.writeToParcel(parcel, i);
        }
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
        GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = this.adsPostsInfo;
        if (groupsAdsPostsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAdsPostsInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.thematic);
        GroupsBannerDto groupsBannerDto = this.bannerAdsMainClient;
        if (groupsBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBannerDto.writeToParcel(parcel, i);
        }
        GroupsBannerDto groupsBannerDto2 = this.bannerAdsSettingMiniapp;
        if (groupsBannerDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBannerDto2.writeToParcel(parcel, i);
        }
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
        GroupsBannerDto groupsBannerDto3 = this.bannerAdsMainMvk;
        if (groupsBannerDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBannerDto3.writeToParcel(parcel, i);
        }
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
        GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = this.workGroupInfo;
        if (groupsWorkGroupInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsWorkGroupInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        GroupsGroupFullMembersPreviewDto groupsGroupFullMembersPreviewDto = this.membersPreview;
        if (groupsGroupFullMembersPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupFullMembersPreviewDto.writeToParcel(parcel, i);
        }
        GroupsStrikesInfoDto groupsStrikesInfoDto = this.strikesInfo;
        if (groupsStrikesInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesInfoDto.writeToParcel(parcel, i);
        }
        GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto = this.strikesRestrictions;
        if (groupsStrikesRestrictionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesRestrictionsDto.writeToParcel(parcel, i);
        }
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
                ((GroupsTabSettingsDto) f4.next()).writeToParcel(parcel, i);
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
        GroupsSimpleButtonDto groupsSimpleButtonDto = this.channelButton;
        if (groupsSimpleButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSimpleButtonDto.writeToParcel(parcel, i);
        }
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        if (baseAPlusMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseAPlusMarkDto.writeToParcel(parcel, i);
        }
        List<ServiceBookingRepeatRecordDto> list4 = this.yclientsRepeatRecords;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                ((ServiceBookingRepeatRecordDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        GroupsChannelInfoDto groupsChannelInfoDto = this.channelInfo;
        if (groupsChannelInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsChannelInfoDto.writeToParcel(parcel, i);
        }
        GroupsChannelBlockDto groupsChannelBlockDto = this.channelBlock;
        if (groupsChannelBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsChannelBlockDto.writeToParcel(parcel, i);
        }
        Boolean bool45 = this.isEducational;
        if (bool45 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool45);
        }
        GroupsEventOrganizerDto groupsEventOrganizerDto = this.eventOrganizer;
        if (groupsEventOrganizerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsEventOrganizerDto.writeToParcel(parcel, i);
        }
        GroupsVideoChannelDataDto groupsVideoChannelDataDto = this.videoChannelData;
        if (groupsVideoChannelDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsVideoChannelDataDto.writeToParcel(parcel, i);
        }
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
        GroupsContentSectionsDataDto groupsContentSectionsDataDto = this.contentSectionsData;
        if (groupsContentSectionsDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsContentSectionsDataDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.screenName);
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        if (groupsGroupIsClosedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupIsClosedDto.writeToParcel(parcel, i);
        }
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        if (groupsGroupTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupTypeDto.writeToParcel(parcel, i);
        }
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        if (channelsChannelTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsChannelTypeDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto23 = this.isAdmin;
        if (baseBoolIntDto23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto23.writeToParcel(parcel, i);
        }
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        if (groupsGroupAdminLevelDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupAdminLevelDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto24 = this.isMember;
        if (baseBoolIntDto24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto24.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto25 = this.isAdvertiser;
        if (baseBoolIntDto25 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto25.writeToParcel(parcel, i);
        }
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
        BaseBoolIntDto baseBoolIntDto26 = this.verified;
        if (baseBoolIntDto26 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto26.writeToParcel(parcel, i);
        }
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
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        if (groupsPhotoSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsPhotoSizeDto.writeToParcel(parcel, i);
        }
        GroupsAppButtonDto groupsAppButtonDto = this.appButton;
        if (groupsAppButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAppButtonDto.writeToParcel(parcel, i);
        }
        List<GroupsAppButtonDto> list5 = this.appButtons;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                ((GroupsAppButtonDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        BaseBoolIntDto baseBoolIntDto27 = this.isVideoLiveNotificationsBlocked;
        if (baseBoolIntDto27 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto27.writeToParcel(parcel, i);
        }
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        if (videoLiveInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoLiveInfoDto.writeToParcel(parcel, i);
        }
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
                ((BaseOwnerButtonDto) f7.next()).writeToParcel(parcel, i);
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
        GroupsMarketInfoDto groupsMarketInfoDto = this.market;
        if (groupsMarketInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMarketInfoDto.writeToParcel(parcel, i);
        }
        GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = this.marketServices;
        if (groupsMarketServicesInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMarketServicesInfoDto.writeToParcel(parcel, i);
        }
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
        GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto = this.extendedMarket;
        if (groupsGroupExtendedMarketSectionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupExtendedMarketSectionsDto.writeToParcel(parcel, i);
        }
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto = this.marketShopConditionsState;
        if (groupsMarketShopConditionsStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMarketShopConditionsStateDto.writeToParcel(parcel, i);
        }
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

    public final BaseBoolIntDto x1() {
        return this.msgPushAllowed;
    }

    public final Integer y0() {
        return this.finishDate;
    }

    public final String y1() {
        return this.name;
    }

    public final GroupsStrikesRestrictionsDto y2() {
        return this.strikesRestrictions;
    }

    public final Boolean y3() {
        return this.isGovernmentOrganization;
    }

    public final String z1() {
        return this.phone;
    }

    public final Boolean z3() {
        return this.isMarketCartEnabled;
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
}
