package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.WinningOddsResponse;
import com.sofascore.model.newNetwork.TeamStreakBettingOddsResponse;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class imd extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imd(umd umdVar, Event event, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = umdVar;
        this.u = event;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new imd(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new imd(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new imd(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new imd(this.t, this.u, this.v, rq3Var, 3);
            default:
                return new imd(this.t, this.u, this.v, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((imd) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        Event event = this.u;
        umd umdVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = umdVar.a;
                int id = event.getId();
                this.s = 1;
                Object featuredOdds = networkCoroutineAPI.featuredOdds(id, i2, this);
                return featuredOdds == lu3Var ? lu3Var : featuredOdds;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = umdVar.a;
                int id2 = event.getId();
                this.s = 1;
                Object featuredOdds2 = networkCoroutineAPI2.featuredOdds(id2, i2, this);
                return featuredOdds2 == lu3Var2 ? lu3Var2 : featuredOdds2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = umdVar.a;
                    int id3 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI3.getWinningOdds(id3, i2, this);
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
                ((WinningOddsResponse) obj).setShouldReverseTeams(event.shouldReverseTeams());
                return obj;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI4 = umdVar.a;
                    int id4 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI4.teamStreakBettingOdds(id4, i2, this);
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
                TeamStreakBettingOddsResponse teamStreakBettingOddsResponse = (TeamStreakBettingOddsResponse) obj;
                Iterator<T> it = teamStreakBettingOddsResponse.getGeneral().iterator();
                while (it.hasNext()) {
                    ((ProviderOdds) it.next()).setShouldReverseOdds(event.shouldReverseTeams());
                }
                Iterator<T> it2 = teamStreakBettingOddsResponse.getHead2head().iterator();
                while (it2.hasNext()) {
                    ((ProviderOdds) it2.next()).setShouldReverseOdds(event.shouldReverseTeams());
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
                int id5 = event.getId();
                this.s = 1;
                Object hasAllOdds = networkCoroutineAPI5.hasAllOdds(id5, i2, this);
                return hasAllOdds == lu3Var5 ? lu3Var5 : hasAllOdds;
        }
    }
}
