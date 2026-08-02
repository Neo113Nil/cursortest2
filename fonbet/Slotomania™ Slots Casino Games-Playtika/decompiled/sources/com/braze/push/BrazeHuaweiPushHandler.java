package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Constants;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeHuaweiPushHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeHuaweiPushHandler;", "", "()V", "handleHmsRemoteMessageData", "", "context", "Landroid/content/Context;", "hmsRemoteMessageData", "", "", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrazeHuaweiPushHandler {
    public static final BrazeHuaweiPushHandler INSTANCE = new BrazeHuaweiPushHandler();

    private BrazeHuaweiPushHandler() {
    }

    @JvmStatic
    public static final boolean handleHmsRemoteMessageData(Context context, final Map<String, String> hmsRemoteMessageData) {
        Intrinsics.checkNotNullParameter(context, "context");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeHuaweiPushHandler brazeHuaweiPushHandler = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeHuaweiPushHandler, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler$handleHmsRemoteMessageData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Handling Huawei remote message: ", hmsRemoteMessageData);
            }
        }, 2, (Object) null);
        if (hmsRemoteMessageData == null || hmsRemoteMessageData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeHuaweiPushHandler, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler$handleHmsRemoteMessageData$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Remote message data was null. Remote message did not originate from Braze.";
                }
            }, 2, (Object) null);
            return false;
        }
        final Bundle bundle = BundleUtils.toBundle(hmsRemoteMessageData);
        if (!bundle.containsKey(Constants.BRAZE_PUSH_BRAZE_KEY) || !Intrinsics.areEqual("true", bundle.getString(Constants.BRAZE_PUSH_BRAZE_KEY))) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler$handleHmsRemoteMessageData$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Remote message did not originate from Braze. Not consuming remote message";
                }
            }, 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler$handleHmsRemoteMessageData$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Got remote message from Huawei: ", bundle);
            }
        }, 2, (Object) null);
        Intent intent = new Intent(BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION);
        intent.putExtras(bundle);
        BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
        return true;
    }
}
