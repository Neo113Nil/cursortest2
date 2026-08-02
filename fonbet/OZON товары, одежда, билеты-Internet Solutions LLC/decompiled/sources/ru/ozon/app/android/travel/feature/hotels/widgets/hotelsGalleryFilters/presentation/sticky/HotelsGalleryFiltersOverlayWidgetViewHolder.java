package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

import B90.e0;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersScrollStateSynchronizer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001W\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u001a\u0010,\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010)R\u0016\u00105\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00150@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR(\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010Q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0013¨\u0006\\"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersOverlayWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;", "Landroid/view/ViewGroup;", "rootView", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Ll10/i;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LWZ/l;)V", "", "getContentHeight", "()I", "Landroid/view/View;", "", "updateView", "(Landroid/view/View;)V", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "action", "handleRefresh", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;)V", "", "shouldAnimateAppearance", "()Z", "onWidgetCreated", "()V", "addView", "removeView", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;)V", "onRefresh", "onWidgetDestroyed", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/RecyclerView;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "rootRecyclerView", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout$f;", "appBarOffsetListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersScrollStateSynchronizer;", "scrollSynchronizer", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersScrollStateSynchronizer;", "Landroidx/recyclerview/widget/RecyclerView$t;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "onStickyItemClick", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter;", "stickyAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersStickyAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersItemDecoration;", "decoration", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersItemDecoration;", "Lxe/B0;", "animatorJob", "Lxe/B0;", "updateScrollJob", "isFirstAppearance", "Z", "hasScrollOccurred", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersAnimator;", "animator", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersAnimator;", "ru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersOverlayWidgetViewHolder$rootScrollListener$1", "rootScrollListener", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersOverlayWidgetViewHolder$rootScrollListener$1;", "getStickyMaxHeight", "stickyMaxHeight", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersOverlayWidgetViewHolder extends AbstractC6065b<HotelsGalleryFiltersVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsGalleryFiltersAnimator animator;
    private B0 animatorJob;
    private final AppBarLayout appBar;

    @NotNull
    private final AppBarLayout.f appBarOffsetListener;

    @NotNull
    private final i container;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final HotelsGalleryFiltersItemDecoration decoration;

    @NotNull
    private final DesignSystemDimensProvider ds;
    private boolean hasScrollOccurred;
    private boolean isFirstAppearance;

    @NotNull
    private final View metricView;

    @NotNull
    private final Function2<Integer, AtomAction, Unit> onStickyItemClick;

    @NotNull
    private final RecyclerView rootRecyclerView;

    @NotNull
    private final HotelsGalleryFiltersOverlayWidgetViewHolder$rootScrollListener$1 rootScrollListener;

    @NotNull
    private final ViewGroup rootView;
    private RecyclerView.t scrollListener;

    @NotNull
    private final HotelsGalleryFiltersScrollStateSynchronizer scrollSynchronizer;

    @NotNull
    private final HotelsGalleryFiltersStickyAdapter stickyAdapter;
    private B0 updateScrollJob;

    @NotNull
    private final HotelsGalleryFiltersViewModel viewModel;

    /* JADX WARN: Type inference failed for: r3v5, types: [ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$rootScrollListener$1] */
    public HotelsGalleryFiltersOverlayWidgetViewHolder(@NotNull ViewGroup rootView, @NotNull RecyclerView containerView, @NotNull i container, @NotNull HotelsGalleryFiltersViewModel viewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.rootView = rootView;
        this.containerView = containerView;
        this.container = container;
        this.viewModel = viewModel;
        this.metricView = containerView;
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(L11, null, 1, null);
        this.ds = dimens$default;
        this.rootRecyclerView = ComposerViewExtensionKt.composerRecyclerView(container.Y());
        this.appBar = ComposerViewExtensionKt.composerAppbar(container.Y());
        this.appBarOffsetListener = new AppBarLayout.f() { // from class: fS.b
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                HotelsGalleryFiltersOverlayWidgetViewHolder.appBarOffsetListener$lambda$0(HotelsGalleryFiltersOverlayWidgetViewHolder.this, appBarLayout, i11);
            }
        };
        this.scrollSynchronizer = new HotelsGalleryFiltersScrollStateSynchronizer(viewModel, new HotelsGalleryFiltersOverlayWidgetViewHolder$scrollSynchronizer$1(this));
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new HotelsGalleryFiltersOverlayWidgetViewHolder$actionHandler$1(this)).customAnalyticHandler(HotelsGalleryFiltersOverlayWidgetViewHolder$actionHandler$2.INSTANCE).enableClickThrottling(handlersInhibitor).buildHandler();
        HotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1 hotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1 = new HotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1(this);
        this.onStickyItemClick = hotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1;
        HotelsGalleryFiltersStickyAdapter hotelsGalleryFiltersStickyAdapter = new HotelsGalleryFiltersStickyAdapter(this, hotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1, tokenizedAnalytics);
        containerView.setAdapter(hotelsGalleryFiltersStickyAdapter);
        this.stickyAdapter = hotelsGalleryFiltersStickyAdapter;
        this.decoration = new HotelsGalleryFiltersItemDecoration(dimens$default.getMargin8(), dimens$default.getMargin8(), dimens$default.getMargin8(), dimens$default.getMargin6());
        this.animator = new HotelsGalleryFiltersAnimator(containerView, new HotelsGalleryFiltersOverlayWidgetViewHolder$animator$1(this));
        this.rootScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$rootScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 1 || newState == 2) {
                    HotelsGalleryFiltersOverlayWidgetViewHolder.this.hasScrollOccurred = true;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addView$lambda$2(HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder) {
        hotelsGalleryFiltersOverlayWidgetViewHolder.viewModel.finishRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appBarOffsetListener$lambda$0(HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder, AppBarLayout appBarLayout, int i11) {
        hotelsGalleryFiltersOverlayWidgetViewHolder.containerView.setY(appBarLayout.getBottom());
    }

    private final int getContentHeight() {
        ViewGroup.LayoutParams layoutParams = this.containerView.getLayoutParams();
        RecyclerView recyclerView = this.containerView;
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = -2;
        recyclerView.setLayoutParams(layoutParams2);
        RecyclerView recyclerView2 = this.containerView;
        Object parent = recyclerView2.getParent();
        View view = parent instanceof View ? (View) parent : null;
        recyclerView2.measure(View.MeasureSpec.makeMeasureSpec(view != null ? view.getWidth() : 0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.containerView.getMeasuredHeight();
        RecyclerView recyclerView3 = this.containerView;
        ViewGroup.LayoutParams layoutParams3 = recyclerView3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = layoutParams != null ? layoutParams.height : -2;
        recyclerView3.setLayoutParams(layoutParams3);
        return measuredHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getStickyMaxHeight() {
        return getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRefresh(final AtomAction.Refresh action) {
        this.viewModel.startRefresh();
        RecyclerView.t tVar = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$handleRefresh$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator;
                i iVar;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                    if (gridLayoutManager == null || gridLayoutManager.findFirstVisibleItemPosition() != 0) {
                        return;
                    }
                    recyclerView.removeOnScrollListener(this);
                    HotelsGalleryFiltersOverlayWidgetViewHolder.this.scrollListener = null;
                    hotelsGalleryFiltersAnimator = HotelsGalleryFiltersOverlayWidgetViewHolder.this.animator;
                    hotelsGalleryFiltersAnimator.animateDisappearance();
                    iVar = HotelsGalleryFiltersOverlayWidgetViewHolder.this.container;
                    InterfaceC7851b.a.e(iVar.J().o(), action.getLink(), null, null, 6);
                }
            }
        };
        this.scrollListener = tVar;
        this.rootRecyclerView.addOnScrollListener(tVar);
        this.rootRecyclerView.smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAnimateAppearance() {
        if (!this.isFirstAppearance) {
            return true;
        }
        this.isFirstAppearance = false;
        return this.hasScrollOccurred;
    }

    private final void updateView(View view) {
        view.setY(this.appBar != null ? r0.getBottom() : 0.0f);
        view.setVisibility(0);
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        this.rootView.addView(this.containerView);
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            appBarLayout.q(this.appBarOffsetListener);
        }
        AppBarLayout appBarLayout2 = this.appBar;
        if (appBarLayout2 != null) {
            appBarLayout2.d(this.appBarOffsetListener);
        }
        if (this.viewModel.isRefreshing().getValue().booleanValue()) {
            this.containerView.setVisibility(8);
            this.rootView.post(new e0(this, 1));
        } else {
            this.containerView.setVisibility(this.viewModel.getStickyVisibleState().getValue().booleanValue() ? 0 : 8);
        }
        if (this.containerView.getVisibility() == 0) {
            updateView(this.containerView);
        }
        this.animatorJob = C10727i.c(K.a(this), null, null, new HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2(this, null), 3);
        this.updateScrollJob = C10727i.c(K.a(this), null, null, new HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3(this, null), 3);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        this.animator.cancel();
        B0 b02 = this.animatorJob;
        if (b02 != null) {
            b02.j(null);
        }
        RecyclerView recyclerView = this.containerView;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        recyclerView.setLayoutParams(layoutParams);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.isFirstAppearance = true;
        this.containerView.addItemDecoration(this.decoration);
        this.containerView.addOnScrollListener(this.scrollSynchronizer);
        this.rootRecyclerView.addOnScrollListener(this.rootScrollListener);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.containerView.removeOnScrollListener(this.scrollSynchronizer);
        RecyclerView.t tVar = this.scrollListener;
        if (tVar != null) {
            this.rootRecyclerView.removeOnScrollListener(tVar);
        }
        this.scrollListener = null;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        B0 b02 = this.updateScrollJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.updateScrollJob = null;
        this.animator.cancel();
        B0 b03 = this.animatorJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.animatorJob = null;
        this.rootView.removeView(this.containerView);
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            appBarLayout.q(this.appBarOffsetListener);
        }
        this.rootRecyclerView.removeOnScrollListener(this.rootScrollListener);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsGalleryFiltersVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.stickyAdapter.setSelectionStyles(item.getSelectedTagButton(), item.getDefaultTagButton());
        this.stickyAdapter.setInitialSelectedPosition(item.getSelectedPosition());
        this.stickyAdapter.submitList(item.getStickyItems());
    }
}
