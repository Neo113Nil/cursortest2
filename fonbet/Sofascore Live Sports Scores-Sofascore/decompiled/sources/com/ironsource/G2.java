package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class G2 implements F2 {

    @NotNull
    private final InterfaceC4262q1 a;

    @NotNull
    private final Executor b;

    public G2(@NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull Executor executor) {
        interfaceC4262q1.getClass();
        executor.getClass();
        this.a = interfaceC4262q1;
        this.b = executor;
    }

    @Override // com.ironsource.F2
    @NotNull
    public BannerAdView a(@NotNull J9 j9, @NotNull C4036d8 c4036d8, @NotNull W1 w1) {
        j9.getClass();
        c4036d8.getClass();
        w1.getClass();
        return new BannerAdView(new N2(j9, c4036d8, w1, this.a, null, null, null, null, null, 496, null));
    }
}
