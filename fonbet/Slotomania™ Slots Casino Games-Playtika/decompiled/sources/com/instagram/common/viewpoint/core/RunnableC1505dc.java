package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1505dc implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC1505dc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1372bT c1372bT;
        C1372bT c1372bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1372bT = this.A00.A07;
            if (c1372bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1372bT2 = this.A00.A07;
                c1372bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
