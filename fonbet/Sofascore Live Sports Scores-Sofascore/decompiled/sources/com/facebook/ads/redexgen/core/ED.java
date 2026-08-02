package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC2540eu {
    public C1689Ek A00;

    public ED(C2652gi c2652gi) {
        super(c2652gi);
    }

    public ED(C2652gi c2652gi, AttributeSet attributeSet, int i) {
        super(c2652gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540eu
    public final void AAv(C1689Ek c1689Ek) {
        this.A00 = c1689Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540eu
    public final void AKV(C1689Ek c1689Ek) {
        A08();
        this.A00 = null;
    }

    public C1689Ek getVideoView() {
        return this.A00;
    }
}
