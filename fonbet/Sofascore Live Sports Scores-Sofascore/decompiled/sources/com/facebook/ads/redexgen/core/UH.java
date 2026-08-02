package com.facebook.ads.redexgen.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network/classes2.dex */
public class UH extends WebViewClient {
    public final /* synthetic */ UI A00;

    public UH(UI ui) {
        this.A00 = ui;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC2298ay.A0D(AbstractC2064Td.A2j);
        return true;
    }
}
