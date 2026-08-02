package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.d1;
import com.braze.BrazeBootReceiver;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/braze/BrazeBootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "handleIncomingIntent", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Companion", "bo/app/d1", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazeBootReceiver extends BroadcastReceiver {
    public static final d1 Companion = new d1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$0(Intent intent) {
        return "Received broadcast message. Message: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$1() {
        return "Boot complete intent received. Initializing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$2(Intent intent) {
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
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29471I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.N3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleIncomingIntent$lambda$0;
                handleIncomingIntent$lambda$0 = BrazeBootReceiver.handleIncomingIntent$lambda$0(intent);
                return handleIncomingIntent$lambda$0;
            }
        }, 6, (Object) null);
        if (!Intrinsics.areEqual("android.intent.action.BOOT_COMPLETED", intent.getAction())) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.P3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleIncomingIntent$lambda$2;
                    handleIncomingIntent$lambda$2 = BrazeBootReceiver.handleIncomingIntent$lambda$2(intent);
                    return handleIncomingIntent$lambda$2;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.O3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleIncomingIntent$lambda$1;
                handleIncomingIntent$lambda$1 = BrazeBootReceiver.handleIncomingIntent$lambda$1();
                return handleIncomingIntent$lambda$1;
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
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: H3.M3
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
