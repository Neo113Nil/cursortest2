package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1402bx implements Runnable {
    public final /* synthetic */ C0878Kc A00;

    public RunnableC1402bx(C0878Kc c0878Kc) {
        this.A00 = c0878Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1408c3) this.A00).A07.A0D() != null) {
                ((AbstractC1408c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
