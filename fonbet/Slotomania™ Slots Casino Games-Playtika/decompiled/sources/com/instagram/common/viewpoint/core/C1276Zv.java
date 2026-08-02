package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1276Zv extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 40.0f);
    public static final int A04 = (int) (XX.A02 * 20.0f);
    public static final int A05 = (int) (XX.A02 * 10.0f);
    public final C0989Ok A00;
    public final C1695gi A01;
    public final InterfaceC1260Zf A02;

    public C1276Zv(C1695gi c1695gi, C0989Ok c0989Ok, InterfaceC1260Zf interfaceC1260Zf, YM ym) {
        this(c1695gi, c0989Ok, interfaceC1260Zf, null, ym);
    }

    public C1276Zv(C1695gi c1695gi, C0989Ok c0989Ok, InterfaceC1260Zf interfaceC1260Zf, String str, YM ym) {
        super(c1695gi);
        this.A01 = c1695gi;
        this.A00 = c0989Ok;
        this.A02 = interfaceC1260Zf;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(ym, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        C1282a1 A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(YM ym, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(YN.A01(ym));
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(YN.A01(YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC1274Zt(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C1282a1 A03() {
        C1282a1 c1282a1 = new C1282a1(this.A01);
        for (C0989Ok c0989Ok : this.A00.A05()) {
            C1262Zh c1262Zh = new C1262Zh(this.A01);
            c1262Zh.setData(c0989Ok.A04(), null);
            c1262Zh.setOnClickListener(new ViewOnClickListenerC1275Zu(this, c1262Zh, c0989Ok));
            c1282a1.addView(c1262Zh);
        }
        return c1282a1;
    }
}
