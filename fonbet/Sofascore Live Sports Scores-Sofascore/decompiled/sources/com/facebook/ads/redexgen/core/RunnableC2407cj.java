package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2407cj implements Runnable {
    public final /* synthetic */ C1815Ji A00;

    public RunnableC2407cj(C1815Ji c1815Ji) {
        this.A00 = c1815Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2369c7 c2369c7;
        C2369c7 c2369c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c2369c7 = this.A00.A0b;
            if (c2369c7.A0D() != null) {
                c2369c72 = this.A00.A0b;
                c2369c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
