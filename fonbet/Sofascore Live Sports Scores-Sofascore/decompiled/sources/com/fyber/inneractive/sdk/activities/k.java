package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.a.e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.a.e.goForward();
    }
}
