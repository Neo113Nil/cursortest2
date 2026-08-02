package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vme extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ xme s;
    public final /* synthetic */ int t;
    public final /* synthetic */ ComparisonSeasonInfo.UniqueTournamentSeasonInfo u;
    public final /* synthetic */ a73 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vme(xme xmeVar, int i, ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo, a73 a73Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = xmeVar;
        this.t = i;
        this.u = uniqueTournamentSeasonInfo;
        this.v = a73Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vme(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vme) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        xme xmeVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            wve wveVar = xmeVar.b;
            ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = this.u;
            int i2 = uniqueTournamentSeasonInfo.a;
            int i3 = uniqueTournamentSeasonInfo.b;
            String str = uniqueTournamentSeasonInfo.c;
            this.r = 1;
            wveVar.getClass();
            obj = yaa.P(new sve(wveVar, this.t, i2, i3, str, null, 1), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse = (PlayerSeasonStatisticsResponse) yaa.x((x2g) obj);
        if (playerSeasonStatisticsResponse != null) {
            return new Pair(new wyg(playerSeasonStatisticsResponse.getStatistics(), this.v.c.getPosition(), xmeVar.c), playerSeasonStatisticsResponse.getTeam());
        }
        return null;
    }
}
