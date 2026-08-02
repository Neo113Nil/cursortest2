package defpackage;

import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.sofascore.results.R;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ycd extends WebViewClientCompat {
    public static final ycd a = new ycd();
    public static final List b = b.j("http", HttpRequest.DEFAULT_SCHEME, "about", "data", "blob", "market", "ws", "wss");
    public static final s84 c = s84.y;

    public static boolean a(WebView webView, Uri uri) {
        String str;
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (CollectionsKt.R(b, str)) {
                Object tag = webView.getTag(R.id.controller);
                xdi xdiVar = tag instanceof xdi ? (xdi) tag : null;
                if (xdiVar == null || !xdiVar.p(uri)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        Object tag = webView.getTag(R.id.controller);
        xdi xdiVar = tag instanceof xdi ? (xdi) tag : null;
        if (xdiVar != null) {
            w3a.J(webView, xdiVar.k == 0);
            lcd lcdVar = xdiVar.l;
            if (xdiVar.a == 1) {
                xdiVar.b(zf.a);
                if (lcdVar.getExposure() > 0) {
                    xdiVar.o();
                } else {
                    s9a.I(lcdVar);
                }
            }
        }
    }

    @Override // androidx.webkit.WebViewClientCompat
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, k0l k0lVar) {
        webView.getClass();
        webResourceRequest.getClass();
        k0lVar.getClass();
        if (y0l.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
            cjb.a(((Object) k0lVar.a()) + " : " + webResourceRequest.getUrl());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        Object tag = webView.getTag(R.id.controller);
        xdi xdiVar = tag instanceof xdi ? (xdi) tag : null;
        if (xdiVar == null) {
            return true;
        }
        xdiVar.c(new qcd(6, "WebView render process gone", null));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        if (!StringsKt.J(uri, "https://local.adsbynimbus.com", false)) {
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        WebResourceResponse p = w3a.p(webView, uri);
        return p == null ? (WebResourceResponse) c.invoke(uri) : p;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        return a(webView, str != null ? Uri.parse(str) : null);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return a(webView, webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        webView.getClass();
        if (str == null) {
            return null;
        }
        if (!StringsKt.J(str, "https://local.adsbynimbus.com", false)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        WebResourceResponse p = w3a.p(webView, str);
        return p == null ? (WebResourceResponse) c.invoke(str) : p;
    }
}
