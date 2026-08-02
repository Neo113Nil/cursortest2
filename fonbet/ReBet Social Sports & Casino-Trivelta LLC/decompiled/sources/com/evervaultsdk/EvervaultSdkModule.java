package com.evervaultsdk;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import Ph.Q;
import Ph.X0;
import com.evervault.sdk.Evervault;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/evervaultsdk/EvervaultSdkModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "teamUuid", "appUuid", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "initialize", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", EventKeys.VALUE_KEY, "encrypt", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "LPh/P;", "evervaultScope", "LPh/P;", "Companion", "a", "evervault_evervault-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EvervaultSdkModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "EvervaultSdk";

    @NotNull
    private final P evervaultScope;

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f30215n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Promise f30216o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f30217p;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f30218n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f30219o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Continuation continuation) {
                super(2, continuation);
                this.f30219o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f30219o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f30218n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                Evervault shared = Evervault.INSTANCE.getShared();
                String str = this.f30219o;
                this.f30218n = 1;
                Object encrypt = shared.encrypt(str, this);
                return encrypt == coroutine_suspended ? coroutine_suspended : encrypt;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Promise promise, String str, Continuation continuation) {
            super(2, continuation);
            this.f30216o = promise;
            this.f30217p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f30216o, this.f30217p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f30215n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L b10 = C1452g0.b();
                    a aVar = new a(this.f30217p, null);
                    this.f30215n = 1;
                    obj = AbstractC1455i.g(b10, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f30216o.resolve(obj);
            } catch (Exception e10) {
                this.f30216o.reject("EncryptionError", "Failed to encrypt with the Evervault SDK " + e10);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvervaultSdkModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.evervaultScope = Q.a(X0.b(null, 1, null).plus(C1452g0.c().e2()));
    }

    @ReactMethod
    public final void encrypt(@NotNull String value, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(promise, "promise");
        AbstractC1459k.d(this.evervaultScope, null, null, new b(promise, value, null), 3, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void initialize(@NotNull String teamUuid, @NotNull String appUuid, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(teamUuid, "teamUuid");
        Intrinsics.checkNotNullParameter(appUuid, "appUuid");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            Evervault.configure$default(Evervault.INSTANCE.getShared(), teamUuid, appUuid, null, 4, null);
            promise.resolve(null);
        } catch (Exception e10) {
            promise.reject("InitializationError", "Failed to initialize Evervault SDK", e10);
        }
    }
}
