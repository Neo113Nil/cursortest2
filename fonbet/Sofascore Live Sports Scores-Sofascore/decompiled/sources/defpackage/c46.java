package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c46 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ d46 t;
    public final /* synthetic */ MmaEvent u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c46(d46 d46Var, MmaEvent mmaEvent, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = d46Var;
        this.u = mmaEvent;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        MmaEvent mmaEvent = this.u;
        d46 d46Var = this.t;
        switch (i) {
            case 0:
                return new c46(d46Var, mmaEvent, rq3Var, 0);
            default:
                return new c46(d46Var, mmaEvent, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((c46) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 7;
        MmaEvent mmaEvent = this.u;
        d46 d46Var = this.t;
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
                j0j j0jVar = d46Var.f;
                int id = Event.getAwayTeam$default(mmaEvent, null, 1, null).getId();
                this.s = 1;
                j0jVar.getClass();
                Object P = yaa.P(new azi(j0jVar, id, rq3Var, i2), this);
                return P == lu3Var ? lu3Var : P;
            default:
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
                j0j j0jVar2 = d46Var.f;
                int id2 = Event.getHomeTeam$default(mmaEvent, null, 1, null).getId();
                this.s = 1;
                j0jVar2.getClass();
                Object P2 = yaa.P(new azi(j0jVar2, id2, rq3Var, i2), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
        }
    }
}
