package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public NavigationRailFrameLayout(@NonNull Context context) {
        super(context);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        int childCount = getChildCount();
        int i13 = this.paddingTop;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int max = Math.max(i13, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getMeasuredHeight() + max);
            i13 = max + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int childCount = getChildCount();
        int i11 = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i10);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i5, i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            i11 = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i12 = (size - i11) - this.paddingTop;
            childAt = getChildAt(1);
            if (!this.scrollingEnabled) {
                i10 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i5, i10);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.paddingTop + i11 + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i5) {
        this.paddingTop = i5;
    }

    public void setScrollingEnabled(boolean z5) {
        this.scrollingEnabled = z5;
    }
}
