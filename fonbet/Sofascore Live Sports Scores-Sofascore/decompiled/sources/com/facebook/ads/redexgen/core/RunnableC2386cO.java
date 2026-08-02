package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2386cO implements Runnable {
    public final /* synthetic */ KE A00;

    public RunnableC2386cO(KE ke) {
        this.A00 = ke;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (z) {
                this.A00.A0K();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
