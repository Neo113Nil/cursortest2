package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import bo.app.w0;
import bo.app.x0;
import com.braze.Constants;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import io.sentry.ProfilingTraceData;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 s2\u00020\u0001:\u0002tuB\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bq\u0010rJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0007R \u0010\r\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00138BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0011\u0010&\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0011\u0010'\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b2\u0010*R\u0017\u00106\u001a\u00020(8F¢\u0006\f\u0012\u0004\b5\u0010\u0012\u001a\u0004\b4\u0010*R\u0013\u00108\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b7\u0010\u0015R\u0011\u0010:\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b9\u0010\u001aR\u0011\u0010;\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b;\u0010\u001aR\u0011\u0010=\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b<\u0010\u0015R\u0011\u0010?\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b>\u0010\u0015R\u0011\u0010A\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b@\u0010*R\u0017\u0010D\u001a\u00020(8G¢\u0006\f\u0012\u0004\bC\u0010\u0012\u001a\u0004\bB\u0010*R\u0013\u0010H\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010I\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bI\u0010\u001aR\u0013\u0010K\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0015R\u0011\u0010L\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bL\u0010\u001aR\u0011\u0010M\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bM\u0010\u001aR\u0011\u0010N\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bN\u0010\u001aR\u0013\u0010P\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bO\u0010\u0015R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0\b8G¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0\b8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0011\u0010W\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\bW\u0010\u001aR\u0011\u0010X\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bX\u0010\u001aR\u0011\u0010Y\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bY\u0010\u001aR\u0011\u0010Z\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bZ\u0010\u001aR\u0011\u0010[\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b[\u0010\u001aR\u0011\u0010]\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\\\u0010\u001aR\u0011\u0010^\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b^\u0010\u001aR\u0011\u0010_\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b_\u0010\u001aR\u0011\u0010a\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b`\u0010*R\u0013\u0010c\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bb\u0010\u0015R\u0011\u0010e\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bd\u0010*R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020f0\b8F¢\u0006\u0006\u001a\u0004\bg\u0010SR\u0011\u0010i\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bi\u0010\u001aR\u0011\u0010j\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bj\u0010\u001aR\u0011\u0010k\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bk\u0010\u001aR\u0011\u0010l\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bl\u0010\u001aR\u0011\u0010m\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bm\u0010\u001aR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020n0\b8F¢\u0006\u0006\u001a\u0004\bo\u0010S¨\u0006v"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/configuration/CachedConfigurationProvider;", "", ExifInterface.LONGITUDE_EAST, "Ljava/lang/Class;", "targetEnumClass", "Lcom/braze/configuration/BrazeConfigurationProvider$b;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "", "clear", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext$android_sdk_base_release", "()Landroid/content/Context;", "getContext$android_sdk_base_release$annotations", "()V", "", "getServerTarget", "()Ljava/lang/String;", "getServerTarget$annotations", "serverTarget", "", "isEphemeralEventsEnabled", "()Z", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "baseUrlForRequests", "Lbo/app/i;", "getBrazeApiKey", "()Lbo/app/i;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isLocationCollectionEnabled", "isGeofencesEnabled", "", "getSmallNotificationIconResourceId", "()I", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getVersionCode", "getVersionCode$annotations", com.safedk.android.utils.j.h, "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "isNewsfeedVisualIndicatorOn", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/braze/enums/DeviceKey;", "getDeviceObjectWhitelist", "()Ljava/util/EnumSet;", "deviceObjectWhitelist", "getDeviceObjectAllowlist", "deviceObjectAllowlist", "isDeviceObjectWhitelistEnabled", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "getDoesPushStoryDismissOnClick", "doesPushStoryDismissOnClick", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/braze/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "getSdkMetadata", "sdkMetadata", "<init>", "(Landroid/content/Context;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b5\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider$b;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "EPHEMERAL_EVENTS_ENABLED", "EPHEMERAL_EVENTS_KEYS", "API_KEY", "SERVER_TARGET_KEY", "ADM_MESSAGING_REGISTRATION_ENABLED_KEY", "SMALL_NOTIFICATION_ICON_KEY", "LARGE_NOTIFICATION_ICON_KEY", "SESSION_TIMEOUT_KEY", "ENABLE_LOCATION_COLLECTION_KEY", "DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY", "TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS", "HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY", "NEWSFEED_UNREAD_VISUAL_INDICATOR_ON", "SDK_FLAVOR", "CUSTOM_ENDPOINT", "DEFAULT_NOTIFICATION_CHANNEL_NAME", "DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION", "PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY", "PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY", "SESSION_START_BASED_TIMEOUT_ENABLED_KEY", "FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY", "FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY", "CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED", "DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY", "DEVICE_OBJECT_ALLOWLIST_VALUE", "IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED", "PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED", "PUSH_NOTIFICATION_HTML_RENDERING_ENABLED", "DOES_PUSH_STORY_DISMISS_ON_CLICK", "GEOFENCES_ENABLED", "IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY", "LOGGER_INITIAL_LOG_LEVEL", "CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY", "GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY", "CUSTOM_LOCATION_PROVIDERS_LIST_KEY", "IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY", "FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY", "SDK_AUTH_ENABLED", "REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY", "DATA_SYNC_BAD_NETWORK_INTERVAL_KEY", "DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY", "DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY", "SDK_METADATA_INTERNAL_KEY", "SDK_METADATA_PUBLIC_KEY", "HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS", "HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public enum b {
        EPHEMERAL_EVENTS_ENABLED("com_braze_ephemeral_events_enabled"),
        EPHEMERAL_EVENTS_KEYS("com_braze_ephemeral_events_keys"),
        API_KEY("com_braze_api_key"),
        SERVER_TARGET_KEY("com_braze_server_target"),
        ADM_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_push_adm_messaging_registration_enabled"),
        SMALL_NOTIFICATION_ICON_KEY("com_braze_push_small_notification_icon"),
        LARGE_NOTIFICATION_ICON_KEY("com_braze_push_large_notification_icon"),
        SESSION_TIMEOUT_KEY("com_braze_session_timeout"),
        ENABLE_LOCATION_COLLECTION_KEY("com_braze_enable_location_collection"),
        DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY("com_braze_default_notification_accent_color"),
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS("com_braze_trigger_action_minimum_time_interval_seconds"),
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY("com_braze_handle_push_deep_links_automatically"),
        NEWSFEED_UNREAD_VISUAL_INDICATOR_ON("com_braze_newsfeed_unread_visual_indicator_on"),
        SDK_FLAVOR("com_braze_sdk_flavor"),
        CUSTOM_ENDPOINT("com_braze_custom_endpoint"),
        DEFAULT_NOTIFICATION_CHANNEL_NAME("com_braze_default_notification_channel_name"),
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION("com_braze_default_notification_channel_description"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY("com_braze_push_deep_link_back_stack_activity_enabled"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY("com_braze_push_deep_link_back_stack_activity_class_name"),
        SESSION_START_BASED_TIMEOUT_ENABLED_KEY("com_braze_session_start_based_timeout_enabled"),
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_firebase_cloud_messaging_registration_enabled"),
        FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY("com_braze_firebase_cloud_messaging_sender_id"),
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED("com_braze_content_cards_unread_visual_indicator_enabled"),
        DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY("com_braze_device_object_whitelisting_enabled"),
        DEVICE_OBJECT_ALLOWLIST_VALUE("com_braze_device_object_whitelist"),
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled"),
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED("com_braze_push_wake_screen_for_notification_enabled"),
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED("com_braze_push_notification_html_rendering_enabled"),
        DOES_PUSH_STORY_DISMISS_ON_CLICK("com_braze_does_push_story_dismiss_on_click"),
        GEOFENCES_ENABLED("com_braze_geofences_enabled"),
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY("com_braze_in_app_message_push_test_eager_display_enabled"),
        LOGGER_INITIAL_LOG_LEVEL("com_braze_logger_initial_log_level"),
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY("com_braze_custom_html_webview_activity_class_name"),
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY("com_braze_automatic_geofence_requests_enabled"),
        CUSTOM_LOCATION_PROVIDERS_LIST_KEY("com_braze_custom_location_providers_list"),
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms"),
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY("com_braze_firebase_messaging_service_automatically_register_on_new_token"),
        SDK_AUTH_ENABLED("com_braze_sdk_authentication_enabled"),
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY("com_braze_require_touch_mode_for_html_in_app_messages"),
        DATA_SYNC_BAD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_bad_network"),
        DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_good_network"),
        DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_great_network"),
        SDK_METADATA_INTERNAL_KEY("com_braze_internal_sdk_metadata"),
        SDK_METADATA_PUBLIC_KEY("com_braze_sdk_metadata"),
        HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS("com_braze_html_in_app_message_apply_insets"),
        HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET("com_braze_html_in_app_message_enable_html_link_target");


        /* renamed from: b, reason: from kotlin metadata */
        private final String key;

        b(String str) {
            this.key = str;
        }

        /* renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Couldn't find application icon for package: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "****************************************************";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found an override api key. Using it to configure the Braze SDK";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "****************************************************";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                                                **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                 !! WARNING !!                  **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                                                **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**     No API key set in res/values/braze.xml     **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "** No cached API Key found from Braze.configure   **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**          Braze functionality disabled          **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        public static final m b = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                                                **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Using default notification accent color found in resources";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        public static final o b = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        public static final p b = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception while parsing stored SDK flavor. Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        public static final q b = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to read the version code.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    public static /* synthetic */ void getContext$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> targetEnumClass, b configField) {
        String key = configField.getKey();
        if (getConfigurationCache().containsKey(key)) {
            Object obj = getConfigurationCache().get(key);
            if (obj != null) {
                return (EnumSet) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
        }
        Set<String> stringSetValue = getStringSetValue(configField.getKey(), new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> a = w0.a(targetEnumClass, stringSetValue);
        getConfigurationCache().put(key, a);
        return a;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue(b.SERVER_TARGET_KEY.getKey(), "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }

    public final void clear() {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().getStorageMap().edit().clear().apply();
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = serverTarget.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return Intrinsics.areEqual("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final bo.app.i getBrazeApiKey() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        String key = b.API_KEY.getKey();
        String str = (String) getConfigurationCache().get(key);
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().getStringValue(key, null);
            if (str != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, e.b, 2, (Object) null);
                brazeConfigurationProvider = this;
            } else {
                brazeConfigurationProvider = this;
                str = brazeConfigurationProvider.getStringValue(key, null);
            }
            if (str != null) {
                brazeConfigurationProvider.getConfigurationCache().put(key, str);
            }
        } else {
            brazeConfigurationProvider = this;
        }
        if (str != null) {
            return new bo.app.i(str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, brazeConfigurationProvider, priority, (Throwable) null, f.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, h.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, i.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, j.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, l.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, m.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.b, 2, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    /* renamed from: getContext$android_sdk_base_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final String getCustomEndpoint() {
        return getStringValue(b.CUSTOM_ENDPOINT.getKey(), null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.getKey(), "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.getKey());
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue(b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.getKey(), "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue(b.DEFAULT_NOTIFICATION_CHANNEL_NAME.getKey(), DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        return stringValue == null ? DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE : stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    @Deprecated(message = "Use {@link #getDeviceObjectAllowList()}", replaceWith = @ReplaceWith(expression = "getDeviceObjectAllowlist", imports = {}))
    public final EnumSet<DeviceKey> getDeviceObjectWhitelist() {
        return getDeviceObjectAllowlist();
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue(b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.getKey(), false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        return getBooleanValue(b.DOES_PUSH_STORY_DISMISS_ON_CLICK.getKey(), true);
    }

    public final Set<String> getEphemeralEventKeys() {
        Set<String> stringSetValue = getStringSetValue(b.EPHEMERAL_EVENTS_KEYS.getKey(), SetsKt.emptySet());
        if (stringSetValue == null) {
            stringSetValue = SetsKt.emptySet();
        }
        if (stringSetValue.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, o.b, 2, (Object) null);
        }
        return CollectionsKt.toSet(CollectionsKt.take(stringSetValue, 12));
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.getKey(), null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.getKey(), DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue(b.LARGE_NOTIFICATION_ICON_KEY.getKey(), 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue(b.LOGGER_INITIAL_LOG_LEVEL.getKey(), 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.getKey(), "");
    }

    public final SdkFlavor getSdkFlavor() {
        String stringValue = getStringValue(b.SDK_FLAVOR.getKey(), null);
        if (stringValue != null && !StringsKt.isBlank(stringValue)) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = stringValue.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return SdkFlavor.valueOf(upperCase);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, p.b);
            }
        }
        return null;
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        BrazeSdkMetadata[] values;
        int length;
        int i2;
        String key = b.SDK_METADATA_INTERNAL_KEY.getKey();
        CachedConfigurationProvider.b bVar = CachedConfigurationProvider.b.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(bVar, key, new HashSet());
        if (resourceConfigurationValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        }
        Set<String> asMutableSet = TypeIntrinsics.asMutableSet(resourceConfigurationValue);
        String key2 = b.SDK_METADATA_PUBLIC_KEY.getKey();
        Object resourceConfigurationValue2 = getResourceConfigurationValue(bVar, key2, new HashSet());
        if (resourceConfigurationValue2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        }
        Set set = (Set) resourceConfigurationValue2;
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(bVar, key2, new HashSet());
        if (runtimeConfigurationValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        }
        asMutableSet.addAll(set);
        asMutableSet.addAll((Set) runtimeConfigurationValue);
        w0 w0Var = w0.a;
        EnumSet<BrazeSdkMetadata> result = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : asMutableSet) {
            try {
                w0 w0Var2 = w0.a;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = str.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                values = BrazeSdkMetadata.values();
                length = values.length;
                i2 = 0;
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(w0.a, BrazeLogger.Priority.E, e2, new x0(str));
            }
            while (i2 < length) {
                BrazeSdkMetadata brazeSdkMetadata = values[i2];
                i2++;
                if (Intrinsics.areEqual(brazeSdkMetadata.name(), upperCase)) {
                    result.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue(b.SESSION_TIMEOUT_KEY.getKey(), 10);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue(b.SMALL_NOTIFICATION_ICON_KEY.getKey(), 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return getIntValue(b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.getKey(), 30);
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.getKey(), false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.getKey(), true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.getKey(), true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue(b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.getKey(), false);
    }

    @Deprecated(message = "Use {@link #getIsDeviceObjectAllowlistEnabled()}", replaceWith = @ReplaceWith(expression = "isDeviceObjectAllowlistEnabled", imports = {}))
    public final boolean isDeviceObjectWhitelistEnabled() {
        return isDeviceObjectAllowlistEnabled();
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue(b.EPHEMERAL_EVENTS_ENABLED.getKey(), false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.getKey(), false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.getKey(), isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue(b.GEOFENCES_ENABLED.getKey(), isLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        return getBooleanValue(b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.getKey(), false);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        return getBooleanValue(b.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET.getKey(), true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.getKey(), false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.getKey(), true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue(b.ENABLE_LOCATION_COLLECTION_KEY.getKey(), false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue(b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.getKey(), true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.getKey(), true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.getKey(), false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.getKey(), true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue(b.SDK_AUTH_ENABLED.getKey(), false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.getKey(), false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.getKey(), true);
    }

    public final int getApplicationIconResourceId() {
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        String packageName = this.context.getPackageName();
        int i2 = 0;
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L)) : this.context.getPackageManager().getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "if (Build.VERSION.SDK_IN… 0)\n                    }");
            i2 = applicationInfo.icon;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new c(packageName));
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i2));
        return i2;
    }

    public final int getVersionCode() {
        int i2;
        if (getConfigurationCache().containsKey(ProfilingTraceData.JsonKeys.VERSION_CODE)) {
            Object obj = getConfigurationCache().get(ProfilingTraceData.JsonKeys.VERSION_CODE);
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        try {
            i2 = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, q.b);
            i2 = -1;
        }
        getConfigurationCache().put(ProfilingTraceData.JsonKeys.VERSION_CODE, Integer.valueOf(i2));
        return i2;
    }
}
