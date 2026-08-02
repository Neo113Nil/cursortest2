package com.fyber.inneractive.sdk.renderers;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o implements com.fyber.inneractive.sdk.player.e {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.a.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.a.k).y();
        }
    }
}
