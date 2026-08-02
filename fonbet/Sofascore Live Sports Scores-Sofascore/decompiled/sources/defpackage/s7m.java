package defpackage;

import android.content.res.Configuration;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class s7m {
    public static final void a(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(779418443);
        if (((i | 6) & 3) == 2 && av8Var.D()) {
            av8Var.W();
        } else {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
            xtcVar = utcVar;
            long j = kam.f;
            n7g n7gVar = ((cch) av8Var.k(ech.a)).e;
            akm.a.getClass();
            uni.a(f0, n7gVar, j, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, akm.c, av8Var, 12583296, 120);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(xtcVar, i, 17);
        }
    }

    public static final void b(int i, of3 of3Var, xtc xtcVar, List list, Function1 function1) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(184906183);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            ksa a = msa.a(0, 0, av8Var, 0, 3);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            av8Var.d0(484227164);
            boolean i4 = ((i2 & 896) == 256) | av8Var.i(list);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new bcl(i3, list, function1);
                av8Var.n0(O);
            }
            av8Var.s(false);
            v8a.b(d, a, null, null, null, null, false, (Function1) O, av8Var, 6);
            d(a, n12.a.a(utcVar, uxf.h), av8Var, 0);
            av8Var.s(true);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new c2h(xtcVar, list, function1, i);
        }
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar, Function0 function0) {
        int i2;
        xtc xtcVar2;
        Function0 function02 = function0;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1630149521);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g("Closed Captions") ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function02) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var2);
            }
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            mv1 mv1Var = uxf.g;
            xtc d = bkh.d(utcVar, 1.0f);
            k1c c = e12.c(mv1Var, false);
            int G2 = z8e.G(av8Var);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, f50Var);
            waa.K(av8Var, m2, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var, G2, f50Var2);
            }
            waa.K(av8Var, C2, f50Var3);
            dfj dfjVar = kam.i;
            long j = kam.c;
            n12 n12Var = n12.a;
            xtcVar2 = utcVar;
            udj.b("Closed Captions", l98.d0(n12Var.a(utcVar, mv1Var), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j, 0L, 0L, 0L, 0, false, 0, 0, dfjVar, av8Var, (i3 & 14) | 384, 1572864, 65528);
            xtc f0 = l98.f0(n12Var.a(xtcVar2, uxf.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            akm.a.getClass();
            function02 = function0;
            av8Var = av8Var;
            ao2.h(function02, f0, false, null, akm.d, av8Var, ((i3 >> 3) & 14) | 196608);
            av8Var.s(true);
            av8Var.s(true);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zk1(function02, xtcVar2, i, 4);
        }
    }

    public static final void d(ksa ksaVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1672186789);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(ksaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            av8Var.d0(-2030677766);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            av8Var.s(false);
            Boolean valueOf = Boolean.valueOf(ksaVar.j.b());
            av8Var.d0(-2030674993);
            boolean z = (i2 & 14) == 4;
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new b1m(ksaVar, e1dVar, null);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            hz8.o(av8Var, valueOf, (Function2) O2);
            xtcVar2 = xtcVar;
            fz8.e(((Boolean) e1dVar.getValue()).booleanValue(), xtcVar2, uo5.e(s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1500.0f, null, 5), 2), uo5.f(s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 200.0f, null, 5), 2), null, yqo.H(1758566707, av8Var, new q4m(ksaVar, xtcVar)), av8Var, (i2 & 112) | 200064, 16);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(ksaVar, xtcVar2, i, 28);
        }
    }

    public static final void e(acm acmVar, Function0 function0, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        Function0 function02;
        av8 av8Var2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(581079489);
        if ((i & 6) == 0) {
            i2 = (av8Var3.i(acmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var3.i(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var3.D()) {
            av8Var3.W();
            function02 = function0;
            av8Var2 = av8Var3;
        } else {
            av8Var3.d0(-1302000012);
            utc utcVar = utc.a;
            xtc e = bkh.e(bkh.d(utcVar, 1.0f), 72.0f);
            boolean z = acmVar.a;
            p5g a = n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, kam.e, true);
            av8Var3.d0(1974311982);
            Object O = av8Var3.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var3);
            }
            av8Var3.s(false);
            xtc u = oyn.u(e, (wzc) O, a, z, null, null, function0, 24);
            av8Var3.s(false);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
            int G = z8e.G(av8Var3);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, u);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var3, G, f50Var2);
            }
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            xtc p = bkh.p(utcVar, 48.0f);
            k1c c = e12.c(uxf.c, false);
            int G2 = z8e.G(av8Var3);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, p);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c, f50Var);
            waa.K(av8Var3, m2, ff3Var);
            if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var3, G2, f50Var2);
            }
            waa.K(av8Var3, C2, f50Var3);
            n12 n12Var = n12.a;
            av8Var3.d0(-754313583);
            if (acmVar.b()) {
                av8Var = av8Var3;
                kq9.b(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "Check", n12Var.a(l98.b0(utcVar, 16.0f), uxf.g), kam.c, av8Var, 3120, 0);
            } else {
                av8Var = av8Var3;
            }
            av8Var.s(false);
            av8Var.s(true);
            String str = (String) acmVar.c.getValue();
            dfj dfjVar = acmVar.b() ? kam.k : kam.j;
            av8 av8Var4 = av8Var;
            function02 = function0;
            udj.b(str, null, acmVar.a ? kam.c : kam.d, 0L, 0L, 0L, 0, false, 0, 0, dfjVar, av8Var4, 0, 0, 65530);
            w1l.o(1.0f, true, av8Var4);
            udj.b((String) acmVar.d.getValue(), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), kam.d, 0L, 0L, 0L, 0, false, 0, 0, kam.j, av8Var4, 432, 1572864, 65528);
            av8Var2 = av8Var4;
            av8Var2.s(true);
        }
        eqf u2 = av8Var2.u();
        if (u2 != null) {
            u2.d = new nmi(acmVar, function02, i, 29);
        }
    }

    public static final void f(List list, Function0 function0, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        list.getClass();
        function0.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1911504686);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            Configuration configuration = (Configuration) av8Var2.k(nz.a);
            float f = configuration.screenHeightDp;
            float f2 = configuration.screenWidthDp;
            float f3 = 0.8f * f;
            float f4 = f * (configuration.orientation == 2 ? 1.7777778f : 0.5625f);
            p75 p75Var = new p75(f4);
            p75 p75Var2 = new p75(f2);
            if (p75Var.compareTo(p75Var2) > 0) {
                p75Var = p75Var2;
            }
            long j = kam.b;
            long j2 = kam.a;
            long j3 = r13.d;
            n7g a = o7g.a(16.0f);
            p75 p75Var3 = new p75(f4);
            p75 p75Var4 = new p75(f2);
            if (p75Var3.compareTo(p75Var4) > 0) {
                p75Var3 = p75Var4;
            }
            xtc c0 = l98.c0(ml4.f0(bkh.p(utc.a, p75Var3.a)), 8.0f, 16.0f);
            akm.a.getClass();
            av8Var = av8Var2;
            ctc.b(function0, c0, null, p75Var.a, a, j2, j3, j, akm.b, null, null, yqo.H(53199627, av8Var2, new bxl(f3, function0, list, function1)), av8Var, ((i2 >> 3) & 14) | 907739136);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(list, function0, function1, i, 25);
        }
    }
}
