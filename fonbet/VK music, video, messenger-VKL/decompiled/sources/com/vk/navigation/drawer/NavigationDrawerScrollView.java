package com.vk.navigation.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: NavigationDrawerScrollView.kt */
/* loaded from: classes3.dex */
public final class NavigationDrawerScrollView extends NestedScrollView {
    public final a H;

    /* compiled from: NavigationDrawerScrollView.kt */
    public static final class a extends ViewGroup {
        @Override // android.view.ViewGroup
        public final void measureChild(View view, int i, int i2) {
            int childMeasureSpec;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width);
            if (layoutParams.height == 0) {
                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), layoutParams.height);
            }
            view.measure(childMeasureSpec2, childMeasureSpec);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8) {
                    childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                    paddingTop = childAt.getBottom();
                }
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8) {
                    measureChild(childAt, i, i2);
                    i3 = childAt.getMeasuredHeight() + i3;
                }
            }
            setMeasuredDimension(size, i3);
        }
    }

    public NavigationDrawerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a(context, null, 0);
        this.H = aVar;
        addView(aVar, -1, -1);
        aVar.setDescendantFocusability(393216);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            this.H.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.H.measure(i, i2);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            this.H.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            this.H.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            this.H.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }
}
