package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.internal.model.h0;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v extends xka implements Function0 {
    public final /* synthetic */ z a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, WebView webView, String str) {
        super(0);
        this.a = zVar;
        this.b = webView;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object u2gVar;
        h0 h0Var;
        WebView webView = this.b;
        String str = this.c;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = null;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
                u2gVar = Unit.a;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        z zVar = this.a;
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Evaluate js failed ");
            a2.append(a.getLocalizedMessage());
            EvaluateJsError evaluateJsError = new EvaluateJsError(a2.toString());
            h0Var = zVar.a;
            evaluateJsError.setLogEntry$vungle_ads_release(h0Var.q()).logErrorNoReturnValue$vungle_ads_release();
        }
        return Unit.a;
    }
}
