package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.dmi;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.xw3;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3915yi extends E2 {
    public final Hi f;
    public final Function1 g;
    public boolean h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3915yi(Hi hi, InterfaceC3880x9 interfaceC3880x9, Function1 function1) {
        super(interfaceC3880x9);
        function1.getClass();
        this.f = hi;
        this.g = function1;
        this.i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        boolean z;
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", dmi.q("onShouldOverrideUrlLoading  - url - ", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3889xi) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webView;
            z = true;
            if (!gestureDetectorOnGestureListenerC3889xi.a()) {
                gestureDetectorOnGestureListenerC3889xi.a(this.i);
                return true;
            }
            InterfaceC3880x9 interfaceC3880x92 = this.a;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC3889xi.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC3889xi, str);
        } else {
            z = false;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.a;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).a("RenderViewClient", "Override URL loading :" + str + " returned " + z);
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", dmi.q("Resource loading:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3889xi) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webView;
            String url = gestureDetectorOnGestureListenerC3889xi.getUrl();
            if (str == null || url == null || kotlin.text.c.v(url, "file:", false)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC3889xi);
        }
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Xh xh;
        Hi hi = this.f;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            ku3 ku3Var = Hl.a;
            a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a2 = hi.a("WebViewLoadFinished");
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(a2, a, EnumC3943zk.SDK);
        }
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", dmi.q("Page load finished:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3889xi) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webView;
            a(gestureDetectorOnGestureListenerC3889xi);
            if ("Loading".equals(gestureDetectorOnGestureListenerC3889xi.A)) {
                gestureDetectorOnGestureListenerC3889xi.h("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3889xi.h("window.mraidview.broadcastEvent('ready');");
                xw3.L(L9.c, null, null, new C3811ui(gestureDetectorOnGestureListenerC3889xi, null), 3);
            }
        }
        InterfaceC3880x9 interfaceC3880x92 = this.a;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3880x9 interfaceC3880x93 = this.a;
        if (interfaceC3880x93 == null || (xh = ((C3906y9) interfaceC3880x93).a) == null) {
            return;
        }
        xh.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Xh xh;
        Hi hi = this.f;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            ku3 ku3Var = Hl.a;
            a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a2 = hi.a("PageStarted");
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(a2, a, EnumC3943zk.SDK);
        }
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", dmi.q("Page load started:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3889xi) {
            InterfaceC3880x9 interfaceC3880x92 = this.a;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("RenderViewClient", dmi.q("Page load started renderview: ", ((GestureDetectorOnGestureListenerC3889xi) webView).getMarkupType()));
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webView;
            a(gestureDetectorOnGestureListenerC3889xi);
            gestureDetectorOnGestureListenerC3889xi.setAndUpdateViewState("Loading");
        }
        InterfaceC3880x9 interfaceC3880x93 = this.a;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3880x9 interfaceC3880x94 = this.a;
        if (interfaceC3880x94 == null || (xh = ((C3906y9) interfaceC3880x94).a) == null) {
            return;
        }
        xh.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        F5.a.getClass();
        boolean z = F5.z();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (!z) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("RenderViewClient", "OnReceivedError ");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            int errorCode = webResourceError.getErrorCode();
            CharSequence description = webResourceError.getDescription();
            ((C3906y9) interfaceC3880x9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + webResourceRequest.getUrl() + ", method - " + webResourceRequest.getMethod() + ", isMainFrame - " + webResourceRequest.isForMainFrame());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + renderProcessGoneDetail.didCrash() + " priority - " + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        this.g.invoke(Boolean.valueOf(renderProcessGoneDetail.didCrash()));
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        WebResourceResponse a = Do.a(webResourceRequest, this.a);
        return a == null ? super.shouldInterceptRequest(webView, webResourceRequest) : a;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        F5.a.getClass();
        if (!F5.x()) {
            return false;
        }
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        return a(webView, uri);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        WebResourceResponse a = Do.a(str, this.a);
        return a == null ? super.shouldInterceptRequest(webView, str) : a;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", dmi.q("shouldOverrideUrlLoading Called ", str));
        }
        return a(webView, str);
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", dmi.q("Override URL loading :", str));
        }
        gestureDetectorOnGestureListenerC3889xi.s();
        C3442gb a = C3468hb.a(gestureDetectorOnGestureListenerC3889xi.getLandingPageHandler(), this.i, (String) null, str, (C3571lb) null, 24);
        InterfaceC3880x9 interfaceC3880x92 = this.a;
        if (interfaceC3880x92 != null) {
            StringBuilder t = dmi.t(gestureDetectorOnGestureListenerC3889xi.copyBackForwardList().getCurrentIndex(), "Current Index :", " Original Url :", gestureDetectorOnGestureListenerC3889xi.getOriginalUrl(), " URL: ");
            t.append(str);
            ((C3906y9) interfaceC3880x92).a("RenderViewClient", t.toString());
        }
        InterfaceC3880x9 interfaceC3880x93 = this.a;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).c("RenderViewClient", ljg.j(a.a, "landingPage process result - "));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            StringBuilder t = dmi.t(i, "OnReceivedError - errorCode - ", ", description - ", str, ", url - ");
            t.append(str2);
            ((C3906y9) interfaceC3880x9).b("RenderViewClient", t.toString());
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        if (this.h || gestureDetectorOnGestureListenerC3889xi.e) {
            return;
        }
        this.h = true;
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC3889xi.h(gestureDetectorOnGestureListenerC3889xi.getMraidJsString());
    }
}
