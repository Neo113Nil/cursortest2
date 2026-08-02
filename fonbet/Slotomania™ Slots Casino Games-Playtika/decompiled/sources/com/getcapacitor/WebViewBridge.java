package com.getcapacitor;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public class WebViewBridge implements ViewBridge {
    private final WebView webView;

    @Override // com.getcapacitor.ViewBridge
    public boolean hasFileServer() {
        return true;
    }

    @Override // com.getcapacitor.ViewBridge
    public void reload(JSInjector jSInjector) {
    }

    public WebViewBridge(WebView webView) {
        this.webView = webView;
    }

    @Override // com.getcapacitor.ViewBridge
    public View getView() {
        return this.webView;
    }

    @Override // com.getcapacitor.ViewBridge
    public void configureCookieManager(CookieManager cookieManager) {
        CookieManager.setAcceptFileSchemeCookies(true);
        cookieManager.setAcceptThirdPartyCookies(this.webView, true);
    }

    @Override // com.getcapacitor.ViewBridge
    public void initWebView(CapConfig capConfig, boolean z) {
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (capConfig.getBoolean("android.allowMixedContent", false)) {
            settings.setMixedContentMode(0);
        }
        String string = capConfig.getString("android.appendUserAgent", capConfig.getString("appendUserAgent", null));
        if (string != null) {
            settings.setUserAgentString(settings.getUserAgentString() + ServerSentEventKt.SPACE + string);
        }
        String string2 = capConfig.getString("android.overrideUserAgent", capConfig.getString("overrideUserAgent", null));
        if (string2 != null) {
            settings.setUserAgentString(string2);
        }
        String string3 = capConfig.getString("android.backgroundColor", capConfig.getString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, null));
        if (string3 != null) {
            try {
                this.webView.setBackgroundColor(Color.parseColor(string3));
            } catch (IllegalArgumentException unused) {
                Logger.debug("WebView background color not applied");
            }
        }
        this.webView.requestFocusFromTouch();
        WebView.setWebContentsDebuggingEnabled(capConfig.getBoolean("android.webContentsDebuggingEnabled", z));
    }

    @Override // com.getcapacitor.ViewBridge
    public void loadUrl(String str) {
        this.webView.loadUrl(str);
    }

    @Override // com.getcapacitor.ViewBridge
    public void setPaused(boolean z) {
        if (z) {
            this.webView.onPause();
            this.webView.pauseTimers();
        } else {
            this.webView.onResume();
            this.webView.resumeTimers();
        }
    }

    @Override // com.getcapacitor.ViewBridge
    public boolean performHapticFeedback(int i) {
        return this.webView.performHapticFeedback(i);
    }

    @Override // com.getcapacitor.ViewBridge
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.webView.evaluateJavascript(str, null);
    }

    @Override // com.getcapacitor.ViewBridge
    public boolean canGoBack() {
        return this.webView.canGoBack();
    }

    @Override // com.getcapacitor.ViewBridge
    public void goBack() {
        this.webView.goBack();
    }

    @Override // com.getcapacitor.ViewBridge
    public Context getContext() {
        return this.webView.getContext();
    }

    @Override // com.getcapacitor.ViewBridge
    public String getUrl() {
        return this.webView.getUrl();
    }

    @Override // com.getcapacitor.ViewBridge
    public boolean post(Runnable runnable) {
        return this.webView.post(runnable);
    }

    @Override // com.getcapacitor.ViewBridge
    public void configure(WebChromeClient webChromeClient, WebViewClient webViewClient, JSInjector jSInjector) {
        this.webView.setWebChromeClient(webChromeClient);
        this.webView.setWebViewClient(webViewClient);
    }

    @Override // com.getcapacitor.ViewBridge
    public void destroy() {
        this.webView.removeAllViews();
        this.webView.destroy();
    }

    @Override // com.getcapacitor.ViewBridge
    public void addJavascriptInterface(MessageHandler messageHandler, String str) {
        this.webView.addJavascriptInterface(messageHandler, str);
    }
}
