package com.vk.imageloader.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: VkImageViewTopCrop.kt */
/* loaded from: classes2.dex */
public final class VkImageViewTopCrop extends AppCompatImageView {
    public static final /* synthetic */ int c = 0;
    public boolean b;

    public VkImageViewTopCrop(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void U() {
        if (!this.b || getDrawable() == null) {
            return;
        }
        Matrix imageMatrix = getImageMatrix();
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float f = intrinsicWidth * height > intrinsicHeight * width ? height / intrinsicHeight : width / intrinsicWidth;
        imageMatrix.setScale(f, f);
        setImageMatrix(imageMatrix);
    }

    public final boolean getTopCrop() {
        return this.b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        U();
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        U();
        return super.setFrame(i, i2, i3, i4);
    }

    public final void setTopCrop(boolean z) {
        this.b = z;
        if (z) {
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }
}
