package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mil extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ gv9 u;
    public final /* synthetic */ ksa v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mil(int i, gv9 gv9Var, ksa ksaVar, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = i;
        this.u = gv9Var;
        this.v = ksaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new mil(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new mil(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mil) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int indexOf;
        int indexOf2;
        int i = this.r;
        ksa ksaVar = this.v;
        gv9 gv9Var = this.u;
        int i2 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (i2 > 0 && (indexOf = gv9Var.indexOf(ael.f)) >= 0) {
                        this.s = 1;
                        y3g y3gVar = ksa.y;
                        if (ksaVar.f(indexOf, 0, this) == lu3Var) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (i2 > 0 && (indexOf2 = gv9Var.indexOf(ael.u)) >= 0) {
                        this.s = 1;
                        if (ksa.l(indexOf2, this, ksaVar) == lu3Var2) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
