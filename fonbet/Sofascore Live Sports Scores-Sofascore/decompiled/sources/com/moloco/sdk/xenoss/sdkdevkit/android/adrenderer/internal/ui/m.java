package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import defpackage.a70;
import defpackage.cdi;
import defpackage.e1d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pog;
import defpackage.rq3;
import defpackage.sea;
import defpackage.wj0;
import defpackage.y6a;
import defpackage.y7k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ cdi t;
    public final /* synthetic */ e1d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(cdi cdiVar, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = cdiVar;
        this.u = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        e1d e1dVar = this.u;
        cdi cdiVar = this.t;
        switch (i) {
            case 0:
                return new m(cdiVar, e1dVar, rq3Var, 0);
            default:
                return new m(cdiVar, e1dVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((m) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e1d e1dVar = this.u;
        final cdi cdiVar = this.t;
        final int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    final int i4 = 0;
                    wj0 wj0Var = new wj0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n(sea.y(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i4;
                            cdi cdiVar2 = cdiVar;
                            switch (i5) {
                                case 0:
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) cdiVar2.getValue();
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVar = fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) fVar : null;
                                    return Integer.valueOf(dVar != null ? dVar.a : 0);
                                default:
                                    y7k y7kVar = (y7k) cdiVar2.getValue();
                                    int i6 = y7kVar.a;
                                    return y7kVar;
                            }
                        }
                    }), 1), 2);
                    k kVar = new k(0, e1dVar);
                    this.s = 1;
                    if (wj0Var.collect(kVar, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    pog y = sea.y(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i52 = i2;
                            cdi cdiVar2 = cdiVar;
                            switch (i52) {
                                case 0:
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) cdiVar2.getValue();
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVar = fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) fVar : null;
                                    return Integer.valueOf(dVar != null ? dVar.a : 0);
                                default:
                                    y7k y7kVar = (y7k) cdiVar2.getValue();
                                    int i6 = y7kVar.a;
                                    return y7kVar;
                            }
                        }
                    });
                    k kVar2 = new k(1, e1dVar);
                    this.s = 1;
                    Object collect = y.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(kVar2, 2), this);
                    if (collect != lu3Var2) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
