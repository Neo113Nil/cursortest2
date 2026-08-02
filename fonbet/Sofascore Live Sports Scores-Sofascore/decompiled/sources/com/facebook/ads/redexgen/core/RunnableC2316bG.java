package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2316bG implements Runnable {
    public final /* synthetic */ LK A00;

    public RunnableC2316bG(LK lk) {
        this.A00 = lk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() == 0) {
                this.A00.A0t(8);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
