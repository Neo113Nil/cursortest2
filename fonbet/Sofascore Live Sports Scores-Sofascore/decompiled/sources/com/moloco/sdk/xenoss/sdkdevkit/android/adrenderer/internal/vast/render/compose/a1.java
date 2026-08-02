package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.a99;
import defpackage.av8;
import defpackage.ct8;
import defpackage.d7e;
import defpackage.e1d;
import defpackage.nf3;
import defpackage.o3h;
import defpackage.of3;
import defpackage.r70;
import defpackage.uah;
import defpackage.un0;
import defpackage.utc;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a1 implements ct8 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d7e b;
    public final /* synthetic */ d7e c;
    public final /* synthetic */ e1d d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ uah k;
    public final /* synthetic */ long l;

    public a1(boolean z, d7e d7eVar, d7e d7eVar2, e1d e1dVar, Function2 function2, Function1 function1, boolean z2, long j, long j2, long j3, uah uahVar, long j4) {
        this.a = z;
        this.b = d7eVar;
        this.c = d7eVar2;
        this.d = e1dVar;
        this.e = function2;
        this.f = function1;
        this.g = z2;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = uahVar;
        this.l = j4;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        boolean z = this.a;
        d7e d7eVar = z ? this.b : this.c;
        e1d e1dVar = this.d;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) e1dVar.getValue();
        av8 av8Var = (av8) of3Var;
        av8Var.e0(-133161099);
        boolean g = av8Var.g(e1dVar);
        Function2 function2 = this.e;
        boolean g2 = g | av8Var.g(function2) | av8Var.h(z);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g2 || O == a99Var) {
            O = new com.appsflyer.a(function2, z, e1dVar);
            av8Var.n0(O);
        }
        Function1 function1 = (Function1) O;
        av8Var.s(false);
        dVar.getClass();
        function1.getClass();
        xtc A = un0.A(utc.a, new com.appsflyer.f(5, dVar, function1));
        av8Var.e0(-133154015);
        boolean g3 = av8Var.g("mute_button");
        Object O2 = av8Var.O();
        if (g3 || O2 == a99Var) {
            O2 = new com.appsflyer.internal.a(26);
            av8Var.n0(O2);
        }
        av8Var.s(false);
        xtc a = o3h.a(A, false, (Function1) O2);
        av8Var.e0(-133147685);
        Function1 function12 = this.f;
        boolean g4 = av8Var.g(function12) | av8Var.h(z) | av8Var.g(e1dVar) | av8Var.g(function2) | av8Var.g(null);
        Object O3 = av8Var.O();
        if (g4 || O3 == a99Var) {
            O3 = new g0(function12, z, function2, e1dVar);
            av8Var.n0(O3);
        }
        av8Var.s(false);
        com.facebook.appevents.j.f(d7eVar, (Function0) O3, a, this.g, "mute/unmute", this.h, this.i, this.j, this.k, this.l, av8Var, 24576, 0);
        return Unit.a;
    }
}
