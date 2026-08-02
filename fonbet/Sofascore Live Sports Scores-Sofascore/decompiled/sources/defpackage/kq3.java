package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kq3 {
    public static final gq3 a;

    static {
        rzg rzgVar = rzg.a;
        ff5 ff5Var = t20.a;
        rzg rzgVar2 = rzg.a;
        rzg rzgVar3 = rzg.a;
        long j = r13.d;
        long j2 = r13.b;
        a = new gq3(j, j2, j2, r13.c(j2, 0.38f), r13.c(j2, 0.38f));
    }

    public static final void a(gq3 gq3Var, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-527864079);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gq3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            lv1 lv1Var = jq3.a;
            xtc u0 = hkg.u0(l98.d0(fz8.d0(n9e.q(d2a.E(xtcVar, 3.0f, o7g.a(4.0f), false, 0L, 28), gq3Var.a, oyn.e), n9a.b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jq3.d, 1), hkg.o0(av8Var), false, 14);
            int i3 = (i2 << 3) & 7168;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, u0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            tc3Var.invoke(x23.a, av8Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(gq3Var, xtcVar, tc3Var, i, 11);
        }
    }

    public static final void b(xtc xtcVar, gq3 gq3Var, Function1 function1, of3 of3Var, int i, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (av8Var.g(gq3Var) ? 32 : 16);
        }
        int i7 = i4 | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                xtcVar = utc.a;
            }
            if (i6 != 0) {
                gq3Var = a;
            }
            a(gq3Var, xtcVar, yqo.H(-250345048, av8Var, new hl6(21, (Object) gq3Var, function1)), av8Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        gq3 gq3Var2 = gq3Var;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(xtcVar2, gq3Var2, function1, i, i2);
        }
    }

    public static final void c(String str, boolean z, gq3 gq3Var, xtc xtcVar, ct8 ct8Var, Function0 function0, of3 of3Var, int i) {
        String str2;
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2001167027);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (av8Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(gq3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.i(ct8Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var2.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i3 = i2;
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            lv1 lv1Var = jq3.a;
            float f = jq3.c;
            ng0 ng0Var = new ng0(f, true, new a70(6));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new m1(z, function0, 4);
                av8Var2.n0(O);
            }
            xtc d0 = l98.d0(bkh.n(bkh.d(oyn.w(xtcVar, z, str2, null, (Function0) O, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            if (ct8Var == null) {
                av8Var2.d0(-1597947094);
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1597947093);
                float f2 = jq3.e;
                xtc k = bkh.k(utc.a, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 2);
                k1c c = e12.c(uxf.c, false);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, k);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c, f50Var);
                waa.K(av8Var2, m2, ff3Var);
                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C2, f50Var3);
                ct8Var.invoke(new r13(z ? gq3Var.c : gq3Var.e), av8Var2, 0);
                av8Var2.s(true);
                av8Var2.s(false);
            }
            long j = z ? gq3Var.b : gq3Var.d;
            iz8.d(str, new goa(1.0f, true), new dfj(j, jq3.h, jq3.i, null, jq3.k, jq3.b, 0, jq3.j, 16613240), null, 0, false, 1, 0, null, null, av8Var2, (i3 & 14) | 1572864, 952);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(str, z, gq3Var, xtcVar, ct8Var, function0, i);
        }
    }
}
