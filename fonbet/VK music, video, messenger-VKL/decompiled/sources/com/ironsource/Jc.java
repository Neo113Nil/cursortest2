package com.ironsource;

import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public final class Jc implements Ic {
    private E2 a;
    private WeakReference<G2> b = new WeakReference<>(null);

    public final void a(E2 e2) {
        this.a = e2;
    }

    @Override // com.ironsource.Ic
    public void onBannerClick() {
        G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerClick();
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadFail(String str) {
        E2 e2 = this.a;
        if (e2 != null) {
            e2.onBannerLoadFail(str);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadSuccess(K9 k9, C4331g8 c4331g8) {
        E2 e2 = this.a;
        if (e2 != null) {
            e2.onBannerLoadSuccess(k9, c4331g8);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerShowSuccess() {
        G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerShowSuccess();
        }
    }

    public final void a(G2 g2) {
        this.b = new WeakReference<>(g2);
    }

    @Override // com.ironsource.Ic
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Ic
    public void onBannerInitFailed(String str) {
    }
}
