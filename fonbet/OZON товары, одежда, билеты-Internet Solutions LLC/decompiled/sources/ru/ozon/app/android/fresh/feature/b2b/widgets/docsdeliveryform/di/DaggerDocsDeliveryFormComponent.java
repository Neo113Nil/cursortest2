package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di;

import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerDocsDeliveryFormComponent {

    private static final class DocsDeliveryFormComponentImpl implements DocsDeliveryFormComponent {
        private final DocsDeliveryFormComponentImpl docsDeliveryFormComponentImpl;
        private a<DocsDeliveryFormViewModelImpl> docsDeliveryFormViewModelImplProvider;
        private final LocationComponentApi locationComponentApi;
        private final NetworkComponentApi networkComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final DocsDeliveryFormComponentImpl docsDeliveryFormComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92630id;

            SwitchingProvider(DocsDeliveryFormComponentImpl docsDeliveryFormComponentImpl, int i11) {
                this.docsDeliveryFormComponentImpl = docsDeliveryFormComponentImpl;
                this.f92630id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92630id != 0) {
                    throw new AssertionError(this.f92630id);
                }
                DocsDeliveryRepository docsDeliveryRepository = this.docsDeliveryFormComponentImpl.docsDeliveryRepository();
                OzonGeoProxyClient ozonGeoProxyClient = this.docsDeliveryFormComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                j.c(ozonGeoProxyClient);
                AreaLocalStore areaLocalStore = this.docsDeliveryFormComponentImpl.locationComponentApi.getAreaLocalStore();
                j.c(areaLocalStore);
                return (T) new DocsDeliveryFormViewModelImpl(docsDeliveryRepository, ozonGeoProxyClient, areaLocalStore);
            }
        }

        /* synthetic */ DocsDeliveryFormComponentImpl(NetworkComponentApi networkComponentApi, LocationComponentApi locationComponentApi, int i11) {
            this(networkComponentApi, locationComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DocsDeliveryRepository docsDeliveryRepository() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return new DocsDeliveryRepository(retrofit);
        }

        private void initialize(NetworkComponentApi networkComponentApi, LocationComponentApi locationComponentApi) {
            this.docsDeliveryFormViewModelImplProvider = new SwitchingProvider(this.docsDeliveryFormComponentImpl, 0);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent
        public DocsDeliveryFormMapper getMapper() {
            return new DocsDeliveryFormMapper();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent
        public a<DocsDeliveryFormViewModelImpl> getViewModelProvider() {
            return this.docsDeliveryFormViewModelImplProvider;
        }

        private DocsDeliveryFormComponentImpl(NetworkComponentApi networkComponentApi, LocationComponentApi locationComponentApi) {
            this.docsDeliveryFormComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.locationComponentApi = locationComponentApi;
            initialize(networkComponentApi, locationComponentApi);
        }
    }

    private static final class Factory implements DocsDeliveryFormComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent.Factory
        public DocsDeliveryFormComponent create(NetworkComponentApi networkComponentApi, LocationComponentApi locationComponentApi) {
            networkComponentApi.getClass();
            locationComponentApi.getClass();
            return new DocsDeliveryFormComponentImpl(networkComponentApi, locationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DocsDeliveryFormComponent.Factory factory() {
        return new Factory(0);
    }
}
