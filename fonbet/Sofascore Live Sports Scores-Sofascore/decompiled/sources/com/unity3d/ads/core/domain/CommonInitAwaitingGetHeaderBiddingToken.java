package com.unity3d.ads.core.domain;

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
import defpackage.a70;
import defpackage.dmi;
import defpackage.ix1;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import defpackage.yj1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b!\u0010\"J,\u0010%\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010$\u001a\u0004\u0018\u00010#H\u0096B¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0017\u0010=\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "awaitInitialization", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "fetchToken", "(ILcom/unity3d/ads/TokenConfiguration;Lrq3;)Ljava/lang/Object;", "", "token", "tokenSuccess", "(ILjava/lang/String;Lcom/unity3d/ads/TokenConfiguration;)V", "reason", "reasonDebug", "tokenFailure", "(ILjava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/TokenConfiguration;)V", "tokenStart", "(ILcom/unity3d/ads/TokenConfiguration;)V", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "listener", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "getSafeCallbackInvoke", "()Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/log/Logger;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "Lwhj;", "startTime", "J", "getStartTime-z9LOYto", "()J", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", "setListener", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "", "didAwaitInit", "Z", "Lcom/unity3d/ads/core/data/model/InitializationState;", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {

    @NotNull
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;

    @NotNull
    private final GetHeaderBiddingToken getHeaderBiddingToken;

    @NotNull
    private final GetInitializationState getInitializationState;

    @Nullable
    private IUnityAdsTokenListener listener;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @Nullable
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(@NotNull GetHeaderBiddingToken getHeaderBiddingToken, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetInitializationState getInitializationState, @NotNull AwaitInitialization awaitInitialization, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        getHeaderBiddingToken.getClass();
        sendDiagnosticEvent.getClass();
        getInitializationState.getClass();
        awaitInitialization.getClass();
        sessionRepository.getClass();
        safeCallbackInvoke.getClass();
        logger.getClass();
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        xhj.a.getClass();
        xuc.a.getClass();
        this.startTime = xuc.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(1:15)(1:19)|16|17))|29|6|7|(0)(0)|12|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, 0, 1, null);
        r0 = "uncaught_exception";
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchToken(int i, TokenConfiguration tokenConfiguration, rq3<? super Unit> rq3Var) {
        CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 commonInitAwaitingGetHeaderBiddingToken$fetchToken$1;
        int i2;
        String str;
        if (rq3Var instanceof CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = (CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) rq3Var;
            int i3 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
                lu3 lu3Var = lu3.a;
                i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
                str = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = 1;
                    obj = getHeaderBiddingToken.invoke(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$fetchToken$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0;
                    y6a.M(obj);
                }
                String str2 = null;
                str = (String) obj;
                String shortenedStackTrace$default = null;
                if (str != null) {
                    tokenFailure(i, str2, shortenedStackTrace$default, tokenConfiguration);
                } else {
                    tokenSuccess(i, str, tokenConfiguration);
                }
                return Unit.a;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = new CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1(this, rq3Var);
        Object obj2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
        lu3 lu3Var2 = lu3.a;
        i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
        str = null;
        if (i2 != 0) {
        }
        String str22 = null;
        str = (String) obj2;
        String shortenedStackTrace$default2 = null;
        if (str != null) {
        }
        return Unit.a;
    }

    private final void tokenFailure(int tokenNumber, String reason, String reasonDebug, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new whj(this.startTime)));
        ltb ltbVar = new ltb();
        ltbVar.put("sync", "false");
        ltbVar.put("state", String.valueOf(this.startState));
        ltbVar.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        ltbVar.put("awaited_init", String.valueOf(this.didAwaitInit));
        ltbVar.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            ltbVar.put("reason_debug", reasonDebug);
        }
        Unit unit = Unit.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, ltbVar.d(), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), (ByteString) null, 88, (Object) null);
        Logger.DefaultImpls.error$default(this.logger, dmi.q("Returned nil token due to: ", reason), null, 2, null);
        this.safeCallbackInvoke.invoke(new yj1(this, 28));
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, TokenConfiguration tokenConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2, tokenConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
        return Unit.a;
    }

    private final void tokenStart(int tokenNumber, TokenConfiguration tokenConfiguration) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED;
        ltb ltbVar = new ltb();
        ltbVar.put("sync", "false");
        ltbVar.put("state", String.valueOf(this.startState));
        ltbVar.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        Unit unit = Unit.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, ltbVar.d(), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), (ByteString) null, 90, (Object) null);
    }

    private final void tokenSuccess(int tokenNumber, String token, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(new whj(this.startTime))), tub.h(new Pair("sync", "false"), new Pair("state", String.valueOf(this.startState)), new Pair("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new Pair("awaited_init", String.valueOf(this.didAwaitInit)), new Pair("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false))), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), (ByteString) null, 88, (Object) null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new ix1(19, this, token));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(str);
        }
        return Unit.a;
    }

    @NotNull
    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    @NotNull
    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    @NotNull
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @Nullable
    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    @NotNull
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    @NotNull
    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (fetchToken(r9, r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (defpackage.wba.V(r11, r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener iUnityAdsTokenListener, @NotNull rq3<? super Unit> rq3Var) {
        CommonInitAwaitingGetHeaderBiddingToken$invoke$1 commonInitAwaitingGetHeaderBiddingToken$invoke$1;
        int i2;
        if (rq3Var instanceof CommonInitAwaitingGetHeaderBiddingToken$invoke$1) {
            commonInitAwaitingGetHeaderBiddingToken$invoke$1 = (CommonInitAwaitingGetHeaderBiddingToken$invoke$1) rq3Var;
            int i3 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
                Object obj2 = lu3.a;
                i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    y6a.M(obj);
                    this.listener = iUnityAdsTokenListener;
                    tokenStart(i, tokenConfiguration);
                    if (iUnityAdsTokenListener == null) {
                        tokenFailure(i, "listener_null", "IUnityAdsTokenListener is null", tokenConfiguration);
                        return Unit.a;
                    }
                    if (!this.sessionRepository.getShouldInitialize()) {
                        tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                        return Unit.a;
                    }
                    long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
                    CommonInitAwaitingGetHeaderBiddingToken$invoke$2 commonInitAwaitingGetHeaderBiddingToken$invoke$2 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this, null);
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0;
                    y6a.M(obj);
                }
                if (this.sessionRepository.getShouldInitialize()) {
                    tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                    return Unit.a;
                }
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 2;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$invoke$1 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$1(this, rq3Var);
        Object obj3 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
        Object obj22 = lu3.a;
        i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        if (this.sessionRepository.getShouldInitialize()) {
        }
    }

    public final void setListener(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
