package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1377bY extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C1854jT A02;
    public final C1695gi A03;
    public final VA A04;
    public final InterfaceC1236Yh A05;

    public C1377bY(C1695gi c1695gi, C1854jT c1854jT, VA va, InterfaceC1236Yh interfaceC1236Yh, int i, int i2) {
        super(c1695gi);
        this.A03 = c1695gi;
        this.A02 = c1854jT;
        this.A04 = va;
        this.A05 = interfaceC1236Yh;
        this.A00 = i;
        this.A01 = new LinearLayout(c1695gi);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i2);
    }

    private void A00() {
        int i = 0;
        while (true) {
            int A23 = this.A02.A23();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int charAt = str.charAt(18);
            int i2 = str2.charAt(18);
            if (charAt == i2) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i < A23) {
                LF lf = new LF(this.A03, this.A02.A27(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i3 = LF.A0C;
                int i4 = LF.A0C;
                int i5 = LF.A0C;
                int i6 = LF.A0C;
                layoutParams.setMargins(i3, i4, i5, i6);
                lf.setLayoutParams(layoutParams);
                this.A01.addView(lf);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
        }
    }
}
