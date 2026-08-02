package ru.ozon.app.android.cml.delivery.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponent;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlDeletePhotoUseCase;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlDeletePhotoUseCaseImpl;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlPhotoRepository;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlPhotoRepositoryImpl;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCase;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCaseImpl;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.CmlUploadPhotoApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerCmlDeliveryComponent {

    private static final class CmlDeliveryComponentImpl implements CmlDeliveryComponent {
        private final ActionComponentApi actionComponentApi;
        private a<CmlDeletePhotoUseCase> bindDeletePhotoUseCaseProvider;
        private a<CmlPhotoRepository> bindUploadPhotoRepositoryProvider;
        private a<CmlUploadPhotoUseCase> bindUploadPhotoUseCaseProvider;
        private a<CmlDeletePhotoUseCaseImpl> cmlDeletePhotoUseCaseImplProvider;
        private final CmlDeliveryComponentImpl cmlDeliveryComponentImpl;
        private a<CmlPhotoRepositoryImpl> cmlPhotoRepositoryImplProvider;
        private a<CmlUploadPhotoUseCaseImpl> cmlUploadPhotoUseCaseImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<CmlUploadPhotoApi> provideUploadPhotoApiProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CmlDeliveryComponentImpl cmlDeliveryComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92351id;

            SwitchingProvider(CmlDeliveryComponentImpl cmlDeliveryComponentImpl, int i11) {
                this.cmlDeliveryComponentImpl = cmlDeliveryComponentImpl;
                this.f92351id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92351id;
                if (i11 == 0) {
                    return (T) new CmlUploadPhotoUseCaseImpl((CmlPhotoRepository) this.cmlDeliveryComponentImpl.bindUploadPhotoRepositoryProvider.get());
                }
                if (i11 == 1) {
                    CmlUploadPhotoApi cmlUploadPhotoApi = (CmlUploadPhotoApi) this.cmlDeliveryComponentImpl.provideUploadPhotoApiProvider.get();
                    ActionV2Repository actionRepository = this.cmlDeliveryComponentImpl.actionComponentApi.getActionRepository();
                    j.c(actionRepository);
                    return (T) new CmlPhotoRepositoryImpl(cmlUploadPhotoApi, actionRepository);
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        return (T) new CmlDeletePhotoUseCaseImpl((CmlPhotoRepository) this.cmlDeliveryComponentImpl.bindUploadPhotoRepositoryProvider.get());
                    }
                    throw new AssertionError(this.f92351id);
                }
                Retrofit retrofit = this.cmlDeliveryComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) CmlDeliveryModule_Companion_ProvideUploadPhotoApiFactory.provideUploadPhotoApi(retrofit);
            }
        }

        /* synthetic */ CmlDeliveryComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, int i11) {
            this(networkComponentApi, actionComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            this.provideUploadPhotoApiProvider = d.b(new SwitchingProvider(this.cmlDeliveryComponentImpl, 2));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.cmlDeliveryComponentImpl, 1);
            this.cmlPhotoRepositoryImplProvider = switchingProvider;
            this.bindUploadPhotoRepositoryProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.cmlDeliveryComponentImpl, 0);
            this.cmlUploadPhotoUseCaseImplProvider = switchingProvider2;
            this.bindUploadPhotoUseCaseProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.cmlDeliveryComponentImpl, 3);
            this.cmlDeletePhotoUseCaseImplProvider = switchingProvider3;
            this.bindDeletePhotoUseCaseProvider = d.b(switchingProvider3);
        }

        @Override // ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponentApi
        public CmlDeletePhotoUseCase getDeletePhotoUseCase() {
            return this.bindDeletePhotoUseCaseProvider.get();
        }

        @Override // ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponentApi
        public CmlUploadPhotoUseCase getUploadPhotoUseCase() {
            return this.bindUploadPhotoUseCaseProvider.get();
        }

        private CmlDeliveryComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            this.cmlDeliveryComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.actionComponentApi = actionComponentApi;
            initialize(networkComponentApi, actionComponentApi);
        }
    }

    private static final class Factory implements CmlDeliveryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponent.Factory
        public CmlDeliveryComponent create(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            networkComponentApi.getClass();
            actionComponentApi.getClass();
            return new CmlDeliveryComponentImpl(networkComponentApi, actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CmlDeliveryComponent.Factory factory() {
        return new Factory(0);
    }
}
