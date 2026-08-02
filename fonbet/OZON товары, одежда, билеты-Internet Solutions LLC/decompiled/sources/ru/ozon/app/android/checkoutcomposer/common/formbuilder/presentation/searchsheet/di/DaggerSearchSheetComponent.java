package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di;

import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment_MembersInjector;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModelImpl;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.adapter.SuggestionsAdapter;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data.SearchSheetApi;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data.SearchSheetRepository;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di.SearchSheetComponent;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerSearchSheetComponent {

    private static final class Factory implements SearchSheetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di.SearchSheetComponent.Factory
        public SearchSheetComponent create(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new SearchSheetComponentImpl(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchSheetComponentImpl implements SearchSheetComponent {
        private final NetworkComponentApi networkComponentApi;
        private final SearchSheetComponentImpl searchSheetComponentImpl;
        private a<SearchSheetViewModelImpl> searchSheetViewModelImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92291id;
            private final SearchSheetComponentImpl searchSheetComponentImpl;

            SwitchingProvider(SearchSheetComponentImpl searchSheetComponentImpl, int i11) {
                this.searchSheetComponentImpl = searchSheetComponentImpl;
                this.f92291id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92291id == 0) {
                    return (T) new SearchSheetViewModelImpl(this.searchSheetComponentImpl.searchSheetRepository());
                }
                throw new AssertionError(this.f92291id);
            }
        }

        /* synthetic */ SearchSheetComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.searchSheetViewModelImplProvider = new SwitchingProvider(this.searchSheetComponentImpl, 0);
        }

        private SearchSheetFragment injectSearchSheetFragment(SearchSheetFragment searchSheetFragment) {
            SearchSheetFragment_MembersInjector.injectPViewModel(searchSheetFragment, this.searchSheetViewModelImplProvider);
            SearchSheetFragment_MembersInjector.injectSuggestionsAdapter(searchSheetFragment, new SuggestionsAdapter());
            return searchSheetFragment;
        }

        private SearchSheetApi searchSheetApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return SearchSheetFragmentModule_ProvideSearchSheetApiFactory.provideSearchSheetApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SearchSheetRepository searchSheetRepository() {
            return new SearchSheetRepository(searchSheetApi());
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di.SearchSheetComponent
        public void inject(SearchSheetFragment searchSheetFragment) {
            injectSearchSheetFragment(searchSheetFragment);
        }

        private SearchSheetComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.searchSheetComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            initialize(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }
    }

    public static SearchSheetComponent.Factory factory() {
        return new Factory(0);
    }
}
