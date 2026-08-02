package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ota extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ yta t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ota(yta ytaVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ytaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yta ytaVar = this.t;
        switch (i) {
            case 0:
                return new ota(ytaVar, rq3Var, 0);
            case 1:
                return new ota(ytaVar, rq3Var, 1);
            case 2:
                return new ota(ytaVar, rq3Var, 2);
            case 3:
                return new ota(ytaVar, rq3Var, 3);
            case 4:
                return new ota(ytaVar, rq3Var, 4);
            case 5:
                return new ota(ytaVar, rq3Var, 5);
            case 6:
                return new ota(ytaVar, rq3Var, 6);
            default:
                return new ota(ytaVar, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ota) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        yta ytaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    kgl kglVar = ytaVar.h;
                    int i3 = ytaVar.i;
                    this.s = 1;
                    kglVar.getClass();
                    obj = kglVar.a(egl.b, i3, this);
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
                if (((Boolean) obj).booleanValue()) {
                    ytaVar.F.a(Unit.a);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = ytaVar.g;
                    String c = dv3.c();
                    this.s = 1;
                    obj = wi7Var.L(c, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Map map = (Map) obj;
                if (map != null) {
                    return (Integer) me4.f(ytaVar.i, map);
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                w3b w3bVar = ytaVar.e;
                int i6 = ytaVar.k;
                this.s = 1;
                Object j0 = w3bVar.j0(i6, this);
                return j0 == lu3Var3 ? lu3Var3 : j0;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                w3b w3bVar2 = ytaVar.e;
                int i8 = ytaVar.k;
                this.s = 1;
                Object n0 = w3bVar2.n0(i8, this);
                return n0 == lu3Var4 ? lu3Var4 : n0;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                w3b w3bVar3 = ytaVar.e;
                int i10 = ytaVar.i;
                this.s = 1;
                Object q0 = w3bVar3.q0(i10, this);
                return q0 == lu3Var5 ? lu3Var5 : q0;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar4 = ytaVar.e;
                int i12 = ytaVar.i;
                this.s = 1;
                Object F0 = w3bVar4.F0(i12, this);
                return F0 == lu3Var6 ? lu3Var6 : F0;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar5 = ytaVar.e;
                int i14 = ytaVar.i;
                this.s = 1;
                Object F = w3bVar5.F(i14, this);
                return F == lu3Var7 ? lu3Var7 : F;
            default:
                lu3 lu3Var8 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar6 = ytaVar.e;
                int i16 = ytaVar.i;
                this.s = 1;
                Object t0 = w3bVar6.t0(i16, this);
                return t0 == lu3Var8 ? lu3Var8 : t0;
        }
    }
}
