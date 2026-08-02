package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0929Mb implements XN {
    public final /* synthetic */ MW A00;

    public C0929Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C0929Mb(MW mw, C0940Mm c0940Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z;
        C0967No c0967No;
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
            c0967No = this.A00.A0H;
            if (c0967No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        C0967No c0967No;
        C0967No c0967No2;
        c0967No = this.A00.A0H;
        if (c0967No.A0A() > 0) {
            c0967No2 = this.A00.A0H;
            if (f == c0967No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
