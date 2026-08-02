package expo.modules.notifications.tokens;

import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.messaging.FirebaseMessaging;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import expo.modules.notifications.service.delegates.FirebaseMessagingDelegate;
import expo.modules.notifications.tokens.interfaces.FirebaseTokenListener;
import io.github.lukmccall.pika.TypeInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: PushTokenModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lexpo/modules/notifications/tokens/PushTokenModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;", "<init>", "()V", "onNewToken", "", AnalyticsConstantsKt.KEY_TOKEN, "", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getFirebaseMessagingInstance", "Lcom/google/firebase/messaging/FirebaseMessaging;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PushTokenModule extends Module implements FirebaseTokenListener {
    @Override // expo.modules.notifications.tokens.interfaces.FirebaseTokenListener
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        try {
            Result.Companion companion = Result.INSTANCE;
            PushTokenModule pushTokenModule = this;
            sendEvent("onDevicePushToken", MapsKt.mapOf(TuplesKt.to("devicePushToken", token)));
            Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        Object m13470constructorimpl2;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2;
        PushTokenModule pushTokenModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (pushTokenModule.getClass() + ".ModuleDefinition"));
        try {
            final ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(pushTokenModule);
            moduleDefinitionBuilder.Name("ExpoPushTokenManager");
            moduleDefinitionBuilder.Events("onDevicePushToken");
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_CREATE, new BasicEventListener(EventName.MODULE_CREATE, new Function0<Unit>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$OnCreate$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    FirebaseMessagingDelegate.INSTANCE.addTokenListener(PushTokenModule.this);
                }
            }));
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    FirebaseMessagingDelegate.INSTANCE.removeTokenListener(PushTokenModule.this);
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            Object obj = null;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getDevicePushTokenAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        FirebaseMessaging firebaseMessagingInstance;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        firebaseMessagingInstance = PushTokenModule.this.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance == null) {
                            return;
                        }
                        firebaseMessagingInstance.getToken().addOnCompleteListener(new PushTokenModule$definition$1$3$1(promise, moduleDefinitionBuilder, PushTokenModule.this));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        m13470constructorimpl = null;
                    }
                    TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                        typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType = new AnyType(typeDescriptor, converters);
                }
                anyTypeArr[0] = anyType;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        FirebaseMessaging firebaseMessagingInstance;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        firebaseMessagingInstance = PushTokenModule.this.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance != null) {
                            firebaseMessagingInstance.getToken().addOnCompleteListener(new PushTokenModule$definition$1$3$1(promise, moduleDefinitionBuilder, PushTokenModule.this));
                        }
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getDevicePushTokenAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("unregisterForNotificationsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        FirebaseMessaging firebaseMessagingInstance;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        firebaseMessagingInstance = PushTokenModule.this.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance == null) {
                            return;
                        }
                        firebaseMessagingInstance.deleteToken().addOnCompleteListener(new PushTokenModule$definition$1$4$1(promise));
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
                AnyType[] anyTypeArr2 = new AnyType[1];
                AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType2 == null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$5
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                    if (m13473exceptionOrNullimpl2 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl2);
                    }
                    if (!Result.m13476isFailureimpl(m13470constructorimpl2)) {
                        obj = m13470constructorimpl2;
                    }
                    TypeDescriptor typeDescriptor2 = (TypeDescriptor) obj;
                    if (typeDescriptor2 == null) {
                        typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType2 = new AnyType(typeDescriptor2, converters2);
                }
                anyTypeArr2[0] = anyType2;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        FirebaseMessaging firebaseMessagingInstance;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        firebaseMessagingInstance = PushTokenModule.this.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance != null) {
                            firebaseMessagingInstance.deleteToken().addOnCompleteListener(new PushTokenModule$definition$1$4$1(promise));
                        }
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
                                } else {
                                    untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
                                }
                            } else {
                                untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
                }
                asyncFunctionWithPromiseComponent2 = untypedAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("unregisterForNotificationsAsync", asyncFunctionWithPromiseComponent2);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseMessaging getFirebaseMessagingInstance(Promise promise) {
        try {
            return FirebaseMessaging.getInstance();
        } catch (IllegalStateException e) {
            promise.reject("E_REGISTRATION_FAILED", "Unable to get Firebase Messaging instance. Did you configure `googleServicesFile` path in app config? Make sure to complete the guide at https://docs.expo.dev/push-notifications/fcm-credentials/ : " + e.getMessage(), e);
            return null;
        }
    }
}
