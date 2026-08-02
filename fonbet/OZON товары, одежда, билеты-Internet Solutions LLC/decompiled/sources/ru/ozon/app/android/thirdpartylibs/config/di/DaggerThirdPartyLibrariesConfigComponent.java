package ru.ozon.app.android.thirdpartylibs.config.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigApi;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigService;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigServiceImpl;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponent;
import ru.ozon.app.android.thirdpartylibs.config.di.module.ThirdPartyLibrariesConfigModule_Companion_ProvideThirdPartyLibrariesConfigApiFactory;

/* loaded from: classes7.dex */
public final class DaggerThirdPartyLibrariesConfigComponent {

    private static final class Factory implements ThirdPartyLibrariesConfigComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponent.Factory
        public ThirdPartyLibrariesConfigComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            return new ThirdPartyLibrariesConfigComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class ThirdPartyLibrariesConfigComponentImpl implements ThirdPartyLibrariesConfigComponent {
        private a<ThirdPartyLibrariesConfigService> bindThirdPartyLibrariesConfigServiceProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NetworkComponentApi networkComponentApi;
        private a<ThirdPartyLibrariesConfigApi> provideThirdPartyLibrariesConfigApiProvider;
        private final ThirdPartyLibrariesConfigComponentImpl thirdPartyLibrariesConfigComponentImpl;
        private a<ThirdPartyLibrariesConfigServiceImpl> thirdPartyLibrariesConfigServiceImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93610id;
            private final ThirdPartyLibrariesConfigComponentImpl thirdPartyLibrariesConfigComponentImpl;

            SwitchingProvider(ThirdPartyLibrariesConfigComponentImpl thirdPartyLibrariesConfigComponentImpl, int i11) {
                this.thirdPartyLibrariesConfigComponentImpl = thirdPartyLibrariesConfigComponentImpl;
                this.f93610id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93610id;
                if (i11 == 0) {
                    Context context = this.thirdPartyLibrariesConfigComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new ThirdPartyLibrariesConfigServiceImpl(context, (ThirdPartyLibrariesConfigApi) this.thirdPartyLibrariesConfigComponentImpl.provideThirdPartyLibrariesConfigApiProvider.get());
                }
                if (i11 != 1) {
                    throw new AssertionError(this.f93610id);
                }
                Retrofit retrofit = this.thirdPartyLibrariesConfigComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) ThirdPartyLibrariesConfigModule_Companion_ProvideThirdPartyLibrariesConfigApiFactory.provideThirdPartyLibrariesConfigApi(retrofit);
            }
        }

        /* synthetic */ ThirdPartyLibrariesConfigComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.provideThirdPartyLibrariesConfigApiProvider = d.b(new SwitchingProvider(this.thirdPartyLibrariesConfigComponentImpl, 1));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.thirdPartyLibrariesConfigComponentImpl, 0);
            this.thirdPartyLibrariesConfigServiceImplProvider = switchingProvider;
            this.bindThirdPartyLibrariesConfigServiceProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi
        public ThirdPartyLibrariesConfigService getThirdPartyLibrariesConfigService() {
            return this.bindThirdPartyLibrariesConfigServiceProvider.get();
        }

        private ThirdPartyLibrariesConfigComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.thirdPartyLibrariesConfigComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            initialize(contextComponentDependencies, networkComponentApi);
        }
    }

    public static ThirdPartyLibrariesConfigComponent.Factory factory() {
        return new Factory(0);
    }
}
