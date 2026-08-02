package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonRankedStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonRankedStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kk1 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ qk1 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Season.SubSeasonType u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(qk1 qk1Var, int i, Season.SubSeasonType subSeasonType, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = qk1Var;
        this.t = i;
        this.u = subSeasonType;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new kk1(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kk1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        BaseballPlayerSeasonRankedStatistics statistics;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        BaseballRankedStatistics baseballRankedStatistics = null;
        qk1 qk1Var = this.s;
        if (i == 0) {
            y6a.M(obj);
            wve wveVar = qk1Var.l;
            int i2 = qk1Var.m;
            String label = this.u.getLabel();
            this.r = 1;
            obj = wveVar.m(i2, this.t, this, label);
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
        BaseballPlayerSeasonRankedStatisticsResponse baseballPlayerSeasonRankedStatisticsResponse = (BaseballPlayerSeasonRankedStatisticsResponse) obj;
        if (baseballPlayerSeasonRankedStatisticsResponse != null && (statistics = baseballPlayerSeasonRankedStatisticsResponse.getStatistics()) != null) {
            baseballRankedStatistics = statistics.getRankings();
        }
        qk1Var.n = baseballRankedStatistics;
        return Unit.a;
    }
}
