package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class F9 extends C2347bl {
    public final ImageView A00;
    public final C2652gi A01;

    public F9(C2652gi c2652gi) {
        super(c2652gi);
        this.A01 = c2652gi;
        setRadius(30);
        this.A00 = new ImageView(c2652gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C2307b7 c2307b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        LM lm = new LM(this.A00, this.A01);
        lm.A04();
        lm.A07(str);
        lm.A06(new InterfaceC2308b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.facebook.ads.redexgen.core.InterfaceC2308b8
            public final void AE7(C2307b7 c2307b7) {
                F9.this.A00(c2307b7);
            }
        });
    }
}
