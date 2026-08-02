package defpackage;

import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class t2l {
    public static final void a(b3l b3lVar, xtc xtcVar, of3 of3Var, int i) {
        b3l b3lVar2;
        xtc xtcVar2;
        Pair pair;
        String w;
        b3lVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2084662463);
        int i2 = i | (av8Var.i(b3lVar) ? 4 : 2) | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            WeeklyStatus weeklyStatus = b3lVar.b;
            p4b p4bVar = b3lVar.a;
            boolean z = b3lVar.e;
            int i3 = b3lVar.c;
            if (weeklyStatus instanceof WeeklyStatus.WeeklyDemotion) {
                av8Var.d0(-1905852930);
                pair = new Pair(Integer.valueOf(R.string.weekly_challenge_results_relegated), new r13(lz.D(R.color.n_lv_5, av8Var)));
                av8Var.s(false);
            } else if (weeklyStatus instanceof WeeklyStatus.WeeklyPromotion) {
                av8Var.d0(-1905849557);
                pair = new Pair(Integer.valueOf(R.string.weekly_challenge_results_promoted), new r13(lz.D(R.color.secondary_highlight, av8Var)));
                av8Var.s(false);
            } else if (weeklyStatus instanceof WeeklyStatus.WeeklyUnchanged) {
                av8Var.d0(-1905845782);
                pair = new Pair(Integer.valueOf(R.string.weekly_challenge_results_staying), new r13(lz.D(R.color.secondary_highlight, av8Var)));
                av8Var.s(false);
            } else {
                if (!(weeklyStatus instanceof WeeklyStatus.WeeklyUnchangedOnTop)) {
                    throw dmi.h(av8Var, -1905854547, false);
                }
                av8Var.d0(-1905841874);
                pair = new Pair(Integer.valueOf(R.string.weekly_challenge_results_staying_top), new r13(lz.D(R.color.secondary_highlight, av8Var)));
                av8Var.s(false);
            }
            int intValue = ((Number) pair.a).intValue();
            long j = ((r13) pair.b).a;
            if (weeklyStatus instanceof WeeklyStatus.WeeklyUnchangedOnTop) {
                av8Var.d0(1048602927);
                w = oea.w(R.string.weekly_challenge_placement_top_league, new Object[]{weeklyStatus.getPreviousLeagueName(), Integer.valueOf(weeklyStatus.getPreviousRanking())}, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(1048753618);
                w = oea.w(R.string.weekly_challenge_results_placement, new Object[]{Integer.valueOf(weeklyStatus.getPreviousRanking()), weeklyStatus.getPreviousLeagueName()}, av8Var);
                av8Var.s(false);
            }
            String str = w;
            utc utcVar = utc.a;
            xtc e0 = l98.e0(n9e.q(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 8.0f, 16.0f, 8.0f, 8.0f);
            u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
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
            xtc c0 = l98.c0(n9e.q(utcVar, j, o7g.a(12.0f)), 12.0f, 4.0f);
            String v = oea.v(intValue, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, c0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, 0, 0, 131064);
            o6a.d(bkh.p(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 90.0f), p4bVar, av8Var, 6, 0);
            udj.c(p4bVar.c, l98.f0(utcVar, 8.0f, 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131064);
            udj.c(str, l98.f0(bkh.d(utcVar, 1.0f), 16.0f, 4.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 130040);
            av8Var = av8Var;
            xtcVar2 = utcVar;
            b3lVar2 = b3lVar;
            v8a.f(i3, 0, 0, av8Var, n9e.q(bkh.d(l98.f0(xtcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), lz.D(R.color.n_lv_5, av8Var), o7g.a(8.0f)), b3lVar2.d, z);
            av8Var.s(true);
        } else {
            b3lVar2 = b3lVar;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(b3lVar2, xtcVar2, i, 11);
        }
    }
}
