package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class oj4 {
    public static final t3e a = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 12.0f, 3);
    public static final float b;

    static {
        l98.C(24.0f, 16.0f, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
        l98.C(24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 12.0f, 2);
        b = 16.0f;
    }

    public static final void a(final xtc xtcVar, final Function2 function2, final Function2 function22, final Function2 function23, final ci4 ci4Var, final dfj dfjVar, final float f, final tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        Function2 function24;
        Function2 function25;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1539132883);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function24 = function22;
            i2 |= av8Var2.i(function24) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function24 = function22;
        }
        if ((i & 3072) == 0) {
            function25 = function23;
            i2 |= av8Var2.i(function25) ? a.o : 1024;
        } else {
            function25 = function23;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(ci4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var2.g(dfjVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var2.d(f) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var2.i(tc3Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (av8Var2.T(i3 & 1, (i3 & 4793491) != 4793490)) {
            xtc o = bkh.o(xtcVar, pj4.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            Object O = av8Var2.O();
            if (O == nf3.a) {
                O = new q73(26);
                av8Var2.n0(O);
            }
            xtc q = n9e.q(o3h.a(o, false, (Function1) O), ci4Var.a, oyn.e);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int G = z8e.G(av8Var2);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var2, G, f50Var);
            }
            waa.K(av8Var2, C, hf3.d);
            d(function2, ci4Var.b, ci4Var.c, f, yqo.H(-1658370654, av8Var2, new wi4(function24, function25, function2, ci4Var, dfjVar, 0)), av8Var2, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            av8Var = av8Var2;
            fc6.v((i3 >> 21) & 14, tc3Var, av8Var, true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: si4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oj4.a(xtc.this, function2, function22, function23, ci4Var, dfjVar, f, tc3Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(qj4 qj4Var, xtc xtcVar, gi4 gi4Var, ci4 ci4Var, Function2 function2, Function2 function22, boolean z, ce8 ce8Var, of3 of3Var, int i) {
        xtc xtcVar2;
        gi4 gi4Var2;
        av8 av8Var;
        ce8 ce8Var2;
        gi4 gi4Var3;
        int i2;
        ce8 ce8Var3;
        xtc xtcVar3;
        tc3 tc3Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1105472031);
        int i3 = i | (av8Var2.g(qj4Var) ? 4 : 2) | 176 | (av8Var2.g(ci4Var) ? a.o : 1024) | 12582912;
        if (av8Var2.T(i3 & 1, (4793491 & i3) != 4793490)) {
            av8Var2.Y();
            int i4 = i & 1;
            a99 a99Var = nf3.a;
            if (i4 == 0 || av8Var2.B()) {
                Object O = av8Var2.O();
                if (O == a99Var) {
                    IntRange intRange = fi4.a;
                    O = new gi4();
                    av8Var2.n0(O);
                }
                gi4Var3 = (gi4) O;
                i2 = i3 & (-897);
                Object O2 = av8Var2.O();
                if (O2 == a99Var) {
                    O2 = new ce8();
                    av8Var2.n0(O2);
                }
                ce8Var3 = (ce8) O2;
                xtcVar3 = utc.a;
            } else {
                av8Var2.W();
                i2 = i3 & (-897);
                xtcVar3 = xtcVar;
                gi4Var3 = gi4Var;
                ce8Var3 = ce8Var;
            }
            int i5 = i2;
            av8Var2.t();
            boolean g = av8Var2.g(qj4Var.b);
            Object O3 = av8Var2.O();
            if (g || O3 == a99Var) {
                O3 = qj4Var.c;
                av8Var2.n0(O3);
            }
            kg2 kg2Var = (kg2) O3;
            int i6 = 3;
            if (z) {
                av8Var2.d0(-690551113);
                tc3Var = yqo.H(-1483431603, av8Var2, new kp1(i6, qj4Var, ci4Var));
                av8Var2.s(false);
            } else {
                av8Var2.d0(-690163489);
                av8Var2.s(false);
                tc3Var = null;
            }
            ce8 ce8Var4 = ce8Var3;
            gi4 gi4Var4 = gi4Var3;
            xtc xtcVar4 = xtcVar3;
            a(xtcVar4, function2, function22, tc3Var, ci4Var, d7k.a(pj4.o, av8Var2), pj4.m, yqo.H(-1346903698, av8Var2, new wi4(qj4Var, kg2Var, gi4Var4, ci4Var, ce8Var4, 1)), av8Var2, 14156214 | (57344 & (i5 << 3)));
            xtcVar2 = xtcVar4;
            av8Var = av8Var2;
            gi4Var2 = gi4Var4;
            ce8Var2 = ce8Var4;
        } else {
            av8Var2.W();
            xtcVar2 = xtcVar;
            gi4Var2 = gi4Var;
            av8Var = av8Var2;
            ce8Var2 = ce8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hi4(qj4Var, xtcVar2, gi4Var2, ci4Var, function2, function22, z, ce8Var2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0160, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12.O(), java.lang.Integer.valueOf(r7)) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Long l, long j, Function1 function1, Function1 function12, kg2 kg2Var, IntRange intRange, gi4 gi4Var, di4 di4Var, ci4 ci4Var, of3 of3Var, int i) {
        zg3 zg3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-434467002);
        int i2 = i | (av8Var.g(l) ? 4 : 2) | (av8Var.f(j) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function12) ? a.o : 1024) | (av8Var.i(kg2Var) ? 16384 : 8192) | (av8Var.i(intRange) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(gi4Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(di4Var) ? 8388608 : 4194304) | (av8Var.g(ci4Var) ? 67108864 : 33554432);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            lg2 b2 = kg2Var.b(j);
            int i4 = (((b2.a - intRange.a) * 12) + b2.b) - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            final ksa a2 = msa.a(i4, 0, av8Var, 0, 2);
            Integer valueOf = Integer.valueOf(i4);
            boolean g = av8Var.g(a2) | av8Var.e(i4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (g || O == a99Var) {
                O = new wo(a2, i4, rq3Var, i3);
                av8Var.n0(O);
            }
            hz8.o(av8Var, valueOf, (Function2) O);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = hz8.G(g.a, av8Var);
                av8Var.n0(O2);
            }
            final ku3 ku3Var = (ku3) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new wc4(3);
                av8Var.n0(O3);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O3, av8Var, 48);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var.S) {
                zg3Var = zg3Var2;
            } else {
                zg3Var = zg3Var2;
            }
            mz1.t(G, av8Var, G, f50Var2);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d0 = l98.d0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean d = a2.d();
            boolean c = a2.c();
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            Locale locale = kg2Var.a;
            gi4Var.getClass();
            String C2 = yqo.C(j, "yMMMM", locale, gi4Var.a);
            if (C2 == null) {
                C2 = "-";
            }
            String str = C2;
            boolean i5 = av8Var.i(ku3Var) | av8Var.g(a2);
            Object O4 = av8Var.O();
            if (i5 || O4 == a99Var) {
                final int i6 = 0;
                O4 = new Function0() { // from class: ii4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i6;
                        rq3 rq3Var2 = null;
                        ksa ksaVar = a2;
                        ku3 ku3Var2 = ku3Var;
                        int i8 = 3;
                        switch (i7) {
                            case 0:
                                xw3.L(ku3Var2, null, null, new ck1(2, rq3Var2, ksaVar), 3);
                                break;
                            default:
                                xw3.L(ku3Var2, null, null, new ck1(i8, rq3Var2, ksaVar), 3);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O4);
            }
            Function0 function0 = (Function0) O4;
            boolean i7 = av8Var.i(ku3Var) | av8Var.g(a2);
            Object O5 = av8Var.O();
            if (i7 || O5 == a99Var) {
                final int i8 = 1;
                O5 = new Function0() { // from class: ii4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i8;
                        rq3 rq3Var2 = null;
                        ksa ksaVar = a2;
                        ku3 ku3Var2 = ku3Var;
                        int i82 = 3;
                        switch (i72) {
                            case 0:
                                xw3.L(ku3Var2, null, null, new ck1(2, rq3Var2, ksaVar), 3);
                                break;
                            default:
                                xw3.L(ku3Var2, null, null, new ck1(i82, rq3Var2, ksaVar), 3);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O5);
            }
            Function0 function02 = (Function0) O5;
            boolean g2 = av8Var.g(e1dVar);
            Object O6 = av8Var.O();
            if (g2 || O6 == a99Var) {
                O6 = new v30(14, e1dVar);
                av8Var.n0(O6);
            }
            int i9 = i2 & 234881024;
            zg3 zg3Var3 = zg3Var;
            j(d0, d, c, booleanValue, str, function0, function02, (Function0) O6, ci4Var, av8Var, i9 | 6);
            av8Var = av8Var;
            k1c c2 = e12.c(uxf.c, false);
            int G2 = z8e.G(av8Var);
            aee m2 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var, G2, f50Var2);
            }
            waa.K(av8Var, C3, f50Var3);
            xtc d02 = l98.d0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int G3 = z8e.G(av8Var);
            aee m3 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G3))) {
                mz1.t(G3, av8Var, G3, f50Var2);
            }
            waa.K(av8Var, C4, f50Var3);
            l(ci4Var, kg2Var, av8Var, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
            g(a2, l, function1, function12, kg2Var, intRange, gi4Var, di4Var, ci4Var, av8Var, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | i9);
            av8Var.s(true);
            bwc bwcVar = bwc.c;
            g0i I = ufa.I(bwcVar, av8Var);
            g0i I2 = ufa.I(bwc.d, av8Var);
            g0i I3 = ufa.I(bwcVar, av8Var);
            fz8.e(((Boolean) e1dVar.getValue()).booleanValue(), wnn.B(utcVar), uo5.d(I3, null, 14).a(new zo5(new bxj(new zm6(0.6f, I), (alh) null, (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))), uo5.l(I3, null, 14).a(uo5.f(I2, 2)), null, yqo.H(1193716082, av8Var, new yi4(j, e1dVar, ku3Var, a2, intRange, b2, di4Var, kg2Var, ci4Var)), av8Var, 196656, 16);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ji4(l, j, function1, function12, kg2Var, intRange, gi4Var, di4Var, ci4Var, i);
        }
    }

    public static final void d(final Function2 function2, final long j, final long j2, final float f, final tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2020490761);
        int i3 = i & 6;
        utc utcVar = utc.a;
        if (i3 == 0) {
            i2 = (av8Var.g(utcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.f(j2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.i(tc3Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            xtc z2 = bkh.d(utcVar, 1.0f).z(function2 != null ? bkh.b(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1) : utcVar);
            u23 a2 = t23.a(ww9.h, uxf.o, av8Var, 6);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, z2);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            if (function2 != null) {
                av8Var.d0(396894187);
                z = true;
                w1a.f(j, d7k.a(pj4.q, av8Var), yqo.H(1344395458, av8Var, new vi4(1 == true ? 1 : 0, function2)), av8Var, ((i2 >> 6) & 14) | 384);
                av8Var.s(false);
            } else {
                z = true;
                av8Var.d0(397163267);
                av8Var.s(false);
            }
            tol.b(lo3.a.a(new r13(j2)), tc3Var, av8Var, ((i2 >> 12) & 112) | 8);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: ti4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oj4.d(Function2.this, j, j2, f, tc3Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, final Function0 function0, final boolean z2, final boolean z3, final boolean z4, final String str2, final ci4 ci4Var, of3 of3Var, final int i) {
        int i2;
        cdi g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-945355136);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        utc utcVar = utc.a;
        if (i3 == 0) {
            i2 |= av8Var.g(utcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function0) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.h(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= av8Var.g(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= av8Var.g(ci4Var) ? 536870912 : 268435456;
        }
        if (av8Var.T(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z5 = (234881024 & i2) == 67108864;
            Object O = av8Var.O();
            if (z5 || O == nf3.a) {
                O = new jp1(str2, 4);
                av8Var.n0(O);
            }
            xtc a2 = o3h.a(utcVar, true, (Function1) O);
            uah b2 = ech.b(pj4.d, av8Var);
            int i4 = i2 >> 6;
            long j = z ? z3 ? ci4Var.r : ci4Var.s : r13.h;
            if (z2) {
                av8Var.d0(-1319856736);
                g = wih.a(j, ufa.I(bwc.c, av8Var), null, av8Var, 0, 12);
                av8Var.s(false);
            } else {
                av8Var.d0(-1319630064);
                g = e.g(new r13(j), av8Var);
                av8Var.s(false);
            }
            uni.b(z, function0, a2, z3, b2, ((r13) g.getValue()).a, (!z4 || z) ? null : fcp.H(ci4Var.u, pj4.j), yqo.H(1126347158, av8Var, new zi4(str, ci4Var, z4, z, z3)), av8Var, i4 & 7294);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: qi4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oj4.e(str, z, function0, z2, z3, z4, str2, ci4Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(xtc xtcVar, int i, Function1 function1, ci4 ci4Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1461252485);
        int i3 = (av8Var.e(i) ? 32 : 16) | i2 | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(ci4Var) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            tol.b(lo3.a.a(new r13(ci4Var.c)), yqo.H(-1734512197, av8Var, new aj4(i, function1, xtcVar)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(function1, xtcVar, ci4Var, i, i2, 15);
        }
    }

    public static final void g(ksa ksaVar, Long l, Function1 function1, Function1 function12, kg2 kg2Var, IntRange intRange, gi4 gi4Var, di4 di4Var, ci4 ci4Var, of3 of3Var, int i) {
        Object u1Var;
        ksa ksaVar2 = ksaVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1994757941);
        int i2 = i | (av8Var.g(ksaVar2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= av8Var.g(l) ? 32 : 16;
        }
        int i3 = i2 | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function12) ? a.o : 1024) | (av8Var.i(kg2Var) ? 16384 : 8192) | (av8Var.i(intRange) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(gi4Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(di4Var) ? 8388608 : 4194304) | (av8Var.g(ci4Var) ? 67108864 : 33554432);
        if (av8Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            eg2 d = kg2Var.d();
            boolean g = av8Var.g(intRange);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = kg2Var.c(LocalDate.of(intRange.a, 1, 1));
                av8Var.n0(O);
            }
            udj.a(d7k.a(pj4.f, av8Var), yqo.H(1504086906, av8Var, new ej4(ksaVar2, intRange, kg2Var, (lg2) O, function1, d, l, gi4Var, di4Var, ci4Var)), av8Var, 48);
            boolean i4 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | av8Var.i(kg2Var) | av8Var.i(intRange);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                ksaVar2 = ksaVar;
                u1Var = new u1(ksaVar2, function12, kg2Var, intRange, null, 15);
                av8Var.n0(u1Var);
            } else {
                u1Var = O2;
                ksaVar2 = ksaVar;
            }
            hz8.o(av8Var, ksaVar2, (Function2) u1Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qc3(ksaVar2, l, function1, function12, kg2Var, intRange, gi4Var, di4Var, ci4Var, i);
        }
    }

    public static final void h(int i, int i2, of3 of3Var, xtc xtcVar, ImageVector imageVector, String str, Function0 function0, boolean z) {
        int i3;
        boolean z2;
        int i4;
        xtc xtcVar2;
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-368059805);
        int i5 = (av8Var.i(function0) ? 4 : 2) | i | (av8Var.g(imageVector) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (av8Var.g(xtcVar) ? a.o : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (av8Var.h(z2) ? 16384 : 8192);
        }
        int i8 = 0;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            xtc xtcVar3 = i6 != 0 ? utc.a : xtcVar;
            boolean z4 = i7 == 0 ? z2 : true;
            vkj.b(rkj.a(av8Var), yqo.H(-456272562, av8Var, new fj4(str, i8)), vkj.c(av8Var), null, false, yqo.H(-1124908186, av8Var, new gj4(function0, xtcVar3, z4, imageVector, str)), av8Var, 100663344);
            xtcVar2 = xtcVar3;
            z3 = z4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            z3 = z2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(function0, imageVector, str, xtcVar2, z3, i, i2);
        }
    }

    public static final void i(final lg2 lg2Var, final Function1 function1, final long j, final Long l, final gi4 gi4Var, final di4 di4Var, final ci4 ci4Var, final Locale locale, of3 of3Var, final int i) {
        int i2;
        int i3;
        int i4;
        utc utcVar;
        utc utcVar2;
        boolean z;
        utc utcVar3;
        boolean z2;
        int i5;
        boolean z3;
        lg2 lg2Var2 = lg2Var;
        gi4 gi4Var2 = gi4Var;
        kg0 kg0Var = ww9.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-333300603);
        ci4 ci4Var2 = ci4Var;
        int i6 = i | (av8Var.g(lg2Var2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(l) ? a.o : 1024) | (av8Var.g(gi4Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(di4Var) ? 8388608 : 4194304) | (av8Var.g(ci4Var2) ? 67108864 : 33554432) | (av8Var.i(locale) ? 536870912 : 268435456);
        if (av8Var.T(i6 & 1, (306783379 & i6) != 306783378)) {
            av8Var.d0(606771165);
            av8Var.s(false);
            utc utcVar4 = utc.a;
            xtc z4 = bkh.h(utcVar4, 288.0f).z(utcVar4);
            u23 a2 = t23.a(kg0Var, uxf.o, av8Var, 6);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, z4);
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
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-680088486);
            int i7 = 0;
            int i8 = 0;
            int i9 = 6;
            while (i8 < i9) {
                xtc d = bkh.d(utcVar4, 1.0f);
                l8g a3 = k8g.a(kg0Var, uxf.m, av8Var, 54);
                int G2 = z8e.G(av8Var);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d);
                if3.k7.getClass();
                kg0 kg0Var2 = kg0Var;
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                int i10 = i7;
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                f50 f50Var2 = hf3.j;
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                    mz1.t(G2, av8Var, G2, f50Var2);
                }
                waa.K(av8Var, C2, hf3.d);
                av8Var.d0(1542622325);
                int i11 = i10;
                int i12 = 0;
                while (i12 < 7) {
                    int i13 = lg2Var2.d;
                    if (i11 < i13 || i11 >= i13 + lg2Var2.c) {
                        i2 = i12;
                        i3 = i11;
                        i4 = i8;
                        utc utcVar5 = utcVar4;
                        av8Var.d0(576825328);
                        xtc o = bkh.o(utcVar5, pj4.e, pj4.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        utcVar = utcVar5;
                        ff5 ff5Var = l7a.c;
                        nq8.h(av8Var, bkh.m(o, ((p75) av8Var.k(ff5Var)).a, ((p75) av8Var.k(ff5Var)).a));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(577914947);
                        int i14 = i11 - lg2Var2.d;
                        i2 = i12;
                        long j2 = (i14 * 86400000) + lg2Var2.e;
                        if (j2 == j) {
                            utcVar2 = utcVar4;
                            z = true;
                        } else {
                            utcVar2 = utcVar4;
                            z = false;
                        }
                        if (l != null && j2 == l.longValue()) {
                            utcVar3 = utcVar2;
                            z2 = true;
                        } else {
                            utcVar3 = utcVar2;
                            z2 = false;
                        }
                        av8Var.d0(578890300);
                        av8Var.s(false);
                        StringBuilder sb = new StringBuilder();
                        i3 = i11;
                        av8Var.d0(974838827);
                        av8Var.s(false);
                        if (z) {
                            i4 = i8;
                            av8Var.d0(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(cga.B(R.string.m3c_date_picker_today_description, av8Var));
                            av8Var.s(false);
                            i5 = i14;
                        } else {
                            i4 = i8;
                            i5 = i14;
                            av8Var.d0(975029291);
                            av8Var.s(false);
                        }
                        String str = null;
                        String sb2 = sb.length() == 0 ? null : sb.toString();
                        Long valueOf = Long.valueOf(j2);
                        gi4Var2.getClass();
                        if (valueOf == null) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                            str = yqo.C(valueOf.longValue(), "yMMMMEEEEd", locale, gi4Var2.a);
                        }
                        if (str == null) {
                            str = "";
                        }
                        String a4 = ig2.a(i5 + 1, locale);
                        boolean f = ((i6 & 112) == 32) | av8Var.f(j2);
                        Object O = av8Var.O();
                        a99 a99Var = nf3.a;
                        if (f || O == a99Var) {
                            O = new oi4(0, j2, function1);
                            av8Var.n0(O);
                        }
                        Function0 function0 = (Function0) O;
                        boolean f2 = av8Var.f(j2) | ((29360128 & i6) == 8388608);
                        Object O2 = av8Var.O();
                        if (f2 || O2 == a99Var) {
                            di4Var.getClass();
                            O2 = Boolean.TRUE;
                            av8Var.n0(O2);
                        }
                        boolean booleanValue = ((Boolean) O2).booleanValue();
                        if (sb2 != null) {
                            str = lnb.o(sb2, ", ", str);
                        }
                        e(a4, z3, function0, z3, booleanValue, z, str, ci4Var2, av8Var, ((i6 << 3) & 1879048192) | 48);
                        av8Var.s(false);
                        utcVar = utcVar3;
                    }
                    i11 = i3 + 1;
                    lg2Var2 = lg2Var;
                    gi4Var2 = gi4Var;
                    ci4Var2 = ci4Var;
                    i12 = i2 + 1;
                    utcVar4 = utcVar;
                    i8 = i4;
                }
                av8Var.s(false);
                av8Var.s(true);
                lg2Var2 = lg2Var;
                ci4Var2 = ci4Var;
                i8++;
                i9 = 6;
                kg0Var = kg0Var2;
                i7 = i11;
                gi4Var2 = gi4Var;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(function1, j, l, gi4Var, di4Var, ci4Var, locale, i) { // from class: pi4
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Long d;
                public final /* synthetic */ gi4 e;
                public final /* synthetic */ di4 f;
                public final /* synthetic */ ci4 g;
                public final /* synthetic */ Locale h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(221185);
                    oj4.i(lg2.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(xtc xtcVar, boolean z, boolean z2, boolean z3, String str, Function0 function0, Function0 function02, Function0 function03, ci4 ci4Var, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-773929258);
        int i2 = i | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z3) ? a.o : 1024) | (av8Var.g(str) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.i(function03) ? 8388608 : 4194304) | (av8Var.g(ci4Var) ? 67108864 : 33554432);
        if (av8Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            xtcVar2 = xtcVar;
            xtc h = bkh.h(bkh.d(xtcVar2, 1.0f), 56.0f);
            l8g a2 = k8g.a(z3 ? ww9.b : ww9.h, uxf.m, av8Var, 48);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
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
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            o(function03, z3, null, yqo.H(619076006, av8Var, new kp1(5, str, ci4Var)), av8Var, ((i2 >> 6) & 112) | ((i2 >> 21) & 14) | 3072);
            if (z3) {
                av8Var.d0(282432080);
                av8Var.s(false);
            } else {
                av8Var.d0(281624840);
                tol.b(lo3.a.a(new r13(ci4Var.f)), yqo.H(-128317193, av8Var, new hj4(function02, z2, function0, z)), av8Var, 56);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new li4(xtcVar2, z, z2, z3, str, function0, function02, function03, ci4Var, i);
        }
    }

    public static final void k(final Long l, final long j, final int i, final Function1 function1, final Function1 function12, final kg2 kg2Var, final IntRange intRange, final gi4 gi4Var, final di4 di4Var, final ci4 ci4Var, final ce8 ce8Var, of3 of3Var, final int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2053685029);
        int i3 = i2 | (av8Var.g(l) ? 4 : 2) | (av8Var.f(j) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024) | (av8Var.i(function12) ? 16384 : 8192) | (av8Var.i(kg2Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(intRange) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(gi4Var) ? 8388608 : 4194304) | (av8Var.g(di4Var) ? 67108864 : 33554432) | (av8Var.g(ci4Var) ? 536870912 : 268435456);
        if (av8Var.T(i3 & 1, ((i3 & 306783379) == 306783378 && ((av8Var.g(ce8Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = -((kx4) av8Var.k(dh3.h)).e0(48.0f);
            g0i I = ufa.I(bwc.c, av8Var);
            g0i I2 = ufa.I(bwc.d, av8Var);
            bwc bwcVar = bwc.a;
            g0i I3 = ufa.I(bwcVar, av8Var);
            g0i I4 = ufa.I(bwcVar, av8Var);
            f55 f55Var = new f55(i);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new q73(27);
                av8Var.n0(O);
            }
            xtc a2 = o3h.a(utc.a, false, (Function1) O);
            boolean i5 = av8Var.i(I3) | av8Var.i(I) | av8Var.i(I2) | av8Var.e(i4) | av8Var.i(I4);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new xi(I3, I, I2, i4, I4);
                av8Var.n0(O2);
            }
            l98.b(f55Var, a2, (Function1) O2, null, "DatePickerDisplayModeAnimation", null, yqo.H(1838500091, av8Var, new ij4(l, j, function1, function12, kg2Var, intRange, gi4Var, di4Var, ci4Var, ce8Var)), av8Var, ((i3 >> 6) & 14) | 1597440, 40);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(l, j, i, function1, function12, kg2Var, intRange, gi4Var, di4Var, ci4Var, ce8Var, i2) { // from class: ui4
                public final /* synthetic */ Long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ kg2 f;
                public final /* synthetic */ IntRange g;
                public final /* synthetic */ gi4 h;
                public final /* synthetic */ di4 i;
                public final /* synthetic */ ci4 j;
                public final /* synthetic */ ce8 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    oj4.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(ci4 ci4Var, kg2 kg2Var, of3 of3Var, int i) {
        ci4 ci4Var2 = ci4Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1849465391);
        int i2 = (i & 6) == 0 ? (av8Var.g(ci4Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(kg2Var) ? 32 : 16;
        }
        boolean z = false;
        boolean z2 = true;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            int i3 = kg2Var.c;
            ArrayList arrayList = kg2Var.d;
            ArrayList arrayList2 = new ArrayList();
            int i4 = i3 - 1;
            int size = arrayList.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList2.add(arrayList.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList2.add(arrayList.get(i6));
            }
            dfj a2 = d7k.a(pj4.v, av8Var);
            utc utcVar = utc.a;
            xtc d = bkh.d(bkh.b(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1), 1.0f);
            l8g a3 = k8g.a(ww9.g, uxf.m, av8Var, 54);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(24563235);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Pair pair = (Pair) arrayList2.get(i7);
                boolean g = av8Var.g(pair);
                Object O = av8Var.O();
                if (g || O == nf3.a) {
                    O = new kz3(pair, 5);
                    av8Var.n0(O);
                }
                AtomicInteger atomicInteger = o3h.a;
                xtc o = bkh.o(new ew2((Function1) O), pj4.e, pj4.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                ff5 ff5Var = l7a.c;
                xtc m2 = bkh.m(o, ((p75) av8Var.k(ff5Var)).a, ((p75) av8Var.k(ff5Var)).a);
                k1c c = e12.c(uxf.g, z);
                int G2 = z8e.G(av8Var);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, m2);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                f50 f50Var2 = hf3.j;
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                    mz1.t(G2, av8Var, G2, f50Var2);
                }
                waa.K(av8Var, C2, hf3.d);
                av8 av8Var2 = av8Var;
                boolean z3 = z2;
                udj.c((String) pair.b, bkh.s(utcVar, 3), ci4Var2.d, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, a2, av8Var2, 48, 0, 130040);
                av8Var = av8Var2;
                av8Var.s(z3);
                i7++;
                z = false;
                z2 = z3;
                size2 = size2;
                utcVar = utcVar;
                arrayList2 = arrayList2;
                ci4Var2 = ci4Var;
            }
            av8Var.s(z);
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(ci4Var, kg2Var, i, 18);
        }
    }

    public static final void m(String str, xtc xtcVar, boolean z, boolean z2, Function0 function0, String str2, ci4 ci4Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1153850597);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.h(z) ? 256 : 128) | (av8Var.h(z2) ? 2048 : 1024) | (av8Var.i(function0) ? 16384 : 8192) | (av8Var.h(true) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(str2) ? 1048576 : 524288) | (av8Var.g(ci4Var) ? 8388608 : 4194304);
        if (av8Var.T(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z3 || O == a99Var) {
                O = (!z2 || z) ? null : fcp.H(ci4Var.u, pj4.j);
                av8Var.n0(O);
            }
            qz1 qz1Var = (qz1) O;
            boolean z4 = (3670016 & i2) == 1048576;
            Object O2 = av8Var.O();
            if (z4 || O2 == a99Var) {
                O2 = new jp1(str2, 5);
                av8Var.n0(O2);
            }
            xtc a2 = o3h.a(xtcVar, true, (Function1) O2);
            int i3 = i2 >> 6;
            uni.b(z, function0, a2, true, ech.b(pj4.B, av8Var), ((r13) wih.a(z ? ci4Var.l : r13.h, ufa.I(bwc.c, av8Var), null, av8Var, 0, 12).getValue()).a, qz1Var, yqo.H(-564400443, av8Var, new hj4(str, ci4Var, z2, z)), av8Var, (i3 & 14) | ((i2 >> 9) & 112) | (i3 & 7168));
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ri4(str, xtcVar, z, z2, function0, str2, ci4Var, i);
        }
    }

    public static final void n(final xtc xtcVar, final long j, final Function1 function1, final di4 di4Var, final kg2 kg2Var, final IntRange intRange, final ci4 ci4Var, of3 of3Var, final int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1286899812);
        int i2 = i | (av8Var.f(j) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(di4Var) ? a.o : 1024) | (av8Var.i(kg2Var) ? 16384 : 8192) | (av8Var.i(intRange) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(ci4Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i2 & 1, (599187 & i2) != 599186)) {
            udj.a(d7k.a(pj4.y, av8Var), yqo.H(1301915789, av8Var, new mj4(kg2Var, j, intRange, xtcVar, ci4Var, function1, di4Var)), av8Var, 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(j, function1, di4Var, kg2Var, intRange, ci4Var, i) { // from class: mi4
                public final /* synthetic */ long b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ di4 d;
                public final /* synthetic */ kg2 e;
                public final /* synthetic */ IntRange f;
                public final /* synthetic */ ci4 g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(7);
                    oj4.n(xtc.this, this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(Function0 function0, boolean z, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-709923073);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= av8Var.i(tc3Var) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            n7g n7gVar = o7g.a;
            t3e t3eVar = q72.a;
            long j = ((r13) av8Var.k(lo3.a)).a;
            long j2 = r13.i;
            g23 g23Var = (g23) av8Var.k(i23.a);
            p72 p72Var = g23Var.X;
            if (p72Var == null) {
                long j3 = r13.h;
                p72Var = new p72(j3, i23.c(g23Var, h23.j), j3, r13.c(i23.c(g23Var, a8j.a), a8j.b));
                g23Var.X = p72Var;
            }
            utc utcVar = utc.a;
            iz8.o(function0, utcVar, false, n7gVar, p72Var.a(j2, j, j2, j2), null, yqo.H(1899489890, av8Var, new nj4(tc3Var, z)), av8Var, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73((Object) function0, z, xtcVar2, (dt8) tc3Var, i, 5);
        }
    }
}
