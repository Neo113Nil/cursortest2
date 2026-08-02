package com.surt.guardian.rn;

import Ac.b;
import Ac.c;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import Ph.X0;
import android.app.Activity;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;
import com.surt.guardian.GuardianSDK;
import com.surt.guardian.network.CollectResult;
import com.surt.guardian.network.VerificationResult;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/surt/guardian/rn/GuardianModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "optionsJson", "", "initialize", "(Ljava/lang/String;)V", "jwt", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "verify", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "collect", "onCatalystInstanceDestroy", "()V", "LPh/P;", "scope", "LPh/P;", "surtai_guardian-rn_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuardianModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuardianModule.kt\ncom/surt/guardian/rn/GuardianModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes4.dex */
public final class GuardianModule extends ReactContextBaseJavaModule {

    @NotNull
    private final P scope;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f41574n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f41575o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Boolean f41576p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Promise f41577q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Boolean bool, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.f41575o = str;
            this.f41576p = bool;
            this.f41577q = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f41575o, this.f41576p, this.f41577q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m113collectSuspend0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41574n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    GuardianSDK a10 = GuardianSDK.INSTANCE.a();
                    String str = this.f41575o;
                    Boolean bool = this.f41576p;
                    this.f41574n = 1;
                    m113collectSuspend0E7RQCE = a10.m113collectSuspend0E7RQCE(str, bool, this);
                    if (m113collectSuspend0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m113collectSuspend0E7RQCE = ((Result) obj).getValue();
                }
                Promise promise = this.f41577q;
                if (Result.m154isSuccessimpl(m113collectSuspend0E7RQCE)) {
                    CollectResult collectResult = (CollectResult) m113collectSuspend0E7RQCE;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(EventKeys.PAYLOAD, collectResult.getPayload());
                    jSONObject.put("diagnostics", new JSONObject(collectResult.getDiagnostics().toMap()));
                    promise.resolve(jSONObject.toString());
                }
                Promise promise2 = this.f41577q;
                Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m113collectSuspend0E7RQCE);
                if (m150exceptionOrNullimpl != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(EventKeys.ERROR_CODE, "collect_failed");
                    String message = m150exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    jSONObject2.put("message", message);
                    promise2.reject("collect_failed", jSONObject2.toString(), m150exceptionOrNullimpl);
                }
            } catch (Exception e10) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(EventKeys.ERROR_CODE, "sdk_error");
                String message2 = e10.getMessage();
                jSONObject3.put("message", message2 != null ? message2 : "Unknown error");
                this.f41577q.reject("sdk_error", jSONObject3.toString(), e10);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f41578n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f41579o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Boolean f41580p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Promise f41581q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Boolean bool, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.f41579o = str;
            this.f41580p = bool;
            this.f41581q = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f41579o, this.f41580p, this.f41581q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m114verifySuspend0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41578n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    GuardianSDK a10 = GuardianSDK.INSTANCE.a();
                    String str = this.f41579o;
                    Boolean bool = this.f41580p;
                    this.f41578n = 1;
                    m114verifySuspend0E7RQCE = a10.m114verifySuspend0E7RQCE(str, bool, this);
                    if (m114verifySuspend0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m114verifySuspend0E7RQCE = ((Result) obj).getValue();
                }
                Promise promise = this.f41581q;
                if (Result.m154isSuccessimpl(m114verifySuspend0E7RQCE)) {
                    VerificationResult verificationResult = (VerificationResult) m114verifySuspend0E7RQCE;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("allowed", verificationResult.getAllowed());
                    String lowerCase = verificationResult.getRiskLevel().name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    jSONObject.put("riskLevel", lowerCase);
                    jSONObject.put("sessionId", verificationResult.getSessionId());
                    jSONObject.put(EventKeys.TIMESTAMP, verificationResult.getTimestamp());
                    List<String> errors = verificationResult.getErrors();
                    if (errors != null) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<T> it = errors.iterator();
                        while (it.hasNext()) {
                            jSONArray.put((String) it.next());
                        }
                        jSONObject.put("errors", jSONArray);
                    }
                    Map<String, Object> metadata = verificationResult.getMetadata();
                    if (metadata != null) {
                        jSONObject.put("metadata", new JSONObject(metadata));
                    }
                    jSONObject.put("diagnostics", new JSONObject(verificationResult.getDiagnostics().toMap()));
                    promise.resolve(jSONObject.toString());
                }
                Promise promise2 = this.f41581q;
                Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m114verifySuspend0E7RQCE);
                if (m150exceptionOrNullimpl != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(EventKeys.ERROR_CODE, "verification_failed");
                    String message = m150exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    jSONObject2.put("message", message);
                    promise2.reject("verification_failed", jSONObject2.toString(), m150exceptionOrNullimpl);
                }
            } catch (Exception e10) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(EventKeys.ERROR_CODE, "sdk_error");
                String message2 = e10.getMessage();
                jSONObject3.put("message", message2 != null ? message2 : "Unknown error");
                this.f41581q.reject("sdk_error", jSONObject3.toString(), e10);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuardianModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.scope = Q.a(C1452g0.b().plus(X0.b(null, 1, null)));
    }

    @ReactMethod
    public final void collect(@Nullable String jwt, @Nullable String options, @NotNull Promise promise) {
        JSONObject jSONObject;
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            GuardianSDK.INSTANCE.a().setActivity(currentActivity);
        }
        if (options != null) {
            try {
                jSONObject = new JSONObject(options);
            } catch (Exception unused) {
            }
            if (jSONObject.has("collectLocation")) {
                valueOf = Boolean.valueOf(jSONObject.getBoolean("collectLocation"));
                AbstractC1459k.d(this.scope, null, null, new a(jwt, valueOf, promise, null), 3, null);
            }
        }
        valueOf = null;
        AbstractC1459k.d(this.scope, null, null, new a(jwt, valueOf, promise, null), 3, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "GuardianSDK";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @ReactMethod
    public final void initialize(@NotNull String optionsJson) {
        Logger.Level level;
        Intrinsics.checkNotNullParameter(optionsJson, "optionsJson");
        JSONObject jSONObject = new JSONObject(optionsJson);
        String optString = jSONObject.optString("logLevel", "warn");
        if (optString != null) {
            switch (optString.hashCode()) {
                case 3237038:
                    if (optString.equals("info")) {
                        level = Logger.Level.INFO;
                        break;
                    }
                    break;
                case 3387192:
                    if (optString.equals(ViewProps.NONE)) {
                        level = Logger.Level.NONE;
                        break;
                    }
                    break;
                case 3641990:
                    if (optString.equals("warn")) {
                        level = Logger.Level.WARN;
                        break;
                    }
                    break;
                case 95458899:
                    if (optString.equals("debug")) {
                        level = Logger.Level.DEBUG;
                        break;
                    }
                    break;
                case 96784904:
                    if (optString.equals("error")) {
                        level = Logger.Level.ERROR;
                        break;
                    }
                    break;
            }
            Logger.Level level2 = level;
            c cVar = new c(b.a.f421a, level2, jSONObject.optBoolean("collectLocation", false), jSONObject.optBoolean("collectWifiInfo", false), jSONObject.optBoolean("collectSimCardInfo", false), jSONObject.optBoolean("collectCameraInfo", false), null, 0L, 192, null);
            GuardianSDK.Companion companion = GuardianSDK.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            companion.b(reactApplicationContext, cVar);
        }
        level = Logger.Level.WARN;
        Logger.Level level22 = level;
        c cVar2 = new c(b.a.f421a, level22, jSONObject.optBoolean("collectLocation", false), jSONObject.optBoolean("collectWifiInfo", false), jSONObject.optBoolean("collectSimCardInfo", false), jSONObject.optBoolean("collectCameraInfo", false), null, 0L, 192, null);
        GuardianSDK.Companion companion2 = GuardianSDK.INSTANCE;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        companion2.b(reactApplicationContext2, cVar2);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Q.f(this.scope, null, 1, null);
    }

    @ReactMethod
    public final void verify(@NotNull String jwt, @Nullable String options, @NotNull Promise promise) {
        JSONObject jSONObject;
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            GuardianSDK.INSTANCE.a().setActivity(currentActivity);
        }
        if (options != null) {
            try {
                jSONObject = new JSONObject(options);
            } catch (Exception unused) {
            }
            if (jSONObject.has("collectLocation")) {
                valueOf = Boolean.valueOf(jSONObject.getBoolean("collectLocation"));
                AbstractC1459k.d(this.scope, null, null, new b(jwt, valueOf, promise, null), 3, null);
            }
        }
        valueOf = null;
        AbstractC1459k.d(this.scope, null, null, new b(jwt, valueOf, promise, null), 3, null);
    }
}
