package com.vk.stories.design.view.stickerbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.stories.design.R$styleable;
import com.vkontakte.android.R;
import xsna.ao6;
import xsna.dhr0;
import xsna.iah0;
import xsna.s0w0;
import xsna.s3q0;

/* compiled from: SimpleIconStickerButton.kt */
/* loaded from: classes6.dex */
public final class SimpleIconStickerButton extends ao6 {
    public SimpleIconStickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        boolean z;
        setMinimumWidth(iah0.a(44));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
            i = obtainStyledAttributes.getResourceId(0, 0);
            i2 = obtainStyledAttributes.getResourceId(2, 0);
            z = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
            i2 = 0;
            z = true;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = new ImageView(context);
        if (i != 0) {
            imageView.setImageResource(i);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float f = 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams.setMarginEnd(i2 != 0 ? iah0.a(6) : 0);
        imageView.setLayoutParams(layoutParams);
        if (z) {
            imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_icon_contrast, context));
        } else {
            float f2 = 20;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iah0.a(f2), iah0.a(f2));
            int a = iah0.a(2);
            layoutParams2.setMargins(a, a, a, a);
            layoutParams2.setMarginEnd(iah0.a(8));
            imageView.setLayoutParams(layoutParams2);
            imageView.setOutlineProvider(new s0w0(iah0.a(5), 6));
            imageView.setClipToOutline(true);
        }
        TextView textView = new TextView(context);
        if (i2 != 0) {
            textView.setText(i2);
        }
        ao6.a(textView);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        addView(linearLayout, layoutParams3);
    }

    @Override // xsna.ao6
    public int getButtonCornerRadius() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius);
    }
}
