package defpackage;

import android.content.Context;
import com.appsflyer.internal.i;
import com.ironsource.V2;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.results.R;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class d67 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d67(Context context, ks3 ks3Var, e1d e1dVar) {
        this.a = 10;
        this.c = context;
        this.d = ks3Var;
        this.b = e1dVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        wu6 wu6Var = (wu6) this.c;
        Function1 function1 = (Function1) this.b;
        Function1 function12 = (Function1) this.d;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            av8Var.W();
        } else if (booleanValue) {
            av8Var.d0(-1517202506);
            s6a.f(48.0f, 6.0f, 432, 57, 0L, 0L, av8Var, null);
            av8Var.s(false);
        } else {
            av8Var.d0(-1516985816);
            xtc d = bkh.d(utc.a, 1.0f);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            boolean g = av8Var.g(wu6Var) | av8Var.g(function1) | av8Var.g(function12);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new dr6(i, wu6Var, function1, function12);
                av8Var.n0(O);
            }
            v8a.a(d, null, C, null, null, null, false, null, (Function1) O, av8Var, 390, 506);
            av8Var.s(false);
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    private final Object b(Object obj, Object obj2, Object obj3) {
        List<do7> list;
        ?? r1;
        av8 av8Var;
        String str = (String) this.c;
        List list2 = (List) this.d;
        Context context = (Context) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var2 = (av8) of3Var;
        if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
            long D = lz.D(R.color.surface_1, av8Var2);
            n7g a = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(n9e.q(utcVar, D, a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            if (str == null) {
                av8Var2.d0(2088011993);
                av8Var2.s(false);
                list = list2;
                r1 = 0;
                av8Var = av8Var2;
            } else {
                av8Var2.d0(2088011994);
                yf8 yf8Var = xth.a;
                list = list2;
                r1 = 0;
                udj.c(str, l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 6.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 109560);
                av8 av8Var3 = av8Var2;
                av8Var3.s(false);
                av8Var = av8Var3;
            }
            av8Var.d0(-1595188326);
            for (do7 do7Var : list) {
                av8Var.a0(274147623, Integer.valueOf(do7Var.a));
                boolean i = av8Var.i(context);
                Object O = av8Var.O();
                if (i || O == nf3.a) {
                    O = new vt(context, 2);
                    av8Var.n0(O);
                }
                k53.K(do7Var, (Function1) O, null, av8Var, r1);
                av8Var.s(r1);
            }
            av8Var.s(r1);
            av8Var.s(true);
        } else {
            av8Var2.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        long j;
        Brand brand = (Brand) this.c;
        r13 r13Var = (r13) this.d;
        ev6 ev6Var = (ev6) this.b;
        xpa xpaVar = (xpa) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        xpaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            int id = brand.getId();
            String slug = brand.getSlug();
            if (r13Var == null) {
                j = ljg.f(av8Var, -319533160, R.color.primary_default, av8Var, false);
            } else {
                av8Var.d0(-319533594);
                av8Var.s(false);
                j = r13Var.a;
            }
            j72.a(new w22(id, slug, j, ev6Var.D.getUrl()), BrandLocation.Fantasy, u0a.F(xpa.a(xpaVar, utc.a, 7), icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54), Integer.valueOf(ev6Var.c), false, av8Var, 24624, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        String str = (String) this.c;
        d7e d7eVar = (d7e) this.d;
        Function0 function0 = (Function0) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            oea.b(str, d7eVar, function0, l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.error, av8Var), av8Var, 3136);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        String str = (String) this.c;
        String str2 = (String) this.d;
        Function1 function1 = (Function1) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            u23 a = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            rha.b(oea.v(R.string.fantasy_league_info, av8Var), null, 0L, av8Var, 0, 6);
            qha.e(0, 28, av8Var, null, bf3.g(16.0f, R.string.fantasy_league_name, av8Var, av8Var, utcVar), str, null, null);
            String v = oea.v(R.string.fantasy_league_description, av8Var);
            if (str2 == null || StringsKt.R(str2)) {
                str2 = null;
            }
            String str3 = str2;
            String v2 = oea.v(R.string.fantasy_league_description_cta_text, av8Var);
            boolean g = av8Var.g(function1);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = new rt6(14, function1);
                av8Var.n0(O);
            }
            qha.e(0, 4, av8Var, null, v, str3, v2, (Function0) O);
            String g2 = bf3.g(16.0f, R.string.fantasy_edit_league_info, av8Var, av8Var, utcVar);
            d7e t = haa.t(R.drawable.ic_edit, 0, av8Var);
            boolean g3 = av8Var.g(function1);
            Object O2 = av8Var.O();
            if (g3 || O2 == a99Var) {
                O2 = new rt6(15, function1);
                av8Var.n0(O2);
            }
            i9a.h(g2, t, (Function0) O2, null, av8Var, 64, 8);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        t77 t77Var = (t77) this.c;
        z47 z47Var = (z47) this.d;
        Function1 function1 = (Function1) this.b;
        xpa xpaVar = (xpa) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        xpaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            boolean z = z47Var.b.o;
            boolean g = av8Var.g(function1) | av8Var.g(z47Var);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new x47(function1, z47Var);
                av8Var.n0(O);
            }
            j72.i(t77Var, z, (Function1) O, u0a.F(xpa.a(xpaVar, utc.a, 7), icb.c, 8.0f, av8Var, 38), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        z97 z97Var = (z97) this.c;
        Function1 function1 = (Function1) this.b;
        Function1 function12 = (Function1) this.d;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            yso.f(z97Var, function1, function12, null, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        gv9 gv9Var = (gv9) this.c;
        ho7 ho7Var = (ho7) this.d;
        do7 do7Var = (do7) this.b;
        s22 s22Var = (s22) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        s22Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            double c = s22Var.c() / 360.0d;
            cp cpVar = new cp(new se7(6), 15);
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : gv9Var) {
                if (!((FantasyRoundPlayerUiModel) obj4).k) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : gv9Var) {
                if (((FantasyRoundPlayerUiModel) obj5).k) {
                    arrayList2.add(obj5);
                }
            }
            tol.b(thb.a.a(Double.valueOf(c)), yqo.H(1262229085, av8Var, new ace(arrayList, CollectionsKt.H0(arrayList2, cpVar), ho7Var, do7Var, 28)), av8Var, 56);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ll7 ll7Var = (ll7) this.c;
        il8 il8Var = (il8) this.d;
        Function1 function1 = (Function1) this.b;
        p3e p3eVar = (p3e) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        p3eVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(p3eVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            wkn.a(ll7Var.d, null, null, null, yqo.H(150055710, av8Var, new er6(ll7Var, p3eVar, il8Var, function1)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        nl7 nl7Var = (nl7) this.c;
        ev6 ev6Var = (ev6) this.d;
        ct8 ct8Var = (ct8) this.b;
        s22 s22Var = (s22) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        s22Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            tol.b(thb.a.a(Double.valueOf(s22Var.c() / 360.0d)), yqo.H(445510092, av8Var, new uu6(17, nl7Var, ev6Var, ct8Var)), av8Var, 56);
            fz8.e(nl7Var.d, null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, tgj.a, av8Var, 200064, 18);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        kv1 kv1Var;
        do7 do7Var;
        lv1 lv1Var;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        zg3 zg3Var;
        utc utcVar;
        ev6 ev6Var;
        p4h p4hVar;
        do7 do7Var2;
        boolean z;
        int i;
        Brand brand;
        ev6 ev6Var2 = (ev6) this.c;
        BrandingFantasyCompetition brandingFantasyCompetition = ev6Var2.D;
        do7 do7Var3 = (do7) this.d;
        cdi cdiVar = (cdi) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            int i2 = ev6Var2.f;
            mj7 mj7Var = ev6Var2.i;
            utc utcVar2 = utc.a;
            xtc q = pd0.q(i2, av8Var, utcVar2);
            p4h p4hVar2 = ww9.d;
            kv1 kv1Var2 = uxf.o;
            u23 a = t23.a(p4hVar2, kv1Var2, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            lv1 lv1Var2 = uxf.m;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc c0 = l98.c0(bkh.d(utcVar2, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ng0Var, lv1Var2, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var2);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var4);
            int i3 = co7.a[do7Var3.c.d.ordinal()];
            if (i3 == 1) {
                kv1Var = kv1Var2;
                do7Var = do7Var3;
                lv1Var = lv1Var2;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var3;
                zg3Var = zg3Var2;
                utcVar = utcVar2;
                av8Var.d0(-929139669);
                ev6Var = ev6Var2;
                td4.q(ev6Var2.g, ev6Var2.a, ev6Var2.y, bkh.l(utcVar, 24.0f), av8Var, 3072);
                av8Var = av8Var;
                av8Var.s(false);
                Unit unit = Unit.a;
            } else {
                if (i3 != 2) {
                    throw dmi.h(av8Var, -1692543540, false);
                }
                av8Var.d0(-928715837);
                utcVar = utcVar2;
                zg3Var = zg3Var2;
                do7Var = do7Var3;
                lv1Var = lv1Var2;
                ryVar = ryVar2;
                f50Var = f50Var3;
                ff3Var = ff3Var2;
                kv1Var = kv1Var2;
                kq9.b(s6a.N(R.drawable.ic_leagues_empty, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
                av8Var.s(false);
                Unit unit2 = Unit.a;
                ev6Var = ev6Var2;
            }
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a3 = t23.a(p4hVar2, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var4);
            lv1 lv1Var3 = lv1Var;
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var3, av8Var, 54);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var2);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var4);
            ev6 ev6Var3 = ev6Var;
            String q2 = dmi.q(ev6Var3.x ? "[A] " : "", ev6Var3.e);
            yf8 yf8Var = xth.a;
            av8 av8Var2 = av8Var;
            kv1 kv1Var3 = kv1Var;
            udj.c(q2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
            do7 do7Var4 = do7Var;
            if (do7Var4.c.y) {
                av8Var2.d0(1087686721);
                p4hVar = p4hVar2;
                do7Var2 = do7Var4;
                kq9.b(s6a.N(R.drawable.ic_official_checkmark, 6, av8Var2), null, bkh.l(utcVar, 20.0f), r13.i, av8Var2, V2.b.f, 0);
                av8Var2.s(false);
            } else {
                p4hVar = p4hVar2;
                do7Var2 = do7Var4;
                av8Var2.d0(1088028682);
                av8Var2.s(false);
            }
            av8Var2.s(true);
            udj.c(do7Var2.b, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
            i.o(av8Var2, true, utcVar, 16.0f, av8Var2);
            it7 it7Var = un6.b;
            un6 un6Var = un6.REWARD;
            it7Var.getClass();
            if (it7.x(brandingFantasyCompetition, un6Var, true)) {
                av8Var2.d0(-926735650);
                td4.n((brandingFantasyCompetition == null || (brand = brandingFantasyCompetition.getBrand()) == null) ? 0 : brand.getId(), bkh.p(bkh.e(utcVar, 24.0f), 64.0f), uxf.h, av8Var2, 432);
                bf3.u(utcVar, 16.0f, av8Var2, false);
            } else {
                av8Var2.d0(-926349328);
                av8Var2.s(false);
            }
            rd0.h(ev6Var3.c, 0, lz.D(R.color.on_color_primary, av8Var2), av8Var2, null);
            av8Var2.s(true);
            kg0 kg0Var = ww9.h;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a5 = k8g.a(kg0Var, lv1Var3, av8Var2, 54);
            int hashCode5 = Long.hashCode(av8Var2.T);
            aee m5 = av8Var2.m();
            xtc C5 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var2);
            waa.K(av8Var2, m5, ff3Var);
            bf3.s(hashCode5, av8Var2, f50Var, av8Var2, ryVar);
            waa.K(av8Var2, C5, f50Var4);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a6 = t23.a(p4hVar, kv1Var3, av8Var2, 0);
            int hashCode6 = Long.hashCode(av8Var2.T);
            aee m6 = av8Var2.m();
            xtc C6 = fqj.C(av8Var2, goaVar2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a6, f50Var2);
            waa.K(av8Var2, m6, ff3Var);
            bf3.s(hashCode6, av8Var2, f50Var, av8Var2, ryVar);
            waa.K(av8Var2, C6, f50Var4);
            long j = mj7Var.e;
            jj7 jj7Var = mj7Var.m;
            bi4 bi4Var = bi4.PATTERN_DMMHHSS;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String i4 = fc6.i(j, hk4.a(bi4Var.d()));
            String i5 = fc6.i(mj7Var.f, hk4.a(bi4Var.d()));
            nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
            udj.c(oea.w(R.string.toolbar_subtitle_template, new Object[]{i4, i5}, av8Var2), null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
            av8 av8Var3 = av8Var2;
            nq8.h(av8Var3, bkh.e(utcVar, 8.0f));
            ng0 ng0Var2 = new ng0(4.0f, true, new a70(6));
            xtc c02 = l98.c0(n9e.q(fz8.d0(utcVar, n9a.b), lz.D(R.color.on_color_highlight_2, av8Var3), o7g.a(8.0f)), 8.0f, 4.0f);
            u23 a7 = t23.a(ng0Var2, kv1Var3, av8Var3, 6);
            int hashCode7 = Long.hashCode(av8Var3.T);
            aee m7 = av8Var3.m();
            xtc C7 = fqj.C(av8Var3, c02);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a7, f50Var2);
            waa.K(av8Var3, m7, ff3Var);
            bf3.s(hashCode7, av8Var3, f50Var, av8Var3, ryVar);
            waa.K(av8Var3, C7, f50Var4);
            oyn.l(s6a.N(jj7Var.c, 6, av8Var3), oea.v(!mj7Var.h() ? R.string.until_deadline : jj7Var.a, av8Var3), null, lz.D(R.color.on_color_primary, av8Var3), av8Var3, 0);
            if (mj7Var.h()) {
                z = true;
                i = 0;
                av8Var3.d0(-119586285);
                av8Var3.s(false);
            } else {
                av8Var3.d0(-120108108);
                xtc d = bkh.d(utcVar, 1.0f);
                k1c c = e12.c(uxf.g, false);
                int hashCode8 = Long.hashCode(av8Var3.T);
                aee m8 = av8Var3.m();
                xtc C8 = fqj.C(av8Var3, d);
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, c, f50Var2);
                waa.K(av8Var3, m8, ff3Var);
                bf3.s(hashCode8, av8Var3, f50Var, av8Var3, ryVar);
                waa.K(av8Var3, C8, f50Var4);
                sea.i((js8) cdiVar.getValue(), lz.D(R.color.on_color_primary, av8Var3), xth.l(), null, null, null, av8Var3, 0);
                av8Var3 = av8Var3;
                z = true;
                av8Var3.s(true);
                i = 0;
                av8Var3.s(false);
            }
            bf3.t(av8Var3, z, utcVar, 16.0f, av8Var3);
            av8Var3.s(z);
            tgj.a(ev6Var3.r, ev6Var3.s, i, av8Var3, null);
            av8Var3.s(z);
            av8Var3.s(z);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        lj7 lj7Var;
        Object obj4;
        ro7 ro7Var = (ro7) this.c;
        Context context = (Context) this.d;
        String str = (String) this.b;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        po7 po7Var = (po7) ro7Var;
        gv9 gv9Var = po7Var.f;
        do7 do7Var = po7Var.a;
        ho7 ho7Var = po7Var.b;
        if (gv9Var != null) {
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (((lj7) obj4).a == ho7Var.a.a) {
                    break;
                }
            }
            lj7Var = (lj7) obj4;
        } else {
            lj7Var = null;
        }
        int i = do7Var.c.c;
        boolean h = ho7Var.a.h();
        boolean z = do7Var.c.A;
        int i2 = 2;
        xtc x = gz8.x(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, null, 3);
        av8 av8Var = (av8) of3Var;
        boolean i3 = av8Var.i(context) | av8Var.g(str) | av8Var.g(ro7Var);
        Object O = av8Var.O();
        if (i3 || O == nf3.a) {
            O = new l97(i2, context, str, ro7Var);
            av8Var.n0(O);
        }
        u6h.i(lj7Var, i, h, (Function0) O, z, x, false, av8Var, 1572864, 0);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r46v0, types: [wzc] */
    /* JADX WARN: Type inference failed for: r9v32, types: [wzc] */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        float f;
        Object obj4;
        Integer num;
        fy7 fy7Var;
        fy7 fy7Var2;
        Integer num2;
        fy7 fy7Var3;
        fy7 fy7Var4;
        int i = this.a;
        int i2 = 5;
        rq3 rq3Var = null;
        utc utcVar = utc.a;
        Object obj5 = nf3.a;
        int i3 = 4;
        int i4 = 0;
        Object obj6 = this.b;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                osa osaVar = (osa) obj8;
                e67 e67Var = (e67) obj7;
                Function1 function1 = (Function1) obj6;
                p3e p3eVar = (p3e) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                p3eVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, p3eVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    boolean i5 = av8Var.i(osaVar) | av8Var.g(e67Var) | av8Var.g(function1);
                    Object O = av8Var.O();
                    if (i5 || O == obj5) {
                        O = new dr6(6, osaVar, e67Var, function1);
                        av8Var.n0(O);
                    }
                    v8a.a(f0, null, C, null, null, null, false, null, (Function1) O, av8Var, 384, 506);
                    int c = osaVar.c();
                    ofb ofbVar = ofb.b;
                    if (c != 0 || Intrinsics.c(osaVar.d().a, ofbVar)) {
                        z = true;
                        av8Var.d0(-653360026);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-653774217);
                        g28 g28Var = bkh.c;
                        k1c c2 = e12.c(uxf.g, false);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C2 = fqj.C(av8Var, g28Var);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c2, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C2, hf3.d);
                        j72.h(null, Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.fantasy_empty_team_search_title), Integer.valueOf(R.string.fantasy_empty_team_search_text), false, null, 0, 0L, av8Var, 0, 241);
                        z = true;
                        av8Var.s(true);
                        av8Var.s(false);
                    }
                    s6a.a((e67Var.d || Intrinsics.c(osaVar.d().a, ofbVar)) ? z : false, bkh.c, av8Var, 48);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                Function1 function12 = (Function1) obj6;
                Function1 function13 = (Function1) obj8;
                mb7 mb7Var = (mb7) obj7;
                uj7 uj7Var = (uj7) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                uj7Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).e(uj7Var.ordinal()) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int ordinal = uj7Var.ordinal();
                    if (ordinal == 0) {
                        av8Var2.d0(-1524887718);
                        s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var2, bkh.c);
                        av8Var2.s(false);
                    } else if (ordinal == 1) {
                        av8Var2.d0(-1524736004);
                        long D = lz.D(R.color.surface_P, av8Var2);
                        xtc d0 = l98.d0(bkh.r(bkh.c, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        boolean g = av8Var2.g(function12);
                        Object O2 = av8Var2.O();
                        Object obj9 = O2;
                        if (g || O2 == obj5) {
                            l77 l77Var = new l77(9, function12);
                            av8Var2.n0(l77Var);
                            obj9 = l77Var;
                        }
                        yqo.f((Function0) obj9, d0, D, av8Var2, 48, 0);
                        av8Var2.s(false);
                    } else {
                        if (ordinal != 2) {
                            throw dmi.h(av8Var2, -1711756374, false);
                        }
                        av8Var2.d0(-1524235881);
                        qpa a = tpa.a(0, 3, av8Var2);
                        cdi N = z1a.N(a, av8Var2);
                        Boolean bool = (Boolean) N.getValue();
                        bool.booleanValue();
                        boolean g2 = av8Var2.g(function13) | av8Var2.g(N);
                        Object O3 = av8Var2.O();
                        Object obj10 = O3;
                        if (g2 || O3 == obj5) {
                            p97 p97Var = new p97(function13, N, rq3Var, 3);
                            av8Var2.n0(p97Var);
                            obj10 = p97Var;
                        }
                        hz8.o(av8Var2, bool, (Function2) obj10);
                        g28 g28Var2 = bkh.c;
                        l39 l39Var = new l39();
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                        t3e t3eVar = new t3e(16.0f, 8.0f, 16.0f, 8.0f);
                        boolean g3 = av8Var2.g(mb7Var) | av8Var2.g(function12);
                        Object O4 = av8Var2.O();
                        Object obj11 = O4;
                        if (g3 || O4 == obj5) {
                            w47 w47Var = new w47(7, mb7Var, function12);
                            av8Var2.n0(w47Var);
                            obj11 = w47Var;
                        }
                        haa.d(l39Var, g28Var2, a, t3eVar, ng0Var2, ng0Var, null, false, null, (Function1) obj11, av8Var2, 1772592, 912);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                eld eldVar = (eld) obj8;
                znh znhVar = (znh) obj7;
                OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) obj6;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    u23 a2 = t23.a(ww9.d, uxf.p, av8Var3, 48);
                    int hashCode2 = Long.hashCode(av8Var3.T);
                    aee m2 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, d);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a2, hf3.g);
                    waa.K(av8Var3, m2, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C3, hf3.d);
                    boolean z2 = eldVar.b.size() > znhVar.h();
                    av8Var3.d0(825663429);
                    for (and andVar : CollectionsKt.L0(eldVar.b, znhVar.h())) {
                        nld.d(oddsEventUIModel.a, oddsEventUIModel.b, oddsEventUIModel.c, andVar.a, andVar.b, vmd.MONETIZED_ODDS_TAB, "additional", null, 0L, false, null, false, false, null, null, av8Var3, 1769472, 0, 32640);
                    }
                    av8Var3.s(false);
                    if (z2) {
                        av8Var3.d0(-173756355);
                        xtc b0 = l98.b0(utcVar, 8.0f);
                        long D2 = lz.D(R.color.n_lv_4, av8Var3);
                        Object O5 = av8Var3.O();
                        if (O5 == obj5) {
                            O5 = mz1.e(av8Var3);
                        }
                        wzc wzcVar = (wzc) O5;
                        Object[] objArr = new Object[0];
                        Object O6 = av8Var3.O();
                        if (O6 == obj5) {
                            O6 = fi.b;
                            av8Var3.n0(O6);
                        }
                        xtc f02 = l98.f0(tol.y(b0, true, true, true, D2, wzcVar, new gi(r3 ? 1 : 0, (boh) o3a.N(objArr, (Function0) O6, av8Var3, 48), eldVar, znhVar), av8Var3, 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5);
                        yf8 yf8Var = xth.a;
                        udj.c(oea.v(R.string.show_more, av8Var3), f02, lz.D(R.color.primary_default, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var3, 0, 0, 131064);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(-173294641);
                        av8Var3.s(false);
                    }
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                BaseEventLineupsFragment baseEventLineupsFragment = (BaseEventLineupsFragment) obj8;
                xhf xhfVar = (xhf) obj7;
                e1d e1dVar = (e1d) obj6;
                m12 m12Var = (m12) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                m12Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(m12Var) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    phf.a.a(xhfVar, ((Boolean) baseEventLineupsFragment.E().invoke((vnb) e1dVar.getValue())).booleanValue(), m12Var.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var4), lz.D(R.color.primary_default, av8Var4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 0, 32);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                vl1 vl1Var = (vl1) obj8;
                Function1 function14 = (Function1) obj6;
                e1d e1dVar2 = (e1d) obj7;
                xpa xpaVar = (xpa) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    n7g a3 = o7g.a(16.0f);
                    boolean g4 = av8Var5.g(function14);
                    Object O7 = av8Var5.O();
                    if (g4 || O7 == obj5) {
                        O7 = new vi(3, function14);
                        av8Var5.n0(O7);
                    }
                    Function1 function15 = (Function1) O7;
                    boolean g5 = av8Var5.g(function14);
                    Object O8 = av8Var5.O();
                    if (g5 || O8 == obj5) {
                        O8 = new vi(i3, function14);
                        av8Var5.n0(O8);
                    }
                    Function1 function16 = (Function1) O8;
                    boolean g6 = av8Var5.g(function14);
                    Object O9 = av8Var5.O();
                    if (g6 || O9 == obj5) {
                        O9 = new vi(i2, function14);
                        av8Var5.n0(O9);
                    }
                    Function1 function17 = (Function1) O9;
                    boolean g7 = av8Var5.g(function14);
                    Object O10 = av8Var5.O();
                    if (g7 || O10 == obj5) {
                        O10 = new vi(6, function14);
                        av8Var5.n0(O10);
                    }
                    Function1 function18 = (Function1) O10;
                    Object O11 = av8Var5.O();
                    if (O11 == obj5) {
                        O11 = new w30(5, e1dVar2);
                        av8Var5.n0(O11);
                    }
                    o02.b(vl1Var, function15, function16, function17, function18, (Function1) O11, xpa.a(xpaVar, n9e.q(wnn.A(l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), a3), lz.D(R.color.surface_1, av8Var5), a3), 7), av8Var5, 196608);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                g62 g62Var = (g62) obj7;
                h2h h2hVar = (h2h) obj6;
                if (obj8 != i62.l) {
                    y6a.v(g62Var.b, obj8, h2hVar.a);
                }
                return Unit.a;
            case 6:
                qug qugVar = (qug) obj8;
                br2 br2Var = (br2) obj7;
                Function0 function0 = (Function0) obj6;
                ar2 ar2Var = (ar2) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ar2Var.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(ar2Var) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean i6 = av8Var6.i(br2Var);
                    Object O12 = av8Var6.O();
                    if (i6 || O12 == obj5) {
                        O12 = new kj1(1, br2Var, br2.class, "onAction", "onAction(Lcom/sofascore/results/chat/addcountry/data/ChatCountryFlagAction;)V", 0, 9);
                        av8Var6.n0(O12);
                    }
                    rz8.d(ar2Var, qugVar, (Function1) ((KFunction) O12), function0, av8Var6, intValue6 & 14);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 7:
                gv9<uv3> gv9Var = (gv9) obj8;
                String str = (String) obj7;
                Function1 function19 = (Function1) obj6;
                kb8 kb8Var = (kb8) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                kb8Var.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(kb8Var) ? 4 : 2;
                }
                ?? r1 = (av8) of3Var7;
                if (r1.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    r1.d0(1123732110);
                    for (uv3 uv3Var : gv9Var) {
                        boolean c3 = Intrinsics.c(uv3Var.b, str);
                        boolean g8 = r1.g(function19) | r1.g(uv3Var);
                        Object O13 = r1.O();
                        if (g8 || O13 == obj5) {
                            O13 = new xq2(function19, uv3Var, 0);
                            r1.n0(O13);
                        }
                        rz8.f(uv3Var, c3, (Function0) O13, kb8Var.a(1.0f, utcVar, true), r1, 0);
                    }
                    r1.s(false);
                    int size = gv9Var.size() % 4;
                    if (size != 0) {
                        r1.d0(476424369);
                        int i7 = 4 - size;
                        for (int i8 = 0; i8 < i7; i8++) {
                            nq8.h(r1, kb8Var.a(1.0f, utcVar, true));
                        }
                        r1.s(false);
                    } else {
                        r1.d0(476549299);
                        r1.s(false);
                    }
                } else {
                    r1.W();
                }
                return Unit.a;
            case 8:
                String str2 = (String) obj8;
                u5g u5gVar = (u5g) obj7;
                Function0 function02 = (Function0) obj6;
                ((Integer) obj3).getClass();
                av8 av8Var7 = (av8) ((of3) obj2);
                av8Var7.d0(-756081143);
                d1a d1aVar = (d1a) av8Var7.k(f1a.a);
                if (d1aVar instanceof j1a) {
                    av8Var7.d0(-1604682242);
                } else {
                    av8Var7.d0(-1604549624);
                    Object O14 = av8Var7.O();
                    if (O14 == obj5) {
                        O14 = mz1.e(av8Var7);
                    }
                    rq3Var = (wzc) O14;
                }
                av8Var7.s(false);
                xtc t = oyn.t(utc.a, rq3Var, d1aVar, true, str2, u5gVar, function02);
                av8Var7.s(false);
                return t;
            case 9:
                gv9 gv9Var2 = (gv9) obj8;
                e1d e1dVar3 = (e1d) obj7;
                gv9 gv9Var3 = (gv9) obj6;
                of3 of3Var8 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc f03 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                u23 a4 = t23.a(ww9.d, uxf.o, of3Var8, 0);
                av8 av8Var8 = (av8) of3Var8;
                int hashCode3 = Long.hashCode(av8Var8.T);
                aee m3 = av8Var8.m();
                xtc C4 = fqj.C(of3Var8, f03);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8 av8Var9 = (av8) of3Var8;
                av8Var9.h0();
                if (av8Var9.S) {
                    av8Var9.l(zg3Var3);
                } else {
                    av8Var9.q0();
                }
                waa.K(of3Var8, a4, hf3.g);
                waa.K(of3Var8, m3, hf3.f);
                waa.K(of3Var8, Integer.valueOf(hashCode3), hf3.j);
                waa.J(of3Var8, hf3.k);
                waa.K(of3Var8, C4, hf3.d);
                tfh tfhVar = (tfh) e1dVar3.getValue();
                boolean g9 = av8Var9.g(e1dVar3);
                Object O15 = av8Var9.O();
                if (g9 || O15 == obj5) {
                    O15 = new w30(13, e1dVar3);
                    av8Var9.n0(O15);
                }
                l4a.a(gv9Var2, tfhVar, (Function1) O15, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, false, of3Var8, 3072, 48);
                Object O16 = av8Var9.O();
                if (O16 == obj5) {
                    O16 = new b42(24);
                    av8Var9.n0(O16);
                }
                Function1 function110 = (Function1) O16;
                Object O17 = av8Var9.O();
                if (O17 == obj5) {
                    O17 = new b42(25);
                    av8Var9.n0(O17);
                }
                l98.b(gv9Var3, null, function110, null, "BasketballHeatmapMorph", (Function1) O17, k53.c, of3Var8, 1794432, 10);
                av8Var9.s(true);
                return Unit.a;
            case 10:
                Context context = (Context) obj8;
                ks3 ks3Var = (ks3) obj7;
                e1d e1dVar4 = (e1d) obj6;
                of3 of3Var9 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    vnb vnbVar = (vnb) e1dVar4.getValue();
                    boolean i9 = av8Var10.i(context);
                    Object O18 = av8Var10.O();
                    if (i9 || O18 == obj5) {
                        O18 = new vt(context, 1);
                        av8Var10.n0(O18);
                    }
                    Function1 function111 = (Function1) O18;
                    boolean i10 = av8Var10.i(context) | av8Var10.i(ks3Var);
                    Object O19 = av8Var10.O();
                    if (i10 || O19 == obj5) {
                        O19 = new r82(6, context, ks3Var);
                        av8Var10.n0(O19);
                    }
                    pd0.c(vnbVar, function111, (Function1) O19, av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 11:
                m44 m44Var = (m44) obj8;
                Function1 function112 = (Function1) obj6;
                ce8 ce8Var = (ce8) obj7;
                of3 of3Var10 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    k44.d(m44Var, function112, lz.G(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), ce8Var), av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 12:
                Function1 function113 = (Function1) obj6;
                Function0 function03 = (Function0) obj7;
                of3 of3Var11 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kxe kxeVar = ((l44) obj8).h;
                String v = oea.v(R.string.football_assist, of3Var11);
                xtc q = n9e.q(bkh.d(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), lz.D(R.color.surface_1, of3Var11), o7g.a(16.0f));
                av8 av8Var12 = (av8) of3Var11;
                boolean g10 = av8Var12.g(function113);
                Object O20 = av8Var12.O();
                if (g10 || O20 == obj5) {
                    O20 = new ri(5, function113);
                    av8Var12.n0(O20);
                }
                nq8.f(kxeVar, v, true, (Function0) O20, function03, q, av8Var12, 384);
                return Unit.a;
            case 13:
                m44 m44Var2 = (m44) obj8;
                Function2 function2 = (Function2) obj7;
                Function1 function114 = (Function1) obj6;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                av8 av8Var13 = (av8) ((of3) obj2);
                Object O21 = av8Var13.O();
                if (O21 == obj5) {
                    O21 = new ce8();
                    av8Var13.n0(O21);
                }
                ce8 ce8Var2 = (ce8) O21;
                if (m44Var2.d.isEmpty()) {
                    av8Var13.d0(-1681725076);
                    Unit unit = Unit.a;
                    Object O22 = av8Var13.O();
                    if (O22 == obj5) {
                        O22 = new j44(ce8Var2, rq3Var, r3 ? 1 : 0);
                        av8Var13.n0(O22);
                    }
                    hz8.o(av8Var13, unit, (Function2) O22);
                    av8Var13.s(false);
                } else {
                    av8Var13.d0(-1681555940);
                    av8Var13.s(false);
                }
                boolean i11 = av8Var13.i(m44Var2) | av8Var13.g(function2) | av8Var13.g(function114);
                Object O23 = av8Var13.O();
                if (i11 || O23 == obj5) {
                    l50 l50Var = new l50(8, m44Var2, ce8Var2, function2, function114);
                    av8Var13.n0(l50Var);
                    O23 = l50Var;
                }
                v8a.a(utc.a, null, null, null, null, null, false, null, (Function1) O23, av8Var13, 6, 510);
                return Unit.a;
            case 14:
                svb svbVar = (svb) obj8;
                ((Integer) obj3).intValue();
                ((r70) obj).getClass();
                o02.k(svbVar.e, svbVar.d, svbVar.f, (Function1) obj6, (Function0) obj7, (of3) obj2, 0);
                return Unit.a;
            case 15:
                dci dciVar = (dci) obj8;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                o02.k(dciVar.c, dciVar.b, dciVar.e, (Function1) obj6, (Function0) obj7, (of3) obj2, 0);
                return Unit.a;
            case 16:
                final Function1 function115 = (Function1) obj6;
                final ct8 ct8Var = (ct8) obj8;
                final Function2 function22 = (Function2) obj7;
                final fv5 fv5Var = (fv5) obj;
                of3 of3Var12 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                fv5Var.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= (intValue10 & 8) == 0 ? ((av8) of3Var12).g(fv5Var) : ((av8) of3Var12).i(fv5Var) ? 4 : 2;
                }
                av8 av8Var14 = (av8) of3Var12;
                if (av8Var14.T(intValue10 & 1, (intValue10 & 19) != 18)) {
                    kx4 kx4Var = (kx4) av8Var14.k(dh3.h);
                    Set set = xt5.a;
                    String str3 = fv5Var.d;
                    gv9 gv9Var4 = fv5Var.e;
                    final float H0 = kx4Var.H0(xt5.a(str3));
                    float H02 = kx4Var.H0(104.0f);
                    boolean e = av8Var14.e(gv9Var4.size());
                    Object O24 = av8Var14.O();
                    Object obj12 = O24;
                    if (e || O24 == obj5) {
                        int size2 = gv9Var4.size();
                        ArrayList arrayList = new ArrayList(size2);
                        for (int i12 = 0; i12 < size2; i12++) {
                            arrayList.add(new mzg(H02));
                        }
                        av8Var14.n0(arrayList);
                        obj12 = arrayList;
                    }
                    final List list = (List) obj12;
                    boolean z3 = av8Var14.k(dh3.n) == ema.b;
                    boolean e2 = av8Var14.e(gv9Var4.size());
                    Object O25 = av8Var14.O();
                    if (e2 || O25 == obj5) {
                        int size3 = gv9Var4.size();
                        ArrayList arrayList2 = new ArrayList(size3);
                        while (i4 < size3) {
                            int i13 = i4;
                            arrayList2.add(new uu5(z3, list, i13, H0, H02));
                            i4 = i13 + 1;
                        }
                        f = H02;
                        av8Var14.n0(arrayList2);
                        obj4 = arrayList2;
                    } else {
                        f = H02;
                        obj4 = O25;
                    }
                    final List list2 = (List) obj4;
                    final float f2 = f;
                    tol.b(nyd.a.a(null), yqo.H(-997010955, av8Var14, new Function2() { // from class: mu5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj13, Object obj14) {
                            of3 of3Var13 = (of3) obj13;
                            int intValue11 = ((Integer) obj14).intValue();
                            av8 av8Var15 = (av8) of3Var13;
                            if (av8Var15.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                                t3e C5 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                                xtc d2 = bkh.d(utc.a, 1.0f);
                                final fv5 fv5Var2 = fv5Var;
                                boolean i14 = av8Var15.i(fv5Var2);
                                final Function1 function116 = function115;
                                boolean g11 = i14 | av8Var15.g(function116);
                                final List list3 = list;
                                boolean i15 = g11 | av8Var15.i(list3);
                                final List list4 = list2;
                                boolean i16 = i15 | av8Var15.i(list4);
                                final float f3 = f2;
                                boolean d3 = i16 | av8Var15.d(f3);
                                final ct8 ct8Var2 = ct8Var;
                                boolean g12 = d3 | av8Var15.g(ct8Var2);
                                final Function2 function23 = function22;
                                boolean g13 = g12 | av8Var15.g(function23);
                                final float f4 = H0;
                                boolean d4 = g13 | av8Var15.d(f4);
                                Object O26 = av8Var15.O();
                                if (d4 || O26 == nf3.a) {
                                    Function1 function117 = new Function1() { // from class: nu5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj15) {
                                            boolean z4;
                                            fv5 fv5Var3;
                                            boolean z5;
                                            int i17;
                                            nu5 nu5Var = this;
                                            esa esaVar = (esa) obj15;
                                            esaVar.getClass();
                                            int i18 = 2;
                                            final fv5 fv5Var4 = fv5Var2;
                                            final Function1 function118 = function116;
                                            boolean z6 = true;
                                            esa.b(esaVar, "team_picker", new tc3(546165556, new rsh(i18, fv5Var4, function118), true), 2);
                                            Iterator it = fv5Var4.e.iterator();
                                            final int i19 = 0;
                                            while (true) {
                                                boolean hasNext = it.hasNext();
                                                Function2 function24 = function23;
                                                if (!hasNext) {
                                                    int i20 = i18;
                                                    fv5 fv5Var5 = fv5Var4;
                                                    boolean z7 = z6;
                                                    if (fv5Var5.f != null) {
                                                        esa.d(esaVar, "missing_players", null, new tc3(641312453, new qm4(i20, fv5Var5, function24), z7), i20);
                                                    }
                                                    return Unit.a;
                                                }
                                                Object next = it.next();
                                                int i21 = i19 + 1;
                                                if (i19 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                final l22 l22Var = (l22) next;
                                                final mzg mzgVar = (mzg) list3.get(i19);
                                                String j = ljg.j(i19, "header_legend ");
                                                final List list5 = list4;
                                                final float f5 = f3;
                                                final ct8 ct8Var3 = ct8Var2;
                                                Function1 function119 = function118;
                                                esa.b(esaVar, j, new tc3(-822586129, new et8() { // from class: ou5
                                                    @Override // defpackage.et8
                                                    public final Object invoke(Object obj16, Object obj17, Object obj18, Object obj19) {
                                                        String a5;
                                                        ((Integer) obj17).getClass();
                                                        of3 of3Var14 = (of3) obj18;
                                                        int intValue12 = ((Integer) obj19).intValue();
                                                        ((xpa) obj16).getClass();
                                                        av8 av8Var16 = (av8) of3Var14;
                                                        if (av8Var16.T(intValue12 & 1, (intValue12 & 129) != 128)) {
                                                            l22 l22Var2 = l22.this;
                                                            r9k r9kVar = l22Var2.c;
                                                            if (r9kVar == null) {
                                                                av8Var16.d0(1420095656);
                                                                av8Var16.s(false);
                                                                a5 = null;
                                                            } else {
                                                                av8Var16.d0(-231285127);
                                                                a5 = r9kVar.a(av8Var16);
                                                                av8Var16.s(false);
                                                            }
                                                            if (a5 == null) {
                                                                a5 = "";
                                                            }
                                                            utc utcVar2 = utc.a;
                                                            xtc f04 = l98.f0(l98.d0(n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.surface_0, av8Var16), oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                                            k1c c4 = e12.c(uxf.c, false);
                                                            int hashCode4 = Long.hashCode(av8Var16.T);
                                                            aee m4 = av8Var16.m();
                                                            xtc C6 = fqj.C(av8Var16, f04);
                                                            if3.k7.getClass();
                                                            zg3 zg3Var4 = hf3.b;
                                                            av8Var16.h0();
                                                            if (av8Var16.S) {
                                                                av8Var16.l(zg3Var4);
                                                            } else {
                                                                av8Var16.q0();
                                                            }
                                                            waa.K(av8Var16, c4, hf3.g);
                                                            waa.K(av8Var16, m4, hf3.f);
                                                            waa.K(av8Var16, Integer.valueOf(hashCode4), hf3.j);
                                                            waa.J(av8Var16, hf3.k);
                                                            waa.K(av8Var16, C6, hf3.d);
                                                            gv9 gv9Var5 = l22Var2.a.a;
                                                            r9k r9kVar2 = l22Var2.c;
                                                            mzg mzgVar2 = mzgVar;
                                                            float h = mzgVar2.a.h();
                                                            qug qugVar2 = mzgVar2.c;
                                                            boolean booleanValue = ((Boolean) ((eoh) mzgVar2.b).getValue()).booleanValue();
                                                            boolean booleanValue2 = ((Boolean) mzgVar2.d.getValue()).booleanValue();
                                                            int i22 = l22Var2.d;
                                                            fv5 fv5Var6 = fv5Var4;
                                                            boolean z8 = fv5Var6.c;
                                                            String str4 = fv5Var6.d;
                                                            xtc A = wnn.A(utcVar2, o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
                                                            List list6 = list5;
                                                            int i23 = i19;
                                                            xtc K = yqo.K(lz.J(A, (e9d) list6.get(i23), null), mzgVar2, f5, av8Var16);
                                                            Function1 function120 = function118;
                                                            boolean g14 = av8Var16.g(function120) | av8Var16.e(i23);
                                                            Object O27 = av8Var16.O();
                                                            a99 a99Var = nf3.a;
                                                            if (g14 || O27 == a99Var) {
                                                                O27 = new ru5(i23, 0, function120);
                                                                av8Var16.n0(O27);
                                                            }
                                                            Function1 function121 = (Function1) O27;
                                                            boolean g15 = av8Var16.g(mzgVar2);
                                                            Object O28 = av8Var16.O();
                                                            if (g15 || O28 == a99Var) {
                                                                O28 = new qu5(mzgVar2, 1);
                                                                av8Var16.n0(O28);
                                                            }
                                                            Function1 function122 = (Function1) O28;
                                                            ct8 ct8Var4 = ct8Var3;
                                                            boolean g16 = av8Var16.g(ct8Var4) | av8Var16.i(fv5Var6) | av8Var16.g(a5);
                                                            Object O29 = av8Var16.O();
                                                            if (g16 || O29 == a99Var) {
                                                                O29 = new mi(21, ct8Var4, fv5Var6, a5);
                                                                av8Var16.n0(O29);
                                                            }
                                                            z8e.f(gv9Var5, h, booleanValue, qugVar2, booleanValue2, i22, z8, str4, r9kVar2, function121, function122, (Function0) O29, K, av8Var16, 0);
                                                            av8Var16.s(true);
                                                        } else {
                                                            av8Var16.W();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, z6), i18);
                                                int i22 = l22Var.d;
                                                gv9 gv9Var5 = l22Var.a.b;
                                                int i23 = i22 - (fv5Var4.c ? 1 : 0);
                                                if (gv9Var5 == null || !gv9Var5.isEmpty()) {
                                                    Iterator<E> it2 = gv9Var5.iterator();
                                                    while (it2.hasNext()) {
                                                        if (((ku5) it2.next()).i) {
                                                            z4 = z6;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                                if (z4 || fv5Var4.g != null) {
                                                    fv5Var3 = fv5Var4;
                                                    z5 = z6;
                                                } else {
                                                    fv5Var3 = fv5Var4;
                                                    z5 = false;
                                                }
                                                Iterator it3 = it;
                                                boolean z8 = z4;
                                                esaVar.a(gv9Var5.size(), new zi(17, new o81(i19, i18), gv9Var5), new xo(gv9Var5, 4), new tc3(2039820996, new vu5(gv9Var5, l22Var, z5, list5, i19, mzgVar, f5, fv5Var3, f4, i23, function24), true));
                                                if (z5) {
                                                    i17 = 2;
                                                    esa.d(esaVar, ljg.j(i19, "section_footer_"), null, new tc3(1515295806, new pu5(z8, fv5Var3, 0), true), 2);
                                                } else {
                                                    i17 = 2;
                                                }
                                                z6 = true;
                                                i18 = i17;
                                                fv5Var4 = fv5Var3;
                                                i19 = i21;
                                                function118 = function119;
                                                it = it3;
                                                nu5Var = this;
                                            }
                                        }
                                    };
                                    av8Var15.n0(function117);
                                    O26 = function117;
                                }
                                v8a.a(d2, null, C5, null, null, null, false, null, (Function1) O26, av8Var15, 384, 506);
                            } else {
                                av8Var15.W();
                            }
                            return Unit.a;
                        }
                    }), av8Var14, 56);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 17:
                return a(obj, obj2, obj3);
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
                ux7 ux7Var = (ux7) obj8;
                fy7 fy7Var5 = (fy7) obj7;
                String str4 = fy7Var5.b;
                w31 w31Var = (w31) obj6;
                of3 of3Var13 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var15 = (av8) of3Var13;
                if (!av8Var15.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    av8Var15.W();
                } else if (ux7Var != null) {
                    av8Var15.d0(1069582037);
                    int i14 = ux7Var.a;
                    String str5 = ux7Var.b;
                    String str6 = str5 == null ? "" : str5;
                    int i15 = fy7Var5.a;
                    String str7 = str4 == null ? "" : str4;
                    bx7 h = w31Var.h();
                    Integer valueOf = (h == null || (fy7Var4 = h.g) == null) ? null : Integer.valueOf(fy7Var4.a);
                    bx7 h2 = w31Var.h();
                    Integer valueOf2 = (h2 == null || (fy7Var3 = h2.h) == null) ? null : Integer.valueOf(fy7Var3.a);
                    bx7 h3 = w31Var.h();
                    Integer num3 = h3 != null ? h3.m : null;
                    bx7 h4 = w31Var.h();
                    Integer num4 = h4 != null ? h4.n : null;
                    bx7 h5 = w31Var.h();
                    l98.p(i14, str6, Integer.valueOf(i15), valueOf, valueOf2, num3, num4, (h5 == null || (num2 = h5.q) == null) ? 0 : num2.intValue(), str7, null, false, av8Var15, 0, 0, 1536);
                    av8Var15.s(false);
                } else {
                    av8Var15.d0(1070169983);
                    int i16 = fy7Var5.a;
                    String str8 = str4 == null ? "" : str4;
                    bx7 h6 = w31Var.h();
                    Integer valueOf3 = (h6 == null || (fy7Var2 = h6.g) == null) ? null : Integer.valueOf(fy7Var2.a);
                    bx7 h7 = w31Var.h();
                    Integer valueOf4 = (h7 == null || (fy7Var = h7.h) == null) ? null : Integer.valueOf(fy7Var.a);
                    bx7 h8 = w31Var.h();
                    Integer num5 = h8 != null ? h8.m : null;
                    bx7 h9 = w31Var.h();
                    Integer num6 = h9 != null ? h9.n : null;
                    bx7 h10 = w31Var.h();
                    l98.v(i16, str8, valueOf3, valueOf4, num5, num6, (h10 == null || (num = h10.q) == null) ? 0 : num.intValue(), null, av8Var15, 0, 128);
                    av8Var15.s(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ d67(int i, Object obj, Object obj2, Function1 function1) {
        this.a = i;
        this.c = obj;
        this.b = function1;
        this.d = obj2;
    }

    public /* synthetic */ d67(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ d67(Function1 function1, ct8 ct8Var, Function2 function2) {
        this.a = 16;
        this.b = function1;
        this.c = ct8Var;
        this.d = function2;
    }

    public /* synthetic */ d67(Function1 function1, Function1 function12, mb7 mb7Var) {
        this.a = 1;
        this.b = function1;
        this.c = function12;
        this.d = mb7Var;
    }
}
