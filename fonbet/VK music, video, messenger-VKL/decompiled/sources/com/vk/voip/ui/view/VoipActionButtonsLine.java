package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.ui.R$styleable;
import xsna.bwt0;
import xsna.cn70;

/* compiled from: VoipActionButtonsLine.kt */
/* loaded from: classes7.dex */
public final class VoipActionButtonsLine extends ViewGroup {
    public static final int d = cn70.b(4);
    public final int b;
    public int c;

    public VoipActionButtonsLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e, 0, 0);
        this.b = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.c == 0) {
            return;
        }
        int childCount = getChildCount();
        if (this.b == 1) {
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (bwt0.K(childAt)) {
                    i9 += childAt.getMeasuredWidth();
                }
            }
            int i11 = this.c;
            if (i11 < 3) {
                i7 = ((i3 - i) - i9) / (i11 + 1);
                i6 = i7;
                for (i8 = 0; i8 < childCount; i8++) {
                    View childAt2 = getChildAt(i8);
                    if (bwt0.K(childAt2)) {
                        int measuredWidth = childAt2.getMeasuredWidth();
                        childAt2.layout(i7, 0, i7 + measuredWidth, childAt2.getMeasuredHeight());
                        i7 = measuredWidth + i6 + i7;
                    }
                }
            }
            i5 = (getWidth() - i9) / (this.c - 1);
        } else {
            i5 = d;
        }
        i6 = i5;
        i7 = 0;
        while (i8 < childCount) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (bwt0.K(childAt)) {
                childAt.measure(makeMeasureSpec, i2);
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i5) {
                    i5 = measuredHeight;
                }
                i4++;
            }
        }
        this.c = i4;
        int i7 = d;
        int i8 = this.b;
        if (i8 != 0) {
            if (i8 != 1) {
                return;
            }
            int i9 = (i4 - 1) * i7;
            int childCount2 = getChildCount();
            while (i3 < childCount2) {
                View childAt2 = getChildAt(i3);
                if (bwt0.K(childAt2)) {
                    i9 = childAt2.getMeasuredWidth() + i9;
                }
                i3++;
            }
            if (i9 >= size) {
                size = i9;
            }
            setMeasuredDimension(size, i5);
            return;
        }
        int i10 = (i4 - 1) * i7;
        if (i4 > 0) {
            int i11 = (size - i10) / i4;
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            int childCount3 = getChildCount();
            while (i3 < childCount3) {
                View childAt3 = getChildAt(i3);
                if (bwt0.K(childAt3)) {
                    if (childAt3.getMeasuredWidth() < i11) {
                        childAt3.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824));
                    }
                    i10 = childAt3.getMeasuredWidth() + i10;
                }
                i3++;
            }
        }
        if (mode != 1073741824) {
            size = i10;
        }
        setMeasuredDimension(size, i5);
    }
}
