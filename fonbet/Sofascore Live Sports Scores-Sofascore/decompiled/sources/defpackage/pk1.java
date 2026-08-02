package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pk1 extends hoi implements Function2 {
    public final /* synthetic */ BaseballRankedStatistics r;
    public final /* synthetic */ qk1 s;
    public final /* synthetic */ wj1 t;
    public final /* synthetic */ Season.SubSeasonType u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk1(BaseballRankedStatistics baseballRankedStatistics, qk1 qk1Var, wj1 wj1Var, Season.SubSeasonType subSeasonType, boolean z, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = baseballRankedStatistics;
        this.s = qk1Var;
        this.t = wj1Var;
        this.u = subSeasonType;
        this.v = z;
        this.w = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new pk1(this.r, this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pk1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        final xbb xbbVar;
        final ArrayList arrayList;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        BaseballRankedStatistics baseballRankedStatistics = this.r;
        if (baseballRankedStatistics != null) {
            xbb b = a.b();
            BaseballRankedStatistic battingGamesPlayed = baseballRankedStatistics.getBattingGamesPlayed();
            if (yid.l(battingGamesPlayed != null ? battingGamesPlayed.getValue() : null) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b.add(wj1.b);
            }
            BaseballRankedStatistic pitchingGamesPlayed = baseballRankedStatistics.getPitchingGamesPlayed();
            if (yid.l(pitchingGamesPlayed != null ? pitchingGamesPlayed.getValue() : null) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b.add(wj1.c);
            }
            BaseballRankedStatistic fieldingGamesPlayed = baseballRankedStatistics.getFieldingGamesPlayed();
            if (yid.l(fieldingGamesPlayed != null ? fieldingGamesPlayed.getValue() : null) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b.add(wj1.d);
            }
            xbbVar = a.a(b);
        } else {
            xbbVar = null;
        }
        if (baseballRankedStatistics != null) {
            kp5 kp5Var = vj1.w;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : kp5Var) {
                if (((vj1) obj2).a == this.t) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                vj1 vj1Var = (vj1) it.next();
                kp5 kp5Var2 = uj1.C1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : kp5Var2) {
                    uj1 uj1Var = (uj1) obj3;
                    if (uj1Var.a == vj1Var && !uj1Var.j) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    bm1 L = rd0.L((uj1) it2.next(), baseballRankedStatistics, false);
                    if (L != null) {
                        arrayList5.add(L);
                    }
                }
                gv9 W = l6g.W(arrayList5);
                Pair pair = new Pair(vj1Var, W);
                if (W.isEmpty()) {
                    pair = null;
                }
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        final Season.SubSeasonType subSeasonType = this.u;
        final wj1 wj1Var = this.t;
        final qk1 qk1Var = this.s;
        final boolean z = this.v;
        final int i = this.w;
        qk1Var.n(null, new Function1() { // from class: ok1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                jl1 jl1Var;
                nl1 b2;
                jl1 jl1Var2;
                nl1 a;
                fk1 fk1Var = (fk1) obj4;
                vl1 vl1Var = fk1Var.h;
                if (vl1Var == null || z) {
                    vl1Var = null;
                }
                for (am1 am1Var : fk1Var.a) {
                    if (am1Var.a == i) {
                        List list = xbbVar;
                        gv9 W2 = list != null ? l6g.W(list) : null;
                        List list2 = arrayList;
                        gv9 W3 = list2 != null ? l6g.W(list2) : null;
                        ll1 ll1Var = vl1Var != null ? vl1Var.e : null;
                        kl1 kl1Var = vl1Var != null ? vl1Var.g : null;
                        ql1 ql1Var = vl1Var != null ? vl1Var.h : null;
                        String str = (vl1Var == null || (jl1Var2 = vl1Var.j) == null || (a = jl1Var2.a()) == null) ? null : a.c;
                        String str2 = (vl1Var == null || (jl1Var = vl1Var.j) == null || (b2 = jl1Var.b()) == null) ? null : b2.c;
                        Boolean bool = vl1Var != null ? vl1Var.i : null;
                        qk1 qk1Var2 = qk1Var;
                        wj1 wj1Var2 = wj1Var;
                        return fk1.a(fk1Var, null, am1Var, Season.SubSeasonType.this, W2, wj1Var2, W3, false, qk1Var2.t(wj1Var2, ll1Var, kl1Var, ql1Var, str, str2, bool), 1);
                    }
                }
                ogj.m("Collection contains no element matching the predicate.");
                return null;
            }
        });
        return Unit.a;
    }
}
