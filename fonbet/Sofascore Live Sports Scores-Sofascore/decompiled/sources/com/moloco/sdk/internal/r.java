package com.moloco.sdk.internal;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.internal.ortb.model.e1;
import com.moloco.sdk.internal.ortb.model.g1;
import com.moloco.sdk.internal.ortb.model.n0;
import com.moloco.sdk.internal.ortb.model.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import com.sofascore.results.R;
import defpackage.av8;
import defpackage.ay;
import defpackage.f1d;
import defpackage.haa;
import defpackage.hkg;
import defpackage.hz8;
import defpackage.kn4;
import defpackage.lfj;
import defpackage.mqi;
import defpackage.mv1;
import defpackage.ns8;
import defpackage.p75;
import defpackage.r13;
import defpackage.tc3;
import defpackage.tw7;
import defpackage.uxf;
import defpackage.v8a;
import defpackage.y7k;
import defpackage.ypa;
import defpackage.zzl;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class r {
    public static final mqi a = ypa.b(new com.appsflyer.c(10));
    public static final long b = r13.d;
    public static final long c = i0.a;
    public static final long d = hz8.i(30.0f, 30.0f);

    public static final mv1 a(e1 e1Var, com.moloco.sdk.internal.ortb.model.o oVar) {
        mv1 mv1Var = uxf.c;
        e1Var.getClass();
        oVar.getClass();
        com.moloco.sdk.internal.ortb.model.o oVar2 = com.moloco.sdk.internal.ortb.model.o.b;
        if (oVar == oVar2 && (e1Var == e1.b || e1Var == e1.e)) {
            return mv1Var;
        }
        if (oVar == oVar2 && e1Var == e1.c) {
            return uxf.d;
        }
        if (oVar == oVar2 && (e1Var == e1.d || e1Var == e1.f)) {
            return uxf.e;
        }
        com.moloco.sdk.internal.ortb.model.o oVar3 = com.moloco.sdk.internal.ortb.model.o.c;
        if (oVar == oVar3 && (e1Var == e1.b || e1Var == e1.e)) {
            return uxf.f;
        }
        if (oVar == oVar3 && e1Var == e1.c) {
            return uxf.g;
        }
        if (oVar == oVar3 && (e1Var == e1.d || e1Var == e1.f)) {
            return uxf.h;
        }
        com.moloco.sdk.internal.ortb.model.o oVar4 = com.moloco.sdk.internal.ortb.model.o.d;
        return (oVar == oVar4 && (e1Var == e1.b || e1Var == e1.e)) ? uxf.i : (oVar == oVar4 && e1Var == e1.c) ? uxf.j : (oVar == oVar4 && (e1Var == e1.d || e1Var == e1.f)) ? uxf.k : mv1Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e] */
    public static final kn4 b(com.moloco.sdk.internal.ortb.model.d dVar, boolean z) {
        z0 z0Var;
        y7k y7kVar;
        com.moloco.sdk.internal.ortb.model.l lVar = dVar.b;
        int i = lVar.a;
        n0 n0Var = dVar.i;
        com.moloco.sdk.internal.ortb.model.h0 h0Var = dVar.j;
        int i2 = 0;
        final Function2 nVar = n0Var == null ? new n(z, lVar, h0Var) : new m(i2, lVar, dVar.m, h0Var);
        final long j = r13.b;
        ?? r2 = new ns8() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e
            @Override // defpackage.ns8
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                WebView webView = (WebView) obj2;
                f1d f1dVar = (f1d) obj4;
                Function1 function1 = (Function1) obj5;
                Function0 function0 = (Function0) obj7;
                boolean booleanValue = ((Boolean) obj10).booleanValue();
                webView.getClass();
                f1dVar.getClass();
                function1.getClass();
                function0.getClass();
                ComposeView composeView = new ComposeView((Context) obj, null, 6);
                composeView.setId(R.id.moloco_fullscreen_ad_view_id);
                composeView.setContent(new tc3(553564605, new h(webView, f1dVar, ((Integer) obj3).intValue(), function1, (Function0) obj6, function0, j, nVar, (t) obj8, (p75) obj9, booleanValue, 1), true));
                return composeView;
            }
        };
        if (n0Var != null && (z0Var = n0Var.e) != null && (y7kVar = z0Var.a) != null) {
            i2 = y7kVar.a;
        }
        return new kn4(i, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e) r2, i2, new n(z, lVar, (com.moloco.sdk.internal.ortb.model.h0) null), dVar.k, dVar.l);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l c(com.moloco.sdk.internal.ortb.model.d dVar) {
        dVar.getClass();
        kn4 b2 = b(dVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l(d(dVar, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j()), b2, b2);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s d(com.moloco.sdk.internal.ortb.model.d dVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0 f0Var;
        z0 z0Var;
        y7k y7kVar;
        boolean z2 = dVar.d.a;
        com.moloco.sdk.internal.ortb.model.l lVar = dVar.a;
        Boolean bool = lVar == null ? null : Boolean.TRUE;
        int i = 0;
        int i2 = lVar != null ? lVar.a : 0;
        com.moloco.sdk.internal.ortb.model.u uVar = dVar.g;
        int i3 = 1;
        boolean z3 = uVar != null && uVar.a && uVar.b;
        boolean z4 = uVar != null && uVar.a;
        com.moloco.sdk.internal.ortb.model.l lVar2 = dVar.b;
        int i4 = lVar2.a;
        n0 n0Var = dVar.i;
        int i5 = (n0Var == null || (z0Var = n0Var.e) == null || (y7kVar = z0Var.a) == null) ? 0 : y7kVar.a;
        Function2 oVar = new o(dVar, i);
        Function2 nVar = new n(z, lVar2, dVar.j);
        Function2 oVar2 = new o(dVar, i3);
        Function2 oVar3 = new o(dVar, 2);
        Function2 ayVar = new ay(z, dVar, i3);
        if (dVar.f) {
            mqi mqiVar = a0.a;
            f0Var = null;
        } else {
            f0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0) a0.a.getValue();
        }
        Function2 oVar4 = new o(dVar, 3);
        int i6 = i2;
        Function2 oVar5 = new o(dVar, 4);
        boolean z5 = !z;
        final long j = r13.b;
        if ((1537 & 2) != 0) {
            oVar = d1.b;
        }
        final Function2 function2 = oVar;
        if ((1537 & 4) != 0) {
            nVar = d1.c;
        }
        final Function2 function22 = nVar;
        if ((1537 & 8) != 0) {
            oVar2 = d1.d;
        }
        final Function2 function23 = oVar2;
        final Function2 function24 = (1537 & 16) != 0 ? function23 : oVar3;
        if ((1537 & 32) != 0) {
            ayVar = d1.e;
        }
        final Function2 function25 = ayVar;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0 f0Var2 = (1537 & 64) != 0 ? null : f0Var;
        if ((1537 & 128) != 0) {
            oVar4 = d1.f;
        }
        final Function2 function26 = oVar4;
        if ((1537 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            oVar5 = d1.g;
        }
        final Function2 function27 = oVar5;
        final d1 d1Var = d1.h;
        mqi mqiVar2 = com.moloco.sdk.service_locator.i.a;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q();
        final boolean z6 = (1537 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? true : z5;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z2, bool, i6, i4, i5, z3, z4, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Context context = (Context) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) obj2;
                context.getClass();
                sVar.getClass();
                ComposeView composeView = new ComposeView(context, null, 6);
                composeView.setId(R.id.moloco_fullscreen_ad_view_id);
                composeView.setContent(new tc3(-1482604196, new e1(sVar, j, function2, function22, function23, function24, function25, f0Var2, function26, function27, d1Var, qVar, z6, 1), true));
                return composeView;
            }
        }, dVar.k, dVar.l, jVar);
    }

    public static final int e(e1 e1Var, com.moloco.sdk.internal.ortb.model.o oVar) {
        int i;
        int i2;
        e1Var.getClass();
        oVar.getClass();
        int i3 = l.a[e1Var.ordinal()];
        if (i3 == 1 || i3 == 2) {
            i = 8388611;
        } else if (i3 == 3) {
            i = 1;
        } else {
            if (i3 != 4 && i3 != 5) {
                zzl.b();
                return 0;
            }
            i = 8388613;
        }
        int i4 = l.b[oVar.ordinal()];
        if (i4 == 1) {
            i2 = 48;
        } else if (i4 == 2) {
            i2 = 16;
        } else {
            if (i4 != 3) {
                zzl.b();
                return 0;
            }
            i2 = 80;
        }
        return i | i2;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f(com.moloco.sdk.internal.ortb.model.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar) {
        Integer num;
        Integer num2;
        Integer num3;
        boolean z;
        boolean z2;
        z0 z0Var;
        y7k y7kVar;
        dVar.getClass();
        kn4 b2 = b(dVar, true);
        com.moloco.sdk.internal.ortb.model.b bVar = dVar.d;
        com.moloco.sdk.internal.ortb.model.f fVar = dVar.c;
        com.moloco.sdk.internal.ortb.model.n nVar = dVar.h;
        boolean z3 = dVar.f;
        int s0 = hkg.s0(bVar.e);
        r13 r13Var = bVar.g;
        Integer valueOf = r13Var != null ? Integer.valueOf(hkg.s0(r13Var.a)) : null;
        int e = e(bVar.c, bVar.d);
        int i = bVar.b;
        y7k y7kVar2 = bVar.f;
        Integer valueOf2 = y7kVar2 != null ? Integer.valueOf(y7kVar2.a) : null;
        Integer valueOf3 = fVar != null ? Integer.valueOf(hkg.s0(fVar.d)) : null;
        Integer valueOf4 = fVar != null ? Integer.valueOf(e(fVar.b, fVar.c)) : null;
        Integer valueOf5 = fVar != null ? Integer.valueOf(fVar.a) : null;
        if (nVar != null) {
            num = valueOf5;
            num2 = Integer.valueOf(e(nVar.b, nVar.c));
        } else {
            num = valueOf5;
            num2 = null;
        }
        Integer valueOf6 = nVar != null ? Integer.valueOf(nVar.a) : null;
        boolean z4 = bVar.a;
        Integer num4 = num2;
        com.moloco.sdk.internal.ortb.model.l lVar = dVar.a;
        Boolean bool = lVar == null ? null : Boolean.TRUE;
        int i2 = lVar != null ? lVar.a : 0;
        com.moloco.sdk.internal.ortb.model.u uVar = dVar.g;
        if (uVar != null) {
            num3 = valueOf6;
            z = true;
            if (uVar.a && uVar.b) {
                z2 = true;
                boolean z5 = (uVar == null && uVar.a == z) ? z : false;
                int i3 = dVar.b.a;
                n0 n0Var = dVar.i;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z4, bool, i2, i3, (n0Var != null || (z0Var = n0Var.e) == null || (y7kVar = z0Var.a) == null) ? 0 : y7kVar.a, z2, z5, new tw7(i, valueOf2, fVar, nVar, z3, s0, e, valueOf, valueOf3, valueOf4, num, num4, num3), dVar.k, dVar.l, jVar), b2, b2);
            }
        } else {
            num3 = valueOf6;
            z = true;
        }
        z2 = false;
        if (uVar == null) {
        }
        int i32 = dVar.b.a;
        n0 n0Var2 = dVar.i;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z4, bool, i2, i32, (n0Var2 != null || (z0Var = n0Var2.e) == null || (y7kVar = z0Var.a) == null) ? 0 : y7kVar.a, z2, z5, new tw7(i, valueOf2, fVar, nVar, z3, s0, e, valueOf, valueOf3, valueOf4, num, num4, num3), dVar.k, dVar.l, jVar), b2, b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t] */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u g(long j, long j2, long j3, g1 g1Var, av8 av8Var) {
        long j4;
        av8Var.e0(129538364);
        av8Var.e0(-1579260747);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar = null;
        String str = null;
        if (g1Var != null) {
            String str2 = g1Var.c;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                str.getClass();
            }
            boolean z = !Intrinsics.c(str, "right");
            Boolean bool = g1Var.b;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            String str3 = g1Var.a;
            if (str3 == null) {
                str3 = "play store";
            }
            String str4 = str3;
            r13 r13Var = g1Var.d;
            long j5 = r13Var != null ? r13Var.a : j3;
            r13 r13Var2 = g1Var.e;
            long j6 = r13Var2 != null ? r13Var2.a : j2;
            Integer num = g1Var.f;
            long v = num != null ? v8a.v(num.intValue()) : lfj.c;
            Integer num2 = g1Var.g;
            if (num2 != null) {
                float intValue = num2.intValue();
                j4 = hz8.i(intValue, intValue);
            } else {
                j4 = j;
            }
            av8Var.e0(1328580925);
            ?? tVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t(str4, haa.t(R.drawable.double_arrow_24, 0, av8Var), str4, j4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e, j6, z, booleanValue, j5, v);
            av8Var.s(false);
            sVar = tVar;
        }
        av8Var.s(false);
        if (sVar == null) {
            sVar = f1.g(haa.t(2131232663, 0, av8Var), j, j2, av8Var, 4);
        }
        av8Var.s(false);
        return sVar;
    }
}
