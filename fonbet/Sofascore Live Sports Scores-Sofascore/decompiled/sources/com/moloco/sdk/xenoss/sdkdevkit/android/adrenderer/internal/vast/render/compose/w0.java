package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.av8;
import defpackage.bkh;
import defpackage.ct8;
import defpackage.ft8;
import defpackage.g28;
import defpackage.gt8;
import defpackage.ht8;
import defpackage.nf3;
import defpackage.of3;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class w0 implements ct8 {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ ht8 b;
    public final /* synthetic */ ft8 c;
    public final /* synthetic */ gt8 d;
    public final /* synthetic */ ht8 e;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q f;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s g;

    public w0(f0 f0Var, ht8 ht8Var, ft8 ft8Var, gt8 gt8Var, ht8 ht8Var2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar) {
        this.a = f0Var;
        this.b = ht8Var;
        this.c = ft8Var;
        this.d = gt8Var;
        this.e = ht8Var2;
        this.f = qVar;
        this.g = sVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) obj;
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
        boolean z = rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
        f0 f0Var = this.a;
        if (z) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.e0(1864303375);
            com.moloco.sdk.internal.publisher.h0.k(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) rVar).a, f0Var != null ? f0Var.b : null, bkh.c, av8Var2, 384);
            av8Var2.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.e0(1864311092);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) rVar).a;
            Function0 function0 = f0Var != null ? f0Var.a : null;
            g28 g28Var = bkh.c;
            av8Var3.e0(1864322699);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar = this.g;
            boolean g = av8Var3.g(sVar);
            Object O = av8Var3.O();
            if (g || O == nf3.a) {
                com.moloco.sdk.internal.publisher.nativead.b bVar = new com.moloco.sdk.internal.publisher.nativead.b(0, sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "onReplay", "onReplay()V", 0, 19);
                av8Var3.n0(bVar);
                O = bVar;
            }
            av8Var3.s(false);
            s.l(eVar, function0, g28Var, this.b, this.c, this.d, this.e, this.f, (Function0) ((KFunction) O), av8Var3, 384);
            av8Var3.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) {
            av8 av8Var4 = (av8) of3Var;
            av8Var4.e0(1864325634);
            s.j(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) rVar).a, f0Var != null ? f0Var.c : null, this.d, bkh.c, av8Var4, 3072);
            av8Var4.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) {
            av8 av8Var5 = (av8) of3Var;
            av8Var5.e0(1959794654);
            av8Var5.s(false);
        } else {
            if (rVar != null) {
                av8 av8Var6 = (av8) of3Var;
                av8Var6.e0(1864302146);
                av8Var6.s(false);
                zzl.b();
                return null;
            }
            av8 av8Var7 = (av8) of3Var;
            av8Var7.e0(1959832970);
            av8Var7.s(false);
        }
        return Unit.a;
    }
}
