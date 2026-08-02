package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.PlayerSeasonHeatMapResponse;
import com.sofascore.model.newNetwork.SeasonHeatMapPoint;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tme extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ xme s;
    public final /* synthetic */ int t;
    public final /* synthetic */ ComparisonSeasonInfo.UniqueTournamentSeasonInfo u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tme(xme xmeVar, int i, ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = xmeVar;
        this.t = i;
        this.u = uniqueTournamentSeasonInfo;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new tme(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tme) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v8, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ?? r6;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = this.u;
        List list = null;
        if (i == 0) {
            y6a.M(obj);
            wve wveVar = this.s.b;
            int i2 = uniqueTournamentSeasonInfo.a;
            int i3 = uniqueTournamentSeasonInfo.b;
            this.r = 1;
            wveVar.getClass();
            obj = yaa.P(new qve(wveVar, this.t, i2, i3, null, 1), this);
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
        PlayerSeasonHeatMapResponse playerSeasonHeatMapResponse = (PlayerSeasonHeatMapResponse) yaa.x((x2g) obj);
        if (playerSeasonHeatMapResponse == null) {
            return null;
        }
        int m = yid.m(playerSeasonHeatMapResponse.getMatches());
        List<SeasonHeatMapPoint> points = playerSeasonHeatMapResponse.getPoints();
        if (points != null) {
            List arrayList = new ArrayList();
            for (SeasonHeatMapPoint seasonHeatMapPoint : points) {
                Integer count = seasonHeatMapPoint.getCount();
                if (count != null) {
                    if (count.intValue() <= 0) {
                        count = null;
                    }
                    if (count != null) {
                        int intValue = count.intValue();
                        Double x = seasonHeatMapPoint.getX();
                        if (x != null) {
                            double doubleValue = x.doubleValue();
                            Double y = seasonHeatMapPoint.getY();
                            if (y != null) {
                                Point2D point2D = new Point2D(doubleValue, y.doubleValue());
                                r6 = new ArrayList(intValue);
                                for (int i4 = 0; i4 < intValue; i4++) {
                                    r6.add(point2D);
                                }
                            } else {
                                r6 = km5.a;
                            }
                        } else {
                            r6 = km5.a;
                        }
                        o13.v(r6, arrayList);
                    }
                }
                r6 = km5.a;
                o13.v(r6, arrayList);
            }
            list = arrayList;
        }
        if (list == null) {
            list = km5.a;
        }
        return new ryg(m, list, this.t, uniqueTournamentSeasonInfo.a, uniqueTournamentSeasonInfo.b);
    }
}
