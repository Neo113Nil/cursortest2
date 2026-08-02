package ru.ozon.app.android.geoprovider.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.geoprovider.GeoProviderRepository;
import ru.ozon.app.android.geoprovider.GeoProviderRepositoryImpl;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponent;

/* loaded from: classes6.dex */
public final class DaggerGeoProviderComponent {

    private static final class Factory implements GeoProviderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.geoprovider.di.GeoProviderComponent.Factory
        public GeoProviderComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new GeoProviderComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class GeoProviderComponentImpl implements GeoProviderComponent {
        private a<GeoProviderRepository> bindGeoProviderRepositoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final GeoProviderComponentImpl geoProviderComponentImpl;
        private a<GeoProviderRepositoryImpl> geoProviderRepositoryImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final GeoProviderComponentImpl geoProviderComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92811id;

            SwitchingProvider(GeoProviderComponentImpl geoProviderComponentImpl, int i11) {
                this.geoProviderComponentImpl = geoProviderComponentImpl;
                this.f92811id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92811id != 0) {
                    throw new AssertionError(this.f92811id);
                }
                Context context = this.geoProviderComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                return (T) new GeoProviderRepositoryImpl(context);
            }
        }

        /* synthetic */ GeoProviderComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.geoProviderComponentImpl, 0);
            this.geoProviderRepositoryImplProvider = switchingProvider;
            this.bindGeoProviderRepositoryProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi
        public GeoProviderRepository getGeoProviderRepository() {
            return this.bindGeoProviderRepositoryProvider.get();
        }

        private GeoProviderComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.geoProviderComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(contextComponentDependencies);
        }
    }

    public static GeoProviderComponent.Factory factory() {
        return new Factory(0);
    }
}
