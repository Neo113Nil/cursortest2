package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class gr6 {
    public static final void a(hr6 hr6Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1526140240);
        int i2 = (av8Var2.g(hr6Var) ? 4 : 2) | i | (av8Var2.i(function1) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            xhf J = x2a.J(av8Var2);
            qug J2 = u0a.J(av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.c(0);
                av8Var2.n0(O);
            }
            znh znhVar = (znh) O;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = goh.b(new h84(21, J2, znhVar));
                av8Var2.n0(O2);
            }
            cdi cdiVar = (cdi) O2;
            do7 do7Var = hr6Var.a;
            ev6 ev6Var = do7Var.c;
            s9a.f(hr6Var.p, do7Var.c, null, av8Var2, 0);
            BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
            if (brandingFantasyCompetition == null) {
                av8Var2.d0(1280663164);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1280663165);
                wnn.h(hr6Var.q, ev6Var, brandingFantasyCompetition, null, av8Var2, 0);
                av8Var2.s(false);
            }
            av8Var = av8Var2;
            q5a.p(null, null, null, null, yqo.H(-308592713, av8Var2, new cyb(29, hr6Var, cdiVar, function1)), 0, r13.h, 0L, null, yqo.H(482640511, av8Var2, new er6(hr6Var, function1, J, J2, 0)), av8Var, 806903808, 431);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(hr6Var, function1, i, 19);
        }
    }

    public static final void b(nr6 nr6Var, hp6 hp6Var, of3 of3Var, int i) {
        Object l50Var;
        nr6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1952835368);
        int i2 = (av8Var.i(nr6Var) ? 4 : 2) | i | (av8Var.i(hp6Var) ? 32 : 16);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            ce ceVar = new ce(3);
            boolean i4 = av8Var.i(context) | av8Var.i(nr6Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                O = new xw5(24, context, nr6Var);
                av8Var.n0(O);
            }
            crb O2 = xw3.O(ceVar, (Function1) O, av8Var);
            hof hofVar = hp6Var.o;
            boolean i5 = av8Var.i(nr6Var);
            Object O3 = av8Var.O();
            if (i5 || O3 == a99Var) {
                O3 = new x16(nr6Var, 8);
                av8Var.n0(O3);
            }
            w1a.c(hofVar, null, (Function1) O3, av8Var, 0, 14);
            nn2 nn2Var = hp6Var.q;
            boolean i6 = av8Var.i(nr6Var) | av8Var.i(context) | av8Var.i(hp6Var);
            Object O4 = av8Var.O();
            if (i6 || O4 == a99Var) {
                O4 = new dr6(i3, nr6Var, context, hp6Var);
                av8Var.n0(O4);
            }
            w1a.c(nn2Var, null, (Function1) O4, av8Var, 0, 14);
            hr6 k = nr6Var.k();
            boolean i7 = av8Var.i(nr6Var) | av8Var.i(hp6Var) | av8Var.i(context) | av8Var.i(O2);
            Object O5 = av8Var.O();
            if (i7 || O5 == a99Var) {
                l50Var = new l50(nr6Var, context, hp6Var, O2, 12);
                av8Var.n0(l50Var);
            } else {
                l50Var = O5;
            }
            a(k, (Function1) l50Var, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(nr6Var, hp6Var, i, 20);
        }
    }
}
