package defpackage;

import com.sofascore.model.newNetwork.ESportRound;
import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.newNetwork.ESportsGameLineupsResponse;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.EsportsGameStatisticsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xf5 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zf5 t;
    public final /* synthetic */ EsportsGame u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf5(zf5 zf5Var, EsportsGame esportsGame, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = zf5Var;
        this.u = esportsGame;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        EsportsGame esportsGame = this.u;
        zf5 zf5Var = this.t;
        switch (i) {
            case 0:
                return new xf5(zf5Var, esportsGame, rq3Var, 0);
            case 1:
                return new xf5(zf5Var, esportsGame, rq3Var, 1);
            case 2:
                return new xf5(zf5Var, esportsGame, rq3Var, 2);
            default:
                return new xf5(zf5Var, esportsGame, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((xf5) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        zf5 zf5Var = this.t;
        EsportsGame esportsGame = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = zf5Var.a;
                    int id = esportsGame.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI.eSportsGameBans(id, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                ((ESportsBansResponse) obj).setShouldReverseTeams(esportsGame.getShouldReverseTeams());
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = zf5Var.a;
                    int id2 = esportsGame.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI2.eSportsGameLineUps(id2, this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                ((ESportsGameLineupsResponse) obj).setShouldReverseTeams(esportsGame.getShouldReverseTeams());
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = zf5Var.a;
                    int id3 = esportsGame.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI3.esportsGameStatistics(id3, this);
                    if (obj == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                ((EsportsGameStatisticsResponse) obj).setShouldReverseTeams(esportsGame.getShouldReverseTeams());
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI4 = zf5Var.a;
                    int id4 = esportsGame.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI4.eSportsGameRounds(id4, this);
                    if (obj == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                ESportsGameRoundsResponse eSportsGameRoundsResponse = (ESportsGameRoundsResponse) obj;
                Iterator<T> it = eSportsGameRoundsResponse.getNormaltimeRounds().iterator();
                while (it.hasNext()) {
                    ((ESportRound) it.next()).setShouldReverseTeams(esportsGame.getShouldReverseTeams());
                }
                List<ESportRound> overtimeRounds = eSportsGameRoundsResponse.getOvertimeRounds();
                if (overtimeRounds != null) {
                    Iterator<T> it2 = overtimeRounds.iterator();
                    while (it2.hasNext()) {
                        ((ESportRound) it2.next()).setShouldReverseTeams(esportsGame.getShouldReverseTeams());
                    }
                }
                break;
        }
        return obj;
    }
}
