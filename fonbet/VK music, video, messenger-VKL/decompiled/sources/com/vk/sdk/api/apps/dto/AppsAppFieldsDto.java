package com.vk.sdk.api.apps.dto;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAppFieldsDto.kt */
/* loaded from: classes5.dex */
public final class AppsAppFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAppFieldsDto[] $VALUES;

    @pmi0("ads_slots")
    public static final AppsAppFieldsDto ADS_SLOTS;

    @pmi0("ad_config")
    public static final AppsAppFieldsDto AD_CONFIG;

    @pmi0("app_status")
    public static final AppsAppFieldsDto APP_STATUS;

    @pmi0("archive_test_url")
    public static final AppsAppFieldsDto ARCHIVE_TEST_URL;

    @pmi0("are_notifications_enabled")
    public static final AppsAppFieldsDto ARE_NOTIFICATIONS_ENABLED;

    @pmi0("author_group")
    public static final AppsAppFieldsDto AUTHOR_GROUP;

    @pmi0("author_id")
    public static final AppsAppFieldsDto AUTHOR_ID;

    @pmi0("author_owner_id")
    public static final AppsAppFieldsDto AUTHOR_OWNER_ID;

    @pmi0("author_url")
    public static final AppsAppFieldsDto AUTHOR_URL;

    @pmi0("background_loader_color")
    public static final AppsAppFieldsDto BACKGROUND_LOADER_COLOR;

    @pmi0("badge")
    public static final AppsAppFieldsDto BADGE;

    @pmi0("badge_info")
    public static final AppsAppFieldsDto BADGE_INFO;

    @pmi0("banner_1120")
    public static final AppsAppFieldsDto BANNER_1120;

    @pmi0("banner_186")
    public static final AppsAppFieldsDto BANNER_186;

    @pmi0("banner_560")
    public static final AppsAppFieldsDto BANNER_560;

    @pmi0("banner_896")
    public static final AppsAppFieldsDto BANNER_896;

    @pmi0("can_cache")
    public static final AppsAppFieldsDto CAN_CACHE;

    @pmi0("catalog_banner")
    public static final AppsAppFieldsDto CATALOG_BANNER;

    @pmi0("catalog_position")
    public static final AppsAppFieldsDto CATALOG_POSITION;

    @pmi0("description")
    public static final AppsAppFieldsDto DESCRIPTION;

    @pmi0("external_browser_url")
    public static final AppsAppFieldsDto EXTERNAL_BROWSER_URL;

    @pmi0("friends")
    public static final AppsAppFieldsDto FRIENDS;

    @pmi0("friends_use_app")
    public static final AppsAppFieldsDto FRIENDS_USE_APP;

    @pmi0("genre")
    public static final AppsAppFieldsDto GENRE;

    @pmi0("genre_id")
    public static final AppsAppFieldsDto GENRE_ID;

    @pmi0("has_vk_connect")
    public static final AppsAppFieldsDto HAS_VK_CONNECT;

    @pmi0("hide_tabbar")
    public static final AppsAppFieldsDto HIDE_TABBAR;

    @pmi0("icon_100")
    public static final AppsAppFieldsDto ICON_100;

    @pmi0("icon_128")
    public static final AppsAppFieldsDto ICON_128;

    @pmi0("icon_139")
    public static final AppsAppFieldsDto ICON_139;

    @pmi0("icon_150")
    public static final AppsAppFieldsDto ICON_150;

    @pmi0("icon_16")
    public static final AppsAppFieldsDto ICON_16;

    @pmi0("icon_200")
    public static final AppsAppFieldsDto ICON_200;

    @pmi0("icon_25")
    public static final AppsAppFieldsDto ICON_25;

    @pmi0("icon_256")
    public static final AppsAppFieldsDto ICON_256;

    @pmi0("icon_278")
    public static final AppsAppFieldsDto ICON_278;

    @pmi0("icon_50")
    public static final AppsAppFieldsDto ICON_50;

    @pmi0("icon_576")
    public static final AppsAppFieldsDto ICON_576;

    @pmi0("icon_75")
    public static final AppsAppFieldsDto ICON_75;

    @pmi0("id")
    public static final AppsAppFieldsDto ID;

    @pmi0("iframe_settings")
    public static final AppsAppFieldsDto IFRAME_SETTINGS;

    @pmi0("installed")
    public static final AppsAppFieldsDto INSTALLED;

    @pmi0("install_screen_url")
    public static final AppsAppFieldsDto INSTALL_SCREEN_URL;

    @pmi0("install_url")
    public static final AppsAppFieldsDto INSTALL_URL;

    @pmi0("international")
    public static final AppsAppFieldsDto INTERNATIONAL;

    @pmi0("is_badge_allowed")
    public static final AppsAppFieldsDto IS_BADGE_ALLOWED;

    @pmi0("is_button_added_to_profile")
    public static final AppsAppFieldsDto IS_BUTTON_ADDED_TO_PROFILE;

    @pmi0("is_debug")
    public static final AppsAppFieldsDto IS_DEBUG;

    @pmi0("is_favorite")
    public static final AppsAppFieldsDto IS_FAVORITE;

    @pmi0("is_html5_app")
    public static final AppsAppFieldsDto IS_HTML5_APP;

    @pmi0("is_installed")
    public static final AppsAppFieldsDto IS_INSTALLED;

    @pmi0("is_install_screen")
    public static final AppsAppFieldsDto IS_INSTALL_SCREEN;

    @pmi0("is_in_catalog")
    public static final AppsAppFieldsDto IS_IN_CATALOG;

    @pmi0("is_new")
    public static final AppsAppFieldsDto IS_NEW;

    @pmi0("is_payments_allowed")
    public static final AppsAppFieldsDto IS_PAYMENTS_ALLOWED;

    @pmi0("is_recommended")
    public static final AppsAppFieldsDto IS_RECOMMENDED;

    @pmi0("is_vkui_internal")
    public static final AppsAppFieldsDto IS_VKUI_INTERNAL;

    @pmi0("is_vk_pay_disabled")
    public static final AppsAppFieldsDto IS_VK_PAY_DISABLED;

    @pmi0("is_widescreen")
    public static final AppsAppFieldsDto IS_WIDESCREEN;

    @pmi0("last_update")
    public static final AppsAppFieldsDto LAST_UPDATE;

    @pmi0("leaderboard_type")
    public static final AppsAppFieldsDto LEADERBOARD_TYPE;

    @pmi0("loader_icon")
    public static final AppsAppFieldsDto LOADER_ICON;

    @pmi0("members_count")
    public static final AppsAppFieldsDto MEMBERS_COUNT;

    @pmi0("mobile_controls_type")
    public static final AppsAppFieldsDto MOBILE_CONTROLS_TYPE;

    @pmi0("mobile_iframe_url")
    public static final AppsAppFieldsDto MOBILE_IFRAME_URL;

    @pmi0("mobile_view_support_type")
    public static final AppsAppFieldsDto MOBILE_VIEW_SUPPORT_TYPE;

    @pmi0("need_policy_confirmation")
    public static final AppsAppFieldsDto NEED_POLICY_CONFIRMATION;

    @pmi0("need_show_bottom_menu_tooltip_on_close")
    public static final AppsAppFieldsDto NEED_SHOW_BOTTOM_MENU_TOOLTIP_ON_CLOSE;

    @pmi0("need_show_unverified_screen")
    public static final AppsAppFieldsDto NEED_SHOW_UNVERIFIED_SCREEN;

    @pmi0("new")
    public static final AppsAppFieldsDto NEW;

    @pmi0("notification_badge_type")
    public static final AppsAppFieldsDto NOTIFICATION_BADGE_TYPE;

    @pmi0("odr_archive_date")
    public static final AppsAppFieldsDto ODR_ARCHIVE_DATE;

    @pmi0("odr_archive_version")
    public static final AppsAppFieldsDto ODR_ARCHIVE_VERSION;

    @pmi0("odr_runtime")
    public static final AppsAppFieldsDto ODR_RUNTIME;

    @pmi0("open_in_external_browser")
    public static final AppsAppFieldsDto OPEN_IN_EXTERNAL_BROWSER;

    @pmi0("placeholder_info")
    public static final AppsAppFieldsDto PLACEHOLDER_INFO;

    @pmi0("platform_id")
    public static final AppsAppFieldsDto PLATFORM_ID;

    @pmi0("preload_ad_types")
    public static final AppsAppFieldsDto PRELOAD_AD_TYPES;

    @pmi0("preload_url")
    public static final AppsAppFieldsDto PRELOAD_URL;

    @pmi0("profile_button_available")
    public static final AppsAppFieldsDto PROFILE_BUTTON_AVAILABLE;

    @pmi0("promo_video")
    public static final AppsAppFieldsDto PROMO_VIDEO;

    @pmi0("published_date")
    public static final AppsAppFieldsDto PUBLISHED_DATE;

    @pmi0("push_enabled")
    public static final AppsAppFieldsDto PUSH_ENABLED;

    @pmi0("rights")
    public static final AppsAppFieldsDto RIGHTS;

    @pmi0("screenshots")
    public static final AppsAppFieldsDto SCREENSHOTS;

    @pmi0("screen_name")
    public static final AppsAppFieldsDto SCREEN_NAME;

    @pmi0("screen_orientation")
    public static final AppsAppFieldsDto SCREEN_ORIENTATION;

    @pmi0("section")
    public static final AppsAppFieldsDto SECTION;

    @pmi0("share_url")
    public static final AppsAppFieldsDto SHARE_URL;

    @pmi0("short_description")
    public static final AppsAppFieldsDto SHORT_DESCRIPTION;

    @pmi0("splash_screen")
    public static final AppsAppFieldsDto SPLASH_SCREEN;

    @pmi0("supported_style")
    public static final AppsAppFieldsDto SUPPORTED_STYLE;

    @pmi0("title")
    public static final AppsAppFieldsDto TITLE;

    @pmi0("track_code")
    public static final AppsAppFieldsDto TRACK_CODE;

    @pmi0("transliteration_name")
    public static final AppsAppFieldsDto TRANSLITERATION_NAME;

    @pmi0("type")
    public static final AppsAppFieldsDto TYPE;

    @pmi0("webview_url")
    public static final AppsAppFieldsDto WEBVIEW_URL;
    private final String value;

    static {
        AppsAppFieldsDto appsAppFieldsDto = new AppsAppFieldsDto("AUTHOR_GROUP", 0, "author_group");
        AUTHOR_GROUP = appsAppFieldsDto;
        AppsAppFieldsDto appsAppFieldsDto2 = new AppsAppFieldsDto("AUTHOR_ID", 1, "author_id");
        AUTHOR_ID = appsAppFieldsDto2;
        AppsAppFieldsDto appsAppFieldsDto3 = new AppsAppFieldsDto("AUTHOR_URL", 2, "author_url");
        AUTHOR_URL = appsAppFieldsDto3;
        AppsAppFieldsDto appsAppFieldsDto4 = new AppsAppFieldsDto("BANNER_1120", 3, "banner_1120");
        BANNER_1120 = appsAppFieldsDto4;
        AppsAppFieldsDto appsAppFieldsDto5 = new AppsAppFieldsDto("BANNER_560", 4, "banner_560");
        BANNER_560 = appsAppFieldsDto5;
        AppsAppFieldsDto appsAppFieldsDto6 = new AppsAppFieldsDto("BANNER_186", 5, "banner_186");
        BANNER_186 = appsAppFieldsDto6;
        AppsAppFieldsDto appsAppFieldsDto7 = new AppsAppFieldsDto("BANNER_896", 6, "banner_896");
        BANNER_896 = appsAppFieldsDto7;
        AppsAppFieldsDto appsAppFieldsDto8 = new AppsAppFieldsDto("ICON_16", 7, "icon_16");
        ICON_16 = appsAppFieldsDto8;
        AppsAppFieldsDto appsAppFieldsDto9 = new AppsAppFieldsDto("ICON_25", 8, "icon_25");
        ICON_25 = appsAppFieldsDto9;
        AppsAppFieldsDto appsAppFieldsDto10 = new AppsAppFieldsDto("ICON_50", 9, "icon_50");
        ICON_50 = appsAppFieldsDto10;
        AppsAppFieldsDto appsAppFieldsDto11 = new AppsAppFieldsDto("ICON_100", 10, "icon_100");
        ICON_100 = appsAppFieldsDto11;
        AppsAppFieldsDto appsAppFieldsDto12 = new AppsAppFieldsDto("ICON_200", 11, "icon_200");
        ICON_200 = appsAppFieldsDto12;
        AppsAppFieldsDto appsAppFieldsDto13 = new AppsAppFieldsDto("ICON_128", 12, "icon_128");
        ICON_128 = appsAppFieldsDto13;
        AppsAppFieldsDto appsAppFieldsDto14 = new AppsAppFieldsDto("ICON_256", 13, "icon_256");
        ICON_256 = appsAppFieldsDto14;
        AppsAppFieldsDto appsAppFieldsDto15 = new AppsAppFieldsDto("IS_NEW", 14, "is_new");
        IS_NEW = appsAppFieldsDto15;
        AppsAppFieldsDto appsAppFieldsDto16 = new AppsAppFieldsDto("NEW", 15, "new");
        NEW = appsAppFieldsDto16;
        AppsAppFieldsDto appsAppFieldsDto17 = new AppsAppFieldsDto("IS_HTML5_APP", 16, "is_html5_app");
        IS_HTML5_APP = appsAppFieldsDto17;
        AppsAppFieldsDto appsAppFieldsDto18 = new AppsAppFieldsDto("PUSH_ENABLED", 17, "push_enabled");
        PUSH_ENABLED = appsAppFieldsDto18;
        AppsAppFieldsDto appsAppFieldsDto19 = new AppsAppFieldsDto("CATALOG_BANNER", 18, "catalog_banner");
        CATALOG_BANNER = appsAppFieldsDto19;
        AppsAppFieldsDto appsAppFieldsDto20 = new AppsAppFieldsDto(Privacy.FRIENDS, 19, "friends");
        FRIENDS = appsAppFieldsDto20;
        AppsAppFieldsDto appsAppFieldsDto21 = new AppsAppFieldsDto("CATALOG_POSITION", 20, "catalog_position");
        CATALOG_POSITION = appsAppFieldsDto21;
        AppsAppFieldsDto appsAppFieldsDto22 = new AppsAppFieldsDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 21, "description");
        DESCRIPTION = appsAppFieldsDto22;
        AppsAppFieldsDto appsAppFieldsDto23 = new AppsAppFieldsDto("GENRE", 22, "genre");
        GENRE = appsAppFieldsDto23;
        AppsAppFieldsDto appsAppFieldsDto24 = new AppsAppFieldsDto("GENRE_ID", 23, "genre_id");
        GENRE_ID = appsAppFieldsDto24;
        AppsAppFieldsDto appsAppFieldsDto25 = new AppsAppFieldsDto("IFRAME_SETTINGS", 24, "iframe_settings");
        IFRAME_SETTINGS = appsAppFieldsDto25;
        AppsAppFieldsDto appsAppFieldsDto26 = new AppsAppFieldsDto("INTERNATIONAL", 25, "international");
        INTERNATIONAL = appsAppFieldsDto26;
        AppsAppFieldsDto appsAppFieldsDto27 = new AppsAppFieldsDto("IS_IN_CATALOG", 26, "is_in_catalog");
        IS_IN_CATALOG = appsAppFieldsDto27;
        AppsAppFieldsDto appsAppFieldsDto28 = new AppsAppFieldsDto("INSTALLED", 27, "installed");
        INSTALLED = appsAppFieldsDto28;
        AppsAppFieldsDto appsAppFieldsDto29 = new AppsAppFieldsDto("INSTALL_URL", 28, "install_url");
        INSTALL_URL = appsAppFieldsDto29;
        AppsAppFieldsDto appsAppFieldsDto30 = new AppsAppFieldsDto("MOBILE_CONTROLS_TYPE", 29, "mobile_controls_type");
        MOBILE_CONTROLS_TYPE = appsAppFieldsDto30;
        AppsAppFieldsDto appsAppFieldsDto31 = new AppsAppFieldsDto("MOBILE_VIEW_SUPPORT_TYPE", 30, "mobile_view_support_type");
        MOBILE_VIEW_SUPPORT_TYPE = appsAppFieldsDto31;
        AppsAppFieldsDto appsAppFieldsDto32 = new AppsAppFieldsDto("MOBILE_IFRAME_URL", 31, "mobile_iframe_url");
        MOBILE_IFRAME_URL = appsAppFieldsDto32;
        AppsAppFieldsDto appsAppFieldsDto33 = new AppsAppFieldsDto("LEADERBOARD_TYPE", 32, "leaderboard_type");
        LEADERBOARD_TYPE = appsAppFieldsDto33;
        AppsAppFieldsDto appsAppFieldsDto34 = new AppsAppFieldsDto("MEMBERS_COUNT", 33, "members_count");
        MEMBERS_COUNT = appsAppFieldsDto34;
        AppsAppFieldsDto appsAppFieldsDto35 = new AppsAppFieldsDto("PLATFORM_ID", 34, "platform_id");
        PLATFORM_ID = appsAppFieldsDto35;
        AppsAppFieldsDto appsAppFieldsDto36 = new AppsAppFieldsDto("PUBLISHED_DATE", 35, "published_date");
        PUBLISHED_DATE = appsAppFieldsDto36;
        AppsAppFieldsDto appsAppFieldsDto37 = new AppsAppFieldsDto("PROMO_VIDEO", 36, "promo_video");
        PROMO_VIDEO = appsAppFieldsDto37;
        AppsAppFieldsDto appsAppFieldsDto38 = new AppsAppFieldsDto("RIGHTS", 37, "rights");
        RIGHTS = appsAppFieldsDto38;
        AppsAppFieldsDto appsAppFieldsDto39 = new AppsAppFieldsDto("SCREEN_NAME", 38, "screen_name");
        SCREEN_NAME = appsAppFieldsDto39;
        AppsAppFieldsDto appsAppFieldsDto40 = new AppsAppFieldsDto("SCREENSHOTS", 39, "screenshots");
        SCREENSHOTS = appsAppFieldsDto40;
        AppsAppFieldsDto appsAppFieldsDto41 = new AppsAppFieldsDto("SECTION", 40, "section");
        SECTION = appsAppFieldsDto41;
        AppsAppFieldsDto appsAppFieldsDto42 = new AppsAppFieldsDto("EXTERNAL_BROWSER_URL", 41, "external_browser_url");
        EXTERNAL_BROWSER_URL = appsAppFieldsDto42;
        AppsAppFieldsDto appsAppFieldsDto43 = new AppsAppFieldsDto("BADGE", 42, "badge");
        BADGE = appsAppFieldsDto43;
        AppsAppFieldsDto appsAppFieldsDto44 = new AppsAppFieldsDto("PRELOAD_AD_TYPES", 43, "preload_ad_types");
        PRELOAD_AD_TYPES = appsAppFieldsDto44;
        AppsAppFieldsDto appsAppFieldsDto45 = new AppsAppFieldsDto("IS_WIDESCREEN", 44, "is_widescreen");
        IS_WIDESCREEN = appsAppFieldsDto45;
        AppsAppFieldsDto appsAppFieldsDto46 = new AppsAppFieldsDto("TRANSLITERATION_NAME", 45, "transliteration_name");
        TRANSLITERATION_NAME = appsAppFieldsDto46;
        AppsAppFieldsDto appsAppFieldsDto47 = new AppsAppFieldsDto("FRIENDS_USE_APP", 46, "friends_use_app");
        FRIENDS_USE_APP = appsAppFieldsDto47;
        AppsAppFieldsDto appsAppFieldsDto48 = new AppsAppFieldsDto("IS_VK_PAY_DISABLED", 47, "is_vk_pay_disabled");
        IS_VK_PAY_DISABLED = appsAppFieldsDto48;
        AppsAppFieldsDto appsAppFieldsDto49 = new AppsAppFieldsDto("NOTIFICATION_BADGE_TYPE", 48, "notification_badge_type");
        NOTIFICATION_BADGE_TYPE = appsAppFieldsDto49;
        AppsAppFieldsDto appsAppFieldsDto50 = new AppsAppFieldsDto("BADGE_INFO", 49, "badge_info");
        BADGE_INFO = appsAppFieldsDto50;
        AppsAppFieldsDto appsAppFieldsDto51 = new AppsAppFieldsDto(CredentialProviderBaseController.TYPE_TAG, 50, "type");
        TYPE = appsAppFieldsDto51;
        AppsAppFieldsDto appsAppFieldsDto52 = new AppsAppFieldsDto("SUPPORTED_STYLE", 51, "supported_style");
        SUPPORTED_STYLE = appsAppFieldsDto52;
        AppsAppFieldsDto appsAppFieldsDto53 = new AppsAppFieldsDto("ID", 52, "id");
        ID = appsAppFieldsDto53;
        AppsAppFieldsDto appsAppFieldsDto54 = new AppsAppFieldsDto(NativeAdContent.ViewTag.AD_TITLE, 53, "title");
        TITLE = appsAppFieldsDto54;
        AppsAppFieldsDto appsAppFieldsDto55 = new AppsAppFieldsDto("AUTHOR_OWNER_ID", 54, "author_owner_id");
        AUTHOR_OWNER_ID = appsAppFieldsDto55;
        AppsAppFieldsDto appsAppFieldsDto56 = new AppsAppFieldsDto("CAN_CACHE", 55, "can_cache");
        CAN_CACHE = appsAppFieldsDto56;
        AppsAppFieldsDto appsAppFieldsDto57 = new AppsAppFieldsDto("ARE_NOTIFICATIONS_ENABLED", 56, "are_notifications_enabled");
        ARE_NOTIFICATIONS_ENABLED = appsAppFieldsDto57;
        AppsAppFieldsDto appsAppFieldsDto58 = new AppsAppFieldsDto("IS_INSTALL_SCREEN", 57, "is_install_screen");
        IS_INSTALL_SCREEN = appsAppFieldsDto58;
        AppsAppFieldsDto appsAppFieldsDto59 = new AppsAppFieldsDto("IS_FAVORITE", 58, "is_favorite");
        IS_FAVORITE = appsAppFieldsDto59;
        AppsAppFieldsDto appsAppFieldsDto60 = new AppsAppFieldsDto("IS_RECOMMENDED", 59, "is_recommended");
        IS_RECOMMENDED = appsAppFieldsDto60;
        AppsAppFieldsDto appsAppFieldsDto61 = new AppsAppFieldsDto("IS_INSTALLED", 60, "is_installed");
        IS_INSTALLED = appsAppFieldsDto61;
        AppsAppFieldsDto appsAppFieldsDto62 = new AppsAppFieldsDto("TRACK_CODE", 61, "track_code");
        TRACK_CODE = appsAppFieldsDto62;
        AppsAppFieldsDto appsAppFieldsDto63 = new AppsAppFieldsDto("SHARE_URL", 62, "share_url");
        SHARE_URL = appsAppFieldsDto63;
        AppsAppFieldsDto appsAppFieldsDto64 = new AppsAppFieldsDto("WEBVIEW_URL", 63, "webview_url");
        WEBVIEW_URL = appsAppFieldsDto64;
        AppsAppFieldsDto appsAppFieldsDto65 = new AppsAppFieldsDto("INSTALL_SCREEN_URL", 64, "install_screen_url");
        INSTALL_SCREEN_URL = appsAppFieldsDto65;
        AppsAppFieldsDto appsAppFieldsDto66 = new AppsAppFieldsDto("HIDE_TABBAR", 65, "hide_tabbar");
        HIDE_TABBAR = appsAppFieldsDto66;
        AppsAppFieldsDto appsAppFieldsDto67 = new AppsAppFieldsDto("PLACEHOLDER_INFO", 66, "placeholder_info");
        PLACEHOLDER_INFO = appsAppFieldsDto67;
        AppsAppFieldsDto appsAppFieldsDto68 = new AppsAppFieldsDto("PRELOAD_URL", 67, "preload_url");
        PRELOAD_URL = appsAppFieldsDto68;
        AppsAppFieldsDto appsAppFieldsDto69 = new AppsAppFieldsDto("ICON_139", 68, "icon_139");
        ICON_139 = appsAppFieldsDto69;
        AppsAppFieldsDto appsAppFieldsDto70 = new AppsAppFieldsDto("ICON_150", 69, "icon_150");
        ICON_150 = appsAppFieldsDto70;
        AppsAppFieldsDto appsAppFieldsDto71 = new AppsAppFieldsDto("ICON_278", 70, "icon_278");
        ICON_278 = appsAppFieldsDto71;
        AppsAppFieldsDto appsAppFieldsDto72 = new AppsAppFieldsDto("ICON_576", 71, "icon_576");
        ICON_576 = appsAppFieldsDto72;
        AppsAppFieldsDto appsAppFieldsDto73 = new AppsAppFieldsDto("BACKGROUND_LOADER_COLOR", 72, "background_loader_color");
        BACKGROUND_LOADER_COLOR = appsAppFieldsDto73;
        AppsAppFieldsDto appsAppFieldsDto74 = new AppsAppFieldsDto("LOADER_ICON", 73, "loader_icon");
        LOADER_ICON = appsAppFieldsDto74;
        AppsAppFieldsDto appsAppFieldsDto75 = new AppsAppFieldsDto("SPLASH_SCREEN", 74, "splash_screen");
        SPLASH_SCREEN = appsAppFieldsDto75;
        AppsAppFieldsDto appsAppFieldsDto76 = new AppsAppFieldsDto("ICON_75", 75, "icon_75");
        ICON_75 = appsAppFieldsDto76;
        AppsAppFieldsDto appsAppFieldsDto77 = new AppsAppFieldsDto("OPEN_IN_EXTERNAL_BROWSER", 76, "open_in_external_browser");
        OPEN_IN_EXTERNAL_BROWSER = appsAppFieldsDto77;
        AppsAppFieldsDto appsAppFieldsDto78 = new AppsAppFieldsDto("NEED_POLICY_CONFIRMATION", 77, "need_policy_confirmation");
        NEED_POLICY_CONFIRMATION = appsAppFieldsDto78;
        AppsAppFieldsDto appsAppFieldsDto79 = new AppsAppFieldsDto("IS_VKUI_INTERNAL", 78, "is_vkui_internal");
        IS_VKUI_INTERNAL = appsAppFieldsDto79;
        AppsAppFieldsDto appsAppFieldsDto80 = new AppsAppFieldsDto("HAS_VK_CONNECT", 79, "has_vk_connect");
        HAS_VK_CONNECT = appsAppFieldsDto80;
        AppsAppFieldsDto appsAppFieldsDto81 = new AppsAppFieldsDto("NEED_SHOW_BOTTOM_MENU_TOOLTIP_ON_CLOSE", 80, "need_show_bottom_menu_tooltip_on_close");
        NEED_SHOW_BOTTOM_MENU_TOOLTIP_ON_CLOSE = appsAppFieldsDto81;
        AppsAppFieldsDto appsAppFieldsDto82 = new AppsAppFieldsDto("SHORT_DESCRIPTION", 81, "short_description");
        SHORT_DESCRIPTION = appsAppFieldsDto82;
        AppsAppFieldsDto appsAppFieldsDto83 = new AppsAppFieldsDto("LAST_UPDATE", 82, "last_update");
        LAST_UPDATE = appsAppFieldsDto83;
        AppsAppFieldsDto appsAppFieldsDto84 = new AppsAppFieldsDto("IS_DEBUG", 83, "is_debug");
        IS_DEBUG = appsAppFieldsDto84;
        AppsAppFieldsDto appsAppFieldsDto85 = new AppsAppFieldsDto("ARCHIVE_TEST_URL", 84, "archive_test_url");
        ARCHIVE_TEST_URL = appsAppFieldsDto85;
        AppsAppFieldsDto appsAppFieldsDto86 = new AppsAppFieldsDto("ODR_ARCHIVE_VERSION", 85, "odr_archive_version");
        ODR_ARCHIVE_VERSION = appsAppFieldsDto86;
        AppsAppFieldsDto appsAppFieldsDto87 = new AppsAppFieldsDto("ODR_ARCHIVE_DATE", 86, "odr_archive_date");
        ODR_ARCHIVE_DATE = appsAppFieldsDto87;
        AppsAppFieldsDto appsAppFieldsDto88 = new AppsAppFieldsDto("ODR_RUNTIME", 87, "odr_runtime");
        ODR_RUNTIME = appsAppFieldsDto88;
        AppsAppFieldsDto appsAppFieldsDto89 = new AppsAppFieldsDto("ADS_SLOTS", 88, "ads_slots");
        ADS_SLOTS = appsAppFieldsDto89;
        AppsAppFieldsDto appsAppFieldsDto90 = new AppsAppFieldsDto("AD_CONFIG", 89, "ad_config");
        AD_CONFIG = appsAppFieldsDto90;
        AppsAppFieldsDto appsAppFieldsDto91 = new AppsAppFieldsDto("IS_PAYMENTS_ALLOWED", 90, "is_payments_allowed");
        IS_PAYMENTS_ALLOWED = appsAppFieldsDto91;
        AppsAppFieldsDto appsAppFieldsDto92 = new AppsAppFieldsDto("PROFILE_BUTTON_AVAILABLE", 91, "profile_button_available");
        PROFILE_BUTTON_AVAILABLE = appsAppFieldsDto92;
        AppsAppFieldsDto appsAppFieldsDto93 = new AppsAppFieldsDto("IS_BUTTON_ADDED_TO_PROFILE", 92, "is_button_added_to_profile");
        IS_BUTTON_ADDED_TO_PROFILE = appsAppFieldsDto93;
        AppsAppFieldsDto appsAppFieldsDto94 = new AppsAppFieldsDto("IS_BADGE_ALLOWED", 93, "is_badge_allowed");
        IS_BADGE_ALLOWED = appsAppFieldsDto94;
        AppsAppFieldsDto appsAppFieldsDto95 = new AppsAppFieldsDto("APP_STATUS", 94, "app_status");
        APP_STATUS = appsAppFieldsDto95;
        AppsAppFieldsDto appsAppFieldsDto96 = new AppsAppFieldsDto("SCREEN_ORIENTATION", 95, "screen_orientation");
        SCREEN_ORIENTATION = appsAppFieldsDto96;
        AppsAppFieldsDto appsAppFieldsDto97 = new AppsAppFieldsDto("NEED_SHOW_UNVERIFIED_SCREEN", 96, "need_show_unverified_screen");
        NEED_SHOW_UNVERIFIED_SCREEN = appsAppFieldsDto97;
        AppsAppFieldsDto[] appsAppFieldsDtoArr = {appsAppFieldsDto, appsAppFieldsDto2, appsAppFieldsDto3, appsAppFieldsDto4, appsAppFieldsDto5, appsAppFieldsDto6, appsAppFieldsDto7, appsAppFieldsDto8, appsAppFieldsDto9, appsAppFieldsDto10, appsAppFieldsDto11, appsAppFieldsDto12, appsAppFieldsDto13, appsAppFieldsDto14, appsAppFieldsDto15, appsAppFieldsDto16, appsAppFieldsDto17, appsAppFieldsDto18, appsAppFieldsDto19, appsAppFieldsDto20, appsAppFieldsDto21, appsAppFieldsDto22, appsAppFieldsDto23, appsAppFieldsDto24, appsAppFieldsDto25, appsAppFieldsDto26, appsAppFieldsDto27, appsAppFieldsDto28, appsAppFieldsDto29, appsAppFieldsDto30, appsAppFieldsDto31, appsAppFieldsDto32, appsAppFieldsDto33, appsAppFieldsDto34, appsAppFieldsDto35, appsAppFieldsDto36, appsAppFieldsDto37, appsAppFieldsDto38, appsAppFieldsDto39, appsAppFieldsDto40, appsAppFieldsDto41, appsAppFieldsDto42, appsAppFieldsDto43, appsAppFieldsDto44, appsAppFieldsDto45, appsAppFieldsDto46, appsAppFieldsDto47, appsAppFieldsDto48, appsAppFieldsDto49, appsAppFieldsDto50, appsAppFieldsDto51, appsAppFieldsDto52, appsAppFieldsDto53, appsAppFieldsDto54, appsAppFieldsDto55, appsAppFieldsDto56, appsAppFieldsDto57, appsAppFieldsDto58, appsAppFieldsDto59, appsAppFieldsDto60, appsAppFieldsDto61, appsAppFieldsDto62, appsAppFieldsDto63, appsAppFieldsDto64, appsAppFieldsDto65, appsAppFieldsDto66, appsAppFieldsDto67, appsAppFieldsDto68, appsAppFieldsDto69, appsAppFieldsDto70, appsAppFieldsDto71, appsAppFieldsDto72, appsAppFieldsDto73, appsAppFieldsDto74, appsAppFieldsDto75, appsAppFieldsDto76, appsAppFieldsDto77, appsAppFieldsDto78, appsAppFieldsDto79, appsAppFieldsDto80, appsAppFieldsDto81, appsAppFieldsDto82, appsAppFieldsDto83, appsAppFieldsDto84, appsAppFieldsDto85, appsAppFieldsDto86, appsAppFieldsDto87, appsAppFieldsDto88, appsAppFieldsDto89, appsAppFieldsDto90, appsAppFieldsDto91, appsAppFieldsDto92, appsAppFieldsDto93, appsAppFieldsDto94, appsAppFieldsDto95, appsAppFieldsDto96, appsAppFieldsDto97};
        $VALUES = appsAppFieldsDtoArr;
        $ENTRIES = new asp(appsAppFieldsDtoArr);
    }

    private AppsAppFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAppFieldsDto valueOf(String str) {
        return (AppsAppFieldsDto) Enum.valueOf(AppsAppFieldsDto.class, str);
    }

    public static AppsAppFieldsDto[] values() {
        return (AppsAppFieldsDto[]) $VALUES.clone();
    }
}
