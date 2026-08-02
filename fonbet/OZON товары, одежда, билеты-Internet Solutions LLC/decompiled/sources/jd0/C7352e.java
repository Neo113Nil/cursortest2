package jd0;

import C.o0;
import Kb0.K;
import Sc.InterfaceC4008j;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.core.FeatureFlagConf;
import xe.C10727i;

/* renamed from: jd0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7352e extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f69748a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<Unit> f69749b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f69750c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f69751d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f69752e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69753f;

    /* renamed from: jd0.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f69754a;

        /* renamed from: b, reason: collision with root package name */
        private final String f69755b;

        /* renamed from: c, reason: collision with root package name */
        private final String f69756c;

        /* renamed from: d, reason: collision with root package name */
        private final String f69757d;

        public a(String str, String str2, String str3, String str4) {
            this.f69754a = str;
            this.f69755b = str2;
            this.f69756c = str3;
            this.f69757d = str4;
        }

        public final String a() {
            return this.f69755b;
        }

        public final String b() {
            return this.f69756c;
        }

        public final String c() {
            return this.f69754a;
        }

        public final String d() {
            return this.f69757d;
        }

        @NotNull
        public final s.d e() {
            return new s.d(this.f69754a, this.f69755b, this.f69756c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f69754a, aVar.f69754a) && Intrinsics.d(this.f69755b, aVar.f69755b) && Intrinsics.d(this.f69756c, aVar.f69756c) && Intrinsics.d(this.f69757d, aVar.f69757d);
        }

        public final int hashCode() {
            String str = this.f69754a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f69755b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f69756c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f69757d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OzonIdWebViewError(requestUrl=");
            sb2.append(this.f69754a);
            sb2.append(", errorCode=");
            sb2.append(this.f69755b);
            sb2.append(", errorDescription=");
            sb2.append(this.f69756c);
            sb2.append(", traceId=");
            return o0.c(sb2, this.f69757d, ")");
        }
    }

    /* renamed from: jd0.e$b */
    public static final class b extends Lf.a {

        /* renamed from: b, reason: collision with root package name */
        private final WebView f69758b;

        /* renamed from: c, reason: collision with root package name */
        private final WebResourceRequest f69759c;

        /* renamed from: d, reason: collision with root package name */
        private final WebResourceResponse f69760d;

        b(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super(1);
            this.f69758b = webView;
            this.f69759c = webResourceRequest;
            this.f69760d = webResourceResponse;
        }

        public final WebResourceResponse E0() {
            return this.f69760d;
        }

        public final WebResourceRequest H0() {
            return this.f69759c;
        }

        public final WebView L0() {
            return this.f69758b;
        }
    }

    /* renamed from: jd0.e$c */
    static final class c extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f69761b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FeatureFlagConf featureFlagConf = (FeatureFlagConf) C10727i.d(kotlin.coroutines.g.f71771a, new C7353f(2, null));
            return Boolean.valueOf(featureFlagConf != null ? featureFlagConf.getWebViewForceCastHttpInHttps() : true);
        }
    }

    public C7352e(@NotNull Function1<? super String, Unit> onInterceptUrl, Function0<Unit> function0, Function1<? super a, Unit> function1, Function1<? super a, Unit> function12) {
        Intrinsics.checkNotNullParameter(onInterceptUrl, "onInterceptUrl");
        this.f69748a = onInterceptUrl;
        this.f69749b = function0;
        this.f69750c = function1;
        this.f69751d = function12;
        this.f69753f = Sc.k.b(c.f69761b);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Function0<Unit> function0;
        if (this.f69752e || (function0 = this.f69749b) == null) {
            return;
        }
        ((j) function0).invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f69752e = false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ?? r42;
        CharSequence description;
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || (r42 = this.f69750c) == 0) {
            return;
        }
        this.f69752e = true;
        Uri url = webResourceRequest.getUrl();
        r42.invoke(new a(url != null ? url.toString() : null, webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()).toString() : null, (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString(), null));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) {
        ?? r52;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        b bVar = new b(view, request, errorResponse);
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        if (k11.X().h().getValue().h(bVar.L0(), bVar.H0(), bVar.E0()) || !request.isForMainFrame() || (r52 = this.f69750c) == 0) {
            return;
        }
        Uri url = request.getUrl();
        String uri = url != null ? url.toString() : null;
        String valueOf = String.valueOf(errorResponse.getStatusCode());
        String reasonPhrase = errorResponse.getReasonPhrase();
        Intrinsics.checkNotNullParameter(errorResponse, "<this>");
        a aVar = new a(uri, valueOf, reasonPhrase, errorResponse.getResponseHeaders().get("x-o3-trace-id"));
        this.f69752e = true;
        r52.invoke(aVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        ?? r42 = this.f69750c;
        if (r42 != 0) {
            a aVar = new a(sslError != null ? sslError.getUrl() : null, sslError != null ? Integer.valueOf(sslError.getPrimaryError()).toString() : null, "SSL error", null);
            this.f69752e = true;
            r42.invoke(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        a aVar = new a(webView != null ? webView.getUrl() : null, null, "Render Process Gone Error", null);
        ?? r12 = this.f69751d;
        if (r12 != 0) {
            r12.invoke(aVar);
        }
        this.f69752e = true;
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String uri;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null) {
            return false;
        }
        shouldOverrideUrlLoading(webView, uri);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        boolean a11 = C7354g.a(str);
        ?? r02 = this.f69748a;
        if (!a11) {
            if (((Boolean) this.f69753f.getValue()).booleanValue()) {
                if (str == null || (parse = Uri.parse(str)) == null) {
                    str = null;
                } else {
                    if (Intrinsics.d(parse.getScheme(), "http")) {
                        parse = parse.buildUpon().scheme("https").build();
                        Intrinsics.f(parse);
                    }
                    str = parse.toString();
                }
            }
            if (str != null) {
                r02.invoke(str);
            }
        } else if (str != null) {
            r02.invoke(str);
            return true;
        }
        return true;
    }
}
