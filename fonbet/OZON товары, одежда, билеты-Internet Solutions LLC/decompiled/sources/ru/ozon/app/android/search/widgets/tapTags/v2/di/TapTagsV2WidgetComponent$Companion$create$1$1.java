package ru.ozon.app.android.search.widgets.tapTags.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2Mapper;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;

@Metadata(d1 = {"\u0000q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010,\u001a\u00060(j\u0002`)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"ru/ozon/app/android/search/widgets/tapTags/v2/di/TapTagsV2WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/tapTags/v2/di/TapTagsV2WidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "searchHistoryRepositoryComponentApi", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "actionHandlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2Mapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "getSearchHistoryRepository", "()Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "searchHistoryRepository", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "getTapTagsV2ViewModel", "()Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "tapTagsV2ViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "getActiveSearchBarViewModel", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV2WidgetComponent$Companion$create$1$1 implements TapTagsV2WidgetComponent {
    private final ActionComponentApi actionComponentApi;
    private final CustomActionHandlersComponentApi actionHandlersApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComponentApi;
    private final SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TapTagsV2WidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker = k.b(new TapTagsV2WidgetComponent$Companion$create$1$1$featureChecker$2(this));

    TapTagsV2WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.actionHandlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    private final SearchHistoryRepository getSearchHistoryRepository() {
        return this.searchHistoryRepositoryComponentApi.getSearchHistoryRepository();
    }

    @Override // ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent
    public ActiveSearchBarViewModel getActiveSearchBarViewModel() {
        return new ActiveSearchBarViewModel(this.networkComponentApi.getFeatureChecker(), getSearchHistoryRepository());
    }

    @Override // ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent
    public TapTagsV2Mapper getMapper() {
        return (TapTagsV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent
    public TapTagsV2ViewModel getTapTagsV2ViewModel() {
        return new TapTagsV2ViewModel(this.actionComponentApi.getActionRepository());
    }

    @Override // ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
