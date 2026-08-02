package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006R\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\t2\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/LinesLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "middleItemsOffset", "<init>", "(I)V", "Landroidx/recyclerview/widget/RecyclerView$v;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "", "recycleUnused", "(Landroidx/recyclerview/widget/RecyclerView$v;)V", "", "isAutoMeasureEnabled", "()Z", "Landroidx/recyclerview/widget/RecyclerView$p;", "generateDefaultLayoutParams", "()Landroidx/recyclerview/widget/RecyclerView$p;", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onLayoutCompleted", "(Landroidx/recyclerview/widget/RecyclerView$A;)V", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$A;)V", "maxLines", "setMaxLines", "(Ljava/lang/Integer;)V", "isLastViewMustBeVisible", "setLastViewVisibility", "(Z)V", "I", "Z", "Landroid/util/SparseArray;", "Landroid/view/View;", "viewCache", "Landroid/util/SparseArray;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesLayoutManager extends RecyclerView.o {
    private boolean isLastViewMustBeVisible;
    private final int middleItemsOffset;
    private int maxLines = Integer.MAX_VALUE;

    @NotNull
    private final SparseArray<View> viewCache = new SparseArray<>();

    public LinesLayoutManager(int i11) {
        this.middleItemsOffset = i11;
    }

    private final void recycleUnused(RecyclerView.v recycler) {
        List<RecyclerView.C> f7 = recycler.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getScrapList(...)");
        Iterator it = C7714v.U0(f7).iterator();
        while (it.hasNext()) {
            recycler.k(((RecyclerView.C) it.next()).itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v recycler, RecyclerView.A state) {
        int i11;
        int i12;
        LinesLayoutManager linesLayoutManager = this;
        if (recycler == null) {
            return;
        }
        detachAndScrapAttachedViews(recycler);
        int paddingLeft = linesLayoutManager.getPaddingLeft();
        int paddingTop = linesLayoutManager.getPaddingTop();
        int width = (linesLayoutManager.getWidth() - ((linesLayoutManager.middleItemsOffset <= linesLayoutManager.getPaddingRight() ? linesLayoutManager.middleItemsOffset : linesLayoutManager.getPaddingRight()) - linesLayoutManager.getPaddingRight())) - paddingLeft;
        boolean z11 = true;
        View view = linesLayoutManager.viewCache.get(linesLayoutManager.getItemCount() - 1);
        int i13 = 0;
        if (view == null) {
            view = recycler.g(linesLayoutManager.getItemCount() - 1);
            linesLayoutManager.measureChildWithMargins(view, 0, 0);
            linesLayoutManager.viewCache.put(linesLayoutManager.getItemCount() - 1, view);
            Intrinsics.checkNotNullExpressionValue(view, "also(...)");
        }
        int decoratedMeasuredWidth = linesLayoutManager.isLastViewMustBeVisible ? linesLayoutManager.getDecoratedMeasuredWidth(view) : 0;
        int itemCount = linesLayoutManager.getItemCount();
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= itemCount) {
                break;
            }
            View view2 = linesLayoutManager.viewCache.get(i16);
            if (view2 == null) {
                view2 = recycler.g(i16);
                linesLayoutManager.measureChildWithMargins(view2, i13, i13);
                linesLayoutManager.viewCache.put(i16, view2);
                Intrinsics.checkNotNullExpressionValue(view2, "also(...)");
            }
            linesLayoutManager.addView(view2);
            int decoratedMeasuredWidth2 = linesLayoutManager.getDecoratedMeasuredWidth(view2);
            boolean z12 = z11;
            int decoratedMeasuredHeight = linesLayoutManager.getDecoratedMeasuredHeight(view2);
            if (width >= paddingLeft + decoratedMeasuredWidth2 + linesLayoutManager.middleItemsOffset || i14 >= linesLayoutManager.maxLines) {
                int i17 = paddingTop;
                i11 = paddingLeft;
                i12 = i17;
            } else {
                int paddingLeft2 = linesLayoutManager.getPaddingLeft();
                int i18 = paddingTop + i15 + linesLayoutManager.middleItemsOffset;
                i14++;
                i11 = paddingLeft2;
                i12 = i18;
                i15 = 0;
            }
            int i19 = i14;
            int max = Math.max(decoratedMeasuredHeight, i15);
            if (i19 == linesLayoutManager.maxLines && i16 != linesLayoutManager.getItemCount() - 1) {
                if (width < (linesLayoutManager.middleItemsOffset * 2) + i11 + decoratedMeasuredWidth2 + decoratedMeasuredWidth) {
                    if (linesLayoutManager.isLastViewMustBeVisible) {
                        linesLayoutManager.removeView(view2);
                        linesLayoutManager.viewCache.remove(i16);
                        linesLayoutManager.addView(view);
                        linesLayoutManager.layoutDecoratedWithMargins(view, i11, i12, decoratedMeasuredWidth + i11, i12 + linesLayoutManager.getDecoratedMeasuredHeight(view));
                    }
                }
            }
            View view3 = view;
            int i21 = i12;
            linesLayoutManager = this;
            linesLayoutManager.layoutDecoratedWithMargins(view2, i11, i21, i11 + decoratedMeasuredWidth2, i21 + decoratedMeasuredHeight);
            paddingLeft = decoratedMeasuredWidth2 + linesLayoutManager.middleItemsOffset + i11;
            i16++;
            z11 = z12;
            paddingTop = i21;
            i14 = i19;
            i15 = max;
            view = view3;
            i13 = 0;
        }
        recycleUnused(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.A state) {
        this.viewCache.clear();
    }

    public final void setLastViewVisibility(boolean isLastViewMustBeVisible) {
        this.isLastViewMustBeVisible = isLastViewMustBeVisible;
    }

    public final void setMaxLines(Integer maxLines) {
        this.maxLines = maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE;
    }
}
