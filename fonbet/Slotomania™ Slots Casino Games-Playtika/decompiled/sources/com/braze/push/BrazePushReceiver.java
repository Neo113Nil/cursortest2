package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: BrazePushReceiver.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BrazePushReceiver extends BroadcastReceiver {
    private static final String ADM_ERROR_DESCRIPTION_KEY = "error_description";
    private static final String ADM_ERROR_KEY = "error";
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
    private static final String ADM_UNREGISTERED_KEY = "unregistered";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DELETED_MESSAGES_KEY = "deleted_messages";
    public static final String FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION = "firebase_messaging_service_routing_action";
    public static final String HMS_PUSH_SERVICE_ROUTING_ACTION = "hms_push_service_routing_action";
    private static final String MESSAGE_TYPE_KEY = "message_type";
    private static final String NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";

    @JvmStatic
    public static final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
        return INSTANCE.createPayload(context, brazeConfigurationProvider, bundle, bundle2);
    }

    @JvmStatic
    public static final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
        return INSTANCE.handleAdmRegistrationEventIfEnabled(brazeConfigurationProvider, context, intent);
    }

    @JvmStatic
    public static final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
        return INSTANCE.handleAdmRegistrationIntent(context, intent);
    }

    @JvmStatic
    public static final boolean handlePushNotificationPayload(Context context, Intent intent) {
        return INSTANCE.handlePushNotificationPayload(context, intent);
    }

    @JvmStatic
    public static final void handleReceivedIntent(Context context, Intent intent) {
        INSTANCE.handleReceivedIntent(context, intent);
    }

    @JvmStatic
    public static final void handleReceivedIntent(Context context, Intent intent, boolean z) {
        INSTANCE.handleReceivedIntent(context, intent, z);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Companion.handleReceivedIntent$default(INSTANCE, context, intent, false, 4, null);
    }

    /* compiled from: BrazePushReceiver.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\"\u0010 \u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u0019H\u0007J\u001d\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H\u0001¢\u0006\u0002\b$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "()V", "ADM_ERROR_DESCRIPTION_KEY", "", "ADM_ERROR_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_ID_KEY", "ADM_REGISTRATION_INTENT_ACTION", "ADM_UNREGISTERED_KEY", "DELETED_MESSAGES_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "MESSAGE_TYPE_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "createPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "context", "Landroid/content/Context;", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "handleAdmRegistrationEventIfEnabled", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "handleAdmRegistrationIntent", "handlePush", "", "handlePushNotificationPayload", "handleReceivedIntent", "runOnThread", "logNotificationMetadata", "payload", "logNotificationMetadata$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void handleReceivedIntent(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            handleReceivedIntent$default(this, context, intent, false, 4, null);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, final Intent intent) {
            Context applicationContext = context.getApplicationContext();
            final String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Caught exception while performing the push notification handling work. Action: " + ((Object) action) + " Intent: " + intent;
                    }
                });
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r14.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        
            if (r14.equals(com.braze.Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        
            if (r14.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
        
            if (r14.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0097, code lost:
        
            com.braze.push.BrazePushReceiver.INSTANCE.handlePushNotificationPayload(r15, r16);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void handlePush$performWork(String str, Context applicationContext, final Intent intent, Context context) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Received broadcast message. Message: ", intent);
                }
            }, 2, (Object) null);
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Push action is null. Not handling intent: ", intent);
                    }
                }, 2, (Object) null);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            BrazeInternal.applyPendingRuntimeConfiguration(applicationContext);
            switch (str.hashCode()) {
                case -2147185193:
                    if (str.equals(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION)) {
                        BrazeNotificationUtils.handleCancelNotificationAction(applicationContext, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
                case -1799205286:
                    if (str.equals(Constants.BRAZE_ACTION_CLICKED_ACTION)) {
                        BrazeNotificationActionUtils.handleNotificationActionClicked(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
                case -1584985748:
                    break;
                case -1249868226:
                    if (str.equals(Constants.BRAZE_PUSH_CLICKED_ACTION)) {
                        BrazeNotificationUtils.handleNotificationOpened(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
                case -743092218:
                    if (str.equals(BrazePushReceiver.ADM_REGISTRATION_INTENT_ACTION)) {
                        BrazePushReceiver.INSTANCE.handleAdmRegistrationEventIfEnabled(new BrazeConfigurationProvider(applicationContext), applicationContext, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
                case -711830027:
                    break;
                case -559929808:
                    if (str.equals(Constants.BRAZE_PUSH_DELETED_ACTION)) {
                        BrazeNotificationUtils.handleNotificationDeleted(applicationContext, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
                case 34673601:
                    if (str.equals(Constants.BRAZE_STORY_CLICKED_ACTION)) {
                        BrazeNotificationUtils.handlePushStoryPageClicked(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
                case 1060266838:
                    break;
                case 1740454061:
                    break;
                default:
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received a message not sent from Braze. Ignoring the message.";
                        }
                    }, 2, (Object) null);
                    break;
            }
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            companion.handleReceivedIntent(context, intent, z);
        }

        @JvmStatic
        public final void handleReceivedIntent(Context context, Intent intent, boolean runOnThread) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (runOnThread) {
                BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3, null);
            } else {
                handlePush(context, intent);
            }
        }

        @JvmStatic
        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider appConfigurationProvider, Context context, final Intent intent) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Received ADM registration. Message: ", intent);
                }
            }, 2, (Object) null);
            if (Constants.isAmazonDevice() && appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
                    }
                }, 3, (Object) null);
                handleAdmRegistrationIntent(context, intent);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
                }
            }, 2, (Object) null);
            return false;
        }

        @JvmStatic
        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            final String stringExtra = intent.getStringExtra("error");
            final String stringExtra2 = intent.getStringExtra("error_description");
            final String stringExtra3 = intent.getStringExtra(BrazePushReceiver.ADM_REGISTRATION_ID_KEY);
            final String stringExtra4 = intent.getStringExtra(BrazePushReceiver.ADM_UNREGISTERED_KEY);
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Error during ADM registration: " + ((Object) stringExtra) + " description: " + ((Object) stringExtra2);
                    }
                }, 2, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Registering for ADM messages with registrationId: ", stringExtra3);
                    }
                }, 2, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("The device was un-registered from ADM: ", stringExtra4);
                    }
                }, 2, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
                }
            }, 2, (Object) null);
            return false;
        }

        @JvmStatic
        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not handling non-Braze push message.";
                    }
                }, 3, (Object) null);
                return false;
            }
            if (Intrinsics.areEqual("deleted_messages", intent.getStringExtra("message_type"))) {
                final int intExtra = intent.getIntExtra(BrazePushReceiver.NUMBER_OF_MESSAGES_DELETED_KEY, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Firebase messaging 'total_deleted' reports " + intExtra + " messages.";
                    }
                }, 2, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Push message payload received: ", extras);
                }
            }, 2, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
                extras.putLong(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS, System.currentTimeMillis());
            }
            BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
            final BrazeNotificationPayload createPayload = createPayload(context, brazeConfigurationProvider, extras, attachedBrazeExtras);
            if (createPayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
                    }
                }, 2, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(createPayload);
            if (createPayload.getShouldFetchTestTriggers() && brazeConfigurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getMActivity() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$5
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
                    }
                }, 3, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$6
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Received visible push notification";
                    }
                }, 3, (Object) null);
                int notificationId = BrazeNotificationUtils.getNotificationId(createPayload);
                extras.putInt(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
                if (createPayload.getIsPushStory()) {
                    if (Constants.isAmazonDevice()) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$7
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Push stories not supported on Amazon devices.";
                            }
                        }, 3, (Object) null);
                        return false;
                    }
                    if (!extras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$8
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Received the initial Push Story notification.";
                            }
                        }, 3, (Object) null);
                        extras.putBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$9
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Creating notification with payload:\n", BrazeNotificationPayload.this);
                    }
                }, 2, (Object) null);
                Notification createNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(createPayload);
                if (createNotification == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$10
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Notification created by notification factory was null. Not displaying notification.";
                        }
                    }, 3, (Object) null);
                    return false;
                }
                final NotificationManagerCompat from = NotificationManagerCompat.from(context);
                Intrinsics.checkNotNullExpressionValue(from, "from(context)");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$11
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Value of notificationManager.areNotificationsEnabled() = ", Boolean.valueOf(NotificationManagerCompat.this.areNotificationsEnabled()));
                    }
                }, 3, (Object) null);
                from.notify(Constants.BRAZE_PUSH_NOTIFICATION_TAG, notificationId, createNotification);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
                BrazeNotificationUtils.wakeScreenIfAppropriate(context, brazeConfigurationProvider, extras);
                Integer pushDuration = createPayload.getPushDuration();
                if (pushDuration != null) {
                    BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
                }
                logNotificationMetadata$android_sdk_ui_release(context, createPayload);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$13
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Received silent push notification";
                }
            }, 3, (Object) null);
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
            BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate(createPayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(createPayload);
            return false;
        }

        @JvmStatic
        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider appConfigurationProvider, Bundle notificationExtras, Bundle brazeExtras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(brazeExtras, "brazeExtras");
            if (Constants.isAmazonDevice()) {
                return new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider);
            }
            return new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload payload) {
            String campaignId;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.getIsPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long coerceAtLeast = RangesKt.coerceAtLeast(payload.getFlushMinMinutes(), 0L);
                long coerceAtLeast2 = RangesKt.coerceAtLeast(payload.getFlushMaxMinutes(), coerceAtLeast);
                long millis = TimeUnit.MINUTES.toMillis(coerceAtLeast);
                if (coerceAtLeast2 > coerceAtLeast) {
                    millis = Random.INSTANCE.nextLong(millis, TimeUnit.MINUTES.toMillis(coerceAtLeast2));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 == null) {
                return;
            }
            BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
        }
    }
}
