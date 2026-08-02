package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g27 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ h27 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g27(h27 h27Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = h27Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        h27 h27Var = this.t;
        switch (i) {
            case 0:
                return new g27(h27Var, rq3Var, 0);
            default:
                return new g27(h27Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((g27) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        h27 h27Var = this.t;
        switch (i) {
            case 0:
                e1d e1dVar = h27Var.f;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = h27Var.c;
                    int i3 = h27Var.e.a;
                    this.s = 1;
                    obj = wi7Var.u(i3, this);
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
                String str = (String) obj;
                if (str != null) {
                    ((eoh) e1dVar).setValue(f27.a((f27) ((eoh) e1dVar).getValue(), false, str, 12));
                }
                return Unit.a;
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
                wi7 wi7Var2 = h27Var.c;
                int i5 = h27Var.e.a;
                this.s = 1;
                Object h0 = wi7Var2.h0(i5, this);
                return h0 == lu3Var2 ? lu3Var2 : h0;
        }
    }
}
