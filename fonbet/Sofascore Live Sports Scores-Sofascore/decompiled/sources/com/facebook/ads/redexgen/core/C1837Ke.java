package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1837Ke implements InterfaceC2308b8 {
    public final WeakReference<C6M> A00;

    public C1837Ke(C6M c6m) {
        this.A00 = new WeakReference<>(c6m);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2308b8
    public final void AE7(C2307b7 c2307b7) {
        C6M c6m = this.A00.get();
        if (c6m != null) {
            c6m.A04 = c2307b7.A00() != null;
            c6m.A02();
        }
    }
}
