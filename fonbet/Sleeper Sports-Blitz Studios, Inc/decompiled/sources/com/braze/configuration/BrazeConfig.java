package com.braze.configuration;

import androidx.media3.common.C;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001?B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010>\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010%\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010(\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010)\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010+\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010-\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0018\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0018\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00107\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00108\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u00109\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010;\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010<\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010=\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006@"}, d2 = {"Lcom/braze/configuration/BrazeConfig;", "", "builder", "Lcom/braze/configuration/BrazeConfig$Builder;", "<init>", "(Lcom/braze/configuration/BrazeConfig$Builder;)V", "apiKey", "", "serverTarget", "smallNotificationIcon", "largeNotificationIcon", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "sessionTimeout", "", "Ljava/lang/Integer;", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "isAdmMessagingRegistrationEnabled", "", "Ljava/lang/Boolean;", "willHandlePushDeepLinksAutomatically", "isAutomaticLocationCollectionEnabled", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "areGeofencesEnabled", "isInAppMessageTestPushEagerDisplayEnabled", "areAutomaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthEnabled", "isTouchModeRequiredForHtmlInAppMessages", "deviceObjectAllowlist", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "isDeviceObjectAllowlistEnabled", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "brazeSdkMetadata", "Lcom/braze/enums/BrazeSdkMetadata;", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "isFallbackFirebaseMessagingServiceEnabled", "fallbackFirebaseMessagingServiceClasspath", "shouldOptInWhenPushAuthorized", "shouldUseWindowFlagSecureInActivities", "shouldPersistWebViewWhenBackgroundingApp", "shouldAddStatusBarPaddingToInAppMessages", InAppPurchaseConstants.METHOD_TO_STRING, "Builder", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isAutomaticLocationCollectionEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
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
    public final Boolean shouldAddStatusBarPaddingToInAppMessages;
    public final Boolean shouldOptInWhenPushAuthorized;
    public final Boolean shouldPersistWebViewWhenBackgroundingApp;
    public final Boolean shouldUseWindowFlagSecureInActivities;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    public /* synthetic */ BrazeConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public String toString() {
        return this.builder.toString();
    }

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey();
        this.serverTarget = builder.getServerTarget();
        this.smallNotificationIcon = builder.getSmallNotificationIconName();
        this.largeNotificationIcon = builder.getLargeNotificationIconName();
        this.customEndpoint = builder.getCustomEndpoint();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName();
        this.sdkFlavor = builder.getSdkFlavor();
        this.sessionTimeout = builder.getSessionTimeout();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds();
        this.badNetworkInterval = builder.getBadNetworkInterval();
        this.goodNetworkInterval = builder.getGoodNetworkInterval();
        this.greatNetworkInterval = builder.getGreatNetworkInterval();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically();
        this.isAutomaticLocationCollectionEnabled = builder.getIsAutomaticLocationCollectionEnabled();
        this.isPushDeepLinkBackStackActivityEnabled = builder.getIsPushDeepLinkBackStackActivityEnabled();
        this.isSessionStartBasedTimeoutEnabled = builder.getIsSessionStartBasedTimeoutEnabled();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.getIsFirebaseCloudMessagingRegistrationEnabled();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.getIsContentCardsUnreadVisualIndicatorEnabled();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.getIsInAppMessageAccessibilityExclusiveModeEnabled();
        this.isPushWakeScreenForNotificationEnabled = builder.getIsPushWakeScreenForNotificationEnabled();
        this.isPushHtmlRenderingEnabled = builder.getIsPushHtmlRenderingEnabled();
        this.areGeofencesEnabled = builder.getIsGeofencesEnabled();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled();
        this.isSdkAuthEnabled = builder.getIsSdkAuthEnabled();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.getIsTouchModeRequiredForHtmlInAppMessages();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.getIsDeviceObjectAllowlistEnabled();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.getIsHtmlInAppMessageHtmlLinkTargetEnabled();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.getIsFallbackFirebaseMessagingServiceEnabled();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath();
        this.shouldOptInWhenPushAuthorized = builder.getShouldOptInWhenPushAuthorized();
        this.shouldUseWindowFlagSecureInActivities = builder.getShouldUseWindowFlagSecureInActivities();
        this.shouldPersistWebViewWhenBackgroundingApp = builder.getShouldPersistWebViewWhenBackgroundingApp();
        this.shouldAddStatusBarPaddingToInAppMessages = builder.getShouldAddStatusBarPaddingToInAppMessages();
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bt\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001BÃ\u0004\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010)\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010)\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b8\u00109B\t\b\u0016¢\u0006\u0004\b8\u0010:J\b\u0010£\u0001\u001a\u00030¤\u0001J\u000f\u0010¥\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010¦\u0001\u001a\u00020\u00002\u0007\u0010§\u0001\u001a\u00020\u0003J\u0010\u0010¨\u0001\u001a\u00020\u00002\u0007\u0010©\u0001\u001a\u00020\u0003J\u000f\u0010ª\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u0011\u0010«\u0001\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000f\u0010¬\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\u000f\u0010\u00ad\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003J\u000f\u0010®\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010°\u0001\u001a\u00020\u0010J\u000f\u0010±\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000f\u0010²\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010J\u000f\u0010³\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010´\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010µ\u0001\u001a\u00020\u00002\u0007\u0010¶\u0001\u001a\u00020\u0018J\u0015\u0010·\u0001\u001a\u00020\u00002\f\u0010¸\u0001\u001a\u0007\u0012\u0002\b\u00030¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0018J\u0010\u0010»\u0001\u001a\u00020\u00002\u0007\u0010¼\u0001\u001a\u00020\u0010J\u0010\u0010½\u0001\u001a\u00020\u00002\u0007\u0010¾\u0001\u001a\u00020\u0010J\u0010\u0010¿\u0001\u001a\u00020\u00002\u0007\u0010À\u0001\u001a\u00020\u0010J\u000f\u0010Á\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u0010Â\u0001\u001a\u00020\u00002\u0007\u0010Ã\u0001\u001a\u00020\u0018J\u0010\u0010Ä\u0001\u001a\u00020\u00002\u0007\u0010Å\u0001\u001a\u00020\u0003J\u0010\u0010Æ\u0001\u001a\u00020\u00002\u0007\u0010Ç\u0001\u001a\u00020\u0018J\u0015\u0010È\u0001\u001a\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u0010\u0010É\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Ë\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Ì\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Í\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Î\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Ï\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Ð\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0015\u0010Ñ\u0001\u001a\u00020\u00002\f\u0010Ò\u0001\u001a\u0007\u0012\u0002\b\u00030¹\u0001J\u0010\u0010Ó\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0016\u0010Ô\u0001\u001a\u00020\u00002\r\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020/0)J\u0010\u0010Ö\u0001\u001a\u00020\u00002\u0007\u0010×\u0001\u001a\u00020\u0010J\u0010\u0010Ø\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Ù\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010Ú\u0001\u001a\u00020\u00002\u0007\u0010Û\u0001\u001a\u00020\u0018J\u0010\u0010Ü\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0018\u0010Ý\u0001\u001a\u00020\u00002\u000f\u0010Þ\u0001\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010)J\u0010\u0010ß\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010à\u0001\u001a\u00020\u00002\u0007\u0010á\u0001\u001a\u00020\u0003J\u0010\u0010â\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010ã\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010ä\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\u0010\u0010å\u0001\u001a\u00020\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0018J\t\u0010æ\u0001\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010<\"\u0004\bL\u0010>R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\b\\\u0010V\"\u0004\b]\u0010XR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\b^\u0010V\"\u0004\b_\u0010XR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\b`\u0010V\"\u0004\ba\u0010XR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bb\u0010V\"\u0004\bc\u0010XR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bd\u0010V\"\u0004\be\u0010XR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bm\u0010g\"\u0004\bn\u0010iR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bo\u0010g\"\u0004\bp\u0010iR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bq\u0010g\"\u0004\br\u0010iR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bs\u0010g\"\u0004\bt\u0010iR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bu\u0010g\"\u0004\bv\u0010iR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\bw\u0010g\"\u0004\bx\u0010iR\u001e\u0010 \u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\by\u0010g\"\u0004\bz\u0010iR\u001e\u0010!\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\b{\u0010g\"\u0004\b|\u0010iR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010j\u001a\u0004\b}\u0010g\"\u0004\b~\u0010iR\u001f\u0010#\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0011\n\u0002\u0010j\u001a\u0004\b\u007f\u0010g\"\u0005\b\u0080\u0001\u0010iR \u0010$\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0081\u0001\u0010g\"\u0005\b\u0082\u0001\u0010iR \u0010%\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0083\u0001\u0010g\"\u0005\b\u0084\u0001\u0010iR \u0010&\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0085\u0001\u0010g\"\u0005\b\u0086\u0001\u0010iR \u0010'\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0087\u0001\u0010g\"\u0005\b\u0088\u0001\u0010iR&\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010+\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u008d\u0001\u0010g\"\u0005\b\u008e\u0001\u0010iR&\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010)X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001\"\u0006\b\u0090\u0001\u0010\u008c\u0001R&\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010)X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001\"\u0006\b\u0092\u0001\u0010\u008c\u0001R \u00100\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0093\u0001\u0010g\"\u0005\b\u0094\u0001\u0010iR \u00101\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0095\u0001\u0010g\"\u0005\b\u0096\u0001\u0010iR \u00102\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u0097\u0001\u0010g\"\u0005\b\u0098\u0001\u0010iR\u001e\u00103\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010<\"\u0005\b\u009a\u0001\u0010>R \u00104\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u009b\u0001\u0010g\"\u0005\b\u009c\u0001\u0010iR \u00105\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u009d\u0001\u0010g\"\u0005\b\u009e\u0001\u0010iR \u00106\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b\u009f\u0001\u0010g\"\u0005\b \u0001\u0010iR \u00107\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0012\n\u0002\u0010j\u001a\u0005\b¡\u0001\u0010g\"\u0005\b¢\u0001\u0010i¨\u0006ç\u0001"}, d2 = {"Lcom/braze/configuration/BrazeConfig$Builder;", "", "apiKey", "", "serverTarget", "smallNotificationIconName", "largeNotificationIconName", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "sessionTimeout", "", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "admMessagingRegistrationEnabled", "", "handlePushDeepLinksAutomatically", "isAutomaticLocationCollectionEnabled", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "isGeofencesEnabled", "inAppMessageTestPushEagerDisplayEnabled", "automaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isSdkAuthEnabled", "deviceObjectAllowlist", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "isDeviceObjectAllowlistEnabled", "brazeSdkMetadata", "Lcom/braze/enums/BrazeSdkMetadata;", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "isFallbackFirebaseMessagingServiceEnabled", "fallbackFirebaseMessagingServiceClasspath", "shouldOptInWhenPushAuthorized", "shouldUseWindowFlagSecureInActivities", "shouldPersistWebViewWhenBackgroundingApp", "shouldAddStatusBarPaddingToInAppMessages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()V", "getApiKey$android_sdk_base_release", "()Ljava/lang/String;", "setApiKey$android_sdk_base_release", "(Ljava/lang/String;)V", "getServerTarget$android_sdk_base_release", "setServerTarget$android_sdk_base_release", "getSmallNotificationIconName$android_sdk_base_release", "setSmallNotificationIconName$android_sdk_base_release", "getLargeNotificationIconName$android_sdk_base_release", "setLargeNotificationIconName$android_sdk_base_release", "getCustomEndpoint$android_sdk_base_release", "setCustomEndpoint$android_sdk_base_release", "getDefaultNotificationChannelName$android_sdk_base_release", "setDefaultNotificationChannelName$android_sdk_base_release", "getDefaultNotificationChannelDescription$android_sdk_base_release", "setDefaultNotificationChannelDescription$android_sdk_base_release", "getPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "setPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "getCustomHtmlWebViewActivityClassName$android_sdk_base_release", "setCustomHtmlWebViewActivityClassName$android_sdk_base_release", "getSdkFlavor$android_sdk_base_release", "()Lcom/braze/enums/SdkFlavor;", "setSdkFlavor$android_sdk_base_release", "(Lcom/braze/enums/SdkFlavor;)V", "getSessionTimeout$android_sdk_base_release", "()Ljava/lang/Integer;", "setSessionTimeout$android_sdk_base_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDefaultNotificationAccentColor$android_sdk_base_release", "setDefaultNotificationAccentColor$android_sdk_base_release", "getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "getBadNetworkInterval$android_sdk_base_release", "setBadNetworkInterval$android_sdk_base_release", "getGoodNetworkInterval$android_sdk_base_release", "setGoodNetworkInterval$android_sdk_base_release", "getGreatNetworkInterval$android_sdk_base_release", "setGreatNetworkInterval$android_sdk_base_release", "getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "getAdmMessagingRegistrationEnabled$android_sdk_base_release", "()Ljava/lang/Boolean;", "setAdmMessagingRegistrationEnabled$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHandlePushDeepLinksAutomatically$android_sdk_base_release", "setHandlePushDeepLinksAutomatically$android_sdk_base_release", "isAutomaticLocationCollectionEnabled$android_sdk_base_release", "setAutomaticLocationCollectionEnabled$android_sdk_base_release", "isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "isSessionStartBasedTimeoutEnabled$android_sdk_base_release", "setSessionStartBasedTimeoutEnabled$android_sdk_base_release", "isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "isPushWakeScreenForNotificationEnabled$android_sdk_base_release", "setPushWakeScreenForNotificationEnabled$android_sdk_base_release", "isPushHtmlRenderingEnabled$android_sdk_base_release", "setPushHtmlRenderingEnabled$android_sdk_base_release", "isGeofencesEnabled$android_sdk_base_release", "setGeofencesEnabled$android_sdk_base_release", "getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "getAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "setAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "isSdkAuthEnabled$android_sdk_base_release", "setSdkAuthEnabled$android_sdk_base_release", "getDeviceObjectAllowlist$android_sdk_base_release", "()Ljava/util/EnumSet;", "setDeviceObjectAllowlist$android_sdk_base_release", "(Ljava/util/EnumSet;)V", "isDeviceObjectAllowlistEnabled$android_sdk_base_release", "setDeviceObjectAllowlistEnabled$android_sdk_base_release", "getBrazeSdkMetadata$android_sdk_base_release", "setBrazeSdkMetadata$android_sdk_base_release", "getCustomLocationProviderNames$android_sdk_base_release", "setCustomLocationProviderNames$android_sdk_base_release", "isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "getDoesPushStoryDismissOnClick$android_sdk_base_release", "setDoesPushStoryDismissOnClick$android_sdk_base_release", "isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "getShouldOptInWhenPushAuthorized$android_sdk_base_release", "setShouldOptInWhenPushAuthorized$android_sdk_base_release", "getShouldUseWindowFlagSecureInActivities$android_sdk_base_release", "setShouldUseWindowFlagSecureInActivities$android_sdk_base_release", "getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release", "setShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release", "getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release", "setShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release", "build", "Lcom/braze/configuration/BrazeConfig;", "setApiKey", "setDefaultNotificationChannelName", "name", "setDefaultNotificationChannelDescription", "description", "setServerTarget", "setSdkFlavor", "setSmallNotificationIcon", "setLargeNotificationIcon", "setCustomEndpoint", "setSessionTimeout", "sessionTimeoutSeconds", "setDefaultNotificationAccentColor", "setTriggerActionMinimumTimeIntervalSeconds", "setAdmMessagingRegistrationEnabled", "setHandlePushDeepLinksAutomatically", "setPushDeepLinkBackStackActivityEnabled", "pushDeepLinkBackStackActivityEnabled", "setPushDeepLinkBackStackActivityClass", "pushDeepLinkActivityClass", "Ljava/lang/Class;", "setIsAutomaticLocationCollectionEnabled", "setBadNetworkDataFlushInterval", "badNetworkIntervalSeconds", "setGoodNetworkDataFlushInterval", "goodNetworkIntervalSeconds", "setGreatNetworkDataFlushInterval", "greatNetworkIntervalSeconds", "setIsSessionStartBasedTimeoutEnabled", "setIsFirebaseCloudMessagingRegistrationEnabled", "firebaseMessagingRegistrationEnabled", "setFirebaseCloudMessagingSenderIdKey", "firebaseSenderId", "setContentCardsUnreadVisualIndicatorEnabled", "contentCardsUnreadVisualIndicatorEnabled", "setDeviceObjectAllowlist", "setDeviceObjectAllowlistEnabled", "enabled", "setIsInAppMessageAccessibilityExclusiveModeEnabled", "setIsPushWakeScreenForNotificationEnabled", "setPushHtmlRenderingEnabled", "setDoesPushStoryDismissOnClick", "setGeofencesEnabled", "setInAppMessageTestPushEagerDisplayEnabled", "setCustomWebViewActivityClass", "customWebViewActivityClass", "setAutomaticGeofenceRequestsEnabled", "setCustomLocationProviderNames", "locationProviderNames", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs", "maxOnPageFinishedWaitMs", "setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "setIsSdkAuthenticationEnabled", "setIsTouchModeRequiredForHtmlInAppMessages", "required", "setIsHtmlInAppMessageHtmlLinkTargetEnabled", "setSdkMetadata", "sdkMetadata", "setFallbackFirebaseMessagingServiceEnabled", "setFallbackFirebaseMessagingServiceClasspath", "classpath", "setOptInWhenPushAuthorized", "setShouldUseWindowFlagSecureInActivities", "setShouldPersistWebViewWhenBackgroundingApp", "setShouldAddStatusBarPaddingToInAppMessages", InAppPurchaseConstants.METHOD_TO_STRING, "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
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
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isAutomaticLocationCollectionEnabled;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
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
        private Boolean shouldAddStatusBarPaddingToInAppMessages;
        private Boolean shouldOptInWhenPushAuthorized;
        private Boolean shouldPersistWebViewWhenBackgroundingApp;
        private Boolean shouldUseWindowFlagSecureInActivities;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet<DeviceKey> enumSet, Boolean bool17, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, String str11, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24) {
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
            this.isAutomaticLocationCollectionEnabled = bool3;
            this.isPushDeepLinkBackStackActivityEnabled = bool4;
            this.isSessionStartBasedTimeoutEnabled = bool5;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool6;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool7;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool8;
            this.isPushWakeScreenForNotificationEnabled = bool9;
            this.isPushHtmlRenderingEnabled = bool10;
            this.isGeofencesEnabled = bool11;
            this.inAppMessageTestPushEagerDisplayEnabled = bool12;
            this.automaticGeofenceRequestsEnabled = bool13;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool14;
            this.isTouchModeRequiredForHtmlInAppMessages = bool15;
            this.isSdkAuthEnabled = bool16;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool17;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool18;
            this.doesPushStoryDismissOnClick = bool19;
            this.isFallbackFirebaseMessagingServiceEnabled = bool20;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
            this.shouldOptInWhenPushAuthorized = bool21;
            this.shouldUseWindowFlagSecureInActivities = bool22;
            this.shouldPersistWebViewWhenBackgroundingApp = bool23;
            this.shouldAddStatusBarPaddingToInAppMessages = bool24;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setApiKey$lambda$0() {
            return "Cannot set Braze API key to blank string. API key field not set";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setDefaultNotificationChannelDescription$lambda$2() {
            return "Cannot set Braze default NotificationChannel description to null or blank string. NotificationChannel description field not set.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setDefaultNotificationChannelName$lambda$1() {
            return "Cannot set Braze default NotificationChannel name to blank string. NotificationChannel name field not set.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setFirebaseCloudMessagingSenderIdKey$lambda$21() {
            return "Cannot set Firebase Cloud Messaging Sender Id to blank string. Firebase Cloud Messaging Sender Id field not set";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$34(int i) {
            return "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: " + i;
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        /* renamed from: getAdmMessagingRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getAdmMessagingRegistrationEnabled() {
            return this.admMessagingRegistrationEnabled;
        }

        /* renamed from: getApiKey$android_sdk_base_release, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* renamed from: getAutomaticGeofenceRequestsEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getAutomaticGeofenceRequestsEnabled() {
            return this.automaticGeofenceRequestsEnabled;
        }

        /* renamed from: getBadNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getBadNetworkInterval() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        /* renamed from: getCustomEndpoint$android_sdk_base_release, reason: from getter */
        public final String getCustomEndpoint() {
            return this.customEndpoint;
        }

        /* renamed from: getCustomHtmlWebViewActivityClassName$android_sdk_base_release, reason: from getter */
        public final String getCustomHtmlWebViewActivityClassName() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        /* renamed from: getDefaultNotificationAccentColor$android_sdk_base_release, reason: from getter */
        public final Integer getDefaultNotificationAccentColor() {
            return this.defaultNotificationAccentColor;
        }

        /* renamed from: getDefaultNotificationChannelDescription$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelDescription() {
            return this.defaultNotificationChannelDescription;
        }

        /* renamed from: getDefaultNotificationChannelName$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelName() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        /* renamed from: getDoesPushStoryDismissOnClick$android_sdk_base_release, reason: from getter */
        public final Boolean getDoesPushStoryDismissOnClick() {
            return this.doesPushStoryDismissOnClick;
        }

        /* renamed from: getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release, reason: from getter */
        public final String getFallbackFirebaseMessagingServiceClasspath() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        /* renamed from: getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release, reason: from getter */
        public final String getFirebaseCloudMessagingSenderIdKey() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        /* renamed from: getGoodNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getGoodNetworkInterval() {
            return this.goodNetworkInterval;
        }

        /* renamed from: getGreatNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getGreatNetworkInterval() {
            return this.greatNetworkInterval;
        }

        /* renamed from: getHandlePushDeepLinksAutomatically$android_sdk_base_release, reason: from getter */
        public final Boolean getHandlePushDeepLinksAutomatically() {
            return this.handlePushDeepLinksAutomatically;
        }

        /* renamed from: getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getInAppMessageTestPushEagerDisplayEnabled() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        /* renamed from: getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release, reason: from getter */
        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        /* renamed from: getLargeNotificationIconName$android_sdk_base_release, reason: from getter */
        public final String getLargeNotificationIconName() {
            return this.largeNotificationIconName;
        }

        /* renamed from: getPushDeepLinkBackStackActivityClassName$android_sdk_base_release, reason: from getter */
        public final String getPushDeepLinkBackStackActivityClassName() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        /* renamed from: getSdkFlavor$android_sdk_base_release, reason: from getter */
        public final SdkFlavor getSdkFlavor() {
            return this.sdkFlavor;
        }

        /* renamed from: getServerTarget$android_sdk_base_release, reason: from getter */
        public final String getServerTarget() {
            return this.serverTarget;
        }

        /* renamed from: getSessionTimeout$android_sdk_base_release, reason: from getter */
        public final Integer getSessionTimeout() {
            return this.sessionTimeout;
        }

        /* renamed from: getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldAddStatusBarPaddingToInAppMessages() {
            return this.shouldAddStatusBarPaddingToInAppMessages;
        }

        /* renamed from: getShouldOptInWhenPushAuthorized$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldOptInWhenPushAuthorized() {
            return this.shouldOptInWhenPushAuthorized;
        }

        /* renamed from: getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldPersistWebViewWhenBackgroundingApp() {
            return this.shouldPersistWebViewWhenBackgroundingApp;
        }

        /* renamed from: getShouldUseWindowFlagSecureInActivities$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldUseWindowFlagSecureInActivities() {
            return this.shouldUseWindowFlagSecureInActivities;
        }

        /* renamed from: getSmallNotificationIconName$android_sdk_base_release, reason: from getter */
        public final String getSmallNotificationIconName() {
            return this.smallNotificationIconName;
        }

        /* renamed from: getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release, reason: from getter */
        public final Integer getTriggerActionMinimumTimeIntervalSeconds() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        /* renamed from: isAutomaticLocationCollectionEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsAutomaticLocationCollectionEnabled() {
            return this.isAutomaticLocationCollectionEnabled;
        }

        /* renamed from: isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsContentCardsUnreadVisualIndicatorEnabled() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        /* renamed from: isDeviceObjectAllowlistEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsDeviceObjectAllowlistEnabled() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        /* renamed from: isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFallbackFirebaseMessagingServiceEnabled() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        /* renamed from: isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseCloudMessagingRegistrationEnabled() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        /* renamed from: isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        /* renamed from: isGeofencesEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsGeofencesEnabled() {
            return this.isGeofencesEnabled;
        }

        /* renamed from: isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsHtmlInAppMessageHtmlLinkTargetEnabled() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        /* renamed from: isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsInAppMessageAccessibilityExclusiveModeEnabled() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        /* renamed from: isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushDeepLinkBackStackActivityEnabled() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        /* renamed from: isPushHtmlRenderingEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushHtmlRenderingEnabled() {
            return this.isPushHtmlRenderingEnabled;
        }

        /* renamed from: isPushWakeScreenForNotificationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushWakeScreenForNotificationEnabled() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        /* renamed from: isSdkAuthEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSdkAuthEnabled() {
            return this.isSdkAuthEnabled;
        }

        /* renamed from: isSessionStartBasedTimeoutEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSessionStartBasedTimeoutEnabled() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        /* renamed from: isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release, reason: from getter */
        public final Boolean getIsTouchModeRequiredForHtmlInAppMessages() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setAdmMessagingRegistrationEnabled(boolean admMessagingRegistrationEnabled) {
            this.admMessagingRegistrationEnabled = Boolean.valueOf(admMessagingRegistrationEnabled);
            return this;
        }

        public final void setAdmMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.admMessagingRegistrationEnabled = bool;
        }

        public final Builder setApiKey(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            if (StringsKt.isBlank(apiKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.BrazeConfig$Builder$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String apiKey$lambda$0;
                        apiKey$lambda$0 = BrazeConfig.Builder.setApiKey$lambda$0();
                        return apiKey$lambda$0;
                    }
                }, 6, (Object) null);
                return this;
            }
            this.apiKey = apiKey;
            return this;
        }

        public final void setApiKey$android_sdk_base_release(String str) {
            this.apiKey = str;
        }

        public final Builder setAutomaticGeofenceRequestsEnabled(boolean enabled) {
            this.automaticGeofenceRequestsEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setAutomaticGeofenceRequestsEnabled$android_sdk_base_release(Boolean bool) {
            this.automaticGeofenceRequestsEnabled = bool;
        }

        public final void setAutomaticLocationCollectionEnabled$android_sdk_base_release(Boolean bool) {
            this.isAutomaticLocationCollectionEnabled = bool;
        }

        public final Builder setBadNetworkDataFlushInterval(int badNetworkIntervalSeconds) {
            this.badNetworkInterval = Integer.valueOf(badNetworkIntervalSeconds);
            return this;
        }

        public final void setBadNetworkInterval$android_sdk_base_release(Integer num) {
            this.badNetworkInterval = num;
        }

        public final void setBrazeSdkMetadata$android_sdk_base_release(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
        }

        public final Builder setContentCardsUnreadVisualIndicatorEnabled(boolean contentCardsUnreadVisualIndicatorEnabled) {
            this.isContentCardsUnreadVisualIndicatorEnabled = Boolean.valueOf(contentCardsUnreadVisualIndicatorEnabled);
            return this;
        }

        public final void setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release(Boolean bool) {
            this.isContentCardsUnreadVisualIndicatorEnabled = bool;
        }

        public final Builder setCustomEndpoint(String customEndpoint) {
            Intrinsics.checkNotNullParameter(customEndpoint, "customEndpoint");
            this.customEndpoint = customEndpoint;
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
            this.customLocationProviderNames = locationProviderNames;
            return this;
        }

        public final void setCustomLocationProviderNames$android_sdk_base_release(EnumSet<LocationProviderName> enumSet) {
            this.customLocationProviderNames = enumSet;
        }

        public final Builder setCustomWebViewActivityClass(Class<?> customWebViewActivityClass) {
            Intrinsics.checkNotNullParameter(customWebViewActivityClass, "customWebViewActivityClass");
            this.customHtmlWebViewActivityClassName = customWebViewActivityClass.getName();
            return this;
        }

        public final Builder setDefaultNotificationAccentColor(int defaultNotificationAccentColor) {
            this.defaultNotificationAccentColor = Integer.valueOf(defaultNotificationAccentColor);
            return this;
        }

        public final void setDefaultNotificationAccentColor$android_sdk_base_release(Integer num) {
            this.defaultNotificationAccentColor = num;
        }

        public final Builder setDefaultNotificationChannelDescription(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            if (StringsKt.isBlank(description)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.BrazeConfig$Builder$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String defaultNotificationChannelDescription$lambda$2;
                        defaultNotificationChannelDescription$lambda$2 = BrazeConfig.Builder.setDefaultNotificationChannelDescription$lambda$2();
                        return defaultNotificationChannelDescription$lambda$2;
                    }
                }, 6, (Object) null);
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.BrazeConfig$Builder$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String defaultNotificationChannelName$lambda$1;
                        defaultNotificationChannelName$lambda$1 = BrazeConfig.Builder.setDefaultNotificationChannelName$lambda$1();
                        return defaultNotificationChannelName$lambda$1;
                    }
                }, 6, (Object) null);
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
            this.deviceObjectAllowlist = deviceObjectAllowlist;
            return this;
        }

        public final void setDeviceObjectAllowlist$android_sdk_base_release(EnumSet<DeviceKey> enumSet) {
            this.deviceObjectAllowlist = enumSet;
        }

        public final Builder setDeviceObjectAllowlistEnabled(boolean enabled) {
            this.isDeviceObjectAllowlistEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setDeviceObjectAllowlistEnabled$android_sdk_base_release(Boolean bool) {
            this.isDeviceObjectAllowlistEnabled = bool;
        }

        public final Builder setDoesPushStoryDismissOnClick(boolean enabled) {
            this.doesPushStoryDismissOnClick = Boolean.valueOf(enabled);
            return this;
        }

        public final void setDoesPushStoryDismissOnClick$android_sdk_base_release(Boolean bool) {
            this.doesPushStoryDismissOnClick = bool;
        }

        public final Builder setFallbackFirebaseMessagingServiceClasspath(String classpath) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            this.fallbackFirebaseMessagingServiceClasspath = classpath;
            return this;
        }

        public final void setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release(String str) {
            this.fallbackFirebaseMessagingServiceClasspath = str;
        }

        public final Builder setFallbackFirebaseMessagingServiceEnabled(boolean enabled) {
            this.isFallbackFirebaseMessagingServiceEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release(Boolean bool) {
            this.isFallbackFirebaseMessagingServiceEnabled = bool;
        }

        public final void setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseCloudMessagingRegistrationEnabled = bool;
        }

        public final Builder setFirebaseCloudMessagingSenderIdKey(String firebaseSenderId) {
            Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
            if (StringsKt.isBlank(firebaseSenderId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.BrazeConfig$Builder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String firebaseCloudMessagingSenderIdKey$lambda$21;
                        firebaseCloudMessagingSenderIdKey$lambda$21 = BrazeConfig.Builder.setFirebaseCloudMessagingSenderIdKey$lambda$21();
                        return firebaseCloudMessagingSenderIdKey$lambda$21;
                    }
                }, 6, (Object) null);
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
            this.isGeofencesEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setGeofencesEnabled$android_sdk_base_release(Boolean bool) {
            this.isGeofencesEnabled = bool;
        }

        public final Builder setGoodNetworkDataFlushInterval(int goodNetworkIntervalSeconds) {
            this.goodNetworkInterval = Integer.valueOf(goodNetworkIntervalSeconds);
            return this;
        }

        public final void setGoodNetworkInterval$android_sdk_base_release(Integer num) {
            this.goodNetworkInterval = num;
        }

        public final Builder setGreatNetworkDataFlushInterval(int greatNetworkIntervalSeconds) {
            this.greatNetworkInterval = Integer.valueOf(greatNetworkIntervalSeconds);
            return this;
        }

        public final void setGreatNetworkInterval$android_sdk_base_release(Integer num) {
            this.greatNetworkInterval = num;
        }

        public final Builder setHandlePushDeepLinksAutomatically(boolean handlePushDeepLinksAutomatically) {
            this.handlePushDeepLinksAutomatically = Boolean.valueOf(handlePushDeepLinksAutomatically);
            return this;
        }

        public final void setHandlePushDeepLinksAutomatically$android_sdk_base_release(Boolean bool) {
            this.handlePushDeepLinksAutomatically = bool;
        }

        public final void setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool;
        }

        public final void setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release(Boolean bool) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool;
        }

        public final Builder setInAppMessageTestPushEagerDisplayEnabled(boolean enabled) {
            this.inAppMessageTestPushEagerDisplayEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release(Boolean bool) {
            this.inAppMessageTestPushEagerDisplayEnabled = bool;
        }

        public final Builder setInAppMessageWebViewClientMaxOnPageFinishedWaitMs(final int maxOnPageFinishedWaitMs) {
            if (maxOnPageFinishedWaitMs >= 0) {
                this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = Integer.valueOf(maxOnPageFinishedWaitMs);
                return this;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.BrazeConfig$Builder$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String inAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$34;
                    inAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$34 = BrazeConfig.Builder.setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$34(maxOnPageFinishedWaitMs);
                    return inAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$34;
                }
            }, 6, (Object) null);
            return this;
        }

        public final void setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release(Integer num) {
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num;
        }

        public final Builder setIsAutomaticLocationCollectionEnabled(boolean isAutomaticLocationCollectionEnabled) {
            this.isAutomaticLocationCollectionEnabled = Boolean.valueOf(isAutomaticLocationCollectionEnabled);
            return this;
        }

        public final Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean firebaseMessagingRegistrationEnabled) {
            this.isFirebaseCloudMessagingRegistrationEnabled = Boolean.valueOf(firebaseMessagingRegistrationEnabled);
            return this;
        }

        public final Builder setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(boolean enabled) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final Builder setIsHtmlInAppMessageHtmlLinkTargetEnabled(boolean enabled) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final Builder setIsInAppMessageAccessibilityExclusiveModeEnabled(boolean enabled) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final Builder setIsPushWakeScreenForNotificationEnabled(boolean enabled) {
            this.isPushWakeScreenForNotificationEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final Builder setIsSdkAuthenticationEnabled(boolean enabled) {
            this.isSdkAuthEnabled = Boolean.valueOf(enabled);
            return this;
        }

        public final Builder setIsSessionStartBasedTimeoutEnabled(boolean isSessionStartBasedTimeoutEnabled) {
            this.isSessionStartBasedTimeoutEnabled = Boolean.valueOf(isSessionStartBasedTimeoutEnabled);
            return this;
        }

        public final Builder setIsTouchModeRequiredForHtmlInAppMessages(boolean required) {
            this.isTouchModeRequiredForHtmlInAppMessages = Boolean.valueOf(required);
            return this;
        }

        public final Builder setLargeNotificationIcon(String largeNotificationIconName) {
            Intrinsics.checkNotNullParameter(largeNotificationIconName, "largeNotificationIconName");
            this.largeNotificationIconName = largeNotificationIconName;
            return this;
        }

        public final void setLargeNotificationIconName$android_sdk_base_release(String str) {
            this.largeNotificationIconName = str;
        }

        public final Builder setOptInWhenPushAuthorized(boolean enabled) {
            this.shouldOptInWhenPushAuthorized = Boolean.valueOf(enabled);
            return this;
        }

        public final Builder setPushDeepLinkBackStackActivityClass(Class<?> pushDeepLinkActivityClass) {
            Intrinsics.checkNotNullParameter(pushDeepLinkActivityClass, "pushDeepLinkActivityClass");
            this.pushDeepLinkBackStackActivityClassName = pushDeepLinkActivityClass.getName();
            return this;
        }

        public final void setPushDeepLinkBackStackActivityClassName$android_sdk_base_release(String str) {
            this.pushDeepLinkBackStackActivityClassName = str;
        }

        public final Builder setPushDeepLinkBackStackActivityEnabled(boolean pushDeepLinkBackStackActivityEnabled) {
            this.isPushDeepLinkBackStackActivityEnabled = Boolean.valueOf(pushDeepLinkBackStackActivityEnabled);
            return this;
        }

        public final void setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushDeepLinkBackStackActivityEnabled = bool;
        }

        public final Builder setPushHtmlRenderingEnabled(boolean enabled) {
            this.isPushHtmlRenderingEnabled = Boolean.valueOf(enabled);
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
            this.sdkFlavor = sdkFlavor;
            return this;
        }

        public final void setSdkFlavor$android_sdk_base_release(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
        }

        public final Builder setSdkMetadata(EnumSet<BrazeSdkMetadata> sdkMetadata) {
            this.brazeSdkMetadata = sdkMetadata;
            return this;
        }

        public final Builder setServerTarget(String serverTarget) {
            Intrinsics.checkNotNullParameter(serverTarget, "serverTarget");
            this.serverTarget = serverTarget;
            return this;
        }

        public final void setServerTarget$android_sdk_base_release(String str) {
            this.serverTarget = str;
        }

        public final void setSessionStartBasedTimeoutEnabled$android_sdk_base_release(Boolean bool) {
            this.isSessionStartBasedTimeoutEnabled = bool;
        }

        public final Builder setSessionTimeout(int sessionTimeoutSeconds) {
            this.sessionTimeout = Integer.valueOf(sessionTimeoutSeconds);
            return this;
        }

        public final void setSessionTimeout$android_sdk_base_release(Integer num) {
            this.sessionTimeout = num;
        }

        public final Builder setShouldAddStatusBarPaddingToInAppMessages(boolean enabled) {
            this.shouldAddStatusBarPaddingToInAppMessages = Boolean.valueOf(enabled);
            return this;
        }

        public final void setShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release(Boolean bool) {
            this.shouldAddStatusBarPaddingToInAppMessages = bool;
        }

        public final void setShouldOptInWhenPushAuthorized$android_sdk_base_release(Boolean bool) {
            this.shouldOptInWhenPushAuthorized = bool;
        }

        public final Builder setShouldPersistWebViewWhenBackgroundingApp(boolean enabled) {
            this.shouldPersistWebViewWhenBackgroundingApp = Boolean.valueOf(enabled);
            return this;
        }

        public final void setShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release(Boolean bool) {
            this.shouldPersistWebViewWhenBackgroundingApp = bool;
        }

        public final Builder setShouldUseWindowFlagSecureInActivities(boolean enabled) {
            this.shouldUseWindowFlagSecureInActivities = Boolean.valueOf(enabled);
            return this;
        }

        public final void setShouldUseWindowFlagSecureInActivities$android_sdk_base_release(Boolean bool) {
            this.shouldUseWindowFlagSecureInActivities = bool;
        }

        public final Builder setSmallNotificationIcon(String smallNotificationIconName) {
            Intrinsics.checkNotNullParameter(smallNotificationIconName, "smallNotificationIconName");
            this.smallNotificationIconName = smallNotificationIconName;
            return this;
        }

        public final void setSmallNotificationIconName$android_sdk_base_release(String str) {
            this.smallNotificationIconName = str;
        }

        public final void setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release(Boolean bool) {
            this.isTouchModeRequiredForHtmlInAppMessages = bool;
        }

        public final Builder setTriggerActionMinimumTimeIntervalSeconds(int triggerActionMinimumTimeIntervalSeconds) {
            this.triggerActionMinimumTimeIntervalSeconds = Integer.valueOf(triggerActionMinimumTimeIntervalSeconds);
            return this;
        }

        public final void setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release(Integer num) {
            this.triggerActionMinimumTimeIntervalSeconds = num;
        }

        public String toString() {
            return "Builder(apiKey=" + this.apiKey + ", serverTarget=" + this.serverTarget + ", smallNotificationIconName=" + this.smallNotificationIconName + ", largeNotificationIconName=" + this.largeNotificationIconName + ", customEndpoint=" + this.customEndpoint + ", defaultNotificationChannelName=" + this.defaultNotificationChannelName + ", defaultNotificationChannelDescription=" + this.defaultNotificationChannelDescription + ", pushDeepLinkBackStackActivityClassName=" + this.pushDeepLinkBackStackActivityClassName + ", firebaseCloudMessagingSenderIdKey=" + this.firebaseCloudMessagingSenderIdKey + ", customHtmlWebViewActivityClassName=" + this.customHtmlWebViewActivityClassName + ", sdkFlavor=" + this.sdkFlavor + ", sessionTimeout=" + this.sessionTimeout + ", defaultNotificationAccentColor=" + this.defaultNotificationAccentColor + ", triggerActionMinimumTimeIntervalSeconds=" + this.triggerActionMinimumTimeIntervalSeconds + ", badNetworkInterval=" + this.badNetworkInterval + ", goodNetworkInterval=" + this.goodNetworkInterval + ", greatNetworkInterval=" + this.greatNetworkInterval + ", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=" + this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs + ", admMessagingRegistrationEnabled=" + this.admMessagingRegistrationEnabled + ", handlePushDeepLinksAutomatically=" + this.handlePushDeepLinksAutomatically + ", isAutomaticLocationCollectionEnabled=" + this.isAutomaticLocationCollectionEnabled + ", isPushDeepLinkBackStackActivityEnabled=" + this.isPushDeepLinkBackStackActivityEnabled + ", isSessionStartBasedTimeoutEnabled=" + this.isSessionStartBasedTimeoutEnabled + ", isFirebaseCloudMessagingRegistrationEnabled=" + this.isFirebaseCloudMessagingRegistrationEnabled + ", isContentCardsUnreadVisualIndicatorEnabled=" + this.isContentCardsUnreadVisualIndicatorEnabled + ", isInAppMessageAccessibilityExclusiveModeEnabled=" + this.isInAppMessageAccessibilityExclusiveModeEnabled + ", isPushWakeScreenForNotificationEnabled=" + this.isPushWakeScreenForNotificationEnabled + ", isPushHtmlRenderingEnabled=" + this.isPushHtmlRenderingEnabled + ", isGeofencesEnabled=" + this.isGeofencesEnabled + ", inAppMessageTestPushEagerDisplayEnabled=" + this.inAppMessageTestPushEagerDisplayEnabled + ", automaticGeofenceRequestsEnabled=" + this.automaticGeofenceRequestsEnabled + ", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=" + this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled + ", isTouchModeRequiredForHtmlInAppMessages=" + this.isTouchModeRequiredForHtmlInAppMessages + ", isSdkAuthEnabled=" + this.isSdkAuthEnabled + ", deviceObjectAllowlist=" + this.deviceObjectAllowlist + ", isDeviceObjectAllowlistEnabled=" + this.isDeviceObjectAllowlistEnabled + ", brazeSdkMetadata=" + this.brazeSdkMetadata + ", customLocationProviderNames=" + this.customLocationProviderNames + ", isHtmlInAppMessageHtmlLinkTargetEnabled=" + this.isHtmlInAppMessageHtmlLinkTargetEnabled + ", doesPushStoryDismissOnClick=" + this.doesPushStoryDismissOnClick + ", isFallbackFirebaseMessagingServiceEnabled=" + this.isFallbackFirebaseMessagingServiceEnabled + ", fallbackFirebaseMessagingServiceClasspath=" + this.fallbackFirebaseMessagingServiceClasspath + ", shouldOptInWhenPushAuthorized=" + this.shouldOptInWhenPushAuthorized + ", shouldUseWindowFlagSecureInActivities=" + this.shouldUseWindowFlagSecureInActivities + ", shouldAddStatusBarPaddingToInAppMessages=" + this.shouldAddStatusBarPaddingToInAppMessages + "))";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet enumSet, Boolean bool17, EnumSet enumSet2, EnumSet enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, String str11, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(r40, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r3, r2, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r0, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : bool16, (i2 & 4) != 0 ? null : enumSet, (i2 & 8) != 0 ? null : bool17, (i2 & 16) != 0 ? null : enumSet2, (i2 & 32) != 0 ? null : enumSet3, (i2 & 64) != 0 ? null : bool18, (i2 & 128) != 0 ? null : bool19, (i2 & 256) != 0 ? null : bool20, (i2 & 512) != 0 ? null : str11, (i2 & 1024) != 0 ? null : bool21, (i2 & 2048) != 0 ? null : bool22, (i2 & 4096) != 0 ? null : bool23, (i2 & 8192) != 0 ? null : bool24);
            String str12 = (i & 1) != 0 ? null : str;
            String str13 = (i & 2) != 0 ? null : str2;
            String str14 = (i & 4) != 0 ? null : str3;
            String str15 = (i & 8) != 0 ? null : str4;
            String str16 = (i & 16) != 0 ? null : str5;
            String str17 = (i & 32) != 0 ? null : str6;
            String str18 = (i & 64) != 0 ? null : str7;
            String str19 = (i & 128) != 0 ? null : str8;
            String str20 = (i & 256) != 0 ? null : str9;
            String str21 = (i & 512) != 0 ? null : str10;
            SdkFlavor sdkFlavor2 = (i & 1024) != 0 ? null : sdkFlavor;
            Integer num8 = (i & 2048) != 0 ? null : num;
            Integer num9 = (i & 4096) != 0 ? null : num2;
            Integer num10 = (i & 8192) != 0 ? null : num3;
            String str22 = str12;
            Integer num11 = (i & 16384) != 0 ? null : num4;
            Integer num12 = (i & 32768) != 0 ? null : num5;
            Integer num13 = (i & 65536) != 0 ? null : num6;
            Integer num14 = (i & 131072) != 0 ? null : num7;
            Boolean bool25 = (i & 262144) != 0 ? null : bool;
            Boolean bool26 = (i & 524288) != 0 ? null : bool2;
            Boolean bool27 = (i & 1048576) != 0 ? null : bool3;
            Boolean bool28 = (i & 2097152) != 0 ? null : bool4;
            Boolean bool29 = (i & 4194304) != 0 ? null : bool5;
            Boolean bool30 = (i & 8388608) != 0 ? null : bool6;
            Boolean bool31 = (i & 16777216) != 0 ? null : bool7;
            Boolean bool32 = (i & 33554432) != 0 ? null : bool8;
            Boolean bool33 = (i & 67108864) != 0 ? null : bool9;
            Boolean bool34 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bool10;
            Boolean bool35 = (i & 268435456) != 0 ? null : bool11;
            Boolean bool36 = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bool12;
            Boolean bool37 = (i & 1073741824) != 0 ? null : bool13;
            Boolean bool38 = (i & Integer.MIN_VALUE) != 0 ? null : bool14;
            String str23 = str13;
            String str24 = str14;
            String str25 = str15;
            String str26 = str16;
            String str27 = str17;
            String str28 = str18;
            String str29 = str19;
            String str30 = str20;
            String str31 = str21;
            SdkFlavor sdkFlavor3 = sdkFlavor2;
            Integer num15 = num8;
            Integer num16 = num9;
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 16383, null);
        }
    }
}
