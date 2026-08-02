package com.inmobi.media;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import defpackage.dmi;
import defpackage.iol;
import defpackage.tub;
import defpackage.xw3;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3334c6 extends E2 {
    public final String f;
    public final Function0 g;
    public final Function1 h;
    public final Function2 i;
    public final S8 j;
    public C3571lb k;
    public C3519jb l;
    public final C3683pj m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3334c6(String str, Function0 function0, Function1 function1, Function2 function2, InterfaceC3880x9 interfaceC3880x9, S8 s8, long j) {
        super(interfaceC3880x9);
        str.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        this.f = str;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.j = s8;
        this.m = new C3683pj(j, interfaceC3880x9, new iol(this, 3));
    }

    public final boolean a(WebView webView, String str) {
        String str2;
        Integer num;
        int i;
        InterfaceC3308b6 interfaceC3308b6;
        InterfaceC3944zl userLeftApplicationListener;
        if (this.e.get()) {
            return true;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", dmi.q("onShouldOverrideUrlLoading: ", str));
        }
        C3683pj c3683pj = this.m;
        if (!c3683pj.f) {
            c3683pj.g = EnumC3631nj.REDIRECTING;
        }
        c3683pj.h = true;
        c3683pj.a();
        if (webView instanceof D2) {
            str2 = str;
            C3442gb a = C3468hb.a(((D2) webView).getLandingPageHandler(), this.f, (String) null, str2, this.k, 16);
            num = a.b;
            i = a.a;
        } else {
            str2 = str;
            num = null;
            i = 0;
        }
        if (i == 0) {
            C3683pj c3683pj2 = this.m;
            c3683pj2.getClass();
            c3683pj2.g = EnumC3631nj.RESOLVE_IN_WEB_VIEW;
            return false;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                return false;
            }
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            C3519jb c3519jb = this.l;
            if (c3519jb != null) {
                c3519jb.a(3, false, str2, valueOf);
            }
            return true;
        }
        C3683pj c3683pj3 = this.m;
        c3683pj3.getClass();
        c3683pj3.g = EnumC3631nj.EXTERNAL;
        boolean z = webView instanceof C3360d6;
        if (z) {
            ViewParent parent = ((C3360d6) webView).getParent();
            if ((parent instanceof Y5) && (userLeftApplicationListener = ((Y5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        Function1 function1 = this.h;
        C3372di c3372di = GestureDetectorOnGestureListenerC3889xi.g1;
        String str3 = this.f;
        c3372di.getClass();
        function1.invoke(C3372di.a(str3, "onNavigatingAway"));
        a(webView);
        str2.getClass();
        Uri parse = Uri.parse(str2);
        parse.getClass();
        if (!F3.a(parse) || "play.google.com".equals(parse.getHost()) || "market.android.com".equals(parse.getHost()) || "market".equals(parse.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z) {
                ViewParent parent2 = ((C3360d6) webView).getParent();
                if ((parent2 instanceof Y5) && (interfaceC3308b6 = ((Y5) parent2).d) != null) {
                    V8.a(((U8) interfaceC3308b6).a);
                }
            }
            S8 s8 = this.j;
            if (s8 != null) {
                ((C3578li) s8).a.x();
            }
        }
        a(this, 2, false, str2, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        String str2;
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", dmi.q("onPageCommitVisible: ", str));
        }
        C3683pj c3683pj = this.m;
        if (c3683pj.f || c3683pj.a <= 0) {
            str2 = str;
        } else {
            long j = c3683pj.e;
            c3683pj.a();
            str2 = str;
            c3683pj.i = xw3.L(c3683pj.d, null, null, new C3657oj(c3683pj, j, str2, webView, null), 3);
        }
        a(this, 4, true, str2, 8);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", dmi.q("onPageFinished: ", str));
        }
        a(this, 2, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C3683pj c3683pj = this.m;
        if (!c3683pj.f && c3683pj.a > 0) {
            c3683pj.e++;
            c3683pj.f = false;
            c3683pj.g = EnumC3631nj.LOADING;
            c3683pj.h = false;
            c3683pj.a();
        }
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", dmi.q("onPageStarted: ", str));
        }
        Function1 function1 = this.h;
        C3372di c3372di = GestureDetectorOnGestureListenerC3889xi.g1;
        String str2 = this.f;
        c3372di.getClass();
        function1.invoke(C3372di.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", dmi.m(webResourceRequest.getUrl(), "onReceivedError: "));
        }
        if (webResourceRequest.isForMainFrame()) {
            Integer valueOf = Integer.valueOf(webResourceError.getErrorCode());
            String uri = webResourceRequest.getUrl().toString();
            C3519jb c3519jb = this.l;
            if (c3519jb != null) {
                c3519jb.a(3, true, uri, valueOf);
            }
            C3683pj c3683pj = this.m;
            String uri2 = webResourceRequest.getUrl().toString();
            c3683pj.getClass();
            c3683pj.a("RECEIVED_ERROR", uri2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        C3683pj c3683pj = this.m;
        String uri = webResourceRequest.getUrl().toString();
        c3683pj.getClass();
        c3683pj.a("RECEIVED_HTTP_ERROR", uri);
    }

    @Override // com.inmobi.media.E2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        boolean onRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        C3519jb c3519jb = this.l;
        if (c3519jb != null) {
            c3519jb.a(3, true, null, 8007);
        }
        LinkedHashMap i = tub.i(new Pair("source", "embedded_browser"), new Pair("isCrashed", Boolean.valueOf(renderProcessGoneDetail.didCrash())));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("WebViewRenderProcessGoneEvent", i, EnumC3943zk.SDK);
        C3683pj c3683pj = this.m;
        String url = webView.getUrl();
        c3683pj.getClass();
        c3683pj.a("RENDER_PROCESS_GONE", url);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri url;
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        F5.a.getClass();
        if (!F5.x()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (str = url.toString()) == null) {
            str = "";
        }
        if (webView == null || str.length() <= 0) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        Integer valueOf = Integer.valueOf(i);
        C3519jb c3519jb = this.l;
        if (c3519jb != null) {
            c3519jb.a(3, false, str2, valueOf);
        }
        C3683pj c3683pj = this.m;
        c3683pj.getClass();
        c3683pj.a("RECEIVED_ERROR", str2);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("EmbeddedBrowserViewClient", dmi.q("onReceivedError: ", str2));
        }
    }

    public static final Unit a(C3334c6 c3334c6, String str) {
        str.getClass();
        S8 s8 = c3334c6.j;
        if (s8 != null) {
            C3578li c3578li = (C3578li) s8;
            str.getClass();
            if (c3578li.a.getFullScreenActivity() instanceof InMobiAdActivity) {
                Activity fullScreenActivity = c3578li.a.getFullScreenActivity();
                fullScreenActivity.getClass();
                ((InMobiAdActivity) fullScreenActivity).a(str);
            }
        }
        return Unit.a;
    }

    public static void a(C3334c6 c3334c6, int i, boolean z, String str, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        C3519jb c3519jb = c3334c6.l;
        if (c3519jb != null) {
            c3519jb.a(i, z, str, null);
        }
    }
}
