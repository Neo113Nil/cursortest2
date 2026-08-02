package ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.sticky;

import JD.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.TravelQuickFiltersVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.adapter.TravelQuickFiltersAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.adapter.TravelQuickFiltersItemDecoration;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/sticky/TravelQuickFiltersTopWidgetHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/TravelQuickFiltersVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "", "setUpRecyclerView", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/TravelQuickFiltersVO;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/adapter/TravelQuickFiltersAdapter;", "filtersAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/presentation/adapter/TravelQuickFiltersAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "getFiltersRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "filtersRecyclerView", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelQuickFiltersTopWidgetHolder extends AbstractC6067d<TravelQuickFiltersVO> {

    @NotNull
    private final TravelQuickFiltersAdapter filtersAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelQuickFiltersTopWidgetHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.filtersAdapter = new TravelQuickFiltersAdapter(new ActionHandler.Builder(container, this).buildHandler());
        setUpRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(TravelQuickFiltersTopWidgetHolder travelQuickFiltersTopWidgetHolder) {
        RecyclerView filtersRecyclerView = travelQuickFiltersTopWidgetHolder.getFiltersRecyclerView();
        if (filtersRecyclerView != null) {
            filtersRecyclerView.smoothScrollToPosition(0);
        }
    }

    private final RecyclerView getFiltersRecyclerView() {
        View view = getView();
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        return null;
    }

    private final void setUpRecyclerView() {
        RecyclerView filtersRecyclerView = getFiltersRecyclerView();
        if (filtersRecyclerView != null) {
            Context context = filtersRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            filtersRecyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
            filtersRecyclerView.setAdapter(this.filtersAdapter);
            filtersRecyclerView.setLayoutManager(new LinearLayoutManager(filtersRecyclerView.getContext(), 0, false));
            Context context2 = filtersRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int px = ResourceExtKt.toPx(16, context2);
            Context context3 = filtersRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            filtersRecyclerView.addItemDecoration(new TravelQuickFiltersItemDecoration(px, ResourceExtKt.toPx(8, context3)));
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelQuickFiltersVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.filtersAdapter.setItems(item.getTags(), new a(this, 2));
    }
}
