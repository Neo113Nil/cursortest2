package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1886Mb implements XN {
    public final /* synthetic */ MW A00;

    public C1886Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1886Mb(MW mw, C1897Mm c1897Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z;
        C1924No c1924No;
        boolean z2;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z = this.A00.A0T;
            if (!z) {
                z2 = this.A00.A0D;
                if (z2) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c1924No = this.A00.A0H;
            if (c1924No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        C1924No c1924No;
        C1924No c1924No2;
        c1924No = this.A00.A0H;
        if (c1924No.A0A() > 0) {
            c1924No2 = this.A00.A0H;
            if (f == c1924No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
