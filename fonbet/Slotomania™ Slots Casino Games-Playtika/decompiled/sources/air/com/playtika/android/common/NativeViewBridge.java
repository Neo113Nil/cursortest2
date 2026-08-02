package air.com.playtika.android.common;

import android.content.Context;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.getcapacitor.CapConfig;
import com.getcapacitor.JSInjector;
import com.getcapacitor.MessageHandler;
import com.getcapacitor.ViewBridge;

/* loaded from: classes5.dex */
public class NativeViewBridge implements ViewBridge {
    private final String JS_PROTOCOL = "javascript:";
    private final GameSurfaceView gameView;

    @Override // com.getcapacitor.ViewBridge
    public boolean canGoBack() {
        return false;
    }

    @Override // com.getcapacitor.ViewBridge
    public void configureCookieManager(CookieManager cookieManager) {
    }

    @Override // com.getcapacitor.ViewBridge
    public void destroy() {
    }

    @Override // com.getcapacitor.ViewBridge
    public void goBack() {
    }

    @Override // com.getcapacitor.ViewBridge
    public boolean hasFileServer() {
        return false;
    }

    @Override // com.getcapacitor.ViewBridge
    public boolean performHapticFeedback(int i) {
        return false;
    }

    public NativeViewBridge(GameSurfaceView gameSurfaceView) {
        this.gameView = gameSurfaceView;
    }

    @Override // com.getcapacitor.ViewBridge
    public View getView() {
        return this.gameView.view;
    }

    @Override // com.getcapacitor.ViewBridge
    public void initWebView(CapConfig capConfig, boolean z) {
        System.out.println("SM_V8::WebView::initWebView " + z);
    }

    @Override // com.getcapacitor.ViewBridge
    public void loadUrl(String str) {
        System.out.println("SM_V8::WebView::loadUrl " + str);
        if (str.startsWith("javascript:")) {
            this.gameView.executeScript(str.substring("javascript:".length()), null);
        }
    }

    @Override // com.getcapacitor.ViewBridge
    public void setPaused(boolean z) {
        System.out.println("SM_V8::WebView::setPaused " + z);
    }

    @Override // com.getcapacitor.ViewBridge
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.gameView.executeScript(str, valueCallback);
    }

    @Override // com.getcapacitor.ViewBridge
    public Context getContext() {
        return this.gameView.view.getContext();
    }

    @Override // com.getcapacitor.ViewBridge
    public String getUrl() {
        return "";
    }

    @Override // com.getcapacitor.ViewBridge
    public boolean post(Runnable runnable) {
        this.gameView.queueEvent(runnable);
        return true;
    }

    @Override // com.getcapacitor.ViewBridge
    public void reload(JSInjector jSInjector) {
        initialize(jSInjector);
    }

    @Override // com.getcapacitor.ViewBridge
    public void configure(WebChromeClient webChromeClient, WebViewClient webViewClient, JSInjector jSInjector) {
        initialize(jSInjector);
    }

    @Override // com.getcapacitor.ViewBridge
    public void addJavascriptInterface(MessageHandler messageHandler, String str) {
        this.gameView.setMessageHandler(messageHandler);
    }

    private void initialize(JSInjector jSInjector) {
        this.gameView.executeScript(jSInjector.getScriptString(), null, true);
    }
}
