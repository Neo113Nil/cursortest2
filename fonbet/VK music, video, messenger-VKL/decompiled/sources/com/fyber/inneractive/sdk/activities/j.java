package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* loaded from: classes12.dex */
public final class j implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.a.e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.a.e.goBack();
    }
}
