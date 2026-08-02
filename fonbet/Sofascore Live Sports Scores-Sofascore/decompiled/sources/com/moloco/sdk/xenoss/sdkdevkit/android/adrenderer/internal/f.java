package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import defpackage.ad2;
import defpackage.ar3;
import defpackage.ddi;
import defpackage.jof;
import defpackage.ku3;
import defpackage.mqi;
import defpackage.nu3;
import defpackage.pdk;
import defpackage.un0;
import defpackage.weh;
import defpackage.xw3;
import defpackage.yf4;
import defpackage.ypa;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {
    public final Context g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c i;
    public final d j;
    public final ku3 k;
    public final com.facebook.b l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m m;
    public final mqi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar, d dVar, ad2 ad2Var) {
        super(ad2Var, context);
        com.facebook.b bVar = new com.facebook.b(22);
        context.getClass();
        tVar.getClass();
        ad2Var.getClass();
        this.g = context;
        this.h = tVar;
        this.i = cVar;
        this.j = dVar;
        this.k = ad2Var;
        this.l = bVar;
        setTag("MolocoStaticBannerView");
        this.m = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.c;
        this.n = ypa.b(new com.moloco.sdk.acm.services.d(this, 9));
    }

    public static final jof d(f fVar) {
        int i = 3;
        return un0.K(new yf4(super.l(), fVar.i.g, new ar3(i, null, i), 1), fVar.k, weh.a, Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        pdk pdkVar = new pdk(this, null, 18);
        xw3.K(this.k, kotlin.coroutines.g.a, nu3.a, pdkVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        super.destroy();
        this.i.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.m;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t getWatermark() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return (ddi) this.n.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public d getAdLoader() {
        return this.j;
    }
}
