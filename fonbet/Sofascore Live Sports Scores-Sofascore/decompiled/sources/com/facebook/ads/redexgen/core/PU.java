package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC2187Yb {
    public static byte[] A03;
    public C2652gi A00;
    public InterfaceC2186Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C2652gi c2652gi, AbstractC2817jd abstractC2817jd, int i) {
        super(c2652gi);
        this.A00 = c2652gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC2817jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC2203Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public final void A0C(float f, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public final void A0D(C1910Na c1910Na, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public int getToolbarHeight() {
        return AbstractC2187Yb.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public InterfaceC2186Ya getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setCTAClickListener(ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setPageDetails(C1922Nm c1922Nm, String str, int i, C1928Ns c1928Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setProgress(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2187Yb
    public void setToolbarListener(InterfaceC2186Ya interfaceC2186Ya) {
        this.A01 = interfaceC2186Ya;
    }
}
