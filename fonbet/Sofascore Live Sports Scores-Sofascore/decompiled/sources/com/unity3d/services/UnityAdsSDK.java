package com.unity3d.services;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.LogLevelKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bea;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fuf;
import defpackage.g9i;
import defpackage.joa;
import defpackage.ku3;
import defpackage.ltb;
import defpackage.rq3;
import defpackage.td4;
import defpackage.tub;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.xw3;
import defpackage.yda;
import defpackage.ypa;
import defpackage.ysa;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010!J!\u0010\u001e\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0014\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010$J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010+\u001a\u00020\bH\u0082@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u0006M²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020C8\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020I8\nX\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Lcom/unity3d/services/core/di/IServiceProvider;", "serviceProvider", "<init>", "(Lcom/unity3d/services/core/di/IServiceProvider;)V", "getServiceProvider", "()Lcom/unity3d/services/core/di/IServiceProvider;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "source", "Lcom/unity3d/ads/InitializationConfiguration;", "initializationConfiguration", "Lyda;", "initialize", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/InitializationConfiguration;)Lyda;", "placementId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "listener", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "load", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;)Lyda;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "Lcom/unity3d/ads/core/data/model/Listeners;", "show", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;)Lyda;", "getToken", "()Ljava/lang/String;", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)Lyda;", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;)Lyda;", "opportunityId", "finishOMIDSession", "(Ljava/lang/String;)Lyda;", "", "sendBannerDestroyed", "()V", "sync", "fetchToken", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/core/di/IServiceProvider;", "initializationJob", "Lyda;", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "shouldAllowInitialization", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "tokenNumberProvider", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAdObject;", "getAdObject", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omFinishSession", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnityAdsSDK implements IServiceComponent {

    @Nullable
    private yda initializationJob;

    @NotNull
    private final IServiceProvider serviceProvider;

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, rq3<? super String> rq3Var) {
        String str2;
        String str3;
        String str4;
        ysa ysaVar = ysa.c;
        final String str5 = "";
        joa a = ypa.a(ysaVar, new Function0<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, duf.a.getOrCreateKotlinClass(TokenNumberProvider.class));
            }
        });
        joa a2 = ypa.a(ysaVar, new Function0<GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, duf.a.getOrCreateKotlinClass(GetHeaderBiddingToken.class));
            }
        });
        joa a3 = ypa.a(ysaVar, new Function0<GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetInitializationState invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, duf.a.getOrCreateKotlinClass(GetInitializationState.class));
            }
        });
        joa a4 = ypa.a(ysaVar, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$4
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, duf.a.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        });
        joa a5 = ypa.a(ysaVar, new Function0<Logger>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$5
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Logger invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, duf.a.getOrCreateKotlinClass(Logger.class));
            }
        });
        xhj.a.getClass();
        xuc.a.getClass();
        long b = xuc.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$15(a4), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED, (Double) null, tub.h(new Pair("sync", str), new Pair("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$14(a3), false, 1, null).toString())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$14(a3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) td4.t0(g.a, new UnityAdsSDK$fetchToken$token$1(a2, a, null));
                str2 = null;
                str3 = null;
            } catch (Exception e) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent fetchToken$lambda$15 = fetchToken$lambda$15(a4);
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = str4 == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME;
        Double d = new Double(TimeExtensionsKt.elapsedMillis(new whj(b)));
        ltb ltbVar = new ltb();
        ltbVar.put("sync", str);
        ltbVar.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$14(a3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            ltbVar.put("reason_debug", str3);
        }
        Unit unit = Unit.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$15, diagnosticEventType, d, ltbVar.d(), (Map) null, (AdObject) null, new Integer(fetchToken$lambda$12(a).invoke()), (ByteString) null, 88, (Object) null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$16(a5), dmi.q("Returned nil token due to: ", str2), null, 2, null);
        } else {
            fetchToken$lambda$16(a5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$12(joa joaVar) {
        return (TokenNumberProvider) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$13(joa joaVar) {
        return (GetHeaderBiddingToken) joaVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$14(joa joaVar) {
        return (GetInitializationState) joaVar.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$15(joa joaVar) {
        return (SendDiagnosticEvent) joaVar.getValue();
    }

    private static final Logger fetchToken$lambda$16(joa joaVar) {
        return (Logger) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$20(joa joaVar) {
        return (GetAdObject) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$21(joa joaVar) {
        return (OmFinishSession) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$10(joa joaVar) {
        return (TokenNumberProvider) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$11(joa joaVar) {
        return (GetAsyncHeaderBiddingToken) joaVar.getValue();
    }

    private static final GetGameId getToken$lambda$9(joa joaVar) {
        return (GetGameId) joaVar.getValue();
    }

    public static /* synthetic */ yda initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, InitializationConfiguration initializationConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        if ((i & 4) != 0) {
            initializationConfiguration = null;
        }
        return unityAdsSDK.initialize(str, str2, initializationConfiguration);
    }

    private static final ShouldAllowInitialization initialize$lambda$6$lambda$0(joa joaVar) {
        return (ShouldAllowInitialization) joaVar.getValue();
    }

    private static final SessionRepository initialize$lambda$6$lambda$4$lambda$1(joa joaVar) {
        return (SessionRepository) joaVar.getValue();
    }

    private static final ValidateExtrasSize initialize$lambda$6$lambda$4$lambda$2(joa joaVar) {
        return (ValidateExtrasSize) joaVar.getValue();
    }

    private static final Logger initialize$lambda$6$lambda$4$lambda$3(joa joaVar) {
        return (Logger) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$6$lambda$5(joa joaVar) {
        return (InitializeBoldSDK) joaVar.getValue();
    }

    public static /* synthetic */ yda load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, internalLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$7(joa joaVar) {
        return (GetGameId) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$8(joa joaVar) {
        return (Context) joaVar.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$22(joa joaVar) {
        return (SendDiagnosticEvent) joaVar.getValue();
    }

    @NotNull
    public final yda finishOMIDSession(@NotNull String opportunityId) {
        opportunityId.getClass();
        ysa ysaVar = ysa.c;
        final String str = "";
        joa a = ypa.a(ysaVar, new Function0<GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetAdObject invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(GetAdObject.class));
            }
        });
        joa a2 = ypa.a(ysaVar, new Function0<OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final OmFinishSession invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(OmFinishSession.class));
            }
        });
        ku3 ku3Var = (ku3) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class));
        return xw3.L(ku3Var, null, null, new UnityAdsSDK$finishOMIDSession$1(opportunityId, ku3Var, a, a2, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    @NotNull
    public final yda getToken(@Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener listener) {
        ysa ysaVar = ysa.c;
        final String str = "";
        initialize$default(this, getToken$lambda$9(ypa.a(ysaVar, new Function0<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(GetGameId.class));
            }
        })).invoke(), "get_token", null, 4, null);
        joa a = ypa.a(ysaVar, new Function0<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(TokenNumberProvider.class));
            }
        });
        joa a2 = ypa.a(ysaVar, new Function0<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetAsyncHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class));
            }
        });
        ku3 ku3Var = (ku3) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class));
        return xw3.L(ku3Var, null, null, new UnityAdsSDK$getToken$2(tokenConfiguration, listener, ku3Var, a2, a, null), 3);
    }

    @NotNull
    public final yda initialize(@Nullable String gameId, @NotNull String source, @Nullable InitializationConfiguration initializationConfiguration) {
        source.getClass();
        synchronized (this) {
            yda ydaVar = this.initializationJob;
            if (ydaVar != null && ydaVar.isActive()) {
                return ydaVar;
            }
            final String str = "";
            ysa ysaVar = ysa.c;
            if (!initialize$lambda$6$lambda$0(ypa.a(ysaVar, new Function0<ShouldAllowInitialization>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$$inlined$inject$default$1
                /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final ShouldAllowInitialization invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(ShouldAllowInitialization.class));
                }
            })).invoke(gameId)) {
                return bea.a();
            }
            if (initializationConfiguration != null) {
                final String str2 = "";
                joa a = ypa.a(ysaVar, new Function0<SessionRepository>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$lambda$4$$inlined$inject$default$1
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final SessionRepository invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str2, duf.a.getOrCreateKotlinClass(SessionRepository.class));
                    }
                });
                final String str3 = "";
                ValidateExtrasSize.invoke$default(initialize$lambda$6$lambda$4$lambda$2(ypa.a(ysaVar, new Function0<ValidateExtrasSize>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$lambda$4$$inlined$inject$default$2
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.ValidateExtrasSize, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final ValidateExtrasSize invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str3, duf.a.getOrCreateKotlinClass(ValidateExtrasSize.class));
                    }
                })), initializationConfiguration.getExtras(), "init", null, 4, null);
                initialize$lambda$6$lambda$4$lambda$1(a).setInitializationConfiguration(new InitializationConfigurationInternal(initializationConfiguration.getGameId(), initializationConfiguration.getIsTestModeEnabled(), initializationConfiguration.getLogLevel(), initializationConfiguration.getExtras(), initializationConfiguration.getMediationInfo()));
                final String str4 = "";
                initialize$lambda$6$lambda$4$lambda$3(ypa.a(ysaVar, new Function0<Logger>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$lambda$4$$inlined$inject$default$3
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Logger invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str4, duf.a.getOrCreateKotlinClass(Logger.class));
                    }
                })).setLogLevel(LogLevelKt.toLogLevelInternal(initializationConfiguration.getLogLevel()));
            }
            final String str5 = "";
            joa a2 = ypa.a(ysaVar, new Function0<InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$$inlined$inject$default$2
                /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final InitializeBoldSDK invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str5, duf.a.getOrCreateKotlinClass(InitializeBoldSDK.class));
                }
            });
            ku3 ku3Var = (ku3) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class));
            g9i L = xw3.L(ku3Var, null, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(source, ku3Var, a2, null), 3);
            this.initializationJob = L;
            return L;
        }
    }

    @NotNull
    public final yda load(@Nullable String placementId, @NotNull UnityAdsLoadOptions loadOptions, @Nullable InternalLoadListener listener, @Nullable UnityBannerSize bannerSize) {
        loadOptions.getClass();
        ysa ysaVar = ysa.c;
        final String str = "";
        initialize$default(this, load$lambda$7(ypa.a(ysaVar, new Function0<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(GetGameId.class));
            }
        })).invoke(), "load", null, 4, null);
        ku3 ku3Var = (ku3) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class));
        return xw3.L(ku3Var, null, null, new UnityAdsSDK$load$1(this, placementId, loadOptions, listener, bannerSize, ku3Var, ypa.a(ysaVar, new Function0<Context>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Context invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(Context.class));
            }
        }), null), 3);
    }

    public final void sendBannerDestroyed() {
        final String str = "";
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$22(ypa.a(ysa.c, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        })), "native_banner_destroyed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
    }

    @NotNull
    public final yda show(@Nullable String placementId, @Nullable UnityAdsShowOptions showOptions, @NotNull Listeners listener) {
        listener.getClass();
        IServicesRegistry registry = getServiceProvider().getRegistry();
        fuf fufVar = duf.a;
        ku3 ku3Var = (ku3) registry.getService(ServiceProvider.NAMED_SHOW_SCOPE, fufVar.getOrCreateKotlinClass(ku3.class));
        return xw3.L(ku3Var, null, null, new UnityAdsSDK$show$1((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", fufVar.getOrCreateKotlinClass(LegacyShowUseCase.class)), placementId, showOptions, listener, ku3Var, null), 3);
    }

    public UnityAdsSDK(@NotNull IServiceProvider iServiceProvider) {
        iServiceProvider.getClass();
        this.serviceProvider = iServiceProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final yda getToken(@Nullable IUnityAdsTokenListener listener) {
        return getToken(null, listener);
    }

    @Nullable
    public final String getToken() {
        return (String) td4.t0(g.a, new UnityAdsSDK$getToken$1(this, null));
    }
}
