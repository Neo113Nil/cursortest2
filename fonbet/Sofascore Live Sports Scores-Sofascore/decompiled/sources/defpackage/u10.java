package defpackage;

import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class u10 {
    public static final g2f a = new g2f(true);

    /* JADX WARN: Removed duplicated region for block: B:110:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final Function0 function0, xtc xtcVar, long j, qug qugVar, g2f g2fVar, uah uahVar, long j2, float f, final tc3 tc3Var, of3 of3Var, final int i, final int i2) {
        int i3;
        Function0 function02;
        xtc xtcVar2;
        int i4;
        long j3;
        qug qugVar2;
        uah uahVar2;
        int i5;
        char c;
        long j4;
        int i6;
        int i7;
        final long j5;
        final long j6;
        final g2f g2fVar2;
        final xtc xtcVar3;
        final qug qugVar3;
        final uah uahVar3;
        final float f2;
        eqf u;
        long j7;
        qug qugVar4;
        int i8;
        uah uahVar4;
        int i9;
        g2f g2fVar3;
        xtc xtcVar4;
        long j8;
        int i10;
        qug qugVar5;
        float f3;
        uah uahVar5;
        int i11;
        int i12;
        int i13;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1725609375);
        if ((i & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i3 |= av8Var.i(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                j3 = j;
                i3 |= av8Var.f(j3) ? a.o : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        qugVar2 = qugVar;
                        if (av8Var.g(qugVar2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        qugVar2 = qugVar;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    qugVar2 = qugVar;
                }
                int i15 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        uahVar2 = uahVar;
                        if (av8Var.g(uahVar2)) {
                            i12 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i15 |= i12;
                        }
                    } else {
                        uahVar2 = uahVar;
                    }
                    i12 = 524288;
                    i15 |= i12;
                } else {
                    uahVar2 = uahVar;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        i5 = i14;
                        c = ' ';
                        j4 = j2;
                        if (av8Var.f(j4)) {
                            i11 = 8388608;
                            i15 |= i11;
                        }
                    } else {
                        i5 = i14;
                        c = ' ';
                        j4 = j2;
                    }
                    i11 = 4194304;
                    i15 |= i11;
                } else {
                    i5 = i14;
                    c = ' ';
                    j4 = j2;
                }
                i6 = i15 | 905969664;
                i7 = i6 & 306783379;
                int i16 = 0;
                if (av8Var.T(i6 & 1, i7 != 306783378)) {
                    av8Var.Y();
                    if ((i & 1) == 0 || av8Var.B()) {
                        xtc xtcVar5 = i5 != 0 ? utc.a : xtcVar2;
                        if (i4 != 0) {
                            j7 = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << c);
                        } else {
                            j7 = j3;
                        }
                        if ((i2 & 16) != 0) {
                            qugVar4 = hkg.o0(av8Var);
                            i8 = i6 & (-57345);
                        } else {
                            qugVar4 = qugVar2;
                            i8 = i6;
                        }
                        if ((i2 & 64) != 0) {
                            float f4 = wec.a;
                            uahVar4 = ech.b(agc.c, av8Var);
                            i8 &= -3670017;
                        } else {
                            uahVar4 = uahVar2;
                        }
                        if ((i2 & 128) != 0) {
                            float f5 = wec.a;
                            j4 = i23.d(agc.a, av8Var);
                            i9 = (-29360129) & i8;
                        } else {
                            i9 = i8;
                        }
                        float f6 = wec.a;
                        g2fVar3 = a;
                        xtcVar4 = xtcVar5;
                        j8 = j4;
                        i10 = i9;
                        qugVar5 = qugVar4;
                        f3 = f6;
                        uahVar5 = uahVar4;
                        j3 = j7;
                    } else {
                        av8Var.W();
                        i10 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                        }
                        f3 = f;
                        j8 = j4;
                        xtcVar4 = xtcVar2;
                        qugVar5 = qugVar2;
                        uahVar5 = uahVar2;
                        g2fVar3 = g2fVar;
                    }
                    av8Var.t();
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = new h1d(Boolean.FALSE);
                        av8Var.n0(O);
                    }
                    h1d h1dVar = (h1d) O;
                    h1dVar.R(Boolean.valueOf(z));
                    if (((Boolean) ((eoh) h1dVar.c).getValue()).booleanValue() || ((Boolean) ((eoh) h1dVar.d).getValue()).booleanValue()) {
                        av8Var.d0(1165905588);
                        Object O2 = av8Var.O();
                        if (O2 == a99Var) {
                            O2 = e.f(new xvj(xvj.b));
                            av8Var.n0(O2);
                        }
                        e1d e1dVar = (e1d) O2;
                        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                        boolean g = ((i10 & 7168) == 2048) | av8Var.g(kx4Var);
                        Object O3 = av8Var.O();
                        if (g || O3 == a99Var) {
                            O3 = new fd5(j3, kx4Var, new q10(i16, e1dVar));
                            av8Var.n0(O3);
                        }
                        t20.a((fd5) O3, function02, g2fVar3, yqo.H(-917492520, av8Var, new t10(xtcVar4, h1dVar, e1dVar, qugVar5, uahVar5, j8, f3, tc3Var)), av8Var, ((i10 >> 9) & 896) | (i10 & 112) | 3072, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1166965571);
                        av8Var.s(false);
                    }
                    j6 = j3;
                    g2fVar2 = g2fVar3;
                    xtcVar3 = xtcVar4;
                    qugVar3 = qugVar5;
                    uahVar3 = uahVar5;
                    j5 = j8;
                    f2 = f3;
                } else {
                    av8Var.W();
                    long j9 = j3;
                    j5 = j4;
                    j6 = j9;
                    g2fVar2 = g2fVar;
                    xtcVar3 = xtcVar2;
                    qugVar3 = qugVar2;
                    uahVar3 = uahVar2;
                    f2 = f;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: r10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int K = aba.K(i | 1);
                            u10.a(z, function0, xtcVar3, j6, qugVar3, g2fVar2, uahVar3, j5, f2, tc3Var, (of3) obj, K, i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            j3 = j;
            if ((i & 24576) == 0) {
            }
            int i152 = i3 | 196608;
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i6 = i152 | 905969664;
            i7 = i6 & 306783379;
            int i162 = 0;
            if (av8Var.T(i6 & 1, i7 != 306783378)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j3 = j;
        if ((i & 24576) == 0) {
        }
        int i1522 = i3 | 196608;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i6 = i1522 | 905969664;
        i7 = i6 & 306783379;
        int i1622 = 0;
        if (av8Var.T(i6 & 1, i7 != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(tc3 tc3Var, Function0 function0, xtc xtcVar, Function2 function2, boolean z, cfc cfcVar, p3e p3eVar, wzc wzcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        Function2 function22;
        int i4;
        cfc cfcVar2;
        int i5;
        int i6;
        p3e p3eVar2;
        int i7;
        wzc wzcVar2;
        int i8;
        Function2 function23;
        av8 av8Var;
        p3e p3eVar3;
        wzc wzcVar3;
        boolean z2;
        eqf u;
        xtc xtcVar3;
        Function2 function24;
        cfc cfcVar3;
        p3e p3eVar4;
        wzc wzcVar4;
        boolean z3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-532959117);
        int i9 = i | (av8Var2.i(function0) ? 32 : 16);
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 = i9 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i9 | (av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i4 = i3 | 3072;
            function22 = function2;
        } else {
            function22 = function2;
            i4 = i3 | (av8Var2.i(function22) ? a.o : 1024);
        }
        int i12 = i4 | 221184;
        if ((i2 & 64) == 0) {
            cfcVar2 = cfcVar;
            if (av8Var2.g(cfcVar2)) {
                i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                int i13 = i12 | i5;
                i6 = i2 & 128;
                if (i6 == 0) {
                    i13 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    p3eVar2 = p3eVar;
                    i13 |= av8Var2.g(p3eVar2) ? 8388608 : 4194304;
                    i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i7 != 0) {
                        i8 = i13 | 100663296;
                        wzcVar2 = wzcVar;
                    } else {
                        wzcVar2 = wzcVar;
                        i8 = i13 | (av8Var2.g(wzcVar2) ? 67108864 : 33554432);
                    }
                    if (av8Var2.T(i8 & 1, (38347923 & i8) != 38347922)) {
                        av8Var2.Y();
                        if ((i & 1) == 0 || av8Var2.B()) {
                            xtcVar3 = i10 != 0 ? utc.a : xtcVar2;
                            if (i11 != 0) {
                                function22 = null;
                            }
                            if ((i2 & 64) != 0) {
                                float f = wec.a;
                                i8 &= -3670017;
                                cfcVar2 = wec.a((g23) av8Var2.k(i23.a));
                            }
                            if (i6 != 0) {
                                p3eVar2 = wec.b;
                            }
                            if (i7 != 0) {
                                wzcVar4 = null;
                                function24 = function22;
                                cfcVar3 = cfcVar2;
                                p3eVar4 = p3eVar2;
                            } else {
                                function24 = function22;
                                cfcVar3 = cfcVar2;
                                p3eVar4 = p3eVar2;
                                wzcVar4 = wzcVar2;
                            }
                            z3 = true;
                        } else {
                            av8Var2.W();
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                            z3 = z;
                            xtcVar3 = xtcVar2;
                            function24 = function22;
                            cfcVar3 = cfcVar2;
                            p3eVar4 = p3eVar2;
                            wzcVar4 = wzcVar2;
                        }
                        av8Var2.t();
                        pea.c(tc3Var, function0, xtcVar3, function24, z3, cfcVar3, p3eVar4, wzcVar4, av8Var2, 268435454 & i8);
                        av8Var = av8Var2;
                        wzcVar3 = wzcVar4;
                        p3eVar3 = p3eVar4;
                        cfcVar2 = cfcVar3;
                        z2 = z3;
                        function23 = function24;
                        xtcVar2 = xtcVar3;
                    } else {
                        av8Var2.W();
                        function23 = function22;
                        av8Var = av8Var2;
                        p3eVar3 = p3eVar2;
                        wzcVar3 = wzcVar2;
                        z2 = z;
                    }
                    u = av8Var.u();
                    if (u != null) {
                        u.d = new s10(tc3Var, function0, xtcVar2, function23, z2, cfcVar2, p3eVar3, wzcVar3, i, i2);
                        return;
                    }
                    return;
                }
                p3eVar2 = p3eVar;
                i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i7 != 0) {
                }
                if (av8Var2.T(i8 & 1, (38347923 & i8) != 38347922)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            cfcVar2 = cfcVar;
        }
        i5 = 524288;
        int i132 = i12 | i5;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        p3eVar2 = p3eVar;
        i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i7 != 0) {
        }
        if (av8Var2.T(i8 & 1, (38347923 & i8) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }
}
