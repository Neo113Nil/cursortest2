package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation;

import Ae.M0;
import WZ.t;
import Wc.a;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsScrollState;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollUtilsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.adapter.CatalogueTabsItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.adapter.CatalogueTabsItemsDecorator;
import ru.ozon.composer.ui.widget.k;
import xe.C10727i;
import xe.Y;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 K2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001KB;\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0013*\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001c\u0010\u001e\u001a\u00020\u0013*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)J-\u0010/\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010>\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u0004\u0018\u00010D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/CatalogTabsScrollEventListener;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "catalogTabsController", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsDrawableCache;", "drawableCache", "", "isPreCreateWidgetsCategoryMainPageFresh", "isPerfEnabled", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Ll10/i;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsDrawableCache;ZZ)V", "item", "", "setupRecyclerViewItemDecoration", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;)V", "isStickyViewHolder", "setupTopRoundedCorners", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;Z)V", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", "onCatalogueTabsItemClicked", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;)V", "softScrollToSelectedWidget", "data", "scrollToStartIfNecessary", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onCatalogueTabsItemViewed", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;Ll20/d;)V", "", "newPosition", "offset", "Lkotlin/Function0;", "animationStopCallback", "smoothScrollToPositionWithOffset", "(IILkotlin/jvm/functions/Function0;)V", "immediateScrollToPositionWithOffset", "(II)V", "Landroidx/recyclerview/widget/RecyclerView;", "Ll10/i;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsDrawableCache;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemsAdapter;", "catalogueTabsAdapter", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemsAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "catalogueTabsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "initializeFlag", "Z", "getInitializeFlag", "()Z", "setInitializeFlag", "(Z)V", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "widgetViewModel", "getAppBarHeight", "()I", "appBarHeight", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsViewHolder extends k<CatalogueTabsVO> implements CatalogTabsScrollEventListener {
    private final CatalogTabsController catalogTabsController;

    @NotNull
    private final CatalogueTabsItemsAdapter catalogueTabsAdapter;

    @NotNull
    private final LinearLayoutManager catalogueTabsLayoutManager;

    @NotNull
    private final i container;
    private final CatalogueTabsDrawableCache drawableCache;
    private boolean initializeFlag;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueTabsViewHolder(@NotNull RecyclerView view, @NotNull i container, CatalogTabsController catalogTabsController, CatalogueTabsDrawableCache catalogueTabsDrawableCache, boolean z11, boolean z12) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        this.view = view;
        this.container = container;
        this.catalogTabsController = catalogTabsController;
        this.drawableCache = catalogueTabsDrawableCache;
        CatalogueTabsItemsAdapter catalogueTabsItemsAdapter = new CatalogueTabsItemsAdapter(this, new CatalogueTabsViewHolder$catalogueTabsAdapter$1(this), new CatalogueTabsViewHolder$catalogueTabsAdapter$2(this), z11, z12);
        this.catalogueTabsAdapter = catalogueTabsItemsAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.catalogueTabsLayoutManager = linearLayoutManager;
        view.setAdapter(catalogueTabsItemsAdapter);
        view.setLayoutManager(linearLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAppBarHeight() {
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(this.container.Y());
        if (composerAppbar != null) {
            return composerAppbar.getHeight();
        }
        return 0;
    }

    private final boolean getInitializeFlag() {
        boolean z11 = this.initializeFlag;
        this.initializeFlag = true;
        return z11;
    }

    private final CatalogueTabsViewModel getWidgetViewModel() {
        return (CatalogueTabsViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCatalogueTabsItemClicked(CatalogueTabsVO.CatalogueTabsSingleTab item) {
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
        CatalogTabsController catalogTabsController = this.catalogTabsController;
        if (catalogTabsController != null) {
            catalogTabsController.onUserClickedTab();
        }
        softScrollToSelectedWidget(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCatalogueTabsItemViewed(CatalogueTabsVO.CatalogueTabsSingleTab item) {
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object scrollToStartIfNecessary(CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab, CatalogueTabsVO catalogueTabsVO, d<? super Unit> dVar) {
        M0<CatalogTabsScrollState> scrollState;
        CatalogTabsScrollState value;
        if (catalogueTabsVO.getSelectedTabIndex() == 0) {
            int i11 = -1;
            if (getAdapterPosition() != -1 && !catalogueTabsVO.getTabs().isEmpty()) {
                int i12 = 0;
                this.container.M().o(catalogueTabsVO.getTabs().get(0).getWidgetScrollKey(), 0, true, false);
                CatalogueTabsViewModel widgetViewModel = getWidgetViewModel();
                if (widgetViewModel != null) {
                    Iterator<CatalogueTabsVO.CatalogueTabsSingleTab> it = catalogueTabsVO.getTabs().iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().getWidgetScrollKey() == catalogueTabsSingleTab.getWidgetScrollKey()) {
                            i11 = i13;
                            break;
                        }
                        i13++;
                    }
                    CatalogueTabsViewModel widgetViewModel2 = getWidgetViewModel();
                    if (widgetViewModel2 != null && (scrollState = widgetViewModel2.getScrollState()) != null && (value = scrollState.getValue()) != null) {
                        i12 = value.getOffsetX();
                    }
                    widgetViewModel.forceScrollToPosition(i11, i12);
                }
                Object b11 = Y.b(100L, dVar);
                return b11 == a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }

    private final void setupRecyclerViewItemDecoration(CatalogueTabsVO item) {
        if (this.view.getItemDecorationCount() == 0) {
            this.view.addItemDecoration(new CatalogueTabsItemsDecorator(getContext(), item.getTabsGapPadding(), item.getTabsPaddings()));
        }
    }

    private final void setupTopRoundedCorners(CatalogueTabsVO item, boolean isStickyViewHolder) {
        GradientDrawable catalogueTabsDrawableByRadius;
        float stickyStateTopCornersRadius = isStickyViewHolder ? item.getStickyStateTopCornersRadius() : item.getNonStickyStateTopCornersRadius();
        CatalogueTabsDrawableCache catalogueTabsDrawableCache = this.drawableCache;
        if (catalogueTabsDrawableCache == null || (catalogueTabsDrawableByRadius = catalogueTabsDrawableCache.getCatalogueTabsDrawableByRadius(stickyStateTopCornersRadius)) == null) {
            return;
        }
        this.view.setBackground(catalogueTabsDrawableByRadius);
    }

    private final void softScrollToSelectedWidget(CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab) {
        C10727i.c(K.a(this), null, null, new CatalogueTabsViewHolder$softScrollToSelectedWidget$1(this, catalogueTabsSingleTab, null), 3);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener
    public void immediateScrollToPositionWithOffset(int newPosition, int offset) {
        if (this.view.isAnimating()) {
            this.view.stopScroll();
        }
        this.catalogueTabsLayoutManager.scrollToPositionWithOffset(newPosition, offset);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        CatalogueTabsViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        CatalogueTabsViewModel widgetViewModel2 = getWidgetViewModel();
        if (widgetViewModel2 != null) {
            widgetViewModel2.registerTabsScrollListener(getAdapterPosition() == -1, new WeakReference<>(this));
        }
        if (getBoundedData() == null || getAdapterPosition() != -1 || getInitializeFlag() || (widgetViewModel = getWidgetViewModel()) == null) {
            return;
        }
        widgetViewModel.restoreScrollState();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener
    public void smoothScrollToPositionWithOffset(int newPosition, int offset, @NotNull Function0<Unit> animationStopCallback) {
        Intrinsics.checkNotNullParameter(animationStopCallback, "animationStopCallback");
        ScrollUtilsKt.smoothScrollToTabWithPosition(this.view, newPosition, offset, animationStopCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogueTabsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.setTag("catalogueTabs");
        boolean z11 = getAdapterPosition() == -1;
        this.catalogueTabsAdapter.submitList(item.getTabs());
        CatalogTabsController catalogTabsController = this.catalogTabsController;
        if (catalogTabsController != null) {
            catalogTabsController.initTabs(item.getTabs());
        }
        int dimension = ((int) getResources().getDimension(item.getTabsPaddings().getLeftPadding().getCellLayoutPadding())) - (((int) getResources().getDimension(item.getTabsGapPadding().getCellLayoutPadding())) / 2);
        CatalogueTabsViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.updateScrollingState(item.getSelectedTabIndex(), this.view.computeHorizontalScrollOffset(), item.getSelectedTabChanged(), z11, dimension);
        }
        setupTopRoundedCorners(item, z11);
        setupRecyclerViewItemDecoration(item);
    }
}
