package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {
    public final /* synthetic */ q0 a;

    public p0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        cVar.getClass();
        q0 q0Var = this.a;
        q0Var.b(com.moloco.sdk.internal.e0.a(q0Var.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, cVar));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void b() {
        q0 q0Var = this.a;
        com.facebook.internal.t tVar = q0Var.v;
        if (tVar != null) {
            tVar.onAdClicked(MolocoAdKt.createAdInfo$default(q0Var.d, null, null, 6, null));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public final void a(boolean z) {
    }
}
