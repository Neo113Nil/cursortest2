package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2401cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1850Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C2401cd(C2652gi c2652gi, ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr, AbstractC2817jd abstractC2817jd, VA va, InterfaceC2193Yh interfaceC2193Yh, C2597fp c2597fp, Y2 y2, C1910Na c1910Na, InterfaceC2330bU interfaceC2330bU) {
        super(c2652gi);
        this.A00 = c1910Na.A09(true);
        this.A01 = new RelativeLayout(c2652gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c2652gi, abstractC2817jd.A29().A0J().A04());
        if (viewOnClickListenerC1850Kr == null) {
            this.A02 = new ViewOnClickListenerC1850Kr(c2652gi, abstractC2817jd.A0w(), (C1910Na) null, va, interfaceC2193Yh, c2597fp, y2, abstractC2817jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC1850Kr;
        }
        A03();
        this.A02.setCta(abstractC2817jd.A29().A0J(), abstractC2817jd.A2E(), new HashMap(), interfaceC2330bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C2652gi c2652gi, View view) {
        ImageView imageView = new ImageView(c2652gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C2652gi c2652gi, String str) {
        Button button = new Button(c2652gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c2652gi, button);
    }

    public final EnumC1901Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2817jd abstractC2817jd, AbstractC2187Yb abstractC2187Yb) {
        this.A02.A0F(abstractC2817jd, abstractC2187Yb);
    }

    public void setCta(C1912Nc c1912Nc, String str, HashMap<String, String> extras, InterfaceC2330bU interfaceC2330bU) {
        this.A02.setCta(c1912Nc, str, extras, interfaceC2330bU);
    }
}
