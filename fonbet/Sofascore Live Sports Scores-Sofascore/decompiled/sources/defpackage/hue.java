package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.network.response.playerOfTheSeason.POTSLeagueTopPlayersResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSMostAwardsResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSPlayerAwardsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hue extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ lue t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hue(lue lueVar, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = lueVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        lue lueVar = this.t;
        switch (i) {
            case 0:
                return new hue(lueVar, i2, rq3Var, 0);
            case 1:
                return new hue(lueVar, i2, rq3Var, 1);
            default:
                return new hue(lueVar, i2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((hue) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        lue lueVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = lueVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.playerOfTheSeasonLeagueTopPlayers(i2, this);
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
                return ((POTSLeagueTopPlayersResponse) obj).getPlayerOfTheSeasons();
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = lueVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI2.playerOfTheSeasonMostAwards(Sports.FOOTBALL, i2, this);
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
                return ((POTSMostAwardsResponse) obj).getMostAwardedPlayers();
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = lueVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI3.playerOfTheSeasonPlayerAwards(i2, this);
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
                return ((POTSPlayerAwardsResponse) obj).getPlayerOfTheSeasons();
        }
    }
}
