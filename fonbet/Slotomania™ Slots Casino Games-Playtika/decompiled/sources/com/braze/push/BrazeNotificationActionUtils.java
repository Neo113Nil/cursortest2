package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BrazeNotificationActionUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¨\u0006\u0014"}, d2 = {"Lcom/braze/push/BrazeNotificationActionUtils;", "", "()V", "addNotificationAction", "", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "actionButton", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "addNotificationActions", "handleNotificationActionClicked", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "logNotificationActionClicked", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    @JvmStatic
    public static final void addNotificationActions(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationActions$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Context cannot be null when adding notification buttons.";
                }
            }, 3, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationActions$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "No action buttons present. Not adding notification actions";
                }
            }, 3, (Object) null);
            return;
        }
        for (final BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationActions$3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Adding action button: ", BrazeNotificationPayload.ActionButton.this);
                }
            }, 2, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[Catch: Exception -> 0x00e3, TryCatch #0 {Exception -> 0x00e3, blocks: (B:3:0x000e, B:5:0x0019, B:8:0x0021, B:10:0x002f, B:17:0x0046, B:20:0x0064, B:23:0x0070, B:26:0x0077, B:28:0x007e, B:31:0x009f, B:33:0x00ad, B:36:0x00b1, B:38:0x008c, B:40:0x0092, B:41:0x009c, B:42:0x0050, B:45:0x0059, B:47:0x005d, B:50:0x00c1, B:52:0x00d1), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: Exception -> 0x00e3, TryCatch #0 {Exception -> 0x00e3, blocks: (B:3:0x000e, B:5:0x0019, B:8:0x0021, B:10:0x002f, B:17:0x0046, B:20:0x0064, B:23:0x0070, B:26:0x0077, B:28:0x007e, B:31:0x009f, B:33:0x00ad, B:36:0x00b1, B:38:0x008c, B:40:0x0092, B:41:0x009c, B:42:0x0050, B:45:0x0059, B:47:0x005d, B:50:0x00c1, B:52:0x00d1), top: B:2:0x000e }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void handleNotificationActionClicked(Context context, Intent intent) {
        Bundle extras;
        Bundle extras2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_TYPE_KEY);
            String str = stringExtra;
            if (str != null && !StringsKt.isBlank(str)) {
                int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
                brazeNotificationActionUtils.logNotificationActionClicked(context, intent, stringExtra);
                if (stringExtra != null) {
                    int hashCode = stringExtra.hashCode();
                    if (hashCode == -1424488370) {
                        if (!stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI)) {
                        }
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        if (Intrinsics.areEqual(stringExtra, Constants.BRAZE_PUSH_ACTION_TYPE_URI)) {
                            intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                            extras2 = intent.getExtras();
                            if (extras2 != null) {
                                intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY));
                            }
                            BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                            if (!new BrazeConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                            }
                        }
                        intent.removeExtra("uri");
                        BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                        if (!new BrazeConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                        }
                    } else if (hashCode != -1209677674) {
                        if (hashCode == -1209647192) {
                            if (!stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_OPEN)) {
                            }
                            BrazeNotificationUtils.cancelNotification(context, intExtra);
                            if (Intrinsics.areEqual(stringExtra, Constants.BRAZE_PUSH_ACTION_TYPE_URI) && (extras = intent.getExtras()) != null && extras.containsKey(Constants.BRAZE_ACTION_URI_KEY)) {
                                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                                extras2 = intent.getExtras();
                                if (extras2 != null && extras2.containsKey(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY)) {
                                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY));
                                }
                                BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                                if (!new BrazeConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                                    BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                                    return;
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationActionUtils, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final String invoke() {
                                            return "Not handling deep links automatically, skipping deep link handling";
                                        }
                                    }, 2, (Object) null);
                                    return;
                                }
                            }
                            intent.removeExtra("uri");
                            BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                            if (!new BrazeConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                            }
                        }
                    } else if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_NONE)) {
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        return;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationActionUtils, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Unknown notification action button clicked. Doing nothing.";
                    }
                }, 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification action button type was blank or null. Doing nothing.";
                }
            }, 2, (Object) null);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Caught exception while handling notification action button click.";
                }
            });
        }
    }

    public final void addNotificationAction(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot add notification action with null context from payload";
                }
            }, 3, (Object) null);
            return;
        }
        final Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        final String type = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if (Intrinsics.areEqual(Constants.BRAZE_PUSH_ACTION_TYPE_NONE, type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Adding notification action with type: " + ((Object) type) + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
                }
            }, 2, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…ceiverClass\n            )");
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            Intrinsics.checkNotNullExpressionValue(activity, "getBroadcast(\n          …IntentFlags\n            )");
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Adding notification action with type: " + ((Object) type) + " Setting intent class to trampoline activity";
                }
            }, 2, (Object) null);
            Intent intent2 = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_A…lineActivity::class.java)");
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …IntentFlags\n            )");
        }
        NotificationCompat.Action.Builder builder = new NotificationCompat.Action.Builder(0, actionButton.getText(), activity);
        builder.addExtras(new Bundle(bundle));
        notificationBuilder.addAction(builder.build());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Added action with bundle: ", bundle);
            }
        }, 2, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String actionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Braze.INSTANCE.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY), intent.getStringExtra(Constants.BRAZE_ACTION_ID_KEY), actionType);
    }
}
