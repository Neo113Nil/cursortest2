package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zy1 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy1(Object obj, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.r) {
            case 0:
                zy1 zy1Var = new zy1(i, (rq3) obj3, 0);
                zy1Var.s = (yj9) obj;
                zy1Var.invokeSuspend(Unit.a);
                return null;
            case 1:
                return new zy1((asf) this.s, (rq3) obj3, 1).invokeSuspend(Unit.a);
            case 2:
                return new zy1((yyc) this.s, (rq3) obj3, 2).invokeSuspend(Unit.a);
            default:
                zy1 zy1Var2 = new zy1(i, (rq3) obj3, i);
                zy1Var2.s = (q1e) obj2;
                return zy1Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (((yj9) this.s).f.d(az1.a) == null) {
                    return null;
                }
                pvd.j();
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ((asf) this.s).a = true;
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            default:
                q1e q1eVar = (q1e) this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return q1eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy1(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }
}
