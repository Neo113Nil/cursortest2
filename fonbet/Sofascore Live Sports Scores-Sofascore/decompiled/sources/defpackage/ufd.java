package defpackage;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ufd {
    public static final joa a;

    static {
        ivc ivcVar = new ivc(20);
        ysa ysaVar = ysa.c;
        ypa.a(ysaVar, ivcVar);
        a = ypa.a(ysaVar, new ivc(21));
    }

    public static final void a(boolean z, Function0 function0, boolean z2, of3 of3Var, int i, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-647678393);
        if ((i & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                z2 = true;
            }
            tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(878754183, av8Var, new sfd(function0, z, z2)), av8Var, 56);
        } else {
            av8Var.W();
        }
        boolean z3 = z2;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv2(z, function0, z3, i, i2);
        }
    }

    public static final void b(vfd vfdVar, Function1 function1, String str, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        gv9<ghd> gv9Var;
        long j;
        a99 a99Var;
        utc utcVar;
        boolean z;
        av8 av8Var2;
        boolean z2;
        Object obj;
        Object obj2;
        vfdVar.getClass();
        function1.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-397772968);
        int i3 = i | (av8Var3.g(vfdVar) ? 4 : 2) | (av8Var3.i(function1) ? 32 : 16) | (av8Var3.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object O = av8Var3.O();
            a99 a99Var2 = nf3.a;
            Object obj3 = O;
            if (O == a99Var2) {
                ivc ivcVar = new ivc(22);
                av8Var3.n0(ivcVar);
                obj3 = ivcVar;
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) obj3, av8Var3, 48);
            qug o0 = hkg.o0(av8Var3);
            utc utcVar2 = utc.a;
            xtc u0 = hkg.u0(utcVar2, o0, false, 14);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            e1d e1dVar2 = e1dVar;
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, u0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            boolean z3 = vfdVar.d;
            long j2 = vfdVar.e;
            gv9 gv9Var2 = vfdVar.a;
            if (z3) {
                av8Var3.d0(1822549778);
                String v = oea.v(R.string.enable_notifications_device_settings, av8Var3);
                String v2 = oea.v(R.string.device_settings, av8Var3);
                long D = lz.D(R.color.surface_2, av8Var3);
                xtc b0 = l98.b0(utcVar2, 8.0f);
                boolean z4 = (i3 & 112) == 32;
                Object O2 = av8Var3.O();
                if (z4 || O2 == a99Var2) {
                    vbc vbcVar = new vbc(1, function1);
                    av8Var3.n0(vbcVar);
                    obj2 = vbcVar;
                } else {
                    obj2 = O2;
                }
                i2 = i3;
                z = false;
                j = j2;
                utcVar = utcVar2;
                gv9Var = gv9Var2;
                a99Var = a99Var2;
                x2a.e(v, (Function0) obj2, b0, null, 0L, D, v2, R.drawable.ic_chevron_right_large_16, null, 0, 0, 0, av8Var3, 384, 0, 7960);
                av8 av8Var4 = av8Var3;
                av8Var4.s(false);
                av8Var2 = av8Var4;
            } else {
                i2 = i3;
                gv9Var = gv9Var2;
                j = j2;
                a99Var = a99Var2;
                utcVar = utcVar2;
                z = false;
                av8Var3.d0(1823003680);
                av8Var3.s(false);
                av8Var2 = av8Var3;
            }
            if (j != 0) {
                av8Var2.d0(1823056690);
                b0a.m(j, av8Var2, z ? 1 : 0);
                av8Var2.s(z);
            } else {
                av8Var2.d0(1823131648);
                av8Var2.s(z);
            }
            boolean z5 = gv9Var.size() > 3 ? true : z ? 1 : 0;
            if (!gv9Var.isEmpty()) {
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    if (!((ghd) it.next()).e) {
                        z2 = z ? 1 : 0;
                        break;
                    }
                }
            }
            z2 = true;
            if (z5) {
                av8Var2.d0(1823285222);
                boolean z6 = (i2 & 112) == 32 ? true : z ? 1 : 0;
                Object O3 = av8Var2.O();
                Object obj4 = O3;
                if (z6 || O3 == a99Var) {
                    vbc vbcVar2 = new vbc(2, function1);
                    av8Var2.n0(vbcVar2);
                    obj4 = vbcVar2;
                }
                c(z2, (Function0) obj4, av8Var2, z ? 1 : 0);
                av8Var2.s(z);
            } else {
                av8Var2.d0(1823463968);
                av8Var2.s(z);
            }
            av8Var2.d0(-218272129);
            for (ghd ghdVar : gv9Var) {
                boolean z7 = (!Intrinsics.c(ghdVar.a, str) || ((Boolean) e1dVar2.getValue()).booleanValue()) ? z ? 1 : 0 : true;
                boolean g = ((i2 & 112) == 32 ? true : z ? 1 : 0) | av8Var2.g(ghdVar);
                Object O4 = av8Var2.O();
                if (g || O4 == a99Var) {
                    ixa ixaVar = new ixa(22, function1, ghdVar);
                    av8Var2.n0(ixaVar);
                    obj = ixaVar;
                } else {
                    obj = O4;
                }
                Function0 function0 = (Function0) obj;
                e1d e1dVar3 = e1dVar2;
                boolean g2 = av8Var2.g(e1dVar3);
                Object O5 = av8Var2.O();
                if (g2 || O5 == a99Var) {
                    O5 = new tra(5, e1dVar3);
                    av8Var2.n0(O5);
                }
                d(ghdVar, z7, function0, (Function0) O5, av8Var2, 0);
                e1dVar2 = e1dVar3;
            }
            av8Var2.s(z);
            xtc z8 = l98.b0(utcVar, 16.0f).z(bkh.c);
            String v3 = oea.v(R.string.save, av8Var2);
            boolean z9 = vfdVar.b;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object O6 = av8Var2.O();
            Object obj5 = O6;
            if (z || O6 == a99Var) {
                vbc vbcVar3 = new vbc(3, function1);
                av8Var2.n0(vbcVar3);
                obj5 = vbcVar3;
            }
            av8 av8Var5 = av8Var2;
            mha.h(v3, (Function0) obj5, z8, null, null, z9, false, false, 0L, 0, 0, av8Var5, 384, 0, 2008);
            av8 av8Var6 = av8Var5;
            av8Var6.s(true);
            av8Var = av8Var6;
        } else {
            av8Var3.W();
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i, 3, vfdVar, str, function1);
        }
    }

    public static final void c(boolean z, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-386245559);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(l98.b0(utcVar, 8.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
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
                O2 = jxa.m;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(q, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 15), av8Var, 0), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
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
            goa g = ljg.g(av8Var, C, hf3.d, 1.0f, true);
            String v = oea.v(R.string.select_all, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, g, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            a(z, function0, false, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 4);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n34(z, function0, i, 3);
        }
    }

    public static final void d(ghd ghdVar, boolean z, Function0 function0, Function0 function02, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-725197148);
        int i2 = i | (av8Var.g(ghdVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? 2048 : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O);
            }
            q50 q50Var = (q50) O;
            Boolean valueOf = Boolean.valueOf(z);
            boolean i3 = ((i2 & 112) == 32) | av8Var.i(q50Var) | ((i2 & 7168) == 2048);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new tfd(z, function02, q50Var, null);
                av8Var.n0(O2);
            }
            int i4 = i2 >> 3;
            hz8.o(av8Var, valueOf, (Function2) O2);
            long c = r13.c(lz.D(R.color.primary_default, av8Var), ((Number) q50Var.d()).floatValue());
            n7g a2 = o7g.a(12.0f);
            utc utcVar = utc.a;
            xtc o = yso.o(utcVar, 2.0f, c, a2);
            boolean z2 = ghdVar.f;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O3;
            Object[] objArr = new Object[0];
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = jxa.n;
                av8Var.n0(O4);
            }
            xtc f0 = l98.f0(l98.d0(tol.y(o, z2, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O4, av8Var, 48), 16), av8Var, 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(ghdVar.d, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            goa d = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
            u23 a4 = t23.a(ww9.f, uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String a5 = ghdVar.b.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a5, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            r9k r9kVar = ghdVar.c;
            if (r9kVar == null) {
                av8Var.d0(-984807472);
                av8Var.s(false);
            } else {
                bf3.r(2.0f, -984807471, av8Var, av8Var, utcVar);
                udj.c(r9kVar.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(false);
            }
            i.o(av8Var, true, utcVar, 16.0f, av8Var);
            a(ghdVar.e, function0, ghdVar.f, av8Var, i4 & 112, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(ghdVar, z, function0, function02, i, 14);
        }
    }
}
