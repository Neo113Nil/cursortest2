package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class w extends WebViewClientCompat {
    public static final a g = new a(null);
    public static final int h = 8;
    public static final String i = "MraidWebViewClient";
    public static final String j = "com.moloco.sdk.xenoss.sdkdevkit.mraid.js";
    public static final String k = "mraid.js";
    public final o a;
    public final WebViewAssetLoader b;
    public final MutableStateFlow<Boolean> c;
    public final StateFlow<Boolean> d;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> e;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        public final Uri a(WebResourceRequest webResourceRequest) {
            String str;
            Uri url = webResourceRequest.getUrl();
            if (url == null || (str = url.toString()) == null) {
                str = "";
            }
            Uri parse = Uri.parse(StringsKt.replace(str, w.k, w.j, true));
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }
    }

    public w(Context context, o mraidJsCommandsSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidJsCommandsSource, "mraidJsCommandsSource");
        this.a = mraidJsCommandsSource;
        WebViewAssetLoader build = new WebViewAssetLoader.Builder().addPathHandler("/", new WebViewAssetLoader.AssetsPathHandler(context.getApplicationContext())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.b = build;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.c = MutableStateFlow;
        this.d = MutableStateFlow;
        MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.e = MutableStateFlow2;
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.f;
    }

    public final StateFlow<Boolean> b() {
        return this.d;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.D, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.c.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.D, webView, str);
        safedk_w_onPageStarted_74ce31cbcc030418f9bf1821b6bf461a(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Android API 23")
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.D, webView, i2, str, str2);
        safedk_w_onReceivedError_051980537a512140f318a12c24ebe8b5(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.e.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.b);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    public void safedk_w_onPageStarted_74ce31cbcc030418f9bf1821b6bf461a(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        this.c.setValue(Boolean.FALSE);
    }

    @Deprecated(message = "Deprecated in Android API 23")
    public void safedk_w_onReceivedError_051980537a512140f318a12c24ebe8b5(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        this.e.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.a);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "onReceivedError " + p2, null, false, 12, null);
    }

    public WebResourceResponse safedk_w_shouldInterceptRequest_126c77200afd135907aed0e5966dc9de(WebView p0, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.b.shouldInterceptRequest(g.a(request));
    }

    @Deprecated(message = "Deprecated in Android API 24")
    public boolean safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241(WebView p0, String p1) {
        if (p1 == null) {
            return false;
        }
        return this.a.a(p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.D, webView, webResourceRequest, safedk_w_shouldInterceptRequest_126c77200afd135907aed0e5966dc9de(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Android API 24")
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241 = safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.D, webView, str, safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241);
        return safedk_w_shouldOverrideUrlLoading_bdd489450093ec7e983c22492b153241;
    }
}
