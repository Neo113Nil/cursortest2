package com.vk.stories.design.view.stickerbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.stories.design.R$styleable;
import com.vkontakte.android.R;
import xsna.ao6;
import xsna.dhr0;
import xsna.hav0;
import xsna.iah0;
import xsna.s3q0;

/* compiled from: ImageStickerButton.kt */
/* loaded from: classes6.dex */
public final class ImageStickerButton extends ao6 {
    public ImageStickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        int i3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
            i = obtainStyledAttributes.getResourceId(2, 0);
            i2 = obtainStyledAttributes.getResourceId(0, 0);
            i3 = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.setOutlineProvider(hav0.c);
        frameLayout.setClipToOutline(true);
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (i2 != 0) {
            vkImage.setImageResource(i2);
        }
        float f = 96;
        frameLayout.addView(vkImage, new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f)));
        if (i3 != 0) {
            ImageView imageView = new ImageView(context);
            float f2 = 42;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f2), 17));
            int a = iah0.a(9);
            imageView.setPadding(a, a, a, a);
            int Y = dhr0.Y(R.attr.vk_ui_icon_contrast, context);
            int Y2 = dhr0.Y(R.attr.vk_ui_icon_primary_invariably, context);
            imageView.setBackgroundColor(Y);
            imageView.setImageResource(i3);
            imageView.setColorFilter(Y2);
            imageView.setOutlineProvider(hav0.a);
            imageView.setClipToOutline(true);
            frameLayout.addView(imageView);
        }
        TextView textView = new TextView(context);
        textView.setText(i);
        ao6.a(textView);
        textView.setGravity(17);
        textView.setPadding(0, iah0.a(8), 0, 0);
        linearLayout.addView(frameLayout);
        linearLayout.addView(textView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        addView(linearLayout, layoutParams);
    }

    @Override // xsna.ao6
    public int getButtonCornerRadius() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius_paper);
    }
}
