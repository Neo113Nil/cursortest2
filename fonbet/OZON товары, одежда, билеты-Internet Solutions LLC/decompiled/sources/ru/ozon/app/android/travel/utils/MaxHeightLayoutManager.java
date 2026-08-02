package ru.ozon.app.android.travel.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010 \u001a\u00020\u00042\n\u0010\u001b\u001a\u00060\u001aR\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/utils/MaxHeightLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onItemsChanged", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "positionStart", "itemCount", "onItemsAdded", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "onItemsUpdated", "Landroidx/recyclerview/widget/RecyclerView$p;", "lp", "", "checkLayoutParams", "(Landroidx/recyclerview/widget/RecyclerView$p;)Z", "generateDefaultLayoutParams", "()Landroidx/recyclerview/widget/RecyclerView$p;", "Landroid/view/ViewGroup$LayoutParams;", "generateLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$p;", "getHeightMode", "()I", "getMinimumHeight", "Landroidx/recyclerview/widget/RecyclerView$v;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "widthSpec", "heightSpec", "onMeasure", "(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$A;II)V", "isHeightMeasured", "Z", "minHeight", "I", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxHeightLayoutManager extends LinearLayoutManager {
    private boolean isHeightMeasured;
    private int minHeight;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p lp) {
        return lp != null && ((ViewGroup.MarginLayoutParams) lp).height == -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams lp) {
        if (lp == null) {
            return generateDefaultLayoutParams();
        }
        RecyclerView.p pVar = lp instanceof ViewGroup.MarginLayoutParams ? new RecyclerView.p((ViewGroup.MarginLayoutParams) lp) : new RecyclerView.p(lp);
        ((ViewGroup.MarginLayoutParams) pVar).height = -1;
        return pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getHeightMode() {
        if (this.isHeightMeasured) {
            return View.MeasureSpec.makeMeasureSpec(getMinimumHeight(), 1073741824);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getMinimumHeight() {
        if (!this.isHeightMeasured) {
            return super.getMinimumHeight();
        }
        return getPaddingBottom() + getPaddingTop() + this.minHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(@NotNull RecyclerView recyclerView, int positionStart, int itemCount) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.isHeightMeasured = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.isHeightMeasured = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(@NotNull RecyclerView recyclerView, int positionStart, int itemCount) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.isHeightMeasured = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onMeasure(@NotNull RecyclerView.v recycler, @NotNull RecyclerView.A state, int widthSpec, int heightSpec) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.b() == 0 || this.isHeightMeasured) {
            super.onMeasure(recycler, state, widthSpec, heightSpec);
            return;
        }
        this.minHeight = 0;
        View g10 = recycler.g(0);
        Intrinsics.checkNotNullExpressionValue(g10, "getViewForPosition(...)");
        for (int b11 = state.b() - 1; -1 < b11; b11--) {
            recycler.b(b11, g10);
            measureChildWithMargins(g10, 0, 0);
            this.minHeight = Math.max(this.minHeight, g10.getMeasuredHeight());
        }
        if (this.minHeight > 0) {
            this.isHeightMeasured = true;
        }
        super.onMeasure(recycler, state, widthSpec, heightSpec);
    }
}
