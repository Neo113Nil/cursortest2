package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class k44 {
    public static final void a(int i, of3 of3Var, xtc xtcVar, String str, Function0 function0, Function0 function02, boolean z, boolean z2) {
        av8 av8Var;
        boolean z3;
        long f;
        String str2 = str;
        str2.getClass();
        function0.getClass();
        function02.getClass();
        xtcVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(559464559);
        int i2 = (av8Var2.g(str2) ? 4 : 2) | i | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024);
        if ((i & 24576) == 0) {
            i2 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        int i3 = i2 | (av8Var2.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            xtc e = bkh.e(bkh.d(xtcVar, 1.0f), 68.0f);
            l8g a = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, e);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            nq8.h(av8Var2, new goa(1.0f, true));
            String v = oea.v(R.string.cancel, av8Var2);
            Locale locale = Locale.ROOT;
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            long D = lz.D(R.color.crowdsourcing, av8Var2);
            yf8 yf8Var = xth.a;
            dfj a2 = xth.a();
            utc utcVar = utc.a;
            xtc b0 = l98.b0(utcVar, 16.0f);
            boolean z4 = (i3 & 896) == 256;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z4 || O == a99Var) {
                O = new v61(9, function02);
                av8Var2.n0(O);
            }
            udj.c(upperCase, tol.y(b0, false, false, false, 0L, null, (Function0) O, av8Var2, 27), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, a2, av8Var2, 0, 0, 131064);
            nq8.h(av8Var2, bkh.p(utcVar, 16.0f));
            xtc q = n9e.q(bkh.e(bkh.p(utcVar, 85.0f), 36.0f), z2 ? ljg.f(av8Var2, -1771870996, R.color.crowdsourcing, av8Var2, false) : ljg.f(av8Var2, -1771870010, R.color.neutral_default, av8Var2, false), o7g.a(4.0f));
            boolean z5 = z2 && !z;
            boolean z6 = (i3 & 112) == 32;
            Object O2 = av8Var2.O();
            if (z6 || O2 == a99Var) {
                O2 = new v61(10, function0);
                av8Var2.n0(O2);
            }
            xtc y = tol.y(q, z5, false, false, 0L, null, (Function0) O2, av8Var2, 30);
            k1c c = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, y);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (z) {
                av8Var2.d0(1148271780);
                xtc l = bkh.l(utcVar, 24.0f);
                if (z2) {
                    z3 = false;
                    f = ljg.f(av8Var2, 1006876108, R.color.primary_default, av8Var2, false);
                } else {
                    z3 = false;
                    f = ljg.f(av8Var2, 1006876898, R.color.n_lv_3, av8Var2, false);
                }
                ncf.a(l, f, 2.0f, lz.D(R.color.primary_highlight, av8Var2), 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 390, 32);
                av8Var = av8Var2;
                av8Var.s(z3);
                str2 = str;
            } else {
                av8Var2.d0(1148627567);
                str2 = str;
                String upperCase2 = str2.toUpperCase(locale);
                upperCase2.getClass();
                udj.c(upperCase2, null, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.a(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                av8Var.s(false);
            }
            i.o(av8Var, true, utcVar, 16.0f, av8Var);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i44(i, xtcVar, str2, function0, function02, z, z2);
        }
    }

    public static final void b(final n44 n44Var, final r54 r54Var, final Function0 function0, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function2 function2, final Function1 function15, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function0 function07, final Function1 function16, of3 of3Var, final int i) {
        function0.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function2.getClass();
        function15.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        function07.getClass();
        function16.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2095043433);
        int i2 = i | (av8Var.g(n44Var) ? 4 : 2) | (av8Var.g(r54Var) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 2048 : 1024) | (av8Var.i(function12) ? 16384 : 8192) | (av8Var.i(function13) ? 131072 : 65536) | (av8Var.i(function14) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.i(function2) ? 8388608 : 4194304) | (av8Var.i(function15) ? 67108864 : 33554432) | (av8Var.i(function02) ? 536870912 : 268435456);
        int i3 = (av8Var.i(function03) ? (char) 4 : (char) 2) | (av8Var.i(function04) ? ' ' : (char) 16) | (av8Var.i(function05) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function06) ? (char) 2048 : (char) 1024) | (av8Var.i(function07) ? (char) 16384 : (char) 8192) | (av8Var.i(function16) ? (char) 0 : (char) 0);
        if (av8Var.T(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            final e1d e1dVar = (e1d) O;
            boolean z = ((i2 & 14) == 4) | ((i3 & 57344) == 16384) | ((i3 & 112) == 32);
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new mi(18, n44Var, function07, function04);
                av8Var.n0(O2);
            }
            tol.a(0, 1, av8Var, (Function0) O2, false);
            q5a.p(null, yqo.H(-365574875, av8Var, new e44(n44Var, function07, function04, e1dVar, r54Var, function0)), yqo.H(-2076247356, av8Var, new ace(n44Var, function06, function05, r54Var, 8)), null, null, 0, r13.h, 0L, null, yqo.H(347227706, av8Var, new ct8() { // from class: f44
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xtc f0;
                    p3e p3eVar = (p3e) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    p3eVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(p3eVar) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        n44 n44Var2 = n44.this;
                        boolean z2 = n44Var2 instanceof l44;
                        utc utcVar = utc.a;
                        if (z2) {
                            f0 = l98.a0(utcVar, p3eVar);
                        } else {
                            if (!(n44Var2 instanceof m44)) {
                                zzl.b();
                                return null;
                            }
                            f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, p3eVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        }
                        xtc xtcVar = f0;
                        Object O3 = av8Var2.O();
                        if (O3 == nf3.a) {
                            O3 = new q73(16);
                            av8Var2.n0(O3);
                        }
                        Function1 function17 = (Function1) O3;
                        final Function1 function18 = function1;
                        final Function1 function19 = function12;
                        final Function1 function110 = function13;
                        final Function1 function111 = function14;
                        final Function0 function08 = function02;
                        final Function0 function09 = function03;
                        final Function1 function112 = function15;
                        final Function2 function22 = function2;
                        final Function1 function113 = function16;
                        final e1d e1dVar2 = e1dVar;
                        l98.b(n44Var2, xtcVar, null, null, "AnimationContent", function17, yqo.H(-1725239985, av8Var2, new et8() { // from class: h44
                            @Override // defpackage.et8
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                k60 k60Var = (k60) obj4;
                                n44 n44Var3 = (n44) obj5;
                                of3 of3Var3 = (of3) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                k60Var.getClass();
                                n44Var3.getClass();
                                if (n44Var3 instanceof l44) {
                                    av8 av8Var3 = (av8) of3Var3;
                                    av8Var3.d0(1249327410);
                                    l44 l44Var = (l44) n44Var3;
                                    Object O4 = av8Var3.O();
                                    if (O4 == nf3.a) {
                                        O4 = new w30(16, e1dVar2);
                                        av8Var3.n0(O4);
                                    }
                                    k44.c(l44Var, Function1.this, function19, function110, function111, function08, function09, function112, (Function1) O4, av8Var3, ((intValue2 >> 3) & 14) | 100663296);
                                    av8Var3.s(false);
                                } else {
                                    if (!(n44Var3 instanceof m44)) {
                                        throw dmi.h((av8) of3Var3, -98247617, false);
                                    }
                                    av8 av8Var4 = (av8) of3Var3;
                                    av8Var4.d0(1249986501);
                                    k44.e(k60Var, (m44) n44Var3, function22, function113, av8Var4, intValue2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                    av8Var4.s(false);
                                }
                                return Unit.a;
                            }
                        }), av8Var2, 1794048, 12);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 806879664, 441);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(r54Var, function0, function1, function12, function13, function14, function2, function15, function02, function03, function04, function05, function06, function07, function16, i) { // from class: g44
                public final /* synthetic */ r54 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function2 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ Function0 n;
                public final /* synthetic */ Function0 o;
                public final /* synthetic */ Function1 p;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    k44.b(n44.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(l44 l44Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function1 function15, Function1 function16, of3 of3Var, int i) {
        int i2;
        Function1 function17;
        Function1 function18;
        int i3;
        String k;
        utc utcVar;
        String k2;
        Object obj;
        Function0 function03 = function02;
        gv9 gv9Var = l44Var.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1065535717);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(l44Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function13) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function14) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.i(function03) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var.i(function15) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= av8Var.i(function16) ? 67108864 : 33554432;
        }
        if (av8Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            qug o0 = hkg.o0(av8Var);
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            int i4 = i2;
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            g28 g28Var = bkh.c;
            boolean i5 = av8Var.i(context);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                i3 = 0;
                O2 = new d44(i3, e1dVar, context);
                av8Var.n0(O2);
            } else {
                i3 = 0;
            }
            xtc A = un0.A(g28Var, (Function1) O2);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var, av8Var, i3);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, A);
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
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            a34.a(l44Var.a, null, o0.a.h(), function16, av8Var, (i4 >> 15) & 7168);
            utc utcVar2 = utc.a;
            xtc x = gz8.x(bkh.b(hkg.u0(utcVar2, o0, false, 14).z(g28Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((p75) e1dVar.getValue()).a, 1), null, null, 3);
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, x);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            if (l44Var.b == null) {
                av8Var.d0(-1632079878);
                av8Var.s(false);
                utcVar = utcVar2;
            } else {
                av8Var.d0(-1632079877);
                CrowdsourcingIncidentType crowdsourcingIncidentType = ((i2h) CollectionsKt.Y(gv9Var)).a;
                if (crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Card) {
                    k = ljg.k(av8Var, -1419643538, R.string.select_team, av8Var, false);
                } else {
                    if (!(crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Goal)) {
                        throw dmi.h(av8Var, -1419646958, false);
                    }
                    k = ljg.k(av8Var, -1419640222, R.string.crowdsourcing_which_team_scored, av8Var, false);
                }
                String str = k;
                utcVar = utcVar2;
                z1a.c(str, l44Var.b, function1, bkh.d(l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), av8Var, ((i4 << 3) & 896) | 3072);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            int i6 = i4 >> 3;
            function18 = function12;
            e2h.b((i6 & 112) | 384, av8Var, bkh.d(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), gv9Var, function18);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            CrowdsourcingIncidentType crowdsourcingIncidentType2 = ((i2h) CollectionsKt.Y(gv9Var)).a;
            if (crowdsourcingIncidentType2 instanceof CrowdsourcingIncidentType.Card) {
                k2 = ljg.k(av8Var, 1055768134, R.string.crowdsourcing_card_time, av8Var, false);
            } else {
                if (!(crowdsourcingIncidentType2 instanceof CrowdsourcingIncidentType.Goal)) {
                    throw dmi.h(av8Var, 1055764822, false);
                }
                k2 = ljg.k(av8Var, 1055771686, R.string.crowdsourcing_goal_time, av8Var, false);
            }
            b0a.h(k2, l44Var.d, function13, function14, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, (i6 & 896) | 24576 | (i6 & 7168));
            av8Var = av8Var;
            if (l44Var.i) {
                bf3.r(8.0f, -1630422276, av8Var, av8Var, utcVar);
                kxe kxeVar = l44Var.g;
                String v = oea.v(l44Var.e, av8Var);
                boolean z = l44Var.f;
                xtc q = n9e.q(bkh.d(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                boolean i7 = av8Var.i(l44Var) | ((i4 & 29360128) == 8388608);
                Object O3 = av8Var.O();
                if (i7 || O3 == a99Var) {
                    function17 = function15;
                    O3 = new ix1(28, l44Var, function17);
                    av8Var.n0(O3);
                } else {
                    function17 = function15;
                }
                nq8.f(kxeVar, v, z, (Function0) O3, function0, q, av8Var, i6 & 57344);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                Iterator<E> it = gv9Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((i2h) obj).a == CrowdsourcingIncidentType.Goal.REGULAR) {
                            break;
                        }
                    }
                }
                i2h i2hVar = (i2h) obj;
                function03 = function02;
                fz8.b(x23.a, Intrinsics.c(i2hVar != null ? Boolean.valueOf(i2hVar.b) : null, Boolean.TRUE), null, null, null, null, yqo.H(-942357180, av8Var, new d67(12, (Object) l44Var, (Object) function03, function17)), av8Var, 1572870, 30);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                function03 = function02;
                function17 = function15;
                av8Var.d0(-1628587727);
                av8Var.s(false);
            }
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            function17 = function15;
            function18 = function12;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qc3(l44Var, function1, function18, function13, function14, function0, function03, function17, function16, i);
        }
    }

    public static final void d(m44 m44Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        int i3;
        int i4;
        a64 a64Var = m44Var.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(329140328);
        int i5 = i | (av8Var.i(m44Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            xtc b0 = l98.b0(yso.o(xtcVar, 1.0f, lz.D(R.color.n_lv_5, av8Var), o7g.a(8.0f)), 16.0f);
            u23 a = t23.a(new ng0(16.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            boolean z = m44Var.g;
            int ordinal = a64Var.ordinal();
            if (ordinal == 0) {
                i2 = z ? R.string.crowdsourcing_no_scorer_on_squad_list : R.string.crowdsourcing_no_scorer_empty_squad_list;
            } else if (ordinal == 1) {
                i2 = z ? R.string.crowdsourcing_no_assistant_on_squad_list : R.string.crowdsourcing_no_assistant_empty_squad_list;
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                i2 = z ? R.string.crowdsourcing_no_carded_player_on_squad_list : R.string.crowdsourcing_no_carded_player_empty_squad_list;
            }
            String v = oea.v(i2, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, d, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 130040);
            scj scjVar = m44Var.e;
            String str = m44Var.f;
            boolean z2 = str != null;
            long D = lz.D(R.color.surface_2, av8Var);
            long D2 = lz.D(R.color.crowdsourcing, av8Var);
            int ordinal2 = a64Var.ordinal();
            if (ordinal2 == 0) {
                i3 = 2;
                i4 = R.string.crowdsourcing_scorers_name_field;
            } else if (ordinal2 != 1) {
                i3 = 2;
                if (ordinal2 != 2) {
                    zzl.b();
                    return;
                }
                i4 = R.string.crowdsourcing_carded_players_name_field;
            } else {
                i3 = 2;
                i4 = R.string.crowdsourcing_assist_provider_name_field;
            }
            int i6 = i3;
            q5a.s(scjVar, null, null, null, oea.v(i4, av8Var), z2, str, null, D, D2, 0, 2, null, 0, false, false, av8Var, 0, 1572864, 3054782);
            String v2 = oea.v(R.string.submit, av8Var);
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean z3 = m44Var.e.c().c.length() > i6 && m44Var.f == null;
            boolean i7 = ((i5 & 112) == 32) | av8Var.i(m44Var);
            Object O = av8Var.O();
            if (i7 || O == nf3.a) {
                O = new ix1(27, function1, m44Var);
                av8Var.n0(O);
            }
            mha.h(v2, (Function0) O, d2, iqh.a, null, z3, false, false, 0L, 0, 0, av8Var, 3456, 0, 2000);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(m44Var, function1, xtcVar, i, 17);
        }
    }

    public static final void e(k60 k60Var, m44 m44Var, Function2 function2, Function1 function1, of3 of3Var, int i) {
        int i2;
        r70 r70Var = k60Var.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-283387778);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(k60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(m44Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function1) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc d0 = l98.d0(n9e.q(bkh.d(ml4.Y(utc.a), 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z = r70Var.a().a.w() == ((eoh) r70Var.a().d).getValue();
            i4k h0 = s02.h0(200, 0, null, 6);
            q4k q4kVar = uo5.a;
            fz8.e(z, d0, uo5.n(h0, s84.r), null, null, yqo.H(583255206, av8Var, new d67(13, (Object) m44Var, (Object) function2, (Object) function1)), av8Var, 196992, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(k60Var, m44Var, function2, function1, i, 7);
        }
    }

    public static final void f(Function0 function0, xtc xtcVar, w8l w8lVar, ImageVector imageVector, tc3 tc3Var, of3 of3Var, int i) {
        w8l w8lVar2;
        ImageVector imageVector2;
        w8l a;
        ImageVector N;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1675962793);
        int i2 = i | (av8Var.i(function0) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16) | 1152;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                a = alj.a(av8Var);
                N = s6a.N(R.drawable.ic_arrow_back, 6, av8Var);
            } else {
                av8Var.W();
                a = w8lVar;
                N = imageVector;
            }
            av8Var.t();
            ImageVector imageVector3 = N;
            uni.a(bkh.d(xtcVar, 1.0f), null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(49045148, av8Var, new ace(a, function0, N, tc3Var)), av8Var, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            w8lVar2 = a;
            imageVector2 = imageVector3;
        } else {
            av8Var.W();
            w8lVar2 = w8lVar;
            imageVector2 = imageVector;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(function0, xtcVar, w8lVar2, imageVector2, tc3Var, i, 4);
        }
    }

    public static final void g(String str, boolean z, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(740294451);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            l8g a = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
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
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, i2 & 14, 0, 131066);
            av8Var = av8Var;
            if (z) {
                av8Var.d0(-688198427);
                nq8.h(av8Var, new goa(1.0f, true));
                d7e t = haa.t(R.drawable.ic_delete, 0, av8Var);
                xtc l = bkh.l(utcVar, 20.0f);
                boolean z2 = (i2 & 896) == 256;
                Object O = av8Var.O();
                if (z2 || O == nf3.a) {
                    O = new v61(11, function0);
                    av8Var.n0(O);
                }
                kq9.a(t, null, tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var, 29), lz.D(R.color.n_lv_1, av8Var), av8Var, 56, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-687785197);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(str, z, function0, i, 2);
        }
    }

    public static final void h(m44 m44Var, boolean z, a64 a64Var, of3 of3Var, int i) {
        String k;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1732176166);
        int i2 = i | (av8Var.i(m44Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.e(a64Var.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i3 = 1;
        if (!av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.W();
        } else if (z) {
            av8Var.d0(772063227);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new ce8();
                av8Var.n0(O);
            }
            ce8 ce8Var = (ce8) O;
            Unit unit = Unit.a;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new j44(ce8Var, null, i3);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, unit, (Function2) O2);
            uaa.e(m44Var.b, oea.v(R.string.search_field, av8Var), l98.d0(bkh.d(lz.G(utc.a, ce8Var), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), false, av8Var, 0, 24);
            av8Var.s(false);
        } else {
            av8Var.d0(772599124);
            int ordinal = a64Var.ordinal();
            if (ordinal == 0) {
                k = ljg.k(av8Var, 1826040604, R.string.crowdsourcing_scorer, av8Var, false);
            } else if (ordinal == 1) {
                k = ljg.k(av8Var, 1826044407, R.string.football_assist, av8Var, false);
            } else {
                if (ordinal != 2) {
                    throw dmi.h(av8Var, 1826038555, false);
                }
                k = ljg.k(av8Var, 1826048275, R.string.crowdsourcing_carded_player, av8Var, false);
            }
            String str = k;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(m44Var, z, a64Var, i, 3);
        }
    }
}
