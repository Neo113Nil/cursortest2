package com.unity3d.ads.adplayer;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AndroidWebViewClient.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "_isRenderProcessGone", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_onLoadFinished", "Lkotlinx/coroutines/CompletableDeferred;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "isRenderProcessGone", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loadErrors", "onLoadFinished", "Lkotlinx/coroutines/Deferred;", "getOnLoadFinished", "()Lkotlinx/coroutines/Deferred;", "webviewType", "", "onPageFinished", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    private final MutableStateFlow<Boolean> _isRenderProcessGone;
    private final CompletableDeferred<List<WebViewClientError>> _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final StateFlow<Boolean> isRenderProcessGone;
    private final MutableStateFlow<List<WebViewClientError>> loadErrors;
    private final Deferred<List<WebViewClientError>> onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final MutableStateFlow<String> webviewType;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("com.unity3d.ads", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted("com.unity3d.ads", view, url);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.unity3d.ads", view, request, safedk_AndroidWebViewClient_shouldInterceptRequest_1bf4791435f30a5bff2fd7f264c747a0(view, request));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.unity3d.ads", view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        CompletableDeferred<List<WebViewClientError>> CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this._onLoadFinished = CompletableDeferred$default;
        this.onLoadFinished = CompletableDeferred$default;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isRenderProcessGone = MutableStateFlow;
        this.isRenderProcessGone = FlowKt.asStateFlow(MutableStateFlow);
        this.webviewType = StateFlowKt.MutableStateFlow("");
    }

    public final Deferred<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final StateFlow<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual(url, BLANK_PAGE)) {
            MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
            while (true) {
                List<WebViewClientError> value = mutableStateFlow.getValue();
                str = url;
                if (mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        this._onLoadFinished.complete(this.loadErrors.getValue());
    }

    public WebResourceResponse safedk_AndroidWebViewClient_shouldInterceptRequest_1bf4791435f30a5bff2fd7f264c747a0(WebView view, WebResourceRequest request) {
        Map emptyMap;
        Object m11180constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                AndroidWebViewClient androidWebViewClient = this;
                m11180constructorimpl = Result.m11180constructorimpl(url.getQueryParameter("webviewType"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = null;
            }
            String str = (String) m11180constructorimpl;
            String str2 = str;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                this.webviewType.setValue(str);
            }
            if (Intrinsics.areEqual(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url2, "request.url");
            return getCachedAsset.invoke(url2, this.webviewType.getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || (emptyMap = MapsKt.mapOf(TuplesKt.to("reason", message))) == null) {
                emptyMap = MapsKt.emptyMap();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, emptyMap, null, null, null, 58, null);
            return super.shouldInterceptRequest(view, request);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        List<WebViewClientError> value;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (!this._onLoadFinished.isCompleted()) {
            MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            this._onLoadFinished.complete(this.loadErrors.getValue());
        } else {
            this._isRenderProcessGone.setValue(true);
        }
        return true;
    }
}
