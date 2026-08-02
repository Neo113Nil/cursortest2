package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2507eM {
    public ViewOnClickListenerC1850Kr A00;
    public final NN A01;
    public final NY A02;
    public final C1913Nd A03;
    public final C1922Nm A04;
    public final C2652gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C2507eM(C2652gi c2652gi, VA va, AbstractC2817jd abstractC2817jd) {
        this.A05 = c2652gi;
        this.A06 = new VI(abstractC2817jd.A2E(), va);
        this.A01 = abstractC2817jd.A28();
        this.A02 = abstractC2817jd.A29().A0I();
        this.A04 = abstractC2817jd.A2C();
        this.A03 = abstractC2817jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr) {
        C2352bq c2352bq = new C2352bq(this.A05, this.A01.A01(), true, false, false);
        c2352bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c2352bq.setAlignment(17);
        C2346bk c2346bk = new C2346bk(this.A05);
        YB.A0N(c2346bk, 0);
        c2346bk.setRadius(50);
        new LM(c2346bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c2346bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c2352bq, layoutParams);
        if (viewOnClickListenerC1850Kr != null) {
            YB.A0J(viewOnClickListenerC1850Kr);
            linearLayout.addView(viewOnClickListenerC1850Kr, layoutParams);
            viewOnClickListenerC1850Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC1850Kr.getText())) {
                YB.A0H(viewOnClickListenerC1850Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C2722hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC2506eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC2506eL.A03;
        }
        return EnumC2506eL.A02;
    }

    public final Pair<EnumC2506eL, View> A03(ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr) {
        View A01;
        this.A00 = viewOnClickListenerC1850Kr;
        EnumC2506eL A02 = A02();
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
