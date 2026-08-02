package com.vungle.ads.internal.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import defpackage.xka;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t extends xka implements Function0 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ RenderProcessGoneDetail b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super(0);
        this.a = webView;
        this.b = renderProcessGoneDetail;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        a.append(webView != null ? webView.getUrl() : null);
        a.append(", did crash: ");
        RenderProcessGoneDetail renderProcessGoneDetail = this.b;
        a.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        return a.toString();
    }
}
