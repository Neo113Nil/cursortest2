package ru.ozon.app.android.whitelist.domain.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.app.Application;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.whitelist.common.utils.StringArraysUtils;
import ru.ozon.app.android.whitelist.data.CdnChooserSdkWhitelistDomainProvider;
import ru.ozon.app.android.whitelist.data.NativePageDomainsProviderImpl;
import ru.ozon.app.android.whitelist.data.NetworkRequestDomainsProviderImpl;
import ru.ozon.app.android.whitelist.domain.DomainsInteractorImpl;
import ru.ozon.app.android.whitelist.domain.OzonDomainsRepository;
import ru.ozon.app.android.whitelist.domain.di.WhitelistComponent;

/* loaded from: classes7.dex */
public final class DaggerWhitelistComponent {

    private static final class Factory implements WhitelistComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.whitelist.domain.di.WhitelistComponent.Factory
        public WhitelistComponent create(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, ContextComponentDependencies contextComponentDependencies, AppType appType) {
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            cdnHostManagerComponentApi.getClass();
            contextComponentDependencies.getClass();
            appType.getClass();
            return new WhitelistComponentImpl(networkComponentApi, storageComponentApi, cdnHostManagerComponentApi, contextComponentDependencies, appType, 0);
        }

        private Factory() {
        }
    }

    private static final class WhitelistComponentImpl implements WhitelistComponent {
        private final AppType appType;
        private a<CdnChooserSdkWhitelistDomainProvider> cdnChooserSdkWhitelistDomainProvider;
        private final CdnHostManagerComponentApi cdnHostManagerComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<DomainsInteractorImpl> domainsInteractorImplProvider;
        private a<NativePageDomainsProviderImpl> nativePageDomainsProviderImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<NetworkRequestDomainsProviderImpl> networkRequestDomainsProviderImplProvider;
        private a<OzonDomainsRepository> ozonDomainsRepositoryProvider;
        private a<StringArraysUtils> providesStringArraysUtilsProvider;
        private final WhitelistComponentImpl whitelistComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94595id;
            private final WhitelistComponentImpl whitelistComponentImpl;

            SwitchingProvider(WhitelistComponentImpl whitelistComponentImpl, int i11) {
                this.whitelistComponentImpl = whitelistComponentImpl;
                this.f94595id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f94595id;
                if (i11 == 0) {
                    return (T) new DomainsInteractorImpl((OzonDomainsRepository) this.whitelistComponentImpl.ozonDomainsRepositoryProvider.get(), this.whitelistComponentImpl.appType);
                }
                if (i11 == 1) {
                    FeatureService featureService = this.whitelistComponentImpl.networkComponentApi.getFeatureService();
                    j.c(featureService);
                    return (T) new OzonDomainsRepository(featureService, d.a(this.whitelistComponentImpl.nativePageDomainsProviderImplProvider), d.a(this.whitelistComponentImpl.networkRequestDomainsProviderImplProvider), d.a(this.whitelistComponentImpl.cdnChooserSdkWhitelistDomainProvider));
                }
                if (i11 == 2) {
                    return (T) new NativePageDomainsProviderImpl((StringArraysUtils) this.whitelistComponentImpl.providesStringArraysUtilsProvider.get());
                }
                if (i11 == 3) {
                    Application application = this.whitelistComponentImpl.contextComponentDependencies.getApplication();
                    j.c(application);
                    return (T) WhitelistModule_Companion_ProvidesStringArraysUtilsFactory.providesStringArraysUtils(application);
                }
                if (i11 == 4) {
                    return (T) new NetworkRequestDomainsProviderImpl((StringArraysUtils) this.whitelistComponentImpl.providesStringArraysUtilsProvider.get());
                }
                if (i11 != 5) {
                    throw new AssertionError(this.f94595id);
                }
                YY.a cdnChooserHostApi = this.whitelistComponentImpl.cdnHostManagerComponentApi.getCdnChooserHostApi();
                j.c(cdnChooserHostApi);
                return (T) new CdnChooserSdkWhitelistDomainProvider(cdnChooserHostApi);
            }
        }

        /* synthetic */ WhitelistComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, ContextComponentDependencies contextComponentDependencies, AppType appType, int i11) {
            this(networkComponentApi, storageComponentApi, cdnHostManagerComponentApi, contextComponentDependencies, appType);
        }

        private void initialize(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, ContextComponentDependencies contextComponentDependencies, AppType appType) {
            this.providesStringArraysUtilsProvider = d.b(new SwitchingProvider(this.whitelistComponentImpl, 3));
            this.nativePageDomainsProviderImplProvider = d.b(new SwitchingProvider(this.whitelistComponentImpl, 2));
            this.networkRequestDomainsProviderImplProvider = d.b(new SwitchingProvider(this.whitelistComponentImpl, 4));
            this.cdnChooserSdkWhitelistDomainProvider = d.b(new SwitchingProvider(this.whitelistComponentImpl, 5));
            this.ozonDomainsRepositoryProvider = d.b(new SwitchingProvider(this.whitelistComponentImpl, 1));
            this.domainsInteractorImplProvider = d.b(new SwitchingProvider(this.whitelistComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi
        public DomainsInteractor getDomainsInteractor() {
            return this.domainsInteractorImplProvider.get();
        }

        private WhitelistComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, ContextComponentDependencies contextComponentDependencies, AppType appType) {
            this.whitelistComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.cdnHostManagerComponentApi = cdnHostManagerComponentApi;
            this.appType = appType;
            initialize(networkComponentApi, storageComponentApi, cdnHostManagerComponentApi, contextComponentDependencies, appType);
        }
    }

    public static WhitelistComponent.Factory factory() {
        return new Factory(0);
    }
}
