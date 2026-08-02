package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ded {
    public static final mqi a = ypa.b(new ivc(16));
    public static final mqi b = ypa.b(new ivc(17));

    static {
        ypa.b(new ivc(18));
    }

    public static final void a(final int i, final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2, final boolean z3, final FeaturedOddsWithProvider featuredOddsWithProvider, final xtc xtcVar, of3 of3Var, final int i2) {
        utc utcVar;
        boolean z4;
        boolean z5;
        float f;
        boolean z6;
        featuredOddsWithProvider.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1276922065);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str3) ? a.o : 1024) | (av8Var.g(str4) ? 16384 : 8192) | (av8Var.i(featuredOddsWithProvider) ? 67108864 : 33554432);
        if (av8Var.T(i3 & 1, (306783379 & i3) != 306783378)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc c0 = l98.c0(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), o7g.a(8.0f)), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar2 = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 1, 0, null, xth.c(), av8Var, (i3 >> 9) & 14, 24576, 113658);
            if (z2) {
                av8Var.d0(-1307996645);
                z4 = true;
                nq8.h(av8Var, new goa(1.0f, true));
                utcVar = utcVar2;
                z5 = false;
                wkn.k(haa.t(R.drawable.igaming_eng, 0, av8Var), null, bkh.m(utcVar, 92.0f, 21.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                f = 8.0f;
                e12.a(0, av8Var, n9e.q(bkh.m(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f, 21.0f), lz.D(R.color.n_lv_4, av8Var), oyn.e));
                wkn.k(haa.t(R.drawable.igaming_fra, 0, av8Var), null, bkh.m(utcVar, 74.0f, 21.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                z4 = true;
                z5 = false;
                f = 8.0f;
                av8Var.d0(-1307087539);
                av8Var.s(false);
            }
            av8Var.s(z4);
            utc utcVar3 = utcVar;
            xtc f0 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            OddsCountryProvider countryProvider = featuredOddsWithProvider.getCountryProvider();
            countryProvider.getClass();
            OddsProvider provider = countryProvider.getProvider();
            provider.getClass();
            yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
            String defaultBetSlipLink = countryProvider.getDefaultBetSlipLink();
            if (defaultBetSlipLink == null) {
                defaultBetSlipLink = countryProvider.getProvider().getDefaultBetSlipLink();
            }
            float f2 = f;
            nld.d(i, str, str2, new old(yldVar, defaultBetSlipLink, countryProvider.getBranded(), countryProvider.getOddsOffset(), countryProvider.getOddsMayDiffer(), countryProvider.getType(), countryProvider.getSignupLink()), egf.a(context, featuredOddsWithProvider.getCountryProvider(), featuredOddsWithProvider.getFeaturedOdds()), vmd.MONETIZED_ODDS_TAB, "additional", f0, 0L, false, cgf.c, false, false, null, null, av8Var, (i3 & 14) | 14352384 | (i3 & 112) | (i3 & 896), 54, 29440);
            udj.c(str4, l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 3, 0, null, xth.c(), av8Var, ((i3 >> 12) & 14) | 48, 24960, 109560);
            av8Var = av8Var;
            if (z) {
                av8Var.d0(797958465);
                xtc f02 = l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                l8g a4 = k8g.a(wxfVar, uxf.l, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, f02);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                kq9.b(s6a.N(R.drawable.eeep_logo, 6, av8Var), null, bkh.l(utcVar3, 24.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
                udj.c(oea.v(R.string.greek_betting_regulations_text, av8Var), l98.f0(utcVar3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.c(), av8Var, 48, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
                z6 = true;
            } else {
                if (z3) {
                    av8Var.d0(798895936);
                    udj.c(oea.v(R.string.germany_betting_regulations_text, av8Var), bkh.d(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.c(), av8Var, 48, 24960, 109560);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    av8Var.d0(799328169);
                    av8Var.s(false);
                }
                z6 = true;
            }
            av8Var.s(z6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, str, str2, str3, str4, z, z2, z3, featuredOddsWithProvider, xtcVar, i2) { // from class: ced
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ FeaturedOddsWithProvider i;
                public final /* synthetic */ xtc j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(819658753);
                    ded.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }
}
