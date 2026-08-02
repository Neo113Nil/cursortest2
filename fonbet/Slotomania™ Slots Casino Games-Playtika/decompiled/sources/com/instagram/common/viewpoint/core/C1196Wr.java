package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1196Wr extends AbstractRunnableC1182Wc {
    public final /* synthetic */ Wm A00;

    public C1196Wr(Wm wm) {
        this.A00 = wm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        long j;
        long j2;
        Wm.A00(this.A00);
        j = this.A00.A01;
        if (j > 0) {
            try {
                j2 = this.A00.A01;
                Thread.sleep(j2);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
