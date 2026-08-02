package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K extends WebChromeClient {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ L f96;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f97 = false;

    public K(L l) {
        this.f96 = l;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f96.mo61(webView, str2);
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (i != 100 || this.f97) {
            return;
        }
        this.f97 = true;
        this.f96.mo60(webView);
    }
}
