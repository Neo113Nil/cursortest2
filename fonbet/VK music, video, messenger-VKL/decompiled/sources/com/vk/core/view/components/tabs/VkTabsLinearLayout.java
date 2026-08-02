package com.vk.core.view.components.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.NoSuchElementException;
import xsna.kxt0;

/* compiled from: VkTabsLinearLayout.kt */
/* loaded from: classes17.dex */
public final class VkTabsLinearLayout extends ViewGroup {
    public boolean b;
    public int c;

    public VkTabsLinearLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final int getGapsWidthSum() {
        int childCount = (getChildCount() - 1) * this.c;
        if (childCount < 0) {
            return 0;
        }
        return childCount;
    }

    public final boolean getFixed() {
        return this.b;
    }

    public final int getGapWidth() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        kxt0 kxt0Var = new kxt0(this);
        int i6 = 0;
        while (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            int measuredHeight = (i5 - next.getMeasuredHeight()) / 2;
            next.layout(i6, measuredHeight, next.getMeasuredWidth() + i6, next.getMeasuredHeight() + measuredHeight);
            i6 += next.getMeasuredWidth() + this.c;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        getContext();
        int i4 = 0;
        if (!this.b && mode != 1073741824) {
            int i5 = 0;
            while (true) {
                if (!(i5 < getChildCount())) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (!(i7 < getChildCount())) {
                            size = i6 + getGapsWidthSum();
                            break;
                        }
                        int i8 = i7 + 1;
                        View childAt = getChildAt(i7);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        i6 += childAt.getMeasuredWidth();
                        i7 = i8;
                    }
                } else {
                    int i9 = i5 + 1;
                    View childAt2 = getChildAt(i5);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    childAt2.measure(ViewGroup.getChildMeasureSpec(i, 0, childAt2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, childAt2.getLayoutParams().height));
                    i5 = i9;
                }
            }
        } else {
            size = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : 0;
            if (getChildCount() == 0 || (i3 = (size - getGapsWidthSum()) / getChildCount()) < 0) {
                i3 = 0;
            }
            int i10 = 0;
            while (i10 < getChildCount()) {
                int i11 = i10 + 1;
                View childAt3 = getChildAt(i10);
                if (childAt3 == null) {
                    throw new IndexOutOfBoundsException();
                }
                childAt3.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), ViewGroup.getChildMeasureSpec(i2, 0, childAt3.getLayoutParams().height));
                i10 = i11;
            }
        }
        if (getChildCount() != 0) {
            if (!(getChildCount() > 0)) {
                throw new NoSuchElementException();
            }
            int i12 = 0 + 1;
            View childAt4 = getChildAt(0);
            if (childAt4 == null) {
                throw new IndexOutOfBoundsException();
            }
            int measuredHeight = childAt4.getMeasuredHeight();
            while (true) {
                if (!(i12 < getChildCount())) {
                    i4 = measuredHeight;
                    break;
                }
                int i13 = i12 + 1;
                View childAt5 = getChildAt(i12);
                if (childAt5 == null) {
                    throw new IndexOutOfBoundsException();
                }
                int measuredHeight2 = childAt5.getMeasuredHeight();
                if (measuredHeight < measuredHeight2) {
                    measuredHeight = measuredHeight2;
                }
                i12 = i13;
            }
        }
        setMeasuredDimension(size, i4);
    }

    public final void setFixed(boolean z) {
        this.b = z;
        requestLayout();
    }

    public final void setGapWidth(int i) {
        this.c = i;
        requestLayout();
    }

    public VkTabsLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkTabsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkTabsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkTabsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setClipChildren(false);
    }
}
