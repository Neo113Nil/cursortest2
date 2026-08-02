package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;

/* loaded from: classes8.dex */
public class a extends AdSessionStatePublisher {
    public a(String str, WebView webView) {
        super(str);
        if (webView != null) {
            com.iab.omid.library.vungle.webviewclient.a.a(webView);
        }
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
