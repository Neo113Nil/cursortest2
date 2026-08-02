package com.vk.external.miniapp.net.app;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppFields.kt */
/* loaded from: classes18.dex */
public final class AppFields {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppFields[] $VALUES;
    public static final AppFields ADS_SLOTS;
    public static final AppFields AD_CONFIG;
    public static final AppFields AUTHOR_OWNER_ID;
    public static final AppFields BACKGROUND_LOADER_COLOR;
    public static final AppFields CAN_CACHE;
    public static final AppFields DESCRIPTION;
    public static final AppFields FRIENDS_USE_APP;
    public static final AppFields GENRE;
    public static final AppFields HAS_VK_CONNECT;
    public static final AppFields HIDE_TABBAR;
    public static final AppFields ICON_139;
    public static final AppFields ICON_150;
    public static final AppFields ICON_278;
    public static final AppFields ICON_576;
    public static final AppFields ICON_75;
    public static final AppFields ID;
    public static final AppFields IS_IM_ACTIONS_SUPPORTED;
    public static final AppFields IS_INSTALLED;
    public static final AppFields IS_INSTALL_SCREEN;
    public static final AppFields IS_IN_CATALOG;
    public static final AppFields IS_NEED_TO_SHOW_LAUNCH_SCREEN;
    public static final AppFields IS_VKUI_INTERNAL;
    public static final AppFields LEGAL_INFO;
    public static final AppFields MEMBERS_COUNT;
    public static final AppFields MOBILE_CONTROLS_TYPE;
    public static final AppFields NEED_SHOW_UNVERIFIED_SCREEN;
    public static final AppFields PLACEHOLDER_INFO;
    public static final AppFields PRELOAD_AD_TYPES;
    public static final AppFields RIGHTS;
    public static final AppFields SCREENSHOTS;
    public static final AppFields SCREEN_ORIENTATION;
    public static final AppFields SHORT_DESCRIPTION;
    public static final AppFields SPLASH_SCREEN;
    public static final AppFields TITLE;
    public static final AppFields TRACK_CODE;
    public static final AppFields TYPE;
    public static final AppFields WEBVIEW_URL;
    private final String value;

