package com.vk.feed.tool.view.newsfeed.image;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.core.view.fresco.FrescoImageView;
import xsna.ozl;
import xsna.tr;

/* compiled from: FixedSizeFrescoImageViewLegacy.kt */
@ozl
/* loaded from: classes18.dex */
public final class FixedSizeFrescoImageViewLegacy extends FrescoImageView {
    public static final /* synthetic */ int c0 = 0;
    public int S;
    public int T;
    public final Rect U;
    public boolean V;
    public boolean W;
    public int a0;
    public ImageViewMeasurer.HeightMode b0;

    public FixedSizeFrescoImageViewLegacy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // com.vk.core.view.fresco.FrescoImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        if (!this.W || (i5 = this.S) == 0 || (i6 = this.T) == 0) {
            i3 = size2;
        } else {
            ImageViewMeasurer.a(size, i5, i6, this.V, this.b0, this.U);
            Rect rect = this.U;
            if (mode == 0 || rect.width() <= size) {
                size = rect.width();
                i3 = rect.height();
            } else {
                i3 = (int) (size / (rect.width() / rect.height()));
            }
        }
        if (size3 == 0) {
            i4 = this.a0;
        } else {
            int i7 = this.a0;
            if (size2 > i7) {
                size2 = i7;
            }
            i4 = size2;
        }
        if (i3 > i4) {
            size = (size * i4) / i3;
            i3 = i4;
        }
        int max = Math.max(getSuggestedMinimumWidth(), size);
        int max2 = Math.max(getSuggestedMinimumHeight(), i3);
        super.onMeasure(tr.a(max, 1073741823, 0, 1073741824), max2 == 0 ? tr.a(0, 1073741823, 0, 0) : tr.a(max2, 1073741823, 0, 1073741824));
    }

    public final void r(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.S != i) {
            this.S = i;
            z = true;
        } else {
            z = false;
        }
        if (this.T != i2) {
            this.T = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            requestLayout();
        }
    }

    public final void setHeightMode(ImageViewMeasurer.HeightMode heightMode) {
        if (this.b0 != heightMode) {
            this.b0 = heightMode;
            requestLayout();
            invalidate();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.V != z) {
            this.V = z;
            requestLayout();
        }
    }

    public final void setMaxHeight(int i) {
        if (i != this.a0) {
            this.a0 = i;
            requestLayout();
        }
    }

    public final void setWrapContent(boolean z) {
        if (this.W != z) {
            this.W = z;
            requestLayout();
        }
    }

    public FixedSizeFrescoImageViewLegacy(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.U = new Rect();
        this.W = true;
        this.a0 = Integer.MAX_VALUE;
        this.b0 = ImageViewMeasurer.HeightMode.DOUBLE_WIDTH;
    }
}
