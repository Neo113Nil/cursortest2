package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import defpackage.xka;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n extends xka implements Function0 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ WebViewRenderProcess b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.a = webView;
        this.b = webViewRenderProcess;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessUnresponsive(Title = ");
        a.append(this.a.getTitle());
        a.append(", URL = ");
        a.append(this.a.getOriginalUrl());
        a.append(", (webViewRenderProcess != null) = ");
        a.append(this.b != null);
        return a.toString();
    }
}
