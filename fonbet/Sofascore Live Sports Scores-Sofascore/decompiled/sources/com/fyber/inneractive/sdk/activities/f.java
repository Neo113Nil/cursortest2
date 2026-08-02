package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f extends WebChromeClient {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.a.setTitle("Page is Loading...");
        this.a.setProgress(i * 100);
        if (i == 100) {
            this.a.setTitle(webView.getUrl());
        }
    }
}
