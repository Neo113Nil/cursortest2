package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wj0 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88 b;

    public /* synthetic */ wj0(z88 z88Var, int i) {
        this.a = i;
        this.b = z88Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        fa8 fa8Var;
        int i;
        Object obj;
        f0 e;
        int i2 = this.a;
        int i3 = 7;
        z88 z88Var = this.b;
        switch (i2) {
            case 0:
                Object collect = z88Var.collect(new vj0(b98Var, 0), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            case 1:
                Object collect2 = z88Var.collect(new vj0(b98Var, i3), rq3Var);
                return collect2 == lu3.a ? collect2 : Unit.a;
            case 2:
                if (rq3Var instanceof fa8) {
                    fa8Var = (fa8) rq3Var;
                    int i4 = fa8Var.s;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fa8Var.s = i4 - Integer.MIN_VALUE;
                        Object obj2 = fa8Var.r;
                        lu3 lu3Var = lu3.a;
                        i = fa8Var.s;
                        if (i != 0) {
                            y6a.M(obj2);
                            Object obj3 = new Object();
                            try {
                                m70 m70Var = new m70(i3, new dsf(), b98Var, obj3);
                                fa8Var.u = obj3;
                                fa8Var.s = 1;
                                if (z88Var.collect(m70Var, fa8Var) == lu3Var) {
                                    return lu3Var;
                                }
                            } catch (f0 e2) {
                                obj = obj3;
                                e = e2;
                                if (e.a != obj) {
                                }
                                return Unit.a;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = fa8Var.u;
                            try {
                                y6a.M(obj2);
                            } catch (f0 e3) {
                                e = e3;
                                if (e.a != obj) {
                                    throw e;
                                }
                                return Unit.a;
                            }
                        }
                        return Unit.a;
                    }
                }
                fa8Var = new fa8(this, rq3Var);
                Object obj22 = fa8Var.r;
                lu3 lu3Var2 = lu3.a;
                i = fa8Var.s;
                if (i != 0) {
                }
                return Unit.a;
            case 3:
                Object collect3 = z88Var.collect(new vj0(b98Var, 18), rq3Var);
                return collect3 == lu3.a ? collect3 : Unit.a;
            case 4:
                Object collect4 = z88Var.collect(new vj0(b98Var, 24), rq3Var);
                return collect4 == lu3.a ? collect4 : Unit.a;
            case 5:
                Object collect5 = z88Var.collect(new vj0(b98Var, 29), rq3Var);
                return collect5 == lu3.a ? collect5 : Unit.a;
            case 6:
                Object collect6 = z88Var.collect(new k2e(b98Var, 4), rq3Var);
                return collect6 == lu3.a ? collect6 : Unit.a;
            default:
                Object collect7 = z88Var.collect(new k2e(b98Var, 6), rq3Var);
                return collect7 == lu3.a ? collect7 : Unit.a;
        }
    }
}
