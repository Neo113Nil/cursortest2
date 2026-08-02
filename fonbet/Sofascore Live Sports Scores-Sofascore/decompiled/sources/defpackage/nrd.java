package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class nrd {
    public static final void a(OnboardingItemUiModel onboardingItemUiModel, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        float f;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        utc utcVar;
        n12 n12Var;
        ff3 ff3Var;
        int i2;
        boolean z2;
        utc utcVar2;
        utc utcVar3;
        boolean z3;
        char c;
        boolean z4;
        char c2;
        onboardingItemUiModel.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-345705273);
        int i3 = i | (av8Var.g(onboardingItemUiModel) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                av8Var.d0(-1510277140);
                f = r13.d(lz.D(R.color.primary_highlight, av8Var));
                av8Var.s(false);
            } else {
                av8Var.d0(426059735);
                av8Var.s(false);
                f = 0.0f;
            }
            xtc q = n9e.q(yso.o(wnn.A(xtcVar, o7g.a(16.0f)), 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(16.0f)), r13.c(lz.D(R.color.primary_highlight, av8Var), ((Number) a60.b(f, s02.h0(300, 0, null, 6), null, av8Var, 48, 28).getValue()).floatValue()), oyn.e);
            long c3 = r13.c(lz.D(R.color.primary_highlight, av8Var), 0.05f);
            boolean z5 = (i3 & 896) == 256;
            Object O = av8Var.O();
            if (z5 || O == nf3.a) {
                O = new ve7(27, function0);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, c3, null, tol.u((Function0) O, av8Var), av8Var, 23);
            av8 av8Var2 = av8Var;
            xtc O2 = kda.O(y, "onboarding_favorite_component", av8Var2);
            mv1 mv1Var = uxf.c;
            k1c c4 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, O2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var2, c4, f50Var3);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var2, C, f50Var5);
            OnboardingItemAdditionalIcon onboardingItemAdditionalIcon = onboardingItemUiModel.e;
            utc utcVar4 = utc.a;
            n12 n12Var2 = n12.a;
            if (onboardingItemAdditionalIcon == null) {
                av8Var2.d0(-412667574);
                av8Var2.s(false);
                ryVar = ryVar2;
                f50Var = f50Var4;
                f50Var2 = f50Var5;
                n12Var = n12Var2;
                ff3Var = ff3Var2;
                i2 = R.color.n_lv_1;
                utcVar2 = utcVar4;
            } else {
                av8Var2.d0(-412667573);
                xtc l = bkh.l(l98.b0(n12Var2.a(utcVar4, mv1Var), 8.0f), 16.0f);
                if (onboardingItemAdditionalIcon instanceof OnboardingItemAdditionalIcon.CountryFlag) {
                    av8Var2.d0(1185348946);
                    f50Var2 = f50Var5;
                    utcVar = utcVar4;
                    ryVar = ryVar2;
                    f50Var = f50Var4;
                    td4.k(((OnboardingItemAdditionalIcon.CountryFlag) onboardingItemAdditionalIcon).a, l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                    av8Var2 = av8Var2;
                    z2 = false;
                    av8Var2.s(false);
                    n12Var = n12Var2;
                    ff3Var = ff3Var2;
                    i2 = R.color.n_lv_1;
                } else {
                    ryVar = ryVar2;
                    f50Var = f50Var4;
                    f50Var2 = f50Var5;
                    utcVar = utcVar4;
                    if (onboardingItemAdditionalIcon instanceof OnboardingItemAdditionalIcon.SportIcon) {
                        av8Var2.d0(-1908695392);
                        Set set = wyh.a;
                        ImageVector N = s6a.N(wyh.a(((OnboardingItemAdditionalIcon.SportIcon) onboardingItemAdditionalIcon).a), 6, av8Var2);
                        long D = lz.D(R.color.n_lv_1, av8Var2);
                        ff3Var = ff3Var2;
                        n12Var = n12Var2;
                        i2 = R.color.n_lv_1;
                        kq9.b(N, null, l, D, av8Var2, 48, 0);
                        z2 = false;
                        av8Var2.s(false);
                    } else {
                        n12Var = n12Var2;
                        ff3Var = ff3Var2;
                        i2 = R.color.n_lv_1;
                        if (!(onboardingItemAdditionalIcon instanceof OnboardingItemAdditionalIcon.TeamLogo)) {
                            throw dmi.h(av8Var2, 1185347113, false);
                        }
                        av8Var2.d0(1185366629);
                        td4.G(((OnboardingItemAdditionalIcon.TeamLogo) onboardingItemAdditionalIcon).a, l, false, 0L, av8Var2, 0, 12);
                        z2 = false;
                        av8Var2.s(false);
                    }
                }
                av8Var2.s(z2);
                utcVar2 = utcVar;
            }
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar2, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
            u23 a = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a, f50Var3);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var2);
            xtc l2 = bkh.l(utcVar2, 40.0f);
            int ordinal = onboardingItemUiModel.b.ordinal();
            if (ordinal != 0) {
                z3 = true;
                if (ordinal != 1) {
                    c = 2;
                    if (ordinal != 2) {
                        throw dmi.h(av8Var2, -390742522, false);
                    }
                    av8Var2.d0(772349359);
                    av8 av8Var3 = av8Var2;
                    c2 = 6;
                    td4.y(onboardingItemUiModel.a, 48, 12, av8Var3, l2, null, false);
                    av8Var2 = av8Var3;
                    z4 = false;
                    av8Var2.s(false);
                    Unit unit = Unit.a;
                    utcVar3 = utcVar2;
                } else {
                    c = 2;
                    z4 = false;
                    c2 = 6;
                    av8Var2.d0(772136792);
                    utcVar3 = utcVar2;
                    td4.C(onboardingItemUiModel.a, l2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
                    av8Var2.s(false);
                    Unit unit2 = Unit.a;
                }
            } else {
                utcVar3 = utcVar2;
                z3 = true;
                c = 2;
                z4 = false;
                c2 = 6;
                av8Var2.d0(771929309);
                td4.G(onboardingItemUiModel.a, l2, false, 0L, av8Var2, 48, 12);
                av8Var2.s(false);
                Unit unit3 = Unit.a;
            }
            String r = c.r(onboardingItemUiModel.c, "-", "-\u200b", z4);
            yf8 yf8Var = xth.a;
            av8 av8Var4 = av8Var2;
            boolean z6 = z3;
            boolean z7 = z4;
            udj.c(r, null, lz.D(i2, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 3, null, xth.k(), av8Var4, 0, 221568, 76794);
            av8Var = av8Var4;
            av8Var.s(z6);
            fz8.e(z, l98.b0(n12Var.a(utcVar3, uxf.e), 8.0f), uo5.e(s02.h0(300, z7 ? 1 : 0, null, 6), 2), uo5.f(s02.h0(300, z7 ? 1 : 0, null, 6), 2), null, s02.d, av8Var, ((i3 >> 3) & 14) | 200064, 16);
            av8Var.s(z6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(onboardingItemUiModel, z, function0, xtcVar, i, 15);
        }
    }
}
