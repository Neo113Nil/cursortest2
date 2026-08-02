package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ m0 t;
    public final /* synthetic */ n u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m0 m0Var, n nVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = m0Var;
        this.u = nVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        n nVar = this.u;
        m0 m0Var = this.t;
        switch (i) {
            case 0:
                return new l(m0Var, nVar, rq3Var, 0);
            default:
                return new l(m0Var, nVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((l) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        n nVar = this.u;
        m0 m0Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (m0Var == null) {
                        return null;
                    }
                    com.facebook.internal.t tVar = nVar.d;
                    com.moloco.sdk.internal.ortb.model.a0 a0Var = nVar.a.d;
                    String str = a0Var != null ? a0Var.b : null;
                    this.s = 1;
                    obj = tVar.d(m0Var, str, this);
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
                return (m0) obj;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (m0Var == null) {
                        return null;
                    }
                    com.facebook.internal.t tVar2 = nVar.d;
                    String str2 = nVar.a.d.b;
                    this.s = 1;
                    obj = tVar2.d(m0Var, str2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (m0) obj;
        }
    }
}
