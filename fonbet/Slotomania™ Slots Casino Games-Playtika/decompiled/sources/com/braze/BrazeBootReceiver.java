package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.l;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/braze/BrazeBootReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "", "onReceive", "", "handleIncomingIntent", "<init>", "()V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public class BrazeBootReceiver extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Intent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Intent intent) {
            super(0);
            this.b = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Received broadcast message. Message: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Boot complete intent received. Initializing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ Intent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Intent intent) {
            super(0);
            this.b = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unknown intent " + this.b + " received. Doing nothing.";
        }
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new b(intent), 2, (Object) null);
        if (!Intrinsics.areEqual(BOOT_COMPLETE_ACTION, intent.getAction())) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new d(intent), 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, c.b, 2, (Object) null);
        new l().a(context);
        Braze.INSTANCE.getInstance(context);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        handleIncomingIntent(context, intent);
    }
}
