package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import WZ.l;
import android.content.Context;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u00011\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Ll10/i;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LWZ/l;)V", "", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;Ll20/d;)V", "onAttach", "onDetach", "Landroidx/recyclerview/widget/RecyclerView;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersAdapter;", "filtersAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersScrollStateSynchronizer;", "scrollSynchronizer", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersScrollStateSynchronizer;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersItemDecoration;", "decoration", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersItemDecoration;", "", "isScrolling", "Z", "ru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersWidgetViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersWidgetViewHolder$scrollListener$1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersWidgetViewHolder extends k<HotelsGalleryFiltersVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final HotelsGalleryFiltersItemDecoration decoration;

    @NotNull
    private final DesignSystemDimensProvider ds;

    @NotNull
    private final HotelsGalleryFiltersAdapter filtersAdapter;
    private boolean isScrolling;

    @NotNull
    private final HotelsGalleryFiltersWidgetViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final HotelsGalleryFiltersScrollStateSynchronizer scrollSynchronizer;

    @NotNull
    private final HotelsGalleryFiltersViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v2, types: [ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersWidgetViewHolder$scrollListener$1] */
    public HotelsGalleryFiltersWidgetViewHolder(@NotNull RecyclerView containerView, @NotNull i container, @NotNull HotelsGalleryFiltersViewModel viewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.container = container;
        this.viewModel = viewModel;
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(L11, null, 1, null);
        this.ds = dimens$default;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onPreProcess(new HotelsGalleryFiltersWidgetViewHolder$actionHandler$1(this)).customAnalyticHandler(HotelsGalleryFiltersWidgetViewHolder$actionHandler$2.INSTANCE).enableClickThrottling(handlersInhibitor).buildHandler();
        this.actionHandler = buildHandler;
        HotelsGalleryFiltersAdapter hotelsGalleryFiltersAdapter = new HotelsGalleryFiltersAdapter(this, buildHandler, tokenizedAnalytics);
        containerView.setAdapter(hotelsGalleryFiltersAdapter);
        this.filtersAdapter = hotelsGalleryFiltersAdapter;
        this.scrollSynchronizer = new HotelsGalleryFiltersScrollStateSynchronizer(viewModel, new HotelsGalleryFiltersWidgetViewHolder$scrollSynchronizer$1(this));
        HotelsGalleryFiltersItemDecoration hotelsGalleryFiltersItemDecoration = new HotelsGalleryFiltersItemDecoration(dimens$default.getMargin8(), dimens$default.getMargin12(), dimens$default.getMargin16(), dimens$default.getMargin8());
        this.decoration = hotelsGalleryFiltersItemDecoration;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersWidgetViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    HotelsGalleryFiltersWidgetViewHolder.this.isScrolling = false;
                } else if (newState == 1 || newState == 2) {
                    HotelsGalleryFiltersWidgetViewHolder.this.isScrolling = true;
                }
            }
        };
        containerView.addItemDecoration(hotelsGalleryFiltersItemDecoration);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.containerView.addOnScrollListener(this.scrollSynchronizer);
        this.container.e0().addOnScrollListener(this.scrollListener);
        C10727i.c(K.a(this), null, null, new HotelsGalleryFiltersWidgetViewHolder$onAttach$1(this, null), 3);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.containerView.removeOnScrollListener(this.scrollSynchronizer);
        this.container.e0().removeOnScrollListener(this.scrollListener);
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (this.viewModel.isRefreshing().getValue().booleanValue()) {
            return;
        }
        this.viewModel.updateStickyVisibility(false);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        if (!this.viewModel.isRefreshing().getValue().booleanValue() && this.isScrolling) {
            this.viewModel.updateStickyVisibility(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsGalleryFiltersVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.filtersAdapter.submitList(item.getItems());
    }
}
