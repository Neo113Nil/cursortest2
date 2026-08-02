package com.moloco.sdk.internal;

import defpackage.av8;
import defpackage.cdi;
import defpackage.ct8;
import defpackage.e1d;
import defpackage.of3;
import defpackage.r70;
import defpackage.yqo;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g0 implements ct8 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ cdi b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Function0 g;

    public g0(Function1 function1, e1d e1dVar, String str, String str2, long j, long j2, Function0 function0) {
        this.a = function1;
        this.b = e1dVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) this.b.getValue();
        boolean z = rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
        Function0 function0 = this.g;
        Function1 function1 = this.a;
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.e0(-387247913);
            com.facebook.appevents.n.j(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f, function1, yqo.y(-1938502477, av8Var, new f0(this.c, this.d, this.e, this.f, function0, 0)), av8Var, 3120, 1);
            av8Var.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.e0(-386686441);
            com.facebook.appevents.n.j(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f, function1, yqo.y(-868048676, av8Var2, new f0(this.c, this.d, this.e, this.f, function0, 1)), av8Var2, 3120, 1);
            av8Var2.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.e0(-386143662);
            av8Var3.s(false);
        } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) {
            av8 av8Var4 = (av8) of3Var;
            av8Var4.e0(-386086126);
            av8Var4.s(false);
        } else {
            if (rVar != null) {
                av8 av8Var5 = (av8) of3Var;
                av8Var5.e0(-843777307);
                av8Var5.s(false);
                zzl.b();
                return null;
            }
            av8 av8Var6 = (av8) of3Var;
            av8Var6.e0(-386051437);
            av8Var6.s(false);
        }
        return Unit.a;
    }
}
