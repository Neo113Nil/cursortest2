package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1550eM {
    public ViewOnClickListenerC0893Kr A00;
    public final NN A01;
    public final NY A02;
    public final C0956Nd A03;
    public final C0965Nm A04;
    public final C1695gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1550eM(C1695gi c1695gi, VA va, AbstractC1860jd abstractC1860jd) {
        this.A05 = c1695gi;
        this.A06 = new VI(abstractC1860jd.A2E(), va);
        this.A01 = abstractC1860jd.A28();
        this.A02 = abstractC1860jd.A29().A0I();
        this.A04 = abstractC1860jd.A2C();
        this.A03 = abstractC1860jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr) {
        C1395bq c1395bq = new C1395bq(this.A05, this.A01.A01(), true, false, false);
        c1395bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1395bq.setAlignment(17);
        C1389bk c1389bk = new C1389bk(this.A05);
        YB.A0N(c1389bk, 0);
        c1389bk.setRadius(50);
        new LM(c1389bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1389bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1395bq, layoutParams);
        if (viewOnClickListenerC0893Kr != null) {
            YB.A0J(viewOnClickListenerC0893Kr);
            linearLayout.addView(viewOnClickListenerC0893Kr, layoutParams);
            viewOnClickListenerC0893Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC0893Kr.getText())) {
                YB.A0H(viewOnClickListenerC0893Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C1765hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1549eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1549eL.A03;
        }
        return EnumC1549eL.A02;
    }

    public final Pair<EnumC1549eL, View> A03(ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr) {
        View A01;
        this.A00 = viewOnClickListenerC0893Kr;
        EnumC1549eL A02 = A02();
        switch (A02) {
            case A03:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        VK.A04(A01, this.A06, VH.A0S);
        return new Pair<>(A02, A01);
    }
}
