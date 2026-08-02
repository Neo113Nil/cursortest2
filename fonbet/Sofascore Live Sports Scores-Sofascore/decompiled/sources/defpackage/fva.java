package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fva extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fva(j0j j0jVar, int i, int i2, int i3, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = j0jVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.x = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                int i2 = this.u;
                int i3 = this.v;
                return new fva(this.t, i2, i3, rq3Var, (kva) obj2);
            default:
                return new fva((j0j) this.w, this.t, this.u, this.v, (String) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fva) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        yzc yzcVar;
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    kva kvaVar = (kva) obj2;
                    yzc yzcVar2 = kvaVar.n;
                    w3b w3bVar = kvaVar.e;
                    this.w = yzcVar2;
                    this.s = 1;
                    Object u = w3bVar.u(this.t, this.u, this.v, this);
                    if (u == lu3Var) {
                        return lu3Var;
                    }
                    yzcVar = yzcVar2;
                    obj = u;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzcVar = (yzc) this.w;
                    y6a.M(obj);
                }
                yzcVar.j(obj);
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = ((j0j) this.w).r(this.t, this.u, this.v, this, (String) obj2);
                    return r == lu3Var2 ? lu3Var2 : r;
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
    public fva(int i, int i2, int i3, rq3 rq3Var, kva kvaVar) {
        super(2, rq3Var);
        this.x = kvaVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
    }
}
