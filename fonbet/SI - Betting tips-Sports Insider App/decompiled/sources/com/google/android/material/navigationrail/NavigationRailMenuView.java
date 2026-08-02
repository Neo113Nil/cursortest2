package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    private int itemMinimumHeight;
    private int itemSpacing;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        this.itemSpacing = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i5, int i10, int i11) {
        int max = i10 / Math.max(1, i11);
        int i12 = this.itemMinimumHeight;
        if (i12 == -1) {
            i12 = View.MeasureSpec.getSize(i5);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i12, max), 0);
    }

    private int measureChildHeight(View view, int i5, int i10) {
        view.measure(i5, i10);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i5, int i10, int i11, View view) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 0);
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt instanceof NavigationBarItemView)) {
                int measureChildHeight = measureChildHeight(childAt, i5, makeMeasureSpec);
                i10 -= measureChildHeight;
                i12 += measureChildHeight;
            }
        }
        int makeSharedHeightSpec = view == null ? makeSharedHeightSpec(i5, Math.max(i10, 0), i11) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() == 0) {
                i14++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                i12 += measureChildHeight(childAt2, i5, makeSharedHeightSpec);
            }
        }
        return (Math.max(0, i14 - 1) * this.itemSpacing) + i12;
    }

    private int measureShiftingChildHeights(int i5, int i10, int i11) {
        int i12;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i12 = measureChildHeight(childAt, i5, makeSharedHeightSpec(i5, i10, i11));
            i10 -= i12;
            i11--;
        } else {
            i12 = 0;
        }
        return i12 + measureSharedChildHeights(i5, i10, i11, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i5;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                i15 += childAt.getMeasuredHeight();
                i14++;
            }
        }
        int max = i14 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - i15) / (i14 - 1), this.itemSpacing));
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight = childAt2.getMeasuredHeight();
                childAt2.layout(0, i17, i13, measuredHeight + i17);
                i17 += measuredHeight + max;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i5), View.resolveSizeAndState((currentVisibleContentItemCount <= 1 || !isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount)) ? measureSharedChildHeights(i5, size, currentVisibleContentItemCount, null) : measureShiftingChildHeights(i5, size, currentVisibleContentItemCount), i10, 0));
    }

    public void setItemMinimumHeight(int i5) {
        if (this.itemMinimumHeight != i5) {
            this.itemMinimumHeight = i5;
            requestLayout();
        }
    }

    public void setItemSpacing(int i5) {
        if (this.itemSpacing != i5) {
            this.itemSpacing = i5;
            requestLayout();
        }
    }

    public void setMenuGravity(int i5) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i5) {
            layoutParams.gravity = i5;
            setLayoutParams(layoutParams);
        }
    }
}