    static {
        AppFields appFields = new AppFields("IS_IM_ACTIONS_SUPPORTED", 0, "is_im_actions_supported");
        IS_IM_ACTIONS_SUPPORTED = appFields;
        AppFields appFields2 = new AppFields("ID", 1, "id");
        ID = appFields2;
        AppFields appFields3 = new AppFields(NativeAdContent.ViewTag.AD_TITLE, 2, "title");
        TITLE = appFields3;
        AppFields appFields4 = new AppFields("CAN_CACHE", 3, "can_cache");
        CAN_CACHE = appFields4;
        AppFields appFields5 = new AppFields("IS_VKUI_INTERNAL", 4, "is_vkui_internal");
        IS_VKUI_INTERNAL = appFields5;
        AppFields appFields6 = new AppFields(CredentialProviderBaseController.TYPE_TAG, 5, "type");
        TYPE = appFields6;
        AppFields appFields7 = new AppFields("SCREEN_ORIENTATION", 6, "screen_orientation");
        SCREEN_ORIENTATION = appFields7;
        AppFields appFields8 = new AppFields("MOBILE_CONTROLS_TYPE", 7, "mobile_controls_type");
        MOBILE_CONTROLS_TYPE = appFields8;
        AppFields appFields9 = new AppFields("SPLASH_SCREEN", 8, "splash_screen");
        SPLASH_SCREEN = appFields9;
        AppFields appFields10 = new AppFields("BACKGROUND_LOADER_COLOR", 9, "background_loader_color");
        BACKGROUND_LOADER_COLOR = appFields10;
        AppFields appFields11 = new AppFields("PLACEHOLDER_INFO", 10, "placeholder_info");
        PLACEHOLDER_INFO = appFields11;
        AppFields appFields12 = new AppFields("ADS_SLOTS", 11, "ads_slots");
        ADS_SLOTS = appFields12;
        AppFields appFields13 = new AppFields("HIDE_TABBAR", 12, "hide_tabbar");
        HIDE_TABBAR = appFields13;
        AppFields appFields14 = new AppFields("TRACK_CODE", 13, "track_code");
        TRACK_CODE = appFields14;
        AppFields appFields15 = new AppFields("AUTHOR_OWNER_ID", 14, "author_owner_id");
        AUTHOR_OWNER_ID = appFields15;
        AppFields appFields16 = new AppFields("ICON_75", 15, "icon_75");
        ICON_75 = appFields16;
        AppFields appFields17 = new AppFields("ICON_139", 16, "icon_139");
        ICON_139 = appFields17;
        AppFields appFields18 = new AppFields("ICON_150", 17, "icon_150");
        ICON_150 = appFields18;
        AppFields appFields19 = new AppFields("ICON_278", 18, "icon_278");
        ICON_278 = appFields19;
        AppFields appFields20 = new AppFields("ICON_576", 19, "icon_576");
        ICON_576 = appFields20;
        AppFields appFields21 = new AppFields("WEBVIEW_URL", 20, "webview_url");
        WEBVIEW_URL = appFields21;
        AppFields appFields22 = new AppFields("IS_IN_CATALOG", 21, "is_in_catalog");
        IS_IN_CATALOG = appFields22;
        AppFields appFields23 = new AppFields("PRELOAD_AD_TYPES", 22, "preload_ad_types");
        PRELOAD_AD_TYPES = appFields23;
        AppFields appFields24 = new AppFields("HAS_VK_CONNECT", 23, "has_vk_connect");
        HAS_VK_CONNECT = appFields24;
        AppFields appFields25 = new AppFields("AD_CONFIG", 24, "ad_config");
        AD_CONFIG = appFields25;
        AppFields appFields26 = new AppFields("SHORT_DESCRIPTION", 25, "short_description");
        SHORT_DESCRIPTION = appFields26;
        AppFields appFields27 = new AppFields("NEED_SHOW_UNVERIFIED_SCREEN", 26, "need_show_unverified_screen");
        NEED_SHOW_UNVERIFIED_SCREEN = appFields27;
        AppFields appFields28 = new AppFields("LEGAL_INFO", 27, "legal_info");
        LEGAL_INFO = appFields28;
        AppFields appFields29 = new AppFields("GENRE", 28, "genre");
        GENRE = appFields29;
        AppFields appFields30 = new AppFields("SCREENSHOTS", 29, "screenshots");
        SCREENSHOTS = appFields30;
        AppFields appFields31 = new AppFields(NativeAdContent.ViewTag.AD_DESCRIPTION, 30, "description");
        DESCRIPTION = appFields31;
        AppFields appFields32 = new AppFields("RIGHTS", 31, "rights");
        RIGHTS = appFields32;
        AppFields appFields33 = new AppFields("FRIENDS_USE_APP", 32, "friends_use_app");
        FRIENDS_USE_APP = appFields33;
        AppFields appFields34 = new AppFields("MEMBERS_COUNT", 33, "members_count");
        MEMBERS_COUNT = appFields34;
        AppFields appFields35 = new AppFields("IS_NEED_TO_SHOW_LAUNCH_SCREEN", 34, "is_need_to_show_launch_screen");
        IS_NEED_TO_SHOW_LAUNCH_SCREEN = appFields35;
        AppFields appFields36 = new AppFields("IS_INSTALLED", 35, "is_installed");
        IS_INSTALLED = appFields36;
        AppFields appFields37 = new AppFields("IS_INSTALL_SCREEN", 36, "is_install_screen");
        IS_INSTALL_SCREEN = appFields37;
        AppFields[] appFieldsArr = {appFields, appFields2, appFields3, appFields4, appFields5, appFields6, appFields7, appFields8, appFields9, appFields10, appFields11, appFields12, appFields13, appFields14, appFields15, appFields16, appFields17, appFields18, appFields19, appFields20, appFields21, appFields22, appFields23, appFields24, appFields25, appFields26, appFields27, appFields28, appFields29, appFields30, appFields31, appFields32, appFields33, appFields34, appFields35, appFields36, appFields37};
        $VALUES = appFieldsArr;
        $ENTRIES = new asp(appFieldsArr);
    }

    public AppFields(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppFields valueOf(String str) {
        return (AppFields) Enum.valueOf(AppFields.class, str);
    }

    public static AppFields[] values() {
        return (AppFields[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
