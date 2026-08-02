package com.braze;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bo.app.a0;
import bo.app.d0;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.models.IBrazeLocation;
import com.braze.models.push.BrazeNotificationPayload;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0012J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b)\u0010$J%\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J%\u00103\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000b2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\u0012J\u001d\u00106\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000b¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J%\u0010B\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ#\u0010G\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010HJ#\u0010I\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bI\u0010HJ\u001d\u0010J\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u000b¢\u0006\u0004\bJ\u00107¨\u0006K"}, d2 = {"Lcom/braze/BrazeInternal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "ignoreRateLimit", "", "requestGeofenceRefresh", "(Landroid/content/Context;Z)V", "", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "transitionType", "recordGeofenceTransition", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "refreshFeatureFlags", "(Landroid/content/Context;)V", "refreshBanners", "serializedCardJson", "userId", "addSerializedContentCardToStorage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/braze/models/IBrazeLocation;", "location", "logLocationRecordedEvent", "(Landroid/content/Context;Lcom/braze/models/IBrazeLocation;)V", "Landroid/content/Intent;", "intent", "handleInAppMessageTestPush", "(Landroid/content/Context;Landroid/content/Intent;)V", "applyPendingRuntimeConfiguration", "Lcom/braze/events/InAppMessageEvent;", "inAppMessageEvent", "retryInAppMessage", "(Landroid/content/Context;Lcom/braze/events/InAppMessageEvent;)V", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "deleteRegisteredGeofenceCache", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "publishBrazePushAction", "(Landroid/content/Context;Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "campaignId", "", "waitTimeMs", "logPushDelivery", "(Landroid/content/Context;Ljava/lang/String;J)V", "performPushDeliveryFlush", "logPushCampaign", "(Landroid/content/Context;Ljava/lang/String;)V", "pushId", "validateAndStorePushId", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "placementId", "Landroid/view/View;", "view", "skipImpressionMonitoring", "addBannerViewMonitor", "(Ljava/lang/String;Landroid/view/View;Z)V", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/BannerDismissedEvent;", "subscriber", "subscribeToBannersDismissedEvent", "(Landroid/content/Context;Lcom/braze/events/IEventSubscriber;)V", "unsubscribeFromBannersDismissedEvent", "dismissBanner", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    @JvmStatic
    public static final void addSerializedContentCardToStorage(Context context, String serializedCardJson, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage$android_sdk_base_release(serializedCardJson, userId);
    }

    @JvmStatic
    public static final void applyPendingRuntimeConfiguration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration$android_sdk_base_release();
    }

    private final Braze getInstance(Context context) {
        return Braze.INSTANCE.getInstance(context);
    }

    @JvmStatic
    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        INSTANCE.getInstance(context).handleInAppMessageTestPush$android_sdk_base_release(intent);
    }

    @JvmStatic
    public static final void logLocationRecordedEvent(Context context, IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        INSTANCE.getInstance(context).logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(location);
    }

    @JvmStatic
    public static final void recordGeofenceTransition(Context context, String geofenceId, GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        INSTANCE.getInstance(context).recordGeofenceTransition$android_sdk_base_release(geofenceId, transitionType);
    }

    @JvmStatic
    public static final void refreshBanners(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).handleInternalBannerRefresh$android_sdk_base_release();
    }

    @JvmStatic
    public static final void refreshFeatureFlags(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).refreshFeatureFlags();
    }

    @JvmStatic
    public static final void requestGeofenceRefresh(Context context, boolean ignoreRateLimit) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(ignoreRateLimit);
    }

    @JvmStatic
    public static final void retryInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        INSTANCE.getInstance(context).retryInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final void addBannerViewMonitor(String placementId, View view, boolean skipImpressionMonitoring) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        a0 a0Var = d0.f25368j;
        a0.a(placementId, view, skipImpressionMonitoring);
    }

    public final void deleteRegisteredGeofenceCache(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getInstance(context).deleteRegisteredGeofenceCache$android_sdk_base_release();
    }

    public final void dismissBanner(Context context, String placementId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        getInstance(context).dismissBanner$android_sdk_base_release(placementId);
    }

    public final BrazeConfigurationProvider getConfigurationProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getInstance(context).getConfigurationProviderSafe$android_sdk_base_release(context);
    }

    public final /* synthetic */ void logPushCampaign(Context context, String campaignId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        getInstance(context).logPushMaxCampaign$android_sdk_base_release(campaignId);
    }

    public final /* synthetic */ void logPushDelivery(Context context, String campaignId, long waitTimeMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        getInstance(context).logPushDelivery$android_sdk_base_release(campaignId, waitTimeMs);
    }

    public final /* synthetic */ void performPushDeliveryFlush(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getInstance(context).performPushDeliveryFlush$android_sdk_base_release();
    }

    public final /* synthetic */ void publishBrazePushAction(Context context, BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        getInstance(context).publishBrazePushAction$android_sdk_base_release(pushActionType, payload);
    }

    public final void reenqueueInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        getInstance(context).reenqueueInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final void subscribeToBannersDismissedEvent(Context context, IEventSubscriber<BannerDismissedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        getInstance(context).subscribeToBannersDismissedEvent$android_sdk_base_release(subscriber);
    }

    public final void unsubscribeFromBannersDismissedEvent(Context context, IEventSubscriber<BannerDismissedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        getInstance(context).unsubscribeFromBannersDismissedEvent$android_sdk_base_release(subscriber);
    }

    public final /* synthetic */ boolean validateAndStorePushId(Context context, String pushId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        return getInstance(context).validateAndStorePushId$android_sdk_base_release(pushId);
    }
}
