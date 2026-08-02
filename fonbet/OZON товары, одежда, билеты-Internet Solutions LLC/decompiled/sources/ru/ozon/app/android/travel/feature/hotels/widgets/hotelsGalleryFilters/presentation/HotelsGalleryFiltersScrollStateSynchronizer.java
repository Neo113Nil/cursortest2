package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import B90.RunnableC2610l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersScrollStateSynchronizer;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "viewModel", "Lkotlin/Function0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "containerView", "restoreScrollState", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "Lkotlin/jvm/functions/Function0;", "", "isUserScroll", "Z", "isUpdatingFromViewModel", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersScrollStateSynchronizer extends RecyclerView.t {

    @NotNull
    private final Function0<LinearLayoutManager> getLayoutManager;
    private boolean isUpdatingFromViewModel;
    private boolean isUserScroll;

    @NotNull
    private final HotelsGalleryFiltersViewModel viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsGalleryFiltersScrollStateSynchronizer(@NotNull HotelsGalleryFiltersViewModel viewModel, @NotNull Function0<? extends LinearLayoutManager> getLayoutManager) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(getLayoutManager, "getLayoutManager");
        this.viewModel = viewModel;
        this.getLayoutManager = getLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (newState == 0) {
            this.isUserScroll = false;
        } else if (newState == 1 || newState == 2) {
            this.isUserScroll = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        LinearLayoutManager invoke;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.isUpdatingFromViewModel || !this.isUserScroll || (invoke = this.getLayoutManager.invoke()) == null) {
            return;
        }
        int findFirstVisibleItemPosition = invoke.findFirstVisibleItemPosition();
        View findViewByPosition = invoke.findViewByPosition(findFirstVisibleItemPosition);
        this.viewModel.updateScrollState(findFirstVisibleItemPosition, findViewByPosition != null ? invoke.getDecoratedLeft(findViewByPosition) : 0, true);
    }

    public final void restoreScrollState(@NotNull RecyclerView containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        if (this.isUpdatingFromViewModel) {
            return;
        }
        this.isUpdatingFromViewModel = true;
        try {
            ScrollState value = this.viewModel.getScrollState().getValue();
            LinearLayoutManager invoke = this.getLayoutManager.invoke();
            if (invoke != null) {
                invoke.scrollToPositionWithOffset(value.getPosition(), value.getOffset());
            }
        } finally {
            containerView.post(new RunnableC2610l(this, 5));
        }
    }
}
