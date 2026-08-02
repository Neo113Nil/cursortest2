package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* loaded from: classes12.dex */
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
