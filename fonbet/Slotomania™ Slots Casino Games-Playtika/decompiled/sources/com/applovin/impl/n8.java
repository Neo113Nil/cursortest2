package com.applovin.impl;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.impl.n8;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class n8 {
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;
    private WebView c;
    private boolean d;
    private final Set e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: private */
    class a extends v4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            n8.this.c.destroy();
            n8.this.c = null;
        }

        @Override // com.applovin.impl.v4
        protected Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.a, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.a) {
                com.applovin.impl.sdk.p unused = n8.this.b;
                if (com.applovin.impl.sdk.p.a()) {
                    n8.this.b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                n8.this.d = true;
            }
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.a, view, url);
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, view, errorCode, description, failingUrl);
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == n8.this.c) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        n8.a.this.b();
                    }
                });
            } else {
                n8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }
    }

    public n8(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final WebView a2 = a(str);
        if (a2 != null) {
            this.e.add(a2);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    n8.this.b(a2);
                }
            }, ((Integer) this.a.a(z4.O2)).intValue());
        } else if (com.applovin.impl.sdk.p.a()) {
            this.b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                n8.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView a2 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.c = a2;
        if (a2 == null && com.applovin.impl.sdk.p.a()) {
            this.b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        final String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.a.a(z4.n3)).booleanValue());
        if (this.c == null) {
            WebView a2 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.c = a2;
            if (a2 == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.d) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            hashMap.put("source", "webViewNotInitialized");
            hashMap.put("url", appendQueryParameters);
            this.a.E().d(f2.k1, hashMap);
            appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + appendQueryParameters + "')";
        if (((Boolean) this.a.a(z4.U2)).booleanValue()) {
            p8.a(this.c, str, this.a).a(this.a.s0().a("evaluateJavascriptPromise"), new u4.b() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.u4.b
                public final void a(boolean z, Object obj, Object obj2) {
                    n8.this.a(appLovinPostbackListener, appendQueryParameters, z, (String) obj, (String) obj2);
                }
            });
        } else {
            p8.a(this.c, str);
            appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
        }
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                n8.this.b(eVar, appLovinPostbackListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z, String str2, String str3) {
        if (z) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.a.E().d(f2.k1, map);
    }

    private boolean c() {
        return ((Boolean) this.a.a(z4.T2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z) {
        q7.b();
        WebView b = q7.b(com.applovin.impl.sdk.l.p(), "web tracker");
        if (b == null) {
            return null;
        }
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(new a(z && c()));
        AppLovinNetworkBridge.webviewLoadData(b, "<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", C.UTF8_NAME);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final WebView webView) {
        if (webView == null || !this.e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    public void b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    n8.this.c(str);
                }
            });
        }
    }
}
