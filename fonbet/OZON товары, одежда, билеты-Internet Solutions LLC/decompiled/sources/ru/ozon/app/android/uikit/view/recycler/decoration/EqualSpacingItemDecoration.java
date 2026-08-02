package ru.ozon.app.android.uikit.view.recycler.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lru/ozon/app/android/uikit/view/recycler/decoration/EqualSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "spacing", "", "includeEdge", "edgeSpace", "<init>", "(IZI)V", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "position", "itemCount", "", "setSpacingForDirection", "(Landroid/graphics/Rect;Landroidx/recyclerview/widget/RecyclerView$o;II)V", "resolveDisplayMode", "(Landroidx/recyclerview/widget/RecyclerView$o;)I", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "Z", "isReverse", "displayMode", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EqualSpacingItemDecoration extends RecyclerView.n {
    private static final int HORIZONTAL = 0;
    private int displayMode;
    private final int edgeSpace;
    private final boolean includeEdge;
    private boolean isReverse;
    private final int spacing;
    private static final int VERTICAL = 1;
    private static final int GRID = 2;

    public /* synthetic */ EqualSpacingItemDecoration(int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? 0 : i12);
    }

    private final int resolveDisplayMode(RecyclerView.o layoutManager) {
        if (!(layoutManager instanceof StaggeredGridLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (layoutManager != null && layoutManager.canScrollHorizontally()) {
                return HORIZONTAL;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                this.isReverse = ((LinearLayoutManager) layoutManager).getReverseLayout();
            }
            return VERTICAL;
        }
        return GRID;
    }

    private final void setSpacingForDirection(Rect outRect, RecyclerView.o layoutManager, int position, int itemCount) {
        int o11;
        int i11;
        int i12;
        if (this.displayMode == -1) {
            this.displayMode = resolveDisplayMode(layoutManager);
        }
        int i13 = this.displayMode;
        if (i13 == HORIZONTAL) {
            if (position != 0 || !this.includeEdge || (i11 = this.edgeSpace) == 0) {
                i11 = (position == 0 && this.includeEdge && this.edgeSpace == 0) ? this.spacing : (position != 0 || this.includeEdge) ? this.spacing : 0;
            }
            int i14 = itemCount - 1;
            if (position == i14 && this.includeEdge && (i12 = this.edgeSpace) != 0) {
                r2 = i12;
            } else if (position == i14 && this.includeEdge && this.edgeSpace == 0) {
                r2 = this.spacing;
            } else if (position != i14 || this.includeEdge) {
                r2 = this.spacing;
            }
            outRect.left = i11;
            outRect.right = r2;
            return;
        }
        if (i13 == VERTICAL) {
            if (this.isReverse) {
                outRect.bottom = position == 0 ? this.spacing : 0;
                outRect.top = position == itemCount + (-1) ? this.spacing : 0;
                return;
            } else {
                outRect.top = position == 0 ? this.spacing : 0;
                outRect.bottom = position == itemCount + (-1) ? this.spacing : 0;
                return;
            }
        }
        if (i13 == GRID) {
            if (layoutManager instanceof GridLayoutManager) {
                o11 = ((GridLayoutManager) layoutManager).g();
            } else {
                Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
                o11 = ((StaggeredGridLayoutManager) layoutManager).o();
            }
            int i15 = position % o11;
            if (this.includeEdge) {
                int i16 = this.spacing;
                outRect.left = i16 - ((i15 * i16) / o11);
                outRect.right = ((i15 + 1) * i16) / o11;
                if (position < o11) {
                    outRect.top = i16;
                }
                outRect.bottom = i16;
                return;
            }
            int i17 = this.spacing;
            outRect.left = (i15 * i17) / o11;
            outRect.right = i17 - (((i15 + 1) * i17) / o11);
            if (position >= o11) {
                outRect.top = i17;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        setSpacingForDirection(outRect, parent.getLayoutManager(), parent.getChildViewHolder(view).getAdapterPosition(), state.b());
    }

    public EqualSpacingItemDecoration(int i11, boolean z11, int i12) {
        this.spacing = i11;
        this.includeEdge = z11;
        this.edgeSpace = i12;
        this.displayMode = -1;
    }
}
