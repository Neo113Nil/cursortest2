package io.branch.referral;

import com.amplitude.api.Constants;
import com.appsflyer.AppsFlyerProperties;
import com.braze.models.Banner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.branch.indexing.ContentDiscoveryManifest;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.Session;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.Gpu;
import io.sentry.protocol.OperatingSystem;

/* loaded from: classes9.dex */
public class Defines {

    public enum Jsonkey {
        IdentityID("identity_id"),
        Identity(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY),
        DeviceFingerprintID("device_fingerprint_id"),
        SessionID("session_id"),
        LinkClickID("link_click_id"),
        GoogleSearchInstallReferrer("google_search_install_referrer"),
        GooglePlayInstallReferrer("install_referrer_extras"),
        ClickedReferrerTimeStamp("clicked_referrer_ts"),
        InstallBeginTimeStamp("install_begin_ts"),
        FaceBookAppLinkChecked("facebook_app_link_checked"),
        BranchLinkUsed("branch_used"),
        ReferringBranchIdentity("referring_branch_identity"),
        BranchIdentity("branch_identity"),
        BranchKey("branch_key"),
        BranchData("branch_data"),
        Bucket("bucket"),
        DefaultBucket("default"),
        Amount("amount"),
        CalculationType("calculation_type"),
        Location(FirebaseAnalytics.Param.LOCATION),
        Type("type"),
        CreationSource("creation_source"),
        Prefix("prefix"),
        Expiration("expiration"),
        Event("event"),
        Metadata("metadata"),
        CommerceData("commerce_data"),
        ReferralCode(Branch.REFERRAL_CODE),
        Total("total"),
        Unique("unique"),
        Length(SentryEnvelopeItemHeader.JsonKeys.LENGTH),
        Direction("direction"),
        BeginAfterID("begin_after_id"),
        Link("link"),
        ReferringData("referring_data"),
        ReferringLink("referring_link"),
        IsFullAppConv("is_full_app_conversion"),
        Data("data"),
        OS(OperatingSystem.TYPE),
        HardwareID("hardware_id"),
        AndroidID("android_id"),
        UnidentifiedDevice("unidentified_device"),
        HardwareIDType("hardware_id_type"),
        HardwareIDTypeVendor(Gpu.JsonKeys.VENDOR_ID),
        HardwareIDTypeRandom("random"),
        IsHardwareIDReal("is_hardware_id_real"),
        AppVersion(App.JsonKeys.APP_VERSION),
        APILevel(Constants.AMP_TRACKING_OPTION_OS_VERSION),
        Country("country"),
        Language("language"),
        IsReferrable("is_referrable"),
        Update("update"),
        OriginalInstallTime("first_install_time"),
        FirstInstallTime("latest_install_time"),
        LastUpdateTime("latest_update_time"),
        PreviousUpdateTime("previous_update_time"),
        URIScheme("uri_scheme"),
        AppLinks("app_links"),
        AppIdentifier(App.JsonKeys.APP_IDENTIFIER),
        LinkIdentifier("link_identifier"),
        GoogleAdvertisingID("google_advertising_id"),
        AAID("aaid"),
        FireAdId("fire_ad_id"),
        LATVal("lat_val"),
        LimitedAdTracking("limit_ad_tracking"),
        limitFacebookTracking("limit_facebook_tracking"),
        Debug("debug"),
        Brand(Device.JsonKeys.BRAND),
        Model("model"),
        ScreenDpi(Device.JsonKeys.SCREEN_DPI),
        ScreenHeight("screen_height"),
        ScreenWidth("screen_width"),
        WiFi("wifi"),
        LocalIP("local_ip"),
        UserData("user_data"),
        AdvertisingIDs("advertising_ids"),
        DeveloperIdentity("developer_identity"),
        UserAgent(Session.JsonKeys.USER_AGENT),
        SDK("sdk"),
        SdkVersion("sdk_version"),
        UIMode("ui_mode"),
        InstallMetadata("install_metadata"),
        LATDAttributionWindow("attribution_window"),
        Clicked_Branch_Link("+clicked_branch_link"),
        IsFirstSession("+is_first_session"),
        AndroidDeepLinkPath("$android_deeplink_path"),
        DeepLinkPath(Branch.DEEPLINK_PATH),
        AndroidAppLinkURL("android_app_link_url"),
        AndroidPushNotificationKey(Constants.AMP_PLAN_BRANCH),
        AndroidPushIdentifier("push_identifier"),
        ForceNewBranchSession("branch_force_new_session"),
        CanonicalIdentifier("$canonical_identifier"),
        ContentTitle(Branch.OG_TITLE),
        ContentDesc(Branch.OG_DESC),
        ContentImgUrl(Branch.OG_IMAGE_URL),
        CanonicalUrl("$canonical_url"),
        ContentType("$content_type"),
        PublicallyIndexable("$publicly_indexable"),
        LocallyIndexable("$locally_indexable"),
        ContentKeyWords("$keywords"),
        ContentExpiryTime("$exp_date"),
        Params("params"),
        SharedLink("$shared_link"),
        ShareError("$share_error"),
        External_Intent_URI("external_intent_uri"),
        External_Intent_Extra("external_intent_extra"),
        Last_Round_Trip_Time("lrtt"),
        Branch_Round_Trip_Time("brtt"),
        Branch_Instrumentation("instrumentation"),
        Queue_Wait_Time("qwt"),
        InstantDeepLinkSession("instant_dl_session"),
        BranchViewData("branch_view_data"),
        BranchViewID("id"),
        BranchViewAction("action"),
        BranchViewNumOfUse("number_of_use"),
        BranchViewUrl("url"),
        BranchViewHtml(Banner.HTML),
        Path("path"),
        ViewList("view_list"),
        ContentActionView(ViewHierarchyConstants.VIEW_KEY),
        ContentPath("content_path"),
        ContentNavPath("content_nav_path"),
        ReferralLink("referral_link"),
        ContentData("content_data"),
        ContentEvents("events"),
        ContentAnalyticsMode("content_analytics_mode"),
        ContentDiscovery(ContentDiscoveryManifest.CONTENT_DISCOVER_KEY),
        Environment("environment"),
        InstantApp("INSTANT_APP"),
        NativeApp("FULL_APP"),
        CustomerEventAlias("customer_event_alias"),
        TransactionID("transaction_id"),
        Currency("currency"),
        Revenue("revenue"),
        Shipping(FirebaseAnalytics.Param.SHIPPING),
        Tax(FirebaseAnalytics.Param.TAX),
        Coupon(FirebaseAnalytics.Param.COUPON),
        Affiliation(FirebaseAnalytics.Param.AFFILIATION),
        Description("description"),
        SearchQuery("search_query"),
        AdType("ad_type"),
        CPUType("cpu_type"),
        DeviceBuildId("build"),
        Locale("locale"),
        ConnectionType(Device.JsonKeys.CONNECTION_TYPE),
        DeviceCarrier("device_carrier"),
        PluginType("plugin_type"),
        PluginVersion("plugin_version"),
        OSVersionAndroid("os_version_android"),
        Name("name"),
        CustomData("custom_data"),
        EventData("event_data"),
        ContentItems("content_items"),
        ContentSchema("$content_schema"),
        Price(Constants.AMP_REVENUE_PRICE),
        PriceCurrency("$currency"),
        Quantity(Constants.AMP_REVENUE_QUANTITY),
        SKU("$sku"),
        ProductName("$product_name"),
        ProductBrand("$product_brand"),
        ProductCategory("$product_category"),
        ProductVariant("$product_variant"),
        Rating("$rating"),
        RatingAverage("$rating_average"),
        RatingCount("$rating_count"),
        RatingMax("$rating_max"),
        AddressStreet("$address_street"),
        AddressCity("$address_city"),
        AddressRegion("$address_region"),
        AddressCountry("$address_country"),
        AddressPostalCode("$address_postal_code"),
        Latitude("$latitude"),
        Longitude("$longitude"),
        ImageCaptions("$image_captions"),
        Condition("$condition"),
        CreationTimestamp("$creation_timestamp"),
        TrackingDisabled("tracking_disabled"),
        Instant("instant");

