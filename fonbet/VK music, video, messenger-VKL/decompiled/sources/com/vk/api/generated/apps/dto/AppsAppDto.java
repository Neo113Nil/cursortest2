package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAppDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppDto> CREATOR = new a();

    @pmi0("ad_config")
    private final AppsAppAdConfigDto adConfig;

    @pmi0("app_status")
    private final Integer appStatus;

    @pmi0("app_url")
    private final String appUrl;

    @pmi0("archive_test_url")
    private final String archiveTestUrl;

    @pmi0("are_notifications_enabled")
    private final Boolean areNotificationsEnabled;

    @pmi0("author_group_info")
    private final AppsAuthorGroupInfoDto authorGroupInfo;

    @pmi0("author_owner_id")
    private final Integer authorOwnerId;

    @pmi0("author_url")
    private final String authorUrl;

    @pmi0("available_methods")
    private final List<String> availableMethods;

    @pmi0("background_loader_color")
    private final String backgroundLoaderColor;

    @pmi0("badge")
    private final String badge;

    @pmi0("badge_info")
    private final SuperAppBadgeInfoDto badgeInfo;

    @pmi0("banner_1120")
    private final String banner1120;

    @pmi0("banner_560")
    private final String banner560;

    @pmi0("can_cache")
    private final Boolean canCache;

    @pmi0("catalog_banner")
    private final AppsCatalogBannerDto catalogBanner;

    @pmi0("catalog_position")
    private final Integer catalogPosition;

    @pmi0("communities_installed_app")
    private final ExploreWidgetsUserStackDto communitiesInstalledApp;

    @pmi0("community_catalog_tags")
    private final List<String> communityCatalogTags;

    @pmi0("description")
    private final String description;

    @pmi0("downloadable_game_available_platforms")
    private final List<String> downloadableGameAvailablePlatforms;

    @pmi0("external_browser_url")
    private final String externalBrowserUrl;

    @pmi0("favicon")
    private final String favicon;

    @pmi0("friends")
    private final List<Integer> friends;

    @pmi0("friends_stack")
    private final AppsFriendsStackDto friendsStack;

    @pmi0("friends_use_app")
    private final ExploreWidgetsUserStackDto friendsUseApp;

    @pmi0("genre")
    private final String genre;

    @pmi0("genre_id")
    private final Integer genreId;

    @pmi0("has_vk_connect")
    private final Boolean hasVkConnect;

    @pmi0("hash_as_param")
    private final Boolean hashAsParam;

    @pmi0("hash_as_param_legacy")
    private final Boolean hashAsParamLegacy;

    @pmi0("hide_tabbar")
    private final BaseBoolIntDto hideTabbar;

    @pmi0("icon_139")
    private final String icon139;

    @pmi0("icon_150")
    private final String icon150;

    @pmi0("icon_16")
    private final String icon16;

    @pmi0("icon_278")
    private final String icon278;

    @pmi0("icon_576")
    private final String icon576;

    @pmi0("icon_75")
    private final String icon75;

    @pmi0("id")
    private final int id;

    @pmi0("iframe_settings")
    private final AppsAppIframeSettingsDto iframeSettings;

    @pmi0("install_screen_url")
    private final String installScreenUrl;

    @pmi0("install_url")
    private final String installUrl;

    @pmi0("international")
    private final Boolean international;

    @pmi0("is_app_potentially_have_similar")
    private final Boolean isAppPotentiallyHaveSimilar;

    @pmi0("is_available_user_actions")
    private final Boolean isAvailableUserActions;

    @pmi0("is_badge_allowed")
    private final Boolean isBadgeAllowed;

    @pmi0("is_button_added_to_profile")
    private final Boolean isButtonAddedToProfile;

    @pmi0("is_calls_available")
    private final Boolean isCallsAvailable;

    @pmi0("is_can_quit")
    private final Boolean isCanQuit;

    @pmi0("is_debug")
    private final Boolean isDebug;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_iframe_mode")
    private final Boolean isIframeMode;

    @pmi0("is_im_actions_supported")
    private final Boolean isImActionsSupported;

    @pmi0("is_in_catalog")
    private final Integer isInCatalog;

    @pmi0("is_install_screen")
    private final Boolean isInstallScreen;

    @pmi0("is_installed")
    private final Boolean isInstalled;

    @pmi0("is_layer_restricted")
    private final Boolean isLayerRestricted;

    @pmi0("is_mini_app_flow")
    private final Boolean isMiniAppFlow;

    @pmi0("is_need_to_show_launch_screen")
    private final Boolean isNeedToShowLaunchScreen;

    @pmi0("is_need_to_show_unverified_screen_on_launch")
    private final Boolean isNeedToShowUnverifiedScreenOnLaunch;

    @pmi0("is_new")
    private final BaseBoolIntDto isNew;

    @pmi0("is_only_dg_runnable_on_web")
    private final Boolean isOnlyDgRunnableOnWeb;

    @pmi0("is_payments_allowed")
    private final Boolean isPaymentsAllowed;

    @pmi0("is_plugin")
    private final Boolean isPlugin;

    @pmi0("is_recommended")
    private final Boolean isRecommended;

    @pmi0("is_splash_screen_enabled")
    private final Boolean isSplashScreenEnabled;

    @pmi0("is_trusted")
    private final Boolean isTrusted;

    @pmi0("is_vk_pay_disabled")
    private final Boolean isVkPayDisabled;

    @pmi0("is_vkpay_app")
    private final Boolean isVkpayApp;

    @pmi0("is_vkui_internal")
    private final Boolean isVkuiInternal;

    @pmi0("is_widescreen")
    private final Boolean isWidescreen;

    @pmi0("last_update")
    private final Integer lastUpdate;

    @pmi0("launch_screen_action_button")
    private final AppsLaunchScreenActionButtonDto launchScreenActionButton;

    @pmi0("launch_screen_action_placeholder")
    private final AppsLaunchScreenActionPlaceholderDto launchScreenActionPlaceholder;

    @pmi0("launch_screen_app_users")
    private final AppsLaunchScreenAppUsersDto launchScreenAppUsers;

    @pmi0("launch_screen_video")
    private final VideoVideoFullDto launchScreenVideo;

    @pmi0("leaderboard_type")
    private final AppsAppLeaderboardTypeDto leaderboardType;

    @pmi0("legal_documents")
    private final AppsLegalDocumentsDto legalDocuments;

    @pmi0("legal_info")
    private final AppsLegalInfoDto legalInfo;

    @pmi0("loader_icon")
    private final String loaderIcon;

    @pmi0("main_screen_feature_disabled")
    private final Boolean mainScreenFeatureDisabled;

    @pmi0("manage_link")
    private final String manageLink;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("mini_apps_web_call_api_form_data")
    private final Boolean miniAppsWebCallApiFormData;

    @pmi0("mobile_controls_type")
    private final Integer mobileControlsType;

    @pmi0("mobile_view_support_type")
    private final Integer mobileViewSupportType;

    @pmi0("my_tracker_timespent_counter_id")
    private final Integer myTrackerTimespentCounterId;

    @pmi0("need_policy_confirmation")
    private final Boolean needPolicyConfirmation;

    @pmi0("need_show_bottom_menu_tooltip_on_close")
    private final Boolean needShowBottomMenuTooltipOnClose;

    @pmi0("need_show_personal_discount_alert")
    private final Boolean needShowPersonalDiscountAlert;

    @pmi0("need_show_unverified_screen")
    private final Boolean needShowUnverifiedScreen;

    @pmi0("notification_badge_type")
    private final AppsAppNotificationBadgeTypeDto notificationBadgeType;

    @pmi0("open_in_external_browser")
    private final Boolean openInExternalBrowser;

    @pmi0("placeholder_info")
    private final AppsAppPlaceholderInfoDto placeholderInfo;

    @pmi0("platform_id")
    private final String platformId;

    @pmi0("preload_ad_types")
    private final List<String> preloadAdTypes;

    @pmi0("preload_url")
    private final String preloadUrl;

    @pmi0("profile_button_available")
    private final Boolean profileButtonAvailable;

    @pmi0("promo_video")
    private final VideoVideoDto promoVideo;

    @pmi0("published_date")
    private final Integer publishedDate;

    @pmi0("push_enabled")
    private final BaseBoolIntDto pushEnabled;

    @pmi0("rights")
    private final List<AppsAppInstallRightDto> rights;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("screen_orientation")
    private final Integer screenOrientation;

    @pmi0("screenshots")
    private final List<PhotosPhotoDto> screenshots;

    @pmi0("sdk_methods")
    private final List<String> sdkMethods;

    @pmi0("section")
    private final String section;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("slogan")
    private final String slogan;

    @pmi0("splash_screen")
    private final AppsSplashScreenDto splashScreen;

    @pmi0("support_url")
    private final String supportUrl;

    @pmi0("supported_style")
    private final Integer supportedStyle;

    @pmi0("test_odr_runtime")
    private final Integer testOdrRuntime;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("transliteration_name")
    private final String transliterationName;

    @pmi0("type")
    private final AppsAppTypeDto type;

    @pmi0("webview_url")
    private final String webviewUrl;

    @pmi0("without_footer")
    private final Boolean withoutFooter;

    @pmi0("without_header")
    private final Boolean withoutHeader;

    /* compiled from: AppsAppDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Integer num;
            VideoVideoDto createFromParcel;
            ArrayList arrayList2;
            ArrayList arrayList3;
            AppsAppTypeDto appsAppTypeDto;
            ArrayList arrayList4;
            VideoVideoDto videoVideoDto;
            ArrayList arrayList5;
            boolean z;
            AppsAppTypeDto appsAppTypeDto2;
            Boolean valueOf2;
            Boolean valueOf3;
            AppsAppTypeDto appsAppTypeDto3;
            AppsAppNotificationBadgeTypeDto createFromParcel2;
            AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto;
            SuperAppBadgeInfoDto createFromParcel3;
            SuperAppBadgeInfoDto superAppBadgeInfoDto;
            ExploreWidgetsUserStackDto createFromParcel4;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            ExploreWidgetsUserStackDto exploreWidgetsUserStackDto;
            AppsLaunchScreenActionButtonDto createFromParcel5;
            AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto;
            AppsLaunchScreenActionPlaceholderDto createFromParcel6;
            AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto;
            AppsLaunchScreenAppUsersDto createFromParcel7;
            AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto;
            VideoVideoFullDto createFromParcel8;
            VideoVideoFullDto videoVideoFullDto;
            AppsAuthorGroupInfoDto createFromParcel9;
            AppsAuthorGroupInfoDto appsAuthorGroupInfoDto;
            AppsLegalDocumentsDto createFromParcel10;
            AppsLegalDocumentsDto appsLegalDocumentsDto;
            AppsLegalInfoDto createFromParcel11;
            Boolean valueOf11;
            Boolean valueOf12;
            AppsLegalInfoDto appsLegalInfoDto;
            AppsFriendsStackDto createFromParcel12;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            Boolean valueOf18;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            Boolean valueOf22;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            AppsFriendsStackDto appsFriendsStackDto;
            BaseBoolIntDto createFromParcel13;
            BaseBoolIntDto baseBoolIntDto;
            AppsAppPlaceholderInfoDto createFromParcel14;
            AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto;
            AppsSplashScreenDto createFromParcel15;
            Boolean valueOf27;
            Boolean valueOf28;
            Boolean valueOf29;
            Boolean valueOf30;
            Boolean valueOf31;
            Boolean valueOf32;
            Boolean valueOf33;
            AppsSplashScreenDto appsSplashScreenDto;
            AppsAppAdConfigDto createFromParcel16;
            Boolean valueOf34;
            Boolean valueOf35;
            Boolean valueOf36;
            Boolean valueOf37;
            Boolean valueOf38;
            Boolean valueOf39;
            Boolean valueOf40;
            Boolean valueOf41;
            AppsAppTypeDto createFromParcel17 = AppsAppTypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            BaseBoolIntDto createFromParcel18 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel19 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            AppsCatalogBannerDto createFromParcel20 = parcel.readInt() == 0 ? null : AppsCatalogBannerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            Integer valueOf42 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList6 = arrayList;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Integer valueOf43 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AppsAppIframeSettingsDto createFromParcel21 = parcel.readInt() == 0 ? null : AppsAppIframeSettingsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf44 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            AppsAppLeaderboardTypeDto createFromParcel22 = parcel.readInt() == 0 ? null : AppsAppLeaderboardTypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf45 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString9 = parcel.readString();
            Integer valueOf46 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                num = valueOf42;
                createFromParcel = null;
            } else {
                num = valueOf42;
                createFromParcel = VideoVideoDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoDto videoVideoDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList6;
                appsAppTypeDto = createFromParcel17;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = arrayList6;
                arrayList3 = new ArrayList(readInt3);
                appsAppTypeDto = createFromParcel17;
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(AppsAppInstallRightDto.CREATOR, parcel, arrayList3, i2, 1);
                    readInt3 = readInt3;
                    readInt = readInt;
                }
                videoVideoDto2 = videoVideoDto2;
            }
            int i3 = readInt;
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                videoVideoDto = videoVideoDto2;
                arrayList4 = null;
                arrayList5 = arrayList3;
                appsAppTypeDto2 = appsAppTypeDto;
                z = true;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                videoVideoDto = videoVideoDto2;
                int i4 = 0;
                while (true) {
                    arrayList5 = arrayList3;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = en.a(PhotosPhotoDto.CREATOR, parcel, arrayList4, i4, 1);
                    arrayList3 = arrayList5;
                    readInt4 = readInt4;
                }
                z = true;
                appsAppTypeDto2 = appsAppTypeDto;
            }
            String readString11 = parcel.readString();
            Integer num2 = valueOf45;
            Integer num3 = valueOf46;
            VideoVideoDto videoVideoDto3 = videoVideoDto;
            String readString12 = parcel.readString();
            ArrayList arrayList7 = arrayList2;
            ArrayList arrayList8 = arrayList4;
            String readString13 = parcel.readString();
            Integer num4 = valueOf43;
            Integer num5 = num;
            ArrayList arrayList9 = arrayList5;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            String readString14 = parcel.readString();
            ExploreWidgetsUserStackDto createFromParcel23 = parcel.readInt() == 0 ? null : ExploreWidgetsUserStackDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                appsAppTypeDto3 = appsAppTypeDto2;
                createFromParcel2 = null;
            } else {
                appsAppTypeDto3 = appsAppTypeDto2;
                createFromParcel2 = AppsAppNotificationBadgeTypeDto.CREATOR.createFromParcel(parcel);
            }
            AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                appsAppNotificationBadgeTypeDto = appsAppNotificationBadgeTypeDto2;
                createFromParcel3 = null;
            } else {
                appsAppNotificationBadgeTypeDto = appsAppNotificationBadgeTypeDto2;
                createFromParcel3 = SuperAppBadgeInfoDto.CREATOR.createFromParcel(parcel);
            }
            SuperAppBadgeInfoDto superAppBadgeInfoDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                superAppBadgeInfoDto = superAppBadgeInfoDto2;
                createFromParcel4 = null;
            } else {
                superAppBadgeInfoDto = superAppBadgeInfoDto2;
                createFromParcel4 = ExploreWidgetsUserStackDto.CREATOR.createFromParcel(parcel);
            }
            ExploreWidgetsUserStackDto exploreWidgetsUserStackDto2 = createFromParcel4;
            Boolean bool = valueOf2;
            AppsAppTypeDto appsAppTypeDto4 = appsAppTypeDto3;
            SuperAppBadgeInfoDto superAppBadgeInfoDto3 = superAppBadgeInfoDto;
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
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
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Boolean bool2 = valueOf4;
            Boolean bool3 = valueOf5;
            Boolean bool4 = valueOf6;
            Boolean bool5 = valueOf7;
            Boolean bool6 = valueOf8;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            String readString15 = parcel.readString();
            Integer valueOf47 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString17 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                exploreWidgetsUserStackDto = exploreWidgetsUserStackDto2;
                createFromParcel5 = null;
            } else {
                exploreWidgetsUserStackDto = exploreWidgetsUserStackDto2;
                createFromParcel5 = AppsLaunchScreenActionButtonDto.CREATOR.createFromParcel(parcel);
            }
            AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                appsLaunchScreenActionButtonDto = appsLaunchScreenActionButtonDto2;
                createFromParcel6 = null;
            } else {
                appsLaunchScreenActionButtonDto = appsLaunchScreenActionButtonDto2;
                createFromParcel6 = AppsLaunchScreenActionPlaceholderDto.CREATOR.createFromParcel(parcel);
            }
            AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto2 = createFromParcel6;
            if (parcel.readInt() == 0) {
                appsLaunchScreenActionPlaceholderDto = appsLaunchScreenActionPlaceholderDto2;
                createFromParcel7 = null;
            } else {
                appsLaunchScreenActionPlaceholderDto = appsLaunchScreenActionPlaceholderDto2;
                createFromParcel7 = AppsLaunchScreenAppUsersDto.CREATOR.createFromParcel(parcel);
            }
            AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto2 = createFromParcel7;
            if (parcel.readInt() == 0) {
                appsLaunchScreenAppUsersDto = appsLaunchScreenAppUsersDto2;
                createFromParcel8 = null;
            } else {
                appsLaunchScreenAppUsersDto = appsLaunchScreenAppUsersDto2;
                createFromParcel8 = VideoVideoFullDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoFullDto videoVideoFullDto2 = createFromParcel8;
            if (parcel.readInt() == 0) {
                videoVideoFullDto = videoVideoFullDto2;
                createFromParcel9 = null;
            } else {
                videoVideoFullDto = videoVideoFullDto2;
                createFromParcel9 = AppsAuthorGroupInfoDto.CREATOR.createFromParcel(parcel);
            }
            AppsAuthorGroupInfoDto appsAuthorGroupInfoDto2 = createFromParcel9;
            if (parcel.readInt() == 0) {
                appsAuthorGroupInfoDto = appsAuthorGroupInfoDto2;
                createFromParcel10 = null;
            } else {
                appsAuthorGroupInfoDto = appsAuthorGroupInfoDto2;
                createFromParcel10 = AppsLegalDocumentsDto.CREATOR.createFromParcel(parcel);
            }
            AppsLegalDocumentsDto appsLegalDocumentsDto2 = createFromParcel10;
            if (parcel.readInt() == 0) {
                appsLegalDocumentsDto = appsLegalDocumentsDto2;
                createFromParcel11 = null;
            } else {
                appsLegalDocumentsDto = appsLegalDocumentsDto2;
                createFromParcel11 = AppsLegalInfoDto.CREATOR.createFromParcel(parcel);
            }
            AppsLegalInfoDto appsLegalInfoDto2 = createFromParcel11;
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
                appsLegalInfoDto = appsLegalInfoDto2;
                createFromParcel12 = null;
            } else {
                appsLegalInfoDto = appsLegalInfoDto2;
                createFromParcel12 = AppsFriendsStackDto.CREATOR.createFromParcel(parcel);
            }
            AppsFriendsStackDto appsFriendsStackDto2 = createFromParcel12;
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
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf20 = null;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf48 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf49 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                valueOf26 = null;
            } else {
                valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString19 = parcel.readString();
            Integer num6 = valueOf47;
            Boolean bool7 = valueOf9;
            Boolean bool8 = valueOf10;
            AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto3 = appsLaunchScreenActionButtonDto;
            AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto3 = appsLaunchScreenAppUsersDto;
            AppsAuthorGroupInfoDto appsAuthorGroupInfoDto3 = appsAuthorGroupInfoDto;
            AppsLegalInfoDto appsLegalInfoDto3 = appsLegalInfoDto;
            Boolean bool9 = valueOf13;
            Boolean bool10 = valueOf14;
            Boolean bool11 = valueOf15;
            Boolean bool12 = valueOf16;
            Boolean bool13 = valueOf17;
            Boolean bool14 = valueOf18;
            Boolean bool15 = valueOf19;
            Boolean bool16 = valueOf20;
            Integer num7 = valueOf48;
            Integer num8 = valueOf49;
            Boolean bool17 = valueOf21;
            Boolean bool18 = valueOf22;
            Boolean bool19 = valueOf23;
            Boolean bool20 = valueOf24;
            Boolean bool21 = valueOf25;
            Boolean bool22 = valueOf26;
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            if (parcel.readInt() == 0) {
                appsFriendsStackDto = appsFriendsStackDto2;
                createFromParcel13 = null;
            } else {
                appsFriendsStackDto = appsFriendsStackDto2;
                createFromParcel13 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto2 = createFromParcel13;
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto2;
                createFromParcel14 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto2;
                createFromParcel14 = AppsAppPlaceholderInfoDto.CREATOR.createFromParcel(parcel);
            }
            AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto2 = createFromParcel14;
            BaseBoolIntDto baseBoolIntDto3 = baseBoolIntDto;
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            Boolean bool23 = null;
            String readString29 = parcel.readString();
            if (parcel.readInt() == 0) {
                appsAppPlaceholderInfoDto = appsAppPlaceholderInfoDto2;
                createFromParcel15 = null;
            } else {
                appsAppPlaceholderInfoDto = appsAppPlaceholderInfoDto2;
                createFromParcel15 = AppsSplashScreenDto.CREATOR.createFromParcel(parcel);
            }
            AppsSplashScreenDto appsSplashScreenDto2 = createFromParcel15;
            if (parcel.readInt() == 0) {
                valueOf27 = null;
            } else {
                valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString30 = parcel.readString();
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
            String readString31 = parcel.readString();
            Boolean bool24 = valueOf3;
            AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto3 = appsAppNotificationBadgeTypeDto;
            ExploreWidgetsUserStackDto exploreWidgetsUserStackDto3 = exploreWidgetsUserStackDto;
            AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto3 = appsLaunchScreenActionPlaceholderDto;
            VideoVideoFullDto videoVideoFullDto3 = videoVideoFullDto;
            AppsLegalDocumentsDto appsLegalDocumentsDto3 = appsLegalDocumentsDto;
            Boolean bool25 = valueOf11;
            Boolean bool26 = valueOf12;
            AppsFriendsStackDto appsFriendsStackDto3 = appsFriendsStackDto;
            AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto3 = appsAppPlaceholderInfoDto;
            Boolean bool27 = valueOf27;
            Boolean bool28 = valueOf28;
            Boolean bool29 = valueOf29;
            Boolean bool30 = valueOf30;
            Boolean bool31 = valueOf31;
            Boolean bool32 = valueOf32;
            String readString32 = parcel.readString();
            Integer valueOf50 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf33 = null;
            } else {
                valueOf33 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString33 = parcel.readString();
            Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                appsSplashScreenDto = appsSplashScreenDto2;
                createFromParcel16 = null;
            } else {
                appsSplashScreenDto = appsSplashScreenDto2;
                createFromParcel16 = AppsAppAdConfigDto.CREATOR.createFromParcel(parcel);
            }
            AppsAppAdConfigDto appsAppAdConfigDto = createFromParcel16;
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
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf38 = null;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            if (parcel.readInt() == 0) {
                valueOf41 = null;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsAppDto(appsAppTypeDto4, i3, readString, readString2, readString3, readString4, readString5, createFromParcel18, createFromParcel19, createFromParcel20, arrayList7, num5, readString6, readString7, num4, createFromParcel21, valueOf, valueOf44, readString8, createFromParcel22, num2, readString9, num3, videoVideoDto3, arrayList9, readString10, arrayList8, readString11, readString12, readString13, createStringArrayList, bool, readString14, createFromParcel23, bool24, appsAppNotificationBadgeTypeDto3, superAppBadgeInfoDto3, exploreWidgetsUserStackDto3, createStringArrayList2, bool2, bool3, bool4, bool5, bool6, createStringArrayList3, createStringArrayList4, readString15, num6, readString16, bool7, readString17, bool8, createStringArrayList5, appsLaunchScreenActionButtonDto3, appsLaunchScreenActionPlaceholderDto3, appsLaunchScreenAppUsersDto3, videoVideoFullDto3, appsAuthorGroupInfoDto3, appsLegalDocumentsDto3, appsLegalInfoDto3, bool25, bool26, appsFriendsStackDto3, bool9, bool10, bool11, bool12, bool13, bool14, bool15, readString18, bool16, num7, num8, bool17, bool18, bool19, bool20, bool21, bool22, readString19, readString20, readString21, readString22, baseBoolIntDto3, appsAppPlaceholderInfoDto3, readString23, readString24, readString25, readString26, readString27, readString28, readString29, appsSplashScreenDto, bool27, readString30, bool28, bool29, bool30, bool31, bool32, readString31, readString32, valueOf50, valueOf33, readString33, valueOf51, appsAppAdConfigDto, valueOf34, valueOf35, valueOf36, valueOf37, valueOf52, valueOf53, valueOf54, valueOf55, valueOf38, valueOf39, valueOf40, valueOf41, bool23);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppDto[] newArray(int i) {
            return new AppsAppDto[i];
        }
    }

    public AppsAppDto(AppsAppTypeDto appsAppTypeDto, int i, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, AppsCatalogBannerDto appsCatalogBannerDto, List<Integer> list, Integer num, String str6, String str7, Integer num2, AppsAppIframeSettingsDto appsAppIframeSettingsDto, Boolean bool, Integer num3, String str8, AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto, Integer num4, String str9, Integer num5, VideoVideoDto videoVideoDto, List<AppsAppInstallRightDto> list2, String str10, List<PhotosPhotoDto> list3, String str11, String str12, String str13, List<String> list4, Boolean bool2, String str14, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto, Boolean bool3, AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto, SuperAppBadgeInfoDto superAppBadgeInfoDto, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto2, List<String> list5, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, List<String> list6, List<String> list7, String str15, Integer num6, String str16, Boolean bool9, String str17, Boolean bool10, List<String> list8, AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto, AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto, AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto, VideoVideoFullDto videoVideoFullDto, AppsAuthorGroupInfoDto appsAuthorGroupInfoDto, AppsLegalDocumentsDto appsLegalDocumentsDto, AppsLegalInfoDto appsLegalInfoDto, Boolean bool11, Boolean bool12, AppsFriendsStackDto appsFriendsStackDto, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, String str18, Boolean bool20, Integer num7, Integer num8, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, String str19, String str20, String str21, String str22, BaseBoolIntDto baseBoolIntDto3, AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto, String str23, String str24, String str25, String str26, String str27, String str28, String str29, AppsSplashScreenDto appsSplashScreenDto, Boolean bool27, String str30, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, String str31, String str32, Integer num9, Boolean bool33, String str33, Integer num10, AppsAppAdConfigDto appsAppAdConfigDto, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42) {
        this.type = appsAppTypeDto;
        this.id = i;
        this.title = str;
        this.authorUrl = str2;
        this.banner1120 = str3;
        this.banner560 = str4;
        this.icon16 = str5;
        this.isNew = baseBoolIntDto;
        this.pushEnabled = baseBoolIntDto2;
        this.catalogBanner = appsCatalogBannerDto;
        this.friends = list;
        this.catalogPosition = num;
        this.description = str6;
        this.genre = str7;
        this.genreId = num2;
        this.iframeSettings = appsAppIframeSettingsDto;
        this.international = bool;
        this.isInCatalog = num3;
        this.installUrl = str8;
        this.leaderboardType = appsAppLeaderboardTypeDto;
        this.membersCount = num4;
        this.platformId = str9;
        this.publishedDate = num5;
        this.promoVideo = videoVideoDto;
        this.rights = list2;
        this.screenName = str10;
        this.screenshots = list3;
        this.section = str11;
        this.externalBrowserUrl = str12;
        this.badge = str13;
        this.preloadAdTypes = list4;
        this.isWidescreen = bool2;
        this.transliterationName = str14;
        this.friendsUseApp = exploreWidgetsUserStackDto;
        this.isVkPayDisabled = bool3;
        this.notificationBadgeType = appsAppNotificationBadgeTypeDto;
        this.badgeInfo = superAppBadgeInfoDto;
        this.communitiesInstalledApp = exploreWidgetsUserStackDto2;
        this.communityCatalogTags = list5;
        this.isLayerRestricted = bool4;
        this.isOnlyDgRunnableOnWeb = bool5;
        this.isMiniAppFlow = bool6;
        this.isVkpayApp = bool7;
        this.isIframeMode = bool8;
        this.availableMethods = list6;
        this.sdkMethods = list7;
        this.supportUrl = str15;
        this.myTrackerTimespentCounterId = num6;
        this.appUrl = str16;
        this.mainScreenFeatureDisabled = bool9;
        this.favicon = str17;
        this.isNeedToShowLaunchScreen = bool10;
        this.downloadableGameAvailablePlatforms = list8;
        this.launchScreenActionButton = appsLaunchScreenActionButtonDto;
        this.launchScreenActionPlaceholder = appsLaunchScreenActionPlaceholderDto;
        this.launchScreenAppUsers = appsLaunchScreenAppUsersDto;
        this.launchScreenVideo = videoVideoFullDto;
        this.authorGroupInfo = appsAuthorGroupInfoDto;
        this.legalDocuments = appsLegalDocumentsDto;
        this.legalInfo = appsLegalInfoDto;
        this.isNeedToShowUnverifiedScreenOnLaunch = bool11;
        this.isAppPotentiallyHaveSimilar = bool12;
        this.friendsStack = appsFriendsStackDto;
        this.needShowPersonalDiscountAlert = bool13;
        this.isAvailableUserActions = bool14;
        this.hashAsParam = bool15;
        this.hashAsParamLegacy = bool16;
        this.withoutHeader = bool17;
        this.withoutFooter = bool18;
        this.isCanQuit = bool19;
        this.manageLink = str18;
        this.miniAppsWebCallApiFormData = bool20;
        this.supportedStyle = num7;
        this.authorOwnerId = num8;
        this.canCache = bool21;
        this.areNotificationsEnabled = bool22;
        this.isInstallScreen = bool23;
        this.isFavorite = bool24;
        this.isRecommended = bool25;
        this.isInstalled = bool26;
        this.trackCode = str19;
        this.shareUrl = str20;
        this.webviewUrl = str21;
        this.installScreenUrl = str22;
        this.hideTabbar = baseBoolIntDto3;
        this.placeholderInfo = appsAppPlaceholderInfoDto;
        this.preloadUrl = str23;
        this.icon139 = str24;
        this.icon150 = str25;
        this.icon278 = str26;
        this.icon576 = str27;
        this.backgroundLoaderColor = str28;
        this.loaderIcon = str29;
        this.splashScreen = appsSplashScreenDto;
        this.isSplashScreenEnabled = bool27;
        this.icon75 = str30;
        this.openInExternalBrowser = bool28;
        this.needPolicyConfirmation = bool29;
        this.isVkuiInternal = bool30;
        this.hasVkConnect = bool31;
        this.needShowBottomMenuTooltipOnClose = bool32;
        this.shortDescription = str31;
        this.slogan = str32;
        this.lastUpdate = num9;
        this.isDebug = bool33;
        this.archiveTestUrl = str33;
        this.testOdrRuntime = num10;
        this.adConfig = appsAppAdConfigDto;
        this.isPaymentsAllowed = bool34;
        this.profileButtonAvailable = bool35;
        this.isButtonAddedToProfile = bool36;
        this.isBadgeAllowed = bool37;
        this.appStatus = num11;
        this.screenOrientation = num12;
        this.mobileControlsType = num13;
        this.mobileViewSupportType = num14;
        this.isImActionsSupported = bool38;
        this.needShowUnverifiedScreen = bool39;
        this.isCallsAvailable = bool40;
        this.isPlugin = bool41;
        this.isTrusted = bool42;
    }

    public static AppsAppDto a(AppsAppDto appsAppDto, AppsAppTypeDto appsAppTypeDto) {
        int i = appsAppDto.id;
        String str = appsAppDto.title;
        String str2 = appsAppDto.authorUrl;
        String str3 = appsAppDto.banner1120;
        String str4 = appsAppDto.banner560;
        String str5 = appsAppDto.icon16;
        BaseBoolIntDto baseBoolIntDto = appsAppDto.isNew;
        BaseBoolIntDto baseBoolIntDto2 = appsAppDto.pushEnabled;
        AppsCatalogBannerDto appsCatalogBannerDto = appsAppDto.catalogBanner;
        List<Integer> list = appsAppDto.friends;
        Integer num = appsAppDto.catalogPosition;
        String str6 = appsAppDto.description;
        String str7 = appsAppDto.genre;
        Integer num2 = appsAppDto.genreId;
        AppsAppIframeSettingsDto appsAppIframeSettingsDto = appsAppDto.iframeSettings;
        Boolean bool = appsAppDto.international;
        Integer num3 = appsAppDto.isInCatalog;
        String str8 = appsAppDto.installUrl;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = appsAppDto.leaderboardType;
        Integer num4 = appsAppDto.membersCount;
        String str9 = appsAppDto.platformId;
        Integer num5 = appsAppDto.publishedDate;
        VideoVideoDto videoVideoDto = appsAppDto.promoVideo;
        List<AppsAppInstallRightDto> list2 = appsAppDto.rights;
        String str10 = appsAppDto.screenName;
        List<PhotosPhotoDto> list3 = appsAppDto.screenshots;
        String str11 = appsAppDto.section;
        String str12 = appsAppDto.externalBrowserUrl;
        String str13 = appsAppDto.badge;
        List<String> list4 = appsAppDto.preloadAdTypes;
        Boolean bool2 = appsAppDto.isWidescreen;
        String str14 = appsAppDto.transliterationName;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = appsAppDto.friendsUseApp;
        Boolean bool3 = appsAppDto.isVkPayDisabled;
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto = appsAppDto.notificationBadgeType;
        SuperAppBadgeInfoDto superAppBadgeInfoDto = appsAppDto.badgeInfo;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto2 = appsAppDto.communitiesInstalledApp;
        List<String> list5 = appsAppDto.communityCatalogTags;
        Boolean bool4 = appsAppDto.isLayerRestricted;
        Boolean bool5 = appsAppDto.isOnlyDgRunnableOnWeb;
        Boolean bool6 = appsAppDto.isMiniAppFlow;
        Boolean bool7 = appsAppDto.isVkpayApp;
        Boolean bool8 = appsAppDto.isIframeMode;
        List<String> list6 = appsAppDto.availableMethods;
        List<String> list7 = appsAppDto.sdkMethods;
        String str15 = appsAppDto.supportUrl;
        Integer num6 = appsAppDto.myTrackerTimespentCounterId;
        String str16 = appsAppDto.appUrl;
        Boolean bool9 = appsAppDto.mainScreenFeatureDisabled;
        String str17 = appsAppDto.favicon;
        Boolean bool10 = appsAppDto.isNeedToShowLaunchScreen;
        List<String> list8 = appsAppDto.downloadableGameAvailablePlatforms;
        AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto = appsAppDto.launchScreenActionButton;
        AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto = appsAppDto.launchScreenActionPlaceholder;
        AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto = appsAppDto.launchScreenAppUsers;
        VideoVideoFullDto videoVideoFullDto = appsAppDto.launchScreenVideo;
        AppsAuthorGroupInfoDto appsAuthorGroupInfoDto = appsAppDto.authorGroupInfo;
        AppsLegalDocumentsDto appsLegalDocumentsDto = appsAppDto.legalDocuments;
        AppsLegalInfoDto appsLegalInfoDto = appsAppDto.legalInfo;
        Boolean bool11 = appsAppDto.isNeedToShowUnverifiedScreenOnLaunch;
        Boolean bool12 = appsAppDto.isAppPotentiallyHaveSimilar;
        AppsFriendsStackDto appsFriendsStackDto = appsAppDto.friendsStack;
        Boolean bool13 = appsAppDto.needShowPersonalDiscountAlert;
        Boolean bool14 = appsAppDto.isAvailableUserActions;
        Boolean bool15 = appsAppDto.hashAsParam;
        Boolean bool16 = appsAppDto.hashAsParamLegacy;
        Boolean bool17 = appsAppDto.withoutHeader;
        Boolean bool18 = appsAppDto.withoutFooter;
        Boolean bool19 = appsAppDto.isCanQuit;
        String str18 = appsAppDto.manageLink;
        Boolean bool20 = appsAppDto.miniAppsWebCallApiFormData;
        Integer num7 = appsAppDto.supportedStyle;
        Integer num8 = appsAppDto.authorOwnerId;
        Boolean bool21 = appsAppDto.canCache;
        Boolean bool22 = appsAppDto.areNotificationsEnabled;
        Boolean bool23 = appsAppDto.isInstallScreen;
        Boolean bool24 = appsAppDto.isFavorite;
        Boolean bool25 = appsAppDto.isRecommended;
        Boolean bool26 = appsAppDto.isInstalled;
        String str19 = appsAppDto.trackCode;
        String str20 = appsAppDto.shareUrl;
        String str21 = appsAppDto.webviewUrl;
        String str22 = appsAppDto.installScreenUrl;
        BaseBoolIntDto baseBoolIntDto3 = appsAppDto.hideTabbar;
        AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto = appsAppDto.placeholderInfo;
        String str23 = appsAppDto.preloadUrl;
        String str24 = appsAppDto.icon139;
        String str25 = appsAppDto.icon150;
        String str26 = appsAppDto.icon278;
        String str27 = appsAppDto.icon576;
        String str28 = appsAppDto.backgroundLoaderColor;
        String str29 = appsAppDto.loaderIcon;
        AppsSplashScreenDto appsSplashScreenDto = appsAppDto.splashScreen;
        Boolean bool27 = appsAppDto.isSplashScreenEnabled;
        String str30 = appsAppDto.icon75;
        Boolean bool28 = appsAppDto.openInExternalBrowser;
        Boolean bool29 = appsAppDto.needPolicyConfirmation;
        Boolean bool30 = appsAppDto.isVkuiInternal;
        Boolean bool31 = appsAppDto.hasVkConnect;
        Boolean bool32 = appsAppDto.needShowBottomMenuTooltipOnClose;
        String str31 = appsAppDto.shortDescription;
        String str32 = appsAppDto.slogan;
        Integer num9 = appsAppDto.lastUpdate;
        Boolean bool33 = appsAppDto.isDebug;
        String str33 = appsAppDto.archiveTestUrl;
        Integer num10 = appsAppDto.testOdrRuntime;
        AppsAppAdConfigDto appsAppAdConfigDto = appsAppDto.adConfig;
        Boolean bool34 = appsAppDto.isPaymentsAllowed;
        Boolean bool35 = appsAppDto.profileButtonAvailable;
        Boolean bool36 = appsAppDto.isButtonAddedToProfile;
        Boolean bool37 = appsAppDto.isBadgeAllowed;
        Integer num11 = appsAppDto.appStatus;
        Integer num12 = appsAppDto.screenOrientation;
        Integer num13 = appsAppDto.mobileControlsType;
        Integer num14 = appsAppDto.mobileViewSupportType;
        Boolean bool38 = appsAppDto.isImActionsSupported;
        Boolean bool39 = appsAppDto.needShowUnverifiedScreen;
        Boolean bool40 = appsAppDto.isCallsAvailable;
        Boolean bool41 = appsAppDto.isPlugin;
        Boolean bool42 = appsAppDto.isTrusted;
        appsAppDto.getClass();
        return new AppsAppDto(appsAppTypeDto, i, str, str2, str3, str4, str5, baseBoolIntDto, baseBoolIntDto2, appsCatalogBannerDto, list, num, str6, str7, num2, appsAppIframeSettingsDto, bool, num3, str8, appsAppLeaderboardTypeDto, num4, str9, num5, videoVideoDto, list2, str10, list3, str11, str12, str13, list4, bool2, str14, exploreWidgetsUserStackDto, bool3, appsAppNotificationBadgeTypeDto, superAppBadgeInfoDto, exploreWidgetsUserStackDto2, list5, bool4, bool5, bool6, bool7, bool8, list6, list7, str15, num6, str16, bool9, str17, bool10, list8, appsLaunchScreenActionButtonDto, appsLaunchScreenActionPlaceholderDto, appsLaunchScreenAppUsersDto, videoVideoFullDto, appsAuthorGroupInfoDto, appsLegalDocumentsDto, appsLegalInfoDto, bool11, bool12, appsFriendsStackDto, bool13, bool14, bool15, bool16, bool17, bool18, bool19, str18, bool20, num7, num8, bool21, bool22, bool23, bool24, bool25, bool26, str19, str20, str21, str22, baseBoolIntDto3, appsAppPlaceholderInfoDto, str23, str24, str25, str26, str27, str28, str29, appsSplashScreenDto, bool27, str30, bool28, bool29, bool30, bool31, bool32, str31, str32, num9, bool33, str33, num10, appsAppAdConfigDto, bool34, bool35, bool36, bool37, num11, num12, num13, num14, bool38, bool39, bool40, bool41, bool42);
    }

    public final String B() {
        return this.genre;
    }

    public final Boolean B1() {
        return this.isInstalled;
    }

    public final Integer C() {
        return this.genreId;
    }

    public final Boolean D() {
        return this.hasVkConnect;
    }

    public final Boolean D0() {
        return this.needShowUnverifiedScreen;
    }

    public final BaseBoolIntDto D1() {
        return this.isNew;
    }

    public final Boolean E1() {
        return this.isRecommended;
    }

    public final BaseBoolIntDto F() {
        return this.hideTabbar;
    }

    public final AppsAppNotificationBadgeTypeDto F0() {
        return this.notificationBadgeType;
    }

    public final String G() {
        return this.icon139;
    }

    public final AppsAppPlaceholderInfoDto H0() {
        return this.placeholderInfo;
    }

    public final String K() {
        return this.icon150;
    }

    public final List<AppsAppInstallRightDto> K0() {
        return this.rights;
    }

    public final Boolean L1() {
        return this.isTrusted;
    }

    public final String M() {
        return this.icon278;
    }

    public final Integer N0() {
        return this.screenOrientation;
    }

    public final Boolean N1() {
        return this.isVkPayDisabled;
    }

    public final List<PhotosPhotoDto> P0() {
        return this.screenshots;
    }

    public final String R() {
        return this.icon576;
    }

    public final Boolean R1() {
        return this.isVkuiInternal;
    }

    public final String S0() {
        return this.shortDescription;
    }

    public final String T() {
        return this.icon75;
    }

    public final String U0() {
        return this.slogan;
    }

    public final AppsSplashScreenDto V0() {
        return this.splashScreen;
    }

    public final AppsAppLeaderboardTypeDto W() {
        return this.leaderboardType;
    }

    public final AppsLegalInfoDto Z() {
        return this.legalInfo;
    }

    public final String a0() {
        return this.loaderIcon;
    }

    public final String b1() {
        return this.supportUrl;
    }

    public final AppsAppAdConfigDto d() {
        return this.adConfig;
    }

    public final AppsAppTypeDto d1() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.appStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppDto)) {
            return false;
        }
        AppsAppDto appsAppDto = (AppsAppDto) obj;
        return this.type == appsAppDto.type && this.id == appsAppDto.id && epx.f(this.title, appsAppDto.title) && epx.f(this.authorUrl, appsAppDto.authorUrl) && epx.f(this.banner1120, appsAppDto.banner1120) && epx.f(this.banner560, appsAppDto.banner560) && epx.f(this.icon16, appsAppDto.icon16) && this.isNew == appsAppDto.isNew && this.pushEnabled == appsAppDto.pushEnabled && epx.f(this.catalogBanner, appsAppDto.catalogBanner) && epx.f(this.friends, appsAppDto.friends) && epx.f(this.catalogPosition, appsAppDto.catalogPosition) && epx.f(this.description, appsAppDto.description) && epx.f(this.genre, appsAppDto.genre) && epx.f(this.genreId, appsAppDto.genreId) && epx.f(this.iframeSettings, appsAppDto.iframeSettings) && epx.f(this.international, appsAppDto.international) && epx.f(this.isInCatalog, appsAppDto.isInCatalog) && epx.f(this.installUrl, appsAppDto.installUrl) && this.leaderboardType == appsAppDto.leaderboardType && epx.f(this.membersCount, appsAppDto.membersCount) && epx.f(this.platformId, appsAppDto.platformId) && epx.f(this.publishedDate, appsAppDto.publishedDate) && epx.f(this.promoVideo, appsAppDto.promoVideo) && epx.f(this.rights, appsAppDto.rights) && epx.f(this.screenName, appsAppDto.screenName) && epx.f(this.screenshots, appsAppDto.screenshots) && epx.f(this.section, appsAppDto.section) && epx.f(this.externalBrowserUrl, appsAppDto.externalBrowserUrl) && epx.f(this.badge, appsAppDto.badge) && epx.f(this.preloadAdTypes, appsAppDto.preloadAdTypes) && epx.f(this.isWidescreen, appsAppDto.isWidescreen) && epx.f(this.transliterationName, appsAppDto.transliterationName) && epx.f(this.friendsUseApp, appsAppDto.friendsUseApp) && epx.f(this.isVkPayDisabled, appsAppDto.isVkPayDisabled) && this.notificationBadgeType == appsAppDto.notificationBadgeType && epx.f(this.badgeInfo, appsAppDto.badgeInfo) && epx.f(this.communitiesInstalledApp, appsAppDto.communitiesInstalledApp) && epx.f(this.communityCatalogTags, appsAppDto.communityCatalogTags) && epx.f(this.isLayerRestricted, appsAppDto.isLayerRestricted) && epx.f(this.isOnlyDgRunnableOnWeb, appsAppDto.isOnlyDgRunnableOnWeb) && epx.f(this.isMiniAppFlow, appsAppDto.isMiniAppFlow) && epx.f(this.isVkpayApp, appsAppDto.isVkpayApp) && epx.f(this.isIframeMode, appsAppDto.isIframeMode) && epx.f(this.availableMethods, appsAppDto.availableMethods) && epx.f(this.sdkMethods, appsAppDto.sdkMethods) && epx.f(this.supportUrl, appsAppDto.supportUrl) && epx.f(this.myTrackerTimespentCounterId, appsAppDto.myTrackerTimespentCounterId) && epx.f(this.appUrl, appsAppDto.appUrl) && epx.f(this.mainScreenFeatureDisabled, appsAppDto.mainScreenFeatureDisabled) && epx.f(this.favicon, appsAppDto.favicon) && epx.f(this.isNeedToShowLaunchScreen, appsAppDto.isNeedToShowLaunchScreen) && epx.f(this.downloadableGameAvailablePlatforms, appsAppDto.downloadableGameAvailablePlatforms) && epx.f(this.launchScreenActionButton, appsAppDto.launchScreenActionButton) && epx.f(this.launchScreenActionPlaceholder, appsAppDto.launchScreenActionPlaceholder) && epx.f(this.launchScreenAppUsers, appsAppDto.launchScreenAppUsers) && epx.f(this.launchScreenVideo, appsAppDto.launchScreenVideo) && epx.f(this.authorGroupInfo, appsAppDto.authorGroupInfo) && epx.f(this.legalDocuments, appsAppDto.legalDocuments) && epx.f(this.legalInfo, appsAppDto.legalInfo) && epx.f(this.isNeedToShowUnverifiedScreenOnLaunch, appsAppDto.isNeedToShowUnverifiedScreenOnLaunch) && epx.f(this.isAppPotentiallyHaveSimilar, appsAppDto.isAppPotentiallyHaveSimilar) && epx.f(this.friendsStack, appsAppDto.friendsStack) && epx.f(this.needShowPersonalDiscountAlert, appsAppDto.needShowPersonalDiscountAlert) && epx.f(this.isAvailableUserActions, appsAppDto.isAvailableUserActions) && epx.f(this.hashAsParam, appsAppDto.hashAsParam) && epx.f(this.hashAsParamLegacy, appsAppDto.hashAsParamLegacy) && epx.f(this.withoutHeader, appsAppDto.withoutHeader) && epx.f(this.withoutFooter, appsAppDto.withoutFooter) && epx.f(this.isCanQuit, appsAppDto.isCanQuit) && epx.f(this.manageLink, appsAppDto.manageLink) && epx.f(this.miniAppsWebCallApiFormData, appsAppDto.miniAppsWebCallApiFormData) && epx.f(this.supportedStyle, appsAppDto.supportedStyle) && epx.f(this.authorOwnerId, appsAppDto.authorOwnerId) && epx.f(this.canCache, appsAppDto.canCache) && epx.f(this.areNotificationsEnabled, appsAppDto.areNotificationsEnabled) && epx.f(this.isInstallScreen, appsAppDto.isInstallScreen) && epx.f(this.isFavorite, appsAppDto.isFavorite) && epx.f(this.isRecommended, appsAppDto.isRecommended) && epx.f(this.isInstalled, appsAppDto.isInstalled) && epx.f(this.trackCode, appsAppDto.trackCode) && epx.f(this.shareUrl, appsAppDto.shareUrl) && epx.f(this.webviewUrl, appsAppDto.webviewUrl) && epx.f(this.installScreenUrl, appsAppDto.installScreenUrl) && this.hideTabbar == appsAppDto.hideTabbar && epx.f(this.placeholderInfo, appsAppDto.placeholderInfo) && epx.f(this.preloadUrl, appsAppDto.preloadUrl) && epx.f(this.icon139, appsAppDto.icon139) && epx.f(this.icon150, appsAppDto.icon150) && epx.f(this.icon278, appsAppDto.icon278) && epx.f(this.icon576, appsAppDto.icon576) && epx.f(this.backgroundLoaderColor, appsAppDto.backgroundLoaderColor) && epx.f(this.loaderIcon, appsAppDto.loaderIcon) && epx.f(this.splashScreen, appsAppDto.splashScreen) && epx.f(this.isSplashScreenEnabled, appsAppDto.isSplashScreenEnabled) && epx.f(this.icon75, appsAppDto.icon75) && epx.f(this.openInExternalBrowser, appsAppDto.openInExternalBrowser) && epx.f(this.needPolicyConfirmation, appsAppDto.needPolicyConfirmation) && epx.f(this.isVkuiInternal, appsAppDto.isVkuiInternal) && epx.f(this.hasVkConnect, appsAppDto.hasVkConnect) && epx.f(this.needShowBottomMenuTooltipOnClose, appsAppDto.needShowBottomMenuTooltipOnClose) && epx.f(this.shortDescription, appsAppDto.shortDescription) && epx.f(this.slogan, appsAppDto.slogan) && epx.f(this.lastUpdate, appsAppDto.lastUpdate) && epx.f(this.isDebug, appsAppDto.isDebug) && epx.f(this.archiveTestUrl, appsAppDto.archiveTestUrl) && epx.f(this.testOdrRuntime, appsAppDto.testOdrRuntime) && epx.f(this.adConfig, appsAppDto.adConfig) && epx.f(this.isPaymentsAllowed, appsAppDto.isPaymentsAllowed) && epx.f(this.profileButtonAvailable, appsAppDto.profileButtonAvailable) && epx.f(this.isButtonAddedToProfile, appsAppDto.isButtonAddedToProfile) && epx.f(this.isBadgeAllowed, appsAppDto.isBadgeAllowed) && epx.f(this.appStatus, appsAppDto.appStatus) && epx.f(this.screenOrientation, appsAppDto.screenOrientation) && epx.f(this.mobileControlsType, appsAppDto.mobileControlsType) && epx.f(this.mobileViewSupportType, appsAppDto.mobileViewSupportType) && epx.f(this.isImActionsSupported, appsAppDto.isImActionsSupported) && epx.f(this.needShowUnverifiedScreen, appsAppDto.needShowUnverifiedScreen) && epx.f(this.isCallsAvailable, appsAppDto.isCallsAvailable) && epx.f(this.isPlugin, appsAppDto.isPlugin) && epx.f(this.isTrusted, appsAppDto.isTrusted);
    }

    public final Boolean f() {
        return this.areNotificationsEnabled;
    }

    public final Integer g() {
        return this.authorOwnerId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.id, this.type.hashCode() * 31, 31), 31, this.title);
        String str = this.authorUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.banner1120;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.banner560;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon16;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isNew;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.pushEnabled;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        AppsCatalogBannerDto appsCatalogBannerDto = this.catalogBanner;
        int hashCode7 = (hashCode6 + (appsCatalogBannerDto == null ? 0 : appsCatalogBannerDto.hashCode())) * 31;
        List<Integer> list = this.friends;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.catalogPosition;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.description;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.genre;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.genreId;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AppsAppIframeSettingsDto appsAppIframeSettingsDto = this.iframeSettings;
        int hashCode13 = (hashCode12 + (appsAppIframeSettingsDto == null ? 0 : appsAppIframeSettingsDto.hashCode())) * 31;
        Boolean bool = this.international;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.isInCatalog;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.installUrl;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = this.leaderboardType;
        int hashCode17 = (hashCode16 + (appsAppLeaderboardTypeDto == null ? 0 : appsAppLeaderboardTypeDto.hashCode())) * 31;
        Integer num4 = this.membersCount;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.platformId;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num5 = this.publishedDate;
        int hashCode20 = (hashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        VideoVideoDto videoVideoDto = this.promoVideo;
        int hashCode21 = (hashCode20 + (videoVideoDto == null ? 0 : videoVideoDto.hashCode())) * 31;
        List<AppsAppInstallRightDto> list2 = this.rights;
        int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str9 = this.screenName;
        int hashCode23 = (hashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<PhotosPhotoDto> list3 = this.screenshots;
        int hashCode24 = (hashCode23 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str10 = this.section;
        int hashCode25 = (hashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.externalBrowserUrl;
        int hashCode26 = (hashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.badge;
        int hashCode27 = (hashCode26 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list4 = this.preloadAdTypes;
        int hashCode28 = (hashCode27 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.isWidescreen;
        int hashCode29 = (hashCode28 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str13 = this.transliterationName;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = this.friendsUseApp;
        int hashCode31 = (hashCode30 + (exploreWidgetsUserStackDto == null ? 0 : exploreWidgetsUserStackDto.hashCode())) * 31;
        Boolean bool3 = this.isVkPayDisabled;
        int hashCode32 = (hashCode31 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto = this.notificationBadgeType;
        int hashCode33 = (hashCode32 + (appsAppNotificationBadgeTypeDto == null ? 0 : appsAppNotificationBadgeTypeDto.hashCode())) * 31;
        SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
        int hashCode34 = (hashCode33 + (superAppBadgeInfoDto == null ? 0 : superAppBadgeInfoDto.hashCode())) * 31;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto2 = this.communitiesInstalledApp;
        int hashCode35 = (hashCode34 + (exploreWidgetsUserStackDto2 == null ? 0 : exploreWidgetsUserStackDto2.hashCode())) * 31;
        List<String> list5 = this.communityCatalogTags;
        int hashCode36 = (hashCode35 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool4 = this.isLayerRestricted;
        int hashCode37 = (hashCode36 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isOnlyDgRunnableOnWeb;
        int hashCode38 = (hashCode37 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isMiniAppFlow;
        int hashCode39 = (hashCode38 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isVkpayApp;
        int hashCode40 = (hashCode39 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isIframeMode;
        int hashCode41 = (hashCode40 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        List<String> list6 = this.availableMethods;
        int hashCode42 = (hashCode41 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.sdkMethods;
        int hashCode43 = (hashCode42 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str14 = this.supportUrl;
        int hashCode44 = (hashCode43 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num6 = this.myTrackerTimespentCounterId;
        int hashCode45 = (hashCode44 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str15 = this.appUrl;
        int hashCode46 = (hashCode45 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool9 = this.mainScreenFeatureDisabled;
        int hashCode47 = (hashCode46 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str16 = this.favicon;
        int hashCode48 = (hashCode47 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool10 = this.isNeedToShowLaunchScreen;
        int hashCode49 = (hashCode48 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        List<String> list8 = this.downloadableGameAvailablePlatforms;
        int hashCode50 = (hashCode49 + (list8 == null ? 0 : list8.hashCode())) * 31;
        AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto = this.launchScreenActionButton;
        int hashCode51 = (hashCode50 + (appsLaunchScreenActionButtonDto == null ? 0 : appsLaunchScreenActionButtonDto.hashCode())) * 31;
        AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto = this.launchScreenActionPlaceholder;
        int hashCode52 = (hashCode51 + (appsLaunchScreenActionPlaceholderDto == null ? 0 : appsLaunchScreenActionPlaceholderDto.hashCode())) * 31;
        AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto = this.launchScreenAppUsers;
        int hashCode53 = (hashCode52 + (appsLaunchScreenAppUsersDto == null ? 0 : appsLaunchScreenAppUsersDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.launchScreenVideo;
        int hashCode54 = (hashCode53 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        AppsAuthorGroupInfoDto appsAuthorGroupInfoDto = this.authorGroupInfo;
        int hashCode55 = (hashCode54 + (appsAuthorGroupInfoDto == null ? 0 : appsAuthorGroupInfoDto.hashCode())) * 31;
        AppsLegalDocumentsDto appsLegalDocumentsDto = this.legalDocuments;
        int hashCode56 = (hashCode55 + (appsLegalDocumentsDto == null ? 0 : appsLegalDocumentsDto.hashCode())) * 31;
        AppsLegalInfoDto appsLegalInfoDto = this.legalInfo;
        int hashCode57 = (hashCode56 + (appsLegalInfoDto == null ? 0 : appsLegalInfoDto.hashCode())) * 31;
        Boolean bool11 = this.isNeedToShowUnverifiedScreenOnLaunch;
        int hashCode58 = (hashCode57 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isAppPotentiallyHaveSimilar;
        int hashCode59 = (hashCode58 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        AppsFriendsStackDto appsFriendsStackDto = this.friendsStack;
        int hashCode60 = (hashCode59 + (appsFriendsStackDto == null ? 0 : appsFriendsStackDto.hashCode())) * 31;
        Boolean bool13 = this.needShowPersonalDiscountAlert;
        int hashCode61 = (hashCode60 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.isAvailableUserActions;
        int hashCode62 = (hashCode61 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.hashAsParam;
        int hashCode63 = (hashCode62 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.hashAsParamLegacy;
        int hashCode64 = (hashCode63 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.withoutHeader;
        int hashCode65 = (hashCode64 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.withoutFooter;
        int hashCode66 = (hashCode65 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.isCanQuit;
        int hashCode67 = (hashCode66 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        String str17 = this.manageLink;
        int hashCode68 = (hashCode67 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool20 = this.miniAppsWebCallApiFormData;
        int hashCode69 = (hashCode68 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Integer num7 = this.supportedStyle;
        int hashCode70 = (hashCode69 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.authorOwnerId;
        int hashCode71 = (hashCode70 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool21 = this.canCache;
        int hashCode72 = (hashCode71 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.areNotificationsEnabled;
        int hashCode73 = (hashCode72 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.isInstallScreen;
        int hashCode74 = (hashCode73 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.isFavorite;
        int hashCode75 = (hashCode74 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.isRecommended;
        int hashCode76 = (hashCode75 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.isInstalled;
        int hashCode77 = (hashCode76 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        String str18 = this.trackCode;
        int hashCode78 = (hashCode77 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.shareUrl;
        int hashCode79 = (hashCode78 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.webviewUrl;
        int hashCode80 = (hashCode79 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.installScreenUrl;
        int hashCode81 = (hashCode80 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.hideTabbar;
        int hashCode82 = (hashCode81 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto = this.placeholderInfo;
        int hashCode83 = (hashCode82 + (appsAppPlaceholderInfoDto == null ? 0 : appsAppPlaceholderInfoDto.hashCode())) * 31;
        String str22 = this.preloadUrl;
        int hashCode84 = (hashCode83 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.icon139;
        int hashCode85 = (hashCode84 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.icon150;
        int hashCode86 = (hashCode85 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.icon278;
        int hashCode87 = (hashCode86 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.icon576;
        int hashCode88 = (hashCode87 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.backgroundLoaderColor;
        int hashCode89 = (hashCode88 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.loaderIcon;
        int hashCode90 = (hashCode89 + (str28 == null ? 0 : str28.hashCode())) * 31;
        AppsSplashScreenDto appsSplashScreenDto = this.splashScreen;
        int hashCode91 = (hashCode90 + (appsSplashScreenDto == null ? 0 : appsSplashScreenDto.hashCode())) * 31;
        Boolean bool27 = this.isSplashScreenEnabled;
        int hashCode92 = (hashCode91 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        String str29 = this.icon75;
        int hashCode93 = (hashCode92 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Boolean bool28 = this.openInExternalBrowser;
        int hashCode94 = (hashCode93 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.needPolicyConfirmation;
        int hashCode95 = (hashCode94 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isVkuiInternal;
        int hashCode96 = (hashCode95 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.hasVkConnect;
        int hashCode97 = (hashCode96 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.needShowBottomMenuTooltipOnClose;
        int hashCode98 = (hashCode97 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        String str30 = this.shortDescription;
        int hashCode99 = (hashCode98 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.slogan;
        int hashCode100 = (hashCode99 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num9 = this.lastUpdate;
        int hashCode101 = (hashCode100 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool33 = this.isDebug;
        int hashCode102 = (hashCode101 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        String str32 = this.archiveTestUrl;
        int hashCode103 = (hashCode102 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Integer num10 = this.testOdrRuntime;
        int hashCode104 = (hashCode103 + (num10 == null ? 0 : num10.hashCode())) * 31;
        AppsAppAdConfigDto appsAppAdConfigDto = this.adConfig;
        int hashCode105 = (hashCode104 + (appsAppAdConfigDto == null ? 0 : appsAppAdConfigDto.hashCode())) * 31;
        Boolean bool34 = this.isPaymentsAllowed;
        int hashCode106 = (hashCode105 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.profileButtonAvailable;
        int hashCode107 = (hashCode106 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.isButtonAddedToProfile;
        int hashCode108 = (hashCode107 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        Boolean bool37 = this.isBadgeAllowed;
        int hashCode109 = (hashCode108 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Integer num11 = this.appStatus;
        int hashCode110 = (hashCode109 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.screenOrientation;
        int hashCode111 = (hashCode110 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.mobileControlsType;
        int hashCode112 = (hashCode111 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.mobileViewSupportType;
        int hashCode113 = (hashCode112 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool38 = this.isImActionsSupported;
        int hashCode114 = (hashCode113 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        Boolean bool39 = this.needShowUnverifiedScreen;
        int hashCode115 = (hashCode114 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.isCallsAvailable;
        int hashCode116 = (hashCode115 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        Boolean bool41 = this.isPlugin;
        int hashCode117 = (hashCode116 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        Boolean bool42 = this.isTrusted;
        return hashCode117 + (bool42 != null ? bool42.hashCode() : 0);
    }

    public final String i() {
        return this.backgroundLoaderColor;
    }

    public final String j() {
        return this.badge;
    }

    public final String k() {
        return this.banner1120;
    }

    public final String l() {
        return this.banner560;
    }

    public final Integer l0() {
        return this.membersCount;
    }

    public final Boolean n() {
        return this.canCache;
    }

    public final String n1() {
        return this.webviewUrl;
    }

    public final AppsCatalogBannerDto o() {
        return this.catalogBanner;
    }

    public final Boolean o1() {
        return this.isBadgeAllowed;
    }

    public final List<Integer> p() {
        return this.friends;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String ra() {
        return this.shareUrl;
    }

    public final Boolean s1() {
        return this.isCallsAvailable;
    }

    public final Boolean t1() {
        return this.isDebug;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppDto(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", authorUrl=");
        sb.append(this.authorUrl);
        sb.append(", banner1120=");
        sb.append(this.banner1120);
        sb.append(", banner560=");
        sb.append(this.banner560);
        sb.append(", icon16=");
        sb.append(this.icon16);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", pushEnabled=");
        sb.append(this.pushEnabled);
        sb.append(", catalogBanner=");
        sb.append(this.catalogBanner);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", catalogPosition=");
        sb.append(this.catalogPosition);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", genre=");
        sb.append(this.genre);
        sb.append(", genreId=");
        sb.append(this.genreId);
        sb.append(", iframeSettings=");
        sb.append(this.iframeSettings);
        sb.append(", international=");
        sb.append(this.international);
        sb.append(", isInCatalog=");
        sb.append(this.isInCatalog);
        sb.append(", installUrl=");
        sb.append(this.installUrl);
        sb.append(", leaderboardType=");
        sb.append(this.leaderboardType);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", platformId=");
        sb.append(this.platformId);
        sb.append(", publishedDate=");
        sb.append(this.publishedDate);
        sb.append(", promoVideo=");
        sb.append(this.promoVideo);
        sb.append(", rights=");
        sb.append(this.rights);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", screenshots=");
        sb.append(this.screenshots);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", externalBrowserUrl=");
        sb.append(this.externalBrowserUrl);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", preloadAdTypes=");
        sb.append(this.preloadAdTypes);
        sb.append(", isWidescreen=");
        sb.append(this.isWidescreen);
        sb.append(", transliterationName=");
        sb.append(this.transliterationName);
        sb.append(", friendsUseApp=");
        sb.append(this.friendsUseApp);
        sb.append(", isVkPayDisabled=");
        sb.append(this.isVkPayDisabled);
        sb.append(", notificationBadgeType=");
        sb.append(this.notificationBadgeType);
        sb.append(", badgeInfo=");
        sb.append(this.badgeInfo);
        sb.append(", communitiesInstalledApp=");
        sb.append(this.communitiesInstalledApp);
        sb.append(", communityCatalogTags=");
        sb.append(this.communityCatalogTags);
        sb.append(", isLayerRestricted=");
        sb.append(this.isLayerRestricted);
        sb.append(", isOnlyDgRunnableOnWeb=");
        sb.append(this.isOnlyDgRunnableOnWeb);
        sb.append(", isMiniAppFlow=");
        sb.append(this.isMiniAppFlow);
        sb.append(", isVkpayApp=");
        sb.append(this.isVkpayApp);
        sb.append(", isIframeMode=");
        sb.append(this.isIframeMode);
        sb.append(", availableMethods=");
        sb.append(this.availableMethods);
        sb.append(", sdkMethods=");
        sb.append(this.sdkMethods);
        sb.append(", supportUrl=");
        sb.append(this.supportUrl);
        sb.append(", myTrackerTimespentCounterId=");
        sb.append(this.myTrackerTimespentCounterId);
        sb.append(", appUrl=");
        sb.append(this.appUrl);
        sb.append(", mainScreenFeatureDisabled=");
        sb.append(this.mainScreenFeatureDisabled);
        sb.append(", favicon=");
        sb.append(this.favicon);
        sb.append(", isNeedToShowLaunchScreen=");
        sb.append(this.isNeedToShowLaunchScreen);
        sb.append(", downloadableGameAvailablePlatforms=");
        sb.append(this.downloadableGameAvailablePlatforms);
        sb.append(", launchScreenActionButton=");
        sb.append(this.launchScreenActionButton);
        sb.append(", launchScreenActionPlaceholder=");
        sb.append(this.launchScreenActionPlaceholder);
        sb.append(", launchScreenAppUsers=");
        sb.append(this.launchScreenAppUsers);
        sb.append(", launchScreenVideo=");
        sb.append(this.launchScreenVideo);
        sb.append(", authorGroupInfo=");
        sb.append(this.authorGroupInfo);
        sb.append(", legalDocuments=");
        sb.append(this.legalDocuments);
        sb.append(", legalInfo=");
        sb.append(this.legalInfo);
        sb.append(", isNeedToShowUnverifiedScreenOnLaunch=");
        sb.append(this.isNeedToShowUnverifiedScreenOnLaunch);
        sb.append(", isAppPotentiallyHaveSimilar=");
        sb.append(this.isAppPotentiallyHaveSimilar);
        sb.append(", friendsStack=");
        sb.append(this.friendsStack);
        sb.append(", needShowPersonalDiscountAlert=");
        sb.append(this.needShowPersonalDiscountAlert);
        sb.append(", isAvailableUserActions=");
        sb.append(this.isAvailableUserActions);
        sb.append(", hashAsParam=");
        sb.append(this.hashAsParam);
        sb.append(", hashAsParamLegacy=");
        sb.append(this.hashAsParamLegacy);
        sb.append(", withoutHeader=");
        sb.append(this.withoutHeader);
        sb.append(", withoutFooter=");
        sb.append(this.withoutFooter);
        sb.append(", isCanQuit=");
        sb.append(this.isCanQuit);
        sb.append(", manageLink=");
        sb.append(this.manageLink);
        sb.append(", miniAppsWebCallApiFormData=");
        sb.append(this.miniAppsWebCallApiFormData);
        sb.append(", supportedStyle=");
        sb.append(this.supportedStyle);
        sb.append(", authorOwnerId=");
        sb.append(this.authorOwnerId);
        sb.append(", canCache=");
        sb.append(this.canCache);
        sb.append(", areNotificationsEnabled=");
        sb.append(this.areNotificationsEnabled);
        sb.append(", isInstallScreen=");
        sb.append(this.isInstallScreen);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", isRecommended=");
        sb.append(this.isRecommended);
        sb.append(", isInstalled=");
        sb.append(this.isInstalled);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", shareUrl=");
        sb.append(this.shareUrl);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", installScreenUrl=");
        sb.append(this.installScreenUrl);
        sb.append(", hideTabbar=");
        sb.append(this.hideTabbar);
        sb.append(", placeholderInfo=");
        sb.append(this.placeholderInfo);
        sb.append(", preloadUrl=");
        sb.append(this.preloadUrl);
        sb.append(", icon139=");
        sb.append(this.icon139);
        sb.append(", icon150=");
        sb.append(this.icon150);
        sb.append(", icon278=");
        sb.append(this.icon278);
        sb.append(", icon576=");
        sb.append(this.icon576);
        sb.append(", backgroundLoaderColor=");
        sb.append(this.backgroundLoaderColor);
        sb.append(", loaderIcon=");
        sb.append(this.loaderIcon);
        sb.append(", splashScreen=");
        sb.append(this.splashScreen);
        sb.append(", isSplashScreenEnabled=");
        sb.append(this.isSplashScreenEnabled);
        sb.append(", icon75=");
        sb.append(this.icon75);
        sb.append(", openInExternalBrowser=");
        sb.append(this.openInExternalBrowser);
        sb.append(", needPolicyConfirmation=");
        sb.append(this.needPolicyConfirmation);
        sb.append(", isVkuiInternal=");
        sb.append(this.isVkuiInternal);
        sb.append(", hasVkConnect=");
        sb.append(this.hasVkConnect);
        sb.append(", needShowBottomMenuTooltipOnClose=");
        sb.append(this.needShowBottomMenuTooltipOnClose);
        sb.append(", shortDescription=");
        sb.append(this.shortDescription);
        sb.append(", slogan=");
        sb.append(this.slogan);
        sb.append(", lastUpdate=");
        sb.append(this.lastUpdate);
        sb.append(", isDebug=");
        sb.append(this.isDebug);
        sb.append(", archiveTestUrl=");
        sb.append(this.archiveTestUrl);
        sb.append(", testOdrRuntime=");
        sb.append(this.testOdrRuntime);
        sb.append(", adConfig=");
        sb.append(this.adConfig);
        sb.append(", isPaymentsAllowed=");
        sb.append(this.isPaymentsAllowed);
        sb.append(", profileButtonAvailable=");
        sb.append(this.profileButtonAvailable);
        sb.append(", isButtonAddedToProfile=");
        sb.append(this.isButtonAddedToProfile);
        sb.append(", isBadgeAllowed=");
        sb.append(this.isBadgeAllowed);
        sb.append(", appStatus=");
        sb.append(this.appStatus);
        sb.append(", screenOrientation=");
        sb.append(this.screenOrientation);
        sb.append(", mobileControlsType=");
        sb.append(this.mobileControlsType);
        sb.append(", mobileViewSupportType=");
        sb.append(this.mobileViewSupportType);
        sb.append(", isImActionsSupported=");
        sb.append(this.isImActionsSupported);
        sb.append(", needShowUnverifiedScreen=");
        sb.append(this.needShowUnverifiedScreen);
        sb.append(", isCallsAvailable=");
        sb.append(this.isCallsAvailable);
        sb.append(", isPlugin=");
        sb.append(this.isPlugin);
        sb.append(", isTrusted=");
        return tn.a(sb, this.isTrusted, ')');
    }

    public final ExploreWidgetsUserStackDto u() {
        return this.friendsUseApp;
    }

    public final Integer v0() {
        return this.mobileControlsType;
    }

    public final Boolean w0() {
        return this.needPolicyConfirmation;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.authorUrl);
        parcel.writeString(this.banner1120);
        parcel.writeString(this.banner560);
        parcel.writeString(this.icon16);
        BaseBoolIntDto baseBoolIntDto = this.isNew;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.pushEnabled;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        AppsCatalogBannerDto appsCatalogBannerDto = this.catalogBanner;
        if (appsCatalogBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsCatalogBannerDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num = this.catalogPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.genre);
        Integer num2 = this.genreId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AppsAppIframeSettingsDto appsAppIframeSettingsDto = this.iframeSettings;
        if (appsAppIframeSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppIframeSettingsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.international;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.isInCatalog;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.installUrl);
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = this.leaderboardType;
        if (appsAppLeaderboardTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppLeaderboardTypeDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.membersCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.platformId);
        Integer num5 = this.publishedDate;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        VideoVideoDto videoVideoDto = this.promoVideo;
        if (videoVideoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoDto.writeToParcel(parcel, i);
        }
        List<AppsAppInstallRightDto> list2 = this.rights;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AppsAppInstallRightDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.screenName);
        List<PhotosPhotoDto> list3 = this.screenshots;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((PhotosPhotoDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.section);
        parcel.writeString(this.externalBrowserUrl);
        parcel.writeString(this.badge);
        parcel.writeStringList(this.preloadAdTypes);
        Boolean bool2 = this.isWidescreen;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.transliterationName);
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = this.friendsUseApp;
        if (exploreWidgetsUserStackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsUserStackDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isVkPayDisabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto = this.notificationBadgeType;
        if (appsAppNotificationBadgeTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppNotificationBadgeTypeDto.writeToParcel(parcel, i);
        }
        SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
        if (superAppBadgeInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppBadgeInfoDto.writeToParcel(parcel, i);
        }
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto2 = this.communitiesInstalledApp;
        if (exploreWidgetsUserStackDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsUserStackDto2.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.communityCatalogTags);
        Boolean bool4 = this.isLayerRestricted;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isOnlyDgRunnableOnWeb;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isMiniAppFlow;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.isVkpayApp;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.isIframeMode;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        parcel.writeStringList(this.availableMethods);
        parcel.writeStringList(this.sdkMethods);
        parcel.writeString(this.supportUrl);
        Integer num6 = this.myTrackerTimespentCounterId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeString(this.appUrl);
        Boolean bool9 = this.mainScreenFeatureDisabled;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        parcel.writeString(this.favicon);
        Boolean bool10 = this.isNeedToShowLaunchScreen;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        parcel.writeStringList(this.downloadableGameAvailablePlatforms);
        AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto = this.launchScreenActionButton;
        if (appsLaunchScreenActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsLaunchScreenActionButtonDto.writeToParcel(parcel, i);
        }
        AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto = this.launchScreenActionPlaceholder;
        if (appsLaunchScreenActionPlaceholderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsLaunchScreenActionPlaceholderDto.writeToParcel(parcel, i);
        }
        AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto = this.launchScreenAppUsers;
        if (appsLaunchScreenAppUsersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsLaunchScreenAppUsersDto.writeToParcel(parcel, i);
        }
        VideoVideoFullDto videoVideoFullDto = this.launchScreenVideo;
        if (videoVideoFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoFullDto.writeToParcel(parcel, i);
        }
        AppsAuthorGroupInfoDto appsAuthorGroupInfoDto = this.authorGroupInfo;
        if (appsAuthorGroupInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAuthorGroupInfoDto.writeToParcel(parcel, i);
        }
        AppsLegalDocumentsDto appsLegalDocumentsDto = this.legalDocuments;
        if (appsLegalDocumentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsLegalDocumentsDto.writeToParcel(parcel, i);
        }
        AppsLegalInfoDto appsLegalInfoDto = this.legalInfo;
        if (appsLegalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsLegalInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool11 = this.isNeedToShowUnverifiedScreenOnLaunch;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.isAppPotentiallyHaveSimilar;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        AppsFriendsStackDto appsFriendsStackDto = this.friendsStack;
        if (appsFriendsStackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsFriendsStackDto.writeToParcel(parcel, i);
        }
        Boolean bool13 = this.needShowPersonalDiscountAlert;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Boolean bool14 = this.isAvailableUserActions;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.hashAsParam;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.hashAsParamLegacy;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.withoutHeader;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.withoutFooter;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        Boolean bool19 = this.isCanQuit;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        parcel.writeString(this.manageLink);
        Boolean bool20 = this.miniAppsWebCallApiFormData;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        Integer num7 = this.supportedStyle;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Integer num8 = this.authorOwnerId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Boolean bool21 = this.canCache;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        Boolean bool22 = this.areNotificationsEnabled;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        Boolean bool23 = this.isInstallScreen;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        Boolean bool24 = this.isFavorite;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool24);
        }
        Boolean bool25 = this.isRecommended;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool25);
        }
        Boolean bool26 = this.isInstalled;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool26);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.installScreenUrl);
        BaseBoolIntDto baseBoolIntDto3 = this.hideTabbar;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto = this.placeholderInfo;
        if (appsAppPlaceholderInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppPlaceholderInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.preloadUrl);
        parcel.writeString(this.icon139);
        parcel.writeString(this.icon150);
        parcel.writeString(this.icon278);
        parcel.writeString(this.icon576);
        parcel.writeString(this.backgroundLoaderColor);
        parcel.writeString(this.loaderIcon);
        AppsSplashScreenDto appsSplashScreenDto = this.splashScreen;
        if (appsSplashScreenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsSplashScreenDto.writeToParcel(parcel, i);
        }
        Boolean bool27 = this.isSplashScreenEnabled;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool27);
        }
        parcel.writeString(this.icon75);
        Boolean bool28 = this.openInExternalBrowser;
        if (bool28 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool28);
        }
        Boolean bool29 = this.needPolicyConfirmation;
        if (bool29 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool29);
        }
        Boolean bool30 = this.isVkuiInternal;
        if (bool30 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool30);
        }
        Boolean bool31 = this.hasVkConnect;
        if (bool31 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool31);
        }
        Boolean bool32 = this.needShowBottomMenuTooltipOnClose;
        if (bool32 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool32);
        }
        parcel.writeString(this.shortDescription);
        parcel.writeString(this.slogan);
        Integer num9 = this.lastUpdate;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Boolean bool33 = this.isDebug;
        if (bool33 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool33);
        }
        parcel.writeString(this.archiveTestUrl);
        Integer num10 = this.testOdrRuntime;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        AppsAppAdConfigDto appsAppAdConfigDto = this.adConfig;
        if (appsAppAdConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppAdConfigDto.writeToParcel(parcel, i);
        }
        Boolean bool34 = this.isPaymentsAllowed;
        if (bool34 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool34);
        }
        Boolean bool35 = this.profileButtonAvailable;
        if (bool35 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool35);
        }
        Boolean bool36 = this.isButtonAddedToProfile;
        if (bool36 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool36);
        }
        Boolean bool37 = this.isBadgeAllowed;
        if (bool37 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool37);
        }
        Integer num11 = this.appStatus;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        Integer num12 = this.screenOrientation;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Integer num13 = this.mobileControlsType;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        Integer num14 = this.mobileViewSupportType;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        Boolean bool38 = this.isImActionsSupported;
        if (bool38 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool38);
        }
        Boolean bool39 = this.needShowUnverifiedScreen;
        if (bool39 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool39);
        }
        Boolean bool40 = this.isCallsAvailable;
        if (bool40 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool40);
        }
        Boolean bool41 = this.isPlugin;
        if (bool41 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool41);
        }
        Boolean bool42 = this.isTrusted;
        if (bool42 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool42);
        }
    }

    public final Boolean x1() {
        return this.isFavorite;
    }

    public final Boolean y0() {
        return this.needShowBottomMenuTooltipOnClose;
    }

    public final Boolean y1() {
        return this.isImActionsSupported;
    }

    public final Boolean z1() {
        return this.isInstallScreen;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AppsAppDto(AppsAppTypeDto appsAppTypeDto, int i, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, AppsCatalogBannerDto appsCatalogBannerDto, List list, Integer num, String str6, String str7, Integer num2, AppsAppIframeSettingsDto appsAppIframeSettingsDto, Boolean bool, Integer num3, String str8, AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto, Integer num4, String str9, Integer num5, VideoVideoDto videoVideoDto, List list2, String str10, List list3, String str11, String str12, String str13, List list4, Boolean bool2, String str14, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto, Boolean bool3, AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto, SuperAppBadgeInfoDto superAppBadgeInfoDto, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto2, List list5, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, List list6, List list7, String str15, Integer num6, String str16, Boolean bool9, String str17, Boolean bool10, List list8, AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto, AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto, AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto, VideoVideoFullDto videoVideoFullDto, AppsAuthorGroupInfoDto appsAuthorGroupInfoDto, AppsLegalDocumentsDto appsLegalDocumentsDto, AppsLegalInfoDto appsLegalInfoDto, Boolean bool11, Boolean bool12, AppsFriendsStackDto appsFriendsStackDto, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, String str18, Boolean bool20, Integer num7, Integer num8, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, String str19, String str20, String str21, String str22, BaseBoolIntDto baseBoolIntDto3, AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto, String str23, String str24, String str25, String str26, String str27, String str28, String str29, AppsSplashScreenDto appsSplashScreenDto, Boolean bool27, String str30, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, String str31, String str32, Integer num9, Boolean bool33, String str33, Integer num10, AppsAppAdConfigDto appsAppAdConfigDto, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, int i2, int i3, int i4, int i5, zcl zclVar) {
        this(appsAppTypeDto, i, str, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r5, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r99, r41, r42, r43, r44, r45, r46, r47, r100, r101, r102, r103, r104, r105, r106, r0, (i3 & 32768) != 0 ? null : num6, (i3 & 65536) != 0 ? null : str16, (i3 & 131072) != 0 ? null : bool9, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str17, (i3 & 524288) != 0 ? null : bool10, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list8, (i3 & 2097152) != 0 ? null : appsLaunchScreenActionButtonDto, (i3 & 4194304) != 0 ? null : appsLaunchScreenActionPlaceholderDto, (i3 & 8388608) != 0 ? null : appsLaunchScreenAppUsersDto, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : videoVideoFullDto, (i3 & 33554432) != 0 ? null : appsAuthorGroupInfoDto, (i3 & 67108864) != 0 ? null : appsLegalDocumentsDto, (i3 & 134217728) != 0 ? null : appsLegalInfoDto, (i3 & 268435456) != 0 ? null : bool11, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool12, (i3 & 1073741824) != 0 ? null : appsFriendsStackDto, (i3 & Integer.MIN_VALUE) != 0 ? null : bool13, (i4 & 1) != 0 ? null : bool14, (i4 & 2) != 0 ? null : bool15, (i4 & 4) != 0 ? null : bool16, (i4 & 8) != 0 ? null : bool17, (i4 & 16) != 0 ? null : bool18, (i4 & 32) != 0 ? null : bool19, (i4 & 64) != 0 ? null : str18, (i4 & 128) != 0 ? null : bool20, (i4 & 256) != 0 ? null : num7, (i4 & 512) != 0 ? null : num8, (i4 & 1024) != 0 ? null : bool21, (i4 & 2048) != 0 ? null : bool22, (i4 & 4096) != 0 ? null : bool23, (i4 & 8192) != 0 ? null : bool24, (i4 & 16384) != 0 ? null : bool25, (i4 & 32768) != 0 ? null : bool26, (i4 & 65536) != 0 ? null : str19, (i4 & 131072) != 0 ? null : str20, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str21, (i4 & 524288) != 0 ? null : str22, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto3, (i4 & 2097152) != 0 ? null : appsAppPlaceholderInfoDto, (i4 & 4194304) != 0 ? null : str23, (i4 & 8388608) != 0 ? null : str24, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str25, (i4 & 33554432) != 0 ? null : str26, (i4 & 67108864) != 0 ? null : str27, (i4 & 134217728) != 0 ? null : str28, (i4 & 268435456) != 0 ? null : str29, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : appsSplashScreenDto, (i4 & 1073741824) != 0 ? null : bool27, (i4 & Integer.MIN_VALUE) != 0 ? null : str30, (i5 & 1) != 0 ? null : bool28, (i5 & 2) != 0 ? null : bool29, (i5 & 4) != 0 ? null : bool30, (i5 & 8) != 0 ? null : bool31, (i5 & 16) != 0 ? null : bool32, (i5 & 32) != 0 ? null : str31, (i5 & 64) != 0 ? null : str32, (i5 & 128) != 0 ? null : num9, (i5 & 256) != 0 ? null : bool33, (i5 & 512) != 0 ? null : str33, (i5 & 1024) != 0 ? null : num10, (i5 & 2048) != 0 ? null : appsAppAdConfigDto, (i5 & 4096) != 0 ? null : bool34, (i5 & 8192) != 0 ? null : bool35, (i5 & 16384) != 0 ? null : bool36, (i5 & 32768) != 0 ? null : bool37, (i5 & 65536) != 0 ? null : num11, (i5 & 131072) != 0 ? null : num12, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num13, (i5 & 524288) != 0 ? null : num14, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool38, (i5 & 2097152) != 0 ? null : bool39, (i5 & 4194304) != 0 ? null : bool40, (i5 & 8388608) != 0 ? null : bool41, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool42);
        String str34 = (i2 & 8) != 0 ? null : str2;
        String str35 = (i2 & 16) != 0 ? null : str3;
        String str36 = (i2 & 32) != 0 ? null : str4;
        String str37 = (i2 & 64) != 0 ? null : str5;
        BaseBoolIntDto baseBoolIntDto4 = (i2 & 128) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto5 = (i2 & 256) != 0 ? null : baseBoolIntDto2;
        AppsCatalogBannerDto appsCatalogBannerDto2 = (i2 & 512) != 0 ? null : appsCatalogBannerDto;
        List list9 = (i2 & 1024) != 0 ? null : list;
        Integer num15 = (i2 & 2048) != 0 ? null : num;
        String str38 = (i2 & 4096) != 0 ? null : str6;
        String str39 = (i2 & 8192) != 0 ? null : str7;
        Integer num16 = (i2 & 16384) != 0 ? null : num2;
        AppsAppIframeSettingsDto appsAppIframeSettingsDto2 = (i2 & 32768) != 0 ? null : appsAppIframeSettingsDto;
        Boolean bool43 = (i2 & 65536) != 0 ? null : bool;
        Integer num17 = (i2 & 131072) != 0 ? null : num3;
        String str40 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str8;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto2 = (i2 & 524288) != 0 ? null : appsAppLeaderboardTypeDto;
        Integer num18 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num4;
        String str41 = (i2 & 2097152) != 0 ? null : str9;
        Integer num19 = (i2 & 4194304) != 0 ? null : num5;
        VideoVideoDto videoVideoDto2 = (i2 & 8388608) != 0 ? null : videoVideoDto;
        List list10 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list2;
        String str42 = (i2 & 33554432) != 0 ? null : str10;
        List list11 = (i2 & 67108864) != 0 ? null : list3;
        String str43 = (i2 & 134217728) != 0 ? null : str11;
        String str44 = (i2 & 268435456) != 0 ? null : str12;
        String str45 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str13;
        List list12 = (i2 & 1073741824) != 0 ? null : list4;
        Boolean bool44 = (i2 & Integer.MIN_VALUE) != 0 ? null : bool2;
        String str46 = (i3 & 1) != 0 ? null : str14;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto3 = (i3 & 2) != 0 ? null : exploreWidgetsUserStackDto;
        Boolean bool45 = (i3 & 4) != 0 ? null : bool3;
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto2 = (i3 & 8) != 0 ? null : appsAppNotificationBadgeTypeDto;
        SuperAppBadgeInfoDto superAppBadgeInfoDto2 = (i3 & 16) != 0 ? null : superAppBadgeInfoDto;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto4 = (i3 & 32) != 0 ? null : exploreWidgetsUserStackDto2;
        List list13 = (i3 & 64) != 0 ? null : list5;
        Boolean bool46 = bool44;
        Boolean bool47 = (i3 & 128) != 0 ? null : bool4;
        Boolean bool48 = (i3 & 256) != 0 ? null : bool5;
        Boolean bool49 = (i3 & 512) != 0 ? null : bool6;
        Boolean bool50 = (i3 & 1024) != 0 ? null : bool7;
        Boolean bool51 = (i3 & 2048) != 0 ? null : bool8;
        List list14 = (i3 & 4096) != 0 ? null : list6;
        List list15 = (i3 & 8192) != 0 ? null : list7;
        String str47 = (i3 & 16384) != 0 ? null : str15;
    }
}
