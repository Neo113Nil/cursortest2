package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.fcp;
import defpackage.ku3;
import defpackage.pdk;
import defpackage.v98;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {
    public final Context g;
    public final com.moloco.sdk.internal.services.events.c h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s i;
    public final t0 j;
    public final ku3 k;
    public final n l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m m;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar, t0 t0Var, ad2 ad2Var, n nVar) {
        super(ad2Var, context);
        context.getClass();
        t0Var.getClass();
        ad2Var.getClass();
        this.g = context;
        this.h = cVar;
        this.i = sVar;
        this.j = t0Var;
        this.k = ad2Var;
        this.l = nVar;
        setTag("MolocoVastBannerView");
        this.m = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        aeh aehVar;
        com.moloco.sdk.internal.l0 l0Var = getAdLoader().g;
        if (l0Var instanceof com.moloco.sdk.internal.j0) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.j0) l0Var).a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) getAdShowListener();
            if (rVar != null) {
                rVar.a(cVar);
                return;
            }
            return;
        }
        if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
            zzl.b();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.k0) l0Var).a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar = this.i;
        boolean z = sVar.a;
        Boolean bool = sVar.b;
        int i = sVar.c;
        int i2 = sVar.d;
        int i3 = sVar.e;
        boolean z2 = sVar.f;
        boolean z3 = sVar.g;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar = sVar.k;
        t0 t0Var = this.j;
        t0Var.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m b = com.facebook.appevents.g.b(aVar, t0Var, this.g, this.h, z, bool, i, i2, i3, z2, z3, jVar, new com.facebook.c0(t0Var));
        this.n = b;
        try {
            setAdView((View) sVar.h.invoke(this.g, b));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = this.n;
            if (mVar != null && (aehVar = mVar.i) != null) {
                fcp.m0(new v98(aehVar, new pdk(this, null, 21), 3), this.k);
            }
            b.d();
        } catch (ClassNotFoundException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastBannerView", "Compose dependency not available, cannot render VAST banner ad", e, false, 8, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) getAdShowListener();
            if (rVar2 != null) {
                rVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.e);
            }
        } catch (NoClassDefFoundError e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastBannerView", "Compose dependency not available, cannot render VAST banner ad", e2, false, 8, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) getAdShowListener();
            if (rVar3 != null) {
                rVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.e);
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = this.n;
        if (mVar != null) {
            mVar.destroy();
        }
        this.n = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public n getAdLoader() {
        return this.l;
    }
}
