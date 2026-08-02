package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1256Zb extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C0985Og A02;
    public final C1695gi A03;
    public final InterfaceC1260Zf A04;
    public final boolean A05;
    public static final int A09 = (int) (XX.A02 * 16.0f);
    public static final int A0A = (int) (XX.A02 * 8.0f);
    public static final int A0D = (int) (XX.A02 * 44.0f);
    public static final int A08 = (int) (XX.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (XX.A02 * 75.0f);
    public static final int A0B = (int) (XX.A02 * 25.0f);
    public static final int A0F = (int) (XX.A02 * 45.0f);
    public static final int A0C = (int) (XX.A02 * 15.0f);
    public static final int A06 = (int) (XX.A02 * 16.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1256Zb(C1255Za c1255Za) {
        super(r0);
        C1695gi c1695gi;
        C1695gi c1695gi2;
        InterfaceC1260Zf interfaceC1260Zf;
        boolean z;
        boolean z2;
        boolean z3;
        c1695gi = c1255Za.A0B;
        c1695gi2 = c1255Za.A0B;
        this.A03 = c1695gi2;
        this.A02 = AbstractC0986Oh.A00(this.A03.A02());
        interfaceC1260Zf = c1255Za.A02;
        this.A04 = interfaceC1260Zf;
        z = c1255Za.A0A;
        this.A01 = z ? A0E : A0F;
        z2 = c1255Za.A0A;
        this.A00 = z2 ? A0B : A0C;
        z3 = c1255Za.A07;
        this.A05 = z3;
        setFocusable(true);
        View A01 = A01(c1255Za);
        View A00 = A00(c1255Za);
        View footerView = getFooterView();
        YB.A0K(A01);
        YB.A0K(A00);
        YB.A0K(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, A01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(A01, contentParams);
        addView(A00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(0);
    }

    public /* synthetic */ C1256Zb(C1255Za c1255Za, ZY zy) {
        this(c1255Za);
    }

    private View A00(C1255Za c1255Za) {
        YM ym;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        ym = c1255Za.A01;
        imageView.setImageBitmap(YN.A01(ym));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i = c1255Za.A00;
        gradientDrawable.setColor(i);
        YB.A0V(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        YB.A0a(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        str = c1255Za.A06;
        subtitleView.setText(str);
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        YB.A0a(titleView, false, 16);
        titleView.setTextColor(-10459280);
        str2 = c1255Za.A05;
        titleView.setText(str2);
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        z = c1255Za.A08;
        if (z) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = c1255Za.A04;
            if (!TextUtils.isEmpty(str3)) {
                C1389bk c1389bk = new C1389bk(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c1389bk.setFullCircleCorners(true);
                LM A05 = new LM(c1389bk, this.A03).A05(A0F, A0F);
                str5 = c1255Za.A04;
                A05.A07(str5);
                linearLayout2.addView(c1389bk, iconParams);
            }
            C1262Zh c1262Zh = new C1262Zh(this.A03);
            str4 = c1255Za.A03;
            c1262Zh.setData(str4, YM.CHECKMARK);
            c1262Zh.setSelected(true);
            linearLayout2.addView(c1262Zh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C1255Za c1255Za) {
        boolean z;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z = c1255Za.A09;
        if (z) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(YN.A01(YM.CROSS));
            imageView.setOnClickListener(new ZY(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(YN.A01(YM.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        YB.A0a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ZZ(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
