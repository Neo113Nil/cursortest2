package ru.ozon.app.android.geo.map.clusterization.di;

import BZ.e;
import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingServiceImpl;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationPinsDecoder;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationPinsDecoderImpl;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationPinsMapper;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationRepository;
import ru.ozon.app.android.geo.map.clusterization.MapPlacemarkFactory;
import ru.ozon.app.android.geo.map.clusterization.MapPlacemarkFactoryImpl;
import ru.ozon.app.android.geo.map.clusterization.PinImageLoader;
import ru.ozon.app.android.geo.map.clusterization.PinImageLoaderImpl;
import ru.ozon.app.android.geo.map.clusterization.di.ClusterizationComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

/* loaded from: classes12.dex */
public final class DaggerClusterizationComponent {

    private static final class ClusterizationComponentImpl implements ClusterizationComponent {
        private final ActionComponentApi actionComponentApi;
        private a<ClusterizationLoadingService> bindsClusterizationLoadingServiceProvider;
        private a<ClusterizationPinsDecoder> bindsClusterizationPinsDecoderProvider;
        private a<MapPlacemarkFactory> bindsMapPlacemarkFactoryProvider;
        private a<PinImageLoader> bindsPinImageLoaderProvider;
        private final ClusterizationComponentImpl clusterizationComponentImpl;
        private a<ClusterizationLoadingServiceImpl> clusterizationLoadingServiceImplProvider;
        private a<ClusterizationPinsDecoderImpl> clusterizationPinsDecoderImplProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<MapPlacemarkFactoryImpl> mapPlacemarkFactoryImplProvider;
        private final NavigationComponentApi navigationComponentApi;
        private a<PinImageLoaderImpl> pinImageLoaderImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ClusterizationComponentImpl clusterizationComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92805id;

            SwitchingProvider(ClusterizationComponentImpl clusterizationComponentImpl, int i11) {
                this.clusterizationComponentImpl = clusterizationComponentImpl;
                this.f92805id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92805id;
                if (i11 == 0) {
                    return (T) new ClusterizationLoadingServiceImpl(this.clusterizationComponentImpl.clusterizationRepository(), (ClusterizationPinsDecoder) this.clusterizationComponentImpl.bindsClusterizationPinsDecoderProvider.get(), (MapPlacemarkFactory) this.clusterizationComponentImpl.bindsMapPlacemarkFactoryProvider.get());
                }
                if (i11 == 1) {
                    return (T) new ClusterizationPinsDecoderImpl(new ClusterizationPinsMapper());
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new AssertionError(this.f92805id);
                    }
                    Context context = this.clusterizationComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new PinImageLoaderImpl(context);
                }
                PinImageLoader pinImageLoader = (PinImageLoader) this.clusterizationComponentImpl.bindsPinImageLoaderProvider.get();
                e miniAppConfigHolder = this.clusterizationComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                j.c(miniAppConfigHolder);
                Context context2 = this.clusterizationComponentImpl.contextComponentDependencies.getContext();
                j.c(context2);
                return (T) new MapPlacemarkFactoryImpl(pinImageLoader, miniAppConfigHolder, context2);
            }
        }

        /* synthetic */ ClusterizationComponentImpl(ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, int i11) {
            this(actionComponentApi, contextComponentDependencies, navigationComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ClusterizationRepository clusterizationRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ClusterizationRepository(actionRepository);
        }

        private void initialize(ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.clusterizationComponentImpl, 1);
            this.clusterizationPinsDecoderImplProvider = switchingProvider;
            this.bindsClusterizationPinsDecoderProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.clusterizationComponentImpl, 3);
            this.pinImageLoaderImplProvider = switchingProvider2;
            this.bindsPinImageLoaderProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.clusterizationComponentImpl, 2);
            this.mapPlacemarkFactoryImplProvider = switchingProvider3;
            this.bindsMapPlacemarkFactoryProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.clusterizationComponentImpl, 0);
            this.clusterizationLoadingServiceImplProvider = switchingProvider4;
            this.bindsClusterizationLoadingServiceProvider = d.b(switchingProvider4);
        }

        @Override // ru.ozon.app.android.geo.map.clusterization.di.ClusterizationComponentApi
        public ClusterizationLoadingService getClusterizationLoadingService() {
            return this.bindsClusterizationLoadingServiceProvider.get();
        }

        private ClusterizationComponentImpl(ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi) {
            this.clusterizationComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.navigationComponentApi = navigationComponentApi;
            initialize(actionComponentApi, contextComponentDependencies, navigationComponentApi);
        }
    }

    private static final class Factory implements ClusterizationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.geo.map.clusterization.di.ClusterizationComponent.Factory
        public ClusterizationComponent create(ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi) {
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            return new ClusterizationComponentImpl(actionComponentApi, contextComponentDependencies, navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ClusterizationComponent.Factory factory() {
        return new Factory(0);
    }
}
