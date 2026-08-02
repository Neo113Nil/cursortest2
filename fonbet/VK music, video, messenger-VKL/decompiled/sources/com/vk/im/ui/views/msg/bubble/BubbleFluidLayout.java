package com.vk.im.ui.views.msg.bubble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.FluidHorizontalLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.bwt0;

/* compiled from: BubbleFluidHorizontalLayout.kt */
/* loaded from: classes2.dex */
public final class BubbleFluidLayout extends FluidHorizontalLayout {
    public final LinkedHashSet g;

    public BubbleFluidLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        BubbleFluidLayout bubbleFluidLayout;
        View view;
        int i3;
        int i4;
        BubbleFluidLayout bubbleFluidLayout2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int measuredWidth;
        int max;
        a();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int childCount = getChildCount();
        View c = c();
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        FluidHorizontalLayout.a aVar = layoutParams instanceof FluidHorizontalLayout.a ? (FluidHorizontalLayout.a) layoutParams : null;
        boolean z = aVar != null ? aVar.b : false;
        int size = View.MeasureSpec.getSize(i);
        if (z) {
            bubbleFluidLayout = this;
            bubbleFluidLayout.measureChildWithMargins(c, i, 0, i2, 0);
            view = c;
            FluidHorizontalLayout.a aVar2 = (FluidHorizontalLayout.a) view.getLayoutParams();
            i3 = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
            i4 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
        } else {
            bubbleFluidLayout = this;
            view = c;
            i3 = 0;
            i4 = 0;
        }
        LinkedHashSet linkedHashSet = bubbleFluidLayout.g;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            bwt0.p0((View) it.next(), true);
        }
        int i11 = i3;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < childCount) {
            int i15 = i12;
            View childAt = bubbleFluidLayout.getChildAt(i15);
            FluidHorizontalLayout.a aVar3 = (FluidHorizontalLayout.a) childAt.getLayoutParams();
            if (aVar3.a || childAt.getVisibility() == 8) {
                i6 = i13;
                i7 = i15;
                i8 = paddingRight;
                i9 = paddingBottom;
                i10 = i4;
            } else {
                i7 = i15;
                i8 = paddingRight;
                i9 = paddingBottom;
                i10 = i4;
                i6 = i13;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                if (aVar3.b) {
                    i14 = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + i14;
                    i13 = Math.max(i6, childAt.getMeasuredHeight());
                    i4 = i10;
                    i12 = i7 + 1;
                    bubbleFluidLayout = this;
                    paddingRight = i8;
                    paddingBottom = i9;
                } else {
                    if (!z) {
                        measuredWidth = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + i11;
                        max = Math.max(i10, childAt.getMeasuredHeight());
                    } else if (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + i11 <= size || !aVar3.c) {
                        measuredWidth = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + i11;
                        max = Math.max(i10, childAt.getMeasuredHeight());
                    } else {
                        bwt0.p0(childAt, false);
                        linkedHashSet.add(childAt);
                    }
                    i4 = max;
                    i11 = measuredWidth;
                    i13 = i6;
                    i12 = i7 + 1;
                    bubbleFluidLayout = this;
                    paddingRight = i8;
                    paddingBottom = i9;
                }
            }
            i4 = i10;
            i13 = i6;
            i12 = i7 + 1;
            bubbleFluidLayout = this;
            paddingRight = i8;
            paddingBottom = i9;
        }
        int i16 = paddingRight;
        int i17 = paddingBottom;
        int i18 = i4;
        if (z) {
            bubbleFluidLayout2 = this;
            i5 = i18;
        } else {
            FluidHorizontalLayout.a aVar4 = (FluidHorizontalLayout.a) view.getLayoutParams();
            bubbleFluidLayout2 = this;
            View view2 = view;
            int i19 = i11;
            bubbleFluidLayout2.measureChildWithMargins(view2, i, i19, i2, 0);
            i11 = view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar4).leftMargin + ((ViewGroup.MarginLayoutParams) aVar4).rightMargin + i19;
            i5 = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar4).topMargin + ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin;
        }
        bubbleFluidLayout2.setMeasuredDimension(FluidHorizontalLayout.e(i, suggestedMinimumWidth, i11 + i14 + i16), FluidHorizontalLayout.e(i2, suggestedMinimumHeight, i17 + i5));
    }

    public BubbleFluidLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public BubbleFluidLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ BubbleFluidLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public BubbleFluidLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = new LinkedHashSet();
    }
}
