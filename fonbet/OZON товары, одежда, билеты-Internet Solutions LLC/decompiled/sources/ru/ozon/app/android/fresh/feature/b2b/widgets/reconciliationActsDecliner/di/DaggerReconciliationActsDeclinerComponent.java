package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelperImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.ReconciliationActsDeclinerApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di.ReconciliationActsDeclinerComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerReconciliationActsDeclinerComponent {

    private static final class Factory implements ReconciliationActsDeclinerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di.ReconciliationActsDeclinerComponent.Factory
        public ReconciliationActsDeclinerComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            return new ReconciliationActsDeclinerComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class ReconciliationActsDeclinerComponentImpl implements ReconciliationActsDeclinerComponent {
        private a<FileHelper> bindFileHelperProvider;
        private a<ReconciliationActsDeclinerRepository> bindReconciliationActsDeclinerRepositoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<FileHelperImpl> fileHelperImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<ReconciliationActsDeclinerApi> provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsReleaseProvider;
        private final ReconciliationActsDeclinerComponentImpl reconciliationActsDeclinerComponentImpl;
        private a<ReconciliationActsDeclinerRepositoryImpl> reconciliationActsDeclinerRepositoryImplProvider;
        private a<ReconciliationActsDeclinerViewModel> reconciliationActsDeclinerViewModelProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92658id;
            private final ReconciliationActsDeclinerComponentImpl reconciliationActsDeclinerComponentImpl;

            SwitchingProvider(ReconciliationActsDeclinerComponentImpl reconciliationActsDeclinerComponentImpl, int i11) {
                this.reconciliationActsDeclinerComponentImpl = reconciliationActsDeclinerComponentImpl;
                this.f92658id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92658id;
                if (i11 == 0) {
                    return (T) new ReconciliationActsDeclinerViewModel((FileHelper) this.reconciliationActsDeclinerComponentImpl.bindFileHelperProvider.get(), (ReconciliationActsDeclinerRepository) this.reconciliationActsDeclinerComponentImpl.bindReconciliationActsDeclinerRepositoryProvider.get());
                }
                if (i11 == 1) {
                    Context context = this.reconciliationActsDeclinerComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new FileHelperImpl(context);
                }
                if (i11 == 2) {
                    return (T) new ReconciliationActsDeclinerRepositoryImpl((ReconciliationActsDeclinerApi) this.reconciliationActsDeclinerComponentImpl.provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsReleaseProvider.get());
                }
                if (i11 != 3) {
                    throw new AssertionError(this.f92658id);
                }
                Retrofit retrofit = this.reconciliationActsDeclinerComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) ReconciliationActsDeclinerModule_Companion_ProvideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsReleaseFactory.provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsRelease(retrofit);
            }
        }

        /* synthetic */ ReconciliationActsDeclinerComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.reconciliationActsDeclinerComponentImpl, 1);
            this.fileHelperImplProvider = switchingProvider;
            this.bindFileHelperProvider = d.b(switchingProvider);
            this.provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.reconciliationActsDeclinerComponentImpl, 3));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.reconciliationActsDeclinerComponentImpl, 2);
            this.reconciliationActsDeclinerRepositoryImplProvider = switchingProvider2;
            this.bindReconciliationActsDeclinerRepositoryProvider = d.b(switchingProvider2);
            this.reconciliationActsDeclinerViewModelProvider = new SwitchingProvider(this.reconciliationActsDeclinerComponentImpl, 0);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di.ReconciliationActsDeclinerComponent
        public ReconciliationActsDeclinerMapper getReconciliationActsMapper() {
            return new ReconciliationActsDeclinerMapper();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di.ReconciliationActsDeclinerComponent
        public a<ReconciliationActsDeclinerViewModel> getViewModel() {
            return this.reconciliationActsDeclinerViewModelProvider;
        }

        private ReconciliationActsDeclinerComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.reconciliationActsDeclinerComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            initialize(contextComponentDependencies, networkComponentApi);
        }
    }

    public static ReconciliationActsDeclinerComponent.Factory factory() {
        return new Factory(0);
    }
}
