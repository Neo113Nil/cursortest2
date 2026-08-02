package ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.normal;

import B5.j;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.TravelQuickFiltersVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.adapter.TravelQuickFiltersAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.adapter.TravelQuickFiltersItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/normal/TravelQuickFiltersWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/TravelQuickFiltersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setUpFiltersRecyclerView", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/TravelQuickFiltersVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/adapter/TravelQuickFiltersAdapter;", "filtersAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/adapter/TravelQuickFiltersAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "containerRv", "Landroidx/recyclerview/widget/RecyclerView;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelQuickFiltersWidgetViewHolder extends k<TravelQuickFiltersVO> {
    private final RecyclerView containerRv;

    @NotNull
    private final TravelQuickFiltersAdapter filtersAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelQuickFiltersWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.filtersAdapter = new TravelQuickFiltersAdapter(new ActionHandler.Builder(references, this).buildHandler());
        this.containerRv = containerView instanceof RecyclerView ? (RecyclerView) containerView : null;
        setUpFiltersRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(TravelQuickFiltersWidgetViewHolder travelQuickFiltersWidgetViewHolder) {
        RecyclerView recyclerView = travelQuickFiltersWidgetViewHolder.containerRv;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    private final void setUpFiltersRecyclerView() {
        RecyclerView recyclerView = this.containerRv;
        if (recyclerView != null) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
            recyclerView.setAdapter(this.filtersAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int px = ResourceExtKt.toPx(16, context2);
            Context context3 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            recyclerView.addItemDecoration(new TravelQuickFiltersItemDecoration(px, ResourceExtKt.toPx(8, context3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelQuickFiltersVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.filtersAdapter.setItems(item.getTags(), new j(this, 2));
    }
}
