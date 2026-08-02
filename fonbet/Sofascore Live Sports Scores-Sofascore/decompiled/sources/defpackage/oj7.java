package defpackage;

import com.sofascore.model.network.response.EventResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oj7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tj7 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj7(int i, int i2, rq3 rq3Var, tj7 tj7Var) {
        super(2, rq3Var);
        this.r = i2;
        this.t = tj7Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        tj7 tj7Var = this.t;
        switch (i) {
            case 0:
                return new oj7(i2, 0, rq3Var, tj7Var);
            case 1:
                return new oj7(i2, 1, rq3Var, tj7Var);
            case 2:
                return new oj7(i2, 2, rq3Var, tj7Var);
            case 3:
                return new oj7(i2, 3, rq3Var, tj7Var);
            default:
                return new oj7(i2, 4, rq3Var, tj7Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((oj7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        tj7 tj7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                wi7 wi7Var = tj7Var.b;
                this.s = 1;
                Object t = wi7Var.t(i2, this);
                return t == lu3Var ? lu3Var : t;
            case 1:
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
                wi7 wi7Var2 = tj7Var.b;
                this.s = 1;
                Object n = wi7Var2.n(i2, this);
                return n == lu3Var2 ? lu3Var2 : n;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    s96 s96Var = tj7Var.a;
                    this.s = 1;
                    obj = s96Var.d(i2, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse != null) {
                    return eventResponse.getEvent();
                }
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                wi7 wi7Var3 = tj7Var.b;
                this.s = 1;
                Object t2 = wi7Var3.t(i2, this);
                return t2 == lu3Var4 ? lu3Var4 : t2;
            default:
                lu3 lu3Var5 = lu3.a;
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
                wi7 wi7Var4 = tj7Var.b;
                this.s = 1;
                Object n2 = wi7Var4.n(i2, this);
                return n2 == lu3Var5 ? lu3Var5 : n2;
        }
    }
}
