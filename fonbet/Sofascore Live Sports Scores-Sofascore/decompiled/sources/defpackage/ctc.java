package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ctc {
    public static final long a = uaa.h(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* JADX WARN: Removed duplicated region for block: B:137:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Function0 function0, xtc xtcVar, final dfh dfhVar, float f, boolean z, uah uahVar, final long j, long j2, long j3, Function2 function2, Function2 function22, dtc dtcVar, final tc3 tc3Var, of3 of3Var, final int i, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        int i6;
        boolean z2;
        uah uahVar2;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        av8 av8Var;
        final float f3;
        final long j4;
        final dtc dtcVar2;
        final boolean z3;
        final uah uahVar3;
        final xtc xtcVar3;
        final long j5;
        final Function2 function23;
        final Function2 function24;
        eqf u;
        long j6;
        long j7;
        Function2 function25;
        dtc dtcVar3;
        Function2 function26;
        long j8;
        xtc xtcVar4;
        uah uahVar4;
        boolean z4;
        float f4;
        int i14;
        Function2 function27;
        dfh dfhVar2;
        dtc dtcVar4;
        boolean z5;
        boolean z6;
        Object O;
        Object O2;
        int i15;
        boolean z7;
        boolean i16;
        Object O3;
        dfh dfhVar3;
        int i17;
        int i18;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1904798512);
        if ((i & 6) == 0) {
            i4 = (av8Var2.i(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i4 |= av8Var2.g(dfhVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= av8Var2.d(f) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i4 |= av8Var2.h(z2) ? 16384 : 8192;
                    if ((i & 196608) != 0) {
                        uahVar2 = uahVar;
                        i4 |= ((i3 & 32) == 0 && av8Var2.g(uahVar2)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    } else {
                        uahVar2 = uahVar;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= av8Var2.f(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && av8Var2.f(j2)) {
                            i18 = 8388608;
                            i4 |= i18;
                        }
                        i18 = 4194304;
                        i4 |= i18;
                    }
                    if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= av8Var2.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) != 0) {
                        f2 = 0.0f;
                        i4 |= ((i3 & 512) == 0 && av8Var2.f(j3)) ? 536870912 : 268435456;
                    } else {
                        f2 = 0.0f;
                    }
                    i7 = i3 & 1024;
                    if (i7 == 0) {
                        i9 = i2 | 6;
                        i8 = i7;
                    } else if ((i2 & 6) == 0) {
                        i8 = i7;
                        i9 = i2 | (av8Var2.i(function2) ? 4 : 2);
                    } else {
                        i8 = i7;
                        i9 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if ((i3 & a.o) == 0 && av8Var2.i(function22)) {
                            i17 = 32;
                            i9 |= i17;
                        }
                        i17 = 16;
                        i9 |= i17;
                    }
                    int i20 = i9;
                    i10 = i4;
                    i11 = i3 & 4096;
                    if (i11 == 0) {
                        i12 = i20 | 384;
                    } else if ((i2 & 384) == 0) {
                        i12 = i20 | (av8Var2.g(dtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
                    } else {
                        i12 = i20;
                    }
                    if ((i2 & 3072) == 0) {
                        i12 |= av8Var2.i(tc3Var) ? 2048 : 1024;
                    }
                    i13 = i12;
                    if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i13 & 1171) != 1170)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        f3 = f;
                        j4 = j2;
                        dtcVar2 = dtcVar;
                        z3 = z2;
                        uahVar3 = uahVar2;
                        xtcVar3 = xtcVar2;
                        j5 = j3;
                        function23 = function2;
                        function24 = function22;
                    } else {
                        av8Var2.Y();
                        if ((i & 1) == 0 || av8Var2.B()) {
                            if (i19 != 0) {
                                xtcVar2 = utc.a;
                            }
                            float f5 = i5 != 0 ? d02.b : f;
                            if (i6 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                d02 d02Var = d02.a;
                                i10 &= -458753;
                                uahVar2 = ech.b(yeh.a, av8Var2);
                            }
                            if ((i3 & 128) != 0) {
                                j6 = i23.b(j, av8Var2);
                                i10 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i3 & 512) != 0) {
                                d02 d02Var2 = d02.a;
                                j7 = r13.c(i23.d(ttg.a, av8Var2), 0.32f);
                                i10 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            Function2 function28 = i8 != 0 ? rd3.a : function2;
                            if ((i3 & a.o) != 0) {
                                function25 = jq2.r;
                                i13 &= -113;
                            } else {
                                function25 = function22;
                            }
                            if (i11 != 0) {
                                dtc dtcVar5 = new dtc();
                                rzg rzgVar = rzg.a;
                                function26 = function25;
                                dtcVar3 = dtcVar5;
                            } else {
                                dtcVar3 = dtcVar;
                                function26 = function25;
                            }
                            j8 = j7;
                            xtcVar4 = xtcVar2;
                            uahVar4 = uahVar2;
                            z4 = z2;
                            f4 = f5;
                            i14 = i10;
                            function27 = function28;
                        } else {
                            av8Var2.W();
                            i14 = (i3 & 32) != 0 ? i10 & (-458753) : i10;
                            if ((i3 & 128) != 0) {
                                i14 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                            }
                            if ((i3 & a.o) != 0) {
                                i13 &= -113;
                            }
                            j6 = j2;
                            j8 = j3;
                            function27 = function2;
                            function26 = function22;
                            dtcVar3 = dtcVar;
                            xtcVar4 = xtcVar2;
                            uahVar4 = uahVar2;
                            z4 = z2;
                            f4 = f;
                        }
                        av8Var2.t();
                        bwc bwcVar = bwc.a;
                        g0i I = ufa.I(bwcVar, av8Var2);
                        g0i I2 = ufa.I(bwcVar, av8Var2);
                        g0i I3 = ufa.I(bwc.d, av8Var2);
                        int i21 = (i14 & 896) ^ 384;
                        boolean i22 = ((i21 > 256 && av8Var2.g(dfhVar)) || (i14 & 384) == 256) | av8Var2.i(I2) | av8Var2.i(I3) | av8Var2.i(I);
                        Object O4 = av8Var2.O();
                        int i23 = i13;
                        a99 a99Var = nf3.a;
                        if (i22 || O4 == a99Var) {
                            O4 = new m61(dfhVar, I2, I3, I, 15);
                            dfhVar2 = dfhVar;
                            av8Var2.n0(O4);
                        } else {
                            dfhVar2 = dfhVar;
                        }
                        hz8.t((Function0) O4, av8Var2);
                        Object O5 = av8Var2.O();
                        if (O5 == a99Var) {
                            O5 = hz8.G(g.a, av8Var2);
                            av8Var2.n0(O5);
                        }
                        ku3 ku3Var = (ku3) O5;
                        int i24 = i14 & 14;
                        boolean i25 = ((i21 > 256 && av8Var2.g(dfhVar2)) || (i14 & 384) == 256) | av8Var2.i(ku3Var) | (i24 == 4);
                        Object O6 = av8Var2.O();
                        if (i25 || O6 == a99Var) {
                            O6 = new t87(dfhVar2, ku3Var, function0);
                            av8Var2.n0(O6);
                        }
                        Function0 function02 = (Function0) O6;
                        boolean i26 = av8Var2.i(ku3Var);
                        if (i21 <= 256 || !av8Var2.g(dfhVar2)) {
                            dtcVar4 = dtcVar3;
                            if ((i14 & 384) != 256) {
                                z5 = false;
                                z6 = i26 | z5 | (i24 != 4);
                                O = av8Var2.O();
                                if (!z6 || O == a99Var) {
                                    O = new vsc(0, ku3Var, dfhVar2, function0);
                                    av8Var2.n0(O);
                                }
                                Function1 function1 = (Function1) O;
                                O2 = av8Var2.O();
                                if (O2 == a99Var) {
                                    O2 = ml4.b(f2);
                                    av8Var2.n0(O2);
                                }
                                q50 q50Var = (q50) O2;
                                if (i21 > 256 || !av8Var2.g(dfhVar2)) {
                                    i15 = i21;
                                    if ((i14 & 384) != 256) {
                                        z7 = false;
                                        i16 = (i24 == 4) | z7 | av8Var2.i(ku3Var) | av8Var2.i(q50Var);
                                        O3 = av8Var2.O();
                                        if (!i16 || O3 == a99Var) {
                                            O3 = new m61(dfhVar2, ku3Var, q50Var, function0);
                                            av8Var2.n0(O3);
                                        }
                                        int i27 = i14;
                                        dtc dtcVar6 = dtcVar4;
                                        av8Var = av8Var2;
                                        dfhVar3 = dfhVar2;
                                        long j9 = j8;
                                        int i28 = i15;
                                        wca.c((Function0) O3, j6, dtcVar6, q50Var, yqo.H(1010026864, av8Var, new ysc(j9, function02, dfhVar3, dtcVar6, q50Var, ku3Var, function1, xtcVar4, f4, z4, uahVar4, j, j6, function27, function26, tc3Var)), av8Var, ((i27 >> 18) & 112) | 24576 | (i23 & 896) | 4096);
                                        if (dfhVar3.d.g().a.containsKey(efh.b)) {
                                            av8Var.d0(748459762);
                                            boolean z8 = (i28 > 256 && av8Var.g(dfhVar3)) || (i27 & 384) == 256;
                                            Object O7 = av8Var.O();
                                            if (z8 || O7 == a99Var) {
                                                O7 = new u87(dfhVar3, null, 6);
                                                av8Var.n0(O7);
                                            }
                                            hz8.o(av8Var, dfhVar3, (Function2) O7);
                                            av8Var.s(false);
                                        } else {
                                            av8Var.d0(748521266);
                                            av8Var.s(false);
                                        }
                                        xtcVar3 = xtcVar4;
                                        f3 = f4;
                                        uahVar3 = uahVar4;
                                        j5 = j9;
                                        j4 = j6;
                                        function24 = function26;
                                        dtcVar2 = dtcVar6;
                                        z3 = z4;
                                        function23 = function27;
                                    }
                                } else {
                                    i15 = i21;
                                }
                                z7 = true;
                                i16 = (i24 == 4) | z7 | av8Var2.i(ku3Var) | av8Var2.i(q50Var);
                                O3 = av8Var2.O();
                                if (!i16) {
                                }
                                O3 = new m61(dfhVar2, ku3Var, q50Var, function0);
                                av8Var2.n0(O3);
                                int i272 = i14;
                                dtc dtcVar62 = dtcVar4;
                                av8Var = av8Var2;
                                dfhVar3 = dfhVar2;
                                long j92 = j8;
                                int i282 = i15;
                                wca.c((Function0) O3, j6, dtcVar62, q50Var, yqo.H(1010026864, av8Var, new ysc(j92, function02, dfhVar3, dtcVar62, q50Var, ku3Var, function1, xtcVar4, f4, z4, uahVar4, j, j6, function27, function26, tc3Var)), av8Var, ((i272 >> 18) & 112) | 24576 | (i23 & 896) | 4096);
                                if (dfhVar3.d.g().a.containsKey(efh.b)) {
                                }
                                xtcVar3 = xtcVar4;
                                f3 = f4;
                                uahVar3 = uahVar4;
                                j5 = j92;
                                j4 = j6;
                                function24 = function26;
                                dtcVar2 = dtcVar62;
                                z3 = z4;
                                function23 = function27;
                            }
                        } else {
                            dtcVar4 = dtcVar3;
                        }
                        z5 = true;
                        z6 = i26 | z5 | (i24 != 4);
                        O = av8Var2.O();
                        if (!z6) {
                        }
                        O = new vsc(0, ku3Var, dfhVar2, function0);
                        av8Var2.n0(O);
                        Function1 function12 = (Function1) O;
                        O2 = av8Var2.O();
                        if (O2 == a99Var) {
                        }
                        q50 q50Var2 = (q50) O2;
                        if (i21 > 256) {
                        }
                        i15 = i21;
                        if ((i14 & 384) != 256) {
                        }
                        z7 = true;
                        i16 = (i24 == 4) | z7 | av8Var2.i(ku3Var) | av8Var2.i(q50Var2);
                        O3 = av8Var2.O();
                        if (!i16) {
                        }
                        O3 = new m61(dfhVar2, ku3Var, q50Var2, function0);
                        av8Var2.n0(O3);
                        int i2722 = i14;
                        dtc dtcVar622 = dtcVar4;
                        av8Var = av8Var2;
                        dfhVar3 = dfhVar2;
                        long j922 = j8;
                        int i2822 = i15;
                        wca.c((Function0) O3, j6, dtcVar622, q50Var2, yqo.H(1010026864, av8Var, new ysc(j922, function02, dfhVar3, dtcVar622, q50Var2, ku3Var, function12, xtcVar4, f4, z4, uahVar4, j, j6, function27, function26, tc3Var)), av8Var, ((i2722 >> 18) & 112) | 24576 | (i23 & 896) | 4096);
                        if (dfhVar3.d.g().a.containsKey(efh.b)) {
                        }
                        xtcVar3 = xtcVar4;
                        f3 = f4;
                        uahVar3 = uahVar4;
                        j5 = j922;
                        j4 = j6;
                        function24 = function26;
                        dtcVar2 = dtcVar622;
                        z3 = z4;
                        function23 = function27;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: wsc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int K = aba.K(i | 1);
                                int K2 = aba.K(i2);
                                ctc.a(Function0.this, xtcVar3, dfhVar, f3, z3, uahVar3, j, j4, j5, function23, function24, dtcVar2, tc3Var, (of3) obj, K, K2, i3);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i & 196608) != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                }
                if ((i & 805306368) != 0) {
                }
                i7 = i3 & 1024;
                if (i7 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i202 = i9;
                i10 = i4;
                i11 = i3 & 4096;
                if (i11 == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i13 = i12;
                if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i13 & 1171) != 1170)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i & 196608) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            }
            if ((i & 805306368) != 0) {
            }
            i7 = i3 & 1024;
            if (i7 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2022 = i9;
            i10 = i4;
            i11 = i3 & 4096;
            if (i11 == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i13 = i12;
            if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i13 & 1171) != 1170)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i & 196608) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i20222 = i9;
        i10 = i4;
        i11 = i3 & 4096;
        if (i11 == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i13 = i12;
        if (av8Var2.T(i10 & 1, (i10 & 306783379) == 306783378 || (i13 & 1171) != 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(final Function0 function0, final xtc xtcVar, dfh dfhVar, final float f, final uah uahVar, final long j, final long j2, final long j3, final Function2 function2, Function2 function22, dtc dtcVar, final tc3 tc3Var, of3 of3Var, final int i) {
        Function0 function02;
        int i2;
        xtc xtcVar2;
        uah uahVar2;
        long j4;
        long j5;
        long j6;
        Function2 function23;
        av8 av8Var;
        final dfh dfhVar2;
        final Function2 function24;
        final dtc dtcVar2;
        Function2 function25;
        dtc dtcVar3;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(953901324);
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (av8Var2.i(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var2.g(xtcVar2) ? 32 : 16;
        } else {
            xtcVar2 = xtcVar;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.d(f) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            uahVar2 = uahVar;
            i2 |= av8Var2.g(uahVar2) ? 16384 : 8192;
        } else {
            uahVar2 = uahVar;
        }
        if ((196608 & i) == 0) {
            j4 = j;
            i2 |= av8Var2.f(j4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            j4 = j;
        }
        if ((1572864 & i) == 0) {
            j5 = j2;
            i2 |= av8Var2.f(j5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            j5 = j2;
        }
        int i4 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            j6 = j3;
            i4 |= av8Var2.f(j6) ? 67108864 : 33554432;
        } else {
            j6 = j3;
        }
        if ((805306368 & i) == 0) {
            function23 = function2;
            i4 |= av8Var2.i(function23) ? 536870912 : 268435456;
        } else {
            function23 = function2;
        }
        if (av8Var2.T(i4 & 1, (306783379 & i4) != 306783378)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                dfh g = g(null, av8Var2, 0, 3);
                int i5 = i4 & (-897);
                function25 = jq2.s;
                dtcVar3 = nsc.a;
                dfhVar2 = g;
                i3 = i5;
            } else {
                av8Var2.W();
                i3 = i4 & (-897);
                dfhVar2 = dfhVar;
                function25 = function22;
                dtcVar3 = dtcVar;
            }
            av8Var2.t();
            av8Var = av8Var2;
            int i6 = i3 << 3;
            a(function02, xtcVar2, dfhVar2, f, true, uahVar2, j4, j5, j6, function23, function25, dtcVar3, tc3Var, av8Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 7168) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), ((i3 >> 27) & 14) | 3456, 0);
            function24 = function25;
            dtcVar2 = dtcVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            dfhVar2 = dfhVar;
            function24 = function22;
            dtcVar2 = dtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: ssc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    ctc.b(Function0.this, xtcVar, dfhVar2, f, uahVar, j, j2, j3, function2, function24, dtcVar2, tc3Var, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final q50 q50Var, final ku3 ku3Var, final Function0 function0, final Function1 function1, final xtc xtcVar, final dfh dfhVar, final float f, final boolean z, final uah uahVar, final long j, final long j2, final float f2, final Function2 function2, final Function2 function22, final tc3 tc3Var, of3 of3Var, final int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-37400432);
        int i2 = i | (av8Var2.i(q50Var) ? 32 : 16) | (av8Var2.i(ku3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192);
        boolean g = av8Var2.g(xtcVar);
        int i3 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i4 = i2 | (g ? 131072 : 65536) | (av8Var2.g(dfhVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.d(f) ? 8388608 : 4194304) | (av8Var2.h(z) ? 67108864 : 33554432) | (av8Var2.g(uahVar) ? 536870912 : 268435456);
        int i5 = (av8Var2.f(j) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | (av8Var2.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function2) ? a.o : 1024) | (av8Var2.i(function22) ? 16384 : 8192);
        if (av8Var2.i(tc3Var)) {
            i3 = 131072;
        }
        int i6 = i5 | i3;
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            String B = cga.B(R.string.m3c_bottom_sheet_pane_title, av8Var2);
            xtc d = bkh.d(bkh.q(n12.a.a(xtcVar, uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1), 1.0f);
            xtc xtcVar2 = utc.a;
            Object obj = nf3.a;
            if (z) {
                av8Var2.d0(-1582035383);
                boolean z2 = (((i4 & 3670016) ^ 1572864) > 1048576 && av8Var2.g(dfhVar)) || (i4 & 1572864) == 1048576;
                Object O = av8Var2.O();
                if (z2 || O == obj) {
                    ewd ewdVar = ewd.a;
                    i4k i4kVar = bfh.a;
                    O = new afh(dfhVar, function1);
                    av8Var2.n0(O);
                }
                xtcVar2 = lz.J(xtcVar2, (e9d) O, null);
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1582020872);
                av8Var2.s(false);
            }
            xtc z3 = d.z(xtcVar2);
            dx dxVar = dfhVar.d;
            dx dxVar2 = dfhVar.d;
            ewd ewdVar2 = ewd.a;
            int i7 = (i4 & 3670016) ^ 1572864;
            boolean z4 = (i7 > 1048576 && av8Var2.g(dfhVar)) || (i4 & 1572864) == 1048576;
            Object O2 = av8Var2.O();
            if (z4 || O2 == obj) {
                O2 = new faa(dfhVar, 28);
                av8Var2.n0(O2);
            }
            xtc z5 = j72.z(z3, dxVar, (Function2) O2);
            f4a f4aVar = (f4a) dxVar2.m;
            boolean z6 = z && dfhVar.d();
            boolean z7 = ((eoh) ((e1d) dxVar2.d)).getValue() != null;
            boolean z8 = (i4 & 57344) == 16384;
            Object O3 = av8Var2.O();
            if (z8 || O3 == obj) {
                O3 = new zsc(function1, null);
                av8Var2.n0(O3);
            }
            xtc z9 = z5.z(new u95(f4aVar, z6, z7, w95.a, (ct8) O3));
            boolean g2 = av8Var2.g(B);
            Object O4 = av8Var2.O();
            if (g2 || O4 == obj) {
                O4 = new jp1(B, 21);
                av8Var2.n0(O4);
            }
            xtc a2 = o3h.a(z9, false, (Function1) O4);
            int h = (int) ((xnh) dxVar2.f).h();
            if (h < 0) {
                h = 0;
            }
            xtc T = td4.T(a2, new i68(0, h, 0, 0));
            boolean z10 = ((i7 > 1048576 && av8Var2.g(dfhVar)) || (i4 & 1572864) == 1048576) | ((i4 & 112) == 32 || av8Var2.i(q50Var));
            Object O5 = av8Var2.O();
            if (z10 || O5 == obj) {
                O5 = new lsb(10, dfhVar, q50Var);
                av8Var2.n0(O5);
            }
            int i8 = i6 << 6;
            av8Var = av8Var2;
            uni.a(s02.M(s02.M(T, (Function1) O5), new h02(dfhVar, 0)), uahVar, j, j2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(728743275, av8Var2, new btc(function22, q50Var, dfhVar, function2, tc3Var, function0, ku3Var, z)), av8Var, ((i4 >> 24) & 112) | 12582912 | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 96);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(ku3Var, function0, function1, xtcVar, dfhVar, f, z, uahVar, j, j2, f2, function2, function22, tc3Var, i) { // from class: usc
                public final /* synthetic */ ku3 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ xtc e;
                public final /* synthetic */ dfh f;
                public final /* synthetic */ float g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ uah i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ Function2 m;
                public final /* synthetic */ Function2 n;
                public final /* synthetic */ tc3 o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(71);
                    ctc.c(q50.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (of3) obj2, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final long j, final Function0 function0, final boolean z, of3 of3Var, final int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-391613911);
        int i2 = 2;
        int i3 = i | (av8Var.f(j) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(true) ? a.o : 1024);
        if (!av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.W();
        } else if (j != 16) {
            av8Var.d0(-1438582326);
            cdi b = a60.b(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ufa.I(bwc.c, av8Var), null, av8Var, 0, 28);
            String B = cga.B(R.string.close_sheet, av8Var);
            av8Var.d0(-1438283579);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new m00(function0, i2);
                av8Var.n0(O);
            }
            xtc a2 = koi.a(utc.a, function0, (PointerInputEventHandler) O);
            boolean g = (i4 == 32) | av8Var.g(B);
            Object O2 = av8Var.O();
            if (g || O2 == a99Var) {
                O2 = new lsb(9, B, function0);
                av8Var.n0(O2);
            }
            xtc a3 = o3h.a(a2, true, (Function1) O2);
            av8Var.s(false);
            xtc z3 = bkh.c.z(a3);
            boolean g2 = av8Var.g(b) | ((i3 & 14) == 4);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                O3 = new o76(j, b, i2);
                av8Var.n0(O3);
            }
            lz.d(0, av8Var, z3, (Function1) O3);
            av8Var.s(false);
        } else {
            av8Var.d0(-1437676103);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(j, function0, z, i) { // from class: tsc
                public final /* synthetic */ long a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ boolean c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    ctc.d(this.a, this.b, this.c, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final float e(f4g f4gVar, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (f4gVar.r >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return 1.0f - (b6a.t(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f4gVar.s.j() * 48.0f, intBitsToFloat), f) / intBitsToFloat);
    }

    public static final float f(f4g f4gVar, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (f4gVar.r & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return 1.0f - (b6a.t(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f4gVar.s.j() * 24.0f, intBitsToFloat), f) / intBitsToFloat);
    }

    public static final dfh g(Function1 function1, of3 of3Var, int i, int i2) {
        efh efhVar = efh.a;
        boolean z = true;
        boolean z2 = (i2 & 1) == 0;
        int i3 = i2 & 2;
        Object obj = nf3.a;
        if (i3 != 0) {
            av8 av8Var = (av8) of3Var;
            Object O = av8Var.O();
            if (O == obj) {
                O = new clc(7);
                av8Var.n0(O);
            }
            function1 = (Function1) O;
        }
        Function1 function12 = function1;
        int i4 = (i & 14) | 384 | (i & 112);
        i4k i4kVar = bfh.a;
        float f = d02.c;
        float f2 = d02.d;
        av8 av8Var2 = (av8) of3Var;
        kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
        boolean g = av8Var2.g(kx4Var) | av8Var2.d(f);
        Object O2 = av8Var2.O();
        if (g || O2 == obj) {
            O2 = new zeh(kx4Var, f, 0);
            av8Var2.n0(O2);
        }
        Function0 function0 = (Function0) O2;
        boolean g2 = av8Var2.g(kx4Var) | av8Var2.d(f2);
        Object O3 = av8Var2.O();
        if (g2 || O3 == obj) {
            O3 = new zeh(kx4Var, f2, 1);
            av8Var2.n0(O3);
        }
        Function0 function02 = (Function0) O3;
        Object[] objArr = {Boolean.valueOf(z2), function12, Boolean.FALSE};
        y3g y3gVar = new y3g(9, new wqg(11), new c30(z2, function0, function02, function12));
        boolean g3 = ((((i4 & 14) ^ 6) > 4 && av8Var2.h(z2)) || (i4 & 6) == 4) | av8Var2.g(function0) | av8Var2.g(function02);
        if ((((i4 & 112) ^ 48) <= 32 || !av8Var2.g(function12)) && (i4 & 48) != 32) {
            z = false;
        }
        boolean h = g3 | z | av8Var2.h(false);
        Object O4 = av8Var2.O();
        if (h || O4 == obj) {
            Object tb7Var = new tb7(2, function0, function02, efhVar, function12, z2);
            av8Var2.n0(tb7Var);
            O4 = tb7Var;
        }
        return (dfh) o3a.M(objArr, y3gVar, (Function0) O4, av8Var2, 0);
    }
}
