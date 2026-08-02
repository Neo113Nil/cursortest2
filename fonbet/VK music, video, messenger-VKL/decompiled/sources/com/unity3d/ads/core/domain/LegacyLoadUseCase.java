package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.UnityBannerSize;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;
import xsna.drm0;
import xsna.hn9;
import xsna.jvo0;
import xsna.k830;
import xsna.oxo0;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.tdj;
import xsna.uto0;
import xsna.wx0;
import xsna.zcl;

/* compiled from: LegacyLoadUseCase.kt */
/* loaded from: classes14.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private InternalLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private final Logger logger;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private uto0 startTime;

    /* compiled from: LegacyLoadUseCase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
        this.logger = logger;
    }

    private final String getAdInfoString(String str) {
        return tdj.a(new StringBuilder("for placement "), this.placement, " with instance id ", str);
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("adMarkup")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl _create = BannerSizeKt.Dsl.Companion._create(AdRequestOuterClass.BannerSize.newBuilder());
        _create.setWidth(unityBannerSize.getWidth());
        _create.setHeight(unityBannerSize.getHeight());
        return _create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str == null || drm0.N(str)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final Map<String, String> getTags(String str, String str2) {
        Pair pair = new Pair("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        Pair pair2 = new Pair("operation", OperationType.LOAD.toString());
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        LinkedHashMap m = pn00.m(pair, pair2, new Pair("new_api", String.valueOf((unityAdsLoadOptions != null ? unityAdsLoadOptions : null).loadConfiguration != null)));
        if (str != null && str.length() != 0) {
            m.put("reason", str);
        }
        if (str2 != null && str2.length() != 0) {
            m.put("reason_debug", str2);
        }
        return m;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String str) {
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.Companion;
        ByteString byteString = ProtobufExtensionsKt.toByteString(UUID.fromString(str));
        String str2 = this.placement;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = null;
        }
        return companion.getTmpAdObjectForEventSending(byteString, str2, this.isHeaderBidding, unityAdsLoadOptions, getAdType());
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, spj spjVar, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, spjVar);
    }

    private final void loadFailure(String str, LoadResult.Failure failure) {
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(str) + ", error: " + failure.getError() + " :: " + failure.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME;
        uto0 uto0Var = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, uto0Var != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)) : null, getTags(failure.getReason(), failure.getReasonDebug()), (Map) null, getTmpAdObject(str), (Integer) null, failure.getErrorToken(), 40, (Object) null);
        this.safeCallbackInvoke.invoke(new hn9(15, this, failure));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 loadFailure$lambda$3(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            int number = failure.getError().getNumber();
            String message = failure.getMessage();
            if (message == null) {
                message = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
            }
            internalLoadListener.onAdLoadFail(new UnityAdsError(number, message));
        }
        return s3q0.a;
    }

    private final uto0 loadStart(String str) {
        long b = k830.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED, (Double) null, getTags$default(this, null, null, 3, null), (Map) null, getTmpAdObject(str), (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (Object) null);
        return new jvo0.a(b);
    }

    private final void loadSuccess(AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        adObject.getState().setValue(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME;
        uto0 uto0Var = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, uto0Var != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)) : null, getTags$default(this, null, null, 3, null), (Map) null, adObject, (Integer) null, (ByteString) null, 104, (Object) null);
        this.safeCallbackInvoke.invoke(new wx0(11, this, adObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 loadSuccess$lambda$2(LegacyLoadUseCase legacyLoadUseCase, AdObject adObject) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            internalLoadListener.onAdLoaded(adObject);
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:13:0x00c4, B:15:0x00c8, B:16:0x00dd, B:18:0x00e1, B:22:0x00eb, B:24:0x00ef, B:25:0x00f5, B:26:0x00fa), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:13:0x00c4, B:15:0x00c8, B:16:0x00dd, B:18:0x00e1, B:22:0x00eb, B:24:0x00ef, B:25:0x00f5, B:26:0x00fa), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:13:0x00c4, B:15:0x00c8, B:16:0x00dd, B:18:0x00e1, B:22:0x00eb, B:24:0x00ef, B:25:0x00f5, B:26:0x00fa), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, spj<? super s3q0> spjVar) {
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$1;
        int i;
        Throwable th;
        String str2;
        LoadResult loadResult;
        if (spjVar instanceof LegacyLoadUseCase$invoke$1) {
            legacyLoadUseCase$invoke$1 = (LegacyLoadUseCase$invoke$1) spjVar;
            int i2 = legacyLoadUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyLoadUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$12 = legacyLoadUseCase$invoke$1;
                Object obj = legacyLoadUseCase$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = legacyLoadUseCase$invoke$12.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String opportunityId = getOpportunityId(unityAdsLoadOptions);
                    if (opportunityId == null) {
                        opportunityId = UUID.randomUUID().toString();
                    }
                    this.logger.info("Load invoked for placement: " + str + " with instance id: " + opportunityId);
                    long loadTimeoutMs = (long) this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
                    AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize);
                    this.loadOptions = unityAdsLoadOptions;
                    String adMarkup = getAdMarkup(unityAdsLoadOptions);
                    this.adMarkup = adMarkup;
                    this.isHeaderBidding = !(adMarkup == null || drm0.N(adMarkup));
                    this.isBanner = unityBannerSize != null;
                    this.listener = internalLoadListener;
                    this.placement = str;
                    this.startTime = loadStart(opportunityId);
                    try {
                        LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(opportunityId, this, context, str, bannerSize, unityAdsLoadOptions, null);
                        legacyLoadUseCase$invoke$12.L$0 = opportunityId;
                        legacyLoadUseCase$invoke$12.label = 1;
                        Object c = oxo0.c(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, legacyLoadUseCase$invoke$12);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str2 = opportunityId;
                        obj = c;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = opportunityId;
                        loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), null, 32, null));
                        return s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) legacyLoadUseCase$invoke$12.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), null, 32, null));
                        return s3q0.a;
                    }
                }
                loadResult = (LoadResult) obj;
                if (loadResult == null) {
                    loadResult = new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT, null, "timeout", null, null, 52, null);
                }
                if (!(loadResult instanceof LoadResult.Success)) {
                    loadSuccess(((LoadResult.Success) loadResult).getAdObject());
                } else {
                    if (!(loadResult instanceof LoadResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    loadFailure(str2, (LoadResult.Failure) loadResult);
                }
                return s3q0.a;
            }
        }
        legacyLoadUseCase$invoke$1 = new LegacyLoadUseCase$invoke$1(this, spjVar);
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$122 = legacyLoadUseCase$invoke$1;
        Object obj2 = legacyLoadUseCase$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = legacyLoadUseCase$invoke$122.label;
        if (i != 0) {
        }
        loadResult = (LoadResult) obj2;
        if (loadResult == null) {
        }
        if (!(loadResult instanceof LoadResult.Success)) {
        }
        return s3q0.a;
    }
}
