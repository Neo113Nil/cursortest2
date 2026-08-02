package com.vk.newsfeed.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.R$styleable;
import defpackage.j0;
import xsna.x9;

/* compiled from: ContentRatioLayout.kt */
/* loaded from: classes4.dex */
public final class ContentRatioLayout extends FrameLayout {
    public final int b;
    public float c;
    public int d;

    public ContentRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = Float.NaN;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            this.c = obtainStyledAttributes.getFloat(0, this.c);
            obtainStyledAttributes.recycle();
        } catch (Throwable unused) {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a;
        int i5;
        int i6;
        int a2;
        int i7;
        int i8;
        int i9;
        int i10;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int i11 = i3 - i;
        int i12 = this.d;
        int b = x9.b(i11, i12, 2, paddingLeft);
        int i13 = i12 + b;
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = layoutParams.gravity;
                if (i15 == -1) {
                    i15 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection());
                int i16 = i15 & 112;
                int i17 = absoluteGravity & 7;
                if (i17 != 1) {
                    if (i17 == 3) {
                        i10 = layoutParams.leftMargin;
                    } else if (i17 != 5) {
                        i10 = layoutParams.leftMargin;
                    } else {
                        a = i13 - measuredWidth;
                        i5 = layoutParams.rightMargin;
                    }
                    i6 = i10 + b;
                    if (i16 == 16) {
                        if (i16 == 48) {
                            i9 = layoutParams.topMargin;
                        } else if (i16 != 80) {
                            i9 = layoutParams.topMargin;
                        } else {
                            a2 = paddingBottom - measuredHeight;
                            i7 = layoutParams.bottomMargin;
                        }
                        i8 = i9 + paddingTop;
                        childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                    } else {
                        a2 = j0.a(paddingBottom, paddingTop, measuredHeight, 2, paddingTop) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    }
                    i8 = a2 - i7;
                    childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                } else {
                    a = j0.a(i13, b, measuredWidth, 2, b) + layoutParams.leftMargin;
                    i5 = layoutParams.rightMargin;
                }
                i6 = a - i5;
                if (i16 == 16) {
                }
                i8 = a2 - i7;
                childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (Float.isNaN(this.c) || this.c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b;
        if (size <= i3) {
            i3 = size;
        }
        this.d = i3;
        int i4 = (int) ((i3 * this.c) + 0.5f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(makeMeasureSpec, makeMeasureSpec3);
            if (childAt.getMeasuredHeight() > i4) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            i5 = Math.max(i5, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(size, i5);
    }

    public final void setRatio(float f) {
        if (f == this.c) {
            return;
        }
        this.c = f;
        requestLayout();
    }
}
