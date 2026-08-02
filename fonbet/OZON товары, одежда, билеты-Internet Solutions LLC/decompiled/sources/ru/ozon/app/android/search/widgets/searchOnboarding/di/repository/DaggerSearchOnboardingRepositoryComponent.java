package ru.ozon.app.android.search.widgets.searchOnboarding.di.repository;

import Jb.j;
import android.content.SharedPreferences;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepositoryImpl;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes7.dex */
public final class DaggerSearchOnboardingRepositoryComponent {

    private static final class Factory implements SearchOnboardingRepositoryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponent.Factory
        public SearchOnboardingRepositoryComponent create(StorageComponentApi storageComponentApi) {
            storageComponentApi.getClass();
            return new SearchOnboardingRepositoryComponentImpl(storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchOnboardingRepositoryComponentImpl implements SearchOnboardingRepositoryComponent {
        private final SearchOnboardingRepositoryComponentImpl searchOnboardingRepositoryComponentImpl;
        private final StorageComponentApi storageComponentApi;

        /* synthetic */ SearchOnboardingRepositoryComponentImpl(StorageComponentApi storageComponentApi, int i11) {
            this(storageComponentApi);
        }

        private SearchOnboardingRepositoryImpl searchOnboardingRepositoryImpl() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            return new SearchOnboardingRepositoryImpl(sharedPreferences);
        }

        @Override // ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi
        public SearchOnboardingRepository getSearchOnboardingRepository() {
            return searchOnboardingRepositoryImpl();
        }

        private SearchOnboardingRepositoryComponentImpl(StorageComponentApi storageComponentApi) {
            this.searchOnboardingRepositoryComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
        }
    }

    public static SearchOnboardingRepositoryComponent.Factory factory() {
        return new Factory(0);
    }
}
