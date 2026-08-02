package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import defpackage.fdi;
import defpackage.u53;
import defpackage.vke;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c implements vke {
    public final /* synthetic */ u53 a;

    public c(u53 u53Var) {
        this.a = u53Var;
    }

    @Override // defpackage.vke
    public final void onIsPlayingChanged(boolean z) {
        fdi fdiVar = (fdi) this.a.e;
        d dVar = new d(z, true, true);
        fdiVar.getClass();
        fdiVar.m(null, dVar);
    }
}
