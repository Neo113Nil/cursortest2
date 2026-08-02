package com.braze.reactbridge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationUtils;
import com.braze.reactbridge.BrazeReactUtils;
import com.braze.support.BrazeLogger;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/reactbridge/BrazeReactUtils;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "populateInitialPushPayloadFromIntent", "(Landroid/content/Intent;)V", "Lcom/facebook/react/bridge/WritableMap;", "getInitialPushPayload", "()Lcom/facebook/react/bridge/WritableMap;", "clearInitialPushPayload", "initialPushPayload", "Lcom/facebook/react/bridge/WritableMap;", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeReactUtils {

    @NotNull
    public static final BrazeReactUtils INSTANCE = new BrazeReactUtils();

    @Nullable
    private static WritableMap initialPushPayload;

    private BrazeReactUtils() {
    }

    @JvmStatic
    public static final void clearInitialPushPayload() {
        initialPushPayload = null;
    }

    @JvmStatic
    @Nullable
    public static final WritableMap getInitialPushPayload() {
        return initialPushPayload;
    }

    @JvmStatic
    public static final void populateInitialPushPayloadFromIntent(@Nullable final Intent intent) {
        String deeplink;
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.n0
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
        BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(extras == null ? new Bundle() : extras, null, null, null, 14, null);
        boolean areEqual = Intrinsics.areEqual(extras != null ? extras.getString("source") : null, "Appboy");
        Uri data = intent.getData();
        if (data == null || (deeplink = data.toString()) == null) {
            deeplink = brazeNotificationPayload.getDeeplink();
        }
        boolean z10 = Intrinsics.areEqual(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER");
        if (extras != null && BrazeNotificationUtils.isBrazePushMessage(intent)) {
            Uri data2 = intent.getData();
            initialPushPayload = PushPayloadMapper.createPushNotificationMap(brazeNotificationPayload, "push_opened", data2 != null ? data2.toString() : null, extras);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String populateInitialPushPayloadFromIntent$lambda$1;
                    populateInitialPushPayloadFromIntent$lambda$1 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$1();
                    return populateInitialPushPayloadFromIntent$lambda$1;
                }
            }, 7, (Object) null);
        } else {
            if (areEqual && deeplink != null) {
                if (extras == null) {
                    extras = new Bundle();
                }
                initialPushPayload = PushPayloadMapper.createPushNotificationMap(brazeNotificationPayload, "push_opened", deeplink, extras);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populateInitialPushPayloadFromIntent$lambda$2;
                        populateInitialPushPayloadFromIntent$lambda$2 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$2();
                        return populateInitialPushPayloadFromIntent$lambda$2;
                    }
                }, 7, (Object) null);
                return;
            }
            if (!z10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.r0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populateInitialPushPayloadFromIntent$lambda$4;
                        populateInitialPushPayloadFromIntent$lambda$4 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$4(intent);
                        return populateInitialPushPayloadFromIntent$lambda$4;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populateInitialPushPayloadFromIntent$lambda$3;
                        populateInitialPushPayloadFromIntent$lambda$3 = BrazeReactUtils.populateInitialPushPayloadFromIntent$lambda$3();
                        return populateInitialPushPayloadFromIntent$lambda$3;
                    }
                }, 7, (Object) null);
                initialPushPayload = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$0() {
        return "populateInitialPushPayloadFromIntent called with null intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$1() {
        return "Initial Android push payload set from Braze push intent: " + initialPushPayload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$2() {
        return "Initial Android push payload set from Braze-routed deep link intent: " + initialPushPayload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$3() {
        return "Launcher intent detected, clearing initial push payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String populateInitialPushPayloadFromIntent$lambda$4(Intent intent) {
        return "Intent does not contain Braze push data, leaving initial push payload unchanged. Intent: action=" + intent.getAction() + ", data=" + intent.getData() + ", extras=" + intent.getExtras();
    }
}
