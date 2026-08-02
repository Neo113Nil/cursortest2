package com.vk.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.vk.core.R$styleable;

/* loaded from: classes17.dex */
public class AutoAdjustLinearLayout extends LinearLayout {

    public static class a extends LinearLayout.LayoutParams {
        public boolean a;
    }

    public AutoAdjustLinearLayout(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        if (attributeSet == null) {
            aVar.a = false;
            return aVar;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
        aVar.a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int orientation = getOrientation();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth2 = (childAt.getMeasuredWidth() - ((LinearLayout.LayoutParams) aVar).leftMargin) - ((LinearLayout.LayoutParams) aVar).rightMargin;
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i4 = ((LinearLayout.LayoutParams) aVar).topMargin;
                int i5 = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                int i6 = (measuredHeight2 - i4) - i5;
                int i7 = (measuredWidth - ((LinearLayout.LayoutParams) aVar).leftMargin) - ((LinearLayout.LayoutParams) aVar).rightMargin;
                int i8 = (measuredHeight - i4) - i5;
                boolean z = aVar.a;
                if (z && orientation == 0 && i6 < i8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
                } else if (z && orientation == 1 && measuredWidth2 < i7) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                }
            }
        }
    }

    public AutoAdjustLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoAdjustLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AutoAdjustLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
            aVar.a = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return aVar;
        }
        aVar.a = false;
        return aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }
}
