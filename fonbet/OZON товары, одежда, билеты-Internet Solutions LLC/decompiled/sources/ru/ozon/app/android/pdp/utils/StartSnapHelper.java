package ru.ozon.app.android.pdp.utils;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/utils/StartSnapHelper;", "Landroidx/recyclerview/widget/s;", "<init>", "()V", "Landroid/view/View;", "targetView", "Landroidx/recyclerview/widget/w;", "helper", "", "distanceToStart", "(Landroid/view/View;Landroidx/recyclerview/widget/w;)I", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "getStartView", "(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/w;)Landroid/view/View;", "getVerticalHelper", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/w;", "getHorizontalHelper", "", "calculateDistanceToFinalSnap", "(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;)[I", "findSnapView", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroid/view/View;", "offsetPx", "I", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StartSnapHelper extends s {
    private final int offsetPx = Dimens.INSTANCE.getDP_8();

    private final int distanceToStart(View targetView, w helper) {
        return helper.g(targetView) - helper.n();
    }

    private final w getHorizontalHelper(RecyclerView.o layoutManager) {
        w a11 = w.a(layoutManager);
        Intrinsics.checkNotNullExpressionValue(a11, "createHorizontalHelper(...)");
        return a11;
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
        w c11 = w.c(layoutManager);
        Intrinsics.checkNotNullExpressionValue(c11, "createVerticalHelper(...)");
        return c11;
    }

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.D
    @NotNull
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.o layoutManager, @NotNull View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToStart(targetView, getHorizontalHelper(layoutManager)) - this.offsetPx;
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
        return layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).canScrollHorizontally() ? getStartView(layoutManager, getHorizontalHelper(layoutManager)) : getStartView(layoutManager, getVerticalHelper(layoutManager)) : super.findSnapView(layoutManager);
    }
}
