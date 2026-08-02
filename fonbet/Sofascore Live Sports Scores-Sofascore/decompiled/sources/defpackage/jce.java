package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jce extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ g6b u;
    public final /* synthetic */ e6b v;
    public final /* synthetic */ Function2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jce(g6b g6bVar, e6b e6bVar, Function2 function2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = g6bVar;
        this.v = e6bVar;
        this.w = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                jce jceVar = new jce(this.u, this.v, this.w, rq3Var, 0);
                jceVar.t = obj;
                return jceVar;
            default:
                jce jceVar2 = new jce(this.u, this.v, this.w, rq3Var, 1);
                jceVar2.t = obj;
                return jceVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jce) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i6b i6bVar;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    yda ydaVar = (yda) ((ku3) this.t).getCoroutineContext().get(uic.g);
                    if (ydaVar == null) {
                        a70.r("when[State] methods should have a parent job");
                        return null;
                    }
                    ice iceVar = new ice();
                    i6b i6bVar2 = new i6b(this.u, this.v, iceVar.c, ydaVar);
                    try {
                        Function2 function2 = this.w;
                        this.t = i6bVar2;
                        this.s = 1;
                        obj = xw3.R(iceVar, function2, this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        i6bVar = i6bVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        i6bVar = i6bVar2;
                        i6bVar.a();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6bVar = (i6b) this.t;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        i6bVar.a();
                        throw th;
                    }
                }
                i6bVar.a();
                return obj;
            default:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.t;
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a.f;
                    jk jkVar = new jk(this.u, this.v, ku3Var, this.w, (rq3) null);
                    this.s = 1;
                    if (xw3.R(r69Var, jkVar, this) == lu3Var2) {
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
