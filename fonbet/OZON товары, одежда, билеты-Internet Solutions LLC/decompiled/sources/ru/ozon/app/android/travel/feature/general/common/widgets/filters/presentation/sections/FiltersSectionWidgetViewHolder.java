package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections;

import IO.a;
import Sc.o;
import W10.c;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersRefreshActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.FiltersSectionView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00060\u001fj\u0002` 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)J/\u0010/\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/FiltersSectionView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/FiltersSectionView;LWZ/l;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;", "item", "", "bindState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "", "params", "trackClickEvent", "(LWZ/t;Ljava/util/Map;)V", "newParams", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "getCustomParamsModifier", "(Ljava/util/Map;)LWZ/e;", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/FiltersSectionView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "filtersRefreshActionHandler", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersSectionWidgetViewHolder extends k<FiltersSectionVO> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final FiltersSectionView containerView;

    @NotNull
    private final FiltersRefreshActionHandler filtersRefreshActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FiltersSectionViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersSectionWidgetViewHolder(@NotNull FiltersSectionView containerView, @NotNull l tokenizedAnalytics, @NotNull FiltersSectionViewModel viewModel, @NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor handlersInhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.composerReferences = composerReferences;
        this.filtersRefreshActionHandler = new FiltersRefreshActionHandler(composerReferences, tokenizedAnalytics, handlersInhibitor, this);
    }

    private final void bindState(FiltersSectionVO.State item) {
        this.filtersRefreshActionHandler.bind(item.getId());
        this.containerView.bind(item, this.filtersRefreshActionHandler, new FiltersSectionWidgetViewHolder$bindState$1(this.viewModel), new FiltersSectionWidgetViewHolder$bindState$2(this));
        Object component = item.getComponent();
        if (component instanceof TagsWithTitleFilterVO) {
            this.viewModel.setTabsModel(((TagsWithTitleFilterVO) item.getComponent()).getFilterTabs());
            this.viewModel.setTagsModel((TagsWithTitleFilterVO) item.getComponent());
        } else if (component instanceof SliderWithLabelsSectionVO) {
            this.viewModel.setTabsModel(((SliderWithLabelsSectionVO) item.getComponent()).getTabs());
            this.viewModel.setSlidersModel((SliderWithLabelsSectionVO) item.getComponent());
        }
    }

    private final e getCustomParamsModifier(Map<String, String> newParams) {
        return new a(newParams, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getCustomParamsModifier$lambda$1(Map map, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = h.a(params.b());
        a11.putAll(map);
        return g.a(params, a11, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackClickEvent(t tokenizedEvent, Map<String, String> params) {
        TokenizedAnalyticsExtensionsKt.processClickEvents(this.tokenizedAnalytics, tokenizedEvent, getCustomParamsModifier(params));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.onTagsBindLiveData().observe(this, new FiltersSectionWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FiltersSectionWidgetViewHolder$onAttach$1(this.containerView)));
        this.viewModel.onTabsBindLiveData().observe(this, new FiltersSectionWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FiltersSectionWidgetViewHolder$onAttach$2(this.containerView)));
        this.viewModel.onSliderLiveData().observe(this, new FiltersSectionWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new FiltersSectionWidgetViewHolder$onAttach$3(this.containerView)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FiltersSectionVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item instanceof FiltersSectionVO.EmptyState) {
            this.composerReferences.getController().m(((FiltersSectionVO.EmptyState) item).getId());
        } else {
            if (!(item instanceof FiltersSectionVO.State)) {
                throw new o();
            }
            bindState((FiltersSectionVO.State) item);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FiltersSectionVO item, @NotNull c trackingData, f viewedPond) {
        t viewEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((FiltersSectionWidgetViewHolder) item, trackingData, viewedPond);
        if (!(item instanceof FiltersSectionVO.State) || (viewEvent = ((FiltersSectionVO.State) item).getViewEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
    }
}
