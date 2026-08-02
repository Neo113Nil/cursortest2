package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* loaded from: classes12.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ WebView a;

    public o0(WebView webView) {
        this.a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getSettings().setDisplayZoomControls(false);
    }
}
