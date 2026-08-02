package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import defpackage.n55;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n55
    public final void d() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g) obj).a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.a);
                break;
            default:
                WebView webView = (WebView) obj;
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                    break;
                }
                break;
        }
    }
}
