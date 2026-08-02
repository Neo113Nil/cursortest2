package com.inmobi.media;

import com.squareup.picasso.Callback;
import defpackage.lj2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3792u implements Callback {
    public final /* synthetic */ C3844w a;
    public final /* synthetic */ lj2 b;

    public C3792u(C3844w c3844w, lj2 lj2Var) {
        this.a = c3844w;
        this.b = lj2Var;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C3906y9 c3906y9 = this.a.d;
        if (c3906y9 != null) {
            c3906y9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        X4.a(this.b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C3906y9 c3906y9 = this.a.d;
        if (c3906y9 != null) {
            c3906y9.a("AdChoiceViewManager", "onSuccess Called");
        }
        X4.a(this.b, Boolean.TRUE);
    }
}
