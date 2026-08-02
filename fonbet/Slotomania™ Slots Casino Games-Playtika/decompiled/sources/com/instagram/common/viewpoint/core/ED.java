package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1583eu {
    public C0732Ek A00;

    public ED(C1695gi c1695gi) {
        super(c1695gi);
    }

    public ED(C1695gi c1695gi, AttributeSet attributeSet, int i) {
        super(c1695gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1583eu
    public final void AAv(C0732Ek c0732Ek) {
        this.A00 = c0732Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1583eu
    public final void AKV(C0732Ek c0732Ek) {
        A08();
        this.A00 = null;
    }

    public C0732Ek getVideoView() {
        return this.A00;
    }
}
