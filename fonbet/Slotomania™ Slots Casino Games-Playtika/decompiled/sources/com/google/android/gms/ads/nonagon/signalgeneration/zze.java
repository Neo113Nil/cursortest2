package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
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
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzhbs;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zze extends zzbqa {
    private final WebView zza;
    private final zza zzb;
    private final Executor zzc;
    private WebViewClient zzd;

    public zze(WebView webView, zza zzaVar, zzhbs zzhbsVar) {
        this.zza = webView;
        this.zzb = zzaVar;
        this.zzc = zzhbsVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlg), this.zzb.zzb()), null);
    }

    private final boolean zzd() {
        if (!((Boolean) zzbkj.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(getClass().getName())) {
                if (z && z2) {
                    return true;
                }
                z = true;
            } else if (z) {
                z2 = true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (zzd()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    protected final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (zzd()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zze_onLoadResource_f4722f9fe0b2142ed6aa089c82b259cb(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.h, webView, str);
        safedk_zze_onPageStarted_33185888fa278770355e6f95cb8ab86f(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (zzd()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zze_onReceivedError_fd1fa16d565ff6e229772dfef04eb7a8(webView, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, webResourceRequest, webResourceError);
        safedk_zze_onReceivedError_e05b900f3c640425cedda24f0a4f029a(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (zzd()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (zzd()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (zzd()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (zzd()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (zzd()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (zzd()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (zzd()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (zzd()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_zze_onLoadResource_f4722f9fe0b2142ed6aa089c82b259cb(WebView p0, String p1) {
        if (zzd()) {
            return;
        }
        super.onLoadResource(p0, p1);
    }

    public void safedk_zze_onPageStarted_33185888fa278770355e6f95cb8ab86f(WebView p0, String p1, Bitmap p2) {
        if (zzd()) {
            return;
        }
        zzc();
        super.onPageStarted(p0, p1, p2);
    }

    public void safedk_zze_onReceivedError_fd1fa16d565ff6e229772dfef04eb7a8(WebView p0, int p1, String p2, String p3) {
        if (zzd()) {
            return;
        }
        super.onReceivedError(p0, p1, p2, p3);
    }

    public WebResourceResponse safedk_zze_shouldInterceptRequest_e4d730c43b5dda1bc53fbbef5c192fd7(WebView p0, WebResourceRequest p1) {
        if (zzd()) {
            return null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9(WebView p0, WebResourceRequest p1) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.h, webView, webResourceRequest, safedk_zze_shouldInterceptRequest_e4d730c43b5dda1bc53fbbef5c192fd7(webView, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.h, webView, str, safedk_zze_shouldInterceptRequest_d2b5ecb9c148c2b38763420852f2fcd9(webView, str));
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9 = safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, webResourceRequest, safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9);
        return safedk_zze_shouldOverrideUrlLoading_22078e21054be8ff0690a065258629b9;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16 = safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16);
        return safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zze.this.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        WebViewClient webViewClient;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT < 26) {
                if (WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClient = WebViewCompat.getWebViewClient(webView);
                    } catch (RuntimeException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClient = webView.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.zzd = webViewClient;
            }
            this.zza.setWebViewClient(this);
            zzc();
        } catch (IllegalStateException unused) {
        }
    }

    public void safedk_zze_onReceivedError_e05b900f3c640425cedda24f0a4f029a(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        if (zzd()) {
            return;
        }
        super.onReceivedError(p0, p1, p2);
    }

    public WebResourceResponse safedk_zze_shouldInterceptRequest_d2b5ecb9c148c2b38763420852f2fcd9(WebView p0, String p1) {
        if (zzd()) {
            return null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zze_shouldOverrideUrlLoading_2c27a103af04a068722d79e2fcf33c16(WebView p0, String p1) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
