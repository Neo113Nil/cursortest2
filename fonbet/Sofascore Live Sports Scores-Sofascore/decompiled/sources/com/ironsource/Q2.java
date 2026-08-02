package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q2 extends C4296s0 {

    @Nullable
    private final ISBannerSize b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(@NotNull C4100h0 c4100h0, @Nullable ISBannerSize iSBannerSize) {
        super(c4100h0);
        c4100h0.getClass();
        this.b = iSBannerSize;
    }

    @Override // com.ironsource.C4296s0, com.ironsource.InterfaceC4120i2
    public void a(@NotNull com.ironsource.mediationsdk.h hVar) {
        hVar.getClass();
        super.a(hVar);
        hVar.a(this.b);
    }
}
