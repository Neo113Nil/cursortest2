package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class szj {
    public static final void a(final s8g s8gVar, tee teeVar, h4d h4dVar, wla wlaVar, Function1 function1, Function2 function2, of3 of3Var, int i) {
        av8 av8Var;
        boolean z;
        av8 av8Var2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-961041498);
        int i2 = i | (av8Var3.g(s8gVar) ? 4 : 2) | (av8Var3.g(teeVar) ? 32 : 16) | (av8Var3.g(h4dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.g(wlaVar) ? a.o : 1024) | (av8Var3.i(function1) ? 16384 : 8192) | (av8Var3.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var3.T(i2 & 1, (74899 & i2) != 74898)) {
            final Context context = (Context) av8Var3.k(nz.b);
            xtc e = bkh.e(bkh.d(utc.a, 1.0f), 192.0f);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, e);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            uyj uyjVar = s8gVar.a;
            boolean z2 = uyjVar instanceof ryj;
            int i3 = 3;
            a99 a99Var = nf3.a;
            if (z2) {
                av8Var3.d0(493966640);
                int i4 = ((ryj) uyjVar).a;
                AdType.Native r8 = AdType.Native.TrendingGridLarge;
                wg wgVar = (wg) teeVar.get(Integer.valueOf(i4));
                g28 g28Var = bkh.c;
                boolean z3 = ((458752 & i2) == 131072) | ((i2 & 14) == 4);
                Object O = av8Var3.O();
                Object obj = O;
                if (z3 || O == a99Var) {
                    fej fejVar = new fej(2, function2, s8gVar);
                    av8Var3.n0(fejVar);
                    obj = fejVar;
                }
                b4d.a(i4, r8, wgVar, h4dVar, g28Var, true, (Function0) obj, av8Var3, ((i2 << 3) & 7168) | 221232, 0);
                av8 av8Var4 = av8Var3;
                av8Var4.s(false);
                z = true;
                av8Var2 = av8Var4;
            } else {
                z = true;
                z = true;
                final int i5 = 0;
                if (uyjVar instanceof syj) {
                    av8Var3.d0(-1785165236);
                    syj syjVar = (syj) uyjVar;
                    int i6 = i2 & 14;
                    boolean z4 = ((57344 & i2) == 16384) | (i6 == 4);
                    Object O2 = av8Var3.O();
                    Object obj2 = O2;
                    if (z4 || O2 == a99Var) {
                        fej fejVar2 = new fej(i3, function1, s8gVar);
                        av8Var3.n0(fejVar2);
                        obj2 = fejVar2;
                    }
                    Function0 function0 = (Function0) obj2;
                    g28 g28Var2 = bkh.c;
                    boolean i7 = (i6 == 4) | av8Var3.i(context);
                    Object O3 = av8Var3.O();
                    Object obj3 = O3;
                    if (i7 || O3 == a99Var) {
                        Function0 function02 = new Function0() { // from class: pzj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i5;
                                s8g s8gVar2 = s8gVar;
                                Context context2 = context;
                                switch (i8) {
                                    case 0:
                                        syj syjVar2 = (syj) s8gVar2.a;
                                        o0k N = bea.N(syjVar2.a, syjVar2.b);
                                        context2.getClass();
                                        nv.V(context2, "trending_tile_impression", N);
                                        break;
                                    default:
                                        int i9 = ((tyj) s8gVar2.a).a + 1;
                                        context2.getClass();
                                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                                        firebaseBundle.putInt("index", i9);
                                        firebaseBundle.putString("type", "no_fill");
                                        nv.N(context2, firebaseBundle, "trending_tile_impression");
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var3.n0(function02);
                        obj3 = function02;
                    }
                    xzj.b(syjVar, function0, bea.P(g28Var2, wlaVar, (Function0) obj3, av8Var3, 390 | ((i2 >> 6) & 112), 4), av8Var3, 0);
                    av8Var3.s(false);
                    av8Var2 = av8Var3;
                } else {
                    if (!(uyjVar instanceof tyj)) {
                        throw dmi.h(av8Var3, -1785182137, false);
                    }
                    av8Var3.d0(-1785136143);
                    g28 g28Var3 = bkh.c;
                    boolean i8 = av8Var3.i(context) | ((i2 & 14) == 4);
                    Object O4 = av8Var3.O();
                    Object obj4 = O4;
                    if (i8 || O4 == a99Var) {
                        final int i9 = z ? 1 : 0;
                        Function0 function03 = new Function0() { // from class: pzj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i82 = i9;
                                s8g s8gVar2 = s8gVar;
                                Context context2 = context;
                                switch (i82) {
                                    case 0:
                                        syj syjVar2 = (syj) s8gVar2.a;
                                        o0k N = bea.N(syjVar2.a, syjVar2.b);
                                        context2.getClass();
                                        nv.V(context2, "trending_tile_impression", N);
                                        break;
                                    default:
                                        int i92 = ((tyj) s8gVar2.a).a + 1;
                                        context2.getClass();
                                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                                        firebaseBundle.putInt("index", i92);
                                        firebaseBundle.putString("type", "no_fill");
                                        nv.N(context2, firebaseBundle, "trending_tile_impression");
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var3.n0(function03);
                        obj4 = function03;
                    }
                    xzj.e(0, av8Var3, bea.P(g28Var3, wlaVar, (Function0) obj4, av8Var3, 390 | ((i2 >> 6) & 112), 4));
                    av8Var3.s(false);
                    av8Var2 = av8Var3;
                }
            }
            av8Var2.s(z);
            av8Var = av8Var2;
        } else {
            av8Var3.W();
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(s8gVar, teeVar, h4dVar, wlaVar, function1, function2, i, 14);
        }
    }

    public static final void b(yyj yyjVar, tee teeVar, h4d h4dVar, wla wlaVar, Function1 function1, Function2 function2, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1204614521);
        int i2 = 4;
        int i3 = i | (av8Var.g(yyjVar) ? 4 : 2) | (av8Var.g(teeVar) ? 32 : 16) | (av8Var.g(h4dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(wlaVar) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            xtc c = bkh.c(xtcVar, 1.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i4 = i3 & 14;
            boolean z = (i4 == 4) | ((57344 & i3) == 16384);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new fej(i2, yyjVar, function1);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean z2 = ((458752 & i3) == 131072) | (i4 == 4);
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new fej(5, function2, yyjVar);
                av8Var.n0(O2);
            }
            xzj.c(yyjVar, teeVar, h4dVar, wlaVar, function0, (Function0) O2, bkh.c, av8Var, (i3 & 7168) | i4 | 1572864 | (i3 & 112) | (i3 & 896));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new el1(yyjVar, teeVar, h4dVar, wlaVar, function1, function2, xtcVar, i);
        }
    }

    public static final void c(t8g t8gVar, tee teeVar, h4d h4dVar, wla wlaVar, Function1 function1, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1918169082);
        int i2 = i | (av8Var.g(t8gVar) ? 4 : 2) | (av8Var.g(teeVar) ? 32 : 16) | (av8Var.g(h4dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(wlaVar) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc e = bkh.e(bkh.d(utc.a, 1.0f), 192.0f);
            l8g a = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            azj azjVar = t8gVar.a;
            azj azjVar2 = t8gVar.b;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            e(azjVar, azjVar2, function1, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, (i2 >> 6) & 896);
            yyj yyjVar = t8gVar.c;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            b(yyjVar, teeVar, h4dVar, wlaVar, function1, function2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, i2 & 524272);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(t8gVar, teeVar, h4dVar, wlaVar, function1, function2, i, 13);
        }
    }

    public static final void d(u8g u8gVar, tee teeVar, h4d h4dVar, wla wlaVar, Function1 function1, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1888211162);
        int i2 = i | (av8Var.g(u8gVar) ? 4 : 2) | (av8Var.g(teeVar) ? 32 : 16) | (av8Var.g(h4dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(wlaVar) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc e = bkh.e(bkh.d(utc.a, 1.0f), 192.0f);
            l8g a = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yyj yyjVar = u8gVar.a;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            b(yyjVar, teeVar, h4dVar, wlaVar, function1, function2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, i2 & 524272);
            azj azjVar = u8gVar.b;
            azj azjVar2 = u8gVar.c;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            e(azjVar, azjVar2, function1, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, (i2 >> 6) & 896);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(u8gVar, teeVar, h4dVar, wlaVar, function1, function2, i, 12);
        }
    }

    public static final void e(final azj azjVar, final azj azjVar2, final Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-975096998);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(azjVar) : av8Var.i(azjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? av8Var.g(azjVar2) : av8Var.i(azjVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        final int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc c = bkh.c(xtcVar, 1.0f);
            u23 a = t23.a(ng0Var, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i4 = i2 & 896;
            int i5 = i2 & 14;
            boolean z = (i5 == 4 || ((i2 & 8) != 0 && av8Var.i(azjVar))) | (i4 == 256);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new Function0() { // from class: nzj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                function1.invoke(new kzj(azjVar.a));
                                break;
                            default:
                                function1.invoke(new kzj(azjVar.a));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            utc utcVar = utc.a;
            f5p.q(azjVar, (Function0) O, bkh.e(bkh.d(utcVar, 1.0f), 92.0f), av8Var, i5 | 384);
            int i6 = i4 == 256 ? 1 : 0;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && av8Var.i(azjVar2))) {
                i3 = 1;
            }
            int i7 = i6 | i3;
            Object O2 = av8Var.O();
            if (i7 != 0 || O2 == a99Var) {
                final int i8 = 1;
                O2 = new Function0() { // from class: nzj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                function1.invoke(new kzj(azjVar2.a));
                                break;
                            default:
                                function1.invoke(new kzj(azjVar2.a));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            f5p.q(azjVar2, (Function0) O2, bkh.e(bkh.d(utcVar, 1.0f), 92.0f), av8Var, ((i2 >> 3) & 14) | 384);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j(azjVar, azjVar2, function1, xtcVar, i, 3);
        }
    }

    public static final void f(vnb vnbVar, boolean z, tee teeVar, Function1 function1, Function2 function2, of3 of3Var, int i) {
        tee teeVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-581038886);
        int i2 = 16;
        int i3 = i | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 2048 : 1024) | (av8Var.i(function2) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            teeVar2 = teeVar;
            h4d D = d2a.D(teeVar2, av8Var, 6);
            e1d x = rfo.x(D.e, av8Var, 0);
            ksa a = msa.a(0, 0, av8Var, 0, 3);
            u6b u6bVar = (u6b) av8Var.k(mhb.a);
            boolean g = av8Var.g(a);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (g || O == obj) {
                O = new ck1(i2, null, a);
                av8Var.n0(O);
            }
            hz8.o(av8Var, u6bVar, (Function2) O);
            boolean z2 = (i3 & 7168) == 2048;
            Object O2 = av8Var.O();
            if (z2 || O2 == obj) {
                O2 = new b4j(5, function1);
                av8Var.n0(O2);
            }
            ktm.s(vnbVar, (Function0) O2, z, bkh.c, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(372658216, av8Var, new ff7(a, function1, x, D, function2)), av8Var, 100666368 | (i3 & 14) | ((i3 << 3) & 896), 240);
        } else {
            teeVar2 = teeVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(vnbVar, z, teeVar2, function1, function2, i, 19);
        }
    }

    public static final void g(c0k c0kVar, of3 of3Var, int i) {
        av8 av8Var;
        c0kVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1537140307);
        int i2 = 4;
        int i3 = (av8Var2.i(c0kVar) ? 4 : 2) | i;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            e1d x = rfo.x(c0kVar.f, av8Var2, 0);
            e1d x2 = rfo.x(c0kVar.j, av8Var2, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            tee L = l6g.L(new Pair("page", Sports.TRENDING));
            boolean i4 = av8Var2.i(context) | av8Var2.i(c0kVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                O = new mwj(6, context, c0kVar);
                av8Var2.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean i5 = av8Var2.i(c0kVar);
            Object O2 = av8Var2.O();
            if (i5 || O2 == a99Var) {
                p1 p1Var = new p1(2, c0kVar, c0k.class, "onAdFailed", "onAdFailed(ILcom/sofascore/model/newNetwork/TrendingGridTileSize;)V", 0, 16);
                av8Var2.n0(p1Var);
                O2 = p1Var;
            }
            av8Var = av8Var2;
            f(vnbVar, booleanValue, L, function1, (Function2) ((KFunction) O2), av8Var, 384);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(c0kVar, i, i2);
        }
    }

    public static final void h(final v8g v8gVar, final Function1 function1, of3 of3Var, int i) {
        double d;
        float f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(926022060);
        int i2 = (av8Var.g(v8gVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc e = bkh.e(bkh.d(utc.a, 1.0f), 92.0f);
            l8g a = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            azj azjVar = v8gVar.a;
            int i5 = i2 & 112;
            int i6 = i2 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new Function0() { // from class: ozj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i3;
                        v8g v8gVar2 = v8gVar;
                        Function1 function12 = function1;
                        switch (i7) {
                            case 0:
                                function12.invoke(new kzj(v8gVar2.a.a));
                                break;
                            default:
                                function12.invoke(new kzj(v8gVar2.b.a));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                d = 0.0d;
                f = Float.MAX_VALUE;
            } else {
                d = 0.0d;
                f = 1.0f;
            }
            f5p.q(azjVar, function0, bkh.c(new goa(f, true), 1.0f), av8Var, 0);
            azj azjVar2 = v8gVar.b;
            boolean z2 = (i6 == 4) | (i5 == 32);
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new Function0() { // from class: ozj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i4;
                        v8g v8gVar2 = v8gVar;
                        Function1 function12 = function1;
                        switch (i7) {
                            case 0:
                                function12.invoke(new kzj(v8gVar2.a.a));
                                break;
                            default:
                                function12.invoke(new kzj(v8gVar2.b.a));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            Function0 function02 = (Function0) O2;
            if (1.0f <= d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            f5p.q(azjVar2, function02, bkh.c(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(v8gVar, function1, i, 7);
        }
    }
}
