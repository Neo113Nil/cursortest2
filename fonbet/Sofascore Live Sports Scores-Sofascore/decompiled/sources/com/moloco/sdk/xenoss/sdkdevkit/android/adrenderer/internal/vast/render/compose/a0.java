package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.a70;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.jof;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pvd;
import defpackage.rq3;
import defpackage.wt3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ b0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        b0 b0Var = this.t;
        switch (i) {
            case 0:
                return new a0(b0Var, rq3Var, 0);
            default:
                return new a0(b0Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((a0) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            default:
                ((a0) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        b0 b0Var = this.t;
        int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    jof jofVar = b0Var.a.p;
                    z zVar = new z(b0Var, 0);
                    this.s = 1;
                    if (jofVar.a.collect(zVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                fdi fdiVar = b0Var.a.n;
                z zVar2 = new z(b0Var, i2);
                this.s = 1;
                fdiVar.collect(zVar2, this);
                return lu3Var2;
        }
    }
}
