package com.playtika.pras.c;

import android.webkit.WebView;

/* loaded from: classes7.dex */
public final class c implements Runnable {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ String b;

    public c(WebView webView, String str) {
        this.a = webView;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.evaluateJavascript(this.b, null);
    }
}
