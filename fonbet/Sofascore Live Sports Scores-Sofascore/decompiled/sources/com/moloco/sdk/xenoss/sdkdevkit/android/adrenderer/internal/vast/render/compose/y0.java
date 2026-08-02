package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.av8;
import defpackage.cdi;
import defpackage.ct8;
import defpackage.e1d;
import defpackage.of3;
import defpackage.r70;
import defpackage.yqo;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y0 implements ct8 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ cdi b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;

    public y0(Function1 function1, e1d e1dVar, String str, long j, Function0 function0) {
        this.a = function1;
        this.b = e1dVar;
        this.c = str;
        this.d = j;
        this.e = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) this.b.getValue();
        boolean z = rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
        Function0 function0 = this.e;
        long j = this.d;
        String str = this.c;
        Function1 function1 = this.a;
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.e0(1205021971);
            com.facebook.appevents.n.j(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f, function1, yqo.y(-832302220, av8Var, new x0(str, j, function0, 0)), av8Var, 3120, 1);
            av8Var.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.e0(1205613203);
            com.facebook.appevents.n.j(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f, function1, yqo.y(1517460509, av8Var2, new x0(str, j, function0, 1)), av8Var2, 3120, 1);
            av8Var2.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.e0(1206186703);
            av8Var3.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) {
            av8 av8Var4 = (av8) of3Var;
            av8Var4.e0(1206272108);
            av8Var4.s(false);
        } else {
            if (rVar != null) {
                av8 av8Var5 = (av8) of3Var;
                av8Var5.e0(-1485150361);
                av8Var5.s(false);
                zzl.b();
                return null;
            }
            av8 av8Var6 = (av8) of3Var;
            av8Var6.e0(1206306859);
            av8Var6.s(false);
        }
        return Unit.a;
    }
}
