package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lj5 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ ksa s;
    public final /* synthetic */ pj5 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ kx4 v;
    public final /* synthetic */ cdi w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj5(int i, kx4 kx4Var, pj5 pj5Var, ksa ksaVar, cdi cdiVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = i;
        this.v = kx4Var;
        this.t = pj5Var;
        this.s = ksaVar;
        this.w = cdiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new lj5(this.u, this.v, this.t, this.s, this.w, rq3Var);
            default:
                return new lj5(this.s, this.t, this.u, this.v, this.w, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lj5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        kx4 kx4Var = this.v;
        cdi cdiVar = this.w;
        ksa ksaVar = this.s;
        pj5 pj5Var = this.t;
        int i2 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i3 = vh.f;
                if (i2 == ((Number) cdiVar.getValue()).intValue()) {
                    pj5Var.m.i((ksaVar.h() * kx4Var.H0(76.0f)) + ksaVar.i());
                }
                break;
            default:
                znh znhVar = pj5Var.n;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if ((ksaVar.j.b() && znhVar.h() < 0) || znhVar.h() == i2) {
                    znhVar.i(i2);
                    int i4 = vh.f;
                    pj5Var.m.i((ksaVar.h() * kx4Var.H0((float) (76.0d / Math.pow(2.0d, ((Number) cdiVar.getValue()).intValue() - i2)))) + ksaVar.i());
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj5(ksa ksaVar, pj5 pj5Var, int i, kx4 kx4Var, cdi cdiVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ksaVar;
        this.t = pj5Var;
        this.u = i;
        this.v = kx4Var;
        this.w = cdiVar;
    }
}
