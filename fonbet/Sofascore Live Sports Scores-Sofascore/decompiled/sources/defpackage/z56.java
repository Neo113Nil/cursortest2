package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z56 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ b66 t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ Integer v;
    public final /* synthetic */ Integer w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z56(b66 b66Var, Event event, Integer num, Integer num2, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b66Var;
        this.u = event;
        this.v = num;
        this.w = num2;
        this.x = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new z56(this.t, this.u, this.v, this.w, this.x, rq3Var, 0);
            default:
                return new z56(this.t, this.u, this.v, this.w, this.x, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((z56) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Integer num = this.w;
        Integer num2 = this.v;
        Event event = this.u;
        b66 b66Var = this.t;
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
                j0j j0jVar = b66Var.f;
                int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                int intValue = num2.intValue();
                int intValue2 = num.intValue();
                this.s = 1;
                j0jVar.getClass();
                Object P = yaa.P(new gzi(j0jVar, id, intValue, intValue2, this.x, null, 3), this);
                return P == lu3Var ? lu3Var : P;
            default:
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
                j0j j0jVar2 = b66Var.f;
                int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                int intValue3 = num2.intValue();
                int intValue4 = num.intValue();
                this.s = 1;
                j0jVar2.getClass();
                Object P2 = yaa.P(new gzi(j0jVar2, id2, intValue3, intValue4, this.x, null, 3), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
        }
    }
}
