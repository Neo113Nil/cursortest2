package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekPlayerUIData;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class yxi {
    static {
        new TeamOfTheWeekPlayerUIData(12994, "S. Pletikosa", 2817, true, Double.valueOf(8.2d));
    }

    public static final void a(TeamOfTheWeekPlayerUIData teamOfTheWeekPlayerUIData, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        teamOfTheWeekPlayerUIData.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1525721254);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(teamOfTheWeekPlayerUIData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 40.0f);
            mv1 mv1Var = uxf.d;
            n12 n12Var = n12.a;
            td4.C(teamOfTheWeekPlayerUIData.a, n12Var.a(l, mv1Var), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
            av8Var.a0(-17809100, Integer.valueOf(teamOfTheWeekPlayerUIData.a));
            i9a.j(teamOfTheWeekPlayerUIData.e, teamOfTheWeekPlayerUIData.d, true, n12Var.a(utcVar, uxf.i), true, false, null, av8Var, 24960, 96);
            av8Var = av8Var;
            av8Var.s(false);
            td4.G(teamOfTheWeekPlayerUIData.c, n12Var.a(bkh.l(utcVar, 24.0f), uxf.k), false, 0L, av8Var, 0, 12);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(teamOfTheWeekPlayerUIData, xtcVar, i, 4);
        }
    }

    public static final void b(TeamOfTheWeekPlayerUIData teamOfTheWeekPlayerUIData, int i, xtc xtcVar, Function1 function1, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1465615118);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(teamOfTheWeekPlayerUIData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function1) ? 2048 : 1024;
        }
        if (!av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.W();
        } else if (teamOfTheWeekPlayerUIData == null) {
            av8Var.d0(497751865);
            av8Var.s(false);
        } else {
            av8Var.d0(497751866);
            xtc e = bkh.e(bkh.p(xtcVar, i), 80.0f);
            boolean z = (i3 & 7168) == 2048;
            int i4 = i3 & 14;
            boolean z2 = (i4 == 4) | z;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new deh(20, function1, teamOfTheWeekPlayerUIData);
                av8Var.n0(O);
            }
            xtc n = tol.n(e, 0.9f, (Function0) O, 2);
            u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, n);
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
            a(teamOfTheWeekPlayerUIData, bkh.e(bkh.p(utc.a, 60.0f), 50.0f), av8Var, i4 | 48);
            qea.e(teamOfTheWeekPlayerUIData.b, null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            av8Var.s(true);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(teamOfTheWeekPlayerUIData, i, xtcVar, function1, i2);
        }
    }
}
