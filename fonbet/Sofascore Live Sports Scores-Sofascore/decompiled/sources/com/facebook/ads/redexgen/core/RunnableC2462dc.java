package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2462dc implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC2462dc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2329bT c2329bT;
        C2329bT c2329bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2329bT = this.A00.A07;
            if (c2329bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c2329bT2 = this.A00.A07;
                c2329bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
