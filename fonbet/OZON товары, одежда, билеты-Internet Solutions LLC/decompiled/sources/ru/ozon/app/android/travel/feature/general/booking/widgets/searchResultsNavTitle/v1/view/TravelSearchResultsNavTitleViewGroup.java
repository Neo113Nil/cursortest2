package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/view/TravelSearchResultsNavTitleViewGroup;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "calculateWidthWithMargins", "(Landroid/view/View;)I", "startX", "centerY", "Lkotlin/Function2;", "", "preLayoutAction", "layout", "(IILkotlin/jvm/functions/Function2;)V", "newWidth", "newHeight", "recalculateDimensions", "(Landroid/view/View;II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelSearchResultsNavTitleViewGroup extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelSearchResultsNavTitleViewGroup(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int calculateWidthWithMargins(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        return view.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
    }

    private final void layout(int startX, int centerY, Function2<? super Integer, ? super View, Unit> preLayoutAction) {
        for (int i11 = 0; i11 < 3; i11++) {
            View childAt = getChildAt(i11);
            if (preLayoutAction != null) {
                Integer valueOf = Integer.valueOf(i11);
                Intrinsics.f(childAt);
                preLayoutAction.invoke(valueOf, childAt);
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = startX + layoutParams2.leftMargin;
            int paddingTop = (centerY - (measuredHeight / 2)) + getPaddingTop();
            childAt.layout(i12, paddingTop, i12 + measuredWidth, measuredHeight + paddingTop);
            startX = i12 + measuredWidth + layoutParams2.rightMargin;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateDimensions(View view, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(i12, LinearLayoutManager.INVALID_OFFSET));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            View childAt = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            i11 += calculateWidthWithMargins(childAt);
        }
        int paddingLeft = ((right - left) - getPaddingLeft()) - getPaddingStart();
        int paddingBottom = ((bottom - top) - getPaddingBottom()) - getPaddingTop();
        int i13 = paddingLeft / 2;
        int i14 = paddingBottom / 2;
        int i15 = i11 / 2;
        if (i11 <= paddingLeft) {
            layout((i13 - i15) + getPaddingLeft(), i14, null);
            return;
        }
        View childAt2 = getChildAt(1);
        Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
        int calculateWidthWithMargins = calculateWidthWithMargins(childAt2);
        int i16 = i13 - (calculateWidthWithMargins / 2);
        View childAt3 = getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt3, "getChildAt(...)");
        int calculateWidthWithMargins2 = calculateWidthWithMargins(childAt3);
        View childAt4 = getChildAt(2);
        Intrinsics.checkNotNullExpressionValue(childAt4, "getChildAt(...)");
        int calculateWidthWithMargins3 = calculateWidthWithMargins(childAt4);
        boolean z11 = calculateWidthWithMargins2 > i16;
        boolean z12 = calculateWidthWithMargins3 > i16;
        if (z11 && z12) {
            layout(getPaddingLeft(), i14, new TravelSearchResultsNavTitleViewGroup$onLayout$1(this, i16, paddingBottom));
        } else if (z11) {
            layout(getPaddingLeft(), i14, new TravelSearchResultsNavTitleViewGroup$onLayout$2(paddingLeft, calculateWidthWithMargins, calculateWidthWithMargins3, this, paddingBottom));
        } else if (z12) {
            layout(getPaddingLeft(), i14, new TravelSearchResultsNavTitleViewGroup$onLayout$3(paddingLeft, calculateWidthWithMargins, calculateWidthWithMargins2, this, paddingBottom));
        }
    }

    public /* synthetic */ TravelSearchResultsNavTitleViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelSearchResultsNavTitleViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
