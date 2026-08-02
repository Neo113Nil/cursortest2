package com.vk.core.view.components.progress;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import xsna.gpo0;
import xsna.too0;

/* compiled from: VkProgress.kt */
/* loaded from: classes.dex */
public final class VkProgress extends ProgressBar implements too0 {
    public boolean b;
    public final Drawable c;
    public final Drawable d;

    public VkProgress(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        Drawable drawable;
        if (this.b && (drawable = this.c) != null) {
            drawable.setTint(gpo0.d(R.attr.vk_ui_stroke_accent, this));
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setTint(gpo0.d(R.attr.vk_ui_track_background, this));
        }
    }

    public final boolean getIndicatorColorful() {
        return this.b;
    }

    public final void setIndicatorColorful(boolean z) {
        this.b = z;
        a();
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(ColorStateList colorStateList) {
        super.setProgressTintList(colorStateList);
        setIndicatorColorful(false);
    }

    public VkProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkProgress(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkProgress(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, R.style.VkProgressStyle);
    }

    public VkProgress(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.v, i, i2);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        setIndicatorColorful(!obtainStyledAttributes.hasValue(1));
        if (!hasValue) {
            setProgressDrawable(getContext().getDrawable(R.drawable.ds_internal_progress_drawable));
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            this.c = layerDrawable.findDrawableByLayerId(android.R.id.progress);
            this.d = layerDrawable.findDrawableByLayerId(android.R.id.background);
        }
        a();
        obtainStyledAttributes.recycle();
    }
}
