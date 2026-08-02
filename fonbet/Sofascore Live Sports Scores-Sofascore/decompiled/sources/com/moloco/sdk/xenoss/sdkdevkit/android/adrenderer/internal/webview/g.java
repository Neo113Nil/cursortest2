package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.webkit.WebView;
import com.ironsource.V2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import defpackage.av8;
import defpackage.bkh;
import defpackage.ct8;
import defpackage.f1d;
import defpackage.nf3;
import defpackage.ns8;
import defpackage.of3;
import defpackage.td4;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements ct8 {
    public final /* synthetic */ ns8 a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f1d d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ t h;

    public g(ns8 ns8Var, WebView webView, int i, f1d f1dVar, Function1 function1, t tVar, Function0 function0, Function0 function02) {
        this.a = ns8Var;
        this.b = webView;
        this.c = i;
        this.d = f1dVar;
        this.e = function1;
        this.f = function0;
        this.g = function02;
        this.h = tVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(rVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        if (rVar instanceof n) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.e0(1828522999);
            av8Var2.s(false);
        } else if (rVar instanceof p) {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.e0(1828585495);
            av8Var3.s(false);
        } else if (rVar instanceof o) {
            av8 av8Var4 = (av8) of3Var;
            av8Var4.e0(-1880673267);
            s.j(((o) rVar).a, null, null, bkh.c, av8Var4, V2.b.f);
            av8Var4.s(false);
        } else if (rVar instanceof q) {
            av8 av8Var5 = (av8) of3Var;
            av8Var5.e0(-1880663763);
            av8Var5.e0(-1880662328);
            ns8 ns8Var = this.a;
            boolean g = av8Var5.g(ns8Var) | av8Var5.g(this.b) | av8Var5.e(this.c) | av8Var5.g(this.d) | av8Var5.g(this.e) | av8Var5.g(this.f) | av8Var5.g(this.g) | av8Var5.g(this.h);
            Object O = av8Var5.O();
            if (g || O == nf3.a) {
                b bVar = new b(ns8Var, this.b, this.c, this.d, this.e, this.h, this.f, this.g);
                av8Var5.n0(bVar);
                O = bVar;
            }
            av8Var5.s(false);
            td4.a((Function1) O, null, null, av8Var5, 0, 6);
            av8Var5.s(false);
        } else {
            if (rVar != null) {
                av8 av8Var6 = (av8) of3Var;
                av8Var6.e0(-1880678788);
                av8Var6.s(false);
                zzl.b();
                return null;
            }
            av8 av8Var7 = (av8) of3Var;
            av8Var7.e0(1829836035);
            av8Var7.s(false);
        }
        return Unit.a;
    }
}
