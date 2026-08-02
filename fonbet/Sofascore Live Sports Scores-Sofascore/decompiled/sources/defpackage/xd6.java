package defpackage;

import com.sofascore.model.newNetwork.EventSeriesResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xd6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ yd6 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd6(yd6 yd6Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = yd6Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        yd6 yd6Var = this.t;
        switch (i) {
            case 0:
                return new xd6(yd6Var, i2, rq3Var, 0);
            default:
                return new xd6(yd6Var, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xd6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<Integer> list;
        int i = this.r;
        int i2 = this.u;
        yd6 yd6Var = this.t;
        rq3 rq3Var = null;
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
                s96 s96Var = yd6Var.e;
                this.s = 1;
                Object d = s96Var.d(i2, this);
                return d == lu3Var ? lu3Var : d;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = yd6Var.e;
                    this.s = 1;
                    s96Var2.getClass();
                    obj = yaa.P(new a86(s96Var2, i2, null, 7), this);
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
                EventSeriesResponse eventSeriesResponse = (EventSeriesResponse) yaa.x((x2g) obj);
                if (eventSeriesResponse == null || (list = eventSeriesResponse.getSeries()) == null) {
                    list = km5.a;
                }
                list.getClass();
                xw3.L(un0.z(yd6Var), null, null, new rh4(yd6Var, list, rq3Var, 17), 3);
                return Unit.a;
        }
    }
}
