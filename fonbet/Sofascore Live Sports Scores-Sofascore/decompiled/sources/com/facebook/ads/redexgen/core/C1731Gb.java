package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1731Gb implements InterfaceC2308b8 {
    public final /* synthetic */ C14614x A00;

    public C1731Gb(C14614x c14614x) {
        this.A00 = c14614x;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2308b8
    public final void AE7(C2307b7 c2307b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c2307b7.A00() != null);
        this.A00.A06();
    }
}
