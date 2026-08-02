package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2466dg implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC2466dg(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2472dm interfaceC2472dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B = true;
            interfaceC2472dm = this.A00.A0Z;
            interfaceC2472dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
