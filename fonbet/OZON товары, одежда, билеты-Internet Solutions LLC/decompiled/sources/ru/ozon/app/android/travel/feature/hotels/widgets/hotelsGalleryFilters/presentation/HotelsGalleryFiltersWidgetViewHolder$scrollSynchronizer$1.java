package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFiltersWidgetViewHolder$scrollSynchronizer$1 extends AbstractC7737t implements Function0<LinearLayoutManager> {
    final /* synthetic */ HotelsGalleryFiltersWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFiltersWidgetViewHolder$scrollSynchronizer$1(HotelsGalleryFiltersWidgetViewHolder hotelsGalleryFiltersWidgetViewHolder) {
        super(0);
        this.this$0 = hotelsGalleryFiltersWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayoutManager invoke() {
        RecyclerView recyclerView;
        recyclerView = this.this$0.containerView;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }
}
