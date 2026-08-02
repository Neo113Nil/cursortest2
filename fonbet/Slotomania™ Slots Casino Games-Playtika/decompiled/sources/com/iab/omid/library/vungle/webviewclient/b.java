package com.iab.omid.library.vungle.webviewclient;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes8.dex */
public class b extends WebViewClient {
    private final WebViewClient a;

    public b(WebViewClient webViewClient) {
        this.a = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.a.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded("com.iab.omid.library", webView, str);
        safedk_b_onLoadResource_7a2a01130b701b8bd5d3af0a9815c8d0(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        this.a.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted("com.iab.omid.library", webView, str);
        safedk_b_onPageStarted_e376dfa4ee10710f709b168d023eb19e(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", webView, i, str, str2);
        safedk_b_onReceivedError_9b9c4d2d5110c6d688a96b359ad7f4b1(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError("com.iab.omid.library", webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_59ced227ab167d1800dfe42125aba8d3(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        this.a.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.a.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_b_onLoadResource_7a2a01130b701b8bd5d3af0a9815c8d0(WebView p0, String p1) {
        this.a.onLoadResource(p0, p1);
    }

    public void safedk_b_onPageStarted_e376dfa4ee10710f709b168d023eb19e(WebView p0, String p1, Bitmap p2) {
        this.a.onPageStarted(p0, p1, p2);
    }

    public void safedk_b_onReceivedError_59ced227ab167d1800dfe42125aba8d3(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        this.a.onReceivedError(p0, p1, p2);
    }

    public void safedk_b_onReceivedError_9b9c4d2d5110c6d688a96b359ad7f4b1(WebView p0, int p1, String p2, String p3) {
        this.a.onReceivedError(p0, p1, p2, p3);
    }

    public WebResourceResponse safedk_b_shouldInterceptRequest_1c7b0918d7ed52d4364869a16469828a(WebView p0, String p1) {
        return this.a.shouldInterceptRequest(p0, p1);
    }

    public WebResourceResponse safedk_b_shouldInterceptRequest_66a90770d40300403441470174d2d1a4(WebView p0, WebResourceRequest p1) {
        return this.a.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_b_shouldOverrideUrlLoading_d086b1e5a52b58772a3cef8e14f9e1da(WebView p0, WebResourceRequest p1) {
        if (a.a(p1.getUrl().toString())) {
            return true;
        }
        return this.a.shouldOverrideUrlLoading(p0, p1);
    }

    public boolean safedk_b_shouldOverrideUrlLoading_e0b393905702aaf29214957d5387d776(WebView p0, String p1) {
        if (a.a(p1)) {
            return true;
        }
        return this.a.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", webView, webResourceRequest, safedk_b_shouldInterceptRequest_66a90770d40300403441470174d2d1a4(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse("com.iab.omid.library", webView, str, safedk_b_shouldInterceptRequest_1c7b0918d7ed52d4364869a16469828a(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_d086b1e5a52b58772a3cef8e14f9e1da = safedk_b_shouldOverrideUrlLoading_d086b1e5a52b58772a3cef8e14f9e1da(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, webResourceRequest, safedk_b_shouldOverrideUrlLoading_d086b1e5a52b58772a3cef8e14f9e1da);
        return safedk_b_shouldOverrideUrlLoading_d086b1e5a52b58772a3cef8e14f9e1da;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("OpenMeasurement|SafeDK: Execution> Lcom/iab/omid/library/vungle/webviewclient/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_e0b393905702aaf29214957d5387d776 = safedk_b_shouldOverrideUrlLoading_e0b393905702aaf29214957d5387d776(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.iab.omid.library", webView, str, safedk_b_shouldOverrideUrlLoading_e0b393905702aaf29214957d5387d776);
        return safedk_b_shouldOverrideUrlLoading_e0b393905702aaf29214957d5387d776;
    }
}
