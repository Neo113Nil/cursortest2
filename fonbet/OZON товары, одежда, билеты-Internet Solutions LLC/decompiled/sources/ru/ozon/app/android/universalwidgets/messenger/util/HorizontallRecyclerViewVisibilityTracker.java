package ru.ozon.app.android.universalwidgets.messenger.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/util/HorizontallRecyclerViewVisibilityTracker;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;)V", "setupVisibilityListener", "", "checkVisibleItems", "checkItemVisibility", "position", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontallRecyclerViewVisibilityTracker {

    @NotNull
    private final LinearLayoutManager layoutManager;

    @NotNull
    private final RecyclerView recyclerView;

    public HorizontallRecyclerViewVisibilityTracker(@NotNull RecyclerView recyclerView, @NotNull LinearLayoutManager layoutManager) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.recyclerView = recyclerView;
        this.layoutManager = layoutManager;
        setupVisibilityListener();
    }

    private final void checkItemVisibility(int position) {
        Object findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(position);
        VisibleVH visibleVH = findViewHolderForAdapterPosition instanceof VisibleVH ? (VisibleVH) findViewHolderForAdapterPosition : null;
        if (visibleVH == null) {
            return;
        }
        visibleVH.onViewInVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkVisibleItems() {
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1 || findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return;
        }
        while (true) {
            checkItemVisibility(findFirstVisibleItemPosition);
            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                return;
            } else {
                findFirstVisibleItemPosition++;
            }
        }
    }

    private final void setupVisibilityListener() {
        this.recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.universalwidgets.messenger.util.HorizontallRecyclerViewVisibilityTracker$setupVisibilityListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    HorizontallRecyclerViewVisibilityTracker.this.checkVisibleItems();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                HorizontallRecyclerViewVisibilityTracker.this.checkVisibleItems();
            }
        });
    }
}
