package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepository;

/* loaded from: classes7.dex */
public final class SearchByImageViewModel_Factory implements e<SearchByImageViewModel> {
    private final a<SearchImageResizer> imageResizerProvider;
    private final a<SearchByImageRepository> searchByImageRepositoryProvider;
    private final a<SearchOnboardingRepository> searchOnboardingRepositoryProvider;

    public SearchByImageViewModel_Factory(a<SearchByImageRepository> aVar, a<SearchOnboardingRepository> aVar2, a<SearchImageResizer> aVar3) {
        this.searchByImageRepositoryProvider = aVar;
        this.searchOnboardingRepositoryProvider = aVar2;
        this.imageResizerProvider = aVar3;
    }

    public static SearchByImageViewModel_Factory create(a<SearchByImageRepository> aVar, a<SearchOnboardingRepository> aVar2, a<SearchImageResizer> aVar3) {
        return new SearchByImageViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static SearchByImageViewModel newInstance(SearchByImageRepository searchByImageRepository, SearchOnboardingRepository searchOnboardingRepository, SearchImageResizer searchImageResizer) {
        return new SearchByImageViewModel(searchByImageRepository, searchOnboardingRepository, searchImageResizer);
    }

    @Override // Pc.a
    public SearchByImageViewModel get() {
        return newInstance(this.searchByImageRepositoryProvider.get(), this.searchOnboardingRepositoryProvider.get(), this.imageResizerProvider.get());
    }
}
