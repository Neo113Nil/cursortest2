package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B extends AbstractViewOnLayoutChangeListenerC3987z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractViewOnLayoutChangeListenerC3987z
    /* renamed from: ﾇ */
    public final Object mo54(WebView webView) {
        Rect rect = AbstractC3964b.f132;
        WebView webView2 = webView;
        while (webView2.getParent() instanceof View) {
            webView2 = (View) webView2.getParent();
        }
        return webView2;
    }
}
