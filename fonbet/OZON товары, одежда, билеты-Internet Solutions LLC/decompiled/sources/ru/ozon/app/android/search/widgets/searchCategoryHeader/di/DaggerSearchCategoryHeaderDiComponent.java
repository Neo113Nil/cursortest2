package ru.ozon.app.android.search.widgets.searchCategoryHeader.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderMapper;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderMapper_Factory;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.di.SearchCategoryHeaderDiComponent;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;

/* loaded from: classes13.dex */
public final class DaggerSearchCategoryHeaderDiComponent {

    private static final class Factory implements SearchCategoryHeaderDiComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.widgets.searchCategoryHeader.di.SearchCategoryHeaderDiComponent.Factory
        public SearchCategoryHeaderDiComponent create(OnboardingComponentApi onboardingComponentApi) {
            onboardingComponentApi.getClass();
            return new SearchCategoryHeaderDiComponentImpl(onboardingComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchCategoryHeaderDiComponentImpl implements SearchCategoryHeaderDiComponent {
        private final OnboardingComponentApi onboardingComponentApi;
        private final SearchCategoryHeaderDiComponentImpl searchCategoryHeaderDiComponentImpl;
        private a<SearchCategoryHeaderMapper> searchCategoryHeaderMapperProvider;

        /* synthetic */ SearchCategoryHeaderDiComponentImpl(OnboardingComponentApi onboardingComponentApi, int i11) {
            this(onboardingComponentApi);
        }

        private void initialize(OnboardingComponentApi onboardingComponentApi) {
            this.searchCategoryHeaderMapperProvider = d.b(SearchCategoryHeaderMapper_Factory.create());
        }

        @Override // ru.ozon.app.android.search.widgets.searchCategoryHeader.di.SearchCategoryHeaderDiComponent
        public SearchCategoryHeaderMapper getMapper() {
            return this.searchCategoryHeaderMapperProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.searchCategoryHeader.di.SearchCategoryHeaderDiComponent
        public CommonOnboardingRepository getOnboardingRepository() {
            CommonOnboardingRepository onboardingRepository = this.onboardingComponentApi.getOnboardingRepository();
            j.c(onboardingRepository);
            return onboardingRepository;
        }

        private SearchCategoryHeaderDiComponentImpl(OnboardingComponentApi onboardingComponentApi) {
            this.searchCategoryHeaderDiComponentImpl = this;
            this.onboardingComponentApi = onboardingComponentApi;
            initialize(onboardingComponentApi);
        }
    }

    public static SearchCategoryHeaderDiComponent.Factory factory() {
        return new Factory(0);
    }
}
