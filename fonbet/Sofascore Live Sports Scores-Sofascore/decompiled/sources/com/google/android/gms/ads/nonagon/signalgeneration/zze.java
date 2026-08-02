package com.google.android.gms.ads.nonagon.signalgeneration;

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
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzhdi;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze extends zzbre {
    public final zza a;
    public final zzhdi b;
    public final Object c = new Object();
    public ScheduledFuture d;
    public WebViewClient e;
    public WebView f;

    public zze(WebView webView, zza zzaVar, zzhdi zzhdiVar) {
        this.f = webView;
        this.a = zzaVar;
        this.b = zzhdiVar;
    }

    public static boolean c() {
        if (((Boolean) zzblm.a.c()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z = false;
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(zze.class.getName())) {
                        if (!z || !z2) {
                            z = true;
                        }
                    } else if (z) {
                        z2 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final WebViewClient a() {
        return this.e;
    }

    public final void b() {
        synchronized (this.c) {
            try {
                WebView webView = this.f;
                if (webView == null) {
                    return;
                }
                webView.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.tb), this.a.zzb()), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (c()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (c()) {
            return;
        }
        b();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (c()) {
            return;
        }
        b();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (c()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (c()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        if (c()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (c()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!c()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        synchronized (this.c) {
            try {
                WebView webView2 = this.f;
                if (webView2 != null) {
                    webView2.setWebViewClient(new WebViewClient());
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture == null) {
            return true;
        }
        scheduledFuture.cancel(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (c()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (c()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.d = zzcgj.d.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zze.this.zzb();
            }
        }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sb)).intValue(), TimeUnit.MILLISECONDS);
    }

    public final void zzb() {
        this.b.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zze zzeVar = zze.this;
                synchronized (zzeVar.c) {
                    WebView webView = zzeVar.f;
                    if (webView == null) {
                        return;
                    }
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        WebViewClient webViewClient = webView.getWebViewClient();
                        if (webViewClient == zzeVar) {
                            return;
                        }
                        if (webViewClient != null) {
                            zzeVar.e = webViewClient;
                        }
                        webView.setWebViewClient(zzeVar);
                        zzeVar.b();
                    } catch (IllegalStateException unused) {
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
