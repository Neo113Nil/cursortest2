package com.moloco.sdk.internal;

import android.content.Intent;
import com.moloco.sdk.internal.ortb.model.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a99;
import defpackage.av8;
import defpackage.hz8;
import defpackage.lfj;
import defpackage.mv1;
import defpackage.nf3;
import defpackage.ns8;
import defpackage.of3;
import defpackage.r13;
import defpackage.s75;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.v8a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        mv1 mv1Var;
        long j;
        r13 r13Var;
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                av8 av8Var = (av8) ((of3) obj);
                av8Var.e0(-1625076729);
                com.moloco.sdk.internal.ortb.model.l lVar = (com.moloco.sdk.internal.ortb.model.l) obj5;
                float f = lVar.c;
                long i2 = hz8.i(f, f);
                g1 g1Var = (g1) obj6;
                long j2 = (g1Var == null || (r13Var = g1Var.d) == null) ? lVar.f : r13Var.a;
                mv1 a = r.a(lVar.d, lVar.e);
                float f2 = lVar.b;
                t3e t3eVar = new t3e(f2, f2, f2, f2);
                long v = v8a.v(lVar.c);
                v8a.l(v);
                long E = v8a.E(v & 1095216660480L, lfj.c(v) / 2.0f);
                long c = s75.c(i2, 0.4f);
                r13 r13Var2 = lVar.g;
                if (r13Var2 != null) {
                    obj3 = obj6;
                    mv1Var = a;
                    j = r13Var2.a;
                } else {
                    obj3 = obj6;
                    mv1Var = a;
                    j = r.b;
                }
                tc3 b = f1.b(mv1Var, t3eVar, j2, i2, E, r.g(c, j, j2, (g1) obj3, av8Var), (com.moloco.sdk.internal.ortb.model.h0) obj4, av8Var, 64);
                av8Var.s(false);
                break;
            case 1:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        break;
                    }
                }
                StaticAdActivity staticAdActivity = (StaticAdActivity) obj5;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c) obj6;
                Intent intent = staticAdActivity.getIntent();
                intent.getClass();
                int intExtra = intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b bVar = StaticAdActivity.b;
                av8 av8Var3 = (av8) of3Var;
                av8Var3.e0(-1212645219);
                boolean g = av8Var3.g(bVar);
                Object O = av8Var3.O();
                a99 a99Var = nf3.a;
                if (g || O == a99Var) {
                    com.moloco.sdk.internal.publisher.l0 l0Var = new com.moloco.sdk.internal.publisher.l0(1, bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 3);
                    av8Var3.n0(l0Var);
                    O = l0Var;
                }
                av8Var3.s(false);
                Function1 function1 = (Function1) ((KFunction) O);
                av8Var3.e0(-1212643532);
                boolean g2 = av8Var3.g(bVar);
                Object O2 = av8Var3.O();
                if (g2 || O2 == a99Var) {
                    com.moloco.sdk.internal.publisher.nativead.b bVar2 = new com.moloco.sdk.internal.publisher.nativead.b(0, bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b.class, "dismiss", "dismiss()V", 0, 7);
                    av8Var3.n0(bVar2);
                    O2 = bVar2;
                }
                av8Var3.s(false);
                Function0 function0 = (Function0) ((KFunction) O2);
                ns8 ns8Var = (ns8) obj4;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar = StaticAdActivity.i;
                av8Var3.e0(-1212638456);
                Object O3 = av8Var3.O();
                if (O3 == a99Var) {
                    O3 = new com.moloco.sdk.service_locator.h(14);
                    av8Var3.n0(O3);
                }
                av8Var3.s(false);
                com.facebook.appevents.j.g(staticAdActivity, cVar, intExtra, function1, function0, ns8Var, tVar, (Function0) O3, av8Var3, 12582912);
            default:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var4 = (av8) of3Var2;
                    if (av8Var4.D()) {
                        av8Var4.W();
                        break;
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x.i((VastActivity) obj5, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) obj6, (Function2) obj4, VastActivity.k, of3Var2, 0);
        }
        return Unit.a;
    }
}
