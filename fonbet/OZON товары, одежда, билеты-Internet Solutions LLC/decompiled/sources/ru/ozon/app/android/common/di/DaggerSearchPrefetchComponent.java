package ru.ozon.app.android.common.di;

import Jb.j;
import L00.d;
import Pc.a;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.SearchUrlPrefetchServiceImpl;
import ru.ozon.app.android.common.SearchUrlPrefetchServiceImpl_Factory;
import ru.ozon.app.android.common.di.SearchPrefetchComponent;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerSearchPrefetchComponent {

    private static final class Factory implements SearchPrefetchComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.common.di.SearchPrefetchComponent.Factory
        public SearchPrefetchComponent create(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi) {
            composerComponentApi.getClass();
            networkComponentApi.getClass();
            return new SearchPrefetchComponentImpl(composerComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchPrefetchComponentImpl implements SearchPrefetchComponent {
        private a<SearchUrlPrefetchService> bindSearchUrlPrefetchServiceProvider;
        private a<d> getComposerCallFactoryProvider;
        private a<ComposerPrefetchService> getComposerPrefetchServiceProvider;
        private a<ComposerRunningPrefetchedRequestUrlsHolder> getComposerRunningPrefetchedRequestUrlsHolderProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<UrlPrefetchedEventHolder> getUrlPrefetchedEventHolderProvider;
        private final SearchPrefetchComponentImpl searchPrefetchComponentImpl;
        private a<SearchUrlPrefetchServiceImpl> searchUrlPrefetchServiceImplProvider;

        private static final class GetComposerCallFactoryProvider implements a<d> {
            private final ComposerComponentApi composerComponentApi;

            GetComposerCallFactoryProvider(ComposerComponentApi composerComponentApi) {
                this.composerComponentApi = composerComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public d get() {
                d composerCallFactory = this.composerComponentApi.getComposerCallFactory();
                j.c(composerCallFactory);
                return composerCallFactory;
            }
        }

        private static final class GetComposerPrefetchServiceProvider implements a<ComposerPrefetchService> {
            private final ComposerComponentApi composerComponentApi;

            GetComposerPrefetchServiceProvider(ComposerComponentApi composerComponentApi) {
                this.composerComponentApi = composerComponentApi;
            }

            @Override // Pc.a
            public ComposerPrefetchService get() {
                ComposerPrefetchService composerPrefetchService = this.composerComponentApi.getComposerPrefetchService();
                j.c(composerPrefetchService);
                return composerPrefetchService;
            }
        }

        private static final class GetComposerRunningPrefetchedRequestUrlsHolderProvider implements a<ComposerRunningPrefetchedRequestUrlsHolder> {
            private final ComposerComponentApi composerComponentApi;

            GetComposerRunningPrefetchedRequestUrlsHolderProvider(ComposerComponentApi composerComponentApi) {
                this.composerComponentApi = composerComponentApi;
            }

            @Override // Pc.a
            public ComposerRunningPrefetchedRequestUrlsHolder get() {
                ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder = this.composerComponentApi.getComposerRunningPrefetchedRequestUrlsHolder();
                j.c(composerRunningPrefetchedRequestUrlsHolder);
                return composerRunningPrefetchedRequestUrlsHolder;
            }
        }

        private static final class GetFeatureCheckerProvider implements a<FeatureChecker> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureCheckerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureChecker get() {
                FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return featureChecker;
            }
        }

        private static final class GetUrlPrefetchedEventHolderProvider implements a<UrlPrefetchedEventHolder> {
            private final ComposerComponentApi composerComponentApi;

            GetUrlPrefetchedEventHolderProvider(ComposerComponentApi composerComponentApi) {
                this.composerComponentApi = composerComponentApi;
            }

            @Override // Pc.a
            public UrlPrefetchedEventHolder get() {
                UrlPrefetchedEventHolder urlPrefetchedEventHolder = this.composerComponentApi.getUrlPrefetchedEventHolder();
                j.c(urlPrefetchedEventHolder);
                return urlPrefetchedEventHolder;
            }
        }

        /* synthetic */ SearchPrefetchComponentImpl(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(composerComponentApi, networkComponentApi);
        }

        private void initialize(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi) {
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getComposerPrefetchServiceProvider = new GetComposerPrefetchServiceProvider(composerComponentApi);
            this.getComposerCallFactoryProvider = new GetComposerCallFactoryProvider(composerComponentApi);
            this.getComposerRunningPrefetchedRequestUrlsHolderProvider = new GetComposerRunningPrefetchedRequestUrlsHolderProvider(composerComponentApi);
            GetUrlPrefetchedEventHolderProvider getUrlPrefetchedEventHolderProvider = new GetUrlPrefetchedEventHolderProvider(composerComponentApi);
            this.getUrlPrefetchedEventHolderProvider = getUrlPrefetchedEventHolderProvider;
            SearchUrlPrefetchServiceImpl_Factory create = SearchUrlPrefetchServiceImpl_Factory.create(this.getFeatureCheckerProvider, this.getComposerPrefetchServiceProvider, this.getComposerCallFactoryProvider, this.getComposerRunningPrefetchedRequestUrlsHolderProvider, getUrlPrefetchedEventHolderProvider);
            this.searchUrlPrefetchServiceImplProvider = create;
            this.bindSearchUrlPrefetchServiceProvider = Jb.d.b(create);
        }

        @Override // ru.ozon.app.android.common.di.SearchPrefetchApi
        public SearchUrlPrefetchService getSearchUrlPrefetchService() {
            return this.bindSearchUrlPrefetchServiceProvider.get();
        }

        private SearchPrefetchComponentImpl(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi) {
            this.searchPrefetchComponentImpl = this;
            initialize(composerComponentApi, networkComponentApi);
        }
    }

    public static SearchPrefetchComponent.Factory factory() {
        return new Factory(0);
    }
}
