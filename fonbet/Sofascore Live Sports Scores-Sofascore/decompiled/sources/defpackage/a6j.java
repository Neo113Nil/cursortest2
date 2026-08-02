package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a6j {
    static {
        ypa.b(new z2j(12));
    }

    public static final void a(f29 f29Var, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        r13 e;
        long j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-746469180);
        int i2 = i | (av8Var.g(f29Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc A = wnn.A(xtcVar, o7g.a(4.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = nuh.u;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 18), av8Var, 0);
            Integer num = f29Var.b;
            String str = null;
            if (num == null) {
                av8Var.d0(1277636423);
                av8Var.s(false);
                e = null;
            } else {
                av8Var.d0(1277636424);
                e = vxd.e(av8Var, false, r13.c(lz.D(num.intValue(), av8Var), f29Var.c));
            }
            xtc q = n9e.q(y, e != null ? e.a : r13.h, oyn.e);
            if (f29Var.f) {
                j = ljg.f(av8Var, -97327219, R.color.n_lv_4, av8Var, false);
            } else {
                av8Var.d0(-97326545);
                av8Var.s(false);
                j = r13.h;
            }
            xtc d0 = l98.d0(yso.o(q, 1.0f, j, o7g.a(4.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            r9k r9kVar = f29Var.a;
            if (r9kVar == null) {
                av8Var.d0(1277988211);
            } else {
                av8Var.d0(-97321906);
                str = r9kVar.a(av8Var);
            }
            av8Var.s(false);
            if (str == null) {
                str = "";
            }
            yf8 yf8Var = xth.a;
            q5a.w(str, d0, lz.D(f29Var.d, av8Var), null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, xth.b(), av8Var, 0, 24576, 113656);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(f29Var, function0, xtcVar, i, 11);
        }
    }

    public static final void b(y5j y5jVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1819109162);
        int i2 = (av8Var.g(y5jVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            un0.a(bkh.d(l98.c0(utc.a, 8.0f, 4.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-328307336, av8Var, new e6i(9, (Context) av8Var.k(nz.b), y5jVar)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new z5j(y5jVar, i);
        }
    }
}
