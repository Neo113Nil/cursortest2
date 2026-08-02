package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SaFeatures.kt */
/* loaded from: classes11.dex */
public final class SaFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SaFeatures[] $VALUES;
    public static final SaFeatures FEATURE_SA_HEALTH_TO_SDK;
    public static final SaFeatures MULTI_INTERSTITIAL;
    public static final SaFeatures SA_APPS_REQUESTS_ALIASES;
    public static final SaFeatures SA_APP_VIEW_PART_RECS;
    public static final SaFeatures SA_CLEAR_CACHE_ON_SWITCH_ACCOUNT;
    public static final SaFeatures SA_DATING_IN_APP_REVIEW;
    public static final SaFeatures SA_FIX_BLINKING_AFTER_EXIT_APP;
    public static final SaFeatures SA_FIX_HANDLE_GAME_URL;
    public static final SaFeatures SA_FIX_KEEP_SCREEN_BRIDGE;
    public static final SaFeatures SA_GAMES_ACHIEVEMENTS_BLOCK;
    public static final SaFeatures SA_GAMES_CATALOG_PERFORMANCE;
    public static final SaFeatures SA_GAMES_FRIENDLY_URL_DEEPLINK;
    public static final SaFeatures SA_GAMES_GET_CATALOG;
    public static final SaFeatures SA_GAMES_NATIVE_INSTALL_SCREEN;
    public static final SaFeatures SA_GAMES_NEW_DISCOUNT;
    public static final SaFeatures SA_GAMES_WAIT_PREV_REQUEST;
    public static final SaFeatures SA_HANDLE_CAPTCHA_NATIVE;
    public static final SaFeatures SA_HUAWEI_BROWSER;
    public static final SaFeatures SA_MINI_APPS_ADS_ALIASES;
    public static final SaFeatures SA_MINI_APPS_CATALOG_ALIAS;
    public static final SaFeatures SA_REMOVE_HEALTH_COMMAND_INITIALIZATION;
    public static final SaFeatures SA_STORE_INSTALLER_INFO_V2;
    public static final SaFeatures SA_VALIDATE_IF_PERSONAL_ACCOUNT;
    public static final SaFeatures SHOW_HEADER_ON_RESUME;
    public static final SaFeatures STICKY_BANNER_NATIVE_AD;
    private final String key;

    static {
        SaFeatures saFeatures = new SaFeatures("SA_DATING_IN_APP_REVIEW", 0, "sa_dating_in_app_review");
        SA_DATING_IN_APP_REVIEW = saFeatures;
        SaFeatures saFeatures2 = new SaFeatures("FEATURE_SA_HEALTH_TO_SDK", 1, "sa_health_to_sdk");
        FEATURE_SA_HEALTH_TO_SDK = saFeatures2;
        SaFeatures saFeatures3 = new SaFeatures("SHOW_HEADER_ON_RESUME", 2, "sa_show_header_on_resume");
        SHOW_HEADER_ON_RESUME = saFeatures3;
        SaFeatures saFeatures4 = new SaFeatures("STICKY_BANNER_NATIVE_AD", 3, "sa_native_banner_ad");
        STICKY_BANNER_NATIVE_AD = saFeatures4;
        SaFeatures saFeatures5 = new SaFeatures("SA_STORE_INSTALLER_INFO_V2", 4, "sa_store_installer_info_v2");
        SA_STORE_INSTALLER_INFO_V2 = saFeatures5;
        SaFeatures saFeatures6 = new SaFeatures("SA_GAMES_NATIVE_INSTALL_SCREEN", 5, "sa_games_native_install_screen");
        SA_GAMES_NATIVE_INSTALL_SCREEN = saFeatures6;
        SaFeatures saFeatures7 = new SaFeatures("SA_REMOVE_HEALTH_COMMAND_INITIALIZATION", 6, "sa_remove_health_init_commands");
        SA_REMOVE_HEALTH_COMMAND_INITIALIZATION = saFeatures7;
        SaFeatures saFeatures8 = new SaFeatures("SA_GAMES_WAIT_PREV_REQUEST", 7, "sa_games_wait_prev_request");
        SA_GAMES_WAIT_PREV_REQUEST = saFeatures8;
        SaFeatures saFeatures9 = new SaFeatures("SA_HUAWEI_BROWSER", 8, "sa_huawei_browser");
        SA_HUAWEI_BROWSER = saFeatures9;
        SaFeatures saFeatures10 = new SaFeatures("SA_GAMES_ACHIEVEMENTS_BLOCK", 9, "sa_games_achievements_block");
        SA_GAMES_ACHIEVEMENTS_BLOCK = saFeatures10;
        SaFeatures saFeatures11 = new SaFeatures("SA_VALIDATE_IF_PERSONAL_ACCOUNT", 10, "sa_validate_personal_account");
        SA_VALIDATE_IF_PERSONAL_ACCOUNT = saFeatures11;
        SaFeatures saFeatures12 = new SaFeatures("SA_GAMES_GET_CATALOG", 11, "sa_games_get_catalog");
        SA_GAMES_GET_CATALOG = saFeatures12;
        SaFeatures saFeatures13 = new SaFeatures("SA_APPS_REQUESTS_ALIASES", 12, "sa_apps_requests_aliases");
        SA_APPS_REQUESTS_ALIASES = saFeatures13;
        SaFeatures saFeatures14 = new SaFeatures("SA_MINI_APPS_CATALOG_ALIAS", 13, "sa_mini_apps_catalog_alias");
        SA_MINI_APPS_CATALOG_ALIAS = saFeatures14;
        SaFeatures saFeatures15 = new SaFeatures("SA_GAMES_FRIENDLY_URL_DEEPLINK", 14, "sa_games_friendly_url_deeplink");
        SA_GAMES_FRIENDLY_URL_DEEPLINK = saFeatures15;
        SaFeatures saFeatures16 = new SaFeatures("MULTI_INTERSTITIAL", 15, "sa_multi_interstitial");
        MULTI_INTERSTITIAL = saFeatures16;
        SaFeatures saFeatures17 = new SaFeatures("SA_APP_VIEW_PART_RECS", 16, "sa_app_view_part_recs");
        SA_APP_VIEW_PART_RECS = saFeatures17;
        SaFeatures saFeatures18 = new SaFeatures("SA_GAMES_CATALOG_PERFORMANCE", 17, "sa_games_catalog_performance");
        SA_GAMES_CATALOG_PERFORMANCE = saFeatures18;
        SaFeatures saFeatures19 = new SaFeatures("SA_GAMES_NEW_DISCOUNT", 18, "sa_games_new_discount");
        SA_GAMES_NEW_DISCOUNT = saFeatures19;
        SaFeatures saFeatures20 = new SaFeatures("SA_MINI_APPS_ADS_ALIASES", 19, "sa_mini_apps_ads_aliases");
        SA_MINI_APPS_ADS_ALIASES = saFeatures20;
        SaFeatures saFeatures21 = new SaFeatures("SA_HANDLE_CAPTCHA_NATIVE", 20, "sa_handle_captcha_native");
        SA_HANDLE_CAPTCHA_NATIVE = saFeatures21;
        SaFeatures saFeatures22 = new SaFeatures("SA_FIX_KEEP_SCREEN_BRIDGE", 21, "sa_fix_keep_screen_bridge");
        SA_FIX_KEEP_SCREEN_BRIDGE = saFeatures22;
        SaFeatures saFeatures23 = new SaFeatures("SA_FIX_BLINKING_AFTER_EXIT_APP", 22, "sa_fix_blinking_after_exit_app");
        SA_FIX_BLINKING_AFTER_EXIT_APP = saFeatures23;
        SaFeatures saFeatures24 = new SaFeatures("SA_CLEAR_CACHE_ON_SWITCH_ACCOUNT", 23, "sa_clear_cache_on_switch_acc");
        SA_CLEAR_CACHE_ON_SWITCH_ACCOUNT = saFeatures24;
        SaFeatures saFeatures25 = new SaFeatures("SA_FIX_HANDLE_GAME_URL", 24, "sa_fix_handle_game_url");
        SA_FIX_HANDLE_GAME_URL = saFeatures25;
        SaFeatures[] saFeaturesArr = {saFeatures, saFeatures2, saFeatures3, saFeatures4, saFeatures5, saFeatures6, saFeatures7, saFeatures8, saFeatures9, saFeatures10, saFeatures11, saFeatures12, saFeatures13, saFeatures14, saFeatures15, saFeatures16, saFeatures17, saFeatures18, saFeatures19, saFeatures20, saFeatures21, saFeatures22, saFeatures23, saFeatures24, saFeatures25};
        $VALUES = saFeaturesArr;
        $ENTRIES = new asp(saFeaturesArr);
    }

    public SaFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<SaFeatures> i() {
        return $ENTRIES;
    }

    public static SaFeatures valueOf(String str) {
        return (SaFeatures) Enum.valueOf(SaFeatures.class, str);
    }

    public static SaFeatures[] values() {
        return (SaFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
