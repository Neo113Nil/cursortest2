package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.webkit.WebView;
import com.facebook.appevents.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import defpackage.av8;
import defpackage.e1d;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.hz8;
import defpackage.mqi;
import defpackage.nf3;
import defpackage.of3;
import defpackage.os8;
import defpackage.p75;
import defpackage.rq3;
import defpackage.yqo;
import defpackage.yso;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ f1d c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ t j;
    public final /* synthetic */ p75 k;
    public final /* synthetic */ boolean l;

    public /* synthetic */ h(WebView webView, f1d f1dVar, int i, Function1 function1, Function0 function0, Function0 function02, long j, Function2 function2, t tVar, p75 p75Var, boolean z, int i2) {
        this.a = i2;
        this.b = webView;
        this.c = f1dVar;
        this.d = i;
        this.e = function1;
        this.f = function0;
        this.g = function02;
        this.h = j;
        this.i = function2;
        this.j = tVar;
        this.k = p75Var;
        this.l = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        break;
                    }
                }
                av8 av8Var2 = (av8) of3Var;
                av8Var2.e0(1335704684);
                Object O = av8Var2.O();
                Object obj3 = nf3.a;
                if (O == obj3) {
                    mqi mqiVar = com.moloco.sdk.service_locator.i.a;
                    O = new q();
                    av8Var2.n0(O);
                }
                q qVar = (q) O;
                av8Var2.s(false);
                av8Var2.e0(1335709510);
                WebView webView = this.b;
                boolean g = av8Var2.g(webView);
                Object O2 = av8Var2.O();
                if (g || O2 == obj3) {
                    qVar.getClass();
                    O2 = i0.c(yso.r(new fdl(webView, qVar, (rq3) null, 10)));
                    av8Var2.n0(O2);
                }
                z88 z88Var = (z88) O2;
                av8Var2.s(false);
                av8Var2.e0(1335714159);
                Object O3 = av8Var2.O();
                Object obj4 = this.c;
                if (O3 == obj3) {
                    O3 = androidx.compose.runtime.e.f(((fdi) obj4).getValue());
                    av8Var2.n0(O3);
                }
                e1d e1dVar = (e1d) O3;
                av8Var2.s(false);
                Unit unit = Unit.a;
                av8Var2.e0(1335717996);
                boolean g2 = av8Var2.g(e1dVar) | av8Var2.g(obj4);
                Object O4 = av8Var2.O();
                if (g2 || O4 == obj3) {
                    O4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(e1dVar, obj4, null, 20);
                    av8Var2.n0(O4);
                }
                av8Var2.s(false);
                hz8.o(av8Var2, unit, (Function2) O4);
                j.j(webView, this.d, e1dVar, this.e, this.f, this.g, null, this.h, (os8) this.i.invoke(av8Var2, 0), this.j, this.k.a, this.l, z88Var, av8Var2, 384);
            default:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, yqo.y(-101529568, of3Var2, new h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, 0)), of3Var2, 48);
        }
        return Unit.a;
    }
}
