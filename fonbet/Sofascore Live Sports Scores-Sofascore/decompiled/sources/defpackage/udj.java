package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class udj {
    public static final ff5 a = new ff5(0, new z2j(27));

    public static final void a(dfj dfjVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(15327438);
        int i2 = (av8Var.g(dfjVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            ff5 ff5Var = a;
            tol.b(ff5Var.a(((dfj) av8Var.k(ff5Var)).e(dfjVar)), tc3Var, av8Var, (i2 & 112) | 8);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(dfjVar, tc3Var, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, xtc xtcVar, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, dfj dfjVar, of3 of3Var, final int i4, final int i5, final int i6) {
        int i7;
        xtc xtcVar2;
        int i8;
        long j5;
        int i9;
        long j6;
        int i10;
        int i11;
        dfj dfjVar2;
        av8 av8Var;
        final boolean z2;
        final int i12;
        final xtc xtcVar3;
        final long j7;
        final long j8;
        final dfj dfjVar3;
        final long j9;
        final long j10;
        final int i13;
        final int i14;
        eqf u;
        xtc xtcVar4;
        long j11;
        long j12;
        long j13;
        dfj dfjVar4;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        long j14;
        int i19;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2055108902);
        if ((i4 & 6) == 0) {
            i7 = (av8Var2.g(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i20 = i6 & 2;
        if (i20 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var2.g(xtcVar2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                j5 = j;
                i7 |= av8Var2.f(j5) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    j6 = j2;
                    i7 |= av8Var2.f(j6) ? a.o : 1024;
                    i10 = i7 | 920346624;
                    i11 = i5 | 224694;
                    if ((i5 & 1572864) != 0) {
                        if ((i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
                            dfjVar2 = dfjVar;
                            if (av8Var2.g(dfjVar2)) {
                                i19 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                i11 |= i19;
                            }
                        } else {
                            dfjVar2 = dfjVar;
                        }
                        i19 = 524288;
                        i11 |= i19;
                    } else {
                        dfjVar2 = dfjVar;
                    }
                    if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (599187 & i11) != 599186)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        z2 = z;
                        i12 = i2;
                        xtcVar3 = xtcVar2;
                        j7 = j5;
                        j8 = j6;
                        dfjVar3 = dfjVar2;
                        j9 = j3;
                        j10 = j4;
                        i13 = i;
                        i14 = i3;
                    } else {
                        av8Var2.Y();
                        if ((i4 & 1) == 0 || av8Var2.B()) {
                            xtcVar4 = i20 != 0 ? utc.a : xtcVar2;
                            j11 = i8 != 0 ? r13.i : j5;
                            j12 = i9 != 0 ? lfj.c : j6;
                            j13 = lfj.c;
                            if ((i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
                                j14 = j13;
                                dfjVar4 = (dfj) av8Var2.k(a);
                                i15 = 1;
                                z3 = true;
                                i16 = 1;
                                i17 = Integer.MAX_VALUE;
                                i18 = 224694;
                            } else {
                                dfjVar4 = dfjVar2;
                                i15 = 1;
                                z3 = true;
                                i16 = 1;
                                i17 = Integer.MAX_VALUE;
                                i18 = i11;
                                j14 = j13;
                            }
                        } else {
                            av8Var2.W();
                            i15 = i;
                            z3 = z;
                            i17 = i2;
                            i16 = i3;
                            if ((i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
                                xtcVar4 = xtcVar2;
                                j11 = j5;
                                j12 = j6;
                                dfjVar4 = dfjVar2;
                                i18 = 224694;
                            } else {
                                xtcVar4 = xtcVar2;
                                j11 = j5;
                                j12 = j6;
                                i18 = i11;
                                dfjVar4 = dfjVar2;
                            }
                            j13 = j3;
                            j14 = j4;
                        }
                        av8Var2.t();
                        int i21 = i10 << 3;
                        int i22 = (i10 & 896) | (i10 & 14) | 3072 | (i10 & 112) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
                        int i23 = ((i10 >> 27) & 14) | 1797552 | ((i18 << 3) & 29360128);
                        xtcVar3 = xtcVar4;
                        j7 = j11;
                        long j15 = j12;
                        av8Var = av8Var2;
                        c(str, xtcVar3, j7, null, j15, null, j13, null, null, j14, i15, z3, i17, i16, null, dfjVar4, av8Var, i22, i23, 0);
                        j8 = j15;
                        j9 = j13;
                        j10 = j14;
                        i13 = i15;
                        z2 = z3;
                        i12 = i17;
                        i14 = i16;
                        dfjVar3 = dfjVar4;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: ndj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int K = aba.K(i4 | 1);
                                int K2 = aba.K(i5);
                                udj.b(str, xtcVar3, j7, j8, j9, j10, i13, z2, i12, i14, dfjVar3, (of3) obj, K, K2, i6);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                j6 = j2;
                i10 = i7 | 920346624;
                i11 = i5 | 224694;
                if ((i5 & 1572864) != 0) {
                }
                if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (599187 & i11) != 599186)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            j5 = j;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            j6 = j2;
            i10 = i7 | 920346624;
            i11 = i5 | 224694;
            if ((i5 & 1572864) != 0) {
            }
            if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (599187 & i11) != 599186)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        j5 = j;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        j6 = j2;
        i10 = i7 | 920346624;
        i11 = i5 | 224694;
        if ((i5 & 1572864) != 0) {
        }
        if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (599187 & i11) != 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, xtc xtcVar, long j, es0 es0Var, long j2, wg8 wg8Var, long j3, v8j v8jVar, p7j p7jVar, long j4, int i, boolean z, int i2, int i3, Function1 function1, dfj dfjVar, of3 of3Var, final int i4, final int i5, final int i6) {
        int i7;
        xtc xtcVar2;
        int i8;
        int i9;
        es0 es0Var2;
        int i10;
        long j5;
        int i11;
        wg8 wg8Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        av8 av8Var;
        final long j6;
        final p7j p7jVar2;
        final boolean z2;
        final int i26;
        final int i27;
        final Function1 function12;
        final dfj dfjVar2;
        final xtc xtcVar3;
        final long j7;
        final wg8 wg8Var3;
        final v8j v8jVar2;
        final long j8;
        final int i28;
        final es0 es0Var3;
        final long j9;
        eqf u;
        long j10;
        long j11;
        long j12;
        v8j v8jVar3;
        p7j p7jVar3;
        long j13;
        boolean z3;
        int i29;
        int i30;
        Function1 function13;
        dfj dfjVar3;
        long c;
        v8j v8jVar4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (av8Var2.g(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var2.g(xtcVar2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= av8Var2.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                es0Var2 = es0Var;
                i7 |= av8Var2.i(es0Var2) ? 2048 : 1024;
                i10 = i6 & 16;
                if (i10 != 0) {
                    i7 |= 24576;
                    j5 = j2;
                } else {
                    j5 = j2;
                    if ((i4 & 24576) == 0) {
                        i7 |= av8Var2.f(j5) ? 16384 : 8192;
                    }
                }
                if ((i6 & 32) != 0) {
                    i7 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i7 |= av8Var2.g(null) ? 131072 : 65536;
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                    i7 |= 1572864;
                    wg8Var2 = wg8Var;
                } else {
                    wg8Var2 = wg8Var;
                    if ((i4 & 1572864) == 0) {
                        i7 |= av8Var2.g(wg8Var2) ? 1048576 : 524288;
                    }
                }
                int i32 = 4194304;
                if ((i6 & 128) != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= av8Var2.g(null) ? 8388608 : 4194304;
                    i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i7 |= av8Var2.f(j3) ? 67108864 : 33554432;
                    }
                    i13 = i6 & 512;
                    if (i13 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i7 |= av8Var2.g(v8jVar) ? 536870912 : 268435456;
                    }
                    i14 = i6 & 1024;
                    if (i14 == 0) {
                        i16 = i5 | 6;
                        i15 = i14;
                    } else if ((i5 & 6) == 0) {
                        i15 = i14;
                        i16 = i5 | (av8Var2.g(p7jVar) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i5;
                    }
                    i17 = i6 & a.o;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i16 |= av8Var2.f(j4) ? 32 : 16;
                    }
                    int i33 = i16;
                    i18 = i6 & 4096;
                    if (i18 == 0) {
                        i33 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i19 = i;
                        i33 |= av8Var2.e(i19) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                        i20 = i6 & 8192;
                        if (i20 != 0) {
                            i21 = i33 | 3072;
                        } else {
                            int i34 = i33;
                            if ((i5 & 3072) == 0) {
                                i21 = i34 | (av8Var2.h(z) ? 2048 : 1024);
                            } else {
                                i21 = i34;
                            }
                        }
                        i22 = i6 & 16384;
                        if (i22 != 0) {
                            i23 = i21 | 24576;
                        } else {
                            i23 = i21;
                            if ((i5 & 24576) == 0) {
                                i23 |= av8Var2.e(i2) ? 16384 : 8192;
                                i24 = i6 & 32768;
                                if (i24 == 0) {
                                    i23 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    i23 |= av8Var2.e(i3) ? 131072 : 65536;
                                }
                                i25 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                if (i25 == 0) {
                                    i23 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i23 |= av8Var2.i(function1) ? 1048576 : 524288;
                                }
                                if ((i5 & 12582912) == 0) {
                                    if ((i6 & 131072) == 0 && av8Var2.g(dfjVar)) {
                                        i32 = 8388608;
                                    }
                                    i23 |= i32;
                                }
                                if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                                    av8Var = av8Var2;
                                    av8Var.W();
                                    j6 = j;
                                    p7jVar2 = p7jVar;
                                    z2 = z;
                                    i26 = i2;
                                    i27 = i3;
                                    function12 = function1;
                                    dfjVar2 = dfjVar;
                                    xtcVar3 = xtcVar2;
                                    j7 = j5;
                                    wg8Var3 = wg8Var2;
                                    v8jVar2 = v8jVar;
                                    j8 = j4;
                                    i28 = i19;
                                    es0Var3 = es0Var2;
                                    j9 = j3;
                                } else {
                                    av8Var2.Y();
                                    if ((i4 & 1) == 0 || av8Var2.B()) {
                                        if (i31 != 0) {
                                            xtcVar2 = utc.a;
                                        }
                                        j10 = i8 != 0 ? r13.i : j;
                                        if (i9 != 0) {
                                            es0Var2 = null;
                                        }
                                        j11 = i10 != 0 ? lfj.c : j5;
                                        if (i11 != 0) {
                                            wg8Var2 = null;
                                        }
                                        j12 = i12 != 0 ? lfj.c : j3;
                                        v8jVar3 = i13 != 0 ? null : v8jVar;
                                        p7jVar3 = i15 != 0 ? null : p7jVar;
                                        j13 = i17 != 0 ? lfj.c : j4;
                                        if (i18 != 0) {
                                            i19 = 1;
                                        }
                                        z3 = i20 != 0 ? true : z;
                                        i29 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                        i30 = i24 == 0 ? i3 : 1;
                                        function13 = i25 != 0 ? null : function1;
                                        if ((i6 & 131072) != 0) {
                                            dfjVar3 = (dfj) av8Var2.k(a);
                                            i23 &= -29360129;
                                        } else {
                                            dfjVar3 = dfjVar;
                                        }
                                    } else {
                                        av8Var2.W();
                                        if ((i6 & 131072) != 0) {
                                            i23 &= -29360129;
                                        }
                                        j10 = j;
                                        j12 = j3;
                                        v8jVar3 = v8jVar;
                                        p7jVar3 = p7jVar;
                                        j13 = j4;
                                        z3 = z;
                                        i29 = i2;
                                        i30 = i3;
                                        function13 = function1;
                                        dfjVar3 = dfjVar;
                                        j11 = j5;
                                    }
                                    av8Var2.t();
                                    av8Var2.d0(-565217106);
                                    if (j10 != 16) {
                                        v8jVar4 = v8jVar3;
                                        c = j10;
                                    } else {
                                        av8Var2.d0(-565216333);
                                        c = dfjVar3.c();
                                        if (c != 16) {
                                            v8jVar4 = v8jVar3;
                                        } else {
                                            v8jVar4 = v8jVar3;
                                            c = ((r13) av8Var2.k(lo3.a)).a;
                                        }
                                        av8Var2.s(false);
                                    }
                                    av8Var2.s(false);
                                    int i35 = i23 << 6;
                                    iz8.d(str, xtcVar2, dfj.f(dfjVar3, c, j11, wg8Var2, null, j12, v8jVar4, p7jVar3 != null ? p7jVar3.a : 0, j13, 16609104), function13, i19, z3, i29, i30, null, es0Var2, av8Var2, (i7 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i23 >> 9) & 7168) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i35 & 29360128) | ((i7 << 18) & 1879048192), NotificationCompat.FLAG_LOCAL_ONLY);
                                    av8Var = av8Var2;
                                    long j14 = j11;
                                    p7jVar2 = p7jVar3;
                                    j7 = j14;
                                    i26 = i29;
                                    z2 = z3;
                                    xtcVar3 = xtcVar2;
                                    wg8Var3 = wg8Var2;
                                    j8 = j13;
                                    i27 = i30;
                                    j6 = j10;
                                    function12 = function13;
                                    v8jVar2 = v8jVar4;
                                    i28 = i19;
                                    es0Var3 = es0Var2;
                                    dfjVar2 = dfjVar3;
                                    j9 = j12;
                                }
                                u = av8Var.u();
                                if (u == null) {
                                    u.d = new Function2() { // from class: ldj
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int K = aba.K(i4 | 1);
                                            int K2 = aba.K(i5);
                                            udj.c(str, xtcVar3, j6, es0Var3, j7, wg8Var3, j9, v8jVar2, p7jVar2, j8, i28, z2, i26, i27, function12, dfjVar2, (of3) obj, K, K2, i6);
                                            return Unit.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        i24 = i6 & 32768;
                        if (i24 == 0) {
                        }
                        i25 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (i25 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                        }
                        u = av8Var.u();
                        if (u == null) {
                        }
                    }
                    i19 = i;
                    i20 = i6 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 16384;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 32768;
                    if (i24 == 0) {
                    }
                    i25 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (i25 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
                i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i12 == 0) {
                }
                i13 = i6 & 512;
                if (i13 == 0) {
                }
                i14 = i6 & 1024;
                if (i14 == 0) {
                }
                i17 = i6 & a.o;
                if (i17 == 0) {
                }
                int i332 = i16;
                i18 = i6 & 4096;
                if (i18 == 0) {
                }
                i19 = i;
                i20 = i6 & 8192;
                if (i20 != 0) {
                }
                i22 = i6 & 16384;
                if (i22 != 0) {
                }
                i24 = i6 & 32768;
                if (i24 == 0) {
                }
                i25 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (i25 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            es0Var2 = es0Var;
            i10 = i6 & 16;
            if (i10 != 0) {
            }
            if ((i6 & 32) != 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            int i322 = 4194304;
            if ((i6 & 128) != 0) {
            }
            i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i12 == 0) {
            }
            i13 = i6 & 512;
            if (i13 == 0) {
            }
            i14 = i6 & 1024;
            if (i14 == 0) {
            }
            i17 = i6 & a.o;
            if (i17 == 0) {
            }
            int i3322 = i16;
            i18 = i6 & 4096;
            if (i18 == 0) {
            }
            i19 = i;
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i22 = i6 & 16384;
            if (i22 != 0) {
            }
            i24 = i6 & 32768;
            if (i24 == 0) {
            }
            i25 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i25 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        es0Var2 = es0Var;
        i10 = i6 & 16;
        if (i10 != 0) {
        }
        if ((i6 & 32) != 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        int i3222 = 4194304;
        if ((i6 & 128) != 0) {
        }
        i12 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i12 == 0) {
        }
        i13 = i6 & 512;
        if (i13 == 0) {
        }
        i14 = i6 & 1024;
        if (i14 == 0) {
        }
        i17 = i6 & a.o;
        if (i17 == 0) {
        }
        int i33222 = i16;
        i18 = i6 & 4096;
        if (i18 == 0) {
        }
        i19 = i;
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i22 = i6 & 16384;
        if (i22 != 0) {
        }
        i24 = i6 & 32768;
        if (i24 == 0) {
        }
        i25 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i25 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final q80 q80Var, xtc xtcVar, long j, es0 es0Var, long j2, long j3, p7j p7jVar, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, final dfj dfjVar, of3 of3Var, final int i4, final int i5, final int i6) {
        int i7;
        xtc xtcVar2;
        int i8;
        long j5;
        int i9;
        es0 es0Var2;
        int i10;
        int i11;
        p7j p7jVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        av8 av8Var;
        final int i21;
        final int i22;
        final Map map2;
        final Function1 function12;
        final es0 es0Var3;
        final xtc xtcVar3;
        final p7j p7jVar3;
        final long j6;
        final long j7;
        final long j8;
        final boolean z2;
        final int i23;
        final long j9;
        eqf u;
        long j10;
        Map map3;
        Function1 function13;
        int i24;
        Map map4;
        int i25;
        Function1 function14;
        boolean z3;
        int i26;
        long j11;
        long j12;
        long c;
        boolean z4;
        es0 es0Var4;
        boolean z5;
        int i27;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(292247417);
        if ((i4 & 6) == 0) {
            i7 = (av8Var2.g(q80Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i28 = i6 & 2;
        if (i28 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var2.g(xtcVar2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                j5 = j;
                i7 |= av8Var2.f(j5) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    es0Var2 = es0Var;
                    i7 |= av8Var2.i(es0Var2) ? a.o : 1024;
                    i10 = i7 | 920346624;
                    i11 = i6 & 1024;
                    if (i11 == 0) {
                        p7jVar2 = p7jVar;
                        i12 = i5 | 6;
                    } else {
                        p7jVar2 = p7jVar;
                        if ((i5 & 6) == 0) {
                            i12 = i5 | (av8Var2.g(p7jVar2) ? 4 : 2);
                        } else {
                            i12 = i5;
                        }
                    }
                    int i29 = i12 | 48;
                    i13 = i6 & 4096;
                    if (i13 == 0) {
                        i15 = i13;
                        i16 = i12 | 432;
                        i14 = i;
                    } else {
                        if ((i5 & 384) == 0) {
                            i14 = i;
                            i29 |= av8Var2.e(i14) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                        } else {
                            i14 = i;
                        }
                        i15 = i13;
                        i16 = i29;
                    }
                    int i30 = i16 | 3072;
                    i17 = i6 & 16384;
                    if (i17 == 0) {
                        i30 = i16 | 27648;
                    } else if ((i5 & 24576) == 0) {
                        i30 |= av8Var2.e(i2) ? 16384 : 8192;
                        i18 = i30 | 196608;
                        i19 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (i19 != 0) {
                            i18 = i30 | 1769472;
                        } else if ((i5 & 1572864) == 0) {
                            i18 |= av8Var2.i(map) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        i20 = i6 & 131072;
                        if (i20 != 0) {
                            i18 |= 12582912;
                        } else if ((i5 & 12582912) == 0) {
                            i18 |= av8Var2.i(function1) ? 8388608 : 4194304;
                        }
                        if ((i5 & 100663296) == 0) {
                            i18 |= av8Var2.g(dfjVar) ? 67108864 : 33554432;
                        }
                        if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 38347923) != 38347922)) {
                            av8Var2.Y();
                            int i31 = i4 & 1;
                            a99 a99Var = nf3.a;
                            if (i31 == 0 || av8Var2.B()) {
                                if (i28 != 0) {
                                    xtcVar2 = utc.a;
                                }
                                if (i8 != 0) {
                                    j5 = r13.i;
                                }
                                if (i9 != 0) {
                                    es0Var2 = null;
                                }
                                j10 = lfj.c;
                                if (i11 != 0) {
                                    p7jVar2 = null;
                                }
                                if (i15 != 0) {
                                    i14 = 1;
                                }
                                int i32 = i17 != 0 ? Integer.MAX_VALUE : i2;
                                if (i19 != 0) {
                                    map3 = lm5.a;
                                    map3.getClass();
                                } else {
                                    map3 = map;
                                }
                                if (i20 != 0) {
                                    Object O = av8Var2.O();
                                    if (O == a99Var) {
                                        O = new qaj(6);
                                        av8Var2.n0(O);
                                    }
                                    function13 = (Function1) O;
                                } else {
                                    function13 = function1;
                                }
                                i24 = i32;
                                map4 = map3;
                                i25 = i14;
                                function14 = function13;
                                z3 = true;
                                i26 = 1;
                                j11 = j10;
                                j12 = j11;
                            } else {
                                av8Var2.W();
                                j10 = j2;
                                j12 = j4;
                                z3 = z;
                                i24 = i2;
                                i26 = i3;
                                map4 = map;
                                function14 = function1;
                                i25 = i14;
                                j11 = j3;
                            }
                            av8Var2.t();
                            av8Var2.d0(1676919644);
                            if (j5 != 16) {
                                z4 = z3;
                                es0Var4 = es0Var2;
                                c = j5;
                                z5 = false;
                            } else {
                                av8Var2.d0(1676920417);
                                c = dfjVar.c();
                                if (c != 16) {
                                    z4 = z3;
                                    es0Var4 = es0Var2;
                                } else {
                                    z4 = z3;
                                    es0Var4 = es0Var2;
                                    c = ((r13) av8Var2.k(lo3.a)).a;
                                }
                                z5 = false;
                                av8Var2.s(false);
                            }
                            av8Var2.s(z5);
                            long j13 = ((g23) av8Var2.k(i23.a)).a;
                            boolean f = av8Var2.f(j13);
                            int i33 = i25;
                            Object O2 = av8Var2.O();
                            if (f || O2 == a99Var) {
                                O2 = new iej(new pwh(j13, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.c, (qah) null, 61438), null, null, null);
                                av8Var2.n0(O2);
                            }
                            iej iejVar = (iej) O2;
                            boolean g = ((i10 & 14) == 4) | av8Var2.g(iejVar);
                            Object O3 = av8Var2.O();
                            if (g || O3 == a99Var) {
                                i27 = 0;
                                O3 = q80Var.b(new qdj(iejVar, i27));
                                av8Var2.n0(O3);
                            } else {
                                i27 = 0;
                            }
                            q80 q80Var2 = (q80) O3;
                            if (p7jVar2 != null) {
                                i27 = p7jVar2.a;
                            }
                            long j14 = j11;
                            long j15 = j12;
                            int i34 = i18 << 6;
                            es0 es0Var5 = es0Var4;
                            boolean z6 = z4;
                            int i35 = i24;
                            int i36 = i26;
                            Map map5 = map4;
                            Function1 function15 = function14;
                            iz8.c(q80Var2, xtcVar2, dfj.f(dfjVar, c, j10, null, null, j14, null, i27, j15, 16609104), function15, i33, z6, i35, i36, map5, es0Var5, av8Var2, (i10 & 112) | ((i18 >> 12) & 7168) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (29360128 & i34) | (i34 & 234881024), (i10 >> 9) & 14);
                            av8Var = av8Var2;
                            i21 = i35;
                            es0Var3 = es0Var5;
                            function12 = function15;
                            i22 = i36;
                            map2 = map5;
                            p7jVar3 = p7jVar2;
                            j8 = j15;
                            j9 = j10;
                            long j16 = j5;
                            i23 = i33;
                            z2 = z6;
                            xtcVar3 = xtcVar2;
                            j7 = j14;
                            j6 = j16;
                        } else {
                            av8Var = av8Var2;
                            av8Var.W();
                            i21 = i2;
                            i22 = i3;
                            map2 = map;
                            function12 = function1;
                            es0Var3 = es0Var2;
                            xtcVar3 = xtcVar2;
                            p7jVar3 = p7jVar2;
                            j6 = j5;
                            j7 = j3;
                            j8 = j4;
                            z2 = z;
                            i23 = i14;
                            j9 = j2;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new Function2() { // from class: pdj
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int K = aba.K(i4 | 1);
                                    int K2 = aba.K(i5);
                                    udj.d(q80.this, xtcVar3, j6, es0Var3, j9, j7, p7jVar3, j8, i23, z2, i21, i22, map2, function12, dfjVar, (of3) obj, K, K2, i6);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i18 = i30 | 196608;
                    i19 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (i19 != 0) {
                    }
                    i20 = i6 & 131072;
                    if (i20 != 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 38347923) != 38347922)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                es0Var2 = es0Var;
                i10 = i7 | 920346624;
                i11 = i6 & 1024;
                if (i11 == 0) {
                }
                int i292 = i12 | 48;
                i13 = i6 & 4096;
                if (i13 == 0) {
                }
                int i302 = i16 | 3072;
                i17 = i6 & 16384;
                if (i17 == 0) {
                }
                i18 = i302 | 196608;
                i19 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (i19 != 0) {
                }
                i20 = i6 & 131072;
                if (i20 != 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 38347923) != 38347922)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            j5 = j;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            es0Var2 = es0Var;
            i10 = i7 | 920346624;
            i11 = i6 & 1024;
            if (i11 == 0) {
            }
            int i2922 = i12 | 48;
            i13 = i6 & 4096;
            if (i13 == 0) {
            }
            int i3022 = i16 | 3072;
            i17 = i6 & 16384;
            if (i17 == 0) {
            }
            i18 = i3022 | 196608;
            i19 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i19 != 0) {
            }
            i20 = i6 & 131072;
            if (i20 != 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 38347923) != 38347922)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        j5 = j;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        es0Var2 = es0Var;
        i10 = i7 | 920346624;
        i11 = i6 & 1024;
        if (i11 == 0) {
        }
        int i29222 = i12 | 48;
        i13 = i6 & 4096;
        if (i13 == 0) {
        }
        int i30222 = i16 | 3072;
        i17 = i6 & 16384;
        if (i17 == 0) {
        }
        i18 = i30222 | 196608;
        i19 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i19 != 0) {
        }
        i20 = i6 & 131072;
        if (i20 != 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 38347923) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }
}
