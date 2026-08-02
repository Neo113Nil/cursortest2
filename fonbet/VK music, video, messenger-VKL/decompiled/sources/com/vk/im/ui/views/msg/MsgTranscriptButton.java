package com.vk.im.ui.views.msg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.im.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.a140;
import xsna.e3m;
import xsna.m33;
import xsna.too0;

/* compiled from: MsgTranscriptButton.kt */
/* loaded from: classes2.dex */
public final class MsgTranscriptButton extends AppCompatImageView implements too0 {
    public final Drawable b;
    public final Drawable c;
    public final int d;
    public final AnimatedVectorDrawable e;
    public final Drawable f;

    public MsgTranscriptButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e3m.a aVar = e3m.a;
        LayerDrawable layerDrawable = (LayerDrawable) m33.a(R.drawable.vkim_transcript_bg_with_loader, context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
            this.b = obtainStyledAttributes.getDrawable(2);
            this.c = obtainStyledAttributes.getDrawable(1);
            this.d = obtainStyledAttributes.getColor(0, context.getColor(R.color.vk_azure_A400));
            obtainStyledAttributes.recycle();
        }
        layerDrawable.getDrawable(0).setTint(this.d);
        this.f = layerDrawable.getDrawable(0);
        setBackground(layerDrawable);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) layerDrawable.getDrawable(1);
        this.e = animatedVectorDrawable;
        (animatedVectorDrawable == null ? null : animatedVectorDrawable).setAlpha(0);
        AnimatedVectorDrawable animatedVectorDrawable2 = this.e;
        (animatedVectorDrawable2 != null ? animatedVectorDrawable2 : null).registerAnimationCallback(new a140());
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        U();
    }

    public final void U() {
        setImageDrawable(this.b);
        setContentDescription(getContext().getText(R.string.vkim_accessibility_transcript));
    }

    @Override // android.widget.ImageView
    public void setImageTintList(ColorStateList colorStateList) {
        super.setImageTintList(colorStateList);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            int defaultColor2 = colorStateList.withAlpha(25).getDefaultColor();
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setTint(defaultColor);
            }
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                drawable2.setTint(defaultColor);
            }
            AnimatedVectorDrawable animatedVectorDrawable = this.e;
            if (animatedVectorDrawable == null) {
                animatedVectorDrawable = null;
            }
            animatedVectorDrawable.setTint(defaultColor);
            Drawable drawable3 = this.f;
            (drawable3 != null ? drawable3 : null).setTint(defaultColor2);
        }
    }

    public final void setProgressLoading(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable = this.e;
        if (animatedVectorDrawable == null) {
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.setAlpha(z ? 255 : 0);
        if (z) {
            AnimatedVectorDrawable animatedVectorDrawable2 = this.e;
            (animatedVectorDrawable2 != null ? animatedVectorDrawable2 : null).start();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
    }
}
