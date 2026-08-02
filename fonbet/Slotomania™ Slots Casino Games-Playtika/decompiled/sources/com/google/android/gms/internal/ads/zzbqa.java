package com.google.android.gms.internal.ads;

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
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbqa extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.doUpdateVisitedHistory(webView, str, z);
    }

    protected abstract WebViewClient getDelegate();

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzbqa_onLoadResource_f8f48351bb815ee89e474904a1d24e09(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.h, webView, str);
        safedk_zzbqa_onPageStarted_4574746fa36e545988c4b95de96c2ad1(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zzbqa_onReceivedError_cbcfcac7ee9d3e8851b0ce2fdc1a35bb(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, webResourceRequest, webResourceError);
        safedk_zzbqa_onReceivedError_52c1166640a4c8ad14015ec3e1040098(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_zzbqa_onLoadResource_f8f48351bb815ee89e474904a1d24e09(WebView p0, String p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onLoadResource(p0, p1);
    }

    public void safedk_zzbqa_onPageStarted_4574746fa36e545988c4b95de96c2ad1(WebView p0, String p1, Bitmap p2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageStarted(p0, p1, p2);
    }

    public void safedk_zzbqa_onReceivedError_cbcfcac7ee9d3e8851b0ce2fdc1a35bb(WebView p0, int p1, String p2, String p3) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(p0, p1, p2, p3);
    }

    public WebResourceResponse safedk_zzbqa_shouldInterceptRequest_33419b86026aba4cc6d2b3dddd1d8983(WebView p0, WebResourceRequest p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zzbqa_shouldOverrideUrlLoading_b4f8efd06c401011566658698e9e8837(WebView p0, WebResourceRequest p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, webView, webResourceRequest, safedk_zzbqa_shouldInterceptRequest_33419b86026aba4cc6d2b3dddd1d8983(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.h, webView, str, safedk_zzbqa_shouldInterceptRequest_f38d4e2c239613fdca244fb3cd084539(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzbqa_shouldOverrideUrlLoading_b4f8efd06c401011566658698e9e8837 = safedk_zzbqa_shouldOverrideUrlLoading_b4f8efd06c401011566658698e9e8837(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zzbqa_shouldOverrideUrlLoading_b4f8efd06c401011566658698e9e8837);
        return safedk_zzbqa_shouldOverrideUrlLoading_b4f8efd06c401011566658698e9e8837;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbqa;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzbqa_shouldOverrideUrlLoading_761e9f8b472e7d6865586700fe443e16 = safedk_zzbqa_shouldOverrideUrlLoading_761e9f8b472e7d6865586700fe443e16(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzbqa_shouldOverrideUrlLoading_761e9f8b472e7d6865586700fe443e16);
        return safedk_zzbqa_shouldOverrideUrlLoading_761e9f8b472e7d6865586700fe443e16;
    }

    public void safedk_zzbqa_onReceivedError_52c1166640a4c8ad14015ec3e1040098(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(p0, p1, p2);
    }

    public WebResourceResponse safedk_zzbqa_shouldInterceptRequest_f38d4e2c239613fdca244fb3cd084539(WebView p0, String p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zzbqa_shouldOverrideUrlLoading_761e9f8b472e7d6865586700fe443e16(WebView p0, String p1) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(p0, p1);
    }
}
