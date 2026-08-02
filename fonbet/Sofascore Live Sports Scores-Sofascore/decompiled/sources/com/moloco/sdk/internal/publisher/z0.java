package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ a b;

    public z0(c1 c1Var, com.facebook.internal.t tVar) {
        this.a = c1Var;
        this.b = tVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public final void a(boolean z) {
        String str;
        c1 c1Var = this.a;
        com.moloco.sdk.internal.ortb.model.u uVar = c1Var.r;
        if (uVar != null && uVar.a && ((!z || uVar.b) && (str = uVar.c) != null)) {
            c1Var.e.a(str);
        }
        com.appsflyer.f fVar = c1Var.s;
        if (fVar != null) {
            fVar.invoke(Boolean.valueOf(z));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void b() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onAdClicked(MolocoAdKt.createAdInfo$default(this.a.d, null, null, 6, null));
        }
    }

    public final void c() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Ad skip button shown, triggering callback", null, false, 12, null);
        com.moloco.sdk.acm.services.d dVar = this.a.t;
        if (dVar != null) {
            dVar.invoke();
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        cVar.getClass();
        c1 c1Var = this.a;
        c1Var.b(com.moloco.sdk.internal.e0.a(c1Var.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, cVar));
    }
}
