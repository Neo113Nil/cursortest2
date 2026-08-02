package com.braze.configuration;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.braze.Constants;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.google.android.exoplayer2.C;
import io.sentry.protocol.OperatingSystem;
import java.util.EnumSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001:B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00109\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010 \u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010!\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010#\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010,\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010/\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0012\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00102\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u00108\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006;"}, d2 = {"Lcom/braze/configuration/BrazeConfig;", "", "builder", "Lcom/braze/configuration/BrazeConfig$Builder;", "(Lcom/braze/configuration/BrazeConfig$Builder;)V", "apiKey", "", "areAutomaticGeofenceRequestsEnabled", "", "Ljava/lang/Boolean;", "areGeofencesEnabled", "badNetworkInterval", "", "Ljava/lang/Integer;", "brazeSdkMetadata", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "customEndpoint", "customHtmlWebViewActivityClassName", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "defaultNotificationAccentColor", "defaultNotificationChannelDescription", "defaultNotificationChannelName", "deviceObjectAllowlist", "Lcom/braze/enums/DeviceKey;", "doesPushStoryDismissOnClick", "firebaseCloudMessagingSenderIdKey", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "isAdmMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isDeviceObjectAllowlistEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isInAppMessageTestPushEagerDisplayEnabled", "isLocationCollectionEnabled", "isNewsFeedVisualIndicatorOn", "isPushDeepLinkBackStackActivityEnabled", "isPushHtmlRenderingEnabled", "isPushWakeScreenForNotificationEnabled", "isSdkAuthEnabled", "isSessionStartBasedTimeoutEnabled", "isTouchModeRequiredForHtmlInAppMessages", "largeNotificationIcon", "pushDeepLinkBackStackActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "serverTarget", "sessionTimeout", "smallNotificationIcon", "triggerActionMinimumTimeIntervalSeconds", "willHandlePushDeepLinksAutomatically", "toString", "Builder", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isLocationCollectionEnabled;
    public final Boolean isNewsFeedVisualIndicatorOn;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey$android_sdk_base_release();
        this.serverTarget = builder.getServerTarget$android_sdk_base_release();
        this.smallNotificationIcon = builder.getSmallNotificationIconName$android_sdk_base_release();
        this.largeNotificationIcon = builder.getLargeNotificationIconName$android_sdk_base_release();
        this.customEndpoint = builder.getCustomEndpoint$android_sdk_base_release();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName$android_sdk_base_release();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription$android_sdk_base_release();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName$android_sdk_base_release();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName$android_sdk_base_release();
        this.sdkFlavor = builder.getSdkFlavor$android_sdk_base_release();
        this.sessionTimeout = builder.getSessionTimeout$android_sdk_base_release();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor$android_sdk_base_release();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release();
        this.badNetworkInterval = builder.getBadNetworkInterval$android_sdk_base_release();
        this.goodNetworkInterval = builder.getGoodNetworkInterval$android_sdk_base_release();
        this.greatNetworkInterval = builder.getGreatNetworkInterval$android_sdk_base_release();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled$android_sdk_base_release();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically$android_sdk_base_release();
        this.isLocationCollectionEnabled = builder.isLocationCollectionEnabled$android_sdk_base_release();
        this.isNewsFeedVisualIndicatorOn = builder.isNewsFeedVisualIndicatorOn$android_sdk_base_release();
        this.isPushDeepLinkBackStackActivityEnabled = builder.isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release();
        this.isSessionStartBasedTimeoutEnabled = builder.isSessionStartBasedTimeoutEnabled$android_sdk_base_release();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release();
        this.isPushWakeScreenForNotificationEnabled = builder.isPushWakeScreenForNotificationEnabled$android_sdk_base_release();
        this.isPushHtmlRenderingEnabled = builder.isPushHtmlRenderingEnabled$android_sdk_base_release();
        this.areGeofencesEnabled = builder.isGeofencesEnabled$android_sdk_base_release();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled$android_sdk_base_release();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release();
        this.isSdkAuthEnabled = builder.isSdkAuthEnabled$android_sdk_base_release();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.isDeviceObjectAllowlistEnabled$android_sdk_base_release();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageApplyWindowInsetsEnabled = builder.isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick$android_sdk_base_release();
    }

    public /* synthetic */ BrazeConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public String toString() {
        return this.builder.toString();
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0018\u0002\n\u0002\bf\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0091\u0004\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010+\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u00105J\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001J\u0012\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\b\u0099\u0001J\u0012\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\b\u009b\u0001J\u0012\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000fHÀ\u0003¢\u0006\u0003\b\u009d\u0001J\u0014\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b\u009f\u0001\u0010BJ\u0014\u0010 \u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b¡\u0001\u0010BJ\u0014\u0010¢\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b£\u0001\u0010BJ\u0014\u0010¤\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b¥\u0001\u0010BJ\u0014\u0010¦\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b§\u0001\u0010BJ\u0014\u0010¨\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b©\u0001\u0010BJ\u0014\u0010ª\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0005\b«\u0001\u0010BJ\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b\u00ad\u0001\u00107J\u0012\u0010®\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\b¯\u0001J\u0014\u0010°\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b±\u0001\u00107J\u0014\u0010²\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b³\u0001\u00107J\u0014\u0010´\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bµ\u0001\u00107J\u0014\u0010¶\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b·\u0001\u00107J\u0014\u0010¸\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b¹\u0001\u00107J\u0014\u0010º\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b»\u0001\u00107J\u0014\u0010¼\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b½\u0001\u00107J\u0014\u0010¾\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\b¿\u0001\u00107J\u0014\u0010À\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÁ\u0001\u00107J\u0014\u0010Â\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÃ\u0001\u00107J\u0012\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bÅ\u0001J\u0014\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÇ\u0001\u00107J\u0014\u0010È\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÉ\u0001\u00107J\u0014\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bË\u0001\u00107J\u0014\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÍ\u0001\u00107J\u0014\u0010Î\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÏ\u0001\u00107J\u0014\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÑ\u0001\u00107J\u0018\u0010Ò\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+HÀ\u0003¢\u0006\u0003\bÓ\u0001J\u0014\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÕ\u0001\u00107J\u0018\u0010Ö\u0001\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010+HÀ\u0003¢\u0006\u0003\b×\u0001J\u0018\u0010Ø\u0001\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+HÀ\u0003¢\u0006\u0003\bÙ\u0001J\u0012\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bÛ\u0001J\u0014\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bÝ\u0001\u00107J\u0014\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bß\u0001\u00107J\u0014\u0010à\u0001\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0005\bá\u0001\u00107J\u0012\u0010â\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bã\u0001J\u0012\u0010ä\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bå\u0001J\u0012\u0010æ\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bç\u0001J\u0012\u0010è\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bé\u0001J\u0012\u0010ê\u0001\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0003\bë\u0001J\u009a\u0004\u0010ì\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010+2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0003\u0010í\u0001J\u0015\u0010î\u0001\u001a\u00020\u00192\t\u0010ï\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ð\u0001\u001a\u00020\u0011HÖ\u0001J\u000f\u0010ñ\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u000f\u0010ò\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010ó\u0001\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010õ\u0001\u001a\u00020\u00002\u0007\u0010ö\u0001\u001a\u00020\u0011J\u0010\u0010÷\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0019J\u000f\u0010ù\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010ú\u0001\u001a\u00020\u00002\r\u0010û\u0001\u001a\b\u0012\u0004\u0012\u0002010+J\u0015\u0010ü\u0001\u001a\u00020\u00002\f\u0010ý\u0001\u001a\u0007\u0012\u0002\b\u00030þ\u0001J\u000f\u0010ÿ\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0080\u0002\u001a\u00020\u00002\u0007\u0010\u0081\u0002\u001a\u00020\u0004J\u0010\u0010\u0082\u0002\u001a\u00020\u00002\u0007\u0010\u0083\u0002\u001a\u00020\u0004J\u0015\u0010\u0084\u0002\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+J\u0010\u0010\u0085\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0017\u0010\u0086\u0002\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J\u0012\u0010\u0087\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019H\u0007J\u0010\u0010\u0088\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u0089\u0002\u001a\u00020\u00002\u0007\u0010\u008a\u0002\u001a\u00020\u0004J\u0010\u0010\u008b\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u008c\u0002\u001a\u00020\u00002\u0007\u0010\u008d\u0002\u001a\u00020\u0011J\u0010\u0010\u008e\u0002\u001a\u00020\u00002\u0007\u0010\u008f\u0002\u001a\u00020\u0011J\u000f\u0010\u0090\u0002\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u0091\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u0092\u0002\u001a\u00020\u00002\u0007\u0010\u0093\u0002\u001a\u00020\u0011J\u0010\u0010\u0094\u0002\u001a\u00020\u00002\u0007\u0010\u0095\u0002\u001a\u00020\u0019J\u0010\u0010\u0096\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u0097\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u0098\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u0099\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u000f\u0010\u009a\u0002\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0019J\u0010\u0010\u009b\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0010\u0010\u009c\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u000f\u0010\u009d\u0002\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0019J\u0010\u0010\u009e\u0002\u001a\u00020\u00002\u0007\u0010\u009f\u0002\u001a\u00020\u0019J\u000f\u0010 \u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010¡\u0002\u001a\u00020\u00002\u0007\u0010¢\u0002\u001a\u00020\u0019J\u0015\u0010£\u0002\u001a\u00020\u00002\f\u0010¤\u0002\u001a\u0007\u0012\u0002\b\u00030þ\u0001J\u0010\u0010¥\u0002\u001a\u00020\u00002\u0007\u0010¦\u0002\u001a\u00020\u0019J\u0010\u0010§\u0002\u001a\u00020\u00002\u0007\u0010ô\u0001\u001a\u00020\u0019J\u0011\u0010¨\u0002\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010©\u0002\u001a\u00020\u00002\u000f\u0010ª\u0002\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010+J\u000f\u0010«\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010¬\u0002\u001a\u00020\u00002\u0007\u0010\u00ad\u0002\u001a\u00020\u0011J\u000f\u0010®\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004J\u000f\u0010¯\u0002\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011J\n\u0010°\u0002\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010&\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b?\u00107\"\u0004\b@\u00109R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010+X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010<\"\u0004\bK\u0010>R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R\"\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010G\"\u0004\bO\u0010IR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010DR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010<\"\u0004\bU\u0010>R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010G\"\u0004\bW\u0010IR\u001e\u00104\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bX\u00107\"\u0004\bY\u00109R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010>R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\b\\\u0010B\"\u0004\b]\u0010DR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b`\u00107\"\u0004\ba\u00109R\u001e\u0010%\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bb\u00107\"\u0004\bc\u00109R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bd\u0010B\"\u0004\be\u0010DR\u001e\u0010 \u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bf\u00107\"\u0004\bg\u00109R\u001e\u0010-\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bh\u00107\"\u0004\bi\u00109R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bj\u00107\"\u0004\bk\u00109R\u001e\u0010'\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bl\u00107\"\u0004\bm\u00109R\u001e\u0010$\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bn\u00107\"\u0004\bo\u00109R\u001e\u00102\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bp\u00107\"\u0004\bq\u00109R\u001e\u00103\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\br\u00107\"\u0004\bs\u00109R\u001e\u0010!\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bt\u00107\"\u0004\bu\u00109R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bv\u00107\"\u0004\bw\u00109R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bx\u00107\"\u0004\by\u00109R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\bz\u00107\"\u0004\b{\u00109R\u001e\u0010#\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b|\u00107\"\u0004\b}\u00109R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b~\u00107\"\u0004\b\u007f\u00109R \u0010)\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0012\n\u0002\u0010:\u001a\u0005\b\u0080\u0001\u00107\"\u0005\b\u0081\u0001\u00109R \u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0012\n\u0002\u0010:\u001a\u0005\b\u0082\u0001\u00107\"\u0005\b\u0083\u0001\u00109R \u0010(\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0012\n\u0002\u0010:\u001a\u0005\b\u0084\u0001\u00107\"\u0005\b\u0085\u0001\u00109R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010<\"\u0005\b\u0087\u0001\u0010>R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010<\"\u0005\b\u0089\u0001\u0010>R \u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010<\"\u0005\b\u008f\u0001\u0010>R \u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0012\n\u0002\u0010E\u001a\u0005\b\u0090\u0001\u0010B\"\u0005\b\u0091\u0001\u0010DR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010<\"\u0005\b\u0093\u0001\u0010>R \u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0012\n\u0002\u0010E\u001a\u0005\b\u0094\u0001\u0010B\"\u0005\b\u0095\u0001\u0010D¨\u0006±\u0002"}, d2 = {"Lcom/braze/configuration/BrazeConfig$Builder;", "", "()V", "apiKey", "", "serverTarget", "smallNotificationIconName", "largeNotificationIconName", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "sessionTimeout", "", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "admMessagingRegistrationEnabled", "", "handlePushDeepLinksAutomatically", "isLocationCollectionEnabled", "isNewsFeedVisualIndicatorOn", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "isGeofencesEnabled", "inAppMessageTestPushEagerDisplayEnabled", "automaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isSdkAuthEnabled", "deviceObjectAllowlist", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "isDeviceObjectAllowlistEnabled", "brazeSdkMetadata", "Lcom/braze/enums/BrazeSdkMetadata;", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAdmMessagingRegistrationEnabled$android_sdk_base_release", "()Ljava/lang/Boolean;", "setAdmMessagingRegistrationEnabled$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getApiKey$android_sdk_base_release", "()Ljava/lang/String;", "setApiKey$android_sdk_base_release", "(Ljava/lang/String;)V", "getAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "setAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "getBadNetworkInterval$android_sdk_base_release", "()Ljava/lang/Integer;", "setBadNetworkInterval$android_sdk_base_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBrazeSdkMetadata$android_sdk_base_release", "()Ljava/util/EnumSet;", "setBrazeSdkMetadata$android_sdk_base_release", "(Ljava/util/EnumSet;)V", "getCustomEndpoint$android_sdk_base_release", "setCustomEndpoint$android_sdk_base_release", "getCustomHtmlWebViewActivityClassName$android_sdk_base_release", "setCustomHtmlWebViewActivityClassName$android_sdk_base_release", "getCustomLocationProviderNames$android_sdk_base_release", "setCustomLocationProviderNames$android_sdk_base_release", "getDefaultNotificationAccentColor$android_sdk_base_release", "setDefaultNotificationAccentColor$android_sdk_base_release", "getDefaultNotificationChannelDescription$android_sdk_base_release", "setDefaultNotificationChannelDescription$android_sdk_base_release", "getDefaultNotificationChannelName$android_sdk_base_release", "setDefaultNotificationChannelName$android_sdk_base_release", "getDeviceObjectAllowlist$android_sdk_base_release", "setDeviceObjectAllowlist$android_sdk_base_release", "getDoesPushStoryDismissOnClick$android_sdk_base_release", "setDoesPushStoryDismissOnClick$android_sdk_base_release", "getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "getGoodNetworkInterval$android_sdk_base_release", "setGoodNetworkInterval$android_sdk_base_release", "getGreatNetworkInterval$android_sdk_base_release", "setGreatNetworkInterval$android_sdk_base_release", "getHandlePushDeepLinksAutomatically$android_sdk_base_release", "setHandlePushDeepLinksAutomatically$android_sdk_base_release", "getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "isDeviceObjectAllowlistEnabled$android_sdk_base_release", "setDeviceObjectAllowlistEnabled$android_sdk_base_release", "isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "isGeofencesEnabled$android_sdk_base_release", "setGeofencesEnabled$android_sdk_base_release", "isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release", "setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release", "isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "isLocationCollectionEnabled$android_sdk_base_release", "setLocationCollectionEnabled$android_sdk_base_release", "isNewsFeedVisualIndicatorOn$android_sdk_base_release", "setNewsFeedVisualIndicatorOn$android_sdk_base_release", "isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "isPushHtmlRenderingEnabled$android_sdk_base_release", "setPushHtmlRenderingEnabled$android_sdk_base_release", "isPushWakeScreenForNotificationEnabled$android_sdk_base_release", "setPushWakeScreenForNotificationEnabled$android_sdk_base_release", "isSdkAuthEnabled$android_sdk_base_release", "setSdkAuthEnabled$android_sdk_base_release", "isSessionStartBasedTimeoutEnabled$android_sdk_base_release", "setSessionStartBasedTimeoutEnabled$android_sdk_base_release", "isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "getLargeNotificationIconName$android_sdk_base_release", "setLargeNotificationIconName$android_sdk_base_release", "getPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "setPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "getSdkFlavor$android_sdk_base_release", "()Lcom/braze/enums/SdkFlavor;", "setSdkFlavor$android_sdk_base_release", "(Lcom/braze/enums/SdkFlavor;)V", "getServerTarget$android_sdk_base_release", "setServerTarget$android_sdk_base_release", "getSessionTimeout$android_sdk_base_release", "setSessionTimeout$android_sdk_base_release", "getSmallNotificationIconName$android_sdk_base_release", "setSmallNotificationIconName$android_sdk_base_release", "getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", OperatingSystem.JsonKeys.BUILD, "Lcom/braze/configuration/BrazeConfig;", "component1", "component1$android_sdk_base_release", "component10", "component10$android_sdk_base_release", "component11", "component11$android_sdk_base_release", "component12", "component12$android_sdk_base_release", "component13", "component13$android_sdk_base_release", "component14", "component14$android_sdk_base_release", "component15", "component15$android_sdk_base_release", "component16", "component16$android_sdk_base_release", "component17", "component17$android_sdk_base_release", "component18", "component18$android_sdk_base_release", "component19", "component19$android_sdk_base_release", "component2", "component2$android_sdk_base_release", "component20", "component20$android_sdk_base_release", "component21", "component21$android_sdk_base_release", "component22", "component22$android_sdk_base_release", "component23", "component23$android_sdk_base_release", "component24", "component24$android_sdk_base_release", "component25", "component25$android_sdk_base_release", "component26", "component26$android_sdk_base_release", "component27", "component27$android_sdk_base_release", "component28", "component28$android_sdk_base_release", "component29", "component29$android_sdk_base_release", "component3", "component3$android_sdk_base_release", "component30", "component30$android_sdk_base_release", "component31", "component31$android_sdk_base_release", "component32", "component32$android_sdk_base_release", "component33", "component33$android_sdk_base_release", "component34", "component34$android_sdk_base_release", "component35", "component35$android_sdk_base_release", "component36", "component36$android_sdk_base_release", "component37", "component37$android_sdk_base_release", "component38", "component38$android_sdk_base_release", "component39", "component39$android_sdk_base_release", "component4", "component4$android_sdk_base_release", "component40", "component40$android_sdk_base_release", "component41", "component41$android_sdk_base_release", "component42", "component42$android_sdk_base_release", "component5", "component5$android_sdk_base_release", "component6", "component6$android_sdk_base_release", "component7", "component7$android_sdk_base_release", "component8", "component8$android_sdk_base_release", "component9", "component9$android_sdk_base_release", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/braze/configuration/BrazeConfig$Builder;", "equals", "other", "hashCode", "setAdmMessagingRegistrationEnabled", "setApiKey", "setAutomaticGeofenceRequestsEnabled", "enabled", "setBadNetworkDataFlushInterval", "badNetworkIntervalSeconds", "setContentCardsUnreadVisualIndicatorEnabled", "contentCardsUnreadVisualIndicatorEnabled", "setCustomEndpoint", "setCustomLocationProviderNames", "locationProviderNames", "setCustomWebViewActivityClass", "customWebViewActivityClass", "Ljava/lang/Class;", "setDefaultNotificationAccentColor", "setDefaultNotificationChannelDescription", "description", "setDefaultNotificationChannelName", "name", "setDeviceObjectAllowlist", "setDeviceObjectAllowlistEnabled", "setDeviceObjectWhitelist", "setDeviceObjectWhitelistEnabled", "setDoesPushStoryDismissOnClick", "setFirebaseCloudMessagingSenderIdKey", "firebaseSenderId", "setGeofencesEnabled", "setGoodNetworkDataFlushInterval", "goodNetworkIntervalSeconds", "setGreatNetworkDataFlushInterval", "greatNetworkIntervalSeconds", "setHandlePushDeepLinksAutomatically", "setInAppMessageTestPushEagerDisplayEnabled", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs", "maxOnPageFinishedWaitMs", "setIsFirebaseCloudMessagingRegistrationEnabled", "firebaseMessagingRegistrationEnabled", "setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "setIsHtmlInAppMessageApplyWindowInsetsEnabled", "setIsHtmlInAppMessageHtmlLinkTargetEnabled", "setIsInAppMessageAccessibilityExclusiveModeEnabled", "setIsLocationCollectionEnabled", "setIsPushWakeScreenForNotificationEnabled", "setIsSdkAuthenticationEnabled", "setIsSessionStartBasedTimeoutEnabled", "setIsTouchModeRequiredForHtmlInAppMessages", "required", "setLargeNotificationIcon", "setNewsfeedVisualIndicatorOn", "newsfeedVisualIndicatorOn", "setPushDeepLinkBackStackActivityClass", "pushDeepLinkActivityClass", "setPushDeepLinkBackStackActivityEnabled", "pushDeepLinkBackStackActivityEnabled", "setPushHtmlRenderingEnabled", "setSdkFlavor", "setSdkMetadata", "sdkMetadata", "setServerTarget", "setSessionTimeout", "sessionTimeoutSeconds", "setSmallNotificationIcon", "setTriggerActionMinimumTimeIntervalSeconds", "toString", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isLocationCollectionEnabled;
        private Boolean isNewsFeedVisualIndicatorOn;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Braze API key to blank string. API key field not set";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Braze default NotificationChannel description to null or blank string. NotificationChannel description field not set.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Braze default NotificationChannel name to blank string. NotificationChannel name field not set.";
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
                return "Cannot set Firebase Cloud Messaging Sender Id to blank string. Firebase Cloud Messaging Sender Id field not set";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(int i) {
                super(0);
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: ", Integer.valueOf(this.b));
            }
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool19, Boolean bool20, Boolean bool21) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isLocationCollectionEnabled = bool3;
            this.isNewsFeedVisualIndicatorOn = bool4;
            this.isPushDeepLinkBackStackActivityEnabled = bool5;
            this.isSessionStartBasedTimeoutEnabled = bool6;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool7;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool8;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool9;
            this.isPushWakeScreenForNotificationEnabled = bool10;
            this.isPushHtmlRenderingEnabled = bool11;
            this.isGeofencesEnabled = bool12;
            this.inAppMessageTestPushEagerDisplayEnabled = bool13;
            this.automaticGeofenceRequestsEnabled = bool14;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool15;
            this.isTouchModeRequiredForHtmlInAppMessages = bool16;
            this.isSdkAuthEnabled = bool17;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool18;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool19;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool20;
            this.doesPushStoryDismissOnClick = bool21;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, int i, int i2, Object obj) {
            String str11 = (i & 1) != 0 ? builder.apiKey : str;
            return builder.copy(str11, (i & 2) != 0 ? builder.serverTarget : str2, (i & 4) != 0 ? builder.smallNotificationIconName : str3, (i & 8) != 0 ? builder.largeNotificationIconName : str4, (i & 16) != 0 ? builder.customEndpoint : str5, (i & 32) != 0 ? builder.defaultNotificationChannelName : str6, (i & 64) != 0 ? builder.defaultNotificationChannelDescription : str7, (i & 128) != 0 ? builder.pushDeepLinkBackStackActivityClassName : str8, (i & 256) != 0 ? builder.firebaseCloudMessagingSenderIdKey : str9, (i & 512) != 0 ? builder.customHtmlWebViewActivityClassName : str10, (i & 1024) != 0 ? builder.sdkFlavor : sdkFlavor, (i & 2048) != 0 ? builder.sessionTimeout : num, (i & 4096) != 0 ? builder.defaultNotificationAccentColor : num2, (i & 8192) != 0 ? builder.triggerActionMinimumTimeIntervalSeconds : num3, (i & 16384) != 0 ? builder.badNetworkInterval : num4, (i & 32768) != 0 ? builder.goodNetworkInterval : num5, (i & 65536) != 0 ? builder.greatNetworkInterval : num6, (i & 131072) != 0 ? builder.inAppMessageWebViewClientMaxOnPageFinishedWaitMs : num7, (i & 262144) != 0 ? builder.admMessagingRegistrationEnabled : bool, (i & 524288) != 0 ? builder.handlePushDeepLinksAutomatically : bool2, (i & 1048576) != 0 ? builder.isLocationCollectionEnabled : bool3, (i & 2097152) != 0 ? builder.isNewsFeedVisualIndicatorOn : bool4, (i & 4194304) != 0 ? builder.isPushDeepLinkBackStackActivityEnabled : bool5, (i & 8388608) != 0 ? builder.isSessionStartBasedTimeoutEnabled : bool6, (i & 16777216) != 0 ? builder.isFirebaseCloudMessagingRegistrationEnabled : bool7, (i & 33554432) != 0 ? builder.isContentCardsUnreadVisualIndicatorEnabled : bool8, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? builder.isInAppMessageAccessibilityExclusiveModeEnabled : bool9, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? builder.isPushWakeScreenForNotificationEnabled : bool10, (i & 268435456) != 0 ? builder.isPushHtmlRenderingEnabled : bool11, (i & 536870912) != 0 ? builder.isGeofencesEnabled : bool12, (i & 1073741824) != 0 ? builder.inAppMessageTestPushEagerDisplayEnabled : bool13, (i & Integer.MIN_VALUE) != 0 ? builder.automaticGeofenceRequestsEnabled : bool14, (i2 & 1) != 0 ? builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled : bool15, (i2 & 2) != 0 ? builder.isTouchModeRequiredForHtmlInAppMessages : bool16, (i2 & 4) != 0 ? builder.isSdkAuthEnabled : bool17, (i2 & 8) != 0 ? builder.deviceObjectAllowlist : enumSet, (i2 & 16) != 0 ? builder.isDeviceObjectAllowlistEnabled : bool18, (i2 & 32) != 0 ? builder.brazeSdkMetadata : enumSet2, (i2 & 64) != 0 ? builder.customLocationProviderNames : enumSet3, (i2 & 128) != 0 ? builder.isHtmlInAppMessageApplyWindowInsetsEnabled : bool19, (i2 & 256) != 0 ? builder.isHtmlInAppMessageHtmlLinkTargetEnabled : bool20, (i2 & 512) != 0 ? builder.doesPushStoryDismissOnClick : bool21);
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        /* renamed from: component1$android_sdk_base_release, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* renamed from: component10$android_sdk_base_release, reason: from getter */
        public final String getCustomHtmlWebViewActivityClassName() {
            return this.customHtmlWebViewActivityClassName;
        }

        /* renamed from: component11$android_sdk_base_release, reason: from getter */
        public final SdkFlavor getSdkFlavor() {
            return this.sdkFlavor;
        }

        /* renamed from: component12$android_sdk_base_release, reason: from getter */
        public final Integer getSessionTimeout() {
            return this.sessionTimeout;
        }

        /* renamed from: component13$android_sdk_base_release, reason: from getter */
        public final Integer getDefaultNotificationAccentColor() {
            return this.defaultNotificationAccentColor;
        }

        /* renamed from: component14$android_sdk_base_release, reason: from getter */
        public final Integer getTriggerActionMinimumTimeIntervalSeconds() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        /* renamed from: component15$android_sdk_base_release, reason: from getter */
        public final Integer getBadNetworkInterval() {
            return this.badNetworkInterval;
        }

        /* renamed from: component16$android_sdk_base_release, reason: from getter */
        public final Integer getGoodNetworkInterval() {
            return this.goodNetworkInterval;
        }

        /* renamed from: component17$android_sdk_base_release, reason: from getter */
        public final Integer getGreatNetworkInterval() {
            return this.greatNetworkInterval;
        }

        /* renamed from: component18$android_sdk_base_release, reason: from getter */
        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        /* renamed from: component19$android_sdk_base_release, reason: from getter */
        public final Boolean getAdmMessagingRegistrationEnabled() {
            return this.admMessagingRegistrationEnabled;
        }

        /* renamed from: component2$android_sdk_base_release, reason: from getter */
        public final String getServerTarget() {
            return this.serverTarget;
        }

        /* renamed from: component20$android_sdk_base_release, reason: from getter */
        public final Boolean getHandlePushDeepLinksAutomatically() {
            return this.handlePushDeepLinksAutomatically;
        }

        /* renamed from: component21$android_sdk_base_release, reason: from getter */
        public final Boolean getIsLocationCollectionEnabled() {
            return this.isLocationCollectionEnabled;
        }

        /* renamed from: component22$android_sdk_base_release, reason: from getter */
        public final Boolean getIsNewsFeedVisualIndicatorOn() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        /* renamed from: component23$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushDeepLinkBackStackActivityEnabled() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        /* renamed from: component24$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSessionStartBasedTimeoutEnabled() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        /* renamed from: component25$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseCloudMessagingRegistrationEnabled() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        /* renamed from: component26$android_sdk_base_release, reason: from getter */
        public final Boolean getIsContentCardsUnreadVisualIndicatorEnabled() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        /* renamed from: component27$android_sdk_base_release, reason: from getter */
        public final Boolean getIsInAppMessageAccessibilityExclusiveModeEnabled() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        /* renamed from: component28$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushWakeScreenForNotificationEnabled() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        /* renamed from: component29$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushHtmlRenderingEnabled() {
            return this.isPushHtmlRenderingEnabled;
        }

        /* renamed from: component3$android_sdk_base_release, reason: from getter */
        public final String getSmallNotificationIconName() {
            return this.smallNotificationIconName;
        }

        /* renamed from: component30$android_sdk_base_release, reason: from getter */
        public final Boolean getIsGeofencesEnabled() {
            return this.isGeofencesEnabled;
        }

        /* renamed from: component31$android_sdk_base_release, reason: from getter */
        public final Boolean getInAppMessageTestPushEagerDisplayEnabled() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        /* renamed from: component32$android_sdk_base_release, reason: from getter */
        public final Boolean getAutomaticGeofenceRequestsEnabled() {
            return this.automaticGeofenceRequestsEnabled;
        }

        /* renamed from: component33$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        /* renamed from: component34$android_sdk_base_release, reason: from getter */
        public final Boolean getIsTouchModeRequiredForHtmlInAppMessages() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        /* renamed from: component35$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSdkAuthEnabled() {
            return this.isSdkAuthEnabled;
        }

        public final EnumSet<DeviceKey> component36$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        /* renamed from: component37$android_sdk_base_release, reason: from getter */
        public final Boolean getIsDeviceObjectAllowlistEnabled() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final EnumSet<BrazeSdkMetadata> component38$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final EnumSet<LocationProviderName> component39$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        /* renamed from: component4$android_sdk_base_release, reason: from getter */
        public final String getLargeNotificationIconName() {
            return this.largeNotificationIconName;
        }

        /* renamed from: component40$android_sdk_base_release, reason: from getter */
        public final Boolean getIsHtmlInAppMessageApplyWindowInsetsEnabled() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        /* renamed from: component41$android_sdk_base_release, reason: from getter */
        public final Boolean getIsHtmlInAppMessageHtmlLinkTargetEnabled() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        /* renamed from: component42$android_sdk_base_release, reason: from getter */
        public final Boolean getDoesPushStoryDismissOnClick() {
            return this.doesPushStoryDismissOnClick;
        }

        /* renamed from: component5$android_sdk_base_release, reason: from getter */
        public final String getCustomEndpoint() {
            return this.customEndpoint;
        }

        /* renamed from: component6$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelName() {
            return this.defaultNotificationChannelName;
        }

        /* renamed from: component7$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelDescription() {
            return this.defaultNotificationChannelDescription;
        }

        /* renamed from: component8$android_sdk_base_release, reason: from getter */
        public final String getPushDeepLinkBackStackActivityClassName() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        /* renamed from: component9$android_sdk_base_release, reason: from getter */
        public final String getFirebaseCloudMessagingSenderIdKey() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Builder copy(String apiKey, String serverTarget, String smallNotificationIconName, String largeNotificationIconName, String customEndpoint, String defaultNotificationChannelName, String defaultNotificationChannelDescription, String pushDeepLinkBackStackActivityClassName, String firebaseCloudMessagingSenderIdKey, String customHtmlWebViewActivityClassName, SdkFlavor sdkFlavor, Integer sessionTimeout, Integer defaultNotificationAccentColor, Integer triggerActionMinimumTimeIntervalSeconds, Integer badNetworkInterval, Integer goodNetworkInterval, Integer greatNetworkInterval, Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs, Boolean admMessagingRegistrationEnabled, Boolean handlePushDeepLinksAutomatically, Boolean isLocationCollectionEnabled, Boolean isNewsFeedVisualIndicatorOn, Boolean isPushDeepLinkBackStackActivityEnabled, Boolean isSessionStartBasedTimeoutEnabled, Boolean isFirebaseCloudMessagingRegistrationEnabled, Boolean isContentCardsUnreadVisualIndicatorEnabled, Boolean isInAppMessageAccessibilityExclusiveModeEnabled, Boolean isPushWakeScreenForNotificationEnabled, Boolean isPushHtmlRenderingEnabled, Boolean isGeofencesEnabled, Boolean inAppMessageTestPushEagerDisplayEnabled, Boolean automaticGeofenceRequestsEnabled, Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled, Boolean isTouchModeRequiredForHtmlInAppMessages, Boolean isSdkAuthEnabled, EnumSet<DeviceKey> deviceObjectAllowlist, Boolean isDeviceObjectAllowlistEnabled, EnumSet<BrazeSdkMetadata> brazeSdkMetadata, EnumSet<LocationProviderName> customLocationProviderNames, Boolean isHtmlInAppMessageApplyWindowInsetsEnabled, Boolean isHtmlInAppMessageHtmlLinkTargetEnabled, Boolean doesPushStoryDismissOnClick) {
            return new Builder(apiKey, serverTarget, smallNotificationIconName, largeNotificationIconName, customEndpoint, defaultNotificationChannelName, defaultNotificationChannelDescription, pushDeepLinkBackStackActivityClassName, firebaseCloudMessagingSenderIdKey, customHtmlWebViewActivityClassName, sdkFlavor, sessionTimeout, defaultNotificationAccentColor, triggerActionMinimumTimeIntervalSeconds, badNetworkInterval, goodNetworkInterval, greatNetworkInterval, inAppMessageWebViewClientMaxOnPageFinishedWaitMs, admMessagingRegistrationEnabled, handlePushDeepLinksAutomatically, isLocationCollectionEnabled, isNewsFeedVisualIndicatorOn, isPushDeepLinkBackStackActivityEnabled, isSessionStartBasedTimeoutEnabled, isFirebaseCloudMessagingRegistrationEnabled, isContentCardsUnreadVisualIndicatorEnabled, isInAppMessageAccessibilityExclusiveModeEnabled, isPushWakeScreenForNotificationEnabled, isPushHtmlRenderingEnabled, isGeofencesEnabled, inAppMessageTestPushEagerDisplayEnabled, automaticGeofenceRequestsEnabled, isFirebaseMessagingServiceOnNewTokenRegistrationEnabled, isTouchModeRequiredForHtmlInAppMessages, isSdkAuthEnabled, deviceObjectAllowlist, isDeviceObjectAllowlistEnabled, brazeSdkMetadata, customLocationProviderNames, isHtmlInAppMessageApplyWindowInsetsEnabled, isHtmlInAppMessageHtmlLinkTargetEnabled, doesPushStoryDismissOnClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.apiKey, builder.apiKey) && Intrinsics.areEqual(this.serverTarget, builder.serverTarget) && Intrinsics.areEqual(this.smallNotificationIconName, builder.smallNotificationIconName) && Intrinsics.areEqual(this.largeNotificationIconName, builder.largeNotificationIconName) && Intrinsics.areEqual(this.customEndpoint, builder.customEndpoint) && Intrinsics.areEqual(this.defaultNotificationChannelName, builder.defaultNotificationChannelName) && Intrinsics.areEqual(this.defaultNotificationChannelDescription, builder.defaultNotificationChannelDescription) && Intrinsics.areEqual(this.pushDeepLinkBackStackActivityClassName, builder.pushDeepLinkBackStackActivityClassName) && Intrinsics.areEqual(this.firebaseCloudMessagingSenderIdKey, builder.firebaseCloudMessagingSenderIdKey) && Intrinsics.areEqual(this.customHtmlWebViewActivityClassName, builder.customHtmlWebViewActivityClassName) && this.sdkFlavor == builder.sdkFlavor && Intrinsics.areEqual(this.sessionTimeout, builder.sessionTimeout) && Intrinsics.areEqual(this.defaultNotificationAccentColor, builder.defaultNotificationAccentColor) && Intrinsics.areEqual(this.triggerActionMinimumTimeIntervalSeconds, builder.triggerActionMinimumTimeIntervalSeconds) && Intrinsics.areEqual(this.badNetworkInterval, builder.badNetworkInterval) && Intrinsics.areEqual(this.goodNetworkInterval, builder.goodNetworkInterval) && Intrinsics.areEqual(this.greatNetworkInterval, builder.greatNetworkInterval) && Intrinsics.areEqual(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs, builder.inAppMessageWebViewClientMaxOnPageFinishedWaitMs) && Intrinsics.areEqual(this.admMessagingRegistrationEnabled, builder.admMessagingRegistrationEnabled) && Intrinsics.areEqual(this.handlePushDeepLinksAutomatically, builder.handlePushDeepLinksAutomatically) && Intrinsics.areEqual(this.isLocationCollectionEnabled, builder.isLocationCollectionEnabled) && Intrinsics.areEqual(this.isNewsFeedVisualIndicatorOn, builder.isNewsFeedVisualIndicatorOn) && Intrinsics.areEqual(this.isPushDeepLinkBackStackActivityEnabled, builder.isPushDeepLinkBackStackActivityEnabled) && Intrinsics.areEqual(this.isSessionStartBasedTimeoutEnabled, builder.isSessionStartBasedTimeoutEnabled) && Intrinsics.areEqual(this.isFirebaseCloudMessagingRegistrationEnabled, builder.isFirebaseCloudMessagingRegistrationEnabled) && Intrinsics.areEqual(this.isContentCardsUnreadVisualIndicatorEnabled, builder.isContentCardsUnreadVisualIndicatorEnabled) && Intrinsics.areEqual(this.isInAppMessageAccessibilityExclusiveModeEnabled, builder.isInAppMessageAccessibilityExclusiveModeEnabled) && Intrinsics.areEqual(this.isPushWakeScreenForNotificationEnabled, builder.isPushWakeScreenForNotificationEnabled) && Intrinsics.areEqual(this.isPushHtmlRenderingEnabled, builder.isPushHtmlRenderingEnabled) && Intrinsics.areEqual(this.isGeofencesEnabled, builder.isGeofencesEnabled) && Intrinsics.areEqual(this.inAppMessageTestPushEagerDisplayEnabled, builder.inAppMessageTestPushEagerDisplayEnabled) && Intrinsics.areEqual(this.automaticGeofenceRequestsEnabled, builder.automaticGeofenceRequestsEnabled) && Intrinsics.areEqual(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled, builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled) && Intrinsics.areEqual(this.isTouchModeRequiredForHtmlInAppMessages, builder.isTouchModeRequiredForHtmlInAppMessages) && Intrinsics.areEqual(this.isSdkAuthEnabled, builder.isSdkAuthEnabled) && Intrinsics.areEqual(this.deviceObjectAllowlist, builder.deviceObjectAllowlist) && Intrinsics.areEqual(this.isDeviceObjectAllowlistEnabled, builder.isDeviceObjectAllowlistEnabled) && Intrinsics.areEqual(this.brazeSdkMetadata, builder.brazeSdkMetadata) && Intrinsics.areEqual(this.customLocationProviderNames, builder.customLocationProviderNames) && Intrinsics.areEqual(this.isHtmlInAppMessageApplyWindowInsetsEnabled, builder.isHtmlInAppMessageApplyWindowInsetsEnabled) && Intrinsics.areEqual(this.isHtmlInAppMessageHtmlLinkTargetEnabled, builder.isHtmlInAppMessageHtmlLinkTargetEnabled) && Intrinsics.areEqual(this.doesPushStoryDismissOnClick, builder.doesPushStoryDismissOnClick);
        }

        public final Boolean getAdmMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String getApiKey$android_sdk_base_release() {
            return this.apiKey;
        }

        public final Boolean getAutomaticGeofenceRequestsEnabled$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Integer getBadNetworkInterval$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final String getCustomEndpoint$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String getCustomHtmlWebViewActivityClassName$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final Integer getDefaultNotificationAccentColor$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final String getDefaultNotificationChannelDescription$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String getDefaultNotificationChannelName$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean getDoesPushStoryDismissOnClick$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final String getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Integer getGoodNetworkInterval$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer getGreatNetworkInterval$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Boolean getHandlePushDeepLinksAutomatically$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final String getLargeNotificationIconName$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final String getPushDeepLinkBackStackActivityClassName$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final SdkFlavor getSdkFlavor$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final String getServerTarget$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Integer getSessionTimeout$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final String getSmallNotificationIconName$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Integer getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public int hashCode() {
            String str = this.apiKey;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.serverTarget;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.smallNotificationIconName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.largeNotificationIconName;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.customEndpoint;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.defaultNotificationChannelName;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.defaultNotificationChannelDescription;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.pushDeepLinkBackStackActivityClassName;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.firebaseCloudMessagingSenderIdKey;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.customHtmlWebViewActivityClassName;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            SdkFlavor sdkFlavor = this.sdkFlavor;
            int hashCode11 = (hashCode10 + (sdkFlavor == null ? 0 : sdkFlavor.hashCode())) * 31;
            Integer num = this.sessionTimeout;
            int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.defaultNotificationAccentColor;
            int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.triggerActionMinimumTimeIntervalSeconds;
            int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.badNetworkInterval;
            int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.goodNetworkInterval;
            int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.greatNetworkInterval;
            int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            int hashCode18 = (hashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool = this.admMessagingRegistrationEnabled;
            int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.handlePushDeepLinksAutomatically;
            int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isLocationCollectionEnabled;
            int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isNewsFeedVisualIndicatorOn;
            int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isPushDeepLinkBackStackActivityEnabled;
            int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isSessionStartBasedTimeoutEnabled;
            int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isFirebaseCloudMessagingRegistrationEnabled;
            int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.isContentCardsUnreadVisualIndicatorEnabled;
            int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.isInAppMessageAccessibilityExclusiveModeEnabled;
            int hashCode27 = (hashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.isPushWakeScreenForNotificationEnabled;
            int hashCode28 = (hashCode27 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.isPushHtmlRenderingEnabled;
            int hashCode29 = (hashCode28 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isGeofencesEnabled;
            int hashCode30 = (hashCode29 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.inAppMessageTestPushEagerDisplayEnabled;
            int hashCode31 = (hashCode30 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.automaticGeofenceRequestsEnabled;
            int hashCode32 = (hashCode31 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            int hashCode33 = (hashCode32 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isTouchModeRequiredForHtmlInAppMessages;
            int hashCode34 = (hashCode33 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.isSdkAuthEnabled;
            int hashCode35 = (hashCode34 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            EnumSet<DeviceKey> enumSet = this.deviceObjectAllowlist;
            int hashCode36 = (hashCode35 + (enumSet == null ? 0 : enumSet.hashCode())) * 31;
            Boolean bool18 = this.isDeviceObjectAllowlistEnabled;
            int hashCode37 = (hashCode36 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.brazeSdkMetadata;
            int hashCode38 = (hashCode37 + (enumSet2 == null ? 0 : enumSet2.hashCode())) * 31;
            EnumSet<LocationProviderName> enumSet3 = this.customLocationProviderNames;
            int hashCode39 = (hashCode38 + (enumSet3 == null ? 0 : enumSet3.hashCode())) * 31;
            Boolean bool19 = this.isHtmlInAppMessageApplyWindowInsetsEnabled;
            int hashCode40 = (hashCode39 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.isHtmlInAppMessageHtmlLinkTargetEnabled;
            int hashCode41 = (hashCode40 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.doesPushStoryDismissOnClick;
            return hashCode41 + (bool21 != null ? bool21.hashCode() : 0);
        }

        public final Boolean isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean isDeviceObjectAllowlistEnabled$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final Boolean isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean isGeofencesEnabled$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean isLocationCollectionEnabled$android_sdk_base_release() {
            return this.isLocationCollectionEnabled;
        }

        public final Boolean isNewsFeedVisualIndicatorOn$android_sdk_base_release() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        public final Boolean isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean isPushHtmlRenderingEnabled$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final Boolean isPushWakeScreenForNotificationEnabled$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean isSdkAuthEnabled$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final Boolean isSessionStartBasedTimeoutEnabled$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setAdmMessagingRegistrationEnabled(boolean admMessagingRegistrationEnabled) {
            setAdmMessagingRegistrationEnabled$android_sdk_base_release(Boolean.valueOf(admMessagingRegistrationEnabled));
            return this;
        }

        public final void setAdmMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.admMessagingRegistrationEnabled = bool;
        }

        public final Builder setApiKey(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            if (StringsKt.isBlank(apiKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return this;
            }
            this.apiKey = apiKey;
            return this;
        }

        public final void setApiKey$android_sdk_base_release(String str) {
            this.apiKey = str;
        }

        public final Builder setAutomaticGeofenceRequestsEnabled(boolean enabled) {
            setAutomaticGeofenceRequestsEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final void setAutomaticGeofenceRequestsEnabled$android_sdk_base_release(Boolean bool) {
            this.automaticGeofenceRequestsEnabled = bool;
        }

        public final Builder setBadNetworkDataFlushInterval(int badNetworkIntervalSeconds) {
            setBadNetworkInterval$android_sdk_base_release(Integer.valueOf(badNetworkIntervalSeconds));
            return this;
        }

        public final void setBadNetworkInterval$android_sdk_base_release(Integer num) {
            this.badNetworkInterval = num;
        }

        public final void setBrazeSdkMetadata$android_sdk_base_release(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
        }

        public final Builder setContentCardsUnreadVisualIndicatorEnabled(boolean contentCardsUnreadVisualIndicatorEnabled) {
            setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release(Boolean.valueOf(contentCardsUnreadVisualIndicatorEnabled));
            return this;
        }

        public final void setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release(Boolean bool) {
            this.isContentCardsUnreadVisualIndicatorEnabled = bool;
        }

        public final Builder setCustomEndpoint(String customEndpoint) {
            Intrinsics.checkNotNullParameter(customEndpoint, "customEndpoint");
            setCustomEndpoint$android_sdk_base_release(customEndpoint);
            return this;
        }

        public final void setCustomEndpoint$android_sdk_base_release(String str) {
            this.customEndpoint = str;
        }

        public final void setCustomHtmlWebViewActivityClassName$android_sdk_base_release(String str) {
            this.customHtmlWebViewActivityClassName = str;
        }

        public final Builder setCustomLocationProviderNames(EnumSet<LocationProviderName> locationProviderNames) {
            Intrinsics.checkNotNullParameter(locationProviderNames, "locationProviderNames");
            setCustomLocationProviderNames$android_sdk_base_release(locationProviderNames);
            return this;
        }

        public final void setCustomLocationProviderNames$android_sdk_base_release(EnumSet<LocationProviderName> enumSet) {
            this.customLocationProviderNames = enumSet;
        }

        public final Builder setCustomWebViewActivityClass(Class<?> customWebViewActivityClass) {
            Intrinsics.checkNotNullParameter(customWebViewActivityClass, "customWebViewActivityClass");
            setCustomHtmlWebViewActivityClassName$android_sdk_base_release(customWebViewActivityClass.getName());
            return this;
        }

        public final Builder setDefaultNotificationAccentColor(int defaultNotificationAccentColor) {
            setDefaultNotificationAccentColor$android_sdk_base_release(Integer.valueOf(defaultNotificationAccentColor));
            return this;
        }

        public final void setDefaultNotificationAccentColor$android_sdk_base_release(Integer num) {
            this.defaultNotificationAccentColor = num;
        }

        public final Builder setDefaultNotificationChannelDescription(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            if (StringsKt.isBlank(description)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                return this;
            }
            this.defaultNotificationChannelDescription = description;
            return this;
        }

        public final void setDefaultNotificationChannelDescription$android_sdk_base_release(String str) {
            this.defaultNotificationChannelDescription = str;
        }

        public final Builder setDefaultNotificationChannelName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (StringsKt.isBlank(name)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
                return this;
            }
            this.defaultNotificationChannelName = name;
            return this;
        }

        public final void setDefaultNotificationChannelName$android_sdk_base_release(String str) {
            this.defaultNotificationChannelName = str;
        }

        public final Builder setDeviceObjectAllowlist(EnumSet<DeviceKey> deviceObjectAllowlist) {
            Intrinsics.checkNotNullParameter(deviceObjectAllowlist, "deviceObjectAllowlist");
            setDeviceObjectAllowlist$android_sdk_base_release(deviceObjectAllowlist);
            return this;
        }

        public final void setDeviceObjectAllowlist$android_sdk_base_release(EnumSet<DeviceKey> enumSet) {
            this.deviceObjectAllowlist = enumSet;
        }

        public final Builder setDeviceObjectAllowlistEnabled(boolean enabled) {
            setDeviceObjectAllowlistEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final void setDeviceObjectAllowlistEnabled$android_sdk_base_release(Boolean bool) {
            this.isDeviceObjectAllowlistEnabled = bool;
        }

        @Deprecated(message = "Use {@link #setDeviceObjectAllowlist(EnumSet)}", replaceWith = @ReplaceWith(expression = "setDeviceObjectAllowlist", imports = {}))
        public final Builder setDeviceObjectWhitelist(EnumSet<DeviceKey> deviceObjectAllowlist) {
            Intrinsics.checkNotNullParameter(deviceObjectAllowlist, "deviceObjectAllowlist");
            return setDeviceObjectAllowlist(deviceObjectAllowlist);
        }

        @Deprecated(message = "Use {@link #setDeviceObjectAllowlistEnabled(boolean)}", replaceWith = @ReplaceWith(expression = "setDeviceObjectAllowlistEnabled", imports = {}))
        public final Builder setDeviceObjectWhitelistEnabled(boolean enabled) {
            return setDeviceObjectAllowlistEnabled(enabled);
        }

        public final Builder setDoesPushStoryDismissOnClick(boolean enabled) {
            setDoesPushStoryDismissOnClick$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final void setDoesPushStoryDismissOnClick$android_sdk_base_release(Boolean bool) {
            this.doesPushStoryDismissOnClick = bool;
        }

        public final void setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseCloudMessagingRegistrationEnabled = bool;
        }

        public final Builder setFirebaseCloudMessagingSenderIdKey(String firebaseSenderId) {
            Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
            if (StringsKt.isBlank(firebaseSenderId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
                return this;
            }
            this.firebaseCloudMessagingSenderIdKey = firebaseSenderId;
            return this;
        }

        public final void setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release(String str) {
            this.firebaseCloudMessagingSenderIdKey = str;
        }

        public final void setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool;
        }

        public final Builder setGeofencesEnabled(boolean enabled) {
            setGeofencesEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final void setGeofencesEnabled$android_sdk_base_release(Boolean bool) {
            this.isGeofencesEnabled = bool;
        }

        public final Builder setGoodNetworkDataFlushInterval(int goodNetworkIntervalSeconds) {
            setGoodNetworkInterval$android_sdk_base_release(Integer.valueOf(goodNetworkIntervalSeconds));
            return this;
        }

        public final void setGoodNetworkInterval$android_sdk_base_release(Integer num) {
            this.goodNetworkInterval = num;
        }

        public final Builder setGreatNetworkDataFlushInterval(int greatNetworkIntervalSeconds) {
            setGreatNetworkInterval$android_sdk_base_release(Integer.valueOf(greatNetworkIntervalSeconds));
            return this;
        }

        public final void setGreatNetworkInterval$android_sdk_base_release(Integer num) {
            this.greatNetworkInterval = num;
        }

        public final Builder setHandlePushDeepLinksAutomatically(boolean handlePushDeepLinksAutomatically) {
            setHandlePushDeepLinksAutomatically$android_sdk_base_release(Boolean.valueOf(handlePushDeepLinksAutomatically));
            return this;
        }

        public final void setHandlePushDeepLinksAutomatically$android_sdk_base_release(Boolean bool) {
            this.handlePushDeepLinksAutomatically = bool;
        }

        public final void setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool;
        }

        public final void setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool;
        }

        public final void setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release(Boolean bool) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool;
        }

        public final Builder setInAppMessageTestPushEagerDisplayEnabled(boolean enabled) {
            setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final void setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release(Boolean bool) {
            this.inAppMessageTestPushEagerDisplayEnabled = bool;
        }

        public final Builder setInAppMessageWebViewClientMaxOnPageFinishedWaitMs(int maxOnPageFinishedWaitMs) {
            if (maxOnPageFinishedWaitMs >= 0) {
                this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = Integer.valueOf(maxOnPageFinishedWaitMs);
                return this;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new e(maxOnPageFinishedWaitMs), 2, (Object) null);
            return this;
        }

        public final void setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release(Integer num) {
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num;
        }

        public final Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean firebaseMessagingRegistrationEnabled) {
            setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release(Boolean.valueOf(firebaseMessagingRegistrationEnabled));
            return this;
        }

        public final Builder setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(boolean enabled) {
            setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final Builder setIsHtmlInAppMessageApplyWindowInsetsEnabled(boolean enabled) {
            setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final Builder setIsHtmlInAppMessageHtmlLinkTargetEnabled(boolean enabled) {
            setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final Builder setIsInAppMessageAccessibilityExclusiveModeEnabled(boolean enabled) {
            setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final Builder setIsLocationCollectionEnabled(boolean isLocationCollectionEnabled) {
            setLocationCollectionEnabled$android_sdk_base_release(Boolean.valueOf(isLocationCollectionEnabled));
            return this;
        }

        public final Builder setIsPushWakeScreenForNotificationEnabled(boolean enabled) {
            setPushWakeScreenForNotificationEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final Builder setIsSdkAuthenticationEnabled(boolean enabled) {
            setSdkAuthEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final Builder setIsSessionStartBasedTimeoutEnabled(boolean isSessionStartBasedTimeoutEnabled) {
            setSessionStartBasedTimeoutEnabled$android_sdk_base_release(Boolean.valueOf(isSessionStartBasedTimeoutEnabled));
            return this;
        }

        public final Builder setIsTouchModeRequiredForHtmlInAppMessages(boolean required) {
            setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release(Boolean.valueOf(required));
            return this;
        }

        public final Builder setLargeNotificationIcon(String largeNotificationIconName) {
            Intrinsics.checkNotNullParameter(largeNotificationIconName, "largeNotificationIconName");
            setLargeNotificationIconName$android_sdk_base_release(largeNotificationIconName);
            return this;
        }

        public final void setLargeNotificationIconName$android_sdk_base_release(String str) {
            this.largeNotificationIconName = str;
        }

        public final void setLocationCollectionEnabled$android_sdk_base_release(Boolean bool) {
            this.isLocationCollectionEnabled = bool;
        }

        public final void setNewsFeedVisualIndicatorOn$android_sdk_base_release(Boolean bool) {
            this.isNewsFeedVisualIndicatorOn = bool;
        }

        public final Builder setNewsfeedVisualIndicatorOn(boolean newsfeedVisualIndicatorOn) {
            setNewsFeedVisualIndicatorOn$android_sdk_base_release(Boolean.valueOf(newsfeedVisualIndicatorOn));
            return this;
        }

        public final Builder setPushDeepLinkBackStackActivityClass(Class<?> pushDeepLinkActivityClass) {
            Intrinsics.checkNotNullParameter(pushDeepLinkActivityClass, "pushDeepLinkActivityClass");
            setPushDeepLinkBackStackActivityClassName$android_sdk_base_release(pushDeepLinkActivityClass.getName());
            return this;
        }

        public final void setPushDeepLinkBackStackActivityClassName$android_sdk_base_release(String str) {
            this.pushDeepLinkBackStackActivityClassName = str;
        }

        public final Builder setPushDeepLinkBackStackActivityEnabled(boolean pushDeepLinkBackStackActivityEnabled) {
            setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release(Boolean.valueOf(pushDeepLinkBackStackActivityEnabled));
            return this;
        }

        public final void setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushDeepLinkBackStackActivityEnabled = bool;
        }

        public final Builder setPushHtmlRenderingEnabled(boolean enabled) {
            setPushHtmlRenderingEnabled$android_sdk_base_release(Boolean.valueOf(enabled));
            return this;
        }

        public final void setPushHtmlRenderingEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushHtmlRenderingEnabled = bool;
        }

        public final void setPushWakeScreenForNotificationEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushWakeScreenForNotificationEnabled = bool;
        }

        public final void setSdkAuthEnabled$android_sdk_base_release(Boolean bool) {
            this.isSdkAuthEnabled = bool;
        }

        public final Builder setSdkFlavor(SdkFlavor sdkFlavor) {
            setSdkFlavor$android_sdk_base_release(sdkFlavor);
            return this;
        }

        public final void setSdkFlavor$android_sdk_base_release(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
        }

        public final Builder setSdkMetadata(EnumSet<BrazeSdkMetadata> sdkMetadata) {
            setBrazeSdkMetadata$android_sdk_base_release(sdkMetadata);
            return this;
        }

        public final Builder setServerTarget(String serverTarget) {
            Intrinsics.checkNotNullParameter(serverTarget, "serverTarget");
            setServerTarget$android_sdk_base_release(serverTarget);
            return this;
        }

        public final void setServerTarget$android_sdk_base_release(String str) {
            this.serverTarget = str;
        }

        public final void setSessionStartBasedTimeoutEnabled$android_sdk_base_release(Boolean bool) {
            this.isSessionStartBasedTimeoutEnabled = bool;
        }

        public final Builder setSessionTimeout(int sessionTimeoutSeconds) {
            setSessionTimeout$android_sdk_base_release(Integer.valueOf(sessionTimeoutSeconds));
            return this;
        }

        public final void setSessionTimeout$android_sdk_base_release(Integer num) {
            this.sessionTimeout = num;
        }

        public final Builder setSmallNotificationIcon(String smallNotificationIconName) {
            Intrinsics.checkNotNullParameter(smallNotificationIconName, "smallNotificationIconName");
            setSmallNotificationIconName$android_sdk_base_release(smallNotificationIconName);
            return this;
        }

        public final void setSmallNotificationIconName$android_sdk_base_release(String str) {
            this.smallNotificationIconName = str;
        }

        public final void setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release(Boolean bool) {
            this.isTouchModeRequiredForHtmlInAppMessages = bool;
        }

        public final Builder setTriggerActionMinimumTimeIntervalSeconds(int triggerActionMinimumTimeIntervalSeconds) {
            setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release(Integer.valueOf(triggerActionMinimumTimeIntervalSeconds));
            return this;
        }

        public final void setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release(Integer num) {
            this.triggerActionMinimumTimeIntervalSeconds = num;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder(apiKey=");
            sb.append((Object) this.apiKey).append(", serverTarget=").append((Object) this.serverTarget).append(", smallNotificationIconName=").append((Object) this.smallNotificationIconName).append(", largeNotificationIconName=").append((Object) this.largeNotificationIconName).append(", customEndpoint=").append((Object) this.customEndpoint).append(", defaultNotificationChannelName=").append((Object) this.defaultNotificationChannelName).append(", defaultNotificationChannelDescription=").append((Object) this.defaultNotificationChannelDescription).append(", pushDeepLinkBackStackActivityClassName=").append((Object) this.pushDeepLinkBackStackActivityClassName).append(", firebaseCloudMessagingSenderIdKey=").append((Object) this.firebaseCloudMessagingSenderIdKey).append(", customHtmlWebViewActivityClassName=").append((Object) this.customHtmlWebViewActivityClassName).append(", sdkFlavor=").append(this.sdkFlavor).append(", sessionTimeout=");
            sb.append(this.sessionTimeout).append(", defaultNotificationAccentColor=").append(this.defaultNotificationAccentColor).append(", triggerActionMinimumTimeIntervalSeconds=").append(this.triggerActionMinimumTimeIntervalSeconds).append(", badNetworkInterval=").append(this.badNetworkInterval).append(", goodNetworkInterval=").append(this.goodNetworkInterval).append(", greatNetworkInterval=").append(this.greatNetworkInterval).append(", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=").append(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs).append(", admMessagingRegistrationEnabled=").append(this.admMessagingRegistrationEnabled).append(", handlePushDeepLinksAutomatically=").append(this.handlePushDeepLinksAutomatically).append(", isLocationCollectionEnabled=").append(this.isLocationCollectionEnabled).append(", isNewsFeedVisualIndicatorOn=").append(this.isNewsFeedVisualIndicatorOn).append(", isPushDeepLinkBackStackActivityEnabled=").append(this.isPushDeepLinkBackStackActivityEnabled);
            sb.append(", isSessionStartBasedTimeoutEnabled=").append(this.isSessionStartBasedTimeoutEnabled).append(", isFirebaseCloudMessagingRegistrationEnabled=").append(this.isFirebaseCloudMessagingRegistrationEnabled).append(", isContentCardsUnreadVisualIndicatorEnabled=").append(this.isContentCardsUnreadVisualIndicatorEnabled).append(", isInAppMessageAccessibilityExclusiveModeEnabled=").append(this.isInAppMessageAccessibilityExclusiveModeEnabled).append(", isPushWakeScreenForNotificationEnabled=").append(this.isPushWakeScreenForNotificationEnabled).append(", isPushHtmlRenderingEnabled=").append(this.isPushHtmlRenderingEnabled).append(", isGeofencesEnabled=").append(this.isGeofencesEnabled).append(", inAppMessageTestPushEagerDisplayEnabled=").append(this.inAppMessageTestPushEagerDisplayEnabled).append(", automaticGeofenceRequestsEnabled=").append(this.automaticGeofenceRequestsEnabled).append(", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=").append(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled).append(", isTouchModeRequiredForHtmlInAppMessages=").append(this.isTouchModeRequiredForHtmlInAppMessages).append(", isSdkAuthEnabled=");
            sb.append(this.isSdkAuthEnabled).append(", deviceObjectAllowlist=").append(this.deviceObjectAllowlist).append(", isDeviceObjectAllowlistEnabled=").append(this.isDeviceObjectAllowlistEnabled).append(", brazeSdkMetadata=").append(this.brazeSdkMetadata).append(", customLocationProviderNames=").append(this.customLocationProviderNames).append(", isHtmlInAppMessageApplyWindowInsetsEnabled=").append(this.isHtmlInAppMessageApplyWindowInsetsEnabled).append(", isHtmlInAppMessageHtmlLinkTargetEnabled=").append(this.isHtmlInAppMessageHtmlLinkTargetEnabled).append(", doesPushStoryDismissOnClick=").append(this.doesPushStoryDismissOnClick).append(')');
            return sb.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(r40, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r3, r2, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r0, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : bool16, (i2 & 4) != 0 ? null : bool17, (i2 & 8) != 0 ? null : enumSet, (i2 & 16) != 0 ? null : bool18, (i2 & 32) != 0 ? null : enumSet2, (i2 & 64) != 0 ? null : enumSet3, (i2 & 128) != 0 ? null : bool19, (i2 & 256) != 0 ? null : bool20, (i2 & 512) != 0 ? null : bool21);
            String str11 = (i & 1) != 0 ? null : str;
            String str12 = (i & 2) != 0 ? null : str2;
            String str13 = (i & 4) != 0 ? null : str3;
            String str14 = (i & 8) != 0 ? null : str4;
            String str15 = (i & 16) != 0 ? null : str5;
            String str16 = (i & 32) != 0 ? null : str6;
            String str17 = (i & 64) != 0 ? null : str7;
            String str18 = (i & 128) != 0 ? null : str8;
            String str19 = (i & 256) != 0 ? null : str9;
            String str20 = (i & 512) != 0 ? null : str10;
            SdkFlavor sdkFlavor2 = (i & 1024) != 0 ? null : sdkFlavor;
            Integer num8 = (i & 2048) != 0 ? null : num;
            Integer num9 = (i & 4096) != 0 ? null : num2;
            Integer num10 = (i & 8192) != 0 ? null : num3;
            String str21 = str11;
            Integer num11 = (i & 16384) != 0 ? null : num4;
            Integer num12 = (i & 32768) != 0 ? null : num5;
            Integer num13 = (i & 65536) != 0 ? null : num6;
            Integer num14 = (i & 131072) != 0 ? null : num7;
            Boolean bool22 = (i & 262144) != 0 ? null : bool;
            Boolean bool23 = (i & 524288) != 0 ? null : bool2;
            Boolean bool24 = (i & 1048576) != 0 ? null : bool3;
            Boolean bool25 = (i & 2097152) != 0 ? null : bool4;
            Boolean bool26 = (i & 4194304) != 0 ? null : bool5;
            Boolean bool27 = (i & 8388608) != 0 ? null : bool6;
            Boolean bool28 = (i & 16777216) != 0 ? null : bool7;
            Boolean bool29 = (i & 33554432) != 0 ? null : bool8;
            Boolean bool30 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : bool9;
            Boolean bool31 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bool10;
            Boolean bool32 = (i & 268435456) != 0 ? null : bool11;
            Boolean bool33 = (i & 536870912) != 0 ? null : bool12;
            Boolean bool34 = (i & 1073741824) != 0 ? null : bool13;
            Boolean bool35 = (i & Integer.MIN_VALUE) != 0 ? null : bool14;
            String str22 = str12;
            String str23 = str13;
            String str24 = str14;
            String str25 = str15;
            String str26 = str16;
            String str27 = str17;
            String str28 = str18;
            String str29 = str19;
            String str30 = str20;
            SdkFlavor sdkFlavor3 = sdkFlavor2;
            Integer num15 = num8;
            Integer num16 = num9;
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023, null);
        }
    }
}
