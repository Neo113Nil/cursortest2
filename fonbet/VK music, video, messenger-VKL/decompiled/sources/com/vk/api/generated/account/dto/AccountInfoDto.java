package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.audio.dto.AudioAdsConfigDto;
import com.vk.api.generated.audio.dto.AudioPermissionsDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarDto;
import com.vk.api.generated.money.dto.MoneyP2pParamsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedFeedPreloadingDto;
import com.vk.api.generated.stickers.dto.StickersSettingsDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoDto> CREATOR = new a();

    /* renamed from: 2faRequired, reason: not valid java name */
    @pmi0("2fa_required")
    private final BaseBoolIntDto f12faRequired;

    @pmi0("ads_easy_promote_onboarding_name")
    private final String adsEasyPromoteOnboardingName;

    @pmi0("audio_ads")
    private final AudioAdsConfigDto audioAds;

    @pmi0("audio_autoplay")
    private final Boolean audioAutoplay;

    @pmi0("audio_permissions")
    private final AudioPermissionsDto audioPermissions;

    @pmi0("business_notify_enabled")
    private final BaseBoolIntDto businessNotifyEnabled;

    @pmi0("cache")
    private final AccountInfoCacheDto cache;

    @pmi0("can_change_password")
    private final Boolean canChangePassword;

    @pmi0("change_email_url_wat")
    private final String changeEmailUrlWat;

    @pmi0("change_phone_url_wat")
    private final String changePhoneUrlWat;

    @pmi0("clickable_stickers")
    private final Object clickableStickers;

    @pmi0("comment_restriction")
    private final AccountInfoObjectsCommentRestrictionDto commentRestriction;

    @pmi0("comment_submit_type")
    private final Boolean commentSubmitType;

    @pmi0("community_comments")
    private final Boolean communityComments;

    @pmi0("conversations_bar")
    private final MessagesConversationBarDto conversationsBar;

    @pmi0("country")
    private final String country;

    @pmi0("debug_available")
    private final Boolean debugAvailable;

    @pmi0("email")
    private final String email;

    @pmi0("email_status")
    private final String emailStatus;

    @pmi0("eu_user")
    private final Boolean euUser;

    @pmi0("fave_intro")
    private final Integer faveIntro;

    @pmi0("feed_applovin_unit_id")
    private final String feedApplovinUnitId;

    @pmi0("feed_preloading")
    private final NewsfeedFeedPreloadingDto feedPreloading;

    @pmi0("feed_type")
    private final FeedTypeDto feedType;

    @pmi0("feed_type_forced")
    private final BaseBoolIntDto feedTypeForced;

    @pmi0("feed_yandex_ads_unit_id")
    private final String feedYandexAdsUnitId;

    @pmi0("has_messages_in_last_two_week")
    private final Boolean hasMessagesInLastTwoWeek;

    @pmi0("https_required")
    private final BaseBoolIntDto httpsRequired;

    @pmi0("include_channel_notifications")
    private final Boolean includeChannelNotifications;

    @pmi0("intro")
    private final Integer intro;

    @pmi0("invite_link")
    private final String inviteLink;

    @pmi0("is_ads_easy_promote_enabled")
    private final Boolean isAdsEasyPromoteEnabled;

    @pmi0("is_live_streaming_enabled")
    private final Boolean isLiveStreamingEnabled;

    @pmi0("is_new_live_streaming_enabled")
    private final Boolean isNewLiveStreamingEnabled;

    @pmi0("is_personal_ads_easy_promote_enabled")
    private final Boolean isPersonalAdsEasyPromoteEnabled;

    @pmi0("is_topic_expert")
    private final Boolean isTopicExpert;

    @pmi0("js_injections")
    private final List<String> jsInjections;

    @pmi0("lang")
    private final Integer lang;

    @pmi0("link_redirects")
    private final Object linkRedirects;

    @pmi0("market_adult_18plus")
    private final AccountInfoMarketAdult18plusDto marketAdult18plus;

    @pmi0("menu_ads_easy_promote")
    private final AccountInfoAdsEasyPromoteMenuItemDto menuAdsEasyPromote;

    @pmi0("menu_intro")
    private final Boolean menuIntro;

    @pmi0("messages_auto_unarchive")
    private final Boolean messagesAutoUnarchive;

    @pmi0("messages_counter_settings")
    private final AccountInfoMessagesCounterSettingsDto messagesCounterSettings;

    @pmi0("messages_multiline_input")
    private final Boolean messagesMultilineInput;

    @pmi0("messages_reaction_notifications")
    private final AccountMessagesReactionNotificationsSettingsDto messagesReactionNotifications;

    @pmi0("messages_recommendation_list_hidden")
    private final Boolean messagesRecommendationListHidden;

    @pmi0("messages_transcript_auto_show")
    private final Boolean messagesTranscriptAutoShow;

    @pmi0("messages_translation_language_pairs")
    private final List<String> messagesTranslationLanguagePairs;

    @pmi0("mini_apps_ads_slot_id")
    private final Integer miniAppsAdsSlotId;

    @pmi0("money_p2p_params")
    private final MoneyP2pParamsDto moneyP2pParams;

    @pmi0("music_background")
    private final AccountMusicBackgroundDto musicBackground;

    @pmi0("music_intro")
    private final Integer musicIntro;

    @pmi0("newsfeed")
    private final AccountNewsfeedOneOfDto newsfeed;

    @pmi0("no_wall_replies")
    private final BaseBoolIntDto noWallReplies;

    @pmi0("obscene_text_filter")
    private final Boolean obsceneTextFilter;

    @pmi0("own_posts_default")
    private final BaseBoolIntDto ownPostsDefault;

    @pmi0("page_size")
    private final AccountInfoPageSizeDto pageSize;

    @pmi0("phone")
    private final String phone;

    @pmi0("phone_status")
    private final PhoneStatusDto phoneStatus;

    @pmi0("phone_verify_delay")
    private final Integer phoneVerifyDelay;

    @pmi0("phone_verify_sid")
    private final String phoneVerifySid;

    @pmi0("profiler_enabled")
    private final Boolean profilerEnabled;

    @pmi0("profiler_settings")
    private final AccountInfoProfilerSettingsDto profilerSettings;

    @pmi0("qr_promotion")
    private final Integer qrPromotion;

    @pmi0("raise_to_record_enabled")
    private final Boolean raiseToRecordEnabled;

    @pmi0("reports_spa")
    private final Boolean reportsSpa;

    @pmi0("role")
    private final String role;

    @pmi0("rules_accept_hash")
    private final String rulesAcceptHash;

    @pmi0("security_issue")
    private final String securityIssue;

    @pmi0("send_audio_network_stats_until")
    private final Integer sendAudioNetworkStatsUntil;

    @pmi0("send_common_network_stats_until")
    private final Integer sendCommonNetworkStatsUntil;

    @pmi0("send_images_network_stats_until")
    private final Integer sendImagesNetworkStatsUntil;

    @pmi0("settings")
    private final List<AccountInfoSettingsDto> settings;

    @pmi0("shopping_params")
    private final AccountShoppingParamsDto shoppingParams;

    @pmi0("show_only_not_muted_messages")
    private final Boolean showOnlyNotMutedMessages;

    @pmi0("side_menu_custom_items")
    private final List<AccountInfoSideMenuCustomItemDto> sideMenuCustomItems;

    @pmi0("silent_mode_ended_at")
    private final Integer silentModeEndedAt;

    @pmi0("stickers_settings")
    private final StickersSettingsDto stickersSettings;

    @pmi0("stories")
    private final AccountInfoStoriesDto stories;

    @pmi0("stream_special_comment_price")
    private final Integer streamSpecialCommentPrice;

    @pmi0("subscription_combo_allowed")
    private final Boolean subscriptionComboAllowed;

    @pmi0("subscription_country")
    private final String subscriptionCountry;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    private final List<AccountSubscriptionsItemsInfoDto> subscriptions;

    @pmi0("support_url")
    private final String supportUrl;

    @pmi0("track_installed_apps")
    private final Boolean trackInstalledApps;

    @pmi0("unlocked_reactions")
    private final List<Integer> unlockedReactions;

    @pmi0("user_id_hash")
    private final String userIdHash;

    @pmi0("valid_from")
    private final AccountInfoObjectsValidFromDto validFrom;

    @pmi0("video_player")
    private final AccountInfoVideoPlayerDto videoPlayer;

    @pmi0("vk_pay_app_id")
    private final VkPayAppIdDto vkPayAppId;

    @pmi0("vk_pay_endpoint")
    private final String vkPayEndpoint;

    @pmi0("vk_pay_endpoint_v2")
    private final String vkPayEndpointV2;

    @pmi0("vklive")
    private final AccountInfoVkliveDto vklive;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountInfoDto.kt */
    public static final class FeedTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeedTypeDto[] $VALUES;
        public static final Parcelable.Creator<FeedTypeDto> CREATOR;

        @pmi0("recent")
        public static final FeedTypeDto RECENT;

        @pmi0("top")
        public static final FeedTypeDto TOP;
        private final String value;

        /* compiled from: AccountInfoDto.kt */
        public static final class a implements Parcelable.Creator<FeedTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final FeedTypeDto createFromParcel(Parcel parcel) {
                return FeedTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FeedTypeDto[] newArray(int i) {
                return new FeedTypeDto[i];
            }
        }

        static {
            FeedTypeDto feedTypeDto = new FeedTypeDto("RECENT", 0, "recent");
            RECENT = feedTypeDto;
            FeedTypeDto feedTypeDto2 = new FeedTypeDto("TOP", 1, "top");
            TOP = feedTypeDto2;
            FeedTypeDto[] feedTypeDtoArr = {feedTypeDto, feedTypeDto2};
            $VALUES = feedTypeDtoArr;
            $ENTRIES = new asp(feedTypeDtoArr);
            CREATOR = new a();
        }

        private FeedTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FeedTypeDto valueOf(String str) {
            return (FeedTypeDto) Enum.valueOf(FeedTypeDto.class, str);
        }

        public static FeedTypeDto[] values() {
            return (FeedTypeDto[]) $VALUES.clone();
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
    /* compiled from: AccountInfoDto.kt */
    public static final class PhoneStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhoneStatusDto[] $VALUES;
        public static final Parcelable.Creator<PhoneStatusDto> CREATOR;

        @pmi0("no_phone")
        public static final PhoneStatusDto NO_PHONE;

        @pmi0("validated")
        public static final PhoneStatusDto VALIDATED;

        @pmi0("waiting")
        public static final PhoneStatusDto WAITING;
        private final String value;

        /* compiled from: AccountInfoDto.kt */
        public static final class a implements Parcelable.Creator<PhoneStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final PhoneStatusDto createFromParcel(Parcel parcel) {
                return PhoneStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PhoneStatusDto[] newArray(int i) {
                return new PhoneStatusDto[i];
            }
        }

        static {
            PhoneStatusDto phoneStatusDto = new PhoneStatusDto("VALIDATED", 0, "validated");
            VALIDATED = phoneStatusDto;
            PhoneStatusDto phoneStatusDto2 = new PhoneStatusDto("WAITING", 1, "waiting");
            WAITING = phoneStatusDto2;
            PhoneStatusDto phoneStatusDto3 = new PhoneStatusDto("NO_PHONE", 2, "no_phone");
            NO_PHONE = phoneStatusDto3;
            PhoneStatusDto[] phoneStatusDtoArr = {phoneStatusDto, phoneStatusDto2, phoneStatusDto3};
            $VALUES = phoneStatusDtoArr;
            $ENTRIES = new asp(phoneStatusDtoArr);
            CREATOR = new a();
        }

        private PhoneStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PhoneStatusDto valueOf(String str) {
            return (PhoneStatusDto) Enum.valueOf(PhoneStatusDto.class, str);
        }

        public static PhoneStatusDto[] values() {
            return (PhoneStatusDto[]) $VALUES.clone();
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
    /* compiled from: AccountInfoDto.kt */
    public static final class VkPayAppIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkPayAppIdDto[] $VALUES;
        public static final Parcelable.Creator<VkPayAppIdDto> CREATOR;

        @pmi0("6217559")
        public static final VkPayAppIdDto VKPAY_APP;

        @pmi0("7131443")
        public static final VkPayAppIdDto VKPAY_DEV_APP;

        @pmi0("7658749")
        public static final VkPayAppIdDto VKPAY_LOCAL_APP;
        private final int value;

        /* compiled from: AccountInfoDto.kt */
        public static final class a implements Parcelable.Creator<VkPayAppIdDto> {
            @Override // android.os.Parcelable.Creator
            public final VkPayAppIdDto createFromParcel(Parcel parcel) {
                return VkPayAppIdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkPayAppIdDto[] newArray(int i) {
                return new VkPayAppIdDto[i];
            }
        }

        static {
            VkPayAppIdDto vkPayAppIdDto = new VkPayAppIdDto("VKPAY_DEV_APP", 0, 7131443);
            VKPAY_DEV_APP = vkPayAppIdDto;
            VkPayAppIdDto vkPayAppIdDto2 = new VkPayAppIdDto("VKPAY_LOCAL_APP", 1, 7658749);
            VKPAY_LOCAL_APP = vkPayAppIdDto2;
            VkPayAppIdDto vkPayAppIdDto3 = new VkPayAppIdDto("VKPAY_APP", 2, 6217559);
            VKPAY_APP = vkPayAppIdDto3;
            VkPayAppIdDto[] vkPayAppIdDtoArr = {vkPayAppIdDto, vkPayAppIdDto2, vkPayAppIdDto3};
            $VALUES = vkPayAppIdDtoArr;
            $ENTRIES = new asp(vkPayAppIdDtoArr);
            CREATOR = new a();
        }

        private VkPayAppIdDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkPayAppIdDto valueOf(String str) {
            return (VkPayAppIdDto) Enum.valueOf(VkPayAppIdDto.class, str);
        }

        public static VkPayAppIdDto[] values() {
            return (VkPayAppIdDto[]) $VALUES.clone();
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

    /* compiled from: AccountInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            BaseBoolIntDto baseBoolIntDto;
            AccountMusicBackgroundDto createFromParcel;
            Boolean valueOf4;
            Boolean valueOf5;
            AccountMusicBackgroundDto accountMusicBackgroundDto;
            AccountShoppingParamsDto createFromParcel2;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Object obj;
            MoneyP2pParamsDto createFromParcel3;
            Boolean valueOf11;
            BaseBoolIntDto baseBoolIntDto2;
            PhoneStatusDto createFromParcel4;
            Boolean valueOf12;
            PhoneStatusDto phoneStatusDto;
            AccountInfoProfilerSettingsDto createFromParcel5;
            Boolean valueOf13;
            AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto;
            ArrayList arrayList;
            NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto;
            FeedTypeDto feedTypeDto;
            Boolean bool;
            VkPayAppIdDto vkPayAppIdDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            AccountInfoObjectsValidFromDto accountInfoObjectsValidFromDto;
            AccountInfoVkliveDto accountInfoVkliveDto;
            AccountInfoStoriesDto createFromParcel6;
            AccountInfoStoriesDto accountInfoStoriesDto;
            AccountInfoPageSizeDto createFromParcel7;
            AccountInfoPageSizeDto accountInfoPageSizeDto;
            MessagesConversationBarDto createFromParcel8;
            Boolean valueOf14;
            MessagesConversationBarDto messagesConversationBarDto;
            AccountInfoAdsEasyPromoteMenuItemDto createFromParcel9;
            AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto;
            ArrayList arrayList4;
            ArrayList arrayList5;
            AccountInfoVideoPlayerDto accountInfoVideoPlayerDto;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            Boolean valueOf18;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            Boolean bool2;
            ArrayList arrayList6;
            Boolean bool3;
            String str;
            Object obj2;
            BaseBoolIntDto baseBoolIntDto3;
            Boolean bool4;
            Integer num;
            Boolean bool5;
            Integer num2;
            AccountMusicBackgroundDto accountMusicBackgroundDto2;
            Integer num3;
            Integer num4;
            Boolean bool6;
            Object obj3;
            Boolean bool7;
            Boolean bool8;
            Boolean bool9;
            Integer num5;
            MoneyP2pParamsDto moneyP2pParamsDto;
            BaseBoolIntDto baseBoolIntDto4;
            PhoneStatusDto phoneStatusDto2;
            AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto2;
            ArrayList arrayList7;
            AccountInfoVkliveDto accountInfoVkliveDto2;
            AccountInfoStoriesDto accountInfoStoriesDto2;
            AccountInfoPageSizeDto accountInfoPageSizeDto2;
            MessagesConversationBarDto messagesConversationBarDto2;
            AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto2;
            ArrayList arrayList8;
            Boolean valueOf22;
            AccountMessagesReactionNotificationsSettingsDto accountMessagesReactionNotificationsSettingsDto;
            AccountInfoMarketAdult18plusDto createFromParcel10;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto;
            AccountInfoMessagesCounterSettingsDto createFromParcel11;
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(AccountInfoDto.class.getClassLoader());
            AudioAdsConfigDto createFromParcel12 = parcel.readInt() == 0 ? null : AudioAdsConfigDto.CREATOR.createFromParcel(parcel);
            AudioPermissionsDto createFromParcel13 = parcel.readInt() == 0 ? null : AudioPermissionsDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(AccountInfoDto.class.getClassLoader());
            StickersSettingsDto createFromParcel14 = parcel.readInt() == 0 ? null : StickersSettingsDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            NewsfeedFeedPreloadingDto createFromParcel15 = parcel.readInt() == 0 ? null : NewsfeedFeedPreloadingDto.CREATOR.createFromParcel(parcel);
            FeedTypeDto createFromParcel16 = parcel.readInt() == 0 ? null : FeedTypeDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(AccountInfoDto.class.getClassLoader());
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(AccountInfoDto.class.getClassLoader());
            Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto8;
                createFromParcel = null;
            } else {
                baseBoolIntDto = baseBoolIntDto8;
                createFromParcel = AccountMusicBackgroundDto.CREATOR.createFromParcel(parcel);
            }
            AccountMusicBackgroundDto accountMusicBackgroundDto3 = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                accountMusicBackgroundDto = accountMusicBackgroundDto3;
                createFromParcel2 = null;
            } else {
                accountMusicBackgroundDto = accountMusicBackgroundDto3;
                createFromParcel2 = AccountShoppingParamsDto.CREATOR.createFromParcel(parcel);
            }
            AccountShoppingParamsDto accountShoppingParamsDto = createFromParcel2;
            Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue = parcel.readValue(AccountInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = baseBoolIntDto;
            Boolean bool10 = valueOf4;
            Integer num6 = valueOf28;
            Boolean bool11 = valueOf5;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString11 = parcel.readString();
            Boolean bool12 = valueOf7;
            String readString12 = parcel.readString();
            Object readValue2 = parcel.readValue(AccountInfoDto.class.getClassLoader());
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
            Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                obj = readValue2;
                createFromParcel3 = null;
            } else {
                obj = readValue2;
                createFromParcel3 = MoneyP2pParamsDto.CREATOR.createFromParcel(parcel);
            }
            MoneyP2pParamsDto moneyP2pParamsDto2 = createFromParcel3;
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(AccountInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(AccountInfoDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto11;
                createFromParcel4 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto11;
                createFromParcel4 = PhoneStatusDto.CREATOR.createFromParcel(parcel);
            }
            PhoneStatusDto phoneStatusDto3 = createFromParcel4;
            Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                phoneStatusDto = phoneStatusDto3;
                createFromParcel5 = null;
            } else {
                phoneStatusDto = phoneStatusDto3;
                createFromParcel5 = AccountInfoProfilerSettingsDto.CREATOR.createFromParcel(parcel);
            }
            AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto3 = createFromParcel5;
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                accountInfoProfilerSettingsDto = accountInfoProfilerSettingsDto3;
                newsfeedFeedPreloadingDto = createFromParcel15;
                feedTypeDto = createFromParcel16;
                bool = valueOf;
                arrayList = null;
            } else {
                accountInfoProfilerSettingsDto = accountInfoProfilerSettingsDto3;
                int readInt = parcel.readInt();
                Boolean bool13 = valueOf;
                arrayList = new ArrayList(readInt);
                newsfeedFeedPreloadingDto = createFromParcel15;
                int i = 0;
                while (i != readInt) {
                    i = en.a(AccountInfoSettingsDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                    baseBoolIntDto5 = baseBoolIntDto5;
                }
                feedTypeDto = createFromParcel16;
                bool = bool13;
            }
            BaseBoolIntDto baseBoolIntDto12 = baseBoolIntDto5;
            String readString16 = parcel.readString();
            AccountInfoObjectsValidFromDto createFromParcel17 = parcel.readInt() == 0 ? null : AccountInfoObjectsValidFromDto.CREATOR.createFromParcel(parcel);
            AccountInfoObjectsCommentRestrictionDto createFromParcel18 = parcel.readInt() == 0 ? null : AccountInfoObjectsCommentRestrictionDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto13 = baseBoolIntDto12;
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            VkPayAppIdDto createFromParcel19 = parcel.readInt() != 0 ? VkPayAppIdDto.CREATOR.createFromParcel(parcel) : null;
            Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf35 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf36 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                vkPayAppIdDto = createFromParcel19;
                arrayList2 = arrayList;
                accountInfoObjectsValidFromDto = createFromParcel17;
                arrayList3 = null;
            } else {
                vkPayAppIdDto = createFromParcel19;
                int readInt2 = parcel.readInt();
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(readInt2);
                accountInfoObjectsValidFromDto = createFromParcel17;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(AccountSubscriptionsItemsInfoDto.CREATOR, parcel, arrayList3, i2, 1);
                    readInt2 = readInt2;
                    baseBoolIntDto13 = baseBoolIntDto13;
                }
            }
            BaseBoolIntDto baseBoolIntDto14 = baseBoolIntDto13;
            AccountInfoVkliveDto createFromParcel20 = parcel.readInt() == 0 ? null : AccountInfoVkliveDto.CREATOR.createFromParcel(parcel);
            AccountInfoVideoPlayerDto createFromParcel21 = parcel.readInt() == 0 ? null : AccountInfoVideoPlayerDto.CREATOR.createFromParcel(parcel);
            AccountInfoCacheDto createFromParcel22 = parcel.readInt() == 0 ? null : AccountInfoCacheDto.CREATOR.createFromParcel(parcel);
            AccountNewsfeedOneOfDto createFromParcel23 = parcel.readInt() == 0 ? null : AccountNewsfeedOneOfDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                accountInfoVkliveDto = createFromParcel20;
                createFromParcel6 = null;
            } else {
                accountInfoVkliveDto = createFromParcel20;
                createFromParcel6 = AccountInfoStoriesDto.CREATOR.createFromParcel(parcel);
            }
            AccountInfoStoriesDto accountInfoStoriesDto3 = createFromParcel6;
            if (parcel.readInt() == 0) {
                accountInfoStoriesDto = accountInfoStoriesDto3;
                createFromParcel7 = null;
            } else {
                accountInfoStoriesDto = accountInfoStoriesDto3;
                createFromParcel7 = AccountInfoPageSizeDto.CREATOR.createFromParcel(parcel);
            }
            AccountInfoPageSizeDto accountInfoPageSizeDto3 = createFromParcel7;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                accountInfoPageSizeDto = accountInfoPageSizeDto3;
                createFromParcel8 = null;
            } else {
                accountInfoPageSizeDto = accountInfoPageSizeDto3;
                createFromParcel8 = MessagesConversationBarDto.CREATOR.createFromParcel(parcel);
            }
            MessagesConversationBarDto messagesConversationBarDto3 = createFromParcel8;
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                messagesConversationBarDto = messagesConversationBarDto3;
                createFromParcel9 = null;
            } else {
                messagesConversationBarDto = messagesConversationBarDto3;
                createFromParcel9 = AccountInfoAdsEasyPromoteMenuItemDto.CREATOR.createFromParcel(parcel);
            }
            AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto3 = createFromParcel9;
            if (parcel.readInt() == 0) {
                accountInfoAdsEasyPromoteMenuItemDto = accountInfoAdsEasyPromoteMenuItemDto3;
                arrayList4 = arrayList3;
                accountInfoVideoPlayerDto = createFromParcel21;
                arrayList5 = null;
            } else {
                accountInfoAdsEasyPromoteMenuItemDto = accountInfoAdsEasyPromoteMenuItemDto3;
                int readInt3 = parcel.readInt();
                arrayList4 = arrayList3;
                arrayList5 = new ArrayList(readInt3);
                accountInfoVideoPlayerDto = createFromParcel21;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(AccountInfoSideMenuCustomItemDto.CREATOR, parcel, arrayList5, i3, 1);
                    readInt3 = readInt3;
                    createFromParcel23 = createFromParcel23;
                }
            }
            AccountNewsfeedOneOfDto accountNewsfeedOneOfDto = createFromParcel23;
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
                valueOf20 = null;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf21 = null;
            } else {
                valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = valueOf15;
                bool3 = valueOf16;
                str = readString6;
                obj2 = obj;
                baseBoolIntDto3 = baseBoolIntDto10;
                bool4 = valueOf11;
                num = valueOf26;
                bool5 = valueOf3;
                num2 = valueOf27;
                accountMusicBackgroundDto2 = accountMusicBackgroundDto;
                num3 = valueOf29;
                num4 = valueOf30;
                bool6 = valueOf6;
                obj3 = readValue;
                bool7 = valueOf8;
                bool8 = valueOf9;
                bool9 = valueOf10;
                num5 = valueOf31;
                moneyP2pParamsDto = moneyP2pParamsDto2;
                baseBoolIntDto4 = baseBoolIntDto2;
                phoneStatusDto2 = phoneStatusDto;
                accountInfoProfilerSettingsDto2 = accountInfoProfilerSettingsDto;
                arrayList7 = arrayList2;
                accountInfoVkliveDto2 = accountInfoVkliveDto;
                accountInfoStoriesDto2 = accountInfoStoriesDto;
                accountInfoPageSizeDto2 = accountInfoPageSizeDto;
                messagesConversationBarDto2 = messagesConversationBarDto;
                accountInfoAdsEasyPromoteMenuItemDto2 = accountInfoAdsEasyPromoteMenuItemDto;
                arrayList8 = arrayList5;
                arrayList6 = null;
            } else {
                bool2 = valueOf15;
                int readInt4 = parcel.readInt();
                ArrayList arrayList9 = arrayList5;
                arrayList6 = new ArrayList(readInt4);
                bool3 = valueOf16;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = pm0.b(parcel, arrayList6, i4, 1);
                    readInt4 = readInt4;
                }
                str = readString6;
                obj2 = obj;
                baseBoolIntDto3 = baseBoolIntDto10;
                bool4 = valueOf11;
                num = valueOf26;
                bool5 = valueOf3;
                num2 = valueOf27;
                accountMusicBackgroundDto2 = accountMusicBackgroundDto;
                num3 = valueOf29;
                num4 = valueOf30;
                bool6 = valueOf6;
                obj3 = readValue;
                bool7 = valueOf8;
                bool8 = valueOf9;
                bool9 = valueOf10;
                num5 = valueOf31;
                moneyP2pParamsDto = moneyP2pParamsDto2;
                baseBoolIntDto4 = baseBoolIntDto2;
                phoneStatusDto2 = phoneStatusDto;
                accountInfoProfilerSettingsDto2 = accountInfoProfilerSettingsDto;
                arrayList7 = arrayList2;
                accountInfoVkliveDto2 = accountInfoVkliveDto;
                accountInfoStoriesDto2 = accountInfoStoriesDto;
                accountInfoPageSizeDto2 = accountInfoPageSizeDto;
                messagesConversationBarDto2 = messagesConversationBarDto;
                accountInfoAdsEasyPromoteMenuItemDto2 = accountInfoAdsEasyPromoteMenuItemDto;
                arrayList8 = arrayList9;
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            Integer valueOf37 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AccountMessagesReactionNotificationsSettingsDto createFromParcel24 = parcel.readInt() == 0 ? null : AccountMessagesReactionNotificationsSettingsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                accountMessagesReactionNotificationsSettingsDto = createFromParcel24;
                createFromParcel10 = null;
            } else {
                accountMessagesReactionNotificationsSettingsDto = createFromParcel24;
                createFromParcel10 = AccountInfoMarketAdult18plusDto.CREATOR.createFromParcel(parcel);
            }
            AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto2 = createFromParcel10;
            if (parcel.readInt() == 0) {
                valueOf23 = null;
            } else {
                valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf24 = null;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString19 = parcel.readString();
            if (parcel.readInt() == 0) {
                accountInfoMarketAdult18plusDto = accountInfoMarketAdult18plusDto2;
                createFromParcel11 = null;
            } else {
                accountInfoMarketAdult18plusDto = accountInfoMarketAdult18plusDto2;
                createFromParcel11 = AccountInfoMessagesCounterSettingsDto.CREATOR.createFromParcel(parcel);
            }
            return new AccountInfoDto(baseBoolIntDto14, createFromParcel12, createFromParcel13, baseBoolIntDto6, createFromParcel14, readString, readString2, readString3, bool, readString4, readString5, valueOf2, newsfeedFeedPreloadingDto, feedTypeDto, baseBoolIntDto7, str, readString7, readString8, baseBoolIntDto9, num, bool5, num2, accountMusicBackgroundDto2, bool10, num6, bool11, accountShoppingParamsDto, num3, num4, bool6, obj3, readString9, readString10, bool12, readString11, readString12, obj2, bool7, bool8, bool9, num5, moneyP2pParamsDto, baseBoolIntDto3, baseBoolIntDto4, bool4, readString13, phoneStatusDto2, valueOf32, readString14, valueOf12, accountInfoProfilerSettingsDto2, readString15, valueOf13, arrayList7, readString16, accountInfoObjectsValidFromDto, createFromParcel18, readString17, readString18, vkPayAppIdDto, valueOf33, valueOf34, valueOf35, valueOf36, arrayList4, accountInfoVkliveDto2, accountInfoVideoPlayerDto, createFromParcel22, accountNewsfeedOneOfDto, accountInfoStoriesDto2, accountInfoPageSizeDto2, createStringArrayList, messagesConversationBarDto2, valueOf14, accountInfoAdsEasyPromoteMenuItemDto2, arrayList8, bool2, bool3, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, arrayList6, createStringArrayList2, valueOf37, valueOf22, accountMessagesReactionNotificationsSettingsDto, accountInfoMarketAdult18plusDto, valueOf23, valueOf24, valueOf25, readString19, createFromParcel11);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoDto[] newArray(int i) {
            return new AccountInfoDto[i];
        }
    }

    public AccountInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1073741823, null);
    }

    public final BaseBoolIntDto B() {
        return this.ownPostsDefault;
    }

    public final String C() {
        return this.phone;
    }

    public final PhoneStatusDto D() {
        return this.phoneStatus;
    }

    public final String D0() {
        return this.vkPayEndpointV2;
    }

    public final Boolean F() {
        return this.profilerEnabled;
    }

    public final AccountInfoProfilerSettingsDto G() {
        return this.profilerSettings;
    }

    public final String K() {
        return this.role;
    }

    public final Integer M() {
        return this.sendAudioNetworkStatsUntil;
    }

    public final Integer R() {
        return this.sendCommonNetworkStatsUntil;
    }

    public final Integer T() {
        return this.sendImagesNetworkStatsUntil;
    }

    public final List<AccountInfoSettingsDto> W() {
        return this.settings;
    }

    public final Boolean Z() {
        return this.subscriptionComboAllowed;
    }

    public final List<AccountSubscriptionsItemsInfoDto> a0() {
        return this.subscriptions;
    }

    public final AudioAdsConfigDto d() {
        return this.audioAds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.changeEmailUrlWat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoDto)) {
            return false;
        }
        AccountInfoDto accountInfoDto = (AccountInfoDto) obj;
        return this.f12faRequired == accountInfoDto.f12faRequired && epx.f(this.audioAds, accountInfoDto.audioAds) && epx.f(this.audioPermissions, accountInfoDto.audioPermissions) && this.businessNotifyEnabled == accountInfoDto.businessNotifyEnabled && epx.f(this.stickersSettings, accountInfoDto.stickersSettings) && epx.f(this.changeEmailUrlWat, accountInfoDto.changeEmailUrlWat) && epx.f(this.changePhoneUrlWat, accountInfoDto.changePhoneUrlWat) && epx.f(this.country, accountInfoDto.country) && epx.f(this.debugAvailable, accountInfoDto.debugAvailable) && epx.f(this.email, accountInfoDto.email) && epx.f(this.emailStatus, accountInfoDto.emailStatus) && epx.f(this.euUser, accountInfoDto.euUser) && epx.f(this.feedPreloading, accountInfoDto.feedPreloading) && this.feedType == accountInfoDto.feedType && this.feedTypeForced == accountInfoDto.feedTypeForced && epx.f(this.feedApplovinUnitId, accountInfoDto.feedApplovinUnitId) && epx.f(this.feedYandexAdsUnitId, accountInfoDto.feedYandexAdsUnitId) && epx.f(this.userIdHash, accountInfoDto.userIdHash) && this.httpsRequired == accountInfoDto.httpsRequired && epx.f(this.intro, accountInfoDto.intro) && epx.f(this.isTopicExpert, accountInfoDto.isTopicExpert) && epx.f(this.musicIntro, accountInfoDto.musicIntro) && epx.f(this.musicBackground, accountInfoDto.musicBackground) && epx.f(this.audioAutoplay, accountInfoDto.audioAutoplay) && epx.f(this.faveIntro, accountInfoDto.faveIntro) && epx.f(this.menuIntro, accountInfoDto.menuIntro) && epx.f(this.shoppingParams, accountInfoDto.shoppingParams) && epx.f(this.miniAppsAdsSlotId, accountInfoDto.miniAppsAdsSlotId) && epx.f(this.qrPromotion, accountInfoDto.qrPromotion) && epx.f(this.communityComments, accountInfoDto.communityComments) && epx.f(this.linkRedirects, accountInfoDto.linkRedirects) && epx.f(this.rulesAcceptHash, accountInfoDto.rulesAcceptHash) && epx.f(this.subscriptionCountry, accountInfoDto.subscriptionCountry) && epx.f(this.trackInstalledApps, accountInfoDto.trackInstalledApps) && epx.f(this.inviteLink, accountInfoDto.inviteLink) && epx.f(this.securityIssue, accountInfoDto.securityIssue) && epx.f(this.clickableStickers, accountInfoDto.clickableStickers) && epx.f(this.reportsSpa, accountInfoDto.reportsSpa) && epx.f(this.isLiveStreamingEnabled, accountInfoDto.isLiveStreamingEnabled) && epx.f(this.isNewLiveStreamingEnabled, accountInfoDto.isNewLiveStreamingEnabled) && epx.f(this.lang, accountInfoDto.lang) && epx.f(this.moneyP2pParams, accountInfoDto.moneyP2pParams) && this.noWallReplies == accountInfoDto.noWallReplies && this.ownPostsDefault == accountInfoDto.ownPostsDefault && epx.f(this.commentSubmitType, accountInfoDto.commentSubmitType) && epx.f(this.phone, accountInfoDto.phone) && this.phoneStatus == accountInfoDto.phoneStatus && epx.f(this.phoneVerifyDelay, accountInfoDto.phoneVerifyDelay) && epx.f(this.phoneVerifySid, accountInfoDto.phoneVerifySid) && epx.f(this.profilerEnabled, accountInfoDto.profilerEnabled) && epx.f(this.profilerSettings, accountInfoDto.profilerSettings) && epx.f(this.role, accountInfoDto.role) && epx.f(this.raiseToRecordEnabled, accountInfoDto.raiseToRecordEnabled) && epx.f(this.settings, accountInfoDto.settings) && epx.f(this.supportUrl, accountInfoDto.supportUrl) && epx.f(this.validFrom, accountInfoDto.validFrom) && epx.f(this.commentRestriction, accountInfoDto.commentRestriction) && epx.f(this.vkPayEndpoint, accountInfoDto.vkPayEndpoint) && epx.f(this.vkPayEndpointV2, accountInfoDto.vkPayEndpointV2) && this.vkPayAppId == accountInfoDto.vkPayAppId && epx.f(this.sendCommonNetworkStatsUntil, accountInfoDto.sendCommonNetworkStatsUntil) && epx.f(this.sendImagesNetworkStatsUntil, accountInfoDto.sendImagesNetworkStatsUntil) && epx.f(this.sendAudioNetworkStatsUntil, accountInfoDto.sendAudioNetworkStatsUntil) && epx.f(this.streamSpecialCommentPrice, accountInfoDto.streamSpecialCommentPrice) && epx.f(this.subscriptions, accountInfoDto.subscriptions) && epx.f(this.vklive, accountInfoDto.vklive) && epx.f(this.videoPlayer, accountInfoDto.videoPlayer) && epx.f(this.cache, accountInfoDto.cache) && epx.f(this.newsfeed, accountInfoDto.newsfeed) && epx.f(this.stories, accountInfoDto.stories) && epx.f(this.pageSize, accountInfoDto.pageSize) && epx.f(this.jsInjections, accountInfoDto.jsInjections) && epx.f(this.conversationsBar, accountInfoDto.conversationsBar) && epx.f(this.hasMessagesInLastTwoWeek, accountInfoDto.hasMessagesInLastTwoWeek) && epx.f(this.menuAdsEasyPromote, accountInfoDto.menuAdsEasyPromote) && epx.f(this.sideMenuCustomItems, accountInfoDto.sideMenuCustomItems) && epx.f(this.subscriptionComboAllowed, accountInfoDto.subscriptionComboAllowed) && epx.f(this.showOnlyNotMutedMessages, accountInfoDto.showOnlyNotMutedMessages) && epx.f(this.includeChannelNotifications, accountInfoDto.includeChannelNotifications) && epx.f(this.messagesAutoUnarchive, accountInfoDto.messagesAutoUnarchive) && epx.f(this.messagesTranscriptAutoShow, accountInfoDto.messagesTranscriptAutoShow) && epx.f(this.messagesRecommendationListHidden, accountInfoDto.messagesRecommendationListHidden) && epx.f(this.messagesMultilineInput, accountInfoDto.messagesMultilineInput) && epx.f(this.unlockedReactions, accountInfoDto.unlockedReactions) && epx.f(this.messagesTranslationLanguagePairs, accountInfoDto.messagesTranslationLanguagePairs) && epx.f(this.silentModeEndedAt, accountInfoDto.silentModeEndedAt) && epx.f(this.obsceneTextFilter, accountInfoDto.obsceneTextFilter) && epx.f(this.messagesReactionNotifications, accountInfoDto.messagesReactionNotifications) && epx.f(this.marketAdult18plus, accountInfoDto.marketAdult18plus) && epx.f(this.canChangePassword, accountInfoDto.canChangePassword) && epx.f(this.isPersonalAdsEasyPromoteEnabled, accountInfoDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.isAdsEasyPromoteEnabled, accountInfoDto.isAdsEasyPromoteEnabled) && epx.f(this.adsEasyPromoteOnboardingName, accountInfoDto.adsEasyPromoteOnboardingName) && epx.f(this.messagesCounterSettings, accountInfoDto.messagesCounterSettings);
    }

    public final String f() {
        return this.changePhoneUrlWat;
    }

    public final MessagesConversationBarDto g() {
        return this.conversationsBar;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.f12faRequired;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        AudioAdsConfigDto audioAdsConfigDto = this.audioAds;
        int hashCode2 = (hashCode + (audioAdsConfigDto == null ? 0 : audioAdsConfigDto.hashCode())) * 31;
        AudioPermissionsDto audioPermissionsDto = this.audioPermissions;
        int hashCode3 = (hashCode2 + (audioPermissionsDto == null ? 0 : audioPermissionsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.businessNotifyEnabled;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        StickersSettingsDto stickersSettingsDto = this.stickersSettings;
        int hashCode5 = (hashCode4 + (stickersSettingsDto == null ? 0 : stickersSettingsDto.hashCode())) * 31;
        String str = this.changeEmailUrlWat;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.changePhoneUrlWat;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.debugAvailable;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.email;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.emailStatus;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.euUser;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto = this.feedPreloading;
        int hashCode13 = (hashCode12 + (newsfeedFeedPreloadingDto == null ? 0 : newsfeedFeedPreloadingDto.hashCode())) * 31;
        FeedTypeDto feedTypeDto = this.feedType;
        int hashCode14 = (hashCode13 + (feedTypeDto == null ? 0 : feedTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.feedTypeForced;
        int hashCode15 = (hashCode14 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str6 = this.feedApplovinUnitId;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.feedYandexAdsUnitId;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userIdHash;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.httpsRequired;
        int hashCode19 = (hashCode18 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        Integer num = this.intro;
        int hashCode20 = (hashCode19 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.isTopicExpert;
        int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.musicIntro;
        int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AccountMusicBackgroundDto accountMusicBackgroundDto = this.musicBackground;
        int hashCode23 = (hashCode22 + (accountMusicBackgroundDto == null ? 0 : accountMusicBackgroundDto.hashCode())) * 31;
        Boolean bool4 = this.audioAutoplay;
        int hashCode24 = (hashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.faveIntro;
        int hashCode25 = (hashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.menuIntro;
        int hashCode26 = (hashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        AccountShoppingParamsDto accountShoppingParamsDto = this.shoppingParams;
        int hashCode27 = (hashCode26 + (accountShoppingParamsDto == null ? 0 : accountShoppingParamsDto.hashCode())) * 31;
        Integer num4 = this.miniAppsAdsSlotId;
        int hashCode28 = (hashCode27 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.qrPromotion;
        int hashCode29 = (hashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool6 = this.communityComments;
        int hashCode30 = (hashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Object obj = this.linkRedirects;
        int hashCode31 = (hashCode30 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str9 = this.rulesAcceptHash;
        int hashCode32 = (hashCode31 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.subscriptionCountry;
        int hashCode33 = (hashCode32 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool7 = this.trackInstalledApps;
        int hashCode34 = (hashCode33 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str11 = this.inviteLink;
        int hashCode35 = (hashCode34 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.securityIssue;
        int hashCode36 = (hashCode35 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Object obj2 = this.clickableStickers;
        int hashCode37 = (hashCode36 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Boolean bool8 = this.reportsSpa;
        int hashCode38 = (hashCode37 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isLiveStreamingEnabled;
        int hashCode39 = (hashCode38 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isNewLiveStreamingEnabled;
        int hashCode40 = (hashCode39 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num6 = this.lang;
        int hashCode41 = (hashCode40 + (num6 == null ? 0 : num6.hashCode())) * 31;
        MoneyP2pParamsDto moneyP2pParamsDto = this.moneyP2pParams;
        int hashCode42 = (hashCode41 + (moneyP2pParamsDto == null ? 0 : moneyP2pParamsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.noWallReplies;
        int hashCode43 = (hashCode42 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.ownPostsDefault;
        int hashCode44 = (hashCode43 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        Boolean bool11 = this.commentSubmitType;
        int hashCode45 = (hashCode44 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str13 = this.phone;
        int hashCode46 = (hashCode45 + (str13 == null ? 0 : str13.hashCode())) * 31;
        PhoneStatusDto phoneStatusDto = this.phoneStatus;
        int hashCode47 = (hashCode46 + (phoneStatusDto == null ? 0 : phoneStatusDto.hashCode())) * 31;
        Integer num7 = this.phoneVerifyDelay;
        int hashCode48 = (hashCode47 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str14 = this.phoneVerifySid;
        int hashCode49 = (hashCode48 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool12 = this.profilerEnabled;
        int hashCode50 = (hashCode49 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto = this.profilerSettings;
        int hashCode51 = (hashCode50 + (accountInfoProfilerSettingsDto == null ? 0 : accountInfoProfilerSettingsDto.hashCode())) * 31;
        String str15 = this.role;
        int hashCode52 = (hashCode51 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool13 = this.raiseToRecordEnabled;
        int hashCode53 = (hashCode52 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        List<AccountInfoSettingsDto> list = this.settings;
        int hashCode54 = (hashCode53 + (list == null ? 0 : list.hashCode())) * 31;
        String str16 = this.supportUrl;
        int hashCode55 = (hashCode54 + (str16 == null ? 0 : str16.hashCode())) * 31;
        AccountInfoObjectsValidFromDto accountInfoObjectsValidFromDto = this.validFrom;
        int hashCode56 = (hashCode55 + (accountInfoObjectsValidFromDto == null ? 0 : accountInfoObjectsValidFromDto.hashCode())) * 31;
        AccountInfoObjectsCommentRestrictionDto accountInfoObjectsCommentRestrictionDto = this.commentRestriction;
        int hashCode57 = (hashCode56 + (accountInfoObjectsCommentRestrictionDto == null ? 0 : accountInfoObjectsCommentRestrictionDto.hashCode())) * 31;
        String str17 = this.vkPayEndpoint;
        int hashCode58 = (hashCode57 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.vkPayEndpointV2;
        int hashCode59 = (hashCode58 + (str18 == null ? 0 : str18.hashCode())) * 31;
        VkPayAppIdDto vkPayAppIdDto = this.vkPayAppId;
        int hashCode60 = (hashCode59 + (vkPayAppIdDto == null ? 0 : vkPayAppIdDto.hashCode())) * 31;
        Integer num8 = this.sendCommonNetworkStatsUntil;
        int hashCode61 = (hashCode60 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.sendImagesNetworkStatsUntil;
        int hashCode62 = (hashCode61 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.sendAudioNetworkStatsUntil;
        int hashCode63 = (hashCode62 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.streamSpecialCommentPrice;
        int hashCode64 = (hashCode63 + (num11 == null ? 0 : num11.hashCode())) * 31;
        List<AccountSubscriptionsItemsInfoDto> list2 = this.subscriptions;
        int hashCode65 = (hashCode64 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AccountInfoVkliveDto accountInfoVkliveDto = this.vklive;
        int hashCode66 = (hashCode65 + (accountInfoVkliveDto == null ? 0 : accountInfoVkliveDto.hashCode())) * 31;
        AccountInfoVideoPlayerDto accountInfoVideoPlayerDto = this.videoPlayer;
        int hashCode67 = (hashCode66 + (accountInfoVideoPlayerDto == null ? 0 : accountInfoVideoPlayerDto.hashCode())) * 31;
        AccountInfoCacheDto accountInfoCacheDto = this.cache;
        int hashCode68 = (hashCode67 + (accountInfoCacheDto == null ? 0 : accountInfoCacheDto.hashCode())) * 31;
        AccountNewsfeedOneOfDto accountNewsfeedOneOfDto = this.newsfeed;
        int hashCode69 = (hashCode68 + (accountNewsfeedOneOfDto == null ? 0 : accountNewsfeedOneOfDto.hashCode())) * 31;
        AccountInfoStoriesDto accountInfoStoriesDto = this.stories;
        int hashCode70 = (hashCode69 + (accountInfoStoriesDto == null ? 0 : accountInfoStoriesDto.hashCode())) * 31;
        AccountInfoPageSizeDto accountInfoPageSizeDto = this.pageSize;
        int hashCode71 = (hashCode70 + (accountInfoPageSizeDto == null ? 0 : accountInfoPageSizeDto.hashCode())) * 31;
        List<String> list3 = this.jsInjections;
        int hashCode72 = (hashCode71 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MessagesConversationBarDto messagesConversationBarDto = this.conversationsBar;
        int hashCode73 = (hashCode72 + (messagesConversationBarDto == null ? 0 : messagesConversationBarDto.hashCode())) * 31;
        Boolean bool14 = this.hasMessagesInLastTwoWeek;
        int hashCode74 = (hashCode73 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto = this.menuAdsEasyPromote;
        int hashCode75 = (hashCode74 + (accountInfoAdsEasyPromoteMenuItemDto == null ? 0 : accountInfoAdsEasyPromoteMenuItemDto.hashCode())) * 31;
        List<AccountInfoSideMenuCustomItemDto> list4 = this.sideMenuCustomItems;
        int hashCode76 = (hashCode75 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool15 = this.subscriptionComboAllowed;
        int hashCode77 = (hashCode76 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.showOnlyNotMutedMessages;
        int hashCode78 = (hashCode77 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.includeChannelNotifications;
        int hashCode79 = (hashCode78 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.messagesAutoUnarchive;
        int hashCode80 = (hashCode79 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.messagesTranscriptAutoShow;
        int hashCode81 = (hashCode80 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.messagesRecommendationListHidden;
        int hashCode82 = (hashCode81 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.messagesMultilineInput;
        int hashCode83 = (hashCode82 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        List<Integer> list5 = this.unlockedReactions;
        int hashCode84 = (hashCode83 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.messagesTranslationLanguagePairs;
        int hashCode85 = (hashCode84 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num12 = this.silentModeEndedAt;
        int hashCode86 = (hashCode85 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Boolean bool22 = this.obsceneTextFilter;
        int hashCode87 = (hashCode86 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        AccountMessagesReactionNotificationsSettingsDto accountMessagesReactionNotificationsSettingsDto = this.messagesReactionNotifications;
        int hashCode88 = (hashCode87 + (accountMessagesReactionNotificationsSettingsDto == null ? 0 : accountMessagesReactionNotificationsSettingsDto.hashCode())) * 31;
        AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto = this.marketAdult18plus;
        int hashCode89 = (hashCode88 + (accountInfoMarketAdult18plusDto == null ? 0 : accountInfoMarketAdult18plusDto.hashCode())) * 31;
        Boolean bool23 = this.canChangePassword;
        int hashCode90 = (hashCode89 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode91 = (hashCode90 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.isAdsEasyPromoteEnabled;
        int hashCode92 = (hashCode91 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        String str19 = this.adsEasyPromoteOnboardingName;
        int hashCode93 = (hashCode92 + (str19 == null ? 0 : str19.hashCode())) * 31;
        AccountInfoMessagesCounterSettingsDto accountInfoMessagesCounterSettingsDto = this.messagesCounterSettings;
        return hashCode93 + (accountInfoMessagesCounterSettingsDto != null ? accountInfoMessagesCounterSettingsDto.hashCode() : 0);
    }

    public final String i() {
        return this.email;
    }

    public final String j() {
        return this.emailStatus;
    }

    public final Object k() {
        return this.linkRedirects;
    }

    public final AccountInfoMarketAdult18plusDto l() {
        return this.marketAdult18plus;
    }

    public final String l0() {
        return this.supportUrl;
    }

    public final AccountInfoMessagesCounterSettingsDto n() {
        return this.messagesCounterSettings;
    }

    public final List<String> o() {
        return this.messagesTranslationLanguagePairs;
    }

    public final MoneyP2pParamsDto p() {
        return this.moneyP2pParams;
    }

    public final String toString() {
        return "AccountInfoDto(2faRequired=" + this.f12faRequired + ", audioAds=" + this.audioAds + ", audioPermissions=" + this.audioPermissions + ", businessNotifyEnabled=" + this.businessNotifyEnabled + ", stickersSettings=" + this.stickersSettings + ", changeEmailUrlWat=" + this.changeEmailUrlWat + ", changePhoneUrlWat=" + this.changePhoneUrlWat + ", country=" + this.country + ", debugAvailable=" + this.debugAvailable + ", email=" + this.email + ", emailStatus=" + this.emailStatus + ", euUser=" + this.euUser + ", feedPreloading=" + this.feedPreloading + ", feedType=" + this.feedType + ", feedTypeForced=" + this.feedTypeForced + ", feedApplovinUnitId=" + this.feedApplovinUnitId + ", feedYandexAdsUnitId=" + this.feedYandexAdsUnitId + ", userIdHash=" + this.userIdHash + ", httpsRequired=" + this.httpsRequired + ", intro=" + this.intro + ", isTopicExpert=" + this.isTopicExpert + ", musicIntro=" + this.musicIntro + ", musicBackground=" + this.musicBackground + ", audioAutoplay=" + this.audioAutoplay + ", faveIntro=" + this.faveIntro + ", menuIntro=" + this.menuIntro + ", shoppingParams=" + this.shoppingParams + ", miniAppsAdsSlotId=" + this.miniAppsAdsSlotId + ", qrPromotion=" + this.qrPromotion + ", communityComments=" + this.communityComments + ", linkRedirects=" + this.linkRedirects + ", rulesAcceptHash=" + this.rulesAcceptHash + ", subscriptionCountry=" + this.subscriptionCountry + ", trackInstalledApps=" + this.trackInstalledApps + ", inviteLink=" + this.inviteLink + ", securityIssue=" + this.securityIssue + ", clickableStickers=" + this.clickableStickers + ", reportsSpa=" + this.reportsSpa + ", isLiveStreamingEnabled=" + this.isLiveStreamingEnabled + ", isNewLiveStreamingEnabled=" + this.isNewLiveStreamingEnabled + ", lang=" + this.lang + ", moneyP2pParams=" + this.moneyP2pParams + ", noWallReplies=" + this.noWallReplies + ", ownPostsDefault=" + this.ownPostsDefault + ", commentSubmitType=" + this.commentSubmitType + ", phone=" + this.phone + ", phoneStatus=" + this.phoneStatus + ", phoneVerifyDelay=" + this.phoneVerifyDelay + ", phoneVerifySid=" + this.phoneVerifySid + ", profilerEnabled=" + this.profilerEnabled + ", profilerSettings=" + this.profilerSettings + ", role=" + this.role + ", raiseToRecordEnabled=" + this.raiseToRecordEnabled + ", settings=" + this.settings + ", supportUrl=" + this.supportUrl + ", validFrom=" + this.validFrom + ", commentRestriction=" + this.commentRestriction + ", vkPayEndpoint=" + this.vkPayEndpoint + ", vkPayEndpointV2=" + this.vkPayEndpointV2 + ", vkPayAppId=" + this.vkPayAppId + ", sendCommonNetworkStatsUntil=" + this.sendCommonNetworkStatsUntil + ", sendImagesNetworkStatsUntil=" + this.sendImagesNetworkStatsUntil + ", sendAudioNetworkStatsUntil=" + this.sendAudioNetworkStatsUntil + ", streamSpecialCommentPrice=" + this.streamSpecialCommentPrice + ", subscriptions=" + this.subscriptions + ", vklive=" + this.vklive + ", videoPlayer=" + this.videoPlayer + ", cache=" + this.cache + ", newsfeed=" + this.newsfeed + ", stories=" + this.stories + ", pageSize=" + this.pageSize + ", jsInjections=" + this.jsInjections + ", conversationsBar=" + this.conversationsBar + ", hasMessagesInLastTwoWeek=" + this.hasMessagesInLastTwoWeek + ", menuAdsEasyPromote=" + this.menuAdsEasyPromote + ", sideMenuCustomItems=" + this.sideMenuCustomItems + ", subscriptionComboAllowed=" + this.subscriptionComboAllowed + ", showOnlyNotMutedMessages=" + this.showOnlyNotMutedMessages + ", includeChannelNotifications=" + this.includeChannelNotifications + ", messagesAutoUnarchive=" + this.messagesAutoUnarchive + ", messagesTranscriptAutoShow=" + this.messagesTranscriptAutoShow + ", messagesRecommendationListHidden=" + this.messagesRecommendationListHidden + ", messagesMultilineInput=" + this.messagesMultilineInput + ", unlockedReactions=" + this.unlockedReactions + ", messagesTranslationLanguagePairs=" + this.messagesTranslationLanguagePairs + ", silentModeEndedAt=" + this.silentModeEndedAt + ", obsceneTextFilter=" + this.obsceneTextFilter + ", messagesReactionNotifications=" + this.messagesReactionNotifications + ", marketAdult18plus=" + this.marketAdult18plus + ", canChangePassword=" + this.canChangePassword + ", isPersonalAdsEasyPromoteEnabled=" + this.isPersonalAdsEasyPromoteEnabled + ", isAdsEasyPromoteEnabled=" + this.isAdsEasyPromoteEnabled + ", adsEasyPromoteOnboardingName=" + this.adsEasyPromoteOnboardingName + ", messagesCounterSettings=" + this.messagesCounterSettings + ')';
    }

    public final BaseBoolIntDto u() {
        return this.noWallReplies;
    }

    public final AccountInfoVideoPlayerDto v0() {
        return this.videoPlayer;
    }

    public final VkPayAppIdDto w0() {
        return this.vkPayAppId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12faRequired, i);
        AudioAdsConfigDto audioAdsConfigDto = this.audioAds;
        if (audioAdsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioAdsConfigDto.writeToParcel(parcel, i);
        }
        AudioPermissionsDto audioPermissionsDto = this.audioPermissions;
        if (audioPermissionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPermissionsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.businessNotifyEnabled, i);
        StickersSettingsDto stickersSettingsDto = this.stickersSettings;
        if (stickersSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.changeEmailUrlWat);
        parcel.writeString(this.changePhoneUrlWat);
        parcel.writeString(this.country);
        Boolean bool = this.debugAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.email);
        parcel.writeString(this.emailStatus);
        Boolean bool2 = this.euUser;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto = this.feedPreloading;
        if (newsfeedFeedPreloadingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedFeedPreloadingDto.writeToParcel(parcel, i);
        }
        FeedTypeDto feedTypeDto = this.feedType;
        if (feedTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.feedTypeForced, i);
        parcel.writeString(this.feedApplovinUnitId);
        parcel.writeString(this.feedYandexAdsUnitId);
        parcel.writeString(this.userIdHash);
        parcel.writeParcelable(this.httpsRequired, i);
        Integer num = this.intro;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool3 = this.isTopicExpert;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num2 = this.musicIntro;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AccountMusicBackgroundDto accountMusicBackgroundDto = this.musicBackground;
        if (accountMusicBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountMusicBackgroundDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.audioAutoplay;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Integer num3 = this.faveIntro;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool5 = this.menuIntro;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        AccountShoppingParamsDto accountShoppingParamsDto = this.shoppingParams;
        if (accountShoppingParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountShoppingParamsDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.miniAppsAdsSlotId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.qrPromotion;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Boolean bool6 = this.communityComments;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeValue(this.linkRedirects);
        parcel.writeString(this.rulesAcceptHash);
        parcel.writeString(this.subscriptionCountry);
        Boolean bool7 = this.trackInstalledApps;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.inviteLink);
        parcel.writeString(this.securityIssue);
        parcel.writeValue(this.clickableStickers);
        Boolean bool8 = this.reportsSpa;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.isLiveStreamingEnabled;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.isNewLiveStreamingEnabled;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Integer num6 = this.lang;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        MoneyP2pParamsDto moneyP2pParamsDto = this.moneyP2pParams;
        if (moneyP2pParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyP2pParamsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.noWallReplies, i);
        parcel.writeParcelable(this.ownPostsDefault, i);
        Boolean bool11 = this.commentSubmitType;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        parcel.writeString(this.phone);
        PhoneStatusDto phoneStatusDto = this.phoneStatus;
        if (phoneStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phoneStatusDto.writeToParcel(parcel, i);
        }
        Integer num7 = this.phoneVerifyDelay;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.phoneVerifySid);
        Boolean bool12 = this.profilerEnabled;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto = this.profilerSettings;
        if (accountInfoProfilerSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoProfilerSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.role);
        Boolean bool13 = this.raiseToRecordEnabled;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        List<AccountInfoSettingsDto> list = this.settings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountInfoSettingsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.supportUrl);
        AccountInfoObjectsValidFromDto accountInfoObjectsValidFromDto = this.validFrom;
        if (accountInfoObjectsValidFromDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoObjectsValidFromDto.writeToParcel(parcel, i);
        }
        AccountInfoObjectsCommentRestrictionDto accountInfoObjectsCommentRestrictionDto = this.commentRestriction;
        if (accountInfoObjectsCommentRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoObjectsCommentRestrictionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.vkPayEndpoint);
        parcel.writeString(this.vkPayEndpointV2);
        VkPayAppIdDto vkPayAppIdDto = this.vkPayAppId;
        if (vkPayAppIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkPayAppIdDto.writeToParcel(parcel, i);
        }
        Integer num8 = this.sendCommonNetworkStatsUntil;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.sendImagesNetworkStatsUntil;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Integer num10 = this.sendAudioNetworkStatsUntil;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Integer num11 = this.streamSpecialCommentPrice;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        List<AccountSubscriptionsItemsInfoDto> list2 = this.subscriptions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AccountSubscriptionsItemsInfoDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        AccountInfoVkliveDto accountInfoVkliveDto = this.vklive;
        if (accountInfoVkliveDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoVkliveDto.writeToParcel(parcel, i);
        }
        AccountInfoVideoPlayerDto accountInfoVideoPlayerDto = this.videoPlayer;
        if (accountInfoVideoPlayerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoVideoPlayerDto.writeToParcel(parcel, i);
        }
        AccountInfoCacheDto accountInfoCacheDto = this.cache;
        if (accountInfoCacheDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoCacheDto.writeToParcel(parcel, i);
        }
        AccountNewsfeedOneOfDto accountNewsfeedOneOfDto = this.newsfeed;
        if (accountNewsfeedOneOfDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNewsfeedOneOfDto.writeToParcel(parcel, i);
        }
        AccountInfoStoriesDto accountInfoStoriesDto = this.stories;
        if (accountInfoStoriesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoStoriesDto.writeToParcel(parcel, i);
        }
        AccountInfoPageSizeDto accountInfoPageSizeDto = this.pageSize;
        if (accountInfoPageSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoPageSizeDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.jsInjections);
        MessagesConversationBarDto messagesConversationBarDto = this.conversationsBar;
        if (messagesConversationBarDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationBarDto.writeToParcel(parcel, i);
        }
        Boolean bool14 = this.hasMessagesInLastTwoWeek;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto = this.menuAdsEasyPromote;
        if (accountInfoAdsEasyPromoteMenuItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoAdsEasyPromoteMenuItemDto.writeToParcel(parcel, i);
        }
        List<AccountInfoSideMenuCustomItemDto> list3 = this.sideMenuCustomItems;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((AccountInfoSideMenuCustomItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool15 = this.subscriptionComboAllowed;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.showOnlyNotMutedMessages;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.includeChannelNotifications;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.messagesAutoUnarchive;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        Boolean bool19 = this.messagesTranscriptAutoShow;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        Boolean bool20 = this.messagesRecommendationListHidden;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        Boolean bool21 = this.messagesMultilineInput;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        List<Integer> list4 = this.unlockedReactions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeInt(((Number) f4.next()).intValue());
            }
        }
        parcel.writeStringList(this.messagesTranslationLanguagePairs);
        Integer num12 = this.silentModeEndedAt;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Boolean bool22 = this.obsceneTextFilter;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        AccountMessagesReactionNotificationsSettingsDto accountMessagesReactionNotificationsSettingsDto = this.messagesReactionNotifications;
        if (accountMessagesReactionNotificationsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountMessagesReactionNotificationsSettingsDto.writeToParcel(parcel, i);
        }
        AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto = this.marketAdult18plus;
        if (accountInfoMarketAdult18plusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoMarketAdult18plusDto.writeToParcel(parcel, i);
        }
        Boolean bool23 = this.canChangePassword;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        Boolean bool24 = this.isPersonalAdsEasyPromoteEnabled;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool24);
        }
        Boolean bool25 = this.isAdsEasyPromoteEnabled;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool25);
        }
        parcel.writeString(this.adsEasyPromoteOnboardingName);
        AccountInfoMessagesCounterSettingsDto accountInfoMessagesCounterSettingsDto = this.messagesCounterSettings;
        if (accountInfoMessagesCounterSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoMessagesCounterSettingsDto.writeToParcel(parcel, i);
        }
    }

    public final String y0() {
        return this.vkPayEndpoint;
    }

    public AccountInfoDto(BaseBoolIntDto baseBoolIntDto, AudioAdsConfigDto audioAdsConfigDto, AudioPermissionsDto audioPermissionsDto, BaseBoolIntDto baseBoolIntDto2, StickersSettingsDto stickersSettingsDto, String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto, FeedTypeDto feedTypeDto, BaseBoolIntDto baseBoolIntDto3, String str6, String str7, String str8, BaseBoolIntDto baseBoolIntDto4, Integer num, Boolean bool3, Integer num2, AccountMusicBackgroundDto accountMusicBackgroundDto, Boolean bool4, Integer num3, Boolean bool5, AccountShoppingParamsDto accountShoppingParamsDto, Integer num4, Integer num5, Boolean bool6, Object obj, String str9, String str10, Boolean bool7, String str11, String str12, Object obj2, Boolean bool8, Boolean bool9, Boolean bool10, Integer num6, MoneyP2pParamsDto moneyP2pParamsDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, Boolean bool11, String str13, PhoneStatusDto phoneStatusDto, Integer num7, String str14, Boolean bool12, AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto, String str15, Boolean bool13, List<AccountInfoSettingsDto> list, String str16, AccountInfoObjectsValidFromDto accountInfoObjectsValidFromDto, AccountInfoObjectsCommentRestrictionDto accountInfoObjectsCommentRestrictionDto, String str17, String str18, VkPayAppIdDto vkPayAppIdDto, Integer num8, Integer num9, Integer num10, Integer num11, List<AccountSubscriptionsItemsInfoDto> list2, AccountInfoVkliveDto accountInfoVkliveDto, AccountInfoVideoPlayerDto accountInfoVideoPlayerDto, AccountInfoCacheDto accountInfoCacheDto, AccountNewsfeedOneOfDto accountNewsfeedOneOfDto, AccountInfoStoriesDto accountInfoStoriesDto, AccountInfoPageSizeDto accountInfoPageSizeDto, List<String> list3, MessagesConversationBarDto messagesConversationBarDto, Boolean bool14, AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto, List<AccountInfoSideMenuCustomItemDto> list4, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, List<Integer> list5, List<String> list6, Integer num12, Boolean bool22, AccountMessagesReactionNotificationsSettingsDto accountMessagesReactionNotificationsSettingsDto, AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto, Boolean bool23, Boolean bool24, Boolean bool25, String str19, AccountInfoMessagesCounterSettingsDto accountInfoMessagesCounterSettingsDto) {
        this.f12faRequired = baseBoolIntDto;
        this.audioAds = audioAdsConfigDto;
        this.audioPermissions = audioPermissionsDto;
        this.businessNotifyEnabled = baseBoolIntDto2;
        this.stickersSettings = stickersSettingsDto;
        this.changeEmailUrlWat = str;
        this.changePhoneUrlWat = str2;
        this.country = str3;
        this.debugAvailable = bool;
        this.email = str4;
        this.emailStatus = str5;
        this.euUser = bool2;
        this.feedPreloading = newsfeedFeedPreloadingDto;
        this.feedType = feedTypeDto;
        this.feedTypeForced = baseBoolIntDto3;
        this.feedApplovinUnitId = str6;
        this.feedYandexAdsUnitId = str7;
        this.userIdHash = str8;
        this.httpsRequired = baseBoolIntDto4;
        this.intro = num;
        this.isTopicExpert = bool3;
        this.musicIntro = num2;
        this.musicBackground = accountMusicBackgroundDto;
        this.audioAutoplay = bool4;
        this.faveIntro = num3;
        this.menuIntro = bool5;
        this.shoppingParams = accountShoppingParamsDto;
        this.miniAppsAdsSlotId = num4;
        this.qrPromotion = num5;
        this.communityComments = bool6;
        this.linkRedirects = obj;
        this.rulesAcceptHash = str9;
        this.subscriptionCountry = str10;
        this.trackInstalledApps = bool7;
        this.inviteLink = str11;
        this.securityIssue = str12;
        this.clickableStickers = obj2;
        this.reportsSpa = bool8;
        this.isLiveStreamingEnabled = bool9;
        this.isNewLiveStreamingEnabled = bool10;
        this.lang = num6;
        this.moneyP2pParams = moneyP2pParamsDto;
        this.noWallReplies = baseBoolIntDto5;
        this.ownPostsDefault = baseBoolIntDto6;
        this.commentSubmitType = bool11;
        this.phone = str13;
        this.phoneStatus = phoneStatusDto;
        this.phoneVerifyDelay = num7;
        this.phoneVerifySid = str14;
        this.profilerEnabled = bool12;
        this.profilerSettings = accountInfoProfilerSettingsDto;
        this.role = str15;
        this.raiseToRecordEnabled = bool13;
        this.settings = list;
        this.supportUrl = str16;
        this.validFrom = accountInfoObjectsValidFromDto;
        this.commentRestriction = accountInfoObjectsCommentRestrictionDto;
        this.vkPayEndpoint = str17;
        this.vkPayEndpointV2 = str18;
        this.vkPayAppId = vkPayAppIdDto;
        this.sendCommonNetworkStatsUntil = num8;
        this.sendImagesNetworkStatsUntil = num9;
        this.sendAudioNetworkStatsUntil = num10;
        this.streamSpecialCommentPrice = num11;
        this.subscriptions = list2;
        this.vklive = accountInfoVkliveDto;
        this.videoPlayer = accountInfoVideoPlayerDto;
        this.cache = accountInfoCacheDto;
        this.newsfeed = accountNewsfeedOneOfDto;
        this.stories = accountInfoStoriesDto;
        this.pageSize = accountInfoPageSizeDto;
        this.jsInjections = list3;
        this.conversationsBar = messagesConversationBarDto;
        this.hasMessagesInLastTwoWeek = bool14;
        this.menuAdsEasyPromote = accountInfoAdsEasyPromoteMenuItemDto;
        this.sideMenuCustomItems = list4;
        this.subscriptionComboAllowed = bool15;
        this.showOnlyNotMutedMessages = bool16;
        this.includeChannelNotifications = bool17;
        this.messagesAutoUnarchive = bool18;
        this.messagesTranscriptAutoShow = bool19;
        this.messagesRecommendationListHidden = bool20;
        this.messagesMultilineInput = bool21;
        this.unlockedReactions = list5;
        this.messagesTranslationLanguagePairs = list6;
        this.silentModeEndedAt = num12;
        this.obsceneTextFilter = bool22;
        this.messagesReactionNotifications = accountMessagesReactionNotificationsSettingsDto;
        this.marketAdult18plus = accountInfoMarketAdult18plusDto;
        this.canChangePassword = bool23;
        this.isPersonalAdsEasyPromoteEnabled = bool24;
        this.isAdsEasyPromoteEnabled = bool25;
        this.adsEasyPromoteOnboardingName = str19;
        this.messagesCounterSettings = accountInfoMessagesCounterSettingsDto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AccountInfoDto(BaseBoolIntDto baseBoolIntDto, AudioAdsConfigDto audioAdsConfigDto, AudioPermissionsDto audioPermissionsDto, BaseBoolIntDto baseBoolIntDto2, StickersSettingsDto stickersSettingsDto, String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto, FeedTypeDto feedTypeDto, BaseBoolIntDto baseBoolIntDto3, String str6, String str7, String str8, BaseBoolIntDto baseBoolIntDto4, Integer num, Boolean bool3, Integer num2, AccountMusicBackgroundDto accountMusicBackgroundDto, Boolean bool4, Integer num3, Boolean bool5, AccountShoppingParamsDto accountShoppingParamsDto, Integer num4, Integer num5, Boolean bool6, Object obj, String str9, String str10, Boolean bool7, String str11, String str12, Object obj2, Boolean bool8, Boolean bool9, Boolean bool10, Integer num6, MoneyP2pParamsDto moneyP2pParamsDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, Boolean bool11, String str13, PhoneStatusDto phoneStatusDto, Integer num7, String str14, Boolean bool12, AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto, String str15, Boolean bool13, List list, String str16, AccountInfoObjectsValidFromDto accountInfoObjectsValidFromDto, AccountInfoObjectsCommentRestrictionDto accountInfoObjectsCommentRestrictionDto, String str17, String str18, VkPayAppIdDto vkPayAppIdDto, Integer num8, Integer num9, Integer num10, Integer num11, List list2, AccountInfoVkliveDto accountInfoVkliveDto, AccountInfoVideoPlayerDto accountInfoVideoPlayerDto, AccountInfoCacheDto accountInfoCacheDto, AccountNewsfeedOneOfDto accountNewsfeedOneOfDto, AccountInfoStoriesDto accountInfoStoriesDto, AccountInfoPageSizeDto accountInfoPageSizeDto, List list3, MessagesConversationBarDto messagesConversationBarDto, Boolean bool14, AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto, List list4, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, List list5, List list6, Integer num12, Boolean bool22, AccountMessagesReactionNotificationsSettingsDto accountMessagesReactionNotificationsSettingsDto, AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto, Boolean bool23, Boolean bool24, Boolean bool25, String str19, AccountInfoMessagesCounterSettingsDto accountInfoMessagesCounterSettingsDto, int i, int i2, int i3, zcl zclVar) {
        this(r78, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r79, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : str10, (i2 & 2) != 0 ? null : bool7, (i2 & 4) != 0 ? null : str11, (i2 & 8) != 0 ? null : str12, (i2 & 16) != 0 ? null : obj2, (i2 & 32) != 0 ? null : bool8, (i2 & 64) != 0 ? null : bool9, (i2 & 128) != 0 ? null : bool10, (i2 & 256) != 0 ? null : num6, (i2 & 512) != 0 ? null : moneyP2pParamsDto, (i2 & 1024) != 0 ? null : baseBoolIntDto5, (i2 & 2048) != 0 ? null : baseBoolIntDto6, (i2 & 4096) != 0 ? null : bool11, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : phoneStatusDto, (i2 & 32768) != 0 ? null : num7, (i2 & 65536) != 0 ? null : str14, (i2 & 131072) != 0 ? null : bool12, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : accountInfoProfilerSettingsDto, (i2 & 524288) != 0 ? null : str15, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool13, (i2 & 2097152) != 0 ? null : list, (i2 & 4194304) != 0 ? null : str16, (i2 & 8388608) != 0 ? null : accountInfoObjectsValidFromDto, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : accountInfoObjectsCommentRestrictionDto, (i2 & 33554432) != 0 ? null : str17, (i2 & 67108864) != 0 ? null : str18, (i2 & 134217728) != 0 ? null : vkPayAppIdDto, (i2 & 268435456) != 0 ? null : num8, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num9, (i2 & 1073741824) != 0 ? null : num10, (i2 & Integer.MIN_VALUE) != 0 ? null : num11, (i3 & 1) != 0 ? null : list2, (i3 & 2) != 0 ? null : accountInfoVkliveDto, (i3 & 4) != 0 ? null : accountInfoVideoPlayerDto, (i3 & 8) != 0 ? null : accountInfoCacheDto, (i3 & 16) != 0 ? null : accountNewsfeedOneOfDto, (i3 & 32) != 0 ? null : accountInfoStoriesDto, (i3 & 64) != 0 ? null : accountInfoPageSizeDto, (i3 & 128) != 0 ? null : list3, (i3 & 256) != 0 ? null : messagesConversationBarDto, (i3 & 512) != 0 ? null : bool14, (i3 & 1024) != 0 ? null : accountInfoAdsEasyPromoteMenuItemDto, (i3 & 2048) != 0 ? null : list4, (i3 & 4096) != 0 ? null : bool15, (i3 & 8192) != 0 ? null : bool16, (i3 & 16384) != 0 ? null : bool17, (i3 & 32768) != 0 ? null : bool18, (i3 & 65536) != 0 ? null : bool19, (i3 & 131072) != 0 ? null : bool20, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool21, (i3 & 524288) != 0 ? null : list5, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list6, (i3 & 2097152) != 0 ? null : num12, (i3 & 4194304) != 0 ? null : bool22, (i3 & 8388608) != 0 ? null : accountMessagesReactionNotificationsSettingsDto, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : accountInfoMarketAdult18plusDto, (i3 & 33554432) != 0 ? null : bool23, (i3 & 67108864) != 0 ? null : bool24, (i3 & 134217728) != 0 ? null : bool25, (i3 & 268435456) != 0 ? null : str19, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : accountInfoMessagesCounterSettingsDto);
        BaseBoolIntDto baseBoolIntDto7 = (i & 1) != 0 ? null : baseBoolIntDto;
        AudioAdsConfigDto audioAdsConfigDto2 = (i & 2) != 0 ? null : audioAdsConfigDto;
        AudioPermissionsDto audioPermissionsDto2 = (i & 4) != 0 ? null : audioPermissionsDto;
        BaseBoolIntDto baseBoolIntDto8 = (i & 8) != 0 ? null : baseBoolIntDto2;
        StickersSettingsDto stickersSettingsDto2 = (i & 16) != 0 ? null : stickersSettingsDto;
        String str20 = (i & 32) != 0 ? null : str;
        String str21 = (i & 64) != 0 ? null : str2;
        String str22 = (i & 128) != 0 ? null : str3;
        Boolean bool26 = (i & 256) != 0 ? null : bool;
        String str23 = (i & 512) != 0 ? null : str4;
        String str24 = (i & 1024) != 0 ? null : str5;
        Boolean bool27 = (i & 2048) != 0 ? null : bool2;
        NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto2 = (i & 4096) != 0 ? null : newsfeedFeedPreloadingDto;
        BaseBoolIntDto baseBoolIntDto9 = baseBoolIntDto7;
        FeedTypeDto feedTypeDto2 = (i & 8192) != 0 ? null : feedTypeDto;
        BaseBoolIntDto baseBoolIntDto10 = (i & 16384) != 0 ? null : baseBoolIntDto3;
        String str25 = (i & 32768) != 0 ? null : str6;
        String str26 = (i & 65536) != 0 ? null : str7;
        String str27 = (i & 131072) != 0 ? null : str8;
        BaseBoolIntDto baseBoolIntDto11 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto4;
        Integer num13 = (i & 524288) != 0 ? null : num;
        Boolean bool28 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool3;
        Integer num14 = (i & 2097152) != 0 ? null : num2;
        AccountMusicBackgroundDto accountMusicBackgroundDto2 = (i & 4194304) != 0 ? null : accountMusicBackgroundDto;
        Boolean bool29 = (i & 8388608) != 0 ? null : bool4;
        Integer num15 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num3;
        Boolean bool30 = (i & 33554432) != 0 ? null : bool5;
        AccountShoppingParamsDto accountShoppingParamsDto2 = (i & 67108864) != 0 ? null : accountShoppingParamsDto;
        Integer num16 = (i & 134217728) != 0 ? null : num4;
        Integer num17 = (i & 268435456) != 0 ? null : num5;
        Boolean bool31 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool6;
        Object obj3 = (i & 1073741824) != 0 ? null : obj;
        String str28 = (i & Integer.MIN_VALUE) != 0 ? null : str9;
    }
}
