package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/braze/BrazeFlushPushDeliveryReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "", "onReceive", "<init>", "()V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public class BrazeFlushPushDeliveryReceiver extends BroadcastReceiver {
    public static final String FLUSH_BRAZE_PUSH_DELIVERIES_ACTION = "com.braze.FLUSH_PUSH_DELIVERY";

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
            return Intrinsics.stringPlus("BrazeFlushPushDeliveryReceiver received intent: ", this.b.getAction());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(intent), 3, (Object) null);
        if (Intrinsics.areEqual(intent.getAction(), FLUSH_BRAZE_PUSH_DELIVERIES_ACTION)) {
            BrazeInternal.INSTANCE.performPushDeliveryFlush(context);
        }
    }
}
