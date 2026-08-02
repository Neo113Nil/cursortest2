package defpackage;

import android.view.View;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class trh {
    static {
        ypa.a(ysa.c, new b7h(21));
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gv9 gv9Var, final Object obj, final Function1 function1, xtc xtcVar, ksa ksaVar, p3e p3eVar, lrh lrhVar, boolean z, boolean z2, boolean z3, fo foVar, Function1 function12, of3 of3Var, final int i, final int i2) {
        int i3;
        xtc xtcVar2;
        ksa ksaVar2;
        int i4;
        p3e p3eVar2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        av8 av8Var;
        final boolean z5;
        final ksa ksaVar3;
        final lrh lrhVar2;
        final boolean z6;
        final Function1 function13;
        final xtc xtcVar3;
        final p3e p3eVar3;
        final fo foVar2;
        final boolean z7;
        eqf u;
        xtc xtcVar4;
        ksa ksaVar4;
        final fo foVar3;
        final lrh lrhVar3;
        final boolean z8;
        Function1 function14;
        final boolean z9;
        final boolean z10;
        final p3e p3eVar4;
        int i10;
        final ksa ksaVar5;
        int i11;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2088014904);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? av8Var2.g(obj) : av8Var2.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    ksaVar2 = ksaVar;
                    if (av8Var2.g(ksaVar2)) {
                        i11 = 16384;
                        i3 |= i11;
                    }
                } else {
                    ksaVar2 = ksaVar;
                }
                i11 = 8192;
                i3 |= i11;
            } else {
                ksaVar2 = ksaVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                p3eVar2 = p3eVar;
                i3 |= av8Var2.g(p3eVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= av8Var2.g(lrhVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i6 = i3 | 12582912;
                i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i7 != 0) {
                    i6 = i3 | 113246208;
                } else if ((100663296 & i) == 0) {
                    z4 = z2;
                    i6 |= av8Var2.h(z4) ? 67108864 : 33554432;
                    i8 = i2 & 512;
                    if (i8 == 0) {
                        i6 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i6 |= av8Var2.h(z3) ? 536870912 : 268435456;
                    }
                    i9 = i2 & 1024;
                    if (av8Var2.T(i6 & 1, (i6 & 306783379) == 306783378 || (((i9 == 0 ? (char) 6 : av8Var2.g(foVar) ? (char) 4 : (char) 2) | '0') & 19) != 18)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        ksa ksaVar6 = ksaVar2;
                        z5 = z4;
                        ksaVar3 = ksaVar6;
                        lrhVar2 = lrhVar;
                        z6 = z3;
                        function13 = function12;
                        xtcVar3 = xtcVar2;
                        p3eVar3 = p3eVar2;
                        foVar2 = foVar;
                        z7 = z;
                    } else {
                        av8Var2.Y();
                        int i13 = i & 1;
                        a99 a99Var = nf3.a;
                        if (i13 == 0 || av8Var2.B()) {
                            xtcVar4 = i12 != 0 ? utc.a : xtcVar2;
                            if ((i2 & 16) != 0) {
                                ksaVar4 = msa.a(0, 0, av8Var2, 0, 3);
                                i6 &= -57345;
                            } else {
                                ksaVar4 = ksaVar2;
                            }
                            p3e t3eVar = i4 != 0 ? new t3e(8.0f, 8.0f, 8.0f, 8.0f) : p3eVar2;
                            lrh lrhVar4 = i5 != 0 ? hrh.m : lrhVar;
                            if (i7 != 0) {
                                z4 = true;
                            }
                            boolean z11 = i8 != 0 ? false : z3;
                            fo foVar4 = i9 != 0 ? uxf.o : foVar;
                            Object O = av8Var2.O();
                            if (O == a99Var) {
                                O = new z1h(15);
                                av8Var2.n0(O);
                            }
                            lrh lrhVar5 = lrhVar4;
                            ksaVar2 = ksaVar4;
                            foVar3 = foVar4;
                            lrhVar3 = lrhVar5;
                            z8 = z11;
                            function14 = (Function1) O;
                            z9 = true;
                            z10 = z4;
                            p3eVar4 = t3eVar;
                            i10 = i6;
                        } else {
                            av8Var2.W();
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                            }
                            lrhVar3 = lrhVar;
                            z9 = z;
                            z10 = z4;
                            xtcVar4 = xtcVar2;
                            p3eVar4 = p3eVar2;
                            foVar3 = foVar;
                            i10 = i6;
                            z8 = z3;
                            function14 = function12;
                        }
                        av8Var2.t();
                        final View view = (View) av8Var2.k(nz.f);
                        final xtc xtcVar5 = xtcVar4;
                        final Function1 function15 = function14;
                        boolean z12 = ((i10 & 14) == 4) | ((i10 & 112) == 32 || ((i10 & 64) != 0 && av8Var2.i(obj))) | ((((57344 & i10) ^ 24576) > 16384 && av8Var2.g(ksaVar2)) || (i10 & 24576) == 16384);
                        Object O2 = av8Var2.O();
                        if (z12 || O2 == a99Var) {
                            ksa ksaVar7 = ksaVar2;
                            O2 = new v1f(gv9Var, ksaVar7, obj, (rq3) null, 25);
                            ksaVar5 = ksaVar7;
                            av8Var2.n0(O2);
                        } else {
                            ksaVar5 = ksaVar2;
                        }
                        hz8.o(av8Var2, obj, (Function2) O2);
                        haa.f(yqo.H(598616621, av8Var2, new Function2() { // from class: prh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                of3 of3Var2 = (of3) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                av8 av8Var3 = (av8) of3Var2;
                                if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                    ksa ksaVar8 = ksaVar5;
                                    boolean g = av8Var3.g(ksaVar8);
                                    Object O3 = av8Var3.O();
                                    Object obj4 = nf3.a;
                                    if (g || O3 == obj4) {
                                        O3 = new ni4(ksaVar8, 12);
                                        av8Var3.n0(O3);
                                    }
                                    Function0 function0 = (Function0) O3;
                                    boolean g2 = av8Var3.g(ksaVar8);
                                    Object O4 = av8Var3.O();
                                    if (g2 || O4 == obj4) {
                                        O4 = new ni4(ksaVar8, 13);
                                        av8Var3.n0(O4);
                                    }
                                    xtc v = i9a.v(xtc.this, view, function0, (Function0) O4, function15, av8Var3, 0);
                                    ng0 ng0Var = new ng0(8.0f, true, new l1(foVar3, 5));
                                    gv9 gv9Var2 = gv9Var;
                                    boolean g3 = av8Var3.g(gv9Var2);
                                    Object obj5 = obj;
                                    boolean i14 = g3 | av8Var3.i(obj5);
                                    lrh lrhVar6 = lrhVar3;
                                    boolean g4 = i14 | av8Var3.g(lrhVar6);
                                    Function1 function16 = function1;
                                    boolean g5 = g4 | av8Var3.g(function16);
                                    boolean z13 = z9;
                                    boolean h = g5 | av8Var3.h(z13);
                                    boolean z14 = z8;
                                    boolean h2 = h | av8Var3.h(z14);
                                    Object O5 = av8Var3.O();
                                    if (h2 || O5 == obj4) {
                                        O5 = new rrh(gv9Var2, obj5, lrhVar6, function16, z13, z14);
                                        av8Var3.n0(O5);
                                    }
                                    v8a.c(v, ksaVar8, p3eVar4, ng0Var, null, null, z10, null, (Function1) O5, av8Var3, 0, 360);
                                } else {
                                    av8Var3.W();
                                }
                                return Unit.a;
                            }
                        }), av8Var2, 6);
                        foVar2 = foVar3;
                        z5 = z10;
                        lrhVar2 = lrhVar3;
                        z7 = z9;
                        z6 = z8;
                        function13 = function15;
                        p3eVar3 = p3eVar4;
                        xtcVar3 = xtcVar5;
                        ksaVar3 = ksaVar5;
                        av8Var = av8Var2;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: qrh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int K = aba.K(i | 1);
                                trh.a(gv9.this, obj, function1, xtcVar3, ksaVar3, p3eVar3, lrhVar2, z7, z5, z6, foVar2, function13, (of3) obj2, K, i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z4 = z2;
                i8 = i2 & 512;
                if (i8 == 0) {
                }
                i9 = i2 & 1024;
                if (av8Var2.T(i6 & 1, (i6 & 306783379) == 306783378 || (((i9 == 0 ? (char) 6 : av8Var2.g(foVar) ? (char) 4 : (char) 2) | '0') & 19) != 18)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            p3eVar2 = p3eVar;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i3 | 12582912;
            i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i7 != 0) {
            }
            z4 = z2;
            i8 = i2 & 512;
            if (i8 == 0) {
            }
            i9 = i2 & 1024;
            if (av8Var2.T(i6 & 1, (i6 & 306783379) == 306783378 || (((i9 == 0 ? (char) 6 : av8Var2.g(foVar) ? (char) 4 : (char) 2) | '0') & 19) != 18)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        p3eVar2 = p3eVar;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i3 | 12582912;
        i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i7 != 0) {
        }
        z4 = z2;
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        i9 = i2 & 1024;
        if (av8Var2.T(i6 & 1, (i6 & 306783379) == 306783378 || (((i9 == 0 ? (char) 6 : av8Var2.g(foVar) ? (char) 4 : (char) 2) | '0') & 19) != 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}
