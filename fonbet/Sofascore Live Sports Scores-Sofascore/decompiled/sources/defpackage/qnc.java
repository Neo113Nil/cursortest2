package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qnc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ rnc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qnc(rnc rncVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = rncVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        rnc rncVar = this.t;
        switch (i) {
            case 0:
                return new qnc(rncVar, rq3Var, 0);
            case 1:
                return new qnc(rncVar, rq3Var, 1);
            default:
                return new qnc(rncVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qnc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        rnc rncVar = this.t;
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
                j0j j0jVar = rncVar.e;
                int i3 = rncVar.f;
                String t6eVar = t6e.a.toString();
                this.s = 1;
                Object A = j0jVar.A(i3, t6eVar, this);
                return A == lu3Var ? lu3Var : A;
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
                j0j j0jVar2 = rncVar.e;
                int i5 = rncVar.f;
                String t6eVar2 = t6e.b.toString();
                this.s = 1;
                Object A2 = j0jVar2.A(i5, t6eVar2, this);
                return A2 == lu3Var2 ? lu3Var2 : A2;
            default:
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
                j0j j0jVar3 = rncVar.e;
                int i7 = rncVar.f;
                this.s = 1;
                Object z = j0jVar3.z(i7, this);
                return z == lu3Var3 ? lu3Var3 : z;
        }
    }
}
