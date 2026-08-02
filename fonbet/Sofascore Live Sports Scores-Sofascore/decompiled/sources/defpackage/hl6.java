package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.R;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.graphs.view.CricketBowlerView;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hl6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        eld eldVar = (eld) this.b;
        cj cjVar = (cj) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            hi.a(eldVar, cjVar.e, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.b;
        Function1 function1 = (Function1) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        int i = 0;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            xtc d0 = l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean i2 = av8Var.i(context);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i2 || O == a99Var) {
                O = new c6(context, 4);
                av8Var.n0(O);
            }
            xtc Q = bea.Q(d0, (Function0) O, 2);
            boolean i3 = av8Var.i(context) | av8Var.g(function1);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new zj(context, function1, i);
                av8Var.n0(O2);
            }
            l6g.a(0, av8Var, Q, (Function0) O2);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        su suVar = (su) this.c;
        xtc xtcVar = (xtc) obj;
        ((Integer) obj3).getClass();
        xtcVar.getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(-479314189);
        uv uvVar = (uv) av8Var.k(qgb.a);
        Unit unit = Unit.a;
        boolean i = av8Var.i(uvVar) | av8Var.g(str) | av8Var.i(suVar);
        Object O = av8Var.O();
        if (i || O == nf3.a) {
            O = new fa(2, uvVar, str, suVar);
            av8Var.n0(O);
        }
        jca.c(unit, null, (Function1) O, av8Var, 6);
        av8Var.s(false);
        return xtcVar;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        e1d e1dVar = (e1d) this.b;
        BaseEventLineupsFragment baseEventLineupsFragment = (BaseEventLineupsFragment) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((m12) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            vnb vnbVar = (vnb) e1dVar.getValue();
            boolean g = av8Var.g(e1dVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new w30(2, e1dVar);
                av8Var.n0(O);
            }
            wkn.a(vnbVar, null, null, (Function1) O, yqo.H(204803947, av8Var, new kr1(baseEventLineupsFragment, 10)), av8Var, 24576, 6);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        qk1 qk1Var = (qk1) this.b;
        e1d e1dVar = (e1d) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((m12) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            fk1 fk1Var = (fk1) ((vnb) e1dVar.getValue()).a();
            boolean i = av8Var.i(qk1Var);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                kj1 kj1Var = new kj1(1, qk1Var, qk1.class, "onAction", "onAction(Lcom/sofascore/results/player/statistics/season/baseball/BaseballPlayerSeasonStatisticsAction;)V", 0, 6);
                av8Var.n0(kj1Var);
                O = kj1Var;
            }
            ek1.a(fk1Var, (Function1) ((KFunction) O), lz.J(utc.a, jaa.L(av8Var), null), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        e1d e1dVar = (e1d) this.b;
        fk1 fk1Var = (fk1) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            ll1 ll1Var = (ll1) e1dVar.getValue();
            if (ll1Var == null) {
                av8Var.d0(-479263314);
                av8Var.s(false);
            } else {
                av8Var.d0(-479263313);
                boolean z = (fk1Var != null ? fk1Var.e : null) == wj1.c;
                xtc e0 = l98.e0(utc.a, 16.0f, 8.0f, 16.0f, 48.0f);
                String v = oea.v(o02.U(ll1Var, z), av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, e0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        mn1 mn1Var = (mn1) this.b;
        int i = mn1Var.d;
        qug qugVar = (qug) this.c;
        s22 s22Var = (s22) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        s22Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            float c = s22Var.c() / 9.0f;
            float f = i * c;
            utc utcVar = utc.a;
            xtc p = bkh.p(bkh.c(i > 9 ? hkg.Z(utcVar, qugVar, false, 14) : utcVar, 1.0f), f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, p);
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
            m6k.b(0, mn1Var, av8Var, fn0.e(1.0f, bkh.d(utcVar, 1.0f), true));
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            m6k.l(i, mn1Var.e, c, av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        zr1 zr1Var = (zr1) this.b;
        fsf fsfVar = (fsf) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            td4.a(new s1(19, zr1Var, fsfVar), utc.a, null, av8Var, 48, 4);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        y6a.v((Function1) this.c, this.b, (CoroutineContext) obj3);
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        SharedPreferences d;
        ca3 ca3Var = (ca3) this.b;
        CompetitionsFragment competitionsFragment = (CompetitionsFragment) this.c;
        ((Integer) obj2).getClass();
        ((View) obj).getClass();
        obj3.getClass();
        if (obj3 instanceof w93) {
            w93 w93Var = (w93) obj3;
            boolean z = w93Var.d;
            w93Var.d = !z;
            if (z) {
                ca3Var.A();
            } else if (w93Var.c.isEmpty()) {
                w93Var.b.setDownloading(true);
                ca3Var.A();
                la3 D = competitionsFragment.D();
                String str = (String) competitionsFragment.s.getValue();
                str.getClass();
                xw3.L(un0.z(D), null, null, new ts2(w93Var, D, str, (rq3) null), 3);
            } else {
                ca3Var.A();
            }
        } else if (obj3 instanceof y93) {
            y93 y93Var = (y93) obj3;
            y93Var.d = !y93Var.d;
            Context requireContext = competitionsFragment.requireContext();
            boolean z2 = y93Var.d;
            requireContext.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = requireContext.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            sharedPreferences.edit().putBoolean("pinned_leagues_redesign_opened", z2).apply();
            ca3Var.A();
        } else if (obj3 instanceof x93) {
            ((x93) obj3).e = !r13.e;
            ca3Var.A();
        } else if (obj3 instanceof ba3) {
            a99 a99Var = LeagueActivity.h0;
            FragmentActivity requireActivity = competitionsFragment.requireActivity();
            requireActivity.getClass();
            a99.A(a99Var, requireActivity, Integer.valueOf(((ba3) obj3).a), 0, null, null, null, null, 4088);
        } else if (obj3 instanceof PinnedTournament) {
            a99 a99Var2 = LeagueActivity.h0;
            FragmentActivity requireActivity2 = competitionsFragment.requireActivity();
            requireActivity2.getClass();
            a99.A(a99Var2, requireActivity2, Integer.valueOf(((PinnedTournament) obj3).getId()), 0, null, null, null, null, 4088);
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.c;
        gq3 gq3Var = (gq3) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new iq3();
                av8Var.n0(O);
            }
            iq3 iq3Var = (iq3) O;
            iq3Var.a.clear();
            function1.invoke(iq3Var);
            iq3Var.a(gq3Var, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        return CricketBowlerView.o((Player) this.b, (CricketBowlerView) this.c, (n8g) obj, (of3) obj2, ((Integer) obj3).intValue());
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        return CricketWagonWheelView.n((Player) this.b, (CricketWagonWheelView) this.c, (n8g) obj, (of3) obj2, ((Integer) obj3).intValue());
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        e0a e0aVar = (e0a) this.b;
        Function0 function0 = (Function0) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            r34.b(e0aVar.d, function0, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        j64 j64Var = (j64) this.b;
        Function0 function0 = (Function0) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            nq8.h(av8Var, bkh.e(utc.a, 8.0f));
            fcp.J(j64Var.g, function0, null, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        CupTreeDialog cupTreeDialog = (CupTreeDialog) this.b;
        Integer num = (Integer) this.c;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof y21) {
            wxf wxfVar = EventActivity.h0;
            FragmentActivity requireActivity = cupTreeDialog.requireActivity();
            requireActivity.getClass();
            wxf.B(requireActivity, ((y21) obj3).d().getId(), null, null, null, num, 60);
            cupTreeDialog.j();
        }
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        CupTreeExtendedView cupTreeExtendedView = (CupTreeExtendedView) this.b;
        e1d e1dVar = cupTreeExtendedView.isExpanded;
        Function1 function1 = (Function1) this.c;
        lrh lrhVar = (lrh) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = CupTreeExtendedView.p;
        lrhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(lrhVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            int i2 = ((Boolean) ((eoh) e1dVar).getValue()).booleanValue() ? R.drawable.ic_close_in_full : R.drawable.ic_open_in_full;
            lrh lrhVar2 = frh.m;
            if (!lrhVar.equals(lrhVar2)) {
                lrhVar2 = irh.m;
            }
            lrh lrhVar3 = lrhVar2;
            boolean booleanValue = ((Boolean) ((eoh) e1dVar).getValue()).booleanValue();
            boolean i3 = av8Var.i(cupTreeExtendedView) | av8Var.g(function1);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new ix1(29, cupTreeExtendedView, function1);
                av8Var.n0(O);
            }
            qha.g(i2, (Function0) O, null, lrhVar3, booleanValue, false, true, av8Var, 1572864, 36);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        SharedPreferences d;
        DateMatchesFragment dateMatchesFragment = (DateMatchesFragment) this.b;
        ehe eheVar = (ehe) this.c;
        View view = (View) obj;
        wt3.y((Integer) obj2, view, obj3);
        if (obj3 instanceof dhe) {
            dhe dheVar = (dhe) obj3;
            boolean z = !dateMatchesFragment.H().l;
            zqb F = dateMatchesFragment.F();
            String str = (String) dateMatchesFragment.r.getValue();
            str.getClass();
            F.x.j(new sqb(z));
            Application application = F.b;
            application.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = application.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            sharedPreferences.edit().putBoolean("open_pinned_v2".concat(str), z).apply();
            dheVar.a = z;
            dheVar.b = true;
            dateMatchesFragment.G().w(dheVar);
            dateMatchesFragment.H().k(z);
        } else {
            eheVar.O(view, obj3);
        }
        return Unit.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        sz1 sz1Var = (sz1) this.b;
        cdi cdiVar = (cdi) this.c;
        int intValue = ((Integer) obj).intValue();
        of3 of3Var = (of3) obj2;
        int intValue2 = ((Integer) obj3).intValue();
        if ((intValue2 & 6) == 0) {
            intValue2 |= ((av8) of3Var).e(intValue) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue2 & 1, (intValue2 & 19) != 18)) {
            kq9.a(haa.t(intValue, intValue2 & 14, av8Var), sz1Var.b, bkh.c, ((r13) cdiVar.getValue()).a, av8Var, 392, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String a;
        float f;
        ozh ozhVar = (ozh) this.b;
        Function1 function1 = (Function1) this.c;
        s22 s22Var = (s22) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        s22Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            jej Q = h5a.Q(0, 0, 1, av8Var);
            gv9 gv9Var = ozhVar.a;
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (((hzh) obj4).b) {
                    break;
                }
            }
            hzh hzhVar = (hzh) obj4;
            r9k r9kVar = hzhVar != null ? hzhVar.c : null;
            if (r9kVar == null) {
                av8Var.d0(1165246836);
                av8Var.s(false);
                a = null;
            } else {
                av8Var.d0(1561609261);
                a = r9kVar.a(av8Var);
                av8Var.s(false);
            }
            if (a == null) {
                a = "";
            }
            boolean g = av8Var.g(a) | av8Var.g(kx4Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                if (a.length() > 0) {
                    yf8 yf8Var = xth.a;
                    f = kx4Var.C0((int) (jej.a(Q, a, xth.k(), 1004).c >> 32)) + 24.0f;
                } else {
                    f = 96.0f;
                }
                O = new p75(f);
                av8Var.n0(O);
            }
            p75 p75Var = (p75) O;
            float f2 = p75Var.a;
            p75 p75Var2 = new p75(96.0f);
            if (p75Var.compareTo(p75Var2) < 0) {
                p75Var = p75Var2;
            }
            float f3 = p75Var.a;
            p75 p75Var3 = new p75((s22Var.c() - f3) / 4.0f);
            p75 p75Var4 = new p75(48.0f);
            if (p75Var3.compareTo(p75Var4) < 0) {
                p75Var3 = p75Var4;
            }
            Iterator it2 = gv9Var.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (((hzh) it2.next()).b) {
                    break;
                }
                i++;
            }
            boolean e = av8Var.e(i);
            float f4 = p75Var3.a;
            boolean d = e | av8Var.d(f4);
            Object O2 = av8Var.O();
            if (d || O2 == a99Var) {
                O2 = new p75(i >= 0 ? i * f4 : 0.0f);
                av8Var.n0(O2);
            }
            float f5 = ((p75) O2).a;
            boolean e2 = av8Var.e(i) | av8Var.d(f3);
            Object O3 = av8Var.O();
            if (e2 || O3 == a99Var) {
                O3 = new p75(i >= 0 ? f3 : 0.0f);
                av8Var.n0(O3);
            }
            float f6 = ((p75) O3).a;
            h74 h74Var = jg5.a;
            cdi a2 = a60.a(f5, s02.h0(200, 0, h74Var, 2), "indicatorOffset", null, av8Var, 384, 8);
            cdi a3 = a60.a(f6, s02.h0(200, 0, h74Var, 2), "indicatorWidth", null, av8Var, 384, 8);
            g28 g28Var = bkh.c;
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int i2 = i;
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            Iterator p = ljg.p(av8Var, C2, f50Var3, 1602060060, gv9Var);
            while (p.hasNext()) {
                hzh hzhVar2 = (hzh) p.next();
                av8Var.a0(17444314, hzhVar2.a.getSportSlug());
                cdi a5 = a60.a(hzhVar2.b ? f3 : f4, jzh.f(s02.h0(200, 0, null, 6)), "slotWidth", null, av8Var, 384, 8);
                boolean g2 = av8Var.g(function1) | av8Var.g(hzhVar2);
                Object O4 = av8Var.O();
                if (g2 || O4 == a99Var) {
                    O4 = new deh(9, function1, hzhVar2);
                    av8Var.n0(O4);
                }
                jzh.d(hzhVar2, (Function0) O4, bkh.e(bkh.p(utcVar, ((p75) a5.getValue()).a), 48.0f), av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
            if (i2 >= 0) {
                av8Var.d0(1367227995);
                e12.a(0, av8Var, n9e.q(n12.a.a(bkh.e(bkh.p(rd0.O(utcVar, ((p75) a2.getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), ((p75) a3.getValue()).a), 2.0f), uxf.i), lz.D(R.color.on_color_primary, av8Var), oyn.e));
                av8Var.s(false);
            } else {
                av8Var.d0(1367575877);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        ?? r6;
        int i;
        ?? r62;
        int i2;
        int i3;
        xtc t;
        xva xvaVar;
        int i4 = this.a;
        utc utcVar = utc.a;
        Object obj4 = nf3.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i4) {
            case 0:
                il6 il6Var = (il6) obj6;
                Function1 function1 = (Function1) obj5;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    g28 g28Var = bkh.c;
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, g28Var);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    td4.O(il6Var.m, null, 0L, false, false, av8Var2, 0, 30);
                    xtc b0 = l98.b0(utcVar, 16.0f);
                    u23 a = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var2, 6);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    nq8.h(av8Var2, ljg.g(av8Var2, C2, f50Var3, 1.0f, true));
                    String str = il6Var.i;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    yf8 yf8Var = xth.a;
                    udj.c(str2, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
                    x43 x43Var = il6Var.p;
                    pco.p(x43Var.a, x43Var.b, x43Var.c, il6Var.g, null, "external_video_stacked_card", lz.D(R.color.on_color_primary, av8Var2), true, function1, null, av8Var2, 12779520, 528);
                    av8Var2.s(true);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 1:
                Function0 function0 = (Function0) obj6;
                zx6 zx6Var = (zx6) obj5;
                uj7 uj7Var = (uj7) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                uj7Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).e(uj7Var.ordinal()) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int ordinal = uj7Var.ordinal();
                    if (ordinal == 0) {
                        av8Var3.d0(-1881598475);
                        s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var3, bkh.c);
                        av8Var3.s(false);
                    } else if (ordinal == 1) {
                        av8Var3.d0(-1881467066);
                        yqo.f(function0, l98.d0(bkh.r(bkh.c, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 0L, av8Var3, 48, 4);
                        av8Var3.s(false);
                    } else {
                        if (ordinal != 2) {
                            throw dmi.h(av8Var3, -2138905927, false);
                        }
                        av8Var3.d0(-1881076807);
                        Context context = (Context) av8Var3.k(nz.b);
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        WeakHashMap weakHashMap = cal.w;
                        t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, xw3.s(qea.p(av8Var3).e, av8Var3).a() + 48.0f);
                        boolean i5 = av8Var3.i(zx6Var) | av8Var3.i(context);
                        Object O = av8Var3.O();
                        if (i5 || O == obj4) {
                            O = new xw5(29, zx6Var, context);
                            av8Var3.n0(O);
                        }
                        v8a.a(null, null, t3eVar, ng0Var, null, null, false, null, (Function1) O, av8Var3, 24576, 491);
                        av8Var3.s(false);
                    }
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 2:
                FantasyNewsArticlesActivity fantasyNewsArticlesActivity = (FantasyNewsArticlesActivity) obj6;
                e1d e1dVar = (e1d) obj5;
                uj7 uj7Var2 = (uj7) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                int i6 = FantasyNewsArticlesActivity.M;
                uj7Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).e(uj7Var2.ordinal()) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    int ordinal2 = uj7Var2.ordinal();
                    if (ordinal2 == 0) {
                        av8Var4.d0(2065632922);
                        s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var4, bkh.c);
                        av8Var4.s(false);
                    } else if (ordinal2 == 1) {
                        av8Var4.d0(2065802182);
                        boolean i7 = av8Var4.i(fantasyNewsArticlesActivity);
                        Object O2 = av8Var4.O();
                        if (i7 || O2 == obj4) {
                            O2 = new i87(fantasyNewsArticlesActivity, 1);
                            av8Var4.n0(O2);
                        }
                        yqo.f((Function0) O2, l98.d0(hkg.J(), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 0L, av8Var4, 0, 4);
                        av8Var4.s(false);
                    } else {
                        if (ordinal2 != 2) {
                            throw dmi.h(av8Var4, 66632833, false);
                        }
                        av8Var4.d0(2066261974);
                        WeakHashMap weakHashMap2 = cal.w;
                        t3e t3eVar2 = new t3e(8.0f, 8.0f, 8.0f, xw3.s(qea.p(av8Var4).e, av8Var4).a() + 48.0f);
                        ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                        boolean g = av8Var4.g(e1dVar) | av8Var4.i(fantasyNewsArticlesActivity);
                        Object O3 = av8Var4.O();
                        if (g || O3 == obj4) {
                            O3 = new w47(4, e1dVar, fantasyNewsArticlesActivity);
                            av8Var4.n0(O3);
                        }
                        v8a.a(null, null, t3eVar2, ng0Var2, null, null, false, null, (Function1) O3, av8Var4, 24576, 491);
                        av8Var4.s(false);
                    }
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 3:
                ksa ksaVar = (ksa) obj6;
                rm7 rm7Var = (rm7) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var4;
                if (!av8Var5.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    av8Var5.W();
                } else if (booleanValue) {
                    av8Var5.d0(263378303);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var5, bkh.c);
                    av8Var5.s(false);
                } else {
                    av8Var5.d0(263503574);
                    g28 g28Var2 = bkh.c;
                    t3e C3 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    boolean g2 = av8Var5.g(rm7Var);
                    Object O4 = av8Var5.O();
                    if (g2 || O4 == obj4) {
                        O4 = new x16(rm7Var, 26);
                        av8Var5.n0(O4);
                    }
                    v8a.a(g28Var2, ksaVar, C3, null, null, null, false, null, (Function1) O4, av8Var5, 390, PglCryptUtils.BASE64_FAILED);
                    av8Var5.s(false);
                }
                return Unit.a;
            case 4:
                ao7 ao7Var = (ao7) obj6;
                e1d e1dVar2 = (e1d) obj5;
                p3e p3eVar = (p3e) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                p3eVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    kv1 kv1Var = uxf.p;
                    float a2 = p3eVar.a();
                    utc utcVar2 = utc.a;
                    xtc f0 = l98.f0(hkg.u0(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a2, 7).z(bkh.c), hkg.o0(av8Var6), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    u23 a3 = t23.a(ww9.d, kv1Var, av8Var6, 48);
                    int hashCode3 = Long.hashCode(av8Var6.T);
                    aee m3 = av8Var6.m();
                    xtc C4 = fqj.C(av8Var6, f0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var2);
                    } else {
                        av8Var6.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var6, a3, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var6, m3, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var6, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var6, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var6, C4, f50Var6);
                    kg0 kg0Var = ww9.f;
                    lv1 lv1Var = uxf.m;
                    Object obj7 = obj4;
                    xtc c0 = l98.c0(n9e.q(bkh.d(l98.d0(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), lz.D(R.color.n_lv_1, av8Var6), o7g.a(16.0f)), 16.0f, 8.0f);
                    l8g a4 = k8g.a(kg0Var, lv1Var, av8Var6, 54);
                    int hashCode4 = Long.hashCode(av8Var6.T);
                    aee m4 = av8Var6.m();
                    xtc C5 = fqj.C(av8Var6, c0);
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var2);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a4, f50Var4);
                    waa.K(av8Var6, m4, ff3Var2);
                    bf3.s(hashCode4, av8Var6, f50Var5, av8Var6, ryVar2);
                    waa.K(av8Var6, C5, f50Var6);
                    kq9.a(haa.t(R.drawable.ic_warning, 0, av8Var6), null, bkh.l(utcVar2, 24.0f), lz.D(R.color.surface_1, av8Var6), av8Var6, 440, 0);
                    nq8.h(av8Var6, bkh.p(utcVar2, 8.0f));
                    String t2 = oea.t(R.plurals.transfer_player_info, ((vn7) e1dVar2.getValue()).k, new Object[]{Integer.valueOf(((vn7) e1dVar2.getValue()).k)}, av8Var6);
                    yf8 yf8Var2 = xth.a;
                    udj.c(t2, null, lz.D(R.color.surface_1, av8Var6), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var6, 0, 384, 126970);
                    bf3.t(av8Var6, true, utcVar2, 8.0f, av8Var6);
                    gv9 u = ao7Var.u();
                    ho7 ho7Var = ao7Var.f;
                    ev6 ev6Var = ao7Var.g;
                    FantasyCompetitionType fantasyCompetitionType = ev6Var.d;
                    int i8 = ev6Var.c;
                    mj7 mj7Var = ho7Var.a;
                    tol.h(u, i8, fantasyCompetitionType, mj7Var.b, mj7Var.c, ev6Var.A, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var6, 1572864);
                    nq8.h(av8Var6, bkh.e(utcVar2, 8.0f));
                    if (fantasyCompetitionType == FantasyCompetitionType.SEASON) {
                        av8Var6.d0(846249568);
                        xtc d0 = l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        if (ao7Var.v() || ((vn7) e1dVar2.getValue()).g) {
                            i = 0;
                        } else {
                            int i9 = ((vn7) e1dVar2.getValue()).k - ((vn7) e1dVar2.getValue()).a.c;
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            i = i9;
                        }
                        tgj.h((ao7Var.v() || ((vn7) e1dVar2.getValue()).g) ? ((vn7) e1dVar2.getValue()).k : ((vn7) e1dVar2.getValue()).a.c - ((vn7) e1dVar2.getValue()).d, i, ((vn7) e1dVar2.getValue()).g ? 0 : ((vn7) e1dVar2.getValue()).l, ((vn7) e1dVar2.getValue()).c, d0, av8Var6, 24576);
                        av8 av8Var7 = av8Var6;
                        w1l.s(utcVar2, 8.0f, av8Var7, false);
                        av8Var = av8Var7;
                    } else {
                        av8 av8Var8 = av8Var6;
                        av8Var8.d0(846951098);
                        av8Var8.s(false);
                        av8Var = av8Var8;
                    }
                    ArrayList arrayList = (ArrayList) ph0.x(new vl7[]{((vn7) e1dVar2.getValue()).f, ((vn7) e1dVar2.getValue()).e});
                    if (arrayList.isEmpty()) {
                        r6 = 0;
                        av8Var.d0(848320058);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(847114003);
                        udj.c(oea.v(R.string.fantasy_available_tokens, av8Var), l98.f0(bkh.d(l98.d0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, xth.l(), av8Var, 48, 24960, 109560);
                        nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
                        ng0 ng0Var3 = new ng0(8.0f, true, new a70(6));
                        xtc d02 = l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        l8g a5 = k8g.a(ng0Var3, uxf.l, av8Var, 6);
                        int hashCode5 = Long.hashCode(av8Var.T);
                        aee m5 = av8Var.m();
                        xtc C6 = fqj.C(av8Var, d02);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a5, f50Var4);
                        waa.K(av8Var, m5, ff3Var2);
                        bf3.s(hashCode5, av8Var, f50Var5, av8Var, ryVar2);
                        waa.K(av8Var, C6, f50Var6);
                        av8Var.d0(1543837432);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            vl7 vl7Var = (vl7) it.next();
                            goa goaVar = new goa(1.0f, true);
                            boolean i10 = av8Var.i(ao7Var);
                            Object O5 = av8Var.O();
                            Object obj8 = obj7;
                            if (i10 || O5 == obj8) {
                                O5 = new x16(ao7Var, 28);
                                av8Var.n0(O5);
                            }
                            rz8.m(vl7Var, (Function1) O5, goaVar, av8Var, 0);
                            obj7 = obj8;
                        }
                        r6 = 0;
                        ljg.t(av8Var, false, true, false);
                    }
                    if (fantasyCompetitionType == FantasyCompetitionType.WEEKLY) {
                        av8Var.d0(848402890);
                        k53.L(ho7Var.a.c, r6, av8Var, null);
                        av8Var.s(r6);
                    } else {
                        av8Var.d0(848541274);
                        av8Var.s(r6);
                    }
                    av8Var.s(true);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 5:
                jf9 jf9Var = oyn.e;
                a10 a10Var = (a10) obj6;
                cdi cdiVar = (cdi) obj5;
                s22 s22Var = (s22) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                s22Var.getClass();
                long j = s22Var.b;
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(s22Var) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var6;
                if (av8Var9.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    if (a10Var != null) {
                        av8Var9.d0(629874404);
                        cx1 cx1Var = new cx1(a10Var);
                        int h = an3.h(j);
                        int g3 = an3.g(j);
                        long j2 = cx1Var.i;
                        float f = h;
                        float intBitsToFloat = (g3 * (Float.intBitsToFloat((int) (d7a.I(j2) >> 32)) / Float.intBitsToFloat((int) (d7a.I(j2) & 4294967295L)))) - f;
                        if (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            intBitsToFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        float floatValue = ((Number) cdiVar.getValue()).floatValue() * (-(intBitsToFloat / 2.0f));
                        boolean z = Float.intBitsToFloat((int) (d7a.I(j2) >> 32)) < f;
                        op3 op3Var = z ? mp3.a : mp3.c;
                        av8Var9.d0(990186689);
                        if (z) {
                            av8Var9.d0(908299124);
                            t = bkh.d(utcVar, 1.0f);
                            av8Var9.s(false);
                        } else {
                            av8Var9.d0(1252862483);
                            t = bkh.t(utcVar, 1);
                            av8Var9.s(false);
                        }
                        xtc u2 = yqo.u(bkh.c(t, 1.0f), 3.0f, 3.0f, jf9Var);
                        if (!z) {
                            boolean d = av8Var9.d(floatValue);
                            Object O6 = av8Var9.O();
                            if (d || O6 == obj4) {
                                O6 = new s81(floatValue, 4);
                                av8Var9.n0(O6);
                            }
                            u2 = u2.z(s02.M(utcVar, (Function1) O6));
                        }
                        r62 = 0;
                        av8Var9.s(false);
                        wkn.k(cx1Var, null, u2, null, op3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var9, 56, 104);
                        av8Var9.s(false);
                    } else {
                        r62 = 0;
                        av8Var9.d0(631223648);
                        av8Var9.s(false);
                    }
                    g28 g28Var3 = bkh.c;
                    if (a10Var == null) {
                        i2 = 990197685;
                        i3 = R.color.primary_variant;
                    } else {
                        i2 = 990198485;
                        i3 = R.color.darken_overlay_2;
                    }
                    e12.a(r62, av8Var9, n9e.q(g28Var3, ljg.f(av8Var9, i2, i3, av8Var9, r62), jf9Var));
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 6:
                n52 n52Var = (n52) obj6;
                Function1 function12 = (Function1) obj5;
                xva xvaVar2 = (xva) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xvaVar2.getClass();
                int i11 = xvaVar2.c;
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(xvaVar2) ? 4 : 2;
                }
                av8 av8Var10 = (av8) of3Var7;
                if (av8Var10.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Context context2 = (Context) av8Var10.k(nz.b);
                    Object O7 = av8Var10.O();
                    if (O7 == obj4) {
                        O7 = e.d(0L);
                        av8Var10.n0(O7);
                    }
                    boh bohVar = (boh) O7;
                    boolean z2 = n52Var != null;
                    tee teeVar = xvaVar2.b;
                    boolean e = av8Var10.e(i11) | av8Var10.g(teeVar);
                    Object O8 = av8Var10.O();
                    if (e || O8 == obj4) {
                        Object obj9 = (gv9) teeVar.get(Integer.valueOf(i11));
                        if (obj9 == null) {
                            obj9 = rlh.b;
                        }
                        O8 = obj9;
                        av8Var10.n0(O8);
                    }
                    gv9 gv9Var = (gv9) O8;
                    yva yvaVar = xvaVar2.m;
                    int i12 = intValue7 & 14;
                    boolean i13 = av8Var10.i(context2) | (i12 == 4);
                    Object O9 = av8Var10.O();
                    if (i13 || O9 == obj4) {
                        O9 = new dr6(21, bohVar, context2, xvaVar2);
                        av8Var10.n0(O9);
                    }
                    jca.c(yvaVar, null, (Function1) O9, av8Var10, 0);
                    g28 g28Var4 = bkh.c;
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode6 = Long.hashCode(av8Var10.T);
                    aee m6 = av8Var10.m();
                    xtc C7 = fqj.C(av8Var10, g28Var4);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, c2, hf3.g);
                    waa.K(av8Var10, m6, hf3.f);
                    waa.K(av8Var10, Integer.valueOf(hashCode6), hf3.j);
                    waa.J(av8Var10, hf3.k);
                    waa.K(av8Var10, C7, hf3.d);
                    t3e C8 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
                    boolean h2 = av8Var10.h(z2) | (i12 == 4) | av8Var10.g(n52Var) | av8Var10.g(function12) | av8Var10.i(context2) | av8Var10.g(gv9Var);
                    Object O10 = av8Var10.O();
                    if (h2 || O10 == obj4) {
                        xvaVar = xvaVar2;
                        hk hkVar = new hk(xvaVar, gv9Var, z2, n52Var, function12, context2);
                        av8Var10.n0(hkVar);
                        O10 = hkVar;
                    } else {
                        xvaVar = xvaVar2;
                    }
                    v8a.a(null, null, C8, null, null, null, false, null, (Function1) O10, av8Var10, 384, PglCryptUtils.UNKNOWN_ERR);
                    s6a.a(Boolean.valueOf(xvaVar.o).equals(Boolean.TRUE), g28Var4, av8Var10, 48);
                    av8Var10.s(true);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 7:
                List list = (List) obj6;
                e8g e8gVar = (e8g) obj5;
                s22 s22Var2 = (s22) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                s22Var2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var8).g(s22Var2) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var8;
                if (av8Var11.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    float min = Math.min(s22Var2.c() / 4.0f, 40.0f);
                    g28 g28Var5 = bkh.c;
                    wnn.o(l98.b0(g28Var5, 12.0f), false, r13.h, true, false, av8Var11, 3510, 16);
                    xtc d03 = l98.d0(l98.f0(g28Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a6 = t23.a(ww9.h, uxf.p, av8Var11, 54);
                    int hashCode7 = Long.hashCode(av8Var11.T);
                    aee m7 = av8Var11.m();
                    xtc C9 = fqj.C(av8Var11, d03);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(zg3Var4);
                    } else {
                        av8Var11.q0();
                    }
                    waa.K(av8Var11, a6, hf3.g);
                    waa.K(av8Var11, m7, hf3.f);
                    waa.K(av8Var11, Integer.valueOf(hashCode7), hf3.j);
                    waa.J(av8Var11, hf3.k);
                    waa.K(av8Var11, C9, hf3.d);
                    u6h.y(min, a.c(CollectionsKt.Y(list)), e8gVar.b(0, av8Var11), av8Var11, 0);
                    u6h.y(min, list.subList(1, 5), e8gVar.b(1, av8Var11), av8Var11, 0);
                    u6h.y(min, list.subList(5, 9), e8gVar.b(2, av8Var11), av8Var11, 0);
                    u6h.y(min, list.subList(9, list.size()), e8gVar.b(3, av8Var11), av8Var11, 0);
                    av8Var11.s(true);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 8:
                cdi cdiVar2 = (cdi) obj6;
                Function0 function02 = (Function0) obj5;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var12 = (av8) of3Var9;
                if (av8Var12.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    t3l t3lVar = (t3l) cdiVar2.getValue();
                    if (t3lVar instanceof q3l) {
                        av8Var12.d0(1198938557);
                        t6a.b(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var12, 6, 14);
                        av8Var12.s(false);
                    } else if (t3lVar instanceof s3l) {
                        av8Var12.d0(1199123720);
                        xtc d04 = l98.d0(bkh.c, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        u23 a7 = t23.a(ww9.d, uxf.o, av8Var12, 0);
                        int hashCode8 = Long.hashCode(av8Var12.T);
                        aee m8 = av8Var12.m();
                        xtc C10 = fqj.C(av8Var12, d04);
                        if3.k7.getClass();
                        zg3 zg3Var5 = hf3.b;
                        av8Var12.h0();
                        if (av8Var12.S) {
                            av8Var12.l(zg3Var5);
                        } else {
                            av8Var12.q0();
                        }
                        waa.K(av8Var12, a7, hf3.g);
                        waa.K(av8Var12, m8, hf3.f);
                        waa.K(av8Var12, Integer.valueOf(hashCode8), hf3.j);
                        waa.J(av8Var12, hf3.k);
                        waa.K(av8Var12, C10, hf3.d);
                        s3l s3lVar = (s3l) t3lVar;
                        l3l l3lVar = s3lVar.a;
                        Object O11 = av8Var12.O();
                        if (O11 == obj4) {
                            O11 = new b1f(13);
                            av8Var12.n0(O11);
                        }
                        Function1 function13 = (Function1) O11;
                        p4b p4bVar = s3lVar.e;
                        WeeklyStatus weeklyStatus = s3lVar.b;
                        int i14 = s3lVar.c;
                        qea.i(l3lVar, function13, function02, null, new b3l(p4bVar, weeklyStatus, i14, s3lVar.d, i14 < 1), av8Var12, 48, 8);
                        av8Var12.s(true);
                        av8Var12.s(false);
                    } else {
                        if (!(t3lVar instanceof r3l)) {
                            throw dmi.h(av8Var12, -238421090, false);
                        }
                        av8Var12.d0(1200070739);
                        j72.h(bkh.c(utcVar, 1.0f), Integer.valueOf(R.drawable.check_back_later), Integer.valueOf(R.string.weekly_challenge_previous_week_empty_header), Integer.valueOf(R.string.weekly_challenge_previous_week_empty_description), false, null, 0, 0L, av8Var12, 6, 240);
                        av8Var12.s(false);
                    }
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 9:
                return s(obj, obj2, obj3);
            case 10:
                return t(obj, obj2, obj3);
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                return b(obj, obj2, obj3);
            case 13:
                return c(obj, obj2, obj3);
            case 14:
                return d(obj, obj2, obj3);
            case 15:
                return e(obj, obj2, obj3);
            case 16:
                return f(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return h(obj, obj2, obj3);
            case 19:
                return i(obj, obj2, obj3);
            case 20:
                return j(obj, obj2, obj3);
            case 21:
                return k(obj, obj2, obj3);
            case 22:
                return l(obj, obj2, obj3);
            case 23:
                return m(obj, obj2, obj3);
            case 24:
                return n(obj, obj2, obj3);
            case 25:
                return o(obj, obj2, obj3);
            case 26:
                return p(obj, obj2, obj3);
            case 27:
                return q(obj, obj2, obj3);
            case 28:
                return r(obj, obj2, obj3);
            default:
                DateMatchesFragment dateMatchesFragment = (DateMatchesFragment) obj6;
                gi6 gi6Var = (gi6) obj5;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof ci6) {
                    ci6 ci6Var = (ci6) obj3;
                    Category category = ci6Var.b;
                    boolean z3 = ci6Var.d;
                    ci6Var.d = !z3;
                    if (z3) {
                        yzc yzcVar = (yzc) dateMatchesFragment.H().t.get(Integer.valueOf(category.getId()));
                        lec w = yzcVar != null ? waa.w(yzcVar) : null;
                        if (w != null) {
                            u6b viewLifecycleOwner = dateMatchesFragment.getViewLifecycleOwner();
                            keb.a("removeObservers");
                            Iterator it2 = w.b.iterator();
                            while (true) {
                                qog qogVar = (qog) it2;
                                if (qogVar.hasNext()) {
                                    Map.Entry entry = (Map.Entry) qogVar.next();
                                    if (((jeb) entry.getValue()).c(viewLifecycleOwner)) {
                                        w.i((skd) entry.getKey());
                                    }
                                }
                            }
                        }
                        dateMatchesFragment.H().t.remove(Integer.valueOf(category.getId()));
                    } else {
                        category.setDownloading(true);
                        ci6Var.c.clear();
                        dateMatchesFragment.D(ci6Var, true);
                    }
                    gi6Var.Q();
                } else if (obj3 instanceof y21) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext = dateMatchesFragment.requireContext();
                    requireContext.getClass();
                    wxf.B(requireContext, ((y21) obj3).d().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof lrj) {
                    a99 a99Var = LeagueActivity.h0;
                    Context requireContext2 = dateMatchesFragment.requireContext();
                    requireContext2.getClass();
                    a99Var.z(requireContext2, ((lrj) obj3).a);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ hl6(int i, Object obj, Function1 function1) {
        this.a = i;
        this.c = function1;
        this.b = obj;
    }
}
