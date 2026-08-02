package com.getcapacitor;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes8.dex */
public class BridgeWebViewClient extends WebViewClient {
    private Bridge bridge;

    public BridgeWebViewClient(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewLocalServer localServer = this.bridge.getLocalServer();
        if (localServer != null) {
            return localServer.shouldInterceptRequest(webResourceRequest);
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.bridge.launchIntent(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.bridge.launchIntent(Uri.parse(str));
    }
}
