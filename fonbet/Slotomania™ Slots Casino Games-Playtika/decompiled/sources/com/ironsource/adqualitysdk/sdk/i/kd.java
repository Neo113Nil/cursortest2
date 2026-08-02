package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class kd implements jy {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, kd> f2979 = new WeakHashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Set<jy> f2980 = new HashSet();

    /* renamed from: ｋ, reason: contains not printable characters */
    private kc f2981;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f2982;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static kd m8344(WebView webView, String str) {
        kd kdVar = f2979.get(webView);
        if (kdVar != null) {
            return kdVar;
        }
        kd kdVar2 = new kd(webView, str);
        f2979.put(webView, kdVar2);
        return kdVar2;
    }

    private kd(WebView webView, String str) {
        this.f2982 = str;
        kc kcVar = new kc(webView);
        this.f2981 = kcVar;
        kcVar.m8341(new AnonymousClass1());
        this.f2981.m8338(new AnonymousClass5());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8347() {
        this.f2981.m8341(new AnonymousClass1());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8351() {
        this.f2981.m8338(new AnonymousClass5());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8348(jy jyVar) {
        this.f2980.add(jyVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8345(jy jyVar) {
        this.f2980.remove(jyVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m8346() {
        return this.f2981.m8339();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WebView m8350() {
        return this.f2981.m8342();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ba.d m8349() {
        return this.f2981.m8340();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﻐ */
    public final void mo8319(WebView webView) {
        for (jy jyVar : new HashSet(this.f2980)) {
            if (jyVar != null) {
                jyVar.mo8319(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﻛ */
    public final void mo8321(WebView webView, String str, String str2) {
        for (jy jyVar : new HashSet(this.f2980)) {
            if (jyVar != null) {
                jyVar.mo8321(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﾒ */
    public final void mo8322(WebView webView, String str, boolean z) {
        for (jy jyVar : new HashSet(this.f2980)) {
            if (jyVar != null) {
                jyVar.mo8322(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﻛ */
    public final void mo8320(WebView webView, String str) {
        for (jy jyVar : new HashSet(this.f2980)) {
            if (jyVar != null) {
                jyVar.mo8320(webView, str);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kd$1, reason: invalid class name */
    final class AnonymousClass1 extends WebViewClient {

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean f2984 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f2983 = false;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f2986 = null;

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/kd$1;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
            safedk_kd$1_onPageStarted_7f9508addab65bf17ccc832924c75516(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/kd$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_kd$1_shouldOverrideUrlLoading_6b2c0983fb0d71128fc31e20b62341cb = safedk_kd$1_shouldOverrideUrlLoading_6b2c0983fb0d71128fc31e20b62341cb(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, webResourceRequest, safedk_kd$1_shouldOverrideUrlLoading_6b2c0983fb0d71128fc31e20b62341cb);
            return safedk_kd$1_shouldOverrideUrlLoading_6b2c0983fb0d71128fc31e20b62341cb;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/kd$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_kd$1_shouldOverrideUrlLoading_a6ea3855824db025ccbbafbc2235e856 = safedk_kd$1_shouldOverrideUrlLoading_a6ea3855824db025ccbbafbc2235e856(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_kd$1_shouldOverrideUrlLoading_a6ea3855824db025ccbbafbc2235e856);
            return safedk_kd$1_shouldOverrideUrlLoading_a6ea3855824db025ccbbafbc2235e856;
        }

        AnonymousClass1() {
        }

        public void safedk_kd$1_onPageStarted_7f9508addab65bf17ccc832924c75516(WebView p0, String p1, Bitmap p2) {
            kd.this.mo8319(p0);
            this.f2984 = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            kd.this.mo8319(webView);
            this.f2984 = false;
            this.f2983 = true;
            if (this.f2986 == null) {
                this.f2986 = webView.getOriginalUrl();
            }
        }

        public boolean safedk_kd$1_shouldOverrideUrlLoading_a6ea3855824db025ccbbafbc2235e856(WebView p0, String p1) {
            if (m8353(p0, p1)) {
                return true;
            }
            if (this.f2986 == null) {
                this.f2986 = p0.getOriginalUrl();
            }
            kd.this.mo8322(p0, p1, m8352(p0));
            this.f2983 = true;
            this.f2984 = false;
            return false;
        }

        public boolean safedk_kd$1_shouldOverrideUrlLoading_6b2c0983fb0d71128fc31e20b62341cb(WebView p0, WebResourceRequest p1) {
            return shouldOverrideUrlLoading(p0, p1.getUrl().toString());
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean m8352(WebView webView) {
            if (this.f2984 && this.f2983) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2986 == null || webView.getOriginalUrl().equals(this.f2986)) ? false : true;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private boolean m8353(WebView webView, String str) {
            if (!str.startsWith(kd.this.f2982)) {
                return false;
            }
            this.f2986 = webView.getOriginalUrl();
            String substring = str.substring(kd.this.f2982.length());
            kd kdVar = kd.this;
            kdVar.mo8321(webView, kdVar.f2982, substring);
            return true;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kd$5, reason: invalid class name */
    final class AnonymousClass5 extends WebChromeClient {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2988 = false;

        AnonymousClass5() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            kd.this.mo8320(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i != 100 || this.f2988) {
                return;
            }
            this.f2988 = true;
            kd.this.mo8319(webView);
        }
    }
}
