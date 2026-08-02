package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lbi extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ rbi t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbi(rbi rbiVar, Integer num, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = rbiVar;
        this.u = num;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new lbi(this.u, this.t, this.v, this.w, rq3Var);
            default:
                return new lbi(this.t, this.u, this.v, this.w, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lbi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Integer num = this.u;
        Boolean bool = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (num != null) {
                        g39 g39Var = this.t.g;
                        int intValue = num.intValue();
                        this.s = 1;
                        obj = g39Var.f(this.v, this.w, intValue, this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                bool = (Boolean) obj;
                bool.getClass();
                return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
            default:
                Object obj2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = (num != null && num.intValue() == 132) ? Boolean.FALSE : s9a.r(new kbi(this.t, this.v, this.w, null, 0), this);
                    return r == obj2 ? obj2 : r;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbi(Integer num, rbi rbiVar, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = num;
        this.t = rbiVar;
        this.v = i;
        this.w = i2;
    }
}
