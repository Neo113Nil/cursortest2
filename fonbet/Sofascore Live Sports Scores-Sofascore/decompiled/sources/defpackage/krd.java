package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class krd {
    public static final void a(OnboardingItemUiModel onboardingItemUiModel, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1250954162);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(onboardingItemUiModel) : av8Var.i(onboardingItemUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            long D = lz.D(R.color.surface_1, av8Var);
            long D2 = lz.D(R.color.neutral_default, av8Var);
            OnboardingItemAdditionalIcon onboardingItemAdditionalIcon = onboardingItemUiModel.f;
            if (onboardingItemAdditionalIcon == null) {
                av8Var.d0(256016899);
                av8Var.s(false);
            } else {
                av8Var.d0(256016900);
                if (onboardingItemAdditionalIcon instanceof OnboardingItemAdditionalIcon.SportIcon) {
                    av8Var.d0(-1167994395);
                    Set set = wyh.a;
                    ImageVector N = s6a.N(wyh.a(((OnboardingItemAdditionalIcon.SportIcon) onboardingItemAdditionalIcon).a), 6, av8Var);
                    xtc N2 = rd0.N(xtcVar, 4.0f, 4.0f);
                    boolean f = av8Var.f(D2) | av8Var.f(D);
                    Object O = av8Var.O();
                    if (f || O == nf3.a) {
                        k76 k76Var = new k76(D2, D, 2);
                        av8Var.n0(k76Var);
                        O = k76Var;
                    }
                    kq9.b(N, null, l98.b0(bkh.l(td4.X(N2, (Function1) O), 16.0f), 2.0f), D2, av8Var, 48, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-453295463);
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(onboardingItemUiModel, xtcVar, i, 12);
        }
    }

    public static final void b(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1945336437);
        if (av8Var.T(i & 1, i != 0)) {
            long D = lz.D(R.color.n_lv_3, av8Var);
            boolean f = av8Var.f(D);
            Object O = av8Var.O();
            if (f || O == nf3.a) {
                O = new yz(D, 29);
                av8Var.n0(O);
            }
            kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var), null, bkh.l(td4.X(utc.a, (Function1) O), 20.0f), lz.D(R.color.surface_1, av8Var), av8Var, 48, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i, 17);
        }
    }

    public static final void c(OnboardingItemUiModel onboardingItemUiModel, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(139882451);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var2.g(onboardingItemUiModel) : av8Var2.i(onboardingItemUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var2, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            xtc l = bkh.l(utcVar, 24.0f);
            int ordinal = onboardingItemUiModel.b.ordinal();
            if (ordinal == 0) {
                av8Var2.d0(103388263);
                td4.G(onboardingItemUiModel.a, l, false, 0L, av8Var2, 48, 12);
                av8Var = av8Var2;
                av8Var.s(false);
            } else if (ordinal == 1) {
                av8Var2.d0(103571938);
                td4.C(onboardingItemUiModel.a, l, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                if (ordinal != 2) {
                    throw dmi.h(av8Var2, 1942996356, false);
                }
                av8Var2.d0(103760697);
                av8Var = av8Var2;
                td4.y(onboardingItemUiModel.a, 48, 12, av8Var, l, null, false);
                av8Var.s(false);
            }
            a(onboardingItemUiModel, n12.a.a(utcVar, uxf.k), av8Var, i2 & 14);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(onboardingItemUiModel, i, 10);
        }
    }

    public static final void d(OnboardingItemUiModel onboardingItemUiModel, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        onboardingItemUiModel.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-717295267);
        int i2 = (av8Var.g(onboardingItemUiModel) ? 4 : 2) | i | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new ve7(26, function0);
                av8Var.n0(O);
            }
            xtc O2 = kda.O(l98.b0(yso.o(n9e.q(wnn.A(tol.n(xtcVar, 0.9f, tol.u((Function0) O, av8Var), 2), o7g.a(40.0f)), lz.D(R.color.surface_1, av8Var), oyn.e), 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(40.0f)), 8.0f), "onboarding_added_item_component", av8Var);
            l8g a = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O2);
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
            c(onboardingItemUiModel, av8Var, i2 & 14);
            b(0, av8Var);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(onboardingItemUiModel, function0, xtcVar, i, 4);
        }
    }
}
