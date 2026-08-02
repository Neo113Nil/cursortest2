package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ndl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ udl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndl(udl udlVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = udlVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        udl udlVar = this.t;
        switch (i) {
            case 0:
                return new ndl(udlVar, rq3Var, 0);
            case 1:
                return new ndl(udlVar, rq3Var, 1);
            case 2:
                return new ndl(udlVar, rq3Var, 2);
            case 3:
                return new ndl(udlVar, rq3Var, 3);
            case 4:
                return new ndl(udlVar, rq3Var, 4);
            case 5:
                return new ndl(udlVar, rq3Var, 5);
            case 6:
                return new ndl(udlVar, rq3Var, 6);
            default:
                return new ndl(udlVar, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ndl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        udl udlVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = udlVar.f;
                    this.s = 1;
                    obj = wi7Var.A(this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                udlVar.l = new CopyOnWriteArraySet((HashSet) obj);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = udlVar.a;
                    this.s = 1;
                    obj = w3bVar.h(this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                udlVar.i = new CopyOnWriteArraySet((HashSet) obj);
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = udlVar.d;
                    this.s = 1;
                    obj = j0jVar.g(this);
                    if (obj == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                udlVar.j = new CopyOnWriteArraySet((HashSet) obj);
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    irk irkVar = udlVar.e;
                    this.s = 1;
                    obj = irkVar.b(this);
                    if (obj == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                udlVar.k = new CopyOnWriteArraySet((Set) obj);
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (udlVar.i(this) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (udlVar.h(this) == lu3Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (udlVar.g(this) == lu3Var7) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (udlVar.f(this) == lu3Var8) {
                        break;
                    }
                } else if (i9 != 1) {
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
