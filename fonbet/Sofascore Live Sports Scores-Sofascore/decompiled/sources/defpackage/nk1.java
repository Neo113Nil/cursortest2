package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nk1 extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ qk1 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Season.SubSeasonType v;
    public final /* synthetic */ wj1 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(qk1 qk1Var, int i, Season.SubSeasonType subSeasonType, wj1 wj1Var, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = qk1Var;
        this.u = i;
        this.v = subSeasonType;
        this.w = wj1Var;
        this.x = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        nk1 nk1Var = new nk1(this.t, this.u, this.v, this.w, this.x, rq3Var);
        nk1Var.s = obj;
        return nk1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nk1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        wj1 wj1Var;
        ku3 ku3Var = (ku3) this.s;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        qk1 qk1Var = this.t;
        if (i == 0) {
            y6a.M(obj);
            List j = b.j(xw3.L(ku3Var, null, null, new kk1(qk1Var, this.u, this.v, null), 3), xw3.L(ku3Var, null, null, new lk1(qk1Var, this.x, this.u, this.v, null), 3), xw3.L(ku3Var, null, null, new mk1(qk1Var, this.x, this.u, this.v, null), 3));
            this.s = null;
            this.r = 1;
            if (m6k.V(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        qk1Var.q = null;
        BaseballRankedStatistics baseballRankedStatistics = qk1Var.n;
        wj1 wj1Var2 = this.w;
        if (wj1Var2 == null) {
            fk1 fk1Var = (fk1) qk1Var.l().a();
            wj1Var2 = fk1Var != null ? fk1Var.e : null;
            if (wj1Var2 == null) {
                BaseballRankedStatistics baseballRankedStatistics2 = qk1Var.n;
                if (baseballRankedStatistics2 == null) {
                    wj1Var = null;
                    xw3.L(un0.z(qk1Var), z45.a, null, new pk1(baseballRankedStatistics, qk1Var, wj1Var, this.v, false, this.u, null), 2);
                    return Unit.a;
                }
                BaseballRankedStatistic battingGamesPlayed = baseballRankedStatistics2.getBattingGamesPlayed();
                float l = yid.l(battingGamesPlayed != null ? battingGamesPlayed.getValue() : null);
                BaseballRankedStatistic pitchingGamesPlayed = baseballRankedStatistics2.getPitchingGamesPlayed();
                wj1Var2 = l > yid.l(pitchingGamesPlayed != null ? pitchingGamesPlayed.getValue() : null) ? wj1.b : wj1.c;
            }
        }
        wj1Var = wj1Var2;
        xw3.L(un0.z(qk1Var), z45.a, null, new pk1(baseballRankedStatistics, qk1Var, wj1Var, this.v, false, this.u, null), 2);
        return Unit.a;
    }
}
