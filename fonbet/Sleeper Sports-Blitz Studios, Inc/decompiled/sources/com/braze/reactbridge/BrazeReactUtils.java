package com.braze.reactbridge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationUtils;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;

/* compiled from: BrazeReactUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braze/reactbridge/BrazeReactUtils;", "", "<init>", "()V", "initialPushPayload", "Lcom/facebook/react/bridge/WritableMap;", "populateInitialPushPayloadFromIntent", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getInitialPushPayload", "clearInitialPushPayload", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeReactUtils {
    public static final BrazeReactUtils INSTANCE = new BrazeReactUtils();
    private static WritableMap initialPushPayload;

    private BrazeReactUtils() {
    }

    @JvmStatic
    public static final void populateInitialPushPayloadFromIntent(Intent intent) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactUtils$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String populateInitialPushPayloadFromIntent$lambda$0;
                    populateInitialPushPayloadFromIntent$lambda$0 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$0();
                    return populateInitialPushPayloadFromIntent$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !BrazeNotificationUtils.isBrazePushMessage(intent)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactUtils$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String populateInitialPushPayloadFromIntent$lambda$1;
                    populateInitialPushPayloadFromIntent$lambda$1 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$1();
                    return populateInitialPushPayloadFromIntent$lambda$1;
                }
            }, 7, (Object) null);
            initialPushPayload = null;
            return;
        }
        BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(extras, null, null, null, 14, null);
        Uri data = intent.getData();
        String uri = data != null ? data.toString() : null;
        BrazeReactUtils brazeReactUtils = INSTANCE;
        initialPushPayload = PushPayloadMapper.createPushNotificationMap(brazeNotificationPayload, "push_opened", uri, extras);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeReactUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactUtils$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String populateInitialPushPayloadFromIntent$lambda$2;
                populateInitialPushPayloadFromIntent$lambda$2 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$2();
                return populateInitialPushPayloadFromIntent$lambda$2;
            }
        }, 7, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$0() {
        return "populateInitialPushPayloadFromIntent called with null intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$1() {
        return "Intent does not contain Braze push data, not setting initial push payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$2() {
        return "Initial Android push payload set: " + initialPushPayload;
    }

    @JvmStatic
    public static final WritableMap getInitialPushPayload() {
        return initialPushPayload;
    }

    @JvmStatic
    public static final void clearInitialPushPayload() {
        initialPushPayload = null;
    }
}
