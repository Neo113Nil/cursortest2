package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class tn7 {
    public static final void a(ao7 ao7Var, Function0 function0, Function1 function1, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        ao7Var.getClass();
        function0.getClass();
        function1.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-274912766);
        int i2 = i | (av8Var.i(ao7Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024) | 24576;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(ao7Var.o, av8Var, 0);
            hof hofVar = ao7Var.q;
            boolean i3 = av8Var.i(context);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new vt(context, 6);
                av8Var.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
            long j = r13.h;
            tc3 H = yqo.H(-1295052067, av8Var, new uu6(20, ao7Var, function0, x));
            tc3 H2 = yqo.H(-1718402733, av8Var, new ff7(ao7Var, function1, function02, context, x, 1));
            utc utcVar = utc.a;
            q5a.p(utcVar, null, H, null, null, 0, j, 0L, null, H2, av8Var, 806879622, 442);
            av8Var = av8Var;
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(ao7Var, function0, function1, function02, xtcVar2, i, 16);
        }
    }
}
