package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
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
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0007J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0002\b%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "<init>", "()V", "MESSAGE_TYPE_KEY", "", "DELETED_MESSAGES_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_INTENT_ACTION", "ADM_ERROR_KEY", "ADM_ERROR_DESCRIPTION_KEY", "ADM_REGISTRATION_ID_KEY", "ADM_UNREGISTERED_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "handlePush", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "handleReceivedIntent", "runOnThread", "", "handleAdmRegistrationEventIfEnabled", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "handleAdmRegistrationIntent", "handlePushNotificationPayload", "createPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "logNotificationMetadata", "payload", "logNotificationMetadata$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePush$lambda$3;
                        handlePush$lambda$3 = BrazePushReceiver.Companion.handlePush$lambda$3(action, intent);
                        return handlePush$lambda$3;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        
            if (r17.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
        
            com.braze.push.BrazePushReceiver.INSTANCE.handlePushNotificationPayload(r18, r19);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r17.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        
            if (r17.equals(com.braze.Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        
            if (r17.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L56;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void handlePush$performWork(String str, Context context, final Intent intent, Context context2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BrazePushReceiver.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePush$performWork$lambda$0;
                    handlePush$performWork$lambda$0 = BrazePushReceiver.Companion.handlePush$performWork$lambda$0(intent);
                    return handlePush$performWork$lambda$0;
                }
            }, 6, (Object) null);
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda14
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
            if (str != null) {
                switch (str.hashCode()) {
                    case -2147185193:
                        if (str.equals(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION)) {
                            BrazeNotificationUtils.handleCancelNotificationAction(context, intent);
                            break;
                        }
                        break;
                    case -1799205286:
                        if (str.equals(Constants.BRAZE_ACTION_CLICKED_ACTION)) {
                            BrazeNotificationActionUtils.handleNotificationActionClicked(context2, intent);
                            break;
                        }
                        break;
                    case -1584985748:
                        break;
                    case -1249868226:
                        if (str.equals(Constants.BRAZE_PUSH_CLICKED_ACTION)) {
                            BrazeNotificationUtils.handleNotificationOpened(context2, intent);
                            break;
                        }
                        break;
                    case -743092218:
                        if (str.equals(BrazePushReceiver.ADM_REGISTRATION_INTENT_ACTION)) {
                            BrazePushReceiver.INSTANCE.handleAdmRegistrationEventIfEnabled(new BrazeConfigurationProvider(context), context, intent);
                            break;
                        }
                        break;
                    case -711830027:
                        break;
                    case -559929808:
                        if (str.equals(Constants.BRAZE_PUSH_DELETED_ACTION)) {
                            BrazeNotificationUtils.handleNotificationDeleted(context, intent);
                            break;
                        }
                        break;
                    case 34673601:
                        if (str.equals(Constants.BRAZE_STORY_CLICKED_ACTION)) {
                            BrazeNotificationUtils.handlePushStoryPageClicked(context2, intent);
                            break;
                        }
                        break;
                    case 1060266838:
                        break;
                    case 1740454061:
                        break;
                }
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BrazePushReceiver.INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePush$performWork$lambda$2;
                    handlePush$performWork$lambda$2 = BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
                    return handlePush$performWork$lambda$2;
                }
            }, 6, (Object) null);
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
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$4(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        @JvmStatic
        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider appConfigurationProvider, Context context, final Intent intent) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationEventIfEnabled$lambda$4;
                    handleAdmRegistrationEventIfEnabled$lambda$4 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$4(intent);
                    return handleAdmRegistrationEventIfEnabled$lambda$4;
                }
            }, 6, (Object) null);
            if (Constants.isAmazonDevice() && appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationEventIfEnabled$lambda$5;
                        handleAdmRegistrationEventIfEnabled$lambda$5 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$5();
                        return handleAdmRegistrationEventIfEnabled$lambda$5;
                    }
                }, 7, (Object) null);
                handleAdmRegistrationIntent(context, intent);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationEventIfEnabled$lambda$6;
                    handleAdmRegistrationEventIfEnabled$lambda$6 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$6();
                    return handleAdmRegistrationEventIfEnabled$lambda$6;
                }
            }, 6, (Object) null);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$5() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$6() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$7;
                        handleAdmRegistrationIntent$lambda$7 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$7(stringExtra, stringExtra2);
                        return handleAdmRegistrationIntent$lambda$7;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$8;
                        handleAdmRegistrationIntent$lambda$8 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$8(stringExtra3);
                        return handleAdmRegistrationIntent$lambda$8;
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$9;
                        handleAdmRegistrationIntent$lambda$9 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$9(stringExtra4);
                        return handleAdmRegistrationIntent$lambda$9;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationIntent$lambda$10;
                    handleAdmRegistrationIntent$lambda$10 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$10();
                    return handleAdmRegistrationIntent$lambda$10;
                }
            }, 6, (Object) null);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$7(String str, String str2) {
            return "Error during ADM registration: " + str + " description: " + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$8(String str) {
            return "Registering for ADM messages with registrationId: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$9(String str) {
            return "The device was un-registered from ADM: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$10() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        @JvmStatic
        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            Companion companion;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$11;
                        handlePushNotificationPayload$lambda$11 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11();
                        return handlePushNotificationPayload$lambda$11;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (Intrinsics.areEqual("deleted_messages", intent.getStringExtra("message_type"))) {
                final int intExtra = intent.getIntExtra(BrazePushReceiver.NUMBER_OF_MESSAGES_DELETED_KEY, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$12;
                        handlePushNotificationPayload$lambda$12 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$12(intExtra);
                        return handlePushNotificationPayload$lambda$12;
                    }
                }, 6, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$13;
                    handlePushNotificationPayload$lambda$13 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$13(extras);
                    return handlePushNotificationPayload$lambda$13;
                }
            }, 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
                extras.putLong(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS, DateTimeUtils.nowInMilliseconds());
            }
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            final BrazeNotificationPayload createPayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (createPayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$14;
                        handlePushNotificationPayload$lambda$14 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$14();
                        return handlePushNotificationPayload$lambda$14;
                    }
                }, 6, (Object) null);
                return false;
            }
            final String pushUniqueId = createPayload.getPushUniqueId();
            if (pushUniqueId != null && !BrazeInternal.INSTANCE.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BrazePushReceiver.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$16$lambda$15;
                        handlePushNotificationPayload$lambda$16$lambda$15 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$16$lambda$15(pushUniqueId);
                        return handlePushNotificationPayload$lambda$16$lambda$15;
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(createPayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(createPayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(createPayload);
            if (createPayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$17;
                        handlePushNotificationPayload$lambda$17 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$17();
                        return handlePushNotificationPayload$lambda$17;
                    }
                }, 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$18;
                        handlePushNotificationPayload$lambda$18 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$18();
                        return handlePushNotificationPayload$lambda$18;
                    }
                }, 7, (Object) null);
                int notificationId = BrazeNotificationUtils.getNotificationId(createPayload);
                extras.putInt(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
                if (createPayload.getIsPushStory()) {
                    if (Constants.isAmazonDevice()) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String handlePushNotificationPayload$lambda$19;
                                handlePushNotificationPayload$lambda$19 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$19();
                                return handlePushNotificationPayload$lambda$19;
                            }
                        }, 7, (Object) null);
                        return false;
                    }
                    if (!extras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String handlePushNotificationPayload$lambda$20;
                                handlePushNotificationPayload$lambda$20 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$20();
                                return handlePushNotificationPayload$lambda$20;
                            }
                        }, 7, (Object) null);
                        extras.putBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$21;
                        handlePushNotificationPayload$lambda$21 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$21(BrazeNotificationPayload.this);
                        return handlePushNotificationPayload$lambda$21;
                    }
                }, 6, (Object) null);
                Notification createNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(createPayload);
                if (createNotification == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushNotificationPayload$lambda$22;
                            handlePushNotificationPayload$lambda$22 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$22();
                            return handlePushNotificationPayload$lambda$22;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                final NotificationManagerCompat from = NotificationManagerCompat.from(context);
                Intrinsics.checkNotNullExpressionValue(from, "from(...)");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$23;
                        handlePushNotificationPayload$lambda$23 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$23(NotificationManagerCompat.this);
                        return handlePushNotificationPayload$lambda$23;
                    }
                }, 7, (Object) null);
                if (ActivityCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                    from.notify(Constants.BRAZE_PUSH_NOTIFICATION_TAG, notificationId, createNotification);
                    companion = this;
                } else {
                    companion = this;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushNotificationPayload$lambda$24;
                            handlePushNotificationPayload$lambda$24 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$24();
                            return handlePushNotificationPayload$lambda$24;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazePushReceiver$Companion$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$26;
                    handlePushNotificationPayload$lambda$26 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$26();
                    return handlePushNotificationPayload$lambda$26;
                }
            }, 7, (Object) null);
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12(int i) {
            return "Firebase messaging 'total_deleted' reports " + i + " messages.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$13(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$16$lambda$15(String str) {
            return "Push with identifier '" + str + "' has already been seen. Not displaying or forwarding push.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$17() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$18() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$19() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$20() {
            return "Received the initial Push Story notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$21(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$22() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$23(NotificationManagerCompat notificationManagerCompat) {
            return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompat.areNotificationsEnabled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$24() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$26() {
            return "Received silent push notification";
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
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }
    }
}
