package ma;

import Aa.i;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import ia.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends i {

    /* renamed from: T1, reason: collision with root package name */
    public final int f56413T1;

    /* renamed from: V1, reason: collision with root package name */
    public final int f56414V1;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f56415b2;

    /* renamed from: g2, reason: collision with root package name */
    public final List f56416g2;

    /* renamed from: x1, reason: collision with root package name */
    public final int f56417x1;

    /* renamed from: y1, reason: collision with root package name */
    public final int f56418y1;

    public b(Context context) {
        super(context);
        this.f56416g2 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f56417x1 = resources.getDimensionPixelSize(e.f48340f);
        this.f56418y1 = resources.getDimensionPixelSize(e.f48342g);
        this.f56413T1 = resources.getDimensionPixelSize(e.f48336d);
        this.f56414V1 = resources.getDimensionPixelSize(e.f48338e);
    }

    @Override // Aa.i
    public Aa.e h(Context context) {
        return new C5570a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.f56416g2.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE);
        int i16 = 0;
        if (getItemIconGravity() == 0) {
            if (m(getLabelVisibilityMode(), currentVisibleContentItemCount) && v()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int i17 = this.f56414V1;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f56413T1, Integer.MIN_VALUE), makeMeasureSpec);
                    i17 = Math.max(i17, childAt.getMeasuredWidth());
                }
                int i18 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int min = Math.min(size - (this.f56418y1 * i18), Math.min(i17, this.f56413T1));
                int i19 = size - min;
                int min2 = Math.min(i19 / (i18 != 0 ? i18 : 1), this.f56417x1);
                int i20 = i19 - (i18 * min2);
                int i21 = 0;
                while (i21 < childCount) {
                    if (getChildAt(i21).getVisibility() != 8) {
                        i15 = i21 == getSelectedItemPosition() ? min : min2;
                        if (i20 > 0) {
                            i15++;
                            i20--;
                        }
                    } else {
                        i15 = 0;
                    }
                    this.f56416g2.add(Integer.valueOf(i15));
                    i21++;
                }
            } else {
                int min3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.f56413T1);
                int i22 = size - (currentVisibleContentItemCount * min3);
                for (int i23 = 0; i23 < childCount; i23++) {
                    if (getChildAt(i23).getVisibility() == 8) {
                        i14 = 0;
                    } else if (i22 > 0) {
                        i14 = min3 + 1;
                        i22--;
                    } else {
                        i14 = min3;
                    }
                    this.f56416g2.add(Integer.valueOf(i14));
                }
            }
            i12 = 0;
            i13 = 0;
            while (i16 < childCount) {
                View childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.f56416g2.get(i16)).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    i12 += childAt2.getMeasuredWidth();
                    i13 = Math.max(i13, childAt2.getMeasuredHeight());
                }
                i16++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f10 = size;
            float min4 = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f10;
            float f11 = currentVisibleContentItemCount;
            int round = Math.round(min4 / f11);
            int round2 = Math.round(f10 / f11);
            int i24 = 0;
            int i25 = 0;
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    i24 += childAt3.getMeasuredWidth();
                    i25 = Math.max(i25, childAt3.getMeasuredHeight());
                }
                i16++;
            }
            i12 = i24;
            i13 = i25;
        }
        setMeasuredDimension(i12, Math.max(i13, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f56415b2 = z10;
    }

    public boolean v() {
        return this.f56415b2;
    }
}
