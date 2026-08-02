package ru.ozon.fintech.ui.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0007H\u0016J0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J0\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J0\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/common/CenterLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "<init>", "(Landroid/content/Context;IZ)V", "isVerticalScrollEnabled", "()Z", "setVerticalScrollEnabled", "(Z)V", "canScrollVertically", "layoutDecoratedWithMargins", "", "child", "Landroid/view/View;", "left", "top", "right", "bottom", "centerHorizontal", "centerVertical", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CenterLinearLayoutManager extends LinearLayoutManager {
    private boolean isVerticalScrollEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterLinearLayoutManager(@NotNull Context context, int i11, boolean z11) {
        super(context, i11, z11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isVerticalScrollEnabled = true;
    }

    private final void centerHorizontal(View child, int left, int top, int right, int bottom) {
        int i11;
        int i12;
        int i13;
        List<Integer> layoutGravity;
        WidgetState state;
        WidgetFrameLayout widgetFrameLayout = child instanceof WidgetFrameLayout ? (WidgetFrameLayout) child : null;
        Common common = (widgetFrameLayout == null || (state = widgetFrameLayout.getState()) == null) ? null : state.getCommon();
        Object parent = child.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        if (child.getLayoutParams().width == -1) {
            if ((common != null ? common.getPercentW() : null) == null) {
                return;
            }
        }
        Integer num = (common == null || (layoutGravity = common.getLayoutGravity()) == null) ? null : (Integer) C7714v.Q(0, layoutGravity);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (num == null || marginLayoutParams == null) {
            return;
        }
        int paddingStart = getPaddingStart() + (((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2);
        int i14 = right - left;
        if (num.intValue() == 8388611) {
            left += marginLayoutParams.leftMargin;
            right -= marginLayoutParams.rightMargin;
            i11 = top + marginLayoutParams.topMargin;
            i13 = marginLayoutParams.bottomMargin;
        } else if (num.intValue() == 1) {
            int i15 = i14 / 2;
            left = (paddingStart - i15) + marginLayoutParams.leftMargin;
            right = (paddingStart + i15) - marginLayoutParams.rightMargin;
            i11 = top + marginLayoutParams.topMargin;
            i13 = marginLayoutParams.bottomMargin;
        } else if (num.intValue() != 8388613) {
            i11 = left;
            i12 = right;
            ((WidgetFrameLayout) child).layout(left, i11, right, i12);
        } else {
            left = ((getWidth() - i14) - getPaddingEnd()) + marginLayoutParams.leftMargin;
            right = (getWidth() - getPaddingEnd()) - marginLayoutParams.rightMargin;
            i11 = top + marginLayoutParams.topMargin;
            i13 = marginLayoutParams.bottomMargin;
        }
        i12 = bottom - i13;
        ((WidgetFrameLayout) child).layout(left, i11, right, i12);
    }

    private final void centerVertical(View child, int left, int top, int right, int bottom) {
        int i11;
        int i12;
        int i13;
        List<Integer> layoutGravity;
        WidgetState state;
        WidgetFrameLayout widgetFrameLayout = child instanceof WidgetFrameLayout ? (WidgetFrameLayout) child : null;
        Common common = (widgetFrameLayout == null || (state = widgetFrameLayout.getState()) == null) ? null : state.getCommon();
        if (child.getLayoutParams().height == -1) {
            if ((common != null ? common.getPercentW() : null) == null) {
                return;
            }
        }
        Integer num = (common == null || (layoutGravity = common.getLayoutGravity()) == null) ? null : (Integer) C7714v.Q(1, layoutGravity);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (num == null || marginLayoutParams == null) {
            return;
        }
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        int i14 = right - left;
        if (num.intValue() != 48) {
            if (num.intValue() == 16) {
                left += marginLayoutParams.leftMargin;
                right -= marginLayoutParams.rightMargin;
                int i15 = i14 / 2;
                i11 = (paddingTop - i15) + marginLayoutParams.topMargin;
                i12 = (paddingTop + i15) - marginLayoutParams.bottomMargin;
            } else if (num.intValue() == 80) {
                left += marginLayoutParams.leftMargin;
                right -= marginLayoutParams.rightMargin;
                i11 = marginLayoutParams.topMargin + ((getHeight() - (bottom - top)) - getPaddingBottom());
                bottom = getHeight() - getPaddingBottom();
                i13 = marginLayoutParams.bottomMargin;
            } else {
                i11 = left;
                i12 = right;
            }
            ((WidgetFrameLayout) child).layout(left, i11, right, i12);
        }
        left += marginLayoutParams.leftMargin;
        right -= marginLayoutParams.rightMargin;
        i11 = top + marginLayoutParams.topMargin;
        i13 = marginLayoutParams.bottomMargin;
        i12 = bottom - i13;
        ((WidgetFrameLayout) child).layout(left, i11, right, i12);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.isVerticalScrollEnabled && super.canScrollVertically();
    }

    /* renamed from: isVerticalScrollEnabled, reason: from getter */
    public final boolean getIsVerticalScrollEnabled() {
        return this.isVerticalScrollEnabled;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.layoutDecoratedWithMargins(child, left, top, right, bottom);
        int orientation = getOrientation();
        if (orientation == 0) {
            centerVertical(child, left, top, right, bottom);
        } else {
            if (orientation != 1) {
                return;
            }
            centerHorizontal(child, left, top, right, bottom);
        }
    }

    public final void setVerticalScrollEnabled(boolean z11) {
        this.isVerticalScrollEnabled = z11;
    }
}
