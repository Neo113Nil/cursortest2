package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i5;
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i17 = i13 - i15;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i14);
                } else {
                    childAt.layout(i15, 0, childAt.getMeasuredWidth() + i15, i14);
                }
                i15 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i5);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int i15 = 0;
        if (getItemIconGravity() == 0) {
            if (isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount) && isItemHorizontalTranslationEnabled()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int i16 = this.activeItemMinWidth;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                    i16 = Math.max(i16, childAt.getMeasuredWidth());
                }
                int i17 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int min = Math.min(size - (this.inactiveItemMinWidth * i17), Math.min(i16, this.activeItemMaxWidth));
                int i18 = size - min;
                int min2 = Math.min(i18 / (i17 != 0 ? i17 : 1), this.inactiveItemMaxWidth);
                int i19 = i18 - (i17 * min2);
                int i20 = 0;
                while (i20 < childCount) {
                    if (getChildAt(i20).getVisibility() != 8) {
                        i14 = i20 == getSelectedItemPosition() ? min : min2;
                        if (i19 > 0) {
                            i14++;
                            i19--;
                        }
                    } else {
                        i14 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i14));
                    i20++;
                }
            } else {
                int min3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.activeItemMaxWidth);
                int i21 = size - (currentVisibleContentItemCount * min3);
                for (int i22 = 0; i22 < childCount; i22++) {
                    if (getChildAt(i22).getVisibility() == 8) {
                        i13 = 0;
                    } else if (i21 > 0) {
                        i13 = min3 + 1;
                        i21--;
                    } else {
                        i13 = min3;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i13));
                }
            }
            i11 = 0;
            i12 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i15).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i11;
                    i12 = Math.max(i12, childAt2.getMeasuredHeight());
                    i11 = measuredWidth;
                }
                i15++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f6 = size;
            float min4 = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f6;
            float f10 = currentVisibleContentItemCount;
            int round = Math.round(min4 / f10);
            int round2 = Math.round(f6 / f10);
            int i23 = 0;
            int i24 = 0;
            while (i15 < childCount) {
                View childAt3 = getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i23;
                    i24 = Math.max(i24, childAt3.getMeasuredHeight());
                    i23 = measuredWidth2;
                }
                i15++;
            }
            i11 = i23;
            i12 = i24;
        }
        setMeasuredDimension(i11, Math.max(i12, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        this.itemHorizontalTranslationEnabled = z5;
    }
}
