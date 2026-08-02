package com.vk.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vk.libuilight.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.m33;
import xsna.ozl;
import xsna.x3e0;

/* compiled from: ProgressIconButton.kt */
@ozl
/* loaded from: classes17.dex */
public final class ProgressIconButton extends FrameLayout implements x3e0 {
    public static final int e = iah0.a(12);
    public final ImageView b;
    public final ProgressBar c;
    public final Drawable d;

    public ProgressIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.x3e0
    public final void S(boolean z) {
        ImageView imageView = this.b;
        if (z) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = 0;
            imageView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            imageView.setLayoutParams(layoutParams2);
        }
        imageView.setPressed(false);
        ProgressBar progressBar = this.c;
        if (z) {
            ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            progressBar.setLayoutParams(layoutParams3);
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = progressBar.getLayoutParams();
        layoutParams4.width = 0;
        layoutParams4.height = 0;
        progressBar.setLayoutParams(layoutParams4);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.b.setBackground(z ? this.d : null);
    }

    public final void setIconBackground(Drawable drawable) {
        this.b.setBackground(drawable);
    }

    public final void setIconDrawable(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final void setIconPadding(int i) {
        this.b.setPadding(i, i, i, i);
    }

    public final void setIconSize(int i) {
        f4m.o(i, i, this.b);
    }

    public final void setProgressBarPadding(int i) {
        this.c.setPadding(i, i, i, i);
    }

    public final void setProgressBarSize(int i) {
        f4m.o(i, i, this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProgressIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        imageView.setBackground(this.d);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.b = imageView;
        ProgressBar progressBar = new ProgressBar(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 16;
        progressBar.setLayoutParams(layoutParams2);
        int i2 = e;
        progressBar.setPadding(i2, i2, i2, i2);
        progressBar.setIndeterminateTintList(e3m.c(R.attr.vk_ui_icon_accent_themed, progressBar.getContext()));
        this.c = progressBar;
        this.d = m33.a(R.drawable.vk_ripple_circle_highlight, context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.e, 0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                imageView.setImageResource(obtainStyledAttributes.getResourceId(1, -1));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                imageView.setImageTintList(obtainStyledAttributes.getColorStateList(0));
            }
            obtainStyledAttributes.recycle();
        }
        addView(imageView);
        addView(progressBar);
    }
}
