package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4344uc implements InterfaceC4326tc {
    @Override // com.ironsource.InterfaceC4326tc
    public void a(@NotNull J9 j9, @NotNull C4362vc c4362vc) {
        j9.getClass();
        c4362vc.getClass();
        IronSourceNetwork.loadAd(j9, c4362vc.a());
    }

    @Override // com.ironsource.InterfaceC4326tc
    @NotNull
    public String a() {
        String version = IronSourceNetwork.getVersion();
        version.getClass();
        return version;
    }
}
