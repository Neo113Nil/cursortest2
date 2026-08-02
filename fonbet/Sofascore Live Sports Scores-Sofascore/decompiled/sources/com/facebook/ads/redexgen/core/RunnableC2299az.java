package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2299az implements Runnable {
    public final /* synthetic */ C2300b0 A00;
    public final /* synthetic */ InterfaceC2301b1 A01;

    public RunnableC2299az(C2300b0 c2300b0, InterfaceC2301b1 interfaceC2301b1) {
        this.A00 = c2300b0;
        this.A01 = interfaceC2301b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
