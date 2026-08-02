package com.applovin.impl.adview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.d8;
import com.applovin.impl.f2;
import com.applovin.impl.h2;
import com.applovin.impl.n7;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdSize;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class c extends v4 {
    private final com.applovin.impl.sdk.l a;
    private final p b;
    private final a c;

    public c(a aVar, com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        this.c = aVar;
    }

    private void b() {
        this.c.y();
    }

    private void c() {
        this.c.a();
    }

    @Override // com.applovin.impl.v4
    protected Map a() {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        hashMap.putAll(h2.a((AppLovinAdImpl) this.c.g()));
        return hashMap;
    }

    protected a d() {
        return this.c;
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.a, webView, str);
        safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (p.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        this.c.a(webView, str);
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.a, view, url);
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, webView, i, str, str2);
        safedk_c_onReceivedError_8e544adb9beea31f39e1655c605c306d(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, webView, webResourceRequest, webResourceError);
        safedk_c_onReceivedError_3e062ec97139c0570b7d2cb7765ff835(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        if (p.a()) {
            this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + g);
        }
        if (q7.a(webResourceRequest.getUrl().toString(), this.a)) {
            this.a.E().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str = "Received SSL error: " + sslError;
        if (p.a()) {
            this.b.b("AdWebView", str + " for ad: " + g);
        }
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        p.h("AdWebView", "Render process gone for ad: " + g + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean onRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.a.a(z4.X5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, g);
        }
        return onRenderProcessGone;
    }

    public void safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(WebView p0, String p1) {
        super.onLoadResource(p0, p1);
        if (p.a()) {
            this.b.d("AdWebView", "Loaded resource: " + p1);
        }
    }

    public void safedk_c_onReceivedError_3e062ec97139c0570b7d2cb7765ff835(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        onReceivedError(p0, p2.getErrorCode(), p2.getDescription().toString(), p1.getUrl().toString());
    }

    public boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(WebView p0, WebResourceRequest p1) {
        Uri url = p1.getUrl();
        if (url != null) {
            return a(p0, url.toString());
        }
        if (!p.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba = safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, webView, webResourceRequest, safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba);
        return safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba;
    }

    @Override // com.applovin.impl.v4, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10 = safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, webView, str, safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10);
        return safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10;
    }

    public void safedk_c_onReceivedError_8e544adb9beea31f39e1655c605c306d(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str = "Received error with error code: " + p1 + " with description \\'" + p2 + "\\' for URL: " + p3;
        if (p.a()) {
            this.b.b("AdWebView", str + " for ad: " + g);
        }
        if (q7.a(p3, this.a)) {
            this.a.E().a("adWebViewReceivedError", p3, p1, p2);
        }
    }

    protected boolean a(WebView webView, String str) {
        boolean z;
        if (this.c == null) {
            return true;
        }
        if (p.a()) {
            this.b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b g = this.c.g();
            if (g == null) {
                if (p.a()) {
                    this.b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean a = bVar.a();
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if ("/vibrate".equals(path)) {
                    long parseLong = StringUtils.parseLong(parse.getQueryParameter("duration_ms"), 0L);
                    if (parseLong > 0) {
                        q7.a(StringUtils.parseFloat(parse.getQueryParameter("intensity"), 0.5f), parseLong, this.a);
                    }
                } else if ("/adservice/close_ad".equals(path)) {
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (a(a, g, parse)) {
                        if (p.a()) {
                            this.b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(a, g, parse)) {
                            if (p.a()) {
                                this.b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        n7.a(parse, this.c, this.a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(a, g, parse)) {
                            if (p.a()) {
                                this.b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (g instanceof r7) {
                            a((r7) g, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(a, g, parse)) {
                            if (p.a()) {
                                this.b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (g instanceof r7) {
                            r7 r7Var = (r7) g;
                            if (r7Var.w1()) {
                                a(r7Var, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        n7.a(parse, g, this.a);
                    } else if ("/ga_init".equals(path)) {
                        this.c.c(parse);
                    } else if ("/ga_event".equals(path)) {
                        this.c.b(parse);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/save_template_state".equals(path)) {
                        g.b(parse.getQueryParameter("state"));
                    } else if ("/template_error".equals(path)) {
                        n7.c(parse, g, this.a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.c.z();
                    } else if ("/adservice/preload".equals(path)) {
                        n7.b(parse, g, this.a);
                    } else if ("/adservice/custom_intent".equals(path)) {
                        n7.a(parse, g, this.c.i(), this.a);
                    } else if ("/config_system_bars".equals(path)) {
                        this.c.a(parse);
                    } else if ("/save_template_stage_info".equals(path)) {
                        g.c(parse.getQueryParameter("stage_info"));
                    } else {
                        if (p.a()) {
                            this.b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (p.a()) {
                            this.b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else {
                Iterator it = g.Y().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z = false;
                        break;
                    }
                }
                if (!a) {
                    boolean X0 = g.X0();
                    boolean z2 = X0 ? false : z;
                    a(parse, X0, g, this.a);
                    z = z2;
                }
                if (z) {
                    List r0 = g.r0();
                    List q0 = g.q0();
                    if ((!r0.isEmpty() && !r0.contains(scheme)) || (!q0.isEmpty() && !q0.contains(host))) {
                        if (p.a()) {
                            this.b.b("AdWebView", "URL is not whitelisted - bypassing click");
                        }
                    } else {
                        if (g instanceof r7) {
                            r7 r7Var2 = (r7) g;
                            if (r7Var2.w1()) {
                                a(r7Var2, bVar);
                            }
                        }
                        a(bVar, parse);
                    }
                }
            }
        }
        return true;
    }

    public boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(WebView p0, String p1) {
        return a(p0, p1);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.a.a(z4.e6)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : AbstractJsonLexerKt.NULL));
        }
        if (webView == null || !webView.equals(this.c.f())) {
            return;
        }
        this.c.a(((Boolean) this.a.a(z4.f7)).booleanValue());
        AppLovinAdSize k = this.c.k();
        if (q7.a(k)) {
            this.c.a(k);
            this.c.D();
        }
    }

    private boolean a(boolean z, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z) {
            return false;
        }
        boolean Y0 = bVar.Y0();
        a(uri, Y0, bVar, this.a);
        return Y0;
    }

    private static void a(Uri uri, boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        if (lVar.c(z4.V6).contains(uri.getScheme())) {
            return;
        }
        lVar.E().d(f2.S0, a(bVar, uri, z));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z) {
        Map a = h2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), a);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z), a);
        return a;
    }

    private void a(MotionEvent motionEvent) {
        this.c.a(motionEvent);
    }

    private void a(r7 r7Var, b bVar) {
        u7 g1 = r7Var.g1();
        if (g1 != null) {
            d8.a(g1.b(), this.c.j());
            a(bVar, g1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView i = this.c.i();
        if (i != null && currentAd != null) {
            if (currentAd instanceof r7) {
                ((r7) currentAd).getAdEventTracker().v();
            }
            this.c.a(currentAd, i, uri, bVar.getAndClearLastClickEvent());
        } else if (p.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        q7.a(str, com.applovin.impl.sdk.l.p());
    }
}
