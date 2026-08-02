package ru.ozon.app.android.web.webview.client;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J&\u0010\u0013\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J&\u0010\u0016\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0019H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/web/webview/client/OzonLoggerWebViewClient;", "Landroid/webkit/WebViewClient;", "webViewErrorLogger", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "<init>", "(Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "onReceivedError", "", "view", "Landroid/webkit/WebView;", "errorCode", "", "description", "", "failingUrl", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OzonLoggerWebViewClient extends WebViewClient {

    @NotNull
    private final WebViewErrorLogger webViewErrorLogger;

    public OzonLoggerWebViewClient(@NotNull WebViewErrorLogger webViewErrorLogger) {
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.webViewErrorLogger = webViewErrorLogger;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        this.webViewErrorLogger.logErrorInWebView(failingUrl, Integer.valueOf(errorCode), description);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Uri url;
        super.onReceivedHttpError(view, request, errorResponse);
        this.webViewErrorLogger.logErrorInWebView((request == null || (url = request.getUrl()) == null) ? null : url.toString(), errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null, errorResponse != null ? errorResponse.getEncoding() : null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        super.onReceivedSslError(view, handler, error);
        this.webViewErrorLogger.logSslErrorInWebView(error != null ? error.getUrl() : null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        CharSequence description;
        Uri url;
        super.onReceivedError(view, request, error);
        WebViewErrorLogger webViewErrorLogger = this.webViewErrorLogger;
        String str = null;
        String uri = (request == null || (url = request.getUrl()) == null) ? null : url.toString();
        Integer valueOf = error != null ? Integer.valueOf(error.getErrorCode()) : null;
        if (error != null && (description = error.getDescription()) != null) {
            str = description.toString();
        }
        webViewErrorLogger.logErrorInWebView(uri, valueOf, str);
    }
}
