package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lr6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nr6 t;
    public final /* synthetic */ do7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr6(nr6 nr6Var, do7 do7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = nr6Var;
        this.u = do7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        do7 do7Var = this.u;
        nr6 nr6Var = this.t;
        switch (i) {
            case 0:
                return new lr6(nr6Var, do7Var, rq3Var, 0);
            default:
                return new lr6(nr6Var, do7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lr6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.r;
        do7 do7Var = this.u;
        nr6 nr6Var = this.t;
        switch (i2) {
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
                wi7 wi7Var = nr6Var.e;
                ev6 ev6Var = do7Var.c;
                mj7 mj7Var = ev6Var.i;
                if (!mj7Var.d()) {
                    mj7Var = ev6Var.k;
                }
                i = mj7Var != null ? mj7Var.a : 0;
                this.s = 1;
                Object J = wi7Var.J(i, this);
                return J == lu3Var ? lu3Var : J;
            default:
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
                ky6 ky6Var = nr6Var.f;
                ev6 ev6Var2 = do7Var.c;
                mj7 mj7Var2 = ev6Var2.i;
                if (!mj7Var2.d()) {
                    mj7Var2 = ev6Var2.k;
                }
                i = mj7Var2 != null ? mj7Var2.a : 0;
                this.s = 1;
                Object b = ky6Var.b(i, this);
                return b == lu3Var2 ? lu3Var2 : b;
        }
    }
}
