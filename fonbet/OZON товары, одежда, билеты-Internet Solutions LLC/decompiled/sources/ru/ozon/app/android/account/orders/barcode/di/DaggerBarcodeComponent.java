package ru.ozon.app.android.account.orders.barcode.di;

import BZ.e;
import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.orders.barcode.di.BarcodeComponent;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment_MembersInjector;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.FloorBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.MaxBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes11.dex */
public final class DaggerBarcodeComponent {

    private static final class BarcodeComponentImpl implements BarcodeComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final BarcodeCacheComponentApi barcodeCacheComponentApi;
        private final BarcodeComponentImpl barcodeComponentImpl;
        private final BarcodeViewModelModule barcodeViewModelModule;
        private a<BarcodeCacheManager> getPersistentCacheManagerProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final ScreenBrightnessChangerModule screenBrightnessChangerModule;

        private static final class SwitchingProvider<T> implements a<T> {
            private final BarcodeComponentImpl barcodeComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92088id;

            SwitchingProvider(BarcodeComponentImpl barcodeComponentImpl, int i11) {
                this.barcodeComponentImpl = barcodeComponentImpl;
                this.f92088id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92088id != 0) {
                    throw new AssertionError(this.f92088id);
                }
                T t2 = (T) this.barcodeComponentImpl.barcodeCacheComponentApi.getPersistentCacheManager();
                j.c(t2);
                return t2;
            }
        }

        /* synthetic */ BarcodeComponentImpl(BarcodeViewModelModule barcodeViewModelModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, BarcodeCacheComponentApi barcodeCacheComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, int i11) {
            this(barcodeViewModelModule, screenBrightnessChangerModule, barcodeCacheComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, composerFragmentComponentDependencies, androidPlatformComponentApi);
        }

        private void initialize(BarcodeViewModelModule barcodeViewModelModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, BarcodeCacheComponentApi barcodeCacheComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.getPersistentCacheManagerProvider = new SwitchingProvider(this.barcodeComponentImpl, 0);
        }

        private BarcodeFragment injectBarcodeFragment(BarcodeFragment barcodeFragment) {
            BarcodeFragment_MembersInjector.injectViewModel(barcodeFragment, barcodeViewModel());
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            BarcodeFragment_MembersInjector.injectOzonRouter(barcodeFragment, ozonRouter);
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            BarcodeFragment_MembersInjector.injectAppType(barcodeFragment, appType);
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            BarcodeFragment_MembersInjector.injectMiniAppConfigHolder(barcodeFragment, miniAppConfigHolder);
            BarcodeFragment_MembersInjector.injectBrightnessChanger(barcodeFragment, screenBrightnessChanger());
            return barcodeFragment;
        }

        private ScreenBrightnessChanger screenBrightnessChanger() {
            ScreenBrightnessChangerModule screenBrightnessChangerModule = this.screenBrightnessChangerModule;
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return ScreenBrightnessChangerModule_ProvideBarcodeScreenBrightnessChangerFactory.provideBarcodeScreenBrightnessChanger(screenBrightnessChangerModule, featureChecker, new MaxBrightnessChanger(), new FloorBrightnessChanger());
        }

        public BarcodeViewModel barcodeViewModel() {
            BarcodeViewModelModule barcodeViewModelModule = this.barcodeViewModelModule;
            a<BarcodeCacheManager> aVar = this.getPersistentCacheManagerProvider;
            ConnectionHandler internetConnectionUtils = this.networkComponentApi.getInternetConnectionUtils();
            j.c(internetConnectionUtils);
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return BarcodeViewModelModule_ProvideBarcodeViewModelFactory.provideBarcodeViewModel(barcodeViewModelModule, aVar, internetConnectionUtils, appType);
        }

        @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeComponent
        public void inject(BarcodeFragment barcodeFragment) {
            injectBarcodeFragment(barcodeFragment);
        }

        private BarcodeComponentImpl(BarcodeViewModelModule barcodeViewModelModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, BarcodeCacheComponentApi barcodeCacheComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.barcodeComponentImpl = this;
            this.barcodeViewModelModule = barcodeViewModelModule;
            this.barcodeCacheComponentApi = barcodeCacheComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.screenBrightnessChangerModule = screenBrightnessChangerModule;
            initialize(barcodeViewModelModule, screenBrightnessChangerModule, barcodeCacheComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, composerFragmentComponentDependencies, androidPlatformComponentApi);
        }
    }

    private static final class Factory implements BarcodeComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeComponent.Factory
        public BarcodeComponent create(BarcodeCacheComponentApi barcodeCacheComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi) {
            barcodeCacheComponentApi.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            composerFragmentComponentDependencies.getClass();
            androidPlatformComponentApi.getClass();
            return new BarcodeComponentImpl(new BarcodeViewModelModule(), new ScreenBrightnessChangerModule(), barcodeCacheComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, composerFragmentComponentDependencies, androidPlatformComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static BarcodeComponent.Factory factory() {
        return new Factory(0);
    }
}
