package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class mo7 {
    public static final void a(ro7 ro7Var, String str, il8 il8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        ro7Var.getClass();
        str.getClass();
        il8Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1476632345);
        int i2 = i | (av8Var.g(ro7Var) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.e(il8Var.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024) | 24576;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new gl7(3);
                av8Var.n0(O);
            }
            wkn.a(ro7Var, null, null, (Function1) O, yqo.H(1315329907, av8Var, new er6(function1, str, context, il8Var)), av8Var, (i2 & 14) | 27648, 6);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) ro7Var, (Object) str, (Object) il8Var, function1, (Object) xtcVar2, i, 17);
        }
    }
}
