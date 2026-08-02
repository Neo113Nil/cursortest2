package com.ironsource;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ic implements Hc {

    @Nullable
    private C2 a;

    @NotNull
    private WeakReference<E2> b = new WeakReference<>(null);

    public final void a(@NotNull E2 e2) {
        e2.getClass();
        this.b = new WeakReference<>(e2);
    }

    @Override // com.ironsource.Hc
    public void onBannerClick() {
        E2 e2 = this.b.get();
        if (e2 != null) {
            e2.onBannerClick();
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadFail(@NotNull String str) {
        str.getClass();
        C2 c2 = this.a;
        if (c2 != null) {
            c2.onBannerLoadFail(str);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadSuccess(@NotNull J9 j9, @NotNull C4036d8 c4036d8) {
        j9.getClass();
        c4036d8.getClass();
        C2 c2 = this.a;
        if (c2 != null) {
            c2.onBannerLoadSuccess(j9, c4036d8);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerShowSuccess() {
        E2 e2 = this.b.get();
        if (e2 != null) {
            e2.onBannerShowSuccess();
        }
    }

    public final void a(@NotNull C2 c2) {
        c2.getClass();
        this.a = c2;
    }

    @Override // com.ironsource.Hc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Hc
    public void onBannerInitFailed(@Nullable String str) {
    }
}
