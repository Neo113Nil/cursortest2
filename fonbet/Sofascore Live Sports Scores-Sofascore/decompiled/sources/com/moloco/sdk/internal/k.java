package com.moloco.sdk.internal;

import android.content.Context;
import android.content.res.Resources;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import defpackage.dnd;
import defpackage.of3;
import defpackage.rq3;
import defpackage.xtc;
import defpackage.xw3;
import defpackage.z88;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Context context = (Context) obj;
                z88 z88Var = (z88) obj2;
                context.getClass();
                z88Var.getClass();
                num.getClass();
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.moloco.sdk.internal.publisher.h0.g(1, (of3) obj, (xtc) obj4, (Function1) obj3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.moloco.sdk.internal.publisher.h0.l((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) obj4, (xtc) obj3, (of3) obj, 1);
                break;
            case 3:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g) obj4;
                Function0 function0 = (Function0) obj3;
                dnd dndVar = (dnd) obj;
                long j = dndVar.a;
                gVar.j = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(com.facebook.appevents.n.a((int) dnd.f(j)), com.facebook.appevents.n.a((int) dnd.g(j)));
                if (function0 != null) {
                    function0.invoke();
                } else {
                    long j2 = dndVar.a;
                    gVar.b(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(com.facebook.appevents.n.a((int) dnd.f(j2)), com.facebook.appevents.n.a((int) dnd.g(j2))));
                }
                break;
            case 4:
                Function0 function02 = (Function0) obj4;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) obj3;
                dnd dndVar2 = (dnd) obj;
                if (function02 != null) {
                    function02.invoke();
                } else {
                    long j3 = dndVar2.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) dnd.f(j3)) / Resources.getSystem().getDisplayMetrics().density, ((int) dnd.g(j3)) / Resources.getSystem().getDisplayMetrics().density);
                    String str = bVar.a.b;
                    if (str != null) {
                        com.moloco.sdk.acm.eventprocessing.f fVar = bVar.e;
                        List list = (List) fVar.b;
                        rq3 rq3Var = null;
                        if (list != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x.k((f1) fVar.f, list, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n) fVar.e).b(), (com.moloco.sdk.internal.services.events.c) fVar.a, gVar2);
                            fVar.b = null;
                        }
                        bVar.b.a(str);
                        xw3.L(bVar.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a.b, rq3Var, 16), 3);
                    }
                }
                break;
            default:
                Function0 function03 = (Function0) obj4;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) obj3;
                dnd dndVar3 = (dnd) obj;
                if (function03 != null) {
                    function03.invoke();
                } else {
                    long j4 = dndVar3.a;
                    eVar.g(true, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) dnd.f(j4)) / Resources.getSystem().getDisplayMetrics().density, ((int) dnd.g(j4)) / Resources.getSystem().getDisplayMetrics().density));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
