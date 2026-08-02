package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\n"}, d2 = {"Lcom/braze/push/NotificationTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationTrampolineActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCreate$lambda$0;
                onCreate$lambda$0 = NotificationTrampolineActivity.onCreate$lambda$0();
                return onCreate$lambda$0;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$0() {
        return "NotificationTrampolineActivity created";
    }

    @Override // android.app.Activity
    protected void onResume() {
        final Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onResume$lambda$5;
                    onResume$lambda$5 = NotificationTrampolineActivity.onResume$lambda$5();
                    return onResume$lambda$5;
                }
            }, 4, (Object) null);
        }
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onResume$lambda$1;
                    onResume$lambda$1 = NotificationTrampolineActivity.onResume$lambda$1();
                    return onResume$lambda$1;
                }
            }, 7, (Object) null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onResume$lambda$2;
                    onResume$lambda$2 = NotificationTrampolineActivity.onResume$lambda$2();
                    return onResume$lambda$2;
                }
            }, 7, (Object) null);
            finish();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onResume$lambda$3;
                onResume$lambda$3 = NotificationTrampolineActivity.onResume$lambda$3(intent);
                return onResume$lambda$3;
            }
        }, 6, (Object) null);
        Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
        Intrinsics.checkNotNullExpressionValue(intent2, "setClass(...)");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (Constants.isAmazonDevice()) {
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.INSTANCE.handleReceivedIntent(this, intent2, false);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onResume$lambda$6;
                onResume$lambda$6 = NotificationTrampolineActivity.onResume$lambda$6();
                return onResume$lambda$6;
            }
        }, 6, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, (Number) 200, null, new NotificationTrampolineActivity$onResume$7(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$1() {
        return "Notification trampoline activity received null intent. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$2() {
        return "Notification trampoline activity received intent with null action. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$3(Intent intent) {
        return "Notification trampoline activity received intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$5() {
        return "Failed to route intent to notification receiver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$6() {
        return "Notification trampoline activity finished processing. Delaying before finishing activity.";
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.NotificationTrampolineActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onPause$lambda$7;
                onPause$lambda$7 = NotificationTrampolineActivity.onPause$lambda$7();
                return onPause$lambda$7;
            }
        }, 6, (Object) null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$7() {
        return "Notification trampoline activity paused and finishing";
    }
}
