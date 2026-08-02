package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.ct8;
import defpackage.of3;
import defpackage.r70;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q implements ct8 {
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, Function0 function0, Function0 function02) {
        this.a = rVar;
        this.b = function0;
        this.c = function02;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar = this.a;
        if (rVar != null) {
            com.facebook.appevents.j.m(rVar, this.b, this.c, null, of3Var, 0);
        }
        return Unit.a;
    }
}
