package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lui extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nui t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lui(nui nuiVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = nuiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        nui nuiVar = this.t;
        switch (i) {
            case 0:
                return new lui(nuiVar, rq3Var, 0);
            case 1:
                return new lui(nuiVar, rq3Var, 1);
            case 2:
                return new lui(nuiVar, rq3Var, 2);
            case 3:
                return new lui(nuiVar, rq3Var, 3);
            case 4:
                return new lui(nuiVar, rq3Var, 4);
            default:
                return new lui(nuiVar, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lui) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        nui nuiVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    kgl kglVar = nuiVar.h;
                    int i3 = nuiVar.i;
                    this.s = 1;
                    kglVar.getClass();
                    obj = kglVar.a(egl.c, i3, this);
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
                if (((Boolean) obj).booleanValue()) {
                    nuiVar.q.a(Unit.a);
                }
                return Unit.a;
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
                j0j j0jVar = nuiVar.e;
                int i5 = nuiVar.i;
                this.s = 1;
                Object D = j0jVar.D(i5, this);
                return D == lu3Var2 ? lu3Var2 : D;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                j0j j0jVar2 = nuiVar.e;
                int i7 = nuiVar.i;
                this.s = 1;
                Object G = j0jVar2.G(i7, this);
                return G == lu3Var3 ? lu3Var3 : G;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                j0j j0jVar3 = nuiVar.e;
                int i9 = nuiVar.i;
                this.s = 1;
                Object C = j0jVar3.C(i9, this);
                return C == lu3Var4 ? lu3Var4 : C;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar4 = nuiVar.e;
                int i11 = nuiVar.i;
                this.s = 1;
                Object t = j0jVar4.t(i11, this);
                return t == lu3Var5 ? lu3Var5 : t;
            default:
                lu3 lu3Var6 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar5 = nuiVar.e;
                int i13 = nuiVar.i;
                this.s = 1;
                Object s = j0jVar5.s(i13, this);
                return s == lu3Var6 ? lu3Var6 : s;
        }
    }
}
