package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.a;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qm4 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qm4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        int i;
        FantasyNewsArticle fantasyNewsArticle = (FantasyNewsArticle) this.b;
        Context context = (Context) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            String imageUrl = fantasyNewsArticle.getImageUrl();
            String title = fantasyNewsArticle.getTitle();
            utc utcVar = utc.a;
            haa.a(imageUrl, title, bkh.e(bkh.d(utcVar, 1.0f), 156.0f), null, mp3.a, av8Var, 1573248, 1976);
            xtc f0 = l98.f0(l98.d0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String title2 = fantasyNewsArticle.getTitle();
            yf8 yf8Var = xth.a;
            udj.c(title2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8 av8Var2 = av8Var;
            if (StringsKt.R(fantasyNewsArticle.getSubtitle())) {
                i = R.color.n_lv_3;
                av8Var2.d0(15771372);
                av8Var2.s(false);
            } else {
                bf3.r(4.0f, 15457125, av8Var2, av8Var2, utcVar);
                String subtitle = fantasyNewsArticle.getSubtitle();
                dfj g = xth.g();
                long D = lz.D(R.color.n_lv_3, av8Var2);
                i = R.color.n_lv_3;
                udj.c(subtitle, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, g, av8Var2, 0, 24960, 110586);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            }
            String P = m6k.P(fantasyNewsArticle, context);
            if (P == null) {
                av8Var2.d0(15830643);
                av8Var2.s(false);
            } else {
                av8Var2.d0(15830644);
                nq8.h(av8Var2, new goa(1.0f, true));
                nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                av8 av8Var3 = av8Var2;
                udj.c(P, null, lz.D(i, av8Var2), null, 0L, null, 0L, null, null, 0L, 1, false, 1, 0, null, xth.g(), av8Var3, 0, 24960, 110586);
                av8Var2 = av8Var3;
                av8Var2.s(false);
            }
            av8Var2.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        yd7 yd7Var = (yd7) this.b;
        Context context = (Context) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
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
            String v = oea.v(R.string.fantasy_price_tracker_graph, av8Var);
            p8g p8gVar = p8g.a;
            sha.a(0, 0, av8Var, p8gVar.a(1.0f, utcVar, true), v);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var);
            long D = lz.D(R.color.n_lv_1, av8Var);
            xtc l = bkh.l(utcVar, 24.0f);
            boolean i = av8Var.i(context);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                O = new c6(context, 22);
                av8Var.n0(O);
            }
            kq9.b(N, null, tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var, 29), D, av8Var, 48, 0);
            bf3.t(av8Var, true, utcVar, 24.0f, av8Var);
            l6g.u(yd7Var.a, yd7Var.g, yd7Var.h, yd7Var.b, null, av8Var, 0);
            xtc f = vxd.f(utcVar, 24.0f, av8Var, utcVar, 1.0f);
            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String v2 = oea.v(R.string.fantasy_lowest_price, av8Var);
            String str = yd7Var.d;
            float f2 = yd7Var.c;
            context.getClass();
            Locale d = dla.d();
            Set set = o84.a;
            l6g.t(v2, str, String.format(d, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(f2)}, 2)), lz.D(R.color.error, av8Var), p8gVar.a(1.0f, utcVar, true), av8Var, 0);
            l6g.t(oea.v(R.string.fantasy_highest_price, av8Var), yd7Var.f, String.format(dla.d(), "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(yd7Var.e)}, 2)), lz.D(R.color.success, av8Var), p8gVar.a(1.0f, utcVar, true), av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        FantasyPlayerUiModel fantasyPlayerUiModel = (FantasyPlayerUiModel) this.b;
        Context context = (Context) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        lv1 lv1Var = uxf.l;
        wxf wxfVar = ww9.b;
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            p4h p4hVar = ww9.d;
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 48);
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
            sha.a(48, 0, av8Var, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.general, av8Var));
            xtc q = n9e.q(l98.d0(vxd.f(utcVar, 8.0f, av8Var, utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
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
            xtc d = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            av8Var.d0(835186685);
            for (Pair pair : b.j(new Pair(oea.v(R.string.pts_per_match, av8Var), fantasyPlayerUiModel.j), new Pair(oea.v(R.string.standings_form, av8Var), fantasyPlayerUiModel.n), new Pair(oea.v(R.string.total_points, av8Var), fantasyPlayerUiModel.o))) {
                v9g.t((String) pair.a, (String) pair.b, new goa(1.0f, true), av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, hf3.g);
            waa.K(av8Var, m4, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode4), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C4, hf3.d);
            av8Var.d0(-1158894522);
            String v = oea.v(R.string.player_price, av8Var);
            Float f = fantasyPlayerUiModel.l;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            context.getClass();
            Locale d3 = dla.d();
            Set set = o84.a;
            Pair pair2 = new Pair(v, String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue)}, 2)));
            String v2 = oea.v(R.string.selected, av8Var);
            Float f2 = fantasyPlayerUiModel.m;
            for (Pair pair3 : b.j(pair2, new Pair(v2, f2 != null ? yid.q(f2.floatValue(), 1) : "-"), new Pair(oea.v(R.string.position, av8Var), fantasyPlayerUiModel.i.a))) {
                v9g.t((String) pair3.a, (String) pair3.b, new goa(1.0f, true), av8Var, 0);
            }
            i.p(av8Var, false, true, true, true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.b;
        gf7 gf7Var = (gf7) this.c;
        xpa xpaVar = (xpa) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        xpaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            String w = oea.w(R.string.last_updated_template, new Object[]{rik.j(context, gf7Var.e.longValue(), bi4.PATTERN_DMM, ", ")}, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(w, l98.f0(l98.d0(bkh.d(xpa.a(xpaVar, utc.a, 7), 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 109560);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.b;
        Function0 function0 = ((qs7) this.c).m;
        ((Integer) obj2).getClass();
        ((View) obj).getClass();
        obj3.getClass();
        if (obj3.equals(1)) {
            nv.z0(context, kv.CLICK, "add_button", "favorite_tab");
            function0.invoke();
        } else if (obj3 instanceof os7) {
            nv.z0(context, kv.CLICK, "add_button", "favorite_tab");
            function0.invoke();
        } else if (obj3 instanceof Team) {
            Set set = wyh.a;
            Team team = (Team) obj3;
            if (wyh.m(team.getSportSlug())) {
                joa joaVar = l5i.a;
                l5i.k(context, team.getType(), team.getId());
            } else if (Intrinsics.c(team.getSportSlug(), Sports.MMA)) {
                int i = MmaFighterActivity.U;
                f7a.x(team.getId(), context);
            } else {
                int i2 = TeamActivity.Z;
                jle.r(context, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
        } else if (obj3 instanceof Player) {
            int i3 = PlayerActivity.Z;
            jle.q(context, ((Player) obj3).getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        } else if (obj3 instanceof UniqueTournament) {
            UniqueTournament uniqueTournament = (UniqueTournament) obj3;
            if (Intrinsics.c(uniqueTournament.getCategory().getSport().getSlug(), Sports.MMA)) {
                int i4 = MmaOrganisationActivity.T;
                inb.F(uniqueTournament.getId(), context);
            } else {
                a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament.getId()), Integer.valueOf(uniqueTournament.getId()), null, null, null, null, 4088);
            }
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        BaseActivity baseActivity = (BaseActivity) this.b;
        vs7 vs7Var = (vs7) this.c;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof Team) {
            Set set = wyh.a;
            Team team = (Team) obj3;
            if (wyh.m(team.getSportSlug())) {
                joa joaVar = l5i.a;
                l5i.k(baseActivity, team.getType(), team.getId());
            } else if (Intrinsics.c(team.getSportSlug(), Sports.MMA)) {
                int i = MmaFighterActivity.U;
                f7a.x(team.getId(), baseActivity);
            } else {
                int i2 = TeamActivity.Z;
                jle.r(baseActivity, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
        } else if (obj3 instanceof Player) {
            int i3 = PlayerActivity.Z;
            jle.q(baseActivity, ((Player) obj3).getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        } else if (obj3 instanceof UniqueTournament) {
            UniqueTournament uniqueTournament = (UniqueTournament) obj3;
            if (Intrinsics.c(uniqueTournament.getCategory().getSport().getSlug(), Sports.MMA)) {
                int i4 = MmaOrganisationActivity.T;
                inb.F(uniqueTournament.getId(), baseActivity);
            } else {
                a99.A(LeagueActivity.h0, baseActivity, Integer.valueOf(uniqueTournament.getId()), Integer.valueOf(uniqueTournament.getId()), null, null, null, null, 4088);
            }
        } else if ((obj3 instanceof us7) && (function0 = vs7Var.m) != null) {
            function0.invoke();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        dy7 dy7Var = (dy7) this.b;
        tc3 tc3Var = (tc3) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
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
            wx7.a(dy7Var.f, av8Var, 0);
            if (dy7Var.b || dy7Var.f != k6c.d) {
                av8Var.d0(-914846757);
                av8Var.s(false);
            } else {
                av8Var.d0(-914935169);
                tc3Var.invoke(av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        u28 u28Var = (u28) this.b;
        Function1 function1 = (Function1) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(utcVar, 16.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 7);
            r9k r9kVar = u28Var.b;
            boolean z = u28Var.e;
            gv9<v28> gv9Var = u28Var.c;
            gv9 gv9Var2 = u28Var.f;
            String a2 = r9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            av8 av8Var2 = av8Var;
            if (!u28Var.g || gv9Var2 == null) {
                i = 10;
                av8Var2.d0(752108677);
                av8Var2.s(false);
            } else {
                av8Var2.d0(751698330);
                av8Var2.d0(-1222676180);
                ArrayList arrayList = new ArrayList(k13.r(gv9Var2, 10));
                Iterator<E> it = gv9Var2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r9k) it.next()).a(av8Var2));
                }
                av8Var2.s(false);
                String f02 = CollectionsKt.f0(arrayList, "\n", null, null, null, 62);
                xtc f03 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                yf8 yf8Var2 = xth.a;
                i = 10;
                udj.c(f02, f03, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            }
            av8Var2.d0(-1222661939);
            ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, i));
            for (v28 v28Var : gv9Var) {
                arrayList2.add(new vt2(v28Var, v28Var.b.a(av8Var2), !z, null, null, null, null, 248));
            }
            av8Var2.s(false);
            gv9 W = l6g.W(arrayList2);
            v28[] v28VarArr = new v28[1];
            Iterator<E> it2 = gv9Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it2.next();
                if (Intrinsics.c(((v28) obj4).a, u28Var.d)) {
                    break;
                }
            }
            v28VarArr[0] = obj4;
            b7 K = l6g.K(v28VarArr);
            boolean g = av8Var2.g(function1);
            Object O = av8Var2.O();
            if (g || O == nf3.a) {
                O = new k46(28, function1);
                av8Var2.n0(O);
            }
            sha.l(W, K, (Function1) O, l98.d0(u6h.C(utcVar, z ? 0.8f : 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), false, jrh.m, av8Var2, 196608);
            av8Var2.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = (HistoricalDataTopPerformanceModal) this.b;
        tlj tljVar = (tlj) this.c;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof fmj) {
            int i = PlayerActivity.Z;
            FragmentActivity requireActivity = historicalDataTopPerformanceModal.requireActivity();
            requireActivity.getClass();
            jle.q(requireActivity, ((fmj) obj3).a.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
        } else if (obj3 instanceof noj) {
            int i2 = TeamActivity.Z;
            FragmentActivity requireActivity2 = historicalDataTopPerformanceModal.requireActivity();
            requireActivity2.getClass();
            jle.r(requireActivity2, ((noj) obj3).a.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        } else if (obj3 instanceof loj) {
            loj lojVar = (loj) obj3;
            EventActivity.h0.C(tljVar.b, lojVar.b.getId(), lojVar.a.getId());
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        c0a c0aVar = (c0a) this.b;
        Function1 function1 = (Function1) this.c;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        int i = c0aVar.e;
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        utc utcVar = utc.a;
        xtc c0 = l98.c0(utcVar, 80.0f, 16.0f);
        k1c c = e12.c(uxf.c, false);
        av8 av8Var = (av8) of3Var;
        int hashCode = Long.hashCode(av8Var.T);
        aee m = av8Var.m();
        xtc C = fqj.C(of3Var, c0);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(of3Var, c, hf3.g);
        waa.K(of3Var, m, hf3.f);
        waa.K(of3Var, Integer.valueOf(hashCode), hf3.j);
        waa.J(of3Var, hf3.k);
        waa.K(of3Var, C, hf3.d);
        oge I = nq8.I(of3Var);
        xtc d = bkh.d(utcVar, 1.0f);
        yf8 yf8Var = xth.a;
        nq8.n(c0aVar.d, I, d, intValue, 5, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7.0f, 1), xth.j(), r13.h, function1, of3Var, 12804480, 0);
        String v = oea.v(R.string.crowdsourcing_dialog_minute, of3Var);
        dfj b = xth.b();
        long D = lz.D(R.color.n_lv_3, of3Var);
        xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
        mv1 mv1Var = uxf.g;
        n12 n12Var = n12.a;
        udj.c(v, n12Var.a(f0, mv1Var), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, b, of3Var, 0, 0, 130040);
        nq8.h(of3Var, n12Var.a(n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 32.0f), lz.D(R.color.n_lv_5, of3Var), o7g.a(32.0f)), mv1Var));
        av8Var2.s(true);
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        d1a d1aVar = (d1a) this.b;
        wzc wzcVar = (wzc) this.c;
        ((Integer) obj3).getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(-353972293);
        e1a a = d1aVar.a(wzcVar, av8Var);
        boolean g = av8Var.g(a);
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            O = new g1a(a);
            av8Var.n0(O);
        }
        g1a g1aVar = (g1a) O;
        av8Var.s(false);
        return g1aVar;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.b;
        Function0 function0 = (Function0) this.c;
        v23 v23Var = (v23) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        v23Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(v23Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            String v = oea.v(R.string.join_the_challenge, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            utc utcVar = utc.a;
            ufa.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, av8Var, l98.f0(v23Var.b(utcVar), 48.0f, 24.0f, 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
            qea.c(6, 0, av8Var, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            n7g a = o7g.a(4.0f);
            t3e t3eVar = new t3e(16.0f, 10.0f, 16.0f, 10.0f);
            p72 p72Var = new p72(lz.D(R.color.primary_default, av8Var), lz.D(R.color.surface_1, av8Var), lz.D(R.color.primary_default, av8Var), lz.D(R.color.surface_1, av8Var));
            boolean i = av8Var.i(context) | av8Var.g(function0);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                O = new rea(context, function0, 0);
                av8Var.n0(O);
            }
            iz8.e((Function0) O, f0, false, a, p72Var, null, null, t3eVar, null, f5p.c, av8Var, 805306416, 356);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x0c3e, code lost:
    
        if (r0 > r3) goto L375;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c8a  */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r7;
        boolean z;
        av8 av8Var;
        int i;
        int i2;
        j67 j67Var;
        ?? r14;
        int i3;
        int i4;
        int i5;
        String str;
        int i6 = this.a;
        int i7 = 8;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i6) {
            case 0:
                f7d f7dVar = (f7d) obj5;
                e7d e7dVar = (e7d) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    f7dVar.b.invoke(e7dVar, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 1:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                s22 s22Var = (s22) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    kx4 kx4Var = (kx4) av8Var3.k(dh3.h);
                    jej Q = h5a.Q(0, 0, 1, av8Var3);
                    yf8 yf8Var = xth.a;
                    int b = wzb.b(wzb.b(kx4Var.H0(s22Var.c()) - ((int) (jej.a(Q, "/", xth.b(), 1020).c >> 32))) / 2.0f);
                    int i8 = (int) (jej.a(Q, str2, xth.b(), 1020).c >> 32);
                    int i9 = (int) (jej.a(Q, str3, xth.b(), 1020).c >> 32);
                    if (i8 < b) {
                        b = (b + b) - i8;
                        break;
                    } else if (i9 < b) {
                        int i10 = (b + b) - i9;
                        if (i10 <= i8) {
                            i8 = i10;
                        }
                        float C0 = kx4Var.C0(i8);
                        float C02 = kx4Var.C0(i9);
                        xtc g = bkh.g(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        l8g a = k8g.a(ww9.b, uxf.m, av8Var3, 48);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m = av8Var3.m();
                        xtc C = fqj.C(av8Var3, g);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.q0();
                        } else {
                            av8Var3.l(zg3Var);
                        }
                        waa.K(av8Var3, a, hf3.g);
                        waa.K(av8Var3, m, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C, hf3.d);
                        udj.c(str2, bkh.p(utcVar, C0), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 109560);
                        udj.c(" / ", null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.b(), av8Var3, 6, 24576, 113658);
                        udj.c(str3, bkh.p(utcVar, C02), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 109560);
                        av8Var3.s(true);
                    } else {
                        if (i8 > b) {
                            i8 = b;
                        }
                        if (i9 <= b) {
                            b = i9;
                        }
                        i9 = b;
                        float C03 = kx4Var.C0(i8);
                        float C022 = kx4Var.C0(i9);
                        xtc g2 = bkh.g(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
                        int hashCode2 = Long.hashCode(av8Var3.T);
                        aee m2 = av8Var3.m();
                        xtc C2 = fqj.C(av8Var3, g2);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                        }
                        waa.K(av8Var3, a2, hf3.g);
                        waa.K(av8Var3, m2, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode2), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C2, hf3.d);
                        udj.c(str2, bkh.p(utcVar, C03), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 109560);
                        udj.c(" / ", null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.b(), av8Var3, 6, 24576, 113658);
                        udj.c(str3, bkh.p(utcVar, C022), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 109560);
                        av8Var3.s(true);
                    }
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 2:
                fv5 fv5Var = (fv5) obj5;
                Function2 function2 = (Function2) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    wkc wkcVar = fv5Var.f;
                    xtc b0 = l98.b0(utcVar, 8.0f);
                    boolean g3 = av8Var4.g(function2);
                    Object O = av8Var4.O();
                    if (g3 || O == a99Var) {
                        O = new su5(0, function2);
                        av8Var4.n0(O);
                    }
                    c6o.c(wkcVar, b0, (Function1) O, av8Var4, 48);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 3:
                ww5 ww5Var = (ww5) obj5;
                Function1 function1 = (Function1) obj4;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    e9b e9bVar = ww5Var.a;
                    gv9 gv9Var = e9bVar.b.a;
                    TeamSelection teamSelection = e9bVar.c;
                    boolean g4 = av8Var5.g(function1);
                    Object O2 = av8Var5.O();
                    if (g4 || O2 == a99Var) {
                        O2 = new vi(24, function1);
                        av8Var5.n0(O2);
                    }
                    xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var5), oyn.e);
                    q.getClass();
                    l4a.a(gv9Var, teamSelection, (Function1) O2, td4.X(q, new s81(4.0f, 7)), null, false, av8Var5, 0, 48);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                Function0 function0 = (Function0) obj5;
                e1d e1dVar = (e1d) obj4;
                of3 of3Var5 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                utc utcVar2 = utc.a;
                xtc d = bkh.d(utcVar2, 1.0f);
                u23 a3 = t23.a(ww9.d, uxf.o, of3Var5, 0);
                av8 av8Var6 = (av8) of3Var5;
                int hashCode3 = Long.hashCode(av8Var6.T);
                aee m3 = av8Var6.m();
                xtc C3 = fqj.C(of3Var5, d);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8 av8Var7 = (av8) of3Var5;
                av8Var7.h0();
                if (av8Var7.S) {
                    av8Var7.l(zg3Var3);
                } else {
                    av8Var7.q0();
                }
                waa.K(of3Var5, a3, hf3.g);
                waa.K(of3Var5, m3, hf3.f);
                waa.K(of3Var5, Integer.valueOf(hashCode3), hf3.j);
                waa.J(of3Var5, hf3.k);
                waa.K(of3Var5, C3, hf3.d);
                String v = oea.v(R.string.voting_opens_at_minute, of3Var5);
                long D = lz.D(R.color.on_color_primary, of3Var5);
                yf8 yf8Var2 = xth.a;
                dfj e = xth.e();
                xtc q2 = n9e.q(bkh.d(l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f), lz.D(R.color.primary_default, of3Var5), o7g.a(12.0f));
                long D2 = lz.D(R.color.n_lv_4, of3Var5);
                Object O3 = av8Var7.O();
                if (O3 == a99Var) {
                    O3 = mz1.e(av8Var7);
                }
                wzc wzcVar = (wzc) O3;
                Object[] objArr = new Object[0];
                Object O4 = av8Var7.O();
                if (O4 == a99Var) {
                    O4 = b74.t;
                    av8Var7.n0(O4);
                }
                udj.c(v, l98.c0(tol.y(q2, true, true, true, D2, wzcVar, new gi(i7, (boh) o3a.N(objArr, (Function0) O4, of3Var5, 48), function0, e1dVar), of3Var5, 0), 16.0f, 8.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, e, of3Var5, 0, 0, 130040);
                kq9.b(s6a.N(R.drawable.ic_container_pointer, 6, of3Var5), null, haa.v(bkh.m(utcVar2, 40.0f, 10.0f), 180.0f).z(new we9(uxf.p)), lz.D(R.color.primary_default, of3Var5), of3Var5, 48, 0);
                av8Var7.s(true);
                return Unit.a;
            case 5:
                ArrayList arrayList = (ArrayList) obj5;
                Function1 function12 = (Function1) obj4;
                xpa xpaVar = (xpa) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var6).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var6;
                if (av8Var8.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    t3e B = l98.B(8.0f, 2);
                    xtc f0 = l98.f0(xpa.a(xpaVar, utcVar, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                    boolean i11 = av8Var8.i(arrayList) | av8Var8.g(function12);
                    Object O5 = av8Var8.O();
                    if (i11 || O5 == a99Var) {
                        O5 = new xw5(20, arrayList, function12);
                        av8Var8.n0(O5);
                    }
                    v8a.c(f0, null, B, ng0Var, null, null, false, null, (Function1) O5, av8Var8, 24960, 490);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 6:
                ko6 ko6Var = (ko6) obj5;
                Function1 function13 = (Function1) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var7 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var7).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var7;
                if (!av8Var9.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    av8Var9.W();
                } else if (booleanValue) {
                    av8Var9.d0(-1765739070);
                    s6a.f(48.0f, 6.0f, 432, 57, 0L, 0L, av8Var9, null);
                    av8Var9.s(false);
                } else {
                    av8Var9.d0(-1765570306);
                    xtc f02 = l98.f0(hkg.u0(bkh.d(utcVar, 1.0f), hkg.o0(av8Var9), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 7);
                    u23 a4 = t23.a(ww9.d, uxf.o, av8Var9, 0);
                    int hashCode4 = Long.hashCode(av8Var9.T);
                    aee m4 = av8Var9.m();
                    xtc C4 = fqj.C(av8Var9, f02);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var4);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a4, hf3.g);
                    waa.K(av8Var9, m4, hf3.f);
                    waa.K(av8Var9, Integer.valueOf(hashCode4), hf3.j);
                    waa.J(av8Var9, hf3.k);
                    waa.K(av8Var9, C4, hf3.d);
                    gv9 gv9Var2 = ko6Var.a;
                    gv9 gv9Var3 = ko6Var.b;
                    if (gv9Var2.isEmpty()) {
                        r7 = 0;
                        av8Var9.d0(471587718);
                        av8Var9.s(false);
                    } else {
                        av8Var9.d0(471288847);
                        r7 = 0;
                        d2a.c(0, av8Var9, null, oea.v(R.string.fantasy_public_league_chat, av8Var9));
                        Iterator<E> it = ko6Var.a.iterator();
                        while (it.hasNext()) {
                            c6o.d((s37) it.next(), function13, null, av8Var9, 0);
                        }
                        av8Var9.s(false);
                    }
                    if (gv9Var3.isEmpty()) {
                        av8Var9.d0(471955750);
                        av8Var9.s(r7);
                    } else {
                        av8Var9.d0(471653996);
                        d2a.c(r7, av8Var9, null, oea.v(R.string.fantasy_private_leagues_chat, av8Var9));
                        Iterator<E> it2 = gv9Var3.iterator();
                        while (it2.hasNext()) {
                            c6o.d((s37) it2.next(), function13, null, av8Var9, r7);
                        }
                        av8Var9.s(r7);
                    }
                    av8Var9.s(true);
                    av8Var9.s(r7);
                }
                return Unit.a;
            case 7:
                do7 do7Var = (do7) obj5;
                Function0 function02 = (Function0) obj4;
                of3 of3Var8 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var10 = (av8) of3Var8;
                if (av8Var10.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    s02.q(do7Var, function02, null, av8Var10, 0);
                    String v2 = oea.v(R.string.season_statistics, av8Var10);
                    yf8 yf8Var3 = xth.a;
                    dfj j = xth.j();
                    long D3 = lz.D(R.color.on_color_primary, av8Var10);
                    utc utcVar3 = utc.a;
                    udj.c(v2, l98.d0(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, av8Var10, 48, 24960, 110584);
                    lv1 lv1Var = uxf.m;
                    ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                    xtc b02 = l98.b0(bkh.d(utcVar3, 1.0f), 16.0f);
                    l8g a5 = k8g.a(ng0Var2, lv1Var, av8Var10, 54);
                    int hashCode5 = Long.hashCode(av8Var10.T);
                    aee m5 = av8Var10.m();
                    xtc C5 = fqj.C(av8Var10, b02);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var5);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a5, hf3.g);
                    waa.K(av8Var10, m5, hf3.f);
                    waa.K(av8Var10, Integer.valueOf(hashCode5), hf3.j);
                    waa.J(av8Var10, hf3.k);
                    waa.K(av8Var10, C5, hf3.d);
                    String v3 = oea.v(R.string.points, av8Var10);
                    Locale locale = Locale.ROOT;
                    String upperCase = v3.toUpperCase(locale);
                    upperCase.getClass();
                    Integer num = do7Var.d;
                    ev6 ev6Var = do7Var.c;
                    String i12 = num != null ? dla.i(num) : null;
                    Regex regex = yid.a;
                    String str4 = i12 == null ? "-" : i12;
                    List list = dla.a;
                    String w = oea.w(R.string.fantasy_avg_points, new Object[]{dla.i(Integer.valueOf(wzb.b(ev6Var.v)))}, av8Var10);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    s02.x(upperCase, str4, w, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var10, 0);
                    String upperCase2 = oea.v(R.string.rank, av8Var10).toUpperCase(locale);
                    upperCase2.getClass();
                    Integer num2 = do7Var.l;
                    String i13 = num2 != null ? dla.i(num2) : null;
                    String str5 = i13 == null ? "-" : i13;
                    String w2 = oea.w(R.string.fantasy_rank_of_n, new Object[]{dla.i(Integer.valueOf((int) ev6Var.t))}, av8Var10);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    s02.x(upperCase2, str5, w2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var10, 0);
                    av8Var10.s(true);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 8:
                hr6 hr6Var = (hr6) obj5;
                xhf xhfVar = (xhf) obj4;
                m12 m12Var = (m12) obj;
                of3 of3Var9 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                m12Var.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var9).g(m12Var) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var9;
                if (av8Var11.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    phf.a.a(xhfVar, hr6Var.t, m12Var.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var11), lz.D(R.color.primary_default, av8Var11), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var11, 0, 32);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 9:
                Function1 function14 = (Function1) obj4;
                of3 of3Var10 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                String v4 = oea.v(R.string.fantasy_how_to_play_button, of3Var10);
                xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                int i14 = fr6.a[((hr6) obj5).a.c.d.ordinal()];
                if (i14 == 1) {
                    z = false;
                    av8Var = (av8) of3Var10;
                    i = R.string.fantasy_how_to_play_title;
                    i2 = -2050957331;
                } else {
                    if (i14 != 2) {
                        throw dmi.h((av8) of3Var10, -2050960796, false);
                    }
                    av8Var = (av8) of3Var10;
                    i = R.string.fantasy_new_to_elite_faceoff;
                    i2 = -2050953328;
                    z = false;
                }
                String k = ljg.k(av8Var, i2, i, av8Var, z);
                av8 av8Var12 = (av8) of3Var10;
                boolean g5 = av8Var12.g(function14);
                Object O6 = av8Var12.O();
                if (g5 || O6 == a99Var) {
                    O6 = new is5(13, function14);
                    av8Var12.n0(O6);
                }
                Function0 function03 = (Function0) O6;
                boolean g6 = av8Var12.g(function14);
                Object O7 = av8Var12.O();
                if (g6 || O7 == a99Var) {
                    O7 = new is5(17, function14);
                    av8Var12.n0(O7);
                }
                ao2.c(k, v4, function03, d0, (Function0) O7, av8Var12, 3072);
                return Unit.a;
            case 10:
                hu6 hu6Var = (hu6) obj5;
                xhf xhfVar2 = (xhf) obj4;
                m12 m12Var2 = (m12) obj;
                of3 of3Var11 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                m12Var2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((av8) of3Var11).g(m12Var2) ? 4 : 2;
                }
                av8 av8Var13 = (av8) of3Var11;
                if (av8Var13.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    phf.a.a(xhfVar2, hu6Var.s, m12Var2.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var13), lz.D(R.color.primary_default, av8Var13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var13, 0, 32);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 11:
                wu6 wu6Var = (wu6) obj5;
                Function1 function15 = (Function1) obj4;
                of3 of3Var12 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var14 = (av8) of3Var12;
                if (av8Var14.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    nq8.h(av8Var14, bkh.e(utcVar, 8.0f));
                    ng0 ng0Var3 = new ng0(8.0f, true, new a70(6));
                    t3e B2 = l98.B(16.0f, 2);
                    boolean g7 = av8Var14.g(wu6Var) | av8Var14.g(function15);
                    Object O8 = av8Var14.O();
                    if (g7 || O8 == a99Var) {
                        O8 = new xw5(27, wu6Var, function15);
                        av8Var14.n0(O8);
                    }
                    v8a.c(null, null, B2, ng0Var3, null, null, false, null, (Function1) O8, av8Var14, 24960, 491);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 12:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                tgj.f((il8) obj5, (Function0) obj4, l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 2.0f, 3), (of3) obj2, 384);
                return Unit.a;
            case 13:
                j67 j67Var2 = (j67) obj5;
                ev6 ev6Var2 = (ev6) obj4;
                of3 of3Var13 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var15 = (av8) of3Var13;
                if (av8Var15.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    rd0.j(j67Var2, ev6Var2, null, av8Var15, 0);
                } else {
                    av8Var15.W();
                }
                return Unit.a;
            case 14:
                String str6 = (String) obj5;
                j67 j67Var3 = (j67) obj4;
                of3 of3Var14 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var16 = (av8) of3Var14;
                if (av8Var16.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    xtc f03 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 2);
                    u23 a6 = t23.a(ww9.d, kv1Var, av8Var16, 48);
                    int hashCode6 = Long.hashCode(av8Var16.T);
                    aee m6 = av8Var16.m();
                    xtc C6 = fqj.C(av8Var16, f03);
                    if3.k7.getClass();
                    zg3 zg3Var6 = hf3.b;
                    av8Var16.h0();
                    if (av8Var16.S) {
                        av8Var16.l(zg3Var6);
                    } else {
                        av8Var16.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var16, a6, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var16, m6, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode6);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var16, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var16, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var16, C6, f50Var3);
                    rha.b(oea.v(R.string.fantasy_league_info, av8Var16), null, 0L, av8Var16, 0, 6);
                    if (str6 == null || StringsKt.R(str6)) {
                        av8Var16.d0(-560403606);
                        av8Var16.s(false);
                    } else {
                        bf3.r(16.0f, -560703438, av8Var16, av8Var16, utcVar);
                        yf8 yf8Var4 = xth.a;
                        udj.c(str6, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var16), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var16, 48, 0, 131064);
                        av8Var16.s(false);
                    }
                    xtc f = vxd.f(utcVar, 16.0f, av8Var16, utcVar, 1.0f);
                    wxf wxfVar = ww9.b;
                    lv1 lv1Var2 = uxf.l;
                    l8g a7 = k8g.a(wxfVar, lv1Var2, av8Var16, 0);
                    int hashCode7 = Long.hashCode(av8Var16.T);
                    aee m7 = av8Var16.m();
                    xtc C7 = fqj.C(av8Var16, f);
                    av8Var16.h0();
                    if (av8Var16.S) {
                        av8Var16.l(zg3Var6);
                    } else {
                        av8Var16.q0();
                    }
                    waa.K(av8Var16, a7, f50Var);
                    waa.K(av8Var16, m7, ff3Var);
                    bf3.s(hashCode7, av8Var16, f50Var2, av8Var16, ryVar);
                    waa.K(av8Var16, C7, f50Var3);
                    p8g p8gVar = p8g.a;
                    l4a.c(oea.v(R.string.teams, av8Var16), String.valueOf(j67Var3.f), p8gVar.a(1.0f, utcVar, true), av8Var16, 0);
                    nq8.h(av8Var16, bkh.p(utcVar, 8.0f));
                    xtc a8 = p8gVar.a(1.0f, utcVar, true);
                    String v5 = oea.v(R.string.fantasy_league_type, av8Var16);
                    FantasyLeagueType fantasyLeagueType = j67Var3.j;
                    int i15 = fantasyLeagueType == null ? -1 : f47.a[fantasyLeagueType.ordinal()];
                    if (i15 == 1) {
                        j67Var = j67Var3;
                        r14 = 0;
                        i3 = -766363512;
                        i4 = R.string.fantasy_global;
                    } else if (i15 == 2) {
                        j67Var = j67Var3;
                        r14 = 0;
                        i3 = -766360375;
                        i4 = R.string.fantasy_private;
                    } else if (i15 == 3) {
                        j67Var = j67Var3;
                        r14 = 0;
                        i3 = -766357240;
                        i4 = R.string.fantasy_random;
                    } else if (i15 != 4) {
                        i3 = -766351617;
                        i4 = R.string.other;
                        j67Var = j67Var3;
                        r14 = 0;
                    } else {
                        j67Var = j67Var3;
                        r14 = 0;
                        i3 = -766354103;
                        i4 = R.string.fantasy_country;
                    }
                    l4a.c(v5, ljg.k(av8Var16, i3, i4, av8Var16, r14), a8, av8Var16, r14);
                    bf3.t(av8Var16, true, utcVar, 8.0f, av8Var16);
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    l8g a9 = k8g.a(wxfVar, lv1Var2, av8Var16, r14);
                    int hashCode8 = Long.hashCode(av8Var16.T);
                    aee m8 = av8Var16.m();
                    xtc C8 = fqj.C(av8Var16, d2);
                    av8Var16.h0();
                    if (av8Var16.S) {
                        av8Var16.l(zg3Var6);
                    } else {
                        av8Var16.q0();
                    }
                    waa.K(av8Var16, a9, f50Var);
                    waa.K(av8Var16, m8, ff3Var);
                    bf3.s(hashCode8, av8Var16, f50Var2, av8Var16, ryVar);
                    waa.K(av8Var16, C8, f50Var3);
                    xtc a10 = p8gVar.a(1.0f, utcVar, true);
                    String v6 = oea.v(R.string.fantasy_admin, av8Var16);
                    j67 j67Var4 = j67Var;
                    String str7 = j67Var4.g;
                    if (str7 == null) {
                        i5 = 0;
                        str7 = ljg.k(av8Var16, 1039212857, R.string.app_name, av8Var16, false);
                    } else {
                        i5 = 0;
                        av8Var16.d0(1039212113);
                        av8Var16.s(false);
                    }
                    l4a.c(v6, str7, a10, av8Var16, i5);
                    nq8.h(av8Var16, bkh.p(utcVar, 8.0f));
                    xtc a11 = p8gVar.a(1.0f, utcVar, true);
                    String v7 = oea.v(R.string.fantasy_created_league_date, av8Var16);
                    Long l = j67Var4.h;
                    if (l != null) {
                        long longValue = l.longValue();
                        bi4 bi4Var = bi4.PATTERN_DMY;
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        str = fc6.i(longValue, hk4.a(bi4Var.d()));
                    } else {
                        str = "-";
                    }
                    l4a.c(v7, str, a11, av8Var16, 0);
                    av8Var16.s(true);
                    av8Var16.s(true);
                } else {
                    av8Var16.W();
                }
                return Unit.a;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj5;
                Function1 function16 = (Function1) obj4;
                of3 of3Var15 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var17 = (av8) of3Var15;
                if (av8Var17.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    boolean g8 = av8Var17.g(function16) | av8Var17.e(fantasyCompetitionType.ordinal());
                    Object O9 = av8Var17.O();
                    if (g8 || O9 == a99Var) {
                        O9 = new w47(i7, function16, fantasyCompetitionType);
                        av8Var17.n0(O9);
                    }
                    wkn.h(fantasyCompetitionType, (Function1) O9, null, av8Var17, 0);
                } else {
                    av8Var17.W();
                }
                return Unit.a;
            case 17:
                d97 d97Var = (d97) obj5;
                qug qugVar = (qug) obj4;
                of3 of3Var16 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var18 = (av8) of3Var16;
                if (av8Var18.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    a.a(d97Var.a, null, qugVar, av8Var18, 0, 2);
                } else {
                    av8Var18.W();
                }
                return Unit.a;
            case 18:
                return b(obj, obj2, obj3);
            case 19:
                return c(obj, obj2, obj3);
            case 20:
                return d(obj, obj2, obj3);
            case 21:
                return e(obj, obj2, obj3);
            case 22:
                return f(obj, obj2, obj3);
            case 23:
                return g(obj, obj2, obj3);
            case 24:
                return h(obj, obj2, obj3);
            case 25:
                return i(obj, obj2, obj3);
            case 26:
                return j(obj, obj2, obj3);
            case 27:
                return k(obj, obj2, obj3);
            case 28:
                return l(obj, obj2, obj3);
            default:
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) obj5;
                ka9 ka9Var = (ka9) obj4;
                ((Integer) obj2).getClass();
                g6c g6cVar = (g6c) obj3;
                ((View) obj).getClass();
                g6cVar.getClass();
                if (g6cVar instanceof r5c) {
                    Context requireContext = leagueDetailsFragment.requireContext();
                    requireContext.getClass();
                    yu yuVar = yu.HIGHLIGHTS;
                    Integer valueOf2 = Integer.valueOf(leagueDetailsFragment.G().getId());
                    Highlight highlight = ((r5c) g6cVar).a;
                    nv.g0(requireContext, yuVar, valueOf2, "league", "details", rfo.s(highlight));
                    FragmentActivity requireActivity = leagueDetailsFragment.requireActivity();
                    requireActivity.getClass();
                    rfo.G(highlight, requireActivity, new ij8(28, ka9Var, g6cVar), "Event - media fragment");
                }
                return Unit.a;
        }
    }
}
