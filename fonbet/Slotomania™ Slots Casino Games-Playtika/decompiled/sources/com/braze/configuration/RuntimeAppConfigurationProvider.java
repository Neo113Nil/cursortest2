package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.w0;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0010\u001a\u00020\u0006\"\u0010\b\u0000\u0010\r*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tJ(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0019J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0007J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J.\u0010 \u001a\u00020\u0006\"\u0010\b\u0000\u0010\r*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "", "", "key", "", "value", "", "putInt", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "putBoolean", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "T", "Ljava/util/EnumSet;", "enumSet", "putEnumSet", "Lcom/braze/configuration/BrazeConfig;", "config", "setConfiguration", "clearAllConfigurationValues", "defaultValue", "getStringValue", "getIntValue", "getBooleanValue", "", "", "getStringSetValue", "containsKey", "putEnumAsString", "putString", "updateValue", "updateEnumSetData", "startEdit", "applyEdit", "Landroid/content/SharedPreferences;", "storageMap", "Landroid/content/SharedPreferences;", "getStorageMap", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class RuntimeAppConfigurationProvider {
    private static final String SHARED_PREFERENCES_NAME = "com.appboy.override.configuration.cache";
    private SharedPreferences.Editor editor;
    private final SharedPreferences storageMap;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Clearing Braze Override configuration cache";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ BrazeConfig b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BrazeConfig brazeConfig) {
            super(0);
            this.b = brazeConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Setting Braze Override configuration with config: ", this.b);
        }
    }

    public RuntimeAppConfigurationProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.storageMap = sharedPreferences;
    }

    private final void putBoolean(String key, Boolean value) {
        if (value == null) {
            return;
        }
        boolean booleanValue = value.booleanValue();
        SharedPreferences.Editor editor = getEditor();
        if (editor == null) {
            return;
        }
        editor.putBoolean(key, booleanValue);
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, String key) {
        if (enumSet == null) {
            return;
        }
        Set<String> a = w0.a(enumSet);
        SharedPreferences.Editor editor = this.editor;
        if (editor == null) {
            return;
        }
        editor.putStringSet(key, a);
    }

    private final void putInt(String key, Integer value) {
        if (value == null) {
            return;
        }
        int intValue = value.intValue();
        SharedPreferences.Editor editor = getEditor();
        if (editor == null) {
            return;
        }
        editor.putInt(key, intValue);
    }

    public final void applyEdit() {
        SharedPreferences.Editor editor = this.editor;
        if (editor == null) {
            return;
        }
        editor.apply();
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
        this.storageMap.edit().clear().apply();
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.contains(key);
    }

    public final boolean getBooleanValue(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getBoolean(key, defaultValue);
    }

    public final SharedPreferences.Editor getEditor() {
        return this.editor;
    }

    public final int getIntValue(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getInt(key, defaultValue);
    }

    public final SharedPreferences getStorageMap() {
        return this.storageMap;
    }

    public final Set<String> getStringSetValue(String key, Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getStringSet(key, defaultValue);
    }

    public final String getStringValue(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getString(key, defaultValue);
    }

    public final void putEnumAsString(String key, Enum<?> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null) {
            return;
        }
        putString(key, value.toString());
    }

    public final void putString(String key, String value) {
        SharedPreferences.Editor editor;
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null || (editor = getEditor()) == null) {
            return;
        }
        editor.putString(key, value);
    }

    public final void setConfiguration(BrazeConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(config), 2, (Object) null);
        startEdit();
        putString(BrazeConfigurationProvider.b.API_KEY.getKey(), config.apiKey);
        putString(BrazeConfigurationProvider.b.SERVER_TARGET_KEY.getKey(), config.serverTarget);
        putEnumAsString(BrazeConfigurationProvider.b.SDK_FLAVOR.getKey(), config.sdkFlavor);
        putBoolean(BrazeConfigurationProvider.b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.getKey(), config.isNewsFeedVisualIndicatorOn);
        putString(BrazeConfigurationProvider.b.CUSTOM_ENDPOINT.getKey(), config.customEndpoint);
        putString(BrazeConfigurationProvider.b.SMALL_NOTIFICATION_ICON_KEY.getKey(), config.smallNotificationIcon);
        putString(BrazeConfigurationProvider.b.LARGE_NOTIFICATION_ICON_KEY.getKey(), config.largeNotificationIcon);
        putInt(BrazeConfigurationProvider.b.SESSION_TIMEOUT_KEY.getKey(), config.sessionTimeout);
        putInt(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.getKey(), config.defaultNotificationAccentColor);
        putInt(BrazeConfigurationProvider.b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.getKey(), config.triggerActionMinimumTimeIntervalSeconds);
        putBoolean(BrazeConfigurationProvider.b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.getKey(), config.isAdmMessagingRegistrationEnabled);
        putBoolean(BrazeConfigurationProvider.b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.getKey(), config.willHandlePushDeepLinksAutomatically);
        putBoolean(BrazeConfigurationProvider.b.ENABLE_LOCATION_COLLECTION_KEY.getKey(), config.isLocationCollectionEnabled);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.getKey(), config.badNetworkInterval);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.getKey(), config.goodNetworkInterval);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.getKey(), config.greatNetworkInterval);
        putString(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_CHANNEL_NAME.getKey(), config.defaultNotificationChannelName);
        putString(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.getKey(), config.defaultNotificationChannelDescription);
        putBoolean(BrazeConfigurationProvider.b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.getKey(), config.isPushDeepLinkBackStackActivityEnabled);
        putString(BrazeConfigurationProvider.b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.getKey(), config.pushDeepLinkBackStackActivityClassName);
        putBoolean(BrazeConfigurationProvider.b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.getKey(), config.isSessionStartBasedTimeoutEnabled);
        putBoolean(BrazeConfigurationProvider.b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.getKey(), config.isFirebaseCloudMessagingRegistrationEnabled);
        putString(BrazeConfigurationProvider.b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.getKey(), config.firebaseCloudMessagingSenderIdKey);
        putBoolean(BrazeConfigurationProvider.b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.getKey(), config.isContentCardsUnreadVisualIndicatorEnabled);
        putBoolean(BrazeConfigurationProvider.b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.getKey(), config.isDeviceObjectAllowlistEnabled);
        putBoolean(BrazeConfigurationProvider.b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.getKey(), config.isInAppMessageAccessibilityExclusiveModeEnabled);
        putBoolean(BrazeConfigurationProvider.b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.getKey(), config.isPushWakeScreenForNotificationEnabled);
        putBoolean(BrazeConfigurationProvider.b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.getKey(), config.isPushHtmlRenderingEnabled);
        putBoolean(BrazeConfigurationProvider.b.DOES_PUSH_STORY_DISMISS_ON_CLICK.getKey(), config.doesPushStoryDismissOnClick);
        putBoolean(BrazeConfigurationProvider.b.GEOFENCES_ENABLED.getKey(), config.areGeofencesEnabled);
        putBoolean(BrazeConfigurationProvider.b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.getKey(), config.isInAppMessageTestPushEagerDisplayEnabled);
        putString(BrazeConfigurationProvider.b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.getKey(), config.customHtmlWebViewActivityClassName);
        putBoolean(BrazeConfigurationProvider.b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.getKey(), config.areAutomaticGeofenceRequestsEnabled);
        putInt(BrazeConfigurationProvider.b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.getKey(), config.inAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        putBoolean(BrazeConfigurationProvider.b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.getKey(), config.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        putBoolean(BrazeConfigurationProvider.b.SDK_AUTH_ENABLED.getKey(), config.isSdkAuthEnabled);
        putBoolean(BrazeConfigurationProvider.b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.getKey(), config.isTouchModeRequiredForHtmlInAppMessages);
        putBoolean(BrazeConfigurationProvider.b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.getKey(), config.isHtmlInAppMessageApplyWindowInsetsEnabled);
        putBoolean(BrazeConfigurationProvider.b.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET.getKey(), config.isHtmlInAppMessageHtmlLinkTargetEnabled);
        putEnumSet(config.deviceObjectAllowlist, BrazeConfigurationProvider.b.DEVICE_OBJECT_ALLOWLIST_VALUE.getKey());
        putEnumSet(config.customLocationProviderNames, BrazeConfigurationProvider.b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY.getKey());
        EnumSet<BrazeSdkMetadata> enumSet = config.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData(BrazeConfigurationProvider.b.SDK_METADATA_PUBLIC_KEY.getKey(), enumSet);
        }
        applyEdit();
    }

    public final void setEditor(SharedPreferences.Editor editor) {
        this.editor = editor;
    }

    public final void startEdit() {
        this.editor = this.storageMap.edit();
    }

    public final <T extends Enum<T>> void updateEnumSetData(String key, EnumSet<T> updateValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(updateValue, "updateValue");
        Set<String> stringSetValue = getStringSetValue(key, new HashSet());
        if (stringSetValue != null) {
            stringSetValue.addAll(w0.a(updateValue));
        }
        this.storageMap.edit().putStringSet(key, stringSetValue).apply();
    }
}
