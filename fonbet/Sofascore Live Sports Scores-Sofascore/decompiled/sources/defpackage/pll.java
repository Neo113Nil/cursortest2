package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pll extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tll t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pll(tll tllVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = tllVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        tll tllVar = this.t;
        switch (i) {
            case 0:
                return new pll(tllVar, i2, rq3Var, 0);
            case 1:
                return new pll(tllVar, i2, rq3Var, 1);
            case 2:
                return new pll(tllVar, i2, rq3Var, 2);
            default:
                return new pll(tllVar, i2, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((pll) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        tll tllVar = this.t;
        rq3 rq3Var = null;
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
                w3b w3bVar = tllVar.b;
                String t6eVar = t6e.a.toString();
                this.s = 1;
                Object H0 = w3bVar.H0(16, 58210, this.u, t6eVar, 0, this);
                return H0 == lu3Var ? lu3Var : H0;
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
                w3b w3bVar2 = tllVar.b;
                String t6eVar2 = t6e.b.toString();
                this.s = 1;
                Object H02 = w3bVar2.H0(16, 58210, this.u, t6eVar2, 0, this);
                return H02 == lu3Var2 ? lu3Var2 : H02;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new jr5(tllVar, i2, rq3Var, 17), this);
                    return r == lu3Var3 ? lu3Var3 : r;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object b = tllVar.b(i2, this);
                    return b == lu3Var4 ? lu3Var4 : b;
                }
                if (i6 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
