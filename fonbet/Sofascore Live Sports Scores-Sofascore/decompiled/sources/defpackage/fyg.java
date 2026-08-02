package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class fyg {
    public static final float a = 32.0f + 8.0f;
    public static final List b = b.j(new o6f(12994, "L. Messi", "Messi", PlayerKt.CRICKET_ALLROUNDER), new o6f(36, "L. Modrić", "Modrić", "HR"), new o6f(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, "C. Ronaldo", "Ronaldo", "PT"), new o6f(909, "K. Mbappé", "Mbappé", "FR"));

    public static final void a(e73 e73Var, String str, int i, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        boolean z;
        String str2;
        boolean z2;
        final long j;
        a99 a99Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1224827251);
        int i5 = i2 | (av8Var.e(e73Var.ordinal()) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024);
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z3 = i >= 4;
            boolean z4 = e73Var == e73.a || wyh.e(str);
            String v = oea.v((z3 && z4) ? R.string.comparison_max_players_added : z3 ? R.string.comparison_max_teams_added : z4 ? R.string.comparison_add_player : R.string.comparison_add_team, av8Var);
            if (z3) {
                i3 = 237970915;
                i4 = R.color.on_color_secondary;
            } else {
                i3 = 237971617;
                i4 = R.color.on_color_primary;
            }
            long f = ljg.f(av8Var, i3, i4, av8Var, false);
            av8Var.d0(237978512);
            xtc o = yso.o(xtcVar, 1.5f, f, o7g.a(20.0f));
            a99 a99Var2 = nf3.a;
            if (z3) {
                z = z3;
                str2 = v;
                z2 = false;
                j = f;
                a99Var = a99Var2;
            } else {
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                if (O == a99Var2) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                z = z3;
                Object[] objArr = new Object[0];
                Object O2 = av8Var.O();
                if (O2 == a99Var2) {
                    O2 = mce.t;
                    av8Var.n0(O2);
                }
                str2 = v;
                a99Var = a99Var2;
                j = f;
                z2 = false;
                xtc y = tol.y(utc.a, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 29), av8Var, 0);
                av8Var = av8Var;
                o = o.z(y);
            }
            av8Var.s(z2);
            xtc c0 = l98.c0(o, 12.0f, 4.0f);
            l8g a2 = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
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
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new vqg(24);
                av8Var.n0(O3);
            }
            av8 av8Var2 = av8Var;
            l98.b(str2, null, (Function1) O3, null, "AddSlotButtonLabel", null, yqo.H(637637285, av8Var, new et8() { // from class: vxg
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    String str3 = (String) obj2;
                    int intValue = ((Integer) obj4).intValue();
                    ((k60) obj).getClass();
                    str3.getClass();
                    yf8 yf8Var = xth.a;
                    dfj b2 = xth.b();
                    udj.c(str3, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, (of3) obj3, (intValue >> 3) & 14, 0, 131066);
                    return Unit.a;
                }
            }), av8Var2, 1597824, 42);
            av8Var = av8Var2;
            fz8.d(!z, null, uo5.e(null, 3).a(uo5.a()), uo5.f(null, 3).a(uo5.i()), null, s9a.e, av8Var, 1600518, 18);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(e73Var, str, i, function0, xtcVar, i2);
        }
    }

    public static final void b(gyg gygVar, Function1 function1, xtc xtcVar, Function0 function0, of3 of3Var, int i) {
        xtc xtcVar2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-935336174);
        Function1 function12 = function1;
        int i2 = i | (av8Var.g(gygVar) ? 4 : 2) | (av8Var.i(function12) ? 32 : 16) | 384;
        boolean z4 = false;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            List H0 = CollectionsKt.H0(gygVar.d.entrySet(), new laf(16));
            int size = H0.size();
            boolean z5 = size > 2;
            if (size > 2) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            boolean z6 = size >= 4 ? true : z;
            boolean z7 = size >= 4 ? true : z;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 12.0f, 12.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
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
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1927629708);
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                e93 e93Var = (e93) entry.getKey();
                i73 i73Var = (i73) entry.getValue();
                n4 n4Var = i73Var.a;
                av8Var.a0(-765124806, n4Var != null ? Integer.valueOf(n4Var.b) : e93Var);
                String str2 = gygVar.b;
                int i3 = size;
                if (size >= 4) {
                    str = str2;
                    z2 = z6;
                    z3 = true;
                } else {
                    str = str2;
                    z2 = z6;
                    z3 = false;
                }
                e(i73Var, e93Var, str, function12, z5, z4, z2, z7, z3, function0, new goa(1.0f, true), av8Var, ((i2 << 6) & 7168) | 805306368);
                av8Var.s(false);
                function12 = function1;
                it = it;
                z6 = z2;
                size = i3;
                utcVar = utcVar;
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(gygVar, function1, xtcVar2, function0, i, 10);
        }
    }

    public static final void c(final n4 n4Var, final String str, final int i, final Integer num, final boolean z, final float f, final Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, final int i2) {
        int i3;
        final xtc xtcVar2;
        utc utcVar;
        r13 r13Var;
        boolean z2;
        final Function0 function03 = function02;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1517341894);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(n4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(num) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.d(f) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var.i(function03) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
            utc utcVar2 = utc.a;
            xtc d = bkh.d(utcVar2, 1.0f);
            l8g a2 = k8g.a(new ng0(f, true, new l1(uxf.p, 5)), uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            mv1 mv1Var = uxf.i;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mce.u;
                av8Var.n0(O2);
            }
            xtc y = tol.y(utcVar2, true, false, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 0), av8Var, 0);
            av8 av8Var2 = av8Var;
            k1c c = e12.c(mv1Var, false);
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
            if (n4Var instanceof y63) {
                av8Var2.d0(-1046287249);
                utcVar = utcVar2;
                td4.C(((y63) n4Var).b, bkh.l(utcVar2, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            } else {
                utcVar = utcVar2;
                if (n4Var instanceof z63) {
                    av8Var2.d0(-1046036428);
                    if (wyh.e(str)) {
                        av8Var2.d0(-1045975079);
                        td4.J(((z63) n4Var).b, 48, av8Var2, bkh.l(utcVar, 40.0f));
                        z2 = false;
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1045765984);
                        td4.G(((z63) n4Var).b, bkh.l(utcVar, 40.0f), false, 0L, av8Var2, 48, 12);
                        av8Var2 = av8Var2;
                        z2 = false;
                        av8Var2.s(false);
                    }
                    av8Var2.s(z2);
                } else {
                    if (n4Var != null) {
                        throw dmi.h(av8Var2, 658983851, false);
                    }
                    av8Var2.d0(-1045500097);
                    ImageVector N = s6a.N(i, ((i4 >> 3) & 112) | 6, av8Var2);
                    if (num == null) {
                        av8Var2.d0(-1045309076);
                        av8Var2.s(false);
                        r13Var = null;
                    } else {
                        r13Var = new r13(wv8.b(av8Var2, -1045309075, num, av8Var2, false));
                    }
                    kq9.b(N, null, bkh.l(utcVar, 40.0f), r13Var != null ? r13Var.a : r13.i, av8Var2, 432, 0);
                    av8Var2 = av8Var2;
                    av8Var2.s(false);
                }
            }
            if ((n4Var != null ? (String) n4Var.e : null) != null) {
                av8Var2.d0(-1045095113);
                td4.k((String) n4Var.e, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 48, 12);
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1044926938);
                av8Var2.s(false);
            }
            av8Var2.s(true);
            function03 = function02;
            av8 av8Var3 = av8Var2;
            fz8.d(z, null, uo5.e(null, 3).a(uo5.a()), uo5.f(null, 3).a(uo5.i()), null, yqo.H(1220155146, av8Var2, new r64(7, function03)), av8Var3, 1600518 | ((i4 >> 9) & 112), 18);
            av8Var = av8Var3;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: yxg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fyg.c(n4.this, str, i, num, z, f, function0, function03, xtcVar2, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, of3 of3Var, xtc xtcVar, String str, String str2, Function0 function0, Function0 function02, final boolean z) {
        int i2;
        String str3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-113200112);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= av8Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var.g(xtcVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            xtcVar2 = xtcVar;
        }
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = str == null;
            xtc B = wnn.B(xtcVar2);
            int i3 = i2 & 7168;
            boolean z3 = i3 == 2048;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z3 || O == a99Var) {
                O = new r64(8, function0);
                av8Var.n0(O);
            }
            xtc f0 = l98.f0(s9a.A(B, (ct8) O), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z4 = i3 == 2048;
            Object O2 = av8Var.O();
            if (z4 || O2 == a99Var) {
                O2 = new ma0(17, function0);
                av8Var.n0(O2);
            }
            final boolean z5 = z2;
            xtc d0 = l98.d0(tol.y(n9e.q(yso.o(bkh.e(s02.M(f0, (Function1) O2), 32.0f), 1.0f, lz.D(R.color.on_color_highlight_1, av8Var), o7g.a(8.0f)), lz.D(R.color.on_color_highlight_2, av8Var), o7g.a(8.0f)), false, false, false, lz.D(R.color.neutral_default, av8Var), null, function02, av8Var, 23), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String str4 = str == null ? str3 : str;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new vqg(25);
                av8Var.n0(O3);
            }
            l98.b(str4, goaVar, (Function1) O3, null, "EntityNameCardText", null, yqo.H(-1136219874, av8Var, new et8() { // from class: zxg
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    av8 av8Var2;
                    int i4;
                    int i5;
                    String str5 = (String) obj2;
                    of3 of3Var2 = (of3) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((k60) obj).getClass();
                    str5.getClass();
                    yf8 yf8Var = xth.a;
                    dfj e = xth.e();
                    if (z5) {
                        av8Var2 = (av8) of3Var2;
                        i4 = R.color.on_color_secondary;
                        i5 = -985600882;
                    } else {
                        av8Var2 = (av8) of3Var2;
                        i4 = R.color.on_color_primary;
                        i5 = -985600180;
                    }
                    udj.c(str5, null, ljg.f(av8Var2, i5, i4, av8Var2, false), null, 0L, null, 0L, null, new p7j(z ? 3 : 5), 0L, 2, false, 1, 0, null, e, of3Var2, (intValue >> 3) & 14, 24960, 109562);
                    return Unit.a;
                }
            }), av8Var, 1597824, 40);
            av8Var = av8Var;
            fz8.d(!z, null, uo5.e(null, 3).a(uo5.a()), uo5.f(null, 3).a(uo5.i()), null, yqo.H(19333452, av8Var, new cv5(z5, 7)), av8Var, 1600518, 18);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(str, str3, z, function0, function02, xtcVar2, i, 8);
        }
    }

    public static final void e(final i73 i73Var, final e93 e93Var, final String str, final Function1 function1, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Function0 function0, final xtc xtcVar, of3 of3Var, final int i) {
        int i2;
        String str2;
        String str3;
        boolean z6;
        String a2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1256756849);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(i73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.e(e93Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function1) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.h(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i2 |= av8Var.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= av8Var.h(z4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= av8Var.h(z5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= av8Var.i(function0) ? 536870912 : 268435456;
        }
        if (av8Var.T(i2 & 1, ((i2 & 306783379) == 306783378 && ((av8Var.g(xtcVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            u23 a3 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            n4 n4Var = i73Var.a;
            int i3 = i73Var.c;
            Integer num = i73Var.d;
            float f = z5 ? 2.0f : 8.0f;
            int i4 = i2 & 7168;
            int i5 = i2 & 112;
            boolean z7 = (i5 == 32) | ((i2 & 14) == 4) | (i4 == 2048);
            Object O = av8Var.O();
            int i6 = i2;
            a99 a99Var = nf3.a;
            if (z7 || O == a99Var) {
                O = new l97(i73Var, function1, e93Var);
                av8Var.n0(O);
            }
            Function0 function02 = (Function0) O;
            boolean z8 = (i5 == 32) | (i4 == 2048);
            Object O2 = av8Var.O();
            if (z8 || O2 == a99Var) {
                final int i7 = 0;
                O2 = new Function0() { // from class: wxg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                function1.invoke(new ixg(e93Var));
                                break;
                            case 1:
                                function1.invoke(new exg(e93Var));
                                break;
                            default:
                                function1.invoke(new jxg(e93Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            c(n4Var, str, i3, num, z, f, function02, (Function0) O2, null, av8Var, ((i6 >> 3) & 112) | (i6 & 57344));
            n4 n4Var2 = i73Var.a;
            if (z2) {
                if (n4Var2 != null) {
                    str2 = (String) n4Var2.d;
                    str3 = str2;
                }
                str3 = null;
            } else {
                if (n4Var2 != null) {
                    str2 = (String) n4Var2.c;
                    str3 = str2;
                }
                str3 = null;
            }
            String a4 = i73Var.b.a(av8Var);
            boolean z9 = (i4 == 2048) | (i5 == 32);
            Object O3 = av8Var.O();
            if (z9 || O3 == a99Var) {
                final int i8 = 1;
                O3 = new Function0() { // from class: wxg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                function1.invoke(new ixg(e93Var));
                                break;
                            case 1:
                                function1.invoke(new exg(e93Var));
                                break;
                            default:
                                function1.invoke(new jxg(e93Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O3);
            }
            utc utcVar = utc.a;
            d(((i6 >> 18) & 7168) | ((i6 >> 12) & 896) | 196608, av8Var, bkh.d(utcVar, 1.0f), str3, a4, function0, (Function0) O3, z3);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            Integer num2 = i73Var.e;
            r9k r9kVar = i73Var.f;
            if (r9kVar == null) {
                av8Var.d0(1831703070);
                z6 = false;
                av8Var.s(false);
                a2 = null;
            } else {
                z6 = false;
                av8Var.d0(-772196797);
                a2 = r9kVar.a(av8Var);
                av8Var.s(false);
            }
            boolean z10 = z6;
            boolean z11 = i73Var.g;
            boolean z12 = !z4;
            boolean z13 = i4 == 2048 ? true : z10;
            if (i5 == 32) {
                z10 = true;
            }
            boolean z14 = z13 | z10;
            Object O4 = av8Var.O();
            if (z14 || O4 == a99Var) {
                final int i9 = 2;
                O4 = new Function0() { // from class: wxg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                function1.invoke(new ixg(e93Var));
                                break;
                            case 1:
                                function1.invoke(new exg(e93Var));
                                break;
                            default:
                                function1.invoke(new jxg(e93Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O4);
            }
            h(num2, a2, z11, z12, (Function0) O4, bkh.d(utcVar, 1.0f), av8Var, 196608);
            fz8.b(x23.a, !i73Var.h.isEmpty(), null, null, null, null, yqo.H(-86214271, av8Var, new zya(7, i73Var, function1, e93Var)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: xxg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fyg.e(i73.this, e93Var, str, function1, z, z2, z3, z4, z5, function0, xtcVar, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(vnb vnbVar, final Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1733331444);
        int i2 = i | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            final float H0 = ((kx4) av8Var.k(dh3.h)).H0(a);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O);
            }
            final xnh xnhVar = (xnh) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new e6g(xnhVar, 12);
                av8Var.n0(O2);
            }
            final Function0 function0 = (Function0) O2;
            boolean d = av8Var.d(H0);
            Object O3 = av8Var.O();
            if (d || O3 == a99Var) {
                O3 = new eyg(H0, xnhVar);
                av8Var.n0(O3);
            }
            final eyg eygVar = (eyg) O3;
            ktm.t(vnbVar, bkh.c, false, null, null, yqo.H(-1246996813, av8Var, new ct8() { // from class: byg
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ksa ksaVar;
                    n4 n4Var;
                    gyg gygVar = (gyg) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    gygVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(gygVar) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        ksa a2 = msa.a(0, 0, av8Var2, 0, 3);
                        Boolean valueOf = Boolean.valueOf(a2.j.b());
                        float f = H0;
                        Float valueOf2 = Float.valueOf(f);
                        boolean g = av8Var2.g(a2) | av8Var2.d(f);
                        Object O4 = av8Var2.O();
                        a99 a99Var2 = nf3.a;
                        rq3 rq3Var = null;
                        if (g || O4 == a99Var2) {
                            pv2 pv2Var = new pv2(a2, f, xnhVar, rq3Var, 3);
                            ksaVar = a2;
                            av8Var2.n0(pv2Var);
                            O4 = pv2Var;
                        } else {
                            ksaVar = a2;
                        }
                        hz8.q(valueOf, valueOf2, (Function2) O4, av8Var2);
                        utc utcVar = utc.a;
                        xtc J = lz.J(utcVar, eygVar, null);
                        u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, J);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a3, hf3.g);
                        waa.K(av8Var2, m, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C, hf3.d);
                        Object O5 = av8Var2.O();
                        if (O5 == a99Var2) {
                            O5 = e.f(null);
                            av8Var2.n0(O5);
                        }
                        e1d e1dVar = (e1d) O5;
                        i73 i73Var = (i73) gygVar.d.get(e93.a);
                        String str = (i73Var == null || (n4Var = i73Var.a) == null) ? null : (String) n4Var.f;
                        boolean g2 = av8Var2.g(str);
                        Object O6 = av8Var2.O();
                        if (g2 || O6 == a99Var2) {
                            O6 = new m1f(str, e1dVar, rq3Var, 13);
                            av8Var2.n0(O6);
                        }
                        hz8.o(av8Var2, str, (Function2) O6);
                        String str2 = (String) e1dVar.getValue();
                        Function1 function12 = function1;
                        l93.a(str2, null, yqo.H(1515218442, av8Var2, new wbc(gygVar, function12, function0)), av8Var2, 384);
                        boolean z = !gygVar.g.isEmpty();
                        tc3 H = yqo.H(-1050419419, av8Var2, new yya(24, (Object) gygVar, function12));
                        x23 x23Var = x23.a;
                        fz8.b(x23Var, z, null, null, null, null, H, av8Var2, 1572870, 30);
                        gv9<l83> gv9Var = gygVar.f;
                        boolean g3 = av8Var2.g(gv9Var);
                        Object O7 = av8Var2.O();
                        Object obj4 = O7;
                        if (g3 || O7 == a99Var2) {
                            ArrayList arrayList = new ArrayList(gv9Var.size());
                            String str3 = "root";
                            int i3 = 0;
                            int i4 = 0;
                            for (l83 l83Var : gv9Var) {
                                if (l83Var instanceof e83) {
                                    i3++;
                                    String str4 = "header_" + i3 + "_" + ((e83) l83Var).a.hashCode();
                                    arrayList.add(str4);
                                    str3 = str4;
                                    i4 = 0;
                                } else if (l83Var instanceof b83) {
                                    i4++;
                                    arrayList.add(((Object) str3) + "_comparable_" + ((b83) l83Var).a.hashCode());
                                } else {
                                    i4++;
                                    arrayList.add(((Object) str3) + "_" + duf.a.getOrCreateKotlinClass(l83Var.getClass()).getSimpleName() + "_" + i4);
                                }
                            }
                            av8Var2.n0(arrayList);
                            obj4 = arrayList;
                        }
                        List list = (List) obj4;
                        WeakHashMap weakHashMap = cal.w;
                        t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xw3.s(qea.p(av8Var2).e, av8Var2).a() + 48.0f, 7);
                        xtc a4 = x23Var.a(1.0f, bkh.d(utcVar, 1.0f), true);
                        boolean i5 = av8Var2.i(gv9Var) | av8Var2.i(list) | av8Var2.g(function12);
                        Object O8 = av8Var2.O();
                        if (i5 || O8 == a99Var2) {
                            O8 = new vsc(14, gv9Var, list, function12);
                            av8Var2.n0(O8);
                        }
                        v8a.a(a4, ksaVar, C2, null, null, null, false, null, (Function1) O8, av8Var2, 0, PglCryptUtils.BASE64_FAILED);
                        av8Var2.s(true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, (i2 & 14) | 196608, 28);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i, 25, vnbVar, xtcVar2, function1);
        }
    }

    public static final void g(pyg pygVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1931280009);
        int i2 = (av8Var.i(pygVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Activity activity = (Activity) av8Var.k(ngb.a);
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(pygVar.f, av8Var, 0);
            hof hofVar = pygVar.h;
            boolean i3 = av8Var.i(context) | av8Var.g(x);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i3 || O == a99Var) {
                O = new aaf(14, context, x);
                av8Var.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
            vnb vnbVar = (vnb) x.getValue();
            boolean i4 = av8Var.i(activity) | av8Var.i(context) | av8Var.i(pygVar);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new vsc(15, activity, context, pygVar);
                av8Var.n0(O2);
            }
            f(vnbVar, (Function1) O2, null, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(pygVar, i, 2);
        }
    }

    public static final void h(Integer num, String str, boolean z, boolean z2, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        boolean z3;
        boolean z4;
        float f;
        lv1 lv1Var = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1194159541);
        int i2 = i | (av8Var.g(num) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 74899) != 74898)) {
            utc utcVar = utc.a;
            if (num == null && str == null) {
                av8Var.d0(10017211);
                xtc d0 = l98.d0(n9e.q(yso.o(bkh.e(xtcVar, 32.0f), 1.0f, lz.D(R.color.on_color_highlight_1, av8Var), o7g.a(8.0f)), lz.D(R.color.on_color_highlight_2, av8Var), o7g.a(8.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d0);
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
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                kq9.b(s6a.N(R.drawable.cup_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 20.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
                yf8 yf8Var = xth.a;
                udj.c("-", null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 6, 0, 131066);
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(7624848);
                xtc q = n9e.q(yso.o(bkh.e(xtcVar, 32.0f), 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(8.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(8.0f));
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = mce.w;
                    av8Var.n0(O2);
                }
                xtc f0 = l98.f0(tol.y(q, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 2), av8Var, 0), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2 ? 0.0f : 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                l8g a3 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                if (z) {
                    av8Var.d0(-1185548143);
                    kq9.b(s6a.N(R.drawable.cup_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 20.0f), lz.D(R.color.value, av8Var), av8Var, 432, 0);
                    av8Var.s(false);
                    z3 = false;
                    z4 = true;
                    f = 1.0f;
                } else if (num != null) {
                    av8Var.d0(-1185240344);
                    z3 = false;
                    z4 = true;
                    f = 1.0f;
                    td4.y(num.intValue(), (i2 & 14) | 48, 12, av8Var, bkh.l(utcVar, 20.0f), null, false);
                    av8Var.s(false);
                } else {
                    z3 = false;
                    z4 = true;
                    f = 1.0f;
                    av8Var.d0(-1185073130);
                    av8Var.s(false);
                }
                String str2 = str == null ? "" : str;
                yf8 yf8Var2 = xth.a;
                dfj g = xth.g();
                long D2 = lz.D(R.color.n_lv_1, av8Var);
                if (f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                boolean z5 = z3;
                if (f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                udj.c(str2, new goa(f, z4), D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, g, av8Var, 0, 24960, 110584);
                fz8.d(z2, null, uo5.e(null, 3).a(uo5.a()), uo5.f(null, 3).a(uo5.i()), null, s9a.f, av8Var, ((i2 >> 6) & 112) | 1600518, 18);
                av8Var = av8Var;
                av8Var.s(z4);
                av8Var.s(z5);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t51(num, str, z, z2, function0, xtcVar, i);
        }
    }

    public static final void i(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, String str, Function1 function1) {
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-649170026);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var.d0(-1082130355);
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                l73 l73Var = (l73) it.next();
                arrayList.add(new oxh(l73Var.a, l73Var.b.a(av8Var), null, null, null, false, 252));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it2 = W.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.c(((oxh) obj).a, str)) {
                        break;
                    }
                }
            }
            r4a.j(W, (oxh) obj, function1, xtcVar, txh.i, false, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i2 & 896) | 12610560, 864);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new al1(gv9Var, str, function1, xtcVar, i, 3);
        }
    }

    public static final boolean j(l83 l83Var) {
        if ((l83Var instanceof e83) || (l83Var instanceof j83) || (l83Var instanceof f83) || (l83Var instanceof a83) || (l83Var instanceof c83) || (l83Var instanceof g83)) {
            return true;
        }
        if ((l83Var instanceof b83) || (l83Var instanceof h83) || (l83Var instanceof d83)) {
            return false;
        }
        zzl.b();
        return false;
    }
}
