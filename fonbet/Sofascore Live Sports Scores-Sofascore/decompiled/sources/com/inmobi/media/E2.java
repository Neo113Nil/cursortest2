package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.wb3;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class E2 extends WebViewClient {
    public final InterfaceC3880x9 a;
    public boolean c;
    public boolean d;
    public int b = -1;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public E2(InterfaceC3880x9 interfaceC3880x9) {
        this.a = interfaceC3880x9;
    }

    public final void a(WebView webView) {
        webView.getClass();
        this.e.set(true);
        webView.postDelayed(new wb3(this, 18), 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.d) {
            this.d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        Xb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + webResourceRequest.getUrl() + ", method - " + webResourceRequest.getMethod() + ", isMainFrame - " + webResourceRequest.isForMainFrame());
        }
        int i = this.b;
        if (-1 != i) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new Handler(Looper.getMainLooper()).post(new Ue(webView));
                this.c = true;
                if (webView instanceof GestureDetectorOnGestureListenerC3889xi) {
                    ((GestureDetectorOnGestureListenerC3889xi) webView).G();
                }
            }
        }
        WebResourceResponse a = Do.a(webResourceRequest, this.a);
        return a == null ? super.shouldInterceptRequest(webView, webResourceRequest) : a;
    }

    public static final void a(E2 e2) {
        e2.e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i;
        webView.getClass();
        str.getClass();
        F5.a.getClass();
        if (!F5.x() && -1 != (i = this.b)) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new Handler(Looper.getMainLooper()).post(new Ue(webView));
                this.c = true;
                if (webView instanceof GestureDetectorOnGestureListenerC3889xi) {
                    ((GestureDetectorOnGestureListenerC3889xi) webView).G();
                }
            }
        }
        WebResourceResponse a = Do.a(str, this.a);
        return a == null ? super.shouldInterceptRequest(webView, str) : a;
    }
}
