package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/braze/BrazeBootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "handleIncomingIntent", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Companion", "com/braze/w", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BrazeBootReceiver extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final w Companion = new w();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$1(Intent intent) {
        return "Received broadcast message. Message: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$2() {
        return "Boot complete intent received. Initializing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$3(Intent intent) {
        return "Unknown intent " + intent + " received. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return "Failed to process incoming intent " + intent;
    }

    public final boolean handleIncomingIntent(Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.BrazeBootReceiver$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleIncomingIntent$lambda$1;
                handleIncomingIntent$lambda$1 = BrazeBootReceiver.handleIncomingIntent$lambda$1(intent);
                return handleIncomingIntent$lambda$1;
            }
        }, 6, (Object) null);
        if (!Intrinsics.areEqual(BOOT_COMPLETE_ACTION, intent.getAction())) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.BrazeBootReceiver$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleIncomingIntent$lambda$3;
                    handleIncomingIntent$lambda$3 = BrazeBootReceiver.handleIncomingIntent$lambda$3(intent);
                    return handleIncomingIntent$lambda$3;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.BrazeBootReceiver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleIncomingIntent$lambda$2;
                handleIncomingIntent$lambda$2 = BrazeBootReceiver.handleIncomingIntent$lambda$2();
                return handleIncomingIntent$lambda$2;
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(context);
        BrazeInternal.INSTANCE.deleteRegisteredGeofenceCache(context);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            handleIncomingIntent(context, intent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.BrazeBootReceiver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onReceive$lambda$0;
                    onReceive$lambda$0 = BrazeBootReceiver.onReceive$lambda$0(intent);
                    return onReceive$lambda$0;
                }
            }, 4, (Object) null);
        }
    }
}
