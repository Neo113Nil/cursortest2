package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C extends WebViewClient implements D, InterfaceC0823 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WebViewClient f73;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebViewClient f74;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f72 = StringFog.decrypt("v3M/Pmod872EfzgGdzzhnYdkPBxsCg==\n", "6BZdaAN4hP4=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f71 = StringFog.decrypt("teQbAYRct2y35TgzlGuueaXCAz+TU7M=\n", "0oFvVvY9xxw=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f70 = StringFog.decrypt("/NzICwexpvTN0NkoJoqq8/XN\n", "m7m8X2Xmw5Y=\n");

    public C(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f74 = webViewClient;
        this.f73 = webViewClient2;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        try {
            this.f73.doUpdateVisitedHistory(webView, str, z);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("cjf075RnJJsXKNLiqi4+gVIr4/LGIyKgRyHn9IMRJIZeMePkri4+gVg3/w==\n", "N0WGgOZHTfU=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        try {
            this.f73.onFormResubmission(webView, message, message2);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("umbeEBmC3RbfefgdJ8vHDJp6yQ1Lzdo+kGbBLQ7RwRqSfd8MAs3a\n", "/xSsf2uitHg=\n"), th, false);
        }
        try {
            WebViewClient webViewClient = this.f74;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        } catch (Error e) {
            AbstractC0356.m204(f72, StringFog.decrypt("jiFkB8EUnxnrPHgu3EabJa4gYwreXYUEojx4\n", "y1MWaLM09nc=\n"), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        try {
            this.f73.onLoadResource(webView, str);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("c+elTGCjoBMW+INBXuq6CVP7slEy7KcxWfSzcXfwpghE9rI=\n", "NpXXIxKDyX0=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        try {
            this.f73.onPageCommitVisible(webView, str);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("CSgqe6veB2xsNwx2lZcddik0PWb5kQBSLT09R62fHHYpPg==\n", "TFpYFNn+bgI=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        try {
            this.f73.onPageFinished(webView, str);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("cU5TMKrA/4gUUXU9lInlklFSRC34j/i2VVtEGbGO/5VcWUU=\n", "NDwhX9jgluY=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            this.f73.onPageStarted(webView, str, bitmap);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("bYZ6Xy5u7McImVxSECf23U2abUJ8Iev5SZNtYygv991NkA==\n", "KPQIMFxOhak=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            this.f73.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("ayduzC76YA4OOEjBELN6FEs7edF8tWcySzZ5yiq/bSNCPHnNKJlsEloHedIpv3oU\n", "LlUco1zaCWA=\n"), th, false);
        }
        try {
            WebViewClient webViewClient = this.f74;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Throwable th2) {
            AbstractC0356.m204(f72, StringFog.decrypt("1/8eGCt30hWy7g0bNT7VHLLiHh4+PtVb/eM+Ejoy0g336S8bMDLVD9HoHgMLMsoO9/4Y\n", "ko1sd1lXu3s=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f73.onReceivedError(webView, i, str, str2);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("QjzU6NBFXsYnI/Ll7gxE3GIgw/WCCln6Yi3D7tQAU+11PMn1\n", "B06mh6JlN6g=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        try {
            this.f73.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("FItVamAaPqNxlHNnXlMkuTSXQncyVTmfNJpCbGRfM4UljVdEZ04/nzSIUmBhTg==\n", "UfknBRI6V80=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f73.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("lF82YW8apHXxQBBsUVO+b7RDIXw9VaNJtE4hZ2tfqVOlWTRLb0iiaQ==\n", "0S1EDh06zRs=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        try {
            this.f73.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("hlZdZvJ086LjSXtrzD3puKZKSnugO/SepkdKYPYx/oCsQ0Zn0jHruaZXWw==\n", "wyQvCYBUmsw=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            this.f73.onReceivedSslError(webView, sslErrorHandler, sslError);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("1N5nDU604A+xwUEAcP36FfTCcBAc++cz9M9wC0rx7TLiwFAQTvv7\n", "kawVYjyUiWE=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            this.f73.onRenderProcessGone(webView, renderProcessGoneDetail);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("nzFeWpZQN+H6LnhXqBkt+78tSUfEHzDdvy1IUJYgLOC5Jl9Gox8w6g==\n", "2kMsNeRwXo8=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        try {
            this.f73.onScaleChanged(webView, f, f2);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("RQpGZ4PGuMggFWBqvY+i0mUWUXrRib/1YxlYbbKOsMhnHVA=\n", "AHg0CPHm0aY=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        try {
            this.f73.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("scKQWscOPr3U3bZX+Uckp5Heh0eVQTmHm9+vVNtXBbaQ2ZBQ1lok\n", "9LDiNbUuV9M=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f73.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("7GUaGYbor2GJejwUuKG1e8x5DQTUp6hax38JGJCko2vichEzgq2oew==\n", "qRdodvTIxg8=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            this.f73.shouldInterceptRequest(webView, str);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("286niDGkolW+0YGFD+24T/vSsJVj96NU69Cxri3wrkn92aWTEeG6TvvPoQ==\n", "nrzV50OEyzs=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f73.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("MK3Il+uPLUlVsu6a1cY3UxCx34q53CxIALPet+/KNlUcu9+z/NYBURCxzg==\n", "dd+6+JmvRCc=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m57(webView, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0001, B:11:0x002c, B:14:0x003b, B:16:0x003e, B:18:0x0011, B:21:0x001d), top: B:2:0x0001 }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0823
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo55(C1102 c1102, String str, ArrayList arrayList, C0683 c0683, C0950 c0950) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            AbstractC0962.m595(c1102.m651(), AbstractC1133.m662("lA==\n", "s78PlCikujI=\n", AbstractC1072.m642("sOrEU1C00JOc9NMcR+zCmIDs31JFtPCel87fWVXXy5KQ9sJ4R/fIiZTs2U4C+saPnO7THE/x05Oa\n/JYb\n", "9Zi2PCKUp/s=\n", new StringBuilder(), str)), e, null);
        }
        if (hashCode != 368095040) {
            if (hashCode == 381550901 && str.equals(f71)) {
                c = 0;
                if (c != 0) {
                    return this.f74;
                }
                if (c == 1) {
                    return this.f73;
                }
                new C0315(c1102, c0950, f72, str).m277(c1102.m651());
                return null;
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals(f70)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m56(webView, webResourceRequest, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f73.onReceivedError(webView, webResourceRequest, webResourceError);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("7nYlKCA54ReLaQMlHnD7Dc5qMjVyduYrzmcyLiR87DzZdjg1\n", "qwRXR1IZiHk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            this.f73.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("u4Ys9KPpVcLemQr5naBP2JuaO+nxulTDi5g60r+9Wd6dkS7vg6xN2ZuHKg==\n", "/vRem9HJPKw=\n"), th, false);
        }
        WebViewClient webViewClient = this.f74;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m56(WebView webView, WebResourceRequest webResourceRequest, boolean z) {
        try {
            if (this.f73.shouldOverrideUrlLoading(webView, webResourceRequest) || z) {
                WebViewClient webViewClient = this.f74;
                if (webViewClient instanceof C) {
                    ((C) webViewClient).m56(webView, webResourceRequest, true);
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("kmHwPKGDo5j3ftYxn8q5grJ95yHz0KKZon/mHKXGuIS+d+cGoc+GmbZ36z20i7iTpmbnIKeK\n", "1xOCU9OjyvY=\n"), th, false);
        }
        WebViewClient webViewClient2 = this.f74;
        if (webViewClient2 != null) {
            try {
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (Throwable th2) {
                AbstractC0356.m204(f72, StringFog.decrypt("2cyh/d0nitS805zgxmCK1N/SuvfBc8PJ9NGm/stIld/uzLr2ylKR1tDRsvbGaYSS7tui58p0l5M=\n", "nL7Tkq8H47o=\n"), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m57(WebView webView, String str, boolean z) {
        try {
            if (this.f73.shouldOverrideUrlLoading(webView, str) || z) {
                WebViewClient webViewClient = this.f74;
                if (webViewClient instanceof C) {
                    ((C) webViewClient).m57(webView, str, true);
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC0356.m204(f72, StringFog.decrypt("4yP9D6fJ0qeGPNsCmYDIvcM/6hL1mtOm0z3rL6OMybvPNeo1p4X3psc15g6ywc67yng=\n", "plGPYNXpu8k=\n"), th, false);
        }
        WebViewClient webViewClient2 = this.f74;
        if (webViewClient2 != null && !webViewClient2.getClass().equals(WebViewClient.class)) {
            try {
                return this.f74.shouldOverrideUrlLoading(webView, str);
            } catch (Throwable th2) {
                AbstractC0356.m204(f72, StringFog.decrypt("PQmXxL9nW6xYFqrZpCBbrDsXjM6jMxKxEBSQx6kIRKcKCYzPqBJArjQUhM+kKVXqDQmJgg==\n", "eHvlq81HMsI=\n"), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
