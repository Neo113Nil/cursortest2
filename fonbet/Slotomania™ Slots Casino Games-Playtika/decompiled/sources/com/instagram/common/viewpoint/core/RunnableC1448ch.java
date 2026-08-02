package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1448ch implements Runnable {
    public final /* synthetic */ C0858Ji A00;

    public RunnableC1448ch(C0858Ji c0858Ji) {
        this.A00 = c0858Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1372bT c1372bT;
        C1372bT c1372bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1372bT = this.A00.A09;
            if (c1372bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1372bT2 = this.A00.A09;
                c1372bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
