package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import defpackage.xka;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s extends xka implements Function0 {
    public final /* synthetic */ WebView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WebView webView) {
        super(0);
        this.a = webView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        a.append(webView != null ? webView.getUrl() : null);
        return a.toString();
    }
}
