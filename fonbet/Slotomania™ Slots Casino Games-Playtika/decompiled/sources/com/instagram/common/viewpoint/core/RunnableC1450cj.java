package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1450cj implements Runnable {
    public final /* synthetic */ C0858Ji A00;

    public RunnableC1450cj(C0858Ji c0858Ji) {
        this.A00 = c0858Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1412c7 c1412c7;
        C1412c7 c1412c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c1412c7 = this.A00.A0b;
            if (c1412c7.A0D() != null) {
                c1412c72 = this.A00.A0b;
                c1412c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
