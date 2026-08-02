package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di;

import Jb.d;
import Jb.j;
import Pc.a;
import WZ.l;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.api.StatusEdoApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di.StatusEdoComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation.StatusEdoViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerStatusEdoComponent {

    private static final class Factory implements StatusEdoComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di.StatusEdoComponent.Factory
        public StatusEdoComponent create(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            networkComponentApi.getClass();
            retainComposerComponentApi.getClass();
            return new StatusEdoComponentImpl(networkComponentApi, retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class StatusEdoComponentImpl implements StatusEdoComponent {
        private a<StatusEdoRepository> bindStatusEdoRepositoryProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<StatusEdoApi> provideStatusEdoApi$b2b_prodGoogleAllVendorsReleaseProvider;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private final StatusEdoComponentImpl statusEdoComponentImpl;
        private a<StatusEdoRepositoryImpl> statusEdoRepositoryImplProvider;
        private a<StatusEdoViewModel> statusEdoViewModelProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92667id;
            private final StatusEdoComponentImpl statusEdoComponentImpl;

            SwitchingProvider(StatusEdoComponentImpl statusEdoComponentImpl, int i11) {
                this.statusEdoComponentImpl = statusEdoComponentImpl;
                this.f92667id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92667id;
                if (i11 == 0) {
                    return (T) new StatusEdoViewModel((StatusEdoRepository) this.statusEdoComponentImpl.bindStatusEdoRepositoryProvider.get());
                }
                if (i11 == 1) {
                    return (T) new StatusEdoRepositoryImpl((StatusEdoApi) this.statusEdoComponentImpl.provideStatusEdoApi$b2b_prodGoogleAllVendorsReleaseProvider.get());
                }
                if (i11 != 2) {
                    throw new AssertionError(this.f92667id);
                }
                Retrofit retrofit = this.statusEdoComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) StatusEdoModule_Companion_ProvideStatusEdoApi$b2b_prodGoogleAllVendorsReleaseFactory.provideStatusEdoApi$b2b_prodGoogleAllVendorsRelease(retrofit);
            }
        }

        /* synthetic */ StatusEdoComponentImpl(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(networkComponentApi, retainComposerComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.provideStatusEdoApi$b2b_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.statusEdoComponentImpl, 2));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.statusEdoComponentImpl, 1);
            this.statusEdoRepositoryImplProvider = switchingProvider;
            this.bindStatusEdoRepositoryProvider = d.b(switchingProvider);
            this.statusEdoViewModelProvider = new SwitchingProvider(this.statusEdoComponentImpl, 0);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di.StatusEdoComponent
        public StatusEdoMapper getStatusEdoMapper() {
            return new StatusEdoMapper();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di.StatusEdoComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di.StatusEdoComponent
        public a<StatusEdoViewModel> getViewModelProvider() {
            return this.statusEdoViewModelProvider;
        }

        private StatusEdoComponentImpl(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.statusEdoComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.retainComposerComponentApi = retainComposerComponentApi;
            initialize(networkComponentApi, retainComposerComponentApi);
        }
    }

    public static StatusEdoComponent.Factory factory() {
        return new Factory(0);
    }
}
