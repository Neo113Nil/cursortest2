package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.au3;
import defpackage.rq3;
import defpackage.xw3;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010$J7\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101JB\u00109\u001a\u0002082\u0006\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010.\u001a\u00020-H\u0096B¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010D¨\u0006E"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidLoad;", "Lcom/unity3d/ads/core/domain/Load;", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getAdRequest", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getAdPlayerConfigRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "handleGatewayAdResponse", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/GetAdRequest;Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;)V", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "e", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "handleGatewayException", "(Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;)Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "failure", "", "isCachePhaseFailure", "(Lcom/unity3d/ads/core/data/model/LoadResult$Failure;)Z", U3.w, "", "incrementLoadRequestCount", "(Z)V", "incrementLoadRequestAdmCount", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "placement", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/data/model/AdObject;", "getTmpAdObject", "(Lcom/google/protobuf/ByteString;Ljava/lang/String;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lcom/unity3d/ads/UnityAdsLoadOptions;)Lcom/unity3d/ads/core/data/model/AdObject;", "Landroid/content/Context;", "context", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "Lcom/unity3d/ads/core/data/model/LoadResult;", "invoke", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lrq3;)Ljava/lang/Object;", "Lau3;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLoad implements Load {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;

    @NotNull
    private final GetAdRequest getAdRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final HandleGatewayAdResponse handleGatewayAdResponse;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final ValidateExtrasSize validateExtrasSize;

    public AndroidLoad(@NotNull au3 au3Var, @NotNull GetAdRequest getAdRequest, @NotNull GetAdPlayerConfigRequest getAdPlayerConfigRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull HandleGatewayAdResponse handleGatewayAdResponse, @NotNull SessionRepository sessionRepository, @NotNull GatewayClient gatewayClient, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull ValidateExtrasSize validateExtrasSize) {
        au3Var.getClass();
        getAdRequest.getClass();
        getAdPlayerConfigRequest.getClass();
        getRequestPolicy.getClass();
        handleGatewayAdResponse.getClass();
        sessionRepository.getClass();
        gatewayClient.getClass();
        adRepository.getClass();
        sendDiagnosticEvent.getClass();
        validateExtrasSize.getClass();
        this.defaultDispatcher = au3Var;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString opportunityId, String placement, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, UnityAdsLoadOptions loadOptions) {
        return SendDiagnosticEvent.INSTANCE.getTmpAdObjectForEventSending(opportunityId, placement, isHeaderBidding, loadOptions, adType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException e) {
        ErrorOuterClass.PublicErrorCode publicErrorCode;
        String loadErrorMsg;
        boolean z = e instanceof NetworkTimeoutException;
        if (z) {
            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
        } else if (e instanceof GatewayException) {
            publicErrorCode = ((GatewayException) e).getErrorCode();
            if (publicErrorCode == null) {
                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
            }
        } else {
            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        if (z) {
            loadErrorMsg = UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT;
        } else if (e instanceof GatewayException) {
            ErrorOuterClass.PublicErrorCode errorCode = ((GatewayException) e).getErrorCode();
            if (errorCode == null || (loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(errorCode)) == null) {
                loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
            }
        } else {
            loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
        }
        return new LoadResult.Failure(publicErrorCode2, loadErrorMsg, e, z ? "timeout" : "gateway", e.getMessage(), e instanceof GatewayException ? ((GatewayException) e).getErrorToken() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean isBanner) {
        SessionRepository sessionRepository = this.sessionRepository;
        if (isBanner) {
            sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean isBanner) {
        SessionRepository sessionRepository = this.sessionRepository;
        if (isBanner) {
            sessionRepository.incrementBannerLoadRequestCount();
        } else {
            sessionRepository.incrementLoadRequestCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCachePhaseFailure(LoadResult.Failure failure) {
        String reason = failure.getReason();
        int hashCode = reason.hashCode();
        return hashCode != -1131560769 ? hashCode != -952823001 ? hashCode == -711698443 && reason.equals("adviewer") : reason.equals("invalid_url") : reason.equals("no_webview_entry_point");
    }

    @Override // com.unity3d.ads.core.domain.Load
    @Nullable
    public Object invoke(@NotNull Context context, @NotNull String str, @NotNull ByteString byteString, @NotNull HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, @Nullable AdRequestOuterClass.BannerSize bannerSize, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull rq3<? super LoadResult> rq3Var) {
        return xw3.R(this.defaultDispatcher, new AndroidLoad$invoke$2(bannerSize, this, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), rq3Var);
    }
}
