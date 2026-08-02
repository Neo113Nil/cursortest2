package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.ad2;
import defpackage.ku3;
import defpackage.rd4;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {
    public final Context g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t h;
    public final com.facebook.b i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r k;
    public final x0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, String str, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, ad2 ad2Var) {
        super(ad2Var, context);
        com.facebook.b bVar = new com.facebook.b(22);
        context.getClass();
        str.getClass();
        t0Var.getClass();
        tVar.getClass();
        ad2Var.getClass();
        this.g = context;
        this.h = tVar;
        this.i = bVar;
        setTag("MolocoMraidBannerView");
        this.j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.b;
        int i = 0;
        int i2 = 0;
        Class<y0> cls = y0.class;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r(context, str, new com.moloco.sdk.internal.publisher.nativead.b(i2, this, cls, "detachMraidViewFromAdViewWrapper", "detachMraidViewFromAdViewWrapper()V", i, 24), new com.moloco.sdk.internal.publisher.nativead.b(i2, this, cls, "attachMraidViewToAdViewWrapper", "attachMraidViewToAdViewWrapper()V", i, 25), new com.moloco.sdk.acm.services.d(this, 19), new com.moloco.sdk.acm.db.e(this, 13), t0Var, new rd4(context, (ku3) ad2Var, false), null, 1536);
        this.k = rVar;
        this.l = new x0(ad2Var, null, com.moloco.sdk.service_locator.a.a(), new com.moloco.sdk.internal.publisher.l0(1, rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h0 h0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h0) this.k.g.f;
        this.i.getClass();
        FrameLayout c = com.facebook.b.c(this.g, h0Var);
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b) this.h).b(c);
        setAdView(c);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        super.destroy();
        this.k.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public x0 getAdLoader() {
        return this.l;
    }
}
