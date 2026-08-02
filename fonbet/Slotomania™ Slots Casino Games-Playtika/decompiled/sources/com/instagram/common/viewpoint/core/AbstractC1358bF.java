package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1358bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1695gi A07;
    public final ViewOnClickListenerC0893Kr A08;
    public final C1389bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1358bF(C1695gi c1695gi, ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr, int i, C0953Na c0953Na, boolean z, String str, VA va, InterfaceC1236Yh interfaceC1236Yh, C1640fp c1640fp, Y2 y2, C0959Ng c0959Ng, boolean z2, String str2) {
        super(c1695gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1695gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C1389bk(c1695gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c1695gi);
            this.A01 = new TextView(c1695gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC0893Kr == null) {
            this.A08 = new ViewOnClickListenerC0893Kr(c1695gi, str, c0953Na, z, va, interfaceC1236Yh, c1640fp, y2, c0959Ng);
        } else {
            this.A08 = viewOnClickListenerC0893Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1399bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1695gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC0893Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C0955Nc c0955Nc, String str, String str2, InterfaceC1210Xh interfaceC1210Xh, InterfaceC1373bU interfaceC1373bU) {
        this.A08.setCta(c0955Nc, str, new HashMap(), interfaceC1210Xh, interfaceC1373bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
