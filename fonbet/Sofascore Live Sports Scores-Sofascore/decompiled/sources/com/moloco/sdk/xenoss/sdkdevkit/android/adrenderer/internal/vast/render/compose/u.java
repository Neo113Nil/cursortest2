package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.a70;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.nea;
import defpackage.pvd;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.ug6;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new u((v) obj2, rq3Var, 0);
            case 1:
                return new u((Function0) obj2, rq3Var, 1);
            case 2:
                return new u((g1) obj2, rq3Var, 2);
            case 3:
                return new u((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h) obj2, rq3Var, 3);
            default:
                return new u((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0) obj2, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((u) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 1:
                return ((u) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 2:
                ((u) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            case 3:
                ((u) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((u) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Object obj2 = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    v vVar = (v) obj2;
                    z88 z88Var = vVar.a;
                    com.moloco.sdk.internal.publisher.o0 o0Var = new com.moloco.sdk.internal.publisher.o0(vVar, 7);
                    this.s = 1;
                    if (z88Var.collect(o0Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    nea neaVar = new nea((Function0) obj2, rq3Var, 4);
                    this.s = 1;
                    if (xw3.R(r69Var, neaVar, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    g1 g1Var = (g1) obj2;
                    jof jofVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) g1Var.a).e;
                    com.moloco.sdk.internal.publisher.o0 o0Var2 = new com.moloco.sdk.internal.publisher.o0(g1Var, 8);
                    this.s = 1;
                    if (jofVar.a.collect(o0Var2, this) == lu3Var3) {
                        return lu3Var3;
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
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0 && i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                do {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h) obj2;
                    ug6 ug6Var = hVar.p;
                    if (ug6Var != null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(ug6Var.h(), ug6Var.m());
                        fdi fdiVar = hVar.f;
                        fdiVar.getClass();
                        fdiVar.m(null, mVar);
                    }
                    this.s = 1;
                } while (n4o.y(500L, this) != lu3Var4);
                return lu3Var4;
            default:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Function1 function1 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0) obj2).d;
                this.s = 1;
                Object invoke = function1.invoke(this);
                return invoke == lu3Var5 ? lu3Var5 : invoke;
        }
    }
}
