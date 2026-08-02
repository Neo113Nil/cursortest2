package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vp6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ FantasyCompetitionFixturesFragment b;
    public final /* synthetic */ cdi c;

    public /* synthetic */ vp6(cdi cdiVar, FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment) {
        this.c = cdiVar;
        this.b = fantasyCompetitionFixturesFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        cdi cdiVar = this.c;
        FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    png pngVar = new png(8.0f, uxf.l);
                    xtc u0 = hkg.u0(bkh.c, u0a.J(av8Var), false, 14);
                    WeakHashMap weakHashMap = cal.w;
                    xtc f0 = l98.f0(u0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xw3.s(qea.p(av8Var).e, av8Var).a() + 48.0f, 5);
                    kv1 kv1Var = uxf.o;
                    u23 a = t23.a(pngVar, kv1Var, av8Var, 6);
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
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var, 24960, 10);
                    xtc f02 = l98.f0(n9e.q(d2a.E(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 2.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                    u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, f02);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    q68 q68Var = (q68) cdiVar.getValue();
                    if (q68Var == null) {
                        av8Var.d0(-1587641312);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1587641311);
                        ml4.s(q68Var.b, null, av8Var, 0);
                        av8Var.d0(918623972);
                        for (zwi zwiVar : q68Var.a) {
                            av8Var.a0(2146949522, Integer.valueOf(zwiVar.a.a));
                            l98.j(zwiVar, fantasyCompetitionFixturesFragment.D().h.c.A, null, av8Var, 0);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var, 24960, 10);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    tol.b(khb.a.a(fantasyCompetitionFixturesFragment), yqo.H(-1063224100, av8Var2, new vp6(cdiVar, fantasyCompetitionFixturesFragment)), av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vp6(FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment, e1d e1dVar) {
        this.b = fantasyCompetitionFixturesFragment;
        this.c = e1dVar;
    }
}
