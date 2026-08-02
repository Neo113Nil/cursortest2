package ru.ozon.app.android.travel.data.storage.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolderImpl;
import ru.ozon.app.android.travel.data.storage.di.TravelStorageComponent;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes7.dex */
public final class DaggerTravelStorageComponent {

    private static final class Factory implements TravelStorageComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.data.storage.di.TravelStorageComponent.Factory
        public TravelStorageComponent create(ContextComponentDependencies contextComponentDependencies, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            coroutineDispatchersComponentApi.getClass();
            networkComponentApi.getClass();
            return new TravelStorageComponentImpl(new OfflineStorageModule(), contextComponentDependencies, coroutineDispatchersComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TravelStorageComponentImpl implements TravelStorageComponent {
        private final ContextComponentDependencies contextComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final OfflineStorageModule offlineStorageModule;
        private a<OfflineTravelStorage> provideOfflineStorageProvider;
        private final TravelStorageComponentImpl travelStorageComponentImpl;
        private a<TravelStorageManagerHolderImpl> travelStorageManagerHolderImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93615id;
            private final TravelStorageComponentImpl travelStorageComponentImpl;

            SwitchingProvider(TravelStorageComponentImpl travelStorageComponentImpl, int i11) {
                this.travelStorageComponentImpl = travelStorageComponentImpl;
                this.f93615id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93615id;
                if (i11 == 0) {
                    return (T) new TravelStorageManagerHolderImpl();
                }
                if (i11 != 1) {
                    throw new AssertionError(this.f93615id);
                }
                OfflineStorageModule offlineStorageModule = this.travelStorageComponentImpl.offlineStorageModule;
                Context context = this.travelStorageComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                CoroutineDispatcherProvider dispatcherProvider = this.travelStorageComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                j.c(dispatcherProvider);
                JsonSerializer jsonSerializer = this.travelStorageComponentImpl.networkComponentApi.getJsonSerializer();
                j.c(jsonSerializer);
                JsonParser jsonDeserializer = this.travelStorageComponentImpl.networkComponentApi.getJsonDeserializer();
                j.c(jsonDeserializer);
                return (T) OfflineStorageModule_ProvideOfflineStorageFactory.provideOfflineStorage(offlineStorageModule, context, dispatcherProvider, jsonSerializer, jsonDeserializer);
            }
        }

        /* synthetic */ TravelStorageComponentImpl(OfflineStorageModule offlineStorageModule, ContextComponentDependencies contextComponentDependencies, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(offlineStorageModule, contextComponentDependencies, coroutineDispatchersComponentApi, networkComponentApi);
        }

        private void initialize(OfflineStorageModule offlineStorageModule, ContextComponentDependencies contextComponentDependencies, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, NetworkComponentApi networkComponentApi) {
            this.travelStorageManagerHolderImplProvider = d.b(new SwitchingProvider(this.travelStorageComponentImpl, 0));
            this.provideOfflineStorageProvider = d.b(new SwitchingProvider(this.travelStorageComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.travel.data.storage.di.api.TravelStorageApi
        public OfflineTravelStorage getOfflineStorage() {
            return this.provideOfflineStorageProvider.get();
        }

        @Override // ru.ozon.app.android.travel.data.storage.di.api.TravelStorageApi
        public TravelStorageManagerHolder getTravelStorageManagerHolder() {
            return this.travelStorageManagerHolderImplProvider.get();
        }

        private TravelStorageComponentImpl(OfflineStorageModule offlineStorageModule, ContextComponentDependencies contextComponentDependencies, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, NetworkComponentApi networkComponentApi) {
            this.travelStorageComponentImpl = this;
            this.offlineStorageModule = offlineStorageModule;
            this.contextComponentDependencies = contextComponentDependencies;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(offlineStorageModule, contextComponentDependencies, coroutineDispatchersComponentApi, networkComponentApi);
        }
    }

    public static TravelStorageComponent.Factory factory() {
        return new Factory(0);
    }
}
