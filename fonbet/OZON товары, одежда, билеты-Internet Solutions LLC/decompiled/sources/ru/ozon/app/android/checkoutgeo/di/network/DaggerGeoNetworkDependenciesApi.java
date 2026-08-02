package ru.ozon.app.android.checkoutgeo.di.network;

import We.B;
import ru.ozon.app.android.checkoutgeo.di.network.GeoNetworkDependenciesApi;
import ru.ozon.app.android.checkoutgeo.interceptor.MapTraceInterceptor;

/* loaded from: classes6.dex */
public final class DaggerGeoNetworkDependenciesApi {

    private static final class Factory implements GeoNetworkDependenciesApi.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutgeo.di.network.GeoNetworkDependenciesApi.Factory
        public GeoNetworkDependenciesApi create() {
            return new GeoNetworkDependenciesApiImpl(0);
        }

        private Factory() {
        }
    }

    private static final class GeoNetworkDependenciesApiImpl implements GeoNetworkDependenciesApi {
        private final GeoNetworkDependenciesApiImpl geoNetworkDependenciesApiImpl;

        /* synthetic */ GeoNetworkDependenciesApiImpl(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.network.geo.GeoNetworkDependencies
        public B mapTraceInterceptor() {
            return new MapTraceInterceptor();
        }

        private GeoNetworkDependenciesApiImpl() {
            this.geoNetworkDependenciesApiImpl = this;
        }
    }

    public static GeoNetworkDependenciesApi.Factory factory() {
        return new Factory(0);
    }
}
