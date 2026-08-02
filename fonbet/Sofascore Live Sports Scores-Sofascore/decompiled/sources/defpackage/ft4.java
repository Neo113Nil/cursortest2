package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ft4 {
    public static final g2f a = new g2f(30);

    public static final void a(r8j r8jVar, f8j f8jVar, of3 of3Var, int i) {
        Context context;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1904307118);
        int i2 = 2;
        int i3 = (av8Var.g(r8jVar) ? 4 : 2) | i | (av8Var.i(f8jVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                av8Var.d0(-1009482584);
                context = (Context) av8Var.k(nz.b);
                av8Var.s(false);
            } else {
                av8Var.d0(-1009433480);
                av8Var.s(false);
                context = null;
            }
            boolean i4 = av8Var.i(f8jVar) | ((i3 & 14) == 4) | av8Var.i(context);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new fa(17, f8jVar, context, r8jVar);
                av8Var.n0(O);
            }
            kq3.b(null, null, (Function1) O, av8Var, 0, 3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(r8jVar, f8jVar, i, i2);
        }
    }

    public static final void b(int i, long j, of3 of3Var, int i2) {
        int i3;
        int i4;
        eqf u;
        et4 et4Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (av8Var.e(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.f(j) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean g = ((i4 & 14) == 4) | av8Var.g(context);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                av8Var.n0(O);
            }
            int intValue = ((Number) O).intValue();
            if (intValue == -1) {
                u = av8Var.u();
                if (u != null) {
                    et4Var = new et4(i3, j, i2, 1, (byte) 0);
                    u.d = et4Var;
                }
                return;
            }
            d7e t = haa.t(intValue, 0, av8Var);
            boolean z = (i4 & 112) == 32;
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = j == 16 ? null : new ay1(j, 5);
                av8Var.n0(O2);
            }
            e12.a(0, av8Var, fz8.Z(bkh.l(utc.a, jq3.e), t, null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (ay1) O2, 22));
        } else {
            av8Var.W();
        }
        u = av8Var.u();
        if (u != null) {
            et4Var = new et4(i, j, i2, 0, (byte) 0);
            u.d = et4Var;
        }
    }

    public static final void c(r8j r8jVar, g8j g8jVar, Function0 function0, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(r8jVar) : av8Var.i(r8jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? av8Var.g(g8jVar) : av8Var.i(g8jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        boolean z = false;
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && av8Var.g(g8jVar));
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new arb(new hq3(new h84(3, g8jVar, function0)));
                av8Var.n0(O);
            }
            arb arbVar = (arb) O;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && av8Var.i(r8jVar))) {
                z = true;
            }
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new h63(r8jVar, 15);
                av8Var.n0(O2);
            }
            t20.a(arbVar, (Function0) O2, a, yqo.H(1315155414, av8Var, new ns4(i3, g8jVar, r8jVar)), av8Var, 3456, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(r8jVar, g8jVar, function0, i, 16);
        }
    }

    public static final void d(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            hz8.s(xtcVar, p8j.a, tc3Var, av8Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar, tc3Var, i, i3);
        }
    }
}
