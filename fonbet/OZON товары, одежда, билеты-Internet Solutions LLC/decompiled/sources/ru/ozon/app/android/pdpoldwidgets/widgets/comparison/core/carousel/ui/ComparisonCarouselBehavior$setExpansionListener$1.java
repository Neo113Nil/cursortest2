package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ComparisonCarouselBehavior$setExpansionListener$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ RecyclerView $this_setExpansionListener;
    final /* synthetic */ ComparisonCarouselBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCarouselBehavior$setExpansionListener$1(ComparisonCarouselBehavior comparisonCarouselBehavior, RecyclerView recyclerView) {
        super(0);
        this.this$0 = comparisonCarouselBehavior;
        this.$this_setExpansionListener = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RecyclerView recyclerView;
        ViewGroup viewGroup;
        ComparisonCarouselViewModel comparisonCarouselViewModel;
        recyclerView = this.this$0.recyclerView;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        View findViewByPosition = linearLayoutManager.findViewByPosition(findLastCompletelyVisibleItemPosition);
        if (findViewByPosition != null) {
            findViewByPosition.getGlobalVisibleRect(rect);
        }
        viewGroup = this.this$0.composerContainer;
        viewGroup.getGlobalVisibleRect(rect2);
        comparisonCarouselViewModel = this.this$0.comparisonCarouselViewModel;
        boolean isCollapsed = comparisonCarouselViewModel.getCarouselBehaviorMode().isCollapsed();
        RecyclerView.g adapter = this.$this_setExpansionListener.getAdapter();
        boolean z11 = adapter != null && adapter.getCardsCount() - 1 == findLastCompletelyVisibleItemPosition;
        boolean z12 = rect.bottom < rect2.bottom;
        if (isCollapsed && z11 && z12) {
            this.this$0.animateCarousel(ComparisonCarouselBehavior.Mode.Expanded.INSTANCE);
            this.$this_setExpansionListener.smoothScrollToPosition(0);
        }
    }
}
