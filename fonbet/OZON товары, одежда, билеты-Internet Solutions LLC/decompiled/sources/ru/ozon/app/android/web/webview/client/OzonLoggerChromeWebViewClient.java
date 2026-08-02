package ru.ozon.app.android.web.webview.client;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/web/webview/client/OzonLoggerChromeWebViewClient;", "Landroid/webkit/WebChromeClient;", "webViewErrorLogger", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "<init>", "(Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OzonLoggerChromeWebViewClient extends WebChromeClient {

    @NotNull
    private final WebViewErrorLogger webViewErrorLogger;

    public OzonLoggerChromeWebViewClient(@NotNull WebViewErrorLogger webViewErrorLogger) {
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.webViewErrorLogger = webViewErrorLogger;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.webViewErrorLogger.logErrorInWebView(consoleMessage);
        return super.onConsoleMessage(consoleMessage);
    }
}
