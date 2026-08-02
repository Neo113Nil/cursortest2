package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.adapter;

import E0.C2942q;
import Nh.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001d¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/adapter/OverlayButtonsV2DividerDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "", "color", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "setColor", "(I)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "dividerWidth", "I", "dividerHeightPx", "dividerHalfHeightPx", "", "dividerTop", "F", "dividerBottom", "lastParentHeight", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsV2DividerDecoration extends RecyclerView.n {
    private float dividerBottom;
    private final int dividerHalfHeightPx;
    private final int dividerHeightPx;
    private float dividerTop;
    private final int dividerWidth;
    private int lastParentHeight;

    @NotNull
    private final Paint paint;

    public OverlayButtonsV2DividerDecoration(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i11);
        this.paint = paint;
        this.dividerWidth = ResourceExtKt.toPx(1, context);
        int px = ResourceExtKt.toPx(20, context);
        this.dividerHeightPx = px;
        this.dividerHalfHeightPx = px / 2;
        this.lastParentHeight = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        if (a11 != -1) {
            outRect.left = a11 != 0 ? this.dividerWidth : 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        View childAt;
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RecyclerView.g a11 = C2942q.a(parent, "parent", state, "state");
        int cardsCount = a11 != null ? a11.getCardsCount() : 0;
        if (cardsCount < 2) {
            return;
        }
        if (parent.getHeight() != this.lastParentHeight) {
            float height = (parent.getHeight() / 2.0f) - this.dividerHalfHeightPx;
            this.dividerTop = height;
            this.dividerBottom = height + this.dividerHeightPx;
            this.lastParentHeight = parent.getHeight();
        }
        int childCount = parent.getChildCount();
        int i11 = 1;
        while (i11 < childCount) {
            View childAt2 = parent.getChildAt(i11 - 1);
            if (childAt2 == null || (childAt = parent.getChildAt(i11)) == null) {
                return;
            }
            int childAdapterPosition = parent.getChildAdapterPosition(childAt2);
            int childAdapterPosition2 = parent.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition2 != -1 && childAdapterPosition2 == childAdapterPosition + 1 && childAdapterPosition < cardsCount - 1) {
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                if ((layoutParams instanceof RecyclerView.p ? (RecyclerView.p) layoutParams : null) != null) {
                    float right = childAt2.getRight() + r4.getMarginEnd();
                    canvas2 = canvas;
                    canvas2.drawRect(right, this.dividerTop, right + this.dividerWidth, this.dividerBottom, this.paint);
                    i11++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i11++;
            canvas = canvas2;
        }
    }

    public final void setColor(int color) {
        this.paint.setColor(color);
    }
}
