package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.network.response.playerOfTheSeason.POTSHighestRatedPlayersAvailableYears;
import com.sofascore.model.network.response.playerOfTheSeason.POTSTopCompetitionsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eue extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ lue t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eue(lue lueVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = lueVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        lue lueVar = this.t;
        switch (i) {
            case 0:
                return new eue(lueVar, rq3Var, 0);
            default:
                return new eue(lueVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((eue) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        lue lueVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = lueVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.playerOfTheSeasonAvailableYears(Sports.FOOTBALL, this);
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
                return ((POTSHighestRatedPlayersAvailableYears) obj).getYears();
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = lueVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI2.playerOfTheSeasonTopCompetitions(Sports.FOOTBALL, this);
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
                return ((POTSTopCompetitionsResponse) obj).getTopCompetitions();
        }
    }
}
