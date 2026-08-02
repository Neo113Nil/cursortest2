package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.jof;
import defpackage.un0;
import defpackage.xw3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {
    public final Context g;
    public final com.moloco.sdk.internal.ortb.model.y h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l i;
    public final t0 j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t k;
    public final com.moloco.sdk.internal.d l;
    public final ad2 m;
    public final com.moloco.sdk.internal.services.z n;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n o;
    public final String p;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m q;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k r;
    public o s;
    public y0 t;
    public f u;
    public final a0 v;
    public final fdi w;
    public final jof x;

    public b0(Context context, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.internal.ortb.model.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, com.moloco.sdk.internal.d dVar, ad2 ad2Var, com.moloco.sdk.internal.services.z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar) {
        super(ad2Var, context);
        this.g = context;
        this.h = yVar;
        this.i = lVar;
        this.j = t0Var;
        this.k = tVar;
        this.l = dVar;
        this.m = ad2Var;
        this.n = zVar;
        this.o = nVar;
        this.p = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.q = null;
        this.v = new a0(this, cVar);
        fdi a = gdi.a(Boolean.FALSE);
        this.w = a;
        this.x = un0.u(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.s;
        return (eVar == null && (eVar = this.t) == null) ? this.u : eVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        xw3.L(this.m, null, null, new z(this, null, 1), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h getAdLoader() {
        return this.v;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return this.x;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public void setAdShowListener(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        this.r = kVar;
        o oVar = this.s;
        if (oVar != null) {
            oVar.setAdShowListener(kVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.t;
        if (eVar == null) {
            eVar = this.u;
        }
        if (eVar != null) {
            eVar.setAdShowListener(kVar);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k getAdShowListener() {
        return this.r;
    }
}
