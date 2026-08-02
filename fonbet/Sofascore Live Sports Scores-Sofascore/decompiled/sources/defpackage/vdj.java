package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vdj {
    public static final ff5 a = new ff5(0, new z2j(28));

    public static final void a(dfj dfjVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-13499697);
        int i2 = (av8Var.g(dfjVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            ff5 ff5Var = a;
            tol.b(ff5Var.a(((dfj) av8Var.k(ff5Var)).e(dfjVar)), tc3Var, av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(dfjVar, tc3Var, i, 26);
        }
    }

    public static final void b(final String str, final xtc xtcVar, final long j, final long j2, final wg8 wg8Var, final tf8 tf8Var, final long j3, final p7j p7jVar, final long j4, final int i, final boolean z, final int i2, final Function1 function1, final dfj dfjVar, of3 of3Var, final int i3, final int i4) {
        int i5;
        int i6;
        wg8 wg8Var2;
        int i7;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1028090691);
        if ((i3 & 6) == 0) {
            i5 = (av8Var2.g(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= av8Var2.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= av8Var2.f(j2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= av8Var2.g(null) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 = 196608;
            wg8Var2 = wg8Var;
            i5 |= av8Var2.g(wg8Var2) ? 131072 : 65536;
        } else {
            i6 = 196608;
            wg8Var2 = wg8Var;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= av8Var2.g(tf8Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= av8Var2.f(j3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= av8Var2.g(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= av8Var2.g(p7jVar) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (av8Var2.f(j4) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= av8Var2.e(i) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= av8Var2.e(i2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= av8Var2.e(1) ? 16384 : 8192;
        }
        if ((i4 & i6) == 0) {
            i7 |= av8Var2.i(function1) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= av8Var2.g(dfjVar) ? 1048576 : 524288;
        }
        if (av8Var2.T(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            av8Var2.Y();
            if ((i3 & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            long c = j != 16 ? j : dfjVar.c() != 16 ? dfjVar.c() : r13.c(((r13) av8Var2.k(mo3.a)).a, ((Number) av8Var2.k(go3.a)).floatValue());
            dfj f = dfj.f(dfjVar, 0L, j2, wg8Var2, tf8Var, j3, null, p7jVar != null ? p7jVar.a : 0, j4, 16609105);
            boolean f2 = av8Var2.f(c);
            Object O = av8Var2.O();
            if (f2 || O == nf3.a) {
                O = new rdj(c);
                av8Var2.n0(O);
            }
            int i8 = i7 << 9;
            av8Var = av8Var2;
            iz8.d(str, xtcVar, f, function1, i, z, i2, 1, (c23) O, null, av8Var, (i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i7 >> 6) & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128), 512);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: odj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i3 | 1);
                    int K2 = aba.K(i4);
                    vdj.b(str, xtcVar, j, j2, wg8Var, tf8Var, j3, p7jVar, j4, i, z, i2, function1, dfjVar, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, xtc xtcVar, long j, long j2, wg8 wg8Var, tf8 tf8Var, long j3, p7j p7jVar, long j4, int i, boolean z, int i2, Function1 function1, dfj dfjVar, of3 of3Var, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        long j6;
        int i9;
        wg8 wg8Var2;
        int i10;
        tf8 tf8Var2;
        int i11;
        int i12;
        p7j p7jVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        av8 av8Var;
        xtc xtcVar2;
        int i19;
        boolean z2;
        int i20;
        Function1 function12;
        dfj dfjVar2;
        p7j p7jVar3;
        final wg8 wg8Var3;
        final long j7;
        final tf8 tf8Var3;
        final long j8;
        long j9;
        eqf u;
        int i21;
        long j10;
        wg8 wg8Var4;
        int i22;
        long j11;
        long j12;
        tf8 tf8Var4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-366126944);
        if ((i3 & 6) == 0) {
            i6 = (av8Var2.g(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= av8Var2.g(xtcVar) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                j5 = j;
                i6 |= av8Var2.f(j5) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                    j6 = j2;
                } else {
                    j6 = j2;
                    if ((i3 & 3072) == 0) {
                        i6 |= av8Var2.f(j6) ? a.o : 1024;
                    }
                }
                int i24 = i6 | 24576;
                i9 = i5 & 32;
                int i25 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (i9 != 0) {
                    i24 = 221184 | i6;
                } else if ((i3 & 196608) == 0) {
                    wg8Var2 = wg8Var;
                    i24 |= av8Var2.g(wg8Var2) ? 131072 : 65536;
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i24 |= 1572864;
                        tf8Var2 = tf8Var;
                    } else {
                        tf8Var2 = tf8Var;
                        if ((i3 & 1572864) == 0) {
                            i24 |= av8Var2.g(tf8Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                    }
                    i11 = i24 | 113246208;
                    i12 = i5 & 512;
                    if (i12 == 0) {
                        i11 = i24 | 918552576;
                    } else if ((805306368 & i3) == 0) {
                        p7jVar2 = p7jVar;
                        i11 |= av8Var2.g(p7jVar2) ? 536870912 : 268435456;
                        int i26 = i4 | 6;
                        i13 = i5 & a.o;
                        if (i13 != 0) {
                            i26 = i4 | 54;
                            i14 = i13;
                        } else if ((i4 & 48) == 0) {
                            i14 = i13;
                            i26 |= av8Var2.e(i) ? 32 : 16;
                        } else {
                            i14 = i13;
                        }
                        int i27 = i26;
                        int i28 = i27 | 384;
                        i15 = i5 & 8192;
                        if (i15 != 0) {
                            i16 = i27 | 3456;
                        } else {
                            if ((i4 & 3072) == 0) {
                                i28 |= av8Var2.e(i2) ? a.o : 1024;
                            }
                            i16 = i28;
                        }
                        int i29 = i16 | 24576;
                        if ((i5 & 32768) == 0) {
                            i17 = i29;
                            if (av8Var2.g(dfjVar)) {
                                i25 = 131072;
                            }
                        } else {
                            i17 = i29;
                        }
                        i18 = i17 | i25;
                        if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
                            av8Var2.Y();
                            if ((i3 & 1) == 0 || av8Var2.B()) {
                                xtc xtcVar3 = i23 != 0 ? utc.a : xtcVar;
                                long j13 = i7 != 0 ? r13.i : j5;
                                if (i8 != 0) {
                                    j6 = lfj.c;
                                }
                                if (i9 != 0) {
                                    wg8Var2 = null;
                                }
                                if (i10 != 0) {
                                    tf8Var2 = null;
                                }
                                long j14 = lfj.c;
                                p7j p7jVar4 = i12 == 0 ? p7jVar2 : null;
                                int i30 = i14 != 0 ? 1 : i;
                                int i31 = i15 != 0 ? Integer.MAX_VALUE : i2;
                                Object O = av8Var2.O();
                                if (O == nf3.a) {
                                    O = new qaj(5);
                                    av8Var2.n0(O);
                                }
                                Function1 function13 = (Function1) O;
                                if ((i5 & 32768) != 0) {
                                    int i32 = i31;
                                    xtcVar2 = xtcVar3;
                                    i21 = i18 & (-458753);
                                    i20 = i32;
                                    i19 = i30;
                                    j10 = j6;
                                    z2 = true;
                                    function12 = function13;
                                    wg8Var4 = wg8Var2;
                                    i22 = 196608;
                                    dfjVar2 = (dfj) av8Var2.k(a);
                                } else {
                                    int i33 = i31;
                                    xtcVar2 = xtcVar3;
                                    i21 = i18;
                                    i20 = i33;
                                    i19 = i30;
                                    j10 = j6;
                                    z2 = true;
                                    function12 = function13;
                                    wg8Var4 = wg8Var2;
                                    i22 = 196608;
                                    dfjVar2 = dfjVar;
                                }
                                p7jVar3 = p7jVar4;
                                j11 = j13;
                                j12 = j14;
                                tf8Var4 = tf8Var2;
                                j9 = j12;
                            } else {
                                av8Var2.W();
                                if ((i5 & 32768) != 0) {
                                    i18 &= -458753;
                                }
                                xtcVar2 = xtcVar;
                                i19 = i;
                                z2 = z;
                                function12 = function1;
                                p7jVar3 = p7jVar2;
                                j10 = j6;
                                tf8Var4 = tf8Var2;
                                i21 = i18;
                                i22 = 196608;
                                j9 = j4;
                                i20 = i2;
                                dfjVar2 = dfjVar;
                                wg8Var4 = wg8Var2;
                                j11 = j5;
                                j12 = j3;
                            }
                            av8Var2.t();
                            av8Var = av8Var2;
                            b(str, xtcVar2, j11, j10, wg8Var4, tf8Var4, j12, p7jVar3, j9, i19, z2, i20, function12, dfjVar2, av8Var, i11 & 2147483646, (i21 & 112) | 24966 | (i21 & 7168) | i22 | ((i21 << 3) & 3670016));
                            long j15 = j10;
                            wg8Var3 = wg8Var4;
                            tf8Var3 = tf8Var4;
                            j8 = j12;
                            j5 = j11;
                            j7 = j15;
                        } else {
                            av8Var = av8Var2;
                            av8Var.W();
                            xtcVar2 = xtcVar;
                            i19 = i;
                            z2 = z;
                            i20 = i2;
                            function12 = function1;
                            dfjVar2 = dfjVar;
                            p7jVar3 = p7jVar2;
                            wg8Var3 = wg8Var2;
                            j7 = j6;
                            tf8Var3 = tf8Var2;
                            j8 = j3;
                            j9 = j4;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            final xtc xtcVar4 = xtcVar2;
                            final long j16 = j5;
                            final p7j p7jVar5 = p7jVar3;
                            final long j17 = j9;
                            final int i34 = i19;
                            final boolean z3 = z2;
                            final int i35 = i20;
                            final Function1 function14 = function12;
                            final dfj dfjVar3 = dfjVar2;
                            u.d = new Function2() { // from class: mdj
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int K = aba.K(i3 | 1);
                                    int K2 = aba.K(i4);
                                    vdj.c(str, xtcVar4, j16, j7, wg8Var3, tf8Var3, j8, p7jVar5, j17, i34, z3, i35, function14, dfjVar3, (of3) obj, K, K2, i5);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    p7jVar2 = p7jVar;
                    int i262 = i4 | 6;
                    i13 = i5 & a.o;
                    if (i13 != 0) {
                    }
                    int i272 = i262;
                    int i282 = i272 | 384;
                    i15 = i5 & 8192;
                    if (i15 != 0) {
                    }
                    int i292 = i16 | 24576;
                    if ((i5 & 32768) == 0) {
                    }
                    i18 = i17 | i25;
                    if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                wg8Var2 = wg8Var;
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i24 | 113246208;
                i12 = i5 & 512;
                if (i12 == 0) {
                }
                p7jVar2 = p7jVar;
                int i2622 = i4 | 6;
                i13 = i5 & a.o;
                if (i13 != 0) {
                }
                int i2722 = i2622;
                int i2822 = i2722 | 384;
                i15 = i5 & 8192;
                if (i15 != 0) {
                }
                int i2922 = i16 | 24576;
                if ((i5 & 32768) == 0) {
                }
                i18 = i17 | i25;
                if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            j5 = j;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            int i242 = i6 | 24576;
            i9 = i5 & 32;
            int i252 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i9 != 0) {
            }
            wg8Var2 = wg8Var;
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i242 | 113246208;
            i12 = i5 & 512;
            if (i12 == 0) {
            }
            p7jVar2 = p7jVar;
            int i26222 = i4 | 6;
            i13 = i5 & a.o;
            if (i13 != 0) {
            }
            int i27222 = i26222;
            int i28222 = i27222 | 384;
            i15 = i5 & 8192;
            if (i15 != 0) {
            }
            int i29222 = i16 | 24576;
            if ((i5 & 32768) == 0) {
            }
            i18 = i17 | i252;
            if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        j5 = j;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        int i2422 = i6 | 24576;
        i9 = i5 & 32;
        int i2522 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i9 != 0) {
        }
        wg8Var2 = wg8Var;
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i2422 | 113246208;
        i12 = i5 & 512;
        if (i12 == 0) {
        }
        p7jVar2 = p7jVar;
        int i262222 = i4 | 6;
        i13 = i5 & a.o;
        if (i13 != 0) {
        }
        int i272222 = i262222;
        int i282222 = i272222 | 384;
        i15 = i5 & 8192;
        if (i15 != 0) {
        }
        int i292222 = i16 | 24576;
        if ((i5 & 32768) == 0) {
        }
        i18 = i17 | i2522;
        if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }
}
