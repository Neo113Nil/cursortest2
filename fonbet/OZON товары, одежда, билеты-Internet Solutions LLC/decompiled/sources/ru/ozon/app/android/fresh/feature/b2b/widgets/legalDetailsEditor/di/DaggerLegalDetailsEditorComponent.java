package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelperImpl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerLegalDetailsEditorComponent {

    private static final class Factory implements LegalDetailsEditorComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent.Factory
        public LegalDetailsEditorComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            return new LegalDetailsEditorComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class LegalDetailsEditorComponentImpl implements LegalDetailsEditorComponent {
        private a<FileHelper> bindFileHelperProvider;
        private a<LegalDetailsEditorRepository> bindLegalDetailsEditorRepositoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<FileHelperImpl> fileHelperImplProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private final LegalDetailsEditorComponentImpl legalDetailsEditorComponentImpl;
        private a<LegalDetailsEditorMapper> legalDetailsEditorMapperProvider;
        private a<LegalDetailsEditorRepositoryImpl> legalDetailsEditorRepositoryImplProvider;
        private a<LegalDetailsEditorViewModel> legalDetailsEditorViewModelProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<LegalDetailsEditorApi> provideLegalDetailsEditorApi$b2b_prodGoogleAllVendorsReleaseProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92640id;
            private final LegalDetailsEditorComponentImpl legalDetailsEditorComponentImpl;

            SwitchingProvider(LegalDetailsEditorComponentImpl legalDetailsEditorComponentImpl, int i11) {
                this.legalDetailsEditorComponentImpl = legalDetailsEditorComponentImpl;
                this.f92640id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92640id;
                if (i11 == 0) {
                    return (T) new LegalDetailsEditorMapper();
                }
                if (i11 == 1) {
                    return (T) new LegalDetailsEditorViewModel((FileHelper) this.legalDetailsEditorComponentImpl.bindFileHelperProvider.get(), (LegalDetailsEditorRepository) this.legalDetailsEditorComponentImpl.bindLegalDetailsEditorRepositoryProvider.get());
                }
                if (i11 == 2) {
                    Context context = this.legalDetailsEditorComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new FileHelperImpl(context);
                }
                if (i11 == 3) {
                    return (T) new LegalDetailsEditorRepositoryImpl((LegalDetailsEditorApi) this.legalDetailsEditorComponentImpl.provideLegalDetailsEditorApi$b2b_prodGoogleAllVendorsReleaseProvider.get());
                }
                if (i11 != 4) {
                    if (i11 == 5) {
                        return (T) new HandlersInhibitor();
                    }
                    throw new AssertionError(this.f92640id);
                }
                Retrofit retrofit = this.legalDetailsEditorComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) LegalDetailsEditorModule_Companion_ProvideLegalDetailsEditorApi$b2b_prodGoogleAllVendorsReleaseFactory.provideLegalDetailsEditorApi$b2b_prodGoogleAllVendorsRelease(retrofit);
            }
        }

        /* synthetic */ LegalDetailsEditorComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.legalDetailsEditorMapperProvider = d.b(new SwitchingProvider(this.legalDetailsEditorComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.legalDetailsEditorComponentImpl, 2);
            this.fileHelperImplProvider = switchingProvider;
            this.bindFileHelperProvider = d.b(switchingProvider);
            this.provideLegalDetailsEditorApi$b2b_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.legalDetailsEditorComponentImpl, 4));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.legalDetailsEditorComponentImpl, 3);
            this.legalDetailsEditorRepositoryImplProvider = switchingProvider2;
            this.bindLegalDetailsEditorRepositoryProvider = d.b(switchingProvider2);
            this.legalDetailsEditorViewModelProvider = new SwitchingProvider(this.legalDetailsEditorComponentImpl, 1);
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.legalDetailsEditorComponentImpl, 5));
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent
        public LegalDetailsEditorMapper getMapper() {
            return this.legalDetailsEditorMapperProvider.get();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent
        public a<LegalDetailsEditorViewModel> getViewModel() {
            return this.legalDetailsEditorViewModelProvider;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent
        public HandlersInhibitor handlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        private LegalDetailsEditorComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.legalDetailsEditorComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            initialize(contextComponentDependencies, networkComponentApi);
        }
    }

    public static LegalDetailsEditorComponent.Factory factory() {
        return new Factory(0);
    }
}
