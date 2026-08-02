package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
