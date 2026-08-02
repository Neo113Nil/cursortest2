package defpackage;

import com.sofascore.model.Sports;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ggl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kgl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggl(kgl kglVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kglVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        kgl kglVar = this.t;
        switch (i) {
            case 0:
                return new ggl(kglVar, rq3Var, 0);
            case 1:
                return new ggl(kglVar, rq3Var, 1);
            case 2:
                return new ggl(kglVar, rq3Var, 2);
            case 3:
                return new ggl(kglVar, rq3Var, 3);
            case 4:
                return new ggl(kglVar, rq3Var, 4);
            case 5:
                return new ggl(kglVar, rq3Var, 5);
            case 6:
                return new ggl(kglVar, rq3Var, 6);
            default:
                return new ggl(kglVar, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ggl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        kgl kglVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                w3b w3bVar = kglVar.d;
                this.s = 1;
                Object k = w3bVar.k(this);
                return k == lu3Var ? lu3Var : k;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                j0j j0jVar = kglVar.c;
                this.s = 1;
                Object f = j0jVar.f(this);
                return f == lu3Var2 ? lu3Var2 : f;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    o63 c = kglVar.f.c(Sports.FOOTBALL);
                    this.s = 1;
                    obj = rd0.y(c, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((ys7) obj).b;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar2 = kglVar.d;
                this.s = 1;
                Object k2 = w3bVar2.k(this);
                return k2 == lu3Var4 ? lu3Var4 : k2;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                a76 f2 = kglVar.e.f();
                this.s = 1;
                Object y = rd0.y(f2, this);
                return y == lu3Var5 ? lu3Var5 : y;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar2 = kglVar.c;
                this.s = 1;
                Object f3 = j0jVar2.f(this);
                return f3 == lu3Var6 ? lu3Var6 : f3;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = kglVar.d;
                this.s = 1;
                Object k3 = w3bVar3.k(this);
                return k3 == lu3Var7 ? lu3Var7 : k3;
            default:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar3 = kglVar.c;
                this.s = 1;
                Object f4 = j0jVar3.f(this);
                return f4 == lu3Var8 ? lu3Var8 : f4;
        }
    }
}
