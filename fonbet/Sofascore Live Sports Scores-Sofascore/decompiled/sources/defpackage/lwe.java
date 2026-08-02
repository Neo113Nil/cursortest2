package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lwe extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nwe t;
    public final /* synthetic */ awe u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwe(nwe nweVar, awe aweVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = nweVar;
        this.u = aweVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        awe aweVar = this.u;
        nwe nweVar = this.t;
        switch (i) {
            case 0:
                return new lwe(nweVar, aweVar, rq3Var, 0);
            case 1:
                return new lwe(nweVar, aweVar, rq3Var, 1);
            case 2:
                return new lwe(nweVar, aweVar, rq3Var, 2);
            case 3:
                return new lwe(nweVar, aweVar, rq3Var, 3);
            case 4:
                return new lwe(nweVar, aweVar, rq3Var, 4);
            case 5:
                return new lwe(nweVar, aweVar, rq3Var, 5);
            default:
                return new lwe(nweVar, aweVar, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lwe) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        awe aweVar = this.u;
        nwe nweVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar = nweVar.e;
                int id = aweVar.a.getId();
                int i3 = aweVar.b;
                int i4 = aweVar.c;
                this.s = 1;
                wveVar.getClass();
                Object P = yaa.P(new qve(wveVar, id, i3, i4, null, 0), this);
                return P == lu3Var ? lu3Var : P;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                wve wveVar2 = nweVar.e;
                int id2 = aweVar.a.getId();
                int i6 = aweVar.b;
                int i7 = aweVar.c;
                this.s = 1;
                wveVar2.getClass();
                Object P2 = yaa.P(new qve(wveVar2, id2, i6, i7, null, 1), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                wve wveVar3 = nweVar.e;
                int id3 = aweVar.a.getId();
                int i9 = aweVar.b;
                int i10 = aweVar.c;
                String str = aweVar.d;
                this.s = 1;
                wveVar3.getClass();
                Object P3 = yaa.P(new sve(wveVar3, id3, i9, i10, str, null, 0), this);
                return P3 == lu3Var3 ? lu3Var3 : P3;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar4 = nweVar.e;
                int id4 = aweVar.a.getId();
                int i12 = aweVar.b;
                int i13 = aweVar.c;
                String str2 = aweVar.d;
                this.s = 1;
                wveVar4.getClass();
                Object P4 = yaa.P(new sve(wveVar4, id4, i12, i13, str2, null, 2), this);
                return P4 == lu3Var4 ? lu3Var4 : P4;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar5 = nweVar.e;
                int i15 = aweVar.b;
                int i16 = aweVar.c;
                String str3 = aweVar.d;
                this.s = 1;
                wveVar5.getClass();
                Object P5 = yaa.P(new ove(wveVar5, i15, i16, str3, null, 2), this);
                return P5 == lu3Var5 ? lu3Var5 : P5;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar6 = nweVar.e;
                int id5 = aweVar.a.getId();
                int i18 = aweVar.b;
                int i19 = aweVar.c;
                String str4 = aweVar.d;
                this.s = 1;
                wveVar6.getClass();
                Object P6 = yaa.P(new sve(wveVar6, id5, i18, i19, str4, null, 1), this);
                return P6 == lu3Var6 ? lu3Var6 : P6;
            default:
                lu3 lu3Var7 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = nweVar.f;
                int i21 = aweVar.b;
                int i22 = aweVar.c;
                this.s = 1;
                Object l0 = w3bVar.l0(i21, i22, this);
                return l0 == lu3Var7 ? lu3Var7 : l0;
        }
    }
}
