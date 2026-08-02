package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onNewToken", "", "newToken", "", BrazeFirebaseMessagingService.FCM_SERVICE_OMR_METHOD, "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {
    private static final String CONTEXT_ATTACH_METHOD = "attachBaseContext";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FCM_SERVICE_OMR_METHOD = "onMessageReceived";

    @JvmStatic
    public static final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
        return INSTANCE.handleBrazeRemoteMessage(context, remoteMessage);
    }

    @JvmStatic
    public static final void handleOnNewToken(Context context, String str) {
        INSTANCE.handleOnNewToken(context, str);
    }

    @JvmStatic
    public static final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
        return INSTANCE.isBrazePushNotification(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.onNewToken(newToken);
        INSTANCE.handleOnNewToken(this, newToken);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        INSTANCE.handleBrazeRemoteMessage(this, remoteMessage);
    }

    /* compiled from: BrazeFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J%\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "<init>", "()V", "FCM_SERVICE_OMR_METHOD", "", "CONTEXT_ATTACH_METHOD", "handleOnNewToken", "", "context", "Landroid/content/Context;", "newToken", "handleBrazeRemoteMessage", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "isBrazePushNotification", "invokeFallbackFirebaseService", "classpath", "invokeFallbackFirebaseService$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void handleOnNewToken(Context context, final String newToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            String configuredApiKey = Braze.INSTANCE.getConfiguredApiKey(configurationProvider);
            if (configuredApiKey == null || configuredApiKey.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleOnNewToken$lambda$0;
                        handleOnNewToken$lambda$0 = BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$0(newToken);
                        return handleOnNewToken$lambda$0;
                    }
                }, 6, (Object) null);
            } else if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleOnNewToken$lambda$1;
                        handleOnNewToken$lambda$1 = BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$1(newToken);
                        return handleOnNewToken$lambda$1;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleOnNewToken$lambda$2;
                        handleOnNewToken$lambda$2 = BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$2(newToken);
                        return handleOnNewToken$lambda$2;
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(newToken);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$0(String str) {
            return "No configured API key, not registering token in handleOnNewToken. Token: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$1(String str) {
            return "Automatic FirebaseMessagingService.onNewToken() registration disabled, not registering token: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$2(String str) {
            return "Registering Firebase push token in handleOnNewToken. Token: " + str;
        }

        @JvmStatic
        public final boolean handleBrazeRemoteMessage(Context context, final RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$3;
                        handleBrazeRemoteMessage$lambda$3 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$3(RemoteMessage.this);
                        return handleBrazeRemoteMessage$lambda$3;
                    }
                }, 6, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    final String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                    if (fallbackFirebaseMessagingServiceClasspath != null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String handleBrazeRemoteMessage$lambda$4;
                                handleBrazeRemoteMessage$lambda$4 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$4(fallbackFirebaseMessagingServiceClasspath);
                                return handleBrazeRemoteMessage$lambda$4;
                            }
                        }, 6, (Object) null);
                        invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                        return false;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleBrazeRemoteMessage$lambda$5;
                            handleBrazeRemoteMessage$lambda$5 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$5();
                            return handleBrazeRemoteMessage$lambda$5;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$6;
                        handleBrazeRemoteMessage$lambda$6 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$6();
                        return handleBrazeRemoteMessage$lambda$6;
                    }
                }, 7, (Object) null);
                return false;
            }
            final Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleBrazeRemoteMessage$lambda$7;
                    handleBrazeRemoteMessage$lambda$7 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$7(data);
                    return handleBrazeRemoteMessage$lambda$7;
                }
            }, 6, (Object) null);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                final String key = entry.getKey();
                final String value = entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$8;
                        handleBrazeRemoteMessage$lambda$8 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$8(key, value);
                        return handleBrazeRemoteMessage$lambda$8;
                    }
                }, 6, (Object) null);
                bundle.putString(key, value);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$3(RemoteMessage remoteMessage) {
            return "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$4(String str) {
            return "Fallback FCM service enabled. Attempting to use fallback class at " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$5() {
            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$6() {
            return "FallbackFirebaseMessagingService is not enabled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$7(Map map) {
            return "Got remote message from FCM: " + map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$8(String str, String str2) {
            return "Adding bundle item from FCM remote data with key: " + str + " and value: " + str2;
        }

        @JvmStatic
        public final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return Intrinsics.areEqual("true", data.get(Constants.BRAZE_PUSH_BRAZE_KEY));
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(final String classpath, RemoteMessage remoteMessage, Context context) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Intrinsics.checkNotNullParameter(context, "context");
            Object constructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(ReflectionUtils.INSTANCE, classpath, null, null, 6, null);
            if (constructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$9;
                        invokeFallbackFirebaseService$lambda$9 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$9(classpath);
                        return invokeFallbackFirebaseService$lambda$9;
                    }
                }, 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = ReflectionUtils.INSTANCE.getDeclaredMethodQuietly(classpath, BrazeFirebaseMessagingService.CONTEXT_ATTACH_METHOD, Context.class);
            if (declaredMethodQuietly != null) {
                declaredMethodQuietly.setAccessible(true);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$10;
                        invokeFallbackFirebaseService$lambda$10 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$10(classpath);
                        return invokeFallbackFirebaseService$lambda$10;
                    }
                }, 7, (Object) null);
                if (!ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, declaredMethodQuietly, context).getFirst().booleanValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String invokeFallbackFirebaseService$lambda$11;
                            invokeFallbackFirebaseService$lambda$11 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$11(classpath);
                            return invokeFallbackFirebaseService$lambda$11;
                        }
                    }, 7, (Object) null);
                    return;
                }
                Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, BrazeFirebaseMessagingService.FCM_SERVICE_OMR_METHOD, (Class<?>[]) new Class[]{RemoteMessage.class});
                if (methodQuietly == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String invokeFallbackFirebaseService$lambda$13;
                            invokeFallbackFirebaseService$lambda$13 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$13(classpath);
                            return invokeFallbackFirebaseService$lambda$13;
                        }
                    }, 7, (Object) null);
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String invokeFallbackFirebaseService$lambda$14;
                            invokeFallbackFirebaseService$lambda$14 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$14(classpath);
                            return invokeFallbackFirebaseService$lambda$14;
                        }
                    }, 7, (Object) null);
                    ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, methodQuietly, remoteMessage).getFirst().booleanValue();
                    return;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String invokeFallbackFirebaseService$lambda$12;
                    invokeFallbackFirebaseService$lambda$12 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$12();
                    return invokeFallbackFirebaseService$lambda$12;
                }
            }, 7, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$9(String str) {
            return "Fallback firebase messaging service " + str + " could not be constructed. Not routing fallback RemoteMessage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$10(String str) {
            return "Attempting to call " + str + " attachBaseContext";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$11(String str) {
            return "Failure invoking " + str + ".attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$12() {
            return "Could not find attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$13(String str) {
            return "Fallback firebase messaging service method " + str + ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$14(String str) {
            return "Attempting to invoke firebase messaging fallback service " + str + ".onMessageReceived";
        }
    }
}
