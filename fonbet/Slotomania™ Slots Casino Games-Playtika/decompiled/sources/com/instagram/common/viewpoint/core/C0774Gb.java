package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0774Gb implements InterfaceC1351b8 {
    public final /* synthetic */ C05044x A00;

    public C0774Gb(C05044x c05044x) {
        this.A00 = c05044x;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1351b8
    public final void AE7(C1350b7 c1350b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c1350b7.A00() != null);
        this.A00.A06();
    }
}
