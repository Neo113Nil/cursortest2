package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1789Ih implements InterfaceC2308b8 {
    public final /* synthetic */ C14715h A00;

    public C1789Ih(C14715h c14715h) {
        this.A00 = c14715h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2308b8
    public final void AE7(C2307b7 c2307b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c2307b7.A00() != null);
        this.A00.A07();
    }
}
