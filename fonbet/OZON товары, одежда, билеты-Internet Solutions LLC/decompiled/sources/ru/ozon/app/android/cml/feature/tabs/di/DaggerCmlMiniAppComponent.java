package ru.ozon.app.android.cml.feature.tabs.di;

import Jb.j;
import ru.ozon.app.android.cml.feature.tabs.di.CmlMiniAppComponent;
import ru.ozon.app.android.cml.feature.tabs.presentation.SwitchMapProviderObserver;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;

/* loaded from: classes11.dex */
public final class DaggerCmlMiniAppComponent {

    private static final class CmlMiniAppComponentImpl implements CmlMiniAppComponent {
        private final CmlMiniAppComponentImpl cmlMiniAppComponentImpl;
        private final LocationComponentApi locationComponentApi;

        /* synthetic */ CmlMiniAppComponentImpl(LocationComponentApi locationComponentApi, int i11) {
            this(locationComponentApi);
        }

        @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlMiniAppComponent
        public SwitchMapProviderObserver provideSwitchMapObserver() {
            OzonGeoProxyClient ozonGeoProxyClient = this.locationComponentApi.getOzonGeoProxyClient();
            j.c(ozonGeoProxyClient);
            AreaLocalStore areaLocalStore = this.locationComponentApi.getAreaLocalStore();
            j.c(areaLocalStore);
            return new SwitchMapProviderObserver(ozonGeoProxyClient, areaLocalStore);
        }

        private CmlMiniAppComponentImpl(LocationComponentApi locationComponentApi) {
            this.cmlMiniAppComponentImpl = this;
            this.locationComponentApi = locationComponentApi;
        }
    }

    private static final class Factory implements CmlMiniAppComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlMiniAppComponent.Factory
        public CmlMiniAppComponent create(LocationComponentApi locationComponentApi) {
            locationComponentApi.getClass();
            return new CmlMiniAppComponentImpl(locationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CmlMiniAppComponent.Factory factory() {
        return new Factory(0);
    }
}
