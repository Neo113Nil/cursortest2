package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoRepositoryImplV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoRepositoryV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoStatusStorage;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api.AddEdoApiV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoButtonMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerAddEdoComponentV2 {

    private static final class AddEdoComponentV2Impl implements AddEdoComponentV2 {
        private a<AddEdoButtonMapperV2> addEdoButtonMapperV2Provider;
        private final AddEdoComponentV2Impl addEdoComponentV2Impl;
        private a<AddEdoFormMapperV2> addEdoFormMapperV2Provider;
        private a<AddEdoRepositoryImplV2> addEdoRepositoryImplV2Provider;
        private a<AddEdoViewModelV2Impl> addEdoViewModelV2ImplProvider;
        private a<AddEdoRepositoryV2> bindAddEdoRepositoryProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<AddEdoApiV2> provideAddEdoApiProvider;
        private final StatusEdoStateComponentApi statusEdoStateComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AddEdoComponentV2Impl addEdoComponentV2Impl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92617id;

            SwitchingProvider(AddEdoComponentV2Impl addEdoComponentV2Impl, int i11) {
                this.addEdoComponentV2Impl = addEdoComponentV2Impl;
                this.f92617id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92617id;
                if (i11 == 0) {
                    return (T) new AddEdoButtonMapperV2();
                }
                if (i11 == 1) {
                    return (T) new AddEdoFormMapperV2();
                }
                if (i11 == 2) {
                    return (T) new AddEdoViewModelV2Impl((AddEdoRepositoryV2) this.addEdoComponentV2Impl.bindAddEdoRepositoryProvider.get(), this.addEdoComponentV2Impl.addEdoStatusStorage());
                }
                if (i11 == 3) {
                    return (T) new AddEdoRepositoryImplV2((AddEdoApiV2) this.addEdoComponentV2Impl.provideAddEdoApiProvider.get());
                }
                if (i11 != 4) {
                    throw new AssertionError(this.f92617id);
                }
                Retrofit retrofit = this.addEdoComponentV2Impl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) AddEdoModuleV2_Companion_ProvideAddEdoApiFactory.provideAddEdoApi(retrofit);
            }
        }

        /* synthetic */ AddEdoComponentV2Impl(NetworkComponentApi networkComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, int i11) {
            this(networkComponentApi, statusEdoStateComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AddEdoStatusStorage addEdoStatusStorage() {
            StatusEdoState statusEdoState = this.statusEdoStateComponentApi.getStatusEdoState();
            j.c(statusEdoState);
            return new AddEdoStatusStorage(statusEdoState);
        }

        private void initialize(NetworkComponentApi networkComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi) {
            this.addEdoButtonMapperV2Provider = d.b(new SwitchingProvider(this.addEdoComponentV2Impl, 0));
            this.addEdoFormMapperV2Provider = d.b(new SwitchingProvider(this.addEdoComponentV2Impl, 1));
            this.provideAddEdoApiProvider = d.b(new SwitchingProvider(this.addEdoComponentV2Impl, 4));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.addEdoComponentV2Impl, 3);
            this.addEdoRepositoryImplV2Provider = switchingProvider;
            this.bindAddEdoRepositoryProvider = d.b(switchingProvider);
            this.addEdoViewModelV2ImplProvider = new SwitchingProvider(this.addEdoComponentV2Impl, 2);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2
        public AddEdoButtonMapperV2 getAddEDOButtonMapper() {
            return this.addEdoButtonMapperV2Provider.get();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2
        public AddEdoFormMapperV2 getAddEDOFormMapper() {
            return this.addEdoFormMapperV2Provider.get();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2
        public a<AddEdoViewModelV2Impl> getWidgetViewModelProvider() {
            return this.addEdoViewModelV2ImplProvider;
        }

        private AddEdoComponentV2Impl(NetworkComponentApi networkComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi) {
            this.addEdoComponentV2Impl = this;
            this.networkComponentApi = networkComponentApi;
            this.statusEdoStateComponentApi = statusEdoStateComponentApi;
            initialize(networkComponentApi, statusEdoStateComponentApi);
        }
    }

    private static final class Factory implements AddEdoComponentV2.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2.Factory
        public AddEdoComponentV2 create(NetworkComponentApi networkComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi) {
            networkComponentApi.getClass();
            statusEdoStateComponentApi.getClass();
            return new AddEdoComponentV2Impl(networkComponentApi, statusEdoStateComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AddEdoComponentV2.Factory factory() {
        return new Factory(0);
    }
}
