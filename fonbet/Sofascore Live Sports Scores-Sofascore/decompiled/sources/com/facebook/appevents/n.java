package com.facebook.appevents;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.appevents.n;
import com.facebook.internal.k0;
import com.facebook.w;
import com.google.protobuf.GeneratedMessageLite;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.a4;
import com.moloco.sdk.z3;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a99;
import defpackage.av8;
import defpackage.bkh;
import defpackage.bl9;
import defpackage.c7a;
import defpackage.cth;
import defpackage.cw3;
import defpackage.dh3;
import defpackage.e12;
import defpackage.e1d;
import defpackage.eh3;
import defpackage.ema;
import defpackage.eqf;
import defpackage.f50;
import defpackage.fdl;
import defpackage.ff3;
import defpackage.ff5;
import defpackage.ft2;
import defpackage.fze;
import defpackage.g12;
import defpackage.g28;
import defpackage.g6b;
import defpackage.gze;
import defpackage.h21;
import defpackage.hf3;
import defpackage.hj7;
import defpackage.hoi;
import defpackage.hsk;
import defpackage.hz8;
import defpackage.if3;
import defpackage.j92;
import defpackage.k8g;
import defpackage.ku3;
import defpackage.kuj;
import defpackage.kx4;
import defpackage.l8g;
import defpackage.l98;
import defpackage.lu3;
import defpackage.lv1;
import defpackage.lz;
import defpackage.mhb;
import defpackage.ml4;
import defpackage.mv1;
import defpackage.mze;
import defpackage.n9e;
import defpackage.nf3;
import defpackage.ng0;
import defpackage.noi;
import defpackage.nz;
import defpackage.o02;
import defpackage.o3a;
import defpackage.o3h;
import defpackage.o7g;
import defpackage.of3;
import defpackage.oyn;
import defpackage.p7j;
import defpackage.ph0;
import defpackage.q50;
import defpackage.qea;
import defpackage.qze;
import defpackage.r13;
import defpackage.rq3;
import defpackage.s6a;
import defpackage.s71;
import defpackage.sub;
import defpackage.tc3;
import defpackage.td4;
import defpackage.u6b;
import defpackage.un0;
import defpackage.utc;
import defpackage.uxf;
import defpackage.vdj;
import defpackage.waa;
import defpackage.xtc;
import defpackage.y6a;
import defpackage.y7k;
import defpackage.yj9;
import defpackage.zg3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class n {
    public static float a(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int b(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final a4 c(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        gVar.getClass();
        z3 h = a4.h();
        h.d(gVar.a);
        h.h(gVar.b);
        GeneratedMessageLite build = h.build();
        build.getClass();
        return (a4) build;
    }

    public static final com.moloco.sdk.acm.d d(com.moloco.sdk.acm.d dVar, Function0 function0) {
        String g = g(function0);
        if (g != null) {
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("creative_type", g);
        }
        return dVar;
    }

    public static final Object e(qze qzeVar, Function2 function2, hoi hoiVar) {
        Object A = oyn.A(qzeVar, new fdl(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b(qzeVar), function2, (rq3) null, 18), hoiVar);
        return A == lu3.a ? A : Unit.a;
    }

    public static final String f(com.moloco.sdk.acm.e eVar) {
        eVar.getClass();
        return eVar.a + ':' + eVar.b;
    }

    public static final String g(Function0 function0) {
        String name;
        if (function0 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) function0.invoke();
        if (mVar != null && (name = mVar.name()) != null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        String lowerCase2 = "UNKNOWN".toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        return lowerCase2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0428  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final long j, final long j2, final xtc xtcVar, float f, final float f2, final Function0 function0, final String str, u6b u6bVar, final int i, final int i2, of3 of3Var, final int i3) {
        int i4;
        float f3;
        int i5;
        u6b u6bVar2;
        boolean z;
        Object obj;
        Object fVar;
        y7k y7kVar;
        u6b u6bVar3;
        Integer num;
        q50 q50Var;
        boolean z2;
        Object obj2;
        q50 q50Var2;
        Object obj3;
        av8 av8Var;
        a99 a99Var;
        boolean z3;
        boolean g;
        Object O;
        boolean f4;
        Object O2;
        int i6;
        final float f5;
        final u6b u6bVar4;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1415937460);
        if ((i3 & 6) == 0) {
            i4 = (av8Var2.f(j) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var2.f(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i7 |= av8Var2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= av8Var2.g(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i3) == 0) {
            i7 |= av8Var2.g(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= 4194304;
        }
        if ((100663296 & i3) == 0) {
            i7 |= av8Var2.e(i) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i7 |= av8Var2.e(i2) ? 536870912 : 268435456;
        }
        if ((306783379 & i7) == 306783378 && av8Var2.D()) {
            av8Var2.W();
            f5 = f;
            av8Var = av8Var2;
            u6bVar4 = u6bVar;
        } else {
            av8Var2.Y();
            if ((i3 & 1) == 0 || av8Var2.B()) {
                ff5 ff5Var = nz.a;
                f3 = 5.0f;
                i5 = i7 & (-29360129);
                u6bVar2 = (u6b) av8Var2.k(mhb.a);
            } else {
                av8Var2.W();
                f3 = f;
                i5 = i7 & (-29360129);
                u6bVar2 = u6bVar;
            }
            av8Var2.t();
            av8Var2.e0(-1077278555);
            Object O3 = av8Var2.O();
            float f6 = f3;
            a99 a99Var2 = nf3.a;
            Object obj4 = O3;
            if (O3 == a99Var2) {
                e1d f7 = androidx.compose.runtime.e.f(new c7a(0L));
                av8Var2.n0(f7);
                obj4 = f7;
            }
            e1d e1dVar = (e1d) obj4;
            av8Var2.s(false);
            av8Var2.e0(-1077276327);
            boolean g2 = av8Var2.g(u6bVar2);
            Object O4 = av8Var2.O();
            Object obj5 = O4;
            if (g2 || O4 == a99Var2) {
                e1d f8 = androidx.compose.runtime.e.f(Boolean.TRUE);
                av8Var2.n0(f8);
                obj5 = f8;
            }
            e1d e1dVar2 = (e1d) obj5;
            av8Var2.s(false);
            Object[] objArr = new Object[0];
            av8Var2.e0(-1077272712);
            boolean e = av8Var2.e(i2);
            Object O5 = av8Var2.O();
            if (e || O5 == a99Var2) {
                z = false;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a(i2, 0);
                av8Var2.n0(aVar);
                obj = aVar;
            } else {
                z = false;
                obj = O5;
            }
            av8Var2.s(z);
            e1d e1dVar3 = (e1d) o3a.L(objArr, null, null, (Function0) obj, av8Var2, 0, 6);
            av8Var2.e0(-1077269958);
            Object O6 = av8Var2.O();
            Object obj6 = O6;
            if (O6 == a99Var2) {
                q50 b = ml4.b(j.a(i2, i));
                av8Var2.n0(b);
                obj6 = b;
            }
            q50 q50Var3 = (q50) obj6;
            av8Var2.s(false);
            y7k y7kVar2 = new y7k(i2);
            av8Var2.e0(-1077264621);
            boolean g3 = av8Var2.g(e1dVar3) | av8Var2.e(i2) | av8Var2.e(i) | av8Var2.g(q50Var3) | av8Var2.g(function0);
            Object O7 = av8Var2.O();
            if (g3 || O7 == a99Var2) {
                y7kVar = y7kVar2;
                u6bVar3 = u6bVar2;
                num = 0;
                fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f(i2, i, q50Var3, function0, e1dVar3, null, 0);
                q50Var = q50Var3;
                av8Var2.n0(fVar);
            } else {
                fVar = O7;
                q50Var = q50Var3;
                u6bVar3 = u6bVar2;
                y7kVar = y7kVar2;
                num = 0;
            }
            av8Var2.s(false);
            hz8.o(av8Var2, y7kVar, (Function2) fVar);
            Boolean bool = (Boolean) e1dVar2.getValue();
            bool.getClass();
            av8Var2.e0(-1077230899);
            boolean g4 = av8Var2.g(e1dVar2) | av8Var2.g(q50Var);
            Object O8 = av8Var2.O();
            int i8 = 1;
            Object obj7 = O8;
            if (g4 || O8 == a99Var2) {
                cth cthVar = new cth(q50Var, e1dVar2, null, i8);
                av8Var2.n0(cthVar);
                obj7 = cthVar;
            }
            av8Var2.s(false);
            hz8.o(av8Var2, bool, (Function2) obj7);
            av8Var2.e0(-1077226486);
            boolean g5 = av8Var2.g(e1dVar2) | av8Var2.g(q50Var) | av8Var2.g(u6bVar3);
            Object O9 = av8Var2.O();
            if (g5 || O9 == a99Var2) {
                z2 = false;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b(u6bVar3, q50Var, e1dVar2, false ? 1 : 0);
                av8Var2.n0(bVar);
                obj2 = bVar;
            } else {
                z2 = false;
                obj2 = O9;
            }
            av8Var2.s(z2);
            hz8.d(u6bVar3, (Function1) obj2, av8Var2);
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            av8Var2.e0(693286680);
            l8g a = k8g.a(ng0Var, lv1Var, av8Var2, 54);
            av8Var2.e0(-1323940314);
            ff5 ff5Var2 = dh3.h;
            kx4 kx4Var = (kx4) av8Var2.k(ff5Var2);
            ff5 ff5Var3 = dh3.n;
            ema emaVar = (ema) av8Var2.k(ff5Var3);
            ff5 ff5Var4 = dh3.t;
            hsk hskVar = (hsk) av8Var2.k(ff5Var4);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(xtcVar);
            av8Var2.h0();
            u6b u6bVar5 = u6bVar3;
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            av8Var2.y = false;
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a, f50Var);
            f50 f50Var2 = hf3.e;
            waa.K(av8Var2, kx4Var, f50Var2);
            f50 f50Var3 = hf3.h;
            waa.K(av8Var2, emaVar, f50Var3);
            ff3 ff3Var = hf3.i;
            F.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar, ff3Var, av8Var2), av8Var2, num);
            av8Var2.e0(2058660585);
            av8Var2.e0(-678309503);
            Integer num2 = num;
            String r = kotlin.text.c.r(str, "[SECONDS_LEFT]", Integer.toUnsignedString(i2), false);
            q50 q50Var4 = q50Var;
            long j3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a;
            av8Var2.e0(-447505287);
            boolean g6 = av8Var2.g("custom_countdown_timer_text");
            Object O10 = av8Var2.O();
            if (g6 || O10 == a99Var2) {
                q50Var2 = q50Var4;
                com.appsflyer.internal.a aVar2 = new com.appsflyer.internal.a(20);
                av8Var2.n0(aVar2);
                obj3 = aVar2;
            } else {
                q50Var2 = q50Var4;
                obj3 = O10;
            }
            av8Var2.s(false);
            utc utcVar = utc.a;
            q50 q50Var5 = q50Var2;
            vdj.c(r, o3h.a(utcVar, false, (Function1) obj3), j2, j3, null, null, 0L, new p7j(5), 0L, 0, false, 2, null, null, av8Var2, ((i5 << 3) & 896) | 3072, 3072, 56816);
            av8Var = av8Var2;
            mv1 mv1Var = uxf.g;
            xtc b0 = l98.b0(bkh.l(utcVar, f2), 2.0f);
            av8Var.e0(-447492116);
            boolean g7 = av8Var.g(e1dVar);
            Object O11 = av8Var.O();
            if (g7) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
                if (O11 != a99Var) {
                    z3 = false;
                    av8Var.s(z3);
                    xtc q = n9e.q(o02.h0(b0, (Function1) O11), r13.c(r13.d, 0.9f), o7g.a);
                    av8Var.e0(-447486932);
                    g = av8Var.g("custom_timer_container");
                    O = av8Var.O();
                    if (!g || O == a99Var) {
                        O = new com.appsflyer.internal.a(21);
                        av8Var.n0(O);
                    }
                    av8Var.s(false);
                    xtc a2 = o3h.a(q, false, (Function1) O);
                    av8Var.e0(733328855);
                    g12 e2 = e12.e(mv1Var, av8Var, 6);
                    av8Var.e0(-1323940314);
                    kx4 kx4Var2 = (kx4) av8Var.k(ff5Var2);
                    ema emaVar2 = (ema) av8Var.k(ff5Var3);
                    hsk hskVar2 = (hsk) av8Var.k(ff5Var4);
                    tc3 F2 = s6a.F(a2);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    av8Var.y = false;
                    waa.K(av8Var, e2, f50Var);
                    waa.K(av8Var, kx4Var2, f50Var2);
                    waa.K(av8Var, emaVar2, f50Var3);
                    F2.invoke(com.appsflyer.internal.i.f(av8Var, hskVar2, ff3Var, av8Var), av8Var, num2);
                    av8Var.e0(2058660585);
                    av8Var.e0(-2137368960);
                    g28 g28Var = bkh.c;
                    av8Var.e0(-1178257690);
                    f4 = av8Var.f(j) | av8Var.g(e1dVar) | av8Var.d(f6) | av8Var.g(q50Var5) | av8Var.f(j2);
                    O2 = av8Var.O();
                    if (!f4 || O2 == a99Var) {
                        i6 = 6;
                        s71 s71Var = new s71(j, f6, q50Var5, j2, e1dVar);
                        av8Var.n0(s71Var);
                        O2 = s71Var;
                    } else {
                        i6 = 6;
                    }
                    av8Var.s(false);
                    lz.d(i6, av8Var, g28Var, (Function1) O2);
                    com.appsflyer.internal.i.p(av8Var, false, false, true, false);
                    com.appsflyer.internal.i.p(av8Var, false, false, false, true);
                    av8Var.s(false);
                    av8Var.s(false);
                    f5 = f6;
                    u6bVar4 = u6bVar5;
                }
            }
            z3 = false;
            O11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c(0, e1dVar);
            av8Var.n0(O11);
            av8Var.s(z3);
            xtc q2 = n9e.q(o02.h0(b0, (Function1) O11), r13.c(r13.d, 0.9f), o7g.a);
            av8Var.e0(-447486932);
            g = av8Var.g("custom_timer_container");
            O = av8Var.O();
            if (!g) {
            }
            O = new com.appsflyer.internal.a(21);
            av8Var.n0(O);
            av8Var.s(false);
            xtc a22 = o3h.a(q2, false, (Function1) O);
            av8Var.e0(733328855);
            g12 e22 = e12.e(mv1Var, av8Var, 6);
            av8Var.e0(-1323940314);
            kx4 kx4Var22 = (kx4) av8Var.k(ff5Var2);
            ema emaVar22 = (ema) av8Var.k(ff5Var3);
            hsk hskVar22 = (hsk) av8Var.k(ff5Var4);
            tc3 F22 = s6a.F(a22);
            av8Var.h0();
            if (av8Var.S) {
            }
            av8Var.y = false;
            waa.K(av8Var, e22, f50Var);
            waa.K(av8Var, kx4Var22, f50Var2);
            waa.K(av8Var, emaVar22, f50Var3);
            F22.invoke(com.appsflyer.internal.i.f(av8Var, hskVar22, ff3Var, av8Var), av8Var, num2);
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            g28 g28Var2 = bkh.c;
            av8Var.e0(-1178257690);
            f4 = av8Var.f(j) | av8Var.g(e1dVar) | av8Var.d(f6) | av8Var.g(q50Var5) | av8Var.f(j2);
            O2 = av8Var.O();
            if (f4) {
            }
            i6 = 6;
            s71 s71Var2 = new s71(j, f6, q50Var5, j2, e1dVar);
            av8Var.n0(s71Var2);
            O2 = s71Var2;
            av8Var.s(false);
            lz.d(i6, av8Var, g28Var2, (Function1) O2);
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            com.appsflyer.internal.i.p(av8Var, false, false, false, true);
            av8Var.s(false);
            av8Var.s(false);
            f5 = f6;
            u6bVar4 = u6bVar5;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int i9 = i3 | 1;
                    n.h(j, j2, xtcVar, f5, f2, function0, str, u6bVar4, i, i2, (of3) obj8, i9);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(yj9 yj9Var, long j) {
        bl9 bl9Var = new bl9();
        bl9Var.b(Long.valueOf(j));
        Unit unit = Unit.a;
        yj9Var.c(bl9Var);
    }

    public static final void j(xtc xtcVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, Function1 function1, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1040306081);
        int i4 = i2 & 1;
        int i5 = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.g(tc3Var) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i3 & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i4 != 0) {
                xtcVar = utc.a;
            }
            av8Var.e0(-334646762);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = androidx.compose.runtime.e.f(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            av8Var.s(false);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) e1dVar.getValue();
            av8Var.e0(-334642210);
            boolean g = av8Var.g(e1dVar) | av8Var.g(function1);
            Object O2 = av8Var.O();
            if (g || O2 == a99Var) {
                O2 = new com.appsflyer.f(i5, function1, e1dVar);
                av8Var.n0(O2);
            }
            Function1 function12 = (Function1) O2;
            av8Var.s(false);
            xtcVar.getClass();
            dVar.getClass();
            function12.getClass();
            tc3Var.invoke(un0.A(xtcVar, new com.appsflyer.f(5, dVar, function12)), av8Var, Integer.valueOf((i3 >> 6) & 112));
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hj7(xtcVar2, cVar, function1, tc3Var, i, i2);
        }
    }

    public static final void k(String str, final boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar2, boolean z2, final Function1 function1, final Function1 function12, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, final Function1 function13, final Function1 function14, final xtc xtcVar, of3 of3Var, final int i) {
        int i2;
        av8 av8Var;
        Object[] objArr;
        Object[] objArr2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar;
        String str2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar4;
        boolean z3;
        av8 av8Var2;
        str.getClass();
        uVar.getClass();
        uVar2.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(32444032);
        if ((i & 6) == 0) {
            i2 = (av8Var3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var3.g(uVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var3.g(uVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var3.g(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var3.g(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var3.g(qVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= av8Var3.g(function13) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= av8Var3.g(function14) ? 536870912 : 268435456;
        }
        int i3 = av8Var3.g(xtcVar) ? 4 : 2;
        if ((i2 & 306783379) == 306783378 && (i3 & 3) == 2 && av8Var3.D()) {
            av8Var3.W();
            str2 = str;
            av8Var2 = av8Var3;
            uVar3 = uVar2;
            z3 = z2;
            uVar4 = uVar;
        } else {
            Context context = (Context) av8Var3.k(nz.b);
            g6b lifecycle = ((u6b) av8Var3.k(mhb.a)).getLifecycle();
            av8Var3.e0(-794093536);
            boolean g = av8Var3.g(context) | av8Var3.h(z) | av8Var3.g(lifecycle);
            Object O = av8Var3.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j a = com.moloco.sdk.service_locator.g.a();
                com.moloco.sdk.acm.recorder.b.Companion.getClass();
                av8Var = av8Var3;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h(context, z, a, lifecycle, com.moloco.sdk.acm.recorder.a.b()), qVar);
                av8Var.n0(lVar2);
                O = lVar2;
            } else {
                av8Var = av8Var3;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l) O;
            av8Var.s(false);
            av8Var.e0(773894976);
            av8Var.e0(-492369756);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new eh3(hz8.G(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f.m, av8Var));
                av8Var.n0(O2);
            }
            av8Var.s(false);
            ku3 ku3Var = ((eh3) O2).a;
            av8Var.s(false);
            e1d g2 = androidx.compose.runtime.e.g(function1, av8Var);
            e1d g3 = androidx.compose.runtime.e.g(function12, av8Var);
            Object[] objArr3 = new Object[0];
            av8Var.e0(-794060876);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                objArr = objArr3;
                O3 = new com.moloco.sdk.service_locator.h(19);
                av8Var.n0(O3);
            } else {
                objArr = objArr3;
            }
            av8Var.s(false);
            e1d e1dVar = (e1d) o3a.L(objArr, null, null, (Function0) O3, av8Var, 3072, 6);
            Object[] objArr4 = new Object[0];
            av8Var.e0(-794057964);
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                objArr2 = objArr4;
                O4 = new com.moloco.sdk.service_locator.h(20);
                av8Var.n0(O4);
            } else {
                objArr2 = objArr4;
            }
            av8Var.s(false);
            e1d e1dVar2 = (e1d) o3a.L(objArr2, null, null, (Function0) O4, av8Var, 3072, 6);
            e1d g4 = androidx.compose.runtime.e.g(function13, av8Var);
            e1d g5 = androidx.compose.runtime.e.g(function14, av8Var);
            av8Var.e0(-794050318);
            boolean g6 = av8Var.g(lVar3) | av8Var.g(g2) | av8Var.g(e1dVar2) | av8Var.g(e1dVar) | av8Var.g(g3) | av8Var.g(ku3Var) | av8Var.g(g4) | av8Var.g(g5);
            Object O5 = av8Var.O();
            if (g6 || O5 == a99Var) {
                O5 = new ft2(lVar3, ku3Var, e1dVar2, e1dVar, g2, g3, g4, g5, 5);
                lVar = lVar3;
                av8Var.n0(O5);
            } else {
                lVar = lVar3;
            }
            av8Var.s(false);
            hz8.d(lVar, (Function1) O5, av8Var);
            Unit unit = Unit.a;
            av8Var.e0(-794013548);
            boolean g7 = av8Var.g(lVar);
            Object O6 = av8Var.O();
            rq3 rq3Var = null;
            if (g7 || O6 == a99Var) {
                O6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(lVar, rq3Var, 12);
                av8Var.n0(O6);
            }
            av8Var.s(false);
            hz8.o(av8Var, unit, (Function2) O6);
            av8Var.e0(-794002009);
            boolean g8 = av8Var.g(lVar) | av8Var.g(str) | av8Var.g(uVar2) | av8Var.g(uVar);
            Object O7 = av8Var.O();
            if (g8 || O7 == a99Var) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar4 = lVar;
                kuj kujVar = new kuj((Object) lVar4, str, (Object) uVar2, (Object) uVar, (rq3) null, 24);
                str2 = str;
                uVar3 = uVar2;
                uVar4 = uVar;
                lVar = lVar4;
                av8Var.n0(kujVar);
                O7 = kujVar;
            } else {
                str2 = str;
                uVar3 = uVar2;
                uVar4 = uVar;
            }
            av8Var.s(false);
            hz8.p(lVar, str2, uVar3, (Function2) O7, av8Var);
            av8Var.e0(-793984702);
            boolean g9 = av8Var.g(lVar) | av8Var.g(uVar4);
            Object O8 = av8Var.O();
            if (g9 || O8 == a99Var) {
                O8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(lVar, uVar4, rq3Var, 13);
                av8Var.n0(O8);
            }
            av8Var.s(false);
            hz8.q(lVar, uVar4, (Function2) O8, av8Var);
            Boolean valueOf = Boolean.valueOf(z2);
            av8Var.e0(-793978438);
            z3 = z2;
            boolean g10 = av8Var.g(lVar) | av8Var.h(z3);
            Object O9 = av8Var.O();
            if (g10 || O9 == a99Var) {
                O9 = new j92(lVar, z3, rq3Var, 5);
                av8Var.n0(O9);
            }
            av8Var.s(false);
            hz8.q(lVar, valueOf, (Function2) O9, av8Var);
            View c = lVar.a.c();
            if (c == null) {
                av8Var2 = av8Var;
            } else {
                av8Var.e0(-1928417913);
                boolean g11 = av8Var.g(c);
                Object O10 = av8Var.O();
                if (g11 || O10 == a99Var) {
                    O10 = new com.moloco.sdk.acm.db.e(c, 10);
                    av8Var.n0(O10);
                }
                av8Var.s(false);
                av8 av8Var4 = av8Var;
                td4.a((Function1) O10, xtcVar, null, av8Var4, (i3 << 3) & 112, 4);
                av8Var2 = av8Var4;
            }
        }
        eqf u = av8Var2.u();
        if (u != null) {
            final String str3 = str2;
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar5 = uVar4;
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar6 = uVar3;
            final boolean z4 = z3;
            u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.facebook.appevents.n.k(str3, z, uVar5, uVar6, z4, function1, function12, qVar, function13, function14, xtcVar, (of3) obj, i | 1);
                    return Unit.a;
                }
            };
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g l(float f, float f2) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) f) / Resources.getSystem().getDisplayMetrics().density, ((int) f2) / Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r14 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r14 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:11:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(noi noiVar, h21 h21Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.d dVar;
        int i;
        if (h21Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.d) {
            dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.d) h21Var;
            int i2 = dVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.t = i2 - Integer.MIN_VALUE;
                Object obj = dVar.s;
                lu3 lu3Var = lu3.a;
                i = dVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    gze gzeVar = gze.a;
                    dVar.r = noiVar;
                    dVar.t = 1;
                    obj = noiVar.b(gzeVar, dVar);
                } else {
                    if (i == 1) {
                        noiVar = dVar.r;
                        y6a.M(obj);
                        List list = ((fze) obj).a;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (!qea.m((mze) list.get(i3))) {
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    mze mzeVar = (mze) list.get(i4);
                                    if (mzeVar.b() || qea.z(mzeVar, noiVar.f.x, noiVar.d())) {
                                        break;
                                    }
                                }
                                gze gzeVar2 = gze.c;
                                dVar.r = noiVar;
                                dVar.t = 2;
                                obj = noiVar.b(gzeVar2, dVar);
                            }
                        }
                        return list.get(0);
                    }
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    noiVar = dVar.r;
                    y6a.M(obj);
                    List list2 = ((fze) obj).a;
                    int size3 = list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((mze) list2.get(i5)).b()) {
                            break;
                        }
                    }
                    gze gzeVar3 = gze.a;
                    dVar.r = noiVar;
                    dVar.t = 1;
                    obj = noiVar.b(gzeVar3, dVar);
                }
            }
        }
        dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.d(h21Var);
        Object obj2 = dVar.s;
        lu3 lu3Var2 = lu3.a;
        i = dVar.t;
        if (i != 0) {
        }
    }

    public static String n(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static void o(HashMap hashMap) {
        String[] strArr;
        List h;
        ConcurrentHashMap concurrentHashMap = u.e;
        u uVar = u.a;
        if (cw3.a.contains(u.class)) {
            return;
        }
        try {
            if (!u.c.get()) {
                uVar.b();
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.d(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String K = k0.K(uVar.c(str, str2.subSequence(i, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (h = new Regex(BlazeDataSourcePersonalizedType.STRING_SEPARATOR).h(str3)) == null || (strArr = (String[]) h.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(sub.c(copyOf.length));
                    ph0.S(copyOf, linkedHashSet);
                    if (linkedHashSet.contains(K)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(K);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                        sb.append(K);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(strArr[i2]);
                            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                        }
                        sb.append(K);
                        linkedHashSet.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, K);
                }
            }
            String E = k0.E(concurrentHashMap);
            if (cw3.a.contains(uVar)) {
                return;
            }
            try {
                w.c().execute(new com.appsflyer.b(E, 7));
            } catch (Throwable th) {
                cw3.a(uVar, th);
            }
        } catch (Throwable th2) {
            cw3.a(u.class, th2);
        }
    }
}
