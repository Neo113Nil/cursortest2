package ru.ozon.fintech.ui.container;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/fintech/ui/container/RecyclerStoresSnapHelper;", "Landroidx/recyclerview/widget/s;", "<init>", "()V", "Landroid/view/View;", "targetView", "Landroidx/recyclerview/widget/w;", "helper", "", "distanceToStart", "(Landroid/view/View;Landroidx/recyclerview/widget/w;)I", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "getStartView", "(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/w;)Landroid/view/View;", "getVerticalHelper", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/w;", "getHorizontalHelper", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "", "isValidSnap", "(Landroidx/recyclerview/widget/LinearLayoutManager;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "calculateDistanceToFinalSnap", "(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;)[I", "findSnapView", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroid/view/View;", "verticalHelper", "Landroidx/recyclerview/widget/w;", "horizontalHelper", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecyclerStoresSnapHelper extends s {
    private w horizontalHelper;
    private w verticalHelper;

    private final int distanceToStart(View targetView, w helper) {
        return helper.g(targetView) - helper.n();
    }

    private final w getHorizontalHelper(RecyclerView.o layoutManager) {
        if (this.horizontalHelper == null) {
            this.horizontalHelper = w.a(layoutManager);
        }
        w wVar = this.horizontalHelper;
        Intrinsics.f(wVar);
        return wVar;
    }

    private final View getStartView(RecyclerView.o layoutManager, w helper) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        boolean z11 = linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1;
        if (findFirstVisibleItemPosition == -1 || z11) {
            return null;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (helper.d(findViewByPosition) >= helper.e(findViewByPosition) / 2 && helper.d(findViewByPosition) > 0) {
            return findViewByPosition;
        }
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
            return null;
        }
        return linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition + 1);
    }

    private final w getVerticalHelper(RecyclerView.o layoutManager) {
        if (this.verticalHelper == null) {
            this.verticalHelper = w.c(layoutManager);
        }
        w wVar = this.verticalHelper;
        Intrinsics.f(wVar);
        return wVar;
    }

    private final boolean isValidSnap(LinearLayoutManager linearLayoutManager) {
        return (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) ? false : true;
    }

    @Override // androidx.recyclerview.widget.D
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.D
    @NotNull
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.o layoutManager, @NotNull View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToStart(targetView, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToStart(targetView, getVerticalHelper(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.D
    public View findSnapView(@NotNull RecyclerView.o layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return super.findSnapView(layoutManager);
        }
        if (!isValidSnap(linearLayoutManager)) {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            return ((LinearLayoutManager) layoutManager).canScrollHorizontally() ? getStartView(layoutManager, getHorizontalHelper(layoutManager)) : getStartView(layoutManager, getVerticalHelper(layoutManager));
        }
        return null;
    }
}
