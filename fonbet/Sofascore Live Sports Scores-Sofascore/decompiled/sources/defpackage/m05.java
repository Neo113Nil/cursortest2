package defpackage;

import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class m05 {
    public static final void a(String str, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-113051879);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.e(), av8Var, i2 & 14, 24960, 110584);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            boolean z = (i2 & 112) == 32;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new v61(17, function0);
                av8Var.n0(O);
            }
            qx9.m("POP", (Function0) O, null, 0L, 0L, false, av8Var, 6, 60);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k05(str, function0, xtcVar2, i, 0);
        }
    }

    public static final void b(int i, of3 of3Var, xtc xtcVar, Function1 function1) {
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(290525585);
        int i2 = (av8Var.i(function1) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtcVar2 = utc.a;
            xtc f0 = l98.f0(l98.d0(hkg.u0(ml4.f0(bkh.d(xtcVar2, 1.0f)), hkg.o0(av8Var), false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
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
            av8Var.d0(-1380309976);
            for (j1f j1fVar : b.j(a1f.h, new i1f(new WeeklyStatus.WeeklyPromotion(5, "PopUp test", 3, 2)), z0f.h, c1f.h, d1f.h, new f1f(SurveyConfigData.INSTANCE.getMockSurvey(), true), new g1f(16377078), new h1f(16377078), new w0f(PartnerOfferType.Streaming), new w0f(PartnerOfferType.Product), new w0f(PartnerOfferType.Giveaway), new w0f(PartnerOfferType.SeeMore))) {
                String str = j1fVar.a;
                boolean i3 = ((i2 & 14) == 4) | av8Var.i(j1fVar);
                Object O = av8Var.O();
                if (i3 || O == nf3.a) {
                    O = new h84(6, function1, j1fVar);
                    av8Var.n0(O);
                }
                a(str, (Function0) O, null, av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l05(function1, xtcVar2, i, 0);
        }
    }
}
