package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class F9 extends C1390bl {
    public final ImageView A00;
    public final C1695gi A01;

    public F9(C1695gi c1695gi) {
        super(c1695gi);
        this.A01 = c1695gi;
        setRadius(30);
        this.A00 = new ImageView(c1695gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1350b7 c1350b7) {
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
        lm.A06(new InterfaceC1351b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.instagram.common.viewpoint.core.InterfaceC1351b8
            public final void AE7(C1350b7 c1350b7) {
                F9.this.A00(c1350b7);
            }
        });
    }
}