        private String key;

        Jsonkey(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum RequestPath {
        RedeemRewards("v1/redeem"),
        GetURL("v1/url"),
        GetApp("v1/app-link-settings"),
        RegisterInstall("v1/install"),
        RegisterClose("v1/close"),
        RegisterOpen("v1/open"),
        GetCredits("v1/credits/"),
        GetCreditHistory("v1/credithistory"),
        CompletedAction("v1/event"),
        IdentifyUser("v1/profile"),
        Logout("v1/logout"),
        ContentEvent("v1/content-events"),
        TrackStandardEvent("v2/event/standard"),
        TrackCustomEvent("v2/event/custom"),
        GetCPID("v1/cpid"),
        GetLATD("v1/cpid/latd");

        private String key;

        RequestPath(String str) {
            this.key = str;
        }

        public String getPath() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum LinkParam {
        Tags("tags"),
        Alias("alias"),
        Type("type"),
        Duration("duration"),
        Channel(AppsFlyerProperties.CHANNEL),
        Feature("feature"),
        Stage("stage"),
        Campaign("campaign"),
        Data("data"),
        URL("url");

        private String key;

        LinkParam(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum PreinstallKey {
        campaign("preinstall_campaign"),
        partner("preinstall_partner");

        private String key;

        PreinstallKey(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum ModuleNameKeys {
        imei("imei");

        private String key;

        ModuleNameKeys(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }
}
