package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hr7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ rr7 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr7(rr7 rr7Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = rr7Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new hr7(this.t, this.u, rq3Var, 0);
            default:
                return new hr7(this.t, this.u, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hr7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        rr7 rr7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wve wveVar = rr7Var.j;
                    String str = rr7Var.f;
                    this.s = 1;
                    wveVar.getClass();
                    obj = yaa.P(new yw(this.u, wveVar, str, null, 12), this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                if (list == null) {
                    break;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = rr7Var.i;
                    String str2 = rr7Var.f;
                    this.s = 1;
                    j0jVar.getClass();
                    obj = yaa.P(new yw(this.u, j0jVar, str2, null, 16), this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                List list2 = (List) yaa.x((x2g) obj);
                if (list2 == null) {
                    break;
                }
                break;
        }
        return km5.a;
    }
}
