package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import defpackage.o55;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ f(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj;
                cVar.getClass();
                gVar.a(new d(cVar));
                return Unit.a;
            default:
                ((o55) obj).getClass();
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h(gVar, 0);
        }
    }
}
