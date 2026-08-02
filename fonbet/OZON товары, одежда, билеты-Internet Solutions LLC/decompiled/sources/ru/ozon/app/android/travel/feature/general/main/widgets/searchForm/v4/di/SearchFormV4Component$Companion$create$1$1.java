package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010#\u001a\u00060\u001fj\u0002` 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/di/SearchFormV4Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/di/SearchFormV4Component;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "handlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewModel;", "searchFormV4WidgetViewModel$delegate", "getSearchFormV4WidgetViewModel", "()LPc/a;", "searchFormV4WidgetViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "getSearchFormV4ViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "searchFormV4ViewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV4Component$Companion$create$1$1 implements SearchFormV4Component {
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi handlersApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final RetainComposerComponentApi retainApi;

    /* renamed from: searchFormV4WidgetViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j searchFormV4WidgetViewModel = k.b(new SearchFormV4Component$Companion$create$1$1$searchFormV4WidgetViewModel$2(this));

    SearchFormV4Component$Companion$create$1$1(C7475g c7475g) {
        this.handlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.mapper = k.b(new SearchFormV4Component$Companion$create$1$1$mapper$2(c7475g));
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component
    public d getActionHandlersStoreFactory() {
        return this.handlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component
    public SearchFormV4Mapper getMapper() {
        return (SearchFormV4Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component
    public SearchFormV4ViewModel getSearchFormV4ViewModel() {
        return new SearchFormV4ViewModel();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component
    public Pc.a<SearchFormV4WidgetViewModel> getSearchFormV4WidgetViewModel() {
        return (Pc.a) this.searchFormV4WidgetViewModel.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component
    public l getTokenizedAnalytics() {
        return this.retainApi.getTokenizedAnalytics();
    }
}
