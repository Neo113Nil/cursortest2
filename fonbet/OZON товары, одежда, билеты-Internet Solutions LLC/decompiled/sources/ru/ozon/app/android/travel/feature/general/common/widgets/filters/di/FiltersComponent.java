package ru.ozon.app.android.travel.feature.general.common.widgets.filters.di;

import I00.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import j10.InterfaceC7238a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersAsyncMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersFooterMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersHeaderMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersSectionsMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersAsyncActionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModelDelegate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModelDelegate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModelDelegate;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020C0B8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020C0G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0015\u0010O\u001a\u00060Kj\u0002`L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/di/FiltersComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersHeaderMapper;", "headerMapper$delegate", "LSc/j;", "getHeaderMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersHeaderMapper;", "headerMapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersSectionsMapper;", "sectionsMapper$delegate", "getSectionsMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersSectionsMapper;", "sectionsMapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersFooterMapper;", "footerMapper$delegate", "getFooterMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersFooterMapper;", "footerMapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersAsyncMapper;", "asyncMapper$delegate", "getAsyncMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersAsyncMapper;", "asyncMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersAsyncActionViewModel;", "asyncActionWidgetViewModel$delegate", "getAsyncActionWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersAsyncActionViewModel;", "asyncActionWidgetViewModel", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;", "getTabsViewModelDelegate", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;", "tabsViewModelDelegate", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;", "getTagWithTitleSectionViewModelDelegate", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;", "tagWithTitleSectionViewModelDelegate", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModel;", "getSliderWithLabelsSectionViewModelDelegate", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModel;", "sliderWithLabelsSectionViewModelDelegate", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerStore", "()Lj10/a;", "composerStore", "LI00/a;", "getComposerUpdateMapper", "()LI00/a;", "composerUpdateMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionViewModel;", "viewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FiltersComponent implements InterfaceC6958a {

    @NotNull
    private final AnalyticsComponentApi analyticsComponentApi;

    /* renamed from: asyncActionWidgetViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j asyncActionWidgetViewModel;

    /* renamed from: asyncMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j asyncMapper;

    @NotNull
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    /* renamed from: footerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j footerMapper;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersInhibitor;

    /* renamed from: headerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j headerMapper;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: sectionsMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sectionsMapper;

    public FiltersComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) storage.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
        this.headerMapper = k.b(FiltersComponent$headerMapper$2.INSTANCE);
        this.sectionsMapper = k.b(FiltersComponent$sectionsMapper$2.INSTANCE);
        this.footerMapper = k.b(new FiltersComponent$footerMapper$2(this));
        this.asyncMapper = k.b(new FiltersComponent$asyncMapper$2(this));
        this.handlersInhibitor = k.b(FiltersComponent$handlersInhibitor$2.INSTANCE);
        this.asyncActionWidgetViewModel = k.b(new FiltersComponent$asyncActionWidgetViewModel$2(this));
    }

    private final SliderWithLabelsSectionViewModel getSliderWithLabelsSectionViewModelDelegate() {
        return new SliderWithLabelsSectionViewModelDelegate();
    }

    private final TabsViewModel getTabsViewModelDelegate() {
        return new TabsViewModelDelegate();
    }

    private final TagWithTitleSectionViewModel getTagWithTitleSectionViewModelDelegate() {
        return new TagWithTitleSectionViewModelDelegate();
    }

    @NotNull
    public final FiltersAsyncActionViewModel getAsyncActionWidgetViewModel() {
        return (FiltersAsyncActionViewModel) this.asyncActionWidgetViewModel.getValue();
    }

    @NotNull
    public final FiltersAsyncMapper getAsyncMapper() {
        return (FiltersAsyncMapper) this.asyncMapper.getValue();
    }

    @NotNull
    public final InterfaceC7238a<l> getComposerStore() {
        return this.retainComposerComponentApi.getComposerStore();
    }

    @NotNull
    public final a<l> getComposerUpdateMapper() {
        return this.retainComposerComponentApi.getComposerUpdateMapper();
    }

    @NotNull
    public final FiltersFooterMapper getFooterMapper() {
        return (FiltersFooterMapper) this.footerMapper.getValue();
    }

    @NotNull
    public final HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @NotNull
    public final FiltersHeaderMapper getHeaderMapper() {
        return (FiltersHeaderMapper) this.headerMapper.getValue();
    }

    @NotNull
    public final FiltersSectionsMapper getSectionsMapper() {
        return (FiltersSectionsMapper) this.sectionsMapper.getValue();
    }

    @NotNull
    public final WZ.l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @NotNull
    public final FiltersSectionViewModel getViewModel() {
        return new FiltersSectionViewModel(getTabsViewModelDelegate(), getTagWithTitleSectionViewModelDelegate(), getSliderWithLabelsSectionViewModelDelegate());
    }
}
