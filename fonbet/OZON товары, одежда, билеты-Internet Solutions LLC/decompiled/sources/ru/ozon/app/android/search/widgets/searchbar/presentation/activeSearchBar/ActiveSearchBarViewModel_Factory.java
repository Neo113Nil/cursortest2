package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;

/* loaded from: classes7.dex */
public final class ActiveSearchBarViewModel_Factory implements e<ActiveSearchBarViewModel> {
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<SearchHistoryRepository> searchHistoryRepositoryProvider;

    public ActiveSearchBarViewModel_Factory(a<FeatureChecker> aVar, a<SearchHistoryRepository> aVar2) {
        this.featureCheckerProvider = aVar;
        this.searchHistoryRepositoryProvider = aVar2;
    }

    public static ActiveSearchBarViewModel_Factory create(a<FeatureChecker> aVar, a<SearchHistoryRepository> aVar2) {
        return new ActiveSearchBarViewModel_Factory(aVar, aVar2);
    }

    public static ActiveSearchBarViewModel newInstance(FeatureChecker featureChecker, SearchHistoryRepository searchHistoryRepository) {
        return new ActiveSearchBarViewModel(featureChecker, searchHistoryRepository);
    }

    @Override // Pc.a
    public ActiveSearchBarViewModel get() {
        return newInstance(this.featureCheckerProvider.get(), this.searchHistoryRepositoryProvider.get());
    }
}
