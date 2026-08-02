package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n7a extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ o7a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7a(o7a o7aVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = o7aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new n7a(this.t, rq3Var, 0);
            default:
                return new n7a(this.t, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((n7a) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    this.t.a();
                    o7a o7aVar = this.t;
                    this.s = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(this));
                    lj2Var.t();
                    synchronized (o7aVar.c) {
                        o7aVar.d = 20;
                        o7aVar.f = lj2Var;
                        Unit unit = Unit.a;
                    }
                    lj2Var.v(new oo(o7aVar, 25));
                    if (lj2Var.q() == lu3Var) {
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
                if (i2 == 0) {
                    y6a.M(obj);
                    o7a o7aVar2 = this.t;
                    this.s = 1;
                    o7aVar2.getClass();
                    if (wba.V(5000L, new n7a(o7aVar2, rq3Var, 0), this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
