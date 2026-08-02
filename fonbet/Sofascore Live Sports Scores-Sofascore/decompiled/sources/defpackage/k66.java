package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.newNetwork.FeaturedPrematchOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k66 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ l66 t;
    public final /* synthetic */ Tournament u;
    public final /* synthetic */ OddsCountryProvider v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k66(l66 l66Var, Tournament tournament, OddsCountryProvider oddsCountryProvider, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = l66Var;
        this.u = tournament;
        this.v = oddsCountryProvider;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new k66(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new k66(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((k66) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Tournament tournament = this.u;
        l66 l66Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                OddsCountryProvider oddsCountryProvider = this.v;
                if (i2 == 0) {
                    y6a.M(obj);
                    umd umdVar = l66Var.m;
                    int id = tournament.getId();
                    this.s = 1;
                    umdVar.getClass();
                    obj = s9a.r(new mmd(oddsCountryProvider, umdVar, id, null), this);
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
                FeaturedPrematchOddsResponse featuredPrematchOddsResponse = (FeaturedPrematchOddsResponse) obj;
                if (featuredPrematchOddsResponse != null) {
                    return l66Var.t(oddsCountryProvider, featuredPrematchOddsResponse.getOdds());
                }
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                OddsCountryProvider oddsCountryProvider2 = this.v;
                if (i3 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = l66Var.m;
                    String slug = tournament.getCategory().getSport().getSlug();
                    this.s = 1;
                    umdVar2.getClass();
                    obj = s9a.r(new j8c(oddsCountryProvider2, umdVar2, slug, (rq3) null, 17), this);
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
                FeaturedPrematchOddsResponse featuredPrematchOddsResponse2 = (FeaturedPrematchOddsResponse) obj;
                if (featuredPrematchOddsResponse2 != null) {
                    return l66Var.t(oddsCountryProvider2, featuredPrematchOddsResponse2.getOdds());
                }
                return null;
        }
    }
}
