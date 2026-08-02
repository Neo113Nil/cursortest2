package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.wba;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ long t;
    public final /* synthetic */ m0 u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(long j, m0 m0Var, n nVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = j;
        this.u = m0Var;
        this.v = nVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new m(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new m(this.t, this.u, this.v, rq3Var, 1);
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
        n nVar = this.v;
        long j = this.t;
        m0 m0Var = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    l lVar = new l(m0Var, nVar, null, 0);
                    this.s = 1;
                    obj = wba.W(j, lVar, this);
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
                m0 m0Var2 = (m0) obj;
                return m0Var2 == null ? m0Var : m0Var2;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    l lVar2 = new l(m0Var, nVar, null, 1);
                    this.s = 1;
                    obj = wba.W(j, lVar2, this);
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
                m0 m0Var3 = (m0) obj;
                return m0Var3 == null ? m0Var : m0Var3;
        }
    }
}
