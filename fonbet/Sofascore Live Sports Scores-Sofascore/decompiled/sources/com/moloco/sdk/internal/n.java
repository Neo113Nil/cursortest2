package com.moloco.sdk.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.sofascore.results.R;
import defpackage.a99;
import defpackage.av8;
import defpackage.d7e;
import defpackage.ddi;
import defpackage.haa;
import defpackage.hz8;
import defpackage.lfj;
import defpackage.mv1;
import defpackage.nf3;
import defpackage.of3;
import defpackage.os8;
import defpackage.r13;
import defpackage.s75;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.v8a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar, os8 os8Var, boolean z) {
        this.c = sVar;
        this.d = os8Var;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        tc3 c;
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                com.moloco.sdk.internal.ortb.model.l lVar = (com.moloco.sdk.internal.ortb.model.l) obj4;
                av8 av8Var = (av8) ((of3) obj);
                av8Var.e0(1846302992);
                if (this.b) {
                    c = null;
                } else {
                    float f = lVar.c;
                    long i2 = hz8.i(f, f);
                    mv1 a = r.a(lVar.d, lVar.e);
                    float f2 = lVar.b;
                    t3e t3eVar = new t3e(f2, f2, f2, f2);
                    long j = lVar.f;
                    long v = v8a.v(lVar.c);
                    v8a.l(v);
                    long E = v8a.E(1095216660480L & v, lfj.c(v) / 2.0f);
                    d7e t = haa.t(R.drawable.moloco_close, 0, av8Var);
                    long c2 = s75.c(i2, 0.45f);
                    r13 r13Var = lVar.g;
                    av8Var = av8Var;
                    c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.c(a, t3eVar, j, i2, E, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.g(t, c2, r13Var != null ? r13Var.a : r.b, av8Var, 4), (com.moloco.sdk.internal.ortb.model.h0) obj3, av8Var, 64);
                }
                av8Var.s(false);
                return c;
            default:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        return Unit.a;
                    }
                }
                ddi l = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) obj4).l();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) obj4;
                av8 av8Var3 = (av8) of3Var;
                av8Var3.e0(328190741);
                boolean g = av8Var3.g(sVar);
                Object O = av8Var3.O();
                a99 a99Var = nf3.a;
                if (g || O == a99Var) {
                    O = new com.moloco.sdk.internal.publisher.nativead.b(0, sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0, 8);
                    av8Var3.n0(O);
                }
                av8Var3.s(false);
                Function0 function0 = (Function0) ((KFunction) O);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) obj4;
                av8Var3.e0(328192462);
                boolean g2 = av8Var3.g(sVar2);
                Object O2 = av8Var3.O();
                if (g2 || O2 == a99Var) {
                    O2 = new com.moloco.sdk.internal.publisher.l0(1, sVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 4);
                    av8Var3.n0(O2);
                }
                av8Var3.s(false);
                f1.m(l, function0, (Function1) ((KFunction) O2), (os8) obj3, this.b, av8Var3, 0);
                return Unit.a;
        }
    }

    public n(boolean z, com.moloco.sdk.internal.ortb.model.l lVar, com.moloco.sdk.internal.ortb.model.h0 h0Var) {
        this.b = z;
        this.c = lVar;
        this.d = h0Var;
    }
}
