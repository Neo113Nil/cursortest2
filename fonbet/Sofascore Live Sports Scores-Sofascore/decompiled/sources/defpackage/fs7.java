package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fs7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ is7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs7(int i, rq3 rq3Var, is7 is7Var) {
        super(2, rq3Var);
        this.r = i;
        this.t = is7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        is7 is7Var = this.t;
        switch (i) {
            case 0:
                return new fs7(0, rq3Var, is7Var);
            case 1:
                return new fs7(1, rq3Var, is7Var);
            case 2:
                return new fs7(2, rq3Var, is7Var);
            default:
                return new fs7(3, rq3Var, is7Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fs7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        is7 is7Var = this.t;
        switch (i) {
            case 0:
                fdi fdiVar = is7Var.n;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (wyh.y.contains(fdiVar.getValue())) {
                        return km5.a;
                    }
                    w3b w3bVar = is7Var.k;
                    String str = is7Var.f;
                    String str2 = (String) fdiVar.getValue();
                    this.s = 1;
                    obj = w3bVar.G0(str, str2, this);
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
                return (List) obj;
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
                w3b w3bVar2 = is7Var.k;
                this.s = 1;
                Object k = w3bVar2.k(this);
                return k == lu3Var2 ? lu3Var2 : k;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                j0j j0jVar = is7Var.j;
                this.s = 1;
                Object f = j0jVar.f(this);
                return f == lu3Var3 ? lu3Var3 : f;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    j0j j0jVar2 = is7Var.j;
                    String str3 = is7Var.f;
                    String str4 = (String) is7Var.n.getValue();
                    this.s = 1;
                    j0jVar2.getClass();
                    obj = yaa.P(new yw(str4, j0jVar2, str3, null, 16), this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                return list == null ? km5.a : list;
        }
    }
}
