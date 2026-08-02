package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.internal.publisher.h0;
import defpackage.av8;
import defpackage.ddi;
import defpackage.ft8;
import defpackage.m12;
import defpackage.of3;
import defpackage.sea;
import defpackage.xtc;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements ft8 {
    public final /* synthetic */ xtc a;
    public final /* synthetic */ Function1 b;

    public b(xtc xtcVar, Function1 function1) {
        this.a = xtcVar;
        this.b = function1;
    }

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Function1 function1 = (Function1) obj2;
        ddi ddiVar = (ddi) obj3;
        of3 of3Var = (of3) obj4;
        int intValue = ((Number) obj5).intValue();
        ((m12) obj).getClass();
        function1.getClass();
        if (ddiVar != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) sea.l(ddiVar, of3Var, 0).getValue();
            boolean z = rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p;
            xtc xtcVar = this.a;
            Function1 function12 = this.b;
            if (z) {
                av8 av8Var = (av8) of3Var;
                av8Var.e0(-784874969);
                h0.h((intValue >> 3) & 14, av8Var, xtcVar, function1, function12);
                av8Var.s(false);
            } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) {
                av8 av8Var2 = (av8) of3Var;
                av8Var2.e0(-784629945);
                h0.h((intValue >> 3) & 14, av8Var2, xtcVar, function1, function12);
                av8Var2.s(false);
            } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) {
                av8 av8Var3 = (av8) of3Var;
                av8Var3.e0(-784396608);
                av8Var3.s(false);
            } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) {
                av8 av8Var4 = (av8) of3Var;
                av8Var4.e0(-784339072);
                av8Var4.s(false);
            } else {
                if (rVar != null) {
                    av8 av8Var5 = (av8) of3Var;
                    av8Var5.e0(-1687888204);
                    av8Var5.s(false);
                    zzl.b();
                    return null;
                }
                av8 av8Var6 = (av8) of3Var;
                av8Var6.e0(-784304352);
                av8Var6.s(false);
            }
        }
        return Unit.a;
    }
}
