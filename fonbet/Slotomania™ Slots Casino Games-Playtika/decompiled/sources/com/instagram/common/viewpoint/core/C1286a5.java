package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1286a5 extends LinearLayout {
    public final Bitmap A00;

    public C1286a5(C1695gi c1695gi, EnumC1303aM enumC1303aM) {
        super(c1695gi);
        this.A00 = YN.A01(YM.AD_CHOICE_ICON);
        c1695gi.A0F().AAz(enumC1303aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c1695gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(XV.A0I, XV.A0I, XV.A0I, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        YB.A0N(this, -859190839);
        YB.A0E(XV.A0C, this);
    }

    private void setAdChoiceIcon(C1695gi c1695gi) {
        ImageView imageView = new ImageView(c1695gi);
        YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, XV.A0U));
        addView(imageView);
    }
}
