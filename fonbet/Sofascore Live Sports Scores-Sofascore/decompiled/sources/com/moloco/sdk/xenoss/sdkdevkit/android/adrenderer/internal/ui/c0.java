package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.av8;
import defpackage.bkh;
import defpackage.dh3;
import defpackage.e12;
import defpackage.ema;
import defpackage.eqf;
import defpackage.g12;
import defpackage.hf3;
import defpackage.hsk;
import defpackage.if3;
import defpackage.k8g;
import defpackage.kx4;
import defpackage.l8g;
import defpackage.lq9;
import defpackage.lv1;
import defpackage.n12;
import defpackage.nf3;
import defpackage.of3;
import defpackage.pth;
import defpackage.r13;
import defpackage.s6a;
import defpackage.tc3;
import defpackage.td4;
import defpackage.utc;
import defpackage.uxf;
import defpackage.v8a;
import defpackage.vdj;
import defpackage.waa;
import defpackage.ww9;
import defpackage.wzb;
import defpackage.xtc;
import defpackage.zg3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c0 {
    public static final void a(final float f, final float f2, final int i, final int i2, final long j, final long j2, of3 of3Var, xtc xtcVar) {
        float f3;
        final xtc xtcVar2;
        float f4 = f2;
        utc utcVar = utc.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-293854230);
        int i3 = i2 | (av8Var.d(f) ? 4 : 2) | (av8Var.d(f4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.f(j2) ? 16384 : 8192) | (av8Var.e(i) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if ((599187 & i3) == 599186 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            int floor = (int) Math.floor(f);
            int b = wzb.b(10.0f * f) - (floor * 10);
            lv1 lv1Var = uxf.m;
            av8Var.e0(693286680);
            l8g a = k8g.a(ww9.b, lv1Var, av8Var, 48);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-678309503);
            av8Var.e0(1767013527);
            int i4 = 1;
            while (true) {
                if (i4 <= floor) {
                    av8Var.e0(-1057077637);
                    av8 av8Var2 = av8Var;
                    lq9.b(StarKt.getStar(Icons.INSTANCE.getDefault()), bkh.l(utcVar, f4), j, av8Var2, (i3 & 7168) | 48);
                    av8Var = av8Var2;
                    av8Var.s(false);
                    f3 = f4;
                } else if (i4 != floor + 1 || 1 > b || b >= 10) {
                    f3 = f4;
                    av8Var.e0(-1056438386);
                    lq9.b(StarKt.getStar(Icons.INSTANCE.getDefault()), bkh.l(utcVar, f3), j2, av8Var, ((i3 >> 3) & 7168) | 48);
                    av8Var.s(false);
                } else {
                    av8Var.e0(-1056685549);
                    av8 av8Var3 = av8Var;
                    b(f4, (i3 >> 6) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, j, j2, av8Var3);
                    av8Var = av8Var3;
                    f3 = f4;
                    av8Var.s(false);
                }
                if (i4 == 5) {
                    break;
                }
                i4++;
                f4 = f3;
            }
            com.appsflyer.internal.i.o(av8Var, false, utcVar, 4.0f, av8Var);
            av8 av8Var4 = av8Var;
            vdj.c(String.valueOf(f), null, r13.d, v8a.v(i), null, null, 0L, null, 0L, 0, false, 1, null, null, av8Var4, 384, 3072, 57330);
            av8Var = av8Var4;
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
            xtcVar2 = utcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, j, j2, f, f2, xtcVar2, i2) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b0
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ xtc f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c0.a(this.a, this.b, this.e, 49, this.c, this.d, (of3) obj, this.f);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(float f, int i, long j, long j2, of3 of3Var) {
        int i2;
        long j3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2016551008);
        if ((i & 6) == 0) {
            i2 = (av8Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= av8Var.f(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, f);
            av8Var.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var, 0);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(l);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, e, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            n12 n12Var = n12.a;
            Icons icons = Icons.INSTANCE;
            lq9.b(StarKt.getStar(icons.getDefault()), n12Var.b(utcVar), j2, av8Var, ((i2 << 3) & 7168) | 48);
            ImageVector star = StarKt.getStar(icons.getDefault());
            xtc b = n12Var.b(utcVar);
            av8Var.e0(-1749569609);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new com.appsflyer.internal.a(24);
                av8Var.n0(O);
            }
            av8Var.s(false);
            lq9.b(star, td4.Z(b, (Function1) O), j3, av8Var, ((i2 << 6) & 7168) | 48);
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pth(f, j, j2, i);
        }
    }
}
