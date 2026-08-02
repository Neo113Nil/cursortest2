package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.o;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationActionUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/braze/push/BrazeNotificationActionUtils;", "", "<init>", "()V", "Landroidx/core/app/o$e;", "notificationBuilder", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "", "addNotificationActions", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "handleNotificationActionClicked", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButton", "addNotificationAction", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;)V", "", "actionType", "logNotificationActionClicked", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeNotificationActionUtils {

    @NotNull
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$0() {
        return "Cannot add notification action with null context from payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$1(String str) {
        return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$2(String str) {
        return "Adding notification action with type: " + str + " Setting intent class to trampoline activity";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$3(Bundle bundle) {
        return "Added action with bundle: " + bundle;
    }

    @JvmStatic
    public static final void addNotificationActions(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addNotificationActions$lambda$0;
                    addNotificationActions$lambda$0 = BrazeNotificationActionUtils.addNotificationActions$lambda$0();
                    return addNotificationActions$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addNotificationActions$lambda$1;
                    addNotificationActions$lambda$1 = BrazeNotificationActionUtils.addNotificationActions$lambda$1();
                    return addNotificationActions$lambda$1;
                }
            }, 7, (Object) null);
            return;
        }
        for (final BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addNotificationActions$lambda$2;
                    addNotificationActions$lambda$2 = BrazeNotificationActionUtils.addNotificationActions$lambda$2(BrazeNotificationPayload.ActionButton.this);
                    return addNotificationActions$lambda$2;
                }
            }, 6, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$0() {
        return "Context cannot be null when adding notification buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$1() {
        return "No action buttons present. Not adding notification actions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$2(BrazeNotificationPayload.ActionButton actionButton) {
        return "Adding action button: " + actionButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:17:0x0043, B:20:0x0060, B:23:0x006b, B:25:0x0071, B:27:0x0078, B:29:0x0085, B:31:0x008b, B:32:0x0098, B:34:0x00a7, B:37:0x00ab, B:39:0x0095, B:40:0x004c, B:43:0x0055, B:45:0x0059, B:48:0x00bc, B:50:0x00cd), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:17:0x0043, B:20:0x0060, B:23:0x006b, B:25:0x0071, B:27:0x0078, B:29:0x0085, B:31:0x008b, B:32:0x0098, B:34:0x00a7, B:37:0x00ab, B:39:0x0095, B:40:0x004c, B:43:0x0055, B:45:0x0059, B:48:0x00bc, B:50:0x00cd), top: B:2:0x000e }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void handleNotificationActionClicked(@NotNull Context context, @NotNull Intent intent) {
        Bundle extras;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra("braze_action_type");
            if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
                int intExtra = intent.getIntExtra("nid", -1);
                BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
                brazeNotificationActionUtils.logNotificationActionClicked(context, intent, stringExtra);
                if (stringExtra != null) {
                    int hashCode = stringExtra.hashCode();
                    if (hashCode == -1424488370) {
                        if (!stringExtra.equals("ab_uri")) {
                        }
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        if (Intrinsics.areEqual(stringExtra, "ab_uri")) {
                        }
                        intent.removeExtra("uri");
                        BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                        if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                        }
                    } else if (hashCode != -1209677674) {
                        if (hashCode == -1209647192 && stringExtra.equals("ab_open")) {
                            BrazeNotificationUtils.cancelNotification(context, intExtra);
                            if (Intrinsics.areEqual(stringExtra, "ab_uri") || (extras = intent.getExtras()) == null || !extras.containsKey("braze_action_uri")) {
                                intent.removeExtra("uri");
                            } else {
                                intent.putExtra("uri", intent.getStringExtra("braze_action_uri"));
                                Bundle extras2 = intent.getExtras();
                                if (extras2 != null && extras2.containsKey("braze_action_use_webview")) {
                                    intent.putExtra("ab_use_webview", intent.getStringExtra("braze_action_use_webview"));
                                }
                            }
                            BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String handleNotificationActionClicked$lambda$1;
                                        handleNotificationActionClicked$lambda$1 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$1();
                                        return handleNotificationActionClicked$lambda$1;
                                    }
                                }, 6, (Object) null);
                                return;
                            } else {
                                BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                                return;
                            }
                        }
                    } else if (stringExtra.equals("ab_none")) {
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        return;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleNotificationActionClicked$lambda$2;
                        handleNotificationActionClicked$lambda$2 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$2();
                        return handleNotificationActionClicked$lambda$2;
                    }
                }, 6, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationActionClicked$lambda$0;
                    handleNotificationActionClicked$lambda$0 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$0();
                    return handleNotificationActionClicked$lambda$0;
                }
            }, 6, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationActionClicked$lambda$3;
                    handleNotificationActionClicked$lambda$3 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$3();
                    return handleNotificationActionClicked$lambda$3;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$0() {
        return "Notification action button type was blank or null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$1() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$2() {
        return "Unknown notification action button clicked. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$3() {
        return "Caught exception while handling notification action button click.";
    }

    public final void addNotificationAction(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload, @NotNull BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addNotificationAction$lambda$0;
                    addNotificationAction$lambda$0 = BrazeNotificationActionUtils.addNotificationAction$lambda$0();
                    return addNotificationAction$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        final Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        final String type = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if (Intrinsics.areEqual("ab_none", type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addNotificationAction$lambda$1;
                    addNotificationAction$lambda$1 = BrazeNotificationActionUtils.addNotificationAction$lambda$1(type);
                    return addNotificationAction$lambda$1;
                }
            }, 6, (Object) null);
            Intent intent = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            Intrinsics.checkNotNullExpressionValue(activity, "getBroadcast(...)");
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addNotificationAction$lambda$2;
                    addNotificationAction$lambda$2 = BrazeNotificationActionUtils.addNotificationAction$lambda$2(type);
                    return addNotificationAction$lambda$2;
                }
            }, 6, (Object) null);
            Intent intent2 = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent2, "setClass(...)");
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        }
        o.a.C0359a c0359a = new o.a.C0359a(0, actionButton.getText(), activity);
        c0359a.a(new Bundle(bundle));
        notificationBuilder.b(c0359a.c());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addNotificationAction$lambda$3;
                addNotificationAction$lambda$3 = BrazeNotificationActionUtils.addNotificationAction$lambda$3(bundle);
                return addNotificationAction$lambda$3;
            }
        }, 6, (Object) null);
    }

    public final void logNotificationActionClicked(@NotNull Context context, @NotNull Intent intent, @Nullable String actionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Braze.INSTANCE.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra("cid"), intent.getStringExtra("braze_action_id"), actionType);
    }
}
