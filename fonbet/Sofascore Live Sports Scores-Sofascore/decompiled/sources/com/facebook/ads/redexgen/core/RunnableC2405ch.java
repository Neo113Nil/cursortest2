package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2405ch implements Runnable {
    public final /* synthetic */ C1815Ji A00;

    public RunnableC2405ch(C1815Ji c1815Ji) {
        this.A00 = c1815Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2329bT c2329bT;
        C2329bT c2329bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2329bT = this.A00.A09;
            if (c2329bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c2329bT2 = this.A00.A09;
                c2329bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
