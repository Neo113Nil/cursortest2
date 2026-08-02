package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public final r a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o b;

    public s(r rVar, com.moloco.sdk.internal.publisher.nativead.n nVar) {
        this.a = rVar;
        this.b = nVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar = this.b;
        if (oVar != null) {
            oVar.destroy();
        }
    }
}
