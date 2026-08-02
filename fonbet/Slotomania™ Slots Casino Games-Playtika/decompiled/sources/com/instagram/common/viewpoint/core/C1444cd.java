package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1444cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0893Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1444cd(C1695gi c1695gi, ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr, AbstractC1860jd abstractC1860jd, VA va, InterfaceC1236Yh interfaceC1236Yh, C1640fp c1640fp, Y2 y2, C0953Na c0953Na, InterfaceC1373bU interfaceC1373bU) {
        super(c1695gi);
        this.A00 = c0953Na.A09(true);
        this.A01 = new RelativeLayout(c1695gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1695gi, abstractC1860jd.A29().A0J().A04());
        if (viewOnClickListenerC0893Kr == null) {
            this.A02 = new ViewOnClickListenerC0893Kr(c1695gi, abstractC1860jd.A0w(), (C0953Na) null, va, interfaceC1236Yh, c1640fp, y2, abstractC1860jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC0893Kr;
        }
        A03();
        this.A02.setCta(abstractC1860jd.A29().A0J(), abstractC1860jd.A2E(), new HashMap(), interfaceC1373bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1695gi c1695gi, View view) {
        ImageView imageView = new ImageView(c1695gi);
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

    private void A01(C1695gi c1695gi, String str) {
        Button button = new Button(c1695gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1695gi, button);
    }

    public final EnumC0944Mq A02(String str) {
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

    public void setAutoClickTime(AbstractC1860jd abstractC1860jd, AbstractC1230Yb abstractC1230Yb) {
        this.A02.A0F(abstractC1860jd, abstractC1230Yb);
    }

    public void setCta(C0955Nc c0955Nc, String str, HashMap<String, String> extras, InterfaceC1373bU interfaceC1373bU) {
        this.A02.setCta(c0955Nc, str, extras, interfaceC1373bU);
    }
}
