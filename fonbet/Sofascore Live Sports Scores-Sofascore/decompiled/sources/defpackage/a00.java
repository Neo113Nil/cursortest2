package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a00 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(pnd pndVar, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1776202187);
        int i3 = (av8Var.g(pndVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && av8Var.f(j)) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            av8Var.t();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new u2(pndVar, 8);
                av8Var.n0(O);
            }
            fcp.S(pndVar, uxf.d, yqo.H(-1653527038, av8Var, new wz(j, o3h.a(xtcVar, false, (Function1) O))), av8Var, i4 | 432);
        } else {
            av8Var.W();
        }
        long j2 = j;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xj(pndVar, xtcVar, j2, i, i2, 1);
        }
    }

    public static final void b(int i, int i2, of3 of3Var, xtc xtcVar) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                xtcVar = utc.a;
            }
            nq8.h(av8Var, td4.Y(bkh.m(xtcVar, a, 25.0f), new yz(((wej) av8Var.k(xej.a)).a, i5)));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(xtcVar, i, i2, 0);
        }
    }
}
