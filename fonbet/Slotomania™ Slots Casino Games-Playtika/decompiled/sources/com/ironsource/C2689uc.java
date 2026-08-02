package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2689uc implements InterfaceC2671tc {
    @Override // com.ironsource.InterfaceC2671tc
    public void a(J9 adInstance, C2707vc loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC2671tc
    public String a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}
