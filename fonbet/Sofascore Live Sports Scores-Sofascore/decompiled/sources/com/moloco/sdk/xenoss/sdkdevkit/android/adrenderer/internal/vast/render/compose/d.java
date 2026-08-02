package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.a70;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pvd;
import defpackage.rq3;
import defpackage.vj0;
import defpackage.wt3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l t;
    public final /* synthetic */ f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar, f fVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = lVar;
        this.u = fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        f fVar = this.u;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = this.t;
        switch (i) {
            case 0:
                return new d(lVar, fVar, rq3Var, 0);
            case 1:
                return new d(lVar, fVar, rq3Var, 1);
            default:
                return new d(lVar, fVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((d) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            case 1:
                ((d) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((d) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        f fVar = this.u;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = this.t;
        int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                fdi fdiVar = lVar.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e(fVar, lVar, 2);
                this.s = 1;
                fdiVar.collect(eVar, this);
                return lu3Var;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ddi p = lVar.a.p();
                    e eVar2 = new e(fVar, 0);
                    this.s = 1;
                    if (p.collect(eVar2, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    ddi f = lVar.a.f();
                    e eVar3 = new e(fVar, i2);
                    this.s = 1;
                    Object collect = f.collect(new vj0(eVar3, 18), this);
                    if (collect != lu3Var3) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
