package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
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
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import io.sentry.SentryEvent;
import java.util.Map;
import java.util.UUID;
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
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

/* compiled from: LegacyLoadUseCase.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CBM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0012\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010&\u001a\u00020\u001dH\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0014\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010\u00162\u0006\u0010&\u001a\u00020\u001dH\u0002J,\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u00104\u001a\u0002052\u0006\u0010$\u001a\u00020\u00162\b\b\u0002\u00106\u001a\u00020\u0018H\u0002JA\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010;\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u0002082\u0006\u0010$\u001a\u00020\u00162\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0016H\u0002J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u000205H\u0002R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "", "load", "Lcom/unity3d/ads/core/domain/Load;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "cleanUpWhenOpportunityExpires", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", SentryEvent.JsonKeys.LOGGER, "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/domain/Load;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;Lcom/unity3d/ads/core/log/Logger;)V", "adMarkup", "", X3.w, "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunity", "Lcom/google/protobuf/ByteString;", "placement", "startTime", "Lkotlin/time/TimeMark;", "getAdInfoString", "opportunityId", "getAdMarkup", "unityAdsLoadOptions", "getAdType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getBannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", "getHeaderBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "getOpportunityId", "getTags", "", "reason", "reasonDebug", "getTmpAdObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "isScarAd", "invoke", "", "context", "Landroid/content/Context;", "unityLoadListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFailure", "loadResult", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "loadStart", "loadSuccess", "adObject", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LegacyLoadUseCase {
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
    private TimeMark startTime;

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        Intrinsics.checkNotNullParameter(load, "load");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        Intrinsics.checkNotNullParameter(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        Intrinsics.checkNotNullParameter(logger, "logger");
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

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00de A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x003c, B:12:0x00da, B:14:0x00de, B:15:0x00f5, B:17:0x00f9, B:21:0x0103, B:23:0x0107), top: B:10:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x003c, B:12:0x00da, B:14:0x00de, B:15:0x00f5, B:17:0x00f9, B:21:0x0103, B:23:0x0107), top: B:10:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x003c, B:12:0x00da, B:14:0x00de, B:15:0x00f5, B:17:0x00f9, B:21:0x0103, B:23:0x0107), top: B:10:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, Continuation<? super Unit> continuation) {
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$1;
        int i;
        Throwable th;
        String str2;
        LegacyLoadUseCase legacyLoadUseCase;
        LoadResult.Failure failure;
        if (continuation instanceof LegacyLoadUseCase$invoke$1) {
            legacyLoadUseCase$invoke$1 = (LegacyLoadUseCase$invoke$1) continuation;
            if ((legacyLoadUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                legacyLoadUseCase$invoke$1.label -= Integer.MIN_VALUE;
                LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$12 = legacyLoadUseCase$invoke$1;
                Object obj = legacyLoadUseCase$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = legacyLoadUseCase$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String opportunityId = getOpportunityId(unityAdsLoadOptions);
                    if (opportunityId == null) {
                        opportunityId = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(opportunityId, "randomUUID().toString()");
                    }
                    this.logger.info("Load invoked for placement: " + str + " with instance id: " + opportunityId);
                    long loadTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
                    AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize);
                    this.loadOptions = unityAdsLoadOptions;
                    String adMarkup = getAdMarkup(unityAdsLoadOptions);
                    this.adMarkup = adMarkup;
                    String str3 = adMarkup;
                    this.isHeaderBidding = !(str3 == null || StringsKt.isBlank(str3));
                    this.isBanner = unityBannerSize != null;
                    this.listener = internalLoadListener;
                    this.placement = str;
                    this.startTime = loadStart(opportunityId);
                    try {
                        LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(opportunityId, this, context, str, bannerSize, unityAdsLoadOptions, null);
                        legacyLoadUseCase$invoke$12.L$0 = this;
                        legacyLoadUseCase$invoke$12.L$1 = opportunityId;
                        legacyLoadUseCase$invoke$12.label = 1;
                        Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, legacyLoadUseCase$invoke$12);
                        if (withTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = opportunityId;
                        legacyLoadUseCase = this;
                        obj = withTimeoutOrNull;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = opportunityId;
                        legacyLoadUseCase = this;
                        legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), false, 32, null));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) legacyLoadUseCase$invoke$12.L$1;
                    legacyLoadUseCase = (LegacyLoadUseCase) legacyLoadUseCase$invoke$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), false, 32, null));
                        return Unit.INSTANCE;
                    }
                }
                failure = (LoadResult) obj;
                if (failure == null) {
                    failure = new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT, null, "timeout", null, false, 52, null);
                }
                if (!(failure instanceof LoadResult.Success)) {
                    legacyLoadUseCase.loadSuccess(((LoadResult.Success) failure).getAdObject());
                } else if (failure instanceof LoadResult.Failure) {
                    legacyLoadUseCase.loadFailure(str2, (LoadResult.Failure) failure);
                }
                return Unit.INSTANCE;
            }
        }
        legacyLoadUseCase$invoke$1 = new LegacyLoadUseCase$invoke$1(this, continuation);
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$122 = legacyLoadUseCase$invoke$1;
        Object obj2 = legacyLoadUseCase$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = legacyLoadUseCase$invoke$122.label;
        if (i != 0) {
        }
        failure = (LoadResult) obj2;
        if (failure == null) {
        }
        if (!(failure instanceof LoadResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String adMarkup) {
        String str = adMarkup;
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(adMarkup, false, 1, null).toByteArray());
            } catch (Exception unused) {
                return null;
            }
        }
        return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("adMarkup")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final TimeMark loadStart(String opportunityId) {
        long m12642markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m12642markNowz9LOYto();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, opportunityId, false, 2, null), null, 42, null);
        return TimeSource.Monotonic.ValueTimeMark.m12643boximpl(m12642markNowz9LOYto);
    }

    private final void loadSuccess(final AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        adObject.getState().setValue(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        TimeMark timeMark = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", timeMark != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$1
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
                InternalLoadListener internalLoadListener;
                internalLoadListener = LegacyLoadUseCase.this.listener;
                if (internalLoadListener != null) {
                    internalLoadListener.onAdLoaded(adObject);
                }
            }
        });
    }

    private final void loadFailure(String opportunityId, final LoadResult.Failure loadResult) {
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(opportunityId) + ", error: " + loadResult.getError() + " :: " + loadResult.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        TimeMark timeMark = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", timeMark != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags(loadResult.getReason(), loadResult.getReasonDebug()), null, getTmpAdObject(opportunityId, loadResult.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$1
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
                InternalLoadListener internalLoadListener;
                internalLoadListener = LegacyLoadUseCase.this.listener;
                if (internalLoadListener != null) {
                    int number = loadResult.getError().getNumber();
                    String message = loadResult.getMessage();
                    if (message == null) {
                        message = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
                    }
                    internalLoadListener.onAdLoadFail(new UnityAdsError(number, message));
                }
            }
        });
    }

    static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final Map<String, String> getTags(String reason, String reasonDebug) {
        Pair[] pairArr = new Pair[3];
        UnityAdsLoadOptions unityAdsLoadOptions = null;
        pairArr[0] = TuplesKt.to("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        pairArr[1] = TuplesKt.to("operation", OperationType.LOAD.toString());
        UnityAdsLoadOptions unityAdsLoadOptions2 = this.loadOptions;
        if (unityAdsLoadOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        } else {
            unityAdsLoadOptions = unityAdsLoadOptions2;
        }
        pairArr[2] = TuplesKt.to("new_api", String.valueOf(unityAdsLoadOptions.loadConfiguration != null));
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        String str = reason;
        if (str != null && str.length() != 0) {
            mutableMapOf.put("reason", reason);
        }
        String str2 = reasonDebug;
        if (str2 != null && str2.length() != 0) {
            mutableMapOf.put("reason_debug", reasonDebug);
        }
        return mutableMapOf;
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z);
    }

    private final AdObject getTmpAdObject(String opportunityId, boolean isScarAd) {
        UUID fromString = UUID.fromString(opportunityId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ByteString EMPTY = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions = null;
        }
        UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        boolean z = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(byteString, str2, EMPTY, isScarAd, null, null, null, false, null, null, null, unityAdsLoadOptions2, z, adType, null, null, null, null, null, 509424, null);
    }

    private final String getAdInfoString(String opportunityId) {
        return "for placement " + this.placement + " with instance id " + opportunityId;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize bannerSize) {
        if (bannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.INSTANCE;
        AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        BannerSizeKt.Dsl _create = companion._create(newBuilder);
        _create.setWidth(bannerSize.getWidth());
        _create.setHeight(bannerSize.getHeight());
        return _create._build();
    }
}
