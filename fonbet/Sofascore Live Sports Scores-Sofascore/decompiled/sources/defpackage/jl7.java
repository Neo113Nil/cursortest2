package defpackage;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class jl7 {
    public static final void a(ll7 ll7Var, imh imhVar, il8 il8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        ll7Var.getClass();
        imhVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1464163254);
        int i2 = i | (av8Var2.g(ll7Var) ? 4 : 2) | (av8Var2.e(il8Var == null ? -1 : il8Var.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | 24576;
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            long j = r13.h;
            tc3 H = yqo.H(1230031631, av8Var2, new kz6(16, ll7Var, function1));
            tc3 H2 = yqo.H(-1117205232, av8Var2, new hl7(imhVar, 1));
            tc3 H3 = yqo.H(-1759386663, av8Var2, new d67(25, (Object) ll7Var, (Object) il8Var, (Object) function1));
            xtcVar2 = utc.a;
            av8Var = av8Var2;
            q5a.p(xtcVar2, null, H, H2, null, 0, j, 0L, null, H3, av8Var, 806882694, 434);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) ll7Var, (Object) imhVar, (Object) il8Var, function1, (Object) xtcVar2, i, 13);
        }
    }

    public static final void b(ml7 ml7Var, of3 of3Var, int i) {
        ml7 ml7Var2;
        av8 av8Var;
        Activity activity;
        e1d e1dVar;
        imh imhVar;
        ml7Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1718901974);
        int i2 = (av8Var2.i(ml7Var) ? 4 : 2) | i;
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            Activity activity2 = (Activity) av8Var2.k(ngb.a);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new imh();
                av8Var2.n0(O2);
            }
            imh imhVar2 = (imh) O2;
            e1d x = rfo.x(ml7Var.n, av8Var2, 0);
            hof hofVar = ml7Var.p;
            boolean i3 = av8Var2.i(ku3Var) | av8Var2.i(activity2) | av8Var2.i(ml7Var);
            Object O3 = av8Var2.O();
            if (i3 || O3 == a99Var) {
                l50 l50Var = new l50(ku3Var, activity2, imhVar2, ml7Var, 23);
                activity = activity2;
                ml7Var2 = ml7Var;
                e1dVar = x;
                imhVar = imhVar2;
                av8Var2.n0(l50Var);
                O3 = l50Var;
            } else {
                activity = activity2;
                ml7Var2 = ml7Var;
                e1dVar = x;
                imhVar = imhVar2;
            }
            av8Var = av8Var2;
            w1a.c(hofVar, null, (Function1) O3, av8Var, 0, 14);
            k53.M(((ll7) e1dVar.getValue()).i, av8Var, 0);
            ll7 ll7Var = (ll7) e1dVar.getValue();
            il8 r = ml7Var2.r();
            boolean i4 = av8Var.i(ml7Var2) | av8Var.i(activity);
            Object O4 = av8Var.O();
            if (i4 || O4 == a99Var) {
                O4 = new w47(12, ml7Var2, activity);
                av8Var.n0(O4);
            }
            a(ll7Var, imhVar, r, (Function1) O4, null, av8Var, 48);
        } else {
            ml7Var2 = ml7Var;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(ml7Var2, i, 0);
        }
    }
}
