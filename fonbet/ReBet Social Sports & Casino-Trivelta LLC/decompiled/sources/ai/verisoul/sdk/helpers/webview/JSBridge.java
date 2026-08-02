package ai.verisoul.sdk.helpers.webview;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lai/verisoul/sdk/helpers/webview/JSBridge;", "", "webViewInitCallback", "Lai/verisoul/sdk/helpers/webview/WebViewInitCallback;", "(Lai/verisoul/sdk/helpers/webview/WebViewInitCallback;)V", "verisoulHandler", "", "message", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JSBridge {

    @NotNull
    private final WebViewInitCallback webViewInitCallback;

    public JSBridge(@NotNull WebViewInitCallback webViewInitCallback) {
        Intrinsics.checkNotNullParameter(webViewInitCallback, "webViewInitCallback");
        this.webViewInitCallback = webViewInitCallback;
    }

    @JavascriptInterface
    public final void verisoulHandler(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        new JSONObject(message);
        try {
            this.webViewInitCallback.onInit();
        } catch (Exception e10) {
            this.webViewInitCallback.onFailure(e10);
        }
    }
}
