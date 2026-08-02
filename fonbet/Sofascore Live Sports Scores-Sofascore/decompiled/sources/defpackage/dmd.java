package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.bettingtips.DroppingOdds;
import com.sofascore.model.network.response.Duel;
import com.sofascore.model.network.response.bettingtips.DroppingOddsResponse;
import com.sofascore.model.network.response.bettingtips.H2HStreaksResponse;
import com.sofascore.model.network.response.bettingtips.TrendingOddsResponse;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dmd extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmd(umd umdVar, int i, String str, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = umdVar;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new dmd(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new dmd(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new dmd(this.t, this.v, this.u, rq3Var, 2);
            case 3:
                return new dmd(this.t, this.u, this.v, rq3Var, 3);
            default:
                return new dmd(this.t, this.v, this.u, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((dmd) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ProviderOdds odds;
        int i = this.r;
        int i2 = this.u;
        String str = this.v;
        umd umdVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = umdVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.droppingOdds(i2, str, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                DroppingOddsResponse droppingOddsResponse = (DroppingOddsResponse) obj;
                for (Event event : droppingOddsResponse.getEvents()) {
                    DroppingOdds droppingOdds = (DroppingOdds) me4.f(event.getId(), droppingOddsResponse.getOddsMap());
                    if (droppingOdds != null) {
                        droppingOdds.setShouldReverseTeams(event.shouldReverseTeams());
                    }
                    DroppingOdds droppingOdds2 = (DroppingOdds) me4.f(event.getId(), droppingOddsResponse.getOddsMap());
                    if (droppingOdds2 != null && (odds = droppingOdds2.getOdds()) != null) {
                        odds.setShouldReverseOdds(event.shouldReverseTeams());
                    }
                }
                return obj;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = umdVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI2.h2hStreaks(i2, str, this);
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
                H2HStreaksResponse h2HStreaksResponse = (H2HStreaksResponse) obj;
                for (Event event2 : h2HStreaksResponse.getEvents()) {
                    Duel duel = (Duel) me4.f(event2.getId(), h2HStreaksResponse.getH2hMap());
                    if (duel != null) {
                        duel.setShouldReverseTeams(event2.shouldReverseTeams());
                    }
                }
                return obj;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = umdVar.a;
                this.s = 1;
                Object recommendedPrematchTopVotedOdds = networkCoroutineAPI3.recommendedPrematchTopVotedOdds(str, i2, this);
                return recommendedPrematchTopVotedOdds == lu3Var3 ? lu3Var3 : recommendedPrematchTopVotedOdds;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI4 = umdVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI4.trendingOdds(i2, str, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                TrendingOddsResponse trendingOddsResponse = (TrendingOddsResponse) obj;
                for (Event event3 : trendingOddsResponse.getEvents()) {
                    ProviderOdds providerOdds = (ProviderOdds) me4.f(event3.getId(), trendingOddsResponse.getOddsMap());
                    if (providerOdds != null) {
                        providerOdds.setShouldReverseOdds(event3.shouldReverseTeams());
                    }
                }
                return obj;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = umdVar.a;
                this.s = 1;
                Object hasRecommendedPrematchTopVotedOdds = networkCoroutineAPI5.hasRecommendedPrematchTopVotedOdds(str, i2, this);
                return hasRecommendedPrematchTopVotedOdds == lu3Var5 ? lu3Var5 : hasRecommendedPrematchTopVotedOdds;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmd(umd umdVar, String str, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = umdVar;
        this.v = str;
        this.u = i;
    }
}
