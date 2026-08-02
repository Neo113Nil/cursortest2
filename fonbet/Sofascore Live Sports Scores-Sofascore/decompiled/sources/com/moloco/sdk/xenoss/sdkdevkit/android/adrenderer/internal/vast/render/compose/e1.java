package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.av8;
import defpackage.ft8;
import defpackage.gt8;
import defpackage.ht8;
import defpackage.of3;
import defpackage.os8;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ f0 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ e1(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar, long j, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, f0 f0Var, Function2 function26, Function2 function27, Function2 function28, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, boolean z, int i) {
        this.a = i;
        this.b = sVar;
        this.c = j;
        this.d = function2;
        this.e = function22;
        this.f = function23;
        this.g = function24;
        this.h = function25;
        this.i = f0Var;
        this.j = function26;
        this.k = function27;
        this.l = function28;
        this.m = qVar;
        this.n = z;
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
                f1.o(this.b, null, this.c, (ht8) this.d.invoke(of3Var, 0), (os8) this.e.invoke(of3Var, 0), (os8) this.f.invoke(of3Var, 0), (os8) this.g.invoke(of3Var, 0), (ht8) this.h.invoke(of3Var, 0), this.i, (ft8) this.j.invoke(of3Var, 0), (gt8) this.k.invoke(of3Var, 0), (ht8) this.l.invoke(of3Var, 0), this.m, this.n, of3Var, 0, 2);
            default:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        break;
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, yqo.y(2103457343, of3Var2, new e1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, 0)), of3Var2, 48);
        }
        return Unit.a;
    }
}
