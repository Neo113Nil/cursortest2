package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class MD extends AbstractC2215Zd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C1942Og A04;
    public final C2652gi A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (XX.A02 * 4.0f);
        A08 = (int) (XX.A02 * 10.0f);
        A07 = (int) (XX.A02 * 44.0f);
    }

    public MD(C2652gi c2652gi, VA va, String str) {
        super(c2652gi, va, str);
        this.A05 = c2652gi;
        this.A04 = AbstractC1943Oh.A00(c2652gi.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        YB.A0N(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0O() {
        this.A01.setImageBitmap(YN.A01(YM.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC2224Zm(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C2219Zh c2219Zh = new C2219Zh(this.A05);
        c2219Zh.setData(this.A04.A0H(), YM.HIDE_AD);
        c2219Zh.setOnClickListener(new ViewOnClickListenerC2225Zn(this, c2219Zh));
        C2219Zh c2219Zh2 = new C2219Zh(this.A05);
        c2219Zh2.setData(this.A04.A0L(), YM.REPORT_AD);
        c2219Zh2.setOnClickListener(new ViewOnClickListenerC2226Zo(this, c2219Zh2));
        C2219Zh c2219Zh3 = new C2219Zh(this.A05);
        c2219Zh3.setData(this.A04.A0M(), YM.AD_CHOICES_ICON);
        c2219Zh3.setOnClickListener(new ViewOnClickListenerC2227Zp(this, c2219Zh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        YB.A0W(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c2219Zh, layoutParams);
        this.A02.addView(c2219Zh2, layoutParams);
        this.A02.addView(c2219Zh3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0Q(C1946Ok c1946Ok, EnumC1944Oi enumC1944Oi) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        YB.A0W(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
        super.A0Q(c1946Ok, enumC1944Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0R(C1946Ok c1946Ok, EnumC1944Oi enumC1944Oi) {
        YB.A0W(this.A03);
        this.A01.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC2228Zq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C1946Ok c1946Ok2 : c1946Ok.A05()) {
            C2219Zh c2219Zh = new C2219Zh(this.A05);
            c2219Zh.setData(c1946Ok2.A04(), null);
            c2219Zh.setOnClickListener(new ViewOnClickListenerC2229Zr(this, c2219Zh, c1946Ok2));
            this.A02.addView(c2219Zh, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final boolean A0S() {
        return true;
    }
}
