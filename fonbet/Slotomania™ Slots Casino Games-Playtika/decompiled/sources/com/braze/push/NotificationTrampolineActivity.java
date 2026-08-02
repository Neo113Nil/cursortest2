package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, d2 = {"Lcom/braze/push/NotificationTrampolineActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", X3.i.t0, X3.i.u0, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationTrampolineActivity extends Activity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.appboy", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "NotificationTrampolineActivity created";
            }
        }, 2, (Object) null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        final Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onResume$5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to route intent to notification receiver";
                }
            });
        }
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onResume$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification trampoline activity received null intent. Doing nothing.";
                }
            }, 3, (Object) null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onResume$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification trampoline activity received intent with null action. Doing nothing.";
                }
            }, 3, (Object) null);
            finish();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onResume$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Notification trampoline activity received intent: ", intent);
            }
        }, 2, (Object) null);
        Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
        Intrinsics.checkNotNullExpressionValue(intent2, "Intent(action).setClass(…otificationReceiverClass)");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (Constants.isAmazonDevice()) {
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.INSTANCE.handleReceivedIntent(this, intent2, false);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onResume$6
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification trampoline activity finished processing. Delaying before finishing activity.";
            }
        }, 2, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, (Number) 200, null, new NotificationTrampolineActivity$onResume$7(this, null), 2, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onPause$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification trampoline activity paused and finishing";
            }
        }, 2, (Object) null);
        finish();
    }
}
