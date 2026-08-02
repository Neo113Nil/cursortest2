package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class rrj {
    static {
        ypa.b(new eej(17));
    }

    public static final void a(String str, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1637668611);
        int i2 = i | (av8Var2.g(str) ? 4 : 2);
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            xtc d0 = l98.d0(n9e.q(utc.a, lz.D(R.color.primary_highlight, av8Var2), o7g.a(12.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, d0, lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, i2 & 14, 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tk1(str, i, 11);
        }
    }

    public static final void b(String str, boolean z, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1482696523);
        int i2 = (av8Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            if (z) {
                av8Var.d0(-1568315760);
                vha.a(str, l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 4.0f, 2), null, oea.v(R.string.see_all, av8Var), Integer.valueOf(R.drawable.ic_chevron_right_large_16), null, function0, av8Var, (i2 & 14) | 48 | ((i2 << 12) & 3670016), 36);
                av8Var.s(false);
            } else {
                av8Var.d0(-1567979224);
                xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
                yf8 yf8Var = xth.a;
                udj.c(str, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var, (i2 & 14) | 48, 0, 130040);
                av8Var = av8Var;
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(str, z, (dt8) function0, i, 16);
        }
    }

    public static final void c(prj prjVar, String str, boolean z, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1904945507);
        int i2 = i | (av8Var.g(prjVar) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            un0.a(bkh.d(l98.c0(utc.a, 8.0f, 4.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1105938703, av8Var, new km7(prjVar, z, function0, str, (Context) av8Var.k(nz.b))), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(prjVar, str, z, function0, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void d(xrj xrjVar, boolean z, String str, String str2, of3 of3Var, int i) {
        av8 av8Var;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        f50 f50Var3;
        av8 av8Var2;
        int i2;
        zg3 zg3Var;
        ?? r0;
        utc utcVar;
        av8 av8Var3;
        String t;
        xrjVar.getClass();
        str2.getClass();
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(2145192473);
        int i3 = i | (av8Var4.g(xrjVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= av8Var4.h(z) ? 32 : 16;
        }
        int i4 = i3 | (av8Var4.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var4.g(str2) ? a.o : 1024);
        if (av8Var4.T(i4 & 1, (i4 & 1171) != 1170)) {
            Context context = (Context) av8Var4.k(nz.b);
            utc utcVar2 = utc.a;
            xtc d = bkh.d(kda.w(utcVar2), 1.0f);
            long D = lz.D(R.color.n_lv_4, av8Var4);
            Object O = av8Var4.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var4);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var4.O();
            if (O2 == a99Var) {
                O2 = nuh.A;
                av8Var4.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(d, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var4, 48), context, xrjVar, 9), av8Var4, 0), 16.0f, 8.0f);
            l8g a = k8g.a(ww9.b, uxf.m, av8Var4, 48);
            int hashCode = Long.hashCode(av8Var4.T);
            aee m = av8Var4.m();
            xtc C = fqj.C(av8Var4, c0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var4, a, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var4, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var4, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var4, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var4, C, f50Var6);
            if (str2.equals(Sports.BASKETBALL)) {
                av8Var4.d0(232158338);
                ff3Var = ff3Var2;
                f50Var3 = f50Var6;
                ryVar = ryVar2;
                f50Var = f50Var5;
                av8Var2 = av8Var4;
                zg3Var = zg3Var2;
                td4.G(xrjVar.a, bkh.l(utcVar2, 32.0f), false, 0L, av8Var2, 48, 12);
                i2 = 0;
                av8Var2.s(false);
                f50Var2 = f50Var4;
            } else {
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
                av8Var2 = av8Var4;
                i2 = 0;
                zg3Var = zg3Var2;
                av8Var2.d0(232294459);
                td4.J(xrjVar.a, 48, av8Var2, bkh.l(utcVar2, 32.0f));
                av8Var2.s(false);
            }
            goa d2 = bf3.d(utcVar2, 16.0f, av8Var2, 1.0f, true);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, i2);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var2);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (str == null) {
                av8Var2.d0(-1406052040);
                av8Var2.s(false);
                r0 = 0;
                av8Var3 = av8Var2;
                utcVar = utcVar2;
            } else {
                av8Var2.d0(-1406052039);
                xtc O3 = kda.O(utcVar2, "chart_item_description", av8Var2);
                yf8 yf8Var = xth.a;
                av8 av8Var5 = av8Var2;
                r0 = 0;
                utcVar = utcVar2;
                udj.c(str, O3, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var5, (i4 >> 6) & 14, 24960, 110584);
                av8Var3 = av8Var5;
                w1l.s(utcVar, 4.0f, av8Var3, false);
            }
            xtc O4 = kda.O(utcVar, "chart_item_value", av8Var3);
            String str3 = xrjVar.b;
            yf8 yf8Var2 = xth.a;
            av8 av8Var6 = av8Var3;
            udj.c(str3, O4, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var6, 0, 24960, 110584);
            av8 av8Var7 = av8Var6;
            av8Var7.s(true);
            if (z) {
                ljg.r(16.0f, 233305028, av8Var7, av8Var7, utcVar);
                Integer num = xrjVar.e;
                if (num == null) {
                    av8Var7.d0(233411853);
                    av8Var7.s(r0);
                    t = null;
                } else {
                    av8Var7.d0(233411854);
                    int intValue = num.intValue();
                    t = oea.t(xrjVar.g, intValue, new Object[]{Integer.valueOf(intValue)}, av8Var7);
                    av8Var7.s(r0);
                }
                if (t == null) {
                    av8Var7.d0(1531553945);
                    t = s02.H(xrjVar.f, xrjVar.c, null, av8Var7, 4);
                } else {
                    av8Var7.d0(1531549419);
                }
                av8Var7.s(r0);
                a(t, av8Var7, r0);
                av8Var7.s(r0);
            } else {
                av8Var7.d0(233613509);
                av8Var7.s(r0);
            }
            av8Var7.s(true);
            av8Var = av8Var7;
        } else {
            av8Var4.W();
            av8Var = av8Var4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(xrjVar, z, str, str2, i, 22);
        }
    }
}
