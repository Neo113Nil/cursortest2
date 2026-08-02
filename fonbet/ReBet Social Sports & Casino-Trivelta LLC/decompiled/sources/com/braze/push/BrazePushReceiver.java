package com.braze.push;

import Ph.AbstractC1459k;
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
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.twilio.voice.EventKeys;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazePushReceiver extends BroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0007J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0002\b%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "<init>", "()V", "MESSAGE_TYPE_KEY", "", "DELETED_MESSAGES_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_INTENT_ACTION", "ADM_ERROR_KEY", "ADM_ERROR_DESCRIPTION_KEY", "ADM_REGISTRATION_ID_KEY", "ADM_UNREGISTERED_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "handlePush", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleReceivedIntent", "runOnThread", "", "handleAdmRegistrationEventIfEnabled", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "handleAdmRegistrationIntent", "handlePushNotificationPayload", "createPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "logNotificationMetadata", EventKeys.PAYLOAD, "logNotificationMetadata$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$0(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$1() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$2() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$0(String str, String str2) {
            return "Error during ADM registration: " + str + " description: " + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$1(String str) {
            return "Registering for ADM messages with registrationId: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$2(String str) {
            return "The device was un-registered from ADM: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$3() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, final Intent intent) {
            Context applicationContext = context.getApplicationContext();
            final String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePush$lambda$3;
                        handlePush$lambda$3 = BrazePushReceiver.Companion.handlePush$lambda$3(action, intent);
                        return handlePush$lambda$3;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r8.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        
            if (r8.equals("com.braze.action.STORY_TRAVERSE") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
        
            if (r8.equals("firebase_messaging_service_routing_action") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        
            if (r8.equals("hms_push_service_routing_action") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
        
            r1.handlePushNotificationPayload(r9, r10);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void handlePush$performWork(String str, Context context, final Intent intent, Context context2) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            Companion companion = BrazePushReceiver.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.F1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePush$performWork$lambda$0;
                    handlePush$performWork$lambda$0 = BrazePushReceiver.Companion.handlePush$performWork$lambda$0(intent);
                    return handlePush$performWork$lambda$0;
                }
            }, 6, (Object) null);
            if (str == null || str.length() == 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.L1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePush$performWork$lambda$1;
                        handlePush$performWork$lambda$1 = BrazePushReceiver.Companion.handlePush$performWork$lambda$1(intent);
                        return handlePush$performWork$lambda$1;
                    }
                }, 6, (Object) null);
                return;
            }
            Intrinsics.checkNotNull(context);
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            switch (str.hashCode()) {
                case -2147185193:
                    if (str.equals("com.braze.action.CANCEL_NOTIFICATION")) {
                        BrazeNotificationUtils.handleCancelNotificationAction(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
                case -1799205286:
                    if (str.equals("com.braze.action.BRAZE_ACTION_CLICKED")) {
                        BrazeNotificationActionUtils.handleNotificationActionClicked(context2, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
                case -1584985748:
                    break;
                case -1249868226:
                    if (str.equals("com.braze.action.BRAZE_PUSH_CLICKED")) {
                        BrazeNotificationUtils.handleNotificationOpened(context2, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
                case -743092218:
                    if (str.equals("com.amazon.device.messaging.intent.REGISTRATION")) {
                        companion.handleAdmRegistrationEventIfEnabled(new BrazeConfigurationProvider(context), context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
                case -711830027:
                    break;
                case -559929808:
                    if (str.equals("com.braze.action.BRAZE_PUSH_DELETED")) {
                        BrazeNotificationUtils.handleNotificationDeleted(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
                case 34673601:
                    if (str.equals("com.braze.action.BRAZE_STORY_CLICKED")) {
                        BrazeNotificationUtils.handlePushStoryPageClicked(context2, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
                case 1060266838:
                    break;
                case 1740454061:
                    break;
                default:
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePush$performWork$lambda$2;
                            handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                            return handlePush$performWork$lambda$2;
                        }
                    }, 6, (Object) null);
                    break;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$0(Intent intent) {
            return "Received broadcast message. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$1(Intent intent) {
            return "Push action is null. Not handling intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$2() {
            return "Received a message not sent from Braze. Ignoring the message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$0() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$1(int i10) {
            return "Firebase messaging 'total_deleted' reports " + i10 + " messages.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$10() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11(NotificationManagerCompat notificationManagerCompat) {
            return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompat.areNotificationsEnabled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Received silent push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$2(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$3() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$4$0(String str) {
            return "Push with identifier '" + str + "' has already been seen. Not displaying or forwarding push.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$5() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$6() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$7() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$8() {
            return "Received the initial Push Story notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$9(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            companion.handleReceivedIntent(context, intent, z10);
        }

        @JvmStatic
        @NotNull
        public final BrazeNotificationPayload createPayload(@NotNull Context context, @NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull Bundle notificationExtras, @NotNull Bundle brazeExtras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(brazeExtras, "brazeExtras");
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        @JvmStatic
        public final boolean handleAdmRegistrationEventIfEnabled(@NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull Context context, @NotNull final Intent intent) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.D1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationEventIfEnabled$lambda$0;
                    handleAdmRegistrationEventIfEnabled$lambda$0 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$0(intent);
                    return handleAdmRegistrationEventIfEnabled$lambda$0;
                }
            }, 6, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.G1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationEventIfEnabled$lambda$2;
                        handleAdmRegistrationEventIfEnabled$lambda$2 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$2();
                        return handleAdmRegistrationEventIfEnabled$lambda$2;
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.E1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationEventIfEnabled$lambda$1;
                    handleAdmRegistrationEventIfEnabled$lambda$1 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$1();
                    return handleAdmRegistrationEventIfEnabled$lambda$1;
                }
            }, 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        @JvmStatic
        public final boolean handleAdmRegistrationIntent(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            final String stringExtra = intent.getStringExtra("error");
            final String stringExtra2 = intent.getStringExtra("error_description");
            final String stringExtra3 = intent.getStringExtra("registration_id");
            final String stringExtra4 = intent.getStringExtra("unregistered");
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.H1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$0;
                        handleAdmRegistrationIntent$lambda$0 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$0(stringExtra, stringExtra2);
                        return handleAdmRegistrationIntent$lambda$0;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.I1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$1;
                        handleAdmRegistrationIntent$lambda$1 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$1(stringExtra3);
                        return handleAdmRegistrationIntent$lambda$1;
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.J1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$2;
                        handleAdmRegistrationIntent$lambda$2 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$2(stringExtra4);
                        return handleAdmRegistrationIntent$lambda$2;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.K1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationIntent$lambda$3;
                    handleAdmRegistrationIntent$lambda$3 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$3();
                    return handleAdmRegistrationIntent$lambda$3;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final boolean handlePushNotificationPayload(@NotNull Context context, @NotNull Intent intent) {
            Companion companion;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.N1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$0;
                        handlePushNotificationPayload$lambda$0 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$0();
                        return handlePushNotificationPayload$lambda$0;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (Intrinsics.areEqual("deleted_messages", intent.getStringExtra("message_type"))) {
                final int intExtra = intent.getIntExtra("total_deleted", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.S1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$1;
                        handlePushNotificationPayload$lambda$1 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$1(intExtra);
                        return handlePushNotificationPayload$lambda$1;
                    }
                }, 6, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29471I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: T3.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$2;
                    handlePushNotificationPayload$lambda$2 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$2(extras);
                    return handlePushNotificationPayload$lambda$2;
                }
            }, 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey("braze_push_received_timestamp")) {
                extras.putLong("braze_push_received_timestamp", DateTimeUtils.nowInMilliseconds());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            final BrazeNotificationPayload createPayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (createPayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: T3.w1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$3;
                        handlePushNotificationPayload$lambda$3 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$3();
                        return handlePushNotificationPayload$lambda$3;
                    }
                }, 6, (Object) null);
                return false;
            }
            final String pushUniqueId = createPayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) BrazePushReceiver.INSTANCE, priority, (Throwable) null, false, new Function0() { // from class: T3.x1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$4$0;
                        handlePushNotificationPayload$lambda$4$0 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$4$0(pushUniqueId);
                        return handlePushNotificationPayload$lambda$4$0;
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(createPayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(createPayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(createPayload);
            if (createPayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.y1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$5;
                        handlePushNotificationPayload$lambda$5 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$5();
                        return handlePushNotificationPayload$lambda$5;
                    }
                }, 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.R1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$14;
                        handlePushNotificationPayload$lambda$14 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$14();
                        return handlePushNotificationPayload$lambda$14;
                    }
                }, 7, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$6;
                    handlePushNotificationPayload$lambda$6 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$6();
                    return handlePushNotificationPayload$lambda$6;
                }
            }, 7, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(createPayload);
            extras.putInt("nid", notificationId);
            if (createPayload.getIsPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.A1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushNotificationPayload$lambda$7;
                            handlePushNotificationPayload$lambda$7 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$7();
                            return handlePushNotificationPayload$lambda$7;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                if (!extras.containsKey("braze_story_newly_received")) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.B1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushNotificationPayload$lambda$8;
                            handlePushNotificationPayload$lambda$8 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$8();
                            return handlePushNotificationPayload$lambda$8;
                        }
                    }, 7, (Object) null);
                    extras.putBoolean("braze_story_newly_received", true);
                }
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.C1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$9;
                    handlePushNotificationPayload$lambda$9 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$9(BrazeNotificationPayload.this);
                    return handlePushNotificationPayload$lambda$9;
                }
            }, 6, (Object) null);
            Notification createNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(createPayload);
            if (createNotification == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.O1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$10;
                        handlePushNotificationPayload$lambda$10 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$10();
                        return handlePushNotificationPayload$lambda$10;
                    }
                }, 7, (Object) null);
                return false;
            }
            final NotificationManagerCompat from = NotificationManagerCompat.from(context);
            Intrinsics.checkNotNullExpressionValue(from, "from(...)");
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.P1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$11;
                    handlePushNotificationPayload$lambda$11 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11(NotificationManagerCompat.this);
                    return handlePushNotificationPayload$lambda$11;
                }
            }, 7, (Object) null);
            if (AbstractC5338c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                from.notify("appboy_notification", notificationId, createNotification);
                companion = this;
            } else {
                companion = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.Q1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$12;
                        handlePushNotificationPayload$lambda$12 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$12();
                        return handlePushNotificationPayload$lambda$12;
                    }
                }, 7, (Object) null);
            }
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = createPayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            companion.logNotificationMetadata$android_sdk_ui_release(context, createPayload);
            return true;
        }

        @JvmStatic
        @JvmOverloads
        public final void handleReceivedIntent(@NotNull Context context, @NotNull Intent intent, boolean runOnThread) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (runOnThread) {
                AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3, null);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(@NotNull Context context, @NotNull BrazeNotificationPayload payload) {
            String campaignId;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.getIsPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long coerceAtLeast = RangesKt.coerceAtLeast(payload.getFlushMinMinutes(), 0L);
                long coerceAtLeast2 = RangesKt.coerceAtLeast(payload.getFlushMaxMinutes(), coerceAtLeast);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(coerceAtLeast);
                if (coerceAtLeast2 > coerceAtLeast) {
                    millis = Random.INSTANCE.nextLong(millis, timeUnit.toMillis(coerceAtLeast2));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Companion.handleReceivedIntent$default(INSTANCE, context, intent, false, 4, null);
    }
}
