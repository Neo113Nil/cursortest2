package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1849Kq extends AbstractRunnableC2139Wc {
    public final /* synthetic */ AbstractC2337bb A00;

    public C1849Kq(AbstractC2337bb abstractC2337bb) {
        this.A00 = abstractC2337bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC2337bb abstractC2337bb = this.A00;
            i = this.A00.A08;
            abstractC2337bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC2337bb abstractC2337bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC2337bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
