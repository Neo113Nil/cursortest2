package ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation;

import GZ.j;
import GZ.k;
import HZ.a;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.atoms.v3.holders.select.SelectAtomHolderKt;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.data.SearchResultsSortV2DTO;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2VO;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsSortV2Binding;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J#\u0010*\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00022\n\u0010)\u001a\u00060'j\u0002`(H\u0014¢\u0006\u0004\b*\u0010+J3\u00102\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00022\n\u0010.\u001a\u00060,j\u0002`-2\u000e\u00101\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2WidgetViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsSortV2Binding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LHZ/a;", "deeplinkHandlersCache", "LGZ/k;", "routeFactory", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;", "customRefreshHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LHZ/a;LGZ/k;Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "", "bindViewButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "bindFilterButton", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;)V", "Lru/ozon/app/android/atoms/data/list/Select;", "", "bias", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;", "margins", "bindSortButton", "(Lru/ozon/app/android/atoms/data/list/Select;FLru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;)V", "", "deeplink", "LpZ/f;", "getFullWindowFiltersDestination", "(Ljava/lang/String;)LpZ/f;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LHZ/a;", "LGZ/k;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsSortV2WidgetViewHolder extends BindingViewHolder<SearchResultsSortV2VO, WidgetSearchResultsSortV2Binding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final a deeplinkHandlersCache;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final k routeFactory;
    public static final int $stable = 8;
    private static final int viewButtonPaddingHorizontal = ResourceExtKt.toPx(16);
    private static final int viewButtonPaddingVertical = ResourceExtKt.toPx(8);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2WidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetSearchResultsSortV2Binding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetSearchResultsSortV2Binding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetSearchResultsSortV2Binding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetSearchResultsSortV2Binding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetSearchResultsSortV2Binding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsSortV2WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull a deeplinkHandlersCache, @NotNull k routeFactory, @NotNull SetCookieAndRefreshHandler customRefreshHandler, @NotNull FeatureChecker featureChecker) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.refs = refs;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
        this.routeFactory = routeFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new SearchResultsSortV2WidgetViewHolder$actionHandler$1(customRefreshHandler)).onPreProcess(new SearchResultsSortV2WidgetViewHolder$actionHandler$2(featureChecker, this)).buildHandler();
        getBinding().filterBtn.setOnClickListener(new CC.a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(SearchResultsSortV2WidgetViewHolder searchResultsSortV2WidgetViewHolder, View view) {
        SearchResultsSortV2DTO.FilterButton filterButton;
        AtomActionDTO action;
        AtomAction atomAction;
        SearchResultsSortV2VO searchResultsSortV2VO = (SearchResultsSortV2VO) searchResultsSortV2WidgetViewHolder.getBoundedData();
        if (searchResultsSortV2VO == null || (filterButton = searchResultsSortV2VO.getFilterButton()) == null || (action = filterButton.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, filterButton.getTrackingInfo())) == null) {
            return;
        }
        searchResultsSortV2WidgetViewHolder.actionHandler.invoke(atomAction);
    }

    private final void bindFilterButton(SearchResultsSortV2DTO.FilterButton button) {
        FilterButtonView filterButtonView = getBinding().filterBtn;
        if (button == null) {
            Intrinsics.f(filterButtonView);
            ViewExtKt.gone(filterButtonView);
            return;
        }
        String image = button.getIcon().getImage();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = filterButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        filterButtonView.setIcon(image, styleParser.parseColor(context, button.getIcon().getTintColor(), UniColors.LAYER_FLOOR_0_INVERTED.getResId()));
        SearchResultsSortV2DTO.FilterButton.FilterBadge badge = button.getBadge();
        String text = badge != null ? badge.getText() : null;
        Context context2 = filterButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SearchResultsSortV2DTO.FilterButton.FilterBadge badge2 = button.getBadge();
        filterButtonView.setBadge(text, styleParser.parseColor(context2, badge2 != null ? badge2.getBackgroundColor() : null, UniColors.BG_POSITIVE_PRIMARY.getResId()));
        TestInfo testInfo = button.getTestInfo();
        filterButtonView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        ViewExtKt.show(filterButtonView);
    }

    private final void bindSortButton(Select button, float bias, SearchResultsSortV2VO.SortButtonMargins margins) {
        WidgetSearchResultsSortV2Binding binding = getBinding();
        SelectView sortBtn = binding.sortBtn;
        Intrinsics.checkNotNullExpressionValue(sortBtn, "sortBtn");
        SelectAtomHolderKt.bind(sortBtn, button, this.actionHandler);
        ConstraintLayout constraintLayout = binding.rootCl;
        d d11 = Tl.a.d(constraintLayout, "rootCl", constraintLayout);
        d11.c0(bias, R$id.sortBtn);
        d11.e0(R$id.sortBtn, 6, margins.getMarginStart());
        d11.e0(R$id.sortBtn, 7, margins.getMarginEnd());
        d11.f(constraintLayout);
    }

    private final void bindViewButton(ButtonV3Atom.SmallIconButton button) {
        WidgetSearchResultsSortV2Binding binding = getBinding();
        SmallIconButtonView viewBtn = binding.viewBtn;
        Intrinsics.checkNotNullExpressionValue(viewBtn, "viewBtn");
        WrappedIconButtonHolderKt.bindOrGone(viewBtn, button, this.actionHandler);
        SmallIconButtonView viewBtn2 = binding.viewBtn;
        Intrinsics.checkNotNullExpressionValue(viewBtn2, "viewBtn");
        int i11 = viewButtonPaddingHorizontal;
        int i12 = viewButtonPaddingVertical;
        ViewExtKt.updatePadding(viewBtn2, i11, i12, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f getFullWindowFiltersDestination(String deeplink) {
        IZ.a b11;
        j b12 = k.b(this.routeFactory, deeplink, null, 6);
        if (b12 != null && (b11 = this.deeplinkHandlersCache.b(b12)) != null) {
            Object destination = b11.getDestination(getContext(), b12);
            ComposerScreenContainer composerScreenContainer = destination instanceof ComposerScreenContainer ? (ComposerScreenContainer) destination : null;
            if (composerScreenContainer != null) {
                return new ComposerFragmentDestination(ComposerScreenConfig.copy$default(composerScreenContainer.getScreenConfig(), null, null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777151, null), "filters", null, false, false, null, false, false, null, 508, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchResultsSortV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindSortButton(item.getSortButton(), item.getSortBias(), item.getSortMargins());
        bindViewButton(item.getViewButton());
        bindFilterButton(item.getFilterButton());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchResultsSortV2VO item, @NotNull c trackingData, ru.ozon.composer.ui.widget.f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t filterButtonEvent = item.getFilterButtonEvent();
        if (filterButtonEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), filterButtonEvent, null, 2, null);
        }
    }
}
