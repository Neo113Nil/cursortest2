package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeInternal;
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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onNewToken", "", "newToken", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J%\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "<init>", "()V", "FCM_SERVICE_OMR_METHOD", "", "CONTEXT_ATTACH_METHOD", "handleOnNewToken", "", "context", "Landroid/content/Context;", "newToken", "handleBrazeRemoteMessage", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "isBrazePushNotification", "invokeFallbackFirebaseService", "classpath", "invokeFallbackFirebaseService$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$0(RemoteMessage remoteMessage) {
            return "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$1(String str) {
            return "Fallback FCM service enabled. Attempting to use fallback class at " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$2() {
            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$3() {
            return "FallbackFirebaseMessagingService is not enabled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$4(Map map) {
            return "Got remote message from FCM: " + map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$5(String str, String str2) {
            return "Adding bundle item from FCM remote data with key: " + str + " and value: " + str2;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$0(String str) {
            return "Fallback firebase messaging service " + str + " could not be constructed. Not routing fallback RemoteMessage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$1(String str) {
            return "Attempting to call " + str + " attachBaseContext";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$2(String str) {
            return "Failure invoking " + str + ".attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$3() {
            return "Could not find attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$4(String str) {
            return "Fallback firebase messaging service method " + str + ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$5(String str) {
            return "Attempting to invoke firebase messaging fallback service " + str + ".onMessageReceived";
        }

        @JvmStatic
        public final boolean handleBrazeRemoteMessage(@NotNull Context context, @NotNull final RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29471I;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: T3.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$0;
                        handleBrazeRemoteMessage$lambda$0 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$0(RemoteMessage.this);
                        return handleBrazeRemoteMessage$lambda$0;
                    }
                }, 6, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (!configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleBrazeRemoteMessage$lambda$3;
                            handleBrazeRemoteMessage$lambda$3 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$3();
                            return handleBrazeRemoteMessage$lambda$3;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                final String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                if (fallbackFirebaseMessagingServiceClasspath == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleBrazeRemoteMessage$lambda$2;
                            handleBrazeRemoteMessage$lambda$2 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$2();
                            return handleBrazeRemoteMessage$lambda$2;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: T3.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$1;
                        handleBrazeRemoteMessage$lambda$1 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$1(fallbackFirebaseMessagingServiceClasspath);
                        return handleBrazeRemoteMessage$lambda$1;
                    }
                }, 6, (Object) null);
                invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                return false;
            }
            final Map h10 = remoteMessage.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getData(...)");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleBrazeRemoteMessage$lambda$4;
                    handleBrazeRemoteMessage$lambda$4 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$4(h10);
                    return handleBrazeRemoteMessage$lambda$4;
                }
            }, 6, (Object) null);
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Map.Entry entry : h10.entrySet()) {
                final String str = (String) entry.getKey();
                final String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$5;
                        handleBrazeRemoteMessage$lambda$5 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$5(str, str2);
                        return handleBrazeRemoteMessage$lambda$5;
                    }
                }, 6, (Object) null);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
            return true;
        }

        @JvmStatic
        public final void handleOnNewToken(@NotNull Context context, @NotNull final String newToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Braze.Companion companion = Braze.INSTANCE;
            String configuredApiKey = companion.getConfiguredApiKey(configurationProvider);
            if (configuredApiKey == null || configuredApiKey.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleOnNewToken$lambda$0;
                        handleOnNewToken$lambda$0 = BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$0(newToken);
                        return handleOnNewToken$lambda$0;
                    }
                }, 6, (Object) null);
            } else if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleOnNewToken$lambda$1;
                        handleOnNewToken$lambda$1 = BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$1(newToken);
                        return handleOnNewToken$lambda$1;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleOnNewToken$lambda$2;
                        handleOnNewToken$lambda$2 = BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$2(newToken);
                        return handleOnNewToken$lambda$2;
                    }
                }, 6, (Object) null);
                companion.getInstance(context).setRegisteredPushToken(newToken);
            }
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(@NotNull final String classpath, @NotNull RemoteMessage remoteMessage, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Intrinsics.checkNotNullParameter(context, "context");
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object constructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(reflectionUtils, classpath, null, null, 6, null);
            if (constructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$0;
                        invokeFallbackFirebaseService$lambda$0 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$0(classpath);
                        return invokeFallbackFirebaseService$lambda$0;
                    }
                }, 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = reflectionUtils.getDeclaredMethodQuietly(classpath, "attachBaseContext", Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$3;
                        invokeFallbackFirebaseService$lambda$3 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$3();
                        return invokeFallbackFirebaseService$lambda$3;
                    }
                }, 7, (Object) null);
                return;
            }
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String invokeFallbackFirebaseService$lambda$1;
                    invokeFallbackFirebaseService$lambda$1 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$1(classpath);
                    return invokeFallbackFirebaseService$lambda$1;
                }
            }, 7, (Object) null);
            if (!ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, declaredMethodQuietly, context).getFirst().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$2;
                        invokeFallbackFirebaseService$lambda$2 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$2(classpath);
                        return invokeFallbackFirebaseService$lambda$2;
                    }
                }, 7, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, "onMessageReceived", (Class<?>[]) new Class[]{RemoteMessage.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$4;
                        invokeFallbackFirebaseService$lambda$4 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$4(classpath);
                        return invokeFallbackFirebaseService$lambda$4;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$5;
                        invokeFallbackFirebaseService$lambda$5 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$5(classpath);
                        return invokeFallbackFirebaseService$lambda$5;
                    }
                }, 7, (Object) null);
                ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, methodQuietly, remoteMessage).getFirst().booleanValue();
            }
        }

        @JvmStatic
        public final boolean isBrazePushNotification(@NotNull RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Map h10 = remoteMessage.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getData(...)");
            return Intrinsics.areEqual("true", h10.get("_ab"));
        }

        private Companion() {
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        INSTANCE.handleBrazeRemoteMessage(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.onNewToken(newToken);
        INSTANCE.handleOnNewToken(this, newToken);
    }
}
