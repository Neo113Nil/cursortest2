package com.unity3d.ads.core.domain;

import androidx.credentials.provider.CredentialEntry;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.go9;
import xsna.jvo0;
import xsna.k830;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.xk;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
/* loaded from: classes14.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final Logger logger;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime = k830.b();

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(1:15)(1:19)|16|17))|29|6|7|(0)(0)|12|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, 0, 1, null);
        r0 = "uncaught_exception";
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchToken(int i, TokenConfiguration tokenConfiguration, spj<? super s3q0> spjVar) {
        CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 commonInitAwaitingGetHeaderBiddingToken$fetchToken$1;
        int i2;
        String str;
        if (spjVar instanceof CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = (CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) spjVar;
            int i3 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
                str = null;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = 1;
                    obj = getHeaderBiddingToken.invoke(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$fetchToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0;
                    kotlin.a.a(obj);
                }
                String str2 = null;
                str = (String) obj;
                String shortenedStackTrace$default = null;
                if (str != null) {
                    tokenFailure(i, str2, shortenedStackTrace$default, tokenConfiguration);
                } else {
                    tokenSuccess(i, str, tokenConfiguration);
                }
                return s3q0.a;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = new CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1(this, spjVar);
        Object obj2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
        str = null;
        if (i2 != 0) {
        }
        String str22 = null;
        str = (String) obj2;
        String shortenedStackTrace$default2 = null;
        if (str != null) {
        }
        return s3q0.a;
    }

    private final void tokenFailure(int i, String str, String str2, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new jvo0.a(this.startTime)));
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("sync", CredentialEntry.FALSE_STRING);
        mapBuilder.put("state", String.valueOf(this.startState));
        mapBuilder.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        mapBuilder.put("awaited_init", String.valueOf(this.didAwaitInit));
        mapBuilder.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.isNewApi() : false));
        if (str != null) {
        }
        if (str2 != null) {
            mapBuilder.put("reason_debug", str2);
        }
        s3q0 s3q0Var = s3q0.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, mapBuilder.h(), (Map) null, (AdObject) null, Integer.valueOf(i), (ByteString) null, 88, (Object) null);
        Logger.DefaultImpls.error$default(this.logger, go9.b("Returned nil token due to: ", str), null, 2, null);
        this.safeCallbackInvoke.invoke(new f(this, 27));
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, TokenConfiguration tokenConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2, tokenConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
        return s3q0.a;
    }

    private final void tokenStart(int i, TokenConfiguration tokenConfiguration) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("sync", CredentialEntry.FALSE_STRING);
        mapBuilder.put("state", String.valueOf(this.startState));
        mapBuilder.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.isNewApi() : false));
        s3q0 s3q0Var = s3q0.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, mapBuilder.h(), (Map) null, (AdObject) null, Integer.valueOf(i), (ByteString) null, 90, (Object) null);
    }

    private final void tokenSuccess(int i, String str, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(new jvo0.a(this.startTime))), pn00.k(new Pair("sync", CredentialEntry.FALSE_STRING), new Pair("state", String.valueOf(this.startState)), new Pair("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new Pair("awaited_init", String.valueOf(this.didAwaitInit)), new Pair("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.isNewApi() : false))), (Map) null, (AdObject) null, Integer.valueOf(i), (ByteString) null, 88, (Object) null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new xk(8, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(str);
        }
        return s3q0.a;
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name */
    public final long m71getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (fetchToken(r9, r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (xsna.oxo0.c(r11, r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, spj<? super s3q0> spjVar) {
        CommonInitAwaitingGetHeaderBiddingToken$invoke$1 commonInitAwaitingGetHeaderBiddingToken$invoke$1;
        int i2;
        if (spjVar instanceof CommonInitAwaitingGetHeaderBiddingToken$invoke$1) {
            commonInitAwaitingGetHeaderBiddingToken$invoke$1 = (CommonInitAwaitingGetHeaderBiddingToken$invoke$1) spjVar;
            int i3 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    this.listener = iUnityAdsTokenListener;
                    tokenStart(i, tokenConfiguration);
                    if (iUnityAdsTokenListener == null) {
                        tokenFailure(i, "listener_null", "IUnityAdsTokenListener is null", tokenConfiguration);
                        return s3q0.a;
                    }
                    if (!this.sessionRepository.getShouldInitialize()) {
                        tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                        return s3q0.a;
                    }
                    long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
                    CommonInitAwaitingGetHeaderBiddingToken$invoke$2 commonInitAwaitingGetHeaderBiddingToken$invoke$2 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this, null);
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0;
                    kotlin.a.a(obj);
                }
                if (this.sessionRepository.getShouldInitialize()) {
                    tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                    return s3q0.a;
                }
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 2;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$invoke$1 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$1(this, spjVar);
        Object obj3 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        if (this.sessionRepository.getShouldInitialize()) {
        }
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
