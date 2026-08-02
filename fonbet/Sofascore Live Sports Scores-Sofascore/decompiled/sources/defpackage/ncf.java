package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ncf {
    public static final h74 a = ewc.c;

    /* JADX WARN: Removed duplicated region for block: B:101:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(xtc xtcVar, long j, float f, long j2, int i, float f2, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        long j3;
        float f3;
        long j4;
        int i5;
        int i6;
        int i7;
        final xtc xtcVar3;
        final long j5;
        final float f4;
        final int i8;
        final long j6;
        final float f5;
        eqf u;
        long j7;
        final float f6;
        final int i9;
        final long j8;
        final float f7;
        final long j9;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(333154241);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            xtcVar2 = xtcVar;
        } else if ((i2 & 6) == 0) {
            xtcVar2 = xtcVar;
            i4 = (av8Var.g(xtcVar2) ? 4 : 2) | i2;
        } else {
            xtcVar2 = xtcVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && av8Var.f(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f3 = f;
            i4 |= av8Var.d(f3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && av8Var.f(j4)) ? a.o : 1024;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= av8Var.e(i6) ? 16384 : 8192;
                i7 = i4 | 196608;
                if (av8Var.T(i7 & 1, (i7 & 74899) != 74898)) {
                    av8Var.Y();
                    if ((i2 & 1) == 0 || av8Var.B()) {
                        xtc xtcVar4 = i10 != 0 ? utc.a : xtcVar2;
                        if ((i3 & 2) != 0) {
                            j7 = i23.d(pcf.a, av8Var);
                            i7 &= -113;
                        } else {
                            j7 = j3;
                        }
                        if (i11 != 0) {
                            f3 = 4.0f;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = r13.h;
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            i6 = 1;
                        }
                        f6 = 4.0f;
                        j3 = j7;
                        i9 = i6;
                        xtcVar2 = xtcVar4;
                    } else {
                        av8Var.W();
                        if ((i3 & 2) != 0) {
                            i7 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i7 &= -7169;
                        }
                        f6 = f2;
                        i9 = i6;
                    }
                    av8Var.t();
                    final jii jiiVar = new jii(((kx4) av8Var.k(dh3.h)).H0(f3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9, 0, null, 26);
                    h2a F = i2a.F(null, av8Var, 1);
                    final f2a q = i2a.q(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1080.0f, s02.P(s02.h0(6000, 0, jg5.d, 2), null, 0L, 6), null, av8Var, 4536, 8);
                    b1f b1fVar = new b1f(19);
                    sja sjaVar = new sja();
                    b1fVar.invoke(sjaVar);
                    final f2a q2 = i2a.q(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, s02.P(new tja(sjaVar), null, 0L, 6), null, av8Var, 4536, 8);
                    sja sjaVar2 = new sja();
                    sjaVar2.a = 6000;
                    sjaVar2.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, Float.valueOf(0.87f)).b = a;
                    sjaVar2.a(6000, Float.valueOf(0.1f));
                    Unit unit = Unit.a;
                    final f2a q3 = i2a.q(F, 0.1f, 0.87f, s02.P(new tja(sjaVar2), null, 0L, 6), null, av8Var, 4536, 8);
                    xtc l = bkh.l(o3h.a(xtcVar2, true, new b1f(20)), 40.0f);
                    boolean g = ((57344 & i7) == 16384) | av8Var.g(q3) | ((458752 & i7) == 131072) | ((i7 & 896) == 256) | av8Var.g(q) | av8Var.g(q2) | ((((i7 & 7168) ^ 3072) > 2048 && av8Var.f(j4)) || (i7 & 3072) == 2048) | av8Var.i(jiiVar) | ((((i7 & 112) ^ 48) > 32 && av8Var.f(j3)) || (i7 & 48) == 32);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        j8 = j3;
                        f7 = f3;
                        j9 = j4;
                        O = new Function1() { // from class: kcf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                long j10 = j9;
                                jii jiiVar2 = jiiVar;
                                long j11 = j8;
                                ha5 ha5Var = (ha5) obj;
                                float floatValue = ((Number) q3.getValue()).floatValue() * 360.0f;
                                int i12 = i9;
                                float f8 = f6;
                                if (i12 != 0 && Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (ha5Var.n() >> 32))) {
                                    f8 += f7;
                                }
                                float D0 = (f8 / ((float) (ha5Var.D0(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) * 3.141592653589793d))) * 360.0f;
                                float floatValue2 = ((Number) q2.getValue()).floatValue() + ((Number) q.getValue()).floatValue();
                                long O0 = ha5Var.O0();
                                sx2 L0 = ha5Var.L0();
                                long D = L0.D();
                                L0.t().o();
                                try {
                                    ((hpo) L0.a).F(O0, floatValue2);
                                    ncf.d(ha5Var, Math.min(floatValue, D0) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, D0) * 2.0f), j10, jiiVar2);
                                    ncf.d(ha5Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, j11, jiiVar2);
                                    mz1.v(L0, D);
                                    return Unit.a;
                                } catch (Throwable th) {
                                    mz1.v(L0, D);
                                    throw th;
                                }
                            }
                        };
                        av8Var.n0(O);
                    } else {
                        j8 = j3;
                        f7 = f3;
                        j9 = j4;
                    }
                    lz.d(0, av8Var, l, (Function1) O);
                    xtcVar3 = xtcVar2;
                    av8Var = av8Var;
                    i8 = i9;
                    f5 = f6;
                    f4 = f7;
                    j6 = j9;
                    j5 = j8;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    j5 = j3;
                    f4 = f3;
                    i8 = i6;
                    j6 = j4;
                    f5 = f2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: lcf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ncf.a(xtc.this, j5, f4, j6, i8, f5, (of3) obj, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i;
            i7 = i4 | 196608;
            if (av8Var.T(i7 & 1, (i7 & 74899) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        f3 = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i4 | 196608;
        if (av8Var.T(i7 & 1, (i7 & 74899) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final Function0 function0, xtc xtcVar, final long j, final float f, final long j2, final int i, float f2, of3 of3Var, final int i2, final int i3) {
        float f3;
        xtc xtcVar2;
        final float f4;
        eqf u;
        float f5;
        boolean z;
        Object O;
        boolean g;
        Object O2;
        boolean g2;
        Object O3;
        final float f6;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1798883595);
        int i5 = i2 | (av8Var.i(function0) ? 4 : 2) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j2) ? 16384 : 8192) | (av8Var.e(i) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i6 = i3 & 64;
        if (i6 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            f3 = f2;
            i5 |= av8Var.d(f3) ? 1048576 : 524288;
            if (av8Var.T(i5 & 1, (599187 & i5) == 599186)) {
                xtcVar2 = xtcVar;
                av8Var.W();
                f4 = f3;
            } else {
                av8Var.Y();
                if ((i2 & 1) != 0 && !av8Var.B()) {
                    av8Var.W();
                } else if (i6 != 0) {
                    f5 = 4.0f;
                    av8Var.t();
                    z = (i5 & 14) != 4;
                    O = av8Var.O();
                    Object obj = nf3.a;
                    if (!z || O == obj) {
                        O = new rsd(4, function0);
                        av8Var.n0(O);
                    }
                    final Function0 function02 = (Function0) O;
                    final jii jiiVar = new jii(((kx4) av8Var.k(dh3.h)).H0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 0, null, 26);
                    g = av8Var.g(function02);
                    O2 = av8Var.O();
                    if (!g || O2 == obj) {
                        O2 = new ma0(14, function02);
                        av8Var.n0(O2);
                    }
                    xtcVar2 = xtcVar;
                    xtc l = bkh.l(o3h.a(xtcVar2, true, (Function1) O2), 40.0f);
                    g2 = ((i5 & 458752) != 131072) | av8Var.g(function02) | ((3670016 & i5) != 1048576) | ((((57344 & i5) ^ 24576) <= 16384 && av8Var.f(j2)) || (i5 & 24576) == 16384) | av8Var.i(jiiVar) | ((((i5 & 896) ^ 384) <= 256 && av8Var.f(j)) || (i5 & 384) == 256);
                    O3 = av8Var.O();
                    if (!g2 || O3 == obj) {
                        f6 = f5;
                        i4 = 0;
                        O3 = new Function1() { // from class: gcf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ha5 ha5Var = (ha5) obj2;
                                float floatValue = ((Number) Function0.this.invoke()).floatValue() * 360.0f;
                                int i7 = i;
                                float f7 = f6;
                                if (i7 != 0 && Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (ha5Var.n() >> 32))) {
                                    f7 += f;
                                }
                                float D0 = (f7 / ((float) (ha5Var.D0(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) * 3.141592653589793d))) * 360.0f;
                                float min = Math.min(floatValue, D0) + 270.0f + floatValue;
                                float min2 = (360.0f - floatValue) - (Math.min(floatValue, D0) * 2.0f);
                                long j3 = j2;
                                jii jiiVar2 = jiiVar;
                                ncf.d(ha5Var, min, min2, j3, jiiVar2);
                                ncf.d(ha5Var, 270.0f, floatValue, j, jiiVar2);
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O3);
                    } else {
                        f6 = f5;
                        i4 = 0;
                    }
                    lz.d(i4, av8Var, l, (Function1) O3);
                    f4 = f6;
                }
                f5 = f3;
                av8Var.t();
                if ((i5 & 14) != 4) {
                }
                O = av8Var.O();
                Object obj2 = nf3.a;
                if (!z) {
                }
                O = new rsd(4, function0);
                av8Var.n0(O);
                final Function0 function022 = (Function0) O;
                final jii jiiVar2 = new jii(((kx4) av8Var.k(dh3.h)).H0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 0, null, 26);
                g = av8Var.g(function022);
                O2 = av8Var.O();
                if (!g) {
                }
                O2 = new ma0(14, function022);
                av8Var.n0(O2);
                xtcVar2 = xtcVar;
                xtc l2 = bkh.l(o3h.a(xtcVar2, true, (Function1) O2), 40.0f);
                g2 = ((i5 & 458752) != 131072) | av8Var.g(function022) | ((3670016 & i5) != 1048576) | ((((57344 & i5) ^ 24576) <= 16384 && av8Var.f(j2)) || (i5 & 24576) == 16384) | av8Var.i(jiiVar2) | ((((i5 & 896) ^ 384) <= 256 && av8Var.f(j)) || (i5 & 384) == 256);
                O3 = av8Var.O();
                if (g2) {
                }
                f6 = f5;
                i4 = 0;
                O3 = new Function1() { // from class: gcf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        ha5 ha5Var = (ha5) obj22;
                        float floatValue = ((Number) Function0.this.invoke()).floatValue() * 360.0f;
                        int i7 = i;
                        float f7 = f6;
                        if (i7 != 0 && Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (ha5Var.n() >> 32))) {
                            f7 += f;
                        }
                        float D0 = (f7 / ((float) (ha5Var.D0(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) * 3.141592653589793d))) * 360.0f;
                        float min = Math.min(floatValue, D0) + 270.0f + floatValue;
                        float min2 = (360.0f - floatValue) - (Math.min(floatValue, D0) * 2.0f);
                        long j3 = j2;
                        jii jiiVar22 = jiiVar2;
                        ncf.d(ha5Var, min, min2, j3, jiiVar22);
                        ncf.d(ha5Var, 270.0f, floatValue, j, jiiVar22);
                        return Unit.a;
                    }
                };
                av8Var.n0(O3);
                lz.d(i4, av8Var, l2, (Function1) O3);
                f4 = f6;
            }
            u = av8Var.u();
            if (u == null) {
                final xtc xtcVar3 = xtcVar2;
                u.d = new Function2() { // from class: icf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        ncf.b(Function0.this, xtcVar3, j, f, j2, i, f4, (of3) obj3, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if (av8Var.T(i5 & 1, (599187 & i5) == 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(final Function0 function0, final xtc xtcVar, final long j, final long j2, final int i, final float f, final Function1 function1, of3 of3Var, final int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-339970038);
        int i4 = (av8Var.i(function0) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.f(j2) ? a.o : 1024;
        }
        int i5 = i4 | (av8Var.e(i) ? 16384 : 8192);
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            boolean z = (i5 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new rsd(5, function0);
                av8Var.n0(O);
            }
            final Function0 function02 = (Function0) O;
            xtc z2 = xtcVar.z(ka.a);
            boolean g = av8Var.g(function02);
            Object O2 = av8Var.O();
            if (g || O2 == a99Var) {
                O2 = new ma0(15, function02);
                av8Var.n0(O2);
            }
            xtc m = bkh.m(o3h.a(z2, true, (Function1) O2), 240.0f, 4.0f);
            boolean g2 = ((57344 & i5) == 16384) | av8Var.g(function02) | ((((i5 & 7168) ^ 3072) > 2048 && av8Var.f(j2)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) > 256 && av8Var.f(j)) || (i5 & 384) == 256);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                i3 = 0;
                Function1 function12 = new Function1() { // from class: mcf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var = (ha5) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                        int i6 = i;
                        float f2 = f;
                        if (i6 != 0 && Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (ha5Var.n() >> 32))) {
                            f2 += ha5Var.D0(intBitsToFloat);
                        }
                        float D0 = f2 / ha5Var.D0(Float.intBitsToFloat((int) (ha5Var.n() >> 32)));
                        float floatValue = ((Number) function02.invoke()).floatValue();
                        float min = Math.min(floatValue, D0) + floatValue;
                        if (min <= 1.0f) {
                            ncf.e(ha5Var, min, 1.0f, j2, intBitsToFloat, i6);
                        }
                        ncf.e(ha5Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, j, intBitsToFloat, i6);
                        function1.invoke(ha5Var);
                        return Unit.a;
                    }
                };
                av8Var.n0(function12);
                O3 = function12;
            } else {
                i3 = 0;
            }
            lz.d(i3, av8Var, m, (Function1) O3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: fcf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ncf.c(Function0.this, xtcVar, j, j2, i, f, function1, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(ha5 ha5Var, float f, float f2, long j, jii jiiVar) {
        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - (2.0f * (jiiVar.a / 2.0f));
        ha5.L(ha5Var, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar, 832);
    }

    public static final void e(ha5 ha5Var, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
        float f4 = intBitsToFloat2 / 2.0f;
        boolean z = ha5Var.getLayoutDirection() == ema.a;
        float f5 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            ha5.W0(ha5Var, j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, 0, null, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = intBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ha5.W0(ha5Var, j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, i, null, 480);
        }
    }
}
