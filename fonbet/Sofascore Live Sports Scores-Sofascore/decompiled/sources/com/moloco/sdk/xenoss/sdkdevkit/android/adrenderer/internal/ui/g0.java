package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.unity3d.services.UnityAdsConstants;
import defpackage.av8;
import defpackage.bkh;
import defpackage.d7e;
import defpackage.dh3;
import defpackage.dje;
import defpackage.ema;
import defpackage.hf3;
import defpackage.hsk;
import defpackage.if3;
import defpackage.k8g;
import defpackage.kg0;
import defpackage.kx4;
import defpackage.l8g;
import defpackage.l98;
import defpackage.lv1;
import defpackage.m5g;
import defpackage.mz1;
import defpackage.nf3;
import defpackage.nq8;
import defpackage.of3;
import defpackage.oyn;
import defpackage.s6a;
import defpackage.tc3;
import defpackage.u5g;
import defpackage.utc;
import defpackage.uxf;
import defpackage.waa;
import defpackage.ww9;
import defpackage.wzc;
import defpackage.xtc;
import defpackage.yqo;
import defpackage.zg3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g0 implements Function2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ d7e j;

    public g0(float f, String str, Function0 function0, boolean z, boolean z2, String str2, long j, long j2, long j3, d7e d7eVar) {
        this.a = f;
        this.b = str;
        this.c = function0;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = d7eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        float f = this.a;
        utc utcVar = utc.a;
        xtc c0 = l98.c0(bkh.g(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 10.0f, 6.0f);
        dje a = m5g.a(of3Var);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(1151230561);
        Object O = av8Var2.O();
        if (O == nf3.a) {
            O = mz1.e(av8Var2);
        }
        av8Var2.s(false);
        u5g u5gVar = new u5g(0);
        String str = this.b;
        xtc u = oyn.u(c0, (wzc) O, a, false, str, u5gVar, this.c, 4);
        lv1 lv1Var = uxf.m;
        kg0 kg0Var = ww9.f;
        av8Var2.e0(693286680);
        l8g a2 = k8g.a(kg0Var, lv1Var, av8Var2, 54);
        av8Var2.e0(-1323940314);
        kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
        ema emaVar = (ema) av8Var2.k(dh3.n);
        hsk hskVar = (hsk) av8Var2.k(dh3.t);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        tc3 F = s6a.F(u);
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        av8Var2.y = false;
        waa.K(av8Var2, a2, hf3.g);
        waa.K(av8Var2, kx4Var, hf3.e);
        waa.K(av8Var2, emaVar, hf3.h);
        F.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar, hf3.i, av8Var2), av8Var2, 0);
        av8Var2.e0(2058660585);
        av8Var2.e0(-678309503);
        String str2 = this.f;
        long j = this.g;
        tc3 y = yqo.y(-618324232, av8Var2, new f0(str2, j, this.h));
        tc3 y2 = yqo.y(367056260, av8Var2, new e0(this.i, this.j, str, j));
        boolean z = this.d;
        boolean z2 = this.e;
        if (z) {
            av8Var2.e0(774006835);
            y.invoke(av8Var2, 6);
            if (z2) {
                nq8.h(av8Var2, bkh.p(utcVar, 4.0f));
                y2.invoke(av8Var2, 6);
            }
            av8Var2.s(false);
        } else {
            av8Var2.e0(774193331);
            av8Var2.e0(717711159);
            if (z2) {
                y2.invoke(av8Var2, 6);
                nq8.h(av8Var2, bkh.p(utcVar, 4.0f));
            }
            av8Var2.s(false);
            y.invoke(av8Var2, 6);
            av8Var2.s(false);
        }
        com.appsflyer.internal.i.p(av8Var2, false, false, true, false);
        av8Var2.s(false);
        return Unit.a;
    }
}
