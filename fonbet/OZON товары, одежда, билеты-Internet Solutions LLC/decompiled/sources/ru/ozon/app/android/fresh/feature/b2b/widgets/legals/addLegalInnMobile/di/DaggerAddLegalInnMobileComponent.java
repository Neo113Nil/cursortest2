package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di;

import Jb.j;
import Pc.a;
import WZ.l;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.CommonLegalsModule_Companion_ProvideLegalsApi$b2b_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.AddLegalInnMobileMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.AddLegalInnMobileRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di.AddLegalInnMobileComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerAddLegalInnMobileComponent {

    private static final class AddLegalInnMobileComponentImpl implements AddLegalInnMobileComponent {
        private final AddLegalInnMobileComponentImpl addLegalInnMobileComponentImpl;
        private a<AddLegalInnMobileViewModel> addLegalInnMobileViewModelProvider;
        private final NetworkComponentApi networkComponentApi;
        private final RetainComposerComponentApi retainComposerComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AddLegalInnMobileComponentImpl addLegalInnMobileComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92649id;

            SwitchingProvider(AddLegalInnMobileComponentImpl addLegalInnMobileComponentImpl, int i11) {
                this.addLegalInnMobileComponentImpl = addLegalInnMobileComponentImpl;
                this.f92649id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92649id == 0) {
                    return (T) new AddLegalInnMobileViewModel(this.addLegalInnMobileComponentImpl.addLegalInnMobileRepository());
                }
                throw new AssertionError(this.f92649id);
            }
        }

        /* synthetic */ AddLegalInnMobileComponentImpl(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(networkComponentApi, retainComposerComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AddLegalInnMobileRepository addLegalInnMobileRepository() {
            return new AddLegalInnMobileRepository(legalsApi());
        }

        private void initialize(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.addLegalInnMobileViewModelProvider = new SwitchingProvider(this.addLegalInnMobileComponentImpl, 0);
        }

        private LegalsApi legalsApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return CommonLegalsModule_Companion_ProvideLegalsApi$b2b_prodGoogleAllVendorsReleaseFactory.provideLegalsApi$b2b_prodGoogleAllVendorsRelease(retrofit);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di.AddLegalInnMobileComponent
        public AddLegalInnMobileMapper getAddLegalInnMobileMapper() {
            return new AddLegalInnMobileMapper();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di.AddLegalInnMobileComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di.AddLegalInnMobileComponent
        public a<AddLegalInnMobileViewModel> getWidgetViewModelProvider() {
            return this.addLegalInnMobileViewModelProvider;
        }

        private AddLegalInnMobileComponentImpl(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.addLegalInnMobileComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.retainComposerComponentApi = retainComposerComponentApi;
            initialize(networkComponentApi, retainComposerComponentApi);
        }
    }

    private static final class Factory implements AddLegalInnMobileComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di.AddLegalInnMobileComponent.Factory
        public AddLegalInnMobileComponent create(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            networkComponentApi.getClass();
            retainComposerComponentApi.getClass();
            return new AddLegalInnMobileComponentImpl(networkComponentApi, retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AddLegalInnMobileComponent.Factory factory() {
        return new Factory(0);
    }
}
