package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class jzh {
    public static final n7g a = o7g.c(4.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);

    public static final void a(ozh ozhVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1276249561);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(ozhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        int i3 = i & 384;
        utc utcVar = utc.a;
        if (i3 == 0) {
            i2 |= av8Var.g(utcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            dy0.b(n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 48.0f), lz.D(R.color.primary_variant, av8Var), oyn.e), null, yqo.H(-69883325, av8Var, new hl6(10, (Object) ozhVar, (Object) function1)), av8Var, 3072, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(ozhVar, function1, i);
        }
    }

    public static final void b(ozh ozhVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        ozhVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(185944022);
        int i2 = (av8Var.g(ozhVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            a(ozhVar, function1, av8Var, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(ozhVar, function1, xtcVar2, i, 2);
        }
    }

    public static final void c(axj axjVar, int i, r9k r9kVar, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        Object w;
        Object b;
        boolean z2;
        i4k h0;
        int i3;
        boolean z3;
        Object w2;
        boolean z4;
        Object w3;
        boolean z5;
        i4k h02;
        boolean z6;
        nnh w4;
        Function1 e;
        nnh C;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1723096205);
        int i4 = i2 | (av8Var2.g(axjVar) ? 4 : 2) | (av8Var2.e(i) ? 32 : 16) | (av8Var2.g(r9kVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024) | 24576;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            String a2 = r9kVar.a(av8Var2);
            q4k q4kVar = lz.f;
            int i5 = (((i4 & 14) | 384) & 14) | 3072;
            boolean i6 = axjVar.i();
            t01 t01Var = axjVar.a;
            a99 a99Var = nf3.a;
            if (i6) {
                av8Var2.d0(1666827533);
                av8Var2.s(false);
                w = t01Var.w();
            } else {
                av8Var2.d0(1666573488);
                boolean z7 = (((i5 & 14) ^ 6) > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
                w = av8Var2.O();
                if (z7 || w == a99Var) {
                    w4 = bea.w();
                    e = w4 != null ? w4.e() : null;
                    C = bea.C(w4);
                    try {
                        Object w5 = t01Var.w();
                        bea.K(w4, C, e);
                        av8Var2.n0(w5);
                        w = w5;
                    } finally {
                    }
                }
                av8Var2.s(false);
            }
            boolean booleanValue = ((Boolean) w).booleanValue();
            av8Var2.d0(1544283729);
            float f = booleanValue ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            av8Var2.s(false);
            Float valueOf = Float.valueOf(f);
            int i7 = i5 & 14;
            int i8 = i7 ^ 6;
            boolean z8 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
            Object O = av8Var2.O();
            if (z8 || O == a99Var) {
                b = goh.b(new c24(axjVar, 14));
                av8Var2.n0(b);
            } else {
                b = O;
            }
            boolean booleanValue2 = ((Boolean) ((cdi) b).getValue()).booleanValue();
            av8Var2.d0(1544283729);
            float f2 = booleanValue2 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            av8Var2.s(false);
            Float valueOf2 = Float.valueOf(f2);
            boolean z9 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
            Object O2 = av8Var2.O();
            if (z9 || O2 == a99Var) {
                O2 = goh.b(new c24(axjVar, 15));
                av8Var2.n0(O2);
            }
            twj twjVar = (twj) ((cdi) O2).getValue();
            twjVar.getClass();
            av8Var2.d0(-810475626);
            if (((Boolean) twjVar.a()).booleanValue()) {
                h0 = new i4k(120, 60, jg5.a);
                z2 = false;
            } else {
                z2 = false;
                h0 = s02.h0(80, 0, jg5.c, 2);
            }
            av8Var2.s(z2);
            int i9 = i7 | 196608;
            vwj x = yso.x(axjVar, valueOf, valueOf2, h0, q4kVar, av8Var2, i9);
            q4k q4kVar2 = lz.h;
            if (axjVar.i()) {
                i3 = 6;
                z3 = false;
                av8Var2.d0(1666827533);
                av8Var2.s(false);
                w2 = t01Var.w();
            } else {
                av8Var2.d0(1666573488);
                boolean z10 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
                w2 = av8Var2.O();
                if (z10 || w2 == a99Var) {
                    w4 = bea.w();
                    e = w4 != null ? w4.e() : null;
                    C = bea.C(w4);
                    i3 = 6;
                    try {
                        Object w6 = t01Var.w();
                        bea.K(w4, C, e);
                        av8Var2.n0(w6);
                        w2 = w6;
                    } finally {
                    }
                } else {
                    i3 = 6;
                }
                z3 = false;
                av8Var2.s(false);
            }
            boolean booleanValue3 = ((Boolean) w2).booleanValue();
            av8Var2.d0(-667304674);
            float f3 = booleanValue3 ? -4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            av8Var2.s(z3);
            p75 p75Var = new p75(f3);
            boolean z11 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
            Object O3 = av8Var2.O();
            if (z11 || O3 == a99Var) {
                O3 = goh.b(new c24(axjVar, 12));
                av8Var2.n0(O3);
            }
            boolean booleanValue4 = ((Boolean) ((cdi) O3).getValue()).booleanValue();
            av8Var2.d0(-667304674);
            float f4 = booleanValue4 ? -4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            av8Var2.s(false);
            p75 p75Var2 = new p75(f4);
            boolean z12 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
            Object O4 = av8Var2.O();
            if (z12 || O4 == a99Var) {
                O4 = goh.b(new c24(axjVar, 13));
                av8Var2.n0(O4);
            }
            ((twj) ((cdi) O4).getValue()).getClass();
            av8Var2.d0(-1984587765);
            h74 h74Var = jg5.a;
            j38 f5 = f(s02.h0(200, 0, h74Var, 2));
            av8Var2.s(false);
            vwj x2 = yso.x(axjVar, p75Var, p75Var2, f5, q4kVar2, av8Var2, i9);
            if (axjVar.i()) {
                z4 = false;
                av8Var2.d0(1666827533);
                av8Var2.s(false);
                w3 = t01Var.w();
            } else {
                av8Var2.d0(1666573488);
                boolean z13 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
                w3 = av8Var2.O();
                if (z13 || w3 == a99Var) {
                    nnh w7 = bea.w();
                    Function1 e2 = w7 != null ? w7.e() : null;
                    nnh C2 = bea.C(w7);
                    try {
                        Object w8 = t01Var.w();
                        bea.K(w7, C2, e2);
                        av8Var2.n0(w8);
                        w3 = w8;
                    } catch (Throwable th) {
                        bea.K(w7, C2, e2);
                        throw th;
                    }
                }
                z4 = false;
                av8Var2.s(false);
            }
            boolean booleanValue5 = ((Boolean) w3).booleanValue();
            av8Var2.d0(458066172);
            float f6 = booleanValue5 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            av8Var2.s(z4);
            Float valueOf3 = Float.valueOf(f6);
            boolean z14 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
            Object O5 = av8Var2.O();
            if (z14 || O5 == a99Var) {
                O5 = goh.b(new c24(axjVar, 16));
                av8Var2.n0(O5);
            }
            boolean booleanValue6 = ((Boolean) ((cdi) O5).getValue()).booleanValue();
            av8Var2.d0(458066172);
            float f7 = booleanValue6 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            av8Var2.s(false);
            Float valueOf4 = Float.valueOf(f7);
            boolean z15 = (i8 > 4 && av8Var2.g(axjVar)) || (i5 & 6) == 4;
            Object O6 = av8Var2.O();
            if (z15 || O6 == a99Var) {
                O6 = goh.b(new c24(axjVar, 17));
                av8Var2.n0(O6);
            }
            twj twjVar2 = (twj) ((cdi) O6).getValue();
            twjVar2.getClass();
            av8Var2.d0(591654231);
            if (((Boolean) twjVar2.a()).booleanValue()) {
                z5 = false;
                h02 = s02.h0(200, 0, h74Var, 2);
            } else {
                z5 = false;
                h02 = s02.h0(100, 0, jg5.c, 2);
            }
            j38 f8 = f(h02);
            av8Var2.s(z5);
            vwj x3 = yso.x(axjVar, valueOf3, valueOf4, f8, q4kVar, av8Var2, i9);
            g28 g28Var = bkh.c;
            k1c c = e12.c(uxf.g, z5);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf5 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf5, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C3, f50Var3);
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.t(utcVar, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
            u23 a3 = t23.a(kg0Var, kv1Var, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C4, f50Var3);
            ImageVector N = s6a.N(i, (i4 & 112) | 6, av8Var2);
            xtc O7 = rd0.O(bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((p75) x2.getValue()).a, 1);
            long D = lz.D(R.color.on_color_primary, av8Var2);
            xtcVar2 = utcVar;
            kq9.b(N, a2, O7, D, av8Var2, 0, 0);
            xtc f02 = l98.f0(wnn.B(bkh.t(xtcVar2, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean g = av8Var2.g(x);
            Object O8 = av8Var2.O();
            if (g || O8 == a99Var) {
                O8 = new cl1(x, 14);
                av8Var2.n0(O8);
            }
            xtc M = s02.M(f02, (Function1) O8);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C5 = fqj.C(av8Var2, M);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C5, f50Var3);
            yf8 yf8Var = xth.a;
            dfj k = xth.k();
            long D2 = lz.D(R.color.on_color_primary, av8Var2);
            xtc t = bkh.t(xtcVar2, 3);
            boolean g2 = av8Var2.g(x3);
            Object O9 = av8Var2.O();
            if (g2 || O9 == a99Var) {
                z6 = false;
                O9 = new izh(x3, 0);
                av8Var2.n0(O9);
            } else {
                z6 = false;
            }
            q5a.w(a2, s9a.A(t, (ct8) O9), D2, null, 0L, 0L, new p7j(3), 0L, 2, false, 1, 0, k, av8Var2, 0, 24960, 109560);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
            if (z) {
                av8Var.d0(-2129437992);
                kq9.b(s6a.N(R.drawable.ic_beta_flag_profile, i3, av8Var), null, haa.v(bkh.l(n12.a.a(xtcVar2, mv1Var), 28.0f), ((Resources) av8Var.k(nz.c)).getInteger(R.integer.rotation_90_rtl)), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                av8Var.s(z6);
            } else {
                av8Var.d0(-2129035333);
                av8Var.s(z6);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(axjVar, i, r9kVar, z, xtcVar2, i2);
        }
    }

    public static final void d(hzh hzhVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        long j;
        Object w;
        long j2;
        long j3;
        xtc z;
        jf9 jf9Var = oyn.e;
        boolean z2 = hzhVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2116328444);
        int i2 = i | (av8Var.g(hzhVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            axj L = yso.L(Boolean.valueOf(z2), "selectionTransition", av8Var, 48, 0);
            t01 t01Var = L.a;
            boolean booleanValue = ((Boolean) ((eoh) L.d).getValue()).booleanValue();
            av8Var.d0(-1870467911);
            if (booleanValue) {
                j = ljg.f(av8Var, 2071635724, R.color.darken_overlay_1, av8Var, false);
            } else {
                av8Var.d0(2071636708);
                av8Var.s(false);
                j = r13.h;
            }
            av8Var.s(false);
            j23 f = r13.f(j);
            boolean g = av8Var.g(f);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                q4k q4kVar = new q4k(ry.H, new oo(f, 9));
                av8Var.n0(q4kVar);
                O = q4kVar;
            }
            q4k q4kVar2 = (q4k) O;
            if (L.i()) {
                av8Var.d0(1666827533);
                av8Var.s(false);
                w = t01Var.w();
            } else {
                av8Var.d0(1666573488);
                boolean g2 = av8Var.g(L);
                w = av8Var.O();
                if (g2 || w == a99Var) {
                    nnh w2 = bea.w();
                    Function1 e = w2 != null ? w2.e() : null;
                    nnh C = bea.C(w2);
                    try {
                        Object w3 = t01Var.w();
                        bea.K(w2, C, e);
                        av8Var.n0(w3);
                        w = w3;
                    } catch (Throwable th) {
                        bea.K(w2, C, e);
                        throw th;
                    }
                }
                av8Var.s(false);
            }
            boolean booleanValue2 = ((Boolean) w).booleanValue();
            av8Var.d0(-1870467911);
            if (booleanValue2) {
                j2 = ljg.f(av8Var, 2071635724, R.color.darken_overlay_1, av8Var, false);
            } else {
                av8Var.d0(2071636708);
                av8Var.s(false);
                j2 = r13.h;
            }
            r13 e2 = vxd.e(av8Var, false, j2);
            boolean g3 = av8Var.g(L);
            Object O2 = av8Var.O();
            if (g3 || O2 == a99Var) {
                O2 = goh.b(new c24(L, 18));
                av8Var.n0(O2);
            }
            boolean booleanValue3 = ((Boolean) ((cdi) O2).getValue()).booleanValue();
            av8Var.d0(-1870467911);
            if (booleanValue3) {
                j3 = ljg.f(av8Var, 2071635724, R.color.darken_overlay_1, av8Var, false);
            } else {
                av8Var.d0(2071636708);
                av8Var.s(false);
                j3 = r13.h;
            }
            r13 e3 = vxd.e(av8Var, false, j3);
            boolean g4 = av8Var.g(L);
            Object O3 = av8Var.O();
            if (g4 || O3 == a99Var) {
                O3 = goh.b(new c24(L, 19));
                av8Var.n0(O3);
            }
            ((twj) ((cdi) O3).getValue()).getClass();
            av8Var.d0(-305502259);
            i4k h0 = s02.h0(200, 0, null, 6);
            av8Var.s(false);
            vwj x = yso.x(L, e2, e3, h0, q4kVar2, av8Var, 196608);
            utc utcVar = utc.a;
            if (z2) {
                av8Var.d0(-264304021);
                xtc q = n9e.q(wnn.A(utcVar, a), ((r13) x.getValue()).a, jf9Var);
                av8Var.s(false);
                z = xtcVar.z(q);
            } else {
                av8Var.d0(1446974346);
                xtc q2 = n9e.q(utcVar, ((r13) x.getValue()).a, jf9Var);
                av8Var.s(false);
                z = xtcVar.z(q2);
            }
            xtc xtcVar2 = z;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O4;
            Object[] objArr = new Object[0];
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = nuh.c;
                av8Var.n0(O5);
            }
            xtc y = tol.y(xtcVar2, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O5, av8Var, 48), 11), av8Var, 0);
            av8Var = av8Var;
            k1c c = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            int i3 = hzhVar.d;
            r9k r9kVar = hzhVar.c;
            if (r9kVar == null) {
                r9kVar = new m9k("");
            }
            c(L, i3, r9kVar, Intrinsics.c(hzhVar.a, mzh.a), null, av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(hzhVar, function0, xtcVar, i, 3);
        }
    }

    public static final void e(zqb zqbVar, Function1 function1, of3 of3Var, int i) {
        zqbVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1733872279);
        int i2 = (av8Var.i(zqbVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            b((ozh) rfo.x(zqbVar.q, av8Var, 0).getValue(), function1, null, av8Var, i2 & 112);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(zqbVar, function1, i, 8);
        }
    }

    public static final j38 f(i4k i4kVar) {
        return ((Boolean) y05.c.getValue()).booleanValue() ? s02.d0() : i4kVar;
    }
}
