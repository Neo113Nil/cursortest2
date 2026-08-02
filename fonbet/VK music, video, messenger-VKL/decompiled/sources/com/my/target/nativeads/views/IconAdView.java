package com.my.target.nativeads.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.c1z0;
import xsna.whz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class IconAdView extends FrameLayout {
    public final whz0 b;
    public int c;
    public int d;

    public IconAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        whz0 whz0Var = new whz0(context);
        this.b = whz0Var;
        c1z0.n(whz0Var, "nativeads_icon");
        addView(whz0Var);
    }

    @NonNull
    public ImageView getImageView() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i6 = ((i3 - i) - measuredWidth) / 2;
                    int i7 = ((i4 - i2) - measuredHeight) / 2;
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = this.c;
        if (i6 == 0 || (i3 = this.d) == 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int childCount = getChildCount();
            if (size == 0 && size2 == 0) {
                setMeasuredDimension(0, 0);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
            whz0 whz0Var = this.b;
            whz0Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = whz0Var.getMeasuredWidth();
            int measuredHeight = whz0Var.getMeasuredHeight();
            if (mode2 != 1073741824) {
                size2 = measuredHeight;
            }
            if (mode != 1073741824) {
                size = measuredWidth;
            }
            if (childCount > 1) {
                for (int i7 = 1; i7 < childCount; i7++) {
                    getChildAt(i7).measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        float f = i6 / i3;
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(i2);
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        int childCount2 = getChildCount();
        if (mode3 == 0 && mode4 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (mode3 == 0) {
            size3 = (int) (size4 * f);
        } else if (mode4 == 0 || mode4 != 1073741824) {
            size4 = (int) (size3 / f);
        }
        boolean z = false;
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    i5 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    i4 = layoutParams.height == -1 ? 1073741824 : Integer.MIN_VALUE;
                } else {
                    i4 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, i5), View.MeasureSpec.makeMeasureSpec(size4, i4));
                if (childAt.getMeasuredHeight() > 0) {
                    z = true;
                }
            }
        }
        if (z) {
            setMeasuredDimension(size3, size4);
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
