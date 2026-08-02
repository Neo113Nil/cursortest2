package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.h2;
import com.applovin.impl.l0;
import com.applovin.impl.p0;
import com.applovin.impl.p8;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t;
import com.applovin.impl.u7;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import com.applovin.impl.z7;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class b extends l0 {
    private static final Set j = Collections.newSetFromMap(new WeakHashMap());
    private static final Object k = new Object();
    private final p c;
    private final com.applovin.impl.sdk.l d;
    private com.applovin.impl.sdk.ad.b e;
    private boolean f;
    private boolean g;
    private final List h;
    private final Object i;

    class a extends v4 {
        a() {
        }

        @Override // com.applovin.impl.v4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.a, view, url);
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

    public b(c cVar, com.applovin.impl.sdk.l lVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.i = new Object();
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.d = lVar;
        this.c = lVar.Q();
        Integer num = (Integer) lVar.a(z4.K6);
        if (num.intValue() > 0) {
            synchronized (k) {
                Set set = j;
                set.add(this);
                q7.a("AdWebView", set.size(), num.intValue(), lVar.E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new t(cVar != null ? cVar.d() : null, lVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (p0.g() && ((Boolean) lVar.a(z4.f6)).booleanValue()) {
            setWebViewRenderProcessClient(new d(lVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a2;
                a2 = b.a(view, motionEvent);
                return a2;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean a2;
                a2 = b.this.a(view);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private void b() {
        synchronized (this.i) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                p8.a(this, (String) it.next(), "AdWebView", this.d);
            }
            this.h.clear();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f = true;
        this.g = false;
        super.destroy();
    }

    @Override // com.applovin.impl.l0, com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.e;
    }

    @Override // com.applovin.impl.l0, com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.g = z;
        if (z && ((Boolean) this.d.a(z4.C6)).booleanValue()) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!p.a()) {
            return true;
        }
        this.c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String str;
        if (!this.f) {
            this.e = bVar;
            try {
                applySettings(bVar);
                if (q7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.l(), ((com.applovin.impl.sdk.ad.a) bVar).h1(), "text/html", null, "");
                    if (p.a()) {
                        this.c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof r7) {
                    r7 r7Var = (r7) bVar;
                    u7 g1 = r7Var.g1();
                    if (g1 != null) {
                        z7 e = g1.e();
                        Uri c = e.c();
                        if (c != null) {
                            str = c.toString();
                        } else {
                            str = "";
                        }
                        String b = e.b();
                        String i1 = r7Var.i1();
                        if (!StringUtils.isValidString(str) && !StringUtils.isValidString(b)) {
                            if (p.a()) {
                                this.c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (e.d() == z7.a.STATIC) {
                            if (p.a()) {
                                this.c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a2 = a((String) this.d.a(z4.S4), str);
                            if (r7Var.x1() && r7Var.isOpenMeasurementEnabled() && r7Var.y1()) {
                                a2 = this.d.g0().a(a2, h2.a((AppLovinAdImpl) bVar));
                            }
                            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.l(), a2, "text/html", null, "");
                            return;
                        }
                        if (e.d() == z7.a.HTML) {
                            if (StringUtils.isValidString(b)) {
                                String a3 = a(i1, b);
                                String str2 = StringUtils.isValidString(a3) ? a3 : b;
                                if (p.a()) {
                                    this.c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str2);
                                }
                                AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.l(), str2, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(str)) {
                                if (p.a()) {
                                    this.c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(str, bVar.l(), i1, this.d, r7Var);
                                return;
                            }
                            return;
                        }
                        String str3 = str;
                        if (e.d() == z7.a.IFRAME) {
                            if (StringUtils.isValidString(str3)) {
                                if (p.a()) {
                                    this.c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str3, bVar.l(), i1, this.d, r7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(b)) {
                                    String a4 = a(i1, b);
                                    String str4 = StringUtils.isValidString(a4) ? a4 : b;
                                    if (p.a()) {
                                        this.c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str4);
                                    }
                                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.l(), str4, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (p.a()) {
                            this.c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (p.a()) {
                        this.c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : AbstractJsonLexerKt.NULL) + ") - " + th);
            }
        }
        p.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.d.a(z4.C6)).booleanValue()) {
            if (this.g) {
                p8.a(this, str, "AdWebView", this.d);
                return;
            }
            synchronized (this.h) {
                this.h.add(str);
            }
            return;
        }
        p8.a(this, str, "AdWebView", this.d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.l lVar, r7 r7Var) {
        String a2 = a(str3, str);
        if (StringUtils.isValidString(a2)) {
            if (p.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, a2, "text/html", null, "");
            return;
        }
        String a3 = a((String) lVar.a(z4.T4), str);
        if (StringUtils.isValidString(a3)) {
            if (r7Var.x1() && r7Var.isOpenMeasurementEnabled()) {
                a3 = lVar.g0().a(a3, h2.a((AppLovinAdImpl) r7Var));
            }
            if (p.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a3);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, a3, "text/html", null, "");
            return;
        }
        if (p.a()) {
            this.c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        AppLovinNetworkBridge.webviewLoadUrl(this, str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
