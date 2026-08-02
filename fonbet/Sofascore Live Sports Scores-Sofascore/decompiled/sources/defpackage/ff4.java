package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ff4 extends hoi implements ct8 {
    public final /* synthetic */ int r = 1;
    public int s;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff4(qf4 qf4Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = qf4Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                return new ff4((qf4) this.t, (rq3) obj3).invokeSuspend(Unit.a);
            default:
                ((Boolean) obj2).getClass();
                ff4 ff4Var = new ff4(3, (rq3) obj3);
                ff4Var.t = (ynf) obj;
                return ff4Var.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    qf4 qf4Var = (qf4) this.t;
                    this.s = 1;
                    if (qf4Var.b(this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
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
                ynf ynfVar = (ynf) this.t;
                this.s = 1;
                Object b = ynfVar.b(this);
                return b == lu3Var2 ? lu3Var2 : b;
        }
    }

    public /* synthetic */ ff4(int i, rq3 rq3Var) {
        super(i, rq3Var);
    }
}
