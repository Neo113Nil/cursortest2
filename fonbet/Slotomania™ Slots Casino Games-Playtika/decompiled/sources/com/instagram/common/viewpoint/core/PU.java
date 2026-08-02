package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1230Yb {
    public static byte[] A03;
    public C1695gi A00;
    public InterfaceC1229Ya A01;
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

    public PU(C1695gi c1695gi, AbstractC1860jd abstractC1860jd, int i) {
        super(c1695gi);
        this.A00 = c1695gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC1860jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1246Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public final void A0C(float f, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public final void A0D(C0953Na c0953Na, boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public int getToolbarHeight() {
        return AbstractC1230Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public InterfaceC1229Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setCTAClickListener(ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setPageDetails(C0965Nm c0965Nm, String str, int i, C0971Ns c0971Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setProgress(float f) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1230Yb
    public void setToolbarListener(InterfaceC1229Ya interfaceC1229Ya) {
        this.A01 = interfaceC1229Ya;
    }
}
