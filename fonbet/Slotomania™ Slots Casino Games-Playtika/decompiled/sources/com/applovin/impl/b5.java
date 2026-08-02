package com.applovin.impl;

import com.vungle.ads.internal.model.Cookie;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class b5 {
    private final String a;
    private final Class b;
    public static final b5 c = new b5("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final b5 d = new b5("com.applovin.sdk.launched_before", Boolean.class);
    public static final b5 e = new b5("com.applovin.sdk.launch_count", Long.class);
    public static final b5 f = new b5("com.applovin.sdk.last_launch_timestamp", Long.class);
    public static final b5 g = new b5("com.applovin.sdk.latest_installed_version", String.class);
    public static final b5 h = new b5("com.applovin.sdk.install_date", Long.class);
    public static final b5 i = new b5("com.applovin.sdk.av", Boolean.class);
    public static final b5 j = new b5("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);
    public static final b5 k = new b5("com.applovin.sdk.user_id", String.class);
    public static final b5 l = new b5("com.applovin.sdk.compass_random_token", String.class);
    public static final b5 m = new b5("com.applovin.sdk.applovin_random_token", String.class);
    public static final b5 n = new b5("com.applovin.sdk.alart", String.class);
    public static final b5 o = new b5("com.applovin.sdk.aleid", String.class);
    public static final b5 p = new b5("com.applovin.sdk.device_test_group", String.class);
    public static final b5 q = new b5("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final b5 r = new b5("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final b5 s = new b5("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final b5 t = new b5("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final b5 u = new b5("IABTCF_CmpSdkID", Object.class);
    public static final b5 v = new b5("IABTCF_CmpSdkVersion", Object.class);
    public static final b5 w = new b5(Cookie.IABTCF_GDPR_APPLIES, Object.class);
    public static final b5 x = new b5("IABTCF_TCString", String.class);
    public static final b5 y = new b5("IABTCF_AddtlConsent", String.class);
    public static final b5 z = new b5("IABTCF_VendorConsents", String.class);
    public static final b5 A = new b5("IABTCF_VendorLegitimateInterests", String.class);
    public static final b5 B = new b5("IABTCF_PurposeConsents", String.class);
    public static final b5 C = new b5("IABTCF_PurposeLegitimateInterests", String.class);
    public static final b5 D = new b5("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final b5 E = new b5("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final b5 F = new b5("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final b5 G = new b5("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final b5 H = new b5("com.applovin.sdk.persisted_data", String.class);
    public static final b5 I = new b5("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final b5 J = new b5("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);
    public static final b5 K = new b5("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);
    public static final b5 L = new b5("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);
    public static final b5 M = new b5("com.applovin.sdk.user_agent", String.class);
    public static final b5 N = new b5("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final b5 O = new b5("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final b5 P = new b5("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final b5 Q = new b5("com.applovin.sdk.app_killed_last_ad_data", String.class);
    public static final b5 R = new b5("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);
    public static final b5 S = new b5("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);
    public static final b5 T = new b5("com.applovin.sdk.template_browser_package_name", String.class);

    public b5(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public String a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public String toString() {
        return "Key{name='" + this.a + "', type=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
