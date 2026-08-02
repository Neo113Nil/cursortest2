package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.b10;
import defpackage.beh;
import defpackage.ddi;
import defpackage.jof;
import defpackage.un0;
import defpackage.weh;
import defpackage.xdh;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public final Function0 a;
    public final ad2 b;
    public final WebView c;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k d;
    public final b10 e;
    public final aeh f;
    public final aeh g;
    public final jof h;

    public o(com.moloco.sdk.internal.publisher.nativead.b bVar, ad2 ad2Var, WebView webView, xdh xdhVar) {
        webView.getClass();
        xdhVar.getClass();
        this.a = bVar;
        this.b = ad2Var;
        this.c = webView;
        this.d = null;
        this.e = new b10(0, ad2Var);
        aeh b = beh.b(0, 0, null, 7);
        this.f = b;
        this.g = b;
        this.h = un0.K(new n(xdhVar, 0), ad2Var, weh.a, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        this.a.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final ddi l() {
        return (jof) this.e.d;
    }
}
