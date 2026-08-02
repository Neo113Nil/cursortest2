package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ao6 {
    public static final void a(ppb ppbVar, Function1 function1, qpa qpaVar, float f, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        function1.getClass();
        qpaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1528066902);
        int i2 = i | (av8Var.g(ppbVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(qpaVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.d(f) ? a.o : 1024) | 24576;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            g28 g28Var = bkh.c;
            l39 l39Var = new l39();
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
            t3e t3eVar = new t3e(8.0f, f, 8.0f, hkg.u(48.0f, av8Var, 0));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new wn6(ppbVar, function1, 0);
                av8Var.n0(O);
            }
            haa.d(l39Var, g28Var, qpaVar, t3eVar, ng0Var2, ng0Var, null, false, null, (Function1) O, av8Var, (i2 & 896) | 1769472, 912);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xn6(ppbVar, function1, qpaVar, f, xtcVar2, i, 0);
        }
    }
}
