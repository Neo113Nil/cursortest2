package ru.ozon.id.nativeauth.sso2;

import B0.A0;
import De.C2862e;
import Hb0.f;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.r;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import id0.C7050a;
import java.net.URI;
import java.util.Map;
import jd0.C7354g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.t;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fb0.f f97356a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<v> f97357b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.i> f97358c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f97359d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.B> f97360e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f97361f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2862e f97362g;

    public F() {
        throw null;
    }

    public F(Fb0.f ozonIdConfig, InterfaceC4008j sso2ReauthorizeHandler, InterfaceC4008j sso2MobileConfigRepository, InterfaceC4008j composerTrackingRepository, InterfaceC4008j ozonIdTrackingManager, InterfaceC4008j featureFlagsStore) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(sso2ReauthorizeHandler, "sso2ReauthorizeHandler");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f97356a = ozonIdConfig;
        this.f97357b = sso2ReauthorizeHandler;
        this.f97358c = sso2MobileConfigRepository;
        this.f97359d = composerTrackingRepository;
        this.f97360e = ozonIdTrackingManager;
        this.f97361f = featureFlagsStore;
        this.f97362g = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(WebView webView, String str) {
        this.f97357b.getValue().getClass();
        if (str == null) {
            str = "";
        }
        webView.loadData(A0.b("\n            <!DOCTYPE html>\n            <html lang=\"en\">\n            <head>\n                <meta charset=\"UTF-8\">\n                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                <title>Authorization Error</title>\n            </head>\n            <body>\n                <center>\n                  <h1>Authorization error</h1>\n                  <h2>", str, "</h2>\n                </center>\n            </body>\n            </html>\n        "), "text/html", "UTF-8");
    }

    public final void g(@NotNull WebView webView, @NotNull String url, @NotNull Map<String, String> additionalHttpHeaders) {
        Object a11;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
        if (!((Boolean) this.f97361f.getValue().b(f.o.f10813a)).booleanValue() || hd0.n.b(url)) {
            webView.loadUrl(url, additionalHttpHeaders);
            return;
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = URI.create(url).getHost();
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        String str = (String) a11;
        if (str == null) {
            webView.loadUrl(url, additionalHttpHeaders);
        } else if (C7354g.a(str)) {
            webView.loadUrl(url, additionalHttpHeaders);
        } else {
            C10727i.c(this.f97362g, null, null, new D(this, new t.c.d(str), webView, url, additionalHttpHeaders, null), 3);
        }
    }

    public final boolean h(@NotNull WebView webView, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) {
        String str;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        E e11 = new E(this, errorResponse, request, null);
        C2862e c2862e = this.f97362g;
        C10727i.c(c2862e, null, null, e11, 3);
        if (((Boolean) this.f97361f.getValue().b(f.o.f10813a)).booleanValue()) {
            Intrinsics.checkNotNullParameter(errorResponse, "<this>");
            if (errorResponse.getStatusCode() == 401 && (str = errorResponse.getResponseHeaders().get("x-o3-gdecision")) != null && str.length() != 0) {
                String uri = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                String host = request.getUrl().getHost();
                if (host != null) {
                    if (hd0.n.b(uri)) {
                        Intrinsics.checkNotNullParameter(errorResponse, "<this>");
                        String str2 = errorResponse.getResponseHeaders().get("x-o3-trace-id");
                        K k11 = Tb0.a.f26975d;
                        if (k11 == null) {
                            throw new Lb0.a();
                        }
                        k11.M().m().getValue().d(str2, null, false, true);
                        i(webView, str2);
                    } else {
                        Map<String, String> requestHeaders = request.getRequestHeaders();
                        Intrinsics.checkNotNullExpressionValue(requestHeaders, "getRequestHeaders(...)");
                        C10727i.c(c2862e, null, null, new D(this, new t.c.C2140c(host), webView, uri, requestHeaders, null), 3);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
