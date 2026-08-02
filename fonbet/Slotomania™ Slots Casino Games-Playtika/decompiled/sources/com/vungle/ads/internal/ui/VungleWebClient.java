package com.vungle.ads.internal.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.common.net.HttpHeaders;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.BlackScreenDetector;
import com.vungle.ads.internal.util.OnSilentModeChangeListener;
import com.vungle.ads.internal.util.ThreadUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: VungleWebClient.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0097\u0001\u0098\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bJ \u0010c\u001a\u00020`2\u0006\u0010d\u001a\u00020'2\u0006\u0010e\u001a\u00020'2\u0006\u0010f\u001a\u00020\u0018H\u0002J\u0010\u0010g\u001a\u00020\u00182\u0006\u0010e\u001a\u00020'H\u0002J\u0018\u0010h\u001a\u00020`2\u0006\u0010i\u001a\u00020b2\b\b\u0002\u0010j\u001a\u00020'J\u0016\u0010k\u001a\u00020`2\u0006\u0010l\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\u000fJ\u0006\u0010n\u001a\u00020`J\u0010\u0010o\u001a\u00020`2\u0006\u0010p\u001a\u00020\u0018H\u0016J\u0010\u0010q\u001a\u00020`2\u0006\u0010r\u001a\u00020\u0018H\u0016J\u001c\u0010s\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010e\u001a\u0004\u0018\u00010'H\u0016J&\u0010u\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J*\u0010u\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\u0006\u0010z\u001a\u00020b2\u0006\u0010{\u001a\u00020'2\u0006\u0010|\u001a\u00020'H\u0017J&\u0010}\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u001f\u0010\u0080\u0001\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010B2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0016J2\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0084\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010'2\u0007\u0010\u0086\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b\u0087\u0001J\u001d\u0010\u0088\u0001\u001a\u00020`2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010B2\u0007\u0010\u008a\u0001\u001a\u00020'H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020`2\u0006\u00109\u001a\u00020\u0018H\u0016J>\u0010\u008c\u0001\u001a\u00020`2\u0007\u0010\u008d\u0001\u001a\u00020\u00182\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010'H\u0016J\u0011\u0010\u0092\u0001\u001a\u00020`2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010\u0093\u0001\u001a\u00020`2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0013\u0010\u0094\u0001\u001a\u00020`2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u001f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u001d\u0010\u0096\u0001\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010e\u001a\u0004\u0018\u00010'H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R&\u00101\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R&\u00105\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R(\u00109\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010?\u0012\u0004\b:\u0010\u001a\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@R&\u0010A\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u0004\u0018\u00010I8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bJ\u0010\u001a\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010R\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bS\u0010\u001a\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\u001eR\u000e\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010X\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bZ\u0010\u001a\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006\u0099\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "blackScreenDetector", "Lcom/vungle/ads/internal/util/BlackScreenDetector;", "getBlackScreenDetector", "()Lcom/vungle/ads/internal/util/BlackScreenDetector;", "blackScreenDetector$delegate", "Lkotlin/Lazy;", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", X3.i.o, "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "partialDownloadErrorMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", X3.i.s, "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleBlackScreenDetection", "", "samplingFactor", "", "handleWebViewError", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyBlackScreenResult", "percentage", "errorMessage", "notifyDiskAvailableSize", "availableDiskSize", "appFolderSize", "notifyPresentAppStoreFailed", "notifyPropertiesChange", "skipCmdQueue", "notifySilentModeChange", "silentModeEnabled", "onPageFinished", ViewHierarchyConstants.VIEW_KEY, "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", IronSourceConstants.EVENTS_ERROR_CODE, "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "parseRange", "Lkotlin/Pair;", "rangeHeader", "contentLength", "parseRange$vungle_ads_release", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", "message", "accept", "deny", "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldInterceptRequest", "shouldOverrideUrlLoading", k.M, "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class VungleWebClient extends WebViewClient implements WebViewAPI, OnSilentModeChangeListener {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;

    /* renamed from: blackScreenDetector$delegate, reason: from kotlin metadata */
    private final Lazy blackScreenDetector;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.d, view, url);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.d, view, errorCode, description, failingUrl);
        safedk_VungleWebClient_onReceivedError_b75d46f59d3c255bf15d937c49583423(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.d, view, request, error);
        safedk_VungleWebClient_onReceivedError_a84058a98d6f31e02ab86ec168a4c161(view, request, error);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.d, view, request, safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(view, request));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb = safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.d, view, url, safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb);
        return safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb;
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i & 8) != 0 ? null : platform, (i & 16) != 0 ? null : preloadDelegate, (i & 32) != 0 ? null : l);
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, Platform platform, PreloadDelegate preloadDelegate, Long l) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l;
        this.blackScreenDetector = LazyKt.lazy(new Function0<BlackScreenDetector>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$blackScreenDetector$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BlackScreenDetector invoke() {
                return new BlackScreenDetector();
            }
        });
        this.partialDownloadMetric = new OneShotSingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    private final BlackScreenDetector getBlackScreenDetector() {
        return (BlackScreenDetector) this.blackScreenDetector.getValue();
    }

    /* renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    /* renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    /* renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    /* renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    /* renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    /* renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    /* renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    /* renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    /* renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    /* renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    /* renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, String title, String message, String accept, String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public WebResourceResponse safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(WebView p0, WebResourceRequest p1) {
        long j;
        Uri url = p1 != null ? p1.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!Intrinsics.areEqual(lowerCase, "http") && !Intrinsics.areEqual(lowerCase, "https")) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$shouldInterceptRequest$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "shouldInterceptRequest called but partial download is disabled.";
                        }
                    });
                    return null;
                }
                String uri = url.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
                AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(uri);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                String str = localPath;
                if (str == null || str.length() == 0) {
                    return null;
                }
                File file = new File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length = file.length();
                final String str2 = p1.getRequestHeaders().get(HttpHeaders.RANGE);
                this.partialDownloadMetric.setMeta(str2 + " cached:" + length + ' ' + uri);
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                Pair<Long, Long> parseRange$vungle_ads_release = parseRange$vungle_ads_release(str2, contentLength);
                localPartialDownloadAssets.setRangeStart(parseRange$vungle_ads_release.getFirst().longValue());
                localPartialDownloadAssets.setRangeEnd(parseRange$vungle_ads_release.getSecond());
                long longValue = parseRange$vungle_ads_release.component1().longValue();
                Long component2 = parseRange$vungle_ads_release.component2();
                long j2 = length - longValue;
                com.vungle.ads.internal.util.Logger.INSTANCE.i(TAG, ">>request: " + url + " rangeStart=" + longValue + " rangeEnd=" + component2 + " cachedFileLength=" + length + " availableBytes=" + j2 + " contentLength=" + contentLength + ' ');
                if (j2 <= 0) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$shouldInterceptRequest$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Requested range exceeds cached file: " + str2;
                        }
                    });
                    localPartialDownloadAssets.waitForDownload();
                    j = file.length();
                } else {
                    j = length;
                }
                long longValue2 = component2 != null ? component2.longValue() : j - 1;
                long j3 = (longValue2 - longValue) + 1;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    VungleWebClient vungleWebClient = this;
                    WebResourceResponse webResourceResponse = new WebResourceResponse(localPartialDownloadAssets.getMimeType(), C.UTF8_NAME, 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", localPartialDownloadAssets.getMimeType()), TuplesKt.to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.to(HttpHeaders.CONTENT_LENGTH, String.valueOf(j3)), TuplesKt.to(HttpHeaders.CONTENT_RANGE, "bytes " + longValue + '-' + longValue2 + FileSystemKt.UnixPathSeparator + contentLength)), new BufferedInputStream(new FileInputStream(file), 1024));
                    com.vungle.ads.internal.util.Logger.INSTANCE.i(TAG, "<<Return:" + webResourceResponse.getResponseHeaders());
                    return webResourceResponse;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(Result.m11180constructorimpl(ResultKt.createFailure(th)));
                    if (m11183exceptionOrNullimpl != null) {
                        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error serving local range video: " + m11183exceptionOrNullimpl.getMessage(), m11183exceptionOrNullimpl);
                        this.partialDownloadErrorMetric.setMeta(uri + ' ' + m11183exceptionOrNullimpl.getMessage());
                        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public final Pair<Long, Long> parseRange$vungle_ads_release(String rangeHeader, long contentLength) {
        Object m11180constructorimpl;
        Pair pair;
        try {
            Result.Companion companion = Result.INSTANCE;
            VungleWebClient vungleWebClient = this;
            if (rangeHeader != null && StringsKt.startsWith$default(rangeHeader, "bytes=", false, 2, (Object) null)) {
                List split$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(rangeHeader, (CharSequence) "bytes="), new String[]{"-"}, false, 0, 6, (Object) null);
                String str = (String) CollectionsKt.getOrNull(split$default, 0);
                Long longOrNull = str != null ? StringsKt.toLongOrNull(str) : null;
                String str2 = (String) CollectionsKt.getOrNull(split$default, 1);
                Long longOrNull2 = str2 != null ? StringsKt.toLongOrNull(str2) : null;
                if (longOrNull == null) {
                    if (longOrNull2 == null) {
                        longOrNull = 0L;
                    } else {
                        longOrNull = Long.valueOf(contentLength - longOrNull2.longValue());
                        longOrNull2 = null;
                    }
                }
                pair = new Pair(longOrNull, longOrNull2);
            } else {
                pair = new Pair(0L, null);
            }
            m11180constructorimpl = Result.m11180constructorimpl(pair);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11183exceptionOrNullimpl(m11180constructorimpl) != null) {
            m11180constructorimpl = new Pair(0L, null);
        }
        return (Pair) m11180constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[Catch: all -> 0x0168, TryCatch #0 {all -> 0x0168, blocks: (B:3:0x000c, B:5:0x0023, B:8:0x002b, B:10:0x003c, B:13:0x0044, B:15:0x0051, B:17:0x0058, B:24:0x00af, B:26:0x00b3, B:30:0x00bc, B:31:0x00c9, B:33:0x00cf, B:35:0x00e2, B:37:0x006c, B:40:0x0076, B:41:0x0082, B:44:0x008b, B:45:0x0096, B:47:0x009e, B:49:0x00a2, B:50:0x0105, B:52:0x00f3, B:54:0x00fc, B:57:0x0134, B:59:0x014a, B:62:0x0160), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    @Deprecated(message = "Deprecated in Java")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(final WebView p0, final String p1) {
        String str;
        final WebViewAPI.MraidDelegate mraidDelegate;
        try {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "MRAID Command " + p1);
            String str2 = p1;
            if (str2 != null && str2.length() != 0) {
                Uri parse = Uri.parse(p1);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                String scheme = parse.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    String scheme2 = parse.getScheme();
                    if (!Intrinsics.areEqual(scheme2, CreativeInfo.w)) {
                        str = "url: ";
                        if (!StringsKt.equals("http", scheme2, true)) {
                            if (StringsKt.equals("https", scheme2, true)) {
                            }
                        }
                        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Open URL" + p1);
                        WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                        if (mraidDelegate2 != null) {
                            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                            JsonElementBuildersKt.put(jsonObjectBuilder, "url", p1);
                            mraidDelegate2.processCommand("openNonMraid", jsonObjectBuilder.build());
                        }
                        return true;
                    }
                    str = "url: ";
                    final String host = parse.getHost();
                    if (host != null) {
                        int hashCode = host.hashCode();
                        if (hashCode == -1943542072) {
                            if (host.equals("propertiesChangeCompleted")) {
                                if (!this.ready) {
                                    this.ready = true;
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VungleWebClient.m10732shouldOverrideUrlLoading$lambda11$lambda5(VungleWebClient.this, p0);
                                        }
                                    });
                                }
                                return true;
                            }
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                            }
                        } else {
                            if (hashCode != 88409791) {
                                if (hashCode == 119543762 && host.equals("readyToPlay")) {
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VungleWebClient.m10733shouldOverrideUrlLoading$lambda11$lambda6(VungleWebClient.this, p0);
                                        }
                                    });
                                    return true;
                                }
                                mraidDelegate = this.mraidDelegate;
                                if (mraidDelegate == null) {
                                    runJavascriptOnWebView(p0, COMMAND_COMPLETE);
                                    return true;
                                }
                                if (mraidDelegate != null) {
                                    JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                                    for (String param : parse.getQueryParameterNames()) {
                                        Intrinsics.checkNotNullExpressionValue(param, "param");
                                        JsonElementBuildersKt.put(jsonObjectBuilder2, param, parse.getQueryParameter(param));
                                    }
                                    final JsonObject build = jsonObjectBuilder2.build();
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VungleWebClient.m10731shouldOverrideUrlLoading$lambda11$lambda10$lambda9(WebViewAPI.MraidDelegate.this, host, build, this, p0);
                                        }
                                    });
                                }
                                return true;
                            }
                            if (host.equals("failToLoad")) {
                                this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m10734shouldOverrideUrlLoading$lambda11$lambda7(VungleWebClient.this, p0);
                                    }
                                });
                                return true;
                            }
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                            }
                        }
                    }
                    this.skippedUrlMetric.setMeta(str + p1);
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$shouldOverrideUrlLoading$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "skipped url: " + p1;
                        }
                    });
                    return false;
                }
                return false;
            }
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Invalid URL ");
            return false;
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory("mraid:" + p1).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-5, reason: not valid java name */
    public static final void m10732shouldOverrideUrlLoading$lambda11$lambda5(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-6, reason: not valid java name */
    public static final void m10733shouldOverrideUrlLoading$lambda11$lambda6(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-7, reason: not valid java name */
    public static final void m10734shouldOverrideUrlLoading$lambda11$lambda7(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final void m10731shouldOverrideUrlLoading$lambda11$lambda10$lambda9(WebViewAPI.MraidDelegate it, String command, JsonObject args, VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$onPageFinished$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "onPageFinished.";
            }
        });
        if (view == null) {
            return;
        }
        this.loadedWebView = view;
        if (view != null) {
            view.setVisibility(0);
        }
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(view);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean skipCmdQueue) {
        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m10730notifyPropertiesChange$lambda19(skipCmdQueue, this);
            }
        });
    }

    public final void notifyDiskAvailableSize(long availableDiskSize, long appFolderSize) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + availableDiskSize + '-' + appFolderSize + ')');
        }
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(VungleWebClient vungleWebClient, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        vungleWebClient.notifyBlackScreenResult(i, str);
    }

    public final void notifyBlackScreenResult(int percentage, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + percentage + ')');
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Returning black screen result: " + percentage + '%');
        if (percentage >= 0) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, percentage, this.advertisement.getLogEntry(), null, 8, null);
        } else {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry());
        }
    }

    @Override // com.vungle.ads.internal.util.OnSilentModeChangeListener
    public void notifySilentModeChange(boolean silentModeEnabled) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(silentModeEnabled));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void handleBlackScreenDetection(int samplingFactor) {
        getBlackScreenDetector().start(this.loadedWebView, samplingFactor, new Function2<Integer, String, Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$handleBlackScreenDetection$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
                invoke(num.intValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                VungleWebClient.this.notifyBlackScreenResult(i, errorMessage);
            }
        });
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = Boolean.valueOf(isViewable);
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, X3.i.o, Boolean.valueOf(isViewable));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Deprecated(message = "Deprecated in Java")
    public void safedk_VungleWebClient_onReceivedError_b75d46f59d3c255bf15d937c49583423(WebView p0, int p1, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(p0, p1, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        String valueOf = String.valueOf(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
        String valueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z = request != null && request.isForMainFrame();
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Http Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
        handleWebViewError(valueOf, valueOf2, isCriticalAsset(valueOf2) && z);
    }

    public void safedk_VungleWebClient_onReceivedError_a84058a98d6f31e02ab86ec168a4c161(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        String valueOf = String.valueOf(p2 != null ? p2.getDescription() : null);
        String valueOf2 = String.valueOf(p1 != null ? p1.getUrl() : null);
        boolean z = p1 != null && p1.isForMainFrame();
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
        handleWebViewError(valueOf, valueOf2, isCriticalAsset(valueOf2) && z);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(final WebView view, final RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$onRenderProcessGone$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
                    WebView webView = view;
                    return sb.append(webView != null ? webView.getUrl() : null).toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, true);
            }
            return true;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$onRenderProcessGone$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
                WebView webView = view;
                StringBuilder append = sb.append(webView != null ? webView.getUrl() : null).append(", did crash: ");
                RenderProcessGoneDetail renderProcessGoneDetail = detail;
                return append.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null).toString();
            }
        });
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    private final void handleWebViewError(String errorMsg, String url, boolean didCrash) {
        String str = url + ' ' + errorMsg;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    private final void runJavascriptOnWebView(final WebView webView, final String injectJs) {
        try {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$runJavascriptOnWebView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "mraid Injecting JS " + injectJs;
                }
            });
            ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$runJavascriptOnWebView$2
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
                    WebView webView2 = webView;
                    if (webView2 != null) {
                        LiftoffMonetizeNetworkBridge.webViewEvaluateJavaScript(webView2, injectJs, null);
                    }
                }
            });
        } catch (Throwable th) {
            new EvaluateJsError("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* compiled from: VungleWebClient.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
        }

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(final WebView webView, final WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            com.vungle.ads.internal.util.Logger.INSTANCE.w(VungleWebClient.TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "onRenderProcessUnresponsive(Title = " + webView.getTitle() + ", URL = " + webView.getOriginalUrl() + ", (webViewRenderProcess != null) = " + (webViewRenderProcess != null);
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyPropertiesChange$lambda-19, reason: not valid java name */
    public static final void m10730notifyPropertiesChange$lambda19(boolean z, VungleWebClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, X3.i.o, Boolean.valueOf(bool.booleanValue()));
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "os", "android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l = this$0.loadDuration;
        if (l != null) {
            l.longValue();
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (Boolean) true);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.gdprTitle);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.gdprBody);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.gdprAccept);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (Boolean) false);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + z + ')';
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, str);
        }
    }
}
