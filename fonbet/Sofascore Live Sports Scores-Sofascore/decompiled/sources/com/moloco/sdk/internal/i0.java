package com.moloco.sdk.internal;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.av8;
import defpackage.bkh;
import defpackage.dh3;
import defpackage.ema;
import defpackage.eqf;
import defpackage.gz8;
import defpackage.h17;
import defpackage.hf3;
import defpackage.hkg;
import defpackage.hsk;
import defpackage.if3;
import defpackage.k8g;
import defpackage.kg0;
import defpackage.kx4;
import defpackage.l8g;
import defpackage.l98;
import defpackage.lv1;
import defpackage.mp3;
import defpackage.n7g;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.o7g;
import defpackage.of3;
import defpackage.oyn;
import defpackage.s6a;
import defpackage.tc3;
import defpackage.tf8;
import defpackage.u5g;
import defpackage.utc;
import defpackage.uxf;
import defpackage.vdj;
import defpackage.waa;
import defpackage.wg8;
import defpackage.wnn;
import defpackage.ww9;
import defpackage.xtc;
import defpackage.zg3;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class i0 {
    public static final long a = hkg.d(4278354171L);

    public static final void a(xtc xtcVar, String str, String str2, long j, long j2, Function0 function0, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2035340272);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.f(j) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.g(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((74899 & i2) == 74898 && av8Var.D()) {
            av8Var.W();
        } else {
            n7g a2 = o7g.a(4.0f);
            xtc v = oyn.v(gz8.x(n9e.q(wnn.A(bkh.q(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 164.0f, 1), a2), j2, oyn.e), null, null, 3), new u5g(0), function0, 1);
            kg0 kg0Var = ww9.f;
            lv1 lv1Var = uxf.m;
            av8Var.e0(693286680);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            int i3 = i2;
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(v);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-678309503);
            av8Var.e0(-118836883);
            utc utcVar = utc.a;
            if (str != null) {
                nq8.h(av8Var, bkh.p(utcVar, 4.0f));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.b(str, mp3.b, wnn.A(bkh.l(utcVar, 36.0f), a2), av8Var, ((i3 >> 3) & 14) | 48);
            }
            av8Var.s(false);
            vdj.c(str2, l98.c0(utcVar, 15.0f, 12.0f), j, 0L, wg8.j, tf8.a, 0L, null, 0L, 0, false, 1, null, null, av8Var, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new h17(xtcVar, str, str2, j, j2, function0, i);
        }
    }
}
