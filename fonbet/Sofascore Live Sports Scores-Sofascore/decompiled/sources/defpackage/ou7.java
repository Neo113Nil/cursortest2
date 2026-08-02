package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ou7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tu7 t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ OddsCountryProvider v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou7(tu7 tu7Var, OddsCountryProvider oddsCountryProvider, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.t = tu7Var;
        this.v = oddsCountryProvider;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new ou7(this.t, this.v, this.u, rq3Var);
            case 1:
                return new ou7(this.t, this.u, this.v, rq3Var, 1);
            default:
                return new ou7(this.t, this.u, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ou7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Event event = this.u;
        OddsCountryProvider oddsCountryProvider = this.v;
        tu7 tu7Var = this.t;
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
                int id = event.getId();
                boolean E = ok3.E(event);
                this.s = 1;
                Object k = tu7Var.k(oddsCountryProvider, id, E, this);
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
                umd umdVar = tu7Var.e;
                this.s = 1;
                umdVar.getClass();
                Object r = s9a.r(new kmd(this.v, umdVar, this.u, (rq3) null, 3), this);
                return r == lu3Var2 ? lu3Var2 : r;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = tu7Var.e;
                    this.s = 1;
                    obj = umdVar2.b(event, oddsCountryProvider, this);
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
                return new Pair(oddsCountryProvider, (FeaturedOddsResponse) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou7(tu7 tu7Var, Event event, OddsCountryProvider oddsCountryProvider, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = tu7Var;
        this.u = event;
        this.v = oddsCountryProvider;
    }
}
