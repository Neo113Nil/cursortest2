package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
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
