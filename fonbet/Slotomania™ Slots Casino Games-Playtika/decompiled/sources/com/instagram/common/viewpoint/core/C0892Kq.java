package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0892Kq extends AbstractRunnableC1182Wc {
    public final /* synthetic */ AbstractC1380bb A00;

    public C0892Kq(AbstractC1380bb abstractC1380bb) {
        this.A00 = abstractC1380bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC1380bb abstractC1380bb = this.A00;
            i = this.A00.A08;
            abstractC1380bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC1380bb abstractC1380bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC1380bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
