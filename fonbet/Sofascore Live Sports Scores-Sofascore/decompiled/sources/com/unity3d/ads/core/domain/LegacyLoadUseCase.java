package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.U3;
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
import defpackage.a70;
import defpackage.fc6;
import defpackage.fdi;
import defpackage.ixa;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.rq3;
import defpackage.tub;
import defpackage.wba;
import defpackage.whj;
import defpackage.wt3;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J3\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b<\u0010=J@\u0010D\u001a\u00020+2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u00162\u0006\u0010A\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086B¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010JR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010KR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010LR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010MR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010@\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0016\u0010A\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010[¨\u0006]"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "", "Lcom/unity3d/ads/core/domain/Load;", "load", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "awaitInitialization", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "cleanUpWhenOpportunityExpires", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/Load;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;Lcom/unity3d/ads/core/log/Logger;)V", "", "adMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "getHeaderBiddingAdMarkup", "(Ljava/lang/String;)Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSize", "(Lcom/unity3d/services/banners/UnityBannerSize;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "unityAdsLoadOptions", "getOpportunityId", "(Lcom/unity3d/ads/UnityAdsLoadOptions;)Ljava/lang/String;", "getAdMarkup", "opportunityId", "Lkotlin/time/TimeMark;", "loadStart", "(Ljava/lang/String;)Lkotlin/time/TimeMark;", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "loadSuccess", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "loadResult", "loadFailure", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/LoadResult$Failure;)V", "reason", "reasonDebug", "", "getTags", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getTmpAdObject", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdObject;", "getAdInfoString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "placement", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "unityLoadListener", "invoke", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/Load;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "Lcom/unity3d/ads/core/log/Logger;", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Z", U3.w, "listener", "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "startTime", "Lkotlin/time/TimeMark;", "Ljava/lang/String;", "Lcom/google/protobuf/ByteString;", "opportunity", "Lcom/google/protobuf/ByteString;", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyLoadUseCase {

    @NotNull
    public static final String KEY_AD_MARKUP = "adMarkup";

    @NotNull
    public static final String KEY_OBJECT_ID = "objectId";

    @Nullable
    private String adMarkup;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final AwaitInitialization awaitInitialization;

    @NotNull
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;

    @NotNull
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;

    @Nullable
    private InternalLoadListener listener;

    @NotNull
    private final Load load;
    private UnityAdsLoadOptions loadOptions;

    @NotNull
    private final Logger logger;

    @Nullable
    private ByteString opportunity;

    @Nullable
    private String placement;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @Nullable
    private TimeMark startTime;

    public LegacyLoadUseCase(@NotNull Load load, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetInitializationState getInitializationState, @NotNull AwaitInitialization awaitInitialization, @NotNull SessionRepository sessionRepository, @NotNull AdRepository adRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, @NotNull Logger logger) {
        load.getClass();
        sendDiagnosticEvent.getClass();
        getInitializationState.getClass();
        awaitInitialization.getClass();
        sessionRepository.getClass();
        adRepository.getClass();
        safeCallbackInvoke.getClass();
        cleanUpWhenOpportunityExpires.getClass();
        logger.getClass();
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

    private final String getAdInfoString(String opportunityId) {
        return wt3.m(this.placement, " with instance id ", new StringBuilder("for placement "), opportunityId);
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

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize bannerSize) {
        if (bannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.INSTANCE;
        AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        newBuilder.getClass();
        BannerSizeKt.Dsl _create = companion._create(newBuilder);
        _create.setWidth(bannerSize.getWidth());
        _create.setHeight(bannerSize.getHeight());
        return _create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String adMarkup) {
        if (adMarkup == null || StringsKt.R(adMarkup)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(adMarkup, false, 1, null).toByteArray());
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

    private final Map<String, String> getTags(String reason, String reasonDebug) {
        Pair pair = new Pair("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        Pair pair2 = new Pair("operation", OperationType.LOAD.toString());
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            Intrinsics.i(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            throw null;
        }
        LinkedHashMap i = tub.i(pair, pair2, new Pair("new_api", String.valueOf(unityAdsLoadOptions.loadConfiguration != null)));
        if (reason != null && reason.length() != 0) {
            i.put("reason", reason);
        }
        if (reasonDebug != null && reasonDebug.length() != 0) {
            i.put("reason_debug", reasonDebug);
        }
        return i;
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

    private final AdObject getTmpAdObject(String opportunityId) {
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID fromString = UUID.fromString(opportunityId);
        fromString.getClass();
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        String str = this.placement;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions != null) {
            return companion.getTmpAdObjectForEventSending(byteString, str, this.isHeaderBidding, unityAdsLoadOptions, getAdType());
        }
        Intrinsics.i(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        throw null;
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, rq3 rq3Var, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, rq3Var);
    }

    private final void loadFailure(String opportunityId, LoadResult.Failure loadResult) {
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(opportunityId) + ", error: " + loadResult.getError() + " :: " + loadResult.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME;
        TimeMark timeMark = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, timeMark != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags(loadResult.getReason(), loadResult.getReasonDebug()), (Map) null, getTmpAdObject(opportunityId), (Integer) null, loadResult.getErrorToken(), 40, (Object) null);
        this.safeCallbackInvoke.invoke(new ixa(6, this, loadResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadFailure$lambda$3(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            int number = failure.getError().getNumber();
            String message = failure.getMessage();
            if (message == null) {
                message = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
            }
            internalLoadListener.onAdLoadFail(new UnityAdsError(number, message));
        }
        return Unit.a;
    }

    private final TimeMark loadStart(String opportunityId) {
        xhj.a.getClass();
        xuc.a.getClass();
        long b = xuc.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED, (Double) null, getTags$default(this, null, null, 3, null), (Map) null, getTmpAdObject(opportunityId), (Integer) null, (ByteString) null, 106, (Object) null);
        return new whj(b);
    }

    private final void loadSuccess(AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        ((fdi) adObject.getState()).l(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME;
        TimeMark timeMark = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, timeMark != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags$default(this, null, null, 3, null), (Map) null, adObject, (Integer) null, (ByteString) null, 104, (Object) null);
        this.safeCallbackInvoke.invoke(new ixa(5, this, adObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSuccess$lambda$2(LegacyLoadUseCase legacyLoadUseCase, AdObject adObject) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            internalLoadListener.onAdLoaded(adObject);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x00be, B:15:0x00c2, B:16:0x00d8, B:18:0x00dc, B:22:0x00e6, B:24:0x00ea, B:25:0x00f0, B:26:0x00f5), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x00be, B:15:0x00c2, B:16:0x00d8, B:18:0x00dc, B:22:0x00e6, B:24:0x00ea, B:25:0x00f0, B:26:0x00f5), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x00be, B:15:0x00c2, B:16:0x00d8, B:18:0x00dc, B:22:0x00e6, B:24:0x00ea, B:25:0x00f0, B:26:0x00f5), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull Context context, @Nullable String str, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @Nullable InternalLoadListener internalLoadListener, @Nullable UnityBannerSize unityBannerSize, @NotNull rq3<? super Unit> rq3Var) {
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$1;
        int i;
        String str2;
        LoadResult loadResult;
        if (rq3Var instanceof LegacyLoadUseCase$invoke$1) {
            legacyLoadUseCase$invoke$1 = (LegacyLoadUseCase$invoke$1) rq3Var;
            int i2 = legacyLoadUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyLoadUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$12 = legacyLoadUseCase$invoke$1;
                Object obj = legacyLoadUseCase$invoke$12.result;
                lu3 lu3Var = lu3.a;
                i = legacyLoadUseCase$invoke$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    String opportunityId = getOpportunityId(unityAdsLoadOptions);
                    if (opportunityId == null) {
                        opportunityId = fc6.C();
                    }
                    this.logger.info("Load invoked for placement: " + str + " with instance id: " + opportunityId);
                    long loadTimeoutMs = (long) this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
                    AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize);
                    this.loadOptions = unityAdsLoadOptions;
                    String adMarkup = getAdMarkup(unityAdsLoadOptions);
                    this.adMarkup = adMarkup;
                    this.isHeaderBidding = !(adMarkup == null || StringsKt.R(adMarkup));
                    this.isBanner = unityBannerSize != null;
                    this.listener = internalLoadListener;
                    this.placement = str;
                    this.startTime = loadStart(opportunityId);
                    try {
                        LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(opportunityId, this, context, str, bannerSize, unityAdsLoadOptions, null);
                        legacyLoadUseCase$invoke$12.L$0 = opportunityId;
                        legacyLoadUseCase$invoke$12.label = 1;
                        Object V = wba.V(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, legacyLoadUseCase$invoke$12);
                        if (V == lu3Var) {
                            return lu3Var;
                        }
                        str2 = opportunityId;
                        obj = V;
                    } catch (Throwable th) {
                        th = th;
                        str2 = opportunityId;
                        loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), null, 32, null));
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) legacyLoadUseCase$invoke$12.L$0;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), null, 32, null));
                        return Unit.a;
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
                        throw new ndd();
                    }
                    loadFailure(str2, (LoadResult.Failure) loadResult);
                }
                return Unit.a;
            }
        }
        legacyLoadUseCase$invoke$1 = new LegacyLoadUseCase$invoke$1(this, rq3Var);
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$122 = legacyLoadUseCase$invoke$1;
        Object obj2 = legacyLoadUseCase$invoke$122.result;
        lu3 lu3Var2 = lu3.a;
        i = legacyLoadUseCase$invoke$122.label;
        if (i != 0) {
        }
        loadResult = (LoadResult) obj2;
        if (loadResult == null) {
        }
        if (!(loadResult instanceof LoadResult.Success)) {
        }
        return Unit.a;
    }
}
