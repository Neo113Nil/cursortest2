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
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
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
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.eyx;
import xsna.fpf0;
import xsna.go9;
import xsna.gzs;
import xsna.iyx;
import xsna.jvo0;
import xsna.k830;
import xsna.msy;
import xsna.myc0;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.yok0;
import xsna.yvj;
import xsna.zcl;

/* compiled from: UnityAdsSDK.kt */
/* loaded from: classes14.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private eyx initializationJob;
    private final IServiceProvider serviceProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, spj<? super String> spjVar) {
        String str2;
        String str3;
        String str4;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str5 = "";
        Lazy a = msy.a(lazyThreadSafetyMode, new gzs<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // xsna.gzs
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, fpf0.a(TokenNumberProvider.class));
            }
        });
        Lazy a2 = msy.a(lazyThreadSafetyMode, new gzs<GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
            @Override // xsna.gzs
            public final GetHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, fpf0.a(GetHeaderBiddingToken.class));
            }
        });
        Lazy a3 = msy.a(lazyThreadSafetyMode, new gzs<GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
            @Override // xsna.gzs
            public final GetInitializationState invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, fpf0.a(GetInitializationState.class));
            }
        });
        Lazy a4 = msy.a(lazyThreadSafetyMode, new gzs<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$4
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // xsna.gzs
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, fpf0.a(SendDiagnosticEvent.class));
            }
        });
        Lazy a5 = msy.a(lazyThreadSafetyMode, new gzs<Logger>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$5
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // xsna.gzs
            public final Logger invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, fpf0.a(Logger.class));
            }
        });
        long b = k830.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$15(a4), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED, (Double) null, pn00.k(new Pair("sync", str), new Pair("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$14(a3), false, 1, null).toString())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$14(a3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) myc0.i(EmptyCoroutineContext.b, new UnityAdsSDK$fetchToken$token$1(a2, a, null));
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
        Double d = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b)));
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("sync", str);
        mapBuilder.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$14(a3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            mapBuilder.put("reason_debug", str3);
        }
        s3q0 s3q0Var = s3q0.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$15, diagnosticEventType, d, mapBuilder.h(), (Map) null, (AdObject) null, new Integer(fetchToken$lambda$12(a).invoke()), (ByteString) null, 88, (Object) null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$16(a5), go9.b("Returned nil token due to: ", str2), null, 2, null);
        } else {
            fetchToken$lambda$16(a5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$12(Lazy<? extends TokenNumberProvider> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$13(Lazy<? extends GetHeaderBiddingToken> lazy) {
        return lazy.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$14(Lazy<? extends GetInitializationState> lazy) {
        return lazy.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$15(Lazy<? extends SendDiagnosticEvent> lazy) {
        return lazy.getValue();
    }

    private static final Logger fetchToken$lambda$16(Lazy<? extends Logger> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$20(Lazy<? extends GetAdObject> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$21(Lazy<? extends OmFinishSession> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$10(Lazy<? extends TokenNumberProvider> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$11(Lazy<? extends GetAsyncHeaderBiddingToken> lazy) {
        return lazy.getValue();
    }

    private static final GetGameId getToken$lambda$9(Lazy<? extends GetGameId> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ eyx initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, InitializationConfiguration initializationConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        if ((i & 4) != 0) {
            initializationConfiguration = null;
        }
        return unityAdsSDK.initialize(str, str2, initializationConfiguration);
    }

    private static final ShouldAllowInitialization initialize$lambda$6$lambda$0(Lazy<? extends ShouldAllowInitialization> lazy) {
        return lazy.getValue();
    }

    private static final SessionRepository initialize$lambda$6$lambda$4$lambda$1(Lazy<? extends SessionRepository> lazy) {
        return lazy.getValue();
    }

    private static final ValidateExtrasSize initialize$lambda$6$lambda$4$lambda$2(Lazy<ValidateExtrasSize> lazy) {
        return lazy.getValue();
    }

    private static final Logger initialize$lambda$6$lambda$4$lambda$3(Lazy<? extends Logger> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$6$lambda$5(Lazy<? extends InitializeBoldSDK> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ eyx load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, internalLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$7(Lazy<? extends GetGameId> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$8(Lazy<? extends Context> lazy) {
        return lazy.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$22(Lazy<? extends SendDiagnosticEvent> lazy) {
        return lazy.getValue();
    }

    public final eyx finishOMIDSession(String str) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str2 = "";
        Lazy a = msy.a(lazyThreadSafetyMode, new gzs<GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // xsna.gzs
            public final GetAdObject invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(GetAdObject.class));
            }
        });
        Lazy a2 = msy.a(lazyThreadSafetyMode, new gzs<OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // xsna.gzs
            public final OmFinishSession invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(OmFinishSession.class));
            }
        });
        yvj yvjVar = (yvj) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, fpf0.a(yvj.class));
        return myc0.h(yvjVar, null, null, new UnityAdsSDK$finishOMIDSession$1(str, yvjVar, a, a2, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) myc0.i(EmptyCoroutineContext.b, new UnityAdsSDK$getToken$1(this, null));
    }

    public final eyx initialize(String str, String str2, InitializationConfiguration initializationConfiguration) {
        synchronized (this) {
            eyx eyxVar = this.initializationJob;
            if (eyxVar != null && eyxVar.isActive()) {
                return eyxVar;
            }
            final String str3 = "";
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            if (!initialize$lambda$6$lambda$0(msy.a(lazyThreadSafetyMode, new gzs<ShouldAllowInitialization>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$$inlined$inject$default$1
                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
                @Override // xsna.gzs
                public final ShouldAllowInitialization invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str3, fpf0.a(ShouldAllowInitialization.class));
                }
            })).invoke(str)) {
                return iyx.a();
            }
            if (initializationConfiguration != null) {
                final String str4 = "";
                Lazy a = msy.a(lazyThreadSafetyMode, new gzs<SessionRepository>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$lambda$4$$inlined$inject$default$1
                    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
                    @Override // xsna.gzs
                    public final SessionRepository invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str4, fpf0.a(SessionRepository.class));
                    }
                });
                final String str5 = "";
                ValidateExtrasSize.invoke$default(initialize$lambda$6$lambda$4$lambda$2(msy.a(lazyThreadSafetyMode, new gzs<ValidateExtrasSize>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$lambda$4$$inlined$inject$default$2
                    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.ValidateExtrasSize, java.lang.Object] */
                    @Override // xsna.gzs
                    public final ValidateExtrasSize invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str5, fpf0.a(ValidateExtrasSize.class));
                    }
                })), initializationConfiguration.getExtras(), "init", null, 4, null);
                initialize$lambda$6$lambda$4$lambda$1(a).setInitializationConfiguration(new InitializationConfigurationInternal(initializationConfiguration.getGameId(), initializationConfiguration.isTestModeEnabled(), initializationConfiguration.getLogLevel(), initializationConfiguration.getExtras(), initializationConfiguration.getMediationInfo()));
                final String str6 = "";
                initialize$lambda$6$lambda$4$lambda$3(msy.a(lazyThreadSafetyMode, new gzs<Logger>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$lambda$4$$inlined$inject$default$3
                    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
                    @Override // xsna.gzs
                    public final Logger invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str6, fpf0.a(Logger.class));
                    }
                })).setLogLevel(LogLevelKt.toLogLevelInternal(initializationConfiguration.getLogLevel()));
            }
            final String str7 = "";
            Lazy a2 = msy.a(lazyThreadSafetyMode, new gzs<InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$6$$inlined$inject$default$2
                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
                @Override // xsna.gzs
                public final InitializeBoldSDK invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str7, fpf0.a(InitializeBoldSDK.class));
                }
            });
            yvj yvjVar = (yvj) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, fpf0.a(yvj.class));
            yok0 h = myc0.h(yvjVar, null, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(str2, yvjVar, a2, null), 3);
            this.initializationJob = h;
            return h;
        }
    }

    public final eyx load(String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str2 = "";
        initialize$default(this, load$lambda$7(msy.a(lazyThreadSafetyMode, new gzs<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // xsna.gzs
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(GetGameId.class));
            }
        })).invoke(), "load", null, 4, null);
        yvj yvjVar = (yvj) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, fpf0.a(yvj.class));
        return myc0.h(yvjVar, null, null, new UnityAdsSDK$load$1(this, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, yvjVar, msy.a(lazyThreadSafetyMode, new gzs<Context>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // xsna.gzs
            public final Context invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(Context.class));
            }
        }), null), 3);
    }

    public final void sendBannerDestroyed() {
        final String str = "";
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$22(msy.a(LazyThreadSafetyMode.NONE, new gzs<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // xsna.gzs
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(SendDiagnosticEvent.class));
            }
        })), "native_banner_destroyed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
    }

    public final eyx show(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners) {
        yvj yvjVar = (yvj) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, fpf0.a(yvj.class));
        return myc0.h(yvjVar, null, null, new UnityAdsSDK$show$1((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", fpf0.a(LegacyShowUseCase.class)), str, unityAdsShowOptions, listeners, yvjVar, null), 3);
    }

    public UnityAdsSDK(IServiceProvider iServiceProvider) {
        this.serviceProvider = iServiceProvider;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i, zcl zclVar) {
        this((i & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    public final eyx getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    public final eyx getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = "";
        initialize$default(this, getToken$lambda$9(msy.a(lazyThreadSafetyMode, new gzs<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // xsna.gzs
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(GetGameId.class));
            }
        })).invoke(), "get_token", null, 4, null);
        Lazy a = msy.a(lazyThreadSafetyMode, new gzs<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // xsna.gzs
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(TokenNumberProvider.class));
            }
        });
        Lazy a2 = msy.a(lazyThreadSafetyMode, new gzs<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // xsna.gzs
            public final GetAsyncHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(GetAsyncHeaderBiddingToken.class));
            }
        });
        yvj yvjVar = (yvj) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, fpf0.a(yvj.class));
        return myc0.h(yvjVar, null, null, new UnityAdsSDK$getToken$2(tokenConfiguration, iUnityAdsTokenListener, yvjVar, a2, a, null), 3);
    }
}
