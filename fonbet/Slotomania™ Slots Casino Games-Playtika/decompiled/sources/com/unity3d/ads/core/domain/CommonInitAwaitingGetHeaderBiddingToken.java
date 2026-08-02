package com.unity3d.ads.core.domain;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import io.sentry.SentryEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J#\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J-\u00105\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096Bø\u0001\u0000¢\u0006\u0002\u00106J0\u00107\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u001a\u0010;\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0002J\"\u0010<\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010=\u001a\u0002092\b\u00102\u001a\u0004\u0018\u000103H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u00020*ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", SentryEvent.JsonKeys.LOGGER, "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "didAwaitInit", "", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", "setListener", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "getSafeCallbackInvoke", "()Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "startTime", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "getStartTime-z9LOYto", "()J", "J", "fetchToken", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenFailure", "reason", "", "reasonDebug", "tokenStart", "tokenSuccess", "token", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
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
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        Intrinsics.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = TimeSource.Monotonic.INSTANCE.m12642markNowz9LOYto();
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r11.fetchToken(r9, r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, Continuation<? super Unit> continuation) {
        CommonInitAwaitingGetHeaderBiddingToken$invoke$1 commonInitAwaitingGetHeaderBiddingToken$invoke$1;
        int i2;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        if (continuation instanceof CommonInitAwaitingGetHeaderBiddingToken$invoke$1) {
            commonInitAwaitingGetHeaderBiddingToken$invoke$1 = (CommonInitAwaitingGetHeaderBiddingToken$invoke$1) continuation;
            if ((commonInitAwaitingGetHeaderBiddingToken$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.listener = iUnityAdsTokenListener;
                    tokenStart(i, tokenConfiguration);
                    if (iUnityAdsTokenListener == null) {
                        tokenFailure(i, "listener_null", "IUnityAdsTokenListener is null", tokenConfiguration);
                        return Unit.INSTANCE;
                    }
                    if (!this.sessionRepository.getShouldInitialize()) {
                        tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                        return Unit.INSTANCE;
                    }
                    long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
                    CommonInitAwaitingGetHeaderBiddingToken$invoke$2 commonInitAwaitingGetHeaderBiddingToken$invoke$2 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this, null);
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = this;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$1 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 1;
                    if (TimeoutKt.withTimeoutOrNull(getTokenTimeoutMs, commonInitAwaitingGetHeaderBiddingToken$invoke$2, commonInitAwaitingGetHeaderBiddingToken$invoke$1) != coroutine_suspended) {
                        commonInitAwaitingGetHeaderBiddingToken = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                i = commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0;
                tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$1;
                commonInitAwaitingGetHeaderBiddingToken = (CommonInitAwaitingGetHeaderBiddingToken) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (commonInitAwaitingGetHeaderBiddingToken.sessionRepository.getShouldInitialize()) {
                    commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                    return Unit.INSTANCE;
                }
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$1 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 2;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$invoke$1 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$1(this, continuation);
        Object obj2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        if (commonInitAwaitingGetHeaderBiddingToken.sessionRepository.getShouldInitialize()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchToken(int i, TokenConfiguration tokenConfiguration, Continuation<? super Unit> continuation) {
        CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 commonInitAwaitingGetHeaderBiddingToken$fetchToken$1;
        int i2;
        String str;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        String shortenedStackTrace$default;
        String str2;
        if (continuation instanceof CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = (CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) continuation;
            if ((commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label -= Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
                str = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0 = this;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$1 = tokenConfiguration;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0 = i;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = 1;
                        obj = getHeaderBiddingToken.invoke(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$fetchToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        commonInitAwaitingGetHeaderBiddingToken = this;
                    } catch (Exception e) {
                        e = e;
                        commonInitAwaitingGetHeaderBiddingToken = this;
                        shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                        str2 = "uncaught_exception";
                        if (str != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$1;
                    commonInitAwaitingGetHeaderBiddingToken = (CommonInitAwaitingGetHeaderBiddingToken) commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                        str2 = "uncaught_exception";
                        if (str != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                str2 = null;
                str = (String) obj;
                shortenedStackTrace$default = null;
                if (str != null) {
                    commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str2, shortenedStackTrace$default, tokenConfiguration);
                } else {
                    commonInitAwaitingGetHeaderBiddingToken.tokenSuccess(i, str, tokenConfiguration);
                }
                return Unit.INSTANCE;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = new CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1(this, continuation);
        Object obj2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
        str = null;
        if (i2 != 0) {
        }
        str2 = null;
        str = (String) obj2;
        shortenedStackTrace$default = null;
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    private final void tokenSuccess(int tokenNumber, final String token, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.startTime)));
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("sync", "false");
        pairArr[1] = TuplesKt.to("state", String.valueOf(this.startState));
        pairArr[2] = TuplesKt.to("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        pairArr[3] = TuplesKt.to("awaited_init", String.valueOf(this.didAwaitInit));
        pairArr[4] = TuplesKt.to("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_success_time", valueOf, MapsKt.mapOf(pairArr), null, null, Integer.valueOf(tokenNumber), 24, null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(token);
                }
            }
        });
    }

    static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, TokenConfiguration tokenConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2, tokenConfiguration);
    }

    private final void tokenFailure(int tokenNumber, String reason, String reasonDebug, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.startTime)));
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("sync", "false");
        createMapBuilder.put("state", String.valueOf(this.startState));
        createMapBuilder.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        createMapBuilder.put("awaited_init", String.valueOf(this.didAwaitInit));
        createMapBuilder.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            createMapBuilder.put("reason_debug", reasonDebug);
        }
        Unit unit = Unit.INSTANCE;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", valueOf, MapsKt.build(createMapBuilder), null, null, Integer.valueOf(tokenNumber), 24, null);
        Logger.DefaultImpls.error$default(this.logger, "Returned nil token due to: " + reason, null, 2, null);
        this.safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenFailure$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(null);
                }
            }
        });
    }

    private final void tokenStart(int tokenNumber, TokenConfiguration tokenConfiguration) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("sync", "false");
        createMapBuilder.put("state", String.valueOf(this.startState));
        createMapBuilder.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        Unit unit = Unit.INSTANCE;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_started", null, MapsKt.build(createMapBuilder), null, null, Integer.valueOf(tokenNumber), 26, null);
    }
}
