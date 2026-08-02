package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.publisher.z0;
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
public final class g extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ h t;
    public final /* synthetic */ z0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, z0 z0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = hVar;
        this.u = z0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        z0 z0Var = this.u;
        h hVar = this.t;
        switch (i) {
            case 0:
                return new g(hVar, z0Var, rq3Var, 0);
            default:
                return new g(hVar, z0Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((g) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            default:
                ((g) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j jVar;
        int i = this.r;
        int i2 = 3;
        z0 z0Var = this.u;
        h hVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                int i4 = 2;
                if (i3 == 0) {
                    y6a.M(obj);
                    ddi unrecoverableError = hVar.f.getUnrecoverableError();
                    d11 d11Var = new d11(i4, rq3Var, 21);
                    this.s = 1;
                    obj = rd0.z(unrecoverableError, d11Var, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null) {
                    int i5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a[gVar.ordinal()];
                    if (i5 == 1) {
                        jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.a;
                    } else if (i5 == 2) {
                        jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.b;
                    } else if (i5 == 3) {
                        jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.c;
                    } else {
                        if (i5 != 4) {
                            zzl.b();
                            return null;
                        }
                        jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.d;
                    }
                    z0Var.a(jVar);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    xdh clickthroughEvent = hVar.f.getClickthroughEvent();
                    com.moloco.sdk.internal.publisher.o0 o0Var = new com.moloco.sdk.internal.publisher.o0(z0Var, i2);
                    this.s = 1;
                    if (clickthroughEvent.collect(o0Var, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i6 != 1) {
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
