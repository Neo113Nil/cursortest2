package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xjl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qkl t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xjl(qkl qklVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = qklVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        qkl qklVar = this.t;
        switch (i) {
            case 0:
                return new xjl(qklVar, i2, rq3Var, 0);
            case 1:
                return new xjl(qklVar, i2, rq3Var, 1);
            default:
                return new xjl(qklVar, i2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xjl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        qkl qklVar = this.t;
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
                w3b w3bVar = qklVar.l;
                String t6eVar = t6e.a.toString();
                this.s = 1;
                Object H0 = w3bVar.H0(16, 58210, this.u, t6eVar, 0, this);
                return H0 == lu3Var ? lu3Var : H0;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                w3b w3bVar2 = qklVar.l;
                String t6eVar2 = t6e.b.toString();
                this.s = 1;
                Object H02 = w3bVar2.H0(16, 58210, this.u, t6eVar2, 0, this);
                return H02 == lu3Var2 ? lu3Var2 : H02;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                int i5 = this.u;
                if (i4 == 0) {
                    y6a.M(obj);
                    irk irkVar = qklVar.w;
                    long v = yaa.v();
                    this.s = 1;
                    if (irkVar.a(v, i5, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                qklVar.n(null, new kwi(i5, 14));
                return Unit.a;
        }
    }
}
