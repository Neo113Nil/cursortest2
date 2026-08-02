package defpackage;

import com.sofascore.model.fantasy.FantasyUserRoundRanking;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b17 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c17 b;

    public /* synthetic */ b17(c17 c17Var, int i) {
        this.a = i;
        this.b = c17Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c17 c17Var = this.b;
        utc utcVar = utc.a;
        int i2 = 1;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (booleanValue) {
                    av8Var.d0(-1154862861);
                    s6a.f(36.0f, 4.0f, 438, 56, 0L, 0L, av8Var, bkh.c);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1154594928);
                    kg0 kg0Var = ww9.f;
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5);
                    u23 a = t23.a(kg0Var, kv1Var, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    String v = oea.v(R.string.fantasy_ranking_overview_title, av8Var);
                    long j = r13.d;
                    rha.b(v, null, j, av8Var, 384, 2);
                    FantasyUserRoundRanking fantasyUserRoundRanking = c17Var.a;
                    if (fantasyUserRoundRanking != null) {
                        bf3.r(24.0f, 88605167, av8Var, av8Var, utcVar);
                        String v2 = oea.v(R.string.fantasy_global_league, av8Var);
                        boolean isGlobal = fantasyUserRoundRanking.isGlobal();
                        int rank = fantasyUserRoundRanking.getRank();
                        Integer previousRank = fantasyUserRoundRanking.getPreviousRank();
                        gvd.h(v2, rank, fantasyUserRoundRanking.getTotalTeams(), previousRank != null ? previousRank.intValue() - fantasyUserRoundRanking.getRank() : 0, isGlobal, null, av8Var, 0, 32);
                        av8Var = av8Var;
                        av8Var.s(false);
                    } else {
                        av8Var.d0(89130834);
                        av8Var.s(false);
                    }
                    if (c17Var.b.isEmpty()) {
                        av8Var.d0(90598994);
                        av8Var.s(false);
                    } else {
                        bf3.r(24.0f, 89238218, av8Var, av8Var, utcVar);
                        rha.b(oea.v(R.string.private_leagues, av8Var), null, j, av8Var, 384, 2);
                        nq8.h(av8Var, bkh.e(utcVar, 24.0f));
                        av8 av8Var2 = av8Var;
                        s02.n(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), new ng0(8.0f, true, new l1(kv1Var, 5)), new ng0(8.0f, true, new a70(6)), null, 2, 0, yqo.H(936330585, av8Var, new b17(c17Var, i2)), av8Var2, 1597878, 40);
                        av8Var = av8Var2;
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    av8Var.s(false);
                }
                return Unit.a;
            default:
                kb8 kb8Var = (kb8) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                kb8Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(kb8Var) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int i3 = 0;
                    for (Object obj4 : c17Var.b) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw null;
                        }
                        FantasyUserRoundRanking fantasyUserRoundRanking2 = (FantasyUserRoundRanking) obj4;
                        xtc d = (i3 % 2 == 0 && i3 == b.i(c17Var.b)) ? bkh.d(utcVar, 0.5f) : kb8Var.a(1.0f, utcVar, true);
                        String leagueName = fantasyUserRoundRanking2.getLeagueName();
                        boolean isGlobal2 = fantasyUserRoundRanking2.isGlobal();
                        int rank2 = fantasyUserRoundRanking2.getRank();
                        Integer previousRank2 = fantasyUserRoundRanking2.getPreviousRank();
                        gvd.h(leagueName, rank2, fantasyUserRoundRanking2.getTotalTeams(), previousRank2 != null ? previousRank2.intValue() - fantasyUserRoundRanking2.getRank() : 0, isGlobal2, d, av8Var3, 0, 0);
                        i3 = i4;
                    }
                } else {
                    av8Var3.W();
                }
                return Unit.a;
        }
    }
}
