package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.navigation.d;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public final class b extends d {

    /* renamed from: D, reason: collision with root package name */
    private final int f58021D;

    /* renamed from: E, reason: collision with root package name */
    private final int f58022E;

    /* renamed from: F, reason: collision with root package name */
    private final int f58023F;

    /* renamed from: G, reason: collision with root package name */
    private final int f58024G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f58025H;

    /* renamed from: I, reason: collision with root package name */
    private int[] f58026I;

    public b(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f58021D = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f58022E = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f58023F = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f58024G = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.f58026I = new int[5];
    }

    public final boolean Z() {
        return this.f58025H;
    }

    public final void a0(boolean z11) {
        this.f58025H = z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                int i19 = Y.f42258g;
                if (getLayoutDirection() == 1) {
                    int i21 = i15 - i17;
                    childAt.layout(i21 - childAt.getMeasuredWidth(), 0, i21, i16);
                } else {
                    childAt.layout(i17, 0, childAt.getMeasuredWidth() + i17, i16);
                }
                i17 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        g y11 = y();
        int size = View.MeasureSpec.getSize(i11);
        int size2 = y11.r().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i12);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int x11 = x();
        boolean z11 = x11 != -1 ? x11 == 0 : size2 > 3;
        int[] iArr = this.f58026I;
        int i13 = this.f58023F;
        if (z11 && this.f58025H) {
            View childAt = getChildAt(B());
            int visibility = childAt.getVisibility();
            int i14 = this.f58024G;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec);
                i14 = Math.max(i14, childAt.getMeasuredWidth());
            }
            int i15 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f58022E * i15), Math.min(i14, i13));
            int i16 = size - min;
            int min2 = Math.min(i16 / (i15 != 0 ? i15 : 1), this.f58021D);
            int i17 = i16 - (i15 * min2);
            int i18 = 0;
            while (i18 < childCount) {
                if (getChildAt(i18).getVisibility() != 8) {
                    int i19 = i18 == B() ? min : min2;
                    iArr[i18] = i19;
                    if (i17 > 0) {
                        iArr[i18] = i19 + 1;
                        i17--;
                    }
                } else {
                    iArr[i18] = 0;
                }
                i18++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), i13);
            int i21 = size - (size2 * min3);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() != 8) {
                    iArr[i22] = min3;
                    if (i21 > 0) {
                        iArr[i22] = min3 + 1;
                        i21--;
                    }
                } else {
                    iArr[i22] = 0;
                }
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(iArr[i24], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i23 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i23, View.MeasureSpec.makeMeasureSpec(i23, 1073741824), 0), View.resolveSizeAndState(size3, i12, 0));
    }
}
