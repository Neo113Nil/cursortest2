package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ybc {
    public static final void a(vnb vnbVar, tee teeVar, Function1 function1, Function1 function12, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(644819785);
        int i2 = i | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.g(teeVar) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function12) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new abb(29);
                av8Var.n0(O);
            }
            wkn.a(vnbVar, null, null, (Function1) O, yqo.H(-550563317, av8Var, new er6(teeVar, function1, function12, context, 8)), av8Var, (i2 & 14) | 27648, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 5, vnbVar, teeVar, function1, function12);
        }
    }

    public static final void b(w41 w41Var, tee teeVar, Function1 function1, of3 of3Var, int i) {
        w41Var.getClass();
        teeVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(447868794);
        int i2 = i | (av8Var.g(w41Var) ? 4 : 2) | (av8Var.g(teeVar) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            e1d x = rfo.x(w41Var.f, av8Var, 0);
            xhf J = x2a.J(av8Var);
            zbc zbcVar = (zbc) ((vnb) x.getValue()).a();
            boolean c = Intrinsics.c(zbcVar != null ? zbcVar.e : null, Boolean.TRUE);
            xtc O = kda.O(kda.w(bkh.c), "refresh_layout", av8Var);
            boolean z = (i2 & 896) == 256;
            Object O2 = av8Var.O();
            if (z || O2 == nf3.a) {
                O2 = new vbc(0, function1);
                av8Var.n0(O2);
            }
            x2a.h(c, (Function0) O2, O, J, null, yqo.H(-226950975, av8Var, new ak1(J, x, 3)), yqo.H(-441780128, av8Var, new er6(21, teeVar, w41Var, x, function1)), av8Var, 1769472);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(w41Var, teeVar, function1, i, 0);
        }
    }
}
