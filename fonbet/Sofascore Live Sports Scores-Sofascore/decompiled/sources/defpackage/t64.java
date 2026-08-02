package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class t64 {
    public static final void a(final j64 j64Var, final Function0 function0, final Function1 function1, final Function1 function12, final Function0 function02, final Function0 function03, final Function1 function13, final Function1 function14, final Function0 function04, final Function1 function15, final Function1 function16, final Function0 function05, final Function1 function17, final Function2 function2, final Function0 function06, final Function1 function18, final Function1 function19, final Function1 function110, final Function1 function111, final Function0 function07, final Function0 function08, of3 of3Var, final int i) {
        int i2;
        Function1 function112;
        Function1 function113;
        Function0 function09;
        av8 av8Var;
        int i3;
        function0.getClass();
        function1.getClass();
        function12.getClass();
        function02.getClass();
        function03.getClass();
        function13.getClass();
        function14.getClass();
        function04.getClass();
        function15.getClass();
        function16.getClass();
        function05.getClass();
        function17.getClass();
        function2.getClass();
        function06.getClass();
        function18.getClass();
        function19.getClass();
        function110.getClass();
        function111.getClass();
        function07.getClass();
        function08.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-482369301);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var2.g(j64Var) : av8Var2.i(j64Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function112 = function1;
            i2 |= av8Var2.i(function112) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function112 = function1;
        }
        if ((i & 3072) == 0) {
            function113 = function12;
            i2 |= av8Var2.i(function113) ? a.o : 1024;
        } else {
            function113 = function12;
        }
        if ((i & 24576) == 0) {
            function09 = function02;
            i2 |= av8Var2.i(function09) ? 16384 : 8192;
        } else {
            function09 = function02;
        }
        int i4 = i & 196608;
        int i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i4 == 0) {
            i2 |= av8Var2.i(function03) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= av8Var2.i(function13) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= av8Var2.i(function14) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= av8Var2.i(function04) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= av8Var2.i(function15) ? 536870912 : 268435456;
        }
        int i6 = (av8Var2.i(function16) ? 4 : 2) | (av8Var2.i(function05) ? 32 : 16) | (av8Var2.i(function17) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function2) ? a.o : 1024) | (av8Var2.i(function06) ? 16384 : 8192);
        if (av8Var2.i(function18)) {
            i5 = 131072;
        }
        int i7 = i6 | i5 | (av8Var2.i(function19) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.i(function110) ? 8388608 : 4194304) | (av8Var2.i(function111) ? 67108864 : 33554432) | (av8Var2.i(function07) ? 536870912 : 268435456);
        char c = av8Var2.i(function08) ? (char) 4 : (char) 2;
        if (av8Var2.T(i2 & 1, ((i2 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            xtc d0 = l98.d0(lz.J(bkh.c, jaa.L(av8Var2), null), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && av8Var2.i(j64Var))) | ((c & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384) | ((i7 & 458752) == 131072) | ((i7 & 3670016) == 1048576) | ((i7 & 29360128) == 8388608) | ((i7 & 234881024) == 67108864) | ((i7 & 1879048192) == 536870912) | ((i2 & 1879048192) == 536870912) | ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i2 & 3670016) == 1048576) | ((i2 & 29360128) == 8388608) | ((i7 & 57344) == 16384) | ((i2 & 458752) == 131072) | ((i2 & 234881024) == 67108864);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                i3 = i7;
                final Function1 function114 = function112;
                final Function1 function115 = function113;
                final Function0 function010 = function09;
                Function1 function116 = new Function1() { // from class: p64
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        g0a g0aVar;
                        gv9 a;
                        xyf xyfVar = (xyf) obj;
                        xyfVar.getClass();
                        esa esaVar = xyfVar.a;
                        int i8 = 1;
                        esa.d(xyfVar, null, null, new tc3(-590627860, new r64(0, function0), true), 3);
                        j64 j64Var2 = j64.this;
                        boolean z2 = j64Var2.f;
                        g0a g0aVar2 = j64Var2.d;
                        if (z2) {
                            esa.d(xyfVar, null, null, new tc3(1338518215, new hl6(25, j64Var2, function08), true), 3);
                        }
                        fci fciVar = j64Var2.a;
                        if (fciVar != null) {
                            esa.d(xyfVar, null, null, new tc3(-1858568761, new er6(fciVar, function114, function115, function010, 14), true), 3);
                        }
                        svb svbVar = j64Var2.c;
                        if (svbVar != null) {
                            esa.d(xyfVar, null, null, new tc3(-1322111592, new s64(svbVar, function18, function19, function110, function111, function07, 0), true), 3);
                        }
                        if (j64Var2.b != null) {
                            esa.d(xyfVar, null, null, new tc3(-454705529, new ff7((Object) j64Var2, (Object) function15, (Object) function16, (Object) function05, (Object) function17, 4), true), 3);
                        }
                        if (j64Var2.e) {
                            esa.d(xyfVar, null, null, o02.b, 3);
                        }
                        if (g0aVar2 != null) {
                            boolean z3 = g0aVar2 instanceof e0a;
                            Function1 function117 = function13;
                            Function1 function118 = function14;
                            if (z3) {
                                e0a e0aVar = (e0a) g0aVar2;
                                function117.getClass();
                                function118.getClass();
                                Function0 function011 = function06;
                                function011.getClass();
                                esa.d(xyfVar, null, null, new tc3(1977518060, new y47(1, function118), true), 3);
                                gv9 gv9Var = e0aVar.a;
                                esaVar.a(gv9Var.size(), new wsd(7, new xt3(6), gv9Var), new uk1(11, gv9Var), new tc3(2039820996, new hs3(gv9Var, xyfVar, e0aVar, function117, 1), true));
                                esa.d(xyfVar, null, null, new tc3(6348003, new hl6(24, e0aVar, function011), true), 3);
                                g0aVar = g0aVar2;
                            } else {
                                g0aVar = g0aVar2;
                                if (g0aVar instanceof d0a) {
                                    d0a d0aVar = (d0a) g0aVar;
                                    gv9 gv9Var2 = d0aVar.a;
                                    CrowdsourcingContribution crowdsourcingContribution = d0aVar.b;
                                    gv9Var2.getClass();
                                    Function0 function012 = function03;
                                    function012.getClass();
                                    function117.getClass();
                                    function118.getClass();
                                    boolean z4 = !gv9Var2.isEmpty();
                                    boolean z5 = crowdsourcingContribution != null;
                                    esa.d(xyfVar, null, null, new tc3(160157785, new p34(utc.a, z4, z5, function012, function118), true), 3);
                                    esaVar.a(gv9Var2.size(), new zi(13, new q73(15), gv9Var2), new uk1(4, gv9Var2), new tc3(802480018, new q34(gv9Var2, function117, gv9Var2, z5), true));
                                    if (crowdsourcingContribution != null) {
                                        esa.d(xyfVar, null, null, new tc3(-1468313036, new kr1(crowdsourcingContribution, 25), true), 3);
                                    }
                                } else {
                                    if (!(g0aVar instanceof f0a)) {
                                        zzl.b();
                                        return null;
                                    }
                                    gv9 gv9Var3 = ((f0a) g0aVar).a;
                                    if (!gv9Var3.isEmpty()) {
                                        function117.getClass();
                                        esa.d(xyfVar, null, null, un0.h, 3);
                                        esaVar.a(gv9Var3.size(), new zi(14, new xt3(7), gv9Var3), new uk1(5, gv9Var3), new tc3(2039820996, new d93(gv9Var3, gv9Var3, function117, i8), true));
                                    }
                                }
                            }
                        } else {
                            g0aVar = g0aVar2;
                        }
                        if (Intrinsics.c((g0aVar == null || (a = g0aVar.a()) == null) ? null : Boolean.valueOf(!a.isEmpty()), Boolean.TRUE) || (g0aVar instanceof f0a)) {
                            esa.d(xyfVar, null, null, new tc3(-874940609, new r64(i8, function04), true), 3);
                        }
                        esa.d(xyfVar, null, null, o02.c, 3);
                        return Unit.a;
                    }
                };
                av8Var = av8Var2;
                av8Var.n0(function116);
                O = function116;
            } else {
                i3 = i7;
                av8Var = av8Var2;
            }
            q5a.o(function2, d0, null, null, (Function1) O, av8Var, ((i3 >> 6) & 112) | 6);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: q64
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    t64.a(j64.this, function0, function1, function12, function02, function03, function13, function14, function04, function15, function16, function05, function17, function2, function06, function18, function19, function110, function111, function07, function08, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }
}
