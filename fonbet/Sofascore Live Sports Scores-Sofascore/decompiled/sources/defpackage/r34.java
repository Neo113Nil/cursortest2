package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class r34 {
    public static final void a(Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1323847448);
        int i2 = (av8Var.i(function1) ? 4 : 2) | i;
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtc d = bkh.d(utc.a, 1.0f);
            l8g a = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
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
            av8Var.d0(473364653);
            for (CrowdsourcingIncidentType.Card card : b.j(CrowdsourcingIncidentType.Card.YELLOW, CrowdsourcingIncidentType.Card.RED, CrowdsourcingIncidentType.Card.SECOND_YELLOW)) {
                i2h i2hVar = new i2h(card, false, true);
                goa goaVar = new goa(1.0f, true);
                boolean e = ((i2 & 14) == 4) | av8Var.e(card.ordinal());
                Object O = av8Var.O();
                if (e || O == nf3.a) {
                    O = new r82(11, function1, card);
                    av8Var.n0(O);
                }
                e2h.a(i2hVar, (Function1) O, goaVar, 8.0f, av8Var, 3072, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o34(i, i3, function1);
        }
    }

    public static final void b(boolean z, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-877666508);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.h(false) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f)), 16.0f);
            k1c c = e12.c(uxf.c, false);
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i3 = ((i2 >> 3) & 112) | 3456;
            int i4 = i2 << 15;
            mha.h(oea.v(R.string.submit, av8Var), function0, bkh.d(utcVar, 1.0f), iqh.a, null, z, false, false, 0L, 0, 0, av8Var, i3 | (458752 & i4) | (i4 & 3670016), 0, 1936);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n34(z, function0, i, 0);
        }
    }

    public static final void c(Function1 function1, of3 of3Var, int i) {
        Function1 function12;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(926287343);
        int i2 = i | (av8Var.i(function1) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            long D = lz.D(R.color.surface_1, av8Var);
            n7g b = o7g.b(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(utcVar, D, b), 16.0f);
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
            String v = oea.v(R.string.crowdsourcing_match_timeline, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            udj.c(bf3.g(16.0f, R.string.crowdsourcing_match_timeline_info, av8Var, av8Var, utcVar), l98.c0(yso.o(utcVar, 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(8.0f)), 16.0f, 8.0f), lz.D(R.color.n_lv_2, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            function12 = function1;
            a(function12, av8Var, i2 & 14);
            av8Var.s(true);
        } else {
            function12 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o34(i, 0, function12);
        }
    }
}
