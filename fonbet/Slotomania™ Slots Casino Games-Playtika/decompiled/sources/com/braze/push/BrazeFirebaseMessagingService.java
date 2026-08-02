package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "newToken", "", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
        return INSTANCE.handleBrazeRemoteMessage(context, remoteMessage);
    }

    @JvmStatic
    public static final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
        return INSTANCE.isBrazePushNotification(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(final String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.onNewToken(newToken);
        BrazeFirebaseMessagingService brazeFirebaseMessagingService = this;
        BrazeInternal.applyPendingRuntimeConfiguration(brazeFirebaseMessagingService);
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(brazeFirebaseMessagingService);
        String configuredApiKey = Braze.INSTANCE.getConfiguredApiKey(brazeConfigurationProvider);
        if (configuredApiKey == null || configuredApiKey.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$onNewToken$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("No configured API key, not registering token in onNewToken. Token: ", newToken);
                }
            }, 2, (Object) null);
        } else if (!brazeConfigurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$onNewToken$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: ", newToken);
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$onNewToken$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Registering Firebase push token in onNewToken. Token: ", newToken);
                }
            }, 2, (Object) null);
            Braze.INSTANCE.getInstance(brazeFirebaseMessagingService).setRegisteredPushToken(newToken);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        INSTANCE.handleBrazeRemoteMessage(this, remoteMessage);
    }

    /* compiled from: BrazeFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "()V", "handleBrazeRemoteMessage", "", "context", "Landroid/content/Context;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "isBrazePushNotification", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean handleBrazeRemoteMessage(Context context, final RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Remote message did not originate from Braze. Not consuming remote message: ", RemoteMessage.this);
                    }
                }, 2, (Object) null);
                return false;
            }
            final Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "remoteMessage.data");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Got remote message from FCM: ", data);
                }
            }, 2, (Object) null);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                final String key = entry.getKey();
                final String value = entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Adding bundle item from FCM remote data with key: " + ((Object) key) + " and value: " + ((Object) value);
                    }
                }, 2, (Object) null);
                bundle.putString(key, value);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
            return true;
        }

        @JvmStatic
        public final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "remoteMessage.data");
            return Intrinsics.areEqual("true", data.get(Constants.BRAZE_PUSH_BRAZE_KEY));
        }
    }
}
