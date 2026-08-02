package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0002J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersSkeletonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "margin", "", "skeletonHeight", "skeletonRadius", "", "dp16", "startMargin", "bind", "", "settings", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "addShimmers", "createShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "width", "height", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersSkeletonView extends FrameLayout {
    private final int dp16;
    private final int margin;
    private final int skeletonHeight;
    private final float skeletonRadius;
    private int startMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFiltersSkeletonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.margin = ResourceExtKt.toPx(8, context);
        this.skeletonHeight = ResourceExtKt.toPx(32, context);
        this.skeletonRadius = ResourceExtKt.toPxF(12, context);
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        this.startMargin = px;
        addShimmers();
    }

    private final void addShimmers() {
        int[] iArr = {40, 100, 76, 96, m.e.DEFAULT_DRAG_ANIMATION_DURATION};
        ArrayList arrayList = new ArrayList(5);
        for (int i11 = 0; i11 < 5; i11++) {
            arrayList.add(Integer.valueOf(ResourceExtKt.toPx(iArr[i11])));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            addView(createShimmerView(intValue, this.skeletonHeight, this.startMargin));
            this.startMargin = intValue + this.margin + this.startMargin;
        }
    }

    private final RoundedShimmerView createShimmerView(int width, int height, int startMargin) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        layoutParams.setMarginStart(startMargin);
        roundedShimmerView.setLayoutParams(layoutParams);
        roundedShimmerView.setCornerRadius(this.skeletonRadius);
        return roundedShimmerView;
    }

    public final void bind(QuickFiltersVO.SkeletonsSettings settings) {
        if (settings == null) {
            return;
        }
        int[] widthPatterns = settings.getWidthPatterns();
        if (getChildCount() == 0 && widthPatterns != null && widthPatterns.length == 0) {
            return;
        }
        Integer height = settings.getHeight();
        int intValue = height != null ? height.intValue() : this.skeletonHeight;
        if (widthPatterns != null) {
            int length = widthPatterns.length;
            for (int childCount = getChildCount(); childCount < length; childCount++) {
                int i11 = widthPatterns[childCount];
                addView(createShimmerView(i11, intValue, this.startMargin));
                this.startMargin = i11 + this.margin + this.startMargin;
            }
            int childCount2 = getChildCount() - 1;
            int length2 = widthPatterns.length;
            if (length2 <= childCount2) {
                while (true) {
                    View childAt = getChildAt(childCount2);
                    ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        this.startMargin -= layoutParams2.width + this.margin;
                        removeViewAt(childCount2);
                    }
                    if (childCount2 == length2) {
                        break;
                    } else {
                        childCount2--;
                    }
                }
            }
        }
        this.startMargin = this.dp16;
        int childCount3 = getChildCount();
        for (int i12 = 0; i12 < childCount3; i12++) {
            Integer J11 = widthPatterns != null ? C7705l.J(widthPatterns, i12) : null;
            View childAt2 = getChildAt(i12);
            if (childAt2 != null) {
                ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.height = intValue;
                if (J11 != null) {
                    layoutParams4.width = J11.intValue();
                }
                layoutParams4.setMarginStart(this.startMargin);
                this.startMargin = layoutParams4.width + this.margin + this.startMargin;
                childAt2.setLayoutParams(layoutParams4);
            }
        }
    }
}
