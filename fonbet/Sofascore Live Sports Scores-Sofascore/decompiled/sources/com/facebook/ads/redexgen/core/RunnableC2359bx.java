package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2359bx implements Runnable {
    public final /* synthetic */ C1835Kc A00;

    public RunnableC2359bx(C1835Kc c1835Kc) {
        this.A00 = c1835Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC2365c3) this.A00).A07.A0D() != null) {
                ((AbstractC2365c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
