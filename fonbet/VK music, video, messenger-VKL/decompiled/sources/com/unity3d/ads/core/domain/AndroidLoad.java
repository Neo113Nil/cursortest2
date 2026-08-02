package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
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
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import xsna.myc0;
import xsna.ovj;
import xsna.spj;

/* compiled from: AndroidLoad.kt */
/* loaded from: classes14.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final ovj defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final ValidateExtrasSize validateExtrasSize;

    public AndroidLoad(ovj ovjVar, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize) {
        this.defaultDispatcher = ovjVar;
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
    public final AdObject getTmpAdObject(ByteString byteString, String str, boolean z, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending(byteString, str, z, unityAdsLoadOptions, diagnosticAdType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        ErrorOuterClass.PublicErrorCode publicErrorCode;
        String loadErrorMsg;
        boolean z = unityAdsNetworkException instanceof NetworkTimeoutException;
        if (z) {
            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
        } else if (unityAdsNetworkException instanceof GatewayException) {
            publicErrorCode = ((GatewayException) unityAdsNetworkException).getErrorCode();
            if (publicErrorCode == null) {
                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
            }
        } else {
            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        if (z) {
            loadErrorMsg = UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT;
        } else if (unityAdsNetworkException instanceof GatewayException) {
            ErrorOuterClass.PublicErrorCode errorCode = ((GatewayException) unityAdsNetworkException).getErrorCode();
            if (errorCode == null || (loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(errorCode)) == null) {
                loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
            }
        } else {
            loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
        }
        return new LoadResult.Failure(publicErrorCode2, loadErrorMsg, unityAdsNetworkException, z ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), unityAdsNetworkException instanceof GatewayException ? ((GatewayException) unityAdsNetworkException).getErrorToken() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z) {
        if (z) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z) {
        if (z) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCachePhaseFailure(LoadResult.Failure failure) {
        String reason = failure.getReason();
        int hashCode = reason.hashCode();
        return hashCode != -1131560769 ? hashCode != -952823001 ? hashCode == -711698443 && reason.equals("adviewer") : reason.equals("invalid_url") : reason.equals("no_webview_entry_point");
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, spj<? super LoadResult> spjVar) {
        return myc0.k(this.defaultDispatcher, new AndroidLoad$invoke$2(bannerSize, this, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), spjVar);
    }
}
