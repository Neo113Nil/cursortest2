package xe;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public kh.g f25458a;

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.fragment.app.Fragment, ue.e] */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ?? r12;
        super.onPageFinished(webView, str);
        kh.g gVar = this.f25458a;
        if (gVar == null || (r12 = (Fragment) gVar.f19115b) == 0) {
            return;
        }
        r12.w(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f25458a == null || sslErrorHandler == null) {
            return;
        }
        sslErrorHandler.proceed();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, ue.e] */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        kh.g gVar = this.f25458a;
        if (gVar == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        ?? r02 = (Fragment) gVar.f19115b;
        if (r02 != 0) {
            return r02.h(view, request);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, ue.e] */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        kh.g gVar = this.f25458a;
        if (gVar == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r02 = (Fragment) gVar.f19115b;
        if (r02 != 0) {
            return r02.i(view, url);
        }
        return false;
    }
}
