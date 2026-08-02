package com.vk.feed.tool.view.newsfeed.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.core.view.fresco.VKEnhancedImageView;
import xsna.an10;
import xsna.epx;
import xsna.tr;

/* compiled from: FixedSizeVKEnhancedImageView.kt */
/* loaded from: classes18.dex */
public final class FixedSizeVKEnhancedImageView extends VKEnhancedImageView {
    public int O;
    public int P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public final int T;
    public ImageViewMeasurer.HeightMode U;
    public Float V;
    public Float W;
    public Float a0;
    public Matrix b0;
    public boolean c0;

    public FixedSizeVKEnhancedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Q = new Rect();
        this.S = true;
        this.T = Integer.MAX_VALUE;
        this.U = ImageViewMeasurer.HeightMode.DOUBLE_WIDTH;
    }

    public final void e1(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.O != i) {
            this.O = i;
            z = true;
        } else {
            z = false;
        }
        if (this.P != i2) {
            this.P = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            requestLayout();
        }
    }

    public final int getFixedImageHeight() {
        return this.P;
    }

    public final int getFixedImageWidth() {
        return this.O;
    }

    @Override // com.vk.core.view.fresco.VKEnhancedImageView, com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Matrix matrix = this.b0;
        if (matrix == null) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            canvas.concat(matrix);
            super.onDraw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // com.vk.core.view.fresco.VKEnhancedImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int b;
        int b2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        if (!this.S || (i4 = this.O) == 0 || (i5 = this.P) == 0) {
            i3 = size2;
        } else {
            Float f = this.V;
            Rect rect = this.Q;
            if (f == null) {
                ImageViewMeasurer.a(size, i4, i5, this.R, this.U, this.Q);
            } else if (this.c0) {
                rect.set(0, 0, size, an10.b(size / f.floatValue()));
            } else {
                Float f2 = this.W;
                Float f3 = this.a0;
                float floatValue = f.floatValue();
                if (f2 == null && f3 == null) {
                    float f4 = size;
                    int b3 = an10.b(f4 / floatValue);
                    float f5 = i4 / i5;
                    if (f5 >= 1.0f) {
                        b3 = an10.b(f4 / f5);
                        b2 = size;
                    } else {
                        b2 = an10.b(b3 * f5);
                    }
                    rect.right = b2;
                    rect.bottom = b3;
                } else {
                    float f6 = size;
                    int b4 = an10.b(f6 / floatValue);
                    float f7 = i4 / i5;
                    if (f7 >= 1.0f) {
                        float abs = Math.abs(1 - (floatValue / f7));
                        if (f2 == null || abs > f2.floatValue()) {
                            b4 = an10.b(f6 / f7);
                        }
                    } else {
                        float abs2 = Math.abs(1 - (f7 / floatValue));
                        if (f3 == null || abs2 > f3.floatValue()) {
                            b = an10.b(b4 * f7);
                            rect.right = b;
                            rect.bottom = b4;
                        }
                    }
                    b = size;
                    rect.right = b;
                    rect.bottom = b4;
                }
            }
            if (mode == 0 || rect.width() <= size) {
                size = rect.width();
                i3 = rect.height();
            } else {
                i3 = (int) (size / (rect.width() / rect.height()));
            }
        }
        int i6 = this.T;
        if (size3 != 0) {
            if (size2 > i6) {
                size2 = i6;
            }
            i6 = size2;
        }
        if (i3 > i6) {
            size = (size * i6) / i3;
            i3 = i6;
        }
        int max = Math.max(getSuggestedMinimumWidth(), size);
        int max2 = Math.max(getSuggestedMinimumHeight(), i3);
        super.onMeasure(tr.a(max, 1073741823, 0, 1073741824), max2 == 0 ? tr.a(0, 1073741823, 0, 0) : tr.a(max2, 1073741823, 0, 1073741824));
    }

    public final void setHasCrop(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            requestLayout();
        }
    }

    public final void setHeightMode(ImageViewMeasurer.HeightMode heightMode) {
        if (this.U != heightMode) {
            this.U = heightMode;
            requestLayout();
            invalidate();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.R != z) {
            this.R = z;
            requestLayout();
        }
    }

    public final void setTransformMatrix(Matrix matrix) {
        this.b0 = matrix;
        invalidate();
    }

    public final void setViewRatio(Float f) {
        if (epx.e(this.V, f) || epx.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return;
        }
        this.V = f;
        requestLayout();
    }

    public final void setWrapContent(boolean z) {
        if (this.S != z) {
            this.S = z;
            requestLayout();
        }
    }
}
