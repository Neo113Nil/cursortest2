package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2448dO implements Runnable {
    public final /* synthetic */ C5S A00;

    public RunnableC2448dO(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2472dm interfaceC2472dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            interfaceC2472dm = this.A00.A0P;
            interfaceC2472dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
