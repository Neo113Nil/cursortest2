package ru.ozon.app.android.miniapp.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.web.webview.client.OzonLoggerChromeWebViewClient;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012$\u0010\b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR2\u0010\b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/miniapp/webview/MiniAppChromeWebClient;", "Lru/ozon/app/android/web/webview/client/OzonLoggerChromeWebViewClient;", "Lkotlin/Function2;", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "", "onShowFileChooserListener", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", "<init>", "(Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "Landroid/webkit/WebView;", "webView", "filePathCallback", "fileChooserParams", "", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Landroid/graphics/Bitmap;", "getDefaultVideoPoster", "()Landroid/graphics/Bitmap;", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Lkotlin/jvm/functions/Function2;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MiniAppChromeWebClient extends OzonLoggerChromeWebViewClient {

    @NotNull
    private final Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiniAppChromeWebClient(@NotNull Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener, @NotNull WebViewErrorLogger webViewErrorLogger) {
        super(webViewErrorLogger);
        Intrinsics.checkNotNullParameter(onShowFileChooserListener, "onShowFileChooserListener");
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.onShowFileChooserListener = onShowFileChooserListener;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    @Override // ru.ozon.app.android.web.webview.client.OzonLoggerChromeWebViewClient, android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        super.onConsoleMessage(consoleMessage);
        if (consoleMessage == null) {
            return true;
        }
        Log.d("MiniAppChromeWebClient", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        this.onShowFileChooserListener.invoke(filePathCallback, fileChooserParams);
        return true;
    }
}
