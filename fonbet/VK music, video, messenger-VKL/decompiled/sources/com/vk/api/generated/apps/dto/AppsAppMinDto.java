package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAppMinDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppMinDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppMinDto> CREATOR = new a();

    @pmi0("ad_config")
    private final AppsAppAdConfigDto adConfig;

    @pmi0("app_status")
    private final Integer appStatus;

    @pmi0("archive_test_url")
    private final String archiveTestUrl;

    @pmi0("are_notifications_enabled")
    private final Boolean areNotificationsEnabled;

    @pmi0("author_owner_id")
    private final Integer authorOwnerId;

    @pmi0("background_loader_color")
    private final String backgroundLoaderColor;

    @pmi0("can_cache")
    private final Boolean canCache;

    @pmi0("has_vk_connect")
    private final Boolean hasVkConnect;

    @pmi0("hide_tabbar")
    private final BaseBoolIntDto hideTabbar;

    @pmi0("icon_139")
    private final String icon139;

    @pmi0("icon_150")
    private final String icon150;

    @pmi0("icon_278")
    private final String icon278;

    @pmi0("icon_576")
    private final String icon576;

    @pmi0("icon_75")
    private final String icon75;

    @pmi0("id")
    private final int id;

    @pmi0("install_screen_url")
    private final String installScreenUrl;

    @pmi0("is_badge_allowed")
    private final Boolean isBadgeAllowed;

    @pmi0("is_button_added_to_profile")
    private final Boolean isButtonAddedToProfile;

    @pmi0("is_calls_available")
    private final Boolean isCallsAvailable;

    @pmi0("is_debug")
    private final Boolean isDebug;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_im_actions_supported")
    private final Boolean isImActionsSupported;

    @pmi0("is_install_screen")
    private final Boolean isInstallScreen;

    @pmi0("is_installed")
    private final Boolean isInstalled;

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

    @pmi0("is_vkui_internal")
    private final Boolean isVkuiInternal;

    @pmi0("last_update")
    private final Integer lastUpdate;

    @pmi0("loader_icon")
    private final String loaderIcon;

    @pmi0("mobile_controls_type")
    private final Integer mobileControlsType;

    @pmi0("mobile_view_support_type")
    private final Integer mobileViewSupportType;

    @pmi0("need_policy_confirmation")
    private final Boolean needPolicyConfirmation;

    @pmi0("need_show_bottom_menu_tooltip_on_close")
    private final Boolean needShowBottomMenuTooltipOnClose;

    @pmi0("need_show_unverified_screen")
    private final Boolean needShowUnverifiedScreen;

    @pmi0("open_in_external_browser")
    private final Boolean openInExternalBrowser;

    @pmi0("placeholder_info")
    private final AppsAppPlaceholderInfoDto placeholderInfo;

    @pmi0("preload_url")
    private final String preloadUrl;

    @pmi0("profile_button_available")
    private final Boolean profileButtonAvailable;

    @pmi0("screen_orientation")
    private final Integer screenOrientation;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("slogan")
    private final String slogan;

    @pmi0("splash_screen")
    private final AppsSplashScreenDto splashScreen;

    @pmi0("supported_style")
    private final Integer supportedStyle;

    @pmi0("test_odr_runtime")
    private final Integer testOdrRuntime;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final AppsAppTypeDto type;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: AppsAppMinDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppMinDto> {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.apps.dto.AppsAppMinDto createFromParcel(android.os.Parcel r58) {
            /*
                Method dump skipped, instructions count: 966
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.apps.dto.AppsAppMinDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppMinDto[] newArray(int i) {
            return new AppsAppMinDto[i];
        }
    }

    public AppsAppMinDto(AppsAppTypeDto appsAppTypeDto, int i, String str, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AppsSplashScreenDto appsSplashScreenDto, Boolean bool7, String str13, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str14, String str15, Integer num3, Boolean bool13, String str16, Integer num4, AppsAppAdConfigDto appsAppAdConfigDto, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22) {
        this.type = appsAppTypeDto;
        this.id = i;
        this.title = str;
        this.supportedStyle = num;
        this.authorOwnerId = num2;
        this.canCache = bool;
        this.areNotificationsEnabled = bool2;
        this.isInstallScreen = bool3;
        this.isFavorite = bool4;
        this.isRecommended = bool5;
        this.isInstalled = bool6;
        this.trackCode = str2;
        this.shareUrl = str3;
        this.webviewUrl = str4;
        this.installScreenUrl = str5;
        this.hideTabbar = baseBoolIntDto;
        this.placeholderInfo = appsAppPlaceholderInfoDto;
        this.preloadUrl = str6;
        this.icon139 = str7;
        this.icon150 = str8;
        this.icon278 = str9;
        this.icon576 = str10;
        this.backgroundLoaderColor = str11;
        this.loaderIcon = str12;
        this.splashScreen = appsSplashScreenDto;
        this.isSplashScreenEnabled = bool7;
        this.icon75 = str13;
        this.openInExternalBrowser = bool8;
        this.needPolicyConfirmation = bool9;
        this.isVkuiInternal = bool10;
        this.hasVkConnect = bool11;
        this.needShowBottomMenuTooltipOnClose = bool12;
        this.shortDescription = str14;
        this.slogan = str15;
        this.lastUpdate = num3;
        this.isDebug = bool13;
        this.archiveTestUrl = str16;
        this.testOdrRuntime = num4;
        this.adConfig = appsAppAdConfigDto;
        this.isPaymentsAllowed = bool14;
        this.profileButtonAvailable = bool15;
        this.isButtonAddedToProfile = bool16;
        this.isBadgeAllowed = bool17;
        this.appStatus = num5;
        this.screenOrientation = num6;
        this.mobileControlsType = num7;
        this.mobileViewSupportType = num8;
        this.isImActionsSupported = bool18;
        this.needShowUnverifiedScreen = bool19;
        this.isCallsAvailable = bool20;
        this.isPlugin = bool21;
        this.isTrusted = bool22;
    }

    public final String B() {
        return this.icon75;
    }

    public final String C() {
        return this.loaderIcon;
    }

    public final Integer D() {
        return this.mobileControlsType;
    }

    public final Boolean D0() {
        return this.isFavorite;
    }

    public final Boolean F() {
        return this.needPolicyConfirmation;
    }

    public final Boolean F0() {
        return this.isImActionsSupported;
    }

    public final Boolean G() {
        return this.needShowBottomMenuTooltipOnClose;
    }

    public final Boolean H0() {
        return this.isInstallScreen;
    }

    public final Boolean K() {
        return this.needShowUnverifiedScreen;
    }

    public final Boolean K0() {
        return this.isInstalled;
    }

    public final AppsAppPlaceholderInfoDto M() {
        return this.placeholderInfo;
    }

    public final Boolean N0() {
        return this.isPaymentsAllowed;
    }

    public final Boolean P0() {
        return this.isRecommended;
    }

    public final Integer R() {
        return this.screenOrientation;
    }

    public final Boolean S0() {
        return this.isTrusted;
    }

    public final String T() {
        return this.shortDescription;
    }

    public final Boolean U0() {
        return this.isVkuiInternal;
    }

    public final String W() {
        return this.slogan;
    }

    public final AppsSplashScreenDto Z() {
        return this.splashScreen;
    }

    public final AppsAppTypeDto a0() {
        return this.type;
    }

    public final AppsAppAdConfigDto d() {
        return this.adConfig;
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
        if (!(obj instanceof AppsAppMinDto)) {
            return false;
        }
        AppsAppMinDto appsAppMinDto = (AppsAppMinDto) obj;
        return this.type == appsAppMinDto.type && this.id == appsAppMinDto.id && epx.f(this.title, appsAppMinDto.title) && epx.f(this.supportedStyle, appsAppMinDto.supportedStyle) && epx.f(this.authorOwnerId, appsAppMinDto.authorOwnerId) && epx.f(this.canCache, appsAppMinDto.canCache) && epx.f(this.areNotificationsEnabled, appsAppMinDto.areNotificationsEnabled) && epx.f(this.isInstallScreen, appsAppMinDto.isInstallScreen) && epx.f(this.isFavorite, appsAppMinDto.isFavorite) && epx.f(this.isRecommended, appsAppMinDto.isRecommended) && epx.f(this.isInstalled, appsAppMinDto.isInstalled) && epx.f(this.trackCode, appsAppMinDto.trackCode) && epx.f(this.shareUrl, appsAppMinDto.shareUrl) && epx.f(this.webviewUrl, appsAppMinDto.webviewUrl) && epx.f(this.installScreenUrl, appsAppMinDto.installScreenUrl) && this.hideTabbar == appsAppMinDto.hideTabbar && epx.f(this.placeholderInfo, appsAppMinDto.placeholderInfo) && epx.f(this.preloadUrl, appsAppMinDto.preloadUrl) && epx.f(this.icon139, appsAppMinDto.icon139) && epx.f(this.icon150, appsAppMinDto.icon150) && epx.f(this.icon278, appsAppMinDto.icon278) && epx.f(this.icon576, appsAppMinDto.icon576) && epx.f(this.backgroundLoaderColor, appsAppMinDto.backgroundLoaderColor) && epx.f(this.loaderIcon, appsAppMinDto.loaderIcon) && epx.f(this.splashScreen, appsAppMinDto.splashScreen) && epx.f(this.isSplashScreenEnabled, appsAppMinDto.isSplashScreenEnabled) && epx.f(this.icon75, appsAppMinDto.icon75) && epx.f(this.openInExternalBrowser, appsAppMinDto.openInExternalBrowser) && epx.f(this.needPolicyConfirmation, appsAppMinDto.needPolicyConfirmation) && epx.f(this.isVkuiInternal, appsAppMinDto.isVkuiInternal) && epx.f(this.hasVkConnect, appsAppMinDto.hasVkConnect) && epx.f(this.needShowBottomMenuTooltipOnClose, appsAppMinDto.needShowBottomMenuTooltipOnClose) && epx.f(this.shortDescription, appsAppMinDto.shortDescription) && epx.f(this.slogan, appsAppMinDto.slogan) && epx.f(this.lastUpdate, appsAppMinDto.lastUpdate) && epx.f(this.isDebug, appsAppMinDto.isDebug) && epx.f(this.archiveTestUrl, appsAppMinDto.archiveTestUrl) && epx.f(this.testOdrRuntime, appsAppMinDto.testOdrRuntime) && epx.f(this.adConfig, appsAppMinDto.adConfig) && epx.f(this.isPaymentsAllowed, appsAppMinDto.isPaymentsAllowed) && epx.f(this.profileButtonAvailable, appsAppMinDto.profileButtonAvailable) && epx.f(this.isButtonAddedToProfile, appsAppMinDto.isButtonAddedToProfile) && epx.f(this.isBadgeAllowed, appsAppMinDto.isBadgeAllowed) && epx.f(this.appStatus, appsAppMinDto.appStatus) && epx.f(this.screenOrientation, appsAppMinDto.screenOrientation) && epx.f(this.mobileControlsType, appsAppMinDto.mobileControlsType) && epx.f(this.mobileViewSupportType, appsAppMinDto.mobileViewSupportType) && epx.f(this.isImActionsSupported, appsAppMinDto.isImActionsSupported) && epx.f(this.needShowUnverifiedScreen, appsAppMinDto.needShowUnverifiedScreen) && epx.f(this.isCallsAvailable, appsAppMinDto.isCallsAvailable) && epx.f(this.isPlugin, appsAppMinDto.isPlugin) && epx.f(this.isTrusted, appsAppMinDto.isTrusted);
    }

    public final Boolean f() {
        return this.areNotificationsEnabled;
    }

    public final Integer g() {
        return this.authorOwnerId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.id, this.type.hashCode() * 31, 31), 31, this.title);
        Integer num = this.supportedStyle;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.authorOwnerId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.canCache;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.areNotificationsEnabled;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isInstallScreen;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFavorite;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isRecommended;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isInstalled;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shareUrl;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webviewUrl;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.installScreenUrl;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hideTabbar;
        int hashCode13 = (hashCode12 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto = this.placeholderInfo;
        int hashCode14 = (hashCode13 + (appsAppPlaceholderInfoDto == null ? 0 : appsAppPlaceholderInfoDto.hashCode())) * 31;
        String str5 = this.preloadUrl;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.icon139;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon150;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.icon278;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.icon576;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.backgroundLoaderColor;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.loaderIcon;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        AppsSplashScreenDto appsSplashScreenDto = this.splashScreen;
        int hashCode22 = (hashCode21 + (appsSplashScreenDto == null ? 0 : appsSplashScreenDto.hashCode())) * 31;
        Boolean bool7 = this.isSplashScreenEnabled;
        int hashCode23 = (hashCode22 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str12 = this.icon75;
        int hashCode24 = (hashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool8 = this.openInExternalBrowser;
        int hashCode25 = (hashCode24 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.needPolicyConfirmation;
        int hashCode26 = (hashCode25 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isVkuiInternal;
        int hashCode27 = (hashCode26 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.hasVkConnect;
        int hashCode28 = (hashCode27 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.needShowBottomMenuTooltipOnClose;
        int hashCode29 = (hashCode28 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str13 = this.shortDescription;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.slogan;
        int hashCode31 = (hashCode30 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num3 = this.lastUpdate;
        int hashCode32 = (hashCode31 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool13 = this.isDebug;
        int hashCode33 = (hashCode32 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str15 = this.archiveTestUrl;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num4 = this.testOdrRuntime;
        int hashCode35 = (hashCode34 + (num4 == null ? 0 : num4.hashCode())) * 31;
        AppsAppAdConfigDto appsAppAdConfigDto = this.adConfig;
        int hashCode36 = (hashCode35 + (appsAppAdConfigDto == null ? 0 : appsAppAdConfigDto.hashCode())) * 31;
        Boolean bool14 = this.isPaymentsAllowed;
        int hashCode37 = (hashCode36 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.profileButtonAvailable;
        int hashCode38 = (hashCode37 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isButtonAddedToProfile;
        int hashCode39 = (hashCode38 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.isBadgeAllowed;
        int hashCode40 = (hashCode39 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Integer num5 = this.appStatus;
        int hashCode41 = (hashCode40 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.screenOrientation;
        int hashCode42 = (hashCode41 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.mobileControlsType;
        int hashCode43 = (hashCode42 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.mobileViewSupportType;
        int hashCode44 = (hashCode43 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool18 = this.isImActionsSupported;
        int hashCode45 = (hashCode44 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.needShowUnverifiedScreen;
        int hashCode46 = (hashCode45 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.isCallsAvailable;
        int hashCode47 = (hashCode46 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.isPlugin;
        int hashCode48 = (hashCode47 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isTrusted;
        return hashCode48 + (bool22 != null ? bool22.hashCode() : 0);
    }

    public final String i() {
        return this.backgroundLoaderColor;
    }

    public final Boolean j() {
        return this.canCache;
    }

    public final Boolean k() {
        return this.hasVkConnect;
    }

    public final BaseBoolIntDto l() {
        return this.hideTabbar;
    }

    public final String l0() {
        return this.webviewUrl;
    }

    public final String n() {
        return this.icon139;
    }

    public final String o() {
        return this.icon150;
    }

    public final String p() {
        return this.icon278;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String ra() {
        return this.shareUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppMinDto(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
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

    public final String u() {
        return this.icon576;
    }

    public final Boolean v0() {
        return this.isBadgeAllowed;
    }

    public final Boolean w0() {
        return this.isCallsAvailable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        Integer num = this.supportedStyle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.authorOwnerId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.canCache;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.areNotificationsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isInstallScreen;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isFavorite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isRecommended;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isInstalled;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.installScreenUrl);
        BaseBoolIntDto baseBoolIntDto = this.hideTabbar;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
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
        Boolean bool7 = this.isSplashScreenEnabled;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.icon75);
        Boolean bool8 = this.openInExternalBrowser;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.needPolicyConfirmation;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.isVkuiInternal;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.hasVkConnect;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.needShowBottomMenuTooltipOnClose;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeString(this.shortDescription);
        parcel.writeString(this.slogan);
        Integer num3 = this.lastUpdate;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool13 = this.isDebug;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        parcel.writeString(this.archiveTestUrl);
        Integer num4 = this.testOdrRuntime;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        AppsAppAdConfigDto appsAppAdConfigDto = this.adConfig;
        if (appsAppAdConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppAdConfigDto.writeToParcel(parcel, i);
        }
        Boolean bool14 = this.isPaymentsAllowed;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.profileButtonAvailable;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.isButtonAddedToProfile;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.isBadgeAllowed;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Integer num5 = this.appStatus;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.screenOrientation;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.mobileControlsType;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Integer num8 = this.mobileViewSupportType;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Boolean bool18 = this.isImActionsSupported;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        Boolean bool19 = this.needShowUnverifiedScreen;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        Boolean bool20 = this.isCallsAvailable;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        Boolean bool21 = this.isPlugin;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        Boolean bool22 = this.isTrusted;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
    }

    public final Boolean y0() {
        return this.isDebug;
    }

    public /* synthetic */ AppsAppMinDto(AppsAppTypeDto appsAppTypeDto, int i, String str, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AppsSplashScreenDto appsSplashScreenDto, Boolean bool7, String str13, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str14, String str15, Integer num3, Boolean bool13, String str16, Integer num4, AppsAppAdConfigDto appsAppAdConfigDto, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, int i2, int i3, zcl zclVar) {
        this(appsAppTypeDto, i, str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : bool4, (i2 & 512) != 0 ? null : bool5, (i2 & 1024) != 0 ? null : bool6, (i2 & 2048) != 0 ? null : str2, (i2 & 4096) != 0 ? null : str3, (i2 & 8192) != 0 ? null : str4, (i2 & 16384) != 0 ? null : str5, (i2 & 32768) != 0 ? null : baseBoolIntDto, (i2 & 65536) != 0 ? null : appsAppPlaceholderInfoDto, (i2 & 131072) != 0 ? null : str6, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str7, (i2 & 524288) != 0 ? null : str8, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9, (i2 & 2097152) != 0 ? null : str10, (i2 & 4194304) != 0 ? null : str11, (i2 & 8388608) != 0 ? null : str12, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : appsSplashScreenDto, (i2 & 33554432) != 0 ? null : bool7, (i2 & 67108864) != 0 ? null : str13, (i2 & 134217728) != 0 ? null : bool8, (i2 & 268435456) != 0 ? null : bool9, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool10, (i2 & 1073741824) != 0 ? null : bool11, (i2 & Integer.MIN_VALUE) != 0 ? null : bool12, (i3 & 1) != 0 ? null : str14, (i3 & 2) != 0 ? null : str15, (i3 & 4) != 0 ? null : num3, (i3 & 8) != 0 ? null : bool13, (i3 & 16) != 0 ? null : str16, (i3 & 32) != 0 ? null : num4, (i3 & 64) != 0 ? null : appsAppAdConfigDto, (i3 & 128) != 0 ? null : bool14, (i3 & 256) != 0 ? null : bool15, (i3 & 512) != 0 ? null : bool16, (i3 & 1024) != 0 ? null : bool17, (i3 & 2048) != 0 ? null : num5, (i3 & 4096) != 0 ? null : num6, (i3 & 8192) != 0 ? null : num7, (i3 & 16384) != 0 ? null : num8, (i3 & 32768) != 0 ? null : bool18, (i3 & 65536) != 0 ? null : bool19, (i3 & 131072) != 0 ? null : bool20, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool21, (i3 & 524288) != 0 ? null : bool22);
    }
}
