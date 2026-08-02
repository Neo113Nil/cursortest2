package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.ot8;
import defpackage.s9a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class g extends ot8 implements Function1 {
    public final /* synthetic */ h b;
    public final /* synthetic */ t0 c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t0 t0Var, Context context) {
        super(1, s9a.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
        this.b = hVar;
        this.c = t0Var;
        this.d = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj;
        aVar.getClass();
        com.moloco.sdk.internal.services.events.c cVar = this.b.b;
        t0 t0Var = this.c;
        com.facebook.c0 c0Var = new com.facebook.c0(t0Var);
        b = com.facebook.appevents.g.b(aVar, t0Var, this.d, cVar, true, Boolean.FALSE, 0, 0, 0, false, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j(), c0Var);
        return b;
    }
}
