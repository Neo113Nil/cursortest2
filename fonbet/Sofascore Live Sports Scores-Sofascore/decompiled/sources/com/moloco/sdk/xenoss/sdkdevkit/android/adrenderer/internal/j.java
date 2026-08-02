package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.a70;
import defpackage.aeh;
import defpackage.hof;
import defpackage.hoi;
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
public final class j extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ k t;
    public final /* synthetic */ com.facebook.internal.t u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, com.facebook.internal.t tVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kVar;
        this.u = tVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        com.facebook.internal.t tVar = this.u;
        k kVar = this.t;
        switch (i) {
            case 0:
                return new j(kVar, tVar, rq3Var, 0);
            case 1:
                return new j(kVar, tVar, rq3Var, 1);
            default:
                return new j(kVar, tVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            default:
                ((j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        com.facebook.internal.t tVar = this.u;
        k kVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aeh aehVar = kVar.f.d;
                i iVar = new i(tVar, 0);
                this.s = 1;
                aehVar.collect(iVar, this);
                return lu3Var;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    hof hofVar = kVar.g.d;
                    i iVar2 = new i(tVar, 1);
                    this.s = 1;
                    if (hofVar.a.collect(iVar2, this) == lu3Var2) {
                        return lu3Var2;
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
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    hof hofVar2 = kVar.h.d;
                    i iVar3 = new i(tVar, 2);
                    this.s = 1;
                    if (hofVar2.a.collect(iVar3, this) == lu3Var3) {
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
        }
    }
}
