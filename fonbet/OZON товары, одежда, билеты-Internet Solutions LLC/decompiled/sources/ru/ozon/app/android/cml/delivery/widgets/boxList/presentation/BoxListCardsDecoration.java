package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ/\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListCardsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "firstRowTopSpacing", "lastRowBottomSpacing", "startEdgeToParentSpacing", "endEdgeToParentSpacing", "betweenItemsSpacing", "<init>", "(IIIII)V", "position", "spanCount", "", "isItemInTopRow", "(II)Z", "itemCount", "isItemInLastRow", "(III)Z", "isItemInFirstColumn", "isItemInLastColumn", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxListCardsDecoration extends RecyclerView.n {
    private final int betweenItemsSpacing;
    private final int endEdgeToParentSpacing;
    private final int firstRowTopSpacing;
    private final int lastRowBottomSpacing;
    private final int startEdgeToParentSpacing;

    public BoxListCardsDecoration(int i11, int i12, int i13, int i14, int i15) {
        this.firstRowTopSpacing = i11;
        this.lastRowBottomSpacing = i12;
        this.startEdgeToParentSpacing = i13;
        this.endEdgeToParentSpacing = i14;
        this.betweenItemsSpacing = i15;
    }

    private final boolean isItemInFirstColumn(int position, int spanCount) {
        return position < spanCount ? position == 0 : position % spanCount == 0;
    }

    private final boolean isItemInLastColumn(int position, int spanCount) {
        return position < spanCount ? position == spanCount - 1 : (position + 1) % spanCount == 0;
    }

    private final boolean isItemInLastRow(int position, int itemCount, int spanCount) {
        int i11 = itemCount % spanCount;
        IntRange o11 = i11 == 0 ? h.o(itemCount - spanCount, itemCount) : h.o(itemCount - i11, itemCount);
        return position <= o11.getF71843b() && o11.getF71842a() <= position;
    }

    private final boolean isItemInTopRow(int position, int spanCount) {
        return position >= 0 && position < spanCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.o layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int g10 = gridLayoutManager.g();
            int adapterPosition = parent.getChildViewHolder(view).getAdapterPosition();
            int b11 = state.b();
            outRect.left = isItemInFirstColumn(adapterPosition, g10) ? this.startEdgeToParentSpacing : this.betweenItemsSpacing;
            outRect.right = isItemInLastColumn(adapterPosition, g10) ? this.endEdgeToParentSpacing : this.betweenItemsSpacing;
            outRect.top = isItemInTopRow(adapterPosition, g10) ? this.firstRowTopSpacing : this.betweenItemsSpacing;
            outRect.bottom = isItemInLastRow(adapterPosition, b11, g10) ? this.lastRowBottomSpacing : this.betweenItemsSpacing;
        }
    }
}
