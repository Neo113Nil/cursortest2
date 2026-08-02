package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ik extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kk t;
    public final /* synthetic */ OddsCountryProvider u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik(kk kkVar, OddsCountryProvider oddsCountryProvider, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kkVar;
        this.u = oddsCountryProvider;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        OddsCountryProvider oddsCountryProvider = this.u;
        kk kkVar = this.t;
        switch (i) {
            case 0:
                return new ik(kkVar, oddsCountryProvider, rq3Var, 0);
            default:
                return new ik(kkVar, oddsCountryProvider, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ik) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        kk kkVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    umd umdVar = kkVar.m;
                    int id = kkVar.t().getId();
                    String statusType = kkVar.t().getStatusType();
                    boolean shouldReverseTeams = kkVar.t().shouldReverseTeams();
                    this.s = 1;
                    umdVar.getClass();
                    obj = yaa.P(new gmd(umdVar, this.u, statusType, id, shouldReverseTeams, null), this);
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
                return yaa.x((x2g) obj);
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                OddsCountryProvider oddsCountryProvider = this.u;
                if (i3 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = kkVar.m;
                    Event t = kkVar.t();
                    this.s = 1;
                    obj = umdVar2.b(t, oddsCountryProvider, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return new Pair(oddsCountryProvider, (FeaturedOddsResponse) obj);
        }
    }
}
