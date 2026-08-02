package com.vk.stories.design.view.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.NoSuchElementException;
import xsna.kxt0;
import xsna.s101;

/* compiled from: StickersTabsLinearLayout.kt */
/* loaded from: classes6.dex */
public final class StickersTabsLinearLayout extends ViewGroup {
    public int b;

    public StickersTabsLinearLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final int getGapsWidthSum() {
        int childCount = (getChildCount() - 1) * this.b;
        if (childCount < 0) {
            return 0;
        }
        return childCount;
    }

    public final int getGapWidth() {
        return this.b;
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
            i6 += next.getMeasuredWidth() + this.b;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int gapsWidthSum;
        int i3;
        int i4 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            int i5 = 0;
            while (true) {
                if (!(i5 < getChildCount())) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (!(i7 < getChildCount())) {
                            gapsWidthSum = i6 + getGapsWidthSum();
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
            gapsWidthSum = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : 0;
            if (!s101.r(this) || (i3 = (gapsWidthSum - getGapsWidthSum()) / getChildCount()) < 0) {
                i3 = 0;
            }
            int i10 = 0;
            while (true) {
                if (!(i10 < getChildCount())) {
                    break;
                }
                int i11 = i10 + 1;
                View childAt3 = getChildAt(i10);
                if (childAt3 == null) {
                    throw new IndexOutOfBoundsException();
                }
                childAt3.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), ViewGroup.getChildMeasureSpec(i2, 0, childAt3.getLayoutParams().height));
                i10 = i11;
            }
        }
        if (s101.r(this)) {
            kxt0 kxt0Var = new kxt0(this);
            if (!kxt0Var.hasNext()) {
                throw new NoSuchElementException();
            }
            int measuredHeight = kxt0Var.next().getMeasuredHeight();
            loop1: while (true) {
                i4 = measuredHeight;
                while (kxt0Var.hasNext()) {
                    measuredHeight = kxt0Var.next().getMeasuredHeight();
                    if (i4 < measuredHeight) {
                        break;
                    }
                }
            }
        }
        setMeasuredDimension(gapsWidthSum, i4);
    }

    public final void setGapWidth(int i) {
        this.b = i;
        requestLayout();
    }

    public StickersTabsLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public StickersTabsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ StickersTabsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public StickersTabsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setClipChildren(false);
    }
}
