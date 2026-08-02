package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ic implements Hc {
    private E2 a;
    private WeakReference<G2> b = new WeakReference<>(null);

    public final void a(E2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.a = loadListener;
    }

    @Override // com.ironsource.Hc
    public void onBannerClick() {
        G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerClick();
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.Hc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        E2 e2 = this.a;
        if (e2 != null) {
            e2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadSuccess(J9 adInstance, C2417f8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        E2 e2 = this.a;
        if (e2 != null) {
            e2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerShowSuccess() {
        G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerShowSuccess();
        }
    }

    public final void a(G2 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
