package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0832Ih implements InterfaceC1351b8 {
    public final /* synthetic */ C05145h A00;

    public C0832Ih(C05145h c05145h) {
        this.A00 = c05145h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1351b8
    public final void AE7(C1350b7 c1350b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c1350b7.A00() != null);
        this.A00.A07();
    }
}
