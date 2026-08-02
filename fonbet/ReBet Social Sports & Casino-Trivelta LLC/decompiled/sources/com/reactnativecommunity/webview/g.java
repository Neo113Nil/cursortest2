package com.reactnativecommunity.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.reactnativecommunity.webview.d;
import com.reactnativecommunity.webview.m;
import com.twilio.voice.EventKeys;
import java.util.concurrent.atomic.AtomicReference;
import pc.C6061a;
import pc.C6063c;
import x0.C6774c;

/* loaded from: classes4.dex */
public class g extends WebViewClient {

    /* renamed from: d, reason: collision with root package name */
    public static String f41337d = "RNCWebViewClient";

    /* renamed from: a, reason: collision with root package name */
    public boolean f41338a = false;

    /* renamed from: b, reason: collision with root package name */
    public d.C0592d f41339b = null;

    /* renamed from: c, reason: collision with root package name */
    public a f41340c = null;

    public WritableMap a(WebView webView, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("target", p.a(webView));
        createMap.putString(EventKeys.URL, str);
        createMap.putBoolean("loading", (this.f41338a || webView.getProgress() == 100) ? false : true);
        createMap.putString("title", webView.getTitle());
        createMap.putBoolean("canGoBack", webView.canGoBack());
        createMap.putBoolean("canGoForward", webView.canGoForward());
        return createMap;
    }

    public void b(WebView webView, String str) {
        int a10 = p.a(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), a10).dispatchEvent(new pc.e(a10, a(webView, str)));
    }

    public void c(WebView webView, int i10, String str, String str2) {
        WritableMap a10 = a(webView, str2);
        a10.putDouble(EventKeys.ERROR_CODE, i10);
        a10.putString("description", str);
        int a11 = p.a(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), a11).dispatchEvent(new C6061a(a11, a10));
    }

    public void d(a aVar) {
        this.f41340c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        super.doUpdateVisitedHistory(webView, str, z10);
        ((d) webView).g(webView, new pc.g(p.a(webView), a(webView, str)));
    }

    public void e(d.C0592d c0592d) {
        this.f41339b = c0592d;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.f41338a) {
            return;
        }
        ((d) webView).a();
        b(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f41338a = false;
        ((d) webView).b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f41338a = true;
        b(webView, str2);
        WritableMap a10 = a(webView, str2);
        a10.putDouble(EventKeys.ERROR_CODE, i10);
        a10.putString("description", str);
        int a11 = p.a(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), a11).dispatchEvent(new pc.d(a11, a10));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        a aVar = this.f41340c;
        if (aVar != null) {
            httpAuthHandler.proceed(aVar.f41283a, aVar.f41284b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap a10 = a(webView, webResourceRequest.getUrl().toString());
            a10.putInt("statusCode", webResourceResponse.getStatusCode());
            a10.putString("description", webResourceResponse.getReasonPhrase());
            int a11 = p.a(webView);
            UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), a11).dispatchEvent(new C6063c(a11, a10));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        int primaryError = sslError.getPrimaryError();
        String str = "SSL error: " + (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid");
        if (url.equalsIgnoreCase(url2)) {
            onReceivedError(webView, primaryError, str, url2);
            return;
        }
        Log.w(f41337d, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
        c(webView, primaryError, str, url2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        boolean didCrash2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        didCrash = renderProcessGoneDetail.didCrash();
        if (didCrash) {
            Log.e(f41337d, "The WebView rendering process crashed.");
        } else {
            Log.w(f41337d, "The WebView rendering process was killed by the system.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap a10 = a(webView, webView.getUrl());
        didCrash2 = renderProcessGoneDetail.didCrash();
        a10.putBoolean("didCrash", didCrash2);
        int a11 = p.a(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), a11).dispatchEvent(new pc.j(a11, a10));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d dVar = (d) webView;
        if (dVar.getReactApplicationContext().getJavaScriptContextHolder().getContext() == 0 || dVar.f41310i == null) {
            E6.a.K(f41337d, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.f41339b.b(true);
            int a10 = p.a(webView);
            UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), a10).dispatchEvent(new pc.k(a10, a(webView, str)));
            return true;
        }
        C6774c b10 = m.f41375g.b();
        Double d10 = (Double) b10.f67817a;
        double doubleValue = d10.doubleValue();
        AtomicReference atomicReference = (AtomicReference) b10.f67818b;
        WritableMap a11 = a(webView, str);
        a11.putDouble("lockIdentifier", doubleValue);
        dVar.f(a11);
        try {
            synchronized (atomicReference) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == m.d.a.UNDECIDED) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime > 250) {
                            E6.a.K(f41337d, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                            m.f41375g.c(d10);
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    boolean z10 = atomicReference.get() == m.d.a.SHOULD_OVERRIDE;
                    m.f41375g.c(d10);
                    return z10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException e10) {
            E6.a.n(f41337d, "shouldOverrideUrlLoading was interrupted while waiting for result.", e10);
            m.f41375g.c(d10);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
