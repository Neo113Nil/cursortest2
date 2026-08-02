package ru.ozon.app.android.search.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.SearchComponent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate_Factory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomStorage;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomStorage_Factory;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

/* loaded from: classes7.dex */
public final class DaggerSearchComponent {

    private static final class Factory implements SearchComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.di.SearchComponent.Factory
        public SearchComponent create(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, VideoCoverComponentApi videoCoverComponentApi) {
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            contextComponentDependencies.getClass();
            videoCoverComponentApi.getClass();
            return new SearchComponentImpl(storageComponentApi, networkComponentApi, contextComponentDependencies, videoCoverComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchComponentImpl implements SearchComponent {
        private a<SharedPreferences> getSharedPreferencesProvider;
        private a<PinchToZoomOnboardingDelegate> pinchToZoomOnboardingDelegateProvider;
        private a<PinchToZoomStorage> pinchToZoomStorageProvider;
        private final SearchComponentImpl searchComponentImpl;

        private static final class GetSharedPreferencesProvider implements a<SharedPreferences> {
            private final StorageComponentApi storageComponentApi;

            GetSharedPreferencesProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public SharedPreferences get() {
                SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
                j.c(sharedPreferences);
                return sharedPreferences;
            }
        }

        /* synthetic */ SearchComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, VideoCoverComponentApi videoCoverComponentApi, int i11) {
            this(storageComponentApi, networkComponentApi, contextComponentDependencies, videoCoverComponentApi);
        }

        private void initialize(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, VideoCoverComponentApi videoCoverComponentApi) {
            GetSharedPreferencesProvider getSharedPreferencesProvider = new GetSharedPreferencesProvider(storageComponentApi);
            this.getSharedPreferencesProvider = getSharedPreferencesProvider;
            a<PinchToZoomStorage> b11 = d.b(PinchToZoomStorage_Factory.create(getSharedPreferencesProvider));
            this.pinchToZoomStorageProvider = b11;
            this.pinchToZoomOnboardingDelegateProvider = d.b(PinchToZoomOnboardingDelegate_Factory.create(b11));
        }

        @Override // ru.ozon.app.android.search.di.SearchComponentApi
        public PinchToZoomOnboardingDelegate getPinchToZoomOnboardingDelegate() {
            return this.pinchToZoomOnboardingDelegateProvider.get();
        }

        private SearchComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, VideoCoverComponentApi videoCoverComponentApi) {
            this.searchComponentImpl = this;
            initialize(storageComponentApi, networkComponentApi, contextComponentDependencies, videoCoverComponentApi);
        }
    }

    public static SearchComponent.Factory factory() {
        return new Factory(0);
    }
}
