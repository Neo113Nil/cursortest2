package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.a70;
import defpackage.d11;
import defpackage.ddi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pvd;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.xdh;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ f t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        f fVar = this.t;
        switch (i) {
            case 0:
                return new e(fVar, rq3Var, 0);
            default:
                return new e(fVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((e) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            default:
                ((e) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i iVar;
        int i = this.r;
        f fVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ddi unrecoverableError = fVar.i.getUnrecoverableError();
                    d11 d11Var = new d11(2, null, 20);
                    this.s = 1;
                    obj = rd0.z(unrecoverableError, d11Var, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (adShowListener = fVar.getAdShowListener()) != null) {
                    int i3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a[gVar.ordinal()];
                    if (i3 == 1) {
                        iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.a;
                    } else if (i3 == 2) {
                        iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.b;
                    } else if (i3 == 3) {
                        iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.c;
                    } else {
                        if (i3 != 4) {
                            zzl.b();
                            return null;
                        }
                        iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.d;
                    }
                    adShowListener.a(iVar);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    xdh clickthroughEvent = fVar.i.getClickthroughEvent();
                    com.moloco.sdk.internal.publisher.o0 o0Var = new com.moloco.sdk.internal.publisher.o0(fVar, 2);
                    this.s = 1;
                    if (clickthroughEvent.collect(o0Var, this) == lu3Var2) {
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
        }
    }
}
