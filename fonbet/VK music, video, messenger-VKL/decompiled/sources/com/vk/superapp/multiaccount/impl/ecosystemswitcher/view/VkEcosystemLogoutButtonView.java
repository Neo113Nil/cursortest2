package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.superapp.multiaccount.impl.R$styleable;
import xsna.hnj;

/* compiled from: VkEcosystemLogoutButtonView.kt */
/* loaded from: classes6.dex */
public final class VkEcosystemLogoutButtonView extends FrameLayout {
    public final ImageView b;

    public VkEcosystemLogoutButtonView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getDrawable(0) : null;
            obtainStyledAttributes.recycle();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 17));
            linearLayout.addView(imageView);
            addView(linearLayout);
            imageView.setImageDrawable(drawable);
            this.b = imageView;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final ImageView getIconView() {
        return this.b;
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
