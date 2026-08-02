package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max;

import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001*\b\u0000\u0018\u0000 92\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00019B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0010*\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\u0011\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CatalogTabsV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "catalogTabsViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;LWZ/l;)V", "item", "", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "tab", "onTabViewed", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;)V", "onTabClicked", "softScrollToSelectedWidget", "onAttach", "()V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;Ll20/d;)V", "onViewInOverlapBounds", "onViewOutOfOverlapBounds", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "LWZ/l;", "ru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CatalogTabsV2ViewHolder$cloudTabsCallbacks$1", "cloudTabsCallbacks", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CatalogTabsV2ViewHolder$cloudTabsCallbacks$1;", "Landroid/view/View;", "getStickyView", "()Landroid/view/View;", "stickyView", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroidx/recyclerview/widget/RecyclerView;", "getRootRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "rootRecyclerView", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2ViewHolder extends k<CatalogTabsV2VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DEFAULT_BACKGROUND_COLOR = UniColors.LAYER_FLOOR_1.getResId();

    @NotNull
    private final CatalogueTabsViewModel catalogTabsViewModel;

    @NotNull
    private final CatalogTabsV2ViewHolder$cloudTabsCallbacks$1 cloudTabsCallbacks;

    @NotNull
    private final CloudTabsLayout containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CatalogTabsV2ViewHolder$Companion;", "", "<init>", "()V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CatalogTabsV2ViewHolder$cloudTabsCallbacks$1] */
    public CatalogTabsV2ViewHolder(@NotNull CloudTabsLayout containerView, @NotNull ComposerReferences references, @NotNull CatalogueTabsViewModel catalogTabsViewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(catalogTabsViewModel, "catalogTabsViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.catalogTabsViewModel = catalogTabsViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.cloudTabsCallbacks = new CloudTabsLayout.CloudTabsCallbacks() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CatalogTabsV2ViewHolder$cloudTabsCallbacks$1
            @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout.CloudTabsCallbacks
            public Function1<CatalogTabsV2VO.Tab, Unit> getOnClick() {
                return new CatalogTabsV2ViewHolder$cloudTabsCallbacks$1$onClick$1(CatalogTabsV2ViewHolder.this);
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout.CloudTabsCallbacks
            public Function1<CatalogTabsV2VO.Tab, Unit> getOnView() {
                return new CatalogTabsV2ViewHolder$cloudTabsCallbacks$1$onView$1(CatalogTabsV2ViewHolder.this);
            }
        };
    }

    private final AppBarLayout getAppBar() {
        View view = this.references.getContainer().j().getView();
        if (view != null) {
            return ComposerViewExtensionKt.composerAppbar(view);
        }
        return null;
    }

    private final RecyclerView getRootRecyclerView() {
        View view;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerView(view);
    }

    private final View getStickyView() {
        View view;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return (RecyclerView) view.findViewById(R$id.catalogTabsSticky);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabClicked(CatalogTabsV2VO.Tab tab) {
        t trackingInfo = tab.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
        if (tab.getIsMoreTab()) {
            this.references.getController().update(new ExpandTabsUpdate(true));
        } else {
            this.catalogTabsViewModel.onUserClickedTab();
            softScrollToSelectedWidget(tab);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabViewed(CatalogTabsV2VO.Tab tab) {
        t trackingInfo = tab.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }

    private final void softScrollToSelectedWidget(CatalogTabsV2VO.Tab tab) {
        AppBarLayout appBar = getAppBar();
        int height = appBar != null ? appBar.getHeight() : 0;
        View stickyView = getStickyView();
        int height2 = stickyView != null ? stickyView.getHeight() : 0;
        if (height2 <= 0) {
            height2 = this.containerView.getHeight();
        }
        this.catalogTabsViewModel.scrollToWidget(tab.getWidgetScrollKey(), height + height2, this.references);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.catalogTabsViewModel.setComposerRefs(this.references);
        RecyclerView rootRecyclerView = getRootRecyclerView();
        if (rootRecyclerView != null) {
            this.catalogTabsViewModel.attachRecyclerListener(rootRecyclerView);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        this.catalogTabsViewModel.updateStickyVisibility(false);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.catalogTabsViewModel.updateStickyVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogTabsV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(this.containerView, item);
        this.catalogTabsViewModel.initTabs(item.getTabs());
        CloudTabsLayout cloudTabsLayout = this.containerView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = cloudTabsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cloudTabsLayout.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), DEFAULT_BACKGROUND_COLOR));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CatalogTabsV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }

    private final void bind(CloudTabsLayout cloudTabsLayout, CatalogTabsV2VO catalogTabsV2VO) {
        cloudTabsLayout.setRowsCount(catalogTabsV2VO.getMaxRows());
        CatalogTabsV2VO.Tab moreTab = catalogTabsV2VO.getMoreTab();
        if (moreTab != null) {
            cloudTabsLayout.setMoreTab(moreTab);
        }
        cloudTabsLayout.setTabsMargin(ResourceExtKt.toPx(catalogTabsV2VO.getPaddings().getBetween()));
        cloudTabsLayout.setCloudTabsCallbacks(this.cloudTabsCallbacks);
        cloudTabsLayout.setTabs(catalogTabsV2VO.getTabs());
        cloudTabsLayout.setPadding(ResourceExtKt.toPx(catalogTabsV2VO.getPaddings().getHorizontal()), ResourceExtKt.toPx(catalogTabsV2VO.getPaddings().getTop()), ResourceExtKt.toPx(catalogTabsV2VO.getPaddings().getHorizontal()), ResourceExtKt.toPx(catalogTabsV2VO.getPaddings().getBottom()) - ResourceExtKt.toPx(catalogTabsV2VO.getPaddings().getBetween()));
        cloudTabsLayout.setMode(catalogTabsV2VO.getIsExpanded());
        cloudTabsLayout.invalidateAllTabs();
    }
}
