package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.adapter.AviaSearchResultV4LoadingAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateBottomButtonsView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AviaSearchResultV4LoadingVO.State.FetchState $state;
    final /* synthetic */ AviaSearchResultV4LoadingWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1(AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder, AviaSearchResultV4LoadingVO.State.FetchState fetchState) {
        super(0);
        this.this$0 = aviaSearchResultV4LoadingWidgetViewHolder;
        this.$state = fetchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder, Parcelable parcelable) {
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        recyclerView = aviaSearchResultV4LoadingWidgetViewHolder.recyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(parcelable);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RecyclerView recyclerView;
        AviaSearchResultV4LoadingAdapter aviaSearchResultV4LoadingAdapter;
        EmptyStateBottomButtonsView emptyStateBottomButtonsView;
        RecyclerView recyclerView2;
        RecyclerView.o layoutManager;
        recyclerView = this.this$0.recyclerView;
        final Parcelable onSaveInstanceState = (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) ? null : layoutManager.onSaveInstanceState();
        aviaSearchResultV4LoadingAdapter = this.this$0.loadAdapter;
        List<AviaSearchResultV4ListItemVO> flights = this.$state.getFlights();
        final AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder = this.this$0;
        aviaSearchResultV4LoadingAdapter.submitList(flights, new Runnable() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.a
            @Override // java.lang.Runnable
            public final void run() {
                AviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1.invoke$lambda$0(AviaSearchResultV4LoadingWidgetViewHolder.this, onSaveInstanceState);
            }
        });
        emptyStateBottomButtonsView = this.this$0.emptyStateView;
        if (emptyStateBottomButtonsView != null) {
            ViewExtKt.gone(emptyStateBottomButtonsView);
        }
        recyclerView2 = this.this$0.recyclerView;
        if (recyclerView2 == null) {
            return null;
        }
        ViewExtKt.show(recyclerView2);
        return Unit.f71690a;
    }
}
