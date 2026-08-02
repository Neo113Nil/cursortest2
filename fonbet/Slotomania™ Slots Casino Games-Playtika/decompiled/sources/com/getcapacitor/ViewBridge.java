package com.getcapacitor;

import android.content.Context;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;

/* loaded from: classes5.dex */
public interface ViewBridge {
    void addJavascriptInterface(MessageHandler messageHandler, String str);

    boolean canGoBack();

    void configure(WebChromeClient webChromeClient, WebViewClient webViewClient, JSInjector jSInjector);

    void configureCookieManager(CookieManager cookieManager);

    void destroy();

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    Context getContext();

    String getUrl();

    View getView();

    void goBack();

    boolean hasFileServer();

    void initWebView(CapConfig capConfig, boolean z);

    void loadUrl(String str);

    boolean performHapticFeedback(int i);

    boolean post(Runnable runnable);

    void reload(JSInjector jSInjector);

    void setPaused(boolean z);
}
