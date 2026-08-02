package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.dmi;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.gdi;
import defpackage.jof;
import defpackage.un0;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends WebViewClientCompat {
    public final ad2 a;
    public final z b;
    public final n c;
    public final fdi d;
    public final fdi e;
    public final fdi f;
    public final jof g;
    public final fdi h;
    public final jof i;
    public final aeh j;
    public final aeh k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a l;

    public d(ad2 ad2Var, z zVar, n nVar) {
        zVar.getClass();
        nVar.getClass();
        this.a = ad2Var;
        this.b = zVar;
        this.c = nVar;
        Boolean bool = Boolean.FALSE;
        fdi a = gdi.a(bool);
        this.d = a;
        this.e = a;
        fdi a2 = gdi.a(bool);
        this.f = a2;
        this.g = un0.u(a2);
        fdi a3 = gdi.a(null);
        this.h = a3;
        this.i = un0.u(a3);
        aeh b = beh.b(0, 0, null, 7);
        this.j = b;
        this.k = b;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = this.d;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        fdi fdiVar2 = this.f;
        fdiVar2.getClass();
        fdiVar2.m(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        g gVar = g.c;
        fdi fdiVar = this.h;
        fdiVar.getClass();
        fdiVar.m(null, gVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", dmi.q("onReceivedError ", str), null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        g gVar = g.d;
        fdi fdiVar = this.h;
        fdiVar.getClass();
        fdiVar.m(null, gVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (str == null || (aVar = this.l) == null) {
            return true;
        }
        xw3.L(this.a, null, null, new fdl(this, str, aVar, null, 12), 3);
        return true;
    }
}
