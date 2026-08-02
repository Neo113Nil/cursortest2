package com.braze.push;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: BrazeNotificationUtils.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001TB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u0013H\u0007J\u001c\u0010.\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00100\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u00101\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u00102\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u00103\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0007J\"\u00105\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00106\u001a\u00020$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J.\u00105\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00107\u001a\u0002082\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J \u00109\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010=\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010?\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\"\u0010@\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0018\u0010A\u001a\u00020*2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010B\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J.\u0010C\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0007J\u0018\u0010F\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010G\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010H\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020K2\u0006\u0010;\u001a\u00020<H\u0007J\u0018\u0010L\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010N\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010O\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010P\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010Q\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010R\u001a\u00020K2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0010\u0010Q\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\f\u0010S\u001a\u00020**\u00020$H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0015\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006U"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "()V", "SOURCE_KEY", "", "TAG", "activeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "notificationReceiverClass", "Ljava/lang/Class;", "getNotificationReceiverClass", "()Ljava/lang/Class;", "cancelNotification", "", "context", "Landroid/content/Context;", "notificationId", "", "getNotificationId", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "getNotificationPriority", "getOrCreateNotificationChannelId", "getPushActionPendingIntent", "Landroid/app/PendingIntent;", "action", "notificationExtras", "Landroid/os/Bundle;", "getValidNotificationChannel", "Landroid/app/NotificationChannel;", "notificationManager", "Landroid/app/NotificationManager;", "handleCancelNotificationAction", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "handleContentCardsSerializedCardIfPresent", "handleNotificationDeleted", "handleNotificationOpened", "handlePushStoryPageClicked", "isNotificationMessage", "", "isUninstallTrackingPush", "isValidNotificationVisibility", "visibility", "logBaiduNotificationClick", "customContentString", "prefetchBitmapsIfNewlyReceivedStoryPush", "refreshFeatureFlagsIfAppropriate", "requestGeofenceRefreshIfAppropriate", "routeUserWithNotificationOpenedIntent", "sendNotificationOpenedBroadcast", "sendPushActionIntent", "pushIntent", "broadcastType", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "sendPushMessageReceivedBroadcast", "setAccentColorIfPresentAndSupported", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "setCategoryIfPresentAndSupported", "setContentIfPresent", "setContentIntentIfPresent", "setDeleteIntent", "setLargeIconIfPresentAndSupported", "setNotificationBadgeNumberIfPresent", "setNotificationDurationAlarm", "thisClass", "durationInMillis", "setPriorityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", "setSetShowWhen", "setSmallIcon", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setTickerIfPresent", "setTitleIfPresent", "setVisibilityIfPresentAndSupported", "wakeScreenIfAppropriate", "configurationProvider", "isBrazePushMessage", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrazeNotificationUtils {
    private static final String SOURCE_KEY = "source";
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* compiled from: BrazeNotificationUtils.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final boolean isValidNotificationVisibility(int visibility) {
        return visibility == -1 || visibility == 0 || visibility == 1;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.appboy");
        p0.startActivity(p1);
    }

    private BrazeNotificationUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BrazeNotificationUtils.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    enum BrazeNotificationBroadcastType {
        OPENED(BrazePushEventType.NOTIFICATION_OPENED),
        RECEIVED(BrazePushEventType.NOTIFICATION_RECEIVED),
        DELETED(BrazePushEventType.NOTIFICATION_DELETED);

        private final BrazePushEventType brazePushEventType;

        BrazeNotificationBroadcastType(BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    @JvmStatic
    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.INSTANCE.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.INSTANCE.getInstance() : customBrazeNotificationFactory;
    }

    @JvmStatic
    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    @JvmStatic
    public static final void handleNotificationOpened(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(intent);
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            sendNotificationOpenedBroadcast(context, intent);
            if (new BrazeConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleNotificationOpened$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not handling deep links automatically, skipping deep link handling";
                    }
                }, 2, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleNotificationOpened$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Exception occurred attempting to handle notification opened intent.";
                }
            });
        }
    }

    @JvmStatic
    public static final void handleNotificationDeleted(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Sending notification deleted broadcast";
                }
            }, 3, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            } else {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Exception occurred attempting to handle notification delete intent.";
                }
            });
        }
    }

    @JvmStatic
    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY));
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        bundleExtra.putString("source", Constants.BRAZE);
        final String stringExtra = intent.getStringExtra("uri");
        String str = stringExtra;
        if (str != null && !StringsKt.isBlank(str)) {
            final boolean equals = StringsKt.equals("true", intent.getStringExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY), true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Found a deep link: " + ((Object) stringExtra) + ". Use webview set to: " + equals;
                }
            }, 3, (Object) null);
            bundleExtra.putString("uri", stringExtra);
            bundleExtra.putBoolean(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, equals);
            UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(stringExtra, bundleExtra, equals, Channel.PUSH);
            if (createUriActionFromUrlString == null) {
                return;
            }
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(context, createUriActionFromUrlString);
            return;
        }
        final Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, bundleExtra);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Push notification had no deep link. Opening main activity: ", mainActivityIntent);
            }
        }, 3, (Object) null);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, mainActivityIntent);
    }

    @JvmStatic
    public static final boolean isBrazePushMessage(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return StringsKt.equals("true", extras.getString(Constants.BRAZE_PUSH_BRAZE_KEY), true);
    }

    @JvmStatic
    public static final boolean isNotificationMessage(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey(Constants.BRAZE_PUSH_TITLE_KEY) && extras.containsKey(Constants.BRAZE_PUSH_CONTENT_KEY);
    }

    @JvmStatic
    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$sendPushMessageReceivedBroadcast$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Sending push message received broadcast";
            }
        }, 3, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    @JvmStatic
    public static final boolean requestGeofenceRefreshIfAppropriate(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (payload.getShouldSyncGeofences() && context != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Geofence sync key was true. Syncing geofences.";
                }
            }, 3, (Object) null);
            BrazeInternal.requestGeofenceRefresh(context, true);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Geofence sync key not included in push payload or false. Not syncing geofences.";
            }
        }, 3, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (payload.getShouldRefreshFeatureFlags() && context != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$refreshFeatureFlagsIfAppropriate$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Feature flag refresh key was true. Refreshing feature flags.";
                }
            }, 3, (Object) null);
            BrazeInternal.refreshFeatureFlags(context);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$refreshFeatureFlagsIfAppropriate$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
            }
        }, 2, (Object) null);
        return false;
    }

    @JvmStatic
    public static final void setNotificationDurationAlarm(Context context, Class<?> thisClass, int notificationId, final int durationInMillis) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, thisClass);
        intent.setAction(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION);
        intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (durationInMillis >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setNotificationDurationAlarm$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting Notification duration alarm for " + durationInMillis + " ms";
                }
            }, 3, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + durationInMillis, broadcast);
        }
    }

    @JvmStatic
    public static final int getNotificationId(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getNotificationId$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Using notification id provided in the message's extras bundle: ", customNotificationId);
                }
            }, 3, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        String stringPlus = titleText != null ? Intrinsics.stringPlus("", titleText) : "";
        String contentText = payload.getContentText();
        if (contentText != null) {
            stringPlus = Intrinsics.stringPlus(stringPlus, contentText);
        }
        final int hashCode = stringPlus == null ? 0 : stringPlus.hashCode();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getNotificationId$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Message without notification id provided in the extras bundle received. Using a hash of the message: ", Integer.valueOf(hashCode));
            }
        }, 3, (Object) null);
        return hashCode;
    }

    @JvmStatic
    public static final int getNotificationPriority(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int intValue = notificationPriorityInt2.intValue();
        if (-2 <= intValue && intValue < 3) {
            return intValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getNotificationPriority$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Received invalid notification priority ", notificationPriorityInt);
            }
        }, 2, (Object) null);
        return 0;
    }

    @JvmStatic
    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider configurationProvider, Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(notificationExtras, null, context, configurationProvider, 2, null));
    }

    @JvmStatic
    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Object systemService;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = payload.getNotificationExtras();
        if (!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            systemService = context.getSystemService("uimode");
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to check for TV status during screen wake. Continuing.";
                }
            });
        }
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.UiModeManager");
        }
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not waking this TV UI mode device";
                }
            }, 3, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService2 = context.getSystemService("notification");
            if (systemService2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            final NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
            if (validNotificationChannel == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not waking screen on Android O+ device, could not find notification channel.";
                    }
                }, 3, (Object) null);
                return false;
            }
            if (validNotificationChannel.getImportance() == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Not acquiring wake-lock for Android O+ notification with importance: ", Integer.valueOf(validNotificationChannel.getImportance()));
                    }
                }, 3, (Object) null);
                return false;
            }
        } else if (getNotificationPriority(payload) == -2) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$5
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Waking screen for notification";
            }
        }, 3, (Object) null);
        Object systemService3 = context.getSystemService("power");
        if (systemService3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
        newWakeLock.acquire();
        newWakeLock.release();
        return true;
    }

    @JvmStatic
    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.getIsPushStory() && payload.getIsNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (final String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$prefetchBitmapsIfNewlyReceivedStoryPush$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Pre-fetching bitmap at URL: ", str);
                    }
                }, 2, (Object) null);
                Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    @JvmStatic
    public static final void setTitleIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setTitleIfPresent$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting title for notification";
            }
        }, 3, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.setContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    @JvmStatic
    public static final void setContentIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setContentIfPresent$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting content for notification";
            }
        }, 3, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.setContentText(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    @JvmStatic
    public static final void setTickerIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setTickerIfPresent$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting ticker for notification";
            }
        }, 3, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.setTicker(titleText);
    }

    @JvmStatic
    public static final void setContentIntentIfPresent(Context context, NotificationCompat.Builder notificationBuilder, Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            notificationBuilder.setContentIntent(INSTANCE.getPushActionPendingIntent(context, Constants.BRAZE_PUSH_CLICKED_ACTION, notificationExtras));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setContentIntentIfPresent$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Error setting content intent.";
                }
            });
        }
    }

    @JvmStatic
    public static final void setDeleteIntent(Context context, NotificationCompat.Builder notificationBuilder, Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent(Constants.BRAZE_PUSH_DELETED_ACTION).setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_P…otificationReceiverClass)");
            if (notificationExtras != null) {
                intent.putExtras(notificationExtras);
            }
            notificationBuilder.setDeleteIntent(PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setDeleteIntent$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Error setting delete intent.";
                }
            });
        }
    }

    @JvmStatic
    public static final int setSmallIcon(BrazeConfigurationProvider appConfigurationProvider, NotificationCompat.Builder notificationBuilder) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSmallIcon$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
                }
            }, 3, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSmallIcon$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting small icon for notification via resource id";
                }
            }, 3, (Object) null);
        }
        notificationBuilder.setSmallIcon(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    @JvmStatic
    public static final void setSetShowWhen(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSetShowWhen$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Set show when not supported in story push.";
                }
            }, 3, (Object) null);
            notificationBuilder.setShowWhen(false);
        }
    }

    @JvmStatic
    public static final boolean setLargeIconIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Large icon not supported in story push.";
                }
            }, 3, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting large icon for notification";
                }
            }, 3, (Object) null);
            largeIcon = payload.getLargeIcon();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Error setting large notification icon";
                }
            });
        }
        if (largeIcon != null) {
            notificationBuilder.setLargeIcon(Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
            }
        }, 3, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId != 0) {
            notificationBuilder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$5
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Large icon resource id not present for notification";
            }
        }, 3, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$7
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Large icon not set for notification";
            }
        }, 3, (Object) null);
        return false;
    }

    @JvmStatic
    public static final void setSoundIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (Intrinsics.areEqual(notificationSound, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting default sound for notification.";
                }
            }, 3, (Object) null);
            notificationBuilder.setDefaults(1);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting sound for notification via uri.";
                }
            }, 3, (Object) null);
            notificationBuilder.setSound(Uri.parse(notificationSound));
        }
    }

    @JvmStatic
    public static final void setSummaryTextIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting summary text for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.setSubText(summaryText);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Summary text not present. Not setting summary text for notification.";
                }
            }, 3, (Object) null);
        }
    }

    @JvmStatic
    public static final void setPriorityIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setPriorityIfPresentAndSupported$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting priority for notification";
            }
        }, 3, (Object) null);
        notificationBuilder.setPriority(getNotificationPriority(payload));
    }

    @JvmStatic
    public static final void setAccentColorIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setAccentColorIfPresentAndSupported$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Using accent color for notification from extras bundle";
                }
            }, 3, (Object) null);
            notificationBuilder.setColor(accentColor.intValue());
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setAccentColorIfPresentAndSupported$2$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Using default accent color for notification";
            }
        }, 3, (Object) null);
        notificationBuilder.setColor(configurationProvider.getDefaultNotificationAccentColor());
    }

    @JvmStatic
    public static final void setCategoryIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting category for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.setCategory(notificationCategory);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Category not present in notification extras. Not setting category for notification.";
                }
            }, 3, (Object) null);
        }
    }

    @JvmStatic
    public static final void setVisibilityIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            if (isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Setting visibility for notification";
                    }
                }, 3, (Object) null);
                notificationBuilder.setVisibility(notificationVisibility.intValue());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Received invalid notification visibility ", notificationVisibility);
                    }
                }, 2, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setPublicVersionIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle parseJsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (parseJsonObjectIntoBundle.isEmpty()) {
            return;
        }
        final BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(parseJsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Setting public version of notification with payload: ", BrazeNotificationPayload.this);
            }
        }, 3, (Object) null);
        setContentIfPresent(builder, brazeNotificationPayload);
        setTitleIfPresent(builder, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(builder, brazeNotificationPayload);
        setSmallIcon(configurationProvider, builder);
        setAccentColorIfPresentAndSupported(builder, brazeNotificationPayload);
        notificationBuilder.setPublicVersion(builder.build());
    }

    @JvmStatic
    public static final void logBaiduNotificationClick(Context context, final String customContentString) {
        if (customContentString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$logBaiduNotificationClick$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "customContentString was null. Doing nothing.";
                }
            }, 2, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$logBaiduNotificationClick$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot log baidu click with null context. Doing nothing.";
                }
            }, 2, (Object) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(customContentString);
            String optionalString = JsonUtils.getOptionalString(jSONObject, "source");
            String optionalString2 = JsonUtils.getOptionalString(jSONObject, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            if (optionalString == null || !Intrinsics.areEqual(optionalString, Constants.BRAZE) || optionalString2 == null) {
                return;
            }
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(optionalString2);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$logBaiduNotificationClick$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Caught an exception processing customContentString: ", customContentString);
                }
            });
        }
    }

    @JvmStatic
    public static final void handleCancelNotificationAction(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            if (intent.hasExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID)) {
                final int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Cancelling notification action with id: ", Integer.valueOf(intExtra));
                    }
                }, 3, (Object) null);
                Object systemService = context.getSystemService("notification");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                }
                ((NotificationManager) systemService).cancel(Constants.BRAZE_PUSH_NOTIFICATION_TAG, intExtra);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Exception occurred handling cancel notification intent.";
                }
            });
        }
    }

    @JvmStatic
    public static final void cancelNotification(Context context, final int notificationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$cancelNotification$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Cancelling notification action with id: ", Integer.valueOf(notificationId));
                }
            }, 3, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION).setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_C…otificationReceiverClass)");
            intent.setPackage(context.getPackageName());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$cancelNotification$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Exception occurred attempting to cancel notification.";
                }
            });
        }
    }

    @Deprecated(message = "Please use BrazeNotificationPayload().isUninstallTracking instead")
    @JvmStatic
    public static final boolean isUninstallTrackingPush(Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        try {
            if (notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY)) {
                return true;
            }
            Bundle bundle = notificationExtras.getBundle("extra");
            if (bundle != null) {
                return bundle.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$isUninstallTrackingPush$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to determine if push is uninstall tracking. Returning false.";
                }
            });
            return false;
        }
    }

    @JvmStatic
    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final String notificationChannelId = payload.getNotificationChannelId();
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = payload.getContext();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            Object systemService = context == null ? null : context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationChannelId != null) {
                if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getOrCreateNotificationChannelId$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return Intrinsics.stringPlus("Found notification channel in extras with id: ", notificationChannelId);
                        }
                    }, 3, (Object) null);
                    return notificationChannelId;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getOrCreateNotificationChannelId$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Notification channel from extras is invalid. No channel found with id: ", notificationChannelId);
                    }
                }, 3, (Object) null);
            }
            if (notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getOrCreateNotificationChannelId$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Braze default notification channel does not exist on device. Creating default channel.";
                    }
                }, 3, (Object) null);
                NotificationChannel notificationChannel = new NotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, configurationProvider == null ? null : configurationProvider.getDefaultNotificationChannelName(), 3);
                notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        } else if (notificationChannelId != null) {
            return notificationChannelId;
        }
        return Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
    }

    @JvmStatic
    public static final void setNotificationBadgeNumberIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Build.VERSION.SDK_INT < 26) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification badge number not supported on this android version. Not setting badge number for notification.";
                }
            }, 3, (Object) null);
            return;
        }
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.setNumber(notificationBadgeNumber.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:3:0x000c, B:6:0x0035, B:7:0x0038, B:10:0x0044, B:13:0x004b, B:15:0x005d, B:18:0x0064, B:19:0x006d, B:21:0x0079, B:24:0x007d, B:26:0x006a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #0 {Exception -> 0x0091, blocks: (B:3:0x000c, B:6:0x0035, B:7:0x0038, B:10:0x0044, B:13:0x004b, B:15:0x005d, B:18:0x0064, B:19:0x006d, B:21:0x0079, B:24:0x007d, B:26:0x006a), top: B:2:0x000c }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushStoryPageClicked(intent.getStringExtra(Constants.BRAZE_CAMPAIGN_ID), intent.getStringExtra(Constants.BRAZE_STORY_PAGE_ID));
            BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
            int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, 0);
            if (brazeConfigurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            final String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY);
            String str = stringExtra;
            if (str != null && !StringsKt.isBlank(str)) {
                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                String stringExtra2 = intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY);
                String str2 = stringExtra2;
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra2);
                }
                BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
                sendNotificationOpenedBroadcast(context, intent);
                if (!brazeConfigurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                    routeUserWithNotificationOpenedIntent(context, intent);
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationUtils, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Not handling deep links automatically, skipping deep link handling for '" + ((Object) stringExtra) + '\'';
                        }
                    }, 2, (Object) null);
                    return;
                }
            }
            intent.removeExtra("uri");
            BrazeNotificationUtils brazeNotificationUtils2 = INSTANCE;
            sendNotificationOpenedBroadcast(context, intent);
            if (!brazeConfigurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Caught exception while handling story click.";
                }
            });
        }
    }

    @JvmStatic
    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final String contentCardSyncData = payload.getContentCardSyncData();
        final String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$handleContentCardsSerializedCardIfPresent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push contains associated Content Cards card. User id: " + ((Object) contentCardSyncUserId) + " Card data: " + ((Object) contentCardSyncData);
            }
        }, 3, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    @JvmStatic
    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$sendNotificationOpenedBroadcast$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Sending notification opened broadcast";
            }
        }, 3, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        } else {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        }
    }

    @JvmStatic
    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        if (notificationExtras == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification extras bundle was null. Could not find a valid notification channel";
                }
            }, 3, (Object) null);
            return null;
        }
        final String string = notificationExtras.getString(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY, null);
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Found notification channel in extras with id: ", string);
                    }
                }, 3, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Notification channel from extras is invalid, no channel found with id: ", string);
                }
            }, 3, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$4
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Braze default notification channel does not exist on device.";
            }
        }, 3, (Object) null);
        return null;
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String action, Bundle notificationExtras) {
        Intent intent = new Intent(action).setClass(context, NotificationTrampolineActivity.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(action).setClass(…lineActivity::class.java)");
        if (notificationExtras != null) {
            intent.putExtras(notificationExtras);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(context, get… pushActionIntent, flags)");
        return activity;
    }

    static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i, Object obj) {
        if ((i & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    private final void sendPushActionIntent(Context context, final BrazeNotificationBroadcastType broadcastType, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intent intent;
        int i = WhenMappings.$EnumSwitchMapping$0[broadcastType.ordinal()];
        if (i == 1) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED).setPackage(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent, "{\n                Intent…ackageName)\n            }");
        } else if (i == 2) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED).setPackage(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent, "{\n                Intent…ackageName)\n            }");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED).setPackage(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent, "{\n                Intent…ackageName)\n            }");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$sendPushActionIntent$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Sending Braze broadcast receiver intent for ", BrazeNotificationUtils.BrazeNotificationBroadcastType.this);
            }
        }, 2, (Object) null);
        sendPushActionIntent(context, intent, notificationExtras);
        if (payload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, broadcastType.getBrazePushEventType(), payload);
        }
    }

    private final void sendPushActionIntent(Context context, final Intent pushIntent, Bundle notificationExtras) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$sendPushActionIntent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Sending push action intent: ", pushIntent);
            }
        }, 2, (Object) null);
        if (notificationExtras != null) {
            pushIntent.putExtras(notificationExtras);
        }
        IntentUtils.addComponentAndSendBroadcast(context, pushIntent);
    }
}
