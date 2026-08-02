package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class poe extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ roe t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poe(roe roeVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = roeVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        roe roeVar = this.t;
        switch (i) {
            case 0:
                return new poe(roeVar, i2, rq3Var, 0);
            case 1:
                return new poe(roeVar, i2, rq3Var, 1);
            case 2:
                return new poe(roeVar, i2, rq3Var, 2);
            case 3:
                return new poe(roeVar, i2, rq3Var, 3);
            case 4:
                return new poe(roeVar, i2, rq3Var, 4);
            default:
                return new poe(roeVar, i2, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((poe) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        roe roeVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar = roeVar.e;
                this.s = 1;
                wveVar.getClass();
                Object P = yaa.P(new ive(wveVar, i2, null, 1), this);
                return P == lu3Var ? lu3Var : P;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                by9 by9Var = roeVar.f;
                this.s = 1;
                dvb dvbVar = (dvb) by9Var.a;
                Object U = gz8.U(this, dvbVar.a, true, false, new bvb(i2, dvbVar, 0));
                return U == lu3Var2 ? lu3Var2 : U;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar2 = roeVar.e;
                this.s = 1;
                wveVar2.getClass();
                Object P2 = yaa.P(new ive(wveVar2, i2, null, 4), this);
                return P2 == lu3Var3 ? lu3Var3 : P2;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                wve wveVar3 = roeVar.e;
                Context i7 = roeVar.i();
                this.s = 1;
                Object p = wveVar3.p(i7, i2, this);
                return p == lu3Var4 ? lu3Var4 : p;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar4 = roeVar.e;
                this.s = 1;
                wveVar4.getClass();
                Object P3 = yaa.P(new ive(wveVar4, i2, null, 2), this);
                return P3 == lu3Var5 ? lu3Var5 : P3;
            default:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar5 = roeVar.e;
                this.s = 1;
                wveVar5.getClass();
                Object P4 = yaa.P(new ive(wveVar5, i2, null, 8), this);
                return P4 == lu3Var6 ? lu3Var6 : P4;
        }
    }
}
