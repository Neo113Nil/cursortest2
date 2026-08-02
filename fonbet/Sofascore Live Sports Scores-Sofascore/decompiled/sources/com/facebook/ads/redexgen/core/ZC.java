package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZC extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 10.0f);
    public static final int A04 = (int) (XX.A02 * 24.0f);
    public final ImageView A00;
    public final C1942Og A01;
    public final C2652gi A02;

    public ZC(C2652gi c2652gi) {
        super(c2652gi);
        this.A02 = c2652gi;
        this.A01 = AbstractC1943Oh.A00(c2652gi.A02());
        this.A00 = new ImageView(c2652gi);
        A02();
    }

    private void A02() {
        A03(this.A00, YM.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, YM ym) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(YN.A01(ym));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1922Nm c1922Nm, String str, VI vi, InterfaceC2193Yh interfaceC2193Yh) {
        setOnClickListener(new ZB(this, vi, interfaceC2193Yh, str, c1922Nm));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
