package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class c implements b {
    public final b a;

    public c(b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        this.a.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        this.a.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
        this.a.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public void onFailure(VungleError vungleError) {
        vungleError.getClass();
        this.a.onFailure(vungleError);
    }
}
