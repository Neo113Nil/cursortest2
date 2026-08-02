package ru.ozon.app.android.yandexsearchsheet.di;

import GZ.g;
import Jb.j;
import Pc.a;
import W10.c;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment_MembersInjector;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter;
import ru.ozon.app.android.yandexsearchsheet.data.YandexSearchSheetRepository;
import ru.ozon.app.android.yandexsearchsheet.di.YandexSearchSheetComponent;

/* loaded from: classes3.dex */
public final class DaggerYandexSearchSheetComponent {

    private static final class Factory implements YandexSearchSheetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.yandexsearchsheet.di.YandexSearchSheetComponent.Factory
        public YandexSearchSheetComponent create(c cVar, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, MapCommonComponentApi mapCommonComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi) {
            cVar.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            mapCommonComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            locationComponentApi.getClass();
            return new YandexSearchSheetComponentImpl(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, mapCommonComponentApi, contextComponentDependencies, locationComponentApi, cVar, 0);
        }

        private Factory() {
        }
    }

    private static final class YandexSearchSheetComponentImpl implements YandexSearchSheetComponent {
        private final ActionComponentApi actionComponentApi;
        private final LocationComponentApi locationComponentApi;
        private final MapCommonComponentApi mapCommonComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final c trackingData;
        private final YandexSearchSheetComponentImpl yandexSearchSheetComponentImpl;
        private a<YandexSearchSheetViewModelImpl> yandexSearchSheetViewModelImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94606id;
            private final YandexSearchSheetComponentImpl yandexSearchSheetComponentImpl;

            SwitchingProvider(YandexSearchSheetComponentImpl yandexSearchSheetComponentImpl, int i11) {
                this.yandexSearchSheetComponentImpl = yandexSearchSheetComponentImpl;
                this.f94606id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94606id != 0) {
                    throw new AssertionError(this.f94606id);
                }
                YandexSearchSheetRepository yandexSearchSheetRepository = this.yandexSearchSheetComponentImpl.yandexSearchSheetRepository();
                SdkSuggestionsControllerWrapperProvider sdkSuggestionsControllerWrapperProvider = this.yandexSearchSheetComponentImpl.mapCommonComponentApi.getSdkSuggestionsControllerWrapperProvider();
                j.c(sdkSuggestionsControllerWrapperProvider);
                c cVar = this.yandexSearchSheetComponentImpl.trackingData;
                OzonGeoProxyClient ozonGeoProxyClient = this.yandexSearchSheetComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                j.c(ozonGeoProxyClient);
                AreaLocalStore areaLocalStore = this.yandexSearchSheetComponentImpl.locationComponentApi.getAreaLocalStore();
                j.c(areaLocalStore);
                FeatureChecker featureChecker = this.yandexSearchSheetComponentImpl.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return (T) new YandexSearchSheetViewModelImpl(yandexSearchSheetRepository, sdkSuggestionsControllerWrapperProvider, cVar, ozonGeoProxyClient, areaLocalStore, featureChecker);
            }
        }

        /* synthetic */ YandexSearchSheetComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, MapCommonComponentApi mapCommonComponentApi, ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi, c cVar, int i11) {
            this(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, mapCommonComponentApi, contextComponentDependencies, locationComponentApi, cVar);
        }

        private void initialize(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, MapCommonComponentApi mapCommonComponentApi, ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi, c cVar) {
            this.yandexSearchSheetViewModelImplProvider = new SwitchingProvider(this.yandexSearchSheetComponentImpl, 0);
        }

        private YandexSearchSheetFragment injectYandexSearchSheetFragment(YandexSearchSheetFragment yandexSearchSheetFragment) {
            YandexSearchSheetFragment_MembersInjector.injectPViewModel(yandexSearchSheetFragment, this.yandexSearchSheetViewModelImplProvider);
            YandexSearchSheetFragment_MembersInjector.injectSuggestionsAdapter(yandexSearchSheetFragment, new YandexSuggestionsAdapter());
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            YandexSearchSheetFragment_MembersInjector.injectRouter(yandexSearchSheetFragment, ozonRouter);
            return yandexSearchSheetFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public YandexSearchSheetRepository yandexSearchSheetRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            ActionAnalyticDelegate actionAnalyticDelegate = this.actionComponentApi.getActionAnalyticDelegate();
            j.c(actionAnalyticDelegate);
            return new YandexSearchSheetRepository(actionRepository, actionAnalyticDelegate);
        }

        @Override // ru.ozon.app.android.yandexsearchsheet.di.YandexSearchSheetComponent
        public void inject(YandexSearchSheetFragment yandexSearchSheetFragment) {
            injectYandexSearchSheetFragment(yandexSearchSheetFragment);
        }

        private YandexSearchSheetComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, MapCommonComponentApi mapCommonComponentApi, ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi, c cVar) {
            this.yandexSearchSheetComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.mapCommonComponentApi = mapCommonComponentApi;
            this.trackingData = cVar;
            this.locationComponentApi = locationComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, mapCommonComponentApi, contextComponentDependencies, locationComponentApi, cVar);
        }
    }

    public static YandexSearchSheetComponent.Factory factory() {
        return new Factory(0);
    }
}
